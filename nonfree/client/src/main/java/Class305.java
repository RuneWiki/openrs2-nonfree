import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class305 implements Runnable {

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!sca;")
	private Class304 aClass304_7;

	@OriginalMember(owner = "client!sda", name = "v", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	private int anInt8840 = 0;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
	private int anInt8841 = 0;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!sda", name = "x", descriptor = "Z")
	private boolean aBoolean630 = false;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!sda", name = "t", descriptor = "Lclient!hga;")
	private final Class138 aClass138_5;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!sda", name = "y", descriptor = "I")
	private final int anInt8853;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!hga;I)V")
	public Class305(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass138_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
		this.anInt8853 = arg2;
	}

	@OriginalMember(owner = "client!sda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7637();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
	public int method7633() throws IOException {
		return this.aBoolean630 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "([BIII)V")
	public void method7634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean630) {
			return;
		}
		while (arg1 > 0) {
			@Pc(24) int local24 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg1 -= local24;
			arg2 += local24;
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)I")
	public int method7635() throws IOException {
		return this.aBoolean630 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III[B)V")
	public void method7636(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean630) {
			return;
		}
		if (this.aBoolean629) {
			this.aBoolean629 = false;
			throw new IOException();
		}
		if (this.aByteArray102 == null) {
			this.aByteArray102 = new byte[this.anInt8853];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				this.aByteArray102[this.anInt8841] = arg1[local33];
				this.anInt8841 = (this.anInt8841 + 1) % this.anInt8853;
				if ((this.anInt8840 + this.anInt8853 - 100) % this.anInt8853 == this.anInt8841) {
					throw new IOException();
				}
			}
			if (this.aClass304_7 == null) {
				this.aClass304_7 = this.aClass138_5.method3577(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V")
	public void method7637() {
		if (this.aBoolean630) {
			return;
		}
		synchronized (this) {
			this.aBoolean630 = true;
			this.notifyAll();
		}
		if (this.aClass304_7 != null) {
			while (this.aClass304_7.anInt8838 == 0) {
				Static258.method4293(1L);
			}
			if (this.aClass304_7.anInt8838 == 1) {
				try {
					((Thread) this.aClass304_7.anObject16).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass304_7 = null;
	}

	@OriginalMember(owner = "client!sda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt8841 == this.anInt8840) {
							if (this.aBoolean630) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt8840 <= this.anInt8841) {
							local41 = this.anInt8841 - this.anInt8840;
						} else {
							local41 = this.anInt8853 - this.anInt8840;
						}
						local52 = this.anInt8840;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray102, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean629 = true;
					}
					this.anInt8840 = (this.anInt8840 + local41) % this.anInt8853;
					try {
						if (this.anInt8841 == this.anInt8840) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean629 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(122) IOException local122) {
				}
				this.aByteArray102 = null;
				return;
			}
		} catch (@Pc(127) Exception local127) {
			Static335.method5467(null, local127);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
	public void method7638() throws IOException {
		if (!this.aBoolean630 && this.aBoolean629) {
			this.aBoolean629 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)V")
	public void method7639() {
		if (!this.aBoolean630) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}

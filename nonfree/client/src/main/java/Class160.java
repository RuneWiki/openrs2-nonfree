import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class160 implements Runnable {

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!gp;")
	private Class91 aClass91_6;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Z")
	private boolean aBoolean286 = false;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	private int anInt4069 = 0;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
	private int anInt4063 = 0;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Lclient!or;")
	private final Class183 aClass183_3;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!or;)V")
	public Class160(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class183 arg1) throws IOException {
		this.aClass183_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method3202() {
		if (this.aBoolean286) {
			return;
		}
		synchronized (this) {
			this.aBoolean286 = true;
			this.notifyAll();
		}
		if (this.aClass91_6 != null) {
			while (this.aClass91_6.anInt2446 == 0) {
				Static429.method5376(1L);
			}
			if (this.aClass91_6.anInt2446 == 1) {
				try {
					((Thread) this.aClass91_6.anObject3).join();
				} catch (@Pc(52) InterruptedException local52) {
				}
			}
		}
		this.aClass91_6 = null;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method3204() {
		if (!this.aBoolean286) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I")
	public int method3205() throws IOException {
		return this.aBoolean286 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public void method3206() throws IOException {
		if (!this.aBoolean286 && this.aBoolean287) {
			this.aBoolean287 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BII)V")
	public void method3207(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean286) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 -= local19;
			arg2 += local19;
		}
	}

	@OriginalMember(owner = "client!ml", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt4063 == this.anInt4069) {
							if (this.aBoolean286) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt4069;
						if (this.anInt4069 > this.anInt4063) {
							local39 = 5000 - this.anInt4069;
						} else {
							local39 = this.anInt4063 - this.anInt4069;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray47, local28, local39);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean287 = true;
					}
					this.anInt4069 = (this.anInt4069 + local39) % 5000;
					try {
						if (this.anInt4069 == this.anInt4063) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean287 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray47 = null;
				break;
			}
		} catch (@Pc(115) Exception local115) {
			Static434.method5460(local115, null);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[B)V")
	public void method3210(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean286) {
			return;
		}
		if (this.aBoolean287) {
			this.aBoolean287 = false;
			throw new IOException();
		}
		if (this.aByteArray47 == null) {
			this.aByteArray47 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray47[this.anInt4063] = arg1[local36];
				this.anInt4063 = (this.anInt4063 + 1) % 5000;
				if (this.anInt4063 == (this.anInt4069 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass91_6 == null) {
				this.aClass91_6 = this.aClass183_3.method3904(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)I")
	public int method3211() throws IOException {
		return this.aBoolean286 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3202();
	}
}

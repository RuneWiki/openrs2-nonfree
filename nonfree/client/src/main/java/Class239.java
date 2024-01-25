import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class239 implements Runnable {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!ue;")
	private Class331 aClass331_6;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
	private boolean aBoolean456 = false;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	private int anInt6575 = 0;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	private int anInt6574 = 0;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!qj;")
	private final Class272 aClass272_3;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qj;)V")
	public Class239(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class272 arg1) throws IOException {
		this.aClass272_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ok", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt6575 == this.anInt6574) {
							if (this.aBoolean456) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt6574;
						if (this.anInt6575 >= this.anInt6574) {
							local36 = this.anInt6575 - this.anInt6574;
						} else {
							local36 = 5000 - this.anInt6574;
						}
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray83, local24, local36);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean455 = true;
					}
					this.anInt6574 = (this.anInt6574 + local36) % 5000;
					try {
						if (this.anInt6574 == this.anInt6575) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean455 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray83 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static256.method4328(null, local119);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[BI)V")
	public void method5551(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean456) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([BIII)V")
	public void method5552(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean456) {
			return;
		}
		if (this.aBoolean455) {
			this.aBoolean455 = false;
			throw new IOException();
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray83[this.anInt6575] = arg0[local38];
				this.anInt6575 = (this.anInt6575 + 1) % 5000;
				if (this.anInt6575 == (this.anInt6574 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass331_6 == null) {
				this.aClass331_6 = this.aClass272_3.method6121(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	public int method5553() throws IOException {
		return this.aBoolean456 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5554();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	public void method5554() {
		if (this.aBoolean456) {
			return;
		}
		synchronized (this) {
			this.aBoolean456 = true;
			this.notifyAll();
		}
		if (this.aClass331_6 != null) {
			while (this.aClass331_6.anInt8818 == 0) {
				Static318.method4952(1L);
			}
			if (this.aClass331_6.anInt8818 == 1) {
				try {
					((Thread) this.aClass331_6.anObject18).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass331_6 = null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method5555() throws IOException {
		if (!this.aBoolean456 && this.aBoolean455) {
			this.aBoolean455 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	public void method5556() {
		if (!this.aBoolean456) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
	public int method5557() throws IOException {
		return this.aBoolean456 ? 0 : this.anInputStream1.read();
	}
}

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!qd;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	private int anInt973 = 0;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private int anInt975 = 0;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Lclient!bb;")
	private final Class7 aClass7_3;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!bb;)V")
	public Class25(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class7 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass7_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB[B)V")
	public void method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean68) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 -= local19;
			arg0 += local19;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	public int method726() throws IOException {
		return this.aBoolean68 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method730();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
	public int method728() throws IOException {
		return this.aBoolean68 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public void method730() {
		if (this.aBoolean68) {
			return;
		}
		synchronized (this) {
			this.aBoolean68 = true;
			this.notifyAll();
		}
		if (this.aClass48_3 != null) {
			while (this.aClass48_3.anInt1928 == 0) {
				Static94.method1494(1L);
			}
			if (this.aClass48_3.anInt1928 == 1) {
				try {
					((Thread) this.aClass48_3.anObject4).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass48_3 = null;
	}

	@OriginalMember(owner = "client!hc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt975 == this.anInt973) {
							if (this.aBoolean68) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt975 < this.anInt973) {
							local36 = 5000 - this.anInt973;
						} else {
							local36 = this.anInt975 - this.anInt973;
						}
						local48 = this.anInt973;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray11, local48, local36);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean69 = true;
					}
					this.anInt973 = (local36 + this.anInt973) % 5000;
					try {
						if (this.anInt973 == this.anInt975) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean69 = true;
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
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray11 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static38.method727(null, local118);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIZ)V")
	public void method731(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean68) {
			return;
		}
		if (this.aBoolean69) {
			this.aBoolean69 = false;
			throw new IOException();
		}
		if (this.aByteArray11 == null) {
			this.aByteArray11 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray11[this.anInt975] = arg0[local36];
				this.anInt975 = (this.anInt975 + 1) % 5000;
				if ((this.anInt973 + 4900) % 5000 == this.anInt975) {
					throw new IOException();
				}
			}
			if (this.aClass48_3 == null) {
				this.aClass48_3 = this.aClass7_3.method207(3, this);
			}
			this.notifyAll();
		}
	}
}

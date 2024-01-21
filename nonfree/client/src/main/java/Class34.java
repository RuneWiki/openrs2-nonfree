import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "Lclient!dd;")
	private Class15 aClass15_5;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private int anInt1590 = 0;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	private int anInt1584 = 0;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "Lclient!pc;")
	private final Class63 aClass63_5;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pc;)V")
	public Class34(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class63 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass63_5 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[BBI)V")
	public void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean69) {
			return;
		}
		if (this.aBoolean68) {
			this.aBoolean68 = false;
			throw new IOException();
		}
		if (this.aByteArray19 == null) {
			this.aByteArray19 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				this.aByteArray19[this.anInt1590] = arg1[local30];
				this.anInt1590 = (this.anInt1590 + 1) % 5000;
				if (this.anInt1590 == (this.anInt1584 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass15_5 == null) {
				this.aClass15_5 = this.aClass63_5.method1956(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	public int method1132() throws IOException {
		return this.aBoolean69 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZ[B)V")
	public void method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean69) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)I")
	public int method1135() throws IOException {
		return this.aBoolean69 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public void method1136() {
		if (this.aBoolean69) {
			return;
		}
		synchronized (this) {
			this.aBoolean69 = true;
			this.notifyAll();
		}
		if (this.aClass15_5 != null) {
			while (this.aClass15_5.anInt821 == 0) {
				Static50.method927(1L);
			}
			if (this.aClass15_5.anInt821 == 1) {
				try {
					((Thread) this.aClass15_5.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass15_5 = null;
	}

	@OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt1584 == this.anInt1590) {
							if (this.aBoolean69) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt1584 > this.anInt1590) {
							local35 = 5000 - this.anInt1584;
						} else {
							local35 = this.anInt1590 - this.anInt1584;
						}
						local47 = this.anInt1584;
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray19, local47, local35);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean68 = true;
					}
					this.anInt1584 = (this.anInt1584 + local35) % 5000;
					try {
						if (this.anInt1590 == this.anInt1584) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean68 = true;
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
				this.aByteArray19 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static165.method2525(null, local118);
		}
	}

	@OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1136();
	}
}

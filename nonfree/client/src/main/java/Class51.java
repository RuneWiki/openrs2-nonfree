import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!tf;")
	private Class73 aClass73_12;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	private int anInt2093 = 0;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "I")
	private int anInt2101 = 0;

	@OriginalMember(owner = "client!n", name = "L", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!dd;")
	private final Class15 aClass15_3;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!dd;)V")
	public Class51(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class15 arg1) throws IOException {
		this.aClass15_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public void method1361() {
		if (this.aBoolean110) {
			return;
		}
		synchronized (this) {
			this.aBoolean110 = true;
			this.notifyAll();
		}
		if (this.aClass73_12 != null) {
			while (this.aClass73_12.anInt2813 == 0) {
				Static109.method2037(1L);
			}
			if (this.aClass73_12.anInt2813 == 1) {
				try {
					((Thread) this.aClass73_12.anObject4).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass73_12 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II[BI)V")
	public void method1362(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean110) {
			return;
		}
		if (this.aBoolean111) {
			this.aBoolean111 = false;
			throw new IOException();
		}
		if (this.aByteArray33 == null) {
			this.aByteArray33 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray33[this.anInt2093] = arg0[local32];
				this.anInt2093 = (this.anInt2093 + 1) % 5000;
				if ((this.anInt2101 + 4900) % 5000 == this.anInt2093) {
					throw new IOException();
				}
			}
			if (this.aClass73_12 == null) {
				this.aClass73_12 = this.aClass15_3.method488(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([BIII)V")
	public void method1366(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean110) {
			return;
		}
		while (arg1 > 0) {
			@Pc(17) int local17 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local17 <= 0) {
				throw new EOFException();
			}
			arg1 -= local17;
			arg2 += local17;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
	public int method1367() throws IOException {
		return this.aBoolean110 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt2101 == this.anInt2093) {
							if (this.aBoolean110) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2093 >= this.anInt2101) {
							local40 = this.anInt2093 - this.anInt2101;
						} else {
							local40 = 5000 - this.anInt2101;
						}
						local51 = this.anInt2101;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray33, local51, local40);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean111 = true;
					}
					this.anInt2101 = (this.anInt2101 + local40) % 5000;
					try {
						if (this.anInt2093 == this.anInt2101) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean111 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray33 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static65.method1115(null, local122);
		}
	}

	@OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1361();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)I")
	public int method1371() throws IOException {
		return this.aBoolean110 ? 0 : this.anInputStream1.read();
	}
}

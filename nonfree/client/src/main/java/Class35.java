import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!ua;")
	private Class59 aClass59_4;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	private int anInt2180 = 0;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	private int anInt2182 = 0;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!qd;")
	private final Class51 aClass51_3;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qd;)V")
	public Class35(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class51 arg1) throws IOException {
		this.aClass51_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1349();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[BI)V")
	public void method1347(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean111) {
			return;
		}
		if (this.aBoolean110) {
			this.aBoolean110 = false;
			throw new IOException();
		}
		if (this.aByteArray18 == null) {
			this.aByteArray18 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray18[this.anInt2180] = arg1[local37];
				this.anInt2180 = (this.anInt2180 + 1) % 5000;
				if ((this.anInt2182 + 4900) % 5000 == this.anInt2180) {
					throw new IOException();
				}
			}
			if (this.aClass59_4 == null) {
				this.aClass59_4 = this.aClass51_3.method1467(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public void method1349() {
		if (this.aBoolean111) {
			return;
		}
		synchronized (this) {
			this.aBoolean111 = true;
			this.notifyAll();
		}
		if (this.aClass59_4 != null) {
			while (this.aClass59_4.anInt2608 == 0) {
				Static91.method1548(1L);
			}
			if (this.aClass59_4.anInt2608 == 1) {
				try {
					((Thread) this.aClass59_4.anObject5).join();
				} catch (@Pc(52) InterruptedException local52) {
				}
			}
		}
		this.aClass59_4 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)I")
	public int method1350() throws IOException {
		return this.aBoolean111 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt2182 == this.anInt2180) {
							if (this.aBoolean111) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2182 > this.anInt2180) {
							local40 = 5000 - this.anInt2182;
						} else {
							local40 = this.anInt2180 - this.anInt2182;
						}
						local51 = this.anInt2182;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray18, local51, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean110 = true;
					}
					this.anInt2182 = (this.anInt2182 + local40) % 5000;
					try {
						if (this.anInt2182 == this.anInt2180) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean110 = true;
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
				this.aByteArray18 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static57.method1692(null, local122);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)I")
	public int method1351() throws IOException {
		return this.aBoolean111 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB[B)V")
	public void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean111) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg1 += local20;
			arg0 -= local20;
		}
	}
}

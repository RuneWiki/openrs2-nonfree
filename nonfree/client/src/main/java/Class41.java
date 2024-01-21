import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!qb;")
	private Class54 aClass54_3;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	private int anInt1674 = 0;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	private int anInt1668 = 0;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!jc;")
	private final Class35 aClass35_2;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!jc;)V")
	public Class41(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class35 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass35_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1025();
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	public int method1024() throws IOException {
		return this.aBoolean94 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public void method1025() {
		if (this.aBoolean94) {
			return;
		}
		synchronized (this) {
			this.aBoolean94 = true;
			this.notifyAll();
		}
		if (this.aClass54_3 != null) {
			while (this.aClass54_3.anInt2217 == 0) {
				Static24.method505(1L);
			}
			if (this.aClass54_3.anInt2217 == 1) {
				try {
					((Thread) this.aClass54_3.anObject3).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass54_3 = null;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I")
	public int method1029() throws IOException {
		return this.aBoolean94 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ[BI)V")
	public void method1032(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean94) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg2 += local19;
			arg0 -= local19;
		}
	}

	@OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt1674 == this.anInt1668) {
							if (this.aBoolean94) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt1668 <= this.anInt1674) {
							local41 = this.anInt1674 - this.anInt1668;
						} else {
							local41 = 5000 - this.anInt1668;
						}
						local51 = this.anInt1668;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray18, local51, local41);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean93 = true;
					}
					this.anInt1668 = (local41 + this.anInt1668) % 5000;
					try {
						if (this.anInt1668 == this.anInt1674) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean93 = true;
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
			Static72.method1184(null, local122);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI[BI)V")
	public void method1033(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean94) {
			return;
		}
		if (this.aBoolean93) {
			this.aBoolean93 = false;
			throw new IOException();
		}
		if (this.aByteArray18 == null) {
			this.aByteArray18 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray18[this.anInt1674] = arg0[local32];
				this.anInt1674 = (this.anInt1674 + 1) % 5000;
				if (this.anInt1674 == (this.anInt1668 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass54_3 == null) {
				this.aClass54_3 = this.aClass35_2.method770(3, this);
			}
			this.notifyAll();
		}
	}
}

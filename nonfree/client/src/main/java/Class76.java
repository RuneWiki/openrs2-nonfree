import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class76 implements Runnable {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!lf;")
	private Class121 aClass121_6;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	private int anInt2492 = 0;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	private int anInt2493 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!gt;")
	private final Class75 aClass75_4;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gt;)V")
	public Class76(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class75 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass75_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BI)V")
	public void method2376(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean182) {
			return;
		}
		if (this.aBoolean183) {
			this.aBoolean183 = false;
			throw new IOException();
		}
		if (this.aByteArray45 == null) {
			this.aByteArray45 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray45[this.anInt2492] = arg1[local32];
				this.anInt2492 = (this.anInt2492 + 1) % 5000;
				if ((this.anInt2493 + 4900) % 5000 == this.anInt2492) {
					throw new IOException();
				}
			}
			if (this.aClass121_6 == null) {
				this.aClass121_6 = this.aClass75_4.method2366(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public void method2377() {
		if (this.aBoolean182) {
			return;
		}
		synchronized (this) {
			this.aBoolean182 = true;
			this.notifyAll();
		}
		if (this.aClass121_6 != null) {
			while (this.aClass121_6.anInt3693 == 0) {
				Static135.method2737(1L);
			}
			if (this.aClass121_6.anInt3693 == 1) {
				try {
					((Thread) this.aClass121_6.anObject2).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass121_6 = null;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public void method2378() {
		if (!this.aBoolean182) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
	public int method2379() throws IOException {
		return this.aBoolean182 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(38) int local38;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt2493 == this.anInt2492) {
							if (this.aBoolean182) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt2493;
						if (this.anInt2492 < this.anInt2493) {
							local38 = 5000 - this.anInt2493;
						} else {
							local38 = this.anInt2492 - this.anInt2493;
						}
					}
					if (local38 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray45, local28, local38);
					} catch (@Pc(63) IOException local63) {
						this.aBoolean183 = true;
					}
					this.anInt2493 = (local38 + this.anInt2493) % 5000;
					try {
						if (this.anInt2492 == this.anInt2493) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(84) IOException local84) {
						this.aBoolean183 = true;
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
				} catch (@Pc(108) IOException local108) {
				}
				this.aByteArray45 = null;
				return;
			}
		} catch (@Pc(113) Exception local113) {
			Static119.method2541(null, local113);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BB)V")
	public void method2384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean182) {
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

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public void method2386() throws IOException {
		if (!this.aBoolean182 && this.aBoolean183) {
			this.aBoolean183 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
	public int method2387() throws IOException {
		return this.aBoolean182 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2377();
	}
}

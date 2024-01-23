import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class63 implements Runnable {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!p;")
	private Class75 aClass75_5;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	private int anInt2912 = 0;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
	private int anInt2918 = 0;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!qg;")
	private Class83 aClass83_3;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qg;)V")
	public Class63(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class83 arg1) throws IOException {
		this.aClass83_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
	public int method2035() throws IOException {
		return this.aBoolean158 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II[BI)V")
	public void method2037(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean158) {
			return;
		}
		if (this.aBoolean159) {
			this.aBoolean159 = false;
			throw new IOException();
		}
		if (this.aByteArray42 == null) {
			this.aByteArray42 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray42[this.anInt2918] = arg1[local37];
				this.anInt2918 = (this.anInt2918 + 1) % 5000;
				if (this.anInt2918 == (this.anInt2912 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass75_5 == null) {
				this.aClass75_5 = this.aClass83_3.method2618(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(48) int local48;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2912 == this.anInt2918) {
							if (this.aBoolean158) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2912;
						if (this.anInt2912 <= this.anInt2918) {
							local48 = this.anInt2918 - this.anInt2912;
						} else {
							local48 = 5000 - this.anInt2912;
						}
					}
					if (local48 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray42, local32, local48);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean159 = true;
					}
					this.anInt2912 = (local48 + this.anInt2912) % 5000;
					try {
						if (this.anInt2918 == this.anInt2912) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean159 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray42 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static196.method3064(null, local123);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BBI)V")
	public void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean158) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg2 -= local19;
		}
	}

	@OriginalMember(owner = "client!mf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2043();
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
	public int method2042() throws IOException {
		return this.aBoolean158 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public void method2043() {
		if (this.aBoolean158) {
			return;
		}
		synchronized (this) {
			this.aBoolean158 = true;
			this.notifyAll();
		}
		if (this.aClass75_5 != null) {
			while (this.aClass75_5.anInt3346 == 0) {
				Static19.method344(1L);
			}
			if (this.aClass75_5.anInt3346 == 1) {
				try {
					((Thread) this.aClass75_5.anObject3).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass75_5 = null;
	}
}

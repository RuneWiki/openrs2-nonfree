import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class310 implements Runnable {

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "[B")
	private byte[] aByteArray109;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!dn;")
	private Class66 aClass66_7;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Z")
	private boolean aBoolean782 = false;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
	private boolean aBoolean783 = false;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	private int anInt9325 = 0;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	private int anInt9328 = 0;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!ufa;")
	private final Class326 aClass326_4;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ufa;)V")
	public Class310(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class326 arg1) throws IOException {
		this.aClass326_4 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	public void method7568() {
		if (this.aBoolean783) {
			return;
		}
		synchronized (this) {
			this.aBoolean783 = true;
			this.notifyAll();
		}
		if (this.aClass66_7 != null) {
			while (this.aClass66_7.anInt2308 == 0) {
				Static1.method125(1L);
			}
			if (this.aClass66_7.anInt2308 == 1) {
				try {
					((Thread) this.aClass66_7.anObject4).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass66_7 = null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I")
	public int method7570() throws IOException {
		return this.aBoolean783 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!tg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt9328 == this.anInt9325) {
							if (this.aBoolean783) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt9325;
						if (this.anInt9325 > this.anInt9328) {
							local43 = 5000 - this.anInt9325;
						} else {
							local43 = this.anInt9328 - this.anInt9325;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray109, local32, local43);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean782 = true;
					}
					this.anInt9325 = (local43 + this.anInt9325) % 5000;
					try {
						if (this.anInt9328 == this.anInt9325) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(96) IOException local96) {
						this.aBoolean782 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(120) IOException local120) {
				}
				this.aByteArray109 = null;
				return;
			}
		} catch (@Pc(125) Exception local125) {
			Static468.method7192(null, local125);
		}
	}

	@OriginalMember(owner = "client!tg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7568();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method7571() {
		if (!this.aBoolean783) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BI)V")
	public void method7573(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean783) {
			return;
		}
		if (this.aBoolean782) {
			this.aBoolean782 = false;
			throw new IOException();
		}
		if (this.aByteArray109 == null) {
			this.aByteArray109 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
				this.aByteArray109[this.anInt9328] = arg1[local34];
				this.anInt9328 = (this.anInt9328 + 1) % 5000;
				if (this.anInt9328 == (this.anInt9325 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass66_7 == null) {
				this.aClass66_7 = this.aClass326_4.method7795(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[BIB)V")
	public void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean783) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream2.read(arg1, arg2, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg2 += local22;
			arg0 -= local22;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
	public int method7575() throws IOException {
		return this.aBoolean783 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	public void method7576() throws IOException {
		if (!this.aBoolean783 && this.aBoolean782) {
			this.aBoolean782 = false;
			throw new IOException();
		}
	}
}

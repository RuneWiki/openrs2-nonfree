import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!g;")
	private Class26 aClass26_48;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private int anInt2273 = 0;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	private int anInt2282 = 0;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!q;")
	private final Class59 aClass59_3;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!q;)V")
	public Class57(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class59 arg1) throws IOException {
		this.aClass59_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIII)V")
	public void method1591(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean173) {
			return;
		}
		if (this.aBoolean172) {
			this.aBoolean172 = false;
			throw new IOException();
		}
		if (this.aByteArray31 == null) {
			this.aByteArray31 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray31[this.anInt2273] = arg0[local32];
				this.anInt2273 = (this.anInt2273 + 1) % 5000;
				if (this.anInt2273 == (this.anInt2282 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass26_48 == null) {
				this.aClass26_48 = this.aClass59_3.method1638(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1596();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([BIIZ)V")
	public void method1592(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean173) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2282 == this.anInt2273) {
							if (this.aBoolean173) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2282;
						if (this.anInt2273 < this.anInt2282) {
							local43 = 5000 - this.anInt2282;
						} else {
							local43 = this.anInt2273 - this.anInt2282;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray31, local32, local43);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean172 = true;
					}
					this.anInt2282 = (this.anInt2282 + local43) % 5000;
					try {
						if (this.anInt2282 == this.anInt2273) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean172 = true;
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
				this.aByteArray31 = null;
				return;
			}
		} catch (@Pc(118) Exception local118) {
			Static92.method1662(local118, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I")
	public int method1594() throws IOException {
		return this.aBoolean173 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public void method1596() {
		if (this.aBoolean173) {
			return;
		}
		synchronized (this) {
			this.aBoolean173 = true;
			this.notifyAll();
		}
		if (this.aClass26_48 != null) {
			while (this.aClass26_48.anInt831 == 0) {
				Static85.method1582(1L);
			}
			if (this.aClass26_48.anInt831 == 1) {
				try {
					((Thread) this.aClass26_48.anObject2).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass26_48 = null;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
	public int method1597() throws IOException {
		return this.aBoolean173 ? 0 : this.anInputStream1.available();
	}
}

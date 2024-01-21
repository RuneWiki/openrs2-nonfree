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
public final class Class51 implements Runnable {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!jd;")
	private Class34 aClass34_5;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private int anInt2044 = 0;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
	private int anInt2058 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!c;")
	private final Class11 aClass11_2;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!c;)V")
	public Class51(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class11 arg1) throws IOException {
		this.aClass11_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III[B)V")
	public void method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean87) {
			return;
		}
		while (arg1 > 0) {
			@Pc(26) int local26 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local26 <= 0) {
				throw new EOFException();
			}
			arg1 -= local26;
			arg0 += local26;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public void method1483() {
		if (this.aBoolean87) {
			return;
		}
		synchronized (this) {
			this.aBoolean87 = true;
			this.notifyAll();
		}
		if (this.aClass34_5 != null) {
			while (this.aClass34_5.anInt1269 == 0) {
				Static68.method1173(1L);
			}
			if (this.aClass34_5.anInt1269 == 1) {
				try {
					((Thread) this.aClass34_5.anObject2).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass34_5 = null;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I")
	public int method1484() throws IOException {
		return this.aBoolean87 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III[B)V")
	public void method1486(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean87) {
			return;
		}
		if (this.aBoolean86) {
			this.aBoolean86 = false;
			throw new IOException();
		}
		if (this.aByteArray21 == null) {
			this.aByteArray21 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				this.aByteArray21[this.anInt2058] = arg1[local30];
				this.anInt2058 = (this.anInt2058 + 1) % 5000;
				if (this.anInt2058 == (this.anInt2044 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass34_5 == null) {
				this.aClass34_5 = this.aClass11_2.method237(3, this);
			}
			this.notifyAll();
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
						if (this.anInt2058 == this.anInt2044) {
							if (this.aBoolean87) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2044;
						if (this.anInt2058 < this.anInt2044) {
							local43 = 5000 - this.anInt2044;
						} else {
							local43 = this.anInt2058 - this.anInt2044;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray21, local32, local43);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean86 = true;
					}
					this.anInt2044 = (local43 + this.anInt2044) % 5000;
					try {
						if (this.anInt2058 == this.anInt2044) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean86 = true;
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
				this.aByteArray21 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static90.method1648(local122, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
	public int method1488() throws IOException {
		return this.aBoolean87 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1483();
	}
}

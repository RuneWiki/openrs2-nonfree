import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "Lclient!rp;")
	private Class278 aClass278_4;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
	private int anInt1581 = 0;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
	private int anInt1585 = 0;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "Lclient!cr;")
	private final Class57 aClass57_2;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!cr;)V")
	public Class73(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class57 arg1) throws IOException {
		this.aClass57_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1483() throws IOException {
		if (!this.aBoolean103 && this.aBoolean101) {
			this.aBoolean101 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public void method1484() {
		if (this.aBoolean103) {
			return;
		}
		synchronized (this) {
			this.aBoolean103 = true;
			this.notifyAll();
		}
		if (this.aClass278_4 != null) {
			while (this.aClass278_4.anInt7757 == 0) {
				Static149.method2211(1L);
			}
			if (this.aClass278_4.anInt7757 == 1) {
				try {
					((Thread) this.aClass278_4.anObject24).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass278_4 = null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
	public int method1485() throws IOException {
		return this.aBoolean103 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!dr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1585 == this.anInt1581) {
							if (this.aBoolean103) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1581;
						if (this.anInt1585 < this.anInt1581) {
							local43 = 5000 - this.anInt1581;
						} else {
							local43 = this.anInt1585 - this.anInt1581;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray28, local28, local43);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean101 = true;
					}
					this.anInt1581 = (local43 + this.anInt1581) % 5000;
					try {
						if (this.anInt1585 == this.anInt1581) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean101 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray28 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static169.method2641(null, local122);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII[B)V")
	public void method1487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean103) {
			return;
		}
		while (arg1 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg0 += local23;
			arg1 -= local23;
		}
	}

	@OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1484();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III[B)V")
	public void method1489(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean103) {
			return;
		}
		if (this.aBoolean101) {
			this.aBoolean101 = false;
			throw new IOException();
		}
		if (this.aByteArray28 == null) {
			this.aByteArray28 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray28[this.anInt1585] = arg1[local38];
				this.anInt1585 = (this.anInt1585 + 1) % 5000;
				if (this.anInt1585 == (this.anInt1581 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass278_4 == null) {
				this.aClass278_4 = this.aClass57_2.method916(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)I")
	public int method1490() throws IOException {
		return this.aBoolean103 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V")
	public void method1491() {
		if (!this.aBoolean103) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}
}

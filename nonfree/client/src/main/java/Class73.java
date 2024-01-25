import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!wk;")
	private Class268 aClass268_3;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	private int anInt1907 = 0;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	private int anInt1912 = 0;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!gt;")
	private final Class93 aClass93_2;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gt;)V")
	public Class73(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class93 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass93_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI[B)V")
	public void method1555(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean135) {
			return;
		}
		if (this.aBoolean134) {
			this.aBoolean134 = false;
			throw new IOException();
		}
		if (this.aByteArray19 == null) {
			this.aByteArray19 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
				this.aByteArray19[this.anInt1907] = arg1[local39];
				this.anInt1907 = (this.anInt1907 + 1) % 5000;
				if ((this.anInt1912 + 4900) % 5000 == this.anInt1907) {
					throw new IOException();
				}
			}
			if (this.aClass268_3 == null) {
				this.aClass268_3 = this.aClass93_2.method2076(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1912 == this.anInt1907) {
							if (this.aBoolean135) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1907 >= this.anInt1912) {
							local41 = this.anInt1907 - this.anInt1912;
						} else {
							local41 = 5000 - this.anInt1912;
						}
						local52 = this.anInt1912;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray19, local52, local41);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean134 = true;
					}
					this.anInt1912 = (local41 + this.anInt1912) % 5000;
					try {
						if (this.anInt1907 == this.anInt1912) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean134 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray19 = null;
				return;
			}
		} catch (@Pc(119) Exception local119) {
			Static206.method2769(null, local119);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public void method1556() {
		if (this.aBoolean135) {
			return;
		}
		synchronized (this) {
			this.aBoolean135 = true;
			this.notifyAll();
		}
		if (this.aClass268_3 != null) {
			while (this.aClass268_3.anInt7420 == 0) {
				Static140.method2004(1L);
			}
			if (this.aClass268_3.anInt7420 == 1) {
				try {
					((Thread) this.aClass268_3.anObject10).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass268_3 = null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public void method1557() {
		if (!this.aBoolean135) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1556();
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public void method1559() throws IOException {
		if (!this.aBoolean135 && this.aBoolean134) {
			this.aBoolean134 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
	public int method1561() throws IOException {
		return this.aBoolean135 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[BII)V")
	public void method1563(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean135) {
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

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)I")
	public int method1564() throws IOException {
		return this.aBoolean135 ? 0 : this.anInputStream1.available();
	}
}

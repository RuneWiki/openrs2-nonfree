import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!nc;")
	private Class118 aClass118_4;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	private int anInt2003 = 0;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "I")
	private int anInt2009 = 0;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Lclient!jh;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!jh;)V")
	public Class73(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class84 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass84_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI[BI)V")
	public void method1685(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean146) {
			return;
		}
		if (this.aBoolean145) {
			this.aBoolean145 = false;
			throw new IOException();
		}
		if (this.aByteArray38 == null) {
			this.aByteArray38 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
				this.aByteArray38[this.anInt2003] = arg1[local34];
				this.anInt2003 = (this.anInt2003 + 1) % 5000;
				if (this.anInt2003 == (this.anInt2009 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass118_4 == null) {
				this.aClass118_4 = this.aClass84_2.method1958(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)I")
	public int method1686() throws IOException {
		return this.aBoolean146 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I")
	public int method1687() throws IOException {
		return this.aBoolean146 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1691();
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public void method1688() {
		if (!this.aBoolean146) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ[BI)V")
	public void method1689(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean146) {
			return;
		}
		while (arg0 > 0) {
			@Pc(29) int local29 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local29 <= 0) {
				throw new EOFException();
			}
			arg0 -= local29;
			arg2 += local29;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
	public void method1690() throws IOException {
		if (!this.aBoolean146 && this.aBoolean145) {
			this.aBoolean145 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!i", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(40) int var1;
				@Pc(29) int var2;
				label88: {
					synchronized (this) {
						label89: {
							if (this.anInt2009 == this.anInt2003) {
								if (this.aBoolean146) {
									break label89;
								}
								try {
									this.wait();
								} catch (@Pc(26) InterruptedException local26) {
								}
							}
							var2 = this.anInt2009;
							if (this.anInt2003 < this.anInt2009) {
								var1 = 5000 - this.anInt2009;
							} else {
								var1 = this.anInt2003 - this.anInt2009;
							}
							break label88;
						}
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
					} catch (@Pc(122) IOException local122) {
					}
					this.aByteArray38 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray38, var2, var1);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean145 = true;
					}
					this.anInt2009 = (this.anInt2009 + var1) % 5000;
					try {
						if (this.anInt2003 == this.anInt2009) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean145 = true;
					}
				}
			}
		} catch (@Pc(127) Exception local127) {
			Static6.method149(local127, null);
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public void method1691() {
		if (this.aBoolean146) {
			return;
		}
		synchronized (this) {
			this.aBoolean146 = true;
			this.notifyAll();
		}
		if (this.aClass118_4 != null) {
			while (this.aClass118_4.anInt3187 == 0) {
				Static275.method4233(1L);
			}
			if (this.aClass118_4.anInt3187 == 1) {
				try {
					((Thread) this.aClass118_4.anObject3).join();
				} catch (@Pc(60) InterruptedException local60) {
				}
			}
		}
		this.aClass118_4 = null;
	}
}

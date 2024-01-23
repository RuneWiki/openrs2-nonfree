import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!ea;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	private int anInt1398 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	private int anInt1391 = 0;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "Lclient!gn;")
	private Class66 aClass66_2;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gn;)V")
	public Class41(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class66 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass66_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[BI)V")
	public void method1059(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean82) {
			return;
		}
		while (arg0 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg0 -= local23;
			arg2 += local23;
		}
	}

	@OriginalMember(owner = "client!dm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1062();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method1062() {
		if (this.aBoolean82) {
			return;
		}
		synchronized (this) {
			this.aBoolean82 = true;
			this.notifyAll();
		}
		if (this.aClass43_2 != null) {
			while (this.aClass43_2.anInt1456 == 0) {
				Static230.method4022(1L);
			}
			if (this.aClass43_2.anInt1456 == 1) {
				try {
					((Thread) this.aClass43_2.anObject3).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass43_2 = null;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public void method1063() throws IOException {
		if (!this.aBoolean82 && this.aBoolean81) {
			this.aBoolean81 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!dm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(42) int var1;
				@Pc(53) int var2;
				label87: {
					synchronized (this) {
						label88: {
							if (this.anInt1398 == this.anInt1391) {
								if (this.aBoolean82) {
									break label88;
								}
								try {
									this.wait();
								} catch (@Pc(26) InterruptedException local26) {
								}
							}
							if (this.anInt1391 <= this.anInt1398) {
								var1 = this.anInt1398 - this.anInt1391;
							} else {
								var1 = 5000 - this.anInt1391;
							}
							var2 = this.anInt1391;
							break label87;
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
					} catch (@Pc(128) IOException local128) {
					}
					this.aByteArray13 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray13, var2, var1);
					} catch (@Pc(76) IOException local76) {
						this.aBoolean81 = true;
					}
					this.anInt1391 = (var1 + this.anInt1391) % 5000;
					try {
						if (this.anInt1398 == this.anInt1391) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(102) IOException local102) {
						this.aBoolean81 = true;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static217.method3829(null, local133);
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)I")
	public int method1066() throws IOException {
		return this.aBoolean82 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I")
	public int method1067() throws IOException {
		return this.aBoolean82 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([BBII)V")
	public void method1068(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean82) {
			return;
		}
		if (this.aBoolean81) {
			this.aBoolean81 = false;
			throw new IOException();
		}
		if (this.aByteArray13 == null) {
			this.aByteArray13 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				this.aByteArray13[this.anInt1398] = arg0[local41];
				this.anInt1398 = (this.anInt1398 + 1) % 5000;
				if (this.anInt1398 == (this.anInt1391 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass43_2 == null) {
				this.aClass43_2 = this.aClass66_2.method1615(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	public void method1069() {
		if (!this.aBoolean82) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}

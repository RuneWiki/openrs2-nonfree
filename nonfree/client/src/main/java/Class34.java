import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "Lclient!me;")
	private Class111 aClass111_1;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	private int anInt1389 = 0;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	private int anInt1392 = 0;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!la;")
	private Class102 aClass102_1;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!la;)V")
	public Class34(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class102 arg1) throws IOException {
		this.aClass102_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!dk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1077();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
	public int method1070() throws IOException {
		return this.aBoolean92 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1072() throws IOException {
		if (!this.aBoolean92 && this.aBoolean91) {
			this.aBoolean91 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)I")
	public int method1073() throws IOException {
		return this.aBoolean92 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB[B)V")
	public void method1074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean92) {
			return;
		}
		while (arg1 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg1 -= local23;
			arg0 += local23;
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public void method1075() {
		if (!this.aBoolean92) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "([BIII)V")
	public void method1076(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean92) {
			return;
		}
		if (this.aBoolean91) {
			this.aBoolean91 = false;
			throw new IOException();
		}
		if (this.aByteArray7 == null) {
			this.aByteArray7 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				this.aByteArray7[this.anInt1389] = arg0[local33];
				this.anInt1389 = (this.anInt1389 + 1) % 5000;
				if ((this.anInt1392 + 4900) % 5000 == this.anInt1389) {
					throw new IOException();
				}
			}
			if (this.aClass111_1 == null) {
				this.aClass111_1 = this.aClass102_1.method2893(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
	public void method1077() {
		if (this.aBoolean92) {
			return;
		}
		synchronized (this) {
			this.aBoolean92 = true;
			this.notifyAll();
		}
		if (this.aClass111_1 != null) {
			while (this.aClass111_1.anInt3788 == 0) {
				Static138.method2475(1L);
			}
			if (this.aClass111_1.anInt3788 == 1) {
				try {
					((Thread) this.aClass111_1.anObject4).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass111_1 = null;
	}

	@OriginalMember(owner = "client!dk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(42) int var1;
				@Pc(53) int var2;
				label87: {
					synchronized (this) {
						label88: {
							if (this.anInt1392 == this.anInt1389) {
								if (this.aBoolean92) {
									break label88;
								}
								try {
									this.wait();
								} catch (@Pc(30) InterruptedException local30) {
								}
							}
							if (this.anInt1392 <= this.anInt1389) {
								var1 = this.anInt1389 - this.anInt1392;
							} else {
								var1 = 5000 - this.anInt1392;
							}
							var2 = this.anInt1392;
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
					this.aByteArray7 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray7, var2, var1);
					} catch (@Pc(75) IOException local75) {
						this.aBoolean91 = true;
					}
					this.anInt1392 = (var1 + this.anInt1392) % 5000;
					try {
						if (this.anInt1392 == this.anInt1389) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(100) IOException local100) {
						this.aBoolean91 = true;
					}
				}
			}
		} catch (@Pc(133) Exception local133) {
			Static183.method3240(local133, null);
		}
	}
}

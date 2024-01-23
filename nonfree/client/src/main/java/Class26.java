import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!ud;")
	private Class116 aClass116_2;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	private int anInt1043 = 0;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	private int anInt1047 = 0;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!pc;")
	private Class87 aClass87_4;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pc;)V")
	public Class26(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class87 arg1) throws IOException {
		this.aClass87_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method776();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public void method776() {
		if (this.aBoolean49) {
			return;
		}
		synchronized (this) {
			this.aBoolean49 = true;
			this.notifyAll();
		}
		if (this.aClass116_2 != null) {
			while (this.aClass116_2.anInt4156 == 0) {
				Static204.method3250(1L);
			}
			if (this.aClass116_2.anInt4156 == 1) {
				try {
					((Thread) this.aClass116_2.anObject5).join();
				} catch (@Pc(48) InterruptedException local48) {
				}
			}
		}
		this.aClass116_2 = null;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)I")
	public int method777() throws IOException {
		return this.aBoolean49 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BBII)V")
	public void method779(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean49) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BIII)V")
	public void method781(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean49) {
			return;
		}
		if (this.aBoolean48) {
			this.aBoolean48 = false;
			throw new IOException();
		}
		if (this.aByteArray9 == null) {
			this.aByteArray9 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray9[this.anInt1047] = arg0[local32];
				this.anInt1047 = (this.anInt1047 + 1) % 5000;
				if (this.anInt1047 == (this.anInt1043 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass116_2 == null) {
				this.aClass116_2 = this.aClass87_4.method2694(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)I")
	public int method782() throws IOException {
		return this.aBoolean49 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ed", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(33) int local33;
					@Pc(44) int local44;
					synchronized (this) {
						if (this.anInt1043 == this.anInt1047) {
							if (this.aBoolean49) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt1043 <= this.anInt1047) {
							local33 = this.anInt1047 - this.anInt1043;
						} else {
							local33 = 5000 - this.anInt1043;
						}
						local44 = this.anInt1043;
					}
					if (local33 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray9, local44, local33);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean48 = true;
					}
					this.anInt1043 = (local33 + this.anInt1043) % 5000;
					try {
						if (this.anInt1047 == this.anInt1043) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean48 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray9 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static204.method3249(local114, null);
		}
	}
}

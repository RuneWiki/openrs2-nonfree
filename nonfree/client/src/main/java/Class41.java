import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "Lclient!bc;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	private int anInt947 = 0;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt949 = 0;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "Lclient!ne;")
	private final Class139 aClass139_3;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class85(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ne;)V")
	public Class41(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class139 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass139_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public void method823() throws IOException {
		if (!this.aBoolean66 && this.aBoolean67) {
			this.aBoolean67 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method825();
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	public void method824() {
		if (!this.aBoolean66) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	public void method825() {
		if (this.aBoolean66) {
			return;
		}
		synchronized (this) {
			this.aBoolean66 = true;
			this.notifyAll();
		}
		if (this.aClass16_2 != null) {
			while (this.aClass16_2.anInt381 == 0) {
				Static20.method408(1L);
			}
			if (this.aClass16_2.anInt381 == 1) {
				try {
					((Thread) this.aClass16_2.anObject1).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass16_2 = null;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)I")
	public int method826() throws IOException {
		return this.aBoolean66 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BBII)V")
	public void method827(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean66) {
			return;
		}
		while (arg1 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg1 -= local20;
			arg2 += local20;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BII)V")
	public void method829(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean66) {
			return;
		}
		if (this.aBoolean67) {
			this.aBoolean67 = false;
			throw new IOException();
		}
		if (this.aByteArray8 == null) {
			this.aByteArray8 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
				this.aByteArray8[this.anInt949] = arg0[local34];
				this.anInt949 = (this.anInt949 + 1) % 5000;
				if (this.anInt949 == (this.anInt947 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass16_2 == null) {
				this.aClass16_2 = this.aClass139_3.method3855(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)I")
	public int method830() throws IOException {
		return this.aBoolean66 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!cr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(26) int local26;
					synchronized (this) {
						if (this.anInt947 == this.anInt949) {
							if (this.aBoolean66) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(22) InterruptedException local22) {
							}
						}
						local26 = this.anInt947;
						if (this.anInt947 > this.anInt949) {
							local41 = 5000 - this.anInt947;
						} else {
							local41 = this.anInt949 - this.anInt947;
						}
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray8, local26, local41);
					} catch (@Pc(66) IOException local66) {
						this.aBoolean67 = true;
					}
					this.anInt947 = (this.anInt947 + local41) % 5000;
					try {
						if (this.anInt949 == this.anInt947) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean67 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray8 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static114.method1992(local121, null);
		}
	}
}

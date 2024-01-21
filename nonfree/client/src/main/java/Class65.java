import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class65 implements Runnable {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!ed;")
	private Class18 aClass18_10;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	private int anInt2668 = 0;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	private int anInt2674 = 0;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!lc;")
	private final Class34 aClass34_5;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!lc;)V")
	public Class65(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class34 arg1) throws IOException {
		this.aClass34_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[B)V")
	public void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean156) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg1 -= local18;
			arg0 += local18;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method1758() {
		if (this.aBoolean156) {
			return;
		}
		synchronized (this) {
			this.aBoolean156 = true;
			this.notifyAll();
		}
		if (this.aClass18_10 != null) {
			while (this.aClass18_10.anInt1028 == 0) {
				Static72.method1367(1L);
			}
			if (this.aClass18_10.anInt1028 == 1) {
				try {
					((Thread) this.aClass18_10.anObject3).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass18_10 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI[B)V")
	public void method1759(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean156) {
			return;
		}
		if (this.aBoolean155) {
			this.aBoolean155 = false;
			throw new IOException();
		}
		if (this.aByteArray20 == null) {
			this.aByteArray20 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray20[this.anInt2668] = arg1[local32];
				this.anInt2668 = (this.anInt2668 + 1) % 5000;
				if (this.anInt2668 == (this.anInt2674 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass18_10 == null) {
				this.aClass18_10 = this.aClass34_5.method1262(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1758();
	}

	@OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt2668 == this.anInt2674) {
							if (this.aBoolean156) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2674 <= this.anInt2668) {
							local40 = this.anInt2668 - this.anInt2674;
						} else {
							local40 = 5000 - this.anInt2674;
						}
						local51 = this.anInt2674;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray20, local51, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean155 = true;
					}
					this.anInt2674 = (local40 + this.anInt2674) % 5000;
					try {
						if (this.anInt2668 == this.anInt2674) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean155 = true;
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
				this.aByteArray20 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static10.method1681(null, local122);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	public int method1763() throws IOException {
		return this.aBoolean156 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)I")
	public int method1765() throws IOException {
		return this.aBoolean156 ? 0 : this.anInputStream1.read();
	}
}

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!kb;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
	private int anInt1045 = 0;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	private int anInt1046 = 0;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!aa;")
	private final Class2 aClass2_2;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!aa;)V")
	public Class31(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class2 arg1) throws IOException {
		this.aClass2_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BI)V")
	public void method711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean69) {
			return;
		}
		while (arg1 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg1 -= local22;
			arg0 += local22;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public int method713() throws IOException {
		return this.aBoolean69 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I")
	public int method715() throws IOException {
		return this.aBoolean69 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[B)V")
	public void method716(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean69) {
			return;
		}
		if (this.aBoolean68) {
			this.aBoolean68 = false;
			throw new IOException();
		}
		if (this.aByteArray14 == null) {
			this.aByteArray14 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray14[this.anInt1046] = arg1[local37];
				this.anInt1046 = (this.anInt1046 + 1) % 5000;
				if (this.anInt1046 == (this.anInt1045 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass42_4 == null) {
				this.aClass42_4 = this.aClass2_2.method13(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1046 == this.anInt1045) {
							if (this.aBoolean69) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1045;
						if (this.anInt1045 > this.anInt1046) {
							local43 = 5000 - this.anInt1045;
						} else {
							local43 = this.anInt1046 - this.anInt1045;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray14, local28, local43);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean68 = true;
					}
					this.anInt1045 = (this.anInt1045 + local43) % 5000;
					try {
						if (this.anInt1045 == this.anInt1046) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean68 = true;
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
				this.aByteArray14 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static101.method1675(local122, null);
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public void method717() {
		if (this.aBoolean69) {
			return;
		}
		synchronized (this) {
			this.aBoolean69 = true;
			this.notifyAll();
		}
		if (this.aClass42_4 != null) {
			while (this.aClass42_4.anInt1395 == 0) {
				Static104.method1701(1L);
			}
			if (this.aClass42_4.anInt1395 == 1) {
				try {
					((Thread) this.aClass42_4.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass42_4 = null;
	}

	@OriginalMember(owner = "client!gd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method717();
	}
}

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class395 implements Runnable {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	private int anInt10986 = 0;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	private int anInt10983 = 0;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	private final int anInt10989;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[B")
	private final byte[] aByteArray110;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class395(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt10989 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray110 = new byte[this.anInt10989];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10983 >= this.anInt10986) {
						local35 = this.anInt10983 - this.anInt10986;
					} else {
						local35 = this.anInt10983 + this.anInt10989 - this.anInt10986;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(58) IOException local58) {
						this.anIOException2 = local58;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(68) InterruptedException local68) {
					}
				}
			}
			try {
				if (this.anInt10986 + local35 <= this.anInt10989) {
					this.anOutputStream2.write(this.aByteArray110, this.anInt10986, local35);
				} else {
					@Pc(107) int local107 = this.anInt10989 - this.anInt10986;
					this.anOutputStream2.write(this.aByteArray110, this.anInt10986, local107);
					this.anOutputStream2.write(this.aByteArray110, 0, local35 - local107);
				}
			} catch (@Pc(127) IOException local127x) {
				@Pc(127) IOException local127 = local127x;
				synchronized (this) {
					this.anIOException2 = local127;
					return;
				}
			}
			synchronized (this) {
				this.anInt10986 = (local35 + this.anInt10986) % this.anInt10989;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public void method9172() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public void method9173() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(38) InterruptedException local38) {
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[BI)V")
	public void method9175(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || 0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(62) int local62;
			if (this.anInt10986 <= this.anInt10983) {
				local62 = this.anInt10986 + this.anInt10989 - this.anInt10983 - 1;
			} else {
				local62 = this.anInt10986 - this.anInt10983 - 1;
			}
			if (arg0 > local62) {
				throw new IOException("");
			}
			if (this.anInt10989 < this.anInt10983 + arg0) {
				@Pc(96) int local96 = this.anInt10989 - this.anInt10983;
				Static735.method9185(arg1, 0, this.aByteArray110, this.anInt10983, local96);
				Static735.method9185(arg1, local96, this.aByteArray110, 0, arg0 - local96);
			} else {
				Static735.method9185(arg1, 0, this.aByteArray110, this.anInt10983, arg0);
			}
			this.anInt10983 = (this.anInt10983 + arg0) % this.anInt10989;
			this.notifyAll();
		}
	}
}

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class236 implements Runnable {

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	private int anInt5917 = 0;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	private int anInt5924 = 0;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	private final int anInt5920;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[B")
	private final byte[] aByteArray73;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class236(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt5920 = arg1 + 1;
		this.aByteArray73 = new byte[this.anInt5920];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method5069() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!nj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5917 >= this.anInt5924) {
						local31 = this.anInt5917 - this.anInt5924;
					} else {
						local31 = this.anInt5917 + this.anInt5920 - this.anInt5924;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (this.anInt5920 >= local31 + this.anInt5924) {
					this.anOutputStream1.write(this.aByteArray73, this.anInt5924, local31);
				} else {
					@Pc(81) int local81 = this.anInt5920 - this.anInt5924;
					this.anOutputStream1.write(this.aByteArray73, this.anInt5924, local81);
					this.anOutputStream1.write(this.aByteArray73, 0, local31 - local81);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException2 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5924 = (this.anInt5924 + local31) % this.anInt5920;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public void method5071() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)V")
	public void method5072(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt5917 < this.anInt5924) {
				local58 = this.anInt5924 - this.anInt5917 - 1;
			} else {
				local58 = this.anInt5924 + this.anInt5920 - this.anInt5917 - 1;
			}
			if (local58 < arg1) {
				throw new IOException("");
			}
			if (this.anInt5920 >= arg1 + this.anInt5917) {
				Static653.method5398(arg0, 0, this.aByteArray73, this.anInt5917, arg1);
			} else {
				@Pc(107) int local107 = this.anInt5920 - this.anInt5917;
				Static653.method5398(arg0, 0, this.aByteArray73, this.anInt5917, local107);
				Static653.method5398(arg0, local107, this.aByteArray73, 0, arg1 - local107);
			}
			this.anInt5917 = (this.anInt5917 + arg1) % this.anInt5920;
			this.notifyAll();
		}
	}
}

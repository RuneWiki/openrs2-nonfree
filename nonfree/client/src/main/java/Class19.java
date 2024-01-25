import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class19 implements Runnable {

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private int anInt296 = 0;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
	private int anInt302 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	private final int anInt297;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class19(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt297 = arg1 + 1;
		this.aByteArray1 = new byte[this.anInt297];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public void method229() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	public void method230() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!ao", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt296 < this.anInt302) {
						local30 = this.anInt296 + this.anInt297 - this.anInt302;
					} else {
						local30 = this.anInt296 - this.anInt302;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(45) InterruptedException local45) {
					}
				}
			}
			try {
				if (this.anInt297 >= local30 + this.anInt302) {
					this.anOutputStream1.write(this.aByteArray1, this.anInt302, local30);
				} else {
					@Pc(77) int local77 = this.anInt297 - this.anInt302;
					this.anOutputStream1.write(this.aByteArray1, this.anInt302, local77);
					this.anOutputStream1.write(this.aByteArray1, 0, local30 - local77);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt302 = (local30 + this.anInt302) % this.anInt297;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([BBII)V")
	public void method232(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(55) int local55;
			if (this.anInt296 < this.anInt302) {
				local55 = this.anInt302 - this.anInt296 - 1;
			} else {
				local55 = this.anInt302 + this.anInt297 - this.anInt296 - 1;
			}
			if (local55 < arg1) {
				throw new IOException("");
			}
			if (this.anInt296 + arg1 > this.anInt297) {
				@Pc(96) int local96 = this.anInt297 - this.anInt296;
				Static597.method3730(arg0, 0, this.aByteArray1, this.anInt296, local96);
				Static597.method3730(arg0, local96, this.aByteArray1, 0, arg1 - local96);
			} else {
				Static597.method3730(arg0, 0, this.aByteArray1, this.anInt296, arg1);
			}
			this.anInt296 = (arg1 + this.anInt296) % this.anInt297;
			this.notifyAll();
		}
	}
}

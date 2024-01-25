import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class146 implements Runnable {

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	private int anInt3730 = 0;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	private int anInt3731 = 0;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	private final int anInt3728;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class146(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt3728 = arg1 + 1;
		this.aByteArray31 = new byte[this.anInt3728];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!hn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt3731 <= this.anInt3730) {
						local27 = this.anInt3730 - this.anInt3731;
					} else {
						local27 = this.anInt3730 + this.anInt3728 - this.anInt3731;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(45) InterruptedException local45) {
					}
				}
			}
			try {
				if (local27 + this.anInt3731 <= this.anInt3728) {
					this.anOutputStream1.write(this.aByteArray31, this.anInt3731, local27);
				} else {
					@Pc(77) int local77 = this.anInt3728 - this.anInt3731;
					this.anOutputStream1.write(this.aByteArray31, this.anInt3731, local77);
					this.anOutputStream1.write(this.aByteArray31, 0, local27 - local77);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException2 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt3731 = (local27 + this.anInt3731) % this.anInt3728;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public void method3299() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III[B)V")
	public void method3301(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(64) int local64;
			if (this.anInt3730 < this.anInt3731) {
				local64 = this.anInt3731 - this.anInt3730 - 1;
			} else {
				local64 = this.anInt3731 + this.anInt3728 - this.anInt3730 - 1;
			}
			if (arg0 > local64) {
				throw new IOException("");
			}
			if (this.anInt3730 + arg0 > this.anInt3728) {
				@Pc(108) int local108 = this.anInt3728 - this.anInt3730;
				Static655.method4109(arg1, 0, this.aByteArray31, this.anInt3730, local108);
				Static655.method4109(arg1, local108, this.aByteArray31, 0, arg0 - local108);
			} else {
				Static655.method4109(arg1, 0, this.aByteArray31, this.anInt3730, arg0);
			}
			this.anInt3730 = (this.anInt3730 + arg0) % this.anInt3728;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public void method3304() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}

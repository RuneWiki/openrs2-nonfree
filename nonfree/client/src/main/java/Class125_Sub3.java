import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "J")
	private long aLong159 = 0L;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "J")
	private long aLong160 = 0L;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	private int anInt6096 = 0;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	private int anInt6097 = 1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class125_Sub3() {
		this.aLong160 = System.nanoTime();
		this.aLong159 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)J")
	@Override
	public long method5264() {
		return this.aLong160;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method5262(@OriginalArg(1) long arg0) {
		if (this.aLong160 < this.aLong159) {
			this.aLong161 += this.aLong159 - this.aLong160;
			this.aLong160 += this.aLong159 - this.aLong160;
			this.aLong159 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong159 += arg0;
		} while (local17 < 10 && this.aLong159 < this.aLong160);
		if (this.aLong160 > this.aLong159) {
			this.aLong159 = this.aLong160;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)J")
	private long method5267() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong161;
		this.aLong161 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray6[this.anInt6096] = local6;
			if (this.anInt6097 < 1) {
				this.anInt6097++;
			}
			this.anInt6096 = (this.anInt6096 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt6097; local54++) {
			local52 += this.aLongArray6[(this.anInt6096 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt6097;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	@Override
	public void method5266() {
		this.aLong161 = 0L;
		if (this.aLong160 < this.aLong159) {
			this.aLong160 += this.aLong159 - this.aLong160;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)J")
	@Override
	protected long method5261() {
		this.aLong160 += this.method5267();
		return this.aLong160 < this.aLong159 ? (this.aLong159 - this.aLong160) / 1000000L : 0L;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mja")
public final class Class87_Sub2 extends Class87 {

	@OriginalMember(owner = "client!mja", name = "h", descriptor = "I")
	private int anInt6339 = 1;

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "J")
	private long aLong215 = 0L;

	@OriginalMember(owner = "client!mja", name = "i", descriptor = "J")
	private long aLong216 = 0L;

	@OriginalMember(owner = "client!mja", name = "j", descriptor = "[J")
	private final long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!mja", name = "k", descriptor = "J")
	private long aLong217 = 0L;

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
	private int anInt6340 = 0;

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)V")
	@Override
	public void method6747() {
		if (this.aLong215 < this.aLong216) {
			this.aLong215 += this.aLong216 - this.aLong215;
		}
		this.aLong217 = 0L;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6744(@OriginalArg(0) long arg0) {
		if (this.aLong216 > this.aLong215) {
			this.aLong217 += this.aLong216 - this.aLong215;
			this.aLong215 += this.aLong216 - this.aLong215;
			this.aLong216 += arg0;
			return 1;
		}
		@Pc(51) int local51 = 0;
		do {
			this.aLong216 += arg0;
			local51++;
		} while (local51 < 10 && this.aLong215 > this.aLong216);
		if (this.aLong215 > this.aLong216) {
			this.aLong216 = this.aLong215;
		}
		return local51;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)J")
	@Override
	public long method6750() {
		return this.aLong215;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6749() {
		this.aLong215 += this.method5494();
		return this.aLong216 > this.aLong215 ? (this.aLong216 - this.aLong215) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(B)J")
	private long method5494() {
		@Pc(4) long local4 = Static517.method6965() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong217;
		this.aLong217 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray18[this.anInt6340] = local10;
			if (this.anInt6339 < 10) {
				this.anInt6339++;
			}
			this.anInt6340 = (this.anInt6340 + 1) % 10;
		}
		@Pc(61) long local61 = 0L;
		for (@Pc(63) int local63 = 1; local63 <= this.anInt6339; local63++) {
			local61 += this.aLongArray18[(this.anInt6340 + 10 - local63) % 10];
		}
		return local61 / (long) this.anInt6339;
	}
}

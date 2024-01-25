import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	private int anInt2677 = 1;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	private int anInt2678 = 0;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	@Override
	public void method3403() {
		this.aLong87 = 0L;
		if (this.aLong89 > this.aLong88) {
			this.aLong88 += this.aLong89 - this.aLong88;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)I")
	@Override
	public int method3401(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong88 += this.method2137();
		if (this.aLong89 > this.aLong88) {
			Static331.method4343((this.aLong89 - this.aLong88) / 1000000L);
			this.aLong87 += this.aLong89 - this.aLong88;
			this.aLong88 += this.aLong89 - this.aLong88;
			this.aLong89 += local4;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			local72++;
			this.aLong89 += local4;
		} while (local72 < 10 && this.aLong88 > this.aLong89);
		if (this.aLong89 < this.aLong88) {
			this.aLong89 = this.aLong88;
		}
		return local72;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)J")
	private long method2137() {
		@Pc(4) long local4 = Static183.method2674() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong87;
		this.aLong87 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt2678] = local10;
			if (this.anInt2677 < 10) {
				this.anInt2677++;
			}
			this.anInt2678 = (this.anInt2678 + 1) % 10;
		}
		@Pc(52) long local52 = (long) 0;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt2677; local54++) {
			local52 += this.aLongArray4[(this.anInt2678 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt2677;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)J")
	@Override
	public long method3404() {
		return this.aLong88;
	}
}

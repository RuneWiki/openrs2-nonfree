import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class59_Sub3 extends Class59 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "J")
	private long aLong152 = 0L;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt5379 = 1;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	private int anInt5380 = 0;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
	@Override
	public int method4362(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong153 += this.method4365();
		if (this.aLong153 < this.aLong152) {
			Static443.method5991((this.aLong152 - this.aLong153) / 1000000L);
			this.aLong154 += this.aLong152 - this.aLong153;
			this.aLong153 += this.aLong152 - this.aLong153;
			this.aLong152 += local10;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong152 += local10;
			local66++;
		} while (local66 < 10 && this.aLong153 > this.aLong152);
		if (this.aLong153 > this.aLong152) {
			this.aLong152 = this.aLong153;
		}
		return local66;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	@Override
	public void method4363() {
		if (this.aLong153 < this.aLong152) {
			this.aLong153 += this.aLong152 - this.aLong153;
		}
		this.aLong154 = 0L;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)J")
	@Override
	public long method4364() {
		return this.aLong153;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)J")
	private long method4365() {
		@Pc(4) long local4 = Static208.method3182() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong154;
		this.aLong154 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray4[this.anInt5380] = local9;
			if (this.anInt5379 < 10) {
				this.anInt5379++;
			}
			this.anInt5380 = (this.anInt5380 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt5379; local52++) {
			local50 += this.aLongArray4[(this.anInt5380 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt5379;
	}
}

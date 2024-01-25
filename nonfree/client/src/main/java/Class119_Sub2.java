import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	private int anInt4412 = 1;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
	private int anInt4413 = 0;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)J")
	@Override
	public long method4147() {
		return this.aLong126;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	@Override
	public void method4149() {
		if (this.aLong126 < this.aLong124) {
			this.aLong126 += this.aLong124 - this.aLong126;
		}
		this.aLong125 = 0L;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4146(@OriginalArg(1) long arg0) {
		if (this.aLong126 < this.aLong124) {
			this.aLong125 += this.aLong124 - this.aLong126;
			this.aLong126 += this.aLong124 - this.aLong126;
			this.aLong124 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			this.aLong124 += arg0;
			local17++;
		} while (local17 < 10 && this.aLong124 < this.aLong126);
		if (this.aLong124 < this.aLong126) {
			this.aLong124 = this.aLong126;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)J")
	private long method3791() {
		@Pc(4) long local4 = Static137.method2058() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong125;
		this.aLong125 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray10[this.anInt4413] = local10;
			if (this.anInt4412 < 10) {
				this.anInt4412++;
			}
			this.anInt4413 = (this.anInt4413 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt4412; local53++) {
			local51 += this.aLongArray10[(this.anInt4413 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt4412;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)J")
	@Override
	protected long method4145() {
		this.aLong126 += this.method3791();
		return this.aLong126 < this.aLong124 ? (this.aLong124 - this.aLong126) / 1000000L : 0L;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class115_Sub2 extends Class115 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "J")
	private long aLong147 = 0L;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "J")
	private long aLong148 = 0L;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	private int anInt4197 = 0;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private int anInt4198 = 1;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "J")
	private long aLong149 = 0L;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	@Override
	public int method4522(@OriginalArg(1) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong148 += this.method3876();
		if (this.aLong147 > this.aLong148) {
			Static135.method2737((this.aLong147 - this.aLong148) / 1000000L);
			this.aLong149 += this.aLong147 - this.aLong148;
			this.aLong148 += this.aLong147 - this.aLong148;
			this.aLong147 += local9;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			this.aLong147 += local9;
			local29++;
		} while (local29 < 10 && this.aLong147 < this.aLong148);
		if (this.aLong147 < this.aLong148) {
			this.aLong147 = this.aLong148;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	@Override
	public void method4523() {
		this.aLong149 = 0L;
		if (this.aLong147 > this.aLong148) {
			this.aLong148 += this.aLong147 - this.aLong148;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)J")
	private long method3876() {
		@Pc(10) long local10 = Static183.method3462() * 1000000L;
		@Pc(16) long local16 = local10 - this.aLong149;
		this.aLong149 = local10;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray8[this.anInt4197] = local16;
			this.anInt4197 = (this.anInt4197 + 1) % 10;
			if (this.anInt4198 < 10) {
				this.anInt4198++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt4198; local57++) {
			local55 += this.aLongArray8[(this.anInt4197 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt4198;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)J")
	@Override
	public long method4524() {
		return this.aLong148;
	}
}

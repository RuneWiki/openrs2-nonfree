import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class103_Sub3 extends Class103 {

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	private int anInt4657 = 1;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	private int anInt4658 = 0;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "J")
	private long aLong152 = 0L;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	@Override
	public void method4087() {
		this.aLong152 = 0L;
		if (this.aLong154 < this.aLong153) {
			this.aLong154 += this.aLong153 - this.aLong154;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)J")
	private long method4090() {
		@Pc(4) long local4 = Static51.method979() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong152;
		this.aLong152 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray11[this.anInt4658] = local9;
			if (this.anInt4657 < 10) {
				this.anInt4657++;
			}
			this.anInt4658 = (this.anInt4658 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt4657; local55++) {
			local46 += this.aLongArray11[(this.anInt4658 + 10 - local55) % 10];
		}
		return local46 / (long) this.anInt4657;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)I")
	@Override
	public int method4086(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong154 += this.method4090();
		if (this.aLong153 > this.aLong154) {
			Static185.method3004((this.aLong153 - this.aLong154) / 1000000L);
			this.aLong152 += this.aLong153 - this.aLong154;
			this.aLong154 += this.aLong153 - this.aLong154;
			this.aLong153 += local10;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong153 += local10;
			local66++;
		} while (local66 < 10 && this.aLong153 < this.aLong154);
		if (this.aLong154 > this.aLong153) {
			this.aLong153 = this.aLong154;
		}
		return local66;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)J")
	@Override
	public long method4084() {
		return this.aLong154;
	}
}

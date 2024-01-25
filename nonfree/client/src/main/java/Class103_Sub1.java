import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	private int anInt4808 = 0;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "J")
	private long aLong127 = 0L;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "J")
	private long aLong125 = 0L;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	private int anInt4807 = 1;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method7412(@OriginalArg(1) long arg0) {
		if (this.aLong126 > this.aLong125) {
			this.aLong127 += this.aLong126 - this.aLong125;
			this.aLong125 += this.aLong126 - this.aLong125;
			this.aLong126 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong126 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong126 < this.aLong125);
		if (this.aLong125 > this.aLong126) {
			this.aLong126 = this.aLong125;
		}
		return local46;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)J")
	private long method4106() {
		@Pc(11) long local11 = Static184.method3422() * 1000000L;
		@Pc(17) long local17 = local11 - this.aLong127;
		this.aLong127 = local11;
		if (local17 > -5000000000L && local17 < 5000000000L) {
			this.aLongArray3[this.anInt4808] = local17;
			if (this.anInt4807 < 10) {
				this.anInt4807++;
			}
			this.anInt4808 = (this.anInt4808 + 1) % 10;
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt4807; local60++) {
			local58 += this.aLongArray3[(this.anInt4808 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt4807;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)J")
	@Override
	protected long method7413() {
		this.aLong125 += this.method4106();
		return this.aLong125 < this.aLong126 ? (this.aLong126 - this.aLong125) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)J")
	@Override
	public long method7410() {
		return this.aLong125;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	@Override
	public void method7408() {
		this.aLong127 = 0L;
		if (this.aLong126 > this.aLong125) {
			this.aLong125 += this.aLong126 - this.aLong125;
		}
	}
}

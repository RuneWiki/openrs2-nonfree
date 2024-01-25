import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "J")
	private long aLong97 = 0L;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "J")
	private long aLong98 = 0L;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	private int anInt4249 = 1;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "J")
	private long aLong99 = 0L;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	private int anInt4250 = 0;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)J")
	@Override
	public long method8182() {
		return this.aLong97;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
	@Override
	public void method8178() {
		if (this.aLong99 > this.aLong97) {
			this.aLong97 += this.aLong99 - this.aLong97;
		}
		this.aLong98 = 0L;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)J")
	@Override
	protected long method8176() {
		this.aLong97 += this.method3425();
		return this.aLong99 > this.aLong97 ? (this.aLong99 - this.aLong97) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8181(@OriginalArg(0) long arg0) {
		if (this.aLong97 < this.aLong99) {
			this.aLong98 += this.aLong99 - this.aLong97;
			this.aLong97 += this.aLong99 - this.aLong97;
			this.aLong99 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			local14++;
			this.aLong99 += arg0;
		} while (local14 < 10 && this.aLong97 > this.aLong99);
		if (this.aLong99 < this.aLong97) {
			this.aLong99 = this.aLong97;
		}
		return local14;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)J")
	private long method3425() {
		@Pc(4) long local4 = Static96.method2000() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong98;
		this.aLong98 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray3[this.anInt4250] = local9;
			this.anInt4250 = (this.anInt4250 + 1) % 10;
			if (this.anInt4249 < 10) {
				this.anInt4249++;
			}
		}
		@Pc(51) long local51 = (long) 0;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt4249; local53++) {
			local51 += this.aLongArray3[(this.anInt4250 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt4249;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "J")
	private long aLong114 = 0L;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "J")
	private long aLong113 = 0L;

	@OriginalMember(owner = "client!jfa", name = "n", descriptor = "J")
	private long aLong115 = 0L;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
	private int anInt4624 = 1;

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
	private int anInt4623 = 0;

	@OriginalMember(owner = "client!jfa", name = "j", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8500() {
		this.aLong115 = 0L;
		if (this.aLong114 < this.aLong113) {
			this.aLong114 += this.aLong113 - this.aLong114;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JB)I")
	@Override
	protected int method8503(@OriginalArg(0) long arg0) {
		if (this.aLong114 < this.aLong113) {
			this.aLong115 += this.aLong113 - this.aLong114;
			this.aLong114 += this.aLong113 - this.aLong114;
			this.aLong113 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			this.aLong113 += arg0;
			local14++;
		} while (local14 < 10 && this.aLong114 > this.aLong113);
		if (this.aLong114 > this.aLong113) {
			this.aLong113 = this.aLong114;
		}
		return local14;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)J")
	private long method4186() {
		@Pc(4) long local4 = Static95.method1587() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong115;
		this.aLong115 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt4623] = local10;
			if (this.anInt4624 < 10) {
				this.anInt4624++;
			}
			this.anInt4623 = (this.anInt4623 + 1) % 10;
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt4624; local60++) {
			local58 += this.aLongArray4[(this.anInt4623 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt4624;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)J")
	@Override
	public long method8504() {
		return this.aLong114;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)J")
	@Override
	protected long method8501() {
		this.aLong114 += this.method4186();
		return this.aLong113 > this.aLong114 ? (this.aLong113 - this.aLong114) / 1000000L : 0L;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class151_Sub3 extends Class151 {

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	private int anInt7744 = 1;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "J")
	private long aLong205 = 0L;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
	private int anInt7745 = 0;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)J")
	@Override
	public long method6451() {
		return this.aLong205;
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)J")
	private long method6459() {
		@Pc(4) long local4 = Static574.method8210() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong203;
		this.aLong203 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray14[this.anInt7745] = local9;
			if (this.anInt7744 < 10) {
				this.anInt7744++;
			}
			this.anInt7745 = (this.anInt7745 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt7744; local53++) {
			local46 += this.aLongArray14[(this.anInt7745 + 10 - local53) % 10];
		}
		return local46 / (long) this.anInt7744;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	@Override
	public void method6452() {
		if (this.aLong205 < this.aLong204) {
			this.aLong205 += this.aLong204 - this.aLong205;
		}
		this.aLong203 = 0L;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)J")
	@Override
	protected long method6455() {
		this.aLong205 += this.method6459();
		return this.aLong204 > this.aLong205 ? (this.aLong204 - this.aLong205) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6453(@OriginalArg(0) long arg0) {
		if (this.aLong205 < this.aLong204) {
			this.aLong203 += this.aLong204 - this.aLong205;
			this.aLong205 += this.aLong204 - this.aLong205;
			this.aLong204 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong204 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong205 > this.aLong204);
		if (this.aLong204 < this.aLong205) {
			this.aLong204 = this.aLong205;
		}
		return local46;
	}
}

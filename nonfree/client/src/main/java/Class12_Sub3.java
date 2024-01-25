import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "J")
	private long aLong99 = 0L;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "J")
	private long aLong98 = 0L;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	private int anInt3254 = 0;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	private int anInt3255 = 1;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)J")
	@Override
	public long method2859() {
		return this.aLong100;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public void method2856() {
		this.aLong99 = 0L;
		if (this.aLong100 < this.aLong98) {
			this.aLong100 += this.aLong98 - this.aLong100;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)J")
	private long method2861() {
		@Pc(10) long local10 = Static376.method6088() * 1000000L;
		@Pc(15) long local15 = local10 - this.aLong99;
		this.aLong99 = local10;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray7[this.anInt3254] = local15;
			this.anInt3254 = (this.anInt3254 + 1) % 10;
			if (this.anInt3255 < 10) {
				this.anInt3255++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt3255; local58++) {
			local56 += this.aLongArray7[(this.anInt3254 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt3255;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(JI)I")
	@Override
	protected int method2855(@OriginalArg(0) long arg0) {
		if (this.aLong98 > this.aLong100) {
			this.aLong99 += this.aLong98 - this.aLong100;
			this.aLong100 += this.aLong98 - this.aLong100;
			this.aLong98 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong98 += arg0;
		} while (local42 < 10 && this.aLong98 < this.aLong100);
		if (this.aLong98 < this.aLong100) {
			this.aLong98 = this.aLong100;
		}
		return local42;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)J")
	@Override
	protected long method2858() {
		this.aLong100 += this.method2861();
		return this.aLong100 < this.aLong98 ? (this.aLong98 - this.aLong100) / 1000000L : 0L;
	}
}

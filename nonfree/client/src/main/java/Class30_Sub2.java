import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	private int anInt5871 = 1;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "[J")
	private long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
	private int anInt5872 = 0;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)J")
	private long method4524() {
		@Pc(4) long local4 = Static252.method3964() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong201;
		this.aLong201 = local4;
		@Pc(15) long local15 = 0L;
		if (local10 > 0L && local10 < 5000000000L) {
			this.aLongArray13[this.anInt5872] = local10;
			if (this.anInt5871 < 10) {
				this.anInt5871++;
			}
			this.anInt5872 = (this.anInt5872 + 1) % 10;
		}
		for (@Pc(51) int local51 = 1; local51 <= this.anInt5871; local51++) {
			local15 += this.aLongArray13[(this.anInt5872 + 10 - local51) % 10];
		}
		return local15 / (long) this.anInt5871;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)J")
	@Override
	public long method4522() {
		return this.aLong199;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
	@Override
	public int method4519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static275.method4233((long) arg0);
		@Pc(13) long local13 = (long) arg1 * 1000000L;
		this.aLong199 += this.method4524();
		if (this.aLong199 < this.aLong200) {
			Static275.method4233((this.aLong200 - this.aLong199) / 1000000L);
			this.aLong201 += this.aLong200 - this.aLong199;
			this.aLong199 += this.aLong200 - this.aLong199;
			this.aLong200 += local13;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			this.aLong200 += local13;
			local68++;
		} while (local68 < 10 && this.aLong200 < this.aLong199);
		if (this.aLong200 < this.aLong199) {
			this.aLong200 = this.aLong199;
		}
		return local68;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	@Override
	public void method4521() {
		if (this.aLong199 < this.aLong200) {
			this.aLong199 += this.aLong200 - this.aLong199;
		}
		this.aLong201 = 0;
	}
}

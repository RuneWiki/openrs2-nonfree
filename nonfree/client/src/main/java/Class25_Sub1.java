import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	private int anInt771 = 1;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "J")
	private long aLong25 = 0L;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "J")
	private long aLong26 = 0L;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
	private int anInt772 = 0;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "[J")
	private long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "J")
	private long aLong27 = 0L;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J")
	@Override
	public long method4580() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	@Override
	public void method4579() {
		if (this.aLong27 < this.aLong25) {
			this.aLong27 += this.aLong25 - this.aLong27;
		}
		this.aLong26 = 0L;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)J")
	private long method745() {
		@Pc(4) long local4 = Static61.method1150() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong26;
		this.aLong26 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray3[this.anInt772] = local10;
			if (this.anInt771 < 10) {
				this.anInt771++;
			}
			this.anInt772 = (this.anInt772 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt771; local57++) {
			local49 += this.aLongArray3[(this.anInt772 + 10 - local57) % 10];
		}
		return local49 / (long) this.anInt771;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)I")
	@Override
	public int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static193.method3169((long) arg0);
		this.aLong27 += this.method745();
		@Pc(21) long local21 = (long) arg1 * 1000000L;
		if (this.aLong27 < this.aLong25) {
			Static193.method3169((this.aLong25 - this.aLong27) / 1000000L);
			this.aLong26 += this.aLong25 - this.aLong27;
			this.aLong27 += this.aLong25 - this.aLong27;
			this.aLong25 += local21;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			local29++;
			this.aLong25 += local21;
		} while (local29 < 10 && this.aLong27 > this.aLong25);
		if (this.aLong27 > this.aLong25) {
			this.aLong25 = this.aLong27;
		}
		return local29;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
	private long aLong20 = 0L;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "J")
	private long aLong21 = 0L;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	private int anInt395 = 0;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "J")
	private long aLong22 = 0L;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	private int anInt396 = 1;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)J")
	@Override
	public long method3263() {
		return this.aLong22;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	@Override
	public void method3261() {
		this.aLong21 = 0L;
		if (this.aLong20 > this.aLong22) {
			this.aLong22 += this.aLong20 - this.aLong22;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)J")
	private long method375() {
		@Pc(4) long local4 = Static258.method3967() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong21;
		@Pc(12) long local12 = 0L;
		this.aLong21 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt395] = local10;
			if (this.anInt396 < 10) {
				this.anInt396++;
			}
			this.anInt395 = (this.anInt395 + 1) % 10;
		}
		for (@Pc(57) int local57 = 1; local57 <= this.anInt396; local57++) {
			local12 += this.aLongArray2[(this.anInt395 + 10 - local57) % 10];
		}
		return local12 / (long) this.anInt396;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)I")
	@Override
	public int method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static312.method4734((long) arg1);
		this.aLong22 += this.method375();
		@Pc(21) long local21 = (long) arg0 * 1000000L;
		if (this.aLong20 > this.aLong22) {
			Static312.method4734((this.aLong20 - this.aLong22) / 1000000L);
			this.aLong21 += this.aLong20 - this.aLong22;
			this.aLong22 += this.aLong20 - this.aLong22;
			this.aLong20 += local21;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			this.aLong20 += local21;
			local68++;
		} while (local68 < 10 && this.aLong20 < this.aLong22);
		if (this.aLong22 > this.aLong20) {
			this.aLong20 = this.aLong22;
		}
		return local68;
	}
}

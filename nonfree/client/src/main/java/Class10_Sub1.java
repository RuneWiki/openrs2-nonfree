import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	private int anInt1481;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	private int anInt1474 = 256;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	private int anInt1475 = 1;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	private int anInt1469 = 0;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "J")
	private long aLong48 = Static78.method1296();

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class10_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray3[local22] = this.aLong48;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	@Override
	public int method1863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1474;
		@Pc(11) int local11 = this.anInt1475;
		this.anInt1474 = 300;
		this.anInt1475 = 1;
		this.aLong48 = Static78.method1296();
		if (this.aLongArray3[this.anInt1481] == 0L) {
			this.anInt1474 = local8;
			this.anInt1475 = local11;
		} else if (this.aLongArray3[this.anInt1481] < this.aLong48) {
			this.anInt1474 = (int) ((long) (arg0 * 2560) / (this.aLong48 - this.aLongArray3[this.anInt1481]));
		}
		if (this.anInt1474 < 25) {
			this.anInt1474 = 25;
		}
		if (this.anInt1474 > 256) {
			this.anInt1474 = 256;
			this.anInt1475 = (int) ((long) arg0 - (this.aLong48 - this.aLongArray3[this.anInt1481]) / 10L);
		}
		if (this.anInt1475 > arg0) {
			this.anInt1475 = arg0;
		}
		this.aLongArray3[this.anInt1481] = this.aLong48;
		this.anInt1481 = (this.anInt1481 + 1) % 10;
		@Pc(127) int local127;
		if (this.anInt1475 > 1) {
			for (local127 = 0; local127 < 10; local127++) {
				if (this.aLongArray3[local127] != 0L) {
					this.aLongArray3[local127] -= -((long) this.anInt1475);
				}
			}
		}
		local127 = 0;
		if (arg1 > this.anInt1475) {
			this.anInt1475 = arg1;
		}
		Static81.method1325((long) this.anInt1475);
		while (this.anInt1469 < 256) {
			this.anInt1469 += this.anInt1474;
			local127++;
		}
		this.anInt1469 &= 0xFF;
		return local127;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	@Override
	public void method1861() {
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			this.aLongArray3[local5] = 0L;
		}
	}
}

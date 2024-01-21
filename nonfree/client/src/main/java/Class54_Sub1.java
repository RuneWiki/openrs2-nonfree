import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!n", name = "u", descriptor = "I")
	private int anInt2249 = 0;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	private int anInt2251 = 256;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private int anInt2243 = 1;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "J")
	private long aLong102 = Static108.method1828();

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class54_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray13[local22] = this.aLong102;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)I")
	@Override
	public int method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt2251;
		this.anInt2251 = 300;
		@Pc(20) int local20 = this.anInt2243;
		this.anInt2243 = 1;
		this.aLong102 = Static108.method1828();
		if (this.aLongArray13[this.anInt2250] == 0L) {
			this.anInt2251 = local8;
			this.anInt2243 = local20;
		} else if (this.aLongArray13[this.anInt2250] < this.aLong102) {
			this.anInt2251 = (int) ((long) (arg0 * 2560) / (this.aLong102 - this.aLongArray13[this.anInt2250]));
		}
		if (this.anInt2251 < 25) {
			this.anInt2251 = 25;
		}
		if (this.anInt2251 > 256) {
			this.anInt2251 = 256;
			this.anInt2243 = (int) ((long) arg0 - (this.aLong102 - this.aLongArray13[this.anInt2250]) / 10L);
		}
		if (this.anInt2243 > arg0) {
			this.anInt2243 = arg0;
		}
		this.aLongArray13[this.anInt2250] = this.aLong102;
		this.anInt2250 = (this.anInt2250 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt2243 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray13[local136] != 0L) {
					this.aLongArray13[local136] += this.anInt2243;
				}
			}
		}
		if (arg1 > this.anInt2243) {
			this.anInt2243 = arg1;
		}
		Static50.method901((long) this.anInt2243);
		local136 = 0;
		while (this.anInt2249 < 256) {
			this.anInt2249 += this.anInt2251;
			local136++;
		}
		this.anInt2249 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	@Override
	public void method2772() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray13[local7] = 0L;
		}
	}
}

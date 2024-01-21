import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	private int anInt402 = 256;

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
	private int anInt406 = 1;

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
	private int anInt407 = 0;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "J")
	private long aLong15 = Static87.method1625();

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class11_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray2[local22] = this.aLong15;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZII)I")
	@Override
	public int method2164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt406;
		this.anInt406 = 1;
		@Pc(14) int local14 = this.anInt402;
		this.anInt402 = 300;
		this.aLong15 = Static87.method1625();
		if (this.aLongArray2[this.anInt404] == 0L) {
			this.anInt406 = local8;
			this.anInt402 = local14;
		} else if (this.aLongArray2[this.anInt404] < this.aLong15) {
			this.anInt402 = (int) ((long) (arg1 * 2560) / (this.aLong15 - this.aLongArray2[this.anInt404]));
		}
		if (this.anInt402 < 25) {
			this.anInt402 = 25;
		}
		if (this.anInt402 > 256) {
			this.anInt402 = 256;
			this.anInt406 = (int) ((long) arg1 - (this.aLong15 - this.aLongArray2[this.anInt404]) / 10L);
		}
		if (arg1 < this.anInt406) {
			this.anInt406 = arg1;
		}
		this.aLongArray2[this.anInt404] = this.aLong15;
		this.anInt404 = (this.anInt404 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt406 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray2[local136] != 0L) {
					this.aLongArray2[local136] += this.anInt406;
				}
			}
		}
		local136 = 0;
		if (this.anInt406 < arg0) {
			this.anInt406 = arg0;
		}
		Static40.method783((long) this.anInt406);
		while (this.anInt407 < 256) {
			this.anInt407 += this.anInt402;
			local136++;
		}
		this.anInt407 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	@Override
	public void method2158() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray2[local7] = 0L;
		}
	}
}

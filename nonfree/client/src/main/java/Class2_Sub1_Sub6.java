import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt664 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(24) int local24 = Static11.anIntArray8[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static120.anInt2812; local26++) {
				@Pc(32) int local32 = Static69.anIntArray117[local26];
				@Pc(64) int local64;
				if (local32 > this.anInt664 && local32 < 4096 - this.anInt664 && local24 > 2048 - this.anInt664 && this.anInt664 + 2048 > local24) {
					local64 = 2048 - local32;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt664;
					local11[local26] = 4096 - local64;
				} else if (2048 - this.anInt664 < local32 && this.anInt664 + 2048 > local32) {
					local64 = local24 - 2048;
					local64 = local64 < 0 ? -local64 : local64;
					local64 -= this.anInt664;
					local64 <<= 0xC;
					local11[local26] = local64 / (2048 - this.anInt664);
				} else if (this.anInt664 > local24 || local24 > 4096 - this.anInt664) {
					local64 = local32 - 2048;
					@Pc(170) int local170 = local64 >= 0 ? local64 : -local64;
					@Pc(175) int local175 = local170 - this.anInt664;
					@Pc(179) int local179 = local175 << 12;
					local11[local26] = local179 / (2048 - this.anInt664);
				} else if (this.anInt664 <= local32 && 4096 - this.anInt664 >= local32) {
					local11[local26] = 0;
				} else {
					local64 = 2048 - local24;
					local64 = local64 >= 0 ? local64 : -local64;
					local64 <<= 0xC;
					local64 /= 2048 - this.anInt664;
					local11[local26] = 4096 - local64;
				}
			}
		}
		return local11;
	}
}

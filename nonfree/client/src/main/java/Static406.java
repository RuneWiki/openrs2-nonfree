import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!qf;I)V")
	public static void method5938(@OriginalArg(0) Class6_Sub21_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static554.anInt9174; local7++) {
			@Pc(13) int local13 = Static28.anIntArray41[local7];
			@Pc(17) Class4_Sub1_Sub1_Sub2 local17 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local13];
			@Pc(21) int local21 = arg0.method6069();
			if ((local21 & 0x2) != 0) {
				local21 += arg0.method6069() << 8;
			}
			if ((local21 & 0x4000) != 0) {
				local21 += arg0.method6069() << 16;
			}
			Static214.method3751(local21, local17, local13, arg0);
		}
	}
}

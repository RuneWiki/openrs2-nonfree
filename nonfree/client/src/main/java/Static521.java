import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!dn;")
	public static Class69 aClass69_96;

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!up;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "Lclient!jr;")
	public static final Class155 aClass155_24 = new Class155("", 12);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIBII)V")
	public static void method7941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static452.method6975(Static187.anInt3872, arg4, Static94.anInt2057);
		@Pc(17) int local17 = Static452.method6975(Static187.anInt3872, arg2, Static94.anInt2057);
		@Pc(23) int local23 = Static452.method6975(Static119.anInt2469, arg3, Static325.anInt6148);
		@Pc(29) int local29 = Static452.method6975(Static119.anInt2469, arg1, Static325.anInt6148);
		@Pc(37) int local37 = Static452.method6975(Static187.anInt3872, arg4 + arg6, Static94.anInt2057);
		@Pc(48) int local48 = Static452.method6975(Static187.anInt3872, arg2 - arg6, Static94.anInt2057);
		for (@Pc(50) int local50 = local11; local50 < local37; local50++) {
			Static313.method5430(local29, arg0, Static143.anIntArrayArray33[local50], local23);
		}
		for (@Pc(66) int local66 = local17; local66 > local48; local66--) {
			Static313.method5430(local29, arg0, Static143.anIntArrayArray33[local66], local23);
		}
		@Pc(99) int local99 = Static452.method6975(Static119.anInt2469, arg6 + arg3, Static325.anInt6148);
		@Pc(108) int local108 = Static452.method6975(Static119.anInt2469, arg1 - arg6, Static325.anInt6148);
		for (@Pc(110) int local110 = local37; local110 <= local48; local110++) {
			@Pc(116) int[] local116 = Static143.anIntArrayArray33[local110];
			Static313.method5430(local99, arg0, local116, local23);
			Static313.method5430(local108, arg5, local116, local99);
			Static313.method5430(local29, arg0, local116, local108);
		}
	}
}

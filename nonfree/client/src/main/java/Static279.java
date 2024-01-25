import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
	public static int anInt4322;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!ua;Lclient!bu;Lclient!bu;Lclient!bu;I)Z")
	public static boolean method3495(@OriginalArg(0) Class3_Sub5_Sub4 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3) {
		Static33.aClass32_11 = arg1;
		Static344.aClass32_75 = arg2;
		Static377.aClass32_80 = arg3;
		Static452.aClass3_Sub5_Sub4_3 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIBII)V")
	public static void method3497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static108.method1849(Static341.anInt5789, arg5, Static309.anInt5495);
		@Pc(17) int local17 = Static108.method1849(Static341.anInt5789, arg4, Static309.anInt5495);
		@Pc(23) int local23 = Static108.method1849(Static452.anInt7626, arg6, Static82.anInt3956);
		@Pc(29) int local29 = Static108.method1849(Static452.anInt7626, arg3, Static82.anInt3956);
		@Pc(37) int local37 = Static108.method1849(Static341.anInt5789, arg5 + arg0, Static309.anInt5495);
		@Pc(46) int local46 = Static108.method1849(Static341.anInt5789, arg4 - arg0, Static309.anInt5495);
		for (@Pc(56) int local56 = local11; local56 < local37; local56++) {
			Static412.method5293(Static262.anIntArrayArray31[local56], arg1, local23, local29);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static412.method5293(Static262.anIntArrayArray31[local76], arg1, local23, local29);
		}
		@Pc(99) int local99 = Static108.method1849(Static452.anInt7626, arg6 + arg0, Static82.anInt3956);
		@Pc(108) int local108 = Static108.method1849(Static452.anInt7626, arg3 - arg0, Static82.anInt3956);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static262.anIntArrayArray31[local110];
			Static412.method5293(local116, arg1, local23, local99);
			Static412.method5293(local116, arg2, local99, local108);
			Static412.method5293(local116, arg1, local108, local29);
		}
	}
}

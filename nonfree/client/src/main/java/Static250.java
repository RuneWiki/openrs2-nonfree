import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!ra;")
	public static Class170 aClass170_88;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Z")
	public static boolean aBoolean374;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Lclient!ra;")
	public static Class170 aClass170_89;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!kg;")
	public static final Class109 aClass109_1 = new Class109(100);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public static int anInt4854 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBIIII)V")
	public static void method4373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static133.method5819(Static334.anInt6315, arg1, Static314.anInt6018);
		@Pc(17) int local17 = Static133.method5819(Static334.anInt6315, arg0, Static314.anInt6018);
		@Pc(23) int local23 = Static133.method5819(Static80.anInt4809, arg6, Static184.anInt6250);
		@Pc(29) int local29 = Static133.method5819(Static80.anInt4809, arg2, Static184.anInt6250);
		@Pc(37) int local37 = Static133.method5819(Static334.anInt6315, arg1 + arg5, Static314.anInt6018);
		@Pc(46) int local46 = Static133.method5819(Static334.anInt6315, arg0 - arg5, Static314.anInt6018);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static247.method3552(arg3, local23, Static332.anIntArrayArray56[local48], local29);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static247.method3552(arg3, local23, Static332.anIntArrayArray56[local72], local29);
		}
		@Pc(94) int local94 = Static133.method5819(Static80.anInt4809, arg5 + arg6, Static184.anInt6250);
		@Pc(103) int local103 = Static133.method5819(Static80.anInt4809, arg2 - arg5, Static184.anInt6250);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static332.anIntArrayArray56[local105];
			Static247.method3552(arg3, local23, local111, local94);
			Static247.method3552(arg4, local94, local111, local103);
			Static247.method3552(arg3, local103, local111, local29);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
	public static void method4375(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class96 local8 = Static305.method5232(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray22 != null) {
			@Pc(18) Class5_Sub12 local18 = new Class5_Sub12();
			local18.anObjectArray3 = local8.anObjectArray22;
			local18.anInt1379 = arg1;
			local18.aString82 = arg0;
			local18.aClass96_4 = local8;
			Static223.method3891(local18);
		}
		@Pc(39) boolean local39 = true;
		if (local8.anInt2935 > 0) {
			local39 = Static307.method5242(local8);
		}
		if (!local39 || !Static43.method975(local8).method1144(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static335.aClass5_Sub1_Sub1_3.method174(46);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 2) {
			Static335.aClass5_Sub1_Sub1_3.method174(136);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 3) {
			Static335.aClass5_Sub1_Sub1_3.method174(3);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 4) {
			Static335.aClass5_Sub1_Sub1_3.method174(169);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 5) {
			Static335.aClass5_Sub1_Sub1_3.method174(35);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 6) {
			Static335.aClass5_Sub1_Sub1_3.method174(107);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 7) {
			Static335.aClass5_Sub1_Sub1_3.method174(62);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 8) {
			Static335.aClass5_Sub1_Sub1_3.method174(79);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 9) {
			Static335.aClass5_Sub1_Sub1_3.method174(110);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
		if (arg1 == 10) {
			Static335.aClass5_Sub1_Sub1_3.method174(11);
			Static335.aClass5_Sub1_Sub1_3.method1851(arg2);
			Static335.aClass5_Sub1_Sub1_3.method1870(arg3);
		}
	}
}

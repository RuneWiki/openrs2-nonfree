import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_378 = Static170.method3101("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_379 = Static170.method3101(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_380 = Static170.method3101("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!eh;")
	public static Class28 aClass28_381 = Static170.method3101("<col=ff7000>");

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "Lclient!eh;")
	public static Class28 aClass28_382 = Static170.method3101("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "[I")
	public static int[] anIntArray228 = new int[500];

	@OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
	public static int anInt1209 = 0;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public static void method1018() {
		aClass28_380 = null;
		aClass28_382 = null;
		anIntArray228 = null;
		aClass28_379 = null;
		aClass28_378 = null;
		aClass28_381 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class89 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class89(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static149.aClass3_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static149.aClass3_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub20(local14, arg1, arg2);
				}
			}
			Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass89_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class89(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static149.aClass3_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static149.aClass3_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub20(local14, arg1, arg2);
				}
			}
			Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass89_1 = local12;
		} else {
			@Pc(134) Class27 local134 = new Class27(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static149.aClass3_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static149.aClass3_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub20(local14, arg1, arg2);
				}
			}
			Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local134;
		}
	}
}

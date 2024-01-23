import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "Lclient!qe;")
	public static Class78 aClass78_665 = Static199.method3560("Lade)3)3)3");

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
	public static int anInt3744 = 0;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
	public static int anInt3745 = -1;

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray108 = new boolean[100];

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_666 = Static199.method3560("Clientscript error in: ");

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "Lclient!qe;")
	public static Class78 aClass78_667 = Static199.method3560("Fps:");

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_668 = Static199.method3560("http:)4)4");

	@OriginalMember(owner = "client!pj", name = "ab", descriptor = "[I")
	public static int[] anIntArray625 = new int[1000];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!gg;Lclient!kb;ILclient!hh;IBI)V")
	public static void method2923(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub1 arg1, @OriginalArg(2) Class2_Sub3_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub14 local7 = new Class2_Sub14();
		local7.anInt894 = arg0 * 128;
		local7.anInt891 = arg5 * 128;
		local7.anInt887 = arg3;
		if (arg2 != null) {
			local7.aClass2_Sub3_Sub17_1 = arg2;
			local7.anInt901 = arg2.anInt2392 * 128;
			local7.anIntArray142 = arg2.anIntArray411;
			local7.anInt900 = arg2.anInt2396;
			local7.anInt893 = arg2.anInt2372;
			local7.anInt899 = arg2.anInt2393;
			@Pc(144) int local144 = arg2.anInt2387;
			@Pc(147) int local147 = arg2.anInt2394;
			if (arg6 == 1 || arg6 == 3) {
				local147 = arg2.anInt2387;
				local144 = arg2.anInt2394;
			}
			local7.anInt888 = (local147 + arg0) * 128;
			local7.anInt902 = (local144 + arg5) * 128;
			if (arg2.anIntArray413 != null) {
				local7.aBoolean34 = true;
				local7.method645();
			}
			if (local7.anIntArray142 != null) {
				local7.anInt895 = (int) (Math.random() * (double) (local7.anInt900 - local7.anInt899)) + local7.anInt899;
			}
			Static10.aClass44_5.method1355(local7);
		} else if (arg1 != null) {
			local7.aClass5_Sub2_Sub1_1 = arg1;
			@Pc(30) Class2_Sub3_Sub9 local30 = arg1.aClass2_Sub3_Sub9_1;
			if (local30.anIntArray230 != null) {
				local7.aBoolean34 = true;
				local30 = local30.method1059();
			}
			if (local30 != null) {
				local7.anInt902 = (local30.anInt1284 + arg5) * 128;
				local7.anInt888 = (arg0 + local30.anInt1284) * 128;
				local7.anInt893 = Static62.method1004(arg1);
				local7.anInt901 = local30.anInt1293 * 128;
			}
			Static49.aClass44_11.method1355(local7);
		} else if (arg4 != null) {
			local7.aClass5_Sub2_Sub2_2 = arg4;
			local7.anInt888 = (arg4.anInt1832 + arg0) * 128;
			local7.anInt902 = (arg4.anInt1832 + arg5) * 128;
			local7.anInt893 = Static93.method1619(arg4);
			local7.anInt901 = arg4.anInt1901 * 128;
			Static113.aClass103_15.method3665(arg4.aClass78_423.method3016(), local7);
		}
	}

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
	public static void method2928() {
		if (Static58.anInt1022 > 0) {
			Static192.method3513();
		} else {
			Static125.method1281(40);
			Static49.aClass105_1 = Static202.aClass105_4;
			Static202.aClass105_4 = null;
		}
	}
}

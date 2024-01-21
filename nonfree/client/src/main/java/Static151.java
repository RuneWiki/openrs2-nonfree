import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1028 = Static38.method685("Loaded config");

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1029 = Static38.method685("Connection timed out)3");

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1036 = Static38.method685("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1030 = aClass6_1036;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1033 = Static38.method685("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1031 = aClass6_1033;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1032 = aClass6_1028;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1034 = aClass6_1036;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1035 = aClass6_1029;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[Lclient!ng;")
	public static Class2_Sub3_Sub5_Sub1_Sub2[] aClass2_Sub3_Sub5_Sub1_Sub2Array1 = new Class2_Sub3_Sub5_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIZI)V")
	public static void method2325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static10.anInt232; local16++) {
			if (arg0 < Static60.anIntArray92[local16] + Static58.anIntArray97[local16] && Static58.anIntArray97[local16] < arg1 + arg0 && arg3 < Static4.anIntArray1[local16] + Static27.anIntArray30[local16] && Static27.anIntArray30[local16] < arg2 + arg3) {
				Static137.aBooleanArray14[local16] = true;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method2327(@OriginalArg(0) Class87 arg0) {
		if (Static106.anInt4180 == arg0.anInt4075) {
			Static86.aBooleanArray5[arg0.anInt4068] = true;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method2328() {
		anIntArray347 = null;
		aClass6_1029 = null;
		aClass6_1033 = null;
		aClass6_1032 = null;
		aClass6_1035 = null;
		aClass6_1034 = null;
		aClass2_Sub3_Sub5_Sub1_Sub2Array1 = null;
		aClass6_1028 = null;
		aClass6_1031 = null;
		aClass6_1036 = null;
		aClass6_1030 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBII)V")
	public static void method2329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class87 local8 = Static72.method1126(arg1, arg0);
		if (local8 != null && local8.anObjectArray7 != null) {
			@Pc(17) Class2_Sub2 local17 = new Class2_Sub2();
			local17.anObjectArray1 = local8.anObjectArray7;
			local17.aClass87_1 = local8;
			Static92.method1505(local17);
		}
		Static26.aBoolean28 = true;
		Static39.anInt1129 = arg1;
		Static146.anInt4005 = arg0;
		Static42.anInt1291 = arg2;
		method2327(local8);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)Z")
	public static boolean method2330(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Z")
	public static boolean aBoolean157;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public static int anInt3065;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1287 = Static34.method846("Loaded interfaces");

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1288 = aClass55_1287;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!le;")
	public static Class36 aClass36_36 = new Class36(64);

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!ab;")
	public static Class3 aClass3_11 = new Class3();

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public static int anInt3066 = 0;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public static int anInt3067 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ[B[Lclient!sb;III)V")
	public static void method1982(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class57[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg4 > 0 && local7 + arg4 < 103 && local11 + arg0 > 0 && local11 + arg0 < 103) {
						arg2[local3].anIntArrayArray20[local7 + arg4][local11 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(80) Class6_Sub1 local80 = new Class6_Sub1(arg1);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
					Static108.method2014(local80, arg5, local11, arg4 + local91, 0, arg3, arg0 + local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method1983() {
		if (Static85.anInt2400 != 1) {
			return;
		}
		if (Static68.anInt2013 >= 6 && Static68.anInt2013 <= 106 && Static23.anInt1030 >= 467 && Static23.anInt1030 <= 499) {
			Static29.aBoolean49 = true;
			Static72.aBoolean99 = true;
			Static12.anInt717 = (Static12.anInt717 + 1) % 4;
			Static51.aClass6_Sub1_Sub1_3.method1515(26);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static12.anInt717);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static112.anInt3231);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static41.anInt1399);
		}
		if (Static68.anInt2013 >= 135 && Static68.anInt2013 <= 235 && Static23.anInt1030 >= 467 && Static23.anInt1030 <= 499) {
			Static29.aBoolean49 = true;
			Static72.aBoolean99 = true;
			Static112.anInt3231 = (Static112.anInt3231 + 1) % 3;
			Static51.aClass6_Sub1_Sub1_3.method1515(26);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static12.anInt717);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static112.anInt3231);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static41.anInt1399);
		}
		if (Static68.anInt2013 >= 273 && Static68.anInt2013 <= 373 && Static23.anInt1030 >= 467 && Static23.anInt1030 <= 499) {
			Static72.aBoolean99 = true;
			Static29.aBoolean49 = true;
			Static41.anInt1399 = (Static41.anInt1399 + 1) % 3;
			Static51.aClass6_Sub1_Sub1_3.method1515(26);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static12.anInt717);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static112.anInt3231);
			Static51.aClass6_Sub1_Sub1_3.method1501(Static41.anInt1399);
		}
		if (Static68.anInt2013 < 412 || Static68.anInt2013 > 512 || Static23.anInt1030 < 467 || Static23.anInt1030 > 499) {
			return;
		}
		if (Static13.anInt800 != -1) {
			Static14.method510(Static34.aClass55_502, 0, Static74.aClass55_695);
			return;
		}
		Static11.method451();
		if (Static22.anInt1017 != -1) {
			Static34.aClass55_514 = Static34.aClass55_502;
			Static90.aBoolean118 = false;
			Static31.anInt1202 = Static13.anInt800 = Static22.anInt1017;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public static void method1984() {
		aClass55_1287 = null;
		aClass3_11 = null;
		aClass36_36 = null;
		anIntArrayArrayArray7 = null;
		aClass55_1288 = null;
		anIntArray289 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I")
	public static int method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class6_Sub13 local6 = (Class6_Sub13) Static12.aClass38_8.method1183((long) arg1);
		if (local6 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray274.length) {
			return local6.anIntArray274[arg0];
		} else {
			return 0;
		}
	}
}

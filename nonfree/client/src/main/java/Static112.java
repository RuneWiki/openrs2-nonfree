import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!vd", name = "qb", descriptor = "I")
	public static int anInt2923;

	@OriginalMember(owner = "client!vd", name = "rb", descriptor = "Lclient!c;")
	public static Class11 aClass11_4;

	@OriginalMember(owner = "client!vd", name = "Eb", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array39;

	@OriginalMember(owner = "client!vd", name = "Hb", descriptor = "[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array52;

	@OriginalMember(owner = "client!vd", name = "Mb", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_15;

	@OriginalMember(owner = "client!vd", name = "Pb", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!vd", name = "tb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1435 = Static14.method2017("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!vd", name = "ub", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1436 = Static14.method2017("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!vd", name = "wb", descriptor = "I")
	public static int anInt2926 = 0;

	@OriginalMember(owner = "client!vd", name = "zb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1437 = Static14.method2017("Loaded config");

	@OriginalMember(owner = "client!vd", name = "Ab", descriptor = "[I")
	public static int[] anIntArray348 = new int[1000];

	@OriginalMember(owner = "client!vd", name = "Bb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1438 = Static14.method2017("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!vd", name = "Kb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1439 = Static14.method2017("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!vd", name = "Nb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1440 = aClass36_1438;

	@OriginalMember(owner = "client!vd", name = "Rb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1441 = Static14.method2017("k");

	@OriginalMember(owner = "client!vd", name = "Ub", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1442 = aClass36_1437;

	@OriginalMember(owner = "client!vd", name = "Vb", descriptor = "I")
	public static int anInt2939 = -1;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
	public static void method2033() {
		Static36.method735(0, false, null);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIB)V")
	public static void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static76.method1462(arg0, arg2);
		if (local8 != null && local8.anObjectArray15 != null) {
			Static92.method1684(local8, local8.anObjectArray15, 0, 0, 0, null);
		}
		Static65.anInt1670 = arg0;
		Static88.anInt2320 = arg1;
		Static56.aBoolean70 = true;
		Static1.anInt5 = arg2;
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)V")
	public static void method2035() {
		aClass2_Sub1_Sub1_Sub1Array52 = null;
		aClass36_1436 = null;
		aClass2_Sub1_Sub1_Sub3Array39 = null;
		aClass36_1438 = null;
		aClass36_1435 = null;
		aClass36_1442 = null;
		anIntArray348 = null;
		aClass36_1439 = null;
		aClass11_4 = null;
		aClass36_1441 = null;
		aClass3_Sub1_15 = null;
		anIntArray349 = null;
		aClass36_1440 = null;
		aClass36_1437 = null;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Z")
	public static boolean method2036(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIZI)Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg4 << 38) + ((long) arg2 << 16) + (long) arg1 + ((long) arg0 << 40);
		@Pc(31) Class2_Sub1_Sub1_Sub3 local31;
		if (!arg3) {
			local31 = (Class2_Sub1_Sub1_Sub3) Static34.aClass22_9.method711(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class2_Sub1_Sub18 local39 = Static43.method832(arg1);
		if (arg2 > 1 && local39.anIntArray340 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg2 >= local39.anIntArray341[local51] && local39.anIntArray341[local51] != 0) {
					local49 = local39.anIntArray340[local51];
				}
			}
			if (local49 != -1) {
				local39 = Static43.method832(local49);
			}
		}
		@Pc(95) Class2_Sub1_Sub4_Sub1 local95 = local39.method1985(true, 1);
		if (local95 == null) {
			return null;
		}
		@Pc(101) Class2_Sub1_Sub1_Sub3 local101 = null;
		if (local39.anInt2823 != -1) {
			local101 = method2037(0, local39.anInt2836, 10, true, 1);
			if (local101 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static54.anIntArray260;
		@Pc(122) int local122 = Static54.anInt2258;
		@Pc(124) int local124 = Static54.anInt2256;
		@Pc(126) int local126 = Static54.anInt2257;
		@Pc(128) int local128 = Static54.anInt2255;
		@Pc(130) int local130 = Static54.anInt2254;
		@Pc(132) int local132 = Static54.anInt2259;
		@Pc(134) int[] local134 = Static87.method1604();
		@Pc(136) int local136 = Static87.anInt2266;
		@Pc(138) int local138 = Static87.anInt2261;
		local31 = new Class2_Sub1_Sub1_Sub3(36, 32);
		Static54.method1585(local31.anIntArray224, 36, 32);
		Static92.anIntArray294 = Static87.method1600(Static92.anIntArray294);
		Static54.method1591(0, 0, 36, 32, 0);
		Static87.aBoolean93 = false;
		Static87.method1603(16, 16);
		@Pc(166) int local166 = local39.anInt2838;
		if (arg3) {
			local166 = (int) ((double) local166 * 1.5D);
		} else if (arg4 == 2) {
			local166 = (int) ((double) local166 * 1.04D);
		}
		@Pc(196) int local196 = Class2_Sub1_Sub1_Sub4.anIntArray265[local39.anInt2813] * local166 >> 16;
		@Pc(205) int local205 = local166 * Class2_Sub1_Sub1_Sub4.anIntArray261[local39.anInt2813] >> 16;
		local95.method662();
		local95.method667(local39.anInt2826, local39.anInt2844, local39.anInt2813, local39.anInt2842, local39.anInt2831 + local95.anInt2916 / 2 + local196, local205 - -local39.anInt2831);
		if (arg4 >= 1) {
			local31.method1246(1);
		}
		if (arg4 >= 2) {
			local31.method1246(16777215);
		}
		if (arg0 != 0) {
			local31.method1249(arg0);
		}
		Static54.method1585(local31.anIntArray224, 36, 32);
		if (local39.anInt2823 != -1) {
			local101.method1234(0, 0);
		}
		if (!arg3 && (local39.anInt2837 == 1 || arg2 != 1) && arg2 != -1) {
			Static11.aClass2_Sub1_Sub1_Sub2_2.method456(Static42.method821(arg2), 1, 10, 1);
			Static11.aClass2_Sub1_Sub1_Sub2_2.method456(Static42.method821(arg2), 0, 9, 16776960);
		}
		if (!arg3) {
			Static34.aClass22_9.method712(local31, local23);
		}
		Static54.method1585(local120, local122, local128);
		Static54.method1577(local126, local132, local124, local130);
		Static87.method1600(local134);
		Static87.anInt2261 = local138;
		Static87.anInt2266 = local136;
		Static87.method1607();
		Static87.aBoolean93 = true;
		return local31;
	}
}

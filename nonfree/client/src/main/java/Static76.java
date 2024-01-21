import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!qe;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1158 = Static107.method1838("cyan:");

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1159 = aClass28_1158;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1160 = aClass28_1158;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!ff;)Lclient!gg;")
	public static Class28 method1367(@OriginalArg(1) Class24 arg0) {
		if (Static167.method2617(Static10.method323(arg0)) == 0) {
			return null;
		} else if (arg0.aClass28_815 == null || arg0.aClass28_815.method1117().method1121() == 0) {
			return Static29.aBoolean34 ? Static82.aClass28_1235 : null;
		} else {
			return arg0.aClass28_815;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lclient!f;")
	public static Class2_Sub4_Sub8 method1371(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub4_Sub8 local10 = (Class2_Sub4_Sub8) Static148.aClass14_170.method603((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static73.aClass40_19.method1771(8, arg0);
		local10 = new Class2_Sub4_Sub8();
		if (local20 != null) {
			local10.method900(new Class2_Sub2(local20));
		}
		Static148.aClass14_170.method607((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZBIII)Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 method1372(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = ((long) arg4 << 40) + (((long) arg3 << 16) + (long) arg2 + ((long) arg0 << 38));
		@Pc(32) Class2_Sub4_Sub3_Sub4 local32;
		if (!arg1) {
			local32 = (Class2_Sub4_Sub3_Sub4) Static181.aClass14_208.method603(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class2_Sub4_Sub12 local40 = Static58.method1034(arg2);
		if (arg3 > 1 && local40.anIntArray218 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg3 >= local40.anIntArray217[local52] && local40.anIntArray217[local52] != 0) {
					local50 = local40.anIntArray218[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static58.method1034(local50);
			}
		}
		@Pc(89) Class2_Sub4_Sub1_Sub3_Sub1 local89 = local40.method1562();
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class2_Sub4_Sub3_Sub4 local95 = null;
		if (local40.anInt2204 != -1) {
			local95 = method1372(1, true, local40.anInt2205, 10, 0);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static161.anIntArray365;
		@Pc(117) int local117 = Static161.anInt3980;
		@Pc(120) int[] local120 = new int[4];
		@Pc(122) int local122 = Static161.anInt3975;
		Static161.method2802(local120);
		local32 = new Class2_Sub4_Sub3_Sub4(36, 32);
		Static161.method2807(local32.anIntArray366, 36, 32);
		Static161.method2798();
		Static25.method543();
		Static25.method545(16, 16);
		@Pc(148) int local148 = local40.anInt2210;
		if (arg1) {
			local148 = (int) ((double) local148 * 1.5D);
		} else if (arg0 == 2) {
			local148 = (int) ((double) local148 * 1.04D);
		}
		Static25.aBoolean28 = false;
		@Pc(178) int local178 = local148 * Class2_Sub4_Sub3_Sub1.anIntArray60[local40.anInt2230] >> 16;
		@Pc(187) int local187 = local148 * Class2_Sub4_Sub3_Sub1.anIntArray58[local40.anInt2230] >> 16;
		local89.method1193();
		local89.method1188(local40.anInt2214, local40.anInt2211, local40.anInt2230, local40.anInt2232, local40.anInt2207 + local187 - local89.aShort36 / 2, local40.anInt2207 + local178);
		if (arg0 >= 1) {
			local32.method2815(1);
		}
		if (arg0 >= 2) {
			local32.method2815(16777215);
		}
		if (arg4 != 0) {
			local32.method2821(arg4);
		}
		Static161.method2807(local32.anIntArray366, 36, 32);
		if (local40.anInt2204 != -1) {
			local95.method2829(0, 0);
		}
		if (!arg1 && (local40.anInt2237 == 1 || arg3 != 1) && arg3 != -1) {
			Static8.aClass2_Sub4_Sub3_Sub2_Sub1_1.method2454(Static49.method928(arg3), 0, 9, 16776960, 1);
		}
		if (!arg1) {
			Static181.aClass14_208.method607(local24, local32);
		}
		Static161.method2807(local115, local122, local117);
		Static161.method2794(local120);
		Static25.method543();
		Static25.aBoolean28 = true;
		return local32;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method1376() {
		aClass28_1159 = null;
		aClass28_1158 = null;
		aClass28_1160 = null;
		aClass66_2 = null;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
	public static boolean method1380() {
		return Static43.anInt1114 == 0 ? Static164.aClass2_Sub8_Sub1_2.method791() : true;
	}
}

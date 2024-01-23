import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
	public static int[] anIntArray257;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_789 = Static186.method3527("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_5 = new Class4(16);

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_790 = Static186.method3527("Ausw-=hlen");

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[Lclient!ie;")
	public static Class53[] aClass53Array1 = new Class53[27];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZJI)Z")
	public static boolean method1855(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		@Pc(15) int local15 = (int) arg1 >> 14 & 0x1F;
		@Pc(31) int local31 = (int) arg1 >> 20 & 0x3;
		if (local15 == 10 || local15 == 11 || local15 == 22) {
			@Pc(70) Class18 local70 = Static148.method2487(local8);
			@Pc(84) int local84;
			@Pc(81) int local81;
			if (local31 == 0 || local31 == 2) {
				local84 = local70.anInt811;
				local81 = local70.anInt822;
			} else {
				local81 = local70.anInt811;
				local84 = local70.anInt822;
			}
			@Pc(95) int local95 = local70.anInt814;
			if (local31 != 0) {
				local95 = (local95 << local31 & 0xF) + (local95 >> 4 - local31);
			}
			Static233.method3515(arg2, 2, local81, 0, local84, arg0, true, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], local95, 0);
		} else {
			Static233.method3515(arg2, 2, 0, local31, 0, arg0, true, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, local15 + 1);
		}
		Static198.anInt3992 = 0;
		Static169.anInt3448 = 2;
		Static144.anInt2938 = Static70.anInt1323;
		Static52.anInt3318 = Static163.anInt3374;
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1856() {
		Static84.anApplet_Sub1_1.method537();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1857() {
		Static172.method2829();
		Static191.method3135();
		Static65.method3265();
		Static61.method919();
		Static131.method2209();
		Static7.method128();
		Static78.method1125();
		Static123.method1273();
		Static48.method760();
		Static153.method2554();
		Static91.method3231();
		Static129.method2046();
		Static208.method2994();
		Static139.method2306();
		((Class82) Static215.anInterface4_3).method2512();
		Static153.aClass4_8.method75();
		Static109.aClass86_Sub1_25.method3326();
		Static60.aClass86_Sub1_10.method3326();
		Static65.aClass86_Sub1_38.method3326();
		Static38.aClass86_Sub1_6.method3326();
		Static136.aClass86_Sub1_16.method3326();
		Static58.aClass86_Sub1_9.method3326();
		Static92.aClass86_Sub1_20.method3326();
		Static141.aClass86_Sub1_33.method3326();
		Static66.aClass86_Sub1_14.method3326();
		Static212.aClass86_Sub1_41.method3326();
		Static197.aClass86_Sub1_43.method3326();
		Static164.aClass84_28.method2585();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!pa;)Z")
	public static boolean method1858(@OriginalArg(1) int arg0, @OriginalArg(2) Class86 arg1) {
		@Pc(8) byte[] local8 = arg1.method3320(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static62.method939(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method1860() {
		Static211.anIntArray477 = null;
		Static24.aByteArrayArrayArray2 = null;
		Static227.anIntArray505 = null;
		Static39.anIntArray70 = null;
		Static120.aByteArrayArrayArray7 = null;
		Static181.anIntArray422 = null;
		anIntArray257 = null;
		Static118.aByteArrayArrayArray6 = null;
		Static12.aByteArrayArrayArray1 = null;
		Static80.aByteArrayArrayArray5 = null;
		Static185.anIntArrayArrayArray12 = null;
	}
}

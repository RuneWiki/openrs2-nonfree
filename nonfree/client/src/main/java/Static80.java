import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array6;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!sd;")
	public static Class29 aClass29_53;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!mb;")
	private static Class45 aClass45_958 = Static63.method1251("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_952 = aClass45_958;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_953 = Static63.method1251("backhmid1");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_954 = Static63.method1251("An");

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_955 = Static63.method1251("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!mb;")
	private static Class45 aClass45_956 = Static63.method1251("Prepared sound engine");

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[5][5000];

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_957 = aClass45_956;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
	public static void method1505(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static104.anInt2772 >= 100 && Static74.anInt2510 != 1 || Static104.anInt2772 >= 200) {
			Static7.method138(Static36.aClass45_491, Static78.aClass45_929, 0);
			return;
		}
		@Pc(35) Class45 local35 = Static10.method217(arg0).method1303();
		for (@Pc(42) int local42 = 0; local42 < Static104.anInt2772; local42++) {
			if (arg0 == Static23.aLongArray1[local42]) {
				Static7.method138(Static39.method1443(new Class45[] { local35, Static73.aClass45_894 }), Static78.aClass45_929, 0);
				return;
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static69.anInt1993; local77++) {
			if (Static56.aLongArray3[local77] == arg0) {
				Static7.method138(Static39.method1443(new Class45[] { Static119.aClass45_1354, local35, Static107.aClass45_1224 }), Static78.aClass45_929, 0);
				return;
			}
		}
		if (local35.method1319(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass45_629)) {
			return;
		}
		Static21.aClass45Array7[Static104.anInt2772] = local35;
		Static23.aLongArray1[Static104.anInt2772] = arg0;
		Static56.anIntArray257[Static104.anInt2772] = 0;
		Static9.anIntArray41[Static104.anInt2772] = 0;
		Static72.aBoolean99 = true;
		Static104.anInt2772++;
		Static108.anInt2827 = Static3.anInt94 + 1;
		Static64.aClass5_Sub9_Sub1_2.method1466(250);
		Static64.aClass5_Sub9_Sub1_2.method1454(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] method1506() {
		@Pc(8) Class5_Sub2_Sub6_Sub3[] local8 = new Class5_Sub2_Sub6_Sub3[Static64.anInt1854];
		for (@Pc(15) int local15 = 0; local15 < Static64.anInt1854; local15++) {
			@Pc(25) Class5_Sub2_Sub6_Sub3 local25 = local8[local15] = new Class5_Sub2_Sub6_Sub3();
			local25.anInt2601 = Static64.anInt1855;
			local25.anInt2600 = Static45.anInt1316;
			local25.anInt2602 = Static89.anIntArray368[local15];
			local25.anInt2598 = Static111.anIntArray440[local15];
			local25.anInt2599 = Static110.anIntArray438[local15];
			local25.anInt2597 = Static104.anIntArray424[local15];
			@Pc(57) int local57 = local25.anInt2597 * local25.anInt2599;
			@Pc(61) byte[] local61 = Static16.aByteArrayArray2[local15];
			local25.anIntArray377 = new int[local57];
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				local25.anIntArray377[local67] = Static7.anIntArray25[local61[local67] & 0xFF];
			}
		}
		Static96.method1797();
		return local8;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lclient!ia;")
	public static Class5_Sub2_Sub8 method1507(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> -894550512;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		if (Static19.aClass5_Sub2_Sub8ArrayArray1[local3] == null || Static19.aClass5_Sub2_Sub8ArrayArray1[local3][local7] == null) {
			@Pc(27) boolean local27 = Static36.method768(local3);
			if (!local27) {
				return null;
			}
		}
		return Static19.aClass5_Sub2_Sub8ArrayArray1[local3][local7];
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method1508() {
		aClass45_958 = null;
		aClass5_Sub2_Sub6_Sub3Array6 = null;
		aClass29_53 = null;
		aClass45_956 = null;
		aClass45_953 = null;
		aClass45_957 = null;
		anIntArrayArray22 = null;
		aClass45_952 = null;
		aClass45_955 = null;
		aClass45_954 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1509() {
		try {
			@Pc(2) Graphics local2 = Static75.aCanvas1.getGraphics();
			Static12.aClass11_136.method2148(local2, 4, 4);
		} catch (@Pc(18) Exception local18) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method1510() {
		Static54.aClass67_14.method1819();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method1511(@OriginalArg(0) Class5_Sub2_Sub4_Sub3 arg0) {
		arg0.anInt2419 = arg0.anInt2426;
		if (arg0.anInt2433 == 0) {
			arg0.anInt2443 = 0;
			return;
		}
		if (arg0.anInt2436 != -1 && arg0.anInt2387 == 0) {
			@Pc(32) Class5_Sub2_Sub9 local32 = Static63.method1252(arg0.anInt2436);
			if (arg0.anInt2405 > 0 && local32.anInt1658 == 0) {
				arg0.anInt2443++;
				return;
			}
			if (arg0.anInt2405 <= 0 && local32.anInt1662 == 0) {
				arg0.anInt2443++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt2428;
		@Pc(82) int local82 = arg0.anInt2440 * 64 + arg0.anIntArray350[arg0.anInt2433 - 1] * 128;
		@Pc(85) int local85 = arg0.anInt2417;
		@Pc(101) int local101 = arg0.anIntArray349[arg0.anInt2433 - 1] * 128 + arg0.anInt2440 * 64;
		if (local82 - local67 > 256 || local82 - local67 < -256 || local101 - local85 > 256 || local101 - local85 < -256) {
			arg0.anInt2428 = local82;
			arg0.anInt2417 = local101;
			return;
		}
		if (local82 > local67) {
			if (local85 < local101) {
				arg0.anInt2393 = 1280;
			} else if (local101 >= local85) {
				arg0.anInt2393 = 1536;
			} else {
				arg0.anInt2393 = 1792;
			}
		} else if (local82 < local67) {
			if (local101 > local85) {
				arg0.anInt2393 = 768;
			} else if (local85 <= local101) {
				arg0.anInt2393 = 512;
			} else {
				arg0.anInt2393 = 256;
			}
		} else if (local101 > local85) {
			arg0.anInt2393 = 1024;
		} else if (local101 < local85) {
			arg0.anInt2393 = 0;
		}
		@Pc(242) int local242 = arg0.anInt2393 - arg0.anInt2407 & 0x7FF;
		if (local242 > 1024) {
			local242 -= 2048;
		}
		@Pc(251) int local251 = arg0.anInt2421;
		@Pc(253) int local253 = 4;
		if (local242 >= -256 && local242 <= 256) {
			local251 = arg0.anInt2435;
		} else if (local242 >= 256 && local242 < 768) {
			local251 = arg0.anInt2437;
		} else if (local242 >= -768 && local242 <= -256) {
			local251 = arg0.anInt2380;
		}
		if (local251 == -1) {
			local251 = arg0.anInt2435;
		}
		@Pc(300) boolean local300 = true;
		arg0.anInt2419 = local251;
		if (arg0 instanceof Class5_Sub2_Sub4_Sub3_Sub2) {
			local300 = ((Class5_Sub2_Sub4_Sub3_Sub2) arg0).aClass5_Sub2_Sub17_1.aBoolean134;
		}
		if (local300) {
			if (arg0.anInt2393 != arg0.anInt2407 && arg0.anInt2411 == -1 && arg0.anInt2415 != 0) {
				local253 = 2;
			}
			if (arg0.anInt2433 > 2) {
				local253 = 6;
			}
			if (arg0.anInt2433 > 3) {
				local253 = 8;
			}
			if (arg0.anInt2443 > 0 && arg0.anInt2433 > 1) {
				arg0.anInt2443--;
				local253 = 8;
			}
		} else {
			if (arg0.anInt2433 > 1) {
				local253 = 6;
			}
			if (arg0.anInt2433 > 2) {
				local253 = 8;
			}
			if (arg0.anInt2443 > 0 && arg0.anInt2433 > 1) {
				arg0.anInt2443--;
				local253 = 8;
			}
		}
		if (arg0.aBooleanArray22[arg0.anInt2433 - 1]) {
			local253 <<= 0x1;
		}
		if (local253 >= 8 && arg0.anInt2419 == arg0.anInt2435 && arg0.anInt2410 != -1) {
			arg0.anInt2419 = arg0.anInt2410;
		}
		if (local85 < local101) {
			arg0.anInt2417 += local253;
			if (local101 < arg0.anInt2417) {
				arg0.anInt2417 = local101;
			}
		} else if (local101 < local85) {
			arg0.anInt2417 -= local253;
			if (arg0.anInt2417 < local101) {
				arg0.anInt2417 = local101;
			}
		}
		if (local82 > local67) {
			arg0.anInt2428 += local253;
			if (arg0.anInt2428 > local82) {
				arg0.anInt2428 = local82;
			}
		} else if (local82 < local67) {
			arg0.anInt2428 -= local253;
			if (arg0.anInt2428 < local82) {
				arg0.anInt2428 = local82;
			}
		}
		if (arg0.anInt2428 == local82 && arg0.anInt2417 == local101) {
			if (arg0.anInt2405 > 0) {
				arg0.anInt2405--;
			}
			arg0.anInt2433--;
		}
	}
}

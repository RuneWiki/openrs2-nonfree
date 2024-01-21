import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "Lclient!qc;")
	public static Class1_Sub18 aClass1_Sub18_1;

	@OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lclient!q;")
	public static Class62 aClass62_18;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!kd;")
	public static Class39 aClass39_775 = Static108.method1915("An:");

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
	public static int anInt1586 = 0;

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lclient!kd;")
	private static Class39 aClass39_781 = Static108.method1915("button near the top of that page)3");

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "Lclient!kd;")
	public static Class39 aClass39_776 = aClass39_781;

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "[I")
	public static int[] anIntArray222 = new int[100];

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "Lclient!kd;")
	private static Class39 aClass39_779 = Static108.method1915("Login");

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_777 = aClass39_779;

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "Lclient!kd;")
	public static Class39 aClass39_778 = Static108.method1915("backbase1");

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array16 = new Class39[20];

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_780 = Static108.method1915("Privater Chat");

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
	public static int anInt1590 = 0;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1060() {
		aClass1_Sub18_1 = null;
		aClass39_779 = null;
		aClass39_775 = null;
		aClass39_778 = null;
		aClass39Array16 = null;
		aClass39_781 = null;
		aClass39_776 = null;
		anIntArray222 = null;
		aClass39_777 = null;
		aClass62_18 = null;
		aClass39_780 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!qc;IIIIB)V")
	public static void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(32) int local32;
		if (arg3 < 0 || arg3 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local32 = arg2.method2169();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg2.method2169();
					break;
				}
				if (local32 <= 49) {
					arg2.method2169();
				}
			}
			return;
		}
		Static51.aByteArrayArrayArray3[arg4][arg3][arg5] = 0;
		while (true) {
			local32 = arg2.method2169();
			if (local32 == 0) {
				if (arg4 == 0) {
					Static51.anIntArrayArrayArray6[0][arg3][arg5] = -Static8.method229(arg1 + arg3 + 932731, arg0 + arg5 + 556238) * 8;
				} else {
					Static51.anIntArrayArrayArray6[arg4][arg3][arg5] = Static51.anIntArrayArrayArray6[arg4 - 1][arg3][arg5] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(89) int local89 = arg2.method2169();
				if (local89 == 1) {
					local89 = 0;
				}
				if (arg4 == 0) {
					Static51.anIntArrayArrayArray6[0][arg3][arg5] = -local89 * 8;
				} else {
					Static51.anIntArrayArrayArray6[arg4][arg3][arg5] = Static51.anIntArrayArrayArray6[arg4 - 1][arg3][arg5] - local89 * 8;
				}
				break;
			}
			if (local32 <= 49) {
				Static76.aByteArrayArrayArray6[arg4][arg3][arg5] = arg2.method2178();
				Static1.aByteArrayArrayArray1[arg4][arg3][arg5] = (byte) ((local32 - 2) / 4);
				Static99.aByteArrayArrayArray7[arg4][arg3][arg5] = (byte) (arg6 + local32 - 2 & 0x3);
			} else if (local32 <= 81) {
				Static51.aByteArrayArrayArray3[arg4][arg3][arg5] = (byte) (local32 - 49);
			} else {
				Static10.aByteArrayArrayArray2[arg4][arg3][arg5] = (byte) (local32 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)V")
	public static void method1062(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ee;I)V")
	public static void method1063(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static91.anInt2130 != 1) {
			return;
		}
		if (Static89.anInt2109 >= 280 && Static89.anInt2109 <= 294 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(0, 0);
			return;
		}
		if (Static89.anInt2109 >= 295 && Static89.anInt2109 <= 360 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(0, 1);
			return;
		}
		if (Static89.anInt2109 >= 390 && Static89.anInt2109 <= 404 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(1, 0);
			return;
		}
		if (Static89.anInt2109 >= 405 && Static89.anInt2109 <= 470 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(1, 1);
			return;
		}
		if (Static89.anInt2109 >= 500 && Static89.anInt2109 <= 514 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(2, 0);
			return;
		}
		if (Static89.anInt2109 >= 515 && Static89.anInt2109 <= 580 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(2, 1);
			return;
		}
		if (Static89.anInt2109 >= 610 && Static89.anInt2109 <= 624 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(3, 0);
			return;
		}
		if (Static89.anInt2109 >= 625 && Static89.anInt2109 <= 690 && Static38.anInt1157 >= 4 && Static38.anInt1157 <= 18) {
			Static34.method643(3, 1);
			return;
		}
		if (Static89.anInt2109 >= 708 && Static38.anInt1157 >= 4 && Static89.anInt2109 <= 758 && Static38.anInt1157 <= 20) {
			Static32.aBoolean60 = false;
			Static68.aClass1_Sub1_Sub4_Sub4_5.method1520(0, 0);
			Static95.aClass1_Sub1_Sub4_Sub4_7.method1520(382, 0);
			Static73.aClass1_Sub1_Sub4_Sub1_36.method492(382 - Static73.aClass1_Sub1_Sub4_Sub1_36.anInt869 / 2, 18);
			return;
		}
		if (Static97.anInt3128 == -1) {
			return;
		}
		@Pc(264) Class80 local264 = Static86.aClass80Array1[Static97.anInt3128];
		if (local264.aBoolean253 == Static46.aBoolean224) {
			@Pc(284) byte[] local284 = Static30.method601(new Class39[] { local264.aClass39_1542, Static72.aClass39_889 }).method1155();
			Static25.aString1 = new String(local284, 0, local284.length);
			Static32.aBoolean60 = false;
			if (Static46.anInt2784 != 0) {
				Static46.anInt2784 = 0;
				Static21.anInt738 = 443;
				Static72.anInt1808 = 43594;
				Static30.anInt1001 = 43594;
			}
			Static98.anInt2390 = local264.anInt3153;
			Static68.aClass1_Sub1_Sub4_Sub4_5.method1520(0, 0);
			Static95.aClass1_Sub1_Sub4_Sub4_7.method1520(382, 0);
			Static73.aClass1_Sub1_Sub4_Sub1_36.method492(382 - Static73.aClass1_Sub1_Sub4_Sub1_36.anInt869 / 2, 18);
			return;
		}
		@Pc(385) Class39 local385 = Static30.method601(new Class39[] { Static47.aClass39_631, local264.aClass39_1542, Static72.aClass39_889, Static8.aClass39_142, Static58.aClass39_764, Static69.method1226(Static68.aBoolean149 ? 1 : 0), Static102.aClass39_1248, Static69.method1226(Static93.anInt2200), Static95.aClass39_1392, Static69.method1226(Static81.anInt1991) });
		try {
			arg0.getAppletContext().showDocument(local385.method1157(), "_self");
		} catch (@Pc(394) Exception local394) {
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!kd;ILclient!q;ILclient!kd;IZ)V")
	public static void method1064(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(4) Class39 arg2) {
		@Pc(4) int local4 = arg1.method2015(arg0);
		@Pc(12) int local12 = arg1.method2012(local4, arg2);
		Static97.method2153(arg1, local12, local4, 255);
	}
}

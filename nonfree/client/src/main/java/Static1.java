import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public static int anInt1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!oa;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1 = Static38.method736("Prepared visibility map");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!vc;")
	private static Class71 aClass71_2 = Static38.method736("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!vc;")
	private static Class71 aClass71_9 = Static38.method736("Remove");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_3 = aClass71_9;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!vc;")
	private static Class71 aClass71_4 = Static38.method736("Enter object name");

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_5 = aClass71_1;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_6 = Static38.method736("Schlie-8en");

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!vc;")
	public static Class71 aClass71_7 = aClass71_4;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_8 = aClass71_2;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_10 = Static38.method736("k");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!nb;I)Z")
	public static boolean method9(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method668(arg1);
		if (local16 == null) {
			return false;
		} else {
			Static109.method1741(local16);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method10() {
		aClass71_10 = null;
		aClass71_9 = null;
		aClass71_5 = null;
		aClass71_3 = null;
		aClass71_6 = null;
		aClass71_8 = null;
		aClass71_7 = null;
		aClass71_1 = null;
		aClass71_4 = null;
		aClass71_2 = null;
		aClass7_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method12() {
		if (Static75.anInt1855 != 0) {
			return;
		}
		Static49.anInt1394 = 1;
		Static24.aClass71Array8[0] = Static41.aClass71_597;
		Static66.anIntArray191[0] = 1005;
		if (Static68.anInt1659 != -1) {
			Static33.anInt930 = -1;
			Static7.anInt262 = -1;
			Static112.method1754(503, 0, Static26.anInt1440, Static68.anInt1659, 765, 0, Static107.anInt2563, 0);
			Static37.anInt601 = Static7.anInt262;
			Static42.anInt1082 = Static33.anInt930;
			return;
		}
		Static8.method195();
		Static7.anInt262 = -1;
		Static33.anInt930 = -1;
		@Pc(48) boolean local48 = false;
		if (Static107.anInt2563 > 4 && Static26.anInt1440 > 4 && Static107.anInt2563 < 516 && Static26.anInt1440 < 338) {
			if (Static47.anInt1298 == -1) {
				Static112.method1751();
			} else {
				Static112.method1754(338, 4, Static26.anInt1440, Static47.anInt1298, 516, 0, Static107.anInt2563, 4);
			}
		}
		Static37.anInt601 = Static7.anInt262;
		Static42.anInt1082 = Static33.anInt930;
		Static7.anInt262 = -1;
		Static33.anInt930 = -1;
		if (Static107.anInt2563 > 553 && Static26.anInt1440 > 205 && Static107.anInt2563 < 743 && Static26.anInt1440 < 466) {
			if (Static95.anInt2286 != -1) {
				Static112.method1754(466, 553, Static26.anInt1440, Static95.anInt2286, 743, 1, Static107.anInt2563, 205);
			} else if (Static26.anIntArray168[Static64.anInt2489] != -1) {
				Static112.method1754(466, 553, Static26.anInt1440, Static26.anIntArray168[Static64.anInt2489], 743, 1, Static107.anInt2563, 205);
			}
		}
		if (Static41.anInt1066 != Static7.anInt262) {
			Static41.anInt1066 = Static7.anInt262;
			Static28.aBoolean33 = true;
		}
		Static7.anInt262 = -1;
		if (Static73.anInt1838 != Static33.anInt930) {
			Static28.aBoolean33 = true;
			Static73.anInt1838 = Static33.anInt930;
		}
		Static33.anInt930 = -1;
		if (Static107.anInt2563 > 17 && Static26.anInt1440 > 357 && Static107.anInt2563 < 496 && Static26.anInt1440 < 453) {
			if (Static62.anInt1577 != -1) {
				Static112.method1754(453, 17, Static26.anInt1440, Static62.anInt1577, 496, 2, Static107.anInt2563, 357);
			} else if (Static7.anInt275 != -1) {
				Static112.method1754(453, 17, Static26.anInt1440, Static7.anInt275, 496, 3, Static107.anInt2563, 357);
			} else if (Static26.anInt1440 < 434 && Static107.anInt2563 < 426) {
				Static93.method1552(Static26.anInt1440 - 357, Static107.anInt2563 + -17);
			}
		}
		if ((Static62.anInt1577 != -1 || Static7.anInt275 != -1) && Static7.anInt262 != Static73.anInt1834) {
			Static68.aBoolean72 = true;
			Static73.anInt1834 = Static7.anInt262;
		}
		if ((Static62.anInt1577 != -1 || Static7.anInt275 != -1) && Static33.anInt930 != Static111.anInt972) {
			Static111.anInt972 = Static33.anInt930;
			Static68.aBoolean72 = true;
		}
		while (!local48) {
			local48 = true;
			for (@Pc(259) int local259 = 0; local259 < Static49.anInt1394 - 1; local259++) {
				if (Static66.anIntArray191[local259] < 1000 && Static66.anIntArray191[local259 + 1] > 1000) {
					@Pc(281) Class71 local281 = Static24.aClass71Array8[local259];
					local48 = false;
					Static24.aClass71Array8[local259] = Static24.aClass71Array8[local259 + 1];
					Static24.aClass71Array8[local259 + 1] = local281;
					@Pc(301) int local301 = Static66.anIntArray191[local259];
					Static66.anIntArray191[local259] = Static66.anIntArray191[local259 + 1];
					Static66.anIntArray191[local259 + 1] = local301;
					@Pc(319) int local319 = Static47.anIntArray151[local259];
					Static47.anIntArray151[local259] = Static47.anIntArray151[local259 + 1];
					Static47.anIntArray151[local259 + 1] = local319;
					@Pc(337) int local337 = Static49.anIntArray158[local259];
					Static49.anIntArray158[local259] = Static49.anIntArray158[local259 + 1];
					Static49.anIntArray158[local259 + 1] = local337;
					@Pc(355) int local355 = Static116.anIntArray286[local259];
					Static116.anIntArray286[local259] = Static116.anIntArray286[local259 + 1];
					Static116.anIntArray286[local259 + 1] = local355;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZB)V")
	public static void method13(@OriginalArg(0) boolean arg0) {
		if (Static116.aClass35_3 == null) {
			return;
		}
		try {
			@Pc(15) Class5_Sub11 local15 = new Class5_Sub11(4);
			local15.method1545(arg0 ? 2 : 3);
			local15.method1514(0);
			Static116.aClass35_3.method967(4, local15.aByteArray23);
		} catch (@Pc(36) IOException local36) {
			try {
				Static116.aClass35_3.method961();
			} catch (@Pc(41) Exception local41) {
			}
			Static116.aClass35_3 = null;
			Static20.anInt674++;
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)V")
	public static void method14(@OriginalArg(1) int arg0) {
		if (!Static106.method1689(arg0)) {
			return;
		}
		@Pc(14) Class5_Sub1_Sub11[] local14 = Static30.aClass5_Sub1_Sub11ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class5_Sub1_Sub11 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt1798 = 0;
				local22.anInt1767 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fc;BI)V")
	public static void method17(@OriginalArg(0) Class24_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static76.aClass5_Sub11_4 == null) {
			Static37.method465(true, (byte) 0, null, 255, 0, 255);
			Static25.aClass24_Sub1Array1[arg1] = arg0;
		} else {
			Static76.aClass5_Sub11_4.anInt2233 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static76.aClass5_Sub11_4.method1540();
			arg0.method687(local16);
		}
	}
}

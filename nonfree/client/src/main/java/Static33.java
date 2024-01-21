import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!h", name = "dc", descriptor = "Lclient!mb;")
	public static Class42 aClass42_27;

	@OriginalMember(owner = "client!h", name = "V", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
	public static final int anInt1053 = 5063219;

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!h", name = "Cb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_12 = new Class34(64);

	@OriginalMember(owner = "client!h", name = "Yb", descriptor = "Lclient!v;")
	public static Class62 aClass62_458 = Static45.method753(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "I")
	public static final int anInt1086 = 20;

	@OriginalMember(owner = "client!h", name = "bc", descriptor = "Lclient!v;")
	private static Class62 aClass62_459 = Static45.method753("Drop");

	@OriginalMember(owner = "client!h", name = "cc", descriptor = "I")
	public static volatile int anInt1087 = 0;

	@OriginalMember(owner = "client!h", name = "ec", descriptor = "Lclient!v;")
	public static Class62 aClass62_460 = aClass62_459;

	@OriginalMember(owner = "client!h", name = "fc", descriptor = "I")
	public static int anInt1088 = 0;

	@OriginalMember(owner = "client!h", name = "gc", descriptor = "[I")
	public static int[] anIntArray77 = new int[25];

	@OriginalMember(owner = "client!h", name = "ic", descriptor = "Lclient!v;")
	private static Class62 aClass62_462 = Static45.method753("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!h", name = "hc", descriptor = "Lclient!v;")
	public static Class62 aClass62_461 = aClass62_462;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)I")
	public static int method646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	public static void method649() {
		aClass62_460 = null;
		aClass42_27 = null;
		aClass62_462 = null;
		anIntArray77 = null;
		aClass34_12 = null;
		aClass62_461 = null;
		aByteArrayArray4 = null;
		aClass62_458 = null;
		aClass62_459 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIII)I")
	public static int method652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mb;Lclient!mb;I)V")
	public static void method655(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1) {
		Static36.aClass42_28 = arg0;
		Static100.aClass42_66 = arg1;
		Static34.anInt1096 = Static36.aClass42_28.method1494(3);
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(I)V")
	public static void method657() {
		if (Static77.anInt2065 != 0) {
			return;
		}
		Static18.aClass62Array6[0] = Static45.aClass62_569;
		Static46.anIntArray108[0] = 1001;
		Static41.anInt1209 = 1;
		if (Static91.anInt2434 != -1) {
			Static81.anInt2179 = -1;
			Static93.anInt2485 = -1;
			Static6.method170(503, 0, 0, 0, Static91.anInt2434, -1, Static6.anInt208, 765, Static61.anInt1672, 0);
			Static23.anInt751 = Static81.anInt2179;
			Static39.anInt1162 = Static93.anInt2485;
			return;
		}
		@Pc(53) boolean local53 = false;
		Static99.method1655();
		Static93.anInt2485 = -1;
		Static81.anInt2179 = -1;
		if (Static6.anInt208 > 4 && Static61.anInt1672 > 4 && Static6.anInt208 < 516 && Static61.anInt1672 < 338) {
			if (Static38.anInt1133 == -1) {
				Static6.method169();
			} else {
				Static6.method170(338, 0, 4, 0, Static38.anInt1133, -1, Static6.anInt208, 516, Static61.anInt1672, 4);
			}
		}
		Static39.anInt1162 = Static93.anInt2485;
		Static93.anInt2485 = -1;
		Static23.anInt751 = Static81.anInt2179;
		Static81.anInt2179 = -1;
		if (Static6.anInt208 > 553 && Static61.anInt1672 > 205 && Static6.anInt208 < 743 && Static61.anInt1672 < 466) {
			if (Static92.anInt2448 != -1) {
				Static6.method170(466, 0, 553, 1, Static92.anInt2448, -1, Static6.anInt208, 743, Static61.anInt1672, 205);
			} else if (Static72.anIntArray205[Static34.anInt1097] != -1) {
				Static6.method170(466, 0, 553, 1, Static72.anIntArray205[Static34.anInt1097], -1, Static6.anInt208, 743, Static61.anInt1672, 205);
			}
		}
		if (Static81.anInt2179 != Static15.anInt575) {
			Static52.aBoolean64 = true;
			Static15.anInt575 = Static81.anInt2179;
		}
		Static81.anInt2179 = -1;
		if (Static93.anInt2485 != Static51.anInt2323) {
			Static51.anInt2323 = Static93.anInt2485;
			Static52.aBoolean64 = true;
		}
		Static93.anInt2485 = -1;
		if (Static6.anInt208 > 17 && Static61.anInt1672 > 357 && Static6.anInt208 < 496 && Static61.anInt1672 < 453) {
			if (Static5.anInt200 != -1) {
				Static6.method170(453, 0, 17, 2, Static5.anInt200, -1, Static6.anInt208, 496, Static61.anInt1672, 357);
			} else if (Static41.anInt1213 != -1) {
				Static6.method170(453, 0, 17, 3, Static41.anInt1213, -1, Static6.anInt208, 496, Static61.anInt1672, 357);
			} else if (Static61.anInt1672 < 434 && Static6.anInt208 < 426) {
				Static52.method683(Static6.anInt208 - 17, Static61.anInt1672 + -357);
			}
		}
		if ((Static5.anInt200 != -1 || Static41.anInt1213 != -1) && Static63.anInt2394 != Static81.anInt2179) {
			Static86.aBoolean137 = true;
			Static63.anInt2394 = Static81.anInt2179;
		}
		if ((Static5.anInt200 != -1 || Static41.anInt1213 != -1) && Static92.anInt2449 != Static93.anInt2485) {
			Static92.anInt2449 = Static93.anInt2485;
			Static86.aBoolean137 = true;
		}
		while (!local53) {
			local53 = true;
			for (@Pc(276) int local276 = 0; local276 < Static41.anInt1209 - 1; local276++) {
				if (Static46.anIntArray108[local276] < 1000 && Static46.anIntArray108[local276 + 1] > 1000) {
					local53 = false;
					@Pc(298) Class62 local298 = Static18.aClass62Array6[local276];
					Static18.aClass62Array6[local276] = Static18.aClass62Array6[local276 + 1];
					Static18.aClass62Array6[local276 + 1] = local298;
					@Pc(316) int local316 = Static46.anIntArray108[local276];
					Static46.anIntArray108[local276] = Static46.anIntArray108[local276 + 1];
					Static46.anIntArray108[local276 + 1] = local316;
					@Pc(334) int local334 = Static74.anIntArray226[local276];
					Static74.anIntArray226[local276] = Static74.anIntArray226[local276 + 1];
					Static74.anIntArray226[local276 + 1] = local334;
					@Pc(352) int local352 = Static50.anIntArray311[local276];
					Static50.anIntArray311[local276] = Static50.anIntArray311[local276 + 1];
					Static50.anIntArray311[local276 + 1] = local352;
					@Pc(370) int local370 = Static27.anIntArray62[local276];
					Static27.anIntArray62[local276] = Static27.anIntArray62[local276 + 1];
					Static27.anIntArray62[local276 + 1] = local370;
				}
			}
		}
	}
}

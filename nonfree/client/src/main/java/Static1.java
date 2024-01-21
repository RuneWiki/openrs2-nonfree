import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!m;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1 = Static2.method66("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!ke;")
	private static Class39 aClass39_5 = Static2.method66("Please remove ");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_2 = aClass39_5;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_3 = aClass39_5;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt1 = 0;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
	public static int[] anIntArray1 = new int[5];

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_4 = Static2.method66("mapmarker");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static final int anInt5 = 20;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!jd;Lclient!jd;)V")
	public static void method1(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class36 arg1) {
		Static12.aClass36_11 = arg1;
		Static81.aClass36_54 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBI)Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub1_Sub4_Sub2 local14;
		if (arg1 == 0) {
			local14 = (Class2_Sub1_Sub4_Sub2) Static65.aClass54_21.method1634((long) arg0);
			if (local14 != null && arg2 != local14.anInt1500 && local14.anInt1500 != -1) {
				local14.method2045();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(38) Class2_Sub1_Sub7 local38 = Static66.method1384(arg0);
		if (local38.anIntArray182 == null) {
			arg2 = -1;
		}
		if (arg2 > 1) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg2 >= local38.anIntArray184[local52] && local38.anIntArray184[local52] != 0) {
					local50 = local38.anIntArray182[local52];
				}
			}
			if (local50 != -1) {
				local38 = Static66.method1384(local50);
			}
		}
		@Pc(93) Class2_Sub1_Sub2_Sub2 local93 = local38.method903(1, true);
		if (local93 == null) {
			return null;
		}
		@Pc(99) Class2_Sub1_Sub4_Sub2 local99 = null;
		if (local38.anInt1327 != -1) {
			local99 = method2(local38.anInt1305, -1, 10);
			if (local99 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = Static91.anIntArray354;
		@Pc(118) int local118 = Static91.anInt2836;
		@Pc(120) int local120 = Static91.anInt2833;
		@Pc(127) int local127 = Static91.anInt2835;
		@Pc(129) int local129 = Static91.anInt2837;
		@Pc(131) int local131 = Static91.anInt2834;
		@Pc(133) int local133 = Static91.anInt2832;
		@Pc(135) int[] local135 = Static106.method2024();
		@Pc(137) int local137 = Static106.anInt2845;
		@Pc(139) int local139 = Static106.anInt2839;
		local14 = new Class2_Sub1_Sub4_Sub2(32, 32);
		Static91.method2016(local14.anIntArray209, 32, 32);
		Static67.anIntArray242 = Static106.method2031(Static67.anIntArray242);
		Static91.method2013(0, 0, 32, 32, 0);
		Static106.aBoolean132 = false;
		@Pc(164) int local164 = local38.anInt1289;
		if (arg1 == -1) {
			local164 = (int) ((double) local164 * 1.5D);
		}
		if (arg1 > 0) {
			local164 = (int) ((double) local164 * 1.04D);
		}
		@Pc(191) int local191 = local164 * Class2_Sub1_Sub4_Sub4.anIntArray358[local38.anInt1284] >> 16;
		@Pc(200) int local200 = Class2_Sub1_Sub4_Sub4.anIntArray356[local38.anInt1284] * local164 >> 16;
		local93.method697();
		local93.method699(local38.anInt1300, local38.anInt1295, local38.anInt1284, local38.anInt1303, local38.anInt1290 + local200 + local93.anInt2876 / 2, local38.anInt1290 + local191);
		for (@Pc(229) int local229 = 31; local229 >= 0; local229--) {
			for (local191 = 31; local191 >= 0; local191--) {
				if (local14.anIntArray209[local229 + local191 * 32] == 0) {
					if (local229 > 0 && local14.anIntArray209[local229 + local191 * 32 - 1] > 1) {
						local14.anIntArray209[local191 * 32 + local229] = 1;
					} else if (local191 > 0 && local14.anIntArray209[local229 + (local191 - 1) * 32] > 1) {
						local14.anIntArray209[local191 * 32 + local229] = 1;
					} else if (local229 < 31 && local14.anIntArray209[local229 + local191 * 32 + 1] > 1) {
						local14.anIntArray209[local229 + local191 * 32] = 1;
					} else if (local191 < 31 && local14.anIntArray209[local191 * 32 + local229 + 32] > 1) {
						local14.anIntArray209[local229 + local191 * 32] = 1;
					}
				}
			}
		}
		@Pc(372) int local372;
		if (arg1 > 0) {
			for (local372 = 31; local372 >= 0; local372--) {
				for (local191 = 31; local191 >= 0; local191--) {
					if (local14.anIntArray209[local372 + local191 * 32] == 0) {
						if (local372 > 0 && local14.anIntArray209[local191 * 32 + local372 - 1] == 1) {
							local14.anIntArray209[local372 + local191 * 32] = arg1;
						} else if (local191 > 0 && local14.anIntArray209[local191 * 32 + local372 - 32] == 1) {
							local14.anIntArray209[local372 + local191 * 32] = arg1;
						} else if (local372 < 31 && local14.anIntArray209[local191 * 32 + local372 + 1] == 1) {
							local14.anIntArray209[local372 + local191 * 32] = arg1;
						} else if (local191 < 31 && local14.anIntArray209[local372 + (local191 + 1) * 32] == 1) {
							local14.anIntArray209[local191 * 32 + local372] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (local372 = 31; local372 >= 0; local372--) {
				for (local191 = 31; local191 >= 0; local191--) {
					if (local14.anIntArray209[local372 + local191 * 32] == 0 && local372 > 0 && local191 > 0 && local14.anIntArray209[(local191 - 1) * 32 + local372 - 1] > 0) {
						local14.anIntArray209[local372 + local191 * 32] = 3153952;
					}
				}
			}
		}
		if (local38.anInt1327 != -1) {
			@Pc(581) int local581 = local99.anInt1500;
			local372 = local99.anInt1502;
			local99.anInt1502 = 32;
			local99.anInt1500 = 32;
			local99.method1040(0, 0);
			local99.anInt1502 = local372;
			local99.anInt1500 = local581;
		}
		if (arg1 == 0) {
			Static65.aClass54_21.method1637((long) arg0, local14);
		}
		Static91.method2016(local116, local118, local120);
		Static91.method2014(local127, local131, local129, local133);
		Static106.method2031(local135);
		Static106.anInt2839 = local139;
		Static106.anInt2845 = local137;
		Static106.method2032();
		local14.anInt1500 = arg2;
		Static106.aBoolean132 = true;
		if (local38.aBoolean68) {
			local14.anInt1502 = 33;
		} else {
			local14.anInt1502 = 32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method3() {
		aClass24_1 = null;
		aClass39_1 = null;
		anIntArray1 = null;
		aClass39_4 = null;
		aClass39_2 = null;
		aClass39_5 = null;
		aLongArray1 = null;
		aClass39_3 = null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method4() {
		if (Static14.aString6.toLowerCase().indexOf("microsoft") != -1) {
			Static72.anIntArray257[186] = 57;
			Static72.anIntArray257[187] = 27;
			Static72.anIntArray257[188] = 71;
			Static72.anIntArray257[189] = 26;
			Static72.anIntArray257[190] = 72;
			Static72.anIntArray257[191] = 73;
			Static72.anIntArray257[192] = 58;
			Static72.anIntArray257[219] = 42;
			Static72.anIntArray257[220] = 74;
			Static72.anIntArray257[221] = 43;
			Static72.anIntArray257[222] = 59;
			Static72.anIntArray257[223] = 28;
			return;
		}
		Static72.anIntArray257[44] = 71;
		Static72.anIntArray257[45] = 26;
		Static72.anIntArray257[46] = 72;
		Static72.anIntArray257[47] = 73;
		Static72.anIntArray257[59] = 57;
		Static72.anIntArray257[61] = 27;
		Static72.anIntArray257[91] = 42;
		Static72.anIntArray257[92] = 74;
		Static72.anIntArray257[93] = 43;
		if (Static14.aMethod1 == null) {
			Static72.anIntArray257[192] = 58;
			Static72.anIntArray257[222] = 59;
		} else {
			Static72.anIntArray257[192] = 28;
			Static72.anIntArray257[222] = 58;
			Static72.anIntArray257[520] = 59;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIILclient!c;)V")
	public static void method5(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub4_Sub1 arg3) {
		Static81.aClass51_45.method1970();
		Static51.aClass2_Sub1_Sub4_Sub3_18.method1946(0, 0);
		arg3.method238(Static63.aClass39_809, 55, 28, 16777215, true);
		if (arg2 == 0) {
			arg3.method238(Static23.aClass39_302, 55, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg3.method238(Static12.aClass39_163, 55, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg3.method238(Static28.aClass39_378, 55, 41, 16711680, true);
		}
		if (arg2 == 3) {
			arg3.method238(Static47.aClass39_592, 55, 41, 65535, true);
		}
		arg3.method238(Static44.aClass39_557, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method238(Static23.aClass39_302, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method238(Static12.aClass39_163, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method238(Static28.aClass39_378, 184, 41, 16711680, true);
		}
		arg3.method238(Static86.aClass39_1051, 324, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method238(Static23.aClass39_302, 324, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method238(Static12.aClass39_163, 324, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method238(Static28.aClass39_378, 324, 41, 16711680, true);
		}
		arg3.method238(Static69.aClass39_895, 458, 33, 16777215, true);
		try {
			@Pc(161) Graphics local161 = Static7.aCanvas1.getGraphics();
			Static81.aClass51_45.method1967(0, 453, local161);
		} catch (@Pc(169) Exception local169) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BII)I")
	public static int method6(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) long local7 = (long) ((arg0 << 16) + arg1);
		return Static96.aClass2_Sub1_Sub14_1 != null && Static96.aClass2_Sub1_Sub14_1.aLong82 == local7 ? Static5.aClass2_Sub5_1.anInt1772 * 99 / (Static5.aClass2_Sub5_1.aByteArray16.length - Static96.aClass2_Sub1_Sub14_1.aByte3) + 1 : 0;
	}
}

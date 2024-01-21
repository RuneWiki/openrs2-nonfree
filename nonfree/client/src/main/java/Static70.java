import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public static int anInt1633;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt1629 = 0;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!bc;")
	public static Class8 aClass8_37 = new Class8(64);

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!pe;")
	private static Class65 aClass65_693 = Static119.method1462("Loaded update list");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!pe;")
	public static Class65 aClass65_694 = Static119.method1462("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "Lclient!pe;")
	private static Class65 aClass65_699 = Static119.method1462("green:");

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!pe;")
	public static Class65 aClass65_695 = aClass65_699;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_696 = Static119.method1462("blinken1:");

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_697 = Static119.method1462("<col=c0ff00>");

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_698 = aClass65_693;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public static int anInt1639 = 0;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[I")
	public static int[] anIntArray196 = new int[128];

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!pe;")
	private static Class65 aClass65_702 = Static119.method1462("level)2");

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_700 = aClass65_702;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_701 = aClass65_699;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1231(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)I")
	public static int method1232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1233() {
		try {
			if (Static44.anInt1080 == 1) {
				@Pc(10) int local10 = Static132.aClass2_Sub2_Sub2_2.method803();
				if (local10 > 0 && Static132.aClass2_Sub2_Sub2_2.method811()) {
					local10 -= Static79.anInt1731;
					if (local10 < 0) {
						local10 = 0;
					}
					Static132.aClass2_Sub2_Sub2_2.method802(local10);
					return;
				}
				Static132.aClass2_Sub2_Sub2_2.method793();
				Static132.aClass2_Sub2_Sub2_2.method812();
				Static4.aClass47_3 = null;
				Static3.aClass2_Sub17_1 = null;
				if (Static78.aClass56_26 == null) {
					Static44.anInt1080 = 0;
				} else {
					Static44.anInt1080 = 2;
				}
			}
		} catch (@Pc(54) Exception local54) {
			local54.printStackTrace();
			Static132.aClass2_Sub2_Sub2_2.method793();
			Static78.aClass56_26 = null;
			Static44.anInt1080 = 0;
			Static3.aClass2_Sub17_1 = null;
			Static4.aClass47_3 = null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static38.anIntArrayArray10[local7][local11] = 0;
				Static20.anIntArrayArray1[local7][local11] = 99999999;
			}
		}
		Static38.anIntArrayArray10[arg4][arg8] = 99;
		Static20.anIntArrayArray1[arg4][arg8] = 0;
		local11 = arg4;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = arg8;
		@Pc(57) byte local57 = 0;
		Static30.anIntArray94[0] = arg4;
		@Pc(63) boolean local63 = false;
		@Pc(66) int local66 = local57 + 1;
		Static44.anIntArray124[0] = arg8;
		@Pc(71) int local71 = Static30.anIntArray94.length;
		@Pc(76) int[][] local76 = Static90.aClass46Array1[Static59.anInt1479].anIntArrayArray13;
		@Pc(182) int local182;
		while (local66 != local53) {
			local55 = Static44.anIntArray124[local53];
			local11 = Static30.anIntArray94[local53];
			local53 = (local53 + 1) % local71;
			if (arg9 == local11 && arg0 == local55) {
				local63 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static90.aClass46Array1[Static59.anInt1479].method1110(arg0, local55, arg2, arg7 - 1, local11, arg9)) {
					local63 = true;
					break;
				}
				if (arg7 < 10 && Static90.aClass46Array1[Static59.anInt1479].method1104(local11, arg0, arg7 - 1, local55, arg2, arg9)) {
					local63 = true;
					break;
				}
			}
			if (arg3 != 0 && arg1 != 0 && Static90.aClass46Array1[Static59.anInt1479].method1099(arg1, arg3, arg5, arg0, local55, arg9, local11)) {
				local63 = true;
				break;
			}
			local182 = Static20.anIntArrayArray1[local11][local55] + 1;
			if (local11 > 0 && Static38.anIntArrayArray10[local11 - 1][local55] == 0 && (local76[local11 - 1][local55] & 0x12C0108) == 0) {
				Static30.anIntArray94[local66] = local11 - 1;
				Static44.anIntArray124[local66] = local55;
				local66 = (local66 + 1) % local71;
				Static38.anIntArrayArray10[local11 - 1][local55] = 2;
				Static20.anIntArrayArray1[local11 - 1][local55] = local182;
			}
			if (local11 < 103 && Static38.anIntArrayArray10[local11 + 1][local55] == 0 && (local76[local11 + 1][local55] & 0x12C0180) == 0) {
				Static30.anIntArray94[local66] = local11 + 1;
				Static44.anIntArray124[local66] = local55;
				Static38.anIntArrayArray10[local11 + 1][local55] = 8;
				Static20.anIntArrayArray1[local11 + 1][local55] = local182;
				local66 = (local66 + 1) % local71;
			}
			if (local55 > 0 && Static38.anIntArrayArray10[local11][local55 - 1] == 0 && (local76[local11][local55 - 1] & 0x12C0102) == 0) {
				Static30.anIntArray94[local66] = local11;
				Static44.anIntArray124[local66] = local55 - 1;
				local66 = (local66 + 1) % local71;
				Static38.anIntArrayArray10[local11][local55 - 1] = 1;
				Static20.anIntArrayArray1[local11][local55 - 1] = local182;
			}
			if (local55 < 103 && Static38.anIntArrayArray10[local11][local55 + 1] == 0 && (local76[local11][local55 + 1] & 0x12C0120) == 0) {
				Static30.anIntArray94[local66] = local11;
				Static44.anIntArray124[local66] = local55 + 1;
				local66 = (local66 + 1) % local71;
				Static38.anIntArrayArray10[local11][local55 + 1] = 4;
				Static20.anIntArrayArray1[local11][local55 + 1] = local182;
			}
			if (local11 > 0 && local55 > 0 && Static38.anIntArrayArray10[local11 - 1][local55 - 1] == 0 && (local76[local11 - 1][local55 - 1] & 0x12C010E) == 0 && (local76[local11 - 1][local55] & 0x12C0108) == 0 && (local76[local11][local55 - 1] & 0x12C0102) == 0) {
				Static30.anIntArray94[local66] = local11 - 1;
				Static44.anIntArray124[local66] = local55 - 1;
				local66 = (local66 + 1) % local71;
				Static38.anIntArrayArray10[local11 - 1][local55 - 1] = 3;
				Static20.anIntArrayArray1[local11 - 1][local55 - 1] = local182;
			}
			if (local11 < 103 && local55 > 0 && Static38.anIntArrayArray10[local11 + 1][local55 - 1] == 0 && (local76[local11 + 1][local55 - 1] & 0x12C0183) == 0 && (local76[local11 + 1][local55] & 0x12C0180) == 0 && (local76[local11][local55 - 1] & 0x12C0102) == 0) {
				Static30.anIntArray94[local66] = local11 + 1;
				Static44.anIntArray124[local66] = local55 - 1;
				local66 = (local66 + 1) % local71;
				Static38.anIntArrayArray10[local11 + 1][local55 - 1] = 9;
				Static20.anIntArrayArray1[local11 + 1][local55 - 1] = local182;
			}
			if (local11 > 0 && local55 < 103 && Static38.anIntArrayArray10[local11 - 1][local55 + 1] == 0 && (local76[local11 - 1][local55 + 1] & 0x12C0138) == 0 && (local76[local11 - 1][local55] & 0x12C0108) == 0 && (local76[local11][local55 + 1] & 0x12C0120) == 0) {
				Static30.anIntArray94[local66] = local11 - 1;
				Static44.anIntArray124[local66] = local55 + 1;
				Static38.anIntArrayArray10[local11 - 1][local55 + 1] = 6;
				local66 = (local66 + 1) % local71;
				Static20.anIntArrayArray1[local11 - 1][local55 + 1] = local182;
			}
			if (local11 < 103 && local55 < 103 && Static38.anIntArrayArray10[local11 + 1][local55 + 1] == 0 && (local76[local11 + 1][local55 + 1] & 0x12C01E0) == 0 && (local76[local11 + 1][local55] & 0x12C0180) == 0 && (local76[local11][local55 + 1] & 0x12C0120) == 0) {
				Static30.anIntArray94[local66] = local11 + 1;
				Static44.anIntArray124[local66] = local55 + 1;
				Static38.anIntArrayArray10[local11 + 1][local55 + 1] = 12;
				local66 = (local66 + 1) % local71;
				Static20.anIntArrayArray1[local11 + 1][local55 + 1] = local182;
			}
		}
		Static59.anInt1471 = 0;
		@Pc(793) int local793;
		@Pc(801) int local801;
		@Pc(808) int local808;
		if (!local63) {
			if (!arg10) {
				return false;
			}
			local793 = 100;
			local182 = 1000;
			for (local801 = arg9 - 10; local801 <= arg9 + 10; local801++) {
				for (local808 = arg0 - 10; local808 <= arg0 + 10; local808++) {
					if (local801 >= 0 && local808 >= 0 && local801 < 104 && local808 < 104 && Static20.anIntArrayArray1[local801][local808] < 100) {
						@Pc(833) int local833 = 0;
						@Pc(835) int local835 = 0;
						if (arg9 > local801) {
							local833 = arg9 - local801;
						} else if (arg9 + arg3 - 1 < local801) {
							local833 = local801 + 1 - arg3 - arg9;
						}
						if (local808 < arg0) {
							local835 = arg0 - local808;
						} else if (local808 > arg1 + arg0 - 1) {
							local835 = local808 + 1 - arg1 - arg0;
						}
						@Pc(901) int local901 = local835 * local835 + local833 * local833;
						if (local901 < local182 || local901 == local182 && local793 > Static20.anIntArrayArray1[local801][local808]) {
							local55 = local808;
							local11 = local801;
							local182 = local901;
							local793 = Static20.anIntArrayArray1[local801][local808];
						}
					}
				}
			}
			if (local182 == 1000) {
				return false;
			}
			if (local11 == arg4 && local55 == arg8) {
				return false;
			}
			Static59.anInt1471 = 1;
		}
		@Pc(970) byte local970 = 0;
		Static30.anIntArray94[0] = local11;
		local53 = local970 + 1;
		Static44.anIntArray124[0] = local55;
		local182 = local793 = Static38.anIntArrayArray10[local11][local55];
		while (arg4 != local11 || arg8 != local55) {
			if (local793 != local182) {
				local793 = local182;
				Static30.anIntArray94[local53] = local11;
				Static44.anIntArray124[local53++] = local55;
			}
			if ((local182 & 0x2) != 0) {
				local11++;
			} else if ((local182 & 0x8) != 0) {
				local11--;
			}
			if ((local182 & 0x1) != 0) {
				local55++;
			} else if ((local182 & 0x4) != 0) {
				local55--;
			}
			local182 = Static38.anIntArrayArray10[local11][local55];
		}
		if (local53 > 0) {
			local71 = local53;
			if (local53 > 25) {
				local71 = 25;
			}
			local53--;
			@Pc(1070) int local1070 = Static30.anIntArray94[local53];
			local801 = Static44.anIntArray124[local53];
			if (arg6 == 0) {
				Static49.aClass2_Sub4_Sub1_1.method962(120);
				Static49.aClass2_Sub4_Sub1_1.method926(local71 + local71 + 3);
			}
			if (arg6 == 1) {
				Static49.aClass2_Sub4_Sub1_1.method962(95);
				Static49.aClass2_Sub4_Sub1_1.method926(local71 + local71 + 3 + 14);
			}
			if (arg6 == 2) {
				Static49.aClass2_Sub4_Sub1_1.method962(74);
				Static49.aClass2_Sub4_Sub1_1.method926(local71 + local71 + 3);
			}
			Static49.aClass2_Sub4_Sub1_1.method920(Static66.anInt1577 + local801);
			Static49.aClass2_Sub4_Sub1_1.method900(Static34.anInt791 + local1070);
			Static49.aClass2_Sub4_Sub1_1.method904(Static35.aBooleanArray6[82] ? 1 : 0);
			Static120.anInt2599 = Static44.anIntArray124[0];
			Static72.anInt1648 = Static30.anIntArray94[0];
			for (local808 = 1; local808 < local71; local808++) {
				local53--;
				Static49.aClass2_Sub4_Sub1_1.method926(Static30.anIntArray94[local53] - local1070);
				Static49.aClass2_Sub4_Sub1_1.method904(Static44.anIntArray124[local53] - local801);
			}
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!pe;")
	public static Class65 method1235(@OriginalArg(1) int arg0) {
		return Static83.aClass65Array40[arg0].method1502() <= 0 ? Static83.aClass65Array39[arg0] : Static35.method647(new Class65[] { Static83.aClass65Array39[arg0], Static100.aClass65_960, Static83.aClass65Array40[arg0] });
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1236() {
		aClass65_694 = null;
		aClass65_701 = null;
		aClass65_695 = null;
		aClass65_698 = null;
		aClass65_699 = null;
		aClass65_693 = null;
		aClass65_696 = null;
		aClass8_37 = null;
		anIntArray196 = null;
		aClass65_697 = null;
		aClass65_700 = null;
		aClass65_702 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!la;Lclient!le;IZIIII)V")
	public static void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static48.aBoolean47 && (Static88.aByteArrayArrayArray3[0][arg5][arg3] & 0x2) == 0) {
			if ((Static88.aByteArrayArrayArray3[arg6][arg5][arg3] & 0x10) != 0) {
				return;
			}
			if (Static9.method178(arg3, arg5, arg6) != Static37.anInt812) {
				return;
			}
		}
		if (arg6 < Static14.anInt354) {
			Static14.anInt354 = arg6;
		}
		@Pc(52) Class2_Sub1_Sub15 local52 = Static73.method1248(arg4);
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (arg0 == 1 || arg0 == 3) {
			local65 = local52.anInt2689;
			local68 = local52.anInt2671;
		} else {
			local65 = local52.anInt2671;
			local68 = local52.anInt2689;
		}
		@Pc(96) int local96;
		@Pc(89) int local89;
		if (local65 + arg5 <= 104) {
			local89 = arg5 + (local65 + 1 >> 1);
			local96 = arg5 + (local65 >> 1);
		} else {
			local96 = arg5;
			local89 = arg5 + 1;
		}
		@Pc(108) int[][] local108 = Static67.anIntArrayArrayArray8[arg6];
		@Pc(116) int local116 = (local65 << 6) + (arg5 << 7);
		@Pc(123) int local123;
		@Pc(127) int local127;
		if (local68 + arg3 > 104) {
			local123 = arg3;
			local127 = arg3 + 1;
		} else {
			local127 = arg3 + (local68 + 1 >> 1);
			local123 = (local68 >> 1) + arg3;
		}
		@Pc(171) int local171 = local108[local89][local123] + local108[local96][local123] + local108[local96][local127] + local108[local89][local127] >> 2;
		@Pc(179) int local179 = (arg3 << 7) + (local68 << 6);
		@Pc(185) int local185 = (arg0 << 6) + arg7;
		if (local52.anInt2670 == 1) {
			local185 += 256;
		}
		@Pc(206) int local206 = arg5 + (arg3 << 7) + (arg4 << 14) + 1073741824;
		if (local52.anInt2662 == 0) {
			local206 += Integer.MIN_VALUE;
		}
		if (local52.method1922()) {
			Static119.method1463(arg5, local52, arg0, arg3, arg6);
		}
		@Pc(267) Class2_Sub1_Sub1 local267;
		if (arg7 != 22) {
			@Pc(375) int local375;
			if (arg7 == 10 || arg7 == 11) {
				if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
					local267 = local52.method1921(local116, local108, local171, arg0, 10, local179);
				} else {
					local267 = new Class2_Sub1_Sub1_Sub1(arg4, 10, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
				}
				if (local267 != null && arg2.method1177(arg6, arg5, arg3, local171, local65, local68, local267, arg7 == 11 ? 256 : 0, local206, local185) && local52.aBoolean109) {
					local375 = 15;
					if (local267 instanceof Class2_Sub1_Sub1_Sub7) {
						local375 = ((Class2_Sub1_Sub1_Sub7) local267).method2013() / 4;
						if (local375 > 30) {
							local375 = 30;
						}
					}
					for (@Pc(391) int local391 = 0; local391 <= local65; local391++) {
						for (@Pc(395) int local395 = 0; local395 <= local68; local395++) {
							if (Static106.aByteArrayArrayArray4[arg6][local391 + arg5][arg3 + local395] < local375) {
								Static106.aByteArrayArrayArray4[arg6][arg5 + local391][arg3 + local395] = (byte) local375;
							}
						}
					}
				}
				if (local52.anInt2695 != 0 && arg1 != null) {
					arg1.method1113(local68, local65, arg5, local52.aBoolean114, arg3);
				}
			} else if (arg7 >= 12) {
				if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
					local267 = local52.method1921(local116, local108, local171, arg0, arg7, local179);
				} else {
					local267 = new Class2_Sub1_Sub1_Sub1(arg4, arg7, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
				}
				arg2.method1177(arg6, arg5, arg3, local171, 1, 1, local267, 0, local206, local185);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg6 > 0) {
					Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x924;
				}
				if (local52.anInt2695 != 0 && arg1 != null) {
					arg1.method1113(local68, local65, arg5, local52.aBoolean114, arg3);
				}
			} else if (arg7 == 0) {
				if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
					local267 = local52.method1921(local116, local108, local171, arg0, 0, local179);
				} else {
					local267 = new Class2_Sub1_Sub1_Sub1(arg4, 0, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
				}
				arg2.method1172(arg6, arg5, arg3, local171, local267, null, Static50.anIntArray154[arg0], 0, local206, local185);
				if (arg0 == 0) {
					if (local52.aBoolean109) {
						Static106.aByteArrayArrayArray4[arg6][arg5][arg3] = 50;
						Static106.aByteArrayArrayArray4[arg6][arg5][arg3 + 1] = 50;
					}
					if (local52.aBoolean111) {
						Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local52.aBoolean109) {
						Static106.aByteArrayArrayArray4[arg6][arg5][arg3 + 1] = 50;
						Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean111) {
						Static5.anIntArrayArrayArray1[arg6][arg5][arg3 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local52.aBoolean109) {
						Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3] = 50;
						Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean111) {
						Static5.anIntArrayArrayArray1[arg6][arg5 + 1][arg3] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local52.aBoolean109) {
						Static106.aByteArrayArrayArray4[arg6][arg5][arg3] = 50;
						Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3] = 50;
					}
					if (local52.aBoolean111) {
						Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x492;
					}
				}
				if (local52.anInt2695 != 0 && arg1 != null) {
					arg1.method1106(arg7, arg5, arg0, local52.aBoolean114, arg3);
				}
				if (local52.anInt2666 != 16) {
					arg2.method1195(arg6, arg5, arg3, local52.anInt2666);
				}
			} else if (arg7 == 1) {
				if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
					local267 = local52.method1921(local116, local108, local171, arg0, 1, local179);
				} else {
					local267 = new Class2_Sub1_Sub1_Sub1(arg4, 1, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
				}
				arg2.method1172(arg6, arg5, arg3, local171, local267, null, Static17.anIntArray35[arg0], 0, local206, local185);
				if (local52.aBoolean109) {
					if (arg0 == 0) {
						Static106.aByteArrayArrayArray4[arg6][arg5][arg3 + 1] = 50;
					} else if (arg0 == 1) {
						Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3 + 1] = 50;
					} else if (arg0 == 2) {
						Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3] = 50;
					} else if (arg0 == 3) {
						Static106.aByteArrayArrayArray4[arg6][arg5][arg3] = 50;
					}
				}
				if (local52.anInt2695 != 0 && arg1 != null) {
					arg1.method1106(arg7, arg5, arg0, local52.aBoolean114, arg3);
				}
			} else {
				@Pc(977) int local977;
				@Pc(1015) Class2_Sub1_Sub1 local1015;
				if (arg7 == 2) {
					local977 = arg0 + 1 & 0x3;
					@Pc(1001) Class2_Sub1_Sub1 local1001;
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local1001 = local52.method1921(local116, local108, local171, arg0 + 4, 2, local179);
						local1015 = local52.method1921(local116, local108, local171, local977, 2, local179);
					} else {
						local1001 = new Class2_Sub1_Sub1_Sub1(arg4, 2, arg0 + 4, arg6, arg5, arg3, local52.anInt2692, true, null);
						local1015 = new Class2_Sub1_Sub1_Sub1(arg4, 2, local977, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1172(arg6, arg5, arg3, local171, local1001, local1015, Static50.anIntArray154[arg0], Static50.anIntArray154[local977], local206, local185);
					if (local52.aBoolean111) {
						if (arg0 == 0) {
							Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x249;
							Static5.anIntArrayArrayArray1[arg6][arg5][arg3 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static5.anIntArrayArrayArray1[arg6][arg5][arg3 + 1] |= 0x492;
							Static5.anIntArrayArrayArray1[arg6][arg5 + 1][arg3] |= 0x249;
						} else if (arg0 == 2) {
							Static5.anIntArrayArrayArray1[arg6][arg5 + 1][arg3] |= 0x249;
							Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x492;
						} else if (arg0 == 3) {
							Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x492;
							Static5.anIntArrayArrayArray1[arg6][arg5][arg3] |= 0x249;
						}
					}
					if (local52.anInt2695 != 0 && arg1 != null) {
						arg1.method1106(arg7, arg5, arg0, local52.aBoolean114, arg3);
					}
					if (local52.anInt2666 != 16) {
						arg2.method1195(arg6, arg5, arg3, local52.anInt2666);
					}
				} else if (arg7 == 3) {
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local267 = local52.method1921(local116, local108, local171, arg0, 3, local179);
					} else {
						local267 = new Class2_Sub1_Sub1_Sub1(arg4, 3, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1172(arg6, arg5, arg3, local171, local267, null, Static17.anIntArray35[arg0], 0, local206, local185);
					if (local52.aBoolean109) {
						if (arg0 == 0) {
							Static106.aByteArrayArrayArray4[arg6][arg5][arg3 + 1] = 50;
						} else if (arg0 == 1) {
							Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3 + 1] = 50;
						} else if (arg0 == 2) {
							Static106.aByteArrayArrayArray4[arg6][arg5 + 1][arg3] = 50;
						} else if (arg0 == 3) {
							Static106.aByteArrayArrayArray4[arg6][arg5][arg3] = 50;
						}
					}
					if (local52.anInt2695 != 0 && arg1 != null) {
						arg1.method1106(arg7, arg5, arg0, local52.aBoolean114, arg3);
					}
				} else if (arg7 == 9) {
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local267 = local52.method1921(local116, local108, local171, arg0, arg7, local179);
					} else {
						local267 = new Class2_Sub1_Sub1_Sub1(arg4, arg7, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1177(arg6, arg5, arg3, local171, 1, 1, local267, 0, local206, local185);
					if (local52.anInt2695 != 0 && arg1 != null) {
						arg1.method1113(local68, local65, arg5, local52.aBoolean114, arg3);
					}
					if (local52.anInt2666 != 16) {
						arg2.method1195(arg6, arg5, arg3, local52.anInt2666);
					}
				} else if (arg7 == 4) {
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local267 = local52.method1921(local116, local108, local171, arg0, 4, local179);
					} else {
						local267 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1155(arg6, arg5, arg3, local171, local267, null, Static50.anIntArray154[arg0], 0, 0, 0, local206, local185);
				} else if (arg7 == 5) {
					local375 = arg2.method1175(arg6, arg5, arg3);
					local977 = 16;
					if (local375 != 0) {
						local977 = Static73.method1248(local375 >> 14 & 0x7FFF).anInt2666;
					}
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local1015 = local52.method1921(local116, local108, local171, arg0, 4, local179);
					} else {
						local1015 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1155(arg6, arg5, arg3, local171, local1015, null, Static50.anIntArray154[arg0], 0, Static77.anIntArray225[arg0] * local977, local977 * Static88.anIntArray257[arg0], local206, local185);
				} else if (arg7 == 6) {
					local977 = 8;
					local375 = arg2.method1175(arg6, arg5, arg3);
					if (local375 != 0) {
						local977 = Static73.method1248(local375 >> 14 & 0x7FFF).anInt2666 / 2;
					}
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local1015 = local52.method1921(local116, local108, local171, arg0 + 4, 4, local179);
					} else {
						local1015 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg0 + 4, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1155(arg6, arg5, arg3, local171, local1015, null, 256, arg0, Static134.anIntArray417[arg0] * local977, Static9.anIntArray25[arg0] * local977, local206, local185);
				} else if (arg7 == 7) {
					local375 = arg0 + 2 & 0x3;
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local267 = local52.method1921(local116, local108, local171, local375 + 4, 4, local179);
					} else {
						local267 = new Class2_Sub1_Sub1_Sub1(arg4, 4, local375 + 4, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1155(arg6, arg5, arg3, local171, local267, null, 256, local375, 0, 0, local206, local185);
				} else if (arg7 == 8) {
					local977 = 8;
					local375 = arg2.method1175(arg6, arg5, arg3);
					if (local375 != 0) {
						local977 = Static73.method1248(local375 >> 14 & 0x7FFF).anInt2666 / 2;
					}
					@Pc(1792) int local1792 = arg0 + 2 & 0x3;
					@Pc(1831) Class2_Sub1_Sub1 local1831;
					if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
						local1015 = local52.method1921(local116, local108, local171, arg0 + 4, 4, local179);
						local1831 = local52.method1921(local116, local108, local171, local1792 + 4, 4, local179);
					} else {
						local1015 = new Class2_Sub1_Sub1_Sub1(arg4, 4, arg0 + 4, arg6, arg5, arg3, local52.anInt2692, true, null);
						local1831 = new Class2_Sub1_Sub1_Sub1(arg4, 4, local1792 + 4, arg6, arg5, arg3, local52.anInt2692, true, null);
					}
					arg2.method1155(arg6, arg5, arg3, local171, local1015, local1831, 256, arg0, local977 * Static134.anIntArray417[arg0], local977 * Static9.anIntArray25[arg0], local206, local185);
				}
			}
		} else if (!Static48.aBoolean47 || local52.anInt2662 != 0 || local52.anInt2695 == 1 || local52.aBoolean108) {
			if (local52.anInt2692 == -1 && local52.anIntArray351 == null) {
				local267 = local52.method1921(local116, local108, local171, arg0, 22, local179);
			} else {
				local267 = new Class2_Sub1_Sub1_Sub1(arg4, 22, arg0, arg6, arg5, arg3, local52.anInt2692, true, null);
			}
			arg2.method1160(arg6, arg5, arg3, local171, local267, local206, local185);
			if (local52.anInt2695 == 1 && arg1 != null) {
				arg1.method1112(arg5, arg3);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
	public static int anInt5185;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt5190;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public static int anInt5197;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!al;")
	public static final Class11 aClass11_117 = new Class11(16);

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public static int anInt5198 = -1;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	public static int anInt5199 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = local21 * (Static159.aShort47 - Static224.aShort65) / 100 + Static224.aShort65;
		if (Static176.aShort56 > local46) {
			local46 = Static176.aShort56;
		} else if (Static182.aShort55 < local46) {
			local46 = Static182.aShort55;
		}
		@Pc(72) int local72 = local46 * 512 * arg1 / (arg3 * 334);
		@Pc(110) int local110;
		@Pc(117) int local117;
		@Pc(81) short local81;
		if (Static224.aShort66 > local72) {
			local81 = Static224.aShort66;
			local46 = local81 * arg3 * 334 / (arg1 * 512);
			if (Static182.aShort55 < local46) {
				local46 = Static182.aShort55;
				local110 = local46 * arg1 * 512 / (local81 * 334);
				local117 = (arg3 - local110) / 2;
				if (arg4) {
					Static218.aClass46_5.method5139();
					Static218.aClass46_5.method5108(local117, arg2, arg1, -16777216, arg0);
					Static218.aClass46_5.method5108(local117, arg2 + arg3 - local117, arg1, -16777216, arg0);
				}
				arg3 -= local117 * 2;
				arg2 += local117;
			}
		} else if (Static275.aShort72 < local72) {
			local81 = Static275.aShort72;
			local46 = arg3 * 334 * local81 / (arg1 * 512);
			if (local46 < Static176.aShort56) {
				local46 = Static176.aShort56;
				local110 = arg3 * local81 * 334 / (local46 * 512);
				local117 = (arg1 - local110) / 2;
				if (arg4) {
					Static218.aClass46_5.method5139();
					Static218.aClass46_5.method5108(arg3, arg2, local117, -16777216, arg0);
					Static218.aClass46_5.method5108(arg3, arg2, local117, -16777216, arg0 + arg1 - local117);
				}
				arg1 -= local117 * 2;
				arg0 += local117;
			}
		}
		Static275.anInt5240 = (short) arg3;
		Static61.anInt1458 = arg1 * local46 / 334;
		Static76.anInt1855 = (short) arg1;
		Static210.anInt4219 = arg0;
		Static21.anInt1369 = arg2;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public static void method4629() {
		@Pc(1) Class11 local1 = Static159.aClass11_73;
		synchronized (Static159.aClass11_73) {
			Static159.aClass11_73.method213();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method4630(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 < 128 || arg1 < 128 || arg4 > (Static195.anInt3965 - 2) * 128 || (Static298.anInt5716 - 2) * 128 < arg1) {
			Static316.anIntArray309[0] = Static316.anIntArray309[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static279.method4730(Static219.anInt4400, arg4, arg1) - arg3;
		Static197.aClass51_3.method3561(arg0, 0, 0);
		Static218.aClass46_5.method5144(Static197.aClass51_3);
		Static218.aClass46_5.method5090(arg4, local49, arg1, Static316.anIntArray309);
		Static197.aClass51_3.method3561(-arg0, 0, 0);
		Static218.aClass46_5.method5144(Static197.aClass51_3);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIZLclient!gn;)V")
	public static void method4631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class79 arg4) {
		if (Static58.anInt1401 >= 50 || (arg4 == null || arg4.anIntArrayArray32 == null || arg4.anIntArrayArray32.length <= arg1 || arg4.anIntArrayArray32[arg1] == null)) {
			return;
		}
		@Pc(34) int local34 = arg4.anIntArrayArray32[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg4.anIntArrayArray32[arg1].length > 1) {
			local63 = (int) (Math.random() * (double) arg4.anIntArrayArray32[arg1].length);
			if (local63 > 0) {
				local38 = arg4.anIntArrayArray32[arg1][local63];
			}
		}
		@Pc(76) int local76 = local34 & 0x1F;
		if (local76 == 0) {
			if (arg3) {
				Static64.method1509(local44, 0, 255, local38);
			}
		} else if (Static78.anInt1894 != 0) {
			Static354.anIntArray649[Static58.anInt1401] = local38;
			Static162.anIntArray300[Static58.anInt1401] = local44;
			Static275.anIntArray475[Static58.anInt1401] = 0;
			Static251.aClass91Array2[Static58.anInt1401] = null;
			Static252.anIntArray439[Static58.anInt1401] = 255;
			local63 = (arg2 - 64) / 128;
			@Pc(127) int local127 = (arg0 - 64) / 128;
			Static15.anIntArray544[Static58.anInt1401] = local76 + (local63 << 16) + (local127 << 8);
			Static58.anInt1401++;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lclient!ne;")
	public static Class146 method4632(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static182.aClass146ArrayArray1[local12] == null || Static182.aClass146ArrayArray1[local12][local16] == null) {
			@Pc(32) boolean local32 = Static126.method2624(local12);
			if (!local32) {
				return null;
			}
		}
		return Static182.aClass146ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public static void method4633(@OriginalArg(1) int arg0) {
		@Pc(5) Class11 local5 = Static5.aClass11_95;
		synchronized (Static5.aClass11_95) {
			Static5.aClass11_95.method213();
			Static5.aClass11_95 = new Class11(arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4634(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < Static307.anInt2887; local9++) {
			@Pc(17) Class10_Sub3_Sub3_Sub2 local17 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local9]];
			if (local17 != null && local17.aString224 != null && local17.aString224.equalsIgnoreCase(arg1)) {
				local7 = true;
				if (arg0 == 1) {
					Static164.aClass14_Sub4_Sub2_3.method2557(187);
					Static164.aClass14_Sub4_Sub2_3.method2494(Static213.anIntArray380[local9]);
					Static164.aClass14_Sub4_Sub2_3.method2538(0);
				} else if (arg0 == 4) {
					Static164.aClass14_Sub4_Sub2_3.method2557(42);
					Static164.aClass14_Sub4_Sub2_3.method2509(Static213.anIntArray380[local9]);
					Static164.aClass14_Sub4_Sub2_3.method2538(0);
				} else if (arg0 == 5) {
					Static164.aClass14_Sub4_Sub2_3.method2557(104);
					Static164.aClass14_Sub4_Sub2_3.method2551(0);
					Static164.aClass14_Sub4_Sub2_3.method2524(Static213.anIntArray380[local9]);
				} else if (arg0 == 6) {
					Static164.aClass14_Sub4_Sub2_3.method2557(62);
					Static164.aClass14_Sub4_Sub2_3.method2524(Static213.anIntArray380[local9]);
					Static164.aClass14_Sub4_Sub2_3.method2504(0);
				} else if (arg0 == 7) {
					Static164.aClass14_Sub4_Sub2_3.method2557(68);
					Static164.aClass14_Sub4_Sub2_3.method2535(Static213.anIntArray380[local9]);
					Static164.aClass14_Sub4_Sub2_3.method2504(0);
				}
				break;
			}
		}
		if (!local7) {
			Static276.method4684(Static239.aString234 + arg1);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIZZILclient!jg;II)V")
	public static void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14_Sub4 arg9, @OriginalArg(11) int arg10) {
		if (arg4 == 1) {
			arg8 = 1;
		} else if (arg4 == 2) {
			arg8 = 1;
			arg10 = 1;
		} else if (arg4 == 3) {
			arg10 = 1;
		}
		@Pc(69) int local69;
		if (arg1 < 0 || Static195.anInt3965 <= arg1 || arg0 < 0 || arg0 >= Static298.anInt5716) {
			while (true) {
				local69 = arg9.method2548();
				if (local69 == 0) {
					return;
				}
				if (local69 == 1) {
					arg9.method2548();
					return;
				}
				if (local69 <= 49) {
					arg9.method2548();
				}
			}
			return;
		}
		if (!arg7 && !arg6) {
			Static108.aByteArrayArrayArray5[arg3][arg1][arg0] = 0;
		}
		while (true) {
			local69 = arg9.method2548();
			if (local69 == 0) {
				if (arg7) {
					Static1.anIntArrayArrayArray12[0][arg1 + arg10][arg0 + arg8] = Static18.aClass114Array1[0].method3610(arg10 + arg1, arg8 + arg0);
					return;
				} else if (arg3 == 0) {
					Static1.anIntArrayArrayArray12[0][arg10 + arg1][arg0 + arg8] = -Static244.method4282(arg5 + 932731, arg2 + 556238) * 8;
					return;
				} else {
					Static1.anIntArrayArrayArray12[arg3][arg1 + arg10][arg0 + arg8] = Static1.anIntArrayArrayArray12[arg3 - 1][arg10 + arg1][arg8 + arg0] - 240;
					return;
				}
			}
			if (local69 == 1) {
				@Pc(163) int local163 = arg9.method2548();
				if (!arg7) {
					if (local163 == 1) {
						local163 = 0;
					}
					if (arg3 != 0) {
						Static1.anIntArrayArrayArray12[arg3][arg1 + arg10][arg0 + arg8] = Static1.anIntArrayArrayArray12[arg3 - 1][arg1 + arg10][arg8 + arg0] - local163 * 8;
						return;
					}
					Static1.anIntArrayArrayArray12[0][arg10 + arg1][arg8 + arg0] = -local163 * 8;
					return;
				}
				Static1.anIntArrayArrayArray12[0][arg10 + arg1][arg8 + arg0] = Static18.aClass114Array1[0].method3610(arg1 + arg10, arg0 - -arg8) + local163 * 8;
				return;
			}
			if (local69 <= 49) {
				if (arg6) {
					arg9.method2548();
				} else {
					Static263.aByteArrayArrayArray11[arg3][arg1][arg0] = arg9.method2553();
					Static21.aByteArrayArrayArray4[arg3][arg1][arg0] = (byte) ((local69 - 2) / 4);
					Static300.aByteArrayArrayArray14[arg3][arg1][arg0] = (byte) (local69 + arg4 - 2 & 0x3);
				}
			} else if (local69 <= 81) {
				if (!arg7 && !arg6) {
					Static108.aByteArrayArrayArray5[arg3][arg1][arg0] = (byte) (local69 - 49);
				}
			} else if (!arg6) {
				Static208.aByteArrayArrayArray8[arg3][arg1][arg0] = (byte) (local69 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!jg;)Lclient!rf;")
	public static Class37_Sub4 method4636(@OriginalArg(1) Class14_Sub4 arg0) {
		return new Class37_Sub4(arg0.method2502(), arg0.method2502(), arg0.method2502(), arg0.method2502(), arg0.method2501(), arg0.method2501(), arg0.method2548());
	}
}

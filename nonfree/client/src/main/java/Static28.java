import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array16;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
	public static int anInt894 = 0;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "Lclient!ge;")
	public static Class29 aClass29_8 = new Class29(50);

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lclient!r;")
	public static Class61 aClass61_269 = Static129.method2060("");

	@OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
	public static int anInt901 = 0;

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "Lclient!ef;")
	public static Class20 aClass20_3 = new Class20(8);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Z")
	public static boolean method614(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!r;B)V")
	public static void method615(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(13) Class61 local13 = arg1.method1726().method1701();
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < Static92.anInt2219; local17++) {
			@Pc(27) Class5_Sub2_Sub2_Sub3_Sub2 local27 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local17]];
			if (local27 != null && local27.aClass61_877 != null && local27.aClass61_877.method1709(local13)) {
				Static74.method1193(0, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], local27.anIntArray346[0], local27.anIntArray350[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], 2, false, 1, 0, 1, 0);
				if (arg0 == 1) {
					Static1.aClass5_Sub14_Sub1_1.method1489(213);
					Static1.aClass5_Sub14_Sub1_1.method1481(Static66.anIntArray236[local17]);
				} else if (arg0 == 4) {
					Static1.aClass5_Sub14_Sub1_1.method1489(103);
					Static1.aClass5_Sub14_Sub1_1.method1481(Static66.anIntArray236[local17]);
				} else if (arg0 == 6) {
					Static1.aClass5_Sub14_Sub1_1.method1489(228);
					Static1.aClass5_Sub14_Sub1_1.method1481(Static66.anIntArray236[local17]);
				} else if (arg0 == 7) {
					Static1.aClass5_Sub14_Sub1_1.method1489(107);
					Static1.aClass5_Sub14_Sub1_1.method1448(Static66.anIntArray236[local17]);
				}
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { Static58.aClass61_455, local13 }), 0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
	public static void method616() {
		@Pc(6) int local6 = Static47.aClass5_Sub14_Sub1_2.method1492(8);
		@Pc(23) int local23;
		if (local6 < Static92.anInt2219) {
			for (local23 = local6; local23 < Static92.anInt2219; local23++) {
				Static2.anIntArray1[Static76.anInt1870++] = Static66.anIntArray236[local23];
			}
		}
		if (local6 > Static92.anInt2219) {
			throw new RuntimeException("gppov1");
		}
		Static92.anInt2219 = 0;
		for (local23 = 0; local23 < local6; local23++) {
			@Pc(61) int local61 = Static66.anIntArray236[local23];
			@Pc(65) Class5_Sub2_Sub2_Sub3_Sub2 local65 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local61];
			@Pc(70) int local70 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
			if (local70 == 0) {
				Static66.anIntArray236[Static92.anInt2219++] = local61;
				local65.anInt2900 = Static58.anInt1422;
			} else {
				@Pc(93) int local93 = Static47.aClass5_Sub14_Sub1_2.method1492(2);
				if (local93 == 0) {
					Static66.anIntArray236[Static92.anInt2219++] = local61;
					local65.anInt2900 = Static58.anInt1422;
					Static132.anIntArray445[Static83.anInt2281++] = local61;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static66.anIntArray236[Static92.anInt2219++] = local61;
						local65.anInt2900 = Static58.anInt1422;
						local135 = Static47.aClass5_Sub14_Sub1_2.method1492(3);
						local65.method1859(false, local135);
						local145 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
						if (local145 == 1) {
							Static132.anIntArray445[Static83.anInt2281++] = local61;
						}
					} else if (local93 == 2) {
						Static66.anIntArray236[Static92.anInt2219++] = local61;
						local65.anInt2900 = Static58.anInt1422;
						local135 = Static47.aClass5_Sub14_Sub1_2.method1492(3);
						local65.method1859(true, local135);
						local145 = Static47.aClass5_Sub14_Sub1_2.method1492(3);
						local65.method1859(true, local145);
						@Pc(197) int local197 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
						if (local197 == 1) {
							Static132.anIntArray445[Static83.anInt2281++] = local61;
						}
					} else if (local93 == 3) {
						Static2.anIntArray1[Static76.anInt1870++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!vf;IIILjava/awt/Component;)Lclient!gb;")
	public static Class12 method617(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static78.anInt1981 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class12 local35 = (Class12) Class.forName("Class12_Sub1").getDeclaredConstructor().newInstance();
			local35.anIntArray290 = new int[(Static37.aBoolean28 ? 2 : 1) * 256];
			local35.anInt2303 = arg1;
			local35.method1516(arg3);
			local35.anInt2304 = (arg1 & 0xFFFFFC00) + 1024;
			if (local35.anInt2304 > 16384) {
				local35.anInt2304 = 16384;
			}
			local35.method1513(local35.anInt2304);
			if (Static115.anInt2988 > 0 && Static61.aClass72_1 == null) {
				Static61.aClass72_1 = new Class72();
				Static61.aClass72_1.aClass80_3 = arg0;
				arg0.method2040(Static61.aClass72_1, Static115.anInt2988);
			}
			if (Static61.aClass72_1 != null) {
				if (Static61.aClass72_1.aClass12Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static61.aClass72_1.aClass12Array1[arg2] = local35;
			}
			return local35;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class12_Sub2 local114 = new Class12_Sub2(arg0, arg2);
				local114.anInt2303 = arg1;
				local114.anIntArray290 = new int[(Static37.aBoolean28 ? 2 : 1) * 256];
				local114.method1516(arg3);
				local114.anInt2304 = 16384;
				local114.method1513(local114.anInt2304);
				if (Static115.anInt2988 > 0 && Static61.aClass72_1 == null) {
					Static61.aClass72_1 = new Class72();
					Static61.aClass72_1.aClass80_3 = arg0;
					arg0.method2040(Static61.aClass72_1, Static115.anInt2988);
				}
				if (Static61.aClass72_1 != null) {
					if (Static61.aClass72_1.aClass12Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static61.aClass72_1.aClass12Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(181) Throwable local181) {
				return new Class12();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lclient!sc;IIIII[BIII)V")
	public static void method618(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg1 > 0 && local7 + arg1 < 103 && arg5 + local11 > 0 && local11 + arg5 < 103) {
					arg0[arg8].anIntArrayArray22[arg1 + local7][arg5 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(90) Class5_Sub14 local90 = new Class5_Sub14(arg6);
		for (@Pc(92) int local92 = 0; local92 < 4; local92++) {
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
					if (arg2 == local92 && local96 >= arg7 && local96 < arg7 + 8 && arg4 <= local100 && local100 < arg4 + 8) {
						Static119.method1900(local90, arg3, 0, arg8, arg1 + Static98.method1658(arg3, local96 & 0x7, local100 & 0x7), arg5 + Static110.method1828(local100 & 0x7, arg3, local96 & 0x7), 0);
					} else {
						Static119.method1900(local90, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIII)I")
	public static int method619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static30.aByteArrayArrayArray2[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static30.aByteArrayArrayArray2[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
	public static void method620() {
		aClass61_269 = null;
		aClass5_Sub2_Sub1_Sub3Array16 = null;
		aClass20_3 = null;
		aClass29_8 = null;
	}
}

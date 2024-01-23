import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Lclient!nb;")
	public static Class15 aClass15_38;

	@OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
	public static int anInt4180;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_1098 = Static184.method2923("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_1099 = Static184.method2923("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public static void method2870() {
		Static104.aClass43_10.method1469();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lclient!jj;")
	public static Class51 method2871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1382; local13++) {
			@Pc(19) Class51 local19 = local7.aClass51Array1[local13];
			if ((local19.aLong69 >> 29 & 0x3L) == 2L && local19.anInt2305 == arg1 && local19.anInt2308 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public static void method2872() {
		@Pc(1) Class11 local1 = Static39.aClass11_1;
		synchronized (Static39.aClass11_1) {
			Static168.anInt3891++;
			Static141.anInt3252 = Static42.anInt217;
			Static26.anInt663 = Static206.anInt4608;
			Static212.anInt4711 = Static152.anInt3540;
			Static34.anInt909 = Static143.anInt3268;
			Static200.anInt4491 = Static42.anInt241;
			Static154.anInt3614 = Static124.anInt2949;
			Static34.aLong22 = Static165.aLong121;
			Static143.anInt3268 = 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
	public static void method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(18) int local18;
		@Pc(34) int local34;
		if (Static26.anInt665 == 0 && !Static9.aBoolean16) {
			@Pc(10) int local10 = Static132.anInt3021;
			@Pc(16) int local16 = Static136.anInt3159;
			local18 = Static53.anInt1533;
			@Pc(20) int local20 = Static192.anInt4375;
			local34 = local18 + (local20 - local18) * (arg0 - arg4) / arg2;
			@Pc(47) int local47 = local10 + (local16 - local10) * (arg5 - arg1) / arg3;
			Static85.method1530(local47, Static4.aClass41_36, (short) 10, 0L, Static156.aClass41_981, local34);
		}
		@Pc(61) long local61 = -1L;
		for (local18 = 0; local18 < Static146.anInt3314; local18++) {
			@Pc(69) long local69 = Static26.aLongArray1[local18];
			local34 = (int) local69 & 0x7F;
			@Pc(81) int local81 = (int) local69 >> 7 & 0x7F;
			@Pc(88) int local88 = (int) local69 >> 29 & 0x3;
			@Pc(95) int local95 = Integer.MAX_VALUE & (int) (local69 >>> 32);
			if (local69 != local61) {
				local61 = local69;
				@Pc(185) int local185;
				if (local88 == 2 && Static178.method2848(Static134.anInt3147, local34, local81, local69)) {
					@Pc(120) Class2_Sub2_Sub14 local120 = Static168.method2705(local95);
					if (local120.anIntArray324 != null) {
						local120 = local120.method2120();
					}
					if (local120 == null) {
						continue;
					}
					if (Static26.anInt665 == 1) {
						Static85.method1530(local34, Static33.aClass41_232, (short) 26, local69, Static149.method2324(new Class41[] { Static68.aClass41_561, Static157.aClass41_989, local120.aClass41_852 }), local81);
					} else if (!Static9.aBoolean16) {
						@Pc(175) Class41[] local175 = local120.aClass41Array45;
						if (Static86.aBoolean115) {
							local175 = Static123.method799(local175);
						}
						if (local175 != null) {
							for (local185 = 4; local185 >= 0; local185--) {
								if (local175[local185] != null) {
									@Pc(193) short local193 = 0;
									if (local185 == 0) {
										local193 = 7;
									}
									if (local185 == 1) {
										local193 = 35;
									}
									if (local185 == 2) {
										local193 = 51;
									}
									if (local185 == 3) {
										local193 = 33;
									}
									if (local185 == 4) {
										local193 = 1004;
									}
									Static85.method1530(local34, local175[local185], local193, local69, Static149.method2324(new Class41[] { Static16.aClass41_96, local120.aClass41_852 }), local81);
								}
							}
						}
						Static85.method1530(local34, Static58.aClass41_469, (short) 1005, (long) local120.anInt3075, Static149.method2324(new Class41[] { Static16.aClass41_96, local120.aClass41_852 }), local81);
					} else if ((Static101.anInt2453 & 0x4) == 4) {
						Static85.method1530(local34, Static177.aClass41_1092, (short) 24, local69, Static149.method2324(new Class41[] { Static26.aClass41_174, Static157.aClass41_989, local120.aClass41_852 }), local81);
					}
				}
				@Pc(342) int local342;
				@Pc(350) Class12_Sub3_Sub2 local350;
				@Pc(393) Class12_Sub3_Sub1 local393;
				if (local88 == 1) {
					@Pc(317) Class12_Sub3_Sub2 local317 = Static199.aClass12_Sub3_Sub2Array1[local95];
					if (local317.aClass2_Sub2_Sub12_1.anInt2676 == 1 && (local317.anInt3961 & 0x7F) == 64 && (local317.anInt3949 & 0x7F) == 64) {
						for (local342 = 0; local342 < Static50.anInt2134; local342++) {
							local350 = Static199.aClass12_Sub3_Sub2Array1[Static23.anIntArray47[local342]];
							if (local350 != null && local317 != local350 && local350.aClass2_Sub2_Sub12_1.anInt2676 == 1 && local317.anInt3961 == local350.anInt3961 && local317.anInt3949 == local350.anInt3949) {
								Static199.method3101(local350.aClass2_Sub2_Sub12_1, Static23.anIntArray47[local342], local81, local34);
							}
						}
						for (local185 = 0; local185 < Static50.anInt2126; local185++) {
							local393 = Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local185]];
							if (local393 != null && local317.anInt3961 == local393.anInt3961 && local393.anInt3949 == local317.anInt3949) {
								Static124.method2063(Static156.anIntArray386[local185], local34, local81, local393);
							}
						}
					}
					Static199.method3101(local317.aClass2_Sub2_Sub12_1, local95, local81, local34);
				}
				if (local88 == 0) {
					@Pc(437) Class12_Sub3_Sub1 local437 = Static216.aClass12_Sub3_Sub1Array1[local95];
					if ((local437.anInt3961 & 0x7F) == 64 && (local437.anInt3949 & 0x7F) == 64) {
						for (local342 = 0; local342 < Static50.anInt2134; local342++) {
							local350 = Static199.aClass12_Sub3_Sub2Array1[Static23.anIntArray47[local342]];
							if (local350 != null && local350.aClass2_Sub2_Sub12_1.anInt2676 == 1 && local350.anInt3961 == local437.anInt3961 && local350.anInt3949 == local437.anInt3949) {
								Static199.method3101(local350.aClass2_Sub2_Sub12_1, Static23.anIntArray47[local342], local81, local34);
							}
						}
						for (local185 = 0; local185 < Static50.anInt2126; local185++) {
							local393 = Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local185]];
							if (local393 != null && local393 != local437 && local393.anInt3961 == local437.anInt3961 && local393.anInt3949 == local437.anInt3949) {
								Static124.method2063(Static156.anIntArray386[local185], local34, local81, local393);
							}
						}
					}
					Static124.method2063(local95, local34, local81, local437);
				}
				if (local88 == 3) {
					@Pc(557) Class108 local557 = Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local34][local81];
					if (local557 != null) {
						for (@Pc(564) Class2_Sub2_Sub23 local564 = (Class2_Sub2_Sub23) local557.method3324(); local564 != null; local564 = (Class2_Sub2_Sub23) local557.method3329()) {
							local185 = local564.aClass12_Sub7_1.anInt2384;
							@Pc(574) Class2_Sub2_Sub15 local574 = Static63.method1158(local185);
							if (Static26.anInt665 == 1) {
								Static85.method1530(local34, Static33.aClass41_232, (short) 46, (long) local185, Static149.method2324(new Class41[] { Static68.aClass41_561, Static32.aClass41_222, local574.aClass41_858 }), local81);
							} else if (!Static9.aBoolean16) {
								@Pc(655) Class41[] local655 = local574.aClass41Array46;
								if (Static86.aBoolean115) {
									local655 = Static123.method799(local655);
								}
								for (@Pc(663) int local663 = 4; local663 >= 0; local663--) {
									if (local655 != null && local655[local663] != null) {
										@Pc(677) byte local677 = 0;
										if (local663 == 0) {
											local677 = 5;
										}
										if (local663 == 1) {
											local677 = 22;
										}
										if (local663 == 2) {
											local677 = 41;
										}
										if (local663 == 3) {
											local677 = 57;
										}
										if (local663 == 4) {
											local677 = 3;
										}
										Static85.method1530(local34, local655[local663], local677, (long) local185, Static149.method2324(new Class41[] { Static121.aClass41_1282, local574.aClass41_858 }), local81);
									} else if (local663 == 2) {
										Static85.method1530(local34, Static205.aClass41_1226, (short) 41, (long) local185, Static149.method2324(new Class41[] { Static121.aClass41_1282, local574.aClass41_858 }), local81);
									}
								}
								Static85.method1530(local34, Static58.aClass41_469, (short) 1006, (long) local185, Static149.method2324(new Class41[] { Static121.aClass41_1282, local574.aClass41_858 }), local81);
							} else if ((Static101.anInt2453 & 0x1) == 1) {
								Static85.method1530(local34, Static177.aClass41_1092, (short) 25, (long) local185, Static149.method2324(new Class41[] { Static26.aClass41_174, Static32.aClass41_222, local574.aClass41_858 }), local81);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
	public static void method2874() {
		Static182.aClass43_19.method1469();
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method2876() {
		if (Static162.aString6.toLowerCase().indexOf("microsoft") != -1) {
			Static210.anIntArray485[223] = 28;
			Static210.anIntArray485[222] = 59;
			Static210.anIntArray485[189] = 26;
			Static210.anIntArray485[191] = 73;
			Static210.anIntArray485[190] = 72;
			Static210.anIntArray485[192] = 58;
			Static210.anIntArray485[219] = 42;
			Static210.anIntArray485[221] = 43;
			Static210.anIntArray485[220] = 74;
			Static210.anIntArray485[187] = 27;
			Static210.anIntArray485[188] = 71;
			Static210.anIntArray485[186] = 57;
			return;
		}
		Static210.anIntArray485[46] = 72;
		Static210.anIntArray485[44] = 71;
		Static210.anIntArray485[92] = 74;
		Static210.anIntArray485[59] = 57;
		Static210.anIntArray485[61] = 27;
		if (Static162.aMethod2 == null) {
			Static210.anIntArray485[192] = 58;
			Static210.anIntArray485[222] = 59;
		} else {
			Static210.anIntArray485[520] = 59;
			Static210.anIntArray485[192] = 28;
			Static210.anIntArray485[222] = 58;
		}
		Static210.anIntArray485[47] = 73;
		Static210.anIntArray485[91] = 42;
		Static210.anIntArray485[93] = 43;
		Static210.anIntArray485[45] = 26;
	}
}

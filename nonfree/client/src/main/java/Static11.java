import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_12;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!gi;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!nb;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!id;")
	public static Class43 aClass43_2 = new Class43(64);

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_80 = Static184.method2923("<col=00ff00>");

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public static int anInt385 = 100;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class45 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class45(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static27.aClass2_Sub7ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static27.aClass2_Sub7ArrayArrayArray4[local14][arg1][arg2] = new Class2_Sub7(local14, arg1, arg2);
				}
			}
			Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass45_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class45(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static27.aClass2_Sub7ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static27.aClass2_Sub7ArrayArrayArray4[local14][arg1][arg2] = new Class2_Sub7(local14, arg1, arg2);
				}
			}
			Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass45_1 = local12;
		} else {
			@Pc(134) Class32 local134 = new Class32(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static27.aClass2_Sub7ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static27.aClass2_Sub7ArrayArrayArray4[local14][arg1][arg2] = new Class2_Sub7(local14, arg1, arg2);
				}
			}
			Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2].aClass32_1 = local134;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
	public static boolean method285() {
		try {
			return Static209.method3233();
		} catch (@Pc(14) IOException local14) {
			Static177.method2842();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static211.anInt4701 + "," + Static42.anInt229 + "," + Static77.anInt1991 + " - " + Static202.anInt1733 + "," + (Static213.aClass12_Sub3_Sub1_1.anIntArray412[0] + Static198.anInt4451) + "," + (Static213.aClass12_Sub3_Sub1_1.anIntArray414[0] + Static168.anInt3899) + " - ";
			for (@Pc(61) int local61 = 0; Static202.anInt1733 > local61 && local61 < 50; local61++) {
				local59 = local59 + Static204.aClass2_Sub3_Sub1_3.aByteArray4[local61] + ",";
			}
			Static196.method3064(local59, local19);
			Static101.method1732();
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ea;I)Lclient!gh;")
	public static Class28_Sub1 method286(@OriginalArg(0) Class2_Sub3 arg0) {
		return new Class28_Sub1(arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method166(), arg0.method166(), arg0.method209());
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)V")
	public static void method288(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static131.anInt2996 >= 100 && Static5.anInt277 != 1 || Static131.anInt2996 >= 200) {
			Static198.method3075(Static199.aClass41_1190, 0, Static156.aClass41_981);
			return;
		}
		@Pc(37) Class41 local37 = Static176.method2837(arg0).method1403();
		for (@Pc(39) int local39 = 0; local39 < Static131.anInt2996; local39++) {
			if (Static101.aLongArray7[local39] == arg0) {
				Static198.method3075(Static149.method2324(new Class41[] { local37, Static1.aClass41_1015 }), 0, Static156.aClass41_981);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static60.anInt4785; local70++) {
			if (Static83.aLongArray6[local70] == arg0) {
				Static198.method3075(Static149.method2324(new Class41[] { Static95.aClass41_696, local37, Static200.aClass41_1195 }), 0, Static156.aClass41_981);
				return;
			}
		}
		if (local37.method1386(Static213.aClass12_Sub3_Sub1_1.aClass41_362)) {
			Static198.method3075(Static22.aClass41_136, 0, Static156.aClass41_981);
			return;
		}
		Static21.aClass41Array71[Static131.anInt2996] = local37;
		Static101.aLongArray7[Static131.anInt2996] = arg0;
		Static145.anIntArray341[Static131.anInt2996] = 0;
		Static151.aClass41Array51[Static131.anInt2996] = Static156.aClass41_981;
		Static42.anIntArray11[Static131.anInt2996] = 0;
		Static54.aBooleanArray5[Static131.anInt2996] = false;
		Static18.anInt491 = Static60.anInt4782;
		Static131.anInt2996++;
		Static131.aClass2_Sub3_Sub1_2.method221(82);
		Static131.aClass2_Sub3_Sub1_2.method190(arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!q;B)V")
	public static void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80 arg2) {
		if (arg2.anInt3628 == 1) {
			Static85.method1530(0, arg2.aClass41_984, (short) 11, 0L, Static156.aClass41_981, arg2.anInt3661);
		}
		if (arg2.anInt3628 == 2 && !Static9.aBoolean16) {
			@Pc(43) Class41 local43 = Static171.method2773(arg2);
			if (local43 != null) {
				Static85.method1530(-1, local43, (short) 15, 0L, Static149.method2324(new Class41[] { aClass41_80, arg2.aClass41_983 }), arg2.anInt3661);
			}
		}
		if (arg2.anInt3628 == 3) {
			Static85.method1530(0, Static30.aClass41_205, (short) 14, 0L, Static156.aClass41_981, arg2.anInt3661);
		}
		if (arg2.anInt3628 == 4) {
			Static85.method1530(0, arg2.aClass41_984, (short) 36, 0L, Static156.aClass41_981, arg2.anInt3661);
		}
		if (arg2.anInt3628 == 5) {
			Static85.method1530(0, arg2.aClass41_984, (short) 20, 0L, Static156.aClass41_981, arg2.anInt3661);
		}
		if (arg2.anInt3628 == 6 && Static48.aClass80_5 == null) {
			Static85.method1530(-1, arg2.aClass41_984, (short) 47, 0L, Static156.aClass41_981, arg2.anInt3661);
		}
		@Pc(161) int local161;
		@Pc(155) int local155;
		if (arg2.anInt3640 == 2) {
			local155 = 0;
			for (@Pc(157) int local157 = 0; local157 < arg2.anInt3658; local157++) {
				for (local161 = 0; local161 < arg2.anInt3696; local161++) {
					@Pc(170) int local170 = (arg2.anInt3699 + 32) * local157;
					@Pc(177) int local177 = (arg2.anInt3677 + 32) * local161;
					if (local155 < 20) {
						local170 += arg2.anIntArray382[local155];
						local177 += arg2.anIntArray389[local155];
					}
					if (arg1 >= local177 && arg0 >= local170 && local177 + 32 > arg1 && local170 + 32 > arg0) {
						Static199.aClass80_15 = arg2;
						Static154.anInt3610 = local155;
						if (arg2.anIntArray380[local155] > 0) {
							@Pc(232) Class2_Sub2_Sub15 local232 = Static63.method1158(arg2.anIntArray380[local155] - 1);
							if (Static26.anInt665 == 1 && Static55.method1081(Static70.method1287(arg2))) {
								if (Static185.anInt4248 != arg2.anInt3661 || local155 != Static53.anInt1534) {
									Static85.method1530(local155, Static33.aClass41_232, (short) 42, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static68.aClass41_561, Static32.aClass41_222, local232.aClass41_858 }), arg2.anInt3661);
								}
							} else if (!Static9.aBoolean16 || !Static55.method1081(Static70.method1287(arg2))) {
								@Pc(256) Class41[] local256 = local232.aClass41Array47;
								if (Static86.aBoolean115) {
									local256 = Static123.method799(local256);
								}
								@Pc(270) int local270;
								@Pc(317) byte local317;
								if (Static55.method1081(Static70.method1287(arg2))) {
									for (local270 = 4; local270 >= 3; local270--) {
										if (local256 != null && local256[local270] != null) {
											if (local270 == 3) {
												local317 = 21;
											} else {
												local317 = 18;
											}
											Static85.method1530(local155, local256[local270], local317, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static121.aClass41_1282, local232.aClass41_858 }), arg2.anInt3661);
										} else if (local270 == 4) {
											Static85.method1530(local155, Static196.aClass41_1169, (short) 18, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static121.aClass41_1282, local232.aClass41_858 }), arg2.anInt3661);
										}
									}
								}
								if (Static5.method218(Static70.method1287(arg2))) {
									Static85.method1530(local155, Static33.aClass41_232, (short) 12, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static121.aClass41_1282, local232.aClass41_858 }), arg2.anInt3661);
								}
								if (Static55.method1081(Static70.method1287(arg2)) && local256 != null) {
									for (local270 = 2; local270 >= 0; local270--) {
										if (local256[local270] != null) {
											local317 = 0;
											if (local270 == 0) {
												local317 = 28;
											}
											if (local270 == 1) {
												local317 = 9;
											}
											if (local270 == 2) {
												local317 = 2;
											}
											Static85.method1530(local155, local256[local270], local317, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static121.aClass41_1282, local232.aClass41_858 }), arg2.anInt3661);
										}
									}
								}
								local256 = arg2.aClass41Array56;
								if (Static86.aBoolean115) {
									local256 = Static123.method799(local256);
								}
								if (local256 != null) {
									for (local270 = 4; local270 >= 0; local270--) {
										if (local256[local270] != null) {
											local317 = 0;
											if (local270 == 0) {
												local317 = 6;
											}
											if (local270 == 1) {
												local317 = 8;
											}
											if (local270 == 2) {
												local317 = 49;
											}
											if (local270 == 3) {
												local317 = 44;
											}
											if (local270 == 4) {
												local317 = 13;
											}
											Static85.method1530(local155, local256[local270], local317, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static121.aClass41_1282, local232.aClass41_858 }), arg2.anInt3661);
										}
									}
								}
								Static85.method1530(local155, Static58.aClass41_469, (short) 1001, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static121.aClass41_1282, local232.aClass41_858 }), arg2.anInt3661);
							} else if ((Static101.anInt2453 & 0x10) == 16) {
								Static85.method1530(local155, Static177.aClass41_1092, (short) 39, (long) local232.anInt3100, Static149.method2324(new Class41[] { Static26.aClass41_174, Static32.aClass41_222, local232.aClass41_858 }), arg2.anInt3661);
							}
						}
					}
					local155++;
				}
			}
		}
		if (!arg2.aBoolean215) {
			return;
		}
		if (!Static9.aBoolean16) {
			@Pc(685) Class41 local685;
			for (local155 = 9; local155 >= 5; local155--) {
				local685 = Static197.method3070(arg2, local155);
				if (local685 != null) {
					Static85.method1530(arg2.anInt3649, local685, (short) 1003, (long) (local155 + 1), arg2.aClass41_982, arg2.anInt3661);
				}
			}
			local685 = Static171.method2773(arg2);
			if (local685 != null) {
				Static85.method1530(arg2.anInt3649, local685, (short) 15, 0L, arg2.aClass41_982, arg2.anInt3661);
			}
			for (local161 = 4; local161 >= 0; local161--) {
				@Pc(739) Class41 local739 = Static197.method3070(arg2, local161);
				if (local739 != null) {
					Static85.method1530(arg2.anInt3649, local739, (short) 43, (long) (local161 + 1), arg2.aClass41_982, arg2.anInt3661);
				}
			}
			if (Static203.method3139(Static70.method1287(arg2))) {
				Static85.method1530(arg2.anInt3649, Static167.aClass41_1035, (short) 47, 0L, Static156.aClass41_981, arg2.anInt3661);
				return;
			}
			return;
		}
		if (Static28.method539(Static70.method1287(arg2)) && (Static101.anInt2453 & 0x20) == 32) {
			Static85.method1530(arg2.anInt3649, Static177.aClass41_1092, (short) 40, 0L, Static149.method2324(new Class41[] { Static26.aClass41_174, Static220.aClass41_1291, arg2.aClass41_982 }), arg2.anInt3661);
			return;
		}
	}
}

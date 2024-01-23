import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static int anInt1844;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!nc;III)V")
	public static void method1609(@OriginalArg(1) Class10_Sub5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static136.aClass10_Sub5_Sub1_1 == arg0 || Static152.anInt2876 >= 400) {
			return;
		}
		@Pc(43) String local43;
		if (arg0.anInt3566 == 0) {
			@Pc(47) boolean local47 = true;
			if (Static136.aClass10_Sub5_Sub1_1.anInt3570 != -1 && arg0.anInt3570 != -1) {
				@Pc(71) int local71 = arg0.anInt3590 < Static136.aClass10_Sub5_Sub1_1.anInt3590 ? Static136.aClass10_Sub5_Sub1_1.anInt3590 : arg0.anInt3590;
				@Pc(82) int local82 = arg0.anInt3570 > Static136.aClass10_Sub5_Sub1_1.anInt3570 ? Static136.aClass10_Sub5_Sub1_1.anInt3570 : arg0.anInt3570;
				@Pc(92) int local92 = local82 + local71 * 10 / 100 + 5;
				@Pc(99) int local99 = Static136.aClass10_Sub5_Sub1_1.anInt3590 - arg0.anInt3590;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > local92) {
					local47 = false;
				}
			}
			@Pc(123) String local123 = Static47.anInt5990 == 1 ? Static148.aString102 : Static3.aString3;
			if (arg0.anInt3583 > arg0.anInt3590) {
				local43 = arg0.method3045() + (local47 ? Static82.method1264(Static136.aClass10_Sub5_Sub1_1.anInt3590, arg0.anInt3590) : "<col=ffffff>") + " (" + local123 + arg0.anInt3590 + "+" + (arg0.anInt3583 - arg0.anInt3590) + ")";
			} else {
				local43 = arg0.method3045() + (local47 ? Static82.method1264(Static136.aClass10_Sub5_Sub1_1.anInt3590, arg0.anInt3590) : "<col=ffffff>") + " (" + local123 + arg0.anInt3590 + ")";
			}
		} else {
			local43 = arg0.method3045() + " (" + Static136.aString97 + arg0.anInt3566 + ")";
		}
		@Pc(213) int local213;
		if (Static153.anInt2895 == 1) {
			Static167.method2784((short) 22, Static246.aString173 + " -> <col=ffffff>" + local43, arg1, Static270.anInt5516, Static149.aString103, (long) arg3, arg2);
		} else if (!Static39.aBoolean56) {
			for (local213 = 7; local213 >= 0; local213--) {
				if (Static276.aStringArray38[local213] != null) {
					@Pc(230) short local230 = 0;
					if (Static47.anInt5990 == 0 && Static276.aStringArray38[local213].equalsIgnoreCase(Static108.aString79)) {
						if (arg0.anInt3590 > Static136.aClass10_Sub5_Sub1_1.anInt3590) {
							local230 = 2000;
						}
						if (Static136.aClass10_Sub5_Sub1_1.anInt3568 != 0 && arg0.anInt3568 != 0) {
							if (Static136.aClass10_Sub5_Sub1_1.anInt3568 == arg0.anInt3568) {
								local230 = 2000;
							} else {
								local230 = 0;
							}
						}
					} else if (Static281.aBooleanArray112[local213]) {
						local230 = 2000;
					}
					@Pc(291) short local291 = Static233.aShortArray83[local213];
					@Pc(296) short local296 = (short) (local291 + local230);
					Static167.method2784(local296, "<col=ffffff>" + local43, arg1, Static109.anIntArray339[local213], Static276.aStringArray38[local213], (long) arg3, arg2);
				}
			}
		} else if ((Static75.anInt1408 & 0x8) != 0) {
			Static167.method2784((short) 14, Static286.aString205 + " -> <col=ffffff>" + local43, arg1, Static269.anInt5498, Static26.aString14, (long) arg3, arg2);
		}
		for (local213 = 0; local213 < Static152.anInt2876; local213++) {
			if (Static259.aShortArray87[local213] == 49) {
				Static103.aStringArray19[local213] = "<col=ffffff>" + local43;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!vd;)V")
	public static void method1610(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4_Sub22 arg1) {
		Static253.anInt5223 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(16) int[] local16 = arg1.anIntArray601;
		@Pc(19) int[] local19 = arg1.anIntArray602;
		@Pc(21) byte local21 = -1;
		@Pc(629) int local629;
		try {
			@Pc(23) int local23 = 0;
			label4566: while (true) {
				local23++;
				if (local23 > arg0) {
					throw new RuntimeException("slow");
				}
				local13++;
				@Pc(37) int local37 = local16[local13];
				@Pc(634) int local634;
				@Pc(469) int local469;
				@Pc(425) String local425;
				if (local37 < 100) {
					if (local37 == 0) {
						Static73.anIntArray136[local9++] = local19[local13];
						continue;
					}
					@Pc(64) int local64;
					if (local37 == 1) {
						local64 = local19[local13];
						Static73.anIntArray136[local9++] = Static161.anIntArray347[local64];
						continue;
					}
					if (local37 == 2) {
						local64 = local19[local13];
						local9--;
						Static247.method4162(local64, Static73.anIntArray136[local9]);
						continue;
					}
					if (local37 == 3) {
						Static28.aStringArray6[local11++] = arg1.aStringArray39[local13];
						continue;
					}
					if (local37 == 6) {
						local13 += local19[local13];
						continue;
					}
					if (local37 == 7) {
						local9 -= 2;
						if (Static73.anIntArray136[local9] != Static73.anIntArray136[local9 + 1]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local37 == 8) {
						local9 -= 2;
						if (Static73.anIntArray136[local9] == Static73.anIntArray136[local9 + 1]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local37 == 9) {
						local9 -= 2;
						if (Static73.anIntArray136[local9 + 1] > Static73.anIntArray136[local9]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local37 == 10) {
						local9 -= 2;
						if (Static73.anIntArray136[local9] > Static73.anIntArray136[local9 + 1]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local37 == 21) {
						if (Static253.anInt5223 == 0) {
							return;
						}
						@Pc(241) Class28 local241 = Static272.aClass28Array3[--Static253.anInt5223];
						Static309.anIntArray628 = local241.anIntArray59;
						Static309.aStringArray43 = local241.aStringArray9;
						arg1 = local241.aClass3_Sub4_Sub22_1;
						local13 = local241.anInt674;
						local16 = arg1.anIntArray601;
						local19 = arg1.anIntArray602;
						continue;
					}
					if (local37 == 25) {
						local64 = local19[local13];
						Static73.anIntArray136[local9++] = Static293.method4801(local64);
						continue;
					}
					if (local37 == 27) {
						local64 = local19[local13];
						local9--;
						Static315.method5008(local64, Static73.anIntArray136[local9]);
						continue;
					}
					if (local37 == 31) {
						local9 -= 2;
						if (Static73.anIntArray136[local9 + 1] >= Static73.anIntArray136[local9]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local37 == 32) {
						local9 -= 2;
						if (Static73.anIntArray136[local9] >= Static73.anIntArray136[local9 + 1]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local37 == 33) {
						Static73.anIntArray136[local9++] = Static309.anIntArray628[local19[local13]];
						continue;
					}
					@Pc(368) int local368;
					if (local37 == 34) {
						local368 = local19[local13];
						local9--;
						Static309.anIntArray628[local368] = Static73.anIntArray136[local9];
						continue;
					}
					if (local37 == 35) {
						Static28.aStringArray6[local11++] = Static309.aStringArray43[local19[local13]];
						continue;
					}
					if (local37 == 36) {
						local368 = local19[local13];
						local11--;
						Static309.aStringArray43[local368] = Static28.aStringArray6[local11];
						continue;
					}
					if (local37 == 37) {
						local64 = local19[local13];
						local11 -= local64;
						local425 = Static76.method1201(Static28.aStringArray6, local11, local64);
						Static28.aStringArray6[local11++] = local425;
						continue;
					}
					if (local37 == 38) {
						local9--;
						continue;
					}
					if (local37 == 39) {
						local11--;
						continue;
					}
					if (local37 == 40) {
						local64 = local19[local13];
						@Pc(459) Class3_Sub4_Sub22 local459 = Static105.method1684(local64);
						@Pc(463) int[] local463 = new int[local459.anInt5807];
						@Pc(467) String[] local467 = new String[local459.anInt5812];
						for (local469 = 0; local469 < local459.anInt5808; local469++) {
							local463[local469] = Static73.anIntArray136[local9 + local469 - local459.anInt5808];
						}
						for (local469 = 0; local469 < local459.anInt5815; local469++) {
							local467[local469] = Static28.aStringArray6[local469 + local11 - local459.anInt5815];
						}
						local9 -= local459.anInt5808;
						local11 -= local459.anInt5815;
						@Pc(527) Class28 local527 = new Class28();
						local527.anInt674 = local13;
						local527.anIntArray59 = Static309.anIntArray628;
						local527.aStringArray9 = Static309.aStringArray43;
						local527.aClass3_Sub4_Sub22_1 = arg1;
						if (Static253.anInt5223 >= Static272.aClass28Array3.length) {
							throw new RuntimeException();
						}
						local13 = -1;
						arg1 = local459;
						Static272.aClass28Array3[Static253.anInt5223++] = local527;
						Static309.anIntArray628 = local463;
						local16 = local459.anIntArray601;
						local19 = local459.anIntArray602;
						Static309.aStringArray43 = local467;
						continue;
					}
					if (local37 == 42) {
						Static73.anIntArray136[local9++] = Static173.anIntArray396[local19[local13]];
						continue;
					}
					if (local37 == 43) {
						local64 = local19[local13];
						local9--;
						Static173.anIntArray396[local64] = Static73.anIntArray136[local9];
						Static49.method782(local64);
						continue;
					}
					if (local37 == 44) {
						local64 = local19[local13] >> 16;
						local629 = local19[local13] & 0xFFFF;
						local9--;
						local634 = Static73.anIntArray136[local9];
						if (local634 >= 0 && local634 <= 5000) {
							Static158.anIntArray340[local64] = local634;
							@Pc(652) byte local652 = -1;
							if (local629 == 105) {
								local652 = 0;
							}
							local469 = 0;
							while (true) {
								if (local634 <= local469) {
									continue label4566;
								}
								Static259.anIntArrayArray71[local64][local469] = local652;
								local469++;
							}
						}
						throw new RuntimeException();
					}
					if (local37 == 45) {
						local64 = local19[local13];
						local9--;
						local629 = Static73.anIntArray136[local9];
						if (local629 >= 0 && Static158.anIntArray340[local64] > local629) {
							Static73.anIntArray136[local9++] = Static259.anIntArrayArray71[local64][local629];
							continue;
						}
						throw new RuntimeException();
					}
					if (local37 == 46) {
						local9 -= 2;
						local629 = Static73.anIntArray136[local9];
						local64 = local19[local13];
						if (local629 >= 0 && local629 < Static158.anIntArray340[local64]) {
							Static259.anIntArrayArray71[local64][local629] = Static73.anIntArray136[local9 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local37 == 47) {
						@Pc(766) String local766 = Static22.aStringArray4[local19[local13]];
						if (local766 == null) {
							local766 = "null";
						}
						Static28.aStringArray6[local11++] = local766;
						continue;
					}
					if (local37 == 48) {
						local64 = local19[local13];
						local11--;
						Static22.aStringArray4[local64] = Static28.aStringArray6[local11];
						Static209.method4936(local64);
						continue;
					}
					if (local37 == 51) {
						@Pc(811) Class30 local811 = arg1.aClass30Array1[local19[local13]];
						local9--;
						@Pc(821) Class3_Sub8 local821 = (Class3_Sub8) local811.method663((long) Static73.anIntArray136[local9]);
						if (local821 != null) {
							local13 += local821.anInt1237;
						}
						continue;
					}
				}
				@Pc(841) boolean local841;
				if (local19[local13] == 1) {
					local841 = true;
				} else {
					local841 = false;
				}
				@Pc(907) int local907;
				@Pc(1002) Class151 local1002;
				@Pc(873) int local873;
				@Pc(883) Class151 local883;
				@Pc(1076) Class151 local1076;
				if (local37 < 300) {
					if (local37 == 100) {
						local9 -= 3;
						local634 = Static73.anIntArray136[local9 + 1];
						local629 = Static73.anIntArray136[local9];
						local873 = Static73.anIntArray136[local9 + 2];
						if (local634 == 0) {
							throw new RuntimeException();
						}
						local883 = Static243.method4115(local629);
						if (local883.aClass151Array2 == null) {
							local883.aClass151Array2 = new Class151[local873 + 1];
						}
						if (local883.aClass151Array2.length <= local873) {
							@Pc(905) Class151[] local905 = new Class151[local873 + 1];
							for (local907 = 0; local907 < local883.aClass151Array2.length; local907++) {
								local905[local907] = local883.aClass151Array2[local907];
							}
							local883.aClass151Array2 = local905;
						}
						if (local873 > 0 && local883.aClass151Array2[local873 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local873 - 1));
						}
						@Pc(957) Class151 local957 = new Class151();
						local957.anInt4721 = local634;
						local957.anInt4727 = local957.anInt4800 = local883.anInt4800;
						local957.anInt4776 = local873;
						local957.aBoolean328 = true;
						local883.aClass151Array2[local873] = local957;
						if (local841) {
							Static88.aClass151_2 = local957;
						} else {
							Static90.aClass151_3 = local957;
						}
						Static134.method3639(local883);
						continue;
					}
					@Pc(1024) Class151 local1024;
					if (local37 == 101) {
						local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
						if (local1002.anInt4776 == -1) {
							if (!local841) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1024 = Static243.method4115(local1002.anInt4800);
						local1024.aClass151Array2[local1002.anInt4776] = null;
						Static134.method3639(local1024);
						continue;
					}
					if (local37 == 102) {
						local9--;
						local1002 = Static243.method4115(Static73.anIntArray136[local9]);
						local1002.aClass151Array2 = null;
						Static134.method3639(local1002);
						continue;
					}
					if (local37 == 200) {
						local9 -= 2;
						local634 = Static73.anIntArray136[local9 + 1];
						local629 = Static73.anIntArray136[local9];
						local1076 = Static114.method5019(local634, local629);
						if (local1076 != null && local634 != -1) {
							Static73.anIntArray136[local9++] = 1;
							if (local841) {
								Static88.aClass151_2 = local1076;
							} else {
								Static90.aClass151_3 = local1076;
							}
							continue;
						}
						Static73.anIntArray136[local9++] = 0;
						continue;
					}
					if (local37 == 201) {
						local9--;
						local629 = Static73.anIntArray136[local9];
						local1024 = Static243.method4115(local629);
						if (local1024 == null) {
							Static73.anIntArray136[local9++] = 0;
						} else {
							Static73.anIntArray136[local9++] = 1;
							if (local841) {
								Static88.aClass151_2 = local1024;
							} else {
								Static90.aClass151_3 = local1024;
							}
						}
						continue;
					}
				} else {
					@Pc(4293) boolean local4293;
					if (local37 < 500) {
						if (local37 == 403) {
							local9 -= 2;
							local629 = Static73.anIntArray136[local9];
							local634 = Static73.anIntArray136[local9 + 1];
							for (local873 = 0; local873 < Static147.anIntArray325.length; local873++) {
								if (Static147.anIntArray325[local873] == local629) {
									Static136.aClass10_Sub5_Sub1_1.aClass131_2.method3356(local634, local873);
									continue label4566;
								}
							}
							local873 = 0;
							while (true) {
								if (local873 >= Static26.anIntArray45.length) {
									continue label4566;
								}
								if (Static26.anIntArray45[local873] == local629) {
									Static136.aClass10_Sub5_Sub1_1.aClass131_2.method3356(local634, local873);
									continue label4566;
								}
								local873++;
							}
						}
						if (local37 == 404) {
							local9 -= 2;
							local629 = Static73.anIntArray136[local9];
							local634 = Static73.anIntArray136[local9 + 1];
							Static136.aClass10_Sub5_Sub1_1.aClass131_2.method3350(local629, local634);
							continue;
						}
						if (local37 == 410) {
							local9--;
							local4293 = Static73.anIntArray136[local9] != 0;
							Static136.aClass10_Sub5_Sub1_1.aClass131_2.method3353(local4293);
							continue;
						}
					} else {
						@Pc(4957) boolean local4957;
						if (local37 >= 1000 && local37 < 1100 || local37 >= 2000 && local37 < 2100) {
							if (local37 < 2000) {
								local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
							} else {
								local37 -= 1000;
								local9--;
								local1002 = Static243.method4115(Static73.anIntArray136[local9]);
							}
							if (local37 == 1000) {
								local9 -= 4;
								local1002.anInt4738 = Static73.anIntArray136[local9];
								local1002.anInt4753 = Static73.anIntArray136[local9 + 1];
								local634 = Static73.anIntArray136[local9 + 2];
								local873 = Static73.anIntArray136[local9 + 3];
								if (local634 < 0) {
									local634 = 0;
								} else if (local634 > 5) {
									local634 = 5;
								}
								if (local873 < 0) {
									local873 = 0;
								} else if (local873 > 5) {
									local873 = 5;
								}
								local1002.aByte28 = (byte) local873;
								local1002.aByte25 = (byte) local634;
								Static134.method3639(local1002);
								Static146.method4805(local1002);
								if (local1002.anInt4776 == -1) {
									Static306.method4922(local1002.anInt4800);
								}
								continue;
							}
							if (local37 == 1001) {
								local9 -= 4;
								local1002.anInt4761 = Static73.anIntArray136[local9];
								local1002.anInt4792 = Static73.anIntArray136[local9 + 1];
								local1002.anInt4735 = 0;
								local1002.anInt4807 = 0;
								local634 = Static73.anIntArray136[local9 + 2];
								if (local634 < 0) {
									local634 = 0;
								} else if (local634 > 4) {
									local634 = 4;
								}
								local873 = Static73.anIntArray136[local9 + 3];
								local1002.aByte26 = (byte) local634;
								if (local873 < 0) {
									local873 = 0;
								} else if (local873 > 4) {
									local873 = 4;
								}
								local1002.aByte27 = (byte) local873;
								Static134.method3639(local1002);
								Static146.method4805(local1002);
								if (local1002.anInt4721 == 0) {
									Static282.method4617(local1002, false);
								}
								continue;
							}
							if (local37 == 1003) {
								local9--;
								local4957 = Static73.anIntArray136[local9] == 1;
								if (local1002.aBoolean334 != local4957) {
									local1002.aBoolean334 = local4957;
									Static134.method3639(local1002);
								}
								if (local1002.anInt4776 == -1) {
									Static231.method3787(local1002.anInt4800);
								}
								continue;
							}
							if (local37 == 1004) {
								local9 -= 2;
								local1002.anInt4789 = Static73.anIntArray136[local9];
								local1002.anInt4759 = Static73.anIntArray136[local9 + 1];
								Static134.method3639(local1002);
								Static146.method4805(local1002);
								if (local1002.anInt4721 == 0) {
									Static282.method4617(local1002, false);
								}
								continue;
							}
							if (local37 == 1005) {
								local9--;
								local1002.aBoolean327 = Static73.anIntArray136[local9] == 1;
								continue;
							}
						} else {
							@Pc(2582) String local2582;
							if (local37 >= 1100 && local37 < 1200 || !(local37 < 2100 || local37 >= 2200)) {
								if (local37 < 2000) {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
								} else {
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									local37 -= 1000;
								}
								if (local37 == 1100) {
									local9 -= 2;
									local1002.anInt4757 = Static73.anIntArray136[local9];
									if (local1002.anInt4757 > local1002.anInt4720 - local1002.anInt4773) {
										local1002.anInt4757 = local1002.anInt4720 - local1002.anInt4773;
									}
									if (local1002.anInt4757 < 0) {
										local1002.anInt4757 = 0;
									}
									local1002.anInt4747 = Static73.anIntArray136[local9 + 1];
									if (local1002.anInt4713 - local1002.anInt4751 < local1002.anInt4747) {
										local1002.anInt4747 = local1002.anInt4713 - local1002.anInt4751;
									}
									if (local1002.anInt4747 < 0) {
										local1002.anInt4747 = 0;
									}
									Static134.method3639(local1002);
									if (local1002.anInt4776 == -1) {
										Static151.method2561(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1101) {
									local9--;
									local1002.anInt4719 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									if (local1002.anInt4776 == -1) {
										Static302.method4883(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1102) {
									local9--;
									local1002.aBoolean330 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1103) {
									local9--;
									local1002.anInt4758 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1104) {
									local9--;
									local1002.anInt4726 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1105) {
									local9--;
									local634 = Static73.anIntArray136[local9];
									if (local634 != local1002.anInt4772) {
										local1002.anInt4772 = local634;
										Static134.method3639(local1002);
									}
									if (local1002.anInt4776 == -1) {
										Static210.method3474(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1106) {
									local9--;
									local1002.anInt4743 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1107) {
									local9--;
									local1002.aBoolean333 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1108) {
									local1002.anInt4737 = 1;
									local9--;
									local1002.anInt4806 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									if (local1002.anInt4776 == -1) {
										Static156.method2603(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1109) {
									local9 -= 6;
									local1002.anInt4725 = Static73.anIntArray136[local9];
									local1002.anInt4732 = Static73.anIntArray136[local9 + 1];
									local1002.anInt4729 = Static73.anIntArray136[local9 + 2];
									local1002.anInt4801 = Static73.anIntArray136[local9 + 3];
									local1002.anInt4777 = Static73.anIntArray136[local9 + 4];
									local1002.anInt4724 = Static73.anIntArray136[local9 + 5];
									Static134.method3639(local1002);
									if (local1002.anInt4776 == -1) {
										Static239.method4068(local1002.anInt4800);
										Static161.method2656(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1110) {
									local9--;
									local634 = Static73.anIntArray136[local9];
									if (local1002.anInt4805 != local634) {
										local1002.anInt4768 = 1;
										local1002.anInt4805 = local634;
										local1002.anInt4765 = 0;
										local1002.anInt4736 = 0;
										Static134.method3639(local1002);
									}
									if (local1002.anInt4776 == -1) {
										Static144.method4034(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1111) {
									local9--;
									local1002.aBoolean323 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1112) {
									local11--;
									local2582 = Static28.aStringArray6[local11];
									if (!local2582.equals(local1002.aString163)) {
										local1002.aString163 = local2582;
										Static134.method3639(local1002);
									}
									if (local1002.anInt4776 == -1) {
										Static10.method154(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1113) {
									local9--;
									local1002.anInt4774 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1114) {
									local9 -= 3;
									local1002.anInt4802 = Static73.anIntArray136[local9];
									local1002.anInt4785 = Static73.anIntArray136[local9 + 1];
									local1002.anInt4766 = Static73.anIntArray136[local9 + 2];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1115) {
									local9--;
									local1002.aBoolean321 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1116) {
									local9--;
									local1002.anInt4784 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1117) {
									local9--;
									local1002.anInt4793 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1118) {
									local9--;
									local1002.aBoolean331 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1119) {
									local9--;
									local1002.aBoolean325 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1120) {
									local9 -= 2;
									local1002.anInt4720 = Static73.anIntArray136[local9];
									local1002.anInt4713 = Static73.anIntArray136[local9 + 1];
									Static134.method3639(local1002);
									if (local1002.anInt4721 == 0) {
										Static282.method4617(local1002, false);
									}
									continue;
								}
								if (local37 == 1121) {
									local9 -= 2;
									local1002.aShort38 = (short) Static73.anIntArray136[local9];
									local1002.aShort39 = (short) Static73.anIntArray136[local9 + 1];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1122) {
									local9--;
									local1002.aBoolean322 = Static73.anIntArray136[local9] == 1;
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1123) {
									local9--;
									local1002.anInt4724 = Static73.anIntArray136[local9];
									Static134.method3639(local1002);
									if (local1002.anInt4776 == -1) {
										Static239.method4068(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1124) {
									local9--;
									local634 = Static73.anIntArray136[local9];
									local1002.aBoolean337 = local634 == 1;
									Static134.method3639(local1002);
									continue;
								}
							} else if (local37 >= 1200 && local37 < 1300 || local37 >= 2200 && local37 < 2300) {
								if (local37 >= 2000) {
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									local37 -= 1000;
								} else {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
								}
								Static134.method3639(local1002);
								if (local37 == 1200 || local37 == 1205 || local37 == 1208 || local37 == 1209) {
									local9 -= 2;
									local634 = Static73.anIntArray136[local9];
									local873 = Static73.anIntArray136[local9 + 1];
									if (local1002.anInt4776 == -1) {
										Static44.method666(local1002.anInt4800);
										Static239.method4068(local1002.anInt4800);
										Static161.method2656(local1002.anInt4800);
									}
									if (local634 == -1) {
										local1002.anInt4786 = -1;
										local1002.anInt4806 = -1;
										local1002.anInt4737 = 1;
										continue;
									}
									if (local37 == 1208 || local37 == 1209) {
										local1002.aBoolean324 = true;
									} else {
										local1002.aBoolean324 = false;
									}
									local1002.anInt4786 = local634;
									local1002.anInt4796 = local873;
									@Pc(13890) Class21 local13890 = Static133.method2309(local634);
									local1002.anInt4732 = local13890.anInt497;
									local1002.anInt4777 = local13890.anInt533;
									local1002.anInt4801 = local13890.anInt549;
									local1002.anInt4725 = local13890.anInt499;
									local1002.anInt4729 = local13890.anInt528;
									if (local37 == 1205) {
										local1002.aBoolean326 = false;
									} else {
										local1002.aBoolean326 = true;
									}
									local1002.anInt4724 = local13890.anInt503;
									if (local1002.anInt4807 > 0) {
										local1002.anInt4724 = local1002.anInt4724 * 32 / local1002.anInt4807;
									} else if (local1002.anInt4761 > 0) {
										local1002.anInt4724 = local1002.anInt4724 * 32 / local1002.anInt4761;
									}
									continue;
								}
								if (local37 == 1201) {
									local1002.anInt4737 = 2;
									local9--;
									local1002.anInt4806 = Static73.anIntArray136[local9];
									if (local1002.anInt4776 == -1) {
										Static156.method2603(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1202) {
									local1002.anInt4737 = 3;
									local1002.anInt4806 = Static136.aClass10_Sub5_Sub1_1.aClass131_2.method3354();
									if (local1002.anInt4776 == -1) {
										Static156.method2603(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1203) {
									local1002.anInt4737 = 6;
									local9--;
									local1002.anInt4806 = Static73.anIntArray136[local9];
									if (local1002.anInt4776 == -1) {
										Static156.method2603(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1204) {
									local1002.anInt4737 = 5;
									local9--;
									local1002.anInt4806 = Static73.anIntArray136[local9];
									if (local1002.anInt4776 == -1) {
										Static156.method2603(local1002.anInt4800);
									}
									continue;
								}
								if (local37 == 1206) {
									local9 -= 4;
									local1002.anInt4769 = Static73.anIntArray136[local9];
									local1002.anInt4734 = Static73.anIntArray136[local9 + 1];
									local1002.anInt4714 = Static73.anIntArray136[local9 + 2];
									local1002.anInt4799 = Static73.anIntArray136[local9 + 3];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1207) {
									local9 -= 2;
									local1002.anInt4780 = Static73.anIntArray136[local9];
									local1002.anInt4755 = Static73.anIntArray136[local9 + 1];
									Static134.method3639(local1002);
									continue;
								}
								if (local37 == 1211) {
									local1002.anInt4737 = 5;
									local1002.anInt4806 = 2047;
									local1002.anInt4767 = 0;
									if (local1002.anInt4776 == -1) {
										Static156.method2603(local1002.anInt4800);
									}
									continue;
								}
							} else if (local37 >= 1300 && local37 < 1400 || local37 >= 2300 && local37 < 2400) {
								if (local37 >= 2000) {
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									local37 -= 1000;
								} else {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
								}
								if (local37 == 1300) {
									local9--;
									local634 = Static73.anIntArray136[local9] - 1;
									if (local634 >= 0 && local634 <= 9) {
										local11--;
										local1002.method4011(Static28.aStringArray6[local11], local634);
										continue;
									}
									local11--;
									continue;
								}
								if (local37 == 1301) {
									local9 -= 2;
									local634 = Static73.anIntArray136[local9];
									local873 = Static73.anIntArray136[local9 + 1];
									local1002.aClass151_15 = Static114.method5019(local873, local634);
									continue;
								}
								if (local37 == 1302) {
									local9--;
									local1002.aBoolean335 = Static73.anIntArray136[local9] == 1;
									continue;
								}
								if (local37 == 1303) {
									local9--;
									local1002.anInt4745 = Static73.anIntArray136[local9];
									continue;
								}
								if (local37 == 1304) {
									local9--;
									local1002.anInt4791 = Static73.anIntArray136[local9];
									continue;
								}
								if (local37 == 1305) {
									local11--;
									local1002.aString167 = Static28.aStringArray6[local11];
									continue;
								}
								if (local37 == 1306) {
									local11--;
									local1002.aString165 = Static28.aStringArray6[local11];
									continue;
								}
								if (local37 == 1307) {
									local1002.aStringArray34 = null;
									continue;
								}
								if (local37 == 1308) {
									local9--;
									local1002.anInt4781 = Static73.anIntArray136[local9];
									local9--;
									local1002.anInt4788 = Static73.anIntArray136[local9];
									continue;
								}
								if (local37 == 1309) {
									local9--;
									local634 = Static73.anIntArray136[local9];
									local9--;
									local873 = Static73.anIntArray136[local9];
									if (local873 >= 1 && local873 <= 10) {
										local1002.method4009(local634, local873 - 1);
									}
									continue;
								}
								if (local37 == 1310) {
									local11--;
									local1002.aString166 = Static28.aStringArray6[local11];
									continue;
								}
							} else {
								@Pc(3702) int local3702;
								if (local37 >= 1400 && local37 < 1500 || local37 >= 2400 && local37 < 2500) {
									if (local37 < 2000) {
										local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
									} else {
										local9--;
										local1002 = Static243.method4115(Static73.anIntArray136[local9]);
										local37 -= 1000;
									}
									local11--;
									local2582 = Static28.aStringArray6[local11];
									@Pc(13167) int[] local13167 = null;
									if (local2582.length() > 0 && local2582.charAt(local2582.length() - 1) == 'Y') {
										local9--;
										local469 = Static73.anIntArray136[local9];
										if (local469 > 0) {
											local13167 = new int[local469];
											while (local469-- > 0) {
												local9--;
												local13167[local469] = Static73.anIntArray136[local9];
											}
										}
										local2582 = local2582.substring(0, local2582.length() - 1);
									}
									@Pc(13221) Object[] local13221 = new Object[local2582.length() + 1];
									for (local3702 = local13221.length - 1; local3702 >= 1; local3702--) {
										if (local2582.charAt(local3702 - 1) == 's') {
											local11--;
											local13221[local3702] = Static28.aStringArray6[local11];
										} else {
											local9--;
											local13221[local3702] = Integer.valueOf(Static73.anIntArray136[local9]);
										}
									}
									local9--;
									local3702 = Static73.anIntArray136[local9];
									if (local3702 == -1) {
										local13221 = null;
									} else {
										local13221[0] = Integer.valueOf(local3702);
									}
									local1002.aBoolean332 = true;
									if (local37 == 1400) {
										local1002.anObjectArray12 = local13221;
									} else if (local37 == 1401) {
										local1002.anObjectArray10 = local13221;
									} else if (local37 == 1402) {
										local1002.anObjectArray24 = local13221;
									} else if (local37 == 1403) {
										local1002.anObjectArray29 = local13221;
									} else if (local37 == 1404) {
										local1002.anObjectArray19 = local13221;
									} else if (local37 == 1405) {
										local1002.anObjectArray8 = local13221;
									} else if (local37 == 1406) {
										local1002.anObjectArray5 = local13221;
									} else if (local37 == 1407) {
										local1002.anObjectArray13 = local13221;
										local1002.anIntArray519 = local13167;
									} else if (local37 == 1408) {
										local1002.anObjectArray2 = local13221;
									} else if (local37 == 1409) {
										local1002.anObjectArray28 = local13221;
									} else if (local37 == 1410) {
										local1002.anObjectArray3 = local13221;
									} else if (local37 == 1411) {
										local1002.anObjectArray20 = local13221;
									} else if (local37 == 1412) {
										local1002.anObjectArray25 = local13221;
									} else if (local37 == 1414) {
										local1002.anObjectArray22 = local13221;
										local1002.anIntArray522 = local13167;
									} else if (local37 == 1415) {
										local1002.anIntArray516 = local13167;
										local1002.anObjectArray4 = local13221;
									} else if (local37 == 1416) {
										local1002.anObjectArray16 = local13221;
									} else if (local37 == 1417) {
										local1002.anObjectArray31 = local13221;
									} else if (local37 == 1418) {
										local1002.anObjectArray18 = local13221;
									} else if (local37 == 1419) {
										local1002.anObjectArray26 = local13221;
									} else if (local37 == 1420) {
										local1002.anObjectArray17 = local13221;
									} else if (local37 == 1421) {
										local1002.anObjectArray7 = local13221;
									} else if (local37 == 1422) {
										local1002.anObjectArray21 = local13221;
									} else if (local37 == 1423) {
										local1002.anObjectArray9 = local13221;
									} else if (local37 == 1424) {
										local1002.anObjectArray11 = local13221;
									} else if (local37 == 1425) {
										local1002.anObjectArray15 = local13221;
									} else if (local37 == 1426) {
										local1002.anObjectArray30 = local13221;
									} else if (local37 == 1427) {
										local1002.anObjectArray6 = local13221;
									} else if (local37 == 1428) {
										local1002.anObjectArray27 = local13221;
										local1002.anIntArray512 = local13167;
									} else if (local37 == 1429) {
										local1002.anIntArray521 = local13167;
										local1002.anObjectArray14 = local13221;
									}
									continue;
								}
								if (local37 < 1600) {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
									if (local37 == 1500) {
										Static73.anIntArray136[local9++] = local1002.anInt4756;
										continue;
									}
									if (local37 == 1501) {
										Static73.anIntArray136[local9++] = local1002.anInt4730;
										continue;
									}
									if (local37 == 1502) {
										Static73.anIntArray136[local9++] = local1002.anInt4773;
										continue;
									}
									if (local37 == 1503) {
										Static73.anIntArray136[local9++] = local1002.anInt4751;
										continue;
									}
									if (local37 == 1504) {
										Static73.anIntArray136[local9++] = local1002.aBoolean334 ? 1 : 0;
										continue;
									}
									if (local37 == 1505) {
										Static73.anIntArray136[local9++] = local1002.anInt4727;
										continue;
									}
								} else if (local37 < 1700) {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
									if (local37 == 1600) {
										Static73.anIntArray136[local9++] = local1002.anInt4757;
										continue;
									}
									if (local37 == 1601) {
										Static73.anIntArray136[local9++] = local1002.anInt4747;
										continue;
									}
									if (local37 == 1602) {
										Static28.aStringArray6[local11++] = local1002.aString163;
										continue;
									}
									if (local37 == 1603) {
										Static73.anIntArray136[local9++] = local1002.anInt4720;
										continue;
									}
									if (local37 == 1604) {
										Static73.anIntArray136[local9++] = local1002.anInt4713;
										continue;
									}
									if (local37 == 1605) {
										Static73.anIntArray136[local9++] = local1002.anInt4724;
										continue;
									}
									if (local37 == 1606) {
										Static73.anIntArray136[local9++] = local1002.anInt4729;
										continue;
									}
									if (local37 == 1607) {
										Static73.anIntArray136[local9++] = local1002.anInt4777;
										continue;
									}
									if (local37 == 1608) {
										Static73.anIntArray136[local9++] = local1002.anInt4801;
										continue;
									}
									if (local37 == 1609) {
										Static73.anIntArray136[local9++] = local1002.anInt4758;
										continue;
									}
									if (local37 == 1610) {
										Static73.anIntArray136[local9++] = local1002.anInt4725;
										continue;
									}
									if (local37 == 1611) {
										Static73.anIntArray136[local9++] = local1002.anInt4732;
										continue;
									}
									if (local37 == 1612) {
										Static73.anIntArray136[local9++] = local1002.anInt4772;
										continue;
									}
								} else if (local37 < 1800) {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
									if (local37 == 1700) {
										Static73.anIntArray136[local9++] = local1002.anInt4786;
										continue;
									}
									if (local37 == 1701) {
										if (local1002.anInt4786 == -1) {
											Static73.anIntArray136[local9++] = 0;
										} else {
											Static73.anIntArray136[local9++] = local1002.anInt4796;
										}
										continue;
									}
									if (local37 == 1702) {
										Static73.anIntArray136[local9++] = local1002.anInt4776;
										continue;
									}
								} else if (local37 < 1900) {
									local1002 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
									if (local37 == 1800) {
										Static73.anIntArray136[local9++] = Static42.method612(local1002).method4788();
										continue;
									}
									if (local37 == 1801) {
										local9--;
										local634 = Static73.anIntArray136[local9];
										local634--;
										if (local1002.aStringArray34 != null && local634 < local1002.aStringArray34.length && local1002.aStringArray34[local634] != null) {
											Static28.aStringArray6[local11++] = local1002.aStringArray34[local634];
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 1802) {
										if (local1002.aString167 == null) {
											Static28.aStringArray6[local11++] = "";
										} else {
											Static28.aStringArray6[local11++] = local1002.aString167;
										}
										continue;
									}
								} else if (local37 < 2600) {
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									if (local37 == 2500) {
										Static73.anIntArray136[local9++] = local1002.anInt4756;
										continue;
									}
									if (local37 == 2501) {
										Static73.anIntArray136[local9++] = local1002.anInt4730;
										continue;
									}
									if (local37 == 2502) {
										Static73.anIntArray136[local9++] = local1002.anInt4773;
										continue;
									}
									if (local37 == 2503) {
										Static73.anIntArray136[local9++] = local1002.anInt4751;
										continue;
									}
									if (local37 == 2504) {
										Static73.anIntArray136[local9++] = local1002.aBoolean334 ? 1 : 0;
										continue;
									}
									if (local37 == 2505) {
										Static73.anIntArray136[local9++] = local1002.anInt4727;
										continue;
									}
								} else if (local37 < 2700) {
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									if (local37 == 2600) {
										Static73.anIntArray136[local9++] = local1002.anInt4757;
										continue;
									}
									if (local37 == 2601) {
										Static73.anIntArray136[local9++] = local1002.anInt4747;
										continue;
									}
									if (local37 == 2602) {
										Static28.aStringArray6[local11++] = local1002.aString163;
										continue;
									}
									if (local37 == 2603) {
										Static73.anIntArray136[local9++] = local1002.anInt4720;
										continue;
									}
									if (local37 == 2604) {
										Static73.anIntArray136[local9++] = local1002.anInt4713;
										continue;
									}
									if (local37 == 2605) {
										Static73.anIntArray136[local9++] = local1002.anInt4724;
										continue;
									}
									if (local37 == 2606) {
										Static73.anIntArray136[local9++] = local1002.anInt4729;
										continue;
									}
									if (local37 == 2607) {
										Static73.anIntArray136[local9++] = local1002.anInt4777;
										continue;
									}
									if (local37 == 2608) {
										Static73.anIntArray136[local9++] = local1002.anInt4801;
										continue;
									}
									if (local37 == 2609) {
										Static73.anIntArray136[local9++] = local1002.anInt4758;
										continue;
									}
									if (local37 == 2610) {
										Static73.anIntArray136[local9++] = local1002.anInt4725;
										continue;
									}
									if (local37 == 2611) {
										Static73.anIntArray136[local9++] = local1002.anInt4732;
										continue;
									}
									if (local37 == 2612) {
										Static73.anIntArray136[local9++] = local1002.anInt4772;
										continue;
									}
								} else if (local37 < 2800) {
									if (local37 == 2700) {
										local9--;
										local1002 = Static243.method4115(Static73.anIntArray136[local9]);
										Static73.anIntArray136[local9++] = local1002.anInt4786;
										continue;
									}
									if (local37 != 2701) {
										if (local37 == 2702) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											@Pc(12680) Class3_Sub3 local12680 = (Class3_Sub3) Static205.aClass30_23.method663((long) local629);
											if (local12680 == null) {
												Static73.anIntArray136[local9++] = 0;
											} else {
												Static73.anIntArray136[local9++] = 1;
											}
											continue;
										}
										if (local37 == 2703) {
											local9--;
											local1002 = Static243.method4115(Static73.anIntArray136[local9]);
											if (local1002.aClass151Array2 == null) {
												Static73.anIntArray136[local9++] = 0;
												continue;
											}
											local634 = local1002.aClass151Array2.length;
											for (local873 = 0; local873 < local1002.aClass151Array2.length; local873++) {
												if (local1002.aClass151Array2[local873] == null) {
													local634 = local873;
													break;
												}
											}
											Static73.anIntArray136[local9++] = local634;
											continue;
										}
										if (local37 != 2704 && local37 != 2705) {
											throw new IllegalStateException();
										}
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										@Pc(12773) Class3_Sub3 local12773 = (Class3_Sub3) Static205.aClass30_23.method663((long) local629);
										if (local12773 != null && local634 == local12773.anInt183) {
											Static73.anIntArray136[local9++] = 1;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									if (local1002.anInt4786 == -1) {
										Static73.anIntArray136[local9++] = 0;
									} else {
										Static73.anIntArray136[local9++] = local1002.anInt4796;
									}
									continue;
								} else if (local37 < 2900) {
									local9--;
									local1002 = Static243.method4115(Static73.anIntArray136[local9]);
									if (local37 == 2800) {
										Static73.anIntArray136[local9++] = Static42.method612(local1002).method4788();
										continue;
									}
									if (local37 == 2801) {
										local9--;
										local634 = Static73.anIntArray136[local9];
										local634--;
										if (local1002.aStringArray34 != null && local1002.aStringArray34.length > local634 && local1002.aStringArray34[local634] != null) {
											Static28.aStringArray6[local11++] = local1002.aStringArray34[local634];
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 2802) {
										if (local1002.aString167 == null) {
											Static28.aStringArray6[local11++] = "";
										} else {
											Static28.aStringArray6[local11++] = local1002.aString167;
										}
										continue;
									}
								} else if (local37 < 3200) {
									if (local37 == 3100) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static199.method3284(local425);
										continue;
									}
									if (local37 == 3101) {
										local9 -= 2;
										Static174.method2870(Static136.aClass10_Sub5_Sub1_1, Static73.anIntArray136[local9], Static73.anIntArray136[local9 + 1]);
										continue;
									}
									if (local37 == 3103) {
										Static117.method1916();
										continue;
									}
									if (local37 == 3104) {
										local634 = 0;
										local11--;
										local425 = Static28.aStringArray6[local11];
										if (Static10.method155(local425)) {
											local634 = Static218.method3603(local425);
										}
										Static215.aClass3_Sub26_Sub1_2.method3958(26);
										Static215.aClass3_Sub26_Sub1_2.method3944(local634);
										continue;
									}
									if (local37 == 3105) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static215.aClass3_Sub26_Sub1_2.method3958(80);
										Static215.aClass3_Sub26_Sub1_2.method3907(local425.length() + 1);
										Static215.aClass3_Sub26_Sub1_2.method3914(local425);
										continue;
									}
									if (local37 == 3106) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static215.aClass3_Sub26_Sub1_2.method3958(132);
										Static215.aClass3_Sub26_Sub1_2.method3907(local425.length() + 1);
										Static215.aClass3_Sub26_Sub1_2.method3914(local425);
										continue;
									}
									if (local37 == 3107) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										local11--;
										local2582 = Static28.aStringArray6[local11];
										Static156.method2595(local629, local2582);
										continue;
									}
									if (local37 == 3108) {
										local9 -= 3;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										local873 = Static73.anIntArray136[local9 + 2];
										local883 = Static243.method4115(local873);
										Static17.method294(local883, local634, local629);
										continue;
									}
									if (local37 == 3109) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										local1076 = local841 ? Static88.aClass151_2 : Static90.aClass151_3;
										Static17.method294(local1076, local634, local629);
										continue;
									}
									if (local37 == 3110) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static215.aClass3_Sub26_Sub1_2.method3958(96);
										Static215.aClass3_Sub26_Sub1_2.method3938(local629);
										continue;
									}
								} else if (local37 < 3300) {
									if (local37 == 3200) {
										local9 -= 3;
										Static306.method4919(Static73.anIntArray136[local9 + 1], Static73.anIntArray136[local9], 255, Static73.anIntArray136[local9 + 2]);
										continue;
									}
									if (local37 == 3201) {
										local9--;
										Static314.method5015(Static73.anIntArray136[local9], 255);
										continue;
									}
									if (local37 == 3202) {
										local9 -= 2;
										Static186.method3128(Static73.anIntArray136[local9 + 1], Static73.anIntArray136[local9], 255);
										continue;
									}
								} else if (local37 < 3400) {
									if (local37 == 3300) {
										Static73.anIntArray136[local9++] = Static124.anInt2371;
										continue;
									}
									if (local37 == 3301) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = Static96.method1440(local629, local634);
										continue;
									}
									if (local37 == 3302) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = Static69.method1051(local634, local629);
										continue;
									}
									if (local37 == 3303) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static205.method3419(local629, local634);
										continue;
									}
									if (local37 == 3304) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static2.method27(local629).anInt5665;
										continue;
									}
									if (local37 == 3305) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static170.anIntArray386[local629];
										continue;
									}
									if (local37 == 3306) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static210.anIntArray457[local629];
										continue;
									}
									if (local37 == 3307) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static262.anIntArray559[local629];
										continue;
									}
									if (local37 == 3308) {
										local634 = anInt1844 + (Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7);
										local873 = (Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7) + Static43.anInt798;
										local629 = Static99.anInt1826;
										Static73.anIntArray136[local9++] = (local629 << 28) + (local634 << 14) + local873;
										continue;
									}
									if (local37 == 3309) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = local629 >> 14 & 0x3FFF;
										continue;
									}
									if (local37 == 3310) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = local629 >> 28;
										continue;
									}
									if (local37 == 3311) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = local629 & 0x3FFF;
										continue;
									}
									if (local37 == 3312) {
										Static73.anIntArray136[local9++] = Static94.aBoolean140 ? 1 : 0;
										continue;
									}
									if (local37 == 3313) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9] + 32768;
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = Static96.method1440(local629, local634);
										continue;
									}
									if (local37 == 3314) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9] + 32768;
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = Static69.method1051(local634, local629);
										continue;
									}
									if (local37 == 3315) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9] + 32768;
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = Static205.method3419(local629, local634);
										continue;
									}
									if (local37 == 3316) {
										if (Static296.anInt5879 < 2) {
											Static73.anIntArray136[local9++] = 0;
										} else {
											Static73.anIntArray136[local9++] = Static296.anInt5879;
										}
										continue;
									}
									if (local37 == 3317) {
										Static73.anIntArray136[local9++] = Static222.anInt4338;
										continue;
									}
									if (local37 == 3318) {
										Static73.anIntArray136[local9++] = Static203.anInt3980;
										continue;
									}
									if (local37 == 3321) {
										Static73.anIntArray136[local9++] = Static105.anInt1943;
										continue;
									}
									if (local37 == 3322) {
										Static73.anIntArray136[local9++] = Static117.anInt2182;
										continue;
									}
									if (local37 == 3323) {
										if (Static104.anInt1933 >= 5 && Static104.anInt1933 <= 9) {
											Static73.anIntArray136[local9++] = 1;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3324) {
										if (Static104.anInt1933 >= 5 && Static104.anInt1933 <= 9) {
											Static73.anIntArray136[local9++] = Static104.anInt1933;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3325) {
										Static73.anIntArray136[local9++] = Static179.aBoolean238 ? 1 : 0;
										continue;
									}
									if (local37 == 3326) {
										Static73.anIntArray136[local9++] = Static136.aClass10_Sub5_Sub1_1.anInt3590;
										continue;
									}
									if (local37 == 3327) {
										Static73.anIntArray136[local9++] = Static136.aClass10_Sub5_Sub1_1.aClass131_2.aBoolean282 ? 1 : 0;
										continue;
									}
									if (local37 == 3328) {
										Static73.anIntArray136[local9++] = Static264.aBoolean376 && !Static78.aBoolean128 ? 1 : 0;
										continue;
									}
									if (local37 == 3329) {
										Static73.anIntArray136[local9++] = Static191.aBoolean264 ? 1 : 0;
										continue;
									}
									if (local37 == 3330) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static84.method1285(local629);
										continue;
									}
									if (local37 == 3331) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = Static118.method1922(local634, local629, false);
										continue;
									}
									if (local37 == 3332) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static118.method1922(local634, local629, true);
										continue;
									}
									if (local37 == 3333) {
										Static73.anIntArray136[local9++] = Static120.anInt2263;
										continue;
									}
									if (local37 == 3335) {
										Static73.anIntArray136[local9++] = Static134.anInt4352;
										continue;
									}
									if (local37 == 3336) {
										local9 -= 4;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										local873 = Static73.anIntArray136[local9 + 2];
										local629 += local634 << 14;
										local629 += local873 << 28;
										local469 = Static73.anIntArray136[local9 + 3];
										local629 += local469;
										Static73.anIntArray136[local9++] = local629;
										continue;
									}
									if (local37 == 3337) {
										Static73.anIntArray136[local9++] = Static60.anInt723;
										continue;
									}
								} else if (local37 < 3500) {
									@Pc(2425) Class3_Sub4_Sub4 local2425;
									if (local37 == 3400) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										local2425 = Static192.method3195(local629);
										if (local2425.aChar2 == 's') {
										}
										Static28.aStringArray6[local11++] = local2425.method777(local634);
										continue;
									}
									if (local37 == 3408) {
										local9 -= 4;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										local873 = Static73.anIntArray136[local9 + 2];
										local469 = Static73.anIntArray136[local9 + 3];
										@Pc(2473) Class3_Sub4_Sub4 local2473 = Static192.method3195(local873);
										if (local629 == local2473.aChar1 && local634 == local2473.aChar2) {
											if (local634 == 115) {
												Static28.aStringArray6[local11++] = local2473.method777(local469);
											} else {
												Static73.anIntArray136[local9++] = local2473.method783(local469);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local37 == 3409) {
										local9 -= 3;
										local634 = Static73.anIntArray136[local9 + 1];
										local873 = Static73.anIntArray136[local9 + 2];
										local629 = Static73.anIntArray136[local9];
										if (local634 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(2550) Class3_Sub4_Sub4 local2550 = Static192.method3195(local634);
										if (local2550.aChar2 != local629) {
											throw new RuntimeException("C3409-1");
										}
										Static73.anIntArray136[local9++] = local2550.method781(local873) ? 1 : 0;
										continue;
									}
									if (local37 == 3410) {
										local11--;
										local2582 = Static28.aStringArray6[local11];
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (local629 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local2425 = Static192.method3195(local629);
										if (local2425.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static73.anIntArray136[local9++] = local2425.method784(local2582) ? 1 : 0;
										continue;
									}
									if (local37 == 3411) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										@Pc(2638) Class3_Sub4_Sub4 local2638 = Static192.method3195(local629);
										Static73.anIntArray136[local9++] = local2638.aClass30_7.method673();
										continue;
									}
								} else if (local37 < 3700) {
									if (local37 == 3600) {
										if (Static65.anInt1222 == 0) {
											Static73.anIntArray136[local9++] = -2;
										} else if (Static65.anInt1222 == 1) {
											Static73.anIntArray136[local9++] = -1;
										} else {
											Static73.anIntArray136[local9++] = Static285.anInt5735;
										}
										continue;
									}
									if (local37 == 3601) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 == 2 && local629 < Static285.anInt5735) {
											Static28.aStringArray6[local11++] = Static286.aStringArray37[local629];
											if (Static136.aStringArray22[local629] == null) {
												Static28.aStringArray6[local11++] = "";
											} else {
												Static28.aStringArray6[local11++] = Static136.aStringArray22[local629];
											}
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 3602) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 == 2 && local629 < Static285.anInt5735) {
											Static73.anIntArray136[local9++] = Static139.anIntArray400[local629];
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3603) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 == 2 && Static285.anInt5735 > local629) {
											Static73.anIntArray136[local9++] = Static9.anIntArray16[local629];
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3604) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										local9--;
										local634 = Static73.anIntArray136[local9];
										Static200.method3314(local425, local634);
										continue;
									}
									if (local37 == 3605) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static152.method2566(local425);
										continue;
									}
									if (local37 == 3606) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static229.method3778(local425);
										continue;
									}
									if (local37 == 3607) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static312.method4995(local425, false);
										continue;
									}
									if (local37 == 3608) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static29.method451(local425);
										continue;
									}
									if (local37 == 3609) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										if (local425.startsWith("<img=0>") || local425.startsWith("<img=1>")) {
											local425 = local425.substring(7);
										}
										Static73.anIntArray136[local9++] = Static141.method2394(local425) ? 1 : 0;
										continue;
									}
									if (local37 == 3610) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 == 2 && Static285.anInt5735 > local629) {
											Static28.aStringArray6[local11++] = Static151.aStringArray24[local629];
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 3611) {
										if (Static51.aString38 == null) {
											Static28.aStringArray6[local11++] = "";
										} else {
											Static28.aStringArray6[local11++] = Static123.method2050(Static51.aString38);
										}
										continue;
									}
									if (local37 == 3612) {
										if (Static51.aString38 == null) {
											Static73.anIntArray136[local9++] = 0;
										} else {
											Static73.anIntArray136[local9++] = Static200.anInt3909;
										}
										continue;
									}
									if (local37 == 3613) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static51.aString38 != null && Static200.anInt3909 > local629) {
											Static28.aStringArray6[local11++] = Static279.aClass187Array1[local629].aString221;
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 3614) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static51.aString38 != null && Static200.anInt3909 > local629) {
											Static73.anIntArray136[local9++] = Static279.aClass187Array1[local629].anInt5891;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3615) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static51.aString38 != null && local629 < Static200.anInt3909) {
											Static73.anIntArray136[local9++] = Static279.aClass187Array1[local629].aByte30;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3616) {
										Static73.anIntArray136[local9++] = Static175.aByte16;
										continue;
									}
									if (local37 == 3617) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static59.method965(local425);
										continue;
									}
									if (local37 == 3618) {
										Static73.anIntArray136[local9++] = Static43.aByte1;
										continue;
									}
									if (local37 == 3619) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static105.method1683(local425);
										continue;
									}
									if (local37 == 3620) {
										Static227.method2498();
										continue;
									}
									if (local37 == 3621) {
										if (Static65.anInt1222 == 0) {
											Static73.anIntArray136[local9++] = -1;
										} else {
											Static73.anIntArray136[local9++] = Static149.anInt2817;
										}
										continue;
									}
									if (local37 == 3622) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 != 0 && local629 < Static149.anInt2817) {
											Static28.aStringArray6[local11++] = Static13.aStringArray3[local629];
											if (Static82.aStringArray15[local629] == null) {
												Static28.aStringArray6[local11++] = "";
											} else {
												Static28.aStringArray6[local11++] = Static82.aStringArray15[local629];
											}
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 3623) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										if (local425.startsWith("<img=0>") || local425.startsWith("<img=1>")) {
											local425 = local425.substring(7);
										}
										Static73.anIntArray136[local9++] = Static288.method4745(local425) ? 1 : 0;
										continue;
									}
									if (local37 == 3624) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static279.aClass187Array1 != null && Static200.anInt3909 > local629 && Static279.aClass187Array1[local629].aString222.equalsIgnoreCase(Static136.aClass10_Sub5_Sub1_1.aString124)) {
											Static73.anIntArray136[local9++] = 1;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3625) {
										if (Static111.aString83 == null) {
											Static28.aStringArray6[local11++] = "";
										} else {
											Static28.aStringArray6[local11++] = Static111.aString83;
										}
										continue;
									}
									if (local37 == 3626) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static51.aString38 != null && local629 < Static200.anInt3909) {
											Static28.aStringArray6[local11++] = Static279.aClass187Array1[local629].aString223;
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 3627) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 == 2 && local629 >= 0 && Static285.anInt5735 > local629) {
											Static73.anIntArray136[local9++] = Static279.aBooleanArray122[local629] ? 1 : 0;
											continue;
										}
										Static73.anIntArray136[local9++] = 0;
										continue;
									}
									if (local37 == 3628) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										if (local425.startsWith("<img=0>") || local425.startsWith("<img=1>")) {
											local425 = local425.substring(7);
										}
										Static73.anIntArray136[local9++] = Static79.method1660(local425);
										continue;
									}
									if (local37 == 3629) {
										Static73.anIntArray136[local9++] = Static215.anInt4213;
										continue;
									}
									if (local37 == 3630) {
										local11--;
										local425 = Static28.aStringArray6[local11];
										Static312.method4995(local425, true);
										continue;
									}
									if (local37 == 3631) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static184.aBooleanArray86[local629] ? 1 : 0;
										continue;
									}
									if (local37 == 3632) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static51.aString38 != null && Static200.anInt3909 > local629) {
											Static28.aStringArray6[local11++] = Static279.aClass187Array1[local629].aString222;
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
									if (local37 == 3633) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										if (Static65.anInt1222 != 0 && Static149.anInt2817 > local629) {
											Static28.aStringArray6[local11++] = Static88.aStringArray17[local629];
											continue;
										}
										Static28.aStringArray6[local11++] = "";
										continue;
									}
								} else if (local37 < 4000) {
									if (local37 == 3903) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static290.aClass54Array1[local629].method1252();
										continue;
									}
									if (local37 == 3904) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static290.aClass54Array1[local629].anInt1524;
										continue;
									}
									if (local37 == 3905) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static290.aClass54Array1[local629].anInt1530;
										continue;
									}
									if (local37 == 3906) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static290.aClass54Array1[local629].anInt1531;
										continue;
									}
									if (local37 == 3907) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static290.aClass54Array1[local629].anInt1534;
										continue;
									}
									if (local37 == 3908) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = Static290.aClass54Array1[local629].anInt1525;
										continue;
									}
									if (local37 == 3910) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										local634 = Static290.aClass54Array1[local629].method1251();
										Static73.anIntArray136[local9++] = local634 == 0 ? 1 : 0;
										continue;
									}
									if (local37 == 3911) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										local634 = Static290.aClass54Array1[local629].method1251();
										Static73.anIntArray136[local9++] = local634 == 2 ? 1 : 0;
										continue;
									}
									if (local37 == 3912) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										local634 = Static290.aClass54Array1[local629].method1251();
										Static73.anIntArray136[local9++] = local634 == 5 ? 1 : 0;
										continue;
									}
									if (local37 == 3913) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										local634 = Static290.aClass54Array1[local629].method1251();
										Static73.anIntArray136[local9++] = local634 == 1 ? 1 : 0;
										continue;
									}
								} else if (local37 >= 4100) {
									@Pc(4125) boolean local4125;
									if (local37 < 4200) {
										if (local37 == 4100) {
											local9--;
											local634 = Static73.anIntArray136[local9];
											local11--;
											local425 = Static28.aStringArray6[local11];
											Static28.aStringArray6[local11++] = local425 + local634;
											continue;
										}
										if (local37 == 4101) {
											local11 -= 2;
											local425 = Static28.aStringArray6[local11];
											local2582 = Static28.aStringArray6[local11 + 1];
											Static28.aStringArray6[local11++] = local425 + local2582;
											continue;
										}
										if (local37 == 4102) {
											local11--;
											local425 = Static28.aStringArray6[local11];
											local9--;
											local634 = Static73.anIntArray136[local9];
											Static28.aStringArray6[local11++] = local425 + Static308.method4940(local634);
											continue;
										}
										if (local37 == 4103) {
											local11--;
											local425 = Static28.aStringArray6[local11];
											Static28.aStringArray6[local11++] = local425.toLowerCase();
											continue;
										}
										if (local37 == 4104) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											@Pc(3688) long local3688 = (long) local629 * 86400000L + 1014768000000L;
											Static151.aCalendar1.setTime(new Date(local3688));
											local469 = Static151.aCalendar1.get(5);
											local3702 = Static151.aCalendar1.get(2);
											local907 = Static151.aCalendar1.get(1);
											Static28.aStringArray6[local11++] = local469 + "-" + Static82.aStringArray16[local3702] + "-" + local907;
											continue;
										}
										if (local37 == 4105) {
											local11 -= 2;
											local425 = Static28.aStringArray6[local11];
											local2582 = Static28.aStringArray6[local11 + 1];
											if (Static136.aClass10_Sub5_Sub1_1.aClass131_2 != null && Static136.aClass10_Sub5_Sub1_1.aClass131_2.aBoolean282) {
												Static28.aStringArray6[local11++] = local2582;
												continue;
											}
											Static28.aStringArray6[local11++] = local425;
											continue;
										}
										if (local37 == 4106) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static28.aStringArray6[local11++] = Integer.toString(local629);
											continue;
										}
										if (local37 == 4107) {
											local11 -= 2;
											Static73.anIntArray136[local9++] = Static152.method2563(Static247.method4164(Static28.aStringArray6[local11 + 1], Static134.anInt4352, Static28.aStringArray6[local11]));
											continue;
										}
										if (local37 == 4108) {
											local9 -= 2;
											local11--;
											local425 = Static28.aStringArray6[local11];
											local873 = Static73.anIntArray136[local9 + 1];
											local634 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Static133.method2311(local873).method3696(local425, local634);
											continue;
										}
										if (local37 == 4109) {
											local9 -= 2;
											local634 = Static73.anIntArray136[local9];
											local11--;
											local425 = Static28.aStringArray6[local11];
											local873 = Static73.anIntArray136[local9 + 1];
											Static73.anIntArray136[local9++] = Static133.method2311(local873).method3688(local425, local634);
											continue;
										}
										if (local37 == 4110) {
											local11 -= 2;
											local425 = Static28.aStringArray6[local11];
											local2582 = Static28.aStringArray6[local11 + 1];
											local9--;
											if (Static73.anIntArray136[local9] == 1) {
												Static28.aStringArray6[local11++] = local425;
											} else {
												Static28.aStringArray6[local11++] = local2582;
											}
											continue;
										}
										if (local37 == 4111) {
											local11--;
											local425 = Static28.aStringArray6[local11];
											Static28.aStringArray6[local11++] = Static24.method3703(local425);
											continue;
										}
										if (local37 == 4112) {
											local11--;
											local425 = Static28.aStringArray6[local11];
											local9--;
											local634 = Static73.anIntArray136[local9];
											if (local634 == -1) {
												throw new RuntimeException("null char");
											}
											Static28.aStringArray6[local11++] = local425 + (char) local634;
											continue;
										}
										if (local37 == 4113) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Static308.method4943((char) local629) ? 1 : 0;
											continue;
										}
										if (local37 == 4114) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Static117.method1919((char) local629) ? 1 : 0;
											continue;
										}
										if (local37 == 4115) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Static188.method3144((char) local629) ? 1 : 0;
											continue;
										}
										if (local37 == 4116) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Static137.method2338((char) local629) ? 1 : 0;
											continue;
										}
										if (local37 == 4117) {
											local11--;
											local425 = Static28.aStringArray6[local11];
											if (local425 == null) {
												Static73.anIntArray136[local9++] = 0;
											} else {
												Static73.anIntArray136[local9++] = local425.length();
											}
											continue;
										}
										if (local37 == 4118) {
											local9 -= 2;
											local11--;
											local425 = Static28.aStringArray6[local11];
											local634 = Static73.anIntArray136[local9];
											local873 = Static73.anIntArray136[local9 + 1];
											Static28.aStringArray6[local11++] = local425.substring(local634, local873);
											continue;
										}
										if (local37 == 4119) {
											local11--;
											local425 = Static28.aStringArray6[local11];
											local4125 = false;
											@Pc(4131) StringBuffer local4131 = new StringBuffer(local425.length());
											for (local469 = 0; local425.length() > local469; local469++) {
												@Pc(4145) char local4145 = local425.charAt(local469);
												if (local4145 == '<') {
													local4125 = true;
												} else if (local4145 == '>') {
													local4125 = false;
												} else if (!local4125) {
													local4131.append(local4145);
												}
											}
											Static28.aStringArray6[local11++] = local4131.toString();
											continue;
										}
										if (local37 == 4120) {
											local9 -= 2;
											local11--;
											local425 = Static28.aStringArray6[local11];
											local634 = Static73.anIntArray136[local9];
											local873 = Static73.anIntArray136[local9 + 1];
											Static73.anIntArray136[local9++] = local425.indexOf(local634, local873);
											continue;
										}
										if (local37 == 4121) {
											local9--;
											local873 = Static73.anIntArray136[local9];
											local11 -= 2;
											local425 = Static28.aStringArray6[local11];
											local2582 = Static28.aStringArray6[local11 + 1];
											Static73.anIntArray136[local9++] = local425.indexOf(local2582, local873);
											continue;
										}
										if (local37 == 4122) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Character.toLowerCase((char) local629);
											continue;
										}
										if (local37 == 4123) {
											local9--;
											local629 = Static73.anIntArray136[local9];
											Static73.anIntArray136[local9++] = Character.toUpperCase((char) local629);
											continue;
										}
										if (local37 == 4124) {
											local9--;
											local4293 = Static73.anIntArray136[local9] != 0;
											local9--;
											local634 = Static73.anIntArray136[local9];
											Static28.aStringArray6[local11++] = Static305.method4916(Static134.anInt4352, (long) local634, 0, local4293);
											continue;
										}
									} else {
										@Pc(4337) Class3_Sub4_Sub6 local4337;
										if (local37 < 4300) {
											if (local37 == 4200) {
												local9--;
												local629 = Static73.anIntArray136[local9];
												Static28.aStringArray6[local11++] = Static133.method2309(local629).aString18;
												continue;
											}
											@Pc(11136) Class21 local11136;
											if (local37 == 4201) {
												local9 -= 2;
												local629 = Static73.anIntArray136[local9];
												local634 = Static73.anIntArray136[local9 + 1];
												local11136 = Static133.method2309(local629);
												if (local634 >= 1 && local634 <= 5 && local11136.aStringArray7[local634 - 1] != null) {
													Static28.aStringArray6[local11++] = local11136.aStringArray7[local634 - 1];
													continue;
												}
												Static28.aStringArray6[local11++] = "";
												continue;
											}
											if (local37 == 4202) {
												local9 -= 2;
												local634 = Static73.anIntArray136[local9 + 1];
												local629 = Static73.anIntArray136[local9];
												local11136 = Static133.method2309(local629);
												if (local634 >= 1 && local634 <= 5 && local11136.aStringArray8[local634 - 1] != null) {
													Static28.aStringArray6[local11++] = local11136.aStringArray8[local634 - 1];
													continue;
												}
												Static28.aStringArray6[local11++] = "";
												continue;
											}
											if (local37 == 4203) {
												local9--;
												local629 = Static73.anIntArray136[local9];
												Static73.anIntArray136[local9++] = Static133.method2309(local629).anInt530;
												continue;
											}
											if (local37 == 4204) {
												local9--;
												local629 = Static73.anIntArray136[local9];
												Static73.anIntArray136[local9++] = Static133.method2309(local629).anInt501 == 1 ? 1 : 0;
												continue;
											}
											@Pc(11287) Class21 local11287;
											if (local37 == 4205) {
												local9--;
												local629 = Static73.anIntArray136[local9];
												local11287 = Static133.method2309(local629);
												if (local11287.anInt529 == -1 && local11287.anInt496 >= 0) {
													Static73.anIntArray136[local9++] = local11287.anInt496;
													continue;
												}
												Static73.anIntArray136[local9++] = local629;
												continue;
											}
											if (local37 == 4206) {
												local9--;
												local629 = Static73.anIntArray136[local9];
												local11287 = Static133.method2309(local629);
												if (local11287.anInt529 >= 0 && local11287.anInt496 >= 0) {
													Static73.anIntArray136[local9++] = local11287.anInt496;
													continue;
												}
												Static73.anIntArray136[local9++] = local629;
												continue;
											}
											if (local37 == 4207) {
												local9--;
												local629 = Static73.anIntArray136[local9];
												Static73.anIntArray136[local9++] = Static133.method2309(local629).aBoolean44 ? 1 : 0;
												continue;
											}
											if (local37 == 4208) {
												local9 -= 2;
												local634 = Static73.anIntArray136[local9 + 1];
												local629 = Static73.anIntArray136[local9];
												local4337 = Static6.method109(local634);
												if (local4337.method942()) {
													Static28.aStringArray6[local11++] = Static133.method2309(local629).method447(local634, local4337.aString44);
												} else {
													Static73.anIntArray136[local9++] = Static133.method2309(local629).method442(local4337.anInt1108, local634);
												}
												continue;
											}
											if (local37 == 4210) {
												local9--;
												local634 = Static73.anIntArray136[local9];
												local11--;
												local425 = Static28.aStringArray6[local11];
												Static65.method1016(local425, local634 == 1);
												Static73.anIntArray136[local9++] = Static6.anInt133;
												continue;
											}
											if (local37 == 4211) {
												if (Static255.aShortArray86 != null && Static49.anInt939 < Static6.anInt133) {
													Static73.anIntArray136[local9++] = Static255.aShortArray86[Static49.anInt939++] & 0xFFFF;
													continue;
												}
												Static73.anIntArray136[local9++] = -1;
												continue;
											}
											if (local37 == 4212) {
												Static49.anInt939 = 0;
												continue;
											}
										} else if (local37 < 4400) {
											if (local37 == 4300) {
												local9 -= 2;
												local634 = Static73.anIntArray136[local9 + 1];
												local629 = Static73.anIntArray136[local9];
												local4337 = Static6.method109(local634);
												if (local4337.method942()) {
													Static28.aStringArray6[local11++] = Static218.method3602(local629).method3194(local634, local4337.aString44);
												} else {
													Static73.anIntArray136[local9++] = Static218.method3602(local629).method3188(local4337.anInt1108, local634);
												}
												continue;
											}
										} else if (local37 >= 4500) {
											if (local37 >= 4600) {
												if (local37 < 5100) {
													if (local37 == 5000) {
														Static73.anIntArray136[local9++] = Static296.anInt5865;
														continue;
													}
													if (local37 == 5001) {
														local9 -= 3;
														Static296.anInt5865 = Static73.anIntArray136[local9];
														Static49.anInt946 = Static73.anIntArray136[local9 + 1];
														Static284.anInt5707 = Static73.anIntArray136[local9 + 2];
														Static215.aClass3_Sub26_Sub1_2.method3958(35);
														Static215.aClass3_Sub26_Sub1_2.method3907(Static296.anInt5865);
														Static215.aClass3_Sub26_Sub1_2.method3907(Static49.anInt946);
														Static215.aClass3_Sub26_Sub1_2.method3907(Static284.anInt5707);
														continue;
													}
													if (local37 == 5002) {
														local11--;
														local425 = Static28.aStringArray6[local11];
														local9 -= 2;
														local873 = Static73.anIntArray136[local9 + 1];
														local634 = Static73.anIntArray136[local9];
														Static215.aClass3_Sub26_Sub1_2.method3958(222);
														Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(local425) + 2);
														Static215.aClass3_Sub26_Sub1_2.method3914(local425);
														Static215.aClass3_Sub26_Sub1_2.method3907(local634 - 1);
														Static215.aClass3_Sub26_Sub1_2.method3907(local873);
														continue;
													}
													if (local37 == 5003) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														local2582 = null;
														if (local629 < 100) {
															local2582 = Static231.aStringArray31[local629];
														}
														if (local2582 == null) {
															local2582 = "";
														}
														Static28.aStringArray6[local11++] = local2582;
														continue;
													}
													if (local37 == 5004) {
														local634 = -1;
														local9--;
														local629 = Static73.anIntArray136[local9];
														if (local629 < 100 && Static231.aStringArray31[local629] != null) {
															local634 = Static209.anIntArray624[local629];
														}
														Static73.anIntArray136[local9++] = local634;
														continue;
													}
													if (local37 == 5005) {
														Static73.anIntArray136[local9++] = Static49.anInt946;
														continue;
													}
													if (local37 == 5008) {
														local11--;
														local425 = Static28.aStringArray6[local11];
														if (!local425.startsWith("::")) {
															if (Static296.anInt5879 == 0 && (Static264.aBoolean376 && !Static78.aBoolean128 || Static191.aBoolean264)) {
																continue;
															}
															@Pc(9481) byte local9481 = 0;
															local2582 = local425.toLowerCase();
															@Pc(9490) byte local9490 = 0;
															if (local2582.startsWith(Static229.aString161)) {
																local9481 = 0;
																local425 = local425.substring(Static229.aString161.length());
															} else if (local2582.startsWith(Static183.aString129)) {
																local425 = local425.substring(Static183.aString129.length());
																local9481 = 1;
															} else if (local2582.startsWith(Static179.aString121)) {
																local9481 = 2;
																local425 = local425.substring(Static179.aString121.length());
															} else if (local2582.startsWith(Static194.aString133)) {
																local9481 = 3;
																local425 = local425.substring(Static194.aString133.length());
															} else if (local2582.startsWith(Static109.aString106)) {
																local425 = local425.substring(Static109.aString106.length());
																local9481 = 4;
															} else if (local2582.startsWith(Static50.aString35)) {
																local9481 = 5;
																local425 = local425.substring(Static50.aString35.length());
															} else if (local2582.startsWith(Static210.aString145)) {
																local425 = local425.substring(Static210.aString145.length());
																local9481 = 6;
															} else if (local2582.startsWith(Static40.aString232)) {
																local425 = local425.substring(Static40.aString232.length());
																local9481 = 7;
															} else if (local2582.startsWith(Static63.aString52)) {
																local425 = local425.substring(Static63.aString52.length());
																local9481 = 8;
															} else if (local2582.startsWith(Static270.aString203)) {
																local425 = local425.substring(Static270.aString203.length());
																local9481 = 9;
															} else if (local2582.startsWith(Static243.aString172)) {
																local9481 = 10;
																local425 = local425.substring(Static243.aString172.length());
															} else if (local2582.startsWith(Static249.aString177)) {
																local425 = local425.substring(Static249.aString177.length());
																local9481 = 11;
															} else if (Static134.anInt4352 != 0) {
																if (local2582.startsWith(Static3.aString2)) {
																	local425 = local425.substring(Static3.aString2.length());
																	local9481 = 0;
																} else if (local2582.startsWith(Static167.aString112)) {
																	local425 = local425.substring(Static167.aString112.length());
																	local9481 = 1;
																} else if (local2582.startsWith(Static61.aString47)) {
																	local425 = local425.substring(Static61.aString47.length());
																	local9481 = 2;
																} else if (local2582.startsWith(Static247.aString175)) {
																	local425 = local425.substring(Static247.aString175.length());
																	local9481 = 3;
																} else if (local2582.startsWith(Static198.aString136)) {
																	local425 = local425.substring(Static198.aString136.length());
																	local9481 = 4;
																} else if (local2582.startsWith(Static264.aString191)) {
																	local9481 = 5;
																	local425 = local425.substring(Static264.aString191.length());
																} else if (local2582.startsWith(Static183.aString128)) {
																	local9481 = 6;
																	local425 = local425.substring(Static183.aString128.length());
																} else if (local2582.startsWith(Static176.aString117)) {
																	local425 = local425.substring(Static176.aString117.length());
																	local9481 = 7;
																} else if (local2582.startsWith(Static177.aString118)) {
																	local425 = local425.substring(Static177.aString118.length());
																	local9481 = 8;
																} else if (local2582.startsWith(Static32.aString22)) {
																	local425 = local425.substring(Static32.aString22.length());
																	local9481 = 9;
																} else if (local2582.startsWith(Static58.aString45)) {
																	local9481 = 10;
																	local425 = local425.substring(Static58.aString45.length());
																} else if (local2582.startsWith(Static195.aString134)) {
																	local9481 = 11;
																	local425 = local425.substring(Static195.aString134.length());
																}
															}
															local2582 = local425.toLowerCase();
															if (local2582.startsWith(Static135.aString96)) {
																local9490 = 1;
																local425 = local425.substring(Static135.aString96.length());
															} else if (local2582.startsWith(Static69.aString54)) {
																local9490 = 2;
																local425 = local425.substring(Static69.aString54.length());
															} else if (local2582.startsWith(Static304.aString227)) {
																local425 = local425.substring(Static304.aString227.length());
																local9490 = 3;
															} else if (local2582.startsWith(Static245.aString231)) {
																local425 = local425.substring(Static245.aString231.length());
																local9490 = 4;
															} else if (local2582.startsWith(Static87.aString160)) {
																local425 = local425.substring(Static87.aString160.length());
																local9490 = 5;
															} else if (Static134.anInt4352 != 0) {
																if (local2582.startsWith(Static252.aString182)) {
																	local425 = local425.substring(Static252.aString182.length());
																	local9490 = 1;
																} else if (local2582.startsWith(Static274.aString206)) {
																	local425 = local425.substring(Static274.aString206.length());
																	local9490 = 2;
																} else if (local2582.startsWith(Static131.aString92)) {
																	local9490 = 3;
																	local425 = local425.substring(Static131.aString92.length());
																} else if (local2582.startsWith(Static111.aString82)) {
																	local9490 = 4;
																	local425 = local425.substring(Static111.aString82.length());
																} else if (local2582.startsWith(Static256.aString189)) {
																	local425 = local425.substring(Static256.aString189.length());
																	local9490 = 5;
																}
															}
															Static215.aClass3_Sub26_Sub1_2.method3958(107);
															Static215.aClass3_Sub26_Sub1_2.method3907(0);
															local3702 = Static215.aClass3_Sub26_Sub1_2.anInt4615;
															Static215.aClass3_Sub26_Sub1_2.method3907(local9481);
															Static215.aClass3_Sub26_Sub1_2.method3907(local9490);
															Static92.method1370(Static215.aClass3_Sub26_Sub1_2, local425);
															Static215.aClass3_Sub26_Sub1_2.method3936(Static215.aClass3_Sub26_Sub1_2.anInt4615 - local3702);
															continue;
														}
														Static263.method4392(local425);
														continue;
													}
													if (local37 == 5009) {
														local11 -= 2;
														local2582 = Static28.aStringArray6[local11 + 1];
														local425 = Static28.aStringArray6[local11];
														if (Static296.anInt5879 != 0 || (!Static264.aBoolean376 || Static78.aBoolean128) && !Static191.aBoolean264) {
															Static215.aClass3_Sub26_Sub1_2.method3958(94);
															Static215.aClass3_Sub26_Sub1_2.method3907(0);
															local873 = Static215.aClass3_Sub26_Sub1_2.anInt4615;
															Static215.aClass3_Sub26_Sub1_2.method3914(local425);
															Static92.method1370(Static215.aClass3_Sub26_Sub1_2, local2582);
															Static215.aClass3_Sub26_Sub1_2.method3936(Static215.aClass3_Sub26_Sub1_2.anInt4615 - local873);
														}
														continue;
													}
													if (local37 == 5010) {
														local2582 = null;
														local9--;
														local629 = Static73.anIntArray136[local9];
														if (local629 < 100) {
															local2582 = Static153.aStringArray25[local629];
														}
														if (local2582 == null) {
															local2582 = "";
														}
														Static28.aStringArray6[local11++] = local2582;
														continue;
													}
													if (local37 == 5011) {
														local2582 = null;
														local9--;
														local629 = Static73.anIntArray136[local9];
														if (local629 < 100) {
															local2582 = Static244.aStringArray35[local629];
														}
														if (local2582 == null) {
															local2582 = "";
														}
														Static28.aStringArray6[local11++] = local2582;
														continue;
													}
													if (local37 == 5012) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														local634 = -1;
														if (local629 < 100) {
															local634 = Static115.anIntArray222[local629];
														}
														Static73.anIntArray136[local9++] = local634;
														continue;
													}
													if (local37 == 5015) {
														if (Static136.aClass10_Sub5_Sub1_1 == null || Static136.aClass10_Sub5_Sub1_1.aString125 == null) {
															local425 = Static132.aString93;
														} else {
															local425 = Static136.aClass10_Sub5_Sub1_1.method3041(true);
														}
														Static28.aStringArray6[local11++] = local425;
														continue;
													}
													if (local37 == 5018) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														local634 = 0;
														if (local629 < 100 && Static231.aStringArray31[local629] != null) {
															local634 = Static209.anIntArray624[local629];
														}
														Static73.anIntArray136[local9++] = local634;
														continue;
													}
													if (local37 == 5019) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														local2582 = null;
														if (local629 < 100) {
															local2582 = Static213.aStringArray28[local629];
														}
														if (local2582 == null) {
															local2582 = "";
														}
														Static28.aStringArray6[local11++] = local2582;
														continue;
													}
													if (local37 == 5016) {
														Static73.anIntArray136[local9++] = Static284.anInt5707;
														continue;
													}
													if (local37 == 5017) {
														Static73.anIntArray136[local9++] = Static108.anInt2013;
														continue;
													}
													if (local37 == 5050) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														Static28.aStringArray6[local11++] = Static216.method3555(local629).aString73;
														continue;
													}
													@Pc(10275) Class3_Sub4_Sub8 local10275;
													if (local37 == 5051) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														local10275 = Static216.method3555(local629);
														if (local10275.anIntArray170 == null) {
															Static73.anIntArray136[local9++] = 0;
														} else {
															Static73.anIntArray136[local9++] = local10275.anIntArray170.length;
														}
														continue;
													}
													if (local37 == 5052) {
														local9 -= 2;
														local634 = Static73.anIntArray136[local9 + 1];
														local629 = Static73.anIntArray136[local9];
														@Pc(10313) Class3_Sub4_Sub8 local10313 = Static216.method3555(local629);
														local469 = local10313.anIntArray170[local634];
														Static73.anIntArray136[local9++] = local469;
														continue;
													}
													if (local37 == 5053) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														local10275 = Static216.method3555(local629);
														if (local10275.anIntArray168 == null) {
															Static73.anIntArray136[local9++] = 0;
														} else {
															Static73.anIntArray136[local9++] = local10275.anIntArray168.length;
														}
														continue;
													}
													if (local37 == 5054) {
														local9 -= 2;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														Static73.anIntArray136[local9++] = Static216.method3555(local629).anIntArray168[local634];
														continue;
													}
													if (local37 == 5055) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														Static28.aStringArray6[local11++] = Static213.method3486(local629).method1586();
														continue;
													}
													if (local37 == 5056) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														@Pc(10416) Class3_Sub4_Sub9 local10416 = Static213.method3486(local629);
														if (local10416.anIntArray183 == null) {
															Static73.anIntArray136[local9++] = 0;
														} else {
															Static73.anIntArray136[local9++] = local10416.anIntArray183.length;
														}
														continue;
													}
													if (local37 == 5057) {
														local9 -= 2;
														local634 = Static73.anIntArray136[local9 + 1];
														local629 = Static73.anIntArray136[local9];
														Static73.anIntArray136[local9++] = Static213.method3486(local629).anIntArray183[local634];
														continue;
													}
													if (local37 == 5058) {
														Static62.aClass35_1 = new Class35();
														local9--;
														Static62.aClass35_1.anInt1010 = Static73.anIntArray136[local9];
														Static62.aClass35_1.aClass3_Sub4_Sub9_1 = Static213.method3486(Static62.aClass35_1.anInt1010);
														Static62.aClass35_1.anIntArray91 = new int[Static62.aClass35_1.aClass3_Sub4_Sub9_1.method1576()];
														continue;
													}
													if (local37 == 5059) {
														Static215.aClass3_Sub26_Sub1_2.method3958(168);
														Static215.aClass3_Sub26_Sub1_2.method3907(0);
														local629 = Static215.aClass3_Sub26_Sub1_2.anInt4615;
														Static215.aClass3_Sub26_Sub1_2.method3907(0);
														Static215.aClass3_Sub26_Sub1_2.method3938(Static62.aClass35_1.anInt1010);
														Static62.aClass35_1.aClass3_Sub4_Sub9_1.method1579(Static215.aClass3_Sub26_Sub1_2, Static62.aClass35_1.anIntArray91);
														Static215.aClass3_Sub26_Sub1_2.method3936(Static215.aClass3_Sub26_Sub1_2.anInt4615 - local629);
														continue;
													}
													if (local37 == 5060) {
														local11--;
														local425 = Static28.aStringArray6[local11];
														Static215.aClass3_Sub26_Sub1_2.method3958(250);
														Static215.aClass3_Sub26_Sub1_2.method3907(0);
														local634 = Static215.aClass3_Sub26_Sub1_2.anInt4615;
														Static215.aClass3_Sub26_Sub1_2.method3914(local425);
														Static215.aClass3_Sub26_Sub1_2.method3938(Static62.aClass35_1.anInt1010);
														Static62.aClass35_1.aClass3_Sub4_Sub9_1.method1579(Static215.aClass3_Sub26_Sub1_2, Static62.aClass35_1.anIntArray91);
														Static215.aClass3_Sub26_Sub1_2.method3936(Static215.aClass3_Sub26_Sub1_2.anInt4615 - local634);
														continue;
													}
													if (local37 == 5061) {
														Static215.aClass3_Sub26_Sub1_2.method3958(168);
														Static215.aClass3_Sub26_Sub1_2.method3907(0);
														local629 = Static215.aClass3_Sub26_Sub1_2.anInt4615;
														Static215.aClass3_Sub26_Sub1_2.method3907(1);
														Static215.aClass3_Sub26_Sub1_2.method3938(Static62.aClass35_1.anInt1010);
														Static62.aClass35_1.aClass3_Sub4_Sub9_1.method1579(Static215.aClass3_Sub26_Sub1_2, Static62.aClass35_1.anIntArray91);
														Static215.aClass3_Sub26_Sub1_2.method3936(Static215.aClass3_Sub26_Sub1_2.anInt4615 - local629);
														continue;
													}
													if (local37 == 5062) {
														local9 -= 2;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														Static73.anIntArray136[local9++] = Static216.method3555(local629).aCharArray14[local634];
														continue;
													}
													if (local37 == 5063) {
														local9 -= 2;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														Static73.anIntArray136[local9++] = Static216.method3555(local629).aCharArray13[local634];
														continue;
													}
													if (local37 == 5064) {
														local9 -= 2;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														if (local634 == -1) {
															Static73.anIntArray136[local9++] = -1;
														} else {
															Static73.anIntArray136[local9++] = Static216.method3555(local629).method1409((char) local634);
														}
														continue;
													}
													if (local37 == 5065) {
														local9 -= 2;
														local634 = Static73.anIntArray136[local9 + 1];
														local629 = Static73.anIntArray136[local9];
														if (local634 == -1) {
															Static73.anIntArray136[local9++] = -1;
														} else {
															Static73.anIntArray136[local9++] = Static216.method3555(local629).method1413((char) local634);
														}
														continue;
													}
													if (local37 == 5066) {
														local9--;
														local629 = Static73.anIntArray136[local9];
														Static73.anIntArray136[local9++] = Static213.method3486(local629).method1576();
														continue;
													}
													if (local37 == 5067) {
														local9 -= 2;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														local873 = Static213.method3486(local629).method1582(local634);
														Static73.anIntArray136[local9++] = local873;
														continue;
													}
													if (local37 == 5068) {
														local9 -= 2;
														local634 = Static73.anIntArray136[local9 + 1];
														local629 = Static73.anIntArray136[local9];
														Static62.aClass35_1.anIntArray91[local629] = local634;
														continue;
													}
													if (local37 == 5069) {
														local9 -= 2;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														Static62.aClass35_1.anIntArray91[local629] = local634;
														continue;
													}
													if (local37 == 5070) {
														local9 -= 3;
														local629 = Static73.anIntArray136[local9];
														local634 = Static73.anIntArray136[local9 + 1];
														local873 = Static73.anIntArray136[local9 + 2];
														@Pc(10891) Class3_Sub4_Sub9 local10891 = Static213.method3486(local629);
														if (local10891.method1582(local634) != 0) {
															throw new RuntimeException("bad command");
														}
														Static73.anIntArray136[local9++] = local10891.method1574(local873, local634);
														continue;
													}
													if (local37 == 5071) {
														local11--;
														local425 = Static28.aStringArray6[local11];
														local9--;
														local4957 = Static73.anIntArray136[local9] == 1;
														Static276.method4532(local4957, local425);
														Static73.anIntArray136[local9++] = Static6.anInt133;
														continue;
													}
													if (local37 == 5072) {
														if (Static255.aShortArray86 != null && Static49.anInt939 < Static6.anInt133) {
															Static73.anIntArray136[local9++] = Static255.aShortArray86[Static49.anInt939++] & 0xFFFF;
															continue;
														}
														Static73.anIntArray136[local9++] = -1;
														continue;
													}
													if (local37 == 5073) {
														Static49.anInt939 = 0;
														continue;
													}
												} else if (local37 >= 5200) {
													@Pc(4822) boolean local4822;
													if (local37 < 5300) {
														if (local37 == 5200) {
															local9--;
															Static199.method3279(Static73.anIntArray136[local9]);
															continue;
														}
														if (local37 == 5201) {
															Static73.anIntArray136[local9++] = Static220.method4262();
															continue;
														}
														if (local37 == 5205) {
															local9--;
															Static186.method3129(false, -1, Static73.anIntArray136[local9], -1);
															continue;
														}
														@Pc(4450) Class3_Sub4_Sub14 local4450;
														if (local37 == 5206) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static228.method1182(local629 >> 14 & 0x3FFF, local629 & 0x3FFF);
															if (local4450 == null) {
																Static73.anIntArray136[local9++] = -1;
															} else {
																Static73.anIntArray136[local9++] = local4450.anInt2659;
															}
															continue;
														}
														@Pc(4480) Class3_Sub4_Sub14 local4480;
														if (local37 == 5207) {
															local9--;
															local4480 = Static228.method1189(Static73.anIntArray136[local9]);
															if (local4480 != null && local4480.aString99 != null) {
																Static28.aStringArray6[local11++] = local4480.aString99;
																continue;
															}
															Static28.aStringArray6[local11++] = "";
															continue;
														}
														if (local37 == 5208) {
															Static73.anIntArray136[local9++] = Static171.anInt3225;
															Static73.anIntArray136[local9++] = Static203.anInt3978;
															continue;
														}
														if (local37 == 5209) {
															Static73.anIntArray136[local9++] = Static228.anInt1431 + Static158.anInt2949;
															Static73.anIntArray136[local9++] = Static228.anInt1435 + Static228.anInt1432 - Static168.anInt3167 - 1;
															continue;
														}
														if (local37 == 5210) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static228.method1189(local629);
															if (local4450 == null) {
																Static73.anIntArray136[local9++] = 0;
																Static73.anIntArray136[local9++] = 0;
															} else {
																Static73.anIntArray136[local9++] = local4450.anInt2661 >> 14 & 0x3FFF;
																Static73.anIntArray136[local9++] = local4450.anInt2661 & 0x3FFF;
															}
															continue;
														}
														if (local37 == 5211) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static228.method1189(local629);
															if (local4450 == null) {
																Static73.anIntArray136[local9++] = 0;
																Static73.anIntArray136[local9++] = 0;
															} else {
																Static73.anIntArray136[local9++] = local4450.anInt2668 - local4450.anInt2674;
																Static73.anIntArray136[local9++] = local4450.anInt2662 - local4450.anInt2660;
															}
															continue;
														}
														@Pc(4646) Class3_Sub4_Sub23 local4646;
														if (local37 == 5212) {
															local4646 = Static233.method3957();
															if (local4646 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = -1;
															} else {
																Static73.anIntArray136[local9++] = local4646.anInt5971;
																local634 = Static228.anInt1435 + Static228.anInt1432 - local4646.anInt5970 - 1 | Static228.anInt1431 + local4646.anInt5964 << 14 | local4646.anInt5968 << 28;
																Static73.anIntArray136[local9++] = local634;
															}
															continue;
														}
														if (local37 == 5213) {
															local4646 = Static17.method292();
															if (local4646 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = -1;
															} else {
																Static73.anIntArray136[local9++] = local4646.anInt5971;
																local634 = Static228.anInt1435 + Static228.anInt1432 - local4646.anInt5970 - 1 | local4646.anInt5964 + Static228.anInt1431 << 14 | local4646.anInt5968 << 28;
																Static73.anIntArray136[local9++] = local634;
															}
															continue;
														}
														if (local37 == 5214) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static31.method473();
															if (local4450 != null) {
																local4125 = local4450.method2353(local629 & 0x3FFF, local629 >> 14 & 0x3FFF, local629 >> 28 & 0x3, Static134.anIntArray480);
																if (local4125) {
																	Static273.method4496(Static134.anIntArray480[1], Static134.anIntArray480[2]);
																}
															}
															continue;
														}
														if (local37 == 5215) {
															local9 -= 2;
															local629 = Static73.anIntArray136[local9];
															local634 = Static73.anIntArray136[local9 + 1];
															@Pc(4820) Class115 local4820 = Static228.method1197(local629 >> 14 & 0x3FFF, local629 & 0x3FFF);
															local4822 = false;
															for (@Pc(4827) Class3_Sub4_Sub14 local4827 = (Class3_Sub4_Sub14) local4820.method2879(); local4827 != null; local4827 = (Class3_Sub4_Sub14) local4820.method2885()) {
																if (local4827.anInt2659 == local634) {
																	local4822 = true;
																	break;
																}
															}
															if (local4822) {
																Static73.anIntArray136[local9++] = 1;
															} else {
																Static73.anIntArray136[local9++] = 0;
															}
															continue;
														}
														if (local37 == 5218) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static228.method1189(local629);
															if (local4450 == null) {
																Static73.anIntArray136[local9++] = -1;
															} else {
																Static73.anIntArray136[local9++] = local4450.anInt2665;
															}
															continue;
														}
														if (local37 == 5220) {
															Static73.anIntArray136[local9++] = Static155.anInt2919 == 100 ? 1 : 0;
															continue;
														}
														if (local37 == 5221) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															Static273.method4496(local629 >> 14 & 0x3FFF, local629 & 0x3FFF);
															continue;
														}
														if (local37 == 5222) {
															local4480 = Static31.method473();
															if (local4480 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = -1;
															} else {
																local4957 = local4480.method2356(Static134.anIntArray480, Static228.anInt1431 + Static158.anInt2949, Static228.anInt1435 + -Static168.anInt3167 + Static228.anInt1432 + -1);
																if (local4957) {
																	Static73.anIntArray136[local9++] = Static134.anIntArray480[1];
																	Static73.anIntArray136[local9++] = Static134.anIntArray480[2];
																} else {
																	Static73.anIntArray136[local9++] = -1;
																	Static73.anIntArray136[local9++] = -1;
																}
															}
															continue;
														}
														if (local37 == 5223) {
															local9 -= 2;
															local634 = Static73.anIntArray136[local9 + 1];
															local629 = Static73.anIntArray136[local9];
															Static186.method3129(false, local634 >> 14 & 0x3FFF, local629, local634 & 0x3FFF);
															continue;
														}
														if (local37 == 5224) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static31.method473();
															if (local4450 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = -1;
															} else {
																local4125 = local4450.method2353(local629 & 0x3FFF, local629 >> 14 & 0x3FFF, local629 >> 28 & 0x3, Static134.anIntArray480);
																if (local4125) {
																	Static73.anIntArray136[local9++] = Static134.anIntArray480[1];
																	Static73.anIntArray136[local9++] = Static134.anIntArray480[2];
																} else {
																	Static73.anIntArray136[local9++] = -1;
																	Static73.anIntArray136[local9++] = -1;
																}
															}
															continue;
														}
														if (local37 == 5225) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local4450 = Static31.method473();
															if (local4450 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = -1;
															} else {
																local4125 = local4450.method2356(Static134.anIntArray480, local629 >> 14 & 0x3FFF, local629 & 0x3FFF);
																if (local4125) {
																	Static73.anIntArray136[local9++] = Static134.anIntArray480[1];
																	Static73.anIntArray136[local9++] = Static134.anIntArray480[2];
																} else {
																	Static73.anIntArray136[local9++] = -1;
																	Static73.anIntArray136[local9++] = -1;
																}
															}
															continue;
														}
														if (local37 == 5226) {
															local9--;
															Static181.method3050(Static73.anIntArray136[local9]);
															continue;
														}
														if (local37 == 5227) {
															local9 -= 2;
															local634 = Static73.anIntArray136[local9 + 1];
															local629 = Static73.anIntArray136[local9];
															Static186.method3129(true, local634 >> 14 & 0x3FFF, local629, local634 & 0x3FFF);
															continue;
														}
														if (local37 == 5228) {
															local9--;
															Static96.aBoolean144 = Static73.anIntArray136[local9] == 1;
															continue;
														}
														if (local37 == 5229) {
															Static73.anIntArray136[local9++] = Static96.aBoolean144 ? 1 : 0;
															continue;
														}
														if (local37 == 5230) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															Static253.method4287(local629);
															continue;
														}
														@Pc(5290) Class3 local5290;
														if (local37 == 5231) {
															local9 -= 2;
															local629 = Static73.anIntArray136[local9];
															local4957 = Static73.anIntArray136[local9 + 1] == 1;
															if (Static51.aClass30_8 == null) {
																continue;
															}
															local5290 = Static51.aClass30_8.method663((long) local629);
															if (local5290 != null && !local4957) {
																local5290.method5013();
																continue;
															}
															if (local5290 == null && local4957) {
																local5290 = new Class3();
																Static51.aClass30_8.method668(local5290, (long) local629);
															}
															continue;
														}
														@Pc(5333) Class3 local5333;
														if (local37 == 5232) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (Static51.aClass30_8 == null) {
																Static73.anIntArray136[local9++] = 0;
															} else {
																local5333 = Static51.aClass30_8.method663((long) local629);
																Static73.anIntArray136[local9++] = local5333 == null ? 0 : 1;
															}
															continue;
														}
														if (local37 == 5233) {
															local9 -= 2;
															local629 = Static73.anIntArray136[local9];
															local4957 = Static73.anIntArray136[local9 + 1] == 1;
															if (Static130.aClass30_15 == null) {
																continue;
															}
															local5290 = Static130.aClass30_15.method663((long) local629);
															if (local5290 != null && !local4957) {
																local5290.method5013();
																continue;
															}
															if (local5290 == null && local4957) {
																local5290 = new Class3();
																Static130.aClass30_15.method668(local5290, (long) local629);
															}
															continue;
														}
														if (local37 == 5234) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (Static130.aClass30_15 == null) {
																Static73.anIntArray136[local9++] = 0;
															} else {
																local5333 = Static130.aClass30_15.method663((long) local629);
																Static73.anIntArray136[local9++] = local5333 == null ? 0 : 1;
															}
															continue;
														}
														if (local37 == 5235) {
															Static73.anIntArray136[local9++] = Static228.aClass3_Sub4_Sub14_2 == null ? -1 : Static228.aClass3_Sub4_Sub14_2.anInt2659;
															continue;
														}
													} else if (local37 < 5400) {
														if (local37 == 5300) {
															local9 -= 2;
															local634 = Static73.anIntArray136[local9 + 1];
															local629 = Static73.anIntArray136[local9];
															Static203.method3359(local634, false, local629, 3);
															Static73.anIntArray136[local9++] = Static73.aFrame1 == null ? 0 : 1;
															continue;
														}
														if (local37 == 5301) {
															if (Static73.aFrame1 != null) {
																Static203.method3359(-1, false, -1, Static255.anInt5254);
															}
															continue;
														}
														if (local37 == 5302) {
															@Pc(5524) Class165[] local5524 = Static309.method4970();
															Static73.anIntArray136[local9++] = local5524.length;
															continue;
														}
														if (local37 == 5303) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															@Pc(5546) Class165[] local5546 = Static309.method4970();
															Static73.anIntArray136[local9++] = local5546[local629].anInt5349;
															Static73.anIntArray136[local9++] = local5546[local629].anInt5350;
															continue;
														}
														if (local37 == 5305) {
															local634 = Static132.anInt2491;
															local629 = Static187.anInt3701;
															local873 = -1;
															@Pc(5578) Class165[] local5578 = Static309.method4970();
															for (local3702 = 0; local3702 < local5578.length; local3702++) {
																@Pc(5588) Class165 local5588 = local5578[local3702];
																if (local5588.anInt5349 == local629 && local5588.anInt5350 == local634) {
																	local873 = local3702;
																	break;
																}
															}
															Static73.anIntArray136[local9++] = local873;
															continue;
														}
														if (local37 == 5306) {
															Static73.anIntArray136[local9++] = Static254.method4299();
															continue;
														}
														if (local37 == 5307) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0 || local629 > 2) {
																local629 = 0;
															}
															Static203.method3359(-1, false, -1, local629);
															continue;
														}
														if (local37 == 5308) {
															Static73.anIntArray136[local9++] = Static255.anInt5254;
															continue;
														}
														if (local37 == 5309) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0 || local629 > 2) {
																local629 = 0;
															}
															Static255.anInt5254 = local629;
															Static188.method3143(Static274.aClass176_4);
															continue;
														}
													} else if (local37 < 5500) {
														if (local37 == 5400) {
															local11 -= 2;
															local2582 = Static28.aStringArray6[local11 + 1];
															local9--;
															local873 = Static73.anIntArray136[local9];
															local425 = Static28.aStringArray6[local11];
															Static215.aClass3_Sub26_Sub1_2.method3958(246);
															Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(local425) + Static147.method2494(local2582) + 1);
															Static215.aClass3_Sub26_Sub1_2.method3914(local425);
															Static215.aClass3_Sub26_Sub1_2.method3914(local2582);
															Static215.aClass3_Sub26_Sub1_2.method3907(local873);
															continue;
														}
														if (local37 == 5401) {
															local9 -= 2;
															Static14.aShortArray3[Static73.anIntArray136[local9]] = (short) Static241.method4083(Static73.anIntArray136[local9 + 1]);
															Static47.method4906();
															Static307.method4930();
															Static41.method571();
															Static77.method1209();
															Static199.method3282();
															continue;
														}
														if (local37 == 5405) {
															local9 -= 2;
															local634 = Static73.anIntArray136[local9 + 1];
															local629 = Static73.anIntArray136[local9];
															if (local629 >= 0 && local629 < 2) {
																Static153.anIntArrayArrayArray11[local629] = new int[local634 << 1][4];
															}
															continue;
														}
														if (local37 == 5406) {
															local9 -= 7;
															local629 = Static73.anIntArray136[local9];
															local634 = Static73.anIntArray136[local9 + 1] << 1;
															local873 = Static73.anIntArray136[local9 + 2];
															local469 = Static73.anIntArray136[local9 + 3];
															local3702 = Static73.anIntArray136[local9 + 4];
															local907 = Static73.anIntArray136[local9 + 5];
															@Pc(8693) int local8693 = Static73.anIntArray136[local9 + 6];
															if (local629 >= 0 && local629 < 2 && Static153.anIntArrayArrayArray11[local629] != null && local634 >= 0 && Static153.anIntArrayArrayArray11[local629].length > local634) {
																Static153.anIntArrayArrayArray11[local629][local634] = new int[] { (local873 >> 14 & 0x3FFF) * 128, local469, (local873 & 0x3FFF) * 128, local8693 };
																Static153.anIntArrayArrayArray11[local629][local634 + 1] = new int[] { (local3702 >> 14 & 0x3FFF) * 128, local907, (local3702 & 0x3FFF) * 128 };
															}
															continue;
														}
														if (local37 == 5407) {
															local9--;
															local629 = Static153.anIntArrayArrayArray11[Static73.anIntArray136[local9]].length >> 1;
															Static73.anIntArray136[local9++] = local629;
															continue;
														}
														if (local37 == 5411) {
															if (Static73.aFrame1 != null) {
																Static203.method3359(-1, false, -1, Static255.anInt5254);
															}
															if (Static276.aFrame2 == null) {
																Static17.method291(Static157.method2610(), false);
															} else {
																System.exit(0);
															}
															continue;
														}
														if (local37 == 5419) {
															local425 = "";
															if (Static220.aClass178_5 != null) {
																if (Static220.aClass178_5.anObject6 == null) {
																	local425 = Static291.method4772(Static220.aClass178_5.anInt5647);
																} else {
																	local425 = (String) Static220.aClass178_5.anObject6;
																}
															}
															Static28.aStringArray6[local11++] = local425;
															continue;
														}
														if (local37 == 5420) {
															Static73.anIntArray136[local9++] = Static275.anInt5563 == 3 ? 1 : 0;
															continue;
														}
														if (local37 == 5421) {
															if (Static73.aFrame1 != null) {
																Static203.method3359(-1, false, -1, Static255.anInt5254);
															}
															local11--;
															local425 = Static28.aStringArray6[local11];
															local9--;
															local4957 = Static73.anIntArray136[local9] == 1;
															@Pc(8926) String local8926 = Static157.method2610() + local425;
															if (Static276.aFrame2 != null || local4957 && Static275.anInt5563 != 3 && Static275.aString208.startsWith("win") && !Static62.aBoolean87) {
																Static85.aString63 = local8926;
																Static306.aBoolean428 = local4957;
																Static120.aClass178_1 = Static274.aClass176_4.method4517(local8926);
																continue;
															}
															Static17.method291(local8926, local4957);
															continue;
														}
														if (local37 == 5422) {
															local11 -= 2;
															local425 = Static28.aStringArray6[local11];
															local2582 = Static28.aStringArray6[local11 + 1];
															local9--;
															local873 = Static73.anIntArray136[local9];
															if (local425.length() > 0) {
																if (Static204.aStringArray27 == null) {
																	Static204.aStringArray27 = new String[Static238.anIntArray528[Static47.anInt5990]];
																}
																Static204.aStringArray27[local873] = local425;
															}
															if (local2582.length() > 0) {
																if (Static235.aStringArray32 == null) {
																	Static235.aStringArray32 = new String[Static238.anIntArray528[Static47.anInt5990]];
																}
																Static235.aStringArray32[local873] = local2582;
															}
															continue;
														}
														if (local37 == 5423) {
															local11--;
															System.out.println(Static28.aStringArray6[local11]);
															continue;
														}
														if (local37 == 5424) {
															local9 -= 11;
															Static141.anInt2720 = Static73.anIntArray136[local9];
															Static214.anInt4182 = Static73.anIntArray136[local9 + 1];
															Static222.anInt4337 = Static73.anIntArray136[local9 + 2];
															Static235.anInt4701 = Static73.anIntArray136[local9 + 3];
															Static17.anInt328 = Static73.anIntArray136[local9 + 4];
															Static145.anInt2773 = Static73.anIntArray136[local9 + 5];
															Static260.anInt5354 = Static73.anIntArray136[local9 + 6];
															Static146.anInt5858 = Static73.anIntArray136[local9 + 7];
															Static111.anInt2061 = Static73.anIntArray136[local9 + 8];
															Static197.anInt5232 = Static73.anIntArray136[local9 + 9];
															Static168.anInt3170 = Static73.anIntArray136[local9 + 10];
															Static65.aClass155_31.method4133(Static17.anInt328);
															Static65.aClass155_31.method4133(Static145.anInt2773);
															Static65.aClass155_31.method4133(Static260.anInt5354);
															Static65.aClass155_31.method4133(Static146.anInt5858);
															Static65.aClass155_31.method4133(Static111.anInt2061);
															Static34.aBoolean53 = true;
															continue;
														}
														if (local37 == 5425) {
															Static83.method1276();
															Static34.aBoolean53 = false;
															continue;
														}
														if (local37 == 5426) {
															local9--;
															Static257.anInt5293 = Static73.anIntArray136[local9];
															continue;
														}
														if (local37 == 5427) {
															local9 -= 2;
															Static270.anInt5516 = Static73.anIntArray136[local9];
															Static229.anInt4480 = Static73.anIntArray136[local9 + 1];
															continue;
														}
														if (local37 == 5428) {
															local9 -= 2;
															local629 = Static73.anIntArray136[local9];
															local634 = Static73.anIntArray136[local9 + 1];
															Static73.anIntArray136[local9++] = Static285.method4730(local634, local629) ? 1 : 0;
															continue;
														}
													} else if (local37 < 5600) {
														if (local37 == 5500) {
															local9 -= 4;
															local629 = Static73.anIntArray136[local9];
															local873 = Static73.anIntArray136[local9 + 2];
															local634 = Static73.anIntArray136[local9 + 1];
															local469 = Static73.anIntArray136[local9 + 3];
															Static123.method2052((local629 & 0x3FFF) - Static43.anInt798, -anInt1844 + (local629 >> 14 & 0x3FFF), false, local634, local469, local873);
															continue;
														}
														if (local37 == 5501) {
															local9 -= 4;
															local629 = Static73.anIntArray136[local9];
															local634 = Static73.anIntArray136[local9 + 1];
															local873 = Static73.anIntArray136[local9 + 2];
															local469 = Static73.anIntArray136[local9 + 3];
															Static204.method3391((local629 >> 14 & 0x3FFF) - anInt1844, -Static43.anInt798 + (local629 & 0x3FFF), local873, local469, local634);
															continue;
														}
														if (local37 == 5502) {
															local9 -= 6;
															local629 = Static73.anIntArray136[local9];
															if (local629 >= 2) {
																throw new RuntimeException();
															}
															Static257.anInt5292 = local629;
															local634 = Static73.anIntArray136[local9 + 1];
															if (Static153.anIntArrayArrayArray11[Static257.anInt5292].length >> 1 <= local634 + 1) {
																throw new RuntimeException();
															}
															Static123.anInt2319 = local634;
															Static75.anInt1409 = 0;
															Static107.anInt1969 = Static73.anIntArray136[local9 + 2];
															Static282.anInt5667 = Static73.anIntArray136[local9 + 3];
															local873 = Static73.anIntArray136[local9 + 4];
															if (local873 >= 2) {
																throw new RuntimeException();
															}
															Static102.anInt1860 = local873;
															local469 = Static73.anIntArray136[local9 + 5];
															if (Static153.anIntArrayArrayArray11[Static102.anInt1860].length >> 1 <= local469 + 1) {
																throw new RuntimeException();
															}
															Static145.anInt2777 = local469;
															Static25.anInt467 = 3;
															continue;
														}
														if (local37 == 5503) {
															Static291.method4773();
															continue;
														}
														if (local37 == 5504) {
															local9 -= 2;
															Static23.method363(Static73.anIntArray136[local9 + 1], Static73.anIntArray136[local9]);
															continue;
														}
														if (local37 == 5505) {
															Static73.anIntArray136[local9++] = (int) Static179.aFloat48;
															continue;
														}
														if (local37 == 5506) {
															Static73.anIntArray136[local9++] = (int) Static84.aFloat21;
															continue;
														}
														if (local37 == 5507) {
															Static52.method824();
															continue;
														}
														if (local37 == 5508) {
															Static224.method4974();
															continue;
														}
														if (local37 == 5509) {
															Static256.method4336();
															continue;
														}
														if (local37 == 5510) {
															Static102.method1625();
															continue;
														}
														if (local37 == 5511) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															Static25.anInt467 = 4;
															local634 = local629 >> 14 & 0x3FFF;
															local634 -= anInt1844;
															if (local634 < 0) {
																local634 = 0;
															} else if (local634 >= 104) {
																local634 = 104;
															}
															Static224.anInt6078 = local634 * 128 + 64;
															local873 = local629 & 0x3FFF;
															local873 -= Static43.anInt798;
															if (local873 < 0) {
																local873 = 0;
															} else if (local873 >= 104) {
																local873 = 104;
															}
															Static306.anInt6010 = local873 * 128 + 64;
															continue;
														}
														if (local37 == 5512) {
															Static38.method559();
															continue;
														}
													} else if (local37 < 5700) {
														if (local37 == 5600) {
															local11 -= 2;
															local425 = Static28.aStringArray6[local11];
															local9--;
															local873 = Static73.anIntArray136[local9];
															local2582 = Static28.aStringArray6[local11 + 1];
															if (Static10.anInt190 == 10 && Static304.anInt5996 == 0 && Static241.anInt4885 == 0 && Static214.anInt4184 == 0 && Static89.anInt1663 == 0) {
																Static94.method1385(local425, local873, local2582);
															}
															continue;
														}
														if (local37 == 5601) {
															Static113.method1825();
															continue;
														}
														if (local37 == 5602) {
															if (Static241.anInt4885 == 0) {
																Static98.anInt1803 = -2;
															}
															continue;
														}
														if (local37 == 5603) {
															local9 -= 4;
															if (Static10.anInt190 == 10 && Static304.anInt5996 == 0 && Static241.anInt4885 == 0 && Static214.anInt4184 == 0 && Static89.anInt1663 == 0) {
																Static232.method3805(Static73.anIntArray136[local9 + 2], Static73.anIntArray136[local9 + 3], Static73.anIntArray136[local9 + 1], Static73.anIntArray136[local9]);
															}
															continue;
														}
														if (local37 == 5604) {
															local11--;
															if (Static10.anInt190 == 10 && Static304.anInt5996 == 0 && Static241.anInt4885 == 0 && Static214.anInt4184 == 0 && Static89.anInt1663 == 0) {
																Static18.method300(Static42.method615(Static28.aStringArray6[local11]));
															}
															continue;
														}
														if (local37 == 5605) {
															local9 -= 7;
															local11 -= 3;
															if (Static10.anInt190 == 10 && Static304.anInt5996 == 0 && Static241.anInt4885 == 0 && Static214.anInt4184 == 0 && Static89.anInt1663 == 0) {
																Static145.method2484(Static73.anIntArray136[local9 + 1], Static73.anIntArray136[local9 + 4] == 1, Static73.anIntArray136[local9 + 6] == 1, Static73.anIntArray136[local9], Static73.anIntArray136[local9 + 2], Static28.aStringArray6[local11 + 2], Static28.aStringArray6[local11 + 1], Static42.method615(Static28.aStringArray6[local11]), Static73.anIntArray136[local9 + 3], Static73.anIntArray136[local9 + 5] == 1);
															}
															continue;
														}
														if (local37 == 5606) {
															if (Static214.anInt4184 == 0) {
																Static205.anInt4056 = -2;
															}
															continue;
														}
														if (local37 == 5607) {
															Static73.anIntArray136[local9++] = Static98.anInt1803;
															continue;
														}
														if (local37 == 5608) {
															Static73.anIntArray136[local9++] = Static270.anInt5515;
															continue;
														}
														if (local37 == 5609) {
															Static73.anIntArray136[local9++] = Static205.anInt4056;
															continue;
														}
														if (local37 == 5610) {
															for (local629 = 0; local629 < 5; local629++) {
																Static28.aStringArray6[local11++] = local629 < Static9.aStringArray2.length ? Static123.method2050(Static9.aStringArray2[local629]) : "";
															}
															Static9.aStringArray2 = null;
															continue;
														}
														if (local37 == 5611) {
															Static73.anIntArray136[local9++] = Static267.anInt5436;
															continue;
														}
													} else if (local37 < 6100) {
														if (local37 == 6001) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 1) {
																local629 = 1;
															}
															if (local629 > 4) {
																local629 = 4;
															}
															Static251.anInt5174 = local629;
															if (!Static283.aBoolean393 || !Static67.aBoolean95) {
																if (Static251.anInt5174 == 1) {
																	Static16.method278(0.9F);
																}
																if (Static251.anInt5174 == 2) {
																	Static16.method278(0.8F);
																}
																if (Static251.anInt5174 == 3) {
																	Static16.method278(0.7F);
																}
																if (Static251.anInt5174 == 4) {
																	Static16.method278(0.6F);
																}
															}
															if (Static283.aBoolean393) {
																Static13.method193();
																if (!Static67.aBoolean95) {
																	Static57.method920();
																}
															}
															Static307.method4930();
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6002) {
															local9--;
															Static48.method761(Static73.anIntArray136[local9] == 1);
															Static149.method2520();
															Static57.method920();
															Static103.method1664();
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6003) {
															local9--;
															Static76.aBoolean127 = Static73.anIntArray136[local9] == 1;
															Static103.method1664();
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6005) {
															local9--;
															Static201.aBoolean280 = Static73.anIntArray136[local9] == 1;
															Static57.method920();
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6006) {
															local9--;
															Static258.aBoolean367 = Static73.anIntArray136[local9] == 1;
															((Class91_Sub1) Static16.anInterface4_1).method2911(!Static258.aBoolean367);
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6007) {
															local9--;
															Static40.aBoolean431 = Static73.anIntArray136[local9] == 1;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6008) {
															local9--;
															Static315.aBoolean435 = Static73.anIntArray136[local9] == 1;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6009) {
															local9--;
															Static241.aBoolean341 = Static73.anIntArray136[local9] == 1;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6010) {
															local9--;
															Static199.aBoolean275 = Static73.anIntArray136[local9] == 1;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6011) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0 || local629 > 2) {
																local629 = 0;
															}
															Static86.anInt1599 = local629;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6012) {
															if (Static283.aBoolean393) {
																Static53.method5036(0, 0);
															}
															local9--;
															Static67.aBoolean95 = Static73.anIntArray136[local9] == 1;
															if (Static283.aBoolean393 && Static67.aBoolean95) {
																Static16.method278(0.7F);
															} else {
																if (Static251.anInt5174 == 1) {
																	Static16.method278(0.9F);
																}
																if (Static251.anInt5174 == 2) {
																	Static16.method278(0.8F);
																}
																if (Static251.anInt5174 == 3) {
																	Static16.method278(0.7F);
																}
																if (Static251.anInt5174 == 4) {
																	Static16.method278(0.6F);
																}
															}
															Static57.method920();
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6014) {
															local9--;
															Static66.aBoolean94 = Static73.anIntArray136[local9] == 1;
															if (Static283.aBoolean393) {
																Static57.method920();
															}
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6015) {
															local9--;
															Static218.aBoolean307 = Static73.anIntArray136[local9] == 1;
															if (Static283.aBoolean393) {
																Static13.method193();
															}
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6016) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (Static283.aBoolean393) {
																Static90.aBoolean137 = true;
															}
															if (local629 < 0 || local629 > 2) {
																local629 = 0;
															}
															Static268.anInt5481 = local629;
															continue;
														}
														if (local37 == 6017) {
															local9--;
															Static110.aBoolean160 = Static73.anIntArray136[local9] == 1;
															Static126.method2192();
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6018) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0) {
																local629 = 0;
															}
															if (local629 > 127) {
																local629 = 127;
															}
															Static177.anInt3306 = local629;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6019) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0) {
																local629 = 0;
															}
															if (local629 > 255) {
																local629 = 255;
															}
															if (Static220.anInt5204 != local629) {
																if (Static220.anInt5204 == 0 && Static201.anInt3962 != -1) {
																	Static175.method2876(local629, Static201.anInt3962, Static257.aClass155_106);
																	Static73.aBoolean123 = false;
																} else if (local629 == 0) {
																	Static15.method3530();
																	Static73.aBoolean123 = false;
																} else {
																	Static292.method4797(local629);
																}
																Static220.anInt5204 = local629;
															}
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6020) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0) {
																local629 = 0;
															}
															if (local629 > 127) {
																local629 = 127;
															}
															Static305.anInt6006 = local629;
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															continue;
														}
														if (local37 == 6021) {
															local9--;
															Static132.aBoolean188 = Static73.anIntArray136[local9] == 1;
															Static103.method1664();
															continue;
														}
														if (local37 == 6023) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0) {
																local629 = 0;
															}
															if (local629 > 2) {
																local629 = 2;
															}
															local4957 = false;
															if (Static258.anInt5304 < 96) {
																local4957 = true;
																local629 = 0;
															}
															Static71.method1077(local629);
															Static188.method3143(Static274.aClass176_4);
															Static239.aBoolean340 = false;
															Static73.anIntArray136[local9++] = local4957 ? 0 : 1;
															continue;
														}
														if (local37 == 6024) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0 || local629 > 2) {
																local629 = 0;
															}
															Static120.anInt2254 = local629;
															Static188.method3143(Static274.aClass176_4);
															continue;
														}
														if (local37 == 6027) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (!Static283.aBoolean393) {
																continue;
															}
															if (local629 < 0 || local629 > 1) {
																local629 = 0;
															}
															Static178.method2943(local629 == 1);
															continue;
														}
														if (local37 == 6028) {
															local9--;
															Static57.aBoolean82 = Static73.anIntArray136[local9] != 0;
															Static188.method3143(Static274.aClass176_4);
															continue;
														}
													} else if (local37 < 6200) {
														if (local37 == 6101) {
															Static73.anIntArray136[local9++] = Static251.anInt5174;
															continue;
														}
														if (local37 == 6102) {
															Static73.anIntArray136[local9++] = Static208.method3462() ? 1 : 0;
															continue;
														}
														if (local37 == 6103) {
															Static73.anIntArray136[local9++] = Static76.aBoolean127 ? 1 : 0;
															continue;
														}
														if (local37 == 6105) {
															Static73.anIntArray136[local9++] = Static201.aBoolean280 ? 1 : 0;
															continue;
														}
														if (local37 == 6106) {
															Static73.anIntArray136[local9++] = Static258.aBoolean367 ? 1 : 0;
															continue;
														}
														if (local37 == 6107) {
															Static73.anIntArray136[local9++] = Static40.aBoolean431 ? 1 : 0;
															continue;
														}
														if (local37 == 6108) {
															Static73.anIntArray136[local9++] = Static315.aBoolean435 ? 1 : 0;
															continue;
														}
														if (local37 == 6109) {
															Static73.anIntArray136[local9++] = Static241.aBoolean341 ? 1 : 0;
															continue;
														}
														if (local37 == 6110) {
															Static73.anIntArray136[local9++] = Static199.aBoolean275 ? 1 : 0;
															continue;
														}
														if (local37 == 6111) {
															Static73.anIntArray136[local9++] = Static86.anInt1599;
															continue;
														}
														if (local37 == 6112) {
															Static73.anIntArray136[local9++] = Static67.aBoolean95 ? 1 : 0;
															continue;
														}
														if (local37 == 6114) {
															Static73.anIntArray136[local9++] = Static66.aBoolean94 ? 1 : 0;
															continue;
														}
														if (local37 == 6115) {
															Static73.anIntArray136[local9++] = Static218.aBoolean307 ? 1 : 0;
															continue;
														}
														if (local37 == 6116) {
															Static73.anIntArray136[local9++] = Static268.anInt5481;
															continue;
														}
														if (local37 == 6117) {
															Static73.anIntArray136[local9++] = Static110.aBoolean160 ? 1 : 0;
															continue;
														}
														if (local37 == 6118) {
															Static73.anIntArray136[local9++] = Static177.anInt3306;
															continue;
														}
														if (local37 == 6119) {
															Static73.anIntArray136[local9++] = Static220.anInt5204;
															continue;
														}
														if (local37 == 6120) {
															Static73.anIntArray136[local9++] = Static305.anInt6006;
															continue;
														}
														if (local37 == 6121) {
															if (Static283.aBoolean393) {
																Static73.anIntArray136[local9++] = Static283.aBoolean397 ? 1 : 0;
															} else {
																Static73.anIntArray136[local9++] = 0;
															}
															continue;
														}
														if (local37 == 6123) {
															Static73.anIntArray136[local9++] = Static71.method1079();
															continue;
														}
														if (local37 == 6124) {
															Static73.anIntArray136[local9++] = Static120.anInt2254;
															continue;
														}
														if (local37 == 6126) {
															if (Static283.aBoolean393) {
																Static73.anIntArray136[local9++] = Static30.method467() ? 1 : 0;
															} else {
																Static73.anIntArray136[local9++] = 0;
															}
															continue;
														}
														if (local37 == 6127) {
															Static73.anIntArray136[local9++] = Static17.aBoolean31 ? 1 : 0;
															continue;
														}
														if (local37 == 6128) {
															Static73.anIntArray136[local9++] = Static57.aBoolean82 ? 1 : 0;
															continue;
														}
													} else if (local37 < 6300) {
														if (local37 == 6200) {
															local9 -= 2;
															Static279.aShort50 = (short) Static73.anIntArray136[local9];
															if (Static279.aShort50 <= 0) {
																Static279.aShort50 = 256;
															}
															Static45.aShort1 = (short) Static73.anIntArray136[local9 + 1];
															if (Static45.aShort1 <= 0) {
																Static45.aShort1 = 205;
															}
															continue;
														}
														if (local37 == 6201) {
															local9 -= 2;
															Static308.aShort51 = (short) Static73.anIntArray136[local9];
															if (Static308.aShort51 <= 0) {
																Static308.aShort51 = 256;
															}
															Static109.aShort34 = (short) Static73.anIntArray136[local9 + 1];
															if (Static109.aShort34 <= 0) {
																Static109.aShort34 = 320;
															}
															continue;
														}
														if (local37 == 6202) {
															local9 -= 4;
															Static219.aShort37 = (short) Static73.anIntArray136[local9];
															if (Static219.aShort37 <= 0) {
																Static219.aShort37 = 1;
															}
															Static115.aShort24 = (short) Static73.anIntArray136[local9 + 1];
															if (Static115.aShort24 <= 0) {
																Static115.aShort24 = 32767;
															} else if (Static219.aShort37 > Static115.aShort24) {
																Static115.aShort24 = Static219.aShort37;
															}
															Static49.aShort10 = (short) Static73.anIntArray136[local9 + 2];
															if (Static49.aShort10 <= 0) {
																Static49.aShort10 = 1;
															}
															Static109.aShort33 = (short) Static73.anIntArray136[local9 + 3];
															if (Static109.aShort33 <= 0) {
																Static109.aShort33 = 32767;
															} else if (Static109.aShort33 < Static49.aShort10) {
																Static109.aShort33 = Static49.aShort10;
															}
															continue;
														}
														if (local37 == 6203) {
															Static124.method2081(false, Static186.aClass151_9.anInt4751, 0, Static186.aClass151_9.anInt4773, 0);
															Static73.anIntArray136[local9++] = Static62.anInt1157;
															Static73.anIntArray136[local9++] = Static250.anInt5158;
															continue;
														}
														if (local37 == 6204) {
															Static73.anIntArray136[local9++] = Static308.aShort51;
															Static73.anIntArray136[local9++] = Static109.aShort34;
															continue;
														}
														if (local37 == 6205) {
															Static73.anIntArray136[local9++] = Static279.aShort50;
															Static73.anIntArray136[local9++] = Static45.aShort1;
															continue;
														}
													} else if (local37 < 6400) {
														if (local37 == 6300) {
															Static73.anIntArray136[local9++] = (int) (Static128.method2196() / 60000L);
															continue;
														}
														if (local37 == 6301) {
															Static73.anIntArray136[local9++] = (int) (Static128.method2196() / 86400000L) - 11745;
															continue;
														}
														if (local37 == 6302) {
															local9 -= 3;
															local634 = Static73.anIntArray136[local9 + 1];
															local629 = Static73.anIntArray136[local9];
															local873 = Static73.anIntArray136[local9 + 2];
															Static151.aCalendar1.clear();
															Static151.aCalendar1.set(11, 12);
															Static151.aCalendar1.set(local873, local634, local629);
															Static73.anIntArray136[local9++] = (int) (Static151.aCalendar1.getTime().getTime() / 86400000L) - 11745;
															continue;
														}
														if (local37 == 6303) {
															Static151.aCalendar1.clear();
															Static151.aCalendar1.setTime(new Date(Static128.method2196()));
															Static73.anIntArray136[local9++] = Static151.aCalendar1.get(1);
															continue;
														}
														if (local37 == 6304) {
															local4957 = true;
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (local629 < 0) {
																local4957 = (local629 + 1) % 4 == 0;
															} else if (local629 < 1582) {
																local4957 = local629 % 4 == 0;
															} else if (local629 % 4 != 0) {
																local4957 = false;
															} else if (local629 % 100 != 0) {
																local4957 = true;
															} else if (local629 % 400 != 0) {
																local4957 = false;
															}
															Static73.anIntArray136[local9++] = local4957 ? 1 : 0;
															continue;
														}
													} else if (local37 < 6500) {
														if (local37 == 6405) {
															Static73.anIntArray136[local9++] = Static237.method4013() ? 1 : 0;
															continue;
														}
														if (local37 == 6406) {
															Static73.anIntArray136[local9++] = Static253.method4286() ? 1 : 0;
															continue;
														}
													} else if (local37 < 6600) {
														if (local37 == 6500) {
															if (Static10.anInt190 == 10 && Static304.anInt5996 == 0 && Static241.anInt4885 == 0 && Static214.anInt4184 == 0) {
																Static73.anIntArray136[local9++] = Static284.method4681() == -1 ? 0 : 1;
																continue;
															}
															Static73.anIntArray136[local9++] = 1;
															continue;
														}
														@Pc(6159) Class99 local6159;
														@Pc(6135) Class87_Sub1 local6135;
														if (local37 == 6501) {
															local6135 = Static135.method2328();
															if (local6135 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = 0;
																Static28.aStringArray6[local11++] = "";
																Static73.anIntArray136[local9++] = 0;
																Static28.aStringArray6[local11++] = "";
																Static73.anIntArray136[local9++] = 0;
															} else {
																Static73.anIntArray136[local9++] = local6135.anInt4366;
																Static73.anIntArray136[local9++] = local6135.anInt4355;
																Static28.aStringArray6[local11++] = local6135.aString156;
																local6159 = local6135.method3648();
																Static73.anIntArray136[local9++] = local6159.anInt2889;
																Static28.aStringArray6[local11++] = local6159.aString105;
																Static73.anIntArray136[local9++] = local6135.anInt4358;
															}
															continue;
														}
														if (local37 == 6502) {
															local6135 = Static178.method2941();
															if (local6135 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static73.anIntArray136[local9++] = 0;
																Static28.aStringArray6[local11++] = "";
																Static73.anIntArray136[local9++] = 0;
																Static28.aStringArray6[local11++] = "";
																Static73.anIntArray136[local9++] = 0;
															} else {
																Static73.anIntArray136[local9++] = local6135.anInt4366;
																Static73.anIntArray136[local9++] = local6135.anInt4355;
																Static28.aStringArray6[local11++] = local6135.aString156;
																local6159 = local6135.method3648();
																Static73.anIntArray136[local9++] = local6159.anInt2889;
																Static28.aStringArray6[local11++] = local6159.aString105;
																Static73.anIntArray136[local9++] = local6135.anInt4358;
															}
															continue;
														}
														if (local37 == 6503) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															if (Static10.anInt190 == 10 && Static304.anInt5996 == 0 && Static241.anInt4885 == 0 && Static214.anInt4184 == 0) {
																Static73.anIntArray136[local9++] = Static155.method2592(local629) ? 1 : 0;
																continue;
															}
															Static73.anIntArray136[local9++] = 0;
															continue;
														}
														if (local37 == 6504) {
															local9--;
															Static27.anInt489 = Static73.anIntArray136[local9];
															Static188.method3143(Static274.aClass176_4);
															continue;
														}
														if (local37 == 6505) {
															Static73.anIntArray136[local9++] = Static27.anInt489;
															continue;
														}
														if (local37 == 6506) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															@Pc(6379) Class87_Sub1 local6379 = Static102.method1627(local629);
															if (local6379 == null) {
																Static73.anIntArray136[local9++] = -1;
																Static28.aStringArray6[local11++] = "";
																Static73.anIntArray136[local9++] = 0;
																Static28.aStringArray6[local11++] = "";
																Static73.anIntArray136[local9++] = 0;
															} else {
																Static73.anIntArray136[local9++] = local6379.anInt4355;
																Static28.aStringArray6[local11++] = local6379.aString156;
																@Pc(6425) Class99 local6425 = local6379.method3648();
																Static73.anIntArray136[local9++] = local6425.anInt2889;
																Static28.aStringArray6[local11++] = local6425.aString105;
																Static73.anIntArray136[local9++] = local6379.anInt4358;
															}
															continue;
														}
														if (local37 == 6507) {
															local9 -= 4;
															local629 = Static73.anIntArray136[local9];
															local873 = Static73.anIntArray136[local9 + 2];
															local4957 = Static73.anIntArray136[local9 + 1] == 1;
															local4822 = Static73.anIntArray136[local9 + 3] == 1;
															Static123.method2047(local4957, local629, local873, local4822);
															continue;
														}
													} else if (local37 < 6700) {
														if (local37 == 6600) {
															local9--;
															Static247.aBoolean348 = Static73.anIntArray136[local9] == 1;
															Static188.method3143(Static274.aClass176_4);
															continue;
														}
														if (local37 == 6601) {
															Static73.anIntArray136[local9++] = Static247.aBoolean348 ? 1 : 0;
															continue;
														}
													} else if (local37 < 6900) {
														@Pc(6547) Class40 local6547;
														if (local37 == 6800) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local6547 = Static96.method1438(local629);
															if (local6547.aString48 == null) {
																Static28.aStringArray6[local11++] = "";
															} else {
																Static28.aStringArray6[local11++] = local6547.aString48;
															}
															continue;
														}
														if (local37 == 6801) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local6547 = Static96.method1438(local629);
															Static73.anIntArray136[local9++] = local6547.anInt1169;
															continue;
														}
														if (local37 == 6802) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local6547 = Static96.method1438(local629);
															Static73.anIntArray136[local9++] = local6547.anInt1148;
															continue;
														}
														if (local37 == 6803) {
															local9--;
															local629 = Static73.anIntArray136[local9];
															local6547 = Static96.method1438(local629);
															Static73.anIntArray136[local9++] = local6547.anInt1166;
															continue;
														}
													}
												} else {
													if (local37 == 5100) {
														if (Static95.aBooleanArray39[86]) {
															Static73.anIntArray136[local9++] = 1;
														} else {
															Static73.anIntArray136[local9++] = 0;
														}
														continue;
													}
													if (local37 == 5101) {
														if (Static95.aBooleanArray39[82]) {
															Static73.anIntArray136[local9++] = 1;
														} else {
															Static73.anIntArray136[local9++] = 0;
														}
														continue;
													}
													if (local37 == 5102) {
														if (Static95.aBooleanArray39[81]) {
															Static73.anIntArray136[local9++] = 1;
														} else {
															Static73.anIntArray136[local9++] = 0;
														}
														continue;
													}
												}
											} else if (local37 == 4500) {
												local9 -= 2;
												local629 = Static73.anIntArray136[local9];
												local634 = Static73.anIntArray136[local9 + 1];
												local4337 = Static6.method109(local634);
												if (local4337.method942()) {
													Static28.aStringArray6[local11++] = Static249.method4213(local629).method524(local634, local4337.aString44);
												} else {
													Static73.anIntArray136[local9++] = Static249.method4213(local629).method525(local634, local4337.anInt1108);
												}
												continue;
											}
										} else if (local37 == 4400) {
											local9 -= 2;
											local634 = Static73.anIntArray136[local9 + 1];
											local629 = Static73.anIntArray136[local9];
											local4337 = Static6.method109(local634);
											if (local4337.method942()) {
												Static28.aStringArray6[local11++] = Static175.method2874(local629).method1121(local4337.aString44, local634);
											} else {
												Static73.anIntArray136[local9++] = Static175.method2874(local629).method1122(local634, local4337.anInt1108);
											}
											continue;
										}
									}
								} else {
									if (local37 == 4000) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = local634 + local629;
										continue;
									}
									if (local37 == 4001) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local629 - local634;
										continue;
									}
									if (local37 == 4002) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local634 * local629;
										continue;
									}
									if (local37 == 4003) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local629 / local634;
										continue;
									}
									if (local37 == 4004) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = (int) (Math.random() * (double) local629);
										continue;
									}
									if (local37 == 4005) {
										local9--;
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = (int) ((double) (local629 + 1) * Math.random());
										continue;
									}
									if (local37 == 4006) {
										local9 -= 5;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										local469 = Static73.anIntArray136[local9 + 3];
										local873 = Static73.anIntArray136[local9 + 2];
										local3702 = Static73.anIntArray136[local9 + 4];
										Static73.anIntArray136[local9++] = (local3702 - local873) * (local634 - local629) / (local469 - local873) + local629;
										continue;
									}
									@Pc(11719) long local11719;
									@Pc(11724) long local11724;
									if (local37 == 4007) {
										local9 -= 2;
										local11719 = Static73.anIntArray136[local9 + 1];
										local11724 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = (int) (local11724 * local11719 / 100L + local11724);
										continue;
									}
									if (local37 == 4008) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local629 | 0x1 << local634;
										continue;
									}
									if (local37 == 4009) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = -(0x1 << local634) - 1 & local629;
										continue;
									}
									if (local37 == 4010) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = (0x1 << local634 & local629) == 0 ? 0 : 1;
										continue;
									}
									if (local37 == 4011) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local629 % local634;
										continue;
									}
									if (local37 == 4012) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										if (local629 == 0) {
											Static73.anIntArray136[local9++] = 0;
										} else {
											Static73.anIntArray136[local9++] = (int) Math.pow((double) local629, (double) local634);
										}
										continue;
									}
									if (local37 == 4013) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										if (local629 == 0) {
											Static73.anIntArray136[local9++] = 0;
										} else if (local634 == 0) {
											Static73.anIntArray136[local9++] = Integer.MAX_VALUE;
										} else {
											Static73.anIntArray136[local9++] = (int) Math.pow((double) local629, 1.0D / (double) local634);
										}
										continue;
									}
									if (local37 == 4014) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = local629 & local634;
										continue;
									}
									if (local37 == 4015) {
										local9 -= 2;
										local634 = Static73.anIntArray136[local9 + 1];
										local629 = Static73.anIntArray136[local9];
										Static73.anIntArray136[local9++] = local634 | local629;
										continue;
									}
									if (local37 == 4016) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local634 <= local629 ? local634 : local629;
										continue;
									}
									if (local37 == 4017) {
										local9 -= 2;
										local629 = Static73.anIntArray136[local9];
										local634 = Static73.anIntArray136[local9 + 1];
										Static73.anIntArray136[local9++] = local634 >= local629 ? local634 : local629;
										continue;
									}
									if (local37 == 4018) {
										local9 -= 3;
										local11724 = Static73.anIntArray136[local9];
										local11719 = Static73.anIntArray136[local9 + 1];
										@Pc(12076) long local12076 = (long) Static73.anIntArray136[local9 + 2];
										Static73.anIntArray136[local9++] = (int) (local11724 * local12076 / local11719);
										continue;
									}
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15261) Exception local15261) {
			if (arg1.aString220 == null) {
				if (Static252.anInt5207 != 0) {
					Static199.method3284("Clientscript error - check log for details");
				}
				Static42.method613("CS2 - scr:" + arg1.aLong243 + " op:" + local21, local15261);
			} else {
				@Pc(15269) StringBuffer local15269 = new StringBuffer(30);
				local15269.append("%0a - in: ").append(arg1.aString220);
				for (local629 = Static253.anInt5223 - 1; local629 >= 0; local629--) {
					local15269.append("%0a - via: ").append(Static272.aClass28Array3[local629].aClass3_Sub4_Sub22_1.aString220);
				}
				if (local21 == 40) {
					local629 = local19[local13];
					local15269.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local629));
				}
				if (Static252.anInt5207 != 0) {
					Static199.method3284("Clientscript error in: " + arg1.aString220);
				}
				Static42.method613("CS2 - scr:" + arg1.aLong243 + " op:" + local21 + local15269.toString(), local15261);
			}
		}
	}
}

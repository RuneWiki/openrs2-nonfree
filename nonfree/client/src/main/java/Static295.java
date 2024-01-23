import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
	public static int anInt6138;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
	public static int[] anIntArray524 = new int[14];

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
	public static int[] anIntArray525 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "[I")
	public static int[] anIntArray526 = new int[100];

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
	public static int anInt6152 = 99;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!jd;BILclient!jd;I)Lclient!g;")
	public static Class2_Sub3_Sub5_Sub1 method4893(@OriginalArg(0) Class84 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class84 arg2) {
		return Static288.method4789(0, arg1, arg2) ? Static71.method1330(arg0.method2127(0, arg1)) : null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!bl;I)V")
	public static void method4894(@OriginalArg(1) Class2_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub3_Sub17 local18 = Static299.method2231(local14);
		if (local18 == null) {
			return;
		}
		Static33.anInt737 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = -1;
		@Pc(34) int[] local34 = local18.anIntArray265;
		@Pc(37) int[] local37 = local18.anIntArray264;
		@Pc(39) byte local39 = -1;
		@Pc(53) int local53;
		try {
			Static163.aStringArray14 = new String[local18.anInt3453];
			Static86.anIntArray140 = new int[local18.anInt3451];
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			@Pc(72) int local72;
			@Pc(177) String local177;
			for (local53 = 1; local53 < local8.length; local53++) {
				if (local8[local53] instanceof Integer) {
					local72 = (Integer) local8[local53];
					if (local72 == -2147483647) {
						local72 = arg0.anInt533;
					}
					if (local72 == -2147483646) {
						local72 = arg0.anInt534;
					}
					if (local72 == -2147483645) {
						local72 = arg0.aClass115_4 == null ? -1 : arg0.aClass115_4.anInt3552;
					}
					if (local72 == -2147483644) {
						local72 = arg0.anInt532;
					}
					if (local72 == -2147483643) {
						local72 = arg0.aClass115_4 == null ? -1 : arg0.aClass115_4.anInt3499;
					}
					if (local72 == -2147483642) {
						local72 = arg0.aClass115_2 == null ? -1 : arg0.aClass115_2.anInt3552;
					}
					if (local72 == -2147483641) {
						local72 = arg0.aClass115_2 == null ? -1 : arg0.aClass115_2.anInt3499;
					}
					if (local72 == -2147483640) {
						local72 = arg0.anInt535;
					}
					if (local72 == -2147483639) {
						local72 = arg0.anInt536;
					}
					Static86.anIntArray140[local49++] = local72;
				} else if (local8[local53] instanceof String) {
					local177 = (String) local8[local53];
					if (local177.equals("event_opbase")) {
						local177 = arg0.aString33;
					}
					Static163.aStringArray14[local51++] = local177;
				}
			}
			local53 = 0;
			label4448: while (true) {
				local53++;
				if (arg1 < local53) {
					throw new RuntimeException("slow");
				}
				local31++;
				@Pc(210) int local210 = local34[local31];
				@Pc(800) int local800;
				@Pc(794) int local794;
				@Pc(639) int local639;
				@Pc(594) String local594;
				@Pc(633) int[] local633;
				if (local210 < 100) {
					if (local210 == 0) {
						Static101.anIntArray517[local27++] = local37[local31];
						continue;
					}
					if (local210 == 1) {
						local72 = local37[local31];
						Static101.anIntArray517[local27++] = Static249.anIntArray446[local72];
						continue;
					}
					if (local210 == 2) {
						local72 = local37[local31];
						local27--;
						Static25.method4637(local72, Static101.anIntArray517[local27]);
						continue;
					}
					if (local210 == 3) {
						Static215.aStringArray23[local29++] = local18.aStringArray16[local31];
						continue;
					}
					if (local210 == 6) {
						local31 += local37[local31];
						continue;
					}
					if (local210 == 7) {
						local27 -= 2;
						if (Static101.anIntArray517[local27] != Static101.anIntArray517[local27 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local210 == 8) {
						local27 -= 2;
						if (Static101.anIntArray517[local27 + 1] == Static101.anIntArray517[local27]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local210 == 9) {
						local27 -= 2;
						if (Static101.anIntArray517[local27] < Static101.anIntArray517[local27 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local210 == 10) {
						local27 -= 2;
						if (Static101.anIntArray517[local27] > Static101.anIntArray517[local27 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local210 == 21) {
						if (Static33.anInt737 == 0) {
							return;
						}
						@Pc(403) Class123 local403 = Static222.aClass123Array1[--Static33.anInt737];
						local18 = local403.aClass2_Sub3_Sub17_1;
						local31 = local403.anInt3933;
						local34 = local18.anIntArray265;
						Static163.aStringArray14 = local403.aStringArray19;
						Static86.anIntArray140 = local403.anIntArray312;
						local37 = local18.anIntArray264;
						continue;
					}
					if (local210 == 25) {
						local72 = local37[local31];
						Static101.anIntArray517[local27++] = Static152.method2620(local72);
						continue;
					}
					if (local210 == 27) {
						local72 = local37[local31];
						local27--;
						Static288.method4793(Static101.anIntArray517[local27], local72);
						continue;
					}
					if (local210 == 31) {
						local27 -= 2;
						if (Static101.anIntArray517[local27] <= Static101.anIntArray517[local27 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local210 == 32) {
						local27 -= 2;
						if (Static101.anIntArray517[local27 + 1] <= Static101.anIntArray517[local27]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local210 == 33) {
						Static101.anIntArray517[local27++] = Static86.anIntArray140[local37[local31]];
						continue;
					}
					@Pc(534) int local534;
					if (local210 == 34) {
						local534 = local37[local31];
						local27--;
						Static86.anIntArray140[local534] = Static101.anIntArray517[local27];
						continue;
					}
					if (local210 == 35) {
						Static215.aStringArray23[local29++] = Static163.aStringArray14[local37[local31]];
						continue;
					}
					if (local210 == 36) {
						local534 = local37[local31];
						local29--;
						Static163.aStringArray14[local534] = Static215.aStringArray23[local29];
						continue;
					}
					if (local210 == 37) {
						local72 = local37[local31];
						local29 -= local72;
						local594 = Static111.method2063(local29, local72, Static215.aStringArray23);
						Static215.aStringArray23[local29++] = local594;
						continue;
					}
					if (local210 == 38) {
						local27--;
						continue;
					}
					if (local210 == 39) {
						local29--;
						continue;
					}
					if (local210 == 40) {
						local72 = local37[local31];
						@Pc(629) Class2_Sub3_Sub17 local629 = Static299.method2231(local72);
						local633 = new int[local629.anInt3451];
						@Pc(637) String[] local637 = new String[local629.anInt3453];
						for (local639 = 0; local639 < local629.anInt3448; local639++) {
							local633[local639] = Static101.anIntArray517[local27 + local639 - local629.anInt3448];
						}
						for (local639 = 0; local639 < local629.anInt3450; local639++) {
							local637[local639] = Static215.aStringArray23[local639 + local29 - local629.anInt3450];
						}
						local27 -= local629.anInt3448;
						local29 -= local629.anInt3450;
						@Pc(696) Class123 local696 = new Class123();
						local696.aClass2_Sub3_Sub17_1 = local18;
						local696.aStringArray19 = Static163.aStringArray14;
						local696.anInt3933 = local31;
						local696.anIntArray312 = Static86.anIntArray140;
						if (Static222.aClass123Array1.length <= Static33.anInt737) {
							throw new RuntimeException();
						}
						Static222.aClass123Array1[Static33.anInt737++] = local696;
						local18 = local629;
						Static86.anIntArray140 = local633;
						local37 = local629.anIntArray264;
						local34 = local629.anIntArray265;
						Static163.aStringArray14 = local637;
						local31 = -1;
						continue;
					}
					if (local210 == 42) {
						Static101.anIntArray517[local27++] = Static148.anIntArray229[local37[local31]];
						continue;
					}
					if (local210 == 43) {
						local72 = local37[local31];
						local27--;
						Static148.anIntArray229[local72] = Static101.anIntArray517[local27];
						Static22.method287(local72);
						continue;
					}
					if (local210 == 44) {
						local72 = local37[local31] >> 16;
						local27--;
						local794 = Static101.anIntArray517[local27];
						local800 = local37[local31] & 0xFFFF;
						if (local794 >= 0 && local794 <= 5000) {
							Static294.anIntArray521[local72] = local794;
							@Pc(818) byte local818 = -1;
							if (local800 == 105) {
								local818 = 0;
							}
							local639 = 0;
							while (true) {
								if (local639 >= local794) {
									continue label4448;
								}
								Static125.anIntArrayArray52[local72][local639] = local818;
								local639++;
							}
						}
						throw new RuntimeException();
					}
					if (local210 == 45) {
						local27--;
						local800 = Static101.anIntArray517[local27];
						local72 = local37[local31];
						if (local800 >= 0 && local800 < Static294.anIntArray521[local72]) {
							Static101.anIntArray517[local27++] = Static125.anIntArrayArray52[local72][local800];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 46) {
						local72 = local37[local31];
						local27 -= 2;
						local800 = Static101.anIntArray517[local27];
						if (local800 >= 0 && Static294.anIntArray521[local72] > local800) {
							Static125.anIntArrayArray52[local72][local800] = Static101.anIntArray517[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 47) {
						local177 = Static33.aStringArray3[local37[local31]];
						if (local177 == null) {
							local177 = "null";
						}
						Static215.aStringArray23[local29++] = local177;
						continue;
					}
					if (local210 == 48) {
						local72 = local37[local31];
						local29--;
						Static33.aStringArray3[local72] = Static215.aStringArray23[local29];
						method4896(local72);
						continue;
					}
					if (local210 == 51) {
						@Pc(971) Class79 local971 = local18.aClass79Array1[local37[local31]];
						local27--;
						@Pc(981) Class2_Sub21 local981 = (Class2_Sub21) local971.method2002((long) Static101.anIntArray517[local27]);
						if (local981 != null) {
							local31 += local981.anInt4234;
						}
						continue;
					}
				}
				@Pc(1001) boolean local1001;
				if (local37[local31] == 1) {
					local1001 = true;
				} else {
					local1001 = false;
				}
				@Pc(12835) Class115 local12835;
				@Pc(12816) Class115 local12816;
				@Pc(4717) int local4717;
				@Pc(1177) Class115 local1177;
				@Pc(1030) int local1030;
				if (local210 >= 300) {
					@Pc(1126) boolean local1126;
					if (local210 < 500) {
						if (local210 == 403) {
							local27 -= 2;
							local794 = Static101.anIntArray517[local27 + 1];
							local800 = Static101.anIntArray517[local27];
							for (local1030 = 0; local1030 < Static208.anIntArray356.length; local1030++) {
								if (local800 == Static208.anIntArray356[local1030]) {
									Static111.aClass36_Sub3_Sub2_1.aClass126_2.method3193(local1030, local794);
									continue label4448;
								}
							}
							local1030 = 0;
							while (true) {
								if (local1030 >= Static44.anIntArray67.length) {
									continue label4448;
								}
								if (Static44.anIntArray67[local1030] == local800) {
									Static111.aClass36_Sub3_Sub2_1.aClass126_2.method3193(local1030, local794);
									continue label4448;
								}
								local1030++;
							}
						}
						if (local210 == 404) {
							local27 -= 2;
							local800 = Static101.anIntArray517[local27];
							local794 = Static101.anIntArray517[local27 + 1];
							Static111.aClass36_Sub3_Sub2_1.aClass126_2.method3198(local794, local800);
							continue;
						}
						if (local210 == 410) {
							local27--;
							local1126 = Static101.anIntArray517[local27] != 0;
							Static111.aClass36_Sub3_Sub2_1.aClass126_2.method3192(local1126);
							continue;
						}
					} else {
						@Pc(4489) boolean local4489;
						if ((local210 < 1000 || local210 >= 1100) && (local210 < 2000 || local210 >= 2100)) {
							@Pc(1574) String local1574;
							if (local210 >= 1100 && local210 < 1200 || !(local210 < 2100 || local210 >= 2200)) {
								if (local210 >= 2000) {
									local27--;
									local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									local210 -= 1000;
								} else {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
								}
								if (local210 == 1100) {
									local27 -= 2;
									local1177.anInt3529 = Static101.anIntArray517[local27];
									if (local1177.anInt3558 - local1177.anInt3555 < local1177.anInt3529) {
										local1177.anInt3529 = local1177.anInt3558 - local1177.anInt3555;
									}
									if (local1177.anInt3529 < 0) {
										local1177.anInt3529 = 0;
									}
									local1177.anInt3514 = Static101.anIntArray517[local27 + 1];
									if (local1177.anInt3464 - local1177.anInt3487 < local1177.anInt3514) {
										local1177.anInt3514 = local1177.anInt3464 - local1177.anInt3487;
									}
									if (local1177.anInt3514 < 0) {
										local1177.anInt3514 = 0;
									}
									Static298.method4263(local1177);
									if (local1177.anInt3499 == -1) {
										Static231.method3888(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1101) {
									local27--;
									local1177.anInt3543 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									if (local1177.anInt3499 == -1) {
										Static113.method2084(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1102) {
									local27--;
									local1177.aBoolean290 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1103) {
									local27--;
									local1177.anInt3500 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1104) {
									local27--;
									local1177.anInt3517 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1105) {
									local27--;
									local1177.anInt3537 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1106) {
									local27--;
									local1177.anInt3484 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1107) {
									local27--;
									local1177.aBoolean285 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1108) {
									local1177.anInt3483 = 1;
									local27--;
									local1177.anInt3465 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									if (local1177.anInt3499 == -1) {
										Static231.method3885(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1109) {
									local27 -= 6;
									local1177.anInt3546 = Static101.anIntArray517[local27];
									local1177.anInt3550 = Static101.anIntArray517[local27 + 1];
									local1177.anInt3557 = Static101.anIntArray517[local27 + 2];
									local1177.anInt3480 = Static101.anIntArray517[local27 + 3];
									local1177.anInt3481 = Static101.anIntArray517[local27 + 4];
									local1177.anInt3524 = Static101.anIntArray517[local27 + 5];
									Static298.method4263(local1177);
									if (local1177.anInt3499 == -1) {
										Static5.method122(local1177.anInt3552);
										Static57.method1688(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1110) {
									local27--;
									local794 = Static101.anIntArray517[local27];
									if (local794 != local1177.anInt3490) {
										local1177.anInt3507 = 1;
										local1177.anInt3490 = local794;
										local1177.anInt3474 = 0;
										local1177.anInt3478 = 0;
										Static298.method4263(local1177);
									}
									if (local1177.anInt3499 == -1) {
										Static141.method2474(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1111) {
									local27--;
									local1177.aBoolean284 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1112) {
									local29--;
									local1574 = Static215.aStringArray23[local29];
									if (!local1574.equals(local1177.aString171)) {
										local1177.aString171 = local1574;
										Static298.method4263(local1177);
									}
									if (local1177.anInt3499 == -1) {
										Static71.method1327(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1113) {
									local27--;
									local1177.anInt3467 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1114) {
									local27 -= 3;
									local1177.anInt3511 = Static101.anIntArray517[local27];
									local1177.anInt3477 = Static101.anIntArray517[local27 + 1];
									local1177.anInt3512 = Static101.anIntArray517[local27 + 2];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1115) {
									local27--;
									local1177.aBoolean297 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1116) {
									local27--;
									local1177.anInt3527 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1117) {
									local27--;
									local1177.anInt3526 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1118) {
									local27--;
									local1177.aBoolean287 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1119) {
									local27--;
									local1177.aBoolean294 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1120) {
									local27 -= 2;
									local1177.anInt3558 = Static101.anIntArray517[local27];
									local1177.anInt3464 = Static101.anIntArray517[local27 + 1];
									Static298.method4263(local1177);
									if (local1177.anInt3538 == 0) {
										Static126.method2252(local1177, false);
									}
									continue;
								}
								if (local210 == 1121) {
									local27 -= 2;
									local1177.aShort18 = (short) Static101.anIntArray517[local27];
									local1177.aShort17 = (short) Static101.anIntArray517[local27 + 1];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1122) {
									local27--;
									local1177.aBoolean283 = Static101.anIntArray517[local27] == 1;
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1123) {
									local27--;
									local1177.anInt3524 = Static101.anIntArray517[local27];
									Static298.method4263(local1177);
									if (local1177.anInt3499 == -1) {
										Static5.method122(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1124) {
									local27--;
									local794 = Static101.anIntArray517[local27];
									local1177.aBoolean288 = local794 == 1;
									Static298.method4263(local1177);
									continue;
								}
							} else if (local210 >= 1200 && local210 < 1300 || local210 >= 2200 && local210 < 2300) {
								if (local210 >= 2000) {
									local27--;
									local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									local210 -= 1000;
								} else {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
								}
								Static298.method4263(local1177);
								if (local210 == 1200 || local210 == 1205 || local210 == 1208 || local210 == 1209) {
									local27 -= 2;
									local1030 = Static101.anIntArray517[local27 + 1];
									local794 = Static101.anIntArray517[local27];
									if (local1177.anInt3499 == -1) {
										Static109.method2017(local1177.anInt3552);
										Static5.method122(local1177.anInt3552);
										Static57.method1688(local1177.anInt3552);
									}
									if (local794 == -1) {
										local1177.anInt3504 = -1;
										local1177.anInt3465 = -1;
										local1177.anInt3483 = 1;
									} else {
										local1177.anInt3470 = local1030;
										local1177.anInt3504 = local794;
										if (local210 == 1208 || local210 == 1209) {
											local1177.aBoolean298 = true;
										} else {
											local1177.aBoolean298 = false;
										}
										@Pc(14096) Class155 local14096 = Static152.method2616(local794);
										local1177.anInt3550 = local14096.anInt4853;
										if (local210 == 1205) {
											local1177.aBoolean282 = false;
										} else {
											local1177.aBoolean282 = true;
										}
										local1177.anInt3546 = local14096.anInt4815;
										local1177.anInt3524 = local14096.anInt4813;
										local1177.anInt3480 = local14096.anInt4811;
										local1177.anInt3481 = local14096.anInt4859;
										if (local1177.anInt3476 > 0) {
											local1177.anInt3524 = local1177.anInt3524 * 32 / local1177.anInt3476;
										} else if (local1177.anInt3530 > 0) {
											local1177.anInt3524 = local1177.anInt3524 * 32 / local1177.anInt3530;
										}
										local1177.anInt3557 = local14096.anInt4851;
									}
									continue;
								}
								if (local210 == 1201) {
									local1177.anInt3483 = 2;
									local27--;
									local1177.anInt3465 = Static101.anIntArray517[local27];
									if (local1177.anInt3499 == -1) {
										Static231.method3885(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1202) {
									local1177.anInt3483 = 3;
									local1177.anInt3465 = Static111.aClass36_Sub3_Sub2_1.aClass126_2.method3197();
									if (local1177.anInt3499 == -1) {
										Static231.method3885(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1203) {
									local1177.anInt3483 = 6;
									local27--;
									local1177.anInt3465 = Static101.anIntArray517[local27];
									if (local1177.anInt3499 == -1) {
										Static231.method3885(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1204) {
									local1177.anInt3483 = 5;
									local27--;
									local1177.anInt3465 = Static101.anIntArray517[local27];
									if (local1177.anInt3499 == -1) {
										Static231.method3885(local1177.anInt3552);
									}
									continue;
								}
								if (local210 == 1206) {
									local27 -= 4;
									local1177.anInt3488 = Static101.anIntArray517[local27];
									local1177.anInt3502 = Static101.anIntArray517[local27 + 1];
									local1177.anInt3469 = Static101.anIntArray517[local27 + 2];
									local1177.anInt3462 = Static101.anIntArray517[local27 + 3];
									Static298.method4263(local1177);
									continue;
								}
								if (local210 == 1207) {
									local27 -= 2;
									local1177.anInt3473 = Static101.anIntArray517[local27];
									local1177.anInt3479 = Static101.anIntArray517[local27 + 1];
									Static298.method4263(local1177);
									continue;
								}
							} else if (local210 >= 1300 && local210 < 1400 || local210 >= 2300 && local210 < 2400) {
								if (local210 < 2000) {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
								} else {
									local27--;
									local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									local210 -= 1000;
								}
								if (local210 == 1300) {
									local27--;
									local794 = Static101.anIntArray517[local27] - 1;
									if (local794 >= 0 && local794 <= 9) {
										local29--;
										local1177.method2863(Static215.aStringArray23[local29], local794);
										continue;
									}
									local29--;
									continue;
								}
								if (local210 == 1301) {
									local27 -= 2;
									local794 = Static101.anIntArray517[local27];
									local1030 = Static101.anIntArray517[local27 + 1];
									local1177.aClass115_11 = Static266.method4442(local794, local1030);
									continue;
								}
								if (local210 == 1302) {
									local27--;
									local1177.aBoolean293 = Static101.anIntArray517[local27] == 1;
									continue;
								}
								if (local210 == 1303) {
									local27--;
									local1177.anInt3518 = Static101.anIntArray517[local27];
									continue;
								}
								if (local210 == 1304) {
									local27--;
									local1177.anInt3553 = Static101.anIntArray517[local27];
									continue;
								}
								if (local210 == 1305) {
									local29--;
									local1177.aString173 = Static215.aStringArray23[local29];
									continue;
								}
								if (local210 == 1306) {
									local29--;
									local1177.aString175 = Static215.aStringArray23[local29];
									continue;
								}
								if (local210 == 1307) {
									local1177.aStringArray17 = null;
									continue;
								}
								if (local210 == 1308) {
									local27--;
									local1177.anInt3548 = Static101.anIntArray517[local27];
									local27--;
									local1177.anInt3523 = Static101.anIntArray517[local27];
									continue;
								}
								if (local210 == 1309) {
									local27--;
									local794 = Static101.anIntArray517[local27];
									local27--;
									local1030 = Static101.anIntArray517[local27];
									if (local1030 >= 1 && local1030 <= 10) {
										local1177.method2856(local1030 - 1, local794);
									}
									continue;
								}
								if (local210 == 1310) {
									local29--;
									local1177.aString172 = Static215.aStringArray23[local29];
									continue;
								}
							} else {
								@Pc(3557) int local3557;
								@Pc(8583) int[] local8583;
								if (local210 >= 1400 && local210 < 1500 || local210 >= 2400 && local210 < 2500) {
									if (local210 >= 2000) {
										local210 -= 1000;
										local27--;
										local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									} else {
										local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
									}
									local29--;
									local1574 = Static215.aStringArray23[local29];
									local8583 = null;
									if (local1574.length() > 0 && local1574.charAt(local1574.length() - 1) == 'Y') {
										local27--;
										local639 = Static101.anIntArray517[local27];
										if (local639 > 0) {
											local8583 = new int[local639];
											while (local639-- > 0) {
												local27--;
												local8583[local639] = Static101.anIntArray517[local27];
											}
										}
										local1574 = local1574.substring(0, local1574.length() - 1);
									}
									@Pc(13637) Object[] local13637 = new Object[local1574.length() + 1];
									for (local3557 = local13637.length - 1; local3557 >= 1; local3557--) {
										if (local1574.charAt(local3557 - 1) == 's') {
											local29--;
											local13637[local3557] = Static215.aStringArray23[local29];
										} else {
											local27--;
											local13637[local3557] = Integer.valueOf(Static101.anIntArray517[local27]);
										}
									}
									local27--;
									local3557 = Static101.anIntArray517[local27];
									if (local3557 == -1) {
										local13637 = null;
									} else {
										local13637[0] = Integer.valueOf(local3557);
									}
									if (local210 == 1400) {
										local1177.anObjectArray17 = local13637;
									} else if (local210 == 1401) {
										local1177.anObjectArray32 = local13637;
									} else if (local210 == 1402) {
										local1177.anObjectArray13 = local13637;
									} else if (local210 == 1403) {
										local1177.anObjectArray31 = local13637;
									} else if (local210 == 1404) {
										local1177.anObjectArray14 = local13637;
									} else if (local210 == 1405) {
										local1177.anObjectArray7 = local13637;
									} else if (local210 == 1406) {
										local1177.anObjectArray15 = local13637;
									} else if (local210 == 1407) {
										local1177.anObjectArray23 = local13637;
										local1177.anIntArray280 = local8583;
									} else if (local210 == 1408) {
										local1177.anObjectArray8 = local13637;
									} else if (local210 == 1409) {
										local1177.anObjectArray18 = local13637;
									} else if (local210 == 1410) {
										local1177.anObjectArray24 = local13637;
									} else if (local210 == 1411) {
										local1177.anObjectArray26 = local13637;
									} else if (local210 == 1412) {
										local1177.anObjectArray16 = local13637;
									} else if (local210 == 1414) {
										local1177.anObjectArray20 = local13637;
										local1177.anIntArray267 = local8583;
									} else if (local210 == 1415) {
										local1177.anObjectArray30 = local13637;
										local1177.anIntArray272 = local8583;
									} else if (local210 == 1416) {
										local1177.anObjectArray25 = local13637;
									} else if (local210 == 1417) {
										local1177.anObjectArray10 = local13637;
									} else if (local210 == 1418) {
										local1177.anObjectArray21 = local13637;
									} else if (local210 == 1419) {
										local1177.anObjectArray4 = local13637;
									} else if (local210 == 1420) {
										local1177.anObjectArray11 = local13637;
									} else if (local210 == 1421) {
										local1177.anObjectArray12 = local13637;
									} else if (local210 == 1422) {
										local1177.anObjectArray28 = local13637;
									} else if (local210 == 1423) {
										local1177.anObjectArray29 = local13637;
									} else if (local210 == 1424) {
										local1177.anObjectArray27 = local13637;
									} else if (local210 == 1425) {
										local1177.anObjectArray19 = local13637;
									} else if (local210 == 1426) {
										local1177.anObjectArray5 = local13637;
									} else if (local210 == 1427) {
										local1177.anObjectArray6 = local13637;
									} else if (local210 == 1428) {
										local1177.anIntArray282 = local8583;
										local1177.anObjectArray22 = local13637;
									} else if (local210 == 1429) {
										local1177.anIntArray268 = local8583;
										local1177.anObjectArray9 = local13637;
									}
									local1177.aBoolean296 = true;
									continue;
								}
								if (local210 < 1600) {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
									if (local210 == 1500) {
										Static101.anIntArray517[local27++] = local1177.anInt3556;
										continue;
									}
									if (local210 == 1501) {
										Static101.anIntArray517[local27++] = local1177.anInt3536;
										continue;
									}
									if (local210 == 1502) {
										Static101.anIntArray517[local27++] = local1177.anInt3555;
										continue;
									}
									if (local210 == 1503) {
										Static101.anIntArray517[local27++] = local1177.anInt3487;
										continue;
									}
									if (local210 == 1504) {
										Static101.anIntArray517[local27++] = local1177.aBoolean292 ? 1 : 0;
										continue;
									}
									if (local210 == 1505) {
										Static101.anIntArray517[local27++] = local1177.anInt3525;
										continue;
									}
								} else if (local210 < 1700) {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
									if (local210 == 1600) {
										Static101.anIntArray517[local27++] = local1177.anInt3529;
										continue;
									}
									if (local210 == 1601) {
										Static101.anIntArray517[local27++] = local1177.anInt3514;
										continue;
									}
									if (local210 == 1602) {
										Static215.aStringArray23[local29++] = local1177.aString171;
										continue;
									}
									if (local210 == 1603) {
										Static101.anIntArray517[local27++] = local1177.anInt3558;
										continue;
									}
									if (local210 == 1604) {
										Static101.anIntArray517[local27++] = local1177.anInt3464;
										continue;
									}
									if (local210 == 1605) {
										Static101.anIntArray517[local27++] = local1177.anInt3524;
										continue;
									}
									if (local210 == 1606) {
										Static101.anIntArray517[local27++] = local1177.anInt3557;
										continue;
									}
									if (local210 == 1607) {
										Static101.anIntArray517[local27++] = local1177.anInt3481;
										continue;
									}
									if (local210 == 1608) {
										Static101.anIntArray517[local27++] = local1177.anInt3480;
										continue;
									}
									if (local210 == 1609) {
										Static101.anIntArray517[local27++] = local1177.anInt3500;
										continue;
									}
									if (local210 == 1610) {
										Static101.anIntArray517[local27++] = local1177.anInt3546;
										continue;
									}
									if (local210 == 1611) {
										Static101.anIntArray517[local27++] = local1177.anInt3550;
										continue;
									}
									if (local210 == 1612) {
										Static101.anIntArray517[local27++] = local1177.anInt3537;
										continue;
									}
								} else if (local210 < 1800) {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
									if (local210 == 1700) {
										Static101.anIntArray517[local27++] = local1177.anInt3504;
										continue;
									}
									if (local210 == 1701) {
										if (local1177.anInt3504 == -1) {
											Static101.anIntArray517[local27++] = 0;
										} else {
											Static101.anIntArray517[local27++] = local1177.anInt3470;
										}
										continue;
									}
									if (local210 == 1702) {
										Static101.anIntArray517[local27++] = local1177.anInt3499;
										continue;
									}
								} else if (local210 < 1900) {
									local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
									if (local210 == 1800) {
										Static101.anIntArray517[local27++] = Static35.method708(local1177).method1323();
										continue;
									}
									if (local210 == 1801) {
										local27--;
										local794 = Static101.anIntArray517[local27];
										local794--;
										if (local1177.aStringArray17 != null && local794 < local1177.aStringArray17.length && local1177.aStringArray17[local794] != null) {
											Static215.aStringArray23[local29++] = local1177.aStringArray17[local794];
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 1802) {
										if (local1177.aString173 == null) {
											Static215.aStringArray23[local29++] = "";
										} else {
											Static215.aStringArray23[local29++] = local1177.aString173;
										}
										continue;
									}
								} else if (local210 < 2600) {
									local27--;
									local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									if (local210 == 2500) {
										Static101.anIntArray517[local27++] = local1177.anInt3556;
										continue;
									}
									if (local210 == 2501) {
										Static101.anIntArray517[local27++] = local1177.anInt3536;
										continue;
									}
									if (local210 == 2502) {
										Static101.anIntArray517[local27++] = local1177.anInt3555;
										continue;
									}
									if (local210 == 2503) {
										Static101.anIntArray517[local27++] = local1177.anInt3487;
										continue;
									}
									if (local210 == 2504) {
										Static101.anIntArray517[local27++] = local1177.aBoolean292 ? 1 : 0;
										continue;
									}
									if (local210 == 2505) {
										Static101.anIntArray517[local27++] = local1177.anInt3525;
										continue;
									}
								} else if (local210 < 2700) {
									local27--;
									local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									if (local210 == 2600) {
										Static101.anIntArray517[local27++] = local1177.anInt3529;
										continue;
									}
									if (local210 == 2601) {
										Static101.anIntArray517[local27++] = local1177.anInt3514;
										continue;
									}
									if (local210 == 2602) {
										Static215.aStringArray23[local29++] = local1177.aString171;
										continue;
									}
									if (local210 == 2603) {
										Static101.anIntArray517[local27++] = local1177.anInt3558;
										continue;
									}
									if (local210 == 2604) {
										Static101.anIntArray517[local27++] = local1177.anInt3464;
										continue;
									}
									if (local210 == 2605) {
										Static101.anIntArray517[local27++] = local1177.anInt3524;
										continue;
									}
									if (local210 == 2606) {
										Static101.anIntArray517[local27++] = local1177.anInt3557;
										continue;
									}
									if (local210 == 2607) {
										Static101.anIntArray517[local27++] = local1177.anInt3481;
										continue;
									}
									if (local210 == 2608) {
										Static101.anIntArray517[local27++] = local1177.anInt3480;
										continue;
									}
									if (local210 == 2609) {
										Static101.anIntArray517[local27++] = local1177.anInt3500;
										continue;
									}
									if (local210 == 2610) {
										Static101.anIntArray517[local27++] = local1177.anInt3546;
										continue;
									}
									if (local210 == 2611) {
										Static101.anIntArray517[local27++] = local1177.anInt3550;
										continue;
									}
									if (local210 == 2612) {
										Static101.anIntArray517[local27++] = local1177.anInt3537;
										continue;
									}
								} else if (local210 < 2800) {
									if (local210 == 2700) {
										local27--;
										local1177 = Static90.method1692(Static101.anIntArray517[local27]);
										Static101.anIntArray517[local27++] = local1177.anInt3504;
										continue;
									}
									if (local210 == 2701) {
										local27--;
										local1177 = Static90.method1692(Static101.anIntArray517[local27]);
										if (local1177.anInt3504 == -1) {
											Static101.anIntArray517[local27++] = 0;
										} else {
											Static101.anIntArray517[local27++] = local1177.anInt3470;
										}
										continue;
									}
									if (local210 == 2702) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										@Pc(12945) Class2_Sub15 local12945 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local800);
										if (local12945 == null) {
											Static101.anIntArray517[local27++] = 0;
										} else {
											Static101.anIntArray517[local27++] = 1;
										}
										continue;
									}
									if (local210 == 2703) {
										local27--;
										local1177 = Static90.method1692(Static101.anIntArray517[local27]);
										if (local1177.aClass115Array1 == null) {
											Static101.anIntArray517[local27++] = 0;
											continue;
										}
										local794 = local1177.aClass115Array1.length;
										for (local1030 = 0; local1030 < local1177.aClass115Array1.length; local1030++) {
											if (local1177.aClass115Array1[local1030] == null) {
												local794 = local1030;
												break;
											}
										}
										Static101.anIntArray517[local27++] = local794;
										continue;
									}
									if (local210 == 2704 || local210 == 2705) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27];
										@Pc(13041) Class2_Sub15 local13041 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local800);
										if (local13041 != null && local794 == local13041.anInt2424) {
											Static101.anIntArray517[local27++] = 1;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
								} else if (local210 < 2900) {
									local27--;
									local1177 = Static90.method1692(Static101.anIntArray517[local27]);
									if (local210 == 2800) {
										Static101.anIntArray517[local27++] = Static35.method708(local1177).method1323();
										continue;
									}
									if (local210 == 2801) {
										local27--;
										local794 = Static101.anIntArray517[local27];
										local794--;
										if (local1177.aStringArray17 != null && local1177.aStringArray17.length > local794 && local1177.aStringArray17[local794] != null) {
											Static215.aStringArray23[local29++] = local1177.aStringArray17[local794];
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 2802) {
										if (local1177.aString173 == null) {
											Static215.aStringArray23[local29++] = "";
										} else {
											Static215.aStringArray23[local29++] = local1177.aString173;
										}
										continue;
									}
								} else if (local210 < 3200) {
									if (local210 == 3100) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static173.method2979("", local594, 0);
										continue;
									}
									if (local210 == 3101) {
										local27 -= 2;
										Static33.method649(Static101.anIntArray517[local27], Static101.anIntArray517[local27 + 1], Static111.aClass36_Sub3_Sub2_1);
										continue;
									}
									if (local210 == 3103) {
										Static87.method1628();
										continue;
									}
									if (local210 == 3104) {
										local794 = 0;
										local29--;
										local594 = Static215.aStringArray23[local29];
										if (Static63.method1238(local594)) {
											local794 = Static285.method4727(local594);
										}
										Static95.aClass2_Sub26_Sub1_1.method4287(132);
										Static95.aClass2_Sub26_Sub1_1.method4260(local794);
										continue;
									}
									if (local210 == 3105) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static95.aClass2_Sub26_Sub1_1.method4287(248);
										Static95.aClass2_Sub26_Sub1_1.method4225(Static61.method2447(local594));
										continue;
									}
									if (local210 == 3106) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static95.aClass2_Sub26_Sub1_1.method4287(222);
										Static95.aClass2_Sub26_Sub1_1.method4239(local594.length() + 1);
										Static95.aClass2_Sub26_Sub1_1.method4253(local594);
										continue;
									}
									if (local210 == 3107) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										local29--;
										local1574 = Static215.aStringArray23[local29];
										Static176.method3065(local1574, local800);
										continue;
									}
									if (local210 == 3108) {
										local27 -= 3;
										local800 = Static101.anIntArray517[local27];
										local1030 = Static101.anIntArray517[local27 + 2];
										local794 = Static101.anIntArray517[local27 + 1];
										local12816 = Static90.method1692(local1030);
										Static52.method1037(local794, local800, local12816);
										continue;
									}
									if (local210 == 3109) {
										local12835 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static52.method1037(local794, local800, local12835);
										continue;
									}
									if (local210 == 3110) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static95.aClass2_Sub26_Sub1_1.method4287(59);
										Static95.aClass2_Sub26_Sub1_1.method4231(local800);
										continue;
									}
								} else if (local210 < 3300) {
									if (local210 == 3200) {
										local27 -= 3;
										Static111.method2069(Static101.anIntArray517[local27], 255, Static101.anIntArray517[local27 + 1], Static101.anIntArray517[local27 + 2]);
										continue;
									}
									if (local210 == 3201) {
										local27--;
										Static127.method2263(Static101.anIntArray517[local27], 255);
										continue;
									}
									if (local210 == 3202) {
										local27 -= 2;
										Static253.method4070(255, Static101.anIntArray517[local27 + 1], Static101.anIntArray517[local27]);
										continue;
									}
								} else if (local210 < 3400) {
									if (local210 == 3300) {
										Static101.anIntArray517[local27++] = Static148.anInt3168;
										continue;
									}
									if (local210 == 3301) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = Static15.method317(local800, local794);
										continue;
									}
									if (local210 == 3302) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static72.method1338(local794, local800);
										continue;
									}
									if (local210 == 3303) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = Static136.method2421(local794, local800);
										continue;
									}
									if (local210 == 3304) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static253.method4071(local800).anInt2404;
										continue;
									}
									if (local210 == 3305) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static152.anIntArray230[local800];
										continue;
									}
									if (local210 == 3306) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static203.anIntArray350[local800];
										continue;
									}
									if (local210 == 3307) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static176.anIntArray304[local800];
										continue;
									}
									if (local210 == 3308) {
										local800 = Static208.anInt4335;
										local1030 = Static203.anInt4236 + (Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7);
										local794 = Static125.anInt5772 + (Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7);
										Static101.anIntArray517[local27++] = (local800 << 28) + (local794 << 14) + local1030;
										continue;
									}
									if (local210 == 3309) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local800 >> 14 & 0x3FFF;
										continue;
									}
									if (local210 == 3310) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local800 >> 28;
										continue;
									}
									if (local210 == 3311) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local800 & 0x3FFF;
										continue;
									}
									if (local210 == 3312) {
										Static101.anIntArray517[local27++] = Static243.aBoolean323 ? 1 : 0;
										continue;
									}
									if (local210 == 3313) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27] + 32768;
										Static101.anIntArray517[local27++] = Static15.method317(local800, local794);
										continue;
									}
									if (local210 == 3314) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27] + 32768;
										Static101.anIntArray517[local27++] = Static72.method1338(local794, local800);
										continue;
									}
									if (local210 == 3315) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27] + 32768;
										Static101.anIntArray517[local27++] = Static136.method2421(local794, local800);
										continue;
									}
									if (local210 == 3316) {
										if (Static189.anInt3958 >= 2) {
											Static101.anIntArray517[local27++] = Static189.anInt3958;
										} else {
											Static101.anIntArray517[local27++] = 0;
										}
										continue;
									}
									if (local210 == 3317) {
										Static101.anIntArray517[local27++] = Static277.anInt5762;
										continue;
									}
									if (local210 == 3318) {
										Static101.anIntArray517[local27++] = Static186.anInt3934;
										continue;
									}
									if (local210 == 3321) {
										Static101.anIntArray517[local27++] = Static42.anInt1046;
										continue;
									}
									if (local210 == 3322) {
										Static101.anIntArray517[local27++] = Static202.anInt4211;
										continue;
									}
									if (local210 == 3323) {
										if (Static173.anInt3682 >= 5 && Static173.anInt3682 <= 9) {
											Static101.anIntArray517[local27++] = 1;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3324) {
										if (Static173.anInt3682 >= 5 && Static173.anInt3682 <= 9) {
											Static101.anIntArray517[local27++] = Static173.anInt3682;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3325) {
										Static101.anIntArray517[local27++] = Static260.aBoolean435 ? 1 : 0;
										continue;
									}
									if (local210 == 3326) {
										Static101.anIntArray517[local27++] = Static111.aClass36_Sub3_Sub2_1.anInt5159;
										continue;
									}
									if (local210 == 3327) {
										Static101.anIntArray517[local27++] = Static111.aClass36_Sub3_Sub2_1.aClass126_2.aBoolean335 ? 1 : 0;
										continue;
									}
									if (local210 == 3328) {
										Static101.anIntArray517[local27++] = Static104.aBoolean180 && !Static166.aBoolean281 ? 1 : 0;
										continue;
									}
									if (local210 == 3329) {
										Static101.anIntArray517[local27++] = Static196.aBoolean342 ? 1 : 0;
										continue;
									}
									if (local210 == 3330) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static144.method2549(local800);
										continue;
									}
									if (local210 == 3331) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = Static98.method1889(local800, false, local794);
										continue;
									}
									if (local210 == 3332) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = Static98.method1889(local800, true, local794);
										continue;
									}
									if (local210 == 3333) {
										Static101.anIntArray517[local27++] = Static207.anInt4318;
										continue;
									}
									if (local210 == 3335) {
										Static101.anIntArray517[local27++] = Static206.anInt4309;
										continue;
									}
									if (local210 == 3336) {
										local27 -= 4;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										local800 += local794 << 14;
										local1030 = Static101.anIntArray517[local27 + 2];
										local639 = Static101.anIntArray517[local27 + 3];
										local800 += local1030 << 28;
										local800 += local639;
										Static101.anIntArray517[local27++] = local800;
										continue;
									}
									if (local210 == 3337) {
										Static101.anIntArray517[local27++] = Static136.anInt2976;
										continue;
									}
								} else if (local210 < 3500) {
									@Pc(11694) Class2_Sub3_Sub9 local11694;
									if (local210 == 3400) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										local11694 = Static82.method4614(local800);
										if (local11694.aChar2 == 's') {
										}
										Static215.aStringArray23[local29++] = local11694.method1985(local794);
										continue;
									}
									if (local210 == 3408) {
										local27 -= 4;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27];
										local1030 = Static101.anIntArray517[local27 + 2];
										local639 = Static101.anIntArray517[local27 + 3];
										@Pc(11740) Class2_Sub3_Sub9 local11740 = Static82.method4614(local1030);
										if (local11740.aChar3 == local800 && local11740.aChar2 == local794) {
											if (local794 == 115) {
												Static215.aStringArray23[local29++] = local11740.method1985(local639);
											} else {
												Static101.anIntArray517[local27++] = local11740.method1989(local639);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local210 == 3409) {
										local27 -= 3;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										local1030 = Static101.anIntArray517[local27 + 2];
										if (local794 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(11820) Class2_Sub3_Sub9 local11820 = Static82.method4614(local794);
										if (local800 != local11820.aChar2) {
											throw new RuntimeException("C3409-1");
										}
										Static101.anIntArray517[local27++] = local11820.method1988(local1030) ? 1 : 0;
										continue;
									}
									if (local210 == 3410) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										local29--;
										local1574 = Static215.aStringArray23[local29];
										if (local800 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local11694 = Static82.method4614(local800);
										if (local11694.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static101.anIntArray517[local27++] = local11694.method1980(local1574) ? 1 : 0;
										continue;
									}
									if (local210 == 3411) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										@Pc(11917) Class2_Sub3_Sub9 local11917 = Static82.method4614(local800);
										Static101.anIntArray517[local27++] = local11917.aClass79_12.method1996();
										continue;
									}
								} else if (local210 < 3700) {
									if (local210 == 3600) {
										if (Static105.anInt2264 == 0) {
											Static101.anIntArray517[local27++] = -2;
										} else if (Static105.anInt2264 == 1) {
											Static101.anIntArray517[local27++] = -1;
										} else {
											Static101.anIntArray517[local27++] = Static151.anInt3192;
										}
										continue;
									}
									if (local210 == 3601) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static105.anInt2264 == 2 && local800 < Static151.anInt3192) {
											Static215.aStringArray23[local29++] = Static56.aStringArray5[local800];
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 3602) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static105.anInt2264 == 2 && local800 < Static151.anInt3192) {
											Static101.anIntArray517[local27++] = Static18.anIntArray29[local800];
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3603) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static105.anInt2264 == 2 && local800 < Static151.anInt3192) {
											Static101.anIntArray517[local27++] = Static264.anIntArray482[local800];
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3604) {
										local27--;
										local794 = Static101.anIntArray517[local27];
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static83.method1598(local794, local594);
										continue;
									}
									if (local210 == 3605) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static153.method2646(Static61.method2447(local594));
										continue;
									}
									if (local210 == 3606) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static21.method457(Static61.method2447(local594));
										continue;
									}
									if (local210 == 3607) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static74.method1368(Static61.method2447(local594), false);
										continue;
									}
									if (local210 == 3608) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static98.method1888(Static61.method2447(local594));
										continue;
									}
									if (local210 == 3609) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										if (local594.startsWith("<img=0>") || local594.startsWith("<img=1>")) {
											local594 = local594.substring(7);
										}
										Static101.anIntArray517[local27++] = Static264.method4419(local594) ? 1 : 0;
										continue;
									}
									if (local210 == 3610) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static105.anInt2264 == 2 && local800 < Static151.anInt3192) {
											Static215.aStringArray23[local29++] = Static124.aStringArray10[local800];
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 3611) {
										if (Static277.aString274 == null) {
											Static215.aStringArray23[local29++] = "";
										} else {
											Static215.aStringArray23[local29++] = Static221.method3714(Static277.aString274);
										}
										continue;
									}
									if (local210 == 3612) {
										if (Static277.aString274 == null) {
											Static101.anIntArray517[local27++] = 0;
										} else {
											Static101.anIntArray517[local27++] = Static25.anInt5780;
										}
										continue;
									}
									if (local210 == 3613) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static277.aString274 != null && local800 < Static25.anInt5780) {
											Static215.aStringArray23[local29++] = Static221.method3714(Static137.aClass2_Sub30Array1[local800].aString267);
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 3614) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static277.aString274 != null && Static25.anInt5780 > local800) {
											Static101.anIntArray517[local27++] = Static137.aClass2_Sub30Array1[local800].anInt5687;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3615) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static277.aString274 != null && Static25.anInt5780 > local800) {
											Static101.anIntArray517[local27++] = Static137.aClass2_Sub30Array1[local800].aByte24;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3616) {
										Static101.anIntArray517[local27++] = Static4.aByte1;
										continue;
									}
									if (local210 == 3617) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static257.method4284(local594);
										continue;
									}
									if (local210 == 3618) {
										Static101.anIntArray517[local27++] = Static19.aByte2;
										continue;
									}
									if (local210 == 3619) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static264.method4416(Static61.method2447(local594));
										continue;
									}
									if (local210 == 3620) {
										Static281.method4665();
										continue;
									}
									if (local210 == 3621) {
										if (Static105.anInt2264 == 0) {
											Static101.anIntArray517[local27++] = -1;
										} else {
											Static101.anIntArray517[local27++] = Static11.anInt296;
										}
										continue;
									}
									if (local210 == 3622) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static105.anInt2264 != 0 && Static11.anInt296 > local800) {
											Static215.aStringArray23[local29++] = Static77.method1383(Static281.aLongArray23[local800]);
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 3623) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										if (local594.startsWith("<img=0>") || local594.startsWith("<img=1>")) {
											local594 = local594.substring(7);
										}
										Static101.anIntArray517[local27++] = Static291.method4825(local594) ? 1 : 0;
										continue;
									}
									if (local210 == 3624) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static137.aClass2_Sub30Array1 != null && local800 < Static25.anInt5780 && Static137.aClass2_Sub30Array1[local800].aString267.equalsIgnoreCase(Static111.aClass36_Sub3_Sub2_1.aString249)) {
											Static101.anIntArray517[local27++] = 1;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3625) {
										if (Static275.aString271 == null) {
											Static215.aStringArray23[local29++] = "";
										} else {
											Static215.aStringArray23[local29++] = Static221.method3714(Static275.aString271);
										}
										continue;
									}
									if (local210 == 3626) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static277.aString274 != null && local800 < Static25.anInt5780) {
											Static215.aStringArray23[local29++] = Static137.aClass2_Sub30Array1[local800].aString269;
											continue;
										}
										Static215.aStringArray23[local29++] = "";
										continue;
									}
									if (local210 == 3627) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										if (Static105.anInt2264 == 2 && local800 >= 0 && Static151.anInt3192 > local800) {
											Static101.anIntArray517[local27++] = Static299.aBooleanArray13[local800] ? 1 : 0;
											continue;
										}
										Static101.anIntArray517[local27++] = 0;
										continue;
									}
									if (local210 == 3628) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										if (local594.startsWith("<img=0>") || local594.startsWith("<img=1>")) {
											local594 = local594.substring(7);
										}
										Static101.anIntArray517[local27++] = Static83.method1596(local594);
										continue;
									}
									if (local210 == 3629) {
										Static101.anIntArray517[local27++] = Static163.anInt3428;
										continue;
									}
									if (local210 == 3630) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static74.method1368(Static61.method2447(local594), true);
										continue;
									}
									if (local210 == 3631) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static76.aBooleanArray6[local800] ? 1 : 0;
										continue;
									}
								} else if (local210 < 4000) {
									if (local210 == 3903) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static35.aClass174Array1[local800].method4656();
										continue;
									}
									if (local210 == 3904) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static35.aClass174Array1[local800].anInt5814;
										continue;
									}
									if (local210 == 3905) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static35.aClass174Array1[local800].anInt5819;
										continue;
									}
									if (local210 == 3906) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static35.aClass174Array1[local800].anInt5813;
										continue;
									}
									if (local210 == 3907) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static35.aClass174Array1[local800].anInt5817;
										continue;
									}
									if (local210 == 3908) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static35.aClass174Array1[local800].anInt5818;
										continue;
									}
									if (local210 == 3910) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										local794 = Static35.aClass174Array1[local800].method4658();
										Static101.anIntArray517[local27++] = local794 == 0 ? 1 : 0;
										continue;
									}
									if (local210 == 3911) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										local794 = Static35.aClass174Array1[local800].method4658();
										Static101.anIntArray517[local27++] = local794 == 2 ? 1 : 0;
										continue;
									}
									if (local210 == 3912) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										local794 = Static35.aClass174Array1[local800].method4658();
										Static101.anIntArray517[local27++] = local794 == 5 ? 1 : 0;
										continue;
									}
									if (local210 == 3913) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										local794 = Static35.aClass174Array1[local800].method4658();
										Static101.anIntArray517[local27++] = local794 == 1 ? 1 : 0;
										continue;
									}
								} else if (local210 < 4100) {
									if (local210 == 4000) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local800 + local794;
										continue;
									}
									if (local210 == 4001) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local800 - local794;
										continue;
									}
									if (local210 == 4002) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local794 * local800;
										continue;
									}
									if (local210 == 4003) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local800 / local794;
										continue;
									}
									if (local210 == 4004) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = (int) ((double) local800 * Math.random());
										continue;
									}
									if (local210 == 4005) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = (int) ((double) (local800 + 1) * Math.random());
										continue;
									}
									if (local210 == 4006) {
										local27 -= 5;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										local1030 = Static101.anIntArray517[local27 + 2];
										local639 = Static101.anIntArray517[local27 + 3];
										local3557 = Static101.anIntArray517[local27 + 4];
										Static101.anIntArray517[local27++] = local800 + (local3557 - local1030) * (local794 + -local800) / (local639 - local1030);
										continue;
									}
									@Pc(10495) long local10495;
									@Pc(10500) long local10500;
									if (local210 == 4007) {
										local27 -= 2;
										local10495 = Static101.anIntArray517[local27 + 1];
										local10500 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = (int) (local10500 + local10500 * local10495 / 100L);
										continue;
									}
									if (local210 == 4008) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local800 | 0x1 << local794;
										continue;
									}
									if (local210 == 4009) {
										local27 -= 2;
										local794 = Static101.anIntArray517[local27 + 1];
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = -(0x1 << local794) - 1 & local800;
										continue;
									}
									if (local210 == 4010) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = (local800 & 0x1 << local794) == 0 ? 0 : 1;
										continue;
									}
									if (local210 == 4011) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local800 % local794;
										continue;
									}
									if (local210 == 4012) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										if (local800 == 0) {
											Static101.anIntArray517[local27++] = 0;
										} else {
											Static101.anIntArray517[local27++] = (int) Math.pow((double) local800, (double) local794);
										}
										continue;
									}
									if (local210 == 4013) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										if (local800 == 0) {
											Static101.anIntArray517[local27++] = 0;
										} else if (local794 == 0) {
											Static101.anIntArray517[local27++] = Integer.MAX_VALUE;
										} else {
											Static101.anIntArray517[local27++] = (int) Math.pow((double) local800, 1.0D / (double) local794);
										}
										continue;
									}
									if (local210 == 4014) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local794 & local800;
										continue;
									}
									if (local210 == 4015) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local800 | local794;
										continue;
									}
									if (local210 == 4016) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local800 >= local794 ? local794 : local800;
										continue;
									}
									if (local210 == 4017) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										Static101.anIntArray517[local27++] = local794 < local800 ? local800 : local794;
										continue;
									}
									if (local210 == 4018) {
										local27 -= 3;
										local10500 = Static101.anIntArray517[local27];
										local10495 = Static101.anIntArray517[local27 + 1];
										@Pc(10851) long local10851 = (long) Static101.anIntArray517[local27 + 2];
										Static101.anIntArray517[local27++] = (int) (local10851 * local10500 / local10495);
										continue;
									}
								} else if (local210 >= 4200) {
									@Pc(2782) Class2_Sub3_Sub8 local2782;
									if (local210 < 4300) {
										if (local210 == 4200) {
											local27--;
											local800 = Static101.anIntArray517[local27];
											Static215.aStringArray23[local29++] = Static152.method2616(local800).aString239;
											continue;
										}
										@Pc(9183) Class155 local9183;
										if (local210 == 4201) {
											local27 -= 2;
											local800 = Static101.anIntArray517[local27];
											local794 = Static101.anIntArray517[local27 + 1];
											local9183 = Static152.method2616(local800);
											if (local794 >= 1 && local794 <= 5 && local9183.aStringArray26[local794 - 1] != null) {
												Static215.aStringArray23[local29++] = local9183.aStringArray26[local794 - 1];
												continue;
											}
											Static215.aStringArray23[local29++] = "";
											continue;
										}
										if (local210 == 4202) {
											local27 -= 2;
											local800 = Static101.anIntArray517[local27];
											local794 = Static101.anIntArray517[local27 + 1];
											local9183 = Static152.method2616(local800);
											if (local794 >= 1 && local794 <= 5 && local9183.aStringArray27[local794 - 1] != null) {
												Static215.aStringArray23[local29++] = local9183.aStringArray27[local794 - 1];
												continue;
											}
											Static215.aStringArray23[local29++] = "";
											continue;
										}
										if (local210 == 4203) {
											local27--;
											local800 = Static101.anIntArray517[local27];
											Static101.anIntArray517[local27++] = Static152.method2616(local800).anInt4865;
											continue;
										}
										if (local210 == 4204) {
											local27--;
											local800 = Static101.anIntArray517[local27];
											Static101.anIntArray517[local27++] = Static152.method2616(local800).anInt4820 == 1 ? 1 : 0;
											continue;
										}
										@Pc(9323) Class155 local9323;
										if (local210 == 4205) {
											local27--;
											local800 = Static101.anIntArray517[local27];
											local9323 = Static152.method2616(local800);
											if (local9323.anInt4812 == -1 && local9323.anInt4819 >= 0) {
												Static101.anIntArray517[local27++] = local9323.anInt4819;
												continue;
											}
											Static101.anIntArray517[local27++] = local800;
											continue;
										}
										if (local210 == 4206) {
											local27--;
											local800 = Static101.anIntArray517[local27];
											local9323 = Static152.method2616(local800);
											if (local9323.anInt4812 >= 0 && local9323.anInt4819 >= 0) {
												Static101.anIntArray517[local27++] = local9323.anInt4819;
												continue;
											}
											Static101.anIntArray517[local27++] = local800;
											continue;
										}
										if (local210 == 4207) {
											local27--;
											local800 = Static101.anIntArray517[local27];
											Static101.anIntArray517[local27++] = Static152.method2616(local800).aBoolean409 ? 1 : 0;
											continue;
										}
										if (local210 == 4208) {
											local27 -= 2;
											local794 = Static101.anIntArray517[local27 + 1];
											local800 = Static101.anIntArray517[local27];
											local2782 = Static268.method4459(local794);
											if (local2782.method1911()) {
												Static215.aStringArray23[local29++] = Static152.method2616(local800).method3921(local2782.aString111, local794);
											} else {
												Static101.anIntArray517[local27++] = Static152.method2616(local800).method3928(local794, local2782.anInt2217);
											}
											continue;
										}
										if (local210 == 4210) {
											local27--;
											local794 = Static101.anIntArray517[local27];
											local29--;
											local594 = Static215.aStringArray23[local29];
											Static121.method2218(local594, local794 == 1);
											Static101.anIntArray517[local27++] = Static5.anInt153;
											continue;
										}
										if (local210 == 4211) {
											if (Static51.aShortArray25 != null && Static58.anInt1315 < Static5.anInt153) {
												Static101.anIntArray517[local27++] = Static51.aShortArray25[Static58.anInt1315++] & 0xFFFF;
												continue;
											}
											Static101.anIntArray517[local27++] = -1;
											continue;
										}
										if (local210 == 4212) {
											Static58.anInt1315 = 0;
											continue;
										}
									} else if (local210 < 4400) {
										if (local210 == 4300) {
											local27 -= 2;
											local794 = Static101.anIntArray517[local27 + 1];
											local800 = Static101.anIntArray517[local27];
											local2782 = Static268.method4459(local794);
											if (local2782.method1911()) {
												Static215.aStringArray23[local29++] = Static112.method2081(local800).method712(local2782.aString111, local794);
											} else {
												Static101.anIntArray517[local27++] = Static112.method2081(local800).method709(local2782.anInt2217, local794);
											}
											continue;
										}
									} else if (local210 < 4500) {
										if (local210 == 4400) {
											local27 -= 2;
											local800 = Static101.anIntArray517[local27];
											local794 = Static101.anIntArray517[local27 + 1];
											local2782 = Static268.method4459(local794);
											if (local2782.method1911()) {
												Static215.aStringArray23[local29++] = Static218.method3692(local800).method3652(local2782.aString111, local794);
											} else {
												Static101.anIntArray517[local27++] = Static218.method3692(local800).method3643(local2782.anInt2217, local794);
											}
											continue;
										}
									} else if (local210 >= 4600) {
										if (local210 < 5100) {
											if (local210 == 5000) {
												Static101.anIntArray517[local27++] = Static169.anInt3576;
												continue;
											}
											if (local210 == 5001) {
												local27 -= 3;
												Static169.anInt3576 = Static101.anIntArray517[local27];
												Static84.anInt805 = Static101.anIntArray517[local27 + 1];
												Static221.anInt4608 = Static101.anIntArray517[local27 + 2];
												Static95.aClass2_Sub26_Sub1_1.method4287(182);
												Static95.aClass2_Sub26_Sub1_1.method4239(Static169.anInt3576);
												Static95.aClass2_Sub26_Sub1_1.method4239(Static84.anInt805);
												Static95.aClass2_Sub26_Sub1_1.method4239(Static221.anInt4608);
												continue;
											}
											if (local210 == 5002) {
												local29--;
												local594 = Static215.aStringArray23[local29];
												local27 -= 2;
												local794 = Static101.anIntArray517[local27];
												local1030 = Static101.anIntArray517[local27 + 1];
												Static95.aClass2_Sub26_Sub1_1.method4287(228);
												Static95.aClass2_Sub26_Sub1_1.method4225(Static61.method2447(local594));
												Static95.aClass2_Sub26_Sub1_1.method4239(local794 - 1);
												Static95.aClass2_Sub26_Sub1_1.method4239(local1030);
												continue;
											}
											if (local210 == 5003) {
												local1574 = null;
												local27--;
												local800 = Static101.anIntArray517[local27];
												if (local800 < 100) {
													local1574 = Static274.aStringArray32[local800];
												}
												if (local1574 == null) {
													local1574 = "";
												}
												Static215.aStringArray23[local29++] = local1574;
												continue;
											}
											if (local210 == 5004) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												local794 = -1;
												if (local800 < 100 && Static274.aStringArray32[local800] != null) {
													local794 = Static27.anIntArray40[local800];
												}
												Static101.anIntArray517[local27++] = local794;
												continue;
											}
											if (local210 == 5005) {
												Static101.anIntArray517[local27++] = Static84.anInt805;
												continue;
											}
											if (local210 == 5008) {
												local29--;
												local594 = Static215.aStringArray23[local29];
												if (!local594.startsWith("::")) {
													if (Static189.anInt3958 == 0 && (Static104.aBoolean180 && !Static166.aBoolean281 || Static196.aBoolean342)) {
														continue;
													}
													local1574 = local594.toLowerCase();
													@Pc(3091) byte local3091 = 0;
													@Pc(3093) byte local3093 = 0;
													if (local1574.startsWith(Static146.aString150)) {
														local3093 = 0;
														local594 = local594.substring(Static146.aString150.length());
													} else if (local1574.startsWith(Static21.aString31)) {
														local594 = local594.substring(Static21.aString31.length());
														local3093 = 1;
													} else if (local1574.startsWith(Static119.aString129)) {
														local3093 = 2;
														local594 = local594.substring(Static119.aString129.length());
													} else if (local1574.startsWith(Static272.aString265)) {
														local3093 = 3;
														local594 = local594.substring(Static272.aString265.length());
													} else if (local1574.startsWith(Static241.aString240)) {
														local594 = local594.substring(Static241.aString240.length());
														local3093 = 4;
													} else if (local1574.startsWith(Static105.aString116)) {
														local3093 = 5;
														local594 = local594.substring(Static105.aString116.length());
													} else if (local1574.startsWith(Static42.aString52)) {
														local3093 = 6;
														local594 = local594.substring(Static42.aString52.length());
													} else if (local1574.startsWith(Static83.aString91)) {
														local3093 = 7;
														local594 = local594.substring(Static83.aString91.length());
													} else if (local1574.startsWith(Static87.aString93)) {
														local594 = local594.substring(Static87.aString93.length());
														local3093 = 8;
													} else if (local1574.startsWith(Static154.aString157)) {
														local594 = local594.substring(Static154.aString157.length());
														local3093 = 9;
													} else if (local1574.startsWith(Static226.aString98)) {
														local594 = local594.substring(Static226.aString98.length());
														local3093 = 10;
													} else if (local1574.startsWith(Static233.aString237)) {
														local594 = local594.substring(Static233.aString237.length());
														local3093 = 11;
													} else if (Static206.anInt4309 != 0) {
														if (local1574.startsWith(Static264.aString257)) {
															local3093 = 0;
															local594 = local594.substring(Static264.aString257.length());
														} else if (local1574.startsWith(Static154.aString158)) {
															local3093 = 1;
															local594 = local594.substring(Static154.aString158.length());
														} else if (local1574.startsWith(Static30.aString42)) {
															local3093 = 2;
															local594 = local594.substring(Static30.aString42.length());
														} else if (local1574.startsWith(Static242.aString243)) {
															local594 = local594.substring(Static242.aString243.length());
															local3093 = 3;
														} else if (local1574.startsWith(Static55.aString64)) {
															local3093 = 4;
															local594 = local594.substring(Static55.aString64.length());
														} else if (local1574.startsWith(Static285.aString287)) {
															local3093 = 5;
															local594 = local594.substring(Static285.aString287.length());
														} else if (local1574.startsWith(Static62.aString71)) {
															local594 = local594.substring(Static62.aString71.length());
															local3093 = 6;
														} else if (local1574.startsWith(Static12.aString17)) {
															local3093 = 7;
															local594 = local594.substring(Static12.aString17.length());
														} else if (local1574.startsWith(Static101.aString293)) {
															local3093 = 8;
															local594 = local594.substring(Static101.aString293.length());
														} else if (local1574.startsWith(Static202.aString208)) {
															local594 = local594.substring(Static202.aString208.length());
															local3093 = 9;
														} else if (local1574.startsWith(Static275.aString272)) {
															local3093 = 10;
															local594 = local594.substring(Static275.aString272.length());
														} else if (local1574.startsWith(Static37.aString47)) {
															local3093 = 11;
															local594 = local594.substring(Static37.aString47.length());
														}
													}
													local1574 = local594.toLowerCase();
													if (local1574.startsWith(Static92.aString103)) {
														local3091 = 1;
														local594 = local594.substring(Static92.aString103.length());
													} else if (local1574.startsWith(Static73.aString82)) {
														local594 = local594.substring(Static73.aString82.length());
														local3091 = 2;
													} else if (local1574.startsWith(Static190.aString216)) {
														local594 = local594.substring(Static190.aString216.length());
														local3091 = 3;
													} else if (local1574.startsWith(Static63.aString75)) {
														local594 = local594.substring(Static63.aString75.length());
														local3091 = 4;
													} else if (local1574.startsWith(Static288.aString290)) {
														local594 = local594.substring(Static288.aString290.length());
														local3091 = 5;
													} else if (Static206.anInt4309 != 0) {
														if (local1574.startsWith(Static8.aString12)) {
															local3091 = 1;
															local594 = local594.substring(Static8.aString12.length());
														} else if (local1574.startsWith(Static36.aString45)) {
															local3091 = 2;
															local594 = local594.substring(Static36.aString45.length());
														} else if (local1574.startsWith(Static53.aString60)) {
															local594 = local594.substring(Static53.aString60.length());
															local3091 = 3;
														} else if (local1574.startsWith(Static65.aString76)) {
															local594 = local594.substring(Static65.aString76.length());
															local3091 = 4;
														} else if (local1574.startsWith(Static152.aString154)) {
															local3091 = 5;
															local594 = local594.substring(Static152.aString154.length());
														}
													}
													Static95.aClass2_Sub26_Sub1_1.method4287(159);
													Static95.aClass2_Sub26_Sub1_1.method4239(0);
													local3557 = Static95.aClass2_Sub26_Sub1_1.anInt5328;
													Static95.aClass2_Sub26_Sub1_1.method4239(local3093);
													Static95.aClass2_Sub26_Sub1_1.method4239(local3091);
													Static43.method836(Static95.aClass2_Sub26_Sub1_1, local594);
													Static95.aClass2_Sub26_Sub1_1.method4254(Static95.aClass2_Sub26_Sub1_1.anInt5328 - local3557);
													continue;
												}
												Static67.method4887(local594);
												continue;
											}
											if (local210 == 5009) {
												local29 -= 2;
												local594 = Static215.aStringArray23[local29];
												local1574 = Static215.aStringArray23[local29 + 1];
												if (Static189.anInt3958 != 0 || (!Static104.aBoolean180 || Static166.aBoolean281) && !Static196.aBoolean342) {
													Static95.aClass2_Sub26_Sub1_1.method4287(218);
													Static95.aClass2_Sub26_Sub1_1.method4239(0);
													local1030 = Static95.aClass2_Sub26_Sub1_1.anInt5328;
													Static95.aClass2_Sub26_Sub1_1.method4225(Static61.method2447(local594));
													Static43.method836(Static95.aClass2_Sub26_Sub1_1, local1574);
													Static95.aClass2_Sub26_Sub1_1.method4254(Static95.aClass2_Sub26_Sub1_1.anInt5328 - local1030);
												}
												continue;
											}
											if (local210 == 5010) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												local1574 = null;
												if (local800 < 100) {
													local1574 = Static251.aStringArray29[local800];
												}
												if (local1574 == null) {
													local1574 = "";
												}
												Static215.aStringArray23[local29++] = local1574;
												continue;
											}
											if (local210 == 5011) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												local1574 = null;
												if (local800 < 100) {
													local1574 = Static16.aStringArray1[local800];
												}
												if (local1574 == null) {
													local1574 = "";
												}
												Static215.aStringArray23[local29++] = local1574;
												continue;
											}
											if (local210 == 5012) {
												local794 = -1;
												local27--;
												local800 = Static101.anIntArray517[local27];
												if (local800 < 100) {
													local794 = Static81.anIntArray137[local800];
												}
												Static101.anIntArray517[local27++] = local794;
												continue;
											}
											if (local210 == 5015) {
												if (Static111.aClass36_Sub3_Sub2_1 == null || Static111.aClass36_Sub3_Sub2_1.aString249 == null) {
													local594 = Static16.aString24;
												} else {
													local594 = Static111.aClass36_Sub3_Sub2_1.method4114();
												}
												Static215.aStringArray23[local29++] = local594;
												continue;
											}
											if (local210 == 5016) {
												Static101.anIntArray517[local27++] = Static221.anInt4608;
												continue;
											}
											if (local210 == 5017) {
												Static101.anIntArray517[local27++] = Static68.anInt1502;
												continue;
											}
											if (local210 == 5050) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												Static215.aStringArray23[local29++] = Static215.method3633(local800).aString51;
												continue;
											}
											@Pc(3818) Class2_Sub3_Sub3 local3818;
											if (local210 == 5051) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												local3818 = Static215.method3633(local800);
												if (local3818.anIntArray65 == null) {
													Static101.anIntArray517[local27++] = 0;
												} else {
													Static101.anIntArray517[local27++] = local3818.anIntArray65.length;
												}
												continue;
											}
											if (local210 == 5052) {
												local27 -= 2;
												local794 = Static101.anIntArray517[local27 + 1];
												local800 = Static101.anIntArray517[local27];
												@Pc(3859) Class2_Sub3_Sub3 local3859 = Static215.method3633(local800);
												local639 = local3859.anIntArray65[local794];
												Static101.anIntArray517[local27++] = local639;
												continue;
											}
											if (local210 == 5053) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												local3818 = Static215.method3633(local800);
												if (local3818.anIntArray66 == null) {
													Static101.anIntArray517[local27++] = 0;
												} else {
													Static101.anIntArray517[local27++] = local3818.anIntArray66.length;
												}
												continue;
											}
											if (local210 == 5054) {
												local27 -= 2;
												local794 = Static101.anIntArray517[local27 + 1];
												local800 = Static101.anIntArray517[local27];
												Static101.anIntArray517[local27++] = Static215.method3633(local800).anIntArray66[local794];
												continue;
											}
											if (local210 == 5055) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												Static215.aStringArray23[local29++] = Static190.method3493(local800).method4615();
												continue;
											}
											if (local210 == 5056) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												@Pc(3964) Class2_Sub3_Sub22 local3964 = Static190.method3493(local800);
												if (local3964.anIntArray502 == null) {
													Static101.anIntArray517[local27++] = 0;
												} else {
													Static101.anIntArray517[local27++] = local3964.anIntArray502.length;
												}
												continue;
											}
											if (local210 == 5057) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												Static101.anIntArray517[local27++] = Static190.method3493(local800).anIntArray502[local794];
												continue;
											}
											if (local210 == 5058) {
												Static251.aClass59_1 = new Class59();
												local27--;
												Static251.aClass59_1.anInt1646 = Static101.anIntArray517[local27];
												Static251.aClass59_1.aClass2_Sub3_Sub22_1 = Static190.method3493(Static251.aClass59_1.anInt1646);
												Static251.aClass59_1.anIntArray115 = new int[Static251.aClass59_1.aClass2_Sub3_Sub22_1.method4619()];
												continue;
											}
											if (local210 == 5059) {
												Static95.aClass2_Sub26_Sub1_1.method4287(251);
												Static95.aClass2_Sub26_Sub1_1.method4239(0);
												local800 = Static95.aClass2_Sub26_Sub1_1.anInt5328;
												Static95.aClass2_Sub26_Sub1_1.method4239(0);
												Static95.aClass2_Sub26_Sub1_1.method4231(Static251.aClass59_1.anInt1646);
												Static251.aClass59_1.aClass2_Sub3_Sub22_1.method4616(Static251.aClass59_1.anIntArray115, Static95.aClass2_Sub26_Sub1_1);
												Static95.aClass2_Sub26_Sub1_1.method4254(Static95.aClass2_Sub26_Sub1_1.anInt5328 - local800);
												continue;
											}
											if (local210 == 5060) {
												local29--;
												local594 = Static215.aStringArray23[local29];
												Static95.aClass2_Sub26_Sub1_1.method4287(168);
												Static95.aClass2_Sub26_Sub1_1.method4239(0);
												local794 = Static95.aClass2_Sub26_Sub1_1.anInt5328;
												Static95.aClass2_Sub26_Sub1_1.method4225(Static61.method2447(local594));
												Static95.aClass2_Sub26_Sub1_1.method4231(Static251.aClass59_1.anInt1646);
												Static251.aClass59_1.aClass2_Sub3_Sub22_1.method4616(Static251.aClass59_1.anIntArray115, Static95.aClass2_Sub26_Sub1_1);
												Static95.aClass2_Sub26_Sub1_1.method4254(Static95.aClass2_Sub26_Sub1_1.anInt5328 - local794);
												continue;
											}
											if (local210 == 5061) {
												Static95.aClass2_Sub26_Sub1_1.method4287(251);
												Static95.aClass2_Sub26_Sub1_1.method4239(0);
												local800 = Static95.aClass2_Sub26_Sub1_1.anInt5328;
												Static95.aClass2_Sub26_Sub1_1.method4239(1);
												Static95.aClass2_Sub26_Sub1_1.method4231(Static251.aClass59_1.anInt1646);
												Static251.aClass59_1.aClass2_Sub3_Sub22_1.method4616(Static251.aClass59_1.anIntArray115, Static95.aClass2_Sub26_Sub1_1);
												Static95.aClass2_Sub26_Sub1_1.method4254(Static95.aClass2_Sub26_Sub1_1.anInt5328 - local800);
												continue;
											}
											if (local210 == 5062) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												Static101.anIntArray517[local27++] = Static215.method3633(local800).aCharArray1[local794];
												continue;
											}
											if (local210 == 5063) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												Static101.anIntArray517[local27++] = Static215.method3633(local800).aCharArray2[local794];
												continue;
											}
											if (local210 == 5064) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												if (local794 == -1) {
													Static101.anIntArray517[local27++] = -1;
												} else {
													Static101.anIntArray517[local27++] = Static215.method3633(local800).method820((char) local794);
												}
												continue;
											}
											if (local210 == 5065) {
												local27 -= 2;
												local794 = Static101.anIntArray517[local27 + 1];
												local800 = Static101.anIntArray517[local27];
												if (local794 == -1) {
													Static101.anIntArray517[local27++] = -1;
												} else {
													Static101.anIntArray517[local27++] = Static215.method3633(local800).method822((char) local794);
												}
												continue;
											}
											if (local210 == 5066) {
												local27--;
												local800 = Static101.anIntArray517[local27];
												Static101.anIntArray517[local27++] = Static190.method3493(local800).method4619();
												continue;
											}
											if (local210 == 5067) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												local1030 = Static190.method3493(local800).method4625(local794);
												Static101.anIntArray517[local27++] = local1030;
												continue;
											}
											if (local210 == 5068) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												Static251.aClass59_1.anIntArray115[local800] = local794;
												continue;
											}
											if (local210 == 5069) {
												local27 -= 2;
												local800 = Static101.anIntArray517[local27];
												local794 = Static101.anIntArray517[local27 + 1];
												Static251.aClass59_1.anIntArray115[local800] = local794;
												continue;
											}
											if (local210 == 5070) {
												local27 -= 3;
												local800 = Static101.anIntArray517[local27];
												local1030 = Static101.anIntArray517[local27 + 2];
												local794 = Static101.anIntArray517[local27 + 1];
												@Pc(4451) Class2_Sub3_Sub22 local4451 = Static190.method3493(local800);
												if (local4451.method4625(local794) != 0) {
													throw new RuntimeException("bad command");
												}
												Static101.anIntArray517[local27++] = local4451.method4621(local794, local1030);
												continue;
											}
											if (local210 == 5071) {
												local27--;
												local4489 = Static101.anIntArray517[local27] == 1;
												local29--;
												local594 = Static215.aStringArray23[local29];
												Static161.method2799(local594, local4489);
												Static101.anIntArray517[local27++] = Static5.anInt153;
												continue;
											}
											if (local210 == 5072) {
												if (Static51.aShortArray25 != null && Static58.anInt1315 < Static5.anInt153) {
													Static101.anIntArray517[local27++] = Static51.aShortArray25[Static58.anInt1315++] & 0xFFFF;
													continue;
												}
												Static101.anIntArray517[local27++] = -1;
												continue;
											}
											if (local210 == 5073) {
												Static58.anInt1315 = 0;
												continue;
											}
										} else if (local210 >= 5200) {
											@Pc(6373) boolean local6373;
											if (local210 < 5300) {
												if (local210 == 5200) {
													local27--;
													Static34.method1668(Static101.anIntArray517[local27]);
													continue;
												}
												if (local210 == 5201) {
													Static101.anIntArray517[local27++] = Static137.method2430();
													continue;
												}
												if (local210 == 5202) {
													local27--;
													Static196.method3331(Static101.anIntArray517[local27]);
													continue;
												}
												if (local210 == 5203) {
													local29--;
													Static47.method971(Static215.aStringArray23[local29]);
													continue;
												}
												if (local210 == 5204) {
													Static215.aStringArray23[local29 - 1] = Static174.method3008(Static215.aStringArray23[local29 - 1]);
													continue;
												}
												if (local210 == 5205) {
													local27--;
													Static20.method1062(-1, Static101.anIntArray517[local27], -1);
													continue;
												}
												@Pc(8264) Class2_Sub3_Sub18 local8264;
												if (local210 == 5206) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static293.method4861(local800 >> 14 & 0x3FFF, local800 & 0x3FFF);
													if (local8264 == null) {
														Static101.anIntArray517[local27++] = -1;
													} else {
														Static101.anIntArray517[local27++] = local8264.anInt3689;
													}
													continue;
												}
												@Pc(8294) Class2_Sub3_Sub18 local8294;
												if (local210 == 5207) {
													local27--;
													local8294 = Static137.method2425(Static101.anIntArray517[local27]);
													if (local8294 != null && local8294.aString182 != null) {
														Static215.aStringArray23[local29++] = local8294.aString182;
														continue;
													}
													Static215.aStringArray23[local29++] = "";
													continue;
												}
												if (local210 == 5208) {
													Static101.anIntArray517[local27++] = Static248.anInt4937;
													Static101.anIntArray517[local27++] = Static170.anInt3613;
													continue;
												}
												if (local210 == 5209) {
													Static101.anIntArray517[local27++] = Static115.anInt2461 + Static219.anInt4587;
													Static101.anIntArray517[local27++] = Static52.anInt1205 + Static239.anInt4870 - Static61.anInt2999 - 1;
													continue;
												}
												if (local210 == 5210) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static137.method2425(local800);
													if (local8264 == null) {
														Static101.anIntArray517[local27++] = 0;
														Static101.anIntArray517[local27++] = 0;
													} else {
														Static101.anIntArray517[local27++] = local8264.anInt3687 >> 14 & 0x3FFF;
														Static101.anIntArray517[local27++] = local8264.anInt3687 & 0x3FFF;
													}
													continue;
												}
												if (local210 == 5211) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static137.method2425(local800);
													if (local8264 == null) {
														Static101.anIntArray517[local27++] = 0;
														Static101.anIntArray517[local27++] = 0;
													} else {
														Static101.anIntArray517[local27++] = local8264.anInt3693 - local8264.anInt3691;
														Static101.anIntArray517[local27++] = local8264.anInt3695 - local8264.anInt3696;
													}
													continue;
												}
												if (local210 == 5212) {
													local800 = Static177.method3092();
													local1030 = 0;
													if (local800 == -1) {
														local1574 = "";
													} else {
														local1574 = Static37.aClass113_1.aStringArray15[local800];
														local1030 = Static37.aClass113_1.method2826(local800);
													}
													local1574 = Static62.method1200(local1574, " ", "<br>");
													Static215.aStringArray23[local29++] = local1574;
													Static101.anIntArray517[local27++] = local1030;
													continue;
												}
												if (local210 == 5213) {
													local800 = Static230.method3097();
													local1030 = 0;
													if (local800 == -1) {
														local1574 = "";
													} else {
														local1574 = Static37.aClass113_1.aStringArray15[local800];
														local1030 = Static37.aClass113_1.method2826(local800);
													}
													local1574 = Static62.method1200(local1574, " ", "<br>");
													Static215.aStringArray23[local29++] = local1574;
													Static101.anIntArray517[local27++] = local1030;
													continue;
												}
												if (local210 == 5214) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static95.method1828();
													if (local8264 != null) {
														local8583 = local8264.method2981(local800 >> 14 & 0x3FFF, (local800 & 0x3D7D865C) >> 28, local800 & 0x3FFF);
														if (local8583 != null) {
															Static177.method3093(local8583[1], local8583[2]);
														}
													}
													continue;
												}
												if (local210 == 5215) {
													local27 -= 2;
													local794 = Static101.anIntArray517[local27 + 1];
													local800 = Static101.anIntArray517[local27];
													local6373 = false;
													@Pc(8624) Class144 local8624 = Static11.method255(local800 & 0x3FFF, local800 >> 14 & 0x3FFF);
													for (@Pc(8629) Class2_Sub3_Sub18 local8629 = (Class2_Sub3_Sub18) local8624.method3663(); local8629 != null; local8629 = (Class2_Sub3_Sub18) local8624.method3659()) {
														if (local794 == local8629.anInt3689) {
															local6373 = true;
															break;
														}
													}
													if (local6373) {
														Static101.anIntArray517[local27++] = 1;
													} else {
														Static101.anIntArray517[local27++] = 0;
													}
													continue;
												}
												if (local210 == 5216) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													Static249.method3996(local800);
													continue;
												}
												if (local210 == 5217) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (Static182.method3136(local800)) {
														Static101.anIntArray517[local27++] = 1;
													} else {
														Static101.anIntArray517[local27++] = 0;
													}
													continue;
												}
												if (local210 == 5218) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static137.method2425(local800);
													if (local8264 == null) {
														Static101.anIntArray517[local27++] = -1;
													} else {
														Static101.anIntArray517[local27++] = local8264.anInt3692;
													}
													continue;
												}
												if (local210 == 5219) {
													local29--;
													Static81.method1534(Static215.aStringArray23[local29]);
													continue;
												}
												if (local210 == 5220) {
													Static101.anIntArray517[local27++] = Static20.anInt1234 == 100 ? 1 : 0;
													continue;
												}
												if (local210 == 5221) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													Static177.method3093(local800 >> 14 & 0x3FFF, local800 & 0x3FFF);
													continue;
												}
												if (local210 == 5222) {
													local8294 = Static95.method1828();
													if (local8294 == null) {
														Static101.anIntArray517[local27++] = -1;
														Static101.anIntArray517[local27++] = -1;
													} else {
														local633 = local8294.method2982(Static239.anInt4870 + Static52.anInt1205 - Static61.anInt2999 - 1, Static115.anInt2461 + Static219.anInt4587);
														if (local633 == null) {
															Static101.anIntArray517[local27++] = -1;
															Static101.anIntArray517[local27++] = -1;
														} else {
															Static101.anIntArray517[local27++] = local633[1];
															Static101.anIntArray517[local27++] = local633[2];
														}
													}
													continue;
												}
												if (local210 == 5223) {
													local27 -= 2;
													local800 = Static101.anIntArray517[local27];
													local794 = Static101.anIntArray517[local27 + 1];
													Static20.method1062(local794 & 0x3FFF, local800, local794 >> 14 & 0x3FFF);
													continue;
												}
												if (local210 == 5224) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static95.method1828();
													if (local8264 == null) {
														Static101.anIntArray517[local27++] = -1;
														Static101.anIntArray517[local27++] = -1;
													} else {
														local8583 = local8264.method2981(local800 >> 14 & 0x3FFF, (local800 & 0x3460398F) >> 28, local800 & 0x3FFF);
														if (local8583 == null) {
															Static101.anIntArray517[local27++] = -1;
															Static101.anIntArray517[local27++] = -1;
														} else {
															Static101.anIntArray517[local27++] = local8583[1];
															Static101.anIntArray517[local27++] = local8583[2];
														}
													}
													continue;
												}
												if (local210 == 5225) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													local8264 = Static95.method1828();
													if (local8264 == null) {
														Static101.anIntArray517[local27++] = -1;
														Static101.anIntArray517[local27++] = -1;
													} else {
														local8583 = local8264.method2982(local800 & 0x3FFF, local800 >> 14 & 0x3FFF);
														if (local8583 == null) {
															Static101.anIntArray517[local27++] = -1;
															Static101.anIntArray517[local27++] = -1;
														} else {
															Static101.anIntArray517[local27++] = local8583[1];
															Static101.anIntArray517[local27++] = local8583[2];
														}
													}
													continue;
												}
											} else if (local210 < 5400) {
												if (local210 == 5300) {
													local27 -= 2;
													local800 = Static101.anIntArray517[local27];
													local794 = Static101.anIntArray517[local27 + 1];
													Static190.method3495(local800, 3, false, local794);
													Static101.anIntArray517[local27++] = Static8.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local210 == 5301) {
													if (Static8.aFrame1 != null) {
														Static190.method3495(-1, Static2.anInt5946, false, -1);
													}
													continue;
												}
												if (local210 == 5302) {
													@Pc(7997) Class178[] local7997 = Static31.method514();
													Static101.anIntArray517[local27++] = local7997.length;
													continue;
												}
												if (local210 == 5303) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													@Pc(8016) Class178[] local8016 = Static31.method514();
													Static101.anIntArray517[local27++] = local8016[local800].anInt5877;
													Static101.anIntArray517[local27++] = local8016[local800].anInt5883;
													continue;
												}
												if (local210 == 5305) {
													local800 = Static163.anInt3419;
													local794 = Static267.anInt4121;
													local1030 = -1;
													@Pc(8048) Class178[] local8048 = Static31.method514();
													for (local3557 = 0; local3557 < local8048.length; local3557++) {
														@Pc(8062) Class178 local8062 = local8048[local3557];
														if (local8062.anInt5877 == local800 && local8062.anInt5883 == local794) {
															local1030 = local3557;
															break;
														}
													}
													Static101.anIntArray517[local27++] = local1030;
													continue;
												}
												if (local210 == 5306) {
													Static101.anIntArray517[local27++] = Static293.method4858();
													continue;
												}
												if (local210 == 5307) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0 || local800 > 2) {
														local800 = 0;
													}
													Static190.method3495(-1, local800, false, -1);
													continue;
												}
												if (local210 == 5308) {
													Static101.anIntArray517[local27++] = Static2.anInt5946;
													continue;
												}
												if (local210 == 5309) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0 || local800 > 2) {
														local800 = 0;
													}
													Static2.anInt5946 = local800;
													Static67.method4884(Static299.aClass177_5);
													continue;
												}
											} else if (local210 < 5500) {
												if (local210 == 5400) {
													local29 -= 2;
													local27--;
													local1030 = Static101.anIntArray517[local27];
													local594 = Static215.aStringArray23[local29];
													local1574 = Static215.aStringArray23[local29 + 1];
													Static95.aClass2_Sub26_Sub1_1.method4287(178);
													Static95.aClass2_Sub26_Sub1_1.method4239(Static66.method1280(local594) + Static66.method1280(local1574) + 1);
													Static95.aClass2_Sub26_Sub1_1.method4253(local594);
													Static95.aClass2_Sub26_Sub1_1.method4253(local1574);
													Static95.aClass2_Sub26_Sub1_1.method4239(local1030);
													continue;
												}
												if (local210 == 5401) {
													local27 -= 2;
													Static88.aShortArray56[Static101.anIntArray517[local27]] = (short) Static83.method1594(Static101.anIntArray517[local27 + 1]);
													Static49.method986();
													Static199.method3366();
													Static265.method4422();
													Static201.method3392();
													Static55.method1085();
													continue;
												}
												if (local210 == 5405) {
													local27 -= 2;
													local800 = Static101.anIntArray517[local27];
													local794 = Static101.anIntArray517[local27 + 1];
													if (local800 >= 0 && local800 < 2) {
														Static206.anIntArrayArrayArray11[local800] = new int[local794 << 1][4];
													}
													continue;
												}
												if (local210 == 5406) {
													local27 -= 7;
													local794 = Static101.anIntArray517[local27 + 1] << 1;
													local800 = Static101.anIntArray517[local27];
													local1030 = Static101.anIntArray517[local27 + 2];
													local4717 = Static101.anIntArray517[local27 + 5];
													local3557 = Static101.anIntArray517[local27 + 4];
													@Pc(4729) int local4729 = Static101.anIntArray517[local27 + 6];
													local639 = Static101.anIntArray517[local27 + 3];
													if (local800 >= 0 && local800 < 2 && Static206.anIntArrayArrayArray11[local800] != null && local794 >= 0 && Static206.anIntArrayArrayArray11[local800].length > local794) {
														Static206.anIntArrayArrayArray11[local800][local794] = new int[] { (local1030 >> 14 & 0x3FFF) * 128, local639, (local1030 & 0x3FFF) * 128, local4729 };
														Static206.anIntArrayArrayArray11[local800][local794 + 1] = new int[] { (local3557 >> 14 & 0x3FFF) * 128, local4717, (local3557 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local210 == 5407) {
													local27--;
													local800 = Static206.anIntArrayArrayArray11[Static101.anIntArray517[local27]].length >> 1;
													Static101.anIntArray517[local27++] = local800;
													continue;
												}
												if (local210 == 5411) {
													if (Static8.aFrame1 != null) {
														Static190.method3495(-1, Static2.anInt5946, false, -1);
													}
													if (Static298.aFrame3 == null) {
														Static247.method3966(false, Static137.method2426());
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local210 == 5419) {
													local594 = "";
													if (Static58.aClass28_5 != null) {
														if (Static58.aClass28_5.anObject2 == null) {
															local594 = Static232.method3892(Static58.aClass28_5.anInt725);
														} else {
															local594 = (String) Static58.aClass28_5.anObject2;
														}
													}
													Static215.aStringArray23[local29++] = local594;
													continue;
												}
												if (local210 == 5420) {
													Static101.anIntArray517[local27++] = Static282.anInt5835 == 3 ? 1 : 0;
													continue;
												}
												if (local210 == 5421) {
													if (Static8.aFrame1 != null) {
														Static190.method3495(-1, Static2.anInt5946, false, -1);
													}
													local29--;
													local594 = Static215.aStringArray23[local29];
													local27--;
													local4489 = Static101.anIntArray517[local27] == 1;
													@Pc(4971) String local4971 = Static137.method2426() + local594;
													if (Static298.aFrame3 != null || local4489 && Static282.anInt5835 != 3 && Static282.aString285.startsWith("win") && !Static53.aBoolean90) {
														Static53.aBoolean91 = local4489;
														Static192.aString200 = local4971;
														Static77.aClass28_6 = Static299.aClass177_5.method4679(local4971);
														continue;
													}
													Static247.method3966(local4489, local4971);
													continue;
												}
												if (local210 == 5422) {
													local29 -= 2;
													local594 = Static215.aStringArray23[local29];
													local1574 = Static215.aStringArray23[local29 + 1];
													local27--;
													local1030 = Static101.anIntArray517[local27];
													if (local594.length() > 0) {
														if (Static291.aStringArray36 == null) {
															Static291.aStringArray36 = new String[Static290.anIntArray516[Static84.anInt825]];
														}
														Static291.aStringArray36[local1030] = local594;
													}
													if (local1574.length() > 0) {
														if (Static110.aStringArray9 == null) {
															Static110.aStringArray9 = new String[Static290.anIntArray516[Static84.anInt825]];
														}
														Static110.aStringArray9[local1030] = local1574;
													}
													continue;
												}
												if (local210 == 5423) {
													local29--;
													System.out.println(Static215.aStringArray23[local29]);
													continue;
												}
												if (local210 == 5424) {
													local27 -= 11;
													Static247.anInt4920 = Static101.anIntArray517[local27];
													Static79.anInt1761 = Static101.anIntArray517[local27 + 1];
													Static200.anInt4164 = Static101.anIntArray517[local27 + 2];
													Static191.anInt703 = Static101.anIntArray517[local27 + 3];
													Static129.anInt2674 = Static101.anIntArray517[local27 + 4];
													Static34.anInt1969 = Static101.anIntArray517[local27 + 5];
													Static18.anInt464 = Static101.anIntArray517[local27 + 6];
													Static290.anInt6020 = Static101.anIntArray517[local27 + 7];
													Static25.anInt5784 = Static101.anIntArray517[local27 + 8];
													Static126.anInt2655 = Static101.anIntArray517[local27 + 9];
													Static11.anInt299 = Static101.anIntArray517[local27 + 10];
													Static201.aClass84_85.method2138(Static129.anInt2674);
													Static201.aClass84_85.method2138(Static34.anInt1969);
													Static201.aClass84_85.method2138(Static18.anInt464);
													Static201.aClass84_85.method2138(Static290.anInt6020);
													Static201.aClass84_85.method2138(Static25.anInt5784);
													Static201.aBoolean347 = true;
													continue;
												}
												if (local210 == 5425) {
													Static206.method3480();
													Static201.aBoolean347 = false;
													continue;
												}
												if (local210 == 5426) {
													local27--;
													Static139.anInt3000 = Static101.anIntArray517[local27];
													continue;
												}
												if (local210 == 5427) {
													local27 -= 2;
													Static124.anInt2629 = Static101.anIntArray517[local27];
													Static188.anInt3950 = Static101.anIntArray517[local27 + 1];
													continue;
												}
												if (local210 == 5428) {
													local27 -= 2;
													local794 = Static101.anIntArray517[local27 + 1];
													local800 = Static101.anIntArray517[local27];
													Static101.anIntArray517[local27++] = Static274.method4578(local800, local794) ? 1 : 0;
													continue;
												}
											} else if (local210 < 5600) {
												if (local210 == 5500) {
													local27 -= 4;
													local1030 = Static101.anIntArray517[local27 + 2];
													local800 = Static101.anIntArray517[local27];
													local794 = Static101.anIntArray517[local27 + 1];
													local639 = Static101.anIntArray517[local27 + 3];
													Static216.method3647(local794, (local800 >> 14 & 0x3FFF) - Static125.anInt5772, -Static203.anInt4236 + (local800 & 0x3FFF), false, local639, local1030);
													continue;
												}
												if (local210 == 5501) {
													local27 -= 4;
													local800 = Static101.anIntArray517[local27];
													local1030 = Static101.anIntArray517[local27 + 2];
													local794 = Static101.anIntArray517[local27 + 1];
													local639 = Static101.anIntArray517[local27 + 3];
													Static30.method635(local1030, local639, (local800 & 0x3FFF) - Static203.anInt4236, local794, (local800 >> 14 & 0x3FFF) - Static125.anInt5772);
													continue;
												}
												if (local210 == 5502) {
													local27 -= 6;
													local800 = Static101.anIntArray517[local27];
													if (local800 >= 2) {
														throw new RuntimeException();
													}
													Static65.anInt1462 = local800;
													local794 = Static101.anIntArray517[local27 + 1];
													if (local794 + 1 >= Static206.anIntArrayArrayArray11[Static65.anInt1462].length >> 1) {
														throw new RuntimeException();
													}
													Static103.anInt2241 = 0;
													Static27.anInt579 = local794;
													Static191.anInt708 = Static101.anIntArray517[local27 + 2];
													Static11.anInt295 = Static101.anIntArray517[local27 + 3];
													local1030 = Static101.anIntArray517[local27 + 4];
													if (local1030 >= 2) {
														throw new RuntimeException();
													}
													Static150.anInt3180 = local1030;
													local639 = Static101.anIntArray517[local27 + 5];
													if (Static206.anIntArrayArrayArray11[Static150.anInt3180].length >> 1 <= local639 + 1) {
														throw new RuntimeException();
													}
													Static101.anInt6027 = 3;
													Static297.anInt6216 = local639;
													continue;
												}
												if (local210 == 5503) {
													Static181.method3135();
													continue;
												}
												if (local210 == 5504) {
													local27 -= 2;
													Static191.method630(Static101.anIntArray517[local27 + 1], Static101.anIntArray517[local27]);
													continue;
												}
												if (local210 == 5505) {
													Static101.anIntArray517[local27++] = (int) Static198.aFloat41;
													continue;
												}
												if (local210 == 5506) {
													Static101.anIntArray517[local27++] = (int) Static142.aFloat31;
													continue;
												}
												if (local210 == 5507) {
													Static20.method1061();
													continue;
												}
												if (local210 == 5508) {
													Static67.method4890();
													continue;
												}
												if (local210 == 5509) {
													Static67.method4880();
													continue;
												}
												if (local210 == 5510) {
													Static141.method2473();
													continue;
												}
												if (local210 == 5512) {
													Static229.method4372();
													continue;
												}
											} else if (local210 < 5700) {
												if (local210 == 5600) {
													local29 -= 2;
													local27--;
													local1030 = Static101.anIntArray517[local27];
													local594 = Static215.aStringArray23[local29];
													local1574 = Static215.aStringArray23[local29 + 1];
													if (Static236.anInt4804 == 10 && Static162.anInt3417 == 0 && Static91.anInt2032 == 0 && Static260.anInt5416 == 0 && Static257.anInt5346 == 0) {
														Static201.method3397(local1030, local594, local1574);
													}
													continue;
												}
												if (local210 == 5601) {
													Static35.method698();
													continue;
												}
												if (local210 == 5602) {
													if (Static91.anInt2032 == 0) {
														Static231.anInt4770 = -2;
													}
													continue;
												}
												if (local210 == 5603) {
													local27 -= 4;
													if (Static236.anInt4804 == 10 && Static162.anInt3417 == 0 && Static91.anInt2032 == 0 && Static260.anInt5416 == 0 && Static257.anInt5346 == 0) {
														Static153.method2645(Static101.anIntArray517[local27 + 3], Static101.anIntArray517[local27 + 2], Static101.anIntArray517[local27 + 1], Static101.anIntArray517[local27]);
													}
													continue;
												}
												if (local210 == 5604) {
													local29--;
													if (Static236.anInt4804 == 10 && Static162.anInt3417 == 0 && Static91.anInt2032 == 0 && Static260.anInt5416 == 0 && Static257.anInt5346 == 0) {
														Static232.method3895(Static61.method2447(Static215.aStringArray23[local29]));
													}
													continue;
												}
												if (local210 == 5605) {
													local27 -= 7;
													local29 -= 3;
													if (Static236.anInt4804 == 10 && Static162.anInt3417 == 0 && Static91.anInt2032 == 0 && Static260.anInt5416 == 0 && Static257.anInt5346 == 0) {
														Static108.method2007(Static101.anIntArray517[local27 + 6] == 1, Static215.aStringArray23[local29 + 1], Static101.anIntArray517[local27 + 1], Static101.anIntArray517[local27 + 4] == 1, Static101.anIntArray517[local27 + 2], Static61.method2447(Static215.aStringArray23[local29]), Static101.anIntArray517[local27 + 5] == 1, Static101.anIntArray517[local27 + 3], Static215.aStringArray23[local29 + 2], Static101.anIntArray517[local27]);
													}
													continue;
												}
												if (local210 == 5606) {
													if (Static260.anInt5416 == 0) {
														Static184.anInt3908 = -2;
													}
													continue;
												}
												if (local210 == 5607) {
													Static101.anIntArray517[local27++] = Static231.anInt4770;
													continue;
												}
												if (local210 == 5608) {
													Static101.anIntArray517[local27++] = Static10.anInt280;
													continue;
												}
												if (local210 == 5609) {
													Static101.anIntArray517[local27++] = Static184.anInt3908;
													continue;
												}
												if (local210 == 5610) {
													for (local800 = 0; local800 < 5; local800++) {
														Static215.aStringArray23[local29++] = local800 < Static287.aStringArray35.length ? Static221.method3714(Static287.aStringArray35[local800]) : "";
													}
													Static287.aStringArray35 = null;
													continue;
												}
												if (local210 == 5611) {
													Static101.anIntArray517[local27++] = Static115.anInt2459;
													continue;
												}
											} else if (local210 < 6100) {
												if (local210 == 6001) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 1) {
														local800 = 1;
													}
													if (local800 > 4) {
														local800 = 4;
													}
													Static105.anInt2269 = local800;
													if (!Static60.aBoolean106 || !Static56.aBoolean96) {
														if (Static105.anInt2269 == 1) {
															Static93.method1743(0.9F);
														}
														if (Static105.anInt2269 == 2) {
															Static93.method1743(0.8F);
														}
														if (Static105.anInt2269 == 3) {
															Static93.method1743(0.7F);
														}
														if (Static105.anInt2269 == 4) {
															Static93.method1743(0.6F);
														}
													}
													if (Static60.aBoolean106) {
														Static152.method2618();
														if (!Static56.aBoolean96) {
															Static59.method1134();
														}
													}
													Static199.method3366();
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6002) {
													local27--;
													Static255.method4118(Static101.anIntArray517[local27] == 1);
													Static212.method3612();
													Static59.method1134();
													Static296.method4924();
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6003) {
													local27--;
													Static43.aBoolean77 = Static101.anIntArray517[local27] == 1;
													Static296.method4924();
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6005) {
													local27--;
													Static106.aBoolean183 = Static101.anIntArray517[local27] == 1;
													Static59.method1134();
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6006) {
													local27--;
													Static126.aBoolean211 = Static101.anIntArray517[local27] == 1;
													((Class127_Sub1) Static93.anInterface5_1).method3530(!Static126.aBoolean211);
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6007) {
													local27--;
													Static150.aBoolean262 = Static101.anIntArray517[local27] == 1;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6008) {
													local27--;
													Static242.aBoolean414 = Static101.anIntArray517[local27] == 1;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6009) {
													local27--;
													Static96.aBoolean166 = Static101.anIntArray517[local27] == 1;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6010) {
													local27--;
													Static284.aBoolean475 = Static101.anIntArray517[local27] == 1;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6011) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0 || local800 > 2) {
														local800 = 0;
													}
													Static195.anInt4041 = local800;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6012) {
													if (Static60.aBoolean106) {
														Static4.method119(0, 0);
													}
													local27--;
													Static56.aBoolean96 = Static101.anIntArray517[local27] == 1;
													if (Static60.aBoolean106 && Static56.aBoolean96) {
														Static93.method1743(0.7F);
													} else {
														if (Static105.anInt2269 == 1) {
															Static93.method1743(0.9F);
														}
														if (Static105.anInt2269 == 2) {
															Static93.method1743(0.8F);
														}
														if (Static105.anInt2269 == 3) {
															Static93.method1743(0.7F);
														}
														if (Static105.anInt2269 == 4) {
															Static93.method1743(0.6F);
														}
													}
													Static59.method1134();
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6014) {
													local27--;
													Static233.aBoolean407 = Static101.anIntArray517[local27] == 1;
													if (Static60.aBoolean106) {
														Static59.method1134();
													}
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6015) {
													local27--;
													Static102.aBoolean176 = Static101.anIntArray517[local27] == 1;
													if (Static60.aBoolean106) {
														Static152.method2618();
													}
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6016) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0 || local800 > 2) {
														local800 = 0;
													}
													Static287.anInt5952 = local800;
													if (Static60.aBoolean106) {
														Static52.aBoolean89 = true;
													}
													continue;
												}
												if (local210 == 6017) {
													local27--;
													Static183.aBoolean332 = Static101.anIntArray517[local27] == 1;
													Static58.method1122();
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6018) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0) {
														local800 = 0;
													}
													if (local800 > 127) {
														local800 = 127;
													}
													Static214.anInt4468 = local800;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6019) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0) {
														local800 = 0;
													}
													if (local800 > 255) {
														local800 = 255;
													}
													if (local800 != Static91.anInt2030) {
														if (Static91.anInt2030 == 0 && Static149.anInt3177 != -1) {
															Static173.method2976(Static152.aClass84_61, local800, Static149.anInt3177);
															Static145.aBoolean257 = false;
														} else if (local800 == 0) {
															Static1.method6();
															Static145.aBoolean257 = false;
														} else {
															Static90.method1695(local800);
														}
														Static91.anInt2030 = local800;
													}
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6020) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0) {
														local800 = 0;
													}
													if (local800 > 127) {
														local800 = 127;
													}
													Static144.anInt3122 = local800;
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													continue;
												}
												if (local210 == 6021) {
													local27--;
													Static145.aBoolean258 = Static101.anIntArray517[local27] == 1;
													Static296.method4924();
													continue;
												}
												if (local210 == 6023) {
													local4489 = false;
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0) {
														local800 = 0;
													}
													if (local800 > 2) {
														local800 = 2;
													}
													if (Static171.anInt3655 < 96) {
														local800 = 0;
														local4489 = true;
													}
													Static179.method3100(local800);
													Static67.method4884(Static299.aClass177_5);
													Static278.aBoolean468 = false;
													Static101.anIntArray517[local27++] = local4489 ? 0 : 1;
													continue;
												}
												if (local210 == 6024) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0 || local800 > 2) {
														local800 = 0;
													}
													Static84.anInt817 = local800;
													Static67.method4884(Static299.aClass177_5);
													continue;
												}
												if (local210 == 6027) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (!Static60.aBoolean106) {
														continue;
													}
													if (local800 < 0 || local800 > 1) {
														local800 = 0;
													}
													Static42.method827(local800 == 1);
													continue;
												}
												if (local210 == 6028) {
													local27--;
													Static246.aBoolean422 = Static101.anIntArray517[local27] != 0;
													Static67.method4884(Static299.aClass177_5);
													continue;
												}
											} else if (local210 < 6200) {
												if (local210 == 6101) {
													Static101.anIntArray517[local27++] = Static105.anInt2269;
													continue;
												}
												if (local210 == 6102) {
													Static101.anIntArray517[local27++] = Static67.method4885() ? 1 : 0;
													continue;
												}
												if (local210 == 6103) {
													Static101.anIntArray517[local27++] = Static43.aBoolean77 ? 1 : 0;
													continue;
												}
												if (local210 == 6105) {
													Static101.anIntArray517[local27++] = Static106.aBoolean183 ? 1 : 0;
													continue;
												}
												if (local210 == 6106) {
													Static101.anIntArray517[local27++] = Static126.aBoolean211 ? 1 : 0;
													continue;
												}
												if (local210 == 6107) {
													Static101.anIntArray517[local27++] = Static150.aBoolean262 ? 1 : 0;
													continue;
												}
												if (local210 == 6108) {
													Static101.anIntArray517[local27++] = Static242.aBoolean414 ? 1 : 0;
													continue;
												}
												if (local210 == 6109) {
													Static101.anIntArray517[local27++] = Static96.aBoolean166 ? 1 : 0;
													continue;
												}
												if (local210 == 6110) {
													Static101.anIntArray517[local27++] = Static284.aBoolean475 ? 1 : 0;
													continue;
												}
												if (local210 == 6111) {
													Static101.anIntArray517[local27++] = Static195.anInt4041;
													continue;
												}
												if (local210 == 6112) {
													Static101.anIntArray517[local27++] = Static56.aBoolean96 ? 1 : 0;
													continue;
												}
												if (local210 == 6114) {
													Static101.anIntArray517[local27++] = Static233.aBoolean407 ? 1 : 0;
													continue;
												}
												if (local210 == 6115) {
													Static101.anIntArray517[local27++] = Static102.aBoolean176 ? 1 : 0;
													continue;
												}
												if (local210 == 6116) {
													Static101.anIntArray517[local27++] = Static287.anInt5952;
													continue;
												}
												if (local210 == 6117) {
													Static101.anIntArray517[local27++] = Static183.aBoolean332 ? 1 : 0;
													continue;
												}
												if (local210 == 6118) {
													Static101.anIntArray517[local27++] = Static214.anInt4468;
													continue;
												}
												if (local210 == 6119) {
													Static101.anIntArray517[local27++] = Static91.anInt2030;
													continue;
												}
												if (local210 == 6120) {
													Static101.anIntArray517[local27++] = Static144.anInt3122;
													continue;
												}
												if (local210 == 6121) {
													if (Static60.aBoolean106) {
														Static101.anIntArray517[local27++] = Static60.aBoolean100 ? 1 : 0;
													} else {
														Static101.anIntArray517[local27++] = 0;
													}
													continue;
												}
												if (local210 == 6123) {
													Static101.anIntArray517[local27++] = Static179.method3104();
													continue;
												}
												if (local210 == 6124) {
													Static101.anIntArray517[local27++] = Static84.anInt817;
													continue;
												}
												if (local210 == 6126) {
													if (Static60.aBoolean106) {
														Static101.anIntArray517[local27++] = Static276.method4591() ? 1 : 0;
													} else {
														Static101.anIntArray517[local27++] = 0;
													}
													continue;
												}
												if (local210 == 6127) {
													Static101.anIntArray517[local27++] = Static97.aBoolean169 ? 1 : 0;
													continue;
												}
												if (local210 == 6128) {
													Static101.anIntArray517[local27++] = Static246.aBoolean422 ? 1 : 0;
													continue;
												}
											} else if (local210 < 6300) {
												if (local210 == 6200) {
													local27 -= 2;
													Static50.aShort12 = (short) Static101.anIntArray517[local27];
													if (Static50.aShort12 <= 0) {
														Static50.aShort12 = 256;
													}
													Static18.aShort1 = (short) Static101.anIntArray517[local27 + 1];
													if (Static18.aShort1 <= 0) {
														Static18.aShort1 = 205;
													}
													continue;
												}
												if (local210 == 6201) {
													local27 -= 2;
													Static49.aShort11 = (short) Static101.anIntArray517[local27];
													if (Static49.aShort11 <= 0) {
														Static49.aShort11 = 256;
													}
													Static289.aShort44 = (short) Static101.anIntArray517[local27 + 1];
													if (Static289.aShort44 <= 0) {
														Static289.aShort44 = 320;
													}
													continue;
												}
												if (local210 == 6202) {
													local27 -= 4;
													Static136.aShort15 = (short) Static101.anIntArray517[local27];
													if (Static136.aShort15 <= 0) {
														Static136.aShort15 = 1;
													}
													Static41.aShort7 = (short) Static101.anIntArray517[local27 + 1];
													if (Static41.aShort7 <= 0) {
														Static41.aShort7 = 32767;
													} else if (Static136.aShort15 > Static41.aShort7) {
														Static41.aShort7 = Static136.aShort15;
													}
													Static47.aShort10 = (short) Static101.anIntArray517[local27 + 2];
													if (Static47.aShort10 <= 0) {
														Static47.aShort10 = 1;
													}
													Static156.aShort43 = (short) Static101.anIntArray517[local27 + 3];
													if (Static156.aShort43 <= 0) {
														Static156.aShort43 = 32767;
													} else if (Static47.aShort10 > Static156.aShort43) {
														Static156.aShort43 = Static47.aShort10;
													}
													continue;
												}
												if (local210 == 6203) {
													Static146.method2584(0, 0, false, Static74.aClass115_8.anInt3487, Static74.aClass115_8.anInt3555);
													Static101.anIntArray517[local27++] = Static37.anInt907;
													Static101.anIntArray517[local27++] = Static34.anInt1962;
													continue;
												}
												if (local210 == 6204) {
													Static101.anIntArray517[local27++] = Static49.aShort11;
													Static101.anIntArray517[local27++] = Static289.aShort44;
													continue;
												}
												if (local210 == 6205) {
													Static101.anIntArray517[local27++] = Static50.aShort12;
													Static101.anIntArray517[local27++] = Static18.aShort1;
													continue;
												}
											} else if (local210 < 6400) {
												if (local210 == 6300) {
													Static101.anIntArray517[local27++] = (int) (Static6.method126() / 60000L);
													continue;
												}
												if (local210 == 6301) {
													Static101.anIntArray517[local27++] = (int) (Static6.method126() / 86400000L) - 11745;
													continue;
												}
												if (local210 == 6302) {
													local27 -= 3;
													local800 = Static101.anIntArray517[local27];
													local1030 = Static101.anIntArray517[local27 + 2];
													local794 = Static101.anIntArray517[local27 + 1];
													Static290.aCalendar2.clear();
													Static290.aCalendar2.set(11, 12);
													Static290.aCalendar2.set(local1030, local794, local800);
													Static101.anIntArray517[local27++] = (int) (Static290.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local210 == 6303) {
													Static290.aCalendar2.clear();
													Static290.aCalendar2.setTime(new Date(Static6.method126()));
													Static101.anIntArray517[local27++] = Static290.aCalendar2.get(1);
													continue;
												}
												if (local210 == 6304) {
													local4489 = true;
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (local800 < 0) {
														local4489 = (local800 + 1) % 4 == 0;
													} else if (local800 < 1582) {
														local4489 = local800 % 4 == 0;
													} else if (local800 % 4 != 0) {
														local4489 = false;
													} else if (local800 % 100 != 0) {
														local4489 = true;
													} else if (local800 % 400 != 0) {
														local4489 = false;
													}
													Static101.anIntArray517[local27++] = local4489 ? 1 : 0;
													continue;
												}
											} else if (local210 < 6500) {
												if (local210 == 6405) {
													Static101.anIntArray517[local27++] = Static140.method2469() ? 1 : 0;
													continue;
												}
												if (local210 == 6406) {
													Static101.anIntArray517[local27++] = Static15.method315() ? 1 : 0;
													continue;
												}
											} else if (local210 < 6600) {
												if (local210 == 6500) {
													if (Static236.anInt4804 == 10 && Static162.anInt3417 == 0 && Static91.anInt2032 == 0 && Static260.anInt5416 == 0) {
														Static101.anIntArray517[local27++] = Static199.method3362() == -1 ? 0 : 1;
														continue;
													}
													Static101.anIntArray517[local27++] = 1;
													continue;
												}
												@Pc(6054) Class48 local6054;
												@Pc(6029) Class132_Sub1 local6029;
												if (local210 == 6501) {
													local6029 = Static41.method804();
													if (local6029 == null) {
														Static101.anIntArray517[local27++] = -1;
														Static101.anIntArray517[local27++] = 0;
														Static215.aStringArray23[local29++] = "";
														Static101.anIntArray517[local27++] = 0;
														Static215.aStringArray23[local29++] = "";
														Static101.anIntArray517[local27++] = 0;
													} else {
														Static101.anIntArray517[local27++] = local6029.anInt4132;
														Static101.anIntArray517[local27++] = local6029.anInt4122;
														Static215.aStringArray23[local29++] = local6029.aString206;
														local6054 = local6029.method3348();
														Static101.anIntArray517[local27++] = local6054.anInt1269;
														Static215.aStringArray23[local29++] = local6054.aString65;
														Static101.anIntArray517[local27++] = local6029.anInt4117;
													}
													continue;
												}
												if (local210 == 6502) {
													local6029 = Static30.method637();
													if (local6029 == null) {
														Static101.anIntArray517[local27++] = -1;
														Static101.anIntArray517[local27++] = 0;
														Static215.aStringArray23[local29++] = "";
														Static101.anIntArray517[local27++] = 0;
														Static215.aStringArray23[local29++] = "";
														Static101.anIntArray517[local27++] = 0;
													} else {
														Static101.anIntArray517[local27++] = local6029.anInt4132;
														Static101.anIntArray517[local27++] = local6029.anInt4122;
														Static215.aStringArray23[local29++] = local6029.aString206;
														local6054 = local6029.method3348();
														Static101.anIntArray517[local27++] = local6054.anInt1269;
														Static215.aStringArray23[local29++] = local6054.aString65;
														Static101.anIntArray517[local27++] = local6029.anInt4117;
													}
													continue;
												}
												if (local210 == 6503) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													if (Static236.anInt4804 == 10 && Static162.anInt3417 == 0 && Static91.anInt2032 == 0 && Static260.anInt5416 == 0) {
														Static101.anIntArray517[local27++] = Static47.method973(local800) ? 1 : 0;
														continue;
													}
													Static101.anIntArray517[local27++] = 0;
													continue;
												}
												if (local210 == 6504) {
													local27--;
													Static225.anInt4698 = Static101.anIntArray517[local27];
													Static67.method4884(Static299.aClass177_5);
													continue;
												}
												if (local210 == 6505) {
													Static101.anIntArray517[local27++] = Static225.anInt4698;
													continue;
												}
												if (local210 == 6506) {
													local27--;
													local800 = Static101.anIntArray517[local27];
													@Pc(6269) Class132_Sub1 local6269 = Static163.method2818(local800);
													if (local6269 == null) {
														Static101.anIntArray517[local27++] = -1;
														Static215.aStringArray23[local29++] = "";
														Static101.anIntArray517[local27++] = 0;
														Static215.aStringArray23[local29++] = "";
														Static101.anIntArray517[local27++] = 0;
													} else {
														Static101.anIntArray517[local27++] = local6269.anInt4122;
														Static215.aStringArray23[local29++] = local6269.aString206;
														@Pc(6315) Class48 local6315 = local6269.method3348();
														Static101.anIntArray517[local27++] = local6315.anInt1269;
														Static215.aStringArray23[local29++] = local6315.aString65;
														Static101.anIntArray517[local27++] = local6269.anInt4117;
													}
													continue;
												}
												if (local210 == 6507) {
													local27 -= 4;
													local800 = Static101.anIntArray517[local27];
													local4489 = Static101.anIntArray517[local27 + 1] == 1;
													local1030 = Static101.anIntArray517[local27 + 2];
													local6373 = Static101.anIntArray517[local27 + 3] == 1;
													Static12.method278(local800, local6373, local4489, local1030);
													continue;
												}
											} else if (local210 < 6700) {
												if (local210 == 6600) {
													local27--;
													Static236.aBoolean408 = Static101.anIntArray517[local27] == 1;
													Static67.method4884(Static299.aClass177_5);
													continue;
												}
												if (local210 == 6601) {
													Static101.anIntArray517[local27++] = Static236.aBoolean408 ? 1 : 0;
													continue;
												}
											}
										} else {
											if (local210 == 5100) {
												if (Static79.aBooleanArray8[86]) {
													Static101.anIntArray517[local27++] = 1;
												} else {
													Static101.anIntArray517[local27++] = 0;
												}
												continue;
											}
											if (local210 == 5101) {
												if (Static79.aBooleanArray8[82]) {
													Static101.anIntArray517[local27++] = 1;
												} else {
													Static101.anIntArray517[local27++] = 0;
												}
												continue;
											}
											if (local210 == 5102) {
												if (Static79.aBooleanArray8[81]) {
													Static101.anIntArray517[local27++] = 1;
												} else {
													Static101.anIntArray517[local27++] = 0;
												}
												continue;
											}
										}
									} else if (local210 == 4500) {
										local27 -= 2;
										local800 = Static101.anIntArray517[local27];
										local794 = Static101.anIntArray517[local27 + 1];
										local2782 = Static268.method4459(local794);
										if (local2782.method1911()) {
											Static215.aStringArray23[local29++] = Static35.method702(local800).method274(local794, local2782.aString111);
										} else {
											Static101.anIntArray517[local27++] = Static35.method702(local800).method272(local794, local2782.anInt2217);
										}
										continue;
									}
								} else {
									if (local210 == 4100) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										local27--;
										local794 = Static101.anIntArray517[local27];
										Static215.aStringArray23[local29++] = local594 + local794;
										continue;
									}
									if (local210 == 4101) {
										local29 -= 2;
										local594 = Static215.aStringArray23[local29];
										local1574 = Static215.aStringArray23[local29 + 1];
										Static215.aStringArray23[local29++] = local594 + local1574;
										continue;
									}
									if (local210 == 4102) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										local27--;
										local794 = Static101.anIntArray517[local27];
										Static215.aStringArray23[local29++] = local594 + Static61.method2445(local794);
										continue;
									}
									if (local210 == 4103) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static215.aStringArray23[local29++] = local594.toLowerCase();
										continue;
									}
									if (local210 == 4104) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										@Pc(9653) long local9653 = ((long) local800 + 11745L) * 86400000L;
										Static290.aCalendar2.setTime(new Date(local9653));
										local639 = Static290.aCalendar2.get(5);
										local3557 = Static290.aCalendar2.get(2);
										local4717 = Static290.aCalendar2.get(1);
										Static215.aStringArray23[local29++] = local639 + "-" + Static265.aStringArray31[local3557] + "-" + local4717;
										continue;
									}
									if (local210 == 4105) {
										local29 -= 2;
										local594 = Static215.aStringArray23[local29];
										local1574 = Static215.aStringArray23[local29 + 1];
										if (Static111.aClass36_Sub3_Sub2_1.aClass126_2 != null && Static111.aClass36_Sub3_Sub2_1.aClass126_2.aBoolean335) {
											Static215.aStringArray23[local29++] = local1574;
											continue;
										}
										Static215.aStringArray23[local29++] = local594;
										continue;
									}
									if (local210 == 4106) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static215.aStringArray23[local29++] = Integer.toString(local800);
										continue;
									}
									if (local210 == 4107) {
										local29 -= 2;
										Static101.anIntArray517[local27++] = Static86.method1624(Static75.method1377(Static215.aStringArray23[local29 + 1], Static215.aStringArray23[local29], Static206.anInt4309));
										continue;
									}
									if (local210 == 4108) {
										local27 -= 2;
										local29--;
										local594 = Static215.aStringArray23[local29];
										local1030 = Static101.anIntArray517[local27 + 1];
										local794 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static136.method2420(local1030).method3301(local594, local794);
										continue;
									}
									if (local210 == 4109) {
										local27 -= 2;
										local29--;
										local594 = Static215.aStringArray23[local29];
										local1030 = Static101.anIntArray517[local27 + 1];
										local794 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static136.method2420(local1030).method3316(local594, local794);
										continue;
									}
									if (local210 == 4110) {
										local29 -= 2;
										local594 = Static215.aStringArray23[local29];
										local1574 = Static215.aStringArray23[local29 + 1];
										local27--;
										if (Static101.anIntArray517[local27] == 1) {
											Static215.aStringArray23[local29++] = local594;
										} else {
											Static215.aStringArray23[local29++] = local1574;
										}
										continue;
									}
									if (local210 == 4111) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										Static215.aStringArray23[local29++] = Static178.method3305(local594);
										continue;
									}
									if (local210 == 4112) {
										local27--;
										local794 = Static101.anIntArray517[local27];
										local29--;
										local594 = Static215.aStringArray23[local29];
										if (local794 == -1) {
											throw new RuntimeException("null char");
										}
										Static215.aStringArray23[local29++] = local594 + (char) local794;
										continue;
									}
									if (local210 == 4113) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static251.method4015((char) local800) ? 1 : 0;
										continue;
									}
									if (local210 == 4114) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static124.method2248((char) local800) ? 1 : 0;
										continue;
									}
									if (local210 == 4115) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static172.method2957((char) local800) ? 1 : 0;
										continue;
									}
									if (local210 == 4116) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Static18.method412((char) local800) ? 1 : 0;
										continue;
									}
									if (local210 == 4117) {
										local29--;
										local594 = Static215.aStringArray23[local29];
										if (local594 == null) {
											Static101.anIntArray517[local27++] = 0;
										} else {
											Static101.anIntArray517[local27++] = local594.length();
										}
										continue;
									}
									if (local210 == 4118) {
										local27 -= 2;
										local29--;
										local594 = Static215.aStringArray23[local29];
										local1030 = Static101.anIntArray517[local27 + 1];
										local794 = Static101.anIntArray517[local27];
										Static215.aStringArray23[local29++] = local594.substring(local794, local1030);
										continue;
									}
									if (local210 == 4119) {
										@Pc(10089) boolean local10089 = false;
										local29--;
										local594 = Static215.aStringArray23[local29];
										@Pc(10100) StringBuffer local10100 = new StringBuffer(local594.length());
										for (local639 = 0; local639 < local594.length(); local639++) {
											@Pc(10114) char local10114 = local594.charAt(local639);
											if (local10114 == '<') {
												local10089 = true;
											} else if (local10114 == '>') {
												local10089 = false;
											} else if (!local10089) {
												local10100.append(local10114);
											}
										}
										Static215.aStringArray23[local29++] = local10100.toString();
										continue;
									}
									if (local210 == 4120) {
										local27 -= 2;
										local1030 = Static101.anIntArray517[local27 + 1];
										local29--;
										local594 = Static215.aStringArray23[local29];
										local794 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local594.indexOf(local794, local1030);
										continue;
									}
									if (local210 == 4121) {
										local29 -= 2;
										local594 = Static215.aStringArray23[local29];
										local1574 = Static215.aStringArray23[local29 + 1];
										local27--;
										local1030 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = local594.indexOf(local1574, local1030);
										continue;
									}
									if (local210 == 4122) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Character.toLowerCase((char) local800);
										continue;
									}
									if (local210 == 4123) {
										local27--;
										local800 = Static101.anIntArray517[local27];
										Static101.anIntArray517[local27++] = Character.toUpperCase((char) local800);
										continue;
									}
									if (local210 == 4124) {
										local27--;
										local1126 = Static101.anIntArray517[local27] != 0;
										local27--;
										local794 = Static101.anIntArray517[local27];
										Static215.aStringArray23[local29++] = Static61.method2450(local1126, 0, (long) local794, Static206.anInt4309);
										continue;
									}
								}
							}
						} else {
							if (local210 >= 2000) {
								local210 -= 1000;
								local27--;
								local1177 = Static90.method1692(Static101.anIntArray517[local27]);
							} else {
								local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
							}
							if (local210 == 1000) {
								local27 -= 4;
								local1177.anInt3501 = Static101.anIntArray517[local27];
								local1177.anInt3519 = Static101.anIntArray517[local27 + 1];
								local794 = Static101.anIntArray517[local27 + 2];
								local1030 = Static101.anIntArray517[local27 + 3];
								if (local794 < 0) {
									local794 = 0;
								} else if (local794 > 5) {
									local794 = 5;
								}
								if (local1030 < 0) {
									local1030 = 0;
								} else if (local1030 > 5) {
									local1030 = 5;
								}
								local1177.aByte18 = (byte) local794;
								local1177.aByte15 = (byte) local1030;
								Static298.method4263(local1177);
								Static213.method3620(local1177);
								if (local1177.anInt3499 == -1) {
									Static186.method3173(local1177.anInt3552);
								}
								continue;
							}
							if (local210 == 1001) {
								local27 -= 4;
								local1177.anInt3530 = Static101.anIntArray517[local27];
								local1177.anInt3475 = Static101.anIntArray517[local27 + 1];
								local1177.anInt3547 = 0;
								local1177.anInt3476 = 0;
								local1030 = Static101.anIntArray517[local27 + 3];
								if (local1030 < 0) {
									local1030 = 0;
								} else if (local1030 > 4) {
									local1030 = 4;
								}
								local794 = Static101.anIntArray517[local27 + 2];
								local1177.aByte17 = (byte) local1030;
								if (local794 < 0) {
									local794 = 0;
								} else if (local794 > 4) {
									local794 = 4;
								}
								local1177.aByte16 = (byte) local794;
								Static298.method4263(local1177);
								Static213.method3620(local1177);
								if (local1177.anInt3538 == 0) {
									Static126.method2252(local1177, false);
								}
								continue;
							}
							if (local210 == 1003) {
								local27--;
								local4489 = Static101.anIntArray517[local27] == 1;
								if (local4489 != local1177.aBoolean292) {
									local1177.aBoolean292 = local4489;
									Static298.method4263(local1177);
								}
								if (local1177.anInt3499 == -1) {
									Static39.method745(local1177.anInt3552);
								}
								continue;
							}
							if (local210 == 1004) {
								local27 -= 2;
								local1177.anInt3497 = Static101.anIntArray517[local27];
								local1177.anInt3535 = Static101.anIntArray517[local27 + 1];
								Static298.method4263(local1177);
								Static213.method3620(local1177);
								if (local1177.anInt3538 == 0) {
									Static126.method2252(local1177, false);
								}
								continue;
							}
							if (local210 == 1005) {
								local27--;
								local1177.aBoolean295 = Static101.anIntArray517[local27] == 1;
								continue;
							}
						}
					}
				} else {
					if (local210 == 100) {
						local27 -= 3;
						local800 = Static101.anIntArray517[local27];
						local794 = Static101.anIntArray517[local27 + 1];
						local1030 = Static101.anIntArray517[local27 + 2];
						if (local794 == 0) {
							throw new RuntimeException();
						}
						local12816 = Static90.method1692(local800);
						if (local12816.aClass115Array1 == null) {
							local12816.aClass115Array1 = new Class115[local1030 + 1];
						}
						if (local1030 >= local12816.aClass115Array1.length) {
							@Pc(14675) Class115[] local14675 = new Class115[local1030 + 1];
							for (local4717 = 0; local4717 < local12816.aClass115Array1.length; local4717++) {
								local14675[local4717] = local12816.aClass115Array1[local4717];
							}
							local12816.aClass115Array1 = local14675;
						}
						if (local1030 > 0 && local12816.aClass115Array1[local1030 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1030 - 1));
						}
						@Pc(14728) Class115 local14728 = new Class115();
						local14728.anInt3499 = local1030;
						local14728.anInt3538 = local794;
						local14728.aBoolean291 = true;
						local14728.anInt3525 = local14728.anInt3552 = local12816.anInt3552;
						local12816.aClass115Array1[local1030] = local14728;
						if (local1001) {
							Static200.aClass115_14 = local14728;
						} else {
							Static66.aClass115_7 = local14728;
						}
						Static298.method4263(local12816);
						continue;
					}
					@Pc(14793) Class115 local14793;
					if (local210 == 101) {
						local1177 = local1001 ? Static200.aClass115_14 : Static66.aClass115_7;
						if (local1177.anInt3499 == -1) {
							if (local1001) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local14793 = Static90.method1692(local1177.anInt3552);
						local14793.aClass115Array1[local1177.anInt3499] = null;
						Static298.method4263(local14793);
						continue;
					}
					if (local210 == 102) {
						local27--;
						local1177 = Static90.method1692(Static101.anIntArray517[local27]);
						local1177.aClass115Array1 = null;
						Static298.method4263(local1177);
						continue;
					}
					if (local210 == 200) {
						local27 -= 2;
						local800 = Static101.anIntArray517[local27];
						local794 = Static101.anIntArray517[local27 + 1];
						local12835 = Static266.method4442(local800, local794);
						if (local12835 != null && local794 != -1) {
							Static101.anIntArray517[local27++] = 1;
							if (local1001) {
								Static200.aClass115_14 = local12835;
							} else {
								Static66.aClass115_7 = local12835;
							}
							continue;
						}
						Static101.anIntArray517[local27++] = 0;
						continue;
					}
					if (local210 == 201) {
						local27--;
						local800 = Static101.anIntArray517[local27];
						local14793 = Static90.method1692(local800);
						if (local14793 == null) {
							Static101.anIntArray517[local27++] = 0;
						} else {
							Static101.anIntArray517[local27++] = 1;
							if (local1001) {
								Static200.aClass115_14 = local14793;
							} else {
								Static66.aClass115_7 = local14793;
							}
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14918) Exception local14918) {
			if (local18.aString168 == null) {
				if (Static7.anInt237 != 0) {
					Static173.method2979("", "Clientscript error - check log for details", 0);
				}
				Static108.method2009(local14918, "CS2 - scr:" + local18.aLong315 + " op:" + local39);
			} else {
				@Pc(14955) StringBuffer local14955 = new StringBuffer(30);
				local14955.append("%0a - in: ").append(local18.aString168);
				for (local53 = Static33.anInt737 - 1; local53 >= 0; local53--) {
					local14955.append("%0a - via: ").append(Static222.aClass123Array1[local53].aClass2_Sub3_Sub17_1.aString168);
				}
				if (local39 == 40) {
					local53 = local37[local31];
					local14955.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local53));
				}
				if (Static7.anInt237 != 0) {
					Static173.method2979("", "Clientscript error in: " + local18.aString168, 0);
				}
				Static108.method2009(local14918, "CS2 - scr:" + local18.aLong315 + " op:" + local39 + local14955.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V")
	public static void method4895() {
		for (@Pc(18) Class2_Sub15 local18 = (Class2_Sub15) Static152.aClass79_14.method1992(); local18 != null; local18 = (Class2_Sub15) Static152.aClass79_14.method1991()) {
			@Pc(23) int local23 = local18.anInt2424;
			if (Static249.method3997(local23)) {
				@Pc(31) Class115[] local31 = Static219.aClass115ArrayArray1[local23];
				@Pc(33) boolean local33 = true;
				@Pc(35) int local35;
				for (local35 = 0; local35 < local31.length; local35++) {
					if (local31[local35] != null) {
						local33 = local31[local35].aBoolean291;
						break;
					}
				}
				if (!local33) {
					local35 = (int) local18.aLong315;
					@Pc(70) Class115 local70 = Static90.method1692(local35);
					if (local70 != null) {
						Static298.method4263(local70);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)V")
	private static void method4896(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg0, 2);
		local8.method2719();
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(II)I")
	public static int method4897(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 6 & 0x3;
		@Pc(13) int local13 = arg0 & 0x3F;
		if (local13 == 18) {
			if (local9 == 0) {
				return 1;
			}
			if (local9 == 1) {
				return 2;
			}
			if (local9 == 2) {
				return 4;
			}
			if (local9 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local9 == 0) {
				return 16;
			}
			if (local9 == 1) {
				return 32;
			}
			if (local9 == 2) {
				return 64;
			}
			if (local9 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!jd;ILclient!jd;)V")
	public static void method4898(@OriginalArg(0) Class84 arg0, @OriginalArg(2) Class84 arg1) {
		Static218.aClass84_100 = arg0;
		Static173.aClass84_70 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
	public static void method4899() {
		for (@Pc(13) int local13 = 0; local13 < Static102.anInt2234; local13++) {
			@Pc(24) int local24 = Static161.anIntArray256[local13];
			@Pc(28) Class36_Sub3_Sub2 local28 = Static212.aClass36_Sub3_Sub2Array1[local24];
			@Pc(32) int local32 = Static250.aClass2_Sub26_Sub1_2.method4261();
			if ((local32 & 0x40) != 0) {
				local32 += Static250.aClass2_Sub26_Sub1_2.method4261() << 8;
			}
			Static191.method626(local28, local24, local32);
		}
	}
}

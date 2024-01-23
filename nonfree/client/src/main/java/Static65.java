import java.math.BigInteger;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!th;")
	public static Class168 aClass168_50;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public static int anInt1391 = 0;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "Z")
	public static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
	public static int[] anIntArray167 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V")
	public static void method1138(@OriginalArg(0) int arg0) {
		if (Static126.anIntArray277 == null || arg0 > Static126.anIntArray277.length) {
			Static126.anIntArray277 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method1140() {
		if (Static179.aString256.toLowerCase().indexOf("microsoft") != -1) {
			Static5.anIntArray309[191] = 73;
			Static5.anIntArray309[190] = 72;
			Static5.anIntArray309[220] = 74;
			Static5.anIntArray309[223] = 28;
			Static5.anIntArray309[189] = 26;
			Static5.anIntArray309[192] = 58;
			Static5.anIntArray309[219] = 42;
			Static5.anIntArray309[222] = 59;
			Static5.anIntArray309[187] = 27;
			Static5.anIntArray309[188] = 71;
			Static5.anIntArray309[221] = 43;
			Static5.anIntArray309[186] = 57;
			return;
		}
		Static5.anIntArray309[93] = 43;
		Static5.anIntArray309[61] = 27;
		Static5.anIntArray309[91] = 42;
		Static5.anIntArray309[47] = 73;
		Static5.anIntArray309[59] = 57;
		if (Static179.aMethod1 == null) {
			Static5.anIntArray309[192] = 58;
			Static5.anIntArray309[222] = 59;
		} else {
			Static5.anIntArray309[520] = 59;
			Static5.anIntArray309[222] = 58;
			Static5.anIntArray309[192] = 28;
		}
		Static5.anIntArray309[46] = 72;
		Static5.anIntArray309[45] = 26;
		Static5.anIntArray309[44] = 71;
		Static5.anIntArray309[92] = 74;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method1143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub3_Sub22 local4 = Static271.method4108(12, arg0);
		local4.method4468();
		local4.anInt5852 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	public static void method1144() {
		Static290.aClass89_48.method2273(5);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!eb;II)V")
	public static void method1145(@OriginalArg(0) Class1_Sub3_Sub6 arg0, @OriginalArg(1) int arg1) {
		Static264.anInt5304 = 0;
		@Pc(9) int local9 = 0;
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = arg0.anIntArray158;
		@Pc(24) byte local24 = -1;
		@Pc(26) int local26 = -1;
		@Pc(29) int[] local29 = arg0.anIntArray157;
		@Pc(632) int local632;
		try {
			@Pc(31) int local31 = 0;
			label4560: while (true) {
				local31++;
				if (local31 > arg1) {
					throw new RuntimeException("slow");
				}
				local26++;
				@Pc(45) int local45 = local22[local26];
				@Pc(637) int local637;
				@Pc(471) int local471;
				@Pc(428) String local428;
				if (local45 < 100) {
					if (local45 == 0) {
						Static182.anIntArray355[local19++] = local29[local26];
						continue;
					}
					@Pc(70) int local70;
					if (local45 == 1) {
						local70 = local29[local26];
						Static182.anIntArray355[local19++] = Static296.anIntArray530[local70];
						continue;
					}
					if (local45 == 2) {
						local70 = local29[local26];
						local19--;
						Static11.method306(Static182.anIntArray355[local19], local70);
						continue;
					}
					if (local45 == 3) {
						Static124.aStringArray26[local9++] = arg0.aStringArray12[local26];
						continue;
					}
					if (local45 == 6) {
						local26 += local29[local26];
						continue;
					}
					if (local45 == 7) {
						local19 -= 2;
						if (Static182.anIntArray355[local19] != Static182.anIntArray355[local19 + 1]) {
							local26 += local29[local26];
						}
						continue;
					}
					if (local45 == 8) {
						local19 -= 2;
						if (Static182.anIntArray355[local19] == Static182.anIntArray355[local19 + 1]) {
							local26 += local29[local26];
						}
						continue;
					}
					if (local45 == 9) {
						local19 -= 2;
						if (Static182.anIntArray355[local19] < Static182.anIntArray355[local19 + 1]) {
							local26 += local29[local26];
						}
						continue;
					}
					if (local45 == 10) {
						local19 -= 2;
						if (Static182.anIntArray355[local19] > Static182.anIntArray355[local19 + 1]) {
							local26 += local29[local26];
						}
						continue;
					}
					if (local45 == 21) {
						if (Static264.anInt5304 == 0) {
							return;
						}
						@Pc(244) Class35 local244 = Static240.aClass35Array1[--Static264.anInt5304];
						Static127.aStringArray27 = local244.aStringArray8;
						local26 = local244.anInt1057;
						Static61.anIntArray161 = local244.anIntArray131;
						arg0 = local244.aClass1_Sub3_Sub6_1;
						local22 = arg0.anIntArray158;
						local29 = arg0.anIntArray157;
						continue;
					}
					if (local45 == 25) {
						local70 = local29[local26];
						Static182.anIntArray355[local19++] = Static138.method2304(local70);
						continue;
					}
					if (local45 == 27) {
						local70 = local29[local26];
						local19--;
						Static235.method3731(Static182.anIntArray355[local19], local70);
						continue;
					}
					if (local45 == 31) {
						local19 -= 2;
						if (Static182.anIntArray355[local19] <= Static182.anIntArray355[local19 + 1]) {
							local26 += local29[local26];
						}
						continue;
					}
					if (local45 == 32) {
						local19 -= 2;
						if (Static182.anIntArray355[local19 + 1] <= Static182.anIntArray355[local19]) {
							local26 += local29[local26];
						}
						continue;
					}
					if (local45 == 33) {
						Static182.anIntArray355[local19++] = Static61.anIntArray161[local29[local26]];
						continue;
					}
					@Pc(373) int local373;
					if (local45 == 34) {
						local373 = local29[local26];
						local19--;
						Static61.anIntArray161[local373] = Static182.anIntArray355[local19];
						continue;
					}
					if (local45 == 35) {
						Static124.aStringArray26[local9++] = Static127.aStringArray27[local29[local26]];
						continue;
					}
					if (local45 == 36) {
						local373 = local29[local26];
						local9--;
						Static127.aStringArray27[local373] = Static124.aStringArray26[local9];
						continue;
					}
					if (local45 == 37) {
						local70 = local29[local26];
						local9 -= local70;
						local428 = Static159.method2558(Static124.aStringArray26, local70, local9);
						Static124.aStringArray26[local9++] = local428;
						continue;
					}
					if (local45 == 38) {
						local19--;
						continue;
					}
					if (local45 == 39) {
						local9--;
						continue;
					}
					if (local45 == 40) {
						local70 = local29[local26];
						@Pc(461) Class1_Sub3_Sub6 local461 = Static44.method878(local70);
						@Pc(465) int[] local465 = new int[local461.anInt1262];
						@Pc(469) String[] local469 = new String[local461.anInt1263];
						for (local471 = 0; local471 < local461.anInt1258; local471++) {
							local465[local471] = Static182.anIntArray355[local471 + local19 - local461.anInt1258];
						}
						for (local471 = 0; local471 < local461.anInt1264; local471++) {
							local469[local471] = Static124.aStringArray26[local471 + local9 - local461.anInt1264];
						}
						local9 -= local461.anInt1264;
						local19 -= local461.anInt1258;
						@Pc(533) Class35 local533 = new Class35();
						local533.aStringArray8 = Static127.aStringArray27;
						local533.anInt1057 = local26;
						local533.aClass1_Sub3_Sub6_1 = arg0;
						local533.anIntArray131 = Static61.anIntArray161;
						if (Static264.anInt5304 >= Static240.aClass35Array1.length) {
							throw new RuntimeException();
						}
						local26 = -1;
						Static240.aClass35Array1[Static264.anInt5304++] = local533;
						Static61.anIntArray161 = local465;
						Static127.aStringArray27 = local469;
						arg0 = local461;
						local29 = local461.anIntArray157;
						local22 = local461.anIntArray158;
						continue;
					}
					if (local45 == 42) {
						Static182.anIntArray355[local19++] = Static279.anIntArray507[local29[local26]];
						continue;
					}
					if (local45 == 43) {
						local70 = local29[local26];
						local19--;
						Static279.anIntArray507[local70] = Static182.anIntArray355[local19];
						Static172.method2808(local70);
						continue;
					}
					if (local45 == 44) {
						local70 = local29[local26] >> 16;
						local632 = local29[local26] & 0xFFFF;
						local19--;
						local637 = Static182.anIntArray355[local19];
						if (local637 >= 0 && local637 <= 5000) {
							@Pc(653) byte local653 = -1;
							if (local632 == 105) {
								local653 = 0;
							}
							Static81.anIntArray196[local70] = local637;
							local471 = 0;
							while (true) {
								if (local471 >= local637) {
									continue label4560;
								}
								Static165.anIntArrayArray45[local70][local471] = local653;
								local471++;
							}
						}
						throw new RuntimeException();
					}
					if (local45 == 45) {
						local70 = local29[local26];
						local19--;
						local632 = Static182.anIntArray355[local19];
						if (local632 >= 0 && Static81.anIntArray196[local70] > local632) {
							Static182.anIntArray355[local19++] = Static165.anIntArrayArray45[local70][local632];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 46) {
						local70 = local29[local26];
						local19 -= 2;
						local632 = Static182.anIntArray355[local19];
						if (local632 >= 0 && Static81.anIntArray196[local70] > local632) {
							Static165.anIntArrayArray45[local70][local632] = Static182.anIntArray355[local19 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 47) {
						@Pc(776) String local776 = Static31.aStringArray4[local29[local26]];
						if (local776 == null) {
							local776 = "null";
						}
						Static124.aStringArray26[local9++] = local776;
						continue;
					}
					if (local45 == 48) {
						local70 = local29[local26];
						local9--;
						Static31.aStringArray4[local70] = Static124.aStringArray26[local9];
						Static289.method4436(local70);
						continue;
					}
					if (local45 == 51) {
						@Pc(820) Class186 local820 = arg0.aClass186Array1[local29[local26]];
						local19--;
						@Pc(830) Class1_Sub17 local830 = (Class1_Sub17) local820.method4570((long) Static182.anIntArray355[local19]);
						if (local830 != null) {
							local26 += local830.anInt3669;
						}
						continue;
					}
				}
				@Pc(848) boolean local848;
				if (local29[local26] == 1) {
					local848 = true;
				} else {
					local848 = false;
				}
				@Pc(875) int local875;
				@Pc(910) int local910;
				@Pc(1003) Class191 local1003;
				@Pc(888) Class191 local888;
				@Pc(1077) Class191 local1077;
				if (local45 < 300) {
					if (local45 == 100) {
						local19 -= 3;
						local632 = Static182.anIntArray355[local19];
						local637 = Static182.anIntArray355[local19 + 1];
						local875 = Static182.anIntArray355[local19 + 2];
						if (local637 == 0) {
							throw new RuntimeException();
						}
						local888 = Static171.method2789(local632);
						if (local888.aClass191Array2 == null) {
							local888.aClass191Array2 = new Class191[local875 + 1];
						}
						if (local875 >= local888.aClass191Array2.length) {
							@Pc(908) Class191[] local908 = new Class191[local875 + 1];
							for (local910 = 0; local910 < local888.aClass191Array2.length; local910++) {
								local908[local910] = local888.aClass191Array2[local910];
							}
							local888.aClass191Array2 = local908;
						}
						if (local875 > 0 && local888.aClass191Array2[local875 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local875 - 1));
						}
						@Pc(959) Class191 local959 = new Class191();
						local959.anInt6093 = local959.anInt6134 = local888.anInt6134;
						local959.anInt6086 = local637;
						local959.anInt6165 = local875;
						local959.aBoolean408 = true;
						local888.aClass191Array2[local875] = local959;
						if (local848) {
							Static99.aClass191_6 = local959;
						} else {
							Static2.aClass191_1 = local959;
						}
						Static40.method817(local888);
						continue;
					}
					@Pc(1026) Class191 local1026;
					if (local45 == 101) {
						local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
						if (local1003.anInt6165 == -1) {
							if (local848) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1026 = Static171.method2789(local1003.anInt6134);
						local1026.aClass191Array2[local1003.anInt6165] = null;
						Static40.method817(local1026);
						continue;
					}
					if (local45 == 102) {
						local19--;
						local1003 = Static171.method2789(Static182.anIntArray355[local19]);
						local1003.aClass191Array2 = null;
						Static40.method817(local1003);
						continue;
					}
					if (local45 == 200) {
						local19 -= 2;
						local632 = Static182.anIntArray355[local19];
						local637 = Static182.anIntArray355[local19 + 1];
						local1077 = Static205.method3267(local637, local632);
						if (local1077 != null && local637 != -1) {
							Static182.anIntArray355[local19++] = 1;
							if (local848) {
								Static99.aClass191_6 = local1077;
							} else {
								Static2.aClass191_1 = local1077;
							}
							continue;
						}
						Static182.anIntArray355[local19++] = 0;
						continue;
					}
					if (local45 == 201) {
						local19--;
						local632 = Static182.anIntArray355[local19];
						local1026 = Static171.method2789(local632);
						if (local1026 == null) {
							Static182.anIntArray355[local19++] = 0;
						} else {
							Static182.anIntArray355[local19++] = 1;
							if (local848) {
								Static99.aClass191_6 = local1026;
							} else {
								Static2.aClass191_1 = local1026;
							}
						}
						continue;
					}
				} else {
					@Pc(1257) boolean local1257;
					if (local45 < 500) {
						if (local45 == 403) {
							local19 -= 2;
							local632 = Static182.anIntArray355[local19];
							local637 = Static182.anIntArray355[local19 + 1];
							for (local875 = 0; local875 < Static247.anIntArray467.length; local875++) {
								if (Static247.anIntArray467[local875] == local632) {
									Static56.aClass2_Sub4_Sub2_1.aClass167_1.method4033(local637, local875);
									continue label4560;
								}
							}
							local875 = 0;
							while (true) {
								if (Static166.anIntArray336.length <= local875) {
									continue label4560;
								}
								if (Static166.anIntArray336[local875] == local632) {
									Static56.aClass2_Sub4_Sub2_1.aClass167_1.method4033(local637, local875);
									continue label4560;
								}
								local875++;
							}
						}
						if (local45 == 404) {
							local19 -= 2;
							local632 = Static182.anIntArray355[local19];
							local637 = Static182.anIntArray355[local19 + 1];
							Static56.aClass2_Sub4_Sub2_1.aClass167_1.method4032(local637, local632);
							continue;
						}
						if (local45 == 410) {
							local19--;
							local1257 = Static182.anIntArray355[local19] != 0;
							Static56.aClass2_Sub4_Sub2_1.aClass167_1.method4036(local1257);
							continue;
						}
					} else {
						@Pc(1490) boolean local1490;
						if ((local45 < 1000 || local45 >= 1100) && (local45 < 2000 || local45 >= 2100)) {
							@Pc(1994) String local1994;
							if (local45 >= 1100 && local45 < 1200 || local45 >= 2100 && local45 < 2200) {
								if (local45 >= 2000) {
									local19--;
									local1003 = Static171.method2789(Static182.anIntArray355[local19]);
									local45 -= 1000;
								} else {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
								}
								if (local45 == 1100) {
									local19 -= 2;
									local1003.anInt6163 = Static182.anIntArray355[local19];
									if (local1003.anInt6163 > local1003.anInt6155 - local1003.anInt6088) {
										local1003.anInt6163 = local1003.anInt6155 - local1003.anInt6088;
									}
									if (local1003.anInt6163 < 0) {
										local1003.anInt6163 = 0;
									}
									local1003.anInt6106 = Static182.anIntArray355[local19 + 1];
									if (local1003.anInt6106 > local1003.anInt6151 - local1003.anInt6128) {
										local1003.anInt6106 = local1003.anInt6151 - local1003.anInt6128;
									}
									if (local1003.anInt6106 < 0) {
										local1003.anInt6106 = 0;
									}
									Static40.method817(local1003);
									if (local1003.anInt6165 == -1) {
										Static171.method2787(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1101) {
									local19--;
									local1003.anInt6083 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									if (local1003.anInt6165 == -1) {
										Static22.method471(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1102) {
									local19--;
									local1003.aBoolean392 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1103) {
									local19--;
									local1003.anInt6094 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1104) {
									local19--;
									local1003.anInt6154 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1105) {
									local19--;
									local637 = Static182.anIntArray355[local19];
									if (local1003.anInt6140 != local637) {
										local1003.anInt6140 = local637;
										Static40.method817(local1003);
									}
									if (local1003.anInt6165 == -1) {
										Static114.method1845(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1106) {
									local19--;
									local1003.anInt6107 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1107) {
									local19--;
									local1003.aBoolean398 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1108) {
									local1003.anInt6149 = 1;
									local19--;
									local1003.anInt6171 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									if (local1003.anInt6165 == -1) {
										Static109.method1800(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1109) {
									local19 -= 6;
									local1003.anInt6137 = Static182.anIntArray355[local19];
									local1003.anInt6138 = Static182.anIntArray355[local19 + 1];
									local1003.anInt6091 = Static182.anIntArray355[local19 + 2];
									local1003.anInt6118 = Static182.anIntArray355[local19 + 3];
									local1003.anInt6092 = Static182.anIntArray355[local19 + 4];
									local1003.anInt6173 = Static182.anIntArray355[local19 + 5];
									Static40.method817(local1003);
									if (local1003.anInt6165 == -1) {
										Static211.method3378(local1003.anInt6134);
										Static265.method4019(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1110) {
									local19--;
									local637 = Static182.anIntArray355[local19];
									if (local637 != local1003.anInt6080) {
										local1003.anInt6103 = 0;
										local1003.anInt6080 = local637;
										local1003.anInt6104 = 0;
										local1003.anInt6116 = 1;
										Static40.method817(local1003);
									}
									if (local1003.anInt6165 == -1) {
										Static41.method827(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1111) {
									local19--;
									local1003.aBoolean393 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1112) {
									local9--;
									local1994 = Static124.aStringArray26[local9];
									if (!local1994.equals(local1003.aString436)) {
										local1003.aString436 = local1994;
										Static40.method817(local1003);
									}
									if (local1003.anInt6165 == -1) {
										Static295.method4528(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1113) {
									local19--;
									local1003.anInt6082 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1114) {
									local19 -= 3;
									local1003.anInt6108 = Static182.anIntArray355[local19];
									local1003.anInt6153 = Static182.anIntArray355[local19 + 1];
									local1003.anInt6110 = Static182.anIntArray355[local19 + 2];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1115) {
									local19--;
									local1003.aBoolean404 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1116) {
									local19--;
									local1003.anInt6162 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1117) {
									local19--;
									local1003.anInt6109 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1118) {
									local19--;
									local1003.aBoolean400 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1119) {
									local19--;
									local1003.aBoolean409 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1120) {
									local19 -= 2;
									local1003.anInt6155 = Static182.anIntArray355[local19];
									local1003.anInt6151 = Static182.anIntArray355[local19 + 1];
									Static40.method817(local1003);
									if (local1003.anInt6086 == 0) {
										Static99.method1655(local1003, false);
									}
									continue;
								}
								if (local45 == 1121) {
									local19 -= 2;
									local1003.aShort83 = (short) Static182.anIntArray355[local19];
									local1003.aShort82 = (short) Static182.anIntArray355[local19 + 1];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1122) {
									local19--;
									local1003.aBoolean403 = Static182.anIntArray355[local19] == 1;
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1123) {
									local19--;
									local1003.anInt6173 = Static182.anIntArray355[local19];
									Static40.method817(local1003);
									if (local1003.anInt6165 == -1) {
										Static211.method3378(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1124) {
									local19--;
									local637 = Static182.anIntArray355[local19];
									local1003.aBoolean397 = local637 == 1;
									Static40.method817(local1003);
									continue;
								}
							} else if (local45 >= 1200 && local45 < 1300 || !(local45 < 2200 || local45 >= 2300)) {
								if (local45 < 2000) {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
								} else {
									local19--;
									local1003 = Static171.method2789(Static182.anIntArray355[local19]);
									local45 -= 1000;
								}
								Static40.method817(local1003);
								if (local45 == 1200 || local45 == 1205 || local45 == 1208 || local45 == 1209) {
									local19 -= 2;
									local637 = Static182.anIntArray355[local19];
									local875 = Static182.anIntArray355[local19 + 1];
									if (local1003.anInt6165 == -1) {
										Static215.method3448(local1003.anInt6134);
										Static211.method3378(local1003.anInt6134);
										Static265.method4019(local1003.anInt6134);
									}
									if (local637 == -1) {
										local1003.anInt6167 = -1;
										local1003.anInt6149 = 1;
										local1003.anInt6171 = -1;
										continue;
									}
									local1003.anInt6167 = local637;
									local1003.anInt6139 = local875;
									if (local45 == 1208 || local45 == 1209) {
										local1003.aBoolean407 = true;
									} else {
										local1003.aBoolean407 = false;
									}
									@Pc(14987) Class57 local14987 = Static56.method1050(local637);
									if (local45 == 1205) {
										local1003.aBoolean405 = false;
									} else {
										local1003.aBoolean405 = true;
									}
									local1003.anInt6091 = local14987.anInt1806;
									local1003.anInt6137 = local14987.anInt1815;
									local1003.anInt6092 = local14987.anInt1791;
									local1003.anInt6138 = local14987.anInt1779;
									local1003.anInt6173 = local14987.anInt1794;
									if (local1003.anInt6084 > 0) {
										local1003.anInt6173 = local1003.anInt6173 * 32 / local1003.anInt6084;
									} else if (local1003.anInt6150 > 0) {
										local1003.anInt6173 = local1003.anInt6173 * 32 / local1003.anInt6150;
									}
									local1003.anInt6118 = local14987.anInt1790;
									continue;
								}
								if (local45 == 1201) {
									local1003.anInt6149 = 2;
									local19--;
									local1003.anInt6171 = Static182.anIntArray355[local19];
									if (local1003.anInt6165 == -1) {
										Static109.method1800(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1202) {
									local1003.anInt6149 = 3;
									local1003.anInt6171 = Static56.aClass2_Sub4_Sub2_1.aClass167_1.method4037();
									if (local1003.anInt6165 == -1) {
										Static109.method1800(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1203) {
									local1003.anInt6149 = 6;
									local19--;
									local1003.anInt6171 = Static182.anIntArray355[local19];
									if (local1003.anInt6165 == -1) {
										Static109.method1800(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1204) {
									local1003.anInt6149 = 5;
									local19--;
									local1003.anInt6171 = Static182.anIntArray355[local19];
									if (local1003.anInt6165 == -1) {
										Static109.method1800(local1003.anInt6134);
									}
									continue;
								}
								if (local45 == 1206) {
									local19 -= 4;
									local1003.anInt6099 = Static182.anIntArray355[local19];
									local1003.anInt6112 = Static182.anIntArray355[local19 + 1];
									local1003.anInt6087 = Static182.anIntArray355[local19 + 2];
									local1003.anInt6127 = Static182.anIntArray355[local19 + 3];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1207) {
									local19 -= 2;
									local1003.anInt6090 = Static182.anIntArray355[local19];
									local1003.anInt6101 = Static182.anIntArray355[local19 + 1];
									Static40.method817(local1003);
									continue;
								}
								if (local45 == 1211) {
									local1003.anInt6160 = 0;
									local1003.anInt6171 = 2047;
									local1003.anInt6149 = 5;
									if (local1003.anInt6165 == -1) {
										Static109.method1800(local1003.anInt6134);
									}
									continue;
								}
							} else if (local45 >= 1300 && local45 < 1400 || local45 >= 2300 && local45 < 2400) {
								if (local45 >= 2000) {
									local45 -= 1000;
									local19--;
									local1003 = Static171.method2789(Static182.anIntArray355[local19]);
								} else {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
								}
								if (local45 == 1300) {
									local19--;
									local637 = Static182.anIntArray355[local19] - 1;
									if (local637 >= 0 && local637 <= 9) {
										local9--;
										local1003.method4670(Static124.aStringArray26[local9], local637);
										continue;
									}
									local9--;
									continue;
								}
								if (local45 == 1301) {
									local19 -= 2;
									local875 = Static182.anIntArray355[local19 + 1];
									local637 = Static182.anIntArray355[local19];
									local1003.aClass191_17 = Static205.method3267(local875, local637);
									continue;
								}
								if (local45 == 1302) {
									local19--;
									local1003.aBoolean396 = Static182.anIntArray355[local19] == 1;
									continue;
								}
								if (local45 == 1303) {
									local19--;
									local1003.anInt6143 = Static182.anIntArray355[local19];
									continue;
								}
								if (local45 == 1304) {
									local19--;
									local1003.anInt6124 = Static182.anIntArray355[local19];
									continue;
								}
								if (local45 == 1305) {
									local9--;
									local1003.aString433 = Static124.aStringArray26[local9];
									continue;
								}
								if (local45 == 1306) {
									local9--;
									local1003.aString434 = Static124.aStringArray26[local9];
									continue;
								}
								if (local45 == 1307) {
									local1003.aStringArray50 = null;
									continue;
								}
								if (local45 == 1308) {
									local19--;
									local1003.anInt6174 = Static182.anIntArray355[local19];
									local19--;
									local1003.anInt6117 = Static182.anIntArray355[local19];
									continue;
								}
								if (local45 == 1309) {
									local19--;
									local637 = Static182.anIntArray355[local19];
									local19--;
									local875 = Static182.anIntArray355[local19];
									if (local875 >= 1 && local875 <= 10) {
										local1003.method4679(local875 - 1, local637);
									}
									continue;
								}
								if (local45 == 1310) {
									local9--;
									local1003.aString438 = Static124.aStringArray26[local9];
									continue;
								}
							} else {
								@Pc(2648) int local2648;
								if (local45 >= 1400 && local45 < 1500 || local45 >= 2400 && local45 < 2500) {
									if (local45 < 2000) {
										local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
									} else {
										local19--;
										local1003 = Static171.method2789(Static182.anIntArray355[local19]);
										local45 -= 1000;
									}
									@Pc(2582) int[] local2582 = null;
									local9--;
									local1994 = Static124.aStringArray26[local9];
									if (local1994.length() > 0 && local1994.charAt(local1994.length() - 1) == 'Y') {
										local19--;
										local471 = Static182.anIntArray355[local19];
										if (local471 > 0) {
											local2582 = new int[local471];
											while (local471-- > 0) {
												local19--;
												local2582[local471] = Static182.anIntArray355[local19];
											}
										}
										local1994 = local1994.substring(0, local1994.length() - 1);
									}
									@Pc(2643) Object[] local2643 = new Object[local1994.length() + 1];
									for (local2648 = local2643.length - 1; local2648 >= 1; local2648--) {
										if (local1994.charAt(local2648 - 1) == 's') {
											local9--;
											local2643[local2648] = Static124.aStringArray26[local9];
										} else {
											local19--;
											local2643[local2648] = Integer.valueOf(Static182.anIntArray355[local19]);
										}
									}
									local19--;
									local2648 = Static182.anIntArray355[local19];
									if (local2648 == -1) {
										local2643 = null;
									} else {
										local2643[0] = Integer.valueOf(local2648);
									}
									local1003.aBoolean394 = true;
									if (local45 == 1400) {
										local1003.anObjectArray30 = local2643;
									} else if (local45 == 1401) {
										local1003.anObjectArray29 = local2643;
									} else if (local45 == 1402) {
										local1003.anObjectArray5 = local2643;
									} else if (local45 == 1403) {
										local1003.anObjectArray13 = local2643;
									} else if (local45 == 1404) {
										local1003.anObjectArray25 = local2643;
									} else if (local45 == 1405) {
										local1003.anObjectArray18 = local2643;
									} else if (local45 == 1406) {
										local1003.anObjectArray11 = local2643;
									} else if (local45 == 1407) {
										local1003.anIntArray547 = local2582;
										local1003.anObjectArray17 = local2643;
									} else if (local45 == 1408) {
										local1003.anObjectArray10 = local2643;
									} else if (local45 == 1409) {
										local1003.anObjectArray23 = local2643;
									} else if (local45 == 1410) {
										local1003.anObjectArray19 = local2643;
									} else if (local45 == 1411) {
										local1003.anObjectArray20 = local2643;
									} else if (local45 == 1412) {
										local1003.anObjectArray14 = local2643;
									} else if (local45 == 1414) {
										local1003.anObjectArray32 = local2643;
										local1003.anIntArray559 = local2582;
									} else if (local45 == 1415) {
										local1003.anObjectArray26 = local2643;
										local1003.anIntArray549 = local2582;
									} else if (local45 == 1416) {
										local1003.anObjectArray7 = local2643;
									} else if (local45 == 1417) {
										local1003.anObjectArray3 = local2643;
									} else if (local45 == 1418) {
										local1003.anObjectArray24 = local2643;
									} else if (local45 == 1419) {
										local1003.anObjectArray16 = local2643;
									} else if (local45 == 1420) {
										local1003.anObjectArray4 = local2643;
									} else if (local45 == 1421) {
										local1003.anObjectArray15 = local2643;
									} else if (local45 == 1422) {
										local1003.anObjectArray9 = local2643;
									} else if (local45 == 1423) {
										local1003.anObjectArray12 = local2643;
									} else if (local45 == 1424) {
										local1003.anObjectArray6 = local2643;
									} else if (local45 == 1425) {
										local1003.anObjectArray27 = local2643;
									} else if (local45 == 1426) {
										local1003.anObjectArray28 = local2643;
									} else if (local45 == 1427) {
										local1003.anObjectArray22 = local2643;
									} else if (local45 == 1428) {
										local1003.anObjectArray21 = local2643;
										local1003.anIntArray551 = local2582;
									} else if (local45 == 1429) {
										local1003.anIntArray555 = local2582;
										local1003.anObjectArray8 = local2643;
									}
									continue;
								}
								if (local45 < 1600) {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
									if (local45 == 1500) {
										Static182.anIntArray355[local19++] = local1003.anInt6123;
										continue;
									}
									if (local45 == 1501) {
										Static182.anIntArray355[local19++] = local1003.anInt6157;
										continue;
									}
									if (local45 == 1502) {
										Static182.anIntArray355[local19++] = local1003.anInt6088;
										continue;
									}
									if (local45 == 1503) {
										Static182.anIntArray355[local19++] = local1003.anInt6128;
										continue;
									}
									if (local45 == 1504) {
										Static182.anIntArray355[local19++] = local1003.aBoolean399 ? 1 : 0;
										continue;
									}
									if (local45 == 1505) {
										Static182.anIntArray355[local19++] = local1003.anInt6093;
										continue;
									}
								} else if (local45 < 1700) {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
									if (local45 == 1600) {
										Static182.anIntArray355[local19++] = local1003.anInt6163;
										continue;
									}
									if (local45 == 1601) {
										Static182.anIntArray355[local19++] = local1003.anInt6106;
										continue;
									}
									if (local45 == 1602) {
										Static124.aStringArray26[local9++] = local1003.aString436;
										continue;
									}
									if (local45 == 1603) {
										Static182.anIntArray355[local19++] = local1003.anInt6155;
										continue;
									}
									if (local45 == 1604) {
										Static182.anIntArray355[local19++] = local1003.anInt6151;
										continue;
									}
									if (local45 == 1605) {
										Static182.anIntArray355[local19++] = local1003.anInt6173;
										continue;
									}
									if (local45 == 1606) {
										Static182.anIntArray355[local19++] = local1003.anInt6091;
										continue;
									}
									if (local45 == 1607) {
										Static182.anIntArray355[local19++] = local1003.anInt6092;
										continue;
									}
									if (local45 == 1608) {
										Static182.anIntArray355[local19++] = local1003.anInt6118;
										continue;
									}
									if (local45 == 1609) {
										Static182.anIntArray355[local19++] = local1003.anInt6094;
										continue;
									}
									if (local45 == 1610) {
										Static182.anIntArray355[local19++] = local1003.anInt6137;
										continue;
									}
									if (local45 == 1611) {
										Static182.anIntArray355[local19++] = local1003.anInt6138;
										continue;
									}
									if (local45 == 1612) {
										Static182.anIntArray355[local19++] = local1003.anInt6140;
										continue;
									}
								} else if (local45 < 1800) {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
									if (local45 == 1700) {
										Static182.anIntArray355[local19++] = local1003.anInt6167;
										continue;
									}
									if (local45 == 1701) {
										if (local1003.anInt6167 == -1) {
											Static182.anIntArray355[local19++] = 0;
										} else {
											Static182.anIntArray355[local19++] = local1003.anInt6139;
										}
										continue;
									}
									if (local45 == 1702) {
										Static182.anIntArray355[local19++] = local1003.anInt6165;
										continue;
									}
								} else if (local45 < 1900) {
									local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
									if (local45 == 1800) {
										Static182.anIntArray355[local19++] = Static35.method737(local1003).method4556();
										continue;
									}
									if (local45 == 1801) {
										local19--;
										local637 = Static182.anIntArray355[local19];
										local637--;
										if (local1003.aStringArray50 != null && local637 < local1003.aStringArray50.length && local1003.aStringArray50[local637] != null) {
											Static124.aStringArray26[local9++] = local1003.aStringArray50[local637];
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 1802) {
										if (local1003.aString433 == null) {
											Static124.aStringArray26[local9++] = "";
										} else {
											Static124.aStringArray26[local9++] = local1003.aString433;
										}
										continue;
									}
								} else if (local45 < 2600) {
									local19--;
									local1003 = Static171.method2789(Static182.anIntArray355[local19]);
									if (local45 == 2500) {
										Static182.anIntArray355[local19++] = local1003.anInt6123;
										continue;
									}
									if (local45 == 2501) {
										Static182.anIntArray355[local19++] = local1003.anInt6157;
										continue;
									}
									if (local45 == 2502) {
										Static182.anIntArray355[local19++] = local1003.anInt6088;
										continue;
									}
									if (local45 == 2503) {
										Static182.anIntArray355[local19++] = local1003.anInt6128;
										continue;
									}
									if (local45 == 2504) {
										Static182.anIntArray355[local19++] = local1003.aBoolean399 ? 1 : 0;
										continue;
									}
									if (local45 == 2505) {
										Static182.anIntArray355[local19++] = local1003.anInt6093;
										continue;
									}
								} else if (local45 < 2700) {
									local19--;
									local1003 = Static171.method2789(Static182.anIntArray355[local19]);
									if (local45 == 2600) {
										Static182.anIntArray355[local19++] = local1003.anInt6163;
										continue;
									}
									if (local45 == 2601) {
										Static182.anIntArray355[local19++] = local1003.anInt6106;
										continue;
									}
									if (local45 == 2602) {
										Static124.aStringArray26[local9++] = local1003.aString436;
										continue;
									}
									if (local45 == 2603) {
										Static182.anIntArray355[local19++] = local1003.anInt6155;
										continue;
									}
									if (local45 == 2604) {
										Static182.anIntArray355[local19++] = local1003.anInt6151;
										continue;
									}
									if (local45 == 2605) {
										Static182.anIntArray355[local19++] = local1003.anInt6173;
										continue;
									}
									if (local45 == 2606) {
										Static182.anIntArray355[local19++] = local1003.anInt6091;
										continue;
									}
									if (local45 == 2607) {
										Static182.anIntArray355[local19++] = local1003.anInt6092;
										continue;
									}
									if (local45 == 2608) {
										Static182.anIntArray355[local19++] = local1003.anInt6118;
										continue;
									}
									if (local45 == 2609) {
										Static182.anIntArray355[local19++] = local1003.anInt6094;
										continue;
									}
									if (local45 == 2610) {
										Static182.anIntArray355[local19++] = local1003.anInt6137;
										continue;
									}
									if (local45 == 2611) {
										Static182.anIntArray355[local19++] = local1003.anInt6138;
										continue;
									}
									if (local45 == 2612) {
										Static182.anIntArray355[local19++] = local1003.anInt6140;
										continue;
									}
								} else if (local45 < 2800) {
									if (local45 == 2700) {
										local19--;
										local1003 = Static171.method2789(Static182.anIntArray355[local19]);
										Static182.anIntArray355[local19++] = local1003.anInt6167;
										continue;
									}
									if (local45 == 2701) {
										local19--;
										local1003 = Static171.method2789(Static182.anIntArray355[local19]);
										if (local1003.anInt6167 == -1) {
											Static182.anIntArray355[local19++] = 0;
										} else {
											Static182.anIntArray355[local19++] = local1003.anInt6139;
										}
										continue;
									}
									if (local45 == 2702) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										@Pc(3739) Class1_Sub12 local3739 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local632);
										if (local3739 == null) {
											Static182.anIntArray355[local19++] = 0;
										} else {
											Static182.anIntArray355[local19++] = 1;
										}
										continue;
									}
									if (local45 == 2703) {
										local19--;
										local1003 = Static171.method2789(Static182.anIntArray355[local19]);
										if (local1003.aClass191Array2 == null) {
											Static182.anIntArray355[local19++] = 0;
											continue;
										}
										local637 = local1003.aClass191Array2.length;
										for (local875 = 0; local875 < local1003.aClass191Array2.length; local875++) {
											if (local1003.aClass191Array2[local875] == null) {
												local637 = local875;
												break;
											}
										}
										Static182.anIntArray355[local19++] = local637;
										continue;
									}
									if (local45 == 2704 || local45 == 2705) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										@Pc(3836) Class1_Sub12 local3836 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local632);
										if (local3836 != null && local637 == local3836.anInt2208) {
											Static182.anIntArray355[local19++] = 1;
										} else {
											Static182.anIntArray355[local19++] = 0;
										}
										continue;
									}
								} else if (local45 < 2900) {
									local19--;
									local1003 = Static171.method2789(Static182.anIntArray355[local19]);
									if (local45 == 2800) {
										Static182.anIntArray355[local19++] = Static35.method737(local1003).method4556();
										continue;
									}
									if (local45 == 2801) {
										local19--;
										local637 = Static182.anIntArray355[local19];
										local637--;
										if (local1003.aStringArray50 != null && local637 < local1003.aStringArray50.length && local1003.aStringArray50[local637] != null) {
											Static124.aStringArray26[local9++] = local1003.aStringArray50[local637];
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 2802) {
										if (local1003.aString433 == null) {
											Static124.aStringArray26[local9++] = "";
										} else {
											Static124.aStringArray26[local9++] = local1003.aString433;
										}
										continue;
									}
								} else if (local45 < 3200) {
									if (local45 == 3100) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static116.method1877(local428);
										continue;
									}
									if (local45 == 3101) {
										local19 -= 2;
										Static105.method1738(Static56.aClass2_Sub4_Sub2_1, Static182.anIntArray355[local19 + 1], Static182.anIntArray355[local19]);
										continue;
									}
									if (local45 == 3103) {
										Static10.method301();
										continue;
									}
									if (local45 == 3104) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										local637 = 0;
										if (Static187.method3026(local428)) {
											local637 = Static79.method1345(local428);
										}
										Static2.aClass1_Sub14_Sub1_1.method2252(170);
										Static2.aClass1_Sub14_Sub1_1.method2236(local637);
										continue;
									}
									if (local45 == 3105) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static2.aClass1_Sub14_Sub1_1.method2252(220);
										Static2.aClass1_Sub14_Sub1_1.method2191(local428.length() + 1);
										Static2.aClass1_Sub14_Sub1_1.method2188(local428);
										continue;
									}
									if (local45 == 3106) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static2.aClass1_Sub14_Sub1_1.method2252(143);
										Static2.aClass1_Sub14_Sub1_1.method2191(local428.length() + 1);
										Static2.aClass1_Sub14_Sub1_1.method2188(local428);
										continue;
									}
									if (local45 == 3107) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										local9--;
										local1994 = Static124.aStringArray26[local9];
										Static279.method4259(local632, local1994);
										continue;
									}
									if (local45 == 3108) {
										local19 -= 3;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										local875 = Static182.anIntArray355[local19 + 2];
										local888 = Static171.method2789(local875);
										Static308.method4673(local888, local637, local632);
										continue;
									}
									if (local45 == 3109) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										local1077 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
										Static308.method4673(local1077, local637, local632);
										continue;
									}
									if (local45 == 3110) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static2.aClass1_Sub14_Sub1_1.method2252(166);
										Static2.aClass1_Sub14_Sub1_1.method2208(local632);
										continue;
									}
								} else if (local45 < 3300) {
									if (local45 == 3200) {
										local19 -= 3;
										Static81.method1381(Static182.anIntArray355[local19], Static182.anIntArray355[local19 + 2], 255, Static182.anIntArray355[local19 + 1]);
										continue;
									}
									if (local45 == 3201) {
										local19--;
										Static87.method1506(255, Static182.anIntArray355[local19]);
										continue;
									}
									if (local45 == 3202) {
										local19 -= 2;
										Static123.method2017(Static182.anIntArray355[local19 + 1], 255, Static182.anIntArray355[local19]);
										continue;
									}
								} else if (local45 < 3400) {
									if (local45 == 3300) {
										Static182.anIntArray355[local19++] = Static133.anInt3061;
										continue;
									}
									if (local45 == 3301) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = Static289.method4437(local632, local637);
										continue;
									}
									if (local45 == 3302) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = Static11.method307(local632, local637);
										continue;
									}
									if (local45 == 3303) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = Static287.method4395(local632, local637);
										continue;
									}
									if (local45 == 3304) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static1.method4722(local632).anInt2758;
										continue;
									}
									if (local45 == 3305) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static269.anIntArray483[local632];
										continue;
									}
									if (local45 == 3306) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static55.anIntArray155[local632];
										continue;
									}
									if (local45 == 3307) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static189.anIntArray363[local632];
										continue;
									}
									if (local45 == 3308) {
										local637 = Static159.anInt3527 + (Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7);
										local632 = Static185.anInt4085;
										local875 = Static217.anInt4673 + (Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7);
										Static182.anIntArray355[local19++] = (local637 << 14) + ((local632 << 28) + local875);
										continue;
									}
									if (local45 == 3309) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = local632 >> 14 & 0x3FFF;
										continue;
									}
									if (local45 == 3310) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = local632 >> 28;
										continue;
									}
									if (local45 == 3311) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = local632 & 0x3FFF;
										continue;
									}
									if (local45 == 3312) {
										Static182.anIntArray355[local19++] = Static160.aBoolean229 ? 1 : 0;
										continue;
									}
									if (local45 == 3313) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19] + 32768;
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = Static289.method4437(local632, local637);
										continue;
									}
									if (local45 == 3314) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19] + 32768;
										Static182.anIntArray355[local19++] = Static11.method307(local632, local637);
										continue;
									}
									if (local45 == 3315) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19] + 32768;
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = Static287.method4395(local632, local637);
										continue;
									}
									if (local45 == 3316) {
										if (Static77.anInt1764 < 2) {
											Static182.anIntArray355[local19++] = 0;
										} else {
											Static182.anIntArray355[local19++] = Static77.anInt1764;
										}
										continue;
									}
									if (local45 == 3317) {
										Static182.anIntArray355[local19++] = Static264.anInt5302;
										continue;
									}
									if (local45 == 3318) {
										Static182.anIntArray355[local19++] = Static96.anInt2210;
										continue;
									}
									if (local45 == 3321) {
										Static182.anIntArray355[local19++] = Static132.anInt3053;
										continue;
									}
									if (local45 == 3322) {
										Static182.anIntArray355[local19++] = Static281.anInt2795;
										continue;
									}
									if (local45 == 3323) {
										if (Static265.anInt5313 >= 5 && Static265.anInt5313 <= 9) {
											Static182.anIntArray355[local19++] = 1;
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3324) {
										if (Static265.anInt5313 >= 5 && Static265.anInt5313 <= 9) {
											Static182.anIntArray355[local19++] = Static265.anInt5313;
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3325) {
										Static182.anIntArray355[local19++] = Static247.aBoolean316 ? 1 : 0;
										continue;
									}
									if (local45 == 3326) {
										Static182.anIntArray355[local19++] = Static56.aClass2_Sub4_Sub2_1.anInt2867;
										continue;
									}
									if (local45 == 3327) {
										Static182.anIntArray355[local19++] = Static56.aClass2_Sub4_Sub2_1.aClass167_1.aBoolean332 ? 1 : 0;
										continue;
									}
									if (local45 == 3328) {
										Static182.anIntArray355[local19++] = Static50.aBoolean16 && !Static159.aBoolean228 ? 1 : 0;
										continue;
									}
									if (local45 == 3329) {
										Static182.anIntArray355[local19++] = Static80.aBoolean125 ? 1 : 0;
										continue;
									}
									if (local45 == 3330) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static279.method4260(local632);
										continue;
									}
									if (local45 == 3331) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static27.method3226(local632, local637, false);
										continue;
									}
									if (local45 == 3332) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = Static27.method3226(local632, local637, true);
										continue;
									}
									if (local45 == 3333) {
										Static182.anIntArray355[local19++] = Static22.anInt613;
										continue;
									}
									if (local45 == 3335) {
										Static182.anIntArray355[local19++] = Static134.anInt3081;
										continue;
									}
									if (local45 == 3336) {
										local19 -= 4;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										local471 = Static182.anIntArray355[local19 + 3];
										local632 += local637 << 14;
										local875 = Static182.anIntArray355[local19 + 2];
										local632 += local875 << 28;
										local632 += local471;
										Static182.anIntArray355[local19++] = local632;
										continue;
									}
									if (local45 == 3337) {
										Static182.anIntArray355[local19++] = Static23.anInt656;
										continue;
									}
								} else if (local45 < 3500) {
									@Pc(4133) Class1_Sub3_Sub14 local4133;
									if (local45 == 3400) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										local4133 = Static94.method1608(local632);
										if (local4133.aChar3 != 's') {
										}
										Static124.aStringArray26[local9++] = local4133.method2804(local637);
										continue;
									}
									if (local45 == 3408) {
										local19 -= 4;
										local632 = Static182.anIntArray355[local19];
										local875 = Static182.anIntArray355[local19 + 2];
										local637 = Static182.anIntArray355[local19 + 1];
										local471 = Static182.anIntArray355[local19 + 3];
										@Pc(4182) Class1_Sub3_Sub14 local4182 = Static94.method1608(local875);
										if (local4182.aChar4 == local632 && local4182.aChar3 == local637) {
											if (local637 == 115) {
												Static124.aStringArray26[local9++] = local4182.method2804(local471);
											} else {
												Static182.anIntArray355[local19++] = local4182.method2813(local471);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local45 == 3409) {
										local19 -= 3;
										local875 = Static182.anIntArray355[local19 + 2];
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										if (local637 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4257) Class1_Sub3_Sub14 local4257 = Static94.method1608(local637);
										if (local4257.aChar3 != local632) {
											throw new RuntimeException("C3409-1");
										}
										Static182.anIntArray355[local19++] = local4257.method2807(local875) ? 1 : 0;
										continue;
									}
									if (local45 == 3410) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										local9--;
										local1994 = Static124.aStringArray26[local9];
										if (local632 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4133 = Static94.method1608(local632);
										if (local4133.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static182.anIntArray355[local19++] = local4133.method2810(local1994) ? 1 : 0;
										continue;
									}
									if (local45 == 3411) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										@Pc(4353) Class1_Sub3_Sub14 local4353 = Static94.method1608(local632);
										Static182.anIntArray355[local19++] = local4353.aClass186_15.method4576();
										continue;
									}
								} else if (local45 < 3700) {
									if (local45 == 3600) {
										if (Static3.anInt60 == 0) {
											Static182.anIntArray355[local19++] = -2;
										} else if (Static3.anInt60 == 1) {
											Static182.anIntArray355[local19++] = -1;
										} else {
											Static182.anIntArray355[local19++] = Static223.anInt4775;
										}
										continue;
									}
									if (local45 == 3601) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 == 2 && local632 < Static223.anInt4775) {
											Static124.aStringArray26[local9++] = Static280.aStringArray43[local632];
											if (Static234.aStringArray39[local632] == null) {
												Static124.aStringArray26[local9++] = "";
											} else {
												Static124.aStringArray26[local9++] = Static234.aStringArray39[local632];
											}
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 3602) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 == 2 && local632 < Static223.anInt4775) {
											Static182.anIntArray355[local19++] = Static114.anIntArray259[local632];
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3603) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 == 2 && local632 < Static223.anInt4775) {
											Static182.anIntArray355[local19++] = Static77.anIntArray187[local632];
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3604) {
										local19--;
										local637 = Static182.anIntArray355[local19];
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static147.method2377(local637, local428);
										continue;
									}
									if (local45 == 3605) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static127.method2050(local428);
										continue;
									}
									if (local45 == 3606) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static176.method2830(local428);
										continue;
									}
									if (local45 == 3607) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static217.method3456(local428, false);
										continue;
									}
									if (local45 == 3608) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static153.method2463(local428);
										continue;
									}
									if (local45 == 3609) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										if (local428.startsWith("<img=0>") || local428.startsWith("<img=1>")) {
											local428 = local428.substring(7);
										}
										Static182.anIntArray355[local19++] = Static168.method2742(local428) ? 1 : 0;
										continue;
									}
									if (local45 == 3610) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 == 2 && Static223.anInt4775 > local632) {
											Static124.aStringArray26[local9++] = Static142.aStringArray29[local632];
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 3611) {
										if (Static129.aString176 == null) {
											Static124.aStringArray26[local9++] = "";
										} else {
											Static124.aStringArray26[local9++] = Static157.method2549(Static129.aString176);
										}
										continue;
									}
									if (local45 == 3612) {
										if (Static129.aString176 == null) {
											Static182.anIntArray355[local19++] = 0;
										} else {
											Static182.anIntArray355[local19++] = Static69.anInt1441;
										}
										continue;
									}
									if (local45 == 3613) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static129.aString176 != null && local632 < Static69.anInt1441) {
											Static124.aStringArray26[local9++] = Static304.aClass132Array1[local632].aString325;
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 3614) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static129.aString176 != null && Static69.anInt1441 > local632) {
											Static182.anIntArray355[local19++] = Static304.aClass132Array1[local632].anInt4668;
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3615) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static129.aString176 != null && Static69.anInt1441 > local632) {
											Static182.anIntArray355[local19++] = Static304.aClass132Array1[local632].aByte18;
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3616) {
										Static182.anIntArray355[local19++] = Static254.aByte23;
										continue;
									}
									if (local45 == 3617) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static162.method2570(local428);
										continue;
									}
									if (local45 == 3618) {
										Static182.anIntArray355[local19++] = Static206.aByte17;
										continue;
									}
									if (local45 == 3619) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static304.method4621(local428);
										continue;
									}
									if (local45 == 3620) {
										Static121.method1972();
										continue;
									}
									if (local45 == 3621) {
										if (Static3.anInt60 == 0) {
											Static182.anIntArray355[local19++] = -1;
										} else {
											Static182.anIntArray355[local19++] = Static159.anInt3526;
										}
										continue;
									}
									if (local45 == 3622) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 != 0 && local632 < Static159.anInt3526) {
											Static124.aStringArray26[local9++] = Static64.aStringArray14[local632];
											if (Static60.aStringArray13[local632] == null) {
												Static124.aStringArray26[local9++] = "";
											} else {
												Static124.aStringArray26[local9++] = Static60.aStringArray13[local632];
											}
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 3623) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										if (local428.startsWith("<img=0>") || local428.startsWith("<img=1>")) {
											local428 = local428.substring(7);
										}
										Static182.anIntArray355[local19++] = Static269.method4067(local428) ? 1 : 0;
										continue;
									}
									if (local45 == 3624) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static304.aClass132Array1 != null && local632 < Static69.anInt1441 && Static304.aClass132Array1[local632].aString324.equalsIgnoreCase(Static56.aClass2_Sub4_Sub2_1.aString182)) {
											Static182.anIntArray355[local19++] = 1;
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3625) {
										if (Static292.aString418 == null) {
											Static124.aStringArray26[local9++] = "";
										} else {
											Static124.aStringArray26[local9++] = Static292.aString418;
										}
										continue;
									}
									if (local45 == 3626) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static129.aString176 != null && Static69.anInt1441 > local632) {
											Static124.aStringArray26[local9++] = Static304.aClass132Array1[local632].aString326;
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 3627) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 == 2 && local632 >= 0 && local632 < Static223.anInt4775) {
											Static182.anIntArray355[local19++] = Static60.aBooleanArray16[local632] ? 1 : 0;
											continue;
										}
										Static182.anIntArray355[local19++] = 0;
										continue;
									}
									if (local45 == 3628) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										if (local428.startsWith("<img=0>") || local428.startsWith("<img=1>")) {
											local428 = local428.substring(7);
										}
										Static182.anIntArray355[local19++] = Static23.method500(local428);
										continue;
									}
									if (local45 == 3629) {
										Static182.anIntArray355[local19++] = Static228.anInt4842;
										continue;
									}
									if (local45 == 3630) {
										local9--;
										local428 = Static124.aStringArray26[local9];
										Static217.method3456(local428, true);
										continue;
									}
									if (local45 == 3631) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static141.aBooleanArray26[local632] ? 1 : 0;
										continue;
									}
									if (local45 == 3632) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static129.aString176 != null && local632 < Static69.anInt1441) {
											Static124.aStringArray26[local9++] = Static304.aClass132Array1[local632].aString324;
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
									if (local45 == 3633) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										if (Static3.anInt60 != 0 && local632 < Static159.anInt3526) {
											Static124.aStringArray26[local9++] = Static18.aStringArray2[local632];
											continue;
										}
										Static124.aStringArray26[local9++] = "";
										continue;
									}
								} else if (local45 < 4000) {
									if (local45 == 3903) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static184.aClass33Array1[local632].method818();
										continue;
									}
									if (local45 == 3904) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static184.aClass33Array1[local632].anInt984;
										continue;
									}
									if (local45 == 3905) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static184.aClass33Array1[local632].anInt988;
										continue;
									}
									if (local45 == 3906) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static184.aClass33Array1[local632].anInt991;
										continue;
									}
									if (local45 == 3907) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static184.aClass33Array1[local632].anInt982;
										continue;
									}
									if (local45 == 3908) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = Static184.aClass33Array1[local632].anInt983;
										continue;
									}
									if (local45 == 3910) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										local637 = Static184.aClass33Array1[local632].method816();
										Static182.anIntArray355[local19++] = local637 == 0 ? 1 : 0;
										continue;
									}
									if (local45 == 3911) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										local637 = Static184.aClass33Array1[local632].method816();
										Static182.anIntArray355[local19++] = local637 == 2 ? 1 : 0;
										continue;
									}
									if (local45 == 3912) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										local637 = Static184.aClass33Array1[local632].method816();
										Static182.anIntArray355[local19++] = local637 == 5 ? 1 : 0;
										continue;
									}
									if (local45 == 3913) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										local637 = Static184.aClass33Array1[local632].method816();
										Static182.anIntArray355[local19++] = local637 == 1 ? 1 : 0;
										continue;
									}
								} else if (local45 < 4100) {
									if (local45 == 4000) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = local632 + local637;
										continue;
									}
									if (local45 == 4001) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local632 - local637;
										continue;
									}
									if (local45 == 4002) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local637 * local632;
										continue;
									}
									if (local45 == 4003) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = local632 / local637;
										continue;
									}
									if (local45 == 4004) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = (int) ((double) local632 * Math.random());
										continue;
									}
									if (local45 == 4005) {
										local19--;
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = (int) (Math.random() * (double) (local632 + 1));
										continue;
									}
									if (local45 == 4006) {
										local19 -= 5;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										local875 = Static182.anIntArray355[local19 + 2];
										local471 = Static182.anIntArray355[local19 + 3];
										local2648 = Static182.anIntArray355[local19 + 4];
										Static182.anIntArray355[local19++] = (local2648 - local875) * (-local632 + local637) / (local471 - local875) + local632;
										continue;
									}
									@Pc(5733) long local5733;
									@Pc(5726) long local5726;
									if (local45 == 4007) {
										local19 -= 2;
										local5726 = Static182.anIntArray355[local19];
										local5733 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = (int) (local5733 * local5726 / 100L + local5726);
										continue;
									}
									if (local45 == 4008) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = 0x1 << local637 | local632;
										continue;
									}
									if (local45 == 4009) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local632 & -(0x1 << local637) - 1;
										continue;
									}
									if (local45 == 4010) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = (local632 & 0x1 << local637) == 0 ? 0 : 1;
										continue;
									}
									if (local45 == 4011) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										Static182.anIntArray355[local19++] = local632 % local637;
										continue;
									}
									if (local45 == 4012) {
										local19 -= 2;
										local637 = Static182.anIntArray355[local19 + 1];
										local632 = Static182.anIntArray355[local19];
										if (local632 == 0) {
											Static182.anIntArray355[local19++] = 0;
										} else {
											Static182.anIntArray355[local19++] = (int) Math.pow((double) local632, (double) local637);
										}
										continue;
									}
									if (local45 == 4013) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										if (local632 == 0) {
											Static182.anIntArray355[local19++] = 0;
										} else if (local637 == 0) {
											Static182.anIntArray355[local19++] = Integer.MAX_VALUE;
										} else {
											Static182.anIntArray355[local19++] = (int) Math.pow((double) local632, 1.0D / (double) local637);
										}
										continue;
									}
									if (local45 == 4014) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local637 & local632;
										continue;
									}
									if (local45 == 4015) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local637 | local632;
										continue;
									}
									if (local45 == 4016) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local632 < local637 ? local632 : local637;
										continue;
									}
									if (local45 == 4017) {
										local19 -= 2;
										local632 = Static182.anIntArray355[local19];
										local637 = Static182.anIntArray355[local19 + 1];
										Static182.anIntArray355[local19++] = local632 <= local637 ? local637 : local632;
										continue;
									}
									if (local45 == 4018) {
										local19 -= 3;
										local5726 = Static182.anIntArray355[local19];
										local5733 = Static182.anIntArray355[local19 + 1];
										@Pc(6073) long local6073 = (long) Static182.anIntArray355[local19 + 2];
										Static182.anIntArray355[local19++] = (int) (local5726 * local6073 / local5733);
										continue;
									}
								} else {
									@Pc(6653) boolean local6653;
									if (local45 < 4200) {
										if (local45 == 4100) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											local19--;
											local637 = Static182.anIntArray355[local19];
											Static124.aStringArray26[local9++] = local428 + local637;
											continue;
										}
										if (local45 == 4101) {
											local9 -= 2;
											local428 = Static124.aStringArray26[local9];
											local1994 = Static124.aStringArray26[local9 + 1];
											Static124.aStringArray26[local9++] = local428 + local1994;
											continue;
										}
										if (local45 == 4102) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											local19--;
											local637 = Static182.anIntArray355[local19];
											Static124.aStringArray26[local9++] = local428 + Static256.method3955(local637);
											continue;
										}
										if (local45 == 4103) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											Static124.aStringArray26[local9++] = local428.toLowerCase();
											continue;
										}
										if (local45 == 4104) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											@Pc(6214) long local6214 = (long) local632 * 86400000L + 1014768000000L;
											Static277.aCalendar2.setTime(new Date(local6214));
											local471 = Static277.aCalendar2.get(5);
											local2648 = Static277.aCalendar2.get(2);
											local910 = Static277.aCalendar2.get(1);
											Static124.aStringArray26[local9++] = local471 + "-" + Static296.aStringArray46[local2648] + "-" + local910;
											continue;
										}
										if (local45 == 4105) {
											local9 -= 2;
											local428 = Static124.aStringArray26[local9];
											local1994 = Static124.aStringArray26[local9 + 1];
											if (Static56.aClass2_Sub4_Sub2_1.aClass167_1 != null && Static56.aClass2_Sub4_Sub2_1.aClass167_1.aBoolean332) {
												Static124.aStringArray26[local9++] = local1994;
												continue;
											}
											Static124.aStringArray26[local9++] = local428;
											continue;
										}
										if (local45 == 4106) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static124.aStringArray26[local9++] = Integer.toString(local632);
											continue;
										}
										if (local45 == 4107) {
											local9 -= 2;
											Static182.anIntArray355[local19++] = Static263.method4012(Static141.method4423(Static124.aStringArray26[local9], Static124.aStringArray26[local9 + 1], Static134.anInt3081));
											continue;
										}
										if (local45 == 4108) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											local19 -= 2;
											local637 = Static182.anIntArray355[local19];
											local875 = Static182.anIntArray355[local19 + 1];
											Static182.anIntArray355[local19++] = Static223.method3535(local875).method3516(local428, local637);
											continue;
										}
										if (local45 == 4109) {
											local19 -= 2;
											local637 = Static182.anIntArray355[local19];
											local875 = Static182.anIntArray355[local19 + 1];
											local9--;
											local428 = Static124.aStringArray26[local9];
											Static182.anIntArray355[local19++] = Static223.method3535(local875).method3501(local428, local637);
											continue;
										}
										if (local45 == 4110) {
											local9 -= 2;
											local428 = Static124.aStringArray26[local9];
											local1994 = Static124.aStringArray26[local9 + 1];
											local19--;
											if (Static182.anIntArray355[local19] == 1) {
												Static124.aStringArray26[local9++] = local428;
											} else {
												Static124.aStringArray26[local9++] = local1994;
											}
											continue;
										}
										if (local45 == 4111) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											Static124.aStringArray26[local9++] = Static45.method3520(local428);
											continue;
										}
										if (local45 == 4112) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											local19--;
											local637 = Static182.anIntArray355[local19];
											if (local637 == -1) {
												throw new RuntimeException("null char");
											}
											Static124.aStringArray26[local9++] = local428 + (char) local637;
											continue;
										}
										if (local45 == 4113) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static182.anIntArray355[local19++] = Static262.method4004((char) local632) ? 1 : 0;
											continue;
										}
										if (local45 == 4114) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static182.anIntArray355[local19++] = Static214.method3431((char) local632) ? 1 : 0;
											continue;
										}
										if (local45 == 4115) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static182.anIntArray355[local19++] = Static256.method3952((char) local632) ? 1 : 0;
											continue;
										}
										if (local45 == 4116) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static182.anIntArray355[local19++] = Static316.method4773((char) local632) ? 1 : 0;
											continue;
										}
										if (local45 == 4117) {
											local9--;
											local428 = Static124.aStringArray26[local9];
											if (local428 == null) {
												Static182.anIntArray355[local19++] = 0;
											} else {
												Static182.anIntArray355[local19++] = local428.length();
											}
											continue;
										}
										if (local45 == 4118) {
											local19 -= 2;
											local9--;
											local428 = Static124.aStringArray26[local9];
											local637 = Static182.anIntArray355[local19];
											local875 = Static182.anIntArray355[local19 + 1];
											Static124.aStringArray26[local9++] = local428.substring(local637, local875);
											continue;
										}
										if (local45 == 4119) {
											local6653 = false;
											local9--;
											local428 = Static124.aStringArray26[local9];
											@Pc(6664) StringBuffer local6664 = new StringBuffer(local428.length());
											for (local471 = 0; local428.length() > local471; local471++) {
												@Pc(6678) char local6678 = local428.charAt(local471);
												if (local6678 == '<') {
													local6653 = true;
												} else if (local6678 == '>') {
													local6653 = false;
												} else if (!local6653) {
													local6664.append(local6678);
												}
											}
											Static124.aStringArray26[local9++] = local6664.toString();
											continue;
										}
										if (local45 == 4120) {
											local19 -= 2;
											local9--;
											local428 = Static124.aStringArray26[local9];
											local637 = Static182.anIntArray355[local19];
											local875 = Static182.anIntArray355[local19 + 1];
											Static182.anIntArray355[local19++] = local428.indexOf(local637, local875);
											continue;
										}
										if (local45 == 4121) {
											local9 -= 2;
											local428 = Static124.aStringArray26[local9];
											local19--;
											local875 = Static182.anIntArray355[local19];
											local1994 = Static124.aStringArray26[local9 + 1];
											Static182.anIntArray355[local19++] = local428.indexOf(local1994, local875);
											continue;
										}
										if (local45 == 4122) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static182.anIntArray355[local19++] = Character.toLowerCase((char) local632);
											continue;
										}
										if (local45 == 4123) {
											local19--;
											local632 = Static182.anIntArray355[local19];
											Static182.anIntArray355[local19++] = Character.toUpperCase((char) local632);
											continue;
										}
										if (local45 == 4124) {
											local19--;
											local1257 = Static182.anIntArray355[local19] != 0;
											local19--;
											local637 = Static182.anIntArray355[local19];
											Static124.aStringArray26[local9++] = Static22.method476(0, Static134.anInt3081, local1257, (long) local637);
											continue;
										}
									} else {
										@Pc(7147) Class1_Sub3_Sub7 local7147;
										if (local45 < 4300) {
											if (local45 == 4200) {
												local19--;
												local632 = Static182.anIntArray355[local19];
												Static124.aStringArray26[local9++] = Static56.method1050(local632).aString102;
												continue;
											}
											@Pc(6892) Class57 local6892;
											if (local45 == 4201) {
												local19 -= 2;
												local632 = Static182.anIntArray355[local19];
												local637 = Static182.anIntArray355[local19 + 1];
												local6892 = Static56.method1050(local632);
												if (local637 >= 1 && local637 <= 5 && local6892.aStringArray17[local637 - 1] != null) {
													Static124.aStringArray26[local9++] = local6892.aStringArray17[local637 - 1];
													continue;
												}
												Static124.aStringArray26[local9++] = "";
												continue;
											}
											if (local45 == 4202) {
												local19 -= 2;
												local637 = Static182.anIntArray355[local19 + 1];
												local632 = Static182.anIntArray355[local19];
												local6892 = Static56.method1050(local632);
												if (local637 >= 1 && local637 <= 5 && local6892.aStringArray16[local637 - 1] != null) {
													Static124.aStringArray26[local9++] = local6892.aStringArray16[local637 - 1];
													continue;
												}
												Static124.aStringArray26[local9++] = "";
												continue;
											}
											if (local45 == 4203) {
												local19--;
												local632 = Static182.anIntArray355[local19];
												Static182.anIntArray355[local19++] = Static56.method1050(local632).anInt1810;
												continue;
											}
											if (local45 == 4204) {
												local19--;
												local632 = Static182.anIntArray355[local19];
												Static182.anIntArray355[local19++] = Static56.method1050(local632).anInt1824 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7044) Class57 local7044;
											if (local45 == 4205) {
												local19--;
												local632 = Static182.anIntArray355[local19];
												local7044 = Static56.method1050(local632);
												if (local7044.anInt1777 == -1 && local7044.anInt1808 >= 0) {
													Static182.anIntArray355[local19++] = local7044.anInt1808;
													continue;
												}
												Static182.anIntArray355[local19++] = local632;
												continue;
											}
											if (local45 == 4206) {
												local19--;
												local632 = Static182.anIntArray355[local19];
												local7044 = Static56.method1050(local632);
												if (local7044.anInt1777 >= 0 && local7044.anInt1808 >= 0) {
													Static182.anIntArray355[local19++] = local7044.anInt1808;
													continue;
												}
												Static182.anIntArray355[local19++] = local632;
												continue;
											}
											if (local45 == 4207) {
												local19--;
												local632 = Static182.anIntArray355[local19];
												Static182.anIntArray355[local19++] = Static56.method1050(local632).aBoolean124 ? 1 : 0;
												continue;
											}
											if (local45 == 4208) {
												local19 -= 2;
												local637 = Static182.anIntArray355[local19 + 1];
												local632 = Static182.anIntArray355[local19];
												local7147 = Static279.method4264(local637);
												if (local7147.method1794()) {
													Static124.aStringArray26[local9++] = Static56.method1050(local632).method1340(local7147.aString144, local637);
												} else {
													Static182.anIntArray355[local19++] = Static56.method1050(local632).method1325(local7147.anInt2417, local637);
												}
												continue;
											}
											if (local45 == 4210) {
												local9--;
												local428 = Static124.aStringArray26[local9];
												local19--;
												local637 = Static182.anIntArray355[local19];
												Static188.method3049(local428, local637 == 1);
												Static182.anIntArray355[local19++] = Static11.anInt310;
												continue;
											}
											if (local45 == 4211) {
												if (Static174.aShortArray95 != null && Static11.anInt310 > Static195.anInt4269) {
													Static182.anIntArray355[local19++] = Static174.aShortArray95[Static195.anInt4269++] & 0xFFFF;
													continue;
												}
												Static182.anIntArray355[local19++] = -1;
												continue;
											}
											if (local45 == 4212) {
												Static195.anInt4269 = 0;
												continue;
											}
										} else if (local45 < 4400) {
											if (local45 == 4300) {
												local19 -= 2;
												local632 = Static182.anIntArray355[local19];
												local637 = Static182.anIntArray355[local19 + 1];
												local7147 = Static279.method4264(local637);
												if (local7147.method1794()) {
													Static124.aStringArray26[local9++] = Static197.method3172(local632).method3705(local7147.aString144, local637);
												} else {
													Static182.anIntArray355[local19++] = Static197.method3172(local632).method3715(local637, local7147.anInt2417);
												}
												continue;
											}
										} else if (local45 >= 4500) {
											if (local45 >= 4600) {
												if (local45 < 5100) {
													if (local45 == 5000) {
														Static182.anIntArray355[local19++] = Static248.anInt5062;
														continue;
													}
													if (local45 == 5001) {
														local19 -= 3;
														Static248.anInt5062 = Static182.anIntArray355[local19];
														Static95.anInt2191 = Static182.anIntArray355[local19 + 1];
														Static202.anInt4405 = Static182.anIntArray355[local19 + 2];
														Static2.aClass1_Sub14_Sub1_1.method2252(36);
														Static2.aClass1_Sub14_Sub1_1.method2191(Static248.anInt5062);
														Static2.aClass1_Sub14_Sub1_1.method2191(Static95.anInt2191);
														Static2.aClass1_Sub14_Sub1_1.method2191(Static202.anInt4405);
														continue;
													}
													if (local45 == 5002) {
														local9--;
														local428 = Static124.aStringArray26[local9];
														local19 -= 2;
														local637 = Static182.anIntArray355[local19];
														local875 = Static182.anIntArray355[local19 + 1];
														Static2.aClass1_Sub14_Sub1_1.method2252(217);
														Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(local428) + 2);
														Static2.aClass1_Sub14_Sub1_1.method2188(local428);
														Static2.aClass1_Sub14_Sub1_1.method2191(local637 - 1);
														Static2.aClass1_Sub14_Sub1_1.method2191(local875);
														continue;
													}
													if (local45 == 5003) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														local1994 = null;
														if (local632 < 100) {
															local1994 = Static302.aStringArray48[local632];
														}
														if (local1994 == null) {
															local1994 = "";
														}
														Static124.aStringArray26[local9++] = local1994;
														continue;
													}
													if (local45 == 5004) {
														local637 = -1;
														local19--;
														local632 = Static182.anIntArray355[local19];
														if (local632 < 100 && Static302.aStringArray48[local632] != null) {
															local637 = Static269.anIntArray482[local632];
														}
														Static182.anIntArray355[local19++] = local637;
														continue;
													}
													if (local45 == 5005) {
														Static182.anIntArray355[local19++] = Static95.anInt2191;
														continue;
													}
													if (local45 == 5008) {
														local9--;
														local428 = Static124.aStringArray26[local9];
														if (local428.startsWith("::")) {
															Static37.method775(local428);
															continue;
														}
														if (Static77.anInt1764 == 0 && (Static50.aBoolean16 && !Static159.aBoolean228 || Static80.aBoolean125)) {
															continue;
														}
														local1994 = local428.toLowerCase();
														@Pc(12418) byte local12418 = 0;
														if (local1994.startsWith(Static61.aString80)) {
															local428 = local428.substring(Static61.aString80.length());
															local12418 = 0;
														} else if (local1994.startsWith(Static57.aString451)) {
															local12418 = 1;
															local428 = local428.substring(Static57.aString451.length());
														} else if (local1994.startsWith(Static315.aString450)) {
															local428 = local428.substring(Static315.aString450.length());
															local12418 = 2;
														} else if (local1994.startsWith(Static128.aString171)) {
															local12418 = 3;
															local428 = local428.substring(Static128.aString171.length());
														} else if (local1994.startsWith(Static43.aString58)) {
															local428 = local428.substring(Static43.aString58.length());
															local12418 = 4;
														} else if (local1994.startsWith(Static240.aString348)) {
															local428 = local428.substring(Static240.aString348.length());
															local12418 = 5;
														} else if (local1994.startsWith(Static57.aString452)) {
															local428 = local428.substring(Static57.aString452.length());
															local12418 = 6;
														} else if (local1994.startsWith(Static255.aString367)) {
															local428 = local428.substring(Static255.aString367.length());
															local12418 = 7;
														} else if (local1994.startsWith(Static278.aString448)) {
															local12418 = 8;
															local428 = local428.substring(Static278.aString448.length());
														} else if (local1994.startsWith(Static106.aString138)) {
															local428 = local428.substring(Static106.aString138.length());
															local12418 = 9;
														} else if (local1994.startsWith(Static309.aString442)) {
															local428 = local428.substring(Static309.aString442.length());
															local12418 = 10;
														} else if (local1994.startsWith(Static155.aString212)) {
															local12418 = 11;
															local428 = local428.substring(Static155.aString212.length());
														} else if (Static134.anInt3081 != 0) {
															if (local1994.startsWith(Static109.aString142)) {
																local428 = local428.substring(Static109.aString142.length());
																local12418 = 0;
															} else if (local1994.startsWith(Static301.aString342)) {
																local428 = local428.substring(Static301.aString342.length());
																local12418 = 1;
															} else if (local1994.startsWith(Static66.aString334)) {
																local428 = local428.substring(Static66.aString334.length());
																local12418 = 2;
															} else if (local1994.startsWith(Static266.aString380)) {
																local428 = local428.substring(Static266.aString380.length());
																local12418 = 3;
															} else if (local1994.startsWith(Static14.aString33)) {
																local12418 = 4;
																local428 = local428.substring(Static14.aString33.length());
															} else if (local1994.startsWith(Static78.aString101)) {
																local428 = local428.substring(Static78.aString101.length());
																local12418 = 5;
															} else if (local1994.startsWith(Static241.aString349)) {
																local12418 = 6;
																local428 = local428.substring(Static241.aString349.length());
															} else if (local1994.startsWith(Static265.aString379)) {
																local12418 = 7;
																local428 = local428.substring(Static265.aString379.length());
															} else if (local1994.startsWith(Static130.aString179)) {
																local12418 = 8;
																local428 = local428.substring(Static130.aString179.length());
															} else if (local1994.startsWith(Static119.aString162)) {
																local12418 = 9;
																local428 = local428.substring(Static119.aString162.length());
															} else if (local1994.startsWith(Static240.aString347)) {
																local12418 = 10;
																local428 = local428.substring(Static240.aString347.length());
															} else if (local1994.startsWith(Static119.aString163)) {
																local12418 = 11;
																local428 = local428.substring(Static119.aString163.length());
															}
														}
														local1994 = local428.toLowerCase();
														@Pc(12738) byte local12738 = 0;
														if (local1994.startsWith(Static14.aString34)) {
															local428 = local428.substring(Static14.aString34.length());
															local12738 = 1;
														} else if (local1994.startsWith(Static160.aString213)) {
															local12738 = 2;
															local428 = local428.substring(Static160.aString213.length());
														} else if (local1994.startsWith(Static7.aString17)) {
															local12738 = 3;
															local428 = local428.substring(Static7.aString17.length());
														} else if (local1994.startsWith(Static111.aString147)) {
															local12738 = 4;
															local428 = local428.substring(Static111.aString147.length());
														} else if (local1994.startsWith(Static205.aString297)) {
															local428 = local428.substring(Static205.aString297.length());
															local12738 = 5;
														} else if (Static134.anInt3081 != 0) {
															if (local1994.startsWith(Static61.aString79)) {
																local12738 = 1;
																local428 = local428.substring(Static61.aString79.length());
															} else if (local1994.startsWith(Static283.aString404)) {
																local428 = local428.substring(Static283.aString404.length());
																local12738 = 2;
															} else if (local1994.startsWith(Static178.aString253)) {
																local428 = local428.substring(Static178.aString253.length());
																local12738 = 3;
															} else if (local1994.startsWith(Static310.aString443)) {
																local12738 = 4;
																local428 = local428.substring(Static310.aString443.length());
															} else if (local1994.startsWith(Static117.aString317)) {
																local428 = local428.substring(Static117.aString317.length());
																local12738 = 5;
															}
														}
														Static2.aClass1_Sub14_Sub1_1.method2252(104);
														Static2.aClass1_Sub14_Sub1_1.method2191(0);
														local2648 = Static2.aClass1_Sub14_Sub1_1.anInt3000;
														Static2.aClass1_Sub14_Sub1_1.method2191(local12418);
														Static2.aClass1_Sub14_Sub1_1.method2191(local12738);
														Static121.method1969(Static2.aClass1_Sub14_Sub1_1, local428);
														Static2.aClass1_Sub14_Sub1_1.method2218(Static2.aClass1_Sub14_Sub1_1.anInt3000 - local2648);
														continue;
													}
													if (local45 == 5009) {
														local9 -= 2;
														local1994 = Static124.aStringArray26[local9 + 1];
														local428 = Static124.aStringArray26[local9];
														if (Static77.anInt1764 != 0 || (!Static50.aBoolean16 || Static159.aBoolean228) && !Static80.aBoolean125) {
															Static2.aClass1_Sub14_Sub1_1.method2252(13);
															Static2.aClass1_Sub14_Sub1_1.method2191(0);
															local875 = Static2.aClass1_Sub14_Sub1_1.anInt3000;
															Static2.aClass1_Sub14_Sub1_1.method2188(local428);
															Static121.method1969(Static2.aClass1_Sub14_Sub1_1, local1994);
															Static2.aClass1_Sub14_Sub1_1.method2218(Static2.aClass1_Sub14_Sub1_1.anInt3000 - local875);
														}
														continue;
													}
													if (local45 == 5010) {
														local1994 = null;
														local19--;
														local632 = Static182.anIntArray355[local19];
														if (local632 < 100) {
															local1994 = Static35.aStringArray5[local632];
														}
														if (local1994 == null) {
															local1994 = "";
														}
														Static124.aStringArray26[local9++] = local1994;
														continue;
													}
													if (local45 == 5011) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														local1994 = null;
														if (local632 < 100) {
															local1994 = Static5.aStringArray31[local632];
														}
														if (local1994 == null) {
															local1994 = "";
														}
														Static124.aStringArray26[local9++] = local1994;
														continue;
													}
													if (local45 == 5012) {
														local637 = -1;
														local19--;
														local632 = Static182.anIntArray355[local19];
														if (local632 < 100) {
															local637 = Static142.anIntArray302[local632];
														}
														Static182.anIntArray355[local19++] = local637;
														continue;
													}
													if (local45 == 5015) {
														if (Static56.aClass2_Sub4_Sub2_1 == null || Static56.aClass2_Sub4_Sub2_1.aString180 == null) {
															local428 = Static161.aString215;
														} else {
															local428 = Static56.aClass2_Sub4_Sub2_1.method2104(true);
														}
														Static124.aStringArray26[local9++] = local428;
														continue;
													}
													if (local45 == 5018) {
														local637 = 0;
														local19--;
														local632 = Static182.anIntArray355[local19];
														if (local632 < 100 && Static302.aStringArray48[local632] != null) {
															local637 = Static269.anIntArray482[local632];
														}
														Static182.anIntArray355[local19++] = local637;
														continue;
													}
													if (local45 == 5019) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														local1994 = null;
														if (local632 < 100) {
															local1994 = Static251.aStringArray42[local632];
														}
														if (local1994 == null) {
															local1994 = "";
														}
														Static124.aStringArray26[local9++] = local1994;
														continue;
													}
													if (local45 == 5016) {
														Static182.anIntArray355[local19++] = Static202.anInt4405;
														continue;
													}
													if (local45 == 5017) {
														Static182.anIntArray355[local19++] = Static53.anInt1200;
														continue;
													}
													if (local45 == 5050) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														Static124.aStringArray26[local9++] = Static148.method2406(local632).aString40;
														continue;
													}
													@Pc(13207) Class1_Sub3_Sub3 local13207;
													if (local45 == 5051) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														local13207 = Static148.method2406(local632);
														if (local13207.anIntArray53 == null) {
															Static182.anIntArray355[local19++] = 0;
														} else {
															Static182.anIntArray355[local19++] = local13207.anIntArray53.length;
														}
														continue;
													}
													if (local45 == 5052) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														@Pc(13246) Class1_Sub3_Sub3 local13246 = Static148.method2406(local632);
														local471 = local13246.anIntArray53[local637];
														Static182.anIntArray355[local19++] = local471;
														continue;
													}
													if (local45 == 5053) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														local13207 = Static148.method2406(local632);
														if (local13207.anIntArray52 == null) {
															Static182.anIntArray355[local19++] = 0;
														} else {
															Static182.anIntArray355[local19++] = local13207.anIntArray52.length;
														}
														continue;
													}
													if (local45 == 5054) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														Static182.anIntArray355[local19++] = Static148.method2406(local632).anIntArray52[local637];
														continue;
													}
													if (local45 == 5055) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														Static124.aStringArray26[local9++] = Static240.method3781(local632).method3304();
														continue;
													}
													if (local45 == 5056) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														@Pc(13355) Class1_Sub3_Sub17 local13355 = Static240.method3781(local632);
														if (local13355.anIntArray400 == null) {
															Static182.anIntArray355[local19++] = 0;
														} else {
															Static182.anIntArray355[local19++] = local13355.anIntArray400.length;
														}
														continue;
													}
													if (local45 == 5057) {
														local19 -= 2;
														local637 = Static182.anIntArray355[local19 + 1];
														local632 = Static182.anIntArray355[local19];
														Static182.anIntArray355[local19++] = Static240.method3781(local632).anIntArray400[local637];
														continue;
													}
													if (local45 == 5058) {
														Static144.aClass84_1 = new Class84();
														local19--;
														Static144.aClass84_1.anInt2714 = Static182.anIntArray355[local19];
														Static144.aClass84_1.aClass1_Sub3_Sub17_1 = Static240.method3781(Static144.aClass84_1.anInt2714);
														Static144.aClass84_1.anIntArray276 = new int[Static144.aClass84_1.aClass1_Sub3_Sub17_1.method3291()];
														continue;
													}
													if (local45 == 5059) {
														Static2.aClass1_Sub14_Sub1_1.method2252(40);
														Static2.aClass1_Sub14_Sub1_1.method2191(0);
														local632 = Static2.aClass1_Sub14_Sub1_1.anInt3000;
														Static2.aClass1_Sub14_Sub1_1.method2191(0);
														Static2.aClass1_Sub14_Sub1_1.method2208(Static144.aClass84_1.anInt2714);
														Static144.aClass84_1.aClass1_Sub3_Sub17_1.method3292(Static144.aClass84_1.anIntArray276, Static2.aClass1_Sub14_Sub1_1);
														Static2.aClass1_Sub14_Sub1_1.method2218(Static2.aClass1_Sub14_Sub1_1.anInt3000 - local632);
														continue;
													}
													if (local45 == 5060) {
														local9--;
														local428 = Static124.aStringArray26[local9];
														Static2.aClass1_Sub14_Sub1_1.method2252(159);
														Static2.aClass1_Sub14_Sub1_1.method2191(0);
														local637 = Static2.aClass1_Sub14_Sub1_1.anInt3000;
														Static2.aClass1_Sub14_Sub1_1.method2188(local428);
														Static2.aClass1_Sub14_Sub1_1.method2208(Static144.aClass84_1.anInt2714);
														Static144.aClass84_1.aClass1_Sub3_Sub17_1.method3292(Static144.aClass84_1.anIntArray276, Static2.aClass1_Sub14_Sub1_1);
														Static2.aClass1_Sub14_Sub1_1.method2218(Static2.aClass1_Sub14_Sub1_1.anInt3000 - local637);
														continue;
													}
													if (local45 == 5061) {
														Static2.aClass1_Sub14_Sub1_1.method2252(40);
														Static2.aClass1_Sub14_Sub1_1.method2191(0);
														local632 = Static2.aClass1_Sub14_Sub1_1.anInt3000;
														Static2.aClass1_Sub14_Sub1_1.method2191(1);
														Static2.aClass1_Sub14_Sub1_1.method2208(Static144.aClass84_1.anInt2714);
														Static144.aClass84_1.aClass1_Sub3_Sub17_1.method3292(Static144.aClass84_1.anIntArray276, Static2.aClass1_Sub14_Sub1_1);
														Static2.aClass1_Sub14_Sub1_1.method2218(Static2.aClass1_Sub14_Sub1_1.anInt3000 - local632);
														continue;
													}
													if (local45 == 5062) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														Static182.anIntArray355[local19++] = Static148.method2406(local632).aCharArray2[local637];
														continue;
													}
													if (local45 == 5063) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														Static182.anIntArray355[local19++] = Static148.method2406(local632).aCharArray3[local637];
														continue;
													}
													if (local45 == 5064) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														if (local637 == -1) {
															Static182.anIntArray355[local19++] = -1;
														} else {
															Static182.anIntArray355[local19++] = Static148.method2406(local632).method470((char) local637);
														}
														continue;
													}
													if (local45 == 5065) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														if (local637 == -1) {
															Static182.anIntArray355[local19++] = -1;
														} else {
															Static182.anIntArray355[local19++] = Static148.method2406(local632).method477((char) local637);
														}
														continue;
													}
													if (local45 == 5066) {
														local19--;
														local632 = Static182.anIntArray355[local19];
														Static182.anIntArray355[local19++] = Static240.method3781(local632).method3291();
														continue;
													}
													if (local45 == 5067) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														local875 = Static240.method3781(local632).method3300(local637);
														Static182.anIntArray355[local19++] = local875;
														continue;
													}
													if (local45 == 5068) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														Static144.aClass84_1.anIntArray276[local632] = local637;
														continue;
													}
													if (local45 == 5069) {
														local19 -= 2;
														local632 = Static182.anIntArray355[local19];
														local637 = Static182.anIntArray355[local19 + 1];
														Static144.aClass84_1.anIntArray276[local632] = local637;
														continue;
													}
													if (local45 == 5070) {
														local19 -= 3;
														local637 = Static182.anIntArray355[local19 + 1];
														local632 = Static182.anIntArray355[local19];
														local875 = Static182.anIntArray355[local19 + 2];
														@Pc(13821) Class1_Sub3_Sub17 local13821 = Static240.method3781(local632);
														if (local13821.method3300(local637) != 0) {
															throw new RuntimeException("bad command");
														}
														Static182.anIntArray355[local19++] = local13821.method3296(local637, local875);
														continue;
													}
													if (local45 == 5071) {
														local9--;
														local428 = Static124.aStringArray26[local9];
														local19--;
														local1490 = Static182.anIntArray355[local19] == 1;
														Static145.method4653(local1490, local428);
														Static182.anIntArray355[local19++] = Static11.anInt310;
														continue;
													}
													if (local45 == 5072) {
														if (Static174.aShortArray95 != null && Static11.anInt310 > Static195.anInt4269) {
															Static182.anIntArray355[local19++] = Static174.aShortArray95[Static195.anInt4269++] & 0xFFFF;
															continue;
														}
														Static182.anIntArray355[local19++] = -1;
														continue;
													}
													if (local45 == 5073) {
														Static195.anInt4269 = 0;
														continue;
													}
												} else if (local45 >= 5200) {
													@Pc(8000) boolean local8000;
													if (local45 < 5300) {
														if (local45 == 5200) {
															local19--;
															Static78.method1328(Static182.anIntArray355[local19]);
															continue;
														}
														if (local45 == 5201) {
															Static182.anIntArray355[local19++] = Static46.method923();
															continue;
														}
														if (local45 == 5205) {
															local19--;
															Static261.method3999(false, Static182.anIntArray355[local19], -1, -1);
															continue;
														}
														@Pc(11117) Class1_Sub3_Sub15 local11117;
														if (local45 == 5206) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static268.method2006(local632 >> 14 & 0x3FFF, local632 & 0x3FFF);
															if (local11117 == null) {
																Static182.anIntArray355[local19++] = -1;
															} else {
																Static182.anIntArray355[local19++] = local11117.anInt3974;
															}
															continue;
														}
														@Pc(11143) Class1_Sub3_Sub15 local11143;
														if (local45 == 5207) {
															local19--;
															local11143 = Static268.method1996(Static182.anIntArray355[local19]);
															if (local11143 != null && local11143.aString265 != null) {
																Static124.aStringArray26[local9++] = local11143.aString265;
																continue;
															}
															Static124.aStringArray26[local9++] = "";
															continue;
														}
														if (local45 == 5208) {
															Static182.anIntArray355[local19++] = Static5.anInt3330;
															Static182.anIntArray355[local19++] = Static155.anInt3473;
															continue;
														}
														if (local45 == 5209) {
															Static182.anIntArray355[local19++] = Static109.anInt2414 + Static268.anInt2655;
															Static182.anIntArray355[local19++] = Static268.anInt2656 + Static268.anInt2659 - Static299.anInt5944 - 1;
															continue;
														}
														if (local45 == 5210) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static268.method1996(local632);
															if (local11117 == null) {
																Static182.anIntArray355[local19++] = 0;
																Static182.anIntArray355[local19++] = 0;
															} else {
																Static182.anIntArray355[local19++] = local11117.anInt3969 >> 14 & 0x3FFF;
																Static182.anIntArray355[local19++] = local11117.anInt3969 & 0x3FFF;
															}
															continue;
														}
														if (local45 == 5211) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static268.method1996(local632);
															if (local11117 == null) {
																Static182.anIntArray355[local19++] = 0;
																Static182.anIntArray355[local19++] = 0;
															} else {
																Static182.anIntArray355[local19++] = local11117.anInt3967 - local11117.anInt3984;
																Static182.anIntArray355[local19++] = local11117.anInt3981 - local11117.anInt3975;
															}
															continue;
														}
														@Pc(11311) Class1_Sub3_Sub11 local11311;
														if (local45 == 5212) {
															local11311 = Static66.method3524();
															if (local11311 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = -1;
															} else {
																Static182.anIntArray355[local19++] = local11311.anInt3104;
																local637 = local11311.anInt3105 << 28 | Static268.anInt2655 + local11311.anInt3107 << 14 | Static268.anInt2656 + Static268.anInt2659 - local11311.anInt3102 - 1;
																Static182.anIntArray355[local19++] = local637;
															}
															continue;
														}
														if (local45 == 5213) {
															local11311 = Static269.method4046();
															if (local11311 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = -1;
															} else {
																Static182.anIntArray355[local19++] = local11311.anInt3104;
																local637 = Static268.anInt2659 + Static268.anInt2656 - local11311.anInt3102 - 1 | Static268.anInt2655 + local11311.anInt3107 << 14 | local11311.anInt3105 << 28;
																Static182.anIntArray355[local19++] = local637;
															}
															continue;
														}
														if (local45 == 5214) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static14.method364();
															if (local11117 != null) {
																local6653 = local11117.method2926(local632 & 0x3FFF, Static95.anIntArray213, local632 >> 14 & 0x3FFF, local632 >> 28 & 0x3);
																if (local6653) {
																	Static109.method1797(Static95.anIntArray213[1], Static95.anIntArray213[2]);
																}
															}
															continue;
														}
														if (local45 == 5215) {
															local19 -= 2;
															local637 = Static182.anIntArray355[local19 + 1];
															local8000 = false;
															local632 = Static182.anIntArray355[local19];
															@Pc(11488) Class108 local11488 = Static268.method2007(local632 >> 14 & 0x3FFF, local632 & 0x3FFF);
															for (@Pc(11493) Class1_Sub3_Sub15 local11493 = (Class1_Sub3_Sub15) local11488.method2754(); local11493 != null; local11493 = (Class1_Sub3_Sub15) local11488.method2751()) {
																if (local637 == local11493.anInt3974) {
																	local8000 = true;
																	break;
																}
															}
															if (local8000) {
																Static182.anIntArray355[local19++] = 1;
															} else {
																Static182.anIntArray355[local19++] = 0;
															}
															continue;
														}
														if (local45 == 5218) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static268.method1996(local632);
															if (local11117 == null) {
																Static182.anIntArray355[local19++] = -1;
															} else {
																Static182.anIntArray355[local19++] = local11117.anInt3985;
															}
															continue;
														}
														if (local45 == 5220) {
															Static182.anIntArray355[local19++] = Static147.anInt3288 == 100 ? 1 : 0;
															continue;
														}
														if (local45 == 5221) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															Static109.method1797(local632 >> 14 & 0x3FFF, local632 & 0x3FFF);
															continue;
														}
														if (local45 == 5222) {
															local11143 = Static14.method364();
															if (local11143 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = -1;
															} else {
																local1490 = local11143.method2927(Static95.anIntArray213, Static268.anInt2656 + Static268.anInt2659 - Static299.anInt5944 - 1, Static109.anInt2414 + Static268.anInt2655);
																if (local1490) {
																	Static182.anIntArray355[local19++] = Static95.anIntArray213[1];
																	Static182.anIntArray355[local19++] = Static95.anIntArray213[2];
																} else {
																	Static182.anIntArray355[local19++] = -1;
																	Static182.anIntArray355[local19++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5223) {
															local19 -= 2;
															local637 = Static182.anIntArray355[local19 + 1];
															local632 = Static182.anIntArray355[local19];
															Static261.method3999(false, local632, local637 & 0x3FFF, local637 >> 14 & 0x3FFF);
															continue;
														}
														if (local45 == 5224) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static14.method364();
															if (local11117 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = -1;
															} else {
																local6653 = local11117.method2926(local632 & 0x3FFF, Static95.anIntArray213, local632 >> 14 & 0x3FFF, (local632 & 0x3CF4B21F) >> 28);
																if (local6653) {
																	Static182.anIntArray355[local19++] = Static95.anIntArray213[1];
																	Static182.anIntArray355[local19++] = Static95.anIntArray213[2];
																} else {
																	Static182.anIntArray355[local19++] = -1;
																	Static182.anIntArray355[local19++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5225) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local11117 = Static14.method364();
															if (local11117 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = -1;
															} else {
																local6653 = local11117.method2927(Static95.anIntArray213, local632 & 0x3FFF, local632 >> 14 & 0x3FFF);
																if (local6653) {
																	Static182.anIntArray355[local19++] = Static95.anIntArray213[1];
																	Static182.anIntArray355[local19++] = Static95.anIntArray213[2];
																} else {
																	Static182.anIntArray355[local19++] = -1;
																	Static182.anIntArray355[local19++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5226) {
															local19--;
															Static35.method736(Static182.anIntArray355[local19]);
															continue;
														}
														if (local45 == 5227) {
															local19 -= 2;
															local632 = Static182.anIntArray355[local19];
															local637 = Static182.anIntArray355[local19 + 1];
															Static261.method3999(true, local632, local637 & 0x3FFF, local637 >> 14 & 0x3FFF);
															continue;
														}
														if (local45 == 5228) {
															local19--;
															Static230.aBoolean186 = Static182.anIntArray355[local19] == 1;
															continue;
														}
														if (local45 == 5229) {
															Static182.anIntArray355[local19++] = Static230.aBoolean186 ? 1 : 0;
															continue;
														}
														if (local45 == 5230) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															Static300.method4573(local632);
															continue;
														}
														@Pc(11957) Class1 local11957;
														if (local45 == 5231) {
															local19 -= 2;
															local632 = Static182.anIntArray355[local19];
															local1490 = Static182.anIntArray355[local19 + 1] == 1;
															if (Static31.aClass186_3 == null) {
																continue;
															}
															local11957 = Static31.aClass186_3.method4570((long) local632);
															if (local11957 != null && !local1490) {
																local11957.method4767();
																continue;
															}
															if (local11957 == null && local1490) {
																local11957 = new Class1();
																Static31.aClass186_3.method4575((long) local632, local11957);
															}
															continue;
														}
														@Pc(12010) Class1 local12010;
														if (local45 == 5232) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (Static31.aClass186_3 == null) {
																Static182.anIntArray355[local19++] = 0;
															} else {
																local12010 = Static31.aClass186_3.method4570((long) local632);
																Static182.anIntArray355[local19++] = local12010 == null ? 0 : 1;
															}
															continue;
														}
														if (local45 == 5233) {
															local19 -= 2;
															local632 = Static182.anIntArray355[local19];
															local1490 = Static182.anIntArray355[local19 + 1] == 1;
															if (Static255.aClass186_22 == null) {
																continue;
															}
															local11957 = Static255.aClass186_22.method4570((long) local632);
															if (local11957 != null && !local1490) {
																local11957.method4767();
																continue;
															}
															if (local11957 == null && local1490) {
																local11957 = new Class1();
																Static255.aClass186_22.method4575((long) local632, local11957);
															}
															continue;
														}
														if (local45 == 5234) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (Static255.aClass186_22 == null) {
																Static182.anIntArray355[local19++] = 0;
															} else {
																local12010 = Static255.aClass186_22.method4570((long) local632);
																Static182.anIntArray355[local19++] = local12010 == null ? 0 : 1;
															}
															continue;
														}
														if (local45 == 5235) {
															Static182.anIntArray355[local19++] = Static268.aClass1_Sub3_Sub15_2 == null ? -1 : Static268.aClass1_Sub3_Sub15_2.anInt3974;
															continue;
														}
													} else if (local45 < 5400) {
														if (local45 == 5300) {
															local19 -= 2;
															local632 = Static182.anIntArray355[local19];
															local637 = Static182.anIntArray355[local19 + 1];
															Static286.method4392(3, local637, local632, false);
															Static182.anIntArray355[local19++] = Static229.aFrame1 == null ? 0 : 1;
															continue;
														}
														if (local45 == 5301) {
															if (Static229.aFrame1 != null) {
																Static286.method4392(Static309.anInt6184, -1, -1, false);
															}
															continue;
														}
														if (local45 == 5302) {
															@Pc(10891) Class22[] local10891 = Static254.method3873();
															Static182.anIntArray355[local19++] = local10891.length;
															continue;
														}
														if (local45 == 5303) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															@Pc(10913) Class22[] local10913 = Static254.method3873();
															Static182.anIntArray355[local19++] = local10913[local632].anInt660;
															Static182.anIntArray355[local19++] = local10913[local632].anInt661;
															continue;
														}
														if (local45 == 5305) {
															local637 = Static139.anInt3176;
															local875 = -1;
															local632 = Static153.anInt3412;
															@Pc(10944) Class22[] local10944 = Static254.method3873();
															for (local2648 = 0; local2648 < local10944.length; local2648++) {
																@Pc(10958) Class22 local10958 = local10944[local2648];
																if (local10958.anInt660 == local632 && local637 == local10958.anInt661) {
																	local875 = local2648;
																	break;
																}
															}
															Static182.anIntArray355[local19++] = local875;
															continue;
														}
														if (local45 == 5306) {
															Static182.anIntArray355[local19++] = Static217.method3458();
															continue;
														}
														if (local45 == 5307) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0 || local632 > 2) {
																local632 = 0;
															}
															Static286.method4392(local632, -1, -1, false);
															continue;
														}
														if (local45 == 5308) {
															Static182.anIntArray355[local19++] = Static309.anInt6184;
															continue;
														}
														if (local45 == 5309) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0 || local632 > 2) {
																local632 = 0;
															}
															Static309.anInt6184 = local632;
															Static24.method510(Static142.aClass112_2);
															continue;
														}
													} else if (local45 < 5500) {
														if (local45 == 5400) {
															local9 -= 2;
															local428 = Static124.aStringArray26[local9];
															local1994 = Static124.aStringArray26[local9 + 1];
															local19--;
															local875 = Static182.anIntArray355[local19];
															Static2.aClass1_Sub14_Sub1_1.method2252(185);
															Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(local428) + Static34.method690(local1994) + 1);
															Static2.aClass1_Sub14_Sub1_1.method2188(local428);
															Static2.aClass1_Sub14_Sub1_1.method2188(local1994);
															Static2.aClass1_Sub14_Sub1_1.method2191(local875);
															continue;
														}
														if (local45 == 5401) {
															local19 -= 2;
															Static251.aShortArray94[Static182.anIntArray355[local19]] = (short) Static106.method1772(Static182.anIntArray355[local19 + 1]);
															Static20.method433();
															Static132.method2262();
															Static82.method1415();
															Static190.method3079();
															Static210.method3372();
															continue;
														}
														if (local45 == 5405) {
															local19 -= 2;
															local632 = Static182.anIntArray355[local19];
															local637 = Static182.anIntArray355[local19 + 1];
															if (local632 >= 0 && local632 < 2) {
																Static167.anIntArrayArrayArray7[local632] = new int[local637 << 1][4];
															}
															continue;
														}
														if (local45 == 5406) {
															local19 -= 7;
															local632 = Static182.anIntArray355[local19];
															local875 = Static182.anIntArray355[local19 + 2];
															local637 = Static182.anIntArray355[local19 + 1] << 1;
															local471 = Static182.anIntArray355[local19 + 3];
															local2648 = Static182.anIntArray355[local19 + 4];
															local910 = Static182.anIntArray355[local19 + 5];
															@Pc(10342) int local10342 = Static182.anIntArray355[local19 + 6];
															if (local632 >= 0 && local632 < 2 && Static167.anIntArrayArrayArray7[local632] != null && local637 >= 0 && Static167.anIntArrayArrayArray7[local632].length > local637) {
																Static167.anIntArrayArrayArray7[local632][local637] = new int[] { (local875 >> 14 & 0x3FFF) * 128, local471, (local875 & 0x3FFF) * 128, local10342 };
																Static167.anIntArrayArrayArray7[local632][local637 + 1] = new int[] { (local2648 >> 14 & 0x3FFF) * 128, local910, (local2648 & 0x3FFF) * 128 };
															}
															continue;
														}
														if (local45 == 5407) {
															local19--;
															local632 = Static167.anIntArrayArrayArray7[Static182.anIntArray355[local19]].length >> 1;
															Static182.anIntArray355[local19++] = local632;
															continue;
														}
														if (local45 == 5411) {
															if (Static229.aFrame1 != null) {
																Static286.method4392(Static309.anInt6184, -1, -1, false);
															}
															if (Static280.aFrame2 == null) {
																Static5.method2409(Static245.method3799(), false);
															} else {
																System.exit(0);
															}
															continue;
														}
														if (local45 == 5419) {
															local428 = "";
															if (Static248.aClass47_6 != null) {
																if (Static248.aClass47_6.anObject2 == null) {
																	local428 = Static199.method4759(Static248.aClass47_6.anInt1416);
																} else {
																	local428 = (String) Static248.aClass47_6.anObject2;
																}
															}
															Static124.aStringArray26[local9++] = local428;
															continue;
														}
														if (local45 == 5420) {
															Static182.anIntArray355[local19++] = Static179.anInt3942 == 3 ? 1 : 0;
															continue;
														}
														if (local45 == 5421) {
															if (Static229.aFrame1 != null) {
																Static286.method4392(Static309.anInt6184, -1, -1, false);
															}
															local19--;
															local1490 = Static182.anIntArray355[local19] == 1;
															local9--;
															local428 = Static124.aStringArray26[local9];
															@Pc(10570) String local10570 = Static245.method3799() + local428;
															if (Static280.aFrame2 != null || local1490 && Static179.anInt3942 != 3 && Static179.aString261.startsWith("win") && !Static264.aBoolean330) {
																Static205.aBoolean278 = local1490;
																Static209.aString309 = local10570;
																Static296.aClass47_7 = Static142.aClass112_2.method2882(local10570);
																continue;
															}
															Static5.method2409(local10570, local1490);
															continue;
														}
														if (local45 == 5422) {
															local19--;
															local875 = Static182.anIntArray355[local19];
															local9 -= 2;
															local1994 = Static124.aStringArray26[local9 + 1];
															local428 = Static124.aStringArray26[local9];
															if (local428.length() > 0) {
																if (Static137.aStringArray23 == null) {
																	Static137.aStringArray23 = new String[Static287.anIntArray515[Static208.anInt4489]];
																}
																Static137.aStringArray23[local875] = local428;
															}
															if (local1994.length() > 0) {
																if (Static282.aStringArray44 == null) {
																	Static282.aStringArray44 = new String[Static287.anIntArray515[Static208.anInt4489]];
																}
																Static282.aStringArray44[local875] = local1994;
															}
															continue;
														}
														if (local45 == 5423) {
															local9--;
															System.out.println(Static124.aStringArray26[local9]);
															continue;
														}
														if (local45 == 5424) {
															local19 -= 11;
															Static140.anInt3201 = Static182.anIntArray355[local19];
															Static230.anInt3031 = Static182.anIntArray355[local19 + 1];
															Static5.anInt3332 = Static182.anIntArray355[local19 + 2];
															Static71.anInt1646 = Static182.anIntArray355[local19 + 3];
															Static197.anInt4317 = Static182.anIntArray355[local19 + 4];
															Static58.anInt1265 = Static182.anIntArray355[local19 + 5];
															Static79.anInt1831 = Static182.anIntArray355[local19 + 6];
															Static146.anInt4437 = Static182.anIntArray355[local19 + 7];
															Static187.anInt4124 = Static182.anIntArray355[local19 + 8];
															Static182.anInt4014 = Static182.anIntArray355[local19 + 9];
															Static27.anInt4398 = Static182.anIntArray355[local19 + 10];
															Static277.aClass168_188.method4038(Static197.anInt4317);
															Static277.aClass168_188.method4038(Static58.anInt1265);
															Static277.aClass168_188.method4038(Static79.anInt1831);
															Static277.aClass168_188.method4038(Static146.anInt4437);
															Static277.aClass168_188.method4038(Static187.anInt4124);
															Static161.aBoolean230 = true;
															continue;
														}
														if (local45 == 5425) {
															Static186.method3010();
															Static161.aBoolean230 = false;
															continue;
														}
														if (local45 == 5426) {
															local19--;
															Static189.anInt4171 = Static182.anIntArray355[local19];
															continue;
														}
														if (local45 == 5427) {
															local19 -= 2;
															Static7.anInt211 = Static182.anIntArray355[local19];
															Static234.anInt4944 = Static182.anIntArray355[local19 + 1];
															continue;
														}
														if (local45 == 5428) {
															local19 -= 2;
															local637 = Static182.anIntArray355[local19 + 1];
															local632 = Static182.anIntArray355[local19];
															Static182.anIntArray355[local19++] = Static145.method4650(local632, local637) ? 1 : 0;
															continue;
														}
													} else if (local45 < 5600) {
														if (local45 == 5500) {
															local19 -= 4;
															local637 = Static182.anIntArray355[local19 + 1];
															local632 = Static182.anIntArray355[local19];
															local875 = Static182.anIntArray355[local19 + 2];
															local471 = Static182.anIntArray355[local19 + 3];
															Static137.method1698((local632 & 0x3FFF) - Static217.anInt4673, local471, (local632 >> 14 & 0x3FFF) - Static159.anInt3527, false, local875, local637);
															continue;
														}
														if (local45 == 5501) {
															local19 -= 4;
															local632 = Static182.anIntArray355[local19];
															local875 = Static182.anIntArray355[local19 + 2];
															local471 = Static182.anIntArray355[local19 + 3];
															local637 = Static182.anIntArray355[local19 + 1];
															Static137.method1693(local637, (local632 & 0x3FFF) - Static217.anInt4673, local471, local875, (local632 >> 14 & 0x3FFF) - Static159.anInt3527);
															continue;
														}
														if (local45 == 5502) {
															local19 -= 6;
															local632 = Static182.anIntArray355[local19];
															if (local632 >= 2) {
																throw new RuntimeException();
															}
															Static248.anInt5065 = local632;
															local637 = Static182.anIntArray355[local19 + 1];
															if (Static167.anIntArrayArrayArray7[Static248.anInt5065].length >> 1 <= local637 + 1) {
																throw new RuntimeException();
															}
															Static299.anInt5948 = local637;
															Static121.anInt2631 = 0;
															Static270.anInt5407 = Static182.anIntArray355[local19 + 2];
															Static124.anInt2703 = Static182.anIntArray355[local19 + 3];
															local875 = Static182.anIntArray355[local19 + 4];
															if (local875 >= 2) {
																throw new RuntimeException();
															}
															Static226.anInt4821 = local875;
															local471 = Static182.anIntArray355[local19 + 5];
															if (Static167.anIntArrayArrayArray7[Static226.anInt4821].length >> 1 <= local471 + 1) {
																throw new RuntimeException();
															}
															Static66.anInt4756 = local471;
															Static106.anInt2378 = 3;
															continue;
														}
														if (local45 == 5503) {
															Static226.method3586();
															continue;
														}
														if (local45 == 5504) {
															local19 -= 2;
															Static223.method3534(Static182.anIntArray355[local19 + 1], Static182.anIntArray355[local19]);
															continue;
														}
														if (local45 == 5505) {
															Static182.anIntArray355[local19++] = (int) Static27.aFloat44;
															continue;
														}
														if (local45 == 5506) {
															Static182.anIntArray355[local19++] = (int) Static62.aFloat16;
															continue;
														}
														if (local45 == 5507) {
															Static39.method801();
															continue;
														}
														if (local45 == 5508) {
															Static209.method3355();
															continue;
														}
														if (local45 == 5509) {
															Static290.method4442();
															continue;
														}
														if (local45 == 5510) {
															Static141.method4427();
															continue;
														}
														if (local45 == 5511) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local875 = local632 & 0x3FFF;
															local637 = local632 >> 14 & 0x3FFF;
															local875 -= Static217.anInt4673;
															if (local875 < 0) {
																local875 = 0;
															} else if (local875 >= 104) {
																local875 = 104;
															}
															Static23.anInt641 = local875 * 128 + 64;
															Static106.anInt2378 = 4;
															local637 -= Static159.anInt3527;
															if (local637 < 0) {
																local637 = 0;
															} else if (local637 >= 104) {
																local637 = 104;
															}
															Static109.anInt2425 = local637 * 128 + 64;
															continue;
														}
														if (local45 == 5512) {
															Static44.method877();
															continue;
														}
													} else if (local45 < 5700) {
														if (local45 == 5600) {
															local9 -= 2;
															local428 = Static124.aStringArray26[local9];
															local1994 = Static124.aStringArray26[local9 + 1];
															local19--;
															local875 = Static182.anIntArray355[local19];
															if (Static96.anInt2212 == 10 && Static31.anInt770 == 0 && Static253.anInt5118 == 0 && Static251.anInt5521 == 0 && Static202.anInt4406 == 0) {
																Static261.method3997(local875, local1994, local428);
															}
															continue;
														}
														if (local45 == 5601) {
															Static278.method4756();
															continue;
														}
														if (local45 == 5602) {
															if (Static253.anInt5118 == 0) {
																Static271.anInt5421 = -2;
															}
															continue;
														}
														if (local45 == 5603) {
															local19 -= 4;
															if (Static96.anInt2212 == 10 && Static31.anInt770 == 0 && Static253.anInt5118 == 0 && Static251.anInt5521 == 0 && Static202.anInt4406 == 0) {
																Static31.method675(Static182.anIntArray355[local19], Static182.anIntArray355[local19 + 3], Static182.anIntArray355[local19 + 1], Static182.anIntArray355[local19 + 2]);
															}
															continue;
														}
														if (local45 == 5604) {
															local9--;
															if (Static96.anInt2212 == 10 && Static31.anInt770 == 0 && Static253.anInt5118 == 0 && Static251.anInt5521 == 0 && Static202.anInt4406 == 0) {
																Static214.method3426(Static247.method3809(Static124.aStringArray26[local9]));
															}
															continue;
														}
														if (local45 == 5605) {
															local9 -= 3;
															local19 -= 7;
															if (Static96.anInt2212 == 10 && Static31.anInt770 == 0 && Static253.anInt5118 == 0 && Static251.anInt5521 == 0 && Static202.anInt4406 == 0) {
																Static175.method288(Static124.aStringArray26[local9 + 1], Static182.anIntArray355[local19 + 4] == 1, Static182.anIntArray355[local19 + 1], Static182.anIntArray355[local19 + 6] == 1, Static182.anIntArray355[local19], Static182.anIntArray355[local19 + 5] == 1, Static247.method3809(Static124.aStringArray26[local9]), Static124.aStringArray26[local9 + 2], Static182.anIntArray355[local19 + 2], Static182.anIntArray355[local19 + 3]);
															}
															continue;
														}
														if (local45 == 5606) {
															if (Static251.anInt5521 == 0) {
																Static252.anInt5113 = -2;
															}
															continue;
														}
														if (local45 == 5607) {
															Static182.anIntArray355[local19++] = Static271.anInt5421;
															continue;
														}
														if (local45 == 5608) {
															Static182.anIntArray355[local19++] = Static193.anInt4251;
															continue;
														}
														if (local45 == 5609) {
															Static182.anIntArray355[local19++] = Static252.anInt5113;
															continue;
														}
														if (local45 == 5610) {
															for (local632 = 0; local632 < 5; local632++) {
																Static124.aStringArray26[local9++] = local632 < Static147.aStringArray30.length ? Static157.method2549(Static147.aStringArray30[local632]) : "";
															}
															Static147.aStringArray30 = null;
															continue;
														}
														if (local45 == 5611) {
															Static182.anIntArray355[local19++] = Static161.anInt3536;
															continue;
														}
													} else if (local45 < 6100) {
														if (local45 == 6001) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 1) {
																local632 = 1;
															}
															if (local632 > 4) {
																local632 = 4;
															}
															Static166.anInt3743 = local632;
															if (!Static294.aBoolean367 || !aBoolean96) {
																if (Static166.anInt3743 == 1) {
																	Static237.method3738(0.9F);
																}
																if (Static166.anInt3743 == 2) {
																	Static237.method3738(0.8F);
																}
																if (Static166.anInt3743 == 3) {
																	Static237.method3738(0.7F);
																}
																if (Static166.anInt3743 == 4) {
																	Static237.method3738(0.6F);
																}
															}
															if (Static294.aBoolean367) {
																Static170.method2761();
																if (!aBoolean96) {
																	Static238.method3755();
																}
															}
															Static132.method2262();
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6002) {
															local19--;
															Static19.method426(Static182.anIntArray355[local19] == 1);
															Static124.method2038();
															Static238.method3755();
															Static254.method3876();
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6003) {
															local19--;
															Static72.aBoolean118 = Static182.anIntArray355[local19] == 1;
															Static254.method3876();
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6005) {
															local19--;
															Static293.aBoolean364 = Static182.anIntArray355[local19] == 1;
															Static238.method3755();
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6006) {
															local19--;
															Static41.aBoolean72 = Static182.anIntArray355[local19] == 1;
															((Class63_Sub1) Static237.anInterface1_1).method4612(!Static41.aBoolean72);
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6007) {
															local19--;
															Static280.aBoolean353 = Static182.anIntArray355[local19] == 1;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6008) {
															local19--;
															Static125.aBoolean164 = Static182.anIntArray355[local19] == 1;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6009) {
															local19--;
															Static282.aBoolean355 = Static182.anIntArray355[local19] == 1;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6010) {
															local19--;
															Static35.aBoolean65 = Static182.anIntArray355[local19] == 1;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6011) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0 || local632 > 2) {
																local632 = 0;
															}
															Static208.anInt4490 = local632;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6012) {
															if (Static294.aBoolean367) {
																Static1.method4721(0, 0);
															}
															local19--;
															aBoolean96 = Static182.anIntArray355[local19] == 1;
															if (Static294.aBoolean367 && aBoolean96) {
																Static237.method3738(0.7F);
															} else {
																if (Static166.anInt3743 == 1) {
																	Static237.method3738(0.9F);
																}
																if (Static166.anInt3743 == 2) {
																	Static237.method3738(0.8F);
																}
																if (Static166.anInt3743 == 3) {
																	Static237.method3738(0.7F);
																}
																if (Static166.anInt3743 == 4) {
																	Static237.method3738(0.6F);
																}
															}
															Static238.method3755();
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6014) {
															local19--;
															Static255.aBoolean321 = Static182.anIntArray355[local19] == 1;
															if (Static294.aBoolean367) {
																Static238.method3755();
															}
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6015) {
															local19--;
															Static202.aBoolean276 = Static182.anIntArray355[local19] == 1;
															if (Static294.aBoolean367) {
																Static170.method2761();
															}
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6016) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0 || local632 > 2) {
																local632 = 0;
															}
															if (Static294.aBoolean367) {
																Static272.aBoolean337 = true;
															}
															Static309.anInt6196 = local632;
															continue;
														}
														if (local45 == 6017) {
															local19--;
															Static11.aBoolean17 = Static182.anIntArray355[local19] == 1;
															Static55.method1029();
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6018) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0) {
																local632 = 0;
															}
															if (local632 > 127) {
																local632 = 127;
															}
															Static57.anInt6309 = local632;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6019) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0) {
																local632 = 0;
															}
															if (local632 > 255) {
																local632 = 255;
															}
															if (local632 != Static87.anInt2035) {
																if (Static87.anInt2035 == 0 && Static107.anInt1667 != -1) {
																	Static88.method1533(Static310.aClass168_209, Static107.anInt1667, local632);
																	Static82.aBoolean132 = false;
																} else if (local632 == 0) {
																	Static167.method2734();
																	Static82.aBoolean132 = false;
																} else {
																	Static98.method3947(local632);
																}
																Static87.anInt2035 = local632;
															}
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6020) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0) {
																local632 = 0;
															}
															if (local632 > 127) {
																local632 = 127;
															}
															Static286.anInt5742 = local632;
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															continue;
														}
														if (local45 == 6021) {
															local19--;
															Static7.aBoolean14 = Static182.anIntArray355[local19] == 1;
															Static254.method3876();
															continue;
														}
														if (local45 == 6023) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local1490 = false;
															if (local632 < 0) {
																local632 = 0;
															}
															if (local632 > 2) {
																local632 = 2;
															}
															if (Static196.anInt4274 < 96) {
																local632 = 0;
																local1490 = true;
															}
															Static42.method854(local632);
															Static24.method510(Static142.aClass112_2);
															Static123.aBoolean162 = false;
															Static182.anIntArray355[local19++] = local1490 ? 0 : 1;
															continue;
														}
														if (local45 == 6024) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (local632 < 0 || local632 > 2) {
																local632 = 0;
															}
															Static124.anInt2706 = local632;
															Static24.method510(Static142.aClass112_2);
															continue;
														}
														if (local45 == 6027) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (!Static294.aBoolean367) {
																continue;
															}
															if (local632 < 0 || local632 > 1) {
																local632 = 0;
															}
															Static41.method825(local632 == 1);
															continue;
														}
														if (local45 == 6028) {
															local19--;
															Static210.aBoolean284 = Static182.anIntArray355[local19] != 0;
															Static24.method510(Static142.aClass112_2);
															continue;
														}
													} else if (local45 < 6200) {
														if (local45 == 6101) {
															Static182.anIntArray355[local19++] = Static166.anInt3743;
															continue;
														}
														if (local45 == 6102) {
															Static182.anIntArray355[local19++] = Static241.method3782() ? 1 : 0;
															continue;
														}
														if (local45 == 6103) {
															Static182.anIntArray355[local19++] = Static72.aBoolean118 ? 1 : 0;
															continue;
														}
														if (local45 == 6105) {
															Static182.anIntArray355[local19++] = Static293.aBoolean364 ? 1 : 0;
															continue;
														}
														if (local45 == 6106) {
															Static182.anIntArray355[local19++] = Static41.aBoolean72 ? 1 : 0;
															continue;
														}
														if (local45 == 6107) {
															Static182.anIntArray355[local19++] = Static280.aBoolean353 ? 1 : 0;
															continue;
														}
														if (local45 == 6108) {
															Static182.anIntArray355[local19++] = Static125.aBoolean164 ? 1 : 0;
															continue;
														}
														if (local45 == 6109) {
															Static182.anIntArray355[local19++] = Static282.aBoolean355 ? 1 : 0;
															continue;
														}
														if (local45 == 6110) {
															Static182.anIntArray355[local19++] = Static35.aBoolean65 ? 1 : 0;
															continue;
														}
														if (local45 == 6111) {
															Static182.anIntArray355[local19++] = Static208.anInt4490;
															continue;
														}
														if (local45 == 6112) {
															Static182.anIntArray355[local19++] = aBoolean96 ? 1 : 0;
															continue;
														}
														if (local45 == 6114) {
															Static182.anIntArray355[local19++] = Static255.aBoolean321 ? 1 : 0;
															continue;
														}
														if (local45 == 6115) {
															Static182.anIntArray355[local19++] = Static202.aBoolean276 ? 1 : 0;
															continue;
														}
														if (local45 == 6116) {
															Static182.anIntArray355[local19++] = Static309.anInt6196;
															continue;
														}
														if (local45 == 6117) {
															Static182.anIntArray355[local19++] = Static11.aBoolean17 ? 1 : 0;
															continue;
														}
														if (local45 == 6118) {
															Static182.anIntArray355[local19++] = Static57.anInt6309;
															continue;
														}
														if (local45 == 6119) {
															Static182.anIntArray355[local19++] = Static87.anInt2035;
															continue;
														}
														if (local45 == 6120) {
															Static182.anIntArray355[local19++] = Static286.anInt5742;
															continue;
														}
														if (local45 == 6121) {
															if (Static294.aBoolean367) {
																Static182.anIntArray355[local19++] = Static294.aBoolean365 ? 1 : 0;
															} else {
																Static182.anIntArray355[local19++] = 0;
															}
															continue;
														}
														if (local45 == 6123) {
															Static182.anIntArray355[local19++] = Static42.method849();
															continue;
														}
														if (local45 == 6124) {
															Static182.anIntArray355[local19++] = Static124.anInt2706;
															continue;
														}
														if (local45 == 6126) {
															if (Static294.aBoolean367) {
																Static182.anIntArray355[local19++] = Static314.method4746() ? 1 : 0;
															} else {
																Static182.anIntArray355[local19++] = 0;
															}
															continue;
														}
														if (local45 == 6127) {
															Static182.anIntArray355[local19++] = Static198.aBoolean269 ? 1 : 0;
															continue;
														}
														if (local45 == 6128) {
															Static182.anIntArray355[local19++] = Static210.aBoolean284 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6300) {
														if (local45 == 6200) {
															local19 -= 2;
															Static114.aShort47 = (short) Static182.anIntArray355[local19];
															if (Static114.aShort47 <= 0) {
																Static114.aShort47 = 256;
															}
															Static10.aShort3 = (short) Static182.anIntArray355[local19 + 1];
															if (Static10.aShort3 <= 0) {
																Static10.aShort3 = 205;
															}
															continue;
														}
														if (local45 == 6201) {
															local19 -= 2;
															Static245.aShort74 = (short) Static182.anIntArray355[local19];
															if (Static245.aShort74 <= 0) {
																Static245.aShort74 = 256;
															}
															Static178.aShort61 = (short) Static182.anIntArray355[local19 + 1];
															if (Static178.aShort61 <= 0) {
																Static178.aShort61 = 320;
															}
															continue;
														}
														if (local45 == 6202) {
															local19 -= 4;
															Static150.aShort55 = (short) Static182.anIntArray355[local19];
															if (Static150.aShort55 <= 0) {
																Static150.aShort55 = 1;
															}
															Static145.aShort81 = (short) Static182.anIntArray355[local19 + 1];
															if (Static145.aShort81 <= 0) {
																Static145.aShort81 = 32767;
															} else if (Static150.aShort55 > Static145.aShort81) {
																Static145.aShort81 = Static150.aShort55;
															}
															Static202.aShort65 = (short) Static182.anIntArray355[local19 + 2];
															if (Static202.aShort65 <= 0) {
																Static202.aShort65 = 1;
															}
															Static103.aShort38 = (short) Static182.anIntArray355[local19 + 3];
															if (Static103.aShort38 <= 0) {
																Static103.aShort38 = 32767;
															} else if (Static202.aShort65 > Static103.aShort38) {
																Static103.aShort38 = Static202.aShort65;
															}
															continue;
														}
														if (local45 == 6203) {
															Static118.method1909(Static210.aClass191_10.anInt6128, 0, Static210.aClass191_10.anInt6088, false, 0);
															Static182.anIntArray355[local19++] = Static265.anInt5316;
															Static182.anIntArray355[local19++] = Static313.anInt6270;
															continue;
														}
														if (local45 == 6204) {
															Static182.anIntArray355[local19++] = Static245.aShort74;
															Static182.anIntArray355[local19++] = Static178.aShort61;
															continue;
														}
														if (local45 == 6205) {
															Static182.anIntArray355[local19++] = Static114.aShort47;
															Static182.anIntArray355[local19++] = Static10.aShort3;
															continue;
														}
													} else if (local45 < 6400) {
														if (local45 == 6300) {
															Static182.anIntArray355[local19++] = (int) (Static258.method3967() / 60000L);
															continue;
														}
														if (local45 == 6301) {
															Static182.anIntArray355[local19++] = (int) (Static258.method3967() / 86400000L) - 11745;
															continue;
														}
														if (local45 == 6302) {
															local19 -= 3;
															local875 = Static182.anIntArray355[local19 + 2];
															local637 = Static182.anIntArray355[local19 + 1];
															local632 = Static182.anIntArray355[local19];
															Static277.aCalendar2.clear();
															Static277.aCalendar2.set(11, 12);
															Static277.aCalendar2.set(local875, local637, local632);
															Static182.anIntArray355[local19++] = (int) (Static277.aCalendar2.getTime().getTime() / 86400000L) - 11745;
															continue;
														}
														if (local45 == 6303) {
															Static277.aCalendar2.clear();
															Static277.aCalendar2.setTime(new Date(Static258.method3967()));
															Static182.anIntArray355[local19++] = Static277.aCalendar2.get(1);
															continue;
														}
														if (local45 == 6304) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local1490 = true;
															if (local632 < 0) {
																local1490 = (local632 + 1) % 4 == 0;
															} else if (local632 < 1582) {
																local1490 = local632 % 4 == 0;
															} else if (local632 % 4 != 0) {
																local1490 = false;
															} else if (local632 % 100 != 0) {
																local1490 = true;
															} else if (local632 % 400 != 0) {
																local1490 = false;
															}
															Static182.anIntArray355[local19++] = local1490 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6500) {
														if (local45 == 6405) {
															Static182.anIntArray355[local19++] = Static195.method3124() ? 1 : 0;
															continue;
														}
														if (local45 == 6406) {
															Static182.anIntArray355[local19++] = Static39.method809() ? 1 : 0;
															continue;
														}
													} else if (local45 < 6600) {
														if (local45 == 6500) {
															if (Static96.anInt2212 == 10 && Static31.anInt770 == 0 && Static253.anInt5118 == 0 && Static251.anInt5521 == 0) {
																Static182.anIntArray355[local19++] = Static7.method241() == -1 ? 0 : 1;
																continue;
															}
															Static182.anIntArray355[local19++] = 1;
															continue;
														}
														@Pc(7705) Class137 local7705;
														@Pc(7648) Class80_Sub1 local7648;
														if (local45 == 6501) {
															local7648 = Static46.method922();
															if (local7648 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = 0;
																Static124.aStringArray26[local9++] = "";
																Static182.anIntArray355[local19++] = 0;
																Static124.aStringArray26[local9++] = "";
																Static182.anIntArray355[local19++] = 0;
															} else {
																Static182.anIntArray355[local19++] = local7648.anInt2583;
																Static182.anIntArray355[local19++] = local7648.anInt2569;
																Static124.aStringArray26[local9++] = local7648.aString161;
																local7705 = local7648.method1930();
																Static182.anIntArray355[local19++] = local7705.anInt4703;
																Static124.aStringArray26[local9++] = local7705.aString329;
																Static182.anIntArray355[local19++] = local7648.anInt2571;
															}
															continue;
														}
														if (local45 == 6502) {
															local7648 = Static158.method1924();
															if (local7648 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static182.anIntArray355[local19++] = 0;
																Static124.aStringArray26[local9++] = "";
																Static182.anIntArray355[local19++] = 0;
																Static124.aStringArray26[local9++] = "";
																Static182.anIntArray355[local19++] = 0;
															} else {
																Static182.anIntArray355[local19++] = local7648.anInt2583;
																Static182.anIntArray355[local19++] = local7648.anInt2569;
																Static124.aStringArray26[local9++] = local7648.aString161;
																local7705 = local7648.method1930();
																Static182.anIntArray355[local19++] = local7705.anInt4703;
																Static124.aStringArray26[local9++] = local7705.aString329;
																Static182.anIntArray355[local19++] = local7648.anInt2571;
															}
															continue;
														}
														if (local45 == 6503) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															if (Static96.anInt2212 == 10 && Static31.anInt770 == 0 && Static253.anInt5118 == 0 && Static251.anInt5521 == 0) {
																Static182.anIntArray355[local19++] = Static223.method3542(local632) ? 1 : 0;
																continue;
															}
															Static182.anIntArray355[local19++] = 0;
															continue;
														}
														if (local45 == 6504) {
															local19--;
															Static236.anInt1713 = Static182.anIntArray355[local19];
															Static24.method510(Static142.aClass112_2);
															continue;
														}
														if (local45 == 6505) {
															Static182.anIntArray355[local19++] = Static236.anInt1713;
															continue;
														}
														if (local45 == 6506) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															@Pc(7897) Class80_Sub1 local7897 = Static215.method3450(local632);
															if (local7897 == null) {
																Static182.anIntArray355[local19++] = -1;
																Static124.aStringArray26[local9++] = "";
																Static182.anIntArray355[local19++] = 0;
																Static124.aStringArray26[local9++] = "";
																Static182.anIntArray355[local19++] = 0;
															} else {
																Static182.anIntArray355[local19++] = local7897.anInt2569;
																Static124.aStringArray26[local9++] = local7897.aString161;
																@Pc(7916) Class137 local7916 = local7897.method1930();
																Static182.anIntArray355[local19++] = local7916.anInt4703;
																Static124.aStringArray26[local9++] = local7916.aString329;
																Static182.anIntArray355[local19++] = local7897.anInt2571;
															}
															continue;
														}
														if (local45 == 6507) {
															local19 -= 4;
															local632 = Static182.anIntArray355[local19];
															local1490 = Static182.anIntArray355[local19 + 1] == 1;
															local8000 = Static182.anIntArray355[local19 + 3] == 1;
															local875 = Static182.anIntArray355[local19 + 2];
															Static82.method1416(local875, local8000, local632, local1490);
															continue;
														}
													} else if (local45 < 6700) {
														if (local45 == 6600) {
															local19--;
															Static211.aBoolean285 = Static182.anIntArray355[local19] == 1;
															Static24.method510(Static142.aClass112_2);
															continue;
														}
														if (local45 == 6601) {
															Static182.anIntArray355[local19++] = Static211.aBoolean285 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6900) {
														@Pc(8075) Class107 local8075;
														if (local45 == 6800) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local8075 = Static173.method2819(local632);
															if (local8075.aString237 == null) {
																Static124.aStringArray26[local9++] = "";
															} else {
																Static124.aStringArray26[local9++] = local8075.aString237;
															}
															continue;
														}
														if (local45 == 6801) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local8075 = Static173.method2819(local632);
															Static182.anIntArray355[local19++] = local8075.anInt3781;
															continue;
														}
														if (local45 == 6802) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local8075 = Static173.method2819(local632);
															Static182.anIntArray355[local19++] = local8075.anInt3784;
															continue;
														}
														if (local45 == 6803) {
															local19--;
															local632 = Static182.anIntArray355[local19];
															local8075 = Static173.method2819(local632);
															Static182.anIntArray355[local19++] = local8075.anInt3787;
															continue;
														}
													}
												} else {
													if (local45 == 5100) {
														if (Static23.aBooleanArray3[86]) {
															Static182.anIntArray355[local19++] = 1;
														} else {
															Static182.anIntArray355[local19++] = 0;
														}
														continue;
													}
													if (local45 == 5101) {
														if (Static23.aBooleanArray3[82]) {
															Static182.anIntArray355[local19++] = 1;
														} else {
															Static182.anIntArray355[local19++] = 0;
														}
														continue;
													}
													if (local45 == 5102) {
														if (Static23.aBooleanArray3[81]) {
															Static182.anIntArray355[local19++] = 1;
														} else {
															Static182.anIntArray355[local19++] = 0;
														}
														continue;
													}
												}
											} else if (local45 == 4500) {
												local19 -= 2;
												local632 = Static182.anIntArray355[local19];
												local637 = Static182.anIntArray355[local19 + 1];
												local7147 = Static279.method4264(local637);
												if (local7147.method1794()) {
													Static124.aStringArray26[local9++] = Static269.method4039(local632).method360(local7147.aString144, local637);
												} else {
													Static182.anIntArray355[local19++] = Static269.method4039(local632).method357(local637, local7147.anInt2417);
												}
												continue;
											}
										} else if (local45 == 4400) {
											local19 -= 2;
											local632 = Static182.anIntArray355[local19];
											local637 = Static182.anIntArray355[local19 + 1];
											local7147 = Static279.method4264(local637);
											if (local7147.method1794()) {
												Static124.aStringArray26[local9++] = Static166.method2725(local632).method2331(local637, local7147.aString144);
											} else {
												Static182.anIntArray355[local19++] = Static166.method2725(local632).method2342(local637, local7147.anInt2417);
											}
											continue;
										}
									}
								}
							}
						} else {
							if (local45 >= 2000) {
								local45 -= 1000;
								local19--;
								local1003 = Static171.method2789(Static182.anIntArray355[local19]);
							} else {
								local1003 = local848 ? Static99.aClass191_6 : Static2.aClass191_1;
							}
							if (local45 == 1000) {
								local19 -= 4;
								local1003.anInt6145 = Static182.anIntArray355[local19];
								local1003.anInt6114 = Static182.anIntArray355[local19 + 1];
								local875 = Static182.anIntArray355[local19 + 3];
								local637 = Static182.anIntArray355[local19 + 2];
								if (local875 < 0) {
									local875 = 0;
								} else if (local875 > 5) {
									local875 = 5;
								}
								local1003.aByte25 = (byte) local875;
								if (local637 < 0) {
									local637 = 0;
								} else if (local637 > 5) {
									local637 = 5;
								}
								local1003.aByte28 = (byte) local637;
								Static40.method817(local1003);
								Static2.method33(local1003);
								if (local1003.anInt6165 == -1) {
									Static78.method1338(local1003.anInt6134);
								}
								continue;
							}
							if (local45 == 1001) {
								local19 -= 4;
								local1003.anInt6150 = Static182.anIntArray355[local19];
								local1003.anInt6102 = Static182.anIntArray355[local19 + 1];
								local1003.anInt6111 = 0;
								local1003.anInt6084 = 0;
								local637 = Static182.anIntArray355[local19 + 2];
								local875 = Static182.anIntArray355[local19 + 3];
								if (local637 < 0) {
									local637 = 0;
								} else if (local637 > 4) {
									local637 = 4;
								}
								local1003.aByte27 = (byte) local637;
								if (local875 < 0) {
									local875 = 0;
								} else if (local875 > 4) {
									local875 = 4;
								}
								local1003.aByte26 = (byte) local875;
								Static40.method817(local1003);
								Static2.method33(local1003);
								if (local1003.anInt6086 == 0) {
									Static99.method1655(local1003, false);
								}
								continue;
							}
							if (local45 == 1003) {
								local19--;
								local1490 = Static182.anIntArray355[local19] == 1;
								if (local1003.aBoolean399 != local1490) {
									local1003.aBoolean399 = local1490;
									Static40.method817(local1003);
								}
								if (local1003.anInt6165 == -1) {
									Static248.method3837(local1003.anInt6134);
								}
								continue;
							}
							if (local45 == 1004) {
								local19 -= 2;
								local1003.anInt6164 = Static182.anIntArray355[local19];
								local1003.anInt6158 = Static182.anIntArray355[local19 + 1];
								Static40.method817(local1003);
								Static2.method33(local1003);
								if (local1003.anInt6086 == 0) {
									Static99.method1655(local1003, false);
								}
								continue;
							}
							if (local45 == 1005) {
								local19--;
								local1003.aBoolean401 = Static182.anIntArray355[local19] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15241) Exception local15241) {
			if (arg0.aString73 == null) {
				if (Static236.anInt1712 != 0) {
					Static116.method1877("Clientscript error - check log for details");
				}
				Static66.method3525(local15241, "CS2 - scr:" + arg0.aLong247 + " op:" + local24);
			} else {
				@Pc(15249) StringBuffer local15249 = new StringBuffer(30);
				local15249.append("%0a - in: ").append(arg0.aString73);
				for (local632 = Static264.anInt5304 - 1; local632 >= 0; local632--) {
					local15249.append("%0a - via: ").append(Static240.aClass35Array1[local632].aClass1_Sub3_Sub6_1.aString73);
				}
				if (local24 == 40) {
					local632 = local29[local26];
					local15249.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local632));
				}
				if (Static236.anInt1712 != 0) {
					Static116.method1877("Clientscript error in: " + arg0.aString73);
				}
				Static66.method3525(local15241, "CS2 - scr:" + arg0.aLong247 + " op:" + local24 + local15249.toString());
			}
		}
	}
}

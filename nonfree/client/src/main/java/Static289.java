import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "Lclient!em;")
	public static final Class83 aClass83_104 = new Class83(37, -2);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!sea;)V")
	public static void method4340(@OriginalArg(1) Class308 arg0) {
		Static11.aClass308_3 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!r;B)Z")
	public static boolean method4342(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1) {
		@Pc(11) int local11 = (Static458.anInt9736 - 104) / 2;
		@Pc(17) int local17 = (Static378.anInt6747 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static271.method3983(arg0, local29, local21, local25)) {
						local40 = local29;
						if (Static34.method641(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static213.method3212(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(97) int[] local97 = new int[262144];
		for (local29 = 0; local29 < local97.length; local29++) {
			local97[local29] = -16777216;
		}
		Static513.aClass5_37 = arg1.method6842(local97, 512, 512, 512);
		Static202.method3099();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (-((int) (Math.random() * 20.0D)) - -10) << 8) + 238 - 10 | 0xFF000000;
		@Pc(168) int local168 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x2F03FF00) << 16;
		@Pc(187) int local187 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(199) boolean[][] local199 = new boolean[Static553.anInt9216 + 1 + 2][Static553.anInt9216 + 2 + 1];
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(211) int local211;
		@Pc(213) int local213;
		@Pc(219) int local219;
		@Pc(226) int local226;
		@Pc(234) int local234;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(322) int local322;
		@Pc(329) int local329;
		@Pc(333) int local333;
		@Pc(352) int local352;
		for (@Pc(201) int local201 = local11; local201 < local11 + 104; local201 += Static553.anInt9216) {
			for (local205 = local17; local205 < local17 + 104; local205 += Static553.anInt9216) {
				local209 = 0;
				local211 = 0;
				local213 = local201;
				if (local201 > 0) {
					local209 += 4;
					local213 = local201 - 1;
				}
				local219 = local205;
				if (local205 > 0) {
					local219 = local205 - 1;
				}
				local226 = Static553.anInt9216 + local201;
				if (local226 < 104) {
					local226++;
				}
				local234 = local205 + Static553.anInt9216;
				if (local234 < 104) {
					local234++;
					local211 += 4;
				}
				arg1.da(0, 0, Static553.anInt9216 * 4 + local209, Static553.anInt9216 * 4 + local211);
				arg1.ja(-16777216);
				@Pc(268) int local268;
				for (local260 = arg0; local260 <= 3; local260++) {
					for (local264 = 0; local264 <= Static553.anInt9216; local264++) {
						for (local268 = 0; local268 <= Static553.anInt9216; local268++) {
							local199[local264][local268] = Static271.method3983(arg0, local260, local213 + local264, local219 + local268);
						}
					}
					Static36.aClass129Array7[local260].method6476(local213, local219, local226, local234, local199);
					if (!Static24.aBoolean35) {
						for (local268 = -4; local268 < Static553.anInt9216; local268++) {
							for (local322 = -4; local322 < Static553.anInt9216; local322++) {
								local329 = local201 + local268;
								local333 = local205 + local322;
								if (local329 >= local11 && local17 <= local333 && Static271.method3983(arg0, local260, local329, local333)) {
									local352 = local260;
									if (Static34.method641(local329, local333)) {
										local352 = local260 - 1;
									}
									if (local352 >= 0) {
										Static420.method5962(local209 + local268 * 4, arg1, local352, local168, (Static553.anInt9216 - local322) * 4 + local211 - 4, local333, local329, local40);
									}
								}
							}
						}
					}
				}
				if (Static24.aBoolean35) {
					@Pc(406) Class240 local406 = Static590.aClass240Array1[arg0];
					for (local268 = 0; local268 < Static553.anInt9216; local268++) {
						for (local322 = 0; local322 < Static553.anInt9216; local322++) {
							local329 = local268 + local201;
							local333 = local322 + local205;
							local352 = local406.anIntArrayArray34[local329 - local406.anInt6474][local333 - local406.anInt6475];
							if ((local352 & 0x40240000) != 0) {
								arg1.method6800(-1713569622, 4, local209 + local268 * 4, 4, (Static553.anInt9216 - local322) * 4 + local211 - 4);
							} else if ((local352 & 0x800000) != 0) {
								arg1.method6806(4, (Static553.anInt9216 - local322) * 4 + local211 - 4, local209 - -(local268 * 4), -1713569622);
							} else if ((local352 & 0x2000000) != 0) {
								arg1.method6803(local268 * 4 + local209 + 3, 4, (Static553.anInt9216 - local322) * 4 + local211 - 4, -1713569622);
							} else if ((local352 & 0x8000000) != 0) {
								arg1.method6806(4, (Static553.anInt9216 - local322) * 4 + local211 + 3 - 4, local209 - -(local268 * 4), -1713569622);
							} else if ((local352 & 0x20000000) != 0) {
								arg1.method6803(local268 * 4 + local209, 4, local211 + (Static553.anInt9216 - local322) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg1.J(local209, local211, Static553.anInt9216 * 4, Static553.anInt9216 * 4, local187, 2);
				Static513.aClass5_37.da((local201 - local11) * 4 + 48, -((-local17 + local205) * 4) + 464 + -(Static553.anInt9216 * 4), Static553.anInt9216 * 4, Static553.anInt9216 * 4, local209, local211);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static506.method7088();
		Static375.anInt6734 = 0;
		Static334.aClass111_37.method2555();
		if (!Static24.aBoolean35) {
			for (local205 = local11; local205 < local11 + 104; local205++) {
				for (local209 = local17; local209 < local17 + 104; local209++) {
					for (local211 = arg0; local211 <= arg0 + 1 && local211 <= 3; local211++) {
						if (Static271.method3983(arg0, local211, local205, local209)) {
							@Pc(697) Interface15 local697 = (Interface15) Static481.method6668(local211, local205, local209);
							if (local697 == null) {
								local697 = (Interface15) Static432.method6172(local211, local205, local209, kj.class);
							}
							if (local697 == null) {
								local697 = (Interface15) Static316.method4694(local211, local205, local209);
							}
							if (local697 == null) {
								local697 = (Interface15) Static175.method2781(local211, local205, local209);
							}
							if (local697 != null) {
								@Pc(740) Class178 local740 = Static347.aClass122_4.method2770(local697.method7232());
								if (!local740.aBoolean344 || Static431.aBoolean583) {
									local226 = local740.anInt4646;
									if (local740.anIntArray252 != null) {
										for (local234 = 0; local234 < local740.anIntArray252.length; local234++) {
											if (local740.anIntArray252[local234] != -1) {
												@Pc(770) Class178 local770 = Static347.aClass122_4.method2770(local740.anIntArray252[local234]);
												if (local770.anInt4646 >= 0) {
													local226 = local770.anInt4646;
												}
											}
										}
									}
									if (local226 >= 0) {
										@Pc(786) boolean local786 = false;
										if (local226 >= 0) {
											@Pc(796) Class345 local796 = Static144.aClass113_1.method2595(local226);
											if (local796 != null && local796.aBoolean684) {
												local786 = true;
											}
										}
										local260 = local205;
										local264 = local209;
										if (local786) {
											@Pc(814) int[][] local814 = Static590.aClass240Array1[local211].anIntArrayArray34;
											local322 = Static590.aClass240Array1[local211].anInt6474;
											local329 = Static590.aClass240Array1[local211].anInt6475;
											for (local333 = 0; local333 < 10; local333++) {
												local352 = (int) (Math.random() * 4.0D);
												if (local352 == 0 && local11 < local260 && local260 > local205 - 3 && (local814[local260 - local322 - 1][local264 - local329] & 0x2C0108) == 0) {
													local260--;
												}
												if (local352 == 1 && local260 < local11 + 104 - 1 && local260 < local205 + 3 && (local814[local260 + 1 - local322][local264 - local329] & 0x2C0180) == 0) {
													local260++;
												}
												if (local352 == 2 && local17 < local264 && local209 - 3 < local264 && (local814[local260 - local322][local264 - local329 - 1] & 0x2C0102) == 0) {
													local264--;
												}
												if (local352 == 3 && local17 + 104 - 1 > local264 && local209 + 3 > local264 && (local814[local260 - local322][local264 + 1 - local329] & 0x2C0120) == 0) {
													local264++;
												}
											}
										}
										Static225.anIntArray200[Static375.anInt6734] = local740.anInt4643;
										Static483.anIntArray517[Static375.anInt6734] = local260;
										Static426.anIntArray458[Static375.anInt6734] = local264;
										Static375.anInt6734++;
									}
								}
							}
						}
					}
				}
			}
			if (Static114.aClass267_1 != null) {
				Static298.aClass308_106.anInt8167 = 1;
				Static144.aClass113_1.method2593(64, 1024);
				for (local209 = 0; local209 < Static114.aClass267_1.anInt7184; local209++) {
					local211 = Static114.aClass267_1.anIntArray424[local209];
					if (local211 >> 28 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
						local213 = (local211 >> 14 & 0x3FFF) - Static539.anInt9045;
						local219 = (local211 & 0x3FFF) - Static311.anInt5708;
						if (local213 >= 0 && Static458.anInt9736 > local213 && local219 >= 0 && local219 < Static378.anInt6747) {
							Static334.aClass111_37.method2552(new Class1_Sub27(local209));
						} else {
							@Pc(1101) Class345 local1101 = Static144.aClass113_1.method2595(Static114.aClass267_1.anIntArray425[local209]);
							if (local1101.anIntArray580 != null && local1101.anInt9200 + local213 >= 0 && Static458.anInt9736 > local1101.anInt9174 + local213 && local219 + local1101.anInt9181 >= 0 && Static378.anInt6747 > local219 + local1101.anInt9194) {
								Static334.aClass111_37.method2552(new Class1_Sub27(local209));
							}
						}
					}
				}
				Static144.aClass113_1.method2593(64, 128);
				Static298.aClass308_106.anInt8167 = 2;
				Static298.aClass308_106.method6543();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method4344(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString98 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local53.readLine();
		while (true) {
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local21 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local64;
			} else {
				local82 = local64.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local21 = local21 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local21 = local21 + local64.substring(local129 + 5, local77);
				}
			}
			local21 = local21 + ' ';
		}
	}
}

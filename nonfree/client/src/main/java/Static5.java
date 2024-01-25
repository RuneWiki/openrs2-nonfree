import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public static int anInt22;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt16 = -1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_3 = new Class55(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt18 = 0;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt20 = 0;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_4 = new Class55("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILclient!ya;)Z")
	public static boolean method21(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		@Pc(11) int local11 = (Static333.anInt3375 - 104) / 2;
		@Pc(17) int local17 = (Static102.anInt2086 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static446.method5667(local29, local25, arg0, local21)) {
						local40 = local29;
						if (Static148.method2268(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static276.method3694(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static214.aClass11_9 = arg1.method5310(local88, 512, 512, 512);
		Static217.method3062();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(167) int local167 = ((int) (Math.random() * 20.0D) + 228 | 0x3F1FFF00) << 16;
		@Pc(186) int local186 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(190) boolean[][] local190 = new boolean[Static264.anInt4481][Static264.anInt4481];
		@Pc(196) int local196;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(278) int local278;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(307) int local307;
		for (@Pc(192) int local192 = local11; local192 < local11 + 104; local192 += Static264.anInt4481) {
			for (local196 = local17; local196 < local17 + 104; local196 += Static264.anInt4481) {
				arg1.OA(0, 0, Static264.anInt4481 * 4, Static264.anInt4481 * 4);
				arg1.p(-16777216);
				for (local213 = arg0; local213 <= 3; local213++) {
					for (local217 = 0; local217 < Static264.anInt4481; local217++) {
						for (local221 = 0; local221 < Static264.anInt4481; local221++) {
							local190[local217][local221] = Static446.method5667(local213, local196 + local221, arg0, local217 + local192);
						}
					}
					Static149.aClass165Array7[local213].method3579(local192, local196, Static264.anInt4481 + local192, Static264.anInt4481 + local196, local190);
					if (!Static213.aBoolean231) {
						for (local221 = -4; local221 < Static264.anInt4481; local221++) {
							for (local278 = -4; local278 < Static264.anInt4481; local278++) {
								local284 = local192 + local221;
								local288 = local278 + local196;
								if (local284 >= local11 && local288 >= local17 && Static446.method5667(local213, local288, arg0, local284)) {
									local307 = local213;
									if (Static148.method2268(local288, local284)) {
										local307 = local213 - 1;
									}
									if (local307 >= 0) {
										Static323.method4283((Static264.anInt4481 - local278) * 4 - 4, local288, local307, local221 * 4, local284, arg1, local40, local167);
									}
								}
							}
						}
					}
				}
				if (Static213.aBoolean231) {
					@Pc(358) Class70 local358 = Static179.aClass70Array3[arg0];
					for (local221 = 0; local221 < Static264.anInt4481; local221++) {
						for (local278 = 0; local278 < Static264.anInt4481; local278++) {
							local284 = local221 + local192;
							local288 = local196 + local278;
							local307 = local358.anIntArrayArray10[local284 - local358.anInt1966][local288 - local358.anInt1971];
							if ((local307 & 0x40240000) != 0) {
								arg1.method5286(4, -1713569622, local221 * 4, 4, (Static264.anInt4481 - local278) * 4 - 4);
							} else if ((local307 & 0x800000) != 0) {
								arg1.method5313(local221 * 4, -1713569622, (Static264.anInt4481 - local278) * 4 - 4, 4);
							} else if ((local307 & 0x2000000) != 0) {
								arg1.method5324((Static264.anInt4481 - local278) * 4 - 4, 4, -1713569622, local221 * 4 + 3);
							} else if ((local307 & 0x8000000) != 0) {
								arg1.method5313(local221 * 4, -1713569622, (Static264.anInt4481 - local278) * 4 - 1, 4);
							} else if ((local307 & 0x20000000) != 0) {
								arg1.method5324((Static264.anInt4481 - local278) * 4 - 4, 4, -1713569622, local221 * 4);
							}
						}
					}
				}
				arg1.O(0, 0, Static264.anInt4481 * 4, Static264.anInt4481 * 4, local186, 2);
				Static214.aClass11_9.t((local192 - local11) * 4 + 48, -(Static264.anInt4481 * 4) + -((local196 + -local17) * 4) + 464, Static264.anInt4481 * 4, Static264.anInt4481 * 4, 0, 0);
			}
		}
		arg1.e();
		arg1.p(-16777215);
		Static193.method2788();
		Static450.anInt7435 = 0;
		Static89.aClass85_8.method2008();
		if (!Static213.aBoolean231) {
			for (local196 = local11; local196 < local11 + 104; local196++) {
				for (local213 = local17; local213 < local17 + 104; local213++) {
					for (local217 = arg0; local217 <= arg0 + 1 && local217 <= 3; local217++) {
						if (Static446.method5667(local217, local213, arg0, local196)) {
							@Pc(627) Interface5 local627 = (Interface5) Static339.method4422(local217, local196, local213);
							if (local627 == null) {
								local627 = (Interface5) Static14.method152(local217, local196, local213, gf.class);
							}
							if (local627 == null) {
								local627 = (Interface5) Static184.method2673(local217, local196, local213);
							}
							if (local627 == null) {
								local627 = (Interface5) Static178.method2592(local217, local196, local213);
							}
							if (local627 != null) {
								@Pc(668) Class189 local668 = Static411.aClass142_4.method3148(local627.method5731());
								if (!local668.aBoolean325 || Static87.aBoolean98) {
									local284 = local668.anInt5065;
									if (local668.anIntArray448 != null) {
										for (local288 = 0; local288 < local668.anIntArray448.length; local288++) {
											if (local668.anIntArray448[local288] != -1) {
												@Pc(698) Class189 local698 = Static411.aClass142_4.method3148(local668.anIntArray448[local288]);
												if (local698.anInt5065 >= 0) {
													local284 = local698.anInt5065;
												}
											}
										}
									}
									if (local284 >= 0) {
										@Pc(721) boolean local721 = false;
										if (local284 >= 0) {
											@Pc(728) Class20 local728 = Static106.aClass62_3.method1481(local284);
											if (local728 != null && local728.aBoolean10) {
												local721 = true;
											}
										}
										local307 = local196;
										@Pc(739) int local739 = local213;
										if (local721) {
											@Pc(746) int[][] local746 = Static179.aClass70Array3[local217].anIntArrayArray10;
											@Pc(751) int local751 = Static179.aClass70Array3[local217].anInt1966;
											@Pc(756) int local756 = Static179.aClass70Array3[local217].anInt1971;
											for (@Pc(758) int local758 = 0; local758 < 10; local758++) {
												@Pc(765) int local765 = (int) (Math.random() * 4.0D);
												if (local765 == 0 && local307 > local11 && local196 - 3 < local307 && (local746[local307 - local751 - 1][local739 - local756] & 0x2C0108) == 0) {
													local307--;
												}
												if (local765 == 1 && local11 + 104 - 1 > local307 && local196 + 3 > local307 && (local746[local307 + 1 - local751][local739 - local756] & 0x2C0180) == 0) {
													local307++;
												}
												if (local765 == 2 && local739 > local17 && local739 > local213 - 3 && (local746[local307 - local751][local739 - local756 - 1] & 0x2C0102) == 0) {
													local739--;
												}
												if (local765 == 3 && local17 + 103 > local739 && local739 < local213 + 3 && (local746[local307 - local751][local739 + 1 - local756] & 0x2C0120) == 0) {
													local739++;
												}
											}
										}
										Static244.anIntArray524[Static450.anInt7435] = local668.anInt5088;
										Static259.anIntArray371[Static450.anInt7435] = local307;
										Static11.anIntArray19[Static450.anInt7435] = local739;
										Static450.anInt7435++;
									}
								}
							}
						}
					}
				}
			}
			if (Static52.aClass109_1 != null) {
				Static413.aClass178_124.anInt4835 = 1;
				Static106.aClass62_3.method1484(1024, 64);
				for (local213 = 0; local213 < Static52.aClass109_1.anInt2937; local213++) {
					local217 = Static52.aClass109_1.anIntArray258[local213];
					if (local217 >> 28 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102) {
						local221 = (local217 >> 14 & 0x3FFF) - Static359.anInt5713;
						local278 = (local217 & 0x3FFF) - Static314.anInt5181;
						if (local221 >= 0 && Static333.anInt3375 > local221 && local278 >= 0 && local278 < Static102.anInt2086) {
							Static89.aClass85_8.method2011(new Class7_Sub2(local213));
						} else {
							@Pc(1025) Class20 local1025 = Static106.aClass62_3.method1481(Static52.aClass109_1.anIntArray259[local213]);
							if (local1025.anIntArray29 != null && local221 + local1025.anInt317 >= 0 && local221 + local1025.anInt302 < Static333.anInt3375 && local278 + local1025.anInt316 >= 0 && local1025.anInt310 + local278 < Static102.anInt2086) {
								Static89.aClass85_8.method2011(new Class7_Sub2(local213));
							}
						}
					}
				}
				Static106.aClass62_3.method1484(128, 64);
				Static413.aClass178_124.anInt4835 = 2;
				Static413.aClass178_124.method3814();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
	public static void method22(@OriginalArg(1) int arg0) {
		Static21.anInt321 = arg0;
		anInt16 = -1;
		anInt16 = -1;
		Static430.method5562();
	}
}

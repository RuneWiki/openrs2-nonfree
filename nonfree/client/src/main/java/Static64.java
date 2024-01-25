import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
	public static int anInt1187;

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "[Lclient!s;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
	public static int anInt1190 = -1;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "[I")
	public static final int[] anIntArray64 = new int[8];

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLclient!ha;I)Z")
	public static boolean method1137(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static491.anInt9856 - 104) / 2;
		@Pc(17) int local17 = (Static393.anInt6574 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static369.method5324(local29, arg1, local25, local21)) {
						local40 = local29;
						if (Static250.method3635(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static74.method1303(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(87) int[] local87 = new int[262144];
		for (local29 = 0; local29 < local87.length; local29++) {
			local87[local29] = -16777216;
		}
		Static402.aClass9_27 = arg0.method7444(local87, 512, 512, 512);
		Static27.method6637();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((((int) (Math.random() * 20.0D)) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D)) - 238) - 10) | 0xFF000000;
		@Pc(165) int local165 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(189) int local189 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(201) boolean[][] local201 = new boolean[Static2.anInt10014 + 1 + 2][Static2.anInt10014 + 1 + 2];
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(213) int local213;
		@Pc(215) int local215;
		@Pc(224) int local224;
		@Pc(234) int local234;
		@Pc(242) int local242;
		@Pc(270) int local270;
		@Pc(274) int local274;
		@Pc(328) int local328;
		@Pc(334) int local334;
		@Pc(339) int local339;
		@Pc(358) int local358;
		for (@Pc(203) int local203 = local11; local203 < local11 + 104; local203 += Static2.anInt10014) {
			for (local207 = local17; local207 < local17 + 104; local207 += Static2.anInt10014) {
				local211 = 0;
				local213 = 0;
				local215 = local203;
				if (local203 > 0) {
					local211 += 4;
					local215 = local203 - 1;
				}
				local224 = local207;
				if (local207 > 0) {
					local224 = local207 - 1;
				}
				local234 = Static2.anInt10014 + local203;
				if (local234 < 104) {
					local234++;
				}
				local242 = Static2.anInt10014 + local207;
				if (local242 < 104) {
					local242++;
					local213 += 4;
				}
				arg0.KA(0, 0, local211 + Static2.anInt10014 * 4, local213 - -(Static2.anInt10014 * 4));
				arg0.GA(-16777216);
				@Pc(278) int local278;
				for (local270 = arg1; local270 <= 3; local270++) {
					for (local274 = 0; local274 <= Static2.anInt10014; local274++) {
						for (local278 = 0; local278 <= Static2.anInt10014; local278++) {
							local201[local274][local278] = Static369.method5324(local270, arg1, local224 + local278, local215 - -local274);
						}
					}
					aClass12Array1[local270].method7848(local215, local224, local234, local242, local201);
					if (!Static243.aBoolean270) {
						for (local278 = -4; local278 < Static2.anInt10014; local278++) {
							for (local328 = -4; local328 < Static2.anInt10014; local328++) {
								local334 = local278 + local203;
								local339 = local207 + local328;
								if (local334 >= local11 && local339 >= local17 && Static369.method5324(local270, arg1, local339, local334)) {
									local358 = local270;
									if (Static250.method3635(local334, local339)) {
										local358 = local270 - 1;
									}
									if (local358 >= 0) {
										Static352.method5113(local278 * 4 + local211, local339, local40, (Static2.anInt10014 - local328) * 4 + local213 - 4, local165, local358, local334, arg0);
									}
								}
							}
						}
					}
				}
				if (Static243.aBoolean270) {
					@Pc(420) Class324 local420 = Static83.aClass324Array1[arg1];
					for (local278 = 0; local278 < Static2.anInt10014; local278++) {
						for (local328 = 0; local328 < Static2.anInt10014; local328++) {
							local334 = local278 + local203;
							local339 = local207 + local328;
							local358 = local420.anIntArrayArray51[local334 - local420.anInt9209][local339 - local420.anInt9227];
							if ((local358 & 0x40240000) != 0) {
								arg0.method7512(4, 4, local211 + local278 * 4, local213 + -4 + (-local328 + Static2.anInt10014) * 4, -1713569622);
							} else if ((local358 & 0x800000) != 0) {
								arg0.method7449(4, local211 + local278 * 4, local213 + (Static2.anInt10014 - local328) * 4 + -4, -1713569622);
							} else if ((local358 & 0x2000000) != 0) {
								arg0.method7432(local278 * 4 + local211 + 3, local213 + ((-local328 + Static2.anInt10014) * 4 - 4), 4, -1713569622);
							} else if ((local358 & 0x8000000) != 0) {
								arg0.method7449(4, local278 * 4 + local211, (Static2.anInt10014 - local328) * 4 + -1 + local213, -1713569622);
							} else if ((local358 & 0x20000000) != 0) {
								arg0.method7432(local211 + local278 * 4, (Static2.anInt10014 - local328) * 4 + local213 - 4, 4, -1713569622);
							}
						}
					}
				}
				arg0.aa(local211, local213, Static2.anInt10014 * 4, Static2.anInt10014 * 4, local189, 2);
				Static402.aClass9_27.method8932((local203 - local11) * 4 + 48, -((local207 - local17) * 4) + 464 + -(Static2.anInt10014 * 4), Static2.anInt10014 * 4, Static2.anInt10014 * 4, local211, local213);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static509.method7248();
		Static499.anInt8440 = 0;
		Static30.aClass362_2.method8543();
		if (!Static243.aBoolean270) {
			for (local207 = local11; local207 < local11 + 104; local207++) {
				for (local211 = local17; local211 < local17 + 104; local211++) {
					for (local213 = arg1; local213 <= arg1 + 1 && local213 <= 3; local213++) {
						if (Static369.method5324(local213, arg1, local211, local207)) {
							@Pc(701) Interface18 local701 = (Interface18) Static82.method1398(local213, local207, local211);
							if (local701 == null) {
								local701 = (Interface18) Static486.method7064(local213, local207, local211, oc.class);
							}
							if (local701 == null) {
								local701 = (Interface18) Static401.method5788(local213, local207, local211);
							}
							if (local701 == null) {
								local701 = (Interface18) Static567.method7938(local213, local207, local211);
							}
							if (local701 != null) {
								@Pc(742) Class308 local742 = Static411.aClass88_3.method2024(local701.method8469());
								if (!local742.aBoolean606 || Static618.aBoolean707) {
									local234 = local742.anInt8620;
									if (local742.anIntArray566 != null) {
										for (local242 = 0; local242 < local742.anIntArray566.length; local242++) {
											if (local742.anIntArray566[local242] != -1) {
												@Pc(771) Class308 local771 = Static411.aClass88_3.method2024(local742.anIntArray566[local242]);
												if (local771.anInt8620 >= 0) {
													local234 = local771.anInt8620;
												}
											}
										}
									}
									if (local234 >= 0) {
										@Pc(790) boolean local790 = false;
										if (local234 >= 0) {
											@Pc(800) Class318 local800 = Static252.aClass280_1.method6911(local234);
											if (local800 != null && local800.aBoolean619) {
												local790 = true;
											}
										}
										local270 = local207;
										local274 = local211;
										if (local790) {
											@Pc(818) int[][] local818 = Static83.aClass324Array1[local213].anIntArrayArray51;
											local328 = Static83.aClass324Array1[local213].anInt9209;
											local334 = Static83.aClass324Array1[local213].anInt9227;
											for (local339 = 0; local339 < 10; local339++) {
												local358 = (int) (Math.random() * 4.0D);
												if (local358 == 0 && local270 > local11 && local207 - 3 < local270 && (local818[local270 - local328 - 1][local274 - local334] & 0x2C0108) == 0) {
													local270--;
												}
												if (local358 == 1 && local11 + 104 - 1 > local270 && local270 < local207 + 3 && (local818[local270 + 1 - local328][local274 - local334] & 0x2C0180) == 0) {
													local270++;
												}
												if (local358 == 2 && local17 < local274 && local274 > local211 - 3 && (local818[local270 - local328][local274 - local334 - 1] & 0x2C0102) == 0) {
													local274--;
												}
												if (local358 == 3 && local274 < local17 + 104 - 1 && local274 < local211 + 3 && (local818[local270 - local328][local274 + 1 - local334] & 0x2C0120) == 0) {
													local274++;
												}
											}
										}
										Static115.anIntArray124[Static499.anInt8440] = local742.anInt8569;
										Static347.anIntArray709[Static499.anInt8440] = local270;
										Static627.anIntArray672[Static499.anInt8440] = local274;
										Static499.anInt8440++;
									}
								}
							}
						}
					}
				}
			}
			if (Static297.aClass17_1 != null) {
				Static307.aClass8_83.anInt268 = 1;
				Static252.aClass280_1.method6915(64, 1024);
				for (local211 = 0; local211 < Static297.aClass17_1.anInt459; local211++) {
					local213 = Static297.aClass17_1.anIntArray16[local211];
					if (local213 >> 28 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140) {
						local215 = (local213 >> 14 & 0x3FFF) - Static534.anInt8753;
						local224 = (local213 & 0x3FFF) - Static234.anInt4239;
						if (local215 >= 0 && Static491.anInt9856 > local215 && local224 >= 0 && Static393.anInt6574 > local224) {
							Static30.aClass362_2.method8536(new Class6_Sub36(local211));
						} else {
							@Pc(1109) Class318 local1109 = Static252.aClass280_1.method6911(Static297.aClass17_1.anIntArray15[local211]);
							if (local1109.anIntArray587 != null && local1109.anInt8707 + local215 >= 0 && local215 + local1109.anInt8698 < Static491.anInt9856 && local224 + local1109.anInt8724 >= 0 && Static393.anInt6574 > local224 + local1109.anInt8695) {
								Static30.aClass362_2.method8536(new Class6_Sub36(local211));
							}
						}
					}
				}
				Static252.aClass280_1.method6915(64, 128);
				Static307.aClass8_83.anInt268 = 2;
				Static307.aClass8_83.method257();
			}
		}
		return true;
	}
}

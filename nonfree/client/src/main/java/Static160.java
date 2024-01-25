import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!br;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_75 = new Class142(10, 2, 2, 0);

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[2048];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)V")
	public static void method3482(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static337.anInt5822;
		Static102.anInt2404 = 0;
		@Pc(11) int[] local11 = Static203.anIntArray384;
		@Pc(163) int local163;
		@Pc(188) int local188;
		@Pc(242) int local242;
		@Pc(314) int local314;
		@Pc(402) int local402;
		@Pc(837) int local837;
		@Pc(502) int local502;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static62.anInt1371; local13++) {
			@Pc(17) Class65 local17 = null;
			@Pc(26) Class3_Sub2_Sub1 local26;
			if (local13 < local7) {
				local26 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local11[local13]];
			} else {
				local26 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local13 - local7]];
				local17 = ((Class3_Sub2_Sub1_Sub1) local26).aClass65_1;
				if (local17.anIntArray155 != null) {
					local17 = local17.method1710(Static344.aClass108_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local26.anInt6143 >= 0 && (local26.anInt6188 == Static356.anInt6044 || Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 == local26.aByte89)) {
				Static44.method697(arg2 >> 1, local26, arg1 >> 1, local26.method4930());
				if (Static283.anIntArray135[0] >= 0) {
					if (local26.aString54 != null && (local7 <= local13 || Static176.anInt206 == 0 || Static176.anInt206 == 3 || Static176.anInt206 == 1 && Static43.method1875(((Class3_Sub2_Sub1_Sub2) local26).aString56)) && Static102.anInt2404 < Static342.anInt5852) {
						Static342.anIntArray504[Static102.anInt2404] = Static172.aClass58_5.method1340(local26.aString54) / 2;
						Static342.anIntArray503[Static102.anInt2404] = Static283.anIntArray135[0];
						Static342.anIntArray500[Static102.anInt2404] = Static283.anIntArray135[1];
						Static342.anIntArray499[Static102.anInt2404] = local26.anInt6170;
						Static342.anIntArray501[Static102.anInt2404] = local26.anInt6193;
						Static342.anIntArray502[Static102.anInt2404] = local26.anInt6151;
						Static342.aStringArray42[Static102.anInt2404] = local26.aString54;
						Static102.anInt2404++;
					}
					local163 = arg0 + Static283.anIntArray135[1];
					@Pc(227) Class17[] local227;
					@Pc(234) Class85[] local234;
					@Pc(286) Class17 local286;
					if (local26.aBoolean428 || Static131.anInt2821 >= local26.anInt6156) {
						local163 -= Math.max(Static172.aClass58_5.anInt1595, Static333.aClass17Array13[0].ma());
					} else {
						@Pc(178) byte local178 = 1;
						if (local7 <= local13) {
							local188 = local17.anInt2134;
							if (local188 == -1) {
								local188 = local26.method4925().anInt4464;
							}
						} else {
							@Pc(204) Class3_Sub2_Sub1_Sub2 local204 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local11[local13]];
							local188 = local26.method4925().anInt4464;
							if (local204.aBoolean432) {
								local178 = 2;
							}
						}
						@Pc(216) Class17[] local216 = Static333.aClass17Array13;
						if (local188 != -1) {
							local227 = (Class17[]) Static34.aClass171_4.method3941((long) local188);
							if (local227 == null) {
								local234 = Static459.method2071(Static153.aClass160_25, local188);
								if (local234 != null) {
									local227 = new Class17[local234.length];
									for (local242 = 0; local242 < local234.length; local242++) {
										local227[local242] = Static33.aClass49_1.method4435(local234[local242]);
									}
									Static34.aClass171_4.method3940((long) local188, local227);
								}
							}
							if (local227 != null && local227.length >= 2) {
								local216 = local227;
							}
						}
						if (local216.length <= local178) {
							local178 = 1;
						}
						@Pc(282) Class17 local282 = local216[0];
						local286 = local216[local178];
						local163 -= Math.max(Static172.aClass58_5.anInt1595, local282.ma());
						local242 = Static283.anIntArray135[0] + arg3 - (local282.la() >> 1);
						local314 = local282.la() * local26.anInt6174 / 255;
						if (local26.anInt6174 > 0 && local314 < 2) {
							local314 = 2;
						}
						local282.method5767(local242, local163);
						Static33.aClass49_1.fa(local242, local163, local314 + local242, local163 + local282.ma());
						local286.method5767(local242, local163);
						Static33.aClass49_1.OA(arg3, arg0, arg3 + arg2, arg1 + arg0);
					}
					local163 -= 2;
					if (!local26.aBoolean428) {
						@Pc(383) Class17 local383;
						if (Static131.anInt2821 < local26.anInt6140) {
							local383 = Static270.aClass17Array11[local26.aBoolean426 ? 2 : 0];
							@Pc(392) Class17 local392 = Static270.aClass17Array11[local26.aBoolean426 ? 3 : 1];
							if (local26 instanceof Class3_Sub2_Sub1_Sub1) {
								local402 = local17.anInt2136;
								if (local402 == -1) {
									local402 = local26.method4925().anInt4457;
								}
							} else {
								local402 = local26.method4925().anInt4457;
							}
							if (local402 != -1) {
								local227 = (Class17[]) Static450.aClass171_63.method3941((long) local402);
								if (local227 == null) {
									local234 = Static459.method2071(Static153.aClass160_25, local402);
									if (local234 != null) {
										local227 = new Class17[local234.length];
										for (local242 = 0; local242 < local234.length; local242++) {
											local227[local242] = Static33.aClass49_1.method4435(local234[local242]);
										}
										Static450.aClass171_63.method3940((long) local402, local227);
									}
								}
								if (local227 != null && local227.length == 4) {
									local383 = local227[local26.aBoolean426 ? 2 : 0];
									local392 = local227[local26.aBoolean426 ? 3 : 1];
								}
							}
							@Pc(495) int local495 = local26.anInt6140 - Static131.anInt2821;
							if (local26.anInt6142 >= local495) {
								local502 = local383.la();
							} else {
								local495 -= local26.anInt6142;
								local242 = local26.anInt6141 == 0 ? 0 : (local26.anInt6145 - local495) / local26.anInt6141 * local26.anInt6141;
								local502 = local242 * local383.la() / local26.anInt6145;
							}
							local242 = local383.ma();
							local163 -= local242;
							local314 = arg3 + Static283.anIntArray135[0] - (local383.la() >> 1);
							local383.method5767(local314, local163);
							Static33.aClass49_1.fa(local314, local163, local502 + local314, local163 - -local242);
							local392.method5767(local314, local163);
							local163 -= 2;
							Static33.aClass49_1.OA(arg3, arg0, arg2 + arg3, arg0 - -arg1);
						}
						if (local7 > local13) {
							@Pc(622) Class3_Sub2_Sub1_Sub2 local622 = (Class3_Sub2_Sub1_Sub2) local26;
							if (local622.anInt6240 != -1) {
								local163 -= 25;
								Static388.aClass17Array15[local622.anInt6240].method5767(Static283.anIntArray135[0] + arg3 - 12, local163);
								local163 -= 2;
							}
							if (local622.anInt6237 != -1) {
								local163 -= 25;
								Static246.aClass17Array9[local622.anInt6237].method5767(Static283.anIntArray135[0] + arg3 - 12, local163);
								local163 -= 2;
							}
						} else if (local17.anInt2124 >= 0 && Static246.aClass17Array9.length > local17.anInt2124) {
							local163 -= 25;
							local383 = Static246.aClass17Array9[local17.anInt2124];
							local383.method5767(Static283.anIntArray135[0] + arg3 - (local383.la() >> 1), local163);
							local163 -= 2;
						}
					}
					@Pc(670) Class237[] local670;
					@Pc(678) Class237 local678;
					if (!(local26 instanceof Class3_Sub2_Sub1_Sub2)) {
						local188 = 0;
						local670 = Static20.aClass237Array1;
						for (local402 = 0; local402 < local670.length; local402++) {
							local678 = local670[local402];
							if (local678 != null && local678.anInt6468 == 1 && local678.anInt6464 == Static173.anIntArray307[local13 - local7]) {
								local286 = Static226.aClass17Array7[local678.anInt6470];
								if (local286.ma() > local188) {
									local188 = local286.ma();
								}
								if (Static131.anInt2821 % 20 < 10) {
									local286.method5767(Static283.anIntArray135[0] + arg3 - 12, -local286.ma() + local163);
								}
							}
						}
						if (local188 > 0) {
						}
					} else if (local13 >= 0) {
						local188 = 0;
						local670 = Static20.aClass237Array1;
						for (local402 = 0; local402 < local670.length; local402++) {
							local678 = local670[local402];
							if (local678 != null && local678.anInt6468 == 10 && local678.anInt6464 == local11[local13]) {
								local286 = Static226.aClass17Array7[local678.anInt6470];
								if (local286.ma() > local188) {
									local188 = local286.ma();
								}
								local286.method5767(Static283.anIntArray135[0] + arg3 - 12, local163 + -local286.ma());
							}
						}
						if (local188 > 0) {
						}
					}
					for (local188 = 0; local188 < 4; local188++) {
						if (Static131.anInt2821 < local26.anIntArray522[local188]) {
							local837 = local26.method4930() / 2;
							Static44.method697(arg2 >> 1, local26, arg1 >> 1, local837);
							if (Static283.anIntArray135[0] > -1) {
								if (local188 == 1) {
									Static283.anIntArray135[1] -= 20;
								}
								if (local188 == 2) {
									Static283.anIntArray135[0] -= 15;
									Static283.anIntArray135[1] -= 10;
								}
								if (local188 == 3) {
									Static283.anIntArray135[0] += 15;
									Static283.anIntArray135[1] -= 10;
								}
								Static131.aClass17Array5[local26.anIntArray523[local188]].method5767(arg3 + Static283.anIntArray135[0] - 12, arg0 + Static283.anIntArray135[1] + -12);
								Static291.aClass116_3.method4821(-1, Integer.toString(local26.anIntArray521[local188]), 0, arg0 + Static283.anIntArray135[1] + 3, arg3 - (-Static283.anIntArray135[0] + 1));
							}
						}
					}
				}
			}
		}
		@Pc(968) int local968;
		for (@Pc(962) int local962 = 0; local962 < Static149.anInt3097; local962++) {
			local968 = Static283.anIntArray134[local962];
			@Pc(975) Class3_Sub2_Sub1 local975;
			if (local968 < 2048) {
				local975 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local968];
			} else {
				local975 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local968 - 2048];
			}
			local188 = Static233.anIntArray380[local962];
			@Pc(996) Class3_Sub2_Sub1 local996;
			if (local188 < 2048) {
				local996 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local188];
			} else {
				local996 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local188 - 2048];
			}
			Static5.method153(arg0, arg2, arg3, arg1, local996, --local975.anInt6153, local975);
		}
		local968 = Static172.aClass58_5.anInt1587 + Static172.aClass58_5.anInt1595 + 2;
		for (local163 = 0; local163 < Static102.anInt2404; local163++) {
			local188 = Static342.anIntArray503[local163];
			local837 = Static342.anIntArray500[local163];
			local402 = Static342.anIntArray504[local163];
			@Pc(1060) boolean local1060 = true;
			while (local1060) {
				local1060 = false;
				for (local502 = 0; local502 < local163; local502++) {
					if (local837 + 2 > -local968 + Static342.anIntArray500[local502] && local837 - local968 < Static342.anIntArray500[local502] + 2 && Static342.anIntArray503[local502] + Static342.anIntArray504[local502] > local188 + -local402 && local402 + local188 > Static342.anIntArray503[local502] + -Static342.anIntArray504[local502] && Static342.anIntArray500[local502] - local968 < local837) {
						local837 = Static342.anIntArray500[local502] - local968;
						local1060 = true;
					}
				}
			}
			Static342.anIntArray500[local163] = local837;
			@Pc(1159) String local1159 = Static342.aStringArray42[local163];
			if (Static150.anInt4211 == 0) {
				local242 = 16776960;
				if (Static342.anIntArray499[local163] < 6) {
					local242 = Static454.anIntArray637[Static342.anIntArray499[local163]];
				}
				if (Static342.anIntArray499[local163] == 6) {
					local242 = Static356.anInt6044 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static342.anIntArray499[local163] == 7) {
					local242 = Static356.anInt6044 % 20 >= 10 ? 65535 : 255;
				}
				if (Static342.anIntArray499[local163] == 8) {
					local242 = Static356.anInt6044 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static342.anIntArray499[local163] == 9) {
					local314 = 150 - Static342.anIntArray502[local163];
					if (local314 < 50) {
						local242 = local314 * 1280 + 16711680;
					} else if (local314 < 100) {
						local242 = 16384000 + 16776960 - local314 * 327680;
					} else if (local314 < 150) {
						local242 = (local314 - 100) * 5 + 65280;
					}
				}
				if (Static342.anIntArray499[local163] == 10) {
					local314 = 150 - Static342.anIntArray502[local163];
					if (local314 < 50) {
						local242 = local314 * 5 + 16711680;
					} else if (local314 < 100) {
						local242 = 16384000 + 16711935 - local314 * 327680;
					} else if (local314 < 150) {
						local242 = local314 * 327680 + 500 + 255 - local314 * 5 - 32768000;
					}
				}
				if (Static342.anIntArray499[local163] == 11) {
					local314 = 150 - Static342.anIntArray502[local163];
					if (local314 < 50) {
						local242 = 16777215 - local314 * 327685;
					} else if (local314 < 100) {
						local242 = local314 * 327685 + 65280 - 16384250;
					} else if (local314 < 150) {
						local242 = 16777215 + 32768000 - local314 * 327680;
					}
				}
				local314 = local242 | 0xFF000000;
				if (Static342.anIntArray501[local163] == 0) {
					Static114.aClass116_1.method4821(local314, local1159, -16777216, local837 + arg0, local188 + arg3);
				}
				if (Static342.anIntArray501[local163] == 1) {
					Static114.aClass116_1.method4808(arg0 + local837, arg3 - -local188, local314, local1159, Static356.anInt6044);
				}
				if (Static342.anIntArray501[local163] == 2) {
					Static114.aClass116_1.method4815(local314, Static356.anInt6044, local1159, arg3 + local188, arg0 + local837);
				}
				if (Static342.anIntArray501[local163] == 3) {
					Static114.aClass116_1.method4820(local837 + arg0, local188 + arg3, Static356.anInt6044, local314, 150 - Static342.anIntArray502[local163], local1159);
				}
				@Pc(1500) int local1500;
				if (Static342.anIntArray501[local163] == 4) {
					local1500 = (150 - Static342.anIntArray502[local163]) * (Static172.aClass58_5.method1340(local1159) + 100) / 150;
					Static33.aClass49_1.fa(local188 + arg3 - 50, arg0, arg3 + local188 + 50, arg0 + arg1);
					Static114.aClass116_1.method4814(local188 + arg3 + 50 - local1500, local1159, -16777216, arg0 + local837, local314);
					Static33.aClass49_1.OA(arg3, arg0, arg2 + arg3, arg0 - -arg1);
				}
				if (Static342.anIntArray501[local163] == 5) {
					local1500 = 150 - Static342.anIntArray502[local163];
					@Pc(1560) int local1560 = 0;
					if (local1500 < 25) {
						local1560 = local1500 - 25;
					} else if (local1500 > 125) {
						local1560 = local1500 - 125;
					}
					@Pc(1585) int local1585 = Static172.aClass58_5.anInt1595 + Static172.aClass58_5.anInt1587;
					Static33.aClass49_1.fa(arg3, local837 + arg0 - local1585 - 1, arg3 + arg2, arg0 + local837 + 5);
					Static114.aClass116_1.method4821(local314, local1159, -16777216, arg0 + local837 + local1560, arg3 + local188);
					Static33.aClass49_1.OA(arg3, arg0, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static114.aClass116_1.method4821(-256, local1159, -16777216, local837 + arg0, arg3 + local188);
			}
		}
	}
}

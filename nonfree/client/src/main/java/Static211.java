import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Lclient!lt;")
	public static Class158 aClass158_45;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	public static int anInt3670;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_58 = new Class186(77, 3);

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "[I")
	public static final int[] anIntArray316 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!qq;III)V")
	public static void method3274(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static183.anInt5902 == 0 || Static393.anInt5631 == 0) {
			return;
		}
		arg0.method3519(Static17.anInt311, Static358.anInt6025, Static183.anInt5902, Static393.anInt5631);
		arg0.method3570(Static324.anInt5293, Static375.anInt6236, Static183.anInt5902, Static393.anInt5631);
		@Pc(29) Class132 local29 = arg0.method3513();
		local29.method3981(Static413.anInt6908, Static112.anInt6361, Static30.anInt500, Static153.anInt2713, Static82.anInt1590, Static37.anInt7265);
		arg0.method3509(local29);
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(101) int[] local101;
		@Pc(133) int local133;
		@Pc(142) int local142;
		if (Static93.aClass84Array1 != null) {
			@Pc(44) int local44 = -1;
			@Pc(46) int local46 = -1;
			@Pc(49) int local49 = arg0.method3543();
			local58 = (arg1 - Static17.anInt311) * local49 / Static183.anInt5902;
			local67 = (arg2 - Static358.anInt6025) * local49 / Static393.anInt5631;
			local70 = arg0.method3478();
			local78 = local70 * (arg1 - Static17.anInt311) / Static183.anInt5902;
			local86 = (arg2 - Static358.anInt6025) * local70 / Static393.anInt5631;
			local101 = new int[] { local58, local67, local49 };
			local29.method3989(local101);
			@Pc(119) int[] local119 = new int[] { local78, local86, local70 };
			local29.method3989(local119);
			@Pc(124) float local124 = 0.0F;
			local133 = local119[0] - local101[0];
			local142 = local119[1] - local101[1];
			@Pc(151) int local151 = local119[2] - local101[2];
			while (local124 < 1.0F) {
				@Pc(164) int local164 = (int) ((float) local133 * local124 + (float) local101[0]);
				@Pc(168) int local168 = local164 >> 7;
				@Pc(179) int local179 = (int) (local124 * (float) local151 + (float) local101[2]);
				@Pc(183) int local183 = local179 >> 7;
				if (local168 > 0 && local183 > 0 && local168 < Static84.anInt1632 && local183 < Static261.anInt4480) {
					@Pc(203) int local203 = Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93;
					if (local203 < 3 && (Static179.aByteArrayArrayArray3[1][local168][local183] & 0x2) != 0) {
						local203++;
					}
					if ((float) Static93.aClass84Array1[local203].method5334(local164, local179) < (float) local101[1] + (float) local142 * local124) {
						local44 = (Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() - 1 << 6) + local164 >> 7;
						local46 = (Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() - 1 << 6) + local179 >> 7;
						break;
					}
				}
				local124 = (float) ((double) local124 + 0.01D);
			}
			if (local44 != -1 && local46 != -1) {
				if (Static274.aBoolean336 && (Static172.anInt3044 & 0x40) != 0) {
					@Pc(294) Class239 local294 = Static316.method5795(Static321.anInt5236, Static391.anInt2016);
					if (local294 == null) {
						Static12.method160();
					} else {
						Static361.method5112(" ->", 20, local46, local44, Static60.anInt1241, true, Static26.aString21, -1, 0L, false);
					}
				} else {
					if (Static323.aClass44_4 == Static193.aClass44_3) {
						Static361.method5112("", 11, local46, local44, -1, true, Static320.aClass231_92.method5138(Static382.anInt6289), -1, 0L, false);
					}
					Static361.method5112("", 13, local46, local44, Static149.anInt2680, true, Static329.aString50, -1, 0L, false);
				}
			}
		}
		@Pc(350) Class128 local350 = Static412.aClass128_10;
		for (@Pc(359) Class48_Sub6 local359 = (Class48_Sub6) local350.method2831(); local359 != null; local359 = (Class48_Sub6) local350.method2832()) {
			if (local359.anInt3646 == Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 && local359.method3256(arg2, arg1, arg0)) {
				@Pc(487) int local487;
				if (local359.aClass3_1 instanceof Class3_Sub3_Sub6_Sub1) {
					@Pc(385) Class3_Sub3_Sub6_Sub1 local385 = (Class3_Sub3_Sub6_Sub1) local359.aClass3_1;
					local58 = local385.method5512();
					if ((local58 & 0x1) == 0 && (local385.anInt6675 & 0x7F) == 0 && (local385.anInt6677 & 0x7F) == 0 || (local58 & 0x1) == 1 && (local385.anInt6675 & 0x7F) == 64 && (local385.anInt6677 & 0x7F) == 64) {
						local67 = local385.anInt6675 - (local385.method5512() - 1 << 6);
						local70 = local385.anInt6677 - (local385.method5512() - 1 << 6);
						@Pc(499) int local499;
						for (local78 = 0; local78 < Static147.anInt7038; local78++) {
							@Pc(461) Class3_Sub3_Sub6_Sub2 local461 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local78]];
							if (local461 != null && Static125.anInt2225 != local461.anInt6749 && local461.aBoolean451) {
								local487 = local461.anInt6675 - (local461.aClass17_1.anInt344 - 1 << 6);
								local499 = local461.anInt6677 - (local461.aClass17_1.anInt344 - 1 << 6);
								if (local67 <= local487 && local461.aClass17_1.anInt344 <= local385.method5512() - (local487 - local67 >> 7) && local499 >= local70 && local461.aClass17_1.anInt344 <= local385.method5512() - (local499 - local70 >> 7)) {
									Static155.method2532(local461, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 != local359.anInt3646);
									local461.anInt6749 = Static125.anInt2225;
								}
							}
						}
						local86 = Static416.anInt4773;
						local101 = Static5.anIntArray3;
						for (local499 = 0; local499 < local86; local499++) {
							@Pc(582) Class3_Sub3_Sub6_Sub1 local582 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local101[local499]];
							if (local582 != null && Static125.anInt2225 != local582.anInt6749 && local385 != local582 && local582.aBoolean451) {
								local133 = local582.anInt6675 - (local582.method5512() - 1 << 6);
								local142 = local582.anInt6677 - (local582.method5512() - 1 << 6);
								if (local67 <= local133 && local582.method5512() <= local385.method5512() - (local133 - local67 >> 7) && local142 >= local70 && local582.method5512() <= local385.method5512() - (local142 - local70 >> 7)) {
									Static26.method2139(Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 != local359.anInt3646, local582);
									local582.anInt6749 = Static125.anInt2225;
								}
							}
						}
					}
					if (Static125.anInt2225 == local385.anInt6749) {
						continue;
					}
					Static26.method2139(Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 != local359.anInt3646, local385);
					local385.anInt6749 = Static125.anInt2225;
				}
				if (local359.aClass3_1 instanceof Class3_Sub3_Sub6_Sub2) {
					@Pc(718) Class3_Sub3_Sub6_Sub2 local718 = (Class3_Sub3_Sub6_Sub2) local359.aClass3_1;
					if (local718.aClass17_1 != null) {
						if ((local718.aClass17_1.anInt344 & 0x1) == 0 && (local718.anInt6675 & 0x7F) == 0 && (local718.anInt6677 & 0x7F) == 0 || (local718.aClass17_1.anInt344 & 0x1) == 1 && (local718.anInt6675 & 0x7F) == 64 && (local718.anInt6677 & 0x7F) == 64) {
							local58 = local718.anInt6675 - (local718.aClass17_1.anInt344 - 1 << 6);
							local67 = local718.anInt6677 - (local718.aClass17_1.anInt344 - 1 << 6);
							for (local70 = 0; local70 < Static147.anInt7038; local70++) {
								@Pc(802) Class3_Sub3_Sub6_Sub2 local802 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local70]];
								if (local802 != null && local802.anInt6749 != Static125.anInt2225 && local802 != local718 && local802.aBoolean451) {
									local86 = local802.anInt6675 - (local802.aClass17_1.anInt344 - 1 << 6);
									local487 = local802.anInt6677 - (local802.aClass17_1.anInt344 - 1 << 6);
									if (local86 >= local58 && local802.aClass17_1.anInt344 <= local718.aClass17_1.anInt344 - (local86 - local58 >> 7) && local67 <= local487 && local802.aClass17_1.anInt344 <= local718.aClass17_1.anInt344 - (local487 - local67 >> 7)) {
										Static155.method2532(local802, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 != local359.anInt3646);
										local802.anInt6749 = Static125.anInt2225;
									}
								}
							}
							local78 = Static416.anInt4773;
							@Pc(908) int[] local908 = Static5.anIntArray3;
							for (local487 = 0; local487 < local78; local487++) {
								@Pc(918) Class3_Sub3_Sub6_Sub1 local918 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local908[local487]];
								if (local918 != null && local918.anInt6749 != Static125.anInt2225 && local918.aBoolean451) {
									@Pc(945) int local945 = local918.anInt6675 - (local918.method5512() - 1 << 6);
									local133 = local918.anInt6677 - (local918.method5512() - 1 << 6);
									if (local945 >= local58 && local918.method5512() <= local718.aClass17_1.anInt344 - (local945 - local58 >> 7) && local67 <= local133 && local918.method5512() <= local718.aClass17_1.anInt344 - (local133 - local67 >> 7)) {
										Static26.method2139(local359.anInt3646 != Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93, local918);
										local918.anInt6749 = Static125.anInt2225;
									}
								}
							}
						}
						if (local718.anInt6749 == Static125.anInt2225) {
							continue;
						}
						Static155.method2532(local718, local359.anInt3646 != Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93);
						local718.anInt6749 = Static125.anInt2225;
					}
				}
				if (local359.aClass3_1 instanceof Class3_Sub2_Sub1) {
					@Pc(1065) Class6_Sub12 local1065 = (Class6_Sub12) Static23.aClass137_4.method3175((long) (local359.anInt3647 | local359.anInt3644 << 14 | local359.anInt3646 << 28));
					if (local1065 != null) {
						for (@Pc(1073) Class6_Sub42 local1073 = (Class6_Sub42) local1065.aClass88_21.method1883(); local1073 != null; local1073 = (Class6_Sub42) local1065.aClass88_21.method1884()) {
							@Pc(1081) Class32 local1081 = Static354.aClass170_2.method3865(local1073.anInt6905);
							if (!Static274.aBoolean336) {
								if (local359.anInt3646 == Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93) {
									@Pc(1091) String[] local1091 = local1081.aStringArray2;
									for (local78 = 4; local78 >= 0; local78--) {
										if (local1091 != null && local1091[local78] != null) {
											@Pc(1103) byte local1103 = 0;
											local487 = Static414.anInt6928;
											if (local78 == 0) {
												local1103 = 17;
											}
											if (local78 == 1) {
												local1103 = 4;
											}
											if (local78 == 2) {
												local1103 = 9;
											}
											if (local78 == 3) {
												local1103 = 60;
											}
											if (local78 == 4) {
												local1103 = 51;
											}
											if (local78 == local1081.anInt870) {
												local487 = local1081.anInt843;
											}
											if (local1081.anInt871 == local78) {
												local487 = local1081.anInt822;
											}
											Static361.method5112("<col=ff9040>" + local1081.aString8, local1103, local359.anInt3644, local359.anInt3647, local487, true, local1091[local78], -1, (long) local1073.anInt6905, false);
										}
									}
								}
								Static361.method5112("<col=ff9040>" + local1081.aString8, 1008, local359.anInt3644, local359.anInt3647, Static134.anInt2365, true, Static85.aClass231_26.method5138(Static382.anInt6289), -1, (long) local1073.anInt6905, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 != local359.anInt3646);
							} else if (local359.anInt3646 == Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93) {
								@Pc(1252) Class255 local1252 = Static415.anInt6945 == -1 ? null : Static414.aClass258_2.method5882(Static415.anInt6945);
								if ((Static172.anInt3044 & 0x1) != 0 && (local1252 == null || local1081.method773(Static415.anInt6945, local1252.anInt7133) != local1252.anInt7133)) {
									Static361.method5112(Static263.aString38 + " -> <col=ff9040>" + local1081.aString8, 57, local359.anInt3644, local359.anInt3647, Static60.anInt1241, true, Static26.aString21, -1, (long) local1073.anInt6905, false);
								}
							}
						}
					}
				}
				if (local359.aClass3_1 instanceof Interface10) {
					@Pc(1317) Interface10 local1317 = (Interface10) local359.aClass3_1;
					@Pc(1324) Class118 local1324 = Static113.aClass127_2.method2820(local1317.method5812());
					if (local1324.anIntArray273 != null) {
						local1324 = local1324.method2718(Static71.aClass126_1);
					}
					if (local1324 != null) {
						if (!Static274.aBoolean336) {
							if (local359.anInt3646 == Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93) {
								@Pc(1417) String[] local1417 = local1324.aStringArray22;
								if (local1417 != null) {
									for (local70 = 4; local70 >= 0; local70--) {
										if (local1417[local70] != null) {
											@Pc(1429) short local1429 = 0;
											if (local70 == 0) {
												local1429 = 12;
											}
											local86 = Static414.anInt6928;
											if (local70 == 1) {
												local1429 = 49;
											}
											if (local70 == 2) {
												local1429 = 23;
											}
											if (local70 == 3) {
												local1429 = 46;
											}
											if (local1324.anInt3010 == local70) {
												local86 = local1324.anInt2986;
											}
											if (local70 == 4) {
												local1429 = 1006;
											}
											if (local70 == local1324.anInt3020) {
												local86 = local1324.anInt2995;
											}
											Static361.method5112("<col=00ffff>" + local1324.aString31, local1429, local359.anInt3644, local359.anInt3647, local86, true, local1417[local70], -1, Static173.method2747(local1317, local359.anInt3644, local359.anInt3647), false);
										}
									}
								}
							}
							Static361.method5112("<col=00ffff>" + local1324.aString31, 1009, local359.anInt3644, local359.anInt3647, Static134.anInt2365, true, Static85.aClass231_26.method5138(Static382.anInt6289), -1, (long) local1324.anInt3021, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 != local359.anInt3646);
						} else if (Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 == local359.anInt3646) {
							@Pc(1355) Class255 local1355 = Static415.anInt6945 == -1 ? null : Static414.aClass258_2.method5882(Static415.anInt6945);
							if ((Static172.anInt3044 & 0x4) != 0 && (local1355 == null || local1324.method2723(Static415.anInt6945, local1355.anInt7133) != local1355.anInt7133)) {
								Static361.method5112(Static263.aString38 + " -> <col=00ffff>" + local1324.aString31, 50, local359.anInt3644, local359.anInt3647, Static60.anInt1241, true, Static26.aString21, -1, Static173.method2747(local1317, local359.anInt3644, local359.anInt3647), false);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public static void method3281() {
		if (Static65.anInt1374 == 0) {
			return;
		}
		try {
			if (++Static254.anInt3861 > 1500) {
				if (Static103.aClass30_1 != null) {
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
				}
				if (Static229.anInt3888 >= 1) {
					Static65.anInt1374 = 0;
					Static189.anInt6579 = -5;
					return;
				}
				Static254.anInt3861 = 0;
				if (Static401.anInt6633 == Static172.anInt3043) {
					Static172.anInt3043 = Static377.anInt6697;
				} else {
					Static172.anInt3043 = Static401.anInt6633;
				}
				Static229.anInt3888++;
				Static65.anInt1374 = 1;
			}
			if (Static65.anInt1374 == 1) {
				Static215.aClass249_5 = Static165.aClass103_3.method2378(Static53.aString9, Static172.anInt3043);
				Static65.anInt1374 = 2;
			}
			@Pc(108) int local108;
			if (Static65.anInt1374 == 2) {
				if (Static215.aClass249_5.anInt6929 == 2) {
					throw new IOException();
				}
				if (Static215.aClass249_5.anInt6929 != 1) {
					return;
				}
				Static103.aClass30_1 = new Class30((Socket) Static215.aClass249_5.anObject10, Static165.aClass103_3);
				Static215.aClass249_5 = null;
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
				Static124.method3215();
				local108 = Static103.aClass30_1.method738();
				Static124.method3215();
				if (local108 != 101) {
					Static65.anInt1374 = 0;
					Static189.anInt6579 = local108;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
					return;
				}
				Static65.anInt1374 = 3;
			}
			if (Static65.anInt1374 == 3 && Static103.aClass30_1.method735() >= 2) {
				local108 = Static103.aClass30_1.method738() << 8 | Static103.aClass30_1.method738();
				Static47.method5150(local108);
				if (Static53.anInt1053 == -1) {
					Static189.anInt6579 = 6;
					Static65.anInt1374 = 0;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
				} else {
					Static65.anInt1374 = 0;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
					Static420.method5694();
				}
			}
		} catch (@Pc(181) IOException local181) {
			if (Static103.aClass30_1 != null) {
				Static103.aClass30_1.method741();
				Static103.aClass30_1 = null;
			}
			if (Static229.anInt3888 >= 1) {
				Static189.anInt6579 = -4;
				Static65.anInt1374 = 0;
			} else {
				if (Static172.anInt3043 == Static401.anInt6633) {
					Static172.anInt3043 = Static377.anInt6697;
				} else {
					Static172.anInt3043 = Static401.anInt6633;
				}
				Static254.anInt3861 = 0;
				Static65.anInt1374 = 1;
				Static229.anInt3888++;
			}
		}
	}
}

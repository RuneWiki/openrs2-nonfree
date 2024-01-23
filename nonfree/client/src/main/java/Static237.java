import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int anInt4705;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static int anInt4716;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static int[] anIntArray377 = new int[2];

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	public static volatile int anInt4723 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Z")
	public static boolean method3669() {
		if (Static76.aBoolean90) {
			try {
				return !((Boolean) Static311.method1064("showingVideoAd", Static95.aClass184_3.anApplet1));
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[Lclient!ao;IZ[BII)[I")
	public static int[] method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		@Pc(14) int local14;
		@Pc(19) int local19;
		if (!arg4) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local14 = 0; local14 < 64; local14++) {
					for (local19 = 0; local19 < 64; local19++) {
						if (arg3 + local14 > 0 && local14 + arg3 < 103 && local19 + arg6 > 0 && arg6 + local19 < 103) {
							arg2[local9].anIntArrayArray1[arg3 + local14][arg6 + local19] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(96) byte local96;
		if (arg4) {
			local96 = 1;
		} else {
			local96 = 4;
		}
		@Pc(105) Class4_Sub24 local105 = new Class4_Sub24(arg5);
		local14 = arg3 + arg1;
		local19 = arg6 + arg0;
		@Pc(129) int local129;
		for (@Pc(115) int local115 = 0; local115 < local96; local115++) {
			for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
				for (local129 = 0; local129 < 64; local129++) {
					Static133.method2173(false, local105, 0, local14 + local124, arg4, local19 + local129, 0, 0, local115, arg6 + local129, local124 - -arg3);
				}
			}
		}
		@Pc(168) boolean local168 = false;
		@Pc(170) boolean local170 = false;
		@Pc(200) int local200;
		@Pc(227) int local227;
		@Pc(245) int local245;
		@Pc(265) int local265;
		@Pc(263) int local263;
		while (local105.aByteArray47.length > local105.anInt3822) {
			local129 = local105.method3110();
			if (local129 == 128) {
				local168 = true;
				Static288.anIntArray455[0] = local105.method3085();
				Static288.anIntArray455[1] = local105.method3072();
				Static288.anIntArray455[2] = local105.method3072();
				Static288.anIntArray455[3] = local105.method3072();
				Static288.anIntArray455[4] = local105.method3085();
			} else {
				if (local129 != 129) {
					local105.anInt3822--;
					break;
				}
				for (local200 = 0; local200 < 4; local200++) {
					@Pc(209) byte local209 = local105.method3069();
					if (local209 == 0) {
						local227 = arg3;
						if (arg3 < 0) {
							local227 = 0;
						} else if (arg3 >= 104) {
							local227 = 104;
						}
						local245 = arg3 + 64;
						local265 = arg6;
						if (local245 < 0) {
							local245 = 0;
						} else if (local245 >= 104) {
							local245 = 104;
						}
						if (arg6 < 0) {
							local265 = 0;
						} else if (arg6 >= 104) {
							local265 = 104;
						}
						local263 = arg6 + 64;
						if (local263 < 0) {
							local263 = 0;
						} else if (local263 >= 104) {
							local263 = 104;
						}
						while (local227 < local245) {
							while (local263 > local265) {
								Static98.aByteArrayArrayArray6[local200][local227][local265] = 0;
								local265++;
							}
							local227++;
						}
					} else if (local209 == 1) {
						for (local227 = 0; local227 < 64; local227 += 4) {
							for (local245 = 0; local245 < 64; local245 += 4) {
								@Pc(342) byte local342 = local105.method3069();
								for (local263 = local227 + arg3; local263 < arg3 + local227 + 4; local263++) {
									for (@Pc(359) int local359 = local245 + arg6; local359 < arg6 + local245 + 4; local359++) {
										if (local263 >= 0 && local263 < 104 && local359 >= 0 && local359 < 104) {
											Static98.aByteArrayArrayArray6[local200][local263][local359] = local342;
										}
									}
								}
							}
						}
					} else if (local209 == 2 && local200 > 0) {
						local227 = arg3;
						if (arg3 < 0) {
							local227 = 0;
						} else if (arg3 >= 104) {
							local227 = 104;
						}
						local245 = arg3 + 64;
						if (local245 < 0) {
							local245 = 0;
						} else if (local245 >= 104) {
							local245 = 104;
						}
						local263 = arg6 + 64;
						local265 = arg6;
						if (arg6 < 0) {
							local265 = 0;
						} else if (arg6 >= 104) {
							local265 = 104;
						}
						if (local263 < 0) {
							local263 = 0;
						} else if (local263 >= 104) {
							local263 = 104;
						}
						while (local245 > local227) {
							while (local265 < local263) {
								Static98.aByteArrayArrayArray6[local200][local227][local265] = Static98.aByteArrayArrayArray6[local200 - 1][local227][local265];
								local265++;
							}
							local227++;
						}
					}
				}
				local170 = true;
			}
		}
		@Pc(592) int local592;
		if (Static251.aBoolean330 && !arg4) {
			@Pc(544) Class54 local544 = null;
			label283: while (true) {
				while (true) {
					while (local105.anInt3822 < local105.aByteArray47.length) {
						local200 = local105.method3110();
						if (local200 == 0) {
							local544 = new Class54(local105);
						} else if (local200 == 1) {
							local592 = local105.method3110();
							if (local592 > 0) {
								for (local227 = 0; local227 < local592; local227++) {
									@Pc(611) Class137 local611 = new Class137(local105);
									if (local611.anInt4214 == 31) {
										@Pc(624) Class124 local624 = Static76.method1289(local105.method3085());
										local611.method3400(local624.anInt3943, local624.anInt3950, local624.anInt3949, local624.anInt3948);
									}
									local611.anInt4215 += arg6 << 7;
									local611.anInt4206 += arg3 << 7;
									local265 = local611.anInt4206 >> 7;
									local263 = local611.anInt4215 >> 7;
									if (local265 >= 0 && local263 >= 0 && local265 < 104 && local263 < 104) {
										local611.aBoolean261 = (Static27.aByteArrayArrayArray2[1][local265][local263] & 0x2) != 0;
										local611.anInt4217 = Static154.anIntArrayArrayArray5[local611.anInt4211][local265][local263] - local611.anInt4217;
										Static142.method2286(local611);
									}
								}
							}
						} else if (local200 == 2) {
							if (local544 == null) {
								local544 = new Class54();
							}
							local544.method1413(local105);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local544 == null) {
						local544 = new Class54();
					}
					for (local200 = 0; local200 < 8; local200++) {
						for (local592 = 0; local592 < 8; local592++) {
							local227 = local200 + (arg3 >> 3);
							local245 = (arg6 >> 3) + local592;
							if (local227 >= 0 && local227 < 13 && local245 >= 0 && local245 < 13) {
								Static41.aClass54ArrayArray1[local227][local245] = local544;
							}
						}
					}
					break label283;
				}
			}
		}
		if (!local170) {
			for (local129 = 0; local129 < 4; local129++) {
				for (local200 = 0; local200 < 16; local200++) {
					for (local592 = 0; local592 < 16; local592++) {
						local227 = local200 + (arg3 >> 2);
						local245 = (arg6 >> 2) + local592;
						if (local227 >= 0 && local227 < 26 && local245 >= 0 && local245 < 26) {
							Static98.aByteArrayArrayArray6[local129][local227][local245] = 0;
						}
					}
				}
			}
		}
		return local168 ? Static288.anIntArray455 : null;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public static void method3672() {
		if (Static141.anInt2799 == 0 || Static141.anInt2799 == 5) {
			return;
		}
		try {
			if (++Static70.anInt1432 > 2000) {
				if (Static261.aClass91_3 != null) {
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
				}
				if (Static240.anInt2593 >= 1) {
					Static140.anInt2773 = -5;
					Static141.anInt2799 = 0;
					return;
				}
				if (Static140.anInt2772 == Static17.anInt387) {
					Static140.anInt2772 = Static9.anInt185;
				} else {
					Static140.anInt2772 = Static17.anInt387;
				}
				Static240.anInt2593++;
				Static70.anInt1432 = 0;
				Static141.anInt2799 = 1;
			}
			if (Static141.anInt2799 == 1) {
				Static21.aClass119_1 = Static95.aClass184_3.method4611(Static140.anInt2772, Static253.aString168);
				Static141.anInt2799 = 2;
			}
			if (Static141.anInt2799 == 2) {
				if (Static21.aClass119_1.anInt3695 == 2) {
					throw new IOException();
				}
				if (Static21.aClass119_1.anInt3695 != 1) {
					return;
				}
				Static261.aClass91_3 = new Class91((Socket) Static21.aClass119_1.anObject4, Static95.aClass184_3);
				Static21.aClass119_1 = null;
				@Pc(112) long local112 = Static115.aLong88 = Static193.method3171(Static157.aString16);
				Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
				@Pc(122) int local122 = (int) (local112 >> 16 & 0x1FL);
				Static175.aClass4_Sub24_Sub1_1.method3116(14);
				Static175.aClass4_Sub24_Sub1_1.method3116(local122);
				Static261.aClass91_3.method2303(2, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				@Pc(152) int local152 = Static261.aClass91_3.method2305();
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				if (local152 != 0) {
					Static140.anInt2773 = local152;
					Static141.anInt2799 = 0;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					return;
				}
				Static141.anInt2799 = 3;
			}
			@Pc(559) int local559;
			if (Static141.anInt2799 == 3) {
				if (Static261.aClass91_3.method2300() < 8) {
					return;
				}
				Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, 8);
				@Pc(197) int[] local197 = new int[4];
				Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
				Static149.aLong109 = Static256.aClass4_Sub24_Sub1_3.method3113();
				local197[3] = (int) Static149.aLong109;
				Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
				local197[0] = (int) (Math.random() * 9.9999999E7D);
				local197[1] = (int) (Math.random() * 9.9999999E7D);
				local197[2] = (int) (Static149.aLong109 >> 32);
				Static175.aClass4_Sub24_Sub1_1.method3116(10);
				Static175.aClass4_Sub24_Sub1_1.method3066(local197[0]);
				Static175.aClass4_Sub24_Sub1_1.method3066(local197[1]);
				Static175.aClass4_Sub24_Sub1_1.method3066(local197[2]);
				Static175.aClass4_Sub24_Sub1_1.method3066(local197[3]);
				Static175.aClass4_Sub24_Sub1_1.method3079(Static193.method3171(Static157.aString16));
				Static175.aClass4_Sub24_Sub1_1.method3095(Static256.aString170);
				Static175.aClass4_Sub24_Sub1_1.method3076(Static8.aBigInteger1, Static154.aBigInteger2);
				Static200.aClass4_Sub24_Sub1_2.anInt3822 = 0;
				if (Static204.anInt4047 == 40) {
					Static200.aClass4_Sub24_Sub1_2.method3116(18);
				} else {
					Static200.aClass4_Sub24_Sub1_2.method3116(16);
				}
				Static200.aClass4_Sub24_Sub1_2.method3105(Static175.aClass4_Sub24_Sub1_1.anInt3822 + Static247.method3791(Static147.aString99) + 163);
				Static200.aClass4_Sub24_Sub1_2.method3066(546);
				Static200.aClass4_Sub24_Sub1_2.method3116(Static221.anInt4249);
				Static200.aClass4_Sub24_Sub1_2.method3116(Static230.aBoolean290 ? 1 : 0);
				Static200.aClass4_Sub24_Sub1_2.method3116(1);
				Static200.aClass4_Sub24_Sub1_2.method3116(Static284.method4440());
				Static200.aClass4_Sub24_Sub1_2.method3105(Static189.anInt5672);
				Static200.aClass4_Sub24_Sub1_2.method3105(Static292.anInt5674);
				Static200.aClass4_Sub24_Sub1_2.method3116(Static174.anInt3538);
				Static27.method580(Static200.aClass4_Sub24_Sub1_2);
				Static200.aClass4_Sub24_Sub1_2.method3095(Static147.aString99);
				Static200.aClass4_Sub24_Sub1_2.method3066(Static212.anInt4120);
				Static200.aClass4_Sub24_Sub1_2.method3066(Static238.method3146());
				Static136.aBoolean173 = true;
				Static200.aClass4_Sub24_Sub1_2.method3105(Static188.anInt5752);
				Static200.aClass4_Sub24_Sub1_2.method3066(Static75.aClass22_29.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static101.aClass22_33.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static278.aClass22_96.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static182.aClass22_64.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static137.aClass22_47.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static296.aClass22_105.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static145.aClass22_101.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static80.aClass22_31.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static60.aClass22_26.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static192.aClass22_20.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static155.aClass22_57.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static140.aClass22_48.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static269.aClass22_95.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static292.aClass22_102.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static191.aClass22_67.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static218.aClass22_75.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static200.aClass22_70.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static198.aClass22_69.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static65.aClass22_104.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static213.aClass22_71.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static127.aClass22_42.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static175.aClass22_63.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static245.aClass22_84.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static52.aClass22_25.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static5.aClass22_2.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static13.aClass22_6.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static160.aClass22_58.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static86.aClass22_32.method667());
				Static200.aClass4_Sub24_Sub1_2.method3066(Static256.aClass22_86.method667());
				Static200.aClass4_Sub24_Sub1_2.method3091(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				Static261.aClass91_3.method2303(Static200.aClass4_Sub24_Sub1_2.anInt3822, Static200.aClass4_Sub24_Sub1_2.aByteArray47);
				Static175.aClass4_Sub24_Sub1_1.method3131(local197);
				for (local559 = 0; local559 < 4; local559++) {
					local197[local559] += 50;
				}
				Static256.aClass4_Sub24_Sub1_3.method3131(local197);
				Static141.anInt2799 = 4;
			}
			if (Static141.anInt2799 == 4) {
				if (Static261.aClass91_3.method2300() < 1) {
					return;
				}
				local559 = Static261.aClass91_3.method2305();
				if (local559 == 21) {
					Static141.anInt2799 = 7;
				} else if (local559 == 29) {
					Static141.anInt2799 = 10;
				} else if (local559 == 1) {
					Static141.anInt2799 = 5;
					Static140.anInt2773 = local559;
					return;
				} else if (local559 == 2) {
					Static141.anInt2799 = 8;
				} else if (local559 == 15) {
					Static140.anInt2773 = local559;
					Static141.anInt2799 = 0;
					return;
				} else if (local559 == 23 && Static240.anInt2593 < 1) {
					Static70.anInt1432 = 0;
					Static141.anInt2799 = 1;
					Static240.anInt2593++;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					return;
				} else {
					Static141.anInt2799 = 0;
					Static140.anInt2773 = local559;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					return;
				}
			}
			if (Static141.anInt2799 == 6) {
				Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
				Static175.aClass4_Sub24_Sub1_1.method3123(17);
				Static261.aClass91_3.method2303(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				Static141.anInt2799 = 4;
				return;
			}
			if (Static141.anInt2799 == 7) {
				if (Static261.aClass91_3.method2300() >= 1) {
					Static36.anInt687 = (Static261.aClass91_3.method2305() + 3) * 60;
					Static141.anInt2799 = 0;
					Static140.anInt2773 = 21;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					return;
				}
				return;
			}
			if (Static141.anInt2799 == 10) {
				if (Static261.aClass91_3.method2300() < 1) {
					return;
				}
				Static121.anInt2457 = Static261.aClass91_3.method2305();
				Static140.anInt2773 = 29;
				Static141.anInt2799 = 0;
				Static261.aClass91_3.method2302();
				Static261.aClass91_3 = null;
				return;
			}
			if (Static141.anInt2799 == 8) {
				if (Static261.aClass91_3.method2300() < 14) {
					return;
				}
				Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, 14);
				Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
				Static191.anInt3873 = Static256.aClass4_Sub24_Sub1_3.method3110();
				Static187.anInt3850 = Static256.aClass4_Sub24_Sub1_3.method3110();
				Static243.aBoolean299 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static29.aBoolean47 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static105.aBoolean120 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static106.aBoolean122 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static156.aBoolean208 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static169.anInt3387 = Static256.aClass4_Sub24_Sub1_3.method3085();
				Static194.aBoolean243 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static84.aBoolean101 = Static256.aClass4_Sub24_Sub1_3.method3110() == 1;
				Static131.method1207(Static84.aBoolean101);
				Static10.method203(Static84.aBoolean101);
				if (!Static230.aBoolean290) {
					if (Static243.aBoolean299 && !Static105.aBoolean120 || Static194.aBoolean243) {
						try {
							Static311.method1064("zap", Static95.aClass184_3.anApplet1);
						} catch (@Pc(886) Throwable local886) {
						}
					} else {
						try {
							Static311.method1064("unzap", Static95.aClass184_3.anApplet1);
						} catch (@Pc(876) Throwable local876) {
						}
					}
				}
				try {
					Static311.method1064("loggedin", Static95.aClass184_3.anApplet1);
				} catch (@Pc(894) Throwable local894) {
				}
				Static138.anInt2729 = Static256.aClass4_Sub24_Sub1_3.method3133();
				Static31.anInt653 = Static256.aClass4_Sub24_Sub1_3.method3085();
				Static141.anInt2799 = 9;
			}
			if (Static141.anInt2799 == 9) {
				if (Static261.aClass91_3.method2300() >= Static31.anInt653) {
					Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
					Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, Static31.anInt653);
					Static140.anInt2773 = 2;
					Static141.anInt2799 = 0;
					Static240.method2133();
					Static218.anInt4196 = -1;
					Static106.method1797(false);
					Static138.anInt2729 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(946) IOException local946) {
			if (Static261.aClass91_3 != null) {
				Static261.aClass91_3.method2302();
				Static261.aClass91_3 = null;
			}
			if (Static240.anInt2593 >= 1) {
				Static140.anInt2773 = -4;
				Static141.anInt2799 = 0;
			} else {
				Static70.anInt1432 = 0;
				Static240.anInt2593++;
				Static141.anInt2799 = 1;
				if (Static140.anInt2772 == Static17.anInt387) {
					Static140.anInt2772 = Static9.anInt185;
				} else {
					Static140.anInt2772 = Static17.anInt387;
				}
			}
		}
	}
}

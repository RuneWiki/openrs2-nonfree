import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!vb;")
	public static Class82 aClass82_13;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_252 = Static120.method2057(" (X");

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Z")
	public static boolean method608() {
		@Pc(10) long local10 = Static23.method507();
		@Pc(15) int local15 = (int) (local10 - Static60.aLong48);
		if (local15 > 200) {
			local15 = 200;
		}
		Static60.aLong48 = local10;
		Static14.anInt289 += local15;
		if (Static129.anInt2840 == 0 && Static6.anInt149 == 0 && Static117.anInt4121 == 0 && Static66.anInt1658 == 0) {
			return true;
		} else if (Static160.aClass41_4 == null) {
			return false;
		} else {
			try {
				if (Static14.anInt289 > 30000) {
					throw new IOException();
				}
				@Pc(66) Class1_Sub2_Sub10 local66;
				@Pc(71) Class1_Sub8 local71;
				while (Static6.anInt149 < 20 && Static66.anInt1658 > 0) {
					local66 = (Class1_Sub2_Sub10) Static9.aClass5_3.method140();
					local71 = new Class1_Sub8(4);
					local71.method331(1);
					local71.method343((int) local66.aLong148);
					Static160.aClass41_4.method1339(4, local71.aByteArray3);
					Static187.aClass5_13.method138(local66, local66.aLong148);
					Static66.anInt1658--;
					Static6.anInt149++;
				}
				while (Static129.anInt2840 < 20 && Static117.anInt4121 > 0) {
					local66 = (Class1_Sub2_Sub10) Static2.aClass71_1.method2252();
					local71 = new Class1_Sub8(4);
					local71.method331(0);
					local71.method343((int) local66.aLong148);
					Static160.aClass41_4.method1339(4, local71.aByteArray3);
					local66.method3072();
					Static153.aClass5_10.method138(local66, local66.aLong148);
					Static117.anInt4121--;
					Static129.anInt2840++;
				}
				for (@Pc(164) int local164 = 0; local164 < 100; local164++) {
					@Pc(170) int local170 = Static160.aClass41_4.method1344();
					if (local170 < 0) {
						throw new IOException();
					}
					if (local170 == 0) {
						break;
					}
					Static14.anInt289 = 0;
					@Pc(185) byte local185 = 0;
					if (Static2.aClass1_Sub2_Sub10_1 == null) {
						local185 = 8;
					} else if (Static54.anInt1298 == 0) {
						local185 = 1;
					}
					@Pc(206) int local206;
					@Pc(227) int local227;
					@Pc(277) int local277;
					@Pc(292) int local292;
					if (local185 > 0) {
						local206 = local185 - Static106.aClass1_Sub8_4.anInt446;
						if (local206 > local170) {
							local206 = local170;
						}
						Static160.aClass41_4.method1345(local206, Static106.aClass1_Sub8_4.anInt446, Static106.aClass1_Sub8_4.aByteArray3);
						if (Static115.aByte5 != 0) {
							for (local227 = 0; local227 < local206; local227++) {
								Static106.aClass1_Sub8_4.aByteArray3[local227 + Static106.aClass1_Sub8_4.anInt446] ^= Static115.aByte5;
							}
						}
						Static106.aClass1_Sub8_4.anInt446 += local206;
						if (local185 > Static106.aClass1_Sub8_4.anInt446) {
							break;
						}
						if (Static2.aClass1_Sub2_Sub10_1 == null) {
							Static106.aClass1_Sub8_4.anInt446 = 0;
							local227 = Static106.aClass1_Sub8_4.method336();
							local277 = Static106.aClass1_Sub8_4.method359();
							@Pc(281) int local281 = Static106.aClass1_Sub8_4.method336();
							@Pc(288) long local288 = (long) (local277 + (local227 << 16));
							local292 = Static106.aClass1_Sub8_4.method347();
							@Pc(300) Class1_Sub2_Sub10 local300 = (Class1_Sub2_Sub10) Static187.aClass5_13.method134(local288);
							Static175.aBoolean114 = true;
							if (local300 == null) {
								local300 = (Class1_Sub2_Sub10) Static153.aClass5_10.method134(local288);
								Static175.aBoolean114 = false;
							}
							if (local300 == null) {
								throw new IOException();
							}
							Static2.aClass1_Sub2_Sub10_1 = local300;
							@Pc(328) int local328 = local281 == 0 ? 5 : 9;
							Static44.aClass1_Sub8_1 = new Class1_Sub8(Static2.aClass1_Sub2_Sub10_1.aByte2 + local328 + local292);
							Static44.aClass1_Sub8_1.method331(local281);
							Static44.aClass1_Sub8_1.method328(local292);
							Static106.aClass1_Sub8_4.anInt446 = 0;
							Static54.anInt1298 = 8;
						} else if (Static54.anInt1298 == 0) {
							if (Static106.aClass1_Sub8_4.aByteArray3[0] == -1) {
								Static106.aClass1_Sub8_4.anInt446 = 0;
								Static54.anInt1298 = 1;
							} else {
								Static2.aClass1_Sub2_Sub10_1 = null;
							}
						}
					} else {
						local206 = Static44.aClass1_Sub8_1.aByteArray3.length - Static2.aClass1_Sub2_Sub10_1.aByte2;
						local227 = 512 - Static54.anInt1298;
						if (local227 > local206 - Static44.aClass1_Sub8_1.anInt446) {
							local227 = local206 - Static44.aClass1_Sub8_1.anInt446;
						}
						if (local227 > local170) {
							local227 = local170;
						}
						Static160.aClass41_4.method1345(local227, Static44.aClass1_Sub8_1.anInt446, Static44.aClass1_Sub8_1.aByteArray3);
						if (Static115.aByte5 != 0) {
							for (local277 = 0; local277 < local227; local277++) {
								Static44.aClass1_Sub8_1.aByteArray3[local277 + Static44.aClass1_Sub8_1.anInt446] ^= Static115.aByte5;
							}
						}
						Static44.aClass1_Sub8_1.anInt446 += local227;
						Static54.anInt1298 += local227;
						if (local206 == Static44.aClass1_Sub8_1.anInt446) {
							if (Static2.aClass1_Sub2_Sub10_1.aLong148 == 16711935L) {
								Static178.aClass1_Sub8_5 = Static44.aClass1_Sub8_1;
								for (local277 = 0; local277 < 256; local277++) {
									@Pc(478) Class82_Sub1 local478 = Static149.aClass82_Sub1Array1[local277];
									if (local478 != null) {
										Static178.aClass1_Sub8_5.anInt446 = local277 * 8 + 5;
										local292 = Static178.aClass1_Sub8_5.method347();
										@Pc(497) int local497 = Static178.aClass1_Sub8_5.method347();
										local478.method2973(local497, local292);
									}
								}
							} else {
								Static126.aCRC32_2.reset();
								Static126.aCRC32_2.update(Static44.aClass1_Sub8_1.aByteArray3, 0, local206);
								local277 = (int) Static126.aCRC32_2.getValue();
								if (Static2.aClass1_Sub2_Sub10_1.anInt1758 != local277) {
									try {
										Static160.aClass41_4.method1340();
									} catch (@Pc(539) Exception local539) {
									}
									Static115.anInt2593++;
									Static115.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									Static160.aClass41_4 = null;
									return false;
								}
								Static115.anInt2593 = 0;
								Static40.anInt1052 = 0;
								Static2.aClass1_Sub2_Sub10_1.aClass82_Sub1_9.method2972((int) (Static2.aClass1_Sub2_Sub10_1.aLong148 & 0xFFFFL), Static44.aClass1_Sub8_1.aByteArray3, Static175.aBoolean114, (Static2.aClass1_Sub2_Sub10_1.aLong148 & 0xFF0000L) == 16711680L);
							}
							Static2.aClass1_Sub2_Sub10_1.method3134();
							Static2.aClass1_Sub2_Sub10_1 = null;
							if (Static175.aBoolean114) {
								Static6.anInt149--;
							} else {
								Static129.anInt2840--;
							}
							Static54.anInt1298 = 0;
							Static44.aClass1_Sub8_1 = null;
						} else {
							if (Static54.anInt1298 != 512) {
								break;
							}
							Static54.anInt1298 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(619) IOException local619) {
				try {
					Static160.aClass41_4.method1340();
				} catch (@Pc(626) Exception local626) {
				}
				Static40.anInt1052++;
				Static160.aClass41_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method609() {
		aClass82_13 = null;
		aClass81_252 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method612(@OriginalArg(0) int arg0) {
		Static20.anInt506 += arg0 * 128;
		@Pc(22) int local22;
		if (Static20.anInt506 > Static71.anIntArray150.length) {
			local22 = (int) (Math.random() * 12.0D);
			Static20.anInt506 -= Static71.anIntArray150.length;
			Static154.method2677(Static5.aClass1_Sub2_Sub2_Sub4Array1[local22]);
		}
		local22 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local71 = Static140.anIntArray329[local38 + local22] - Static71.anIntArray150[local22 + Static20.anInt506 & Static71.anIntArray150.length + -1] * arg0 / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static140.anIntArray329[local22++] = local71;
		}
		@Pc(98) int local98;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local98 = local71 * 128;
			for (local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static140.anIntArray329[local98 + local100] = 255;
				} else {
					Static140.anIntArray329[local98 + local100] = 0;
				}
			}
		}
		if (Static20.anInt510 > 0) {
			Static20.anInt510 -= arg0 * 4;
		}
		if (Static184.anInt4116 > 0) {
			Static184.anInt4116 -= arg0 * 4;
		}
		if (Static20.anInt510 == 0 && Static184.anInt4116 == 0) {
			local98 = (int) (Math.random() * (double) (2000 / arg0));
			if (local98 == 1) {
				Static184.anInt4116 = 1024;
			}
			if (local98 == 0) {
				Static20.anInt510 = 1024;
			}
		}
		for (local98 = 0; local98 < 256 - arg0; local98++) {
			Static47.anIntArray95[local98] = Static47.anIntArray95[local98 + arg0];
		}
		for (local100 = 256 - arg0; local100 < 256; local100++) {
			Static47.anIntArray95[local100] = (int) (Math.sin((double) Static25.anInt647 / 14.0D) * 16.0D + Math.sin((double) Static25.anInt647 / 15.0D) * 14.0D + Math.sin((double) Static25.anInt647 / 16.0D) * 12.0D);
			Static25.anInt647++;
		}
		Static37.anInt976 += arg0;
		local107 = ((Static142.anInt3104 & 0x1) + arg0) / 2;
		if (local107 <= 0) {
			return;
		}
		@Pc(302) int local302;
		@Pc(295) int local295;
		for (@Pc(286) int local286 = 0; local286 < Static37.anInt976 * 100; local286++) {
			local295 = (int) (Math.random() * 128.0D) + 128;
			local302 = (int) (Math.random() * 124.0D) + 2;
			Static140.anIntArray329[(local295 << 7) + local302] = 192;
		}
		Static37.anInt976 = 0;
		@Pc(332) int local332;
		@Pc(335) int local335;
		for (local302 = 0; local302 < 256; local302++) {
			local295 = 0;
			local332 = local302 * 128;
			for (local335 = -local107; local335 < 128; local335++) {
				if (local107 + local335 < 128) {
					local295 += Static140.anIntArray329[local107 + local335 + local332];
				}
				if (local335 - local107 - 1 >= 0) {
					local295 -= Static140.anIntArray329[local332 + local335 - local107 - 1];
				}
				if (local335 >= 0) {
					Static30.anIntArray61[local332 + local335] = local295 / (local107 * 2 + 1);
				}
			}
		}
		for (local295 = 0; local295 < 128; local295++) {
			local332 = 0;
			for (local335 = -local107; local335 < 256; local335++) {
				@Pc(411) int local411 = local335 * 128;
				if (local107 + local335 < 256) {
					local332 += Static30.anIntArray61[local107 * 128 + local411 + local295];
				}
				if (local335 - local107 - 1 >= 0) {
					local332 -= Static30.anIntArray61[local295 + local411 - (local107 + 1) * 128];
				}
				if (local335 >= 0) {
					Static140.anIntArray329[local411 + local295] = local332 / (local107 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIII)V")
	public static void method613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class1_Sub6 local18 = (Class1_Sub6) Static2.aClass30_2.method1115(); local18 != null; local18 = (Class1_Sub6) Static2.aClass30_2.method1125()) {
			if (local18.anInt297 != -1 || local18.anIntArray11 != null) {
				@Pc(30) int local30 = 0;
				if (local18.anInt286 < arg1) {
					local30 = arg1 - local18.anInt286;
				} else if (arg1 < local18.anInt290) {
					local30 = local18.anInt290 - arg1;
				}
				if (local18.anInt295 < arg0) {
					local30 += arg0 - local18.anInt295;
				} else if (arg0 < local18.anInt284) {
					local30 += local18.anInt284 - arg0;
				}
				if (local30 - 64 > local18.anInt287 || Static149.anInt3335 == 0 || arg3 != local18.anInt293) {
					if (local18.aClass1_Sub10_Sub4_3 != null) {
						Static25.aClass1_Sub10_Sub1_1.method453(local18.aClass1_Sub10_Sub4_3);
						local18.aClass1_Sub10_Sub4_3 = null;
					}
					if (local18.aClass1_Sub10_Sub4_2 != null) {
						Static25.aClass1_Sub10_Sub1_1.method453(local18.aClass1_Sub10_Sub4_2);
						local18.aClass1_Sub10_Sub4_2 = null;
					}
				} else {
					local30 -= 64;
					if (local30 < 0) {
						local30 = 0;
					}
					@Pc(146) int local146 = (local18.anInt287 - local30) * Static149.anInt3335 / local18.anInt287;
					if (local18.aClass1_Sub10_Sub4_3 != null) {
						local18.aClass1_Sub10_Sub4_3.method2453(local146);
					} else if (local18.anInt297 >= 0) {
						@Pc(164) Class21 local164 = Static189.method825(Static7.aClass82_Sub1_2, local18.anInt297, 0);
						if (local164 != null) {
							@Pc(171) Class1_Sub11_Sub1 local171 = local164.method826().method656(Static34.aClass18_1);
							@Pc(176) Class1_Sub10_Sub4 local176 = Static193.method2479(local171, local146);
							local176.method2461(-1);
							Static25.aClass1_Sub10_Sub1_1.method454(local176);
							local18.aClass1_Sub10_Sub4_3 = local176;
						}
					}
					if (local18.aClass1_Sub10_Sub4_2 != null) {
						local18.aClass1_Sub10_Sub4_2.method2453(local146);
						if (!local18.aClass1_Sub10_Sub4_2.method3137()) {
							local18.aClass1_Sub10_Sub4_2 = null;
						}
					} else if (local18.anIntArray11 != null && (local18.anInt285 -= arg2) <= 0) {
						@Pc(210) int local210 = (int) (Math.random() * (double) local18.anIntArray11.length);
						@Pc(218) Class21 local218 = Static189.method825(Static7.aClass82_Sub1_2, local18.anIntArray11[local210], 0);
						if (local218 != null) {
							@Pc(225) Class1_Sub11_Sub1 local225 = local218.method826().method656(Static34.aClass18_1);
							@Pc(230) Class1_Sub10_Sub4 local230 = Static193.method2479(local225, local146);
							local230.method2461(0);
							Static25.aClass1_Sub10_Sub1_1.method454(local230);
							local18.anInt285 = local18.anInt282 + (int) ((double) (local18.anInt296 - local18.anInt282) * Math.random());
							local18.aClass1_Sub10_Sub4_2 = local230;
						}
					}
				}
			}
		}
	}
}

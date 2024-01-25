import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
	public static final int[] anIntArray290 = new int[5];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!dg;)Ljava/lang/String;")
	public static String method3195(@OriginalArg(1) Class2_Sub10 arg0) {
		return Static144.method2821(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!tq;I)I")
	public static int method3196(@OriginalArg(0) Class191 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method5440(Static301.anInt5012)) {
			local10++;
		}
		if (arg0.method5440(Static340.anInt6746)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZIIIIIIIB)Z")
	public static boolean method3198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(33) int local33 = Static313.method5507(arg9, arg7, arg2, arg1, Static137.anIntArray241, Static169.aClass151Array1[Static182.anInt3603], arg4, Static41.aClass62_Sub1_Sub2_Sub2_2.method4777(), arg3, arg5, arg0, arg8, arg6, Static120.anIntArray231);
		if (local33 < 1) {
			return false;
		}
		Static201.anInt3909 = Static137.anIntArray241[local33 - 1];
		Static116.anInt2576 = Static120.anIntArray231[local33 - 1];
		Static264.aBoolean487 = false;
		Static271.method4898();
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!ae;II)V")
	public static void method3199(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static74.anInt144 == 0 || Static185.anInt3659 == 0) {
			return;
		}
		arg1.method4266(Static88.anInt1900, Static208.anInt4045, Static74.anInt144, Static185.anInt3659);
		arg1.method4252(Static272.anInt5537, Static275.anInt5618, Static74.anInt144, Static185.anInt3659);
		@Pc(41) Class133 local41 = arg1.method4273();
		local41.method4339(Static297.anInt6012, Static153.anInt3160, Static351.anInt5281, Static274.anInt5614, Static154.anInt6530, Static247.anInt4860);
		arg1.method4233(local41);
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (Static265.aClass73Array44 != null) {
			@Pc(56) int local56 = -1;
			@Pc(58) int local58 = -1;
			@Pc(61) int local61 = arg1.method4215();
			local69 = local61 * (arg2 - Static88.anInt1900) / Static74.anInt144;
			local78 = local61 * (arg0 - Static208.anInt4045) / Static185.anInt3659;
			local81 = arg1.method4302();
			local90 = local81 * (arg2 - Static88.anInt1900) / Static74.anInt144;
			local99 = local81 * (arg0 - Static208.anInt4045) / Static185.anInt3659;
			@Pc(114) int[] local114 = new int[] { local69, local78, local61 };
			local41.method4329(local114);
			@Pc(132) int[] local132 = new int[] { local90, local99, local81 };
			local41.method4329(local132);
			@Pc(137) float local137 = 0.0F;
			@Pc(146) int local146 = local132[0] - local114[0];
			@Pc(154) int local154 = local132[1] - local114[1];
			@Pc(162) int local162 = local132[2] - local114[2];
			while (local137 < 1.0F) {
				@Pc(175) int local175 = (int) ((float) local114[0] + (float) local146 * local137);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) ((float) local162 * local137 + (float) local114[2]);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && Static95.anInt6381 > local179 && Static237.anInt4532 > local194) {
					@Pc(216) int local216 = Static182.anInt3603;
					if (local216 < 3 && (Static313.aByteArrayArrayArray12[1][local179][local194] & 0x2) != 0) {
						local216++;
					}
					if ((float) Static265.aClass73Array44[local216].method4932(local175, local190) < (float) local114[1] + (float) local154 * local137) {
						local56 = Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() * 64 + local175 - 64 >> 7;
						local58 = Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() * 64 + local190 - 64 >> 7;
						break;
					}
				}
				local137 = (float) ((double) local137 + 0.01D);
			}
			if (local56 != -1 && local58 != -1) {
				if (Static262.aBoolean479 && (Static326.anInt6614 & 0x40) != 0) {
					@Pc(337) Class146 local337 = Static86.method1928(Static7.anInt157, Static48.anInt1094);
					if (local337 == null) {
						Static52.method1198();
					} else {
						Static53.method1208(local56, " ->", Static273.anInt5579, Static165.aString29, 0L, local58, 12);
					}
				} else {
					if (Static41.anInt830 == 1) {
						Static53.method1208(local56, "", -1, Static10.aClass93_6.method2819(Static21.anInt455), 0L, local58, 45);
					}
					Static53.method1208(local56, "", -1, Static7.aString1, 0L, local58, 21);
				}
			}
		}
		@Pc(354) Class67 local354 = Static5.aClass67_7;
		for (@Pc(359) Class55_Sub3 local359 = (Class55_Sub3) local354.method2098(); local359 != null; local359 = (Class55_Sub3) local354.method2104()) {
			if (local359.method2937(arg1, arg0, arg2) && local359.anInt3109 == Static182.anInt3603) {
				@Pc(477) int local477;
				@Pc(489) int local489;
				if (local359.aClass62_1 instanceof Class62_Sub1_Sub2_Sub2) {
					@Pc(380) Class62_Sub1_Sub2_Sub2 local380 = (Class62_Sub1_Sub2_Sub2) local359.aClass62_1;
					local69 = local380.method4777();
					if ((local69 & 0x1) == 0 && (local380.anInt5289 & 0x7F) == 0 && (local380.anInt5280 & 0x7F) == 0 || (local69 & 0x1) == 1 && (local380.anInt5289 & 0x7F) == 64 && (local380.anInt5280 & 0x7F) == 64) {
						local78 = local380.anInt5289 - (local380.method4777() - 1) * 64;
						local81 = local380.anInt5280 - (local380.method4777() - 1) * 64;
						for (local90 = 0; local90 < Static169.anInt3463; local90++) {
							@Pc(451) Class62_Sub1_Sub2_Sub1 local451 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local90]];
							if (local451 != null && local451.anInt5355 != Static212.anInt4090 && local451.aBoolean482) {
								local477 = local451.anInt5289 + 64 - local451.aClass186_1.anInt5977 * 64;
								local489 = local451.anInt5280 - (local451.aClass186_1.anInt5977 - 1) * 64;
								if (local78 <= local477 && local451.aClass186_1.anInt5977 <= local380.method4777() - (local477 - local78 >> 7) && local81 <= local489 && local451.aClass186_1.anInt5977 <= local380.method4777() - (local489 - local81 >> 7)) {
									Static205.method3669(local451);
									local451.anInt5355 = Static212.anInt4090;
								}
							}
						}
						for (local99 = 0; local99 < Static214.anInt4133; local99++) {
							@Pc(558) Class62_Sub1_Sub2_Sub2 local558 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local99]];
							if (local558 != null && local558.anInt5355 != Static212.anInt4090 && local380 != local558 && local558.aBoolean482) {
								local489 = local558.anInt5289 - (local558.method4777() - 1) * 64;
								@Pc(600) int local600 = local558.anInt5280 - (local558.method4777() - 1) * 64;
								if (local489 >= local78 && local558.method4777() <= local380.method4777() - (local489 - local78 >> 7) && local81 <= local600 && local558.method4777() <= local380.method4777() - (local600 - local81 >> 7)) {
									Static187.method3375(local558);
									local558.anInt5355 = Static212.anInt4090;
								}
							}
						}
					}
					if (Static212.anInt4090 == local380.anInt5355) {
						continue;
					}
					Static187.method3375(local380);
					local380.anInt5355 = Static212.anInt4090;
				}
				if (local359.aClass62_1 instanceof Class62_Sub1_Sub2_Sub1) {
					@Pc(687) Class62_Sub1_Sub2_Sub1 local687 = (Class62_Sub1_Sub2_Sub1) local359.aClass62_1;
					if (local687.aClass186_1 != null) {
						if ((local687.aClass186_1.anInt5977 & 0x1) == 0 && (local687.anInt5289 & 0x7F) == 0 && (local687.anInt5280 & 0x7F) == 0 || (local687.aClass186_1.anInt5977 & 0x1) == 1 && (local687.anInt5289 & 0x7F) == 64 && (local687.anInt5280 & 0x7F) == 64) {
							local69 = local687.anInt5289 - (local687.aClass186_1.anInt5977 - 1) * 64;
							local78 = local687.anInt5280 + 64 - local687.aClass186_1.anInt5977 * 64;
							for (local81 = 0; local81 < Static169.anInt3463; local81++) {
								@Pc(768) Class62_Sub1_Sub2_Sub1 local768 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local81]];
								if (local768 != null && local768.anInt5355 != Static212.anInt4090 && local768 != local687 && local768.aBoolean482) {
									local99 = local768.anInt5289 - (local768.aClass186_1.anInt5977 - 1) * 64;
									local477 = local768.anInt5280 + 64 - local768.aClass186_1.anInt5977 * 64;
									if (local99 >= local69 && local687.aClass186_1.anInt5977 - (local99 - local69 >> 7) >= local768.aClass186_1.anInt5977 && local477 >= local78 && local687.aClass186_1.anInt5977 - (local477 - local78 >> 7) >= local768.aClass186_1.anInt5977) {
										Static205.method3669(local768);
										local768.anInt5355 = Static212.anInt4090;
									}
								}
							}
							for (local90 = 0; local90 < Static214.anInt4133; local90++) {
								@Pc(876) Class62_Sub1_Sub2_Sub2 local876 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local90]];
								if (local876 != null && Static212.anInt4090 != local876.anInt5355 && local876.aBoolean482) {
									local477 = local876.anInt5289 - (local876.method4777() - 1) * 64;
									local489 = local876.anInt5280 - (local876.method4777() - 1) * 64;
									if (local477 >= local69 && local876.method4777() <= local687.aClass186_1.anInt5977 - (local477 - local69 >> 7) && local78 <= local489 && local876.method4777() <= local687.aClass186_1.anInt5977 - (local489 - local78 >> 7)) {
										Static187.method3375(local876);
										local876.anInt5355 = Static212.anInt4090;
									}
								}
							}
						}
						if (local687.anInt5355 == Static212.anInt4090) {
							continue;
						}
						Static205.method3669(local687);
						local687.anInt5355 = Static212.anInt4090;
					}
				}
				if (local359.aClass62_1 instanceof Class62_Sub2_Sub1) {
					@Pc(1012) Class2_Sub1 local1012 = (Class2_Sub1) Static136.aClass199_12.method5751((long) (local359.anInt3109 << 28 | local359.anInt3108 << 14 | local359.anInt3103));
					if (local1012 != null) {
						for (@Pc(1020) Class2_Sub4 local1020 = (Class2_Sub4) local1012.aClass216_1.method5996(); local1020 != null; local1020 = (Class2_Sub4) local1012.aClass216_1.method5998()) {
							@Pc(1027) Class208 local1027 = Static282.method5080(local1020.anInt379);
							if (Static262.aBoolean479) {
								@Pc(1161) Class2_Sub11_Sub21 local1161 = Static133.anInt2765 == -1 ? null : Static2.method57(Static133.anInt2765);
								if ((Static326.anInt6614 & 0x1) != 0 && (local1161 == null || local1027.method5865(Static133.anInt2765, local1161.anInt6866) != local1161.anInt6866)) {
									Static53.method1208(local359.anInt3103, Static149.aString25 + " -> <col=ff9040>" + local1027.aString63, Static273.anInt5579, Static165.aString29, (long) local1020.anInt379, local359.anInt3108, 46);
								}
							} else {
								@Pc(1032) String[] local1032 = local1027.aStringArray63;
								for (local90 = 4; local90 >= 0; local90--) {
									if (local1032 != null && local1032[local90] != null) {
										@Pc(1044) byte local1044 = 0;
										if (local90 == 0) {
											local1044 = 58;
										}
										local477 = Static83.anInt1810;
										if (local90 == 1) {
											local1044 = 11;
										}
										if (local90 == 2) {
											local1044 = 57;
										}
										if (local90 == 3) {
											local1044 = 6;
										}
										if (local90 == 4) {
											local1044 = 22;
										}
										if (local90 == local1027.anInt6778) {
											local477 = local1027.anInt6784;
										}
										if (local1027.anInt6772 == local90) {
											local477 = local1027.anInt6760;
										}
										Static53.method1208(local359.anInt3103, "<col=ff9040>" + local1027.aString63, local477, local1032[local90], (long) local1020.anInt379, local359.anInt3108, local1044);
									}
								}
								Static53.method1208(local359.anInt3103, "<col=ff9040>" + local1027.aString63, Static303.anInt6089, Static70.aClass93_23.method2819(Static21.anInt455), (long) local1020.anInt379, local359.anInt3108, 1001);
							}
						}
					}
				}
				if (local359.aClass62_1 instanceof Interface9) {
					@Pc(1222) Interface9 local1222 = (Interface9) local359.aClass62_1;
					@Pc(1228) Class96 local1228 = Static234.method4051(local1222.method5583());
					if (local1228.anIntArray259 != null) {
						local1228 = local1228.method2944();
					}
					if (local1228 != null) {
						if (Static262.aBoolean479) {
							@Pc(1379) Class2_Sub11_Sub21 local1379 = Static133.anInt2765 == -1 ? null : Static2.method57(Static133.anInt2765);
							if ((Static326.anInt6614 & 0x4) != 0 && (local1379 == null || local1228.method2947(local1379.anInt6866, Static133.anInt2765) != local1379.anInt6866)) {
								Static53.method1208(local359.anInt3103, Static149.aString25 + " -> <col=00ffff>" + local1228.aString27, Static273.anInt5579, Static165.aString29, Static235.method4060(local359.anInt3108, local359.anInt3103, local1222), local359.anInt3108, 25);
							}
						} else {
							@Pc(1242) String[] local1242 = local1228.aStringArray27;
							if (local1242 != null) {
								for (local81 = 4; local81 >= 0; local81--) {
									if (local1242[local81] != null) {
										@Pc(1254) short local1254 = 0;
										if (local81 == 0) {
											local1254 = 19;
										}
										local99 = Static83.anInt1810;
										if (local81 == 1) {
											local1254 = 15;
										}
										if (local81 == 2) {
											local1254 = 3;
										}
										if (local81 == 3) {
											local1254 = 13;
										}
										if (local1228.anInt3143 == local81) {
											local99 = local1228.anInt3154;
										}
										if (local81 == 4) {
											local1254 = 1008;
										}
										if (local81 == local1228.anInt3123) {
											local99 = local1228.anInt3147;
										}
										Static53.method1208(local359.anInt3103, "<col=00ffff>" + local1228.aString27, local99, local1242[local81], Static235.method4060(local359.anInt3108, local359.anInt3103, local1222), local359.anInt3108, local1254);
									}
								}
							}
							Static53.method1208(local359.anInt3103, "<col=00ffff>" + local1228.aString27, Static303.anInt6089, Static70.aClass93_23.method2819(Static21.anInt455), (long) local1228.anInt3132, local359.anInt3108, 1009);
						}
					}
				}
			}
		}
	}
}

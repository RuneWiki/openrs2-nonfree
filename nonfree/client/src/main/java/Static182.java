import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!lc;")
	public static Class79 aClass79_28 = new Class79(64);

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	public static int anInt4168 = 0;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	public static int anInt4172 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lclient!je;")
	public static Class66 method3126(@OriginalArg(1) int arg0) {
		@Pc(17) Class66 local17 = (Class66) Static197.aClass79_12.method2483((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static88.aClass51_31.method1874(4, arg0);
		local17 = new Class66();
		if (local27 != null) {
			local17.method2256(new Class1_Sub13(local27), arg0);
		}
		Static197.aClass79_12.method2486(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method3127() {
		Static169.aClass122Array1 = null;
		Static213.method3510(Static140.anInt3388, 0, -1, Static251.anInt5352, 0, 0, 0, Static200.anInt4411);
		if (Static169.aClass122Array1 != null) {
			Static23.method429(Static123.anInt1278, 0, -1412584499, Static200.anInt4411, 0, Static251.anInt5352, Static26.anInt709, Static37.aClass122_2.anInt4671, Static169.aClass122Array1);
			Static169.aClass122Array1 = null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method3129(@OriginalArg(0) int arg0) {
		Static63.anInt1779 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static94.anInt4252; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static239.anInt5153; local6++) {
				if (Static142.aClass1_Sub16ArrayArrayArray4[arg0][local3][local6] == null) {
					Static142.aClass1_Sub16ArrayArrayArray4[arg0][local3][local6] = new Class1_Sub16(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)[B")
	public static byte[] method3130(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub13 local4 = new Class1_Sub13(arg0);
		@Pc(12) int local12 = local4.method1772();
		@Pc(24) int local24 = local4.method1802();
		if (local24 < 0 || Static180.anInt4138 != 0 && Static180.anInt4138 < local24) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(94) byte[] local94 = new byte[local24];
			local4.method1787(local24, local94);
			return local94;
		} else {
			@Pc(54) int local54 = local4.method1802();
			if (local54 < 0 || Static180.anInt4138 != 0 && Static180.anInt4138 < local54) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local54];
			if (local12 == 1) {
				Static173.method2986(local72, local54, arg0, local24);
			} else {
				Static247.aClass50_1.method1840(local72, local4);
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Lclient!md;")
	public static Class85 method3131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass85_1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([[[IZI[Lclient!jb;)V")
	public static void method3132(@OriginalArg(0) int[][][] arg0, @OriginalArg(3) Class65[] arg1) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		for (local5 = 0; local5 < 4; local5++) {
			for (local9 = 0; local9 < 104; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
					if ((Static145.aByteArrayArrayArray13[local5][local9][local13] & 0x1) == 1) {
						@Pc(30) int local30 = local5;
						if ((Static145.aByteArrayArrayArray13[1][local9][local13] & 0x2) == 2) {
							local30 = local5 - 1;
						}
						if (local30 >= 0) {
							arg1[local30].method2203(local9, local13);
						}
					}
				}
			}
		}
		Static228.anInt5018 += (int) (Math.random() * 5.0D) - 2;
		if (Static228.anInt5018 < -16) {
			Static228.anInt5018 = -16;
		}
		Static38.anInt1016 += (int) (Math.random() * 5.0D) - 2;
		if (Static38.anInt1016 < -8) {
			Static38.anInt1016 = -8;
		}
		if (Static228.anInt5018 > 16) {
			Static228.anInt5018 = 16;
		}
		if (Static38.anInt1016 > 8) {
			Static38.anInt1016 = 8;
		}
		local5 = Static38.anInt1016 >> 2 << 10;
		local9 = Static228.anInt5018 >> 1;
		@Pc(143) int[][] local143 = new int[104][104];
		@Pc(147) int[][] local147 = new int[104][104];
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(167) int local167;
		@Pc(171) int local171;
		@Pc(314) int local314;
		@Pc(194) int local194;
		@Pc(215) int local215;
		@Pc(229) int local229;
		@Pc(237) int local237;
		@Pc(241) int local241;
		@Pc(247) int local247;
		@Pc(298) int local298;
		@Pc(528) int local528;
		for (@Pc(149) int local149 = 0; local149 < 4; local149++) {
			@Pc(155) byte[][] local155 = Static39.aByteArrayArrayArray4[local149];
			local159 = (int) Math.sqrt(5100.0D);
			local165 = local159 * 768 >> 8;
			for (local167 = 1; local167 < 103; local167++) {
				for (local171 = 1; local171 < 103; local171++) {
					local194 = Static38.anIntArrayArrayArray6[local149][local171 + 1][local167] - Static38.anIntArrayArrayArray6[local149][local171 - 1][local167];
					local215 = Static38.anIntArrayArrayArray6[local149][local171][local167 + 1] - Static38.anIntArrayArrayArray6[local149][local171][local167 - 1];
					local229 = (int) Math.sqrt((double) (local194 * local194 + local215 * local215 + 65536));
					local237 = (local194 << 8) / local229;
					local241 = -65536 / local229;
					local247 = (local215 << 8) / local229;
					local298 = (local155[local171][local167 + 1] >> 3) + (local155[local171 - 1][local167] >> 2) + (local155[local171 - -1][local167] >> 3) + (local155[local171][local167 + -1] >> 2) + (local155[local171][local167] >> 1);
					local314 = (local241 * -10 + local237 * -50 + local247 * -50) / local165 + 74;
					local147[local171][local167] = local314 - local298;
				}
			}
			for (local171 = 0; local171 < 104; local171++) {
				Static54.anIntArray113[local171] = 0;
				Static172.anIntArray300[local171] = 0;
				Static118.anIntArray222[local171] = 0;
				Static255.anIntArray465[local171] = 0;
				Static201.anIntArray341[local171] = 0;
			}
			@Pc(565) int local565;
			for (local314 = -5; local314 < 104; local314++) {
				for (local194 = 0; local194 < 104; local194++) {
					local215 = local314 + 5;
					@Pc(432) int local432;
					if (local215 < 104) {
						local229 = Static102.aByteArrayArrayArray7[local149][local215][local194] & 0xFF;
						if (local229 > 0) {
							@Pc(396) Class137 local396 = Static17.method326(local229 - 1);
							Static54.anIntArray113[local194] += local396.anInt5239;
							Static172.anIntArray300[local194] += local396.anInt5246;
							Static118.anIntArray222[local194] += local396.anInt5238;
							Static255.anIntArray465[local194] += local396.anInt5245;
							local432 = Static201.anIntArray341[local194]++;
						}
					}
					local229 = local314 - 5;
					if (local229 >= 0) {
						local237 = Static102.aByteArrayArrayArray7[local149][local229][local194] & 0xFF;
						if (local237 > 0) {
							@Pc(462) Class137 local462 = Static17.method326(local237 - 1);
							Static54.anIntArray113[local194] -= local462.anInt5239;
							Static172.anIntArray300[local194] -= local462.anInt5246;
							Static118.anIntArray222[local194] -= local462.anInt5238;
							Static255.anIntArray465[local194] -= local462.anInt5245;
							local432 = Static201.anIntArray341[local194]--;
						}
					}
				}
				if (local314 >= 0) {
					local215 = 0;
					local241 = 0;
					local229 = 0;
					local237 = 0;
					local247 = 0;
					for (local298 = -5; local298 < 104; local298++) {
						local528 = local298 + 5;
						if (local528 < 104) {
							local241 += Static255.anIntArray465[local528];
							local215 += Static54.anIntArray113[local528];
							local237 += Static118.anIntArray222[local528];
							local229 += Static172.anIntArray300[local528];
							local247 += Static201.anIntArray341[local528];
						}
						local565 = local298 - 5;
						if (local565 >= 0) {
							local237 -= Static118.anIntArray222[local565];
							local247 -= Static201.anIntArray341[local565];
							local241 -= Static255.anIntArray465[local565];
							local229 -= Static172.anIntArray300[local565];
							local215 -= Static54.anIntArray113[local565];
						}
						if (local298 >= 0 && local247 > 0) {
							local143[local314][local298] = Static260.method2132(local215 * 256 / local241, local229 / local247, local237 / local247);
						}
					}
				}
			}
			for (local194 = 1; local194 < 103; local194++) {
				for (local215 = 1; local215 < 103; local215++) {
					if (Static25.method507() || (Static145.aByteArrayArrayArray13[0][local194][local215] & 0x2) != 0 || (Static145.aByteArrayArrayArray13[local149][local194][local215] & 0x10) == 0 && Static172.method2976(local194, local215, local149) == Static171.anInt3993) {
						if (Static124.anInt3159 > local149) {
							Static124.anInt3159 = local149;
						}
						local229 = Static102.aByteArrayArrayArray7[local149][local194][local215] & 0xFF;
						local237 = Static25.aByteArrayArrayArray3[local149][local194][local215] & 0xFF;
						if (local229 > 0 || local237 > 0) {
							local241 = Static38.anIntArrayArrayArray6[local149][local194][local215];
							local247 = Static38.anIntArrayArrayArray6[local149][local194 + 1][local215];
							local298 = Static38.anIntArrayArrayArray6[local149][local194 + 1][local215 + 1];
							local528 = Static38.anIntArrayArrayArray6[local149][local194][local215 + 1];
							if (local149 > 0) {
								@Pc(756) boolean local756 = true;
								if (local229 == 0 && Static25.aByteArrayArrayArray2[local149][local194][local215] != 0) {
									local756 = false;
								}
								if (local237 > 0 && !method3126(local237 - 1).aBoolean161) {
									local756 = false;
								}
								if (local756 && local247 == local241 && local241 == local298 && local241 == local528) {
									Static79.anIntArrayArrayArray7[local149][local194][local215] |= 0x4;
								}
							}
							@Pc(861) int local861;
							@Pc(828) int local828;
							@Pc(854) int local854;
							if (local229 > 0) {
								local565 = local143[local194][local215];
								local828 = local9 + (local565 & 0x7F);
								if (local828 < 0) {
									local828 = 0;
								} else if (local828 > 127) {
									local828 = 127;
								}
								local854 = local828 + (local565 & 0x380) + (local5 + local565 & 0xFC00);
								local861 = Static235.anIntArray443[Static134.method2497(96, local854)];
							} else {
								local565 = -1;
								local861 = 0;
							}
							local828 = local147[local194][local215];
							local854 = local147[local194 + 1][local215];
							@Pc(891) int local891 = local147[local194 + 1][local215 + 1];
							@Pc(899) int local899 = local147[local194][local215 + 1];
							if (local237 == 0) {
								Static254.method4106(local149, local194, local215, 0, 0, -1, local241, local247, local298, local528, Static134.method2497(local828, local565), Static134.method2497(local854, local565), Static134.method2497(local891, local565), Static134.method2497(local899, local565), 0, 0, 0, 0, local861, 0);
							} else {
								@Pc(949) byte local949 = Static119.aByteArrayArrayArray9[local149][local194][local215];
								@Pc(959) int local959 = Static25.aByteArrayArrayArray2[local149][local194][local215] + 1;
								@Pc(965) Class66 local965 = method3126(local237 - 1);
								@Pc(968) int local968 = local965.anInt2938;
								if (local968 >= 0 && !Static235.anInterface1_1.method392(local968)) {
									local968 = -1;
								}
								@Pc(987) int local987;
								@Pc(999) int local999;
								@Pc(1015) int local1015;
								@Pc(1043) int local1043;
								if (local968 >= 0) {
									local987 = -1;
									local999 = Static235.anIntArray443[Static153.method2745(96, Static235.anInterface1_1.method391(local968))];
								} else if (local965.anInt2949 == -1) {
									local999 = 0;
									local987 = -2;
								} else {
									local987 = local965.anInt2949;
									local1015 = local9 + (local987 & 0x7F);
									if (local1015 < 0) {
										local1015 = 0;
									} else if (local1015 > 127) {
										local1015 = 127;
									}
									local1043 = local1015 + (local987 & 0x380) + (local987 + local5 & 0xFC00);
									local999 = Static235.anIntArray443[Static153.method2745(96, local1043)];
								}
								if (local965.anInt2948 >= 0) {
									local1015 = local965.anInt2948;
									local1043 = (local1015 & 0x7F) + local9;
									if (local1043 < 0) {
										local1043 = 0;
									} else if (local1043 > 127) {
										local1043 = 127;
									}
									@Pc(1101) int local1101 = (local1015 + local5 & 0xFC00) + (local1015 & 0x380) + local1043;
									local999 = Static235.anIntArray443[Static153.method2745(96, local1101)];
								}
								Static254.method4106(local149, local194, local215, local959, local949, local968, local241, local247, local298, local528, Static134.method2497(local828, local565), Static134.method2497(local854, local565), Static134.method2497(local891, local565), Static134.method2497(local899, local565), Static153.method2745(local828, local987), Static153.method2745(local854, local987), Static153.method2745(local891, local987), Static153.method2745(local899, local987), local861, local999);
							}
						}
					}
				}
			}
			Static102.aByteArrayArrayArray7[local149] = null;
			Static25.aByteArrayArrayArray3[local149] = null;
			Static25.aByteArrayArrayArray2[local149] = null;
			Static119.aByteArrayArrayArray9[local149] = null;
			Static39.aByteArrayArrayArray4[local149] = null;
		}
		Static233.method3885();
		for (@Pc(1199) int local1199 = 0; local1199 < 104; local1199++) {
			for (local159 = 0; local159 < 104; local159++) {
				if ((Static145.aByteArrayArrayArray13[1][local1199][local159] & 0x2) == 2) {
					Static227.method3783(local1199, local159);
				}
			}
		}
		for (local159 = 0; local159 < 4; local159++) {
			for (local165 = 0; local165 <= 104; local165++) {
				for (local167 = 0; local167 <= 104; local167++) {
					if ((Static79.anIntArrayArrayArray7[local159][local167][local165] & 0x1) != 0) {
						for (local171 = local165; local171 > 0 && (Static79.anIntArrayArrayArray7[local159][local167][local171 - 1] & 0x1) != 0; local171--) {
						}
						local314 = local165;
						local194 = local159;
						local215 = local159;
						while (local314 < 104 && (Static79.anIntArrayArrayArray7[local159][local167][local314 + 1] & 0x1) != 0) {
							local314++;
						}
						label334: while (local194 > 0) {
							for (local229 = local171; local229 <= local314; local229++) {
								if ((Static79.anIntArrayArrayArray7[local194 - 1][local167][local229] & 0x1) == 0) {
									break label334;
								}
							}
							local194--;
						}
						label323: while (local215 < 3) {
							for (local229 = local171; local229 <= local314; local229++) {
								if ((Static79.anIntArrayArrayArray7[local215 + 1][local167][local229] & 0x1) == 0) {
									break label323;
								}
							}
							local215++;
						}
						local229 = (local215 + 1 - local194) * (local314 + 1 - local171);
						if (local229 >= 8) {
							local247 = Static38.anIntArrayArrayArray6[local194][local167][local171];
							local241 = Static38.anIntArrayArrayArray6[local215][local167][local171] - 240;
							Static191.method3230(1, local167 * 128, local167 * 128, local171 * 128, local314 * 128 + 128, local241, local247);
							for (local298 = local194; local298 <= local215; local298++) {
								for (local528 = local171; local528 <= local314; local528++) {
									Static79.anIntArrayArrayArray7[local298][local167][local528] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static79.anIntArrayArrayArray7[local159][local167][local165] & 0x2) != 0) {
						for (local171 = local167; local171 > 0 && (Static79.anIntArrayArrayArray7[local159][local171 - 1][local165] & 0x2) != 0; local171--) {
						}
						for (local314 = local167; local314 < 104 && (Static79.anIntArrayArrayArray7[local159][local314 + 1][local165] & 0x2) != 0; local314++) {
						}
						local194 = local159;
						local215 = local159;
						label388: while (local194 > 0) {
							for (local229 = local171; local229 <= local314; local229++) {
								if ((Static79.anIntArrayArrayArray7[local194 - 1][local229][local165] & 0x2) == 0) {
									break label388;
								}
							}
							local194--;
						}
						label377: while (local215 < 3) {
							for (local229 = local171; local229 <= local314; local229++) {
								if ((Static79.anIntArrayArrayArray7[local215 + 1][local229][local165] & 0x2) == 0) {
									break label377;
								}
							}
							local215++;
						}
						local229 = (local314 + 1 - local171) * (local215 + 1 - local194);
						if (local229 >= 8) {
							local241 = Static38.anIntArrayArrayArray6[local215][local171][local165] - 240;
							local247 = Static38.anIntArrayArrayArray6[local194][local171][local165];
							Static191.method3230(2, local171 * 128, local314 * 128 + 128, local165 * 128, local165 * 128, local241, local247);
							for (local298 = local194; local298 <= local215; local298++) {
								for (local528 = local171; local528 <= local314; local528++) {
									Static79.anIntArrayArrayArray7[local298][local528][local165] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static79.anIntArrayArrayArray7[local159][local167][local165] & 0x4) != 0) {
						local171 = local167;
						local314 = local167;
						for (local194 = local165; local194 > 0 && (Static79.anIntArrayArrayArray7[local159][local167][local194 - 1] & 0x4) != 0; local194--) {
						}
						for (local215 = local165; local215 < 104 && (Static79.anIntArrayArrayArray7[local159][local167][local215 + 1] & 0x4) != 0; local215++) {
						}
						label443: while (local171 > 0) {
							for (local229 = local194; local229 <= local215; local229++) {
								if ((Static79.anIntArrayArrayArray7[local159][local171 - 1][local229] & 0x4) == 0) {
									break label443;
								}
							}
							local171--;
						}
						label432: while (local314 < 104) {
							for (local229 = local194; local229 <= local215; local229++) {
								if ((Static79.anIntArrayArrayArray7[local159][local314 + 1][local229] & 0x4) == 0) {
									break label432;
								}
							}
							local314++;
						}
						if ((local314 + 1 - local171) * (local215 + 1 - local194) >= 4) {
							local229 = Static38.anIntArrayArrayArray6[local159][local171][local194];
							Static191.method3230(4, local171 * 128, local314 * 128 + 128, local194 * 128, local215 * 128 + 128, local229, local229);
							for (local237 = local171; local237 <= local314; local237++) {
								for (local241 = local194; local241 <= local215; local241++) {
									Static79.anIntArrayArrayArray7[local159][local237][local241] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
	public static void method3133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static3.method36(Static167.anInt3907, arg0 + arg2, Static150.anInt3860);
		@Pc(31) int local31 = Static3.method36(Static167.anInt3907, arg0 - arg2, Static150.anInt3860);
		Static147.method2681(Static29.anIntArrayArray10[arg3], arg1, local31, local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(88) int local88;
			@Pc(97) int local97;
			if (local12 > 0) {
				local9--;
				local56 = arg3 - local9;
				local60 = arg3 + local9;
				local12 -= local9 << 1;
				if (Static202.anInt4469 <= local60 && local56 <= Static94.anInt4237) {
					local88 = Static3.method36(Static167.anInt3907, arg0 + local7, Static150.anInt3860);
					local97 = Static3.method36(Static167.anInt3907, arg0 - local7, Static150.anInt3860);
					if (local60 <= Static94.anInt4237) {
						Static147.method2681(Static29.anIntArrayArray10[local60], arg1, local97, local88);
					}
					if (local56 >= Static202.anInt4469) {
						Static147.method2681(Static29.anIntArrayArray10[local56], arg1, local97, local88);
					}
				}
			}
			local7++;
			local60 = local7 + arg3;
			local56 = arg3 - local7;
			if (local60 >= Static202.anInt4469 && Static94.anInt4237 >= local56) {
				local88 = Static3.method36(Static167.anInt3907, local9 + arg0, Static150.anInt3860);
				local97 = Static3.method36(Static167.anInt3907, arg0 - local9, Static150.anInt3860);
				if (Static94.anInt4237 >= local60) {
					Static147.method2681(Static29.anIntArrayArray10[local60], arg1, local97, local88);
				}
				if (Static202.anInt4469 <= local56) {
					Static147.method2681(Static29.anIntArrayArray10[local56], arg1, local97, local88);
				}
			}
		}
	}
}

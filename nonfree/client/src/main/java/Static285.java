import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public static int anInt5187;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
	public static boolean aBoolean355;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Lclient!si;")
	public static final Class217 aClass217_27 = new Class217(0, 7);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I")
	public static int method3975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static146.aByteArrayArray3 == null ? 0 : Static146.aByteArrayArray3[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static120.anInt2494 = arg5;
		Static233.anInt4249 = arg4;
		Static403.anInt6869 = arg2;
		Static145.anInt2733 = arg0;
		Static75.anInt1777 = arg3;
		Static152.anInt2879 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ap;B)V")
	public static void method3979(@OriginalArg(0) Class6_Sub2_Sub1 arg0) {
		arg0.lb = false;
		@Pc(23) Class233 local23;
		if (arg0.anInt6077 != -1) {
			local23 = Static269.aClass10_1.method286(arg0.anInt6077);
			if (local23 == null || local23.anIntArray593 == null) {
				arg0.anInt6077 = -1;
				arg0.aBoolean421 = false;
			} else {
				label394: {
					arg0.anInt6129++;
					if (arg0.anInt6072 < local23.anIntArray593.length && local23.anIntArray591[arg0.anInt6072] < arg0.anInt6129) {
						arg0.anInt6129 = 1;
						arg0.anInt6088++;
						arg0.anInt6072++;
						Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, arg0.anInt6072, arg0.aByte86, local23, arg0.anInt6062, arg0.anInt6061);
					}
					if (arg0.anInt6072 >= local23.anIntArray593.length) {
						arg0.anInt6072 = 0;
						arg0.anInt6129 = 0;
						if (arg0.aBoolean421) {
							arg0.anInt6077 = arg0.method4762().method2830();
							if (arg0.anInt6077 == -1) {
								arg0.aBoolean421 = false;
								break label394;
							}
							local23 = Static269.aClass10_1.method286(arg0.anInt6077);
						}
						Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, arg0.anInt6072, arg0.aByte86, local23, arg0.anInt6062, arg0.anInt6061);
					}
					arg0.anInt6088 = arg0.anInt6072 + 1;
					if (local23.anIntArray593.length <= arg0.anInt6088) {
						arg0.anInt6088 = 0;
					}
				}
			}
		}
		@Pc(182) int local182;
		@Pc(191) Class233 local191;
		@Pc(179) Class161 local179;
		if (arg0.anInt6120 != -1 && arg0.anInt6112 <= Static175.anInt3261) {
			local179 = Static92.aClass89_1.method1918(arg0.anInt6120);
			local182 = local179.anInt4699;
			if (local182 == -1) {
				arg0.anInt6120 = -1;
			} else {
				label396: {
					local191 = Static269.aClass10_1.method286(local182);
					if (local179.aBoolean340) {
						if (local191.anInt6752 == 3) {
							if (arg0.anInt6145 > 0 && arg0.anInt6105 <= Static175.anInt3261 && Static175.anInt3261 > arg0.anInt6087) {
								arg0.anInt6120 = -1;
								break label396;
							}
						} else if (local191.anInt6752 == 1 && arg0.anInt6145 > 0 && arg0.anInt6105 <= Static175.anInt3261 && Static175.anInt3261 > arg0.anInt6087) {
							arg0.anInt6112 = Static175.anInt3261 + 1;
							break label396;
						}
					}
					if (local191 == null || local191.anIntArray593 == null) {
						arg0.anInt6120 = -1;
					} else {
						if (arg0.anInt6082 < 0) {
							arg0.anInt6082 = 0;
							Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, 0, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
						}
						arg0.anInt6135++;
						if (arg0.anInt6082 < local191.anIntArray593.length && local191.anIntArray591[arg0.anInt6082] < arg0.anInt6135) {
							arg0.anInt6082++;
							arg0.anInt6135 = 1;
							Static374.method5106(Static375.aClass6_Sub2_Sub1_Sub1_3 == arg0, arg0.anInt6082, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
						}
						if (arg0.anInt6082 >= local191.anIntArray593.length) {
							if (local179.aBoolean340) {
								arg0.anInt6126++;
								arg0.anInt6082 -= local191.anInt6743;
								if (local191.anInt6756 <= arg0.anInt6126) {
									arg0.anInt6120 = -1;
								} else if (arg0.anInt6082 >= 0 && local191.anIntArray593.length > arg0.anInt6082) {
									Static374.method5106(Static375.aClass6_Sub2_Sub1_Sub1_3 == arg0, arg0.anInt6082, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
								} else {
									arg0.anInt6120 = -1;
								}
							} else {
								arg0.anInt6120 = -1;
							}
						}
						arg0.anInt6118 = arg0.anInt6082 + 1;
						if (arg0.anInt6118 >= local191.anIntArray593.length) {
							if (local179.aBoolean340) {
								arg0.anInt6118 -= local191.anInt6743;
								if (arg0.anInt6126 + 1 >= local191.anInt6756) {
									arg0.anInt6118 = -1;
								} else if (arg0.anInt6118 < 0 || arg0.anInt6118 >= local191.anIntArray593.length) {
									arg0.anInt6118 = -1;
								}
							} else {
								arg0.anInt6118 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6084 != -1 && Static175.anInt3261 >= arg0.anInt6098) {
			local179 = Static92.aClass89_1.method1918(arg0.anInt6084);
			local182 = local179.anInt4699;
			if (local182 == -1) {
				arg0.anInt6084 = -1;
			} else {
				label399: {
					local191 = Static269.aClass10_1.method286(local182);
					if (local179.aBoolean340) {
						if (local191.anInt6752 == 3) {
							if (arg0.anInt6145 > 0 && Static175.anInt3261 >= arg0.anInt6105 && arg0.anInt6087 < Static175.anInt3261) {
								arg0.anInt6084 = -1;
								break label399;
							}
						} else if (local191.anInt6752 == 1 && arg0.anInt6145 > 0 && arg0.anInt6105 <= Static175.anInt3261 && arg0.anInt6087 < Static175.anInt3261) {
							arg0.anInt6098 = Static175.anInt3261 + 1;
							break label399;
						}
					}
					if (local191 == null || local191.anIntArray593 == null) {
						arg0.anInt6084 = -1;
					} else {
						if (arg0.anInt6124 < 0) {
							arg0.anInt6124 = 0;
							Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, 0, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
						}
						arg0.anInt6128++;
						if (arg0.anInt6124 < local191.anIntArray593.length && local191.anIntArray591[arg0.anInt6124] < arg0.anInt6128) {
							arg0.anInt6124++;
							arg0.anInt6128 = 1;
							Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, arg0.anInt6124, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
						}
						if (local191.anIntArray593.length <= arg0.anInt6124) {
							if (local179.aBoolean340) {
								arg0.anInt6070++;
								arg0.anInt6124 -= local191.anInt6743;
								if (arg0.anInt6070 >= local191.anInt6756) {
									arg0.anInt6084 = -1;
								} else if (arg0.anInt6124 >= 0 && local191.anIntArray593.length > arg0.anInt6124) {
									Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, arg0.anInt6124, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
								} else {
									arg0.anInt6084 = -1;
								}
							} else {
								arg0.anInt6084 = -1;
							}
						}
						arg0.anInt6100 = arg0.anInt6124 + 1;
						if (arg0.anInt6100 >= local191.anIntArray593.length) {
							if (local179.aBoolean340) {
								arg0.anInt6100 -= local191.anInt6743;
								if (local191.anInt6756 <= arg0.anInt6070 + 1) {
									arg0.anInt6100 = -1;
								} else if (arg0.anInt6100 < 0 || arg0.anInt6100 >= local191.anIntArray593.length) {
									arg0.anInt6100 = -1;
								}
							} else {
								arg0.anInt6100 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6068 != -1 && arg0.anInt6117 <= 1) {
			local23 = Static269.aClass10_1.method286(arg0.anInt6068);
			if (local23.anInt6752 == 3) {
				if (arg0.anInt6145 > 0 && arg0.anInt6105 <= Static175.anInt3261 && Static175.anInt3261 > arg0.anInt6087) {
					arg0.anInt6068 = -1;
				}
			} else if (local23.anInt6752 == 1 && arg0.anInt6145 > 0 && Static175.anInt3261 >= arg0.anInt6105 && arg0.anInt6087 < Static175.anInt3261) {
				arg0.anInt6117 = 2;
			}
		}
		if (arg0.anInt6068 != -1 && arg0.anInt6117 == 0) {
			local23 = Static269.aClass10_1.method286(arg0.anInt6068);
			if (local23 == null || local23.anIntArray593 == null) {
				arg0.anInt6068 = -1;
			} else {
				arg0.anInt6080++;
				if (arg0.anInt6091 < local23.anIntArray593.length && local23.anIntArray591[arg0.anInt6091] < arg0.anInt6080) {
					arg0.anInt6091++;
					arg0.anInt6080 = 1;
					Static374.method5106(Static375.aClass6_Sub2_Sub1_Sub1_3 == arg0, arg0.anInt6091, arg0.aByte86, local23, arg0.anInt6062, arg0.anInt6061);
				}
				if (arg0.anInt6091 >= local23.anIntArray593.length) {
					arg0.anInt6136++;
					arg0.anInt6091 -= local23.anInt6743;
					if (arg0.anInt6136 >= local23.anInt6756) {
						arg0.anInt6068 = -1;
					} else if (arg0.anInt6091 >= 0 && arg0.anInt6091 < local23.anIntArray593.length) {
						Static374.method5106(Static375.aClass6_Sub2_Sub1_Sub1_3 == arg0, arg0.anInt6091, arg0.aByte86, local23, arg0.anInt6062, arg0.anInt6061);
					} else {
						arg0.anInt6068 = -1;
					}
				}
				arg0.anInt6089 = arg0.anInt6091 + 1;
				if (arg0.anInt6089 >= local23.anIntArray593.length) {
					arg0.anInt6089 -= local23.anInt6743;
					if (arg0.anInt6136 + 1 >= local23.anInt6756) {
						arg0.anInt6089 = -1;
					} else if (arg0.anInt6089 < 0 || arg0.anInt6089 >= local23.anIntArray593.length) {
						arg0.anInt6089 = -1;
					}
				}
				arg0.lb = local23.aBoolean449;
			}
		}
		if (arg0.anInt6117 > 0) {
			arg0.anInt6117--;
		}
		for (@Pc(1060) int local1060 = 0; local1060 < arg0.aClass109Array3.length; local1060++) {
			@Pc(1067) Class109 local1067 = arg0.aClass109Array3[local1060];
			if (local1067 != null) {
				if (local1067.anInt2834 > 0) {
					local1067.anInt2834--;
				} else {
					local191 = Static269.aClass10_1.method286(local1067.anInt2837);
					if (local191 == null || local191.anIntArray593 == null) {
						arg0.aClass109Array3[local1060] = null;
					} else {
						local1067.anInt2835++;
						if (local1067.anInt2833 < local191.anIntArray593.length && local1067.anInt2835 > local191.anIntArray591[local1067.anInt2833]) {
							local1067.anInt2835 = 1;
							local1067.anInt2833++;
							Static374.method5106(Static375.aClass6_Sub2_Sub1_Sub1_3 == arg0, local1067.anInt2833, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
						}
						if (local191.anIntArray593.length <= local1067.anInt2833) {
							local1067.anInt2831++;
							local1067.anInt2833 -= local191.anInt6743;
							if (local191.anInt6756 <= local1067.anInt2831) {
								arg0.aClass109Array3[local1060] = null;
							} else if (local1067.anInt2833 >= 0 && local191.anIntArray593.length > local1067.anInt2833) {
								Static374.method5106(arg0 == Static375.aClass6_Sub2_Sub1_Sub1_3, local1067.anInt2833, arg0.aByte86, local191, arg0.anInt6062, arg0.anInt6061);
							} else {
								arg0.aClass109Array3[local1060] = null;
							}
						}
						local1067.anInt2836 = local1067.anInt2833 + 1;
						if (local1067.anInt2836 >= local191.anIntArray593.length) {
							local1067.anInt2836 -= local191.anInt6743;
							if (local191.anInt6756 <= local1067.anInt2831 + 1) {
								local1067.anInt2836 = -1;
							} else if (local1067.anInt2836 < 0 || local1067.anInt2836 >= local191.anIntArray593.length) {
								local1067.anInt2836 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	public static void method3980() {
		for (@Pc(1) int local1 = 0; local1 < Static340.anInt6033; local1++) {
			if (!Static417.aBooleanArray27[local1]) {
				@Pc(10) Class169 local10 = Static200.aClass169Array1[local1];
				@Pc(13) Class4_Sub8 local13 = local10.aClass4_Sub8_1;
				@Pc(16) int local16 = local10.anInt4885;
				@Pc(22) int local22 = local13.method5679() - Static40.anInt1024;
				@Pc(30) int local30 = (local22 * 2 >> Static372.anInt7558) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5676() - local22 >> Static372.anInt7558;
				@Pc(53) int local53 = local13.method5682() - local22 >> Static372.anInt7558;
				@Pc(61) int local61 = local13.method5682() + local22 >> Static372.anInt7558;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static241.anInt4414) {
					local61 = Static241.anInt4414 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray69[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static301.anInt5434) {
						local108 = Static301.anInt5434 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class6_Sub2 local141 = Static134.method1950(local16, local125, local78, vj.class);
						if (local141 != null && local141.aByte85 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte85 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray69[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray69[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray69[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray69[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static417.aBooleanArray27[local1] = true;
				Static346.aClass146Array2[local16].method3602(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!tf;[[BI)V")
	public static void method3981(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(13) int local13 = Static435.aByteArrayArray20.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg1[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static100.anIntArray134[local15] >> 8) * 64 - Static381.anInt6688;
				@Pc(45) int local45 = (Static100.anIntArray134[local15] & 0xFF) * 64 - anInt5187;
				Static10.method281();
				arg0.method5159(local34, local45, Static16.aClass30_11, Static395.aClass268Array1, local21);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt3894;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[Lclient!vd;")
	public static Class170[] aClass170Array2;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!lg;")
	public static Class102 aClass102_8;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public static int anInt3895 = -1;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
	public static int[] anIntArray296 = new int[14];

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public static int anInt3907 = -1;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)[Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1[] method3034() {
		@Pc(8) Class8_Sub1_Sub7_Sub1[] local8 = new Class8_Sub1_Sub7_Sub1[Static288.anInt1353];
		for (@Pc(10) int local10 = 0; local10 < Static288.anInt1353; local10++) {
			@Pc(25) int local25 = Static135.anIntArray225[local10] * Static92.anIntArray130[local10];
			@Pc(28) int[] local28 = new int[local25];
			@Pc(32) byte[] local32 = Static232.aByteArrayArray15[local10];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local28[local34] = Static147.anIntArray236[local32[local34] & 0xFF];
			}
			local8[local10] = new Class8_Sub1_Sub7_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local10], Static225.anIntArray345[local10], Static92.anIntArray130[local10], Static135.anIntArray225[local10], local28);
		}
		Static147.method2386();
		return local8;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V")
	public static void method3038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 - arg1;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 == 0) {
			if (local6 != 0) {
				Static141.method2238(arg2, arg0, arg1, arg4);
			}
		} else if (local6 == 0) {
			Static206.method3268(arg1, arg4, arg3, arg0);
		} else {
			if (local6 < 0) {
				local6 = -local6;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(66) boolean local66 = local15 < local6;
			@Pc(79) int local79;
			@Pc(85) int local85;
			if (local66) {
				local79 = arg4;
				arg4 = arg1;
				arg1 = local79;
				local85 = arg3;
				arg3 = arg2;
				arg2 = local85;
			}
			if (arg3 < arg4) {
				local85 = arg1;
				arg1 = arg2;
				arg2 = local85;
				local79 = arg4;
				arg4 = arg3;
				arg3 = local79;
			}
			local79 = arg1;
			local85 = arg3 - arg4;
			@Pc(116) int local116 = arg2 - arg1;
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(129) int local129 = -(local85 >> 1);
			@Pc(136) int local136 = arg1 >= arg2 ? -1 : 1;
			@Pc(140) int local140;
			if (local66) {
				for (local140 = arg4; local140 <= arg3; local140++) {
					local129 += local116;
					Static181.anIntArrayArray19[local140][local79] = arg0;
					if (local129 > 0) {
						local129 -= local85;
						local79 += local136;
					}
				}
			} else {
				for (local140 = arg4; local140 <= arg3; local140++) {
					local129 += local116;
					Static181.anIntArrayArray19[local79][local140] = arg0;
					if (local129 > 0) {
						local129 -= local85;
						local79 += local136;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!pf;IIZ)V")
	public static void method3042(@OriginalArg(0) Class36_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt4107 == arg2 && arg2 != -1) {
			@Pc(23) Class76 local23 = Static115.method1855(arg2);
			@Pc(26) int local26 = local23.anInt2220;
			if (local26 == 1) {
				arg0.anInt4085 = 0;
				arg0.anInt4113 = arg1;
				arg0.anInt4120 = 1;
				arg0.anInt4103 = 0;
				arg0.anInt4132 = 0;
				Static184.method2846(arg0 == Static21.aClass36_Sub3_Sub1_1, arg0.anInt4103, arg0.anInt4117, local23, arg0.anInt4118);
			}
			if (local26 == 2) {
				arg0.anInt4085 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4107 == -1 || Static115.method1855(arg2).anInt2224 >= Static115.method1855(arg0.anInt4107).anInt2224) {
			arg0.anInt4113 = arg1;
			arg0.anInt4085 = 0;
			arg0.anInt4103 = 0;
			arg0.anInt4132 = 0;
			arg0.anInt4120 = 1;
			arg0.anInt4107 = arg2;
			arg0.anInt4090 = arg0.anInt4093;
			if (arg0.anInt4107 != -1) {
				Static184.method2846(Static21.aClass36_Sub3_Sub1_1 == arg0, arg0.anInt4103, arg0.anInt4117, Static115.method1855(arg0.anInt4107), arg0.anInt4118);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIZII[BII[Lclient!mf;)[I")
	public static int[] method3044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class112[] arg9) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg5 & 0x7) * 8;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (!arg4) {
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (local29 = 0; local29 < 8; local29++) {
					local44 = Static51.method807(local29 & 0x7, arg8, local22 & 0x7) + arg2;
					@Pc(56) int local56 = Static114.method1848(local22 & 0x7, arg8, local29 & 0x7) + arg3;
					if (local44 > 0 && local44 < 103 && local56 > 0 && local56 < 103) {
						arg9[arg0].anIntArrayArray14[local44][local56] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(100) byte local100;
		if (arg4) {
			local100 = 1;
		} else {
			local100 = 4;
		}
		local29 = (arg1 & 0xFFFFFFF8) << 3;
		@Pc(115) Class8_Sub2 local115 = new Class8_Sub2(arg7);
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		local44 = (arg5 & 0xFFFFFFF8) << 3;
		if (arg8 == 1) {
			local119 = 1;
		} else if (arg8 == 2) {
			local117 = 1;
			local119 = 1;
		} else if (arg8 == 3) {
			local117 = 1;
		}
		@Pc(164) int local164;
		@Pc(226) int local226;
		@Pc(238) int local238;
		@Pc(268) int local268;
		@Pc(277) int local277;
		@Pc(306) int local306;
		@Pc(297) int local297;
		for (@Pc(152) int local152 = 0; local152 < local100; local152++) {
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				for (local164 = 0; local164 < 64; local164++) {
					if (arg6 != local152 || local11 > local157 || local11 + 8 < local157 || local164 < local17 || local17 + 8 < local164) {
						Static123.method1974(local115, false, 0, -1, 0, -1, 0, 0, 0, 0, arg4);
					} else if (local11 + 8 == local157 || local17 + 8 == local164) {
						if (arg8 == 0) {
							local226 = arg2 + local157 - local11;
							local238 = local164 + arg3 - local17;
						} else if (arg8 == 1) {
							local238 = arg3 + local11 + 8 - local157;
							local226 = arg2 + local164 - local17;
						} else if (arg8 == 2) {
							local226 = local11 + arg2 + 8 - local157;
							local238 = local17 + arg3 + 8 - local164;
						} else {
							local238 = arg3 + local157 - local11;
							local226 = arg2 + local17 + 8 - local164;
						}
						Static123.method1974(local115, true, local164 + local44, local238, arg0, local226, 0, 0, local157 + local29, 0, arg4);
					} else {
						local226 = arg2 + Static51.method807(local164 & 0x7, arg8, local157 & 0x7);
						local238 = Static114.method1848(local157 & 0x7, arg8, local164 & 0x7) + arg3;
						Static123.method1974(local115, false, local164 + local44, local238, arg0, local226, local119, arg8, local157 + local29, local117, arg4);
						if (local157 == 63 || local164 == 63) {
							local268 = local157 == 63 ? 64 : local157;
							local277 = local164 == 63 ? 64 : local164;
							if (arg8 == 0) {
								local306 = local268 + arg2 - local11;
								local297 = arg3 + local277 - local17;
							} else if (arg8 == 1) {
								local297 = local11 + arg3 + 8 - local268;
								local306 = arg2 + local277 - local17;
							} else if (arg8 == 2) {
								local306 = arg2 + local11 + 8 - local268;
								local297 = arg3 + local17 + 8 - local277;
							} else {
								local297 = arg3 + local268 - local11;
								local306 = arg2 + local17 + 8 - local277;
							}
							if (local306 >= 0 && local306 < 104 && local297 >= 0 && local297 < 104) {
								Static195.anIntArrayArrayArray7[arg0][local306][local297] = Static195.anIntArrayArrayArray7[arg0][local226 + local117][local238 + local119];
							}
						}
					}
				}
			}
		}
		@Pc(527) boolean local527 = false;
		@Pc(750) int local750;
		@Pc(796) int local796;
		while (local115.aByteArray24.length > local115.anInt2955) {
			local164 = local115.method2334();
			if (local164 == 128) {
				Static44.anIntArray72[0] = local115.method2375();
				local527 = true;
				Static44.anIntArray72[1] = local115.method2360();
				Static44.anIntArray72[2] = local115.method2360();
				Static44.anIntArray72[3] = local115.method2360();
				Static44.anIntArray72[4] = local115.method2375();
			} else {
				if (local164 != 129) {
					local115.anInt2955--;
					break;
				}
				for (local226 = 0; local226 < 4; local226++) {
					@Pc(598) byte local598 = local115.method2374();
					if (local598 == 0) {
						if (local226 <= arg6) {
							local277 = arg2 + 7;
							local306 = arg3;
							if (arg3 < 0) {
								local306 = 0;
							} else if (arg3 >= 104) {
								local306 = 104;
							}
							local268 = arg2;
							if (arg2 < 0) {
								local268 = 0;
							} else if (arg2 >= 104) {
								local268 = 104;
							}
							local297 = arg3 + 7;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 >= 104) {
								local297 = 104;
							}
							if (local277 < 0) {
								local277 = 0;
							} else if (local277 >= 104) {
								local277 = 104;
							}
							while (local268 < local277) {
								while (local306 < local297) {
									Static212.aByteArrayArrayArray12[arg0][local268][local306] = 0;
									local306++;
								}
								local268++;
							}
						}
					} else if (local598 == 1) {
						for (local268 = 0; local268 < 64; local268 += 4) {
							for (local277 = 0; local277 < 64; local277 += 4) {
								@Pc(730) byte local730 = local115.method2374();
								if (arg6 >= local226) {
									for (local297 = local268; local297 < local268 + 4; local297++) {
										for (local750 = local277; local750 < local277 + 4; local750++) {
											if (local11 <= local297 && local11 + 8 > local297 && local17 <= local750 && local17 < local17 + 8) {
												local796 = Static51.method807(local750 & 0x7, arg8, local297 & 0x7) + arg2;
												@Pc(808) int local808 = Static114.method1848(local297 & 0x7, arg8, local750 & 0x7) + arg3;
												if (local796 >= 0 && local796 < 104 && local808 >= 0 && local808 < 104) {
													Static212.aByteArrayArrayArray12[arg0][local796][local808] = local730;
												}
											}
										}
									}
								}
							}
						}
					} else if (local598 != 2) {
					}
				}
			}
		}
		if (Static116.aBoolean188 && !arg4) {
			@Pc(858) Class24 local858 = null;
			while (true) {
				while (local115.aByteArray24.length > local115.anInt2955) {
					local226 = local115.method2334();
					if (local226 == 0) {
						local858 = new Class24(local115);
					} else if (local226 == 1) {
						local238 = local115.method2334();
						if (local238 > 0) {
							for (local268 = 0; local268 < local238; local268++) {
								@Pc(905) Class28 local905 = new Class28(local115);
								if (local905.anInt867 == 31) {
									@Pc(915) Class113 local915 = Static169.method2665(local115.method2375());
									local905.method622(local915.anInt3253, local915.anInt3252, local915.anInt3247, local915.anInt3246);
								}
								local297 = local905.anInt877 >> 7;
								local306 = local905.anInt863 >> 7;
								if (local905.anInt870 == arg6 && local306 >= local11 && local11 + 8 > local306 && local297 >= local17 && local297 < local17 + 8) {
									local750 = Static297.method4295(local905.anInt877 & 0x3FF, arg8, local905.anInt863 & 0x3FF) + (arg2 << 7);
									local796 = Static23.method412(arg8, local905.anInt863 & 0x3FF, local905.anInt877 & 0x3FF) + (arg3 << 7);
									local905.anInt863 = local750;
									local306 = local905.anInt863 >> 7;
									local905.anInt877 = local796;
									local297 = local905.anInt877 >> 7;
									if (local306 >= 0 && local297 >= 0 && local306 < 104 && local297 < 104) {
										local905.aBoolean61 = (Static170.aByteArrayArrayArray9[1][local306][local297] & 0x2) != 0;
										local905.anInt862 = Static195.anIntArrayArrayArray7[local905.anInt870][local306][local297] - local905.anInt862;
										Static186.method2921(local905);
									}
								}
							}
						}
					} else if (local226 == 2) {
						if (local858 == null) {
							local858 = new Class24();
						}
						local858.method534(local115);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local858 == null) {
					local858 = new Class24();
				}
				Static169.aClass24ArrayArray1[arg2 >> 3][arg3 >> 3] = local858;
				break;
			}
		}
		local226 = arg3 + 7;
		local164 = arg2 + 7;
		for (local238 = arg2; local238 < local164; local238++) {
			for (local268 = arg3; local268 < local226; local268++) {
				Static212.aByteArrayArrayArray12[arg0][local238][local268] = 0;
			}
		}
		return local527 ? Static44.anIntArray72 : null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!pk;ILclient!pk;)V")
	public static void method3046(@OriginalArg(0) Class132 arg0, @OriginalArg(2) Class132 arg1) {
		Static249.aClass132_87 = arg1;
		Static232.aClass132_80 = arg0;
		Static13.anInt357 = Static249.aClass132_87.method3189(3);
	}
}

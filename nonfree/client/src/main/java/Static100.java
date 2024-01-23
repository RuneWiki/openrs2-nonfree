import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Lclient!nc;")
	public static Class112 aClass112_44;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	public static int anInt1978 = 0;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Lclient!jo;")
	public static Class86 aClass86_2 = new Class86();

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
	public static int anInt1982 = 100;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "[Lclient!qe;")
	public static Class13_Sub5_Sub1[] aClass13_Sub5_Sub1Array1 = new Class13_Sub5_Sub1[2048];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIII)I")
	public static int method1656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg1 & 0xF;
		@Pc(36) int local36 = local15 >= 4 ? (local15 == 12 || local15 == 14 ? arg3 : arg0) : arg2;
		@Pc(43) int local43 = local15 < 8 ? arg3 : arg2;
		return ((local15 & 0x2) == 0 ? local36 : -local36) + ((local15 & 0x1) == 0 ? local43 : -local43);
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I")
	public static int method1657() {
		return Static159.aClass172_28.method4348();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZILclient!ve;ZZI)Lclient!wb;")
	public static Class4_Sub2_Sub4 method1658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class175 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(5) Class29 local5 = Static187.method3128(arg0);
		if (arg7 > 1 && local5.anIntArray110 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg7 >= local5.anIntArray111[local19] && local5.anIntArray111[local19] != 0) {
					local17 = local5.anIntArray110[local19];
				}
			}
			if (local17 != -1) {
				local5 = Static187.method3128(local17);
			}
		}
		@Pc(64) Class13_Sub1_Sub1 local64 = local5.method927(arg4);
		if (local64 == null) {
			return null;
		}
		@Pc(72) Class4_Sub2_Sub4_Sub2 local72 = null;
		if (local5.anInt994 != -1) {
			local72 = (Class4_Sub2_Sub4_Sub2) method1658(local5.anInt1030, 0, 1, true, arg4, false, true, 10);
			if (local72 == null) {
				return null;
			}
		} else if (local5.anInt1009 != -1) {
			local72 = (Class4_Sub2_Sub4_Sub2) method1658(local5.anInt1041, arg1, arg2, true, arg4, false, false, arg7);
			if (local72 == null) {
				return null;
			}
		}
		@Pc(119) int[] local119 = Static258.anIntArray399;
		@Pc(121) int local121 = Static258.anInt5064;
		@Pc(123) int local123 = Static258.anInt5069;
		@Pc(126) int[] local126 = new int[4];
		Static258.method4019(local126);
		@Pc(134) Class4_Sub2_Sub4_Sub2 local134 = new Class4_Sub2_Sub4_Sub2(36, 32);
		Static258.method4016(local134.anIntArray409, 36, 32);
		Static283.method4415();
		Static283.method4416(16, 16);
		Static283.aBoolean379 = false;
		@Pc(148) int local148 = local5.anInt997;
		if (arg6) {
			local148 = (int) ((double) local148 * 1.5D);
		} else if (arg2 == 2) {
			local148 = (int) ((double) local148 * 1.04D);
		}
		@Pc(176) int local176 = Class174.anIntArray444[local5.anInt991] * local148 >> 16;
		@Pc(185) int local185 = local148 * Class174.anIntArray443[local5.anInt991] >> 16;
		local64.method2743(local5.anInt1024, local5.anInt1002, local5.anInt991, local5.anInt1020, local176 + local5.anInt1008 - local64.method4266() / 2, local185 - -local5.anInt1008, (long) -1);
		if (arg2 >= 1) {
			local134.method4160(1);
			if (arg2 >= 2) {
				local134.method4160(16777215);
			}
			Static258.method4016(local134.anIntArray409, 36, 32);
		}
		if (arg1 != 0) {
			local134.method4153(arg1);
		}
		if (local5.anInt994 != -1) {
			local72.method4142(0, 0);
		} else if (local5.anInt1009 != -1) {
			Static258.method4016(local72.anIntArray409, 36, 32);
			local134.method4142(0, 0);
			local134 = local72;
		}
		if (arg5 && (local5.anInt1033 == 1 || arg7 != 1) && arg7 != -1) {
			Static153.aClass4_Sub2_Sub9_Sub2_2.method4105(Static194.method3179(arg7), 0, 9, 16776960, 1);
		}
		Static258.method4016(local119, local123, local121);
		Static258.method4015(local126);
		Static283.method4415();
		Static283.aBoolean379 = true;
		return Static251.aBoolean330 && !arg3 ? new Class4_Sub2_Sub4_Sub1(local134) : local134;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[Lclient!ao;IIIZ[BII)[I")
	public static int[] method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(15) byte local15;
		if (arg6) {
			local15 = 1;
		} else {
			local15 = 4;
		}
		@Pc(25) int local25 = (arg4 & 0x7) * 8;
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (!arg6) {
			for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
				for (local43 = 0; local43 < 8; local43++) {
					local59 = arg0 + Static20.method2332(arg2, local43 & 0x7, local36 & 0x7);
					@Pc(71) int local71 = Static234.method3638(arg2, local36 & 0x7, local43 & 0x7) + arg9;
					if (local59 > 0 && local59 < 103 && local71 > 0 && local71 < 103) {
						arg3[arg1].anIntArrayArray1[local59][local71] &= 0xFFDFFFFF;
					}
				}
			}
		}
		local43 = (arg4 & 0x1FFFFFF8) << 3;
		local59 = (arg8 & 0xFFFFFFF8) << 3;
		@Pc(126) Class4_Sub24 local126 = new Class4_Sub24(arg7);
		@Pc(128) byte local128 = 0;
		@Pc(130) byte local130 = 0;
		if (arg2 == 1) {
			local128 = 1;
		} else if (arg2 == 2) {
			local128 = 1;
			local130 = 1;
		} else if (arg2 == 3) {
			local130 = 1;
		}
		@Pc(168) int local168;
		@Pc(249) int local249;
		@Pc(241) int local241;
		@Pc(389) int local389;
		@Pc(396) int local396;
		@Pc(422) int local422;
		@Pc(413) int local413;
		for (@Pc(154) int local154 = 0; local154 < local15; local154++) {
			for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
				for (local168 = 0; local168 < 64; local168++) {
					if (local154 != arg5 || local163 < local25 || local163 > local25 + 8 || local168 < local11 || local168 > local11 + 8) {
						Static133.method2173(false, local126, 0, 0, arg6, 0, 0, 0, 0, -1, -1);
					} else if (local25 + 8 == local163 || local168 == local11 + 8) {
						if (arg2 == 0) {
							local241 = local168 + arg9 - local11;
							local249 = local163 + arg0 - local25;
						} else if (arg2 == 1) {
							local249 = local168 + arg0 - local11;
							local241 = arg9 + local25 + 8 - local163;
						} else if (arg2 == 2) {
							local249 = local25 + arg0 + 8 - local163;
							local241 = local11 + arg9 + 8 - local168;
						} else {
							local249 = local11 + arg0 + 8 - local168;
							local241 = local163 + arg9 - local25;
						}
						Static133.method2173(true, local126, 0, local163 + local43, arg6, local168 + local59, 0, 0, arg1, local241, local249);
					} else {
						local249 = Static20.method2332(arg2, local168 & 0x7, local163 & 0x7) + arg0;
						local241 = Static234.method3638(arg2, local163 & 0x7, local168 & 0x7) + arg9;
						Static133.method2173(false, local126, local128, local43 + local163, arg6, local59 + local168, arg2, local130, arg1, local241, local249);
						if (local163 == 63 || local168 == 63) {
							local389 = local163 == 63 ? 64 : local163;
							local396 = local168 == 63 ? 64 : local168;
							if (arg2 == 0) {
								local413 = arg9 + local396 - local11;
								local422 = local389 + arg0 - local25;
							} else if (arg2 == 1) {
								local422 = arg0 + local396 - local11;
								local413 = local25 + arg9 + 8 - local389;
							} else if (arg2 == 2) {
								local422 = local25 + arg0 + 8 - local389;
								local413 = local11 + arg9 + 8 - local396;
							} else {
								local413 = local389 + arg9 - local25;
								local422 = arg0 + local11 + 8 - local396;
							}
							if (local422 >= 0 && local422 < 104 && local413 >= 0 && local413 < 104) {
								Static154.anIntArrayArrayArray5[arg1][local422][local413] = Static154.anIntArrayArrayArray5[arg1][local249 + local130][local241 + local128];
							}
						}
					}
				}
			}
		}
		@Pc(525) boolean local525 = false;
		@Pc(693) int local693;
		@Pc(735) int local735;
		while (local126.aByteArray47.length > local126.anInt3822) {
			local168 = local126.method3110();
			if (local168 == 128) {
				Static288.anIntArray455[0] = local126.method3085();
				local525 = true;
				Static288.anIntArray455[1] = local126.method3072();
				Static288.anIntArray455[2] = local126.method3072();
				Static288.anIntArray455[3] = local126.method3072();
				Static288.anIntArray455[4] = local126.method3085();
			} else {
				if (local168 != 129) {
					local126.anInt3822--;
					break;
				}
				for (local249 = 0; local249 < 4; local249++) {
					@Pc(560) byte local560 = local126.method3069();
					if (local560 == 0) {
						if (arg5 >= local249) {
							local389 = arg0;
							local396 = arg0 + 7;
							if (arg0 < 0) {
								local389 = 0;
							} else if (arg0 >= 104) {
								local389 = 104;
							}
							if (local396 < 0) {
								local396 = 0;
							} else if (local396 >= 104) {
								local396 = 104;
							}
							local422 = arg9;
							if (arg9 < 0) {
								local422 = 0;
							} else if (arg9 >= 104) {
								local422 = 104;
							}
							local413 = arg9 + 7;
							if (local413 < 0) {
								local413 = 0;
							} else if (local413 >= 104) {
								local413 = 104;
							}
							while (local396 > local389) {
								while (local413 > local422) {
									Static98.aByteArrayArrayArray6[arg1][local389][local422] = 0;
									local422++;
								}
								local389++;
							}
						}
					} else if (local560 == 1) {
						for (local389 = 0; local389 < 64; local389 += 4) {
							for (local396 = 0; local396 < 64; local396 += 4) {
								@Pc(681) byte local681 = local126.method3069();
								if (arg5 >= local249) {
									for (local413 = local389; local413 < local389 + 4; local413++) {
										for (local693 = local396; local693 < local396 + 4; local693++) {
											if (local25 <= local413 && local413 < local25 + 8 && local11 <= local693 && local11 < local11 + 8) {
												local735 = arg0 + Static20.method2332(arg2, local693 & 0x7, local413 & 0x7);
												@Pc(749) int local749 = Static234.method3638(arg2, local413 & 0x7, local693 & 0x7) + arg9;
												if (local735 >= 0 && local735 < 104 && local749 >= 0 && local749 < 104) {
													Static98.aByteArrayArrayArray6[arg1][local735][local749] = local681;
												}
											}
										}
									}
								}
							}
						}
					} else if (local560 == 2) {
					}
				}
			}
		}
		if (Static251.aBoolean330 && !arg6) {
			@Pc(847) Class54 local847 = null;
			while (true) {
				while (local126.aByteArray47.length > local126.anInt3822) {
					local249 = local126.method3110();
					if (local249 == 0) {
						local847 = new Class54(local126);
					} else if (local249 == 1) {
						local241 = local126.method3110();
						if (local241 > 0) {
							for (local389 = 0; local389 < local241; local389++) {
								@Pc(916) Class137 local916 = new Class137(local126);
								if (local916.anInt4214 == 31) {
									@Pc(928) Class124 local928 = Static76.method1289(local126.method3085());
									local916.method3400(local928.anInt3943, local928.anInt3950, local928.anInt3949, local928.anInt3948);
								}
								local413 = local916.anInt4215 >> 7;
								local422 = local916.anInt4206 >> 7;
								if (arg5 == local916.anInt4211 && local25 <= local422 && local422 < local25 + 8 && local11 <= local413 && local11 + 8 > local413) {
									local693 = (arg0 << 7) + Static167.method2664(arg2, local916.anInt4206 & 0x3FF, local916.anInt4215 & 0x3FF);
									local735 = Static265.method4191(arg2, local916.anInt4206 & 0x3FF, local916.anInt4215 & 0x3FF) + (arg9 << 7);
									local916.anInt4215 = local735;
									local413 = local916.anInt4215 >> 7;
									local916.anInt4206 = local693;
									local422 = local916.anInt4206 >> 7;
									if (local422 >= 0 && local413 >= 0 && local422 < 104 && local413 < 104) {
										local916.aBoolean261 = (Static27.aByteArrayArrayArray2[1][local422][local413] & 0x2) != 0;
										local916.anInt4217 = Static154.anIntArrayArrayArray5[local916.anInt4211][local422][local413] - local916.anInt4217;
										Static142.method2286(local916);
									}
								}
							}
						}
					} else if (local249 == 2) {
						if (local847 == null) {
							local847 = new Class54();
						}
						local847.method1413(local126);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local847 == null) {
					local847 = new Class54();
				}
				Static41.aClass54ArrayArray1[arg0 >> 3][arg9 >> 3] = local847;
				break;
			}
		}
		local168 = arg0 + 7;
		local249 = arg9 + 7;
		for (local241 = arg0; local241 < local168; local241++) {
			for (local389 = arg9; local389 < local249; local389++) {
				Static98.aByteArrayArrayArray6[arg1][local241][local389] = 0;
			}
		}
		return local525 ? Static288.anIntArray455 : null;
	}
}

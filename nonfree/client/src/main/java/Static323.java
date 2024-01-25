import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "[Lclient!ii;")
	public static Class23_Sub1[] aClass23_Sub1Array1;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_144 = new Class81(14, 6);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!it;ZI)V")
	public static void method4619(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) Class12 local11 = arg0.method5131();
		if (arg0.anInt6524 == 0) {
			Static150.anInt2861 = 0;
			arg0.anInt6526 = 0;
			Static279.anInt5105 = -1;
			return;
		}
		if (arg0.anInt6469 != -1 && arg0.anInt6517 == 0) {
			@Pc(36) Class46 local36 = Static9.aClass194_1.method4371(arg0.anInt6469);
			if (arg0.anInt6525 > 0 && local36.anInt1765 == 0) {
				Static279.anInt5105 = -1;
				arg0.anInt6526++;
				Static150.anInt2861 = 0;
				return;
			}
			if (arg0.anInt6525 <= 0 && local36.anInt1772 == 0) {
				arg0.anInt6526++;
				Static279.anInt5105 = -1;
				Static150.anInt2861 = 0;
				return;
			}
		}
		@Pc(110) Class46 local110;
		@Pc(97) Class77 local97;
		if (arg0.anInt6449 != -1 && arg0.anInt6488 <= Static164.anInt3206) {
			local97 = Static137.aClass16_2.method251(arg0.anInt6449);
			if (local97.aBoolean191 && local97.anInt2238 != -1) {
				local110 = Static9.aClass194_1.method4371(local97.anInt2238);
				if (arg0.anInt6525 > 0 && local110.anInt1765 == 0) {
					Static279.anInt5105 = -1;
					Static150.anInt2861 = 0;
					arg0.anInt6526++;
					return;
				}
				if (arg0.anInt6525 <= 0 && local110.anInt1772 == 0) {
					Static150.anInt2861 = 0;
					Static279.anInt5105 = -1;
					arg0.anInt6526++;
					return;
				}
			}
		}
		if (arg0.anInt6449 != -1 && arg0.anInt6488 <= Static164.anInt3206) {
			local97 = Static137.aClass16_2.method251(arg0.anInt6449);
			if (local97.aBoolean191 && local97.anInt2238 != -1) {
				local110 = Static9.aClass194_1.method4371(local97.anInt2238);
				if (arg0.anInt6525 > 0 && local110.anInt1765 == 0) {
					arg0.anInt6526++;
					Static279.anInt5105 = -1;
					Static150.anInt2861 = 0;
					return;
				}
				if (arg0.anInt6525 <= 0 && local110.anInt1772 == 0) {
					arg0.anInt6526++;
					Static279.anInt5105 = -1;
					Static150.anInt2861 = 0;
					return;
				}
			}
		}
		@Pc(212) int local212 = arg0.anInt7117;
		@Pc(215) int local215 = arg0.anInt7111;
		@Pc(231) int local231 = arg0.anIntArray436[arg0.anInt6524 - 1] * 128 + arg0.method5118() * 64;
		@Pc(247) int local247 = arg0.anIntArray437[arg0.anInt6524 - 1] * 128 + arg0.method5118() * 64;
		if (local212 >= local231) {
			if (local212 <= local231) {
				if (local215 < local247) {
					arg0.method5124(8192);
				} else if (local247 < local215) {
					arg0.method5124(0);
				}
			} else if (local215 < local247) {
				arg0.method5124(6144);
			} else if (local247 < local215) {
				arg0.method5124(2048);
			} else {
				arg0.method5124(4096);
			}
		} else if (local215 < local247) {
			arg0.method5124(10240);
		} else if (local247 >= local215) {
			arg0.method5124(12288);
		} else {
			arg0.method5124(14336);
		}
		@Pc(341) byte local341 = arg0.aByteArray181[arg0.anInt6524 - 1];
		if (!arg1 && (local231 - local212 > 256 || local231 - local212 < -256 || local247 - local215 > 256 || local247 - local215 < -256)) {
			arg0.anInt7111 = local247;
			arg0.anInt7117 = local231;
			arg0.method5122(arg0.anInt6497);
			Static150.anInt2861 = 0;
			arg0.anInt6524--;
			Static279.anInt5105 = -1;
			if (arg0.anInt6525 > 0) {
				arg0.anInt6525--;
			}
			return;
		}
		@Pc(401) int local401 = 4;
		@Pc(403) boolean local403 = true;
		if (arg0 instanceof Class4_Sub2_Sub2_Sub2) {
			local403 = ((Class4_Sub2_Sub2_Sub2) arg0).aClass215_1.aBoolean534;
		}
		@Pc(420) int local420;
		if (local403) {
			local420 = arg0.anInt6497 - arg0.aClass157_7.anInt4471;
			if (local420 != 0 && arg0.anInt6481 == -1 && arg0.anInt6462 != 0) {
				local401 = 2;
			}
			if (!arg1 && arg0.anInt6524 > 2) {
				local401 = 6;
			}
			if (!arg1 && arg0.anInt6524 > 3) {
				local401 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt6524 > 1) {
				local401 = 6;
			}
			if (!arg1 && arg0.anInt6524 > 2) {
				local401 = 8;
			}
		}
		if (arg0.anInt6526 > 0 && arg0.anInt6524 > 1) {
			local401 = 8;
			arg0.anInt6526--;
		}
		if (local341 == 2) {
			local401 <<= 0x1;
		} else if (local341 == 0) {
			local401 >>= 0x1;
		}
		Static150.anInt2861 = 0;
		if (local11.anInt349 != -1) {
			local401 <<= 0x7;
			if (arg0.anInt6524 == 1) {
				local420 = arg0.anInt6523 * arg0.anInt6523;
				@Pc(595) int local595 = (local231 >= arg0.anInt7117 ? local231 - arg0.anInt7117 : arg0.anInt7117 + -local231) << 7;
				@Pc(612) int local612 = (arg0.anInt7111 > local247 ? arg0.anInt7111 - local247 : local247 - arg0.anInt7111) << 7;
				@Pc(619) int local619 = local595 <= local612 ? local612 : local595;
				@Pc(626) int local626 = local619 * 2 * local11.anInt349;
				if (local420 > local626) {
					arg0.anInt6523 /= 2;
				} else if (local619 < local420 / 2) {
					arg0.anInt6523 -= local11.anInt349;
					if (arg0.anInt6523 < 0) {
						arg0.anInt6523 = 0;
					}
				} else if (local401 > arg0.anInt6523) {
					arg0.anInt6523 += local11.anInt349;
					if (local401 < arg0.anInt6523) {
						arg0.anInt6523 = local401;
					}
				}
			} else if (local401 > arg0.anInt6523) {
				arg0.anInt6523 += local11.anInt349;
				if (local401 < arg0.anInt6523) {
					arg0.anInt6523 = local401;
				}
			} else if (arg0.anInt6523 > 0) {
				arg0.anInt6523 -= local11.anInt349;
				if (arg0.anInt6523 < 0) {
					arg0.anInt6523 = 0;
				}
			}
			local401 = arg0.anInt6523 >> 7;
			if (local401 < 1) {
				local401 = 1;
			}
		}
		if (local231 > local212) {
			Static150.anInt2861 |= 0x4;
			arg0.anInt7117 += local401;
			if (arg0.anInt7117 > local231) {
				arg0.anInt7117 = local231;
			}
		} else if (local212 > local231) {
			arg0.anInt7117 -= local401;
			Static150.anInt2861 |= 0x8;
			if (local231 > arg0.anInt7117) {
				arg0.anInt7117 = local231;
			}
		}
		if (local215 < local247) {
			Static150.anInt2861 |= 0x1;
			arg0.anInt7111 += local401;
			if (arg0.anInt7111 > local247) {
				arg0.anInt7111 = local247;
			}
		} else if (local215 > local247) {
			arg0.anInt7111 -= local401;
			Static150.anInt2861 |= 0x2;
			if (local247 > arg0.anInt7111) {
				arg0.anInt7111 = local247;
			}
		}
		if (local401 >= 8) {
			Static279.anInt5105 = 2;
		} else {
			Static279.anInt5105 = local341;
		}
		if (arg0.anInt7117 == local231 && local247 == arg0.anInt7111) {
			if (arg0.anInt6525 > 0) {
				arg0.anInt6525--;
			}
			arg0.anInt6524--;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!it;I)V")
	public static void method4620(@OriginalArg(0) Class4_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6463 - Static164.anInt3206;
		@Pc(20) int local20 = arg0.anInt6496 * 128 + arg0.method5118() * 64;
		@Pc(32) int local32 = arg0.anInt6498 * 128 + arg0.method5118() * 64;
		arg0.anInt7111 += (local32 - arg0.anInt7111) / local8;
		arg0.anInt6526 = 0;
		arg0.anInt7117 += (local20 - arg0.anInt7117) / local8;
		if (arg0.anInt6500 == 0) {
			arg0.method5124(8192);
		}
		if (arg0.anInt6500 == 1) {
			arg0.method5124(12288);
		}
		if (arg0.anInt6500 == 2) {
			arg0.method5124(0);
		}
		if (arg0.anInt6500 == 3) {
			arg0.method5124(4096);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!qa;Lclient!eq;III)V")
	public static void method4621(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class113 local12;
		if (arg3 < Static86.anInt2009) {
			local12 = Static176.aClass113ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass4_Sub3_1 != null && local12.aClass4_Sub3_1.method5891()) {
				arg1.method5892(0, arg0, local12.aClass4_Sub3_1, Static284.anInt5177, 0, true);
			}
		}
		if (arg4 < Static86.anInt2009) {
			local12 = Static176.aClass113ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass4_Sub3_1 != null && local12.aClass4_Sub3_1.method5891()) {
				arg1.method5892(0, arg0, local12.aClass4_Sub3_1, 0, Static284.anInt5177, true);
			}
		}
		if (arg3 < Static86.anInt2009 && arg4 < Static360.anInt6340) {
			local12 = Static176.aClass113ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass4_Sub3_1 != null && local12.aClass4_Sub3_1.method5891()) {
				arg1.method5892(0, arg0, local12.aClass4_Sub3_1, Static284.anInt5177, Static284.anInt5177, true);
			}
		}
		if (arg3 < Static86.anInt2009 && arg4 > 0) {
			local12 = Static176.aClass113ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass4_Sub3_1 != null && local12.aClass4_Sub3_1.method5891()) {
				arg1.method5892(0, arg0, local12.aClass4_Sub3_1, Static284.anInt5177, -Static284.anInt5177, true);
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIBIIIIILclient!qa;)V")
	public static void method4624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class26 arg7) {
		@Pc(11) Interface9 local11 = (Interface9) Static334.method4742(arg6, arg3, arg5);
		@Pc(22) Class250 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (local11 != null) {
			local22 = Static406.aClass150_3.method3508(local11.method5901());
			local28 = local11.method5902() & 0x3;
			local32 = local11.method5904();
			if (local22.anInt7168 == -1) {
				local39 = arg4;
				if (local22.anInt7186 > 0) {
					local39 = arg2;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg7.method2277(arg0, local39, 4, arg1);
					} else if (local28 == 1) {
						arg7.method2237(local39, 4, arg0, arg1);
					} else if (local28 == 2) {
						arg7.method2277(arg0, local39, 4, arg1 + 3);
					} else if (local28 == 3) {
						arg7.method2237(local39, 4, arg0 + 3, arg1);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg7.method2245(1, arg1, arg0, 1, local39);
					} else if (local28 == 1) {
						arg7.method2245(1, arg1 + 3, arg0, 1, local39);
					} else if (local28 == 2) {
						arg7.method2245(1, arg1 + 3, arg0 + 3, 1, local39);
					} else if (local28 == 3) {
						arg7.method2245(1, arg1, arg0 + 3, 1, local39);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg7.method2237(local39, 4, arg0, arg1);
					} else if (local28 == 1) {
						arg7.method2277(arg0, local39, 4, arg1 + 3);
					} else if (local28 == 2) {
						arg7.method2237(local39, 4, arg0 + 3, arg1);
					} else if (local28 == 3) {
						arg7.method2277(arg0, local39, 4, arg1);
					}
				}
			} else {
				Static236.method3589(arg0, arg7, arg1, local22, local28);
			}
		}
		local11 = (Interface9) Static80.method1405(arg6, arg3, arg5, np.class);
		if (local11 != null) {
			local22 = Static406.aClass150_3.method3508(local11.method5901());
			local28 = local11.method5902() & 0x3;
			local32 = local11.method5904();
			if (local22.anInt7168 != -1) {
				Static236.method3589(arg0, arg7, arg1, local22, local28);
			} else if (local32 == 9) {
				local39 = -1118482;
				if (local22.anInt7186 > 0) {
					local39 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg7.method2266(arg0 + 3, local39, arg1, arg0, arg1 + 3);
				} else {
					arg7.method2266(arg0, local39, arg1, arg0 + 3, arg1 + 3);
				}
			}
		}
		local11 = (Interface9) Static325.method4667(arg6, arg3, arg5);
		if (local11 == null) {
			return;
		}
		local22 = Static406.aClass150_3.method3508(local11.method5901());
		local28 = local11.method5902() & 0x3;
		if (local22.anInt7168 != -1) {
			Static236.method3589(arg0, arg7, arg1, local22, local28);
			return;
		}
	}
}

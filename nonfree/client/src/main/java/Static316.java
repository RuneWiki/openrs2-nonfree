import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_268 = new Class272(66, 6);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!r;BLclient!er;)I")
	public static int method7574(@OriginalArg(0) Class43 arg0, @OriginalArg(2) Class83 arg1) {
		if (arg1.anInt2791 != -1) {
			return arg1.anInt2791;
		}
		if (arg1.anInt2794 != -1) {
			@Pc(28) Class224 local28 = arg0.anInterface8_12.method6560(arg1.anInt2794);
			if (!local28.aBoolean493) {
				return local28.aShort76;
			}
		}
		return arg1.anInt2798;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLclient!pl;B)V")
	public static void method7579(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg1) {
		@Pc(11) Class267 local11 = arg1.method5573();
		if (arg1.anInt6468 == 0) {
			arg1.anInt6467 = 0;
			Static203.anInt4110 = 0;
			Static582.anInt9300 = -1;
			return;
		}
		if (arg1.anInt6453 != -1 && arg1.anInt6438 == 0) {
			@Pc(49) Class17 local49 = Static330.aClass279_2.method6216(arg1.anInt6453);
			if (arg1.anInt6469 > 0 && local49.anInt565 == 0) {
				Static582.anInt9300 = -1;
				arg1.anInt6467++;
				Static203.anInt4110 = 0;
				return;
			}
			if (arg1.anInt6469 <= 0 && local49.anInt560 == 0) {
				Static582.anInt9300 = -1;
				arg1.anInt6467++;
				Static203.anInt4110 = 0;
				return;
			}
		}
		@Pc(114) Class17 local114;
		@Pc(101) Class175 local101;
		if (arg1.anInt6424 != -1 && arg1.anInt6464 <= Static305.anInt5560) {
			local101 = Static547.aClass248_2.method5708(arg1.anInt6424);
			if (local101.aBoolean386 && local101.anInt4956 != -1) {
				local114 = Static330.aClass279_2.method6216(local101.anInt4956);
				if (arg1.anInt6469 > 0 && local114.anInt565 == 0) {
					arg1.anInt6467++;
					Static203.anInt4110 = 0;
					Static582.anInt9300 = -1;
					return;
				}
				if (arg1.anInt6469 <= 0 && local114.anInt560 == 0) {
					arg1.anInt6467++;
					Static582.anInt9300 = -1;
					Static203.anInt4110 = 0;
					return;
				}
			}
		}
		if (arg1.anInt6424 != -1 && arg1.anInt6464 <= Static305.anInt5560) {
			local101 = Static547.aClass248_2.method5708(arg1.anInt6424);
			if (local101.aBoolean386 && local101.anInt4956 != -1) {
				local114 = Static330.aClass279_2.method6216(local101.anInt4956);
				if (arg1.anInt6469 > 0 && local114.anInt565 == 0) {
					Static582.anInt9300 = -1;
					arg1.anInt6467++;
					Static203.anInt4110 = 0;
					return;
				}
				if (arg1.anInt6469 <= 0 && local114.anInt560 == 0) {
					Static582.anInt9300 = -1;
					arg1.anInt6467++;
					Static203.anInt4110 = 0;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt8975;
		@Pc(222) int local222 = arg1.anInt8980;
		@Pc(239) int local239 = arg1.anIntArray518[arg1.anInt6468 - 1] * 512 + arg1.method5569() * 256;
		@Pc(255) int local255 = arg1.anIntArray517[arg1.anInt6468 - 1] * 512 + arg1.method5569() * 256;
		if (local219 >= local239) {
			if (local219 <= local239) {
				if (local222 < local255) {
					arg1.method5557(8192);
				} else if (local255 < local222) {
					arg1.method5557(0);
				}
			} else if (local222 < local255) {
				arg1.method5557(6144);
			} else if (local255 < local222) {
				arg1.method5557(2048);
			} else {
				arg1.method5557(4096);
			}
		} else if (local255 > local222) {
			arg1.method5557(10240);
		} else if (local222 <= local255) {
			arg1.method5557(12288);
		} else {
			arg1.method5557(14336);
		}
		@Pc(345) byte local345 = arg1.aByteArray84[arg1.anInt6468 - 1];
		if (!arg0 && (local239 - local219 > 1024 || local239 - local219 < -1024 || local255 - local222 > 1024 || local255 - local222 < -1024)) {
			arg1.anInt8975 = local239;
			arg1.anInt8980 = local255;
			arg1.method5559(arg1.anInt6415, false);
			Static582.anInt9300 = -1;
			arg1.anInt6468--;
			if (arg1.anInt6469 > 0) {
				arg1.anInt6469--;
			}
			Static203.anInt4110 = 0;
			return;
		}
		@Pc(415) int local415 = 16;
		@Pc(417) boolean local417 = true;
		if (arg1 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
			local417 = ((Class9_Sub1_Sub1_Sub2_Sub1) arg1).aClass294_1.aBoolean598;
		}
		@Pc(434) int local434;
		if (local417) {
			local434 = arg1.anInt6415 - arg1.aClass147_7.anInt4314;
			if (local434 != 0 && arg1.anInt6463 == -1 && arg1.anInt6383 != 0) {
				local415 = 8;
			}
			if (!arg0 && arg1.anInt6468 > 2) {
				local415 = 24;
			}
			if (!arg0 && arg1.anInt6468 > 3) {
				local415 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt6468 > 1) {
				local415 = 24;
			}
			if (!arg0 && arg1.anInt6468 > 2) {
				local415 = 32;
			}
		}
		if (arg1.anInt6467 > 0 && arg1.anInt6468 > 1) {
			arg1.anInt6467--;
			local415 = 32;
		}
		if (local345 == 2) {
			local415 <<= 0x1;
		} else if (local345 == 0) {
			local415 >>= 0x1;
		}
		if (local11.anInt7042 != -1) {
			local415 <<= 0x9;
			if (arg1.anInt6468 == 1) {
				local434 = arg1.anInt6470 * arg1.anInt6470;
				@Pc(559) int local559 = (local239 >= arg1.anInt8975 ? local239 - arg1.anInt8975 : -local239 + arg1.anInt8975) << 9;
				@Pc(581) int local581 = (arg1.anInt8980 > local255 ? arg1.anInt8980 - local255 : local255 + -arg1.anInt8980) << 9;
				@Pc(592) int local592 = local581 < local559 ? local559 : local581;
				@Pc(599) int local599 = local592 * 2 * local11.anInt7042;
				if (local599 < local434) {
					arg1.anInt6470 /= 2;
				} else if (local592 < local434 / 2) {
					arg1.anInt6470 -= local11.anInt7042;
					if (arg1.anInt6470 < 0) {
						arg1.anInt6470 = 0;
					}
				} else if (local415 > arg1.anInt6470) {
					arg1.anInt6470 += local11.anInt7042;
					if (arg1.anInt6470 > local415) {
						arg1.anInt6470 = local415;
					}
				}
			} else if (local415 > arg1.anInt6470) {
				arg1.anInt6470 += local11.anInt7042;
				if (local415 < arg1.anInt6470) {
					arg1.anInt6470 = local415;
				}
			} else if (arg1.anInt6470 > 0) {
				arg1.anInt6470 -= local11.anInt7042;
				if (arg1.anInt6470 < 0) {
					arg1.anInt6470 = 0;
				}
			}
			local415 = arg1.anInt6470 >> 9;
			if (local415 < 1) {
				local415 = 1;
			}
		}
		Static203.anInt4110 = 0;
		if (local239 == local219 && local222 == local255) {
			Static582.anInt9300 = -1;
		} else {
			if (local239 > local219) {
				arg1.anInt8975 += local415;
				Static203.anInt4110 |= 0x4;
				if (local239 < arg1.anInt8975) {
					arg1.anInt8975 = local239;
				}
			} else if (local219 > local239) {
				arg1.anInt8975 -= local415;
				Static203.anInt4110 |= 0x8;
				if (local239 > arg1.anInt8975) {
					arg1.anInt8975 = local239;
				}
			}
			if (local415 < 32) {
				Static582.anInt9300 = local345;
			} else {
				Static582.anInt9300 = 2;
			}
			if (local255 > local222) {
				Static203.anInt4110 |= 0x1;
				arg1.anInt8980 += local415;
				if (arg1.anInt8980 > local255) {
					arg1.anInt8980 = local255;
				}
			} else if (local222 > local255) {
				Static203.anInt4110 |= 0x2;
				arg1.anInt8980 -= local415;
				if (local255 > arg1.anInt8980) {
					arg1.anInt8980 = local255;
				}
			}
		}
		if (arg1.anInt8975 == local239 && arg1.anInt8980 == local255) {
			if (arg1.anInt6469 > 0) {
				arg1.anInt6469--;
			}
			arg1.anInt6468--;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!lk;I)Ljava/lang/String;")
	public static String method7580(@OriginalArg(1) Class203 arg0, @OriginalArg(2) int arg1) {
		if (!Static69.method1651(arg0).method570(arg1) && arg0.anObjectArray29 == null) {
			return null;
		} else if (arg0.aStringArray33 == null || arg0.aStringArray33.length <= arg1 || arg0.aStringArray33[arg1] == null || arg0.aStringArray33[arg1].trim().length() == 0) {
			return Static393.aBoolean543 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray33[arg1];
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)Z")
	public static boolean method7582(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}

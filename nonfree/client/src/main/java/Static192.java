import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
	public static int anInt3358 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!pe;ZI)V")
	public static void method2915(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) Class269 local11 = arg0.method1025();
		if (arg0.anInt1280 == 0) {
			arg0.anInt1279 = 0;
			Static36.anInt576 = -1;
			Static308.anInt7114 = 0;
			return;
		}
		if (arg0.anInt1277 != -1 && arg0.anInt1271 == 0) {
			@Pc(39) Class362 local39 = Static435.aClass298_1.method7034(arg0.anInt1277);
			if (arg0.anInt1281 > 0 && local39.anInt9999 == 0) {
				Static308.anInt7114 = 0;
				Static36.anInt576 = -1;
				arg0.anInt1279++;
				return;
			}
			if (arg0.anInt1281 <= 0 && local39.anInt10011 == 0) {
				Static308.anInt7114 = 0;
				arg0.anInt1279++;
				Static36.anInt576 = -1;
				return;
			}
		}
		@Pc(111) Class362 local111;
		@Pc(97) Class82 local97;
		if (arg0.anInt1197 != -1 && arg0.anInt1255 <= Static631.anInt10493) {
			local97 = Static52.aClass10_1.method211(arg0.anInt1197);
			if (local97.aBoolean157 && local97.anInt2052 != -1) {
				local111 = Static435.aClass298_1.method7034(local97.anInt2052);
				if (arg0.anInt1281 > 0 && local111.anInt9999 == 0) {
					Static308.anInt7114 = 0;
					arg0.anInt1279++;
					Static36.anInt576 = -1;
					return;
				}
				if (arg0.anInt1281 <= 0 && local111.anInt10011 == 0) {
					Static36.anInt576 = -1;
					Static308.anInt7114 = 0;
					arg0.anInt1279++;
					return;
				}
			}
		}
		if (arg0.anInt1197 != -1 && arg0.anInt1255 <= Static631.anInt10493) {
			local97 = Static52.aClass10_1.method211(arg0.anInt1197);
			if (local97.aBoolean157 && local97.anInt2052 != -1) {
				local111 = Static435.aClass298_1.method7034(local97.anInt2052);
				if (arg0.anInt1281 > 0 && local111.anInt9999 == 0) {
					Static36.anInt576 = -1;
					arg0.anInt1279++;
					Static308.anInt7114 = 0;
					return;
				}
				if (arg0.anInt1281 <= 0 && local111.anInt10011 == 0) {
					arg0.anInt1279++;
					Static308.anInt7114 = 0;
					Static36.anInt576 = -1;
					return;
				}
			}
		}
		@Pc(224) int local224 = arg0.anInt10231;
		@Pc(227) int local227 = arg0.anInt10229;
		@Pc(245) int local245 = arg0.anIntArray94[arg0.anInt1280 - 1] * 512 + arg0.method1018() * 256;
		@Pc(262) int local262 = arg0.anIntArray95[arg0.anInt1280 - 1] * 512 + arg0.method1018() * 256;
		if (local245 > local224) {
			if (local262 > local227) {
				arg0.method1036(10240);
			} else if (local262 >= local227) {
				arg0.method1036(12288);
			} else {
				arg0.method1036(14336);
			}
		} else if (local245 < local224) {
			if (local227 < local262) {
				arg0.method1036(6144);
			} else if (local227 > local262) {
				arg0.method1036(2048);
			} else {
				arg0.method1036(4096);
			}
		} else if (local227 < local262) {
			arg0.method1036(8192);
		} else if (local262 < local227) {
			arg0.method1036(0);
		}
		@Pc(370) byte local370 = arg0.aByteArray17[arg0.anInt1280 - 1];
		if (!arg1 && (local245 - local224 > 1024 || local245 - local224 < -1024 || local262 - local227 > 1024 || local262 - local227 < -1024)) {
			arg0.anInt10231 = local245;
			arg0.anInt10229 = local262;
			arg0.method1024(false, arg0.anInt1248);
			Static308.anInt7114 = 0;
			if (arg0.anInt1281 > 0) {
				arg0.anInt1281--;
			}
			Static36.anInt576 = -1;
			arg0.anInt1280--;
			return;
		}
		@Pc(439) int local439 = 16;
		@Pc(441) boolean local441 = true;
		if (arg0 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
			local441 = ((Class4_Sub2_Sub1_Sub1_Sub2) arg0).aClass225_1.aBoolean410;
		}
		@Pc(479) int local479;
		if (local441) {
			local479 = arg0.anInt1248 - arg0.aClass107_7.anInt2613;
			if (local479 != 0 && arg0.anInt1272 == -1 && arg0.anInt1207 != 0) {
				local439 = 8;
			}
			if (!arg1 && arg0.anInt1280 > 2) {
				local439 = 24;
			}
			if (!arg1 && arg0.anInt1280 > 3) {
				local439 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt1280 > 1) {
				local439 = 24;
			}
			if (!arg1 && arg0.anInt1280 > 2) {
				local439 = 32;
			}
		}
		if (arg0.anInt1279 > 0 && arg0.anInt1280 > 1) {
			local439 = 32;
			arg0.anInt1279--;
		}
		if (local370 == 2) {
			local439 <<= 0x1;
		} else if (local370 == 0) {
			local439 >>= 0x1;
		}
		Static308.anInt7114 = 0;
		if (local11.anInt7252 != -1) {
			local439 <<= 0x9;
			if (arg0.anInt1280 == 1) {
				local479 = arg0.anInt1278 * arg0.anInt1278;
				@Pc(624) int local624 = (arg0.anInt10231 <= local245 ? local245 - arg0.anInt10231 : arg0.anInt10231 - local245) << 9;
				@Pc(641) int local641 = (local262 < arg0.anInt10229 ? arg0.anInt10229 - local262 : local262 - arg0.anInt10229) << 9;
				@Pc(652) int local652 = local624 <= local641 ? local641 : local624;
				@Pc(659) int local659 = local652 * 2 * local11.anInt7252;
				if (local659 < local479) {
					arg0.anInt1278 /= 2;
				} else if (local652 < local479 / 2) {
					arg0.anInt1278 -= local11.anInt7252;
					if (arg0.anInt1278 < 0) {
						arg0.anInt1278 = 0;
					}
				} else if (local439 > arg0.anInt1278) {
					arg0.anInt1278 += local11.anInt7252;
					if (local439 < arg0.anInt1278) {
						arg0.anInt1278 = local439;
					}
				}
			} else if (arg0.anInt1278 < local439) {
				arg0.anInt1278 += local11.anInt7252;
				if (local439 < arg0.anInt1278) {
					arg0.anInt1278 = local439;
				}
			} else if (arg0.anInt1278 > 0) {
				arg0.anInt1278 -= local11.anInt7252;
				if (arg0.anInt1278 < 0) {
					arg0.anInt1278 = 0;
				}
			}
			local439 = arg0.anInt1278 >> 9;
			if (local439 < 1) {
				local439 = 1;
			}
		}
		if (local245 == local224 && local227 == local262) {
			Static36.anInt576 = -1;
		} else {
			if (local224 < local245) {
				arg0.anInt10231 += local439;
				Static308.anInt7114 |= 0x4;
				if (local245 < arg0.anInt10231) {
					arg0.anInt10231 = local245;
				}
			} else if (local245 < local224) {
				arg0.anInt10231 -= local439;
				Static308.anInt7114 |= 0x8;
				if (local245 > arg0.anInt10231) {
					arg0.anInt10231 = local245;
				}
			}
			if (local227 < local262) {
				arg0.anInt10229 += local439;
				Static308.anInt7114 |= 0x1;
				if (local262 < arg0.anInt10229) {
					arg0.anInt10229 = local262;
				}
			} else if (local262 < local227) {
				Static308.anInt7114 |= 0x2;
				arg0.anInt10229 -= local439;
				if (arg0.anInt10229 < local262) {
					arg0.anInt10229 = local262;
				}
			}
			if (local439 >= 32) {
				Static36.anInt576 = 2;
			} else {
				Static36.anInt576 = local370;
			}
		}
		if (arg0.anInt10231 != local245 || local262 != arg0.anInt10229) {
			return;
		}
		arg0.anInt1280--;
		if (arg0.anInt1281 > 0) {
			arg0.anInt1281--;
			return;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2916(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(2, arg0);
		local8.method8958();
		local8.aString106 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static493.method7228(arg0, arg1) | (arg1 & 0x70000) != 0 || Static40.method5453(arg1, arg0);
	}
}

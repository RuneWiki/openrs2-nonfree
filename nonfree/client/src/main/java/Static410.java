import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Lclient!q;")
	public static Class8 aClass8_6;

	@OriginalMember(owner = "client!pu", name = "E", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray53;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
	public static int anInt7784;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array17;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
	public static int anInt7776 = -1;

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "Lclient!oe;")
	public static Class244 aClass244_54 = new Class244();

	@OriginalMember(owner = "client!pu", name = "H", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZLclient!jn;II)V")
	public static void method6484(@OriginalArg(0) int arg0, @OriginalArg(3) Class176 arg1, @OriginalArg(4) int arg2) {
		Static16.method213(arg1, 0L, arg2, arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZLclient!ec;I)V")
	public static void method6486(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub4_Sub2_Sub1 arg1) {
		@Pc(9) Class316 local9 = arg1.method6921();
		if (arg1.anInt8447 == 0) {
			Static398.anInt7614 = 0;
			Static105.anInt2402 = -1;
			arg1.anInt8448 = 0;
			return;
		}
		if (arg1.anInt8412 != -1 && arg1.anInt8378 == 0) {
			@Pc(39) Class365 local39 = Static61.aClass48_1.method1016(arg1.anInt8412);
			if (arg1.anInt8445 > 0 && local39.anInt10219 == 0) {
				Static105.anInt2402 = -1;
				arg1.anInt8448++;
				Static398.anInt7614 = 0;
				return;
			}
			if (arg1.anInt8445 <= 0 && local39.anInt10226 == 0) {
				Static398.anInt7614 = 0;
				Static105.anInt2402 = -1;
				arg1.anInt8448++;
				return;
			}
		}
		@Pc(108) Class365 local108;
		@Pc(94) Class200 local94;
		if (arg1.anInt8403 != -1 && arg1.anInt8429 <= Static106.anInt2418) {
			local94 = Static569.aClass213_2.method5291(arg1.anInt8403);
			if (local94.aBoolean441 && local94.anInt5925 != -1) {
				local108 = Static61.aClass48_1.method1016(local94.anInt5925);
				if (arg1.anInt8445 > 0 && local108.anInt10219 == 0) {
					Static105.anInt2402 = -1;
					arg1.anInt8448++;
					Static398.anInt7614 = 0;
					return;
				}
				if (arg1.anInt8445 <= 0 && local108.anInt10226 == 0) {
					Static105.anInt2402 = -1;
					Static398.anInt7614 = 0;
					arg1.anInt8448++;
					return;
				}
			}
		}
		if (arg1.anInt8403 != -1 && Static106.anInt2418 >= arg1.anInt8429) {
			local94 = Static569.aClass213_2.method5291(arg1.anInt8403);
			if (local94.aBoolean441 && local94.anInt5925 != -1) {
				local108 = Static61.aClass48_1.method1016(local94.anInt5925);
				if (arg1.anInt8445 > 0 && local108.anInt10219 == 0) {
					Static105.anInt2402 = -1;
					arg1.anInt8448++;
					Static398.anInt7614 = 0;
					return;
				}
				if (arg1.anInt8445 <= 0 && local108.anInt10226 == 0) {
					Static105.anInt2402 = -1;
					Static398.anInt7614 = 0;
					arg1.anInt8448++;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt9934;
		@Pc(222) int local222 = arg1.anInt9935;
		@Pc(243) int local243 = arg1.anIntArray463[arg1.anInt8447 - 1] * 512 + arg1.method6925() * 256;
		@Pc(260) int local260 = arg1.anIntArray462[arg1.anInt8447 - 1] * 512 + arg1.method6925() * 256;
		if (local243 > local219) {
			if (local222 < local260) {
				arg1.method6936(10240);
			} else if (local222 <= local260) {
				arg1.method6936(12288);
			} else {
				arg1.method6936(14336);
			}
		} else if (local219 > local243) {
			if (local222 < local260) {
				arg1.method6936(6144);
			} else if (local222 <= local260) {
				arg1.method6936(4096);
			} else {
				arg1.method6936(2048);
			}
		} else if (local260 > local222) {
			arg1.method6936(8192);
		} else if (local260 < local222) {
			arg1.method6936(0);
		}
		@Pc(366) byte local366 = arg1.aByteArray94[arg1.anInt8447 - 1];
		if (!arg0 && (local243 - local219 > 1024 || local243 - local219 < -1024 || local260 - local222 > 1024 || local260 - local222 < -1024)) {
			arg1.anInt9934 = local243;
			arg1.anInt9935 = local260;
			arg1.method6934(false, arg1.anInt8364);
			if (arg1.anInt8445 > 0) {
				arg1.anInt8445--;
			}
			arg1.anInt8447--;
			Static105.anInt2402 = -1;
			Static398.anInt7614 = 0;
			return;
		}
		@Pc(428) int local428 = 16;
		@Pc(430) boolean local430 = true;
		if (arg1 instanceof Class1_Sub4_Sub2_Sub1_Sub1) {
			local430 = ((Class1_Sub4_Sub2_Sub1_Sub1) arg1).aClass283_1.aBoolean579;
		}
		@Pc(448) int local448;
		if (local430) {
			local448 = arg1.anInt8364 - arg1.aClass229_7.anInt6650;
			if (local448 != 0 && arg1.anInt8405 == -1 && arg1.anInt8394 != 0) {
				local428 = 8;
			}
			if (!arg0 && arg1.anInt8447 > 2) {
				local428 = 24;
			}
			if (!arg0 && arg1.anInt8447 > 3) {
				local428 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8447 > 1) {
				local428 = 24;
			}
			if (!arg0 && arg1.anInt8447 > 2) {
				local428 = 32;
			}
		}
		if (arg1.anInt8448 > 0 && arg1.anInt8447 > 1) {
			local428 = 32;
			arg1.anInt8448--;
		}
		if (local366 == 2) {
			local428 <<= 0x1;
		} else if (local366 == 0) {
			local428 >>= 0x1;
		}
		Static398.anInt7614 = 0;
		if (local9.anInt9153 != -1) {
			local428 <<= 0x9;
			if (arg1.anInt8447 == 1) {
				local448 = arg1.anInt8446 * arg1.anInt8446;
				@Pc(615) int local615 = (local243 < arg1.anInt9934 ? arg1.anInt9934 - local243 : local243 + -arg1.anInt9934) << 9;
				@Pc(632) int local632 = (arg1.anInt9935 <= local260 ? local260 - arg1.anInt9935 : arg1.anInt9935 - local260) << 9;
				@Pc(639) int local639 = local632 < local615 ? local615 : local632;
				@Pc(646) int local646 = local9.anInt9153 * 2 * local639;
				if (local646 < local448) {
					arg1.anInt8446 /= 2;
				} else if (local639 < local448 / 2) {
					arg1.anInt8446 -= local9.anInt9153;
					if (arg1.anInt8446 < 0) {
						arg1.anInt8446 = 0;
					}
				} else if (arg1.anInt8446 < local428) {
					arg1.anInt8446 += local9.anInt9153;
					if (arg1.anInt8446 > local428) {
						arg1.anInt8446 = local428;
					}
				}
			} else if (arg1.anInt8446 < local428) {
				arg1.anInt8446 += local9.anInt9153;
				if (local428 < arg1.anInt8446) {
					arg1.anInt8446 = local428;
				}
			} else if (arg1.anInt8446 > 0) {
				arg1.anInt8446 -= local9.anInt9153;
				if (arg1.anInt8446 < 0) {
					arg1.anInt8446 = 0;
				}
			}
			local428 = arg1.anInt8446 >> 9;
			if (local428 < 1) {
				local428 = 1;
			}
		}
		if (local243 == local219 && local260 == local222) {
			Static105.anInt2402 = -1;
		} else {
			if (local219 < local243) {
				Static398.anInt7614 |= 0x4;
				arg1.anInt9934 += local428;
				if (arg1.anInt9934 > local243) {
					arg1.anInt9934 = local243;
				}
			} else if (local243 < local219) {
				Static398.anInt7614 |= 0x8;
				arg1.anInt9934 -= local428;
				if (local243 > arg1.anInt9934) {
					arg1.anInt9934 = local243;
				}
			}
			if (local260 > local222) {
				arg1.anInt9935 += local428;
				Static398.anInt7614 |= 0x1;
				if (local260 < arg1.anInt9935) {
					arg1.anInt9935 = local260;
				}
			} else if (local260 < local222) {
				arg1.anInt9935 -= local428;
				Static398.anInt7614 |= 0x2;
				if (arg1.anInt9935 < local260) {
					arg1.anInt9935 = local260;
				}
			}
			if (local428 < 32) {
				Static105.anInt2402 = local366;
			} else {
				Static105.anInt2402 = 2;
			}
		}
		if (local243 == arg1.anInt9934 && arg1.anInt9935 == local260) {
			if (arg1.anInt8445 > 0) {
				arg1.anInt8445--;
			}
			arg1.anInt8447--;
		}
	}
}

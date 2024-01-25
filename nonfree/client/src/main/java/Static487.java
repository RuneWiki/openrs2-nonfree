import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "[I")
	public static final int[] anIntArray605 = new int[14];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)I")
	public static int method6843(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(64) char local64;
			if (local17 == '\u0000') {
				local64 = arg2.charAt(local13++);
			} else {
				local64 = local17;
			}
			@Pc(77) char local77;
			if (local19 == '\u0000') {
				local77 = arg1.charAt(local15++);
			} else {
				local77 = local19;
			}
			local17 = Static166.method3817(local64);
			local19 = Static166.method3817(local77);
			local64 = Static107.method1665(local64, arg0);
			local77 = Static107.method1665(local77, arg0);
			if (local64 != local77 && Character.toUpperCase(local64) != Character.toUpperCase(local77)) {
				local64 = Character.toLowerCase(local64);
				local77 = Character.toLowerCase(local77);
				if (local77 != local64) {
					return Static278.method4181(local64, arg0) - Static278.method4181(local77, arg0);
				}
			}
		}
		@Pc(149) int local149 = Math.min(local8, local11);
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			if (arg0 == 2) {
				local13 = local8 - local151 - 1;
				local15 = local11 - local151 - 1;
			} else {
				local15 = local151;
				local13 = local151;
			}
			@Pc(180) char local180 = arg2.charAt(local13);
			@Pc(184) char local184 = arg1.charAt(local15);
			if (local180 != local184 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local180 != local184) {
					return Static278.method4181(local180, arg0) - Static278.method4181(local184, arg0);
				}
			}
		}
		@Pc(227) int local227 = local8 - local11;
		if (local227 != 0) {
			return local227;
		}
		for (@Pc(233) int local233 = 0; local233 < local149; local233++) {
			@Pc(239) char local239 = arg2.charAt(local233);
			@Pc(243) char local243 = arg1.charAt(local233);
			if (local243 != local239) {
				return Static278.method4181(local239, arg0) - Static278.method4181(local243, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZLclient!va;)V")
	public static void method6845(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15_Sub2_Sub4 arg1) {
		@Pc(9) Class154 local9 = arg1.method7131();
		if (arg1.anInt8998 == 0) {
			arg1.anInt8995 = 0;
			Static582.anInt8001 = 0;
			Static245.anInt4517 = -1;
			return;
		}
		if (arg1.anInt8932 != -1 && arg1.anInt8955 == 0) {
			@Pc(37) Class63 local37 = Static388.aClass324_2.method7265(arg1.anInt8932);
			if (arg1.anInt8997 > 0 && local37.anInt1381 == 0) {
				Static582.anInt8001 = 0;
				Static245.anInt4517 = -1;
				arg1.anInt8995++;
				return;
			}
			if (arg1.anInt8997 <= 0 && local37.anInt1384 == 0) {
				Static582.anInt8001 = 0;
				arg1.anInt8995++;
				Static245.anInt4517 = -1;
				return;
			}
		}
		@Pc(105) Class63 local105;
		@Pc(91) Class239 local91;
		if (arg1.anInt8947 != -1 && arg1.anInt8952 <= Static363.anInt6671) {
			local91 = Static475.aClass291_2.method6548(arg1.anInt8947);
			if (local91.aBoolean477 && local91.anInt6960 != -1) {
				local105 = Static388.aClass324_2.method7265(local91.anInt6960);
				if (arg1.anInt8997 > 0 && local105.anInt1381 == 0) {
					Static245.anInt4517 = -1;
					Static582.anInt8001 = 0;
					arg1.anInt8995++;
					return;
				}
				if (arg1.anInt8997 <= 0 && local105.anInt1384 == 0) {
					arg1.anInt8995++;
					Static245.anInt4517 = -1;
					Static582.anInt8001 = 0;
					return;
				}
			}
		}
		if (arg1.anInt8947 != -1 && Static363.anInt6671 >= arg1.anInt8952) {
			local91 = Static475.aClass291_2.method6548(arg1.anInt8947);
			if (local91.aBoolean477 && local91.anInt6960 != -1) {
				local105 = Static388.aClass324_2.method7265(local91.anInt6960);
				if (arg1.anInt8997 > 0 && local105.anInt1381 == 0) {
					arg1.anInt8995++;
					Static582.anInt8001 = 0;
					Static245.anInt4517 = -1;
					return;
				}
				if (arg1.anInt8997 <= 0 && local105.anInt1384 == 0) {
					Static245.anInt4517 = -1;
					Static582.anInt8001 = 0;
					arg1.anInt8995++;
					return;
				}
			}
		}
		@Pc(214) int local214 = arg1.anInt8911;
		@Pc(217) int local217 = arg1.anInt8913;
		@Pc(234) int local234 = arg1.anIntArray638[arg1.anInt8998 - 1] * 512 + arg1.method7135() * 256;
		@Pc(251) int local251 = arg1.anIntArray637[arg1.anInt8998 - 1] * 512 + arg1.method7135() * 256;
		if (local234 <= local214) {
			if (local234 >= local214) {
				if (local251 > local217) {
					arg1.method7125(8192);
				} else if (local251 < local217) {
					arg1.method7125(0);
				}
			} else if (local251 > local217) {
				arg1.method7125(6144);
			} else if (local251 >= local217) {
				arg1.method7125(4096);
			} else {
				arg1.method7125(2048);
			}
		} else if (local217 < local251) {
			arg1.method7125(10240);
		} else if (local251 < local217) {
			arg1.method7125(14336);
		} else {
			arg1.method7125(12288);
		}
		@Pc(341) byte local341 = arg1.aByteArray106[arg1.anInt8998 - 1];
		if (!arg0 && (local234 - local214 > 1024 || local234 - local214 < -1024 || local251 - local217 > 1024 || local251 - local217 < -1024)) {
			arg1.anInt8911 = local234;
			arg1.anInt8913 = local251;
			arg1.method7143(arg1.anInt8990, false);
			Static245.anInt4517 = -1;
			if (arg1.anInt8997 > 0) {
				arg1.anInt8997--;
			}
			Static582.anInt8001 = 0;
			arg1.anInt8998--;
			return;
		}
		@Pc(404) int local404 = 16;
		@Pc(406) boolean local406 = true;
		if (arg1 instanceof Class15_Sub2_Sub4_Sub1) {
			local406 = ((Class15_Sub2_Sub4_Sub1) arg1).aClass88_1.aBoolean141;
		}
		@Pc(424) int local424;
		if (local406) {
			local424 = arg1.anInt8990 - arg1.aClass218_7.anInt6583;
			if (local424 != 0 && arg1.anInt8927 == -1 && arg1.anInt8930 != 0) {
				local404 = 8;
			}
			if (!arg0 && arg1.anInt8998 > 2) {
				local404 = 24;
			}
			if (!arg0 && arg1.anInt8998 > 3) {
				local404 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8998 > 1) {
				local404 = 24;
			}
			if (!arg0 && arg1.anInt8998 > 2) {
				local404 = 32;
			}
		}
		if (arg1.anInt8995 > 0 && arg1.anInt8998 > 1) {
			arg1.anInt8995--;
			local404 = 32;
		}
		if (local341 == 2) {
			local404 <<= 0x1;
		} else if (local341 == 0) {
			local404 >>= 0x1;
		}
		if (local9.anInt4497 != -1) {
			local404 <<= 0x9;
			if (arg1.anInt8998 == 1) {
				local424 = arg1.anInt8996 * arg1.anInt8996;
				@Pc(589) int local589 = (local234 < arg1.anInt8911 ? arg1.anInt8911 - local234 : local234 - arg1.anInt8911) << 9;
				@Pc(606) int local606 = (arg1.anInt8913 <= local251 ? local251 - arg1.anInt8913 : arg1.anInt8913 - local251) << 9;
				@Pc(617) int local617 = local606 < local589 ? local589 : local606;
				@Pc(624) int local624 = local617 * local9.anInt4497 * 2;
				if (local624 < local424) {
					arg1.anInt8996 /= 2;
				} else if (local617 < local424 / 2) {
					arg1.anInt8996 -= local9.anInt4497;
					if (arg1.anInt8996 < 0) {
						arg1.anInt8996 = 0;
					}
				} else if (local404 > arg1.anInt8996) {
					arg1.anInt8996 += local9.anInt4497;
					if (local404 < arg1.anInt8996) {
						arg1.anInt8996 = local404;
					}
				}
			} else if (arg1.anInt8996 < local404) {
				arg1.anInt8996 += local9.anInt4497;
				if (local404 < arg1.anInt8996) {
					arg1.anInt8996 = local404;
				}
			} else if (arg1.anInt8996 > 0) {
				arg1.anInt8996 -= local9.anInt4497;
				if (arg1.anInt8996 < 0) {
					arg1.anInt8996 = 0;
				}
			}
			local404 = arg1.anInt8996 >> 9;
			if (local404 < 1) {
				local404 = 1;
			}
		}
		Static582.anInt8001 = 0;
		if (local234 == local214 && local251 == local217) {
			Static245.anInt4517 = -1;
		} else {
			if (local234 > local214) {
				Static582.anInt8001 |= 0x4;
				arg1.anInt8911 += local404;
				if (local234 < arg1.anInt8911) {
					arg1.anInt8911 = local234;
				}
			} else if (local214 > local234) {
				Static582.anInt8001 |= 0x8;
				arg1.anInt8911 -= local404;
				if (local234 > arg1.anInt8911) {
					arg1.anInt8911 = local234;
				}
			}
			if (local217 < local251) {
				arg1.anInt8913 += local404;
				Static582.anInt8001 |= 0x1;
				if (arg1.anInt8913 > local251) {
					arg1.anInt8913 = local251;
				}
			} else if (local217 > local251) {
				arg1.anInt8913 -= local404;
				Static582.anInt8001 |= 0x2;
				if (arg1.anInt8913 < local251) {
					arg1.anInt8913 = local251;
				}
			}
			if (local404 < 32) {
				Static245.anInt4517 = local341;
			} else {
				Static245.anInt4517 = 2;
			}
		}
		if (arg1.anInt8911 != local234 || local251 != arg1.anInt8913) {
			return;
		}
		arg1.anInt8998--;
		if (arg1.anInt8997 > 0) {
			arg1.anInt8997--;
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "Lclient!gp;")
	public static Class117 aClass117_97;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "Lclient!oh;")
	public static Class220 aClass220_8 = null;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_56 = new Class40("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
	public static int anInt3484 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZIZLclient!bo;Lclient!bo;)I")
	public static int method3062(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class35_Sub1 arg2, @OriginalArg(4) Class35_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg3.anInt990;
			local12 = arg2.anInt990;
			if (!arg1) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static71.method4225(arg2.method912().aString60, Static194.anInt3737, arg3.method912().aString60);
		} else if (arg0 == 3) {
			if (arg3.aString25.equals("-")) {
				if (arg2.aString25.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString25.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static71.method4225(arg2.aString25, Static194.anInt3737, arg3.aString25);
			}
		} else if (arg0 == 4) {
			if (arg3.method909()) {
				return arg2.method909() ? 0 : 1;
			} else if (arg2.method909()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method910()) {
				return arg2.method910() ? 0 : 1;
			} else if (arg2.method910()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method908()) {
				return arg2.method908() ? 0 : 1;
			} else if (arg2.method908()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method906()) {
				return arg2.method906() ? 0 : 1;
			} else if (arg2.method906()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg3.anInt999;
			local12 = arg2.anInt999;
			if (arg1) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg3.anInt1002 - arg2.anInt1002;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!oh;IZI)V")
	public static void method3063(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte67 == 0) {
			arg0.anInt6631 = arg0.anInt6622;
		} else if (arg0.aByte67 == 1) {
			arg0.anInt6631 = (arg2 - arg0.anInt6681) / 2 + arg0.anInt6622;
		} else if (arg0.aByte67 == 2) {
			arg0.anInt6631 = arg2 - arg0.anInt6622 - arg0.anInt6681;
		} else if (arg0.aByte67 == 3) {
			arg0.anInt6631 = arg2 * arg0.anInt6622 >> 14;
		} else if (arg0.aByte67 == 4) {
			arg0.anInt6631 = (arg2 - arg0.anInt6681) / 2 + (arg0.anInt6622 * arg2 >> 14);
		} else {
			arg0.anInt6631 = arg2 - (arg2 * arg0.anInt6622 >> 14) - arg0.anInt6681;
		}
		if (arg0.aByte65 == 0) {
			arg0.anInt6603 = arg0.anInt6676;
		} else if (arg0.aByte65 == 1) {
			arg0.anInt6603 = (arg1 - arg0.anInt6627) / 2 + arg0.anInt6676;
		} else if (arg0.aByte65 == 2) {
			arg0.anInt6603 = arg1 - arg0.anInt6676 - arg0.anInt6627;
		} else if (arg0.aByte65 == 3) {
			arg0.anInt6603 = arg1 * arg0.anInt6676 >> 14;
		} else if (arg0.aByte65 == 4) {
			arg0.anInt6603 = (arg1 - arg0.anInt6627) / 2 + (arg1 * arg0.anInt6676 >> 14);
		} else {
			arg0.anInt6603 = arg1 - (arg0.anInt6676 * arg1 >> 14) - arg0.anInt6627;
		}
		if (!Static525.aBoolean645 || Static68.method1303(arg0).anInt2112 == 0 && arg0.anInt6669 != 0) {
			return;
		}
		if (arg0.anInt6631 < 0) {
			arg0.anInt6631 = 0;
		} else if (arg2 < arg0.anInt6681 + arg0.anInt6631) {
			arg0.anInt6631 = arg2 - arg0.anInt6681;
		}
		if (arg0.anInt6603 < 0) {
			arg0.anInt6603 = 0;
		} else if (arg1 < arg0.anInt6603 + arg0.anInt6627) {
			arg0.anInt6603 = arg1 - arg0.anInt6627;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!gb;Lclient!fm;ILclient!qa;)V")
	public static void method3064(@OriginalArg(0) Class5_Sub18 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(10) Class25 local10 = arg1.method2602(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.c();
		if (local10.la() > local16) {
			local16 = local10.la();
		}
		@Pc(32) int local32 = arg0.anInt3143;
		@Pc(35) int local35 = arg0.anInt3142;
		@Pc(37) int local37 = 0;
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = 0;
		@Pc(63) int local63;
		@Pc(90) int local90;
		if (arg1.aString34 != null) {
			local37 = Static291.aClass256_6.method6122(arg1.aString34, null, null, Static395.aStringArray32);
			for (local63 = 0; local63 < local37; local63++) {
				@Pc(69) String local69 = Static395.aStringArray32[local63];
				if (local37 - 1 > local63) {
					local69 = local69.substring(0, local69.length() - 4);
				}
				local90 = Static77.aClass94_6.method2411(local69);
				if (local90 > local47) {
					local47 = local90;
				}
			}
			local49 = local37 * Static77.aClass94_6.method2409() + Static77.aClass94_6.method2408() / 2;
		}
		local63 = arg0.anInt3143 + local16 / 2;
		if (local16 + Static245.anInt7317 > local32) {
			local63 = local47 / 2 + local16 / 2 + Static245.anInt7317 + 10 + 5;
			local32 = Static245.anInt7317;
		} else if (local32 > Static245.anInt7310 - local16) {
			local32 = Static245.anInt7310 - local16;
			local63 = Static245.anInt7310 - local16 / 2 - local47 / 2 - 10 - 5;
		}
		@Pc(176) int local176 = arg0.anInt3142;
		if (local35 < local16 + Static245.anInt7318) {
			local35 = Static245.anInt7318;
			local176 = Static245.anInt7318 + local16 / 2 + 10;
		} else if (Static245.anInt7308 - local16 < local35) {
			local35 = Static245.anInt7308 - local16;
			local176 = Static245.anInt7308 - local49 - local16 / 2 - 10;
		}
		local90 = (int) (Math.atan2((double) (local32 - arg0.anInt3143), (double) (local35 - arg0.anInt3142)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6962((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local90);
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		@Pc(270) int local270 = -2;
		@Pc(272) int local272 = -2;
		if (arg1.aString34 != null) {
			local268 = local176;
			local266 = local63 - local47 / 2 - 5;
			local270 = local266 + local47 + 10;
			local272 = local176 + Static77.aClass94_6.method2409() * local37 + 3;
			if (arg1.anInt2869 != 0) {
				arg2.method7040(arg1.anInt2869, local272 - local176, local176, local266, local270 - local266);
			}
			if (arg1.anInt2889 != 0) {
				arg2.method7013(local176, local272 - local176, arg1.anInt2889, local266, local270 - local266);
			}
			for (@Pc(345) int local345 = 0; local345 < local37; local345++) {
				@Pc(351) String local351 = Static395.aStringArray32[local345];
				if (local37 - 1 > local345) {
					local351 = local351.substring(0, local351.length() - 4);
				}
				Static77.aClass94_6.method2407(arg2, local351, local63, local176, arg1.anInt2879);
				local176 += Static77.aClass94_6.method2409();
			}
		}
		if (arg1.anInt2867 == -1 && arg1.aString34 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(403) Class5_Sub36 local403 = new Class5_Sub36(arg0);
		local403.anInt6868 = local268;
		local403.anInt6871 = local16 + local32;
		local403.anInt6869 = local35 - local16;
		local403.anInt6875 = local16 + local35;
		local403.anInt6872 = local32 - local16;
		local403.anInt6870 = local266;
		local403.anInt6874 = local272;
		local403.anInt6867 = local270;
		Static357.aClass99_56.method2513(local403);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)I")
	public static int method3066(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}

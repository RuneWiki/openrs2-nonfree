import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pk", name = "v", descriptor = "Lclient!ij;")
	public static Class93 aClass93_95;

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "Lclient!fp;")
	public static Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
	public static boolean aBoolean414 = true;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIILclient!bm;IIII)Z")
	public static boolean method4431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(14) int local14 = arg3;
		@Pc(23) int local23 = arg2 - 64;
		Static107.anIntArrayArray75[64][64] = 99;
		@Pc(34) int local34 = arg3 - 64;
		Static240.anIntArrayArray76[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static85.anIntArray131[0] = arg2;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static352.anIntArray637[0] = arg3;
		@Pc(56) int[][] local56 = arg5.anIntArrayArray15;
		while (local51 != local48) {
			local14 = Static352.anIntArray637[local48];
			local7 = Static85.anIntArray131[local48];
			@Pc(72) int local72 = local14 - arg5.anInt542;
			local48 = local48 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - local23;
			@Pc(88) int local88 = local14 - local34;
			@Pc(94) int local94 = local7 - arg5.anInt543;
			if (arg9 == -4) {
				if (arg1 == local7 && local14 == arg0) {
					Static63.anInt5184 = local14;
					Static42.anInt742 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static174.method3164(local14, arg4, 1, arg1, arg8, local7, arg0, 1)) {
					Static63.anInt5184 = local14;
					Static42.anInt742 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg5.method495(local14, local7, 1, arg8, arg0, arg1, 1, arg4, arg6)) {
					Static42.anInt742 = local7;
					Static63.anInt5184 = local14;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg5.method496(arg6, local7, arg0, arg8, arg1, local14, arg4, 1)) {
					Static63.anInt5184 = local14;
					Static42.anInt742 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg5.method481(arg0, arg9, 1, arg7, arg1, local7, local14)) {
					Static42.anInt742 = local7;
					Static63.anInt5184 = local14;
					return true;
				}
			} else if (arg5.method497(arg1, 1, arg0, arg7, local7, local14, arg9)) {
				Static63.anInt5184 = local14;
				Static42.anInt742 = local7;
				return true;
			}
			@Pc(244) int local244 = Static240.anIntArrayArray76[local83][local88] + 1;
			if (local83 > 0 && Static107.anIntArrayArray75[local83 - 1][local88] == 0 && (local56[local94 - 1][local72] & 0x42240000) == 0) {
				Static85.anIntArray131[local51] = local7 - 1;
				Static352.anIntArray637[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local83 - 1][local88] = 2;
				Static240.anIntArrayArray76[local83 - 1][local88] = local244;
			}
			if (local83 < 127 && Static107.anIntArrayArray75[local83 + 1][local88] == 0 && (local56[local94 + 1][local72] & 0x60240000) == 0) {
				Static85.anIntArray131[local51] = local7 + 1;
				Static352.anIntArray637[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local83 + 1][local88] = 8;
				Static240.anIntArrayArray76[local83 + 1][local88] = local244;
			}
			if (local88 > 0 && Static107.anIntArrayArray75[local83][local88 - 1] == 0 && (local56[local94][local72 - 1] & 0x40A40000) == 0) {
				Static85.anIntArray131[local51] = local7;
				Static352.anIntArray637[local51] = local14 - 1;
				Static107.anIntArrayArray75[local83][local88 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local83][local88 - 1] = local244;
			}
			if (local88 < 127 && Static107.anIntArrayArray75[local83][local88 + 1] == 0 && (local56[local94][local72 + 1] & 0x48240000) == 0) {
				Static85.anIntArray131[local51] = local7;
				Static352.anIntArray637[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local83][local88 + 1] = 4;
				Static240.anIntArrayArray76[local83][local88 + 1] = local244;
			}
			if (local83 > 0 && local88 > 0 && Static107.anIntArrayArray75[local83 - 1][local88 - 1] == 0 && (local56[local94 - 1][local72 - 1] & 0x43A40000) == 0 && (local56[local94 - 1][local72] & 0x42240000) == 0 && (local56[local94][local72 - 1] & 0x40A40000) == 0) {
				Static85.anIntArray131[local51] = local7 - 1;
				Static352.anIntArray637[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local83 - 1][local88 - 1] = 3;
				Static240.anIntArrayArray76[local83 - 1][local88 - 1] = local244;
			}
			if (local83 < 127 && local88 > 0 && Static107.anIntArrayArray75[local83 + 1][local88 - 1] == 0 && (local56[local94 + 1][local72 - 1] & 0x60E40000) == 0 && (local56[local94 + 1][local72] & 0x60240000) == 0 && (local56[local94][local72 - 1] & 0x40A40000) == 0) {
				Static85.anIntArray131[local51] = local7 + 1;
				Static352.anIntArray637[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local83 + 1][local88 - 1] = 9;
				Static240.anIntArrayArray76[local83 + 1][local88 - 1] = local244;
			}
			if (local83 > 0 && local88 < 127 && Static107.anIntArrayArray75[local83 - 1][local88 + 1] == 0 && (local56[local94 - 1][local72 + 1] & 0x4E240000) == 0 && (local56[local94 - 1][local72] & 0x42240000) == 0 && (local56[local94][local72 + 1] & 0x48240000) == 0) {
				Static85.anIntArray131[local51] = local7 - 1;
				Static352.anIntArray637[local51] = local14 + 1;
				Static107.anIntArrayArray75[local83 - 1][local88 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static240.anIntArrayArray76[local83 - 1][local88 + 1] = local244;
			}
			if (local83 < 127 && local88 < 127 && Static107.anIntArrayArray75[local83 + 1][local88 + 1] == 0 && (local56[local94 + 1][local72 + 1] & 0x78240000) == 0 && (local56[local94 + 1][local72] & 0x60240000) == 0 && (local56[local94][local72 + 1] & 0x48240000) == 0) {
				Static85.anIntArray131[local51] = local7 + 1;
				Static352.anIntArray637[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray75[local83 + 1][local88 + 1] = 12;
				Static240.anIntArrayArray76[local83 + 1][local88 + 1] = local244;
			}
		}
		Static63.anInt5184 = local14;
		Static42.anInt742 = local7;
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)B")
	public static byte method4432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!jq;)V")
	public static void method4434(@OriginalArg(1) Class4_Sub5_Sub2 arg0) {
		@Pc(9) boolean local9 = false;
		if (Static283.anInt5563 == arg0.anInt5377 || arg0.anInt5383 == -1 || arg0.anInt5382 != 0) {
			local9 = true;
		} else {
			@Pc(32) Class89 local32 = Static162.method2849(arg0.anInt5383);
			if (local32.aBoolean185 || arg0.anInt5389 + 1 > local32.anIntArray244[arg0.anInt5365]) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(56) int local56 = arg0.anInt5377 - arg0.anInt5390;
			@Pc(62) int local62 = Static283.anInt5563 - arg0.anInt5390;
			@Pc(74) int local74 = arg0.anInt5387 * 128 + arg0.method4807() * 64;
			@Pc(86) int local86 = arg0.anInt5403 * 128 + arg0.method4807() * 64;
			@Pc(98) int local98 = arg0.anInt5391 * 128 + arg0.method4807() * 64;
			@Pc(110) int local110 = arg0.anInt5407 * 128 + arg0.method4807() * 64;
			arg0.anInt6631 = (local98 * local62 + (local56 - local62) * local74) / local56;
			arg0.anInt6632 = (local86 * (local56 - local62) + local110 * local62) / local56;
		}
		arg0.anInt5417 = 0;
		if (arg0.anInt5397 == 0) {
			arg0.method4812(8192);
		}
		if (arg0.anInt5397 == 1) {
			arg0.method4812(12288);
		}
		if (arg0.anInt5397 == 2) {
			arg0.method4812(0);
		}
		if (arg0.anInt5397 == 3) {
			arg0.method4812(4096);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ea;IILclient!ts;IIIIIII)Lclient!ts;")
	public static Class112 method4435(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class112 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) long local11 = (long) arg9;
		@Pc(17) Class112 local17 = (Class112) Static239.aClass109_48.method2857(local11);
		if (local17 == null) {
			@Pc(27) Class177 local27 = Static292.method2236(arg9, Static161.aClass93_63);
			if (local27 == null) {
				return null;
			}
			local17 = arg0.method5201(local27, 1031, Static238.anInt4785, 64, 768);
			Static239.aClass109_48.method2855(local11, local17);
		}
		local17 = local17.method4349((byte) 2, 1031, true);
		if (arg4 != 0) {
			local17.method4309(arg4);
		}
		if (arg6 != 0) {
			local17.method4352(arg6);
		}
		if (arg7 != 0) {
			local17.method4315(arg7);
		}
		if (arg5 != 0) {
			local17.method4324(0, arg5, 0);
		}
		return local17;
	}
}

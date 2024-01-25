import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public static int anInt2790;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	public static int anInt2795;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	public static int anInt2796;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "[Lclient!uga;")
	public static Class366[] aClass366Array1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B[BIIII)Z")
	public static boolean method2426(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(19) Class3_Sub28 local19 = new Class3_Sub28(arg0);
		@Pc(21) int local21 = -1;
		label54: while (true) {
			@Pc(25) int local25 = local19.method5277();
			if (local25 == 0) {
				return local7;
			}
			local21 += local25;
			@Pc(33) int local33 = 0;
			@Pc(37) boolean local37 = false;
			while (true) {
				@Pc(43) int local43;
				while (!local37) {
					local43 = local19.method5331();
					if (local43 == 0) {
						continue label54;
					}
					local33 += local43 - 1;
					@Pc(72) int local72 = local33 & 0x3F;
					@Pc(78) int local78 = local33 >> 6 & 0x3F;
					@Pc(84) int local84 = local19.method5322(-80) >> 2;
					@Pc(89) int local89 = local78 + arg2;
					@Pc(93) int local93 = local72 + arg4;
					if (local89 > 0 && local93 > 0 && local89 < arg3 - 1 && arg1 - 1 > local93) {
						@Pc(124) Class144 local124 = Static70.aClass323_1.method7792(local21);
						if (local84 != 22 || Static713.aClass3_Sub55_31.aClass15_Sub29_1.method9292() != 0 || local124.anInt4425 != 0 || local124.anInt4411 == 1 || local124.aBoolean382) {
							local37 = true;
							if (!local124.method3628()) {
								local7 = false;
								Static339.anInt5858++;
							}
						}
					}
				}
				local43 = local19.method5331();
				if (local43 == 0) {
					break;
				}
				local19.method5322(-112);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZILclient!qca;)Z")
	public static boolean method2427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19_Sub1_Sub2 arg3) {
		if (!Static177.aBoolean501 || !Static183.aBoolean267) {
			return false;
		} else if (Static195.anInt7170 < 100) {
			return false;
		} else if (Static601.method8270(arg2, arg0, arg1)) {
			@Pc(33) int local33 = arg0 << Static394.anInt7067;
			@Pc(37) int local37 = arg2 << Static394.anInt7067;
			@Pc(47) int local47 = Static639.aClass313Array2[arg1].method9095(arg2, arg0) - 1;
			@Pc(53) int local53 = arg3.method9364() + local47;
			if (arg3.aShort127 == 1) {
				if (!Static264.method3689(local33, local47, local37, local33, local37, local33, local53, local53, local37 + Static495.anInt8508)) {
					return false;
				} else if (Static264.method3689(local33, local47, local37 + Static495.anInt8508, local33, local37, local33, local53, local47, local37 + Static495.anInt8508)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 == 2) {
				if (!Static264.method3689(local33 + Static495.anInt8508, local47, local37 + Static495.anInt8508, local33, Static495.anInt8508 + local37, local33, local53, local53, local37 + Static495.anInt8508)) {
					return false;
				} else if (Static264.method3689(local33 + Static495.anInt8508, local47, local37 + Static495.anInt8508, local33, local37 + Static495.anInt8508, local33 + Static495.anInt8508, local47, local53, local37 + Static495.anInt8508)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 == 4) {
				if (!Static264.method3689(Static495.anInt8508 + local33, local47, local37, Static495.anInt8508 + local33, local37, Static495.anInt8508 + local33, local53, local53, Static495.anInt8508 + local37)) {
					return false;
				} else if (Static264.method3689(Static495.anInt8508 + local33, local47, local37 + Static495.anInt8508, local33 + Static495.anInt8508, local37, local33 + Static495.anInt8508, local53, local47, local37 + Static495.anInt8508)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 == 8) {
				if (!Static264.method3689(local33 + Static495.anInt8508, local47, local37, local33, local37, local33, local53, local53, local37)) {
					return false;
				} else if (Static264.method3689(Static495.anInt8508 + local33, local47, local37, local33, local37, Static495.anInt8508 + local33, local47, local53, local37)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 == 16) {
				if (Static506.method7239(local33, local47, local53, local37 + Static198.anInt3490, Static198.anInt3490, Static198.anInt3490)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 == 32) {
				if (Static506.method7239(Static198.anInt3490 + local33, local47, local53, local37 + Static198.anInt3490, Static198.anInt3490, Static198.anInt3490)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 == 64) {
				if (Static506.method7239(local33 + Static198.anInt3490, local47, local53, local37, Static198.anInt3490, Static198.anInt3490)) {
					Static709.anInt11219++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort127 != 128) {
				return true;
			} else if (Static506.method7239(local33, local47, local53, local37, Static198.anInt3490, Static198.anInt3490)) {
				Static709.anInt11219++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

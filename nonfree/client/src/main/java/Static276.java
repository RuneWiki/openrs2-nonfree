import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_297 = new Class159(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	public static int anInt5506 = 0;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "[I")
	public static final int[] anIntArray448 = new int[50];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIIIII)I")
	public static int method4739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static261.aClass60Array2 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(19) int local19 = arg0 >> 7;
			@Pc(23) int local23 = arg1 >> 7;
			if (arg4 < 0 || arg3 < 0 || arg4 > Static350.anInt6637 - 1 || arg3 > Static105.anInt2647 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static350.anInt6637 - 1 >= local19 && Static105.anInt2647 - 1 >= local23) {
				@Pc(83) boolean local83 = (Static2.aByteArrayArrayArray1[1][arg0 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(108) boolean local108;
				@Pc(127) boolean local127;
				if ((arg0 & 0x7F) == 0) {
					local108 = (Static2.aByteArrayArrayArray1[1][local19 - 1][arg1 >> 7] & 0x2) != 0;
					local127 = (Static2.aByteArrayArrayArray1[1][local19][arg1 >> 7] & 0x2) != 0;
					if (local108 != local127) {
						local83 = (Static2.aByteArrayArrayArray1[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local108 = (Static2.aByteArrayArrayArray1[1][arg0 >> 7][local23 - 1] & 0x2) != 0;
					local127 = (Static2.aByteArrayArrayArray1[1][arg0 >> 7][local23] & 0x2) != 0;
					if (local127 != local108) {
						local83 = (Static2.aByteArrayArrayArray1[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if (local83) {
					arg2++;
				}
				return Static261.aClass60Array2[arg2].method2270(arg0, arg1);
			} else {
				return 0;
			}
		} else {
			return Static261.aClass60Array2[arg2].method2270(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)I")
	public static int method4740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public static void method4741(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub4_Sub18 local12 = Static302.method4961(arg0, 1);
		local12.method4902();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!lf;)V")
	public static void method4742(@OriginalArg(1) Class4_Sub11 arg0) {
		if (arg0.aByteArray55.length - arg0.anInt3768 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method3440();
		if (local19 < 0 || local19 > 15) {
			return;
		}
		@Pc(30) byte local30;
		if (local19 == 15) {
			local30 = 37;
		} else if (local19 == 14) {
			local30 = 36;
		} else if (local19 == 13) {
			local30 = 35;
		} else if (local19 == 12) {
			local30 = 34;
		} else if (local19 == 11) {
			local30 = 33;
		} else if (local19 == 10) {
			local30 = 32;
		} else if (local19 == 9) {
			local30 = 31;
		} else if (local19 == 8) {
			local30 = 30;
		} else if (local19 == 7) {
			local30 = 29;
		} else if (local19 == 6) {
			local30 = 28;
		} else if (local19 == 5) {
			local30 = 28;
		} else if (local19 == 4) {
			local30 = 24;
		} else if (local19 == 3) {
			local30 = 23;
		} else if (local19 == 2) {
			local30 = 22;
		} else if (local19 == 1) {
			local30 = 23;
		} else {
			local30 = 19;
		}
		if (local30 > arg0.aByteArray55.length - arg0.anInt3768) {
			return;
		}
		Static305.anInt6786 = arg0.method3440();
		if (Static305.anInt6786 < 1) {
			Static305.anInt6786 = 1;
		} else if (Static305.anInt6786 > 4) {
			Static305.anInt6786 = 4;
		}
		Static179.method3473(arg0.method3440() == 1);
		Static158.aBoolean271 = arg0.method3440() == 1;
		Static181.aBoolean302 = arg0.method3440() == 1;
		Static166.aBoolean285 = arg0.method3440() == 1;
		Static43.anInt1146 = arg0.method3440() == 1 ? 1 : 0;
		Static292.aBoolean421 = arg0.method3440() == 1;
		Static51.aBoolean102 = arg0.method3440() == 1;
		Static241.aBoolean366 = arg0.method3440() == 1;
		Static9.anInt216 = arg0.method3440();
		if (Static9.anInt216 > 2) {
			Static9.anInt216 = 2;
		}
		if (local19 < 2) {
			Static237.aBoolean480 = arg0.method3440() == 1;
			arg0.method3440();
		} else {
			Static237.aBoolean480 = arg0.method3440() == 1;
		}
		Static284.aBoolean418 = arg0.method3440() == 1;
		Static144.aBoolean265 = arg0.method3440() == 1;
		Static333.anInt6382 = arg0.method3440();
		if (Static333.anInt6382 > 2) {
			Static333.anInt6382 = 2;
		}
		Static347.anInt6585 = Static333.anInt6382;
		Static106.aBoolean193 = arg0.method3440() == 1;
		Static292.anInt5680 = arg0.method3440();
		if (Static292.anInt5680 > 127) {
			Static292.anInt5680 = 127;
		}
		Static26.anInt577 = arg0.method3440();
		Static8.anInt192 = arg0.method3440();
		if (Static8.anInt192 > 127) {
			Static8.anInt192 = 127;
		}
		if (local19 >= 1) {
			Static184.anInt3878 = arg0.method3401();
			Static43.anInt1147 = arg0.method3401();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method3440();
		}
		@Pc(397) int local397;
		if (local19 >= 4) {
			local397 = arg0.method3440();
			if (local397 < 0 || local397 > 2) {
				local397 = 0;
			}
			if (Static286.anInt6700 < 96) {
				local397 = 0;
			}
			Static99.method2239(local397);
		}
		if (local19 >= 5) {
			Static90.anInt2474 = arg0.method3418();
		}
		local397 = 0;
		if (local19 >= 6) {
			Static309.anInt6000 = local397 = arg0.method3440();
		}
		if (Static309.anInt6000 != 1 && Static309.anInt6000 != 2) {
			Static309.anInt6000 = 2;
		}
		if (local19 >= 7) {
			Static165.aBoolean280 = arg0.method3440() == 1;
		}
		if (local19 >= 8) {
			Static24.aBoolean37 = arg0.method3440() == 1;
		}
		if (local19 >= 9) {
			Static159.anInt3440 = arg0.method3440();
		}
		if (Static159.anInt3440 < 0 || Static159.anInt3440 > Static36.method742(Static286.anInt6700)) {
			Static159.anInt3440 = 0;
		}
		if (local19 >= 10) {
			Static306.aBoolean438 = arg0.method3440() != 0;
		}
		if (local19 >= 11) {
			Static335.aBoolean468 = arg0.method3440() != 0;
		}
		if (local19 >= 12) {
			Static43.anInt1146 = arg0.method3440();
		}
		if (Static43.anInt1146 < 0 || Static43.anInt1146 > 2) {
			Static43.anInt1146 = 1;
		}
		if (local19 >= 13) {
			Static209.aBoolean333 = arg0.method3440() == 1;
		}
		if (local19 >= 14) {
			Static233.anInt4697 = arg0.method3440();
		} else if (local397 == 0) {
			Static233.anInt4697 = 2;
		} else {
			Static233.anInt4697 = 1;
		}
		if (Static233.anInt4697 < 0 || Static233.anInt4697 > 3) {
			Static233.anInt4697 = 2;
		}
		if (local19 >= 15) {
			Static348.anInt6588 = arg0.method3440();
			if (Static348.anInt6588 < 0 || Static348.anInt6588 > 4) {
				Static348.anInt6588 = Static340.anInt6520 == 1 ? 2 : 4;
			}
		}
	}
}

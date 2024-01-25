import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[128][128];

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static int anInt5112 = 0;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public static int anInt5119 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public static void method4401() {
		Static235.anIntArray526 = Static169.method2740(0.4F);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ms;I)V")
	public static void method4402(@OriginalArg(0) Class155 arg0) {
		@Pc(9) Class155 local9 = Static171.method2802(arg0);
		@Pc(18) int local18;
		@Pc(21) int local21;
		if (local9 == null) {
			local21 = Static263.anInt4662;
			local18 = Static335.anInt5875;
		} else {
			local18 = local9.anInt4170;
			local21 = local9.anInt4214;
		}
		Static202.method3377(arg0, false, local21, local18);
		Static340.method5223(local18, local21, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)Z")
	public static boolean method4406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static30.method725(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static315.anInt5584;
		@Pc(14) int local14 = arg2 << Static315.anInt5584;
		@Pc(23) int local23 = Static17.aClass33Array1[arg0].method4057(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static174.anInt6735) {
				if (!Static286.method4398(local10, local23, local14)) {
					return false;
				}
				if (!Static286.method4398(local10, local23, local14 + Static292.anInt5158)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static286.method4398(local10, local27, local14)) {
					return false;
				}
				if (!Static286.method4398(local10, local27, local14 + Static292.anInt5158)) {
					return false;
				}
			}
			if (Static286.method4398(local10, local31, local14)) {
				return Static286.method4398(local10, local31, local14 + Static292.anInt5158);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static34.anInt736) {
				if (!Static286.method4398(local10, local23, local14 + Static292.anInt5158)) {
					return false;
				}
				if (!Static286.method4398(local10 + Static292.anInt5158, local23, local14 + Static292.anInt5158)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static286.method4398(local10, local27, local14 + Static292.anInt5158)) {
					return false;
				}
				if (!Static286.method4398(local10 + Static292.anInt5158, local27, local14 + Static292.anInt5158)) {
					return false;
				}
			}
			if (Static286.method4398(local10, local31, local14 + Static292.anInt5158)) {
				return Static286.method4398(local10 + Static292.anInt5158, local31, local14 + Static292.anInt5158);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static174.anInt6735) {
				if (!Static286.method4398(local10 + Static292.anInt5158, local23, local14)) {
					return false;
				}
				if (!Static286.method4398(local10 + Static292.anInt5158, local23, local14 + Static292.anInt5158)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static286.method4398(local10 + Static292.anInt5158, local27, local14)) {
					return false;
				}
				if (!Static286.method4398(local10 + Static292.anInt5158, local27, local14 + Static292.anInt5158)) {
					return false;
				}
			}
			if (Static286.method4398(local10 + Static292.anInt5158, local31, local14)) {
				return Static286.method4398(local10 + Static292.anInt5158, local31, local14 + Static292.anInt5158);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static34.anInt736) {
				if (!Static286.method4398(local10, local23, local14)) {
					return false;
				}
				if (!Static286.method4398(local10 + Static292.anInt5158, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static286.method4398(local10, local27, local14)) {
					return false;
				}
				if (!Static286.method4398(local10 + Static292.anInt5158, local27, local14)) {
					return false;
				}
			}
			if (Static286.method4398(local10, local31, local14)) {
				return Static286.method4398(local10 + Static292.anInt5158, local31, local14);
			} else {
				return false;
			}
		} else if (!Static286.method4398(local10 + Static365.anInt2303, local35, local14 + Static365.anInt2303)) {
			return false;
		} else if (arg3 == 16) {
			return Static286.method4398(local10, local31, local14 + Static292.anInt5158);
		} else if (arg3 == 32) {
			return Static286.method4398(local10 + Static292.anInt5158, local31, local14 + Static292.anInt5158);
		} else if (arg3 == 64) {
			return Static286.method4398(local10 + Static292.anInt5158, local31, local14);
		} else if (arg3 == 128) {
			return Static286.method4398(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!qr;)V")
	public static void method4407(@OriginalArg(1) Class12_Sub1_Sub2_Sub2 arg0) {
		@Pc(16) Class2_Sub42 local16 = (Class2_Sub42) Static208.aClass214_22.method5059((long) arg0.anInt5365);
		if (local16 == null) {
			return;
		}
		if (local16.aClass2_Sub2_Sub2_2 != null) {
			Static339.aClass2_Sub2_Sub1_2.method110(local16.aClass2_Sub2_Sub2_2);
			local16.aClass2_Sub2_Sub2_2 = null;
		}
		local16.method5745();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZ)V")
	public static void method4409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			Static19.method552(Static273.aClass41_147);
		}
		if (arg2 == 1) {
			Static19.method552(Static124.aClass41_198);
		}
		Static39.aClass2_Sub13_Sub2_4.method4207(Static129.aClass149_1.method3685(82) ? 1 : 0);
		Static39.aClass2_Sub13_Sub2_4.method4190(Static133.anInt2474 + arg0);
		Static39.aClass2_Sub13_Sub2_4.method4190(arg1 + Static376.anInt6607);
		Static292.anInt5161 = arg1;
		Static204.anInt3770 = arg0;
		Static19.aBoolean29 = false;
		Static305.method2102();
	}
}

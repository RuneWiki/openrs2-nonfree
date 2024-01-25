import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	public static int anInt9555;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Lclient!la;")
	public static Class196 aClass196_120;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_14 = new Class337(13, 4);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public static void method8223(@OriginalArg(0) int arg0) {
		Static332.anIntArray382 = new int[arg0];
		Static429.anIntArray474 = new int[arg0];
		Static444.anIntArray555 = new int[arg0];
		Static576.anIntArray604 = new int[arg0];
		Static441.anIntArray484 = new int[arg0];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILclient!cs;)V")
	public static void method8226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub2_Sub1 arg3) {
		@Pc(9) Class143 local9 = arg3.method5058();
		@Pc(27) int local27 = arg3.anInt5712 - arg3.aClass63_7.anInt2110 & 0x3FFF;
		if (arg0 == -1) {
			if (local27 != 0 || arg3.anInt5771 > 25) {
				if (arg2 < 0 && local9.anInt4156 != -1) {
					arg3.aBoolean404 = false;
					arg3.anInt5743 = local9.anInt4156;
				} else if (arg2 <= 0 || local9.anInt4196 == -1) {
					arg3.anInt5743 = local9.anInt4165;
				} else {
					arg3.anInt5743 = local9.anInt4196;
				}
				arg3.aBoolean404 = false;
			} else if (!arg3.aBoolean404 || !local9.method3688(arg3.anInt5743)) {
				arg3.anInt5743 = local9.method3685();
				arg3.aBoolean404 = arg3.anInt5743 != -1;
			}
		} else if (arg3.anInt5744 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(53) int local53 = Static460.anIntArray501[arg1] - arg3.aClass63_7.anInt2110 & 0x3FFF;
			if (arg0 == 2 && local9.anInt4187 != -1) {
				if (local53 > 2048 && local53 <= 6144 && local9.anInt4186 != -1) {
					arg3.anInt5743 = local9.anInt4186;
				} else if (local53 >= 10240 && local53 < 14336 && local9.anInt4182 != -1) {
					arg3.anInt5743 = local9.anInt4182;
				} else if (local53 <= 6144 || local53 >= 10240 || local9.anInt4194 == -1) {
					arg3.anInt5743 = local9.anInt4187;
				} else {
					arg3.anInt5743 = local9.anInt4194;
				}
			} else if (arg0 == 0 && local9.anInt4171 != -1) {
				if (local53 > 2048 && local53 <= 6144 && local9.anInt4183 != -1) {
					arg3.anInt5743 = local9.anInt4183;
				} else if (local53 >= 10240 && local53 < 14336 && local9.anInt4185 != -1) {
					arg3.anInt5743 = local9.anInt4185;
				} else if (local53 <= 6144 || local53 >= 10240 || local9.anInt4170 == -1) {
					arg3.anInt5743 = local9.anInt4171;
				} else {
					arg3.anInt5743 = local9.anInt4170;
				}
			} else if (local53 > 2048 && local53 <= 6144 && local9.anInt4158 != -1) {
				arg3.anInt5743 = local9.anInt4158;
			} else if (local53 >= 10240 && local53 < 14336 && local9.anInt4184 != -1) {
				arg3.anInt5743 = local9.anInt4184;
			} else if (local53 <= 6144 || local53 >= 10240 || local9.anInt4193 == -1) {
				arg3.anInt5743 = local9.anInt4165;
			} else {
				arg3.anInt5743 = local9.anInt4193;
			}
			arg3.aBoolean404 = false;
		} else if (local27 == 0 && arg3.anInt5771 <= 25) {
			if (arg0 == 2 && local9.anInt4187 != -1) {
				arg3.anInt5743 = local9.anInt4187;
			} else if (arg0 == 0 && local9.anInt4171 != -1) {
				arg3.anInt5743 = local9.anInt4171;
			} else {
				arg3.anInt5743 = local9.anInt4165;
			}
			arg3.aBoolean404 = false;
		} else {
			if (arg0 == 2 && local9.anInt4187 != -1) {
				if (arg2 < 0 && local9.anInt4169 != -1) {
					arg3.anInt5743 = local9.anInt4169;
				} else if (arg2 <= 0 || local9.anInt4160 == -1) {
					arg3.anInt5743 = local9.anInt4187;
				} else {
					arg3.anInt5743 = local9.anInt4160;
				}
			} else if (arg0 == 0 && local9.anInt4171 != -1) {
				if (arg2 < 0 && local9.anInt4168 != -1) {
					arg3.anInt5743 = local9.anInt4168;
				} else if (arg2 <= 0 || local9.anInt4192 == -1) {
					arg3.anInt5743 = local9.anInt4171;
				} else {
					arg3.anInt5743 = local9.anInt4192;
				}
			} else if (arg2 < 0 && local9.anInt4195 != -1) {
				arg3.anInt5743 = local9.anInt4195;
			} else if (arg2 <= 0 || local9.anInt4159 == -1) {
				arg3.anInt5743 = local9.anInt4165;
			} else {
				arg3.anInt5743 = local9.anInt4159;
			}
			arg3.aBoolean404 = false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public static void method8228() {
		@Pc(7) Class120[] local7 = Class339.aClass120Array1;
		synchronized (Class339.aClass120Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class339.aClass120Array1.length; local11++) {
				Class339.aClass120Array1[local11] = new Class120();
				Static106.anIntArray92[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BFIFF)F")
	public static float method8229(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static640.aFloatArrayArray18[arg1];
		return local12[0] * arg3 + local12[1] * arg0 + arg2 * local12[2];
	}
}

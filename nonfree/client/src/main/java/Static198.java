import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Z")
	public static boolean aBoolean186;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	public static int anInt3992 = 0;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!mi;")
	public static Class75 aClass75_20 = new Class75();

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1291 = Static186.method3527(")1p");

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1294 = Static186.method3527("Hidden");

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1292 = aClass50_1294;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1293 = Static186.method3527("_");

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	public static int anInt3997 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)I")
	public static int method3179(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return arg0 + local1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!sh;)V")
	public static void method3181(@OriginalArg(1) Class20_Sub3 arg0) {
		arg0.aBoolean128 = false;
		@Pc(17) Class110 local17;
		if (arg0.anInt3051 != -1) {
			local17 = Static200.method3204(arg0.anInt3051);
			if (local17 == null || local17.anIntArray458 == null) {
				arg0.anInt3051 = -1;
			} else {
				arg0.anInt3021++;
				if (arg0.anInt3038 < local17.anIntArray458.length && arg0.anInt3021 > local17.anIntArray460[arg0.anInt3038]) {
					arg0.anInt3021 = 1;
					arg0.anInt3038++;
					Static80.method1140(arg0.anInt3038, arg0.anInt3008, arg0.anInt3022, arg0 == Static230.aClass20_Sub3_Sub1_3, local17);
				}
				if (arg0.anInt3038 >= local17.anIntArray458.length) {
					arg0.anInt3038 = 0;
					arg0.anInt3021 = 0;
					Static80.method1140(arg0.anInt3038, arg0.anInt3008, arg0.anInt3022, Static230.aClass20_Sub3_Sub1_3 == arg0, local17);
				}
			}
		}
		if (arg0.anInt3058 != -1 && arg0.anInt3045 <= Static107.anInt2132) {
			if (arg0.anInt3019 < 0) {
				arg0.anInt3019 = 0;
			}
			@Pc(126) int local126 = Static216.method3377(arg0.anInt3058).anInt1563;
			if (local126 == -1) {
				arg0.anInt3058 = -1;
			} else {
				@Pc(133) Class110 local133 = Static200.method3204(local126);
				if (local133 == null || local133.anIntArray458 == null) {
					arg0.anInt3058 = -1;
				} else {
					arg0.anInt3025++;
					if (arg0.anInt3019 < local133.anIntArray458.length && local133.anIntArray460[arg0.anInt3019] < arg0.anInt3025) {
						arg0.anInt3025 = 1;
						arg0.anInt3019++;
						Static80.method1140(arg0.anInt3019, arg0.anInt3008, arg0.anInt3022, Static230.aClass20_Sub3_Sub1_3 == arg0, local133);
					}
					if (local133.anIntArray458.length <= arg0.anInt3019) {
						arg0.anInt3058 = -1;
					}
				}
			}
		}
		if (arg0.anInt3060 != -1 && arg0.anInt3014 <= 1) {
			local17 = Static200.method3204(arg0.anInt3060);
			if (local17.anInt4013 == 1 && arg0.anInt3009 > 0 && arg0.anInt3028 <= Static107.anInt2132 && arg0.anInt3030 < Static107.anInt2132) {
				arg0.anInt3014 = 1;
				return;
			}
		}
		if (arg0.anInt3060 != -1 && arg0.anInt3014 == 0) {
			local17 = Static200.method3204(arg0.anInt3060);
			if (local17 == null || local17.anIntArray458 == null) {
				arg0.anInt3060 = -1;
			} else {
				arg0.anInt3052++;
				if (arg0.anInt3046 < local17.anIntArray458.length && local17.anIntArray460[arg0.anInt3046] < arg0.anInt3052) {
					arg0.anInt3052 = 1;
					arg0.anInt3046++;
					Static80.method1140(arg0.anInt3046, arg0.anInt3008, arg0.anInt3022, arg0 == Static230.aClass20_Sub3_Sub1_3, local17);
				}
				if (arg0.anInt3046 >= local17.anIntArray458.length) {
					arg0.anInt3020++;
					arg0.anInt3046 -= local17.anInt4010;
					if (arg0.anInt3020 >= local17.anInt4003) {
						arg0.anInt3060 = -1;
					} else if (arg0.anInt3046 >= 0 && arg0.anInt3046 < local17.anIntArray458.length) {
						Static80.method1140(arg0.anInt3046, arg0.anInt3008, arg0.anInt3022, arg0 == Static230.aClass20_Sub3_Sub1_3, local17);
					} else {
						arg0.anInt3060 = -1;
					}
				}
				arg0.aBoolean128 = local17.aBoolean187;
			}
		}
		if (arg0.anInt3014 > 0) {
			arg0.anInt3014--;
		}
	}
}

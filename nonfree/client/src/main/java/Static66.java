import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	public static int anInt1451;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_29 = new Class133(84, 17);

	@OriginalMember(owner = "client!co", name = "I", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_15 = new Class158(3, 8);

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public static int anInt1452 = 13156520;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)I")
	public static int method1327(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(II)Z")
	public static boolean method1330(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)Z")
	public static boolean method1332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static459.method6873(arg1, arg0) || Static424.method6501(arg0, arg1);
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
	public static void method1333() {
		Static202.anInt4523 = 0;
		@Pc(12) int local12 = Static223.anInt4827 + (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9);
		@Pc(20) int local20 = (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9) + Static150.anInt3027;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static202.anInt4523 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static202.anInt4523 = 1;
		}
		if (Static202.anInt4523 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static202.anInt4523 = 0;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(FIIIIF[FIIIB)V")
	public static void method1336(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(9) int local9 = arg7 - arg3;
		@Pc(18) int local18 = arg4 - arg9;
		@Pc(22) int local22 = arg1 - arg2;
		@Pc(43) float local43 = arg6[1] * (float) local22 + (float) local18 * arg6[0] + arg6[2] * (float) local9;
		@Pc(64) float local64 = arg6[5] * (float) local9 + (float) local22 * arg6[4] + arg6[3] * (float) local18;
		@Pc(85) float local85 = arg6[6] * (float) local18 + arg6[7] * (float) local22 + (float) local9 * arg6[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local96 *= arg0;
		}
		@Pc(110) float local110 = local64 + arg5 + 0.5F;
		@Pc(115) float local115;
		if (arg8 == 1) {
			local115 = local96;
			local96 = -local110;
			local110 = local115;
		} else if (arg8 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg8 == 3) {
			local115 = local96;
			local96 = local110;
			local110 = -local115;
		}
		Static75.aFloat257 = local96;
		Static491.aFloat269 = local110;
	}
}

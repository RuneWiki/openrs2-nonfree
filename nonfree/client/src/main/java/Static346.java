import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Lclient!lm;")
	public static Class134 aClass134_149;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "Lclient!vk;")
	public static Class207 aClass207_36 = new Class207(128);

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
	public static volatile int anInt6679 = -1;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[B")
	public static final byte[] aByteArray84 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)V")
	public static void method5791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * Static4.anInt39 >> 8;
		if (arg1 == -1 && !Static92.aBoolean123) {
			Static27.method3641();
		} else if (arg1 != -1 && (arg1 != Static248.anInt28 || !Static351.method3407()) && local5 != 0 && !Static92.aBoolean123) {
			Static148.method2613(Static88.aClass134_38, local5, arg1);
		}
		Static248.anInt28 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)I")
	public static int method5792() {
		if (Static280.aBoolean476) {
			return 0;
		} else if (Static25.method408()) {
			return Static211.aBoolean353 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII)V")
	public static void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(30) int local30 = local13 << 1;
		@Pc(34) int local34 = arg0 << 1;
		@Pc(42) int local42 = local21 + local13 * (1 - local34);
		@Pc(51) int local51 = local17 - local30 * (local34 - 1);
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local30 * ((arg0 << 1) - 3);
		@Pc(81) int local81 = local59;
		Static244.method5351(arg4 - arg1, arg4 - -arg1, Static319.anIntArrayArray31[arg2], arg3);
		@Pc(101) int local101 = local55 * (arg0 - 1);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local67;
					local51 += local81;
					local7++;
					local81 += local59;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local67 += local59;
				local81 += local59;
				local7++;
			}
			local51 += -local75;
			local42 += -local101;
			local9--;
			local75 -= local55;
			local101 -= local55;
			@Pc(172) int local172 = arg2 - local9;
			@Pc(176) int local176 = local9 + arg2;
			@Pc(180) int local180 = local7 + arg4;
			@Pc(184) int local184 = arg4 - local7;
			Static244.method5351(local184, local180, Static319.anIntArrayArray31[local172], arg3);
			Static244.method5351(local184, local180, Static319.anIntArrayArray31[local176], arg3);
		}
	}
}

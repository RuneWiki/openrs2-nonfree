import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!om", name = "p", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "I")
	public static int anInt3849;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString137 = "Loaded title screen";

	@OriginalMember(owner = "client!om", name = "x", descriptor = "Lclient!wn;")
	public static Class182 aClass182_24 = new Class182();

	@OriginalMember(owner = "client!om", name = "H", descriptor = "I")
	public static int anInt3845 = 0;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString138 = "green:";

	@OriginalMember(owner = "client!om", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Loading sprites - ";

	@OriginalMember(owner = "client!om", name = "N", descriptor = "[I")
	public static int[] anIntArray285 = new int[32768];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([IIIIII)V")
	public static void method2992(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class21 local13 = local7.aClass21_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt747;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class14 local58 = local7.aClass14_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt486;
		@Pc(67) int local67 = local58.anInt489;
		@Pc(70) int local70 = local58.anInt488;
		@Pc(73) int local73 = local58.anInt487;
		@Pc(77) int[] local77 = Static169.anIntArrayArray17[local23];
		@Pc(81) int[] local81 = Static279.anIntArrayArray41[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public static void method2994() {
		if (Static153.aClass111_2 != null) {
			Static153.aClass111_2.method4146();
		}
		if (Static79.aClass111_1 != null) {
			Static79.aClass111_1.method4146();
		}
		Static255.method3819(Static277.aBoolean477);
		Static153.aClass111_2 = Static54.method871(22050, Static199.aClass17_3, 0, Static39.aCanvas1);
		Static153.aClass111_2.method4150(Static194.aClass8_Sub8_Sub2_2);
		Static79.aClass111_1 = Static54.method871(2048, Static199.aClass17_3, 1, Static39.aCanvas1);
		Static79.aClass111_1.method4150(Static84.aClass8_Sub8_Sub1_1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILclient!tk;)V")
	public static void method2995(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class159 arg1) {
		@Pc(9) int local9 = arg1.anInt5162 == 0 ? arg1.anInt5123 : arg1.anInt5162;
		@Pc(25) int local25 = arg1.anInt5207 == 0 ? arg1.anInt5121 : arg1.anInt5207;
		Static224.method3488(local9, arg0, Static210.aClass159ArrayArray6[arg1.anInt5199 >> 16], arg1.anInt5199, local25);
		if (arg1.aClass159Array1 != null) {
			Static224.method3488(local9, arg0, arg1.aClass159Array1, arg1.anInt5199, local25);
		}
		@Pc(60) Class8_Sub32 local60 = (Class8_Sub32) Static213.aClass129_22.method3043((long) arg1.anInt5199);
		if (local60 != null) {
			Static81.method1345(local60.anInt5295, local25, local9, arg0);
		}
	}
}

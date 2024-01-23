import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub6_Sub1 aClass1_Sub2_Sub6_Sub1_4;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public static int anInt4471 = 5063219;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt4474 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method3908() {
		Static94.anInterface4Array3 = null;
		Static9.method125();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIIII)V")
	public static void method3911(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class159 local13 = local7.aClass159_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4605;
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
		@Pc(58) Class133 local58 = local7.aClass133_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt4002;
		@Pc(67) int local67 = local58.anInt4000;
		@Pc(70) int local70 = local58.anInt4003;
		@Pc(73) int local73 = local58.anInt4001;
		@Pc(77) int[] local77 = Static129.anIntArrayArray20[local23];
		@Pc(81) int[] local81 = Static148.anIntArrayArray21[local67];
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
}

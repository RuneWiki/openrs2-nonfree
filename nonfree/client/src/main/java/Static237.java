import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "[I")
	public static int[] anIntArray447 = new int[2048];

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "Lclient!oh;")
	public static Class99 aClass99_10 = new Class99();

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public static int anInt5140 = 127;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString366 = "Please remove ";

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
	public static void method3926() {
		Static182.aClass79_28.method2487();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIIII)V")
	public static void method3929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class36 local13 = local7.aClass36_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt1460;
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
		@Pc(58) Class113 local58 = local7.aClass113_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt4278;
		@Pc(67) int local67 = local58.anInt4275;
		@Pc(70) int local70 = local58.anInt4277;
		@Pc(73) int local73 = local58.anInt4276;
		@Pc(77) int[] local77 = Static254.anIntArrayArray39[local23];
		@Pc(81) int[] local81 = Static111.anIntArrayArray20[local67];
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

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BC)Z")
	public static boolean method3930(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}

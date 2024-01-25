import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt2325;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_9 = new Class68(8);

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
	public static final int[] anIntArray161 = new int[5];

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_94 = new Class22(95, -2);

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public static int anInt2326 = 2;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIIIIII)V")
	public static void method1980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static352.method4768(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(26) int local26 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(89) int local89;
		if (arg5 >= Static376.anInt6287 && Static168.anInt3256 >= arg5) {
			@Pc(56) int[] local56 = Static96.anIntArrayArray21[arg5];
			local64 = Static332.method4519(Static208.anInt2656, arg4 - arg2, Static354.anInt6186);
			local72 = Static332.method4519(Static208.anInt2656, arg4 + arg2, Static354.anInt6186);
			local81 = Static332.method4519(Static208.anInt2656, arg4 - local15, Static354.anInt6186);
			local89 = Static332.method4519(Static208.anInt2656, arg4 + local15, Static354.anInt6186);
			Static251.method3640(local64, arg3, local81, local56);
			Static251.method3640(local81, arg1, local89, local56);
			Static251.method3640(local89, arg3, local72, local56);
		}
		while (local26 > local10) {
			local38 += 2;
			local36 += 2;
			local29 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				local34 -= local31 << 1;
				Static224.anIntArray288[local31] = local10;
			}
			local10++;
			@Pc(238) int local238;
			@Pc(246) int local246;
			@Pc(257) int[] local257;
			@Pc(150) int local150;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				local150 = arg5 - local26;
				local64 = local26 + arg5;
				if (Static376.anInt6287 <= local64 && local150 <= Static168.anInt3256) {
					if (local15 <= local26) {
						local72 = Static332.method4519(Static208.anInt2656, arg4 + local10, Static354.anInt6186);
						local81 = Static332.method4519(Static208.anInt2656, arg4 - local10, Static354.anInt6186);
						if (local64 <= Static168.anInt3256) {
							Static251.method3640(local81, arg3, local72, Static96.anIntArrayArray21[local64]);
						}
						if (local150 >= Static376.anInt6287) {
							Static251.method3640(local81, arg3, local72, Static96.anIntArrayArray21[local150]);
						}
					} else {
						local72 = Static224.anIntArray288[local26];
						local81 = Static332.method4519(Static208.anInt2656, arg4 + local10, Static354.anInt6186);
						local89 = Static332.method4519(Static208.anInt2656, arg4 - local10, Static354.anInt6186);
						local238 = Static332.method4519(Static208.anInt2656, arg4 + local72, Static354.anInt6186);
						local246 = Static332.method4519(Static208.anInt2656, arg4 - local72, Static354.anInt6186);
						if (local64 <= Static168.anInt3256) {
							local257 = Static96.anIntArrayArray21[local64];
							Static251.method3640(local89, arg3, local246, local257);
							Static251.method3640(local246, arg1, local238, local257);
							Static251.method3640(local238, arg3, local81, local257);
						}
						if (local150 >= Static376.anInt6287) {
							local257 = Static96.anIntArrayArray21[local150];
							Static251.method3640(local89, arg3, local246, local257);
							Static251.method3640(local246, arg1, local238, local257);
							Static251.method3640(local238, arg3, local81, local257);
						}
					}
				}
			}
			local150 = arg5 - local10;
			local64 = local10 + arg5;
			if (Static376.anInt6287 <= local64 && local150 <= Static168.anInt3256) {
				local72 = arg4 + local26;
				local81 = arg4 - local26;
				if (Static354.anInt6186 <= local72 && local81 <= Static208.anInt2656) {
					local72 = Static332.method4519(Static208.anInt2656, local72, Static354.anInt6186);
					local81 = Static332.method4519(Static208.anInt2656, local81, Static354.anInt6186);
					if (local10 < local15) {
						local89 = local10 <= local31 ? local31 : Static224.anIntArray288[local10];
						local238 = Static332.method4519(Static208.anInt2656, arg4 + local89, Static354.anInt6186);
						local246 = Static332.method4519(Static208.anInt2656, arg4 - local89, Static354.anInt6186);
						if (local64 <= Static168.anInt3256) {
							local257 = Static96.anIntArrayArray21[local64];
							Static251.method3640(local81, arg3, local246, local257);
							Static251.method3640(local246, arg1, local238, local257);
							Static251.method3640(local238, arg3, local72, local257);
						}
						if (Static376.anInt6287 <= local150) {
							local257 = Static96.anIntArrayArray21[local150];
							Static251.method3640(local81, arg3, local246, local257);
							Static251.method3640(local246, arg1, local238, local257);
							Static251.method3640(local238, arg3, local72, local257);
						}
					} else {
						if (local64 <= Static168.anInt3256) {
							Static251.method3640(local81, arg3, local72, Static96.anIntArrayArray21[local64]);
						}
						if (Static376.anInt6287 <= local150) {
							Static251.method3640(local81, arg3, local72, Static96.anIntArrayArray21[local150]);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z")
	public static boolean method1981(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}

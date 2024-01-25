import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "[Lclient!u;")
	public static Class147_Sub1[] aClass147_Sub1Array2;

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "I")
	public static int anInt3997 = -1;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
	public static int anInt3998 = -1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg7 < 1 || Static296.anInt5187 - 2 < arg2 || arg7 > Static206.anInt3607 - 2) {
			return;
		}
		@Pc(31) int local31 = arg6;
		if (arg6 < 3 && Static183.method2654(arg7, arg2)) {
			local31 = arg6 + 1;
		}
		if (!Static453.aClass136_Sub1_1.method3522(Static14.anInt293) && !Static444.method5830(arg2, arg7, local31, Static456.anInt7534)) {
			return;
		}
		if (Static359.aClass169ArrayArrayArray5 == null) {
			return;
		}
		Static369.aClass195_Sub1_2.method5006(Static447.aClass14Array3[arg6], arg6, arg2, arg3, Static185.aClass34_7, arg7);
		if (arg1 < 0) {
			return;
		}
		@Pc(72) boolean local72 = Static453.aClass136_Sub1_1.aBoolean512;
		Static453.aClass136_Sub1_1.aBoolean512 = true;
		Static369.aClass195_Sub1_2.method5013(arg7, Static447.aClass14Array3[arg6], local31, arg0, arg5, arg6, arg4, arg2, Static185.aClass34_7, arg1);
		Static453.aClass136_Sub1_1.aBoolean512 = local72;
		return;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IJLclient!za;)V")
	public static void method3246(@OriginalArg(1) long arg0, @OriginalArg(2) Class34 arg1) {
		Static246.anInt4465 = Static359.anInt6120;
		Static101.anInt1841 = 0;
		Static359.anInt6120 = 0;
		@Pc(14) long local14 = Static27.method359();
		for (@Pc(19) Class4_Sub2 local19 = (Class4_Sub2) Static78.aClass262_8.method5819(); local19 != null; local19 = (Class4_Sub2) Static78.aClass262_8.method5813()) {
			if (local19.method1238(arg1, arg0)) {
				Static101.anInt1841++;
			}
		}
		if (Static235.aBoolean479 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static78.aClass262_8.method5818() + ", running: " + Static101.anInt1841 + ". Particles: " + Static359.anInt6120 + ". Time taken: " + (Static27.method359() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z")
	public static boolean method3247(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}

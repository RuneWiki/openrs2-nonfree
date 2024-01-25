import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[[[Lclient!ni;")
	public static Class247[][][] aClass247ArrayArrayArray1;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_19 = new Class6(0, 1);

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_86 = new Class376(75, 3);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public static void method5116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class182 local9 = Static44.aClass182ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static170.anInt3059 = local9.anInt4932;
			Static387.anInt6744 = local9.anInt4935;
			Static231.anInt4427 = local9.anInt4941;
		}
		Static404.method5780();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!gj;IIIIZ)V")
	public static void method5117(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(4) int arg2) {
		Static548.aClass143_125 = arg1;
		Static399.anInt5283 = 0;
		Static279.anInt5228 = 2;
		Static335.anInt6114 = arg0;
		Static424.aClass3_Sub9_Sub5_3 = null;
		Static231.anInt4426 = arg2;
		Static54.anInt1418 = 1;
		Static230.aBoolean341 = false;
	}
}

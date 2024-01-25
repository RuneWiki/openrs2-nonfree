import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
	public static int anInt969;

	@OriginalMember(owner = "client!cca", name = "H", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_31 = new Class362(57, -2);

	@OriginalMember(owner = "client!cca", name = "N", descriptor = "[I")
	public static final int[] anIntArray36 = new int[32];

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZIIIIII)V")
	public static void method986(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 - arg6;
		@Pc(13) int local13 = arg4 + arg6;
		for (@Pc(15) int local15 = arg4; local15 < local13; local15++) {
			Static306.method5239(Static46.anIntArrayArray4[local15], arg1, arg5, arg2);
		}
		@Pc(34) int local34 = arg1 - arg6;
		@Pc(38) int local38 = arg6 + arg2;
		for (@Pc(45) int local45 = arg0; local45 > local9; local45--) {
			Static306.method5239(Static46.anIntArrayArray4[local45], arg1, arg5, arg2);
		}
		for (@Pc(65) int local65 = local13; local65 <= local9; local65++) {
			@Pc(71) int[] local71 = Static46.anIntArrayArray4[local65];
			Static306.method5239(local71, local38, arg5, arg2);
			Static306.method5239(local71, local34, arg3, local38);
			Static306.method5239(local71, arg1, arg5, local34);
		}
	}
}

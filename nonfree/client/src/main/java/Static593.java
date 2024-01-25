import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[Lclient!bd;")
	public static final Class31[] aClass31Array1 = new Class31[100];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
	public static void method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg3 + 1;
		Static202.method3077(Static118.anIntArrayArray7[arg3], arg1, arg0, arg4);
		@Pc(22) int local22 = arg2 - 1;
		Static202.method3077(Static118.anIntArrayArray7[arg2], arg1, arg0, arg4);
		for (@Pc(30) int local30 = local13; local30 <= local22; local30++) {
			@Pc(36) int[] local36 = Static118.anIntArrayArray7[local30];
			local36[arg1] = local36[arg4] = arg0;
		}
	}
}

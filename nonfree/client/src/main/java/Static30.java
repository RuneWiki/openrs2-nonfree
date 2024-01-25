import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!os;")
	public static final Class182 aClass182_26 = new Class182("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!gh;II)I")
	public static int method433(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		if (!Static56.method1002(arg0).method4508(arg1) && arg0.anObjectArray10 == null) {
			return -1;
		} else if (arg0.anIntArray269 == null || arg1 >= arg0.anIntArray269.length) {
			return -1;
		} else {
			return arg0.anIntArray269[arg1];
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[FIIIIIFII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg8 - arg4;
		@Pc(13) int local13 = arg2 - arg0;
		@Pc(17) int local17 = arg7 - arg5;
		@Pc(38) float local38 = (float) local13 * arg1[2] + (float) local17 * arg1[0] + (float) local5 * arg1[1];
		@Pc(59) float local59 = arg1[5] * (float) local13 + (float) local5 * arg1[4] + (float) local17 * arg1[3];
		@Pc(80) float local80 = (float) local13 * arg1[8] + (float) local17 * arg1[6] + (float) local5 * arg1[7];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg6 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(134) float local134;
		if (arg3 == 1) {
			local134 = local106;
			local106 = -local119;
			local119 = local134;
		} else if (arg3 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg3 == 3) {
			local134 = local106;
			local106 = local119;
			local119 = -local134;
		}
		Static413.aFloat118 = local106;
		Static415.aFloat119 = local119;
	}
}

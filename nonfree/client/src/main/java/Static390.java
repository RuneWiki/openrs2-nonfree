import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
	public static int[] anIntArray573;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!ua;")
	public static Class2_Sub44 aClass2_Sub44_2;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_203 = new Class202("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[FFFIIIII)V")
	public static void method6255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg5 - arg8;
		@Pc(13) int local13 = arg1 - arg9;
		@Pc(17) int local17 = arg6 - arg7;
		@Pc(38) float local38 = (float) local9 * arg2[1] + arg2[0] * (float) local17 + arg2[2] * (float) local13;
		@Pc(59) float local59 = (float) local13 * arg2[5] + arg2[3] * (float) local17 + (float) local9 * arg2[4];
		@Pc(85) float local85 = (float) local9 * arg2[7] + arg2[6] * (float) local17 + arg2[8] * (float) local13;
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local96 *= arg4;
		}
		@Pc(110) float local110 = arg3 + local59 + 0.5F;
		@Pc(115) float local115;
		if (arg0 == 1) {
			local115 = local96;
			local96 = -local110;
			local110 = local115;
		} else if (arg0 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg0 == 3) {
			local115 = local96;
			local96 = local110;
			local110 = -local115;
		}
		Static235.aFloat75 = local110;
		Static301.aFloat103 = local96;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static242.anIntArray419[arg0 & 0x3] : 256;
	}
}

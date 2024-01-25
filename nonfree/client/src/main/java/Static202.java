import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[Lclient!dea;")
	public static Class2_Sub3[] aClass2_Sub3Array3;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!h;")
	public static final Class114 aClass114_117 = new Class114("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_98 = new Class6(28, 2);

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_6 = new Class266("", 11);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIBFIFF)[F")
	public static float[] method5310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(11) float[] local11 = new float[9];
		@Pc(14) float[] local14 = new float[9];
		@Pc(22) float local22 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local11[0] = local22;
		local11[2] = local30;
		local11[4] = 1.0F;
		local11[1] = 0.0F;
		local11[3] = 0.0F;
		local11[7] = 0.0F;
		local11[8] = local22;
		local11[5] = 0.0F;
		local11[6] = -local30;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg0 / 32767.0F;
		@Pc(88) float local88 = 1.0F - local83;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(111) float local111 = (float) Math.sqrt((double) (arg4 * arg4 + arg1 * arg1));
		if (local111 == 0.0F && local83 == 0.0F) {
			local14 = local11;
		} else {
			if (local111 != 0.0F) {
				local78 = (float) arg4 / local111;
				local76 = (float) -arg1 / local111;
			}
			local74[8] = local88 * local78 * local78 + local83;
			local74[4] = local83;
			local74[5] = local99 * local76;
			local74[1] = local99 * local78;
			local74[3] = local99 * -local78;
			local74[7] = -local76 * local99;
			local74[2] = local88 * local78 * local76;
			local74[6] = local78 * local76 * local88;
			local74[0] = local83 + local76 * local76 * local88;
			local14[0] = local11[0] * local74[0] + local11[1] * local74[3] + local74[6] * local11[2];
			local14[1] = local11[2] * local74[7] + local11[1] * local74[4] + local74[1] * local11[0];
			local14[3] = local74[6] * local11[5] + local74[0] * local11[3] + local11[4] * local74[3];
			local14[2] = local74[8] * local11[2] + local74[5] * local11[1] + local74[2] * local11[0];
			local14[4] = local74[4] * local11[4] + local11[3] * local74[1] + local74[7] * local11[5];
			local14[6] = local74[0] * local11[6] + local11[7] * local74[3] + local11[8] * local74[6];
			local14[5] = local11[5] * local74[8] + local74[5] * local11[4] + local74[2] * local11[3];
			local14[7] = local11[8] * local74[7] + local74[4] * local11[7] + local11[6] * local74[1];
			local14[8] = local11[8] * local74[8] + local11[6] * local74[2] + local11[7] * local74[5];
		}
		local14[0] *= arg3;
		local14[2] *= arg3;
		local14[6] *= arg5;
		local14[7] *= arg5;
		local14[4] *= arg6;
		local14[8] *= arg5;
		local14[1] *= arg3;
		local14[3] *= arg6;
		local14[5] *= arg6;
		return local14;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Z")
	public static boolean method5311() {
		return Static473.aBoolean549;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5316(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(7) int local7 = arg0.indexOf(arg1); local7 != -1; local7 = arg0.indexOf(arg1, arg2.length() + local7)) {
			arg0 = arg0.substring(0, local7) + arg2 + arg0.substring(arg1.length() + local7);
		}
		return arg0;
	}
}

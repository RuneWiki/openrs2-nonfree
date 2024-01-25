import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!si", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!js;ILjava/lang/String;)Lclient!jk;")
	public static Class128 method3803(@OriginalArg(1) Class131 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method3048(arg2);
		}
		@Pc(36) Class128 local36;
		if (arg1 == 1) {
			try {
				Static461.method3591(new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() }, arg0.anApplet1, "openjs");
				local36 = new Class128();
				local36.anInt3727 = 1;
				return local36;
			} catch (@Pc(42) Throwable local42) {
				local36 = new Class128();
				local36.anInt3727 = 2;
				return local36;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local36 = new Class128();
				local36.anInt3727 = 1;
				return local36;
			} catch (@Pc(76) Exception local76) {
				local36 = new Class128();
				local36.anInt3727 = 2;
				return local36;
			}
		} else if (arg1 == 3) {
			try {
				Static461.method3590(arg0.anApplet1, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local36 = new Class128();
				local36.anInt3727 = 1;
				return local36;
			} catch (@Pc(122) Exception local122) {
				local36 = new Class128();
				local36.anInt3727 = 2;
				return local36;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIFIFIIF)[F")
	public static float[] method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[8] = local17;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[7] = 0.0F;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		@Pc(78) float[] local78 = new float[9];
		@Pc(80) float local80 = 1.0F;
		@Pc(82) float local82 = 0.0F;
		@Pc(87) float local87 = (float) arg5 / 32767.0F;
		@Pc(97) float local97 = -((float) Math.sqrt((double) (1.0F - local87 * local87)));
		@Pc(102) float local102 = 1.0F - local87;
		@Pc(113) float local113 = (float) Math.sqrt((double) (arg0 * arg0 + arg1 * arg1));
		if (local113 == 0.0F && local87 == 0.0F) {
			local9 = local6;
		} else {
			if (local113 != 0.0F) {
				local80 = (float) -arg0 / local113;
				local82 = (float) arg1 / local113;
			}
			local78[0] = local87 + local102 * local80 * local80;
			local78[6] = local82 * local80 * local102;
			local78[5] = local97 * local80;
			local78[7] = local97 * -local80;
			local78[8] = local82 * local82 * local102 + local87;
			local78[4] = local87;
			local78[2] = local102 * local82 * local80;
			local78[3] = local97 * -local82;
			local78[1] = local82 * local97;
			local9[0] = local78[0] * local6[0] + local6[1] * local78[3] + local6[2] * local78[6];
			local9[1] = local6[2] * local78[7] + local6[1] * local78[4] + local78[1] * local6[0];
			local9[3] = local6[3] * local78[0] + local6[4] * local78[3] + local6[5] * local78[6];
			local9[2] = local78[5] * local6[1] + local6[0] * local78[2] + local6[2] * local78[8];
			local9[4] = local6[4] * local78[4] + local78[1] * local6[3] + local78[7] * local6[5];
			local9[6] = local6[7] * local78[3] + local78[0] * local6[6] + local78[6] * local6[8];
			local9[5] = local78[5] * local6[4] + local6[3] * local78[2] + local6[5] * local78[8];
			local9[7] = local6[6] * local78[1] + local78[4] * local6[7] + local78[7] * local6[8];
			local9[8] = local6[8] * local78[8] + local78[5] * local6[7] + local78[2] * local6[6];
		}
		local9[7] *= arg2;
		local9[6] *= arg2;
		local9[8] *= arg2;
		local9[1] *= arg3;
		local9[5] *= arg6;
		local9[3] *= arg6;
		local9[0] *= arg3;
		local9[2] *= arg3;
		local9[4] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
	public static void method3806() {
		Static277.aClass129_48.method3028(5);
	}
}

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!oba", name = "I", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_38 = new Class8();

	@OriginalMember(owner = "client!oba", name = "J", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_10 = new Class357(6, 1);

	@OriginalMember(owner = "client!oba", name = "K", descriptor = "Lclient!pk;")
	public static final Class258 aClass258_6 = new Class258("LIVE", 0);

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
	public static void method5567(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static21.method417(arg0, arg1, arg2, arg4, -1, arg3, null, arg5);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZIII)V")
	public static void method5569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static125.aFrame1 != null && (arg4 != 3 || Static72.aClass2_Sub12_Sub1_1.anInt1924 != arg3 || Static72.aClass2_Sub12_Sub1_1.anInt1913 != arg1)) {
			Static221.method3492(Static125.aFrame1, Static356.aClass287_5);
			Static125.aFrame1 = null;
		}
		if (arg4 == 3 && Static125.aFrame1 == null) {
			Static125.aFrame1 = Static261.method6639(0, arg1, Static356.aClass287_5, arg3);
			if (Static125.aFrame1 != null) {
				Static72.aClass2_Sub12_Sub1_1.anInt1913 = arg1;
				Static72.aClass2_Sub12_Sub1_1.anInt1924 = arg3;
				Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
			}
		}
		if (arg4 == 3 && Static125.aFrame1 == null) {
			method5569(arg0, -1, true, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
			return;
		}
		@Pc(94) Container local94;
		@Pc(121) Insets local121;
		if (Static125.aFrame1 != null) {
			Static455.anInt7877 = arg3;
			local94 = Static125.aFrame1;
			Static248.anInt4654 = arg1;
		} else if (Static593.aFrame2 == null) {
			if (Static562.anApplet2 == null) {
				local94 = Static509.anApplet_Sub1_1;
			} else {
				local94 = Static562.anApplet2;
			}
			Static455.anInt7877 = local94.getSize().width;
			Static248.anInt4654 = local94.getSize().height;
		} else {
			local121 = Static593.aFrame2.getInsets();
			Static455.anInt7877 = Static593.aFrame2.getSize().width - local121.left - local121.right;
			@Pc(139) int local139 = -local121.top;
			Static248.anInt4654 = Static593.aFrame2.getSize().height + local139 - local121.bottom;
			local94 = Static593.aFrame2;
		}
		if (arg4 == 1) {
			Static140.anInt2937 = Static26.anInt651;
			Static561.anInt9195 = 0;
			Static212.anInt4095 = (Static455.anInt7877 - Static26.anInt651) / 2;
			Static120.anInt2371 = Static554.anInt9119;
		} else {
			Static306.method4565();
		}
		if (aClass258_6 != Static207.aClass258_3) {
			@Pc(181) boolean local181;
			if (Static140.anInt2937 < 1024 && Static120.anInt2371 < 768) {
				local181 = true;
			} else {
				local181 = false;
			}
		}
		if (arg2) {
			Static594.method7991();
		} else {
			Static471.aCanvas12.setSize(Static140.anInt2937, Static120.anInt2371);
			Static307.aClass100_6.method6207(Static471.aCanvas12);
			if (local94 == Static593.aFrame2) {
				local121 = Static593.aFrame2.getInsets();
				Static471.aCanvas12.setLocation(local121.left + Static212.anInt4095, Static561.anInt9195 + local121.top);
			} else {
				Static471.aCanvas12.setLocation(Static212.anInt4095, Static561.anInt9195);
			}
		}
		if (arg4 >= 2) {
			Static46.aBoolean79 = true;
		} else {
			Static46.aBoolean79 = false;
		}
		if (Static554.anInt9121 != -1) {
			Static75.method1189(true);
		}
		if (Static57.aClass116_1 != null && Static28.method5282(Static201.anInt3963)) {
			Static257.method4012();
		}
		for (@Pc(246) int local246 = 0; local246 < 100; local246++) {
			Static295.aBooleanArray36[local246] = true;
		}
		Static481.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(FIIFBIFI)[F")
	public static float[] method5570(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[8] = local17;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg1 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(83) float local83 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local72 = (float) -arg2 / local105;
				local79 = (float) arg4 / local105;
			}
			local70[8] = local77 + local79 * local79 * local83;
			local70[7] = local94 * -local72;
			local70[6] = local79 * local72 * local83;
			local70[3] = local94 * -local79;
			local70[4] = local77;
			local70[5] = local72 * local94;
			local70[0] = local83 * local72 * local72 + local77;
			local70[1] = local94 * local79;
			local70[2] = local83 * local72 * local79;
			local9[0] = local70[3] * local6[1] + local6[0] * local70[0] + local6[2] * local70[6];
			local9[1] = local6[2] * local70[7] + local6[0] * local70[1] + local6[1] * local70[4];
			local9[3] = local6[3] * local70[0] + local70[3] * local6[4] + local6[5] * local70[6];
			local9[2] = local70[2] * local6[0] + local70[5] * local6[1] + local6[2] * local70[8];
			local9[4] = local70[4] * local6[4] + local70[1] * local6[3] + local6[5] * local70[7];
			local9[5] = local70[5] * local6[4] + local70[2] * local6[3] + local6[5] * local70[8];
			local9[6] = local70[6] * local6[8] + local70[3] * local6[7] + local6[6] * local70[0];
			local9[7] = local6[8] * local70[7] + local70[1] * local6[6] + local70[4] * local6[7];
			local9[8] = local70[8] * local6[8] + local70[2] * local6[6] + local6[7] * local70[5];
		}
		local9[7] *= arg0;
		local9[4] *= arg5;
		local9[6] *= arg0;
		local9[1] *= arg3;
		local9[0] *= arg3;
		local9[8] *= arg0;
		local9[5] *= arg5;
		local9[3] *= arg5;
		local9[2] *= arg3;
		return local9;
	}
}

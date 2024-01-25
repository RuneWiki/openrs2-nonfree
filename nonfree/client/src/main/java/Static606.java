import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	public static int anInt9197;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!cn;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "[I")
	public static final int[] anIntArray662 = new int[2];

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_163 = new Class397(20, 9);

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "[I")
	public static final int[] anIntArray663 = new int[1000];

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	public static int anInt9195 = -1;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "Lclient!le;")
	public static final Class222 aClass222_6 = new Class222();

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	public static int anInt9196 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZIIIII)V")
	public static void method7781(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 ? Static580.aClass3_Sub22_24.aClass21_Sub16_5.method5404() : Static580.aClass3_Sub22_24.aClass21_Sub16_1.method5404()) != 0 && arg4 != 0 && Static385.anInt5974 < 50 && arg2 != -1) {
			Static149.aClass398Array1[Static385.anInt5974++] = new Class398((byte) (arg0 ? 3 : 2), arg2, arg4, arg5, arg3, 0, arg1, (Class9_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(JZ)V")
	public static void method7782(@OriginalArg(0) long arg0) {
		if (Static448.aClass364ArrayArrayArray2 != null) {
			if (Static262.anInt4081 == 1 || Static262.anInt4081 == 5) {
				Static595.method7682(arg0);
			} else if (Static262.anInt4081 == 4) {
				Static110.method2162(arg0);
			}
		}
		Static82.method1792(Static153.aClass22_4, (long) Static716.anInt11157);
		if (Static589.anInt8959 != -1) {
			Static548.method7606(Static589.anInt8959);
		}
		for (@Pc(65) int local65 = 0; local65 < Static440.anInt6772; local65++) {
			if (Static572.aBooleanArray23[local65]) {
				Static472.aBooleanArray19[local65] = true;
			}
			Static452.aBooleanArray17[local65] = Static572.aBooleanArray23[local65];
			Static572.aBooleanArray23[local65] = false;
		}
		Static238.anInt3789 = Static716.anInt11157;
		Static713.method9475(-1, -1, (Class270) null);
		if (Static589.anInt8959 != -1) {
			Static440.anInt6772 = 0;
			Static650.method8552();
		}
		Static153.aClass22_4.la();
		Static258.method3586(Static153.aClass22_4);
		@Pc(126) int local126 = Static288.method4037();
		if (local126 == -1) {
			local126 = Static167.anInt2966;
		}
		if (local126 == -1) {
			local126 = Static52.anInt1387;
		}
		Static126.method2306(local126);
		@Pc(146) int local146 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method7485() << 8;
		Static112.method2179(Static286.anInt4372, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 + local146, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139, local146 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695);
		Static286.anInt4372 = 0;
	}
}

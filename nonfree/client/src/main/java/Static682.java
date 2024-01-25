import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "[F")
	public static final float[] aFloatArray103 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "Lclient!si;")
	public static final Class338 aClass338_62 = new Class338(50);

	@OriginalMember(owner = "client!vh", name = "cb", descriptor = "Lclient!m;")
	public static final Class235 aClass235_52 = new Class235(3);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IJ)V")
	public static void method9017(@OriginalArg(1) long arg0) {
		if (Static584.aClass262ArrayArrayArray2 != null) {
			if (Static175.anInt10579 == 1 || Static175.anInt10579 == 5) {
				Static384.method5766(arg0);
			} else if (Static175.anInt10579 == 4) {
				Static234.method3652(arg0);
			}
		}
		Static565.method7869(Static488.aClass67_12, (long) Static269.anInt4883);
		if (Static633.anInt3426 != -1) {
			Static601.method8272(Static633.anInt3426);
		}
		for (@Pc(52) int local52 = 0; local52 < Static583.anInt9536; local52++) {
			if (Static195.aBooleanArray17[local52]) {
				Static565.aBooleanArray24[local52] = true;
			}
			Static589.aBooleanArray26[local52] = Static195.aBooleanArray17[local52];
			Static195.aBooleanArray17[local52] = false;
		}
		Static524.anInt8917 = Static269.anInt4883;
		Static145.method2394(-1, -1, (Class20) null);
		if (Static633.anInt3426 != -1) {
			Static583.anInt9536 = 0;
			Static51.method674();
		}
		Static488.aClass67_12.la();
		Static699.method9149(Static488.aClass67_12);
		@Pc(111) int local111 = Static349.method5056();
		if (local111 == -1) {
			local111 = Static355.anInt6021;
		}
		if (local111 == -1) {
			local111 = Static396.anInt7100;
		}
		Static470.method6953(local111);
		@Pc(138) int local138 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592() << 8;
		Static609.method8337(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 + local138, Static387.anInt6950, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 + local138);
		Static387.anInt6950 = 0;
	}

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "(I)I")
	public static int method9020() {
		@Pc(12) Class338 local12 = Static381.aClass338_35;
		synchronized (Static381.aClass338_35) {
			return Static381.aClass338_35.method8048();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBIII)V")
	public static void method9021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(8, (long) arg3);
		local9.method630();
		local9.anInt803 = arg2;
		local9.anInt805 = arg1;
		local9.anInt804 = arg0;
	}
}

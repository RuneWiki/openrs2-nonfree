import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	public static int anInt774 = 0;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public static void method534() {
		if (Static273.aClass9_2 != null) {
			Static273.aClass9_2.method4352();
		}
		if (Static264.aClass9_1 != null) {
			Static264.aClass9_1.method4352();
		}
		Static35.method731(Static153.aBoolean183);
		Static273.aClass9_2 = Static225.method3929(22050, Static9.aCanvas1, 0, Static43.aClass66_1);
		Static273.aClass9_2.method4346(Static193.aClass1_Sub3_Sub2_3);
		Static264.aClass9_1 = Static225.method3929(2048, Static9.aCanvas1, 1, Static43.aClass66_1);
		Static264.aClass9_1.method4346(Static245.aClass1_Sub3_Sub1_2);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public static void method535() {
		Static141.aClass1_Sub3_Sub2_2.method987();
		Static115.anInt2536 = 1;
		Static293.aClass83_203 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)[F")
	public static float[] method536(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static201.method3575() + Static201.method3585();
		@Pc(9) int local9 = Static201.method3584();
		@Pc(25) float local25 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(27) float local27 = 0.58823526F;
		Static244.aFloatArray30[3] = 1.0F;
		Static244.aFloatArray30[0] = local27 * (float) (arg0 >> 16 & 0xFF) / 255.0F * local25 * local7;
		@Pc(57) float local57 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(64) float local64 = (float) (local9 & 0xFF) / 255.0F;
		Static244.aFloatArray30[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F * local57 * local27 * local7;
		Static244.aFloatArray30[2] = local27 * (float) (arg0 & 0xFF) / 255.0F * local64 * local7;
		return Static244.aFloatArray30;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!kb;Lclient!kb;B)V")
	public static void method537(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1) {
		Static14.aClass1_Sub2_Sub16_1 = Static249.method4264(arg0, Static271.anInt5844, arg1);
		if (Static296.aBoolean335) {
			Static174.aClass1_Sub2_Sub16_Sub2_1 = Static233.method4056(arg1, Static271.anInt5844, arg0);
		} else {
			Static174.aClass1_Sub2_Sub16_Sub2_1 = (Class1_Sub2_Sub16_Sub2) Static14.aClass1_Sub2_Sub16_1;
		}
		Static58.aClass1_Sub2_Sub16_2 = Static249.method4264(arg0, Static204.anInt4558, arg1);
		Static156.aClass1_Sub2_Sub16_3 = Static249.method4264(arg0, Static171.anInt3868, arg1);
	}
}

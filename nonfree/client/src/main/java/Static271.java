import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
	public static int anInt5164 = 0;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "[Lclient!wb;")
	public static Class352[] aClass352Array1 = null;

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "[I")
	public static final int[] anIntArray446 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kga", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(FIFF)F")
	public static float method4374(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg1 - arg2) * arg0 + arg2;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
	public static void method4381() {
		@Pc(5) int local5 = 0;
		if (Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994)) {
			local5 = 55;
		}
		if (!Static189.aClass4_Sub2_Sub1_1.aBoolean661) {
			local5 |= 0x40;
		}
		Static203.method3605(local5);
		Static553.aClass288_4.method6423(local5);
		Static195.aClass99_1.method2799(local5);
		Static401.aClass345_2.method7611(local5);
		Static206.aClass275_1.method6051(local5);
		Static414.method5941(local5);
		Static371.method5570(local5);
		Static596.method8015(local5);
		Static518.method7285(local5);
		Static589.method7934();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Z")
	public static boolean method4383() {
		@Pc(10) Class4_Sub5 local10 = (Class4_Sub5) Static238.aClass124_58.method3267();
		if (local10 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local10.anInt453; local21++) {
			if (local10.aClass299Array2[local21] != null && local10.aClass299Array2[local21].anInt7985 == 0) {
				return false;
			}
			if (local10.aClass299Array1[local21] != null && local10.aClass299Array1[local21].anInt7985 == 0) {
				return false;
			}
		}
		return true;
	}
}

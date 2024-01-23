import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "[S")
	public static short[] aShortArray93;

	@OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
	public static int anInt5883;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static int anInt5865 = 0;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	public static int anInt5869 = -1;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "[F")
	public static float[] aFloatArray29 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
	public static int anInt5879 = 0;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public static void method4808() {
		Static19.aClass98_2.method2571();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[Lclient!mi;)V")
	public static void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub21[] arg1) {
		Static44.aClass3_Sub21ArrayArray1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([II)[I")
	public static int[] method4813(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(21) int[] local21 = new int[arg0.length];
			Static326.method4269(arg0, 0, local21, 0, arg0.length);
			return local21;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public static void method4814() {
		for (@Pc(12) int local12 = 0; local12 < Static118.anInt2202; local12++) {
			@Pc(19) int local19 = Static253.anIntArray547[local12];
			@Pc(23) Class10_Sub5_Sub2 local23 = Static110.aClass10_Sub5_Sub2Array1[local19];
			if (local23 != null) {
				Static252.method4274(local23.aClass124_1.anInt3781, local23);
			}
		}
	}
}

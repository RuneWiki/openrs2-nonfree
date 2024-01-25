import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "Lclient!bf;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array12;

	@OriginalMember(owner = "client!rt", name = "U", descriptor = "I")
	public static int anInt6330;

	@OriginalMember(owner = "client!rt", name = "V", descriptor = "[I")
	public static final int[] anIntArray556 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIB)V")
	public static void method4918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static126.aClass67_Sub1_1.anInt5852 != 0 && arg0 != 0 && Static425.anInt7124 < 50 && arg3 != -1) {
			Static246.aClass200Array1[Static425.anInt7124++] = new Class200((byte) 1, arg3, arg0, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!tl;I)Lclient!nr;")
	public static Class43_Sub2 method4919(@OriginalArg(0) Class4_Sub30 arg0) {
		return new Class43_Sub2(arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4887(), arg0.method4887(), arg0.method4864());
	}
}

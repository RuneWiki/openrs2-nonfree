import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt5582;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
	public static void method5011(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static378.anInt6342 = arg0;
		Static68.aClass4_Sub9Array3 = new Class4_Sub9[Static445.anIntArray379[Static378.anInt6342] + 1];
		Static661.anInt10753 = 0;
		Static555.anInt8749 = 0;
	}
}

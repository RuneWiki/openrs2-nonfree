import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	public static int[] anIntArray747;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_173 = new Class44(119, 10);

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static final int[] anIntArray748 = new int[4096];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method8560(@OriginalArg(0) int arg0) {
		if (Static507.anInt8961 == 0) {
			Static558.aClass14_Sub5_Sub2_2.method3904(arg0);
		} else {
			Static352.anInt6508 = arg0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!vea;B)I")
	public static int method8561(@OriginalArg(0) Class363 arg0) {
		if (arg0 == Static532.aClass363_13) {
			return 6407;
		} else if (arg0 == Static238.aClass363_4) {
			return 6408;
		} else if (Static202.aClass363_3 == arg0) {
			return 6406;
		} else if (Static487.aClass363_14 == arg0) {
			return 6409;
		} else if (Static649.aClass363_17 == arg0) {
			return 6410;
		} else if (Static195.aClass363_2 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)V")
	public static void method8563(@OriginalArg(0) int arg0) {
		Static157.anInt3118 = -1;
		Static367.anInt6812 = -1;
		Static397.anInt7311 = arg0;
		Static27.method617();
	}
}

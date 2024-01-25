import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!bn", name = "Jb", descriptor = "Lclient!er;")
	public static Class100_Sub1 aClass100_Sub1_1;

	@OriginalMember(owner = "client!bn", name = "Pb", descriptor = "[Lclient!wu;")
	public static Class394[] aClass394Array1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!bt;B)V")
	public static void method984(@OriginalArg(0) Class34 arg0) {
		Static647.anInt10181 = 0;
		Static505.anInt5822 = 0;
		Static645.aClass236_10 = new Class236();
		Static522.aClass3_Sub3_Sub1_Sub1Array1 = new Class3_Sub3_Sub1_Sub1[1024];
		Static649.aClass3_Sub7Array1 = new Class3_Sub7[Static619.anIntArray668[Static290.anInt4596] + 1];
		Static470.anInt7470 = 0;
		Static101.anInt2072 = 0;
		Static233.method3359(arg0);
		Static587.method7740(arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!dw;I)I")
	public static int method995(@OriginalArg(0) Class79 arg0) {
		if (arg0 == Static111.aClass79_4) {
			return 5120;
		} else if (Static111.aClass79_5 == arg0) {
			return 5122;
		} else if (Static111.aClass79_6 == arg0) {
			return 5124;
		} else if (arg0 == Static111.aClass79_7) {
			return 5121;
		} else if (Static111.aClass79_8 == arg0) {
			return 5123;
		} else if (arg0 == Static111.aClass79_9) {
			return 5125;
		} else if (arg0 == Static111.aClass79_10) {
			return 5131;
		} else if (Static111.aClass79_11 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}

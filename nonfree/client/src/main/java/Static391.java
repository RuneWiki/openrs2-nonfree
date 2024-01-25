import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static391 {

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "Z")
	public static boolean aBoolean552 = false;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!ct;)I")
	public static int method5904(@OriginalArg(1) Class58 arg0) {
		if (Static143.aClass58_1 == arg0) {
			return 5890;
		} else if (Static653.aClass58_4 == arg0) {
			return 34167;
		} else if (Static273.aClass58_2 == arg0) {
			return 34168;
		} else if (Static472.aClass58_3 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BLclient!av;)V")
	public static void method5905(@OriginalArg(1) Class20 arg0) {
		if (Static524.anInt8917 == arg0.anInt548) {
			Static195.aBooleanArray17[arg0.anInt535] = true;
		}
	}
}

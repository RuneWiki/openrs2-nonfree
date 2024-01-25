import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	public static int method2537(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIB)Z")
	public static boolean method2538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static491.aClass58_8.method9519(arg2, arg0, arg1, Static464.anIntArray743);
		@Pc(13) int local13 = Static464.anIntArray743[2];
		if (local13 < 50) {
			return false;
		} else {
			Static464.anIntArray743[1] = Static464.anIntArray743[1] * Static446.anInt6828 / local13 + Static325.anInt5274;
			Static464.anIntArray743[2] = local13;
			Static464.anIntArray743[0] = Static456.anInt7115 * Static464.anIntArray743[0] / local13 + Static351.anInt5574;
			return true;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ika;I)V")
	public static void method2539(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (Static169.aClass203_1 == null) {
			return;
		}
		try {
			Static169.aClass203_1.method4768(0L);
			Static169.aClass203_1.method4766(24, arg1.aByteArray20, arg0);
		} catch (@Pc(16) Exception local16) {
		}
	}
}

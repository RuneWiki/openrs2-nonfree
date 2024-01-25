import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static413 {

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "[I")
	public static final int[] anIntArray416 = new int[2];

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
	public static int anInt6991 = 0;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZIIII)V")
	public static void method6090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static577.aClass5_Sub19_25.aClass17_Sub15_2.method5251() != 0 && arg0 != 0 && Static65.anInt1087 < 50 && arg2 != -1) {
			Static24.aClass248Array1[Static65.anInt1087++] = new Class248((byte) 1, arg2, arg0, arg4, arg1, arg5, arg3, (Class4_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!eh;I)I")
	public static int method6091(@OriginalArg(0) Class94 arg0) {
		if (arg0 == Static164.aClass94_1) {
			return 7681;
		} else if (Static653.aClass94_5 == arg0) {
			return 8448;
		} else if (Static280.aClass94_2 == arg0) {
			return 34165;
		} else if (Static618.aClass94_4 == arg0) {
			return 260;
		} else if (arg0 == Static461.aClass94_3) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}

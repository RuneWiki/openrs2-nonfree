import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	public static int anInt3716;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
	public static final int[] anIntArray506 = new int[2500];

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method3347() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static276.aBooleanArray27[local5] = true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!s;Lclient!s;)V")
	public static void method3348(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		if (arg0.aClass7_248 != null) {
			arg0.method5648();
		}
		arg0.aClass7_247 = arg1;
		arg0.aClass7_248 = arg1.aClass7_248;
		arg0.aClass7_248.aClass7_247 = arg0;
		arg0.aClass7_247.aClass7_248 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static307.anInt5866 = arg2;
		Static129.anInt2828 = arg0;
		Static33.anInt736 = arg3;
		Static134.anInt2896 = arg5;
		Static129.anInt2829 = arg4;
		Static16.anInt2948 = arg1;
	}
}

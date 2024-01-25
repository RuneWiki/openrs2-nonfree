import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt2946;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	public static int anInt2947 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method2653() {
		Static586.aClass310_40.method6605();
		Static97.aClass310_8.method6605();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method2654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static87.method1968(arg1)) {
			if (Static267.aClass203ArrayArray2[arg1] == null) {
				Static4.method58(arg5, arg0, arg3, arg2, arg7, -1, Static59.aClass203ArrayArray3[arg1], arg4, arg6);
			} else {
				Static4.method58(arg5, arg0, arg3, arg2, arg7, -1, Static267.aClass203ArrayArray2[arg1], arg4, arg6);
			}
		} else if (arg0 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static253.aBooleanArray17[local19] = true;
			}
		} else {
			Static253.aBooleanArray17[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!lk;B)V")
	public static void method2656(@OriginalArg(0) Class203 arg0) {
		if (arg0.anInt5514 == Static304.anInt5464) {
			Static253.aBooleanArray17[arg0.anInt5457] = true;
		}
	}
}

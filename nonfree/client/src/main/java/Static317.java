import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BII)V")
	public static void method5512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static214.aClass20_7 == null) {
			return;
		}
		@Pc(17) int local17 = Static228.anInt5033;
		@Pc(19) int local19 = Static548.anInt9814;
		Static345.method5920(arg0, arg1);
		if (Static66.anInt10075 == 0) {
			Static208.anInterface14_1 = null;
			Static208.anInterface14_1 = Static214.aClass20_7.method7237(Static214.aClass20_7.method7268(Static37.anInt816, Static506.anInt9325), Static214.aClass20_7.method7227(Static37.anInt816, Static506.anInt9325));
		} else if (Static66.anInt10075 == 1 && (Static326.anInterface14Array1 == null || Static228.anInt5033 != local17 || local19 != Static548.anInt9814)) {
			Static326.anInterface14Array1 = new Interface14[Static548.anInt9814 * Static228.anInt5033];
			for (@Pc(64) int local64 = 0; local64 < Static326.anInterface14Array1.length; local64++) {
				Static326.anInterface14Array1[local64] = Static214.aClass20_7.method7237(Static214.aClass20_7.method7268(Static267.anInt5684, Static11.anInt6559), Static214.aClass20_7.method7227(Static267.anInt5684, Static11.anInt6559));
			}
			Static380.anIntArray468 = new int[Static228.anInt5033 * Static548.anInt9814];
			Static579.anInt10337 = 1;
		}
		Static240.aBoolean380 = true;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIBZI)V")
	public static void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static328.method5643();
		Static240.aLong113 = 0L;
		@Pc(10) int local10 = Static89.method2478();
		if (arg0 == 3 || local10 == 3) {
			arg2 = true;
		}
		if (!Static186.aClass20_4.method7298()) {
			arg2 = true;
		}
		Static498.method7726(arg2, arg1, local10, arg0, arg3);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIII)I")
	public static int method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < arg2) {
			return arg2;
		} else if (arg0 >= arg1) {
			return arg1;
		} else {
			return arg0;
		}
	}
}

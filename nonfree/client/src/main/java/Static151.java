import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static int anInt3238 = 2;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public static int anInt3239 = 0;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
	public static final int[] anIntArray423 = new int[32];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZII)V")
	public static void method2963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(1, arg1);
		local13.method4790();
		local13.anInt5687 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!ap;)Lclient!iq;")
	public static Class43_Sub2 method2965(@OriginalArg(1) Class7_Sub3 arg0) {
		return new Class43_Sub2(arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2791(), arg0.method2772());
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public static void method2966() {
		@Pc(1) Class103 local1 = Static329.aClass103_65;
		synchronized (Static329.aClass103_65) {
			Static329.aClass103_65.method2678();
		}
		local1 = Static103.aClass103_22;
		synchronized (Static103.aClass103_22) {
			Static103.aClass103_22.method2678();
		}
		local1 = Static269.aClass103_56;
		synchronized (Static269.aClass103_56) {
			Static269.aClass103_56.method2678();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIILclient!bi;III)V")
	public static void method2967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static103.aBoolean171) {
			Static78.anInt6335 = 32;
		} else {
			Static78.anInt6335 = 0;
		}
		Static103.aBoolean171 = false;
		@Pc(121) int local121;
		if (Static180.anInt3668 != 0) {
			if (arg0 >= arg2 && arg0 < arg2 + 16 && arg1 <= arg4 && arg1 + 16 > arg4) {
				arg3.anInt499 -= 4;
				Static245.method4226(arg3);
			} else if (arg2 <= arg0 && arg2 + 16 > arg0 && arg1 + arg6 - 16 <= arg4 && arg1 + arg6 > arg4) {
				arg3.anInt499 += 4;
				Static245.method4226(arg3);
			} else if (arg0 >= arg2 - Static78.anInt6335 && arg2 + Static78.anInt6335 + 16 > arg0 && arg1 + 16 <= arg4 && arg6 + arg1 - 16 > arg4) {
				local121 = (arg6 - 32) * arg6 / arg5;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(138) int local138 = arg4 - arg1 - local121 / 2 - 16;
				@Pc(145) int local145 = arg6 - local121 - 32;
				arg3.anInt499 = local138 * (arg5 - arg6) / local145;
				Static245.method4226(arg3);
				Static103.aBoolean171 = true;
			}
		}
		if (Static111.anInt2544 == 0) {
			return;
		}
		local121 = arg3.anInt523;
		if (arg2 - local121 <= arg0 && arg1 <= arg4 && arg0 < arg2 + 16 && arg6 + arg1 >= arg4) {
			arg3.anInt499 += Static111.anInt2544 * 45;
			Static245.method4226(arg3);
			return;
		}
	}
}

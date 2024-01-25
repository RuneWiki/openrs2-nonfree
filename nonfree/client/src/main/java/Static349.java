import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Lclient!nl;")
	public static Class171 aClass171_71;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public static int anInt4698 = 0;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!un", name = "D", descriptor = "Z")
	public static boolean aBoolean351 = true;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static348.method5096(arg5)) {
			Static204.method3470(arg2, -1, arg7, arg4, arg6, arg1, arg0, arg3, Static183.aClass4ArrayArray1[arg5]);
		} else if (arg1 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static331.aBooleanArray30[local23] = true;
			}
		} else {
			Static331.aBooleanArray30[arg1] = true;
		}
	}
}

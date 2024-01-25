import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public static int anInt1607;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_21 = new Class244(49, 0);

	@OriginalMember(owner = "client!e", name = "G", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public static int anInt1616 = 0;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_27 = new Class57("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!e", name = "L", descriptor = "F")
	public static float aFloat11 = 0.0F;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method1308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static212.method3305(arg6)) {
			if (Static181.aClass62ArrayArray1[arg6] == null) {
				Static368.method5523(-1, arg3, arg5, arg0, arg4, Static375.aClass62ArrayArray2[arg6], arg2, arg1, arg7);
			} else {
				Static368.method5523(-1, arg3, arg5, arg0, arg4, Static181.aClass62ArrayArray1[arg6], arg2, arg1, arg7);
			}
		} else if (arg3 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static109.aBooleanArray45[local14] = true;
			}
		} else {
			Static109.aBooleanArray45[arg3] = true;
		}
	}
}

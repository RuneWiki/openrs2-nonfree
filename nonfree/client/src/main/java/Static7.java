import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "Lclient!je;")
	public static final Class127 aClass127_1 = new Class127(2, 4, 4, 0);

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
	public static int anInt120 = -1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Z")
	public static boolean method78(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V")
	public static void method79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class81 local3 = new Class81();
		local3.anInt2401 = arg1 >> Static286.anInt5018;
		local3.anInt2398 = arg2 >> Static286.anInt5018;
		local3.anInt2387 = arg3 >> Static286.anInt5018;
		local3.anInt2402 = arg4 >> Static286.anInt5018;
		local3.anInt2388 = arg0;
		local3.anInt2393 = arg1;
		local3.anInt2386 = arg2;
		local3.anInt2385 = arg3;
		local3.anInt2384 = arg4;
		local3.anInt2397 = arg5;
		local3.anInt2403 = arg6;
		Static82.aClass81Array2[Static447.anInt6547++] = local3;
	}
}

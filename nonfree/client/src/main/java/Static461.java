import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!s", name = "L", descriptor = "Lclient!uea;")
	public static Class15_Sub2_Sub4_Sub2 aClass15_Sub2_Sub4_Sub2_2;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_135 = new Class98(25, 6);

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_104 = new Class316(74, 7);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[SI)[S")
	public static short[] method6451(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static596.method7722(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static173.method2703(arg1, arg0) & Static337.method5191(arg0, arg1);
	}
}

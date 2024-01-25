import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
	public static int anInt7114;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IBI)Z")
	public static boolean method5849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static436.method6739(arg1, arg0) & Static605.method7725(arg0, arg1);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(FIIFF)F")
	public static float method5850(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(15) float[] local15 = Static503.aFloatArrayArray18[arg1];
		return local15[2] * arg3 + local15[0] * arg2 + arg0 * local15[1];
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	public static void method5852() {
		Static572.aClass236_98.method6253();
		Static529.aClass236_87.method6253();
		Static385.aClass236_99.method6253();
		Static479.aClass236_80.method6253();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!st;")
	public static RuntimeException_Sub1 method5853(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString94 = local12.aString94 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}

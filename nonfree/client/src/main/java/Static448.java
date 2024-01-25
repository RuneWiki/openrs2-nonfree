import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[Lclient!ir;")
	public static final Class1_Sub2_Sub9[] aClass1_Sub2_Sub9Array4 = new Class1_Sub2_Sub9[14];

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
	public static long aLong216 = 0L;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZB)V")
	public static void method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static4.aLong11 = 0L;
		@Pc(8) int local8 = Static432.method5740();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static415.aClass39_11.method4505()) {
			arg3 = true;
		}
		Static91.method1653(arg1, arg3, arg2, local8, arg0);
	}
}

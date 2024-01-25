import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!uv;B)V")
	public static void method8646(@OriginalArg(0) Class23_Sub2_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class23_Sub2_Sub1_Sub2_Sub2) {
			@Pc(32) Class23_Sub2_Sub1_Sub2_Sub2 local32 = (Class23_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local32.aClass5_1 != null) {
				Static146.method2533(local32.aByte142 != Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142, local32);
			}
		} else if (arg0 instanceof Class23_Sub2_Sub1_Sub2_Sub1) {
			@Pc(12) Class23_Sub2_Sub1_Sub2_Sub1 local12 = (Class23_Sub2_Sub1_Sub2_Sub1) arg0;
			Static245.method3918(local12, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 != local12.aByte142);
		}
	}
}

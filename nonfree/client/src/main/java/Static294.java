import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public static int anInt5059;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "[[Lclient!vg;")
	public static Class341[][] aClass341ArrayArray1;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method4126(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub11 local12 = Static276.method3885(Static2.aClass70_1, Static481.aClass276_2);
		local12.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0) + 1);
		local12.aClass1_Sub35_Sub2_1.method5761(arg0);
		local12.aClass1_Sub35_Sub2_1.method5756(arg1);
		Static48.method743(local12);
	}
}

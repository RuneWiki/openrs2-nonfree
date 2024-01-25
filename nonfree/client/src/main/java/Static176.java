import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
	public static int anInt2869 = -1;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V")
	public static void method2359() {
		Static422.aClass167_96.method3390();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!se;)V")
	public static void method2361(@OriginalArg(1) Class20_Sub3_Sub3_Sub2 arg0) {
		for (@Pc(15) Class1_Sub42 local15 = (Class1_Sub42) Static24.aClass254_3.method5437(); local15 != null; local15 = (Class1_Sub42) Static24.aClass254_3.method5433()) {
			if (arg0 == local15.aClass20_Sub3_Sub3_Sub2_1) {
				if (local15.aClass1_Sub9_Sub1_3 != null) {
					Static155.aClass1_Sub9_Sub2_1.method1038(local15.aClass1_Sub9_Sub1_3);
					local15.aClass1_Sub9_Sub1_3 = null;
				}
				local15.method5617();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(III)Lclient!wo;")
	public static Class20_Sub4 method2362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub4_2;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)I")
	public static int method2363(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}

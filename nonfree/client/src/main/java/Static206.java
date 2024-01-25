import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)Lclient!gfa;")
	public static Class116 method2649(@OriginalArg(0) int arg0) {
		@Pc(6) Class116[] local6 = Static87.method2044();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (local6[local8].anInt3326 == arg0) {
				return local6[local8];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method2650(@OriginalArg(0) Class44 arg0) {
		for (@Pc(18) Class1_Sub2 local18 = (Class1_Sub2) Static128.aClass136_4.method3288(); local18 != null; local18 = (Class1_Sub2) Static128.aClass136_4.method3286()) {
			if (local18.aBoolean22) {
				local18.method332(arg0);
			}
		}
	}
}

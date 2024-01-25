import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
	public static int anInt223;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
	public static int method244(@OriginalArg(1) int arg0) {
		@Pc(14) byte local14;
		if (arg0 > 12000) {
			Static216.method3141();
			local14 = 4;
		} else if (arg0 > 5000) {
			Static478.method6996();
			local14 = 3;
		} else if (arg0 > 2000) {
			Static551.method7237();
			local14 = 2;
		} else {
			local14 = 1;
			Static489.method7094();
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 2) {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 2);
			Static646.method8805(2, false);
		}
		Static633.method8698();
		return local14;
	}
}

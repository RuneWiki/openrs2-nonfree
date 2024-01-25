import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!vp;)Lclient!qi;")
	public static Class290 method2362(@OriginalArg(1) Class4_Sub2_Sub1 arg0) {
		@Pc(15) Class290 local15;
		if (Static316.aClass290_1 == null) {
			local15 = new Class290();
		} else {
			local15 = Static316.aClass290_1;
			Static316.aClass290_1 = Static316.aClass290_1.aClass290_3;
			Static55.anInt1105--;
			local15.aClass290_3 = null;
		}
		local15.aClass4_Sub2_Sub1_1 = arg0;
		return local15;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I")
	public static int method2363(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}

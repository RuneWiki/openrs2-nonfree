import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "[Lclient!gu;")
	public static Class119_Sub1[] aClass119_Sub1Array2 = new Class119_Sub1[0];

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public static int anInt9197 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!np;)Lclient!cba;")
	public static Class37_Sub1 method7598(@OriginalArg(1) Class3_Sub11 arg0) {
		return new Class37_Sub1(arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5230(), arg0.method5230(), arg0.method5175());
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
	public static void method7599() {
		@Pc(5) int local5 = 0;
		if (Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312)) {
			local5 = 55;
		}
		if (!Static405.aClass3_Sub3_Sub1_1.aBoolean579) {
			local5 |= 0x40;
		}
		Static330.method4727(local5);
		Static478.aClass212_3.method4792(local5);
		Static6.aClass92_1.method2683(local5);
		Static361.aClass229_13.method5393(local5);
		Static368.aClass278_1.method6125(local5);
		Static91.method1722(local5);
		Static3.method5710(local5);
		Static461.method6415(local5);
		Static484.method6596(local5);
		Static444.method6194();
	}
}

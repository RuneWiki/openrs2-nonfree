import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static257 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!wfa;Lclient!wfa;I)V")
	public static void method4282(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg1.aClass3_Sub4_67 != null) {
			arg1.method8732();
		}
		arg1.aClass3_Sub4_66 = arg0;
		arg1.aClass3_Sub4_67 = arg0.aClass3_Sub4_67;
		arg1.aClass3_Sub4_67.aClass3_Sub4_66 = arg1;
		arg1.aClass3_Sub4_66.aClass3_Sub4_67 = arg1;
	}
}

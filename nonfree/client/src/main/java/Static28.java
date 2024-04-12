import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!p;")
	public static Class45 aClass45_15;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ud;")
	public static Class5 aClass5_10;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt725;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 7)
	public static void method584() {
		aClass45_15 = null;
		aClass2_Sub2_Sub2_Sub4Array5 = null;
		aClass5_10 = null;
		Class22.aByteArrayArray8 = null;
		Class22.aClass40_220 = null;
		Class22.aClass40_223 = null;
		Class22.aClass40_221 = null;
		Class22.aClass40_222 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bb;ZB)Z", line = 45)
	public static boolean method585(@OriginalArg(0) Class7 arg0, @OriginalArg(1) boolean arg1) {
		Class15.anInt432 = 20;
		try {
			Static98.aClass12_1 = (Class12) Class.forName("Class12_Sub1_Sub2").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface3 local17 = arg0.method205();
			if (local17 != null) {
				Static98.aClass12_1 = new Class12_Sub1_Sub1(arg0, local17);
				return true;
			} else if (arg1) {
				Static98.aClass12_1 = new Class12_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}
}

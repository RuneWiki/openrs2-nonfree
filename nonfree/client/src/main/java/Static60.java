import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!uc;")
	public static Class198 aClass198_16 = new Class198(128);

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public static int anInt1277 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1002() {
		if (Static348.aClass30_2 != null) {
			Static348.aClass30_2.method4510();
		}
		if (Static194.aClass30_1 != null) {
			Static194.aClass30_1.method4510();
		}
		Static11.method174(Static149.aBoolean162);
		Static348.aClass30_2 = Static158.method2503(Static353.aClass42_5, 0, 22050, Static295.aCanvas4);
		Static348.aClass30_2.method4518(Static2.aClass3_Sub2_Sub4_1);
		Static194.aClass30_1 = Static158.method2503(Static353.aClass42_5, 1, 2048, Static295.aCanvas4);
		Static194.aClass30_1.method4518(Static273.aClass3_Sub2_Sub2_2);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!dr;")
	public static Class49 method1003(@OriginalArg(0) int arg0) {
		@Pc(10) Class49 local10 = (Class49) Static18.aClass198_7.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static230.aClass100_125.method2319(30, arg0);
		local10 = new Class49();
		if (local25 != null) {
			local10.method1090(new Class3_Sub4(local25), arg0);
		}
		Static18.aClass198_7.method5231((long) arg0, local10);
		return local10;
	}
}

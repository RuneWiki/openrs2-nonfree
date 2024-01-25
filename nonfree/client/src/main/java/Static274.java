import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
	public static int anInt5136;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
	public static int anInt5132 = 0;

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	public static void method3926() {
		try {
			if (Static27.anInt461 == 1) {
				@Pc(12) int local12 = Static56.aClass4_Sub15_Sub1_1.method1437();
				if (local12 > 0 && Static56.aClass4_Sub15_Sub1_1.method1434()) {
					local12 -= Static47.anInt811;
					if (local12 < 0) {
						local12 = 0;
					}
					Static56.aClass4_Sub15_Sub1_1.method1428(local12);
					return;
				}
				Static56.aClass4_Sub15_Sub1_1.method1440();
				Static56.aClass4_Sub15_Sub1_1.method1441();
				Static419.aClass171_1 = null;
				if (Static236.aClass76_49 == null) {
					Static27.anInt461 = 0;
				} else {
					Static27.anInt461 = 2;
				}
				Static143.aClass4_Sub30_2 = null;
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static56.aClass4_Sub15_Sub1_1.method1440();
			Static236.aClass76_49 = null;
			Static27.anInt461 = 0;
			Static419.aClass171_1 = null;
			Static143.aClass4_Sub30_2 = null;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)Lclient!jv;")
	public static Class123 method3927(@OriginalArg(1) int arg0) {
		@Pc(10) Class123 local10 = (Class123) Static356.aClass68_43.method1787((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static146.aClass76_4.method2104(arg0, 0);
		local10 = new Class123();
		if (local20 != null) {
			local10.method3114(new Class4_Sub12(local20));
		}
		local10.method3115();
		Static356.aClass68_43.method1779((long) arg0, local10);
		return local10;
	}
}

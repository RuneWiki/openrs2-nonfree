import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_571 = Static65.method1172("Fps:");

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_572 = Static65.method1172("jolt");

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_573 = Static65.method1172("leuchten3:");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1145() {
		try {
			if (Static22.anInt527 == 1) {
				@Pc(15) int local15 = Static125.aClass3_Sub5_Sub2_2.method2306();
				if (local15 > 0 && Static125.aClass3_Sub5_Sub2_2.method2287()) {
					local15 -= Static130.anInt3073;
					if (local15 < 0) {
						local15 = 0;
					}
					Static125.aClass3_Sub5_Sub2_2.method2315(local15);
				} else {
					Static125.aClass3_Sub5_Sub2_2.method2310();
					Static125.aClass3_Sub5_Sub2_2.method2298();
					if (Static88.aClass44_15 == null) {
						Static22.anInt527 = 0;
					} else {
						Static22.anInt527 = 2;
					}
					Static21.aClass61_2 = null;
					Static157.aClass3_Sub21_1 = null;
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static125.aClass3_Sub5_Sub2_2.method2310();
			Static22.anInt527 = 0;
			Static157.aClass3_Sub21_1 = null;
			Static21.aClass61_2 = null;
			Static88.aClass44_15 = null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lclient!rc;")
	public static Class3_Sub2_Sub12 method1146(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub12 local10 = (Class3_Sub2_Sub12) Static38.aClass57_10.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static1.aClass44_1.method1624(3, arg0);
		local10 = new Class3_Sub2_Sub12();
		if (local20 != null) {
			local10.method2343(new Class3_Sub4(local20));
		}
		Static38.aClass57_10.method1717(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1147() {
		aClass46_571 = null;
		aClass46_573 = null;
		aClass46_572 = null;
	}
}

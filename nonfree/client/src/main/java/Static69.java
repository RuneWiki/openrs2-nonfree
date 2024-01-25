import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!di", name = "U", descriptor = "Lclient!hk;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!di", name = "V", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_86 = new Class123(75, -1);

	@OriginalMember(owner = "client!di", name = "R", descriptor = "I")
	public static int anInt1815 = 0;

	@OriginalMember(owner = "client!di", name = "W", descriptor = "I")
	public static final int anInt1818 = 1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!he;B)I")
	public static int method1413(@OriginalArg(0) Class100 arg0) {
		@Pc(13) int local13 = 0;
		if (arg0.method2492(Static231.anInt7985)) {
			local13++;
		}
		if (arg0.method2492(Static367.anInt6660)) {
			local13++;
		}
		if (arg0.method2492(Static369.anInt4261)) {
			local13++;
		}
		if (arg0.method2492(Static257.anInt4679)) {
			local13++;
		}
		if (arg0.method2492(Static392.anInt5059)) {
			local13++;
		}
		if (arg0.method2492(Static133.anInt6880)) {
			local13++;
		}
		if (arg0.method2492(Static211.anInt3898)) {
			local13++;
		}
		if (arg0.method2492(Static67.anInt1775)) {
			local13++;
		}
		if (arg0.method2492(Static284.anInt5108)) {
			local13++;
		}
		if (arg0.method2492(Static321.anInt5549)) {
			local13++;
		}
		if (arg0.method2492(Static209.anInt2669)) {
			local13++;
		}
		if (arg0.method2492(Static276.anInt4961)) {
			local13++;
		}
		if (arg0.method2492(Static78.anInt1956)) {
			local13++;
		}
		if (arg0.method2492(Static403.anInt7238)) {
			local13++;
		}
		if (arg0.method2492(Static86.anInt1025)) {
			local13++;
		}
		if (arg0.method2492(Static6.anInt255)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
	public static void method1414() {
		Static420.anInt7505 = 0;
		Static346.anInt6243 = -1;
		Static114.anInt5655 = -1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!so;B)V")
	public static void method1415(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(11) Class6_Sub19 local11 = (Class6_Sub19) Static418.aClass74_32.method1883((long) arg0.anInt6602);
		if (local11 == null) {
			return;
		}
		if (local11.aClass6_Sub4_Sub1_3 != null) {
			Static360.aClass6_Sub4_Sub4_2.method5907(local11.aClass6_Sub4_Sub1_3);
			local11.aClass6_Sub4_Sub1_3 = null;
		}
		local11.method6525();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "Lclient!mn;")
	public static Class171 aClass171_31;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_54 = new Class25(84, 6);

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!fn", name = "R", descriptor = "[Lclient!ec;")
	public static Class65_Sub1[] aClass65_Sub1Array1 = new Class65_Sub1[0];

	@OriginalMember(owner = "client!fn", name = "T", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!fn", name = "U", descriptor = "Lclient!bi;")
	public static Class25 aClass25_55 = null;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class129 method1914(@OriginalArg(1) int arg0) {
		@Pc(8) Class129[] local8 = Static363.method5115();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class129 local24 = local8[local18];
			if (arg0 == local24.anInt3357) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
	public static void method1915() {
		for (@Pc(10) Class28_Sub1 local10 = (Class28_Sub1) Static315.aClass97_4.method2145(); local10 != null; local10 = (Class28_Sub1) Static315.aClass97_4.method2148()) {
			local10.method537();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1916(@OriginalArg(1) String arg0) {
		return Static311.method4465(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZI)V")
	public static void method1917(@OriginalArg(2) boolean arg0) {
		Static150.anInt7358 = 22050;
		Static426.anInt7251 = 2;
		Static240.aBoolean266 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)V")
	public static void method1919() {
		if (Static129.anInt2192 == 6) {
			Static129.anInt2192 = 7;
		}
	}
}

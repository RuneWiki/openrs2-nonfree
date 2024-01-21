import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_6;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Lclient!ie;")
	public static Class35 aClass35_6;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "Lclient!id;")
	private static Class34 aClass34_400 = Static9.method266("Loaded fonts");

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_401 = Static9.method266("");

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Lclient!id;")
	private static Class34 aClass34_403 = Static9.method266("Hidden");

	@OriginalMember(owner = "client!db", name = "G", descriptor = "Lclient!id;")
	public static Class34 aClass34_402 = aClass34_403;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Lclient!id;")
	public static Class34 aClass34_404 = aClass34_400;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method460() {
		try {
			if (Static55.aClass46_1 == null) {
				Static55.aClass46_1 = new Class46(Static100.aClass15_4, Static91.method1554(new Class34[] { Static133.aClass34_1594, Static81.aClass34_1057, Static105.aClass34_1301 }).method987());
			} else {
				@Pc(36) byte[] local36 = Static55.aClass46_1.method1254();
				if (local36 != null) {
					@Pc(43) Class1_Sub19 local43 = new Class1_Sub19(local36);
					Static43.anInt1240 = local43.method2051();
					Static71.aClass18Array1 = new Class18[Static43.anInt1240];
					for (@Pc(52) int local52 = 0; local52 < Static43.anInt1240; local52++) {
						@Pc(62) Class18 local62 = Static71.aClass18Array1[local52] = new Class18();
						@Pc(66) int local66 = local43.method2051();
						local62.anInt886 = local66 & 0x7FFF;
						local62.aBoolean45 = (local66 & 0x8000) != 0;
						local62.aClass34_438 = local43.method2084();
						local62.anInt894 = local43.method2064();
						local62.anInt893 = local52;
						local62.anInt892 = Static97.method1644(local62.aClass34_438);
					}
					Static39.method684(Static92.anIntArray306, Static71.aClass18Array1.length - 1, Static24.anIntArray82, 0, Static71.aClass18Array1);
					Static55.aClass46_1 = null;
					Static110.aBoolean136 = true;
				}
			}
		} catch (@Pc(126) Exception local126) {
			local126.printStackTrace();
			Static55.aClass46_1 = null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I")
	public static int method461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(30) int local30 = Static46.method866(local7, local17);
		@Pc(39) int local39 = Static46.method866(local7 + 1, local17);
		@Pc(46) int local46 = Static46.method866(local7, local17 + 1);
		@Pc(55) int local55 = Static46.method866(local7 + 1, local17 + 1);
		@Pc(62) int local62 = Static123.method1936(local30, arg2, local13, local39);
		@Pc(69) int local69 = Static123.method1936(local46, arg2, local13, local55);
		return Static123.method1936(local62, arg2, local23, local69);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Lclient!td;")
	public static Class1_Sub1_Sub14 method463(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub14 local10 = (Class1_Sub1_Sub14) Static97.aClass63_17.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static128.aClass35_34.method1573(5, arg0);
		local10 = new Class1_Sub1_Sub14();
		if (local20 != null) {
			local10.method1865(new Class1_Sub19(local20));
		}
		Static97.aClass63_17.method1659(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method465() {
		aClass1_Sub1_Sub9_1 = null;
		aClass1_Sub9_6 = null;
		aClass34_403 = null;
		anIntArray80 = null;
		aClass35_6 = null;
		aClass34_400 = null;
		aClass34_401 = null;
		aClass34_402 = null;
		aClass34_404 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method466(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}

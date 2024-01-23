import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!d", name = "X", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "Lclient!ve;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
	public static int anInt744 = 0;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_245 = Static231.method3737("null");

	@OriginalMember(owner = "client!d", name = "V", descriptor = "Lclient!sc;")
	private static Class107 aClass107_246 = Static231.method3737("Loaded input handler");

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "Lclient!sc;")
	private static Class107 aClass107_248 = Static231.method3737("K");

	@OriginalMember(owner = "client!d", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_247 = aClass107_248;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_249 = aClass107_248;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_251 = aClass107_246;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	public static void method694() {
		Static61.aClass61_22.method1695(5);
		Static184.aClass61_71.method1695(5);
		Static122.aClass61_51.method1695(5);
		Static85.aClass61_29.method1695(5);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ej;I)V")
	public static void method697(@OriginalArg(0) Class34 arg0) {
		@Pc(7) Class39 local7 = null;
		try {
			@Pc(12) Class84 local12 = arg0.method1060("runescape");
			while (local12.anInt3171 == 0) {
				Static148.method2431(1L);
			}
			if (local12.anInt3171 == 1) {
				local7 = (Class39) local12.anObject4;
				@Pc(35) Class1_Sub26 local35 = Static12.method324();
				local7.method1203(0, local35.aByteArray52, local35.anInt4021);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method1200();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method698(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg1;
			return arg0 ? Static113.method1956(local17) : local17;
		} else if (arg1 instanceof Class16) {
			@Pc(31) Class16 local31 = (Class16) arg1;
			return local31.method1729();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!vf;)Lclient!fb;")
	public static Class1_Sub1 method699(@OriginalArg(1) Class1_Sub26 arg0) {
		arg0.method2945();
		@Pc(11) int local11 = arg0.method2945();
		@Pc(15) Class1_Sub1 local15 = Static177.method2807(local11);
		local15.anInt4947 = arg0.method2945();
		@Pc(24) int local24 = arg0.method2945();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(35) int local35 = arg0.method2945();
			local15.method3711(arg0, local35);
		}
		local15.method3716();
		return local15;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
	public static void method701() {
		Static186.aClass61_72.method1689();
		Static188.aClass61_73.method1689();
		Static110.aClass61_44.method1689();
	}
}

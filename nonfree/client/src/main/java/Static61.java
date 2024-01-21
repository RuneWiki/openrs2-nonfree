import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!gh", name = "cc", descriptor = "[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] aClass4_Sub1_Sub7_Sub3Array7;

	@OriginalMember(owner = "client!gh", name = "dc", descriptor = "[Lclient!dh;")
	public static Class4_Sub6[] aClass4_Sub6Array1;

	@OriginalMember(owner = "client!gh", name = "ec", descriptor = "I")
	public static int anInt1637;

	@OriginalMember(owner = "client!gh", name = "gc", descriptor = "I")
	public static int anInt1639;

	@OriginalMember(owner = "client!gh", name = "Xb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_596 = Static177.method3050("Choose Option");

	@OriginalMember(owner = "client!gh", name = "Mb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_595 = aClass46_596;

	@OriginalMember(owner = "client!gh", name = "bc", descriptor = "[Lclient!oh;")
	public static final Class68[] aClass68Array1 = new Class68[6];

	@OriginalMember(owner = "client!gh", name = "fc", descriptor = "I")
	public static int anInt1638 = 0;

	@OriginalMember(owner = "client!gh", name = "jc", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_599 = Static177.method3050("Error loading your profile)3");

	@OriginalMember(owner = "client!gh", name = "hc", descriptor = "Lclient!jd;")
	public static Class46 aClass46_597 = aClass46_599;

	@OriginalMember(owner = "client!gh", name = "ic", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_598 = Static177.method3050("auf der Hautpseite)3");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method1281(@OriginalArg(1) Class46 arg0) {
		if (aClass4_Sub6Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(16) long local16 = arg0.method1646();
		if (local16 == 0L) {
			return;
		}
		while (aClass4_Sub6Array1.length > local10 && aClass4_Sub6Array1[local10].aLong148 != local16) {
			local10++;
		}
		if (aClass4_Sub6Array1.length > local10 && aClass4_Sub6Array1[local10] != null) {
			Static90.aClass4_Sub11_Sub1_1.method1285(6);
			Static90.aClass4_Sub11_Sub1_1.method1269(aClass4_Sub6Array1[local10].aLong148);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method1282(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static118.aBoolean121) {
			try {
				@Pc(23) Class50 local23 = (Class50) Class.forName("Class50_Sub1").getDeclaredConstructor().newInstance();
				local23.method2230(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static118.aBoolean121 = true;
			}
		}
		return arg0;
	}
}

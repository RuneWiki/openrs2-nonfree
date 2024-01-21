import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public static int anInt1804;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt1806;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public static int anInt1803 = 0;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!kc;")
	private static Class36 aClass36_883 = Static14.method2017("Loaded title screen");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!bb;")
	public static Class8 aClass8_5 = new Class8();

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_884 = aClass36_883;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt1810 = 0;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!kc;")
	private static Class36 aClass36_885 = Static14.method2017("The server is being updated)3");

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_886 = aClass36_885;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	public static volatile int anInt1811 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!ed;")
	public static Class2_Sub1_Sub6 method1274(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static42.aClass2_Sub1_Sub6ArrayArray1[local16] == null || Static42.aClass2_Sub1_Sub6ArrayArray1[local16][local12] == null) {
			@Pc(30) boolean local30 = Static33.method328(local16);
			if (!local30) {
				return null;
			}
		}
		return Static42.aClass2_Sub1_Sub6ArrayArray1[local16][local12];
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(BI)V")
	public static void method1275(@OriginalArg(1) int arg0) {
		Static83.method1505(arg0);
		Static90.method1647(arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIB)I")
	public static int method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1277() {
		aClass36_886 = null;
		aClass8_5 = null;
		aClass36_883 = null;
		aClass36_884 = null;
		aClass36_885 = null;
	}
}

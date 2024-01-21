import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
	public static int anInt919;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_3;

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "Lclient!nc;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!e", name = "ub", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "I")
	public static int anInt917 = 1;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!e", name = "rb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_357 = Static59.method1195("Select");

	@OriginalMember(owner = "client!e", name = "db", descriptor = "Lclient!qf;")
	public static Class60 aClass60_352 = aClass60_357;

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_353 = Static59.method1195("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!e", name = "pb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_356 = Static59.method1195("cyan:");

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_354 = aClass60_356;

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "Lclient!qf;")
	public static Class60 aClass60_355 = aClass60_356;

	@OriginalMember(owner = "client!e", name = "sb", descriptor = "I")
	public static int anInt930 = 0;

	@OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
	public static int anInt931 = -1;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
	public static void method593() {
		aClass47_1 = null;
		aClass60_356 = null;
		aClass60_357 = null;
		aClass60_353 = null;
		aClass60_354 = null;
		aClass60_352 = null;
		aClass60_355 = null;
		aClass25_Sub1_3 = null;
		aClass3_Sub1_Sub2_Sub3Array3 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Z")
	public static boolean method594(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!jb;BI)Z")
	public static boolean method596(@OriginalArg(0) Class25 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method928(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static18.method520(local8);
			return true;
		}
	}
}

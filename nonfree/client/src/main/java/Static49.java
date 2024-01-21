import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_9;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_10;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_510 = Static78.method1313("");

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!fc;")
	public static Class25 aClass25_511 = Static78.method1313("headicons_hint");

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt1229 = 0;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt1230 = 0;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt1232 = -1;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_512 = Static78.method1313("Mitteilung");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_514 = Static78.method1313("Remove");

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_513 = aClass25_514;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method983() {
		anIntArrayArray12 = null;
		aClass25_514 = null;
		aClass25_512 = null;
		aClass25_513 = null;
		aClass25_510 = null;
		aClass25_511 = null;
		aClass56_Sub1_10 = null;
		aClass56_Sub1_9 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)I")
	public static int method984(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub9 local12 = Static116.method1860(arg0);
		@Pc(15) int local15 = local12.anInt1068;
		@Pc(18) int local18 = local12.anInt1080;
		@Pc(21) int local21 = local12.anInt1076;
		@Pc(28) int local28 = Class1_Sub2_Sub3_Sub1.anIntArray53[local18 - local21];
		return local28 & Static95.anIntArray385[local15] >> local21;
	}
}

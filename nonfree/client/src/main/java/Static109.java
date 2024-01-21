import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	public static int anInt2952;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_19;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array13;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int anInt2955 = 0;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_1597 = Static69.method1231("Select");

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1598 = Static69.method1231("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!je;")
	private static Class40 aClass40_1600 = Static69.method1231("Members only world");

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1599 = aClass40_1600;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_1601 = aClass40_1597;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method2112() {
		aClass40_1600 = null;
		aClass40_1601 = null;
		aClass40_1598 = null;
		aClass2_Sub1_Sub2_Sub4Array13 = null;
		aClass40_1597 = null;
		aClass24_Sub1_19 = null;
		aClass40_1599 = null;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public static void method2117() {
		for (@Pc(8) int local8 = -1; local8 < Static130.anInt3007; local8++) {
			@Pc(17) int local17;
			if (local8 == -1) {
				local17 = 2047;
			} else {
				local17 = Static126.anIntArray347[local8];
			}
			@Pc(25) Class2_Sub1_Sub1_Sub3_Sub2 local25 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local17];
			if (local25 != null) {
				Static121.method2033(1, local25);
			}
		}
	}
}

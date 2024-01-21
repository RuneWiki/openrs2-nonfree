import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!v", name = "Nb", descriptor = "Lclient!ke;")
	public static Class43 aClass43_42;

	@OriginalMember(owner = "client!v", name = "Ub", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!v", name = "Ac", descriptor = "Lclient!oa;")
	public static Class2_Sub18 aClass2_Sub18_101;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1504 = Static146.method2172("null");

	@OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
	public static int anInt4383 = 0;

	@OriginalMember(owner = "client!v", name = "Ib", descriptor = "I")
	public static final int anInt4393 = 7759444;

	@OriginalMember(owner = "client!v", name = "Lb", descriptor = "[[S")
	public static short[][] aShortArrayArray18 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!v", name = "Mb", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array25 = new Class77[100];

	@OriginalMember(owner = "client!v", name = "Pb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1505 = Static146.method2172("World");

	@OriginalMember(owner = "client!v", name = "cc", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!v", name = "ic", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1506 = aClass77_1505;

	@OriginalMember(owner = "client!v", name = "mc", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1507 = aClass77_1505;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
	public static void method2912() {
		aClass77Array25 = null;
		aShortArrayArray18 = null;
		aClass77_1505 = null;
		aClass43_42 = null;
		aClass2_Sub18_101 = null;
		anIntArray619 = null;
		aClass77_1507 = null;
		aClass77_1504 = null;
		aClass77_1506 = null;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)V")
	public static void method2914() {
		while (true) {
			@Pc(8) Class10 local8 = Static2.aClass10_4;
			@Pc(15) Class2_Sub6 local15;
			synchronized (Static2.aClass10_4) {
				local15 = (Class2_Sub6) Static146.aClass10_85.method449();
			}
			if (local15 == null) {
				return;
			}
			local15.aClass43_Sub1_8.method2230(local15.aClass64_1, (int) local15.aLong134, local15.aByteArray11, false);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!ke;Lclient!sg;Lclient!sg;)[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] method2917(@OriginalArg(1) Class43 arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) Class77 arg2) {
		@Pc(8) int local8 = arg0.method2206(arg1);
		@Pc(21) int local21 = arg0.method2215(local8, arg2);
		return Static8.method131(arg0, local8, local21);
	}
}

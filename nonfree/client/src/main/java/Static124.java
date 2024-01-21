import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[S")
	public static short[] aShortArray62;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt3872 = 0;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array71 = new Class70[8];

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
	public static final int[] anIntArray330 = new int[100];

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt3874 = 0;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1890 = Static193.method3027("<col=ffff00>*V");

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1891 = Static193.method3027("Art");

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_36 = new Class85(20);

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
	public static final int[] anIntArray331 = new int[2000];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method2991(@OriginalArg(1) Class70 arg0) {
		if (Static89.anInt652 >= 2) {
			@Pc(15) int local15;
			@Pc(33) int local33;
			if (arg0.method2059(Static172.aClass70_1647)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(23) Runtime local23 = Runtime.getRuntime();
				local33 = (int) ((local23.totalMemory() - local23.freeMemory()) / 1024L);
				Static135.method1934(Static207.method3296(new Class70[] { Static185.aClass70_1809, Static107.method2404(local33), Static50.aClass70_499 }), 0, null);
			}
			if (arg0.method2059(Static144.aClass70_1356)) {
				Static117.method1690();
			}
			if (arg0.method2059(Static169.aClass70_1635)) {
				Static165.aBoolean151 = true;
			}
			if (arg0.method2059(Static53.aClass70_555)) {
				Static165.aBoolean151 = false;
			}
			arg0.method2059(Static163.aClass70_1591);
			arg0.method2059(Static126.aClass70_1189);
			if (arg0.method2059(Static2.aClass70_4)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(102) int local102 = 1; local102 < 103; local102++) {
						for (local33 = 1; local33 < 103; local33++) {
							Static28.aClass77Array1[local15].anIntArrayArray23[local102][local33] = 0;
						}
					}
				}
			}
			if (arg0.method2042(Static132.aClass70_1230) && Static8.anInt189 != 0) {
				Static188.method2953(arg0.method2019(6).method2025());
			}
			if (arg0.method2059(Static165.aClass70_1600) && Static8.anInt189 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2042(Static169.aClass70_1633)) {
				Static116.anInt3351 = arg0.method2019(12).method2056().method2025();
				Static135.method1934(Static207.method3296(new Class70[] { Static31.aClass70_310, Static107.method2404(Static116.anInt3351) }), 0, null);
			}
			if (arg0.method2059(Static136.aClass70_1287)) {
				Static58.aBoolean74 = true;
			}
		}
		Static93.aClass3_Sub4_Sub1_18.method1298(161);
		Static93.aClass3_Sub4_Sub1_18.method1239(arg0.method2045() - 1);
		Static93.aClass3_Sub4_Sub1_18.method1274(arg0.method2019(2));
	}
}

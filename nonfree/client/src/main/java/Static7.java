import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
	public static int anInt196;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_7 = new Class107(44, 3);

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_2 = new Class200("", 12);

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	public static int anInt193 = 0;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_8 = new Class107(69, 0);

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "Z")
	public static boolean aBoolean10 = true;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "[I")
	public static final int[] anIntArray17 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ul;Lclient!ya;I)V")
	public static void method163(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class39 arg1) {
		if (Static47.aBoolean49) {
			return;
		}
		arg1.p(0);
		Static402.aClass143_30 = arg1.method4549(Static461.method1442(arg0, Static123.anInt2496));
		Static402.aClass143_30.method5723((Static95.anInt1971 - Static402.aClass143_30.j()) / 2, (Static34.anInt715 - Static402.aClass143_30.T()) / 2);
		Static56.aClass143_8 = arg1.method4549(Static461.method1442(arg0, Static238.anInt4357));
		Static56.aClass143_8.method5723((Static95.anInt1971 - Static56.aClass143_8.j()) / 2, 18);
		Static47.aBoolean49 = true;
	}
}

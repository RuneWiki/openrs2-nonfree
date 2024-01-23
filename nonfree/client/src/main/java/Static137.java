import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Lclient!ng;")
	public static Class82 aClass82_2;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "Lclient!sc;")
	private static Class107 aClass107_813 = Static231.method3737("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
	public static int[] anIntArray255 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "Lclient!sc;")
	public static Class107 aClass107_814 = aClass107_813;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "Lclient!sc;")
	public static Class107 aClass107_815 = Static231.method3737(": ");

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
	public static int anInt2980 = -1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!sc;ZISIJLclient!sc;)V")
	public static void method2291(@OriginalArg(0) Class107 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) Class107 arg5) {
		if (Static40.aBoolean81 || Static8.anInt259 >= 500) {
			return;
		}
		Static210.aClass107Array28[Static8.anInt259] = arg5;
		Static168.aClass107Array21[Static8.anInt259] = arg0;
		Static106.aShortArray30[Static8.anInt259] = arg2;
		Static199.aLongArray6[Static8.anInt259] = arg4;
		Static152.anIntArray293[Static8.anInt259] = arg3;
		Static4.anIntArray378[Static8.anInt259] = arg1;
		Static8.anInt259++;
	}
}

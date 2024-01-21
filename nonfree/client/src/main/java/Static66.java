import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_648 = Static193.method3027("Untersuchen");

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_653 = Static193.method3027("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!oc;")
	public static Class70 aClass70_649 = aClass70_653;

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_651 = Static193.method3027("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "Lclient!oc;")
	public static Class70 aClass70_650 = aClass70_651;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_652 = Static193.method3027("Passwort: ");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ij;III)V")
	public static void method1003(@OriginalArg(0) Class26_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2599 == arg1 && arg1 != -1) {
			@Pc(73) Class3_Sub3_Sub17 local73 = Static11.method254(arg1);
			@Pc(76) int local76 = local73.anInt2737;
			if (local76 == 1) {
				arg0.anInt2621 = 0;
				arg0.anInt2610 = arg2;
				arg0.anInt2641 = 0;
				arg0.anInt2606 = 0;
				Static126.method1760(arg0.anInt2621, local73, Static144.aClass26_Sub2_Sub1_1 == arg0, arg0.anInt2611, arg0.anInt2593);
			}
			if (local76 == 2) {
				arg0.anInt2641 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt2599 == -1 || Static11.method254(arg1).anInt2750 >= Static11.method254(arg0.anInt2599).anInt2750) {
			arg0.anInt2606 = 0;
			arg0.anInt2610 = arg2;
			arg0.anInt2599 = arg1;
			arg0.anInt2642 = arg0.anInt2635;
			arg0.anInt2641 = 0;
			arg0.anInt2621 = 0;
			if (arg0.anInt2599 != -1) {
				Static126.method1760(arg0.anInt2621, Static11.method254(arg0.anInt2599), Static144.aClass26_Sub2_Sub1_1 == arg0, arg0.anInt2611, arg0.anInt2593);
			}
		}
	}
}

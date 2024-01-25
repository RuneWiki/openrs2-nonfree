import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	public static int anInt2632;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Lclient!mu;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_39 = new Class244(60, -1);

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[I")
	public static final int[] anIntArray278 = new int[14];

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	public static int anInt2636 = 0;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
	public static int anInt2640 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
	public static void method2215(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static2.anInt65 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!np;III)V")
	public static void method2216(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static280.aClass102ArrayArray1 = new Class102[arg1][arg2];
		Static278.aClass155_6 = arg0;
		if (Static240.anIntArray597 != null) {
			Static118.aClass8_3 = Static244.method3985(Static240.anIntArray597[4], Static240.anIntArray597[1], Static240.anIntArray597[2], Static240.anIntArray597[0], Static240.anIntArray597[3], Static240.anIntArray597[5]);
		}
		Static150.aClass102_5 = new Class102();
		Static282.method4482();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public static void method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass28_Sub3_1 != null) {
			local7.aClass28_Sub3_1 = null;
		}
		if (local7.aClass28_Sub3_2 != null) {
			local7.aClass28_Sub3_2 = null;
		}
	}
}

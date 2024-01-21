import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!jh", name = "lb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_32;

	@OriginalMember(owner = "client!jh", name = "mb", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_808 = Static169.method2903(" <col=ffffff>");

	@OriginalMember(owner = "client!jh", name = "db", descriptor = "Lclient!bf;")
	public static Class10 aClass10_6 = new Class10(32);

	@OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
	public static int anInt2196 = 0;

	@OriginalMember(owner = "client!jh", name = "gb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_809 = Static169.method2903("Konfig geladen)3");

	@OriginalMember(owner = "client!jh", name = "sb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_814 = Static169.method2903("Prepared visibility map");

	@OriginalMember(owner = "client!jh", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_810 = aClass23_814;

	@OriginalMember(owner = "client!jh", name = "ob", descriptor = "Lclient!ed;")
	public static Class23 aClass23_811 = Static169.method2903("b12_full");

	@OriginalMember(owner = "client!jh", name = "pb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_812 = Static169.method2903("l");

	@OriginalMember(owner = "client!jh", name = "qb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_813 = Static169.method2903("(U");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIB)I")
	public static int method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!ga;Lclient!ga;Lclient!ga;Lclient!ga;)V")
	public static void method1447(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) Class30 arg3) {
		aClass30_32 = arg1;
		Static17.aClass30_9 = arg0;
		Static152.aClass30_53 = arg2;
		Static100.aClass30_35 = arg3;
		Static9.aClass60ArrayArray1 = new Class60[Static100.aClass30_35.method1291()][];
		Static13.aBooleanArray4 = new boolean[Static100.aClass30_35.method1291()];
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
	public static void method1448() {
		aClass23_813 = null;
		aClass23_810 = null;
		aClass23_809 = null;
		aClass23_814 = null;
		aClass23_811 = null;
		aClass23_812 = null;
		aClass30_32 = null;
		aClass10_6 = null;
		aClass23_808 = null;
		anIntArray283 = null;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Lclient!ed;")
	public static Class23 method1449(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static149.method2571(new Class23[] { Static36.aClass23_381, Static27.method498(arg0), Static26.aClass23_287 });
		} else if (arg0 < 10000000) {
			return Static149.method2571(new Class23[] { Static15.aClass23_182, Static27.method498(arg0 / 1000), Static101.aClass23_995, Static26.aClass23_287 });
		} else {
			return Static149.method2571(new Class23[] { Static87.aClass23_370, Static27.method498(arg0 / 1000000), Static84.aClass23_1674, Static26.aClass23_287 });
		}
	}
}

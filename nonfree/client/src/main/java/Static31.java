import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!vb;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_475 = Static38.method736("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_476 = Static38.method736("Freunde");

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_477 = Static38.method736("Duell akzeptieren");

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array9 = new Class71[100];

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "Lclient!vc;")
	private static Class71 aClass71_478 = Static38.method736("Use");

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "Lclient!vc;")
	public static Class71 aClass71_479 = Static38.method736(")1");

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_480 = aClass71_478;

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "Lclient!vc;")
	public static Class71 aClass71_481 = Static38.method736("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "[I")
	public static int[] anIntArray104 = new int[100];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method599(@OriginalArg(1) Class24 arg0) {
		Static9.aClass24_3 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJ)V")
	public static void method600(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static68.anInt1685 >= 100 && Static24.anInt739 != 1 || Static68.anInt1685 >= 200) {
			Static92.method1500(0, Static41.aClass71_598, Static38.aClass71_568);
			return;
		}
		@Pc(37) Class71 local37 = Static88.method1396(arg0).method1803();
		for (@Pc(39) int local39 = 0; local39 < Static68.anInt1685; local39++) {
			if (arg0 == Static57.aLongArray6[local39]) {
				Static92.method1500(0, Static74.method677(new Class71[] { local37, Static97.aClass71_1135 }), Static38.aClass71_568);
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static33.anInt935; local74++) {
			if (Static78.aLongArray4[local74] == arg0) {
				Static92.method1500(0, Static74.method677(new Class71[] { Static65.aClass71_805, local37, Static5.aClass71_155 }), Static38.aClass71_568);
				return;
			}
		}
		if (local37.method1813(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass71_1236)) {
			return;
		}
		Static81.aClass71Array13[Static68.anInt1685] = local37;
		Static57.aLongArray6[Static68.anInt1685] = arg0;
		Static70.anIntArray216[Static68.anInt1685] = 0;
		Static82.anIntArray247[Static68.anInt1685] = 0;
		Static8.anInt282 = Static95.anInt2285 + 1;
		Static68.anInt1685++;
		Static28.aBoolean33 = true;
		Static61.aClass5_Sub11_Sub1_8.method1553(81);
		Static61.aClass5_Sub11_Sub1_8.method1548(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	public static void method601() {
		aClass71_481 = null;
		aClass71_477 = null;
		aClass71_478 = null;
		aClass71_475 = null;
		aClass71_480 = null;
		anIntArray103 = null;
		aClass71_476 = null;
		aClass71_479 = null;
		aClass71Array9 = null;
		aClass70_1 = null;
		anIntArray104 = null;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	public static void method602() {
		if (Static57.aClass3_1 != null) {
			Static57.aClass3_1.method1220();
			Static57.aClass3_1 = null;
		}
		Static72.anInt1825 = 0;
	}
}

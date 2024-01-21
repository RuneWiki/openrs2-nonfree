import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
	public static int[] anIntArray109 = new int[128];

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!mf;")
	public static Class48 aClass48_25 = new Class48(64);

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_457 = Static121.method2047("::qa_op_test");

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
	public static int[] anIntArray110 = new int[5];

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_458 = Static121.method2047("<col=00ff80>");

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[I")
	public static int[] anIntArray111 = new int[32];

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "[I")
	public static int[] anIntArray112 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "Lclient!qc;")
	public static Class60 aClass60_459 = Static121.method2047("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!lc;I)Z")
	public static boolean method810(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(12) byte[] local12 = arg1.method1103(arg0);
		if (local12 == null) {
			return false;
		} else {
			Static127.method2106(local12);
			return true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method812() {
		aClass48_25.method1393();
		Static15.aClass48_66.method1393();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public static void method813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class70 local11 = Static74.aClass70ArrayArrayArray1[Static129.anInt3003][arg0][arg1];
		if (local11 == null) {
			Static7.aClass28_3.method779(Static129.anInt3003, arg0, arg1);
			return;
		}
		@Pc(21) Class4_Sub4_Sub1_Sub5 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(28) Class4_Sub4_Sub1_Sub5 local28;
		for (local28 = (Class4_Sub4_Sub1_Sub5) local11.method1939(); local28 != null; local28 = (Class4_Sub4_Sub1_Sub5) local11.method1936()) {
			@Pc(34) Class4_Sub4_Sub13 local34 = Static24.method475(local28.anInt1411);
			@Pc(37) int local37 = local34.anInt2100;
			if (local34.anInt2130 == 1) {
				local37 *= local28.anInt1408 + 1;
			}
			if (local37 > local23) {
				local23 = local37;
				local21 = local28;
			}
		}
		if (local21 == null) {
			Static7.aClass28_3.method779(Static129.anInt3003, arg0, arg1);
			return;
		}
		local11.method1927(local21);
		local28 = (Class4_Sub4_Sub1_Sub5) local11.method1939();
		@Pc(89) Class4_Sub4_Sub1_Sub5 local89 = null;
		@Pc(91) Class4_Sub4_Sub1_Sub5 local91 = null;
		while (local28 != null) {
			if (local28.anInt1411 != local21.anInt1411) {
				if (local91 == null) {
					local91 = local28;
				}
				if (local91.anInt1411 != local28.anInt1411 && local89 == null) {
					local89 = local28;
				}
			}
			local28 = (Class4_Sub4_Sub1_Sub5) local11.method1936();
		}
		@Pc(129) int local129 = arg0 + (arg1 << 7) + 1610612736;
		Static7.aClass28_3.method780(Static129.anInt3003, arg0, arg1, Static54.method1001(arg0 * 128 + 64, arg1 * 128 + 64, Static129.anInt3003), local21, local129, local91, local89);
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
	public static void method817() {
		anIntArray112 = null;
		aClass60_457 = null;
		anIntArray110 = null;
		anIntArray109 = null;
		aClass60_458 = null;
		anIntArrayArray8 = null;
		aClass48_25 = null;
		aClass60_459 = null;
		anIntArray111 = null;
	}
}

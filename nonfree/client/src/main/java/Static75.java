import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_20 = new Class387(79, 8);

	@OriginalMember(owner = "client!cia", name = "f", descriptor = "[I")
	public static int[] anIntArray55 = new int[2];

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
	public static int anInt1198 = 2;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
	public static void method1188() {
		Static344.aClass81Array1 = null;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V")
	public static void method1189() throws Exception_Sub1 {
		if (Static659.anInt10597 == 1) {
			Static617.aClass57_14.method7673(Static561.anInt9477, Static136.anInt2254);
		} else {
			Static617.aClass57_14.method7673(0, 0);
		}
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V")
	public static void method1191(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static69.anInt1122 == 2) {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[0]);
				Static476.aClass334Array1[1].method8342(Static333.aClass95Array1[1]);
			} else if (Static69.anInt1122 == 3) {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[0]);
				Static476.aClass334Array1[1].method8342(Static333.aClass95Array1[1]);
				Static476.aClass334Array1[2].method8342(Static333.aClass95Array1[2]);
			} else {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[0]);
				Static476.aClass334Array1[1].method8342(Static333.aClass95Array1[1]);
				Static476.aClass334Array1[2].method8342(Static333.aClass95Array1[2]);
				Static476.aClass334Array1[3].method8342(Static333.aClass95Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static69.anInt1122 == 2) {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[2]);
			} else if (Static69.anInt1122 == 3) {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[3]);
				Static476.aClass334Array1[1].method8342(Static333.aClass95Array1[4]);
			} else {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[4]);
				Static476.aClass334Array1[1].method8342(Static333.aClass95Array1[5]);
				Static476.aClass334Array1[2].method8342(Static333.aClass95Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static69.anInt1122 == 2) {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[3]);
				return;
			}
			if (Static69.anInt1122 == 3) {
				Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[5]);
				return;
			}
			Static476.aClass334Array1[0].method8342(Static333.aClass95Array1[7]);
		}
	}
}

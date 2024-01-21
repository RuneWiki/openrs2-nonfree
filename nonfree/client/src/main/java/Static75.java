import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "Lclient!ea;")
	private static Class18 aClass18_549 = Static8.method128("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!jh", name = "eb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_550 = Static8.method128("k");

	@OriginalMember(owner = "client!jh", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_551 = aClass18_549;

	@OriginalMember(owner = "client!jh", name = "ib", descriptor = "[I")
	public static int[] anIntArray201 = new int[128];

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(III)V")
	public static void method1597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg1 != Static73.anInt1888) {
			Static171.anIntArray421 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static171.anIntArray421[local9] = (local9 << 12) / arg1;
			}
			Static35.anInt672 = arg1 - 1;
			Static73.anInt1888 = arg1;
		}
		if (Static98.anInt3017 == arg0) {
			return;
		}
		Static150.anIntArray383 = new int[arg0];
		for (local9 = 0; local9 < arg0; local9++) {
			Static150.anIntArray383[local9] = (local9 << 12) / arg0;
		}
		Static98.anInt3017 = arg0;
		Static125.anInt3628 = arg0 - 1;
	}

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "(I)V")
	public static void method1598() {
		aClass18_549 = null;
		anIntArray201 = null;
		aClass18_551 = null;
		aClass18_550 = null;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)V")
	public static void method1599(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static116.aBoolean143) {
			Static31.method687();
		} else if (arg0 != -1 && (Static157.anInt4311 != arg0 || !Static46.method3211()) && Static94.anInt2923 != 0 && !Static116.aBoolean143) {
			Static11.method200(Static115.aClass16_Sub1_36, arg0, Static94.anInt2923, 0);
		}
		Static157.anInt4311 = arg0;
	}
}

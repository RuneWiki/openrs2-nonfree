import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_11 = new Class91();

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1100 = Static161.method2452("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1102 = Static161.method2452("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
	public static int anInt2922 = 0;

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1103 = Static161.method2452("(Udns");

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
	public static int anInt2923 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wa;B)V")
	public static void method2171(@OriginalArg(0) Class23 arg0) {
		Static138.aClass23_76 = arg0;
		Static197.anInt3849 = Static138.aClass23_76.method752(4);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)I")
	public static int method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		return Static3.aClass5_Sub2_Sub26_1 != null && local10 == Static3.aClass5_Sub2_Sub26_1.aLong253 ? Static52.aClass5_Sub6_1.anInt4050 * 99 / (Static52.aClass5_Sub6_1.aByteArray56.length - Static3.aClass5_Sub2_Sub26_1.aByte14) + 1 : 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLclient!mf;)Z")
	public static boolean method2176(@OriginalArg(1) Class69 arg0) {
		if (arg0.anIntArray283 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray283.length; local17++) {
			@Pc(24) int local24 = Static11.method226(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray275[local17];
			if (arg0.anIntArray283[local17] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray283[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray283[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)V")
	public static void method2177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class5_Sub2_Sub26 local21 = (Class5_Sub2_Sub26) Static59.aClass75_6.method2072(local10);
		if (local21 != null) {
			Static217.aClass32_2.method922(local21);
		}
	}
}

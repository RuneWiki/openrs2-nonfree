import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array9;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public static int anInt2837;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "[B")
	public static final byte[] aByteArray44 = new byte[520];

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1033 = Static161.method2452(":clanreq:");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1034 = Static161.method2452("settings");

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1035 = Static161.method2452("Standort");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!wa;Lclient!dc;ILclient!dc;)Lclient!ji;")
	public static Class5_Sub2_Sub10 method2107(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(16) int local16 = arg0.method734(arg1);
		@Pc(22) int local22 = arg0.method737(arg2, local16);
		return Static94.method1542(local16, arg0, local22);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!dc;B)Lclient!n;")
	public static Class5_Sub21 method2108(@OriginalArg(0) Class20 arg0) {
		if (arg0.method582() == 0) {
			return null;
		}
		for (@Pc(14) Class5_Sub21 local14 = (Class5_Sub21) Static35.aClass91_5.method2684(); local14 != null; local14 = (Class5_Sub21) Static35.aClass91_5.method2678()) {
			if (local14.aClass20_953.method561(arg0)) {
				return local14;
			}
		}
		return null;
	}
}

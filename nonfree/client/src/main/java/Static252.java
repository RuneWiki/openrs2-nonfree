import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
	public static int anInt5448;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIZI)V")
	public static void method4677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static80.method2326(arg1)) {
			Static17.method366(-1, arg3, arg2, arg0, Static631.aClass24ArrayArray2[arg1]);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22 = arg1 - arg5;
		@Pc(26) int local26 = arg5 + arg2;
		for (@Pc(28) int local28 = arg2; local28 < local26; local28++) {
			Static280.method5108(arg3, Static208.anIntArrayArray20[local28], arg6, arg0);
		}
		@Pc(47) int local47 = arg3 - arg5;
		@Pc(51) int local51 = arg5 + arg6;
		for (@Pc(53) int local53 = arg1; local53 > local22; local53--) {
			Static280.method5108(arg3, Static208.anIntArrayArray20[local53], arg6, arg0);
		}
		for (@Pc(71) int local71 = local26; local71 <= local22; local71++) {
			@Pc(77) int[] local77 = Static208.anIntArrayArray20[local71];
			Static280.method5108(local51, local77, arg6, arg0);
			Static280.method5108(local47, local77, local51, arg4);
			Static280.method5108(arg3, local77, local47, arg0);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)V")
	public static void method4680() {
		@Pc(10) Class2_Sub9 local10 = (Class2_Sub9) Static253.aClass341_64.method8524();
		@Pc(21) boolean local21 = Static612.aClass24_17 != null || Static606.anInt10699 > 0;
		@Pc(25) int local25 = local10.method7079();
		@Pc(29) int local29 = local10.method7082();
		if (local21) {
			Static600.anInt10555 = 1;
		}
		if (local21) {
			Static388.aClass2_Sub6_Sub3_4 = Static74.aClass2_Sub6_Sub3_1;
		} else {
			Static88.method2465(Static74.aClass2_Sub6_Sub3_1, local29, local25);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BI)Z")
	public static boolean method4681(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static244.aCharArray1[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BI)V")
	public static void method4682(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub6_Sub6 local15 = Static139.method3119(arg0, 11);
		local15.method3093();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!ha;BZ)Lclient!el;")
	public static Class95 method4683(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static2.anIntArray229 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static2.anIntArray229.length; local15++) {
				if (arg0 == Static2.anIntArray229[local15]) {
					return Static478.aClass95Array1[local15];
				}
			}
		}
		@Pc(42) Class95 local42 = (Class95) Static103.aClass169_15.method5002((long) arg0);
		if (local42 != null) {
			if (arg2 && local42.aClass239_4 == null) {
				@Pc(54) Class239 local54 = Static392.method6465(arg0, Static502.aClass157_259);
				if (local54 == null) {
					return null;
				}
				local42.aClass239_4 = local54;
			}
			return local42;
		}
		@Pc(75) Class296[] local75 = Static652.method7585(Static238.aClass157_118, arg0);
		if (local75 == null) {
			return null;
		}
		@Pc(84) Class239 local84 = Static392.method6465(arg0, Static502.aClass157_259);
		if (local84 == null) {
			return null;
		}
		if (arg2) {
			local42 = new Class95(arg1.method7289(local84, local75), local84);
		} else {
			local42 = new Class95(arg1.method7289(local84, local75));
		}
		Static103.aClass169_15.method5001(local42, (long) arg0);
		return local42;
	}
}

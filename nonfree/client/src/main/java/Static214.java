import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!ra;")
	public static Class170 aClass170_77;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	public static int anInt4243;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
	public static int anInt4250;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString245 = "Please wait...";

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIZIZII)V")
	public static void method3768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg4 && arg6 == Static63.anInt1492 && arg0 == Static1.anInt3 && (Static9.anInt297 == arg5 || Static26.method628())) {
			return;
		}
		Static1.anInt3 = arg0;
		Static63.anInt1492 = arg6;
		Static9.anInt297 = arg5;
		if (Static26.method628()) {
			Static9.anInt297 = 0;
		}
		if (arg2) {
			Static293.method4971(28);
		} else {
			Static293.method4971(25);
		}
		Static240.method4079(Static334.aString363, Static62.aClass91_3, true);
		@Pc(57) int local57 = Static263.anInt5063;
		@Pc(59) int local59 = Static28.anInt773;
		Static263.anInt5063 = (Static63.anInt1492 - (Static266.anInt5101 >> 4)) * 8;
		Static28.anInt773 = (Static1.anInt3 - (Static339.anInt6352 >> 4)) * 8;
		Static256.aClass5_Sub9_Sub8_2 = Static186.method5360(Static63.anInt1492 * 8, Static1.anInt3 * 8);
		Static334.aClass194_3 = null;
		@Pc(92) int local92 = Static263.anInt5063 - local57;
		@Pc(97) int local97 = Static28.anInt773 - local59;
		@Pc(101) int local101;
		@Pc(111) int local111;
		if (arg2) {
			Static63.anInt1486 = 0;
			local101 = Static266.anInt5101 * 128 - 128;
			@Pc(171) int local171 = (Static339.anInt6352 - 1) * 128;
			for (local111 = 0; local111 < 32768; local111++) {
				@Pc(179) Class25_Sub1_Sub1_Sub2 local179 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local111];
				if (local179 != null) {
					local179.anInt5773 -= local97 * 128;
					local179.anInt5769 -= local92 * 128;
					if (local179.anInt5769 >= 0 && local101 >= local179.anInt5769 && local179.anInt5773 >= 0 && local179.anInt5773 <= local171) {
						@Pc(231) boolean local231 = true;
						for (@Pc(233) int local233 = 0; local233 < 10; local233++) {
							local179.anIntArray402[local233] -= local92;
							local179.anIntArray401[local233] -= local97;
							if (local179.anIntArray402[local233] < 0 || Static266.anInt5101 <= local179.anIntArray402[local233] || local179.anIntArray401[local233] < 0 || Static339.anInt6352 <= local179.anIntArray401[local233]) {
								local231 = false;
							}
						}
						if (local231) {
							Static331.anIntArray535[Static63.anInt1486++] = local111;
						} else {
							Static188.aClass25_Sub1_Sub1_Sub2Array1[local111].method4664(null);
							Static188.aClass25_Sub1_Sub1_Sub2Array1[local111] = null;
						}
					} else {
						Static188.aClass25_Sub1_Sub1_Sub2Array1[local111].method4664(null);
						Static188.aClass25_Sub1_Sub1_Sub2Array1[local111] = null;
					}
				}
			}
		} else {
			for (local101 = 0; local101 < 32768; local101++) {
				@Pc(107) Class25_Sub1_Sub1_Sub2 local107 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local101];
				if (local107 != null) {
					for (local111 = 0; local111 < 10; local111++) {
						local107.anIntArray402[local111] -= local92;
						local107.anIntArray401[local111] -= local97;
					}
					local107.anInt5773 -= local97 * 128;
					local107.anInt5769 -= local92 * 128;
				}
			}
		}
		for (local101 = 0; local101 < 2048; local101++) {
			@Pc(325) Class25_Sub1_Sub1_Sub1 local325 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local101];
			if (local325 != null) {
				for (local111 = 0; local111 < 10; local111++) {
					local325.anIntArray402[local111] -= local92;
					local325.anIntArray401[local111] -= local97;
				}
				local325.anInt5769 -= local92 * 128;
				local325.anInt5773 -= local97 * 128;
			}
		}
		Static156.anInt3123 = arg5;
		Static85.aClass25_Sub1_Sub1_Sub1_1.method3684(arg1, false, arg3, Static156.anInt3123);
		Static160.method2981(local97, local92);
		for (@Pc(391) Class5_Sub29 local391 = (Class5_Sub29) Static208.aClass211_18.method5608(); local391 != null; local391 = (Class5_Sub29) Static208.aClass211_18.method5603()) {
			local391.anInt3819 -= local92;
			local391.anInt3810 -= local97;
			if (local391.anInt3819 < 0 || local391.anInt3810 < 0 || Static266.anInt5101 <= local391.anInt3819 || Static339.anInt6352 <= local391.anInt3810) {
				local391.method5803();
			}
		}
		Static225.anInt4428 = 0;
		if (Static79.anInt1909 != 0) {
			Static79.anInt1909 -= local92;
			Static238.anInt4612 -= local97;
		}
		if (arg2) {
			Class25_Sub1_Sub4.lb -= local97;
			Static256.anInt4992 -= local97;
			Static54.anInt1333 -= local92;
			Static347.anInt6471 -= local97 * 128;
			Static347.anInt6472 -= local92 * 128;
			Static99.anInt2187 -= local92;
			if (Math.abs(local92) > Static266.anInt5101 || Math.abs(local97) > Static339.anInt6352) {
				Static310.method5282();
			}
		} else if (Static215.anInt4279 == 4) {
			Static259.anInt3210 -= local92 * 128;
			Static130.anInt2662 -= local97 * 128;
			Static64.anInt1546 -= local97 * 128;
			Static159.anInt3220 -= local92 * 128;
		} else {
			Static215.anInt4279 = 1;
		}
		Static211.method3742();
		Static316.aClass211_37.method5600();
		Static262.aClass211_32.method5600();
		Static175.aClass24_2.method625();
		Static114.method2253();
	}
}

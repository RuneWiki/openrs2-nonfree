import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
	public static final int[] anIntArray511 = new int[6];

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!mh;")
	public static final Class188 aClass188_7 = new Class188("", 10);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_37 = new Class249();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method5459() {
		@Pc(12) Class2_Sub13_Sub15 local12 = Static370.method5893(0, 15);
		local12.method6974();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZLclient!lk;)V")
	public static void method5460(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg1) {
		if (Static323.anInt6016 >= 400) {
			return;
		}
		@Pc(12) Class12 local12 = arg1.aClass12_1;
		if (local12.anIntArray21 != null) {
			local12 = local12.method455(Static84.aClass302_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean26) {
			return;
		}
		@Pc(34) String local34 = local12.aString9;
		if (local12.anInt346 != 0) {
			@Pc(52) String local52 = Static533.aClass212_4 == Static185.aClass212_1 ? Static398.aClass202_210.method5139(Static172.anInt6352) : Static133.aClass202_78.method5139(Static172.anInt6352);
			local34 = local34 + Static242.method3727(local12.anInt346, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252) + " (" + local52 + local12.anInt346 + ")";
		}
		if (!Static21.aBoolean31) {
			if (!arg0) {
				@Pc(138) String[] local138 = local12.aStringArray3;
				if (Static33.aBoolean43) {
					local138 = Static269.method4302(local138);
				}
				@Pc(148) int local148;
				if (local138 != null) {
					for (local148 = 4; local148 >= 0; local148--) {
						if (local138[local148] != null && (local12.aByte15 == 0 || !local138[local148].equalsIgnoreCase(Static182.aClass202_106.method5139(Static172.anInt6352)))) {
							@Pc(170) byte local170 = 0;
							if (local148 == 0) {
								local170 = 59;
							}
							@Pc(179) int local179 = Static145.anInt2686;
							if (local148 == 1) {
								local170 = 6;
							}
							if (local148 == 2) {
								local170 = 44;
							}
							if (local148 == 3) {
								local170 = 12;
							}
							if (local148 == 4) {
								local170 = 16;
							}
							if (local12.anInt344 == local148) {
								local179 = local12.anInt324;
							}
							if (local148 == local12.anInt333) {
								local179 = local12.anInt340;
							}
							Static111.method2154((long) arg1.anInt5076, -1, local170, 0, true, local138[local148], 0, "<col=ffff00>" + local34, local138[local148].equalsIgnoreCase(Static182.aClass202_106.method5139(Static172.anInt6352)) ? local12.anInt316 : local179, false);
						}
					}
				}
				if (local12.aByte15 == 1 && local138 != null) {
					for (local148 = 4; local148 >= 0; local148--) {
						if (local138[local148] != null && local138[local148].equalsIgnoreCase(Static182.aClass202_106.method5139(Static172.anInt6352))) {
							@Pc(290) short local290 = 0;
							if (local12.anInt346 > Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252) {
								local290 = 2000;
							}
							@Pc(299) short local299 = 0;
							if (local148 == 0) {
								local299 = 59;
							}
							if (local148 == 1) {
								local299 = 6;
							}
							if (local148 == 2) {
								local299 = 44;
							}
							if (local148 == 3) {
								local299 = 12;
							}
							if (local148 == 4) {
								local299 = 16;
							}
							if (local299 != 0) {
								local299 += local290;
							}
							Static111.method2154((long) arg1.anInt5076, -1, local299, 0, true, local138[local148], 0, "<col=ffff00>" + local34, local12.anInt316, false);
						}
					}
				}
			}
			Static111.method2154((long) arg1.anInt5076, -1, 1011, 0, true, Static148.aClass202_87.method5139(Static172.anInt6352), 0, "<col=ffff00>" + local34, Static4.anInt114, arg0);
		} else if (!arg0) {
			@Pc(90) Class73 local90 = Static74.anInt1557 == -1 ? null : Static66.aClass247_1.method6470(Static74.anInt1557);
			if ((Static176.anInt3294 & 0x2) != 0) {
				if (local90 == null || local12.method461(local90.anInt2133, Static74.anInt1557) != local90.anInt2133) {
					Static111.method2154((long) arg1.anInt5076, -1, 21, 0, true, Static131.aString66, 0, Static125.aString61 + " -> <col=ffff00>" + local34, Static472.anInt8248, false);
				}
				return;
			}
		}
	}
}

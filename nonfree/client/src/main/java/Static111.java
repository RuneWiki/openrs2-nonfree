import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!efa", name = "E", descriptor = "Lclient!pga;")
	public static Class260 aClass260_2;

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!efa", name = "I", descriptor = "[I")
	public static final int[] anIntArray193 = new int[3];

	@OriginalMember(owner = "client!efa", name = "K", descriptor = "[I")
	public static final int[] anIntArray194 = new int[14];

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!r;)V")
	public static void method1763(@OriginalArg(1) Class134 arg0) {
		@Pc(7) int local7 = Static330.anInt5532;
		@Pc(9) int local9 = Static518.anInt8770;
		@Pc(11) int local11 = Static274.anInt307;
		@Pc(15) int local15 = Static110.anInt2169 - 3;
		if (Static143.aClass22_14 == null || Static274.aClass22_2 == null) {
			if (Static463.aClass270_98.method5694(Static150.anInt2741) && Static463.aClass270_98.method5694(Static167.anInt2974)) {
				Static143.aClass22_14 = arg0.method6896(Static601.method2070(Static463.aClass270_98, Static150.anInt2741, 0), true);
				@Pc(44) Class102 local44 = Static601.method2070(Static463.aClass270_98, Static167.anInt2974, 0);
				Static274.aClass22_2 = arg0.method6896(local44, true);
				local44.method2073();
				Static259.aClass22_24 = arg0.method6896(local44, true);
			} else {
				arg0.J(local7, local9, local11, 20, 255 - Static403.anInt7064 << 24 | Static297.anInt5115, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static143.aClass22_14 != null && Static274.aClass22_2 != null) {
			local87 = (local11 - Static274.aClass22_2.E() * 2) / Static143.aClass22_14.E();
			for (local89 = 0; local89 < local87; local89++) {
				Static143.aClass22_14.method7662(local7 + Static274.aClass22_2.E() + Static143.aClass22_14.E() * local89, local9);
			}
			Static274.aClass22_2.method7662(local7, local9);
			Static259.aClass22_24.method7662(local11 + local7 - Static259.aClass22_24.E(), local9);
		}
		Static418.aClass64_11.method6602(Static50.anInt929 | 0xFF000000, Static568.aClass351_28.method7651(Static307.anInt5279), local7 + 3, -1, local9 + 14);
		arg0.J(local7, local9 + 20, local11, local15 - 20, -Static403.anInt7064 + 255 << 24 | Static297.anInt5115, 1);
		local87 = Static166.aClass25_1.method4783();
		local89 = Static166.aClass25_1.method4788();
		@Pc(170) int local170 = 0;
		@Pc(191) int local191;
		for (@Pc(175) Class1_Sub51 local175 = (Class1_Sub51) Static310.aClass353_32.method7677(); local175 != null; local175 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			local191 = (Static337.anInt8004 - local170 - 1) * 16 + local9 + 13 + 20;
			local170++;
			if (local7 < local87 && local7 + local11 > local87 && local89 > local191 - 13 && local89 < local191 + 4 && local175.aBoolean754) {
				arg0.J(local7, local191 - 12, local11, 16, 255 - Static281.anInt4929 << 24 | Static75.anInt9090, 1);
			}
		}
		if ((Static220.aClass22_21 == null || Static242.aClass22_23 == null || Static199.aClass22_19 == null) && Static463.aClass270_98.method5694(Static25.anInt346) && Static463.aClass270_98.method5694(Static142.anInt2694) && Static463.aClass270_98.method5694(Static248.anInt4546)) {
			@Pc(271) Class102 local271 = Static601.method2070(Static463.aClass270_98, Static142.anInt2694, 0);
			Static242.aClass22_23 = arg0.method6896(local271, true);
			local271.method2073();
			Static264.aClass22_26 = arg0.method6896(local271, true);
			Static220.aClass22_21 = arg0.method6896(Static601.method2070(Static463.aClass270_98, Static25.anInt346, 0), true);
			@Pc(296) Class102 local296 = Static601.method2070(Static463.aClass270_98, Static248.anInt4546, 0);
			Static199.aClass22_19 = arg0.method6896(local296, true);
			local296.method2073();
			Static260.aClass22_25 = arg0.method6896(local296, true);
		}
		local170 = 0;
		@Pc(370) int local370;
		@Pc(329) int local329;
		if (Static220.aClass22_21 != null && Static242.aClass22_23 != null && Static199.aClass22_19 != null) {
			local191 = (local11 - Static199.aClass22_19.E() * 2) / Static220.aClass22_21.E();
			for (local329 = 0; local329 < local191; local329++) {
				Static220.aClass22_21.method7662(local7 + Static199.aClass22_19.E() + Static220.aClass22_21.E() * local329, -Static220.aClass22_21.u() + local15 + local9);
			}
			local370 = (local15 - Static199.aClass22_19.u() - 20) / Static242.aClass22_23.u();
			for (@Pc(372) int local372 = 0; local372 < local370; local372++) {
				Static242.aClass22_23.method7662(local7, local372 * Static242.aClass22_23.u() + local9 + 20);
				Static264.aClass22_26.method7662(local11 + local7 - Static264.aClass22_26.E(), local372 * Static242.aClass22_23.u() + local9 + 20);
			}
			Static199.aClass22_19.method7662(local7, local15 + local9 - Static199.aClass22_19.u());
			Static260.aClass22_25.method7662(local11 + local7 - Static199.aClass22_19.E(), -Static199.aClass22_19.u() + (local9 - -local15));
		}
		for (@Pc(437) Class1_Sub51 local437 = (Class1_Sub51) Static310.aClass353_32.method7677(); local437 != null; local437 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			local329 = local9 + (Static337.anInt8004 + (-1 - local170)) * 16 + 13 + 20;
			local370 = Static50.anInt929 | 0xFF000000;
			if (local7 < local87 && local87 < local7 + local11 && local89 > local329 - 13 && local329 + 4 > local89 && local437.aBoolean754) {
				local370 = Static99.anInt5668 | 0xFF000000;
			}
			@Pc(494) int[] local494 = null;
			if (Static195.method2977(local437.anInt9638)) {
				local494 = Static175.aClass114_4.method2217((int) local437.aLong302).anIntArray503;
			} else if (local437.anInt9643 != -1) {
				local494 = Static175.aClass114_4.method2217(local437.anInt9643).anIntArray503;
			} else if (Static416.method5728(local437.anInt9638)) {
				@Pc(526) Class1_Sub42 local526 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local437.aLong302);
				if (local526 != null) {
					@Pc(531) Class8_Sub3_Sub3_Sub1_Sub2 local531 = local526.aClass8_Sub3_Sub3_Sub1_Sub2_2;
					@Pc(534) Class20 local534 = local531.aClass20_1;
					if (local534.anIntArray40 != null) {
						local534 = local534.method284(Static430.aClass321_1);
					}
					if (local534 != null) {
						local494 = local534.anIntArray39;
					}
				}
			} else if (Static270.method3853(local437.anInt9638)) {
				@Pc(566) Class95 local566;
				if (local437.anInt9638 == 1001) {
					local566 = Static518.aClass96_4.method1925((int) local437.aLong302);
				} else {
					local566 = Static518.aClass96_4.method1925((int) (local437.aLong302 >>> 32 & 0x7FFFFFFFL));
				}
				if (local566.anIntArray208 != null) {
					local566 = local566.method1922(Static430.aClass321_1);
				}
				if (local566 != null) {
					local494 = local566.anIntArray207;
				}
			}
			@Pc(605) String local605 = Static243.method3634(local437);
			if (local494 != null) {
				local605 = local605 + Static31.method424(local494);
			}
			Static418.aClass64_11.method6600(local7 + 3, local605, local370, local329, Static550.anIntArray689, Static104.aClass22Array5);
			if (local437.aBoolean753) {
				Static200.aClass22_20.method7662(local7 + Static373.aClass334_13.method7354(local605) + 5, local329 + -12);
			}
			local170++;
		}
		Static315.method4378(Static110.anInt2169, Static518.anInt8770, Static330.anInt5532, Static274.anInt307);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
	public static void method1765() {
		if (Static71.anInt1407 < 0) {
			Static134.anInt2584 = -1;
			Static493.anInt8491 = -1;
			Static71.anInt1407 = 0;
		}
		if (Static226.anInt6314 < Static71.anInt1407) {
			Static134.anInt2584 = -1;
			Static493.anInt8491 = -1;
			Static71.anInt1407 = Static226.anInt6314;
		}
		if (Static197.anInt6246 < 0) {
			Static493.anInt8491 = -1;
			Static197.anInt6246 = 0;
			Static134.anInt2584 = -1;
		}
		if (Static226.anInt6315 < Static197.anInt6246) {
			Static493.anInt8491 = -1;
			Static134.anInt2584 = -1;
			Static197.anInt6246 = Static226.anInt6315;
		}
	}
}

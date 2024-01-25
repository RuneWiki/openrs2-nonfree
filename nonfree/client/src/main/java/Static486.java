import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt8200;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	public static int anInt8201 = 0;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "S")
	public static short aShort87 = 256;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZ)B")
	public static byte method6806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method6807() {
		for (@Pc(7) int local7 = 0; local7 < Static69.anInt1595; local7++) {
			Static460.aClass50Array4[local7] = null;
		}
		Static69.anInt1595 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static101.anInt2104; local21++) {
			for (local25 = 0; local25 < Static446.anInt7725; local25++) {
				for (local29 = 0; local29 < Static218.anInt4229; local29++) {
					@Pc(39) Class293 local39 = Static118.aClass293ArrayArrayArray14[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort78 > 0) {
							local39.aShort78 = (short) (local39.aShort78 * -1);
						}
						if (local39.aShort77 > 0) {
							local39.aShort77 = (short) (local39.aShort77 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static101.anInt2104; local25++) {
			for (local29 = 0; local29 < Static446.anInt7725; local29++) {
				for (@Pc(93) int local93 = 0; local93 < Static218.anInt4229; local93++) {
					@Pc(103) Class293 local103 = Static118.aClass293ArrayArrayArray14[local25][local93][local29];
					if (local103 != null) {
						@Pc(126) boolean local126 = Static118.aClass293ArrayArrayArray14[0][local93][local29] != null && Static118.aClass293ArrayArrayArray14[0][local93][local29].aClass293_1 != null;
						@Pc(134) int local134;
						@Pc(136) int local136;
						@Pc(138) int local138;
						@Pc(140) int local140;
						@Pc(150) Class293 local150;
						@Pc(158) int local158;
						@Pc(308) int local308;
						@Pc(437) int local437;
						@Pc(444) int local444;
						@Pc(460) int local460;
						@Pc(467) int local467;
						@Pc(471) int local471;
						@Pc(475) int local475;
						@Pc(482) int local482;
						@Pc(520) int local520;
						@Pc(524) int local524;
						if (local103.aShort78 < 0) {
							local134 = local29;
							local136 = local29;
							local138 = local25;
							local140 = local25;
							local150 = Static118.aClass293ArrayArrayArray14[local25][local93][local29 - 1];
							local158 = Static158.aClass17Array2[local25].method6642(local93, local29);
							while (local134 > 0 && local150 != null && local150.aShort78 < 0 && local103.aShort78 == local150.aShort78 && local150.aShort79 == local103.aShort79 && Static158.aClass17Array2[local25].method6642(local93, local134 - 1) == local158 && (local134 - 1 <= 0 || local158 == Static158.aClass17Array2[local25].method6642(local93, local134 - 2))) {
								local134--;
								local150 = Static118.aClass293ArrayArrayArray14[local25][local93][local134 - 1];
							}
							for (local150 = Static118.aClass293ArrayArrayArray14[local25][local93][local29 + 1]; Static218.anInt4229 > local136 && local150 != null && local150.aShort78 < 0 && local103.aShort78 == local150.aShort78 && local103.aShort79 == local150.aShort79 && Static158.aClass17Array2[local25].method6642(local93, local136 + 1) == local158 && (local136 + 1 >= Static218.anInt4229 || Static158.aClass17Array2[local25].method6642(local93, local136 + 2) == local158); local150 = Static118.aClass293ArrayArrayArray14[local25][local93][local136 + 1]) {
								local136++;
							}
							label289: while (local138 > 0) {
								for (local308 = local134; local308 <= local136; local308++) {
									if (Static118.aClass293ArrayArrayArray14[local138 - 1][local93][local308] == null || local103.aShort78 != Static118.aClass293ArrayArrayArray14[local138 - 1][local93][local308].aShort78 || local103.aShort79 != Static118.aClass293ArrayArrayArray14[local138 - 1][local93][local308].aShort79) {
										break label289;
									}
								}
								local138--;
							}
							label306: while (local140 < Static101.anInt2104 - 1) {
								for (local308 = local134; local308 <= local136; local308++) {
									if (Static118.aClass293ArrayArrayArray14[local140 + 1][local93][local308] == null || Static118.aClass293ArrayArrayArray14[local140 + 1][local93][local308].aShort78 != local103.aShort78 || local103.aShort79 != Static118.aClass293ArrayArrayArray14[local140 + 1][local93][local308].aShort79) {
										break label306;
									}
								}
								local140++;
							}
							local308 = local140 + 1 - local138;
							local437 = Static158.aClass17Array2[local126 ? local138 + 1 : local138].method6642(local93, local134);
							local444 = local308 * local103.aShort78 + local437;
							local460 = Static158.aClass17Array2[local126 ? local138 + 1 : local138].method6642(local93, local136 + 1);
							local467 = local103.aShort78 * local308 + local460;
							local471 = local93 << Static378.anInt6665;
							local475 = local134 << Static378.anInt6665;
							local482 = (local136 << Static378.anInt6665) + Static47.anInt1239;
							Static460.aClass50Array4[Static69.anInt1595++] = new Class50(1, local140, local103.aShort79 + local471, local103.aShort79 + local471, local103.aShort79 + local471, local103.aShort79 + local471, local437, local460, local467, local444, local475, local482, local482, local475);
							for (local520 = local138; local520 <= local140; local520++) {
								for (local524 = local134; local524 <= local136; local524++) {
									Static118.aClass293ArrayArrayArray14[local520][local93][local524].aShort78 = (short) (Static118.aClass293ArrayArrayArray14[local520][local93][local524].aShort78 * -1);
								}
							}
						}
						if (local103.aShort77 < 0) {
							local134 = local93;
							local136 = local93;
							local138 = local25;
							local140 = local25;
							local150 = Static118.aClass293ArrayArrayArray14[local25][local93 - 1][local29];
							local158 = Static158.aClass17Array2[local25].method6642(local93, local29);
							while (local134 > 0 && local150 != null && local150.aShort77 < 0 && local150.aShort77 == local103.aShort77 && local103.aShort80 == local150.aShort80 && local158 == Static158.aClass17Array2[local25].method6642(local134 - 1, local29) && (local134 - 1 <= 0 || Static158.aClass17Array2[local25].method6642(local134 - 2, local29) == local158)) {
								local134--;
								local150 = Static118.aClass293ArrayArrayArray14[local25][local134 - 1][local29];
							}
							for (local150 = Static118.aClass293ArrayArrayArray14[local25][local93 + 1][local29]; local136 < Static446.anInt7725 && local150 != null && local150.aShort77 < 0 && local103.aShort77 == local150.aShort77 && local150.aShort80 == local103.aShort80 && local158 == Static158.aClass17Array2[local25].method6642(local136 + 1, local29) && (Static446.anInt7725 <= local136 + 1 || Static158.aClass17Array2[local25].method6642(local136 + 2, local29) == local158); local150 = Static118.aClass293ArrayArrayArray14[local25][local136 + 1][local29]) {
								local136++;
							}
							label205: while (local138 > 0) {
								for (local308 = local134; local308 <= local136; local308++) {
									if (Static118.aClass293ArrayArrayArray14[local138 - 1][local308][local29] == null || local103.aShort77 != Static118.aClass293ArrayArrayArray14[local138 - 1][local308][local29].aShort77 || local103.aShort80 != Static118.aClass293ArrayArrayArray14[local138 - 1][local308][local29].aShort80) {
										break label205;
									}
								}
								local138--;
							}
							label190: while (local140 < Static101.anInt2104 - 1) {
								for (local308 = local134; local308 <= local136; local308++) {
									if (Static118.aClass293ArrayArrayArray14[local140 + 1][local308][local29] == null || local103.aShort77 != Static118.aClass293ArrayArrayArray14[local140 + 1][local308][local29].aShort77 || Static118.aClass293ArrayArrayArray14[local140 + 1][local308][local29].aShort80 != local103.aShort80) {
										break label190;
									}
								}
								local140++;
							}
							local308 = local140 + 1 - local138;
							local437 = Static158.aClass17Array2[local126 ? local138 + 1 : local138].method6642(local134, local29);
							local444 = local103.aShort77 * local308 + local437;
							local460 = Static158.aClass17Array2[local126 ? local138 + 1 : local138].method6642(local136 + 1, local29);
							local467 = local308 * local103.aShort77 + local460;
							local471 = local134 << Static378.anInt6665;
							local475 = (local136 << Static378.anInt6665) + Static47.anInt1239;
							local482 = local29 << Static378.anInt6665;
							Static460.aClass50Array4[Static69.anInt1595++] = new Class50(2, local140, local471, local475, local475, local471, local437, local460, local467, local444, local103.aShort80 + local482, local482 - -local103.aShort80, local482 + local103.aShort80, local482 + local103.aShort80);
							for (local520 = local138; local520 <= local140; local520++) {
								for (local524 = local134; local524 <= local136; local524++) {
									Static118.aClass293ArrayArrayArray14[local520][local524][local29].aShort77 = (short) (Static118.aClass293ArrayArrayArray14[local520][local524][local29].aShort77 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static333.aBoolean432 = true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lclient!vi;")
	public static Class343 method6808(@OriginalArg(0) int arg0) {
		@Pc(14) Class343 local14 = (Class343) Static183.aClass326_16.method7238((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(26) byte[] local26 = Static309.aClass111_72.method2441(arg0, 1);
		local14 = new Class343();
		local14.anInt9097 = arg0;
		if (local26 != null) {
			local14.method7520(new Class1_Sub20(local26));
		}
		local14.method7522();
		if (local14.anInt9083 == 2 && Static477.aClass356_36.method7796((long) arg0) == null) {
			Static477.aClass356_36.method7800((long) arg0, new Class1_Sub32(Static415.anInt7071));
			Static416.aClass343Array1[Static415.anInt7071++] = local14;
		}
		Static183.aClass326_16.method7236(local14, (long) arg0);
		return local14;
	}
}

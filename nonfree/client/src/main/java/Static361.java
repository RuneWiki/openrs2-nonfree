import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public static int anInt5826;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt5827;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!naa;")
	public static final Class232 aClass232_2 = new Class232();

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public static void method5306() {
		if (Static363.anIntArray518 != null) {
			return;
		}
		Static363.anIntArray518 = new int[65536];
		@Pc(21) double local21 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(23) int local23 = 0; local23 < 65536; local23++) {
			@Pc(35) double local35 = (double) (local23 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(46) double local46 = (double) (local23 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(53) double local53 = (double) (local23 & 0x7F) / 128.0D;
			@Pc(55) double local55 = local53;
			@Pc(57) double local57 = local53;
			@Pc(59) double local59 = local53;
			if (local46 != 0.0D) {
				@Pc(73) double local73;
				if (local53 < 0.5D) {
					local73 = local53 * (local46 + 1.0D);
				} else {
					local73 = local53 + local46 - local46 * local53;
				}
				@Pc(88) double local88 = local53 * 2.0D - local73;
				@Pc(92) double local92 = local35 + 0.3333333333333333D;
				if (local92 > 1.0D) {
					local92--;
				}
				@Pc(106) double local106 = local35 - 0.3333333333333333D;
				if (local106 < 0.0D) {
					local106++;
				}
				if (local92 * 6.0D < 1.0D) {
					local55 = local92 * 6.0D * (local73 - local88) + local88;
				} else if (local92 * 2.0D < 1.0D) {
					local55 = local73;
				} else if (local92 * 3.0D < 2.0D) {
					local55 = local88 + (local73 - local88) * 6.0D * (0.6666666666666666D - local92);
				} else {
					local55 = local88;
				}
				if (local35 * 6.0D < 1.0D) {
					local57 = local88 + (local73 - local88) * 6.0D * local35;
				} else if (local35 * 2.0D < 1.0D) {
					local57 = local73;
				} else if (local35 * 3.0D < 2.0D) {
					local57 = local88 + (0.6666666666666666D - local35) * (-local88 + local73) * 6.0D;
				} else {
					local57 = local88;
				}
				if (local106 * 6.0D < 1.0D) {
					local59 = (local73 - local88) * 6.0D * local106 + local88;
				} else if (local106 * 2.0D < 1.0D) {
					local59 = local73;
				} else if (local106 * 3.0D < 2.0D) {
					local59 = (local73 - local88) * 6.0D * (0.6666666666666666D - local106) + local88;
				} else {
					local59 = local88;
				}
			}
			local55 = Math.pow(local55, local21);
			local57 = Math.pow(local57, local21);
			local59 = Math.pow(local59, local21);
			@Pc(278) int local278 = (int) (local55 * 256.0D);
			@Pc(283) int local283 = (int) (local57 * 256.0D);
			@Pc(288) int local288 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = (local283 << 8) + (local278 << 16) + local288;
			Static363.anIntArray518[local23] = local298;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public static void method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class164 local28 = Static15.aClass164ArrayArrayArray5[local9][arg0][arg1] = Static15.aClass164ArrayArrayArray5[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class125 local33 = local28.aClass125_2; local33 != null; local33 = local33.aClass125_1) {
					@Pc(37) Class28_Sub1_Sub1 local37 = local33.aClass28_Sub1_Sub1_1;
					if (local37.aShort125 == arg0 && local37.aShort123 == arg1) {
						local37.aByte174--;
					}
				}
				if (local28.aClass28_Sub1_Sub3_1 != null) {
					local28.aClass28_Sub1_Sub3_1.aByte174--;
				}
				if (local28.aClass28_Sub1_Sub4_2 != null) {
					local28.aClass28_Sub1_Sub4_2.aByte174--;
				}
				if (local28.aClass28_Sub1_Sub4_1 != null) {
					local28.aClass28_Sub1_Sub4_1.aByte174--;
				}
				if (local28.aClass28_Sub1_Sub2_2 != null) {
					local28.aClass28_Sub1_Sub2_2.aByte174--;
				}
				if (local28.aClass28_Sub1_Sub2_1 != null) {
					local28.aClass28_Sub1_Sub2_1.aByte174--;
				}
			}
		}
		if (Static15.aClass164ArrayArrayArray5[0][arg0][arg1] == null) {
			Static15.aClass164ArrayArrayArray5[0][arg0][arg1] = new Class164(0);
			Static15.aClass164ArrayArrayArray5[0][arg0][arg1].aByte68 = 1;
		}
		Static15.aClass164ArrayArrayArray5[0][arg0][arg1].aClass164_1 = local7;
		Static15.aClass164ArrayArrayArray5[3][arg0][arg1] = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
	public static int anInt11;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_1 = new Class397(17, -1);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IBI)Z")
	public static boolean method22(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IILclient!ha;III)V")
	public static void method26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.KA(arg4, arg0, arg4 + arg3, arg1 + arg0);
		arg2.method9378(arg0, arg4, -16777216, arg1, arg3);
		if (Static147.anInt2696 < 100) {
			return;
		}
		@Pc(37) float local37 = (float) Static327.anInt1079 / (float) Static327.anInt1080;
		@Pc(46) int local46 = arg3;
		@Pc(48) int local48 = arg1;
		if (local37 < 1.0F) {
			local48 = (int) ((float) arg3 * local37);
		} else {
			local46 = (int) ((float) arg1 / local37);
		}
		@Pc(75) int local75 = arg0 + (arg1 - local48) / 2;
		@Pc(84) int local84 = arg4 + (arg3 - local46) / 2;
		if (Static226.aClass178_4 == null || arg3 != Static226.aClass178_4.method7636() || Static226.aClass178_4.method7618() != arg1) {
			Static327.method1019(Static327.anInt1084, Static327.anInt1079 + Static327.anInt1076, Static327.anInt1084 + Static327.anInt1080, Static327.anInt1076, local84, local75, local46 + local84, local48 + local75);
			Static327.method1006(arg2);
			Static226.aClass178_4 = arg2.method9356(local84, local75, local46, local48, false);
		}
		Static226.aClass178_4.method7637(local84, local75);
		@Pc(141) int local141 = Static353.anInt5602 * local46 / Static327.anInt1080;
		@Pc(147) int local147 = Static353.anInt5597 * local48 / Static327.anInt1079;
		@Pc(155) int local155 = local46 * Static555.anInt7633 / Static327.anInt1080 + local84;
		@Pc(168) int local168 = local48 + local75 - Static617.anInt9353 * local48 / Static327.anInt1079 - local147;
		@Pc(170) int local170 = -1996554240;
		if (Static346.aClass309_6 == Static422.aClass309_8) {
			local170 = -1996488705;
		}
		arg2.aa(local155, local168, local141, local147, local170, 1);
		arg2.method9403(local155, local168, local141, local147, local170, 0);
		if (Static412.anInt6360 <= 0) {
			return;
		}
		@Pc(202) int local202;
		if (Static489.anInt10872 <= 50) {
			local202 = Static489.anInt10872 * 5;
		} else {
			local202 = 500 - Static489.anInt10872 * 5;
		}
		for (@Pc(216) Class3_Sub48 local216 = (Class3_Sub48) Static327.aClass342_14.method7644(); local216 != null; local216 = (Class3_Sub48) Static327.aClass342_14.method7650()) {
			@Pc(224) Class198 local224 = Static327.aClass111_2.method2739(local216.anInt8050);
			if (Static317.method4645(local224)) {
				@Pc(260) int local260;
				@Pc(272) int local272;
				if (local216.anInt8050 == Static270.anInt4162) {
					local260 = local216.anInt8047 * local46 / Static327.anInt1080 + local84;
					local272 = (Static327.anInt1079 - local216.anInt8049) * local48 / Static327.anInt1079 + local75;
					arg2.method9378(local272 - 2, local260 + -2, local202 << 24 | 0xFFFF00, 4, 4);
				} else if (Static496.anInt7889 != -1 && Static496.anInt7889 == local224.anInt5135) {
					local260 = local84 + local46 * local216.anInt8047 / Static327.anInt1080;
					local272 = local75 + (Static327.anInt1079 - local216.anInt8049) * local48 / Static327.anInt1079;
					arg2.method9378(local272 - 2, local260 + -2, local202 << 24 | 0xFFFF00, 4, 4);
				}
			}
		}
	}
}

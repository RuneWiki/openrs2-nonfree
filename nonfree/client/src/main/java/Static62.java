import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cf", name = "pc", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_98 = new Class298(52, 7);

	@OriginalMember(owner = "client!cf", name = "Td", descriptor = "I")
	public static int anInt4794 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!r;)V")
	public static void method4171(@OriginalArg(1) Class43 arg0) {
		@Pc(7) int local7 = Static50.anInt1065;
		@Pc(9) int local9 = Static343.anInt6039;
		@Pc(11) int local11 = Static324.anInt5822;
		@Pc(15) int local15 = Static32.anInt717 - 3;
		if (Static570.aClass46_34 == null || Static221.aClass46_13 == null) {
			if (Static171.aClass246_84.method5667(Static39.anInt934) && Static171.aClass246_84.method5667(Static42.anInt978)) {
				Static570.aClass46_34 = arg0.method7205(Static606.method7590(Static171.aClass246_84, Static39.anInt934, 0), true);
				@Pc(60) Class355 local60 = Static606.method7590(Static171.aClass246_84, Static42.anInt978, 0);
				Static221.aClass46_13 = arg0.method7205(local60, true);
				local60.method7598();
				Static307.aClass46_12 = arg0.method7205(local60, true);
			} else {
				arg0.J(local7, local9, local11, 20, 255 - Static553.anInt8886 << 24 | Static169.anInt3327, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static570.aClass46_34 != null && Static221.aClass46_13 != null) {
			local87 = (local11 - Static221.aClass46_13.E() * 2) / Static570.aClass46_34.E();
			for (local89 = 0; local89 < local87; local89++) {
				Static570.aClass46_34.method7606(local7 + Static221.aClass46_13.E() + local89 * Static570.aClass46_34.E(), local9);
			}
			Static221.aClass46_13.method7606(local7, local9);
			Static307.aClass46_12.method7606(local7 + local11 - Static307.aClass46_12.E(), local9);
		}
		Static480.aClass117_9.method7654(Static48.aClass33_26.method797(Static131.anInt2839), local9 + 14, Static124.anInt3634 | 0xFF000000, local7 + 3, -1);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static169.anInt3327 | -Static553.anInt8886 + 255 << 24, 1);
		local87 = Static563.aClass156_1.method5689();
		local89 = Static563.aClass156_1.method5690();
		@Pc(177) int local177 = 0;
		@Pc(199) int local199;
		for (@Pc(182) Class3_Sub44 local182 = (Class3_Sub44) Static187.aClass130_15.method3543(); local182 != null; local182 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			local199 = local9 + (-local177 + -1 + Static151.anInt3123) * 16 + 33;
			if (local7 < local87 && local11 + local7 > local87 && local199 - 13 < local89 && local199 + 4 > local89 && local182.aBoolean608) {
				arg0.J(local7, local199 - 12, local11, 16, Static432.anInt7154 | 255 - Static330.anInt5903 << 24, 1);
			}
			local177++;
		}
		if ((Static475.aClass46_30 == null || Static147.aClass46_7 == null || Static351.aClass46_14 == null) && Static171.aClass246_84.method5667(Static287.anInt5262) && Static171.aClass246_84.method5667(Static69.anInt1916) && Static171.aClass246_84.method5667(Static397.anInt6799)) {
			@Pc(278) Class355 local278 = Static606.method7590(Static171.aClass246_84, Static69.anInt1916, 0);
			Static147.aClass46_7 = arg0.method7205(local278, true);
			local278.method7598();
			Static468.aClass46_29 = arg0.method7205(local278, true);
			Static475.aClass46_30 = arg0.method7205(Static606.method7590(Static171.aClass246_84, Static287.anInt5262, 0), true);
			@Pc(303) Class355 local303 = Static606.method7590(Static171.aClass246_84, Static397.anInt6799, 0);
			Static351.aClass46_14 = arg0.method7205(local303, true);
			local303.method7598();
			Static212.aClass46_9 = arg0.method7205(local303, true);
		}
		@Pc(373) int local373;
		@Pc(333) int local333;
		if (Static475.aClass46_30 != null && Static147.aClass46_7 != null && Static351.aClass46_14 != null) {
			local199 = (local11 - Static351.aClass46_14.E() * 2) / Static475.aClass46_30.E();
			for (local333 = 0; local333 < local199; local333++) {
				Static475.aClass46_30.method7606(Static351.aClass46_14.E() + local7 + Static475.aClass46_30.E() * local333, -Static475.aClass46_30.u() + local15 + local9);
			}
			local373 = (local15 - Static351.aClass46_14.u() - 20) / Static147.aClass46_7.u();
			for (@Pc(375) int local375 = 0; local375 < local373; local375++) {
				Static147.aClass46_7.method7606(local7, local9 + Static147.aClass46_7.u() * local375 + 20);
				Static468.aClass46_29.method7606(local7 + local11 - Static468.aClass46_29.E(), local9 + 20 + local375 * Static147.aClass46_7.u());
			}
			Static351.aClass46_14.method7606(local7, local15 + local9 - Static351.aClass46_14.u());
			Static212.aClass46_9.method7606(local7 + local11 - Static351.aClass46_14.E(), local15 + local9 + -Static351.aClass46_14.u());
		}
		local177 = 0;
		for (@Pc(443) Class3_Sub44 local443 = (Class3_Sub44) Static187.aClass130_15.method3543(); local443 != null; local443 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			local333 = (Static151.anInt3123 - local177 - 1) * 16 + local9 + 13 + 20;
			local373 = Static124.anInt3634 | 0xFF000000;
			if (local7 < local87 && local87 < local11 + local7 && local333 - 13 < local89 && local89 < local333 + 4 && local443.aBoolean608) {
				local373 = Static25.anInt591 | 0xFF000000;
			}
			@Pc(499) int[] local499 = null;
			if (Static336.method5142(local443.anInt7685)) {
				local499 = Static517.aClass145_1.method3798((int) local443.aLong219).anIntArray646;
			} else if (local443.anInt7688 != -1) {
				local499 = Static517.aClass145_1.method3798(local443.anInt7688).anIntArray646;
			} else if (Static505.method2637(local443.anInt7685)) {
				@Pc(587) Class3_Sub39 local587 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local443.aLong219);
				if (local587 != null) {
					@Pc(592) Class9_Sub1_Sub1_Sub2_Sub1 local592 = local587.aClass9_Sub1_Sub1_Sub2_Sub1_2;
					@Pc(595) Class294 local595 = local592.aClass294_1;
					if (local595.anIntArray588 != null) {
						local595 = local595.method6429(Static427.aClass56_1);
					}
					if (local595 != null) {
						local499 = local595.lb;
					}
				}
			} else if (Static377.method5578(local443.anInt7685)) {
				@Pc(550) Class23 local550;
				if (local443.anInt7685 == 1001) {
					local550 = Static476.aClass69_5.method2181((int) local443.aLong219);
				} else {
					local550 = Static476.aClass69_5.method2181((int) (local443.aLong219 >>> 32 & 0x7FFFFFFFL));
				}
				if (local550.anIntArray78 != null) {
					local550 = local550.method587(Static427.aClass56_1);
				}
				if (local550 != null) {
					local499 = local550.anIntArray79;
				}
			}
			@Pc(612) String local612 = Static581.method7689(local443);
			if (local499 != null) {
				local612 = local612 + Static480.method6570(local499);
			}
			Static480.aClass117_9.method7645(local333, local373, Static370.anIntArray501, Static187.aClass46Array6, local7 + 3, local612);
			local177++;
			if (local443.aBoolean607) {
				Static569.aClass46_33.method7606(local7 + Static159.aClass58_7.method1767(local612) + 5, local333 + -12);
			}
		}
		Static202.method3647(Static32.anInt717, Static50.anInt1065, Static343.anInt6039, Static324.anInt5822);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)Z")
	public static boolean method4211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIILclient!pl;)V")
	public static void method4284(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class9_Sub1_Sub1_Sub2 arg3) {
		Static178.method6933(arg3.anInt8975, arg3.aByte126, arg3.anInt8980, arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "(B)V")
	public static void method4288() {
		if (Static382.method5640(Static246.anInt4542) || Static419.method7098(Static246.anInt4542)) {
			Static318.method4966(Static233.anInt4431 >> 12, 5000, Static421.anInt7061 >> 12);
		} else {
			@Pc(25) int local25 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] >> 3;
			@Pc(32) int local32 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] >> 3;
			if (local25 >= 0 && Static400.anInt6818 >> 3 > local25 && local32 >= 0 && Static271.anInt5050 >> 3 > local32) {
				Static318.method4966(local32, 5000, local25);
			} else {
				Static318.method4966(Static271.anInt5050 >> 4, 0, Static400.anInt6818 >> 4);
			}
		}
		Static3.method52();
		Static489.method6651();
		Static452.method6295();
		Static74.method1678();
	}
}

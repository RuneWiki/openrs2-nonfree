import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "[I")
	public static final int[] anIntArray390 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)Lclient!kda;")
	public static Class3_Sub1_Sub3_Sub3 method5486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class100 local11 = Static395.aClass100ArrayArrayArray3[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class3_Sub1_Sub3_Sub3 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class243 local27 = local11.aClass243_1; local27 != null; local27 = local27.aClass243_3) {
			@Pc(31) Class3_Sub1_Sub3 local31 = local27.aClass3_Sub1_Sub3_1;
			if (local31 instanceof Class3_Sub1_Sub3_Sub3) {
				@Pc(37) Class3_Sub1_Sub3_Sub3 local37 = (Class3_Sub1_Sub3_Sub3) local31;
				@Pc(47) int local47 = (local37.method5214() - 1) * 256 + 252;
				@Pc(55) int local55 = local37.anInt10303 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt10310 - local47 >> 9;
				@Pc(70) int local70 = local47 + local37.anInt10303 >> 9;
				@Pc(77) int local77 = local37.anInt10310 + local47 >> 9;
				if (local55 <= arg0 && arg2 >= local63 && arg0 <= local70 && arg2 <= local77) {
					@Pc(110) int local110 = (local77 + 1 - arg2) * (-arg0 + 1 + local70);
					if (local110 > local24) {
						local24 = local110;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)I")
	public static int method5487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public static void method5490() {
		Static103.aClass169_15.method5009();
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	public static void method5493(@OriginalArg(0) int arg0) {
		Static599.anInt10549 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static477.anInt8929; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static562.anInt10128; local6++) {
				if (Static395.aClass100ArrayArrayArray3[arg0][local3][local6] == null) {
					Static395.aClass100ArrayArrayArray3[arg0][local3][local6] = new Class100(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	public static void method5495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class20 arg4) {
		if ((Static435.aClass46_25 == null || Static137.aClass46_13 == null || Static137.aClass46_14 == null) && Static214.aClass157_106.method4575(Static286.anInt6056) && Static214.aClass157_106.method4575(Static70.anInt2220) && Static214.aClass157_106.method4575(Static30.anInt659)) {
			@Pc(27) Class296 local27 = Static652.method7583(Static214.aClass157_106, Static70.anInt2220, 0);
			Static137.aClass46_13 = arg4.method7294(local27, true);
			local27.method7580();
			Static67.aClass46_9 = arg4.method7294(local27, true);
			Static435.aClass46_25 = arg4.method7294(Static652.method7583(Static214.aClass157_106, Static286.anInt6056, 0), true);
			@Pc(52) Class296 local52 = Static652.method7583(Static214.aClass157_106, Static30.anInt659, 0);
			Static137.aClass46_14 = arg4.method7294(local52, true);
			local52.method7580();
			Static356.aClass46_21 = arg4.method7294(local52, true);
		}
		if (Static435.aClass46_25 == null || Static137.aClass46_13 == null || Static137.aClass46_14 == null) {
			return;
		}
		@Pc(85) int local85 = (arg1 - Static137.aClass46_14.method6210() * 2) / Static435.aClass46_25.method6210();
		for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
			Static435.aClass46_25.method6213(arg0 + Static137.aClass46_14.method6210() + local87 * Static435.aClass46_25.method6210(), -Static435.aClass46_25.method6208() + arg3 + arg2);
		}
		@Pc(122) int local122 = (arg2 - Static137.aClass46_14.method6208() - 20) / Static137.aClass46_13.method6208();
		for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
			Static137.aClass46_13.method6213(arg0, Static137.aClass46_13.method6208() * local124 + arg3 + 20);
			Static67.aClass46_9.method6213(arg1 + arg0 - Static67.aClass46_9.method6210(), Static137.aClass46_13.method6208() * local124 + 20 + arg3);
		}
		Static137.aClass46_14.method6213(arg0, arg3 + arg2 - Static137.aClass46_14.method6208());
		Static356.aClass46_21.method6213(arg0 + arg1 - Static137.aClass46_14.method6210(), arg3 - (-arg2 + Static137.aClass46_14.method6208()));
	}
}

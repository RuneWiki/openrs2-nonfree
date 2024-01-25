import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt5524 = 0;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Lclient!dh;")
	public static final Class3_Sub13 aClass3_Sub13_1 = new Class3_Sub13(0, -1);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(CB)Z")
	public static boolean method4657(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIILclient!hh;)V")
	public static void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub3 arg3) {
		@Pc(4) Class290 local4 = Static326.method5207(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass6_Sub3_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	public static boolean method4659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static29.method808(arg0, arg1) || Static132.method2303(arg0, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V")
	public static void method4660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static81.anInt1788 < arg1 || arg0 < Static269.anInt5577) {
			return;
		}
		@Pc(26) boolean local26;
		if (arg3 < Static190.anInt4314) {
			arg3 = Static190.anInt4314;
			local26 = false;
		} else if (Static145.anInt2941 >= arg3) {
			local26 = true;
		} else {
			arg3 = Static145.anInt2941;
			local26 = false;
		}
		@Pc(50) boolean local50;
		if (Static190.anInt4314 > arg2) {
			arg2 = Static190.anInt4314;
			local50 = false;
		} else if (arg2 > Static145.anInt2941) {
			local50 = false;
			arg2 = Static145.anInt2941;
		} else {
			local50 = true;
		}
		if (arg1 < Static269.anInt5577) {
			arg1 = Static269.anInt5577;
		} else {
			Static257.method4540(Static68.anIntArrayArray24[arg1++], arg4, arg3, arg2);
		}
		if (arg0 > Static81.anInt1788) {
			arg0 = Static81.anInt1788;
		} else {
			Static257.method4540(Static68.anIntArrayArray24[arg0--], arg4, arg3, arg2);
		}
		@Pc(109) int local109;
		if (local26 && local50) {
			for (local109 = arg1; local109 <= arg0; local109++) {
				@Pc(115) int[] local115 = Static68.anIntArrayArray24[local109];
				local115[arg3] = local115[arg2] = arg4;
			}
		} else if (local26) {
			for (local109 = arg1; local109 <= arg0; local109++) {
				Static68.anIntArrayArray24[local109][arg3] = arg4;
			}
		} else if (local50) {
			for (local109 = arg1; local109 <= arg0; local109++) {
				Static68.anIntArrayArray24[local109][arg2] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qb;B)V")
	public static void method4661(@OriginalArg(0) Class6_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt8589 == Static223.anInt4829 || arg0.anInt8592 == -1 || arg0.anInt8575 != 0) {
			local5 = true;
		} else {
			@Pc(30) Class122 local30 = Static46.aClass247_1.method6029(arg0.anInt8592);
			if (local30.aBoolean296 || arg0.anInt8580 + 1 > local30.anIntArray394[arg0.anInt8584]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(68) int local68 = arg0.anInt8589 - arg0.anInt8555;
			@Pc(74) int local74 = Static223.anInt4829 - arg0.anInt8555;
			@Pc(86) int local86 = arg0.anInt8561 * 512 + arg0.method7083() * 256;
			@Pc(98) int local98 = arg0.anInt8532 * 512 + arg0.method7083() * 256;
			@Pc(109) int local109 = arg0.anInt8559 * 512 + arg0.method7083() * 256;
			@Pc(121) int local121 = arg0.anInt8557 * 512 + arg0.method7083() * 256;
			arg0.anInt8813 = ((local68 - local74) * local98 + local74 * local121) / local68;
			arg0.anInt8811 = ((local68 - local74) * local86 + local74 * local109) / local68;
		}
		arg0.anInt8598 = 0;
		if (arg0.anInt8541 == 0) {
			arg0.method7079(8192, false);
		}
		if (arg0.anInt8541 == 1) {
			arg0.method7079(12288, false);
		}
		if (arg0.anInt8541 == 2) {
			arg0.method7079(0, false);
		}
		if (arg0.anInt8541 == 3) {
			arg0.method7079(4096, false);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIIIIIII)V")
	public static void method4662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = local7 * (Static370.aShort108 - Static306.aShort89) / 100 + Static306.aShort89;
		@Pc(41) int local41 = local31 * arg1 >> 8;
		@Pc(48) int local48 = 16384 - arg2 & 0x3FFF;
		@Pc(55) int local55 = 16384 - arg3 & 0x3FFF;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = local41;
		if (local48 != 0) {
			local59 = -local41 * Class5.anIntArray761[local48] >> 14;
			local61 = local41 * Class5.anIntArray760[local48] >> 14;
		}
		if (local55 != 0) {
			local57 = Class5.anIntArray761[local55] * local61 >> 14;
			local61 = local61 * Class5.anIntArray760[local55] >> 14;
		}
		Static262.anInt5491 = arg3;
		Static27.anInt778 = arg2;
		Static311.anInt6050 = arg5 - local57;
		Static329.anInt6297 = arg0 - local61;
		Static100.anInt2054 = 0;
		Static347.anInt6620 = arg4 - local59;
	}
}

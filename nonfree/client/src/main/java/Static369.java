import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_113 = new Class186(66, 2);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
	public static void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(13) int local13 = arg1 - arg4;
		if (local13 == 0) {
			if (local9 != 0) {
				Static342.method4812(arg0, arg2, arg3, arg4);
			}
		} else if (local9 == 0) {
			Static258.method3969(arg1, arg0, arg2, arg4);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(72) boolean local72 = local9 > local13;
			@Pc(76) int local76;
			@Pc(78) int local78;
			if (local72) {
				local76 = arg4;
				local78 = arg1;
				arg4 = arg2;
				arg1 = arg3;
				arg2 = local76;
				arg3 = local78;
			}
			if (arg4 > arg1) {
				local76 = arg4;
				local78 = arg2;
				arg4 = arg1;
				arg2 = arg3;
				arg1 = local76;
				arg3 = local78;
			}
			local76 = arg2;
			local78 = arg1 - arg4;
			@Pc(116) int local116 = arg3 - arg2;
			@Pc(121) int local121 = -(local78 >> 1);
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(137) int local137 = arg3 > arg2 ? 1 : -1;
			@Pc(141) int local141;
			if (local72) {
				for (local141 = arg4; local141 <= arg1; local141++) {
					Static347.anIntArrayArray54[local141][local76] = arg0;
					local121 += local116;
					if (local121 > 0) {
						local76 += local137;
						local121 -= local78;
					}
				}
			} else {
				for (local141 = arg4; local141 <= arg1; local141++) {
					Static347.anIntArrayArray54[local76][local141] = arg0;
					local121 += local116;
					if (local121 > 0) {
						local76 += local137;
						local121 -= local78;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZILjava/lang/String;B)Z")
	public static boolean method5139(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local46 >= '0' && local46 <= '9') {
				local76 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local76 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local76 = local46 - 'W';
			} else {
				return false;
			}
			if (local76 >= 10) {
				return false;
			}
			if (local26) {
				local76 = -local76;
			}
			@Pc(119) int local119 = local30 * 10 + local76;
			if (local30 != local119 / 10) {
				return false;
			}
			local30 = local119;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = Static224.aShort55 + (Static1.aShort1 - Static224.aShort55) * local7 / 100;
		@Pc(38) int local38 = arg6 * local32 >> 8;
		@Pc(44) int local44 = 16384 - arg5 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg3 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local38;
		if (local44 != 0) {
			local55 = -local38 * Class6_Sub1_Sub18.anIntArray642[local44] >> 15;
			local57 = Class6_Sub1_Sub18.anIntArray643[local44] * local38 >> 15;
		}
		if (local51 != 0) {
			local53 = Class6_Sub1_Sub18.anIntArray642[local51] * local57 >> 15;
			local57 = Class6_Sub1_Sub18.anIntArray643[local51] * local57 >> 15;
		}
		Static32.anInt521 = arg1 - local53;
		Static354.anInt5973 = arg0 - local55;
		Static217.anInt3768 = arg3;
		Static214.anInt3730 = arg2 - local57;
		Static189.anInt6581 = 0;
		Static303.anInt4990 = arg5;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIII)V")
	public static void method5142(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static423.aLong208 = 0L;
		@Pc(10) int local10 = Static172.method2743();
		if (arg1 == 3 || local10 == 3) {
			arg0 = true;
		}
		if (!Static44.aClass28_14.method3555()) {
			arg0 = true;
		}
		Static17.method269(arg0, arg3, local10, arg1, arg2);
	}
}

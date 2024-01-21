import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_25;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!pe;")
	public static Class13 aClass13_37;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt4244;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1169 = Static158.method3034("leuchten3:");

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1170 = Static158.method3034("<col=ffff00>");

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1171 = Static158.method3034("<col=00ffff>");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 - arg4;
		@Pc(18) int local18 = arg1 - arg4;
		@Pc(22) int local22 = local13 * local13;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(32) int local32 = 0;
		@Pc(36) int local36 = local18 * local18;
		@Pc(40) int local40 = local30 << 1;
		@Pc(44) int local44 = arg1 * arg1;
		@Pc(48) int local48 = local44 << 1;
		@Pc(52) int local52 = arg1 << 1;
		@Pc(61) int local61 = local44 - local40 * (local52 - 1);
		@Pc(65) int local65 = local36 << 1;
		@Pc(69) int local69 = local22 << 1;
		@Pc(78) int local78 = local48 + (1 - local52) * local30;
		@Pc(82) int local82 = local18 << 1;
		@Pc(90) int local90 = local36 - local69 * (local82 - 1);
		@Pc(94) int local94 = local30 << 2;
		@Pc(98) int local98 = local44 << 2;
		@Pc(102) int local102 = local22 << 2;
		@Pc(111) int local111 = local22 * (1 - local82) + local65;
		@Pc(115) int local115 = local36 << 2;
		@Pc(119) int local119 = local48 * 3;
		@Pc(125) int local125 = local69 * (local82 - 3);
		@Pc(129) int local129 = local65 * 3;
		@Pc(135) int local135 = local40 * (local52 - 3);
		@Pc(141) int local141 = (arg1 - 1) * local94;
		@Pc(143) int local143 = local115;
		@Pc(145) int local145 = local98;
		@Pc(168) int local168;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(192) int local192;
		if (Static36.anInt1076 <= arg5 && arg5 <= Static117.anInt951) {
			@Pc(159) int[] local159 = Static42.anIntArrayArray8[arg5];
			local168 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 - arg2);
			local176 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg2 + arg3);
			local184 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 - local13);
			local192 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local13 + arg3);
			Static163.method3070(local184, local168, arg6, local159);
			Static163.method3070(local192, local184, arg0, local159);
			Static163.method3070(local176, local192, arg6, local159);
		}
		@Pc(216) int local216 = (local18 - 1) * local102;
		while (local9 > 0) {
			if (local78 < 0) {
				while (local78 < 0) {
					local7++;
					local78 += local119;
					local119 += local98;
					local61 += local145;
					local145 += local98;
				}
			}
			if (local61 < 0) {
				local78 += local119;
				local61 += local145;
				local145 += local98;
				local7++;
				local119 += local98;
			}
			local78 += -local141;
			@Pc(279) boolean local279 = local9 <= local18;
			local141 -= local94;
			local9--;
			local176 = arg5 + local9;
			if (local279) {
				if (local111 < 0) {
					while (local111 < 0) {
						local32++;
						local111 += local129;
						local90 += local143;
						local129 += local115;
						local143 += local115;
					}
				}
				if (local90 < 0) {
					local32++;
					local90 += local143;
					local143 += local115;
					local111 += local129;
					local129 += local115;
				}
				local90 += -local125;
				local125 -= local102;
				local111 += -local216;
				local216 -= local102;
			}
			local61 += -local135;
			local135 -= local94;
			local168 = arg5 - local9;
			if (Static36.anInt1076 <= local176 && local168 <= Static117.anInt951) {
				local184 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 + local7);
				local192 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 - local7);
				if (local279) {
					@Pc(402) int local402 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 + local32);
					@Pc(411) int local411 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 - local32);
					@Pc(422) int[] local422;
					if (Static36.anInt1076 <= local168) {
						local422 = Static42.anIntArrayArray8[local168];
						Static163.method3070(local411, local192, arg6, local422);
						Static163.method3070(local402, local411, arg0, local422);
						Static163.method3070(local184, local402, arg6, local422);
					}
					if (Static117.anInt951 >= local176) {
						local422 = Static42.anIntArrayArray8[local176];
						Static163.method3070(local411, local192, arg6, local422);
						Static163.method3070(local402, local411, arg0, local422);
						Static163.method3070(local184, local402, arg6, local422);
					}
				} else {
					if (Static36.anInt1076 <= local168) {
						Static163.method3070(local184, local192, arg6, Static42.anIntArrayArray8[local168]);
					}
					if (local176 <= Static117.anInt951) {
						Static163.method3070(local184, local192, arg6, Static42.anIntArrayArray8[local176]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public static void method3262() {
		Static139.aClass2_Sub3_Sub1_32.method247();
		@Pc(11) int local11 = Static139.aClass2_Sub3_Sub1_32.method246(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static139.aClass2_Sub3_Sub1_32.method246(2);
		if (local22 == 0) {
			Static113.anIntArray361[Static148.anInt3844++] = 2047;
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (local22 == 1) {
			local48 = Static139.aClass2_Sub3_Sub1_32.method246(3);
			Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.method2559(local48, false);
			local58 = Static139.aClass2_Sub3_Sub1_32.method246(1);
			if (local58 == 1) {
				Static113.anIntArray361[Static148.anInt3844++] = 2047;
			}
			return;
		}
		@Pc(98) int local98;
		if (local22 == 2) {
			local48 = Static139.aClass2_Sub3_Sub1_32.method246(3);
			Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.method2559(local48, true);
			local58 = Static139.aClass2_Sub3_Sub1_32.method246(3);
			Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.method2559(local58, true);
			local98 = Static139.aClass2_Sub3_Sub1_32.method246(1);
			if (local98 == 1) {
				Static113.anIntArray361[Static148.anInt3844++] = 2047;
			}
		} else if (local22 == 3) {
			local48 = Static139.aClass2_Sub3_Sub1_32.method246(1);
			Static62.anInt1923 = Static139.aClass2_Sub3_Sub1_32.method246(2);
			local58 = Static139.aClass2_Sub3_Sub1_32.method246(7);
			local98 = Static139.aClass2_Sub3_Sub1_32.method246(1);
			if (local98 == 1) {
				Static113.anIntArray361[Static148.anInt3844++] = 2047;
			}
			@Pc(153) int local153 = Static139.aClass2_Sub3_Sub1_32.method246(7);
			Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.method2555(local153, local58, local48 == 1);
		}
	}
}

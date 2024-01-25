import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BZ)Z")
	public static boolean method846(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static289.aClass81_7.method3024();
		if (arg0 == local14) {
			return true;
		}
		if (!arg0) {
			Static289.aClass81_7.method2963();
		} else if (!Static289.aClass81_7.method3005()) {
			arg0 = false;
		}
		if (local14 == arg0) {
			return false;
		} else {
			Static131.aBoolean201 = arg0;
			Static71.method1264(Static308.aClass206_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!pe;)V")
	public static void method847(@OriginalArg(1) Class44_Sub4_Sub4 arg0) {
		if (arg0 instanceof Class44_Sub4_Sub4_Sub2) {
			@Pc(22) Class44_Sub4_Sub4_Sub2 local22 = (Class44_Sub4_Sub4_Sub2) arg0;
			if (local22.aClass18_1 != null) {
				Static117.method2380(local22);
			}
		} else if (arg0 instanceof Class44_Sub4_Sub4_Sub1) {
			Static71.method1265((Class44_Sub4_Sub4_Sub1) arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V")
	public static void method848(@OriginalArg(1) boolean arg0) {
		if (Static205.aBoolean420 != arg0) {
			Static205.aBoolean420 = arg0;
			Static242.method4251();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIBII)V")
	public static void method849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg1;
		@Pc(21) int local21 = arg5 - arg1;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(135) int local135 = local49 * 3;
		@Pc(141) int local141 = (local61 - 3) * local53;
		@Pc(143) int local143 = local105;
		@Pc(149) int local149 = (arg5 - 1) * local101;
		@Pc(151) int local151 = local113;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(200) int local200;
		if (Static327.anInt3039 <= arg0 && Static230.anInt4308 >= arg0) {
			@Pc(165) int[] local165 = Static11.anIntArrayArray11[arg0];
			local174 = Static6.method125(arg3 - arg4, Static265.anInt4933, Static311.anInt5837);
			local182 = Static6.method125(arg4 + arg3, Static265.anInt4933, Static311.anInt5837);
			local191 = Static6.method125(arg3 - local16, Static265.anInt4933, Static311.anInt5837);
			local200 = Static6.method125(arg3 + local16, Static265.anInt4933, Static311.anInt5837);
			Static14.method247(local191, arg6, local165, local174);
			Static14.method247(local200, arg2, local165, local191);
			Static14.method247(local182, arg6, local165, local200);
		}
		@Pc(224) int local224 = (local21 - 1) * local109;
		while (local9 > 0) {
			@Pc(237) boolean local237 = local21 >= local9;
			if (local237) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local135;
						local97 += local151;
						local151 += local113;
						local135 += local113;
						local11++;
					}
				}
				if (local97 < 0) {
					local88 += local135;
					local97 += local151;
					local151 += local113;
					local135 += local113;
					local11++;
				}
				local97 += -local141;
				local88 += -local224;
				local224 -= local109;
				local141 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local117;
					local79 += local143;
					local7++;
					local117 += local105;
					local143 += local105;
				}
			}
			if (local79 < 0) {
				local79 += local143;
				local70 += local117;
				local117 += local105;
				local7++;
				local143 += local105;
			}
			local70 += -local149;
			local79 += -local123;
			local123 -= local101;
			local9--;
			local149 -= local101;
			local174 = arg0 - local9;
			local182 = local9 + arg0;
			if (Static327.anInt3039 <= local182 && local174 <= Static230.anInt4308) {
				local191 = Static6.method125(arg3 + local7, Static265.anInt4933, Static311.anInt5837);
				local200 = Static6.method125(arg3 - local7, Static265.anInt4933, Static311.anInt5837);
				if (local237) {
					@Pc(440) int local440 = Static6.method125(arg3 + local11, Static265.anInt4933, Static311.anInt5837);
					@Pc(449) int local449 = Static6.method125(arg3 - local11, Static265.anInt4933, Static311.anInt5837);
					@Pc(460) int[] local460;
					if (Static327.anInt3039 <= local174) {
						local460 = Static11.anIntArrayArray11[local174];
						Static14.method247(local449, arg6, local460, local200);
						Static14.method247(local440, arg2, local460, local449);
						Static14.method247(local191, arg6, local460, local440);
					}
					if (local182 <= Static230.anInt4308) {
						local460 = Static11.anIntArrayArray11[local182];
						Static14.method247(local449, arg6, local460, local200);
						Static14.method247(local440, arg2, local460, local449);
						Static14.method247(local191, arg6, local460, local440);
					}
				} else {
					if (local174 >= Static327.anInt3039) {
						Static14.method247(local191, arg6, Static11.anIntArrayArray11[local174], local200);
					}
					if (local182 <= Static230.anInt4308) {
						Static14.method247(local191, arg6, Static11.anIntArrayArray11[local182], local200);
					}
				}
			}
		}
	}
}

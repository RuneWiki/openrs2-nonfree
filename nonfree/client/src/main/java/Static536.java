import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!um", name = "n", descriptor = "I")
	public static int anInt9710;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	public static int anInt9712;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	public static void method7895() {
		for (@Pc(1) int local1 = 0; local1 < Static228.anInt4641; local1++) {
			@Pc(6) Class64 local6 = Static200.aClass64Array1[local1];
			@Pc(8) boolean local8 = false;
			@Pc(133) int local133;
			if (local6.aClass3_Sub14_Sub2_1 == null) {
				local6.anInt2302--;
				if (local6.anInt2302 < (local6.method2100() ? -1500 : -10)) {
					local8 = true;
				} else {
					if (local6.aByte22 == 1 && local6.aClass273_1 == null) {
						local6.aClass273_1 = Static607.method6869(Static151.aClass254_50, local6.anInt2300, 0);
						if (local6.aClass273_1 == null) {
							continue;
						}
						local6.anInt2302 += local6.aClass273_1.method6870();
					} else if (local6.method2100() && (local6.aClass3_Sub16_1 == null || local6.aClass3_Sub6_Sub1_1 == null)) {
						if (local6.aClass3_Sub16_1 == null) {
							local6.aClass3_Sub16_1 = Static176.method3142(Static33.aClass254_14, local6.anInt2300);
						}
						if (local6.aClass3_Sub16_1 == null) {
							continue;
						}
						if (local6.aClass3_Sub6_Sub1_1 == null) {
							local6.aClass3_Sub6_Sub1_1 = local6.aClass3_Sub16_1.method3134(new int[] { 22050 });
							if (local6.aClass3_Sub6_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local6.anInt2302 < 0) {
						if (local6.anInt2303 == 0) {
							local133 = local6.anInt2297 * (local6.aByte22 == 3 ? Static455.aClass3_Sub27_Sub1_1.anInt4795 : Static455.aClass3_Sub27_Sub1_1.anInt4799) >> 8;
						} else {
							@Pc(141) int local141 = local6.anInt2303 >> 24 & 0x3;
							if (Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 == local141) {
								@Pc(159) int local159 = (local6.anInt2303 & 0xFF) << 9;
								@Pc(166) int local166 = local6.anInt2303 >> 16 & 0xFF;
								@Pc(176) int local176 = (local166 << 9) + 256 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398;
								if (local176 < 0) {
									local176 = -local176;
								}
								@Pc(191) int local191 = local6.anInt2303 >> 8 & 0xFF;
								@Pc(201) int local201 = (local191 << 9) + 256 - Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396;
								if (local201 < 0) {
									local201 = -local201;
								}
								@Pc(215) int local215 = local176 + local201 - 512;
								if (local159 < local215) {
									local6.anInt2302 = -99999;
									continue;
								}
								if (local215 < 0) {
									local215 = 0;
								}
								local133 = (local159 - local215) * Static455.aClass3_Sub27_Sub1_1.anInt4797 * local6.anInt2297 / local159 >> 8;
							} else {
								local133 = 0;
							}
						}
						if (local133 > 0) {
							@Pc(250) Class3_Sub6_Sub1 local250 = null;
							if (local6.aByte22 == 1) {
								local250 = local6.aClass273_1.method6871().method1167(Static56.aClass222_1);
							} else if (local6.method2100()) {
								local250 = local6.aClass3_Sub6_Sub1_1;
							}
							@Pc(276) Class3_Sub14_Sub2 local276 = local6.aClass3_Sub14_Sub2_1 = Static606.method6354(local250, local133);
							local276.method6369(local6.anInt2299 - 1);
							Static485.aClass3_Sub14_Sub1_2.method2820(local276);
						}
					}
				}
			} else if (!local6.aClass3_Sub14_Sub2_1.method8414()) {
				local8 = true;
			}
			if (local8) {
				Static228.anInt4641--;
				for (local133 = local1; local133 < Static228.anInt4641; local133++) {
					Static200.aClass64Array1[local133] = Static200.aClass64Array1[local133 + 1];
				}
				local1--;
			}
		}
		if (Static353.aBoolean597 && !Static88.method2036()) {
			if (Static455.aClass3_Sub27_Sub1_1.anInt4793 != 0 && Static509.anInt9416 != -1) {
				Static491.method6679(Static455.aClass3_Sub27_Sub1_1.anInt4793, Static302.aClass254_86, Static509.anInt9416);
			}
			Static353.aBoolean597 = false;
		} else if (Static455.aClass3_Sub27_Sub1_1.anInt4793 != 0 && Static509.anInt9416 != -1 && !Static88.method2036()) {
			@Pc(367) Class3_Sub9 local367 = Static587.method8316(Static187.aClass40_2, Static339.aClass230_67);
			local367.aClass3_Sub7_Sub1_1.method6495(Static509.anInt9416);
			Static230.method3933(local367);
			Static509.anInt9416 = -1;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII[BB)Z")
	public static boolean method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 7) / 8);
		@Pc(46) int local46 = -((arg1 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local16;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}
}

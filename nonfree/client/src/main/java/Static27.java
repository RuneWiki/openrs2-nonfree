import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Lclient!qda;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "I")
	public static int anInt370;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	public static int anInt372;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public static void method369() {
		while (true) {
			if (Static386.aClass5_Sub15_Sub2_2.method3703(Static139.anInt2291) >= 15) {
				@Pc(20) int local20 = Static386.aClass5_Sub15_Sub2_2.method3702(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					@Pc(34) Class5_Sub34 local34 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local20);
					@Pc(40) Class41_Sub1_Sub1_Sub3_Sub1 local40;
					if (local34 == null) {
						local40 = new Class41_Sub1_Sub1_Sub3_Sub1();
						local40.anInt9469 = local20;
						local34 = new Class5_Sub34(local40);
						Static223.aClass335_19.method7770((long) local20, local34);
						local27 = true;
						Static278.aClass5_Sub34Array1[Static562.anInt9155++] = local34;
					}
					local40 = local34.aClass41_Sub1_Sub1_Sub3_Sub1_1;
					Static662.anIntArray600[Static386.anInt6720++] = local20;
					local40.anInt9500 = Static483.anInt8316;
					if (local40.aClass311_1 != null && local40.aClass311_1.method7322()) {
						Static207.method2883(local40);
					}
					@Pc(94) int local94 = Static386.aClass5_Sub15_Sub2_2.method3702(5);
					if (local94 > 15) {
						local94 -= 32;
					}
					@Pc(105) int local105 = Static386.aClass5_Sub15_Sub2_2.method3702(1);
					if (local105 == 1) {
						Static109.anIntArray103[Static118.anInt2047++] = local20;
					}
					@Pc(129) int local129 = Static386.aClass5_Sub15_Sub2_2.method3702(3) + 4 << 11 & 0x3EFB;
					local40.method4716(Static58.aClass230_1.method5297(Static386.aClass5_Sub15_Sub2_2.method3702(14)));
					@Pc(144) int local144 = Static386.aClass5_Sub15_Sub2_2.method3702(2);
					@Pc(149) int local149 = Static386.aClass5_Sub15_Sub2_2.method3702(5);
					if (local149 > 15) {
						local149 -= 32;
					}
					@Pc(158) int local158 = Static386.aClass5_Sub15_Sub2_2.method3702(1);
					local40.method7928(local40.aClass311_1.anInt8641);
					local40.anInt9474 = local40.aClass311_1.anInt8678 << 3;
					if (local27) {
						local40.method7925(true, local129);
					}
					local40.method4713(local40.method7917(), local94 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0], local158 == 1, local149 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0], local144);
					if (local40.aClass311_1.method7322()) {
						Static578.method7881(local40.anIntArray527[0], 0, (Class41_Sub1_Sub1_Sub3_Sub2) null, local40, local40.aByte149, local40.anIntArray528[0], (Class81) null);
					}
					continue;
				}
			}
			Static386.aClass5_Sub15_Sub2_2.method3710();
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!nb;IIII)V")
	public static void method371(@OriginalArg(1) Class5_Sub38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt6677 == -1 && arg0.anIntArray377 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg0.anInt6684 * Static655.aClass5_Sub36_29.aClass2_Sub6_1.method3364() >> 8;
		if (arg3 > arg0.anInt6685) {
			local15 = arg3 - arg0.anInt6685;
		} else if (arg0.anInt6691 > arg3) {
			local15 = arg0.anInt6691 - arg3;
		}
		if (arg2 > arg0.anInt6695) {
			local15 += arg2 - arg0.anInt6695;
		} else if (arg2 < arg0.anInt6680) {
			local15 += arg0.anInt6680 - arg2;
		}
		if (arg0.anInt6690 == 0 || arg0.anInt6690 < local15 - 256 || Static655.aClass5_Sub36_29.aClass2_Sub6_1.method3364() == 0 || arg0.anInt6688 != arg4) {
			if (arg0.aClass5_Sub14_Sub1_3 != null) {
				Static229.aClass5_Sub14_Sub3_1.method2294(arg0.aClass5_Sub14_Sub1_3);
				arg0.aClass5_Sub54_2 = null;
				arg0.aClass5_Sub9_Sub1_3 = null;
				arg0.aClass5_Sub14_Sub1_3 = null;
			}
			if (arg0.aClass5_Sub14_Sub1_2 != null) {
				Static229.aClass5_Sub14_Sub3_1.method2294(arg0.aClass5_Sub14_Sub1_2);
				arg0.aClass5_Sub14_Sub1_2 = null;
				arg0.aClass5_Sub9_Sub1_2 = null;
				arg0.aClass5_Sub54_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(152) int local152 = arg0.anInt6690 - arg0.anInt6679;
		if (local152 < 0) {
			local152 = arg0.anInt6690;
		}
		@Pc(162) int local162 = local25;
		@Pc(168) int local168 = local15 - arg0.anInt6679;
		if (local168 > 0 && local152 > 0) {
			local162 = (local152 - local168) * local25 / local152;
		}
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917();
		@Pc(189) int local189 = 8192;
		@Pc(200) int local200 = (arg0.anInt6691 + arg0.anInt6685) / 2 - arg3;
		@Pc(211) int local211 = (arg0.anInt6695 + arg0.anInt6680) / 2 - arg2;
		@Pc(235) int local235;
		@Pc(248) int local248;
		if (local200 != 0 || local211 != 0) {
			local235 = -Static493.anInt8442 - (int) (Math.atan2((double) local200, (double) local211) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local235 > 8192) {
				local235 = 16384 - local235;
			}
			if (local15 <= 0) {
				local248 = 8192;
			} else if (local15 < 4096) {
				local248 = local15 * 8192 / 4096 + 8192;
			} else {
				local248 = 16384;
			}
			local189 = (16384 - local248 >> 1) + local235 * local248 / 8192;
		}
		@Pc(381) Class5_Sub14_Sub1 local381;
		if (arg0.aClass5_Sub14_Sub1_3 != null) {
			arg0.aClass5_Sub14_Sub1_3.method1346(local162);
			arg0.aClass5_Sub14_Sub1_3.method1364(local189);
		} else if (arg0.anInt6677 >= 0) {
			local235 = arg0.anInt6682 == 256 && arg0.anInt6681 == 256 ? 256 : Static537.method8642(arg0.anInt6682, arg0.anInt6681);
			if (arg0.aBoolean478) {
				if (arg0.aClass5_Sub54_2 == null) {
					arg0.aClass5_Sub54_2 = Static638.method8461(Static2.aClass50_3, arg0.anInt6677);
				}
				if (arg0.aClass5_Sub54_2 != null) {
					if (arg0.aClass5_Sub9_Sub1_3 == null) {
						arg0.aClass5_Sub9_Sub1_3 = arg0.aClass5_Sub54_2.method8463(new int[] { 22050 });
					}
					if (arg0.aClass5_Sub9_Sub1_3 != null) {
						local381 = Static678.method1349(arg0.aClass5_Sub9_Sub1_3, local235, local162 << 6, local189);
						local381.method1361(-1);
						Static229.aClass5_Sub14_Sub3_1.method2298(local381);
						arg0.aClass5_Sub14_Sub1_3 = local381;
					}
				}
			} else {
				@Pc(317) Class259 local317 = Static682.method6432(Static647.aClass50_113, arg0.anInt6677, 0);
				if (local317 != null) {
					@Pc(324) Class5_Sub9_Sub1 local324 = local317.method6434().method462(Static123.aClass158_1);
					@Pc(332) Class5_Sub14_Sub1 local332 = Static678.method1349(local324, local235, local162 << 6, local189);
					local332.method1361(-1);
					Static229.aClass5_Sub14_Sub3_1.method2298(local332);
					arg0.aClass5_Sub14_Sub1_3 = local332;
				}
			}
		}
		if (arg0.aClass5_Sub14_Sub1_2 != null) {
			arg0.aClass5_Sub14_Sub1_2.method1346(local162);
			arg0.aClass5_Sub14_Sub1_2.method1364(local189);
			if (arg0.aClass5_Sub14_Sub1_2.method8826()) {
				return;
			}
			arg0.aClass5_Sub54_3 = null;
			arg0.aClass5_Sub9_Sub1_2 = null;
			arg0.aClass5_Sub14_Sub1_2 = null;
		} else if (arg0.anIntArray377 != null && (arg0.anInt6689 -= arg1) <= 0) {
			local235 = arg0.anInt6682 == 256 && arg0.anInt6681 == 256 ? 256 : (int) ((double) (arg0.anInt6682 - arg0.anInt6681) * Math.random()) + arg0.anInt6681;
			if (!arg0.aBoolean477) {
				local248 = (int) (Math.random() * (double) arg0.anIntArray377.length);
				@Pc(461) Class259 local461 = Static682.method6432(Static647.aClass50_113, arg0.anIntArray377[local248], 0);
				if (local461 != null) {
					@Pc(468) Class5_Sub9_Sub1 local468 = local461.method6434().method462(Static123.aClass158_1);
					@Pc(476) Class5_Sub14_Sub1 local476 = Static678.method1349(local468, local235, local162 << 6, local189);
					local476.method1361(0);
					Static229.aClass5_Sub14_Sub3_1.method2298(local476);
					arg0.anInt6689 = (int) (Math.random() * (double) (arg0.anInt6687 - arg0.anInt6696)) + arg0.anInt6696;
					arg0.aClass5_Sub14_Sub1_2 = local476;
					return;
				}
				return;
			}
			if (arg0.aClass5_Sub54_3 == null) {
				local248 = (int) ((double) arg0.anIntArray377.length * Math.random());
				arg0.aClass5_Sub54_3 = Static638.method8461(Static2.aClass50_3, arg0.anIntArray377[local248]);
			}
			if (arg0.aClass5_Sub54_3 != null) {
				if (arg0.aClass5_Sub9_Sub1_2 == null) {
					arg0.aClass5_Sub9_Sub1_2 = arg0.aClass5_Sub54_3.method8463(new int[] { 22050 });
				}
				if (arg0.aClass5_Sub9_Sub1_2 != null) {
					local381 = Static678.method1349(arg0.aClass5_Sub9_Sub1_2, local235, local162 << 6, local189);
					local381.method1361(0);
					Static229.aClass5_Sub14_Sub3_1.method2298(local381);
					arg0.aClass5_Sub14_Sub1_2 = local381;
					arg0.anInt6689 = arg0.anInt6696 + (int) ((double) (arg0.anInt6687 - arg0.anInt6696) * Math.random());
					return;
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class16_Sub2_Sub1 extends Class16_Sub2 {

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!qe;IIII[[I[[II)V")
	public Class16_Sub2_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([II[IILclient!ml;IIIII[[ZI)V")
	private void method2201(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class227 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) boolean[][] arg7) {
		@Pc(14) int local14 = (arg5 - arg6) * 1024 / 256;
		arg3.aBoolean435 = false;
		arg3.aBoolean436 = false;
		@Pc(34) int local34 = 0;
		@Pc(39) int local39 = local14;
		for (@Pc(41) int local41 = arg2; local41 < arg4; local41++) {
			for (@Pc(45) int local45 = arg6; local45 < arg5; local45++) {
				if (arg7[local41 - arg2][local45 - arg6]) {
					@Pc(154) int local154;
					if (super.aClass38ArrayArray3[local41][local45] != null) {
						@Pc(73) Class38 local73 = super.aClass38ArrayArray3[local41][local45];
						if (local73.aShort26 != -1 && (local73.aByte16 & 0x2) == 0 && local73.anInt896 == -1) {
							local154 = super.aClass66_Sub2_11.method2963(local73.aShort26);
							arg3.method4977(local39 - 4, local39 - 4, local39, local34 + 4, local34, local34 + 4, Static253.method4246(local73.aShort28 & 0xFFFF, local154), Static253.method4246(local73.aShort24 & 0xFFFF, local154), Static253.method4246(local73.aShort25 & 0xFFFF, local154));
							arg3.method4977(local39, local39, local39 - 4, local34, local34 + 4, local34, Static253.method4246(local73.aShort27 & 0xFFFF, local154), Static253.method4246(local73.aShort25 & 0xFFFF, local154), Static253.method4246(local73.aShort24 & 0xFFFF, local154));
						} else if (local73.anInt896 == -1) {
							arg3.method4977(local39 - 4, local39 + -4, local39, local34 + 4, local34, local34 + 4, local73.aShort28 & 0xFFFF, local73.aShort24 & 0xFFFF, local73.aShort25 & 0xFFFF);
							arg3.method4977(local39, local39, local39 - 4, local34, local34 + 4, local34, local73.aShort27 & 0xFFFF, local73.aShort25 & 0xFFFF, local73.aShort24 & 0xFFFF);
						} else {
							local154 = local73.anInt896;
							arg3.method4977(local39 - 4, local39 - 4, local39, local34 + 4, local34, local34 + 4, local154, local154, local154);
							arg3.method4977(local39, local39, local39 - 4, local34, local34 + 4, local34, local154, local154, local154);
						}
					} else if (super.aClass126ArrayArray3[local41][local45] != null) {
						@Pc(286) Class126 local286 = super.aClass126ArrayArray3[local41][local45];
						for (local154 = 0; local154 < local286.aShort55; local154++) {
							arg1[local154] = local286.aShortArray77[local154] * 4 / super.anInt9841 + local34;
							arg0[local154] = local39 - local286.aShortArray81[local154] * 4 / super.anInt9841;
						}
						for (@Pc(326) int local326 = 0; local326 < local286.aShort56; local326++) {
							@Pc(333) short local333 = local286.aShortArray78[local326];
							@Pc(338) short local338 = local286.aShortArray80[local326];
							@Pc(343) short local343 = local286.aShortArray76[local326];
							@Pc(347) int local347 = arg1[local333];
							@Pc(351) int local351 = arg1[local338];
							@Pc(355) int local355 = arg1[local343];
							@Pc(359) int local359 = arg0[local333];
							@Pc(363) int local363 = arg0[local338];
							@Pc(367) int local367 = arg0[local343];
							@Pc(381) int local381;
							if (local286.anIntArray364 != null && local286.anIntArray364[local326] != -1) {
								local381 = local286.anIntArray364[local326];
								arg3.method4977(local359, local363, local367, local347, local351, local355, Static253.method4246(local286.aShortArray74[local333], local381), Static253.method4246(local286.aShortArray74[local338], local381), Static253.method4246(local286.aShortArray74[local343], local381));
							} else if (local286.aShortArray79 == null || local286.aShortArray79[local326] == -1) {
								local381 = local286.anIntArray363[local326];
								arg3.method4977(local359, local363, local367, local347, local351, local355, Static253.method4246(local286.aShortArray74[local333], local381), Static253.method4246(local286.aShortArray74[local338], local381), Static253.method4246(local286.aShortArray74[local343], local381));
							} else {
								local381 = super.aClass66_Sub2_11.method2963(local286.aShortArray79[local326]);
								arg3.method4977(local359, local363, local367, local347, local351, local355, Static253.method4246(local286.aShortArray74[local333], local381), Static253.method4246(local286.aShortArray74[local338], local381), Static253.method4246(local286.aShortArray74[local343], local381));
							}
						}
					}
				}
				local39 -= 4;
			}
			local39 = local14;
			local34 += 4;
		}
		arg3.aBoolean436 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	@Override
	public void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class94_Sub1 local9 = (Class94_Sub1) super.aClass66_Sub2_11.method2953(Thread.currentThread());
		local9.aClass227_2.anInt5884 = 0;
		if (super.aClass296ArrayArray3 != null) {
			this.method2204(arg1, local9.anIntArray573, local9.anIntArray550, local9.anIntArray566, super.aClass66_Sub2_11.aBoolean253, arg0, local9.aClass227_2);
		} else if (super.aClass38ArrayArray3 != null) {
			this.method2205(local9.anIntArray566, local9.anIntArray573, local9.anIntArray550, local9.aClass227_2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[IILclient!ml;B[[ZIII[II)V")
	private void method2203(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class227 arg3, @OriginalArg(6) boolean[][] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg2 - arg5) * 1024 / 256;
		arg3.aBoolean435 = false;
		arg3.aBoolean436 = false;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local14;
		for (@Pc(36) int local36 = arg0; local36 < arg7; local36++) {
			for (@Pc(40) int local40 = arg5; local40 < arg2; local40++) {
				if (arg4[local36 - arg0][local40 - arg5]) {
					@Pc(89) int local89;
					if (super.aClass296ArrayArray3[local36][local40] != null) {
						@Pc(68) Class296 local68 = super.aClass296ArrayArray3[local36][local40];
						if (local68.aShort103 != -1 && (local68.aByte88 & 0x2) == 0 && local68.anInt7912 == 0) {
							local89 = super.aClass66_Sub2_11.method2963(local68.aShort103);
							arg3.method4977(local34 - 4, local34 - 4, local34, local30 + 4, local30, local30 + 4, Static253.method4246(local68.anInt7914, local89), Static253.method4246(local68.anInt7915, local89), Static253.method4246(local68.anInt7916, local89));
							arg3.method4977(local34, local34, local34 - 4, local30, local30 + 4, local30, Static253.method4246(local68.anInt7913, local89), Static253.method4246(local68.anInt7916, local89), Static253.method4246(local68.anInt7915, local89));
						} else if (local68.anInt7912 == 0) {
							arg3.method4984(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, local68.anInt7914, local68.anInt7915, local68.anInt7916);
							arg3.method4984(local34, local34, local34 - 4, local30, local30 + 4, local30, local68.anInt7913, local68.anInt7916, local68.anInt7915);
						} else {
							local89 = local68.anInt7912;
							arg3.method4984(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static482.method6709(local68.anInt7914 & 0xFF000000, local89), Static482.method6709(local68.anInt7915 & 0xFF000000, local89), Static482.method6709(local68.anInt7916 & 0xFF000000, local89));
							arg3.method4984(local34, local34, local34 - 4, local30, local30 + 4, local30, Static482.method6709(local68.anInt7913 & 0xFF000000, local89), Static482.method6709(local68.anInt7916 & 0xFF000000, local89), Static482.method6709(local68.anInt7915 & 0xFF000000, local89));
						}
					} else if (super.aClass323ArrayArray3[local36][local40] != null) {
						@Pc(298) Class323 local298 = super.aClass323ArrayArray3[local36][local40];
						for (local89 = 0; local89 < local298.aShort113; local89++) {
							arg1[local89] = local298.aShortArray152[local89] * 4 / super.anInt9841 + local30;
							arg6[local89] = local34 - local298.aShortArray149[local89] * 4 / super.anInt9841;
						}
						for (@Pc(341) int local341 = 0; local341 < local298.aShort112; local341++) {
							@Pc(347) int local347 = local341 * 3;
							@Pc(351) int local351 = local347 + 1;
							@Pc(355) int local355 = local351 + 1;
							@Pc(359) int local359 = arg1[local347];
							@Pc(363) int local363 = arg1[local351];
							@Pc(367) int local367 = arg1[local355];
							@Pc(371) int local371 = arg6[local347];
							@Pc(375) int local375 = arg6[local351];
							@Pc(379) int local379 = arg6[local355];
							@Pc(405) int local405;
							if (local298.anIntArray674 != null && local298.anIntArray674[local341] != 0 && (local298.aShortArray150 == null || local298.aShortArray150 != null && local298.aShortArray150[local341] == -1)) {
								local405 = local298.anIntArray674[local341];
								arg3.method4984(local371, local375, local379, local359, local363, local367, Static482.method6709(-(-16777216 & local298.anIntArray675[local347]) - 16777216, local405), Static482.method6709(-(local298.anIntArray675[local351] & 0xFF000000) - 16777216, local405), Static482.method6709(-(local298.anIntArray675[local355] & 0xFF000000) - 16777216, local405));
							} else if (local298.aShortArray150 == null || local298.aShortArray150[local341] == -1) {
								arg3.method4984(local371, local375, local379, local359, local363, local367, local298.anIntArray675[local347], local298.anIntArray675[local351], local298.anIntArray675[local355]);
							} else {
								local405 = super.aClass66_Sub2_11.method2963(local298.aShortArray150[local341]);
								arg3.method4977(local371, local375, local379, local359, local363, local367, local405, local405, local405);
							}
						}
					}
				}
				local34 -= 4;
			}
			local34 = local14;
			local30 += 4;
		}
		arg3.aBoolean436 = true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB[I[I[IZILclient!ml;)V")
	private void method2204(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class227 arg6) {
		@Pc(18) Class296 local18 = super.aClass296ArrayArray3[arg5][arg0];
		@Pc(40) int local40;
		@Pc(45) int local45;
		@Pc(51) int local51;
		@Pc(327) int local327;
		@Pc(384) int local384;
		@Pc(442) int local442;
		@Pc(499) int local499;
		@Pc(338) int local338;
		@Pc(413) int local413;
		@Pc(470) int local470;
		@Pc(510) int local510;
		@Pc(298) int local298;
		@Pc(355) int local355;
		@Pc(402) int local402;
		@Pc(459) int local459;
		@Pc(316) int local316;
		@Pc(373) int local373;
		@Pc(431) int local431;
		@Pc(487) int local487;
		@Pc(103) int local103;
		@Pc(128) int local128;
		@Pc(155) int local155;
		@Pc(182) int local182;
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(212) int local212;
		@Pc(76) int local76;
		@Pc(86) int local86;
		@Pc(281) int local281;
		@Pc(548) int local548;
		@Pc(768) int local768;
		if (local18 == null) {
			@Pc(1600) Class323 local1600 = super.aClass323ArrayArray3[arg5][arg0];
			if (local1600 != null) {
				if (super.anInt3733 == -1) {
					for (local499 = 0; local499 < local1600.aShort113; local499++) {
						local40 = local1600.aShortArray152[local499] + (arg5 << super.anInt9837);
						local45 = local1600.aShortArray154[local499];
						local51 = local1600.aShortArray149[local499] + (arg0 << super.anInt9837);
						local442 = super.anInt3744 + (local51 * super.anInt3736 + local40 * super.anInt3738 + local45 * super.anInt3735 >> 14);
						if (super.aClass66_Sub2_11.anInt3206 >= local442) {
							return;
						}
						arg2[local499] = 0;
						if (arg4) {
							local338 = local442 - super.aClass66_Sub2_11.anInt3223;
							if (local338 > 255) {
								local338 = 255;
							}
							if (local338 > 0) {
								arg2[local499] = local338;
								local413 = local338 * local1600.aShortArray151[local499] / 255;
								if (local413 > 0) {
									local45 -= local413;
								}
							}
						} else if (super.aClass66_Sub2_11.aBoolean254) {
							local338 = local442 - super.aClass66_Sub2_11.anInt3223;
							if (local338 > 0) {
								arg2[local499] = local338;
								if (arg2[local499] > 255) {
									arg2[local499] = 255;
								}
							}
						}
						local384 = super.anInt3739 + (super.anInt3740 * local51 + super.anInt3743 * local45 + local40 * super.anInt3746 >> 14);
						local327 = super.anInt3745 + (super.anInt3742 * local51 + local45 * super.anInt3734 + super.anInt3741 * local40 >> 14);
						arg3[local499] = arg6.anInt5887 + local327 * super.aClass66_Sub2_11.anInt3232 / local442;
						arg1[local499] = super.aClass66_Sub2_11.anInt3226 * local384 / local442 + arg6.anInt5882;
					}
				} else {
					for (local499 = 0; local499 < local1600.aShort113; local499++) {
						local40 = local1600.aShortArray152[local499] + (arg5 << super.anInt9837);
						local45 = local1600.aShortArray154[local499];
						local51 = local1600.aShortArray149[local499] + (arg0 << super.anInt9837);
						arg2[local499] = 0;
						if (arg4) {
							local338 = super.anInt3733 - super.aClass66_Sub2_11.anInt3223;
							if (local338 > 255) {
								local338 = 255;
							}
							if (local338 > 0) {
								arg2[local499] = local338;
								local413 = local1600.aShortArray151[local499] * local338 / 255;
								if (local413 > 0) {
									local45 -= local413;
								}
							}
						} else if (super.aClass66_Sub2_11.aBoolean254) {
							local338 = super.anInt3733 - super.aClass66_Sub2_11.anInt3223;
							if (local338 > 0) {
								arg2[local499] = local338;
								if (arg2[local499] > 255) {
									arg2[local499] = 255;
								}
							}
						}
						local327 = (super.anInt3734 * local45 + super.anInt3741 * local40 + local51 * super.anInt3742 >> 14) + super.anInt3745;
						local384 = (local40 * super.anInt3746 + local45 * super.anInt3743 + super.anInt3740 * local51 >> 14) + super.anInt3739;
						arg3[local499] = super.aClass66_Sub2_11.anInt3232 * local327 / super.anInt3733 + arg6.anInt5887;
						arg1[local499] = arg6.anInt5882 + local384 * super.aClass66_Sub2_11.anInt3226 / super.anInt3733;
					}
				}
				if (local1600.aShortArray150 == null) {
					for (local499 = 0; local499 < local1600.aShort112; local499++) {
						local338 = local499 * 3;
						local413 = local338 + 1;
						local470 = local413 + 1;
						local510 = arg3[local338];
						local298 = arg3[local413];
						local355 = arg3[local470];
						local402 = arg1[local338];
						local459 = arg1[local413];
						local316 = arg1[local470];
						local373 = arg2[local413] + arg2[local338] + arg2[local470];
						if (-((local402 - local459) * (local355 + -local298)) + (local316 - local459) * (-local298 + local510) > 0) {
							arg6.aBoolean437 = local510 < 0 || local298 < 0 || local355 < 0 || local510 > arg6.anInt5883 || local298 > arg6.anInt5883 || arg6.anInt5883 < local355;
							if (local373 >= 765) {
								arg6.method4975(local402, local459, local316, local510, local298, local355, super.aClass66_Sub2_11.anInt3209);
							} else if (local373 <= 0) {
								if ((local1600.anIntArray675[local338] & 0xFFFFFF) != 0) {
									arg6.method4984(local402, local459, local316, local510, local298, local355, local1600.anIntArray675[local338], local1600.anIntArray675[local413], local1600.anIntArray675[local470]);
								}
							} else if ((local1600.anIntArray675[local338] & 0xFFFFFF) != 0) {
								arg6.method4984(local402, local459, local316, local510, local298, local355, Static219.method3784(local1600.anIntArray675[local338], arg2[local338], super.aClass66_Sub2_11.anInt3209), Static219.method3784(local1600.anIntArray675[local413], arg2[local413], super.aClass66_Sub2_11.anInt3209), Static219.method3784(local1600.anIntArray675[local470], arg2[local470], super.aClass66_Sub2_11.anInt3209));
							}
						}
					}
				} else {
					local499 = super.anIntArrayArray46[arg5][arg0];
					local338 = super.anIntArrayArray46[arg5 + 1][arg0];
					local413 = super.anIntArrayArray46[arg5][arg0 + 1];
					local470 = super.anInt9841 * arg5;
					local510 = local470 + super.anInt9841;
					local298 = arg0 * super.anInt9841;
					local355 = super.anInt9841 + local298;
					local402 = super.anInt3745 + (super.anInt3742 * local298 + local470 * super.anInt3741 + local499 * super.anInt3734 >> 14);
					local459 = (super.anInt3743 * local499 + local470 * super.anInt3746 + super.anInt3740 * local298 >> 14) + super.anInt3739;
					local316 = super.anInt3744 + (local298 * super.anInt3736 + local470 * super.anInt3738 + super.anInt3735 * local499 >> 14);
					local373 = super.anInt3745 + (super.anInt3734 * local338 + super.anInt3741 * local510 + local298 * super.anInt3742 >> 14);
					local431 = super.anInt3739 + (local298 * super.anInt3740 + local510 * super.anInt3746 + super.anInt3743 * local338 >> 14);
					local487 = super.anInt3744 + (local510 * super.anInt3738 + super.anInt3735 * local338 + super.anInt3736 * local298 >> 14);
					local103 = (super.anInt3742 * local355 + local470 * super.anInt3741 + super.anInt3734 * local413 >> 14) + super.anInt3745;
					local128 = super.anInt3739 + (super.anInt3743 * local413 + local470 * super.anInt3746 + local355 * super.anInt3740 >> 14);
					local155 = super.anInt3744 + (local470 * super.anInt3738 + super.anInt3735 * local413 + local355 * super.anInt3736 >> 14);
					for (local182 = 0; local182 < local1600.aShort112; local182++) {
						local53 = local182 * 3;
						local55 = local53 + 1;
						local57 = local55 + 1;
						local59 = arg3[local53];
						local212 = arg3[local55];
						local76 = arg3[local57];
						local86 = arg1[local53];
						local281 = arg1[local55];
						local548 = arg1[local57];
						local768 = arg2[local53] + arg2[local55] + arg2[local57];
						if (-((local86 - local281) * (local76 - local212)) + (local59 - local212) * (-local281 + local548) > 0) {
							arg6.aBoolean437 = local59 < 0 || local212 < 0 || local76 < 0 || local59 > arg6.anInt5883 || arg6.anInt5883 < local212 || arg6.anInt5883 < local76;
							@Pc(2340) short local2340 = local1600.aShortArray150[local182];
							if (local768 >= 765) {
								arg6.method4975(local86, local281, local548, local59, local212, local76, super.aClass66_Sub2_11.anInt3209);
							} else {
								if (local2340 != -1 && this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local2340).aByte84)) {
									arg6.anInt5884 = 100;
								}
								if (local768 <= 0) {
									if (local2340 != -1) {
										arg6.method4978(local86, local281, local548, local59, local212, local76, local1600.anIntArray675[local53], local1600.anIntArray675[local55], local1600.anIntArray675[local57], local402, local373, local103, local459, local431, local128, local316, local487, local155, local2340);
									} else if ((local1600.anIntArray675[local53] & 0xFFFFFF) != 0) {
										arg6.method4984(local86, local281, local548, local59, local212, local76, local1600.anIntArray675[local53], local1600.anIntArray675[local55], local1600.anIntArray675[local57]);
									}
								} else if (local2340 != -1) {
									arg6.method4986(local86, local281, local548, local59, local212, local76, super.aClass66_Sub2_11.anInt3209, arg2[local53], arg2[local55], arg2[local57], local1600.anIntArray675[local53], local1600.anIntArray675[local55], local1600.anIntArray675[local57], local402, local373, local103, local459, local431, local128, local316, local487, local155, local2340);
								} else if ((local1600.anIntArray675[local53] & 0xFFFFFF) != 0) {
									arg6.method4984(local86, local281, local548, local59, local212, local76, Static482.method6709(arg2[local53] << 24 | super.aClass66_Sub2_11.anInt3209, local1600.anIntArray675[local53]), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | arg2[local55] << 24, local1600.anIntArray675[local55]), Static482.method6709(arg2[local57] << 24 | super.aClass66_Sub2_11.anInt3209, local1600.anIntArray675[local57]));
								}
								arg6.anInt5884 = 0;
							}
						}
					}
				}
			}
		} else if ((local18.aByte88 & 0x2) == 0) {
			@Pc(34) int local34 = super.anInt9841 * arg5;
			local40 = local34 + super.anInt9841;
			local45 = super.anInt9841 * arg0;
			local51 = local45 + super.anInt9841;
			local53 = 0;
			local55 = 0;
			local57 = 0;
			local59 = 0;
			if ((local18.aByte88 & 0x1) == 0 || arg4) {
				local76 = super.anIntArrayArray46[arg5][arg0];
				local86 = super.anIntArrayArray46[arg5 + 1][arg0];
				local281 = super.anIntArrayArray46[arg5 + 1][arg0 + 1];
				local548 = super.anIntArrayArray46[arg5][arg0 + 1];
				if (super.anInt3733 == -1) {
					local103 = super.anInt3744 + (super.anInt3735 * local76 + local34 * super.anInt3738 + local45 * super.anInt3736 >> 14);
					if (local103 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local128 = super.anInt3744 + (local45 * super.anInt3736 + local86 * super.anInt3735 + super.anInt3738 * local40 >> 14);
					if (local128 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local155 = (super.anInt3736 * local51 + super.anInt3735 * local281 + super.anInt3738 * local40 >> 14) + super.anInt3744;
					if (local155 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local182 = super.anInt3744 + (super.anInt3735 * local548 + local34 * super.anInt3738 + super.anInt3736 * local51 >> 14);
					if (super.aClass66_Sub2_11.anInt3206 >= local182) {
						return;
					}
				} else {
					local182 = super.anInt3733;
					local155 = super.anInt3733;
					local128 = super.anInt3733;
					local103 = super.anInt3733;
				}
				if (arg4) {
					local212 = local103 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local53 = local212;
						local768 = local212 * local18.aShort102 / 255;
						if (local768 > 0) {
							local76 -= local768;
						}
					}
					local212 = local128 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local55 = local212;
						local768 = local212 * local18.aShort100 / 255;
						if (local768 > 0) {
							local86 -= local768;
						}
					}
					local212 = local155 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local57 = local212;
						local768 = local212 * local18.aShort101 / 255;
						if (local768 > 0) {
							local281 -= local768;
						}
					}
					local212 = local182 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local59 = local212;
						local768 = local18.aShort99 * local212 / 255;
						if (local768 > 0) {
							local548 -= local768;
						}
					}
				} else if (super.aClass66_Sub2_11.aBoolean254) {
					local212 = local103 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local53 = local212;
						if (local212 > 255) {
							local53 = 255;
						}
					}
					local212 = local128 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local55 = local212;
						if (local212 > 255) {
							local55 = 255;
						}
					}
					local212 = local155 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local57 = local212;
						if (local212 > 255) {
							local57 = 255;
						}
					}
					local212 = local182 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local59 = local212;
						if (local212 > 255) {
							local59 = 255;
						}
					}
				}
				local298 = (super.anInt3734 * local76 + super.anInt3741 * local34 + super.anInt3742 * local45 >> 14) + super.anInt3745;
				local327 = super.aClass66_Sub2_11.anInt3232 * local298 / local103 + arg6.anInt5887;
				local316 = (local45 * super.anInt3740 + local34 * super.anInt3746 + local76 * super.anInt3743 >> 14) + super.anInt3739;
				local355 = super.anInt3745 + (local40 * super.anInt3741 + local86 * super.anInt3734 + local45 * super.anInt3742 >> 14);
				local338 = arg6.anInt5882 + super.aClass66_Sub2_11.anInt3226 * local316 / local103;
				local373 = (local40 * super.anInt3746 + local86 * super.anInt3743 + local45 * super.anInt3740 >> 14) + super.anInt3739;
				local384 = arg6.anInt5887 + local355 * super.aClass66_Sub2_11.anInt3232 / local128;
				local402 = super.anInt3745 + (super.anInt3741 * local40 + super.anInt3734 * local281 + super.anInt3742 * local51 >> 14);
				local413 = super.aClass66_Sub2_11.anInt3226 * local373 / local128 + arg6.anInt5882;
				local442 = super.aClass66_Sub2_11.anInt3232 * local402 / local155 + arg6.anInt5887;
				local431 = (local281 * super.anInt3743 + super.anInt3746 * local40 + super.anInt3740 * local51 >> 14) + super.anInt3739;
				local459 = (local34 * super.anInt3741 + super.anInt3734 * local548 + local51 * super.anInt3742 >> 14) + super.anInt3745;
				local470 = arg6.anInt5882 + super.aClass66_Sub2_11.anInt3226 * local431 / local155;
				local487 = super.anInt3739 + (local34 * super.anInt3746 + local548 * super.anInt3743 + local51 * super.anInt3740 >> 14);
				local499 = arg6.anInt5887 + super.aClass66_Sub2_11.anInt3232 * local459 / local182;
				local510 = arg6.anInt5882 + super.aClass66_Sub2_11.anInt3226 * local487 / local182;
			} else {
				local76 = super.anIntArrayArray46[arg5][arg0];
				if (super.anInt3733 == -1) {
					local86 = local76 * super.anInt3735;
					local103 = (super.anInt3736 * local45 + local34 * super.anInt3738 + local86 >> 14) + super.anInt3744;
					if (local103 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local128 = (super.anInt3738 * local40 + local86 + local45 * super.anInt3736 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local128) {
						return;
					}
					local155 = (local51 * super.anInt3736 + local40 * super.anInt3738 + local86 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local155) {
						return;
					}
					local182 = super.anInt3744 + (super.anInt3736 * local51 + local86 + super.anInt3738 * local34 >> 14);
					if (local182 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
				} else {
					local182 = super.anInt3733;
					local155 = super.anInt3733;
					local128 = super.anInt3733;
					local103 = super.anInt3733;
				}
				if (super.aClass66_Sub2_11.aBoolean254) {
					local212 = local103 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local53 = local212;
						if (local212 > 255) {
							local53 = 255;
						}
					}
					local212 = local128 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local55 = local212;
						if (local212 > 255) {
							local55 = 255;
						}
					}
					local212 = local155 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local57 = local212;
						if (local212 > 255) {
							local57 = 255;
						}
					}
					local212 = local182 - super.aClass66_Sub2_11.anInt3223;
					if (local212 > 0) {
						local59 = local212;
						if (local212 > 255) {
							local59 = 255;
						}
					}
				}
				local86 = local76 * super.anInt3734;
				local281 = local76 * super.anInt3743;
				local298 = super.anInt3745 + (super.anInt3742 * local45 + local86 + local34 * super.anInt3741 >> 14);
				local316 = super.anInt3739 + (super.anInt3746 * local34 + local281 + super.anInt3740 * local45 >> 14);
				local327 = local298 * super.aClass66_Sub2_11.anInt3232 / local103 + arg6.anInt5887;
				local338 = local316 * super.aClass66_Sub2_11.anInt3226 / local103 + arg6.anInt5882;
				local355 = (local45 * super.anInt3742 + local86 + super.anInt3741 * local40 >> 14) + super.anInt3745;
				local373 = super.anInt3739 + (super.anInt3746 * local40 + local281 + super.anInt3740 * local45 >> 14);
				local384 = arg6.anInt5887 + super.aClass66_Sub2_11.anInt3232 * local355 / local128;
				local402 = (local40 * super.anInt3741 + local86 + local51 * super.anInt3742 >> 14) + super.anInt3745;
				local413 = local373 * super.aClass66_Sub2_11.anInt3226 / local128 + arg6.anInt5882;
				local431 = super.anInt3739 + (local281 + local40 * super.anInt3746 + local51 * super.anInt3740 >> 14);
				local442 = super.aClass66_Sub2_11.anInt3232 * local402 / local155 + arg6.anInt5887;
				local459 = super.anInt3745 + (local51 * super.anInt3742 + local86 + super.anInt3741 * local34 >> 14);
				local470 = arg6.anInt5882 + local431 * super.aClass66_Sub2_11.anInt3226 / local155;
				local487 = (local51 * super.anInt3740 + super.anInt3746 * local34 + local281 >> 14) + super.anInt3739;
				local499 = arg6.anInt5887 + super.aClass66_Sub2_11.anInt3232 * local459 / local182;
				local510 = local487 * super.aClass66_Sub2_11.anInt3226 / local182 + arg6.anInt5882;
			}
			@Pc(1153) boolean local1153 = local18.aShort103 != -1 && this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local18.aShort103).aByte84);
			local86 = local59 + local55 + local57;
			if ((local442 - local499) * (-local510 + local413) - (local470 - local510) * (-local499 + local384) > 0) {
				arg6.aBoolean437 = local442 < 0 || local499 < 0 || local384 < 0 || arg6.anInt5883 < local442 || arg6.anInt5883 < local499 || local384 > arg6.anInt5883;
				if (local86 >= 765) {
					arg6.method4975(local470, local510, local413, local442, local499, local384, super.aClass66_Sub2_11.anInt3209);
				} else {
					if (local1153) {
						arg6.anInt5884 = 100;
					}
					if (local86 <= 0) {
						if (local18.aShort103 >= 0) {
							arg6.method4978(local470, local510, local413, local442, local499, local384, local18.anInt7914, local18.anInt7915, local18.anInt7916, local402, local459, local355, local431, local487, local373, local155, local182, local128, local18.aShort103);
						} else {
							arg6.method4984(local470, local510, local413, local442, local499, local384, local18.anInt7914, local18.anInt7915, local18.anInt7916);
						}
					} else if (local18.aShort103 >= 0) {
						arg6.method4986(local470, local510, local413, local442, local499, local384, super.aClass66_Sub2_11.anInt3209, local57, local59, local55, local18.anInt7914, local18.anInt7915, local18.anInt7916, local402, local459, local355, local431, local487, local373, local155, local182, local128, local18.aShort103);
					} else {
						arg6.method4984(local470, local510, local413, local442, local499, local384, Static482.method6709(super.aClass66_Sub2_11.anInt3209 | local57 << 24, local18.anInt7914), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | local59 << 24, local18.anInt7915), Static482.method6709(local55 << 24 | super.aClass66_Sub2_11.anInt3209, local18.anInt7916));
					}
					arg6.anInt5884 = 0;
				}
			}
			local86 = local59 + local53 + local55;
			if ((local327 - local384) * (-local413 + local510) - (local499 - local384) * (-local413 + local338) > 0) {
				arg6.aBoolean437 = local327 < 0 || local384 < 0 || local499 < 0 || local327 > arg6.anInt5883 || arg6.anInt5883 < local384 || arg6.anInt5883 < local499;
				if (local86 < 765) {
					if (local1153) {
						arg6.anInt5884 = 100;
					}
					if (local86 <= 0) {
						if (local18.aShort103 < 0) {
							arg6.method4984(local338, local413, local510, local327, local384, local499, local18.anInt7913, local18.anInt7916, local18.anInt7915);
						} else {
							arg6.method4978(local338, local413, local510, local327, local384, local499, local18.anInt7913, local18.anInt7916, local18.anInt7915, local298, local355, local459, local316, local373, local487, local103, local128, local182, local18.aShort103);
						}
					} else if (local18.aShort103 < 0) {
						arg6.method4984(local338, local413, local510, local327, local384, local499, Static482.method6709(local53 << 24 | super.aClass66_Sub2_11.anInt3209, local18.anInt7913), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | local55 << 24, local18.anInt7916), Static482.method6709(local59 << 24 | super.aClass66_Sub2_11.anInt3209, local18.anInt7915));
					} else {
						arg6.method4986(local338, local413, local510, local327, local384, local499, super.aClass66_Sub2_11.anInt3209, local53, local55, local59, local18.anInt7913, local18.anInt7916, local18.anInt7915, local298, local355, local459, local316, local373, local487, local103, local128, local182, local18.aShort103);
					}
					arg6.anInt5884 = 0;
					return;
				}
				arg6.method4975(local338, local413, local510, local327, local384, local499, super.aClass66_Sub2_11.anInt3209);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8039(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class94_Sub1 local9 = (Class94_Sub1) super.aClass66_Sub2_11.method2953(Thread.currentThread());
		@Pc(12) Class227 local12 = local9.aClass227_2;
		local12.anInt5884 = 0;
		local12.aBoolean437 = false;
		if (super.aClass296ArrayArray3 != null) {
			this.method2203(arg0, local9.anIntArray566, arg3, local12, arg4, arg1, local9.anIntArray573, arg2);
		} else if (super.aClass38ArrayArray3 != null) {
			this.method2201(local9.anIntArray573, local9.anIntArray566, arg0, local12, arg2, arg3, arg1, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([I[I[ILclient!ml;IIZ)V")
	private void method2205(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class227 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) Class38 local12 = super.aClass38ArrayArray3[arg4][arg5];
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(218) int local218;
		@Pc(277) int local277;
		@Pc(333) int local333;
		@Pc(410) int local410;
		@Pc(247) int local247;
		@Pc(322) int local322;
		@Pc(363) int local363;
		@Pc(421) int local421;
		@Pc(207) int local207;
		@Pc(266) int local266;
		@Pc(311) int local311;
		@Pc(380) int local380;
		@Pc(236) int local236;
		@Pc(294) int local294;
		@Pc(351) int local351;
		@Pc(399) int local399;
		@Pc(69) int local69;
		@Pc(68) int local68;
		@Pc(66) int local66;
		@Pc(64) int local64;
		@Pc(459) int local459;
		if (local12 == null) {
			@Pc(1125) Class126 local1125 = super.aClass126ArrayArray3[arg4][arg5];
			if (local1125 != null) {
				@Pc(1151) short local1151;
				if (super.anInt3733 == -1) {
					for (local410 = 0; local410 < local1125.aShort55; local410++) {
						local30 = local1125.aShortArray77[local410] + (arg4 << super.anInt9837);
						local1151 = local1125.aShortArray73[local410];
						local40 = local1125.aShortArray81[local410] + (arg5 << super.anInt9837);
						local333 = super.anInt3744 + (super.anInt3736 * local40 + local1151 * super.anInt3735 + local30 * super.anInt3738 >> 14);
						if (super.aClass66_Sub2_11.anInt3206 >= local333) {
							return;
						}
						local277 = (super.anInt3740 * local40 + super.anInt3746 * local30 + local1151 * super.anInt3743 >> 14) + super.anInt3739;
						local218 = (super.anInt3742 * local40 + local30 * super.anInt3741 + super.anInt3734 * local1151 >> 14) + super.anInt3745;
						arg0[local410] = arg3.anInt5887 + super.aClass66_Sub2_11.anInt3232 * local218 / local333;
						arg1[local410] = super.aClass66_Sub2_11.anInt3226 * local277 / local333 + arg3.anInt5882;
					}
				} else {
					for (local410 = 0; local410 < local1125.aShort55; local410++) {
						local30 = local1125.aShortArray77[local410] + (arg4 << super.anInt9837);
						local1151 = local1125.aShortArray73[local410];
						local40 = local1125.aShortArray81[local410] + (arg5 << super.anInt9837);
						local277 = (local1151 * super.anInt3743 + super.anInt3746 * local30 + local40 * super.anInt3740 >> 14) + super.anInt3739;
						local218 = super.anInt3745 + (super.anInt3742 * local40 + local30 * super.anInt3741 + local1151 * super.anInt3734 >> 14);
						arg0[local410] = super.aClass66_Sub2_11.anInt3232 * local218 / super.anInt3733 + arg3.anInt5887;
						arg1[local410] = super.aClass66_Sub2_11.anInt3226 * local277 / super.anInt3733 + arg3.anInt5882;
					}
				}
				if (local1125.aShortArray79 == null) {
					for (local410 = 0; local410 < local1125.aShort56; local410++) {
						@Pc(1392) short local1392 = local1125.aShortArray78[local410];
						@Pc(1397) short local1397 = local1125.aShortArray80[local410];
						@Pc(1402) short local1402 = local1125.aShortArray76[local410];
						local421 = arg0[local1392];
						local207 = arg0[local1397];
						local266 = arg0[local1402];
						local311 = arg1[local1392];
						local380 = arg1[local1397];
						local236 = arg1[local1402];
						if ((local236 - local380) * (-local207 + local421) - (local311 - local380) * (-local207 + local266) > 0) {
							local294 = local1125.anIntArray363[local410];
							if (local294 != -1) {
								arg3.aBoolean437 = local421 < 0 || local207 < 0 || local266 < 0 || arg3.anInt5883 < local421 || arg3.anInt5883 < local207 || local266 > arg3.anInt5883;
								arg3.method4977(local311, local380, local236, local421, local207, local266, Static253.method4246(local1125.aShortArray74[local1392], local294), Static253.method4246(local1125.aShortArray74[local1397], local294), Static253.method4246(local1125.aShortArray74[local1402], local294));
							}
						}
					}
				} else {
					local410 = super.anIntArrayArray46[arg4][arg5];
					local247 = super.anIntArrayArray46[arg4 + 1][arg5];
					local322 = super.anIntArrayArray46[arg4][arg5 + 1];
					local363 = super.anInt9841 * arg4;
					local421 = local363 + super.anInt9841;
					local207 = arg5 * super.anInt9841;
					local266 = super.anInt9841 + local207;
					local311 = super.anInt3745 + (super.anInt3734 * local410 + local363 * super.anInt3741 + local207 * super.anInt3742 >> 14);
					local380 = (local207 * super.anInt3740 + super.anInt3743 * local410 + local363 * super.anInt3746 >> 14) + super.anInt3739;
					local236 = super.anInt3744 + (local207 * super.anInt3736 + super.anInt3735 * local410 + local363 * super.anInt3738 >> 14);
					local294 = (local207 * super.anInt3742 + super.anInt3741 * local421 + super.anInt3734 * local247 >> 14) + super.anInt3745;
					local351 = (super.anInt3743 * local247 + local421 * super.anInt3746 + local207 * super.anInt3740 >> 14) + super.anInt3739;
					local399 = super.anInt3744 + (local207 * super.anInt3736 + super.anInt3738 * local421 + local247 * super.anInt3735 >> 14);
					local69 = (local266 * super.anInt3742 + local322 * super.anInt3734 + local363 * super.anInt3741 >> 14) + super.anInt3745;
					local68 = (super.anInt3743 * local322 + local363 * super.anInt3746 + super.anInt3740 * local266 >> 14) + super.anInt3739;
					local66 = super.anInt3744 + (super.anInt3735 * local322 + local363 * super.anInt3738 + local266 * super.anInt3736 >> 14);
					for (local64 = 0; local64 < local1125.aShort56; local64++) {
						@Pc(1769) short local1769 = local1125.aShortArray78[local64];
						@Pc(1774) short local1774 = local1125.aShortArray80[local64];
						@Pc(1779) short local1779 = local1125.aShortArray76[local64];
						local459 = arg0[local1769];
						@Pc(1787) int local1787 = arg0[local1774];
						@Pc(1791) int local1791 = arg0[local1779];
						@Pc(1795) int local1795 = arg1[local1769];
						@Pc(1799) int local1799 = arg1[local1774];
						@Pc(1803) int local1803 = arg1[local1779];
						if ((local459 - local1787) * (-local1799 + local1803) - (local1791 - local1787) * (-local1799 + local1795) > 0) {
							arg3.aBoolean437 = local459 < 0 || local1787 < 0 || local1791 < 0 || local459 > arg3.anInt5883 || arg3.anInt5883 < local1787 || arg3.anInt5883 < local1791;
							@Pc(1862) short local1862 = local1125.aShortArray79[local64];
							if (local1862 == -1) {
								@Pc(1870) int local1870 = local1125.anIntArray363[local64];
								if (local1870 != -1) {
									arg3.method4977(local1795, local1799, local1803, local459, local1787, local1791, Static253.method4246(local1125.aShortArray74[local1769], local1870), Static253.method4246(local1125.aShortArray74[local1774], local1870), Static253.method4246(local1125.aShortArray74[local1779], local1870));
								}
							} else {
								if (this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local1862).aByte84)) {
									arg3.anInt5884 = 100;
								}
								arg3.method4978(local1795, local1799, local1803, local459, local1787, local1791, local1125.aShortArray74[local1769], local1125.aShortArray74[local1774], local1125.aShortArray74[local1779], local311, local294, local69, local380, local351, local68, local236, local399, local66, local1862);
								arg3.anInt5884 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte16 & 0x2) == 0) {
			@Pc(25) int local25 = arg4 * super.anInt9841;
			local30 = super.anInt9841 + local25;
			@Pc(35) int local35 = arg5 * super.anInt9841;
			local40 = super.anInt9841 + local35;
			@Pc(55) int local55;
			@Pc(76) int local76;
			@Pc(190) int local190;
			if ((local12.aByte16 & 0x1) == 0) {
				local55 = super.anIntArrayArray46[arg4][arg5];
				local76 = super.anIntArrayArray46[arg4 + 1][arg5];
				local190 = super.anIntArrayArray46[arg4 + 1][arg5 + 1];
				local459 = super.anIntArrayArray46[arg4][arg5 + 1];
				if (super.anInt3733 == -1) {
					local69 = super.anInt3744 + (super.anInt3738 * local25 + super.anInt3735 * local55 + local35 * super.anInt3736 >> 14);
					if (local69 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local68 = (super.anInt3735 * local76 + super.anInt3738 * local30 + super.anInt3736 * local35 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local68) {
						return;
					}
					local66 = (local40 * super.anInt3736 + local190 * super.anInt3735 + super.anInt3738 * local30 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local66) {
						return;
					}
					local64 = (super.anInt3736 * local40 + local25 * super.anInt3738 + local459 * super.anInt3735 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local64) {
						return;
					}
				} else {
					local64 = super.anInt3733;
					local66 = super.anInt3733;
					local68 = super.anInt3733;
					local69 = super.anInt3733;
				}
				local207 = (local35 * super.anInt3742 + local55 * super.anInt3734 + super.anInt3741 * local25 >> 14) + super.anInt3745;
				local218 = local207 * super.aClass66_Sub2_11.anInt3232 / local69 + arg3.anInt5887;
				local236 = super.anInt3739 + (super.anInt3746 * local25 + super.anInt3743 * local55 + local35 * super.anInt3740 >> 14);
				local247 = super.aClass66_Sub2_11.anInt3226 * local236 / local69 + arg3.anInt5882;
				local266 = (local76 * super.anInt3734 + super.anInt3741 * local30 + super.anInt3742 * local35 >> 14) + super.anInt3745;
				local277 = arg3.anInt5887 + super.aClass66_Sub2_11.anInt3232 * local266 / local68;
				local294 = (local30 * super.anInt3746 + local76 * super.anInt3743 + local35 * super.anInt3740 >> 14) + super.anInt3739;
				local311 = (super.anInt3734 * local190 + super.anInt3741 * local30 + super.anInt3742 * local40 >> 14) + super.anInt3745;
				local322 = arg3.anInt5882 + local294 * super.aClass66_Sub2_11.anInt3226 / local68;
				local333 = local311 * super.aClass66_Sub2_11.anInt3232 / local66 + arg3.anInt5887;
				local351 = super.anInt3739 + (super.anInt3740 * local40 + super.anInt3746 * local30 + super.anInt3743 * local190 >> 14);
				local380 = super.anInt3745 + (local459 * super.anInt3734 + local25 * super.anInt3741 + local40 * super.anInt3742 >> 14);
				local363 = local351 * super.aClass66_Sub2_11.anInt3226 / local66 + arg3.anInt5882;
				local410 = arg3.anInt5887 + super.aClass66_Sub2_11.anInt3232 * local380 / local64;
				local399 = super.anInt3739 + (super.anInt3740 * local40 + super.anInt3746 * local25 + super.anInt3743 * local459 >> 14);
				local421 = arg3.anInt5882 + local399 * super.aClass66_Sub2_11.anInt3226 / local64;
			} else {
				local55 = super.anIntArrayArray46[arg4][arg5];
				if (super.anInt3733 == -1) {
					local76 = super.anInt3735 * local55;
					local69 = (super.anInt3736 * local35 + super.anInt3738 * local25 + local76 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local69) {
						return;
					}
					local68 = super.anInt3744 + (super.anInt3736 * local35 + local76 + local30 * super.anInt3738 >> 14);
					if (local68 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local66 = super.anInt3744 + (local40 * super.anInt3736 + super.anInt3738 * local30 + local76 >> 14);
					if (super.aClass66_Sub2_11.anInt3206 >= local66) {
						return;
					}
					local64 = super.anInt3744 + (local40 * super.anInt3736 + local25 * super.anInt3738 + local76 >> 14);
					if (local64 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
				} else {
					local64 = super.anInt3733;
					local66 = super.anInt3733;
					local68 = super.anInt3733;
					local69 = super.anInt3733;
				}
				local76 = super.anInt3734 * local55;
				local190 = super.anInt3743 * local55;
				local207 = super.anInt3745 + (super.anInt3742 * local35 + local25 * super.anInt3741 + local76 >> 14);
				local218 = arg3.anInt5887 + local207 * super.aClass66_Sub2_11.anInt3232 / local69;
				local236 = super.anInt3739 + (local35 * super.anInt3740 + super.anInt3746 * local25 + local190 >> 14);
				local247 = arg3.anInt5882 + local236 * super.aClass66_Sub2_11.anInt3226 / local69;
				local266 = (super.anInt3741 * local30 + local76 + local35 * super.anInt3742 >> 14) + super.anInt3745;
				local277 = super.aClass66_Sub2_11.anInt3232 * local266 / local68 + arg3.anInt5887;
				local294 = (super.anInt3740 * local35 + local190 + local30 * super.anInt3746 >> 14) + super.anInt3739;
				local311 = (super.anInt3742 * local40 + local76 + local30 * super.anInt3741 >> 14) + super.anInt3745;
				local322 = super.aClass66_Sub2_11.anInt3226 * local294 / local68 + arg3.anInt5882;
				local333 = super.aClass66_Sub2_11.anInt3232 * local311 / local66 + arg3.anInt5887;
				local351 = super.anInt3739 + (local190 + local30 * super.anInt3746 + local40 * super.anInt3740 >> 14);
				local363 = arg3.anInt5882 + local351 * super.aClass66_Sub2_11.anInt3226 / local66;
				local380 = (local76 + super.anInt3741 * local25 + super.anInt3742 * local40 >> 14) + super.anInt3745;
				local399 = (super.anInt3746 * local25 + local190 + local40 * super.anInt3740 >> 14) + super.anInt3739;
				local410 = arg3.anInt5887 + local380 * super.aClass66_Sub2_11.anInt3232 / local64;
				local421 = super.aClass66_Sub2_11.anInt3226 * local399 / local64 + arg3.anInt5882;
			}
			if ((local322 - local421) * (-local410 + local333) - (local363 - local421) * (-local410 + local277) > 0) {
				arg3.aBoolean437 = local333 < 0 || local410 < 0 || local277 < 0 || local333 > arg3.anInt5883 || arg3.anInt5883 < local410 || local277 > arg3.anInt5883;
				if (local12.aShort26 >= 0) {
					if (this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local12.aShort26).aByte84)) {
						arg3.anInt5884 = 100;
					}
					arg3.method4978(local363, local421, local322, local333, local410, local277, local12.aShort28 & 0xFFFF, local12.aShort24 & 0xFFFF, local12.aShort25 & 0xFFFF, local207, local266, local380, local236, local294, local399, local69, local68, local64, local12.aShort26);
					arg3.anInt5884 = 0;
				} else {
					arg3.method4977(local363, local421, local322, local333, local410, local277, local12.aShort28 & 0xFFFF, local12.aShort24 & 0xFFFF, local12.aShort25 & 0xFFFF);
				}
			}
			if (-((local247 - local322) * (-local277 + local410)) + (local421 - local322) * (local218 - local277) > 0) {
				arg3.aBoolean437 = local218 < 0 || local277 < 0 || local410 < 0 || local218 > arg3.anInt5883 || local277 > arg3.anInt5883 || arg3.anInt5883 < local410;
				if (local12.aShort26 < 0) {
					arg3.method4977(local247, local322, local421, local218, local277, local410, local12.aShort27 & 0xFFFF, local12.aShort25 & 0xFFFF, local12.aShort24 & 0xFFFF);
					return;
				}
				if (this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local12.aShort26).aByte84)) {
					arg3.anInt5884 = 100;
				}
				arg3.method4978(local247, local322, local421, local218, local277, local410, local12.aShort27 & 0xFFFF, local12.aShort25 & 0xFFFF, local12.aShort24 & 0xFFFF, local207, local266, local380, local236, local294, local399, local69, local68, local64, local12.aShort26);
				arg3.anInt5884 = 0;
			}
		}
	}
}

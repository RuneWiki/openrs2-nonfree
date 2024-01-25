import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class60_Sub1_Sub2 extends Class60_Sub1 {

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!kb;IIII[[I[[II)V")
	public Class60_Sub1_Sub2(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([I[IZLclient!ce;II[II)V")
	private void method6211(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class39 local12 = super.aClass39ArrayArray3[arg6][arg4];
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(337) int local337;
		@Pc(394) int local394;
		@Pc(452) int local452;
		@Pc(494) int local494;
		@Pc(348) int local348;
		@Pc(423) int local423;
		@Pc(464) int local464;
		@Pc(523) int local523;
		@Pc(302) int local302;
		@Pc(366) int local366;
		@Pc(412) int local412;
		@Pc(483) int local483;
		@Pc(325) int local325;
		@Pc(383) int local383;
		@Pc(440) int local440;
		@Pc(512) int local512;
		@Pc(97) int local97;
		@Pc(125) int local125;
		@Pc(153) int local153;
		@Pc(178) int local178;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(208) int local208;
		@Pc(69) int local69;
		@Pc(79) int local79;
		@Pc(307) int local307;
		@Pc(561) int local561;
		@Pc(720) int local720;
		if (local12 == null) {
			@Pc(1608) Class229 local1608 = super.aClass229ArrayArray3[arg6][arg4];
			if (local1608 != null) {
				if (super.anInt7491 == -1) {
					for (local494 = 0; local494 < local1608.aShort89; local494++) {
						local34 = local1608.aShortArray105[local494] + (arg6 << super.anInt9654);
						local39 = local1608.aShortArray101[local494];
						local44 = local1608.aShortArray100[local494] + (arg4 << super.anInt9654);
						local452 = (super.anInt7481 * local44 + local34 * super.anInt7482 + local39 * super.anInt7485 >> 14) + super.anInt7487;
						if (local452 <= super.aClass121_Sub1_15.anInt4511) {
							return;
						}
						arg0[local494] = 0;
						if (arg2) {
							local348 = local452 - super.aClass121_Sub1_15.anInt4527;
							if (local348 > 255) {
								local348 = 255;
							}
							if (local348 > 0) {
								arg0[local494] = local348;
								local423 = local348 * local1608.aShortArray103[local494] / 255;
								if (local423 > 0) {
									local39 -= local423;
								}
							}
						} else if (super.aClass121_Sub1_15.aBoolean278) {
							local348 = local452 - super.aClass121_Sub1_15.anInt4527;
							if (local348 > 0) {
								arg0[local494] = local348;
								if (arg0[local494] > 255) {
									arg0[local494] = 255;
								}
							}
						}
						local337 = (super.anInt7484 * local39 + local34 * super.anInt7488 + local44 * super.anInt7486 >> 14) + super.anInt7483;
						local394 = super.anInt7492 + (local39 * super.anInt7489 + local34 * super.anInt7479 + super.anInt7490 * local44 >> 14);
						arg1[local494] = super.aClass121_Sub1_15.anInt4513 * local337 / local452 + arg3.anInt931;
						arg5[local494] = arg3.anInt932 + local394 * super.aClass121_Sub1_15.anInt4526 / local452;
					}
				} else {
					for (local494 = 0; local494 < local1608.aShort89; local494++) {
						local34 = local1608.aShortArray105[local494] + (arg6 << super.anInt9654);
						local39 = local1608.aShortArray101[local494];
						local44 = local1608.aShortArray100[local494] + (arg4 << super.anInt9654);
						arg0[local494] = 0;
						if (arg2) {
							local348 = -super.aClass121_Sub1_15.anInt4527 + super.anInt7491;
							if (local348 > 255) {
								local348 = 255;
							}
							if (local348 > 0) {
								arg0[local494] = local348;
								local423 = local348 * local1608.aShortArray103[local494] / 255;
								if (local423 > 0) {
									local39 -= local423;
								}
							}
						} else if (super.aClass121_Sub1_15.aBoolean278) {
							local348 = -super.aClass121_Sub1_15.anInt4527 + super.anInt7491;
							if (local348 > 0) {
								arg0[local494] = local348;
								if (arg0[local494] > 255) {
									arg0[local494] = 255;
								}
							}
						}
						local337 = (local44 * super.anInt7486 + local34 * super.anInt7488 + local39 * super.anInt7484 >> 14) + super.anInt7483;
						local394 = (super.anInt7490 * local44 + super.anInt7489 * local39 + local34 * super.anInt7479 >> 14) + super.anInt7492;
						arg1[local494] = super.aClass121_Sub1_15.anInt4513 * local337 / super.anInt7491 + arg3.anInt931;
						arg5[local494] = arg3.anInt932 + super.aClass121_Sub1_15.anInt4526 * local394 / super.anInt7491;
					}
				}
				if (local1608.aShortArray104 == null) {
					for (local494 = 0; local494 < local1608.aShort88; local494++) {
						local348 = local494 * 3;
						local423 = local348 + 1;
						local464 = local423 + 1;
						local523 = arg1[local348];
						local302 = arg1[local423];
						local366 = arg1[local464];
						local412 = arg5[local348];
						local483 = arg5[local423];
						local325 = arg5[local464];
						local383 = arg0[local464] + arg0[local348] + arg0[local423];
						if (-((local412 - local483) * (local366 + -local302)) + (local325 - local483) * (local523 + -local302) > 0) {
							arg3.aBoolean47 = local523 < 0 || local302 < 0 || local366 < 0 || arg3.anInt929 < local523 || local302 > arg3.anInt929 || local366 > arg3.anInt929;
							if (local383 >= 765) {
								arg3.method740(local412, local483, local325, local523, local302, local366, super.aClass121_Sub1_15.anInt4509);
							} else if (local383 <= 0) {
								if ((local1608.anIntArray540[local348] & 0xFFFFFF) != 0) {
									arg3.method733(local412, local483, local325, local523, local302, local366, local1608.anIntArray540[local348], local1608.anIntArray540[local423], local1608.anIntArray540[local464]);
								}
							} else if ((local1608.anIntArray540[local348] & 0xFFFFFF) != 0) {
								arg3.method733(local412, local483, local325, local523, local302, local366, Static355.method5297(local1608.anIntArray540[local348], super.aClass121_Sub1_15.anInt4509, arg0[local348]), Static355.method5297(local1608.anIntArray540[local423], super.aClass121_Sub1_15.anInt4509, arg0[local423]), Static355.method5297(local1608.anIntArray540[local464], super.aClass121_Sub1_15.anInt4509, arg0[local464]));
							}
						}
					}
				} else {
					local494 = super.anIntArrayArray76[arg6][arg4];
					local348 = super.anIntArrayArray76[arg6 + 1][arg4];
					local423 = super.anIntArrayArray76[arg6][arg4 + 1];
					local464 = arg6 * super.anInt9652;
					local523 = super.anInt9652 + local464;
					local302 = arg4 * super.anInt9652;
					local366 = local302 + super.anInt9652;
					local412 = (local302 * super.anInt7486 + local464 * super.anInt7488 + local494 * super.anInt7484 >> 14) + super.anInt7483;
					local483 = super.anInt7492 + (super.anInt7489 * local494 + super.anInt7479 * local464 + local302 * super.anInt7490 >> 14);
					local325 = super.anInt7487 + (local464 * super.anInt7482 + local494 * super.anInt7485 + local302 * super.anInt7481 >> 14);
					local383 = (super.anInt7486 * local302 + super.anInt7484 * local348 + super.anInt7488 * local523 >> 14) + super.anInt7483;
					local440 = super.anInt7492 + (local348 * super.anInt7489 + local523 * super.anInt7479 + super.anInt7490 * local302 >> 14);
					local512 = super.anInt7487 + (super.anInt7485 * local348 + local523 * super.anInt7482 + local302 * super.anInt7481 >> 14);
					local97 = super.anInt7483 + (super.anInt7484 * local423 + local464 * super.anInt7488 + local366 * super.anInt7486 >> 14);
					local125 = (super.anInt7490 * local366 + local423 * super.anInt7489 + super.anInt7479 * local464 >> 14) + super.anInt7492;
					local153 = super.anInt7487 + (super.anInt7481 * local366 + local423 * super.anInt7485 + local464 * super.anInt7482 >> 14);
					for (local178 = 0; local178 < local1608.aShort88; local178++) {
						local46 = local178 * 3;
						local48 = local46 + 1;
						local50 = local48 + 1;
						local52 = arg1[local46];
						local208 = arg1[local48];
						local69 = arg1[local50];
						local79 = arg5[local46];
						local307 = arg5[local48];
						local561 = arg5[local50];
						local720 = arg0[local50] + arg0[local46] + arg0[local48];
						if (-((local79 - local307) * (local69 + -local208)) + (local561 - local307) * (-local208 + local52) > 0) {
							arg3.aBoolean47 = local52 < 0 || local208 < 0 || local69 < 0 || local52 > arg3.anInt929 || arg3.anInt929 < local208 || local69 > arg3.anInt929;
							@Pc(2556) short local2556 = local1608.aShortArray104[local178];
							if (local720 >= 765) {
								arg3.method740(local79, local307, local561, local52, local208, local69, super.aClass121_Sub1_15.anInt4509);
							} else {
								if (local2556 != -1 && this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local2556).aByte24)) {
									arg3.anInt927 = 100;
								}
								if (local720 <= 0) {
									if (local2556 != -1) {
										arg3.method734(local79, local307, local561, local52, local208, local69, local1608.anIntArray540[local46], local1608.anIntArray540[local48], local1608.anIntArray540[local50], local412, local383, local97, local483, local440, local125, local325, local512, local153, local2556);
									} else if ((local1608.anIntArray540[local46] & 0xFFFFFF) != 0) {
										arg3.method733(local79, local307, local561, local52, local208, local69, local1608.anIntArray540[local46], local1608.anIntArray540[local48], local1608.anIntArray540[local50]);
									}
								} else if (local2556 != -1) {
									arg3.method736(local79, local307, local561, local52, local208, local69, super.aClass121_Sub1_15.anInt4509, arg0[local46], arg0[local48], arg0[local50], local1608.anIntArray540[local46], local1608.anIntArray540[local48], local1608.anIntArray540[local50], local412, local383, local97, local483, local440, local125, local325, local512, local153, local2556);
								} else if ((local1608.anIntArray540[local46] & 0xFFFFFF) != 0) {
									arg3.method733(local79, local307, local561, local52, local208, local69, Static462.method6488(super.aClass121_Sub1_15.anInt4509 | arg0[local46] << 24, local1608.anIntArray540[local46]), Static462.method6488(arg0[local48] << 24 | super.aClass121_Sub1_15.anInt4509, local1608.anIntArray540[local48]), Static462.method6488(arg0[local50] << 24 | super.aClass121_Sub1_15.anInt4509, local1608.anIntArray540[local50]));
								}
								arg3.anInt927 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte12 & 0x2) == 0) {
			@Pc(28) int local28 = arg6 * super.anInt9652;
			local34 = local28 + super.anInt9652;
			local39 = arg4 * super.anInt9652;
			local44 = super.anInt9652 + local39;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			local52 = 0;
			if ((local12.aByte12 & 0x1) == 0 || arg2) {
				local69 = super.anIntArrayArray76[arg6][arg4];
				local79 = super.anIntArrayArray76[arg6 + 1][arg4];
				local307 = super.anIntArrayArray76[arg6 + 1][arg4 + 1];
				local561 = super.anIntArrayArray76[arg6][arg4 + 1];
				if (super.anInt7491 == -1) {
					local97 = super.anInt7487 + (super.anInt7482 * local28 + local69 * super.anInt7485 + local39 * super.anInt7481 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local97) {
						return;
					}
					local125 = (super.anInt7481 * local39 + local34 * super.anInt7482 + local79 * super.anInt7485 >> 14) + super.anInt7487;
					if (local125 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local153 = super.anInt7487 + (super.anInt7481 * local44 + local307 * super.anInt7485 + local34 * super.anInt7482 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local153) {
						return;
					}
					local178 = (super.anInt7482 * local28 + local561 * super.anInt7485 + local44 * super.anInt7481 >> 14) + super.anInt7487;
					if (local178 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
				} else {
					local178 = super.anInt7491;
					local153 = super.anInt7491;
					local125 = super.anInt7491;
					local97 = super.anInt7491;
				}
				if (arg2) {
					local208 = local97 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 > 0) {
						local46 = local208;
						local720 = local208 * local12.aShort10 / 255;
						if (local720 > 0) {
							local69 -= local720;
						}
					}
					local208 = local125 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 > 0) {
						local48 = local208;
						local720 = local208 * local12.aShort12 / 255;
						if (local720 > 0) {
							local79 -= local720;
						}
					}
					local208 = local153 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 > 0) {
						local50 = local208;
						local720 = local12.aShort11 * local208 / 255;
						if (local720 > 0) {
							local307 -= local720;
						}
					}
					local208 = local178 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 > 0) {
						local52 = local208;
						local720 = local208 * local12.aShort9 / 255;
						if (local720 > 0) {
							local561 -= local720;
						}
					}
				} else if (super.aClass121_Sub1_15.aBoolean278) {
					local208 = local97 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local46 = local208;
						if (local208 > 255) {
							local46 = 255;
						}
					}
					local208 = local125 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local48 = local208;
						if (local208 > 255) {
							local48 = 255;
						}
					}
					local208 = local153 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local50 = local208;
						if (local208 > 255) {
							local50 = 255;
						}
					}
					local208 = local178 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local52 = local208;
						if (local208 > 255) {
							local52 = 255;
						}
					}
				}
				local302 = super.anInt7483 + (local39 * super.anInt7486 + super.anInt7488 * local28 + local69 * super.anInt7484 >> 14);
				local325 = super.anInt7492 + (local69 * super.anInt7489 + super.anInt7479 * local28 + local39 * super.anInt7490 >> 14);
				local337 = super.aClass121_Sub1_15.anInt4513 * local302 / local97 + arg3.anInt931;
				local366 = super.anInt7483 + (super.anInt7486 * local39 + super.anInt7488 * local34 + local79 * super.anInt7484 >> 14);
				local348 = local325 * super.aClass121_Sub1_15.anInt4526 / local97 + arg3.anInt932;
				local394 = local366 * super.aClass121_Sub1_15.anInt4513 / local125 + arg3.anInt931;
				local383 = (super.anInt7490 * local39 + local79 * super.anInt7489 + local34 * super.anInt7479 >> 14) + super.anInt7492;
				local423 = arg3.anInt932 + super.aClass121_Sub1_15.anInt4526 * local383 / local125;
				local412 = super.anInt7483 + (super.anInt7488 * local34 + super.anInt7484 * local307 + super.anInt7486 * local44 >> 14);
				local452 = local412 * super.aClass121_Sub1_15.anInt4513 / local153 + arg3.anInt931;
				local440 = (super.anInt7489 * local307 + super.anInt7479 * local34 + local44 * super.anInt7490 >> 14) + super.anInt7492;
				local464 = super.aClass121_Sub1_15.anInt4526 * local440 / local153 + arg3.anInt932;
				local483 = (super.anInt7486 * local44 + local561 * super.anInt7484 + super.anInt7488 * local28 >> 14) + super.anInt7483;
				local512 = super.anInt7492 + (local44 * super.anInt7490 + local28 * super.anInt7479 + local561 * super.anInt7489 >> 14);
				local494 = arg3.anInt931 + super.aClass121_Sub1_15.anInt4513 * local483 / local178;
				local523 = local512 * super.aClass121_Sub1_15.anInt4526 / local178 + arg3.anInt932;
			} else {
				local69 = super.anIntArrayArray76[arg6][arg4];
				if (super.anInt7491 == -1) {
					local79 = local69 * super.anInt7485;
					local97 = (local28 * super.anInt7482 + local79 + super.anInt7481 * local39 >> 14) + super.anInt7487;
					if (local97 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local125 = (super.anInt7481 * local39 + local34 * super.anInt7482 + local79 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local125) {
						return;
					}
					local153 = super.anInt7487 + (super.anInt7482 * local34 + local79 + super.anInt7481 * local44 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local153) {
						return;
					}
					local178 = super.anInt7487 + (local79 + local28 * super.anInt7482 + local44 * super.anInt7481 >> 14);
					if (local178 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
				} else {
					local178 = super.anInt7491;
					local153 = super.anInt7491;
					local125 = super.anInt7491;
					local97 = super.anInt7491;
				}
				if (super.aClass121_Sub1_15.aBoolean278) {
					local208 = local97 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local46 = local208;
						if (local208 > 255) {
							local46 = 255;
						}
					}
					local208 = local125 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local48 = local208;
						if (local208 > 255) {
							local48 = 255;
						}
					}
					local208 = local153 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local50 = local208;
						if (local208 > 255) {
							local50 = 255;
						}
					}
					local208 = local178 - super.aClass121_Sub1_15.anInt4527;
					if (local208 > 0) {
						local52 = local208;
						if (local208 > 255) {
							local52 = 255;
						}
					}
				}
				local79 = local69 * super.anInt7484;
				local302 = (local28 * super.anInt7488 + local79 + super.anInt7486 * local39 >> 14) + super.anInt7483;
				local307 = local69 * super.anInt7489;
				local325 = super.anInt7492 + (local307 + local28 * super.anInt7479 + local39 * super.anInt7490 >> 14);
				local337 = arg3.anInt931 + local302 * super.aClass121_Sub1_15.anInt4513 / local97;
				local348 = super.aClass121_Sub1_15.anInt4526 * local325 / local97 + arg3.anInt932;
				local366 = (local39 * super.anInt7486 + local34 * super.anInt7488 + local79 >> 14) + super.anInt7483;
				local383 = (local39 * super.anInt7490 + local307 + local34 * super.anInt7479 >> 14) + super.anInt7492;
				local394 = arg3.anInt931 + local366 * super.aClass121_Sub1_15.anInt4513 / local125;
				local412 = (local44 * super.anInt7486 + super.anInt7488 * local34 + local79 >> 14) + super.anInt7483;
				local423 = super.aClass121_Sub1_15.anInt4526 * local383 / local125 + arg3.anInt932;
				local440 = super.anInt7492 + (super.anInt7490 * local44 + local307 + local34 * super.anInt7479 >> 14);
				local452 = arg3.anInt931 + super.aClass121_Sub1_15.anInt4513 * local412 / local153;
				local464 = arg3.anInt932 + local440 * super.aClass121_Sub1_15.anInt4526 / local153;
				local483 = (local28 * super.anInt7488 + local79 + local44 * super.anInt7486 >> 14) + super.anInt7483;
				local494 = local483 * super.aClass121_Sub1_15.anInt4513 / local178 + arg3.anInt931;
				local512 = (local44 * super.anInt7490 + super.anInt7479 * local28 + local307 >> 14) + super.anInt7492;
				local523 = arg3.anInt932 + local512 * super.aClass121_Sub1_15.anInt4526 / local178;
			}
			@Pc(1185) boolean local1185 = local12.aShort8 != -1 && this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local12.aShort8).aByte24);
			local79 = local50 + local48 + local52;
			if (-((local394 - local494) * (-local523 + local464)) + (local452 - local494) * (-local523 + local423) > 0) {
				arg3.aBoolean47 = local452 < 0 || local494 < 0 || local394 < 0 || arg3.anInt929 < local452 || arg3.anInt929 < local494 || local394 > arg3.anInt929;
				if (local79 >= 765) {
					arg3.method740(local464, local523, local423, local452, local494, local394, super.aClass121_Sub1_15.anInt4509);
				} else {
					if (local1185) {
						arg3.anInt927 = 100;
					}
					if (local79 <= 0) {
						if (local12.aShort8 < 0) {
							arg3.method733(local464, local523, local423, local452, local494, local394, local12.anInt852, local12.anInt855, local12.anInt856);
						} else {
							arg3.method734(local464, local523, local423, local452, local494, local394, local12.anInt852, local12.anInt855, local12.anInt856, local412, local483, local366, local440, local512, local383, local153, local178, local125, local12.aShort8);
						}
					} else if (local12.aShort8 >= 0) {
						arg3.method736(local464, local523, local423, local452, local494, local394, super.aClass121_Sub1_15.anInt4509, local50, local52, local48, local12.anInt852, local12.anInt855, local12.anInt856, local412, local483, local366, local440, local512, local383, local153, local178, local125, local12.aShort8);
					} else {
						arg3.method733(local464, local523, local423, local452, local494, local394, Static462.method6488(local50 << 24 | super.aClass121_Sub1_15.anInt4509, local12.anInt852), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local52 << 24, local12.anInt855), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local48 << 24, local12.anInt856));
					}
					arg3.anInt927 = 0;
				}
			}
			local79 = local46 + local48 + local52;
			if ((local523 - local423) * (-local394 + local337) - (local494 - local394) * (local348 - local423) > 0) {
				arg3.aBoolean47 = local337 < 0 || local394 < 0 || local494 < 0 || local337 > arg3.anInt929 || arg3.anInt929 < local394 || local494 > arg3.anInt929;
				if (local79 >= 765) {
					arg3.method740(local348, local423, local523, local337, local394, local494, super.aClass121_Sub1_15.anInt4509);
					return;
				}
				if (local1185) {
					arg3.anInt927 = 100;
				}
				if (local79 > 0) {
					if (local12.aShort8 < 0) {
						arg3.method733(local348, local423, local523, local337, local394, local494, Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local46 << 24, local12.anInt853), Static462.method6488(local48 << 24 | super.aClass121_Sub1_15.anInt4509, local12.anInt856), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local52 << 24, local12.anInt855));
					} else {
						arg3.method736(local348, local423, local523, local337, local394, local494, super.aClass121_Sub1_15.anInt4509, local46, local48, local52, local12.anInt853, local12.anInt856, local12.anInt855, local302, local366, local483, local325, local383, local512, local97, local125, local178, local12.aShort8);
					}
				} else if (local12.aShort8 < 0) {
					arg3.method733(local348, local423, local523, local337, local394, local494, local12.anInt853, local12.anInt856, local12.anInt855);
				} else {
					arg3.method734(local348, local423, local523, local337, local394, local494, local12.anInt853, local12.anInt856, local12.anInt855, local302, local366, local483, local325, local383, local512, local97, local125, local178, local12.aShort8);
				}
				arg3.anInt927 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!ce;III[I[I[[ZIII)V")
	private void method6212(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int[] arg3, @OriginalArg(7) int[] arg4, @OriginalArg(8) boolean[][] arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg0 - arg7) * 1024 / 256;
		arg1.aBoolean45 = false;
		arg1.aBoolean43 = false;
		@Pc(26) int local26 = 0;
		@Pc(31) int local31 = local14;
		for (@Pc(33) int local33 = arg6; local33 < arg2; local33++) {
			for (@Pc(39) int local39 = arg7; local39 < arg0; local39++) {
				if (arg5[local33 - arg6][local39 - arg7]) {
					@Pc(88) int local88;
					if (super.aClass341ArrayArray3[local33][local39] != null) {
						@Pc(67) Class341 local67 = super.aClass341ArrayArray3[local33][local39];
						if (local67.aShort127 != -1 && (local67.aByte105 & 0x2) == 0 && local67.anInt9371 == -1) {
							local88 = super.aClass121_Sub1_15.method3930(local67.aShort127);
							arg1.method735(local31 - 4, local31 - 4, local31, local26 + 4, local26, local26 + 4, Static564.method7701(local88, local67.aShort128 & 0xFFFF), Static564.method7701(local88, local67.aShort125 & 0xFFFF), Static564.method7701(local88, local67.aShort129 & 0xFFFF));
							arg1.method735(local31, local31, local31 - 4, local26, local26 + 4, local26, Static564.method7701(local88, local67.aShort126 & 0xFFFF), Static564.method7701(local88, local67.aShort129 & 0xFFFF), Static564.method7701(local88, local67.aShort125 & 0xFFFF));
						} else if (local67.anInt9371 == -1) {
							arg1.method735(local31 - 4, local31 - 4, local31, local26 + 4, local26, local26 + 4, local67.aShort128 & 0xFFFF, local67.aShort125 & 0xFFFF, local67.aShort129 & 0xFFFF);
							arg1.method735(local31, local31, local31 - 4, local26, local26 + 4, local26, local67.aShort126 & 0xFFFF, local67.aShort129 & 0xFFFF, local67.aShort125 & 0xFFFF);
						} else {
							local88 = local67.anInt9371;
							arg1.method735(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, local88, local88, local88);
							arg1.method735(local31, local31, local31 - 4, local26, local26 + 4, local26, local88, local88, local88);
						}
					} else if (super.aClass106ArrayArray3[local33][local39] != null) {
						@Pc(281) Class106 local281 = super.aClass106ArrayArray3[local33][local39];
						for (local88 = 0; local88 < local281.aShort65; local88++) {
							arg4[local88] = local26 + local281.aShortArray51[local88] * 4 / super.anInt9652;
							arg3[local88] = local31 - local281.aShortArray46[local88] * 4 / super.anInt9652;
						}
						for (@Pc(321) int local321 = 0; local321 < local281.aShort64; local321++) {
							@Pc(328) short local328 = local281.aShortArray50[local321];
							@Pc(333) short local333 = local281.aShortArray45[local321];
							@Pc(338) short local338 = local281.aShortArray44[local321];
							@Pc(342) int local342 = arg4[local328];
							@Pc(346) int local346 = arg4[local333];
							@Pc(350) int local350 = arg4[local338];
							@Pc(354) int local354 = arg3[local328];
							@Pc(358) int local358 = arg3[local333];
							@Pc(362) int local362 = arg3[local338];
							@Pc(377) int local377;
							if (local281.anIntArray310 != null && local281.anIntArray310[local321] != -1) {
								local377 = local281.anIntArray310[local321];
								arg1.method735(local354, local358, local362, local342, local346, local350, Static564.method7701(local377, local281.aShortArray49[local328]), Static564.method7701(local377, local281.aShortArray49[local333]), Static564.method7701(local377, local281.aShortArray49[local338]));
							} else if (local281.aShortArray47 == null || local281.aShortArray47[local321] == -1) {
								local377 = local281.anIntArray309[local321];
								arg1.method735(local354, local358, local362, local342, local346, local350, Static564.method7701(local377, local281.aShortArray49[local328]), Static564.method7701(local377, local281.aShortArray49[local333]), Static564.method7701(local377, local281.aShortArray49[local338]));
							} else {
								local377 = super.aClass121_Sub1_15.method3930(local281.aShortArray47[local321]);
								arg1.method735(local354, local358, local362, local342, local346, local350, Static564.method7701(local377, local281.aShortArray49[local328]), Static564.method7701(local377, local281.aShortArray49[local333]), Static564.method7701(local377, local281.aShortArray49[local338]));
							}
						}
					}
				}
				local31 -= 4;
			}
			local31 = local14;
			local26 += 4;
		}
		arg1.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class77_Sub2 local9 = (Class77_Sub2) super.aClass121_Sub1_15.method3922(Thread.currentThread());
		local9.aClass46_1.anInt927 = 0;
		if (super.aClass39ArrayArray3 != null) {
			this.method6211(local9.anIntArray366, local9.anIntArray351, super.aClass121_Sub1_15.aBoolean279, local9.aClass46_1, arg1, local9.anIntArray354, arg0);
		} else if (super.aClass341ArrayArray3 != null) {
			this.method6214(arg1, local9.anIntArray351, local9.anIntArray366, arg0, local9.aClass46_1, local9.anIntArray354);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III[IIILclient!ce;B[I[[ZII)V")
	private void method6213(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class46 arg3, @OriginalArg(8) int[] arg4, @OriginalArg(9) boolean[][] arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg0 - arg2) * 1024 / 256;
		arg3.aBoolean45 = false;
		arg3.aBoolean43 = false;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local14;
		for (@Pc(36) int local36 = arg6; local36 < arg7; local36++) {
			for (@Pc(40) int local40 = arg2; local40 < arg0; local40++) {
				if (arg5[local36 - arg6][local40 - arg2]) {
					@Pc(90) int local90;
					if (super.aClass39ArrayArray3[local36][local40] != null) {
						@Pc(68) Class39 local68 = super.aClass39ArrayArray3[local36][local40];
						if (local68.aShort8 != -1 && (local68.aByte12 & 0x2) == 0 && local68.anInt854 == 0) {
							local90 = super.aClass121_Sub1_15.method3930(local68.aShort8);
							arg3.method735(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static564.method7701(local90, local68.anInt852), Static564.method7701(local90, local68.anInt855), Static564.method7701(local90, local68.anInt856));
							arg3.method735(local34, local34, local34 - 4, local30, local30 + 4, local30, Static564.method7701(local90, local68.anInt853), Static564.method7701(local90, local68.anInt856), Static564.method7701(local90, local68.anInt855));
						} else if (local68.anInt854 == 0) {
							arg3.method733(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, local68.anInt852, local68.anInt855, local68.anInt856);
							arg3.method733(local34, local34, local34 - 4, local30, local30 + 4, local30, local68.anInt853, local68.anInt856, local68.anInt855);
						} else {
							local90 = local68.anInt854;
							arg3.method733(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, Static462.method6488(local68.anInt852 & 0xFF000000, local90), Static462.method6488(local68.anInt855 & 0xFF000000, local90), Static462.method6488(local68.anInt856 & 0xFF000000, local90));
							arg3.method733(local34, local34, local34 - 4, local30, local30 + 4, local30, Static462.method6488(local68.anInt853 & 0xFF000000, local90), Static462.method6488(local68.anInt856 & 0xFF000000, local90), Static462.method6488(local68.anInt855 & 0xFF000000, local90));
						}
					} else if (super.aClass229ArrayArray3[local36][local40] != null) {
						@Pc(299) Class229 local299 = super.aClass229ArrayArray3[local36][local40];
						for (local90 = 0; local90 < local299.aShort89; local90++) {
							arg1[local90] = local299.aShortArray105[local90] * 4 / super.anInt9652 + local30;
							arg4[local90] = local34 - local299.aShortArray100[local90] * 4 / super.anInt9652;
						}
						for (@Pc(339) int local339 = 0; local339 < local299.aShort88; local339++) {
							@Pc(345) int local345 = local339 * 3;
							@Pc(349) int local349 = local345 + 1;
							@Pc(353) int local353 = local349 + 1;
							@Pc(357) int local357 = arg1[local345];
							@Pc(361) int local361 = arg1[local349];
							@Pc(365) int local365 = arg1[local353];
							@Pc(369) int local369 = arg4[local345];
							@Pc(373) int local373 = arg4[local349];
							@Pc(377) int local377 = arg4[local353];
							@Pc(402) int local402;
							if (local299.anIntArray539 != null && local299.anIntArray539[local339] != 0 && (local299.aShortArray104 == null || local299.aShortArray104 != null && local299.aShortArray104[local339] == -1)) {
								local402 = local299.anIntArray539[local339];
								arg3.method733(local369, local373, local377, local357, local361, local365, Static462.method6488(-(local299.anIntArray540[local345] & -16777216) - 16777216, local402), Static462.method6488(-(-16777216 & local299.anIntArray540[local349]) - 16777216, local402), Static462.method6488(-(local299.anIntArray540[local353] & 0xFF000000) - 16777216, local402));
							} else if (local299.aShortArray104 == null || local299.aShortArray104[local339] == -1) {
								arg3.method733(local369, local373, local377, local357, local361, local365, local299.anIntArray540[local345], local299.anIntArray540[local349], local299.anIntArray540[local353]);
							} else {
								local402 = super.aClass121_Sub1_15.method3930(local299.aShortArray104[local339]);
								arg3.method735(local369, local373, local377, local357, local361, local365, local402, local402, local402);
							}
						}
					}
				}
				local34 -= 4;
			}
			local30 += 4;
			local34 = local14;
		}
		arg3.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7894(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class77_Sub2 local9 = (Class77_Sub2) super.aClass121_Sub1_15.method3922(Thread.currentThread());
		@Pc(12) Class46 local12 = local9.aClass46_1;
		local12.anInt927 = 0;
		local12.aBoolean47 = false;
		if (super.aClass39ArrayArray3 != null) {
			this.method6213(arg3, local9.anIntArray351, arg1, local12, local9.anIntArray354, arg4, arg0, arg2);
		} else if (super.aClass341ArrayArray3 != null) {
			this.method6212(arg3, local12, arg2, local9.anIntArray354, local9.anIntArray351, arg4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[I[IILclient!ce;I[I)V")
	private void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(6) int[] arg5) {
		@Pc(12) Class341 local12 = super.aClass341ArrayArray3[arg3][arg0];
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(263) int local263;
		@Pc(305) int local305;
		@Pc(391) int local391;
		@Pc(455) int local455;
		@Pc(274) int local274;
		@Pc(339) int local339;
		@Pc(423) int local423;
		@Pc(467) int local467;
		@Pc(232) int local232;
		@Pc(294) int local294;
		@Pc(359) int local359;
		@Pc(412) int local412;
		@Pc(252) int local252;
		@Pc(327) int local327;
		@Pc(380) int local380;
		@Pc(444) int local444;
		@Pc(109) int local109;
		@Pc(140) int local140;
		@Pc(166) int local166;
		@Pc(193) int local193;
		@Pc(84) int local84;
		if (local12 == null) {
			@Pc(1099) Class106 local1099 = super.aClass106ArrayArray3[arg3][arg0];
			if (local1099 != null) {
				@Pc(1126) short local1126;
				if (super.anInt7491 == -1) {
					for (local455 = 0; local455 < local1099.aShort65; local455++) {
						local33 = local1099.aShortArray51[local455] + (arg3 << super.anInt9654);
						local1126 = local1099.aShortArray43[local455];
						local43 = local1099.aShortArray46[local455] + (arg0 << super.anInt9654);
						local391 = (super.anInt7481 * local43 + local1126 * super.anInt7485 + super.anInt7482 * local33 >> 14) + super.anInt7487;
						if (local391 <= super.aClass121_Sub1_15.anInt4511) {
							return;
						}
						local305 = (local43 * super.anInt7490 + local1126 * super.anInt7489 + super.anInt7479 * local33 >> 14) + super.anInt7492;
						local263 = (super.anInt7486 * local43 + super.anInt7484 * local1126 + super.anInt7488 * local33 >> 14) + super.anInt7483;
						arg1[local455] = arg4.anInt931 + super.aClass121_Sub1_15.anInt4513 * local263 / local391;
						arg5[local455] = super.aClass121_Sub1_15.anInt4526 * local305 / local391 + arg4.anInt932;
					}
				} else {
					for (local455 = 0; local455 < local1099.aShort65; local455++) {
						local33 = local1099.aShortArray51[local455] + (arg3 << super.anInt9654);
						local1126 = local1099.aShortArray43[local455];
						local43 = local1099.aShortArray46[local455] + (arg0 << super.anInt9654);
						local305 = (local43 * super.anInt7490 + local33 * super.anInt7479 + local1126 * super.anInt7489 >> 14) + super.anInt7492;
						local263 = (local43 * super.anInt7486 + local1126 * super.anInt7484 + local33 * super.anInt7488 >> 14) + super.anInt7483;
						arg1[local455] = super.aClass121_Sub1_15.anInt4513 * local263 / super.anInt7491 + arg4.anInt931;
						arg5[local455] = local305 * super.aClass121_Sub1_15.anInt4526 / super.anInt7491 + arg4.anInt932;
					}
				}
				if (local1099.aShortArray47 == null) {
					for (local455 = 0; local455 < local1099.aShort64; local455++) {
						@Pc(1356) short local1356 = local1099.aShortArray50[local455];
						@Pc(1361) short local1361 = local1099.aShortArray45[local455];
						@Pc(1366) short local1366 = local1099.aShortArray44[local455];
						local467 = arg1[local1356];
						local232 = arg1[local1361];
						local294 = arg1[local1366];
						local359 = arg5[local1356];
						local412 = arg5[local1361];
						local252 = arg5[local1366];
						if (-((local359 - local412) * (-local232 + local294)) + (local467 - local232) * (local252 + -local412) > 0) {
							local327 = local1099.anIntArray309[local455];
							if (local327 != -1) {
								arg4.aBoolean47 = local467 < 0 || local232 < 0 || local294 < 0 || arg4.anInt929 < local467 || local232 > arg4.anInt929 || arg4.anInt929 < local294;
								arg4.method735(local359, local412, local252, local467, local232, local294, Static564.method7701(local327, local1099.aShortArray49[local1356]), Static564.method7701(local327, local1099.aShortArray49[local1361]), Static564.method7701(local327, local1099.aShortArray49[local1366]));
							}
						}
					}
				} else {
					local455 = super.anIntArrayArray76[arg3][arg0];
					local274 = super.anIntArrayArray76[arg3 + 1][arg0];
					local339 = super.anIntArrayArray76[arg3][arg0 + 1];
					local423 = arg3 * super.anInt9652;
					local467 = super.anInt9652 + local423;
					local232 = super.anInt9652 * arg0;
					local294 = super.anInt9652 + local232;
					local359 = super.anInt7483 + (super.anInt7486 * local232 + local455 * super.anInt7484 + local423 * super.anInt7488 >> 14);
					local412 = super.anInt7492 + (super.anInt7490 * local232 + super.anInt7479 * local423 + super.anInt7489 * local455 >> 14);
					local252 = (super.anInt7485 * local455 + super.anInt7482 * local423 + local232 * super.anInt7481 >> 14) + super.anInt7487;
					local327 = super.anInt7483 + (local232 * super.anInt7486 + super.anInt7488 * local467 + super.anInt7484 * local274 >> 14);
					local380 = (local232 * super.anInt7490 + local467 * super.anInt7479 + local274 * super.anInt7489 >> 14) + super.anInt7492;
					local444 = super.anInt7487 + (local467 * super.anInt7482 + local274 * super.anInt7485 + local232 * super.anInt7481 >> 14);
					local109 = super.anInt7483 + (local294 * super.anInt7486 + super.anInt7488 * local423 + local339 * super.anInt7484 >> 14);
					local140 = super.anInt7492 + (super.anInt7489 * local339 + local423 * super.anInt7479 + local294 * super.anInt7490 >> 14);
					local166 = super.anInt7487 + (super.anInt7482 * local423 + super.anInt7485 * local339 + super.anInt7481 * local294 >> 14);
					for (local193 = 0; local193 < local1099.aShort64; local193++) {
						@Pc(1732) short local1732 = local1099.aShortArray50[local193];
						@Pc(1737) short local1737 = local1099.aShortArray45[local193];
						@Pc(1742) short local1742 = local1099.aShortArray44[local193];
						local84 = arg1[local1732];
						@Pc(1750) int local1750 = arg1[local1737];
						@Pc(1754) int local1754 = arg1[local1742];
						@Pc(1758) int local1758 = arg5[local1732];
						@Pc(1762) int local1762 = arg5[local1737];
						@Pc(1766) int local1766 = arg5[local1742];
						if (-((local1754 - local1750) * (-local1762 + local1758)) + (local1766 - local1762) * (local84 + -local1750) > 0) {
							arg4.aBoolean47 = local84 < 0 || local1750 < 0 || local1754 < 0 || arg4.anInt929 < local84 || arg4.anInt929 < local1750 || local1754 > arg4.anInt929;
							@Pc(1825) short local1825 = local1099.aShortArray47[local193];
							if (local1825 == -1) {
								@Pc(1834) int local1834 = local1099.anIntArray309[local193];
								if (local1834 != -1) {
									arg4.method735(local1758, local1762, local1766, local84, local1750, local1754, Static564.method7701(local1834, local1099.aShortArray49[local1732]), Static564.method7701(local1834, local1099.aShortArray49[local1737]), Static564.method7701(local1834, local1099.aShortArray49[local1742]));
								}
							} else {
								if (this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local1825).aByte24)) {
									arg4.anInt927 = 100;
								}
								arg4.method734(local1758, local1762, local1766, local84, local1750, local1754, local1099.aShortArray49[local1732], local1099.aShortArray49[local1737], local1099.aShortArray49[local1742], local359, local327, local109, local412, local380, local140, local252, local444, local166, local1825);
								arg4.anInt927 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte105 & 0x2) == 0) {
			@Pc(28) int local28 = super.anInt9652 * arg3;
			local33 = super.anInt9652 + local28;
			@Pc(38) int local38 = arg0 * super.anInt9652;
			local43 = super.anInt9652 + local38;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(75) int local75;
			if ((local12.aByte105 & 0x1) == 0) {
				local55 = super.anIntArrayArray76[arg3][arg0];
				local64 = super.anIntArrayArray76[arg3 + 1][arg0];
				local75 = super.anIntArrayArray76[arg3 + 1][arg0 + 1];
				local84 = super.anIntArrayArray76[arg3][arg0 + 1];
				if (super.anInt7491 == -1) {
					local109 = super.anInt7487 + (super.anInt7482 * local28 + super.anInt7485 * local55 + super.anInt7481 * local38 >> 14);
					if (local109 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local140 = (super.anInt7481 * local38 + super.anInt7482 * local33 + local64 * super.anInt7485 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local140) {
						return;
					}
					local166 = (local75 * super.anInt7485 + local33 * super.anInt7482 + local43 * super.anInt7481 >> 14) + super.anInt7487;
					if (local166 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local193 = super.anInt7487 + (super.anInt7481 * local43 + local84 * super.anInt7485 + local28 * super.anInt7482 >> 14);
					if (local193 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
				} else {
					local193 = super.anInt7491;
					local166 = super.anInt7491;
					local140 = super.anInt7491;
					local109 = super.anInt7491;
				}
				local232 = super.anInt7483 + (local38 * super.anInt7486 + super.anInt7484 * local55 + super.anInt7488 * local28 >> 14);
				local252 = (local38 * super.anInt7490 + super.anInt7479 * local28 + super.anInt7489 * local55 >> 14) + super.anInt7492;
				local263 = super.aClass121_Sub1_15.anInt4513 * local232 / local109 + arg4.anInt931;
				local274 = local252 * super.aClass121_Sub1_15.anInt4526 / local109 + arg4.anInt932;
				local294 = (super.anInt7486 * local38 + local64 * super.anInt7484 + super.anInt7488 * local33 >> 14) + super.anInt7483;
				local305 = local294 * super.aClass121_Sub1_15.anInt4513 / local140 + arg4.anInt931;
				local327 = (local33 * super.anInt7479 + local64 * super.anInt7489 + super.anInt7490 * local38 >> 14) + super.anInt7492;
				local339 = arg4.anInt932 + super.aClass121_Sub1_15.anInt4526 * local327 / local140;
				local359 = (local43 * super.anInt7486 + local75 * super.anInt7484 + super.anInt7488 * local33 >> 14) + super.anInt7483;
				local380 = super.anInt7492 + (super.anInt7490 * local43 + local75 * super.anInt7489 + local33 * super.anInt7479 >> 14);
				local391 = super.aClass121_Sub1_15.anInt4513 * local359 / local166 + arg4.anInt931;
				local412 = (local84 * super.anInt7484 + super.anInt7488 * local28 + local43 * super.anInt7486 >> 14) + super.anInt7483;
				local423 = local380 * super.aClass121_Sub1_15.anInt4526 / local166 + arg4.anInt932;
				local444 = super.anInt7492 + (super.anInt7490 * local43 + super.anInt7489 * local84 + local28 * super.anInt7479 >> 14);
				local455 = super.aClass121_Sub1_15.anInt4513 * local412 / local193 + arg4.anInt931;
				local467 = arg4.anInt932 + local444 * super.aClass121_Sub1_15.anInt4526 / local193;
			} else {
				local55 = super.anIntArrayArray76[arg3][arg0];
				if (super.anInt7491 == -1) {
					local64 = super.anInt7485 * local55;
					local109 = super.anInt7487 + (super.anInt7481 * local38 + super.anInt7482 * local28 + local64 >> 14);
					if (local109 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local140 = super.anInt7487 + (local64 + local33 * super.anInt7482 + local38 * super.anInt7481 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local140) {
						return;
					}
					local166 = super.anInt7487 + (local43 * super.anInt7481 + local64 + local33 * super.anInt7482 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local166) {
						return;
					}
					local193 = super.anInt7487 + (local64 + super.anInt7482 * local28 + local43 * super.anInt7481 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local193) {
						return;
					}
				} else {
					local193 = super.anInt7491;
					local166 = super.anInt7491;
					local140 = super.anInt7491;
					local109 = super.anInt7491;
				}
				local64 = local55 * super.anInt7484;
				local75 = super.anInt7489 * local55;
				local232 = (super.anInt7488 * local28 + local64 + local38 * super.anInt7486 >> 14) + super.anInt7483;
				local252 = (super.anInt7490 * local38 + local28 * super.anInt7479 + local75 >> 14) + super.anInt7492;
				local263 = arg4.anInt931 + super.aClass121_Sub1_15.anInt4513 * local232 / local109;
				local294 = super.anInt7483 + (super.anInt7486 * local38 + local33 * super.anInt7488 + local64 >> 14);
				local274 = arg4.anInt932 + super.aClass121_Sub1_15.anInt4526 * local252 / local109;
				local327 = (local38 * super.anInt7490 + local75 + local33 * super.anInt7479 >> 14) + super.anInt7492;
				local305 = arg4.anInt931 + super.aClass121_Sub1_15.anInt4513 * local294 / local140;
				local339 = arg4.anInt932 + super.aClass121_Sub1_15.anInt4526 * local327 / local140;
				local359 = super.anInt7483 + (super.anInt7488 * local33 + local64 + local43 * super.anInt7486 >> 14);
				local380 = super.anInt7492 + (super.anInt7490 * local43 + local75 + super.anInt7479 * local33 >> 14);
				local391 = local359 * super.aClass121_Sub1_15.anInt4513 / local166 + arg4.anInt931;
				local412 = (local43 * super.anInt7486 + local64 + super.anInt7488 * local28 >> 14) + super.anInt7483;
				local423 = super.aClass121_Sub1_15.anInt4526 * local380 / local166 + arg4.anInt932;
				local444 = (local43 * super.anInt7490 + super.anInt7479 * local28 + local75 >> 14) + super.anInt7492;
				local455 = arg4.anInt931 + super.aClass121_Sub1_15.anInt4513 * local412 / local193;
				local467 = super.aClass121_Sub1_15.anInt4526 * local444 / local193 + arg4.anInt932;
			}
			if ((local391 - local455) * (local339 - local467) - (local305 - local455) * (local423 - local467) > 0) {
				arg4.aBoolean47 = local391 < 0 || local455 < 0 || local305 < 0 || arg4.anInt929 < local391 || local455 > arg4.anInt929 || arg4.anInt929 < local305;
				if (local12.aShort127 >= 0) {
					if (this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local12.aShort127).aByte24)) {
						arg4.anInt927 = 100;
					}
					arg4.method734(local423, local467, local339, local391, local455, local305, local12.aShort128 & 0xFFFF, local12.aShort125 & 0xFFFF, local12.aShort129 & 0xFFFF, local232, local294, local412, local252, local327, local444, local109, local140, local193, local12.aShort127);
					arg4.anInt927 = 0;
				} else {
					arg4.method735(local423, local467, local339, local391, local455, local305, local12.aShort128 & 0xFFFF, local12.aShort125 & 0xFFFF, local12.aShort129 & 0xFFFF);
				}
			}
			if (-((local274 - local339) * (local455 + -local305)) + (local263 - local305) * (local467 - local339) > 0) {
				arg4.aBoolean47 = local263 < 0 || local305 < 0 || local455 < 0 || arg4.anInt929 < local263 || arg4.anInt929 < local305 || arg4.anInt929 < local455;
				if (local12.aShort127 < 0) {
					arg4.method735(local274, local339, local467, local263, local305, local455, local12.aShort126 & 0xFFFF, local12.aShort129 & 0xFFFF, local12.aShort125 & 0xFFFF);
					return;
				}
				if (this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local12.aShort127).aByte24)) {
					arg4.anInt927 = 100;
				}
				arg4.method734(local274, local339, local467, local263, local305, local455, local12.aShort126 & 0xFFFF, local12.aShort129 & 0xFFFF, local12.aShort125 & 0xFFFF, local232, local294, local412, local252, local327, local444, local109, local140, local193, local12.aShort127);
				arg4.anInt927 = 0;
			}
		}
	}
}

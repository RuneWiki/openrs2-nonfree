import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class60_Sub1_Sub1 extends Class60_Sub1 {

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!kb;IIII[[I[[II)V")
	public Class60_Sub1_Sub1(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[ILclient!gd;[II[IZZ[I)V")
	private void method3222(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int[] arg7) {
		@Pc(12) Class39 local12 = super.aClass39ArrayArray3[arg4][arg0];
		@Pc(38) int local38;
		@Pc(43) int local43;
		@Pc(48) int local48;
		@Pc(319) int local319;
		@Pc(395) int local395;
		@Pc(452) int local452;
		@Pc(492) int local492;
		@Pc(367) int local367;
		@Pc(406) int local406;
		@Pc(463) int local463;
		@Pc(523) int local523;
		@Pc(308) int local308;
		@Pc(355) int local355;
		@Pc(423) int local423;
		@Pc(481) int local481;
		@Pc(337) int local337;
		@Pc(384) int local384;
		@Pc(441) int local441;
		@Pc(511) int local511;
		@Pc(83) int local83;
		@Pc(82) int local82;
		@Pc(80) int local80;
		@Pc(78) int local78;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(212) int local212;
		@Pc(70) int local70;
		@Pc(90) int local90;
		@Pc(291) int local291;
		@Pc(561) int local561;
		@Pc(789) int local789;
		if (local12 == null) {
			@Pc(1659) Class229 local1659 = super.aClass229ArrayArray3[arg4][arg0];
			if (local1659 != null) {
				if (super.anInt7491 == -1) {
					for (local492 = 0; local492 < local1659.aShort89; local492++) {
						local38 = local1659.aShortArray105[local492] + (arg4 << super.anInt9654);
						local43 = local1659.aShortArray101[local492];
						local48 = local1659.aShortArray100[local492] + (arg0 << super.anInt9654);
						local452 = super.anInt7487 + (local43 * super.anInt7485 + local38 * super.anInt7482 + local48 * super.anInt7481 >> 14);
						if (super.aClass121_Sub1_15.anInt4511 >= local452) {
							return;
						}
						arg3[local492] = 0;
						if (arg6) {
							local367 = local452 - super.aClass121_Sub1_15.anInt4527;
							if (local367 > 255) {
								local367 = 255;
							}
							if (local367 > 0) {
								arg3[local492] = local367;
								local406 = local1659.aShortArray103[local492] * local367 / 255;
								if (local406 > 0) {
									local43 -= local406;
								}
							}
						} else if (super.aClass121_Sub1_15.aBoolean278) {
							local367 = local452 - super.aClass121_Sub1_15.anInt4527;
							if (local367 > 0) {
								arg3[local492] = local367;
								if (arg3[local492] > 255) {
									arg3[local492] = 255;
								}
							}
						}
						local395 = (super.anInt7490 * local48 + super.anInt7479 * local38 + super.anInt7489 * local43 >> 14) + super.anInt7492;
						local319 = (super.anInt7488 * local38 + super.anInt7484 * local43 + super.anInt7486 * local48 >> 14) + super.anInt7483;
						arg5[local492] = arg2.anInt2775 + super.aClass121_Sub1_15.anInt4513 * local319 / local452;
						arg1[local492] = arg2.anInt2774 + super.aClass121_Sub1_15.anInt4526 * local395 / local452;
						arg7[local492] = local452;
					}
				} else {
					for (local492 = 0; local492 < local1659.aShort89; local492++) {
						local38 = local1659.aShortArray105[local492] + (arg4 << super.anInt9654);
						local43 = local1659.aShortArray101[local492];
						local48 = local1659.aShortArray100[local492] + (arg0 << super.anInt9654);
						arg3[local492] = 0;
						if (arg6) {
							local367 = super.anInt7491 - super.aClass121_Sub1_15.anInt4527;
							if (local367 > 255) {
								local367 = 255;
							}
							if (local367 > 0) {
								arg3[local492] = local367;
								local406 = local367 * local1659.aShortArray103[local492] / 255;
								if (local406 > 0) {
									local43 -= local406;
								}
							}
						} else if (super.aClass121_Sub1_15.aBoolean278) {
							local367 = -super.aClass121_Sub1_15.anInt4527 + super.anInt7491;
							if (local367 > 0) {
								arg3[local492] = local367;
								if (arg3[local492] > 255) {
									arg3[local492] = 255;
								}
							}
						}
						local319 = super.anInt7483 + (local48 * super.anInt7486 + super.anInt7484 * local43 + local38 * super.anInt7488 >> 14);
						local395 = (super.anInt7489 * local43 + local38 * super.anInt7479 + local48 * super.anInt7490 >> 14) + super.anInt7492;
						arg5[local492] = arg2.anInt2775 + super.aClass121_Sub1_15.anInt4513 * local319 / super.anInt7491;
						arg1[local492] = local395 * super.aClass121_Sub1_15.anInt4526 / super.anInt7491 + arg2.anInt2774;
						arg7[local492] = super.anInt7491;
					}
				}
				if (local1659.aShortArray104 == null) {
					for (local492 = 0; local492 < local1659.aShort88; local492++) {
						local367 = local492 * 3;
						local406 = local367 + 1;
						local463 = local406 + 1;
						local523 = arg5[local367];
						local308 = arg5[local406];
						local355 = arg5[local463];
						local423 = arg1[local367];
						local481 = arg1[local406];
						local337 = arg1[local463];
						local384 = arg3[local406] + arg3[local367] + arg3[local463];
						if (-((local355 - local308) * (-local481 + local423)) + (local337 - local481) * (local523 - local308) > 0) {
							arg2.aBoolean186 = local523 < 0 || local308 < 0 || local355 < 0 || local523 > arg2.anInt2776 || local308 > arg2.anInt2776 || arg2.anInt2776 < local355;
							if (local384 >= 765) {
								arg2.method2312(local423, local481, local337, local523, local308, local355, arg7[local367], arg7[local406], arg7[local463], super.aClass121_Sub1_15.anInt4509);
							} else if (local384 <= 0) {
								if ((local1659.anIntArray540[local367] & 0xFFFFFF) != 0) {
									arg2.method2298(local423, local481, local337, local523, local308, local355, arg7[local367], arg7[local406], arg7[local463], local1659.anIntArray540[local367], local1659.anIntArray540[local406], local1659.anIntArray540[local463]);
								}
							} else if ((local1659.anIntArray540[local367] & 0xFFFFFF) != 0) {
								arg2.method2298(local423, local481, local337, local523, local308, local355, arg7[local367], arg7[local406], arg7[local463], Static355.method5297(local1659.anIntArray540[local367], super.aClass121_Sub1_15.anInt4509, arg3[local367]), Static355.method5297(local1659.anIntArray540[local406], super.aClass121_Sub1_15.anInt4509, arg3[local406]), Static355.method5297(local1659.anIntArray540[local463], super.aClass121_Sub1_15.anInt4509, arg3[local463]));
							}
						}
					}
				} else {
					local492 = super.anIntArrayArray76[arg4][arg0];
					local367 = super.anIntArrayArray76[arg4 + 1][arg0];
					local406 = super.anIntArrayArray76[arg4][arg0 + 1];
					local463 = arg4 * super.anInt9652;
					local523 = local463 + super.anInt9652;
					local308 = super.anInt9652 * arg0;
					local355 = super.anInt9652 + local308;
					local423 = (super.anInt7488 * local463 + super.anInt7484 * local492 + local308 * super.anInt7486 >> 14) + super.anInt7483;
					local481 = (super.anInt7479 * local463 + local492 * super.anInt7489 + local308 * super.anInt7490 >> 14) + super.anInt7492;
					local337 = super.anInt7487 + (local463 * super.anInt7482 + super.anInt7485 * local492 + super.anInt7481 * local308 >> 14);
					local384 = super.anInt7483 + (super.anInt7486 * local308 + super.anInt7488 * local523 + local367 * super.anInt7484 >> 14);
					local441 = super.anInt7492 + (local308 * super.anInt7490 + super.anInt7479 * local523 + local367 * super.anInt7489 >> 14);
					local511 = (super.anInt7481 * local308 + super.anInt7485 * local367 + super.anInt7482 * local523 >> 14) + super.anInt7487;
					local83 = (super.anInt7486 * local355 + super.anInt7488 * local463 + local406 * super.anInt7484 >> 14) + super.anInt7483;
					local82 = super.anInt7492 + (super.anInt7490 * local355 + local463 * super.anInt7479 + local406 * super.anInt7489 >> 14);
					local80 = (super.anInt7482 * local463 + super.anInt7485 * local406 + super.anInt7481 * local355 >> 14) + super.anInt7487;
					for (local78 = 0; local78 < local1659.aShort88; local78++) {
						local50 = local78 * 3;
						local52 = local50 + 1;
						local54 = local52 + 1;
						local56 = arg5[local50];
						local212 = arg5[local52];
						local70 = arg5[local54];
						local90 = arg1[local50];
						local291 = arg1[local52];
						local561 = arg1[local54];
						local789 = arg3[local54] + arg3[local52] + arg3[local50];
						if (-((local90 - local291) * (local70 + -local212)) + (local56 - local212) * (local561 + -local291) > 0) {
							arg2.aBoolean186 = local56 < 0 || local212 < 0 || local70 < 0 || arg2.anInt2776 < local56 || arg2.anInt2776 < local212 || local70 > arg2.anInt2776;
							@Pc(2424) short local2424 = local1659.aShortArray104[local78];
							if (local789 >= 765) {
								arg2.method2312(local90, local291, local561, local56, local212, local70, arg7[local50], arg7[local52], arg7[local54], super.aClass121_Sub1_15.anInt4509);
							} else {
								if (local2424 != -1 && this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local2424).aByte24)) {
									arg2.anInt2773 = 100;
								}
								if (local789 <= 0) {
									if (local2424 != -1) {
										arg2.method2304(local90, local291, local561, local56, local212, local70, arg7[local50], arg7[local52], arg7[local54], local1659.anIntArray540[local50], local1659.anIntArray540[local52], local1659.anIntArray540[local54], local423, local384, local83, local481, local441, local82, local337, local511, local80, local2424);
									} else if ((local1659.anIntArray540[local50] & 0xFFFFFF) != 0) {
										arg2.method2298(local90, local291, local561, local56, local212, local70, arg7[local50], arg7[local52], arg7[local54], local1659.anIntArray540[local50], local1659.anIntArray540[local52], local1659.anIntArray540[local54]);
									}
								} else if (local2424 != -1) {
									arg2.method2302(local90, local291, local561, local56, local212, local70, arg7[local50], arg7[local52], arg7[local54], super.aClass121_Sub1_15.anInt4509, arg3[local50], arg3[local52], arg3[local54], local1659.anIntArray540[local50], local1659.anIntArray540[local52], local1659.anIntArray540[local54], local423, local384, local83, local481, local441, local82, local337, local511, local80, local2424);
								} else if ((local1659.anIntArray540[local50] & 0xFFFFFF) != 0) {
									arg2.method2298(local90, local291, local561, local56, local212, local70, arg7[local50], arg7[local52], arg7[local54], Static462.method6488(arg3[local50] << 24 | super.aClass121_Sub1_15.anInt4509, local1659.anIntArray540[local50]), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | arg3[local52] << 24, local1659.anIntArray540[local52]), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | arg3[local54] << 24, local1659.anIntArray540[local54]));
								}
								arg2.anInt2773 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte12 & 0x2) == 0) {
			@Pc(32) int local32 = arg4 * super.anInt9652;
			local38 = local32 + super.anInt9652;
			local43 = super.anInt9652 * arg0;
			local48 = super.anInt9652 + local43;
			local50 = 0;
			local52 = 0;
			local54 = 0;
			local56 = 0;
			if ((local12.aByte12 & 0x1) == 0 || arg6) {
				local70 = super.anIntArrayArray76[arg4][arg0];
				local90 = super.anIntArrayArray76[arg4 + 1][arg0];
				local291 = super.anIntArrayArray76[arg4 + 1][arg0 + 1];
				local561 = super.anIntArrayArray76[arg4][arg0 + 1];
				if (super.anInt7491 == -1) {
					local83 = (super.anInt7485 * local70 + local32 * super.anInt7482 + local43 * super.anInt7481 >> 14) + super.anInt7487;
					if (local83 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local82 = (super.anInt7481 * local43 + local38 * super.anInt7482 + super.anInt7485 * local90 >> 14) + super.anInt7487;
					if (local82 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local80 = (local38 * super.anInt7482 + super.anInt7485 * local291 + super.anInt7481 * local48 >> 14) + super.anInt7487;
					if (local80 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local78 = super.anInt7487 + (local32 * super.anInt7482 + super.anInt7485 * local561 + super.anInt7481 * local48 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local78) {
						return;
					}
				} else {
					local78 = super.anInt7491;
					local80 = super.anInt7491;
					local82 = super.anInt7491;
					local83 = super.anInt7491;
				}
				if (arg6) {
					local212 = local83 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local50 = local212;
						local789 = local12.aShort10 * local212 / 255;
						if (local789 > 0) {
							local70 -= local789;
						}
					}
					local212 = local82 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local52 = local212;
						local789 = local12.aShort12 * local212 / 255;
						if (local789 > 0) {
							local90 -= local789;
						}
					}
					local212 = local80 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local54 = local212;
						local789 = local212 * local12.aShort11 / 255;
						if (local789 > 0) {
							local291 -= local789;
						}
					}
					local212 = local78 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 255) {
						local212 = 255;
					}
					if (local212 > 0) {
						local56 = local212;
						local789 = local212 * local12.aShort9 / 255;
						if (local789 > 0) {
							local561 -= local789;
						}
					}
				} else if (super.aClass121_Sub1_15.aBoolean278) {
					local212 = local83 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local50 = local212;
						if (local212 > 255) {
							local50 = 255;
						}
					}
					local212 = local82 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local52 = local212;
						if (local212 > 255) {
							local52 = 255;
						}
					}
					local212 = local80 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local54 = local212;
						if (local212 > 255) {
							local54 = 255;
						}
					}
					local212 = local78 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local56 = local212;
						if (local212 > 255) {
							local56 = 255;
						}
					}
				}
				local308 = (local32 * super.anInt7488 + super.anInt7484 * local70 + local43 * super.anInt7486 >> 14) + super.anInt7483;
				local337 = super.anInt7492 + (local43 * super.anInt7490 + local32 * super.anInt7479 + local70 * super.anInt7489 >> 14);
				local319 = super.aClass121_Sub1_15.anInt4513 * local308 / local83 + arg2.anInt2775;
				local367 = arg2.anInt2774 + local337 * super.aClass121_Sub1_15.anInt4526 / local83;
				local355 = super.anInt7483 + (super.anInt7486 * local43 + super.anInt7488 * local38 + super.anInt7484 * local90 >> 14);
				local395 = super.aClass121_Sub1_15.anInt4513 * local355 / local82 + arg2.anInt2775;
				local384 = super.anInt7492 + (local38 * super.anInt7479 + local90 * super.anInt7489 + local43 * super.anInt7490 >> 14);
				local406 = arg2.anInt2774 + local384 * super.aClass121_Sub1_15.anInt4526 / local82;
				local423 = super.anInt7483 + (local48 * super.anInt7486 + super.anInt7484 * local291 + super.anInt7488 * local38 >> 14);
				local441 = super.anInt7492 + (local48 * super.anInt7490 + super.anInt7479 * local38 + local291 * super.anInt7489 >> 14);
				local452 = arg2.anInt2775 + local423 * super.aClass121_Sub1_15.anInt4513 / local80;
				local481 = (super.anInt7486 * local48 + local561 * super.anInt7484 + local32 * super.anInt7488 >> 14) + super.anInt7483;
				local463 = super.aClass121_Sub1_15.anInt4526 * local441 / local80 + arg2.anInt2774;
				local511 = super.anInt7492 + (super.anInt7489 * local561 + local32 * super.anInt7479 + local48 * super.anInt7490 >> 14);
				local492 = super.aClass121_Sub1_15.anInt4513 * local481 / local78 + arg2.anInt2775;
				local523 = local511 * super.aClass121_Sub1_15.anInt4526 / local78 + arg2.anInt2774;
			} else {
				local70 = super.anIntArrayArray76[arg4][arg0];
				if (super.anInt7491 == -1) {
					local90 = local70 * super.anInt7485;
					local83 = super.anInt7487 + (super.anInt7482 * local32 + local90 + local43 * super.anInt7481 >> 14);
					if (local83 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local82 = (local90 + local38 * super.anInt7482 + local43 * super.anInt7481 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local82) {
						return;
					}
					local80 = (super.anInt7481 * local48 + local90 + super.anInt7482 * local38 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local80) {
						return;
					}
					local78 = (local90 + local32 * super.anInt7482 + local48 * super.anInt7481 >> 14) + super.anInt7487;
					if (local78 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
				} else {
					local78 = super.anInt7491;
					local80 = super.anInt7491;
					local82 = super.anInt7491;
					local83 = super.anInt7491;
				}
				if (super.aClass121_Sub1_15.aBoolean278) {
					local212 = local83 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local50 = local212;
						if (local212 > 255) {
							local50 = 255;
						}
					}
					local212 = local82 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local52 = local212;
						if (local212 > 255) {
							local52 = 255;
						}
					}
					local212 = local80 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local54 = local212;
						if (local212 > 255) {
							local54 = 255;
						}
					}
					local212 = local78 - super.aClass121_Sub1_15.anInt4527;
					if (local212 > 0) {
						local56 = local212;
						if (local212 > 255) {
							local56 = 255;
						}
					}
				}
				local90 = local70 * super.anInt7484;
				local291 = local70 * super.anInt7489;
				local308 = (local43 * super.anInt7486 + local90 + super.anInt7488 * local32 >> 14) + super.anInt7483;
				local319 = super.aClass121_Sub1_15.anInt4513 * local308 / local83 + arg2.anInt2775;
				local337 = (local43 * super.anInt7490 + super.anInt7479 * local32 + local291 >> 14) + super.anInt7492;
				local355 = super.anInt7483 + (super.anInt7486 * local43 + super.anInt7488 * local38 + local90 >> 14);
				local367 = arg2.anInt2774 + local337 * super.aClass121_Sub1_15.anInt4526 / local83;
				local384 = (local291 + super.anInt7479 * local38 + local43 * super.anInt7490 >> 14) + super.anInt7492;
				local395 = local355 * super.aClass121_Sub1_15.anInt4513 / local82 + arg2.anInt2775;
				local406 = super.aClass121_Sub1_15.anInt4526 * local384 / local82 + arg2.anInt2774;
				local423 = (local90 + super.anInt7488 * local38 + super.anInt7486 * local48 >> 14) + super.anInt7483;
				local441 = super.anInt7492 + (local291 + super.anInt7479 * local38 + local48 * super.anInt7490 >> 14);
				local452 = arg2.anInt2775 + local423 * super.aClass121_Sub1_15.anInt4513 / local80;
				local463 = super.aClass121_Sub1_15.anInt4526 * local441 / local80 + arg2.anInt2774;
				local481 = super.anInt7483 + (local48 * super.anInt7486 + super.anInt7488 * local32 + local90 >> 14);
				local492 = local481 * super.aClass121_Sub1_15.anInt4513 / local78 + arg2.anInt2775;
				local511 = (local32 * super.anInt7479 + local291 + local48 * super.anInt7490 >> 14) + super.anInt7492;
				local523 = arg2.anInt2774 + local511 * super.aClass121_Sub1_15.anInt4526 / local78;
			}
			@Pc(1175) boolean local1175 = local12.aShort8 != -1 && this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local12.aShort8).aByte24);
			local90 = local52 + local54 + local56;
			if (-((local395 - local492) * (-local523 + local463)) + (local452 - local492) * (local406 + -local523) > 0) {
				arg2.aBoolean186 = local452 < 0 || local492 < 0 || local395 < 0 || arg2.anInt2776 < local452 || arg2.anInt2776 < local492 || arg2.anInt2776 < local395;
				if (local90 >= 765) {
					arg2.method2312(local463, local523, local406, local452, local492, local395, local80, local78, local82, super.aClass121_Sub1_15.anInt4509);
				} else {
					if (local1175) {
						arg2.anInt2773 = 100;
					}
					if (local90 <= 0) {
						if (local12.aShort8 < 0) {
							arg2.method2298(local463, local523, local406, local452, local492, local395, local80, local78, local82, local12.anInt852, local12.anInt855, local12.anInt856);
						} else {
							arg2.method2304(local463, local523, local406, local452, local492, local395, local80, local78, local82, local12.anInt852, local12.anInt855, local12.anInt856, local423, local481, local355, local441, local511, local384, local80, local78, local82, local12.aShort8);
						}
					} else if (local12.aShort8 >= 0) {
						arg2.method2302(local463, local523, local406, local452, local492, local395, local80, local78, local82, super.aClass121_Sub1_15.anInt4509, local54, local56, local52, local12.anInt852, local12.anInt855, local12.anInt856, local423, local481, local355, local441, local511, local384, local80, local78, local82, local12.aShort8);
					} else {
						arg2.method2298(local463, local523, local406, local452, local492, local395, local80, local78, local82, Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local54 << 24, local12.anInt852), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local56 << 24, local12.anInt855), Static462.method6488(local52 << 24 | super.aClass121_Sub1_15.anInt4509, local12.anInt856));
					}
					arg2.anInt2773 = 0;
				}
			}
			local90 = local56 + local50 + local52;
			if (-((local367 - local406) * (local492 + -local395)) + (local319 - local395) * (-local406 + local523) > 0) {
				arg2.aBoolean186 = local319 < 0 || local395 < 0 || local492 < 0 || arg2.anInt2776 < local319 || arg2.anInt2776 < local395 || arg2.anInt2776 < local492;
				if (local90 < 765) {
					if (local1175) {
						arg2.anInt2773 = 100;
					}
					if (local90 > 0) {
						if (local12.aShort8 < 0) {
							arg2.method2298(local367, local406, local523, local319, local395, local492, local83, local82, local78, Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local50 << 24, local12.anInt853), Static462.method6488(local52 << 24 | super.aClass121_Sub1_15.anInt4509, local12.anInt856), Static462.method6488(super.aClass121_Sub1_15.anInt4509 | local56 << 24, local12.anInt855));
						} else {
							arg2.method2302(local367, local406, local523, local319, local395, local492, local83, local82, local78, super.aClass121_Sub1_15.anInt4509, local50, local52, local56, local12.anInt853, local12.anInt856, local12.anInt855, local308, local355, local481, local337, local384, local511, local83, local82, local78, local12.aShort8);
						}
					} else if (local12.aShort8 >= 0) {
						arg2.method2304(local367, local406, local523, local319, local395, local492, local83, local82, local78, local12.anInt853, local12.anInt856, local12.anInt855, local308, local355, local481, local337, local384, local511, local83, local82, local78, local12.aShort8);
					} else {
						arg2.method2298(local367, local406, local523, local319, local395, local492, local83, local82, local78, local12.anInt853, local12.anInt856, local12.anInt855);
					}
					arg2.anInt2773 = 0;
					return;
				}
				arg2.method2312(local367, local406, local523, local319, local395, local492, local83, local82, local78, super.aClass121_Sub1_15.anInt4509);
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(9) Class34_Sub1 local9 = super.aClass121_Sub1_15.aClass34_Sub1_8;
		super.anInt7491 = -1;
		super.anInt7479 = local9.anInt760;
		super.anInt7481 = local9.anInt761;
		super.anInt7490 = local9.anInt759;
		super.anInt7486 = local9.anInt757;
		super.anInt7492 = local9.anInt762;
		super.anInt7489 = local9.anInt767;
		super.anInt7483 = local9.anInt766;
		super.anInt7487 = local9.anInt763;
		super.anInt7485 = local9.anInt758;
		super.anInt7484 = local9.anInt764;
		super.anInt7482 = local9.anInt765;
		super.anInt7488 = local9.anInt756;
		for (@Pc(62) int local62 = 0; local62 < arg2 + arg2; local62++) {
			for (@Pc(66) int local66 = 0; local66 < arg2 + arg2; local66++) {
				if (arg3[local62][local66]) {
					@Pc(81) int local81 = arg0 + local62 - arg2;
					@Pc(88) int local88 = local66 + arg1 - arg2;
					if (local81 >= 0 && super.anInt9656 > local81 && local88 >= 0 && super.anInt9657 > local88) {
						this.method7892(local81, local88);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class77_Sub1 local9 = (Class77_Sub1) super.aClass121_Sub1_15.method3922(Thread.currentThread());
		local9.aClass116_2.anInt2773 = 0;
		if (super.aClass39ArrayArray3 != null) {
			this.method3222(arg1, local9.anIntArray354, local9.aClass116_2, local9.anIntArray366, arg0, local9.anIntArray351, super.aClass121_Sub1_15.aBoolean279, local9.anIntArray362);
		} else if (super.aClass341ArrayArray3 != null) {
			this.method3224(local9.anIntArray362, arg0, local9.anIntArray354, local9.anIntArray351, arg1, local9.anIntArray366, local9.aClass116_2);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[[ZIIILclient!gd;[IIII[II)V")
	private void method3223(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class116 arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int[] arg7) {
		@Pc(14) int local14 = (arg5 - arg1) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class121_Sub1_Sub2) super.aClass121_Sub1_15).aBoolean280;
		super.aClass121_Sub1_15.method7129(false);
		arg3.aBoolean184 = false;
		arg3.aBoolean187 = false;
		@Pc(35) int local35 = 0;
		@Pc(40) int local40 = local14;
		for (@Pc(47) int local47 = arg6; local47 < arg2; local47++) {
			for (@Pc(51) int local51 = arg1; local51 < arg5; local51++) {
				if (arg0[local47 - arg6][local51 - arg1]) {
					@Pc(88) int local88;
					if (super.aClass341ArrayArray3[local47][local51] != null) {
						@Pc(325) Class341 local325 = super.aClass341ArrayArray3[local47][local51];
						if (local325.aShort127 != -1 && (local325.aByte105 & 0x2) == 0 && local325.anInt9371 == -1) {
							local88 = super.aClass121_Sub1_15.method3930(local325.aShort127);
							arg3.method2299(local40 - 4, local40 + -4, local40, local35 + 4, local35, local35 + 4, 100, 100, 100, Static564.method7701(local88, local325.aShort128 & 0xFFFF), Static564.method7701(local88, local325.aShort125 & 0xFFFF), Static564.method7701(local88, local325.aShort129 & 0xFFFF));
							arg3.method2299(local40, local40, local40 - 4, local35, local35 + 4, local35, 100, 100, 100, Static564.method7701(local88, local325.aShort126 & 0xFFFF), Static564.method7701(local88, local325.aShort129 & 0xFFFF), Static564.method7701(local88, local325.aShort125 & 0xFFFF));
						} else if (local325.anInt9371 == -1) {
							arg3.method2299(local40 - 4, local40 - 4, local40, local35 + 4, local35, local35 + 4, 100, 100, 100, local325.aShort128 & 0xFFFF, local325.aShort125 & 0xFFFF, local325.aShort129 & 0xFFFF);
							arg3.method2299(local40, local40, local40 - 4, local35, local35 + 4, local35, 100, 100, 100, local325.aShort126 & 0xFFFF, local325.aShort129 & 0xFFFF, local325.aShort125 & 0xFFFF);
						} else {
							local88 = local325.anInt9371;
							arg3.method2299(local40 - 4, local40 + -4, local40, local35 + 4, local35, local35 + 4, 100, 100, 100, local88, local88, local88);
							arg3.method2299(local40, local40, local40 - 4, local35, local35 + 4, local35, 100, 100, 100, local88, local88, local88);
						}
					} else if (super.aClass106ArrayArray3[local47][local51] != null) {
						@Pc(86) Class106 local86 = super.aClass106ArrayArray3[local47][local51];
						for (local88 = 0; local88 < local86.aShort65; local88++) {
							arg7[local88] = local35 + local86.aShortArray51[local88] * 4 / super.anInt9652;
							arg4[local88] = local40 - local86.aShortArray46[local88] * 4 / super.anInt9652;
						}
						for (@Pc(129) int local129 = 0; local129 < local86.aShort64; local129++) {
							@Pc(136) short local136 = local86.aShortArray50[local129];
							@Pc(141) short local141 = local86.aShortArray45[local129];
							@Pc(146) short local146 = local86.aShortArray44[local129];
							@Pc(150) int local150 = arg7[local136];
							@Pc(154) int local154 = arg7[local141];
							@Pc(158) int local158 = arg7[local146];
							@Pc(162) int local162 = arg4[local136];
							@Pc(166) int local166 = arg4[local141];
							@Pc(170) int local170 = arg4[local146];
							@Pc(184) int local184;
							if (local86.anIntArray310 != null && local86.anIntArray310[local129] != -1) {
								local184 = local86.anIntArray310[local129];
								arg3.method2299(local162, local166, local170, local150, local154, local158, 100, 100, 100, Static564.method7701(local184, local86.aShortArray49[local136]), Static564.method7701(local184, local86.aShortArray49[local141]), Static564.method7701(local184, local86.aShortArray49[local146]));
							} else if (local86.aShortArray47 == null || local86.aShortArray47[local129] == -1) {
								local184 = local86.anIntArray309[local129];
								arg3.method2299(local162, local166, local170, local150, local154, local158, 100, 100, 100, Static564.method7701(local184, local86.aShortArray49[local136]), Static564.method7701(local184, local86.aShortArray49[local141]), Static564.method7701(local184, local86.aShortArray49[local146]));
							} else {
								local184 = super.aClass121_Sub1_15.method3930(local86.aShortArray47[local129]);
								arg3.method2299(local162, local166, local170, local150, local154, local158, 100, 100, 100, Static564.method7701(local184, local86.aShortArray49[local136]), Static564.method7701(local184, local86.aShortArray49[local141]), Static564.method7701(local184, local86.aShortArray49[local146]));
							}
						}
					}
				}
				local40 -= 4;
			}
			local35 += 4;
			local40 = local14;
		}
		arg3.aBoolean187 = true;
		super.aClass121_Sub1_15.method7129(local23);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[II[I[II[ILclient!gd;)V")
	private void method3224(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class116 arg6) {
		@Pc(29) Class341 local29 = super.aClass341ArrayArray3[arg1][arg4];
		@Pc(50) int local50;
		@Pc(61) int local61;
		@Pc(234) int local234;
		@Pc(310) int local310;
		@Pc(369) int local369;
		@Pc(426) int local426;
		@Pc(282) int local282;
		@Pc(322) int local322;
		@Pc(397) int local397;
		@Pc(438) int local438;
		@Pc(217) int local217;
		@Pc(270) int local270;
		@Pc(340) int local340;
		@Pc(386) int local386;
		@Pc(252) int local252;
		@Pc(299) int local299;
		@Pc(358) int local358;
		@Pc(415) int local415;
		@Pc(89) int local89;
		@Pc(88) int local88;
		@Pc(86) int local86;
		@Pc(84) int local84;
		@Pc(476) int local476;
		if (local29 == null) {
			@Pc(1134) Class106 local1134 = super.aClass106ArrayArray3[arg1][arg4];
			if (local1134 != null) {
				@Pc(1160) short local1160;
				if (super.anInt7491 == -1) {
					for (local426 = 0; local426 < local1134.aShort65; local426++) {
						local50 = local1134.aShortArray51[local426] + (arg1 << super.anInt9654);
						local1160 = local1134.aShortArray43[local426];
						local61 = local1134.aShortArray46[local426] + (arg4 << super.anInt9654);
						local369 = super.anInt7487 + (super.anInt7481 * local61 + local1160 * super.anInt7485 + local50 * super.anInt7482 >> 14);
						if (local369 <= super.aClass121_Sub1_15.anInt4511) {
							return;
						}
						local310 = (local61 * super.anInt7490 + super.anInt7489 * local1160 + super.anInt7479 * local50 >> 14) + super.anInt7492;
						local234 = (local1160 * super.anInt7484 + local50 * super.anInt7488 + local61 * super.anInt7486 >> 14) + super.anInt7483;
						arg3[local426] = arg6.anInt2775 + local234 * super.aClass121_Sub1_15.anInt4513 / local369;
						arg2[local426] = arg6.anInt2774 + super.aClass121_Sub1_15.anInt4526 * local310 / local369;
						arg0[local426] = local369;
					}
				} else {
					for (local426 = 0; local426 < local1134.aShort65; local426++) {
						local50 = local1134.aShortArray51[local426] + (arg1 << super.anInt9654);
						local1160 = local1134.aShortArray43[local426];
						local61 = local1134.aShortArray46[local426] + (arg4 << super.anInt9654);
						local310 = (super.anInt7490 * local61 + local1160 * super.anInt7489 + local50 * super.anInt7479 >> 14) + super.anInt7492;
						local234 = super.anInt7483 + (super.anInt7486 * local61 + super.anInt7484 * local1160 + super.anInt7488 * local50 >> 14);
						arg3[local426] = arg6.anInt2775 + super.aClass121_Sub1_15.anInt4513 * local234 / super.anInt7491;
						arg2[local426] = super.aClass121_Sub1_15.anInt4526 * local310 / super.anInt7491 + arg6.anInt2774;
						arg0[local426] = super.anInt7491;
					}
				}
				if (local1134.aShortArray47 == null) {
					for (local426 = 0; local426 < local1134.aShort64; local426++) {
						@Pc(1401) short local1401 = local1134.aShortArray50[local426];
						@Pc(1406) short local1406 = local1134.aShortArray45[local426];
						@Pc(1411) short local1411 = local1134.aShortArray44[local426];
						local438 = arg3[local1401];
						local217 = arg3[local1406];
						local270 = arg3[local1411];
						local340 = arg2[local1401];
						local386 = arg2[local1406];
						local252 = arg2[local1411];
						if ((local252 - local386) * (local438 + -local217) - (local340 - local386) * (local270 - local217) > 0) {
							local299 = local1134.anIntArray309[local426];
							if (local299 != -1) {
								arg6.aBoolean186 = local438 < 0 || local217 < 0 || local270 < 0 || arg6.anInt2776 < local438 || arg6.anInt2776 < local217 || local270 > arg6.anInt2776;
								arg6.method2299(local340, local386, local252, local438, local217, local270, arg0[local1401], arg0[local1406], arg0[local1411], Static564.method7701(local299, local1134.aShortArray49[local1401]), Static564.method7701(local299, local1134.aShortArray49[local1406]), Static564.method7701(local299, local1134.aShortArray49[local1411]));
							}
						}
					}
				} else {
					local426 = super.anIntArrayArray76[arg1][arg4];
					local282 = super.anIntArrayArray76[arg1 + 1][arg4];
					local322 = super.anIntArrayArray76[arg1][arg4 + 1];
					local397 = super.anInt9652 * arg1;
					local438 = super.anInt9652 + local397;
					local217 = super.anInt9652 * arg4;
					local270 = super.anInt9652 + local217;
					local340 = (local217 * super.anInt7486 + local426 * super.anInt7484 + super.anInt7488 * local397 >> 14) + super.anInt7483;
					local386 = super.anInt7492 + (local397 * super.anInt7479 + local426 * super.anInt7489 + super.anInt7490 * local217 >> 14);
					local252 = (super.anInt7482 * local397 + super.anInt7485 * local426 + super.anInt7481 * local217 >> 14) + super.anInt7487;
					local299 = super.anInt7483 + (local282 * super.anInt7484 + local438 * super.anInt7488 + local217 * super.anInt7486 >> 14);
					local358 = (local217 * super.anInt7490 + super.anInt7479 * local438 + super.anInt7489 * local282 >> 14) + super.anInt7492;
					local415 = super.anInt7487 + (local217 * super.anInt7481 + local282 * super.anInt7485 + super.anInt7482 * local438 >> 14);
					local89 = super.anInt7483 + (local397 * super.anInt7488 + local322 * super.anInt7484 + super.anInt7486 * local270 >> 14);
					local88 = super.anInt7492 + (super.anInt7490 * local270 + local322 * super.anInt7489 + local397 * super.anInt7479 >> 14);
					local86 = super.anInt7487 + (super.anInt7481 * local270 + super.anInt7485 * local322 + super.anInt7482 * local397 >> 14);
					for (local84 = 0; local84 < local1134.aShort64; local84++) {
						@Pc(1782) short local1782 = local1134.aShortArray50[local84];
						@Pc(1787) short local1787 = local1134.aShortArray45[local84];
						@Pc(1792) short local1792 = local1134.aShortArray44[local84];
						local476 = arg3[local1782];
						@Pc(1800) int local1800 = arg3[local1787];
						@Pc(1804) int local1804 = arg3[local1792];
						@Pc(1808) int local1808 = arg2[local1782];
						@Pc(1812) int local1812 = arg2[local1787];
						@Pc(1816) int local1816 = arg2[local1792];
						if (-((local1808 - local1812) * (-local1800 + local1804)) + (local1816 - local1812) * (local476 + -local1800) > 0) {
							arg6.aBoolean186 = local476 < 0 || local1800 < 0 || local1804 < 0 || arg6.anInt2776 < local476 || arg6.anInt2776 < local1800 || local1804 > arg6.anInt2776;
							@Pc(1879) short local1879 = local1134.aShortArray47[local84];
							if (local1879 == -1) {
								@Pc(1887) int local1887 = local1134.anIntArray309[local84];
								if (local1887 != -1) {
									arg6.method2299(local1808, local1812, local1816, local476, local1800, local1804, arg0[local1782], arg0[local1787], arg0[local1792], Static564.method7701(local1887, local1134.aShortArray49[local1782]), Static564.method7701(local1887, local1134.aShortArray49[local1787]), Static564.method7701(local1887, local1134.aShortArray49[local1792]));
								}
							} else {
								if (this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local1879).aByte24)) {
									arg6.anInt2773 = 100;
								}
								arg6.method2304(local1808, local1812, local1816, local476, local1800, local1804, arg0[local1782], arg0[local1787], arg0[local1792], local1134.aShortArray49[local1782], local1134.aShortArray49[local1787], local1134.aShortArray49[local1792], local340, local299, local89, local386, local358, local88, local252, local415, local86, local1879);
								arg6.anInt2773 = 0;
							}
						}
					}
				}
			}
		} else if ((local29.aByte105 & 0x2) == 0) {
			@Pc(45) int local45 = arg1 * super.anInt9652;
			local50 = super.anInt9652 + local45;
			@Pc(55) int local55 = arg4 * super.anInt9652;
			local61 = local55 + super.anInt9652;
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(222) int local222;
			if ((local29.aByte105 & 0x1) == 0) {
				local76 = super.anIntArrayArray76[arg1][arg4];
				local96 = super.anIntArrayArray76[arg1 + 1][arg4];
				local222 = super.anIntArrayArray76[arg1 + 1][arg4 + 1];
				local476 = super.anIntArrayArray76[arg1][arg4 + 1];
				if (super.anInt7491 == -1) {
					local89 = (super.anInt7481 * local55 + local76 * super.anInt7485 + local45 * super.anInt7482 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local89) {
						return;
					}
					local88 = (local55 * super.anInt7481 + local96 * super.anInt7485 + super.anInt7482 * local50 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local88) {
						return;
					}
					local86 = super.anInt7487 + (super.anInt7485 * local222 + local50 * super.anInt7482 + super.anInt7481 * local61 >> 14);
					if (local86 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local84 = super.anInt7487 + (local61 * super.anInt7481 + super.anInt7485 * local476 + super.anInt7482 * local45 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local84) {
						return;
					}
				} else {
					local84 = super.anInt7491;
					local86 = super.anInt7491;
					local88 = super.anInt7491;
					local89 = super.anInt7491;
				}
				local217 = super.anInt7483 + (super.anInt7488 * local45 + local76 * super.anInt7484 + super.anInt7486 * local55 >> 14);
				local234 = arg6.anInt2775 + local217 * super.aClass121_Sub1_15.anInt4513 / local89;
				local252 = super.anInt7492 + (local55 * super.anInt7490 + super.anInt7479 * local45 + super.anInt7489 * local76 >> 14);
				local282 = arg6.anInt2774 + local252 * super.aClass121_Sub1_15.anInt4526 / local89;
				local270 = super.anInt7483 + (super.anInt7486 * local55 + super.anInt7484 * local96 + super.anInt7488 * local50 >> 14);
				local310 = arg6.anInt2775 + local270 * super.aClass121_Sub1_15.anInt4513 / local88;
				local299 = (local55 * super.anInt7490 + super.anInt7489 * local96 + super.anInt7479 * local50 >> 14) + super.anInt7492;
				local340 = super.anInt7483 + (local61 * super.anInt7486 + super.anInt7484 * local222 + local50 * super.anInt7488 >> 14);
				local322 = local299 * super.aClass121_Sub1_15.anInt4526 / local88 + arg6.anInt2774;
				local358 = super.anInt7492 + (local50 * super.anInt7479 + super.anInt7489 * local222 + local61 * super.anInt7490 >> 14);
				local369 = arg6.anInt2775 + super.aClass121_Sub1_15.anInt4513 * local340 / local86;
				local386 = (super.anInt7486 * local61 + super.anInt7484 * local476 + super.anInt7488 * local45 >> 14) + super.anInt7483;
				local397 = arg6.anInt2774 + super.aClass121_Sub1_15.anInt4526 * local358 / local86;
				local426 = super.aClass121_Sub1_15.anInt4513 * local386 / local84 + arg6.anInt2775;
				local415 = super.anInt7492 + (local476 * super.anInt7489 + local45 * super.anInt7479 + local61 * super.anInt7490 >> 14);
				local438 = local415 * super.aClass121_Sub1_15.anInt4526 / local84 + arg6.anInt2774;
			} else {
				local76 = super.anIntArrayArray76[arg1][arg4];
				if (super.anInt7491 == -1) {
					local96 = super.anInt7485 * local76;
					local89 = super.anInt7487 + (super.anInt7481 * local55 + local96 + local45 * super.anInt7482 >> 14);
					if (super.aClass121_Sub1_15.anInt4511 >= local89) {
						return;
					}
					local88 = super.anInt7487 + (local55 * super.anInt7481 + local96 + local50 * super.anInt7482 >> 14);
					if (local88 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
					local86 = (local61 * super.anInt7481 + super.anInt7482 * local50 + local96 >> 14) + super.anInt7487;
					if (super.aClass121_Sub1_15.anInt4511 >= local86) {
						return;
					}
					local84 = (super.anInt7482 * local45 + local96 + local61 * super.anInt7481 >> 14) + super.anInt7487;
					if (local84 <= super.aClass121_Sub1_15.anInt4511) {
						return;
					}
				} else {
					local84 = super.anInt7491;
					local86 = super.anInt7491;
					local88 = super.anInt7491;
					local89 = super.anInt7491;
				}
				local96 = local76 * super.anInt7484;
				local217 = super.anInt7483 + (local96 + super.anInt7488 * local45 + super.anInt7486 * local55 >> 14);
				local222 = local76 * super.anInt7489;
				local234 = arg6.anInt2775 + local217 * super.aClass121_Sub1_15.anInt4513 / local89;
				local252 = super.anInt7492 + (local45 * super.anInt7479 + local222 + local55 * super.anInt7490 >> 14);
				local270 = super.anInt7483 + (local96 + super.anInt7488 * local50 + super.anInt7486 * local55 >> 14);
				local282 = arg6.anInt2774 + local252 * super.aClass121_Sub1_15.anInt4526 / local89;
				local299 = (local50 * super.anInt7479 + local222 + super.anInt7490 * local55 >> 14) + super.anInt7492;
				local310 = super.aClass121_Sub1_15.anInt4513 * local270 / local88 + arg6.anInt2775;
				local322 = arg6.anInt2774 + super.aClass121_Sub1_15.anInt4526 * local299 / local88;
				local340 = (local50 * super.anInt7488 + local96 + local61 * super.anInt7486 >> 14) + super.anInt7483;
				local358 = super.anInt7492 + (super.anInt7490 * local61 + local222 + local50 * super.anInt7479 >> 14);
				local369 = local340 * super.aClass121_Sub1_15.anInt4513 / local86 + arg6.anInt2775;
				local386 = super.anInt7483 + (super.anInt7486 * local61 + local45 * super.anInt7488 + local96 >> 14);
				local397 = arg6.anInt2774 + local358 * super.aClass121_Sub1_15.anInt4526 / local86;
				local415 = super.anInt7492 + (super.anInt7479 * local45 + local222 + super.anInt7490 * local61 >> 14);
				local426 = arg6.anInt2775 + super.aClass121_Sub1_15.anInt4513 * local386 / local84;
				local438 = arg6.anInt2774 + local415 * super.aClass121_Sub1_15.anInt4526 / local84;
			}
			if (-((local397 - local438) * (-local426 + local310)) + (local369 - local426) * (-local438 + local322) > 0) {
				arg6.aBoolean186 = local369 < 0 || local426 < 0 || local310 < 0 || arg6.anInt2776 < local369 || local426 > arg6.anInt2776 || local310 > arg6.anInt2776;
				if (local29.aShort127 >= 0) {
					if (this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local29.aShort127).aByte24)) {
						arg6.anInt2773 = 100;
					}
					arg6.method2304(local397, local438, local322, local369, local426, local310, local86, local84, local88, local29.aShort128 & 0xFFFF, local29.aShort125 & 0xFFFF, local29.aShort129 & 0xFFFF, local217, local270, local386, local252, local299, local415, local89, local88, local84, local29.aShort127);
					arg6.anInt2773 = 0;
				} else {
					arg6.method2299(local397, local438, local322, local369, local426, local310, local86, local84, local88, local29.aShort128 & 0xFFFF, local29.aShort125 & 0xFFFF, local29.aShort129 & 0xFFFF);
				}
			}
			if (-((local426 - local310) * (local282 + -local322)) + (local234 - local310) * (local438 - local322) > 0) {
				arg6.aBoolean186 = local234 < 0 || local310 < 0 || local426 < 0 || local234 > arg6.anInt2776 || local310 > arg6.anInt2776 || arg6.anInt2776 < local426;
				if (local29.aShort127 < 0) {
					arg6.method2299(local282, local322, local438, local234, local310, local426, local89, local88, local84, local29.aShort126 & 0xFFFF, local29.aShort129 & 0xFFFF, local29.aShort125 & 0xFFFF);
					return;
				}
				if (this.method6208(super.aClass121_Sub1_15.anInterface7_14.method5209(local29.aShort127).aByte24)) {
					arg6.anInt2773 = 100;
				}
				arg6.method2304(local282, local322, local438, local234, local310, local426, local89, local88, local84, local29.aShort126 & 0xFFFF, local29.aShort129 & 0xFFFF, local29.aShort125 & 0xFFFF, local217, local270, local386, local252, local299, local415, local89, local88, local84, local29.aShort127);
				arg6.anInt2773 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7894(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class77_Sub1 local9 = (Class77_Sub1) super.aClass121_Sub1_15.method3922(Thread.currentThread());
		@Pc(12) Class116 local12 = local9.aClass116_2;
		local12.aBoolean186 = false;
		local12.anInt2773 = 0;
		super.aClass121_Sub1_15.method7084();
		if (super.aClass39ArrayArray3 != null) {
			this.method3226(arg3, arg1, arg0, arg4, local12, local9.anIntArray351, arg2, local9.anIntArray354);
		} else if (super.aClass341ArrayArray3 != null) {
			this.method3223(arg4, arg1, arg2, local12, local9.anIntArray354, arg3, arg0, local9.anIntArray351);
			return;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III[[ZLclient!gd;I[IIIII[I)V")
	private void method3226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) Class116 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int[] arg7) {
		@Pc(19) int local19 = (arg0 - arg1) * 1024 / 256;
		@Pc(28) boolean local28 = ((Class121_Sub1_Sub2) super.aClass121_Sub1_15).aBoolean280;
		super.aClass121_Sub1_15.method7129(false);
		arg4.aBoolean187 = false;
		arg4.aBoolean184 = false;
		@Pc(40) int local40 = 0;
		@Pc(44) int local44 = local19;
		for (@Pc(46) int local46 = arg2; local46 < arg6; local46++) {
			for (@Pc(50) int local50 = arg1; local50 < arg0; local50++) {
				if (arg3[local46 - arg2][local50 - arg1]) {
					@Pc(86) int local86;
					if (super.aClass39ArrayArray3[local46][local50] != null) {
						@Pc(311) Class39 local311 = super.aClass39ArrayArray3[local46][local50];
						if (local311.aShort8 != -1 && (local311.aByte12 & 0x2) == 0 && local311.anInt854 == 0) {
							local86 = super.aClass121_Sub1_15.method3930(local311.aShort8);
							arg4.method2299(local44 - 4, local44 - 4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, Static564.method7701(local86, local311.anInt852), Static564.method7701(local86, local311.anInt855), Static564.method7701(local86, local311.anInt856));
							arg4.method2299(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, Static564.method7701(local86, local311.anInt853), Static564.method7701(local86, local311.anInt856), Static564.method7701(local86, local311.anInt855));
						} else if (local311.anInt854 == 0) {
							arg4.method2298(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, local311.anInt852, local311.anInt855, local311.anInt856);
							arg4.method2298(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, local311.anInt853, local311.anInt856, local311.anInt855);
						} else {
							local86 = local311.anInt854;
							arg4.method2298(local44 - 4, local44 + -4, local44, local40 + 4, local40, local40 + 4, 100, 100, 100, Static462.method6488(local311.anInt852 & 0xFF000000, local86), Static462.method6488(local311.anInt855 & 0xFF000000, local86), Static462.method6488(local311.anInt856 & 0xFF000000, local86));
							arg4.method2298(local44, local44, local44 - 4, local40, local40 + 4, local40, 100, 100, 100, Static462.method6488(local311.anInt853 & 0xFF000000, local86), Static462.method6488(local311.anInt856 & 0xFF000000, local86), Static462.method6488(local311.anInt855 & 0xFF000000, local86));
						}
					} else if (super.aClass229ArrayArray3[local46][local50] != null) {
						@Pc(84) Class229 local84 = super.aClass229ArrayArray3[local46][local50];
						for (local86 = 0; local86 < local84.aShort89; local86++) {
							arg5[local86] = local40 + local84.aShortArray105[local86] * 4 / super.anInt9652;
							arg7[local86] = local44 - local84.aShortArray100[local86] * 4 / super.anInt9652;
						}
						for (@Pc(124) int local124 = 0; local124 < local84.aShort88; local124++) {
							@Pc(130) int local130 = local124 * 3;
							@Pc(134) int local134 = local130 + 1;
							@Pc(138) int local138 = local134 + 1;
							@Pc(142) int local142 = arg5[local130];
							@Pc(146) int local146 = arg5[local134];
							@Pc(150) int local150 = arg5[local138];
							@Pc(154) int local154 = arg7[local130];
							@Pc(158) int local158 = arg7[local134];
							@Pc(162) int local162 = arg7[local138];
							@Pc(200) int local200;
							if (local84.anIntArray539 != null && local84.anIntArray539[local124] != 0 && (local84.aShortArray104 == null || local84.aShortArray104 != null && local84.aShortArray104[local124] == -1)) {
								local200 = local84.anIntArray539[local124];
								arg4.method2298(local154, local158, local162, local142, local146, local150, 100, 100, 100, Static462.method6488(-(local84.anIntArray540[local130] & 0xFF000000) - 16777216, local200), Static462.method6488(-(local84.anIntArray540[local134] & -16777216) - 16777216, local200), Static462.method6488(-(-16777216 & local84.anIntArray540[local138]) - 16777216, local200));
							} else if (local84.aShortArray104 == null || local84.aShortArray104[local124] == -1) {
								arg4.method2298(local154, local158, local162, local142, local146, local150, 100, 100, 100, local84.anIntArray540[local130], local84.anIntArray540[local134], local84.anIntArray540[local138]);
							} else {
								local200 = super.aClass121_Sub1_15.method3930(local84.aShortArray104[local124]);
								arg4.method2299(local154, local158, local162, local142, local146, local150, 100, 100, 100, local200, local200, local200);
							}
						}
					}
				}
				local44 -= 4;
			}
			local40 += 4;
			local44 = local19;
		}
		arg4.aBoolean187 = true;
		super.aClass121_Sub1_15.method7129(local28);
	}
}

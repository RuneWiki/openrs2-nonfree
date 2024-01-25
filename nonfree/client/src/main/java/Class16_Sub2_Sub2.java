import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class16_Sub2_Sub2 extends Class16_Sub2 {

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!qe;IIII[[I[[II)V")
	public Class16_Sub2_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II[I[I[IIZLclient!gh;[I)V")
	private void method3322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class123 arg6, @OriginalArg(8) int[] arg7) {
		@Pc(12) Class296 local12 = super.aClass296ArrayArray3[arg1][arg0];
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(468) int local468;
		@Pc(550) int local550;
		@Pc(594) int local594;
		@Pc(660) int local660;
		@Pc(519) int local519;
		@Pc(582) int local582;
		@Pc(628) int local628;
		@Pc(692) int local692;
		@Pc(457) int local457;
		@Pc(508) int local508;
		@Pc(571) int local571;
		@Pc(649) int local649;
		@Pc(488) int local488;
		@Pc(539) int local539;
		@Pc(616) int local616;
		@Pc(680) int local680;
		@Pc(118) int local118;
		@Pc(145) int local145;
		@Pc(176) int local176;
		@Pc(202) int local202;
		@Pc(42) int local42;
		@Pc(44) int local44;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(226) int local226;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(247) int local247;
		if (local12 == null) {
			@Pc(1663) Class323 local1663 = super.aClass323ArrayArray3[arg1][arg0];
			if (local1663 != null) {
				if (super.anInt3733 == -1) {
					for (local660 = 0; local660 < local1663.aShort113; local660++) {
						local30 = local1663.aShortArray152[local660] + (arg1 << super.anInt9837);
						local35 = local1663.aShortArray154[local660];
						local40 = local1663.aShortArray149[local660] + (arg0 << super.anInt9837);
						local594 = (super.anInt3736 * local40 + super.anInt3735 * local35 + super.anInt3738 * local30 >> 14) + super.anInt3744;
						if (super.aClass66_Sub2_11.anInt3206 >= local594) {
							return;
						}
						arg4[local660] = 0;
						if (arg5) {
							local519 = local594 - super.aClass66_Sub2_11.anInt3223;
							if (local519 > 255) {
								local519 = 255;
							}
							if (local519 > 0) {
								arg4[local660] = local519;
								local582 = local1663.aShortArray151[local660] * local519 / 255;
								if (local582 > 0) {
									local35 -= local582;
								}
							}
						} else if (super.aClass66_Sub2_11.aBoolean254) {
							local519 = local594 - super.aClass66_Sub2_11.anInt3223;
							if (local519 > 0) {
								arg4[local660] = local519;
								if (arg4[local660] > 255) {
									arg4[local660] = 255;
								}
							}
						}
						local550 = super.anInt3739 + (local30 * super.anInt3746 + super.anInt3743 * local35 + super.anInt3740 * local40 >> 14);
						local468 = (local35 * super.anInt3734 + super.anInt3741 * local30 + local40 * super.anInt3742 >> 14) + super.anInt3745;
						arg7[local660] = arg6.anInt3616 + local468 * super.aClass66_Sub2_11.anInt3232 / local594;
						arg2[local660] = arg6.anInt3614 + super.aClass66_Sub2_11.anInt3226 * local550 / local594;
						arg3[local660] = local594;
					}
				} else {
					for (local660 = 0; local660 < local1663.aShort113; local660++) {
						local30 = local1663.aShortArray152[local660] + (arg1 << super.anInt9837);
						local35 = local1663.aShortArray154[local660];
						local40 = local1663.aShortArray149[local660] + (arg0 << super.anInt9837);
						arg4[local660] = 0;
						if (arg5) {
							local519 = super.anInt3733 - super.aClass66_Sub2_11.anInt3223;
							if (local519 > 255) {
								local519 = 255;
							}
							if (local519 > 0) {
								arg4[local660] = local519;
								local582 = local1663.aShortArray151[local660] * local519 / 255;
								if (local582 > 0) {
									local35 -= local582;
								}
							}
						} else if (super.aClass66_Sub2_11.aBoolean254) {
							local519 = -super.aClass66_Sub2_11.anInt3223 + super.anInt3733;
							if (local519 > 0) {
								arg4[local660] = local519;
								if (arg4[local660] > 255) {
									arg4[local660] = 255;
								}
							}
						}
						local468 = (local30 * super.anInt3741 + local35 * super.anInt3734 + local40 * super.anInt3742 >> 14) + super.anInt3745;
						local550 = super.anInt3739 + (super.anInt3746 * local30 + local35 * super.anInt3743 + local40 * super.anInt3740 >> 14);
						arg7[local660] = arg6.anInt3616 + super.aClass66_Sub2_11.anInt3232 * local468 / super.anInt3733;
						arg2[local660] = super.aClass66_Sub2_11.anInt3226 * local550 / super.anInt3733 + arg6.anInt3614;
						arg3[local660] = super.anInt3733;
					}
				}
				if (local1663.aShortArray150 == null) {
					for (local660 = 0; local660 < local1663.aShort112; local660++) {
						local519 = local660 * 3;
						local582 = local519 + 1;
						local628 = local582 + 1;
						local692 = arg7[local519];
						local457 = arg7[local582];
						local508 = arg7[local628];
						local571 = arg2[local519];
						local649 = arg2[local582];
						local488 = arg2[local628];
						local539 = arg4[local628] + arg4[local582] + arg4[local519];
						if (-((local508 - local457) * (local571 + -local649)) + (local692 - local457) * (local488 + -local649) > 0) {
							arg6.aBoolean289 = local692 < 0 || local457 < 0 || local508 < 0 || local692 > arg6.anInt3619 || arg6.anInt3619 < local457 || local508 > arg6.anInt3619;
							if (local539 >= 765) {
								arg6.method3221(local571, local649, local488, local692, local457, local508, arg3[local519], arg3[local582], arg3[local628], super.aClass66_Sub2_11.anInt3209);
							} else if (local539 <= 0) {
								if ((local1663.anIntArray675[local519] & 0xFFFFFF) != 0) {
									arg6.method3215(local571, local649, local488, local692, local457, local508, arg3[local519], arg3[local582], arg3[local628], local1663.anIntArray675[local519], local1663.anIntArray675[local582], local1663.anIntArray675[local628]);
								}
							} else if ((local1663.anIntArray675[local519] & 0xFFFFFF) != 0) {
								arg6.method3215(local571, local649, local488, local692, local457, local508, arg3[local519], arg3[local582], arg3[local628], Static219.method3784(local1663.anIntArray675[local519], arg4[local519], super.aClass66_Sub2_11.anInt3209), Static219.method3784(local1663.anIntArray675[local582], arg4[local582], super.aClass66_Sub2_11.anInt3209), Static219.method3784(local1663.anIntArray675[local628], arg4[local628], super.aClass66_Sub2_11.anInt3209));
							}
						}
					}
				} else {
					local660 = super.anIntArrayArray46[arg1][arg0];
					local519 = super.anIntArrayArray46[arg1 + 1][arg0];
					local582 = super.anIntArrayArray46[arg1][arg0 + 1];
					local628 = arg1 * super.anInt9841;
					local692 = local628 + super.anInt9841;
					local457 = super.anInt9841 * arg0;
					local508 = local457 + super.anInt9841;
					local571 = (super.anInt3742 * local457 + local660 * super.anInt3734 + super.anInt3741 * local628 >> 14) + super.anInt3745;
					local649 = super.anInt3739 + (super.anInt3740 * local457 + local660 * super.anInt3743 + local628 * super.anInt3746 >> 14);
					local488 = super.anInt3744 + (local457 * super.anInt3736 + super.anInt3738 * local628 + super.anInt3735 * local660 >> 14);
					local539 = (super.anInt3742 * local457 + super.anInt3734 * local519 + super.anInt3741 * local692 >> 14) + super.anInt3745;
					local616 = (local457 * super.anInt3740 + super.anInt3743 * local519 + super.anInt3746 * local692 >> 14) + super.anInt3739;
					local680 = super.anInt3744 + (local457 * super.anInt3736 + local692 * super.anInt3738 + super.anInt3735 * local519 >> 14);
					local118 = super.anInt3745 + (local582 * super.anInt3734 + local628 * super.anInt3741 + super.anInt3742 * local508 >> 14);
					local145 = super.anInt3739 + (local508 * super.anInt3740 + super.anInt3746 * local628 + super.anInt3743 * local582 >> 14);
					local176 = (super.anInt3738 * local628 + local582 * super.anInt3735 + super.anInt3736 * local508 >> 14) + super.anInt3744;
					for (local202 = 0; local202 < local1663.aShort112; local202++) {
						local42 = local202 * 3;
						local44 = local42 + 1;
						local46 = local44 + 1;
						local48 = arg7[local42];
						local226 = arg7[local44];
						local65 = arg7[local46];
						local74 = arg2[local42];
						local85 = arg2[local44];
						local94 = arg2[local46];
						local247 = arg4[local42] + arg4[local44] + arg4[local46];
						if ((local48 - local226) * (local94 + -local85) - (local65 - local226) * (local74 - local85) > 0) {
							arg6.aBoolean289 = local48 < 0 || local226 < 0 || local65 < 0 || local48 > arg6.anInt3619 || local226 > arg6.anInt3619 || local65 > arg6.anInt3619;
							@Pc(2408) short local2408 = local1663.aShortArray150[local202];
							if (local247 >= 765) {
								arg6.method3221(local74, local85, local94, local48, local226, local65, arg3[local42], arg3[local44], arg3[local46], super.aClass66_Sub2_11.anInt3209);
							} else {
								if (local2408 != -1 && this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local2408).aByte84)) {
									arg6.anInt3618 = 100;
								}
								if (local247 > 0) {
									if (local2408 != -1) {
										arg6.method3213(local74, local85, local94, local48, local226, local65, arg3[local42], arg3[local44], arg3[local46], super.aClass66_Sub2_11.anInt3209, arg4[local42], arg4[local44], arg4[local46], local1663.anIntArray675[local42], local1663.anIntArray675[local44], local1663.anIntArray675[local46], local571, local539, local118, local649, local616, local145, local488, local680, local176, local2408);
									} else if ((local1663.anIntArray675[local42] & 0xFFFFFF) != 0) {
										arg6.method3215(local74, local85, local94, local48, local226, local65, arg3[local42], arg3[local44], arg3[local46], Static482.method6709(arg4[local42] << 24 | super.aClass66_Sub2_11.anInt3209, local1663.anIntArray675[local42]), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | arg4[local44] << 24, local1663.anIntArray675[local44]), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | arg4[local46] << 24, local1663.anIntArray675[local46]));
									}
								} else if (local2408 != -1) {
									arg6.method3224(local74, local85, local94, local48, local226, local65, arg3[local42], arg3[local44], arg3[local46], local1663.anIntArray675[local42], local1663.anIntArray675[local44], local1663.anIntArray675[local46], local571, local539, local118, local649, local616, local145, local488, local680, local176, local2408);
								} else if ((local1663.anIntArray675[local42] & 0xFFFFFF) != 0) {
									arg6.method3215(local74, local85, local94, local48, local226, local65, arg3[local42], arg3[local44], arg3[local46], local1663.anIntArray675[local42], local1663.anIntArray675[local44], local1663.anIntArray675[local46]);
								}
								arg6.anInt3618 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte88 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt9841 * arg1;
			local30 = local25 + super.anInt9841;
			local35 = arg0 * super.anInt9841;
			local40 = super.anInt9841 + local35;
			local42 = 0;
			local44 = 0;
			local46 = 0;
			local48 = 0;
			if ((local12.aByte88 & 0x1) == 0 || arg5) {
				local65 = super.anIntArrayArray46[arg1][arg0];
				local74 = super.anIntArrayArray46[arg1 + 1][arg0];
				local85 = super.anIntArrayArray46[arg1 + 1][arg0 + 1];
				local94 = super.anIntArrayArray46[arg1][arg0 + 1];
				if (super.anInt3733 == -1) {
					local118 = (local65 * super.anInt3735 + super.anInt3738 * local25 + local35 * super.anInt3736 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local118) {
						return;
					}
					local145 = super.anInt3744 + (local35 * super.anInt3736 + super.anInt3735 * local74 + super.anInt3738 * local30 >> 14);
					if (super.aClass66_Sub2_11.anInt3206 >= local145) {
						return;
					}
					local176 = (super.anInt3738 * local30 + super.anInt3735 * local85 + local40 * super.anInt3736 >> 14) + super.anInt3744;
					if (local176 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local202 = super.anInt3744 + (super.anInt3735 * local94 + super.anInt3738 * local25 + local40 * super.anInt3736 >> 14);
					if (local202 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
				} else {
					local202 = super.anInt3733;
					local176 = super.anInt3733;
					local145 = super.anInt3733;
					local118 = super.anInt3733;
				}
				if (arg5) {
					local226 = local118 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 255) {
						local226 = 255;
					}
					if (local226 > 0) {
						local42 = local226;
						local247 = local12.aShort102 * local226 / 255;
						if (local247 > 0) {
							local65 -= local247;
						}
					}
					local226 = local145 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 255) {
						local226 = 255;
					}
					if (local226 > 0) {
						local44 = local226;
						local247 = local226 * local12.aShort100 / 255;
						if (local247 > 0) {
							local74 -= local247;
						}
					}
					local226 = local176 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 255) {
						local226 = 255;
					}
					if (local226 > 0) {
						local46 = local226;
						local247 = local12.aShort101 * local226 / 255;
						if (local247 > 0) {
							local85 -= local247;
						}
					}
					local226 = local202 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 255) {
						local226 = 255;
					}
					if (local226 > 0) {
						local48 = local226;
						local247 = local226 * local12.aShort99 / 255;
						if (local247 > 0) {
							local94 -= local247;
						}
					}
				} else if (super.aClass66_Sub2_11.aBoolean254) {
					local226 = local118 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local42 = local226;
						if (local226 > 255) {
							local42 = 255;
						}
					}
					local226 = local145 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local44 = local226;
						if (local226 > 255) {
							local44 = 255;
						}
					}
					local226 = local176 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local46 = local226;
						if (local226 > 255) {
							local46 = 255;
						}
					}
					local226 = local202 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local48 = local226;
						if (local226 > 255) {
							local48 = 255;
						}
					}
				}
				local457 = super.anInt3745 + (local25 * super.anInt3741 + local65 * super.anInt3734 + local35 * super.anInt3742 >> 14);
				local468 = super.aClass66_Sub2_11.anInt3232 * local457 / local118 + arg6.anInt3616;
				local488 = super.anInt3739 + (local35 * super.anInt3740 + local65 * super.anInt3743 + super.anInt3746 * local25 >> 14);
				local508 = (local30 * super.anInt3741 + super.anInt3734 * local74 + super.anInt3742 * local35 >> 14) + super.anInt3745;
				local519 = super.aClass66_Sub2_11.anInt3226 * local488 / local118 + arg6.anInt3614;
				local539 = super.anInt3739 + (local35 * super.anInt3740 + local74 * super.anInt3743 + local30 * super.anInt3746 >> 14);
				local550 = local508 * super.aClass66_Sub2_11.anInt3232 / local145 + arg6.anInt3616;
				local571 = super.anInt3745 + (super.anInt3742 * local40 + super.anInt3741 * local30 + super.anInt3734 * local85 >> 14);
				local582 = arg6.anInt3614 + local539 * super.aClass66_Sub2_11.anInt3226 / local145;
				local594 = arg6.anInt3616 + local571 * super.aClass66_Sub2_11.anInt3232 / local176;
				local616 = super.anInt3739 + (super.anInt3740 * local40 + super.anInt3746 * local30 + super.anInt3743 * local85 >> 14);
				local628 = arg6.anInt3614 + local616 * super.aClass66_Sub2_11.anInt3226 / local176;
				local649 = (super.anInt3741 * local25 + super.anInt3734 * local94 + local40 * super.anInt3742 >> 14) + super.anInt3745;
				local660 = arg6.anInt3616 + local649 * super.aClass66_Sub2_11.anInt3232 / local202;
				local680 = (local40 * super.anInt3740 + super.anInt3743 * local94 + super.anInt3746 * local25 >> 14) + super.anInt3739;
				local692 = arg6.anInt3614 + super.aClass66_Sub2_11.anInt3226 * local680 / local202;
			} else {
				local65 = super.anIntArrayArray46[arg1][arg0];
				if (super.anInt3733 == -1) {
					local74 = super.anInt3735 * local65;
					local118 = (super.anInt3738 * local25 + local74 + super.anInt3736 * local35 >> 14) + super.anInt3744;
					if (local118 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local145 = super.anInt3744 + (local74 + super.anInt3738 * local30 + local35 * super.anInt3736 >> 14);
					if (local145 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local176 = (local30 * super.anInt3738 + local74 + local40 * super.anInt3736 >> 14) + super.anInt3744;
					if (local176 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local202 = (local25 * super.anInt3738 + local74 + super.anInt3736 * local40 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local202) {
						return;
					}
				} else {
					local202 = super.anInt3733;
					local176 = super.anInt3733;
					local145 = super.anInt3733;
					local118 = super.anInt3733;
				}
				if (super.aClass66_Sub2_11.aBoolean254) {
					local226 = local118 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local42 = local226;
						if (local226 > 255) {
							local42 = 255;
						}
					}
					local226 = local145 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local44 = local226;
						if (local226 > 255) {
							local44 = 255;
						}
					}
					local226 = local176 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local46 = local226;
						if (local226 > 255) {
							local46 = 255;
						}
					}
					local226 = local202 - super.aClass66_Sub2_11.anInt3223;
					if (local226 > 0) {
						local48 = local226;
						if (local226 > 255) {
							local48 = 255;
						}
					}
				}
				local74 = local65 * super.anInt3734;
				local85 = local65 * super.anInt3743;
				local457 = super.anInt3745 + (local35 * super.anInt3742 + super.anInt3741 * local25 + local74 >> 14);
				local488 = super.anInt3739 + (super.anInt3740 * local35 + local85 + local25 * super.anInt3746 >> 14);
				local468 = super.aClass66_Sub2_11.anInt3232 * local457 / local118 + arg6.anInt3616;
				local519 = arg6.anInt3614 + local488 * super.aClass66_Sub2_11.anInt3226 / local118;
				local508 = super.anInt3745 + (local74 + local30 * super.anInt3741 + local35 * super.anInt3742 >> 14);
				local539 = super.anInt3739 + (super.anInt3740 * local35 + local30 * super.anInt3746 + local85 >> 14);
				local550 = local508 * super.aClass66_Sub2_11.anInt3232 / local145 + arg6.anInt3616;
				local571 = (local30 * super.anInt3741 + local74 + local40 * super.anInt3742 >> 14) + super.anInt3745;
				local582 = arg6.anInt3614 + super.aClass66_Sub2_11.anInt3226 * local539 / local145;
				local616 = super.anInt3739 + (local85 + super.anInt3746 * local30 + local40 * super.anInt3740 >> 14);
				local594 = arg6.anInt3616 + super.aClass66_Sub2_11.anInt3232 * local571 / local176;
				local649 = super.anInt3745 + (super.anInt3742 * local40 + local25 * super.anInt3741 + local74 >> 14);
				local628 = super.aClass66_Sub2_11.anInt3226 * local616 / local176 + arg6.anInt3614;
				local660 = arg6.anInt3616 + local649 * super.aClass66_Sub2_11.anInt3232 / local202;
				local680 = (super.anInt3746 * local25 + local85 + super.anInt3740 * local40 >> 14) + super.anInt3739;
				local692 = arg6.anInt3614 + local680 * super.aClass66_Sub2_11.anInt3226 / local202;
			}
			@Pc(1175) boolean local1175 = local12.aShort103 != -1 && this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local12.aShort103).aByte84);
			local74 = local46 + local44 + local48;
			if ((local594 - local660) * (local582 + -local692) - (local628 - local692) * (-local660 + local550) > 0) {
				arg6.aBoolean289 = local594 < 0 || local660 < 0 || local550 < 0 || local594 > arg6.anInt3619 || arg6.anInt3619 < local660 || arg6.anInt3619 < local550;
				if (local74 >= 765) {
					arg6.method3221(local628, local692, local582, local594, local660, local550, local176, local202, local145, super.aClass66_Sub2_11.anInt3209);
				} else {
					if (local1175) {
						arg6.anInt3618 = 100;
					}
					if (local74 > 0) {
						if (local12.aShort103 >= 0) {
							arg6.method3213(local628, local692, local582, local594, local660, local550, local176, local202, local145, super.aClass66_Sub2_11.anInt3209, local46, local48, local44, local12.anInt7914, local12.anInt7915, local12.anInt7916, local571, local649, local508, local616, local680, local539, local176, local202, local145, local12.aShort103);
						} else {
							arg6.method3215(local628, local692, local582, local594, local660, local550, local176, local202, local145, Static482.method6709(local46 << 24 | super.aClass66_Sub2_11.anInt3209, local12.anInt7914), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | local48 << 24, local12.anInt7915), Static482.method6709(super.aClass66_Sub2_11.anInt3209 | local44 << 24, local12.anInt7916));
						}
					} else if (local12.aShort103 >= 0) {
						arg6.method3224(local628, local692, local582, local594, local660, local550, local176, local202, local145, local12.anInt7914, local12.anInt7915, local12.anInt7916, local571, local649, local508, local616, local680, local539, local176, local202, local145, local12.aShort103);
					} else {
						arg6.method3215(local628, local692, local582, local594, local660, local550, local176, local202, local145, local12.anInt7914, local12.anInt7915, local12.anInt7916);
					}
					arg6.anInt3618 = 0;
				}
			}
			local74 = local48 + local44 + local42;
			if (-((local660 - local550) * (-local582 + local519)) + (local692 - local582) * (-local550 + local468) > 0) {
				arg6.aBoolean289 = local468 < 0 || local550 < 0 || local660 < 0 || local468 > arg6.anInt3619 || arg6.anInt3619 < local550 || arg6.anInt3619 < local660;
				if (local74 >= 765) {
					arg6.method3221(local519, local582, local692, local468, local550, local660, local118, local145, local202, super.aClass66_Sub2_11.anInt3209);
					return;
				}
				if (local1175) {
					arg6.anInt3618 = 100;
				}
				if (local74 <= 0) {
					if (local12.aShort103 >= 0) {
						arg6.method3224(local519, local582, local692, local468, local550, local660, local118, local145, local202, local12.anInt7913, local12.anInt7916, local12.anInt7915, local457, local508, local649, local488, local539, local680, local118, local145, local202, local12.aShort103);
					} else {
						arg6.method3215(local519, local582, local692, local468, local550, local660, local118, local145, local202, local12.anInt7913, local12.anInt7916, local12.anInt7915);
					}
				} else if (local12.aShort103 < 0) {
					arg6.method3215(local519, local582, local692, local468, local550, local660, local118, local145, local202, Static482.method6709(local42 << 24 | super.aClass66_Sub2_11.anInt3209, local12.anInt7913), Static482.method6709(local44 << 24 | super.aClass66_Sub2_11.anInt3209, local12.anInt7916), Static482.method6709(local48 << 24 | super.aClass66_Sub2_11.anInt3209, local12.anInt7915));
				} else {
					arg6.method3213(local519, local582, local692, local468, local550, local660, local118, local145, local202, super.aClass66_Sub2_11.anInt3209, local42, local44, local48, local12.anInt7913, local12.anInt7916, local12.anInt7915, local457, local508, local649, local488, local539, local680, local118, local145, local202, local12.aShort103);
				}
				arg6.anInt3618 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		super.anInt3733 = -1;
		@Pc(12) Class134_Sub3 local12 = super.aClass66_Sub2_11.aClass134_Sub3_7;
		super.anInt3738 = local12.anInt7284;
		super.anInt3745 = local12.anInt7281;
		super.anInt3741 = local12.anInt7278;
		super.anInt3743 = local12.anInt7276;
		super.anInt3735 = local12.anInt7283;
		super.anInt3746 = local12.anInt7280;
		super.anInt3736 = local12.anInt7282;
		super.anInt3742 = local12.anInt7285;
		super.anInt3739 = local12.anInt7277;
		super.anInt3740 = local12.anInt7275;
		super.anInt3734 = local12.anInt7274;
		super.anInt3744 = local12.anInt7279;
		for (@Pc(62) int local62 = 0; local62 < arg2 + arg2; local62++) {
			for (@Pc(66) int local66 = 0; local66 < arg2 + arg2; local66++) {
				if (arg3[local62][local66]) {
					@Pc(82) int local82 = arg0 + local62 - arg2;
					@Pc(89) int local89 = arg1 + local66 - arg2;
					if (local82 >= 0 && local82 < super.anInt9838 && local89 >= 0 && super.anInt9839 > local89) {
						this.method8044(local82, local89);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II[[Z[IIILclient!gh;IBII[I)V")
	private void method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) Class123 arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(11) int[] arg7) {
		@Pc(19) int local19 = (arg6 - arg1) * 1024 / 256;
		@Pc(28) boolean local28 = ((Class66_Sub2_Sub1) super.aClass66_Sub2_11).aBoolean233;
		super.aClass66_Sub2_11.method6857(false);
		arg4.aBoolean290 = false;
		arg4.aBoolean287 = false;
		@Pc(40) int local40 = 0;
		@Pc(45) int local45 = local19;
		for (@Pc(47) int local47 = arg0; local47 < arg5; local47++) {
			for (@Pc(51) int local51 = arg1; local51 < arg6; local51++) {
				if (arg2[local47 - arg0][local51 - arg1]) {
					@Pc(88) int local88;
					if (super.aClass296ArrayArray3[local47][local51] != null) {
						@Pc(315) Class296 local315 = super.aClass296ArrayArray3[local47][local51];
						if (local315.aShort103 != -1 && (local315.aByte88 & 0x2) == 0 && local315.anInt7912 == 0) {
							local88 = super.aClass66_Sub2_11.method2963(local315.aShort103);
							arg4.method3218(local45 - 4, local45 + -4, local45, local40 + 4, local40, local40 + 4, 100, 100, 100, Static253.method4246(local315.anInt7914, local88), Static253.method4246(local315.anInt7915, local88), Static253.method4246(local315.anInt7916, local88));
							arg4.method3218(local45, local45, local45 - 4, local40, local40 + 4, local40, 100, 100, 100, Static253.method4246(local315.anInt7913, local88), Static253.method4246(local315.anInt7916, local88), Static253.method4246(local315.anInt7915, local88));
						} else if (local315.anInt7912 == 0) {
							arg4.method3215(local45 - 4, local45 - 4, local45, local40 + 4, local40, local40 + 4, 100, 100, 100, local315.anInt7914, local315.anInt7915, local315.anInt7916);
							arg4.method3215(local45, local45, local45 - 4, local40, local40 + 4, local40, 100, 100, 100, local315.anInt7913, local315.anInt7916, local315.anInt7915);
						} else {
							local88 = local315.anInt7912;
							arg4.method3215(local45 - 4, local45 - 4, local45, local40 + 4, local40, local40 + 4, 100, 100, 100, Static482.method6709(local315.anInt7914 & 0xFF000000, local88), Static482.method6709(local315.anInt7915 & 0xFF000000, local88), Static482.method6709(local315.anInt7916 & 0xFF000000, local88));
							arg4.method3215(local45, local45, local45 - 4, local40, local40 + 4, local40, 100, 100, 100, Static482.method6709(local315.anInt7913 & 0xFF000000, local88), Static482.method6709(local315.anInt7916 & 0xFF000000, local88), Static482.method6709(local315.anInt7915 & 0xFF000000, local88));
						}
					} else if (super.aClass323ArrayArray3[local47][local51] != null) {
						@Pc(86) Class323 local86 = super.aClass323ArrayArray3[local47][local51];
						for (local88 = 0; local88 < local86.aShort113; local88++) {
							arg7[local88] = local40 + local86.aShortArray152[local88] * 4 / super.anInt9841;
							arg3[local88] = local45 - local86.aShortArray149[local88] * 4 / super.anInt9841;
						}
						for (@Pc(125) int local125 = 0; local125 < local86.aShort112; local125++) {
							@Pc(131) int local131 = local125 * 3;
							@Pc(135) int local135 = local131 + 1;
							@Pc(139) int local139 = local135 + 1;
							@Pc(143) int local143 = arg7[local131];
							@Pc(147) int local147 = arg7[local135];
							@Pc(151) int local151 = arg7[local139];
							@Pc(155) int local155 = arg3[local131];
							@Pc(159) int local159 = arg3[local135];
							@Pc(163) int local163 = arg3[local139];
							@Pc(192) int local192;
							if (local86.anIntArray674 != null && local86.anIntArray674[local125] != 0 && (local86.aShortArray150 == null || local86.aShortArray150 != null && local86.aShortArray150[local125] == -1)) {
								local192 = local86.anIntArray674[local125];
								arg4.method3215(local155, local159, local163, local143, local147, local151, 100, 100, 100, Static482.method6709(-(local86.anIntArray675[local131] & -16777216) - 16777216, local192), Static482.method6709(-(local86.anIntArray675[local135] & 0xFF000000) - 16777216, local192), Static482.method6709(-(local86.anIntArray675[local139] & 0xFF000000) - 16777216, local192));
							} else if (local86.aShortArray150 == null || local86.aShortArray150[local125] == -1) {
								arg4.method3215(local155, local159, local163, local143, local147, local151, 100, 100, 100, local86.anIntArray675[local131], local86.anIntArray675[local135], local86.anIntArray675[local139]);
							} else {
								local192 = super.aClass66_Sub2_11.method2963(local86.aShortArray150[local125]);
								arg4.method3218(local155, local159, local163, local143, local147, local151, 100, 100, 100, local192, local192, local192);
							}
						}
					}
				}
				local45 -= 4;
			}
			local40 += 4;
			local45 = local19;
		}
		arg4.aBoolean287 = true;
		super.aClass66_Sub2_11.method6857(local28);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8039(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class94_Sub2 local9 = (Class94_Sub2) super.aClass66_Sub2_11.method2953(Thread.currentThread());
		@Pc(12) Class123 local12 = local9.aClass123_2;
		local12.anInt3618 = 0;
		local12.aBoolean289 = false;
		super.aClass66_Sub2_11.method6795();
		if (super.aClass296ArrayArray3 != null) {
			this.method3324(arg0, arg1, arg4, local9.anIntArray573, local12, arg2, arg3, local9.anIntArray566);
		} else if (super.aClass38ArrayArray3 != null) {
			this.method3328(arg2, local12, arg4, arg1, local9.anIntArray573, arg3, local9.anIntArray566, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([II[IB[IILclient!gh;[I)V")
	private void method3327(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class123 arg5, @OriginalArg(7) int[] arg6) {
		@Pc(20) Class38 local20 = super.aClass38ArrayArray3[arg4][arg1];
		@Pc(38) int local38;
		@Pc(48) int local48;
		@Pc(217) int local217;
		@Pc(277) int local277;
		@Pc(351) int local351;
		@Pc(390) int local390;
		@Pc(418) int local418;
		@Pc(200) int local200;
		@Pc(266) int local266;
		@Pc(323) int local323;
		@Pc(368) int local368;
		@Pc(235) int local235;
		@Pc(295) int local295;
		@Pc(340) int local340;
		@Pc(407) int local407;
		@Pc(74) int local74;
		@Pc(73) int local73;
		@Pc(71) int local71;
		@Pc(69) int local69;
		@Pc(456) int local456;
		@Pc(247) int local247;
		@Pc(306) int local306;
		@Pc(379) int local379;
		if (local20 == null) {
			@Pc(1114) Class126 local1114 = super.aClass126ArrayArray3[arg4][arg1];
			if (local1114 != null) {
				@Pc(1141) short local1141;
				if (super.anInt3733 == -1) {
					for (local390 = 0; local390 < local1114.aShort55; local390++) {
						local38 = local1114.aShortArray77[local390] + (arg4 << super.anInt9837);
						local1141 = local1114.aShortArray73[local390];
						local48 = local1114.aShortArray81[local390] + (arg1 << super.anInt9837);
						local351 = (super.anInt3735 * local1141 + super.anInt3738 * local38 + local48 * super.anInt3736 >> 14) + super.anInt3744;
						if (super.aClass66_Sub2_11.anInt3206 >= local351) {
							return;
						}
						local217 = (local38 * super.anInt3741 + super.anInt3734 * local1141 + super.anInt3742 * local48 >> 14) + super.anInt3745;
						local277 = super.anInt3739 + (super.anInt3746 * local38 + super.anInt3743 * local1141 + local48 * super.anInt3740 >> 14);
						arg0[local390] = arg5.anInt3616 + local217 * super.aClass66_Sub2_11.anInt3232 / local351;
						arg3[local390] = super.aClass66_Sub2_11.anInt3226 * local277 / local351 + arg5.anInt3614;
						arg2[local390] = local351;
					}
				} else {
					for (local390 = 0; local390 < local1114.aShort55; local390++) {
						local38 = local1114.aShortArray77[local390] + (arg4 << super.anInt9837);
						local1141 = local1114.aShortArray73[local390];
						local48 = local1114.aShortArray81[local390] + (arg1 << super.anInt9837);
						local277 = (local48 * super.anInt3740 + local1141 * super.anInt3743 + local38 * super.anInt3746 >> 14) + super.anInt3739;
						local217 = super.anInt3745 + (local48 * super.anInt3742 + local1141 * super.anInt3734 + local38 * super.anInt3741 >> 14);
						arg0[local390] = super.aClass66_Sub2_11.anInt3232 * local217 / super.anInt3733 + arg5.anInt3616;
						arg3[local390] = local277 * super.aClass66_Sub2_11.anInt3226 / super.anInt3733 + arg5.anInt3614;
						arg2[local390] = super.anInt3733;
					}
				}
				if (local1114.aShortArray79 == null) {
					for (local390 = 0; local390 < local1114.aShort56; local390++) {
						@Pc(1828) short local1828 = local1114.aShortArray78[local390];
						@Pc(1833) short local1833 = local1114.aShortArray80[local390];
						@Pc(1838) short local1838 = local1114.aShortArray76[local390];
						local418 = arg0[local1828];
						local200 = arg0[local1833];
						local266 = arg0[local1838];
						local323 = arg3[local1828];
						local368 = arg3[local1833];
						local235 = arg3[local1838];
						if ((local235 - local368) * (local418 + -local200) - (local323 - local368) * (local266 - local200) > 0) {
							local295 = local1114.anIntArray363[local390];
							if (local295 != -1) {
								arg5.aBoolean289 = local418 < 0 || local200 < 0 || local266 < 0 || local418 > arg5.anInt3619 || arg5.anInt3619 < local200 || local266 > arg5.anInt3619;
								arg5.method3218(local323, local368, local235, local418, local200, local266, arg2[local1828], arg2[local1833], arg2[local1838], Static253.method4246(local1114.aShortArray74[local1828], local295), Static253.method4246(local1114.aShortArray74[local1833], local295), Static253.method4246(local1114.aShortArray74[local1838], local295));
							}
						}
					}
				} else {
					local390 = super.anIntArrayArray46[arg4][arg1];
					local247 = super.anIntArrayArray46[arg4 + 1][arg1];
					local306 = super.anIntArrayArray46[arg4][arg1 + 1];
					local379 = super.anInt9841 * arg4;
					local418 = super.anInt9841 + local379;
					local200 = arg1 * super.anInt9841;
					local266 = super.anInt9841 + local200;
					local323 = super.anInt3745 + (super.anInt3734 * local390 + local379 * super.anInt3741 + super.anInt3742 * local200 >> 14);
					local368 = (super.anInt3740 * local200 + local390 * super.anInt3743 + local379 * super.anInt3746 >> 14) + super.anInt3739;
					local235 = super.anInt3744 + (local379 * super.anInt3738 + local390 * super.anInt3735 + local200 * super.anInt3736 >> 14);
					local295 = (super.anInt3734 * local247 + local418 * super.anInt3741 + local200 * super.anInt3742 >> 14) + super.anInt3745;
					local340 = (local247 * super.anInt3743 + local418 * super.anInt3746 + super.anInt3740 * local200 >> 14) + super.anInt3739;
					local407 = super.anInt3744 + (local200 * super.anInt3736 + local418 * super.anInt3738 + local247 * super.anInt3735 >> 14);
					local74 = (local379 * super.anInt3741 + local306 * super.anInt3734 + super.anInt3742 * local266 >> 14) + super.anInt3745;
					local73 = (super.anInt3740 * local266 + local306 * super.anInt3743 + super.anInt3746 * local379 >> 14) + super.anInt3739;
					local71 = super.anInt3744 + (local379 * super.anInt3738 + super.anInt3735 * local306 + super.anInt3736 * local266 >> 14);
					for (local69 = 0; local69 < local1114.aShort56; local69++) {
						@Pc(1614) short local1614 = local1114.aShortArray78[local69];
						@Pc(1619) short local1619 = local1114.aShortArray80[local69];
						@Pc(1624) short local1624 = local1114.aShortArray76[local69];
						local456 = arg0[local1614];
						@Pc(1632) int local1632 = arg0[local1619];
						@Pc(1636) int local1636 = arg0[local1624];
						@Pc(1640) int local1640 = arg3[local1614];
						@Pc(1644) int local1644 = arg3[local1619];
						@Pc(1648) int local1648 = arg3[local1624];
						if ((local1648 - local1644) * (local456 + -local1632) - (local1640 - local1644) * (local1636 + -local1632) > 0) {
							arg5.aBoolean289 = local456 < 0 || local1632 < 0 || local1636 < 0 || arg5.anInt3619 < local456 || local1632 > arg5.anInt3619 || local1636 > arg5.anInt3619;
							@Pc(1705) short local1705 = local1114.aShortArray79[local69];
							if (local1705 == -1) {
								@Pc(1714) int local1714 = local1114.anIntArray363[local69];
								if (local1714 != -1) {
									arg5.method3218(local1640, local1644, local1648, local456, local1632, local1636, arg2[local1614], arg2[local1619], arg2[local1624], Static253.method4246(local1114.aShortArray74[local1614], local1714), Static253.method4246(local1114.aShortArray74[local1619], local1714), Static253.method4246(local1114.aShortArray74[local1624], local1714));
								}
							} else {
								if (this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local1705).aByte84)) {
									arg5.anInt3618 = 100;
								}
								arg5.method3224(local1640, local1644, local1648, local456, local1632, local1636, arg2[local1614], arg2[local1619], arg2[local1624], local1114.aShortArray74[local1614], local1114.aShortArray74[local1619], local1114.aShortArray74[local1624], local323, local295, local74, local368, local340, local73, local235, local407, local71, local1705);
								arg5.anInt3618 = 0;
							}
						}
					}
				}
			}
		} else if ((local20.aByte16 & 0x2) == 0) {
			@Pc(33) int local33 = super.anInt9841 * arg4;
			local38 = super.anInt9841 + local33;
			@Pc(43) int local43 = super.anInt9841 * arg1;
			local48 = super.anInt9841 + local43;
			@Pc(60) int local60;
			@Pc(81) int local81;
			@Pc(205) int local205;
			if ((local20.aByte16 & 0x1) == 0) {
				local60 = super.anIntArrayArray46[arg4][arg1];
				local81 = super.anIntArrayArray46[arg4 + 1][arg1];
				local205 = super.anIntArrayArray46[arg4 + 1][arg1 + 1];
				local456 = super.anIntArrayArray46[arg4][arg1 + 1];
				if (super.anInt3733 == -1) {
					local74 = (super.anInt3735 * local60 + local33 * super.anInt3738 + local43 * super.anInt3736 >> 14) + super.anInt3744;
					if (local74 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local73 = super.anInt3744 + (super.anInt3736 * local43 + super.anInt3738 * local38 + local81 * super.anInt3735 >> 14);
					if (super.aClass66_Sub2_11.anInt3206 >= local73) {
						return;
					}
					local71 = (super.anInt3736 * local48 + super.anInt3738 * local38 + local205 * super.anInt3735 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local71) {
						return;
					}
					local69 = super.anInt3744 + (super.anInt3738 * local33 + super.anInt3735 * local456 + local48 * super.anInt3736 >> 14);
					if (super.aClass66_Sub2_11.anInt3206 >= local69) {
						return;
					}
				} else {
					local69 = super.anInt3733;
					local71 = super.anInt3733;
					local73 = super.anInt3733;
					local74 = super.anInt3733;
				}
				local200 = super.anInt3745 + (local33 * super.anInt3741 + local60 * super.anInt3734 + local43 * super.anInt3742 >> 14);
				local217 = arg5.anInt3616 + super.aClass66_Sub2_11.anInt3232 * local200 / local74;
				local235 = super.anInt3739 + (super.anInt3743 * local60 + local33 * super.anInt3746 + local43 * super.anInt3740 >> 14);
				local266 = super.anInt3745 + (local38 * super.anInt3741 + local81 * super.anInt3734 + local43 * super.anInt3742 >> 14);
				local247 = super.aClass66_Sub2_11.anInt3226 * local235 / local74 + arg5.anInt3614;
				local295 = (local81 * super.anInt3743 + local38 * super.anInt3746 + local43 * super.anInt3740 >> 14) + super.anInt3739;
				local277 = arg5.anInt3616 + super.aClass66_Sub2_11.anInt3232 * local266 / local73;
				local323 = (super.anInt3742 * local48 + local38 * super.anInt3741 + local205 * super.anInt3734 >> 14) + super.anInt3745;
				local306 = arg5.anInt3614 + local295 * super.aClass66_Sub2_11.anInt3226 / local73;
				local351 = local323 * super.aClass66_Sub2_11.anInt3232 / local71 + arg5.anInt3616;
				local340 = super.anInt3739 + (super.anInt3740 * local48 + super.anInt3743 * local205 + super.anInt3746 * local38 >> 14);
				local379 = arg5.anInt3614 + local340 * super.aClass66_Sub2_11.anInt3226 / local71;
				local368 = (local48 * super.anInt3742 + super.anInt3734 * local456 + local33 * super.anInt3741 >> 14) + super.anInt3745;
				local390 = arg5.anInt3616 + super.aClass66_Sub2_11.anInt3232 * local368 / local69;
				local407 = (super.anInt3746 * local33 + local456 * super.anInt3743 + local48 * super.anInt3740 >> 14) + super.anInt3739;
				local418 = arg5.anInt3614 + local407 * super.aClass66_Sub2_11.anInt3226 / local69;
			} else {
				local60 = super.anIntArrayArray46[arg4][arg1];
				if (super.anInt3733 == -1) {
					local81 = local60 * super.anInt3735;
					local74 = super.anInt3744 + (local43 * super.anInt3736 + local81 + local33 * super.anInt3738 >> 14);
					if (local74 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local73 = (local81 + local38 * super.anInt3738 + super.anInt3736 * local43 >> 14) + super.anInt3744;
					if (super.aClass66_Sub2_11.anInt3206 >= local73) {
						return;
					}
					local71 = super.anInt3744 + (super.anInt3736 * local48 + local81 + super.anInt3738 * local38 >> 14);
					if (local71 <= super.aClass66_Sub2_11.anInt3206) {
						return;
					}
					local69 = super.anInt3744 + (local81 + local33 * super.anInt3738 + super.anInt3736 * local48 >> 14);
					if (super.aClass66_Sub2_11.anInt3206 >= local69) {
						return;
					}
				} else {
					local69 = super.anInt3733;
					local71 = super.anInt3733;
					local73 = super.anInt3733;
					local74 = super.anInt3733;
				}
				local81 = super.anInt3734 * local60;
				local200 = (super.anInt3742 * local43 + local81 + super.anInt3741 * local33 >> 14) + super.anInt3745;
				local205 = local60 * super.anInt3743;
				local217 = arg5.anInt3616 + super.aClass66_Sub2_11.anInt3232 * local200 / local74;
				local235 = (super.anInt3740 * local43 + super.anInt3746 * local33 + local205 >> 14) + super.anInt3739;
				local247 = arg5.anInt3614 + super.aClass66_Sub2_11.anInt3226 * local235 / local74;
				local266 = (super.anInt3741 * local38 + local81 + super.anInt3742 * local43 >> 14) + super.anInt3745;
				local277 = local266 * super.aClass66_Sub2_11.anInt3232 / local73 + arg5.anInt3616;
				local295 = (local205 + local38 * super.anInt3746 + super.anInt3740 * local43 >> 14) + super.anInt3739;
				local306 = arg5.anInt3614 + local295 * super.aClass66_Sub2_11.anInt3226 / local73;
				local323 = super.anInt3745 + (super.anInt3742 * local48 + local81 + super.anInt3741 * local38 >> 14);
				local340 = (local48 * super.anInt3740 + local205 + super.anInt3746 * local38 >> 14) + super.anInt3739;
				local351 = super.aClass66_Sub2_11.anInt3232 * local323 / local71 + arg5.anInt3616;
				local368 = (super.anInt3742 * local48 + local81 + super.anInt3741 * local33 >> 14) + super.anInt3745;
				local379 = super.aClass66_Sub2_11.anInt3226 * local340 / local71 + arg5.anInt3614;
				local390 = super.aClass66_Sub2_11.anInt3232 * local368 / local69 + arg5.anInt3616;
				local407 = (local48 * super.anInt3740 + local205 + local33 * super.anInt3746 >> 14) + super.anInt3739;
				local418 = arg5.anInt3614 + local407 * super.aClass66_Sub2_11.anInt3226 / local69;
			}
			if ((local306 - local418) * (-local390 + local351) - (local379 - local418) * (-local390 + local277) > 0) {
				arg5.aBoolean289 = local351 < 0 || local390 < 0 || local277 < 0 || arg5.anInt3619 < local351 || local390 > arg5.anInt3619 || local277 > arg5.anInt3619;
				if (local20.aShort26 >= 0) {
					if (this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local20.aShort26).aByte84)) {
						arg5.anInt3618 = 100;
					}
					arg5.method3224(local379, local418, local306, local351, local390, local277, local71, local69, local73, local20.aShort28 & 0xFFFF, local20.aShort24 & 0xFFFF, local20.aShort25 & 0xFFFF, local200, local266, local368, local235, local295, local407, local74, local73, local69, local20.aShort26);
					arg5.anInt3618 = 0;
				} else {
					arg5.method3218(local379, local418, local306, local351, local390, local277, local71, local69, local73, local20.aShort28 & 0xFFFF, local20.aShort24 & 0xFFFF, local20.aShort25 & 0xFFFF);
				}
			}
			if ((local418 - local306) * (-local277 + local217) - (local247 - local306) * (-local277 + local390) > 0) {
				arg5.aBoolean289 = local217 < 0 || local277 < 0 || local390 < 0 || local217 > arg5.anInt3619 || local277 > arg5.anInt3619 || local390 > arg5.anInt3619;
				if (local20.aShort26 < 0) {
					arg5.method3218(local247, local306, local418, local217, local277, local390, local74, local73, local69, local20.aShort27 & 0xFFFF, local20.aShort25 & 0xFFFF, local20.aShort24 & 0xFFFF);
					return;
				}
				if (this.method3320(super.aClass66_Sub2_11.anInterface3_15.method7249(local20.aShort26).aByte84)) {
					arg5.anInt3618 = 100;
				}
				arg5.method3224(local247, local306, local418, local217, local277, local390, local74, local73, local69, local20.aShort27 & 0xFFFF, local20.aShort25 & 0xFFFF, local20.aShort24 & 0xFFFF, local200, local266, local368, local235, local295, local407, local74, local73, local69, local20.aShort26);
				arg5.anInt3618 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	@Override
	public void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class94_Sub2 local9 = (Class94_Sub2) super.aClass66_Sub2_11.method2953(Thread.currentThread());
		local9.aClass123_2.anInt3618 = 0;
		if (super.aClass296ArrayArray3 != null) {
			this.method3322(arg1, arg0, local9.anIntArray573, local9.anIntArray567, local9.anIntArray550, super.aClass66_Sub2_11.aBoolean253, local9.aClass123_2, local9.anIntArray566);
		} else if (super.aClass38ArrayArray3 != null) {
			this.method3327(local9.anIntArray566, arg1, local9.anIntArray567, local9.anIntArray573, arg0, local9.aClass123_2, local9.anIntArray550);
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!gh;[[ZII[IIII[III)V")
	private void method3328(@OriginalArg(0) int arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg5 - arg3) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class66_Sub2_Sub1) super.aClass66_Sub2_11).aBoolean233;
		super.aClass66_Sub2_11.method6857(false);
		arg1.aBoolean287 = false;
		arg1.aBoolean290 = false;
		@Pc(35) int local35 = 0;
		@Pc(44) int local44 = local14;
		for (@Pc(46) int local46 = arg7; local46 < arg0; local46++) {
			for (@Pc(50) int local50 = arg3; local50 < arg5; local50++) {
				if (arg2[local46 - arg7][local50 - arg3]) {
					@Pc(85) int local85;
					if (super.aClass38ArrayArray3[local46][local50] != null) {
						@Pc(324) Class38 local324 = super.aClass38ArrayArray3[local46][local50];
						if (local324.aShort26 != -1 && (local324.aByte16 & 0x2) == 0 && local324.anInt896 == -1) {
							local85 = super.aClass66_Sub2_11.method2963(local324.aShort26);
							arg1.method3218(local44 - 4, local44 + -4, local44, local35 + 4, local35, local35 + 4, 100, 100, 100, Static253.method4246(local324.aShort28 & 0xFFFF, local85), Static253.method4246(local324.aShort24 & 0xFFFF, local85), Static253.method4246(local324.aShort25 & 0xFFFF, local85));
							arg1.method3218(local44, local44, local44 - 4, local35, local35 + 4, local35, 100, 100, 100, Static253.method4246(local324.aShort27 & 0xFFFF, local85), Static253.method4246(local324.aShort25 & 0xFFFF, local85), Static253.method4246(local324.aShort24 & 0xFFFF, local85));
						} else if (local324.anInt896 == -1) {
							arg1.method3218(local44 - 4, local44 - 4, local44, local35 + 4, local35, local35 + 4, 100, 100, 100, local324.aShort28 & 0xFFFF, local324.aShort24 & 0xFFFF, local324.aShort25 & 0xFFFF);
							arg1.method3218(local44, local44, local44 - 4, local35, local35 + 4, local35, 100, 100, 100, local324.aShort27 & 0xFFFF, local324.aShort25 & 0xFFFF, local324.aShort24 & 0xFFFF);
						} else {
							local85 = local324.anInt896;
							arg1.method3218(local44 - 4, local44 + -4, local44, local35 + 4, local35, local35 + 4, 100, 100, 100, local85, local85, local85);
							arg1.method3218(local44, local44, local44 - 4, local35, local35 + 4, local35, 100, 100, 100, local85, local85, local85);
						}
					} else if (super.aClass126ArrayArray3[local46][local50] != null) {
						@Pc(83) Class126 local83 = super.aClass126ArrayArray3[local46][local50];
						for (local85 = 0; local85 < local83.aShort55; local85++) {
							arg6[local85] = local35 + local83.aShortArray77[local85] * 4 / super.anInt9841;
							arg4[local85] = local44 - local83.aShortArray81[local85] * 4 / super.anInt9841;
						}
						for (@Pc(127) int local127 = 0; local127 < local83.aShort56; local127++) {
							@Pc(134) short local134 = local83.aShortArray78[local127];
							@Pc(139) short local139 = local83.aShortArray80[local127];
							@Pc(144) short local144 = local83.aShortArray76[local127];
							@Pc(148) int local148 = arg6[local134];
							@Pc(152) int local152 = arg6[local139];
							@Pc(156) int local156 = arg6[local144];
							@Pc(160) int local160 = arg4[local134];
							@Pc(164) int local164 = arg4[local139];
							@Pc(168) int local168 = arg4[local144];
							@Pc(183) int local183;
							if (local83.anIntArray364 != null && local83.anIntArray364[local127] != -1) {
								local183 = local83.anIntArray364[local127];
								arg1.method3218(local160, local164, local168, local148, local152, local156, 100, 100, 100, Static253.method4246(local83.aShortArray74[local134], local183), Static253.method4246(local83.aShortArray74[local139], local183), Static253.method4246(local83.aShortArray74[local144], local183));
							} else if (local83.aShortArray79 == null || local83.aShortArray79[local127] == -1) {
								local183 = local83.anIntArray363[local127];
								arg1.method3218(local160, local164, local168, local148, local152, local156, 100, 100, 100, Static253.method4246(local83.aShortArray74[local134], local183), Static253.method4246(local83.aShortArray74[local139], local183), Static253.method4246(local83.aShortArray74[local144], local183));
							} else {
								local183 = super.aClass66_Sub2_11.method2963(local83.aShortArray79[local127]);
								arg1.method3218(local160, local164, local168, local148, local152, local156, 100, 100, 100, Static253.method4246(local83.aShortArray74[local134], local183), Static253.method4246(local83.aShortArray74[local139], local183), Static253.method4246(local83.aShortArray74[local144], local183));
							}
						}
					}
				}
				local44 -= 4;
			}
			local44 = local14;
			local35 += 4;
		}
		arg1.aBoolean287 = true;
		super.aClass66_Sub2_11.method6857(local23);
	}
}

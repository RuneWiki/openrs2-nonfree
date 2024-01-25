import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class98_Sub1_Sub1_Sub1 extends Class98_Sub1_Sub1 {

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
	private int anInt9525;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lclient!ul;")
	public Class98_Sub7 aClass98_Sub7_1;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "S")
	private short aShort117;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "S")
	private short aShort118;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "S")
	private short aShort119;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
	private int anInt9526;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ul;IIIIIIIIIIIZZ)V")
	public Class98_Sub1_Sub1_Sub1(@OriginalArg(0) Class98_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass98_Sub7_1 = arg0;
		super.anInt9517 = arg1 << 12;
		super.anInt9523 = arg2 << 12;
		super.anInt9520 = arg3 << 12;
		super.anInt9521 = arg9;
		this.aShort118 = this.aShort117 = (short) arg8;
		super.anInt9516 = arg10;
		super.anInt9524 = arg11;
		super.aBoolean730 = arg13;
		this.aShort120 = (short) arg4;
		this.aShort119 = (short) arg5;
		this.aShort122 = (short) arg6;
		this.anInt9526 = arg7;
		super.aByte106 = this.aClass98_Sub7_1.aClass85_2.aByte26;
		this.method7772();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method7770(@OriginalArg(0) Class14 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt9517 >> Static339.anInt6128 + 12;
		@Pc(13) int local13 = super.anInt9520 >> Static339.anInt6128 + 12;
		@Pc(18) int local18 = super.anInt9523 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static401.anInt7022 || local13 < 0 || local13 >= Static555.anInt9182) {
			this.method7774();
			return;
		}
		@Pc(40) Class98_Sub3 local40 = this.aClass98_Sub7_1.aClass98_Sub3_6;
		@Pc(44) Class281 local44 = this.aClass98_Sub7_1.aClass281_1;
		@Pc(46) Class59[] local46 = Static133.aClass59Array3;
		@Pc(49) int local49 = local40.anInt5248;
		@Pc(58) Class276 local58 = Static270.aClass276ArrayArrayArray2[local40.anInt5248][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte85;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static107.anInt2060 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static339.anInt6128);
		}
		if (local44.aBoolean542) {
			if (local44.anInt7652 == -1 && local18 > local70) {
				this.method7774();
				return;
			}
			if (local44.anInt7652 >= 0 && local18 > local46[local44.anInt7652].JA(local6, local13)) {
				this.method7774();
				return;
			}
			if (local44.anInt7651 == -1 && local18 < local84) {
				this.method7774();
				return;
			}
			if (local44.anInt7651 >= 0 && local18 < local46[local44.anInt7651 + 1].JA(local6, local13)) {
				this.method7774();
				return;
			}
		}
		if (local6 >= local40.anInt5245 && local6 <= local40.anInt5246 && local13 >= local40.anInt5247 && local13 <= local40.anInt5243 && local18 <= local70 && local18 >= local84) {
			local40.aClass144_1.aClass254_1.method5860(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static107.anInt2060 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean540 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method7774();
		} else if (local172 == Static107.anInt2060 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static339.anInt6128) {
			this.method7774();
		} else {
			local58 = Static270.aClass276ArrayArrayArray2[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static270.aClass276ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static270.aClass276ArrayArrayArray2[0][local6][local13] = new Class276(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static270.aClass276ArrayArrayArray2[0][local6][local13].aClass276_1 != null;
				if (local172 == 3 && local268) {
					this.method7774();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static270.aClass276ArrayArrayArray2[local278][local6][local13] == null) {
						local58 = Static270.aClass276ArrayArrayArray2[local278][local6][local13] = new Class276(local278, local6, local13);
						if (local268) {
							local58.aByte85++;
						}
					}
				}
			}
			if (local44.aBoolean541) {
				@Pc(323) int local323 = super.anInt9517 >> 12;
				local278 = super.anInt9520 >> 12;
				@Pc(337) Class277 local337;
				if (local58.aClass4_Sub5_2 != null) {
					local337 = local58.aClass4_Sub5_2.method7781(arg0);
					if (local337 != null && local337.method6207(local18, local323, local278)) {
						this.method7774();
						return;
					}
				}
				if (local58.aClass4_Sub5_3 != null) {
					local337 = local58.aClass4_Sub5_3.method7781(arg0);
					if (local337 != null && local337.method6207(local18, local323, local278)) {
						this.method7774();
						return;
					}
				}
				if (local58.aClass4_Sub3_2 != null) {
					local337 = local58.aClass4_Sub3_2.method7781(arg0);
					if (local337 != null && local337.method6207(local18, local323, local278)) {
						this.method7774();
						return;
					}
				}
				for (@Pc(394) Class267 local394 = local58.aClass267_3; local394 != null; local394 = local394.aClass267_2) {
					@Pc(401) Class277 local401 = local394.aClass4_Sub1_2.method7781(arg0);
					if (local401 != null && local401.method6207(local18, local323, local278)) {
						this.method7774();
						return;
					}
				}
			}
			local40.aClass144_1.aClass254_1.method5860(this);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JI)V")
	public void method7771(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort117 = (short) (this.aShort117 - arg1);
		if (this.aShort117 <= 0) {
			this.method7774();
			return;
		}
		@Pc(17) int local17 = super.anInt9517 >> 12;
		@Pc(22) int local22 = super.anInt9523 >> 12;
		@Pc(27) int local27 = super.anInt9520 >> 12;
		@Pc(31) Class98_Sub3 local31 = this.aClass98_Sub7_1.aClass98_Sub3_6;
		@Pc(35) Class281 local35 = this.aClass98_Sub7_1.aClass281_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt7662 != 0) {
			if (this.aShort118 - this.aShort117 <= local35.anInt7667) {
				local65 = (super.anInt9521 >> 8 & 0xFF00) + (this.anInt9525 >> 16 & 0xFF) + local35.anInt7669 * arg1;
				local82 = (super.anInt9521 & 0xFF00) + (this.anInt9525 >> 8 & 0xFF) + local35.anInt7690 * arg1;
				local99 = ((super.anInt9521 & 0xFF) << 8) + (this.anInt9525 & 0xFF) + local35.anInt7680 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt9521 &= 0xFF000000;
				super.anInt9521 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt9525 &= 0xFF000000;
				this.anInt9525 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort118 - this.aShort117 <= local35.anInt7685) {
				local65 = (super.anInt9521 >> 16 & 0xFF00) + (this.anInt9525 >> 24 & 0xFF) + local35.anInt7668 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt9521 &= 0xFFFFFF;
				super.anInt9521 |= (local65 & 0xFF00) << 16;
				this.anInt9525 &= 0xFFFFFF;
				this.anInt9525 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt7674 != -1 && this.aShort118 - this.aShort117 <= local35.anInt7691) {
			this.anInt9526 += local35.anInt7677 * arg1;
		}
		if (local35.anInt7681 != -1 && this.aShort118 - this.aShort117 <= local35.anInt7689) {
			super.anInt9516 += local35.anInt7692 * arg1;
		}
		local65 = this.aShort120;
		local82 = this.aShort119;
		local99 = this.aShort122;
		@Pc(303) boolean local303 = false;
		@Pc(314) int local314;
		@Pc(321) int local321;
		@Pc(328) int local328;
		@Pc(345) int local345;
		@Pc(353) long local353;
		if (local35.anInt7678 == 1) {
			local314 = local17 - this.aClass98_Sub7_1.aClass19_1.anInt767;
			local321 = local22 - this.aClass98_Sub7_1.aClass19_1.anInt776;
			local328 = local27 - this.aClass98_Sub7_1.aClass19_1.anInt774;
			local345 = (int) Math.sqrt((double) (local314 * local314 + local321 * local321 + local328 * local328)) >> 2;
			local353 = local35.anInt7655 * local345 * arg1;
			this.anInt9526 = (int) ((long) this.anInt9526 - ((long) this.anInt9526 * local353 >> 18));
		} else if (local35.anInt7678 == 2) {
			local314 = local17 - this.aClass98_Sub7_1.aClass19_1.anInt767;
			local321 = local22 - this.aClass98_Sub7_1.aClass19_1.anInt776;
			local328 = local27 - this.aClass98_Sub7_1.aClass19_1.anInt774;
			local345 = local314 * local314 + local321 * local321 + local328 * local328;
			local353 = local35.anInt7655 * local345 * arg1;
			this.anInt9526 = (int) ((long) this.anInt9526 - ((long) this.anInt9526 * local353 >> 28));
		}
		@Pc(452) int local452;
		@Pc(486) int local486;
		@Pc(499) long local499;
		@Pc(509) int local509;
		@Pc(545) int local545;
		if (local35.anIntArray553 != null) {
			@Pc(434) Class6 local434 = local31.aClass361_43.aClass6_287;
			for (@Pc(437) Class6 local437 = local434.aClass6_286; local437 != local434; local437 = local437.aClass6_286) {
				@Pc(441) Class6_Sub2_Sub11 local441 = (Class6_Sub2_Sub11) local437;
				@Pc(444) Class42 local444 = local441.aClass42_1;
				if (local444.anInt1164 != 1) {
					@Pc(450) boolean local450 = false;
					for (local452 = 0; local452 < local35.anIntArray553.length; local452++) {
						if (local35.anIntArray553[local452] == local444.anInt1166) {
							local450 = true;
							break;
						}
					}
					if (local450) {
						@Pc(476) int local476 = local17 - local441.anInt4792;
						@Pc(481) int local481 = local22 - local441.anInt4798;
						local486 = local27 - local441.anInt4799;
						local499 = local476 * local476 + local481 * local481 + local486 * local486;
						if (local499 <= local444.aLong35) {
							local509 = (int) Math.sqrt((double) local499);
							if (local509 == 0) {
								local509 = 1;
							}
							@Pc(537) long local537 = (long) (local476 * local441.anInt4796 + local481 * local444.anInt1170 + local486 * local441.anInt4791) * 65535L / (long) (local444.anInt1169 * local509);
							if (local537 >= (long) local444.anInt1158) {
								local545 = 0;
								if (local444.anInt1167 == 1) {
									local545 = (local509 >> 4) * local444.anInt1163;
								} else if (local444.anInt1167 == 2) {
									local545 = (local509 >> 4) * (local509 >> 4) * local444.anInt1163;
								}
								if (local444.anInt1157 != 0) {
									@Pc(651) int local651 = (local476 << 15) / local509 * local444.anInt1169;
									@Pc(660) int local660 = (local481 << 15) / local509 * local444.anInt1169;
									@Pc(669) int local669 = (local486 << 15) / local509 * local444.anInt1169;
									if (local444.anInt1161 == 0) {
										local65 += local651 * arg1 >> 15;
										local82 += local660 * arg1 >> 15;
										local99 += local669 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt9517 += local651 * arg1 >> 15;
										super.anInt9523 += local660 * arg1 >> 15;
										super.anInt9520 += local669 * arg1 >> 15;
									}
								} else if (local444.anInt1161 == 0) {
									local65 += (local441.anInt4796 - local545) * arg1;
									local82 += (local444.anInt1170 - local545) * arg1;
									local99 += (local441.anInt4791 - local545) * arg1;
									local303 = true;
								} else {
									super.anInt9517 += (local441.anInt4796 - local545) * arg1;
									super.anInt9523 += (local444.anInt1170 - local545) * arg1;
									super.anInt9520 += (local441.anInt4791 - local545) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray551 != null) {
			for (local314 = 0; local314 < local35.anIntArray551.length; local314++) {
				@Pc(751) Class6_Sub2_Sub11 local751 = (Class6_Sub2_Sub11) Static192.aClass223_1.method5319((long) local35.anIntArray551[local314]);
				while (local751 != null) {
					@Pc(755) Class42 local755 = local751.aClass42_1;
					local345 = local17 - local751.anInt4792;
					@Pc(765) int local765 = local22 - local751.anInt4798;
					local452 = local27 - local751.anInt4799;
					@Pc(783) long local783 = (long) (local345 * local345 + local765 * local765 + local452 * local452);
					if (local783 > local755.aLong35) {
						local751 = (Class6_Sub2_Sub11) Static192.aClass223_1.method5322();
					} else {
						local486 = (int) Math.sqrt((double) local783);
						if (local486 == 0) {
							local486 = 1;
						}
						local499 = (long) (local345 * local751.anInt4796 + local765 * local755.anInt1170 + local452 * local751.anInt4791) * 65535L / (long) (local755.anInt1169 * local486);
						if (local499 < (long) local755.anInt1158) {
							local751 = (Class6_Sub2_Sub11) Static192.aClass223_1.method5322();
						} else {
							local509 = 0;
							if (local755.anInt1167 == 1) {
								local509 = (local486 >> 4) * local755.anInt1163;
							} else if (local755.anInt1167 == 2) {
								local509 = (local486 >> 4) * (local486 >> 4) * local755.anInt1163;
							}
							if (local755.anInt1157 != 0) {
								@Pc(947) int local947 = (local345 << 15) / local486 * local755.anInt1169;
								@Pc(956) int local956 = (local765 << 15) / local486 * local755.anInt1169;
								local545 = (local452 << 15) / local486 * local755.anInt1169;
								if (local755.anInt1161 == 0) {
									local65 += local947 * arg1 >> 15;
									local82 += local956 * arg1 >> 15;
									local99 += local545 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt9517 += local947 * arg1 >> 15;
									super.anInt9523 += local956 * arg1 >> 15;
									super.anInt9520 += local545 * arg1 >> 15;
								}
							} else if (local755.anInt1161 == 0) {
								local65 += (local751.anInt4796 - local509) * arg1;
								local82 += (local755.anInt1170 - local509) * arg1;
								local99 += (local751.anInt4791 - local509) * arg1;
								local303 = true;
							} else {
								super.anInt9517 += (local751.anInt4796 - local509) * arg1;
								super.anInt9523 += (local755.anInt1170 - local509) * arg1;
								super.anInt9520 += (local751.anInt4791 - local509) * arg1;
							}
							local751 = (Class6_Sub2_Sub11) Static192.aClass223_1.method5322();
						}
					}
				}
			}
		}
		if (local35.anIntArray552 != null) {
			if (local35.anIntArray554 == null) {
				local35.anIntArray554 = new int[local35.anIntArray552.length];
				for (local314 = 0; local314 < local35.anIntArray552.length; local314++) {
					Static364.method5466(local35.anIntArray552[local314]);
					local35.anIntArray554[local314] = ((Class6_Sub35) Static315.aClass128_26.method3263((long) local35.anIntArray552[local314])).anInt6119;
				}
			}
			for (local314 = 0; local314 < local35.anIntArray554.length; local314++) {
				@Pc(1090) Class42 local1090 = Static339.aClass42Array1[local35.anIntArray554[local314]];
				if (local1090.anInt1161 == 0) {
					local65 += local1090.anInt1160 * arg1;
					local82 += local1090.anInt1170 * arg1;
					local99 += local1090.anInt1172 * arg1;
					local303 = true;
				} else {
					super.anInt9517 += local1090.anInt1160 * arg1;
					super.anInt9523 += local1090.anInt1170 * arg1;
					super.anInt9520 += local1090.anInt1172 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort120 = (short) local65;
					this.aShort119 = (short) local82;
					this.aShort122 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt9526 <<= 0x1;
			}
		}
		super.anInt9517 = (int) ((long) super.anInt9517 + ((long) this.aShort120 * (long) (this.anInt9526 << 2) >> 23) * (long) arg1);
		super.anInt9523 = (int) ((long) super.anInt9523 + ((long) this.aShort119 * (long) (this.anInt9526 << 2) >> 23) * (long) arg1);
		super.anInt9520 = (int) ((long) super.anInt9520 + ((long) this.aShort122 * (long) (this.anInt9526 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
	private void method7772() {
		@Pc(4) int local4 = this.aClass98_Sub7_1.aClass98_Sub3_6.anInt5241;
		if (this.aClass98_Sub7_1.aClass98_Sub3_6.aClass98_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass98_Sub7_1.aClass98_Sub3_6.aClass98_Sub1_Sub1_Sub1Array1[local4].method7774();
		}
		this.aClass98_Sub7_1.aClass98_Sub3_6.aClass98_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort121 = (short) this.aClass98_Sub7_1.aClass98_Sub3_6.anInt5241;
		this.aClass98_Sub7_1.aClass98_Sub3_6.anInt5241 = local4 + 1 & 0x1FFF;
		this.aClass98_Sub7_1.aClass40_8.method1131(this);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ul;IIIIIIIIIIIZZ)V")
	public void method7773(@OriginalArg(0) Class98_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass98_Sub7_1 = arg0;
		super.anInt9517 = arg1 << 12;
		super.anInt9523 = arg2 << 12;
		super.anInt9520 = arg3 << 12;
		super.anInt9521 = arg9;
		this.aShort118 = this.aShort117 = (short) arg8;
		super.anInt9516 = arg10;
		super.anInt9524 = arg11;
		super.aBoolean730 = arg13;
		this.aShort120 = (short) arg4;
		this.aShort119 = (short) arg5;
		this.aShort122 = (short) arg6;
		this.anInt9526 = arg7;
		super.aByte106 = this.aClass98_Sub7_1.aClass85_2.aByte26;
		this.method7772();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
	public void method7774() {
		this.aClass98_Sub7_1.aClass98_Sub3_6.aClass98_Sub1_Sub1_Sub1Array1[this.aShort121] = null;
		Static322.aClass98_Sub1_Sub1_Sub1Array2[Static536.anInt8903] = this;
		Static536.anInt8903 = Static536.anInt8903 + 1 & 0x3FF;
		this.method7855();
		this.method7764();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class26_Sub1_Sub1_Sub1 extends Class26_Sub1_Sub1 {

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt9224;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!ph;")
	public Class26_Sub7 aClass26_Sub7_1;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "S")
	private short aShort119;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	private int anInt9225;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ph;IIIIIIIIIIIZZ)V")
	public Class26_Sub1_Sub1_Sub1(@OriginalArg(0) Class26_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass26_Sub7_1 = arg0;
		super.anInt9214 = arg1 << 12;
		super.anInt9217 = arg2 << 12;
		super.anInt9213 = arg3 << 12;
		super.anInt9219 = arg9;
		this.aShort119 = this.aShort124 = (short) arg8;
		super.anInt9222 = arg10;
		super.anInt9221 = arg11;
		super.aBoolean637 = arg13;
		this.aShort122 = (short) arg4;
		this.aShort120 = (short) arg5;
		this.aShort123 = (short) arg6;
		this.anInt9225 = arg7;
		super.aByte105 = this.aClass26_Sub7_1.aClass181_2.aByte60;
		this.method7587();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	private void method7587() {
		@Pc(4) int local4 = this.aClass26_Sub7_1.aClass26_Sub3_6.anInt4305;
		if (this.aClass26_Sub7_1.aClass26_Sub3_6.aClass26_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass26_Sub7_1.aClass26_Sub3_6.aClass26_Sub1_Sub1_Sub1Array1[local4].method7588();
		}
		this.aClass26_Sub7_1.aClass26_Sub3_6.aClass26_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort121 = (short) this.aClass26_Sub7_1.aClass26_Sub3_6.anInt4305;
		this.aClass26_Sub7_1.aClass26_Sub3_6.anInt4305 = local4 + 1 & 0x1FFF;
		this.aClass26_Sub7_1.aClass8_6.method109(this);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
	public void method7588() {
		this.aClass26_Sub7_1.aClass26_Sub3_6.aClass26_Sub1_Sub1_Sub1Array1[this.aShort121] = null;
		Static533.aClass26_Sub1_Sub1_Sub1Array2[Static37.anInt736] = this;
		Static37.anInt736 = Static37.anInt736 + 1 & 0x3FF;
		this.method7575();
		this.method7579();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method7589(@OriginalArg(0) Class66 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt9214 >> Static41.anInt810 + 12;
		@Pc(13) int local13 = super.anInt9213 >> Static41.anInt810 + 12;
		@Pc(18) int local18 = super.anInt9217 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static173.anInt3719 || local13 < 0 || local13 >= Static357.anInt6212) {
			this.method7588();
			return;
		}
		@Pc(40) Class26_Sub3 local40 = this.aClass26_Sub7_1.aClass26_Sub3_6;
		@Pc(44) Class160 local44 = this.aClass26_Sub7_1.aClass160_1;
		@Pc(46) Class16[] local46 = Static112.aClass16Array3;
		@Pc(49) int local49 = local40.anInt4307;
		@Pc(58) Class100 local58 = Static309.aClass100ArrayArrayArray2[local40.anInt4307][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte34;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static562.anInt9418 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static41.anInt810);
		}
		if (local44.aBoolean340) {
			if (local44.anInt4536 == -1 && local18 > local70) {
				this.method7588();
				return;
			}
			if (local44.anInt4536 >= 0 && local18 > local46[local44.anInt4536].JA(local6, local13)) {
				this.method7588();
				return;
			}
			if (local44.anInt4528 == -1 && local18 < local84) {
				this.method7588();
				return;
			}
			if (local44.anInt4528 >= 0 && local18 < local46[local44.anInt4528 + 1].JA(local6, local13)) {
				this.method7588();
				return;
			}
		}
		if (local6 >= local40.anInt4311 && local6 <= local40.anInt4310 && local13 >= local40.anInt4309 && local13 <= local40.anInt4312 && local18 <= local70 && local18 >= local84) {
			local40.aClass42_2.aClass212_1.method4712(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static562.anInt9418 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean334 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method7588();
		} else if (local172 == Static562.anInt9418 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static41.anInt810) {
			this.method7588();
		} else {
			local58 = Static309.aClass100ArrayArrayArray2[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static309.aClass100ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static309.aClass100ArrayArrayArray2[0][local6][local13] = new Class100(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static309.aClass100ArrayArrayArray2[0][local6][local13].aClass100_1 != null;
				if (local172 == 3 && local268) {
					this.method7588();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static309.aClass100ArrayArrayArray2[local278][local6][local13] == null) {
						local58 = Static309.aClass100ArrayArrayArray2[local278][local6][local13] = new Class100(local278, local6, local13);
						if (local268) {
							local58.aByte34++;
						}
					}
				}
			}
			if (local44.aBoolean339) {
				@Pc(323) int local323 = super.anInt9214 >> 12;
				local278 = super.anInt9213 >> 12;
				@Pc(337) Class68 local337;
				if (local58.aClass10_Sub2_3 != null) {
					local337 = local58.aClass10_Sub2_3.method7731(arg0);
					if (local337 != null && local337.method2048(local18, local323, local278)) {
						this.method7588();
						return;
					}
				}
				if (local58.aClass10_Sub2_2 != null) {
					local337 = local58.aClass10_Sub2_2.method7731(arg0);
					if (local337 != null && local337.method2048(local18, local323, local278)) {
						this.method7588();
						return;
					}
				}
				if (local58.aClass10_Sub5_1 != null) {
					local337 = local58.aClass10_Sub5_1.method7731(arg0);
					if (local337 != null && local337.method2048(local18, local323, local278)) {
						this.method7588();
						return;
					}
				}
				for (@Pc(394) Class35 local394 = local58.aClass35_2; local394 != null; local394 = local394.aClass35_1) {
					@Pc(401) Class68 local401 = local394.aClass10_Sub1_1.method7731(arg0);
					if (local401 != null && local401.method2048(local18, local323, local278)) {
						this.method7588();
						return;
					}
				}
			}
			local40.aClass42_2.aClass212_1.method4712(this);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JI)V")
	public void method7590(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort124 = (short) (this.aShort124 - arg1);
		if (this.aShort124 <= 0) {
			this.method7588();
			return;
		}
		@Pc(17) int local17 = super.anInt9214 >> 12;
		@Pc(22) int local22 = super.anInt9217 >> 12;
		@Pc(27) int local27 = super.anInt9213 >> 12;
		@Pc(31) Class26_Sub3 local31 = this.aClass26_Sub7_1.aClass26_Sub3_6;
		@Pc(35) Class160 local35 = this.aClass26_Sub7_1.aClass160_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt4531 != 0) {
			if (this.aShort119 - this.aShort124 <= local35.anInt4547) {
				local65 = (super.anInt9219 >> 8 & 0xFF00) + (this.anInt9224 >> 16 & 0xFF) + local35.anInt4541 * arg1;
				local82 = (super.anInt9219 & 0xFF00) + (this.anInt9224 >> 8 & 0xFF) + local35.anInt4527 * arg1;
				local99 = ((super.anInt9219 & 0xFF) << 8) + (this.anInt9224 & 0xFF) + local35.anInt4516 * arg1;
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
				super.anInt9219 &= 0xFF000000;
				super.anInt9219 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt9224 &= 0xFF000000;
				this.anInt9224 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort119 - this.aShort124 <= local35.anInt4503) {
				local65 = (super.anInt9219 >> 16 & 0xFF00) + (this.anInt9224 >> 24 & 0xFF) + local35.anInt4523 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt9219 &= 0xFFFFFF;
				super.anInt9219 |= (local65 & 0xFF00) << 16;
				this.anInt9224 &= 0xFFFFFF;
				this.anInt9224 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4535 != -1 && this.aShort119 - this.aShort124 <= local35.anInt4546) {
			this.anInt9225 += local35.anInt4513 * arg1;
		}
		if (local35.anInt4510 != -1 && this.aShort119 - this.aShort124 <= local35.anInt4526) {
			super.anInt9222 += local35.anInt4519 * arg1;
		}
		local65 = this.aShort122;
		local82 = this.aShort120;
		local99 = this.aShort123;
		@Pc(303) boolean local303 = false;
		@Pc(314) int local314;
		@Pc(321) int local321;
		@Pc(328) int local328;
		@Pc(345) int local345;
		@Pc(353) long local353;
		if (local35.anInt4542 == 1) {
			local314 = local17 - this.aClass26_Sub7_1.aClass5_1.anInt58;
			local321 = local22 - this.aClass26_Sub7_1.aClass5_1.anInt59;
			local328 = local27 - this.aClass26_Sub7_1.aClass5_1.anInt63;
			local345 = (int) Math.sqrt((double) (local314 * local314 + local321 * local321 + local328 * local328)) >> 2;
			local353 = local35.anInt4504 * local345 * arg1;
			this.anInt9225 = (int) ((long) this.anInt9225 - ((long) this.anInt9225 * local353 >> 18));
		} else if (local35.anInt4542 == 2) {
			local314 = local17 - this.aClass26_Sub7_1.aClass5_1.anInt58;
			local321 = local22 - this.aClass26_Sub7_1.aClass5_1.anInt59;
			local328 = local27 - this.aClass26_Sub7_1.aClass5_1.anInt63;
			local345 = local314 * local314 + local321 * local321 + local328 * local328;
			local353 = local35.anInt4504 * local345 * arg1;
			this.anInt9225 = (int) ((long) this.anInt9225 - ((long) this.anInt9225 * local353 >> 28));
		}
		@Pc(452) int local452;
		@Pc(486) int local486;
		@Pc(499) long local499;
		@Pc(509) int local509;
		@Pc(545) int local545;
		if (local35.anIntArray405 != null) {
			@Pc(434) Class4 local434 = local31.aClass124_21.aClass4_90;
			for (@Pc(437) Class4 local437 = local434.aClass4_287; local437 != local434; local437 = local437.aClass4_287) {
				@Pc(441) Class4_Sub7_Sub10 local441 = (Class4_Sub7_Sub10) local437;
				@Pc(444) Class167 local444 = local441.aClass167_1;
				if (local444.anInt4716 != 1) {
					@Pc(450) boolean local450 = false;
					for (local452 = 0; local452 < local35.anIntArray405.length; local452++) {
						if (local35.anIntArray405[local452] == local444.anInt4717) {
							local450 = true;
							break;
						}
					}
					if (local450) {
						@Pc(476) int local476 = local17 - local441.anInt5235;
						@Pc(481) int local481 = local22 - local441.anInt5239;
						local486 = local27 - local441.anInt5232;
						local499 = local476 * local476 + local481 * local481 + local486 * local486;
						if (local499 <= local444.aLong122) {
							local509 = (int) Math.sqrt((double) local499);
							if (local509 == 0) {
								local509 = 1;
							}
							@Pc(537) long local537 = (long) (local476 * local441.anInt5237 + local481 * local444.anInt4725 + local486 * local441.anInt5238) * 65535L / (long) (local444.anInt4732 * local509);
							if (local537 >= (long) local444.anInt4721) {
								local545 = 0;
								if (local444.anInt4719 == 1) {
									local545 = (local509 >> 4) * local444.anInt4728;
								} else if (local444.anInt4719 == 2) {
									local545 = (local509 >> 4) * (local509 >> 4) * local444.anInt4728;
								}
								if (local444.anInt4727 != 0) {
									@Pc(651) int local651 = (local476 << 15) / local509 * local444.anInt4732;
									@Pc(660) int local660 = (local481 << 15) / local509 * local444.anInt4732;
									@Pc(669) int local669 = (local486 << 15) / local509 * local444.anInt4732;
									if (local444.anInt4729 == 0) {
										local65 += local651 * arg1 >> 15;
										local82 += local660 * arg1 >> 15;
										local99 += local669 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt9214 += local651 * arg1 >> 15;
										super.anInt9217 += local660 * arg1 >> 15;
										super.anInt9213 += local669 * arg1 >> 15;
									}
								} else if (local444.anInt4729 == 0) {
									local65 += (local441.anInt5237 - local545) * arg1;
									local82 += (local444.anInt4725 - local545) * arg1;
									local99 += (local441.anInt5238 - local545) * arg1;
									local303 = true;
								} else {
									super.anInt9214 += (local441.anInt5237 - local545) * arg1;
									super.anInt9217 += (local444.anInt4725 - local545) * arg1;
									super.anInt9213 += (local441.anInt5238 - local545) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray402 != null) {
			for (local314 = 0; local314 < local35.anIntArray402.length; local314++) {
				@Pc(751) Class4_Sub7_Sub10 local751 = (Class4_Sub7_Sub10) Static460.aClass176_1.method4107((long) local35.anIntArray402[local314]);
				while (local751 != null) {
					@Pc(755) Class167 local755 = local751.aClass167_1;
					local345 = local17 - local751.anInt5235;
					@Pc(765) int local765 = local22 - local751.anInt5239;
					local452 = local27 - local751.anInt5232;
					@Pc(783) long local783 = (long) (local345 * local345 + local765 * local765 + local452 * local452);
					if (local783 > local755.aLong122) {
						local751 = (Class4_Sub7_Sub10) Static460.aClass176_1.method4109();
					} else {
						local486 = (int) Math.sqrt((double) local783);
						if (local486 == 0) {
							local486 = 1;
						}
						local499 = (long) (local345 * local751.anInt5237 + local765 * local755.anInt4725 + local452 * local751.anInt5238) * 65535L / (long) (local755.anInt4732 * local486);
						if (local499 < (long) local755.anInt4721) {
							local751 = (Class4_Sub7_Sub10) Static460.aClass176_1.method4109();
						} else {
							local509 = 0;
							if (local755.anInt4719 == 1) {
								local509 = (local486 >> 4) * local755.anInt4728;
							} else if (local755.anInt4719 == 2) {
								local509 = (local486 >> 4) * (local486 >> 4) * local755.anInt4728;
							}
							if (local755.anInt4727 != 0) {
								@Pc(947) int local947 = (local345 << 15) / local486 * local755.anInt4732;
								@Pc(956) int local956 = (local765 << 15) / local486 * local755.anInt4732;
								local545 = (local452 << 15) / local486 * local755.anInt4732;
								if (local755.anInt4729 == 0) {
									local65 += local947 * arg1 >> 15;
									local82 += local956 * arg1 >> 15;
									local99 += local545 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt9214 += local947 * arg1 >> 15;
									super.anInt9217 += local956 * arg1 >> 15;
									super.anInt9213 += local545 * arg1 >> 15;
								}
							} else if (local755.anInt4729 == 0) {
								local65 += (local751.anInt5237 - local509) * arg1;
								local82 += (local755.anInt4725 - local509) * arg1;
								local99 += (local751.anInt5238 - local509) * arg1;
								local303 = true;
							} else {
								super.anInt9214 += (local751.anInt5237 - local509) * arg1;
								super.anInt9217 += (local755.anInt4725 - local509) * arg1;
								super.anInt9213 += (local751.anInt5238 - local509) * arg1;
							}
							local751 = (Class4_Sub7_Sub10) Static460.aClass176_1.method4109();
						}
					}
				}
			}
		}
		if (local35.anIntArray403 != null) {
			if (local35.anIntArray404 == null) {
				local35.anIntArray404 = new int[local35.anIntArray403.length];
				for (local314 = 0; local314 < local35.anIntArray403.length; local314++) {
					Static343.method5092(local35.anIntArray403[local314]);
					local35.anIntArray404[local314] = ((Class4_Sub33) Static29.aClass183_3.method4289((long) local35.anIntArray403[local314])).anInt6079;
				}
			}
			for (local314 = 0; local314 < local35.anIntArray404.length; local314++) {
				@Pc(1090) Class167 local1090 = Static598.aClass167Array1[local35.anIntArray404[local314]];
				if (local1090.anInt4729 == 0) {
					local65 += local1090.anInt4722 * arg1;
					local82 += local1090.anInt4725 * arg1;
					local99 += local1090.anInt4724 * arg1;
					local303 = true;
				} else {
					super.anInt9214 += local1090.anInt4722 * arg1;
					super.anInt9217 += local1090.anInt4725 * arg1;
					super.anInt9213 += local1090.anInt4724 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort122 = (short) local65;
					this.aShort120 = (short) local82;
					this.aShort123 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt9225 <<= 0x1;
			}
		}
		super.anInt9214 = (int) ((long) super.anInt9214 + ((long) this.aShort122 * (long) (this.anInt9225 << 2) >> 23) * (long) arg1);
		super.anInt9217 = (int) ((long) super.anInt9217 + ((long) this.aShort120 * (long) (this.anInt9225 << 2) >> 23) * (long) arg1);
		super.anInt9213 = (int) ((long) super.anInt9213 + ((long) this.aShort123 * (long) (this.anInt9225 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ph;IIIIIIIIIIIZZ)V")
	public void method7591(@OriginalArg(0) Class26_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass26_Sub7_1 = arg0;
		super.anInt9214 = arg1 << 12;
		super.anInt9217 = arg2 << 12;
		super.anInt9213 = arg3 << 12;
		super.anInt9219 = arg9;
		this.aShort119 = this.aShort124 = (short) arg8;
		super.anInt9222 = arg10;
		super.anInt9221 = arg11;
		super.aBoolean637 = arg13;
		this.aShort122 = (short) arg4;
		this.aShort120 = (short) arg5;
		this.aShort123 = (short) arg6;
		this.anInt9225 = arg7;
		super.aByte105 = this.aClass26_Sub7_1.aClass181_2.aByte60;
		this.method7587();
	}
}

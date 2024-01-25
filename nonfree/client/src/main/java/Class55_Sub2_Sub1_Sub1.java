import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class55_Sub2_Sub1_Sub1 extends Class55_Sub2_Sub1 {

	@OriginalMember(owner = "client!er", name = "L", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!er", name = "O", descriptor = "I")
	private int anInt2870;

	@OriginalMember(owner = "client!er", name = "N", descriptor = "Lclient!qj;")
	public Class55_Sub7 aClass55_Sub7_1;

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!er", name = "I", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!er", name = "J", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!er", name = "P", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!er", name = "K", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!er", name = "M", descriptor = "I")
	private int anInt2869;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!qj;IIIIIIIIIIIZZ)V")
	public Class55_Sub2_Sub1_Sub1(@OriginalArg(0) Class55_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass55_Sub7_1 = arg0;
		super.anInt2862 = arg1 << 12;
		super.anInt2858 = arg2 << 12;
		super.anInt2859 = arg3 << 12;
		super.anInt2864 = arg9;
		this.aShort29 = this.aShort34 = (short) arg8;
		super.anInt2865 = arg10;
		super.anInt2867 = arg11;
		super.aBoolean219 = arg13;
		this.aShort30 = (short) arg4;
		this.aShort33 = (short) arg5;
		this.aShort31 = (short) arg6;
		this.anInt2869 = arg7;
		super.aByte26 = this.aClass55_Sub7_1.aClass121_2.aByte30;
		this.method2494();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(JI)V")
	public void method2490(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort34 = (short) (this.aShort34 - arg1);
		if (this.aShort34 <= 0) {
			this.method2493();
			return;
		}
		@Pc(17) int local17 = super.anInt2862 >> 12;
		@Pc(22) int local22 = super.anInt2858 >> 12;
		@Pc(27) int local27 = super.anInt2859 >> 12;
		@Pc(31) Class55_Sub8 local31 = this.aClass55_Sub7_1.aClass55_Sub8_7;
		@Pc(35) Class144 local35 = this.aClass55_Sub7_1.aClass144_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3845 != 0) {
			if (this.aShort29 - this.aShort34 <= local35.anInt3805) {
				local65 = (super.anInt2864 >> 8 & 0xFF00) + (this.anInt2870 >> 16 & 0xFF) + local35.anInt3839 * arg1;
				local82 = (super.anInt2864 & 0xFF00) + (this.anInt2870 >> 8 & 0xFF) + local35.anInt3826 * arg1;
				local99 = ((super.anInt2864 & 0xFF) << 8) + (this.anInt2870 & 0xFF) + local35.anInt3830 * arg1;
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
				super.anInt2864 &= 0xFF000000;
				super.anInt2864 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2870 &= 0xFF000000;
				this.anInt2870 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort29 - this.aShort34 <= local35.anInt3811) {
				local65 = (super.anInt2864 >> 16 & 0xFF00) + (this.anInt2870 >> 24 & 0xFF) + local35.anInt3844 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2864 &= 0xFFFFFF;
				super.anInt2864 |= (local65 & 0xFF00) << 16;
				this.anInt2870 &= 0xFFFFFF;
				this.anInt2870 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3816 != -1 && this.aShort29 - this.aShort34 <= local35.anInt3847) {
			this.anInt2869 += local35.anInt3831 * arg1;
		}
		if (local35.anInt3820 != -1 && this.aShort29 - this.aShort34 <= local35.anInt3837) {
			super.anInt2865 += local35.anInt3838 * arg1;
		}
		local65 = this.aShort30;
		local82 = this.aShort33;
		local99 = this.aShort31;
		@Pc(303) boolean local303 = false;
		@Pc(314) int local314;
		@Pc(321) int local321;
		@Pc(328) int local328;
		@Pc(345) int local345;
		@Pc(353) long local353;
		if (local35.anInt3843 == 1) {
			local314 = local17 - this.aClass55_Sub7_1.aClass149_1.anInt3914;
			local321 = local22 - this.aClass55_Sub7_1.aClass149_1.anInt3919;
			local328 = local27 - this.aClass55_Sub7_1.aClass149_1.anInt3915;
			local345 = (int) Math.sqrt((double) (local314 * local314 + local321 * local321 + local328 * local328)) >> 2;
			local353 = local35.anInt3803 * local345 * arg1;
			this.anInt2869 = (int) ((long) this.anInt2869 - ((long) this.anInt2869 * local353 >> 18));
		} else if (local35.anInt3843 == 2) {
			local314 = local17 - this.aClass55_Sub7_1.aClass149_1.anInt3914;
			local321 = local22 - this.aClass55_Sub7_1.aClass149_1.anInt3919;
			local328 = local27 - this.aClass55_Sub7_1.aClass149_1.anInt3915;
			local345 = local314 * local314 + local321 * local321 + local328 * local328;
			local353 = local35.anInt3803 * local345 * arg1;
			this.anInt2869 = (int) ((long) this.anInt2869 - ((long) this.anInt2869 * local353 >> 28));
		}
		@Pc(452) int local452;
		@Pc(486) int local486;
		@Pc(499) long local499;
		@Pc(509) int local509;
		@Pc(545) int local545;
		if (local35.anIntArray269 != null) {
			@Pc(434) Class3 local434 = local31.aClass183_52.aClass3_161;
			for (@Pc(437) Class3 local437 = local434.aClass3_288; local437 != local434; local437 = local437.aClass3_288) {
				@Pc(441) Class3_Sub4_Sub1 local441 = (Class3_Sub4_Sub1) local437;
				@Pc(444) Class29 local444 = local441.aClass29_1;
				if (local444.anInt980 != 1) {
					@Pc(450) boolean local450 = false;
					for (local452 = 0; local452 < local35.anIntArray269.length; local452++) {
						if (local35.anIntArray269[local452] == local444.anInt995) {
							local450 = true;
							break;
						}
					}
					if (local450) {
						@Pc(476) int local476 = local17 - local441.anInt885;
						@Pc(481) int local481 = local22 - local441.anInt886;
						local486 = local27 - local441.anInt884;
						local499 = local476 * local476 + local481 * local481 + local486 * local486;
						if (local499 <= local444.aLong40) {
							local509 = (int) Math.sqrt((double) local499);
							if (local509 == 0) {
								local509 = 1;
							}
							@Pc(537) long local537 = (long) (local476 * local441.anInt882 + local481 * local444.anInt979 + local486 * local441.anInt883) * 65535L / (long) (local444.anInt989 * local509);
							if (local537 >= (long) local444.anInt987) {
								local545 = 0;
								if (local444.anInt991 == 1) {
									local545 = (local509 >> 4) * local444.anInt988;
								} else if (local444.anInt991 == 2) {
									local545 = (local509 >> 4) * (local509 >> 4) * local444.anInt988;
								}
								if (local444.anInt985 != 0) {
									@Pc(651) int local651 = (local476 << 15) / local509 * local444.anInt989;
									@Pc(660) int local660 = (local481 << 15) / local509 * local444.anInt989;
									@Pc(669) int local669 = (local486 << 15) / local509 * local444.anInt989;
									if (local444.anInt992 == 0) {
										local65 += local651 * arg1 >> 15;
										local82 += local660 * arg1 >> 15;
										local99 += local669 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2862 += local651 * arg1 >> 15;
										super.anInt2858 += local660 * arg1 >> 15;
										super.anInt2859 += local669 * arg1 >> 15;
									}
								} else if (local444.anInt992 == 0) {
									local65 += (local441.anInt882 - local545) * arg1;
									local82 += (local444.anInt979 - local545) * arg1;
									local99 += (local441.anInt883 - local545) * arg1;
									local303 = true;
								} else {
									super.anInt2862 += (local441.anInt882 - local545) * arg1;
									super.anInt2858 += (local444.anInt979 - local545) * arg1;
									super.anInt2859 += (local441.anInt883 - local545) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray267 != null) {
			for (local314 = 0; local314 < local35.anIntArray267.length; local314++) {
				@Pc(751) Class3_Sub4_Sub1 local751 = (Class3_Sub4_Sub1) Static547.aClass153_1.method3676((long) local35.anIntArray267[local314]);
				while (local751 != null) {
					@Pc(755) Class29 local755 = local751.aClass29_1;
					local345 = local17 - local751.anInt885;
					@Pc(765) int local765 = local22 - local751.anInt886;
					local452 = local27 - local751.anInt884;
					@Pc(783) long local783 = (long) (local345 * local345 + local765 * local765 + local452 * local452);
					if (local783 > local755.aLong40) {
						local751 = (Class3_Sub4_Sub1) Static547.aClass153_1.method3674();
					} else {
						local486 = (int) Math.sqrt((double) local783);
						if (local486 == 0) {
							local486 = 1;
						}
						local499 = (long) (local345 * local751.anInt882 + local765 * local755.anInt979 + local452 * local751.anInt883) * 65535L / (long) (local755.anInt989 * local486);
						if (local499 < (long) local755.anInt987) {
							local751 = (Class3_Sub4_Sub1) Static547.aClass153_1.method3674();
						} else {
							local509 = 0;
							if (local755.anInt991 == 1) {
								local509 = (local486 >> 4) * local755.anInt988;
							} else if (local755.anInt991 == 2) {
								local509 = (local486 >> 4) * (local486 >> 4) * local755.anInt988;
							}
							if (local755.anInt985 != 0) {
								@Pc(947) int local947 = (local345 << 15) / local486 * local755.anInt989;
								@Pc(956) int local956 = (local765 << 15) / local486 * local755.anInt989;
								local545 = (local452 << 15) / local486 * local755.anInt989;
								if (local755.anInt992 == 0) {
									local65 += local947 * arg1 >> 15;
									local82 += local956 * arg1 >> 15;
									local99 += local545 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2862 += local947 * arg1 >> 15;
									super.anInt2858 += local956 * arg1 >> 15;
									super.anInt2859 += local545 * arg1 >> 15;
								}
							} else if (local755.anInt992 == 0) {
								local65 += (local751.anInt882 - local509) * arg1;
								local82 += (local755.anInt979 - local509) * arg1;
								local99 += (local751.anInt883 - local509) * arg1;
								local303 = true;
							} else {
								super.anInt2862 += (local751.anInt882 - local509) * arg1;
								super.anInt2858 += (local755.anInt979 - local509) * arg1;
								super.anInt2859 += (local751.anInt883 - local509) * arg1;
							}
							local751 = (Class3_Sub4_Sub1) Static547.aClass153_1.method3674();
						}
					}
				}
			}
		}
		if (local35.anIntArray268 != null) {
			if (local35.anIntArray270 == null) {
				local35.anIntArray270 = new int[local35.anIntArray268.length];
				for (local314 = 0; local314 < local35.anIntArray268.length; local314++) {
					Static153.method2973(local35.anIntArray268[local314]);
					local35.anIntArray270[local314] = ((Class3_Sub48) Static486.aClass25_36.method946((long) local35.anIntArray268[local314])).anInt9989;
				}
			}
			for (local314 = 0; local314 < local35.anIntArray270.length; local314++) {
				@Pc(1090) Class29 local1090 = Static88.aClass29Array1[local35.anIntArray270[local314]];
				if (local1090.anInt992 == 0) {
					local65 += local1090.anInt983 * arg1;
					local82 += local1090.anInt979 * arg1;
					local99 += local1090.anInt994 * arg1;
					local303 = true;
				} else {
					super.anInt2862 += local1090.anInt983 * arg1;
					super.anInt2858 += local1090.anInt979 * arg1;
					super.anInt2859 += local1090.anInt994 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort30 = (short) local65;
					this.aShort33 = (short) local82;
					this.aShort31 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2869 <<= 0x1;
			}
		}
		super.anInt2862 = (int) ((long) super.anInt2862 + ((long) this.aShort30 * (long) (this.anInt2869 << 2) >> 23) * (long) arg1);
		super.anInt2858 = (int) ((long) super.anInt2858 + ((long) this.aShort33 * (long) (this.anInt2869 << 2) >> 23) * (long) arg1);
		super.anInt2859 = (int) ((long) super.anInt2859 + ((long) this.aShort31 * (long) (this.anInt2869 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!qj;IIIIIIIIIIIZZ)V")
	public void method2491(@OriginalArg(0) Class55_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass55_Sub7_1 = arg0;
		super.anInt2862 = arg1 << 12;
		super.anInt2858 = arg2 << 12;
		super.anInt2859 = arg3 << 12;
		super.anInt2864 = arg9;
		this.aShort29 = this.aShort34 = (short) arg8;
		super.anInt2865 = arg10;
		super.anInt2867 = arg11;
		super.aBoolean219 = arg13;
		this.aShort30 = (short) arg4;
		this.aShort33 = (short) arg5;
		this.aShort31 = (short) arg6;
		this.anInt2869 = arg7;
		super.aByte26 = this.aClass55_Sub7_1.aClass121_2.aByte30;
		this.method2494();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method2492(@OriginalArg(0) Class15 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2862 >> Static309.anInt6172 + 12;
		@Pc(13) int local13 = super.anInt2859 >> Static309.anInt6172 + 12;
		@Pc(18) int local18 = super.anInt2858 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static223.anInt4520 || local13 < 0 || local13 >= Static416.anInt10065) {
			this.method2493();
			return;
		}
		@Pc(40) Class55_Sub8 local40 = this.aClass55_Sub7_1.aClass55_Sub8_7;
		@Pc(44) Class144 local44 = this.aClass55_Sub7_1.aClass144_1;
		@Pc(46) Class4[] local46 = Static224.aClass4Array3;
		@Pc(49) int local49 = local40.anInt8693;
		@Pc(58) Class125 local58 = Static580.aClass125ArrayArrayArray3[local40.anInt8693][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte36;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static264.anInt8587 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static309.anInt6172);
		}
		if (local44.aBoolean294) {
			if (local44.anInt3814 == -1 && local18 > local70) {
				this.method2493();
				return;
			}
			if (local44.anInt3814 >= 0 && local18 > local46[local44.anInt3814].JA(local6, local13)) {
				this.method2493();
				return;
			}
			if (local44.anInt3821 == -1 && local18 < local84) {
				this.method2493();
				return;
			}
			if (local44.anInt3821 >= 0 && local18 < local46[local44.anInt3821 + 1].JA(local6, local13)) {
				this.method2493();
				return;
			}
		}
		if (local6 >= local40.anInt8694 && local6 <= local40.anInt8696 && local13 >= local40.anInt8697 && local13 <= local40.anInt8692 && local18 <= local70 && local18 >= local84) {
			local40.aClass274_2.aClass22_1.method893(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static264.anInt8587 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean299 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method2493();
		} else if (local172 == Static264.anInt8587 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static309.anInt6172) {
			this.method2493();
		} else {
			local58 = Static580.aClass125ArrayArrayArray3[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static580.aClass125ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static580.aClass125ArrayArrayArray3[0][local6][local13] = new Class125(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static580.aClass125ArrayArrayArray3[0][local6][local13].aClass125_1 != null;
				if (local172 == 3 && local268) {
					this.method2493();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static580.aClass125ArrayArrayArray3[local278][local6][local13] == null) {
						local58 = Static580.aClass125ArrayArrayArray3[local278][local6][local13] = new Class125(local278, local6, local13);
						if (local268) {
							local58.aByte36++;
						}
					}
				}
			}
			if (local44.aBoolean300) {
				@Pc(323) int local323 = super.anInt2862 >> 12;
				local278 = super.anInt2859 >> 12;
				@Pc(337) Class44 local337;
				if (local58.aClass2_Sub4_1 != null) {
					local337 = local58.aClass2_Sub4_1.method8385(arg0);
					if (local337 != null && local337.method1335(local18, local278, local323)) {
						this.method2493();
						return;
					}
				}
				if (local58.aClass2_Sub4_2 != null) {
					local337 = local58.aClass2_Sub4_2.method8385(arg0);
					if (local337 != null && local337.method1335(local18, local278, local323)) {
						this.method2493();
						return;
					}
				}
				if (local58.aClass2_Sub1_1 != null) {
					local337 = local58.aClass2_Sub1_1.method8385(arg0);
					if (local337 != null && local337.method1335(local18, local278, local323)) {
						this.method2493();
						return;
					}
				}
				for (@Pc(394) Class302 local394 = local58.aClass302_1; local394 != null; local394 = local394.aClass302_2) {
					@Pc(401) Class44 local401 = local394.aClass2_Sub2_1.method8385(arg0);
					if (local401 != null && local401.method1335(local18, local278, local323)) {
						this.method2493();
						return;
					}
				}
			}
			local40.aClass274_2.aClass22_1.method893(this);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()V")
	public void method2493() {
		this.aClass55_Sub7_1.aClass55_Sub8_7.aClass55_Sub2_Sub1_Sub1Array2[this.aShort32] = null;
		Static136.aClass55_Sub2_Sub1_Sub1Array1[Static159.anInt3430] = this;
		Static159.anInt3430 = Static159.anInt3430 + 1 & 0x3FF;
		this.method7112();
		this.method4577();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()V")
	private void method2494() {
		@Pc(4) int local4 = this.aClass55_Sub7_1.aClass55_Sub8_7.anInt8690;
		if (this.aClass55_Sub7_1.aClass55_Sub8_7.aClass55_Sub2_Sub1_Sub1Array2[local4] != null) {
			this.aClass55_Sub7_1.aClass55_Sub8_7.aClass55_Sub2_Sub1_Sub1Array2[local4].method2493();
		}
		this.aClass55_Sub7_1.aClass55_Sub8_7.aClass55_Sub2_Sub1_Sub1Array2[local4] = this;
		this.aShort32 = (short) this.aClass55_Sub7_1.aClass55_Sub8_7.anInt8690;
		this.aClass55_Sub7_1.aClass55_Sub8_7.anInt8690 = local4 + 1 & 0x1FFF;
		this.aClass55_Sub7_1.aClass134_8.method3236(this);
	}
}

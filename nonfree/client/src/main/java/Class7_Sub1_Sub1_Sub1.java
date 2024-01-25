import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class7_Sub1_Sub1_Sub1 extends Class7_Sub1_Sub1 {

	@OriginalMember(owner = "client!g", name = "K", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "Lclient!lk;")
	private Class7_Sub5 aClass7_Sub5_1;

	@OriginalMember(owner = "client!g", name = "M", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!lk;IIIIIIIIIIIZZ)V")
	public Class7_Sub1_Sub1_Sub1(@OriginalArg(0) Class7_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass7_Sub5_1 = arg0;
		super.anInt3263 = arg1 << 12;
		super.anInt3271 = arg2 << 12;
		super.anInt3272 = arg3 << 12;
		super.anInt3273 = arg9;
		this.aShort44 = this.aShort45 = (short) arg8;
		super.anInt3268 = arg10;
		super.anInt3264 = arg11;
		super.aBoolean266 = arg13;
		this.aShort47 = (short) arg4;
		this.aShort46 = (short) arg5;
		this.aShort42 = (short) arg6;
		this.anInt3274 = arg7;
		super.aByte43 = this.aClass7_Sub5_1.aClass142_2.aByte61;
		this.method2943();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
	public void method2942() {
		this.aClass7_Sub5_1.aClass7_Sub3_4.aClass7_Sub1_Sub1_Sub1Array2[this.aShort43] = null;
		Static175.aClass7_Sub1_Sub1_Sub1Array1[Static228.anInt4863] = this;
		Static228.anInt4863 = Static228.anInt4863 + 1 & 0x3FF;
		this.method7760();
		this.method7360();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "()V")
	private void method2943() {
		@Pc(4) int local4 = this.aClass7_Sub5_1.aClass7_Sub3_4.anInt5009;
		if (this.aClass7_Sub5_1.aClass7_Sub3_4.aClass7_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass7_Sub5_1.aClass7_Sub3_4.aClass7_Sub1_Sub1_Sub1Array2[local4].method2942();
		}
		this.aClass7_Sub5_1.aClass7_Sub3_4.aClass7_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort43 = (short) this.aClass7_Sub5_1.aClass7_Sub3_4.anInt5009;
		this.aClass7_Sub5_1.aClass7_Sub3_4.anInt5009 = local4 + 1 & 0x1FFF;
		this.aClass7_Sub5_1.aClass149_5.method3984(this);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method2944(@OriginalArg(0) Class42 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt3263 >> Static193.anInt4311 + 12;
		@Pc(13) int local13 = super.anInt3272 >> Static193.anInt4311 + 12;
		@Pc(18) int local18 = super.anInt3271 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static537.anInt9566 || local13 < 0 || local13 >= Static509.anInt9164) {
			this.method2942();
			return;
		}
		@Pc(40) Class7_Sub3 local40 = this.aClass7_Sub5_1.aClass7_Sub3_4;
		@Pc(44) Class282 local44 = this.aClass7_Sub5_1.aClass282_1;
		@Pc(46) Class215[] local46 = Static51.aClass215Array6;
		@Pc(49) int local49 = local40.anInt5015;
		@Pc(58) Class37 local58 = Static120.aClass37ArrayArrayArray1[local40.anInt5015][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte23;
		}
		@Pc(70) int local70 = local46[local49].ba(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static36.anInt8450 - 1) {
			local84 = local46[local49 + 1].ba(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static193.anInt4311);
		}
		if (local44.aBoolean595) {
			if (local44.anInt8383 == -1 && local18 > local70) {
				this.method2942();
				return;
			}
			if (local44.anInt8383 >= 0 && local18 > local46[local44.anInt8383].ba(local6, local13)) {
				this.method2942();
				return;
			}
			if (local44.anInt8375 == -1 && local18 < local84) {
				this.method2942();
				return;
			}
			if (local44.anInt8375 >= 0 && local18 < local46[local44.anInt8375 + 1].ba(local6, local13)) {
				this.method2942();
				return;
			}
		}
		if (local6 >= local40.anInt5014 && local6 <= local40.anInt5013 && local13 >= local40.anInt5012 && local13 <= local40.anInt5011 && local18 <= local70 && local18 >= local84) {
			local40.aClass136_2.aClass313_1.method7870(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static36.anInt8450 - 1; local172 > 0 && local18 > local46[local172].ba(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].ba(local6, local13)) {
			this.method2942();
		} else if (local172 == Static36.anInt8450 - 1 && local46[local172].ba(local6, local13) - local18 > 0x8 << Static193.anInt4311) {
			this.method2942();
		} else {
			local58 = Static120.aClass37ArrayArrayArray1[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static120.aClass37ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static120.aClass37ArrayArrayArray1[0][local6][local13] = new Class37(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static120.aClass37ArrayArrayArray1[0][local6][local13].aClass37_1 != null;
				if (local172 == 3 && local265) {
					this.method2942();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static120.aClass37ArrayArrayArray1[local275][local6][local13] == null) {
						local58 = Static120.aClass37ArrayArrayArray1[local275][local6][local13] = new Class37(local275, local6, local13);
						if (local265) {
							local58.aByte23++;
						}
					}
				}
			}
			if (local44.aBoolean601) {
				@Pc(320) int local320 = super.anInt3263 >> 12;
				local275 = super.anInt3272 >> 12;
				@Pc(334) Class218 local334;
				if (local58.aClass30_Sub2_2 != null) {
					local334 = local58.aClass30_Sub2_2.method7906(arg0);
					if (local334 != null && local334.method5242(local18, local320, local275)) {
						this.method2942();
						return;
					}
				}
				if (local58.aClass30_Sub2_1 != null) {
					local334 = local58.aClass30_Sub2_1.method7906(arg0);
					if (local334 != null && local334.method5242(local18, local320, local275)) {
						this.method2942();
						return;
					}
				}
				if (local58.aClass30_Sub3_1 != null) {
					local334 = local58.aClass30_Sub3_1.method7906(arg0);
					if (local334 != null && local334.method5242(local18, local320, local275)) {
						this.method2942();
						return;
					}
				}
				for (@Pc(391) Class243 local391 = local58.aClass243_3; local391 != null; local391 = local391.aClass243_11) {
					@Pc(398) Class218 local398 = local391.aClass30_Sub1_2.method7906(arg0);
					if (local398 != null && local398.method5242(local18, local320, local275)) {
						this.method2942();
						return;
					}
				}
			}
			if (local58.aClass136_1 == null) {
				local58.aClass136_1 = new Class136();
				local58.aByte24 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte24 != (byte) (arg1 & 0xFFL)) {
				local58.aClass136_1.aClass313_1.method7876();
				local58.aClass136_1.aBoolean340 = false;
				local58.aByte24 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass136_1.aClass313_1.method7870(this);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!lk;IIIIIIIIIIIZZ)V")
	public void method2945(@OriginalArg(0) Class7_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass7_Sub5_1 = arg0;
		super.anInt3263 = arg1 << 12;
		super.anInt3271 = arg2 << 12;
		super.anInt3272 = arg3 << 12;
		super.anInt3273 = arg9;
		this.aShort44 = this.aShort45 = (short) arg8;
		super.anInt3268 = arg10;
		super.anInt3264 = arg11;
		super.aBoolean266 = arg13;
		this.aShort47 = (short) arg4;
		this.aShort46 = (short) arg5;
		this.aShort42 = (short) arg6;
		this.anInt3274 = arg7;
		super.aByte43 = this.aClass7_Sub5_1.aClass142_2.aByte61;
		this.method2943();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)V")
	public void method2946(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort45 = (short) (this.aShort45 - arg1);
		if (this.aShort45 <= 0) {
			this.method2942();
			return;
		}
		@Pc(17) int local17 = super.anInt3263 >> 12;
		@Pc(22) int local22 = super.anInt3271 >> 12;
		@Pc(27) int local27 = super.anInt3272 >> 12;
		@Pc(31) Class7_Sub3 local31 = this.aClass7_Sub5_1.aClass7_Sub3_4;
		@Pc(35) Class282 local35 = this.aClass7_Sub5_1.aClass282_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt8414 != 0) {
			if (this.aShort44 - this.aShort45 <= local35.anInt8425) {
				local65 = (super.anInt3273 >> 8 & 0xFF00) + (this.anInt3275 >> 16 & 0xFF) + local35.anInt8386 * arg1;
				local82 = (super.anInt3273 & 0xFF00) + (this.anInt3275 >> 8 & 0xFF) + local35.anInt8380 * arg1;
				local99 = ((super.anInt3273 & 0xFF) << 8) + (this.anInt3275 & 0xFF) + local35.lb * arg1;
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
				super.anInt3273 &= 0xFF000000;
				super.anInt3273 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt3275 &= 0xFF000000;
				this.anInt3275 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort44 - this.aShort45 <= local35.anInt8382) {
				local65 = (super.anInt3273 >> 16 & 0xFF00) + (this.anInt3275 >> 24 & 0xFF) + local35.anInt8423 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt3273 &= 0xFFFFFF;
				super.anInt3273 |= (local65 & 0xFF00) << 16;
				this.anInt3275 &= 0xFFFFFF;
				this.anInt3275 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8401 != -1 && this.aShort44 - this.aShort45 <= local35.anInt8409) {
			this.anInt3274 += local35.anInt8399 * arg1;
		}
		if (local35.anInt8381 != -1 && this.aShort44 - this.aShort45 <= local35.anInt8378) {
			super.anInt3268 += local35.anInt8403 * arg1;
		}
		local65 = this.aShort47;
		local82 = this.aShort46;
		local99 = this.aShort42;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt8428 == 1) {
			local313 = local17 - this.aClass7_Sub5_1.anInt5537;
			local319 = local22 - this.aClass7_Sub5_1.anInt5532;
			local325 = local27 - this.aClass7_Sub5_1.anInt5519;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt8377 * local340 * arg1;
			this.anInt3274 = (int) ((long) this.anInt3274 - ((long) this.anInt3274 * local348 >> 18));
		} else if (local35.anInt8428 == 2) {
			local313 = local17 - this.aClass7_Sub5_1.anInt5537;
			local319 = local22 - this.aClass7_Sub5_1.anInt5532;
			local325 = local27 - this.aClass7_Sub5_1.anInt5519;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt8377 * local340 * arg1;
			this.anInt3274 = (int) ((long) this.anInt3274 - ((long) this.anInt3274 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray628 != null) {
			@Pc(426) Class12 local426 = local31.aClass73_43.aClass12_47;
			for (@Pc(429) Class12 local429 = local426.aClass12_283; local429 != local426; local429 = local429.aClass12_283) {
				@Pc(433) Class12_Sub4_Sub16 local433 = (Class12_Sub4_Sub16) local429;
				@Pc(436) Class102 local436 = local433.aClass102_1;
				if (local436.anInt3110 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray628.length; local444++) {
						if (local35.anIntArray628[local444] == local436.anInt3119) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt8053;
						@Pc(473) int local473 = local22 - local433.anInt8059;
						local478 = local27 - local433.anInt8054;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong89) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt8052 + local473 * local436.anInt3116 + local478 * local433.anInt8060) * 65535L / (long) (local436.anInt3106 * local501);
							if (local529 >= (long) local436.anInt3111) {
								local537 = 0;
								if (local436.anInt3117 == 1) {
									local537 = (local501 >> 4) * local436.anInt3113;
								} else if (local436.anInt3117 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3113;
								}
								if (local436.anInt3103 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3106;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3106;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3106;
									if (local436.anInt3109 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt3263 += local643 * arg1 >> 15;
										super.anInt3271 += local652 * arg1 >> 15;
										super.anInt3272 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3109 == 0) {
									local65 += (local433.anInt8052 - local537) * arg1;
									local82 += (local436.anInt3116 - local537) * arg1;
									local99 += (local433.anInt8060 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt3263 += (local433.anInt8052 - local537) * arg1;
									super.anInt3271 += (local436.anInt3116 - local537) * arg1;
									super.anInt3272 += (local433.anInt8060 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray629 != null) {
			for (local313 = 0; local313 < local35.anIntArray629.length; local313++) {
				@Pc(743) Class12_Sub4_Sub16 local743 = (Class12_Sub4_Sub16) Static271.aClass222_1.method5410((long) local35.anIntArray629[local313]);
				while (local743 != null) {
					@Pc(747) Class102 local747 = local743.aClass102_1;
					local340 = local17 - local743.anInt8053;
					@Pc(757) int local757 = local22 - local743.anInt8059;
					local444 = local27 - local743.anInt8054;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong89) {
						local743 = (Class12_Sub4_Sub16) Static271.aClass222_1.method5408();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt8052 + local757 * local747.anInt3116 + local444 * local743.anInt8060) * 65535L / (long) (local747.anInt3106 * local478);
						if (local491 < (long) local747.anInt3111) {
							local743 = (Class12_Sub4_Sub16) Static271.aClass222_1.method5408();
						} else {
							local501 = 0;
							if (local747.anInt3117 == 1) {
								local501 = (local478 >> 4) * local747.anInt3113;
							} else if (local747.anInt3117 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3113;
							}
							if (local747.anInt3103 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3106;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3106;
								local537 = (local444 << 15) / local478 * local747.anInt3106;
								if (local747.anInt3109 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt3263 += local939 * arg1 >> 15;
									super.anInt3271 += local948 * arg1 >> 15;
									super.anInt3272 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3109 == 0) {
								local65 += (local743.anInt8052 - local501) * arg1;
								local82 += (local747.anInt3116 - local501) * arg1;
								local99 += (local743.anInt8060 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt3263 += (local743.anInt8052 - local501) * arg1;
								super.anInt3271 += (local747.anInt3116 - local501) * arg1;
								super.anInt3272 += (local743.anInt8060 - local501) * arg1;
							}
							local743 = (Class12_Sub4_Sub16) Static271.aClass222_1.method5408();
						}
					}
				}
			}
		}
		if (local35.anIntArray627 != null) {
			if (local35.anIntArray630 == null) {
				local35.anIntArray630 = new int[local35.anIntArray627.length];
				for (local313 = 0; local313 < local35.anIntArray627.length; local313++) {
					Static10.method290(local35.anIntArray627[local313]);
					local35.anIntArray630[local313] = ((Class12_Sub18) Static72.aClass68_12.method1917((long) local35.anIntArray627[local313])).anInt3978;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray630.length; local313++) {
				@Pc(1082) Class102 local1082 = Static206.aClass102Array139[local35.anIntArray630[local313]];
				if (local1082.anInt3109 == 0) {
					local65 += local1082.anInt3115 * arg1;
					local82 += local1082.anInt3116 * arg1;
					local99 += local1082.anInt3105 * arg1;
					local303 = true;
				} else {
					super.anInt3263 += local1082.anInt3115 * arg1;
					super.anInt3271 += local1082.anInt3116 * arg1;
					super.anInt3272 += local1082.anInt3105 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort47 = (short) local65;
					this.aShort46 = (short) local82;
					this.aShort42 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt3274 <<= 0x1;
			}
		}
		super.anInt3263 = (int) ((long) super.anInt3263 + ((long) this.aShort47 * (long) this.anInt3274 >> 23) * (long) arg1);
		super.anInt3271 = (int) ((long) super.anInt3271 + ((long) this.aShort46 * (long) this.anInt3274 >> 23) * (long) arg1);
		super.anInt3272 = (int) ((long) super.anInt3272 + ((long) this.aShort42 * (long) this.anInt3274 >> 23) * (long) arg1);
	}
}

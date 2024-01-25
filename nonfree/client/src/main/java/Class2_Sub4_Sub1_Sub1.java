import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub4_Sub1_Sub1 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
	private int anInt5119;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Lclient!ta;")
	public Class2_Sub9 aClass2_Sub9_1;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!ta;IIIIIIIIIIIZZ)V")
	public Class2_Sub4_Sub1_Sub1(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass2_Sub9_1 = arg0;
		super.anInt5115 = arg1 << 12;
		super.anInt5118 = arg2 << 12;
		super.anInt5117 = arg3 << 12;
		super.anInt5114 = arg9;
		this.aShort64 = this.aShort65 = (short) arg8;
		super.anInt5113 = arg10;
		super.anInt5116 = arg11;
		super.aBoolean448 = arg13;
		this.aShort66 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt5120 = arg7;
		super.aByte55 = this.aClass2_Sub9_1.aClass18_2.aByte1;
		this.method4333();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
	public void method4331(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort65 = (short) (this.aShort65 - arg1);
		if (this.aShort65 <= 0) {
			this.method4335();
			return;
		}
		@Pc(17) int local17 = super.anInt5115 >> 12;
		@Pc(22) int local22 = super.anInt5118 >> 12;
		@Pc(27) int local27 = super.anInt5117 >> 12;
		@Pc(31) Class2_Sub2 local31 = this.aClass2_Sub9_1.aClass2_Sub2_7;
		@Pc(35) Class125 local35 = this.aClass2_Sub9_1.aClass125_1;
		if (local35.anInt4664 != 0) {
			@Pc(65) int local65;
			if (this.aShort64 - this.aShort65 <= local35.anInt4668) {
				local65 = (super.anInt5114 >> 8 & 0xFF00) + (this.anInt5119 >> 16 & 0xFF) + local35.anInt4697 * arg1;
				@Pc(82) int local82 = (super.anInt5114 & 0xFF00) + (this.anInt5119 >> 8 & 0xFF) + local35.anInt4682 * arg1;
				@Pc(99) int local99 = ((super.anInt5114 & 0xFF) << 8) + (this.anInt5119 & 0xFF) + local35.anInt4674 * arg1;
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
				super.anInt5114 &= 0xFF000000;
				super.anInt5114 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5119 &= 0xFF000000;
				this.anInt5119 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort64 - this.aShort65 <= local35.anInt4698) {
				local65 = (super.anInt5114 >> 16 & 0xFF00) + (this.anInt5119 >> 24 & 0xFF) + local35.anInt4707 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5114 &= 0xFFFFFF;
				super.anInt5114 |= (local65 & 0xFF00) << 16;
				this.anInt5119 &= 0xFFFFFF;
				this.anInt5119 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4704 != -1 && this.aShort64 - this.aShort65 <= local35.anInt4710) {
			this.anInt5120 += local35.anInt4665 * arg1;
		}
		if (local35.anInt4672 != -1 && this.aShort64 - this.aShort65 <= local35.anInt4679) {
			super.anInt5113 += local35.anInt4705 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort66;
		@Pc(300) double local300 = (double) this.aShort67;
		@Pc(304) double local304 = (double) this.aShort68;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt4681 == 1) {
			local317 = local17 - this.aClass2_Sub9_1.aClass191_1.anInt6123;
			local324 = local22 - this.aClass2_Sub9_1.aClass191_1.anInt6129;
			local331 = local27 - this.aClass2_Sub9_1.aClass191_1.anInt6130;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt4708 * local348 * arg1;
			this.anInt5120 = (int) ((long) this.anInt5120 - ((long) this.anInt5120 * local356 >> 18));
		} else if (local35.anInt4681 == 2) {
			local317 = local17 - this.aClass2_Sub9_1.aClass191_1.anInt6123;
			local324 = local22 - this.aClass2_Sub9_1.aClass191_1.anInt6129;
			local331 = local27 - this.aClass2_Sub9_1.aClass191_1.anInt6130;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt4708 * local348 * arg1;
			this.anInt5120 = (int) ((long) this.anInt5120 - ((long) this.anInt5120 * local356 >> 28));
		}
		if (local35.anIntArray246 != null) {
			@Pc(437) Class3 local437 = local31.aClass276_1.aClass3_231;
			for (@Pc(440) Class3 local440 = local437.aClass3_300; local440 != local437; local440 = local440.aClass3_300) {
				@Pc(444) Class3_Sub1_Sub15 local444 = (Class3_Sub1_Sub15) local440;
				@Pc(447) Class37 local447 = local444.aClass37_1;
				if (local447.anInt1080 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray246.length; local455++) {
						if (local35.anIntArray246[local455] == local447.anInt1076) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt7009);
						@Pc(486) double local486 = (double) (local22 - local444.anInt7011);
						@Pc(492) double local492 = (double) (local27 - local444.anInt7015);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong27)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt7007 + local486 * (double) local447.anInt1088 + local492 * (double) local444.anInt7013) * 65535.0D / ((double) local447.anInt1091 * local513);
							if (!(local545 < (double) local447.anInt1075)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt1077 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt1074;
								} else if (local447.anInt1077 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt1074;
								}
								if (local447.anInt1082 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt1091;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt1091;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt1091;
									if (local447.anInt1084 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt5115 = (int) ((double) super.anInt5115 + local678 * (double) arg1);
										super.anInt5118 = (int) ((double) super.anInt5118 + local686 * (double) arg1);
										super.anInt5117 = (int) ((double) super.anInt5117 + local694 * (double) arg1);
									}
								} else if (local447.anInt1084 == 0) {
									local296 += ((double) local444.anInt7007 - local553) * (double) arg1;
									local300 += ((double) local447.anInt1088 - local553) * (double) arg1;
									local304 += ((double) local444.anInt7013 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt5115 = (int) ((double) super.anInt5115 + ((double) local444.anInt7007 - local553) * (double) arg1);
									super.anInt5118 = (int) ((double) super.anInt5118 + ((double) local447.anInt1088 - local553) * (double) arg1);
									super.anInt5117 = (int) ((double) super.anInt5117 + ((double) local444.anInt7013 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray247 != null) {
			for (local317 = 0; local317 < local35.anIntArray247.length; local317++) {
				@Pc(776) Class3_Sub1_Sub15 local776 = (Class3_Sub1_Sub15) Static55.aClass293_1.method7248((long) local35.anIntArray247[local317]);
				while (local776 != null) {
					@Pc(780) Class37 local780 = local776.aClass37_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt7009);
					@Pc(792) double local792 = (double) (local22 - local776.anInt7011);
					@Pc(798) double local798 = (double) (local27 - local776.anInt7015);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong27) {
						local776 = (Class3_Sub1_Sub15) Static55.aClass293_1.method7242();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt7007 + local792 * (double) local780.anInt1088 + local798 * (double) local776.anInt7013) * 65535.0D / ((double) local780.anInt1091 * local825);
						if (local857 < (double) local780.anInt1075) {
							local776 = (Class3_Sub1_Sub15) Static55.aClass293_1.method7242();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt1077 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt1074;
							} else if (local780.anInt1077 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt1074;
							}
							if (local780.anInt1082 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt1091;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt1091;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt1091;
								if (local780.anInt1084 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt5115 = (int) ((double) super.anInt5115 + local996 * (double) arg1);
									super.anInt5118 = (int) ((double) super.anInt5118 + local1004 * (double) arg1);
									super.anInt5117 = (int) ((double) super.anInt5117 + local1012 * (double) arg1);
								}
							} else if (local780.anInt1084 == 0) {
								local296 += ((double) local776.anInt7007 - local871) * (double) arg1;
								local300 += ((double) local780.anInt1088 - local871) * (double) arg1;
								local304 += ((double) local776.anInt7013 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt5115 = (int) ((double) super.anInt5115 + ((double) local776.anInt7007 - local871) * (double) arg1);
								super.anInt5118 = (int) ((double) super.anInt5118 + ((double) local780.anInt1088 - local871) * (double) arg1);
								super.anInt5117 = (int) ((double) super.anInt5117 + ((double) local776.anInt7013 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub1_Sub15) Static55.aClass293_1.method7242();
						}
					}
				}
			}
		}
		if (local35.anIntArray249 != null) {
			if (local35.anIntArray248 == null) {
				local35.anIntArray248 = new int[local35.anIntArray249.length];
				for (local317 = 0; local317 < local35.anIntArray249.length; local317++) {
					Static187.method3364(local35.anIntArray249[local317]);
					local35.anIntArray248[local317] = ((Class3_Sub8) Static598.aClass307_52.method7424((long) local35.anIntArray249[local317])).anInt706;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray248.length; local317++) {
				@Pc(1137) Class37 local1137 = Static55.aClass37Array1[local35.anIntArray248[local317]];
				if (local1137.anInt1084 == 0) {
					local296 += local1137.anInt1087 * arg1;
					local300 += local1137.anInt1088 * arg1;
					local304 += local1137.anInt1090 * arg1;
					local306 = true;
				} else {
					super.anInt5115 += local1137.anInt1087 * arg1;
					super.anInt5118 += local1137.anInt1088 * arg1;
					super.anInt5117 += local1137.anInt1090 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort66 = (short) local296;
					this.aShort67 = (short) local300;
					this.aShort68 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt5120 <<= 0x1;
			}
		}
		super.anInt5115 = (int) ((long) super.anInt5115 + ((long) this.aShort66 * (long) (this.anInt5120 << 2) >> 23) * (long) arg1);
		super.anInt5118 = (int) ((long) super.anInt5118 + ((long) this.aShort67 * (long) (this.anInt5120 << 2) >> 23) * (long) arg1);
		super.anInt5117 = (int) ((long) super.anInt5117 + ((long) this.aShort68 * (long) (this.anInt5120 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method4332(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5115 >> Static276.anInt5846 + 12;
		@Pc(13) int local13 = super.anInt5117 >> Static276.anInt5846 + 12;
		@Pc(18) int local18 = super.anInt5118 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static642.anInt10523 || local13 < 0 || local13 >= Static158.anInt3845) {
			this.method4335();
			return;
		}
		@Pc(40) Class2_Sub2 local40 = this.aClass2_Sub9_1.aClass2_Sub2_7;
		@Pc(44) Class125 local44 = this.aClass2_Sub9_1.aClass125_1;
		@Pc(46) Class274[] local46 = Static500.aClass274Array2;
		@Pc(49) int local49 = local40.anInt163;
		@Pc(58) Class106 local58 = Static170.aClass106ArrayArrayArray1[local40.anInt163][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte46;
		}
		@Pc(71) int local71 = local46[local49].method8041(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static626.anInt10336 - 1) {
			local86 = local46[local49 + 1].method8041(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static276.anInt5846);
		}
		if (local44.aBoolean409) {
			if (local44.anInt4693 == -1 && local18 > local71) {
				this.method4335();
				return;
			}
			if (local44.anInt4693 >= 0 && local18 > local46[local44.anInt4693].method8041(local6, local13)) {
				this.method4335();
				return;
			}
			if (local44.anInt4701 == -1 && local18 < local86) {
				this.method4335();
				return;
			}
			if (local44.anInt4701 >= 0 && local18 < local46[local44.anInt4701 + 1].method8041(local6, local13)) {
				this.method4335();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static626.anInt10336 - 1; local154 > 0 && local18 > local46[local154].method8041(local6, local13); local154--) {
		}
		if (local44.aBoolean412 && local154 == 0 && local18 > local46[0].method8041(local6, local13)) {
			this.method4335();
		} else if (local154 == Static626.anInt10336 - 1 && local46[local154].method8041(local6, local13) - local18 > 0x8 << Static276.anInt5846) {
			this.method4335();
		} else {
			local58 = Static170.aClass106ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static170.aClass106ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static170.aClass106ArrayArrayArray1[0][local6][local13] = new Class106(0);
				}
				@Pc(251) boolean local251 = Static170.aClass106ArrayArrayArray1[0][local6][local13].aClass106_1 != null;
				if (local154 == 3 && local251) {
					this.method4335();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static170.aClass106ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static170.aClass106ArrayArrayArray1[local261][local6][local13] = new Class106(local261);
						if (local251) {
							local58.aByte46++;
						}
					}
				}
			}
			if (local44.aBoolean403) {
				@Pc(304) int local304 = super.anInt5115 >> 12;
				local261 = super.anInt5117 >> 12;
				@Pc(318) Class332 local318;
				if (local58.aClass2_Sub3_Sub2_2 != null) {
					local318 = local58.aClass2_Sub3_Sub2_2.method8572(arg0);
					if (local318 != null && local318.method7993(local18, local261, local304)) {
						this.method4335();
						return;
					}
				}
				if (local58.aClass2_Sub3_Sub2_1 != null) {
					local318 = local58.aClass2_Sub3_Sub2_1.method8572(arg0);
					if (local318 != null && local318.method7993(local18, local261, local304)) {
						this.method4335();
						return;
					}
				}
				if (local58.aClass2_Sub3_Sub5_1 != null) {
					local318 = local58.aClass2_Sub3_Sub5_1.method8572(arg0);
					if (local318 != null && local318.method7993(local18, local261, local304)) {
						this.method4335();
						return;
					}
				}
				for (@Pc(375) Class243 local375 = local58.aClass243_1; local375 != null; local375 = local375.aClass243_3) {
					@Pc(382) Class332 local382 = local375.aClass2_Sub3_Sub1_1.method8572(arg0);
					if (local382 != null && local382.method7993(local18, local261, local304)) {
						this.method4335();
						return;
					}
				}
			}
			local40.aClass40_1.aClass177_1.method4994(this);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	private void method4333() {
		@Pc(4) int local4 = this.aClass2_Sub9_1.aClass2_Sub2_7.anInt161;
		if (this.aClass2_Sub9_1.aClass2_Sub2_7.aClass2_Sub4_Sub1_Sub1Array1[local4] != null) {
			this.aClass2_Sub9_1.aClass2_Sub2_7.aClass2_Sub4_Sub1_Sub1Array1[local4].method4335();
		}
		this.aClass2_Sub9_1.aClass2_Sub2_7.aClass2_Sub4_Sub1_Sub1Array1[local4] = this;
		this.aShort69 = (short) this.aClass2_Sub9_1.aClass2_Sub2_7.anInt161;
		this.aClass2_Sub9_1.aClass2_Sub2_7.anInt161 = local4 + 1 & 0x1FFF;
		this.aClass2_Sub9_1.aClass375_9.method8639(this);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ta;IIIIIIIIIIIZZ)V")
	public void method4334(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass2_Sub9_1 = arg0;
		super.anInt5115 = arg1 << 12;
		super.anInt5118 = arg2 << 12;
		super.anInt5117 = arg3 << 12;
		super.anInt5114 = arg9;
		this.aShort64 = this.aShort65 = (short) arg8;
		super.anInt5113 = arg10;
		super.anInt5116 = arg11;
		super.aBoolean448 = arg13;
		this.aShort66 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt5120 = arg7;
		super.aByte55 = this.aClass2_Sub9_1.aClass18_2.aByte1;
		this.method4333();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
	public void method4335() {
		this.aClass2_Sub9_1.aClass2_Sub2_7.aClass2_Sub4_Sub1_Sub1Array1[this.aShort69] = null;
		Static267.aClass2_Sub4_Sub1_Sub1Array2[Static330.anInt6599] = this;
		Static330.anInt6599 = Static330.anInt6599 + 1 & 0x3FF;
		this.method8558();
		this.method7028();
	}
}

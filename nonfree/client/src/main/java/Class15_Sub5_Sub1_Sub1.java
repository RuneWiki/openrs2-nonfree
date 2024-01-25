import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class15_Sub5_Sub1_Sub1 extends Class15_Sub5_Sub1 {

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
	private int anInt3834;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "Lclient!co;")
	public Class15_Sub2 aClass15_Sub2_1;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	private int anInt3833;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!co;IIIIIIIIIIIZZ)V")
	public Class15_Sub5_Sub1_Sub1(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass15_Sub2_1 = arg0;
		super.anInt3827 = arg1 << 12;
		super.anInt3830 = arg2 << 12;
		super.anInt3826 = arg3 << 12;
		super.anInt3828 = arg9;
		this.aShort42 = this.aShort40 = (short) arg8;
		super.anInt3822 = arg10;
		super.anInt3824 = arg11;
		super.aBoolean281 = arg13;
		this.aShort41 = (short) arg4;
		this.aShort38 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt3833 = arg7;
		super.aByte45 = this.aClass15_Sub2_1.aClass219_1.aByte69;
		this.method3102();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	public void method3099() {
		this.aClass15_Sub2_1.aClass15_Sub8_3.aClass15_Sub5_Sub1_Sub1Array2[this.aShort37] = null;
		Static78.aClass15_Sub5_Sub1_Sub1Array1[Static126.anInt3374] = this;
		Static126.anInt3374 = Static126.anInt3374 + 1 & 0x3FF;
		this.method8314();
		this.method8189();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method3100(@OriginalArg(0) Class16 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt3827 >> Static172.anInt4156 + 12;
		@Pc(13) int local13 = super.anInt3826 >> Static172.anInt4156 + 12;
		@Pc(18) int local18 = super.anInt3830 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static489.anInt8688 || local13 < 0 || local13 >= Static596.anInt10195) {
			this.method3099();
			return;
		}
		@Pc(40) Class15_Sub8 local40 = this.aClass15_Sub2_1.aClass15_Sub8_3;
		@Pc(44) Class125 local44 = this.aClass15_Sub2_1.aClass125_1;
		@Pc(46) Class86[] local46 = Static34.aClass86Array5;
		@Pc(49) int local49 = local40.anInt7891;
		@Pc(58) Class56 local58 = Static405.aClass56ArrayArrayArray2[local40.anInt7891][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte22;
		}
		@Pc(71) int local71 = local46[local49].method8086(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static192.anInt4507 - 1) {
			local86 = local46[local49 + 1].method8086(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static172.anInt4156);
		}
		if (local44.aBoolean326) {
			if (local44.anInt4431 == -1 && local18 > local71) {
				this.method3099();
				return;
			}
			if (local44.anInt4431 >= 0 && local18 > local46[local44.anInt4431].method8086(local13, local6)) {
				this.method3099();
				return;
			}
			if (local44.anInt4469 == -1 && local18 < local86) {
				this.method3099();
				return;
			}
			if (local44.anInt4469 >= 0 && local18 < local46[local44.anInt4469 + 1].method8086(local13, local6)) {
				this.method3099();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static192.anInt4507 - 1; local154 > 0 && local18 > local46[local154].method8086(local13, local6); local154--) {
		}
		if (local44.aBoolean327 && local154 == 0 && local18 > local46[0].method8086(local13, local6)) {
			this.method3099();
		} else if (local154 == Static192.anInt4507 - 1 && local46[local154].method8086(local13, local6) - local18 > 0x8 << Static172.anInt4156) {
			this.method3099();
		} else {
			local58 = Static405.aClass56ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static405.aClass56ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static405.aClass56ArrayArrayArray2[0][local6][local13] = new Class56(0);
				}
				@Pc(251) boolean local251 = Static405.aClass56ArrayArrayArray2[0][local6][local13].aClass56_1 != null;
				if (local154 == 3 && local251) {
					this.method3099();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static405.aClass56ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static405.aClass56ArrayArrayArray2[local261][local6][local13] = new Class56(local261);
						if (local251) {
							local58.aByte22++;
						}
					}
				}
			}
			if (local44.aBoolean325) {
				@Pc(304) int local304 = super.anInt3827 >> 12;
				local261 = super.anInt3826 >> 12;
				@Pc(318) Class191 local318;
				if (local58.aClass15_Sub1_Sub4_2 != null) {
					local318 = local58.aClass15_Sub1_Sub4_2.method8319(arg0);
					if (local318 != null && local318.method4923(local304, local261, local18)) {
						this.method3099();
						return;
					}
				}
				if (local58.aClass15_Sub1_Sub4_1 != null) {
					local318 = local58.aClass15_Sub1_Sub4_1.method8319(arg0);
					if (local318 != null && local318.method4923(local304, local261, local18)) {
						this.method3099();
						return;
					}
				}
				if (local58.aClass15_Sub1_Sub3_1 != null) {
					local318 = local58.aClass15_Sub1_Sub3_1.method8319(arg0);
					if (local318 != null && local318.method4923(local304, local261, local18)) {
						this.method3099();
						return;
					}
				}
				for (@Pc(375) Class152 local375 = local58.aClass152_2; local375 != null; local375 = local375.aClass152_3) {
					@Pc(382) Class191 local382 = local375.aClass15_Sub1_Sub2_1.method8319(arg0);
					if (local382 != null && local382.method4923(local304, local261, local18)) {
						this.method3099();
						return;
					}
				}
			}
			local40.aClass250_1.aClass131_1.method3729(this);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!co;IIIIIIIIIIIZZ)V")
	public void method3101(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass15_Sub2_1 = arg0;
		super.anInt3827 = arg1 << 12;
		super.anInt3830 = arg2 << 12;
		super.anInt3826 = arg3 << 12;
		super.anInt3828 = arg9;
		this.aShort42 = this.aShort40 = (short) arg8;
		super.anInt3822 = arg10;
		super.anInt3824 = arg11;
		super.aBoolean281 = arg13;
		this.aShort41 = (short) arg4;
		this.aShort38 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt3833 = arg7;
		super.aByte45 = this.aClass15_Sub2_1.aClass219_1.aByte69;
		this.method3102();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()V")
	private void method3102() {
		@Pc(4) int local4 = this.aClass15_Sub2_1.aClass15_Sub8_3.anInt7888;
		if (this.aClass15_Sub2_1.aClass15_Sub8_3.aClass15_Sub5_Sub1_Sub1Array2[local4] != null) {
			this.aClass15_Sub2_1.aClass15_Sub8_3.aClass15_Sub5_Sub1_Sub1Array2[local4].method3099();
		}
		this.aClass15_Sub2_1.aClass15_Sub8_3.aClass15_Sub5_Sub1_Sub1Array2[local4] = this;
		this.aShort37 = (short) this.aClass15_Sub2_1.aClass15_Sub8_3.anInt7888;
		this.aClass15_Sub2_1.aClass15_Sub8_3.anInt7888 = local4 + 1 & 0x1FFF;
		this.aClass15_Sub2_1.aClass123_3.method3539(this);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(JI)V")
	public void method3103(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort40 = (short) (this.aShort40 - arg1);
		if (this.aShort40 <= 0) {
			this.method3099();
			return;
		}
		@Pc(17) int local17 = super.anInt3827 >> 12;
		@Pc(22) int local22 = super.anInt3830 >> 12;
		@Pc(27) int local27 = super.anInt3826 >> 12;
		@Pc(31) Class15_Sub8 local31 = this.aClass15_Sub2_1.aClass15_Sub8_3;
		@Pc(35) Class125 local35 = this.aClass15_Sub2_1.aClass125_1;
		if (local35.anInt4447 != 0) {
			@Pc(65) int local65;
			if (this.aShort42 - this.aShort40 <= local35.anInt4434) {
				local65 = (super.anInt3828 >> 8 & 0xFF00) + (this.anInt3834 >> 16 & 0xFF) + local35.anInt4448 * arg1;
				@Pc(82) int local82 = (super.anInt3828 & 0xFF00) + (this.anInt3834 >> 8 & 0xFF) + local35.anInt4438 * arg1;
				@Pc(99) int local99 = ((super.anInt3828 & 0xFF) << 8) + (this.anInt3834 & 0xFF) + local35.anInt4461 * arg1;
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
				super.anInt3828 &= 0xFF000000;
				super.anInt3828 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt3834 &= 0xFF000000;
				this.anInt3834 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort42 - this.aShort40 <= local35.anInt4443) {
				local65 = (super.anInt3828 >> 16 & 0xFF00) + (this.anInt3834 >> 24 & 0xFF) + local35.anInt4442 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt3828 &= 0xFFFFFF;
				super.anInt3828 |= (local65 & 0xFF00) << 16;
				this.anInt3834 &= 0xFFFFFF;
				this.anInt3834 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4432 != -1 && this.aShort42 - this.aShort40 <= local35.anInt4445) {
			this.anInt3833 += local35.anInt4446 * arg1;
		}
		if (local35.anInt4457 != -1 && this.aShort42 - this.aShort40 <= local35.anInt4440) {
			super.anInt3822 += local35.anInt4437 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort41;
		@Pc(300) double local300 = (double) this.aShort38;
		@Pc(304) double local304 = (double) this.aShort39;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt4456 == 1) {
			local317 = local17 - this.aClass15_Sub2_1.aClass271_1.anInt8274;
			local324 = local22 - this.aClass15_Sub2_1.aClass271_1.anInt8270;
			local331 = local27 - this.aClass15_Sub2_1.aClass271_1.anInt8275;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt4460 * local348 * arg1;
			this.anInt3833 = (int) ((long) this.anInt3833 - ((long) this.anInt3833 * local356 >> 18));
		} else if (local35.anInt4456 == 2) {
			local317 = local17 - this.aClass15_Sub2_1.aClass271_1.anInt8274;
			local324 = local22 - this.aClass15_Sub2_1.aClass271_1.anInt8270;
			local331 = local27 - this.aClass15_Sub2_1.aClass271_1.anInt8275;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt4460 * local348 * arg1;
			this.anInt3833 = (int) ((long) this.anInt3833 - ((long) this.anInt3833 * local356 >> 28));
		}
		if (local35.anIntArray243 != null) {
			@Pc(437) Class8 local437 = local31.aClass43_50.aClass8_37;
			for (@Pc(440) Class8 local440 = local437.aClass8_300; local440 != local437; local440 = local440.aClass8_300) {
				@Pc(444) Class8_Sub5_Sub18 local444 = (Class8_Sub5_Sub18) local440;
				@Pc(447) Class351 local447 = local444.aClass351_1;
				if (local447.anInt10068 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray243.length; local455++) {
						if (local35.anIntArray243[local455] == local447.anInt10072) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt9951);
						@Pc(486) double local486 = (double) (local22 - local444.anInt9952);
						@Pc(492) double local492 = (double) (local27 - local444.anInt9947);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong266)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt9949 + local486 * (double) local447.anInt10070 + local492 * (double) local444.anInt9948) * 65535.0D / ((double) local447.anInt10063 * local513);
							if (!(local545 < (double) local447.anInt10061)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt10062 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt10058;
								} else if (local447.anInt10062 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt10058;
								}
								if (local447.anInt10060 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt10063;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt10063;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt10063;
									if (local447.anInt10065 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt3827 = (int) ((double) super.anInt3827 + local678 * (double) arg1);
										super.anInt3830 = (int) ((double) super.anInt3830 + local686 * (double) arg1);
										super.anInt3826 = (int) ((double) super.anInt3826 + local694 * (double) arg1);
									}
								} else if (local447.anInt10065 == 0) {
									local296 += ((double) local444.anInt9949 - local553) * (double) arg1;
									local300 += ((double) local447.anInt10070 - local553) * (double) arg1;
									local304 += ((double) local444.anInt9948 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt3827 = (int) ((double) super.anInt3827 + ((double) local444.anInt9949 - local553) * (double) arg1);
									super.anInt3830 = (int) ((double) super.anInt3830 + ((double) local447.anInt10070 - local553) * (double) arg1);
									super.anInt3826 = (int) ((double) super.anInt3826 + ((double) local444.anInt9948 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray242 != null) {
			for (local317 = 0; local317 < local35.anIntArray242.length; local317++) {
				@Pc(776) Class8_Sub5_Sub18 local776 = (Class8_Sub5_Sub18) Static522.aClass136_1.method4046((long) local35.anIntArray242[local317]);
				while (local776 != null) {
					@Pc(780) Class351 local780 = local776.aClass351_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt9951);
					@Pc(792) double local792 = (double) (local22 - local776.anInt9952);
					@Pc(798) double local798 = (double) (local27 - local776.anInt9947);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong266) {
						local776 = (Class8_Sub5_Sub18) Static522.aClass136_1.method4041();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt9949 + local792 * (double) local780.anInt10070 + local798 * (double) local776.anInt9948) * 65535.0D / ((double) local780.anInt10063 * local825);
						if (local857 < (double) local780.anInt10061) {
							local776 = (Class8_Sub5_Sub18) Static522.aClass136_1.method4041();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt10062 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt10058;
							} else if (local780.anInt10062 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt10058;
							}
							if (local780.anInt10060 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt10063;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt10063;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt10063;
								if (local780.anInt10065 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt3827 = (int) ((double) super.anInt3827 + local996 * (double) arg1);
									super.anInt3830 = (int) ((double) super.anInt3830 + local1004 * (double) arg1);
									super.anInt3826 = (int) ((double) super.anInt3826 + local1012 * (double) arg1);
								}
							} else if (local780.anInt10065 == 0) {
								local296 += ((double) local776.anInt9949 - local871) * (double) arg1;
								local300 += ((double) local780.anInt10070 - local871) * (double) arg1;
								local304 += ((double) local776.anInt9948 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt3827 = (int) ((double) super.anInt3827 + ((double) local776.anInt9949 - local871) * (double) arg1);
								super.anInt3830 = (int) ((double) super.anInt3830 + ((double) local780.anInt10070 - local871) * (double) arg1);
								super.anInt3826 = (int) ((double) super.anInt3826 + ((double) local776.anInt9948 - local871) * (double) arg1);
							}
							local776 = (Class8_Sub5_Sub18) Static522.aClass136_1.method4041();
						}
					}
				}
			}
		}
		if (local35.anIntArray244 != null) {
			if (local35.anIntArray241 == null) {
				local35.anIntArray241 = new int[local35.anIntArray244.length];
				for (local317 = 0; local317 < local35.anIntArray244.length; local317++) {
					Static615.method8358(local35.anIntArray244[local317]);
					local35.anIntArray241[local317] = ((Class8_Sub17) Static234.aClass253_16.method6594((long) local35.anIntArray244[local317])).anInt2919;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray241.length; local317++) {
				@Pc(1137) Class351 local1137 = Static268.aClass351Array1[local35.anIntArray241[local317]];
				if (local1137.anInt10065 == 0) {
					local296 += local1137.anInt10057 * arg1;
					local300 += local1137.anInt10070 * arg1;
					local304 += local1137.anInt10059 * arg1;
					local306 = true;
				} else {
					super.anInt3827 += local1137.anInt10057 * arg1;
					super.anInt3830 += local1137.anInt10070 * arg1;
					super.anInt3826 += local1137.anInt10059 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort41 = (short) local296;
					this.aShort38 = (short) local300;
					this.aShort39 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt3833 <<= 0x1;
			}
		}
		super.anInt3827 = (int) ((long) super.anInt3827 + ((long) this.aShort41 * (long) (this.anInt3833 << 2) >> 23) * (long) arg1);
		super.anInt3830 = (int) ((long) super.anInt3830 + ((long) this.aShort38 * (long) (this.anInt3833 << 2) >> 23) * (long) arg1);
		super.anInt3826 = (int) ((long) super.anInt3826 + ((long) this.aShort39 * (long) (this.anInt3833 << 2) >> 23) * (long) arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class20_Sub6_Sub1_Sub1 extends Class20_Sub6_Sub1 {

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
	private int anInt8666;

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "Lclient!kl;")
	public Class20_Sub7 aClass20_Sub7_1;

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!rs", name = "R", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!rs", name = "S", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!rs", name = "O", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!rs", name = "L", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
	private int anInt8665;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!kl;IIIIIIIIIIIZZ)V")
	public Class20_Sub6_Sub1_Sub1(@OriginalArg(0) Class20_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass20_Sub7_1 = arg0;
		super.anInt8658 = arg1 << 12;
		super.anInt8662 = arg2 << 12;
		super.anInt8661 = arg3 << 12;
		super.anInt8660 = arg9;
		this.aShort105 = this.aShort104 = (short) arg8;
		super.anInt8657 = arg10;
		super.anInt8663 = arg11;
		super.aBoolean579 = arg13;
		this.aShort106 = (short) arg4;
		this.aShort103 = (short) arg5;
		this.aShort101 = (short) arg6;
		this.anInt8665 = arg7;
		super.aByte100 = this.aClass20_Sub7_1.aClass382_1.aByte129;
		this.method7461();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
	private void method7461() {
		@Pc(4) int local4 = this.aClass20_Sub7_1.aClass20_Sub8_5.anInt7724;
		if (this.aClass20_Sub7_1.aClass20_Sub8_5.aClass20_Sub6_Sub1_Sub1Array1[local4] != null) {
			this.aClass20_Sub7_1.aClass20_Sub8_5.aClass20_Sub6_Sub1_Sub1Array1[local4].method7463();
		}
		this.aClass20_Sub7_1.aClass20_Sub8_5.aClass20_Sub6_Sub1_Sub1Array1[local4] = this;
		this.aShort102 = (short) this.aClass20_Sub7_1.aClass20_Sub8_5.anInt7724;
		this.aClass20_Sub7_1.aClass20_Sub8_5.anInt7724 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub7_1.aClass81_5.method2119(this);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method7462(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt8658 >> Static643.anInt10682 + 12;
		@Pc(13) int local13 = super.anInt8661 >> Static643.anInt10682 + 12;
		@Pc(18) int local18 = super.anInt8662 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static544.anInt9353 || local13 < 0 || local13 >= Static608.anInt10072) {
			this.method7463();
			return;
		}
		@Pc(40) Class20_Sub8 local40 = this.aClass20_Sub7_1.aClass20_Sub8_5;
		@Pc(44) Class120 local44 = this.aClass20_Sub7_1.aClass120_1;
		@Pc(46) Class199[] local46 = Static195.aClass199Array1;
		@Pc(49) int local49 = local40.anInt7727;
		@Pc(58) Class97 local58 = Static272.aClass97ArrayArrayArray3[local40.anInt7727][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte52;
		}
		@Pc(71) int local71 = local46[local49].method8532(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static535.anInt9275 - 1) {
			local86 = local46[local49 + 1].method8532(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static643.anInt10682);
		}
		if (local44.aBoolean282) {
			if (local44.anInt3851 == -1 && local18 > local71) {
				this.method7463();
				return;
			}
			if (local44.anInt3851 >= 0 && local18 > local46[local44.anInt3851].method8532(local6, local13)) {
				this.method7463();
				return;
			}
			if (local44.anInt3882 == -1 && local18 < local86) {
				this.method7463();
				return;
			}
			if (local44.anInt3882 >= 0 && local18 < local46[local44.anInt3882 + 1].method8532(local6, local13)) {
				this.method7463();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static535.anInt9275 - 1; local154 > 0 && local18 > local46[local154].method8532(local6, local13); local154--) {
		}
		if (local44.lb && local154 == 0 && local18 > local46[0].method8532(local6, local13)) {
			this.method7463();
		} else if (local154 == Static535.anInt9275 - 1 && local46[local154].method8532(local6, local13) - local18 > 0x8 << Static643.anInt10682) {
			this.method7463();
		} else {
			local58 = Static272.aClass97ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static272.aClass97ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static272.aClass97ArrayArrayArray3[0][local6][local13] = new Class97(0);
				}
				@Pc(251) boolean local251 = Static272.aClass97ArrayArrayArray3[0][local6][local13].aClass97_1 != null;
				if (local154 == 3 && local251) {
					this.method7463();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static272.aClass97ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static272.aClass97ArrayArrayArray3[local261][local6][local13] = new Class97(local261);
						if (local251) {
							local58.aByte52++;
						}
					}
				}
			}
			if (local44.aBoolean275) {
				@Pc(304) int local304 = super.anInt8658 >> 12;
				local261 = super.anInt8661 >> 12;
				@Pc(318) Class290 local318;
				if (local58.aClass20_Sub2_Sub1_1 != null) {
					local318 = local58.aClass20_Sub2_Sub1_1.method9007(arg0);
					if (local318 != null && local318.method7383(local18, local304, local261)) {
						this.method7463();
						return;
					}
				}
				if (local58.aClass20_Sub2_Sub1_2 != null) {
					local318 = local58.aClass20_Sub2_Sub1_2.method9007(arg0);
					if (local318 != null && local318.method7383(local18, local304, local261)) {
						this.method7463();
						return;
					}
				}
				if (local58.aClass20_Sub2_Sub5_1 != null) {
					local318 = local58.aClass20_Sub2_Sub5_1.method9007(arg0);
					if (local318 != null && local318.method7383(local18, local304, local261)) {
						this.method7463();
						return;
					}
				}
				for (@Pc(375) Class196 local375 = local58.aClass196_2; local375 != null; local375 = local375.aClass196_3) {
					@Pc(382) Class290 local382 = local375.aClass20_Sub2_Sub2_1.method9007(arg0);
					if (local382 != null && local382.method7383(local18, local304, local261)) {
						this.method7463();
						return;
					}
				}
			}
			local40.aClass236_1.aClass157_1.method4487(this);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "()V")
	public void method7463() {
		this.aClass20_Sub7_1.aClass20_Sub8_5.aClass20_Sub6_Sub1_Sub1Array1[this.aShort102] = null;
		Static569.aClass20_Sub6_Sub1_Sub1Array2[Static316.anInt6067] = this;
		Static316.anInt6067 = Static316.anInt6067 + 1 & 0x3FF;
		this.method9004();
		this.method7454();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!kl;IIIIIIIIIIIZZ)V")
	public void method7464(@OriginalArg(0) Class20_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass20_Sub7_1 = arg0;
		super.anInt8658 = arg1 << 12;
		super.anInt8662 = arg2 << 12;
		super.anInt8661 = arg3 << 12;
		super.anInt8660 = arg9;
		this.aShort105 = this.aShort104 = (short) arg8;
		super.anInt8657 = arg10;
		super.anInt8663 = arg11;
		super.aBoolean579 = arg13;
		this.aShort106 = (short) arg4;
		this.aShort103 = (short) arg5;
		this.aShort101 = (short) arg6;
		this.anInt8665 = arg7;
		super.aByte100 = this.aClass20_Sub7_1.aClass382_1.aByte129;
		this.method7461();
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(JI)V")
	public void method7465(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort104 = (short) (this.aShort104 - arg1);
		if (this.aShort104 <= 0) {
			this.method7463();
			return;
		}
		@Pc(17) int local17 = super.anInt8658 >> 12;
		@Pc(22) int local22 = super.anInt8662 >> 12;
		@Pc(27) int local27 = super.anInt8661 >> 12;
		@Pc(31) Class20_Sub8 local31 = this.aClass20_Sub7_1.aClass20_Sub8_5;
		@Pc(35) Class120 local35 = this.aClass20_Sub7_1.aClass120_1;
		if (local35.anInt3853 != 0) {
			@Pc(65) int local65;
			if (this.aShort105 - this.aShort104 <= local35.anInt3877) {
				local65 = (super.anInt8660 >> 8 & 0xFF00) + (this.anInt8666 >> 16 & 0xFF) + local35.anInt3864 * arg1;
				@Pc(82) int local82 = (super.anInt8660 & 0xFF00) + (this.anInt8666 >> 8 & 0xFF) + local35.anInt3885 * arg1;
				@Pc(99) int local99 = ((super.anInt8660 & 0xFF) << 8) + (this.anInt8666 & 0xFF) + local35.anInt3863 * arg1;
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
				super.anInt8660 &= 0xFF000000;
				super.anInt8660 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt8666 &= 0xFF000000;
				this.anInt8666 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort105 - this.aShort104 <= local35.anInt3857) {
				local65 = (super.anInt8660 >> 16 & 0xFF00) + (this.anInt8666 >> 24 & 0xFF) + local35.anInt3875 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt8660 &= 0xFFFFFF;
				super.anInt8660 |= (local65 & 0xFF00) << 16;
				this.anInt8666 &= 0xFFFFFF;
				this.anInt8666 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3839 != -1 && this.aShort105 - this.aShort104 <= local35.anInt3873) {
			this.anInt8665 += local35.anInt3858 * arg1;
		}
		if (local35.anInt3871 != -1 && this.aShort105 - this.aShort104 <= local35.anInt3833) {
			super.anInt8657 += local35.anInt3832 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort106;
		@Pc(300) double local300 = (double) this.aShort103;
		@Pc(304) double local304 = (double) this.aShort101;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt3844 == 1) {
			local317 = local17 - this.aClass20_Sub7_1.aClass177_1.anInt5841;
			local324 = local22 - this.aClass20_Sub7_1.aClass177_1.anInt5849;
			local331 = local27 - this.aClass20_Sub7_1.aClass177_1.anInt5837;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt3870 * local348 * arg1);
			this.anInt8665 = (int) ((long) this.anInt8665 - ((long) this.anInt8665 * local356 >> 18));
		} else if (local35.anInt3844 == 2) {
			local317 = local17 - this.aClass20_Sub7_1.aClass177_1.anInt5841;
			local324 = local22 - this.aClass20_Sub7_1.aClass177_1.anInt5849;
			local331 = local27 - this.aClass20_Sub7_1.aClass177_1.anInt5837;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt3870 * local348 * arg1);
			this.anInt8665 = (int) ((long) this.anInt8665 - ((long) this.anInt8665 * local356 >> 28));
		}
		if (local35.anIntArray231 != null) {
			@Pc(437) Class6 local437 = local31.aClass8_52.aClass6_7;
			for (@Pc(440) Class6 local440 = local437.aClass6_299; local440 != local437; local440 = local440.aClass6_299) {
				@Pc(444) Class6_Sub2_Sub15 local444 = (Class6_Sub2_Sub15) local440;
				@Pc(447) Class103 local447 = local444.aClass103_1;
				if (local447.anInt3360 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray231.length; local455++) {
						if (local35.anIntArray231[local455] == local447.anInt3367) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt7278);
						@Pc(486) double local486 = (double) (local22 - local444.anInt7274);
						@Pc(492) double local492 = (double) (local27 - local444.anInt7276);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong85)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt7277 + local486 * (double) local447.anInt3362 + local492 * (double) local444.anInt7273) * 65535.0D / ((double) local447.anInt3369 * local513);
							if (!(local545 < (double) local447.anInt3365)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt3370 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt3356;
								} else if (local447.anInt3370 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt3356;
								}
								if (local447.anInt3363 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt3369;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt3369;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt3369;
									if (local447.anInt3366 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt8658 = (int) ((double) super.anInt8658 + local678 * (double) arg1);
										super.anInt8662 = (int) ((double) super.anInt8662 + local686 * (double) arg1);
										super.anInt8661 = (int) ((double) super.anInt8661 + local694 * (double) arg1);
									}
								} else if (local447.anInt3366 == 0) {
									local296 += ((double) local444.anInt7277 - local553) * (double) arg1;
									local300 += ((double) local447.anInt3362 - local553) * (double) arg1;
									local304 += ((double) local444.anInt7273 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt8658 = (int) ((double) super.anInt8658 + ((double) local444.anInt7277 - local553) * (double) arg1);
									super.anInt8662 = (int) ((double) super.anInt8662 + ((double) local447.anInt3362 - local553) * (double) arg1);
									super.anInt8661 = (int) ((double) super.anInt8661 + ((double) local444.anInt7273 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray233 != null) {
			for (local317 = 0; local317 < local35.anIntArray233.length; local317++) {
				@Pc(776) Class6_Sub2_Sub15 local776 = (Class6_Sub2_Sub15) Static400.aClass170_1.method4878((long) local35.anIntArray233[local317]);
				while (local776 != null) {
					@Pc(780) Class103 local780 = local776.aClass103_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt7278);
					@Pc(792) double local792 = (double) (local22 - local776.anInt7274);
					@Pc(798) double local798 = (double) (local27 - local776.anInt7276);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong85) {
						local776 = (Class6_Sub2_Sub15) Static400.aClass170_1.method4880();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt7277 + local792 * (double) local780.anInt3362 + local798 * (double) local776.anInt7273) * 65535.0D / ((double) local780.anInt3369 * local825);
						if (local857 < (double) local780.anInt3365) {
							local776 = (Class6_Sub2_Sub15) Static400.aClass170_1.method4880();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt3370 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt3356;
							} else if (local780.anInt3370 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt3356;
							}
							if (local780.anInt3363 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt3369;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt3369;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt3369;
								if (local780.anInt3366 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt8658 = (int) ((double) super.anInt8658 + local996 * (double) arg1);
									super.anInt8662 = (int) ((double) super.anInt8662 + local1004 * (double) arg1);
									super.anInt8661 = (int) ((double) super.anInt8661 + local1012 * (double) arg1);
								}
							} else if (local780.anInt3366 == 0) {
								local296 += ((double) local776.anInt7277 - local871) * (double) arg1;
								local300 += ((double) local780.anInt3362 - local871) * (double) arg1;
								local304 += ((double) local776.anInt7273 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt8658 = (int) ((double) super.anInt8658 + ((double) local776.anInt7277 - local871) * (double) arg1);
								super.anInt8662 = (int) ((double) super.anInt8662 + ((double) local780.anInt3362 - local871) * (double) arg1);
								super.anInt8661 = (int) ((double) super.anInt8661 + ((double) local776.anInt7273 - local871) * (double) arg1);
							}
							local776 = (Class6_Sub2_Sub15) Static400.aClass170_1.method4880();
						}
					}
				}
			}
		}
		if (local35.anIntArray232 != null) {
			if (local35.anIntArray234 == null) {
				local35.anIntArray234 = new int[local35.anIntArray232.length];
				for (local317 = 0; local317 < local35.anIntArray232.length; local317++) {
					Static424.method6658(local35.anIntArray232[local317]);
					local35.anIntArray234[local317] = ((Class6_Sub48) Static232.aClass128_13.method3560((long) local35.anIntArray232[local317])).anInt9611;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray234.length; local317++) {
				@Pc(1137) Class103 local1137 = Static635.aClass103Array3[local35.anIntArray234[local317]];
				if (local1137.anInt3366 == 0) {
					local296 += (double) (local1137.anInt3361 * arg1);
					local300 += (double) (local1137.anInt3362 * arg1);
					local304 += (double) (local1137.anInt3364 * arg1);
					local306 = true;
				} else {
					super.anInt8658 += local1137.anInt3361 * arg1;
					super.anInt8662 += local1137.anInt3362 * arg1;
					super.anInt8661 += local1137.anInt3364 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort106 = (short) (int) local296;
					this.aShort103 = (short) (int) local300;
					this.aShort101 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt8665 <<= 0x1;
			}
		}
		super.anInt8658 = (int) ((long) super.anInt8658 + ((long) this.aShort106 * (long) (this.anInt8665 << 2) >> 23) * (long) arg1);
		super.anInt8662 = (int) ((long) super.anInt8662 + ((long) this.aShort103 * (long) (this.anInt8665 << 2) >> 23) * (long) arg1);
		super.anInt8661 = (int) ((long) super.anInt8661 + ((long) this.aShort101 * (long) (this.anInt8665 << 2) >> 23) * (long) arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class23_Sub1_Sub2_Sub1 extends Class23_Sub1_Sub2 {

	@OriginalMember(owner = "client!pha", name = "F", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!pha", name = "G", descriptor = "I")
	private int anInt7859;

	@OriginalMember(owner = "client!pha", name = "D", descriptor = "Lclient!cea;")
	public Class23_Sub3 aClass23_Sub3_1;

	@OriginalMember(owner = "client!pha", name = "H", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!pha", name = "E", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!pha", name = "z", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!pha", name = "A", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!pha", name = "C", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!pha", name = "B", descriptor = "I")
	private int anInt7858;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lclient!cea;IIIIIIIIIIIZZ)V")
	public Class23_Sub1_Sub2_Sub1(@OriginalArg(0) Class23_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass23_Sub3_1 = arg0;
		super.anInt7855 = arg1 << 12;
		super.anInt7853 = arg2 << 12;
		super.anInt7850 = arg3 << 12;
		super.anInt7856 = arg9;
		this.aShort94 = this.aShort96 = (short) arg8;
		super.anInt7857 = arg10;
		super.anInt7852 = arg11;
		super.aBoolean594 = arg13;
		this.aShort91 = (short) arg4;
		this.aShort92 = (short) arg5;
		this.aShort93 = (short) arg6;
		this.anInt7858 = arg7;
		super.aByte101 = this.aClass23_Sub3_1.aClass261_1.aByte95;
		this.method6593();
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(JI)V")
	public void method6589(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort96 = (short) (this.aShort96 - arg1);
		if (this.aShort96 <= 0) {
			this.method6591();
			return;
		}
		@Pc(17) int local17 = super.anInt7855 >> 12;
		@Pc(22) int local22 = super.anInt7853 >> 12;
		@Pc(27) int local27 = super.anInt7850 >> 12;
		@Pc(31) Class23_Sub5 local31 = this.aClass23_Sub3_1.aClass23_Sub5_2;
		@Pc(35) Class174 local35 = this.aClass23_Sub3_1.aClass174_1;
		if (local35.anInt4638 != 0) {
			@Pc(65) int local65;
			if (this.aShort94 - this.aShort96 <= local35.anInt4629) {
				local65 = (super.anInt7856 >> 8 & 0xFF00) + (this.anInt7859 >> 16 & 0xFF) + local35.anInt4630 * arg1;
				@Pc(82) int local82 = (super.anInt7856 & 0xFF00) + (this.anInt7859 >> 8 & 0xFF) + local35.anInt4622 * arg1;
				@Pc(99) int local99 = ((super.anInt7856 & 0xFF) << 8) + (this.anInt7859 & 0xFF) + local35.anInt4625 * arg1;
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
				super.anInt7856 &= 0xFF000000;
				super.anInt7856 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7859 &= 0xFF000000;
				this.anInt7859 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort94 - this.aShort96 <= local35.anInt4651) {
				local65 = (super.anInt7856 >> 16 & 0xFF00) + (this.anInt7859 >> 24 & 0xFF) + local35.anInt4619 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7856 &= 0xFFFFFF;
				super.anInt7856 |= (local65 & 0xFF00) << 16;
				this.anInt7859 &= 0xFFFFFF;
				this.anInt7859 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4634 != -1 && this.aShort94 - this.aShort96 <= local35.anInt4607) {
			this.anInt7858 += local35.anInt4623 * arg1;
		}
		if (local35.anInt4616 != -1 && this.aShort94 - this.aShort96 <= local35.anInt4642) {
			super.anInt7857 += local35.anInt4614 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort91;
		@Pc(300) double local300 = (double) this.aShort92;
		@Pc(304) double local304 = (double) this.aShort93;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt4627 == 1) {
			local317 = local17 - this.aClass23_Sub3_1.aClass24_1.anInt761;
			local324 = local22 - this.aClass23_Sub3_1.aClass24_1.anInt763;
			local331 = local27 - this.aClass23_Sub3_1.aClass24_1.anInt765;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt4600 * local348 * arg1);
			this.anInt7858 = (int) ((long) this.anInt7858 - ((long) this.anInt7858 * local356 >> 18));
		} else if (local35.anInt4627 == 2) {
			local317 = local17 - this.aClass23_Sub3_1.aClass24_1.anInt761;
			local324 = local22 - this.aClass23_Sub3_1.aClass24_1.anInt763;
			local331 = local27 - this.aClass23_Sub3_1.aClass24_1.anInt765;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt4600 * local348 * arg1);
			this.anInt7858 = (int) ((long) this.anInt7858 - ((long) this.anInt7858 * local356 >> 28));
		}
		if (local35.lb != null) {
			@Pc(437) Class3 local437 = local31.aClass193_16.aClass3_155;
			for (@Pc(440) Class3 local440 = local437.aClass3_337; local440 != local437; local440 = local440.aClass3_337) {
				@Pc(444) Class3_Sub6_Sub18 local444 = (Class3_Sub6_Sub18) local440;
				@Pc(447) Class265 local447 = local444.aClass265_1;
				if (local447.anInt7613 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.lb.length; local455++) {
						if (local35.lb[local455] == local447.anInt7618) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt8498);
						@Pc(486) double local486 = (double) (local22 - local444.anInt8499);
						@Pc(492) double local492 = (double) (local27 - local444.anInt8501);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong213)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt8497 + local486 * (double) local447.anInt7612 + local492 * (double) local444.anInt8500) * 65535.0D / ((double) local447.anInt7616 * local513);
							if (!(local545 < (double) local447.anInt7622)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt7623 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt7609;
								} else if (local447.anInt7623 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt7609;
								}
								if (local447.anInt7610 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt7616;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt7616;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt7616;
									if (local447.anInt7621 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt7855 = (int) ((double) super.anInt7855 + local678 * (double) arg1);
										super.anInt7853 = (int) ((double) super.anInt7853 + local686 * (double) arg1);
										super.anInt7850 = (int) ((double) super.anInt7850 + local694 * (double) arg1);
									}
								} else if (local447.anInt7621 == 0) {
									local296 += ((double) local444.anInt8497 - local553) * (double) arg1;
									local300 += ((double) local447.anInt7612 - local553) * (double) arg1;
									local304 += ((double) local444.anInt8500 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt7855 = (int) ((double) super.anInt7855 + ((double) local444.anInt8497 - local553) * (double) arg1);
									super.anInt7853 = (int) ((double) super.anInt7853 + ((double) local447.anInt7612 - local553) * (double) arg1);
									super.anInt7850 = (int) ((double) super.anInt7850 + ((double) local444.anInt8500 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray306 != null) {
			for (local317 = 0; local317 < local35.anIntArray306.length; local317++) {
				@Pc(776) Class3_Sub6_Sub18 local776 = (Class3_Sub6_Sub18) Static636.aClass299_1.method7102((long) local35.anIntArray306[local317]);
				while (local776 != null) {
					@Pc(780) Class265 local780 = local776.aClass265_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt8498);
					@Pc(792) double local792 = (double) (local22 - local776.anInt8499);
					@Pc(798) double local798 = (double) (local27 - local776.anInt8501);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong213) {
						local776 = (Class3_Sub6_Sub18) Static636.aClass299_1.method7107();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt8497 + local792 * (double) local780.anInt7612 + local798 * (double) local776.anInt8500) * 65535.0D / ((double) local780.anInt7616 * local825);
						if (local857 < (double) local780.anInt7622) {
							local776 = (Class3_Sub6_Sub18) Static636.aClass299_1.method7107();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt7623 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt7609;
							} else if (local780.anInt7623 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt7609;
							}
							if (local780.anInt7610 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt7616;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt7616;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt7616;
								if (local780.anInt7621 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt7855 = (int) ((double) super.anInt7855 + local996 * (double) arg1);
									super.anInt7853 = (int) ((double) super.anInt7853 + local1004 * (double) arg1);
									super.anInt7850 = (int) ((double) super.anInt7850 + local1012 * (double) arg1);
								}
							} else if (local780.anInt7621 == 0) {
								local296 += ((double) local776.anInt8497 - local871) * (double) arg1;
								local300 += ((double) local780.anInt7612 - local871) * (double) arg1;
								local304 += ((double) local776.anInt8500 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt7855 = (int) ((double) super.anInt7855 + ((double) local776.anInt8497 - local871) * (double) arg1);
								super.anInt7853 = (int) ((double) super.anInt7853 + ((double) local780.anInt7612 - local871) * (double) arg1);
								super.anInt7850 = (int) ((double) super.anInt7850 + ((double) local776.anInt8500 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub6_Sub18) Static636.aClass299_1.method7107();
						}
					}
				}
			}
		}
		if (local35.anIntArray305 != null) {
			if (local35.anIntArray304 == null) {
				local35.anIntArray304 = new int[local35.anIntArray305.length];
				for (local317 = 0; local317 < local35.anIntArray305.length; local317++) {
					Static600.method7989(local35.anIntArray305[local317]);
					local35.anIntArray304[local317] = ((Class3_Sub53) Static314.aClass62_29.method1682((long) local35.anIntArray305[local317])).anInt10023;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray304.length; local317++) {
				@Pc(1137) Class265 local1137 = Static264.aClass265Array1[local35.anIntArray304[local317]];
				if (local1137.anInt7621 == 0) {
					local296 += (double) (local1137.anInt7624 * arg1);
					local300 += (double) (local1137.anInt7612 * arg1);
					local304 += (double) (local1137.anInt7615 * arg1);
					local306 = true;
				} else {
					super.anInt7855 += local1137.anInt7624 * arg1;
					super.anInt7853 += local1137.anInt7612 * arg1;
					super.anInt7850 += local1137.anInt7615 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort91 = (short) (int) local296;
					this.aShort92 = (short) (int) local300;
					this.aShort93 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt7858 <<= 0x1;
			}
		}
		super.anInt7855 = (int) ((long) super.anInt7855 + ((long) this.aShort91 * (long) (this.anInt7858 << 2) >> 23) * (long) arg1);
		super.anInt7853 = (int) ((long) super.anInt7853 + ((long) this.aShort92 * (long) (this.anInt7858 << 2) >> 23) * (long) arg1);
		super.anInt7850 = (int) ((long) super.anInt7850 + ((long) this.aShort93 * (long) (this.anInt7858 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method6590(@OriginalArg(0) Class16 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt7855 >> Static436.anInt7634 + 12;
		@Pc(13) int local13 = super.anInt7850 >> Static436.anInt7634 + 12;
		@Pc(18) int local18 = super.anInt7853 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static410.anInt6962 || local13 < 0 || local13 >= Static315.anInt5894) {
			this.method6591();
			return;
		}
		@Pc(40) Class23_Sub5 local40 = this.aClass23_Sub3_1.aClass23_Sub5_2;
		@Pc(44) Class174 local44 = this.aClass23_Sub3_1.aClass174_1;
		@Pc(46) Class104[] local46 = Static343.aClass104Array2;
		@Pc(49) int local49 = local40.anInt2820;
		@Pc(58) Class247 local58 = Static332.aClass247ArrayArrayArray1[local40.anInt2820][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte94;
		}
		@Pc(71) int local71 = local46[local49].method8279(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static373.anInt6613 - 1) {
			local86 = local46[local49 + 1].method8279(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static436.anInt7634);
		}
		if (local44.aBoolean370) {
			if (local44.anInt4636 == -1 && local18 > local71) {
				this.method6591();
				return;
			}
			if (local44.anInt4636 >= 0 && local18 > local46[local44.anInt4636].method8279(local13, local6)) {
				this.method6591();
				return;
			}
			if (local44.anInt4624 == -1 && local18 < local86) {
				this.method6591();
				return;
			}
			if (local44.anInt4624 >= 0 && local18 < local46[local44.anInt4624 + 1].method8279(local13, local6)) {
				this.method6591();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static373.anInt6613 - 1; local154 > 0 && local18 > local46[local154].method8279(local13, local6); local154--) {
		}
		if (local44.aBoolean363 && local154 == 0 && local18 > local46[0].method8279(local13, local6)) {
			this.method6591();
		} else if (local154 == Static373.anInt6613 - 1 && local46[local154].method8279(local13, local6) - local18 > 0x8 << Static436.anInt7634) {
			this.method6591();
		} else {
			local58 = Static332.aClass247ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static332.aClass247ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static332.aClass247ArrayArrayArray1[0][local6][local13] = new Class247(0);
				}
				@Pc(251) boolean local251 = Static332.aClass247ArrayArrayArray1[0][local6][local13].aClass247_1 != null;
				if (local154 == 3 && local251) {
					this.method6591();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static332.aClass247ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static332.aClass247ArrayArrayArray1[local261][local6][local13] = new Class247(local261);
						if (local251) {
							local58.aByte94++;
						}
					}
				}
			}
			if (local44.aBoolean369) {
				@Pc(304) int local304 = super.anInt7855 >> 12;
				local261 = super.anInt7850 >> 12;
				@Pc(318) Class77 local318;
				if (local58.aClass23_Sub2_Sub5_1 != null) {
					local318 = local58.aClass23_Sub2_Sub5_1.method8595(arg0);
					if (local318 != null && local318.method2022(local261, local18, local304)) {
						this.method6591();
						return;
					}
				}
				if (local58.aClass23_Sub2_Sub5_2 != null) {
					local318 = local58.aClass23_Sub2_Sub5_2.method8595(arg0);
					if (local318 != null && local318.method2022(local261, local18, local304)) {
						this.method6591();
						return;
					}
				}
				if (local58.aClass23_Sub2_Sub3_1 != null) {
					local318 = local58.aClass23_Sub2_Sub3_1.method8595(arg0);
					if (local318 != null && local318.method2022(local261, local18, local304)) {
						this.method6591();
						return;
					}
				}
				for (@Pc(375) Class85 local375 = local58.aClass85_3; local375 != null; local375 = local375.aClass85_1) {
					@Pc(382) Class77 local382 = local375.aClass23_Sub2_Sub1_1.method8595(arg0);
					if (local382 != null && local382.method2022(local261, local18, local304)) {
						this.method6591();
						return;
					}
				}
			}
			local40.aClass237_1.aClass125_1.method2786(this);
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "()V")
	public void method6591() {
		this.aClass23_Sub3_1.aClass23_Sub5_2.aClass23_Sub1_Sub2_Sub1Array1[this.aShort95] = null;
		Static184.aClass23_Sub1_Sub2_Sub1Array2[Static185.anInt3412] = this;
		Static185.anInt3412 = Static185.anInt3412 + 1 & 0x3FF;
		this.method8588();
		this.method6583();
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!cea;IIIIIIIIIIIZZ)V")
	public void method6592(@OriginalArg(0) Class23_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass23_Sub3_1 = arg0;
		super.anInt7855 = arg1 << 12;
		super.anInt7853 = arg2 << 12;
		super.anInt7850 = arg3 << 12;
		super.anInt7856 = arg9;
		this.aShort94 = this.aShort96 = (short) arg8;
		super.anInt7857 = arg10;
		super.anInt7852 = arg11;
		super.aBoolean594 = arg13;
		this.aShort91 = (short) arg4;
		this.aShort92 = (short) arg5;
		this.aShort93 = (short) arg6;
		this.anInt7858 = arg7;
		super.aByte101 = this.aClass23_Sub3_1.aClass261_1.aByte95;
		this.method6593();
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "()V")
	private void method6593() {
		@Pc(4) int local4 = this.aClass23_Sub3_1.aClass23_Sub5_2.anInt2818;
		if (this.aClass23_Sub3_1.aClass23_Sub5_2.aClass23_Sub1_Sub2_Sub1Array1[local4] != null) {
			this.aClass23_Sub3_1.aClass23_Sub5_2.aClass23_Sub1_Sub2_Sub1Array1[local4].method6591();
		}
		this.aClass23_Sub3_1.aClass23_Sub5_2.aClass23_Sub1_Sub2_Sub1Array1[local4] = this;
		this.aShort95 = (short) this.aClass23_Sub3_1.aClass23_Sub5_2.anInt2818;
		this.aClass23_Sub3_1.aClass23_Sub5_2.anInt2818 = local4 + 1 & 0x1FFF;
		this.aClass23_Sub3_1.aClass105_3.method2447(this);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class15_Sub2_Sub1_Sub1 extends Class15_Sub2_Sub1 {

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
	private int anInt10905;

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "S")
	private short aShort125;

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "Lclient!tca;")
	public Class15_Sub7 aClass15_Sub7_1;

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!vda", name = "C", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!vda", name = "z", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
	private int anInt10904;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!tca;IIIIIIIIIIIZZ)V")
	public Class15_Sub2_Sub1_Sub1(@OriginalArg(0) Class15_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass15_Sub7_1 = arg0;
		super.anInt10896 = arg1 << 12;
		super.anInt10899 = arg2 << 12;
		super.anInt10900 = arg3 << 12;
		super.anInt10898 = arg9;
		this.aShort121 = this.aShort124 = (short) arg8;
		super.anInt10903 = arg10;
		super.anInt10902 = arg11;
		super.aBoolean784 = arg13;
		this.aShort123 = (short) arg4;
		this.aShort122 = (short) arg5;
		this.aShort120 = (short) arg6;
		this.anInt10904 = arg7;
		super.aByte140 = this.aClass15_Sub7_1.aClass283_2.aByte110;
		this.method9319();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "()V")
	private void method9319() {
		@Pc(4) int local4 = this.aClass15_Sub7_1.aClass15_Sub5_7.anInt2486;
		if (this.aClass15_Sub7_1.aClass15_Sub5_7.aClass15_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass15_Sub7_1.aClass15_Sub5_7.aClass15_Sub2_Sub1_Sub1Array1[local4].method9321();
		}
		this.aClass15_Sub7_1.aClass15_Sub5_7.aClass15_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort125 = (short) this.aClass15_Sub7_1.aClass15_Sub5_7.anInt2486;
		this.aClass15_Sub7_1.aClass15_Sub5_7.anInt2486 = local4 + 1 & 0x1FFF;
		this.aClass15_Sub7_1.aClass60_9.method1551(this);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method9320(@OriginalArg(0) Class101 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt10896 >> Static170.anInt3602 + 12;
		@Pc(13) int local13 = super.anInt10900 >> Static170.anInt3602 + 12;
		@Pc(18) int local18 = super.anInt10899 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static585.anInt10170 || local13 < 0 || local13 >= Static202.anInt4238) {
			this.method9321();
			return;
		}
		@Pc(40) Class15_Sub5 local40 = this.aClass15_Sub7_1.aClass15_Sub5_7;
		@Pc(44) Class308 local44 = this.aClass15_Sub7_1.aClass308_1;
		@Pc(46) Class18[] local46 = Static245.aClass18Array14;
		@Pc(49) int local49 = local40.anInt2489;
		@Pc(58) Class291 local58 = Static193.aClass291ArrayArrayArray2[local40.anInt2489][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte112;
		}
		@Pc(71) int local71 = local46[local49].method8537(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static60.anInt1169 - 1) {
			local86 = local46[local49 + 1].method8537(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static170.anInt3602);
		}
		if (local44.aBoolean648) {
			if (local44.anInt8954 == -1 && local18 > local71) {
				this.method9321();
				return;
			}
			if (local44.anInt8954 >= 0 && local18 > local46[local44.anInt8954].method8537(local13, local6)) {
				this.method9321();
				return;
			}
			if (local44.anInt8917 == -1 && local18 < local86) {
				this.method9321();
				return;
			}
			if (local44.anInt8917 >= 0 && local18 < local46[local44.anInt8917 + 1].method8537(local13, local6)) {
				this.method9321();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static60.anInt1169 - 1; local154 > 0 && local18 > local46[local154].method8537(local13, local6); local154--) {
		}
		if (local44.aBoolean644 && local154 == 0 && local18 > local46[0].method8537(local13, local6)) {
			this.method9321();
		} else if (local154 == Static60.anInt1169 - 1 && local46[local154].method8537(local13, local6) - local18 > 0x8 << Static170.anInt3602) {
			this.method9321();
		} else {
			local58 = Static193.aClass291ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static193.aClass291ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static193.aClass291ArrayArrayArray2[0][local6][local13] = new Class291(0);
				}
				@Pc(251) boolean local251 = Static193.aClass291ArrayArrayArray2[0][local6][local13].aClass291_1 != null;
				if (local154 == 3 && local251) {
					this.method9321();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static193.aClass291ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static193.aClass291ArrayArrayArray2[local261][local6][local13] = new Class291(local261);
						if (local251) {
							local58.aByte112++;
						}
					}
				}
			}
			if (local44.aBoolean651) {
				@Pc(304) int local304 = super.anInt10896 >> 12;
				local261 = super.anInt10900 >> 12;
				@Pc(318) Class232 local318;
				if (local58.aClass15_Sub3_Sub4_1 != null) {
					local318 = local58.aClass15_Sub3_Sub4_1.method9442(arg0);
					if (local318 != null && local318.method6320(local18, local261, local304)) {
						this.method9321();
						return;
					}
				}
				if (local58.aClass15_Sub3_Sub4_2 != null) {
					local318 = local58.aClass15_Sub3_Sub4_2.method9442(arg0);
					if (local318 != null && local318.method6320(local18, local261, local304)) {
						this.method9321();
						return;
					}
				}
				if (local58.aClass15_Sub3_Sub5_1 != null) {
					local318 = local58.aClass15_Sub3_Sub5_1.method9442(arg0);
					if (local318 != null && local318.method6320(local18, local261, local304)) {
						this.method9321();
						return;
					}
				}
				for (@Pc(375) Class27 local375 = local58.aClass27_3; local375 != null; local375 = local375.aClass27_1) {
					@Pc(382) Class232 local382 = local375.aClass15_Sub3_Sub3_1.method9442(arg0);
					if (local382 != null && local382.method6320(local18, local261, local304)) {
						this.method9321();
						return;
					}
				}
			}
			local40.aClass127_1.aClass390_1.method9674(this);
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "()V")
	public void method9321() {
		this.aClass15_Sub7_1.aClass15_Sub5_7.aClass15_Sub2_Sub1_Sub1Array1[this.aShort125] = null;
		Static458.aClass15_Sub2_Sub1_Sub1Array2[Static145.anInt2717] = this;
		Static145.anInt2717 = Static145.anInt2717 + 1 & 0x3FF;
		this.method9741();
		this.method9316();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!tca;IIIIIIIIIIIZZ)V")
	public void method9322(@OriginalArg(0) Class15_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass15_Sub7_1 = arg0;
		super.anInt10896 = arg1 << 12;
		super.anInt10899 = arg2 << 12;
		super.anInt10900 = arg3 << 12;
		super.anInt10898 = arg9;
		this.aShort121 = this.aShort124 = (short) arg8;
		super.anInt10903 = arg10;
		super.anInt10902 = arg11;
		super.aBoolean784 = arg13;
		this.aShort123 = (short) arg4;
		this.aShort122 = (short) arg5;
		this.aShort120 = (short) arg6;
		this.anInt10904 = arg7;
		super.aByte140 = this.aClass15_Sub7_1.aClass283_2.aByte110;
		this.method9319();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(JI)V")
	public void method9323(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort124 = (short) (this.aShort124 - arg1);
		if (this.aShort124 <= 0) {
			this.method9321();
			return;
		}
		@Pc(17) int local17 = super.anInt10896 >> 12;
		@Pc(22) int local22 = super.anInt10899 >> 12;
		@Pc(27) int local27 = super.anInt10900 >> 12;
		@Pc(31) Class15_Sub5 local31 = this.aClass15_Sub7_1.aClass15_Sub5_7;
		@Pc(35) Class308 local35 = this.aClass15_Sub7_1.aClass308_1;
		if (local35.anInt8906 != 0) {
			@Pc(65) int local65;
			if (this.aShort121 - this.aShort124 <= local35.anInt8921) {
				local65 = (super.anInt10898 >> 8 & 0xFF00) + (this.anInt10905 >> 16 & 0xFF) + local35.anInt8926 * arg1;
				@Pc(82) int local82 = (super.anInt10898 & 0xFF00) + (this.anInt10905 >> 8 & 0xFF) + local35.anInt8909 * arg1;
				@Pc(99) int local99 = ((super.anInt10898 & 0xFF) << 8) + (this.anInt10905 & 0xFF) + local35.anInt8912 * arg1;
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
				super.anInt10898 &= 0xFF000000;
				super.anInt10898 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt10905 &= 0xFF000000;
				this.anInt10905 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort121 - this.aShort124 <= local35.anInt8928) {
				local65 = (super.anInt10898 >> 16 & 0xFF00) + (this.anInt10905 >> 24 & 0xFF) + local35.anInt8924 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt10898 &= 0xFFFFFF;
				super.anInt10898 |= (local65 & 0xFF00) << 16;
				this.anInt10905 &= 0xFFFFFF;
				this.anInt10905 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8922 != -1 && this.aShort121 - this.aShort124 <= local35.anInt8911) {
			this.anInt10904 += local35.anInt8937 * arg1;
		}
		if (local35.anInt8940 != -1 && this.aShort121 - this.aShort124 <= local35.anInt8935) {
			super.anInt10903 += local35.anInt8919 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort123;
		@Pc(300) double local300 = (double) this.aShort122;
		@Pc(304) double local304 = (double) this.aShort120;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt8948 == 1) {
			local317 = local17 - this.aClass15_Sub7_1.aClass64_1.anInt1706;
			local324 = local22 - this.aClass15_Sub7_1.aClass64_1.anInt1700;
			local331 = local27 - this.aClass15_Sub7_1.aClass64_1.anInt1696;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt8925 * local348 * arg1);
			this.anInt10904 = (int) ((long) this.anInt10904 - ((long) this.anInt10904 * local356 >> 18));
		} else if (local35.anInt8948 == 2) {
			local317 = local17 - this.aClass15_Sub7_1.aClass64_1.anInt1706;
			local324 = local22 - this.aClass15_Sub7_1.aClass64_1.anInt1700;
			local331 = local27 - this.aClass15_Sub7_1.aClass64_1.anInt1696;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt8925 * local348 * arg1);
			this.anInt10904 = (int) ((long) this.anInt10904 - ((long) this.anInt10904 * local356 >> 28));
		}
		if (local35.anIntArray453 != null) {
			@Pc(437) Class2 local437 = local31.aClass271_9.aClass2_230;
			for (@Pc(440) Class2 local440 = local437.aClass2_338; local440 != local437; local440 = local440.aClass2_338) {
				@Pc(444) Class2_Sub1_Sub4 local444 = (Class2_Sub1_Sub4) local440;
				@Pc(447) Class172 local447 = local444.aClass172_1;
				if (local447.anInt5065 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray453.length; local455++) {
						if (local35.anIntArray453[local455] == local447.anInt5063) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt2471);
						@Pc(486) double local486 = (double) (local22 - local444.anInt2469);
						@Pc(492) double local492 = (double) (local27 - local444.anInt2473);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong135)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt2468 + local486 * (double) local447.anInt5068 + local492 * (double) local444.anInt2470) * 65535.0D / ((double) local447.anInt5053 * local513);
							if (!(local545 < (double) local447.anInt5069)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt5064 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt5070;
								} else if (local447.anInt5064 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt5070;
								}
								if (local447.anInt5056 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt5053;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt5053;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt5053;
									if (local447.anInt5071 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt10896 = (int) ((double) super.anInt10896 + local678 * (double) arg1);
										super.anInt10899 = (int) ((double) super.anInt10899 + local686 * (double) arg1);
										super.anInt10900 = (int) ((double) super.anInt10900 + local694 * (double) arg1);
									}
								} else if (local447.anInt5071 == 0) {
									local296 += ((double) local444.anInt2468 - local553) * (double) arg1;
									local300 += ((double) local447.anInt5068 - local553) * (double) arg1;
									local304 += ((double) local444.anInt2470 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt10896 = (int) ((double) super.anInt10896 + ((double) local444.anInt2468 - local553) * (double) arg1);
									super.anInt10899 = (int) ((double) super.anInt10899 + ((double) local447.anInt5068 - local553) * (double) arg1);
									super.anInt10900 = (int) ((double) super.anInt10900 + ((double) local444.anInt2470 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray454 != null) {
			for (local317 = 0; local317 < local35.anIntArray454.length; local317++) {
				@Pc(776) Class2_Sub1_Sub4 local776 = (Class2_Sub1_Sub4) Static186.aClass170_1.method4524((long) local35.anIntArray454[local317]);
				while (local776 != null) {
					@Pc(780) Class172 local780 = local776.aClass172_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt2471);
					@Pc(792) double local792 = (double) (local22 - local776.anInt2469);
					@Pc(798) double local798 = (double) (local27 - local776.anInt2473);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong135) {
						local776 = (Class2_Sub1_Sub4) Static186.aClass170_1.method4522();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt2468 + local792 * (double) local780.anInt5068 + local798 * (double) local776.anInt2470) * 65535.0D / ((double) local780.anInt5053 * local825);
						if (local857 < (double) local780.anInt5069) {
							local776 = (Class2_Sub1_Sub4) Static186.aClass170_1.method4522();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt5064 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt5070;
							} else if (local780.anInt5064 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt5070;
							}
							if (local780.anInt5056 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt5053;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt5053;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt5053;
								if (local780.anInt5071 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt10896 = (int) ((double) super.anInt10896 + local996 * (double) arg1);
									super.anInt10899 = (int) ((double) super.anInt10899 + local1004 * (double) arg1);
									super.anInt10900 = (int) ((double) super.anInt10900 + local1012 * (double) arg1);
								}
							} else if (local780.anInt5071 == 0) {
								local296 += ((double) local776.anInt2468 - local871) * (double) arg1;
								local300 += ((double) local780.anInt5068 - local871) * (double) arg1;
								local304 += ((double) local776.anInt2470 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt10896 = (int) ((double) super.anInt10896 + ((double) local776.anInt2468 - local871) * (double) arg1);
								super.anInt10899 = (int) ((double) super.anInt10899 + ((double) local780.anInt5068 - local871) * (double) arg1);
								super.anInt10900 = (int) ((double) super.anInt10900 + ((double) local776.anInt2470 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub1_Sub4) Static186.aClass170_1.method4522();
						}
					}
				}
			}
		}
		if (local35.anIntArray452 != null) {
			if (local35.anIntArray451 == null) {
				local35.anIntArray451 = new int[local35.anIntArray452.length];
				for (local317 = 0; local317 < local35.anIntArray452.length; local317++) {
					Static661.method9672(local35.anIntArray452[local317]);
					local35.anIntArray451[local317] = ((Class2_Sub14) Static346.aClass335_20.method8357((long) local35.anIntArray452[local317])).anInt1303;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray451.length; local317++) {
				@Pc(1137) Class172 local1137 = Static31.aClass172Array1[local35.anIntArray451[local317]];
				if (local1137.anInt5071 == 0) {
					local296 += (double) (local1137.anInt5067 * arg1);
					local300 += (double) (local1137.anInt5068 * arg1);
					local304 += (double) (local1137.anInt5058 * arg1);
					local306 = true;
				} else {
					super.anInt10896 += local1137.anInt5067 * arg1;
					super.anInt10899 += local1137.anInt5068 * arg1;
					super.anInt10900 += local1137.anInt5058 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort123 = (short) (int) local296;
					this.aShort122 = (short) (int) local300;
					this.aShort120 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt10904 <<= 0x1;
			}
		}
		super.anInt10896 = (int) ((long) super.anInt10896 + ((long) this.aShort123 * (long) (this.anInt10904 << 2) >> 23) * (long) arg1);
		super.anInt10899 = (int) ((long) super.anInt10899 + ((long) this.aShort122 * (long) (this.anInt10904 << 2) >> 23) * (long) arg1);
		super.anInt10900 = (int) ((long) super.anInt10900 + ((long) this.aShort120 * (long) (this.anInt10904 << 2) >> 23) * (long) arg1);
	}
}

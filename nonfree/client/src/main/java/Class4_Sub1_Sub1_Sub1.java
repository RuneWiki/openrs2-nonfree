import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!lga", name = "E", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!lga", name = "L", descriptor = "I")
	private int anInt5795;

	@OriginalMember(owner = "client!lga", name = "I", descriptor = "Lclient!we;")
	public Class4_Sub10 aClass4_Sub10_1;

	@OriginalMember(owner = "client!lga", name = "H", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!lga", name = "M", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!lga", name = "F", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!lga", name = "G", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!lga", name = "J", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!lga", name = "K", descriptor = "I")
	private int anInt5796;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!we;IIIIIIIIIIIZZ)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub10_1 = arg0;
		super.anInt5792 = arg1 << 12;
		super.anInt5786 = arg2 << 12;
		super.anInt5791 = arg3 << 12;
		super.anInt5784 = arg9;
		this.aShort65 = this.aShort68 = (short) arg8;
		super.anInt5793 = arg10;
		super.anInt5789 = arg11;
		super.aBoolean490 = arg13;
		this.aShort66 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort64 = (short) arg6;
		this.anInt5796 = arg7;
		super.aByte78 = this.aClass4_Sub10_1.aClass364_2.aByte130;
		this.method5196();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "()V")
	public void method5192() {
		this.aClass4_Sub10_1.aClass4_Sub7_8.aClass4_Sub1_Sub1_Sub1Array2[this.aShort63] = null;
		Static249.aClass4_Sub1_Sub1_Sub1Array1[Static245.anInt3829] = this;
		Static245.anInt3829 = Static245.anInt3829 + 1 & 0x3FF;
		this.method9416();
		this.method5235();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method5193(@OriginalArg(0) Class145 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5792 >> Static260.anInt4053 + 12;
		@Pc(13) int local13 = super.anInt5791 >> Static260.anInt4053 + 12;
		@Pc(18) int local18 = super.anInt5786 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static372.anInt5930 || local13 < 0 || local13 >= Static545.anInt8590) {
			this.method5192();
			return;
		}
		@Pc(40) Class4_Sub7 local40 = this.aClass4_Sub10_1.aClass4_Sub7_8;
		@Pc(44) Class334 local44 = this.aClass4_Sub10_1.aClass334_1;
		@Pc(46) Class133[] local46 = Static158.aClass133Array4;
		@Pc(49) int local49 = local40.anInt4031;
		@Pc(58) Class311 local58 = Static632.aClass311ArrayArrayArray3[local40.anInt4031][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte118;
		}
		@Pc(71) int local71 = local46[local49].method8217(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static97.anInt1761 - 1) {
			local86 = local46[local49 + 1].method8217(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static260.anInt4053);
		}
		if (local44.aBoolean762) {
			if (local44.anInt8938 == -1 && local18 > local71) {
				this.method5192();
				return;
			}
			if (local44.anInt8938 >= 0 && local18 > local46[local44.anInt8938].method8217(local6, local13)) {
				this.method5192();
				return;
			}
			if (local44.anInt8924 == -1 && local18 < local86) {
				this.method5192();
				return;
			}
			if (local44.anInt8924 >= 0 && local18 < local46[local44.anInt8924 + 1].method8217(local6, local13)) {
				this.method5192();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static97.anInt1761 - 1; local154 > 0 && local18 > local46[local154].method8217(local6, local13); local154--) {
		}
		if (local44.aBoolean758 && local154 == 0 && local18 > local46[0].method8217(local6, local13)) {
			this.method5192();
		} else if (local154 == Static97.anInt1761 - 1 && local46[local154].method8217(local6, local13) - local18 > 0x8 << Static260.anInt4053) {
			this.method5192();
		} else {
			local58 = Static632.aClass311ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static632.aClass311ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static632.aClass311ArrayArrayArray3[0][local6][local13] = new Class311(0);
				}
				@Pc(251) boolean local251 = Static632.aClass311ArrayArrayArray3[0][local6][local13].aClass311_1 != null;
				if (local154 == 3 && local251) {
					this.method5192();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static632.aClass311ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static632.aClass311ArrayArrayArray3[local261][local6][local13] = new Class311(local261);
						if (local251) {
							local58.aByte118++;
						}
					}
				}
			}
			if (local44.aBoolean763) {
				@Pc(304) int local304 = super.anInt5792 >> 12;
				local261 = super.anInt5791 >> 12;
				@Pc(318) Class187 local318;
				if (local58.aClass4_Sub2_Sub3_2 != null) {
					local318 = local58.aClass4_Sub2_Sub3_2.method8971(arg0);
					if (local318 != null && local318.method3978(local261, local18, local304)) {
						this.method5192();
						return;
					}
				}
				if (local58.aClass4_Sub2_Sub3_1 != null) {
					local318 = local58.aClass4_Sub2_Sub3_1.method8971(arg0);
					if (local318 != null && local318.method3978(local261, local18, local304)) {
						this.method5192();
						return;
					}
				}
				if (local58.aClass4_Sub2_Sub2_1 != null) {
					local318 = local58.aClass4_Sub2_Sub2_1.method8971(arg0);
					if (local318 != null && local318.method3978(local261, local18, local304)) {
						this.method5192();
						return;
					}
				}
				for (@Pc(375) Class142 local375 = local58.aClass142_2; local375 != null; local375 = local375.aClass142_1) {
					@Pc(382) Class187 local382 = local375.aClass4_Sub2_Sub1_1.method8971(arg0);
					if (local382 != null && local382.method3978(local261, local18, local304)) {
						this.method5192();
						return;
					}
				}
			}
			local40.aClass236_1.aClass58_1.method1195(this);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(JI)V")
	public void method5194(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort68 = (short) (this.aShort68 - arg1);
		if (this.aShort68 <= 0) {
			this.method5192();
			return;
		}
		@Pc(17) int local17 = super.anInt5792 >> 12;
		@Pc(22) int local22 = super.anInt5786 >> 12;
		@Pc(27) int local27 = super.anInt5791 >> 12;
		@Pc(31) Class4_Sub7 local31 = this.aClass4_Sub10_1.aClass4_Sub7_8;
		@Pc(35) Class334 local35 = this.aClass4_Sub10_1.aClass334_1;
		if (local35.anInt8944 != 0) {
			@Pc(65) int local65;
			if (this.aShort65 - this.aShort68 <= local35.anInt8966) {
				local65 = (super.anInt5784 >> 8 & 0xFF00) + (this.anInt5795 >> 16 & 0xFF) + local35.anInt8940 * arg1;
				@Pc(82) int local82 = (super.anInt5784 & 0xFF00) + (this.anInt5795 >> 8 & 0xFF) + local35.lb * arg1;
				@Pc(99) int local99 = ((super.anInt5784 & 0xFF) << 8) + (this.anInt5795 & 0xFF) + local35.anInt8935 * arg1;
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
				super.anInt5784 &= 0xFF000000;
				super.anInt5784 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5795 &= 0xFF000000;
				this.anInt5795 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort65 - this.aShort68 <= local35.anInt8965) {
				local65 = (super.anInt5784 >> 16 & 0xFF00) + (this.anInt5795 >> 24 & 0xFF) + local35.anInt8936 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5784 &= 0xFFFFFF;
				super.anInt5784 |= (local65 & 0xFF00) << 16;
				this.anInt5795 &= 0xFFFFFF;
				this.anInt5795 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8921 != -1 && this.aShort65 - this.aShort68 <= local35.anInt8931) {
			this.anInt5796 += local35.anInt8967 * arg1;
		}
		if (local35.anInt8973 != -1 && this.aShort65 - this.aShort68 <= local35.anInt8941) {
			super.anInt5793 += local35.anInt8933 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort66;
		@Pc(300) double local300 = (double) this.aShort67;
		@Pc(304) double local304 = (double) this.aShort64;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt8939 == 1) {
			local317 = local17 - this.aClass4_Sub10_1.aClass340_1.anInt9218;
			local324 = local22 - this.aClass4_Sub10_1.aClass340_1.anInt9217;
			local331 = local27 - this.aClass4_Sub10_1.aClass340_1.anInt9226;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt8956 * local348 * arg1);
			this.anInt5796 = (int) ((long) this.anInt5796 - ((long) this.anInt5796 * local356 >> 18));
		} else if (local35.anInt8939 == 2) {
			local317 = local17 - this.aClass4_Sub10_1.aClass340_1.anInt9218;
			local324 = local22 - this.aClass4_Sub10_1.aClass340_1.anInt9217;
			local331 = local27 - this.aClass4_Sub10_1.aClass340_1.anInt9226;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt8956 * local348 * arg1);
			this.anInt5796 = (int) ((long) this.anInt5796 - ((long) this.anInt5796 * local356 >> 28));
		}
		if (local35.anIntArray654 != null) {
			@Pc(437) Class2 local437 = local31.aClass60_84.aClass2_47;
			for (@Pc(440) Class2 local440 = local437.aClass2_345; local440 != local437; local440 = local440.aClass2_345) {
				@Pc(444) Class2_Sub6_Sub10 local444 = (Class2_Sub6_Sub10) local440;
				@Pc(447) Class379 local447 = local444.aClass379_1;
				if (local447.anInt10445 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray654.length; local455++) {
						if (local35.anIntArray654[local455] == local447.anInt10436) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt5720);
						@Pc(486) double local486 = (double) (local22 - local444.anInt5717);
						@Pc(492) double local492 = (double) (local27 - local444.anInt5719);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong328)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt5718 + local486 * (double) local447.anInt10433 + local492 * (double) local444.anInt5721) * 65535.0D / ((double) local447.anInt10438 * local513);
							if (!(local545 < (double) local447.anInt10447)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt10437 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt10440;
								} else if (local447.anInt10437 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt10440;
								}
								if (local447.anInt10441 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt10438;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt10438;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt10438;
									if (local447.anInt10431 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt5792 = (int) ((double) super.anInt5792 + local678 * (double) arg1);
										super.anInt5786 = (int) ((double) super.anInt5786 + local686 * (double) arg1);
										super.anInt5791 = (int) ((double) super.anInt5791 + local694 * (double) arg1);
									}
								} else if (local447.anInt10431 == 0) {
									local296 += ((double) local444.anInt5718 - local553) * (double) arg1;
									local300 += ((double) local447.anInt10433 - local553) * (double) arg1;
									local304 += ((double) local444.anInt5721 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt5792 = (int) ((double) super.anInt5792 + ((double) local444.anInt5718 - local553) * (double) arg1);
									super.anInt5786 = (int) ((double) super.anInt5786 + ((double) local447.anInt10433 - local553) * (double) arg1);
									super.anInt5791 = (int) ((double) super.anInt5791 + ((double) local444.anInt5721 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray652 != null) {
			for (local317 = 0; local317 < local35.anIntArray652.length; local317++) {
				@Pc(776) Class2_Sub6_Sub10 local776 = (Class2_Sub6_Sub10) Static382.aClass244_1.method5895((long) local35.anIntArray652[local317]);
				while (local776 != null) {
					@Pc(780) Class379 local780 = local776.aClass379_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt5720);
					@Pc(792) double local792 = (double) (local22 - local776.anInt5717);
					@Pc(798) double local798 = (double) (local27 - local776.anInt5719);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong328) {
						local776 = (Class2_Sub6_Sub10) Static382.aClass244_1.method5893();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt5718 + local792 * (double) local780.anInt10433 + local798 * (double) local776.anInt5721) * 65535.0D / ((double) local780.anInt10438 * local825);
						if (local857 < (double) local780.anInt10447) {
							local776 = (Class2_Sub6_Sub10) Static382.aClass244_1.method5893();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt10437 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt10440;
							} else if (local780.anInt10437 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt10440;
							}
							if (local780.anInt10441 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt10438;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt10438;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt10438;
								if (local780.anInt10431 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt5792 = (int) ((double) super.anInt5792 + local996 * (double) arg1);
									super.anInt5786 = (int) ((double) super.anInt5786 + local1004 * (double) arg1);
									super.anInt5791 = (int) ((double) super.anInt5791 + local1012 * (double) arg1);
								}
							} else if (local780.anInt10431 == 0) {
								local296 += ((double) local776.anInt5718 - local871) * (double) arg1;
								local300 += ((double) local780.anInt10433 - local871) * (double) arg1;
								local304 += ((double) local776.anInt5721 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt5792 = (int) ((double) super.anInt5792 + ((double) local776.anInt5718 - local871) * (double) arg1);
								super.anInt5786 = (int) ((double) super.anInt5786 + ((double) local780.anInt10433 - local871) * (double) arg1);
								super.anInt5791 = (int) ((double) super.anInt5791 + ((double) local776.anInt5721 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub6_Sub10) Static382.aClass244_1.method5893();
						}
					}
				}
			}
		}
		if (local35.anIntArray651 != null) {
			if (local35.anIntArray653 == null) {
				local35.anIntArray653 = new int[local35.anIntArray651.length];
				for (local317 = 0; local317 < local35.anIntArray651.length; local317++) {
					Static556.method7762(local35.anIntArray651[local317]);
					local35.anIntArray653[local317] = ((Class2_Sub2) Static193.aClass218_14.method5095((long) local35.anIntArray651[local317], 0)).anInt41;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray653.length; local317++) {
				@Pc(1137) Class379 local1137 = Static280.aClass379Array2[local35.anIntArray653[local317]];
				if (local1137.anInt10431 == 0) {
					local296 += (double) (local1137.anInt10442 * arg1);
					local300 += (double) (local1137.anInt10433 * arg1);
					local304 += (double) (local1137.anInt10443 * arg1);
					local306 = true;
				} else {
					super.anInt5792 += local1137.anInt10442 * arg1;
					super.anInt5786 += local1137.anInt10433 * arg1;
					super.anInt5791 += local1137.anInt10443 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort66 = (short) (int) local296;
					this.aShort67 = (short) (int) local300;
					this.aShort64 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt5796 <<= 0x1;
			}
		}
		super.anInt5792 = (int) ((long) super.anInt5792 + ((long) this.aShort66 * (long) (this.anInt5796 << 2) >> 23) * (long) arg1);
		super.anInt5786 = (int) ((long) super.anInt5786 + ((long) this.aShort67 * (long) (this.anInt5796 << 2) >> 23) * (long) arg1);
		super.anInt5791 = (int) ((long) super.anInt5791 + ((long) this.aShort64 * (long) (this.anInt5796 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!we;IIIIIIIIIIIZZ)V")
	public void method5195(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub10_1 = arg0;
		super.anInt5792 = arg1 << 12;
		super.anInt5786 = arg2 << 12;
		super.anInt5791 = arg3 << 12;
		super.anInt5784 = arg9;
		this.aShort65 = this.aShort68 = (short) arg8;
		super.anInt5793 = arg10;
		super.anInt5789 = arg11;
		super.aBoolean490 = arg13;
		this.aShort66 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort64 = (short) arg6;
		this.anInt5796 = arg7;
		super.aByte78 = this.aClass4_Sub10_1.aClass364_2.aByte130;
		this.method5196();
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "()V")
	private void method5196() {
		@Pc(4) int local4 = this.aClass4_Sub10_1.aClass4_Sub7_8.anInt4029;
		if (this.aClass4_Sub10_1.aClass4_Sub7_8.aClass4_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass4_Sub10_1.aClass4_Sub7_8.aClass4_Sub1_Sub1_Sub1Array2[local4].method5192();
		}
		this.aClass4_Sub10_1.aClass4_Sub7_8.aClass4_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort63 = (short) this.aClass4_Sub10_1.aClass4_Sub7_8.anInt4029;
		this.aClass4_Sub10_1.aClass4_Sub7_8.anInt4029 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub10_1.aClass320_9.method7600(this);
	}
}

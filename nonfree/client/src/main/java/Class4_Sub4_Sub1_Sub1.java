import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class4_Sub4_Sub1_Sub1 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
	private int anInt7741;

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "Lclient!bw;")
	public Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
	private int anInt7740;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!bw;IIIIIIIIIIIZZ)V")
	public Class4_Sub4_Sub1_Sub1(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub2_1 = arg0;
		super.anInt7730 = arg1 << 12;
		super.anInt7738 = arg2 << 12;
		super.anInt7735 = arg3 << 12;
		super.anInt7731 = arg9;
		this.aShort86 = this.aShort90 = (short) arg8;
		super.anInt7734 = arg10;
		super.anInt7739 = arg11;
		super.aBoolean520 = arg13;
		this.aShort87 = (short) arg4;
		this.aShort88 = (short) arg5;
		this.aShort89 = (short) arg6;
		this.anInt7740 = arg7;
		super.aByte109 = this.aClass4_Sub2_1.aClass363_1.aByte137;
		this.method6726();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method6723(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt7730 >> Static314.anInt5377 + 12;
		@Pc(13) int local13 = super.anInt7735 >> Static314.anInt5377 + 12;
		@Pc(18) int local18 = super.anInt7738 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static672.anInt10829 || local13 < 0 || local13 >= Static532.anInt8517) {
			this.method6724();
			return;
		}
		@Pc(40) Class4_Sub9 local40 = this.aClass4_Sub2_1.aClass4_Sub9_1;
		@Pc(44) Class254 local44 = this.aClass4_Sub2_1.aClass254_1;
		@Pc(46) Class84[] local46 = Static177.aClass84Array2;
		@Pc(49) int local49 = local40.anInt9449;
		@Pc(58) Class128 local58 = Static283.aClass128ArrayArrayArray1[local40.anInt9449][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte40;
		}
		@Pc(71) int local71 = local46[local49].method7620(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static237.anInt4100 - 1) {
			local86 = local46[local49 + 1].method7620(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static314.anInt5377);
		}
		if (local44.aBoolean435) {
			if (local44.anInt6725 == -1 && local18 > local71) {
				this.method6724();
				return;
			}
			if (local44.anInt6725 >= 0 && local18 > local46[local44.anInt6725].method7620(local13, local6)) {
				this.method6724();
				return;
			}
			if (local44.anInt6678 == -1 && local18 < local86) {
				this.method6724();
				return;
			}
			if (local44.anInt6678 >= 0 && local18 < local46[local44.anInt6678 + 1].method7620(local13, local6)) {
				this.method6724();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static237.anInt4100 - 1; local154 > 0 && local18 > local46[local154].method7620(local13, local6); local154--) {
		}
		if (local44.aBoolean441 && local154 == 0 && local18 > local46[0].method7620(local13, local6)) {
			this.method6724();
		} else if (local154 == Static237.anInt4100 - 1 && local46[local154].method7620(local13, local6) - local18 > 0x8 << Static314.anInt5377) {
			this.method6724();
		} else {
			local58 = Static283.aClass128ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static283.aClass128ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static283.aClass128ArrayArrayArray1[0][local6][local13] = new Class128(0);
				}
				@Pc(251) boolean local251 = Static283.aClass128ArrayArrayArray1[0][local6][local13].aClass128_1 != null;
				if (local154 == 3 && local251) {
					this.method6724();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static283.aClass128ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static283.aClass128ArrayArrayArray1[local261][local6][local13] = new Class128(local261);
						if (local251) {
							local58.aByte40++;
						}
					}
				}
			}
			if (local44.aBoolean443) {
				@Pc(304) int local304 = super.anInt7730 >> 12;
				local261 = super.anInt7735 >> 12;
				@Pc(318) Class315 local318;
				if (local58.aClass4_Sub1_Sub2_2 != null) {
					local318 = local58.aClass4_Sub1_Sub2_2.method8350(arg0);
					if (local318 != null && local318.method7069(local18, local261, local304)) {
						this.method6724();
						return;
					}
				}
				if (local58.aClass4_Sub1_Sub2_1 != null) {
					local318 = local58.aClass4_Sub1_Sub2_1.method8350(arg0);
					if (local318 != null && local318.method7069(local18, local261, local304)) {
						this.method6724();
						return;
					}
				}
				if (local58.aClass4_Sub1_Sub3_1 != null) {
					local318 = local58.aClass4_Sub1_Sub3_1.method8350(arg0);
					if (local318 != null && local318.method7069(local18, local261, local304)) {
						this.method6724();
						return;
					}
				}
				for (@Pc(375) Class299 local375 = local58.aClass299_2; local375 != null; local375 = local375.aClass299_3) {
					@Pc(382) Class315 local382 = local375.aClass4_Sub1_Sub1_1.method8350(arg0);
					if (local382 != null && local382.method7069(local18, local261, local304)) {
						this.method6724();
						return;
					}
				}
			}
			local40.aClass336_1.aClass179_1.method4236(this);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
	public void method6724() {
		this.aClass4_Sub2_1.aClass4_Sub9_1.aClass4_Sub4_Sub1_Sub1Array2[this.aShort85] = null;
		Static342.aClass4_Sub4_Sub1_Sub1Array1[Static582.anInt9371] = this;
		Static582.anInt9371 = Static582.anInt9371 + 1 & 0x3FF;
		this.method8570();
		this.method8572();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!bw;IIIIIIIIIIIZZ)V")
	public void method6725(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub2_1 = arg0;
		super.anInt7730 = arg1 << 12;
		super.anInt7738 = arg2 << 12;
		super.anInt7735 = arg3 << 12;
		super.anInt7731 = arg9;
		this.aShort86 = this.aShort90 = (short) arg8;
		super.anInt7734 = arg10;
		super.anInt7739 = arg11;
		super.aBoolean520 = arg13;
		this.aShort87 = (short) arg4;
		this.aShort88 = (short) arg5;
		this.aShort89 = (short) arg6;
		this.anInt7740 = arg7;
		super.aByte109 = this.aClass4_Sub2_1.aClass363_1.aByte137;
		this.method6726();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	private void method6726() {
		@Pc(4) int local4 = this.aClass4_Sub2_1.aClass4_Sub9_1.anInt9447;
		if (this.aClass4_Sub2_1.aClass4_Sub9_1.aClass4_Sub4_Sub1_Sub1Array2[local4] != null) {
			this.aClass4_Sub2_1.aClass4_Sub9_1.aClass4_Sub4_Sub1_Sub1Array2[local4].method6724();
		}
		this.aClass4_Sub2_1.aClass4_Sub9_1.aClass4_Sub4_Sub1_Sub1Array2[local4] = this;
		this.aShort85 = (short) this.aClass4_Sub2_1.aClass4_Sub9_1.anInt9447;
		this.aClass4_Sub2_1.aClass4_Sub9_1.anInt9447 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub2_1.aClass387_1.method9017(this);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)V")
	public void method6727(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort90 = (short) (this.aShort90 - arg1);
		if (this.aShort90 <= 0) {
			this.method6724();
			return;
		}
		@Pc(17) int local17 = super.anInt7730 >> 12;
		@Pc(22) int local22 = super.anInt7738 >> 12;
		@Pc(27) int local27 = super.anInt7735 >> 12;
		@Pc(31) Class4_Sub9 local31 = this.aClass4_Sub2_1.aClass4_Sub9_1;
		@Pc(35) Class254 local35 = this.aClass4_Sub2_1.aClass254_1;
		if (local35.anInt6683 != 0) {
			@Pc(65) int local65;
			if (this.aShort86 - this.aShort90 <= local35.anInt6704) {
				local65 = (super.anInt7731 >> 8 & 0xFF00) + (this.anInt7741 >> 16 & 0xFF) + local35.anInt6699 * arg1;
				@Pc(82) int local82 = (super.anInt7731 & 0xFF00) + (this.anInt7741 >> 8 & 0xFF) + local35.anInt6680 * arg1;
				@Pc(99) int local99 = ((super.anInt7731 & 0xFF) << 8) + (this.anInt7741 & 0xFF) + local35.anInt6723 * arg1;
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
				super.anInt7731 &= 0xFF000000;
				super.anInt7731 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7741 &= 0xFF000000;
				this.anInt7741 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort86 - this.aShort90 <= local35.anInt6690) {
				local65 = (super.anInt7731 >> 16 & 0xFF00) + (this.anInt7741 >> 24 & 0xFF) + local35.anInt6722 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7731 &= 0xFFFFFF;
				super.anInt7731 |= (local65 & 0xFF00) << 16;
				this.anInt7741 &= 0xFFFFFF;
				this.anInt7741 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6682 != -1 && this.aShort86 - this.aShort90 <= local35.anInt6726) {
			this.anInt7740 += local35.anInt6720 * arg1;
		}
		if (local35.anInt6681 != -1 && this.aShort86 - this.aShort90 <= local35.anInt6712) {
			super.anInt7734 += local35.anInt6724 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort87;
		@Pc(300) double local300 = (double) this.aShort88;
		@Pc(304) double local304 = (double) this.aShort89;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt6719 == 1) {
			local317 = local17 - this.aClass4_Sub2_1.aClass317_1.anInt8317;
			local324 = local22 - this.aClass4_Sub2_1.aClass317_1.anInt8326;
			local331 = local27 - this.aClass4_Sub2_1.aClass317_1.anInt8316;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt6714 * local348 * arg1);
			this.anInt7740 = (int) ((long) this.anInt7740 - ((long) this.anInt7740 * local356 >> 18));
		} else if (local35.anInt6719 == 2) {
			local317 = local17 - this.aClass4_Sub2_1.aClass317_1.anInt8317;
			local324 = local22 - this.aClass4_Sub2_1.aClass317_1.anInt8326;
			local331 = local27 - this.aClass4_Sub2_1.aClass317_1.anInt8316;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt6714 * local348 * arg1);
			this.anInt7740 = (int) ((long) this.anInt7740 - ((long) this.anInt7740 * local356 >> 28));
		}
		if (local35.anIntArray383 != null) {
			@Pc(437) Class5 local437 = local31.aClass20_60.aClass5_19;
			for (@Pc(440) Class5 local440 = local437.aClass5_338; local440 != local437; local440 = local440.aClass5_338) {
				@Pc(444) Class5_Sub1_Sub7 local444 = (Class5_Sub1_Sub7) local440;
				@Pc(447) Class274 local447 = local444.aClass274_1;
				if (local447.anInt7211 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray383.length; local455++) {
						if (local35.anIntArray383[local455] == local447.anInt7207) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt3754);
						@Pc(486) double local486 = (double) (local22 - local444.anInt3752);
						@Pc(492) double local492 = (double) (local27 - local444.anInt3750);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong206)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt3751 + local486 * (double) local447.anInt7224 + local492 * (double) local444.anInt3755) * 65535.0D / ((double) local447.anInt7216 * local513);
							if (!(local545 < (double) local447.anInt7219)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt7217 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt7218;
								} else if (local447.anInt7217 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt7218;
								}
								if (local447.anInt7210 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt7216;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt7216;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt7216;
									if (local447.anInt7220 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt7730 = (int) ((double) super.anInt7730 + local678 * (double) arg1);
										super.anInt7738 = (int) ((double) super.anInt7738 + local686 * (double) arg1);
										super.anInt7735 = (int) ((double) super.anInt7735 + local694 * (double) arg1);
									}
								} else if (local447.anInt7220 == 0) {
									local296 += ((double) local444.anInt3751 - local553) * (double) arg1;
									local300 += ((double) local447.anInt7224 - local553) * (double) arg1;
									local304 += ((double) local444.anInt3755 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt7730 = (int) ((double) super.anInt7730 + ((double) local444.anInt3751 - local553) * (double) arg1);
									super.anInt7738 = (int) ((double) super.anInt7738 + ((double) local447.anInt7224 - local553) * (double) arg1);
									super.anInt7735 = (int) ((double) super.anInt7735 + ((double) local444.anInt3755 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray380 != null) {
			for (local317 = 0; local317 < local35.anIntArray380.length; local317++) {
				@Pc(776) Class5_Sub1_Sub7 local776 = (Class5_Sub1_Sub7) Static7.aClass296_1.method6675((long) local35.anIntArray380[local317]);
				while (local776 != null) {
					@Pc(780) Class274 local780 = local776.aClass274_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt3754);
					@Pc(792) double local792 = (double) (local22 - local776.anInt3752);
					@Pc(798) double local798 = (double) (local27 - local776.anInt3750);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong206) {
						local776 = (Class5_Sub1_Sub7) Static7.aClass296_1.method6673();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt3751 + local792 * (double) local780.anInt7224 + local798 * (double) local776.anInt3755) * 65535.0D / ((double) local780.anInt7216 * local825);
						if (local857 < (double) local780.anInt7219) {
							local776 = (Class5_Sub1_Sub7) Static7.aClass296_1.method6673();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt7217 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt7218;
							} else if (local780.anInt7217 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt7218;
							}
							if (local780.anInt7210 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt7216;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt7216;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt7216;
								if (local780.anInt7220 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt7730 = (int) ((double) super.anInt7730 + local996 * (double) arg1);
									super.anInt7738 = (int) ((double) super.anInt7738 + local1004 * (double) arg1);
									super.anInt7735 = (int) ((double) super.anInt7735 + local1012 * (double) arg1);
								}
							} else if (local780.anInt7220 == 0) {
								local296 += ((double) local776.anInt3751 - local871) * (double) arg1;
								local300 += ((double) local780.anInt7224 - local871) * (double) arg1;
								local304 += ((double) local776.anInt3755 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt7730 = (int) ((double) super.anInt7730 + ((double) local776.anInt3751 - local871) * (double) arg1);
								super.anInt7738 = (int) ((double) super.anInt7738 + ((double) local780.anInt7224 - local871) * (double) arg1);
								super.anInt7735 = (int) ((double) super.anInt7735 + ((double) local776.anInt3755 - local871) * (double) arg1);
							}
							local776 = (Class5_Sub1_Sub7) Static7.aClass296_1.method6673();
						}
					}
				}
			}
		}
		if (local35.anIntArray384 != null) {
			if (local35.anIntArray381 == null) {
				local35.anIntArray381 = new int[local35.anIntArray384.length];
				for (local317 = 0; local317 < local35.anIntArray384.length; local317++) {
					Static257.method4233(local35.anIntArray384[local317]);
					local35.anIntArray381[local317] = ((Class5_Sub43) Static17.aClass306_2.method6943((long) local35.anIntArray384[local317])).anInt6989;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray381.length; local317++) {
				@Pc(1137) Class274 local1137 = Static518.aClass274Array1[local35.anIntArray381[local317]];
				if (local1137.anInt7220 == 0) {
					local296 += (double) (local1137.anInt7214 * arg1);
					local300 += (double) (local1137.anInt7224 * arg1);
					local304 += (double) (local1137.anInt7223 * arg1);
					local306 = true;
				} else {
					super.anInt7730 += local1137.anInt7214 * arg1;
					super.anInt7738 += local1137.anInt7224 * arg1;
					super.anInt7735 += local1137.anInt7223 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort87 = (short) (int) local296;
					this.aShort88 = (short) (int) local300;
					this.aShort89 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt7740 <<= 0x1;
			}
		}
		super.anInt7730 = (int) ((long) super.anInt7730 + ((long) this.aShort87 * (long) (this.anInt7740 << 2) >> 23) * (long) arg1);
		super.anInt7738 = (int) ((long) super.anInt7738 + ((long) this.aShort88 * (long) (this.anInt7740 << 2) >> 23) * (long) arg1);
		super.anInt7735 = (int) ((long) super.anInt7735 + ((long) this.aShort89 * (long) (this.anInt7740 << 2) >> 23) * (long) arg1);
	}
}

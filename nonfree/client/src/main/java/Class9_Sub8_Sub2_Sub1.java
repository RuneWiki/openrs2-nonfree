import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class9_Sub8_Sub2_Sub1 extends Class9_Sub8_Sub2 {

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
	private int anInt6183;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "Lclient!fk;")
	public Class9_Sub3 aClass9_Sub3_1;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
	private int anInt6184;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!fk;IIIIIIIIIIIZZ)V")
	public Class9_Sub8_Sub2_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub3_1 = arg0;
		super.anInt6176 = arg1 << 12;
		super.anInt6177 = arg2 << 12;
		super.anInt6180 = arg3 << 12;
		super.anInt6178 = arg9;
		this.aShort79 = this.aShort84 = (short) arg8;
		super.anInt6181 = arg10;
		super.anInt6182 = arg11;
		super.aBoolean505 = arg13;
		this.aShort80 = (short) arg4;
		this.aShort82 = (short) arg5;
		this.aShort81 = (short) arg6;
		this.anInt6184 = arg7;
		super.aByte78 = this.aClass9_Sub3_1.aClass323_1.aByte117;
		this.method5342();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
	public void method5339(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort84 = (short) (this.aShort84 - arg1);
		if (this.aShort84 <= 0) {
			this.method5341();
			return;
		}
		@Pc(17) int local17 = super.anInt6176 >> 12;
		@Pc(22) int local22 = super.anInt6177 >> 12;
		@Pc(27) int local27 = super.anInt6180 >> 12;
		@Pc(31) Class9_Sub6 local31 = this.aClass9_Sub3_1.aClass9_Sub6_4;
		@Pc(35) Class361 local35 = this.aClass9_Sub3_1.aClass361_1;
		if (local35.lb != 0) {
			@Pc(65) int local65;
			if (this.aShort79 - this.aShort84 <= local35.anInt9272) {
				local65 = (super.anInt6178 >> 8 & 0xFF00) + (this.anInt6183 >> 16 & 0xFF) + local35.anInt9258 * arg1;
				@Pc(82) int local82 = (super.anInt6178 & 0xFF00) + (this.anInt6183 >> 8 & 0xFF) + local35.anInt9265 * arg1;
				@Pc(99) int local99 = ((super.anInt6178 & 0xFF) << 8) + (this.anInt6183 & 0xFF) + local35.anInt9286 * arg1;
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
				super.anInt6178 &= 0xFF000000;
				super.anInt6178 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6183 &= 0xFF000000;
				this.anInt6183 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort79 - this.aShort84 <= local35.anInt9276) {
				local65 = (super.anInt6178 >> 16 & 0xFF00) + (this.anInt6183 >> 24 & 0xFF) + local35.anInt9290 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6178 &= 0xFFFFFF;
				super.anInt6178 |= (local65 & 0xFF00) << 16;
				this.anInt6183 &= 0xFFFFFF;
				this.anInt6183 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt9251 != -1 && this.aShort79 - this.aShort84 <= local35.anInt9246) {
			this.anInt6184 += local35.anInt9291 * arg1;
		}
		if (local35.anInt9256 != -1 && this.aShort79 - this.aShort84 <= local35.anInt9284) {
			super.anInt6181 += local35.anInt9255 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort80;
		@Pc(300) double local300 = (double) this.aShort82;
		@Pc(304) double local304 = (double) this.aShort81;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt9259 == 1) {
			local317 = local17 - this.aClass9_Sub3_1.aClass350_1.anInt9022;
			local324 = local22 - this.aClass9_Sub3_1.aClass350_1.anInt9013;
			local331 = local27 - this.aClass9_Sub3_1.aClass350_1.anInt9014;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt9273 * local348 * arg1;
			this.anInt6184 = (int) ((long) this.anInt6184 - ((long) this.anInt6184 * local356 >> 18));
		} else if (local35.anInt9259 == 2) {
			local317 = local17 - this.aClass9_Sub3_1.aClass350_1.anInt9022;
			local324 = local22 - this.aClass9_Sub3_1.aClass350_1.anInt9013;
			local331 = local27 - this.aClass9_Sub3_1.aClass350_1.anInt9014;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt9273 * local348 * arg1;
			this.anInt6184 = (int) ((long) this.anInt6184 - ((long) this.anInt6184 * local356 >> 28));
		}
		if (local35.anIntArray688 != null) {
			@Pc(437) Class3 local437 = local31.aClass130_14.aClass3_121;
			for (@Pc(440) Class3 local440 = local437.aClass3_285; local440 != local437; local440 = local440.aClass3_285) {
				@Pc(444) Class3_Sub3_Sub9 local444 = (Class3_Sub3_Sub9) local440;
				@Pc(447) Class110 local447 = local444.aClass110_1;
				if (local447.anInt3240 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray688.length; local455++) {
						if (local35.anIntArray688[local455] == local447.anInt3236) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt2425);
						@Pc(486) double local486 = (double) (local22 - local444.anInt2428);
						@Pc(492) double local492 = (double) (local27 - local444.anInt2426);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong93)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt2421 + local486 * (double) local447.anInt3237 + local492 * (double) local444.anInt2424) * 65535.0D / ((double) local447.anInt3234 * local513);
							if (!(local545 < (double) local447.anInt3238)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt3230 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt3235;
								} else if (local447.anInt3230 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt3235;
								}
								if (local447.anInt3239 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt3234;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt3234;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt3234;
									if (local447.anInt3225 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt6176 = (int) ((double) super.anInt6176 + local678 * (double) arg1);
										super.anInt6177 = (int) ((double) super.anInt6177 + local686 * (double) arg1);
										super.anInt6180 = (int) ((double) super.anInt6180 + local694 * (double) arg1);
									}
								} else if (local447.anInt3225 == 0) {
									local296 += ((double) local444.anInt2421 - local553) * (double) arg1;
									local300 += ((double) local447.anInt3237 - local553) * (double) arg1;
									local304 += ((double) local444.anInt2424 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt6176 = (int) ((double) super.anInt6176 + ((double) local444.anInt2421 - local553) * (double) arg1);
									super.anInt6177 = (int) ((double) super.anInt6177 + ((double) local447.anInt3237 - local553) * (double) arg1);
									super.anInt6180 = (int) ((double) super.anInt6180 + ((double) local444.anInt2424 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray689 != null) {
			for (local317 = 0; local317 < local35.anIntArray689.length; local317++) {
				@Pc(776) Class3_Sub3_Sub9 local776 = (Class3_Sub3_Sub9) Static260.aClass35_1.method824((long) local35.anIntArray689[local317]);
				while (local776 != null) {
					@Pc(780) Class110 local780 = local776.aClass110_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt2425);
					@Pc(792) double local792 = (double) (local22 - local776.anInt2428);
					@Pc(798) double local798 = (double) (local27 - local776.anInt2426);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong93) {
						local776 = (Class3_Sub3_Sub9) Static260.aClass35_1.method827();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt2421 + local792 * (double) local780.anInt3237 + local798 * (double) local776.anInt2424) * 65535.0D / ((double) local780.anInt3234 * local825);
						if (local857 < (double) local780.anInt3238) {
							local776 = (Class3_Sub3_Sub9) Static260.aClass35_1.method827();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt3230 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt3235;
							} else if (local780.anInt3230 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt3235;
							}
							if (local780.anInt3239 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt3234;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt3234;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt3234;
								if (local780.anInt3225 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt6176 = (int) ((double) super.anInt6176 + local996 * (double) arg1);
									super.anInt6177 = (int) ((double) super.anInt6177 + local1004 * (double) arg1);
									super.anInt6180 = (int) ((double) super.anInt6180 + local1012 * (double) arg1);
								}
							} else if (local780.anInt3225 == 0) {
								local296 += ((double) local776.anInt2421 - local871) * (double) arg1;
								local300 += ((double) local780.anInt3237 - local871) * (double) arg1;
								local304 += ((double) local776.anInt2424 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt6176 = (int) ((double) super.anInt6176 + ((double) local776.anInt2421 - local871) * (double) arg1);
								super.anInt6177 = (int) ((double) super.anInt6177 + ((double) local780.anInt3237 - local871) * (double) arg1);
								super.anInt6180 = (int) ((double) super.anInt6180 + ((double) local776.anInt2424 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub3_Sub9) Static260.aClass35_1.method827();
						}
					}
				}
			}
		}
		if (local35.anIntArray687 != null) {
			if (local35.anIntArray690 == null) {
				local35.anIntArray690 = new int[local35.anIntArray687.length];
				for (local317 = 0; local317 < local35.anIntArray687.length; local317++) {
					Static69.method1634(local35.anIntArray687[local317]);
					local35.anIntArray690[local317] = ((Class3_Sub4) Static55.aClass310_3.method6601((long) local35.anIntArray687[local317])).anInt109;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray690.length; local317++) {
				@Pc(1137) Class110 local1137 = Static407.aClass110Array1[local35.anIntArray690[local317]];
				if (local1137.anInt3225 == 0) {
					local296 += local1137.anInt3232 * arg1;
					local300 += local1137.anInt3237 * arg1;
					local304 += local1137.anInt3228 * arg1;
					local306 = true;
				} else {
					super.anInt6176 += local1137.anInt3232 * arg1;
					super.anInt6177 += local1137.anInt3237 * arg1;
					super.anInt6180 += local1137.anInt3228 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort80 = (short) local296;
					this.aShort82 = (short) local300;
					this.aShort81 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt6184 <<= 0x1;
			}
		}
		super.anInt6176 = (int) ((long) super.anInt6176 + ((long) this.aShort80 * (long) (this.anInt6184 << 2) >> 23) * (long) arg1);
		super.anInt6177 = (int) ((long) super.anInt6177 + ((long) this.aShort82 * (long) (this.anInt6184 << 2) >> 23) * (long) arg1);
		super.anInt6180 = (int) ((long) super.anInt6180 + ((long) this.aShort81 * (long) (this.anInt6184 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!fk;IIIIIIIIIIIZZ)V")
	public void method5340(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub3_1 = arg0;
		super.anInt6176 = arg1 << 12;
		super.anInt6177 = arg2 << 12;
		super.anInt6180 = arg3 << 12;
		super.anInt6178 = arg9;
		this.aShort79 = this.aShort84 = (short) arg8;
		super.anInt6181 = arg10;
		super.anInt6182 = arg11;
		super.aBoolean505 = arg13;
		this.aShort80 = (short) arg4;
		this.aShort82 = (short) arg5;
		this.aShort81 = (short) arg6;
		this.anInt6184 = arg7;
		super.aByte78 = this.aClass9_Sub3_1.aClass323_1.aByte117;
		this.method5342();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
	public void method5341() {
		this.aClass9_Sub3_1.aClass9_Sub6_4.aClass9_Sub8_Sub2_Sub1Array1[this.aShort83] = null;
		Static574.aClass9_Sub8_Sub2_Sub1Array2[Static374.anInt6347] = this;
		Static374.anInt6347 = Static374.anInt6347 + 1 & 0x3FF;
		this.method7465();
		this.method5336();
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
	private void method5342() {
		@Pc(4) int local4 = this.aClass9_Sub3_1.aClass9_Sub6_4.anInt3462;
		if (this.aClass9_Sub3_1.aClass9_Sub6_4.aClass9_Sub8_Sub2_Sub1Array1[local4] != null) {
			this.aClass9_Sub3_1.aClass9_Sub6_4.aClass9_Sub8_Sub2_Sub1Array1[local4].method5341();
		}
		this.aClass9_Sub3_1.aClass9_Sub6_4.aClass9_Sub8_Sub2_Sub1Array1[local4] = this;
		this.aShort83 = (short) this.aClass9_Sub3_1.aClass9_Sub6_4.anInt3462;
		this.aClass9_Sub3_1.aClass9_Sub6_4.anInt3462 = local4 + 1 & 0x1FFF;
		this.aClass9_Sub3_1.aClass309_6.method6595(this);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!r;J)V")
	public void method5343(@OriginalArg(0) Class43 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt6176 >> Static458.anInt7508 + 12;
		@Pc(13) int local13 = super.anInt6180 >> Static458.anInt7508 + 12;
		@Pc(18) int local18 = super.anInt6177 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static411.anInt6927 || local13 < 0 || local13 >= Static157.anInt3168) {
			this.method5341();
			return;
		}
		@Pc(40) Class9_Sub6 local40 = this.aClass9_Sub3_1.aClass9_Sub6_4;
		@Pc(44) Class361 local44 = this.aClass9_Sub3_1.aClass361_1;
		@Pc(46) Class139[] local46 = Static29.aClass139Array6;
		@Pc(49) int local49 = local40.anInt3465;
		@Pc(58) Class63 local58 = Static554.aClass63ArrayArrayArray4[local40.anInt3465][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte37;
		}
		@Pc(71) int local71 = local46[local49].method6889(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static499.anInt7950 - 1) {
			local86 = local46[local49 + 1].method6889(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static458.anInt7508);
		}
		if (local44.aBoolean723) {
			if (local44.anInt9277 == -1 && local18 > local71) {
				this.method5341();
				return;
			}
			if (local44.anInt9277 >= 0 && local18 > local46[local44.anInt9277].method6889(local6, local13)) {
				this.method5341();
				return;
			}
			if (local44.anInt9281 == -1 && local18 < local86) {
				this.method5341();
				return;
			}
			if (local44.anInt9281 >= 0 && local18 < local46[local44.anInt9281 + 1].method6889(local6, local13)) {
				this.method5341();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static499.anInt7950 - 1; local154 > 0 && local18 > local46[local154].method6889(local6, local13); local154--) {
		}
		if (local44.aBoolean721 && local154 == 0 && local18 > local46[0].method6889(local6, local13)) {
			this.method5341();
		} else if (local154 == Static499.anInt7950 - 1 && local46[local154].method6889(local6, local13) - local18 > 0x8 << Static458.anInt7508) {
			this.method5341();
		} else {
			local58 = Static554.aClass63ArrayArrayArray4[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static554.aClass63ArrayArrayArray4[0][local6][local13] == null) {
					local58 = Static554.aClass63ArrayArrayArray4[0][local6][local13] = new Class63(0);
				}
				@Pc(251) boolean local251 = Static554.aClass63ArrayArrayArray4[0][local6][local13].aClass63_1 != null;
				if (local154 == 3 && local251) {
					this.method5341();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static554.aClass63ArrayArrayArray4[local261][local6][local13] == null) {
						local58 = Static554.aClass63ArrayArrayArray4[local261][local6][local13] = new Class63(local261);
						if (local251) {
							local58.aByte37++;
						}
					}
				}
			}
			if (local44.aBoolean722) {
				@Pc(304) int local304 = super.anInt6176 >> 12;
				local261 = super.anInt6180 >> 12;
				@Pc(318) Class29 local318;
				if (local58.aClass9_Sub1_Sub4_1 != null) {
					local318 = local58.aClass9_Sub1_Sub4_1.method7469(arg0);
					if (local318 != null && local318.method773(local261, local304, local18)) {
						this.method5341();
						return;
					}
				}
				if (local58.aClass9_Sub1_Sub4_2 != null) {
					local318 = local58.aClass9_Sub1_Sub4_2.method7469(arg0);
					if (local318 != null && local318.method773(local261, local304, local18)) {
						this.method5341();
						return;
					}
				}
				if (local58.aClass9_Sub1_Sub3_1 != null) {
					local318 = local58.aClass9_Sub1_Sub3_1.method7469(arg0);
					if (local318 != null && local318.method773(local261, local304, local18)) {
						this.method5341();
						return;
					}
				}
				for (@Pc(375) Class16 local375 = local58.aClass16_3; local375 != null; local375 = local375.aClass16_1) {
					@Pc(382) Class29 local382 = local375.aClass9_Sub1_Sub1_1.method7469(arg0);
					if (local382 != null && local382.method773(local261, local304, local18)) {
						this.method5341();
						return;
					}
				}
			}
			local40.aClass96_1.aClass269_1.method6014(this);
		}
	}
}

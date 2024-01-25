import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!aba", name = "B", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!aba", name = "C", descriptor = "I")
	private int anInt54;

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "Lclient!cg;")
	public Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!aba", name = "D", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!aba", name = "A", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!aba", name = "E", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!aba", name = "x", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!aba", name = "F", descriptor = "I")
	private int anInt55;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!cg;IIIIIIIIIIIZZ)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub3_1 = arg0;
		super.anInt45 = arg1 << 12;
		super.anInt52 = arg2 << 12;
		super.anInt46 = arg3 << 12;
		super.anInt51 = arg9;
		this.aShort3 = this.aShort5 = (short) arg8;
		super.anInt47 = arg10;
		super.anInt48 = arg11;
		super.aBoolean3 = arg13;
		this.aShort6 = (short) arg4;
		this.aShort2 = (short) arg5;
		this.aShort1 = (short) arg6;
		this.anInt55 = arg7;
		super.aByte2 = this.aClass4_Sub3_1.aClass261_1.aByte100;
		this.method64();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
	public void method61() {
		this.aClass4_Sub3_1.aClass4_Sub4_4.aClass4_Sub1_Sub1_Sub1Array1[this.aShort4] = null;
		Static521.aClass4_Sub1_Sub1_Sub1Array2[Static130.anInt2325] = this;
		Static130.anInt2325 = Static130.anInt2325 + 1 & 0x3FF;
		this.method8713();
		this.method5082();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(JI)V")
	public void method62(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort5 = (short) (this.aShort5 - arg1);
		if (this.aShort5 <= 0) {
			this.method61();
			return;
		}
		@Pc(17) int local17 = super.anInt45 >> 12;
		@Pc(22) int local22 = super.anInt52 >> 12;
		@Pc(27) int local27 = super.anInt46 >> 12;
		@Pc(31) Class4_Sub4 local31 = this.aClass4_Sub3_1.aClass4_Sub4_4;
		@Pc(35) Class360 local35 = this.aClass4_Sub3_1.aClass360_1;
		if (local35.anInt9992 != 0) {
			@Pc(65) int local65;
			if (this.aShort3 - this.aShort5 <= local35.anInt9960) {
				local65 = (super.anInt51 >> 8 & 0xFF00) + (this.anInt54 >> 16 & 0xFF) + local35.anInt9986 * arg1;
				@Pc(82) int local82 = (super.anInt51 & 0xFF00) + (this.anInt54 >> 8 & 0xFF) + local35.lb * arg1;
				@Pc(99) int local99 = ((super.anInt51 & 0xFF) << 8) + (this.anInt54 & 0xFF) + local35.anInt9945 * arg1;
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
				super.anInt51 &= 0xFF000000;
				super.anInt51 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt54 &= 0xFF000000;
				this.anInt54 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort3 - this.aShort5 <= local35.anInt9947) {
				local65 = (super.anInt51 >> 16 & 0xFF00) + (this.anInt54 >> 24 & 0xFF) + local35.anInt9981 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt51 &= 0xFFFFFF;
				super.anInt51 |= (local65 & 0xFF00) << 16;
				this.anInt54 &= 0xFFFFFF;
				this.anInt54 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt9973 != -1 && this.aShort3 - this.aShort5 <= local35.anInt9952) {
			this.anInt55 += local35.anInt9941 * arg1;
		}
		if (local35.anInt9968 != -1 && this.aShort3 - this.aShort5 <= local35.anInt9959) {
			super.anInt47 += local35.anInt9966 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort6;
		@Pc(300) double local300 = (double) this.aShort2;
		@Pc(304) double local304 = (double) this.aShort1;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt9949 == 1) {
			local317 = local17 - this.aClass4_Sub3_1.aClass296_1.anInt8050;
			local324 = local22 - this.aClass4_Sub3_1.aClass296_1.anInt8053;
			local331 = local27 - this.aClass4_Sub3_1.aClass296_1.anInt8054;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt9989 * local348 * arg1;
			this.anInt55 = (int) ((long) this.anInt55 - ((long) this.anInt55 * local356 >> 18));
		} else if (local35.anInt9949 == 2) {
			local317 = local17 - this.aClass4_Sub3_1.aClass296_1.anInt8050;
			local324 = local22 - this.aClass4_Sub3_1.aClass296_1.anInt8053;
			local331 = local27 - this.aClass4_Sub3_1.aClass296_1.anInt8054;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt9989 * local348 * arg1;
			this.anInt55 = (int) ((long) this.anInt55 - ((long) this.anInt55 * local356 >> 28));
		}
		if (local35.anIntArray564 != null) {
			@Pc(437) Class5 local437 = local31.aClass330_9.aClass5_257;
			for (@Pc(440) Class5 local440 = local437.aClass5_300; local440 != local437; local440 = local440.aClass5_300) {
				@Pc(444) Class5_Sub5_Sub1 local444 = (Class5_Sub5_Sub1) local440;
				@Pc(447) Class328 local447 = local444.aClass328_1;
				if (local447.anInt9110 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray564.length; local455++) {
						if (local35.anIntArray564[local455] == local447.anInt9120) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt564);
						@Pc(486) double local486 = (double) (local22 - local444.anInt562);
						@Pc(492) double local492 = (double) (local27 - local444.anInt567);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong230)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt566 + local486 * (double) local447.anInt9117 + local492 * (double) local444.anInt561) * 65535.0D / ((double) local447.anInt9123 * local513);
							if (!(local545 < (double) local447.anInt9124)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt9114 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt9113;
								} else if (local447.anInt9114 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt9113;
								}
								if (local447.anInt9119 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt9123;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt9123;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt9123;
									if (local447.anInt9122 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt45 = (int) ((double) super.anInt45 + local678 * (double) arg1);
										super.anInt52 = (int) ((double) super.anInt52 + local686 * (double) arg1);
										super.anInt46 = (int) ((double) super.anInt46 + local694 * (double) arg1);
									}
								} else if (local447.anInt9122 == 0) {
									local296 += ((double) local444.anInt566 - local553) * (double) arg1;
									local300 += ((double) local447.anInt9117 - local553) * (double) arg1;
									local304 += ((double) local444.anInt561 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt45 = (int) ((double) super.anInt45 + ((double) local444.anInt566 - local553) * (double) arg1);
									super.anInt52 = (int) ((double) super.anInt52 + ((double) local447.anInt9117 - local553) * (double) arg1);
									super.anInt46 = (int) ((double) super.anInt46 + ((double) local444.anInt561 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray567 != null) {
			for (local317 = 0; local317 < local35.anIntArray567.length; local317++) {
				@Pc(776) Class5_Sub5_Sub1 local776 = (Class5_Sub5_Sub1) Static464.aClass281_1.method6688((long) local35.anIntArray567[local317]);
				while (local776 != null) {
					@Pc(780) Class328 local780 = local776.aClass328_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt564);
					@Pc(792) double local792 = (double) (local22 - local776.anInt562);
					@Pc(798) double local798 = (double) (local27 - local776.anInt567);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong230) {
						local776 = (Class5_Sub5_Sub1) Static464.aClass281_1.method6687();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt566 + local792 * (double) local780.anInt9117 + local798 * (double) local776.anInt561) * 65535.0D / ((double) local780.anInt9123 * local825);
						if (local857 < (double) local780.anInt9124) {
							local776 = (Class5_Sub5_Sub1) Static464.aClass281_1.method6687();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt9114 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt9113;
							} else if (local780.anInt9114 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt9113;
							}
							if (local780.anInt9119 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt9123;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt9123;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt9123;
								if (local780.anInt9122 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt45 = (int) ((double) super.anInt45 + local996 * (double) arg1);
									super.anInt52 = (int) ((double) super.anInt52 + local1004 * (double) arg1);
									super.anInt46 = (int) ((double) super.anInt46 + local1012 * (double) arg1);
								}
							} else if (local780.anInt9122 == 0) {
								local296 += ((double) local776.anInt566 - local871) * (double) arg1;
								local300 += ((double) local780.anInt9117 - local871) * (double) arg1;
								local304 += ((double) local776.anInt561 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt45 = (int) ((double) super.anInt45 + ((double) local776.anInt566 - local871) * (double) arg1);
								super.anInt52 = (int) ((double) super.anInt52 + ((double) local780.anInt9117 - local871) * (double) arg1);
								super.anInt46 = (int) ((double) super.anInt46 + ((double) local776.anInt561 - local871) * (double) arg1);
							}
							local776 = (Class5_Sub5_Sub1) Static464.aClass281_1.method6687();
						}
					}
				}
			}
		}
		if (local35.anIntArray565 != null) {
			if (local35.anIntArray566 == null) {
				local35.anIntArray566 = new int[local35.anIntArray565.length];
				for (local317 = 0; local317 < local35.anIntArray565.length; local317++) {
					Static16.method233(local35.anIntArray565[local317]);
					local35.anIntArray566[local317] = ((Class5_Sub41) Static636.aClass273_48.method6581((long) local35.anIntArray565[local317])).anInt7600;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray566.length; local317++) {
				@Pc(1137) Class328 local1137 = Static24.aClass328Array1[local35.anIntArray566[local317]];
				if (local1137.anInt9122 == 0) {
					local296 += local1137.anInt9107 * arg1;
					local300 += local1137.anInt9117 * arg1;
					local304 += local1137.anInt9115 * arg1;
					local306 = true;
				} else {
					super.anInt45 += local1137.anInt9107 * arg1;
					super.anInt52 += local1137.anInt9117 * arg1;
					super.anInt46 += local1137.anInt9115 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort6 = (short) local296;
					this.aShort2 = (short) local300;
					this.aShort1 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt55 <<= 0x1;
			}
		}
		super.anInt45 = (int) ((long) super.anInt45 + ((long) this.aShort6 * (long) (this.anInt55 << 2) >> 23) * (long) arg1);
		super.anInt52 = (int) ((long) super.anInt52 + ((long) this.aShort2 * (long) (this.anInt55 << 2) >> 23) * (long) arg1);
		super.anInt46 = (int) ((long) super.anInt46 + ((long) this.aShort1 * (long) (this.anInt55 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method63(@OriginalArg(0) Class133 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt45 >> Static115.anInt2156 + 12;
		@Pc(13) int local13 = super.anInt46 >> Static115.anInt2156 + 12;
		@Pc(18) int local18 = super.anInt52 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static357.anInt5961 || local13 < 0 || local13 >= Static429.anInt7422) {
			this.method61();
			return;
		}
		@Pc(40) Class4_Sub4 local40 = this.aClass4_Sub3_1.aClass4_Sub4_4;
		@Pc(44) Class360 local44 = this.aClass4_Sub3_1.aClass360_1;
		@Pc(46) Class61[] local46 = Static11.aClass61Array1;
		@Pc(49) int local49 = local40.anInt2349;
		@Pc(58) Class217 local58 = Static421.aClass217ArrayArrayArray5[local40.anInt2349][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte80;
		}
		@Pc(71) int local71 = local46[local49].method8580(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static68.anInt1380 - 1) {
			local86 = local46[local49 + 1].method8580(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static115.anInt2156);
		}
		if (local44.aBoolean713) {
			if (local44.anInt9965 == -1 && local18 > local71) {
				this.method61();
				return;
			}
			if (local44.anInt9965 >= 0 && local18 > local46[local44.anInt9965].method8580(local13, local6)) {
				this.method61();
				return;
			}
			if (local44.anInt9964 == -1 && local18 < local86) {
				this.method61();
				return;
			}
			if (local44.anInt9964 >= 0 && local18 < local46[local44.anInt9964 + 1].method8580(local13, local6)) {
				this.method61();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static68.anInt1380 - 1; local154 > 0 && local18 > local46[local154].method8580(local13, local6); local154--) {
		}
		if (local44.aBoolean711 && local154 == 0 && local18 > local46[0].method8580(local13, local6)) {
			this.method61();
		} else if (local154 == Static68.anInt1380 - 1 && local46[local154].method8580(local13, local6) - local18 > 0x8 << Static115.anInt2156) {
			this.method61();
		} else {
			local58 = Static421.aClass217ArrayArrayArray5[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static421.aClass217ArrayArrayArray5[0][local6][local13] == null) {
					local58 = Static421.aClass217ArrayArrayArray5[0][local6][local13] = new Class217(0);
				}
				@Pc(251) boolean local251 = Static421.aClass217ArrayArrayArray5[0][local6][local13].aClass217_1 != null;
				if (local154 == 3 && local251) {
					this.method61();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static421.aClass217ArrayArrayArray5[local261][local6][local13] == null) {
						local58 = Static421.aClass217ArrayArrayArray5[local261][local6][local13] = new Class217(local261);
						if (local251) {
							local58.aByte80++;
						}
					}
				}
			}
			if (local44.aBoolean715) {
				@Pc(304) int local304 = super.anInt45 >> 12;
				local261 = super.anInt46 >> 12;
				@Pc(318) Class200 local318;
				if (local58.aClass4_Sub2_Sub4_1 != null) {
					local318 = local58.aClass4_Sub2_Sub4_1.method8720(arg0);
					if (local318 != null && local318.method4584(local18, local304, local261)) {
						this.method61();
						return;
					}
				}
				if (local58.aClass4_Sub2_Sub4_2 != null) {
					local318 = local58.aClass4_Sub2_Sub4_2.method8720(arg0);
					if (local318 != null && local318.method4584(local18, local304, local261)) {
						this.method61();
						return;
					}
				}
				if (local58.aClass4_Sub2_Sub2_1 != null) {
					local318 = local58.aClass4_Sub2_Sub2_1.method8720(arg0);
					if (local318 != null && local318.method4584(local18, local304, local261)) {
						this.method61();
						return;
					}
				}
				for (@Pc(375) Class290 local375 = local58.aClass290_2; local375 != null; local375 = local375.aClass290_3) {
					@Pc(382) Class200 local382 = local375.aClass4_Sub2_Sub1_1.method8720(arg0);
					if (local382 != null && local382.method4584(local18, local304, local261)) {
						this.method61();
						return;
					}
				}
			}
			local40.aClass235_1.aClass287_1.method6808(this);
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "()V")
	private void method64() {
		@Pc(4) int local4 = this.aClass4_Sub3_1.aClass4_Sub4_4.anInt2347;
		if (this.aClass4_Sub3_1.aClass4_Sub4_4.aClass4_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass4_Sub3_1.aClass4_Sub4_4.aClass4_Sub1_Sub1_Sub1Array1[local4].method61();
		}
		this.aClass4_Sub3_1.aClass4_Sub4_4.aClass4_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort4 = (short) this.aClass4_Sub3_1.aClass4_Sub4_4.anInt2347;
		this.aClass4_Sub3_1.aClass4_Sub4_4.anInt2347 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub3_1.aClass99_2.method2039(this);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!cg;IIIIIIIIIIIZZ)V")
	public void method65(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub3_1 = arg0;
		super.anInt45 = arg1 << 12;
		super.anInt52 = arg2 << 12;
		super.anInt46 = arg3 << 12;
		super.anInt51 = arg9;
		this.aShort3 = this.aShort5 = (short) arg8;
		super.anInt47 = arg10;
		super.anInt48 = arg11;
		super.aBoolean3 = arg13;
		this.aShort6 = (short) arg4;
		this.aShort2 = (short) arg5;
		this.aShort1 = (short) arg6;
		this.anInt55 = arg7;
		super.aByte2 = this.aClass4_Sub3_1.aClass261_1.aByte100;
		this.method64();
	}
}

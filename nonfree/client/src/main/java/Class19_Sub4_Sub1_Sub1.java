import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class19_Sub4_Sub1_Sub1 extends Class19_Sub4_Sub1 {

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
	private int anInt3432;

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "Lclient!gh;")
	public Class19_Sub5 aClass19_Sub5_1;

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
	private int anInt3431;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!gh;IIIIIIIIIIIZZ)V")
	public Class19_Sub4_Sub1_Sub1(@OriginalArg(0) Class19_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass19_Sub5_1 = arg0;
		super.anInt3427 = arg1 << 12;
		super.anInt3425 = arg2 << 12;
		super.anInt3429 = arg3 << 12;
		super.anInt3423 = arg9;
		this.aShort38 = this.aShort41 = (short) arg8;
		super.anInt3428 = arg10;
		super.anInt3422 = arg11;
		super.aBoolean279 = arg13;
		this.aShort40 = (short) arg4;
		this.aShort42 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt3431 = arg7;
		super.aByte57 = this.aClass19_Sub5_1.aClass156_1.aByte85;
		this.method2954();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(JI)V")
	public void method2953(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort41 = (short) (this.aShort41 - arg1);
		if (this.aShort41 <= 0) {
			this.method2955();
			return;
		}
		@Pc(17) int local17 = super.anInt3427 >> 12;
		@Pc(22) int local22 = super.anInt3425 >> 12;
		@Pc(27) int local27 = super.anInt3429 >> 12;
		@Pc(31) Class19_Sub9 local31 = this.aClass19_Sub5_1.aClass19_Sub9_3;
		@Pc(35) Class173 local35 = this.aClass19_Sub5_1.aClass173_1;
		if (local35.anInt5084 != 0) {
			@Pc(65) int local65;
			if (this.aShort38 - this.aShort41 <= local35.anInt5096) {
				local65 = (super.anInt3423 >> 8 & 0xFF00) + (this.anInt3432 >> 16 & 0xFF) + local35.anInt5073 * arg1;
				@Pc(82) int local82 = (super.anInt3423 & 0xFF00) + (this.anInt3432 >> 8 & 0xFF) + local35.anInt5063 * arg1;
				@Pc(99) int local99 = ((super.anInt3423 & 0xFF) << 8) + (this.anInt3432 & 0xFF) + local35.anInt5113 * arg1;
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
				super.anInt3423 &= 0xFF000000;
				super.anInt3423 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt3432 &= 0xFF000000;
				this.anInt3432 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort38 - this.aShort41 <= local35.anInt5092) {
				local65 = (super.anInt3423 >> 16 & 0xFF00) + (this.anInt3432 >> 24 & 0xFF) + local35.anInt5104 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt3423 &= 0xFFFFFF;
				super.anInt3423 |= (local65 & 0xFF00) << 16;
				this.anInt3432 &= 0xFFFFFF;
				this.anInt3432 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5110 != -1 && this.aShort38 - this.aShort41 <= local35.anInt5107) {
			this.anInt3431 += local35.anInt5086 * arg1;
		}
		if (local35.anInt5081 != -1 && this.aShort38 - this.aShort41 <= local35.anInt5095) {
			super.anInt3428 += local35.anInt5102 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort40;
		@Pc(300) double local300 = (double) this.aShort42;
		@Pc(304) double local304 = (double) this.aShort39;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt5066 == 1) {
			local317 = local17 - this.aClass19_Sub5_1.aClass300_1.anInt8674;
			local324 = local22 - this.aClass19_Sub5_1.aClass300_1.anInt8663;
			local331 = local27 - this.aClass19_Sub5_1.aClass300_1.anInt8675;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt5065 * local348 * arg1);
			this.anInt3431 = (int) ((long) this.anInt3431 - ((long) this.anInt3431 * local356 >> 18));
		} else if (local35.anInt5066 == 2) {
			local317 = local17 - this.aClass19_Sub5_1.aClass300_1.anInt8674;
			local324 = local22 - this.aClass19_Sub5_1.aClass300_1.anInt8663;
			local331 = local27 - this.aClass19_Sub5_1.aClass300_1.anInt8675;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt5065 * local348 * arg1);
			this.anInt3431 = (int) ((long) this.anInt3431 - ((long) this.anInt3431 * local356 >> 28));
		}
		if (local35.anIntArray292 != null) {
			@Pc(437) Class3 local437 = local31.aClass357_46.aClass3_303;
			for (@Pc(440) Class3 local440 = local437.aClass3_341; local440 != local437; local440 = local440.aClass3_341) {
				@Pc(444) Class3_Sub4_Sub20 local444 = (Class3_Sub4_Sub20) local440;
				@Pc(447) Class187 local447 = local444.aClass187_1;
				if (local447.anInt5474 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray292.length; local455++) {
						if (local35.anIntArray292[local455] == local447.anInt5476) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt9426);
						@Pc(486) double local486 = (double) (local22 - local444.anInt9427);
						@Pc(492) double local492 = (double) (local27 - local444.anInt9423);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong185)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt9428 + local486 * (double) local447.anInt5473 + local492 * (double) local444.anInt9424) * 65535.0D / ((double) local447.anInt5488 * local513);
							if (!(local545 < (double) local447.anInt5475)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt5489 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt5491;
								} else if (local447.anInt5489 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt5491;
								}
								if (local447.anInt5485 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt5488;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt5488;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt5488;
									if (local447.anInt5490 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt3427 = (int) ((double) super.anInt3427 + local678 * (double) arg1);
										super.anInt3425 = (int) ((double) super.anInt3425 + local686 * (double) arg1);
										super.anInt3429 = (int) ((double) super.anInt3429 + local694 * (double) arg1);
									}
								} else if (local447.anInt5490 == 0) {
									local296 += ((double) local444.anInt9428 - local553) * (double) arg1;
									local300 += ((double) local447.anInt5473 - local553) * (double) arg1;
									local304 += ((double) local444.anInt9424 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt3427 = (int) ((double) super.anInt3427 + ((double) local444.anInt9428 - local553) * (double) arg1);
									super.anInt3425 = (int) ((double) super.anInt3425 + ((double) local447.anInt5473 - local553) * (double) arg1);
									super.anInt3429 = (int) ((double) super.anInt3429 + ((double) local444.anInt9424 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray290 != null) {
			for (local317 = 0; local317 < local35.anIntArray290.length; local317++) {
				@Pc(776) Class3_Sub4_Sub20 local776 = (Class3_Sub4_Sub20) Static670.aClass298_1.method7240((long) local35.anIntArray290[local317]);
				while (local776 != null) {
					@Pc(780) Class187 local780 = local776.aClass187_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt9426);
					@Pc(792) double local792 = (double) (local22 - local776.anInt9427);
					@Pc(798) double local798 = (double) (local27 - local776.anInt9423);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong185) {
						local776 = (Class3_Sub4_Sub20) Static670.aClass298_1.method7238();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt9428 + local792 * (double) local780.anInt5473 + local798 * (double) local776.anInt9424) * 65535.0D / ((double) local780.anInt5488 * local825);
						if (local857 < (double) local780.anInt5475) {
							local776 = (Class3_Sub4_Sub20) Static670.aClass298_1.method7238();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt5489 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt5491;
							} else if (local780.anInt5489 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt5491;
							}
							if (local780.anInt5485 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt5488;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt5488;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt5488;
								if (local780.anInt5490 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt3427 = (int) ((double) super.anInt3427 + local996 * (double) arg1);
									super.anInt3425 = (int) ((double) super.anInt3425 + local1004 * (double) arg1);
									super.anInt3429 = (int) ((double) super.anInt3429 + local1012 * (double) arg1);
								}
							} else if (local780.anInt5490 == 0) {
								local296 += ((double) local776.anInt9428 - local871) * (double) arg1;
								local300 += ((double) local780.anInt5473 - local871) * (double) arg1;
								local304 += ((double) local776.anInt9424 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt3427 = (int) ((double) super.anInt3427 + ((double) local776.anInt9428 - local871) * (double) arg1);
								super.anInt3425 = (int) ((double) super.anInt3425 + ((double) local780.anInt5473 - local871) * (double) arg1);
								super.anInt3429 = (int) ((double) super.anInt3429 + ((double) local776.anInt9424 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub4_Sub20) Static670.aClass298_1.method7238();
						}
					}
				}
			}
		}
		if (local35.anIntArray293 != null) {
			if (local35.anIntArray291 == null) {
				local35.anIntArray291 = new int[local35.anIntArray293.length];
				for (local317 = 0; local317 < local35.anIntArray293.length; local317++) {
					Static330.method4927(local35.anIntArray293[local317]);
					local35.anIntArray291[local317] = ((Class3_Sub42) Static248.aClass136_23.method3503((long) local35.anIntArray293[local317])).anInt8429;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray291.length; local317++) {
				@Pc(1137) Class187 local1137 = Static714.aClass187Array1[local35.anIntArray291[local317]];
				if (local1137.anInt5490 == 0) {
					local296 += (double) (local1137.anInt5478 * arg1);
					local300 += (double) (local1137.anInt5473 * arg1);
					local304 += (double) (local1137.anInt5481 * arg1);
					local306 = true;
				} else {
					super.anInt3427 += local1137.anInt5478 * arg1;
					super.anInt3425 += local1137.anInt5473 * arg1;
					super.anInt3429 += local1137.anInt5481 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort40 = (short) (int) local296;
					this.aShort42 = (short) (int) local300;
					this.aShort39 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt3431 <<= 0x1;
			}
		}
		super.anInt3427 = (int) ((long) super.anInt3427 + ((long) this.aShort40 * (long) (this.anInt3431 << 2) >> 23) * (long) arg1);
		super.anInt3425 = (int) ((long) super.anInt3425 + ((long) this.aShort42 * (long) (this.anInt3431 << 2) >> 23) * (long) arg1);
		super.anInt3429 = (int) ((long) super.anInt3429 + ((long) this.aShort39 * (long) (this.anInt3431 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "()V")
	private void method2954() {
		@Pc(4) int local4 = this.aClass19_Sub5_1.aClass19_Sub9_3.anInt8048;
		if (this.aClass19_Sub5_1.aClass19_Sub9_3.aClass19_Sub4_Sub1_Sub1Array1[local4] != null) {
			this.aClass19_Sub5_1.aClass19_Sub9_3.aClass19_Sub4_Sub1_Sub1Array1[local4].method2955();
		}
		this.aClass19_Sub5_1.aClass19_Sub9_3.aClass19_Sub4_Sub1_Sub1Array1[local4] = this;
		this.aShort37 = (short) this.aClass19_Sub5_1.aClass19_Sub9_3.anInt8048;
		this.aClass19_Sub5_1.aClass19_Sub9_3.anInt8048 = local4 + 1 & 0x1FFF;
		this.aClass19_Sub5_1.aClass66_2.method1375(this);
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "()V")
	public void method2955() {
		this.aClass19_Sub5_1.aClass19_Sub9_3.aClass19_Sub4_Sub1_Sub1Array1[this.aShort37] = null;
		Static547.aClass19_Sub4_Sub1_Sub1Array2[Static344.anInt5900] = this;
		Static344.anInt5900 = Static344.anInt5900 + 1 & 0x3FF;
		this.method9359();
		this.method7253();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method2956(@OriginalArg(0) Class67 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt3427 >> Static394.anInt7067 + 12;
		@Pc(13) int local13 = super.anInt3429 >> Static394.anInt7067 + 12;
		@Pc(18) int local18 = super.anInt3425 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static509.anInt8656 || local13 < 0 || local13 >= Static164.anInt3059) {
			this.method2955();
			return;
		}
		@Pc(40) Class19_Sub9 local40 = this.aClass19_Sub5_1.aClass19_Sub9_3;
		@Pc(44) Class173 local44 = this.aClass19_Sub5_1.aClass173_1;
		@Pc(46) Class313[] local46 = Static639.aClass313Array2;
		@Pc(49) int local49 = local40.anInt8051;
		@Pc(58) Class262 local58 = Static584.aClass262ArrayArrayArray2[local40.anInt8051][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte113;
		}
		@Pc(71) int local71 = local46[local49].method9095(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static241.anInt4521 - 1) {
			local86 = local46[local49 + 1].method9095(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static394.anInt7067);
		}
		if (local44.aBoolean443) {
			if (local44.anInt5088 == -1 && local18 > local71) {
				this.method2955();
				return;
			}
			if (local44.anInt5088 >= 0 && local18 > local46[local44.anInt5088].method9095(local13, local6)) {
				this.method2955();
				return;
			}
			if (local44.anInt5076 == -1 && local18 < local86) {
				this.method2955();
				return;
			}
			if (local44.anInt5076 >= 0 && local18 < local46[local44.anInt5076 + 1].method9095(local13, local6)) {
				this.method2955();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static241.anInt4521 - 1; local154 > 0 && local18 > local46[local154].method9095(local13, local6); local154--) {
		}
		if (local44.aBoolean438 && local154 == 0 && local18 > local46[0].method9095(local13, local6)) {
			this.method2955();
		} else if (local154 == Static241.anInt4521 - 1 && local46[local154].method9095(local13, local6) - local18 > 0x8 << Static394.anInt7067) {
			this.method2955();
		} else {
			local58 = Static584.aClass262ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static584.aClass262ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static584.aClass262ArrayArrayArray2[0][local6][local13] = new Class262(0);
				}
				@Pc(251) boolean local251 = Static584.aClass262ArrayArrayArray2[0][local6][local13].aClass262_1 != null;
				if (local154 == 3 && local251) {
					this.method2955();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static584.aClass262ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static584.aClass262ArrayArrayArray2[local261][local6][local13] = new Class262(local261);
						if (local251) {
							local58.aByte113++;
						}
					}
				}
			}
			if (local44.aBoolean442) {
				@Pc(304) int local304 = super.anInt3427 >> 12;
				local261 = super.anInt3429 >> 12;
				@Pc(318) Class68 local318;
				if (local58.aClass19_Sub1_Sub2_2 != null) {
					local318 = local58.aClass19_Sub1_Sub2_2.method9371(arg0);
					if (local318 != null && local318.method1957(local304, local261, local18)) {
						this.method2955();
						return;
					}
				}
				if (local58.aClass19_Sub1_Sub2_1 != null) {
					local318 = local58.aClass19_Sub1_Sub2_1.method9371(arg0);
					if (local318 != null && local318.method1957(local304, local261, local18)) {
						this.method2955();
						return;
					}
				}
				if (local58.aClass19_Sub1_Sub5_1 != null) {
					local318 = local58.aClass19_Sub1_Sub5_1.method9371(arg0);
					if (local318 != null && local318.method1957(local304, local261, local18)) {
						this.method2955();
						return;
					}
				}
				for (@Pc(375) Class343 local375 = local58.aClass343_2; local375 != null; local375 = local375.aClass343_4) {
					@Pc(382) Class68 local382 = local375.aClass19_Sub1_Sub3_1.method9371(arg0);
					if (local382 != null && local382.method1957(local304, local261, local18)) {
						this.method2955();
						return;
					}
				}
			}
			local40.aClass162_1.aClass372_1.method8742(this);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gh;IIIIIIIIIIIZZ)V")
	public void method2957(@OriginalArg(0) Class19_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass19_Sub5_1 = arg0;
		super.anInt3427 = arg1 << 12;
		super.anInt3425 = arg2 << 12;
		super.anInt3429 = arg3 << 12;
		super.anInt3423 = arg9;
		this.aShort38 = this.aShort41 = (short) arg8;
		super.anInt3428 = arg10;
		super.anInt3422 = arg11;
		super.aBoolean279 = arg13;
		this.aShort40 = (short) arg4;
		this.aShort42 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt3431 = arg7;
		super.aByte57 = this.aClass19_Sub5_1.aClass156_1.aByte85;
		this.method2954();
	}
}

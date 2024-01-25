import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class21_Sub3_Sub1_Sub1 extends Class21_Sub3_Sub1 {

	@OriginalMember(owner = "client!rea", name = "z", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
	private int anInt8633;

	@OriginalMember(owner = "client!rea", name = "A", descriptor = "Lclient!lh;")
	public Class21_Sub8 aClass21_Sub8_1;

	@OriginalMember(owner = "client!rea", name = "B", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!rea", name = "G", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!rea", name = "F", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!rea", name = "D", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!rea", name = "y", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
	private int anInt8634;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!lh;IIIIIIIIIIIZZ)V")
	public Class21_Sub3_Sub1_Sub1(@OriginalArg(0) Class21_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass21_Sub8_1 = arg0;
		super.anInt8632 = arg1 << 12;
		super.anInt8629 = arg2 << 12;
		super.anInt8627 = arg3 << 12;
		super.anInt8631 = arg9;
		this.aShort109 = this.aShort106 = (short) arg8;
		super.anInt8623 = arg10;
		super.anInt8630 = arg11;
		super.aBoolean610 = arg13;
		this.aShort108 = (short) arg4;
		this.aShort107 = (short) arg5;
		this.aShort104 = (short) arg6;
		this.anInt8634 = arg7;
		super.aByte116 = this.aClass21_Sub8_1.aClass190_2.aByte95;
		this.method6658();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "()V")
	public void method6656() {
		this.aClass21_Sub8_1.aClass21_Sub5_7.aClass21_Sub3_Sub1_Sub1Array1[this.aShort105] = null;
		Static248.aClass21_Sub3_Sub1_Sub1Array2[Static284.anInt5830] = this;
		Static284.anInt5830 = Static284.anInt5830 + 1 & 0x3FF;
		this.method8246();
		this.method8248();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!r;J)V")
	public void method6657(@OriginalArg(0) Class7 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt8632 >> Static392.anInt3635 + 12;
		@Pc(13) int local13 = super.anInt8627 >> Static392.anInt3635 + 12;
		@Pc(18) int local18 = super.anInt8629 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static10.anInt812 || local13 < 0 || local13 >= Static255.anInt5209) {
			this.method6656();
			return;
		}
		@Pc(40) Class21_Sub5 local40 = this.aClass21_Sub8_1.aClass21_Sub5_7;
		@Pc(44) Class126 local44 = this.aClass21_Sub8_1.aClass126_1;
		@Pc(46) Class115[] local46 = Static255.aClass115Array2;
		@Pc(49) int local49 = local40.anInt3864;
		@Pc(58) Class182 local58 = Static571.aClass182ArrayArrayArray3[local40.anInt3864][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte93;
		}
		@Pc(71) int local71 = local46[local49].method8055(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static218.anInt4559 - 1) {
			local86 = local46[local49 + 1].method8055(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static392.anInt3635);
		}
		if (local44.aBoolean255) {
			if (local44.anInt3509 == -1 && local18 > local71) {
				this.method6656();
				return;
			}
			if (local44.anInt3509 >= 0 && local18 > local46[local44.anInt3509].method8055(local13, local6)) {
				this.method6656();
				return;
			}
			if (local44.anInt3511 == -1 && local18 < local86) {
				this.method6656();
				return;
			}
			if (local44.anInt3511 >= 0 && local18 < local46[local44.anInt3511 + 1].method8055(local13, local6)) {
				this.method6656();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static218.anInt4559 - 1; local154 > 0 && local18 > local46[local154].method8055(local13, local6); local154--) {
		}
		if (local44.aBoolean259 && local154 == 0 && local18 > local46[0].method8055(local13, local6)) {
			this.method6656();
		} else if (local154 == Static218.anInt4559 - 1 && local46[local154].method8055(local13, local6) - local18 > 0x8 << Static392.anInt3635) {
			this.method6656();
		} else {
			local58 = Static571.aClass182ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static571.aClass182ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static571.aClass182ArrayArrayArray3[0][local6][local13] = new Class182(0);
				}
				@Pc(251) boolean local251 = Static571.aClass182ArrayArrayArray3[0][local6][local13].aClass182_1 != null;
				if (local154 == 3 && local251) {
					this.method6656();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static571.aClass182ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static571.aClass182ArrayArrayArray3[local261][local6][local13] = new Class182(local261);
						if (local251) {
							local58.aByte93++;
						}
					}
				}
			}
			if (local44.aBoolean261) {
				@Pc(304) int local304 = super.anInt8632 >> 12;
				local261 = super.anInt8627 >> 12;
				@Pc(318) Class93 local318;
				if (local58.aClass21_Sub1_Sub2_1 != null) {
					local318 = local58.aClass21_Sub1_Sub2_1.method8223(arg0);
					if (local318 != null && local318.method2181(local261, local304, local18)) {
						this.method6656();
						return;
					}
				}
				if (local58.aClass21_Sub1_Sub2_2 != null) {
					local318 = local58.aClass21_Sub1_Sub2_2.method8223(arg0);
					if (local318 != null && local318.method2181(local261, local304, local18)) {
						this.method6656();
						return;
					}
				}
				if (local58.aClass21_Sub1_Sub5_1 != null) {
					local318 = local58.aClass21_Sub1_Sub5_1.method8223(arg0);
					if (local318 != null && local318.method2181(local261, local304, local18)) {
						this.method6656();
						return;
					}
				}
				for (@Pc(375) Class192 local375 = local58.aClass192_2; local375 != null; local375 = local375.aClass192_3) {
					@Pc(382) Class93 local382 = local375.aClass21_Sub1_Sub1_1.method8223(arg0);
					if (local382 != null && local382.method2181(local261, local304, local18)) {
						this.method6656();
						return;
					}
				}
			}
			local40.aClass276_1.aClass39_1.method1142(this);
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "()V")
	private void method6658() {
		@Pc(4) int local4 = this.aClass21_Sub8_1.aClass21_Sub5_7.anInt3862;
		if (this.aClass21_Sub8_1.aClass21_Sub5_7.aClass21_Sub3_Sub1_Sub1Array1[local4] != null) {
			this.aClass21_Sub8_1.aClass21_Sub5_7.aClass21_Sub3_Sub1_Sub1Array1[local4].method6656();
		}
		this.aClass21_Sub8_1.aClass21_Sub5_7.aClass21_Sub3_Sub1_Sub1Array1[local4] = this;
		this.aShort105 = (short) this.aClass21_Sub8_1.aClass21_Sub5_7.anInt3862;
		this.aClass21_Sub8_1.aClass21_Sub5_7.anInt3862 = local4 + 1 & 0x1FFF;
		this.aClass21_Sub8_1.aClass158_11.method3720(this);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(JI)V")
	public void method6659(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort106 = (short) (this.aShort106 - arg1);
		if (this.aShort106 <= 0) {
			this.method6656();
			return;
		}
		@Pc(17) int local17 = super.anInt8632 >> 12;
		@Pc(22) int local22 = super.anInt8629 >> 12;
		@Pc(27) int local27 = super.anInt8627 >> 12;
		@Pc(31) Class21_Sub5 local31 = this.aClass21_Sub8_1.aClass21_Sub5_7;
		@Pc(35) Class126 local35 = this.aClass21_Sub8_1.aClass126_1;
		if (local35.anInt3519 != 0) {
			@Pc(65) int local65;
			if (this.aShort109 - this.aShort106 <= local35.anInt3522) {
				local65 = (super.anInt8631 >> 8 & 0xFF00) + (this.anInt8633 >> 16 & 0xFF) + local35.anInt3518 * arg1;
				@Pc(82) int local82 = (super.anInt8631 & 0xFF00) + (this.anInt8633 >> 8 & 0xFF) + local35.anInt3491 * arg1;
				@Pc(99) int local99 = ((super.anInt8631 & 0xFF) << 8) + (this.anInt8633 & 0xFF) + local35.anInt3499 * arg1;
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
				super.anInt8631 &= 0xFF000000;
				super.anInt8631 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt8633 &= 0xFF000000;
				this.anInt8633 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort109 - this.aShort106 <= local35.anInt3502) {
				local65 = (super.anInt8631 >> 16 & 0xFF00) + (this.anInt8633 >> 24 & 0xFF) + local35.anInt3538 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt8631 &= 0xFFFFFF;
				super.anInt8631 |= (local65 & 0xFF00) << 16;
				this.anInt8633 &= 0xFFFFFF;
				this.anInt8633 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3512 != -1 && this.aShort109 - this.aShort106 <= local35.anInt3513) {
			this.anInt8634 += local35.anInt3516 * arg1;
		}
		if (local35.anInt3510 != -1 && this.aShort109 - this.aShort106 <= local35.anInt3539) {
			super.anInt8623 += local35.anInt3507 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort108;
		@Pc(300) double local300 = (double) this.aShort107;
		@Pc(304) double local304 = (double) this.aShort104;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt3515 == 1) {
			local317 = local17 - this.aClass21_Sub8_1.aClass14_1.anInt867;
			local324 = local22 - this.aClass21_Sub8_1.aClass14_1.anInt866;
			local331 = local27 - this.aClass21_Sub8_1.aClass14_1.anInt860;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt3531 * local348 * arg1;
			this.anInt8634 = (int) ((long) this.anInt8634 - ((long) this.anInt8634 * local356 >> 18));
		} else if (local35.anInt3515 == 2) {
			local317 = local17 - this.aClass21_Sub8_1.aClass14_1.anInt867;
			local324 = local22 - this.aClass21_Sub8_1.aClass14_1.anInt866;
			local331 = local27 - this.aClass21_Sub8_1.aClass14_1.anInt860;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt3531 * local348 * arg1;
			this.anInt8634 = (int) ((long) this.anInt8634 - ((long) this.anInt8634 * local356 >> 28));
		}
		if (local35.anIntArray171 != null) {
			@Pc(437) Class4 local437 = local31.aClass22_22.aClass4_13;
			for (@Pc(440) Class4 local440 = local437.aClass4_286; local440 != local437; local440 = local440.aClass4_286) {
				@Pc(444) Class4_Sub6_Sub14 local444 = (Class4_Sub6_Sub14) local440;
				@Pc(447) Class286 local447 = local444.aClass286_1;
				if (local447.anInt8561 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray171.length; local455++) {
						if (local35.anIntArray171[local455] == local447.anInt8553) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt6330);
						@Pc(486) double local486 = (double) (local22 - local444.anInt6328);
						@Pc(492) double local492 = (double) (local27 - local444.anInt6333);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong233)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt6332 + local486 * (double) local447.anInt8550 + local492 * (double) local444.anInt6329) * 65535.0D / ((double) local447.anInt8548 * local513);
							if (!(local545 < (double) local447.anInt8562)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt8547 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt8551;
								} else if (local447.anInt8547 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt8551;
								}
								if (local447.anInt8558 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt8548;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt8548;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt8548;
									if (local447.anInt8559 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt8632 = (int) ((double) super.anInt8632 + local678 * (double) arg1);
										super.anInt8629 = (int) ((double) super.anInt8629 + local686 * (double) arg1);
										super.anInt8627 = (int) ((double) super.anInt8627 + local694 * (double) arg1);
									}
								} else if (local447.anInt8559 == 0) {
									local296 += ((double) local444.anInt6332 - local553) * (double) arg1;
									local300 += ((double) local447.anInt8550 - local553) * (double) arg1;
									local304 += ((double) local444.anInt6329 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt8632 = (int) ((double) super.anInt8632 + ((double) local444.anInt6332 - local553) * (double) arg1);
									super.anInt8629 = (int) ((double) super.anInt8629 + ((double) local447.anInt8550 - local553) * (double) arg1);
									super.anInt8627 = (int) ((double) super.anInt8627 + ((double) local444.anInt6329 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray172 != null) {
			for (local317 = 0; local317 < local35.anIntArray172.length; local317++) {
				@Pc(776) Class4_Sub6_Sub14 local776 = (Class4_Sub6_Sub14) Static413.aClass303_1.method6978((long) local35.anIntArray172[local317]);
				while (local776 != null) {
					@Pc(780) Class286 local780 = local776.aClass286_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt6330);
					@Pc(792) double local792 = (double) (local22 - local776.anInt6328);
					@Pc(798) double local798 = (double) (local27 - local776.anInt6333);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong233) {
						local776 = (Class4_Sub6_Sub14) Static413.aClass303_1.method6976();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt6332 + local792 * (double) local780.anInt8550 + local798 * (double) local776.anInt6329) * 65535.0D / ((double) local780.anInt8548 * local825);
						if (local857 < (double) local780.anInt8562) {
							local776 = (Class4_Sub6_Sub14) Static413.aClass303_1.method6976();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt8547 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt8551;
							} else if (local780.anInt8547 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt8551;
							}
							if (local780.anInt8558 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt8548;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt8548;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt8548;
								if (local780.anInt8559 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt8632 = (int) ((double) super.anInt8632 + local996 * (double) arg1);
									super.anInt8629 = (int) ((double) super.anInt8629 + local1004 * (double) arg1);
									super.anInt8627 = (int) ((double) super.anInt8627 + local1012 * (double) arg1);
								}
							} else if (local780.anInt8559 == 0) {
								local296 += ((double) local776.anInt6332 - local871) * (double) arg1;
								local300 += ((double) local780.anInt8550 - local871) * (double) arg1;
								local304 += ((double) local776.anInt6329 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt8632 = (int) ((double) super.anInt8632 + ((double) local776.anInt6332 - local871) * (double) arg1);
								super.anInt8629 = (int) ((double) super.anInt8629 + ((double) local780.anInt8550 - local871) * (double) arg1);
								super.anInt8627 = (int) ((double) super.anInt8627 + ((double) local776.anInt6329 - local871) * (double) arg1);
							}
							local776 = (Class4_Sub6_Sub14) Static413.aClass303_1.method6976();
						}
					}
				}
			}
		}
		if (local35.anIntArray170 != null) {
			if (local35.anIntArray169 == null) {
				local35.anIntArray169 = new int[local35.anIntArray170.length];
				for (local317 = 0; local317 < local35.anIntArray170.length; local317++) {
					Static466.method6801(local35.anIntArray170[local317]);
					local35.anIntArray169[local317] = ((Class4_Sub27) Static589.aClass221_41.method5075((long) local35.anIntArray170[local317])).anInt4968;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray169.length; local317++) {
				@Pc(1137) Class286 local1137 = Static424.aClass286Array1[local35.anIntArray169[local317]];
				if (local1137.anInt8559 == 0) {
					local296 += local1137.anInt8554 * arg1;
					local300 += local1137.anInt8550 * arg1;
					local304 += local1137.anInt8557 * arg1;
					local306 = true;
				} else {
					super.anInt8632 += local1137.anInt8554 * arg1;
					super.anInt8629 += local1137.anInt8550 * arg1;
					super.anInt8627 += local1137.anInt8557 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort108 = (short) local296;
					this.aShort107 = (short) local300;
					this.aShort104 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt8634 <<= 0x1;
			}
		}
		super.anInt8632 = (int) ((long) super.anInt8632 + ((long) this.aShort108 * (long) (this.anInt8634 << 2) >> 23) * (long) arg1);
		super.anInt8629 = (int) ((long) super.anInt8629 + ((long) this.aShort107 * (long) (this.anInt8634 << 2) >> 23) * (long) arg1);
		super.anInt8627 = (int) ((long) super.anInt8627 + ((long) this.aShort104 * (long) (this.anInt8634 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!lh;IIIIIIIIIIIZZ)V")
	public void method6660(@OriginalArg(0) Class21_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass21_Sub8_1 = arg0;
		super.anInt8632 = arg1 << 12;
		super.anInt8629 = arg2 << 12;
		super.anInt8627 = arg3 << 12;
		super.anInt8631 = arg9;
		this.aShort109 = this.aShort106 = (short) arg8;
		super.anInt8623 = arg10;
		super.anInt8630 = arg11;
		super.aBoolean610 = arg13;
		this.aShort108 = (short) arg4;
		this.aShort107 = (short) arg5;
		this.aShort104 = (short) arg6;
		this.anInt8634 = arg7;
		super.aByte116 = this.aClass21_Sub8_1.aClass190_2.aByte95;
		this.method6658();
	}
}

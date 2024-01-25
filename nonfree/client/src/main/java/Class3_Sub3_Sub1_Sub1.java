import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class3_Sub3_Sub1_Sub1 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
	private int anInt1701;

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "Lclient!jp;")
	public Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	private int anInt1700;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!jp;IIIIIIIIIIIZZ)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass3_Sub5_1 = arg0;
		super.anInt1692 = arg1 << 12;
		super.anInt1696 = arg2 << 12;
		super.anInt1699 = arg3 << 12;
		super.anInt1695 = arg9;
		this.aShort17 = this.aShort20 = (short) arg8;
		super.anInt1698 = arg10;
		super.anInt1694 = arg11;
		super.aBoolean113 = arg13;
		this.aShort21 = (short) arg4;
		this.aShort19 = (short) arg5;
		this.aShort16 = (short) arg6;
		this.anInt1700 = arg7;
		super.aByte18 = this.aClass3_Sub5_1.aClass235_1.aByte88;
		this.method1699();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
	private void method1699() {
		@Pc(4) int local4 = this.aClass3_Sub5_1.aClass3_Sub7_4.anInt8433;
		if (this.aClass3_Sub5_1.aClass3_Sub7_4.aClass3_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass3_Sub5_1.aClass3_Sub7_4.aClass3_Sub3_Sub1_Sub1Array2[local4].method1702();
		}
		this.aClass3_Sub5_1.aClass3_Sub7_4.aClass3_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort18 = (short) this.aClass3_Sub5_1.aClass3_Sub7_4.anInt8433;
		this.aClass3_Sub5_1.aClass3_Sub7_4.anInt8433 = local4 + 1 & 0x1FFF;
		this.aClass3_Sub5_1.aClass236_4.method4955(this);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method1700(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt1692 >> Static273.anInt4424 + 12;
		@Pc(13) int local13 = super.anInt1699 >> Static273.anInt4424 + 12;
		@Pc(18) int local18 = super.anInt1696 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static51.anInt1108 || local13 < 0 || local13 >= Static245.anInt7888) {
			this.method1702();
			return;
		}
		@Pc(40) Class3_Sub7 local40 = this.aClass3_Sub5_1.aClass3_Sub7_4;
		@Pc(44) Class21 local44 = this.aClass3_Sub5_1.aClass21_1;
		@Pc(46) Class42[] local46 = Static140.aClass42Array4;
		@Pc(49) int local49 = local40.anInt8435;
		@Pc(58) Class73 local58 = Static267.aClass73ArrayArrayArray2[local40.anInt8435][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte20;
		}
		@Pc(71) int local71 = local46[local49].method7450(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static539.anInt8345 - 1) {
			local86 = local46[local49 + 1].method7450(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static273.anInt4424);
		}
		if (local44.aBoolean52) {
			if (local44.anInt526 == -1 && local18 > local71) {
				this.method1702();
				return;
			}
			if (local44.anInt526 >= 0 && local18 > local46[local44.anInt526].method7450(local13, local6)) {
				this.method1702();
				return;
			}
			if (local44.anInt530 == -1 && local18 < local86) {
				this.method1702();
				return;
			}
			if (local44.anInt530 >= 0 && local18 < local46[local44.anInt530 + 1].method7450(local13, local6)) {
				this.method1702();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static539.anInt8345 - 1; local154 > 0 && local18 > local46[local154].method7450(local13, local6); local154--) {
		}
		if (local44.aBoolean51 && local154 == 0 && local18 > local46[0].method7450(local13, local6)) {
			this.method1702();
		} else if (local154 == Static539.anInt8345 - 1 && local46[local154].method7450(local13, local6) - local18 > 0x8 << Static273.anInt4424) {
			this.method1702();
		} else {
			local58 = Static267.aClass73ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static267.aClass73ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static267.aClass73ArrayArrayArray2[0][local6][local13] = new Class73(0);
				}
				@Pc(251) boolean local251 = Static267.aClass73ArrayArrayArray2[0][local6][local13].aClass73_1 != null;
				if (local154 == 3 && local251) {
					this.method1702();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static267.aClass73ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static267.aClass73ArrayArrayArray2[local261][local6][local13] = new Class73(local261);
						if (local251) {
							local58.aByte20++;
						}
					}
				}
			}
			if (local44.aBoolean50) {
				@Pc(304) int local304 = super.anInt1692 >> 12;
				local261 = super.anInt1699 >> 12;
				@Pc(318) Class261 local318;
				if (local58.aClass3_Sub1_Sub4_1 != null) {
					local318 = local58.aClass3_Sub1_Sub4_1.method8507(arg0);
					if (local318 != null && local318.method5889(local18, local304, local261)) {
						this.method1702();
						return;
					}
				}
				if (local58.aClass3_Sub1_Sub4_2 != null) {
					local318 = local58.aClass3_Sub1_Sub4_2.method8507(arg0);
					if (local318 != null && local318.method5889(local18, local304, local261)) {
						this.method1702();
						return;
					}
				}
				if (local58.aClass3_Sub1_Sub5_1 != null) {
					local318 = local58.aClass3_Sub1_Sub5_1.method8507(arg0);
					if (local318 != null && local318.method5889(local18, local304, local261)) {
						this.method1702();
						return;
					}
				}
				for (@Pc(375) Class144 local375 = local58.aClass144_1; local375 != null; local375 = local375.aClass144_2) {
					@Pc(382) Class261 local382 = local375.aClass3_Sub1_Sub2_1.method8507(arg0);
					if (local382 != null && local382.method5889(local18, local304, local261)) {
						this.method1702();
						return;
					}
				}
			}
			local40.aClass9_1.aClass87_1.method2173(this);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(JI)V")
	public void method1701(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort20 = (short) (this.aShort20 - arg1);
		if (this.aShort20 <= 0) {
			this.method1702();
			return;
		}
		@Pc(17) int local17 = super.anInt1692 >> 12;
		@Pc(22) int local22 = super.anInt1696 >> 12;
		@Pc(27) int local27 = super.anInt1699 >> 12;
		@Pc(31) Class3_Sub7 local31 = this.aClass3_Sub5_1.aClass3_Sub7_4;
		@Pc(35) Class21 local35 = this.aClass3_Sub5_1.aClass21_1;
		if (local35.anInt565 != 0) {
			@Pc(65) int local65;
			if (this.aShort17 - this.aShort20 <= local35.anInt535) {
				local65 = (super.anInt1695 >> 8 & 0xFF00) + (this.anInt1701 >> 16 & 0xFF) + local35.anInt545 * arg1;
				@Pc(82) int local82 = (super.anInt1695 & 0xFF00) + (this.anInt1701 >> 8 & 0xFF) + local35.anInt567 * arg1;
				@Pc(99) int local99 = ((super.anInt1695 & 0xFF) << 8) + (this.anInt1701 & 0xFF) + local35.anInt556 * arg1;
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
				super.anInt1695 &= 0xFF000000;
				super.anInt1695 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt1701 &= 0xFF000000;
				this.anInt1701 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort17 - this.aShort20 <= local35.anInt534) {
				local65 = (super.anInt1695 >> 16 & 0xFF00) + (this.anInt1701 >> 24 & 0xFF) + local35.anInt519 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt1695 &= 0xFFFFFF;
				super.anInt1695 |= (local65 & 0xFF00) << 16;
				this.anInt1701 &= 0xFFFFFF;
				this.anInt1701 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt532 != -1 && this.aShort17 - this.aShort20 <= local35.anInt528) {
			this.anInt1700 += local35.anInt568 * arg1;
		}
		if (local35.anInt518 != -1 && this.aShort17 - this.aShort20 <= local35.anInt536) {
			super.anInt1698 += local35.anInt540 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort21;
		@Pc(300) double local300 = (double) this.aShort19;
		@Pc(304) double local304 = (double) this.aShort16;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt559 == 1) {
			local317 = local17 - this.aClass3_Sub5_1.aClass169_1.anInt4265;
			local324 = local22 - this.aClass3_Sub5_1.aClass169_1.anInt4259;
			local331 = local27 - this.aClass3_Sub5_1.aClass169_1.anInt4267;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt539 * local348 * arg1);
			this.anInt1700 = (int) ((long) this.anInt1700 - ((long) this.anInt1700 * local356 >> 18));
		} else if (local35.anInt559 == 2) {
			local317 = local17 - this.aClass3_Sub5_1.aClass169_1.anInt4265;
			local324 = local22 - this.aClass3_Sub5_1.aClass169_1.anInt4259;
			local331 = local27 - this.aClass3_Sub5_1.aClass169_1.anInt4267;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt539 * local348 * arg1);
			this.anInt1700 = (int) ((long) this.anInt1700 - ((long) this.anInt1700 * local356 >> 28));
		}
		if (local35.anIntArray49 != null) {
			@Pc(437) Class4 local437 = local31.aClass163_59.aClass4_127;
			for (@Pc(440) Class4 local440 = local437.aClass4_337; local440 != local437; local440 = local440.aClass4_337) {
				@Pc(444) Class4_Sub5_Sub1 local444 = (Class4_Sub5_Sub1) local440;
				@Pc(447) Class320 local447 = local444.aClass320_1;
				if (local447.anInt8184 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray49.length; local455++) {
						if (local35.anIntArray49[local455] == local447.anInt8179) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt330);
						@Pc(486) double local486 = (double) (local22 - local444.anInt329);
						@Pc(492) double local492 = (double) (local27 - local444.anInt328);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong244)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt327 + local486 * (double) local447.anInt8180 + local492 * (double) local444.anInt333) * 65535.0D / ((double) local447.anInt8191 * local513);
							if (!(local545 < (double) local447.anInt8185)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt8192 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt8186;
								} else if (local447.anInt8192 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt8186;
								}
								if (local447.anInt8195 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt8191;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt8191;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt8191;
									if (local447.anInt8188 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt1692 = (int) ((double) super.anInt1692 + local678 * (double) arg1);
										super.anInt1696 = (int) ((double) super.anInt1696 + local686 * (double) arg1);
										super.anInt1699 = (int) ((double) super.anInt1699 + local694 * (double) arg1);
									}
								} else if (local447.anInt8188 == 0) {
									local296 += ((double) local444.anInt327 - local553) * (double) arg1;
									local300 += ((double) local447.anInt8180 - local553) * (double) arg1;
									local304 += ((double) local444.anInt333 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt1692 = (int) ((double) super.anInt1692 + ((double) local444.anInt327 - local553) * (double) arg1);
									super.anInt1696 = (int) ((double) super.anInt1696 + ((double) local447.anInt8180 - local553) * (double) arg1);
									super.anInt1699 = (int) ((double) super.anInt1699 + ((double) local444.anInt333 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray47 != null) {
			for (local317 = 0; local317 < local35.anIntArray47.length; local317++) {
				@Pc(776) Class4_Sub5_Sub1 local776 = (Class4_Sub5_Sub1) Static166.aClass321_2.method7161((long) local35.anIntArray47[local317]);
				while (local776 != null) {
					@Pc(780) Class320 local780 = local776.aClass320_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt330);
					@Pc(792) double local792 = (double) (local22 - local776.anInt329);
					@Pc(798) double local798 = (double) (local27 - local776.anInt328);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong244) {
						local776 = (Class4_Sub5_Sub1) Static166.aClass321_2.method7157();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt327 + local792 * (double) local780.anInt8180 + local798 * (double) local776.anInt333) * 65535.0D / ((double) local780.anInt8191 * local825);
						if (local857 < (double) local780.anInt8185) {
							local776 = (Class4_Sub5_Sub1) Static166.aClass321_2.method7157();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt8192 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt8186;
							} else if (local780.anInt8192 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt8186;
							}
							if (local780.anInt8195 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt8191;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt8191;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt8191;
								if (local780.anInt8188 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt1692 = (int) ((double) super.anInt1692 + local996 * (double) arg1);
									super.anInt1696 = (int) ((double) super.anInt1696 + local1004 * (double) arg1);
									super.anInt1699 = (int) ((double) super.anInt1699 + local1012 * (double) arg1);
								}
							} else if (local780.anInt8188 == 0) {
								local296 += ((double) local776.anInt327 - local871) * (double) arg1;
								local300 += ((double) local780.anInt8180 - local871) * (double) arg1;
								local304 += ((double) local776.anInt333 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt1692 = (int) ((double) super.anInt1692 + ((double) local776.anInt327 - local871) * (double) arg1);
								super.anInt1696 = (int) ((double) super.anInt1696 + ((double) local780.anInt8180 - local871) * (double) arg1);
								super.anInt1699 = (int) ((double) super.anInt1699 + ((double) local776.anInt333 - local871) * (double) arg1);
							}
							local776 = (Class4_Sub5_Sub1) Static166.aClass321_2.method7157();
						}
					}
				}
			}
		}
		if (local35.anIntArray46 != null) {
			if (local35.anIntArray48 == null) {
				local35.anIntArray48 = new int[local35.anIntArray46.length];
				for (local317 = 0; local317 < local35.anIntArray46.length; local317++) {
					Static521.method7027(local35.anIntArray46[local317]);
					local35.anIntArray48[local317] = ((Class4_Sub24) Static193.aClass66_15.method1994((long) local35.anIntArray46[local317])).anInt4156;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray48.length; local317++) {
				@Pc(1137) Class320 local1137 = Static220.aClass320Array1[local35.anIntArray48[local317]];
				if (local1137.anInt8188 == 0) {
					local296 += (double) (local1137.anInt8193 * arg1);
					local300 += (double) (local1137.anInt8180 * arg1);
					local304 += (double) (local1137.anInt8189 * arg1);
					local306 = true;
				} else {
					super.anInt1692 += local1137.anInt8193 * arg1;
					super.anInt1696 += local1137.anInt8180 * arg1;
					super.anInt1699 += local1137.anInt8189 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort21 = (short) (int) local296;
					this.aShort19 = (short) (int) local300;
					this.aShort16 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt1700 <<= 0x1;
			}
		}
		super.anInt1692 = (int) ((long) super.anInt1692 + ((long) this.aShort21 * (long) (this.anInt1700 << 2) >> 23) * (long) arg1);
		super.anInt1696 = (int) ((long) super.anInt1696 + ((long) this.aShort19 * (long) (this.anInt1700 << 2) >> 23) * (long) arg1);
		super.anInt1699 = (int) ((long) super.anInt1699 + ((long) this.aShort16 * (long) (this.anInt1700 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "()V")
	public void method1702() {
		this.aClass3_Sub5_1.aClass3_Sub7_4.aClass3_Sub3_Sub1_Sub1Array2[this.aShort18] = null;
		Static522.aClass3_Sub3_Sub1_Sub1Array1[Static505.anInt5822] = this;
		Static505.anInt5822 = Static505.anInt5822 + 1 & 0x3FF;
		this.method8898();
		this.method4806();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!jp;IIIIIIIIIIIZZ)V")
	public void method1703(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass3_Sub5_1 = arg0;
		super.anInt1692 = arg1 << 12;
		super.anInt1696 = arg2 << 12;
		super.anInt1699 = arg3 << 12;
		super.anInt1695 = arg9;
		this.aShort17 = this.aShort20 = (short) arg8;
		super.anInt1698 = arg10;
		super.anInt1694 = arg11;
		super.aBoolean113 = arg13;
		this.aShort21 = (short) arg4;
		this.aShort19 = (short) arg5;
		this.aShort16 = (short) arg6;
		this.anInt1700 = arg7;
		super.aByte18 = this.aClass3_Sub5_1.aClass235_1.aByte88;
		this.method1699();
	}
}

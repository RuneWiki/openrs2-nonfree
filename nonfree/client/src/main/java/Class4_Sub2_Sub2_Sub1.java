import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class4_Sub2_Sub2_Sub1 extends Class4_Sub2_Sub2 {

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
	private int anInt7724;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Lclient!kr;")
	public Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "S")
	private short aShort110;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	private int anInt7723;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!kr;IIIIIIIIIIIZZ)V")
	public Class4_Sub2_Sub2_Sub1(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub4_1 = arg0;
		super.anInt7719 = arg1 << 12;
		super.anInt7716 = arg2 << 12;
		super.anInt7720 = arg3 << 12;
		super.anInt7717 = arg9;
		this.aShort111 = this.aShort112 = (short) arg8;
		super.anInt7721 = arg10;
		super.anInt7718 = arg11;
		super.aBoolean541 = arg13;
		this.aShort109 = (short) arg4;
		this.aShort107 = (short) arg5;
		this.aShort110 = (short) arg6;
		this.anInt7723 = arg7;
		super.aByte105 = this.aClass4_Sub4_1.aClass284_1.aByte111;
		this.method6698();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI)V")
	public void method6695(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort112 = (short) (this.aShort112 - arg1);
		if (this.aShort112 <= 0) {
			this.method6699();
			return;
		}
		@Pc(17) int local17 = super.anInt7719 >> 12;
		@Pc(22) int local22 = super.anInt7716 >> 12;
		@Pc(27) int local27 = super.anInt7720 >> 12;
		@Pc(31) Class4_Sub10 local31 = this.aClass4_Sub4_1.aClass4_Sub10_4;
		@Pc(35) Class349 local35 = this.aClass4_Sub4_1.aClass349_1;
		if (local35.lb != 0) {
			@Pc(65) int local65;
			if (this.aShort111 - this.aShort112 <= local35.anInt9624) {
				local65 = (super.anInt7717 >> 8 & 0xFF00) + (this.anInt7724 >> 16 & 0xFF) + local35.anInt9649 * arg1;
				@Pc(82) int local82 = (super.anInt7717 & 0xFF00) + (this.anInt7724 >> 8 & 0xFF) + local35.anInt9640 * arg1;
				@Pc(99) int local99 = ((super.anInt7717 & 0xFF) << 8) + (this.anInt7724 & 0xFF) + local35.anInt9659 * arg1;
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
				super.anInt7717 &= 0xFF000000;
				super.anInt7717 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7724 &= 0xFF000000;
				this.anInt7724 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort111 - this.aShort112 <= local35.anInt9662) {
				local65 = (super.anInt7717 >> 16 & 0xFF00) + (this.anInt7724 >> 24 & 0xFF) + local35.anInt9642 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7717 &= 0xFFFFFF;
				super.anInt7717 |= (local65 & 0xFF00) << 16;
				this.anInt7724 &= 0xFFFFFF;
				this.anInt7724 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt9639 != -1 && this.aShort111 - this.aShort112 <= local35.anInt9664) {
			this.anInt7723 += local35.anInt9623 * arg1;
		}
		if (local35.anInt9674 != -1 && this.aShort111 - this.aShort112 <= local35.anInt9658) {
			super.anInt7721 += local35.anInt9630 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort109;
		@Pc(300) double local300 = (double) this.aShort107;
		@Pc(304) double local304 = (double) this.aShort110;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt9651 == 1) {
			local317 = local17 - this.aClass4_Sub4_1.aClass88_1.anInt2641;
			local324 = local22 - this.aClass4_Sub4_1.aClass88_1.anInt2648;
			local331 = local27 - this.aClass4_Sub4_1.aClass88_1.anInt2649;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt9629 * local348 * arg1;
			this.anInt7723 = (int) ((long) this.anInt7723 - ((long) this.anInt7723 * local356 >> 18));
		} else if (local35.anInt9651 == 2) {
			local317 = local17 - this.aClass4_Sub4_1.aClass88_1.anInt2641;
			local324 = local22 - this.aClass4_Sub4_1.aClass88_1.anInt2648;
			local331 = local27 - this.aClass4_Sub4_1.aClass88_1.anInt2649;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt9629 * local348 * arg1;
			this.anInt7723 = (int) ((long) this.anInt7723 - ((long) this.anInt7723 * local356 >> 28));
		}
		if (local35.anIntArray624 != null) {
			@Pc(437) Class3 local437 = local31.aClass223_57.aClass3_188;
			for (@Pc(440) Class3 local440 = local437.aClass3_300; local440 != local437; local440 = local440.aClass3_300) {
				@Pc(444) Class3_Sub4_Sub3 local444 = (Class3_Sub4_Sub3) local440;
				@Pc(447) Class142 local447 = local444.aClass142_1;
				if (local447.anInt4112 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray624.length; local455++) {
						if (local35.anIntArray624[local455] == local447.anInt4126) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt1162);
						@Pc(486) double local486 = (double) (local22 - local444.anInt1164);
						@Pc(492) double local492 = (double) (local27 - local444.anInt1160);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong116)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt1159 + local486 * (double) local447.anInt4113 + local492 * (double) local444.anInt1158) * 65535.0D / ((double) local447.anInt4118 * local513);
							if (!(local545 < (double) local447.anInt4123)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt4116 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt4125;
								} else if (local447.anInt4116 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt4125;
								}
								if (local447.anInt4121 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt4118;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt4118;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt4118;
									if (local447.anInt4122 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt7719 = (int) ((double) super.anInt7719 + local678 * (double) arg1);
										super.anInt7716 = (int) ((double) super.anInt7716 + local686 * (double) arg1);
										super.anInt7720 = (int) ((double) super.anInt7720 + local694 * (double) arg1);
									}
								} else if (local447.anInt4122 == 0) {
									local296 += ((double) local444.anInt1159 - local553) * (double) arg1;
									local300 += ((double) local447.anInt4113 - local553) * (double) arg1;
									local304 += ((double) local444.anInt1158 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt7719 = (int) ((double) super.anInt7719 + ((double) local444.anInt1159 - local553) * (double) arg1);
									super.anInt7716 = (int) ((double) super.anInt7716 + ((double) local447.anInt4113 - local553) * (double) arg1);
									super.anInt7720 = (int) ((double) super.anInt7720 + ((double) local444.anInt1158 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray622 != null) {
			for (local317 = 0; local317 < local35.anIntArray622.length; local317++) {
				@Pc(776) Class3_Sub4_Sub3 local776 = (Class3_Sub4_Sub3) Static127.aClass42_1.method1581((long) local35.anIntArray622[local317]);
				while (local776 != null) {
					@Pc(780) Class142 local780 = local776.aClass142_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt1162);
					@Pc(792) double local792 = (double) (local22 - local776.anInt1164);
					@Pc(798) double local798 = (double) (local27 - local776.anInt1160);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong116) {
						local776 = (Class3_Sub4_Sub3) Static127.aClass42_1.method1579();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt1159 + local792 * (double) local780.anInt4113 + local798 * (double) local776.anInt1158) * 65535.0D / ((double) local780.anInt4118 * local825);
						if (local857 < (double) local780.anInt4123) {
							local776 = (Class3_Sub4_Sub3) Static127.aClass42_1.method1579();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt4116 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt4125;
							} else if (local780.anInt4116 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt4125;
							}
							if (local780.anInt4121 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt4118;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt4118;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt4118;
								if (local780.anInt4122 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt7719 = (int) ((double) super.anInt7719 + local996 * (double) arg1);
									super.anInt7716 = (int) ((double) super.anInt7716 + local1004 * (double) arg1);
									super.anInt7720 = (int) ((double) super.anInt7720 + local1012 * (double) arg1);
								}
							} else if (local780.anInt4122 == 0) {
								local296 += ((double) local776.anInt1159 - local871) * (double) arg1;
								local300 += ((double) local780.anInt4113 - local871) * (double) arg1;
								local304 += ((double) local776.anInt1158 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt7719 = (int) ((double) super.anInt7719 + ((double) local776.anInt1159 - local871) * (double) arg1);
								super.anInt7716 = (int) ((double) super.anInt7716 + ((double) local780.anInt4113 - local871) * (double) arg1);
								super.anInt7720 = (int) ((double) super.anInt7720 + ((double) local776.anInt1158 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub4_Sub3) Static127.aClass42_1.method1579();
						}
					}
				}
			}
		}
		if (local35.anIntArray623 != null) {
			if (local35.anIntArray625 == null) {
				local35.anIntArray625 = new int[local35.anIntArray623.length];
				for (local317 = 0; local317 < local35.anIntArray623.length; local317++) {
					Static17.method867(local35.anIntArray623[local317]);
					local35.anIntArray625[local317] = ((Class3_Sub19) Static326.aClass280_26.method7107((long) local35.anIntArray623[local317])).anInt2696;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray625.length; local317++) {
				@Pc(1137) Class142 local1137 = Static314.aClass142Array1[local35.anIntArray625[local317]];
				if (local1137.anInt4122 == 0) {
					local296 += local1137.anInt4117 * arg1;
					local300 += local1137.anInt4113 * arg1;
					local304 += local1137.anInt4120 * arg1;
					local306 = true;
				} else {
					super.anInt7719 += local1137.anInt4117 * arg1;
					super.anInt7716 += local1137.anInt4113 * arg1;
					super.anInt7720 += local1137.anInt4120 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort109 = (short) local296;
					this.aShort107 = (short) local300;
					this.aShort110 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt7723 <<= 0x1;
			}
		}
		super.anInt7719 = (int) ((long) super.anInt7719 + ((long) this.aShort109 * (long) (this.anInt7723 << 2) >> 23) * (long) arg1);
		super.anInt7716 = (int) ((long) super.anInt7716 + ((long) this.aShort107 * (long) (this.anInt7723 << 2) >> 23) * (long) arg1);
		super.anInt7720 = (int) ((long) super.anInt7720 + ((long) this.aShort110 * (long) (this.anInt7723 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!kr;IIIIIIIIIIIZZ)V")
	public void method6696(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub4_1 = arg0;
		super.anInt7719 = arg1 << 12;
		super.anInt7716 = arg2 << 12;
		super.anInt7720 = arg3 << 12;
		super.anInt7717 = arg9;
		this.aShort111 = this.aShort112 = (short) arg8;
		super.anInt7721 = arg10;
		super.anInt7718 = arg11;
		super.aBoolean541 = arg13;
		this.aShort109 = (short) arg4;
		this.aShort107 = (short) arg5;
		this.aShort110 = (short) arg6;
		this.anInt7723 = arg7;
		super.aByte105 = this.aClass4_Sub4_1.aClass284_1.aByte111;
		this.method6698();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method6697(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt7719 >> Static308.anInt5834 + 12;
		@Pc(13) int local13 = super.anInt7720 >> Static308.anInt5834 + 12;
		@Pc(18) int local18 = super.anInt7716 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static569.anInt9425 || local13 < 0 || local13 >= Static293.anInt5181) {
			this.method6699();
			return;
		}
		@Pc(40) Class4_Sub10 local40 = this.aClass4_Sub4_1.aClass4_Sub10_4;
		@Pc(44) Class349 local44 = this.aClass4_Sub4_1.aClass349_1;
		@Pc(46) Class51[] local46 = Static364.aClass51Array3;
		@Pc(49) int local49 = local40.anInt9126;
		@Pc(58) Class77 local58 = Static330.aClass77ArrayArrayArray2[local40.anInt9126][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte23;
		}
		@Pc(71) int local71 = local46[local49].method7835(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static442.anInt7929 - 1) {
			local86 = local46[local49 + 1].method7835(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static308.anInt5834);
		}
		if (local44.aBoolean700) {
			if (local44.anInt9665 == -1 && local18 > local71) {
				this.method6699();
				return;
			}
			if (local44.anInt9665 >= 0 && local18 > local46[local44.anInt9665].method7835(local6, local13)) {
				this.method6699();
				return;
			}
			if (local44.anInt9671 == -1 && local18 < local86) {
				this.method6699();
				return;
			}
			if (local44.anInt9671 >= 0 && local18 < local46[local44.anInt9671 + 1].method7835(local6, local13)) {
				this.method6699();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static442.anInt7929 - 1; local154 > 0 && local18 > local46[local154].method7835(local6, local13); local154--) {
		}
		if (local44.aBoolean693 && local154 == 0 && local18 > local46[0].method7835(local6, local13)) {
			this.method6699();
		} else if (local154 == Static442.anInt7929 - 1 && local46[local154].method7835(local6, local13) - local18 > 0x8 << Static308.anInt5834) {
			this.method6699();
		} else {
			local58 = Static330.aClass77ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static330.aClass77ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static330.aClass77ArrayArrayArray2[0][local6][local13] = new Class77(0);
				}
				@Pc(251) boolean local251 = Static330.aClass77ArrayArrayArray2[0][local6][local13].aClass77_1 != null;
				if (local154 == 3 && local251) {
					this.method6699();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static330.aClass77ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static330.aClass77ArrayArrayArray2[local261][local6][local13] = new Class77(local261);
						if (local251) {
							local58.aByte23++;
						}
					}
				}
			}
			if (local44.aBoolean697) {
				@Pc(304) int local304 = super.anInt7719 >> 12;
				local261 = super.anInt7720 >> 12;
				@Pc(318) Class297 local318;
				if (local58.aClass4_Sub1_Sub3_2 != null) {
					local318 = local58.aClass4_Sub1_Sub3_2.method7700(arg0);
					if (local318 != null && local318.method7394(local261, local18, local304)) {
						this.method6699();
						return;
					}
				}
				if (local58.aClass4_Sub1_Sub3_1 != null) {
					local318 = local58.aClass4_Sub1_Sub3_1.method7700(arg0);
					if (local318 != null && local318.method7394(local261, local18, local304)) {
						this.method6699();
						return;
					}
				}
				if (local58.aClass4_Sub1_Sub5_1 != null) {
					local318 = local58.aClass4_Sub1_Sub5_1.method7700(arg0);
					if (local318 != null && local318.method7394(local261, local18, local304)) {
						this.method6699();
						return;
					}
				}
				for (@Pc(375) Class128 local375 = local58.aClass128_1; local375 != null; local375 = local375.aClass128_2) {
					@Pc(382) Class297 local382 = local375.aClass4_Sub1_Sub2_1.method7700(arg0);
					if (local382 != null && local382.method7394(local261, local18, local304)) {
						this.method6699();
						return;
					}
				}
			}
			local40.aClass85_1.aClass34_1.method1397(this);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
	private void method6698() {
		@Pc(4) int local4 = this.aClass4_Sub4_1.aClass4_Sub10_4.anInt9124;
		if (this.aClass4_Sub4_1.aClass4_Sub10_4.aClass4_Sub2_Sub2_Sub1Array1[local4] != null) {
			this.aClass4_Sub4_1.aClass4_Sub10_4.aClass4_Sub2_Sub2_Sub1Array1[local4].method6699();
		}
		this.aClass4_Sub4_1.aClass4_Sub10_4.aClass4_Sub2_Sub2_Sub1Array1[local4] = this;
		this.aShort108 = (short) this.aClass4_Sub4_1.aClass4_Sub10_4.anInt9124;
		this.aClass4_Sub4_1.aClass4_Sub10_4.anInt9124 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub4_1.aClass120_4.method2960(this);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
	public void method6699() {
		this.aClass4_Sub4_1.aClass4_Sub10_4.aClass4_Sub2_Sub2_Sub1Array1[this.aShort108] = null;
		Static602.aClass4_Sub2_Sub2_Sub1Array2[Static165.anInt3235] = this;
		Static165.anInt3235 = Static165.anInt3235 + 1 & 0x3FF;
		this.method7841();
		this.method6693();
	}
}

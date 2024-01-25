import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class11_Sub5_Sub1_Sub1 extends Class11_Sub5_Sub1 {

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
	private int anInt4049;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "Lclient!hu;")
	public Class11_Sub6 aClass11_Sub6_1;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
	private int anInt4048;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!hu;IIIIIIIIIIIZZ)V")
	public Class11_Sub5_Sub1_Sub1(@OriginalArg(0) Class11_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass11_Sub6_1 = arg0;
		super.anInt4043 = arg1 << 12;
		super.anInt4041 = arg2 << 12;
		super.anInt4044 = arg3 << 12;
		super.anInt4045 = arg9;
		this.aShort77 = this.aShort73 = (short) arg8;
		super.anInt4047 = arg10;
		super.anInt4046 = arg11;
		super.aBoolean339 = arg13;
		this.aShort72 = (short) arg4;
		this.aShort76 = (short) arg5;
		this.aShort74 = (short) arg6;
		this.anInt4048 = arg7;
		super.aByte74 = this.aClass11_Sub6_1.aClass130_2.aByte73;
		this.method3315();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()V")
	private void method3315() {
		@Pc(4) int local4 = this.aClass11_Sub6_1.aClass11_Sub4_7.anInt3069;
		if (this.aClass11_Sub6_1.aClass11_Sub4_7.aClass11_Sub5_Sub1_Sub1Array1[local4] != null) {
			this.aClass11_Sub6_1.aClass11_Sub4_7.aClass11_Sub5_Sub1_Sub1Array1[local4].method3317();
		}
		this.aClass11_Sub6_1.aClass11_Sub4_7.aClass11_Sub5_Sub1_Sub1Array1[local4] = this;
		this.aShort75 = (short) this.aClass11_Sub6_1.aClass11_Sub4_7.anInt3069;
		this.aClass11_Sub6_1.aClass11_Sub4_7.anInt3069 = local4 + 1 & 0x1FFF;
		this.aClass11_Sub6_1.aClass143_5.method3529(this);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V")
	public void method3316(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort73 = (short) (this.aShort73 - arg1);
		if (this.aShort73 <= 0) {
			this.method3317();
			return;
		}
		@Pc(17) int local17 = super.anInt4043 >> 12;
		@Pc(22) int local22 = super.anInt4041 >> 12;
		@Pc(27) int local27 = super.anInt4044 >> 12;
		@Pc(31) Class11_Sub4 local31 = this.aClass11_Sub6_1.aClass11_Sub4_7;
		@Pc(35) Class106 local35 = this.aClass11_Sub6_1.aClass106_1;
		if (local35.anInt3410 != 0) {
			@Pc(65) int local65;
			if (this.aShort77 - this.aShort73 <= local35.anInt3382) {
				local65 = (super.anInt4045 >> 8 & 0xFF00) + (this.anInt4049 >> 16 & 0xFF) + local35.anInt3416 * arg1;
				@Pc(82) int local82 = (super.anInt4045 & 0xFF00) + (this.anInt4049 >> 8 & 0xFF) + local35.anInt3383 * arg1;
				@Pc(99) int local99 = ((super.anInt4045 & 0xFF) << 8) + (this.anInt4049 & 0xFF) + local35.anInt3427 * arg1;
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
				super.anInt4045 &= 0xFF000000;
				super.anInt4045 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4049 &= 0xFF000000;
				this.anInt4049 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort77 - this.aShort73 <= local35.anInt3397) {
				local65 = (super.anInt4045 >> 16 & 0xFF00) + (this.anInt4049 >> 24 & 0xFF) + local35.anInt3379 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4045 &= 0xFFFFFF;
				super.anInt4045 |= (local65 & 0xFF00) << 16;
				this.anInt4049 &= 0xFFFFFF;
				this.anInt4049 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3402 != -1 && this.aShort77 - this.aShort73 <= local35.lb) {
			this.anInt4048 += local35.anInt3412 * arg1;
		}
		if (local35.anInt3381 != -1 && this.aShort77 - this.aShort73 <= local35.anInt3426) {
			super.anInt4047 += local35.anInt3407 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort72;
		@Pc(300) double local300 = (double) this.aShort76;
		@Pc(304) double local304 = (double) this.aShort74;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt3393 == 1) {
			local317 = local17 - this.aClass11_Sub6_1.aClass95_1.anInt2941;
			local324 = local22 - this.aClass11_Sub6_1.aClass95_1.anInt2946;
			local331 = local27 - this.aClass11_Sub6_1.aClass95_1.anInt2953;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt3419 * local348 * arg1;
			this.anInt4048 = (int) ((long) this.anInt4048 - ((long) this.anInt4048 * local356 >> 18));
		} else if (local35.anInt3393 == 2) {
			local317 = local17 - this.aClass11_Sub6_1.aClass95_1.anInt2941;
			local324 = local22 - this.aClass11_Sub6_1.aClass95_1.anInt2946;
			local331 = local27 - this.aClass11_Sub6_1.aClass95_1.anInt2953;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt3419 * local348 * arg1;
			this.anInt4048 = (int) ((long) this.anInt4048 - ((long) this.anInt4048 * local356 >> 28));
		}
		if (local35.anIntArray240 != null) {
			@Pc(437) Class2 local437 = local31.aClass238_24.aClass2_201;
			for (@Pc(440) Class2 local440 = local437.aClass2_300; local440 != local437; local440 = local440.aClass2_300) {
				@Pc(444) Class2_Sub5_Sub14 local444 = (Class2_Sub5_Sub14) local440;
				@Pc(447) Class351 local447 = local444.aClass351_1;
				if (local447.anInt9697 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray240.length; local455++) {
						if (local35.anIntArray240[local455] == local447.anInt9701) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt5634);
						@Pc(486) double local486 = (double) (local22 - local444.anInt5635);
						@Pc(492) double local492 = (double) (local27 - local444.anInt5641);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong260)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt5636 + local486 * (double) local447.anInt9696 + local492 * (double) local444.anInt5644) * 65535.0D / ((double) local447.anInt9703 * local513);
							if (!(local545 < (double) local447.anInt9704)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt9707 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt9693;
								} else if (local447.anInt9707 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt9693;
								}
								if (local447.anInt9699 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt9703;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt9703;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt9703;
									if (local447.anInt9694 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt4043 = (int) ((double) super.anInt4043 + local678 * (double) arg1);
										super.anInt4041 = (int) ((double) super.anInt4041 + local686 * (double) arg1);
										super.anInt4044 = (int) ((double) super.anInt4044 + local694 * (double) arg1);
									}
								} else if (local447.anInt9694 == 0) {
									local296 += ((double) local444.anInt5636 - local553) * (double) arg1;
									local300 += ((double) local447.anInt9696 - local553) * (double) arg1;
									local304 += ((double) local444.anInt5644 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt4043 = (int) ((double) super.anInt4043 + ((double) local444.anInt5636 - local553) * (double) arg1);
									super.anInt4041 = (int) ((double) super.anInt4041 + ((double) local447.anInt9696 - local553) * (double) arg1);
									super.anInt4044 = (int) ((double) super.anInt4044 + ((double) local444.anInt5644 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray238 != null) {
			for (local317 = 0; local317 < local35.anIntArray238.length; local317++) {
				@Pc(776) Class2_Sub5_Sub14 local776 = (Class2_Sub5_Sub14) Static119.aClass185_1.method4465((long) local35.anIntArray238[local317]);
				while (local776 != null) {
					@Pc(780) Class351 local780 = local776.aClass351_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt5634);
					@Pc(792) double local792 = (double) (local22 - local776.anInt5635);
					@Pc(798) double local798 = (double) (local27 - local776.anInt5641);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong260) {
						local776 = (Class2_Sub5_Sub14) Static119.aClass185_1.method4459();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt5636 + local792 * (double) local780.anInt9696 + local798 * (double) local776.anInt5644) * 65535.0D / ((double) local780.anInt9703 * local825);
						if (local857 < (double) local780.anInt9704) {
							local776 = (Class2_Sub5_Sub14) Static119.aClass185_1.method4459();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt9707 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt9693;
							} else if (local780.anInt9707 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt9693;
							}
							if (local780.anInt9699 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt9703;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt9703;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt9703;
								if (local780.anInt9694 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt4043 = (int) ((double) super.anInt4043 + local996 * (double) arg1);
									super.anInt4041 = (int) ((double) super.anInt4041 + local1004 * (double) arg1);
									super.anInt4044 = (int) ((double) super.anInt4044 + local1012 * (double) arg1);
								}
							} else if (local780.anInt9694 == 0) {
								local296 += ((double) local776.anInt5636 - local871) * (double) arg1;
								local300 += ((double) local780.anInt9696 - local871) * (double) arg1;
								local304 += ((double) local776.anInt5644 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt4043 = (int) ((double) super.anInt4043 + ((double) local776.anInt5636 - local871) * (double) arg1);
								super.anInt4041 = (int) ((double) super.anInt4041 + ((double) local780.anInt9696 - local871) * (double) arg1);
								super.anInt4044 = (int) ((double) super.anInt4044 + ((double) local776.anInt5644 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub5_Sub14) Static119.aClass185_1.method4459();
						}
					}
				}
			}
		}
		if (local35.anIntArray241 != null) {
			if (local35.anIntArray239 == null) {
				local35.anIntArray239 = new int[local35.anIntArray241.length];
				for (local317 = 0; local317 < local35.anIntArray241.length; local317++) {
					Static235.method3901(local35.anIntArray241[local317]);
					local35.anIntArray239[local317] = ((Class2_Sub15) Static622.aClass222_43.method5468((long) local35.anIntArray241[local317])).anInt1789;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray239.length; local317++) {
				@Pc(1137) Class351 local1137 = Static518.aClass351Array1[local35.anIntArray239[local317]];
				if (local1137.anInt9694 == 0) {
					local296 += local1137.anInt9700 * arg1;
					local300 += local1137.anInt9696 * arg1;
					local304 += local1137.anInt9695 * arg1;
					local306 = true;
				} else {
					super.anInt4043 += local1137.anInt9700 * arg1;
					super.anInt4041 += local1137.anInt9696 * arg1;
					super.anInt4044 += local1137.anInt9695 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort72 = (short) local296;
					this.aShort76 = (short) local300;
					this.aShort74 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt4048 <<= 0x1;
			}
		}
		super.anInt4043 = (int) ((long) super.anInt4043 + ((long) this.aShort72 * (long) (this.anInt4048 << 2) >> 23) * (long) arg1);
		super.anInt4041 = (int) ((long) super.anInt4041 + ((long) this.aShort76 * (long) (this.anInt4048 << 2) >> 23) * (long) arg1);
		super.anInt4044 = (int) ((long) super.anInt4044 + ((long) this.aShort74 * (long) (this.anInt4048 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()V")
	public void method3317() {
		this.aClass11_Sub6_1.aClass11_Sub4_7.aClass11_Sub5_Sub1_Sub1Array1[this.aShort75] = null;
		Static376.aClass11_Sub5_Sub1_Sub1Array2[Static439.anInt7801] = this;
		Static439.anInt7801 = Static439.anInt7801 + 1 & 0x3FF;
		this.method8372();
		this.method4873();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!hu;IIIIIIIIIIIZZ)V")
	public void method3318(@OriginalArg(0) Class11_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass11_Sub6_1 = arg0;
		super.anInt4043 = arg1 << 12;
		super.anInt4041 = arg2 << 12;
		super.anInt4044 = arg3 << 12;
		super.anInt4045 = arg9;
		this.aShort77 = this.aShort73 = (short) arg8;
		super.anInt4047 = arg10;
		super.anInt4046 = arg11;
		super.aBoolean339 = arg13;
		this.aShort72 = (short) arg4;
		this.aShort76 = (short) arg5;
		this.aShort74 = (short) arg6;
		this.anInt4048 = arg7;
		super.aByte74 = this.aClass11_Sub6_1.aClass130_2.aByte73;
		this.method3315();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method3319(@OriginalArg(0) Class87 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt4043 >> Static415.anInt7579 + 12;
		@Pc(13) int local13 = super.anInt4044 >> Static415.anInt7579 + 12;
		@Pc(18) int local18 = super.anInt4041 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static347.anInt6411 || local13 < 0 || local13 >= Static191.anInt6006) {
			this.method3317();
			return;
		}
		@Pc(40) Class11_Sub4 local40 = this.aClass11_Sub6_1.aClass11_Sub4_7;
		@Pc(44) Class106 local44 = this.aClass11_Sub6_1.aClass106_1;
		@Pc(46) Class112[] local46 = Static331.aClass112Array3;
		@Pc(49) int local49 = local40.anInt3072;
		@Pc(58) Class217 local58 = Static440.aClass217ArrayArrayArray3[local40.anInt3072][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte91;
		}
		@Pc(71) int local71 = local46[local49].method7819(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static330.anInt4381 - 1) {
			local86 = local46[local49 + 1].method7819(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static415.anInt7579);
		}
		if (local44.aBoolean290) {
			if (local44.anInt3408 == -1 && local18 > local71) {
				this.method3317();
				return;
			}
			if (local44.anInt3408 >= 0 && local18 > local46[local44.anInt3408].method7819(local13, local6)) {
				this.method3317();
				return;
			}
			if (local44.anInt3387 == -1 && local18 < local86) {
				this.method3317();
				return;
			}
			if (local44.anInt3387 >= 0 && local18 < local46[local44.anInt3387 + 1].method7819(local13, local6)) {
				this.method3317();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static330.anInt4381 - 1; local154 > 0 && local18 > local46[local154].method7819(local13, local6); local154--) {
		}
		if (local44.aBoolean295 && local154 == 0 && local18 > local46[0].method7819(local13, local6)) {
			this.method3317();
		} else if (local154 == Static330.anInt4381 - 1 && local46[local154].method7819(local13, local6) - local18 > 0x8 << Static415.anInt7579) {
			this.method3317();
		} else {
			local58 = Static440.aClass217ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static440.aClass217ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static440.aClass217ArrayArrayArray3[0][local6][local13] = new Class217(0);
				}
				@Pc(251) boolean local251 = Static440.aClass217ArrayArrayArray3[0][local6][local13].aClass217_1 != null;
				if (local154 == 3 && local251) {
					this.method3317();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static440.aClass217ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static440.aClass217ArrayArrayArray3[local261][local6][local13] = new Class217(local261);
						if (local251) {
							local58.aByte91++;
						}
					}
				}
			}
			if (local44.aBoolean296) {
				@Pc(304) int local304 = super.anInt4043 >> 12;
				local261 = super.anInt4044 >> 12;
				@Pc(318) Class316 local318;
				if (local58.aClass11_Sub1_Sub2_1 != null) {
					local318 = local58.aClass11_Sub1_Sub2_1.method8308(arg0);
					if (local318 != null && local318.method7473(local304, local18, local261)) {
						this.method3317();
						return;
					}
				}
				if (local58.aClass11_Sub1_Sub2_2 != null) {
					local318 = local58.aClass11_Sub1_Sub2_2.method8308(arg0);
					if (local318 != null && local318.method7473(local304, local18, local261)) {
						this.method3317();
						return;
					}
				}
				if (local58.aClass11_Sub1_Sub4_1 != null) {
					local318 = local58.aClass11_Sub1_Sub4_1.method8308(arg0);
					if (local318 != null && local318.method7473(local304, local18, local261)) {
						this.method3317();
						return;
					}
				}
				for (@Pc(375) Class61 local375 = local58.aClass61_2; local375 != null; local375 = local375.aClass61_1) {
					@Pc(382) Class316 local382 = local375.aClass11_Sub1_Sub1_1.method8308(arg0);
					if (local382 != null && local382.method7473(local304, local18, local261)) {
						this.method3317();
						return;
					}
				}
			}
			local40.aClass247_1.aClass34_1.method818(this);
		}
	}
}

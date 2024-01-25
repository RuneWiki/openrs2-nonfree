import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class4_Sub4_Sub1_Sub1 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	private int anInt9667;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "Lclient!ms;")
	public Class4_Sub6 aClass4_Sub6_1;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	private int anInt9668;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ms;IIIIIIIIIIIZZ)V")
	public Class4_Sub4_Sub1_Sub1(@OriginalArg(0) Class4_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub6_1 = arg0;
		super.anInt9663 = arg1 << 12;
		super.anInt9665 = arg2 << 12;
		super.anInt9662 = arg3 << 12;
		super.anInt9661 = arg9;
		this.aShort100 = this.aShort101 = (short) arg8;
		super.anInt9664 = arg10;
		super.anInt9660 = arg11;
		super.aBoolean666 = arg13;
		this.aShort99 = (short) arg4;
		this.aShort98 = (short) arg5;
		this.aShort96 = (short) arg6;
		this.anInt9668 = arg7;
		super.aByte117 = this.aClass4_Sub6_1.aClass352_1.aByte118;
		this.method8331();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method8327(@OriginalArg(0) Class144 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt9663 >> Static110.anInt1858 + 12;
		@Pc(13) int local13 = super.anInt9662 >> Static110.anInt1858 + 12;
		@Pc(18) int local18 = super.anInt9665 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static654.anInt10715 || local13 < 0 || local13 >= Static180.anInt2928) {
			this.method8328();
			return;
		}
		@Pc(40) Class4_Sub8 local40 = this.aClass4_Sub6_1.aClass4_Sub8_7;
		@Pc(44) Class385 local44 = this.aClass4_Sub6_1.aClass385_1;
		@Pc(46) Class159[] local46 = Static258.aClass159Array1;
		@Pc(49) int local49 = local40.anInt10139;
		@Pc(58) Class89 local58 = Static63.aClass89ArrayArrayArray1[local40.anInt10139][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte27;
		}
		@Pc(71) int local71 = local46[local49].method8207(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static59.anInt987 - 1) {
			local86 = local46[local49 + 1].method8207(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static110.anInt1858);
		}
		if (local44.aBoolean757) {
			if (local44.anInt10849 == -1 && local18 > local71) {
				this.method8328();
				return;
			}
			if (local44.anInt10849 >= 0 && local18 > local46[local44.anInt10849].method8207(local13, local6)) {
				this.method8328();
				return;
			}
			if (local44.anInt10853 == -1 && local18 < local86) {
				this.method8328();
				return;
			}
			if (local44.anInt10853 >= 0 && local18 < local46[local44.anInt10853 + 1].method8207(local13, local6)) {
				this.method8328();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static59.anInt987 - 1; local154 > 0 && local18 > local46[local154].method8207(local13, local6); local154--) {
		}
		if (local44.aBoolean756 && local154 == 0 && local18 > local46[0].method8207(local13, local6)) {
			this.method8328();
		} else if (local154 == Static59.anInt987 - 1 && local46[local154].method8207(local13, local6) - local18 > 0x8 << Static110.anInt1858) {
			this.method8328();
		} else {
			local58 = Static63.aClass89ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static63.aClass89ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static63.aClass89ArrayArrayArray1[0][local6][local13] = new Class89(0);
				}
				@Pc(251) boolean local251 = Static63.aClass89ArrayArrayArray1[0][local6][local13].aClass89_1 != null;
				if (local154 == 3 && local251) {
					this.method8328();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static63.aClass89ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static63.aClass89ArrayArrayArray1[local261][local6][local13] = new Class89(local261);
						if (local251) {
							local58.aByte27++;
						}
					}
				}
			}
			if (local44.aBoolean754) {
				@Pc(304) int local304 = super.anInt9663 >> 12;
				local261 = super.anInt9662 >> 12;
				@Pc(318) Class348 local318;
				if (local58.aClass4_Sub3_Sub1_1 != null) {
					local318 = local58.aClass4_Sub3_Sub1_1.method9492(arg0);
					if (local318 != null && local318.method8313(local261, local304, local18)) {
						this.method8328();
						return;
					}
				}
				if (local58.aClass4_Sub3_Sub1_2 != null) {
					local318 = local58.aClass4_Sub3_Sub1_2.method9492(arg0);
					if (local318 != null && local318.method8313(local261, local304, local18)) {
						this.method8328();
						return;
					}
				}
				if (local58.aClass4_Sub3_Sub2_1 != null) {
					local318 = local58.aClass4_Sub3_Sub2_1.method9492(arg0);
					if (local318 != null && local318.method8313(local261, local304, local18)) {
						this.method8328();
						return;
					}
				}
				for (@Pc(375) Class58 local375 = local58.aClass58_2; local375 != null; local375 = local375.aClass58_1) {
					@Pc(382) Class348 local382 = local375.aClass4_Sub3_Sub3_1.method9492(arg0);
					if (local382 != null && local382.method8313(local261, local304, local18)) {
						this.method8328();
						return;
					}
				}
			}
			local40.aClass304_1.aClass324_1.method7953(this);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
	public void method8328() {
		this.aClass4_Sub6_1.aClass4_Sub8_7.aClass4_Sub4_Sub1_Sub1Array2[this.aShort97] = null;
		Static34.aClass4_Sub4_Sub1_Sub1Array1[Static297.anInt5329] = this;
		Static297.anInt5329 = Static297.anInt5329 + 1 & 0x3FF;
		this.method9473();
		this.method8320();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(JI)V")
	public void method8329(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort101 = (short) (this.aShort101 - arg1);
		if (this.aShort101 <= 0) {
			this.method8328();
			return;
		}
		@Pc(17) int local17 = super.anInt9663 >> 12;
		@Pc(22) int local22 = super.anInt9665 >> 12;
		@Pc(27) int local27 = super.anInt9662 >> 12;
		@Pc(31) Class4_Sub8 local31 = this.aClass4_Sub6_1.aClass4_Sub8_7;
		@Pc(35) Class385 local35 = this.aClass4_Sub6_1.aClass385_1;
		if (local35.anInt10813 != 0) {
			@Pc(65) int local65;
			if (this.aShort100 - this.aShort101 <= local35.anInt10848) {
				local65 = (super.anInt9661 >> 8 & 0xFF00) + (this.anInt9667 >> 16 & 0xFF) + local35.anInt10832 * arg1;
				@Pc(82) int local82 = (super.anInt9661 & 0xFF00) + (this.anInt9667 >> 8 & 0xFF) + local35.anInt10819 * arg1;
				@Pc(99) int local99 = ((super.anInt9661 & 0xFF) << 8) + (this.anInt9667 & 0xFF) + local35.anInt10811 * arg1;
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
				super.anInt9661 &= 0xFF000000;
				super.anInt9661 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt9667 &= 0xFF000000;
				this.anInt9667 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort100 - this.aShort101 <= local35.anInt10831) {
				local65 = (super.anInt9661 >> 16 & 0xFF00) + (this.anInt9667 >> 24 & 0xFF) + local35.anInt10851 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt9661 &= 0xFFFFFF;
				super.anInt9661 |= (local65 & 0xFF00) << 16;
				this.anInt9667 &= 0xFFFFFF;
				this.anInt9667 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt10812 != -1 && this.aShort100 - this.aShort101 <= local35.anInt10838) {
			this.anInt9668 += local35.anInt10840 * arg1;
		}
		if (local35.anInt10826 != -1 && this.aShort100 - this.aShort101 <= local35.anInt10852) {
			super.anInt9664 += local35.anInt10833 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort99;
		@Pc(300) double local300 = (double) this.aShort98;
		@Pc(304) double local304 = (double) this.aShort96;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt10814 == 1) {
			local317 = local17 - this.aClass4_Sub6_1.aClass369_1.anInt10384;
			local324 = local22 - this.aClass4_Sub6_1.aClass369_1.anInt10387;
			local331 = local27 - this.aClass4_Sub6_1.aClass369_1.anInt10377;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt10820 * local348 * arg1);
			this.anInt9668 = (int) ((long) this.anInt9668 - ((long) this.anInt9668 * local356 >> 18));
		} else if (local35.anInt10814 == 2) {
			local317 = local17 - this.aClass4_Sub6_1.aClass369_1.anInt10384;
			local324 = local22 - this.aClass4_Sub6_1.aClass369_1.anInt10387;
			local331 = local27 - this.aClass4_Sub6_1.aClass369_1.anInt10377;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt10820 * local348 * arg1);
			this.anInt9668 = (int) ((long) this.anInt9668 - ((long) this.anInt9668 * local356 >> 28));
		}
		if (local35.anIntArray582 != null) {
			@Pc(437) Class14 local437 = local31.aClass32_65.aClass14_27;
			for (@Pc(440) Class14 local440 = local437.aClass14_339; local440 != local437; local440 = local440.aClass14_339) {
				@Pc(444) Class14_Sub2_Sub3 local444 = (Class14_Sub2_Sub3) local440;
				@Pc(447) Class312 local447 = local444.aClass312_1;
				if (local447.anInt9074 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray582.length; local455++) {
						if (local35.anIntArray582[local455] == local447.anInt9072) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt1086);
						@Pc(486) double local486 = (double) (local22 - local444.anInt1083);
						@Pc(492) double local492 = (double) (local27 - local444.anInt1080);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong242)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt1081 + local486 * (double) local447.anInt9077 + local492 * (double) local444.anInt1084) * 65535.0D / ((double) local447.anInt9088 * local513);
							if (!(local545 < (double) local447.anInt9089)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt9082 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt9085;
								} else if (local447.anInt9082 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt9085;
								}
								if (local447.anInt9090 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt9088;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt9088;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt9088;
									if (local447.anInt9075 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt9663 = (int) ((double) super.anInt9663 + local678 * (double) arg1);
										super.anInt9665 = (int) ((double) super.anInt9665 + local686 * (double) arg1);
										super.anInt9662 = (int) ((double) super.anInt9662 + local694 * (double) arg1);
									}
								} else if (local447.anInt9075 == 0) {
									local296 += ((double) local444.anInt1081 - local553) * (double) arg1;
									local300 += ((double) local447.anInt9077 - local553) * (double) arg1;
									local304 += ((double) local444.anInt1084 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt9663 = (int) ((double) super.anInt9663 + ((double) local444.anInt1081 - local553) * (double) arg1);
									super.anInt9665 = (int) ((double) super.anInt9665 + ((double) local447.anInt9077 - local553) * (double) arg1);
									super.anInt9662 = (int) ((double) super.anInt9662 + ((double) local444.anInt1084 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray581 != null) {
			for (local317 = 0; local317 < local35.anIntArray581.length; local317++) {
				@Pc(776) Class14_Sub2_Sub3 local776 = (Class14_Sub2_Sub3) Static164.aClass300_1.method7457((long) local35.anIntArray581[local317]);
				while (local776 != null) {
					@Pc(780) Class312 local780 = local776.aClass312_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt1086);
					@Pc(792) double local792 = (double) (local22 - local776.anInt1083);
					@Pc(798) double local798 = (double) (local27 - local776.anInt1080);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong242) {
						local776 = (Class14_Sub2_Sub3) Static164.aClass300_1.method7454();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt1081 + local792 * (double) local780.anInt9077 + local798 * (double) local776.anInt1084) * 65535.0D / ((double) local780.anInt9088 * local825);
						if (local857 < (double) local780.anInt9089) {
							local776 = (Class14_Sub2_Sub3) Static164.aClass300_1.method7454();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt9082 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt9085;
							} else if (local780.anInt9082 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt9085;
							}
							if (local780.anInt9090 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt9088;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt9088;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt9088;
								if (local780.anInt9075 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt9663 = (int) ((double) super.anInt9663 + local996 * (double) arg1);
									super.anInt9665 = (int) ((double) super.anInt9665 + local1004 * (double) arg1);
									super.anInt9662 = (int) ((double) super.anInt9662 + local1012 * (double) arg1);
								}
							} else if (local780.anInt9075 == 0) {
								local296 += ((double) local776.anInt1081 - local871) * (double) arg1;
								local300 += ((double) local780.anInt9077 - local871) * (double) arg1;
								local304 += ((double) local776.anInt1084 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt9663 = (int) ((double) super.anInt9663 + ((double) local776.anInt1081 - local871) * (double) arg1);
								super.anInt9665 = (int) ((double) super.anInt9665 + ((double) local780.anInt9077 - local871) * (double) arg1);
								super.anInt9662 = (int) ((double) super.anInt9662 + ((double) local776.anInt1084 - local871) * (double) arg1);
							}
							local776 = (Class14_Sub2_Sub3) Static164.aClass300_1.method7454();
						}
					}
				}
			}
		}
		if (local35.anIntArray580 != null) {
			if (local35.anIntArray583 == null) {
				local35.anIntArray583 = new int[local35.anIntArray580.length];
				for (local317 = 0; local317 < local35.anIntArray580.length; local317++) {
					Static530.method7847(local35.anIntArray580[local317]);
					local35.anIntArray583[local317] = ((Class14_Sub30) Static352.aClass125_41.method2630((long) local35.anIntArray580[local317])).anInt6793;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray583.length; local317++) {
				@Pc(1137) Class312 local1137 = Static633.aClass312Array31[local35.anIntArray583[local317]];
				if (local1137.anInt9075 == 0) {
					local296 += (double) (local1137.anInt9078 * arg1);
					local300 += (double) (local1137.anInt9077 * arg1);
					local304 += (double) (local1137.anInt9073 * arg1);
					local306 = true;
				} else {
					super.anInt9663 += local1137.anInt9078 * arg1;
					super.anInt9665 += local1137.anInt9077 * arg1;
					super.anInt9662 += local1137.anInt9073 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort99 = (short) (int) local296;
					this.aShort98 = (short) (int) local300;
					this.aShort96 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt9668 <<= 0x1;
			}
		}
		super.anInt9663 = (int) ((long) super.anInt9663 + ((long) this.aShort99 * (long) (this.anInt9668 << 2) >> 23) * (long) arg1);
		super.anInt9665 = (int) ((long) super.anInt9665 + ((long) this.aShort98 * (long) (this.anInt9668 << 2) >> 23) * (long) arg1);
		super.anInt9662 = (int) ((long) super.anInt9662 + ((long) this.aShort96 * (long) (this.anInt9668 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ms;IIIIIIIIIIIZZ)V")
	public void method8330(@OriginalArg(0) Class4_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub6_1 = arg0;
		super.anInt9663 = arg1 << 12;
		super.anInt9665 = arg2 << 12;
		super.anInt9662 = arg3 << 12;
		super.anInt9661 = arg9;
		this.aShort100 = this.aShort101 = (short) arg8;
		super.anInt9664 = arg10;
		super.anInt9660 = arg11;
		super.aBoolean666 = arg13;
		this.aShort99 = (short) arg4;
		this.aShort98 = (short) arg5;
		this.aShort96 = (short) arg6;
		this.anInt9668 = arg7;
		super.aByte117 = this.aClass4_Sub6_1.aClass352_1.aByte118;
		this.method8331();
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "()V")
	private void method8331() {
		@Pc(4) int local4 = this.aClass4_Sub6_1.aClass4_Sub8_7.anInt10137;
		if (this.aClass4_Sub6_1.aClass4_Sub8_7.aClass4_Sub4_Sub1_Sub1Array2[local4] != null) {
			this.aClass4_Sub6_1.aClass4_Sub8_7.aClass4_Sub4_Sub1_Sub1Array2[local4].method8328();
		}
		this.aClass4_Sub6_1.aClass4_Sub8_7.aClass4_Sub4_Sub1_Sub1Array2[local4] = this;
		this.aShort97 = (short) this.aClass4_Sub6_1.aClass4_Sub8_7.anInt10137;
		this.aClass4_Sub6_1.aClass4_Sub8_7.anInt10137 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub6_1.aClass283_8.method6802(this);
	}
}

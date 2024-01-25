import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class9_Sub1_Sub1_Sub1 extends Class9_Sub1_Sub1 {

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Lclient!qba;")
	public Class9_Sub9 aClass9_Sub9_1;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!qba;IIIIIIIIIIIZZ)V")
	public Class9_Sub1_Sub1_Sub1(@OriginalArg(0) Class9_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub9_1 = arg0;
		super.anInt505 = arg1 << 12;
		super.anInt506 = arg2 << 12;
		super.anInt504 = arg3 << 12;
		super.anInt507 = arg9;
		this.aShort4 = this.aShort7 = (short) arg8;
		super.anInt508 = arg10;
		super.anInt509 = arg11;
		super.aBoolean53 = arg13;
		this.aShort6 = (short) arg4;
		this.aShort3 = (short) arg5;
		this.aShort5 = (short) arg6;
		this.anInt515 = arg7;
		super.aByte2 = this.aClass9_Sub9_1.aClass103_2.aByte29;
		this.method481();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V")
	public void method480(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort7 = (short) (this.aShort7 - arg1);
		if (this.aShort7 <= 0) {
			this.method484();
			return;
		}
		@Pc(17) int local17 = super.anInt505 >> 12;
		@Pc(22) int local22 = super.anInt506 >> 12;
		@Pc(27) int local27 = super.anInt504 >> 12;
		@Pc(31) Class9_Sub5 local31 = this.aClass9_Sub9_1.aClass9_Sub5_5;
		@Pc(35) Class108 local35 = this.aClass9_Sub9_1.aClass108_1;
		if (local35.anInt3711 != 0) {
			@Pc(65) int local65;
			if (this.aShort4 - this.aShort7 <= local35.anInt3712) {
				local65 = (super.anInt507 >> 8 & 0xFF00) + (this.anInt514 >> 16 & 0xFF) + local35.anInt3694 * arg1;
				@Pc(82) int local82 = (super.anInt507 & 0xFF00) + (this.anInt514 >> 8 & 0xFF) + local35.anInt3687 * arg1;
				@Pc(99) int local99 = ((super.anInt507 & 0xFF) << 8) + (this.anInt514 & 0xFF) + local35.anInt3683 * arg1;
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
				super.anInt507 &= 0xFF000000;
				super.anInt507 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt514 &= 0xFF000000;
				this.anInt514 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort4 - this.aShort7 <= local35.anInt3709) {
				local65 = (super.anInt507 >> 16 & 0xFF00) + (this.anInt514 >> 24 & 0xFF) + local35.anInt3726 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt507 &= 0xFFFFFF;
				super.anInt507 |= (local65 & 0xFF00) << 16;
				this.anInt514 &= 0xFFFFFF;
				this.anInt514 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3696 != -1 && this.aShort4 - this.aShort7 <= local35.anInt3731) {
			this.anInt515 += local35.anInt3728 * arg1;
		}
		if (local35.anInt3724 != -1 && this.aShort4 - this.aShort7 <= local35.anInt3725) {
			super.anInt508 += local35.anInt3693 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort6;
		@Pc(300) double local300 = (double) this.aShort3;
		@Pc(304) double local304 = (double) this.aShort5;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt3690 == 1) {
			local317 = local17 - this.aClass9_Sub9_1.aClass232_1.anInt7238;
			local324 = local22 - this.aClass9_Sub9_1.aClass232_1.anInt7240;
			local331 = local27 - this.aClass9_Sub9_1.aClass232_1.anInt7244;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt3736 * local348 * arg1);
			this.anInt515 = (int) ((long) this.anInt515 - ((long) this.anInt515 * local356 >> 18));
		} else if (local35.anInt3690 == 2) {
			local317 = local17 - this.aClass9_Sub9_1.aClass232_1.anInt7238;
			local324 = local22 - this.aClass9_Sub9_1.aClass232_1.anInt7240;
			local331 = local27 - this.aClass9_Sub9_1.aClass232_1.anInt7244;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt3736 * local348 * arg1);
			this.anInt515 = (int) ((long) this.anInt515 - ((long) this.anInt515 * local356 >> 28));
		}
		if (local35.anIntArray162 != null) {
			@Pc(437) Class6 local437 = local31.aClass163_34.aClass6_178;
			for (@Pc(440) Class6 local440 = local437.aClass6_300; local440 != local437; local440 = local440.aClass6_300) {
				@Pc(444) Class6_Sub5_Sub7 local444 = (Class6_Sub5_Sub7) local440;
				@Pc(447) Class81 local447 = local444.aClass81_1;
				if (local447.anInt3151 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray162.length; local455++) {
						if (local35.anIntArray162[local455] == local447.anInt3153) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt2808);
						@Pc(486) double local486 = (double) (local22 - local444.anInt2809);
						@Pc(492) double local492 = (double) (local27 - local444.anInt2816);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong74)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt2810 + local486 * (double) local447.anInt3155 + local492 * (double) local444.anInt2814) * 65535.0D / ((double) local447.anInt3161 * local513);
							if (!(local545 < (double) local447.anInt3158)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt3162 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt3156;
								} else if (local447.anInt3162 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt3156;
								}
								if (local447.anInt3159 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt3161;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt3161;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt3161;
									if (local447.anInt3157 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt505 = (int) ((double) super.anInt505 + local678 * (double) arg1);
										super.anInt506 = (int) ((double) super.anInt506 + local686 * (double) arg1);
										super.anInt504 = (int) ((double) super.anInt504 + local694 * (double) arg1);
									}
								} else if (local447.anInt3157 == 0) {
									local296 += ((double) local444.anInt2810 - local553) * (double) arg1;
									local300 += ((double) local447.anInt3155 - local553) * (double) arg1;
									local304 += ((double) local444.anInt2814 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt505 = (int) ((double) super.anInt505 + ((double) local444.anInt2810 - local553) * (double) arg1);
									super.anInt506 = (int) ((double) super.anInt506 + ((double) local447.anInt3155 - local553) * (double) arg1);
									super.anInt504 = (int) ((double) super.anInt504 + ((double) local444.anInt2814 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray163 != null) {
			for (local317 = 0; local317 < local35.anIntArray163.length; local317++) {
				@Pc(776) Class6_Sub5_Sub7 local776 = (Class6_Sub5_Sub7) Static275.aClass268_3.method6820((long) local35.anIntArray163[local317]);
				while (local776 != null) {
					@Pc(780) Class81 local780 = local776.aClass81_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt2808);
					@Pc(792) double local792 = (double) (local22 - local776.anInt2809);
					@Pc(798) double local798 = (double) (local27 - local776.anInt2816);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong74) {
						local776 = (Class6_Sub5_Sub7) Static275.aClass268_3.method6821();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt2810 + local792 * (double) local780.anInt3155 + local798 * (double) local776.anInt2814) * 65535.0D / ((double) local780.anInt3161 * local825);
						if (local857 < (double) local780.anInt3158) {
							local776 = (Class6_Sub5_Sub7) Static275.aClass268_3.method6821();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt3162 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt3156;
							} else if (local780.anInt3162 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt3156;
							}
							if (local780.anInt3159 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt3161;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt3161;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt3161;
								if (local780.anInt3157 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt505 = (int) ((double) super.anInt505 + local996 * (double) arg1);
									super.anInt506 = (int) ((double) super.anInt506 + local1004 * (double) arg1);
									super.anInt504 = (int) ((double) super.anInt504 + local1012 * (double) arg1);
								}
							} else if (local780.anInt3157 == 0) {
								local296 += ((double) local776.anInt2810 - local871) * (double) arg1;
								local300 += ((double) local780.anInt3155 - local871) * (double) arg1;
								local304 += ((double) local776.anInt2814 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt505 = (int) ((double) super.anInt505 + ((double) local776.anInt2810 - local871) * (double) arg1);
								super.anInt506 = (int) ((double) super.anInt506 + ((double) local780.anInt3155 - local871) * (double) arg1);
								super.anInt504 = (int) ((double) super.anInt504 + ((double) local776.anInt2814 - local871) * (double) arg1);
							}
							local776 = (Class6_Sub5_Sub7) Static275.aClass268_3.method6821();
						}
					}
				}
			}
		}
		if (local35.anIntArray165 != null) {
			if (local35.anIntArray164 == null) {
				local35.anIntArray164 = new int[local35.anIntArray165.length];
				for (local317 = 0; local317 < local35.anIntArray165.length; local317++) {
					Static45.method8619(local35.anIntArray165[local317]);
					local35.anIntArray164[local317] = ((Class6_Sub37) Static514.aClass380_39.method8747((long) local35.anIntArray165[local317])).anInt7833;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray164.length; local317++) {
				@Pc(1137) Class81 local1137 = Static574.aClass81Array1[local35.anIntArray164[local317]];
				if (local1137.anInt3157 == 0) {
					local296 += (double) (local1137.anInt3150 * arg1);
					local300 += (double) (local1137.anInt3155 * arg1);
					local304 += (double) (local1137.anInt3149 * arg1);
					local306 = true;
				} else {
					super.anInt505 += local1137.anInt3150 * arg1;
					super.anInt506 += local1137.anInt3155 * arg1;
					super.anInt504 += local1137.anInt3149 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort6 = (short) (int) local296;
					this.aShort3 = (short) (int) local300;
					this.aShort5 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt515 <<= 0x1;
			}
		}
		super.anInt505 = (int) ((long) super.anInt505 + ((long) this.aShort6 * (long) (this.anInt515 << 2) >> 23) * (long) arg1);
		super.anInt506 = (int) ((long) super.anInt506 + ((long) this.aShort3 * (long) (this.anInt515 << 2) >> 23) * (long) arg1);
		super.anInt504 = (int) ((long) super.anInt504 + ((long) this.aShort5 * (long) (this.anInt515 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	private void method481() {
		@Pc(4) int local4 = this.aClass9_Sub9_1.aClass9_Sub5_5.anInt6235;
		if (this.aClass9_Sub9_1.aClass9_Sub5_5.aClass9_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass9_Sub9_1.aClass9_Sub5_5.aClass9_Sub1_Sub1_Sub1Array1[local4].method484();
		}
		this.aClass9_Sub9_1.aClass9_Sub5_5.aClass9_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort8 = (short) this.aClass9_Sub9_1.aClass9_Sub5_5.anInt6235;
		this.aClass9_Sub9_1.aClass9_Sub5_5.anInt6235 = local4 + 1 & 0x1FFF;
		this.aClass9_Sub9_1.aClass234_10.method6097(this);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method482(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt505 >> Static606.anInt10280 + 12;
		@Pc(13) int local13 = super.anInt504 >> Static606.anInt10280 + 12;
		@Pc(18) int local18 = super.anInt506 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static623.anInt10485 || local13 < 0 || local13 >= Static142.anInt3372) {
			this.method484();
			return;
		}
		@Pc(40) Class9_Sub5 local40 = this.aClass9_Sub9_1.aClass9_Sub5_5;
		@Pc(44) Class108 local44 = this.aClass9_Sub9_1.aClass108_1;
		@Pc(46) Class245[] local46 = Static148.aClass245Array1;
		@Pc(49) int local49 = local40.anInt6238;
		@Pc(58) Class186 local58 = Static26.aClass186ArrayArrayArray1[local40.anInt6238][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte73;
		}
		@Pc(71) int local71 = local46[local49].method7583(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static618.anInt10427 - 1) {
			local86 = local46[local49 + 1].method7583(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static606.anInt10280);
		}
		if (local44.aBoolean293) {
			if (local44.anInt3723 == -1 && local18 > local71) {
				this.method484();
				return;
			}
			if (local44.anInt3723 >= 0 && local18 > local46[local44.anInt3723].method7583(local13, local6)) {
				this.method484();
				return;
			}
			if (local44.lb == -1 && local18 < local86) {
				this.method484();
				return;
			}
			if (local44.lb >= 0 && local18 < local46[local44.lb + 1].method7583(local13, local6)) {
				this.method484();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static618.anInt10427 - 1; local154 > 0 && local18 > local46[local154].method7583(local13, local6); local154--) {
		}
		if (local44.aBoolean296 && local154 == 0 && local18 > local46[0].method7583(local13, local6)) {
			this.method484();
		} else if (local154 == Static618.anInt10427 - 1 && local46[local154].method7583(local13, local6) - local18 > 0x8 << Static606.anInt10280) {
			this.method484();
		} else {
			local58 = Static26.aClass186ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static26.aClass186ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static26.aClass186ArrayArrayArray1[0][local6][local13] = new Class186(0);
				}
				@Pc(251) boolean local251 = Static26.aClass186ArrayArrayArray1[0][local6][local13].aClass186_1 != null;
				if (local154 == 3 && local251) {
					this.method484();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static26.aClass186ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static26.aClass186ArrayArrayArray1[local261][local6][local13] = new Class186(local261);
						if (local251) {
							local58.aByte73++;
						}
					}
				}
			}
			if (local44.aBoolean299) {
				@Pc(304) int local304 = super.anInt505 >> 12;
				local261 = super.anInt504 >> 12;
				@Pc(318) Class243 local318;
				if (local58.aClass9_Sub4_Sub5_1 != null) {
					local318 = local58.aClass9_Sub4_Sub5_1.method8409(arg0);
					if (local318 != null && local318.method6338(local304, local18, local261)) {
						this.method484();
						return;
					}
				}
				if (local58.aClass9_Sub4_Sub5_2 != null) {
					local318 = local58.aClass9_Sub4_Sub5_2.method8409(arg0);
					if (local318 != null && local318.method6338(local304, local18, local261)) {
						this.method484();
						return;
					}
				}
				if (local58.aClass9_Sub4_Sub3_1 != null) {
					local318 = local58.aClass9_Sub4_Sub3_1.method8409(arg0);
					if (local318 != null && local318.method6338(local304, local18, local261)) {
						this.method484();
						return;
					}
				}
				for (@Pc(375) Class168 local375 = local58.aClass168_3; local375 != null; local375 = local375.aClass168_2) {
					@Pc(382) Class243 local382 = local375.aClass9_Sub4_Sub2_1.method8409(arg0);
					if (local382 != null && local382.method6338(local304, local18, local261)) {
						this.method484();
						return;
					}
				}
			}
			local40.aClass257_1.aClass362_1.method8370(this);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!qba;IIIIIIIIIIIZZ)V")
	public void method483(@OriginalArg(0) Class9_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub9_1 = arg0;
		super.anInt505 = arg1 << 12;
		super.anInt506 = arg2 << 12;
		super.anInt504 = arg3 << 12;
		super.anInt507 = arg9;
		this.aShort4 = this.aShort7 = (short) arg8;
		super.anInt508 = arg10;
		super.anInt509 = arg11;
		super.aBoolean53 = arg13;
		this.aShort6 = (short) arg4;
		this.aShort3 = (short) arg5;
		this.aShort5 = (short) arg6;
		this.anInt515 = arg7;
		super.aByte2 = this.aClass9_Sub9_1.aClass103_2.aByte29;
		this.method481();
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	public void method484() {
		this.aClass9_Sub9_1.aClass9_Sub5_5.aClass9_Sub1_Sub1_Sub1Array1[this.aShort8] = null;
		Static348.aClass9_Sub1_Sub1_Sub1Array2[Static615.anInt10411] = this;
		Static615.anInt10411 = Static615.anInt10411 + 1 & 0x3FF;
		this.method8408();
		this.method4383();
	}
}

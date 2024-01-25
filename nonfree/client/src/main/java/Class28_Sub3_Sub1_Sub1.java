import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class28_Sub3_Sub1_Sub1 extends Class28_Sub3_Sub1 {

	@OriginalMember(owner = "client!jia", name = "A", descriptor = "I")
	private int anInt5588;

	@OriginalMember(owner = "client!jia", name = "H", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!jia", name = "y", descriptor = "Lclient!wt;")
	public Class28_Sub10 aClass28_Sub10_1;

	@OriginalMember(owner = "client!jia", name = "D", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!jia", name = "C", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!jia", name = "B", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!jia", name = "z", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!jia", name = "F", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!jia", name = "G", descriptor = "I")
	private int anInt5589;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!wt;IIIIIIIIIIIZZ)V")
	public Class28_Sub3_Sub1_Sub1(@OriginalArg(0) Class28_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub10_1 = arg0;
		super.anInt5581 = arg1 << 12;
		super.anInt5584 = arg2 << 12;
		super.anInt5579 = arg3 << 12;
		super.anInt5585 = arg9;
		this.aShort47 = this.aShort48 = (short) arg8;
		super.anInt5586 = arg10;
		super.anInt5580 = arg11;
		super.aBoolean481 = arg13;
		this.aShort46 = (short) arg4;
		this.aShort45 = (short) arg5;
		this.aShort49 = (short) arg6;
		this.anInt5589 = arg7;
		super.aByte85 = this.aClass28_Sub10_1.aClass313_2.aByte123;
		this.method4629();
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "()V")
	private void method4629() {
		@Pc(4) int local4 = this.aClass28_Sub10_1.aClass28_Sub5_8.anInt7057;
		if (this.aClass28_Sub10_1.aClass28_Sub5_8.aClass28_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass28_Sub10_1.aClass28_Sub5_8.aClass28_Sub3_Sub1_Sub1Array2[local4].method4632();
		}
		this.aClass28_Sub10_1.aClass28_Sub5_8.aClass28_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort50 = (short) this.aClass28_Sub10_1.aClass28_Sub5_8.anInt7057;
		this.aClass28_Sub10_1.aClass28_Sub5_8.anInt7057 = local4 + 1 & 0x1FFF;
		this.aClass28_Sub10_1.aClass156_10.method3774(this);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(JI)V")
	public void method4630(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort48 = (short) (this.aShort48 - arg1);
		if (this.aShort48 <= 0) {
			this.method4632();
			return;
		}
		@Pc(17) int local17 = super.anInt5581 >> 12;
		@Pc(22) int local22 = super.anInt5584 >> 12;
		@Pc(27) int local27 = super.anInt5579 >> 12;
		@Pc(31) Class28_Sub5 local31 = this.aClass28_Sub10_1.aClass28_Sub5_8;
		@Pc(35) Class361 local35 = this.aClass28_Sub10_1.aClass361_1;
		if (local35.anInt10117 != 0) {
			@Pc(65) int local65;
			if (this.aShort47 - this.aShort48 <= local35.anInt10136) {
				local65 = (super.anInt5585 >> 8 & 0xFF00) + (this.anInt5588 >> 16 & 0xFF) + local35.anInt10135 * arg1;
				@Pc(82) int local82 = (super.anInt5585 & 0xFF00) + (this.anInt5588 >> 8 & 0xFF) + local35.anInt10114 * arg1;
				@Pc(99) int local99 = ((super.anInt5585 & 0xFF) << 8) + (this.anInt5588 & 0xFF) + local35.anInt10159 * arg1;
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
				super.anInt5585 &= 0xFF000000;
				super.anInt5585 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5588 &= 0xFF000000;
				this.anInt5588 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort47 - this.aShort48 <= local35.anInt10158) {
				local65 = (super.anInt5585 >> 16 & 0xFF00) + (this.anInt5588 >> 24 & 0xFF) + local35.anInt10125 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5585 &= 0xFFFFFF;
				super.anInt5585 |= (local65 & 0xFF00) << 16;
				this.anInt5588 &= 0xFFFFFF;
				this.anInt5588 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt10160 != -1 && this.aShort47 - this.aShort48 <= local35.anInt10148) {
			this.anInt5589 += local35.anInt10111 * arg1;
		}
		if (local35.anInt10152 != -1 && this.aShort47 - this.aShort48 <= local35.anInt10120) {
			super.anInt5586 += local35.anInt10143 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort46;
		@Pc(300) double local300 = (double) this.aShort45;
		@Pc(304) double local304 = (double) this.aShort49;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt10149 == 1) {
			local317 = local17 - this.aClass28_Sub10_1.aClass83_1.anInt2284;
			local324 = local22 - this.aClass28_Sub10_1.aClass83_1.anInt2283;
			local331 = local27 - this.aClass28_Sub10_1.aClass83_1.anInt2268;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt10137 * local348 * arg1);
			this.anInt5589 = (int) ((long) this.anInt5589 - ((long) this.anInt5589 * local356 >> 18));
		} else if (local35.anInt10149 == 2) {
			local317 = local17 - this.aClass28_Sub10_1.aClass83_1.anInt2284;
			local324 = local22 - this.aClass28_Sub10_1.aClass83_1.anInt2283;
			local331 = local27 - this.aClass28_Sub10_1.aClass83_1.anInt2268;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt10137 * local348 * arg1);
			this.anInt5589 = (int) ((long) this.anInt5589 - ((long) this.anInt5589 * local356 >> 28));
		}
		if (local35.anIntArray554 != null) {
			@Pc(437) Class5 local437 = local31.aClass114_47.aClass5_84;
			for (@Pc(440) Class5 local440 = local437.aClass5_338; local440 != local437; local440 = local440.aClass5_338) {
				@Pc(444) Class5_Sub3_Sub13 local444 = (Class5_Sub3_Sub13) local440;
				@Pc(447) Class15 local447 = local444.aClass15_1;
				if (local447.anInt240 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray554.length; local455++) {
						if (local35.anIntArray554[local455] == local447.anInt239) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt7697);
						@Pc(486) double local486 = (double) (local22 - local444.anInt7689);
						@Pc(492) double local492 = (double) (local27 - local444.anInt7696);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong10)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt7690 + local486 * (double) local447.anInt243 + local492 * (double) local444.anInt7693) * 65535.0D / ((double) local447.anInt237 * local513);
							if (!(local545 < (double) local447.anInt242)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt244 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt236;
								} else if (local447.anInt244 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt236;
								}
								if (local447.anInt247 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt237;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt237;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt237;
									if (local447.anInt245 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt5581 = (int) ((double) super.anInt5581 + local678 * (double) arg1);
										super.anInt5584 = (int) ((double) super.anInt5584 + local686 * (double) arg1);
										super.anInt5579 = (int) ((double) super.anInt5579 + local694 * (double) arg1);
									}
								} else if (local447.anInt245 == 0) {
									local296 += ((double) local444.anInt7690 - local553) * (double) arg1;
									local300 += ((double) local447.anInt243 - local553) * (double) arg1;
									local304 += ((double) local444.anInt7693 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt5581 = (int) ((double) super.anInt5581 + ((double) local444.anInt7690 - local553) * (double) arg1);
									super.anInt5584 = (int) ((double) super.anInt5584 + ((double) local447.anInt243 - local553) * (double) arg1);
									super.anInt5579 = (int) ((double) super.anInt5579 + ((double) local444.anInt7693 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray557 != null) {
			for (local317 = 0; local317 < local35.anIntArray557.length; local317++) {
				@Pc(776) Class5_Sub3_Sub13 local776 = (Class5_Sub3_Sub13) Static541.aClass168_1.method4121((long) local35.anIntArray557[local317]);
				while (local776 != null) {
					@Pc(780) Class15 local780 = local776.aClass15_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt7697);
					@Pc(792) double local792 = (double) (local22 - local776.anInt7689);
					@Pc(798) double local798 = (double) (local27 - local776.anInt7696);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong10) {
						local776 = (Class5_Sub3_Sub13) Static541.aClass168_1.method4123();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt7690 + local792 * (double) local780.anInt243 + local798 * (double) local776.anInt7693) * 65535.0D / ((double) local780.anInt237 * local825);
						if (local857 < (double) local780.anInt242) {
							local776 = (Class5_Sub3_Sub13) Static541.aClass168_1.method4123();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt244 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt236;
							} else if (local780.anInt244 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt236;
							}
							if (local780.anInt247 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt237;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt237;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt237;
								if (local780.anInt245 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt5581 = (int) ((double) super.anInt5581 + local996 * (double) arg1);
									super.anInt5584 = (int) ((double) super.anInt5584 + local1004 * (double) arg1);
									super.anInt5579 = (int) ((double) super.anInt5579 + local1012 * (double) arg1);
								}
							} else if (local780.anInt245 == 0) {
								local296 += ((double) local776.anInt7690 - local871) * (double) arg1;
								local300 += ((double) local780.anInt243 - local871) * (double) arg1;
								local304 += ((double) local776.anInt7693 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt5581 = (int) ((double) super.anInt5581 + ((double) local776.anInt7690 - local871) * (double) arg1);
								super.anInt5584 = (int) ((double) super.anInt5584 + ((double) local780.anInt243 - local871) * (double) arg1);
								super.anInt5579 = (int) ((double) super.anInt5579 + ((double) local776.anInt7693 - local871) * (double) arg1);
							}
							local776 = (Class5_Sub3_Sub13) Static541.aClass168_1.method4123();
						}
					}
				}
			}
		}
		if (local35.anIntArray555 != null) {
			if (local35.anIntArray556 == null) {
				local35.anIntArray556 = new int[local35.anIntArray555.length];
				for (local317 = 0; local317 < local35.anIntArray555.length; local317++) {
					Static520.method7364(local35.anIntArray555[local317]);
					local35.anIntArray556[local317] = ((Class5_Sub47) Static637.aClass300_47.method7188((long) local35.anIntArray555[local317])).anInt8308;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray556.length; local317++) {
				@Pc(1137) Class15 local1137 = Static154.aClass15Array1[local35.anIntArray556[local317]];
				if (local1137.anInt245 == 0) {
					local296 += (double) (local1137.anInt241 * arg1);
					local300 += (double) (local1137.anInt243 * arg1);
					local304 += (double) (local1137.anInt248 * arg1);
					local306 = true;
				} else {
					super.anInt5581 += local1137.anInt241 * arg1;
					super.anInt5584 += local1137.anInt243 * arg1;
					super.anInt5579 += local1137.anInt248 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort46 = (short) (int) local296;
					this.aShort45 = (short) (int) local300;
					this.aShort49 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt5589 <<= 0x1;
			}
		}
		super.anInt5581 = (int) ((long) super.anInt5581 + ((long) this.aShort46 * (long) (this.anInt5589 << 2) >> 23) * (long) arg1);
		super.anInt5584 = (int) ((long) super.anInt5584 + ((long) this.aShort45 * (long) (this.anInt5589 << 2) >> 23) * (long) arg1);
		super.anInt5579 = (int) ((long) super.anInt5579 + ((long) this.aShort49 * (long) (this.anInt5589 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!wt;IIIIIIIIIIIZZ)V")
	public void method4631(@OriginalArg(0) Class28_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub10_1 = arg0;
		super.anInt5581 = arg1 << 12;
		super.anInt5584 = arg2 << 12;
		super.anInt5579 = arg3 << 12;
		super.anInt5585 = arg9;
		this.aShort47 = this.aShort48 = (short) arg8;
		super.anInt5586 = arg10;
		super.anInt5580 = arg11;
		super.aBoolean481 = arg13;
		this.aShort46 = (short) arg4;
		this.aShort45 = (short) arg5;
		this.aShort49 = (short) arg6;
		this.anInt5589 = arg7;
		super.aByte85 = this.aClass28_Sub10_1.aClass313_2.aByte123;
		this.method4629();
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "()V")
	public void method4632() {
		this.aClass28_Sub10_1.aClass28_Sub5_8.aClass28_Sub3_Sub1_Sub1Array2[this.aShort50] = null;
		Static133.aClass28_Sub3_Sub1_Sub1Array1[Static102.anInt2210] = this;
		Static102.anInt2210 = Static102.anInt2210 + 1 & 0x3FF;
		this.method9022();
		this.method7882();
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method4633(@OriginalArg(0) Class65 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5581 >> Static588.anInt9672 + 12;
		@Pc(13) int local13 = super.anInt5579 >> Static588.anInt9672 + 12;
		@Pc(18) int local18 = super.anInt5584 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static216.anInt4042 || local13 < 0 || local13 >= Static233.anInt4238) {
			this.method4632();
			return;
		}
		@Pc(40) Class28_Sub5 local40 = this.aClass28_Sub10_1.aClass28_Sub5_8;
		@Pc(44) Class361 local44 = this.aClass28_Sub10_1.aClass361_1;
		@Pc(46) Class109[] local46 = Static495.aClass109Array4;
		@Pc(49) int local49 = local40.anInt7060;
		@Pc(58) Class226 local58 = Static635.aClass226ArrayArrayArray3[local40.anInt7060][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte100;
		}
		@Pc(71) int local71 = local46[local49].method7695(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static219.anInt4088 - 1) {
			local86 = local46[local49 + 1].method7695(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static588.anInt9672);
		}
		if (local44.aBoolean863) {
			if (local44.anInt10121 == -1 && local18 > local71) {
				this.method4632();
				return;
			}
			if (local44.anInt10121 >= 0 && local18 > local46[local44.anInt10121].method7695(local13, local6)) {
				this.method4632();
				return;
			}
			if (local44.anInt10128 == -1 && local18 < local86) {
				this.method4632();
				return;
			}
			if (local44.anInt10128 >= 0 && local18 < local46[local44.anInt10128 + 1].method7695(local13, local6)) {
				this.method4632();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static219.anInt4088 - 1; local154 > 0 && local18 > local46[local154].method7695(local13, local6); local154--) {
		}
		if (local44.aBoolean865 && local154 == 0 && local18 > local46[0].method7695(local13, local6)) {
			this.method4632();
		} else if (local154 == Static219.anInt4088 - 1 && local46[local154].method7695(local13, local6) - local18 > 0x8 << Static588.anInt9672) {
			this.method4632();
		} else {
			local58 = Static635.aClass226ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static635.aClass226ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static635.aClass226ArrayArrayArray3[0][local6][local13] = new Class226(0);
				}
				@Pc(251) boolean local251 = Static635.aClass226ArrayArrayArray3[0][local6][local13].aClass226_1 != null;
				if (local154 == 3 && local251) {
					this.method4632();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static635.aClass226ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static635.aClass226ArrayArrayArray3[local261][local6][local13] = new Class226(local261);
						if (local251) {
							local58.aByte100++;
						}
					}
				}
			}
			if (local44.aBoolean860) {
				@Pc(304) int local304 = super.anInt5581 >> 12;
				local261 = super.anInt5579 >> 12;
				@Pc(318) Class160 local318;
				if (local58.aClass28_Sub1_Sub5_2 != null) {
					local318 = local58.aClass28_Sub1_Sub5_2.method8978(arg0);
					if (local318 != null && local318.method3850(local304, local261, local18)) {
						this.method4632();
						return;
					}
				}
				if (local58.aClass28_Sub1_Sub5_1 != null) {
					local318 = local58.aClass28_Sub1_Sub5_1.method8978(arg0);
					if (local318 != null && local318.method3850(local304, local261, local18)) {
						this.method4632();
						return;
					}
				}
				if (local58.aClass28_Sub1_Sub2_1 != null) {
					local318 = local58.aClass28_Sub1_Sub2_1.method8978(arg0);
					if (local318 != null && local318.method3850(local304, local261, local18)) {
						this.method4632();
						return;
					}
				}
				for (@Pc(375) Class41 local375 = local58.aClass41_3; local375 != null; local375 = local375.aClass41_2) {
					@Pc(382) Class160 local382 = local375.aClass28_Sub1_Sub4_1.method8978(arg0);
					if (local382 != null && local382.method3850(local304, local261, local18)) {
						this.method4632();
						return;
					}
				}
			}
			local40.aClass392_1.aClass307_1.method7417(this);
		}
	}
}

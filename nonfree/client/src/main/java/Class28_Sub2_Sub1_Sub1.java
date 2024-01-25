import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class28_Sub2_Sub1_Sub1 extends Class28_Sub2_Sub1 {

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	private int anInt4541;

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "Lclient!pl;")
	private Class28_Sub6 aClass28_Sub6_1;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!mk", name = "E", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
	private int anInt4542;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!pl;IIIIIIIIIIIZZ)V")
	public Class28_Sub2_Sub1_Sub1(@OriginalArg(0) Class28_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub6_1 = arg0;
		super.anInt4530 = arg1 << 12;
		super.anInt4535 = arg2 << 12;
		super.anInt4538 = arg3 << 12;
		super.anInt4532 = arg9;
		this.aShort66 = this.aShort68 = (short) arg8;
		super.anInt4540 = arg10;
		super.anInt4537 = arg11;
		super.aBoolean327 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort65 = (short) arg5;
		this.aShort69 = (short) arg6;
		this.anInt4542 = arg7;
		super.aByte65 = this.aClass28_Sub6_1.aClass191_2.aByte66;
		this.method3627();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	private void method3627() {
		@Pc(4) int local4 = this.aClass28_Sub6_1.aClass28_Sub1_6.anInt559;
		if (this.aClass28_Sub6_1.aClass28_Sub1_6.aClass28_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass28_Sub6_1.aClass28_Sub1_6.aClass28_Sub2_Sub1_Sub1Array1[local4].method3630();
		}
		this.aClass28_Sub6_1.aClass28_Sub1_6.aClass28_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort67 = (short) this.aClass28_Sub6_1.aClass28_Sub1_6.anInt559;
		this.aClass28_Sub6_1.aClass28_Sub1_6.anInt559 = local4 + 1 & 0x1FFF;
		this.aClass28_Sub6_1.aClass97_6.method2154(this);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!pl;IIIIIIIIIIIZZ)V")
	public void method3628(@OriginalArg(0) Class28_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub6_1 = arg0;
		super.anInt4530 = arg1 << 12;
		super.anInt4535 = arg2 << 12;
		super.anInt4538 = arg3 << 12;
		super.anInt4532 = arg9;
		this.aShort66 = this.aShort68 = (short) arg8;
		super.anInt4540 = arg10;
		super.anInt4537 = arg11;
		super.aBoolean327 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort65 = (short) arg5;
		this.aShort69 = (short) arg6;
		this.anInt4542 = arg7;
		super.aByte65 = this.aClass28_Sub6_1.aClass191_2.aByte66;
		this.method3627();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(JI)V")
	public void method3629(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort68 = (short) (this.aShort68 - arg1);
		if (this.aShort68 <= 0) {
			this.method3630();
			return;
		}
		@Pc(17) int local17 = super.anInt4530 >> 12;
		@Pc(22) int local22 = super.anInt4535 >> 12;
		@Pc(27) int local27 = super.anInt4538 >> 12;
		@Pc(31) Class28_Sub1 local31 = this.aClass28_Sub6_1.aClass28_Sub1_6;
		@Pc(35) Class153 local35 = this.aClass28_Sub6_1.aClass153_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3734 != 0) {
			if (this.aShort66 - this.aShort68 <= local35.anInt3735) {
				local65 = (super.anInt4532 >> 8 & 0xFF00) + (this.anInt4541 >> 16 & 0xFF) + local35.anInt3762 * arg1;
				local82 = (super.anInt4532 & 0xFF00) + (this.anInt4541 >> 8 & 0xFF) + local35.anInt3756 * arg1;
				local99 = ((super.anInt4532 & 0xFF) << 8) + (this.anInt4541 & 0xFF) + local35.anInt3751 * arg1;
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
				super.anInt4532 &= 0xFF000000;
				super.anInt4532 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4541 &= 0xFF000000;
				this.anInt4541 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort66 - this.aShort68 <= local35.anInt3761) {
				local65 = (super.anInt4532 >> 16 & 0xFF00) + (this.anInt4541 >> 24 & 0xFF) + local35.anInt3773 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4532 &= 0xFFFFFF;
				super.anInt4532 |= (local65 & 0xFF00) << 16;
				this.anInt4541 &= 0xFFFFFF;
				this.anInt4541 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3740 != -1 && this.aShort66 - this.aShort68 <= local35.anInt3747) {
			this.anInt4542 += local35.anInt3759 * arg1;
		}
		if (local35.anInt3771 != -1 && this.aShort66 - this.aShort68 <= local35.anInt3786) {
			super.anInt4540 += local35.anInt3736 * arg1;
		}
		local65 = this.aShort64;
		local82 = this.aShort65;
		local99 = this.aShort69;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3745 == 1) {
			local313 = local17 - this.aClass28_Sub6_1.anInt5688;
			local319 = local22 - this.aClass28_Sub6_1.anInt5661;
			local325 = local27 - this.aClass28_Sub6_1.anInt5677;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3775 * local340 * arg1;
			this.anInt4542 = (int) ((long) this.anInt4542 - ((long) this.anInt4542 * local348 >> 18));
		} else if (local35.anInt3745 == 2) {
			local313 = local17 - this.aClass28_Sub6_1.anInt5688;
			local319 = local22 - this.aClass28_Sub6_1.anInt5661;
			local325 = local27 - this.aClass28_Sub6_1.anInt5677;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3775 * local340 * arg1;
			this.anInt4542 = (int) ((long) this.anInt4542 - ((long) this.anInt4542 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.lb != null) {
			@Pc(426) Class2 local426 = local31.aClass181_2.aClass2_156;
			for (@Pc(429) Class2 local429 = local426.aClass2_268; local429 != local426; local429 = local429.aClass2_268) {
				@Pc(433) Class2_Sub1_Sub8 local433 = (Class2_Sub1_Sub8) local429;
				@Pc(436) Class3 local436 = local433.aClass3_1;
				if (local436.anInt37 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.lb.length; local444++) {
						if (local35.lb[local444] == local436.anInt38) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3660;
						@Pc(473) int local473 = local22 - local433.anInt3665;
						local478 = local27 - local433.anInt3661;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong10) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3670 + local473 * local436.anInt35 + local478 * local433.anInt3668) * 65535L / (long) (local436.anInt52 * local501);
							if (local529 >= (long) local436.anInt43) {
								local537 = 0;
								if (local436.anInt45 == 1) {
									local537 = (local501 >> 4) * local436.anInt40;
								} else if (local436.anInt45 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt40;
								}
								if (local436.anInt47 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt52;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt52;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt52;
									if (local436.anInt41 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4530 += local643 * arg1 >> 15;
										super.anInt4535 += local652 * arg1 >> 15;
										super.anInt4538 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt41 == 0) {
									local65 += (local433.anInt3670 - local537) * arg1;
									local82 += (local436.anInt35 - local537) * arg1;
									local99 += (local433.anInt3668 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4530 += (local433.anInt3670 - local537) * arg1;
									super.anInt4535 += (local436.anInt35 - local537) * arg1;
									super.anInt4538 += (local433.anInt3668 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray344 != null) {
			for (local313 = 0; local313 < local35.anIntArray344.length; local313++) {
				@Pc(743) Class2_Sub1_Sub8 local743 = (Class2_Sub1_Sub8) Static284.aClass52_1.method1099((long) local35.anIntArray344[local313]);
				while (local743 != null) {
					@Pc(747) Class3 local747 = local743.aClass3_1;
					local340 = local17 - local743.anInt3660;
					@Pc(757) int local757 = local22 - local743.anInt3665;
					local444 = local27 - local743.anInt3661;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong10) {
						local743 = (Class2_Sub1_Sub8) Static284.aClass52_1.method1098();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3670 + local757 * local747.anInt35 + local444 * local743.anInt3668) * 65535L / (long) (local747.anInt52 * local478);
						if (local491 < (long) local747.anInt43) {
							local743 = (Class2_Sub1_Sub8) Static284.aClass52_1.method1098();
						} else {
							local501 = 0;
							if (local747.anInt45 == 1) {
								local501 = (local478 >> 4) * local747.anInt40;
							} else if (local747.anInt45 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt40;
							}
							if (local747.anInt47 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt52;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt52;
								local537 = (local444 << 15) / local478 * local747.anInt52;
								if (local747.anInt41 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4530 += local939 * arg1 >> 15;
									super.anInt4535 += local948 * arg1 >> 15;
									super.anInt4538 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt41 == 0) {
								local65 += (local743.anInt3670 - local501) * arg1;
								local82 += (local747.anInt35 - local501) * arg1;
								local99 += (local743.anInt3668 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4530 += (local743.anInt3670 - local501) * arg1;
								super.anInt4535 += (local747.anInt35 - local501) * arg1;
								super.anInt4538 += (local743.anInt3668 - local501) * arg1;
							}
							local743 = (Class2_Sub1_Sub8) Static284.aClass52_1.method1098();
						}
					}
				}
			}
		}
		if (local35.anIntArray342 != null) {
			if (local35.anIntArray341 == null) {
				local35.anIntArray341 = new int[local35.anIntArray342.length];
				for (local313 = 0; local313 < local35.anIntArray342.length; local313++) {
					Static119.method1947(local35.anIntArray342[local313]);
					local35.anIntArray341[local313] = ((Class2_Sub5) Static285.aClass220_25.method5099((long) local35.anIntArray342[local313])).anInt603;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray341.length; local313++) {
				@Pc(1082) Class3 local1082 = Static275.aClass3Array1[local35.anIntArray341[local313]];
				if (local1082.anInt41 == 0) {
					local65 += local1082.anInt39 * arg1;
					local82 += local1082.anInt35 * arg1;
					local99 += local1082.anInt50 * arg1;
					local303 = true;
				} else {
					super.anInt4530 += local1082.anInt39 * arg1;
					super.anInt4535 += local1082.anInt35 * arg1;
					super.anInt4538 += local1082.anInt50 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort64 = (short) local65;
					this.aShort65 = (short) local82;
					this.aShort69 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4542 <<= 0x1;
			}
		}
		super.anInt4530 = (int) ((long) super.anInt4530 + ((long) this.aShort64 * (long) this.anInt4542 >> 23) * (long) arg1);
		super.anInt4535 = (int) ((long) super.anInt4535 + ((long) this.aShort65 * (long) this.anInt4542 >> 23) * (long) arg1);
		super.anInt4538 = (int) ((long) super.anInt4538 + ((long) this.aShort69 * (long) this.anInt4542 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "()V")
	private void method3630() {
		this.aClass28_Sub6_1.aClass28_Sub1_6.aClass28_Sub2_Sub1_Sub1Array1[this.aShort67] = null;
		Static407.aClass28_Sub2_Sub1_Sub1Array2[Static357.anInt6321] = this;
		Static357.anInt6321 = Static357.anInt6321 + 1 & 0x3FF;
		this.method5916();
		this.method4121();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(J)V")
	public void method3631(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt4530 >> Static146.anInt2674 + 12;
		@Pc(13) int local13 = super.anInt4538 >> Static146.anInt2674 + 12;
		@Pc(18) int local18 = super.anInt4535 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static212.anInt3636 || local13 < 0 || local13 >= Static104.anInt1675) {
			this.method3630();
			return;
		}
		@Pc(40) Class28_Sub1 local40 = this.aClass28_Sub6_1.aClass28_Sub1_6;
		@Pc(44) Class153 local44 = this.aClass28_Sub6_1.aClass153_1;
		@Pc(46) Class22[] local46 = Static241.aClass22Array3;
		@Pc(54) int local54 = local46[local40.anInt566].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt566 < Static180.anInt3181 - 1) {
			local70 = local46[local40.anInt566 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static146.anInt2674);
		}
		if (local44.aBoolean250) {
			if (local44.anInt3742 == -1 && local18 > local54) {
				this.method3630();
				return;
			}
			if (local44.anInt3742 >= 0 && local18 > local46[local44.anInt3742].ua(local6, local13)) {
				this.method3630();
				return;
			}
			if (local44.anInt3784 == -1 && local18 < local70) {
				this.method3630();
				return;
			}
			if (local44.anInt3784 >= 0 && local18 < local46[local44.anInt3784 + 1].ua(local6, local13)) {
				this.method3630();
				return;
			}
		}
		if (local6 >= local40.anInt565 && local6 <= local40.anInt564 && local13 >= local40.anInt563 && local13 <= local40.anInt562 && local18 <= local54 && local18 >= local70) {
			local40.aClass56_1.aClass96_1.method2138(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static180.anInt3181 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method3630();
		} else if (local158 == Static180.anInt3181 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static146.anInt2674) {
			this.method3630();
		} else {
			@Pc(211) Class36 local211 = Static175.aClass36ArrayArrayArray1[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static175.aClass36ArrayArrayArray1[0][local6][local13] = new Class36(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static175.aClass36ArrayArrayArray1[0][local6][local13].aClass36_1 != null;
				if (local158 == 3 && local243) {
					this.method3630();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static175.aClass36ArrayArrayArray1[local253][local6][local13] == null) {
						local211 = Static175.aClass36ArrayArrayArray1[local253][local6][local13] = new Class36(local253, local6, local13);
						if (local243) {
							local211.aByte2++;
						}
					}
				}
			}
			if (local211.aClass56_2 == null) {
				local211.aClass56_2 = new Class56();
				local211.aByte5 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte5 != (byte) (arg0 & 0xFFL)) {
				local211.aClass56_2.aClass96_1.method2139();
				local211.aClass56_2.aBoolean67 = false;
				local211.aByte5 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass56_2.aClass96_1.method2138(this);
		}
	}
}

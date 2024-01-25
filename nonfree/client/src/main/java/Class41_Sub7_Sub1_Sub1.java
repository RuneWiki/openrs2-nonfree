import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class41_Sub7_Sub1_Sub1 extends Class41_Sub7_Sub1 {

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
	private int anInt7562;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "Lclient!lu;")
	private Class41_Sub3 aClass41_Sub3_1;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
	private int anInt7563;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!lu;IIIIIIIIIIIZZ)V")
	public Class41_Sub7_Sub1_Sub1(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub3_1 = arg0;
		super.anInt7561 = arg1 << Static201.anInt6625;
		super.anInt7551 = arg2 << Static201.anInt6625;
		super.anInt7552 = arg3 << Static201.anInt6625;
		super.anInt7559 = arg9;
		this.aShort100 = this.aShort101 = (short) arg8;
		super.anInt7557 = arg10;
		super.anInt7560 = arg11;
		super.aBoolean500 = arg13;
		this.aShort103 = (short) arg4;
		this.aShort102 = (short) arg5;
		this.aShort104 = (short) arg6;
		this.anInt7563 = arg7;
		super.aByte107 = this.aClass41_Sub3_1.aClass56_2.aByte41;
		this.method5831();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!lu;IIIIIIIIIIIZZ)V")
	public void method5828(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub3_1 = arg0;
		super.anInt7561 = arg1 << Static201.anInt6625;
		super.anInt7551 = arg2 << Static201.anInt6625;
		super.anInt7552 = arg3 << Static201.anInt6625;
		super.anInt7559 = arg9;
		this.aShort100 = this.aShort101 = (short) arg8;
		super.anInt7557 = arg10;
		super.anInt7560 = arg11;
		super.aBoolean500 = arg13;
		this.aShort103 = (short) arg4;
		this.aShort102 = (short) arg5;
		this.aShort104 = (short) arg6;
		this.anInt7563 = arg7;
		super.aByte107 = this.aClass41_Sub3_1.aClass56_2.aByte41;
		this.method5831();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(J)V")
	public void method5829(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt7561 >> Static372.anInt7558 + 12;
		@Pc(13) int local13 = super.anInt7552 >> Static372.anInt7558 + 12;
		@Pc(18) int local18 = super.anInt7551 >> Static201.anInt6625;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static301.anInt5434 || local13 < 0 || local13 >= Static241.anInt4414) {
			this.method5832();
			return;
		}
		@Pc(40) Class41_Sub1 local40 = this.aClass41_Sub3_1.aClass41_Sub1_5;
		@Pc(44) Class130 local44 = this.aClass41_Sub3_1.aClass130_1;
		@Pc(46) Class146[] local46 = Static346.aClass146Array2;
		@Pc(54) int local54 = local46[local40.anInt4185].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt4185 < Static338.anInt5952 - 1) {
			local70 = local46[local40.anInt4185 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static372.anInt7558);
		}
		if (local44.aBoolean273) {
			if (local44.anInt3695 == -1 && local18 > local54) {
				this.method5832();
				return;
			}
			if (local44.anInt3695 >= 0 && local18 > local46[local44.anInt3695].I(local6, local13)) {
				this.method5832();
				return;
			}
			if (local44.anInt3659 == -1 && local18 < local70) {
				this.method5832();
				return;
			}
			if (local44.anInt3659 >= 0 && local18 < local46[local44.anInt3659 + 1].I(local6, local13)) {
				this.method5832();
				return;
			}
		}
		if (local6 >= local40.anInt4183 && local6 <= local40.anInt4186 && local13 >= local40.anInt4182 && local13 <= local40.anInt4187 && local18 <= local54 && local18 >= local70) {
			local40.aClass256_2.aClass91_1.method1940(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static338.anInt5952 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method5832();
		} else if (local158 == Static338.anInt5952 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static372.anInt7558) {
			this.method5832();
		} else {
			@Pc(211) Class53 local211 = Static40.aClass53ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static40.aClass53ArrayArrayArray2[0][local6][local13] = new Class53(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static40.aClass53ArrayArrayArray2[0][local6][local13].aClass53_1 != null;
				if (local158 == 3 && local243) {
					this.method5832();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static40.aClass53ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static40.aClass53ArrayArrayArray2[local253][local6][local13] = new Class53(local253, local6, local13);
						if (local243) {
							local211.aByte37++;
						}
					}
				}
			}
			if (local211.aClass256_1 == null) {
				local211.aClass256_1 = new Class256();
				local211.aByte39 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte39 != (byte) (arg0 & 0xFFL)) {
				local211.aClass256_1.aClass91_1.method1943();
				local211.aClass256_1.aBoolean479 = false;
				local211.aByte39 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass256_1.aClass91_1.method1940(this);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(JI)V")
	public void method5830(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort101 = (short) (this.aShort101 - arg1);
		if (this.aShort101 <= 0) {
			this.method5832();
			return;
		}
		@Pc(17) int local17 = super.anInt7561 >> Static201.anInt6625;
		@Pc(22) int local22 = super.anInt7551 >> Static201.anInt6625;
		@Pc(27) int local27 = super.anInt7552 >> Static201.anInt6625;
		@Pc(31) Class41_Sub1 local31 = this.aClass41_Sub3_1.aClass41_Sub1_5;
		@Pc(35) Class130 local35 = this.aClass41_Sub3_1.aClass130_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3696 != 0) {
			if (this.aShort100 - this.aShort101 <= local35.anInt3691) {
				local65 = (super.anInt7559 >> 8 & 0xFF00) + (this.anInt7562 >> 16 & 0xFF) + local35.anInt3653 * arg1;
				local82 = (super.anInt7559 & 0xFF00) + (this.anInt7562 >> 8 & 0xFF) + local35.anInt3651 * arg1;
				local99 = ((super.anInt7559 & 0xFF) << 8) + (this.anInt7562 & 0xFF) + local35.anInt3645 * arg1;
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
				super.anInt7559 &= 0xFF000000;
				super.anInt7559 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7562 &= 0xFF000000;
				this.anInt7562 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort100 - this.aShort101 <= local35.anInt3693) {
				local65 = (super.anInt7559 >> 16 & 0xFF00) + (this.anInt7562 >> 24 & 0xFF) + local35.anInt3681 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7559 &= 0xFFFFFF;
				super.anInt7559 |= (local65 & 0xFF00) << 16;
				this.anInt7562 &= 0xFFFFFF;
				this.anInt7562 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3687 != -1 && this.aShort100 - this.aShort101 <= local35.anInt3672) {
			this.anInt7563 += local35.anInt3671 * arg1;
		}
		if (local35.anInt3660 != -1 && this.aShort100 - this.aShort101 <= local35.anInt3649) {
			super.anInt7557 += local35.anInt3652 * arg1;
		}
		local65 = this.aShort103;
		local82 = this.aShort102;
		local99 = this.aShort104;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3689 == 1) {
			local313 = local17 - this.aClass41_Sub3_1.anInt4366;
			local319 = local22 - this.aClass41_Sub3_1.anInt4373;
			local325 = local27 - this.aClass41_Sub3_1.anInt4382;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3658 * local340 * arg1;
			this.anInt7563 = (int) ((long) this.anInt7563 - ((long) this.anInt7563 * local348 >> 18));
		} else if (local35.anInt3689 == 2) {
			local313 = local17 - this.aClass41_Sub3_1.anInt4366;
			local319 = local22 - this.aClass41_Sub3_1.anInt4373;
			local325 = local27 - this.aClass41_Sub3_1.anInt4382;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3658 * local340 * arg1;
			this.anInt7563 = (int) ((long) this.anInt7563 - ((long) this.anInt7563 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray304 != null) {
			@Pc(426) Class4 local426 = local31.aClass258_34.aClass4_240;
			for (@Pc(429) Class4 local429 = local426.aClass4_261; local429 != local426; local429 = local429.aClass4_261) {
				@Pc(433) Class4_Sub1_Sub6 local433 = (Class4_Sub1_Sub6) local429;
				@Pc(436) Class153 local436 = local433.aClass153_1;
				if (local436.anInt4405 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray304.length; local444++) {
						if (local35.anIntArray304[local444] == local436.anInt4412) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1563;
						@Pc(473) int local473 = local22 - local433.anInt1561;
						local478 = local27 - local433.anInt1562;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong117) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1567 + local473 * local436.anInt4409 + local478 * local433.anInt1564) * 65535L / (long) (local436.anInt4402 * local501);
							if (local529 >= (long) local436.anInt4401) {
								local537 = 0;
								if (local436.anInt4410 == 1) {
									local537 = (local501 >> 4) * local436.anInt4411;
								} else if (local436.anInt4410 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt4411;
								}
								if (local436.anInt4408 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt4402;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt4402;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt4402;
									if (local436.anInt4398 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt7561 += local643 * arg1 >> 15;
										super.anInt7551 += local652 * arg1 >> 15;
										super.anInt7552 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt4398 == 0) {
									local65 += (local433.anInt1567 - local537) * arg1;
									local82 += (local436.anInt4409 - local537) * arg1;
									local99 += (local433.anInt1564 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt7561 += (local433.anInt1567 - local537) * arg1;
									super.anInt7551 += (local436.anInt4409 - local537) * arg1;
									super.anInt7552 += (local433.anInt1564 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray300 != null) {
			for (local313 = 0; local313 < local35.anIntArray300.length; local313++) {
				@Pc(743) Class4_Sub1_Sub6 local743 = (Class4_Sub1_Sub6) Static386.aClass38_1.method1181((long) local35.anIntArray300[local313]);
				while (local743 != null) {
					@Pc(747) Class153 local747 = local743.aClass153_1;
					local340 = local17 - local743.anInt1563;
					@Pc(757) int local757 = local22 - local743.anInt1561;
					local444 = local27 - local743.anInt1562;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong117) {
						local743 = (Class4_Sub1_Sub6) Static386.aClass38_1.method1179();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1567 + local757 * local747.anInt4409 + local444 * local743.anInt1564) * 65535L / (long) (local747.anInt4402 * local478);
						if (local491 < (long) local747.anInt4401) {
							local743 = (Class4_Sub1_Sub6) Static386.aClass38_1.method1179();
						} else {
							local501 = 0;
							if (local747.anInt4410 == 1) {
								local501 = (local478 >> 4) * local747.anInt4411;
							} else if (local747.anInt4410 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt4411;
							}
							if (local747.anInt4408 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt4402;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt4402;
								local537 = (local444 << 15) / local478 * local747.anInt4402;
								if (local747.anInt4398 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt7561 += local939 * arg1 >> 15;
									super.anInt7551 += local948 * arg1 >> 15;
									super.anInt7552 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt4398 == 0) {
								local65 += (local743.anInt1567 - local501) * arg1;
								local82 += (local747.anInt4409 - local501) * arg1;
								local99 += (local743.anInt1564 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt7561 += (local743.anInt1567 - local501) * arg1;
								super.anInt7551 += (local747.anInt4409 - local501) * arg1;
								super.anInt7552 += (local743.anInt1564 - local501) * arg1;
							}
							local743 = (Class4_Sub1_Sub6) Static386.aClass38_1.method1179();
						}
					}
				}
			}
		}
		if (local35.anIntArray301 != null) {
			if (local35.anIntArray302 == null) {
				local35.anIntArray302 = new int[local35.anIntArray301.length];
				for (local313 = 0; local313 < local35.anIntArray301.length; local313++) {
					Static359.method5002(local35.anIntArray301[local313]);
					local35.anIntArray302[local313] = ((Class4_Sub15) Static98.aClass196_6.method4477((long) local35.anIntArray301[local313])).anInt2603;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray302.length; local313++) {
				@Pc(1082) Class153 local1082 = Static439.aClass153Array1[local35.anIntArray302[local313]];
				if (local1082.anInt4398 == 0) {
					local65 += local1082.anInt4403 * arg1;
					local82 += local1082.anInt4409 * arg1;
					local99 += local1082.anInt4413 * arg1;
					local303 = true;
				} else {
					super.anInt7561 += local1082.anInt4403 * arg1;
					super.anInt7551 += local1082.anInt4409 * arg1;
					super.anInt7552 += local1082.anInt4413 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort103 = (short) local65;
					this.aShort102 = (short) local82;
					this.aShort104 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt7563 <<= 0x1;
			}
		}
		super.anInt7561 = (int) ((long) super.anInt7561 + ((long) this.aShort103 * (long) this.anInt7563 >> 23) * (long) arg1);
		super.anInt7551 = (int) ((long) super.anInt7551 + ((long) this.aShort102 * (long) this.anInt7563 >> 23) * (long) arg1);
		super.anInt7552 = (int) ((long) super.anInt7552 + ((long) this.aShort104 * (long) this.anInt7563 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
	private void method5831() {
		@Pc(4) int local4 = this.aClass41_Sub3_1.aClass41_Sub1_5.anInt4180;
		if (this.aClass41_Sub3_1.aClass41_Sub1_5.aClass41_Sub7_Sub1_Sub1Array1[local4] != null) {
			this.aClass41_Sub3_1.aClass41_Sub1_5.aClass41_Sub7_Sub1_Sub1Array1[local4].method5832();
		}
		this.aClass41_Sub3_1.aClass41_Sub1_5.aClass41_Sub7_Sub1_Sub1Array1[local4] = this;
		this.aShort99 = (short) this.aClass41_Sub3_1.aClass41_Sub1_5.anInt4180;
		this.aClass41_Sub3_1.aClass41_Sub1_5.anInt4180 = local4 + 1 & 0x1FFF;
		this.aClass41_Sub3_1.aClass27_5.method725(this);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "()V")
	private void method5832() {
		this.aClass41_Sub3_1.aClass41_Sub1_5.aClass41_Sub7_Sub1_Sub1Array1[this.aShort99] = null;
		Static298.aClass41_Sub7_Sub1_Sub1Array2[Static136.anInt2639] = this;
		Static136.anInt2639 = Static136.anInt2639 + 1 & 0x3FF;
		this.method5818();
		this.method5821();
	}
}

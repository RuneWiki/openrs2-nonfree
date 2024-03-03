import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class12_Sub1_Sub1_Sub1 extends Class12_Sub1_Sub1 {

	@OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
	private int anInt4471;

	@OriginalMember(owner = "client!ns", name = "Z", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!ns", name = "W", descriptor = "Lclient!th;")
	private Class12_Sub8 aClass12_Sub8_1;

	@OriginalMember(owner = "client!ns", name = "X", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!ns", name = "Y", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!ns", name = "U", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
	private int anInt4470;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!th;IIIIIIIIIIIZZ)V", line = 571)
	public Class12_Sub1_Sub1_Sub1(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub8_1 = arg0;
		super.anInt4458 = arg1 << Class80.anInt2251;
		super.anInt4463 = arg2 << Class80.anInt2251;
		super.anInt4460 = arg3 << Class80.anInt2251;
		super.anInt4462 = arg9;
		this.aShort67 = this.aShort66 = (short) arg8;
		super.anInt4465 = arg10;
		super.anInt4467 = arg11;
		super.aBoolean307 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort63 = (short) arg5;
		this.aShort65 = (short) arg6;
		this.anInt4470 = arg7;
		super.aByte48 = this.aClass12_Sub8_1.aClass114_2.aByte26;
		this.method4218();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(J)V", line = 5)
	public void method4217(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt4458 >> 19;
		@Pc(9) int local9 = super.anInt4460 >> 19;
		@Pc(14) int local14 = super.anInt4463 >> Class80.anInt2251;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static68.anInt1682 || local9 < 0 || local9 >= Static196.anInt3769) {
			this.method4221();
			return;
		}
		@Pc(36) Class12_Sub5 local36 = this.aClass12_Sub8_1.aClass12_Sub5_6;
		@Pc(40) Class235 local40 = this.aClass12_Sub8_1.aClass235_1;
		@Pc(42) Class6[] local42 = Static340.aClass6Array4;
		@Pc(50) int local50 = local42[local36.anInt4670].method5720(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt4670 < Static86.anInt1912 - 1) {
			local66 = local42[local36.anInt4670 + 1].method5720(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean448) {
			if (local40.anInt6565 == -1 && local14 > local50) {
				this.method4221();
				return;
			}
			if (local40.anInt6565 >= 0 && local14 > local42[local40.anInt6565].method5720(local4, local9)) {
				this.method4221();
				return;
			}
			if (local40.anInt6575 == -1 && local14 < local66) {
				this.method4221();
				return;
			}
			if (local40.anInt6575 >= 0 && local14 < local42[local40.anInt6575 + 1].method5720(local4, local9)) {
				this.method4221();
				return;
			}
		}
		if (local4 >= local36.anInt4668 && local4 <= local36.anInt4667 && local9 >= local36.anInt4671 && local9 <= local36.anInt4666 && local14 <= local50 && local14 >= local66) {
			local36.aClass224_2.aClass191_1.method4892(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static86.anInt1912 - 1; local152 > 0 && local14 > local42[local152].method5720(local4, local9); local152--) {
		}
		if (local152 == 0 && local14 > local42[0].method5720(local4, local9)) {
			this.method4221();
		} else if (local152 == Static86.anInt1912 - 1 && local42[local152].method5720(local4, local9) - local14 > 1024) {
			this.method4221();
		} else {
			@Pc(203) Class67 local203 = Static307.aClass67ArrayArrayArray3[local152][local4][local9];
			if (local203 == null) {
				if (local152 == 0) {
					local203 = Static307.aClass67ArrayArrayArray3[0][local4][local9] = new Class67(0, local4, local9);
				}
				@Pc(235) boolean local235 = Static307.aClass67ArrayArrayArray3[0][local4][local9].aClass67_1 != null;
				if (local152 == 3 && local235) {
					this.method4221();
					return;
				}
				for (@Pc(245) int local245 = 1; local245 <= local152; local245++) {
					if (Static307.aClass67ArrayArrayArray3[local245][local4][local9] == null) {
						local203 = Static307.aClass67ArrayArrayArray3[local245][local4][local9] = new Class67(local245, local4, local9);
						if (local235) {
							local203.aByte7++;
						}
					}
				}
			}
			if (local203.aClass224_1 == null) {
				local203.aClass224_1 = new Class224();
				local203.aByte13 = (byte) (arg0 & 0xFFL);
			} else if (local203.aByte13 != (byte) (arg0 & 0xFFL)) {
				local203.aClass224_1.aClass191_1.method4893();
				local203.aClass224_1.aBoolean429 = false;
				local203.aByte13 = (byte) (arg0 & 0xFFL);
			}
			local203.aClass224_1.aClass191_1.method4892(this);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "()V", line = 136)
	private void method4218() {
		@Pc(4) int local4 = this.aClass12_Sub8_1.aClass12_Sub5_6.anInt4664;
		if (this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[local4].method4221();
		}
		this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort68 = (short) this.aClass12_Sub8_1.aClass12_Sub5_6.anInt4664;
		this.aClass12_Sub8_1.aClass12_Sub5_6.anInt4664 = local4 + 1 & 0x1FFF;
		this.aClass12_Sub8_1.aClass36_8.method1420(this);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!th;IIIIIIIIIIIZZ)V", line = 147)
	public void method4219(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub8_1 = arg0;
		super.anInt4458 = arg1 << Class80.anInt2251;
		super.anInt4463 = arg2 << Class80.anInt2251;
		super.anInt4460 = arg3 << Class80.anInt2251;
		super.anInt4462 = arg9;
		this.aShort67 = this.aShort66 = (short) arg8;
		super.anInt4465 = arg10;
		super.anInt4467 = arg11;
		super.aBoolean307 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort63 = (short) arg5;
		this.aShort65 = (short) arg6;
		this.anInt4470 = arg7;
		super.aByte48 = this.aClass12_Sub8_1.aClass114_2.aByte26;
		this.method4218();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(JI)V", line = 170)
	public void method4220(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort66 = (short) (this.aShort66 - arg1);
		if (this.aShort66 <= 0) {
			this.method4221();
			return;
		}
		@Pc(17) int local17 = super.anInt4458 >> Class80.anInt2251;
		@Pc(22) int local22 = super.anInt4463 >> Class80.anInt2251;
		@Pc(27) int local27 = super.anInt4460 >> Class80.anInt2251;
		@Pc(31) Class12_Sub5 local31 = this.aClass12_Sub8_1.aClass12_Sub5_6;
		@Pc(35) Class235 local35 = this.aClass12_Sub8_1.aClass235_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6567 != 0) {
			if (this.aShort67 - this.aShort66 <= local35.anInt6605) {
				local65 = (super.anInt4462 >> 8 & 0xFF00) + (this.anInt4471 >> 16 & 0xFF) + local35.anInt6577 * arg1;
				local82 = (super.anInt4462 & 0xFF00) + (this.anInt4471 >> 8 & 0xFF) + local35.anInt6559 * arg1;
				local99 = ((super.anInt4462 & 0xFF) << 8) + (this.anInt4471 & 0xFF) + local35.anInt6579 * arg1;
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
				super.anInt4462 &= 0xFF000000;
				super.anInt4462 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4471 &= 0xFF000000;
				this.anInt4471 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort67 - this.aShort66 <= local35.anInt6594) {
				local65 = (super.anInt4462 >> 16 & 0xFF00) + (this.anInt4471 >> 24 & 0xFF) + local35.anInt6572 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4462 &= 0xFFFFFF;
				super.anInt4462 |= (local65 & 0xFF00) << 16;
				this.anInt4471 &= 0xFFFFFF;
				this.anInt4471 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6584 != -1 && this.aShort67 - this.aShort66 <= local35.anInt6601) {
			this.anInt4470 += local35.anInt6560 * arg1;
		}
		if (local35.anInt6602 != -1 && this.aShort67 - this.aShort66 <= local35.anInt6591) {
			super.anInt4465 += local35.anInt6590 * arg1;
		}
		local65 = this.aShort64;
		local82 = this.aShort63;
		local99 = this.aShort65;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6583 == 1) {
			local313 = local17 - this.aClass12_Sub8_1.anInt6242;
			local319 = local22 - this.aClass12_Sub8_1.anInt6249;
			local325 = local27 - this.aClass12_Sub8_1.anInt6229;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6568 * local340 * arg1;
			this.anInt4470 = (int) ((long) this.anInt4470 - ((long) this.anInt4470 * local348 >> 18));
		} else if (local35.anInt6583 == 2) {
			local313 = local17 - this.aClass12_Sub8_1.anInt6242;
			local319 = local22 - this.aClass12_Sub8_1.anInt6249;
			local325 = local27 - this.aClass12_Sub8_1.anInt6229;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6568 * local340 * arg1;
			this.anInt4470 = (int) ((long) this.anInt4470 - ((long) this.anInt4470 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray456 != null) {
			@Pc(426) Class2 local426 = local31.aClass135_29.aClass2_130;
			for (@Pc(429) Class2 local429 = local426.aClass2_243; local429 != local426; local429 = local429.aClass2_243) {
				@Pc(433) Class2_Sub2_Sub5 local433 = (Class2_Sub2_Sub5) local429;
				@Pc(436) Class28 local436 = local433.aClass28_1;
				if (local436.anInt737 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray456.length; local444++) {
						if (local35.anIntArray456[local444] == local436.anInt749) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1393;
						@Pc(473) int local473 = local22 - local433.anInt1388;
						local478 = local27 - local433.anInt1394;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong23) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1387 + local473 * local436.anInt748 + local478 * local433.anInt1389) * 65535L / (long) (local436.anInt740 * local501);
							if (local529 >= (long) local436.anInt738) {
								local537 = 0;
								if (local436.anInt753 == 1) {
									local537 = (local501 >> 4) * local436.anInt750;
								} else if (local436.anInt753 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt750;
								}
								if (local436.anInt746 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt740;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt740;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt740;
									if (local436.anInt743 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4458 += local643 * arg1 >> 15;
										super.anInt4463 += local652 * arg1 >> 15;
										super.anInt4460 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt743 == 0) {
									local65 += (local433.anInt1387 - local537) * arg1;
									local82 += (local436.anInt748 - local537) * arg1;
									local99 += (local433.anInt1389 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4458 += (local433.anInt1387 - local537) * arg1;
									super.anInt4463 += (local436.anInt748 - local537) * arg1;
									super.anInt4460 += (local433.anInt1389 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray459 != null) {
			for (local313 = 0; local313 < local35.anIntArray459.length; local313++) {
				@Pc(743) Class2_Sub2_Sub5 local743 = (Class2_Sub2_Sub5) Class2_Sub3_Sub15.aClass115_1.method2975((long) local35.anIntArray459[local313]);
				while (local743 != null) {
					@Pc(747) Class28 local747 = local743.aClass28_1;
					local340 = local17 - local743.anInt1393;
					@Pc(757) int local757 = local22 - local743.anInt1388;
					local444 = local27 - local743.anInt1394;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong23) {
						local743 = (Class2_Sub2_Sub5) Class2_Sub3_Sub15.aClass115_1.method2976();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1387 + local757 * local747.anInt748 + local444 * local743.anInt1389) * 65535L / (long) (local747.anInt740 * local478);
						if (local491 < (long) local747.anInt738) {
							local743 = (Class2_Sub2_Sub5) Class2_Sub3_Sub15.aClass115_1.method2976();
						} else {
							local501 = 0;
							if (local747.anInt753 == 1) {
								local501 = (local478 >> 4) * local747.anInt750;
							} else if (local747.anInt753 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt750;
							}
							if (local747.anInt746 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt740;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt740;
								local537 = (local444 << 15) / local478 * local747.anInt740;
								if (local747.anInt743 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4458 += local939 * arg1 >> 15;
									super.anInt4463 += local948 * arg1 >> 15;
									super.anInt4460 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt743 == 0) {
								local65 += (local743.anInt1387 - local501) * arg1;
								local82 += (local747.anInt748 - local501) * arg1;
								local99 += (local743.anInt1389 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4458 += (local743.anInt1387 - local501) * arg1;
								super.anInt4463 += (local747.anInt748 - local501) * arg1;
								super.anInt4460 += (local743.anInt1389 - local501) * arg1;
							}
							local743 = (Class2_Sub2_Sub5) Class2_Sub3_Sub15.aClass115_1.method2976();
						}
					}
				}
			}
		}
		if (local35.anIntArray458 != null) {
			if (local35.anIntArray455 == null) {
				local35.anIntArray455 = new int[local35.anIntArray458.length];
				for (local313 = 0; local313 < local35.anIntArray458.length; local313++) {
					Static291.method5368(local35.anIntArray458[local313]);
					local35.anIntArray455[local313] = ((Class2_Sub39) Class2.aClass4_151.method90((long) local35.anIntArray458[local313])).anInt6805;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray455.length; local313++) {
				@Pc(1082) Class28 local1082 = Class2_Sub3_Sub26.aClass28Array1[local35.anIntArray455[local313]];
				if (local1082.anInt743 == 0) {
					local65 += local1082.anInt754 * arg1;
					local82 += local1082.anInt748 * arg1;
					local99 += local1082.anInt741 * arg1;
					local303 = true;
				} else {
					super.anInt4458 += local1082.anInt754 * arg1;
					super.anInt4463 += local1082.anInt748 * arg1;
					super.anInt4460 += local1082.anInt741 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort64 = (short) local65;
					this.aShort63 = (short) local82;
					this.aShort65 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4470 <<= 0x1;
			}
		}
		super.anInt4458 = (int) ((long) super.anInt4458 + ((long) this.aShort64 * (long) this.anInt4470 >> 23) * (long) arg1);
		super.anInt4463 = (int) ((long) super.anInt4463 + ((long) this.aShort63 * (long) this.anInt4470 >> 23) * (long) arg1);
		super.anInt4460 = (int) ((long) super.anInt4460 + ((long) this.aShort65 * (long) this.anInt4470 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "()V", line = 564)
	private void method4221() {
		this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[this.aShort68] = null;
		Static91.aClass12_Sub1_Sub1_Sub1Array1[Class61.anInt1833] = this;
		Class61.anInt1833 = Class61.anInt1833 + 1 & 0x3FF;
		this.method5685();
		this.method4207();
	}
}

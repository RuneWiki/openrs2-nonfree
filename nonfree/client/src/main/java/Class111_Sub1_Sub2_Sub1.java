import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class111_Sub1_Sub2_Sub1 extends Class111_Sub1_Sub2 {

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
	private int anInt6568;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "Lclient!tq;")
	private Class111_Sub7 aClass111_Sub7_1;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	private int anInt6567;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!tq;IIIIIIIIIIIZZ)V")
	public Class111_Sub1_Sub2_Sub1(@OriginalArg(0) Class111_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass111_Sub7_1 = arg0;
		super.anInt6560 = arg1 << 12;
		super.anInt6566 = arg2 << 12;
		super.anInt6565 = arg3 << 12;
		super.anInt6561 = arg9;
		this.aShort108 = this.aShort107 = (short) arg8;
		super.anInt6563 = arg10;
		super.anInt6562 = arg11;
		super.aBoolean573 = arg13;
		this.aShort105 = (short) arg4;
		this.aShort104 = (short) arg5;
		this.aShort106 = (short) arg6;
		this.anInt6567 = arg7;
		super.aByte92 = this.aClass111_Sub7_1.aClass40_2.aByte19;
		this.method5268();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
	private void method5264() {
		this.aClass111_Sub7_1.aClass111_Sub4_5.aClass111_Sub1_Sub2_Sub1Array2[this.aShort109] = null;
		Static65.aClass111_Sub1_Sub2_Sub1Array1[Static388.anInt6814] = this;
		Static388.anInt6814 = Static388.anInt6814 + 1 & 0x3FF;
		this.method5886();
		this.method5261();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)V")
	public void method5265(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort107 = (short) (this.aShort107 - arg1);
		if (this.aShort107 <= 0) {
			this.method5264();
			return;
		}
		@Pc(17) int local17 = super.anInt6560 >> 12;
		@Pc(22) int local22 = super.anInt6566 >> 12;
		@Pc(27) int local27 = super.anInt6565 >> 12;
		@Pc(31) Class111_Sub4 local31 = this.aClass111_Sub7_1.aClass111_Sub4_5;
		@Pc(35) Class250 local35 = this.aClass111_Sub7_1.aClass250_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6615 != 0) {
			if (this.aShort108 - this.aShort107 <= local35.anInt6617) {
				local65 = (super.anInt6561 >> 8 & 0xFF00) + (this.anInt6568 >> 16 & 0xFF) + local35.anInt6579 * arg1;
				local82 = (super.anInt6561 & 0xFF00) + (this.anInt6568 >> 8 & 0xFF) + local35.anInt6596 * arg1;
				local99 = ((super.anInt6561 & 0xFF) << 8) + (this.anInt6568 & 0xFF) + local35.anInt6601 * arg1;
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
				super.anInt6561 &= 0xFF000000;
				super.anInt6561 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6568 &= 0xFF000000;
				this.anInt6568 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort108 - this.aShort107 <= local35.anInt6605) {
				local65 = (super.anInt6561 >> 16 & 0xFF00) + (this.anInt6568 >> 24 & 0xFF) + local35.anInt6585 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6561 &= 0xFFFFFF;
				super.anInt6561 |= (local65 & 0xFF00) << 16;
				this.anInt6568 &= 0xFFFFFF;
				this.anInt6568 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6571 != -1 && this.aShort108 - this.aShort107 <= local35.anInt6612) {
			this.anInt6567 += local35.anInt6577 * arg1;
		}
		if (local35.anInt6603 != -1 && this.aShort108 - this.aShort107 <= local35.anInt6614) {
			super.anInt6563 += local35.anInt6600 * arg1;
		}
		local65 = this.aShort105;
		local82 = this.aShort104;
		local99 = this.aShort106;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6611 == 1) {
			local313 = local17 - this.aClass111_Sub7_1.anInt6419;
			local319 = local22 - this.aClass111_Sub7_1.anInt6420;
			local325 = local27 - this.aClass111_Sub7_1.anInt6412;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6589 * local340 * arg1;
			this.anInt6567 = (int) ((long) this.anInt6567 - ((long) this.anInt6567 * local348 >> 18));
		} else if (local35.anInt6611 == 2) {
			local313 = local17 - this.aClass111_Sub7_1.anInt6419;
			local319 = local22 - this.aClass111_Sub7_1.anInt6420;
			local325 = local27 - this.aClass111_Sub7_1.anInt6412;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6589 * local340 * arg1;
			this.anInt6567 = (int) ((long) this.anInt6567 - ((long) this.anInt6567 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray474 != null) {
			@Pc(426) Class1 local426 = local31.aClass14_25.aClass1_5;
			for (@Pc(429) Class1 local429 = local426.aClass1_267; local429 != local426; local429 = local429.aClass1_267) {
				@Pc(433) Class1_Sub3_Sub2 local433 = (Class1_Sub3_Sub2) local429;
				@Pc(436) Class140 local436 = local433.aClass140_1;
				if (local436.anInt3962 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray474.length; local444++) {
						if (local35.anIntArray474[local444] == local436.anInt3960) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt738;
						@Pc(473) int local473 = local22 - local433.anInt741;
						local478 = local27 - local433.anInt734;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong125) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt735 + local473 * local436.anInt3953 + local478 * local433.anInt736) * 65535L / (long) (local436.anInt3950 * local501);
							if (local529 >= (long) local436.anInt3957) {
								local537 = 0;
								if (local436.anInt3963 == 1) {
									local537 = (local501 >> 4) * local436.anInt3959;
								} else if (local436.anInt3963 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3959;
								}
								if (local436.anInt3958 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3950;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3950;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3950;
									if (local436.anInt3947 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6560 += local643 * arg1 >> 15;
										super.anInt6566 += local652 * arg1 >> 15;
										super.anInt6565 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3947 == 0) {
									local65 += (local433.anInt735 - local537) * arg1;
									local82 += (local436.anInt3953 - local537) * arg1;
									local99 += (local433.anInt736 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6560 += (local433.anInt735 - local537) * arg1;
									super.anInt6566 += (local436.anInt3953 - local537) * arg1;
									super.anInt6565 += (local433.anInt736 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray475 != null) {
			for (local313 = 0; local313 < local35.anIntArray475.length; local313++) {
				@Pc(743) Class1_Sub3_Sub2 local743 = (Class1_Sub3_Sub2) Static82.aClass28_1.method421((long) local35.anIntArray475[local313]);
				while (local743 != null) {
					@Pc(747) Class140 local747 = local743.aClass140_1;
					local340 = local17 - local743.anInt738;
					@Pc(757) int local757 = local22 - local743.anInt741;
					local444 = local27 - local743.anInt734;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong125) {
						local743 = (Class1_Sub3_Sub2) Static82.aClass28_1.method424();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt735 + local757 * local747.anInt3953 + local444 * local743.anInt736) * 65535L / (long) (local747.anInt3950 * local478);
						if (local491 < (long) local747.anInt3957) {
							local743 = (Class1_Sub3_Sub2) Static82.aClass28_1.method424();
						} else {
							local501 = 0;
							if (local747.anInt3963 == 1) {
								local501 = (local478 >> 4) * local747.anInt3959;
							} else if (local747.anInt3963 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3959;
							}
							if (local747.anInt3958 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3950;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3950;
								local537 = (local444 << 15) / local478 * local747.anInt3950;
								if (local747.anInt3947 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6560 += local939 * arg1 >> 15;
									super.anInt6566 += local948 * arg1 >> 15;
									super.anInt6565 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3947 == 0) {
								local65 += (local743.anInt735 - local501) * arg1;
								local82 += (local747.anInt3953 - local501) * arg1;
								local99 += (local743.anInt736 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6560 += (local743.anInt735 - local501) * arg1;
								super.anInt6566 += (local747.anInt3953 - local501) * arg1;
								super.anInt6565 += (local743.anInt736 - local501) * arg1;
							}
							local743 = (Class1_Sub3_Sub2) Static82.aClass28_1.method424();
						}
					}
				}
			}
		}
		if (local35.anIntArray473 != null) {
			if (local35.anIntArray476 == null) {
				local35.anIntArray476 = new int[local35.anIntArray473.length];
				for (local313 = 0; local313 < local35.anIntArray473.length; local313++) {
					Static383.method4925(local35.anIntArray473[local313]);
					local35.anIntArray476[local313] = ((Class1_Sub18) Static29.aClass208_2.method4405((long) local35.anIntArray473[local313])).anInt2354;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray476.length; local313++) {
				@Pc(1082) Class140 local1082 = Static396.aClass140Array1[local35.anIntArray476[local313]];
				if (local1082.anInt3947 == 0) {
					local65 += local1082.anInt3949 * arg1;
					local82 += local1082.anInt3953 * arg1;
					local99 += local1082.anInt3955 * arg1;
					local303 = true;
				} else {
					super.anInt6560 += local1082.anInt3949 * arg1;
					super.anInt6566 += local1082.anInt3953 * arg1;
					super.anInt6565 += local1082.anInt3955 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort105 = (short) local65;
					this.aShort104 = (short) local82;
					this.aShort106 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6567 <<= 0x1;
			}
		}
		super.anInt6560 = (int) ((long) super.anInt6560 + ((long) this.aShort105 * (long) this.anInt6567 >> 23) * (long) arg1);
		super.anInt6566 = (int) ((long) super.anInt6566 + ((long) this.aShort104 * (long) this.anInt6567 >> 23) * (long) arg1);
		super.anInt6565 = (int) ((long) super.anInt6565 + ((long) this.aShort106 * (long) this.anInt6567 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!tq;IIIIIIIIIIIZZ)V")
	public void method5266(@OriginalArg(0) Class111_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass111_Sub7_1 = arg0;
		super.anInt6560 = arg1 << 12;
		super.anInt6566 = arg2 << 12;
		super.anInt6565 = arg3 << 12;
		super.anInt6561 = arg9;
		this.aShort108 = this.aShort107 = (short) arg8;
		super.anInt6563 = arg10;
		super.anInt6562 = arg11;
		super.aBoolean573 = arg13;
		this.aShort105 = (short) arg4;
		this.aShort104 = (short) arg5;
		this.aShort106 = (short) arg6;
		this.anInt6567 = arg7;
		super.aByte92 = this.aClass111_Sub7_1.aClass40_2.aByte19;
		this.method5268();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(J)V")
	public void method5267(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt6560 >> Static41.anInt612 + 12;
		@Pc(13) int local13 = super.anInt6565 >> Static41.anInt612 + 12;
		@Pc(18) int local18 = super.anInt6566 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static174.anInt2873 || local13 < 0 || local13 >= Static325.anInt5351) {
			this.method5264();
			return;
		}
		@Pc(40) Class111_Sub4 local40 = this.aClass111_Sub7_1.aClass111_Sub4_5;
		@Pc(44) Class250 local44 = this.aClass111_Sub7_1.aClass250_1;
		@Pc(46) Class139[] local46 = Static452.aClass139Array3;
		@Pc(54) int local54 = local46[local40.anInt4311].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt4311 < Static112.anInt1710 - 1) {
			local70 = local46[local40.anInt4311 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static41.anInt612);
		}
		if (local44.aBoolean575) {
			if (local44.anInt6616 == -1 && local18 > local54) {
				this.method5264();
				return;
			}
			if (local44.anInt6616 >= 0 && local18 > local46[local44.anInt6616].ua(local6, local13)) {
				this.method5264();
				return;
			}
			if (local44.anInt6573 == -1 && local18 < local70) {
				this.method5264();
				return;
			}
			if (local44.anInt6573 >= 0 && local18 < local46[local44.anInt6573 + 1].ua(local6, local13)) {
				this.method5264();
				return;
			}
		}
		if (local6 >= local40.anInt4312 && local6 <= local40.anInt4310 && local13 >= local40.anInt4314 && local13 <= local40.anInt4313 && local18 <= local54 && local18 >= local70) {
			local40.aClass232_1.aClass15_1.method217(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static112.anInt1710 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method5264();
		} else if (local158 == Static112.anInt1710 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static41.anInt612) {
			this.method5264();
		} else {
			@Pc(211) Class216 local211 = Static259.aClass216ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static259.aClass216ArrayArrayArray3[0][local6][local13] = new Class216(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static259.aClass216ArrayArrayArray3[0][local6][local13].aClass216_1 != null;
				if (local158 == 3 && local243) {
					this.method5264();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static259.aClass216ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static259.aClass216ArrayArrayArray3[local253][local6][local13] = new Class216(local253, local6, local13);
						if (local243) {
							local211.aByte79++;
						}
					}
				}
			}
			if (local211.aClass232_2 == null) {
				local211.aClass232_2 = new Class232();
				local211.aByte78 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte78 != (byte) (arg0 & 0xFFL)) {
				local211.aClass232_2.aClass15_1.method219();
				local211.aClass232_2.aBoolean536 = false;
				local211.aByte78 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass232_2.aClass15_1.method217(this);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
	private void method5268() {
		@Pc(4) int local4 = this.aClass111_Sub7_1.aClass111_Sub4_5.anInt4308;
		if (this.aClass111_Sub7_1.aClass111_Sub4_5.aClass111_Sub1_Sub2_Sub1Array2[local4] != null) {
			this.aClass111_Sub7_1.aClass111_Sub4_5.aClass111_Sub1_Sub2_Sub1Array2[local4].method5264();
		}
		this.aClass111_Sub7_1.aClass111_Sub4_5.aClass111_Sub1_Sub2_Sub1Array2[local4] = this;
		this.aShort109 = (short) this.aClass111_Sub7_1.aClass111_Sub4_5.anInt4308;
		this.aClass111_Sub7_1.aClass111_Sub4_5.anInt4308 = local4 + 1 & 0x1FFF;
		this.aClass111_Sub7_1.aClass63_8.method1024(this);
	}
}

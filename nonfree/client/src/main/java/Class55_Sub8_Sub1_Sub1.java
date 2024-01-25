import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class55_Sub8_Sub1_Sub1 extends Class55_Sub8_Sub1 {

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
	private int anInt5018;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "Lclient!ob;")
	private Class55_Sub6 aClass55_Sub6_1;

	@OriginalMember(owner = "client!qg", name = "N", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!qg", name = "M", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
	private int anInt5017;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!ob;IIIIIIIIIIIZ)V")
	public Class55_Sub8_Sub1_Sub1(@OriginalArg(0) Class55_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass55_Sub6_1 = arg0;
		super.anInt5005 = arg1 << Static110.anInt2450;
		super.anInt5013 = arg2 << Static110.anInt2450;
		super.anInt5014 = arg3 << Static110.anInt2450;
		super.anInt5006 = arg9;
		this.aShort77 = this.aShort75 = (short) arg8;
		super.anInt5011 = arg10;
		super.anInt5008 = arg11;
		this.aShort72 = (short) arg4;
		this.aShort73 = (short) arg5;
		this.aShort74 = (short) arg6;
		this.anInt5017 = arg7;
		super.aByte48 = this.aClass55_Sub6_1.aClass161_1.aByte49;
		this.method4612();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ob;IIIIIIIIIIIZ)V")
	public void method4608(@OriginalArg(0) Class55_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass55_Sub6_1 = arg0;
		super.anInt5005 = arg1 << Static110.anInt2450;
		super.anInt5013 = arg2 << Static110.anInt2450;
		super.anInt5014 = arg3 << Static110.anInt2450;
		super.anInt5006 = arg9;
		this.aShort77 = this.aShort75 = (short) arg8;
		super.anInt5011 = arg10;
		super.anInt5008 = arg11;
		this.aShort72 = (short) arg4;
		this.aShort73 = (short) arg5;
		this.aShort74 = (short) arg6;
		this.anInt5017 = arg7;
		super.aByte48 = this.aClass55_Sub6_1.aClass161_1.aByte49;
		this.method4612();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
	private void method4609() {
		this.aClass55_Sub6_1.aClass55_Sub7_5.aClass55_Sub8_Sub1_Sub1Array3[this.aShort76] = null;
		Static124.aClass55_Sub8_Sub1_Sub1Array2[Static7.anInt156] = this;
		Static7.anInt156 = Static7.anInt156 + 1 & 0x3FF;
		this.method4599();
		this.method4602();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(J)V")
	public void method4610(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt5005 >> 19;
		@Pc(9) int local9 = super.anInt5014 >> 19;
		@Pc(14) int local14 = super.anInt5013 >> Static110.anInt2450;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static223.anInt4280 || local9 < 0 || local9 >= Static160.anInt3244) {
			this.method4609();
			return;
		}
		@Pc(36) Class55_Sub7 local36 = this.aClass55_Sub6_1.aClass55_Sub7_5;
		@Pc(40) Class47 local40 = this.aClass55_Sub6_1.aClass47_1;
		@Pc(42) Class73[] local42 = Static301.aClass73Array31;
		@Pc(50) int local50 = local42[local36.anInt4408].method4931(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt4408 < 3) {
			local64 = local42[local36.anInt4408 + 1].method4931(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean131) {
			if (local40.anInt1383 == -1 && local14 > local50) {
				this.method4609();
				return;
			}
			if (local40.anInt1383 >= 0 && local14 > local42[local40.anInt1383].method4931(local4, local9)) {
				this.method4609();
				return;
			}
			if (local40.anInt1431 == -1 && local14 < local64) {
				this.method4609();
				return;
			}
			if (local40.anInt1431 >= 0 && local14 < local42[local40.anInt1431 + 1].method4931(local4, local9)) {
				this.method4609();
				return;
			}
		}
		if (local4 >= local36.anInt4406 && local4 <= local36.anInt4409 && local9 >= local36.anInt4407 && local9 <= local36.anInt4409 && local14 <= local50 && local14 >= local64) {
			local36.aClass75_2.aClass155_1.method4200(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method4931(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method4931(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method4931(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method4931(local4, local9) - 1024) {
			this.method4609();
			return;
		}
		@Pc(202) Class8 local202 = Static275.aClass8ArrayArrayArray4[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static275.aClass8ArrayArrayArray4[0][local4][local9].aClass8_1 != null;
			if (local148 == 3 && local217) {
				this.method4609();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static275.aClass8ArrayArrayArray4[local227][local4][local9] == null) {
					local202 = Static275.aClass8ArrayArrayArray4[local227][local4][local9] = new Class8(local227, local4, local9);
					if (local217) {
						local202.aByte7++;
					}
				}
			}
		}
		if (local202.aClass75_1 == null) {
			local202.aClass75_1 = new Class75();
			local202.aByte5 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte5 != (byte) (arg0 & 0xFFL)) {
			local202.aClass75_1 = new Class75();
			local202.aByte5 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass75_1.aClass155_1.method4200(this);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)V")
	public void method4611(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort75 = (short) (this.aShort75 - arg1);
		if (this.aShort75 <= 0) {
			this.method4609();
			return;
		}
		@Pc(17) int local17 = super.anInt5005 >> Static110.anInt2450;
		@Pc(22) int local22 = super.anInt5013 >> Static110.anInt2450;
		@Pc(27) int local27 = super.anInt5014 >> Static110.anInt2450;
		@Pc(31) Class55_Sub7 local31 = this.aClass55_Sub6_1.aClass55_Sub7_5;
		@Pc(35) Class47 local35 = this.aClass55_Sub6_1.aClass47_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1427 != 0) {
			if (this.aShort77 - this.aShort75 <= local35.anInt1397) {
				local65 = (super.anInt5006 >> 8 & 0xFF00) + (this.anInt5018 >> 16 & 0xFF) + local35.anInt1423 * arg1;
				local82 = (super.anInt5006 & 0xFF00) + (this.anInt5018 >> 8 & 0xFF) + local35.anInt1382 * arg1;
				local99 = ((super.anInt5006 & 0xFF) << 8) + (this.anInt5018 & 0xFF) + local35.anInt1426 * arg1;
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
				super.anInt5006 &= 0xFF000000;
				super.anInt5006 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5018 &= 0xFF000000;
				this.anInt5018 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort77 - this.aShort75 <= local35.anInt1378) {
				local65 = (super.anInt5006 >> 16 & 0xFF00) + (this.anInt5018 >> 24 & 0xFF) + local35.lb * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5006 &= 0xFFFFFF;
				super.anInt5006 |= (local65 & 0xFF00) << 16;
				this.anInt5018 &= 0xFFFFFF;
				this.anInt5018 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1416 != -1 && this.aShort77 - this.aShort75 <= local35.anInt1387) {
			this.anInt5017 += local35.anInt1398 * arg1;
		}
		if (local35.anInt1401 != -1 && this.aShort77 - this.aShort75 <= local35.anInt1372) {
			super.anInt5011 += local35.anInt1395 * arg1;
		}
		local65 = this.aShort72;
		local82 = this.aShort73;
		local99 = this.aShort74;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt1402 == 1) {
			local313 = local17 - this.aClass55_Sub6_1.anInt4318;
			local319 = local22 - this.aClass55_Sub6_1.anInt4299;
			local325 = local27 - this.aClass55_Sub6_1.anInt4302;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt1406 * local340 * arg1;
			this.anInt5017 = (int) ((long) this.anInt5017 - ((long) this.anInt5017 * local348 >> 18));
		} else if (local35.anInt1402 == 2) {
			local313 = local17 - this.aClass55_Sub6_1.anInt4318;
			local319 = local22 - this.aClass55_Sub6_1.anInt4299;
			local325 = local27 - this.aClass55_Sub6_1.anInt4302;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt1406 * local340 * arg1;
			this.anInt5017 = (int) ((long) this.anInt5017 - ((long) this.anInt5017 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray143 != null) {
			@Pc(426) Class2 local426 = local31.aClass216_37.aClass2_251;
			for (@Pc(429) Class2 local429 = local426.aClass2_250; local429 != local426; local429 = local429.aClass2_250) {
				@Pc(433) Class2_Sub11_Sub16 local433 = (Class2_Sub11_Sub16) local429;
				@Pc(436) Class32 local436 = local433.aClass32_1;
				if (local436.anInt782 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray143.length; local444++) {
						if (local35.anIntArray143[local444] == local436.anInt787) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt5500;
						@Pc(473) int local473 = local22 - local433.anInt5503;
						local478 = local27 - local433.anInt5501;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong21) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt5499 + local473 * local436.anInt775 + local478 * local433.anInt5510) * 65535L / (long) (local436.anInt774 * local501);
							if (local529 >= (long) local436.anInt779) {
								local537 = 0;
								if (local436.anInt777 == 1) {
									local537 = (local501 >> 4) * local436.anInt776;
								} else if (local436.anInt777 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt776;
								}
								if (local436.anInt785 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt774;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt774;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt774;
									if (local436.anInt772 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5005 += local643 * arg1 >> 15;
										super.anInt5013 += local652 * arg1 >> 15;
										super.anInt5014 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt772 == 0) {
									local65 += (local433.anInt5499 - local537) * arg1;
									local82 += (local436.anInt775 - local537) * arg1;
									local99 += (local433.anInt5510 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5005 += (local433.anInt5499 - local537) * arg1;
									super.anInt5013 += (local436.anInt775 - local537) * arg1;
									super.anInt5014 += (local433.anInt5510 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray145 != null) {
			for (local313 = 0; local313 < local35.anIntArray145.length; local313++) {
				@Pc(743) Class2_Sub11_Sub16 local743 = (Class2_Sub11_Sub16) Static30.aClass26_1.method799((long) local35.anIntArray145[local313]);
				while (local743 != null) {
					@Pc(747) Class32 local747 = local743.aClass32_1;
					local340 = local17 - local743.anInt5500;
					@Pc(757) int local757 = local22 - local743.anInt5503;
					local444 = local27 - local743.anInt5501;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong21) {
						local743 = (Class2_Sub11_Sub16) Static30.aClass26_1.method800();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt5499 + local757 * local747.anInt775 + local444 * local743.anInt5510) * 65535L / (long) (local747.anInt774 * local478);
						if (local491 < (long) local747.anInt779) {
							local743 = (Class2_Sub11_Sub16) Static30.aClass26_1.method800();
						} else {
							local501 = 0;
							if (local747.anInt777 == 1) {
								local501 = (local478 >> 4) * local747.anInt776;
							} else if (local747.anInt777 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt776;
							}
							if (local747.anInt785 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt774;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt774;
								local537 = (local444 << 15) / local478 * local747.anInt774;
								if (local747.anInt772 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5005 += local939 * arg1 >> 15;
									super.anInt5013 += local948 * arg1 >> 15;
									super.anInt5014 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt772 == 0) {
								local65 += (local743.anInt5499 - local501) * arg1;
								local82 += (local747.anInt775 - local501) * arg1;
								local99 += (local743.anInt5510 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5005 += (local743.anInt5499 - local501) * arg1;
								super.anInt5013 += (local747.anInt775 - local501) * arg1;
								super.anInt5014 += (local743.anInt5510 - local501) * arg1;
							}
							local743 = (Class2_Sub11_Sub16) Static30.aClass26_1.method800();
						}
					}
				}
			}
		}
		if (local35.anIntArray144 != null) {
			if (local35.anIntArray142 == null) {
				local35.anIntArray142 = new int[local35.anIntArray144.length];
				for (local313 = 0; local313 < local35.anIntArray144.length; local313++) {
					Static194.method3507(local35.anIntArray144[local313]);
					local35.anIntArray142[local313] = ((Class2_Sub42) Static219.aClass199_22.method5751((long) local35.anIntArray144[local313])).anInt6670;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray142.length; local313++) {
				@Pc(1082) Class32 local1082 = Static287.aClass32Array1[local35.anIntArray142[local313]];
				if (local1082.anInt772 == 0) {
					local65 += local1082.anInt783 * arg1;
					local82 += local1082.anInt775 * arg1;
					local99 += local1082.anInt781 * arg1;
					local303 = true;
				} else {
					super.anInt5005 += local1082.anInt783 * arg1;
					super.anInt5013 += local1082.anInt775 * arg1;
					super.anInt5014 += local1082.anInt781 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort72 = (short) local65;
					this.aShort73 = (short) local82;
					this.aShort74 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5017 <<= 0x1;
			}
		}
		super.anInt5005 = (int) ((long) super.anInt5005 + ((long) this.aShort72 * (long) this.anInt5017 >> 23) * (long) arg1);
		super.anInt5013 = (int) ((long) super.anInt5013 + ((long) this.aShort73 * (long) this.anInt5017 >> 23) * (long) arg1);
		super.anInt5014 = (int) ((long) super.anInt5014 + ((long) this.aShort74 * (long) this.anInt5017 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()V")
	private void method4612() {
		@Pc(4) int local4 = this.aClass55_Sub6_1.aClass55_Sub7_5.anInt4404;
		if (this.aClass55_Sub6_1.aClass55_Sub7_5.aClass55_Sub8_Sub1_Sub1Array3[local4] != null) {
			this.aClass55_Sub6_1.aClass55_Sub7_5.aClass55_Sub8_Sub1_Sub1Array3[local4].method4609();
		}
		this.aClass55_Sub6_1.aClass55_Sub7_5.aClass55_Sub8_Sub1_Sub1Array3[local4] = this;
		this.aShort76 = (short) this.aClass55_Sub6_1.aClass55_Sub7_5.anInt4404;
		this.aClass55_Sub6_1.aClass55_Sub7_5.anInt4404 = local4 + 1 & 0x1FFF;
		this.aClass55_Sub6_1.aClass67_5.method2100(this);
	}
}

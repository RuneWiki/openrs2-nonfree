import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class2_Sub4_Sub1_Sub1 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "Lclient!ab;")
	private Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
	private int anInt2555;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ab;IIIIIIIIIIIZZ)V")
	public Class2_Sub4_Sub1_Sub1(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass2_Sub1_1 = arg0;
		super.anInt2551 = arg1 << 12;
		super.anInt2549 = arg2 << 12;
		super.anInt2546 = arg3 << 12;
		super.anInt2550 = arg9;
		this.aShort40 = this.aShort39 = (short) arg8;
		super.anInt2553 = arg10;
		super.anInt2552 = arg11;
		super.aBoolean179 = arg13;
		this.aShort41 = (short) arg4;
		this.aShort36 = (short) arg5;
		this.aShort37 = (short) arg6;
		this.anInt2555 = arg7;
		super.aByte13 = this.aClass2_Sub1_1.aClass178_1.aByte61;
		this.method2407();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
	public void method2403() {
		this.aClass2_Sub1_1.aClass2_Sub3_1.aClass2_Sub4_Sub1_Sub1Array1[this.aShort38] = null;
		Static259.aClass2_Sub4_Sub1_Sub1Array2[Static47.anInt1423] = this;
		Static47.anInt1423 = Static47.anInt1423 + 1 & 0x3FF;
		this.method7890();
		this.method5684();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ab;IIIIIIIIIIIZZ)V")
	public void method2404(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass2_Sub1_1 = arg0;
		super.anInt2551 = arg1 << 12;
		super.anInt2549 = arg2 << 12;
		super.anInt2546 = arg3 << 12;
		super.anInt2550 = arg9;
		this.aShort40 = this.aShort39 = (short) arg8;
		super.anInt2553 = arg10;
		super.anInt2552 = arg11;
		super.aBoolean179 = arg13;
		this.aShort41 = (short) arg4;
		this.aShort36 = (short) arg5;
		this.aShort37 = (short) arg6;
		this.anInt2555 = arg7;
		super.aByte13 = this.aClass2_Sub1_1.aClass178_1.aByte61;
		this.method2407();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(JI)V")
	public void method2405(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort39 = (short) (this.aShort39 - arg1);
		if (this.aShort39 <= 0) {
			this.method2403();
			return;
		}
		@Pc(17) int local17 = super.anInt2551 >> 12;
		@Pc(22) int local22 = super.anInt2549 >> 12;
		@Pc(27) int local27 = super.anInt2546 >> 12;
		@Pc(31) Class2_Sub3 local31 = this.aClass2_Sub1_1.aClass2_Sub3_1;
		@Pc(35) Class107 local35 = this.aClass2_Sub1_1.aClass107_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3624 != 0) {
			if (this.aShort40 - this.aShort39 <= local35.anInt3636) {
				local65 = (super.anInt2550 >> 8 & 0xFF00) + (this.anInt2556 >> 16 & 0xFF) + local35.anInt3620 * arg1;
				local82 = (super.anInt2550 & 0xFF00) + (this.anInt2556 >> 8 & 0xFF) + local35.anInt3594 * arg1;
				local99 = ((super.anInt2550 & 0xFF) << 8) + (this.anInt2556 & 0xFF) + local35.anInt3621 * arg1;
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
				super.anInt2550 &= 0xFF000000;
				super.anInt2550 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2556 &= 0xFF000000;
				this.anInt2556 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort40 - this.aShort39 <= local35.anInt3587) {
				local65 = (super.anInt2550 >> 16 & 0xFF00) + (this.anInt2556 >> 24 & 0xFF) + local35.anInt3629 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2550 &= 0xFFFFFF;
				super.anInt2550 |= (local65 & 0xFF00) << 16;
				this.anInt2556 &= 0xFFFFFF;
				this.anInt2556 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3600 != -1 && this.aShort40 - this.aShort39 <= local35.anInt3603) {
			this.anInt2555 += local35.anInt3605 * arg1;
		}
		if (local35.anInt3599 != -1 && this.aShort40 - this.aShort39 <= local35.anInt3612) {
			super.anInt2553 += local35.anInt3630 * arg1;
		}
		local65 = this.aShort41;
		local82 = this.aShort36;
		local99 = this.aShort37;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3602 == 1) {
			local313 = local17 - this.aClass2_Sub1_1.anInt70;
			local319 = local22 - this.aClass2_Sub1_1.anInt91;
			local325 = local27 - this.aClass2_Sub1_1.anInt86;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3623 * local340 * arg1;
			this.anInt2555 = (int) ((long) this.anInt2555 - ((long) this.anInt2555 * local348 >> 18));
		} else if (local35.anInt3602 == 2) {
			local313 = local17 - this.aClass2_Sub1_1.anInt70;
			local319 = local22 - this.aClass2_Sub1_1.anInt91;
			local325 = local27 - this.aClass2_Sub1_1.anInt86;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3623 * local340 * arg1;
			this.anInt2555 = (int) ((long) this.anInt2555 - ((long) this.anInt2555 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray287 != null) {
			@Pc(426) Class1 local426 = local31.aClass38_19.aClass1_27;
			for (@Pc(429) Class1 local429 = local426.aClass1_283; local429 != local426; local429 = local429.aClass1_283) {
				@Pc(433) Class1_Sub1_Sub10 local433 = (Class1_Sub1_Sub10) local429;
				@Pc(436) Class302 local436 = local433.aClass302_1;
				if (local436.anInt8611 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray287.length; local444++) {
						if (local35.anIntArray287[local444] == local436.anInt8607) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3976;
						@Pc(473) int local473 = local22 - local433.anInt3979;
						local478 = local27 - local433.anInt3982;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong227) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3980 + local473 * local436.anInt8616 + local478 * local433.anInt3977) * 65535L / (long) (local436.anInt8618 * local501);
							if (local529 >= (long) local436.anInt8620) {
								local537 = 0;
								if (local436.anInt8622 == 1) {
									local537 = (local501 >> 4) * local436.anInt8614;
								} else if (local436.anInt8622 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt8614;
								}
								if (local436.anInt8612 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt8618;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt8618;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt8618;
									if (local436.anInt8617 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2551 += local643 * arg1 >> 15;
										super.anInt2549 += local652 * arg1 >> 15;
										super.anInt2546 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt8617 == 0) {
									local65 += (local433.anInt3980 - local537) * arg1;
									local82 += (local436.anInt8616 - local537) * arg1;
									local99 += (local433.anInt3977 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2551 += (local433.anInt3980 - local537) * arg1;
									super.anInt2549 += (local436.anInt8616 - local537) * arg1;
									super.anInt2546 += (local433.anInt3977 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray286 != null) {
			for (local313 = 0; local313 < local35.anIntArray286.length; local313++) {
				@Pc(743) Class1_Sub1_Sub10 local743 = (Class1_Sub1_Sub10) Static479.aClass252_1.method6158((long) local35.anIntArray286[local313]);
				while (local743 != null) {
					@Pc(747) Class302 local747 = local743.aClass302_1;
					local340 = local17 - local743.anInt3976;
					@Pc(757) int local757 = local22 - local743.anInt3979;
					local444 = local27 - local743.anInt3982;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong227) {
						local743 = (Class1_Sub1_Sub10) Static479.aClass252_1.method6161();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3980 + local757 * local747.anInt8616 + local444 * local743.anInt3977) * 65535L / (long) (local747.anInt8618 * local478);
						if (local491 < (long) local747.anInt8620) {
							local743 = (Class1_Sub1_Sub10) Static479.aClass252_1.method6161();
						} else {
							local501 = 0;
							if (local747.anInt8622 == 1) {
								local501 = (local478 >> 4) * local747.anInt8614;
							} else if (local747.anInt8622 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt8614;
							}
							if (local747.anInt8612 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt8618;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt8618;
								local537 = (local444 << 15) / local478 * local747.anInt8618;
								if (local747.anInt8617 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2551 += local939 * arg1 >> 15;
									super.anInt2549 += local948 * arg1 >> 15;
									super.anInt2546 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt8617 == 0) {
								local65 += (local743.anInt3980 - local501) * arg1;
								local82 += (local747.anInt8616 - local501) * arg1;
								local99 += (local743.anInt3977 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2551 += (local743.anInt3980 - local501) * arg1;
								super.anInt2549 += (local747.anInt8616 - local501) * arg1;
								super.anInt2546 += (local743.anInt3977 - local501) * arg1;
							}
							local743 = (Class1_Sub1_Sub10) Static479.aClass252_1.method6161();
						}
					}
				}
			}
		}
		if (local35.anIntArray285 != null) {
			if (local35.anIntArray284 == null) {
				local35.anIntArray284 = new int[local35.anIntArray285.length];
				for (local313 = 0; local313 < local35.anIntArray285.length; local313++) {
					Static153.method3116(local35.anIntArray285[local313]);
					local35.anIntArray284[local313] = ((Class1_Sub33) Static310.aClass174_22.method4422((long) local35.anIntArray285[local313])).anInt6397;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray284.length; local313++) {
				@Pc(1082) Class302 local1082 = Static491.aClass302Array1[local35.anIntArray284[local313]];
				if (local1082.anInt8617 == 0) {
					local65 += local1082.anInt8613 * arg1;
					local82 += local1082.anInt8616 * arg1;
					local99 += local1082.anInt8610 * arg1;
					local303 = true;
				} else {
					super.anInt2551 += local1082.anInt8613 * arg1;
					super.anInt2549 += local1082.anInt8616 * arg1;
					super.anInt2546 += local1082.anInt8610 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort41 = (short) local65;
					this.aShort36 = (short) local82;
					this.aShort37 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2555 <<= 0x1;
			}
		}
		super.anInt2551 = (int) ((long) super.anInt2551 + ((long) this.aShort41 * (long) this.anInt2555 >> 23) * (long) arg1);
		super.anInt2549 = (int) ((long) super.anInt2549 + ((long) this.aShort36 * (long) this.anInt2555 >> 23) * (long) arg1);
		super.anInt2546 = (int) ((long) super.anInt2546 + ((long) this.aShort37 * (long) this.anInt2555 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method2406(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2551 >> Static246.anInt4759 + 12;
		@Pc(13) int local13 = super.anInt2546 >> Static246.anInt4759 + 12;
		@Pc(18) int local18 = super.anInt2549 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static488.anInt8353 || local13 < 0 || local13 >= Static60.anInt1677) {
			this.method2403();
			return;
		}
		@Pc(40) Class2_Sub3 local40 = this.aClass2_Sub1_1.aClass2_Sub3_1;
		@Pc(44) Class107 local44 = this.aClass2_Sub1_1.aClass107_1;
		@Pc(46) Class10[] local46 = Static290.aClass10Array7;
		@Pc(49) int local49 = local40.anInt2198;
		@Pc(58) Class206 local58 = Static313.aClass206ArrayArrayArray2[local40.anInt2198][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte70;
		}
		@Pc(70) int local70 = local46[local49].ba(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static538.anInt9338 - 1) {
			local84 = local46[local49 + 1].ba(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static246.anInt4759);
		}
		if (local44.aBoolean223) {
			if (local44.anInt3618 == -1 && local18 > local70) {
				this.method2403();
				return;
			}
			if (local44.anInt3618 >= 0 && local18 > local46[local44.anInt3618].ba(local6, local13)) {
				this.method2403();
				return;
			}
			if (local44.anInt3595 == -1 && local18 < local84) {
				this.method2403();
				return;
			}
			if (local44.anInt3595 >= 0 && local18 < local46[local44.anInt3595 + 1].ba(local6, local13)) {
				this.method2403();
				return;
			}
		}
		if (local6 >= local40.anInt2197 && local6 <= local40.anInt2193 && local13 >= local40.anInt2195 && local13 <= local40.anInt2194 && local18 <= local70 && local18 >= local84) {
			local40.aClass249_1.aClass120_1.method3476(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static538.anInt9338 - 1; local172 > 0 && local18 > local46[local172].ba(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].ba(local6, local13)) {
			this.method2403();
		} else if (local172 == Static538.anInt9338 - 1 && local46[local172].ba(local6, local13) - local18 > 0x8 << Static246.anInt4759) {
			this.method2403();
		} else {
			local58 = Static313.aClass206ArrayArrayArray2[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static313.aClass206ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static313.aClass206ArrayArrayArray2[0][local6][local13] = new Class206(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static313.aClass206ArrayArrayArray2[0][local6][local13].aClass206_1 != null;
				if (local172 == 3 && local265) {
					this.method2403();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static313.aClass206ArrayArrayArray2[local275][local6][local13] == null) {
						local58 = Static313.aClass206ArrayArrayArray2[local275][local6][local13] = new Class206(local275, local6, local13);
						if (local265) {
							local58.aByte70++;
						}
					}
				}
			}
			if (local44.aBoolean224) {
				@Pc(320) int local320 = super.anInt2551 >> 12;
				local275 = super.anInt2546 >> 12;
				@Pc(334) Class231 local334;
				if (local58.aClass47_Sub4_2 != null) {
					local334 = local58.aClass47_Sub4_2.method7163(arg0);
					if (local334 != null && local334.method5705(local320, local275, local18)) {
						this.method2403();
						return;
					}
				}
				if (local58.aClass47_Sub4_1 != null) {
					local334 = local58.aClass47_Sub4_1.method7163(arg0);
					if (local334 != null && local334.method5705(local320, local275, local18)) {
						this.method2403();
						return;
					}
				}
				if (local58.aClass47_Sub3_1 != null) {
					local334 = local58.aClass47_Sub3_1.method7163(arg0);
					if (local334 != null && local334.method5705(local320, local275, local18)) {
						this.method2403();
						return;
					}
				}
				for (@Pc(391) Class168 local391 = local58.aClass168_2; local391 != null; local391 = local391.aClass168_1) {
					@Pc(398) Class231 local398 = local391.aClass47_Sub2_2.method7163(arg0);
					if (local398 != null && local398.method5705(local320, local275, local18)) {
						this.method2403();
						return;
					}
				}
			}
			if (local58.aClass249_2 == null) {
				local58.aClass249_2 = new Class249();
				local58.aByte74 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte74 != (byte) (arg1 & 0xFFL)) {
				local58.aClass249_2.aClass120_1.method3472();
				local58.aClass249_2.aBoolean474 = false;
				local58.aByte74 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass249_2.aClass120_1.method3476(this);
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()V")
	private void method2407() {
		@Pc(4) int local4 = this.aClass2_Sub1_1.aClass2_Sub3_1.anInt2191;
		if (this.aClass2_Sub1_1.aClass2_Sub3_1.aClass2_Sub4_Sub1_Sub1Array1[local4] != null) {
			this.aClass2_Sub1_1.aClass2_Sub3_1.aClass2_Sub4_Sub1_Sub1Array1[local4].method2403();
		}
		this.aClass2_Sub1_1.aClass2_Sub3_1.aClass2_Sub4_Sub1_Sub1Array1[local4] = this;
		this.aShort38 = (short) this.aClass2_Sub1_1.aClass2_Sub3_1.anInt2191;
		this.aClass2_Sub1_1.aClass2_Sub3_1.anInt2191 = local4 + 1 & 0x1FFF;
		this.aClass2_Sub1_1.aClass145_1.method3927(this);
	}
}

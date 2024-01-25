import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class15_Sub4_Sub1_Sub1 extends Class15_Sub4_Sub1 {

	@OriginalMember(owner = "client!mp", name = "P", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!mp", name = "S", descriptor = "I")
	private int anInt4032;

	@OriginalMember(owner = "client!mp", name = "J", descriptor = "Lclient!va;")
	private Class15_Sub8 aClass15_Sub8_1;

	@OriginalMember(owner = "client!mp", name = "O", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!mp", name = "N", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!mp", name = "L", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
	private int anInt4031;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!va;IIIIIIIIIIIZ)V")
	public Class15_Sub4_Sub1_Sub1(@OriginalArg(0) Class15_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass15_Sub8_1 = arg0;
		super.anInt4028 = arg1 << Static7.anInt162;
		super.anInt4024 = arg2 << Static7.anInt162;
		super.anInt4026 = arg3 << Static7.anInt162;
		super.anInt4030 = arg9;
		this.aShort41 = this.aShort42 = (short) arg8;
		super.anInt4023 = arg10;
		super.anInt4027 = arg11;
		this.aShort40 = (short) arg4;
		this.aShort44 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt4031 = arg7;
		super.aByte40 = this.aClass15_Sub8_1.aClass154_2.aByte47;
		this.method3724();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!va;IIIIIIIIIIIZ)V")
	public void method3720(@OriginalArg(0) Class15_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass15_Sub8_1 = arg0;
		super.anInt4028 = arg1 << Static7.anInt162;
		super.anInt4024 = arg2 << Static7.anInt162;
		super.anInt4026 = arg3 << Static7.anInt162;
		super.anInt4030 = arg9;
		this.aShort41 = this.aShort42 = (short) arg8;
		super.anInt4023 = arg10;
		super.anInt4027 = arg11;
		this.aShort40 = (short) arg4;
		this.aShort44 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt4031 = arg7;
		super.aByte40 = this.aClass15_Sub8_1.aClass154_2.aByte47;
		this.method3724();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()V")
	private void method3721() {
		this.aClass15_Sub8_1.aClass15_Sub5_7.aClass15_Sub4_Sub1_Sub1Array1[this.aShort43] = null;
		Static331.aClass15_Sub4_Sub1_Sub1Array2[Static290.anInt5616] = this;
		Static290.anInt5616 = Static290.anInt5616 + 1 & 0x3FF;
		this.method5441();
		this.method3711();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(J)V")
	public void method3722(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt4028 >> 19;
		@Pc(9) int local9 = super.anInt4026 >> 19;
		@Pc(14) int local14 = super.anInt4024 >> Static7.anInt162;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static222.anInt4391 || local9 < 0 || local9 >= Static74.anInt3404) {
			this.method3721();
			return;
		}
		@Pc(36) Class15_Sub5 local36 = this.aClass15_Sub8_1.aClass15_Sub5_7;
		@Pc(40) Class193 local40 = this.aClass15_Sub8_1.aClass193_1;
		@Pc(42) Class41[] local42 = Static7.aClass41Array1;
		@Pc(50) int local50 = local42[local36.anInt3030].method5434(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt3030 < 3) {
			local64 = local42[local36.anInt3030 + 1].method5434(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean492) {
			if (local40.anInt5613 == -1 && local14 > local50) {
				this.method3721();
				return;
			}
			if (local40.anInt5613 >= 0 && local14 > local42[local40.anInt5613].method5434(local4, local9)) {
				this.method3721();
				return;
			}
			if (local40.anInt5629 == -1 && local14 < local64) {
				this.method3721();
				return;
			}
			if (local40.anInt5629 >= 0 && local14 < local42[local40.anInt5629 + 1].method5434(local4, local9)) {
				this.method3721();
				return;
			}
		}
		if (local4 >= local36.anInt3029 && local4 <= local36.anInt3028 && local9 >= local36.anInt3026 && local9 <= local36.anInt3028 && local14 <= local50 && local14 >= local64) {
			local36.aClass162_1.aClass161_1.method4433(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method5434(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method5434(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method5434(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method5434(local4, local9) - 1024) {
			this.method3721();
			return;
		}
		@Pc(202) Class204 local202 = Static138.aClass204ArrayArrayArray1[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static138.aClass204ArrayArrayArray1[0][local4][local9].aClass204_1 != null;
			if (local148 == 3 && local217) {
				this.method3721();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static138.aClass204ArrayArrayArray1[local227][local4][local9] == null) {
					local202 = Static138.aClass204ArrayArrayArray1[local227][local4][local9] = new Class204(local227, local4, local9);
					if (local217) {
						local202.aByte64++;
					}
				}
			}
		}
		if (local202.aClass162_2 == null) {
			local202.aClass162_2 = new Class162();
			local202.aByte62 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte62 != (byte) (arg0 & 0xFFL)) {
			local202.aClass162_2 = new Class162();
			local202.aByte62 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass162_2.aClass161_1.method4433(this);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(JI)V")
	public void method3723(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort42 = (short) (this.aShort42 - arg1);
		if (this.aShort42 <= 0) {
			this.method3721();
			return;
		}
		@Pc(17) int local17 = super.anInt4028 >> Static7.anInt162;
		@Pc(22) int local22 = super.anInt4024 >> Static7.anInt162;
		@Pc(27) int local27 = super.anInt4026 >> Static7.anInt162;
		@Pc(31) Class15_Sub5 local31 = this.aClass15_Sub8_1.aClass15_Sub5_7;
		@Pc(35) Class193 local35 = this.aClass15_Sub8_1.aClass193_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5580 != 0) {
			if (this.aShort41 - this.aShort42 <= local35.anInt5606) {
				local65 = (super.anInt4030 >> 8 & 0xFF00) + (this.anInt4032 >> 16 & 0xFF) + local35.anInt5583 * arg1;
				local82 = (super.anInt4030 & 0xFF00) + (this.anInt4032 >> 8 & 0xFF) + local35.anInt5594 * arg1;
				local99 = ((super.anInt4030 & 0xFF) << 8) + (this.anInt4032 & 0xFF) + local35.anInt5618 * arg1;
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
				super.anInt4030 &= 0xFF000000;
				super.anInt4030 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4032 &= 0xFF000000;
				this.anInt4032 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort41 - this.aShort42 <= local35.anInt5627) {
				local65 = (super.anInt4030 >> 16 & 0xFF00) + (this.anInt4032 >> 24 & 0xFF) + local35.anInt5598 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4030 &= 0xFFFFFF;
				super.anInt4030 |= (local65 & 0xFF00) << 16;
				this.anInt4032 &= 0xFFFFFF;
				this.anInt4032 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5626 != -1 && this.aShort41 - this.aShort42 <= local35.anInt5609) {
			this.anInt4031 += local35.anInt5574 * arg1;
		}
		if (local35.anInt5585 != -1 && this.aShort41 - this.aShort42 <= local35.anInt5572) {
			super.anInt4023 += local35.anInt5610 * arg1;
		}
		local65 = this.aShort40;
		local82 = this.aShort44;
		local99 = this.aShort39;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5614 == 1) {
			local313 = local17 - this.aClass15_Sub8_1.anInt6226;
			local319 = local22 - this.aClass15_Sub8_1.anInt6235;
			local325 = local27 - this.aClass15_Sub8_1.anInt6233;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5595 * local340 * arg1;
			this.anInt4031 = (int) ((long) this.anInt4031 - ((long) this.anInt4031 * local348 >> 18));
		} else if (local35.anInt5614 == 2) {
			local313 = local17 - this.aClass15_Sub8_1.anInt6226;
			local319 = local22 - this.aClass15_Sub8_1.anInt6235;
			local325 = local27 - this.aClass15_Sub8_1.anInt6233;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5595 * local340 * arg1;
			this.anInt4031 = (int) ((long) this.anInt4031 - ((long) this.anInt4031 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray708 != null) {
			@Pc(426) Class1 local426 = local31.aClass195_34.aClass1_207;
			for (@Pc(429) Class1 local429 = local426.aClass1_247; local429 != local426; local429 = local429.aClass1_247) {
				@Pc(433) Class1_Sub1_Sub15 local433 = (Class1_Sub1_Sub15) local429;
				@Pc(436) Class183 local436 = local433.aClass183_1;
				if (local436.anInt5436 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray708.length; local444++) {
						if (local35.anIntArray708[local444] == local436.anInt5444) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4475;
						@Pc(473) int local473 = local22 - local433.anInt4477;
						local478 = local27 - local433.anInt4484;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong176) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4478 + local473 * local436.anInt5431 + local478 * local433.anInt4473) * 65535L / (long) (local436.anInt5435 * local501);
							if (local529 >= (long) local436.anInt5432) {
								local537 = 0;
								if (local436.anInt5446 == 1) {
									local537 = (local501 >> 4) * local436.anInt5428;
								} else if (local436.anInt5446 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt5428;
								}
								if (local436.anInt5437 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt5435;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt5435;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt5435;
									if (local436.anInt5442 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4028 += local643 * arg1 >> 15;
										super.anInt4024 += local652 * arg1 >> 15;
										super.anInt4026 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt5442 == 0) {
									local65 += (local433.anInt4478 - local537) * arg1;
									local82 += (local436.anInt5431 - local537) * arg1;
									local99 += (local433.anInt4473 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4028 += (local433.anInt4478 - local537) * arg1;
									super.anInt4024 += (local436.anInt5431 - local537) * arg1;
									super.anInt4026 += (local433.anInt4473 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray705 != null) {
			for (local313 = 0; local313 < local35.anIntArray705.length; local313++) {
				@Pc(743) Class1_Sub1_Sub15 local743 = (Class1_Sub1_Sub15) Static291.aClass148_1.method4108((long) local35.anIntArray705[local313]);
				while (local743 != null) {
					@Pc(747) Class183 local747 = local743.aClass183_1;
					local340 = local17 - local743.anInt4475;
					@Pc(757) int local757 = local22 - local743.anInt4477;
					local444 = local27 - local743.anInt4484;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong176) {
						local743 = (Class1_Sub1_Sub15) Static291.aClass148_1.method4112();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4478 + local757 * local747.anInt5431 + local444 * local743.anInt4473) * 65535L / (long) (local747.anInt5435 * local478);
						if (local491 < (long) local747.anInt5432) {
							local743 = (Class1_Sub1_Sub15) Static291.aClass148_1.method4112();
						} else {
							local501 = 0;
							if (local747.anInt5446 == 1) {
								local501 = (local478 >> 4) * local747.anInt5428;
							} else if (local747.anInt5446 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt5428;
							}
							if (local747.anInt5437 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt5435;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt5435;
								local537 = (local444 << 15) / local478 * local747.anInt5435;
								if (local747.anInt5442 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4028 += local939 * arg1 >> 15;
									super.anInt4024 += local948 * arg1 >> 15;
									super.anInt4026 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt5442 == 0) {
								local65 += (local743.anInt4478 - local501) * arg1;
								local82 += (local747.anInt5431 - local501) * arg1;
								local99 += (local743.anInt4473 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4028 += (local743.anInt4478 - local501) * arg1;
								super.anInt4024 += (local747.anInt5431 - local501) * arg1;
								super.anInt4026 += (local743.anInt4473 - local501) * arg1;
							}
							local743 = (Class1_Sub1_Sub15) Static291.aClass148_1.method4112();
						}
					}
				}
			}
		}
		if (local35.anIntArray706 != null) {
			if (local35.anIntArray707 == null) {
				local35.anIntArray707 = new int[local35.anIntArray706.length];
				for (local313 = 0; local313 < local35.anIntArray706.length; local313++) {
					Static125.method2401(local35.anIntArray706[local313]);
					local35.anIntArray707[local313] = ((Class1_Sub37) Static70.aClass26_7.method870((long) local35.anIntArray706[local313])).anInt6000;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray707.length; local313++) {
				@Pc(1082) Class183 local1082 = Static86.aClass183Array1[local35.anIntArray707[local313]];
				if (local1082.anInt5442 == 0) {
					local65 += local1082.anInt5443 * arg1;
					local82 += local1082.anInt5431 * arg1;
					local99 += local1082.anInt5438 * arg1;
					local303 = true;
				} else {
					super.anInt4028 += local1082.anInt5443 * arg1;
					super.anInt4024 += local1082.anInt5431 * arg1;
					super.anInt4026 += local1082.anInt5438 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort40 = (short) local65;
					this.aShort44 = (short) local82;
					this.aShort39 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4031 <<= 0x1;
			}
		}
		super.anInt4028 = (int) ((long) super.anInt4028 + ((long) this.aShort40 * (long) this.anInt4031 >> 23) * (long) arg1);
		super.anInt4024 = (int) ((long) super.anInt4024 + ((long) this.aShort44 * (long) this.anInt4031 >> 23) * (long) arg1);
		super.anInt4026 = (int) ((long) super.anInt4026 + ((long) this.aShort39 * (long) this.anInt4031 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "()V")
	private void method3724() {
		@Pc(4) int local4 = this.aClass15_Sub8_1.aClass15_Sub5_7.anInt3024;
		if (this.aClass15_Sub8_1.aClass15_Sub5_7.aClass15_Sub4_Sub1_Sub1Array1[local4] != null) {
			this.aClass15_Sub8_1.aClass15_Sub5_7.aClass15_Sub4_Sub1_Sub1Array1[local4].method3721();
		}
		this.aClass15_Sub8_1.aClass15_Sub5_7.aClass15_Sub4_Sub1_Sub1Array1[local4] = this;
		this.aShort43 = (short) this.aClass15_Sub8_1.aClass15_Sub5_7.anInt3024;
		this.aClass15_Sub8_1.aClass15_Sub5_7.anInt3024 = local4 + 1 & 0x1FFF;
		this.aClass15_Sub8_1.aClass175_7.method4672(this);
	}
}

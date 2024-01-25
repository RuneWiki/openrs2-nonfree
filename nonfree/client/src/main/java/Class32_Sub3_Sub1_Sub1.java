import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class32_Sub3_Sub1_Sub1 extends Class32_Sub3_Sub1 {

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
	private int anInt3765;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Lclient!fo;")
	private Class32_Sub2 aClass32_Sub2_1;

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
	private int anInt3766;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!fo;IIIIIIIIIIIZ)V")
	public Class32_Sub3_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass32_Sub2_1 = arg0;
		super.anInt3760 = arg1 << Static53.anInt983;
		super.anInt3755 = arg2 << Static53.anInt983;
		super.anInt3756 = arg3 << Static53.anInt983;
		super.anInt3761 = arg9;
		this.aShort40 = this.aShort44 = (short) arg8;
		super.anInt3759 = arg10;
		super.anInt3757 = arg11;
		this.aShort41 = (short) arg4;
		this.aShort42 = (short) arg5;
		this.aShort43 = (short) arg6;
		this.anInt3766 = arg7;
		super.aByte20 = this.aClass32_Sub2_1.aClass113_1.aByte18;
		this.method3399();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	private void method3398() {
		this.aClass32_Sub2_1.aClass32_Sub7_1.aClass32_Sub3_Sub1_Sub1Array1[this.aShort39] = null;
		Static331.aClass32_Sub3_Sub1_Sub1Array2[Static87.anInt1616] = this;
		Static87.anInt1616 = Static87.anInt1616 + 1 & 0x3FF;
		this.method5578();
		this.method3392();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	private void method3399() {
		@Pc(4) int local4 = this.aClass32_Sub2_1.aClass32_Sub7_1.anInt5607;
		if (this.aClass32_Sub2_1.aClass32_Sub7_1.aClass32_Sub3_Sub1_Sub1Array1[local4] != null) {
			this.aClass32_Sub2_1.aClass32_Sub7_1.aClass32_Sub3_Sub1_Sub1Array1[local4].method3398();
		}
		this.aClass32_Sub2_1.aClass32_Sub7_1.aClass32_Sub3_Sub1_Sub1Array1[local4] = this;
		this.aShort39 = (short) this.aClass32_Sub2_1.aClass32_Sub7_1.anInt5607;
		this.aClass32_Sub2_1.aClass32_Sub7_1.anInt5607 = local4 + 1 & 0x1FFF;
		this.aClass32_Sub2_1.aClass39_3.method809(this);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fo;IIIIIIIIIIIZ)V")
	public void method3400(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass32_Sub2_1 = arg0;
		super.anInt3760 = arg1 << Static53.anInt983;
		super.anInt3755 = arg2 << Static53.anInt983;
		super.anInt3756 = arg3 << Static53.anInt983;
		super.anInt3761 = arg9;
		this.aShort40 = this.aShort44 = (short) arg8;
		super.anInt3759 = arg10;
		super.anInt3757 = arg11;
		this.aShort41 = (short) arg4;
		this.aShort42 = (short) arg5;
		this.aShort43 = (short) arg6;
		this.anInt3766 = arg7;
		super.aByte20 = this.aClass32_Sub2_1.aClass113_1.aByte18;
		this.method3399();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(JI)V")
	public void method3401(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort44 = (short) (this.aShort44 - arg1);
		if (this.aShort44 <= 0) {
			this.method3398();
			return;
		}
		@Pc(17) int local17 = super.anInt3760 >> Static53.anInt983;
		@Pc(22) int local22 = super.anInt3755 >> Static53.anInt983;
		@Pc(27) int local27 = super.anInt3756 >> Static53.anInt983;
		@Pc(31) Class32_Sub7 local31 = this.aClass32_Sub2_1.aClass32_Sub7_1;
		@Pc(35) Class150 local35 = this.aClass32_Sub2_1.aClass150_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt4632 != 0) {
			if (this.aShort40 - this.aShort44 <= local35.anInt4629) {
				local65 = (super.anInt3761 >> 8 & 0xFF00) + (this.anInt3765 >> 16 & 0xFF) + local35.anInt4582 * arg1;
				local82 = (super.anInt3761 & 0xFF00) + (this.anInt3765 >> 8 & 0xFF) + local35.anInt4599 * arg1;
				local99 = ((super.anInt3761 & 0xFF) << 8) + (this.anInt3765 & 0xFF) + local35.anInt4589 * arg1;
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
				super.anInt3761 &= 0xFF000000;
				super.anInt3761 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt3765 &= 0xFF000000;
				this.anInt3765 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort40 - this.aShort44 <= local35.anInt4617) {
				local65 = (super.anInt3761 >> 16 & 0xFF00) + (this.anInt3765 >> 24 & 0xFF) + local35.anInt4621 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt3761 &= 0xFFFFFF;
				super.anInt3761 |= (local65 & 0xFF00) << 16;
				this.anInt3765 &= 0xFFFFFF;
				this.anInt3765 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4633 != -1 && this.aShort40 - this.aShort44 <= local35.anInt4626) {
			this.anInt3766 += local35.anInt4614 * arg1;
		}
		if (local35.anInt4596 != -1 && this.aShort40 - this.aShort44 <= local35.anInt4627) {
			super.anInt3759 += local35.anInt4584 * arg1;
		}
		local65 = this.aShort41;
		local82 = this.aShort42;
		local99 = this.aShort43;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt4579 == 1) {
			local313 = local17 - this.aClass32_Sub2_1.anInt1823;
			local319 = local22 - this.aClass32_Sub2_1.anInt1807;
			local325 = local27 - this.aClass32_Sub2_1.anInt1810;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt4630 * local340 * arg1;
			this.anInt3766 = (int) ((long) this.anInt3766 - ((long) this.anInt3766 * local348 >> 18));
		} else if (local35.anInt4579 == 2) {
			local313 = local17 - this.aClass32_Sub2_1.anInt1823;
			local319 = local22 - this.aClass32_Sub2_1.anInt1807;
			local325 = local27 - this.aClass32_Sub2_1.anInt1810;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt4630 * local340 * arg1;
			this.anInt3766 = (int) ((long) this.anInt3766 - ((long) this.anInt3766 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray420 != null) {
			@Pc(426) Class5 local426 = local31.aClass103_133.aClass5_114;
			for (@Pc(429) Class5 local429 = local426.aClass5_251; local429 != local426; local429 = local429.aClass5_251) {
				@Pc(433) Class5_Sub1_Sub12 local433 = (Class5_Sub1_Sub12) local429;
				@Pc(436) Class209 local436 = local433.aClass209_1;
				if (local436.anInt6614 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray420.length; local444++) {
						if (local35.anIntArray420[local444] == local436.anInt6611) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3741;
						@Pc(473) int local473 = local22 - local433.anInt3738;
						local478 = local27 - local433.anInt3743;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong229) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3739 + local473 * local436.anInt6613 + local478 * local433.anInt3737) * 65535L / (long) (local436.anInt6625 * local501);
							if (local529 >= (long) local436.anInt6612) {
								local537 = 0;
								if (local436.anInt6619 == 1) {
									local537 = (local501 >> 4) * local436.anInt6618;
								} else if (local436.anInt6619 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6618;
								}
								if (local436.anInt6626 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6625;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6625;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6625;
									if (local436.anInt6624 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt3760 += local643 * arg1 >> 15;
										super.anInt3755 += local652 * arg1 >> 15;
										super.anInt3756 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6624 == 0) {
									local65 += (local433.anInt3739 - local537) * arg1;
									local82 += (local436.anInt6613 - local537) * arg1;
									local99 += (local433.anInt3737 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt3760 += (local433.anInt3739 - local537) * arg1;
									super.anInt3755 += (local436.anInt6613 - local537) * arg1;
									super.anInt3756 += (local433.anInt3737 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray422 != null) {
			for (local313 = 0; local313 < local35.anIntArray422.length; local313++) {
				@Pc(743) Class5_Sub1_Sub12 local743 = (Class5_Sub1_Sub12) Static241.aClass97_1.method2516((long) local35.anIntArray422[local313]);
				while (local743 != null) {
					@Pc(747) Class209 local747 = local743.aClass209_1;
					local340 = local17 - local743.anInt3741;
					@Pc(757) int local757 = local22 - local743.anInt3738;
					local444 = local27 - local743.anInt3743;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong229) {
						local743 = (Class5_Sub1_Sub12) Static241.aClass97_1.method2514();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3739 + local757 * local747.anInt6613 + local444 * local743.anInt3737) * 65535L / (long) (local747.anInt6625 * local478);
						if (local491 < (long) local747.anInt6612) {
							local743 = (Class5_Sub1_Sub12) Static241.aClass97_1.method2514();
						} else {
							local501 = 0;
							if (local747.anInt6619 == 1) {
								local501 = (local478 >> 4) * local747.anInt6618;
							} else if (local747.anInt6619 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6618;
							}
							if (local747.anInt6626 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6625;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6625;
								local537 = (local444 << 15) / local478 * local747.anInt6625;
								if (local747.anInt6624 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt3760 += local939 * arg1 >> 15;
									super.anInt3755 += local948 * arg1 >> 15;
									super.anInt3756 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6624 == 0) {
								local65 += (local743.anInt3739 - local501) * arg1;
								local82 += (local747.anInt6613 - local501) * arg1;
								local99 += (local743.anInt3737 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt3760 += (local743.anInt3739 - local501) * arg1;
								super.anInt3755 += (local747.anInt6613 - local501) * arg1;
								super.anInt3756 += (local743.anInt3737 - local501) * arg1;
							}
							local743 = (Class5_Sub1_Sub12) Static241.aClass97_1.method2514();
						}
					}
				}
			}
		}
		if (local35.anIntArray421 != null) {
			if (local35.anIntArray423 == null) {
				local35.anIntArray423 = new int[local35.anIntArray421.length];
				for (local313 = 0; local313 < local35.anIntArray421.length; local313++) {
					Static19.method356(local35.anIntArray421[local313]);
					local35.anIntArray423[local313] = ((Class5_Sub15) Static335.aClass190_32.method5466((long) local35.anIntArray421[local313])).anInt1686;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray423.length; local313++) {
				@Pc(1082) Class209 local1082 = Static147.aClass209Array2[local35.anIntArray423[local313]];
				if (local1082.anInt6624 == 0) {
					local65 += local1082.anInt6627 * arg1;
					local82 += local1082.anInt6613 * arg1;
					local99 += local1082.anInt6628 * arg1;
					local303 = true;
				} else {
					super.anInt3760 += local1082.anInt6627 * arg1;
					super.anInt3755 += local1082.anInt6613 * arg1;
					super.anInt3756 += local1082.anInt6628 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort41 = (short) local65;
					this.aShort42 = (short) local82;
					this.aShort43 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt3766 <<= 0x1;
			}
		}
		super.anInt3760 = (int) ((long) super.anInt3760 + ((long) this.aShort41 * (long) this.anInt3766 >> 23) * (long) arg1);
		super.anInt3755 = (int) ((long) super.anInt3755 + ((long) this.aShort42 * (long) this.anInt3766 >> 23) * (long) arg1);
		super.anInt3756 = (int) ((long) super.anInt3756 + ((long) this.aShort43 * (long) this.anInt3766 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(J)V")
	public void method3402(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt3760 >> 19;
		@Pc(9) int local9 = super.anInt3756 >> 19;
		@Pc(14) int local14 = super.anInt3755 >> Static53.anInt983;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static350.anInt6715 || local9 < 0 || local9 >= Static236.anInt4222) {
			this.method3398();
			return;
		}
		@Pc(36) Class32_Sub7 local36 = this.aClass32_Sub2_1.aClass32_Sub7_1;
		@Pc(40) Class150 local40 = this.aClass32_Sub2_1.aClass150_1;
		@Pc(42) Class51[] local42 = Static8.aClass51Array1;
		@Pc(50) int local50 = local42[local36.anInt5611].method1856(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt5611 < 3) {
			local64 = local42[local36.anInt5611 + 1].method1856(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean370) {
			if (local40.anInt4587 == -1 && local14 > local50) {
				this.method3398();
				return;
			}
			if (local40.anInt4587 >= 0 && local14 > local42[local40.anInt4587].method1856(local4, local9)) {
				this.method3398();
				return;
			}
			if (local40.anInt4609 == -1 && local14 < local64) {
				this.method3398();
				return;
			}
			if (local40.anInt4609 >= 0 && local14 < local42[local40.anInt4609 + 1].method1856(local4, local9)) {
				this.method3398();
				return;
			}
		}
		if (local4 >= local36.anInt5612 && local4 <= local36.anInt5609 && local9 >= local36.anInt5610 && local9 <= local36.anInt5609 && local14 <= local50 && local14 >= local64) {
			local36.aClass146_2.aClass13_1.method305(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method1856(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method1856(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method1856(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method1856(local4, local9) - 1024) {
			this.method3398();
			return;
		}
		@Pc(202) Class174 local202 = Static178.aClass174ArrayArrayArray3[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static178.aClass174ArrayArrayArray3[0][local4][local9].aClass174_1 != null;
			if (local148 == 3 && local217) {
				this.method3398();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static178.aClass174ArrayArrayArray3[local227][local4][local9] == null) {
					local202 = Static178.aClass174ArrayArrayArray3[local227][local4][local9] = new Class174(local227, local4, local9);
					if (local217) {
						local202.aByte44++;
					}
				}
			}
		}
		if (local202.aClass146_1 == null) {
			local202.aClass146_1 = new Class146();
			local202.aByte49 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte49 != (byte) (arg0 & 0xFFL)) {
			local202.aClass146_1 = new Class146();
			local202.aByte49 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass146_1.aClass13_1.method305(this);
	}
}

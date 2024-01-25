import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class39_Sub2_Sub1_Sub1 extends Class39_Sub2_Sub1 {

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
	private int anInt7215;

	@OriginalMember(owner = "client!uu", name = "M", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "Lclient!ms;")
	private Class39_Sub6 aClass39_Sub6_1;

	@OriginalMember(owner = "client!uu", name = "L", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
	private int anInt7216;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!ms;IIIIIIIIIIIZZ)V")
	public Class39_Sub2_Sub1_Sub1(@OriginalArg(0) Class39_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass39_Sub6_1 = arg0;
		super.anInt7204 = arg1 << Static327.anInt5727;
		super.anInt7206 = arg2 << Static327.anInt5727;
		super.anInt7210 = arg3 << Static327.anInt5727;
		super.anInt7207 = arg9;
		this.aShort98 = this.aShort100 = (short) arg8;
		super.anInt7212 = arg10;
		super.anInt7208 = arg11;
		super.aBoolean463 = arg13;
		this.aShort96 = (short) arg4;
		this.aShort99 = (short) arg5;
		this.aShort97 = (short) arg6;
		this.anInt7216 = arg7;
		super.aByte100 = this.aClass39_Sub6_1.aClass252_1.aByte101;
		this.method5584();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "()V")
	private void method5582() {
		this.aClass39_Sub6_1.aClass39_Sub8_4.aClass39_Sub2_Sub1_Sub1Array2[this.aShort101] = null;
		Static330.aClass39_Sub2_Sub1_Sub1Array1[Static379.anInt6499] = this;
		Static379.anInt6499 = Static379.anInt6499 + 1 & 0x3FF;
		this.method5616();
		this.method5576();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(J)V")
	public void method5583(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt7204 >> Static139.anInt2355 + 12;
		@Pc(13) int local13 = super.anInt7210 >> Static139.anInt2355 + 12;
		@Pc(18) int local18 = super.anInt7206 >> Static327.anInt5727;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static377.anInt6467 || local13 < 0 || local13 >= Static378.anInt6480) {
			this.method5582();
			return;
		}
		@Pc(40) Class39_Sub8 local40 = this.aClass39_Sub6_1.aClass39_Sub8_4;
		@Pc(44) Class223 local44 = this.aClass39_Sub6_1.aClass223_1;
		@Pc(46) Class136[] local46 = Static92.aClass136Array1;
		@Pc(54) int local54 = local46[local40.anInt7262].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt7262 < Static107.anInt1964 - 1) {
			local70 = local46[local40.anInt7262 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static139.anInt2355);
		}
		if (local44.aBoolean441) {
			if (local44.anInt6668 == -1 && local18 > local54) {
				this.method5582();
				return;
			}
			if (local44.anInt6668 >= 0 && local18 > local46[local44.anInt6668].I(local6, local13)) {
				this.method5582();
				return;
			}
			if (local44.anInt6706 == -1 && local18 < local70) {
				this.method5582();
				return;
			}
			if (local44.anInt6706 >= 0 && local18 < local46[local44.anInt6706 + 1].I(local6, local13)) {
				this.method5582();
				return;
			}
		}
		if (local6 >= local40.anInt7258 && local6 <= local40.anInt7261 && local13 >= local40.anInt7257 && local13 <= local40.anInt7260 && local18 <= local54 && local18 >= local70) {
			local40.aClass185_2.aClass212_1.method4961(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static107.anInt1964 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method5582();
		} else if (local158 == Static107.anInt1964 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static139.anInt2355) {
			this.method5582();
		} else {
			@Pc(211) Class211 local211 = Static268.aClass211ArrayArrayArray4[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static268.aClass211ArrayArrayArray4[0][local6][local13] = new Class211(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static268.aClass211ArrayArrayArray4[0][local6][local13].aClass211_1 != null;
				if (local158 == 3 && local243) {
					this.method5582();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static268.aClass211ArrayArrayArray4[local253][local6][local13] == null) {
						local211 = Static268.aClass211ArrayArrayArray4[local253][local6][local13] = new Class211(local253, local6, local13);
						if (local243) {
							local211.aByte78++;
						}
					}
				}
			}
			if (local211.aClass185_1 == null) {
				local211.aClass185_1 = new Class185();
				local211.aByte72 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte72 != (byte) (arg0 & 0xFFL)) {
				local211.aClass185_1.aClass212_1.method4958();
				local211.aClass185_1.aBoolean365 = false;
				local211.aByte72 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass185_1.aClass212_1.method4961(this);
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "()V")
	private void method5584() {
		@Pc(4) int local4 = this.aClass39_Sub6_1.aClass39_Sub8_4.anInt7255;
		if (this.aClass39_Sub6_1.aClass39_Sub8_4.aClass39_Sub2_Sub1_Sub1Array2[local4] != null) {
			this.aClass39_Sub6_1.aClass39_Sub8_4.aClass39_Sub2_Sub1_Sub1Array2[local4].method5582();
		}
		this.aClass39_Sub6_1.aClass39_Sub8_4.aClass39_Sub2_Sub1_Sub1Array2[local4] = this;
		this.aShort101 = (short) this.aClass39_Sub6_1.aClass39_Sub8_4.anInt7255;
		this.aClass39_Sub6_1.aClass39_Sub8_4.anInt7255 = local4 + 1 & 0x1FFF;
		this.aClass39_Sub6_1.aClass188_6.method4538(this);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!ms;IIIIIIIIIIIZZ)V")
	public void method5585(@OriginalArg(0) Class39_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass39_Sub6_1 = arg0;
		super.anInt7204 = arg1 << Static327.anInt5727;
		super.anInt7206 = arg2 << Static327.anInt5727;
		super.anInt7210 = arg3 << Static327.anInt5727;
		super.anInt7207 = arg9;
		this.aShort98 = this.aShort100 = (short) arg8;
		super.anInt7212 = arg10;
		super.anInt7208 = arg11;
		super.aBoolean463 = arg13;
		this.aShort96 = (short) arg4;
		this.aShort99 = (short) arg5;
		this.aShort97 = (short) arg6;
		this.anInt7216 = arg7;
		super.aByte100 = this.aClass39_Sub6_1.aClass252_1.aByte101;
		this.method5584();
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(JI)V")
	public void method5586(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort100 = (short) (this.aShort100 - arg1);
		if (this.aShort100 <= 0) {
			this.method5582();
			return;
		}
		@Pc(17) int local17 = super.anInt7204 >> Static327.anInt5727;
		@Pc(22) int local22 = super.anInt7206 >> Static327.anInt5727;
		@Pc(27) int local27 = super.anInt7210 >> Static327.anInt5727;
		@Pc(31) Class39_Sub8 local31 = this.aClass39_Sub6_1.aClass39_Sub8_4;
		@Pc(35) Class223 local35 = this.aClass39_Sub6_1.aClass223_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6682 != 0) {
			if (this.aShort98 - this.aShort100 <= local35.anInt6696) {
				local65 = (super.anInt7207 >> 8 & 0xFF00) + (this.anInt7215 >> 16 & 0xFF) + local35.anInt6709 * arg1;
				local82 = (super.anInt7207 & 0xFF00) + (this.anInt7215 >> 8 & 0xFF) + local35.anInt6677 * arg1;
				local99 = ((super.anInt7207 & 0xFF) << 8) + (this.anInt7215 & 0xFF) + local35.anInt6714 * arg1;
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
				super.anInt7207 &= 0xFF000000;
				super.anInt7207 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7215 &= 0xFF000000;
				this.anInt7215 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort98 - this.aShort100 <= local35.anInt6701) {
				local65 = (super.anInt7207 >> 16 & 0xFF00) + (this.anInt7215 >> 24 & 0xFF) + local35.anInt6707 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7207 &= 0xFFFFFF;
				super.anInt7207 |= (local65 & 0xFF00) << 16;
				this.anInt7215 &= 0xFFFFFF;
				this.anInt7215 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6708 != -1 && this.aShort98 - this.aShort100 <= local35.anInt6673) {
			this.anInt7216 += local35.anInt6686 * arg1;
		}
		if (local35.anInt6704 != -1 && this.aShort98 - this.aShort100 <= local35.anInt6693) {
			super.anInt7212 += local35.anInt6700 * arg1;
		}
		local65 = this.aShort96;
		local82 = this.aShort99;
		local99 = this.aShort97;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6694 == 1) {
			local313 = local17 - this.aClass39_Sub6_1.anInt4615;
			local319 = local22 - this.aClass39_Sub6_1.anInt4614;
			local325 = local27 - this.aClass39_Sub6_1.anInt4606;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6710 * local340 * arg1;
			this.anInt7216 = (int) ((long) this.anInt7216 - ((long) this.anInt7216 * local348 >> 18));
		} else if (local35.anInt6694 == 2) {
			local313 = local17 - this.aClass39_Sub6_1.anInt4615;
			local319 = local22 - this.aClass39_Sub6_1.anInt4614;
			local325 = local27 - this.aClass39_Sub6_1.anInt4606;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6710 * local340 * arg1;
			this.anInt7216 = (int) ((long) this.anInt7216 - ((long) this.anInt7216 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray554 != null) {
			@Pc(426) Class1 local426 = local31.aClass266_48.aClass1_255;
			for (@Pc(429) Class1 local429 = local426.aClass1_261; local429 != local426; local429 = local429.aClass1_261) {
				@Pc(433) Class1_Sub2_Sub13 local433 = (Class1_Sub2_Sub13) local429;
				@Pc(436) Class61 local436 = local433.aClass61_1;
				if (local436.anInt1619 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray554.length; local444++) {
						if (local35.anIntArray554[local444] == local436.anInt1632) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt5423;
						@Pc(473) int local473 = local22 - local433.anInt5427;
						local478 = local27 - local433.anInt5431;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong42) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt5424 + local473 * local436.anInt1613 + local478 * local433.anInt5426) * 65535L / (long) (local436.anInt1614 * local501);
							if (local529 >= (long) local436.anInt1623) {
								local537 = 0;
								if (local436.anInt1622 == 1) {
									local537 = (local501 >> 4) * local436.anInt1628;
								} else if (local436.anInt1622 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt1628;
								}
								if (local436.anInt1616 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt1614;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt1614;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt1614;
									if (local436.anInt1634 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt7204 += local643 * arg1 >> 15;
										super.anInt7206 += local652 * arg1 >> 15;
										super.anInt7210 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt1634 == 0) {
									local65 += (local433.anInt5424 - local537) * arg1;
									local82 += (local436.anInt1613 - local537) * arg1;
									local99 += (local433.anInt5426 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt7204 += (local433.anInt5424 - local537) * arg1;
									super.anInt7206 += (local436.anInt1613 - local537) * arg1;
									super.anInt7210 += (local433.anInt5426 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray552 != null) {
			for (local313 = 0; local313 < local35.anIntArray552.length; local313++) {
				@Pc(743) Class1_Sub2_Sub13 local743 = (Class1_Sub2_Sub13) Static235.aClass249_1.method5642((long) local35.anIntArray552[local313]);
				while (local743 != null) {
					@Pc(747) Class61 local747 = local743.aClass61_1;
					local340 = local17 - local743.anInt5423;
					@Pc(757) int local757 = local22 - local743.anInt5427;
					local444 = local27 - local743.anInt5431;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong42) {
						local743 = (Class1_Sub2_Sub13) Static235.aClass249_1.method5640();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt5424 + local757 * local747.anInt1613 + local444 * local743.anInt5426) * 65535L / (long) (local747.anInt1614 * local478);
						if (local491 < (long) local747.anInt1623) {
							local743 = (Class1_Sub2_Sub13) Static235.aClass249_1.method5640();
						} else {
							local501 = 0;
							if (local747.anInt1622 == 1) {
								local501 = (local478 >> 4) * local747.anInt1628;
							} else if (local747.anInt1622 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt1628;
							}
							if (local747.anInt1616 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt1614;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt1614;
								local537 = (local444 << 15) / local478 * local747.anInt1614;
								if (local747.anInt1634 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt7204 += local939 * arg1 >> 15;
									super.anInt7206 += local948 * arg1 >> 15;
									super.anInt7210 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt1634 == 0) {
								local65 += (local743.anInt5424 - local501) * arg1;
								local82 += (local747.anInt1613 - local501) * arg1;
								local99 += (local743.anInt5426 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt7204 += (local743.anInt5424 - local501) * arg1;
								super.anInt7206 += (local747.anInt1613 - local501) * arg1;
								super.anInt7210 += (local743.anInt5426 - local501) * arg1;
							}
							local743 = (Class1_Sub2_Sub13) Static235.aClass249_1.method5640();
						}
					}
				}
			}
		}
		if (local35.lb != null) {
			if (local35.anIntArray553 == null) {
				local35.anIntArray553 = new int[local35.lb.length];
				for (local313 = 0; local313 < local35.lb.length; local313++) {
					Static285.method6078(local35.lb[local313]);
					local35.anIntArray553[local313] = ((Class1_Sub13) Static261.aClass27_43.method553((long) local35.lb[local313])).anInt2277;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray553.length; local313++) {
				@Pc(1082) Class61 local1082 = Static325.aClass61Array1[local35.anIntArray553[local313]];
				if (local1082.anInt1634 == 0) {
					local65 += local1082.anInt1620 * arg1;
					local82 += local1082.anInt1613 * arg1;
					local99 += local1082.anInt1626 * arg1;
					local303 = true;
				} else {
					super.anInt7204 += local1082.anInt1620 * arg1;
					super.anInt7206 += local1082.anInt1613 * arg1;
					super.anInt7210 += local1082.anInt1626 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort96 = (short) local65;
					this.aShort99 = (short) local82;
					this.aShort97 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt7216 <<= 0x1;
			}
		}
		super.anInt7204 = (int) ((long) super.anInt7204 + ((long) this.aShort96 * (long) this.anInt7216 >> 23) * (long) arg1);
		super.anInt7206 = (int) ((long) super.anInt7206 + ((long) this.aShort99 * (long) this.anInt7216 >> 23) * (long) arg1);
		super.anInt7210 = (int) ((long) super.anInt7210 + ((long) this.aShort97 * (long) this.anInt7216 >> 23) * (long) arg1);
	}
}

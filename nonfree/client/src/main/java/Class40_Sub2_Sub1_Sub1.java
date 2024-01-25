import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class40_Sub2_Sub1_Sub1 extends Class40_Sub2_Sub1 {

	@OriginalMember(owner = "client!du", name = "J", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!du", name = "L", descriptor = "I")
	private int anInt1785;

	@OriginalMember(owner = "client!du", name = "E", descriptor = "Lclient!pk;")
	private Class40_Sub7 aClass40_Sub7_1;

	@OriginalMember(owner = "client!du", name = "F", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!du", name = "I", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!du", name = "G", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!du", name = "K", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!du", name = "H", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!du", name = "M", descriptor = "I")
	private int anInt1786;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!pk;IIIIIIIIIIIZZ)V")
	public Class40_Sub2_Sub1_Sub1(@OriginalArg(0) Class40_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass40_Sub7_1 = arg0;
		super.anInt1779 = arg1 << 12;
		super.anInt1780 = arg2 << 12;
		super.anInt1778 = arg3 << 12;
		super.anInt1781 = arg9;
		this.aShort9 = this.aShort6 = (short) arg8;
		super.anInt1782 = arg10;
		super.anInt1783 = arg11;
		super.aBoolean117 = arg13;
		this.aShort7 = (short) arg4;
		this.aShort11 = (short) arg5;
		this.aShort8 = (short) arg6;
		this.anInt1786 = arg7;
		super.aByte13 = this.aClass40_Sub7_1.aClass78_2.aByte17;
		this.method1580();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!pk;IIIIIIIIIIIZZ)V")
	public void method1578(@OriginalArg(0) Class40_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass40_Sub7_1 = arg0;
		super.anInt1779 = arg1 << 12;
		super.anInt1780 = arg2 << 12;
		super.anInt1778 = arg3 << 12;
		super.anInt1781 = arg9;
		this.aShort9 = this.aShort6 = (short) arg8;
		super.anInt1782 = arg10;
		super.anInt1783 = arg11;
		super.aBoolean117 = arg13;
		this.aShort7 = (short) arg4;
		this.aShort11 = (short) arg5;
		this.aShort8 = (short) arg6;
		this.anInt1786 = arg7;
		super.aByte13 = this.aClass40_Sub7_1.aClass78_2.aByte17;
		this.method1580();
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "()V")
	private void method1579() {
		this.aClass40_Sub7_1.aClass40_Sub6_5.aClass40_Sub2_Sub1_Sub1Array2[this.aShort10] = null;
		Static152.aClass40_Sub2_Sub1_Sub1Array1[Static61.anInt1131] = this;
		Static61.anInt1131 = Static61.anInt1131 + 1 & 0x3FF;
		this.method4364();
		this.method3361();
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "()V")
	private void method1580() {
		@Pc(4) int local4 = this.aClass40_Sub7_1.aClass40_Sub6_5.anInt5078;
		if (this.aClass40_Sub7_1.aClass40_Sub6_5.aClass40_Sub2_Sub1_Sub1Array2[local4] != null) {
			this.aClass40_Sub7_1.aClass40_Sub6_5.aClass40_Sub2_Sub1_Sub1Array2[local4].method1579();
		}
		this.aClass40_Sub7_1.aClass40_Sub6_5.aClass40_Sub2_Sub1_Sub1Array2[local4] = this;
		this.aShort10 = (short) this.aClass40_Sub7_1.aClass40_Sub6_5.anInt5078;
		this.aClass40_Sub7_1.aClass40_Sub6_5.anInt5078 = local4 + 1 & 0x1FFF;
		this.aClass40_Sub7_1.aClass240_4.method5225(this);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(J)V")
	public void method1581(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt1779 >> Static286.anInt5018 + 12;
		@Pc(13) int local13 = super.anInt1778 >> Static286.anInt5018 + 12;
		@Pc(18) int local18 = super.anInt1780 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static54.anInt998 || local13 < 0 || local13 >= Static24.anInt401) {
			this.method1579();
			return;
		}
		@Pc(40) Class40_Sub6 local40 = this.aClass40_Sub7_1.aClass40_Sub6_5;
		@Pc(44) Class70 local44 = this.aClass40_Sub7_1.aClass70_1;
		@Pc(46) Class154[] local46 = Static332.aClass154Array3;
		@Pc(54) int local54 = local46[local40.anInt5085].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt5085 < Static285.anInt5004 - 1) {
			local70 = local46[local40.anInt5085 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static286.anInt5018);
		}
		if (local44.aBoolean127) {
			if (local44.anInt2045 == -1 && local18 > local54) {
				this.method1579();
				return;
			}
			if (local44.anInt2045 >= 0 && local18 > local46[local44.anInt2045].ua(local6, local13)) {
				this.method1579();
				return;
			}
			if (local44.anInt2061 == -1 && local18 < local70) {
				this.method1579();
				return;
			}
			if (local44.anInt2061 >= 0 && local18 < local46[local44.anInt2061 + 1].ua(local6, local13)) {
				this.method1579();
				return;
			}
		}
		if (local6 >= local40.anInt5082 && local6 <= local40.anInt5080 && local13 >= local40.anInt5083 && local13 <= local40.anInt5084 && local18 <= local54 && local18 >= local70) {
			local40.aClass121_2.aClass197_1.method4416(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static285.anInt5004 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method1579();
		} else if (local158 == Static285.anInt5004 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static286.anInt5018) {
			this.method1579();
		} else {
			@Pc(211) Class11 local211 = Static309.aClass11ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static309.aClass11ArrayArrayArray2[0][local6][local13] = new Class11(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static309.aClass11ArrayArrayArray2[0][local6][local13].aClass11_1 != null;
				if (local158 == 3 && local243) {
					this.method1579();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static309.aClass11ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static309.aClass11ArrayArrayArray2[local253][local6][local13] = new Class11(local253, local6, local13);
						if (local243) {
							local211.aByte1++;
						}
					}
				}
			}
			if (local211.aClass121_1 == null) {
				local211.aClass121_1 = new Class121();
				local211.aByte2 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte2 != (byte) (arg0 & 0xFFL)) {
				local211.aClass121_1.aClass197_1.method4419();
				local211.aClass121_1.aBoolean237 = false;
				local211.aByte2 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass121_1.aClass197_1.method4416(this);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(JI)V")
	public void method1582(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort6 = (short) (this.aShort6 - arg1);
		if (this.aShort6 <= 0) {
			this.method1579();
			return;
		}
		@Pc(17) int local17 = super.anInt1779 >> 12;
		@Pc(22) int local22 = super.anInt1780 >> 12;
		@Pc(27) int local27 = super.anInt1778 >> 12;
		@Pc(31) Class40_Sub6 local31 = this.aClass40_Sub7_1.aClass40_Sub6_5;
		@Pc(35) Class70 local35 = this.aClass40_Sub7_1.aClass70_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2021 != 0) {
			if (this.aShort9 - this.aShort6 <= local35.anInt2014) {
				local65 = (super.anInt1781 >> 8 & 0xFF00) + (this.anInt1785 >> 16 & 0xFF) + local35.anInt2030 * arg1;
				local82 = (super.anInt1781 & 0xFF00) + (this.anInt1785 >> 8 & 0xFF) + local35.anInt2028 * arg1;
				local99 = ((super.anInt1781 & 0xFF) << 8) + (this.anInt1785 & 0xFF) + local35.anInt2059 * arg1;
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
				super.anInt1781 &= 0xFF000000;
				super.anInt1781 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt1785 &= 0xFF000000;
				this.anInt1785 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort9 - this.aShort6 <= local35.anInt2046) {
				local65 = (super.anInt1781 >> 16 & 0xFF00) + (this.anInt1785 >> 24 & 0xFF) + local35.anInt2041 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt1781 &= 0xFFFFFF;
				super.anInt1781 |= (local65 & 0xFF00) << 16;
				this.anInt1785 &= 0xFFFFFF;
				this.anInt1785 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2037 != -1 && this.aShort9 - this.aShort6 <= local35.anInt2063) {
			this.anInt1786 += local35.anInt2015 * arg1;
		}
		if (local35.anInt2036 != -1 && this.aShort9 - this.aShort6 <= local35.anInt2042) {
			super.anInt1782 += local35.anInt2047 * arg1;
		}
		local65 = this.aShort7;
		local82 = this.aShort11;
		local99 = this.aShort8;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt2032 == 1) {
			local313 = local17 - this.aClass40_Sub7_1.anInt5410;
			local319 = local22 - this.aClass40_Sub7_1.anInt5423;
			local325 = local27 - this.aClass40_Sub7_1.anInt5434;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2024 * local340 * arg1;
			this.anInt1786 = (int) ((long) this.anInt1786 - ((long) this.anInt1786 * local348 >> 18));
		} else if (local35.anInt2032 == 2) {
			local313 = local17 - this.aClass40_Sub7_1.anInt5410;
			local319 = local22 - this.aClass40_Sub7_1.anInt5423;
			local325 = local27 - this.aClass40_Sub7_1.anInt5434;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2024 * local340 * arg1;
			this.anInt1786 = (int) ((long) this.anInt1786 - ((long) this.anInt1786 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray168 != null) {
			@Pc(426) Class10 local426 = local31.aClass163_33.aClass10_149;
			for (@Pc(429) Class10 local429 = local426.aClass10_263; local429 != local426; local429 = local429.aClass10_263) {
				@Pc(433) Class10_Sub1_Sub10 local433 = (Class10_Sub1_Sub10) local429;
				@Pc(436) Class236 local436 = local433.aClass236_1;
				if (local436.anInt6616 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray168.length; local444++) {
						if (local35.anIntArray168[local444] == local436.anInt6608) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4408;
						@Pc(473) int local473 = local22 - local433.anInt4412;
						local478 = local27 - local433.anInt4406;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong226) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4407 + local473 * local436.anInt6605 + local478 * local433.anInt4411) * 65535L / (long) (local436.anInt6606 * local501);
							if (local529 >= (long) local436.anInt6618) {
								local537 = 0;
								if (local436.anInt6602 == 1) {
									local537 = (local501 >> 4) * local436.anInt6610;
								} else if (local436.anInt6602 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6610;
								}
								if (local436.anInt6607 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6606;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6606;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6606;
									if (local436.anInt6614 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt1779 += local643 * arg1 >> 15;
										super.anInt1780 += local652 * arg1 >> 15;
										super.anInt1778 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6614 == 0) {
									local65 += (local433.anInt4407 - local537) * arg1;
									local82 += (local436.anInt6605 - local537) * arg1;
									local99 += (local433.anInt4411 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt1779 += (local433.anInt4407 - local537) * arg1;
									super.anInt1780 += (local436.anInt6605 - local537) * arg1;
									super.anInt1778 += (local433.anInt4411 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray170 != null) {
			for (local313 = 0; local313 < local35.anIntArray170.length; local313++) {
				@Pc(743) Class10_Sub1_Sub10 local743 = (Class10_Sub1_Sub10) Static265.aClass265_1.method5940((long) local35.anIntArray170[local313]);
				while (local743 != null) {
					@Pc(747) Class236 local747 = local743.aClass236_1;
					local340 = local17 - local743.anInt4408;
					@Pc(757) int local757 = local22 - local743.anInt4412;
					local444 = local27 - local743.anInt4406;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong226) {
						local743 = (Class10_Sub1_Sub10) Static265.aClass265_1.method5937();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4407 + local757 * local747.anInt6605 + local444 * local743.anInt4411) * 65535L / (long) (local747.anInt6606 * local478);
						if (local491 < (long) local747.anInt6618) {
							local743 = (Class10_Sub1_Sub10) Static265.aClass265_1.method5937();
						} else {
							local501 = 0;
							if (local747.anInt6602 == 1) {
								local501 = (local478 >> 4) * local747.anInt6610;
							} else if (local747.anInt6602 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6610;
							}
							if (local747.anInt6607 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6606;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6606;
								local537 = (local444 << 15) / local478 * local747.anInt6606;
								if (local747.anInt6614 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt1779 += local939 * arg1 >> 15;
									super.anInt1780 += local948 * arg1 >> 15;
									super.anInt1778 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6614 == 0) {
								local65 += (local743.anInt4407 - local501) * arg1;
								local82 += (local747.anInt6605 - local501) * arg1;
								local99 += (local743.anInt4411 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt1779 += (local743.anInt4407 - local501) * arg1;
								super.anInt1780 += (local747.anInt6605 - local501) * arg1;
								super.anInt1778 += (local743.anInt4411 - local501) * arg1;
							}
							local743 = (Class10_Sub1_Sub10) Static265.aClass265_1.method5937();
						}
					}
				}
			}
		}
		if (local35.anIntArray171 != null) {
			if (local35.anIntArray169 == null) {
				local35.anIntArray169 = new int[local35.anIntArray171.length];
				for (local313 = 0; local313 < local35.anIntArray171.length; local313++) {
					Static173.method2928(local35.anIntArray171[local313]);
					local35.anIntArray169[local313] = ((Class10_Sub12) Static343.aClass167_23.method3709((long) local35.anIntArray171[local313])).anInt1159;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray169.length; local313++) {
				@Pc(1082) Class236 local1082 = Static276.aClass236Array3[local35.anIntArray169[local313]];
				if (local1082.anInt6614 == 0) {
					local65 += local1082.anInt6619 * arg1;
					local82 += local1082.anInt6605 * arg1;
					local99 += local1082.anInt6611 * arg1;
					local303 = true;
				} else {
					super.anInt1779 += local1082.anInt6619 * arg1;
					super.anInt1780 += local1082.anInt6605 * arg1;
					super.anInt1778 += local1082.anInt6611 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort7 = (short) local65;
					this.aShort11 = (short) local82;
					this.aShort8 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt1786 <<= 0x1;
			}
		}
		super.anInt1779 = (int) ((long) super.anInt1779 + ((long) this.aShort7 * (long) this.anInt1786 >> 23) * (long) arg1);
		super.anInt1780 = (int) ((long) super.anInt1780 + ((long) this.aShort11 * (long) this.anInt1786 >> 23) * (long) arg1);
		super.anInt1778 = (int) ((long) super.anInt1778 + ((long) this.aShort8 * (long) this.anInt1786 >> 23) * (long) arg1);
	}
}

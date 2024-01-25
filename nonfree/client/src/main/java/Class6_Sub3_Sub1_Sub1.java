import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class6_Sub3_Sub1_Sub1 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!dq", name = "G", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
	private int anInt1884;

	@OriginalMember(owner = "client!dq", name = "K", descriptor = "Lclient!af;")
	private Class6_Sub2 aClass6_Sub2_1;

	@OriginalMember(owner = "client!dq", name = "L", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!dq", name = "N", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!dq", name = "I", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
	private int anInt1885;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!af;IIIIIIIIIIIZZ)V")
	public Class6_Sub3_Sub1_Sub1(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass6_Sub2_1 = arg0;
		super.anInt1878 = arg1 << Static310.anInt5496;
		super.anInt1881 = arg2 << Static310.anInt5496;
		super.anInt1883 = arg3 << Static310.anInt5496;
		super.anInt1876 = arg9;
		this.aShort42 = this.aShort40 = (short) arg8;
		super.anInt1882 = arg10;
		super.anInt1879 = arg11;
		super.aBoolean156 = arg13;
		this.aShort39 = (short) arg4;
		this.aShort43 = (short) arg5;
		this.aShort41 = (short) arg6;
		this.anInt1885 = arg7;
		super.aByte37 = this.aClass6_Sub2_1.aClass269_1.aByte104;
		this.method1470();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(JI)V")
	public void method1466(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort40 = (short) (this.aShort40 - arg1);
		if (this.aShort40 <= 0) {
			this.method1468();
			return;
		}
		@Pc(17) int local17 = super.anInt1878 >> Static310.anInt5496;
		@Pc(22) int local22 = super.anInt1881 >> Static310.anInt5496;
		@Pc(27) int local27 = super.anInt1883 >> Static310.anInt5496;
		@Pc(31) Class6_Sub8 local31 = this.aClass6_Sub2_1.aClass6_Sub8_1;
		@Pc(35) Class160 local35 = this.aClass6_Sub2_1.aClass160_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt4971 != 0) {
			if (this.aShort42 - this.aShort40 <= local35.anInt4930) {
				local65 = (super.anInt1876 >> 8 & 0xFF00) + (this.anInt1884 >> 16 & 0xFF) + local35.anInt4925 * arg1;
				local82 = (super.anInt1876 & 0xFF00) + (this.anInt1884 >> 8 & 0xFF) + local35.anInt4923 * arg1;
				local99 = ((super.anInt1876 & 0xFF) << 8) + (this.anInt1884 & 0xFF) + local35.anInt4945 * arg1;
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
				super.anInt1876 &= 0xFF000000;
				super.anInt1876 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt1884 &= 0xFF000000;
				this.anInt1884 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort42 - this.aShort40 <= local35.anInt4961) {
				local65 = (super.anInt1876 >> 16 & 0xFF00) + (this.anInt1884 >> 24 & 0xFF) + local35.anInt4962 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt1876 &= 0xFFFFFF;
				super.anInt1876 |= (local65 & 0xFF00) << 16;
				this.anInt1884 &= 0xFFFFFF;
				this.anInt1884 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4935 != -1 && this.aShort42 - this.aShort40 <= local35.anInt4928) {
			this.anInt1885 += local35.anInt4948 * arg1;
		}
		if (local35.anInt4963 != -1 && this.aShort42 - this.aShort40 <= local35.anInt4946) {
			super.anInt1882 += local35.anInt4947 * arg1;
		}
		local65 = this.aShort39;
		local82 = this.aShort43;
		local99 = this.aShort41;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt4934 == 1) {
			local313 = local17 - this.aClass6_Sub2_1.anInt125;
			local319 = local22 - this.aClass6_Sub2_1.anInt104;
			local325 = local27 - this.aClass6_Sub2_1.anInt122;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt4950 * local340 * arg1;
			this.anInt1885 = (int) ((long) this.anInt1885 - ((long) this.anInt1885 * local348 >> 18));
		} else if (local35.anInt4934 == 2) {
			local313 = local17 - this.aClass6_Sub2_1.anInt125;
			local319 = local22 - this.aClass6_Sub2_1.anInt104;
			local325 = local27 - this.aClass6_Sub2_1.anInt122;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt4950 * local340 * arg1;
			this.anInt1885 = (int) ((long) this.anInt1885 - ((long) this.anInt1885 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray323 != null) {
			@Pc(426) Class3 local426 = local31.aClass243_52.aClass3_231;
			for (@Pc(429) Class3 local429 = local426.aClass3_261; local429 != local426; local429 = local429.aClass3_261) {
				@Pc(433) Class3_Sub4_Sub2 local433 = (Class3_Sub4_Sub2) local429;
				@Pc(436) Class102 local436 = local433.aClass102_1;
				if (local436.anInt3103 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray323.length; local444++) {
						if (local35.anIntArray323[local444] == local436.anInt3096) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt890;
						@Pc(473) int local473 = local22 - local433.anInt894;
						local478 = local27 - local433.anInt892;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong96) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt886 + local473 * local436.anInt3095 + local478 * local433.anInt889) * 65535L / (long) (local436.anInt3090 * local501);
							if (local529 >= (long) local436.anInt3102) {
								local537 = 0;
								if (local436.anInt3097 == 1) {
									local537 = (local501 >> 4) * local436.anInt3101;
								} else if (local436.anInt3097 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3101;
								}
								if (local436.anInt3089 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3090;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3090;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3090;
									if (local436.anInt3100 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt1878 += local643 * arg1 >> 15;
										super.anInt1881 += local652 * arg1 >> 15;
										super.anInt1883 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3100 == 0) {
									local65 += (local433.anInt886 - local537) * arg1;
									local82 += (local436.anInt3095 - local537) * arg1;
									local99 += (local433.anInt889 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt1878 += (local433.anInt886 - local537) * arg1;
									super.anInt1881 += (local436.anInt3095 - local537) * arg1;
									super.anInt1883 += (local433.anInt889 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray326 != null) {
			for (local313 = 0; local313 < local35.anIntArray326.length; local313++) {
				@Pc(743) Class3_Sub4_Sub2 local743 = (Class3_Sub4_Sub2) Static2.aClass133_1.method3261((long) local35.anIntArray326[local313]);
				while (local743 != null) {
					@Pc(747) Class102 local747 = local743.aClass102_1;
					local340 = local17 - local743.anInt890;
					@Pc(757) int local757 = local22 - local743.anInt894;
					local444 = local27 - local743.anInt892;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong96) {
						local743 = (Class3_Sub4_Sub2) Static2.aClass133_1.method3259();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt886 + local757 * local747.anInt3095 + local444 * local743.anInt889) * 65535L / (long) (local747.anInt3090 * local478);
						if (local491 < (long) local747.anInt3102) {
							local743 = (Class3_Sub4_Sub2) Static2.aClass133_1.method3259();
						} else {
							local501 = 0;
							if (local747.anInt3097 == 1) {
								local501 = (local478 >> 4) * local747.anInt3101;
							} else if (local747.anInt3097 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3101;
							}
							if (local747.anInt3089 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3090;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3090;
								local537 = (local444 << 15) / local478 * local747.anInt3090;
								if (local747.anInt3100 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt1878 += local939 * arg1 >> 15;
									super.anInt1881 += local948 * arg1 >> 15;
									super.anInt1883 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3100 == 0) {
								local65 += (local743.anInt886 - local501) * arg1;
								local82 += (local747.anInt3095 - local501) * arg1;
								local99 += (local743.anInt889 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt1878 += (local743.anInt886 - local501) * arg1;
								super.anInt1881 += (local747.anInt3095 - local501) * arg1;
								super.anInt1883 += (local743.anInt889 - local501) * arg1;
							}
							local743 = (Class3_Sub4_Sub2) Static2.aClass133_1.method3259();
						}
					}
				}
			}
		}
		if (local35.anIntArray324 != null) {
			if (local35.anIntArray325 == null) {
				local35.anIntArray325 = new int[local35.anIntArray324.length];
				for (local313 = 0; local313 < local35.anIntArray324.length; local313++) {
					Static62.method1239(local35.anIntArray324[local313]);
					local35.anIntArray325[local313] = ((Class3_Sub34) Static450.aClass11_44.method324((long) local35.anIntArray324[local313])).anInt5289;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray325.length; local313++) {
				@Pc(1082) Class102 local1082 = Static380.aClass102Array2[local35.anIntArray325[local313]];
				if (local1082.anInt3100 == 0) {
					local65 += local1082.anInt3092 * arg1;
					local82 += local1082.anInt3095 * arg1;
					local99 += local1082.anInt3091 * arg1;
					local303 = true;
				} else {
					super.anInt1878 += local1082.anInt3092 * arg1;
					super.anInt1881 += local1082.anInt3095 * arg1;
					super.anInt1883 += local1082.anInt3091 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort39 = (short) local65;
					this.aShort43 = (short) local82;
					this.aShort41 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt1885 <<= 0x1;
			}
		}
		super.anInt1878 = (int) ((long) super.anInt1878 + ((long) this.aShort39 * (long) this.anInt1885 >> 23) * (long) arg1);
		super.anInt1881 = (int) ((long) super.anInt1881 + ((long) this.aShort43 * (long) this.anInt1885 >> 23) * (long) arg1);
		super.anInt1883 = (int) ((long) super.anInt1883 + ((long) this.aShort41 * (long) this.anInt1885 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(J)V")
	public void method1467(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt1878 >> Static336.anInt5747 + 12;
		@Pc(13) int local13 = super.anInt1883 >> Static336.anInt5747 + 12;
		@Pc(18) int local18 = super.anInt1881 >> Static310.anInt5496;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static405.anInt6684 || local13 < 0 || local13 >= Static37.anInt1025) {
			this.method1468();
			return;
		}
		@Pc(40) Class6_Sub8 local40 = this.aClass6_Sub2_1.aClass6_Sub8_1;
		@Pc(44) Class160 local44 = this.aClass6_Sub2_1.aClass160_1;
		@Pc(46) Class159[] local46 = Static444.aClass159Array3;
		@Pc(54) int local54 = local46[local40.anInt7593].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt7593 < Static362.anInt6122 - 1) {
			local70 = local46[local40.anInt7593 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static336.anInt5747);
		}
		if (local44.aBoolean432) {
			if (local44.anInt4969 == -1 && local18 > local54) {
				this.method1468();
				return;
			}
			if (local44.anInt4969 >= 0 && local18 > local46[local44.anInt4969].I(local6, local13)) {
				this.method1468();
				return;
			}
			if (local44.anInt4937 == -1 && local18 < local70) {
				this.method1468();
				return;
			}
			if (local44.anInt4937 >= 0 && local18 < local46[local44.anInt4937 + 1].I(local6, local13)) {
				this.method1468();
				return;
			}
		}
		if (local6 >= local40.anInt7594 && local6 <= local40.anInt7592 && local13 >= local40.anInt7590 && local13 <= local40.anInt7589 && local18 <= local54 && local18 >= local70) {
			local40.aClass227_2.aClass235_1.method4959(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static362.anInt6122 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method1468();
		} else if (local158 == Static362.anInt6122 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static336.anInt5747) {
			this.method1468();
		} else {
			@Pc(211) Class118 local211 = Static263.aClass118ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static263.aClass118ArrayArrayArray2[0][local6][local13] = new Class118(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static263.aClass118ArrayArrayArray2[0][local6][local13].aClass118_1 != null;
				if (local158 == 3 && local243) {
					this.method1468();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static263.aClass118ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static263.aClass118ArrayArrayArray2[local253][local6][local13] = new Class118(local253, local6, local13);
						if (local243) {
							local211.aByte63++;
						}
					}
				}
			}
			if (local211.aClass227_1 == null) {
				local211.aClass227_1 = new Class227();
				local211.aByte67 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte67 != (byte) (arg0 & 0xFFL)) {
				local211.aClass227_1.aClass235_1.method4962();
				local211.aClass227_1.aBoolean537 = false;
				local211.aByte67 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass227_1.aClass235_1.method4959(this);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
	private void method1468() {
		this.aClass6_Sub2_1.aClass6_Sub8_1.aClass6_Sub3_Sub1_Sub1Array2[this.aShort38] = null;
		Static168.aClass6_Sub3_Sub1_Sub1Array1[Static324.anInt7645] = this;
		Static324.anInt7645 = Static324.anInt7645 + 1 & 0x3FF;
		this.method5914();
		this.method1456();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!af;IIIIIIIIIIIZZ)V")
	public void method1469(@OriginalArg(0) Class6_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass6_Sub2_1 = arg0;
		super.anInt1878 = arg1 << Static310.anInt5496;
		super.anInt1881 = arg2 << Static310.anInt5496;
		super.anInt1883 = arg3 << Static310.anInt5496;
		super.anInt1876 = arg9;
		this.aShort42 = this.aShort40 = (short) arg8;
		super.anInt1882 = arg10;
		super.anInt1879 = arg11;
		super.aBoolean156 = arg13;
		this.aShort39 = (short) arg4;
		this.aShort43 = (short) arg5;
		this.aShort41 = (short) arg6;
		this.anInt1885 = arg7;
		super.aByte37 = this.aClass6_Sub2_1.aClass269_1.aByte104;
		this.method1470();
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "()V")
	private void method1470() {
		@Pc(4) int local4 = this.aClass6_Sub2_1.aClass6_Sub8_1.anInt7587;
		if (this.aClass6_Sub2_1.aClass6_Sub8_1.aClass6_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass6_Sub2_1.aClass6_Sub8_1.aClass6_Sub3_Sub1_Sub1Array2[local4].method1468();
		}
		this.aClass6_Sub2_1.aClass6_Sub8_1.aClass6_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort38 = (short) this.aClass6_Sub2_1.aClass6_Sub8_1.anInt7587;
		this.aClass6_Sub2_1.aClass6_Sub8_1.anInt7587 = local4 + 1 & 0x1FFF;
		this.aClass6_Sub2_1.aClass138_1.method3307(this);
	}
}

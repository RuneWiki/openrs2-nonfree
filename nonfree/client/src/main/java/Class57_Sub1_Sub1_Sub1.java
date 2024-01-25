import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class57_Sub1_Sub1_Sub1 extends Class57_Sub1_Sub1 {

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	private int anInt5159;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Lclient!sl;")
	private Class57_Sub8 aClass57_Sub8_1;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	private int anInt5160;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!sl;IIIIIIIIIIIZZ)V")
	public Class57_Sub1_Sub1_Sub1(@OriginalArg(0) Class57_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass57_Sub8_1 = arg0;
		super.anInt5158 = arg1 << Static206.anInt3842;
		super.anInt5150 = arg2 << Static206.anInt3842;
		super.anInt5154 = arg3 << Static206.anInt3842;
		super.anInt5149 = arg9;
		this.aShort66 = this.aShort71 = (short) arg8;
		super.anInt5153 = arg10;
		super.anInt5157 = arg11;
		super.aBoolean321 = arg13;
		this.aShort68 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort69 = (short) arg6;
		this.anInt5160 = arg7;
		super.aByte67 = this.aClass57_Sub8_1.aClass119_2.aByte52;
		this.method4335();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	private void method4335() {
		@Pc(4) int local4 = this.aClass57_Sub8_1.aClass57_Sub4_5.anInt3930;
		if (this.aClass57_Sub8_1.aClass57_Sub4_5.aClass57_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass57_Sub8_1.aClass57_Sub4_5.aClass57_Sub1_Sub1_Sub1Array2[local4].method4336();
		}
		this.aClass57_Sub8_1.aClass57_Sub4_5.aClass57_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort70 = (short) this.aClass57_Sub8_1.aClass57_Sub4_5.anInt3930;
		this.aClass57_Sub8_1.aClass57_Sub4_5.anInt3930 = local4 + 1 & 0x1FFF;
		this.aClass57_Sub8_1.aClass111_7.method2696(this);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	private void method4336() {
		this.aClass57_Sub8_1.aClass57_Sub4_5.aClass57_Sub1_Sub1_Sub1Array2[this.aShort70] = null;
		Static182.aClass57_Sub1_Sub1_Sub1Array1[Static225.anInt4063] = this;
		Static225.anInt4063 = Static225.anInt4063 + 1 & 0x3FF;
		this.method5359();
		this.method4328();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(J)V")
	public void method4337(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt5158 >> Static62.anInt1705 + 12;
		@Pc(13) int local13 = super.anInt5154 >> Static62.anInt1705 + 12;
		@Pc(18) int local18 = super.anInt5150 >> Static206.anInt3842;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static229.anInt4189 || local13 < 0 || local13 >= Static61.anInt1698) {
			this.method4336();
			return;
		}
		@Pc(40) Class57_Sub4 local40 = this.aClass57_Sub8_1.aClass57_Sub4_5;
		@Pc(44) Class188 local44 = this.aClass57_Sub8_1.aClass188_1;
		@Pc(46) Class86[] local46 = Static55.aClass86Array1;
		@Pc(54) int local54 = local46[local40.anInt3934].method6594(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt3934 < Static295.anInt5507 - 1) {
			local70 = local46[local40.anInt3934 + 1].method6594(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static62.anInt1705);
		}
		if (local44.aBoolean334) {
			if (local44.anInt5242 == -1 && local18 > local54) {
				this.method4336();
				return;
			}
			if (local44.anInt5242 >= 0 && local18 > local46[local44.anInt5242].method6594(local6, local13)) {
				this.method4336();
				return;
			}
			if (local44.anInt5220 == -1 && local18 < local70) {
				this.method4336();
				return;
			}
			if (local44.anInt5220 >= 0 && local18 < local46[local44.anInt5220 + 1].method6594(local6, local13)) {
				this.method4336();
				return;
			}
		}
		if (local6 >= local40.anInt3936 && local6 <= local40.anInt3937 && local13 >= local40.anInt3932 && local13 <= local40.anInt3935 && local18 <= local54 && local18 >= local70) {
			local40.aClass32_2.aClass177_1.method4209(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static295.anInt5507 - 1; local158 > 0 && local18 > local46[local158].method6594(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].method6594(local6, local13)) {
			this.method4336();
		} else if (local158 == Static295.anInt5507 - 1 && local46[local158].method6594(local6, local13) - local18 > 0x8 << Static62.anInt1705) {
			this.method4336();
		} else {
			@Pc(211) Class101 local211 = Static409.aClass101ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static409.aClass101ArrayArrayArray3[0][local6][local13] = new Class101(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static409.aClass101ArrayArrayArray3[0][local6][local13].aClass101_1 != null;
				if (local158 == 3 && local243) {
					this.method4336();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static409.aClass101ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static409.aClass101ArrayArrayArray3[local253][local6][local13] = new Class101(local253, local6, local13);
						if (local243) {
							local211.aByte43++;
						}
					}
				}
			}
			if (local211.aClass32_1 == null) {
				local211.aClass32_1 = new Class32();
				local211.aByte39 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte39 != (byte) (arg0 & 0xFFL)) {
				local211.aClass32_1.aClass177_1.method4205();
				local211.aClass32_1.aBoolean94 = false;
				local211.aByte39 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass32_1.aClass177_1.method4209(this);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V")
	public void method4338(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort71 = (short) (this.aShort71 - arg1);
		if (this.aShort71 <= 0) {
			this.method4336();
			return;
		}
		@Pc(17) int local17 = super.anInt5158 >> Static206.anInt3842;
		@Pc(22) int local22 = super.anInt5150 >> Static206.anInt3842;
		@Pc(27) int local27 = super.anInt5154 >> Static206.anInt3842;
		@Pc(31) Class57_Sub4 local31 = this.aClass57_Sub8_1.aClass57_Sub4_5;
		@Pc(35) Class188 local35 = this.aClass57_Sub8_1.aClass188_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5259 != 0) {
			if (this.aShort66 - this.aShort71 <= local35.anInt5247) {
				local65 = (super.anInt5149 >> 8 & 0xFF00) + (this.anInt5159 >> 16 & 0xFF) + local35.anInt5217 * arg1;
				local82 = (super.anInt5149 & 0xFF00) + (this.anInt5159 >> 8 & 0xFF) + local35.anInt5248 * arg1;
				local99 = ((super.anInt5149 & 0xFF) << 8) + (this.anInt5159 & 0xFF) + local35.anInt5260 * arg1;
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
				super.anInt5149 &= 0xFF000000;
				super.anInt5149 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5159 &= 0xFF000000;
				this.anInt5159 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort66 - this.aShort71 <= local35.anInt5222) {
				local65 = (super.anInt5149 >> 16 & 0xFF00) + (this.anInt5159 >> 24 & 0xFF) + local35.anInt5238 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5149 &= 0xFFFFFF;
				super.anInt5149 |= (local65 & 0xFF00) << 16;
				this.anInt5159 &= 0xFFFFFF;
				this.anInt5159 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5223 != -1 && this.aShort66 - this.aShort71 <= local35.anInt5251) {
			this.anInt5160 += local35.anInt5239 * arg1;
		}
		if (local35.anInt5228 != -1 && this.aShort66 - this.aShort71 <= local35.anInt5255) {
			super.anInt5153 += local35.anInt5240 * arg1;
		}
		local65 = this.aShort68;
		local82 = this.aShort67;
		local99 = this.aShort69;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5263 == 1) {
			local313 = local17 - this.aClass57_Sub8_1.anInt6462;
			local319 = local22 - this.aClass57_Sub8_1.anInt6449;
			local325 = local27 - this.aClass57_Sub8_1.anInt6447;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5265 * local340 * arg1;
			this.anInt5160 = (int) ((long) this.anInt5160 - ((long) this.anInt5160 * local348 >> 18));
		} else if (local35.anInt5263 == 2) {
			local313 = local17 - this.aClass57_Sub8_1.anInt6462;
			local319 = local22 - this.aClass57_Sub8_1.anInt6449;
			local325 = local27 - this.aClass57_Sub8_1.anInt6447;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5265 * local340 * arg1;
			this.anInt5160 = (int) ((long) this.anInt5160 - ((long) this.anInt5160 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray352 != null) {
			@Pc(426) Class6 local426 = local31.aClass244_18.aClass6_220;
			for (@Pc(429) Class6 local429 = local426.aClass6_252; local429 != local426; local429 = local429.aClass6_252) {
				@Pc(433) Class6_Sub2_Sub6 local433 = (Class6_Sub2_Sub6) local429;
				@Pc(436) Class49 local436 = local433.aClass49_1;
				if (local436.anInt1828 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray352.length; local444++) {
						if (local35.anIntArray352[local444] == local436.anInt1834) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3692;
						@Pc(473) int local473 = local22 - local433.anInt3689;
						local478 = local27 - local433.anInt3690;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong61) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3687 + local473 * local436.anInt1824 + local478 * local433.anInt3686) * 65535L / (long) (local436.anInt1823 * local501);
							if (local529 >= (long) local436.anInt1827) {
								local537 = 0;
								if (local436.anInt1821 == 1) {
									local537 = (local501 >> 4) * local436.anInt1822;
								} else if (local436.anInt1821 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt1822;
								}
								if (local436.anInt1820 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt1823;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt1823;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt1823;
									if (local436.anInt1826 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5158 += local643 * arg1 >> 15;
										super.anInt5150 += local652 * arg1 >> 15;
										super.anInt5154 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt1826 == 0) {
									local65 += (local433.anInt3687 - local537) * arg1;
									local82 += (local436.anInt1824 - local537) * arg1;
									local99 += (local433.anInt3686 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5158 += (local433.anInt3687 - local537) * arg1;
									super.anInt5150 += (local436.anInt1824 - local537) * arg1;
									super.anInt5154 += (local433.anInt3686 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray351 != null) {
			for (local313 = 0; local313 < local35.anIntArray351.length; local313++) {
				@Pc(743) Class6_Sub2_Sub6 local743 = (Class6_Sub2_Sub6) Static431.aClass102_1.method2604((long) local35.anIntArray351[local313]);
				while (local743 != null) {
					@Pc(747) Class49 local747 = local743.aClass49_1;
					local340 = local17 - local743.anInt3692;
					@Pc(757) int local757 = local22 - local743.anInt3689;
					local444 = local27 - local743.anInt3690;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong61) {
						local743 = (Class6_Sub2_Sub6) Static431.aClass102_1.method2602();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3687 + local757 * local747.anInt1824 + local444 * local743.anInt3686) * 65535L / (long) (local747.anInt1823 * local478);
						if (local491 < (long) local747.anInt1827) {
							local743 = (Class6_Sub2_Sub6) Static431.aClass102_1.method2602();
						} else {
							local501 = 0;
							if (local747.anInt1821 == 1) {
								local501 = (local478 >> 4) * local747.anInt1822;
							} else if (local747.anInt1821 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt1822;
							}
							if (local747.anInt1820 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt1823;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt1823;
								local537 = (local444 << 15) / local478 * local747.anInt1823;
								if (local747.anInt1826 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5158 += local939 * arg1 >> 15;
									super.anInt5150 += local948 * arg1 >> 15;
									super.anInt5154 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt1826 == 0) {
								local65 += (local743.anInt3687 - local501) * arg1;
								local82 += (local747.anInt1824 - local501) * arg1;
								local99 += (local743.anInt3686 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5158 += (local743.anInt3687 - local501) * arg1;
								super.anInt5150 += (local747.anInt1824 - local501) * arg1;
								super.anInt5154 += (local743.anInt3686 - local501) * arg1;
							}
							local743 = (Class6_Sub2_Sub6) Static431.aClass102_1.method2602();
						}
					}
				}
			}
		}
		if (local35.anIntArray354 != null) {
			if (local35.anIntArray353 == null) {
				local35.anIntArray353 = new int[local35.anIntArray354.length];
				for (local313 = 0; local313 < local35.anIntArray354.length; local313++) {
					Static92.method1653(local35.anIntArray354[local313]);
					local35.anIntArray353[local313] = ((Class6_Sub39) Static81.aClass74_10.method1883((long) local35.anIntArray354[local313])).anInt6429;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray353.length; local313++) {
				@Pc(1082) Class49 local1082 = Static276.aClass49Array1[local35.anIntArray353[local313]];
				if (local1082.anInt1826 == 0) {
					local65 += local1082.anInt1830 * arg1;
					local82 += local1082.anInt1824 * arg1;
					local99 += local1082.anInt1832 * arg1;
					local303 = true;
				} else {
					super.anInt5158 += local1082.anInt1830 * arg1;
					super.anInt5150 += local1082.anInt1824 * arg1;
					super.anInt5154 += local1082.anInt1832 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort68 = (short) local65;
					this.aShort67 = (short) local82;
					this.aShort69 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5160 <<= 0x1;
			}
		}
		super.anInt5158 = (int) ((long) super.anInt5158 + ((long) this.aShort68 * (long) this.anInt5160 >> 23) * (long) arg1);
		super.anInt5150 = (int) ((long) super.anInt5150 + ((long) this.aShort67 * (long) this.anInt5160 >> 23) * (long) arg1);
		super.anInt5154 = (int) ((long) super.anInt5154 + ((long) this.aShort69 * (long) this.anInt5160 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!sl;IIIIIIIIIIIZZ)V")
	public void method4339(@OriginalArg(0) Class57_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass57_Sub8_1 = arg0;
		super.anInt5158 = arg1 << Static206.anInt3842;
		super.anInt5150 = arg2 << Static206.anInt3842;
		super.anInt5154 = arg3 << Static206.anInt3842;
		super.anInt5149 = arg9;
		this.aShort66 = this.aShort71 = (short) arg8;
		super.anInt5153 = arg10;
		super.anInt5157 = arg11;
		super.aBoolean321 = arg13;
		this.aShort68 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort69 = (short) arg6;
		this.anInt5160 = arg7;
		super.aByte67 = this.aClass57_Sub8_1.aClass119_2.aByte52;
		this.method4335();
	}
}

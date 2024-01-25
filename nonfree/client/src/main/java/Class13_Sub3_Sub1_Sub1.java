import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class13_Sub3_Sub1_Sub1 extends Class13_Sub3_Sub1 {

	@OriginalMember(owner = "client!u", name = "M", descriptor = "I")
	private int anInt6874;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "S")
	private short aShort210;

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Lclient!pp;")
	private Class13_Sub4 aClass13_Sub4_1;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "S")
	private short aShort207;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "S")
	private short aShort206;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "S")
	private short aShort205;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "S")
	private short aShort208;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "S")
	private short aShort209;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "I")
	private int anInt6873;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!pp;IIIIIIIIIIIZZ)V")
	public Class13_Sub3_Sub1_Sub1(@OriginalArg(0) Class13_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass13_Sub4_1 = arg0;
		super.anInt6869 = arg1 << Static258.anInt7460;
		super.anInt6863 = arg2 << Static258.anInt7460;
		super.anInt6868 = arg3 << Static258.anInt7460;
		super.anInt6870 = arg9;
		this.aShort206 = this.aShort207 = (short) arg8;
		super.anInt6864 = arg10;
		super.anInt6867 = arg11;
		super.aBoolean480 = arg13;
		this.aShort205 = (short) arg4;
		this.aShort208 = (short) arg5;
		this.aShort209 = (short) arg6;
		this.anInt6873 = arg7;
		super.aByte97 = this.aClass13_Sub4_1.aClass209_1.aByte87;
		this.method5348();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!pp;IIIIIIIIIIIZZ)V")
	public void method5346(@OriginalArg(0) Class13_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass13_Sub4_1 = arg0;
		super.anInt6869 = arg1 << Static258.anInt7460;
		super.anInt6863 = arg2 << Static258.anInt7460;
		super.anInt6868 = arg3 << Static258.anInt7460;
		super.anInt6870 = arg9;
		this.aShort206 = this.aShort207 = (short) arg8;
		super.anInt6864 = arg10;
		super.anInt6867 = arg11;
		super.aBoolean480 = arg13;
		this.aShort205 = (short) arg4;
		this.aShort208 = (short) arg5;
		this.aShort209 = (short) arg6;
		this.anInt6873 = arg7;
		super.aByte97 = this.aClass13_Sub4_1.aClass209_1.aByte87;
		this.method5348();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	private void method5347() {
		this.aClass13_Sub4_1.aClass13_Sub8_5.aClass13_Sub3_Sub1_Sub1Array2[this.aShort210] = null;
		Static263.aClass13_Sub3_Sub1_Sub1Array1[Static118.anInt2604] = this;
		Static118.anInt2604 = Static118.anInt2604 + 1 & 0x3FF;
		this.method5934();
		this.method5342();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()V")
	private void method5348() {
		@Pc(4) int local4 = this.aClass13_Sub4_1.aClass13_Sub8_5.anInt7566;
		if (this.aClass13_Sub4_1.aClass13_Sub8_5.aClass13_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass13_Sub4_1.aClass13_Sub8_5.aClass13_Sub3_Sub1_Sub1Array2[local4].method5347();
		}
		this.aClass13_Sub4_1.aClass13_Sub8_5.aClass13_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort210 = (short) this.aClass13_Sub4_1.aClass13_Sub8_5.anInt7566;
		this.aClass13_Sub4_1.aClass13_Sub8_5.anInt7566 = local4 + 1 & 0x1FFF;
		this.aClass13_Sub4_1.aClass40_5.method1190(this);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(JI)V")
	public void method5349(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort207 = (short) (this.aShort207 - arg1);
		if (this.aShort207 <= 0) {
			this.method5347();
			return;
		}
		@Pc(17) int local17 = super.anInt6869 >> Static258.anInt7460;
		@Pc(22) int local22 = super.anInt6863 >> Static258.anInt7460;
		@Pc(27) int local27 = super.anInt6868 >> Static258.anInt7460;
		@Pc(31) Class13_Sub8 local31 = this.aClass13_Sub4_1.aClass13_Sub8_5;
		@Pc(35) Class230 local35 = this.aClass13_Sub4_1.aClass230_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6803 != 0) {
			if (this.aShort206 - this.aShort207 <= local35.anInt6821) {
				local65 = (super.anInt6870 >> 8 & 0xFF00) + (this.anInt6874 >> 16 & 0xFF) + local35.anInt6809 * arg1;
				local82 = (super.anInt6870 & 0xFF00) + (this.anInt6874 >> 8 & 0xFF) + local35.anInt6800 * arg1;
				local99 = ((super.anInt6870 & 0xFF) << 8) + (this.anInt6874 & 0xFF) + local35.anInt6805 * arg1;
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
				super.anInt6870 &= 0xFF000000;
				super.anInt6870 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6874 &= 0xFF000000;
				this.anInt6874 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort206 - this.aShort207 <= local35.anInt6851) {
				local65 = (super.anInt6870 >> 16 & 0xFF00) + (this.anInt6874 >> 24 & 0xFF) + local35.anInt6838 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6870 &= 0xFFFFFF;
				super.anInt6870 |= (local65 & 0xFF00) << 16;
				this.anInt6874 &= 0xFFFFFF;
				this.anInt6874 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6804 != -1 && this.aShort206 - this.aShort207 <= local35.anInt6802) {
			this.anInt6873 += local35.anInt6799 * arg1;
		}
		if (local35.anInt6827 != -1 && this.aShort206 - this.aShort207 <= local35.anInt6798) {
			super.anInt6864 += local35.anInt6828 * arg1;
		}
		local65 = this.aShort205;
		local82 = this.aShort208;
		local99 = this.aShort209;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6818 == 1) {
			local313 = local17 - this.aClass13_Sub4_1.anInt5668;
			local319 = local22 - this.aClass13_Sub4_1.anInt5662;
			local325 = local27 - this.aClass13_Sub4_1.anInt5675;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6810 * local340 * arg1;
			this.anInt6873 = (int) ((long) this.anInt6873 - ((long) this.anInt6873 * local348 >> 18));
		} else if (local35.anInt6818 == 2) {
			local313 = local17 - this.aClass13_Sub4_1.anInt5668;
			local319 = local22 - this.aClass13_Sub4_1.anInt5662;
			local325 = local27 - this.aClass13_Sub4_1.anInt5675;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6810 * local340 * arg1;
			this.anInt6873 = (int) ((long) this.anInt6873 - ((long) this.anInt6873 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray489 != null) {
			@Pc(426) Class3 local426 = local31.aClass229_49.aClass3_233;
			for (@Pc(429) Class3 local429 = local426.aClass3_261; local429 != local426; local429 = local429.aClass3_261) {
				@Pc(433) Class3_Sub3_Sub10 local433 = (Class3_Sub3_Sub10) local429;
				@Pc(436) Class115 local436 = local433.aClass115_1;
				if (local436.anInt3689 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray489.length; local444++) {
						if (local35.anIntArray489[local444] == local436.anInt3699) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3260;
						@Pc(473) int local473 = local22 - local433.anInt3261;
						local478 = local27 - local433.anInt3258;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong114) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3262 + local473 * local436.anInt3695 + local478 * local433.anInt3256) * 65535L / (long) (local436.anInt3681 * local501);
							if (local529 >= (long) local436.anInt3697) {
								local537 = 0;
								if (local436.anInt3694 == 1) {
									local537 = (local501 >> 4) * local436.anInt3691;
								} else if (local436.anInt3694 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3691;
								}
								if (local436.anInt3690 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3681;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3681;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3681;
									if (local436.anInt3683 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6869 += local643 * arg1 >> 15;
										super.anInt6863 += local652 * arg1 >> 15;
										super.anInt6868 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3683 == 0) {
									local65 += (local433.anInt3262 - local537) * arg1;
									local82 += (local436.anInt3695 - local537) * arg1;
									local99 += (local433.anInt3256 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6869 += (local433.anInt3262 - local537) * arg1;
									super.anInt6863 += (local436.anInt3695 - local537) * arg1;
									super.anInt6868 += (local433.anInt3256 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray492 != null) {
			for (local313 = 0; local313 < local35.anIntArray492.length; local313++) {
				@Pc(743) Class3_Sub3_Sub10 local743 = (Class3_Sub3_Sub10) Static22.aClass135_1.method3430((long) local35.anIntArray492[local313]);
				while (local743 != null) {
					@Pc(747) Class115 local747 = local743.aClass115_1;
					local340 = local17 - local743.anInt3260;
					@Pc(757) int local757 = local22 - local743.anInt3261;
					local444 = local27 - local743.anInt3258;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong114) {
						local743 = (Class3_Sub3_Sub10) Static22.aClass135_1.method3429();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3262 + local757 * local747.anInt3695 + local444 * local743.anInt3256) * 65535L / (long) (local747.anInt3681 * local478);
						if (local491 < (long) local747.anInt3697) {
							local743 = (Class3_Sub3_Sub10) Static22.aClass135_1.method3429();
						} else {
							local501 = 0;
							if (local747.anInt3694 == 1) {
								local501 = (local478 >> 4) * local747.anInt3691;
							} else if (local747.anInt3694 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3691;
							}
							if (local747.anInt3690 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3681;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3681;
								local537 = (local444 << 15) / local478 * local747.anInt3681;
								if (local747.anInt3683 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6869 += local939 * arg1 >> 15;
									super.anInt6863 += local948 * arg1 >> 15;
									super.anInt6868 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3683 == 0) {
								local65 += (local743.anInt3262 - local501) * arg1;
								local82 += (local747.anInt3695 - local501) * arg1;
								local99 += (local743.anInt3256 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6869 += (local743.anInt3262 - local501) * arg1;
								super.anInt6863 += (local747.anInt3695 - local501) * arg1;
								super.anInt6868 += (local743.anInt3256 - local501) * arg1;
							}
							local743 = (Class3_Sub3_Sub10) Static22.aClass135_1.method3429();
						}
					}
				}
			}
		}
		if (local35.anIntArray491 != null) {
			if (local35.anIntArray490 == null) {
				local35.anIntArray490 = new int[local35.anIntArray491.length];
				for (local313 = 0; local313 < local35.anIntArray491.length; local313++) {
					Static142.method2553(local35.anIntArray491[local313]);
					local35.anIntArray490[local313] = ((Class3_Sub25) Static157.aClass127_17.method3246((long) local35.anIntArray491[local313])).anInt4134;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray490.length; local313++) {
				@Pc(1082) Class115 local1082 = Static286.aClass115Array9[local35.anIntArray490[local313]];
				if (local1082.anInt3683 == 0) {
					local65 += local1082.anInt3686 * arg1;
					local82 += local1082.anInt3695 * arg1;
					local99 += local1082.anInt3679 * arg1;
					local303 = true;
				} else {
					super.anInt6869 += local1082.anInt3686 * arg1;
					super.anInt6863 += local1082.anInt3695 * arg1;
					super.anInt6868 += local1082.anInt3679 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort205 = (short) local65;
					this.aShort208 = (short) local82;
					this.aShort209 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6873 <<= 0x1;
			}
		}
		super.anInt6869 = (int) ((long) super.anInt6869 + ((long) this.aShort205 * (long) this.anInt6873 >> 23) * (long) arg1);
		super.anInt6863 = (int) ((long) super.anInt6863 + ((long) this.aShort208 * (long) this.anInt6873 >> 23) * (long) arg1);
		super.anInt6868 = (int) ((long) super.anInt6868 + ((long) this.aShort209 * (long) this.anInt6873 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)V")
	public void method5350(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt6869 >> Static287.anInt5248 + 12;
		@Pc(13) int local13 = super.anInt6868 >> Static287.anInt5248 + 12;
		@Pc(18) int local18 = super.anInt6863 >> Static258.anInt7460;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static177.anInt3621 || local13 < 0 || local13 >= Static57.anInt1411) {
			this.method5347();
			return;
		}
		@Pc(40) Class13_Sub8 local40 = this.aClass13_Sub4_1.aClass13_Sub8_5;
		@Pc(44) Class230 local44 = this.aClass13_Sub4_1.aClass230_1;
		@Pc(46) Class64[] local46 = Static120.aClass64Array1;
		@Pc(54) int local54 = local46[local40.anInt7569].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt7569 < Static281.anInt5169 - 1) {
			local70 = local46[local40.anInt7569 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static287.anInt5248);
		}
		if (local44.aBoolean477) {
			if (local44.anInt6819 == -1 && local18 > local54) {
				this.method5347();
				return;
			}
			if (local44.anInt6819 >= 0 && local18 > local46[local44.anInt6819].I(local6, local13)) {
				this.method5347();
				return;
			}
			if (local44.anInt6826 == -1 && local18 < local70) {
				this.method5347();
				return;
			}
			if (local44.anInt6826 >= 0 && local18 < local46[local44.anInt6826 + 1].I(local6, local13)) {
				this.method5347();
				return;
			}
		}
		if (local6 >= local40.anInt7573 && local6 <= local40.anInt7568 && local13 >= local40.anInt7571 && local13 <= local40.anInt7570 && local18 <= local54 && local18 >= local70) {
			local40.aClass116_2.aClass236_1.method5460(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static281.anInt5169 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method5347();
		} else if (local158 == Static281.anInt5169 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static287.anInt5248) {
			this.method5347();
		} else {
			@Pc(211) Class217 local211 = Static151.aClass217ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static151.aClass217ArrayArrayArray3[0][local6][local13] = new Class217(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static151.aClass217ArrayArrayArray3[0][local6][local13].aClass217_1 != null;
				if (local158 == 3 && local243) {
					this.method5347();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static151.aClass217ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static151.aClass217ArrayArrayArray3[local253][local6][local13] = new Class217(local253, local6, local13);
						if (local243) {
							local211.aByte93++;
						}
					}
				}
			}
			if (local211.aClass116_1 == null) {
				local211.aClass116_1 = new Class116();
				local211.aByte92 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte92 != (byte) (arg0 & 0xFFL)) {
				local211.aClass116_1.aClass236_1.method5463();
				local211.aClass116_1.aBoolean289 = false;
				local211.aByte92 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass116_1.aClass236_1.method5460(this);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class4_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!qv", name = "T", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!qv", name = "Y", descriptor = "I")
	private int anInt5825;

	@OriginalMember(owner = "client!qv", name = "S", descriptor = "Lclient!ll;")
	private Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!qv", name = "W", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!qv", name = "Z", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!qv", name = "R", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!qv", name = "V", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!qv", name = "U", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!qv", name = "X", descriptor = "I")
	private int anInt5824;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ll;IIIIIIIIIIIZZ)V")
	public Class4_Sub1_Sub2_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub3_1 = arg0;
		super.anInt5820 = arg1 << 12;
		super.anInt5823 = arg2 << 12;
		super.anInt5814 = arg3 << 12;
		super.anInt5822 = arg9;
		this.aShort104 = this.aShort103 = (short) arg8;
		super.anInt5819 = arg10;
		super.anInt5816 = arg11;
		super.aBoolean664 = arg13;
		this.aShort99 = (short) arg4;
		this.aShort102 = (short) arg5;
		this.aShort101 = (short) arg6;
		this.anInt5824 = arg7;
		super.aByte96 = this.aClass4_Sub3_1.aClass229_1.aByte99;
		this.method4564();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(J)V")
	public void method4562(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt5820 >> Static215.anInt4460 + 12;
		@Pc(13) int local13 = super.anInt5814 >> Static215.anInt4460 + 12;
		@Pc(18) int local18 = super.anInt5823 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static37.anInt666 || local13 < 0 || local13 >= Static408.anInt6716) {
			this.method4563();
			return;
		}
		@Pc(40) Class4_Sub2 local40 = this.aClass4_Sub3_1.aClass4_Sub2_4;
		@Pc(44) Class73 local44 = this.aClass4_Sub3_1.aClass73_1;
		@Pc(46) Class157[] local46 = Static94.aClass157Array1;
		@Pc(54) int local54 = local46[local40.anInt1400].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt1400 < Static105.anInt1943 - 1) {
			local70 = local46[local40.anInt1400 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static215.anInt4460);
		}
		if (local44.aBoolean221) {
			if (local44.anInt1872 == -1 && local18 > local54) {
				this.method4563();
				return;
			}
			if (local44.anInt1872 >= 0 && local18 > local46[local44.anInt1872].ua(local6, local13)) {
				this.method4563();
				return;
			}
			if (local44.anInt1861 == -1 && local18 < local70) {
				this.method4563();
				return;
			}
			if (local44.anInt1861 >= 0 && local18 < local46[local44.anInt1861 + 1].ua(local6, local13)) {
				this.method4563();
				return;
			}
		}
		if (local6 >= local40.anInt1402 && local6 <= local40.anInt1399 && local13 >= local40.anInt1401 && local13 <= local40.anInt1403 && local18 <= local54 && local18 >= local70) {
			local40.aClass71_1.aClass95_1.method2139(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static105.anInt1943 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method4563();
		} else if (local158 == Static105.anInt1943 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static215.anInt4460) {
			this.method4563();
		} else {
			@Pc(211) Class169 local211 = Static359.aClass169ArrayArrayArray5[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static359.aClass169ArrayArrayArray5[0][local6][local13] = new Class169(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static359.aClass169ArrayArrayArray5[0][local6][local13].aClass169_1 != null;
				if (local158 == 3 && local243) {
					this.method4563();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static359.aClass169ArrayArrayArray5[local253][local6][local13] == null) {
						local211 = Static359.aClass169ArrayArrayArray5[local253][local6][local13] = new Class169(local253, local6, local13);
						if (local243) {
							local211.aByte81++;
						}
					}
				}
			}
			if (local211.aClass71_2 == null) {
				local211.aClass71_2 = new Class71();
				local211.aByte84 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte84 != (byte) (arg0 & 0xFFL)) {
				local211.aClass71_2.aClass95_1.method2136();
				local211.aClass71_2.aBoolean218 = false;
				local211.aByte84 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass71_2.aClass95_1.method2139(this);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "()V")
	private void method4563() {
		this.aClass4_Sub3_1.aClass4_Sub2_4.aClass4_Sub1_Sub2_Sub1Array1[this.aShort100] = null;
		Static392.aClass4_Sub1_Sub2_Sub1Array2[Static342.anInt5862] = this;
		Static342.anInt5862 = Static342.anInt5862 + 1 & 0x3FF;
		this.method5572();
		this.method4555();
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "()V")
	private void method4564() {
		@Pc(4) int local4 = this.aClass4_Sub3_1.aClass4_Sub2_4.anInt1396;
		if (this.aClass4_Sub3_1.aClass4_Sub2_4.aClass4_Sub1_Sub2_Sub1Array1[local4] != null) {
			this.aClass4_Sub3_1.aClass4_Sub2_4.aClass4_Sub1_Sub2_Sub1Array1[local4].method4563();
		}
		this.aClass4_Sub3_1.aClass4_Sub2_4.aClass4_Sub1_Sub2_Sub1Array1[local4] = this;
		this.aShort100 = (short) this.aClass4_Sub3_1.aClass4_Sub2_4.anInt1396;
		this.aClass4_Sub3_1.aClass4_Sub2_4.anInt1396 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub3_1.aClass262_9.method5815(this);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(JI)V")
	public void method4565(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort103 = (short) (this.aShort103 - arg1);
		if (this.aShort103 <= 0) {
			this.method4563();
			return;
		}
		@Pc(17) int local17 = super.anInt5820 >> 12;
		@Pc(22) int local22 = super.anInt5823 >> 12;
		@Pc(27) int local27 = super.anInt5814 >> 12;
		@Pc(31) Class4_Sub2 local31 = this.aClass4_Sub3_1.aClass4_Sub2_4;
		@Pc(35) Class73 local35 = this.aClass4_Sub3_1.aClass73_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1900 != 0) {
			if (this.aShort104 - this.aShort103 <= local35.anInt1910) {
				local65 = (super.anInt5822 >> 8 & 0xFF00) + (this.anInt5825 >> 16 & 0xFF) + local35.anInt1871 * arg1;
				local82 = (super.anInt5822 & 0xFF00) + (this.anInt5825 >> 8 & 0xFF) + local35.anInt1901 * arg1;
				local99 = ((super.anInt5822 & 0xFF) << 8) + (this.anInt5825 & 0xFF) + local35.anInt1907 * arg1;
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
				super.anInt5822 &= 0xFF000000;
				super.anInt5822 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5825 &= 0xFF000000;
				this.anInt5825 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort104 - this.aShort103 <= local35.anInt1906) {
				local65 = (super.anInt5822 >> 16 & 0xFF00) + (this.anInt5825 >> 24 & 0xFF) + local35.anInt1908 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5822 &= 0xFFFFFF;
				super.anInt5822 |= (local65 & 0xFF00) << 16;
				this.anInt5825 &= 0xFFFFFF;
				this.anInt5825 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1866 != -1 && this.aShort104 - this.aShort103 <= local35.anInt1868) {
			this.anInt5824 += local35.anInt1862 * arg1;
		}
		if (local35.anInt1895 != -1 && this.aShort104 - this.aShort103 <= local35.anInt1859) {
			super.anInt5819 += local35.anInt1863 * arg1;
		}
		local65 = this.aShort99;
		local82 = this.aShort102;
		local99 = this.aShort101;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt1877 == 1) {
			local313 = local17 - this.aClass4_Sub3_1.anInt4138;
			local319 = local22 - this.aClass4_Sub3_1.anInt4135;
			local325 = local27 - this.aClass4_Sub3_1.anInt4126;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt1888 * local340 * arg1;
			this.anInt5824 = (int) ((long) this.anInt5824 - ((long) this.anInt5824 * local348 >> 18));
		} else if (local35.anInt1877 == 2) {
			local313 = local17 - this.aClass4_Sub3_1.anInt4138;
			local319 = local22 - this.aClass4_Sub3_1.anInt4135;
			local325 = local27 - this.aClass4_Sub3_1.anInt4126;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt1888 * local340 * arg1;
			this.anInt5824 = (int) ((long) this.anInt5824 - ((long) this.anInt5824 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray131 != null) {
			@Pc(426) Class1 local426 = local31.aClass227_6.aClass1_225;
			for (@Pc(429) Class1 local429 = local426.aClass1_261; local429 != local426; local429 = local429.aClass1_261) {
				@Pc(433) Class1_Sub5_Sub13 local433 = (Class1_Sub5_Sub13) local429;
				@Pc(436) Class139 local436 = local433.aClass139_1;
				if (local436.anInt3989 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray131.length; local444++) {
						if (local35.anIntArray131[local444] == local436.anInt3987) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4684;
						@Pc(473) int local473 = local22 - local433.anInt4685;
						local478 = local27 - local433.anInt4683;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong128) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4681 + local473 * local436.anInt3983 + local478 * local433.anInt4679) * 65535L / (long) (local436.anInt3985 * local501);
							if (local529 >= (long) local436.anInt3990) {
								local537 = 0;
								if (local436.anInt3993 == 1) {
									local537 = (local501 >> 4) * local436.anInt3992;
								} else if (local436.anInt3993 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3992;
								}
								if (local436.anInt3988 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3985;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3985;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3985;
									if (local436.anInt3986 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5820 += local643 * arg1 >> 15;
										super.anInt5823 += local652 * arg1 >> 15;
										super.anInt5814 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3986 == 0) {
									local65 += (local433.anInt4681 - local537) * arg1;
									local82 += (local436.anInt3983 - local537) * arg1;
									local99 += (local433.anInt4679 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5820 += (local433.anInt4681 - local537) * arg1;
									super.anInt5823 += (local436.anInt3983 - local537) * arg1;
									super.anInt5814 += (local433.anInt4679 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray133 != null) {
			for (local313 = 0; local313 < local35.anIntArray133.length; local313++) {
				@Pc(743) Class1_Sub5_Sub13 local743 = (Class1_Sub5_Sub13) Static331.aClass33_1.method620((long) local35.anIntArray133[local313]);
				while (local743 != null) {
					@Pc(747) Class139 local747 = local743.aClass139_1;
					local340 = local17 - local743.anInt4684;
					@Pc(757) int local757 = local22 - local743.anInt4685;
					local444 = local27 - local743.anInt4683;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong128) {
						local743 = (Class1_Sub5_Sub13) Static331.aClass33_1.method618();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4681 + local757 * local747.anInt3983 + local444 * local743.anInt4679) * 65535L / (long) (local747.anInt3985 * local478);
						if (local491 < (long) local747.anInt3990) {
							local743 = (Class1_Sub5_Sub13) Static331.aClass33_1.method618();
						} else {
							local501 = 0;
							if (local747.anInt3993 == 1) {
								local501 = (local478 >> 4) * local747.anInt3992;
							} else if (local747.anInt3993 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3992;
							}
							if (local747.anInt3988 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3985;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3985;
								local537 = (local444 << 15) / local478 * local747.anInt3985;
								if (local747.anInt3986 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5820 += local939 * arg1 >> 15;
									super.anInt5823 += local948 * arg1 >> 15;
									super.anInt5814 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3986 == 0) {
								local65 += (local743.anInt4681 - local501) * arg1;
								local82 += (local747.anInt3983 - local501) * arg1;
								local99 += (local743.anInt4679 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5820 += (local743.anInt4681 - local501) * arg1;
								super.anInt5823 += (local747.anInt3983 - local501) * arg1;
								super.anInt5814 += (local743.anInt4679 - local501) * arg1;
							}
							local743 = (Class1_Sub5_Sub13) Static331.aClass33_1.method618();
						}
					}
				}
			}
		}
		if (local35.anIntArray132 != null) {
			if (local35.anIntArray130 == null) {
				local35.anIntArray130 = new int[local35.anIntArray132.length];
				for (local313 = 0; local313 < local35.anIntArray132.length; local313++) {
					Static300.method4099(local35.anIntArray132[local313]);
					local35.anIntArray130[local313] = ((Class1_Sub26) Static103.aClass199_59.method4387((long) local35.anIntArray132[local313])).anInt3459;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray130.length; local313++) {
				@Pc(1082) Class139 local1082 = Static67.aClass139Array1[local35.anIntArray130[local313]];
				if (local1082.anInt3986 == 0) {
					local65 += local1082.anInt3995 * arg1;
					local82 += local1082.anInt3983 * arg1;
					local99 += local1082.anInt3979 * arg1;
					local303 = true;
				} else {
					super.anInt5820 += local1082.anInt3995 * arg1;
					super.anInt5823 += local1082.anInt3983 * arg1;
					super.anInt5814 += local1082.anInt3979 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort99 = (short) local65;
					this.aShort102 = (short) local82;
					this.aShort101 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5824 <<= 0x1;
			}
		}
		super.anInt5820 = (int) ((long) super.anInt5820 + ((long) this.aShort99 * (long) this.anInt5824 >> 23) * (long) arg1);
		super.anInt5823 = (int) ((long) super.anInt5823 + ((long) this.aShort102 * (long) this.anInt5824 >> 23) * (long) arg1);
		super.anInt5814 = (int) ((long) super.anInt5814 + ((long) this.aShort101 * (long) this.anInt5824 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ll;IIIIIIIIIIIZZ)V")
	public void method4566(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub3_1 = arg0;
		super.anInt5820 = arg1 << 12;
		super.anInt5823 = arg2 << 12;
		super.anInt5814 = arg3 << 12;
		super.anInt5822 = arg9;
		this.aShort104 = this.aShort103 = (short) arg8;
		super.anInt5819 = arg10;
		super.anInt5816 = arg11;
		super.aBoolean664 = arg13;
		this.aShort99 = (short) arg4;
		this.aShort102 = (short) arg5;
		this.aShort101 = (short) arg6;
		this.anInt5824 = arg7;
		super.aByte96 = this.aClass4_Sub3_1.aClass229_1.aByte99;
		this.method4564();
	}
}

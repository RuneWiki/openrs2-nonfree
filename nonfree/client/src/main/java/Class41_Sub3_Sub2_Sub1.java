import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class41_Sub3_Sub2_Sub1 extends Class41_Sub3_Sub2 {

	@OriginalMember(owner = "client!os", name = "I", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "I")
	private int anInt5613;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "Lclient!ld;")
	private Class41_Sub5 aClass41_Sub5_1;

	@OriginalMember(owner = "client!os", name = "M", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	private int anInt5612;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!ld;IIIIIIIIIIIZZ)V")
	public Class41_Sub3_Sub2_Sub1(@OriginalArg(0) Class41_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub5_1 = arg0;
		super.anInt5607 = arg1 << 12;
		super.anInt5610 = arg2 << 12;
		super.anInt5606 = arg3 << 12;
		super.anInt5608 = arg9;
		this.aShort80 = this.aShort83 = (short) arg8;
		super.anInt5605 = arg10;
		super.anInt5609 = arg11;
		super.aBoolean348 = arg13;
		this.aShort84 = (short) arg4;
		this.aShort85 = (short) arg5;
		this.aShort82 = (short) arg6;
		this.anInt5612 = arg7;
		super.aByte73 = this.aClass41_Sub5_1.aClass94_2.aByte47;
		this.method4333();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
	private void method4331() {
		this.aClass41_Sub5_1.aClass41_Sub1_5.aClass41_Sub3_Sub2_Sub1Array1[this.aShort81] = null;
		Static124.aClass41_Sub3_Sub2_Sub1Array2[Static131.anInt2929] = this;
		Static131.anInt2929 = Static131.anInt2929 + 1 & 0x3FF;
		this.method5447();
		this.method4327();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(J)V")
	public void method4332(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt5607 >> Static198.anInt7947 + 12;
		@Pc(13) int local13 = super.anInt5606 >> Static198.anInt7947 + 12;
		@Pc(18) int local18 = super.anInt5610 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static216.anInt4346 || local13 < 0 || local13 >= Static198.anInt7949) {
			this.method4331();
			return;
		}
		@Pc(40) Class41_Sub1 local40 = this.aClass41_Sub5_1.aClass41_Sub1_5;
		@Pc(44) Class257 local44 = this.aClass41_Sub5_1.aClass257_1;
		@Pc(46) Class96[] local46 = Static396.aClass96Array5;
		@Pc(54) int local54 = local46[local40.anInt1159].ua(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt1159 < Static220.anInt4418 - 1) {
			local70 = local46[local40.anInt1159 + 1].ua(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static198.anInt7947);
		}
		if (local44.aBoolean489) {
			if (local44.anInt7594 == -1 && local18 > local54) {
				this.method4331();
				return;
			}
			if (local44.anInt7594 >= 0 && local18 > local46[local44.anInt7594].ua(local6, local13)) {
				this.method4331();
				return;
			}
			if (local44.anInt7561 == -1 && local18 < local70) {
				this.method4331();
				return;
			}
			if (local44.anInt7561 >= 0 && local18 < local46[local44.anInt7561 + 1].ua(local6, local13)) {
				this.method4331();
				return;
			}
		}
		if (local6 >= local40.anInt1162 && local6 <= local40.anInt1160 && local13 >= local40.anInt1161 && local13 <= local40.anInt1158 && local18 <= local54 && local18 >= local70) {
			local40.aClass51_1.aClass60_1.method1511(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static220.anInt4418 - 1; local158 > 0 && local18 > local46[local158].ua(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].ua(local6, local13)) {
			this.method4331();
		} else if (local158 == Static220.anInt4418 - 1 && local46[local158].ua(local6, local13) - local18 > 0x8 << Static198.anInt7947) {
			this.method4331();
		} else {
			@Pc(211) Class252 local211 = Static67.aClass252ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static67.aClass252ArrayArrayArray2[0][local6][local13] = new Class252(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static67.aClass252ArrayArrayArray2[0][local6][local13].aClass252_1 != null;
				if (local158 == 3 && local243) {
					this.method4331();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static67.aClass252ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static67.aClass252ArrayArrayArray2[local253][local6][local13] = new Class252(local253, local6, local13);
						if (local243) {
							local211.aByte100++;
						}
					}
				}
			}
			if (local211.aClass51_2 == null) {
				local211.aClass51_2 = new Class51();
				local211.aByte96 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte96 != (byte) (arg0 & 0xFFL)) {
				local211.aClass51_2.aClass60_1.method1508();
				local211.aClass51_2.aBoolean116 = false;
				local211.aByte96 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass51_2.aClass60_1.method1511(this);
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "()V")
	private void method4333() {
		@Pc(4) int local4 = this.aClass41_Sub5_1.aClass41_Sub1_5.anInt1156;
		if (this.aClass41_Sub5_1.aClass41_Sub1_5.aClass41_Sub3_Sub2_Sub1Array1[local4] != null) {
			this.aClass41_Sub5_1.aClass41_Sub1_5.aClass41_Sub3_Sub2_Sub1Array1[local4].method4331();
		}
		this.aClass41_Sub5_1.aClass41_Sub1_5.aClass41_Sub3_Sub2_Sub1Array1[local4] = this;
		this.aShort81 = (short) this.aClass41_Sub5_1.aClass41_Sub1_5.anInt1156;
		this.aClass41_Sub5_1.aClass41_Sub1_5.anInt1156 = local4 + 1 & 0x1FFF;
		this.aClass41_Sub5_1.aClass117_6.method2961(this);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ld;IIIIIIIIIIIZZ)V")
	public void method4334(@OriginalArg(0) Class41_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub5_1 = arg0;
		super.anInt5607 = arg1 << 12;
		super.anInt5610 = arg2 << 12;
		super.anInt5606 = arg3 << 12;
		super.anInt5608 = arg9;
		this.aShort80 = this.aShort83 = (short) arg8;
		super.anInt5605 = arg10;
		super.anInt5609 = arg11;
		super.aBoolean348 = arg13;
		this.aShort84 = (short) arg4;
		this.aShort85 = (short) arg5;
		this.aShort82 = (short) arg6;
		this.anInt5612 = arg7;
		super.aByte73 = this.aClass41_Sub5_1.aClass94_2.aByte47;
		this.method4333();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(JI)V")
	public void method4335(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort83 = (short) (this.aShort83 - arg1);
		if (this.aShort83 <= 0) {
			this.method4331();
			return;
		}
		@Pc(17) int local17 = super.anInt5607 >> 12;
		@Pc(22) int local22 = super.anInt5610 >> 12;
		@Pc(27) int local27 = super.anInt5606 >> 12;
		@Pc(31) Class41_Sub1 local31 = this.aClass41_Sub5_1.aClass41_Sub1_5;
		@Pc(35) Class257 local35 = this.aClass41_Sub5_1.aClass257_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt7574 != 0) {
			if (this.aShort80 - this.aShort83 <= local35.anInt7591) {
				local65 = (super.anInt5608 >> 8 & 0xFF00) + (this.anInt5613 >> 16 & 0xFF) + local35.anInt7600 * arg1;
				local82 = (super.anInt5608 & 0xFF00) + (this.anInt5613 >> 8 & 0xFF) + local35.anInt7603 * arg1;
				local99 = ((super.anInt5608 & 0xFF) << 8) + (this.anInt5613 & 0xFF) + local35.anInt7582 * arg1;
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
				super.anInt5608 &= 0xFF000000;
				super.anInt5608 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5613 &= 0xFF000000;
				this.anInt5613 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort80 - this.aShort83 <= local35.anInt7579) {
				local65 = (super.anInt5608 >> 16 & 0xFF00) + (this.anInt5613 >> 24 & 0xFF) + local35.anInt7604 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5608 &= 0xFFFFFF;
				super.anInt5608 |= (local65 & 0xFF00) << 16;
				this.anInt5613 &= 0xFFFFFF;
				this.anInt5613 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt7559 != -1 && this.aShort80 - this.aShort83 <= local35.anInt7566) {
			this.anInt5612 += local35.anInt7570 * arg1;
		}
		if (local35.anInt7590 != -1 && this.aShort80 - this.aShort83 <= local35.anInt7583) {
			super.anInt5605 += local35.anInt7598 * arg1;
		}
		local65 = this.aShort84;
		local82 = this.aShort85;
		local99 = this.aShort82;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt7589 == 1) {
			local313 = local17 - this.aClass41_Sub5_1.anInt4493;
			local319 = local22 - this.aClass41_Sub5_1.anInt4497;
			local325 = local27 - this.aClass41_Sub5_1.anInt4502;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt7578 * local340 * arg1;
			this.anInt5612 = (int) ((long) this.anInt5612 - ((long) this.anInt5612 * local348 >> 18));
		} else if (local35.anInt7589 == 2) {
			local313 = local17 - this.aClass41_Sub5_1.anInt4493;
			local319 = local22 - this.aClass41_Sub5_1.anInt4497;
			local325 = local27 - this.aClass41_Sub5_1.anInt4502;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt7578 * local340 * arg1;
			this.anInt5612 = (int) ((long) this.anInt5612 - ((long) this.anInt5612 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray717 != null) {
			@Pc(426) Class1 local426 = local31.aClass203_5.aClass1_195;
			for (@Pc(429) Class1 local429 = local426.aClass1_264; local429 != local426; local429 = local429.aClass1_264) {
				@Pc(433) Class1_Sub1_Sub7 local433 = (Class1_Sub1_Sub7) local429;
				@Pc(436) Class180 local436 = local433.aClass180_1;
				if (local436.anInt5342 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray717.length; local444++) {
						if (local35.anIntArray717[local444] == local436.anInt5331) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1875;
						@Pc(473) int local473 = local22 - local433.anInt1877;
						local478 = local27 - local433.anInt1871;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong144) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1872 + local473 * local436.anInt5345 + local478 * local433.anInt1873) * 65535L / (long) (local436.anInt5344 * local501);
							if (local529 >= (long) local436.anInt5346) {
								local537 = 0;
								if (local436.anInt5333 == 1) {
									local537 = (local501 >> 4) * local436.anInt5341;
								} else if (local436.anInt5333 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt5341;
								}
								if (local436.anInt5343 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt5344;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt5344;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt5344;
									if (local436.anInt5347 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5607 += local643 * arg1 >> 15;
										super.anInt5610 += local652 * arg1 >> 15;
										super.anInt5606 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt5347 == 0) {
									local65 += (local433.anInt1872 - local537) * arg1;
									local82 += (local436.anInt5345 - local537) * arg1;
									local99 += (local433.anInt1873 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5607 += (local433.anInt1872 - local537) * arg1;
									super.anInt5610 += (local436.anInt5345 - local537) * arg1;
									super.anInt5606 += (local433.anInt1873 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray715 != null) {
			for (local313 = 0; local313 < local35.anIntArray715.length; local313++) {
				@Pc(743) Class1_Sub1_Sub7 local743 = (Class1_Sub1_Sub7) Static210.aClass204_1.method4561((long) local35.anIntArray715[local313]);
				while (local743 != null) {
					@Pc(747) Class180 local747 = local743.aClass180_1;
					local340 = local17 - local743.anInt1875;
					@Pc(757) int local757 = local22 - local743.anInt1877;
					local444 = local27 - local743.anInt1871;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong144) {
						local743 = (Class1_Sub1_Sub7) Static210.aClass204_1.method4562();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1872 + local757 * local747.anInt5345 + local444 * local743.anInt1873) * 65535L / (long) (local747.anInt5344 * local478);
						if (local491 < (long) local747.anInt5346) {
							local743 = (Class1_Sub1_Sub7) Static210.aClass204_1.method4562();
						} else {
							local501 = 0;
							if (local747.anInt5333 == 1) {
								local501 = (local478 >> 4) * local747.anInt5341;
							} else if (local747.anInt5333 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt5341;
							}
							if (local747.anInt5343 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt5344;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt5344;
								local537 = (local444 << 15) / local478 * local747.anInt5344;
								if (local747.anInt5347 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5607 += local939 * arg1 >> 15;
									super.anInt5610 += local948 * arg1 >> 15;
									super.anInt5606 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt5347 == 0) {
								local65 += (local743.anInt1872 - local501) * arg1;
								local82 += (local747.anInt5345 - local501) * arg1;
								local99 += (local743.anInt1873 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5607 += (local743.anInt1872 - local501) * arg1;
								super.anInt5610 += (local747.anInt5345 - local501) * arg1;
								super.anInt5606 += (local743.anInt1873 - local501) * arg1;
							}
							local743 = (Class1_Sub1_Sub7) Static210.aClass204_1.method4562();
						}
					}
				}
			}
		}
		if (local35.anIntArray718 != null) {
			if (local35.anIntArray716 == null) {
				local35.anIntArray716 = new int[local35.anIntArray718.length];
				for (local313 = 0; local313 < local35.anIntArray718.length; local313++) {
					Static371.method5179(local35.anIntArray718[local313]);
					local35.anIntArray716[local313] = ((Class1_Sub33) Static460.aClass38_29.method765((long) local35.anIntArray718[local313])).anInt5633;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray716.length; local313++) {
				@Pc(1082) Class180 local1082 = Static391.aClass180Array1[local35.anIntArray716[local313]];
				if (local1082.anInt5347 == 0) {
					local65 += local1082.anInt5340 * arg1;
					local82 += local1082.anInt5345 * arg1;
					local99 += local1082.anInt5332 * arg1;
					local303 = true;
				} else {
					super.anInt5607 += local1082.anInt5340 * arg1;
					super.anInt5610 += local1082.anInt5345 * arg1;
					super.anInt5606 += local1082.anInt5332 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort84 = (short) local65;
					this.aShort85 = (short) local82;
					this.aShort82 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5612 <<= 0x1;
			}
		}
		super.anInt5607 = (int) ((long) super.anInt5607 + ((long) this.aShort84 * (long) this.anInt5612 >> 23) * (long) arg1);
		super.anInt5610 = (int) ((long) super.anInt5610 + ((long) this.aShort85 * (long) this.anInt5612 >> 23) * (long) arg1);
		super.anInt5606 = (int) ((long) super.anInt5606 + ((long) this.aShort82 * (long) this.anInt5612 >> 23) * (long) arg1);
	}
}

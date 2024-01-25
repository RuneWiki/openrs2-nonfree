import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class28_Sub1_Sub1_Sub1 extends Class28_Sub1_Sub1 {

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
	private int anInt4772;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "Lclient!kp;")
	private Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
	private int anInt4773;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!kp;IIIIIIIIIIIZZ)V")
	public Class28_Sub1_Sub1_Sub1(@OriginalArg(0) Class28_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub2_1 = arg0;
		super.anInt4770 = arg1 << Static13.anInt158;
		super.anInt4763 = arg2 << Static13.anInt158;
		super.anInt4765 = arg3 << Static13.anInt158;
		super.anInt4767 = arg9;
		this.aShort57 = this.aShort56 = (short) arg8;
		super.anInt4760 = arg10;
		super.anInt4771 = arg11;
		super.aBoolean300 = arg13;
		this.aShort59 = (short) arg4;
		this.aShort61 = (short) arg5;
		this.aShort58 = (short) arg6;
		this.anInt4773 = arg7;
		super.aByte49 = this.aClass28_Sub2_1.aClass167_1.aByte44;
		this.method3791();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(J)V")
	public void method3788(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt4770 >> Static168.anInt3026 + 12;
		@Pc(13) int local13 = super.anInt4765 >> Static168.anInt3026 + 12;
		@Pc(18) int local18 = super.anInt4763 >> Static13.anInt158;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static264.anInt4480 || local13 < 0 || local13 >= Static295.anInt4910) {
			this.method3789();
			return;
		}
		@Pc(40) Class28_Sub3 local40 = this.aClass28_Sub2_1.aClass28_Sub3_5;
		@Pc(44) Class49 local44 = this.aClass28_Sub2_1.aClass49_1;
		@Pc(46) Class165[] local46 = Static244.aClass165Array8;
		@Pc(54) int local54 = local46[local40.anInt3991].l(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt3991 < Static315.anInt5183 - 1) {
			local70 = local46[local40.anInt3991 + 1].l(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static168.anInt3026);
		}
		if (local44.aBoolean74) {
			if (local44.anInt1201 == -1 && local18 > local54) {
				this.method3789();
				return;
			}
			if (local44.anInt1201 >= 0 && local18 > local46[local44.anInt1201].l(local6, local13)) {
				this.method3789();
				return;
			}
			if (local44.anInt1184 == -1 && local18 < local70) {
				this.method3789();
				return;
			}
			if (local44.anInt1184 >= 0 && local18 < local46[local44.anInt1184 + 1].l(local6, local13)) {
				this.method3789();
				return;
			}
		}
		if (local6 >= local40.anInt3990 && local6 <= local40.anInt3988 && local13 >= local40.anInt3989 && local13 <= local40.anInt3987 && local18 <= local54 && local18 >= local70) {
			local40.aClass201_1.aClass232_1.method4837(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static315.anInt5183 - 1; local158 > 0 && local18 > local46[local158].l(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].l(local6, local13)) {
			this.method3789();
		} else if (local158 == Static315.anInt5183 - 1 && local46[local158].l(local6, local13) - local18 > 0x8 << Static168.anInt3026) {
			this.method3789();
		} else {
			@Pc(211) Class223 local211 = Static19.aClass223ArrayArrayArray1[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static19.aClass223ArrayArrayArray1[0][local6][local13] = new Class223(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static19.aClass223ArrayArrayArray1[0][local6][local13].aClass223_1 != null;
				if (local158 == 3 && local243) {
					this.method3789();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static19.aClass223ArrayArrayArray1[local253][local6][local13] == null) {
						local211 = Static19.aClass223ArrayArrayArray1[local253][local6][local13] = new Class223(local253, local6, local13);
						if (local243) {
							local211.aByte68++;
						}
					}
				}
			}
			if (local211.aClass201_2 == null) {
				local211.aClass201_2 = new Class201();
				local211.aByte70 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte70 != (byte) (arg0 & 0xFFL)) {
				local211.aClass201_2.aClass232_1.method4840();
				local211.aClass201_2.aBoolean333 = false;
				local211.aByte70 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass201_2.aClass232_1.method4837(this);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	private void method3789() {
		this.aClass28_Sub2_1.aClass28_Sub3_5.aClass28_Sub1_Sub1_Sub1Array2[this.aShort60] = null;
		Static57.aClass28_Sub1_Sub1_Sub1Array1[Static205.anInt3626] = this;
		Static205.anInt3626 = Static205.anInt3626 + 1 & 0x3FF;
		this.method5642();
		this.method5645();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)V")
	public void method3790(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort56 = (short) (this.aShort56 - arg1);
		if (this.aShort56 <= 0) {
			this.method3789();
			return;
		}
		@Pc(17) int local17 = super.anInt4770 >> Static13.anInt158;
		@Pc(22) int local22 = super.anInt4763 >> Static13.anInt158;
		@Pc(27) int local27 = super.anInt4765 >> Static13.anInt158;
		@Pc(31) Class28_Sub3 local31 = this.aClass28_Sub2_1.aClass28_Sub3_5;
		@Pc(35) Class49 local35 = this.aClass28_Sub2_1.aClass49_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1196 != 0) {
			if (this.aShort57 - this.aShort56 <= local35.anInt1194) {
				local65 = (super.anInt4767 >> 8 & 0xFF00) + (this.anInt4772 >> 16 & 0xFF) + local35.anInt1178 * arg1;
				local82 = (super.anInt4767 & 0xFF00) + (this.anInt4772 >> 8 & 0xFF) + local35.anInt1213 * arg1;
				local99 = ((super.anInt4767 & 0xFF) << 8) + (this.anInt4772 & 0xFF) + local35.anInt1189 * arg1;
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
				super.anInt4767 &= 0xFF000000;
				super.anInt4767 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4772 &= 0xFF000000;
				this.anInt4772 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort57 - this.aShort56 <= local35.anInt1173) {
				local65 = (super.anInt4767 >> 16 & 0xFF00) + (this.anInt4772 >> 24 & 0xFF) + local35.anInt1174 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4767 &= 0xFFFFFF;
				super.anInt4767 |= (local65 & 0xFF00) << 16;
				this.anInt4772 &= 0xFFFFFF;
				this.anInt4772 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1198 != -1 && this.aShort57 - this.aShort56 <= local35.anInt1167) {
			this.anInt4773 += local35.anInt1205 * arg1;
		}
		if (local35.lb != -1 && this.aShort57 - this.aShort56 <= local35.anInt1185) {
			super.anInt4760 += local35.anInt1171 * arg1;
		}
		local65 = this.aShort59;
		local82 = this.aShort61;
		local99 = this.aShort58;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt1169 == 1) {
			local313 = local17 - this.aClass28_Sub2_1.anInt3850;
			local319 = local22 - this.aClass28_Sub2_1.anInt3836;
			local325 = local27 - this.aClass28_Sub2_1.anInt3835;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt1210 * local340 * arg1;
			this.anInt4773 = (int) ((long) this.anInt4773 - ((long) this.anInt4773 * local348 >> 18));
		} else if (local35.anInt1169 == 2) {
			local313 = local17 - this.aClass28_Sub2_1.anInt3850;
			local319 = local22 - this.aClass28_Sub2_1.anInt3836;
			local325 = local27 - this.aClass28_Sub2_1.anInt3835;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt1210 * local340 * arg1;
			this.anInt4773 = (int) ((long) this.anInt4773 - ((long) this.anInt4773 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray94 != null) {
			@Pc(426) Class7 local426 = local31.aClass85_24.aClass7_81;
			for (@Pc(429) Class7 local429 = local426.aClass7_262; local429 != local426; local429 = local429.aClass7_262) {
				@Pc(433) Class7_Sub4_Sub6 local433 = (Class7_Sub4_Sub6) local429;
				@Pc(436) Class134 local436 = local433.aClass134_1;
				if (local436.anInt3787 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray94.length; local444++) {
						if (local35.anIntArray94[local444] == local436.anInt3784) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2574;
						@Pc(473) int local473 = local22 - local433.anInt2568;
						local478 = local27 - local433.anInt2565;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong125) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2567 + local473 * local436.anInt3780 + local478 * local433.anInt2571) * 65535L / (long) (local436.anInt3794 * local501);
							if (local529 >= (long) local436.anInt3783) {
								local537 = 0;
								if (local436.anInt3792 == 1) {
									local537 = (local501 >> 4) * local436.anInt3779;
								} else if (local436.anInt3792 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3779;
								}
								if (local436.anInt3789 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3794;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3794;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3794;
									if (local436.anInt3793 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4770 += local643 * arg1 >> 15;
										super.anInt4763 += local652 * arg1 >> 15;
										super.anInt4765 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3793 == 0) {
									local65 += (local433.anInt2567 - local537) * arg1;
									local82 += (local436.anInt3780 - local537) * arg1;
									local99 += (local433.anInt2571 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4770 += (local433.anInt2567 - local537) * arg1;
									super.anInt4763 += (local436.anInt3780 - local537) * arg1;
									super.anInt4765 += (local433.anInt2571 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray93 != null) {
			for (local313 = 0; local313 < local35.anIntArray93.length; local313++) {
				@Pc(743) Class7_Sub4_Sub6 local743 = (Class7_Sub4_Sub6) Static370.aClass103_1.method2280((long) local35.anIntArray93[local313]);
				while (local743 != null) {
					@Pc(747) Class134 local747 = local743.aClass134_1;
					local340 = local17 - local743.anInt2574;
					@Pc(757) int local757 = local22 - local743.anInt2568;
					local444 = local27 - local743.anInt2565;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong125) {
						local743 = (Class7_Sub4_Sub6) Static370.aClass103_1.method2282();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2567 + local757 * local747.anInt3780 + local444 * local743.anInt2571) * 65535L / (long) (local747.anInt3794 * local478);
						if (local491 < (long) local747.anInt3783) {
							local743 = (Class7_Sub4_Sub6) Static370.aClass103_1.method2282();
						} else {
							local501 = 0;
							if (local747.anInt3792 == 1) {
								local501 = (local478 >> 4) * local747.anInt3779;
							} else if (local747.anInt3792 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3779;
							}
							if (local747.anInt3789 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3794;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3794;
								local537 = (local444 << 15) / local478 * local747.anInt3794;
								if (local747.anInt3793 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4770 += local939 * arg1 >> 15;
									super.anInt4763 += local948 * arg1 >> 15;
									super.anInt4765 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3793 == 0) {
								local65 += (local743.anInt2567 - local501) * arg1;
								local82 += (local747.anInt3780 - local501) * arg1;
								local99 += (local743.anInt2571 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4770 += (local743.anInt2567 - local501) * arg1;
								super.anInt4763 += (local747.anInt3780 - local501) * arg1;
								super.anInt4765 += (local743.anInt2571 - local501) * arg1;
							}
							local743 = (Class7_Sub4_Sub6) Static370.aClass103_1.method2282();
						}
					}
				}
			}
		}
		if (local35.anIntArray91 != null) {
			if (local35.anIntArray92 == null) {
				local35.anIntArray92 = new int[local35.anIntArray91.length];
				for (local313 = 0; local313 < local35.anIntArray91.length; local313++) {
					Static178.method2597(local35.anIntArray91[local313]);
					local35.anIntArray92[local313] = ((Class7_Sub2) Static79.aClass164_9.method3512((long) local35.anIntArray91[local313])).anInt128;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray92.length; local313++) {
				@Pc(1082) Class134 local1082 = Static190.aClass134Array1[local35.anIntArray92[local313]];
				if (local1082.anInt3793 == 0) {
					local65 += local1082.anInt3790 * arg1;
					local82 += local1082.anInt3780 * arg1;
					local99 += local1082.anInt3785 * arg1;
					local303 = true;
				} else {
					super.anInt4770 += local1082.anInt3790 * arg1;
					super.anInt4763 += local1082.anInt3780 * arg1;
					super.anInt4765 += local1082.anInt3785 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort59 = (short) local65;
					this.aShort61 = (short) local82;
					this.aShort58 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4773 <<= 0x1;
			}
		}
		super.anInt4770 = (int) ((long) super.anInt4770 + ((long) this.aShort59 * (long) this.anInt4773 >> 23) * (long) arg1);
		super.anInt4763 = (int) ((long) super.anInt4763 + ((long) this.aShort61 * (long) this.anInt4773 >> 23) * (long) arg1);
		super.anInt4765 = (int) ((long) super.anInt4765 + ((long) this.aShort58 * (long) this.anInt4773 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	private void method3791() {
		@Pc(4) int local4 = this.aClass28_Sub2_1.aClass28_Sub3_5.anInt3984;
		if (this.aClass28_Sub2_1.aClass28_Sub3_5.aClass28_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass28_Sub2_1.aClass28_Sub3_5.aClass28_Sub1_Sub1_Sub1Array2[local4].method3789();
		}
		this.aClass28_Sub2_1.aClass28_Sub3_5.aClass28_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort60 = (short) this.aClass28_Sub2_1.aClass28_Sub3_5.anInt3984;
		this.aClass28_Sub2_1.aClass28_Sub3_5.anInt3984 = local4 + 1 & 0x1FFF;
		this.aClass28_Sub2_1.aClass169_4.method3603(this);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!kp;IIIIIIIIIIIZZ)V")
	public void method3792(@OriginalArg(0) Class28_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub2_1 = arg0;
		super.anInt4770 = arg1 << Static13.anInt158;
		super.anInt4763 = arg2 << Static13.anInt158;
		super.anInt4765 = arg3 << Static13.anInt158;
		super.anInt4767 = arg9;
		this.aShort57 = this.aShort56 = (short) arg8;
		super.anInt4760 = arg10;
		super.anInt4771 = arg11;
		super.aBoolean300 = arg13;
		this.aShort59 = (short) arg4;
		this.aShort61 = (short) arg5;
		this.aShort58 = (short) arg6;
		this.anInt4773 = arg7;
		super.aByte49 = this.aClass28_Sub2_1.aClass167_1.aByte44;
		this.method3791();
	}
}

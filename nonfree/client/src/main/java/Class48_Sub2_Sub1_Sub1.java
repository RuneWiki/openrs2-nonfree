import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class48_Sub2_Sub1_Sub1 extends Class48_Sub2_Sub1 {

	@OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!hu", name = "I", descriptor = "Lclient!gs;")
	private Class48_Sub3 aClass48_Sub3_1;

	@OriginalMember(owner = "client!hu", name = "O", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!hu", name = "P", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!hu", name = "L", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!hu", name = "M", descriptor = "I")
	private int anInt2766;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!gs;IIIIIIIIIIIZZ)V")
	public Class48_Sub2_Sub1_Sub1(@OriginalArg(0) Class48_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass48_Sub3_1 = arg0;
		super.anInt2754 = arg1 << Static368.anInt6141;
		super.anInt2764 = arg2 << Static368.anInt6141;
		super.anInt2758 = arg3 << Static368.anInt6141;
		super.anInt2756 = arg9;
		this.aShort48 = this.aShort49 = (short) arg8;
		super.anInt2762 = arg10;
		super.anInt2761 = arg11;
		super.aBoolean199 = arg13;
		this.aShort45 = (short) arg4;
		this.aShort50 = (short) arg5;
		this.aShort47 = (short) arg6;
		this.anInt2766 = arg7;
		super.aByte31 = this.aClass48_Sub3_1.aClass192_1.aByte59;
		this.method2523();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!gs;IIIIIIIIIIIZZ)V")
	public void method2522(@OriginalArg(0) Class48_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass48_Sub3_1 = arg0;
		super.anInt2754 = arg1 << Static368.anInt6141;
		super.anInt2764 = arg2 << Static368.anInt6141;
		super.anInt2758 = arg3 << Static368.anInt6141;
		super.anInt2756 = arg9;
		this.aShort48 = this.aShort49 = (short) arg8;
		super.anInt2762 = arg10;
		super.anInt2761 = arg11;
		super.aBoolean199 = arg13;
		this.aShort45 = (short) arg4;
		this.aShort50 = (short) arg5;
		this.aShort47 = (short) arg6;
		this.anInt2766 = arg7;
		super.aByte31 = this.aClass48_Sub3_1.aClass192_1.aByte59;
		this.method2523();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "()V")
	private void method2523() {
		@Pc(4) int local4 = this.aClass48_Sub3_1.aClass48_Sub1_2.anInt1427;
		if (this.aClass48_Sub3_1.aClass48_Sub1_2.aClass48_Sub2_Sub1_Sub1Array2[local4] != null) {
			this.aClass48_Sub3_1.aClass48_Sub1_2.aClass48_Sub2_Sub1_Sub1Array2[local4].method2526();
		}
		this.aClass48_Sub3_1.aClass48_Sub1_2.aClass48_Sub2_Sub1_Sub1Array2[local4] = this;
		this.aShort46 = (short) this.aClass48_Sub3_1.aClass48_Sub1_2.anInt1427;
		this.aClass48_Sub3_1.aClass48_Sub1_2.anInt1427 = local4 + 1 & 0x1FFF;
		this.aClass48_Sub3_1.aClass128_4.method2833(this);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(J)V")
	public void method2524(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt2754 >> Static301.anInt2759 + 12;
		@Pc(13) int local13 = super.anInt2758 >> Static301.anInt2759 + 12;
		@Pc(18) int local18 = super.anInt2764 >> Static368.anInt6141;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static401.anInt6621 || local13 < 0 || local13 >= Static364.anInt6134) {
			this.method2526();
			return;
		}
		@Pc(40) Class48_Sub1 local40 = this.aClass48_Sub3_1.aClass48_Sub1_2;
		@Pc(44) Class245 local44 = this.aClass48_Sub3_1.aClass245_1;
		@Pc(46) Class84[] local46 = Static420.aClass84Array4;
		@Pc(54) int local54 = local46[local40.anInt1434].method5322(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt1434 < Static268.anInt4600 - 1) {
			local70 = local46[local40.anInt1434 + 1].method5322(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static301.anInt2759);
		}
		if (local44.aBoolean467) {
			if (local44.anInt6875 == -1 && local18 > local54) {
				this.method2526();
				return;
			}
			if (local44.anInt6875 >= 0 && local18 > local46[local44.anInt6875].method5322(local6, local13)) {
				this.method2526();
				return;
			}
			if (local44.anInt6844 == -1 && local18 < local70) {
				this.method2526();
				return;
			}
			if (local44.anInt6844 >= 0 && local18 < local46[local44.anInt6844 + 1].method5322(local6, local13)) {
				this.method2526();
				return;
			}
		}
		if (local6 >= local40.anInt1432 && local6 <= local40.anInt1429 && local13 >= local40.anInt1430 && local13 <= local40.anInt1433 && local18 <= local54 && local18 >= local70) {
			local40.aClass115_1.aClass246_1.method5594(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static268.anInt4600 - 1; local158 > 0 && local18 > local46[local158].method5322(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].method5322(local6, local13)) {
			this.method2526();
		} else if (local158 == Static268.anInt4600 - 1 && local46[local158].method5322(local6, local13) - local18 > 0x8 << Static301.anInt2759) {
			this.method2526();
		} else {
			@Pc(211) Class189 local211 = Static30.aClass189ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static30.aClass189ArrayArrayArray2[0][local6][local13] = new Class189(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static30.aClass189ArrayArrayArray2[0][local6][local13].aClass189_1 != null;
				if (local158 == 3 && local243) {
					this.method2526();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static30.aClass189ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static30.aClass189ArrayArrayArray2[local253][local6][local13] = new Class189(local253, local6, local13);
						if (local243) {
							local211.aByte58++;
						}
					}
				}
			}
			if (local211.aClass115_2 == null) {
				local211.aClass115_2 = new Class115();
				local211.aByte56 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte56 != (byte) (arg0 & 0xFFL)) {
				local211.aClass115_2.aClass246_1.method5593();
				local211.aClass115_2.aBoolean202 = false;
				local211.aByte56 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass115_2.aClass246_1.method5594(this);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)V")
	public void method2525(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort49 = (short) (this.aShort49 - arg1);
		if (this.aShort49 <= 0) {
			this.method2526();
			return;
		}
		@Pc(17) int local17 = super.anInt2754 >> Static368.anInt6141;
		@Pc(22) int local22 = super.anInt2764 >> Static368.anInt6141;
		@Pc(27) int local27 = super.anInt2758 >> Static368.anInt6141;
		@Pc(31) Class48_Sub1 local31 = this.aClass48_Sub3_1.aClass48_Sub1_2;
		@Pc(35) Class245 local35 = this.aClass48_Sub3_1.aClass245_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6859 != 0) {
			if (this.aShort48 - this.aShort49 <= local35.anInt6874) {
				local65 = (super.anInt2756 >> 8 & 0xFF00) + (this.anInt2765 >> 16 & 0xFF) + local35.anInt6865 * arg1;
				local82 = (super.anInt2756 & 0xFF00) + (this.anInt2765 >> 8 & 0xFF) + local35.anInt6860 * arg1;
				local99 = ((super.anInt2756 & 0xFF) << 8) + (this.anInt2765 & 0xFF) + local35.anInt6890 * arg1;
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
				super.anInt2756 &= 0xFF000000;
				super.anInt2756 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2765 &= 0xFF000000;
				this.anInt2765 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort48 - this.aShort49 <= local35.anInt6867) {
				local65 = (super.anInt2756 >> 16 & 0xFF00) + (this.anInt2765 >> 24 & 0xFF) + local35.anInt6880 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2756 &= 0xFFFFFF;
				super.anInt2756 |= (local65 & 0xFF00) << 16;
				this.anInt2765 &= 0xFFFFFF;
				this.anInt2765 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6841 != -1 && this.aShort48 - this.aShort49 <= local35.anInt6884) {
			this.anInt2766 += local35.anInt6847 * arg1;
		}
		if (local35.anInt6871 != -1 && this.aShort48 - this.aShort49 <= local35.anInt6864) {
			super.anInt2762 += local35.anInt6866 * arg1;
		}
		local65 = this.aShort45;
		local82 = this.aShort50;
		local99 = this.aShort47;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6882 == 1) {
			local313 = local17 - this.aClass48_Sub3_1.anInt2401;
			local319 = local22 - this.aClass48_Sub3_1.anInt2404;
			local325 = local27 - this.aClass48_Sub3_1.anInt2403;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6887 * local340 * arg1;
			this.anInt2766 = (int) ((long) this.anInt2766 - ((long) this.anInt2766 * local348 >> 18));
		} else if (local35.anInt6882 == 2) {
			local313 = local17 - this.aClass48_Sub3_1.anInt2401;
			local319 = local22 - this.aClass48_Sub3_1.anInt2404;
			local325 = local27 - this.aClass48_Sub3_1.anInt2403;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6887 * local340 * arg1;
			this.anInt2766 = (int) ((long) this.anInt2766 - ((long) this.anInt2766 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray593 != null) {
			@Pc(426) Class6 local426 = local31.aClass88_16.aClass6_73;
			for (@Pc(429) Class6 local429 = local426.aClass6_252; local429 != local426; local429 = local429.aClass6_252) {
				@Pc(433) Class6_Sub1_Sub16 local433 = (Class6_Sub1_Sub16) local429;
				@Pc(436) Class168 local436 = local433.aClass168_1;
				if (local436.anInt4156 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray593.length; local444++) {
						if (local35.anIntArray593[local444] == local436.anInt4155) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt6053;
						@Pc(473) int local473 = local22 - local433.anInt6056;
						local478 = local27 - local433.anInt6051;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong133) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt6054 + local473 * local436.anInt4161 + local478 * local433.anInt6059) * 65535L / (long) (local436.anInt4151 * local501);
							if (local529 >= (long) local436.anInt4148) {
								local537 = 0;
								if (local436.anInt4150 == 1) {
									local537 = (local501 >> 4) * local436.anInt4153;
								} else if (local436.anInt4150 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt4153;
								}
								if (local436.anInt4158 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt4151;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt4151;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt4151;
									if (local436.anInt4152 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2754 += local643 * arg1 >> 15;
										super.anInt2764 += local652 * arg1 >> 15;
										super.anInt2758 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt4152 == 0) {
									local65 += (local433.anInt6054 - local537) * arg1;
									local82 += (local436.anInt4161 - local537) * arg1;
									local99 += (local433.anInt6059 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2754 += (local433.anInt6054 - local537) * arg1;
									super.anInt2764 += (local436.anInt4161 - local537) * arg1;
									super.anInt2758 += (local433.anInt6059 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray591 != null) {
			for (local313 = 0; local313 < local35.anIntArray591.length; local313++) {
				@Pc(743) Class6_Sub1_Sub16 local743 = (Class6_Sub1_Sub16) Static35.aClass135_1.method3144((long) local35.anIntArray591[local313]);
				while (local743 != null) {
					@Pc(747) Class168 local747 = local743.aClass168_1;
					local340 = local17 - local743.anInt6053;
					@Pc(757) int local757 = local22 - local743.anInt6056;
					local444 = local27 - local743.anInt6051;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong133) {
						local743 = (Class6_Sub1_Sub16) Static35.aClass135_1.method3147();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt6054 + local757 * local747.anInt4161 + local444 * local743.anInt6059) * 65535L / (long) (local747.anInt4151 * local478);
						if (local491 < (long) local747.anInt4148) {
							local743 = (Class6_Sub1_Sub16) Static35.aClass135_1.method3147();
						} else {
							local501 = 0;
							if (local747.anInt4150 == 1) {
								local501 = (local478 >> 4) * local747.anInt4153;
							} else if (local747.anInt4150 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt4153;
							}
							if (local747.anInt4158 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt4151;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt4151;
								local537 = (local444 << 15) / local478 * local747.anInt4151;
								if (local747.anInt4152 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2754 += local939 * arg1 >> 15;
									super.anInt2764 += local948 * arg1 >> 15;
									super.anInt2758 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt4152 == 0) {
								local65 += (local743.anInt6054 - local501) * arg1;
								local82 += (local747.anInt4161 - local501) * arg1;
								local99 += (local743.anInt6059 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2754 += (local743.anInt6054 - local501) * arg1;
								super.anInt2764 += (local747.anInt4161 - local501) * arg1;
								super.anInt2758 += (local743.anInt6059 - local501) * arg1;
							}
							local743 = (Class6_Sub1_Sub16) Static35.aClass135_1.method3147();
						}
					}
				}
			}
		}
		if (local35.anIntArray590 != null) {
			if (local35.anIntArray592 == null) {
				local35.anIntArray592 = new int[local35.anIntArray590.length];
				for (local313 = 0; local313 < local35.anIntArray590.length; local313++) {
					Static441.method5929(local35.anIntArray590[local313]);
					local35.anIntArray592[local313] = ((Class6_Sub44) Static282.aClass137_28.method3175((long) local35.anIntArray590[local313])).anInt7027;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray592.length; local313++) {
				@Pc(1082) Class168 local1082 = Static84.aClass168Array1[local35.anIntArray592[local313]];
				if (local1082.anInt4152 == 0) {
					local65 += local1082.anInt4162 * arg1;
					local82 += local1082.anInt4161 * arg1;
					local99 += local1082.anInt4147 * arg1;
					local303 = true;
				} else {
					super.anInt2754 += local1082.anInt4162 * arg1;
					super.anInt2764 += local1082.anInt4161 * arg1;
					super.anInt2758 += local1082.anInt4147 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort45 = (short) local65;
					this.aShort50 = (short) local82;
					this.aShort47 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2766 <<= 0x1;
			}
		}
		super.anInt2754 = (int) ((long) super.anInt2754 + ((long) this.aShort45 * (long) this.anInt2766 >> 23) * (long) arg1);
		super.anInt2764 = (int) ((long) super.anInt2764 + ((long) this.aShort50 * (long) this.anInt2766 >> 23) * (long) arg1);
		super.anInt2758 = (int) ((long) super.anInt2758 + ((long) this.aShort47 * (long) this.anInt2766 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "()V")
	private void method2526() {
		this.aClass48_Sub3_1.aClass48_Sub1_2.aClass48_Sub2_Sub1_Sub1Array2[this.aShort46] = null;
		Static33.aClass48_Sub2_Sub1_Sub1Array1[Static392.anInt6526] = this;
		Static392.anInt6526 = Static392.anInt6526 + 1 & 0x3FF;
		this.method5436();
		this.method2514();
	}
}

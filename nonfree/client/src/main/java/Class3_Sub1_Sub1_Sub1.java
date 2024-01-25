import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "Lclient!mo;")
	private Class3_Sub6 aClass3_Sub6_1;

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	private int anInt4079;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!mo;IIIIIIIIIIIZZ)V")
	public Class3_Sub1_Sub1_Sub1(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass3_Sub6_1 = arg0;
		super.anInt4068 = arg1 << Static172.anInt3366;
		super.anInt4076 = arg2 << Static172.anInt3366;
		super.anInt4073 = arg3 << Static172.anInt3366;
		super.anInt4072 = arg9;
		this.aShort50 = this.aShort53 = (short) arg8;
		super.anInt4069 = arg10;
		super.anInt4077 = arg11;
		super.aBoolean375 = arg13;
		this.aShort52 = (short) arg4;
		this.aShort48 = (short) arg5;
		this.aShort49 = (short) arg6;
		this.anInt4079 = arg7;
		super.aByte31 = this.aClass3_Sub6_1.aClass29_2.aByte12;
		this.method3306();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	private void method3303() {
		this.aClass3_Sub6_1.aClass3_Sub2_6.aClass3_Sub1_Sub1_Sub1Array1[this.aShort51] = null;
		Static452.aClass3_Sub1_Sub1_Sub1Array2[Static305.anInt5385] = this;
		Static305.anInt5385 = Static305.anInt5385 + 1 & 0x3FF;
		this.method5676();
		this.method3298();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(J)V")
	public void method3304(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt4068 >> Static231.anInt4434 + 12;
		@Pc(13) int local13 = super.anInt4073 >> Static231.anInt4434 + 12;
		@Pc(18) int local18 = super.anInt4076 >> Static172.anInt3366;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static422.anInt6945 || local13 < 0 || local13 >= Static171.anInt3361) {
			this.method3303();
			return;
		}
		@Pc(40) Class3_Sub2 local40 = this.aClass3_Sub6_1.aClass3_Sub2_6;
		@Pc(44) Class123 local44 = this.aClass3_Sub6_1.aClass123_1;
		@Pc(46) Class65[] local46 = Static417.aClass65Array4;
		@Pc(54) int local54 = local46[local40.anInt217].l(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt217 < Static235.anInt4487 - 1) {
			local70 = local46[local40.anInt217 + 1].l(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static231.anInt4434);
		}
		if (local44.aBoolean356) {
			if (local44.anInt3790 == -1 && local18 > local54) {
				this.method3303();
				return;
			}
			if (local44.anInt3790 >= 0 && local18 > local46[local44.anInt3790].l(local6, local13)) {
				this.method3303();
				return;
			}
			if (local44.anInt3808 == -1 && local18 < local70) {
				this.method3303();
				return;
			}
			if (local44.anInt3808 >= 0 && local18 < local46[local44.anInt3808 + 1].l(local6, local13)) {
				this.method3303();
				return;
			}
		}
		if (local6 >= local40.anInt215 && local6 <= local40.anInt218 && local13 >= local40.anInt219 && local13 <= local40.anInt214 && local18 <= local54 && local18 >= local70) {
			local40.aClass146_1.aClass232_1.method5126(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static235.anInt4487 - 1; local158 > 0 && local18 > local46[local158].l(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].l(local6, local13)) {
			this.method3303();
		} else if (local158 == Static235.anInt4487 - 1 && local46[local158].l(local6, local13) - local18 > 0x8 << Static231.anInt4434) {
			this.method3303();
		} else {
			@Pc(211) Class164 local211 = Static202.aClass164ArrayArrayArray5[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static202.aClass164ArrayArrayArray5[0][local6][local13] = new Class164(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static202.aClass164ArrayArrayArray5[0][local6][local13].aClass164_1 != null;
				if (local158 == 3 && local243) {
					this.method3303();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static202.aClass164ArrayArrayArray5[local253][local6][local13] == null) {
						local211 = Static202.aClass164ArrayArrayArray5[local253][local6][local13] = new Class164(local253, local6, local13);
						if (local243) {
							local211.aByte53++;
						}
					}
				}
			}
			if (local211.aClass146_2 == null) {
				local211.aClass146_2 = new Class146();
				local211.aByte48 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte48 != (byte) (arg0 & 0xFFL)) {
				local211.aClass146_2.aClass232_1.method5122();
				local211.aClass146_2.aBoolean417 = false;
				local211.aByte48 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass146_2.aClass232_1.method5126(this);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!mo;IIIIIIIIIIIZZ)V")
	public void method3305(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass3_Sub6_1 = arg0;
		super.anInt4068 = arg1 << Static172.anInt3366;
		super.anInt4076 = arg2 << Static172.anInt3366;
		super.anInt4073 = arg3 << Static172.anInt3366;
		super.anInt4072 = arg9;
		this.aShort50 = this.aShort53 = (short) arg8;
		super.anInt4069 = arg10;
		super.anInt4077 = arg11;
		super.aBoolean375 = arg13;
		this.aShort52 = (short) arg4;
		this.aShort48 = (short) arg5;
		this.aShort49 = (short) arg6;
		this.anInt4079 = arg7;
		super.aByte31 = this.aClass3_Sub6_1.aClass29_2.aByte12;
		this.method3306();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
	private void method3306() {
		@Pc(4) int local4 = this.aClass3_Sub6_1.aClass3_Sub2_6.anInt212;
		if (this.aClass3_Sub6_1.aClass3_Sub2_6.aClass3_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass3_Sub6_1.aClass3_Sub2_6.aClass3_Sub1_Sub1_Sub1Array1[local4].method3303();
		}
		this.aClass3_Sub6_1.aClass3_Sub2_6.aClass3_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort51 = (short) this.aClass3_Sub6_1.aClass3_Sub2_6.anInt212;
		this.aClass3_Sub6_1.aClass3_Sub2_6.anInt212 = local4 + 1 & 0x1FFF;
		this.aClass3_Sub6_1.aClass84_6.method2305(this);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public void method3307(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort53 = (short) (this.aShort53 - arg1);
		if (this.aShort53 <= 0) {
			this.method3303();
			return;
		}
		@Pc(17) int local17 = super.anInt4068 >> Static172.anInt3366;
		@Pc(22) int local22 = super.anInt4076 >> Static172.anInt3366;
		@Pc(27) int local27 = super.anInt4073 >> Static172.anInt3366;
		@Pc(31) Class3_Sub2 local31 = this.aClass3_Sub6_1.aClass3_Sub2_6;
		@Pc(35) Class123 local35 = this.aClass3_Sub6_1.aClass123_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3782 != 0) {
			if (this.aShort50 - this.aShort53 <= local35.anInt3797) {
				local65 = (super.anInt4072 >> 8 & 0xFF00) + (this.anInt4078 >> 16 & 0xFF) + local35.anInt3803 * arg1;
				local82 = (super.anInt4072 & 0xFF00) + (this.anInt4078 >> 8 & 0xFF) + local35.anInt3812 * arg1;
				local99 = ((super.anInt4072 & 0xFF) << 8) + (this.anInt4078 & 0xFF) + local35.anInt3778 * arg1;
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
				super.anInt4072 &= 0xFF000000;
				super.anInt4072 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4078 &= 0xFF000000;
				this.anInt4078 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort50 - this.aShort53 <= local35.anInt3779) {
				local65 = (super.anInt4072 >> 16 & 0xFF00) + (this.anInt4078 >> 24 & 0xFF) + local35.anInt3819 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4072 &= 0xFFFFFF;
				super.anInt4072 |= (local65 & 0xFF00) << 16;
				this.anInt4078 &= 0xFFFFFF;
				this.anInt4078 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3796 != -1 && this.aShort50 - this.aShort53 <= local35.anInt3817) {
			this.anInt4079 += local35.anInt3794 * arg1;
		}
		if (local35.anInt3806 != -1 && this.aShort50 - this.aShort53 <= local35.anInt3805) {
			super.anInt4069 += local35.anInt3791 * arg1;
		}
		local65 = this.aShort52;
		local82 = this.aShort48;
		local99 = this.aShort49;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3792 == 1) {
			local313 = local17 - this.aClass3_Sub6_1.anInt4631;
			local319 = local22 - this.aClass3_Sub6_1.anInt4652;
			local325 = local27 - this.aClass3_Sub6_1.anInt4653;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3809 * local340 * arg1;
			this.anInt4079 = (int) ((long) this.anInt4079 - ((long) this.anInt4079 * local348 >> 18));
		} else if (local35.anInt3792 == 2) {
			local313 = local17 - this.aClass3_Sub6_1.anInt4631;
			local319 = local22 - this.aClass3_Sub6_1.anInt4652;
			local325 = local27 - this.aClass3_Sub6_1.anInt4653;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3809 * local340 * arg1;
			this.anInt4079 = (int) ((long) this.anInt4079 - ((long) this.anInt4079 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray256 != null) {
			@Pc(426) Class4 local426 = local31.aClass183_1.aClass4_207;
			for (@Pc(429) Class4 local429 = local426.aClass4_262; local429 != local426; local429 = local429.aClass4_262) {
				@Pc(433) Class4_Sub1_Sub12 local433 = (Class4_Sub1_Sub12) local429;
				@Pc(436) Class8 local436 = local433.aClass8_1;
				if (local436.anInt121 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray256.length; local444++) {
						if (local35.anIntArray256[local444] == local436.anInt130) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3220;
						@Pc(473) int local473 = local22 - local433.anInt3222;
						local478 = local27 - local433.anInt3225;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong6) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3218 + local473 * local436.anInt125 + local478 * local433.anInt3221) * 65535L / (long) (local436.anInt119 * local501);
							if (local529 >= (long) local436.anInt124) {
								local537 = 0;
								if (local436.anInt133 == 1) {
									local537 = (local501 >> 4) * local436.anInt131;
								} else if (local436.anInt133 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt131;
								}
								if (local436.anInt123 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt119;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt119;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt119;
									if (local436.anInt127 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4068 += local643 * arg1 >> 15;
										super.anInt4076 += local652 * arg1 >> 15;
										super.anInt4073 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt127 == 0) {
									local65 += (local433.anInt3218 - local537) * arg1;
									local82 += (local436.anInt125 - local537) * arg1;
									local99 += (local433.anInt3221 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4068 += (local433.anInt3218 - local537) * arg1;
									super.anInt4076 += (local436.anInt125 - local537) * arg1;
									super.anInt4073 += (local433.anInt3221 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray255 != null) {
			for (local313 = 0; local313 < local35.anIntArray255.length; local313++) {
				@Pc(743) Class4_Sub1_Sub12 local743 = (Class4_Sub1_Sub12) Static166.aClass100_1.method2671((long) local35.anIntArray255[local313]);
				while (local743 != null) {
					@Pc(747) Class8 local747 = local743.aClass8_1;
					local340 = local17 - local743.anInt3220;
					@Pc(757) int local757 = local22 - local743.anInt3222;
					local444 = local27 - local743.anInt3225;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong6) {
						local743 = (Class4_Sub1_Sub12) Static166.aClass100_1.method2670();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3218 + local757 * local747.anInt125 + local444 * local743.anInt3221) * 65535L / (long) (local747.anInt119 * local478);
						if (local491 < (long) local747.anInt124) {
							local743 = (Class4_Sub1_Sub12) Static166.aClass100_1.method2670();
						} else {
							local501 = 0;
							if (local747.anInt133 == 1) {
								local501 = (local478 >> 4) * local747.anInt131;
							} else if (local747.anInt133 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt131;
							}
							if (local747.anInt123 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt119;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt119;
								local537 = (local444 << 15) / local478 * local747.anInt119;
								if (local747.anInt127 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4068 += local939 * arg1 >> 15;
									super.anInt4076 += local948 * arg1 >> 15;
									super.anInt4073 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt127 == 0) {
								local65 += (local743.anInt3218 - local501) * arg1;
								local82 += (local747.anInt125 - local501) * arg1;
								local99 += (local743.anInt3221 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4068 += (local743.anInt3218 - local501) * arg1;
								super.anInt4076 += (local747.anInt125 - local501) * arg1;
								super.anInt4073 += (local743.anInt3221 - local501) * arg1;
							}
							local743 = (Class4_Sub1_Sub12) Static166.aClass100_1.method2670();
						}
					}
				}
			}
		}
		if (local35.anIntArray257 != null) {
			if (local35.anIntArray259 == null) {
				local35.anIntArray259 = new int[local35.anIntArray257.length];
				for (local313 = 0; local313 < local35.anIntArray257.length; local313++) {
					Static87.method1587(local35.anIntArray257[local313]);
					local35.anIntArray259[local313] = ((Class4_Sub37) Static18.aClass102_2.method2700((long) local35.anIntArray257[local313])).anInt5426;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray259.length; local313++) {
				@Pc(1082) Class8 local1082 = Static392.aClass8Array1[local35.anIntArray259[local313]];
				if (local1082.anInt127 == 0) {
					local65 += local1082.anInt128 * arg1;
					local82 += local1082.anInt125 * arg1;
					local99 += local1082.anInt132 * arg1;
					local303 = true;
				} else {
					super.anInt4068 += local1082.anInt128 * arg1;
					super.anInt4076 += local1082.anInt125 * arg1;
					super.anInt4073 += local1082.anInt132 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort52 = (short) local65;
					this.aShort48 = (short) local82;
					this.aShort49 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4079 <<= 0x1;
			}
		}
		super.anInt4068 = (int) ((long) super.anInt4068 + ((long) this.aShort52 * (long) this.anInt4079 >> 23) * (long) arg1);
		super.anInt4076 = (int) ((long) super.anInt4076 + ((long) this.aShort48 * (long) this.anInt4079 >> 23) * (long) arg1);
		super.anInt4073 = (int) ((long) super.anInt4073 + ((long) this.aShort49 * (long) this.anInt4079 >> 23) * (long) arg1);
	}
}

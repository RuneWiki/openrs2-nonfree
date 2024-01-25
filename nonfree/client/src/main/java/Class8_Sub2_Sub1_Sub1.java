import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class8_Sub2_Sub1_Sub1 extends Class8_Sub2_Sub1 {

	@OriginalMember(owner = "client!wq", name = "G", descriptor = "I")
	private int anInt7360;

	@OriginalMember(owner = "client!wq", name = "K", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!wq", name = "J", descriptor = "Lclient!nc;")
	private Class8_Sub6 aClass8_Sub6_1;

	@OriginalMember(owner = "client!wq", name = "H", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!wq", name = "D", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!wq", name = "I", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!wq", name = "C", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!wq", name = "E", descriptor = "I")
	private int anInt7359;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!nc;IIIIIIIIIIIZZ)V")
	public Class8_Sub2_Sub1_Sub1(@OriginalArg(0) Class8_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass8_Sub6_1 = arg0;
		super.anInt7352 = arg1 << Static214.anInt4151;
		super.anInt7354 = arg2 << Static214.anInt4151;
		super.anInt7356 = arg3 << Static214.anInt4151;
		super.anInt7358 = arg9;
		this.aShort99 = this.aShort100 = (short) arg8;
		super.anInt7351 = arg10;
		super.anInt7357 = arg11;
		super.aBoolean482 = arg13;
		this.aShort98 = (short) arg4;
		this.aShort101 = (short) arg5;
		this.aShort97 = (short) arg6;
		this.anInt7359 = arg7;
		super.aByte100 = this.aClass8_Sub6_1.aClass200_1.aByte85;
		this.method5796();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!nc;IIIIIIIIIIIZZ)V")
	public void method5793(@OriginalArg(0) Class8_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass8_Sub6_1 = arg0;
		super.anInt7352 = arg1 << Static214.anInt4151;
		super.anInt7354 = arg2 << Static214.anInt4151;
		super.anInt7356 = arg3 << Static214.anInt4151;
		super.anInt7358 = arg9;
		this.aShort99 = this.aShort100 = (short) arg8;
		super.anInt7351 = arg10;
		super.anInt7357 = arg11;
		super.aBoolean482 = arg13;
		this.aShort98 = (short) arg4;
		this.aShort101 = (short) arg5;
		this.aShort97 = (short) arg6;
		this.anInt7359 = arg7;
		super.aByte100 = this.aClass8_Sub6_1.aClass200_1.aByte85;
		this.method5796();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(J)V")
	public void method5794(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt7352 >> Static307.anInt5425 + 12;
		@Pc(13) int local13 = super.anInt7356 >> Static307.anInt5425 + 12;
		@Pc(18) int local18 = super.anInt7354 >> Static214.anInt4151;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static42.anInt4340 || local13 < 0 || local13 >= Static386.anInt6463) {
			this.method5797();
			return;
		}
		@Pc(40) Class8_Sub3 local40 = this.aClass8_Sub6_1.aClass8_Sub3_6;
		@Pc(44) Class102 local44 = this.aClass8_Sub6_1.aClass102_1;
		@Pc(46) Class64[] local46 = Static58.aClass64Array1;
		@Pc(54) int local54 = local46[local40.anInt657].l(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt657 < Static254.anInt4782 - 1) {
			local70 = local46[local40.anInt657 + 1].l(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static307.anInt5425);
		}
		if (local44.aBoolean228) {
			if (local44.lb == -1 && local18 > local54) {
				this.method5797();
				return;
			}
			if (local44.lb >= 0 && local18 > local46[local44.lb].l(local6, local13)) {
				this.method5797();
				return;
			}
			if (local44.anInt2988 == -1 && local18 < local70) {
				this.method5797();
				return;
			}
			if (local44.anInt2988 >= 0 && local18 < local46[local44.anInt2988 + 1].l(local6, local13)) {
				this.method5797();
				return;
			}
		}
		if (local6 >= local40.anInt654 && local6 <= local40.anInt656 && local13 >= local40.anInt658 && local13 <= local40.anInt655 && local18 <= local54 && local18 >= local70) {
			local40.aClass194_1.aClass191_1.method4328(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static254.anInt4782 - 1; local158 > 0 && local18 > local46[local158].l(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].l(local6, local13)) {
			this.method5797();
		} else if (local158 == Static254.anInt4782 - 1 && local46[local158].l(local6, local13) - local18 > 0x8 << Static307.anInt5425) {
			this.method5797();
		} else {
			@Pc(211) Class106 local211 = Static440.aClass106ArrayArrayArray3[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static440.aClass106ArrayArrayArray3[0][local6][local13] = new Class106(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static440.aClass106ArrayArrayArray3[0][local6][local13].aClass106_1 != null;
				if (local158 == 3 && local243) {
					this.method5797();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static440.aClass106ArrayArrayArray3[local253][local6][local13] == null) {
						local211 = Static440.aClass106ArrayArrayArray3[local253][local6][local13] = new Class106(local253, local6, local13);
						if (local243) {
							local211.aByte43++;
						}
					}
				}
			}
			if (local211.aClass194_2 == null) {
				local211.aClass194_2 = new Class194();
				local211.aByte48 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte48 != (byte) (arg0 & 0xFFL)) {
				local211.aClass194_2.aClass191_1.method4331();
				local211.aClass194_2.aBoolean391 = false;
				local211.aByte48 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass194_2.aClass191_1.method4328(this);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(JI)V")
	public void method5795(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort100 = (short) (this.aShort100 - arg1);
		if (this.aShort100 <= 0) {
			this.method5797();
			return;
		}
		@Pc(17) int local17 = super.anInt7352 >> Static214.anInt4151;
		@Pc(22) int local22 = super.anInt7354 >> Static214.anInt4151;
		@Pc(27) int local27 = super.anInt7356 >> Static214.anInt4151;
		@Pc(31) Class8_Sub3 local31 = this.aClass8_Sub6_1.aClass8_Sub3_6;
		@Pc(35) Class102 local35 = this.aClass8_Sub6_1.aClass102_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2978 != 0) {
			if (this.aShort99 - this.aShort100 <= local35.anInt2984) {
				local65 = (super.anInt7358 >> 8 & 0xFF00) + (this.anInt7360 >> 16 & 0xFF) + local35.anInt2991 * arg1;
				local82 = (super.anInt7358 & 0xFF00) + (this.anInt7360 >> 8 & 0xFF) + local35.anInt2962 * arg1;
				local99 = ((super.anInt7358 & 0xFF) << 8) + (this.anInt7360 & 0xFF) + local35.anInt2987 * arg1;
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
				super.anInt7358 &= 0xFF000000;
				super.anInt7358 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7360 &= 0xFF000000;
				this.anInt7360 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort99 - this.aShort100 <= local35.anInt2976) {
				local65 = (super.anInt7358 >> 16 & 0xFF00) + (this.anInt7360 >> 24 & 0xFF) + local35.anInt2982 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7358 &= 0xFFFFFF;
				super.anInt7358 |= (local65 & 0xFF00) << 16;
				this.anInt7360 &= 0xFFFFFF;
				this.anInt7360 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2983 != -1 && this.aShort99 - this.aShort100 <= local35.anInt3009) {
			this.anInt7359 += local35.anInt3007 * arg1;
		}
		if (local35.anInt2985 != -1 && this.aShort99 - this.aShort100 <= local35.anInt2993) {
			super.anInt7351 += local35.anInt3011 * arg1;
		}
		local65 = this.aShort98;
		local82 = this.aShort101;
		local99 = this.aShort97;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3003 == 1) {
			local313 = local17 - this.aClass8_Sub6_1.anInt4814;
			local319 = local22 - this.aClass8_Sub6_1.anInt4811;
			local325 = local27 - this.aClass8_Sub6_1.anInt4812;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2966 * local340 * arg1;
			this.anInt7359 = (int) ((long) this.anInt7359 - ((long) this.anInt7359 * local348 >> 18));
		} else if (local35.anInt3003 == 2) {
			local313 = local17 - this.aClass8_Sub6_1.anInt4814;
			local319 = local22 - this.aClass8_Sub6_1.anInt4811;
			local325 = local27 - this.aClass8_Sub6_1.anInt4812;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2966 * local340 * arg1;
			this.anInt7359 = (int) ((long) this.anInt7359 - ((long) this.anInt7359 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray267 != null) {
			@Pc(426) Class2 local426 = local31.aClass14_2.aClass2_17;
			for (@Pc(429) Class2 local429 = local426.aClass2_261; local429 != local426; local429 = local429.aClass2_261) {
				@Pc(433) Class2_Sub5_Sub18 local433 = (Class2_Sub5_Sub18) local429;
				@Pc(436) Class267 local436 = local433.aClass267_1;
				if (local436.anInt7254 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray267.length; local444++) {
						if (local35.anIntArray267[local444] == local436.anInt7253) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt6998;
						@Pc(473) int local473 = local22 - local433.anInt7000;
						local478 = local27 - local433.anInt7004;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong219) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt7002 + local473 * local436.anInt7251 + local478 * local433.anInt6997) * 65535L / (long) (local436.anInt7255 * local501);
							if (local529 >= (long) local436.anInt7250) {
								local537 = 0;
								if (local436.anInt7256 == 1) {
									local537 = (local501 >> 4) * local436.anInt7249;
								} else if (local436.anInt7256 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt7249;
								}
								if (local436.anInt7248 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt7255;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt7255;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt7255;
									if (local436.anInt7244 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt7352 += local643 * arg1 >> 15;
										super.anInt7354 += local652 * arg1 >> 15;
										super.anInt7356 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt7244 == 0) {
									local65 += (local433.anInt7002 - local537) * arg1;
									local82 += (local436.anInt7251 - local537) * arg1;
									local99 += (local433.anInt6997 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt7352 += (local433.anInt7002 - local537) * arg1;
									super.anInt7354 += (local436.anInt7251 - local537) * arg1;
									super.anInt7356 += (local433.anInt6997 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray264 != null) {
			for (local313 = 0; local313 < local35.anIntArray264.length; local313++) {
				@Pc(743) Class2_Sub5_Sub18 local743 = (Class2_Sub5_Sub18) Static291.aClass98_1.method2249((long) local35.anIntArray264[local313]);
				while (local743 != null) {
					@Pc(747) Class267 local747 = local743.aClass267_1;
					local340 = local17 - local743.anInt6998;
					@Pc(757) int local757 = local22 - local743.anInt7000;
					local444 = local27 - local743.anInt7004;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong219) {
						local743 = (Class2_Sub5_Sub18) Static291.aClass98_1.method2244();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt7002 + local757 * local747.anInt7251 + local444 * local743.anInt6997) * 65535L / (long) (local747.anInt7255 * local478);
						if (local491 < (long) local747.anInt7250) {
							local743 = (Class2_Sub5_Sub18) Static291.aClass98_1.method2244();
						} else {
							local501 = 0;
							if (local747.anInt7256 == 1) {
								local501 = (local478 >> 4) * local747.anInt7249;
							} else if (local747.anInt7256 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt7249;
							}
							if (local747.anInt7248 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt7255;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt7255;
								local537 = (local444 << 15) / local478 * local747.anInt7255;
								if (local747.anInt7244 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt7352 += local939 * arg1 >> 15;
									super.anInt7354 += local948 * arg1 >> 15;
									super.anInt7356 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt7244 == 0) {
								local65 += (local743.anInt7002 - local501) * arg1;
								local82 += (local747.anInt7251 - local501) * arg1;
								local99 += (local743.anInt6997 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt7352 += (local743.anInt7002 - local501) * arg1;
								super.anInt7354 += (local747.anInt7251 - local501) * arg1;
								super.anInt7356 += (local743.anInt6997 - local501) * arg1;
							}
							local743 = (Class2_Sub5_Sub18) Static291.aClass98_1.method2244();
						}
					}
				}
			}
		}
		if (local35.anIntArray263 != null) {
			if (local35.anIntArray265 == null) {
				local35.anIntArray265 = new int[local35.anIntArray263.length];
				for (local313 = 0; local313 < local35.anIntArray263.length; local313++) {
					Static266.method3990(local35.anIntArray263[local313]);
					local35.anIntArray265[local313] = ((Class2_Sub26) Static166.aClass163_21.method3769((long) local35.anIntArray263[local313])).anInt4485;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray265.length; local313++) {
				@Pc(1082) Class267 local1082 = Static317.aClass267Array1[local35.anIntArray265[local313]];
				if (local1082.anInt7244 == 0) {
					local65 += local1082.anInt7252 * arg1;
					local82 += local1082.anInt7251 * arg1;
					local99 += local1082.anInt7245 * arg1;
					local303 = true;
				} else {
					super.anInt7352 += local1082.anInt7252 * arg1;
					super.anInt7354 += local1082.anInt7251 * arg1;
					super.anInt7356 += local1082.anInt7245 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort98 = (short) local65;
					this.aShort101 = (short) local82;
					this.aShort97 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt7359 <<= 0x1;
			}
		}
		super.anInt7352 = (int) ((long) super.anInt7352 + ((long) this.aShort98 * (long) this.anInt7359 >> 23) * (long) arg1);
		super.anInt7354 = (int) ((long) super.anInt7354 + ((long) this.aShort101 * (long) this.anInt7359 >> 23) * (long) arg1);
		super.anInt7356 = (int) ((long) super.anInt7356 + ((long) this.aShort97 * (long) this.anInt7359 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()V")
	private void method5796() {
		@Pc(4) int local4 = this.aClass8_Sub6_1.aClass8_Sub3_6.anInt651;
		if (this.aClass8_Sub6_1.aClass8_Sub3_6.aClass8_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass8_Sub6_1.aClass8_Sub3_6.aClass8_Sub2_Sub1_Sub1Array1[local4].method5797();
		}
		this.aClass8_Sub6_1.aClass8_Sub3_6.aClass8_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort102 = (short) this.aClass8_Sub6_1.aClass8_Sub3_6.anInt651;
		this.aClass8_Sub6_1.aClass8_Sub3_6.anInt651 = local4 + 1 & 0x1FFF;
		this.aClass8_Sub6_1.aClass112_9.method2546(this);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "()V")
	private void method5797() {
		this.aClass8_Sub6_1.aClass8_Sub3_6.aClass8_Sub2_Sub1_Sub1Array1[this.aShort102] = null;
		Static229.aClass8_Sub2_Sub1_Sub1Array2[Static117.anInt2657] = this;
		Static117.anInt2657 = Static117.anInt2657 + 1 & 0x3FF;
		this.method5780();
		this.method5786();
	}
}

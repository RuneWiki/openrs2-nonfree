import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class4_Sub2_Sub1_Sub1 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
	private int anInt6953;

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "Lclient!vo;")
	private Class4_Sub8 aClass4_Sub8_1;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!vl", name = "M", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!vl", name = "Q", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
	private int anInt6954;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!vo;IIIIIIIIIIIZZ)V")
	public Class4_Sub2_Sub1_Sub1(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub8_1 = arg0;
		super.anInt6945 = arg1 << Static388.anInt6273;
		super.anInt6947 = arg2 << Static388.anInt6273;
		super.anInt6951 = arg3 << Static388.anInt6273;
		super.anInt6952 = arg9;
		this.aShort96 = this.aShort92 = (short) arg8;
		super.anInt6946 = arg10;
		super.anInt6950 = arg11;
		super.aBoolean486 = arg13;
		this.aShort95 = (short) arg4;
		this.aShort91 = (short) arg5;
		this.aShort93 = (short) arg6;
		this.anInt6954 = arg7;
		super.aByte99 = this.aClass4_Sub8_1.aClass244_2.aByte92;
		this.method5712();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "()V")
	private void method5711() {
		this.aClass4_Sub8_1.aClass4_Sub7_6.aClass4_Sub2_Sub1_Sub1Array1[this.aShort94] = null;
		Static432.aClass4_Sub2_Sub1_Sub1Array2[Static16.anInt471] = this;
		Static16.anInt471 = Static16.anInt471 + 1 & 0x3FF;
		this.method5737();
		this.method5702();
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "()V")
	private void method5712() {
		@Pc(4) int local4 = this.aClass4_Sub8_1.aClass4_Sub7_6.anInt4571;
		if (this.aClass4_Sub8_1.aClass4_Sub7_6.aClass4_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass4_Sub8_1.aClass4_Sub7_6.aClass4_Sub2_Sub1_Sub1Array1[local4].method5711();
		}
		this.aClass4_Sub8_1.aClass4_Sub7_6.aClass4_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort94 = (short) this.aClass4_Sub8_1.aClass4_Sub7_6.anInt4571;
		this.aClass4_Sub8_1.aClass4_Sub7_6.anInt4571 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub8_1.aClass141_9.method3356(this);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(JI)V")
	public void method5713(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort92 = (short) (this.aShort92 - arg1);
		if (this.aShort92 <= 0) {
			this.method5711();
			return;
		}
		@Pc(17) int local17 = super.anInt6945 >> Static388.anInt6273;
		@Pc(22) int local22 = super.anInt6947 >> Static388.anInt6273;
		@Pc(27) int local27 = super.anInt6951 >> Static388.anInt6273;
		@Pc(31) Class4_Sub7 local31 = this.aClass4_Sub8_1.aClass4_Sub7_6;
		@Pc(35) Class86 local35 = this.aClass4_Sub8_1.aClass86_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2537 != 0) {
			if (this.aShort96 - this.aShort92 <= local35.anInt2521) {
				local65 = (super.anInt6952 >> 8 & 0xFF00) + (this.anInt6953 >> 16 & 0xFF) + local35.anInt2511 * arg1;
				local82 = (super.anInt6952 & 0xFF00) + (this.anInt6953 >> 8 & 0xFF) + local35.anInt2555 * arg1;
				local99 = ((super.anInt6952 & 0xFF) << 8) + (this.anInt6953 & 0xFF) + local35.anInt2522 * arg1;
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
				super.anInt6952 &= 0xFF000000;
				super.anInt6952 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6953 &= 0xFF000000;
				this.anInt6953 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort96 - this.aShort92 <= local35.anInt2556) {
				local65 = (super.anInt6952 >> 16 & 0xFF00) + (this.anInt6953 >> 24 & 0xFF) + local35.anInt2544 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6952 &= 0xFFFFFF;
				super.anInt6952 |= (local65 & 0xFF00) << 16;
				this.anInt6953 &= 0xFFFFFF;
				this.anInt6953 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2559 != -1 && this.aShort96 - this.aShort92 <= local35.anInt2536) {
			this.anInt6954 += local35.anInt2517 * arg1;
		}
		if (local35.anInt2542 != -1 && this.aShort96 - this.aShort92 <= local35.anInt2546) {
			super.anInt6946 += local35.anInt2513 * arg1;
		}
		local65 = this.aShort95;
		local82 = this.aShort91;
		local99 = this.aShort93;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt2525 == 1) {
			local313 = local17 - this.aClass4_Sub8_1.anInt6999;
			local319 = local22 - this.aClass4_Sub8_1.anInt6998;
			local325 = local27 - this.aClass4_Sub8_1.anInt6993;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2539 * local340 * arg1;
			this.anInt6954 = (int) ((long) this.anInt6954 - ((long) this.anInt6954 * local348 >> 18));
		} else if (local35.anInt2525 == 2) {
			local313 = local17 - this.aClass4_Sub8_1.anInt6999;
			local319 = local22 - this.aClass4_Sub8_1.anInt6998;
			local325 = local27 - this.aClass4_Sub8_1.anInt6993;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2539 * local340 * arg1;
			this.anInt6954 = (int) ((long) this.anInt6954 - ((long) this.anInt6954 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray203 != null) {
			@Pc(426) Class1 local426 = local31.aClass181_45.aClass1_179;
			for (@Pc(429) Class1 local429 = local426.aClass1_261; local429 != local426; local429 = local429.aClass1_261) {
				@Pc(433) Class1_Sub2_Sub16 local433 = (Class1_Sub2_Sub16) local429;
				@Pc(436) Class102 local436 = local433.aClass102_1;
				if (local436.anInt2791 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray203.length; local444++) {
						if (local35.anIntArray203[local444] == local436.anInt2796) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt5931;
						@Pc(473) int local473 = local22 - local433.anInt5930;
						local478 = local27 - local433.anInt5925;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong88) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt5923 + local473 * local436.anInt2785 + local478 * local433.anInt5928) * 65535L / (long) (local436.anInt2784 * local501);
							if (local529 >= (long) local436.anInt2787) {
								local537 = 0;
								if (local436.anInt2795 == 1) {
									local537 = (local501 >> 4) * local436.anInt2782;
								} else if (local436.anInt2795 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt2782;
								}
								if (local436.anInt2794 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt2784;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt2784;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt2784;
									if (local436.anInt2783 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6945 += local643 * arg1 >> 15;
										super.anInt6947 += local652 * arg1 >> 15;
										super.anInt6951 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt2783 == 0) {
									local65 += (local433.anInt5923 - local537) * arg1;
									local82 += (local436.anInt2785 - local537) * arg1;
									local99 += (local433.anInt5928 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6945 += (local433.anInt5923 - local537) * arg1;
									super.anInt6947 += (local436.anInt2785 - local537) * arg1;
									super.anInt6951 += (local433.anInt5928 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray202 != null) {
			for (local313 = 0; local313 < local35.anIntArray202.length; local313++) {
				@Pc(743) Class1_Sub2_Sub16 local743 = (Class1_Sub2_Sub16) Static311.aClass258_1.method5650((long) local35.anIntArray202[local313]);
				while (local743 != null) {
					@Pc(747) Class102 local747 = local743.aClass102_1;
					local340 = local17 - local743.anInt5931;
					@Pc(757) int local757 = local22 - local743.anInt5930;
					local444 = local27 - local743.anInt5925;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong88) {
						local743 = (Class1_Sub2_Sub16) Static311.aClass258_1.method5653();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt5923 + local757 * local747.anInt2785 + local444 * local743.anInt5928) * 65535L / (long) (local747.anInt2784 * local478);
						if (local491 < (long) local747.anInt2787) {
							local743 = (Class1_Sub2_Sub16) Static311.aClass258_1.method5653();
						} else {
							local501 = 0;
							if (local747.anInt2795 == 1) {
								local501 = (local478 >> 4) * local747.anInt2782;
							} else if (local747.anInt2795 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt2782;
							}
							if (local747.anInt2794 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt2784;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt2784;
								local537 = (local444 << 15) / local478 * local747.anInt2784;
								if (local747.anInt2783 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6945 += local939 * arg1 >> 15;
									super.anInt6947 += local948 * arg1 >> 15;
									super.anInt6951 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt2783 == 0) {
								local65 += (local743.anInt5923 - local501) * arg1;
								local82 += (local747.anInt2785 - local501) * arg1;
								local99 += (local743.anInt5928 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6945 += (local743.anInt5923 - local501) * arg1;
								super.anInt6947 += (local747.anInt2785 - local501) * arg1;
								super.anInt6951 += (local743.anInt5928 - local501) * arg1;
							}
							local743 = (Class1_Sub2_Sub16) Static311.aClass258_1.method5653();
						}
					}
				}
			}
		}
		if (local35.anIntArray200 != null) {
			if (local35.anIntArray201 == null) {
				local35.anIntArray201 = new int[local35.anIntArray200.length];
				for (local313 = 0; local313 < local35.anIntArray200.length; local313++) {
					Static173.method2785(local35.anIntArray200[local313]);
					local35.anIntArray201[local313] = ((Class1_Sub43) Static30.aClass96_9.method2335((long) local35.anIntArray200[local313])).anInt6933;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray201.length; local313++) {
				@Pc(1082) Class102 local1082 = Static361.aClass102Array1[local35.anIntArray201[local313]];
				if (local1082.anInt2783 == 0) {
					local65 += local1082.anInt2790 * arg1;
					local82 += local1082.anInt2785 * arg1;
					local99 += local1082.anInt2792 * arg1;
					local303 = true;
				} else {
					super.anInt6945 += local1082.anInt2790 * arg1;
					super.anInt6947 += local1082.anInt2785 * arg1;
					super.anInt6951 += local1082.anInt2792 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort95 = (short) local65;
					this.aShort91 = (short) local82;
					this.aShort93 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6954 <<= 0x1;
			}
		}
		super.anInt6945 = (int) ((long) super.anInt6945 + ((long) this.aShort95 * (long) this.anInt6954 >> 23) * (long) arg1);
		super.anInt6947 = (int) ((long) super.anInt6947 + ((long) this.aShort91 * (long) this.anInt6954 >> 23) * (long) arg1);
		super.anInt6951 = (int) ((long) super.anInt6951 + ((long) this.aShort93 * (long) this.anInt6954 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(J)V")
	public void method5714(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt6945 >> Static31.anInt665 + 12;
		@Pc(13) int local13 = super.anInt6951 >> Static31.anInt665 + 12;
		@Pc(18) int local18 = super.anInt6947 >> Static388.anInt6273;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static132.anInt2639 || local13 < 0 || local13 >= Static87.anInt1875) {
			this.method5711();
			return;
		}
		@Pc(40) Class4_Sub7 local40 = this.aClass4_Sub8_1.aClass4_Sub7_6;
		@Pc(44) Class86 local44 = this.aClass4_Sub8_1.aClass86_1;
		@Pc(46) Class149[] local46 = Static105.aClass149Array1;
		@Pc(54) int local54 = local46[local40.anInt4576].l(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt4576 < Static68.anInt1553 - 1) {
			local70 = local46[local40.anInt4576 + 1].l(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static31.anInt665);
		}
		if (local44.aBoolean150) {
			if (local44.anInt2547 == -1 && local18 > local54) {
				this.method5711();
				return;
			}
			if (local44.anInt2547 >= 0 && local18 > local46[local44.anInt2547].l(local6, local13)) {
				this.method5711();
				return;
			}
			if (local44.anInt2543 == -1 && local18 < local70) {
				this.method5711();
				return;
			}
			if (local44.anInt2543 >= 0 && local18 < local46[local44.anInt2543 + 1].l(local6, local13)) {
				this.method5711();
				return;
			}
		}
		if (local6 >= local40.anInt4573 && local6 <= local40.anInt4574 && local13 >= local40.anInt4577 && local13 <= local40.anInt4575 && local18 <= local54 && local18 >= local70) {
			local40.aClass140_2.aClass232_1.method5227(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static68.anInt1553 - 1; local158 > 0 && local18 > local46[local158].l(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].l(local6, local13)) {
			this.method5711();
		} else if (local158 == Static68.anInt1553 - 1 && local46[local158].l(local6, local13) - local18 > 0x8 << Static31.anInt665) {
			this.method5711();
		} else {
			@Pc(211) Class80 local211 = client.lb[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = client.lb[0][local6][local13] = new Class80(0, local6, local13);
				}
				@Pc(243) boolean local243 = client.lb[0][local6][local13].aClass80_1 != null;
				if (local158 == 3 && local243) {
					this.method5711();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (client.lb[local253][local6][local13] == null) {
						local211 = client.lb[local253][local6][local13] = new Class80(local253, local6, local13);
						if (local243) {
							local211.aByte52++;
						}
					}
				}
			}
			if (local211.aClass140_1 == null) {
				local211.aClass140_1 = new Class140();
				local211.aByte51 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte51 != (byte) (arg0 & 0xFFL)) {
				local211.aClass140_1.aClass232_1.method5224();
				local211.aClass140_1.aBoolean280 = false;
				local211.aByte51 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass140_1.aClass232_1.method5227(this);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!vo;IIIIIIIIIIIZZ)V")
	public void method5715(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub8_1 = arg0;
		super.anInt6945 = arg1 << Static388.anInt6273;
		super.anInt6947 = arg2 << Static388.anInt6273;
		super.anInt6951 = arg3 << Static388.anInt6273;
		super.anInt6952 = arg9;
		this.aShort96 = this.aShort92 = (short) arg8;
		super.anInt6946 = arg10;
		super.anInt6950 = arg11;
		super.aBoolean486 = arg13;
		this.aShort95 = (short) arg4;
		this.aShort91 = (short) arg5;
		this.aShort93 = (short) arg6;
		this.anInt6954 = arg7;
		super.aByte99 = this.aClass4_Sub8_1.aClass244_2.aByte92;
		this.method5712();
	}
}

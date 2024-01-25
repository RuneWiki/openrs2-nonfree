import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class32_Sub3_Sub1_Sub1 extends Class32_Sub3_Sub1 {

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
	private int anInt2688;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "Lclient!vi;")
	private Class32_Sub8 aClass32_Sub8_1;

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
	private int anInt2689;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!vi;IIIIIIIIIIIZ)V")
	public Class32_Sub3_Sub1_Sub1(@OriginalArg(0) Class32_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass32_Sub8_1 = arg0;
		super.anInt2685 = arg1 << Static48.anInt2957;
		super.anInt2680 = arg2 << Static48.anInt2957;
		super.anInt2682 = arg3 << Static48.anInt2957;
		super.anInt2687 = arg9;
		this.aShort44 = this.aShort43 = (short) arg8;
		super.anInt2684 = arg10;
		super.anInt2681 = arg11;
		this.aShort42 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort45 = (short) arg6;
		this.anInt2689 = arg7;
		super.aByte18 = this.aClass32_Sub8_1.aClass6_2.aByte2;
		this.method2587();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(J)V")
	public void method2583(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt2685 >> 19;
		@Pc(9) int local9 = super.anInt2682 >> 19;
		@Pc(14) int local14 = super.anInt2680 >> Static48.anInt2957;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static300.anInt5778 || local9 < 0 || local9 >= Static354.anInt6714) {
			this.method2584();
			return;
		}
		@Pc(36) Class32_Sub2 local36 = this.aClass32_Sub8_1.aClass32_Sub2_5;
		@Pc(40) Class132 local40 = this.aClass32_Sub8_1.aClass132_1;
		@Pc(42) Class36[] local42 = Static258.aClass36Array2;
		@Pc(50) int local50 = local42[local36.anInt1449].method4431(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt1449 < Static263.anInt5201 - 1) {
			local66 = local42[local36.anInt1449 + 1].method4431(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean288) {
			if (local40.lb == -1 && local14 > local50) {
				this.method2584();
				return;
			}
			if (local40.lb >= 0 && local14 > local42[local40.lb].method4431(local4, local9)) {
				this.method2584();
				return;
			}
			if (local40.anInt3903 == -1 && local14 < local66) {
				this.method2584();
				return;
			}
			if (local40.anInt3903 >= 0 && local14 < local42[local40.anInt3903 + 1].method4431(local4, local9)) {
				this.method2584();
				return;
			}
		}
		if (local4 >= local36.anInt1447 && local4 <= local36.anInt1448 && local9 >= local36.anInt1451 && local9 <= local36.anInt1452 && local14 <= local50 && local14 >= local66) {
			local36.aClass26_1.aClass209_1.method5551(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static263.anInt5201 - 1; local152 > 0 && local14 > local42[local152].method4431(local4, local9); local152--) {
		}
		if (local152 == Static263.anInt5201 - 1 && local42[local152].method4431(local4, local9) - local14 > 1024) {
			this.method2584();
			return;
		}
		@Pc(190) Class155 local190 = Static105.aClass155ArrayArrayArray3[local152][local4][local9];
		if (local190 == null) {
			@Pc(205) boolean local205 = Static105.aClass155ArrayArrayArray3[0][local4][local9].aClass155_1 != null;
			if (local152 == 3 && local205) {
				this.method2584();
				return;
			}
			for (@Pc(215) int local215 = 1; local215 <= local152; local215++) {
				if (Static105.aClass155ArrayArrayArray3[local215][local4][local9] == null) {
					local190 = Static105.aClass155ArrayArrayArray3[local215][local4][local9] = new Class155(local215, local4, local9);
					if (local205) {
						local190.aByte41++;
					}
				}
			}
		}
		if (local190.aClass26_2 == null) {
			local190.aClass26_2 = new Class26();
			local190.aByte40 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte40 != (byte) (arg0 & 0xFFL)) {
			local190.aClass26_2 = new Class26();
			local190.aByte40 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass26_2.aClass209_1.method5551(this);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
	private void method2584() {
		this.aClass32_Sub8_1.aClass32_Sub2_5.aClass32_Sub3_Sub1_Sub1Array1[this.aShort40] = null;
		Static324.aClass32_Sub3_Sub1_Sub1Array2[Static139.anInt3008] = this;
		Static139.anInt3008 = Static139.anInt3008 + 1 & 0x3FF;
		this.method5725();
		this.method2578();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!vi;IIIIIIIIIIIZ)V")
	public void method2585(@OriginalArg(0) Class32_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass32_Sub8_1 = arg0;
		super.anInt2685 = arg1 << Static48.anInt2957;
		super.anInt2680 = arg2 << Static48.anInt2957;
		super.anInt2682 = arg3 << Static48.anInt2957;
		super.anInt2687 = arg9;
		this.aShort44 = this.aShort43 = (short) arg8;
		super.anInt2684 = arg10;
		super.anInt2681 = arg11;
		this.aShort42 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort45 = (short) arg6;
		this.anInt2689 = arg7;
		super.aByte18 = this.aClass32_Sub8_1.aClass6_2.aByte2;
		this.method2587();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(JI)V")
	public void method2586(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort43 = (short) (this.aShort43 - arg1);
		if (this.aShort43 <= 0) {
			this.method2584();
			return;
		}
		@Pc(17) int local17 = super.anInt2685 >> Static48.anInt2957;
		@Pc(22) int local22 = super.anInt2680 >> Static48.anInt2957;
		@Pc(27) int local27 = super.anInt2682 >> Static48.anInt2957;
		@Pc(31) Class32_Sub2 local31 = this.aClass32_Sub8_1.aClass32_Sub2_5;
		@Pc(35) Class132 local35 = this.aClass32_Sub8_1.aClass132_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3890 != 0) {
			if (this.aShort44 - this.aShort43 <= local35.anInt3907) {
				local65 = (super.anInt2687 >> 8 & 0xFF00) + (this.anInt2688 >> 16 & 0xFF) + local35.anInt3902 * arg1;
				local82 = (super.anInt2687 & 0xFF00) + (this.anInt2688 >> 8 & 0xFF) + local35.anInt3937 * arg1;
				local99 = ((super.anInt2687 & 0xFF) << 8) + (this.anInt2688 & 0xFF) + local35.anInt3916 * arg1;
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
				super.anInt2687 &= 0xFF000000;
				super.anInt2687 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2688 &= 0xFF000000;
				this.anInt2688 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort44 - this.aShort43 <= local35.anInt3900) {
				local65 = (super.anInt2687 >> 16 & 0xFF00) + (this.anInt2688 >> 24 & 0xFF) + local35.anInt3932 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2687 &= 0xFFFFFF;
				super.anInt2687 |= (local65 & 0xFF00) << 16;
				this.anInt2688 &= 0xFFFFFF;
				this.anInt2688 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3936 != -1 && this.aShort44 - this.aShort43 <= local35.anInt3919) {
			this.anInt2689 += local35.anInt3911 * arg1;
		}
		if (local35.anInt3906 != -1 && this.aShort44 - this.aShort43 <= local35.anInt3896) {
			super.anInt2684 += local35.anInt3905 * arg1;
		}
		local65 = this.aShort42;
		local82 = this.aShort41;
		local99 = this.aShort45;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3909 == 1) {
			local313 = local17 - this.aClass32_Sub8_1.anInt6500;
			local319 = local22 - this.aClass32_Sub8_1.anInt6480;
			local325 = local27 - this.aClass32_Sub8_1.anInt6483;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3920 * local340 * arg1;
			this.anInt2689 = (int) ((long) this.anInt2689 - ((long) this.anInt2689 * local348 >> 18));
		} else if (local35.anInt3909 == 2) {
			local313 = local17 - this.aClass32_Sub8_1.anInt6500;
			local319 = local22 - this.aClass32_Sub8_1.anInt6480;
			local325 = local27 - this.aClass32_Sub8_1.anInt6483;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3920 * local340 * arg1;
			this.anInt2689 = (int) ((long) this.anInt2689 - ((long) this.anInt2689 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray299 != null) {
			@Pc(426) Class1 local426 = local31.aClass42_5.aClass1_73;
			for (@Pc(429) Class1 local429 = local426.aClass1_251; local429 != local426; local429 = local429.aClass1_251) {
				@Pc(433) Class1_Sub4_Sub18 local433 = (Class1_Sub4_Sub18) local429;
				@Pc(436) Class102 local436 = local433.aClass102_1;
				if (local436.anInt3112 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray299.length; local444++) {
						if (local35.anIntArray299[local444] == local436.anInt3113) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4188;
						@Pc(473) int local473 = local22 - local433.anInt4184;
						local478 = local27 - local433.anInt4191;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong110) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4189 + local473 * local436.anInt3128 + local478 * local433.anInt4187) * 65535L / (long) (local436.anInt3120 * local501);
							if (local529 >= (long) local436.anInt3110) {
								local537 = 0;
								if (local436.anInt3118 == 1) {
									local537 = (local501 >> 4) * local436.anInt3129;
								} else if (local436.anInt3118 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3129;
								}
								if (local436.anInt3124 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3120;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3120;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3120;
									if (local436.anInt3123 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2685 += local643 * arg1 >> 15;
										super.anInt2680 += local652 * arg1 >> 15;
										super.anInt2682 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3123 == 0) {
									local65 += (local433.anInt4189 - local537) * arg1;
									local82 += (local436.anInt3128 - local537) * arg1;
									local99 += (local433.anInt4187 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2685 += (local433.anInt4189 - local537) * arg1;
									super.anInt2680 += (local436.anInt3128 - local537) * arg1;
									super.anInt2682 += (local433.anInt4187 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray301 != null) {
			for (local313 = 0; local313 < local35.anIntArray301.length; local313++) {
				@Pc(743) Class1_Sub4_Sub18 local743 = (Class1_Sub4_Sub18) Static87.aClass141_1.method3763((long) local35.anIntArray301[local313]);
				while (local743 != null) {
					@Pc(747) Class102 local747 = local743.aClass102_1;
					local340 = local17 - local743.anInt4188;
					@Pc(757) int local757 = local22 - local743.anInt4184;
					local444 = local27 - local743.anInt4191;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong110) {
						local743 = (Class1_Sub4_Sub18) Static87.aClass141_1.method3759();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4189 + local757 * local747.anInt3128 + local444 * local743.anInt4187) * 65535L / (long) (local747.anInt3120 * local478);
						if (local491 < (long) local747.anInt3110) {
							local743 = (Class1_Sub4_Sub18) Static87.aClass141_1.method3759();
						} else {
							local501 = 0;
							if (local747.anInt3118 == 1) {
								local501 = (local478 >> 4) * local747.anInt3129;
							} else if (local747.anInt3118 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3129;
							}
							if (local747.anInt3124 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3120;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3120;
								local537 = (local444 << 15) / local478 * local747.anInt3120;
								if (local747.anInt3123 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2685 += local939 * arg1 >> 15;
									super.anInt2680 += local948 * arg1 >> 15;
									super.anInt2682 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3123 == 0) {
								local65 += (local743.anInt4189 - local501) * arg1;
								local82 += (local747.anInt3128 - local501) * arg1;
								local99 += (local743.anInt4187 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2685 += (local743.anInt4189 - local501) * arg1;
								super.anInt2680 += (local747.anInt3128 - local501) * arg1;
								super.anInt2682 += (local743.anInt4187 - local501) * arg1;
							}
							local743 = (Class1_Sub4_Sub18) Static87.aClass141_1.method3759();
						}
					}
				}
			}
		}
		if (local35.anIntArray300 != null) {
			if (local35.anIntArray298 == null) {
				local35.anIntArray298 = new int[local35.anIntArray300.length];
				for (local313 = 0; local313 < local35.anIntArray300.length; local313++) {
					Static78.method1685(local35.anIntArray300[local313]);
					local35.anIntArray298[local313] = ((Class1_Sub9) Static247.aClass38_29.method1475((long) local35.anIntArray300[local313])).anInt571;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray298.length; local313++) {
				@Pc(1082) Class102 local1082 = Static2.aClass102Array1[local35.anIntArray298[local313]];
				if (local1082.anInt3123 == 0) {
					local65 += local1082.anInt3117 * arg1;
					local82 += local1082.anInt3128 * arg1;
					local99 += local1082.anInt3125 * arg1;
					local303 = true;
				} else {
					super.anInt2685 += local1082.anInt3117 * arg1;
					super.anInt2680 += local1082.anInt3128 * arg1;
					super.anInt2682 += local1082.anInt3125 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort42 = (short) local65;
					this.aShort41 = (short) local82;
					this.aShort45 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2689 <<= 0x1;
			}
		}
		super.anInt2685 = (int) ((long) super.anInt2685 + ((long) this.aShort42 * (long) this.anInt2689 >> 23) * (long) arg1);
		super.anInt2680 = (int) ((long) super.anInt2680 + ((long) this.aShort41 * (long) this.anInt2689 >> 23) * (long) arg1);
		super.anInt2682 = (int) ((long) super.anInt2682 + ((long) this.aShort45 * (long) this.anInt2689 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
	private void method2587() {
		@Pc(4) int local4 = this.aClass32_Sub8_1.aClass32_Sub2_5.anInt1445;
		if (this.aClass32_Sub8_1.aClass32_Sub2_5.aClass32_Sub3_Sub1_Sub1Array1[local4] != null) {
			this.aClass32_Sub8_1.aClass32_Sub2_5.aClass32_Sub3_Sub1_Sub1Array1[local4].method2584();
		}
		this.aClass32_Sub8_1.aClass32_Sub2_5.aClass32_Sub3_Sub1_Sub1Array1[local4] = this;
		this.aShort40 = (short) this.aClass32_Sub8_1.aClass32_Sub2_5.anInt1445;
		this.aClass32_Sub8_1.aClass32_Sub2_5.anInt1445 = local4 + 1 & 0x1FFF;
		this.aClass32_Sub8_1.aClass195_9.method5300(this);
	}
}

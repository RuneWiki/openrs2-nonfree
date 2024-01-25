import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class102_Sub1_Sub1_Sub1 extends Class102_Sub1_Sub1 {

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	private int anInt2524;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "Lclient!uba;")
	public Class102_Sub7 aClass102_Sub7_1;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
	private int anInt2523;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!uba;IIIIIIIIIIIZZ)V")
	public Class102_Sub1_Sub1_Sub1(@OriginalArg(0) Class102_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass102_Sub7_1 = arg0;
		super.anInt2516 = arg1 << 12;
		super.anInt2521 = arg2 << 12;
		super.anInt2518 = arg3 << 12;
		super.anInt2519 = arg9;
		this.aShort60 = this.aShort59 = (short) arg8;
		super.anInt2520 = arg10;
		super.anInt2522 = arg11;
		super.aBoolean171 = arg13;
		this.aShort58 = (short) arg4;
		this.aShort62 = (short) arg5;
		this.aShort63 = (short) arg6;
		this.anInt2523 = arg7;
		super.aByte46 = this.aClass102_Sub7_1.aClass163_2.aByte53;
		this.method2133();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	private void method2133() {
		@Pc(4) int local4 = this.aClass102_Sub7_1.aClass102_Sub6_7.anInt8274;
		if (this.aClass102_Sub7_1.aClass102_Sub6_7.aClass102_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass102_Sub7_1.aClass102_Sub6_7.aClass102_Sub1_Sub1_Sub1Array2[local4].method2134();
		}
		this.aClass102_Sub7_1.aClass102_Sub6_7.aClass102_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort61 = (short) this.aClass102_Sub7_1.aClass102_Sub6_7.anInt8274;
		this.aClass102_Sub7_1.aClass102_Sub6_7.anInt8274 = local4 + 1 & 0x1FFF;
		this.aClass102_Sub7_1.aClass249_9.method5809(this);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	public void method2134() {
		this.aClass102_Sub7_1.aClass102_Sub6_7.aClass102_Sub1_Sub1_Sub1Array2[this.aShort61] = null;
		Static326.aClass102_Sub1_Sub1_Sub1Array1[Static553.anInt9290] = this;
		Static553.anInt9290 = Static553.anInt9290 + 1 & 0x3FF;
		this.method7587();
		this.method6765();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!uba;IIIIIIIIIIIZZ)V")
	public void method2135(@OriginalArg(0) Class102_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass102_Sub7_1 = arg0;
		super.anInt2516 = arg1 << 12;
		super.anInt2521 = arg2 << 12;
		super.anInt2518 = arg3 << 12;
		super.anInt2519 = arg9;
		this.aShort60 = this.aShort59 = (short) arg8;
		super.anInt2520 = arg10;
		super.anInt2522 = arg11;
		super.aBoolean171 = arg13;
		this.aShort58 = (short) arg4;
		this.aShort62 = (short) arg5;
		this.aShort63 = (short) arg6;
		this.anInt2523 = arg7;
		super.aByte46 = this.aClass102_Sub7_1.aClass163_2.aByte53;
		this.method2133();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)V")
	public void method2136(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort59 = (short) (this.aShort59 - arg1);
		if (this.aShort59 <= 0) {
			this.method2134();
			return;
		}
		@Pc(17) int local17 = super.anInt2516 >> 12;
		@Pc(22) int local22 = super.anInt2521 >> 12;
		@Pc(27) int local27 = super.anInt2518 >> 12;
		@Pc(31) Class102_Sub6 local31 = this.aClass102_Sub7_1.aClass102_Sub6_7;
		@Pc(35) Class242 local35 = this.aClass102_Sub7_1.aClass242_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6508 != 0) {
			if (this.aShort60 - this.aShort59 <= local35.anInt6516) {
				local65 = (super.anInt2519 >> 8 & 0xFF00) + (this.anInt2524 >> 16 & 0xFF) + local35.anInt6507 * arg1;
				local82 = (super.anInt2519 & 0xFF00) + (this.anInt2524 >> 8 & 0xFF) + local35.anInt6549 * arg1;
				local99 = ((super.anInt2519 & 0xFF) << 8) + (this.anInt2524 & 0xFF) + local35.anInt6525 * arg1;
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
				super.anInt2519 &= 0xFF000000;
				super.anInt2519 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2524 &= 0xFF000000;
				this.anInt2524 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort60 - this.aShort59 <= local35.anInt6548) {
				local65 = (super.anInt2519 >> 16 & 0xFF00) + (this.anInt2524 >> 24 & 0xFF) + local35.anInt6504 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2519 &= 0xFFFFFF;
				super.anInt2519 |= (local65 & 0xFF00) << 16;
				this.anInt2524 &= 0xFFFFFF;
				this.anInt2524 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6514 != -1 && this.aShort60 - this.aShort59 <= local35.anInt6550) {
			this.anInt2523 += local35.lb * arg1;
		}
		if (local35.anInt6528 != -1 && this.aShort60 - this.aShort59 <= local35.anInt6530) {
			super.anInt2520 += local35.anInt6529 * arg1;
		}
		local65 = this.aShort58;
		local82 = this.aShort62;
		local99 = this.aShort63;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(342) int local342;
		@Pc(350) long local350;
		if (local35.anInt6510 == 1) {
			local313 = local17 - this.aClass102_Sub7_1.anInt8398;
			local319 = local22 - this.aClass102_Sub7_1.anInt8403;
			local325 = local27 - this.aClass102_Sub7_1.anInt8406;
			local342 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325)) >> 2;
			local350 = local35.anInt6499 * local342 * arg1;
			this.anInt2523 = (int) ((long) this.anInt2523 - ((long) this.anInt2523 * local350 >> 18));
		} else if (local35.anInt6510 == 2) {
			local313 = local17 - this.aClass102_Sub7_1.anInt8398;
			local319 = local22 - this.aClass102_Sub7_1.anInt8403;
			local325 = local27 - this.aClass102_Sub7_1.anInt8406;
			local342 = local313 * local313 + local319 * local319 + local325 * local325;
			local350 = local35.anInt6499 * local342 * arg1;
			this.anInt2523 = (int) ((long) this.anInt2523 - ((long) this.anInt2523 * local350 >> 28));
		}
		@Pc(446) int local446;
		@Pc(480) int local480;
		@Pc(493) long local493;
		@Pc(503) int local503;
		@Pc(539) int local539;
		if (local35.anIntArray551 != null) {
			@Pc(428) Class6 local428 = local31.aClass275_175.aClass6_229;
			for (@Pc(431) Class6 local431 = local428.aClass6_284; local431 != local428; local431 = local431.aClass6_284) {
				@Pc(435) Class6_Sub1_Sub14 local435 = (Class6_Sub1_Sub14) local431;
				@Pc(438) Class319 local438 = local435.aClass319_1;
				if (local438.anInt8965 != 1) {
					@Pc(444) boolean local444 = false;
					for (local446 = 0; local446 < local35.anIntArray551.length; local446++) {
						if (local35.anIntArray551[local446] == local438.anInt8952) {
							local444 = true;
							break;
						}
					}
					if (local444) {
						@Pc(470) int local470 = local17 - local435.anInt6409;
						@Pc(475) int local475 = local22 - local435.anInt6405;
						local480 = local27 - local435.anInt6404;
						local493 = local470 * local470 + local475 * local475 + local480 * local480;
						if (local493 <= local438.aLong223) {
							local503 = (int) Math.sqrt((double) local493);
							if (local503 == 0) {
								local503 = 1;
							}
							@Pc(531) long local531 = (long) (local470 * local435.anInt6403 + local475 * local438.anInt8961 + local480 * local435.anInt6407) * 65535L / (long) (local438.anInt8955 * local503);
							if (local531 >= (long) local438.anInt8963) {
								local539 = 0;
								if (local438.anInt8964 == 1) {
									local539 = (local503 >> 4) * local438.anInt8954;
								} else if (local438.anInt8964 == 2) {
									local539 = (local503 >> 4) * (local503 >> 4) * local438.anInt8954;
								}
								if (local438.anInt8967 != 0) {
									@Pc(645) int local645 = (local470 << 15) / local503 * local438.anInt8955;
									@Pc(654) int local654 = (local475 << 15) / local503 * local438.anInt8955;
									@Pc(663) int local663 = (local480 << 15) / local503 * local438.anInt8955;
									if (local438.anInt8966 == 0) {
										local65 += local645 * arg1 >> 15;
										local82 += local654 * arg1 >> 15;
										local99 += local663 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2516 += local645 * arg1 >> 15;
										super.anInt2521 += local654 * arg1 >> 15;
										super.anInt2518 += local663 * arg1 >> 15;
									}
								} else if (local438.anInt8966 == 0) {
									local65 += (local435.anInt6403 - local539) * arg1;
									local82 += (local438.anInt8961 - local539) * arg1;
									local99 += (local435.anInt6407 - local539) * arg1;
									local303 = true;
								} else {
									super.anInt2516 += (local435.anInt6403 - local539) * arg1;
									super.anInt2521 += (local438.anInt8961 - local539) * arg1;
									super.anInt2518 += (local435.anInt6407 - local539) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray552 != null) {
			for (local313 = 0; local313 < local35.anIntArray552.length; local313++) {
				@Pc(745) Class6_Sub1_Sub14 local745 = (Class6_Sub1_Sub14) Static106.aClass162_1.method3459((long) local35.anIntArray552[local313]);
				while (local745 != null) {
					@Pc(749) Class319 local749 = local745.aClass319_1;
					local342 = local17 - local745.anInt6409;
					@Pc(759) int local759 = local22 - local745.anInt6405;
					local446 = local27 - local745.anInt6404;
					@Pc(777) long local777 = (long) (local342 * local342 + local759 * local759 + local446 * local446);
					if (local777 > local749.aLong223) {
						local745 = (Class6_Sub1_Sub14) Static106.aClass162_1.method3463();
					} else {
						local480 = (int) Math.sqrt((double) local777);
						if (local480 == 0) {
							local480 = 1;
						}
						local493 = (long) (local342 * local745.anInt6403 + local759 * local749.anInt8961 + local446 * local745.anInt6407) * 65535L / (long) (local749.anInt8955 * local480);
						if (local493 < (long) local749.anInt8963) {
							local745 = (Class6_Sub1_Sub14) Static106.aClass162_1.method3463();
						} else {
							local503 = 0;
							if (local749.anInt8964 == 1) {
								local503 = (local480 >> 4) * local749.anInt8954;
							} else if (local749.anInt8964 == 2) {
								local503 = (local480 >> 4) * (local480 >> 4) * local749.anInt8954;
							}
							if (local749.anInt8967 != 0) {
								@Pc(941) int local941 = (local342 << 15) / local480 * local749.anInt8955;
								@Pc(950) int local950 = (local759 << 15) / local480 * local749.anInt8955;
								local539 = (local446 << 15) / local480 * local749.anInt8955;
								if (local749.anInt8966 == 0) {
									local65 += local941 * arg1 >> 15;
									local82 += local950 * arg1 >> 15;
									local99 += local539 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2516 += local941 * arg1 >> 15;
									super.anInt2521 += local950 * arg1 >> 15;
									super.anInt2518 += local539 * arg1 >> 15;
								}
							} else if (local749.anInt8966 == 0) {
								local65 += (local745.anInt6403 - local503) * arg1;
								local82 += (local749.anInt8961 - local503) * arg1;
								local99 += (local745.anInt6407 - local503) * arg1;
								local303 = true;
							} else {
								super.anInt2516 += (local745.anInt6403 - local503) * arg1;
								super.anInt2521 += (local749.anInt8961 - local503) * arg1;
								super.anInt2518 += (local745.anInt6407 - local503) * arg1;
							}
							local745 = (Class6_Sub1_Sub14) Static106.aClass162_1.method3463();
						}
					}
				}
			}
		}
		if (local35.anIntArray554 != null) {
			if (local35.anIntArray550 == null) {
				local35.anIntArray550 = new int[local35.anIntArray554.length];
				for (local313 = 0; local313 < local35.anIntArray554.length; local313++) {
					Static342.method7459(local35.anIntArray554[local313]);
					local35.anIntArray550[local313] = ((Class6_Sub9) Static304.aClass212_23.method5106((long) local35.anIntArray554[local313])).anInt1006;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray550.length; local313++) {
				@Pc(1084) Class319 local1084 = Static253.aClass319Array1[local35.anIntArray550[local313]];
				if (local1084.anInt8966 == 0) {
					local65 += local1084.anInt8956 * arg1;
					local82 += local1084.anInt8961 * arg1;
					local99 += local1084.anInt8957 * arg1;
					local303 = true;
				} else {
					super.anInt2516 += local1084.anInt8956 * arg1;
					super.anInt2521 += local1084.anInt8961 * arg1;
					super.anInt2518 += local1084.anInt8957 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort58 = (short) local65;
					this.aShort62 = (short) local82;
					this.aShort63 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2523 <<= 0x1;
			}
		}
		super.anInt2516 = (int) ((long) super.anInt2516 + ((long) this.aShort58 * (long) (this.anInt2523 << 2) >> 23) * (long) arg1);
		super.anInt2521 = (int) ((long) super.anInt2521 + ((long) this.aShort62 * (long) (this.anInt2523 << 2) >> 23) * (long) arg1);
		super.anInt2518 = (int) ((long) super.anInt2518 + ((long) this.aShort63 * (long) (this.anInt2523 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method2137(@OriginalArg(0) Class121 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2516 >> Static188.anInt3275 + 12;
		@Pc(13) int local13 = super.anInt2518 >> Static188.anInt3275 + 12;
		@Pc(18) int local18 = super.anInt2521 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static80.anInt1391 || local13 < 0 || local13 >= Static164.anInt2881) {
			this.method2134();
			return;
		}
		@Pc(40) Class102_Sub6 local40 = this.aClass102_Sub7_1.aClass102_Sub6_7;
		@Pc(44) Class242 local44 = this.aClass102_Sub7_1.aClass242_1;
		@Pc(46) Class60[] local46 = Static285.aClass60Array8;
		@Pc(49) int local49 = local40.anInt8280;
		@Pc(58) Class9 local58 = Static208.aClass9ArrayArrayArray3[local40.anInt8280][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte8;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static41.anInt687 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static188.anInt3275);
		}
		if (local44.aBoolean445) {
			if (local44.anInt6521 == -1 && local18 > local70) {
				this.method2134();
				return;
			}
			if (local44.anInt6521 >= 0 && local18 > local46[local44.anInt6521].JA(local6, local13)) {
				this.method2134();
				return;
			}
			if (local44.anInt6501 == -1 && local18 < local84) {
				this.method2134();
				return;
			}
			if (local44.anInt6501 >= 0 && local18 < local46[local44.anInt6501 + 1].JA(local6, local13)) {
				this.method2134();
				return;
			}
		}
		if (local6 >= local40.anInt8281 && local6 <= local40.anInt8278 && local13 >= local40.anInt8276 && local13 <= local40.anInt8279 && local18 <= local70 && local18 >= local84) {
			local40.aClass222_2.aClass118_1.method2333(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static41.anInt687 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean446 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method2134();
		} else if (local172 == Static41.anInt687 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static188.anInt3275) {
			this.method2134();
		} else {
			local58 = Static208.aClass9ArrayArrayArray3[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static208.aClass9ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static208.aClass9ArrayArrayArray3[0][local6][local13] = new Class9(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static208.aClass9ArrayArrayArray3[0][local6][local13].aClass9_1 != null;
				if (local172 == 3 && local268) {
					this.method2134();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static208.aClass9ArrayArrayArray3[local278][local6][local13] == null) {
						local58 = Static208.aClass9ArrayArrayArray3[local278][local6][local13] = new Class9(local278, local6, local13);
						if (local268) {
							local58.aByte8++;
						}
					}
				}
			}
			if (local44.aBoolean447) {
				@Pc(323) int local323 = super.anInt2516 >> 12;
				local278 = super.anInt2518 >> 12;
				@Pc(337) Class330 local337;
				if (local58.aClass29_Sub5_1 != null) {
					local337 = local58.aClass29_Sub5_1.method7539(arg0);
					if (local337 != null && local337.method7490(local278, local18, local323)) {
						this.method2134();
						return;
					}
				}
				if (local58.aClass29_Sub5_2 != null) {
					local337 = local58.aClass29_Sub5_2.method7539(arg0);
					if (local337 != null && local337.method7490(local278, local18, local323)) {
						this.method2134();
						return;
					}
				}
				if (local58.aClass29_Sub3_1 != null) {
					local337 = local58.aClass29_Sub3_1.method7539(arg0);
					if (local337 != null && local337.method7490(local278, local18, local323)) {
						this.method2134();
						return;
					}
				}
				for (@Pc(394) Class66 local394 = local58.aClass66_1; local394 != null; local394 = local394.aClass66_2) {
					@Pc(401) Class330 local401 = local394.aClass29_Sub2_1.method7539(arg0);
					if (local401 != null && local401.method7490(local278, local18, local323)) {
						this.method2134();
						return;
					}
				}
			}
			if (local58.aClass222_1 == null) {
				local58.aClass222_1 = new Class222();
				local58.aByte6 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte6 != (byte) (arg1 & 0xFFL)) {
				local58.aClass222_1.aClass118_1.method2332();
				local58.aClass222_1.aBoolean423 = false;
				local58.aByte6 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass222_1.aClass118_1.method2333(this);
		}
	}
}

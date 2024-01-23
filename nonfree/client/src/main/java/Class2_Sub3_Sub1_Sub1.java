import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public class Class2_Sub3_Sub1_Sub1 extends Class2_Sub3_Sub1 {

	@OriginalMember(owner = "client!af", name = "T", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class2_Sub3_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5466 = arg0;
		this.anInt5457 = arg1;
		this.anInt5454 = arg2;
		this.anInt5465 = arg3;
		this.anInt5453 = arg4;
		this.anInt5462 = arg5;
		this.anIntArray479 = arg6;
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(II)V")
	public Class2_Sub3_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray479 = new int[arg0 * arg1];
		this.anInt5453 = this.anInt5466 = arg0;
		this.anInt5462 = this.anInt5457 = arg1;
		this.anInt5454 = this.anInt5465 = 0;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public final void method4373(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[this.anInt5453 * this.anInt5462];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt5462; local10++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt5453; local16++) {
				@Pc(25) int local25 = this.anIntArray479[local8];
				if (local25 == 0) {
					if (local16 > 0 && this.anIntArray479[local8 - 1] != 0) {
						local25 = arg0;
					} else if (local10 > 0 && this.anIntArray479[local8 - this.anInt5453] != 0) {
						local25 = arg0;
					} else if (local16 < this.anInt5453 - 1 && this.anIntArray479[local8 + 1] != 0) {
						local25 = arg0;
					} else if (local10 < this.anInt5462 - 1 && this.anIntArray479[local8 + this.anInt5453] != 0) {
						local25 = arg0;
					}
				}
				local6[local8++] = local25;
			}
		}
		this.anIntArray479 = local6;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static160.anInt3390;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg8[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local39 * local78;
				@Pc(94) int local94 = local63 - local33 * local78;
				for (@Pc(99) int local99 = -arg9[local71]; local99 < 0; local99++) {
					Static160.anIntArray254[local82++] = this.anIntArray479[(local88 >> 16) + (local94 >> 16) * this.anInt5453];
					local88 += local39;
					local94 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static160.anInt3390;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
	@Override
	public void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt5454;
		arg1 += this.anInt5465;
		@Pc(15) int local15 = arg0 + arg1 * Static160.anInt3390;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5462;
		@Pc(23) int local23 = this.anInt5453;
		@Pc(27) int local27 = Static160.anInt3390 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static160.anInt3391) {
			local36 = Static160.anInt3391 - arg1;
			local20 -= local36;
			arg1 = Static160.anInt3391;
			local17 = local36 * local23;
			local15 += local36 * Static160.anInt3390;
		}
		if (arg1 + local20 > Static160.anInt3392) {
			local20 -= arg1 + local20 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local36 = Static160.anInt3389 - arg0;
			local23 -= local36;
			arg0 = Static160.anInt3389;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static160.anInt3387) {
			local36 = arg0 + local23 - Static160.anInt3387;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static300.method4377(Static160.anIntArray254, this.anIntArray479, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt5453;
		@Pc(10) int local10 = this.anInt5462;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt5466;
		@Pc(20) int local20 = this.anInt5457;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt5454 > 0) {
			local46 = ((this.anInt5454 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt5454 << 16);
		}
		if (this.anInt5465 > 0) {
			local46 = ((this.anInt5465 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt5465 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static160.anInt3390;
		@Pc(130) int local130 = Static160.anInt3390 - arg2;
		if (arg1 + arg3 > Static160.anInt3392) {
			arg3 -= arg1 + arg3 - Static160.anInt3392;
		}
		@Pc(150) int local150;
		if (arg1 < Static160.anInt3391) {
			local150 = Static160.anInt3391 - arg1;
			arg3 -= local150;
			local46 += local150 * Static160.anInt3390;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static160.anInt3387) {
			local150 = arg0 + arg2 - Static160.anInt3387;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static160.anInt3389) {
			local150 = Static160.anInt3389 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static300.method4388(Static160.anIntArray254, this.anIntArray479, local12, local14, local46, local130, arg2, arg3, local26, local32, local7, arg4);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()V")
	public final void method4375() {
		@Pc(2) int[] local2 = this.anIntArray479;
		for (@Pc(9) int local9 = (this.anInt5462 >> 1) - 1; local9 >= 0; local9--) {
			@Pc(16) int local16 = local9 * this.anInt5453;
			@Pc(26) int local26 = (this.anInt5462 - local9 - 1) * this.anInt5453;
			for (@Pc(30) int local30 = -this.anInt5453; local30 < 0; local30++) {
				@Pc(36) int local36 = local2[local16];
				local2[local16] = local2[local26];
				local2[local26] = local36;
				local16++;
				local26++;
			}
		}
		this.anInt5465 = this.anInt5457 - this.anInt5462 - this.anInt5465;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(II)V")
	@Override
	public void method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt5454;
		arg1 += this.anInt5465;
		@Pc(15) int local15 = arg0 + arg1 * Static160.anInt3390;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5462;
		@Pc(23) int local23 = this.anInt5453;
		@Pc(27) int local27 = Static160.anInt3390 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static160.anInt3391) {
			local36 = Static160.anInt3391 - arg1;
			local20 -= local36;
			arg1 = Static160.anInt3391;
			local17 = local36 * local23;
			local15 += local36 * Static160.anInt3390;
		}
		if (arg1 + local20 > Static160.anInt3392) {
			local20 -= arg1 + local20 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local36 = Static160.anInt3389 - arg0;
			local23 -= local36;
			arg0 = Static160.anInt3389;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static160.anInt3387) {
			local36 = arg0 + local23 - Static160.anInt3387;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static300.method4385(Static160.anIntArray254, this.anIntArray479, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
	@Override
	public void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt5454;
		arg1 += this.anInt5465;
		@Pc(15) int local15 = arg0 + arg1 * Static160.anInt3390;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5462;
		@Pc(23) int local23 = this.anInt5453;
		@Pc(27) int local27 = Static160.anInt3390 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static160.anInt3391) {
			local36 = Static160.anInt3391 - arg1;
			local20 -= local36;
			arg1 = Static160.anInt3391;
			local17 = local36 * local23;
			local15 += local36 * Static160.anInt3390;
		}
		if (arg1 + local20 > Static160.anInt3392) {
			local20 -= arg1 + local20 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local36 = Static160.anInt3389 - arg0;
			local23 -= local36;
			arg0 = Static160.anInt3389;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static160.anInt3387) {
			local36 = arg0 + local23 - Static160.anInt3387;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static300.method4386(Static160.anIntArray254, this.anIntArray479, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected void method4365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			return;
		}
		@Pc(9) int local9 = arg0 - (this.anInt5454 << 4);
		@Pc(16) int local16 = arg1 - (this.anInt5465 << 4);
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) arg5 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) arg5 + 0.5D);
		@Pc(53) int local53 = -local9 * local43 + -local16 * local33;
		@Pc(64) int local64 = --local9 * local33 + -local16 * local43;
		@Pc(78) int local78 = ((this.anInt5453 << 4) - local9) * local43 + -local16 * local33;
		@Pc(93) int local93 = -((this.anInt5453 << 4) - local9) * local33 + -local16 * local43;
		@Pc(107) int local107 = -local9 * local43 + ((this.anInt5462 << 4) - local16) * local33;
		@Pc(122) int local122 = --local9 * local33 + ((this.anInt5462 << 4) - local16) * local43;
		@Pc(140) int local140 = ((this.anInt5453 << 4) - local9) * local43 + ((this.anInt5462 << 4) - local16) * local33;
		@Pc(159) int local159 = -((this.anInt5453 << 4) - local9) * local33 + ((this.anInt5462 << 4) - local16) * local43;
		@Pc(164) int local164;
		@Pc(166) int local166;
		if (local53 < local78) {
			local164 = local53;
			local166 = local78;
		} else {
			local164 = local78;
			local166 = local53;
		}
		if (local107 < local164) {
			local164 = local107;
		}
		if (local140 < local164) {
			local164 = local140;
		}
		if (local107 > local166) {
			local166 = local107;
		}
		if (local140 > local166) {
			local166 = local140;
		}
		@Pc(196) int local196;
		@Pc(198) int local198;
		if (local64 < local93) {
			local196 = local64;
			local198 = local93;
		} else {
			local196 = local93;
			local198 = local64;
		}
		if (local122 < local196) {
			local196 = local122;
		}
		if (local159 < local196) {
			local196 = local159;
		}
		if (local122 > local198) {
			local198 = local122;
		}
		if (local159 > local198) {
			local198 = local159;
		}
		local164 >>= 0xC;
		local166 = local166 + 4095 >> 12;
		local196 >>= 0xC;
		local198 = local198 + 4095 >> 12;
		local164 += arg2;
		local166 += arg2;
		local196 += arg3;
		local198 += arg3;
		local164 >>= 0x4;
		local166 = local166 + 15 >> 4;
		local196 >>= 0x4;
		local198 = local198 + 15 >> 4;
		if (local164 < Static160.anInt3389) {
			local164 = Static160.anInt3389;
		}
		if (local166 > Static160.anInt3387) {
			local166 = Static160.anInt3387;
		}
		if (local196 < Static160.anInt3391) {
			local196 = Static160.anInt3391;
		}
		if (local198 > Static160.anInt3392) {
			local198 = Static160.anInt3392;
		}
		local166 = local164 - local166;
		if (local166 >= 0) {
			return;
		}
		local198 = local196 - local198;
		if (local198 >= 0) {
			return;
		}
		@Pc(319) int local319 = local196 * Static160.anInt3390 + local164;
		@Pc(324) double local324 = 1.6777216E7D / (double) arg5;
		@Pc(333) int local333 = (int) Math.floor(Math.sin(local23) * local324 + 0.5D);
		@Pc(342) int local342 = (int) Math.floor(Math.cos(local23) * local324 + 0.5D);
		@Pc(350) int local350 = (local164 << 4) + 8 - arg2;
		@Pc(358) int local358 = (local196 << 4) + 8 - arg3;
		@Pc(368) int local368 = (local9 << 8) - (local358 * local333 >> 4);
		@Pc(378) int local378 = (local16 << 8) + (local358 * local342 >> 4);
		@Pc(384) int local384;
		@Pc(388) int local388;
		@Pc(468) int local468;
		@Pc(394) int local394;
		@Pc(432) int local432;
		@Pc(496) int local496;
		if (local342 != 0) {
			@Pc(694) int local694;
			if (local342 < 0) {
				if (local333 == 0) {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local694 = local368 + (local350 * local342 >> 4);
						local394 = local166;
						if (local378 >= 0 && local378 - (this.anInt5462 << 12) < 0) {
							@Pc(717) int local717;
							if ((local717 = local694 - (this.anInt5453 << 12)) >= 0) {
								local496 = (local342 - local717) / local342;
								local394 = local166 + local496;
								local694 += local342 * local496;
								local388 = local319 + local496;
							}
							@Pc(745) int local745;
							if ((local745 = (local694 - local342) / local342) > local394) {
								local394 = local745;
							}
							while (local394 < 0) {
								local432 = this.anIntArray479[(local378 >> 12) * this.anInt5453 + (local694 >> 12)];
								if (local432 == 0) {
									local388++;
								} else {
									Static160.anIntArray254[local388++] = local432;
								}
								local694 += local342;
								local394++;
							}
						}
						local384++;
						local378 += local342;
						local319 += Static160.anInt3390;
					}
				} else if (local333 < 0) {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local694 = local368 + (local350 * local342 >> 4);
						local468 = local378 + (local350 * local333 >> 4);
						local394 = local166;
						@Pc(825) int local825;
						if ((local825 = local694 - (this.anInt5453 << 12)) >= 0) {
							local496 = (local342 - local825) / local342;
							local394 = local166 + local496;
							local694 += local342 * local496;
							local468 += local333 * local496;
							local388 = local319 + local496;
						}
						@Pc(859) int local859;
						if ((local859 = (local694 - local342) / local342) > local394) {
							local394 = local859;
						}
						@Pc(871) int local871;
						if ((local871 = local468 - (this.anInt5462 << 12)) >= 0) {
							local496 = (local333 - local871) / local333;
							local394 += local496;
							local694 += local342 * local496;
							local468 += local333 * local496;
							local388 += local496;
						}
						@Pc(905) int local905;
						if ((local905 = (local468 - local333) / local333) > local394) {
							local394 = local905;
						}
						while (local394 < 0) {
							local432 = this.anIntArray479[(local468 >> 12) * this.anInt5453 + (local694 >> 12)];
							if (local432 == 0) {
								local388++;
							} else {
								Static160.anIntArray254[local388++] = local432;
							}
							local694 += local342;
							local468 += local333;
							local394++;
						}
						local384++;
						local368 -= local333;
						local378 += local342;
						local319 += Static160.anInt3390;
					}
				} else {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local694 = local368 + (local350 * local342 >> 4);
						local468 = local378 + (local350 * local333 >> 4);
						local394 = local166;
						@Pc(991) int local991;
						if ((local991 = local694 - (this.anInt5453 << 12)) >= 0) {
							local496 = (local342 - local991) / local342;
							local394 = local166 + local496;
							local694 += local342 * local496;
							local468 += local333 * local496;
							local388 = local319 + local496;
						}
						@Pc(1025) int local1025;
						if ((local1025 = (local694 - local342) / local342) > local394) {
							local394 = local1025;
						}
						if (local468 < 0) {
							local496 = (local333 - local468 - 1) / local333;
							local394 += local496;
							local694 += local342 * local496;
							local468 += local333 * local496;
							local388 += local496;
						}
						@Pc(1073) int local1073;
						if ((local1073 = (local468 + 1 - (this.anInt5462 << 12) - local333) / local333) > local394) {
							local394 = local1073;
						}
						while (local394 < 0) {
							local432 = this.anIntArray479[(local468 >> 12) * this.anInt5453 + (local694 >> 12)];
							if (local432 == 0) {
								local388++;
							} else {
								Static160.anIntArray254[local388++] = local432;
							}
							local694 += local342;
							local468 += local333;
							local394++;
						}
						local384++;
						local368 -= local333;
						local378 += local342;
						local319 += Static160.anInt3390;
					}
				}
			} else if (local333 == 0) {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local694 = local368 + (local350 * local342 >> 4);
					local394 = local166;
					if (local378 >= 0 && local378 - (this.anInt5462 << 12) < 0) {
						if (local694 < 0) {
							local496 = (local342 - local694 - 1) / local342;
							local394 = local166 + local496;
							local694 += local342 * local496;
							local388 = local319 + local496;
						}
						@Pc(1196) int local1196;
						if ((local1196 = (local694 + 1 - (this.anInt5453 << 12) - local342) / local342) > local394) {
							local394 = local1196;
						}
						while (local394 < 0) {
							local432 = this.anIntArray479[(local378 >> 12) * this.anInt5453 + (local694 >> 12)];
							if (local432 == 0) {
								local388++;
							} else {
								Static160.anIntArray254[local388++] = local432;
							}
							local694 += local342;
							local394++;
						}
					}
					local384++;
					local378 += local342;
					local319 += Static160.anInt3390;
				}
			} else if (local333 < 0) {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local694 = local368 + (local350 * local342 >> 4);
					local468 = local378 + (local350 * local333 >> 4);
					local394 = local166;
					if (local694 < 0) {
						local496 = (local342 - local694 - 1) / local342;
						local394 = local166 + local496;
						local694 += local342 * local496;
						local468 += local333 * local496;
						local388 = local319 + local496;
					}
					@Pc(1312) int local1312;
					if ((local1312 = (local694 + 1 - (this.anInt5453 << 12) - local342) / local342) > local394) {
						local394 = local1312;
					}
					@Pc(1324) int local1324;
					if ((local1324 = local468 - (this.anInt5462 << 12)) >= 0) {
						local496 = (local333 - local1324) / local333;
						local394 += local496;
						local694 += local342 * local496;
						local468 += local333 * local496;
						local388 += local496;
					}
					@Pc(1358) int local1358;
					if ((local1358 = (local468 - local333) / local333) > local394) {
						local394 = local1358;
					}
					while (local394 < 0) {
						local432 = this.anIntArray479[(local468 >> 12) * this.anInt5453 + (local694 >> 12)];
						if (local432 == 0) {
							local388++;
						} else {
							Static160.anIntArray254[local388++] = local432;
						}
						local694 += local342;
						local468 += local333;
						local394++;
					}
					local384++;
					local368 -= local333;
					local378 += local342;
					local319 += Static160.anInt3390;
				}
			} else {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local694 = local368 + (local350 * local342 >> 4);
					local468 = local378 + (local350 * local333 >> 4);
					local394 = local166;
					if (local694 < 0) {
						local496 = (local342 - local694 - 1) / local342;
						local394 = local166 + local496;
						local694 += local342 * local496;
						local468 += local333 * local496;
						local388 = local319 + local496;
					}
					@Pc(1480) int local1480;
					if ((local1480 = (local694 + 1 - (this.anInt5453 << 12) - local342) / local342) > local394) {
						local394 = local1480;
					}
					if (local468 < 0) {
						local496 = (local333 - local468 - 1) / local333;
						local394 += local496;
						local694 += local342 * local496;
						local468 += local333 * local496;
						local388 += local496;
					}
					@Pc(1528) int local1528;
					if ((local1528 = (local468 + 1 - (this.anInt5462 << 12) - local333) / local333) > local394) {
						local394 = local1528;
					}
					while (local394 < 0) {
						local432 = this.anIntArray479[(local468 >> 12) * this.anInt5453 + (local694 >> 12)];
						if (local432 == 0) {
							local388++;
						} else {
							Static160.anIntArray254[local388++] = local432;
						}
						local694 += local342;
						local468 += local333;
						local394++;
					}
					local384++;
					local368 -= local333;
					local378 += local342;
					local319 += Static160.anInt3390;
				}
			}
		} else if (local333 == 0) {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local394 = local166;
				if (local368 >= 0 && local378 >= 0 && local368 - (this.anInt5453 << 12) < 0 && local378 - (this.anInt5462 << 12) < 0) {
					while (local394 < 0) {
						local432 = this.anIntArray479[(local378 >> 12) * this.anInt5453 + (local368 >> 12)];
						if (local432 == 0) {
							local388++;
						} else {
							Static160.anIntArray254[local388++] = local432;
						}
						local394++;
					}
				}
				local384++;
				local319 += Static160.anInt3390;
			}
		} else if (local333 < 0) {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local468 = local378 + (local350 * local333 >> 4);
				local394 = local166;
				if (local368 >= 0 && local368 - (this.anInt5453 << 12) < 0) {
					@Pc(489) int local489;
					if ((local489 = local468 - (this.anInt5462 << 12)) >= 0) {
						local496 = (local333 - local489) / local333;
						local394 = local166 + local496;
						local468 += local333 * local496;
						local388 = local319 + local496;
					}
					@Pc(517) int local517;
					if ((local517 = (local468 - local333) / local333) > local394) {
						local394 = local517;
					}
					while (local394 < 0) {
						local432 = this.anIntArray479[(local468 >> 12) * this.anInt5453 + (local368 >> 12)];
						if (local432 == 0) {
							local388++;
						} else {
							Static160.anIntArray254[local388++] = local432;
						}
						local468 += local333;
						local394++;
					}
				}
				local384++;
				local368 -= local333;
				local319 += Static160.anInt3390;
			}
		} else {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local468 = local378 + (local350 * local333 >> 4);
				local394 = local166;
				if (local368 >= 0 && local368 - (this.anInt5453 << 12) < 0) {
					if (local468 < 0) {
						local496 = (local333 - local468 - 1) / local333;
						local394 = local166 + local496;
						local468 += local333 * local496;
						local388 = local319 + local496;
					}
					@Pc(630) int local630;
					if ((local630 = (local468 + 1 - (this.anInt5462 << 12) - local333) / local333) > local394) {
						local394 = local630;
					}
					while (local394 < 0) {
						local432 = this.anIntArray479[(local468 >> 12) * this.anInt5453 + (local368 >> 12)];
						if (local432 == 0) {
							local388++;
						} else {
							Static160.anIntArray254[local388++] = local432;
						}
						local468 += local333;
						local394++;
					}
				}
				local384++;
				local368 -= local333;
				local319 += Static160.anInt3390;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIII[I[I)V")
	public void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * 256 >> 8;
			@Pc(39) int local39 = local27 * 256 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static160.anInt3390;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(78) int local78 = arg7[local71];
				@Pc(82) int local82 = local69 + local78;
				@Pc(88) int local88 = local51 + local39 * local78;
				@Pc(94) int local94 = local63 - local33 * local78;
				for (@Pc(99) int local99 = -arg8[local71]; local99 < 0; local99++) {
					@Pc(115) int local115 = this.anIntArray479[(local88 >> 16) + (local94 >> 16) * this.anInt5453];
					if (local115 == 0) {
						local82++;
					} else {
						Static160.anIntArray254[local82++] = local115;
					}
					local88 += local39;
					local94 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static160.anInt3390;
			}
		} catch (@Pc(150) Exception local150) {
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()[I")
	public final int[] method4379() {
		@Pc(6) int[] local6 = new int[this.anInt5466 * this.anInt5457];
		for (@Pc(8) int local8 = 0; local8 < this.anInt5462; local8++) {
			@Pc(17) int local17 = local8 * this.anInt5453;
			@Pc(28) int local28 = this.anInt5454 + (local8 + this.anInt5465) * this.anInt5466;
			for (@Pc(30) int local30 = 0; local30 < this.anInt5453; local30++) {
				@Pc(40) int local40 = this.anIntArray479[local17++];
				local6[local28++] = local40 == 0 ? 0 : local40 | 0xFF000000;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
	public final void method4380() {
		@Pc(2) int[] local2 = this.anIntArray479;
		for (@Pc(7) int local7 = this.anInt5462 - 1; local7 >= 0; local7--) {
			@Pc(14) int local14 = local7 * this.anInt5453;
			@Pc(21) int local21 = (local7 + 1) * this.anInt5453;
			while (local14 < local21) {
				local21--;
				@Pc(29) int local29 = local2[local14];
				local2[local14] = local2[local21];
				local2[local21] = local29;
				local14++;
			}
		}
		this.anInt5454 = this.anInt5466 - this.anInt5453 - this.anInt5454;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "()V")
	public final void method4381() {
		if (this.anInt5453 == this.anInt5466 && this.anInt5462 == this.anInt5457) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt5466 * this.anInt5457];
		for (@Pc(19) int local19 = 0; local19 < this.anInt5462; local19++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt5453; local25++) {
				local17[(local19 + this.anInt5465) * this.anInt5466 + local25 + this.anInt5454] = this.anIntArray479[local19 * this.anInt5453 + local25];
			}
		}
		this.anIntArray479 = local17;
		this.anInt5453 = this.anInt5466;
		this.anInt5462 = this.anInt5457;
		this.anInt5454 = 0;
		this.anInt5465 = 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIDI)V")
	public void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static160.anInt3390;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(70) int local70 = local63;
				@Pc(72) int local72 = local45;
				@Pc(74) int local74 = local57;
				for (@Pc(77) int local77 = -20; local77 < 0; local77++) {
					@Pc(93) int local93 = this.anIntArray479[(local72 >> 16) + (local74 >> 16) * this.anInt5453];
					if (local93 == 0) {
						local70++;
					} else {
						Static160.anIntArray254[local70++] = local93;
					}
					local72 += local33;
					local74 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static160.anInt3390;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	public final void method4383(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt5462 - 1; local4 > 0; local4--) {
			@Pc(11) int local11 = local4 * this.anInt5453;
			for (@Pc(16) int local16 = this.anInt5453 - 1; local16 > 0; local16--) {
				if (this.anIntArray479[local16 + local11] == 0 && this.anIntArray479[local16 + local11 - this.anInt5453 - 1] != 0) {
					this.anIntArray479[local16 + local11] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	public final void method4387(@OriginalArg(0) int arg0) {
		if (this.anInt5453 == this.anInt5466 && this.anInt5462 == this.anInt5457) {
			return;
		}
		@Pc(12) int local12 = arg0;
		if (arg0 > this.anInt5454) {
			local12 = this.anInt5454;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 + this.anInt5454 + this.anInt5453 > this.anInt5466) {
			local21 = this.anInt5466 - this.anInt5454 - this.anInt5453;
		}
		@Pc(42) int local42 = arg0;
		if (arg0 > this.anInt5465) {
			local42 = this.anInt5465;
		}
		@Pc(51) int local51 = arg0;
		if (arg0 + this.anInt5465 + this.anInt5462 > this.anInt5457) {
			local51 = this.anInt5457 - this.anInt5465 - this.anInt5462;
		}
		@Pc(77) int local77 = this.anInt5453 + local12 + local21;
		@Pc(84) int local84 = this.anInt5462 + local42 + local51;
		@Pc(89) int[] local89 = new int[local77 * local84];
		for (@Pc(91) int local91 = 0; local91 < this.anInt5462; local91++) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt5453; local97++) {
				local89[(local91 + local42) * local77 + local97 + local12] = this.anIntArray479[local91 * this.anInt5453 + local97];
			}
		}
		this.anIntArray479 = local89;
		this.anInt5453 = local77;
		this.anInt5462 = local84;
		this.anInt5454 -= local12;
		this.anInt5465 -= local42;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	@Override
	public void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt5466 - this.anInt5453 - this.anInt5454;
		arg1 += this.anInt5465;
		@Pc(21) int local21 = arg0 + arg1 * Static160.anInt3390;
		@Pc(26) int local26 = this.anInt5453 - 1;
		@Pc(29) int local29 = this.anInt5462;
		@Pc(32) int local32 = this.anInt5453;
		@Pc(36) int local36 = Static160.anInt3390 - local32;
		@Pc(40) int local40 = local32 + local32;
		@Pc(47) int local47;
		if (arg1 < Static160.anInt3391) {
			local47 = Static160.anInt3391 - arg1;
			local29 -= local47;
			arg1 = Static160.anInt3391;
			local26 += local47 * local32;
			local21 += local47 * Static160.anInt3390;
		}
		if (arg1 + local29 > Static160.anInt3392) {
			local29 -= arg1 + local29 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local47 = Static160.anInt3389 - arg0;
			local32 -= local47;
			arg0 = Static160.anInt3389;
			local26 -= local47;
			local21 += local47;
			local40 -= local47;
			local36 += local47;
		}
		if (arg0 + local32 > Static160.anInt3387) {
			local47 = arg0 + local32 - Static160.anInt3387;
			local32 -= local47;
			local40 -= local47;
			local36 += local47;
		}
		if (local32 > 0 && local29 > 0) {
			Static300.method4376(Static160.anIntArray254, this.anIntArray479, local26, local21, local32, local29, local36, local40);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt5453;
		@Pc(10) int local10 = this.anInt5462;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt5466;
		@Pc(20) int local20 = this.anInt5457;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt5454 > 0) {
			local46 = ((this.anInt5454 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt5454 << 16);
		}
		if (this.anInt5465 > 0) {
			local46 = ((this.anInt5465 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt5465 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static160.anInt3390;
		@Pc(130) int local130 = Static160.anInt3390 - arg2;
		if (arg1 + arg3 > Static160.anInt3392) {
			arg3 -= arg1 + arg3 - Static160.anInt3392;
		}
		@Pc(150) int local150;
		if (arg1 < Static160.anInt3391) {
			local150 = Static160.anInt3391 - arg1;
			arg3 -= local150;
			local46 += local150 * Static160.anInt3390;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static160.anInt3387) {
			local150 = arg0 + arg2 - Static160.anInt3387;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static160.anInt3389) {
			local150 = Static160.anInt3389 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static300.method4384(Static160.anIntArray254, this.anIntArray479, local12, local14, local46, local130, arg2, arg3, local26, local32, local7);
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "()V")
	public final void method4389() {
		Static160.method2787(this.anIntArray479, this.anInt5453, this.anInt5462);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
	public final void method4390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray479.length; local1++) {
			@Pc(11) int local11 = this.anIntArray479[local1];
			if (local11 != 0) {
				@Pc(19) int local19 = local11 >> 16 & 0xFF;
				local19 += arg0;
				if (local19 < 1) {
					local19 = 1;
				} else if (local19 > 255) {
					local19 = 255;
				}
				@Pc(40) int local40 = local11 >> 8 & 0xFF;
				local40 += arg1;
				if (local40 < 1) {
					local40 = 1;
				} else if (local40 > 255) {
					local40 = 255;
				}
				@Pc(59) int local59 = local11 & 0xFF;
				local59 += arg2;
				if (local59 < 1) {
					local59 = 1;
				} else if (local59 > 255) {
					local59 = 255;
				}
				this.anIntArray479[local1] = (local19 << 16) + (local40 << 8) + local59;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[I[I)V")
	public final void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (Static160.anInt3392 - Static160.anInt3391 != arg2.length) {
			throw new IllegalStateException();
		}
		arg0 += this.anInt5454;
		arg1 += this.anInt5465;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = this.anInt5462;
		@Pc(27) int local27 = this.anInt5453;
		@Pc(31) int local31 = Static160.anInt3390 - local27;
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = arg0 + arg1 * Static160.anInt3390;
		@Pc(46) int local46;
		if (arg1 < Static160.anInt3391) {
			local46 = Static160.anInt3391 - arg1;
			local24 -= local46;
			arg1 = Static160.anInt3391;
			local21 = local46 * local27;
			local39 += local46 * Static160.anInt3390;
		}
		if (arg1 + local24 > Static160.anInt3392) {
			local24 -= arg1 + local24 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local46 = Static160.anInt3389 - arg0;
			local27 -= local46;
			arg0 = Static160.anInt3389;
			local21 += local46;
			local39 += local46;
			local33 = local46;
			local31 += local46;
		}
		if (arg0 + local27 > Static160.anInt3387) {
			local46 = arg0 + local27 - Static160.anInt3387;
			local27 -= local46;
			local33 += local46;
			local31 += local46;
		}
		if (local27 <= 0 || local24 <= 0) {
			return;
		}
		local46 = arg0 - Static160.anInt3389;
		@Pc(142) int local142 = arg1 - Static160.anInt3391;
		for (@Pc(144) int local144 = local142; local144 < local142 + local24; local144++) {
			@Pc(153) int local153 = arg2[local144];
			@Pc(157) int local157 = arg3[local144];
			@Pc(159) int local159 = local27;
			@Pc(166) int local166;
			if (local46 > local153) {
				local166 = local46 - local153;
				if (local166 >= local157) {
					local21 += local27 + local33;
					local39 += local27 + local31;
					continue;
				}
				local157 -= local166;
			} else {
				local166 = local153 - local46;
				if (local166 >= local27) {
					local21 += local27 + local33;
					local39 += local27 + local31;
					continue;
				}
				local21 += local166;
				local159 = local27 - local166;
				local39 += local166;
			}
			local166 = 0;
			if (local159 < local157) {
				local157 = local159;
			} else {
				local166 = local159 - local157;
			}
			for (@Pc(234) int local234 = -local157; local234 < 0; local234++) {
				@Pc(242) int local242 = this.anIntArray479[local21++];
				if (local242 == 0) {
					local39++;
				} else {
					Static160.anIntArray254[local39++] = local242;
				}
			}
			local21 += local166 + local33;
			local39 += local166 + local31;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class56_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt3412 = arg0;
		this.anInt3410 = arg1;
		this.anInt3404 = arg2;
		this.anInt3405 = arg3;
		this.anInt3408 = arg4;
		this.anInt3413 = arg5;
		this.aByteArray15 = arg6;
		this.anIntArray120 = arg7;
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
	public Class56_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3412 = this.anInt3408 = arg0;
		this.anInt3410 = this.anInt3413 = arg1;
		this.anInt3404 = this.anInt3405 = 0;
		this.aByteArray15 = new byte[arg0 * arg1];
		this.anIntArray120 = new int[arg2];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	@Override
	public void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3404;
		arg1 += this.anInt3405;
		@Pc(15) int local15 = arg0 + arg1 * Static270.anInt5189;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3413;
		@Pc(23) int local23 = this.anInt3408;
		@Pc(27) int local27 = Static270.anInt5189 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static270.anInt5184) {
			local36 = Static270.anInt5184 - arg1;
			local20 -= local36;
			arg1 = Static270.anInt5184;
			local17 = local36 * local23;
			local15 += local36 * Static270.anInt5189;
		}
		if (arg1 + local20 > Static270.anInt5188) {
			local20 -= arg1 + local20 - Static270.anInt5188;
		}
		if (arg0 < Static270.anInt5186) {
			local36 = Static270.anInt5186 - arg0;
			local23 -= local36;
			arg0 = Static270.anInt5186;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static270.anInt5187) {
			local36 = arg0 + local23 - Static270.anInt5187;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static318.method1319(Static270.anIntArray561, this.aByteArray15, this.anIntArray120, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public void method1309() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray15.length - 7;
		while (local1 < local7) {
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
			this.aByteArray15[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.aByteArray15[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray120.length; local1++) {
			@Pc(15) int local15 = this.anIntArray120[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray120[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray120[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray120[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	public void method1312() {
		@Pc(6) byte[] local6 = new byte[this.anInt3408 * this.anInt3413];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt3413 - 1; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt3408; local17++) {
				local6[local8++] = this.aByteArray15[local17 + local13 * this.anInt3408];
			}
		}
		this.aByteArray15 = local6;
		this.anInt3405 = this.anInt3410 - this.anInt3413 - this.anInt3405;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	public void method1313() {
		@Pc(6) byte[] local6 = new byte[this.anInt3408 * this.anInt3413];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt3408; local10++) {
			for (@Pc(19) int local19 = this.anInt3413 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray15[local10 + local19 * this.anInt3408];
			}
		}
		this.aByteArray15 = local6;
		local10 = this.anInt3405;
		this.anInt3405 = this.anInt3404;
		this.anInt3404 = this.anInt3410 - this.anInt3413 - local10;
		local10 = this.anInt3413;
		this.anInt3413 = this.anInt3408;
		this.anInt3408 = local10;
		local10 = this.anInt3410;
		this.anInt3410 = this.anInt3412;
		this.anInt3412 = local10;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
	public void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg0 - (this.anInt3404 << 4);
		@Pc(16) int local16 = arg1 - (this.anInt3405 << 4);
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) 4096 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) 4096 + 0.5D);
		@Pc(53) int local53 = -local9 * local43 + -local16 * local33;
		@Pc(64) int local64 = --local9 * local33 + -local16 * local43;
		@Pc(78) int local78 = ((this.anInt3408 << 4) - local9) * local43 + -local16 * local33;
		@Pc(93) int local93 = -((this.anInt3408 << 4) - local9) * local33 + -local16 * local43;
		@Pc(107) int local107 = -local9 * local43 + ((this.anInt3413 << 4) - local16) * local33;
		@Pc(122) int local122 = --local9 * local33 + ((this.anInt3413 << 4) - local16) * local43;
		@Pc(140) int local140 = ((this.anInt3408 << 4) - local9) * local43 + ((this.anInt3413 << 4) - local16) * local33;
		@Pc(159) int local159 = -((this.anInt3408 << 4) - local9) * local33 + ((this.anInt3413 << 4) - local16) * local43;
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
		if (local164 < Static270.anInt5186) {
			local164 = Static270.anInt5186;
		}
		if (local166 > Static270.anInt5187) {
			local166 = Static270.anInt5187;
		}
		if (local196 < Static270.anInt5184) {
			local196 = Static270.anInt5184;
		}
		if (local198 > Static270.anInt5188) {
			local198 = Static270.anInt5188;
		}
		local166 = local164 - local166;
		if (local166 >= 0) {
			return;
		}
		local198 = local196 - local198;
		if (local198 >= 0) {
			return;
		}
		@Pc(319) int local319 = local196 * Static270.anInt5189 + local164;
		@Pc(324) double local324 = 1.6777216E7D / (double) 4096;
		@Pc(333) int local333 = (int) Math.floor(Math.sin(local23) * local324 + 0.5D);
		@Pc(342) int local342 = (int) Math.floor(Math.cos(local23) * local324 + 0.5D);
		@Pc(350) int local350 = (local164 << 4) + 8 - arg2;
		@Pc(358) int local358 = (local196 << 4) + 8 - arg3;
		@Pc(368) int local368 = (local9 << 8) - (local358 * local333 >> 4);
		@Pc(378) int local378 = (local16 << 8) + (local358 * local342 >> 4);
		@Pc(384) int local384;
		@Pc(388) int local388;
		@Pc(471) int local471;
		@Pc(394) int local394;
		@Pc(435) int local435;
		@Pc(499) int local499;
		if (local342 != 0) {
			@Pc(703) int local703;
			if (local342 < 0) {
				if (local333 == 0) {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local703 = local368 + (local350 * local342 >> 4);
						local394 = local166;
						if (local378 >= 0 && local378 - (this.anInt3413 << 12) < 0) {
							@Pc(726) int local726;
							if ((local726 = local703 - (this.anInt3408 << 12)) >= 0) {
								local499 = (local342 - local726) / local342;
								local394 = local166 + local499;
								local703 += local342 * local499;
								local388 = local319 + local499;
							}
							@Pc(754) int local754;
							if ((local754 = (local703 - local342) / local342) > local394) {
								local394 = local754;
							}
							while (local394 < 0) {
								local435 = this.anIntArray120[this.aByteArray15[(local378 >> 12) * this.anInt3408 + (local703 >> 12)]];
								if (local435 == 0) {
									local388++;
								} else {
									Static270.anIntArray561[local388++] = local435;
								}
								local703 += local342;
								local394++;
							}
						}
						local384++;
						local378 += local342;
						local319 += Static270.anInt5189;
					}
				} else if (local333 < 0) {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local703 = local368 + (local350 * local342 >> 4);
						local471 = local378 + (local350 * local333 >> 4);
						local394 = local166;
						@Pc(837) int local837;
						if ((local837 = local703 - (this.anInt3408 << 12)) >= 0) {
							local499 = (local342 - local837) / local342;
							local394 = local166 + local499;
							local703 += local342 * local499;
							local471 += local333 * local499;
							local388 = local319 + local499;
						}
						@Pc(871) int local871;
						if ((local871 = (local703 - local342) / local342) > local394) {
							local394 = local871;
						}
						@Pc(883) int local883;
						if ((local883 = local471 - (this.anInt3413 << 12)) >= 0) {
							local499 = (local333 - local883) / local333;
							local394 += local499;
							local703 += local342 * local499;
							local471 += local333 * local499;
							local388 += local499;
						}
						@Pc(917) int local917;
						if ((local917 = (local471 - local333) / local333) > local394) {
							local394 = local917;
						}
						while (local394 < 0) {
							local435 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local703 >> 12)]];
							if (local435 == 0) {
								local388++;
							} else {
								Static270.anIntArray561[local388++] = local435;
							}
							local703 += local342;
							local471 += local333;
							local394++;
						}
						local384++;
						local368 -= local333;
						local378 += local342;
						local319 += Static270.anInt5189;
					}
				} else {
					local384 = local198;
					while (local384 < 0) {
						local388 = local319;
						local703 = local368 + (local350 * local342 >> 4);
						local471 = local378 + (local350 * local333 >> 4);
						local394 = local166;
						@Pc(1006) int local1006;
						if ((local1006 = local703 - (this.anInt3408 << 12)) >= 0) {
							local499 = (local342 - local1006) / local342;
							local394 = local166 + local499;
							local703 += local342 * local499;
							local471 += local333 * local499;
							local388 = local319 + local499;
						}
						@Pc(1040) int local1040;
						if ((local1040 = (local703 - local342) / local342) > local394) {
							local394 = local1040;
						}
						if (local471 < 0) {
							local499 = (local333 - local471 - 1) / local333;
							local394 += local499;
							local703 += local342 * local499;
							local471 += local333 * local499;
							local388 += local499;
						}
						@Pc(1088) int local1088;
						if ((local1088 = (local471 + 1 - (this.anInt3413 << 12) - local333) / local333) > local394) {
							local394 = local1088;
						}
						while (local394 < 0) {
							local435 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local703 >> 12)]];
							if (local435 == 0) {
								local388++;
							} else {
								Static270.anIntArray561[local388++] = local435;
							}
							local703 += local342;
							local471 += local333;
							local394++;
						}
						local384++;
						local368 -= local333;
						local378 += local342;
						local319 += Static270.anInt5189;
					}
				}
			} else if (local333 == 0) {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local703 = local368 + (local350 * local342 >> 4);
					local394 = local166;
					if (local378 >= 0 && local378 - (this.anInt3413 << 12) < 0) {
						if (local703 < 0) {
							local499 = (local342 - local703 - 1) / local342;
							local394 = local166 + local499;
							local703 += local342 * local499;
							local388 = local319 + local499;
						}
						@Pc(1214) int local1214;
						if ((local1214 = (local703 + 1 - (this.anInt3408 << 12) - local342) / local342) > local394) {
							local394 = local1214;
						}
						while (local394 < 0) {
							local435 = this.anIntArray120[this.aByteArray15[(local378 >> 12) * this.anInt3408 + (local703 >> 12)]];
							if (local435 == 0) {
								local388++;
							} else {
								Static270.anIntArray561[local388++] = local435;
							}
							local703 += local342;
							local394++;
						}
					}
					local384++;
					local378 += local342;
					local319 += Static270.anInt5189;
				}
			} else if (local333 < 0) {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local703 = local368 + (local350 * local342 >> 4);
					local471 = local378 + (local350 * local333 >> 4);
					local394 = local166;
					if (local703 < 0) {
						local499 = (local342 - local703 - 1) / local342;
						local394 = local166 + local499;
						local703 += local342 * local499;
						local471 += local333 * local499;
						local388 = local319 + local499;
					}
					@Pc(1333) int local1333;
					if ((local1333 = (local703 + 1 - (this.anInt3408 << 12) - local342) / local342) > local394) {
						local394 = local1333;
					}
					@Pc(1345) int local1345;
					if ((local1345 = local471 - (this.anInt3413 << 12)) >= 0) {
						local499 = (local333 - local1345) / local333;
						local394 += local499;
						local703 += local342 * local499;
						local471 += local333 * local499;
						local388 += local499;
					}
					@Pc(1379) int local1379;
					if ((local1379 = (local471 - local333) / local333) > local394) {
						local394 = local1379;
					}
					while (local394 < 0) {
						local435 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local703 >> 12)]];
						if (local435 == 0) {
							local388++;
						} else {
							Static270.anIntArray561[local388++] = local435;
						}
						local703 += local342;
						local471 += local333;
						local394++;
					}
					local384++;
					local368 -= local333;
					local378 += local342;
					local319 += Static270.anInt5189;
				}
			} else {
				local384 = local198;
				while (local384 < 0) {
					local388 = local319;
					local703 = local368 + (local350 * local342 >> 4);
					local471 = local378 + (local350 * local333 >> 4);
					local394 = local166;
					if (local703 < 0) {
						local499 = (local342 - local703 - 1) / local342;
						local394 = local166 + local499;
						local703 += local342 * local499;
						local471 += local333 * local499;
						local388 = local319 + local499;
					}
					@Pc(1504) int local1504;
					if ((local1504 = (local703 + 1 - (this.anInt3408 << 12) - local342) / local342) > local394) {
						local394 = local1504;
					}
					if (local471 < 0) {
						local499 = (local333 - local471 - 1) / local333;
						local394 += local499;
						local703 += local342 * local499;
						local471 += local333 * local499;
						local388 += local499;
					}
					@Pc(1552) int local1552;
					if ((local1552 = (local471 + 1 - (this.anInt3413 << 12) - local333) / local333) > local394) {
						local394 = local1552;
					}
					while (local394 < 0) {
						local435 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local703 >> 12)]];
						if (local435 == 0) {
							local388++;
						} else {
							Static270.anIntArray561[local388++] = local435;
						}
						local703 += local342;
						local471 += local333;
						local394++;
					}
					local384++;
					local368 -= local333;
					local378 += local342;
					local319 += Static270.anInt5189;
				}
			}
		} else if (local333 == 0) {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local394 = local166;
				if (local368 >= 0 && local378 >= 0 && local368 - (this.anInt3408 << 12) < 0 && local378 - (this.anInt3413 << 12) < 0) {
					while (local394 < 0) {
						local435 = this.anIntArray120[this.aByteArray15[(local378 >> 12) * this.anInt3408 + (local368 >> 12)]];
						if (local435 == 0) {
							local388++;
						} else {
							Static270.anIntArray561[local388++] = local435;
						}
						local394++;
					}
				}
				local384++;
				local319 += Static270.anInt5189;
			}
		} else if (local333 < 0) {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local471 = local378 + (local350 * local333 >> 4);
				local394 = local166;
				if (local368 >= 0 && local368 - (this.anInt3408 << 12) < 0) {
					@Pc(492) int local492;
					if ((local492 = local471 - (this.anInt3413 << 12)) >= 0) {
						local499 = (local333 - local492) / local333;
						local394 = local166 + local499;
						local471 += local333 * local499;
						local388 = local319 + local499;
					}
					@Pc(520) int local520;
					if ((local520 = (local471 - local333) / local333) > local394) {
						local394 = local520;
					}
					while (local394 < 0) {
						local435 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local368 >> 12)]];
						if (local435 == 0) {
							local388++;
						} else {
							Static270.anIntArray561[local388++] = local435;
						}
						local471 += local333;
						local394++;
					}
				}
				local384++;
				local368 -= local333;
				local319 += Static270.anInt5189;
			}
		} else {
			local384 = local198;
			while (local384 < 0) {
				local388 = local319;
				local471 = local378 + (local350 * local333 >> 4);
				local394 = local166;
				if (local368 >= 0 && local368 - (this.anInt3408 << 12) < 0) {
					if (local471 < 0) {
						local499 = (local333 - local471 - 1) / local333;
						local394 = local166 + local499;
						local471 += local333 * local499;
						local388 = local319 + local499;
					}
					@Pc(636) int local636;
					if ((local636 = (local471 + 1 - (this.anInt3413 << 12) - local333) / local333) > local394) {
						local394 = local636;
					}
					while (local394 < 0) {
						local435 = this.anIntArray120[this.aByteArray15[(local471 >> 12) * this.anInt3408 + (local368 >> 12)]];
						if (local435 == 0) {
							local388++;
						} else {
							Static270.anIntArray561[local388++] = local435;
						}
						local471 += local333;
						local394++;
					}
				}
				local384++;
				local368 -= local333;
				local319 += Static270.anInt5189;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	public void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt3408;
		@Pc(5) int local5 = this.anInt3413;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt3412;
		@Pc(15) int local15 = this.anInt3410;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt3404 > 0) {
			local41 = ((this.anInt3404 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt3404 << 16);
		}
		if (this.anInt3405 > 0) {
			local41 = ((this.anInt3405 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt3405 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static270.anInt5189;
		@Pc(125) int local125 = Static270.anInt5189 - arg2;
		if (arg1 + arg3 > Static270.anInt5188) {
			arg3 -= arg1 + arg3 - Static270.anInt5188;
		}
		@Pc(145) int local145;
		if (arg1 < Static270.anInt5184) {
			local145 = Static270.anInt5184 - arg1;
			arg3 -= local145;
			local41 += local145 * Static270.anInt5189;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static270.anInt5187) {
			local145 = arg0 + arg2 - Static270.anInt5187;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static270.anInt5186) {
			local145 = Static270.anInt5186 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static318.method1317(Static270.anIntArray561, this.aByteArray15, this.anIntArray120, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)V")
	public void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.anInt3408;
		@Pc(5) int local5 = this.anInt3413;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt3412;
		@Pc(15) int local15 = this.anInt3410;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt3404 > 0) {
			local41 = ((this.anInt3404 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt3404 << 16);
		}
		if (this.anInt3405 > 0) {
			local41 = ((this.anInt3405 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt3405 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static270.anInt5189;
		@Pc(125) int local125 = Static270.anInt5189 - arg2;
		if (arg1 + arg3 > Static270.anInt5188) {
			arg3 -= arg1 + arg3 - Static270.anInt5188;
		}
		@Pc(145) int local145;
		if (arg1 < Static270.anInt5184) {
			local145 = Static270.anInt5184 - arg1;
			arg3 -= local145;
			local41 += local145 * Static270.anInt5189;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static270.anInt5187) {
			local145 = arg0 + arg2 - Static270.anInt5187;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static270.anInt5186) {
			local145 = Static270.anInt5186 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static318.method1318(Static270.anIntArray561, this.aByteArray15, this.anIntArray120, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	@Override
	public void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3404;
		arg1 += this.anInt3405;
		@Pc(15) int local15 = arg0 + arg1 * Static270.anInt5189;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3413;
		@Pc(23) int local23 = this.anInt3408;
		@Pc(27) int local27 = Static270.anInt5189 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static270.anInt5184) {
			local36 = Static270.anInt5184 - arg1;
			local20 -= local36;
			arg1 = Static270.anInt5184;
			local17 = local36 * local23;
			local15 += local36 * Static270.anInt5189;
		}
		if (arg1 + local20 > Static270.anInt5188) {
			local20 -= arg1 + local20 - Static270.anInt5188;
		}
		if (arg0 < Static270.anInt5186) {
			local36 = Static270.anInt5186 - arg0;
			local23 -= local36;
			arg0 = Static270.anInt5186;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static270.anInt5187) {
			local36 = arg0 + local23 - Static270.anInt5187;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static318.method1310(Static270.anIntArray561, this.aByteArray15, this.anIntArray120, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	public void method1320() {
		if (this.anInt3408 == this.anInt3412 && this.anInt3413 == this.anInt3410) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3412 * this.anInt3410];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3413; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt3408; local27++) {
				local17[local27 + this.anInt3404 + (local21 + this.anInt3405) * this.anInt3412] = this.aByteArray15[local19++];
			}
		}
		this.aByteArray15 = local17;
		this.anInt3408 = this.anInt3412;
		this.anInt3413 = this.anInt3410;
		this.anInt3404 = 0;
		this.anInt3405 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[I[I)V")
	public void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (Static270.anInt5188 - Static270.anInt5184 != arg2.length) {
			throw new IllegalStateException();
		}
		arg0 += this.anInt3404;
		arg1 += this.anInt3405;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = this.anInt3413;
		@Pc(27) int local27 = this.anInt3408;
		@Pc(31) int local31 = Static270.anInt5189 - local27;
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = arg0 + arg1 * Static270.anInt5189;
		@Pc(46) int local46;
		if (arg1 < Static270.anInt5184) {
			local46 = Static270.anInt5184 - arg1;
			local24 -= local46;
			arg1 = Static270.anInt5184;
			local21 = local46 * local27;
			local39 += local46 * Static270.anInt5189;
		}
		if (arg1 + local24 > Static270.anInt5188) {
			local24 -= arg1 + local24 - Static270.anInt5188;
		}
		if (arg0 < Static270.anInt5186) {
			local46 = Static270.anInt5186 - arg0;
			local27 -= local46;
			arg0 = Static270.anInt5186;
			local21 += local46;
			local39 += local46;
			local33 = local46;
			local31 += local46;
		}
		if (arg0 + local27 > Static270.anInt5187) {
			local46 = arg0 + local27 - Static270.anInt5187;
			local27 -= local46;
			local33 += local46;
			local31 += local46;
		}
		if (local27 <= 0 || local24 <= 0) {
			return;
		}
		local46 = arg0 - Static270.anInt5186;
		@Pc(142) int local142 = arg1 - Static270.anInt5184;
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
				@Pc(245) int local245 = this.anIntArray120[this.aByteArray15[local21++]];
				if (local245 == 0) {
					local39++;
				} else {
					Static270.anIntArray561[local39++] = local245;
				}
			}
			local21 += local166 + local33;
			local39 += local166 + local31;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub2_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class1_Sub2_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected void method193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			return;
		}
		@Pc(9) int local9 = arg0 - (super.anInt206 << 4);
		@Pc(16) int local16 = arg1 - (super.anInt203 << 4);
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) arg5 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) arg5 + 0.5D);
		@Pc(53) int local53 = -local9 * local43 + -local16 * local33;
		@Pc(62) int local62 = local9 * local33 + -local16 * local43;
		@Pc(76) int local76 = ((super.anInt209 << 4) - local9) * local43 + -local16 * local33;
		@Pc(91) int local91 = -((super.anInt209 << 4) - local9) * local33 + -local16 * local43;
		@Pc(105) int local105 = -local9 * local43 + ((super.anInt208 << 4) - local16) * local33;
		@Pc(118) int local118 = local9 * local33 + ((super.anInt208 << 4) - local16) * local43;
		@Pc(136) int local136 = ((super.anInt209 << 4) - local9) * local43 + ((super.anInt208 << 4) - local16) * local33;
		@Pc(155) int local155 = -((super.anInt209 << 4) - local9) * local33 + ((super.anInt208 << 4) - local16) * local43;
		@Pc(160) int local160;
		@Pc(162) int local162;
		if (local53 < local76) {
			local160 = local53;
			local162 = local76;
		} else {
			local160 = local76;
			local162 = local53;
		}
		if (local105 < local160) {
			local160 = local105;
		}
		if (local136 < local160) {
			local160 = local136;
		}
		if (local105 > local162) {
			local162 = local105;
		}
		if (local136 > local162) {
			local162 = local136;
		}
		@Pc(192) int local192;
		@Pc(194) int local194;
		if (local62 < local91) {
			local192 = local62;
			local194 = local91;
		} else {
			local192 = local91;
			local194 = local62;
		}
		if (local118 < local192) {
			local192 = local118;
		}
		if (local155 < local192) {
			local192 = local155;
		}
		if (local118 > local194) {
			local194 = local118;
		}
		if (local155 > local194) {
			local194 = local155;
		}
		local160 >>= 0xC;
		local162 = local162 + 4095 >> 12;
		local192 >>= 0xC;
		local194 = local194 + 4095 >> 12;
		local160 += arg2;
		local162 += arg2;
		local192 += arg3;
		local194 += arg3;
		local160 >>= 0x4;
		local162 = local162 + 15 >> 4;
		local192 >>= 0x4;
		local194 = local194 + 15 >> 4;
		if (local160 < Static205.anInt4392) {
			local160 = Static205.anInt4392;
		}
		if (local162 > Static205.anInt4391) {
			local162 = Static205.anInt4391;
		}
		if (local192 < Static205.anInt4393) {
			local192 = Static205.anInt4393;
		}
		if (local194 > Static205.anInt4390) {
			local194 = Static205.anInt4390;
		}
		local162 = local160 - local162;
		if (local162 >= 0) {
			return;
		}
		local194 = local192 - local194;
		if (local194 >= 0) {
			return;
		}
		@Pc(315) int local315 = local192 * Static205.anInt4388 + local160;
		@Pc(320) double local320 = 1.6777216E7D / (double) arg5;
		@Pc(329) int local329 = (int) Math.floor(Math.sin(local23) * local320 + 0.5D);
		@Pc(338) int local338 = (int) Math.floor(Math.cos(local23) * local320 + 0.5D);
		@Pc(346) int local346 = (local160 << 4) + 8 - arg2;
		@Pc(354) int local354 = (local192 << 4) + 8 - arg3;
		@Pc(364) int local364 = (local9 << 8) - (local354 * local329 >> 4);
		@Pc(374) int local374 = (local16 << 8) + (local354 * local338 >> 4);
		@Pc(521) int local521;
		@Pc(380) int local380;
		@Pc(383) int local383;
		@Pc(495) int local495;
		@Pc(389) int local389;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		if (local338 != 0) {
			@Pc(789) int local789;
			if (local338 < 0) {
				if (local329 == 0) {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local789 = local364 + (local346 * local338 >> 4);
						local389 = local162;
						if (local374 >= 0 && local374 - (super.anInt208 << 12) < 0) {
							@Pc(810) int local810;
							if ((local810 = local789 - (super.anInt209 << 12)) >= 0) {
								local521 = (local338 - local810) / local338;
								local389 = local162 + local521;
								local789 += local338 * local521;
								local383 = local315 + local521;
							}
							@Pc(838) int local838;
							if ((local838 = (local789 - local338) / local338) > local389) {
								local389 = local838;
							}
							while (local389 < 0) {
								local422 = super.anIntArray13[(local374 >> 12) * super.anInt209 + (local789 >> 12)];
								local426 = Static205.anIntArray358[local383];
								local430 = local422 >>> 24;
								local434 = 256 - local430;
								Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
								local789 += local338;
								local389++;
							}
						}
						local380++;
						local374 += local338;
						local315 += Static205.anInt4388;
					}
				} else if (local329 < 0) {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local789 = local364 + (local346 * local338 >> 4);
						local495 = local374 + (local346 * local329 >> 4);
						local389 = local162;
						@Pc(954) int local954;
						if ((local954 = local789 - (super.anInt209 << 12)) >= 0) {
							local521 = (local338 - local954) / local338;
							local389 = local162 + local521;
							local789 += local338 * local521;
							local495 += local329 * local521;
							local383 = local315 + local521;
						}
						@Pc(988) int local988;
						if ((local988 = (local789 - local338) / local338) > local389) {
							local389 = local988;
						}
						@Pc(1000) int local1000;
						if ((local1000 = local495 - (super.anInt208 << 12)) >= 0) {
							local521 = (local329 - local1000) / local329;
							local389 += local521;
							local789 += local338 * local521;
							local495 += local329 * local521;
							local383 += local521;
						}
						@Pc(1034) int local1034;
						if ((local1034 = (local495 - local329) / local329) > local389) {
							local389 = local1034;
						}
						while (local389 < 0) {
							local422 = super.anIntArray13[(local495 >> 12) * super.anInt209 + (local789 >> 12)];
							local426 = Static205.anIntArray358[local383];
							local430 = local422 >>> 24;
							local434 = 256 - local430;
							Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
							local789 += local338;
							local495 += local329;
							local389++;
						}
						local380++;
						local364 -= local329;
						local374 += local338;
						local315 += Static205.anInt4388;
					}
				} else {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local789 = local364 + (local346 * local338 >> 4);
						local495 = local374 + (local346 * local329 >> 4);
						local389 = local162;
						@Pc(1156) int local1156;
						if ((local1156 = local789 - (super.anInt209 << 12)) >= 0) {
							local521 = (local338 - local1156) / local338;
							local389 = local162 + local521;
							local789 += local338 * local521;
							local495 += local329 * local521;
							local383 = local315 + local521;
						}
						@Pc(1190) int local1190;
						if ((local1190 = (local789 - local338) / local338) > local389) {
							local389 = local1190;
						}
						if (local495 < 0) {
							local521 = (local329 - local495 - 1) / local329;
							local389 += local521;
							local789 += local338 * local521;
							local495 += local329 * local521;
							local383 += local521;
						}
						@Pc(1238) int local1238;
						if ((local1238 = (local495 + 1 - (super.anInt208 << 12) - local329) / local329) > local389) {
							local389 = local1238;
						}
						while (local389 < 0) {
							local422 = super.anIntArray13[(local495 >> 12) * super.anInt209 + (local789 >> 12)];
							local426 = Static205.anIntArray358[local383];
							local430 = local422 >>> 24;
							local434 = 256 - local430;
							Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
							local789 += local338;
							local495 += local329;
							local389++;
						}
						local380++;
						local364 -= local329;
						local374 += local338;
						local315 += Static205.anInt4388;
					}
				}
			} else if (local329 == 0) {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local789 = local364 + (local346 * local338 >> 4);
					local389 = local162;
					if (local374 >= 0 && local374 - (super.anInt208 << 12) < 0) {
						if (local789 < 0) {
							local521 = (local338 - local789 - 1) / local338;
							local389 = local162 + local521;
							local789 += local338 * local521;
							local383 = local315 + local521;
						}
						@Pc(1395) int local1395;
						if ((local1395 = (local789 + 1 - (super.anInt209 << 12) - local338) / local338) > local389) {
							local389 = local1395;
						}
						while (local389 < 0) {
							local422 = super.anIntArray13[(local374 >> 12) * super.anInt209 + (local789 >> 12)];
							local426 = Static205.anIntArray358[local383];
							local430 = local422 >>> 24;
							local434 = 256 - local430;
							Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
							local789 += local338;
							local389++;
						}
					}
					local380++;
					local374 += local338;
					local315 += Static205.anInt4388;
				}
			} else if (local329 < 0) {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local789 = local364 + (local346 * local338 >> 4);
					local495 = local374 + (local346 * local329 >> 4);
					local389 = local162;
					if (local789 < 0) {
						local521 = (local338 - local789 - 1) / local338;
						local389 = local162 + local521;
						local789 += local338 * local521;
						local495 += local329 * local521;
						local383 = local315 + local521;
					}
					@Pc(1547) int local1547;
					if ((local1547 = (local789 + 1 - (super.anInt209 << 12) - local338) / local338) > local389) {
						local389 = local1547;
					}
					@Pc(1559) int local1559;
					if ((local1559 = local495 - (super.anInt208 << 12)) >= 0) {
						local521 = (local329 - local1559) / local329;
						local389 += local521;
						local789 += local338 * local521;
						local495 += local329 * local521;
						local383 += local521;
					}
					@Pc(1593) int local1593;
					if ((local1593 = (local495 - local329) / local329) > local389) {
						local389 = local1593;
					}
					while (local389 < 0) {
						local422 = super.anIntArray13[(local495 >> 12) * super.anInt209 + (local789 >> 12)];
						local426 = Static205.anIntArray358[local383];
						local430 = local422 >>> 24;
						local434 = 256 - local430;
						Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
						local789 += local338;
						local495 += local329;
						local389++;
					}
					local380++;
					local364 -= local329;
					local374 += local338;
					local315 += Static205.anInt4388;
				}
			} else {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local789 = local364 + (local346 * local338 >> 4);
					local495 = local374 + (local346 * local329 >> 4);
					local389 = local162;
					if (local789 < 0) {
						local521 = (local338 - local789 - 1) / local338;
						local389 = local162 + local521;
						local789 += local338 * local521;
						local495 += local329 * local521;
						local383 = local315 + local521;
					}
					@Pc(1751) int local1751;
					if ((local1751 = (local789 + 1 - (super.anInt209 << 12) - local338) / local338) > local389) {
						local389 = local1751;
					}
					if (local495 < 0) {
						local521 = (local329 - local495 - 1) / local329;
						local389 += local521;
						local789 += local338 * local521;
						local495 += local329 * local521;
						local383 += local521;
					}
					@Pc(1799) int local1799;
					if ((local1799 = (local495 + 1 - (super.anInt208 << 12) - local329) / local329) > local389) {
						local389 = local1799;
					}
					while (local389 < 0) {
						local422 = super.anIntArray13[(local495 >> 12) * super.anInt209 + (local789 >> 12)];
						local426 = Static205.anIntArray358[local383];
						local430 = local422 >>> 24;
						local434 = 256 - local430;
						Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
						local789 += local338;
						local495 += local329;
						local389++;
					}
					local380++;
					local364 -= local329;
					local374 += local338;
					local315 += Static205.anInt4388;
				}
			}
		} else if (local329 == 0) {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local389 = local162;
				if (local364 >= 0 && local374 >= 0 && local364 - (super.anInt209 << 12) < 0 && local374 - (super.anInt208 << 12) < 0) {
					while (local389 < 0) {
						local422 = super.anIntArray13[(local374 >> 12) * super.anInt209 + (local364 >> 12)];
						local426 = Static205.anIntArray358[local383];
						local430 = local422 >>> 24;
						local434 = 256 - local430;
						Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
						local389++;
					}
				}
				local380++;
				local315 += Static205.anInt4388;
			}
		} else if (local329 < 0) {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local495 = local374 + (local346 * local329 >> 4);
				local389 = local162;
				if (local364 >= 0 && local364 - (super.anInt209 << 12) < 0) {
					@Pc(514) int local514;
					if ((local514 = local495 - (super.anInt208 << 12)) >= 0) {
						local521 = (local329 - local514) / local329;
						local389 = local162 + local521;
						local495 += local329 * local521;
						local383 = local315 + local521;
					}
					@Pc(542) int local542;
					if ((local542 = (local495 - local329) / local329) > local389) {
						local389 = local542;
					}
					while (local389 < 0) {
						local422 = super.anIntArray13[(local495 >> 12) * super.anInt209 + (local364 >> 12)];
						local426 = Static205.anIntArray358[local383];
						local430 = local422 >>> 24;
						local434 = 256 - local430;
						Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
						local495 += local329;
						local389++;
					}
				}
				local380++;
				local364 -= local329;
				local315 += Static205.anInt4388;
			}
		} else {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local495 = local374 + (local346 * local329 >> 4);
				local389 = local162;
				if (local364 >= 0 && local364 - (super.anInt209 << 12) < 0) {
					if (local495 < 0) {
						local521 = (local329 - local495 - 1) / local329;
						local389 = local162 + local521;
						local495 += local329 * local521;
						local383 = local315 + local521;
					}
					@Pc(689) int local689;
					if ((local689 = (local495 + 1 - (super.anInt208 << 12) - local329) / local329) > local389) {
						local389 = local689;
					}
					while (local389 < 0) {
						local422 = super.anIntArray13[(local495 >> 12) * super.anInt209 + (local364 >> 12)];
						local426 = Static205.anIntArray358[local383];
						local430 = local422 >>> 24;
						local434 = 256 - local430;
						Static205.anIntArray358[local383++] = ((local422 & 0xFF00FF) * local430 + (local426 & 0xFF00FF) * local434 & 0xFF00FF00) + ((local422 & 0xFF00) * local430 + (local426 & 0xFF00) * local434 & 0xFF0000) >> 8;
						local495 += local329;
						local389++;
					}
				}
				local380++;
				local364 -= local329;
				local315 += Static205.anInt4388;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIDI)V")
	@Override
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static205.anInt4388;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = super.anIntArray13[(local70 >> 16) + (local72 >> 16) * super.anInt209];
					@Pc(94) int local94 = Static205.anIntArray358[local68];
					@Pc(98) int local98 = local90 >>> 24;
					@Pc(102) int local102 = 256 - local98;
					Static205.anIntArray358[local68++] = ((local90 & 0xFF00FF) * local98 + (local94 & 0xFF00FF) * local102 & 0xFF00FF00) + ((local90 & 0xFF00) * local98 + (local94 & 0xFF00) * local102 & 0xFF0000) >> 8;
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static205.anInt4388;
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = super.anInt209;
		@Pc(10) int local10 = super.anInt208;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = super.anInt205;
		@Pc(20) int local20 = super.anInt210;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (super.anInt206 > 0) {
			local46 = ((super.anInt206 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (super.anInt206 << 16);
		}
		if (super.anInt203 > 0) {
			local46 = ((super.anInt203 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (super.anInt203 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static205.anInt4388;
		@Pc(130) int local130 = Static205.anInt4388 - arg2;
		if (arg1 + arg3 > Static205.anInt4390) {
			arg3 -= arg1 + arg3 - Static205.anInt4390;
		}
		@Pc(150) int local150;
		if (arg1 < Static205.anInt4393) {
			local150 = Static205.anInt4393 - arg1;
			arg3 -= local150;
			local46 += local150 * Static205.anInt4388;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static205.anInt4391) {
			local150 = arg0 + arg2 - Static205.anInt4391;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static205.anInt4392) {
			local150 = Static205.anInt4392 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static235.method216(Static205.anIntArray358, super.anIntArray13, local12, local14, local46, local130, arg2, arg3, local26, local32, local7, arg4);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	@Override
	public void method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt206;
		arg1 += super.anInt203;
		@Pc(15) int local15 = arg0 + arg1 * Static205.anInt4388;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt208;
		@Pc(23) int local23 = super.anInt209;
		@Pc(27) int local27 = Static205.anInt4388 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static205.anInt4393) {
			local36 = Static205.anInt4393 - arg1;
			local20 -= local36;
			arg1 = Static205.anInt4393;
			local17 = local36 * local23;
			local15 += local36 * Static205.anInt4388;
		}
		if (arg1 + local20 > Static205.anInt4390) {
			local20 -= arg1 + local20 - Static205.anInt4390;
		}
		if (arg0 < Static205.anInt4392) {
			local36 = Static205.anInt4392 - arg0;
			local23 -= local36;
			arg0 = Static205.anInt4392;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static205.anInt4391) {
			local36 = arg0 + local23 - Static205.anInt4391;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static235.method214(Static205.anIntArray358, super.anIntArray13, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIIIIII[I[I)V")
	@Override
	public void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * 256 >> 8;
			@Pc(39) int local39 = local27 * 256 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static205.anInt4388;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg7[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg8[local71]; local97 < 0; local97++) {
					@Pc(112) int local112 = super.anIntArray13[(local86 >> 16) + (local92 >> 16) * super.anInt209];
					@Pc(116) int local116 = Static205.anIntArray358[local80];
					@Pc(120) int local120 = local112 >>> 24;
					@Pc(124) int local124 = 256 - local120;
					Static205.anIntArray358[local80++] = ((local112 & 0xFF00FF) * local120 + (local116 & 0xFF00FF) * local124 & 0xFF00FF00) + ((local112 & 0xFF00) * local120 + (local116 & 0xFF00) * local124 & 0xFF0000) >> 8;
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static205.anInt4388;
			}
		} catch (@Pc(186) Exception local186) {
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	@Override
	public void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt206;
		arg1 += super.anInt203;
		@Pc(15) int local15 = arg0 + arg1 * Static205.anInt4388;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt208;
		@Pc(23) int local23 = super.anInt209;
		@Pc(27) int local27 = Static205.anInt4388 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static205.anInt4393) {
			local36 = Static205.anInt4393 - arg1;
			local20 -= local36;
			arg1 = Static205.anInt4393;
			local17 = local36 * local23;
			local15 += local36 * Static205.anInt4388;
		}
		if (arg1 + local20 > Static205.anInt4390) {
			local20 -= arg1 + local20 - Static205.anInt4390;
		}
		if (arg0 < Static205.anInt4392) {
			local36 = Static205.anInt4392 - arg0;
			local23 -= local36;
			arg0 = Static205.anInt4392;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static205.anInt4391) {
			local36 = arg0 + local23 - Static205.anInt4391;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static235.method215(Static205.anIntArray358, super.anIntArray13, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIII[I[I)V")
	@Override
	public void method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static205.anInt4388;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					@Pc(112) int local112 = super.anIntArray13[(local86 >> 16) + (local92 >> 16) * super.anInt209];
					@Pc(116) int local116 = Static205.anIntArray358[local80];
					@Pc(120) int local120 = local112 >>> 24;
					@Pc(124) int local124 = 256 - local120;
					Static205.anIntArray358[local80++] = ((local112 & 0xFF00FF) * local120 + (local116 & 0xFF00FF) * local124 & 0xFF00FF00) + ((local112 & 0xFF00) * local120 + (local116 & 0xFF00) * local124 & 0xFF0000) >> 8;
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static205.anInt4388;
			}
		} catch (@Pc(186) Exception local186) {
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
	@Override
	public void method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt206;
		arg1 += super.anInt203;
		@Pc(15) int local15 = arg0 + arg1 * Static205.anInt4388;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt208;
		@Pc(23) int local23 = super.anInt209;
		@Pc(27) int local27 = Static205.anInt4388 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static205.anInt4393) {
			local36 = Static205.anInt4393 - arg1;
			local20 -= local36;
			arg1 = Static205.anInt4393;
			local17 = local36 * local23;
			local15 += local36 * Static205.anInt4388;
		}
		if (arg1 + local20 > Static205.anInt4390) {
			local20 -= arg1 + local20 - Static205.anInt4390;
		}
		if (arg0 < Static205.anInt4392) {
			local36 = Static205.anInt4392 - arg0;
			local23 -= local36;
			arg0 = Static205.anInt4392;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static205.anInt4391) {
			local36 = arg0 + local23 - Static205.anInt4391;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static235.method217(Static205.anIntArray358, super.anIntArray13, local17, local15, local23, local20, local27, local29);
		}
	}
}

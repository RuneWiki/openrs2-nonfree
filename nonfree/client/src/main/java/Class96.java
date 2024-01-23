import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class96 {

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V")
	public Class96(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		this.anIntArray328 = new int[local9];
		this.aByteArray50 = arg0;
		this.anIntArray327 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(45) int local45 = 0x1 << 32 - local35;
				@Pc(49) int local49 = local6[local35];
				this.anIntArray328[local24] = local49;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(80) int local80;
				@Pc(94) int local94;
				if ((local49 & local45) == 0) {
					for (local73 = local35 - 1; local73 >= 1; local73--) {
						local80 = local6[local73];
						if (local80 != local49) {
							break;
						}
						local94 = 0x1 << 32 - local73;
						if ((local94 & local80) != 0) {
							local6[local73] = local6[local73 - 1];
							break;
						}
						local6[local73] = local94 | local80;
					}
					local67 = local45 | local49;
				} else {
					local67 = local6[local35 - 1];
				}
				local6[local35] = local67;
				for (local73 = local35 + 1; local73 <= 32; local73++) {
					if (local6[local73] == local49) {
						local6[local73] = local67;
					}
				}
				local73 = 0;
				for (local80 = 0; local80 < local35; local80++) {
					local94 = Integer.MIN_VALUE >>> local80;
					if ((local94 & local49) == 0) {
						local73++;
					} else {
						if (this.anIntArray327[local73] == 0) {
							this.anIntArray327[local73] = local22;
						}
						local73 = this.anIntArray327[local73];
					}
					if (this.anIntArray327.length <= local73) {
						@Pc(206) int[] local206 = new int[this.anIntArray327.length * 2];
						for (@Pc(208) int local208 = 0; local208 < this.anIntArray327.length; local208++) {
							local206[local208] = this.anIntArray327[local208];
						}
						this.anIntArray327 = local206;
					}
				}
				if (local73 >= local22) {
					local22 = local73 + 1;
				}
				this.anIntArray327[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([BB[BIII)I")
	public int method2878(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(15) int local15 = arg2;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = arg4;
		while (true) {
			@Pc(23) byte local23 = arg1[local19];
			if (local23 < 0) {
				local17 = this.anIntArray327[local17];
			} else {
				local17++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local42;
				if (arg3 >= local15) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x40) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local81;
				if (local15 <= arg3) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x20) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local119;
				if (arg3 >= local15) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x10) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local160;
				if (local15 <= arg3) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x8) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(205) int local205;
			if ((local205 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local205;
				if (local15 <= arg3) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x4) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(244) int local244;
			if ((local244 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local244;
				if (local15 <= arg3) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x2) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(286) int local286;
			if ((local286 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local286;
				if (arg3 >= local15) {
					break;
				}
				local17 = 0;
			}
			if ((local23 & 0x1) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray327[local17];
			}
			@Pc(325) int local325;
			if ((local325 = this.anIntArray327[local17]) < 0) {
				arg0[arg3++] = (byte) ~local325;
				if (arg3 >= local15) {
					break;
				}
				local17 = 0;
			}
			local19++;
		}
		return local19 + 1 - arg4;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[BBI[B)I")
	public int method2884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg3;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg0 << 3;
		while (local9 > arg1) {
			@Pc(36) int local36 = arg2[arg1] & 0xFF;
			@Pc(41) int local41 = this.anIntArray328[local36];
			@Pc(46) byte local46 = this.aByteArray50[local36];
			if (local46 == 0) {
				throw new RuntimeException("No codeword for data value " + local36);
			}
			@Pc(68) int local68 = local23 >> 3;
			@Pc(72) int local72 = local23 & 0x7;
			local19 &= -local72 >> 31;
			@Pc(90) int local90 = local68 + (local72 + local46 - 1 >> 3);
			local23 += local46;
			@Pc(95) int local95 = local72 + 24;
			arg4[local68] = (byte) (local19 |= local41 >>> local95);
			if (local90 > local68) {
				local68++;
				local72 = local95 - 8;
				arg4[local68] = (byte) (local19 = local41 >>> local72);
				if (local90 > local68) {
					local68++;
					local72 -= 8;
					arg4[local68] = (byte) (local19 = local41 >>> local72);
					if (local68 < local90) {
						local68++;
						local72 -= 8;
						arg4[local68] = (byte) (local19 = local41 >>> local72);
						if (local68 < local90) {
							local72 -= 8;
							local68++;
							arg4[local68] = (byte) (local19 = local41 << -local72);
						}
					}
				}
			}
			arg1++;
		}
		return (local23 + 7 >> 3) - arg0;
	}
}

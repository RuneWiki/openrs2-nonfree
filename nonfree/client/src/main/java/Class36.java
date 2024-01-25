import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class36 {

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "[I")
	private final int[] anIntArray60;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V")
	public Class36(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray60 = new int[local6];
		this.aByteArray14 = arg0;
		this.anIntArray59 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray60[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(87) int local87;
				if ((local39 & local43) == 0) {
					local61 = local43 | local39;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local43 != local77) {
							break;
						}
						local87 = 0x1 << 32 - local71;
						if ((local87 & local77) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local77 | local87;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local20[local71] == local43) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local87;
					if ((local43 & local148) == 0) {
						local77++;
					} else {
						if (this.anIntArray59[local77] == 0) {
							this.anIntArray59[local77] = local22;
						}
						local77 = this.anIntArray59[local77];
					}
					if (local77 >= this.anIntArray59.length) {
						@Pc(189) int[] local189 = new int[this.anIntArray59.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray59.length; local191++) {
							local189[local191] = this.anIntArray59[local191];
						}
						this.anIntArray59 = local189;
					}
				}
				this.anIntArray59[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BIBI[BI)I")
	public int method1073(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(21) byte local21 = arg0[local17];
			if (local21 >= 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local37;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local76;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local108;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(143) int local143;
			if ((local143 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local143;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(178) int local178;
			if ((local178 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local178;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local214;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local252;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray59[local11];
			}
			@Pc(290) int local290;
			if ((local290 = this.anIntArray59[local11]) < 0) {
				arg3[arg1++] = (byte) ~local290;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([B[BIIII)I")
	public int method1075(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2 << 3;
		@Pc(15) int local15 = arg3;
		while (local15 > arg4) {
			@Pc(31) int local31 = arg0[arg4] & 0xFF;
			@Pc(36) int local36 = this.anIntArray60[local31];
			@Pc(41) byte local41 = this.aByteArray14[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(61) int local61 = local11 >> 3;
			@Pc(65) int local65 = local11 & 0x7;
			local7 &= -local65 >> 31;
			@Pc(82) int local82 = (local65 + local41 - 1 >> 3) + local61;
			@Pc(83) int local83 = local65 + 24;
			arg1[local61] = (byte) (local7 |= local36 >>> local83);
			if (local61 < local82) {
				local61++;
				local65 = local83 - 8;
				arg1[local61] = (byte) (local7 = local36 >>> local65);
				if (local82 > local61) {
					local61++;
					local65 -= 8;
					arg1[local61] = (byte) (local7 = local36 >>> local65);
					if (local61 < local82) {
						local61++;
						local65 -= 8;
						arg1[local61] = (byte) (local7 = local36 >>> local65);
						if (local61 < local82) {
							local61++;
							local65 -= 8;
							arg1[local61] = (byte) (local7 = local36 << -local65);
						}
					}
				}
			}
			local11 += local41;
			arg4++;
		}
		return (local11 + 7 >> 3) - arg2;
	}
}

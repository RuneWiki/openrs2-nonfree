import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class11 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "[I")
	private final int[] anIntArray47;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
	public Class11(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray7 = arg0;
		this.anIntArray48 = new int[8];
		this.anIntArray47 = new int[local6];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray47[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(87) int local87;
				if ((local43 & local39) == 0) {
					local61 = local39 | local43;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local77 != local43) {
							break;
						}
						local87 = 0x1 << 32 - local71;
						if ((local87 & local77) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local87 | local77;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local43 == local20[local71]) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local87;
					if ((local155 & local43) == 0) {
						local77++;
					} else {
						if (this.anIntArray48[local77] == 0) {
							this.anIntArray48[local77] = local22;
						}
						local77 = this.anIntArray48[local77];
					}
					if (local77 >= this.anIntArray48.length) {
						@Pc(195) int[] local195 = new int[this.anIntArray48.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray48.length; local197++) {
							local195[local197] = this.anIntArray48[local197];
						}
						this.anIntArray48 = local195;
					}
				}
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
				this.anIntArray48[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BII[BII)I")
	public int method262(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg3 << 3;
		while (local10 > arg4) {
			@Pc(28) int local28 = arg2[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray47[local28];
			@Pc(38) byte local38 = this.aByteArray7[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local16 += local38;
			local12 &= -local59 >> 31;
			@Pc(81) int local81 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(82) int local82 = local59 + 24;
			arg0[local55] = (byte) (local12 |= local33 >>> local82);
			if (local55 < local81) {
				local55++;
				local59 = local82 - 8;
				arg0[local55] = (byte) (local12 = local33 >>> local59);
				if (local55 < local81) {
					local59 -= 8;
					local55++;
					arg0[local55] = (byte) (local12 = local33 >>> local59);
					if (local55 < local81) {
						local59 -= 8;
						local55++;
						arg0[local55] = (byte) (local12 = local33 >>> local59);
						if (local81 > local55) {
							local55++;
							local59 -= 8;
							arg0[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			arg4++;
		}
		return (local16 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BI[BIII)I")
	public int method265(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg4;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg2;
		while (true) {
			@Pc(32) byte local32 = arg0[local28];
			if (local32 < 0) {
				local26 = this.anIntArray48[local26];
			} else {
				local26++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local48;
				if (arg3 >= local16) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local87;
				if (local16 <= arg3) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local122;
				if (arg3 >= local16) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local157;
				if (local16 <= arg3) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(189) int local189;
			if ((local189 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local189;
				if (local16 <= arg3) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(228) int local228;
			if ((local228 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local228;
				if (local16 <= arg3) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local263;
				if (arg3 >= local16) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray48[local26];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray48[local26]) < 0) {
				arg1[arg3++] = (byte) ~local299;
				if (local16 <= arg3) {
					break;
				}
				local26 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg2;
	}
}

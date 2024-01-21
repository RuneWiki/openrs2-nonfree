import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class29 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
	private final int[] anIntArray91;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
	public Class29(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray91 = new int[local6];
		this.aByteArray13 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray92 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray91[local24] = local46;
				@Pc(64) int local64;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(92) int local92;
				if ((local46 & local42) == 0) {
					local64 = local42 | local46;
					for (local74 = local30 - 1; local74 >= 1; local74--) {
						local80 = local16[local74];
						if (local80 != local46) {
							break;
						}
						local92 = 0x1 << 32 - local74;
						if ((local80 & local92) != 0) {
							local16[local74] = local16[local74 - 1];
							break;
						}
						local16[local74] = local80 | local92;
					}
				} else {
					local64 = local16[local30 - 1];
				}
				local16[local30] = local64;
				for (local74 = local30 + 1; local74 <= 32; local74++) {
					if (local46 == local16[local74]) {
						local16[local74] = local64;
					}
				}
				local80 = 0;
				for (local92 = 0; local92 < local30; local92++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local92;
					if ((local46 & local155) == 0) {
						local80++;
					} else {
						if (this.anIntArray92[local80] == 0) {
							this.anIntArray92[local80] = local22;
						}
						local80 = this.anIntArray92[local80];
					}
					if (local80 >= this.anIntArray92.length) {
						@Pc(192) int[] local192 = new int[this.anIntArray92.length * 2];
						for (@Pc(194) int local194 = 0; local194 < this.anIntArray92.length; local194++) {
							local192[local194] = this.anIntArray92[local194];
						}
						this.anIntArray92 = local192;
					}
				}
				this.anIntArray92[local80] = ~local24;
				if (local80 >= local22) {
					local22 = local80 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[BBI[B)I")
	public int method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(25) int local25 = arg1;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg3;
		while (true) {
			@Pc(33) byte local33 = arg4[local29];
			if (local33 >= 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local49;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local87;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local125;
				if (arg0 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local157;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local192;
				if (arg0 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local231;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local267;
				if (arg0 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray92[local27];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray92[local27]) < 0) {
				arg2[arg0++] = (byte) ~local306;
				if (arg0 >= local25) {
					break;
				}
				local27 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg3;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BIIB[BI)I")
	public int method634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4 << 3;
		while (local9 > arg2) {
			@Pc(28) int local28 = arg0[arg2] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray13[local28];
			@Pc(38) int local38 = this.anIntArray91[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local15 >> 3;
			@Pc(62) int local62 = local15 & 0x7;
			local11 &= -local62 >> 31;
			local15 += local33;
			@Pc(85) int local85 = local58 + (local62 + local33 - 1 >> 3);
			@Pc(86) int local86 = local62 + 24;
			arg3[local58] = (byte) (local11 |= local38 >>> local86);
			if (local58 < local85) {
				local58++;
				local62 = local86 - 8;
				arg3[local58] = (byte) (local11 = local38 >>> local62);
				if (local85 > local58) {
					local62 -= 8;
					local58++;
					arg3[local58] = (byte) (local11 = local38 >>> local62);
					if (local58 < local85) {
						local62 -= 8;
						local58++;
						arg3[local58] = (byte) (local11 = local38 >>> local62);
						if (local85 > local58) {
							local58++;
							local62 -= 8;
							arg3[local58] = (byte) (local11 = local38 << -local62);
						}
					}
				}
			}
			arg2++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}

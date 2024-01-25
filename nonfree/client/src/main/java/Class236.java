import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class236 {

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
	private final int[] anIntArray497;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
	public Class236(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray82 = arg0;
		this.anIntArray497 = new int[local6];
		this.anIntArray498 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray497[local24] = local42;
				@Pc(111) int local111;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(80) int local80;
				if ((local42 & local38) == 0) {
					for (local58 = local30 - 1; local58 >= 1; local58--) {
						local64 = local20[local58];
						if (local42 != local64) {
							break;
						}
						local80 = 0x1 << 32 - local58;
						if ((local64 & local80) != 0) {
							local20[local58] = local20[local58 - 1];
							break;
						}
						local20[local58] = local64 | local80;
					}
					local111 = local42 | local38;
				} else {
					local111 = local20[local30 - 1];
				}
				local20[local30] = local111;
				for (local58 = local30 + 1; local58 <= 32; local58++) {
					if (local42 == local20[local58]) {
						local20[local58] = local111;
					}
				}
				local64 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(152) int local152 = Integer.MIN_VALUE >>> local80;
					if ((local42 & local152) == 0) {
						local64++;
					} else {
						if (this.anIntArray498[local64] == 0) {
							this.anIntArray498[local64] = local22;
						}
						local64 = this.anIntArray498[local64];
					}
					if (local64 >= this.anIntArray498.length) {
						@Pc(200) int[] local200 = new int[this.anIntArray498.length * 2];
						for (@Pc(202) int local202 = 0; local202 < this.anIntArray498.length; local202++) {
							local200[local202] = this.anIntArray498[local202];
						}
						this.anIntArray498 = local200;
					}
				}
				this.anIntArray498[local64] = ~local24;
				if (local22 <= local64) {
					local22 = local64 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([BII[BII)I")
	public int method5081(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(23) int local23 = arg4 << 3;
		while (arg2 < local11) {
			@Pc(31) int local31 = arg3[arg2] & 0xFF;
			@Pc(36) int local36 = this.anIntArray497[local31];
			@Pc(41) byte local41 = this.aByteArray82[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(58) int local58 = local23 >> 3;
			@Pc(62) int local62 = local23 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(80) int local80 = (local62 + local41 - 1 >> 3) + local58;
			local23 += local41;
			@Pc(85) int local85 = local62 + 24;
			arg0[local58] = (byte) (local7 |= local36 >>> local85);
			if (local58 < local80) {
				local58++;
				local62 = local85 - 8;
				arg0[local58] = (byte) (local7 = local36 >>> local62);
				if (local80 > local58) {
					local62 -= 8;
					local58++;
					arg0[local58] = (byte) (local7 = local36 >>> local62);
					if (local80 > local58) {
						local62 -= 8;
						local58++;
						arg0[local58] = (byte) (local7 = local36 >>> local62);
						if (local58 < local80) {
							local58++;
							local62 -= 8;
							arg0[local58] = (byte) (local7 = local36 << -local62);
						}
					}
				}
			}
			arg2++;
		}
		return (local23 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BIB[B)I")
	public int method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg0;
		while (true) {
			@Pc(21) byte local21 = arg2[local17];
			if (local21 < 0) {
				local11 = this.anIntArray498[local11];
			} else {
				local11++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local37;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local76;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local114;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(153) int local153;
			if ((local153 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local153;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(185) int local185;
			if ((local185 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local185;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local227;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(265) int local265;
			if ((local265 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local265;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray498[local11];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray498[local11]) < 0) {
				arg4[arg3++] = (byte) ~local303;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg0;
	}
}

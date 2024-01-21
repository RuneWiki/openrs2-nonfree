import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class30 {

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[I")
	private final int[] anIntArray171;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
	public Class30(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray170 = new int[8];
		this.aByteArray10 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray171 = new int[local6];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray171[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local46 & local42) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local16[local67];
						if (local46 != local73) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local85 & local73) != 0) {
							local16[local67] = local16[local67 - 1];
							break;
						}
						local16[local67] = local73 | local85;
					}
					local61 = local42 | local46;
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local16[local67] == local46) {
						local16[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local85;
					if ((local146 & local46) == 0) {
						local73++;
					} else {
						if (this.anIntArray170[local73] == 0) {
							this.anIntArray170[local73] = local22;
						}
						local73 = this.anIntArray170[local73];
					}
					if (local73 >= this.anIntArray170.length) {
						@Pc(188) int[] local188 = new int[this.anIntArray170.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray170.length; local190++) {
							local188[local190] = this.anIntArray170[local190];
						}
						this.anIntArray170 = local188;
					}
				}
				this.anIntArray170[local73] = ~local24;
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B[BIII)I")
	public int method827(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg4;
		while (true) {
			@Pc(27) byte local27 = arg0[local23];
			if (local27 >= 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local45;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local76;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local114;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local155;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local193;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(224) int local224;
			if ((local224 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local224;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local258;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray170[local21];
			}
			@Pc(293) int local293;
			if ((local293 = this.anIntArray170[local21]) < 0) {
				arg1[arg3++] = (byte) ~local293;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg4;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([BIIB[BI)I")
	public int method830(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 << 3;
		while (local9 > arg4) {
			@Pc(23) int local23 = arg3[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray171[local23];
			@Pc(33) byte local33 = this.aByteArray10[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local11 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local33 - 1 >> 3);
			local15 += local33;
			@Pc(77) int local77 = local54 + 24;
			arg0[local50] = (byte) (local11 |= local28 >>> local77);
			if (local50 < local72) {
				local50++;
				local54 = local77 - 8;
				arg0[local50] = (byte) (local11 = local28 >>> local54);
				if (local50 < local72) {
					local50++;
					local54 -= 8;
					arg0[local50] = (byte) (local11 = local28 >>> local54);
					if (local50 < local72) {
						local54 -= 8;
						local50++;
						arg0[local50] = (byte) (local11 = local28 >>> local54);
						if (local50 < local72) {
							local50++;
							local54 -= 8;
							arg0[local50] = (byte) (local11 = local28 << -local54);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg1;
	}
}

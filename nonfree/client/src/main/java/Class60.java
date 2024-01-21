import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class60 {

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
	private final int[] anIntArray268;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
	public Class60(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) int[] local9 = new int[33];
		this.aByteArray37 = arg0;
		@Pc(14) int local14 = 0;
		this.anIntArray267 = new int[8];
		this.anIntArray268 = new int[local6];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local9[local30];
				this.anIntArray268[local24] = local46;
				@Pc(107) int local107;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(79) int local79;
				if ((local42 & local46) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local9[local62];
						if (local68 != local46) {
							break;
						}
						local79 = 0x1 << 32 - local62;
						if ((local68 & local79) != 0) {
							local9[local62] = local9[local62 - 1];
							break;
						}
						local9[local62] = local79 | local68;
					}
					local107 = local42 | local46;
				} else {
					local107 = local9[local30 - 1];
				}
				local9[local30] = local107;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local46 == local9[local62]) {
						local9[local62] = local107;
					}
				}
				local68 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local79;
					if ((local46 & local150) == 0) {
						local68++;
					} else {
						if (this.anIntArray267[local68] == 0) {
							this.anIntArray267[local68] = local14;
						}
						local68 = this.anIntArray267[local68];
					}
					if (this.anIntArray267.length <= local68) {
						@Pc(192) int[] local192 = new int[this.anIntArray267.length * 2];
						for (@Pc(194) int local194 = 0; local194 < this.anIntArray267.length; local194++) {
							local192[local194] = this.anIntArray267[local194];
						}
						this.anIntArray267 = local192;
					}
				}
				this.anIntArray267[local68] = ~local24;
				if (local14 <= local68) {
					local14 = local68 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BB[BIII)I")
	public int method2016(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4;
		@Pc(19) int local19 = arg3 << 3;
		while (local15 > arg2) {
			@Pc(31) int local31 = arg0[arg2] & 0xFF;
			@Pc(36) int local36 = this.anIntArray268[local31];
			@Pc(41) byte local41 = this.aByteArray37[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(58) int local58 = local19 & 0x7;
			@Pc(62) int local62 = local19 >> 3;
			local11 &= -local58 >> 31;
			local19 += local41;
			@Pc(83) int local83 = (local41 + local58 - 1 >> 3) + local62;
			@Pc(84) int local84 = local58 + 24;
			arg1[local62] = (byte) (local11 |= local36 >>> local84);
			if (local62 < local83) {
				local58 = local84 - 8;
				local62++;
				arg1[local62] = (byte) (local11 = local36 >>> local58);
				if (local62 < local83) {
					local62++;
					local58 -= 8;
					arg1[local62] = (byte) (local11 = local36 >>> local58);
					if (local83 > local62) {
						local62++;
						local58 -= 8;
						arg1[local62] = (byte) (local11 = local36 >>> local58);
						if (local83 > local62) {
							local62++;
							local58 -= 8;
							arg1[local62] = (byte) (local11 = local36 << -local58);
						}
					}
				}
			}
			arg2++;
		}
		return (local19 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[BB[B)I")
	public int method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = arg2;
		while (true) {
			@Pc(32) byte local32 = arg3[local28];
			if (local32 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(51) int local51;
			if ((local51 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local51;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local86;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local125;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local157;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local193;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local225;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local260;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray267[local18];
			}
			@Pc(296) int local296;
			if ((local296 = this.anIntArray267[local18]) < 0) {
				arg4[arg0++] = (byte) ~local296;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg2;
	}
}

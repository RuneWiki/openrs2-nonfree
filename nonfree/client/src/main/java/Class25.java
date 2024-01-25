import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class25 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
	private final int[] anIntArray47;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V")
	public Class25(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray47 = new int[local6];
		this.aByteArray17 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray48 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray47[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(89) int local89;
				if ((local42 & local46) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local16[local70];
						if (local46 != local76) {
							break;
						}
						local89 = 0x1 << 32 - local70;
						if ((local76 & local89) != 0) {
							local16[local70] = local16[local70 - 1];
							break;
						}
						local16[local70] = local89 | local76;
					}
					local64 = local42 | local46;
				} else {
					local64 = local16[local30 - 1];
				}
				local16[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local16[local70] == local46) {
						local16[local70] = local64;
					}
				}
				local76 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local89;
					if ((local46 & local155) == 0) {
						local76++;
					} else {
						if (this.anIntArray48[local76] == 0) {
							this.anIntArray48[local76] = local22;
						}
						local76 = this.anIntArray48[local76];
					}
					if (this.anIntArray48.length <= local76) {
						@Pc(196) int[] local196 = new int[this.anIntArray48.length * 2];
						for (@Pc(198) int local198 = 0; local198 < this.anIntArray48.length; local198++) {
							local196[local198] = this.anIntArray48[local198];
						}
						this.anIntArray48 = local196;
					}
				}
				this.anIntArray48[local76] = ~local24;
				if (local76 >= local22) {
					local22 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([B[BBIII)I")
	public int method343(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg4;
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 < 0) {
				local15 = this.anIntArray48[local15];
			} else {
				local15++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local48;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local87;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local129;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local164;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local203;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local242;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(277) int local277;
			if ((local277 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local277;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray48[local15];
			}
			@Pc(313) int local313;
			if ((local313 = this.anIntArray48[local15]) < 0) {
				arg1[arg2++] = (byte) ~local313;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([B[BIIII)I")
	public int method345(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2 << 3;
		@Pc(20) int local20 = arg3;
		while (arg4 < local20) {
			@Pc(28) int local28 = arg0[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray47[local28];
			@Pc(38) byte local38 = this.aByteArray17[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local11 >> 3;
			@Pc(59) int local59 = local11 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = local55 + (local59 + local38 - 1 >> 3);
			local11 += local38;
			@Pc(82) int local82 = local59 + 24;
			arg1[local55] = (byte) (local7 |= local33 >>> local82);
			if (local77 > local55) {
				local55++;
				local59 = local82 - 8;
				arg1[local55] = (byte) (local7 = local33 >>> local59);
				if (local55 < local77) {
					local59 -= 8;
					local55++;
					arg1[local55] = (byte) (local7 = local33 >>> local59);
					if (local55 < local77) {
						local59 -= 8;
						local55++;
						arg1[local55] = (byte) (local7 = local33 >>> local59);
						if (local55 < local77) {
							local55++;
							local59 -= 8;
							arg1[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			arg4++;
		}
		return (local11 + 7 >> 3) - arg2;
	}
}

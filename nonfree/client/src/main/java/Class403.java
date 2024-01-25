import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class403 {

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "[B")
	private final byte[] aByteArray110;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "[I")
	private final int[] anIntArray790;

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "[I")
	private int[] anIntArray791;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "([B)V")
	public Class403(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray110 = arg0;
		this.anIntArray790 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray791 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray790[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(90) int local90;
				if ((local39 & local43) == 0) {
					local61 = local43 | local39;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local16[local71];
						if (local77 != local43) {
							break;
						}
						local90 = 0x1 << 32 - local71;
						if ((local90 & local77) != 0) {
							local16[local71] = local16[local71 - 1];
							break;
						}
						local16[local71] = local90 | local77;
					}
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local43 == local16[local71]) {
						local16[local71] = local61;
					}
				}
				local77 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(172) int local172 = Integer.MIN_VALUE >>> local90;
					if ((local172 & local43) == 0) {
						local77++;
					} else {
						if (this.anIntArray791[local77] == 0) {
							this.anIntArray791[local77] = local22;
						}
						local77 = this.anIntArray791[local77];
					}
					if (local77 >= this.anIntArray791.length) {
						@Pc(219) int[] local219 = new int[this.anIntArray791.length * 2];
						for (@Pc(221) int local221 = 0; local221 < this.anIntArray791.length; local221++) {
							local219[local221] = this.anIntArray791[local221];
						}
						this.anIntArray791 = local219;
					}
				}
				this.anIntArray791[local77] = ~local24;
				if (local77 >= local22) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "([BIIII[B)I")
	public int method9477(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg3 << 3;
		@Pc(29) int local29 = arg2;
		while (local29 > arg1) {
			@Pc(39) int local39 = arg0[arg1] & 0xFF;
			@Pc(44) int local44 = this.anIntArray790[local39];
			@Pc(49) byte local49 = this.aByteArray110[local39];
			if (local49 == 0) {
				throw new RuntimeException("No codeword for data value " + local39);
			}
			@Pc(72) int local72 = local25 >> 3;
			@Pc(76) int local76 = local25 & 0x7;
			local21 &= -local76 >> 31;
			@Pc(94) int local94 = local72 + (local49 + local76 - 1 >> 3);
			local25 += local49;
			@Pc(99) int local99 = local76 + 24;
			arg4[local72] = (byte) (local21 |= local44 >>> local99);
			if (local94 > local72) {
				local76 = local99 - 8;
				local72++;
				arg4[local72] = (byte) (local21 = local44 >>> local76);
				if (local94 > local72) {
					local72++;
					local76 -= 8;
					arg4[local72] = (byte) (local21 = local44 >>> local76);
					if (local72 < local94) {
						local72++;
						local76 -= 8;
						arg4[local72] = (byte) (local21 = local44 >>> local76);
						if (local72 < local94) {
							local72++;
							local76 -= 8;
							arg4[local72] = (byte) (local21 = local44 << -local76);
						}
					}
				}
			}
			arg1++;
		}
		return (local25 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "([BIZ[BII)I")
	public int method9480(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(24) int local24 = arg4;
		@Pc(26) int local26 = arg1;
		while (true) {
			@Pc(30) byte local30 = arg0[local26];
			if (local30 >= 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(53) int local53;
			if ((local53 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local53;
				if (arg3 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(89) int local89;
			if ((local89 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local89;
				if (local24 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(132) int local132;
			if ((local132 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local132;
				if (local24 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(171) int local171;
			if ((local171 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local171;
				if (local24 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local217;
				if (local24 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(256) int local256;
			if ((local256 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local256;
				if (local24 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local299;
				if (arg3 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray791[local12];
			}
			@Pc(335) int local335;
			if ((local335 = this.anIntArray791[local12]) < 0) {
				arg2[arg3++] = (byte) ~local335;
				if (local24 <= arg3) {
					break;
				}
				local12 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg1;
	}
}

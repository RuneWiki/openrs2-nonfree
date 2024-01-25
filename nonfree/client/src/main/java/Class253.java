import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class253 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
	private final int[] anIntArray520;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "[B")
	private final byte[] aByteArray84;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "([B)V")
	public Class253(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray520 = new int[local6];
		this.aByteArray84 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray519 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray520[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(83) int local83;
				if ((local39 & local43) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local16[local64];
						if (local43 != local70) {
							break;
						}
						local83 = 0x1 << 32 - local64;
						if ((local70 & local83) != 0) {
							local16[local64] = local16[local64 - 1];
							break;
						}
						local16[local64] = local83 | local70;
					}
					local58 = local39 | local43;
				} else {
					local58 = local16[local30 - 1];
				}
				local16[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local43 == local16[local64]) {
						local16[local64] = local58;
					}
				}
				local70 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local83;
					if ((local151 & local43) == 0) {
						local70++;
					} else {
						if (this.anIntArray519[local70] == 0) {
							this.anIntArray519[local70] = local22;
						}
						local70 = this.anIntArray519[local70];
					}
					if (this.anIntArray519.length <= local70) {
						@Pc(188) int[] local188 = new int[this.anIntArray519.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray519.length; local190++) {
							local188[local190] = this.anIntArray519[local190];
						}
						this.anIntArray519 = local188;
					}
				}
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
				this.anIntArray519[local70] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([B[BIIII)I")
	public int method5697(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg3;
		@Pc(27) int local27 = arg4;
		while (true) {
			@Pc(31) byte local31 = arg1[local27];
			if (local31 < 0) {
				local21 = this.anIntArray519[local21];
			} else {
				local21++;
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local49;
				if (arg2 >= local25) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x40) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local87;
				if (local25 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x20) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local125;
				if (arg2 >= local25) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x10) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(162) int local162;
			if ((local162 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local162;
				if (arg2 >= local25) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x8) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(196) int local196;
			if ((local196 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local196;
				if (arg2 >= local25) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x4) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local230;
				if (local25 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x2) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local271;
				if (local25 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local31 & 0x1) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray519[local21];
			}
			@Pc(305) int local305;
			if ((local305 = this.anIntArray519[local21]) < 0) {
				arg0[arg2++] = (byte) ~local305;
				if (arg2 >= local25) {
					break;
				}
				local21 = 0;
			}
			local27++;
		}
		return local27 + 1 - arg4;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BII[BII)I")
	public int method5699(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg4 << 3;
		@Pc(13) int local13 = arg1;
		while (arg2 < local13) {
			@Pc(20) int local20 = arg3[arg2] & 0xFF;
			@Pc(25) int local25 = this.anIntArray520[local20];
			@Pc(30) byte local30 = this.aByteArray84[local20];
			if (local30 == 0) {
				throw new RuntimeException("No codeword for data value " + local20);
			}
			@Pc(50) int local50 = local9 >> 3;
			@Pc(54) int local54 = local9 & 0x7;
			local5 &= -local54 >> 31;
			@Pc(71) int local71 = (local54 + local30 - 1 >> 3) + local50;
			@Pc(72) int local72 = local54 + 24;
			arg0[local50] = (byte) (local5 |= local25 >>> local72);
			if (local71 > local50) {
				local54 = local72 - 8;
				local50++;
				arg0[local50] = (byte) (local5 = local25 >>> local54);
				if (local50 < local71) {
					local54 -= 8;
					local50++;
					arg0[local50] = (byte) (local5 = local25 >>> local54);
					if (local71 > local50) {
						local54 -= 8;
						local50++;
						arg0[local50] = (byte) (local5 = local25 >>> local54);
						if (local50 < local71) {
							local54 -= 8;
							local50++;
							arg0[local50] = (byte) (local5 = local25 << -local54);
						}
					}
				}
			}
			local9 += local30;
			arg2++;
		}
		return (local9 + 7 >> 3) - arg4;
	}
}

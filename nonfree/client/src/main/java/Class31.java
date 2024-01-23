import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class31 {

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
	public Class31(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray21 = arg0;
		this.anIntArray117 = new int[8];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray118 = new int[local6];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(48) int local48 = 0x1 << 32 - local35;
				@Pc(52) int local52 = local16[local35];
				this.anIntArray118[local24] = local52;
				@Pc(70) int local70;
				@Pc(80) int local80;
				@Pc(89) int local89;
				@Pc(103) int local103;
				if ((local48 & local52) == 0) {
					local70 = local52 | local48;
					for (local80 = local35 - 1; local80 >= 1; local80--) {
						local89 = local16[local80];
						if (local89 != local52) {
							break;
						}
						local103 = 0x1 << 32 - local80;
						if ((local103 & local89) != 0) {
							local16[local80] = local16[local80 - 1];
							break;
						}
						local16[local80] = local89 | local103;
					}
				} else {
					local70 = local16[local35 - 1];
				}
				local16[local35] = local70;
				for (local80 = local35 + 1; local80 <= 32; local80++) {
					if (local16[local80] == local52) {
						local16[local80] = local70;
					}
				}
				local80 = 0;
				for (local89 = 0; local89 < local35; local89++) {
					local103 = Integer.MIN_VALUE >>> local89;
					if ((local103 & local52) == 0) {
						local80++;
					} else {
						if (this.anIntArray117[local80] == 0) {
							this.anIntArray117[local80] = local22;
						}
						local80 = this.anIntArray117[local80];
					}
					if (local80 >= this.anIntArray117.length) {
						@Pc(213) int[] local213 = new int[this.anIntArray117.length * 2];
						for (@Pc(215) int local215 = 0; local215 < this.anIntArray117.length; local215++) {
							local213[local215] = this.anIntArray117[local215];
						}
						this.anIntArray117 = local213;
					}
				}
				this.anIntArray117[local80] = ~local24;
				if (local22 <= local80) {
					local22 = local80 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIBII[B)I")
	public int method708(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = arg3 << 3;
		while (local9 > arg1) {
			@Pc(35) int local35 = arg4[arg1] & 0xFF;
			@Pc(40) int local40 = this.anIntArray118[local35];
			@Pc(45) byte local45 = this.aByteArray21[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(67) int local67 = local22 >> 3;
			@Pc(71) int local71 = local22 & 0x7;
			@Pc(82) int local82 = (local71 + local45 - 1 >> 3) + local67;
			local18 &= -local71 >> 31;
			local22 += local45;
			@Pc(94) int local94 = local71 + 24;
			arg0[local67] = (byte) (local18 |= local40 >>> local94);
			if (local82 > local67) {
				local67++;
				local71 = local94 - 8;
				arg0[local67] = (byte) (local18 = local40 >>> local71);
				if (local67 < local82) {
					local67++;
					local71 -= 8;
					arg0[local67] = (byte) (local18 = local40 >>> local71);
					if (local82 > local67) {
						local67++;
						local71 -= 8;
						arg0[local67] = (byte) (local18 = local40 >>> local71);
						if (local82 > local67) {
							local67++;
							local71 -= 8;
							arg0[local67] = (byte) (local18 = local40 << -local71);
						}
					}
				}
			}
			arg1++;
		}
		return (local22 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ[BII[B)I")
	public int method713(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(34) int local34 = arg2;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = arg3;
		while (true) {
			@Pc(42) byte local42 = arg4[local38];
			if (local42 < 0) {
				local36 = this.anIntArray117[local36];
			} else {
				local36++;
			}
			@Pc(61) int local61;
			if ((local61 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local61;
				if (local34 <= arg0) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x40) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(102) int local102;
			if ((local102 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local102;
				if (local34 <= arg0) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x20) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(143) int local143;
			if ((local143 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local143;
				if (arg0 >= local34) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x10) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local184;
				if (local34 <= arg0) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x8) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local221;
				if (local34 <= arg0) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x4) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(261) int local261;
			if ((local261 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local261;
				if (arg0 >= local34) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x2) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(297) int local297;
			if ((local297 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local297;
				if (arg0 >= local34) {
					break;
				}
				local36 = 0;
			}
			if ((local42 & 0x1) == 0) {
				local36++;
			} else {
				local36 = this.anIntArray117[local36];
			}
			@Pc(339) int local339;
			if ((local339 = this.anIntArray117[local36]) < 0) {
				arg1[arg0++] = (byte) ~local339;
				if (arg0 >= local34) {
					break;
				}
				local36 = 0;
			}
			local38++;
		}
		return local38 + 1 - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class41 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "[I")
	private final int[] anIntArray66;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "[B")
	private final byte[] aByteArray15;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Class41(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray66 = new int[local6];
		this.aByteArray15 = arg0;
		this.anIntArray67 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray66[local24] = local43;
				@Pc(110) int local110;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(80) int local80;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local65 != local43) {
							break;
						}
						local80 = 0x1 << 32 - local59;
						if ((local65 & local80) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local65 | local80;
					}
					local110 = local39 | local43;
				} else {
					local110 = local20[local30 - 1];
				}
				local20[local30] = local110;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local20[local59] == local43) {
						local20[local59] = local110;
					}
				}
				local65 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local80;
					if ((local43 & local157) == 0) {
						local65++;
					} else {
						if (this.anIntArray67[local65] == 0) {
							this.anIntArray67[local65] = local22;
						}
						local65 = this.anIntArray67[local65];
					}
					if (local65 >= this.anIntArray67.length) {
						@Pc(194) int[] local194 = new int[this.anIntArray67.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray67.length; local196++) {
							local194[local196] = this.anIntArray67[local196];
						}
						this.anIntArray67 = local194;
					}
				}
				this.anIntArray67[local65] = ~local24;
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[B[BII)I")
	public int method850(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg4;
		@Pc(29) int local29 = arg3 << 3;
		while (local25 > arg0) {
			@Pc(37) int local37 = arg2[arg0] & 0xFF;
			@Pc(42) int local42 = this.anIntArray66[local37];
			@Pc(47) byte local47 = this.aByteArray15[local37];
			if (local47 == 0) {
				throw new RuntimeException("No codeword for data value " + local37);
			}
			@Pc(64) int local64 = local29 >> 3;
			@Pc(68) int local68 = local29 & 0x7;
			local21 &= -local68 >> 31;
			@Pc(85) int local85 = (local47 + local68 - 1 >> 3) + local64;
			local29 += local47;
			@Pc(90) int local90 = local68 + 24;
			arg1[local64] = (byte) (local21 |= local42 >>> local90);
			if (local85 > local64) {
				local68 = local90 - 8;
				local64++;
				arg1[local64] = (byte) (local21 = local42 >>> local68);
				if (local85 > local64) {
					local68 -= 8;
					local64++;
					arg1[local64] = (byte) (local21 = local42 >>> local68);
					if (local64 < local85) {
						local68 -= 8;
						local64++;
						arg1[local64] = (byte) (local21 = local42 >>> local68);
						if (local85 > local64) {
							local64++;
							local68 -= 8;
							arg1[local64] = (byte) (local21 = local42 << -local68);
						}
					}
				}
			}
			arg0++;
		}
		return (local29 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI[BI)I")
	public int method851(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg4;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg1[local22];
			if (local26 < 0) {
				local15 = this.anIntArray67[local15];
			} else {
				local15++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local42;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local80;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local115;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(147) int local147;
			if ((local147 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local147;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local179;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local221;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(256) int local256;
			if ((local256 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local256;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray67[local15];
			}
			@Pc(291) int local291;
			if ((local291 = this.anIntArray67[local15]) < 0) {
				arg3[arg0++] = (byte) ~local291;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg2;
	}
}

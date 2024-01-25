import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class13 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "[I")
	private final int[] anIntArray107;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[B")
	private final byte[] aByteArray15;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([B)V")
	public Class13(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray107 = new int[local6];
		this.aByteArray15 = arg0;
		this.anIntArray108 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray107[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(84) int local84;
				if ((local43 & local39) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local20[local64];
						if (local43 != local70) {
							break;
						}
						local84 = 0x1 << 32 - local64;
						if ((local70 & local84) != 0) {
							local20[local64] = local20[local64 - 1];
							break;
						}
						local20[local64] = local84 | local70;
					}
					local58 = local43 | local39;
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local20[local64] == local43) {
						local20[local64] = local58;
					}
				}
				local70 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local84;
					if ((local43 & local151) == 0) {
						local70++;
					} else {
						if (this.anIntArray108[local70] == 0) {
							this.anIntArray108[local70] = local22;
						}
						local70 = this.anIntArray108[local70];
					}
					if (this.anIntArray108.length <= local70) {
						@Pc(196) int[] local196 = new int[this.anIntArray108.length * 2];
						for (@Pc(198) int local198 = 0; local198 < this.anIntArray108.length; local198++) {
							local196[local198] = this.anIntArray108[local198];
						}
						this.anIntArray108 = local196;
					}
				}
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
				this.anIntArray108[local70] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIIII[B)I")
	public int method634(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg3 << 3;
		while (arg2 < local11) {
			@Pc(28) int local28 = arg4[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray107[local28];
			@Pc(38) byte local38 = this.aByteArray15[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local15 >> 3;
			@Pc(59) int local59 = local15 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = local55 + (local59 + local38 - 1 >> 3);
			@Pc(78) int local78 = local59 + 24;
			arg0[local55] = (byte) (local7 |= local33 >>> local78);
			if (local77 > local55) {
				local55++;
				local59 = local78 - 8;
				arg0[local55] = (byte) (local7 = local33 >>> local59);
				if (local77 > local55) {
					local59 -= 8;
					local55++;
					arg0[local55] = (byte) (local7 = local33 >>> local59);
					if (local55 < local77) {
						local55++;
						local59 -= 8;
						arg0[local55] = (byte) (local7 = local33 >>> local59);
						if (local55 < local77) {
							local55++;
							local59 -= 8;
							arg0[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			local15 += local38;
			arg2++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIII[BI)I")
	public int method636(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(25) int local25 = arg2;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg1;
		while (true) {
			@Pc(33) byte local33 = arg0[local29];
			if (local33 >= 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local49;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local84;
				if (local25 <= arg4) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local122;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(154) int local154;
			if ((local154 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local154;
				if (local25 <= arg4) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(189) int local189;
			if ((local189 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local189;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local227;
				if (local25 <= arg4) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local263;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray108[local27];
			}
			@Pc(305) int local305;
			if ((local305 = this.anIntArray108[local27]) < 0) {
				arg3[arg4++] = (byte) ~local305;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg1;
	}
}

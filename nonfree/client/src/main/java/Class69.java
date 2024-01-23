import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class69 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "([B)V")
	public Class69(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray187 = new int[local6];
		@Pc(13) int[] local13 = new int[33];
		this.aByteArray24 = arg0;
		@Pc(18) int local18 = 0;
		this.anIntArray186 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(43) int local43 = 0x1 << 32 - local31;
				@Pc(47) int local47 = local13[local31];
				this.anIntArray187[local24] = local47;
				@Pc(107) int local107;
				@Pc(63) int local63;
				@Pc(70) int local70;
				@Pc(80) int local80;
				if ((local43 & local47) == 0) {
					for (local63 = local31 - 1; local63 >= 1; local63--) {
						local70 = local13[local63];
						if (local70 != local47) {
							break;
						}
						local80 = 0x1 << 32 - local63;
						if ((local80 & local70) != 0) {
							local13[local63] = local13[local63 - 1];
							break;
						}
						local13[local63] = local80 | local70;
					}
					local107 = local43 | local47;
				} else {
					local107 = local13[local31 - 1];
				}
				local13[local31] = local107;
				for (local63 = local31 + 1; local63 <= 32; local63++) {
					if (local13[local63] == local47) {
						local13[local63] = local107;
					}
				}
				local63 = 0;
				for (local70 = 0; local70 < local31; local70++) {
					local80 = Integer.MIN_VALUE >>> local70;
					if ((local80 & local47) == 0) {
						local63++;
					} else {
						if (this.anIntArray186[local63] == 0) {
							this.anIntArray186[local63] = local18;
						}
						local63 = this.anIntArray186[local63];
					}
					if (this.anIntArray186.length <= local63) {
						@Pc(195) int[] local195 = new int[this.anIntArray186.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray186.length; local197++) {
							local195[local197] = this.anIntArray186[local197];
						}
						this.anIntArray186 = local195;
					}
				}
				this.anIntArray186[local63] = ~local24;
				if (local63 >= local18) {
					local18 = local63 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([B[BIIBI)I")
	public int method1825(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4;
		@Pc(12) int local12 = 0;
		@Pc(20) int local20 = arg3 << 3;
		while (local5 > arg2) {
			@Pc(29) int local29 = arg0[arg2] & 0xFF;
			@Pc(34) byte local34 = this.aByteArray24[local29];
			@Pc(39) int local39 = this.anIntArray187[local29];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(58) int local58 = local20 & 0x7;
			@Pc(62) int local62 = local20 >> 3;
			local12 &= -local58 >> 31;
			local20 += local34;
			@Pc(84) int local84 = local62 + (local34 + local58 - 1 >> 3);
			@Pc(85) int local85 = local58 + 24;
			arg1[local62] = (byte) (local12 |= local39 >>> local85);
			if (local62 < local84) {
				local62++;
				local58 = local85 - 8;
				arg1[local62] = (byte) (local12 = local39 >>> local58);
				if (local84 > local62) {
					local58 -= 8;
					local62++;
					arg1[local62] = (byte) (local12 = local39 >>> local58);
					if (local84 > local62) {
						local58 -= 8;
						local62++;
						arg1[local62] = (byte) (local12 = local39 >>> local58);
						if (local62 < local84) {
							local62++;
							local58 -= 8;
							arg1[local62] = (byte) (local12 = local39 << -local58);
						}
					}
				}
			}
			arg2++;
		}
		return (local20 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([B[BIBII)I")
	public int method1828(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg0[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(44) int local44;
			if ((local44 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local44;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local81;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local124;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local165;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(204) int local204;
			if ((local204 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local204;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(240) int local240;
			if ((local240 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local240;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(280) int local280;
			if ((local280 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local280;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray186[local18]) < 0) {
				arg1[arg2++] = (byte) ~local315;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class32 {

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
	private final int[] anIntArray187;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
	public Class32(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length;
		this.anIntArray188 = new int[8];
		this.anIntArray187 = new int[local8];
		@Pc(19) int[] local19 = new int[33];
		this.aByteArray21 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local19[local30];
				this.anIntArray187[local24] = local46;
				@Pc(112) int local112;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(80) int local80;
				if ((local42 & local46) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local19[local62];
						if (local46 != local68) {
							break;
						}
						local80 = 0x1 << 32 - local62;
						if ((local68 & local80) != 0) {
							local19[local62] = local19[local62 - 1];
							break;
						}
						local19[local62] = local80 | local68;
					}
					local112 = local46 | local42;
				} else {
					local112 = local19[local30 - 1];
				}
				local19[local30] = local112;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local46 == local19[local62]) {
						local19[local62] = local112;
					}
				}
				local68 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local80;
					if ((local155 & local46) == 0) {
						local68++;
					} else {
						if (this.anIntArray188[local68] == 0) {
							this.anIntArray188[local68] = local5;
						}
						local68 = this.anIntArray188[local68];
					}
					if (this.anIntArray188.length <= local68) {
						@Pc(196) int[] local196 = new int[this.anIntArray188.length * 2];
						for (@Pc(198) int local198 = 0; local198 < this.anIntArray188.length; local198++) {
							local196[local198] = this.anIntArray188[local198];
						}
						this.anIntArray188 = local196;
					}
				}
				if (local68 >= local5) {
					local5 = local68 + 1;
				}
				this.anIntArray188[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BII[BI)I")
	public int method855(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = 0;
		@Pc(18) int local18 = arg3 << 3;
		while (arg0 < local7) {
			@Pc(25) int local25 = arg4[arg0] & 0xFF;
			@Pc(30) int local30 = this.anIntArray187[local25];
			@Pc(35) byte local35 = this.aByteArray21[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(52) int local52 = local18 >> 3;
			@Pc(56) int local56 = local18 & 0x7;
			@Pc(68) int local68 = local52 + (local56 + local35 - 1 >> 3);
			local18 += local35;
			local9 &= -local56 >> 31;
			@Pc(80) int local80 = local56 + 24;
			arg1[local52] = (byte) (local9 |= local30 >>> local80);
			if (local52 < local68) {
				local52++;
				local56 = local80 - 8;
				arg1[local52] = (byte) (local9 = local30 >>> local56);
				if (local52 < local68) {
					local52++;
					local56 -= 8;
					arg1[local52] = (byte) (local9 = local30 >>> local56);
					if (local52 < local68) {
						local52++;
						local56 -= 8;
						arg1[local52] = (byte) (local9 = local30 >>> local56);
						if (local52 < local68) {
							local52++;
							local56 -= 8;
							arg1[local52] = (byte) (local9 = local30 << -local56);
						}
					}
				}
			}
			arg0++;
		}
		return (local18 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BIIB[B)I")
	public int method858(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(23) int local23 = arg3;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg0;
		while (true) {
			@Pc(31) byte local31 = arg1[local27];
			if (local31 >= 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local49;
				if (arg2 >= local23) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x40) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local90;
				if (local23 <= arg2) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x20) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local124;
				if (local23 <= arg2) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x10) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local165;
				if (local23 <= arg2) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x8) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local199;
				if (local23 <= arg2) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x4) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(237) int local237;
			if ((local237 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local237;
				if (arg2 >= local23) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x2) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(274) int local274;
			if ((local274 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local274;
				if (arg2 >= local23) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x1) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray188[local25];
			}
			@Pc(311) int local311;
			if ((local311 = this.anIntArray188[local25]) < 0) {
				arg4[arg2++] = (byte) ~local311;
				if (arg2 >= local23) {
					break;
				}
				local25 = 0;
			}
			local27++;
		}
		return local27 + 1 - arg0;
	}
}

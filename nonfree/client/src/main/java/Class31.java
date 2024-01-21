import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class31 {

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[I")
	private final int[] anIntArray118;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
	public Class31(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray118 = new int[local6];
		this.anIntArray119 = new int[8];
		@Pc(16) int local16 = 0;
		this.aByteArray4 = arg0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local22[local30];
				this.anIntArray118[local24] = local46;
				@Pc(113) int local113;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(81) int local81;
				if ((local42 & local46) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local22[local59];
						if (local65 != local46) {
							break;
						}
						local81 = 0x1 << 32 - local59;
						if ((local65 & local81) != 0) {
							local22[local59] = local22[local59 - 1];
							break;
						}
						local22[local59] = local81 | local65;
					}
					local113 = local42 | local46;
				} else {
					local113 = local22[local30 - 1];
				}
				local22[local30] = local113;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local46 == local22[local59]) {
						local22[local59] = local113;
					}
				}
				local65 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(160) int local160 = Integer.MIN_VALUE >>> local81;
					if ((local160 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray119[local65] == 0) {
							this.anIntArray119[local65] = local16;
						}
						local65 = this.anIntArray119[local65];
					}
					if (local65 >= this.anIntArray119.length) {
						@Pc(201) int[] local201 = new int[this.anIntArray119.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray119.length; local203++) {
							local201[local203] = this.anIntArray119[local203];
						}
						this.anIntArray119 = local201;
					}
				}
				this.anIntArray119[local65] = ~local24;
				if (local65 >= local16) {
					local16 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[BI[BI)I")
	public int method644(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(21) int local21 = arg2 << 3;
		@Pc(25) int local25 = arg4;
		@Pc(27) int local27 = 0;
		while (arg0 < local25) {
			@Pc(35) int local35 = arg1[arg0] & 0xFF;
			@Pc(40) int local40 = this.anIntArray118[local35];
			@Pc(45) byte local45 = this.aByteArray4[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(62) int local62 = local21 >> 3;
			@Pc(66) int local66 = local21 & 0x7;
			local21 += local45;
			@Pc(80) int local80 = (local66 + local45 - 1 >> 3) + local62;
			local27 &= -local66 >> 31;
			@Pc(88) int local88 = local66 + 24;
			arg3[local62] = (byte) (local27 |= local40 >>> local88);
			if (local80 > local62) {
				local62++;
				local66 = local88 - 8;
				arg3[local62] = (byte) (local27 = local40 >>> local66);
				if (local62 < local80) {
					local62++;
					local66 -= 8;
					arg3[local62] = (byte) (local27 = local40 >>> local66);
					if (local80 > local62) {
						local66 -= 8;
						local62++;
						arg3[local62] = (byte) (local27 = local40 >>> local66);
						if (local62 < local80) {
							local66 -= 8;
							local62++;
							arg3[local62] = (byte) (local27 = local40 << -local66);
						}
					}
				}
			}
			arg0++;
		}
		return (local21 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII[BI)I")
	public int method646(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local45;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local87;
				if (arg0 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local123;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local155;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local193;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local225;
				if (arg0 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local264;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray119[local23];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray119[local23]) < 0) {
				arg1[arg0++] = (byte) ~local303;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class67 {

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
	private final int[] anIntArray349;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B)V")
	public Class67(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray21 = arg0;
		this.anIntArray349 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray348 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray349[local24] = local46;
				@Pc(113) int local113;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(81) int local81;
				if ((local42 & local46) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local16[local59];
						if (local46 != local65) {
							break;
						}
						local81 = 0x1 << 32 - local59;
						if ((local65 & local81) != 0) {
							local16[local59] = local16[local59 - 1];
							break;
						}
						local16[local59] = local65 | local81;
					}
					local113 = local46 | local42;
				} else {
					local113 = local16[local30 - 1];
				}
				local16[local30] = local113;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local46 == local16[local59]) {
						local16[local59] = local113;
					}
				}
				local65 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local81;
					if ((local154 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray348[local65] == 0) {
							this.anIntArray348[local65] = local22;
						}
						local65 = this.anIntArray348[local65];
					}
					if (this.anIntArray348.length <= local65) {
						@Pc(188) int[] local188 = new int[this.anIntArray348.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray348.length; local190++) {
							local188[local190] = this.anIntArray348[local190];
						}
						this.anIntArray348 = local188;
					}
				}
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
				this.anIntArray348[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BII[BII)I")
	public int method1800(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg1;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(21) byte local21 = arg0[local17];
			if (local21 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local37;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local76;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local115;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local157;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(196) int local196;
			if ((local196 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local196;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(235) int local235;
			if ((local235 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local235;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local270;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray348[local15];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray348[local15]) < 0) {
				arg3[arg2++] = (byte) ~local302;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII[B[B)I")
	public int method1803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 << 3;
		while (arg0 < local9) {
			@Pc(23) int local23 = arg3[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray349[local23];
			@Pc(33) byte local33 = this.aByteArray21[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 >> 3;
			@Pc(57) int local57 = local15 & 0x7;
			local15 += local33;
			local11 &= -local57 >> 31;
			@Pc(79) int local79 = local53 + (local33 + local57 - 1 >> 3);
			@Pc(80) int local80 = local57 + 24;
			arg4[local53] = (byte) (local11 |= local28 >>> local80);
			if (local53 < local79) {
				local53++;
				local57 = local80 - 8;
				arg4[local53] = (byte) (local11 = local28 >>> local57);
				if (local79 > local53) {
					local57 -= 8;
					local53++;
					arg4[local53] = (byte) (local11 = local28 >>> local57);
					if (local53 < local79) {
						local53++;
						local57 -= 8;
						arg4[local53] = (byte) (local11 = local28 >>> local57);
						if (local53 < local79) {
							local57 -= 8;
							local53++;
							arg4[local53] = (byte) (local11 = local28 << -local57);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class71 {

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "[I")
	private final int[] anIntArray377;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
	public Class71(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray377 = new int[local6];
		@Pc(13) int[] local13 = new int[33];
		this.anIntArray376 = new int[8];
		@Pc(19) int local19 = 0;
		this.aByteArray47 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local13[local30];
				this.anIntArray377[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(83) int local83;
				if ((local42 & local46) == 0) {
					local59 = local42 | local46;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local13[local63];
						if (local69 != local46) {
							break;
						}
						local83 = 0x1 << 32 - local63;
						if ((local83 & local69) != 0) {
							local13[local63] = local13[local63 - 1];
							break;
						}
						local13[local63] = local69 | local83;
					}
				} else {
					local59 = local13[local30 - 1];
				}
				local13[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local13[local63] == local46) {
						local13[local63] = local59;
					}
				}
				local69 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local83;
					if ((local155 & local46) == 0) {
						local69++;
					} else {
						if (this.anIntArray376[local69] == 0) {
							this.anIntArray376[local69] = local19;
						}
						local69 = this.anIntArray376[local69];
					}
					if (local69 >= this.anIntArray376.length) {
						@Pc(189) int[] local189 = new int[this.anIntArray376.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray376.length; local191++) {
							local189[local191] = this.anIntArray376[local191];
						}
						this.anIntArray376 = local189;
					}
				}
				if (local19 <= local69) {
					local19 = local69 + 1;
				}
				this.anIntArray376[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIII[BI)I")
	public int method3045(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg4;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 < 0) {
				local23 = this.anIntArray376[local23];
			} else {
				local23++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local45;
				if (local21 <= arg1) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local84;
				if (arg1 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local123;
				if (arg1 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local161;
				if (arg1 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local193;
				if (local21 <= arg1) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local232;
				if (local21 <= arg1) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local267;
				if (local21 <= arg1) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray376[local23];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray376[local23]) < 0) {
				arg3[arg1++] = (byte) ~local303;
				if (arg1 >= local21) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIIBI[B)I")
	public int method3047(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(21) int local21 = arg3;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg2 << 3;
		while (arg1 < local21) {
			@Pc(35) int local35 = arg4[arg1] & 0xFF;
			@Pc(40) int local40 = this.anIntArray377[local35];
			@Pc(45) byte local45 = this.aByteArray47[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(65) int local65 = local27 >> 3;
			@Pc(69) int local69 = local27 & 0x7;
			local27 += local45;
			@Pc(84) int local84 = local65 + (local45 + local69 - 1 >> 3);
			local23 &= -local69 >> 31;
			@Pc(92) int local92 = local69 + 24;
			arg0[local65] = (byte) (local23 |= local40 >>> local92);
			if (local84 > local65) {
				local69 = local92 - 8;
				local65++;
				arg0[local65] = (byte) (local23 = local40 >>> local69);
				if (local65 < local84) {
					local65++;
					local69 -= 8;
					arg0[local65] = (byte) (local23 = local40 >>> local69);
					if (local84 > local65) {
						local69 -= 8;
						local65++;
						arg0[local65] = (byte) (local23 = local40 >>> local69);
						if (local84 > local65) {
							local65++;
							local69 -= 8;
							arg0[local65] = (byte) (local23 = local40 << -local69);
						}
					}
				}
			}
			arg1++;
		}
		return (local27 + 7 >> 3) - arg2;
	}
}

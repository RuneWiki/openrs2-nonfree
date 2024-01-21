import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class70 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
	private final int[] anIntArray390;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
	public Class70(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = arg0.length;
		this.aByteArray38 = arg0;
		this.anIntArray390 = new int[local11];
		this.anIntArray391 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local6[local30];
				this.anIntArray390[local24] = local42;
				@Pc(57) int local57;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(81) int local81;
				if ((local42 & local38) == 0) {
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local6[local63];
						if (local42 != local69) {
							break;
						}
						local81 = 0x1 << 32 - local63;
						if ((local81 & local69) != 0) {
							local6[local63] = local6[local63 - 1];
							break;
						}
						local6[local63] = local69 | local81;
					}
					local57 = local42 | local38;
				} else {
					local57 = local6[local30 - 1];
				}
				local6[local30] = local57;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local42 == local6[local63]) {
						local6[local63] = local57;
					}
				}
				local69 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local81;
					if ((local155 & local42) == 0) {
						local69++;
					} else {
						if (this.anIntArray391[local69] == 0) {
							this.anIntArray391[local69] = local8;
						}
						local69 = this.anIntArray391[local69];
					}
					if (this.anIntArray391.length <= local69) {
						@Pc(200) int[] local200 = new int[this.anIntArray391.length * 2];
						for (@Pc(202) int local202 = 0; local202 < this.anIntArray391.length; local202++) {
							local200[local202] = this.anIntArray391[local202];
						}
						this.anIntArray391 = local200;
					}
				}
				this.anIntArray391[local69] = ~local24;
				if (local69 >= local8) {
					local8 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BII[BB)I")
	public int method2616(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(19) int local19 = arg0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg2;
		while (true) {
			@Pc(27) byte local27 = arg1[local23];
			if (local27 < 0) {
				local21 = this.anIntArray391[local21];
			} else {
				local21++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local45;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local79;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local113;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local148;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local179;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(210) int local210;
			if ((local210 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local210;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(248) int local248;
			if ((local248 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local248;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray391[local21];
			}
			@Pc(283) int local283;
			if ((local283 = this.anIntArray391[local21]) < 0) {
				arg4[arg3++] = (byte) ~local283;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg2;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[B[BIII)I")
	public int method2617(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg0;
		@Pc(7) int local7 = arg3 << 3;
		@Pc(13) int local13 = 0;
		while (local3 > arg4) {
			@Pc(24) int local24 = arg1[arg4] & 0xFF;
			@Pc(29) int local29 = this.anIntArray390[local24];
			@Pc(34) byte local34 = this.aByteArray38[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local7 >> 3;
			@Pc(58) int local58 = local7 & 0x7;
			local7 += local34;
			local13 &= -local58 >> 31;
			@Pc(79) int local79 = (local34 + local58 - 1 >> 3) + local54;
			@Pc(80) int local80 = local58 + 24;
			arg2[local54] = (byte) (local13 |= local29 >>> local80);
			if (local54 < local79) {
				local58 = local80 - 8;
				local54++;
				arg2[local54] = (byte) (local13 = local29 >>> local58);
				if (local79 > local54) {
					local58 -= 8;
					local54++;
					arg2[local54] = (byte) (local13 = local29 >>> local58);
					if (local79 > local54) {
						local54++;
						local58 -= 8;
						arg2[local54] = (byte) (local13 = local29 >>> local58);
						if (local79 > local54) {
							local54++;
							local58 -= 8;
							arg2[local54] = (byte) (local13 = local29 << -local58);
						}
					}
				}
			}
			arg4++;
		}
		return (local7 + 7 >> 3) - arg3;
	}
}

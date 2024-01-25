import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class302 {

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "[B")
	private final byte[] aByteArray121;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
	private final int[] anIntArray674;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	private int[] anIntArray675;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
	public Class302(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray121 = arg0;
		this.anIntArray674 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray675 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray674[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(88) int local88;
				if ((local46 & local42) == 0) {
					local62 = local46 | local42;
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local16[local66];
						if (local72 != local46) {
							break;
						}
						local88 = 0x1 << 32 - local66;
						if ((local88 & local72) != 0) {
							local16[local66] = local16[local66 - 1];
							break;
						}
						local16[local66] = local88 | local72;
					}
				} else {
					local62 = local16[local30 - 1];
				}
				local16[local30] = local62;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local46 == local16[local66]) {
						local16[local66] = local62;
					}
				}
				local72 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(161) int local161 = Integer.MIN_VALUE >>> local88;
					if ((local46 & local161) == 0) {
						local72++;
					} else {
						if (this.anIntArray675[local72] == 0) {
							this.anIntArray675[local72] = local22;
						}
						local72 = this.anIntArray675[local72];
					}
					if (this.anIntArray675.length <= local72) {
						@Pc(198) int[] local198 = new int[this.anIntArray675.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray675.length; local200++) {
							local198[local200] = this.anIntArray675[local200];
						}
						this.anIntArray675 = local198;
					}
				}
				if (local72 >= local22) {
					local22 = local72 + 1;
				}
				this.anIntArray675[local72] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI[B[BII)I")
	public int method7108(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(19) int local19 = arg0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg4;
		while (true) {
			@Pc(27) byte local27 = arg1[local23];
			if (local27 < 0) {
				local21 = this.anIntArray675[local21];
			} else {
				local21++;
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local43;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local78;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local114;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local149;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(181) int local181;
			if ((local181 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local181;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(223) int local223;
			if ((local223 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local223;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local258;
				if (arg3 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray675[local21];
			}
			@Pc(297) int local297;
			if ((local297 = this.anIntArray675[local21]) < 0) {
				arg2[arg3++] = (byte) ~local297;
				if (local19 <= arg3) {
					break;
				}
				local21 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg4;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII[B[B)I")
	public int method7109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg2 << 3;
		@Pc(13) int local13 = arg1;
		while (local13 > arg0) {
			@Pc(24) int local24 = arg3[arg0] & 0xFF;
			@Pc(29) int local29 = this.anIntArray674[local24];
			@Pc(34) byte local34 = this.aByteArray121[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local9 >> 3;
			@Pc(58) int local58 = local9 & 0x7;
			local5 &= -local58 >> 31;
			@Pc(75) int local75 = (local58 + local34 - 1 >> 3) + local54;
			local9 += local34;
			@Pc(80) int local80 = local58 + 24;
			arg4[local54] = (byte) (local5 |= local29 >>> local80);
			if (local75 > local54) {
				local58 = local80 - 8;
				local54++;
				arg4[local54] = (byte) (local5 = local29 >>> local58);
				if (local75 > local54) {
					local54++;
					local58 -= 8;
					arg4[local54] = (byte) (local5 = local29 >>> local58);
					if (local75 > local54) {
						local54++;
						local58 -= 8;
						arg4[local54] = (byte) (local5 = local29 >>> local58);
						if (local75 > local54) {
							local54++;
							local58 -= 8;
							arg4[local54] = (byte) (local5 = local29 << -local58);
						}
					}
				}
			}
			arg0++;
		}
		return (local9 + 7 >> 3) - arg2;
	}
}

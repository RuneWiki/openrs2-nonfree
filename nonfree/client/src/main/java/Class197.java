import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class197 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
	private final int[] anIntArray476;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
	public Class197(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray87 = arg0;
		this.anIntArray476 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray475 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray476[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(84) int local84;
				if ((local39 & local43) == 0) {
					local58 = local39 | local43;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local16[local68];
						if (local43 != local74) {
							break;
						}
						local84 = 0x1 << 32 - local68;
						if ((local74 & local84) != 0) {
							local16[local68] = local16[local68 - 1];
							break;
						}
						local16[local68] = local84 | local74;
					}
				} else {
					local58 = local16[local30 - 1];
				}
				local16[local30] = local58;
				for (local68 = local30 + 1; local68 <= 32; local68++) {
					if (local43 == local16[local68]) {
						local16[local68] = local58;
					}
				}
				local74 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local84;
					if ((local146 & local43) == 0) {
						local74++;
					} else {
						if (this.anIntArray475[local74] == 0) {
							this.anIntArray475[local74] = local22;
						}
						local74 = this.anIntArray475[local74];
					}
					if (this.anIntArray475.length <= local74) {
						@Pc(190) int[] local190 = new int[this.anIntArray475.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray475.length; local192++) {
							local190[local192] = this.anIntArray475[local192];
						}
						this.anIntArray475 = local190;
					}
				}
				this.anIntArray475[local74] = ~local24;
				if (local22 <= local74) {
					local22 = local74 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([BIII[BI)I")
	public int method5616(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local45;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local77;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local116;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local155;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(190) int local190;
			if ((local190 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local190;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local232;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local271;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray475[local23];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray475[local23]) < 0) {
				arg0[arg3++] = (byte) ~local306;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[BI[BI)I")
	public int method5617(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2;
		@Pc(15) int local15 = arg0 << 3;
		while (local11 > arg4) {
			@Pc(23) int local23 = arg3[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray476[local23];
			@Pc(33) byte local33 = this.aByteArray87[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local33 - 1 >> 3);
			local15 += local33;
			@Pc(77) int local77 = local54 + 24;
			arg1[local50] = (byte) (local7 |= local28 >>> local77);
			if (local50 < local72) {
				local50++;
				local54 = local77 - 8;
				arg1[local50] = (byte) (local7 = local28 >>> local54);
				if (local72 > local50) {
					local54 -= 8;
					local50++;
					arg1[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local72) {
						local50++;
						local54 -= 8;
						arg1[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local72) {
							local50++;
							local54 -= 8;
							arg1[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}

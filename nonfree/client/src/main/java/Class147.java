import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class147 {

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "[B")
	private final byte[] aByteArray60;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[I")
	private final int[] anIntArray361;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([B)V")
	public Class147(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray60 = arg0;
		this.anIntArray361 = new int[local6];
		this.anIntArray362 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray361[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(86) int local86;
				if ((local42 & local46) == 0) {
					local62 = local46 | local42;
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local20[local66];
						if (local72 != local46) {
							break;
						}
						local86 = 0x1 << 32 - local66;
						if ((local72 & local86) != 0) {
							local20[local66] = local20[local66 - 1];
							break;
						}
						local20[local66] = local86 | local72;
					}
				} else {
					local62 = local20[local30 - 1];
				}
				local20[local30] = local62;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local46 == local20[local66]) {
						local20[local66] = local62;
					}
				}
				local72 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(160) int local160 = Integer.MIN_VALUE >>> local86;
					if ((local160 & local46) == 0) {
						local72++;
					} else {
						if (this.anIntArray362[local72] == 0) {
							this.anIntArray362[local72] = local22;
						}
						local72 = this.anIntArray362[local72];
					}
					if (local72 >= this.anIntArray362.length) {
						@Pc(198) int[] local198 = new int[this.anIntArray362.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray362.length; local200++) {
							local198[local200] = this.anIntArray362[local200];
						}
						this.anIntArray362 = local198;
					}
				}
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
				this.anIntArray362[local72] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([B[BIIII)I")
	public int method3890(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3;
		@Pc(15) int local15 = arg2 << 3;
		while (local11 > arg4) {
			@Pc(23) int local23 = arg0[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray361[local23];
			@Pc(33) byte local33 = this.aByteArray60[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = local50 + (local54 + local33 - 1 >> 3);
			@Pc(72) int local72 = local54 + 24;
			arg1[local50] = (byte) (local7 |= local28 >>> local72);
			if (local50 < local71) {
				local54 = local72 - 8;
				local50++;
				arg1[local50] = (byte) (local7 = local28 >>> local54);
				if (local50 < local71) {
					local50++;
					local54 -= 8;
					arg1[local50] = (byte) (local7 = local28 >>> local54);
					if (local71 > local50) {
						local54 -= 8;
						local50++;
						arg1[local50] = (byte) (local7 = local28 >>> local54);
						if (local71 > local50) {
							local50++;
							local54 -= 8;
							arg1[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			local15 += local33;
			arg4++;
		}
		return (local15 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI[BIII)I")
	public int method3892(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg4;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		while (true) {
			@Pc(21) byte local21 = arg0[local17];
			if (local21 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local40;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local76;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local115;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(147) int local147;
			if ((local147 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local147;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(185) int local185;
			if ((local185 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local185;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(224) int local224;
			if ((local224 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local224;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local259;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray362[local15];
			}
			@Pc(294) int local294;
			if ((local294 = this.anIntArray362[local15]) < 0) {
				arg2[arg3++] = (byte) ~local294;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg1;
	}
}

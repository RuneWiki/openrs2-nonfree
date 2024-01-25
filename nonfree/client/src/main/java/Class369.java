import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class369 {

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "[I")
	private final int[] anIntArray705;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "[B")
	private final byte[] aByteArray137;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "[I")
	private int[] anIntArray706;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "([B)V")
	public Class369(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray705 = new int[local6];
		this.aByteArray137 = arg0;
		this.anIntArray706 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray705[local24] = local42;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(84) int local84;
				if ((local38 & local42) == 0) {
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local20[local66];
						if (local72 != local42) {
							break;
						}
						local84 = 0x1 << 32 - local66;
						if ((local72 & local84) != 0) {
							local20[local66] = local20[local66 - 1];
							break;
						}
						local20[local66] = local72 | local84;
					}
					local60 = local38 | local42;
				} else {
					local60 = local20[local30 - 1];
				}
				local20[local30] = local60;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local20[local66] == local42) {
						local20[local66] = local60;
					}
				}
				local72 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local84;
					if ((local42 & local154) == 0) {
						local72++;
					} else {
						if (this.anIntArray706[local72] == 0) {
							this.anIntArray706[local72] = local22;
						}
						local72 = this.anIntArray706[local72];
					}
					if (local72 >= this.anIntArray706.length) {
						@Pc(196) int[] local196 = new int[this.anIntArray706.length * 2];
						for (@Pc(198) int local198 = 0; local198 < this.anIntArray706.length; local198++) {
							local196[local198] = this.anIntArray706[local198];
						}
						this.anIntArray706 = local196;
					}
				}
				this.anIntArray706[local72] = ~local24;
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([BI[BIII)I")
	public int method9061(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg1;
		while (true) {
			@Pc(27) byte local27 = arg2[local23];
			if (local27 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local46;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(88) int local88;
			if ((local88 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local88;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local126;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local161;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local203;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local238;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local270;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray706[local15];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray706[local15]) < 0) {
				arg0[arg4++] = (byte) ~local306;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(III[BI[B)I")
	public int method9062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg2 << 3;
		while (arg1 < local11) {
			@Pc(35) int local35 = arg3[arg1] & 0xFF;
			@Pc(40) int local40 = this.anIntArray705[local35];
			@Pc(45) byte local45 = this.aByteArray137[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(62) int local62 = local15 >> 3;
			@Pc(66) int local66 = local15 & 0x7;
			local7 &= -local66 >> 31;
			@Pc(84) int local84 = (local66 + local45 - 1 >> 3) + local62;
			local15 += local45;
			@Pc(89) int local89 = local66 + 24;
			arg4[local62] = (byte) (local7 |= local40 >>> local89);
			if (local62 < local84) {
				local62++;
				local66 = local89 - 8;
				arg4[local62] = (byte) (local7 = local40 >>> local66);
				if (local84 > local62) {
					local62++;
					local66 -= 8;
					arg4[local62] = (byte) (local7 = local40 >>> local66);
					if (local84 > local62) {
						local66 -= 8;
						local62++;
						arg4[local62] = (byte) (local7 = local40 >>> local66);
						if (local62 < local84) {
							local66 -= 8;
							local62++;
							arg4[local62] = (byte) (local7 = local40 << -local66);
						}
					}
				}
			}
			arg1++;
		}
		return (local15 + 7 >> 3) - arg2;
	}
}

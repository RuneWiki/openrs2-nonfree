import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class101 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	private final int[] anIntArray378;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
	public Class101(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray30 = arg0;
		this.anIntArray378 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray377 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local16[local30];
				this.anIntArray378[local24] = local42;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(86) int local86;
				if ((local42 & local38) == 0) {
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local16[local66];
						if (local72 != local42) {
							break;
						}
						local86 = 0x1 << 32 - local66;
						if ((local72 & local86) != 0) {
							local16[local66] = local16[local66 - 1];
							break;
						}
						local16[local66] = local72 | local86;
					}
					local60 = local42 | local38;
				} else {
					local60 = local16[local30 - 1];
				}
				local16[local30] = local60;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local16[local66] == local42) {
						local16[local66] = local60;
					}
				}
				local72 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local86;
					if ((local153 & local42) == 0) {
						local72++;
					} else {
						if (this.anIntArray377[local72] == 0) {
							this.anIntArray377[local72] = local22;
						}
						local72 = this.anIntArray377[local72];
					}
					if (local72 >= this.anIntArray377.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray377.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray377.length; local192++) {
							local190[local192] = this.anIntArray377[local192];
						}
						this.anIntArray377 = local190;
					}
				}
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
				this.anIntArray377[local72] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([BI[BIII)I")
	public int method2645(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4;
		@Pc(18) int local18 = arg3 << 3;
		while (arg1 < local14) {
			@Pc(25) int local25 = arg0[arg1] & 0xFF;
			@Pc(30) int local30 = this.anIntArray378[local25];
			@Pc(35) byte local35 = this.aByteArray30[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(55) int local55 = local18 >> 3;
			@Pc(59) int local59 = local18 & 0x7;
			local10 &= -local59 >> 31;
			@Pc(76) int local76 = (local35 + local59 - 1 >> 3) + local55;
			local18 += local35;
			@Pc(81) int local81 = local59 + 24;
			arg2[local55] = (byte) (local10 |= local30 >>> local81);
			if (local76 > local55) {
				local59 = local81 - 8;
				local55++;
				arg2[local55] = (byte) (local10 = local30 >>> local59);
				if (local55 < local76) {
					local59 -= 8;
					local55++;
					arg2[local55] = (byte) (local10 = local30 >>> local59);
					if (local76 > local55) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local10 = local30 >>> local59);
						if (local76 > local55) {
							local55++;
							local59 -= 8;
							arg2[local55] = (byte) (local10 = local30 << -local59);
						}
					}
				}
			}
			arg1++;
		}
		return (local18 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([B[BIIII)I")
	public int method2646(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 < 0) {
				local9 = this.anIntArray377[local9];
			} else {
				local9++;
			}
			@Pc(39) int local39;
			if ((local39 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local39;
				if (local13 <= arg4) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(73) int local73;
			if ((local73 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local73;
				if (arg4 >= local13) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local114;
				if (local13 <= arg4) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(145) int local145;
			if ((local145 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local145;
				if (local13 <= arg4) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local179;
				if (arg4 >= local13) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(213) int local213;
			if ((local213 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local213;
				if (arg4 >= local13) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(250) int local250;
			if ((local250 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local250;
				if (arg4 >= local13) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray377[local9];
			}
			@Pc(285) int local285;
			if ((local285 = this.anIntArray377[local9]) < 0) {
				arg0[arg4++] = (byte) ~local285;
				if (local13 <= arg4) {
					break;
				}
				local9 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}

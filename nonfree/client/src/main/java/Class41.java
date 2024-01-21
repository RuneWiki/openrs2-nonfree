import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class41 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	private final int[] anIntArray294;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class41(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray293 = new int[8];
		@Pc(12) int local12 = 0;
		this.aByteArray13 = arg0;
		this.anIntArray294 = new int[local6];
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local22[local30];
				this.anIntArray294[local24] = local42;
				@Pc(60) int local60;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(86) int local86;
				if ((local42 & local38) == 0) {
					local60 = local42 | local38;
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local22[local70];
						if (local76 != local42) {
							break;
						}
						local86 = 0x1 << 32 - local70;
						if ((local86 & local76) != 0) {
							local22[local70] = local22[local70 - 1];
							break;
						}
						local22[local70] = local76 | local86;
					}
				} else {
					local60 = local22[local30 - 1];
				}
				local22[local30] = local60;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local42 == local22[local70]) {
						local22[local70] = local60;
					}
				}
				local76 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local86;
					if ((local149 & local42) == 0) {
						local76++;
					} else {
						if (this.anIntArray293[local76] == 0) {
							this.anIntArray293[local76] = local12;
						}
						local76 = this.anIntArray293[local76];
					}
					if (local76 >= this.anIntArray293.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray293.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray293.length; local192++) {
							local190[local192] = this.anIntArray293[local192];
						}
						this.anIntArray293 = local190;
					}
				}
				this.anIntArray293[local76] = ~local24;
				if (local76 >= local12) {
					local12 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI[B[BII)I")
	public int method1193(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local40;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local79;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local114;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local149;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(188) int local188;
			if ((local188 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local188;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(223) int local223;
			if ((local223 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local223;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(262) int local262;
			if ((local262 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local262;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray293[local18];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray293[local18]) < 0) {
				arg2[arg0++] = (byte) ~local304;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII[B[B)I")
	public int method1195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg1 << 3;
		while (local7 > arg0) {
			@Pc(24) int local24 = arg3[arg0] & 0xFF;
			@Pc(29) int local29 = this.anIntArray294[local24];
			@Pc(34) byte local34 = this.aByteArray13[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(51) int local51 = local13 >> 3;
			@Pc(55) int local55 = local13 & 0x7;
			@Pc(65) int local65 = (local55 + local34 - 1 >> 3) + local51;
			local13 += local34;
			local9 &= -local55 >> 31;
			@Pc(77) int local77 = local55 + 24;
			arg4[local51] = (byte) (local9 |= local29 >>> local77);
			if (local51 < local65) {
				local55 = local77 - 8;
				local51++;
				arg4[local51] = (byte) (local9 = local29 >>> local55);
				if (local51 < local65) {
					local51++;
					local55 -= 8;
					arg4[local51] = (byte) (local9 = local29 >>> local55);
					if (local51 < local65) {
						local55 -= 8;
						local51++;
						arg4[local51] = (byte) (local9 = local29 >>> local55);
						if (local65 > local51) {
							local51++;
							local55 -= 8;
							arg4[local51] = (byte) (local9 = local29 << -local55);
						}
					}
				}
			}
			arg0++;
		}
		return (local13 + 7 >> 3) - arg1;
	}
}

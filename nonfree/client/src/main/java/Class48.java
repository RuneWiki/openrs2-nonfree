import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class48 {

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
	private final int[] anIntArray305;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B)V")
	public Class48(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray306 = new int[8];
		this.aByteArray29 = arg0;
		@Pc(15) int local15 = 0;
		this.anIntArray305 = new int[local6];
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local22[local30];
				this.anIntArray305[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(88) int local88;
				if ((local46 & local42) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local22[local70];
						if (local46 != local76) {
							break;
						}
						local88 = 0x1 << 32 - local70;
						if ((local88 & local76) != 0) {
							local22[local70] = local22[local70 - 1];
							break;
						}
						local22[local70] = local76 | local88;
					}
					local64 = local42 | local46;
				} else {
					local64 = local22[local30 - 1];
				}
				local22[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local46 == local22[local70]) {
						local22[local70] = local64;
					}
				}
				local76 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local88;
					if ((local153 & local46) == 0) {
						local76++;
					} else {
						if (this.anIntArray306[local76] == 0) {
							this.anIntArray306[local76] = local15;
						}
						local76 = this.anIntArray306[local76];
					}
					if (this.anIntArray306.length <= local76) {
						@Pc(190) int[] local190 = new int[this.anIntArray306.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray306.length; local192++) {
							local190[local192] = this.anIntArray306[local192];
						}
						this.anIntArray306 = local190;
					}
				}
				this.anIntArray306[local76] = ~local24;
				if (local15 <= local76) {
					local15 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[B[BZII)I")
	public int method1467(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg4 << 3;
		@Pc(20) int local20 = 0;
		while (arg0 < local10) {
			@Pc(28) int local28 = arg1[arg0] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray29[local28];
			@Pc(38) int local38 = this.anIntArray305[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local14 >> 3;
			@Pc(62) int local62 = local14 & 0x7;
			local14 += local33;
			local20 &= -local62 >> 31;
			@Pc(83) int local83 = local58 + (local33 + local62 - 1 >> 3);
			@Pc(84) int local84 = local62 + 24;
			arg2[local58] = (byte) (local20 |= local38 >>> local84);
			if (local83 > local58) {
				local58++;
				local62 = local84 - 8;
				arg2[local58] = (byte) (local20 = local38 >>> local62);
				if (local83 > local58) {
					local58++;
					local62 -= 8;
					arg2[local58] = (byte) (local20 = local38 >>> local62);
					if (local58 < local83) {
						local58++;
						local62 -= 8;
						arg2[local58] = (byte) (local20 = local38 >>> local62);
						if (local58 < local83) {
							local62 -= 8;
							local58++;
							arg2[local58] = (byte) (local20 = local38 << -local62);
						}
					}
				}
			}
			arg0++;
		}
		return (local14 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BI[BI)I")
	public int method1469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(14) int local14 = arg3;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg1;
		while (true) {
			@Pc(22) byte local22 = arg2[local18];
			if (local22 >= 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(38) int local38;
			if ((local38 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local38;
				if (arg0 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(74) int local74;
			if ((local74 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local74;
				if (local14 <= arg0) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local113;
				if (arg0 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local155;
				if (arg0 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local194;
				if (local14 <= arg0) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(233) int local233;
			if ((local233 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local233;
				if (local14 <= arg0) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(268) int local268;
			if ((local268 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local268;
				if (arg0 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray306[local16];
			}
			@Pc(310) int local310;
			if ((local310 = this.anIntArray306[local16]) < 0) {
				arg4[arg0++] = (byte) ~local310;
				if (local14 <= arg0) {
					break;
				}
				local16 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg1;
	}
}

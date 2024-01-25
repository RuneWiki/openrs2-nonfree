import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class216 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "[I")
	private final int[] anIntArray667;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
	private int[] anIntArray666;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([B)V")
	public Class216(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray83 = arg0;
		this.anIntArray667 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray666 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local16[local30];
				this.anIntArray667[local24] = local42;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(81) int local81;
				if ((local38 & local42) == 0) {
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local16[local66];
						if (local42 != local72) {
							break;
						}
						local81 = 0x1 << 32 - local66;
						if ((local72 & local81) != 0) {
							local16[local66] = local16[local66 - 1];
							break;
						}
						local16[local66] = local72 | local81;
					}
					local60 = local38 | local42;
				} else {
					local60 = local16[local30 - 1];
				}
				local16[local30] = local60;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local42 == local16[local66]) {
						local16[local66] = local60;
					}
				}
				local72 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local81;
					if ((local42 & local146) == 0) {
						local72++;
					} else {
						if (this.anIntArray666[local72] == 0) {
							this.anIntArray666[local72] = local22;
						}
						local72 = this.anIntArray666[local72];
					}
					if (this.anIntArray666.length <= local72) {
						@Pc(187) int[] local187 = new int[this.anIntArray666.length * 2];
						for (@Pc(189) int local189 = 0; local189 < this.anIntArray666.length; local189++) {
							local187[local189] = this.anIntArray666[local189];
						}
						this.anIntArray666 = local187;
					}
				}
				this.anIntArray666[local72] = ~local24;
				if (local72 >= local22) {
					local22 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([B[BIZII)I")
	public int method5775(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg4;
		@Pc(20) int local20 = arg3 << 3;
		while (arg2 < local16) {
			@Pc(28) int local28 = arg1[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray667[local28];
			@Pc(38) byte local38 = this.aByteArray83[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(79) int local79 = local58 + (local38 + local62 - 1 >> 3);
			@Pc(80) int local80 = local62 + 24;
			arg0[local58] = (byte) (local7 |= local33 >>> local80);
			if (local79 > local58) {
				local62 = local80 - 8;
				local58++;
				arg0[local58] = (byte) (local7 = local33 >>> local62);
				if (local58 < local79) {
					local58++;
					local62 -= 8;
					arg0[local58] = (byte) (local7 = local33 >>> local62);
					if (local79 > local58) {
						local58++;
						local62 -= 8;
						arg0[local58] = (byte) (local7 = local33 >>> local62);
						if (local79 > local58) {
							local62 -= 8;
							local58++;
							arg0[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			local20 += local38;
			arg2++;
		}
		return (local20 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIZ[BI)I")
	public int method5776(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(27) byte local27 = arg1[local17];
			if (local27 >= 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (local15 <= arg0) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local84;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local116;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local152;
				if (local15 <= arg0) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local194;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local232;
				if (local15 <= arg0) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(274) int local274;
			if ((local274 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local274;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray666[local11];
			}
			@Pc(310) int local310;
			if ((local310 = this.anIntArray666[local11]) < 0) {
				arg3[arg0++] = (byte) ~local310;
				if (local15 <= arg0) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}
}

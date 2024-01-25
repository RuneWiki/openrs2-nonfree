import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class198 {

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "[I")
	private final int[] anIntArray559;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "[B")
	private final byte[] aByteArray66;

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([B)V")
	public Class198(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray559 = new int[local6];
		this.aByteArray66 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray560 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray559[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(88) int local88;
				if ((local46 & local42) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local16[local70];
						if (local76 != local46) {
							break;
						}
						local88 = 0x1 << 32 - local70;
						if ((local88 & local76) != 0) {
							local16[local70] = local16[local70 - 1];
							break;
						}
						local16[local70] = local88 | local76;
					}
					local64 = local42 | local46;
				} else {
					local64 = local16[local30 - 1];
				}
				local16[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local16[local70] == local46) {
						local16[local70] = local64;
					}
				}
				local76 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local88;
					if ((local155 & local46) == 0) {
						local76++;
					} else {
						if (this.anIntArray560[local76] == 0) {
							this.anIntArray560[local76] = local22;
						}
						local76 = this.anIntArray560[local76];
					}
					if (this.anIntArray560.length <= local76) {
						@Pc(199) int[] local199 = new int[this.anIntArray560.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray560.length; local201++) {
							local199[local201] = this.anIntArray560[local201];
						}
						this.anIntArray560 = local199;
					}
				}
				this.anIntArray560[local76] = ~local24;
				if (local76 >= local22) {
					local22 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI[BIII)I")
	public int method4513(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3;
		@Pc(17) int local17 = arg2;
		while (true) {
			@Pc(21) byte local21 = arg0[local17];
			if (local21 < 0) {
				local11 = this.anIntArray560[local11];
			} else {
				local11++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local37;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(75) int local75;
			if ((local75 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local75;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local113;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local148;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local187;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local225;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local267;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray560[local11];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray560[local11]) < 0) {
				arg1[arg4++] = (byte) ~local309;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg2;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII[B[B)I")
	public int method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg1 << 3;
		@Pc(20) int local20 = arg0;
		while (arg2 < local20) {
			@Pc(28) int local28 = arg3[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray559[local28];
			@Pc(38) byte local38 = this.aByteArray66[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(76) int local76 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(77) int local77 = local59 + 24;
			arg4[local55] = (byte) (local12 |= local33 >>> local77);
			if (local76 > local55) {
				local59 = local77 - 8;
				local55++;
				arg4[local55] = (byte) (local12 = local33 >>> local59);
				if (local76 > local55) {
					local59 -= 8;
					local55++;
					arg4[local55] = (byte) (local12 = local33 >>> local59);
					if (local76 > local55) {
						local59 -= 8;
						local55++;
						arg4[local55] = (byte) (local12 = local33 >>> local59);
						if (local76 > local55) {
							local55++;
							local59 -= 8;
							arg4[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local16 += local38;
			arg2++;
		}
		return (local16 + 7 >> 3) - arg1;
	}
}

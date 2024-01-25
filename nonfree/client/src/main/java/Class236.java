import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class236 {

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
	private final int[] anIntArray398;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[B")
	private final byte[] aByteArray60;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class236(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray398 = new int[local6];
		this.aByteArray60 = arg0;
		this.anIntArray399 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray398[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(90) int local90;
				if ((local42 & local46) == 0) {
					local61 = local46 | local42;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local77 != local46) {
							break;
						}
						local90 = 0x1 << 32 - local71;
						if ((local90 & local77) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local77 | local90;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local46 == local20[local71]) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local90;
					if ((local153 & local46) == 0) {
						local77++;
					} else {
						if (this.anIntArray399[local77] == 0) {
							this.anIntArray399[local77] = local22;
						}
						local77 = this.anIntArray399[local77];
					}
					if (local77 >= this.anIntArray399.length) {
						@Pc(191) int[] local191 = new int[this.anIntArray399.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray399.length; local193++) {
							local191[local193] = this.anIntArray399[local193];
						}
						this.anIntArray399 = local191;
					}
				}
				this.anIntArray399[local77] = ~local24;
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BBI[BI)I")
	public int method5894(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(21) byte local21 = arg1[local17];
			if (local21 < 0) {
				local11 = this.anIntArray399[local11];
			} else {
				local11++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local37;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local79;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local118;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local156;
				if (local15 <= arg2) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(195) int local195;
			if ((local195 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local195;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local231;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local270;
				if (local15 <= arg2) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray399[local11];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray399[local11]) < 0) {
				arg3[arg2++] = (byte) ~local302;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BB[BI)I")
	public int method5895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg1 << 3;
		@Pc(20) int local20 = arg0;
		while (arg4 < local20) {
			@Pc(28) int local28 = arg2[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray398[local28];
			@Pc(38) byte local38 = this.aByteArray60[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(76) int local76 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(77) int local77 = local59 + 24;
			arg3[local55] = (byte) (local12 |= local33 >>> local77);
			if (local55 < local76) {
				local55++;
				local59 = local77 - 8;
				arg3[local55] = (byte) (local12 = local33 >>> local59);
				if (local76 > local55) {
					local59 -= 8;
					local55++;
					arg3[local55] = (byte) (local12 = local33 >>> local59);
					if (local76 > local55) {
						local55++;
						local59 -= 8;
						arg3[local55] = (byte) (local12 = local33 >>> local59);
						if (local55 < local76) {
							local59 -= 8;
							local55++;
							arg3[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local16 += local38;
			arg4++;
		}
		return (local16 + 7 >> 3) - arg1;
	}
}

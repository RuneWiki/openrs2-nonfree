import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class197 {

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
	private final int[] anIntArray372;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "[B")
	private final byte[] aByteArray70;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class197(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray372 = new int[local6];
		this.aByteArray70 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray370 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray372[local24] = local46;
				@Pc(110) int local110;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(78) int local78;
				if ((local46 & local42) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local16[local62];
						if (local46 != local68) {
							break;
						}
						local78 = 0x1 << 32 - local62;
						if ((local68 & local78) != 0) {
							local16[local62] = local16[local62 - 1];
							break;
						}
						local16[local62] = local68 | local78;
					}
					local110 = local46 | local42;
				} else {
					local110 = local16[local30 - 1];
				}
				local16[local30] = local110;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local46 == local16[local62]) {
						local16[local62] = local110;
					}
				}
				local68 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local78;
					if ((local46 & local157) == 0) {
						local68++;
					} else {
						if (this.anIntArray370[local68] == 0) {
							this.anIntArray370[local68] = local22;
						}
						local68 = this.anIntArray370[local68];
					}
					if (local68 >= this.anIntArray370.length) {
						@Pc(198) int[] local198 = new int[this.anIntArray370.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray370.length; local200++) {
							local198[local200] = this.anIntArray370[local200];
						}
						this.anIntArray370 = local198;
					}
				}
				this.anIntArray370[local68] = ~local24;
				if (local68 >= local22) {
					local22 = local68 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([B[BIIII)I")
	public int method4991(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 << 3;
		@Pc(18) int local18 = arg2;
		while (local18 > arg3) {
			@Pc(25) int local25 = arg0[arg3] & 0xFF;
			@Pc(30) int local30 = this.anIntArray372[local25];
			@Pc(35) byte local35 = this.aByteArray70[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(55) int local55 = local14 >> 3;
			@Pc(59) int local59 = local14 & 0x7;
			local10 &= -local59 >> 31;
			@Pc(76) int local76 = (local35 + local59 - 1 >> 3) + local55;
			local14 += local35;
			@Pc(81) int local81 = local59 + 24;
			arg1[local55] = (byte) (local10 |= local30 >>> local81);
			if (local55 < local76) {
				local59 = local81 - 8;
				local55++;
				arg1[local55] = (byte) (local10 = local30 >>> local59);
				if (local76 > local55) {
					local59 -= 8;
					local55++;
					arg1[local55] = (byte) (local10 = local30 >>> local59);
					if (local55 < local76) {
						local59 -= 8;
						local55++;
						arg1[local55] = (byte) (local10 = local30 >>> local59);
						if (local76 > local55) {
							local55++;
							local59 -= 8;
							arg1[local55] = (byte) (local10 = local30 << -local59);
						}
					}
				}
			}
			arg3++;
		}
		return (local14 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BI[BII)I")
	public int method4992(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(18) int local18 = arg0;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 < 0) {
				local9 = this.anIntArray370[local9];
			} else {
				local9++;
			}
			@Pc(39) int local39;
			if ((local39 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local39;
				if (arg4 >= local18) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(73) int local73;
			if ((local73 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local73;
				if (arg4 >= local18) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local108;
				if (arg4 >= local18) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(145) int local145;
			if ((local145 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local145;
				if (arg4 >= local18) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local179;
				if (local18 <= arg4) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(213) int local213;
			if ((local213 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local213;
				if (arg4 >= local18) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(254) int local254;
			if ((local254 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local254;
				if (local18 <= arg4) {
					break;
				}
				local9 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local9++;
			} else {
				local9 = this.anIntArray370[local9];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray370[local9]) < 0) {
				arg1[arg4++] = (byte) ~local292;
				if (local18 <= arg4) {
					break;
				}
				local9 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}

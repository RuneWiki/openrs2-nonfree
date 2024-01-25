import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class75 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
	private final int[] anIntArray94;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "([B)V")
	public Class75(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray24 = arg0;
		this.anIntArray94 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray95 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray94[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(84) int local84;
				if ((local46 & local42) == 0) {
					local59 = local46 | local42;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local16[local63];
						if (local46 != local69) {
							break;
						}
						local84 = 0x1 << 32 - local63;
						if ((local84 & local69) != 0) {
							local16[local63] = local16[local63 - 1];
							break;
						}
						local16[local63] = local69 | local84;
					}
				} else {
					local59 = local16[local30 - 1];
				}
				local16[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local46 == local16[local63]) {
						local16[local63] = local59;
					}
				}
				local69 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(160) int local160 = Integer.MIN_VALUE >>> local84;
					if ((local46 & local160) == 0) {
						local69++;
					} else {
						if (this.anIntArray95[local69] == 0) {
							this.anIntArray95[local69] = local22;
						}
						local69 = this.anIntArray95[local69];
					}
					if (local69 >= this.anIntArray95.length) {
						@Pc(200) int[] local200 = new int[this.anIntArray95.length * 2];
						for (@Pc(202) int local202 = 0; local202 < this.anIntArray95.length; local202++) {
							local200[local202] = this.anIntArray95[local202];
						}
						this.anIntArray95 = local200;
					}
				}
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
				this.anIntArray95[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II[B[BII)I")
	public int method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg4;
		@Pc(20) int local20 = arg1 << 3;
		while (local16 > arg0) {
			@Pc(28) int local28 = arg3[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray94[local28];
			@Pc(38) byte local38 = this.aByteArray24[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local20 >> 3;
			@Pc(59) int local59 = local20 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(77) int local77 = local55 + (local38 + local59 - 1 >> 3);
			local20 += local38;
			@Pc(82) int local82 = local59 + 24;
			arg2[local55] = (byte) (local12 |= local33 >>> local82);
			if (local77 > local55) {
				local55++;
				local59 = local82 - 8;
				arg2[local55] = (byte) (local12 = local33 >>> local59);
				if (local55 < local77) {
					local59 -= 8;
					local55++;
					arg2[local55] = (byte) (local12 = local33 >>> local59);
					if (local77 > local55) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local12 = local33 >>> local59);
						if (local55 < local77) {
							local59 -= 8;
							local55++;
							arg2[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			arg0++;
		}
		return (local20 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([BB[BIII)I")
	public int method1893(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg1[local25];
			if (local29 < 0) {
				local23 = this.anIntArray95[local23];
			} else {
				local23++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local48;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local84;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local123;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local155;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local193;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local225;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local260;
				if (arg4 >= local13) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray95[local23];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray95[local23]) < 0) {
				arg0[arg4++] = (byte) ~local292;
				if (local13 <= arg4) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}
}

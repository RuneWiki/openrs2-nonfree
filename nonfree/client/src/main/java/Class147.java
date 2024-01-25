import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class147 {

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[B")
	private final byte[] aByteArray72;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
	private final int[] anIntArray550;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
	private int[] anIntArray549;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
	public Class147(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray72 = arg0;
		this.anIntArray550 = new int[local6];
		this.anIntArray549 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray550[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(87) int local87;
				if ((local46 & local42) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local73 != local46) {
							break;
						}
						local87 = 0x1 << 32 - local67;
						if ((local73 & local87) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local87 | local73;
					}
					local61 = local42 | local46;
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local20[local67] == local46) {
						local20[local67] = local61;
					}
				}
				local73 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local87;
					if ((local46 & local153) == 0) {
						local73++;
					} else {
						if (this.anIntArray549[local73] == 0) {
							this.anIntArray549[local73] = local22;
						}
						local73 = this.anIntArray549[local73];
					}
					if (this.anIntArray549.length <= local73) {
						@Pc(194) int[] local194 = new int[this.anIntArray549.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray549.length; local196++) {
							local194[local196] = this.anIntArray549[local196];
						}
						this.anIntArray549 = local194;
					}
				}
				this.anIntArray549[local73] = ~local24;
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([BIII[BI)I")
	public int method3997(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg2;
		while (local15 > arg4) {
			@Pc(23) int local23 = arg0[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray550[local23];
			@Pc(33) byte local33 = this.aByteArray72[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local11 >> 3;
			@Pc(54) int local54 = local11 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = (local33 + local54 - 1 >> 3) + local50;
			@Pc(72) int local72 = local54 + 24;
			arg3[local50] = (byte) (local7 |= local28 >>> local72);
			if (local50 < local71) {
				local50++;
				local54 = local72 - 8;
				arg3[local50] = (byte) (local7 = local28 >>> local54);
				if (local71 > local50) {
					local50++;
					local54 -= 8;
					arg3[local50] = (byte) (local7 = local28 >>> local54);
					if (local71 > local50) {
						local50++;
						local54 -= 8;
						arg3[local50] = (byte) (local7 = local28 >>> local54);
						if (local71 > local50) {
							local54 -= 8;
							local50++;
							arg3[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			local11 += local33;
			arg4++;
		}
		return (local11 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III[BI[B)I")
	public int method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3;
		@Pc(17) int local17 = arg0;
		while (true) {
			@Pc(21) byte local21 = arg4[local17];
			if (local21 < 0) {
				local11 = this.anIntArray549[local11];
			} else {
				local11++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local37;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(69) int local69;
			if ((local69 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local69;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(107) int local107;
			if ((local107 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local107;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local149;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(185) int local185;
			if ((local185 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local185;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(224) int local224;
			if ((local224 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local224;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(256) int local256;
			if ((local256 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local256;
				if (arg1 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray549[local11];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray549[local11]) < 0) {
				arg2[arg1++] = (byte) ~local292;
				if (local15 <= arg1) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class151 {

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "[I")
	private final int[] anIntArray243;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V")
	public Class151(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray28 = arg0;
		this.anIntArray243 = new int[local6];
		this.anIntArray244 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray243[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(86) int local86;
				if ((local43 & local39) == 0) {
					local61 = local43 | local39;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local77 != local43) {
							break;
						}
						local86 = 0x1 << 32 - local71;
						if ((local77 & local86) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local86 | local77;
					}
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local20[local71] == local43) {
						local20[local71] = local61;
					}
				}
				local77 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(159) int local159 = Integer.MIN_VALUE >>> local86;
					if ((local159 & local43) == 0) {
						local77++;
					} else {
						if (this.anIntArray244[local77] == 0) {
							this.anIntArray244[local77] = local22;
						}
						local77 = this.anIntArray244[local77];
					}
					if (this.anIntArray244.length <= local77) {
						@Pc(203) int[] local203 = new int[this.anIntArray244.length * 2];
						for (@Pc(205) int local205 = 0; local205 < this.anIntArray244.length; local205++) {
							local203[local205] = this.anIntArray244[local205];
						}
						this.anIntArray244 = local203;
					}
				}
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
				this.anIntArray244[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[BIII[B)I")
	public int method3697(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2 << 3;
		@Pc(22) int local22 = arg3;
		while (local22 > arg0) {
			@Pc(32) int local32 = arg4[arg0] & 0xFF;
			@Pc(37) int local37 = this.anIntArray243[local32];
			@Pc(42) byte local42 = this.aByteArray28[local32];
			if (local42 == 0) {
				throw new RuntimeException("No codeword for data value " + local32);
			}
			@Pc(62) int local62 = local11 >> 3;
			@Pc(66) int local66 = local11 & 0x7;
			local7 &= -local66 >> 31;
			@Pc(83) int local83 = local62 + (local42 + local66 - 1 >> 3);
			@Pc(84) int local84 = local66 + 24;
			arg1[local62] = (byte) (local7 |= local37 >>> local84);
			if (local83 > local62) {
				local62++;
				local66 = local84 - 8;
				arg1[local62] = (byte) (local7 = local37 >>> local66);
				if (local83 > local62) {
					local62++;
					local66 -= 8;
					arg1[local62] = (byte) (local7 = local37 >>> local66);
					if (local83 > local62) {
						local62++;
						local66 -= 8;
						arg1[local62] = (byte) (local7 = local37 >>> local66);
						if (local62 < local83) {
							local62++;
							local66 -= 8;
							arg1[local62] = (byte) (local7 = local37 << -local66);
						}
					}
				}
			}
			local11 += local42;
			arg0++;
		}
		return (local11 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I[BIII[B)I")
	public int method3700(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg2;
		@Pc(18) int local18 = arg3;
		while (true) {
			@Pc(22) byte local22 = arg1[local18];
			if (local22 < 0) {
				local12 = this.anIntArray244[local12];
			} else {
				local12++;
			}
			@Pc(47) int local47;
			if ((local47 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local47;
				if (arg0 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local86;
				if (local16 <= arg0) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local129;
				if (local16 <= arg0) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(172) int local172;
			if ((local172 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local172;
				if (arg0 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(211) int local211;
			if ((local211 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local211;
				if (local16 <= arg0) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(250) int local250;
			if ((local250 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local250;
				if (arg0 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(289) int local289;
			if ((local289 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local289;
				if (local16 <= arg0) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray244[local12];
			}
			@Pc(335) int local335;
			if ((local335 = this.anIntArray244[local12]) < 0) {
				arg4[arg0++] = (byte) ~local335;
				if (arg0 >= local16) {
					break;
				}
				local12 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg3;
	}
}

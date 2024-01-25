import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class27 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
	private final int[] anIntArray117;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V")
	public Class27(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray117 = new int[local6];
		this.aByteArray22 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray118 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local16[local30];
				this.anIntArray117[local24] = local42;
				@Pc(57) int local57;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(84) int local84;
				if ((local38 & local42) == 0) {
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local16[local63];
						if (local69 != local42) {
							break;
						}
						local84 = 0x1 << 32 - local63;
						if ((local69 & local84) != 0) {
							local16[local63] = local16[local63 - 1];
							break;
						}
						local16[local63] = local84 | local69;
					}
					local57 = local38 | local42;
				} else {
					local57 = local16[local30 - 1];
				}
				local16[local30] = local57;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local16[local63] == local42) {
						local16[local63] = local57;
					}
				}
				local69 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local84;
					if ((local42 & local156) == 0) {
						local69++;
					} else {
						if (this.anIntArray118[local69] == 0) {
							this.anIntArray118[local69] = local22;
						}
						local69 = this.anIntArray118[local69];
					}
					if (local69 >= this.anIntArray118.length) {
						@Pc(201) int[] local201 = new int[this.anIntArray118.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray118.length; local203++) {
							local201[local203] = this.anIntArray118[local203];
						}
						this.anIntArray118 = local201;
					}
				}
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
				this.anIntArray118[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[BII[BI)I")
	public int method896(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg2;
		@Pc(18) int local18 = arg1;
		while (true) {
			@Pc(22) byte local22 = arg0[local18];
			if (local22 < 0) {
				local12 = this.anIntArray118[local12];
			} else {
				local12++;
			}
			@Pc(41) int local41;
			if ((local41 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local41;
				if (arg4 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local79;
				if (arg4 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(121) int local121;
			if ((local121 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local121;
				if (local16 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local160;
				if (local16 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(202) int local202;
			if ((local202 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local202;
				if (local16 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(240) int local240;
			if ((local240 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local240;
				if (arg4 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(275) int local275;
			if ((local275 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local275;
				if (local16 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray118[local12];
			}
			@Pc(311) int local311;
			if ((local311 = this.anIntArray118[local12]) < 0) {
				arg3[arg4++] = (byte) ~local311;
				if (local16 <= arg4) {
					break;
				}
				local12 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([BI[BIII)I")
	public int method898(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg3 << 3;
		@Pc(21) int local21 = arg4;
		while (local21 > arg2) {
			@Pc(29) int local29 = arg0[arg2] & 0xFF;
			@Pc(34) int local34 = this.anIntArray117[local29];
			@Pc(39) byte local39 = this.aByteArray22[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local17 >> 3;
			@Pc(60) int local60 = local17 & 0x7;
			local7 &= -local60 >> 31;
			@Pc(77) int local77 = local56 + (local60 + local39 - 1 >> 3);
			@Pc(78) int local78 = local60 + 24;
			arg1[local56] = (byte) (local7 |= local34 >>> local78);
			if (local77 > local56) {
				local56++;
				local60 = local78 - 8;
				arg1[local56] = (byte) (local7 = local34 >>> local60);
				if (local56 < local77) {
					local60 -= 8;
					local56++;
					arg1[local56] = (byte) (local7 = local34 >>> local60);
					if (local56 < local77) {
						local56++;
						local60 -= 8;
						arg1[local56] = (byte) (local7 = local34 >>> local60);
						if (local56 < local77) {
							local56++;
							local60 -= 8;
							arg1[local56] = (byte) (local7 = local34 << -local60);
						}
					}
				}
			}
			local17 += local39;
			arg2++;
		}
		return (local17 + 7 >> 3) - arg3;
	}
}

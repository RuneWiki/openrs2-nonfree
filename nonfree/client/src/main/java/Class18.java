import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class18 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
	private final int[] anIntArray81;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
	public Class18(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray2 = arg0;
		@Pc(12) int[] local12 = new int[33];
		this.anIntArray81 = new int[local6];
		@Pc(18) int local18 = 0;
		this.anIntArray82 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local12[local30];
				this.anIntArray81[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(91) int local91;
				if ((local43 & local39) == 0) {
					local61 = local39 | local43;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local12[local71];
						if (local77 != local43) {
							break;
						}
						local91 = 0x1 << 32 - local71;
						if ((local77 & local91) != 0) {
							local12[local71] = local12[local71 - 1];
							break;
						}
						local12[local71] = local91 | local77;
					}
				} else {
					local61 = local12[local30 - 1];
				}
				local12[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local43 == local12[local71]) {
						local12[local71] = local61;
					}
				}
				local77 = 0;
				for (local91 = 0; local91 < local30; local91++) {
					@Pc(161) int local161 = Integer.MIN_VALUE >>> local91;
					if ((local161 & local43) == 0) {
						local77++;
					} else {
						if (this.anIntArray82[local77] == 0) {
							this.anIntArray82[local77] = local18;
						}
						local77 = this.anIntArray82[local77];
					}
					if (this.anIntArray82.length <= local77) {
						@Pc(201) int[] local201 = new int[this.anIntArray82.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray82.length; local203++) {
							local201[local203] = this.anIntArray82[local203];
						}
						this.anIntArray82 = local201;
					}
				}
				if (local77 >= local18) {
					local18 = local77 + 1;
				}
				this.anIntArray82[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI[BIIB)I")
	public int method492(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = arg3;
		while (true) {
			@Pc(26) byte local26 = arg0[local22];
			if (local26 < 0) {
				local16 = this.anIntArray82[local16];
			} else {
				local16++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local45;
				if (arg4 >= local20) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local77;
				if (local20 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local113;
				if (local20 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local155;
				if (arg4 >= local20) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local193;
				if (arg4 >= local20) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local232;
				if (local20 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local271;
				if (local20 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray82[local16];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray82[local16]) < 0) {
				arg2[arg4++] = (byte) ~local303;
				if (arg4 >= local20) {
					break;
				}
				local16 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg3;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BBI[BII)I")
	public int method494(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(20) int local20 = arg3 << 3;
		while (arg1 < local11) {
			@Pc(28) int local28 = arg2[arg1] & 0xFF;
			@Pc(33) int local33 = this.anIntArray81[local28];
			@Pc(38) byte local38 = this.aByteArray2[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 & 0x7;
			local7 &= -local58 >> 31;
			@Pc(69) int local69 = local20 >> 3;
			@Pc(80) int local80 = (local58 + local38 - 1 >> 3) + local69;
			@Pc(81) int local81 = local58 + 24;
			arg0[local69] = (byte) (local7 |= local33 >>> local81);
			if (local80 > local69) {
				local58 = local81 - 8;
				local69++;
				arg0[local69] = (byte) (local7 = local33 >>> local58);
				if (local69 < local80) {
					local69++;
					local58 -= 8;
					arg0[local69] = (byte) (local7 = local33 >>> local58);
					if (local69 < local80) {
						local69++;
						local58 -= 8;
						arg0[local69] = (byte) (local7 = local33 >>> local58);
						if (local69 < local80) {
							local58 -= 8;
							local69++;
							arg0[local69] = (byte) (local7 = local33 << -local58);
						}
					}
				}
			}
			local20 += local38;
			arg1++;
		}
		return (local20 + 7 >> 3) - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class31 {

	@OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
	private final int[] anIntArray112;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
	public Class31(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray112 = new int[local6];
		this.anIntArray111 = new int[8];
		@Pc(17) int[] local17 = new int[33];
		@Pc(19) int local19 = 0;
		this.aByteArray6 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local17[local30];
				this.anIntArray112[local24] = local43;
				@Pc(107) int local107;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(77) int local77;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local17[local59];
						if (local43 != local65) {
							break;
						}
						local77 = 0x1 << 32 - local59;
						if ((local77 & local65) != 0) {
							local17[local59] = local17[local59 - 1];
							break;
						}
						local17[local59] = local65 | local77;
					}
					local107 = local43 | local39;
				} else {
					local107 = local17[local30 - 1];
				}
				local17[local30] = local107;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local17[local59] == local43) {
						local17[local59] = local107;
					}
				}
				local65 = 0;
				for (local77 = 0; local77 < local30; local77++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local77;
					if ((local43 & local150) == 0) {
						local65++;
					} else {
						if (this.anIntArray111[local65] == 0) {
							this.anIntArray111[local65] = local19;
						}
						local65 = this.anIntArray111[local65];
					}
					if (this.anIntArray111.length <= local65) {
						@Pc(195) int[] local195 = new int[this.anIntArray111.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray111.length; local197++) {
							local195[local197] = this.anIntArray111[local197];
						}
						this.anIntArray111 = local195;
					}
				}
				if (local19 <= local65) {
					local19 = local65 + 1;
				}
				this.anIntArray111[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ[BI[B)I")
	public int method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg1;
		while (true) {
			@Pc(26) byte local26 = arg2[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local45;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local83;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local118;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(153) int local153;
			if ((local153 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local153;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(188) int local188;
			if ((local188 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local188;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local230;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(272) int local272;
			if ((local272 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local272;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray111[local20];
			}
			@Pc(314) int local314;
			if ((local314 = this.anIntArray111[local20]) < 0) {
				arg4[arg3++] = (byte) ~local314;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BI[BIII)I")
	public int method679(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		@Pc(15) int local15 = arg3;
		while (arg1 < local15) {
			@Pc(28) int local28 = arg0[arg1] & 0xFF;
			@Pc(33) int local33 = this.anIntArray112[local28];
			@Pc(38) byte local38 = this.aByteArray6[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local11 >> 3;
			@Pc(59) int local59 = local11 & 0x7;
			local7 &= -local59 >> 31;
			local11 += local38;
			@Pc(80) int local80 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(81) int local81 = local59 + 24;
			arg2[local55] = (byte) (local7 |= local33 >>> local81);
			if (local55 < local80) {
				local59 = local81 - 8;
				local55++;
				arg2[local55] = (byte) (local7 = local33 >>> local59);
				if (local80 > local55) {
					local59 -= 8;
					local55++;
					arg2[local55] = (byte) (local7 = local33 >>> local59);
					if (local80 > local55) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local7 = local33 >>> local59);
						if (local55 < local80) {
							local59 -= 8;
							local55++;
							arg2[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			arg1++;
		}
		return (local11 + 7 >> 3) - arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class76 {

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "[I")
	private final int[] anIntArray102;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([B)V")
	public Class76(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray102 = new int[local6];
		this.aByteArray24 = arg0;
		this.anIntArray100 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local20[local30];
				this.anIntArray102[local24] = local45;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(78) int local78;
				if ((local45 & local41) == 0) {
					local58 = local41 | local45;
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local20[local62];
						if (local45 != local68) {
							break;
						}
						local78 = 0x1 << 32 - local62;
						if ((local68 & local78) != 0) {
							local20[local62] = local20[local62 - 1];
							break;
						}
						local20[local62] = local78 | local68;
					}
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local45 == local20[local62]) {
						local20[local62] = local58;
					}
				}
				local68 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local78;
					if ((local150 & local45) == 0) {
						local68++;
					} else {
						if (this.anIntArray100[local68] == 0) {
							this.anIntArray100[local68] = local22;
						}
						local68 = this.anIntArray100[local68];
					}
					if (this.anIntArray100.length <= local68) {
						@Pc(191) int[] local191 = new int[this.anIntArray100.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray100.length; local193++) {
							local191[local193] = this.anIntArray100[local193];
						}
						this.anIntArray100 = local191;
					}
				}
				this.anIntArray100[local68] = ~local24;
				if (local68 >= local22) {
					local22 = local68 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[BI[BI)I")
	public int method2213(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local43;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(82) int local82;
			if ((local82 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local82;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(120) int local120;
			if ((local120 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local120;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(159) int local159;
			if ((local159 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local159;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(198) int local198;
			if ((local198 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local198;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(233) int local233;
			if ((local233 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local233;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(272) int local272;
			if ((local272 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local272;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray100[local18];
			}
			@Pc(307) int local307;
			if ((local307 = this.anIntArray100[local18]) < 0) {
				arg3[arg2++] = (byte) ~local307;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI[BI[BI)I")
	public int method2216(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2;
		@Pc(15) int local15 = arg4 << 3;
		while (local11 > arg0) {
			@Pc(33) int local33 = arg1[arg0] & 0xFF;
			@Pc(38) int local38 = this.anIntArray102[local33];
			@Pc(43) byte local43 = this.aByteArray24[local33];
			if (local43 == 0) {
				throw new RuntimeException("No codeword for data value " + local33);
			}
			@Pc(60) int local60 = local15 >> 3;
			@Pc(64) int local64 = local15 & 0x7;
			local7 &= -local64 >> 31;
			@Pc(82) int local82 = local60 + (local43 + local64 - 1 >> 3);
			local15 += local43;
			@Pc(87) int local87 = local64 + 24;
			arg3[local60] = (byte) (local7 |= local38 >>> local87);
			if (local60 < local82) {
				local64 = local87 - 8;
				local60++;
				arg3[local60] = (byte) (local7 = local38 >>> local64);
				if (local60 < local82) {
					local60++;
					local64 -= 8;
					arg3[local60] = (byte) (local7 = local38 >>> local64);
					if (local82 > local60) {
						local60++;
						local64 -= 8;
						arg3[local60] = (byte) (local7 = local38 >>> local64);
						if (local60 < local82) {
							local60++;
							local64 -= 8;
							arg3[local60] = (byte) (local7 = local38 << -local64);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}

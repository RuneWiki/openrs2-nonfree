import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class147 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "[I")
	private final int[] anIntArray286;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "([B)V")
	public Class147(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray286 = new int[local6];
		this.aByteArray50 = arg0;
		this.anIntArray285 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local20[local30];
				this.anIntArray286[local24] = local45;
				@Pc(60) int local60;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(91) int local91;
				if ((local45 & local41) == 0) {
					local60 = local41 | local45;
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local20[local70];
						if (local45 != local76) {
							break;
						}
						local91 = 0x1 << 32 - local70;
						if ((local91 & local76) != 0) {
							local20[local70] = local20[local70 - 1];
							break;
						}
						local20[local70] = local76 | local91;
					}
				} else {
					local60 = local20[local30 - 1];
				}
				local20[local30] = local60;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local45 == local20[local70]) {
						local20[local70] = local60;
					}
				}
				local76 = 0;
				for (local91 = 0; local91 < local30; local91++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local91;
					if ((local45 & local153) == 0) {
						local76++;
					} else {
						if (this.anIntArray285[local76] == 0) {
							this.anIntArray285[local76] = local22;
						}
						local76 = this.anIntArray285[local76];
					}
					if (this.anIntArray285.length <= local76) {
						@Pc(190) int[] local190 = new int[this.anIntArray285.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray285.length; local192++) {
							local190[local192] = this.anIntArray285[local192];
						}
						this.anIntArray285 = local190;
					}
				}
				if (local22 <= local76) {
					local22 = local76 + 1;
				}
				this.anIntArray285[local76] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[BI[BI)I")
	public int method3282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		@Pc(20) int local20 = arg1;
		while (arg0 < local20) {
			@Pc(28) int local28 = arg3[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray286[local28];
			@Pc(38) byte local38 = this.aByteArray50[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local11 >> 3;
			@Pc(59) int local59 = local11 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(76) int local76 = (local38 + local59 - 1 >> 3) + local55;
			local11 += local38;
			@Pc(81) int local81 = local59 + 24;
			arg2[local55] = (byte) (local7 |= local33 >>> local81);
			if (local76 > local55) {
				local59 = local81 - 8;
				local55++;
				arg2[local55] = (byte) (local7 = local33 >>> local59);
				if (local76 > local55) {
					local55++;
					local59 -= 8;
					arg2[local55] = (byte) (local7 = local33 >>> local59);
					if (local76 > local55) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local7 = local33 >>> local59);
						if (local76 > local55) {
							local59 -= 8;
							local55++;
							arg2[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			arg0++;
		}
		return (local11 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([BB[BIII)I")
	public int method3283(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg2;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg1[local20];
			if (local29 < 0) {
				local18 = this.anIntArray285[local18];
			} else {
				local18++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local48;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local90;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local129;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local161;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local203;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(235) int local235;
			if ((local235 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local235;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(270) int local270;
			if ((local270 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local270;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray285[local18];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray285[local18]) < 0) {
				arg0[arg4++] = (byte) ~local309;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}

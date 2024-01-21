import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class80 {

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
	private final int[] anIntArray336;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "[B")
	private final byte[] aByteArray128;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class80(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray338 = new int[8];
		this.anIntArray336 = new int[local6];
		@Pc(17) int[] local17 = new int[33];
		this.aByteArray128 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local17[local30];
				this.anIntArray336[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(88) int local88;
				if ((local42 & local46) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local17[local70];
						if (local46 != local76) {
							break;
						}
						local88 = 0x1 << 32 - local70;
						if ((local76 & local88) != 0) {
							local17[local70] = local17[local70 - 1];
							break;
						}
						local17[local70] = local88 | local76;
					}
					local64 = local46 | local42;
				} else {
					local64 = local17[local30 - 1];
				}
				local17[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local17[local70] == local46) {
						local17[local70] = local64;
					}
				}
				local76 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(160) int local160 = Integer.MIN_VALUE >>> local88;
					if ((local46 & local160) == 0) {
						local76++;
					} else {
						if (this.anIntArray338[local76] == 0) {
							this.anIntArray338[local76] = local22;
						}
						local76 = this.anIntArray338[local76];
					}
					if (local76 >= this.anIntArray338.length) {
						@Pc(205) int[] local205 = new int[this.anIntArray338.length * 2];
						for (@Pc(207) int local207 = 0; local207 < this.anIntArray338.length; local207++) {
							local205[local207] = this.anIntArray338[local207];
						}
						this.anIntArray338 = local205;
					}
				}
				if (local76 >= local22) {
					local22 = local76 + 1;
				}
				this.anIntArray338[local76] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B[BIII)I")
	public int method2136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg1[local25];
			if (local29 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local45;
				if (local21 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local80;
				if (arg4 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local119;
				if (arg4 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local158;
				if (arg4 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local197;
				if (local21 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local236;
				if (local21 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(274) int local274;
			if ((local274 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local274;
				if (local21 <= arg4) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray338[local23];
			}
			@Pc(313) int local313;
			if ((local313 = this.anIntArray338[local23]) < 0) {
				arg0[arg4++] = (byte) ~local313;
				if (local21 <= arg4) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([B[BIIII)I")
	public int method2140(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(15) int local15 = arg2 << 3;
		while (local11 > arg3) {
			@Pc(28) int local28 = arg0[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray336[local28];
			@Pc(38) byte local38 = this.aByteArray128[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local15 >> 3;
			@Pc(59) int local59 = local15 & 0x7;
			@Pc(70) int local70 = local55 + (local38 + local59 - 1 >> 3);
			local7 &= -local59 >> 31;
			local15 += local38;
			@Pc(82) int local82 = local59 + 24;
			arg1[local55] = (byte) (local7 |= local33 >>> local82);
			if (local55 < local70) {
				local59 = local82 - 8;
				local55++;
				arg1[local55] = (byte) (local7 = local33 >>> local59);
				if (local55 < local70) {
					local59 -= 8;
					local55++;
					arg1[local55] = (byte) (local7 = local33 >>> local59);
					if (local70 > local55) {
						local55++;
						local59 -= 8;
						arg1[local55] = (byte) (local7 = local33 >>> local59);
						if (local55 < local70) {
							local59 -= 8;
							local55++;
							arg1[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg2;
	}
}

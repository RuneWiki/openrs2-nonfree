import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class303 {

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	private final int[] anIntArray546;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[B")
	private final byte[] aByteArray101;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V")
	public Class303(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray546 = new int[local6];
		this.aByteArray101 = arg0;
		this.anIntArray545 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray546[local24] = local43;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(88) int local88;
				if ((local39 & local43) == 0) {
					local61 = local43 | local39;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local20[local71];
						if (local43 != local77) {
							break;
						}
						local88 = 0x1 << 32 - local71;
						if ((local77 & local88) != 0) {
							local20[local71] = local20[local71 - 1];
							break;
						}
						local20[local71] = local88 | local77;
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
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local88;
					if ((local43 & local147) == 0) {
						local77++;
					} else {
						if (this.anIntArray545[local77] == 0) {
							this.anIntArray545[local77] = local22;
						}
						local77 = this.anIntArray545[local77];
					}
					if (this.anIntArray545.length <= local77) {
						@Pc(188) int[] local188 = new int[this.anIntArray545.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray545.length; local190++) {
							local188[local190] = this.anIntArray545[local190];
						}
						this.anIntArray545 = local188;
					}
				}
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
				this.anIntArray545[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[B[BI)I")
	public int method7627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg4 << 3;
		while (local11 > arg0) {
			@Pc(23) int local23 = arg2[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray546[local23];
			@Pc(33) byte local33 = this.aByteArray101[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = (local54 + local33 - 1 >> 3) + local50;
			@Pc(73) int local73 = local54 + 24;
			arg3[local50] = (byte) (local7 |= local28 >>> local73);
			if (local50 < local72) {
				local50++;
				local54 = local73 - 8;
				arg3[local50] = (byte) (local7 = local28 >>> local54);
				if (local72 > local50) {
					local54 -= 8;
					local50++;
					arg3[local50] = (byte) (local7 = local28 >>> local54);
					if (local72 > local50) {
						local50++;
						local54 -= 8;
						arg3[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local72) {
							local50++;
							local54 -= 8;
							arg3[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			local15 += local33;
			arg0++;
		}
		return (local15 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III[B[BI)I")
	public int method7628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 >= 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local45;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local84;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local122;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local161;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local199;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local238;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local273;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray545[local19];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray545[local19]) < 0) {
				arg3[arg2++] = (byte) ~local309;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class71 {

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "[B")
	private final byte[] aByteArray18;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "[I")
	private final int[] anIntArray85;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "([B)V")
	public Class71(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray18 = arg0;
		this.anIntArray85 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray86 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray85[local24] = local43;
				@Pc(106) int local106;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(76) int local76;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local16[local59];
						if (local43 != local65) {
							break;
						}
						local76 = 0x1 << 32 - local59;
						if ((local65 & local76) != 0) {
							local16[local59] = local16[local59 - 1];
							break;
						}
						local16[local59] = local65 | local76;
					}
					local106 = local39 | local43;
				} else {
					local106 = local16[local30 - 1];
				}
				local16[local30] = local106;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local16[local59] == local43) {
						local16[local59] = local106;
					}
				}
				local65 = 0;
				for (local76 = 0; local76 < local30; local76++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local76;
					if ((local43 & local149) == 0) {
						local65++;
					} else {
						if (this.anIntArray86[local65] == 0) {
							this.anIntArray86[local65] = local22;
						}
						local65 = this.anIntArray86[local65];
					}
					if (this.anIntArray86.length <= local65) {
						@Pc(193) int[] local193 = new int[this.anIntArray86.length * 2];
						for (@Pc(195) int local195 = 0; local195 < this.anIntArray86.length; local195++) {
							local193[local195] = this.anIntArray86[local195];
						}
						this.anIntArray86 = local193;
					}
				}
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
				this.anIntArray86[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[BII[BI)I")
	public int method1502(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local40;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(72) int local72;
			if ((local72 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local72;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local108;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(143) int local143;
			if ((local143 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local143;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local179;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local214;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(249) int local249;
			if ((local249 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local249;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray86[local14];
			}
			@Pc(284) int local284;
			if ((local284 = this.anIntArray86[local14]) < 0) {
				arg3[arg0++] = (byte) ~local284;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II[BI[BI)I")
	public int method1503(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(15) int local15 = arg2 << 3;
		while (arg0 < local11) {
			@Pc(23) int local23 = arg3[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray85[local23];
			@Pc(33) byte local33 = this.aByteArray18[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = local50 + (local33 + local54 - 1 >> 3);
			local15 += local33;
			@Pc(76) int local76 = local54 + 24;
			arg1[local50] = (byte) (local7 |= local28 >>> local76);
			if (local50 < local71) {
				local54 = local76 - 8;
				local50++;
				arg1[local50] = (byte) (local7 = local28 >>> local54);
				if (local71 > local50) {
					local54 -= 8;
					local50++;
					arg1[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local71) {
						local50++;
						local54 -= 8;
						arg1[local50] = (byte) (local7 = local28 >>> local54);
						if (local71 > local50) {
							local50++;
							local54 -= 8;
							arg1[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg2;
	}
}

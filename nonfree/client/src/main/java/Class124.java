import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class124 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class124(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray313 = new int[8];
		this.anIntArray315 = new int[local6];
		this.aByteArray34 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(46) int local46 = 0x1 << 32 - local35;
				@Pc(50) int local50 = local20[local35];
				this.anIntArray315[local24] = local50;
				@Pc(118) int local118;
				@Pc(64) int local64;
				@Pc(73) int local73;
				@Pc(88) int local88;
				if ((local50 & local46) == 0) {
					for (local64 = local35 - 1; local64 >= 1; local64--) {
						local73 = local20[local64];
						if (local50 != local73) {
							break;
						}
						local88 = 0x1 << 32 - local64;
						if ((local73 & local88) != 0) {
							local20[local64] = local20[local64 - 1];
							break;
						}
						local20[local64] = local73 | local88;
					}
					local118 = local46 | local50;
				} else {
					local118 = local20[local35 - 1];
				}
				local20[local35] = local118;
				for (local64 = local35 + 1; local64 <= 32; local64++) {
					if (local20[local64] == local50) {
						local20[local64] = local118;
					}
				}
				local64 = 0;
				for (local73 = 0; local73 < local35; local73++) {
					local88 = Integer.MIN_VALUE >>> local73;
					if ((local50 & local88) == 0) {
						local64++;
					} else {
						if (this.anIntArray313[local64] == 0) {
							this.anIntArray313[local64] = local22;
						}
						local64 = this.anIntArray313[local64];
					}
					if (local64 >= this.anIntArray313.length) {
						@Pc(210) int[] local210 = new int[this.anIntArray313.length * 2];
						for (@Pc(212) int local212 = 0; local212 < this.anIntArray313.length; local212++) {
							local210[local212] = this.anIntArray313[local212];
						}
						this.anIntArray313 = local210;
					}
				}
				this.anIntArray313[local64] = ~local24;
				if (local22 <= local64) {
					local22 = local64 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BB[BIII)I")
	public int method3174(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg2;
		while (true) {
			@Pc(32) byte local32 = arg1[local28];
			if (local32 >= 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local49;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local84;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local126;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(166) int local166;
			if ((local166 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local166;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(204) int local204;
			if ((local204 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local204;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local242;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(282) int local282;
			if ((local282 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local282;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray313[local26];
			}
			@Pc(316) int local316;
			if ((local316 = this.anIntArray313[local26]) < 0) {
				arg0[arg4++] = (byte) ~local316;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg2;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[BBI)I")
	public int method3176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = arg4 << 3;
		@Pc(15) int local15 = 0;
		while (arg1 < local5) {
			@Pc(33) int local33 = arg3[arg1] & 0xFF;
			@Pc(38) byte local38 = this.aByteArray34[local33];
			@Pc(43) int local43 = this.anIntArray315[local33];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local33);
			}
			@Pc(62) int local62 = local9 >> 3;
			@Pc(66) int local66 = local9 & 0x7;
			local15 &= -local66 >> 31;
			@Pc(84) int local84 = local62 + (local38 + local66 - 1 >> 3);
			local9 += local38;
			@Pc(89) int local89 = local66 + 24;
			arg2[local62] = (byte) (local15 |= local43 >>> local89);
			if (local62 < local84) {
				local62++;
				local66 = local89 - 8;
				arg2[local62] = (byte) (local15 = local43 >>> local66);
				if (local62 < local84) {
					local66 -= 8;
					local62++;
					arg2[local62] = (byte) (local15 = local43 >>> local66);
					if (local62 < local84) {
						local66 -= 8;
						local62++;
						arg2[local62] = (byte) (local15 = local43 >>> local66);
						if (local84 > local62) {
							local66 -= 8;
							local62++;
							arg2[local62] = (byte) (local15 = local43 << -local66);
						}
					}
				}
			}
			arg1++;
		}
		return (local9 + 7 >> 3) - arg4;
	}
}

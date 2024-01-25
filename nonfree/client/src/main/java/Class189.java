import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class189 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "[I")
	private final int[] anIntArray383;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
	public Class189(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray75 = arg0;
		this.anIntArray383 = new int[local6];
		this.anIntArray384 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray383[local24] = local42;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(88) int local88;
				if ((local42 & local38) == 0) {
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local20[local66];
						if (local72 != local42) {
							break;
						}
						local88 = 0x1 << 32 - local66;
						if ((local88 & local72) != 0) {
							local20[local66] = local20[local66 - 1];
							break;
						}
						local20[local66] = local72 | local88;
					}
					local60 = local42 | local38;
				} else {
					local60 = local20[local30 - 1];
				}
				local20[local30] = local60;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local42 == local20[local66]) {
						local20[local66] = local60;
					}
				}
				local72 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local88;
					if ((local42 & local151) == 0) {
						local72++;
					} else {
						if (this.anIntArray384[local72] == 0) {
							this.anIntArray384[local72] = local22;
						}
						local72 = this.anIntArray384[local72];
					}
					if (local72 >= this.anIntArray384.length) {
						@Pc(196) int[] local196 = new int[this.anIntArray384.length * 2];
						for (@Pc(198) int local198 = 0; local198 < this.anIntArray384.length; local198++) {
							local196[local198] = this.anIntArray384[local198];
						}
						this.anIntArray384 = local196;
					}
				}
				if (local72 >= local22) {
					local22 = local72 + 1;
				}
				this.anIntArray384[local72] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[BII[BI)I")
	public int method4077(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg2;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 < 0) {
				local18 = this.anIntArray384[local18];
			} else {
				local18++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local40;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(72) int local72;
			if ((local72 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local72;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(107) int local107;
			if ((local107 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local107;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(139) int local139;
			if ((local139 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local139;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(171) int local171;
			if ((local171 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local171;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(210) int local210;
			if ((local210 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local210;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(246) int local246;
			if ((local246 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local246;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray384[local18];
			}
			@Pc(285) int local285;
			if ((local285 = this.anIntArray384[local18]) < 0) {
				arg4[arg0++] = (byte) ~local285;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg2;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([BIIII[B)I")
	public int method4079(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(23) int local23 = arg3 << 3;
		@Pc(27) int local27 = arg1;
		while (local27 > arg2) {
			@Pc(35) int local35 = arg0[arg2] & 0xFF;
			@Pc(40) int local40 = this.anIntArray383[local35];
			@Pc(45) byte local45 = this.aByteArray75[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(62) int local62 = local23 >> 3;
			@Pc(66) int local66 = local23 & 0x7;
			local7 &= -local66 >> 31;
			@Pc(83) int local83 = (local45 + local66 - 1 >> 3) + local62;
			@Pc(84) int local84 = local66 + 24;
			arg4[local62] = (byte) (local7 |= local40 >>> local84);
			if (local83 > local62) {
				local66 = local84 - 8;
				local62++;
				arg4[local62] = (byte) (local7 = local40 >>> local66);
				if (local62 < local83) {
					local62++;
					local66 -= 8;
					arg4[local62] = (byte) (local7 = local40 >>> local66);
					if (local62 < local83) {
						local66 -= 8;
						local62++;
						arg4[local62] = (byte) (local7 = local40 >>> local66);
						if (local62 < local83) {
							local62++;
							local66 -= 8;
							arg4[local62] = (byte) (local7 = local40 << -local66);
						}
					}
				}
			}
			local23 += local45;
			arg2++;
		}
		return (local23 + 7 >> 3) - arg3;
	}
}

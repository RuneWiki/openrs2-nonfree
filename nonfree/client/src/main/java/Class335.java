import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class335 {

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "[B")
	private final byte[] aByteArray118;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "[I")
	private final int[] anIntArray708;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "[I")
	private int[] anIntArray707;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "([B)V")
	public Class335(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray118 = arg0;
		this.anIntArray708 = new int[local6];
		this.anIntArray707 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray708[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(90) int local90;
				if ((local46 & local42) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local20[local70];
						if (local76 != local46) {
							break;
						}
						local90 = 0x1 << 32 - local70;
						if ((local90 & local76) != 0) {
							local20[local70] = local20[local70 - 1];
							break;
						}
						local20[local70] = local90 | local76;
					}
					local64 = local42 | local46;
				} else {
					local64 = local20[local30 - 1];
				}
				local20[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local20[local70] == local46) {
						local20[local70] = local64;
					}
				}
				local76 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local90;
					if ((local46 & local154) == 0) {
						local76++;
					} else {
						if (this.anIntArray707[local76] == 0) {
							this.anIntArray707[local76] = local22;
						}
						local76 = this.anIntArray707[local76];
					}
					if (local76 >= this.anIntArray707.length) {
						@Pc(198) int[] local198 = new int[this.anIntArray707.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray707.length; local200++) {
							local198[local200] = this.anIntArray707[local200];
						}
						this.anIntArray707 = local198;
					}
				}
				this.anIntArray707[local76] = ~local24;
				if (local76 >= local22) {
					local22 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([BZIII[B)I")
	public int method8168(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg2 << 3;
		while (arg3 < local16) {
			@Pc(28) int local28 = arg4[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray708[local28];
			@Pc(38) byte local38 = this.aByteArray118[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local12 &= -local62 >> 31;
			@Pc(79) int local79 = (local62 + local38 - 1 >> 3) + local58;
			local20 += local38;
			@Pc(84) int local84 = local62 + 24;
			arg0[local58] = (byte) (local12 |= local33 >>> local84);
			if (local79 > local58) {
				local62 = local84 - 8;
				local58++;
				arg0[local58] = (byte) (local12 = local33 >>> local62);
				if (local58 < local79) {
					local58++;
					local62 -= 8;
					arg0[local58] = (byte) (local12 = local33 >>> local62);
					if (local58 < local79) {
						local58++;
						local62 -= 8;
						arg0[local58] = (byte) (local12 = local33 >>> local62);
						if (local79 > local58) {
							local58++;
							local62 -= 8;
							arg0[local58] = (byte) (local12 = local33 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local20 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[BII[B)I")
	public int method8172(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg2;
		@Pc(29) int local29 = arg3;
		while (true) {
			@Pc(33) byte local33 = arg1[local29];
			if (local33 < 0) {
				local23 = this.anIntArray707[local23];
			} else {
				local23++;
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local49;
				if (local27 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(91) int local91;
			if ((local91 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local91;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local129;
				if (local27 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local164;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(196) int local196;
			if ((local196 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local196;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local231;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local267;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray707[local23];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray707[local23]) < 0) {
				arg4[arg0++] = (byte) ~local299;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg3;
	}
}

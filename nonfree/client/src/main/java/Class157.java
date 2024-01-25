import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class157 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "[I")
	private final int[] anIntArray223;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V")
	public Class157(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray223 = new int[local6];
		this.aByteArray33 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray224 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray223[local24] = local46;
				@Pc(126) int local126;
				@Pc(59) int local59;
				@Pc(67) int local67;
				@Pc(81) int local81;
				if ((local42 & local46) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local67 = local16[local59];
						if (local46 != local67) {
							break;
						}
						local81 = 0x1 << 32 - local59;
						if ((local67 & local81) != 0) {
							local16[local59] = local16[local59 - 1];
							break;
						}
						local16[local59] = local67 | local81;
					}
					local126 = local42 | local46;
				} else {
					local126 = local16[local30 - 1];
				}
				local16[local30] = local126;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local46 == local16[local59]) {
						local16[local59] = local126;
					}
				}
				local67 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(175) int local175 = Integer.MIN_VALUE >>> local81;
					if ((local46 & local175) == 0) {
						local67++;
					} else {
						if (this.anIntArray224[local67] == 0) {
							this.anIntArray224[local67] = local22;
						}
						local67 = this.anIntArray224[local67];
					}
					if (this.anIntArray224.length <= local67) {
						@Pc(226) int[] local226 = new int[this.anIntArray224.length * 2];
						for (@Pc(228) int local228 = 0; local228 < this.anIntArray224.length; local228++) {
							local226[local228] = this.anIntArray224[local228];
						}
						this.anIntArray224 = local226;
					}
				}
				if (local22 <= local67) {
					local22 = local67 + 1;
				}
				this.anIntArray224[local67] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[B[BIIB)I")
	public int method4051(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg4;
		@Pc(23) int local23 = arg3 << 3;
		while (arg0 < local19) {
			@Pc(33) int local33 = arg2[arg0] & 0xFF;
			@Pc(38) int local38 = this.anIntArray223[local33];
			@Pc(43) byte local43 = this.aByteArray33[local33];
			if (local43 == 0) {
				throw new RuntimeException("No codeword for data value " + local33);
			}
			@Pc(63) int local63 = local23 >> 3;
			@Pc(67) int local67 = local23 & 0x7;
			local15 &= -local67 >> 31;
			@Pc(84) int local84 = local63 + (local43 + local67 - 1 >> 3);
			local23 += local43;
			@Pc(89) int local89 = local67 + 24;
			arg1[local63] = (byte) (local15 |= local38 >>> local89);
			if (local84 > local63) {
				local63++;
				local67 = local89 - 8;
				arg1[local63] = (byte) (local15 = local38 >>> local67);
				if (local84 > local63) {
					local67 -= 8;
					local63++;
					arg1[local63] = (byte) (local15 = local38 >>> local67);
					if (local63 < local84) {
						local67 -= 8;
						local63++;
						arg1[local63] = (byte) (local15 = local38 >>> local67);
						if (local84 > local63) {
							local67 -= 8;
							local63++;
							arg1[local63] = (byte) (local15 = local38 << -local67);
						}
					}
				}
			}
			arg0++;
		}
		return (local23 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([BBII[BI)I")
	public int method4053(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(17) int local17 = arg1;
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg4;
		while (true) {
			@Pc(33) byte local33 = arg0[local29];
			if (local33 < 0) {
				local19 = this.anIntArray224[local19];
			} else {
				local19++;
			}
			@Pc(58) int local58;
			if ((local58 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local58;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(97) int local97;
			if ((local97 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local97;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(136) int local136;
			if ((local136 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local136;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(182) int local182;
			if ((local182 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local182;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local225;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(261) int local261;
			if ((local261 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local261;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local304;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray224[local19];
			}
			@Pc(347) int local347;
			if ((local347 = this.anIntArray224[local19]) < 0) {
				arg3[arg2++] = (byte) ~local347;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class192 {

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
	private int[] anIntArray479;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray72 = arg0;
		this.anIntArray480 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray479 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local31;
				@Pc(46) int local46 = local16[local31];
				this.anIntArray480[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(78) int local78;
				@Pc(92) int local92;
				if ((local46 & local42) == 0) {
					local61 = local42 | local46;
					for (local71 = local31 - 1; local71 >= 1; local71--) {
						local78 = local16[local71];
						if (local46 != local78) {
							break;
						}
						local92 = 0x1 << 32 - local71;
						if ((local92 & local78) != 0) {
							local16[local71] = local16[local71 - 1];
							break;
						}
						local16[local71] = local78 | local92;
					}
				} else {
					local61 = local16[local31 - 1];
				}
				local16[local31] = local61;
				for (local71 = local31 + 1; local71 <= 32; local71++) {
					if (local46 == local16[local71]) {
						local16[local71] = local61;
					}
				}
				local71 = 0;
				for (local78 = 0; local78 < local31; local78++) {
					local92 = Integer.MIN_VALUE >>> local78;
					if ((local92 & local46) == 0) {
						local71++;
					} else {
						if (this.anIntArray479[local71] == 0) {
							this.anIntArray479[local71] = local22;
						}
						local71 = this.anIntArray479[local71];
					}
					if (this.anIntArray479.length <= local71) {
						@Pc(197) int[] local197 = new int[this.anIntArray479.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray479.length; local199++) {
							local197[local199] = this.anIntArray479[local199];
						}
						this.anIntArray479 = local197;
					}
				}
				if (local71 >= local22) {
					local22 = local71 + 1;
				}
				this.anIntArray479[local71] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[BIII[B)I")
	public int method4610(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(17) int local17 = arg3;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg0;
		while (true) {
			@Pc(25) byte local25 = arg1[local21];
			if (local25 < 0) {
				local19 = this.anIntArray479[local19];
			} else {
				local19++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local42;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local77;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local116;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local161;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local200;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local238;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local273;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray479[local19];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray479[local19]) < 0) {
				arg4[arg2++] = (byte) ~local315;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			local21++;
		}
		return local21 + 1 - arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI[BIII)I")
	public int method4612(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 << 3;
		while (arg4 < local5) {
			@Pc(28) int local28 = arg1[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray480[local28];
			@Pc(38) byte local38 = this.aByteArray72[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(59) int local59 = local15 >> 3;
			@Pc(63) int local63 = local15 & 0x7;
			local11 &= -local63 >> 31;
			local15 += local38;
			@Pc(84) int local84 = local59 + (local38 + local63 - 1 >> 3);
			@Pc(85) int local85 = local63 + 24;
			arg0[local59] = (byte) (local11 |= local33 >>> local85);
			if (local84 > local59) {
				local59++;
				local63 = local85 - 8;
				arg0[local59] = (byte) (local11 = local33 >>> local63);
				if (local84 > local59) {
					local59++;
					local63 -= 8;
					arg0[local59] = (byte) (local11 = local33 >>> local63);
					if (local59 < local84) {
						local59++;
						local63 -= 8;
						arg0[local59] = (byte) (local11 = local33 >>> local63);
						if (local59 < local84) {
							local59++;
							local63 -= 8;
							arg0[local59] = (byte) (local11 = local33 << -local63);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg3;
	}
}

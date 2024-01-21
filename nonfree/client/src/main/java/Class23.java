import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class23 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "[I")
	private final int[] anIntArray96;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
	public Class23(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = arg0.length;
		this.anIntArray96 = new int[local11];
		this.anIntArray97 = new int[8];
		this.aByteArray7 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local6[local30];
				this.anIntArray96[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(87) int local87;
				if ((local46 & local42) == 0) {
					local61 = local42 | local46;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local6[local71];
						if (local77 != local46) {
							break;
						}
						local87 = 0x1 << 32 - local71;
						if ((local87 & local77) != 0) {
							local6[local71] = local6[local71 - 1];
							break;
						}
						local6[local71] = local87 | local77;
					}
				} else {
					local61 = local6[local30 - 1];
				}
				local6[local30] = local61;
				for (local71 = local30 + 1; local71 <= 32; local71++) {
					if (local6[local71] == local46) {
						local6[local71] = local61;
					}
				}
				local77 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local87;
					if ((local153 & local46) == 0) {
						local77++;
					} else {
						if (this.anIntArray97[local77] == 0) {
							this.anIntArray97[local77] = local8;
						}
						local77 = this.anIntArray97[local77];
					}
					if (local77 >= this.anIntArray97.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray97.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray97.length; local192++) {
							local190[local192] = this.anIntArray97[local192];
						}
						this.anIntArray97 = local190;
					}
				}
				if (local8 <= local77) {
					local8 = local77 + 1;
				}
				this.anIntArray97[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([BI[BIZI)I")
	public int method590(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 << 3;
		@Pc(15) int local15 = 0;
		while (arg1 < local9) {
			@Pc(23) int local23 = arg2[arg1] & 0xFF;
			@Pc(28) int local28 = this.anIntArray96[local23];
			@Pc(33) byte local33 = this.aByteArray7[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local13 & 0x7;
			@Pc(57) int local57 = local13 >> 3;
			local15 &= -local53 >> 31;
			local13 += local33;
			@Pc(78) int local78 = (local33 + local53 - 1 >> 3) + local57;
			@Pc(79) int local79 = local53 + 24;
			arg0[local57] = (byte) (local15 |= local28 >>> local79);
			if (local78 > local57) {
				local57++;
				local53 = local79 - 8;
				arg0[local57] = (byte) (local15 = local28 >>> local53);
				if (local78 > local57) {
					local57++;
					local53 -= 8;
					arg0[local57] = (byte) (local15 = local28 >>> local53);
					if (local57 < local78) {
						local57++;
						local53 -= 8;
						arg0[local57] = (byte) (local15 = local28 >>> local53);
						if (local78 > local57) {
							local57++;
							local53 -= 8;
							arg0[local57] = (byte) (local15 = local28 << -local53);
						}
					}
				}
			}
			arg1++;
		}
		return (local13 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[B[BIII)I")
	public int method591(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg2;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(21) byte local21 = arg1[local17];
			if (local21 < 0) {
				local15 = this.anIntArray97[local15];
			} else {
				local15++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local37;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(72) int local72;
			if ((local72 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local72;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(107) int local107;
			if ((local107 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local107;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local149;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local184;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(223) int local223;
			if ((local223 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local223;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local258;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray97[local15];
			}
			@Pc(293) int local293;
			if ((local293 = this.anIntArray97[local15]) < 0) {
				arg0[arg3++] = (byte) ~local293;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}
}

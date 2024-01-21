import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class67 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
	private final int[] anIntArray457;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
	private int[] anIntArray458;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
	public Class67(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		@Pc(11) int local11 = 0;
		this.anIntArray457 = new int[local9];
		this.aByteArray30 = arg0;
		this.anIntArray458 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local6[local30];
				this.anIntArray457[local24] = local46;
				@Pc(61) int local61;
				@Pc(71) int local71;
				@Pc(77) int local77;
				@Pc(86) int local86;
				if ((local46 & local42) == 0) {
					local61 = local42 | local46;
					for (local71 = local30 - 1; local71 >= 1; local71--) {
						local77 = local6[local71];
						if (local77 != local46) {
							break;
						}
						local86 = 0x1 << 32 - local71;
						if ((local86 & local77) != 0) {
							local6[local71] = local6[local71 - 1];
							break;
						}
						local6[local71] = local86 | local77;
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
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local86;
					if ((local151 & local46) == 0) {
						local77++;
					} else {
						if (this.anIntArray458[local77] == 0) {
							this.anIntArray458[local77] = local11;
						}
						local77 = this.anIntArray458[local77];
					}
					if (this.anIntArray458.length <= local77) {
						@Pc(189) int[] local189 = new int[this.anIntArray458.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray458.length; local191++) {
							local189[local191] = this.anIntArray458[local191];
						}
						this.anIntArray458 = local189;
					}
				}
				if (local77 >= local11) {
					local11 = local77 + 1;
				}
				this.anIntArray458[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([B[BIIII)I")
	public int method2313(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 << 3;
		@Pc(15) int local15 = 0;
		while (arg4 < local9) {
			@Pc(23) int local23 = arg0[arg4] & 0xFF;
			@Pc(28) byte local28 = this.aByteArray30[local23];
			@Pc(33) int local33 = this.anIntArray457[local23];
			if (local28 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local13 & 0x7;
			@Pc(57) int local57 = local13 >> 3;
			@Pc(67) int local67 = (local28 + local53 - 1 >> 3) + local57;
			local13 += local28;
			local15 &= -local53 >> 31;
			@Pc(79) int local79 = local53 + 24;
			arg1[local57] = (byte) (local15 |= local33 >>> local79);
			if (local67 > local57) {
				local57++;
				local53 = local79 - 8;
				arg1[local57] = (byte) (local15 = local33 >>> local53);
				if (local57 < local67) {
					local53 -= 8;
					local57++;
					arg1[local57] = (byte) (local15 = local33 >>> local53);
					if (local67 > local57) {
						local57++;
						local53 -= 8;
						arg1[local57] = (byte) (local15 = local33 >>> local53);
						if (local67 > local57) {
							local57++;
							local53 -= 8;
							arg1[local57] = (byte) (local15 = local33 << -local53);
						}
					}
				}
			}
			arg4++;
		}
		return (local13 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIBII[B)I")
	public int method2314(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3;
		@Pc(17) int local17 = arg1;
		while (true) {
			@Pc(21) byte local21 = arg4[local17];
			if (local21 >= 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local37;
				if (local15 <= arg2) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local76;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local108;
				if (local15 <= arg2) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(147) int local147;
			if ((local147 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local147;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local186;
				if (local15 <= arg2) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local221;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local259;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray458[local11];
			}
			@Pc(294) int local294;
			if ((local294 = this.anIntArray458[local11]) < 0) {
				arg0[arg2++] = (byte) ~local294;
				if (arg2 >= local15) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg1;
	}
}

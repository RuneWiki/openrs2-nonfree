import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class183 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	private final int[] anIntArray417;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
	public Class183(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray63 = arg0;
		this.anIntArray417 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray415 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray417[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(84) int local84;
				if ((local39 & local43) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local16[local64];
						if (local43 != local70) {
							break;
						}
						local84 = 0x1 << 32 - local64;
						if ((local70 & local84) != 0) {
							local16[local64] = local16[local64 - 1];
							break;
						}
						local16[local64] = local70 | local84;
					}
					local58 = local43 | local39;
				} else {
					local58 = local16[local30 - 1];
				}
				local16[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local16[local64] == local43) {
						local16[local64] = local58;
					}
				}
				local70 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local84;
					if ((local43 & local151) == 0) {
						local70++;
					} else {
						if (this.anIntArray415[local70] == 0) {
							this.anIntArray415[local70] = local22;
						}
						local70 = this.anIntArray415[local70];
					}
					if (this.anIntArray415.length <= local70) {
						@Pc(193) int[] local193 = new int[this.anIntArray415.length * 2];
						for (@Pc(195) int local195 = 0; local195 < this.anIntArray415.length; local195++) {
							local193[local195] = this.anIntArray415[local195];
						}
						this.anIntArray415 = local193;
					}
				}
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
				this.anIntArray415[local70] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BI[BII)I")
	public int method4216(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg4;
		@Pc(20) int local20 = arg3 << 3;
		while (local16 > arg1) {
			@Pc(28) int local28 = arg2[arg1] & 0xFF;
			@Pc(33) int local33 = this.anIntArray417[local28];
			@Pc(38) byte local38 = this.aByteArray63[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local12 &= -local62 >> 31;
			@Pc(79) int local79 = (local38 + local62 - 1 >> 3) + local58;
			@Pc(80) int local80 = local62 + 24;
			arg0[local58] = (byte) (local12 |= local33 >>> local80);
			if (local79 > local58) {
				local62 = local80 - 8;
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
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg0[local58] = (byte) (local12 = local33 << -local62);
						}
					}
				}
			}
			local20 += local38;
			arg1++;
		}
		return (local20 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BZII[B)I")
	public int method4218(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2;
		@Pc(22) int local22 = arg0;
		while (true) {
			@Pc(26) byte local26 = arg4[local22];
			if (local26 < 0) {
				local11 = this.anIntArray415[local11];
			} else {
				local11++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local42;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local84;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local123;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local158;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local193;
				if (local15 <= arg3) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(228) int local228;
			if ((local228 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local228;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local263;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray415[local11];
			}
			@Pc(301) int local301;
			if ((local301 = this.anIntArray415[local11]) < 0) {
				arg1[arg3++] = (byte) ~local301;
				if (arg3 >= local15) {
					break;
				}
				local11 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg0;
	}
}

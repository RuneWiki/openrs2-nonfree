import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class102 {

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!eka", name = "g", descriptor = "[I")
	private final int[] anIntArray188;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "([B)V")
	public Class102(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray28 = arg0;
		this.anIntArray188 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray189 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray188[local24] = local46;
				@Pc(122) int local122;
				@Pc(62) int local62;
				@Pc(70) int local70;
				@Pc(82) int local82;
				if ((local46 & local42) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local70 = local16[local62];
						if (local46 != local70) {
							break;
						}
						local82 = 0x1 << 32 - local62;
						if ((local82 & local70) != 0) {
							local16[local62] = local16[local62 - 1];
							break;
						}
						local16[local62] = local70 | local82;
					}
					local122 = local46 | local42;
				} else {
					local122 = local16[local30 - 1];
				}
				local16[local30] = local122;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local16[local62] == local46) {
						local16[local62] = local122;
					}
				}
				local70 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(177) int local177 = Integer.MIN_VALUE >>> local82;
					if ((local177 & local46) == 0) {
						local70++;
					} else {
						if (this.anIntArray189[local70] == 0) {
							this.anIntArray189[local70] = local22;
						}
						local70 = this.anIntArray189[local70];
					}
					if (local70 >= this.anIntArray189.length) {
						@Pc(221) int[] local221 = new int[this.anIntArray189.length * 2];
						for (@Pc(223) int local223 = 0; local223 < this.anIntArray189.length; local223++) {
							local221[local223] = this.anIntArray189[local223];
						}
						this.anIntArray189 = local221;
					}
				}
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
				this.anIntArray189[local70] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I[BI[BII)I")
	public int method2146(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		@Pc(15) int local15 = arg0;
		while (arg2 < local15) {
			@Pc(27) int local27 = arg3[arg2] & 0xFF;
			@Pc(32) int local32 = this.anIntArray188[local27];
			@Pc(37) byte local37 = this.aByteArray28[local27];
			if (local37 == 0) {
				throw new RuntimeException("No codeword for data value " + local27);
			}
			@Pc(57) int local57 = local11 >> 3;
			@Pc(61) int local61 = local11 & 0x7;
			local7 &= -local61 >> 31;
			@Pc(79) int local79 = local57 + (local61 + local37 - 1 >> 3);
			@Pc(80) int local80 = local61 + 24;
			arg1[local57] = (byte) (local7 |= local32 >>> local80);
			if (local79 > local57) {
				local61 = local80 - 8;
				local57++;
				arg1[local57] = (byte) (local7 = local32 >>> local61);
				if (local57 < local79) {
					local57++;
					local61 -= 8;
					arg1[local57] = (byte) (local7 = local32 >>> local61);
					if (local57 < local79) {
						local61 -= 8;
						local57++;
						arg1[local57] = (byte) (local7 = local32 >>> local61);
						if (local57 < local79) {
							local57++;
							local61 -= 8;
							arg1[local57] = (byte) (local7 = local32 << -local61);
						}
					}
				}
			}
			local11 += local37;
			arg2++;
		}
		return (local11 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "([BII[BII)I")
	public int method2147(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2;
		@Pc(21) int local21 = arg1;
		while (true) {
			@Pc(25) byte local25 = arg3[local21];
			if (local25 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local48;
				if (local19 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local87;
				if (arg4 >= local19) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local126;
				if (local19 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local165;
				if (local19 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(207) int local207;
			if ((local207 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local207;
				if (local19 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(253) int local253;
			if ((local253 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local253;
				if (local19 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(295) int local295;
			if ((local295 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local295;
				if (arg4 >= local19) {
					break;
				}
				local15 = 0;
			}
			if ((local25 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray189[local15];
			}
			@Pc(335) int local335;
			if ((local335 = this.anIntArray189[local15]) < 0) {
				arg0[arg4++] = (byte) ~local335;
				if (arg4 >= local19) {
					break;
				}
				local15 = 0;
			}
			local21++;
		}
		return local21 + 1 - arg1;
	}
}

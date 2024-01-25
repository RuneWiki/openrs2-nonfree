import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class79 {

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "[B")
	private final byte[] aByteArray16;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "[I")
	private final int[] anIntArray118;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "([B)V")
	public Class79(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray16 = arg0;
		this.anIntArray118 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray119 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray118[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(89) int local89;
				if ((local43 & local39) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local16[local67];
						if (local73 != local43) {
							break;
						}
						local89 = 0x1 << 32 - local67;
						if ((local73 & local89) != 0) {
							local16[local67] = local16[local67 - 1];
							break;
						}
						local16[local67] = local89 | local73;
					}
					local61 = local43 | local39;
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local16[local67] == local43) {
						local16[local67] = local61;
					}
				}
				local73 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local89;
					if ((local43 & local156) == 0) {
						local73++;
					} else {
						if (this.anIntArray119[local73] == 0) {
							this.anIntArray119[local73] = local22;
						}
						local73 = this.anIntArray119[local73];
					}
					if (this.anIntArray119.length <= local73) {
						@Pc(198) int[] local198 = new int[this.anIntArray119.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray119.length; local200++) {
							local198[local200] = this.anIntArray119[local200];
						}
						this.anIntArray119 = local198;
					}
				}
				this.anIntArray119[local73] = ~local24;
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[BI[BII)I")
	public int method1935(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg2;
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg0;
		while (true) {
			@Pc(27) byte local27 = arg3[local23];
			if (local27 < 0) {
				local15 = this.anIntArray119[local15];
			} else {
				local15++;
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local46;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(85) int local85;
			if ((local85 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local85;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(120) int local120;
			if ((local120 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local120;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local156;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local194;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local226;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local264;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray119[local15];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray119[local15]) < 0) {
				arg1[arg4++] = (byte) ~local306;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[BI[BIB)I")
	public int method1937(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg2 << 3;
		while (local11 > arg4) {
			@Pc(23) int local23 = arg1[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray118[local23];
			@Pc(33) byte local33 = this.aByteArray16[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 >> 3;
			@Pc(57) int local57 = local15 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(75) int local75 = (local57 + local33 - 1 >> 3) + local53;
			local15 += local33;
			@Pc(80) int local80 = local57 + 24;
			arg3[local53] = (byte) (local7 |= local28 >>> local80);
			if (local75 > local53) {
				local57 = local80 - 8;
				local53++;
				arg3[local53] = (byte) (local7 = local28 >>> local57);
				if (local53 < local75) {
					local57 -= 8;
					local53++;
					arg3[local53] = (byte) (local7 = local28 >>> local57);
					if (local53 < local75) {
						local57 -= 8;
						local53++;
						arg3[local53] = (byte) (local7 = local28 >>> local57);
						if (local53 < local75) {
							local53++;
							local57 -= 8;
							arg3[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg2;
	}
}

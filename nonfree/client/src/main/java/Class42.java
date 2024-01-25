import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class42 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[I")
	private final int[] anIntArray213;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "([B)V")
	public Class42(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray213 = new int[local6];
		this.aByteArray13 = arg0;
		this.anIntArray214 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray213[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(84) int local84;
				if ((local39 & local43) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local43 != local73) {
							break;
						}
						local84 = 0x1 << 32 - local67;
						if ((local73 & local84) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local73 | local84;
					}
					local61 = local43 | local39;
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local20[local67] == local43) {
						local20[local67] = local61;
					}
				}
				local73 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local84;
					if ((local43 & local153) == 0) {
						local73++;
					} else {
						if (this.anIntArray214[local73] == 0) {
							this.anIntArray214[local73] = local22;
						}
						local73 = this.anIntArray214[local73];
					}
					if (local73 >= this.anIntArray214.length) {
						@Pc(201) int[] local201 = new int[this.anIntArray214.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray214.length; local203++) {
							local201[local203] = this.anIntArray214[local203];
						}
						this.anIntArray214 = local201;
					}
				}
				if (local73 >= local22) {
					local22 = local73 + 1;
				}
				this.anIntArray214[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BI[BII)I")
	public int method873(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg4;
		while (local15 > arg3) {
			@Pc(23) int local23 = arg0[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray213[local23];
			@Pc(33) byte local33 = this.aByteArray13[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local11 >> 3;
			@Pc(57) int local57 = local11 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(75) int local75 = local53 + (local57 + local33 - 1 >> 3);
			local11 += local33;
			@Pc(80) int local80 = local57 + 24;
			arg2[local53] = (byte) (local7 |= local28 >>> local80);
			if (local53 < local75) {
				local53++;
				local57 = local80 - 8;
				arg2[local53] = (byte) (local7 = local28 >>> local57);
				if (local75 > local53) {
					local57 -= 8;
					local53++;
					arg2[local53] = (byte) (local7 = local28 >>> local57);
					if (local75 > local53) {
						local53++;
						local57 -= 8;
						arg2[local53] = (byte) (local7 = local28 >>> local57);
						if (local75 > local53) {
							local53++;
							local57 -= 8;
							arg2[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			arg3++;
		}
		return (local11 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI[BI)I")
	public int method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg1;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local48;
				if (local16 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local86;
				if (local16 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local124;
				if (arg0 >= local16) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(166) int local166;
			if ((local166 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local166;
				if (local16 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(208) int local208;
			if ((local208 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local208;
				if (local16 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(243) int local243;
			if ((local243 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local243;
				if (arg0 >= local16) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(278) int local278;
			if ((local278 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local278;
				if (arg0 >= local16) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray214[local23];
			}
			@Pc(313) int local313;
			if ((local313 = this.anIntArray214[local23]) < 0) {
				arg4[arg0++] = (byte) ~local313;
				if (local16 <= arg0) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class77 {

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "[I")
	private final int[] anIntArray89;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([B)V")
	public Class77(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray89 = new int[local6];
		this.aByteArray43 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray88 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray89[local24] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(82) int local82;
				if ((local39 & local43) == 0) {
					local56 = local43 | local39;
					for (local60 = local30 - 1; local60 >= 1; local60--) {
						local66 = local16[local60];
						if (local43 != local66) {
							break;
						}
						local82 = 0x1 << 32 - local60;
						if ((local66 & local82) != 0) {
							local16[local60] = local16[local60 - 1];
							break;
						}
						local16[local60] = local82 | local66;
					}
				} else {
					local56 = local16[local30 - 1];
				}
				local16[local30] = local56;
				for (local60 = local30 + 1; local60 <= 32; local60++) {
					if (local16[local60] == local43) {
						local16[local60] = local56;
					}
				}
				local66 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(152) int local152 = Integer.MIN_VALUE >>> local82;
					if ((local43 & local152) == 0) {
						local66++;
					} else {
						if (this.anIntArray88[local66] == 0) {
							this.anIntArray88[local66] = local22;
						}
						local66 = this.anIntArray88[local66];
					}
					if (this.anIntArray88.length <= local66) {
						@Pc(190) int[] local190 = new int[this.anIntArray88.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray88.length; local192++) {
							local190[local192] = this.anIntArray88[local192];
						}
						this.anIntArray88 = local190;
					}
				}
				if (local22 <= local66) {
					local22 = local66 + 1;
				}
				this.anIntArray88[local66] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIB[B[BI)I")
	public int method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0;
		@Pc(29) int local29 = arg4;
		while (true) {
			@Pc(33) byte local33 = arg2[local29];
			if (local33 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local52;
				if (arg1 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local84;
				if (arg1 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local119;
				if (local27 <= arg1) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local158;
				if (arg1 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(196) int local196;
			if ((local196 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local196;
				if (local27 <= arg1) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local231;
				if (arg1 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local273;
				if (arg1 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray88[local23];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray88[local23]) < 0) {
				arg3[arg1++] = (byte) ~local315;
				if (arg1 >= local27) {
					break;
				}
				local23 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg4;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II[BI[BI)I")
	public int method2197(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(15) int local15 = arg0 << 3;
		while (arg2 < local11) {
			@Pc(29) int local29 = arg1[arg2] & 0xFF;
			@Pc(34) int local34 = this.anIntArray89[local29];
			@Pc(39) byte local39 = this.aByteArray43[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local15 >> 3;
			@Pc(63) int local63 = local15 & 0x7;
			local7 &= -local63 >> 31;
			@Pc(80) int local80 = local59 + (local39 + local63 - 1 >> 3);
			@Pc(81) int local81 = local63 + 24;
			arg3[local59] = (byte) (local7 |= local34 >>> local81);
			if (local59 < local80) {
				local63 = local81 - 8;
				local59++;
				arg3[local59] = (byte) (local7 = local34 >>> local63);
				if (local80 > local59) {
					local63 -= 8;
					local59++;
					arg3[local59] = (byte) (local7 = local34 >>> local63);
					if (local59 < local80) {
						local63 -= 8;
						local59++;
						arg3[local59] = (byte) (local7 = local34 >>> local63);
						if (local59 < local80) {
							local59++;
							local63 -= 8;
							arg3[local59] = (byte) (local7 = local34 << -local63);
						}
					}
				}
			}
			local15 += local39;
			arg2++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}

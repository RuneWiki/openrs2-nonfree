import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class283 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[B")
	private final byte[] aByteArray98;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
	private final int[] anIntArray635;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private int[] anIntArray636;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
	public Class283(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.aByteArray98 = arg0;
		this.anIntArray635 = new int[local4];
		this.anIntArray636 = new int[8];
		@Pc(18) int[] local18 = new int[33];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(27) byte local27 = arg0[local22];
			if (local27 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local27;
				@Pc(43) int local43 = local18[local27];
				this.anIntArray635[local22] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(65) int local65;
				@Pc(79) int local79;
				if ((local39 & local43) == 0) {
					local56 = local39 | local43;
					for (local60 = local27 - 1; local60 >= 1; local60--) {
						local65 = local18[local60];
						if (local43 != local65) {
							break;
						}
						local79 = 0x1 << 32 - local60;
						if ((local79 & local65) != 0) {
							local18[local60] = local18[local60 - 1];
							break;
						}
						local18[local60] = local79 | local65;
					}
				} else {
					local56 = local18[local27 - 1];
				}
				local18[local27] = local56;
				for (local60 = local27 + 1; local60 <= 32; local60++) {
					if (local43 == local18[local60]) {
						local18[local60] = local56;
					}
				}
				local65 = 0;
				for (local79 = 0; local79 < local27; local79++) {
					@Pc(145) int local145 = Integer.MIN_VALUE >>> local79;
					if ((local145 & local43) == 0) {
						local65++;
					} else {
						if (this.anIntArray636[local65] == 0) {
							this.anIntArray636[local65] = local20;
						}
						local65 = this.anIntArray636[local65];
					}
					if (this.anIntArray636.length <= local65) {
						@Pc(185) int[] local185 = new int[this.anIntArray636.length * 2];
						for (@Pc(187) int local187 = 0; local187 < this.anIntArray636.length; local187++) {
							local185[local187] = this.anIntArray636[local187];
						}
						this.anIntArray636 = local185;
					}
				}
				if (local65 >= local20) {
					local20 = local65 + 1;
				}
				this.anIntArray636[local65] = ~local22;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZ[B[B)I")
	public int method6932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg2 << 3;
		@Pc(13) int local13 = arg1;
		while (local13 > arg0) {
			@Pc(20) int local20 = arg3[arg0] & 0xFF;
			@Pc(25) int local25 = this.anIntArray635[local20];
			@Pc(30) byte local30 = this.aByteArray98[local20];
			if (local30 == 0) {
				throw new RuntimeException("No codeword for data value " + local20);
			}
			@Pc(47) int local47 = local9 >> 3;
			@Pc(51) int local51 = local9 & 0x7;
			local5 &= -local51 >> 31;
			@Pc(68) int local68 = local47 + (local30 + local51 - 1 >> 3);
			@Pc(69) int local69 = local51 + 24;
			arg4[local47] = (byte) (local5 |= local25 >>> local69);
			if (local68 > local47) {
				local47++;
				local51 = local69 - 8;
				arg4[local47] = (byte) (local5 = local25 >>> local51);
				if (local47 < local68) {
					local51 -= 8;
					local47++;
					arg4[local47] = (byte) (local5 = local25 >>> local51);
					if (local68 > local47) {
						local47++;
						local51 -= 8;
						arg4[local47] = (byte) (local5 = local25 >>> local51);
						if (local47 < local68) {
							local51 -= 8;
							local47++;
							arg4[local47] = (byte) (local5 = local25 << -local51);
						}
					}
				}
			}
			local9 += local30;
			arg0++;
		}
		return (local9 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ[BI[BI)I")
	public int method6934(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(14) int local14 = arg0;
		@Pc(16) int local16 = 0;
		@Pc(30) int local30 = arg4;
		while (true) {
			@Pc(34) byte local34 = arg3[local30];
			if (local34 < 0) {
				local16 = this.anIntArray636[local16];
			} else {
				local16++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local52;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local90;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(128) int local128;
			if ((local128 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local128;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(166) int local166;
			if ((local166 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local166;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(204) int local204;
			if ((local204 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local204;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local242;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(280) int local280;
			if ((local280 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local280;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local34 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray636[local16];
			}
			@Pc(318) int local318;
			if ((local318 = this.anIntArray636[local16]) < 0) {
				arg1[arg2++] = (byte) ~local318;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			local30++;
		}
		return local30 + 1 - arg4;
	}
}

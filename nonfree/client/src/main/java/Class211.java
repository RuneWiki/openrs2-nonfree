import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class211 {

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
	private final int[] anIntArray319;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V")
	public Class211(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.aByteArray59 = arg0;
		this.anIntArray319 = new int[local4];
		this.anIntArray320 = new int[8];
		@Pc(18) int[] local18 = new int[33];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(27) byte local27 = arg0[local22];
			if (local27 != 0) {
				@Pc(36) int local36 = 0x1 << 32 - local27;
				@Pc(40) int local40 = local18[local27];
				this.anIntArray319[local22] = local40;
				@Pc(102) int local102;
				@Pc(56) int local56;
				@Pc(61) int local61;
				@Pc(71) int local71;
				if ((local40 & local36) == 0) {
					for (local56 = local27 - 1; local56 >= 1; local56--) {
						local61 = local18[local56];
						if (local61 != local40) {
							break;
						}
						local71 = 0x1 << 32 - local56;
						if ((local71 & local61) != 0) {
							local18[local56] = local18[local56 - 1];
							break;
						}
						local18[local56] = local61 | local71;
					}
					local102 = local36 | local40;
				} else {
					local102 = local18[local27 - 1];
				}
				local18[local27] = local102;
				for (local56 = local27 + 1; local56 <= 32; local56++) {
					if (local40 == local18[local56]) {
						local18[local56] = local102;
					}
				}
				local61 = 0;
				for (local71 = 0; local71 < local27; local71++) {
					@Pc(144) int local144 = Integer.MIN_VALUE >>> local71;
					if ((local144 & local40) == 0) {
						local61++;
					} else {
						if (this.anIntArray320[local61] == 0) {
							this.anIntArray320[local61] = local20;
						}
						local61 = this.anIntArray320[local61];
					}
					if (local61 >= this.anIntArray320.length) {
						@Pc(187) int[] local187 = new int[this.anIntArray320.length * 2];
						for (@Pc(189) int local189 = 0; local189 < this.anIntArray320.length; local189++) {
							local187[local189] = this.anIntArray320[local189];
						}
						this.anIntArray320 = local187;
					}
				}
				this.anIntArray320[local61] = ~local22;
				if (local20 <= local61) {
					local20 = local61 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BIB[BI)I")
	public int method5090(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg2 << 3;
		@Pc(13) int local13 = arg0;
		while (arg4 < local13) {
			@Pc(25) int local25 = arg1[arg4] & 0xFF;
			@Pc(30) int local30 = this.anIntArray319[local25];
			@Pc(35) byte local35 = this.aByteArray59[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(52) int local52 = local9 >> 3;
			@Pc(56) int local56 = local9 & 0x7;
			local5 &= -local56 >> 31;
			@Pc(73) int local73 = (local35 + local56 - 1 >> 3) + local52;
			local9 += local35;
			@Pc(78) int local78 = local56 + 24;
			arg3[local52] = (byte) (local5 |= local30 >>> local78);
			if (local52 < local73) {
				local56 = local78 - 8;
				local52++;
				arg3[local52] = (byte) (local5 = local30 >>> local56);
				if (local52 < local73) {
					local52++;
					local56 -= 8;
					arg3[local52] = (byte) (local5 = local30 >>> local56);
					if (local52 < local73) {
						local56 -= 8;
						local52++;
						arg3[local52] = (byte) (local5 = local30 >>> local56);
						if (local52 < local73) {
							local56 -= 8;
							local52++;
							arg3[local52] = (byte) (local5 = local30 << -local56);
						}
					}
				}
			}
			arg4++;
		}
		return (local9 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BII[BI)I")
	public int method5093(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(21) int local21 = arg2;
		@Pc(23) int local23 = arg1;
		while (true) {
			@Pc(27) byte local27 = arg0[local23];
			if (local27 < 0) {
				local12 = this.anIntArray320[local12];
			} else {
				local12++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local42;
				if (arg4 >= local21) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local76;
				if (local21 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(110) int local110;
			if ((local110 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local110;
				if (arg4 >= local21) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local148;
				if (local21 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(183) int local183;
			if ((local183 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local183;
				if (arg4 >= local21) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local214;
				if (local21 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(248) int local248;
			if ((local248 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local248;
				if (local21 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray320[local12];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray320[local12]) < 0) {
				arg3[arg4++] = (byte) ~local279;
				if (local21 <= arg4) {
					break;
				}
				local12 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg1;
	}
}

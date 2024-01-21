import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class19 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
	private final int[] anIntArray98;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "([B)V")
	public Class19(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = arg0.length;
		this.aByteArray1 = arg0;
		this.anIntArray98 = new int[local11];
		this.anIntArray100 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local6[local30];
				this.anIntArray98[local24] = local42;
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(77) int local77;
				if ((local38 & local42) == 0) {
					local55 = local38 | local42;
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local6[local59];
						if (local65 != local42) {
							break;
						}
						local77 = 0x1 << 32 - local59;
						if ((local65 & local77) != 0) {
							local6[local59] = local6[local59 - 1];
							break;
						}
						local6[local59] = local77 | local65;
					}
				} else {
					local55 = local6[local30 - 1];
				}
				local6[local30] = local55;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local6[local59] == local42) {
						local6[local59] = local55;
					}
				}
				local65 = 0;
				for (local77 = 0; local77 < local30; local77++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local77;
					if ((local42 & local146) == 0) {
						local65++;
					} else {
						if (this.anIntArray100[local65] == 0) {
							this.anIntArray100[local65] = local8;
						}
						local65 = this.anIntArray100[local65];
					}
					if (local65 >= this.anIntArray100.length) {
						@Pc(180) int[] local180 = new int[this.anIntArray100.length * 2];
						for (@Pc(182) int local182 = 0; local182 < this.anIntArray100.length; local182++) {
							local180[local182] = this.anIntArray100[local182];
						}
						this.anIntArray100 = local180;
					}
				}
				if (local65 >= local8) {
					local8 = local65 + 1;
				}
				this.anIntArray100[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[BI[BI)I")
	public int method517(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg2;
		@Pc(13) int local13 = arg0 << 3;
		while (local5 > arg4) {
			@Pc(24) int local24 = arg1[arg4] & 0xFF;
			@Pc(29) byte local29 = this.aByteArray1[local24];
			@Pc(34) int local34 = this.anIntArray98[local24];
			if (local29 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local13 >> 3;
			@Pc(58) int local58 = local13 & 0x7;
			local13 += local29;
			local1 &= -local58 >> 31;
			@Pc(81) int local81 = local54 + (local58 + local29 - 1 >> 3);
			@Pc(82) int local82 = local58 + 24;
			arg3[local54] = (byte) (local1 |= local34 >>> local82);
			if (local81 > local54) {
				local58 = local82 - 8;
				local54++;
				arg3[local54] = (byte) (local1 = local34 >>> local58);
				if (local54 < local81) {
					local58 -= 8;
					local54++;
					arg3[local54] = (byte) (local1 = local34 >>> local58);
					if (local81 > local54) {
						local58 -= 8;
						local54++;
						arg3[local54] = (byte) (local1 = local34 >>> local58);
						if (local54 < local81) {
							local58 -= 8;
							local54++;
							arg3[local54] = (byte) (local1 = local34 << -local58);
						}
					}
				}
			}
			arg4++;
		}
		return (local13 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII[B[B)I")
	public int method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		while (true) {
			@Pc(21) byte local21 = arg3[local17];
			if (local21 < 0) {
				local15 = this.anIntArray100[local15];
			} else {
				local15++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local37;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local76;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local115;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local157;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(195) int local195;
			if ((local195 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local195;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local227;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local263;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray100[local15];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray100[local15]) < 0) {
				arg4[arg1++] = (byte) ~local299;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg2;
	}
}

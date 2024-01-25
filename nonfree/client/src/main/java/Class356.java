import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class356 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[B")
	private final byte[] aByteArray100;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "[I")
	private final int[] anIntArray718;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
	private int[] anIntArray719;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V")
	public Class356(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray100 = arg0;
		this.anIntArray718 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray719 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local16[local30];
				this.anIntArray718[local24] = local45;
				@Pc(61) int local61;
				@Pc(65) int local65;
				@Pc(71) int local71;
				@Pc(81) int local81;
				if ((local45 & local41) == 0) {
					local61 = local41 | local45;
					for (local65 = local30 - 1; local65 >= 1; local65--) {
						local71 = local16[local65];
						if (local45 != local71) {
							break;
						}
						local81 = 0x1 << 32 - local65;
						if ((local81 & local71) != 0) {
							local16[local65] = local16[local65 - 1];
							break;
						}
						local16[local65] = local81 | local71;
					}
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local65 = local30 + 1; local65 <= 32; local65++) {
					if (local45 == local16[local65]) {
						local16[local65] = local61;
					}
				}
				local71 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local81;
					if ((local45 & local154) == 0) {
						local71++;
					} else {
						if (this.anIntArray719[local71] == 0) {
							this.anIntArray719[local71] = local22;
						}
						local71 = this.anIntArray719[local71];
					}
					if (local71 >= this.anIntArray719.length) {
						@Pc(198) int[] local198 = new int[this.anIntArray719.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray719.length; local200++) {
							local198[local200] = this.anIntArray719[local200];
						}
						this.anIntArray719 = local198;
					}
				}
				this.anIntArray719[local71] = ~local24;
				if (local22 <= local71) {
					local22 = local71 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II[BII[B)I")
	public int method7732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg3 << 3;
		while (local11 > arg0) {
			@Pc(31) int local31 = arg2[arg0] & 0xFF;
			@Pc(36) int local36 = this.anIntArray718[local31];
			@Pc(41) byte local41 = this.aByteArray100[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(61) int local61 = local15 >> 3;
			@Pc(65) int local65 = local15 & 0x7;
			local7 &= -local65 >> 31;
			@Pc(83) int local83 = (local65 + local41 - 1 >> 3) + local61;
			local15 += local41;
			@Pc(88) int local88 = local65 + 24;
			arg4[local61] = (byte) (local7 |= local36 >>> local88);
			if (local61 < local83) {
				local61++;
				local65 = local88 - 8;
				arg4[local61] = (byte) (local7 = local36 >>> local65);
				if (local83 > local61) {
					local65 -= 8;
					local61++;
					arg4[local61] = (byte) (local7 = local36 >>> local65);
					if (local83 > local61) {
						local61++;
						local65 -= 8;
						arg4[local61] = (byte) (local7 = local36 >>> local65);
						if (local83 > local61) {
							local65 -= 8;
							local61++;
							arg4[local61] = (byte) (local7 = local36 << -local65);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BI[BIII)I")
	public int method7736(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3;
		@Pc(17) int local17 = arg2;
		while (true) {
			@Pc(21) byte local21 = arg1[local17];
			if (local21 >= 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local40;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local78;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local113;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local152;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local194;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local232;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local267;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray719[local11];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray719[local11]) < 0) {
				arg0[arg4++] = (byte) ~local309;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg2;
	}
}

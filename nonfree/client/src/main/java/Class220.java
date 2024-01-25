import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class220 {

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
	private final int[] anIntArray648;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
	private int[] anIntArray650;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class220(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray648 = new int[local6];
		this.aByteArray82 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray650 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray648[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(82) int local82;
				if ((local43 & local39) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local16[local64];
						if (local43 != local70) {
							break;
						}
						local82 = 0x1 << 32 - local64;
						if ((local70 & local82) != 0) {
							local16[local64] = local16[local64 - 1];
							break;
						}
						local16[local64] = local70 | local82;
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
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local82;
					if ((local43 & local147) == 0) {
						local70++;
					} else {
						if (this.anIntArray650[local70] == 0) {
							this.anIntArray650[local70] = local22;
						}
						local70 = this.anIntArray650[local70];
					}
					if (local70 >= this.anIntArray650.length) {
						@Pc(185) int[] local185 = new int[this.anIntArray650.length * 2];
						for (@Pc(187) int local187 = 0; local187 < this.anIntArray650.length; local187++) {
							local185[local187] = this.anIntArray650[local187];
						}
						this.anIntArray650 = local185;
					}
				}
				this.anIntArray650[local70] = ~local24;
				if (local22 <= local70) {
					local22 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[BBI)I")
	public int method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg0;
		@Pc(25) int local25 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg3[local25];
			if (local29 < 0) {
				local19 = this.anIntArray650[local19];
			} else {
				local19++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local48;
				if (arg1 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local87;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local122;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local158;
				if (arg1 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local197;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local232;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local264;
				if (arg1 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray650[local19];
			}
			@Pc(300) int local300;
			if ((local300 = this.anIntArray650[local19]) < 0) {
				arg2[arg1++] = (byte) ~local300;
				if (local23 <= arg1) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg4;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[BIII[B)I")
	public int method4813(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg2 << 3;
		while (arg0 < local16) {
			@Pc(28) int local28 = arg4[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray648[local28];
			@Pc(38) byte local38 = this.aByteArray82[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local20 >> 3;
			@Pc(59) int local59 = local20 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(77) int local77 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(78) int local78 = local59 + 24;
			arg1[local55] = (byte) (local12 |= local33 >>> local78);
			if (local77 > local55) {
				local59 = local78 - 8;
				local55++;
				arg1[local55] = (byte) (local12 = local33 >>> local59);
				if (local55 < local77) {
					local55++;
					local59 -= 8;
					arg1[local55] = (byte) (local12 = local33 >>> local59);
					if (local55 < local77) {
						local55++;
						local59 -= 8;
						arg1[local55] = (byte) (local12 = local33 >>> local59);
						if (local55 < local77) {
							local59 -= 8;
							local55++;
							arg1[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local20 += local38;
			arg0++;
		}
		return (local20 + 7 >> 3) - arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class30 {

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
	private final int[] anIntArray80;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class30(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray9 = arg0;
		this.anIntArray79 = new int[8];
		this.anIntArray80 = new int[local6];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray80[local24] = local43;
				@Pc(107) int local107;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(74) int local74;
				if ((local43 & local39) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local43 != local65) {
							break;
						}
						local74 = 0x1 << 32 - local59;
						if ((local74 & local65) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local65 | local74;
					}
					local107 = local39 | local43;
				} else {
					local107 = local20[local30 - 1];
				}
				local20[local30] = local107;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local43 == local20[local59]) {
						local20[local59] = local107;
					}
				}
				local65 = 0;
				for (local74 = 0; local74 < local30; local74++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local74;
					if ((local43 & local150) == 0) {
						local65++;
					} else {
						if (this.anIntArray79[local65] == 0) {
							this.anIntArray79[local65] = local22;
						}
						local65 = this.anIntArray79[local65];
					}
					if (local65 >= this.anIntArray79.length) {
						@Pc(191) int[] local191 = new int[this.anIntArray79.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray79.length; local193++) {
							local191[local193] = this.anIntArray79[local193];
						}
						this.anIntArray79 = local191;
					}
				}
				this.anIntArray79[local65] = ~local24;
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIIB[B)I")
	public int method672(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg0[local17];
			if (local29 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local45;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local80;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local116;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local158;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local193;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local225;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local260;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray79[local15];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray79[local15]) < 0) {
				arg4[arg1++] = (byte) ~local302;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIII[BI)I")
	public int method674(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg2;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg4 << 3;
		while (local13 > arg1) {
			@Pc(31) int local31 = arg3[arg1] & 0xFF;
			@Pc(36) int local36 = this.anIntArray80[local31];
			@Pc(41) byte local41 = this.aByteArray9[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(58) int local58 = local23 >> 3;
			@Pc(62) int local62 = local23 & 0x7;
			local23 += local41;
			@Pc(78) int local78 = local58 + (local62 + local41 - 1 >> 3);
			local19 &= -local62 >> 31;
			@Pc(86) int local86 = local62 + 24;
			arg0[local58] = (byte) (local19 |= local36 >>> local86);
			if (local78 > local58) {
				local62 = local86 - 8;
				local58++;
				arg0[local58] = (byte) (local19 = local36 >>> local62);
				if (local58 < local78) {
					local58++;
					local62 -= 8;
					arg0[local58] = (byte) (local19 = local36 >>> local62);
					if (local78 > local58) {
						local58++;
						local62 -= 8;
						arg0[local58] = (byte) (local19 = local36 >>> local62);
						if (local78 > local58) {
							local62 -= 8;
							local58++;
							arg0[local58] = (byte) (local19 = local36 << -local62);
						}
					}
				}
			}
			arg1++;
		}
		return (local23 + 7 >> 3) - arg4;
	}
}

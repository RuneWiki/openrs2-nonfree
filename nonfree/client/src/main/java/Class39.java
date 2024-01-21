import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class39 {

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	private final int[] anIntArray168;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class39(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray168 = new int[local6];
		this.anIntArray167 = new int[8];
		@Pc(16) int local16 = 0;
		@Pc(19) int[] local19 = new int[33];
		this.aByteArray8 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local19[local30];
				this.anIntArray168[local24] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(78) int local78;
				if ((local43 & local39) == 0) {
					local56 = local43 | local39;
					for (local60 = local30 - 1; local60 >= 1; local60--) {
						local66 = local19[local60];
						if (local43 != local66) {
							break;
						}
						local78 = 0x1 << 32 - local60;
						if ((local78 & local66) != 0) {
							local19[local60] = local19[local60 - 1];
							break;
						}
						local19[local60] = local66 | local78;
					}
				} else {
					local56 = local19[local30 - 1];
				}
				local19[local30] = local56;
				for (local60 = local30 + 1; local60 <= 32; local60++) {
					if (local43 == local19[local60]) {
						local19[local60] = local56;
					}
				}
				local66 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local78;
					if ((local43 & local149) == 0) {
						local66++;
					} else {
						if (this.anIntArray167[local66] == 0) {
							this.anIntArray167[local66] = local16;
						}
						local66 = this.anIntArray167[local66];
					}
					if (this.anIntArray167.length <= local66) {
						@Pc(191) int[] local191 = new int[this.anIntArray167.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray167.length; local193++) {
							local191[local193] = this.anIntArray167[local193];
						}
						this.anIntArray167 = local191;
					}
				}
				if (local16 <= local66) {
					local16 = local66 + 1;
				}
				this.anIntArray167[local66] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BBI[BI)I")
	public int method1189(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg4 << 3;
		while (local5 > arg2) {
			@Pc(29) int local29 = arg1[arg2] & 0xFF;
			@Pc(34) int local34 = this.anIntArray168[local29];
			@Pc(39) byte local39 = this.aByteArray8[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local17 >> 3;
			@Pc(63) int local63 = local17 & 0x7;
			local13 &= -local63 >> 31;
			@Pc(80) int local80 = (local63 + local39 - 1 >> 3) + local59;
			@Pc(81) int local81 = local63 + 24;
			arg3[local59] = (byte) (local13 |= local34 >>> local81);
			if (local59 < local80) {
				local59++;
				local63 = local81 - 8;
				arg3[local59] = (byte) (local13 = local34 >>> local63);
				if (local59 < local80) {
					local59++;
					local63 -= 8;
					arg3[local59] = (byte) (local13 = local34 >>> local63);
					if (local80 > local59) {
						local63 -= 8;
						local59++;
						arg3[local59] = (byte) (local13 = local34 >>> local63);
						if (local59 < local80) {
							local59++;
							local63 -= 8;
							arg3[local59] = (byte) (local13 = local34 << -local63);
						}
					}
				}
			}
			local17 += local39;
			arg2++;
		}
		return (local17 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIIIB[B)I")
	public int method1192(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg1;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 >= 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local48;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local83;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local118;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local157;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(195) int local195;
			if ((local195 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local195;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local230;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(265) int local265;
			if ((local265 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local265;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray167[local19];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray167[local19]) < 0) {
				arg0[arg2++] = (byte) ~local304;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}
}

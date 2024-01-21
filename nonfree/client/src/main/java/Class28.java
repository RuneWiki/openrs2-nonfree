import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class28 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
	private final int[] anIntArray115;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
	public Class28(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length;
		this.anIntArray114 = new int[8];
		this.anIntArray115 = new int[local8];
		@Pc(19) int[] local19 = new int[33];
		this.aByteArray11 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(36) int local36 = local19[local30];
				@Pc(43) int local43 = 0x1 << 32 - local30;
				this.anIntArray115[local24] = local36;
				@Pc(106) int local106;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(76) int local76;
				if ((local36 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local19[local59];
						if (local36 != local65) {
							break;
						}
						local76 = 0x1 << 32 - local59;
						if ((local76 & local65) != 0) {
							local19[local59] = local19[local59 - 1];
							break;
						}
						local19[local59] = local76 | local65;
					}
					local106 = local36 | local43;
				} else {
					local106 = local19[local30 - 1];
				}
				local19[local30] = local106;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local19[local59] == local36) {
						local19[local59] = local106;
					}
				}
				local65 = 0;
				for (local76 = 0; local76 < local30; local76++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local76;
					if ((local36 & local149) == 0) {
						local65++;
					} else {
						if (this.anIntArray114[local65] == 0) {
							this.anIntArray114[local65] = local5;
						}
						local65 = this.anIntArray114[local65];
					}
					if (local65 >= this.anIntArray114.length) {
						@Pc(194) int[] local194 = new int[this.anIntArray114.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray114.length; local196++) {
							local194[local196] = this.anIntArray114[local196];
						}
						this.anIntArray114 = local194;
					}
				}
				this.anIntArray114[local65] = ~local24;
				if (local65 >= local5) {
					local5 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BZ[BI)I")
	public int method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg1 << 3;
		while (arg0 < local5) {
			@Pc(28) int local28 = arg3[arg0] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray11[local28];
			@Pc(38) int local38 = this.anIntArray115[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local20 & 0x7;
			@Pc(59) int local59 = local20 >> 3;
			local20 += local33;
			@Pc(73) int local73 = local59 + (local33 + local55 - 1 >> 3);
			local16 &= -local55 >> 31;
			@Pc(81) int local81 = local55 + 24;
			arg2[local59] = (byte) (local16 |= local38 >>> local81);
			if (local73 > local59) {
				local55 = local81 - 8;
				local59++;
				arg2[local59] = (byte) (local16 = local38 >>> local55);
				if (local73 > local59) {
					local55 -= 8;
					local59++;
					arg2[local59] = (byte) (local16 = local38 >>> local55);
					if (local59 < local73) {
						local59++;
						local55 -= 8;
						arg2[local59] = (byte) (local16 = local38 >>> local55);
						if (local59 < local73) {
							local55 -= 8;
							local59++;
							arg2[local59] = (byte) (local16 = local38 << -local55);
						}
					}
				}
			}
			arg0++;
		}
		return (local20 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBII[BI)I")
	public int method588(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg4;
		while (true) {
			@Pc(22) byte local22 = arg3[local18];
			if (local22 >= 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local40;
				if (local14 <= arg1) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local78;
				if (arg1 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local115;
				if (arg1 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local149;
				if (local14 <= arg1) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(183) int local183;
			if ((local183 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local183;
				if (arg1 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local221;
				if (local14 <= arg1) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local259;
				if (arg1 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray114[local16];
			}
			@Pc(290) int local290;
			if ((local290 = this.anIntArray114[local16]) < 0) {
				arg0[arg1++] = (byte) ~local290;
				if (arg1 >= local14) {
					break;
				}
				local16 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg4;
	}
}

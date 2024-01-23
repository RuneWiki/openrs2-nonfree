import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class99 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V")
	public Class99(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		this.aByteArray52 = arg0;
		this.anIntArray335 = new int[8];
		this.anIntArray336 = new int[local9];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local31;
				@Pc(45) int local45 = local6[local31];
				this.anIntArray336[local24] = local45;
				@Pc(60) int local60;
				@Pc(70) int local70;
				@Pc(79) int local79;
				@Pc(95) int local95;
				if ((local41 & local45) == 0) {
					local60 = local41 | local45;
					for (local70 = local31 - 1; local70 >= 1; local70--) {
						local79 = local6[local70];
						if (local45 != local79) {
							break;
						}
						local95 = 0x1 << 32 - local70;
						if ((local95 & local79) != 0) {
							local6[local70] = local6[local70 - 1];
							break;
						}
						local6[local70] = local95 | local79;
					}
				} else {
					local60 = local6[local31 - 1];
				}
				local6[local31] = local60;
				for (local70 = local31 + 1; local70 <= 32; local70++) {
					if (local45 == local6[local70]) {
						local6[local70] = local60;
					}
				}
				local70 = 0;
				for (local79 = 0; local79 < local31; local79++) {
					local95 = Integer.MIN_VALUE >>> local79;
					if ((local95 & local45) == 0) {
						local70++;
					} else {
						if (this.anIntArray335[local70] == 0) {
							this.anIntArray335[local70] = local22;
						}
						local70 = this.anIntArray335[local70];
					}
					if (local70 >= this.anIntArray335.length) {
						@Pc(211) int[] local211 = new int[this.anIntArray335.length * 2];
						for (@Pc(213) int local213 = 0; local213 < this.anIntArray335.length; local213++) {
							local211[local213] = this.anIntArray335[local213];
						}
						this.anIntArray335 = local211;
					}
				}
				this.anIntArray335[local70] = ~local24;
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III[B[BB)I")
	public int method2273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(17) int local17 = arg0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg1;
		while (true) {
			@Pc(25) byte local25 = arg3[local21];
			if (local25 >= 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local45;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local86;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local125;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local165;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(201) int local201;
			if ((local201 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local201;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local236;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local279;
				if (arg2 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray335[local19];
			}
			@Pc(318) int local318;
			if ((local318 = this.anIntArray335[local19]) < 0) {
				arg4[arg2++] = (byte) ~local318;
				if (local17 <= arg2) {
					break;
				}
				local19 = 0;
			}
			local21++;
		}
		return local21 + 1 - arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BIII[B)I")
	public int method2276(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11 = arg3 << 3;
		@Pc(15) int local15 = arg2;
		while (local15 > arg1) {
			@Pc(31) int local31 = arg4[arg1] & 0xFF;
			@Pc(36) int local36 = this.anIntArray336[local31];
			@Pc(41) byte local41 = this.aByteArray52[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(62) int local62 = local11 & 0x7;
			local3 &= -local62 >> 31;
			@Pc(73) int local73 = local11 >> 3;
			@Pc(83) int local83 = local73 + (local41 + local62 - 1 >> 3);
			@Pc(84) int local84 = local62 + 24;
			arg0[local73] = (byte) (local3 |= local36 >>> local84);
			if (local73 < local83) {
				local73++;
				local62 = local84 - 8;
				arg0[local73] = (byte) (local3 = local36 >>> local62);
				if (local73 < local83) {
					local73++;
					local62 -= 8;
					arg0[local73] = (byte) (local3 = local36 >>> local62);
					if (local83 > local73) {
						local62 -= 8;
						local73++;
						arg0[local73] = (byte) (local3 = local36 >>> local62);
						if (local73 < local83) {
							local73++;
							local62 -= 8;
							arg0[local73] = (byte) (local3 = local36 << -local62);
						}
					}
				}
			}
			local11 += local41;
			arg1++;
		}
		return (local11 + 7 >> 3) - arg3;
	}
}

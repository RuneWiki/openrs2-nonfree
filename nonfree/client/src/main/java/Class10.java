import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class10 {

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	private final int[] anIntArray18;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
	public Class10(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray18 = new int[local6];
		this.anIntArray20 = new int[8];
		this.aByteArray5 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray18[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(82) int local82;
				if ((local43 & local39) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local20[local64];
						if (local43 != local70) {
							break;
						}
						local82 = 0x1 << 32 - local64;
						if ((local82 & local70) != 0) {
							local20[local64] = local20[local64 - 1];
							break;
						}
						local20[local64] = local82 | local70;
					}
					local58 = local43 | local39;
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local43 == local20[local64]) {
						local20[local64] = local58;
					}
				}
				local70 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local82;
					if ((local43 & local146) == 0) {
						local70++;
					} else {
						if (this.anIntArray20[local70] == 0) {
							this.anIntArray20[local70] = local22;
						}
						local70 = this.anIntArray20[local70];
					}
					if (local70 >= this.anIntArray20.length) {
						@Pc(187) int[] local187 = new int[this.anIntArray20.length * 2];
						for (@Pc(189) int local189 = 0; local189 < this.anIntArray20.length; local189++) {
							local187[local189] = this.anIntArray20[local189];
						}
						this.anIntArray20 = local187;
					}
				}
				this.anIntArray20[local70] = ~local24;
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BIZ[B)I")
	public int method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 < 0) {
				local14 = this.anIntArray20[local14];
			} else {
				local14++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local48;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local87;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local126;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local164;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local200;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local236;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local271;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray20[local14];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray20[local14]) < 0) {
				arg2[arg0++] = (byte) ~local306;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[B[BI)I")
	public int method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(11) int local11 = arg1;
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg2 << 3;
		while (local11 > arg0) {
			@Pc(29) int local29 = arg3[arg0] & 0xFF;
			@Pc(34) int local34 = this.anIntArray18[local29];
			@Pc(39) byte local39 = this.aByteArray5[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local21 & 0x7;
			local17 &= -local59 >> 31;
			@Pc(70) int local70 = local21 >> 3;
			local21 += local39;
			@Pc(86) int local86 = local70 + (local59 + local39 - 1 >> 3);
			@Pc(87) int local87 = local59 + 24;
			arg4[local70] = (byte) (local17 |= local34 >>> local87);
			if (local86 > local70) {
				local70++;
				local59 = local87 - 8;
				arg4[local70] = (byte) (local17 = local34 >>> local59);
				if (local70 < local86) {
					local70++;
					local59 -= 8;
					arg4[local70] = (byte) (local17 = local34 >>> local59);
					if (local70 < local86) {
						local70++;
						local59 -= 8;
						arg4[local70] = (byte) (local17 = local34 >>> local59);
						if (local70 < local86) {
							local59 -= 8;
							local70++;
							arg4[local70] = (byte) (local17 = local34 << -local59);
						}
					}
				}
			}
			arg0++;
		}
		return (local21 + 7 >> 3) - arg2;
	}
}

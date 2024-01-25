import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class54 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "[I")
	private final int[] anIntArray70;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([B)V")
	public Class54(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray70 = new int[local6];
		this.aByteArray7 = arg0;
		this.anIntArray69 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray70[local24] = local42;
				@Pc(57) int local57;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(87) int local87;
				if ((local38 & local42) == 0) {
					local57 = local38 | local42;
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local73 != local42) {
							break;
						}
						local87 = 0x1 << 32 - local67;
						if ((local87 & local73) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local87 | local73;
					}
				} else {
					local57 = local20[local30 - 1];
				}
				local20[local30] = local57;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local20[local67] == local42) {
						local20[local67] = local57;
					}
				}
				local73 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local87;
					if ((local150 & local42) == 0) {
						local73++;
					} else {
						if (this.anIntArray69[local73] == 0) {
							this.anIntArray69[local73] = local22;
						}
						local73 = this.anIntArray69[local73];
					}
					if (this.anIntArray69.length <= local73) {
						@Pc(187) int[] local187 = new int[this.anIntArray69.length * 2];
						for (@Pc(189) int local189 = 0; local189 < this.anIntArray69.length; local189++) {
							local187[local189] = this.anIntArray69[local189];
						}
						this.anIntArray69 = local187;
					}
				}
				if (local73 >= local22) {
					local22 = local73 + 1;
				}
				this.anIntArray69[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([BI[BIII)I")
	public int method1216(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(23) int local23 = arg4;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local45;
				if (arg3 >= local23) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local81;
				if (arg3 >= local23) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local113;
				if (local23 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local155;
				if (local23 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local197;
				if (arg3 >= local23) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local236;
				if (arg3 >= local23) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(275) int local275;
			if ((local275 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local275;
				if (arg3 >= local23) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray69[local14];
			}
			@Pc(314) int local314;
			if ((local314 = this.anIntArray69[local14]) < 0) {
				arg1[arg3++] = (byte) ~local314;
				if (local23 <= arg3) {
					break;
				}
				local14 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[B[BIB)I")
	public int method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19 = arg4;
		@Pc(23) int local23 = arg1 << 3;
		while (arg0 < local19) {
			@Pc(31) int local31 = arg2[arg0] & 0xFF;
			@Pc(36) int local36 = this.anIntArray70[local31];
			@Pc(41) byte local41 = this.aByteArray7[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(58) int local58 = local23 >> 3;
			@Pc(62) int local62 = local23 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(80) int local80 = (local62 + local41 - 1 >> 3) + local58;
			local23 += local41;
			@Pc(85) int local85 = local62 + 24;
			arg3[local58] = (byte) (local7 |= local36 >>> local85);
			if (local58 < local80) {
				local62 = local85 - 8;
				local58++;
				arg3[local58] = (byte) (local7 = local36 >>> local62);
				if (local80 > local58) {
					local58++;
					local62 -= 8;
					arg3[local58] = (byte) (local7 = local36 >>> local62);
					if (local58 < local80) {
						local62 -= 8;
						local58++;
						arg3[local58] = (byte) (local7 = local36 >>> local62);
						if (local80 > local58) {
							local58++;
							local62 -= 8;
							arg3[local58] = (byte) (local7 = local36 << -local62);
						}
					}
				}
			}
			arg0++;
		}
		return (local23 + 7 >> 3) - arg1;
	}
}

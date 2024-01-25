import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class296 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
	private final int[] anIntArray430;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
	public Class296(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray430 = new int[local6];
		this.aByteArray89 = arg0;
		this.anIntArray431 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray430[local24] = local43;
				@Pc(125) int local125;
				@Pc(59) int local59;
				@Pc(67) int local67;
				@Pc(83) int local83;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local67 = local20[local59];
						if (local43 != local67) {
							break;
						}
						local83 = 0x1 << 32 - local59;
						if ((local83 & local67) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local67 | local83;
					}
					local125 = local39 | local43;
				} else {
					local125 = local20[local30 - 1];
				}
				local20[local30] = local125;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local20[local59] == local43) {
						local20[local59] = local125;
					}
				}
				local67 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(178) int local178 = Integer.MIN_VALUE >>> local83;
					if ((local43 & local178) == 0) {
						local67++;
					} else {
						if (this.anIntArray431[local67] == 0) {
							this.anIntArray431[local67] = local22;
						}
						local67 = this.anIntArray431[local67];
					}
					if (local67 >= this.anIntArray431.length) {
						@Pc(228) int[] local228 = new int[this.anIntArray431.length * 2];
						for (@Pc(230) int local230 = 0; local230 < this.anIntArray431.length; local230++) {
							local228[local230] = this.anIntArray431[local230];
						}
						this.anIntArray431 = local228;
					}
				}
				this.anIntArray431[local67] = ~local24;
				if (local67 >= local22) {
					local22 = local67 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[BII[BI)I")
	public int method7356(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg2 << 3;
		@Pc(13) int local13 = arg1;
		while (arg4 < local13) {
			@Pc(20) int local20 = arg3[arg4] & 0xFF;
			@Pc(25) int local25 = this.anIntArray430[local20];
			@Pc(30) byte local30 = this.aByteArray89[local20];
			if (local30 == 0) {
				throw new RuntimeException("No codeword for data value " + local20);
			}
			@Pc(50) int local50 = local9 >> 3;
			@Pc(54) int local54 = local9 & 0x7;
			local5 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local30 + local54 - 1 >> 3);
			local9 += local30;
			@Pc(77) int local77 = local54 + 24;
			arg0[local50] = (byte) (local5 |= local25 >>> local77);
			if (local72 > local50) {
				local50++;
				local54 = local77 - 8;
				arg0[local50] = (byte) (local5 = local25 >>> local54);
				if (local72 > local50) {
					local50++;
					local54 -= 8;
					arg0[local50] = (byte) (local5 = local25 >>> local54);
					if (local50 < local72) {
						local54 -= 8;
						local50++;
						arg0[local50] = (byte) (local5 = local25 >>> local54);
						if (local50 < local72) {
							local54 -= 8;
							local50++;
							arg0[local50] = (byte) (local5 = local25 << -local54);
						}
					}
				}
			}
			arg4++;
		}
		return (local9 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([B[BIIII)I")
	public int method7357(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(12) int local12 = arg3;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg2;
		while (true) {
			@Pc(28) byte local28 = arg1[local16];
			if (local28 < 0) {
				local14 = this.anIntArray431[local14];
			} else {
				local14++;
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local43;
				if (arg4 >= local12) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local86;
				if (local12 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local129;
				if (arg4 >= local12) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(169) int local169;
			if ((local169 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local169;
				if (arg4 >= local12) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(210) int local210;
			if ((local210 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local210;
				if (arg4 >= local12) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(247) int local247;
			if ((local247 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local247;
				if (local12 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(283) int local283;
			if ((local283 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local283;
				if (arg4 >= local12) {
					break;
				}
				local14 = 0;
			}
			if ((local28 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray431[local14];
			}
			@Pc(323) int local323;
			if ((local323 = this.anIntArray431[local14]) < 0) {
				arg0[arg4++] = (byte) ~local323;
				if (local12 <= arg4) {
					break;
				}
				local14 = 0;
			}
			local16++;
		}
		return local16 + 1 - arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class226 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
	private final int[] anIntArray615;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
	private int[] anIntArray616;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
	public Class226(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray615 = new int[local6];
		this.aByteArray82 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray616 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray615[local24] = local43;
				@Pc(104) int local104;
				@Pc(56) int local56;
				@Pc(62) int local62;
				@Pc(72) int local72;
				if ((local39 & local43) == 0) {
					for (local56 = local30 - 1; local56 >= 1; local56--) {
						local62 = local16[local56];
						if (local43 != local62) {
							break;
						}
						local72 = 0x1 << 32 - local56;
						if ((local62 & local72) != 0) {
							local16[local56] = local16[local56 - 1];
							break;
						}
						local16[local56] = local72 | local62;
					}
					local104 = local39 | local43;
				} else {
					local104 = local16[local30 - 1];
				}
				local16[local30] = local104;
				for (local56 = local30 + 1; local56 <= 32; local56++) {
					if (local43 == local16[local56]) {
						local16[local56] = local104;
					}
				}
				local62 = 0;
				for (local72 = 0; local72 < local30; local72++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local72;
					if ((local43 & local149) == 0) {
						local62++;
					} else {
						if (this.anIntArray616[local62] == 0) {
							this.anIntArray616[local62] = local22;
						}
						local62 = this.anIntArray616[local62];
					}
					if (this.anIntArray616.length <= local62) {
						@Pc(191) int[] local191 = new int[this.anIntArray616.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray616.length; local193++) {
							local191[local193] = this.anIntArray616[local193];
						}
						this.anIntArray616 = local191;
					}
				}
				if (local22 <= local62) {
					local22 = local62 + 1;
				}
				this.anIntArray616[local62] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BIB[BII)I")
	public int method5090(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg4;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local43;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local79;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(111) int local111;
			if ((local111 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local111;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(150) int local150;
			if ((local150 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local150;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local192;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local231;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local263;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray616[local14];
			}
			@Pc(295) int local295;
			if ((local295 = this.anIntArray616[local14]) < 0) {
				arg0[arg1++] = (byte) ~local295;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI[BIII)I")
	public int method5093(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg3 << 3;
		@Pc(13) int local13 = arg4;
		while (local13 > arg1) {
			@Pc(20) int local20 = arg0[arg1] & 0xFF;
			@Pc(25) int local25 = this.anIntArray615[local20];
			@Pc(30) byte local30 = this.aByteArray82[local20];
			if (local30 == 0) {
				throw new RuntimeException("No codeword for data value " + local20);
			}
			@Pc(50) int local50 = local9 >> 3;
			@Pc(54) int local54 = local9 & 0x7;
			local5 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local30 - 1 >> 3);
			@Pc(73) int local73 = local54 + 24;
			arg2[local50] = (byte) (local5 |= local25 >>> local73);
			if (local72 > local50) {
				local50++;
				local54 = local73 - 8;
				arg2[local50] = (byte) (local5 = local25 >>> local54);
				if (local50 < local72) {
					local50++;
					local54 -= 8;
					arg2[local50] = (byte) (local5 = local25 >>> local54);
					if (local50 < local72) {
						local50++;
						local54 -= 8;
						arg2[local50] = (byte) (local5 = local25 >>> local54);
						if (local72 > local50) {
							local54 -= 8;
							local50++;
							arg2[local50] = (byte) (local5 = local25 << -local54);
						}
					}
				}
			}
			local9 += local30;
			arg1++;
		}
		return (local9 + 7 >> 3) - arg3;
	}
}

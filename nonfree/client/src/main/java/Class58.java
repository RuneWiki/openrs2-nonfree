import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class58 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	private final int[] anIntArray219;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class58(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray218 = new int[8];
		@Pc(13) int[] local13 = new int[33];
		this.anIntArray219 = new int[local6];
		@Pc(19) int local19 = 0;
		this.aByteArray28 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local13[local30];
				this.anIntArray219[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(83) int local83;
				if ((local39 & local43) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local13[local67];
						if (local73 != local43) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local73 & local83) != 0) {
							local13[local67] = local13[local67 - 1];
							break;
						}
						local13[local67] = local73 | local83;
					}
					local61 = local43 | local39;
				} else {
					local61 = local13[local30 - 1];
				}
				local13[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local13[local67] == local43) {
						local13[local67] = local61;
					}
				}
				local73 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local83;
					if ((local149 & local43) == 0) {
						local73++;
					} else {
						if (this.anIntArray218[local73] == 0) {
							this.anIntArray218[local73] = local19;
						}
						local73 = this.anIntArray218[local73];
					}
					if (this.anIntArray218.length <= local73) {
						@Pc(190) int[] local190 = new int[this.anIntArray218.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray218.length; local192++) {
							local190[local192] = this.anIntArray218[local192];
						}
						this.anIntArray218 = local190;
					}
				}
				this.anIntArray218[local73] = ~local24;
				if (local73 >= local19) {
					local19 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI[BI[B)I")
	public int method1737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(20) int local20 = arg1 << 3;
		while (local5 > arg3) {
			@Pc(28) int local28 = arg4[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray219[local28];
			@Pc(38) byte local38 = this.aByteArray28[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local20 & 0x7;
			local11 &= -local55 >> 31;
			@Pc(66) int local66 = local20 >> 3;
			local20 += local38;
			@Pc(80) int local80 = (local38 + local55 - 1 >> 3) + local66;
			@Pc(81) int local81 = local55 + 24;
			arg2[local66] = (byte) (local11 |= local33 >>> local81);
			if (local80 > local66) {
				local55 = local81 - 8;
				local66++;
				arg2[local66] = (byte) (local11 = local33 >>> local55);
				if (local80 > local66) {
					local55 -= 8;
					local66++;
					arg2[local66] = (byte) (local11 = local33 >>> local55);
					if (local80 > local66) {
						local66++;
						local55 -= 8;
						arg2[local66] = (byte) (local11 = local33 >>> local55);
						if (local66 < local80) {
							local55 -= 8;
							local66++;
							arg2[local66] = (byte) (local11 = local33 << -local55);
						}
					}
				}
			}
			arg3++;
		}
		return (local20 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[BIIII)I")
	public int method1739(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg2;
		@Pc(22) int local22 = arg4;
		while (true) {
			@Pc(26) byte local26 = arg1[local22];
			if (local26 < 0) {
				local16 = this.anIntArray218[local16];
			} else {
				local16++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local42;
				if (arg3 >= local20) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local81;
				if (local20 <= arg3) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local123;
				if (local20 <= arg3) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local161;
				if (local20 <= arg3) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(196) int local196;
			if ((local196 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local196;
				if (local20 <= arg3) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(228) int local228;
			if ((local228 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local228;
				if (arg3 >= local20) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local267;
				if (local20 <= arg3) {
					break;
				}
				local16 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray218[local16];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray218[local16]) < 0) {
				arg0[arg3++] = (byte) ~local303;
				if (local20 <= arg3) {
					break;
				}
				local16 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class17 {

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V")
	public Class17(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray14 = arg0;
		this.anIntArray39 = new int[local6];
		this.anIntArray40 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray39[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(83) int local83;
				if ((local39 & local43) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local73 != local43) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local73 & local83) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local83 | local73;
					}
					local61 = local39 | local43;
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local43 == local20[local67]) {
						local20[local67] = local61;
					}
				}
				local73 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(145) int local145 = Integer.MIN_VALUE >>> local83;
					if ((local145 & local43) == 0) {
						local73++;
					} else {
						if (this.anIntArray40[local73] == 0) {
							this.anIntArray40[local73] = local22;
						}
						local73 = this.anIntArray40[local73];
					}
					if (this.anIntArray40.length <= local73) {
						@Pc(187) int[] local187 = new int[this.anIntArray40.length * 2];
						for (@Pc(189) int local189 = 0; local189 < this.anIntArray40.length; local189++) {
							local187[local189] = this.anIntArray40[local189];
						}
						this.anIntArray40 = local187;
					}
				}
				this.anIntArray40[local73] = ~local24;
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BII[BI)I")
	public int method391(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg4 << 3;
		while (arg1 < local14) {
			@Pc(28) int local28 = arg3[arg1] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray14[local28];
			@Pc(38) int local38 = this.anIntArray39[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local20 += local33;
			@Pc(76) int local76 = (local33 + local62 - 1 >> 3) + local58;
			local16 &= -local62 >> 31;
			@Pc(84) int local84 = local62 + 24;
			arg0[local58] = (byte) (local16 |= local38 >>> local84);
			if (local76 > local58) {
				local62 = local84 - 8;
				local58++;
				arg0[local58] = (byte) (local16 = local38 >>> local62);
				if (local58 < local76) {
					local58++;
					local62 -= 8;
					arg0[local58] = (byte) (local16 = local38 >>> local62);
					if (local58 < local76) {
						local58++;
						local62 -= 8;
						arg0[local58] = (byte) (local16 = local38 >>> local62);
						if (local76 > local58) {
							local58++;
							local62 -= 8;
							arg0[local58] = (byte) (local16 = local38 << -local62);
						}
					}
				}
			}
			arg1++;
		}
		return (local20 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BI[BII)I")
	public int method397(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg4;
		while (true) {
			@Pc(26) byte local26 = arg3[local22];
			if (local26 < 0) {
				local20 = this.anIntArray40[local20];
			} else {
				local20++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local45;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local84;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local116;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local148;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local184;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(220) int local220;
			if ((local220 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local220;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(255) int local255;
			if ((local255 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local255;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(290) int local290;
			if ((local290 = this.anIntArray40[local20]) < 0) {
				arg1[arg2++] = (byte) ~local290;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg4;
	}
}

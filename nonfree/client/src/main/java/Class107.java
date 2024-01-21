import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class107 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
	private int[] anIntArray425;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	private final int[] anIntArray424;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
	public Class107(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray425 = new int[8];
		this.aByteArray57 = arg0;
		this.anIntArray424 = new int[local6];
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local22[local30];
				this.anIntArray424[local24] = local43;
				@Pc(107) int local107;
				@Pc(56) int local56;
				@Pc(62) int local62;
				@Pc(74) int local74;
				if ((local39 & local43) == 0) {
					for (local56 = local30 - 1; local56 >= 1; local56--) {
						local62 = local22[local56];
						if (local43 != local62) {
							break;
						}
						local74 = 0x1 << 32 - local56;
						if ((local74 & local62) != 0) {
							local22[local56] = local22[local56 - 1];
							break;
						}
						local22[local56] = local74 | local62;
					}
					local107 = local39 | local43;
				} else {
					local107 = local22[local30 - 1];
				}
				local22[local30] = local107;
				for (local56 = local30 + 1; local56 <= 32; local56++) {
					if (local43 == local22[local56]) {
						local22[local56] = local107;
					}
				}
				local62 = 0;
				for (local74 = 0; local74 < local30; local74++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local74;
					if ((local148 & local43) == 0) {
						local62++;
					} else {
						if (this.anIntArray425[local62] == 0) {
							this.anIntArray425[local62] = local19;
						}
						local62 = this.anIntArray425[local62];
					}
					if (this.anIntArray425.length <= local62) {
						@Pc(189) int[] local189 = new int[this.anIntArray425.length * 2];
						for (@Pc(191) int local191 = 0; local191 < this.anIntArray425.length; local191++) {
							local189[local191] = this.anIntArray425[local191];
						}
						this.anIntArray425 = local189;
					}
				}
				this.anIntArray425[local62] = ~local24;
				if (local62 >= local19) {
					local19 = local62 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[BIII[B)I")
	public int method3121(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 < 0) {
				local23 = this.anIntArray425[local23];
			} else {
				local23++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local45;
				if (arg2 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local87;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local129;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local161;
				if (arg2 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local200;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local232;
				if (arg2 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local271;
				if (arg2 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray425[local23];
			}
			@Pc(310) int local310;
			if ((local310 = this.anIntArray425[local23]) < 0) {
				arg1[arg2++] = (byte) ~local310;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BII[B)I")
	public int method3125(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 << 3;
		while (local9 > arg0) {
			@Pc(34) int local34 = arg1[arg0] & 0xFF;
			@Pc(39) int local39 = this.anIntArray424[local34];
			@Pc(44) byte local44 = this.aByteArray57[local34];
			if (local44 == 0) {
				throw new RuntimeException("No codeword for data value " + local34);
			}
			@Pc(61) int local61 = local15 >> 3;
			@Pc(65) int local65 = local15 & 0x7;
			local15 += local44;
			@Pc(79) int local79 = (local44 + local65 - 1 >> 3) + local61;
			local11 &= -local65 >> 31;
			@Pc(87) int local87 = local65 + 24;
			arg4[local61] = (byte) (local11 |= local39 >>> local87);
			if (local61 < local79) {
				local61++;
				local65 = local87 - 8;
				arg4[local61] = (byte) (local11 = local39 >>> local65);
				if (local79 > local61) {
					local61++;
					local65 -= 8;
					arg4[local61] = (byte) (local11 = local39 >>> local65);
					if (local61 < local79) {
						local61++;
						local65 -= 8;
						arg4[local61] = (byte) (local11 = local39 >>> local65);
						if (local79 > local61) {
							local65 -= 8;
							local61++;
							arg4[local61] = (byte) (local11 = local39 << -local65);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg3;
	}
}

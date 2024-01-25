import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class346 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[B")
	private final byte[] aByteArray98;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "[I")
	private final int[] anIntArray681;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
	private int[] anIntArray680;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([B)V")
	public Class346(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray98 = arg0;
		this.anIntArray681 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray680 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray681[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(81) int local81;
				if ((local43 & local39) == 0) {
					local59 = local43 | local39;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local16[local63];
						if (local43 != local69) {
							break;
						}
						local81 = 0x1 << 32 - local63;
						if ((local69 & local81) != 0) {
							local16[local63] = local16[local63 - 1];
							break;
						}
						local16[local63] = local81 | local69;
					}
				} else {
					local59 = local16[local30 - 1];
				}
				local16[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local43 == local16[local63]) {
						local16[local63] = local59;
					}
				}
				local69 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local81;
					if ((local43 & local153) == 0) {
						local69++;
					} else {
						if (this.anIntArray680[local69] == 0) {
							this.anIntArray680[local69] = local22;
						}
						local69 = this.anIntArray680[local69];
					}
					if (this.anIntArray680.length <= local69) {
						@Pc(191) int[] local191 = new int[this.anIntArray680.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray680.length; local193++) {
							local191[local193] = this.anIntArray680[local193];
						}
						this.anIntArray680 = local191;
					}
				}
				this.anIntArray680[local69] = ~local24;
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI[B[BI)I")
	public int method8018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 << 3;
		@Pc(18) int local18 = arg1;
		while (local18 > arg0) {
			@Pc(25) int local25 = arg2[arg0] & 0xFF;
			@Pc(30) int local30 = this.anIntArray681[local25];
			@Pc(35) byte local35 = this.aByteArray98[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(52) int local52 = local14 >> 3;
			@Pc(56) int local56 = local14 & 0x7;
			local10 &= -local56 >> 31;
			@Pc(73) int local73 = local52 + (local35 + local56 - 1 >> 3);
			@Pc(74) int local74 = local56 + 24;
			arg3[local52] = (byte) (local10 |= local30 >>> local74);
			if (local52 < local73) {
				local52++;
				local56 = local74 - 8;
				arg3[local52] = (byte) (local10 = local30 >>> local56);
				if (local52 < local73) {
					local52++;
					local56 -= 8;
					arg3[local52] = (byte) (local10 = local30 >>> local56);
					if (local73 > local52) {
						local56 -= 8;
						local52++;
						arg3[local52] = (byte) (local10 = local30 >>> local56);
						if (local52 < local73) {
							local52++;
							local56 -= 8;
							arg3[local52] = (byte) (local10 = local30 << -local56);
						}
					}
				}
			}
			local14 += local35;
			arg0++;
		}
		return (local14 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[BII[BI)I")
	public int method8019(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg2;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg0;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 < 0) {
				local18 = this.anIntArray680[local18];
			} else {
				local18++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local42;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local77;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local108;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(145) int local145;
			if ((local145 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local145;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local179;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local214;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local252;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray680[local18];
			}
			@Pc(293) int local293;
			if ((local293 = this.anIntArray680[local18]) < 0) {
				arg3[arg4++] = (byte) ~local293;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg0;
	}
}

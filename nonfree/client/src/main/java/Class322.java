import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class322 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[B")
	private final byte[] aByteArray117;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "[I")
	private final int[] anIntArray674;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "[I")
	private int[] anIntArray675;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([B)V")
	public Class322(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray117 = arg0;
		this.anIntArray674 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray675 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray674[local24] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(82) int local82;
				if ((local43 & local39) == 0) {
					local56 = local43 | local39;
					for (local60 = local30 - 1; local60 >= 1; local60--) {
						local66 = local16[local60];
						if (local66 != local43) {
							break;
						}
						local82 = 0x1 << 32 - local60;
						if ((local66 & local82) != 0) {
							local16[local60] = local16[local60 - 1];
							break;
						}
						local16[local60] = local66 | local82;
					}
				} else {
					local56 = local16[local30 - 1];
				}
				local16[local30] = local56;
				for (local60 = local30 + 1; local60 <= 32; local60++) {
					if (local43 == local16[local60]) {
						local16[local60] = local56;
					}
				}
				local66 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local82;
					if ((local158 & local43) == 0) {
						local66++;
					} else {
						if (this.anIntArray675[local66] == 0) {
							this.anIntArray675[local66] = local22;
						}
						local66 = this.anIntArray675[local66];
					}
					if (this.anIntArray675.length <= local66) {
						@Pc(199) int[] local199 = new int[this.anIntArray675.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray675.length; local201++) {
							local199[local201] = this.anIntArray675[local201];
						}
						this.anIntArray675 = local199;
					}
				}
				if (local22 <= local66) {
					local22 = local66 + 1;
				}
				this.anIntArray675[local66] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII[B[B)I")
	public int method7351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg2 << 3;
		while (local17 > arg0) {
			@Pc(29) int local29 = arg3[arg0] & 0xFF;
			@Pc(34) int local34 = this.anIntArray674[local29];
			@Pc(39) byte local39 = this.aByteArray117[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local21 >> 3;
			@Pc(60) int local60 = local21 & 0x7;
			local13 &= -local60 >> 31;
			@Pc(77) int local77 = local56 + (local39 + local60 - 1 >> 3);
			local21 += local39;
			@Pc(82) int local82 = local60 + 24;
			arg4[local56] = (byte) (local13 |= local34 >>> local82);
			if (local77 > local56) {
				local60 = local82 - 8;
				local56++;
				arg4[local56] = (byte) (local13 = local34 >>> local60);
				if (local77 > local56) {
					local60 -= 8;
					local56++;
					arg4[local56] = (byte) (local13 = local34 >>> local60);
					if (local77 > local56) {
						local56++;
						local60 -= 8;
						arg4[local56] = (byte) (local13 = local34 >>> local60);
						if (local56 < local77) {
							local60 -= 8;
							local56++;
							arg4[local56] = (byte) (local13 = local34 << -local60);
						}
					}
				}
			}
			arg0++;
		}
		return (local21 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III[B[BI)I")
	public int method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = arg4;
		@Pc(26) int local26 = arg1;
		while (true) {
			@Pc(30) byte local30 = arg2[local26];
			if (local30 < 0) {
				local20 = this.anIntArray675[local20];
			} else {
				local20++;
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local49;
				if (arg0 >= local24) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(88) int local88;
			if ((local88 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local88;
				if (arg0 >= local24) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local126;
				if (arg0 >= local24) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local161;
				if (arg0 >= local24) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local200;
				if (arg0 >= local24) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(235) int local235;
			if ((local235 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local235;
				if (local24 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local273;
				if (local24 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray675[local20];
			}
			@Pc(308) int local308;
			if ((local308 = this.anIntArray675[local20]) < 0) {
				arg3[arg0++] = (byte) ~local308;
				if (arg0 >= local24) {
					break;
				}
				local20 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg1;
	}
}

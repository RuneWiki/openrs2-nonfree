import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class257 {

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "[I")
	private final int[] anIntArray700;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "[I")
	private int[] anIntArray699;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
	public Class257(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray700 = new int[local6];
		this.aByteArray92 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray699 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray700[local24] = local43;
				@Pc(113) int local113;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(80) int local80;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local16[local59];
						if (local65 != local43) {
							break;
						}
						local80 = 0x1 << 32 - local59;
						if ((local65 & local80) != 0) {
							local16[local59] = local16[local59 - 1];
							break;
						}
						local16[local59] = local80 | local65;
					}
					local113 = local43 | local39;
				} else {
					local113 = local16[local30 - 1];
				}
				local16[local30] = local113;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local43 == local16[local59]) {
						local16[local59] = local113;
					}
				}
				local65 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(160) int local160 = Integer.MIN_VALUE >>> local80;
					if ((local160 & local43) == 0) {
						local65++;
					} else {
						if (this.anIntArray699[local65] == 0) {
							this.anIntArray699[local65] = local22;
						}
						local65 = this.anIntArray699[local65];
					}
					if (local65 >= this.anIntArray699.length) {
						@Pc(197) int[] local197 = new int[this.anIntArray699.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray699.length; local199++) {
							local197[local199] = this.anIntArray699[local199];
						}
						this.anIntArray699 = local197;
					}
				}
				this.anIntArray699[local65] = ~local24;
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII[B[BI)I")
	public int method5672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local40;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(72) int local72;
			if ((local72 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local72;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(104) int local104;
			if ((local104 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local104;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(143) int local143;
			if ((local143 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local143;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(182) int local182;
			if ((local182 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local182;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local217;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local252;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray699[local18];
			}
			@Pc(284) int local284;
			if ((local284 = this.anIntArray699[local18]) < 0) {
				arg3[arg1++] = (byte) ~local284;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BI[BII)I")
	public int method5673(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg1 << 3;
		@Pc(21) int local21 = arg4;
		while (local21 > arg3) {
			@Pc(29) int local29 = arg0[arg3] & 0xFF;
			@Pc(34) int local34 = this.anIntArray700[local29];
			@Pc(39) byte local39 = this.aByteArray92[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local17 >> 3;
			@Pc(63) int local63 = local17 & 0x7;
			local7 &= -local63 >> 31;
			@Pc(80) int local80 = (local39 + local63 - 1 >> 3) + local59;
			local17 += local39;
			@Pc(85) int local85 = local63 + 24;
			arg2[local59] = (byte) (local7 |= local34 >>> local85);
			if (local59 < local80) {
				local59++;
				local63 = local85 - 8;
				arg2[local59] = (byte) (local7 = local34 >>> local63);
				if (local59 < local80) {
					local59++;
					local63 -= 8;
					arg2[local59] = (byte) (local7 = local34 >>> local63);
					if (local80 > local59) {
						local63 -= 8;
						local59++;
						arg2[local59] = (byte) (local7 = local34 >>> local63);
						if (local59 < local80) {
							local63 -= 8;
							local59++;
							arg2[local59] = (byte) (local7 = local34 << -local63);
						}
					}
				}
			}
			arg3++;
		}
		return (local17 + 7 >> 3) - arg1;
	}
}

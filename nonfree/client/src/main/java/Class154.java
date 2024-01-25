import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class154 {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "[I")
	private final int[] anIntArray429;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B)V")
	public Class154(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray429 = new int[local6];
		this.aByteArray64 = arg0;
		this.anIntArray428 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray429[local24] = local46;
				@Pc(104) int local104;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(76) int local76;
				if ((local42 & local46) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local46 != local65) {
							break;
						}
						local76 = 0x1 << 32 - local59;
						if ((local76 & local65) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local65 | local76;
					}
					local104 = local46 | local42;
				} else {
					local104 = local20[local30 - 1];
				}
				local20[local30] = local104;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local46 == local20[local59]) {
						local20[local59] = local104;
					}
				}
				local65 = 0;
				for (local76 = 0; local76 < local30; local76++) {
					@Pc(145) int local145 = Integer.MIN_VALUE >>> local76;
					if ((local46 & local145) == 0) {
						local65++;
					} else {
						if (this.anIntArray428[local65] == 0) {
							this.anIntArray428[local65] = local22;
						}
						local65 = this.anIntArray428[local65];
					}
					if (local65 >= this.anIntArray428.length) {
						@Pc(183) int[] local183 = new int[this.anIntArray428.length * 2];
						for (@Pc(185) int local185 = 0; local185 < this.anIntArray428.length; local185++) {
							local183[local185] = this.anIntArray428[local185];
						}
						this.anIntArray428 = local183;
					}
				}
				this.anIntArray428[local65] = ~local24;
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[B[BIII)I")
	public int method4164(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = arg4;
		while (true) {
			@Pc(22) byte local22 = arg1[local18];
			if (local22 >= 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(41) int local41;
			if ((local41 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local41;
				if (arg3 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local76;
				if (local16 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local115;
				if (arg3 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local151;
				if (arg3 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local186;
				if (local16 <= arg3) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(222) int local222;
			if ((local222 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local222;
				if (arg3 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local257;
				if (arg3 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray428[local12];
			}
			@Pc(295) int local295;
			if ((local295 = this.anIntArray428[local12]) < 0) {
				arg2[arg3++] = (byte) ~local295;
				if (arg3 >= local16) {
					break;
				}
				local12 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg4;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[BI[BII)I")
	public int method4168(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg3 << 3;
		@Pc(13) int local13 = arg4;
		while (local13 > arg1) {
			@Pc(20) int local20 = arg2[arg1] & 0xFF;
			@Pc(25) int local25 = this.anIntArray429[local20];
			@Pc(30) byte local30 = this.aByteArray64[local20];
			if (local30 == 0) {
				throw new RuntimeException("No codeword for data value " + local20);
			}
			@Pc(50) int local50 = local9 >> 3;
			@Pc(54) int local54 = local9 & 0x7;
			local5 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local30 - 1 >> 3);
			local9 += local30;
			@Pc(77) int local77 = local54 + 24;
			arg0[local50] = (byte) (local5 |= local25 >>> local77);
			if (local72 > local50) {
				local54 = local77 - 8;
				local50++;
				arg0[local50] = (byte) (local5 = local25 >>> local54);
				if (local50 < local72) {
					local54 -= 8;
					local50++;
					arg0[local50] = (byte) (local5 = local25 >>> local54);
					if (local50 < local72) {
						local50++;
						local54 -= 8;
						arg0[local50] = (byte) (local5 = local25 >>> local54);
						if (local50 < local72) {
							local54 -= 8;
							local50++;
							arg0[local50] = (byte) (local5 = local25 << -local54);
						}
					}
				}
			}
			arg1++;
		}
		return (local9 + 7 >> 3) - arg3;
	}
}

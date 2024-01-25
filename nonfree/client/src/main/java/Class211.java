import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class211 {

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "[I")
	private final int[] anIntArray501;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "([B)V")
	public Class211(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray92 = arg0;
		this.anIntArray501 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray500 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray501[local24] = local46;
				@Pc(112) int local112;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(82) int local82;
				if ((local42 & local46) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local16[local62];
						if (local68 != local46) {
							break;
						}
						local82 = 0x1 << 32 - local62;
						if ((local82 & local68) != 0) {
							local16[local62] = local16[local62 - 1];
							break;
						}
						local16[local62] = local68 | local82;
					}
					local112 = local46 | local42;
				} else {
					local112 = local16[local30 - 1];
				}
				local16[local30] = local112;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local16[local62] == local46) {
						local16[local62] = local112;
					}
				}
				local68 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(159) int local159 = Integer.MIN_VALUE >>> local82;
					if ((local159 & local46) == 0) {
						local68++;
					} else {
						if (this.anIntArray500[local68] == 0) {
							this.anIntArray500[local68] = local22;
						}
						local68 = this.anIntArray500[local68];
					}
					if (this.anIntArray500.length <= local68) {
						@Pc(193) int[] local193 = new int[this.anIntArray500.length * 2];
						for (@Pc(195) int local195 = 0; local195 < this.anIntArray500.length; local195++) {
							local193[local195] = this.anIntArray500[local195];
						}
						this.anIntArray500 = local193;
					}
				}
				if (local68 >= local22) {
					local22 = local68 + 1;
				}
				this.anIntArray500[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI[BIII)I")
	public int method5469(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg4;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 < 0) {
				local14 = this.anIntArray500[local14];
			} else {
				local14++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local40;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local76;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(111) int local111;
			if ((local111 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local111;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(147) int local147;
			if ((local147 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local147;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(185) int local185;
			if ((local185 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local185;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local217;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(255) int local255;
			if ((local255 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local255;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray500[local14];
			}
			@Pc(291) int local291;
			if ((local291 = this.anIntArray500[local14]) < 0) {
				arg0[arg1++] = (byte) ~local291;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI[BI[B)I")
	public int method5470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg3 << 3;
		while (arg0 < local17) {
			@Pc(29) int local29 = arg4[arg0] & 0xFF;
			@Pc(34) int local34 = this.anIntArray501[local29];
			@Pc(39) byte local39 = this.aByteArray92[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local21 >> 3;
			@Pc(63) int local63 = local21 & 0x7;
			local7 &= -local63 >> 31;
			@Pc(81) int local81 = (local63 + local39 - 1 >> 3) + local59;
			local21 += local39;
			@Pc(86) int local86 = local63 + 24;
			arg2[local59] = (byte) (local7 |= local34 >>> local86);
			if (local81 > local59) {
				local63 = local86 - 8;
				local59++;
				arg2[local59] = (byte) (local7 = local34 >>> local63);
				if (local81 > local59) {
					local63 -= 8;
					local59++;
					arg2[local59] = (byte) (local7 = local34 >>> local63);
					if (local81 > local59) {
						local63 -= 8;
						local59++;
						arg2[local59] = (byte) (local7 = local34 >>> local63);
						if (local81 > local59) {
							local63 -= 8;
							local59++;
							arg2[local59] = (byte) (local7 = local34 << -local63);
						}
					}
				}
			}
			arg0++;
		}
		return (local21 + 7 >> 3) - arg3;
	}
}

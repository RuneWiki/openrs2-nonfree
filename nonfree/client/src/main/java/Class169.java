import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class169 {

	@OriginalMember(owner = "client!to", name = "d", descriptor = "[B")
	private byte[] aByteArray174;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
	private int[] anIntArray559;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "([B)V")
	public Class169(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length;
		this.aByteArray174 = arg0;
		this.anIntArray558 = new int[8];
		@Pc(18) int[] local18 = new int[33];
		this.anIntArray559 = new int[local8];
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(46) int local46 = 0x1 << 32 - local35;
				@Pc(50) int local50 = local18[local35];
				this.anIntArray559[local24] = local50;
				@Pc(110) int local110;
				@Pc(64) int local64;
				@Pc(71) int local71;
				@Pc(81) int local81;
				if ((local46 & local50) == 0) {
					for (local64 = local35 - 1; local64 >= 1; local64--) {
						local71 = local18[local64];
						if (local71 != local50) {
							break;
						}
						local81 = 0x1 << 32 - local64;
						if ((local81 & local71) != 0) {
							local18[local64] = local18[local64 - 1];
							break;
						}
						local18[local64] = local81 | local71;
					}
					local110 = local46 | local50;
				} else {
					local110 = local18[local35 - 1];
				}
				local18[local35] = local110;
				for (local64 = local35 + 1; local64 <= 32; local64++) {
					if (local50 == local18[local64]) {
						local18[local64] = local110;
					}
				}
				local64 = 0;
				for (local71 = 0; local71 < local35; local71++) {
					local81 = Integer.MIN_VALUE >>> local71;
					if ((local50 & local81) == 0) {
						local64++;
					} else {
						if (this.anIntArray558[local64] == 0) {
							this.anIntArray558[local64] = local5;
						}
						local64 = this.anIntArray558[local64];
					}
					if (local64 >= this.anIntArray558.length) {
						@Pc(197) int[] local197 = new int[this.anIntArray558.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray558.length; local199++) {
							local197[local199] = this.anIntArray558[local199];
						}
						this.anIntArray558 = local197;
					}
				}
				if (local5 <= local64) {
					local5 = local64 + 1;
				}
				this.anIntArray558[local64] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BI[BII[B)I")
	public int method4204(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = 0;
		@Pc(22) int local22 = arg3 << 3;
		while (local5 > arg0) {
			@Pc(35) int local35 = arg1[arg0] & 0xFF;
			@Pc(40) byte local40 = this.aByteArray174[local35];
			@Pc(45) int local45 = this.anIntArray559[local35];
			if (local40 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(64) int local64 = local22 >> 3;
			@Pc(68) int local68 = local22 & 0x7;
			local22 += local40;
			local7 &= -local68 >> 31;
			@Pc(89) int local89 = (local40 + local68 - 1 >> 3) + local64;
			@Pc(90) int local90 = local68 + 24;
			arg4[local64] = (byte) (local7 |= local45 >>> local90);
			if (local64 < local89) {
				local64++;
				local68 = local90 - 8;
				arg4[local64] = (byte) (local7 = local45 >>> local68);
				if (local89 > local64) {
					local64++;
					local68 -= 8;
					arg4[local64] = (byte) (local7 = local45 >>> local68);
					if (local64 < local89) {
						local68 -= 8;
						local64++;
						arg4[local64] = (byte) (local7 = local45 >>> local68);
						if (local64 < local89) {
							local64++;
							local68 -= 8;
							arg4[local64] = (byte) (local7 = local45 << -local68);
						}
					}
				}
			}
			arg0++;
		}
		return (local22 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([BBIII[B)I")
	public int method4205(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 < 0) {
				local23 = this.anIntArray558[local23];
			} else {
				local23++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local48;
				if (arg2 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(93) int local93;
			if ((local93 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local93;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(135) int local135;
			if ((local135 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local135;
				if (arg2 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(176) int local176;
			if ((local176 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local176;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local214;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local252;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(290) int local290;
			if ((local290 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local290;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray558[local23];
			}
			@Pc(325) int local325;
			if ((local325 = this.anIntArray558[local23]) < 0) {
				arg4[arg2++] = (byte) ~local325;
				if (local21 <= arg2) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}

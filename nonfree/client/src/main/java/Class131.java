import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class131 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V")
	public Class131(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray50 = arg0;
		this.anIntArray417 = new int[8];
		@Pc(15) int local15 = 0;
		@Pc(18) int[] local18 = new int[33];
		this.anIntArray416 = new int[local6];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local31;
				@Pc(43) int local43 = local18[local31];
				this.anIntArray416[local24] = local43;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(72) int local72;
				@Pc(85) int local85;
				if ((local39 & local43) == 0) {
					for (local65 = local31 - 1; local65 >= 1; local65--) {
						local72 = local18[local65];
						if (local43 != local72) {
							break;
						}
						local85 = 0x1 << 32 - local65;
						if ((local72 & local85) != 0) {
							local18[local65] = local18[local65 - 1];
							break;
						}
						local18[local65] = local85 | local72;
					}
					local59 = local43 | local39;
				} else {
					local59 = local18[local31 - 1];
				}
				local18[local31] = local59;
				for (local65 = local31 + 1; local65 <= 32; local65++) {
					if (local43 == local18[local65]) {
						local18[local65] = local59;
					}
				}
				local65 = 0;
				for (local72 = 0; local72 < local31; local72++) {
					local85 = Integer.MIN_VALUE >>> local72;
					if ((local85 & local43) == 0) {
						local65++;
					} else {
						if (this.anIntArray417[local65] == 0) {
							this.anIntArray417[local65] = local15;
						}
						local65 = this.anIntArray417[local65];
					}
					if (this.anIntArray417.length <= local65) {
						@Pc(197) int[] local197 = new int[this.anIntArray417.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray417.length; local199++) {
							local197[local199] = this.anIntArray417[local199];
						}
						this.anIntArray417 = local197;
					}
				}
				if (local15 <= local65) {
					local15 = local65 + 1;
				}
				this.anIntArray417[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B[BI)I")
	public int method3245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg0 << 3;
		while (arg1 < local5) {
			@Pc(32) int local32 = arg3[arg1] & 0xFF;
			@Pc(37) int local37 = this.anIntArray416[local32];
			@Pc(42) byte local42 = this.aByteArray50[local32];
			if (local42 == 0) {
				throw new RuntimeException("No codeword for data value " + local32);
			}
			@Pc(64) int local64 = local23 >> 3;
			@Pc(68) int local68 = local23 & 0x7;
			local23 += local42;
			local19 &= -local68 >> 31;
			@Pc(89) int local89 = local64 + (local42 + local68 - 1 >> 3);
			@Pc(90) int local90 = local68 + 24;
			arg2[local64] = (byte) (local19 |= local37 >>> local90);
			if (local89 > local64) {
				local64++;
				local68 = local90 - 8;
				arg2[local64] = (byte) (local19 = local37 >>> local68);
				if (local89 > local64) {
					local64++;
					local68 -= 8;
					arg2[local64] = (byte) (local19 = local37 >>> local68);
					if (local89 > local64) {
						local64++;
						local68 -= 8;
						arg2[local64] = (byte) (local19 = local37 >>> local68);
						if (local64 < local89) {
							local68 -= 8;
							local64++;
							arg2[local64] = (byte) (local19 = local37 << -local68);
						}
					}
				}
			}
			arg1++;
		}
		return (local23 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(III[B[BI)I")
	public int method3246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg4;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 < 0) {
				local23 = this.anIntArray417[local23];
			} else {
				local23++;
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local46;
				if (arg0 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(89) int local89;
			if ((local89 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local89;
				if (arg0 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(134) int local134;
			if ((local134 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local134;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(169) int local169;
			if ((local169 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local169;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(208) int local208;
			if ((local208 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local208;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(245) int local245;
			if ((local245 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local245;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(283) int local283;
			if ((local283 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local283;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray417[local23];
			}
			@Pc(325) int local325;
			if ((local325 = this.anIntArray417[local23]) < 0) {
				arg3[arg0++] = (byte) ~local325;
				if (local21 <= arg0) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}

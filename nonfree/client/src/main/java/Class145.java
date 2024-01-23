import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class145 {

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V")
	public Class145(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray352 = new int[local6];
		this.aByteArray46 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[] local18 = new int[33];
		this.anIntArray351 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(45) int local45 = 0x1 << 32 - local31;
				@Pc(49) int local49 = local18[local31];
				this.anIntArray352[local24] = local49;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(80) int local80;
				@Pc(89) int local89;
				if ((local49 & local45) == 0) {
					for (local73 = local31 - 1; local73 >= 1; local73--) {
						local80 = local18[local73];
						if (local80 != local49) {
							break;
						}
						local89 = 0x1 << 32 - local73;
						if ((local80 & local89) != 0) {
							local18[local73] = local18[local73 - 1];
							break;
						}
						local18[local73] = local80 | local89;
					}
					local67 = local49 | local45;
				} else {
					local67 = local18[local31 - 1];
				}
				local18[local31] = local67;
				for (local73 = local31 + 1; local73 <= 32; local73++) {
					if (local18[local73] == local49) {
						local18[local73] = local67;
					}
				}
				local73 = 0;
				for (local80 = 0; local80 < local31; local80++) {
					local89 = Integer.MIN_VALUE >>> local80;
					if ((local49 & local89) == 0) {
						local73++;
					} else {
						if (this.anIntArray351[local73] == 0) {
							this.anIntArray351[local73] = local15;
						}
						local73 = this.anIntArray351[local73];
					}
					if (local73 >= this.anIntArray351.length) {
						@Pc(197) int[] local197 = new int[this.anIntArray351.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray351.length; local199++) {
							local197[local199] = this.anIntArray351[local199];
						}
						this.anIntArray351 = local197;
					}
				}
				if (local73 >= local15) {
					local15 = local73 + 1;
				}
				this.anIntArray351[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[B[BIIB)I")
	public int method3532(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(19) int local19 = arg3;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg0;
		while (true) {
			@Pc(27) byte local27 = arg2[local23];
			if (local27 < 0) {
				local21 = this.anIntArray351[local21];
			} else {
				local21++;
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local46;
				if (arg4 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local79;
				if (local19 <= arg4) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local122;
				if (arg4 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(162) int local162;
			if ((local162 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local162;
				if (local19 <= arg4) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(201) int local201;
			if ((local201 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local201;
				if (arg4 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local242;
				if (local19 <= arg4) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local279;
				if (arg4 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray351[local21];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray351[local21]) < 0) {
				arg1[arg4++] = (byte) ~local315;
				if (local19 <= arg4) {
					break;
				}
				local21 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([BII[BII)I")
	public int method3536(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg4;
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg1 << 3;
		while (local11 > arg3) {
			@Pc(30) int local30 = arg2[arg3] & 0xFF;
			@Pc(35) int local35 = this.anIntArray352[local30];
			@Pc(40) byte local40 = this.aByteArray46[local30];
			if (local40 == 0) {
				throw new RuntimeException("No codeword for data value " + local30);
			}
			@Pc(58) int local58 = local21 >> 3;
			@Pc(62) int local62 = local21 & 0x7;
			@Pc(72) int local72 = (local62 + local40 - 1 >> 3) + local58;
			local21 += local40;
			local17 &= -local62 >> 31;
			@Pc(84) int local84 = local62 + 24;
			arg0[local58] = (byte) (local17 |= local35 >>> local84);
			if (local58 < local72) {
				local62 = local84 - 8;
				local58++;
				arg0[local58] = (byte) (local17 = local35 >>> local62);
				if (local58 < local72) {
					local62 -= 8;
					local58++;
					arg0[local58] = (byte) (local17 = local35 >>> local62);
					if (local58 < local72) {
						local62 -= 8;
						local58++;
						arg0[local58] = (byte) (local17 = local35 >>> local62);
						if (local72 > local58) {
							local62 -= 8;
							local58++;
							arg0[local58] = (byte) (local17 = local35 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local21 + 7 >> 3) - arg1;
	}
}

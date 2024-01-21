import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class97 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
	private final int[] anIntArray380;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[B")
	private final byte[] aByteArray54;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V")
	public Class97(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) int[] local9 = new int[33];
		this.anIntArray380 = new int[local6];
		@Pc(15) int local15 = 0;
		this.aByteArray54 = arg0;
		this.anIntArray381 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local9[local30];
				this.anIntArray380[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(89) int local89;
				if ((local46 & local42) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local9[local67];
						if (local73 != local46) {
							break;
						}
						local89 = 0x1 << 32 - local67;
						if ((local73 & local89) != 0) {
							local9[local67] = local9[local67 - 1];
							break;
						}
						local9[local67] = local73 | local89;
					}
					local61 = local42 | local46;
				} else {
					local61 = local9[local30 - 1];
				}
				local9[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local46 == local9[local67]) {
						local9[local67] = local61;
					}
				}
				local73 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local89;
					if ((local46 & local157) == 0) {
						local73++;
					} else {
						if (this.anIntArray381[local73] == 0) {
							this.anIntArray381[local73] = local15;
						}
						local73 = this.anIntArray381[local73];
					}
					if (local73 >= this.anIntArray381.length) {
						@Pc(202) int[] local202 = new int[this.anIntArray381.length * 2];
						for (@Pc(204) int local204 = 0; local204 < this.anIntArray381.length; local204++) {
							local202[local204] = this.anIntArray381[local204];
						}
						this.anIntArray381 = local202;
					}
				}
				if (local73 >= local15) {
					local15 = local73 + 1;
				}
				this.anIntArray381[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II[BBI[B)I")
	public int method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg4[local20];
			if (local29 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local48;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local90;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(129) int local129;
			if ((local129 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local129;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(167) int local167;
			if ((local167 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local167;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(205) int local205;
			if ((local205 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local205;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(237) int local237;
			if ((local237 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local237;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local279;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray381[local18];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray381[local18]) < 0) {
				arg2[arg0++] = (byte) ~local315;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III[BI[B)I")
	public int method3317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = arg2;
		@Pc(11) int local11 = arg1 << 3;
		@Pc(13) int local13 = 0;
		while (arg0 < local7) {
			@Pc(20) int local20 = arg3[arg0] & 0xFF;
			@Pc(25) byte local25 = this.aByteArray54[local20];
			@Pc(30) int local30 = this.anIntArray380[local20];
			if (local25 == 0) {
				throw new RuntimeException("No codeword for data value " + local20);
			}
			@Pc(50) int local50 = local11 >> 3;
			@Pc(54) int local54 = local11 & 0x7;
			local13 &= -local54 >> 31;
			@Pc(71) int local71 = local50 + (local25 + local54 - 1 >> 3);
			@Pc(72) int local72 = local54 + 24;
			arg4[local50] = (byte) (local13 |= local30 >>> local72);
			if (local50 < local71) {
				local50++;
				local54 = local72 - 8;
				arg4[local50] = (byte) (local13 = local30 >>> local54);
				if (local50 < local71) {
					local50++;
					local54 -= 8;
					arg4[local50] = (byte) (local13 = local30 >>> local54);
					if (local71 > local50) {
						local54 -= 8;
						local50++;
						arg4[local50] = (byte) (local13 = local30 >>> local54);
						if (local50 < local71) {
							local54 -= 8;
							local50++;
							arg4[local50] = (byte) (local13 = local30 << -local54);
						}
					}
				}
			}
			local11 += local25;
			arg0++;
		}
		return (local11 + 7 >> 3) - arg1;
	}
}

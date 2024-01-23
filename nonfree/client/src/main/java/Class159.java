import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class159 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
	public Class159(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray490 = new int[local6];
		this.anIntArray489 = new int[8];
		this.aByteArray51 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(44) int local44 = 0x1 << 32 - local35;
				@Pc(48) int local48 = local20[local35];
				this.anIntArray490[local24] = local48;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(81) int local81;
				@Pc(97) int local97;
				if ((local48 & local44) == 0) {
					for (local72 = local35 - 1; local72 >= 1; local72--) {
						local81 = local20[local72];
						if (local48 != local81) {
							break;
						}
						local97 = 0x1 << 32 - local72;
						if ((local97 & local81) != 0) {
							local20[local72] = local20[local72 - 1];
							break;
						}
						local20[local72] = local97 | local81;
					}
					local66 = local48 | local44;
				} else {
					local66 = local20[local35 - 1];
				}
				local20[local35] = local66;
				for (local72 = local35 + 1; local72 <= 32; local72++) {
					if (local20[local72] == local48) {
						local20[local72] = local66;
					}
				}
				local72 = 0;
				for (local81 = 0; local81 < local35; local81++) {
					local97 = Integer.MIN_VALUE >>> local81;
					if ((local48 & local97) == 0) {
						local72++;
					} else {
						if (this.anIntArray489[local72] == 0) {
							this.anIntArray489[local72] = local22;
						}
						local72 = this.anIntArray489[local72];
					}
					if (local72 >= this.anIntArray489.length) {
						@Pc(208) int[] local208 = new int[this.anIntArray489.length * 2];
						for (@Pc(210) int local210 = 0; local210 < this.anIntArray489.length; local210++) {
							local208[local210] = this.anIntArray489[local210];
						}
						this.anIntArray489 = local208;
					}
				}
				this.anIntArray489[local72] = ~local24;
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI[BI[BI)I")
	public int method4045(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg2;
		while (true) {
			@Pc(32) byte local32 = arg1[local28];
			if (local32 >= 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local52;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(93) int local93;
			if ((local93 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local93;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(131) int local131;
			if ((local131 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local131;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(172) int local172;
			if ((local172 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local172;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(211) int local211;
			if ((local211 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local211;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(250) int local250;
			if ((local250 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local250;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local292;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray489[local26];
			}
			@Pc(336) int local336;
			if ((local336 = this.anIntArray489[local26]) < 0) {
				arg3[arg4++] = (byte) ~local336;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg2;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[BII[BI)I")
	public int method4048(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(5) int local5 = arg3 << 3;
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0;
		while (local15 > arg2) {
			@Pc(30) int local30 = arg4[arg2] & 0xFF;
			@Pc(35) int local35 = this.anIntArray490[local30];
			@Pc(40) byte local40 = this.aByteArray51[local30];
			if (local40 == 0) {
				throw new RuntimeException("No codeword for data value " + local30);
			}
			@Pc(62) int local62 = local5 >> 3;
			@Pc(66) int local66 = local5 & 0x7;
			local5 += local40;
			@Pc(81) int local81 = local62 + (local66 + local40 - 1 >> 3);
			local7 &= -local66 >> 31;
			@Pc(89) int local89 = local66 + 24;
			arg1[local62] = (byte) (local7 |= local35 >>> local89);
			if (local81 > local62) {
				local66 = local89 - 8;
				local62++;
				arg1[local62] = (byte) (local7 = local35 >>> local66);
				if (local81 > local62) {
					local62++;
					local66 -= 8;
					arg1[local62] = (byte) (local7 = local35 >>> local66);
					if (local81 > local62) {
						local62++;
						local66 -= 8;
						arg1[local62] = (byte) (local7 = local35 >>> local66);
						if (local81 > local62) {
							local66 -= 8;
							local62++;
							arg1[local62] = (byte) (local7 = local35 << -local66);
						}
					}
				}
			}
			arg2++;
		}
		return (local5 + 7 >> 3) - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class70 {

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([B)V")
	public Class70(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray233 = new int[local6];
		this.anIntArray232 = new int[8];
		@Pc(17) int[] local17 = new int[33];
		this.aByteArray52 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(45) int local45 = 0x1 << 32 - local35;
				@Pc(49) int local49 = local17[local35];
				this.anIntArray233[local24] = local49;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local49 & local45) == 0) {
					local62 = local49 | local45;
					for (local66 = local35 - 1; local66 >= 1; local66--) {
						local73 = local17[local66];
						if (local49 != local73) {
							break;
						}
						local85 = 0x1 << 32 - local66;
						if ((local85 & local73) != 0) {
							local17[local66] = local17[local66 - 1];
							break;
						}
						local17[local66] = local73 | local85;
					}
				} else {
					local62 = local17[local35 - 1];
				}
				local17[local35] = local62;
				for (local66 = local35 + 1; local66 <= 32; local66++) {
					if (local17[local66] == local49) {
						local17[local66] = local62;
					}
				}
				local66 = 0;
				for (local73 = 0; local73 < local35; local73++) {
					local85 = Integer.MIN_VALUE >>> local73;
					if ((local85 & local49) == 0) {
						local66++;
					} else {
						if (this.anIntArray232[local66] == 0) {
							this.anIntArray232[local66] = local22;
						}
						local66 = this.anIntArray232[local66];
					}
					if (this.anIntArray232.length <= local66) {
						@Pc(200) int[] local200 = new int[this.anIntArray232.length * 2];
						for (@Pc(202) int local202 = 0; local202 < this.anIntArray232.length; local202++) {
							local200[local202] = this.anIntArray232[local202];
						}
						this.anIntArray232 = local200;
					}
				}
				this.anIntArray232[local66] = ~local24;
				if (local66 >= local22) {
					local22 = local66 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[B[BII)I")
	public int method1731(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = arg3;
		while (true) {
			@Pc(21) byte local21 = arg1[local17];
			if (local21 >= 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local40;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local79;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local118;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local158;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local193;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local229;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local267;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray232[local11];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray232[local11]) < 0) {
				arg2[arg4++] = (byte) ~local302;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg3;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II[B[BII)I")
	public int method1732(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3;
		@Pc(18) int local18 = arg4 << 3;
		@Pc(20) int local20 = 0;
		while (arg0 < local10) {
			@Pc(29) int local29 = arg1[arg0] & 0xFF;
			@Pc(34) int local34 = this.anIntArray233[local29];
			@Pc(39) byte local39 = this.aByteArray52[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(61) int local61 = local18 >> 3;
			@Pc(65) int local65 = local18 & 0x7;
			local18 += local39;
			local20 &= -local65 >> 31;
			@Pc(87) int local87 = local61 + (local65 + local39 - 1 >> 3);
			@Pc(88) int local88 = local65 + 24;
			arg2[local61] = (byte) (local20 |= local34 >>> local88);
			if (local61 < local87) {
				local65 = local88 - 8;
				local61++;
				arg2[local61] = (byte) (local20 = local34 >>> local65);
				if (local61 < local87) {
					local65 -= 8;
					local61++;
					arg2[local61] = (byte) (local20 = local34 >>> local65);
					if (local61 < local87) {
						local65 -= 8;
						local61++;
						arg2[local61] = (byte) (local20 = local34 >>> local65);
						if (local61 < local87) {
							local65 -= 8;
							local61++;
							arg2[local61] = (byte) (local20 = local34 << -local65);
						}
					}
				}
			}
			arg0++;
		}
		return (local18 + 7 >> 3) - arg4;
	}
}

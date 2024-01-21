import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class50 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
	private final int[] anIntArray160;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class50(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray13 = arg0;
		this.anIntArray160 = new int[local6];
		this.anIntArray161 = new int[8];
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local22[local30];
				this.anIntArray160[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(82) int local82;
				if ((local43 & local39) == 0) {
					local59 = local43 | local39;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local22[local63];
						if (local69 != local43) {
							break;
						}
						local82 = 0x1 << 32 - local63;
						if ((local69 & local82) != 0) {
							local22[local63] = local22[local63 - 1];
							break;
						}
						local22[local63] = local69 | local82;
					}
				} else {
					local59 = local22[local30 - 1];
				}
				local22[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local22[local63] == local43) {
						local22[local63] = local59;
					}
				}
				local69 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(159) int local159 = Integer.MIN_VALUE >>> local82;
					if ((local159 & local43) == 0) {
						local69++;
					} else {
						if (this.anIntArray161[local69] == 0) {
							this.anIntArray161[local69] = local19;
						}
						local69 = this.anIntArray161[local69];
					}
					if (local69 >= this.anIntArray161.length) {
						@Pc(196) int[] local196 = new int[this.anIntArray161.length * 2];
						for (@Pc(198) int local198 = 0; local198 < this.anIntArray161.length; local198++) {
							local196[local198] = this.anIntArray161[local198];
						}
						this.anIntArray161 = local196;
					}
				}
				if (local19 <= local69) {
					local19 = local69 + 1;
				}
				this.anIntArray161[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BI[BI)I")
	public int method1359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg4;
		@Pc(17) int local17 = arg1;
		while (true) {
			@Pc(26) byte local26 = arg3[local17];
			if (local26 < 0) {
				local11 = this.anIntArray161[local11];
			} else {
				local11++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local45;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local80;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local115;
				if (local15 <= arg0) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(154) int local154;
			if ((local154 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local154;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local193;
				if (local15 <= arg0) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local232;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(274) int local274;
			if ((local274 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local274;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray161[local11];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray161[local11]) < 0) {
				arg2[arg0++] = (byte) ~local306;
				if (arg0 >= local15) {
					break;
				}
				local11 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BBII[BI)I")
	public int method1361(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(7) int local7 = 0;
		@Pc(27) int local27 = arg2 << 3;
		while (local5 > arg4) {
			@Pc(35) int local35 = arg3[arg4] & 0xFF;
			@Pc(40) int local40 = this.anIntArray160[local35];
			@Pc(45) byte local45 = this.aByteArray13[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(65) int local65 = local27 >> 3;
			@Pc(69) int local69 = local27 & 0x7;
			local27 += local45;
			@Pc(84) int local84 = (local69 + local45 - 1 >> 3) + local65;
			local7 &= -local69 >> 31;
			@Pc(92) int local92 = local69 + 24;
			arg0[local65] = (byte) (local7 |= local40 >>> local92);
			if (local84 > local65) {
				local69 = local92 - 8;
				local65++;
				arg0[local65] = (byte) (local7 = local40 >>> local69);
				if (local65 < local84) {
					local69 -= 8;
					local65++;
					arg0[local65] = (byte) (local7 = local40 >>> local69);
					if (local84 > local65) {
						local69 -= 8;
						local65++;
						arg0[local65] = (byte) (local7 = local40 >>> local69);
						if (local84 > local65) {
							local65++;
							local69 -= 8;
							arg0[local65] = (byte) (local7 = local40 << -local69);
						}
					}
				}
			}
			arg4++;
		}
		return (local27 + 7 >> 3) - arg2;
	}
}

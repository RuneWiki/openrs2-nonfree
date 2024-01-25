import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class248 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
	private final int[] anIntArray475;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "[B")
	private final byte[] aByteArray196;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "([B)V")
	public Class248(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray475 = new int[local6];
		this.aByteArray196 = arg0;
		this.anIntArray474 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray475[local24] = local42;
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(75) int local75;
				if ((local42 & local38) == 0) {
					local55 = local38 | local42;
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local65 != local42) {
							break;
						}
						local75 = 0x1 << 32 - local59;
						if ((local65 & local75) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local75 | local65;
					}
				} else {
					local55 = local20[local30 - 1];
				}
				local20[local30] = local55;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local42 == local20[local59]) {
						local20[local59] = local55;
					}
				}
				local65 = 0;
				for (local75 = 0; local75 < local30; local75++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local75;
					if ((local147 & local42) == 0) {
						local65++;
					} else {
						if (this.anIntArray474[local65] == 0) {
							this.anIntArray474[local65] = local22;
						}
						local65 = this.anIntArray474[local65];
					}
					if (local65 >= this.anIntArray474.length) {
						@Pc(184) int[] local184 = new int[this.anIntArray474.length * 2];
						for (@Pc(186) int local186 = 0; local186 < this.anIntArray474.length; local186++) {
							local184[local186] = this.anIntArray474[local186];
						}
						this.anIntArray474 = local184;
					}
				}
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
				this.anIntArray474[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BII[BIZ)I")
	public int method5549(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = arg2;
		@Pc(32) int local32 = arg4;
		while (true) {
			@Pc(36) byte local36 = arg3[local32];
			if (local36 >= 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local52;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local90;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local126;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(168) int local168;
			if ((local168 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local168;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local203;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(241) int local241;
			if ((local241 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local241;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(276) int local276;
			if ((local276 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local276;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray474[local26];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray474[local26]) < 0) {
				arg0[arg1++] = (byte) ~local315;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			local32++;
		}
		return local32 + 1 - arg4;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([BII[BII)I")
	public int method5551(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3 << 3;
		@Pc(15) int local15 = arg1;
		while (arg4 < local15) {
			@Pc(23) int local23 = arg0[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray475[local23];
			@Pc(33) byte local33 = this.aByteArray196[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local11 >> 3;
			@Pc(54) int local54 = local11 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = (local54 + local33 - 1 >> 3) + local50;
			@Pc(72) int local72 = local54 + 24;
			arg2[local50] = (byte) (local7 |= local28 >>> local72);
			if (local71 > local50) {
				local54 = local72 - 8;
				local50++;
				arg2[local50] = (byte) (local7 = local28 >>> local54);
				if (local71 > local50) {
					local54 -= 8;
					local50++;
					arg2[local50] = (byte) (local7 = local28 >>> local54);
					if (local71 > local50) {
						local54 -= 8;
						local50++;
						arg2[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local71) {
							local50++;
							local54 -= 8;
							arg2[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			local11 += local33;
			arg4++;
		}
		return (local11 + 7 >> 3) - arg3;
	}
}

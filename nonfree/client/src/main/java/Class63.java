import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class63 {

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	private final int[] anIntArray335;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
	public Class63(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray336 = new int[8];
		this.anIntArray335 = new int[local6];
		@Pc(17) int[] local17 = new int[33];
		this.aByteArray36 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local17[local30];
				this.anIntArray335[local24] = local46;
				@Pc(111) int local111;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(79) int local79;
				if ((local42 & local46) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local17[local59];
						if (local65 != local46) {
							break;
						}
						local79 = 0x1 << 32 - local59;
						if ((local65 & local79) != 0) {
							local17[local59] = local17[local59 - 1];
							break;
						}
						local17[local59] = local65 | local79;
					}
					local111 = local42 | local46;
				} else {
					local111 = local17[local30 - 1];
				}
				local17[local30] = local111;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local17[local59] == local46) {
						local17[local59] = local111;
					}
				}
				local65 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local79;
					if ((local156 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray336[local65] == 0) {
							this.anIntArray336[local65] = local22;
						}
						local65 = this.anIntArray336[local65];
					}
					if (local65 >= this.anIntArray336.length) {
						@Pc(193) int[] local193 = new int[this.anIntArray336.length * 2];
						for (@Pc(195) int local195 = 0; local195 < this.anIntArray336.length; local195++) {
							local193[local195] = this.anIntArray336[local195];
						}
						this.anIntArray336 = local193;
					}
				}
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
				this.anIntArray336[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[BI[BB)I")
	public int method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(13) int local13 = arg3 << 3;
		@Pc(15) int local15 = 0;
		while (local5 > arg0) {
			@Pc(23) int local23 = arg2[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray335[local23];
			@Pc(33) byte local33 = this.aByteArray36[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local13 >> 3;
			@Pc(54) int local54 = local13 & 0x7;
			@Pc(64) int local64 = (local33 + local54 - 1 >> 3) + local50;
			local13 += local33;
			local15 &= -local54 >> 31;
			@Pc(76) int local76 = local54 + 24;
			arg4[local50] = (byte) (local15 |= local28 >>> local76);
			if (local64 > local50) {
				local50++;
				local54 = local76 - 8;
				arg4[local50] = (byte) (local15 = local28 >>> local54);
				if (local64 > local50) {
					local54 -= 8;
					local50++;
					arg4[local50] = (byte) (local15 = local28 >>> local54);
					if (local50 < local64) {
						local54 -= 8;
						local50++;
						arg4[local50] = (byte) (local15 = local28 >>> local54);
						if (local50 < local64) {
							local50++;
							local54 -= 8;
							arg4[local50] = (byte) (local15 = local28 << -local54);
						}
					}
				}
			}
			arg0++;
		}
		return (local13 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[B[BI)I")
	public int method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = 0;
		@Pc(26) int local26 = arg2;
		while (true) {
			@Pc(30) byte local30 = arg3[local26];
			if (local30 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local49;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(88) int local88;
			if ((local88 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local88;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local127;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(162) int local162;
			if ((local162 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local162;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local200;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(235) int local235;
			if ((local235 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local235;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local273;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray336[local18];
			}
			@Pc(308) int local308;
			if ((local308 = this.anIntArray336[local18]) < 0) {
				arg4[arg0++] = (byte) ~local308;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class21 {

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
	private final int[] anIntArray130;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class21(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray33 = arg0;
		this.anIntArray132 = new int[8];
		this.anIntArray130 = new int[local6];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray130[local24] = local42;
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(80) int local80;
				if ((local38 & local42) == 0) {
					local55 = local38 | local42;
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local65 != local42) {
							break;
						}
						local80 = 0x1 << 32 - local59;
						if ((local65 & local80) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local80 | local65;
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
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local80;
					if ((local149 & local42) == 0) {
						local65++;
					} else {
						if (this.anIntArray132[local65] == 0) {
							this.anIntArray132[local65] = local22;
						}
						local65 = this.anIntArray132[local65];
					}
					if (this.anIntArray132.length <= local65) {
						@Pc(190) int[] local190 = new int[this.anIntArray132.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray132.length; local192++) {
							local190[local192] = this.anIntArray132[local192];
						}
						this.anIntArray132 = local190;
					}
				}
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
				this.anIntArray132[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BIB[B)I")
	public int method729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 << 3;
		@Pc(15) int local15 = 0;
		while (arg0 < local9) {
			@Pc(28) int local28 = arg4[arg0] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray33[local28];
			@Pc(38) int local38 = this.anIntArray130[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local13 & 0x7;
			local15 &= -local58 >> 31;
			@Pc(69) int local69 = local13 >> 3;
			@Pc(79) int local79 = (local33 + local58 - 1 >> 3) + local69;
			@Pc(80) int local80 = local58 + 24;
			arg2[local69] = (byte) (local15 |= local38 >>> local80);
			if (local79 > local69) {
				local58 = local80 - 8;
				local69++;
				arg2[local69] = (byte) (local15 = local38 >>> local58);
				if (local79 > local69) {
					local58 -= 8;
					local69++;
					arg2[local69] = (byte) (local15 = local38 >>> local58);
					if (local69 < local79) {
						local69++;
						local58 -= 8;
						arg2[local69] = (byte) (local15 = local38 >>> local58);
						if (local79 > local69) {
							local58 -= 8;
							local69++;
							arg2[local69] = (byte) (local15 = local38 << -local58);
						}
					}
				}
			}
			local13 += local33;
			arg0++;
		}
		return (local13 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BIIII[B)I")
	public int method731(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 < 0) {
				local23 = this.anIntArray132[local23];
			} else {
				local23++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local45;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local80;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(112) int local112;
			if ((local112 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local112;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(150) int local150;
			if ((local150 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local150;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(182) int local182;
			if ((local182 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local182;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local214;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(249) int local249;
			if ((local249 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local249;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray132[local23];
			}
			@Pc(287) int local287;
			if ((local287 = this.anIntArray132[local23]) < 0) {
				arg4[arg3++] = (byte) ~local287;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}

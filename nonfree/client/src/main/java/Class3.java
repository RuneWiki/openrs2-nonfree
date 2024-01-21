import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
	private final int[] anIntArray16;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([B)V")
	public Class3(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray16 = new int[local6];
		@Pc(12) int local12 = 0;
		this.anIntArray15 = new int[8];
		@Pc(19) int[] local19 = new int[33];
		this.aByteArray1 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local19[local30];
				this.anIntArray16[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(78) int local78;
				if ((local46 & local42) == 0) {
					local59 = local46 | local42;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local19[local63];
						if (local46 != local69) {
							break;
						}
						local78 = 0x1 << 32 - local63;
						if ((local78 & local69) != 0) {
							local19[local63] = local19[local63 - 1];
							break;
						}
						local19[local63] = local78 | local69;
					}
				} else {
					local59 = local19[local30 - 1];
				}
				local19[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local46 == local19[local63]) {
						local19[local63] = local59;
					}
				}
				local69 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local78;
					if ((local46 & local149) == 0) {
						local69++;
					} else {
						if (this.anIntArray15[local69] == 0) {
							this.anIntArray15[local69] = local12;
						}
						local69 = this.anIntArray15[local69];
					}
					if (local69 >= this.anIntArray15.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray15.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray15.length; local192++) {
							local190[local192] = this.anIntArray15[local192];
						}
						this.anIntArray15 = local190;
					}
				}
				this.anIntArray15[local69] = ~local24;
				if (local69 >= local12) {
					local12 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIII[B)I")
	public int method58(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg3;
		while (true) {
			@Pc(26) byte local26 = arg4[local22];
			if (local26 < 0) {
				local20 = this.anIntArray15[local20];
			} else {
				local20++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local42;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local84;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local119;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local158;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(190) int local190;
			if ((local190 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local190;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local232;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local267;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray15[local20];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray15[local20]) < 0) {
				arg1[arg0++] = (byte) ~local299;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg3;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII[B[B)I")
	public int method60(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg1 << 3;
		while (local5 > arg0) {
			@Pc(23) int local23 = arg4[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray16[local23];
			@Pc(33) byte local33 = this.aByteArray1[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 & 0x7;
			local7 &= -local53 >> 31;
			@Pc(64) int local64 = local15 >> 3;
			local15 += local33;
			@Pc(78) int local78 = local64 + (local53 + local33 - 1 >> 3);
			@Pc(79) int local79 = local53 + 24;
			arg3[local64] = (byte) (local7 |= local28 >>> local79);
			if (local78 > local64) {
				local64++;
				local53 = local79 - 8;
				arg3[local64] = (byte) (local7 = local28 >>> local53);
				if (local78 > local64) {
					local64++;
					local53 -= 8;
					arg3[local64] = (byte) (local7 = local28 >>> local53);
					if (local78 > local64) {
						local64++;
						local53 -= 8;
						arg3[local64] = (byte) (local7 = local28 >>> local53);
						if (local78 > local64) {
							local64++;
							local53 -= 8;
							arg3[local64] = (byte) (local7 = local28 << -local53);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg1;
	}
}

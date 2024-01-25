import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class215 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "[I")
	private final int[] anIntArray541;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "[I")
	private int[] anIntArray542;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "([B)V")
	public Class215(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray541 = new int[local6];
		this.aByteArray76 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray542 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local16[local30];
				this.anIntArray541[local24] = local45;
				@Pc(108) int local108;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(77) int local77;
				if ((local45 & local41) == 0) {
					for (local61 = local30 - 1; local61 >= 1; local61--) {
						local67 = local16[local61];
						if (local45 != local67) {
							break;
						}
						local77 = 0x1 << 32 - local61;
						if ((local67 & local77) != 0) {
							local16[local61] = local16[local61 - 1];
							break;
						}
						local16[local61] = local67 | local77;
					}
					local108 = local45 | local41;
				} else {
					local108 = local16[local30 - 1];
				}
				local16[local30] = local108;
				for (local61 = local30 + 1; local61 <= 32; local61++) {
					if (local45 == local16[local61]) {
						local16[local61] = local108;
					}
				}
				local67 = 0;
				for (local77 = 0; local77 < local30; local77++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local77;
					if ((local45 & local149) == 0) {
						local67++;
					} else {
						if (this.anIntArray542[local67] == 0) {
							this.anIntArray542[local67] = local22;
						}
						local67 = this.anIntArray542[local67];
					}
					if (this.anIntArray542.length <= local67) {
						@Pc(194) int[] local194 = new int[this.anIntArray542.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray542.length; local196++) {
							local194[local196] = this.anIntArray542[local196];
						}
						this.anIntArray542 = local194;
					}
				}
				if (local67 >= local22) {
					local22 = local67 + 1;
				}
				this.anIntArray542[local67] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([B[BIIII)I")
	public int method4887(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 << 3;
		while (local9 > arg2) {
			@Pc(26) int local26 = arg1[arg2] & 0xFF;
			@Pc(31) int local31 = this.anIntArray541[local26];
			@Pc(36) byte local36 = this.aByteArray76[local26];
			if (local36 == 0) {
				throw new RuntimeException("No codeword for data value " + local26);
			}
			@Pc(53) int local53 = local13 >> 3;
			@Pc(57) int local57 = local13 & 0x7;
			local5 &= -local57 >> 31;
			@Pc(75) int local75 = local53 + (local36 + local57 - 1 >> 3);
			local13 += local36;
			@Pc(80) int local80 = local57 + 24;
			arg0[local53] = (byte) (local5 |= local31 >>> local80);
			if (local53 < local75) {
				local53++;
				local57 = local80 - 8;
				arg0[local53] = (byte) (local5 = local31 >>> local57);
				if (local75 > local53) {
					local53++;
					local57 -= 8;
					arg0[local53] = (byte) (local5 = local31 >>> local57);
					if (local75 > local53) {
						local53++;
						local57 -= 8;
						arg0[local53] = (byte) (local5 = local31 >>> local57);
						if (local53 < local75) {
							local53++;
							local57 -= 8;
							arg0[local53] = (byte) (local5 = local31 << -local57);
						}
					}
				}
			}
			arg2++;
		}
		return (local13 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIIII[B)I")
	public int method4890(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(28) int local28 = arg2;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = arg1;
		while (true) {
			@Pc(36) byte local36 = arg0[local32];
			if (local36 < 0) {
				local30 = this.anIntArray542[local30];
			} else {
				local30++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local52;
				if (arg3 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local90;
				if (local28 <= arg3) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local125;
				if (arg3 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local157;
				if (arg3 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(189) int local189;
			if ((local189 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local189;
				if (arg3 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local225;
				if (arg3 >= local28) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local264;
				if (local28 <= arg3) {
					break;
				}
				local30 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local30++;
			} else {
				local30 = this.anIntArray542[local30];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray542[local30]) < 0) {
				arg4[arg3++] = (byte) ~local299;
				if (local28 <= arg3) {
					break;
				}
				local30 = 0;
			}
			local32++;
		}
		return local32 + 1 - arg1;
	}
}

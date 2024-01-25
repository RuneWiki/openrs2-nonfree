import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class245 {

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "[I")
	private final int[] anIntArray586;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "[I")
	private int[] anIntArray585;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "([B)V")
	public Class245(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray586 = new int[local6];
		this.aByteArray75 = arg0;
		this.anIntArray585 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray586[local24] = local46;
				@Pc(107) int local107;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(75) int local75;
				if ((local46 & local42) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local46 != local65) {
							break;
						}
						local75 = 0x1 << 32 - local59;
						if ((local65 & local75) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local75 | local65;
					}
					local107 = local42 | local46;
				} else {
					local107 = local20[local30 - 1];
				}
				local20[local30] = local107;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local46 == local20[local59]) {
						local20[local59] = local107;
					}
				}
				local65 = 0;
				for (local75 = 0; local75 < local30; local75++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local75;
					if ((local148 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray585[local65] == 0) {
							this.anIntArray585[local65] = local22;
						}
						local65 = this.anIntArray585[local65];
					}
					if (this.anIntArray585.length <= local65) {
						@Pc(188) int[] local188 = new int[this.anIntArray585.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray585.length; local190++) {
							local188[local190] = this.anIntArray585[local190];
						}
						this.anIntArray585 = local188;
					}
				}
				this.anIntArray585[local65] = ~local24;
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIII[B[B)I")
	public int method5906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(23) int local23 = arg0;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 < 0) {
				local11 = this.anIntArray585[local11];
			} else {
				local11++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local45;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local81;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local119;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local157;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(195) int local195;
			if ((local195 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local195;
				if (arg1 >= local23) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local230;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(266) int local266;
			if ((local266 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local266;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray585[local11];
			}
			@Pc(305) int local305;
			if ((local305 = this.anIntArray585[local11]) < 0) {
				arg3[arg1++] = (byte) ~local305;
				if (local23 <= arg1) {
					break;
				}
				local11 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[B[BIII)I")
	public int method5909(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		@Pc(15) int local15 = arg2;
		while (local15 > arg3) {
			@Pc(23) int local23 = arg1[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray586[local23];
			@Pc(33) byte local33 = this.aByteArray75[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local11 >> 3;
			@Pc(57) int local57 = local11 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(75) int local75 = (local57 + local33 - 1 >> 3) + local53;
			@Pc(76) int local76 = local57 + 24;
			arg0[local53] = (byte) (local7 |= local28 >>> local76);
			if (local53 < local75) {
				local57 = local76 - 8;
				local53++;
				arg0[local53] = (byte) (local7 = local28 >>> local57);
				if (local75 > local53) {
					local53++;
					local57 -= 8;
					arg0[local53] = (byte) (local7 = local28 >>> local57);
					if (local75 > local53) {
						local53++;
						local57 -= 8;
						arg0[local53] = (byte) (local7 = local28 >>> local57);
						if (local53 < local75) {
							local53++;
							local57 -= 8;
							arg0[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			local11 += local33;
			arg3++;
		}
		return (local11 + 7 >> 3) - arg4;
	}
}

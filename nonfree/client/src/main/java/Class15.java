import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class15 {

	@OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
	private final int[] anIntArray51;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
	public Class15(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray52 = new int[8];
		this.anIntArray51 = new int[local6];
		this.aByteArray4 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray51[local24] = local46;
				@Pc(113) int local113;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(79) int local79;
				if ((local46 & local42) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local46 != local65) {
							break;
						}
						local79 = 0x1 << 32 - local59;
						if ((local79 & local65) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local65 | local79;
					}
					local113 = local46 | local42;
				} else {
					local113 = local20[local30 - 1];
				}
				local20[local30] = local113;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local20[local59] == local46) {
						local20[local59] = local113;
					}
				}
				local65 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local79;
					if ((local154 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray52[local65] == 0) {
							this.anIntArray52[local65] = local22;
						}
						local65 = this.anIntArray52[local65];
					}
					if (this.anIntArray52.length <= local65) {
						@Pc(198) int[] local198 = new int[this.anIntArray52.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray52.length; local200++) {
							local198[local200] = this.anIntArray52[local200];
						}
						this.anIntArray52 = local198;
					}
				}
				this.anIntArray52[local65] = ~local24;
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([BII[BII)I")
	public int method572(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = arg1;
		while (true) {
			@Pc(32) byte local32 = arg2[local28];
			if (local32 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(51) int local51;
			if ((local51 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local51;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local86;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local118;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local156;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local194;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local229;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local267;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray52[local18];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray52[local18]) < 0) {
				arg0[arg4++] = (byte) ~local306;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I[BIII[B)I")
	public int method574(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2 << 3;
		while (local5 > arg1) {
			@Pc(23) int local23 = arg4[arg1] & 0xFF;
			@Pc(28) int local28 = this.anIntArray51[local23];
			@Pc(33) byte local33 = this.aByteArray4[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local11 &= -local54 >> 31;
			local15 += local33;
			@Pc(76) int local76 = (local54 + local33 - 1 >> 3) + local50;
			@Pc(77) int local77 = local54 + 24;
			arg0[local50] = (byte) (local11 |= local28 >>> local77);
			if (local76 > local50) {
				local50++;
				local54 = local77 - 8;
				arg0[local50] = (byte) (local11 = local28 >>> local54);
				if (local76 > local50) {
					local50++;
					local54 -= 8;
					arg0[local50] = (byte) (local11 = local28 >>> local54);
					if (local76 > local50) {
						local54 -= 8;
						local50++;
						arg0[local50] = (byte) (local11 = local28 >>> local54);
						if (local50 < local76) {
							local54 -= 8;
							local50++;
							arg0[local50] = (byte) (local11 = local28 << -local54);
						}
					}
				}
			}
			arg1++;
		}
		return (local15 + 7 >> 3) - arg2;
	}
}

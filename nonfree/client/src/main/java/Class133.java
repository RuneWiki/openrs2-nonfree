import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class133 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
	private final int[] anIntArray373;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
	public Class133(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray373 = new int[local6];
		this.aByteArray46 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray374 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray373[local24] = local46;
				@Pc(106) int local106;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(76) int local76;
				if ((local46 & local42) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local16[local59];
						if (local65 != local46) {
							break;
						}
						local76 = 0x1 << 32 - local59;
						if ((local65 & local76) != 0) {
							local16[local59] = local16[local59 - 1];
							break;
						}
						local16[local59] = local65 | local76;
					}
					local106 = local42 | local46;
				} else {
					local106 = local16[local30 - 1];
				}
				local16[local30] = local106;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local46 == local16[local59]) {
						local16[local59] = local106;
					}
				}
				local65 = 0;
				for (local76 = 0; local76 < local30; local76++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local76;
					if ((local151 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray374[local65] == 0) {
							this.anIntArray374[local65] = local22;
						}
						local65 = this.anIntArray374[local65];
					}
					if (local65 >= this.anIntArray374.length) {
						@Pc(188) int[] local188 = new int[this.anIntArray374.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray374.length; local190++) {
							local188[local190] = this.anIntArray374[local190];
						}
						this.anIntArray374 = local188;
					}
				}
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
				this.anIntArray374[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BIII[B)I")
	public int method3382(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg3 << 3;
		@Pc(13) int local13 = arg0;
		while (local13 > arg2) {
			@Pc(24) int local24 = arg4[arg2] & 0xFF;
			@Pc(29) int local29 = this.anIntArray373[local24];
			@Pc(34) byte local34 = this.aByteArray46[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local9 >> 3;
			@Pc(58) int local58 = local9 & 0x7;
			local5 &= -local58 >> 31;
			@Pc(76) int local76 = local54 + (local58 + local34 - 1 >> 3);
			@Pc(77) int local77 = local58 + 24;
			arg1[local54] = (byte) (local5 |= local29 >>> local77);
			if (local54 < local76) {
				local54++;
				local58 = local77 - 8;
				arg1[local54] = (byte) (local5 = local29 >>> local58);
				if (local76 > local54) {
					local58 -= 8;
					local54++;
					arg1[local54] = (byte) (local5 = local29 >>> local58);
					if (local54 < local76) {
						local58 -= 8;
						local54++;
						arg1[local54] = (byte) (local5 = local29 >>> local58);
						if (local76 > local54) {
							local54++;
							local58 -= 8;
							arg1[local54] = (byte) (local5 = local29 << -local58);
						}
					}
				}
			}
			local9 += local34;
			arg2++;
		}
		return (local9 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([BIII[BI)I")
	public int method3383(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg1;
		while (true) {
			@Pc(26) byte local26 = arg0[local22];
			if (local26 < 0) {
				local15 = this.anIntArray374[local15];
			} else {
				local15++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local45;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local83;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(118) int local118;
			if ((local118 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local118;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local157;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local193;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(228) int local228;
			if ((local228 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local228;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local267;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray374[local15];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray374[local15]) < 0) {
				arg4[arg2++] = (byte) ~local309;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg1;
	}
}

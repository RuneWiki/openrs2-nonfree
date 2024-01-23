import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class118 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V")
	public Class118(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray351 = new int[local6];
		this.aByteArray49 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray352 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray351[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(85) int local85;
				if ((local39 & local43) == 0) {
					local59 = local43 | local39;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local16[local63];
						if (local43 != local69) {
							break;
						}
						local85 = 0x1 << 32 - local63;
						if ((local85 & local69) != 0) {
							local16[local63] = local16[local63 - 1];
							break;
						}
						local16[local63] = local69 | local85;
					}
				} else {
					local59 = local16[local30 - 1];
				}
				local16[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local43 == local16[local63]) {
						local16[local63] = local59;
					}
				}
				local69 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(163) int local163 = Integer.MIN_VALUE >>> local85;
					if ((local163 & local43) == 0) {
						local69++;
					} else {
						if (this.anIntArray352[local69] == 0) {
							this.anIntArray352[local69] = local22;
						}
						local69 = this.anIntArray352[local69];
					}
					if (local69 >= this.anIntArray352.length) {
						@Pc(205) int[] local205 = new int[this.anIntArray352.length * 2];
						for (@Pc(207) int local207 = 0; local207 < this.anIntArray352.length; local207++) {
							local205[local207] = this.anIntArray352[local207];
						}
						this.anIntArray352 = local205;
					}
				}
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
				this.anIntArray352[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([BI[BIII)I")
	public int method3446(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(13) int local13 = arg4 << 3;
		@Pc(15) int local15 = 0;
		while (local5 > arg3) {
			@Pc(28) int local28 = arg0[arg3] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray49[local28];
			@Pc(38) int local38 = this.anIntArray351[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local13 >> 3;
			@Pc(62) int local62 = local13 & 0x7;
			local13 += local33;
			local15 &= -local62 >> 31;
			@Pc(83) int local83 = (local62 + local33 - 1 >> 3) + local58;
			@Pc(84) int local84 = local62 + 24;
			arg2[local58] = (byte) (local15 |= local38 >>> local84);
			if (local58 < local83) {
				local58++;
				local62 = local84 - 8;
				arg2[local58] = (byte) (local15 = local38 >>> local62);
				if (local83 > local58) {
					local62 -= 8;
					local58++;
					arg2[local58] = (byte) (local15 = local38 >>> local62);
					if (local58 < local83) {
						local62 -= 8;
						local58++;
						arg2[local58] = (byte) (local15 = local38 >>> local62);
						if (local83 > local58) {
							local58++;
							local62 -= 8;
							arg2[local58] = (byte) (local15 = local38 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local13 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[BII[BI)I")
	public int method3447(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(29) int local29 = arg4;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = arg0;
		while (true) {
			@Pc(37) byte local37 = arg3[local33];
			if (local37 < 0) {
				local31 = this.anIntArray352[local31];
			} else {
				local31++;
			}
			@Pc(53) int local53;
			if ((local53 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local53;
				if (arg2 >= local29) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x40) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(89) int local89;
			if ((local89 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local89;
				if (local29 <= arg2) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x20) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(128) int local128;
			if ((local128 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local128;
				if (arg2 >= local29) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x10) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(167) int local167;
			if ((local167 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local167;
				if (arg2 >= local29) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x8) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(206) int local206;
			if ((local206 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local206;
				if (local29 <= arg2) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x4) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local238;
				if (local29 <= arg2) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x2) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(276) int local276;
			if ((local276 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local276;
				if (arg2 >= local29) {
					break;
				}
				local31 = 0;
			}
			if ((local37 & 0x1) == 0) {
				local31++;
			} else {
				local31 = this.anIntArray352[local31];
			}
			@Pc(311) int local311;
			if ((local311 = this.anIntArray352[local31]) < 0) {
				arg1[arg2++] = (byte) ~local311;
				if (local29 <= arg2) {
					break;
				}
				local31 = 0;
			}
			local33++;
		}
		return local33 + 1 - arg0;
	}
}

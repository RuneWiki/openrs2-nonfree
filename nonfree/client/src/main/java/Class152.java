import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class152 {

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "[I")
	private final int[] anIntArray211;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V")
	public Class152(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray211 = new int[local6];
		this.aByteArray33 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray210 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local16[local30];
				this.anIntArray211[local24] = local42;
				@Pc(106) int local106;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(76) int local76;
				if ((local42 & local38) == 0) {
					for (local58 = local30 - 1; local58 >= 1; local58--) {
						local64 = local16[local58];
						if (local42 != local64) {
							break;
						}
						local76 = 0x1 << 32 - local58;
						if ((local76 & local64) != 0) {
							local16[local58] = local16[local58 - 1];
							break;
						}
						local16[local58] = local76 | local64;
					}
					local106 = local38 | local42;
				} else {
					local106 = local16[local30 - 1];
				}
				local16[local30] = local106;
				for (local58 = local30 + 1; local58 <= 32; local58++) {
					if (local16[local58] == local42) {
						local16[local58] = local106;
					}
				}
				local64 = 0;
				for (local76 = 0; local76 < local30; local76++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local76;
					if ((local151 & local42) == 0) {
						local64++;
					} else {
						if (this.anIntArray210[local64] == 0) {
							this.anIntArray210[local64] = local22;
						}
						local64 = this.anIntArray210[local64];
					}
					if (local64 >= this.anIntArray210.length) {
						@Pc(188) int[] local188 = new int[this.anIntArray210.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray210.length; local190++) {
							local188[local190] = this.anIntArray210[local190];
						}
						this.anIntArray210 = local188;
					}
				}
				this.anIntArray210[local64] = ~local24;
				if (local22 <= local64) {
					local22 = local64 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII[B[B)I")
	public int method3710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg2;
		while (local15 > arg0) {
			@Pc(23) int local23 = arg4[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray211[local23];
			@Pc(33) byte local33 = this.aByteArray33[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local11 >> 3;
			@Pc(57) int local57 = local11 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(74) int local74 = (local33 + local57 - 1 >> 3) + local53;
			@Pc(75) int local75 = local57 + 24;
			arg3[local53] = (byte) (local7 |= local28 >>> local75);
			if (local53 < local74) {
				local53++;
				local57 = local75 - 8;
				arg3[local53] = (byte) (local7 = local28 >>> local57);
				if (local74 > local53) {
					local53++;
					local57 -= 8;
					arg3[local53] = (byte) (local7 = local28 >>> local57);
					if (local53 < local74) {
						local53++;
						local57 -= 8;
						arg3[local53] = (byte) (local7 = local28 >>> local57);
						if (local74 > local53) {
							local57 -= 8;
							local53++;
							arg3[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			local11 += local33;
			arg0++;
		}
		return (local11 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B[BIII[B)I")
	public int method3711(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(20) int local20 = arg2;
		while (true) {
			@Pc(24) byte local24 = arg0[local20];
			if (local24 < 0) {
				local14 = this.anIntArray210[local14];
			} else {
				local14++;
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local43;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local78;
				if (arg3 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local113;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local148;
				if (arg3 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local187;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local226;
				if (arg3 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(265) int local265;
			if ((local265 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local265;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray210[local14]) < 0) {
				arg4[arg3++] = (byte) ~local304;
				if (local18 <= arg3) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg2;
	}
}

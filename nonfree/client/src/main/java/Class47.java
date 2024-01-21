import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class47 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
	private final int[] anIntArray203;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
	public Class47(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray22 = arg0;
		this.anIntArray204 = new int[8];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray203 = new int[local6];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray203[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(86) int local86;
				if ((local39 & local43) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local16[local64];
						if (local43 != local70) {
							break;
						}
						local86 = 0x1 << 32 - local64;
						if ((local70 & local86) != 0) {
							local16[local64] = local16[local64 - 1];
							break;
						}
						local16[local64] = local70 | local86;
					}
					local58 = local39 | local43;
				} else {
					local58 = local16[local30 - 1];
				}
				local16[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local43 == local16[local64]) {
						local16[local64] = local58;
					}
				}
				local70 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local86;
					if ((local151 & local43) == 0) {
						local70++;
					} else {
						if (this.anIntArray204[local70] == 0) {
							this.anIntArray204[local70] = local22;
						}
						local70 = this.anIntArray204[local70];
					}
					if (local70 >= this.anIntArray204.length) {
						@Pc(192) int[] local192 = new int[this.anIntArray204.length * 2];
						for (@Pc(194) int local194 = 0; local194 < this.anIntArray204.length; local194++) {
							local192[local194] = this.anIntArray204[local194];
						}
						this.anIntArray204 = local192;
					}
				}
				this.anIntArray204[local70] = ~local24;
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([B[BIIII)I")
	public int method1351(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg3;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2 << 3;
		while (local5 > arg4) {
			@Pc(28) int local28 = arg1[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray203[local28];
			@Pc(38) byte local38 = this.aByteArray22[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local11 >> 3;
			@Pc(62) int local62 = local11 & 0x7;
			local11 += local38;
			@Pc(76) int local76 = (local38 + local62 - 1 >> 3) + local58;
			local7 &= -local62 >> 31;
			@Pc(84) int local84 = local62 + 24;
			arg0[local58] = (byte) (local7 |= local33 >>> local84);
			if (local58 < local76) {
				local58++;
				local62 = local84 - 8;
				arg0[local58] = (byte) (local7 = local33 >>> local62);
				if (local58 < local76) {
					local58++;
					local62 -= 8;
					arg0[local58] = (byte) (local7 = local33 >>> local62);
					if (local58 < local76) {
						local58++;
						local62 -= 8;
						arg0[local58] = (byte) (local7 = local33 >>> local62);
						if (local76 > local58) {
							local58++;
							local62 -= 8;
							arg0[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			arg4++;
		}
		return (local11 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BII[BZI)I")
	public int method1352(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 < 0) {
				local14 = this.anIntArray204[local14];
			} else {
				local14++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local48;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local84;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local116;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local151;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(190) int local190;
			if ((local190 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local190;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local225;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local263;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray204[local14];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray204[local14]) < 0) {
				arg3[arg4++] = (byte) ~local299;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}
}

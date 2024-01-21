import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
	private final int[] anIntArray5;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
	public Class3(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length;
		this.aByteArray1 = arg0;
		@Pc(14) int[] local14 = new int[33];
		this.anIntArray5 = new int[local8];
		this.anIntArray6 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local14[local30];
				this.anIntArray5[local24] = local42;
				@Pc(57) int local57;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(81) int local81;
				if ((local42 & local38) == 0) {
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local14[local63];
						if (local42 != local69) {
							break;
						}
						local81 = 0x1 << 32 - local63;
						if ((local69 & local81) != 0) {
							local14[local63] = local14[local63 - 1];
							break;
						}
						local14[local63] = local81 | local69;
					}
					local57 = local42 | local38;
				} else {
					local57 = local14[local30 - 1];
				}
				local14[local30] = local57;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local14[local63] == local42) {
						local14[local63] = local57;
					}
				}
				local69 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local81;
					if ((local149 & local42) == 0) {
						local69++;
					} else {
						if (this.anIntArray6[local69] == 0) {
							this.anIntArray6[local69] = local5;
						}
						local69 = this.anIntArray6[local69];
					}
					if (local69 >= this.anIntArray6.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray6.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray6.length; local192++) {
							local190[local192] = this.anIntArray6[local192];
						}
						this.anIntArray6 = local190;
					}
				}
				this.anIntArray6[local69] = ~local24;
				if (local5 <= local69) {
					local5 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[BI[BI)I")
	public int method50(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(15) int local15 = arg2 << 3;
		while (arg0 < local11) {
			@Pc(23) int local23 = arg3[arg0] & 0xFF;
			@Pc(28) byte local28 = this.aByteArray1[local23];
			@Pc(33) int local33 = this.anIntArray5[local23];
			if (local28 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local15 += local28;
			@Pc(68) int local68 = (local54 + local28 - 1 >> 3) + local50;
			local3 &= -local54 >> 31;
			@Pc(76) int local76 = local54 + 24;
			arg1[local50] = (byte) (local3 |= local33 >>> local76);
			if (local68 > local50) {
				local54 = local76 - 8;
				local50++;
				arg1[local50] = (byte) (local3 = local33 >>> local54);
				if (local68 > local50) {
					local54 -= 8;
					local50++;
					arg1[local50] = (byte) (local3 = local33 >>> local54);
					if (local50 < local68) {
						local54 -= 8;
						local50++;
						arg1[local50] = (byte) (local3 = local33 >>> local54);
						if (local68 > local50) {
							local50++;
							local54 -= 8;
							arg1[local50] = (byte) (local3 = local33 << -local54);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BII[BII)I")
	public int method55(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg2;
		@Pc(25) int local25 = arg1;
		while (true) {
			@Pc(29) byte local29 = arg3[local25];
			if (local29 < 0) {
				local19 = this.anIntArray6[local19];
			} else {
				local19++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local45;
				if (arg4 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local83;
				if (arg4 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local122;
				if (local23 <= arg4) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(154) int local154;
			if ((local154 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local154;
				if (arg4 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local192;
				if (local23 <= arg4) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local227;
				if (arg4 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(266) int local266;
			if ((local266 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local266;
				if (arg4 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray6[local19];
			}
			@Pc(301) int local301;
			if ((local301 = this.anIntArray6[local19]) < 0) {
				arg0[arg4++] = (byte) ~local301;
				if (local23 <= arg4) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class88 {

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "[B")
	private final byte[] aByteArray48;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
	private final int[] anIntArray124;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "([B)V")
	public Class88(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray48 = arg0;
		this.anIntArray124 = new int[local6];
		this.anIntArray123 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray124[local24] = local42;
				@Pc(57) int local57;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(83) int local83;
				if ((local42 & local38) == 0) {
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local69 != local42) {
							break;
						}
						local83 = 0x1 << 32 - local63;
						if ((local83 & local69) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local69 | local83;
					}
					local57 = local42 | local38;
				} else {
					local57 = local20[local30 - 1];
				}
				local20[local30] = local57;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local42 == local20[local63]) {
						local20[local63] = local57;
					}
				}
				local69 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local83;
					if ((local42 & local153) == 0) {
						local69++;
					} else {
						if (this.anIntArray123[local69] == 0) {
							this.anIntArray123[local69] = local22;
						}
						local69 = this.anIntArray123[local69];
					}
					if (this.anIntArray123.length <= local69) {
						@Pc(194) int[] local194 = new int[this.anIntArray123.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray123.length; local196++) {
							local194[local196] = this.anIntArray123[local196];
						}
						this.anIntArray123 = local194;
					}
				}
				if (local22 <= local69) {
					local22 = local69 + 1;
				}
				this.anIntArray123[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[BI[BII)I")
	public int method2074(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg4;
		while (true) {
			@Pc(27) byte local27 = arg0[local23];
			if (local27 < 0) {
				local15 = this.anIntArray123[local15];
			} else {
				local15++;
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local46;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local81;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(120) int local120;
			if ((local120 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local120;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local156;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(191) int local191;
			if ((local191 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local191;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local229;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local271;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray123[local15];
			}
			@Pc(307) int local307;
			if ((local307 = this.anIntArray123[local15]) < 0) {
				arg2[arg1++] = (byte) ~local307;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg4;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[B[BII)I")
	public int method2076(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg4;
		while (arg3 < local15) {
			@Pc(23) int local23 = arg1[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray124[local23];
			@Pc(33) byte local33 = this.aByteArray48[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local11 >> 3;
			@Pc(57) int local57 = local11 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(74) int local74 = (local57 + local33 - 1 >> 3) + local53;
			local11 += local33;
			@Pc(79) int local79 = local57 + 24;
			arg2[local53] = (byte) (local7 |= local28 >>> local79);
			if (local74 > local53) {
				local57 = local79 - 8;
				local53++;
				arg2[local53] = (byte) (local7 = local28 >>> local57);
				if (local53 < local74) {
					local57 -= 8;
					local53++;
					arg2[local53] = (byte) (local7 = local28 >>> local57);
					if (local53 < local74) {
						local57 -= 8;
						local53++;
						arg2[local53] = (byte) (local7 = local28 >>> local57);
						if (local53 < local74) {
							local53++;
							local57 -= 8;
							arg2[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			arg3++;
		}
		return (local11 + 7 >> 3) - arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class76 {

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
	private final int[] anIntArray450;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
	public Class76(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray451 = new int[8];
		@Pc(13) int[] local13 = new int[33];
		this.anIntArray450 = new int[local6];
		@Pc(19) int local19 = 0;
		this.aByteArray32 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local13[local30];
				this.anIntArray450[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(83) int local83;
				if ((local42 & local46) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local13[local67];
						if (local46 != local73) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local83 & local73) != 0) {
							local13[local67] = local13[local67 - 1];
							break;
						}
						local13[local67] = local83 | local73;
					}
					local61 = local46 | local42;
				} else {
					local61 = local13[local30 - 1];
				}
				local13[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local13[local67] == local46) {
						local13[local67] = local61;
					}
				}
				local73 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local83;
					if ((local147 & local46) == 0) {
						local73++;
					} else {
						if (this.anIntArray451[local73] == 0) {
							this.anIntArray451[local73] = local19;
						}
						local73 = this.anIntArray451[local73];
					}
					if (this.anIntArray451.length <= local73) {
						@Pc(192) int[] local192 = new int[this.anIntArray451.length * 2];
						for (@Pc(194) int local194 = 0; local194 < this.anIntArray451.length; local194++) {
							local192[local194] = this.anIntArray451[local194];
						}
						this.anIntArray451 = local192;
					}
				}
				this.anIntArray451[local73] = ~local24;
				if (local73 >= local19) {
					local19 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB[BI[BI)I")
	public int method1857(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		while (true) {
			@Pc(21) byte local21 = arg3[local17];
			if (local21 < 0) {
				local15 = this.anIntArray451[local15];
			} else {
				local15++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local40;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(75) int local75;
			if ((local75 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local75;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local114;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(153) int local153;
			if ((local153 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local153;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local192;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local230;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(262) int local262;
			if ((local262 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local262;
				if (arg4 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray451[local15];
			}
			@Pc(297) int local297;
			if ((local297 = this.anIntArray451[local15]) < 0) {
				arg1[arg4++] = (byte) ~local297;
				if (local13 <= arg4) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg2;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[BII[B)I")
	public int method1863(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 << 3;
		while (arg0 < local9) {
			@Pc(23) int local23 = arg1[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray450[local23];
			@Pc(33) byte local33 = this.aByteArray32[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 >> 3;
			@Pc(57) int local57 = local15 & 0x7;
			local11 &= -local57 >> 31;
			@Pc(75) int local75 = local53 + (local33 + local57 - 1 >> 3);
			local15 += local33;
			@Pc(80) int local80 = local57 + 24;
			arg4[local53] = (byte) (local11 |= local28 >>> local80);
			if (local53 < local75) {
				local57 = local80 - 8;
				local53++;
				arg4[local53] = (byte) (local11 = local28 >>> local57);
				if (local53 < local75) {
					local57 -= 8;
					local53++;
					arg4[local53] = (byte) (local11 = local28 >>> local57);
					if (local53 < local75) {
						local53++;
						local57 -= 8;
						arg4[local53] = (byte) (local11 = local28 >>> local57);
						if (local75 > local53) {
							local53++;
							local57 -= 8;
							arg4[local53] = (byte) (local11 = local28 << -local57);
						}
					}
				}
			}
			arg0++;
		}
		return (local15 + 7 >> 3) - arg3;
	}
}

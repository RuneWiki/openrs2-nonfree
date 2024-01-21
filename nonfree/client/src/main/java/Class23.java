import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class23 {

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "[I")
	private final int[] anIntArray84;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
	public Class23(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray85 = new int[8];
		this.anIntArray84 = new int[local6];
		this.aByteArray9 = arg0;
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local22[local30];
				this.anIntArray84[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(88) int local88;
				if ((local43 & local39) == 0) {
					local58 = local43 | local39;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local22[local68];
						if (local43 != local74) {
							break;
						}
						local88 = 0x1 << 32 - local68;
						if ((local88 & local74) != 0) {
							local22[local68] = local22[local68 - 1];
							break;
						}
						local22[local68] = local88 | local74;
					}
				} else {
					local58 = local22[local30 - 1];
				}
				local22[local30] = local58;
				for (local68 = local30 + 1; local68 <= 32; local68++) {
					if (local22[local68] == local43) {
						local22[local68] = local58;
					}
				}
				local74 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local88;
					if ((local153 & local43) == 0) {
						local74++;
					} else {
						if (this.anIntArray85[local74] == 0) {
							this.anIntArray85[local74] = local19;
						}
						local74 = this.anIntArray85[local74];
					}
					if (this.anIntArray85.length <= local74) {
						@Pc(191) int[] local191 = new int[this.anIntArray85.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray85.length; local193++) {
							local191[local193] = this.anIntArray85[local193];
						}
						this.anIntArray85 = local191;
					}
				}
				if (local19 <= local74) {
					local19 = local74 + 1;
				}
				this.anIntArray85[local74] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BBI[B)I")
	public int method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 << 3;
		while (arg3 < local9) {
			@Pc(23) int local23 = arg2[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray84[local23];
			@Pc(33) byte local33 = this.aByteArray9[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 >> 3;
			@Pc(57) int local57 = local15 & 0x7;
			@Pc(68) int local68 = (local57 + local33 - 1 >> 3) + local53;
			local11 &= -local57 >> 31;
			@Pc(76) int local76 = local57 + 24;
			arg4[local53] = (byte) (local11 |= local28 >>> local76);
			if (local53 < local68) {
				local57 = local76 - 8;
				local53++;
				arg4[local53] = (byte) (local11 = local28 >>> local57);
				if (local53 < local68) {
					local57 -= 8;
					local53++;
					arg4[local53] = (byte) (local11 = local28 >>> local57);
					if (local53 < local68) {
						local53++;
						local57 -= 8;
						arg4[local53] = (byte) (local11 = local28 >>> local57);
						if (local53 < local68) {
							local57 -= 8;
							local53++;
							arg4[local53] = (byte) (local11 = local28 << -local57);
						}
					}
				}
			}
			local15 += local33;
			arg3++;
		}
		return (local15 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BBI[BII)I")
	public int method387(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg4;
		while (true) {
			@Pc(26) byte local26 = arg2[local22];
			if (local26 < 0) {
				local20 = this.anIntArray85[local20];
			} else {
				local20++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local42;
				if (arg1 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local80;
				if (local13 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local116;
				if (local13 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local155;
				if (arg1 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local194;
				if (arg1 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(236) int local236;
			if ((local236 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local236;
				if (local13 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(275) int local275;
			if ((local275 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local275;
				if (local13 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray85[local20];
			}
			@Pc(317) int local317;
			if ((local317 = this.anIntArray85[local20]) < 0) {
				arg0[arg1++] = (byte) ~local317;
				if (arg1 >= local13) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg4;
	}
}

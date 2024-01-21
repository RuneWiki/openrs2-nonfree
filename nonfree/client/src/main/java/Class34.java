import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class34 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
	private final int[] anIntArray257;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class34(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray257 = new int[local6];
		this.aByteArray25 = arg0;
		this.anIntArray259 = new int[8];
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local22[local30];
				this.anIntArray257[local24] = local42;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(78) int local78;
				if ((local38 & local42) == 0) {
					local58 = local42 | local38;
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local22[local62];
						if (local42 != local68) {
							break;
						}
						local78 = 0x1 << 32 - local62;
						if ((local68 & local78) != 0) {
							local22[local62] = local22[local62 - 1];
							break;
						}
						local22[local62] = local68 | local78;
					}
				} else {
					local58 = local22[local30 - 1];
				}
				local22[local30] = local58;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local42 == local22[local62]) {
						local22[local62] = local58;
					}
				}
				local68 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(152) int local152 = Integer.MIN_VALUE >>> local78;
					if ((local42 & local152) == 0) {
						local68++;
					} else {
						if (this.anIntArray259[local68] == 0) {
							this.anIntArray259[local68] = local19;
						}
						local68 = this.anIntArray259[local68];
					}
					if (this.anIntArray259.length <= local68) {
						@Pc(186) int[] local186 = new int[this.anIntArray259.length * 2];
						for (@Pc(188) int local188 = 0; local188 < this.anIntArray259.length; local188++) {
							local186[local188] = this.anIntArray259[local188];
						}
						this.anIntArray259 = local186;
					}
				}
				if (local19 <= local68) {
					local19 = local68 + 1;
				}
				this.anIntArray259[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III[BI[B)I")
	public int method1152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(8) int local8 = 0;
		@Pc(12) int local12 = arg0;
		@Pc(20) int local20 = arg1 << 3;
		while (local12 > arg3) {
			@Pc(28) int local28 = arg4[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray257[local28];
			@Pc(38) byte local38 = this.aByteArray25[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local20 += local38;
			local8 &= -local62 >> 31;
			@Pc(85) int local85 = local58 + (local62 + local38 - 1 >> 3);
			@Pc(86) int local86 = local62 + 24;
			arg2[local58] = (byte) (local8 |= local33 >>> local86);
			if (local85 > local58) {
				local62 = local86 - 8;
				local58++;
				arg2[local58] = (byte) (local8 = local33 >>> local62);
				if (local58 < local85) {
					local62 -= 8;
					local58++;
					arg2[local58] = (byte) (local8 = local33 >>> local62);
					if (local85 > local58) {
						local62 -= 8;
						local58++;
						arg2[local58] = (byte) (local8 = local33 >>> local62);
						if (local85 > local58) {
							local62 -= 8;
							local58++;
							arg2[local58] = (byte) (local8 = local33 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local20 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([B[BIZII)I")
	public int method1154(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(26) int local26 = arg3;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = arg4;
		while (true) {
			@Pc(34) byte local34 = arg1[local30];
			if (local34 < 0) {
				local28 = this.anIntArray259[local28];
			} else {
				local28++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local52;
				if (arg2 >= local26) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x40) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local90;
				if (local26 <= arg2) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x20) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(131) int local131;
			if ((local131 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local131;
				if (arg2 >= local26) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x10) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local165;
				if (local26 <= arg2) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x8) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local199;
				if (local26 <= arg2) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x4) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(233) int local233;
			if ((local233 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local233;
				if (local26 <= arg2) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x2) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local267;
				if (arg2 >= local26) {
					break;
				}
				local28 = 0;
			}
			if ((local34 & 0x1) == 0) {
				local28++;
			} else {
				local28 = this.anIntArray259[local28];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray259[local28]) < 0) {
				arg0[arg2++] = (byte) ~local304;
				if (local26 <= arg2) {
					break;
				}
				local28 = 0;
			}
			local30++;
		}
		return local30 + 1 - arg4;
	}
}

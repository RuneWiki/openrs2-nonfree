import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class301 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
	private final int[] anIntArray606;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "[B")
	private final byte[] aByteArray102;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
	private int[] anIntArray607;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
	public Class301(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray606 = new int[local6];
		this.aByteArray102 = arg0;
		this.anIntArray607 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray606[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(81) int local81;
				if ((local46 & local42) == 0) {
					local62 = local42 | local46;
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local20[local66];
						if (local72 != local46) {
							break;
						}
						local81 = 0x1 << 32 - local66;
						if ((local72 & local81) != 0) {
							local20[local66] = local20[local66 - 1];
							break;
						}
						local20[local66] = local81 | local72;
					}
				} else {
					local62 = local20[local30 - 1];
				}
				local20[local30] = local62;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local46 == local20[local66]) {
						local20[local66] = local62;
					}
				}
				local72 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local81;
					if ((local153 & local46) == 0) {
						local72++;
					} else {
						if (this.anIntArray607[local72] == 0) {
							this.anIntArray607[local72] = local22;
						}
						local72 = this.anIntArray607[local72];
					}
					if (this.anIntArray607.length <= local72) {
						@Pc(194) int[] local194 = new int[this.anIntArray607.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray607.length; local196++) {
							local194[local196] = this.anIntArray607[local196];
						}
						this.anIntArray607 = local194;
					}
				}
				this.anIntArray607[local72] = ~local24;
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[BII[B)I")
	public int method6854(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3 << 3;
		@Pc(15) int local15 = arg2;
		while (local15 > arg0) {
			@Pc(23) int local23 = arg1[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray606[local23];
			@Pc(33) byte local33 = this.aByteArray102[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local11 >> 3;
			@Pc(54) int local54 = local11 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = local50 + (local33 + local54 - 1 >> 3);
			local11 += local33;
			@Pc(76) int local76 = local54 + 24;
			arg4[local50] = (byte) (local7 |= local28 >>> local76);
			if (local50 < local71) {
				local54 = local76 - 8;
				local50++;
				arg4[local50] = (byte) (local7 = local28 >>> local54);
				if (local71 > local50) {
					local54 -= 8;
					local50++;
					arg4[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local71) {
						local50++;
						local54 -= 8;
						arg4[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local71) {
							local50++;
							local54 -= 8;
							arg4[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg0++;
		}
		return (local11 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[BI[BII)I")
	public int method6855(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg1;
		@Pc(29) int local29 = arg4;
		while (true) {
			@Pc(33) byte local33 = arg2[local29];
			if (local33 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local49;
				if (local27 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local81;
				if (arg3 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local116;
				if (local27 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local151;
				if (local27 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local187;
				if (arg3 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(219) int local219;
			if ((local219 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local219;
				if (local27 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(255) int local255;
			if ((local255 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local255;
				if (arg3 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray607[local23];
			}
			@Pc(290) int local290;
			if ((local290 = this.anIntArray607[local23]) < 0) {
				arg0[arg3++] = (byte) ~local290;
				if (arg3 >= local27) {
					break;
				}
				local23 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class55 {

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
	private final int[] anIntArray184;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([B)V")
	public Class55(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray25 = arg0;
		this.anIntArray184 = new int[local6];
		this.anIntArray183 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray184[local24] = local46;
				@Pc(110) int local110;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(81) int local81;
				if ((local42 & local46) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local20[local62];
						if (local68 != local46) {
							break;
						}
						local81 = 0x1 << 32 - local62;
						if ((local68 & local81) != 0) {
							local20[local62] = local20[local62 - 1];
							break;
						}
						local20[local62] = local68 | local81;
					}
					local110 = local42 | local46;
				} else {
					local110 = local20[local30 - 1];
				}
				local20[local30] = local110;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local46 == local20[local62]) {
						local20[local62] = local110;
					}
				}
				local68 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local81;
					if ((local153 & local46) == 0) {
						local68++;
					} else {
						if (this.anIntArray183[local68] == 0) {
							this.anIntArray183[local68] = local22;
						}
						local68 = this.anIntArray183[local68];
					}
					if (this.anIntArray183.length <= local68) {
						@Pc(194) int[] local194 = new int[this.anIntArray183.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray183.length; local196++) {
							local194[local196] = this.anIntArray183[local196];
						}
						this.anIntArray183 = local194;
					}
				}
				if (local22 <= local68) {
					local22 = local68 + 1;
				}
				this.anIntArray183[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B[BIII)I")
	public int method1614(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2 << 3;
		@Pc(15) int local15 = arg3;
		while (local15 > arg4) {
			@Pc(23) int local23 = arg1[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray184[local23];
			@Pc(33) byte local33 = this.aByteArray25[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local11 >> 3;
			@Pc(57) int local57 = local11 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(74) int local74 = (local33 + local57 - 1 >> 3) + local53;
			@Pc(75) int local75 = local57 + 24;
			arg0[local53] = (byte) (local7 |= local28 >>> local75);
			if (local53 < local74) {
				local53++;
				local57 = local75 - 8;
				arg0[local53] = (byte) (local7 = local28 >>> local57);
				if (local74 > local53) {
					local57 -= 8;
					local53++;
					arg0[local53] = (byte) (local7 = local28 >>> local57);
					if (local74 > local53) {
						local53++;
						local57 -= 8;
						arg0[local53] = (byte) (local7 = local28 >>> local57);
						if (local74 > local53) {
							local53++;
							local57 -= 8;
							arg0[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			local11 += local33;
			arg4++;
		}
		return (local11 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI[BII[B)I")
	public int method1615(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg3;
		@Pc(25) int local25 = arg0;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 >= 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local45;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local80;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local122;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local158;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local197;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local232;
				if (local23 <= arg2) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(268) int local268;
			if ((local268 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local268;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray183[local19];
			}
			@Pc(310) int local310;
			if ((local310 = this.anIntArray183[local19]) < 0) {
				arg1[arg2++] = (byte) ~local310;
				if (arg2 >= local23) {
					break;
				}
				local19 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg0;
	}
}

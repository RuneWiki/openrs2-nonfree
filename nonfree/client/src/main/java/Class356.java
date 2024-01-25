import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class356 {

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "[I")
	private final int[] anIntArray718;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "[B")
	private final byte[] aByteArray119;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "[I")
	private int[] anIntArray717;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([B)V")
	public Class356(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray718 = new int[local6];
		this.aByteArray119 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray717 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local16[local30];
				this.anIntArray718[local24] = local45;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(84) int local84;
				if ((local45 & local41) == 0) {
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local16[local66];
						if (local72 != local45) {
							break;
						}
						local84 = 0x1 << 32 - local66;
						if ((local84 & local72) != 0) {
							local16[local66] = local16[local66 - 1];
							break;
						}
						local16[local66] = local84 | local72;
					}
					local60 = local41 | local45;
				} else {
					local60 = local16[local30 - 1];
				}
				local16[local30] = local60;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local45 == local16[local66]) {
						local16[local66] = local60;
					}
				}
				local72 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local84;
					if ((local147 & local45) == 0) {
						local72++;
					} else {
						if (this.anIntArray717[local72] == 0) {
							this.anIntArray717[local72] = local22;
						}
						local72 = this.anIntArray717[local72];
					}
					if (this.anIntArray717.length <= local72) {
						@Pc(181) int[] local181 = new int[this.anIntArray717.length * 2];
						for (@Pc(183) int local183 = 0; local183 < this.anIntArray717.length; local183++) {
							local181[local183] = this.anIntArray717[local183];
						}
						this.anIntArray717 = local181;
					}
				}
				this.anIntArray717[local72] = ~local24;
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[BI[BIB)I")
	public int method7812(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg4 << 3;
		@Pc(20) int local20 = arg0;
		while (local20 > arg2) {
			@Pc(28) int local28 = arg3[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray718[local28];
			@Pc(38) byte local38 = this.aByteArray119[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(76) int local76 = (local59 + local38 - 1 >> 3) + local55;
			local16 += local38;
			@Pc(81) int local81 = local59 + 24;
			arg1[local55] = (byte) (local12 |= local33 >>> local81);
			if (local76 > local55) {
				local59 = local81 - 8;
				local55++;
				arg1[local55] = (byte) (local12 = local33 >>> local59);
				if (local76 > local55) {
					local55++;
					local59 -= 8;
					arg1[local55] = (byte) (local12 = local33 >>> local59);
					if (local55 < local76) {
						local55++;
						local59 -= 8;
						arg1[local55] = (byte) (local12 = local33 >>> local59);
						if (local76 > local55) {
							local55++;
							local59 -= 8;
							arg1[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			arg2++;
		}
		return (local16 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[B[BIBI)I")
	public int method7814(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg2[local17];
			if (local29 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local45;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local87;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local122;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local157;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local192;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(234) int local234;
			if ((local234 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local234;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local273;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray717[local15];
			}
			@Pc(312) int local312;
			if ((local312 = this.anIntArray717[local15]) < 0) {
				arg1[arg0++] = (byte) ~local312;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg4;
	}
}

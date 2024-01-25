import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class92 {

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "[I")
	private final int[] anIntArray143;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "([B)V")
	public Class92(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray25 = arg0;
		this.anIntArray143 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray144 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray143[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(84) int local84;
				if ((local39 & local43) == 0) {
					local59 = local39 | local43;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local16[local63];
						if (local43 != local69) {
							break;
						}
						local84 = 0x1 << 32 - local63;
						if ((local84 & local69) != 0) {
							local16[local63] = local16[local63 - 1];
							break;
						}
						local16[local63] = local69 | local84;
					}
				} else {
					local59 = local16[local30 - 1];
				}
				local16[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local43 == local16[local63]) {
						local16[local63] = local59;
					}
				}
				local69 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local84;
					if ((local155 & local43) == 0) {
						local69++;
					} else {
						if (this.anIntArray144[local69] == 0) {
							this.anIntArray144[local69] = local22;
						}
						local69 = this.anIntArray144[local69];
					}
					if (this.anIntArray144.length <= local69) {
						@Pc(200) int[] local200 = new int[this.anIntArray144.length * 2];
						for (@Pc(202) int local202 = 0; local202 < this.anIntArray144.length; local202++) {
							local200[local202] = this.anIntArray144[local202];
						}
						this.anIntArray144 = local200;
					}
				}
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
				this.anIntArray144[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II[B[BII)I")
	public int method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg1 << 3;
		while (arg4 < local16) {
			@Pc(28) int local28 = arg3[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray143[local28];
			@Pc(38) byte local38 = this.aByteArray25[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local20 >> 3;
			@Pc(59) int local59 = local20 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(76) int local76 = local55 + (local38 + local59 - 1 >> 3);
			@Pc(77) int local77 = local59 + 24;
			arg2[local55] = (byte) (local12 |= local33 >>> local77);
			if (local76 > local55) {
				local59 = local77 - 8;
				local55++;
				arg2[local55] = (byte) (local12 = local33 >>> local59);
				if (local76 > local55) {
					local55++;
					local59 -= 8;
					arg2[local55] = (byte) (local12 = local33 >>> local59);
					if (local76 > local55) {
						local55++;
						local59 -= 8;
						arg2[local55] = (byte) (local12 = local33 >>> local59);
						if (local76 > local55) {
							local59 -= 8;
							local55++;
							arg2[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local20 += local38;
			arg4++;
		}
		return (local20 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "([BI[BIBI)I")
	public int method1751(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local45;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local80;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(112) int local112;
			if ((local112 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local112;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(147) int local147;
			if ((local147 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local147;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(182) int local182;
			if ((local182 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local182;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(214) int local214;
			if ((local214 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local214;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(246) int local246;
			if ((local246 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local246;
				if (local21 <= arg3) {
					break;
				}
				local23 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray144[local23];
			}
			@Pc(285) int local285;
			if ((local285 = this.anIntArray144[local23]) < 0) {
				arg0[arg3++] = (byte) ~local285;
				if (arg3 >= local21) {
					break;
				}
				local23 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class253 {

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "[B")
	private final byte[] aByteArray80;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "[I")
	private final int[] anIntArray481;

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "[I")
	private int[] anIntArray480;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "([B)V")
	public Class253(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray80 = arg0;
		this.anIntArray481 = new int[local6];
		this.anIntArray480 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray481[local24] = local46;
				@Pc(64) int local64;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(90) int local90;
				if ((local46 & local42) == 0) {
					local64 = local42 | local46;
					for (local74 = local30 - 1; local74 >= 1; local74--) {
						local80 = local20[local74];
						if (local46 != local80) {
							break;
						}
						local90 = 0x1 << 32 - local74;
						if ((local80 & local90) != 0) {
							local20[local74] = local20[local74 - 1];
							break;
						}
						local20[local74] = local80 | local90;
					}
				} else {
					local64 = local20[local30 - 1];
				}
				local20[local30] = local64;
				for (local74 = local30 + 1; local74 <= 32; local74++) {
					if (local46 == local20[local74]) {
						local20[local74] = local64;
					}
				}
				local80 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local90;
					if ((local46 & local151) == 0) {
						local80++;
					} else {
						if (this.anIntArray480[local80] == 0) {
							this.anIntArray480[local80] = local22;
						}
						local80 = this.anIntArray480[local80];
					}
					if (this.anIntArray480.length <= local80) {
						@Pc(192) int[] local192 = new int[this.anIntArray480.length * 2];
						for (@Pc(194) int local194 = 0; local194 < this.anIntArray480.length; local194++) {
							local192[local194] = this.anIntArray480[local194];
						}
						this.anIntArray480 = local192;
					}
				}
				this.anIntArray480[local80] = ~local24;
				if (local22 <= local80) {
					local22 = local80 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[BII[BI)I")
	public int method6530(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg2 << 3;
		while (arg4 < local11) {
			@Pc(35) int local35 = arg3[arg4] & 0xFF;
			@Pc(40) int local40 = this.anIntArray481[local35];
			@Pc(45) byte local45 = this.aByteArray80[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(62) int local62 = local15 >> 3;
			@Pc(66) int local66 = local15 & 0x7;
			local7 &= -local66 >> 31;
			@Pc(83) int local83 = local62 + (local66 + local45 - 1 >> 3);
			@Pc(84) int local84 = local66 + 24;
			arg0[local62] = (byte) (local7 |= local40 >>> local84);
			if (local62 < local83) {
				local62++;
				local66 = local84 - 8;
				arg0[local62] = (byte) (local7 = local40 >>> local66);
				if (local83 > local62) {
					local66 -= 8;
					local62++;
					arg0[local62] = (byte) (local7 = local40 >>> local66);
					if (local62 < local83) {
						local66 -= 8;
						local62++;
						arg0[local62] = (byte) (local7 = local40 >>> local66);
						if (local83 > local62) {
							local66 -= 8;
							local62++;
							arg0[local62] = (byte) (local7 = local40 << -local66);
						}
					}
				}
			}
			local15 += local45;
			arg4++;
		}
		return (local15 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([BI[BIIZ)I")
	public int method6532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = 0;
		@Pc(32) int local32 = arg3;
		while (true) {
			@Pc(36) byte local36 = arg0[local32];
			if (local36 < 0) {
				local18 = this.anIntArray480[local18];
			} else {
				local18++;
			}
			@Pc(55) int local55;
			if ((local55 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local55;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local90;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local125;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local157;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local192;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local227;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(266) int local266;
			if ((local266 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local266;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray480[local18];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray480[local18]) < 0) {
				arg2[arg4++] = (byte) ~local304;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			local32++;
		}
		return local32 + 1 - arg3;
	}
}

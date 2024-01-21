import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class43 {

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	private final int[] anIntArray198;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V")
	public Class43(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray199 = new int[8];
		this.anIntArray198 = new int[local6];
		@Pc(17) int[] local17 = new int[33];
		this.aByteArray11 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = local17[local30];
				@Pc(46) int local46 = 0x1 << 32 - local30;
				this.anIntArray198[local24] = local39;
				@Pc(116) int local116;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(84) int local84;
				if ((local39 & local46) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local17[local62];
						if (local39 != local68) {
							break;
						}
						local84 = 0x1 << 32 - local62;
						if ((local68 & local84) != 0) {
							local17[local62] = local17[local62 - 1];
							break;
						}
						local17[local62] = local84 | local68;
					}
					local116 = local46 | local39;
				} else {
					local116 = local17[local30 - 1];
				}
				local17[local30] = local116;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local17[local62] == local39) {
						local17[local62] = local116;
					}
				}
				local68 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(163) int local163 = Integer.MIN_VALUE >>> local84;
					if ((local163 & local39) == 0) {
						local68++;
					} else {
						if (this.anIntArray199[local68] == 0) {
							this.anIntArray199[local68] = local22;
						}
						local68 = this.anIntArray199[local68];
					}
					if (this.anIntArray199.length <= local68) {
						@Pc(205) int[] local205 = new int[this.anIntArray199.length * 2];
						for (@Pc(207) int local207 = 0; local207 < this.anIntArray199.length; local207++) {
							local205[local207] = this.anIntArray199[local207];
						}
						this.anIntArray199 = local205;
					}
				}
				this.anIntArray199[local68] = ~local24;
				if (local22 <= local68) {
					local22 = local68 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII[BI)I")
	public int method1067(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg2;
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg4[local25];
			if (local29 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local45;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local80;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local115;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(150) int local150;
			if ((local150 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local150;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(185) int local185;
			if ((local185 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local185;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local217;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(255) int local255;
			if ((local255 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local255;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray199[local15];
			}
			@Pc(294) int local294;
			if ((local294 = this.anIntArray199[local15]) < 0) {
				arg1[arg0++] = (byte) ~local294;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIII[B)I")
	public int method1068(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg3 << 3;
		while (local5 > arg1) {
			@Pc(23) int local23 = arg0[arg1] & 0xFF;
			@Pc(28) byte local28 = this.aByteArray11[local23];
			@Pc(33) int local33 = this.anIntArray198[local23];
			if (local28 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = local50 + (local28 + local54 - 1 >> 3);
			@Pc(72) int local72 = local54 + 24;
			arg4[local50] = (byte) (local7 |= local33 >>> local72);
			if (local50 < local71) {
				local54 = local72 - 8;
				local50++;
				arg4[local50] = (byte) (local7 = local33 >>> local54);
				if (local71 > local50) {
					local50++;
					local54 -= 8;
					arg4[local50] = (byte) (local7 = local33 >>> local54);
					if (local50 < local71) {
						local50++;
						local54 -= 8;
						arg4[local50] = (byte) (local7 = local33 >>> local54);
						if (local71 > local50) {
							local54 -= 8;
							local50++;
							arg4[local50] = (byte) (local7 = local33 << -local54);
						}
					}
				}
			}
			local15 += local28;
			arg1++;
		}
		return (local15 + 7 >> 3) - arg3;
	}
}

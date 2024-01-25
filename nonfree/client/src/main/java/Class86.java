import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class86 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
	private final int[] anIntArray159;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V")
	public Class86(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray159 = new int[local6];
		this.aByteArray31 = arg0;
		this.anIntArray160 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray159[local24] = local42;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(82) int local82;
				if ((local42 & local38) == 0) {
					local58 = local42 | local38;
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local20[local62];
						if (local42 != local68) {
							break;
						}
						local82 = 0x1 << 32 - local62;
						if ((local82 & local68) != 0) {
							local20[local62] = local20[local62 - 1];
							break;
						}
						local20[local62] = local82 | local68;
					}
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local20[local62] == local42) {
						local20[local62] = local58;
					}
				}
				local68 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local82;
					if ((local42 & local154) == 0) {
						local68++;
					} else {
						if (this.anIntArray160[local68] == 0) {
							this.anIntArray160[local68] = local22;
						}
						local68 = this.anIntArray160[local68];
					}
					if (this.anIntArray160.length <= local68) {
						@Pc(202) int[] local202 = new int[this.anIntArray160.length * 2];
						for (@Pc(204) int local204 = 0; local204 < this.anIntArray160.length; local204++) {
							local202[local204] = this.anIntArray160[local204];
						}
						this.anIntArray160 = local202;
					}
				}
				if (local68 >= local22) {
					local22 = local68 + 1;
				}
				this.anIntArray160[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B[BIIB)I")
	public int method1797(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg4 << 3;
		while (arg0 < local16) {
			@Pc(28) int local28 = arg2[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray159[local28];
			@Pc(38) byte local38 = this.aByteArray31[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local12 &= -local62 >> 31;
			@Pc(79) int local79 = (local62 + local38 - 1 >> 3) + local58;
			local20 += local38;
			@Pc(84) int local84 = local62 + 24;
			arg1[local58] = (byte) (local12 |= local33 >>> local84);
			if (local79 > local58) {
				local62 = local84 - 8;
				local58++;
				arg1[local58] = (byte) (local12 = local33 >>> local62);
				if (local58 < local79) {
					local58++;
					local62 -= 8;
					arg1[local58] = (byte) (local12 = local33 >>> local62);
					if (local79 > local58) {
						local62 -= 8;
						local58++;
						arg1[local58] = (byte) (local12 = local33 >>> local62);
						if (local79 > local58) {
							local58++;
							local62 -= 8;
							arg1[local58] = (byte) (local12 = local33 << -local62);
						}
					}
				}
			}
			arg0++;
		}
		return (local20 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III[BI[B)I")
	public int method1798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local43;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local78;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local116;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local158;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local193;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(228) int local228;
			if ((local228 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local228;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local267;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray160[local18];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray160[local18]) < 0) {
				arg4[arg1++] = (byte) ~local306;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class55 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	private final int[] anIntArray209;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
	public Class55(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray210 = new int[8];
		this.anIntArray209 = new int[local6];
		this.aByteArray21 = arg0;
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local22[local30];
				this.anIntArray209[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(89) int local89;
				if ((local39 & local43) == 0) {
					local58 = local43 | local39;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local22[local68];
						if (local74 != local43) {
							break;
						}
						local89 = 0x1 << 32 - local68;
						if ((local89 & local74) != 0) {
							local22[local68] = local22[local68 - 1];
							break;
						}
						local22[local68] = local89 | local74;
					}
				} else {
					local58 = local22[local30 - 1];
				}
				local22[local30] = local58;
				for (local68 = local30 + 1; local68 <= 32; local68++) {
					if (local43 == local22[local68]) {
						local22[local68] = local58;
					}
				}
				local74 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local89;
					if ((local43 & local153) == 0) {
						local74++;
					} else {
						if (this.anIntArray210[local74] == 0) {
							this.anIntArray210[local74] = local19;
						}
						local74 = this.anIntArray210[local74];
					}
					if (local74 >= this.anIntArray210.length) {
						@Pc(198) int[] local198 = new int[this.anIntArray210.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray210.length; local200++) {
							local198[local200] = this.anIntArray210[local200];
						}
						this.anIntArray210 = local198;
					}
				}
				if (local19 <= local74) {
					local19 = local74 + 1;
				}
				this.anIntArray210[local74] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIIIB[B)I")
	public int method1690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg2;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg1 << 3;
		while (arg3 < local5) {
			@Pc(28) int local28 = arg0[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray209[local28];
			@Pc(38) byte local38 = this.aByteArray21[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 >> 3;
			@Pc(62) int local62 = local20 & 0x7;
			local16 &= -local62 >> 31;
			@Pc(79) int local79 = (local38 + local62 - 1 >> 3) + local58;
			local20 += local38;
			@Pc(84) int local84 = local62 + 24;
			arg4[local58] = (byte) (local16 |= local33 >>> local84);
			if (local79 > local58) {
				local62 = local84 - 8;
				local58++;
				arg4[local58] = (byte) (local16 = local33 >>> local62);
				if (local58 < local79) {
					local62 -= 8;
					local58++;
					arg4[local58] = (byte) (local16 = local33 >>> local62);
					if (local79 > local58) {
						local62 -= 8;
						local58++;
						arg4[local58] = (byte) (local16 = local33 >>> local62);
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg4[local58] = (byte) (local16 = local33 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local20 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BIII[B)I")
	public int method1691(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(30) byte local30 = arg4[local20];
			if (local30 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local49;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(88) int local88;
			if ((local88 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local88;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(120) int local120;
			if ((local120 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local120;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local155;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local187;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local226;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(261) int local261;
			if ((local261 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local261;
				if (arg0 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray210[local14];
			}
			@Pc(296) int local296;
			if ((local296 = this.anIntArray210[local14]) < 0) {
				arg1[arg0++] = (byte) ~local296;
				if (local18 <= arg0) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}

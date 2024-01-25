import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class110 {

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
	private final int[] anIntArray227;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([B)V")
	public Class110(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray40 = arg0;
		this.anIntArray227 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray226 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray227[local24] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(75) int local75;
				if ((local39 & local43) == 0) {
					local56 = local39 | local43;
					for (local60 = local30 - 1; local60 >= 1; local60--) {
						local66 = local16[local60];
						if (local43 != local66) {
							break;
						}
						local75 = 0x1 << 32 - local60;
						if ((local75 & local66) != 0) {
							local16[local60] = local16[local60 - 1];
							break;
						}
						local16[local60] = local66 | local75;
					}
				} else {
					local56 = local16[local30 - 1];
				}
				local16[local30] = local56;
				for (local60 = local30 + 1; local60 <= 32; local60++) {
					if (local16[local60] == local43) {
						local16[local60] = local56;
					}
				}
				local66 = 0;
				for (local75 = 0; local75 < local30; local75++) {
					@Pc(146) int local146 = Integer.MIN_VALUE >>> local75;
					if ((local146 & local43) == 0) {
						local66++;
					} else {
						if (this.anIntArray226[local66] == 0) {
							this.anIntArray226[local66] = local22;
						}
						local66 = this.anIntArray226[local66];
					}
					if (local66 >= this.anIntArray226.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray226.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray226.length; local192++) {
							local190[local192] = this.anIntArray226[local192];
						}
						this.anIntArray226 = local190;
					}
				}
				this.anIntArray226[local66] = ~local24;
				if (local66 >= local22) {
					local22 = local66 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III[BB[B)I")
	public int method2998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg2 << 3;
		while (local11 > arg1) {
			@Pc(28) int local28 = arg4[arg1] & 0xFF;
			@Pc(33) int local33 = this.anIntArray227[local28];
			@Pc(38) byte local38 = this.aByteArray40[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local15 >> 3;
			@Pc(62) int local62 = local15 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(79) int local79 = local58 + (local62 + local38 - 1 >> 3);
			@Pc(80) int local80 = local62 + 24;
			arg3[local58] = (byte) (local7 |= local33 >>> local80);
			if (local79 > local58) {
				local62 = local80 - 8;
				local58++;
				arg3[local58] = (byte) (local7 = local33 >>> local62);
				if (local79 > local58) {
					local58++;
					local62 -= 8;
					arg3[local58] = (byte) (local7 = local33 >>> local62);
					if (local58 < local79) {
						local58++;
						local62 -= 8;
						arg3[local58] = (byte) (local7 = local33 >>> local62);
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg3[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			local15 += local38;
			arg1++;
		}
		return (local15 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([BII[BII)I")
	public int method3004(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg1;
		while (true) {
			@Pc(32) byte local32 = arg3[local28];
			if (local32 < 0) {
				local26 = this.anIntArray226[local26];
			} else {
				local26++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local48;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local84;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local126;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(168) int local168;
			if ((local168 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local168;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local200;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local238;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(277) int local277;
			if ((local277 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local277;
				if (arg4 >= local24) {
					break;
				}
				local26 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray226[local26];
			}
			@Pc(309) int local309;
			if ((local309 = this.anIntArray226[local26]) < 0) {
				arg0[arg4++] = (byte) ~local309;
				if (local24 <= arg4) {
					break;
				}
				local26 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg1;
	}
}

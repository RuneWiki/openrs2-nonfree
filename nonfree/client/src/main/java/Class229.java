import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class229 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "[I")
	private final int[] anIntArray378;

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "([B)V")
	public Class229(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray378 = new int[local6];
		this.aByteArray57 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray379 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray378[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(84) int local84;
				if ((local39 & local43) == 0) {
					local58 = local43 | local39;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local16[local68];
						if (local43 != local74) {
							break;
						}
						local84 = 0x1 << 32 - local68;
						if ((local74 & local84) != 0) {
							local16[local68] = local16[local68 - 1];
							break;
						}
						local16[local68] = local74 | local84;
					}
				} else {
					local58 = local16[local30 - 1];
				}
				local16[local30] = local58;
				for (local68 = local30 + 1; local68 <= 32; local68++) {
					if (local43 == local16[local68]) {
						local16[local68] = local58;
					}
				}
				local74 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local84;
					if ((local43 & local150) == 0) {
						local74++;
					} else {
						if (this.anIntArray379[local74] == 0) {
							this.anIntArray379[local74] = local22;
						}
						local74 = this.anIntArray379[local74];
					}
					if (this.anIntArray379.length <= local74) {
						@Pc(187) int[] local187 = new int[this.anIntArray379.length * 2];
						for (@Pc(189) int local189 = 0; local189 < this.anIntArray379.length; local189++) {
							local187[local189] = this.anIntArray379[local189];
						}
						this.anIntArray379 = local187;
					}
				}
				this.anIntArray379[local74] = ~local24;
				if (local74 >= local22) {
					local22 = local74 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I[BIII[B)I")
	public int method5590(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg3 << 3;
		while (arg0 < local21) {
			@Pc(32) int local32 = arg4[arg0] & 0xFF;
			@Pc(37) int local37 = this.anIntArray378[local32];
			@Pc(42) byte local42 = this.aByteArray57[local32];
			if (local42 == 0) {
				throw new RuntimeException("No codeword for data value " + local32);
			}
			@Pc(59) int local59 = local25 >> 3;
			@Pc(63) int local63 = local25 & 0x7;
			local17 &= -local63 >> 31;
			@Pc(80) int local80 = (local63 + local42 - 1 >> 3) + local59;
			@Pc(81) int local81 = local63 + 24;
			arg1[local59] = (byte) (local17 |= local37 >>> local81);
			if (local80 > local59) {
				local59++;
				local63 = local81 - 8;
				arg1[local59] = (byte) (local17 = local37 >>> local63);
				if (local59 < local80) {
					local63 -= 8;
					local59++;
					arg1[local59] = (byte) (local17 = local37 >>> local63);
					if (local80 > local59) {
						local59++;
						local63 -= 8;
						arg1[local59] = (byte) (local17 = local37 >>> local63);
						if (local59 < local80) {
							local63 -= 8;
							local59++;
							arg1[local59] = (byte) (local17 = local37 << -local63);
						}
					}
				}
			}
			local25 += local42;
			arg0++;
		}
		return (local25 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "([BIII[BB)I")
	public int method5595(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg3;
		@Pc(23) int local23 = arg1;
		while (true) {
			@Pc(27) byte local27 = arg0[local23];
			if (local27 < 0) {
				local17 = this.anIntArray379[local17];
			} else {
				local17++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local42;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local76;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(110) int local110;
			if ((local110 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local110;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(145) int local145;
			if ((local145 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local145;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local186;
				if (arg2 >= local21) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(220) int local220;
			if ((local220 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local220;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(258) int local258;
			if ((local258 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local258;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local17++;
			} else {
				local17 = this.anIntArray379[local17];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray379[local17]) < 0) {
				arg4[arg2++] = (byte) ~local292;
				if (local21 <= arg2) {
					break;
				}
				local17 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg1;
	}
}

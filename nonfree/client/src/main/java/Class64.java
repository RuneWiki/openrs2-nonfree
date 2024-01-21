import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class64 {

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
	private final int[] anIntArray428;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
	public Class64(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray430 = new int[8];
		this.aByteArray28 = arg0;
		@Pc(16) int[] local16 = new int[33];
		@Pc(18) int local18 = 0;
		this.anIntArray428 = new int[local6];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray428[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(86) int local86;
				if ((local39 & local43) == 0) {
					local58 = local39 | local43;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local16[local68];
						if (local74 != local43) {
							break;
						}
						local86 = 0x1 << 32 - local68;
						if ((local74 & local86) != 0) {
							local16[local68] = local16[local68 - 1];
							break;
						}
						local16[local68] = local86 | local74;
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
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local86;
					if ((local147 & local43) == 0) {
						local74++;
					} else {
						if (this.anIntArray430[local74] == 0) {
							this.anIntArray430[local74] = local18;
						}
						local74 = this.anIntArray430[local74];
					}
					if (this.anIntArray430.length <= local74) {
						@Pc(185) int[] local185 = new int[this.anIntArray430.length * 2];
						for (@Pc(187) int local187 = 0; local187 < this.anIntArray430.length; local187++) {
							local185[local187] = this.anIntArray430[local187];
						}
						this.anIntArray430 = local185;
					}
				}
				this.anIntArray430[local74] = ~local24;
				if (local18 <= local74) {
					local18 = local74 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIII[BB)I")
	public int method1793(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = arg1;
		while (true) {
			@Pc(32) byte local32 = arg4[local28];
			if (local32 < 0) {
				local18 = this.anIntArray430[local18];
			} else {
				local18++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local48;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local86;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local125;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(163) int local163;
			if ((local163 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local163;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(202) int local202;
			if ((local202 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local202;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(241) int local241;
			if ((local241 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local241;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(277) int local277;
			if ((local277 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local277;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray430[local18];
			}
			@Pc(316) int local316;
			if ((local316 = this.anIntArray430[local18]) < 0) {
				arg0[arg2++] = (byte) ~local316;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[B[BII)I")
	public int method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 << 3;
		while (arg4 < local5) {
			@Pc(23) int local23 = arg3[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray428[local23];
			@Pc(33) byte local33 = this.aByteArray28[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 & 0x7;
			local11 &= -local53 >> 31;
			@Pc(64) int local64 = local15 >> 3;
			local15 += local33;
			@Pc(79) int local79 = (local53 + local33 - 1 >> 3) + local64;
			@Pc(80) int local80 = local53 + 24;
			arg2[local64] = (byte) (local11 |= local28 >>> local80);
			if (local79 > local64) {
				local53 = local80 - 8;
				local64++;
				arg2[local64] = (byte) (local11 = local28 >>> local53);
				if (local64 < local79) {
					local64++;
					local53 -= 8;
					arg2[local64] = (byte) (local11 = local28 >>> local53);
					if (local64 < local79) {
						local64++;
						local53 -= 8;
						arg2[local64] = (byte) (local11 = local28 >>> local53);
						if (local64 < local79) {
							local64++;
							local53 -= 8;
							arg2[local64] = (byte) (local11 = local28 << -local53);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}

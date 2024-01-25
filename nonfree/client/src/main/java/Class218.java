import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class218 {

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "[B")
	private final byte[] aByteArray214;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
	private final int[] anIntArray643;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "[I")
	private int[] anIntArray642;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([B)V")
	public Class218(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray214 = arg0;
		this.anIntArray643 = new int[local6];
		this.anIntArray642 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local20[local30];
				this.anIntArray643[local24] = local45;
				@Pc(58) int local58;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(82) int local82;
				if ((local45 & local41) == 0) {
					local58 = local45 | local41;
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local20[local62];
						if (local68 != local45) {
							break;
						}
						local82 = 0x1 << 32 - local62;
						if ((local68 & local82) != 0) {
							local20[local62] = local20[local62 - 1];
							break;
						}
						local20[local62] = local68 | local82;
					}
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local45 == local20[local62]) {
						local20[local62] = local58;
					}
				}
				local68 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(150) int local150 = Integer.MIN_VALUE >>> local82;
					if ((local45 & local150) == 0) {
						local68++;
					} else {
						if (this.anIntArray642[local68] == 0) {
							this.anIntArray642[local68] = local22;
						}
						local68 = this.anIntArray642[local68];
					}
					if (local68 >= this.anIntArray642.length) {
						@Pc(194) int[] local194 = new int[this.anIntArray642.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray642.length; local196++) {
							local194[local196] = this.anIntArray642[local196];
						}
						this.anIntArray642 = local194;
					}
				}
				if (local22 <= local68) {
					local22 = local68 + 1;
				}
				this.anIntArray642[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BII[BII)I")
	public int method5921(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		@Pc(21) int local21 = arg2;
		while (arg1 < local21) {
			@Pc(29) int local29 = arg0[arg1] & 0xFF;
			@Pc(34) int local34 = this.anIntArray643[local29];
			@Pc(39) byte local39 = this.aByteArray214[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local11 >> 3;
			@Pc(63) int local63 = local11 & 0x7;
			local7 &= -local63 >> 31;
			@Pc(80) int local80 = local59 + (local39 + local63 - 1 >> 3);
			local11 += local39;
			@Pc(85) int local85 = local63 + 24;
			arg3[local59] = (byte) (local7 |= local34 >>> local85);
			if (local59 < local80) {
				local59++;
				local63 = local85 - 8;
				arg3[local59] = (byte) (local7 = local34 >>> local63);
				if (local80 > local59) {
					local63 -= 8;
					local59++;
					arg3[local59] = (byte) (local7 = local34 >>> local63);
					if (local59 < local80) {
						local59++;
						local63 -= 8;
						arg3[local59] = (byte) (local7 = local34 >>> local63);
						if (local59 < local80) {
							local63 -= 8;
							local59++;
							arg3[local59] = (byte) (local7 = local34 << -local63);
						}
					}
				}
			}
			arg1++;
		}
		return (local11 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[B[BIII)I")
	public int method5927(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 < 0) {
				local14 = this.anIntArray642[local14];
			} else {
				local14++;
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local43;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local78;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local116;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local158;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local194;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local229;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local264;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray642[local14];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray642[local14]) < 0) {
				arg0[arg4++] = (byte) ~local306;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}

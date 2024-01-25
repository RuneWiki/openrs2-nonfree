import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class264 {

	@OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
	private final int[] anIntArray373;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
	public Class264(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray373 = new int[local6];
		this.aByteArray63 = arg0;
		this.anIntArray372 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray373[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local42 & local46) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local46 != local73) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local73 & local85) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local73 | local85;
					}
					local61 = local46 | local42;
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local20[local67] == local46) {
						local20[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local85;
					if ((local46 & local148) == 0) {
						local73++;
					} else {
						if (this.anIntArray372[local73] == 0) {
							this.anIntArray372[local73] = local22;
						}
						local73 = this.anIntArray372[local73];
					}
					if (local73 >= this.anIntArray372.length) {
						@Pc(186) int[] local186 = new int[this.anIntArray372.length * 2];
						for (@Pc(188) int local188 = 0; local188 < this.anIntArray372.length; local188++) {
							local186[local188] = this.anIntArray372[local188];
						}
						this.anIntArray372 = local186;
					}
				}
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
				this.anIntArray372[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BI[BIII)I")
	public int method5892(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg3 << 3;
		while (arg4 < local11) {
			@Pc(31) int local31 = arg2[arg4] & 0xFF;
			@Pc(36) int local36 = this.anIntArray373[local31];
			@Pc(41) byte local41 = this.aByteArray63[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(58) int local58 = local15 >> 3;
			@Pc(62) int local62 = local15 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(79) int local79 = (local41 + local62 - 1 >> 3) + local58;
			local15 += local41;
			@Pc(84) int local84 = local62 + 24;
			arg0[local58] = (byte) (local7 |= local36 >>> local84);
			if (local58 < local79) {
				local62 = local84 - 8;
				local58++;
				arg0[local58] = (byte) (local7 = local36 >>> local62);
				if (local58 < local79) {
					local62 -= 8;
					local58++;
					arg0[local58] = (byte) (local7 = local36 >>> local62);
					if (local58 < local79) {
						local58++;
						local62 -= 8;
						arg0[local58] = (byte) (local7 = local36 >>> local62);
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg0[local58] = (byte) (local7 = local36 << -local62);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[BBI[BI)I")
	public int method5896(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = arg0;
		@Pc(28) int local28 = arg2;
		while (true) {
			@Pc(32) byte local32 = arg1[local28];
			if (local32 < 0) {
				local22 = this.anIntArray372[local22];
			} else {
				local22++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local48;
				if (local26 <= arg4) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(86) int local86;
			if ((local86 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local86;
				if (local26 <= arg4) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local124;
				if (local26 <= arg4) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local156;
				if (local26 <= arg4) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(191) int local191;
			if ((local191 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local191;
				if (arg4 >= local26) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(223) int local223;
			if ((local223 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local223;
				if (local26 <= arg4) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(262) int local262;
			if ((local262 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local262;
				if (local26 <= arg4) {
					break;
				}
				local22 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local22++;
			} else {
				local22 = this.anIntArray372[local22];
			}
			@Pc(301) int local301;
			if ((local301 = this.anIntArray372[local22]) < 0) {
				arg3[arg4++] = (byte) ~local301;
				if (arg4 >= local26) {
					break;
				}
				local22 = 0;
			}
			local28++;
		}
		return local28 + 1 - arg2;
	}
}

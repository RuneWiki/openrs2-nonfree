import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class217 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
	private final int[] anIntArray479;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
	public Class217(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray75 = arg0;
		this.anIntArray479 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray478 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local16[local30];
				this.anIntArray479[local24] = local42;
				@Pc(57) int local57;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(83) int local83;
				if ((local42 & local38) == 0) {
					local57 = local38 | local42;
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local16[local67];
						if (local73 != local42) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local83 & local73) != 0) {
							local16[local67] = local16[local67 - 1];
							break;
						}
						local16[local67] = local83 | local73;
					}
				} else {
					local57 = local16[local30 - 1];
				}
				local16[local30] = local57;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local16[local67] == local42) {
						local16[local67] = local57;
					}
				}
				local73 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local83;
					if ((local42 & local149) == 0) {
						local73++;
					} else {
						if (this.anIntArray478[local73] == 0) {
							this.anIntArray478[local73] = local22;
						}
						local73 = this.anIntArray478[local73];
					}
					if (local73 >= this.anIntArray478.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray478.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray478.length; local192++) {
							local190[local192] = this.anIntArray478[local192];
						}
						this.anIntArray478 = local190;
					}
				}
				this.anIntArray478[local73] = ~local24;
				if (local73 >= local22) {
					local22 = local73 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([B[BIIII)I")
	public int method5119(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg4;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg3;
		while (true) {
			@Pc(26) byte local26 = arg0[local22];
			if (local26 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local42;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local77;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local113;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local151;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local186;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(222) int local222;
			if ((local222 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local222;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(254) int local254;
			if ((local254 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local254;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray478[local15];
			}
			@Pc(286) int local286;
			if ((local286 = this.anIntArray478[local15]) < 0) {
				arg1[arg2++] = (byte) ~local286;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z[BII[BI)I")
	public int method5121(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg4 << 3;
		@Pc(21) int local21 = arg2;
		while (local21 > arg1) {
			@Pc(29) int local29 = arg0[arg1] & 0xFF;
			@Pc(34) int local34 = this.anIntArray479[local29];
			@Pc(39) byte local39 = this.aByteArray75[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local17 >> 3;
			@Pc(63) int local63 = local17 & 0x7;
			local13 &= -local63 >> 31;
			@Pc(80) int local80 = local59 + (local39 + local63 - 1 >> 3);
			local17 += local39;
			@Pc(85) int local85 = local63 + 24;
			arg3[local59] = (byte) (local13 |= local34 >>> local85);
			if (local80 > local59) {
				local59++;
				local63 = local85 - 8;
				arg3[local59] = (byte) (local13 = local34 >>> local63);
				if (local59 < local80) {
					local63 -= 8;
					local59++;
					arg3[local59] = (byte) (local13 = local34 >>> local63);
					if (local59 < local80) {
						local63 -= 8;
						local59++;
						arg3[local59] = (byte) (local13 = local34 >>> local63);
						if (local80 > local59) {
							local63 -= 8;
							local59++;
							arg3[local59] = (byte) (local13 = local34 << -local63);
						}
					}
				}
			}
			arg1++;
		}
		return (local17 + 7 >> 3) - arg4;
	}
}

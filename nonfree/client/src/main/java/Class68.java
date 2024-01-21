import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class68 {

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
	private int[] anIntArray424;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
	private final int[] anIntArray423;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
	public Class68(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray424 = new int[8];
		this.anIntArray423 = new int[local6];
		this.aByteArray87 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray423[local24] = local46;
				@Pc(104) int local104;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(75) int local75;
				if ((local42 & local46) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local65 != local46) {
							break;
						}
						local75 = 0x1 << 32 - local59;
						if ((local65 & local75) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local75 | local65;
					}
					local104 = local42 | local46;
				} else {
					local104 = local20[local30 - 1];
				}
				local20[local30] = local104;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local20[local59] == local46) {
						local20[local59] = local104;
					}
				}
				local65 = 0;
				for (local75 = 0; local75 < local30; local75++) {
					@Pc(147) int local147 = Integer.MIN_VALUE >>> local75;
					if ((local147 & local46) == 0) {
						local65++;
					} else {
						if (this.anIntArray424[local65] == 0) {
							this.anIntArray424[local65] = local22;
						}
						local65 = this.anIntArray424[local65];
					}
					if (local65 >= this.anIntArray424.length) {
						@Pc(191) int[] local191 = new int[this.anIntArray424.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray424.length; local193++) {
							local191[local193] = this.anIntArray424[local193];
						}
						this.anIntArray424 = local191;
					}
				}
				this.anIntArray424[local65] = ~local24;
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[B[BIII)I")
	public int method1942(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg4 << 3;
		while (arg3 < local12) {
			@Pc(28) int local28 = arg1[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray423[local28];
			@Pc(38) byte local38 = this.aByteArray87[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local16 >> 3;
			@Pc(62) int local62 = local16 & 0x7;
			local16 += local38;
			local3 &= -local62 >> 31;
			@Pc(83) int local83 = (local62 + local38 - 1 >> 3) + local58;
			@Pc(84) int local84 = local62 + 24;
			arg2[local58] = (byte) (local3 |= local33 >>> local84);
			if (local83 > local58) {
				local58++;
				local62 = local84 - 8;
				arg2[local58] = (byte) (local3 = local33 >>> local62);
				if (local58 < local83) {
					local58++;
					local62 -= 8;
					arg2[local58] = (byte) (local3 = local33 >>> local62);
					if (local83 > local58) {
						local58++;
						local62 -= 8;
						arg2[local58] = (byte) (local3 = local33 >>> local62);
						if (local83 > local58) {
							local58++;
							local62 -= 8;
							arg2[local58] = (byte) (local3 = local33 << -local62);
						}
					}
				}
			}
			arg3++;
		}
		return (local16 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([BIII[BI)I")
	public int method1946(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg4;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg0[local22];
			if (local26 < 0) {
				local20 = this.anIntArray424[local20];
			} else {
				local20++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local45;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local80;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local115;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local151;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local186;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(222) int local222;
			if ((local222 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local222;
				if (arg1 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(261) int local261;
			if ((local261 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local261;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray424[local20];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray424[local20]) < 0) {
				arg3[arg1++] = (byte) ~local299;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg2;
	}
}

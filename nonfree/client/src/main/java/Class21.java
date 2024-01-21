import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class21 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
	private final int[] anIntArray117;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
	public Class21(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = arg0.length;
		this.aByteArray11 = arg0;
		this.anIntArray117 = new int[local11];
		this.anIntArray116 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local6[local30];
				this.anIntArray117[local24] = local43;
				@Pc(107) int local107;
				@Pc(56) int local56;
				@Pc(62) int local62;
				@Pc(76) int local76;
				if ((local43 & local39) == 0) {
					for (local56 = local30 - 1; local56 >= 1; local56--) {
						local62 = local6[local56];
						if (local62 != local43) {
							break;
						}
						local76 = 0x1 << 32 - local56;
						if ((local76 & local62) != 0) {
							local6[local56] = local6[local56 - 1];
							break;
						}
						local6[local56] = local76 | local62;
					}
					local107 = local43 | local39;
				} else {
					local107 = local6[local30 - 1];
				}
				local6[local30] = local107;
				for (local56 = local30 + 1; local56 <= 32; local56++) {
					if (local43 == local6[local56]) {
						local6[local56] = local107;
					}
				}
				local62 = 0;
				for (local76 = 0; local76 < local30; local76++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local76;
					if ((local154 & local43) == 0) {
						local62++;
					} else {
						if (this.anIntArray116[local62] == 0) {
							this.anIntArray116[local62] = local8;
						}
						local62 = this.anIntArray116[local62];
					}
					if (local62 >= this.anIntArray116.length) {
						@Pc(195) int[] local195 = new int[this.anIntArray116.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray116.length; local197++) {
							local195[local197] = this.anIntArray116[local197];
						}
						this.anIntArray116 = local195;
					}
				}
				if (local8 <= local62) {
					local8 = local62 + 1;
				}
				this.anIntArray116[local62] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB[BII[B)I")
	public int method552(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(26) int local26 = arg0;
		while (true) {
			@Pc(30) byte local30 = arg1[local26];
			if (local30 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local46;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local84;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(120) int local120;
			if ((local120 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local120;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local156;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local194;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local229;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local264;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray116[local18];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray116[local18]) < 0) {
				arg4[arg2++] = (byte) ~local303;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[BI[BZI)I")
	public int method556(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg2 << 3;
		while (arg4 < local16) {
			@Pc(28) int local28 = arg3[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray117[local28];
			@Pc(38) byte local38 = this.aByteArray11[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local20 & 0x7;
			@Pc(62) int local62 = local20 >> 3;
			local20 += local38;
			local12 &= -local58 >> 31;
			@Pc(83) int local83 = local62 + (local58 + local38 - 1 >> 3);
			@Pc(84) int local84 = local58 + 24;
			arg1[local62] = (byte) (local12 |= local33 >>> local84);
			if (local62 < local83) {
				local58 = local84 - 8;
				local62++;
				arg1[local62] = (byte) (local12 = local33 >>> local58);
				if (local83 > local62) {
					local62++;
					local58 -= 8;
					arg1[local62] = (byte) (local12 = local33 >>> local58);
					if (local83 > local62) {
						local62++;
						local58 -= 8;
						arg1[local62] = (byte) (local12 = local33 >>> local58);
						if (local62 < local83) {
							local58 -= 8;
							local62++;
							arg1[local62] = (byte) (local12 = local33 << -local58);
						}
					}
				}
			}
			arg4++;
		}
		return (local20 + 7 >> 3) - arg2;
	}
}

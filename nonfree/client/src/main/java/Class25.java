import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class25 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
	private final int[] anIntArray44;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
	public Class25(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray44 = new int[local6];
		this.aByteArray5 = arg0;
		@Pc(16) int[] local16 = new int[33];
		@Pc(18) int local18 = 0;
		this.anIntArray45 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray44[local24] = local46;
				@Pc(64) int local64;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(94) int local94;
				if ((local46 & local42) == 0) {
					local64 = local46 | local42;
					for (local74 = local30 - 1; local74 >= 1; local74--) {
						local80 = local16[local74];
						if (local46 != local80) {
							break;
						}
						local94 = 0x1 << 32 - local74;
						if ((local80 & local94) != 0) {
							local16[local74] = local16[local74 - 1];
							break;
						}
						local16[local74] = local80 | local94;
					}
				} else {
					local64 = local16[local30 - 1];
				}
				local16[local30] = local64;
				for (local74 = local30 + 1; local74 <= 32; local74++) {
					if (local46 == local16[local74]) {
						local16[local74] = local64;
					}
				}
				local80 = 0;
				for (local94 = 0; local94 < local30; local94++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local94;
					if ((local46 & local155) == 0) {
						local80++;
					} else {
						if (this.anIntArray45[local80] == 0) {
							this.anIntArray45[local80] = local18;
						}
						local80 = this.anIntArray45[local80];
					}
					if (this.anIntArray45.length <= local80) {
						@Pc(195) int[] local195 = new int[this.anIntArray45.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray45.length; local197++) {
							local195[local197] = this.anIntArray45[local197];
						}
						this.anIntArray45 = local195;
					}
				}
				this.anIntArray45[local80] = ~local24;
				if (local80 >= local18) {
					local18 = local80 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIIZ[BI)I")
	public int method684(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = arg4;
		@Pc(18) int local18 = arg1 << 3;
		while (local10 > arg2) {
			@Pc(25) int local25 = arg3[arg2] & 0xFF;
			@Pc(30) byte local30 = this.aByteArray5[local25];
			@Pc(35) int local35 = this.anIntArray44[local25];
			if (local30 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(55) int local55 = local18 & 0x7;
			@Pc(59) int local59 = local18 >> 3;
			local18 += local30;
			local1 &= -local55 >> 31;
			@Pc(80) int local80 = (local30 + local55 - 1 >> 3) + local59;
			@Pc(81) int local81 = local55 + 24;
			arg0[local59] = (byte) (local1 |= local35 >>> local81);
			if (local59 < local80) {
				local55 = local81 - 8;
				local59++;
				arg0[local59] = (byte) (local1 = local35 >>> local55);
				if (local59 < local80) {
					local59++;
					local55 -= 8;
					arg0[local59] = (byte) (local1 = local35 >>> local55);
					if (local59 < local80) {
						local55 -= 8;
						local59++;
						arg0[local59] = (byte) (local1 = local35 >>> local55);
						if (local80 > local59) {
							local59++;
							local55 -= 8;
							arg0[local59] = (byte) (local1 = local35 << -local55);
						}
					}
				}
			}
			arg2++;
		}
		return (local18 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII[BI)I")
	public int method685(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg1;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg0[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local42;
				if (local18 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local81;
				if (local18 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local113;
				if (arg4 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local148;
				if (local18 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local184;
				if (arg4 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(220) int local220;
			if ((local220 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local220;
				if (local18 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local259;
				if (local18 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray45[local20];
			}
			@Pc(301) int local301;
			if ((local301 = this.anIntArray45[local20]) < 0) {
				arg3[arg4++] = (byte) ~local301;
				if (local18 <= arg4) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg2;
	}
}

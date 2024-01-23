import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class59 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B)V")
	public Class59(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray195 = new int[8];
		this.anIntArray196 = new int[local6];
		this.aByteArray26 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray196[local24] = local43;
				@Pc(102) int local102;
				@Pc(56) int local56;
				@Pc(62) int local62;
				@Pc(71) int local71;
				if ((local39 & local43) == 0) {
					for (local56 = local30 - 1; local56 >= 1; local56--) {
						local62 = local20[local56];
						if (local43 != local62) {
							break;
						}
						local71 = 0x1 << 32 - local56;
						if ((local71 & local62) != 0) {
							local20[local56] = local20[local56 - 1];
							break;
						}
						local20[local56] = local71 | local62;
					}
					local102 = local39 | local43;
				} else {
					local102 = local20[local30 - 1];
				}
				local20[local30] = local102;
				for (local56 = local30 + 1; local56 <= 32; local56++) {
					if (local43 == local20[local56]) {
						local20[local56] = local102;
					}
				}
				local62 = 0;
				for (local71 = 0; local71 < local30; local71++) {
					@Pc(145) int local145 = Integer.MIN_VALUE >>> local71;
					if ((local43 & local145) == 0) {
						local62++;
					} else {
						if (this.anIntArray195[local62] == 0) {
							this.anIntArray195[local62] = local22;
						}
						local62 = this.anIntArray195[local62];
					}
					if (local62 >= this.anIntArray195.length) {
						@Pc(182) int[] local182 = new int[this.anIntArray195.length * 2];
						for (@Pc(184) int local184 = 0; local184 < this.anIntArray195.length; local184++) {
							local182[local184] = this.anIntArray195[local184];
						}
						this.anIntArray195 = local182;
					}
				}
				if (local22 <= local62) {
					local22 = local62 + 1;
				}
				this.anIntArray195[local62] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIIB[BI)I")
	public int method1584(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(9) int local9 = arg4 << 3;
		@Pc(11) int local11 = 0;
		while (local5 > arg2) {
			@Pc(31) int local31 = arg0[arg2] & 0xFF;
			@Pc(36) int local36 = this.anIntArray196[local31];
			@Pc(41) byte local41 = this.aByteArray26[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(61) int local61 = local9 >> 3;
			@Pc(65) int local65 = local9 & 0x7;
			local11 &= -local65 >> 31;
			local9 += local41;
			@Pc(86) int local86 = (local41 + local65 - 1 >> 3) + local61;
			@Pc(87) int local87 = local65 + 24;
			arg3[local61] = (byte) (local11 |= local36 >>> local87);
			if (local86 > local61) {
				local61++;
				local65 = local87 - 8;
				arg3[local61] = (byte) (local11 = local36 >>> local65);
				if (local86 > local61) {
					local61++;
					local65 -= 8;
					arg3[local61] = (byte) (local11 = local36 >>> local65);
					if (local86 > local61) {
						local65 -= 8;
						local61++;
						arg3[local61] = (byte) (local11 = local36 >>> local65);
						if (local61 < local86) {
							local61++;
							local65 -= 8;
							arg3[local61] = (byte) (local11 = local36 << -local65);
						}
					}
				}
			}
			arg2++;
		}
		return (local9 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIII[BI)I")
	public int method1588(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg3[local20];
			if (local29 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local48;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local90;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local125;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(167) int local167;
			if ((local167 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local167;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(206) int local206;
			if ((local206 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local206;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local242;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(284) int local284;
			if ((local284 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local284;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray195[local18];
			}
			@Pc(323) int local323;
			if ((local323 = this.anIntArray195[local18]) < 0) {
				arg0[arg2++] = (byte) ~local323;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}
}

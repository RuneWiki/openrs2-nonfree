import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class24 {

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "[I")
	private final int[] anIntArray187;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public Class24(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray20 = arg0;
		this.anIntArray187 = new int[local6];
		this.anIntArray186 = new int[8];
		@Pc(19) int local19 = 0;
		@Pc(22) int[] local22 = new int[33];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local22[local30];
				this.anIntArray187[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(86) int local86;
				if ((local43 & local39) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local22[local64];
						if (local70 != local43) {
							break;
						}
						local86 = 0x1 << 32 - local64;
						if ((local70 & local86) != 0) {
							local22[local64] = local22[local64 - 1];
							break;
						}
						local22[local64] = local86 | local70;
					}
					local58 = local43 | local39;
				} else {
					local58 = local22[local30 - 1];
				}
				local22[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local43 == local22[local64]) {
						local22[local64] = local58;
					}
				}
				local70 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local86;
					if ((local43 & local158) == 0) {
						local70++;
					} else {
						if (this.anIntArray186[local70] == 0) {
							this.anIntArray186[local70] = local19;
						}
						local70 = this.anIntArray186[local70];
					}
					if (this.anIntArray186.length <= local70) {
						@Pc(199) int[] local199 = new int[this.anIntArray186.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray186.length; local201++) {
							local199[local201] = this.anIntArray186[local201];
						}
						this.anIntArray186 = local199;
					}
				}
				this.anIntArray186[local70] = ~local24;
				if (local70 >= local19) {
					local19 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[B[BII)I")
	public int method1345(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local43;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local79;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local114;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(150) int local150;
			if ((local150 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local150;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(185) int local185;
			if ((local185 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local185;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(224) int local224;
			if ((local224 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local224;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(263) int local263;
			if ((local263 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local263;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray186[local18];
			}
			@Pc(295) int local295;
			if ((local295 = this.anIntArray186[local18]) < 0) {
				arg1[arg4++] = (byte) ~local295;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZI[B[B)I")
	public int method1348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = 0;
		@Pc(21) int local21 = arg1 << 3;
		while (arg0 < local9) {
			@Pc(29) int local29 = arg3[arg0] & 0xFF;
			@Pc(34) byte local34 = this.aByteArray20[local29];
			@Pc(39) int local39 = this.anIntArray187[local29];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local21 >> 3;
			@Pc(60) int local60 = local21 & 0x7;
			local17 &= -local60 >> 31;
			@Pc(78) int local78 = local56 + (local34 + local60 - 1 >> 3);
			@Pc(79) int local79 = local60 + 24;
			arg4[local56] = (byte) (local17 |= local39 >>> local79);
			if (local78 > local56) {
				local56++;
				local60 = local79 - 8;
				arg4[local56] = (byte) (local17 = local39 >>> local60);
				if (local56 < local78) {
					local56++;
					local60 -= 8;
					arg4[local56] = (byte) (local17 = local39 >>> local60);
					if (local78 > local56) {
						local60 -= 8;
						local56++;
						arg4[local56] = (byte) (local17 = local39 >>> local60);
						if (local78 > local56) {
							local56++;
							local60 -= 8;
							arg4[local56] = (byte) (local17 = local39 << -local60);
						}
					}
				}
			}
			local21 += local34;
			arg0++;
		}
		return (local21 + 7 >> 3) - arg1;
	}
}

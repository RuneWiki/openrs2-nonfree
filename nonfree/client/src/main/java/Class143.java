import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class143 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
	public Class143(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray349 = new int[8];
		this.aByteArray45 = arg0;
		this.anIntArray347 = new int[local6];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(35) byte local35 = arg0[local24];
			if (local35 != 0) {
				@Pc(44) int local44 = 0x1 << 32 - local35;
				@Pc(48) int local48 = local20[local35];
				this.anIntArray347[local24] = local48;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(76) int local76;
				@Pc(90) int local90;
				if ((local48 & local44) == 0) {
					for (local69 = local35 - 1; local69 >= 1; local69--) {
						local76 = local20[local69];
						if (local76 != local48) {
							break;
						}
						local90 = 0x1 << 32 - local69;
						if ((local90 & local76) != 0) {
							local20[local69] = local20[local69 - 1];
							break;
						}
						local20[local69] = local90 | local76;
					}
					local63 = local44 | local48;
				} else {
					local63 = local20[local35 - 1];
				}
				local20[local35] = local63;
				for (local69 = local35 + 1; local69 <= 32; local69++) {
					if (local48 == local20[local69]) {
						local20[local69] = local63;
					}
				}
				local69 = 0;
				for (local76 = 0; local76 < local35; local76++) {
					local90 = Integer.MIN_VALUE >>> local76;
					if ((local48 & local90) == 0) {
						local69++;
					} else {
						if (this.anIntArray349[local69] == 0) {
							this.anIntArray349[local69] = local22;
						}
						local69 = this.anIntArray349[local69];
					}
					if (this.anIntArray349.length <= local69) {
						@Pc(207) int[] local207 = new int[this.anIntArray349.length * 2];
						for (@Pc(209) int local209 = 0; local209 < this.anIntArray349.length; local209++) {
							local207[local209] = this.anIntArray349[local209];
						}
						this.anIntArray349 = local207;
					}
				}
				this.anIntArray349[local69] = ~local24;
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIII[BI)I")
	public int method3498(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 << 3;
		@Pc(15) int local15 = 0;
		while (arg1 < local9) {
			@Pc(24) int local24 = arg0[arg1] & 0xFF;
			@Pc(29) int local29 = this.anIntArray347[local24];
			@Pc(34) byte local34 = this.aByteArray45[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(53) int local53 = local13 >> 3;
			@Pc(57) int local57 = local13 & 0x7;
			local15 &= -local57 >> 31;
			@Pc(74) int local74 = (local34 + local57 - 1 >> 3) + local53;
			@Pc(75) int local75 = local57 + 24;
			arg3[local53] = (byte) (local15 |= local29 >>> local75);
			if (local53 < local74) {
				local57 = local75 - 8;
				local53++;
				arg3[local53] = (byte) (local15 = local29 >>> local57);
				if (local53 < local74) {
					local53++;
					local57 -= 8;
					arg3[local53] = (byte) (local15 = local29 >>> local57);
					if (local53 < local74) {
						local57 -= 8;
						local53++;
						arg3[local53] = (byte) (local15 = local29 >>> local57);
						if (local53 < local74) {
							local53++;
							local57 -= 8;
							arg3[local53] = (byte) (local15 = local29 << -local57);
						}
					}
				}
			}
			local13 += local34;
			arg1++;
		}
		return (local13 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII[BI)I")
	public int method3501(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg4;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg0;
		while (true) {
			@Pc(24) byte local24 = arg3[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(44) int local44;
			if ((local44 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local44;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local84;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local124;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local160;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local197;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(239) int local239;
			if ((local239 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local239;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(276) int local276;
			if ((local276 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local276;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray349[local18];
			}
			@Pc(314) int local314;
			if ((local314 = this.anIntArray349[local18]) < 0) {
				arg1[arg2++] = (byte) ~local314;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg0;
	}
}

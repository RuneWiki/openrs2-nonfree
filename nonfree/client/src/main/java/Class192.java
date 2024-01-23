import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class192 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
	private int[] anIntArray619;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "[I")
	private int[] anIntArray620;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray619 = new int[8];
		@Pc(13) int[] local13 = new int[33];
		this.aByteArray76 = arg0;
		this.anIntArray620 = new int[local6];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(31) byte local31 = arg0[local24];
			if (local31 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local31;
				@Pc(45) int local45 = local13[local31];
				this.anIntArray620[local24] = local45;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(94) int local94;
				if ((local45 & local41) == 0) {
					for (local69 = local31 - 1; local69 >= 1; local69--) {
						local78 = local13[local69];
						if (local45 != local78) {
							break;
						}
						local94 = 0x1 << 32 - local69;
						if ((local78 & local94) != 0) {
							local13[local69] = local13[local69 - 1];
							break;
						}
						local13[local69] = local78 | local94;
					}
					local63 = local45 | local41;
				} else {
					local63 = local13[local31 - 1];
				}
				local13[local31] = local63;
				for (local69 = local31 + 1; local69 <= 32; local69++) {
					if (local45 == local13[local69]) {
						local13[local69] = local63;
					}
				}
				local69 = 0;
				for (local78 = 0; local78 < local31; local78++) {
					local94 = Integer.MIN_VALUE >>> local78;
					if ((local45 & local94) == 0) {
						local69++;
					} else {
						if (this.anIntArray619[local69] == 0) {
							this.anIntArray619[local69] = local22;
						}
						local69 = this.anIntArray619[local69];
					}
					if (this.anIntArray619.length <= local69) {
						@Pc(207) int[] local207 = new int[this.anIntArray619.length * 2];
						for (@Pc(209) int local209 = 0; local209 < this.anIntArray619.length; local209++) {
							local207[local209] = this.anIntArray619[local209];
						}
						this.anIntArray619 = local207;
					}
				}
				this.anIntArray619[local69] = ~local24;
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BII[BI)I")
	public int method4926(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = arg1;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg4;
		while (true) {
			@Pc(22) byte local22 = arg3[local18];
			if (local22 < 0) {
				local16 = this.anIntArray619[local16];
			} else {
				local16++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local40;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local80;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(117) int local117;
			if ((local117 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local117;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local152;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(189) int local189;
			if ((local189 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local189;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(224) int local224;
			if ((local224 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local224;
				if (local14 <= arg2) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local267;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray619[local16];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray619[local16]) < 0) {
				arg0[arg2++] = (byte) ~local303;
				if (arg2 >= local14) {
					break;
				}
				local16 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg4;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI[B[BII)I")
	public int method4927(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg4 << 3;
		while (arg3 < local11) {
			@Pc(28) int local28 = arg2[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray620[local28];
			@Pc(38) byte local38 = this.aByteArray76[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(57) int local57 = local15 >> 3;
			@Pc(61) int local61 = local15 & 0x7;
			local15 += local38;
			local3 &= -local61 >> 31;
			@Pc(83) int local83 = local57 + (local61 + local38 - 1 >> 3);
			@Pc(84) int local84 = local61 + 24;
			arg1[local57] = (byte) (local3 |= local33 >>> local84);
			if (local83 > local57) {
				local61 = local84 - 8;
				local57++;
				arg1[local57] = (byte) (local3 = local33 >>> local61);
				if (local83 > local57) {
					local61 -= 8;
					local57++;
					arg1[local57] = (byte) (local3 = local33 >>> local61);
					if (local57 < local83) {
						local61 -= 8;
						local57++;
						arg1[local57] = (byte) (local3 = local33 >>> local61);
						if (local83 > local57) {
							local57++;
							local61 -= 8;
							arg1[local57] = (byte) (local3 = local33 << -local61);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}

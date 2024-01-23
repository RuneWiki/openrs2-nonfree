import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class101 {

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "([B)V")
	public Class101(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray60 = arg0;
		this.anIntArray558 = new int[8];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray557 = new int[local6];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray557[local24] = local46;
				@Pc(111) int local111;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(79) int local79;
				if ((local46 & local42) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local16[local59];
						if (local65 != local46) {
							break;
						}
						local79 = 0x1 << 32 - local59;
						if ((local79 & local65) != 0) {
							local16[local59] = local16[local59 - 1];
							break;
						}
						local16[local59] = local65 | local79;
					}
					local111 = local46 | local42;
				} else {
					local111 = local16[local30 - 1];
				}
				local16[local30] = local111;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local16[local59] == local46) {
						local16[local59] = local111;
					}
				}
				local65 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local79;
					if ((local46 & local158) == 0) {
						local65++;
					} else {
						if (this.anIntArray558[local65] == 0) {
							this.anIntArray558[local65] = local22;
						}
						local65 = this.anIntArray558[local65];
					}
					if (local65 >= this.anIntArray558.length) {
						@Pc(199) int[] local199 = new int[this.anIntArray558.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray558.length; local201++) {
							local199[local201] = this.anIntArray558[local201];
						}
						this.anIntArray558 = local199;
					}
				}
				this.anIntArray558[local65] = ~local24;
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([BIII[BI)I")
	public int method3120(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = arg1;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg2;
		while (true) {
			@Pc(22) byte local22 = arg3[local18];
			if (local22 >= 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(41) int local41;
			if ((local41 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local41;
				if (local14 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x40) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(79) int local79;
			if ((local79 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local79;
				if (arg4 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x20) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(117) int local117;
			if ((local117 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local117;
				if (arg4 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x10) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local156;
				if (local14 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x8) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(194) int local194;
			if ((local194 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local194;
				if (local14 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x4) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(233) int local233;
			if ((local233 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local233;
				if (local14 <= arg4) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x2) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(268) int local268;
			if ((local268 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local268;
				if (arg4 >= local14) {
					break;
				}
				local16 = 0;
			}
			if ((local22 & 0x1) == 0) {
				local16++;
			} else {
				local16 = this.anIntArray558[local16];
			}
			@Pc(300) int local300;
			if ((local300 = this.anIntArray558[local16]) < 0) {
				arg0[arg4++] = (byte) ~local300;
				if (arg4 >= local14) {
					break;
				}
				local16 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg2;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "([BIII[BI)I")
	public int method3121(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4;
		@Pc(18) int local18 = arg1 << 3;
		@Pc(20) int local20 = 0;
		while (local5 > arg2) {
			@Pc(28) int local28 = arg3[arg2] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray60[local28];
			@Pc(38) int local38 = this.anIntArray557[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local18 >> 3;
			@Pc(59) int local59 = local18 & 0x7;
			local20 &= -local59 >> 31;
			local18 += local33;
			@Pc(81) int local81 = (local59 + local33 - 1 >> 3) + local55;
			@Pc(82) int local82 = local59 + 24;
			arg0[local55] = (byte) (local20 |= local38 >>> local82);
			if (local81 > local55) {
				local55++;
				local59 = local82 - 8;
				arg0[local55] = (byte) (local20 = local38 >>> local59);
				if (local81 > local55) {
					local59 -= 8;
					local55++;
					arg0[local55] = (byte) (local20 = local38 >>> local59);
					if (local55 < local81) {
						local59 -= 8;
						local55++;
						arg0[local55] = (byte) (local20 = local38 >>> local59);
						if (local55 < local81) {
							local55++;
							local59 -= 8;
							arg0[local55] = (byte) (local20 = local38 << -local59);
						}
					}
				}
			}
			arg2++;
		}
		return (local18 + 7 >> 3) - arg1;
	}
}

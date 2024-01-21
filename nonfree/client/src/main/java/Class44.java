import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class44 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[B")
	private final byte[] aByteArray12;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
	private final int[] anIntArray175;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
	public Class44(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int[] local8 = new int[33];
		@Pc(11) int local11 = arg0.length;
		this.aByteArray12 = arg0;
		this.anIntArray174 = new int[8];
		this.anIntArray175 = new int[local11];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local8[local30];
				this.anIntArray175[local24] = local45;
				@Pc(61) int local61;
				@Pc(65) int local65;
				@Pc(71) int local71;
				@Pc(83) int local83;
				if ((local41 & local45) == 0) {
					local61 = local45 | local41;
					for (local65 = local30 - 1; local65 >= 1; local65--) {
						local71 = local8[local65];
						if (local45 != local71) {
							break;
						}
						local83 = 0x1 << 32 - local65;
						if ((local71 & local83) != 0) {
							local8[local65] = local8[local65 - 1];
							break;
						}
						local8[local65] = local71 | local83;
					}
				} else {
					local61 = local8[local30 - 1];
				}
				local8[local30] = local61;
				for (local65 = local30 + 1; local65 <= 32; local65++) {
					if (local8[local65] == local45) {
						local8[local65] = local61;
					}
				}
				local71 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local83;
					if ((local45 & local155) == 0) {
						local71++;
					} else {
						if (this.anIntArray174[local71] == 0) {
							this.anIntArray174[local71] = local5;
						}
						local71 = this.anIntArray174[local71];
					}
					if (local71 >= this.anIntArray174.length) {
						@Pc(192) int[] local192 = new int[this.anIntArray174.length * 2];
						for (@Pc(194) int local194 = 0; local194 < this.anIntArray174.length; local194++) {
							local192[local194] = this.anIntArray174[local194];
						}
						this.anIntArray174 = local192;
					}
				}
				if (local5 <= local71) {
					local5 = local71 + 1;
				}
				this.anIntArray174[local71] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII[BI)I")
	public int method1122(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg4;
		while (true) {
			@Pc(24) byte local24 = arg1[local20];
			if (local24 < 0) {
				local18 = this.anIntArray174[local18];
			} else {
				local18++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local40;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(78) int local78;
			if ((local78 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local78;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local113;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local148;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local187;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(225) int local225;
			if ((local225 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local225;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local260;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray174[local18];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray174[local18]) < 0) {
				arg3[arg2++] = (byte) ~local302;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg4;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[BI[B)I")
	public int method1126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg3 << 3;
		@Pc(14) int local14 = arg1;
		@Pc(16) int local16 = 0;
		while (arg0 < local14) {
			@Pc(28) int local28 = arg4[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray175[local28];
			@Pc(38) byte local38 = this.aByteArray12[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local5 >> 3;
			@Pc(62) int local62 = local5 & 0x7;
			@Pc(73) int local73 = (local62 + local38 - 1 >> 3) + local58;
			local16 &= -local62 >> 31;
			@Pc(81) int local81 = local62 + 24;
			arg2[local58] = (byte) (local16 |= local33 >>> local81);
			if (local58 < local73) {
				local62 = local81 - 8;
				local58++;
				arg2[local58] = (byte) (local16 = local33 >>> local62);
				if (local58 < local73) {
					local58++;
					local62 -= 8;
					arg2[local58] = (byte) (local16 = local33 >>> local62);
					if (local73 > local58) {
						local58++;
						local62 -= 8;
						arg2[local58] = (byte) (local16 = local33 >>> local62);
						if (local73 > local58) {
							local58++;
							local62 -= 8;
							arg2[local58] = (byte) (local16 = local33 << -local62);
						}
					}
				}
			}
			local5 += local38;
			arg0++;
		}
		return (local5 + 7 >> 3) - arg3;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class229 {

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "[I")
	private final int[] anIntArray347;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "([B)V")
	public Class229(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray347 = new int[local6];
		this.aByteArray61 = arg0;
		this.anIntArray345 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray347[local24] = local43;
				@Pc(107) int local107;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(74) int local74;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local65 != local43) {
							break;
						}
						local74 = 0x1 << 32 - local59;
						if ((local74 & local65) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local74 | local65;
					}
					local107 = local39 | local43;
				} else {
					local107 = local20[local30 - 1];
				}
				local20[local30] = local107;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local43 == local20[local59]) {
						local20[local59] = local107;
					}
				}
				local65 = 0;
				for (local74 = 0; local74 < local30; local74++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local74;
					if ((local43 & local154) == 0) {
						local65++;
					} else {
						if (this.anIntArray345[local65] == 0) {
							this.anIntArray345[local65] = local22;
						}
						local65 = this.anIntArray345[local65];
					}
					if (local65 >= this.anIntArray345.length) {
						@Pc(188) int[] local188 = new int[this.anIntArray345.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray345.length; local190++) {
							local188[local190] = this.anIntArray345[local190];
						}
						this.anIntArray345 = local188;
					}
				}
				if (local65 >= local22) {
					local22 = local65 + 1;
				}
				this.anIntArray345[local65] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[BII[BI)I")
	public int method6043(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg3 << 3;
		while (local11 > arg2) {
			@Pc(28) int local28 = arg4[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray347[local28];
			@Pc(38) byte local38 = this.aByteArray61[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(58) int local58 = local15 >> 3;
			@Pc(62) int local62 = local15 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(79) int local79 = (local62 + local38 - 1 >> 3) + local58;
			@Pc(80) int local80 = local62 + 24;
			arg1[local58] = (byte) (local7 |= local33 >>> local80);
			if (local79 > local58) {
				local62 = local80 - 8;
				local58++;
				arg1[local58] = (byte) (local7 = local33 >>> local62);
				if (local58 < local79) {
					local62 -= 8;
					local58++;
					arg1[local58] = (byte) (local7 = local33 >>> local62);
					if (local79 > local58) {
						local58++;
						local62 -= 8;
						arg1[local58] = (byte) (local7 = local33 >>> local62);
						if (local58 < local79) {
							local62 -= 8;
							local58++;
							arg1[local58] = (byte) (local7 = local33 << -local62);
						}
					}
				}
			}
			local15 += local38;
			arg2++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I[BII[BI)I")
	public int method6045(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2;
		@Pc(22) int local22 = arg0;
		while (true) {
			@Pc(26) byte local26 = arg3[local22];
			if (local26 < 0) {
				local11 = this.anIntArray345[local11];
			} else {
				local11++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local45;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local81;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local119;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local155;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local197;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local232;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local271;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray345[local11];
			}
			@Pc(307) int local307;
			if ((local307 = this.anIntArray345[local11]) < 0) {
				arg1[arg4++] = (byte) ~local307;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg0;
	}
}

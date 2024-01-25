import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class71 {

	@OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
	private final int[] anIntArray156;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V")
	public Class71(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray156 = new int[local6];
		this.aByteArray28 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray155 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray156[local24] = local46;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(89) int local89;
				if ((local46 & local42) == 0) {
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local16[local70];
						if (local46 != local76) {
							break;
						}
						local89 = 0x1 << 32 - local70;
						if ((local89 & local76) != 0) {
							local16[local70] = local16[local70 - 1];
							break;
						}
						local16[local70] = local76 | local89;
					}
					local64 = local46 | local42;
				} else {
					local64 = local16[local30 - 1];
				}
				local16[local30] = local64;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local46 == local16[local70]) {
						local16[local70] = local64;
					}
				}
				local76 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local89;
					if ((local46 & local154) == 0) {
						local76++;
					} else {
						if (this.anIntArray155[local76] == 0) {
							this.anIntArray155[local76] = local22;
						}
						local76 = this.anIntArray155[local76];
					}
					if (this.anIntArray155.length <= local76) {
						@Pc(195) int[] local195 = new int[this.anIntArray155.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray155.length; local197++) {
							local195[local197] = this.anIntArray155[local197];
						}
						this.anIntArray155 = local195;
					}
				}
				this.anIntArray155[local76] = ~local24;
				if (local76 >= local22) {
					local22 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I[BIII[B)I")
	public int method1481(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg2;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg0;
		while (true) {
			@Pc(26) byte local26 = arg4[local22];
			if (local26 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local45;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local77;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(112) int local112;
			if ((local112 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local112;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local148;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(186) int local186;
			if ((local186 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local186;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(218) int local218;
			if ((local218 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local218;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(256) int local256;
			if ((local256 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local256;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray155[local15];
			}
			@Pc(291) int local291;
			if ((local291 = this.anIntArray155[local15]) < 0) {
				arg1[arg3++] = (byte) ~local291;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I[BI[BII)I")
	public int method1484(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2;
		@Pc(15) int local15 = arg0 << 3;
		while (local11 > arg4) {
			@Pc(28) int local28 = arg1[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray156[local28];
			@Pc(38) byte local38 = this.aByteArray28[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local15 >> 3;
			@Pc(59) int local59 = local15 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(78) int local78 = local59 + 24;
			arg3[local55] = (byte) (local7 |= local33 >>> local78);
			if (local77 > local55) {
				local55++;
				local59 = local78 - 8;
				arg3[local55] = (byte) (local7 = local33 >>> local59);
				if (local55 < local77) {
					local59 -= 8;
					local55++;
					arg3[local55] = (byte) (local7 = local33 >>> local59);
					if (local77 > local55) {
						local55++;
						local59 -= 8;
						arg3[local55] = (byte) (local7 = local33 >>> local59);
						if (local77 > local55) {
							local55++;
							local59 -= 8;
							arg3[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			local15 += local38;
			arg4++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}

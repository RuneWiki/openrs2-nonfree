import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class67 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
	private final int[] anIntArray114;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
	public Class67(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray114 = new int[local6];
		this.aByteArray14 = arg0;
		this.anIntArray113 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray114[local24] = local42;
				@Pc(60) int local60;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(90) int local90;
				if ((local38 & local42) == 0) {
					local60 = local42 | local38;
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local20[local70];
						if (local42 != local76) {
							break;
						}
						local90 = 0x1 << 32 - local70;
						if ((local76 & local90) != 0) {
							local20[local70] = local20[local70 - 1];
							break;
						}
						local20[local70] = local90 | local76;
					}
				} else {
					local60 = local20[local30 - 1];
				}
				local20[local30] = local60;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local20[local70] == local42) {
						local20[local70] = local60;
					}
				}
				local76 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local90;
					if ((local157 & local42) == 0) {
						local76++;
					} else {
						if (this.anIntArray113[local76] == 0) {
							this.anIntArray113[local76] = local22;
						}
						local76 = this.anIntArray113[local76];
					}
					if (local76 >= this.anIntArray113.length) {
						@Pc(197) int[] local197 = new int[this.anIntArray113.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray113.length; local199++) {
							local197[local199] = this.anIntArray113[local199];
						}
						this.anIntArray113 = local197;
					}
				}
				this.anIntArray113[local76] = ~local24;
				if (local22 <= local76) {
					local22 = local76 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI[BI[BI)I")
	public int method1751(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg2 << 3;
		@Pc(20) int local20 = arg4;
		while (local20 > arg0) {
			@Pc(28) int local28 = arg3[arg0] & 0xFF;
			@Pc(33) int local33 = this.anIntArray114[local28];
			@Pc(38) byte local38 = this.aByteArray14[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(78) int local78 = local55 + (local59 + local38 - 1 >> 3);
			@Pc(79) int local79 = local59 + 24;
			arg1[local55] = (byte) (local12 |= local33 >>> local79);
			if (local78 > local55) {
				local59 = local79 - 8;
				local55++;
				arg1[local55] = (byte) (local12 = local33 >>> local59);
				if (local55 < local78) {
					local59 -= 8;
					local55++;
					arg1[local55] = (byte) (local12 = local33 >>> local59);
					if (local78 > local55) {
						local59 -= 8;
						local55++;
						arg1[local55] = (byte) (local12 = local33 >>> local59);
						if (local78 > local55) {
							local59 -= 8;
							local55++;
							arg1[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local16 += local38;
			arg0++;
		}
		return (local16 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BI[BIB)I")
	public int method1755(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg2;
		@Pc(18) int local18 = 0;
		@Pc(25) int local25 = arg4;
		while (true) {
			@Pc(29) byte local29 = arg3[local25];
			if (local29 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local45;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local77;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local113;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(148) int local148;
			if ((local148 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local148;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local184;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(226) int local226;
			if ((local226 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local226;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(268) int local268;
			if ((local268 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local268;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray113[local18];
			}
			@Pc(306) int local306;
			if ((local306 = this.anIntArray113[local18]) < 0) {
				arg1[arg0++] = (byte) ~local306;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg4;
	}
}

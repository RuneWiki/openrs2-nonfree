import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class213 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[B")
	private final byte[] aByteArray70;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
	private final int[] anIntArray444;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V")
	public Class213(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray70 = arg0;
		this.anIntArray444 = new int[local6];
		this.anIntArray445 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray444[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(79) int local79;
				if ((local46 & local42) == 0) {
					local59 = local46 | local42;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local46 != local69) {
							break;
						}
						local79 = 0x1 << 32 - local63;
						if ((local69 & local79) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local69 | local79;
					}
				} else {
					local59 = local20[local30 - 1];
				}
				local20[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local46 == local20[local63]) {
						local20[local63] = local59;
					}
				}
				local69 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local79;
					if ((local46 & local154) == 0) {
						local69++;
					} else {
						if (this.anIntArray445[local69] == 0) {
							this.anIntArray445[local69] = local22;
						}
						local69 = this.anIntArray445[local69];
					}
					if (local69 >= this.anIntArray445.length) {
						@Pc(199) int[] local199 = new int[this.anIntArray445.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray445.length; local201++) {
							local199[local201] = this.anIntArray445[local201];
						}
						this.anIntArray445 = local199;
					}
				}
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
				this.anIntArray445[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BIII[B)I")
	public int method5245(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(24) int local24 = arg1;
		while (true) {
			@Pc(28) byte local28 = arg0[local24];
			if (local28 < 0) {
				local15 = this.anIntArray445[local15];
			} else {
				local15++;
			}
			@Pc(44) int local44;
			if ((local44 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local44;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local80;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(119) int local119;
			if ((local119 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local119;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local157;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local199;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local238;
				if (local13 <= arg2) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(277) int local277;
			if ((local277 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local277;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local28 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray445[local15];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray445[local15]) < 0) {
				arg4[arg2++] = (byte) ~local315;
				if (arg2 >= local13) {
					break;
				}
				local15 = 0;
			}
			local24++;
		}
		return local24 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BI[BII)I")
	public int method5247(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg4 << 3;
		@Pc(21) int local21 = arg2;
		while (arg0 < local21) {
			@Pc(29) int local29 = arg3[arg0] & 0xFF;
			@Pc(34) int local34 = this.anIntArray444[local29];
			@Pc(39) byte local39 = this.aByteArray70[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local17 >> 3;
			@Pc(60) int local60 = local17 & 0x7;
			local13 &= -local60 >> 31;
			@Pc(77) int local77 = (local39 + local60 - 1 >> 3) + local56;
			@Pc(78) int local78 = local60 + 24;
			arg1[local56] = (byte) (local13 |= local34 >>> local78);
			if (local56 < local77) {
				local60 = local78 - 8;
				local56++;
				arg1[local56] = (byte) (local13 = local34 >>> local60);
				if (local77 > local56) {
					local60 -= 8;
					local56++;
					arg1[local56] = (byte) (local13 = local34 >>> local60);
					if (local56 < local77) {
						local60 -= 8;
						local56++;
						arg1[local56] = (byte) (local13 = local34 >>> local60);
						if (local56 < local77) {
							local60 -= 8;
							local56++;
							arg1[local56] = (byte) (local13 = local34 << -local60);
						}
					}
				}
			}
			local17 += local39;
			arg0++;
		}
		return (local17 + 7 >> 3) - arg4;
	}
}

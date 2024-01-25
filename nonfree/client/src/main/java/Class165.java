import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class165 {

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "[I")
	private final int[] anIntArray301;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "([B)V")
	public Class165(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray301 = new int[local6];
		this.aByteArray44 = arg0;
		this.anIntArray300 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray301[local24] = local46;
				@Pc(116) int local116;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(84) int local84;
				if ((local46 & local42) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local20[local62];
						if (local68 != local46) {
							break;
						}
						local84 = 0x1 << 32 - local62;
						if ((local84 & local68) != 0) {
							local20[local62] = local20[local62 - 1];
							break;
						}
						local20[local62] = local68 | local84;
					}
					local116 = local42 | local46;
				} else {
					local116 = local20[local30 - 1];
				}
				local20[local30] = local116;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local20[local62] == local46) {
						local20[local62] = local116;
					}
				}
				local68 = 0;
				for (local84 = 0; local84 < local30; local84++) {
					@Pc(161) int local161 = Integer.MIN_VALUE >>> local84;
					if ((local161 & local46) == 0) {
						local68++;
					} else {
						if (this.anIntArray300[local68] == 0) {
							this.anIntArray300[local68] = local22;
						}
						local68 = this.anIntArray300[local68];
					}
					if (local68 >= this.anIntArray300.length) {
						@Pc(203) int[] local203 = new int[this.anIntArray300.length * 2];
						for (@Pc(205) int local205 = 0; local205 < this.anIntArray300.length; local205++) {
							local203[local205] = this.anIntArray300[local205];
						}
						this.anIntArray300 = local203;
					}
				}
				this.anIntArray300[local68] = ~local24;
				if (local68 >= local22) {
					local22 = local68 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IBII[B[B)I")
	public int method3672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = arg0;
		while (true) {
			@Pc(32) byte local32 = arg3[local20];
			if (local32 < 0) {
				local14 = this.anIntArray300[local14];
			} else {
				local14++;
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local48;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local87;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local126;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local165;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(204) int local204;
			if ((local204 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local204;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(246) int local246;
			if ((local246 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local246;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(284) int local284;
			if ((local284 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local284;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local32 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray300[local14];
			}
			@Pc(326) int local326;
			if ((local326 = this.anIntArray300[local14]) < 0) {
				arg4[arg1++] = (byte) ~local326;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg0;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[BII[BI)I")
	public int method3674(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(15) int local15 = arg0 << 3;
		while (local11 > arg2) {
			@Pc(23) int local23 = arg3[arg2] & 0xFF;
			@Pc(28) int local28 = this.anIntArray301[local23];
			@Pc(33) byte local33 = this.aByteArray44[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = (local54 + local33 - 1 >> 3) + local50;
			local15 += local33;
			@Pc(76) int local76 = local54 + 24;
			arg1[local50] = (byte) (local7 |= local28 >>> local76);
			if (local71 > local50) {
				local54 = local76 - 8;
				local50++;
				arg1[local50] = (byte) (local7 = local28 >>> local54);
				if (local71 > local50) {
					local54 -= 8;
					local50++;
					arg1[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local71) {
						local54 -= 8;
						local50++;
						arg1[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local71) {
							local54 -= 8;
							local50++;
							arg1[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg2++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}

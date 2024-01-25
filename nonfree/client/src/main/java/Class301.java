import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class301 {

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
	private final int[] anIntArray506;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "([B)V")
	public Class301(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray82 = arg0;
		this.anIntArray506 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray505 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray506[local24] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(78) int local78;
				if ((local43 & local39) == 0) {
					local56 = local39 | local43;
					for (local60 = local30 - 1; local60 >= 1; local60--) {
						local66 = local16[local60];
						if (local43 != local66) {
							break;
						}
						local78 = 0x1 << 32 - local60;
						if ((local78 & local66) != 0) {
							local16[local60] = local16[local60 - 1];
							break;
						}
						local16[local60] = local66 | local78;
					}
				} else {
					local56 = local16[local30 - 1];
				}
				local16[local30] = local56;
				for (local60 = local30 + 1; local60 <= 32; local60++) {
					if (local16[local60] == local43) {
						local16[local60] = local56;
					}
				}
				local66 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(145) int local145 = Integer.MIN_VALUE >>> local78;
					if ((local43 & local145) == 0) {
						local66++;
					} else {
						if (this.anIntArray505[local66] == 0) {
							this.anIntArray505[local66] = local22;
						}
						local66 = this.anIntArray505[local66];
					}
					if (this.anIntArray505.length <= local66) {
						@Pc(183) int[] local183 = new int[this.anIntArray505.length * 2];
						for (@Pc(185) int local185 = 0; local185 < this.anIntArray505.length; local185++) {
							local183[local185] = this.anIntArray505[local185];
						}
						this.anIntArray505 = local183;
					}
				}
				if (local66 >= local22) {
					local22 = local66 + 1;
				}
				this.anIntArray505[local66] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[BIII[B)I")
	public int method6444(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3 << 3;
		@Pc(26) int local26 = arg0;
		while (local26 > arg2) {
			@Pc(34) int local34 = arg1[arg2] & 0xFF;
			@Pc(39) int local39 = this.anIntArray506[local34];
			@Pc(44) byte local44 = this.aByteArray82[local34];
			if (local44 == 0) {
				throw new RuntimeException("No codeword for data value " + local34);
			}
			@Pc(64) int local64 = local11 >> 3;
			@Pc(68) int local68 = local11 & 0x7;
			local7 &= -local68 >> 31;
			@Pc(86) int local86 = (local68 + local44 - 1 >> 3) + local64;
			local11 += local44;
			@Pc(91) int local91 = local68 + 24;
			arg4[local64] = (byte) (local7 |= local39 >>> local91);
			if (local86 > local64) {
				local68 = local91 - 8;
				local64++;
				arg4[local64] = (byte) (local7 = local39 >>> local68);
				if (local86 > local64) {
					local68 -= 8;
					local64++;
					arg4[local64] = (byte) (local7 = local39 >>> local68);
					if (local86 > local64) {
						local68 -= 8;
						local64++;
						arg4[local64] = (byte) (local7 = local39 >>> local68);
						if (local86 > local64) {
							local64++;
							local68 -= 8;
							arg4[local64] = (byte) (local7 = local39 << -local68);
						}
					}
				}
			}
			arg2++;
		}
		return (local11 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[BI[BII)I")
	public int method6445(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0;
		@Pc(22) int local22 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg3[local22];
			if (local26 >= 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local42;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local77;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local115;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(154) int local154;
			if ((local154 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local154;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(189) int local189;
			if ((local189 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local189;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(224) int local224;
			if ((local224 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local224;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local260;
				if (local15 <= arg4) {
					break;
				}
				local11 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local11++;
			} else {
				local11 = this.anIntArray505[local11];
			}
			@Pc(299) int local299;
			if ((local299 = this.anIntArray505[local11]) < 0) {
				arg1[arg4++] = (byte) ~local299;
				if (arg4 >= local15) {
					break;
				}
				local11 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class193 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
	private final int[] anIntArray374;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V")
	public Class193(@OriginalArg(0) byte[] arg0) {
		@Pc(4) int local4 = arg0.length;
		this.aByteArray56 = arg0;
		this.anIntArray374 = new int[local4];
		this.anIntArray375 = new int[8];
		@Pc(18) int[] local18 = new int[33];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local4; local22++) {
			@Pc(27) byte local27 = arg0[local22];
			if (local27 != 0) {
				@Pc(36) int local36 = 0x1 << 32 - local27;
				@Pc(40) int local40 = local18[local27];
				this.anIntArray374[local22] = local40;
				@Pc(99) int local99;
				@Pc(53) int local53;
				@Pc(58) int local58;
				@Pc(69) int local69;
				if ((local40 & local36) == 0) {
					for (local53 = local27 - 1; local53 >= 1; local53--) {
						local58 = local18[local53];
						if (local40 != local58) {
							break;
						}
						local69 = 0x1 << 32 - local53;
						if ((local69 & local58) != 0) {
							local18[local53] = local18[local53 - 1];
							break;
						}
						local18[local53] = local69 | local58;
					}
					local99 = local40 | local36;
				} else {
					local99 = local18[local27 - 1];
				}
				local18[local27] = local99;
				for (local53 = local27 + 1; local53 <= 32; local53++) {
					if (local40 == local18[local53]) {
						local18[local53] = local99;
					}
				}
				local58 = 0;
				for (local69 = 0; local69 < local27; local69++) {
					@Pc(143) int local143 = Integer.MIN_VALUE >>> local69;
					if ((local143 & local40) == 0) {
						local58++;
					} else {
						if (this.anIntArray375[local58] == 0) {
							this.anIntArray375[local58] = local20;
						}
						local58 = this.anIntArray375[local58];
					}
					if (this.anIntArray375.length <= local58) {
						@Pc(183) int[] local183 = new int[this.anIntArray375.length * 2];
						for (@Pc(185) int local185 = 0; local185 < this.anIntArray375.length; local185++) {
							local183[local185] = this.anIntArray375[local185];
						}
						this.anIntArray375 = local183;
					}
				}
				if (local20 <= local58) {
					local20 = local58 + 1;
				}
				this.anIntArray375[local58] = ~local22;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[BI[BI)I")
	public int method4639(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg4;
		@Pc(29) int local29 = arg2;
		while (true) {
			@Pc(33) byte local33 = arg1[local29];
			if (local33 >= 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local52;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local87;
				if (local27 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local122;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local158;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local193;
				if (local27 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(231) int local231;
			if ((local231 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local231;
				if (local27 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local273;
				if (local27 <= arg0) {
					break;
				}
				local23 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local23++;
			} else {
				local23 = this.anIntArray375[local23];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray375[local23]) < 0) {
				arg3[arg0++] = (byte) ~local315;
				if (arg0 >= local27) {
					break;
				}
				local23 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg2;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[BII[B)I")
	public int method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = 0;
		@Pc(15) int local15 = arg0 << 3;
		@Pc(19) int local19 = arg3;
		while (local19 > arg1) {
			@Pc(26) int local26 = arg2[arg1] & 0xFF;
			@Pc(31) int local31 = this.anIntArray374[local26];
			@Pc(36) byte local36 = this.aByteArray56[local26];
			if (local36 == 0) {
				throw new RuntimeException("No codeword for data value " + local26);
			}
			@Pc(53) int local53 = local15 >> 3;
			@Pc(57) int local57 = local15 & 0x7;
			local5 &= -local57 >> 31;
			@Pc(74) int local74 = (local36 + local57 - 1 >> 3) + local53;
			@Pc(75) int local75 = local57 + 24;
			arg4[local53] = (byte) (local5 |= local31 >>> local75);
			if (local74 > local53) {
				local53++;
				local57 = local75 - 8;
				arg4[local53] = (byte) (local5 = local31 >>> local57);
				if (local53 < local74) {
					local53++;
					local57 -= 8;
					arg4[local53] = (byte) (local5 = local31 >>> local57);
					if (local74 > local53) {
						local57 -= 8;
						local53++;
						arg4[local53] = (byte) (local5 = local31 >>> local57);
						if (local74 > local53) {
							local53++;
							local57 -= 8;
							arg4[local53] = (byte) (local5 = local31 << -local57);
						}
					}
				}
			}
			local15 += local36;
			arg1++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}

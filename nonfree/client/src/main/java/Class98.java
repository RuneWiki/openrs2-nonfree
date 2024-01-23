import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class98 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
	public Class98(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) int[] local9 = new int[33];
		this.anIntArray295 = new int[local6];
		this.aByteArray41 = arg0;
		@Pc(18) int local18 = 0;
		this.anIntArray296 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local9[local30];
				this.anIntArray295[local24] = local42;
				@Pc(60) int local60;
				@Pc(70) int local70;
				@Pc(76) int local76;
				@Pc(90) int local90;
				if ((local42 & local38) == 0) {
					local60 = local38 | local42;
					for (local70 = local30 - 1; local70 >= 1; local70--) {
						local76 = local9[local70];
						if (local42 != local76) {
							break;
						}
						local90 = 0x1 << 32 - local70;
						if ((local90 & local76) != 0) {
							local9[local70] = local9[local70 - 1];
							break;
						}
						local9[local70] = local90 | local76;
					}
				} else {
					local60 = local9[local30 - 1];
				}
				local9[local30] = local60;
				for (local70 = local30 + 1; local70 <= 32; local70++) {
					if (local9[local70] == local42) {
						local9[local70] = local60;
					}
				}
				local76 = 0;
				for (local90 = 0; local90 < local30; local90++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local90;
					if ((local42 & local154) == 0) {
						local76++;
					} else {
						if (this.anIntArray296[local76] == 0) {
							this.anIntArray296[local76] = local18;
						}
						local76 = this.anIntArray296[local76];
					}
					if (this.anIntArray296.length <= local76) {
						@Pc(202) int[] local202 = new int[this.anIntArray296.length * 2];
						for (@Pc(204) int local204 = 0; local204 < this.anIntArray296.length; local204++) {
							local202[local204] = this.anIntArray296[local204];
						}
						this.anIntArray296 = local202;
					}
				}
				if (local76 >= local18) {
					local18 = local76 + 1;
				}
				this.anIntArray296[local76] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([B[BIIII)I")
	public int method2992(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg2;
		@Pc(25) int local25 = arg4 << 3;
		@Pc(27) int local27 = 0;
		while (arg3 < local5) {
			@Pc(35) int local35 = arg0[arg3] & 0xFF;
			@Pc(40) byte local40 = this.aByteArray41[local35];
			@Pc(45) int local45 = this.anIntArray295[local35];
			if (local40 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(62) int local62 = local25 >> 3;
			@Pc(66) int local66 = local25 & 0x7;
			local27 &= -local66 >> 31;
			local25 += local40;
			@Pc(87) int local87 = (local40 + local66 - 1 >> 3) + local62;
			@Pc(88) int local88 = local66 + 24;
			arg1[local62] = (byte) (local27 |= local45 >>> local88);
			if (local62 < local87) {
				local62++;
				local66 = local88 - 8;
				arg1[local62] = (byte) (local27 = local45 >>> local66);
				if (local87 > local62) {
					local66 -= 8;
					local62++;
					arg1[local62] = (byte) (local27 = local45 >>> local66);
					if (local87 > local62) {
						local62++;
						local66 -= 8;
						arg1[local62] = (byte) (local27 = local45 >>> local66);
						if (local87 > local62) {
							local66 -= 8;
							local62++;
							arg1[local62] = (byte) (local27 = local45 << -local66);
						}
					}
				}
			}
			arg3++;
		}
		return (local25 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBI[BI)I")
	public int method2994(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(25) int local25 = arg2;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg0;
		while (true) {
			@Pc(33) byte local33 = arg1[local29];
			if (local33 < 0) {
				local27 = this.anIntArray296[local27];
			} else {
				local27++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local52;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(91) int local91;
			if ((local91 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local91;
				if (local25 <= arg4) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(130) int local130;
			if ((local130 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local130;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local165;
				if (local25 <= arg4) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local203;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(235) int local235;
			if ((local235 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local235;
				if (local25 <= arg4) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(277) int local277;
			if ((local277 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local277;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray296[local27];
			}
			@Pc(313) int local313;
			if ((local313 = this.anIntArray296[local27]) < 0) {
				arg3[arg4++] = (byte) ~local313;
				if (arg4 >= local25) {
					break;
				}
				local27 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg0;
	}
}

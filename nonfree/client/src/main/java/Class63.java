import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class63 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
	private final int[] anIntArray290;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
	public Class63(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		this.anIntArray289 = new int[8];
		this.aByteArray20 = arg0;
		@Pc(18) int local18 = 0;
		this.anIntArray290 = new int[local9];
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local6[local30];
				this.anIntArray290[local24] = local45;
				@Pc(61) int local61;
				@Pc(65) int local65;
				@Pc(71) int local71;
				@Pc(85) int local85;
				if ((local45 & local41) == 0) {
					local61 = local45 | local41;
					for (local65 = local30 - 1; local65 >= 1; local65--) {
						local71 = local6[local65];
						if (local71 != local45) {
							break;
						}
						local85 = 0x1 << 32 - local65;
						if ((local71 & local85) != 0) {
							local6[local65] = local6[local65 - 1];
							break;
						}
						local6[local65] = local71 | local85;
					}
				} else {
					local61 = local6[local30 - 1];
				}
				local6[local30] = local61;
				for (local65 = local30 + 1; local65 <= 32; local65++) {
					if (local6[local65] == local45) {
						local6[local65] = local61;
					}
				}
				local71 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local85;
					if ((local45 & local153) == 0) {
						local71++;
					} else {
						if (this.anIntArray289[local71] == 0) {
							this.anIntArray289[local71] = local18;
						}
						local71 = this.anIntArray289[local71];
					}
					if (this.anIntArray289.length <= local71) {
						@Pc(201) int[] local201 = new int[this.anIntArray289.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray289.length; local203++) {
							local201[local203] = this.anIntArray289[local203];
						}
						this.anIntArray289 = local201;
					}
				}
				this.anIntArray289[local71] = ~local24;
				if (local18 <= local71) {
					local18 = local71 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BBII[BI)I")
	public int method2150(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg4;
		@Pc(25) int local25 = arg2;
		while (true) {
			@Pc(29) byte local29 = arg0[local25];
			if (local29 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local45;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(84) int local84;
			if ((local84 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local84;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local123;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local165;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local203;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local238;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(276) int local276;
			if ((local276 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local276;
				if (local18 <= arg1) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray289[local14];
			}
			@Pc(314) int local314;
			if ((local314 = this.anIntArray289[local14]) < 0) {
				arg3[arg1++] = (byte) ~local314;
				if (arg1 >= local18) {
					break;
				}
				local14 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg2;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BI[BIBI)I")
	public int method2152(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		while (local5 > arg3) {
			@Pc(36) int local36 = arg2[arg3] & 0xFF;
			@Pc(41) int local41 = this.anIntArray290[local36];
			@Pc(46) byte local46 = this.aByteArray20[local36];
			if (local46 == 0) {
				throw new RuntimeException("No codeword for data value " + local36);
			}
			@Pc(63) int local63 = local11 >> 3;
			@Pc(67) int local67 = local11 & 0x7;
			local11 += local46;
			@Pc(82) int local82 = local63 + (local67 + local46 - 1 >> 3);
			local7 &= -local67 >> 31;
			@Pc(90) int local90 = local67 + 24;
			arg0[local63] = (byte) (local7 |= local41 >>> local90);
			if (local63 < local82) {
				local67 = local90 - 8;
				local63++;
				arg0[local63] = (byte) (local7 = local41 >>> local67);
				if (local63 < local82) {
					local67 -= 8;
					local63++;
					arg0[local63] = (byte) (local7 = local41 >>> local67);
					if (local63 < local82) {
						local63++;
						local67 -= 8;
						arg0[local63] = (byte) (local7 = local41 >>> local67);
						if (local63 < local82) {
							local63++;
							local67 -= 8;
							arg0[local63] = (byte) (local7 = local41 << -local67);
						}
					}
				}
			}
			arg3++;
		}
		return (local11 + 7 >> 3) - arg4;
	}
}

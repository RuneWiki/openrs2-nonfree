import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class33 {

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[I")
	private final int[] anIntArray52;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
	public Class33(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray5 = arg0;
		this.anIntArray52 = new int[local6];
		this.anIntArray53 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray52[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(88) int local88;
				if ((local46 & local42) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local20[local67];
						if (local46 != local73) {
							break;
						}
						local88 = 0x1 << 32 - local67;
						if ((local73 & local88) != 0) {
							local20[local67] = local20[local67 - 1];
							break;
						}
						local20[local67] = local88 | local73;
					}
					local61 = local42 | local46;
				} else {
					local61 = local20[local30 - 1];
				}
				local20[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local46 == local20[local67]) {
						local20[local67] = local61;
					}
				}
				local73 = 0;
				for (local88 = 0; local88 < local30; local88++) {
					@Pc(160) int local160 = Integer.MIN_VALUE >>> local88;
					if ((local46 & local160) == 0) {
						local73++;
					} else {
						if (this.anIntArray53[local73] == 0) {
							this.anIntArray53[local73] = local22;
						}
						local73 = this.anIntArray53[local73];
					}
					if (this.anIntArray53.length <= local73) {
						@Pc(201) int[] local201 = new int[this.anIntArray53.length * 2];
						for (@Pc(203) int local203 = 0; local203 < this.anIntArray53.length; local203++) {
							local201[local203] = this.anIntArray53[local203];
						}
						this.anIntArray53 = local201;
					}
				}
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
				this.anIntArray53[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B[BIII)I")
	public int method1274(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 << 3;
		@Pc(23) int local23 = arg4;
		while (local23 > arg3) {
			@Pc(31) int local31 = arg1[arg3] & 0xFF;
			@Pc(36) int local36 = this.anIntArray52[local31];
			@Pc(41) byte local41 = this.aByteArray5[local31];
			if (local41 == 0) {
				throw new RuntimeException("No codeword for data value " + local31);
			}
			@Pc(61) int local61 = local19 >> 3;
			@Pc(65) int local65 = local19 & 0x7;
			local15 &= -local65 >> 31;
			@Pc(82) int local82 = local61 + (local41 + local65 - 1 >> 3);
			@Pc(83) int local83 = local65 + 24;
			arg0[local61] = (byte) (local15 |= local36 >>> local83);
			if (local82 > local61) {
				local61++;
				local65 = local83 - 8;
				arg0[local61] = (byte) (local15 = local36 >>> local65);
				if (local82 > local61) {
					local61++;
					local65 -= 8;
					arg0[local61] = (byte) (local15 = local36 >>> local65);
					if (local61 < local82) {
						local61++;
						local65 -= 8;
						arg0[local61] = (byte) (local15 = local36 >>> local65);
						if (local61 < local82) {
							local61++;
							local65 -= 8;
							arg0[local61] = (byte) (local15 = local36 << -local65);
						}
					}
				}
			}
			local19 += local41;
			arg3++;
		}
		return (local19 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[B[BII)I")
	public int method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(20) int local20 = arg0;
		while (true) {
			@Pc(24) byte local24 = arg3[local20];
			if (local24 < 0) {
				local14 = this.anIntArray53[local14];
			} else {
				local14++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local40;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(76) int local76;
			if ((local76 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local76;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local115;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(157) int local157;
			if ((local157 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local157;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local199;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(237) int local237;
			if ((local237 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local237;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local279;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray53[local14];
			}
			@Pc(318) int local318;
			if ((local318 = this.anIntArray53[local14]) < 0) {
				arg2[arg4++] = (byte) ~local318;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg0;
	}
}

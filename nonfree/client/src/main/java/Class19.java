import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class19 {

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "[I")
	private final int[] anIntArray79;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
	public Class19(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) int[] local9 = new int[33];
		this.anIntArray79 = new int[local6];
		this.anIntArray80 = new int[8];
		this.aByteArray13 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local9[local30];
				this.anIntArray79[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local39 & local43) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local9[local67];
						if (local73 != local43) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local85 & local73) != 0) {
							local9[local67] = local9[local67 - 1];
							break;
						}
						local9[local67] = local73 | local85;
					}
					local61 = local39 | local43;
				} else {
					local61 = local9[local30 - 1];
				}
				local9[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local43 == local9[local67]) {
						local9[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local85;
					if ((local149 & local43) == 0) {
						local73++;
					} else {
						if (this.anIntArray80[local73] == 0) {
							this.anIntArray80[local73] = local22;
						}
						local73 = this.anIntArray80[local73];
					}
					if (local73 >= this.anIntArray80.length) {
						@Pc(191) int[] local191 = new int[this.anIntArray80.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray80.length; local193++) {
							local191[local193] = this.anIntArray80[local193];
						}
						this.anIntArray80 = local191;
					}
				}
				if (local73 >= local22) {
					local22 = local73 + 1;
				}
				this.anIntArray80[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[BI[B)I")
	public int method429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		while (true) {
			@Pc(21) byte local21 = arg2[local17];
			if (local21 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local40;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(72) int local72;
			if ((local72 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local72;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local114;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local152;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local187;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(219) int local219;
			if ((local219 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local219;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(257) int local257;
			if ((local257 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local257;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray80[local15];
			}
			@Pc(295) int local295;
			if ((local295 = this.anIntArray80[local15]) < 0) {
				arg4[arg3++] = (byte) ~local295;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BIZ[BI)I")
	public int method430(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = arg2 << 3;
		@Pc(27) int local27 = 0;
		while (local5 > arg4) {
			@Pc(35) int local35 = arg3[arg4] & 0xFF;
			@Pc(40) byte local40 = this.aByteArray13[local35];
			@Pc(45) int local45 = this.anIntArray79[local35];
			if (local40 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(65) int local65 = local9 >> 3;
			@Pc(69) int local69 = local9 & 0x7;
			local27 &= -local69 >> 31;
			local9 += local40;
			@Pc(90) int local90 = (local69 + local40 - 1 >> 3) + local65;
			@Pc(91) int local91 = local69 + 24;
			arg1[local65] = (byte) (local27 |= local45 >>> local91);
			if (local65 < local90) {
				local69 = local91 - 8;
				local65++;
				arg1[local65] = (byte) (local27 = local45 >>> local69);
				if (local90 > local65) {
					local69 -= 8;
					local65++;
					arg1[local65] = (byte) (local27 = local45 >>> local69);
					if (local90 > local65) {
						local65++;
						local69 -= 8;
						arg1[local65] = (byte) (local27 = local45 >>> local69);
						if (local65 < local90) {
							local69 -= 8;
							local65++;
							arg1[local65] = (byte) (local27 = local45 << -local69);
						}
					}
				}
			}
			arg4++;
		}
		return (local9 + 7 >> 3) - arg2;
	}
}

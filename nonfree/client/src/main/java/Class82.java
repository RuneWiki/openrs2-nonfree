import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class82 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "[I")
	private final int[] anIntArray339;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
	public Class82(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray40 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[] local14 = new int[33];
		this.anIntArray339 = new int[local6];
		this.anIntArray340 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local14[local30];
				this.anIntArray339[local24] = local43;
				@Pc(107) int local107;
				@Pc(56) int local56;
				@Pc(62) int local62;
				@Pc(77) int local77;
				if ((local39 & local43) == 0) {
					for (local56 = local30 - 1; local56 >= 1; local56--) {
						local62 = local14[local56];
						if (local62 != local43) {
							break;
						}
						local77 = 0x1 << 32 - local56;
						if ((local77 & local62) != 0) {
							local14[local56] = local14[local56 - 1];
							break;
						}
						local14[local56] = local77 | local62;
					}
					local107 = local39 | local43;
				} else {
					local107 = local14[local30 - 1];
				}
				local14[local30] = local107;
				for (local56 = local30 + 1; local56 <= 32; local56++) {
					if (local43 == local14[local56]) {
						local14[local56] = local107;
					}
				}
				local62 = 0;
				for (local77 = 0; local77 < local30; local77++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local77;
					if ((local43 & local154) == 0) {
						local62++;
					} else {
						if (this.anIntArray340[local62] == 0) {
							this.anIntArray340[local62] = local11;
						}
						local62 = this.anIntArray340[local62];
					}
					if (this.anIntArray340.length <= local62) {
						@Pc(199) int[] local199 = new int[this.anIntArray340.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray340.length; local201++) {
							local199[local201] = this.anIntArray340[local201];
						}
						this.anIntArray340 = local199;
					}
				}
				this.anIntArray340[local62] = ~local24;
				if (local11 <= local62) {
					local11 = local62 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BII[BII)I")
	public int method2692(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 << 3;
		while (local5 > arg4) {
			@Pc(35) int local35 = arg0[arg4] & 0xFF;
			@Pc(40) int local40 = this.anIntArray339[local35];
			@Pc(45) byte local45 = this.aByteArray40[local35];
			if (local45 == 0) {
				throw new RuntimeException("No codeword for data value " + local35);
			}
			@Pc(65) int local65 = local15 >> 3;
			@Pc(69) int local69 = local15 & 0x7;
			local15 += local45;
			local11 &= -local69 >> 31;
			@Pc(90) int local90 = local65 + (local69 + local45 - 1 >> 3);
			@Pc(91) int local91 = local69 + 24;
			arg2[local65] = (byte) (local11 |= local40 >>> local91);
			if (local65 < local90) {
				local69 = local91 - 8;
				local65++;
				arg2[local65] = (byte) (local11 = local40 >>> local69);
				if (local65 < local90) {
					local69 -= 8;
					local65++;
					arg2[local65] = (byte) (local11 = local40 >>> local69);
					if (local65 < local90) {
						local65++;
						local69 -= 8;
						arg2[local65] = (byte) (local11 = local40 >>> local69);
						if (local90 > local65) {
							local69 -= 8;
							local65++;
							arg2[local65] = (byte) (local11 = local40 << -local69);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BBIII[B)I")
	public int method2695(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(19) int local19 = arg3;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg1;
		while (true) {
			@Pc(27) byte local27 = arg4[local23];
			if (local27 < 0) {
				local21 = this.anIntArray340[local21];
			} else {
				local21++;
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local46;
				if (local19 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x40) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local81;
				if (arg2 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x20) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local116;
				if (local19 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x10) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(154) int local154;
			if ((local154 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local154;
				if (local19 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x8) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(193) int local193;
			if ((local193 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local193;
				if (arg2 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x4) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local232;
				if (local19 <= arg2) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x2) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(267) int local267;
			if ((local267 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local267;
				if (arg2 >= local19) {
					break;
				}
				local21 = 0;
			}
			if ((local27 & 0x1) == 0) {
				local21++;
			} else {
				local21 = this.anIntArray340[local21];
			}
			@Pc(305) int local305;
			if ((local305 = this.anIntArray340[local21]) < 0) {
				arg0[arg2++] = (byte) ~local305;
				if (local19 <= arg2) {
					break;
				}
				local21 = 0;
			}
			local23++;
		}
		return local23 + 1 - arg1;
	}
}

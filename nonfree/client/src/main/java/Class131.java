import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class131 {

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "[I")
	private final int[] anIntArray296;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([B)V")
	public Class131(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray31 = arg0;
		this.anIntArray296 = new int[local6];
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray297 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local16[local30];
				this.anIntArray296[local24] = local43;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(70) int local70;
				@Pc(86) int local86;
				if ((local39 & local43) == 0) {
					for (local64 = local30 - 1; local64 >= 1; local64--) {
						local70 = local16[local64];
						if (local43 != local70) {
							break;
						}
						local86 = 0x1 << 32 - local64;
						if ((local70 & local86) != 0) {
							local16[local64] = local16[local64 - 1];
							break;
						}
						local16[local64] = local86 | local70;
					}
					local58 = local39 | local43;
				} else {
					local58 = local16[local30 - 1];
				}
				local16[local30] = local58;
				for (local64 = local30 + 1; local64 <= 32; local64++) {
					if (local16[local64] == local43) {
						local16[local64] = local58;
					}
				}
				local70 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local86;
					if ((local43 & local154) == 0) {
						local70++;
					} else {
						if (this.anIntArray297[local70] == 0) {
							this.anIntArray297[local70] = local22;
						}
						local70 = this.anIntArray297[local70];
					}
					if (this.anIntArray297.length <= local70) {
						@Pc(188) int[] local188 = new int[this.anIntArray297.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray297.length; local190++) {
							local188[local190] = this.anIntArray297[local190];
						}
						this.anIntArray297 = local188;
					}
				}
				this.anIntArray297[local70] = ~local24;
				if (local70 >= local22) {
					local22 = local70 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([BIIII[B)I")
	public int method2693(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg0[local20];
			if (local24 < 0) {
				local14 = this.anIntArray297[local14];
			} else {
				local14++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local40;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(75) int local75;
			if ((local75 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local75;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(111) int local111;
			if ((local111 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local111;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local149;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local187;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local229;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(268) int local268;
			if ((local268 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local268;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray297[local14];
			}
			@Pc(307) int local307;
			if ((local307 = this.anIntArray297[local14]) < 0) {
				arg4[arg2++] = (byte) ~local307;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI[B[BII)I")
	public int method2694(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg4 << 3;
		while (local11 > arg3) {
			@Pc(23) int local23 = arg1[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray296[local23];
			@Pc(33) byte local33 = this.aByteArray31[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = (local54 + local33 - 1 >> 3) + local50;
			local15 += local33;
			@Pc(77) int local77 = local54 + 24;
			arg2[local50] = (byte) (local7 |= local28 >>> local77);
			if (local72 > local50) {
				local50++;
				local54 = local77 - 8;
				arg2[local50] = (byte) (local7 = local28 >>> local54);
				if (local50 < local72) {
					local50++;
					local54 -= 8;
					arg2[local50] = (byte) (local7 = local28 >>> local54);
					if (local72 > local50) {
						local54 -= 8;
						local50++;
						arg2[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local72) {
							local54 -= 8;
							local50++;
							arg2[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}

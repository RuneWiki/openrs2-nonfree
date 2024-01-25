import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class136 {

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "[B")
	private final byte[] aByteArray68;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
	private final int[] anIntArray339;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "([B)V")
	public Class136(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray68 = arg0;
		this.anIntArray339 = new int[local6];
		this.anIntArray338 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray339[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(80) int local80;
				if ((local43 & local39) == 0) {
					local59 = local43 | local39;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local43 != local69) {
							break;
						}
						local80 = 0x1 << 32 - local63;
						if ((local69 & local80) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local69 | local80;
					}
				} else {
					local59 = local20[local30 - 1];
				}
				local20[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local43 == local20[local63]) {
						local20[local63] = local59;
					}
				}
				local69 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(151) int local151 = Integer.MIN_VALUE >>> local80;
					if ((local43 & local151) == 0) {
						local69++;
					} else {
						if (this.anIntArray338[local69] == 0) {
							this.anIntArray338[local69] = local22;
						}
						local69 = this.anIntArray338[local69];
					}
					if (this.anIntArray338.length <= local69) {
						@Pc(188) int[] local188 = new int[this.anIntArray338.length * 2];
						for (@Pc(190) int local190 = 0; local190 < this.anIntArray338.length; local190++) {
							local188[local190] = this.anIntArray338[local190];
						}
						this.anIntArray338 = local188;
					}
				}
				if (local22 <= local69) {
					local22 = local69 + 1;
				}
				this.anIntArray338[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([B[BIIII)I")
	public int method3453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg2;
		while (true) {
			@Pc(24) byte local24 = arg0[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local43;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(75) int local75;
			if ((local75 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local75;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(110) int local110;
			if ((local110 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local110;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local152;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local184;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(223) int local223;
			if ((local223 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local223;
				if (arg4 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local259;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray338[local18];
			}
			@Pc(294) int local294;
			if ((local294 = this.anIntArray338[local18]) < 0) {
				arg1[arg4++] = (byte) ~local294;
				if (local16 <= arg4) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg2;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[BIIB[B)I")
	public int method3457(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg2;
		while (arg3 < local15) {
			@Pc(23) int local23 = arg1[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray339[local23];
			@Pc(33) byte local33 = this.aByteArray68[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local11 >> 3;
			@Pc(57) int local57 = local11 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(75) int local75 = local53 + (local33 + local57 - 1 >> 3);
			@Pc(76) int local76 = local57 + 24;
			arg4[local53] = (byte) (local7 |= local28 >>> local76);
			if (local53 < local75) {
				local53++;
				local57 = local76 - 8;
				arg4[local53] = (byte) (local7 = local28 >>> local57);
				if (local75 > local53) {
					local53++;
					local57 -= 8;
					arg4[local53] = (byte) (local7 = local28 >>> local57);
					if (local53 < local75) {
						local57 -= 8;
						local53++;
						arg4[local53] = (byte) (local7 = local28 >>> local57);
						if (local53 < local75) {
							local53++;
							local57 -= 8;
							arg4[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			local11 += local33;
			arg3++;
		}
		return (local11 + 7 >> 3) - arg0;
	}
}

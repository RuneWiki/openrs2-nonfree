import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class169 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "[I")
	private final int[] anIntArray323;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
	public Class169(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray58 = arg0;
		this.anIntArray323 = new int[local6];
		this.anIntArray322 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray323[local24] = local43;
				@Pc(58) int local58;
				@Pc(68) int local68;
				@Pc(74) int local74;
				@Pc(89) int local89;
				if ((local43 & local39) == 0) {
					local58 = local39 | local43;
					for (local68 = local30 - 1; local68 >= 1; local68--) {
						local74 = local20[local68];
						if (local74 != local43) {
							break;
						}
						local89 = 0x1 << 32 - local68;
						if ((local89 & local74) != 0) {
							local20[local68] = local20[local68 - 1];
							break;
						}
						local20[local68] = local74 | local89;
					}
				} else {
					local58 = local20[local30 - 1];
				}
				local20[local30] = local58;
				for (local68 = local30 + 1; local68 <= 32; local68++) {
					if (local43 == local20[local68]) {
						local20[local68] = local58;
					}
				}
				local74 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(149) int local149 = Integer.MIN_VALUE >>> local89;
					if ((local149 & local43) == 0) {
						local74++;
					} else {
						if (this.anIntArray322[local74] == 0) {
							this.anIntArray322[local74] = local22;
						}
						local74 = this.anIntArray322[local74];
					}
					if (local74 >= this.anIntArray322.length) {
						@Pc(197) int[] local197 = new int[this.anIntArray322.length * 2];
						for (@Pc(199) int local199 = 0; local199 < this.anIntArray322.length; local199++) {
							local197[local199] = this.anIntArray322[local199];
						}
						this.anIntArray322 = local197;
					}
				}
				this.anIntArray322[local74] = ~local24;
				if (local74 >= local22) {
					local22 = local74 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII[B[B)I")
	public int method4853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg1;
		while (true) {
			@Pc(26) byte local26 = arg4[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local45;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local87;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(122) int local122;
			if ((local122 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local122;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local161;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local199;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(234) int local234;
			if ((local234 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local234;
				if (local13 <= arg2) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local273;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray322[local20];
			}
			@Pc(305) int local305;
			if ((local305 = this.anIntArray322[local20]) < 0) {
				arg3[arg2++] = (byte) ~local305;
				if (arg2 >= local13) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI[BI[B)I")
	public int method4855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg3 << 3;
		while (arg0 < local11) {
			@Pc(23) int local23 = arg4[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray323[local23];
			@Pc(33) byte local33 = this.aByteArray58[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 >> 3;
			@Pc(57) int local57 = local15 & 0x7;
			local7 &= -local57 >> 31;
			@Pc(74) int local74 = local53 + (local33 + local57 - 1 >> 3);
			@Pc(75) int local75 = local57 + 24;
			arg2[local53] = (byte) (local7 |= local28 >>> local75);
			if (local74 > local53) {
				local53++;
				local57 = local75 - 8;
				arg2[local53] = (byte) (local7 = local28 >>> local57);
				if (local74 > local53) {
					local57 -= 8;
					local53++;
					arg2[local53] = (byte) (local7 = local28 >>> local57);
					if (local53 < local74) {
						local57 -= 8;
						local53++;
						arg2[local53] = (byte) (local7 = local28 >>> local57);
						if (local74 > local53) {
							local53++;
							local57 -= 8;
							arg2[local53] = (byte) (local7 = local28 << -local57);
						}
					}
				}
			}
			local15 += local33;
			arg0++;
		}
		return (local15 + 7 >> 3) - arg3;
	}
}

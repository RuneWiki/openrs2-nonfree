import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class37 {

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
	private final int[] anIntArray180;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[B")
	private final byte[] aByteArray20;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B)V")
	public Class37(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int[] local8 = new int[33];
		@Pc(11) int local11 = arg0.length;
		this.anIntArray180 = new int[local11];
		this.aByteArray20 = arg0;
		this.anIntArray179 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local8[local30];
				this.anIntArray180[local24] = local43;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local39 & local43) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local8[local67];
						if (local73 != local43) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local73 & local85) != 0) {
							local8[local67] = local8[local67 - 1];
							break;
						}
						local8[local67] = local85 | local73;
					}
					local61 = local43 | local39;
				} else {
					local61 = local8[local30 - 1];
				}
				local8[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local43 == local8[local67]) {
						local8[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local85;
					if ((local153 & local43) == 0) {
						local73++;
					} else {
						if (this.anIntArray179[local73] == 0) {
							this.anIntArray179[local73] = local5;
						}
						local73 = this.anIntArray179[local73];
					}
					if (local73 >= this.anIntArray179.length) {
						@Pc(190) int[] local190 = new int[this.anIntArray179.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray179.length; local192++) {
							local190[local192] = this.anIntArray179[local192];
						}
						this.anIntArray179 = local190;
					}
				}
				if (local5 <= local73) {
					local5 = local73 + 1;
				}
				this.anIntArray179[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIII[BI)I")
	public int method1162(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg4;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg1;
		while (true) {
			@Pc(24) byte local24 = arg3[local20];
			if (local24 < 0) {
				local18 = this.anIntArray179[local18];
			} else {
				local18++;
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local40;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(75) int local75;
			if ((local75 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local75;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(110) int local110;
			if ((local110 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local110;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local149;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local184;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(219) int local219;
			if ((local219 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local219;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(254) int local254;
			if ((local254 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local254;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray179[local18];
			}
			@Pc(293) int local293;
			if ((local293 = this.anIntArray179[local18]) < 0) {
				arg0[arg2++] = (byte) ~local293;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BII[BI)I")
	public int method1164(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = arg4 << 3;
		@Pc(15) int local15 = 0;
		while (arg2 < local5) {
			@Pc(23) int local23 = arg3[arg2] & 0xFF;
			@Pc(28) int local28 = this.anIntArray180[local23];
			@Pc(33) byte local33 = this.aByteArray20[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local9 >> 3;
			@Pc(57) int local57 = local9 & 0x7;
			local15 &= -local57 >> 31;
			@Pc(74) int local74 = (local33 + local57 - 1 >> 3) + local53;
			@Pc(75) int local75 = local57 + 24;
			arg1[local53] = (byte) (local15 |= local28 >>> local75);
			if (local74 > local53) {
				local53++;
				local57 = local75 - 8;
				arg1[local53] = (byte) (local15 = local28 >>> local57);
				if (local74 > local53) {
					local53++;
					local57 -= 8;
					arg1[local53] = (byte) (local15 = local28 >>> local57);
					if (local74 > local53) {
						local57 -= 8;
						local53++;
						arg1[local53] = (byte) (local15 = local28 >>> local57);
						if (local53 < local74) {
							local57 -= 8;
							local53++;
							arg1[local53] = (byte) (local15 = local28 << -local57);
						}
					}
				}
			}
			local9 += local33;
			arg2++;
		}
		return (local9 + 7 >> 3) - arg4;
	}
}

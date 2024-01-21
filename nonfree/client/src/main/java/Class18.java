import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class18 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
	private final int[] anIntArray39;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
	public Class18(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length;
		this.aByteArray5 = arg0;
		this.anIntArray39 = new int[local8];
		@Pc(18) int[] local18 = new int[33];
		this.anIntArray40 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local8; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local18[local30];
				this.anIntArray39[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(83) int local83;
				if ((local46 & local42) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local18[local67];
						if (local73 != local46) {
							break;
						}
						local83 = 0x1 << 32 - local67;
						if ((local83 & local73) != 0) {
							local18[local67] = local18[local67 - 1];
							break;
						}
						local18[local67] = local83 | local73;
					}
					local61 = local42 | local46;
				} else {
					local61 = local18[local30 - 1];
				}
				local18[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local46 == local18[local67]) {
						local18[local67] = local61;
					}
				}
				local73 = 0;
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local83;
					if ((local46 & local153) == 0) {
						local73++;
					} else {
						if (this.anIntArray40[local73] == 0) {
							this.anIntArray40[local73] = local5;
						}
						local73 = this.anIntArray40[local73];
					}
					if (this.anIntArray40.length <= local73) {
						@Pc(195) int[] local195 = new int[this.anIntArray40.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray40.length; local197++) {
							local195[local197] = this.anIntArray40[local197];
						}
						this.anIntArray40 = local195;
					}
				}
				if (local73 >= local5) {
					local5 = local73 + 1;
				}
				this.anIntArray40[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BII[B)I")
	public int method490(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg2 << 3;
		@Pc(9) int local9 = 0;
		while (local3 > arg0) {
			@Pc(24) int local24 = arg1[arg0] & 0xFF;
			@Pc(29) int local29 = this.anIntArray39[local24];
			@Pc(34) byte local34 = this.aByteArray5[local24];
			if (local34 == 0) {
				throw new RuntimeException("No codeword for data value " + local24);
			}
			@Pc(54) int local54 = local7 >> 3;
			@Pc(58) int local58 = local7 & 0x7;
			@Pc(69) int local69 = (local58 + local34 - 1 >> 3) + local54;
			local7 += local34;
			local9 &= -local58 >> 31;
			@Pc(81) int local81 = local58 + 24;
			arg4[local54] = (byte) (local9 |= local29 >>> local81);
			if (local69 > local54) {
				local54++;
				local58 = local81 - 8;
				arg4[local54] = (byte) (local9 = local29 >>> local58);
				if (local69 > local54) {
					local58 -= 8;
					local54++;
					arg4[local54] = (byte) (local9 = local29 >>> local58);
					if (local69 > local54) {
						local58 -= 8;
						local54++;
						arg4[local54] = (byte) (local9 = local29 >>> local58);
						if (local54 < local69) {
							local58 -= 8;
							local54++;
							arg4[local54] = (byte) (local9 = local29 << -local58);
						}
					}
				}
			}
			arg0++;
		}
		return (local7 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BII[BI)I")
	public int method494(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg3[local22];
			if (local26 < 0) {
				local20 = this.anIntArray40[local20];
			} else {
				local20++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local45;
				if (arg4 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local87;
				if (arg4 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local126;
				if (local13 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(168) int local168;
			if ((local168 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local168;
				if (arg4 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(200) int local200;
			if ((local200 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local200;
				if (local13 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local242;
				if (local13 <= arg4) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(278) int local278;
			if ((local278 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local278;
				if (arg4 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray40[local20];
			}
			@Pc(313) int local313;
			if ((local313 = this.anIntArray40[local20]) < 0) {
				arg1[arg4++] = (byte) ~local313;
				if (arg4 >= local13) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg2;
	}
}

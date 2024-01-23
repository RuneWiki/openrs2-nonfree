import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class52 {

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class52(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray35 = arg0;
		this.anIntArray383 = new int[8];
		@Pc(15) int local15 = 0;
		@Pc(18) int[] local18 = new int[33];
		this.anIntArray382 = new int[local6];
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local18[local30];
				this.anIntArray382[local24] = local46;
				@Pc(64) int local64;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(92) int local92;
				if ((local46 & local42) == 0) {
					local64 = local42 | local46;
					for (local74 = local30 - 1; local74 >= 1; local74--) {
						local80 = local18[local74];
						if (local80 != local46) {
							break;
						}
						local92 = 0x1 << 32 - local74;
						if ((local80 & local92) != 0) {
							local18[local74] = local18[local74 - 1];
							break;
						}
						local18[local74] = local92 | local80;
					}
				} else {
					local64 = local18[local30 - 1];
				}
				local18[local30] = local64;
				for (local74 = local30 + 1; local74 <= 32; local74++) {
					if (local18[local74] == local46) {
						local18[local74] = local64;
					}
				}
				local80 = 0;
				for (local92 = 0; local92 < local30; local92++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local92;
					if ((local46 & local157) == 0) {
						local80++;
					} else {
						if (this.anIntArray383[local80] == 0) {
							this.anIntArray383[local80] = local15;
						}
						local80 = this.anIntArray383[local80];
					}
					if (local80 >= this.anIntArray383.length) {
						@Pc(198) int[] local198 = new int[this.anIntArray383.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray383.length; local200++) {
							local198[local200] = this.anIntArray383[local200];
						}
						this.anIntArray383 = local198;
					}
				}
				if (local15 <= local80) {
					local15 = local80 + 1;
				}
				this.anIntArray383[local80] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BZI[BII)I")
	public int method1729(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg4;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg3;
		while (true) {
			@Pc(26) byte local26 = arg2[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local42;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local80;
				if (arg1 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(116) int local116;
			if ((local116 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local116;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(151) int local151;
			if ((local151 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local151;
				if (arg1 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(183) int local183;
			if ((local183 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local183;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local221;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local260;
				if (local18 <= arg1) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray383[local20];
			}
			@Pc(298) int local298;
			if ((local298 = this.anIntArray383[local20]) < 0) {
				arg0[arg1++] = (byte) ~local298;
				if (arg1 >= local18) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg3;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BIIZ[B)I")
	public int method1732(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(3) int local3 = arg2;
		@Pc(9) int local9 = 0;
		@Pc(18) int local18 = arg3 << 3;
		while (local3 > arg0) {
			@Pc(25) int local25 = arg4[arg0] & 0xFF;
			@Pc(30) int local30 = this.anIntArray382[local25];
			@Pc(35) byte local35 = this.aByteArray35[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(52) int local52 = local18 >> 3;
			@Pc(56) int local56 = local18 & 0x7;
			local18 += local35;
			local9 &= -local56 >> 31;
			@Pc(79) int local79 = local52 + (local56 + local35 - 1 >> 3);
			@Pc(80) int local80 = local56 + 24;
			arg1[local52] = (byte) (local9 |= local30 >>> local80);
			if (local79 > local52) {
				local56 = local80 - 8;
				local52++;
				arg1[local52] = (byte) (local9 = local30 >>> local56);
				if (local52 < local79) {
					local52++;
					local56 -= 8;
					arg1[local52] = (byte) (local9 = local30 >>> local56);
					if (local79 > local52) {
						local52++;
						local56 -= 8;
						arg1[local52] = (byte) (local9 = local30 >>> local56);
						if (local79 > local52) {
							local56 -= 8;
							local52++;
							arg1[local52] = (byte) (local9 = local30 << -local56);
						}
					}
				}
			}
			arg0++;
		}
		return (local18 + 7 >> 3) - arg3;
	}
}

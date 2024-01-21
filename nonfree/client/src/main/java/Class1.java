import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
	private final int[] anIntArray2;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V")
	public Class1(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) int[] local9 = new int[33];
		this.aByteArray1 = arg0;
		this.anIntArray2 = new int[local6];
		this.anIntArray1 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local9[local30];
				this.anIntArray2[local24] = local45;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(75) int local75;
				@Pc(91) int local91;
				if ((local45 & local41) == 0) {
					for (local69 = local30 - 1; local69 >= 1; local69--) {
						local75 = local9[local69];
						if (local45 != local75) {
							break;
						}
						local91 = 0x1 << 32 - local69;
						if ((local75 & local91) != 0) {
							local9[local69] = local9[local69 - 1];
							break;
						}
						local9[local69] = local75 | local91;
					}
					local63 = local41 | local45;
				} else {
					local63 = local9[local30 - 1];
				}
				local9[local30] = local63;
				for (local69 = local30 + 1; local69 <= 32; local69++) {
					if (local9[local69] == local45) {
						local9[local69] = local63;
					}
				}
				local75 = 0;
				for (local91 = 0; local91 < local30; local91++) {
					@Pc(163) int local163 = Integer.MIN_VALUE >>> local91;
					if ((local45 & local163) == 0) {
						local75++;
					} else {
						if (this.anIntArray1[local75] == 0) {
							this.anIntArray1[local75] = local22;
						}
						local75 = this.anIntArray1[local75];
					}
					if (this.anIntArray1.length <= local75) {
						@Pc(204) int[] local204 = new int[this.anIntArray1.length * 2];
						for (@Pc(206) int local206 = 0; local206 < this.anIntArray1.length; local206++) {
							local204[local206] = this.anIntArray1[local206];
						}
						this.anIntArray1 = local204;
					}
				}
				this.anIntArray1[local75] = ~local24;
				if (local75 >= local22) {
					local22 = local75 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III[BI[B)I")
	public int method1(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = arg3;
		@Pc(13) int local13 = arg0 << 3;
		@Pc(15) int local15 = 0;
		while (local5 > arg1) {
			@Pc(23) int local23 = arg4[arg1] & 0xFF;
			@Pc(28) int local28 = this.anIntArray2[local23];
			@Pc(33) byte local33 = this.aByteArray1[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local13 >> 3;
			@Pc(54) int local54 = local13 & 0x7;
			local15 &= -local54 >> 31;
			@Pc(71) int local71 = (local33 + local54 - 1 >> 3) + local50;
			@Pc(72) int local72 = local54 + 24;
			arg2[local50] = (byte) (local15 |= local28 >>> local72);
			if (local71 > local50) {
				local54 = local72 - 8;
				local50++;
				arg2[local50] = (byte) (local15 = local28 >>> local54);
				if (local71 > local50) {
					local54 -= 8;
					local50++;
					arg2[local50] = (byte) (local15 = local28 >>> local54);
					if (local50 < local71) {
						local54 -= 8;
						local50++;
						arg2[local50] = (byte) (local15 = local28 >>> local54);
						if (local50 < local71) {
							local54 -= 8;
							local50++;
							arg2[local50] = (byte) (local15 = local28 << -local54);
						}
					}
				}
			}
			local13 += local33;
			arg1++;
		}
		return (local13 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[BII[B)I")
	public int method4(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg4[local17];
			if (local26 < 0) {
				local15 = this.anIntArray1[local15];
			} else {
				local15++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local45;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local77;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local115;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(153) int local153;
			if ((local153 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local153;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(188) int local188;
			if ((local188 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local188;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local230;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(265) int local265;
			if ((local265 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local265;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray1[local15];
			}
			@Pc(304) int local304;
			if ((local304 = this.anIntArray1[local15]) < 0) {
				arg1[arg3++] = (byte) ~local304;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg2;
	}
}

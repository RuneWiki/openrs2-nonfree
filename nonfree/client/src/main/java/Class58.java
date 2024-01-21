import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class58 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	private final int[] anIntArray303;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[B")
	private final byte[] aByteArray34;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class58(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray303 = new int[local6];
		@Pc(13) int[] local13 = new int[33];
		this.anIntArray304 = new int[8];
		this.aByteArray34 = arg0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local13[local30];
				this.anIntArray303[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local42 & local46) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local13[local67];
						if (local46 != local73) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local85 & local73) != 0) {
							local13[local67] = local13[local67 - 1];
							break;
						}
						local13[local67] = local73 | local85;
					}
					local61 = local46 | local42;
				} else {
					local61 = local13[local30 - 1];
				}
				local13[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local46 == local13[local67]) {
						local13[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(148) int local148 = Integer.MIN_VALUE >>> local85;
					if ((local46 & local148) == 0) {
						local73++;
					} else {
						if (this.anIntArray304[local73] == 0) {
							this.anIntArray304[local73] = local22;
						}
						local73 = this.anIntArray304[local73];
					}
					if (this.anIntArray304.length <= local73) {
						@Pc(182) int[] local182 = new int[this.anIntArray304.length * 2];
						for (@Pc(184) int local184 = 0; local184 < this.anIntArray304.length; local184++) {
							local182[local184] = this.anIntArray304[local184];
						}
						this.anIntArray304 = local182;
					}
				}
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
				this.anIntArray304[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI[BII[B)I")
	public int method2068(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		while (true) {
			@Pc(26) byte local26 = arg1[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local42;
				if (local13 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(74) int local74;
			if ((local74 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local74;
				if (local13 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(113) int local113;
			if ((local113 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local113;
				if (local13 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(152) int local152;
			if ((local152 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local152;
				if (arg3 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(187) int local187;
			if ((local187 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local187;
				if (arg3 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(222) int local222;
			if ((local222 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local222;
				if (arg3 >= local13) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local260;
				if (local13 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray304[local20];
			}
			@Pc(292) int local292;
			if ((local292 = this.anIntArray304[local20]) < 0) {
				arg4[arg3++] = (byte) ~local292;
				if (arg3 >= local13) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg2;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BB[BII)I")
	public int method2072(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0;
		@Pc(15) int local15 = arg4 << 3;
		while (local11 > arg3) {
			@Pc(29) int local29 = arg2[arg3] & 0xFF;
			@Pc(34) int local34 = this.anIntArray303[local29];
			@Pc(39) byte local39 = this.aByteArray34[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(59) int local59 = local15 >> 3;
			@Pc(63) int local63 = local15 & 0x7;
			@Pc(74) int local74 = (local63 + local39 - 1 >> 3) + local59;
			local7 &= -local63 >> 31;
			local15 += local39;
			@Pc(86) int local86 = local63 + 24;
			arg1[local59] = (byte) (local7 |= local34 >>> local86);
			if (local74 > local59) {
				local63 = local86 - 8;
				local59++;
				arg1[local59] = (byte) (local7 = local34 >>> local63);
				if (local59 < local74) {
					local59++;
					local63 -= 8;
					arg1[local59] = (byte) (local7 = local34 >>> local63);
					if (local59 < local74) {
						local63 -= 8;
						local59++;
						arg1[local59] = (byte) (local7 = local34 >>> local63);
						if (local59 < local74) {
							local59++;
							local63 -= 8;
							arg1[local59] = (byte) (local7 = local34 << -local63);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg4;
	}
}

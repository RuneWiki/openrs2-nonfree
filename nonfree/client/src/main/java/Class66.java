import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class66 {

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
	private final int[] anIntArray372;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
	public Class66(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = arg0.length;
		this.aByteArray17 = arg0;
		this.anIntArray372 = new int[local11];
		this.anIntArray373 = new int[8];
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local6[local30];
				this.anIntArray372[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(86) int local86;
				if ((local46 & local42) == 0) {
					local62 = local42 | local46;
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local6[local66];
						if (local46 != local72) {
							break;
						}
						local86 = 0x1 << 32 - local66;
						if ((local86 & local72) != 0) {
							local6[local66] = local6[local66 - 1];
							break;
						}
						local6[local66] = local72 | local86;
					}
				} else {
					local62 = local6[local30 - 1];
				}
				local6[local30] = local62;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local46 == local6[local66]) {
						local6[local66] = local62;
					}
				}
				local72 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local86;
					if ((local46 & local158) == 0) {
						local72++;
					} else {
						if (this.anIntArray373[local72] == 0) {
							this.anIntArray373[local72] = local8;
						}
						local72 = this.anIntArray373[local72];
					}
					if (local72 >= this.anIntArray373.length) {
						@Pc(202) int[] local202 = new int[this.anIntArray373.length * 2];
						for (@Pc(204) int local204 = 0; local204 < this.anIntArray373.length; local204++) {
							local202[local204] = this.anIntArray373[local204];
						}
						this.anIntArray373 = local202;
					}
				}
				this.anIntArray373[local72] = ~local24;
				if (local72 >= local8) {
					local8 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI[BII[B)I")
	public int method1785(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(20) int local20 = arg0;
		while (true) {
			@Pc(24) byte local24 = arg4[local20];
			if (local24 < 0) {
				local14 = this.anIntArray373[local14];
			} else {
				local14++;
			}
			@Pc(39) int local39;
			if ((local39 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local39;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(80) int local80;
			if ((local80 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local80;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(111) int local111;
			if ((local111 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local111;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(149) int local149;
			if ((local149 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local149;
				if (arg2 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(183) int local183;
			if ((local183 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local183;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local221;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(259) int local259;
			if ((local259 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local259;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray373[local14];
			}
			@Pc(290) int local290;
			if ((local290 = this.anIntArray373[local14]) < 0) {
				arg1[arg2++] = (byte) ~local290;
				if (local18 <= arg2) {
					break;
				}
				local14 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BI[BIZ)I")
	public int method1787(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg0;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg4 << 3;
		while (arg2 < local12) {
			@Pc(25) int local25 = arg1[arg2] & 0xFF;
			@Pc(30) int local30 = this.anIntArray372[local25];
			@Pc(35) byte local35 = this.aByteArray17[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(52) int local52 = local18 >> 3;
			@Pc(56) int local56 = local18 & 0x7;
			local18 += local35;
			local14 &= -local56 >> 31;
			@Pc(78) int local78 = (local56 + local35 - 1 >> 3) + local52;
			@Pc(79) int local79 = local56 + 24;
			arg3[local52] = (byte) (local14 |= local30 >>> local79);
			if (local78 > local52) {
				local56 = local79 - 8;
				local52++;
				arg3[local52] = (byte) (local14 = local30 >>> local56);
				if (local78 > local52) {
					local56 -= 8;
					local52++;
					arg3[local52] = (byte) (local14 = local30 >>> local56);
					if (local78 > local52) {
						local56 -= 8;
						local52++;
						arg3[local52] = (byte) (local14 = local30 >>> local56);
						if (local52 < local78) {
							local56 -= 8;
							local52++;
							arg3[local52] = (byte) (local14 = local30 << -local56);
						}
					}
				}
			}
			arg2++;
		}
		return (local18 + 7 >> 3) - arg4;
	}
}

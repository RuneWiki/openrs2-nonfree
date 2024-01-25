import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class33 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "[I")
	private final int[] anIntArray79;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([B)V")
	public Class33(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray79 = new int[local6];
		this.aByteArray17 = arg0;
		this.anIntArray80 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray79[local24] = local46;
				@Pc(64) int local64;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(96) int local96;
				if ((local46 & local42) == 0) {
					local64 = local46 | local42;
					for (local74 = local30 - 1; local74 >= 1; local74--) {
						local80 = local20[local74];
						if (local46 != local80) {
							break;
						}
						local96 = 0x1 << 32 - local74;
						if ((local80 & local96) != 0) {
							local20[local74] = local20[local74 - 1];
							break;
						}
						local20[local74] = local96 | local80;
					}
				} else {
					local64 = local20[local30 - 1];
				}
				local20[local30] = local64;
				for (local74 = local30 + 1; local74 <= 32; local74++) {
					if (local20[local74] == local46) {
						local20[local74] = local64;
					}
				}
				local80 = 0;
				for (local96 = 0; local96 < local30; local96++) {
					@Pc(156) int local156 = Integer.MIN_VALUE >>> local96;
					if ((local46 & local156) == 0) {
						local80++;
					} else {
						if (this.anIntArray80[local80] == 0) {
							this.anIntArray80[local80] = local22;
						}
						local80 = this.anIntArray80[local80];
					}
					if (this.anIntArray80.length <= local80) {
						@Pc(194) int[] local194 = new int[this.anIntArray80.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray80.length; local196++) {
							local194[local196] = this.anIntArray80[local196];
						}
						this.anIntArray80 = local194;
					}
				}
				if (local80 >= local22) {
					local22 = local80 + 1;
				}
				this.anIntArray80[local80] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIBI[B[B)I")
	public int method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg0 << 3;
		while (arg2 < local9) {
			@Pc(25) int local25 = arg3[arg2] & 0xFF;
			@Pc(30) int local30 = this.anIntArray79[local25];
			@Pc(35) byte local35 = this.aByteArray17[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(52) int local52 = local18 >> 3;
			@Pc(56) int local56 = local18 & 0x7;
			local5 &= -local56 >> 31;
			@Pc(74) int local74 = local52 + (local35 + local56 - 1 >> 3);
			local18 += local35;
			@Pc(79) int local79 = local56 + 24;
			arg4[local52] = (byte) (local5 |= local30 >>> local79);
			if (local52 < local74) {
				local52++;
				local56 = local79 - 8;
				arg4[local52] = (byte) (local5 = local30 >>> local56);
				if (local74 > local52) {
					local56 -= 8;
					local52++;
					arg4[local52] = (byte) (local5 = local30 >>> local56);
					if (local52 < local74) {
						local52++;
						local56 -= 8;
						arg4[local52] = (byte) (local5 = local30 >>> local56);
						if (local52 < local74) {
							local56 -= 8;
							local52++;
							arg4[local52] = (byte) (local5 = local30 << -local56);
						}
					}
				}
			}
			arg2++;
		}
		return (local18 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[BIBI[B)I")
	public int method834(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = arg3;
		while (true) {
			@Pc(28) byte local28 = arg1[local18];
			if (local28 < 0) {
				local12 = this.anIntArray80[local12];
			} else {
				local12++;
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local43;
				if (local16 <= arg2) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local77;
				if (local16 <= arg2) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(111) int local111;
			if ((local111 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local111;
				if (local16 <= arg2) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(145) int local145;
			if ((local145 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local145;
				if (local16 <= arg2) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(179) int local179;
			if ((local179 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local179;
				if (arg2 >= local16) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(217) int local217;
			if ((local217 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local217;
				if (local16 <= arg2) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local252;
				if (local16 <= arg2) {
					break;
				}
				local12 = 0;
			}
			if ((local28 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray80[local12];
			}
			@Pc(286) int local286;
			if ((local286 = this.anIntArray80[local12]) < 0) {
				arg4[arg2++] = (byte) ~local286;
				if (arg2 >= local16) {
					break;
				}
				local12 = 0;
			}
			local18++;
		}
		return local18 + 1 - arg3;
	}
}

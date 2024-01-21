import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class42 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
	private final int[] anIntArray312;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[B")
	private final byte[] aByteArray19;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
	public Class42(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray312 = new int[local6];
		this.anIntArray313 = new int[8];
		this.aByteArray19 = arg0;
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = local20[local30];
				@Pc(46) int local46 = 0x1 << 32 - local30;
				this.anIntArray312[local24] = local39;
				@Pc(107) int local107;
				@Pc(62) int local62;
				@Pc(68) int local68;
				@Pc(78) int local78;
				if ((local46 & local39) == 0) {
					for (local62 = local30 - 1; local62 >= 1; local62--) {
						local68 = local20[local62];
						if (local39 != local68) {
							break;
						}
						local78 = 0x1 << 32 - local62;
						if ((local78 & local68) != 0) {
							local20[local62] = local20[local62 - 1];
							break;
						}
						local20[local62] = local78 | local68;
					}
					local107 = local39 | local46;
				} else {
					local107 = local20[local30 - 1];
				}
				local20[local30] = local107;
				for (local62 = local30 + 1; local62 <= 32; local62++) {
					if (local20[local62] == local39) {
						local20[local62] = local107;
					}
				}
				local68 = 0;
				for (local78 = 0; local78 < local30; local78++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local78;
					if ((local39 & local154) == 0) {
						local68++;
					} else {
						if (this.anIntArray313[local68] == 0) {
							this.anIntArray313[local68] = local22;
						}
						local68 = this.anIntArray313[local68];
					}
					if (local68 >= this.anIntArray313.length) {
						@Pc(199) int[] local199 = new int[this.anIntArray313.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray313.length; local201++) {
							local199[local201] = this.anIntArray313[local201];
						}
						this.anIntArray313 = local199;
					}
				}
				if (local68 >= local22) {
					local22 = local68 + 1;
				}
				this.anIntArray313[local68] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BIII[B)I")
	public int method1398(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2 << 3;
		while (arg3 < local9) {
			@Pc(23) int local23 = arg4[arg3] & 0xFF;
			@Pc(28) int local28 = this.anIntArray312[local23];
			@Pc(33) byte local33 = this.aByteArray19[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(53) int local53 = local15 & 0x7;
			local11 &= -local53 >> 31;
			@Pc(64) int local64 = local15 >> 3;
			@Pc(75) int local75 = local64 + (local53 + local33 - 1 >> 3);
			local15 += local33;
			@Pc(80) int local80 = local53 + 24;
			arg1[local64] = (byte) (local11 |= local28 >>> local80);
			if (local64 < local75) {
				local53 = local80 - 8;
				local64++;
				arg1[local64] = (byte) (local11 = local28 >>> local53);
				if (local64 < local75) {
					local64++;
					local53 -= 8;
					arg1[local64] = (byte) (local11 = local28 >>> local53);
					if (local64 < local75) {
						local64++;
						local53 -= 8;
						arg1[local64] = (byte) (local11 = local28 >>> local53);
						if (local64 < local75) {
							local53 -= 8;
							local64++;
							arg1[local64] = (byte) (local11 = local28 << -local53);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIII[BI)I")
	public int method1400(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg2;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg3;
		while (true) {
			@Pc(21) byte local21 = arg0[local17];
			if (local21 < 0) {
				local15 = this.anIntArray313[local15];
			} else {
				local15++;
			}
			@Pc(37) int local37;
			if ((local37 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local37;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(73) int local73;
			if ((local73 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local73;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local108;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(150) int local150;
			if ((local150 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local150;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(188) int local188;
			if ((local188 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local188;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local227;
				if (arg1 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(266) int local266;
			if ((local266 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local266;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray313[local15];
			}
			@Pc(298) int local298;
			if ((local298 = this.anIntArray313[local15]) < 0) {
				arg4[arg1++] = (byte) ~local298;
				if (local13 <= arg1) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg3;
	}
}

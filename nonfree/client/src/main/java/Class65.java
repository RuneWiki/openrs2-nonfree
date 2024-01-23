import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class65 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	private int anInt2866 = 0;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	private int anInt2879;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	private int anInt2865;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	private int anInt2873;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2879 = arg0;
		this.anInt2865 = 0;
		this.anInt2873 = arg1;
		this.anIntArrayArray19 = new int[this.anInt2879][this.anInt2873];
		this.method2206();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	public void method2203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt2865;
		@Pc(17) int local17 = arg1 - this.anInt2866;
		this.anIntArrayArray19[local12][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	private void method2204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIIIZZ)V")
	public void method2205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg2 - this.anInt2865;
		@Pc(14) int local14 = 256;
		if (arg4) {
			local14 = 131328;
		}
		if (arg5) {
			local14 |= 0x40000000;
		}
		@Pc(31) int local31 = arg1 - this.anInt2866;
		for (@Pc(37) int local37 = local6; local37 < arg0 + local6; local37++) {
			if (local37 >= 0 && local37 < this.anInt2879) {
				for (@Pc(54) int local54 = local31; local54 < arg3 + local31; local54++) {
					if (local54 >= 0 && this.anInt2873 > local54) {
						this.method2207(local14, local54, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method2206() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2879; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2873; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt2879 - 5 || this.anInt2873 - 5 <= local11) {
					this.anIntArrayArray19[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray19[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIII)V")
	private void method2207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIZZII)V")
	public void method2208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt2865;
		@Pc(9) int local9 = arg1 - this.anInt2866;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2204(local4, 128, local9);
				this.method2204(local4 - 1, 8, local9);
			}
			if (arg4 == 1) {
				this.method2204(local4, 2, local9);
				this.method2204(local4, 32, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2204(local4, 8, local9);
				this.method2204(local4 + 1, 128, local9);
			}
			if (arg4 == 3) {
				this.method2204(local4, 32, local9);
				this.method2204(local4, 2, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2204(local4, 1, local9);
				this.method2204(local4 - 1, 16, local9 + 1);
			}
			if (arg4 == 1) {
				this.method2204(local4, 4, local9);
				this.method2204(local4 + 1, 64, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2204(local4, 16, local9);
				this.method2204(local4 + 1, 1, local9 - 1);
			}
			if (arg4 == 3) {
				this.method2204(local4, 64, local9);
				this.method2204(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method2204(local4, 130, local9);
				this.method2204(local4 - 1, 8, local9);
				this.method2204(local4, 32, local9 + 1);
			}
			if (arg4 == 1) {
				this.method2204(local4, 10, local9);
				this.method2204(local4, 32, local9 + 1);
				this.method2204(local4 + 1, 128, local9);
			}
			if (arg4 == 2) {
				this.method2204(local4, 40, local9);
				this.method2204(local4 + 1, 128, local9);
				this.method2204(local4, 2, local9 - 1);
			}
			if (arg4 == 3) {
				this.method2204(local4, 160, local9);
				this.method2204(local4, 2, local9 - 1);
				this.method2204(local4 - 1, 8, local9);
			}
		}
		if (arg2) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method2204(local4, 65536, local9);
					this.method2204(local4 - 1, 4096, local9);
				}
				if (arg4 == 1) {
					this.method2204(local4, 1024, local9);
					this.method2204(local4, 16384, local9 + 1);
				}
				if (arg4 == 2) {
					this.method2204(local4, 4096, local9);
					this.method2204(local4 + 1, 65536, local9);
				}
				if (arg4 == 3) {
					this.method2204(local4, 16384, local9);
					this.method2204(local4, 1024, local9 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method2204(local4, 512, local9);
					this.method2204(local4 - 1, 8192, local9 + 1);
				}
				if (arg4 == 1) {
					this.method2204(local4, 2048, local9);
					this.method2204(local4 + 1, 32768, local9 + 1);
				}
				if (arg4 == 2) {
					this.method2204(local4, 8192, local9);
					this.method2204(local4 + 1, 512, local9 - 1);
				}
				if (arg4 == 3) {
					this.method2204(local4, 32768, local9);
					this.method2204(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method2204(local4, 66560, local9);
					this.method2204(local4 - 1, 4096, local9);
					this.method2204(local4, 16384, local9 + 1);
				}
				if (arg4 == 1) {
					this.method2204(local4, 5120, local9);
					this.method2204(local4, 16384, local9 + 1);
					this.method2204(local4 + 1, 65536, local9);
				}
				if (arg4 == 2) {
					this.method2204(local4, 20480, local9);
					this.method2204(local4 + 1, 65536, local9);
					this.method2204(local4, 1024, local9 - 1);
				}
				if (arg4 == 3) {
					this.method2204(local4, 81920, local9);
					this.method2204(local4, 1024, local9 - 1);
					this.method2204(local4 - 1, 4096, local9);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2204(local4, 536870912, local9);
				this.method2204(local4 - 1, 33554432, local9);
			}
			if (arg4 == 1) {
				this.method2204(local4, 8388608, local9);
				this.method2204(local4, 134217728, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2204(local4, 33554432, local9);
				this.method2204(local4 + 1, 536870912, local9);
			}
			if (arg4 == 3) {
				this.method2204(local4, 134217728, local9);
				this.method2204(local4, 8388608, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2204(local4, 4194304, local9);
				this.method2204(local4 - 1, 67108864, local9 + 1);
			}
			if (arg4 == 1) {
				this.method2204(local4, 16777216, local9);
				this.method2204(local4 + 1, 268435456, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2204(local4, 67108864, local9);
				this.method2204(local4 + 1, 4194304, local9 - 1);
			}
			if (arg4 == 3) {
				this.method2204(local4, 268435456, local9);
				this.method2204(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2204(local4, 545259520, local9);
			this.method2204(local4 - 1, 33554432, local9);
			this.method2204(local4, 134217728, local9 + 1);
		}
		if (arg4 == 1) {
			this.method2204(local4, 41943040, local9);
			this.method2204(local4, 134217728, local9 + 1);
			this.method2204(local4 + 1, 536870912, local9);
		}
		if (arg4 == 2) {
			this.method2204(local4, 167772160, local9);
			this.method2204(local4 + 1, 536870912, local9);
			this.method2204(local4, 8388608, local9 - 1);
		}
		if (arg4 == 3) {
			this.method2204(local4, 671088640, local9);
			this.method2204(local4, 8388608, local9 - 1);
			this.method2204(local4 - 1, 33554432, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method2211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2866;
		@Pc(13) int local13 = arg1 - this.anInt2865;
		this.anIntArrayArray19[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method2212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2866;
		@Pc(25) int local25 = arg0 - this.anInt2865;
		this.anIntArrayArray19[local25][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZIIIII)V")
	public void method2213(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt2865;
		@Pc(13) int local13 = arg5 - this.anInt2866;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method2207(128, local13, local4);
				this.method2207(8, local13, local4 - 1);
			}
			if (arg3 == 1) {
				this.method2207(2, local13, local4);
				this.method2207(32, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method2207(8, local13, local4);
				this.method2207(128, local13, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2207(32, local13, local4);
				this.method2207(2, local13 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method2207(1, local13, local4);
				this.method2207(16, local13 + 1, local4 - 1);
			}
			if (arg3 == 1) {
				this.method2207(4, local13, local4);
				this.method2207(64, local13 + 1, local4 - -1);
			}
			if (arg3 == 2) {
				this.method2207(16, local13, local4);
				this.method2207(1, local13 - 1, local4 - -1);
			}
			if (arg3 == 3) {
				this.method2207(64, local13, local4);
				this.method2207(4, local13 - 1, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method2207(130, local13, local4);
				this.method2207(8, local13, local4 - 1);
				this.method2207(32, local13 + 1, local4);
			}
			if (arg3 == 1) {
				this.method2207(10, local13, local4);
				this.method2207(32, local13 + 1, local4);
				this.method2207(128, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method2207(40, local13, local4);
				this.method2207(128, local13, local4 + 1);
				this.method2207(2, local13 - 1, local4);
			}
			if (arg3 == 3) {
				this.method2207(160, local13, local4);
				this.method2207(2, local13 - 1, local4);
				this.method2207(8, local13, local4 - 1);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method2207(65536, local13, local4);
					this.method2207(4096, local13, local4 - 1);
				}
				if (arg3 == 1) {
					this.method2207(1024, local13, local4);
					this.method2207(16384, local13 + 1, local4);
				}
				if (arg3 == 2) {
					this.method2207(4096, local13, local4);
					this.method2207(65536, local13, local4 + 1);
				}
				if (arg3 == 3) {
					this.method2207(16384, local13, local4);
					this.method2207(1024, local13 - 1, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method2207(512, local13, local4);
					this.method2207(8192, local13 + 1, local4 + -1);
				}
				if (arg3 == 1) {
					this.method2207(2048, local13, local4);
					this.method2207(32768, local13 + 1, local4 + 1);
				}
				if (arg3 == 2) {
					this.method2207(8192, local13, local4);
					this.method2207(512, local13 - 1, local4 - -1);
				}
				if (arg3 == 3) {
					this.method2207(32768, local13, local4);
					this.method2207(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method2207(66560, local13, local4);
					this.method2207(4096, local13, local4 - 1);
					this.method2207(16384, local13 + 1, local4);
				}
				if (arg3 == 1) {
					this.method2207(5120, local13, local4);
					this.method2207(16384, local13 + 1, local4);
					this.method2207(65536, local13, local4 + 1);
				}
				if (arg3 == 2) {
					this.method2207(20480, local13, local4);
					this.method2207(65536, local13, local4 + 1);
					this.method2207(1024, local13 - 1, local4);
				}
				if (arg3 == 3) {
					this.method2207(81920, local13, local4);
					this.method2207(1024, local13 - 1, local4);
					this.method2207(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method2207(536870912, local13, local4);
				this.method2207(33554432, local13, local4 - 1);
			}
			if (arg3 == 1) {
				this.method2207(8388608, local13, local4);
				this.method2207(134217728, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method2207(33554432, local13, local4);
				this.method2207(536870912, local13, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2207(134217728, local13, local4);
				this.method2207(8388608, local13 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method2207(4194304, local13, local4);
				this.method2207(67108864, local13 + 1, local4 + -1);
			}
			if (arg3 == 1) {
				this.method2207(16777216, local13, local4);
				this.method2207(268435456, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method2207(67108864, local13, local4);
				this.method2207(4194304, local13 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2207(268435456, local13, local4);
				this.method2207(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2207(545259520, local13, local4);
			this.method2207(33554432, local13, local4 - 1);
			this.method2207(134217728, local13 + 1, local4);
		}
		if (arg3 == 1) {
			this.method2207(41943040, local13, local4);
			this.method2207(134217728, local13 + 1, local4);
			this.method2207(536870912, local13, local4 + 1);
		}
		if (arg3 == 2) {
			this.method2207(167772160, local13, local4);
			this.method2207(536870912, local13, local4 + 1);
			this.method2207(8388608, local13 - 1, local4);
		}
		if (arg3 == 3) {
			this.method2207(671088640, local13, local4);
			this.method2207(8388608, local13 - 1, local4);
			this.method2207(33554432, local13, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIIIIZI)V")
	public void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg3 - this.anInt2865;
		@Pc(11) int local11 = arg0 - this.anInt2866;
		@Pc(27) int local27;
		if (arg2 == 1 || arg2 == 3) {
			local27 = arg6;
			arg6 = arg4;
			arg4 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg5) {
			local33 = 131328;
		}
		if (arg1) {
			local33 |= 0x40000000;
		}
		for (local27 = local6; local27 < local6 + arg6; local27++) {
			if (local27 >= 0 && local27 < this.anInt2879) {
				for (@Pc(65) int local65 = local11; local65 < arg4 + local11; local65++) {
					if (local65 >= 0 && local65 < this.anInt2873) {
						this.method2204(local27, local33, local65);
					}
				}
			}
		}
	}
}

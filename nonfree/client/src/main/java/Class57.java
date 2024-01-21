import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class57 {

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	private final int anInt2958;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	private final int anInt2972;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	private final int anInt2970;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	private final int anInt2974;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(II)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2958 = arg1;
		this.anInt2972 = arg0;
		this.anIntArrayArray23 = new int[this.anInt2972][this.anInt2958];
		this.anInt2970 = 0;
		this.anInt2974 = 0;
		this.method2262();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg2 && arg4 == arg0) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt2970;
		@Pc(29) int local29 = arg0 - this.anInt2970;
		@Pc(40) int local40 = arg3 - this.anInt2974;
		@Pc(45) int local45 = arg2 - this.anInt2974;
		if (arg1 == 0) {
			if (arg5 == 0) {
				if (local45 == local40 - 1 && local29 == local24) {
					return true;
				}
				if (local45 == local40 && local29 + 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local40 == local45 && local29 - 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local45 == local40 && local29 + 1 == local24) {
					return true;
				}
				if (local40 - 1 == local45 && local24 == local29 && (this.anIntArrayArray23[local45][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local45 == local40 + 1 && local24 == local29 && (this.anIntArrayArray23[local45][local24] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local45 == local40 + 1 && local24 == local29) {
					return true;
				}
				if (local45 == local40 && local29 + 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local40 == local45 && local29 - 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local40 == local45 && local24 == local29 - 1) {
					return true;
				}
				if (local45 == local40 - 1 && local29 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local40 + 1 == local45 && local24 == local29 && (this.anIntArrayArray23[local45][local24] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				if (local45 == local40 - 1 && local24 == local29) {
					return true;
				}
				if (local40 == local45 && local24 == local29 + 1) {
					return true;
				}
				if (local40 + 1 == local45 && local24 == local29 && (this.anIntArrayArray23[local45][local24] & 0x12C0180) == 0) {
					return true;
				}
				if (local45 == local40 && local24 == local29 - 1 && (this.anIntArrayArray23[local45][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local40 - 1 == local45 && local29 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local45 == local40 && local24 == local29 + 1) {
					return true;
				}
				if (local45 == local40 + 1 && local24 == local29) {
					return true;
				}
				if (local45 == local40 && local29 - 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local45 == local40 - 1 && local29 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local45 == local40 && local29 + 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local40 + 1 == local45 && local24 == local29) {
					return true;
				}
				if (local40 == local45 && local29 - 1 == local24) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local40 - 1 == local45 && local24 == local29) {
					return true;
				}
				if (local45 == local40 && local29 + 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local45 == local40 + 1 && local29 == local24 && (this.anIntArrayArray23[local45][local24] & 0x12C0180) == 0) {
					return true;
				}
				if (local40 == local45 && local24 == local29 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local45 == local40 && local24 == local29 + 1 && (this.anIntArrayArray23[local45][local24] & 0x20) == 0) {
				return true;
			}
			if (local45 == local40 && local29 - 1 == local24 && (this.anIntArrayArray23[local45][local24] & 0x2) == 0) {
				return true;
			}
			if (local40 - 1 == local45 && local24 == local29 && (this.anIntArrayArray23[local45][local24] & 0x8) == 0) {
				return true;
			}
			if (local45 == local40 + 1 && local24 == local29 && (this.anIntArrayArray23[local45][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V")
	public void method2257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt2974;
		@Pc(19) int local19 = arg0 - this.anInt2970;
		this.anIntArrayArray23[local10][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V")
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt2974;
		@Pc(18) int local18 = arg0 - this.anInt2970;
		this.anIntArrayArray23[local13][local18] |= 0x40000;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIZI)V")
	public void method2261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt2970;
		@Pc(13) int local13 = arg3 - this.anInt2974;
		@Pc(23) int local23;
		if (arg1 == 1 || arg1 == 3) {
			local23 = arg2;
			arg2 = arg5;
			arg5 = local23;
		}
		@Pc(29) int local29 = 256;
		if (arg4) {
			local29 = 131328;
		}
		for (local23 = local13; local23 < arg2 + local13; local23++) {
			if (local23 >= 0 && local23 < this.anInt2972) {
				for (@Pc(52) int local52 = local4; local52 < arg5 + local4; local52++) {
					if (local52 >= 0 && this.anInt2958 > local52) {
						this.method2266(local23, local29, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public void method2262() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2972; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2958; local4++) {
				if (local1 == 0 || local4 == 0 || local1 >= this.anInt2972 - 5 || local4 >= this.anInt2958 - 5) {
					this.anIntArrayArray23[local1][local4] = 16777215;
				} else {
					this.anIntArrayArray23[local1][local4] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg1 - 1;
		@Pc(15) int local15 = arg2 + arg0 - 1;
		if (arg0 <= arg6 && arg6 <= local15 && arg3 >= arg5 && local9 >= arg3) {
			return true;
		} else if (arg6 == arg0 - 1 && arg5 <= arg3 && local9 >= arg3 && (this.anIntArrayArray23[arg6 - this.anInt2974][arg3 - this.anInt2970] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local15 + 1 == arg6 && arg5 <= arg3 && arg3 <= local9 && (this.anIntArrayArray23[arg6 - this.anInt2974][arg3 - this.anInt2970] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg3 && arg0 <= arg6 && arg6 <= local15 && (this.anIntArrayArray23[arg6 - this.anInt2974][arg3 - this.anInt2970] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg3 && arg6 >= arg0 && arg6 <= local15 && (this.anIntArrayArray23[arg6 - this.anInt2974][arg3 - this.anInt2970] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIII)V")
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2974;
		@Pc(9) int local9 = arg0 - this.anInt2970;
		@Pc(11) int local11 = 256;
		if (arg1) {
			local11 = 131328;
		}
		for (@Pc(24) int local24 = local4; local24 < arg4 + local4; local24++) {
			if (local24 >= 0 && this.anInt2972 > local24) {
				for (@Pc(36) int local36 = local9; local36 < local9 + arg3; local36++) {
					if (local36 >= 0 && this.anInt2958 > local36) {
						this.method2272(local11, local36, local24);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
	private void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray23[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(III)V")
	public void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2974;
		@Pc(19) int local19 = arg1 - this.anInt2970;
		this.anIntArrayArray23[local4][local19] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZII)V")
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt2974;
		@Pc(9) int local9 = arg2 - this.anInt2970;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2266(local4, 128, local9);
				this.method2266(local4 - 1, 8, local9);
			}
			if (arg0 == 1) {
				this.method2266(local4, 2, local9);
				this.method2266(local4, 32, local9 + 1);
			}
			if (arg0 == 2) {
				this.method2266(local4, 8, local9);
				this.method2266(local4 + 1, 128, local9);
			}
			if (arg0 == 3) {
				this.method2266(local4, 32, local9);
				this.method2266(local4, 2, local9 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2266(local4, 1, local9);
				this.method2266(local4 - 1, 16, local9 + 1);
			}
			if (arg0 == 1) {
				this.method2266(local4, 4, local9);
				this.method2266(local4 + 1, 64, local9 + 1);
			}
			if (arg0 == 2) {
				this.method2266(local4, 16, local9);
				this.method2266(local4 + 1, 1, local9 - 1);
			}
			if (arg0 == 3) {
				this.method2266(local4, 64, local9);
				this.method2266(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method2266(local4, 130, local9);
				this.method2266(local4 - 1, 8, local9);
				this.method2266(local4, 32, local9 + 1);
			}
			if (arg0 == 1) {
				this.method2266(local4, 10, local9);
				this.method2266(local4, 32, local9 + 1);
				this.method2266(local4 + 1, 128, local9);
			}
			if (arg0 == 2) {
				this.method2266(local4, 40, local9);
				this.method2266(local4 + 1, 128, local9);
				this.method2266(local4, 2, local9 - 1);
			}
			if (arg0 == 3) {
				this.method2266(local4, 160, local9);
				this.method2266(local4, 2, local9 - 1);
				this.method2266(local4 - 1, 8, local9);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2266(local4, 65536, local9);
				this.method2266(local4 - 1, 4096, local9);
			}
			if (arg0 == 1) {
				this.method2266(local4, 1024, local9);
				this.method2266(local4, 16384, local9 + 1);
			}
			if (arg0 == 2) {
				this.method2266(local4, 4096, local9);
				this.method2266(local4 + 1, 65536, local9);
			}
			if (arg0 == 3) {
				this.method2266(local4, 16384, local9);
				this.method2266(local4, 1024, local9 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2266(local4, 512, local9);
				this.method2266(local4 - 1, 8192, local9 + 1);
			}
			if (arg0 == 1) {
				this.method2266(local4, 2048, local9);
				this.method2266(local4 + 1, 32768, local9 + 1);
			}
			if (arg0 == 2) {
				this.method2266(local4, 8192, local9);
				this.method2266(local4 + 1, 512, local9 - 1);
			}
			if (arg0 == 3) {
				this.method2266(local4, 32768, local9);
				this.method2266(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2266(local4, 66560, local9);
			this.method2266(local4 - 1, 4096, local9);
			this.method2266(local4, 16384, local9 + 1);
		}
		if (arg0 == 1) {
			this.method2266(local4, 5120, local9);
			this.method2266(local4, 16384, local9 + 1);
			this.method2266(local4 + 1, 65536, local9);
		}
		if (arg0 == 2) {
			this.method2266(local4, 20480, local9);
			this.method2266(local4 + 1, 65536, local9);
			this.method2266(local4, 1024, local9 - 1);
		}
		if (arg0 == 3) {
			this.method2266(local4, 81920, local9);
			this.method2266(local4, 1024, local9 - 1);
			this.method2266(local4 - 1, 4096, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBZI)V")
	public void method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg4 - this.anInt2970;
		@Pc(17) int local17 = arg1 - this.anInt2974;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2272(128, local12, local17);
				this.method2272(8, local12, local17 - 1);
			}
			if (arg0 == 1) {
				this.method2272(2, local12, local17);
				this.method2272(32, local12 + 1, local17);
			}
			if (arg0 == 2) {
				this.method2272(8, local12, local17);
				this.method2272(128, local12, local17 + 1);
			}
			if (arg0 == 3) {
				this.method2272(32, local12, local17);
				this.method2272(2, local12 - 1, local17);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2272(1, local12, local17);
				this.method2272(16, local12 + 1, local17 + -1);
			}
			if (arg0 == 1) {
				this.method2272(4, local12, local17);
				this.method2272(64, local12 + 1, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2272(16, local12, local17);
				this.method2272(1, local12 - 1, local17 + 1);
			}
			if (arg0 == 3) {
				this.method2272(64, local12, local17);
				this.method2272(4, local12 - 1, local17 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method2272(130, local12, local17);
				this.method2272(8, local12, local17 - 1);
				this.method2272(32, local12 + 1, local17);
			}
			if (arg0 == 1) {
				this.method2272(10, local12, local17);
				this.method2272(32, local12 + 1, local17);
				this.method2272(128, local12, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2272(40, local12, local17);
				this.method2272(128, local12, local17 + 1);
				this.method2272(2, local12 - 1, local17);
			}
			if (arg0 == 3) {
				this.method2272(160, local12, local17);
				this.method2272(2, local12 - 1, local17);
				this.method2272(8, local12, local17 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2272(65536, local12, local17);
				this.method2272(4096, local12, local17 - 1);
			}
			if (arg0 == 1) {
				this.method2272(1024, local12, local17);
				this.method2272(16384, local12 + 1, local17);
			}
			if (arg0 == 2) {
				this.method2272(4096, local12, local17);
				this.method2272(65536, local12, local17 + 1);
			}
			if (arg0 == 3) {
				this.method2272(16384, local12, local17);
				this.method2272(1024, local12 - 1, local17);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2272(512, local12, local17);
				this.method2272(8192, local12 + 1, local17 + -1);
			}
			if (arg0 == 1) {
				this.method2272(2048, local12, local17);
				this.method2272(32768, local12 + 1, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2272(8192, local12, local17);
				this.method2272(512, local12 - 1, local17 + 1);
			}
			if (arg0 == 3) {
				this.method2272(32768, local12, local17);
				this.method2272(2048, local12 - 1, local17 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2272(66560, local12, local17);
			this.method2272(4096, local12, local17 - 1);
			this.method2272(16384, local12 + 1, local17);
		}
		if (arg0 == 1) {
			this.method2272(5120, local12, local17);
			this.method2272(16384, local12 + 1, local17);
			this.method2272(65536, local12, local17 + 1);
		}
		if (arg0 == 2) {
			this.method2272(20480, local12, local17);
			this.method2272(65536, local12, local17 + 1);
			this.method2272(1024, local12 - 1, local17);
		}
		if (arg0 == 3) {
			this.method2272(81920, local12, local17);
			this.method2272(1024, local12 - 1, local17);
			this.method2272(4096, local12, local17 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBIII)Z")
	public boolean method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg2 && arg0 == arg1) {
			return true;
		}
		@Pc(25) int local25 = arg3 - this.anInt2974;
		@Pc(30) int local30 = arg0 - this.anInt2970;
		@Pc(35) int local35 = arg2 - this.anInt2974;
		@Pc(40) int local40 = arg1 - this.anInt2970;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local25 == local35 + 1 && local30 == local40 && (this.anIntArrayArray23[local25][local40] & 0x80) == 0) {
					return true;
				}
				if (local35 == local25 && local30 - 1 == local40 && (this.anIntArrayArray23[local25][local40] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local35 - 1 == local25 && local30 == local40 && (this.anIntArrayArray23[local25][local40] & 0x8) == 0) {
					return true;
				}
				if (local25 == local35 && local40 == local30 - 1 && (this.anIntArrayArray23[local25][local40] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local35 - 1 && local40 == local30 && (this.anIntArrayArray23[local25][local40] & 0x8) == 0) {
					return true;
				}
				if (local35 == local25 && local40 == local30 + 1 && (this.anIntArrayArray23[local25][local40] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local35 + 1 == local25 && local30 == local40 && (this.anIntArrayArray23[local25][local40] & 0x80) == 0) {
					return true;
				}
				if (local25 == local35 && local40 == local30 + 1 && (this.anIntArrayArray23[local25][local40] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local35 == local25 && local40 == local30 + 1 && (this.anIntArrayArray23[local25][local40] & 0x20) == 0) {
				return true;
			}
			if (local35 == local25 && local30 - 1 == local40 && (this.anIntArrayArray23[local25][local40] & 0x2) == 0) {
				return true;
			}
			if (local25 == local35 - 1 && local40 == local30 && (this.anIntArrayArray23[local25][local40] & 0x8) == 0) {
				return true;
			}
			if (local35 + 1 == local25 && local40 == local30 && (this.anIntArrayArray23[local25][local40] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIII)V")
	private void method2272(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray23[arg2][arg1] |= arg0;
	}
}

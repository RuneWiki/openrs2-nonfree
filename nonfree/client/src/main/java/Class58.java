import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class58 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private final int anInt2411 = 0;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	private final int anInt2412;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	private final int anInt2413;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[[I")
	public final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private final int anInt2410;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2412 = arg1;
		this.anInt2413 = arg0;
		this.anIntArrayArray26 = new int[this.anInt2413][this.anInt2412];
		this.anInt2410 = 0;
		this.method1594();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIIII)Z")
	public boolean method1592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg0 && arg3 == arg1) {
			return true;
		}
		@Pc(20) int local20 = arg1 - this.anInt2411;
		@Pc(25) int local25 = arg0 - this.anInt2410;
		@Pc(30) int local30 = arg2 - this.anInt2410;
		@Pc(35) int local35 = arg3 - this.anInt2411;
		if (arg5 == 0) {
			if (arg4 == 0) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local35 == local20 - 1 && (this.anIntArrayArray26[local25][local35] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local30 == local25 && local35 == local20 + 1) {
					return true;
				}
				if (local25 == local30 - 1 && local35 == local20 && (this.anIntArrayArray26[local25][local35] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local20 && (this.anIntArrayArray26[local25][local35] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local30 + 1 == local25 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local35 == local20 - 1 && (this.anIntArrayArray26[local25][local35] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local30 == local25 && local35 == local20 - 1) {
					return true;
				}
				if (local25 == local30 - 1 && local20 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				if (local30 - 1 == local25 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray26[local25][local35] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local25 && local35 == local20 + 1) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local35 == local20 - 1 && (this.anIntArrayArray26[local25][local35] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local30 - 1 && local20 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray26[local25][local35] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local20 == local35 && (this.anIntArrayArray26[local25][local35] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray26[local25][local35] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local20 - 1 == local35 && (this.anIntArrayArray26[local25][local35] & 0x2) == 0) {
				return true;
			}
			if (local30 - 1 == local25 && local20 == local35 && (this.anIntArrayArray26[local25][local35] & 0x8) == 0) {
				return true;
			}
			if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray26[local25][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public void method1594() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2413; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2412; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt2413 - 5 <= local7 || this.anInt2412 - 5 <= local11) {
					this.anIntArrayArray26[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray26[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIB)V")
	private void method1595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray26[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIZII)V")
	public void method1596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt2410;
		@Pc(15) int local15 = arg2 - this.anInt2411;
		@Pc(17) int local17 = 256;
		@Pc(27) int local27;
		if (arg0 == 1 || arg0 == 3) {
			local27 = arg4;
			arg4 = arg1;
			arg1 = local27;
		}
		if (arg3) {
			local17 = 131328;
		}
		for (local27 = local6; local27 < local6 + arg4; local27++) {
			if (local27 >= 0 && this.anInt2413 > local27) {
				for (@Pc(56) int local56 = local15; local56 < arg1 + local15; local56++) {
					if (local56 >= 0 && local56 < this.anInt2412) {
						this.method1595(local27, local17, local56);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIIIZII)V")
	public void method1598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg1 - this.anInt2410;
		@Pc(15) int local15 = arg5 - this.anInt2411;
		@Pc(27) int local27;
		if (arg0 == 1 || arg0 == 3) {
			local27 = arg4;
			arg4 = arg2;
			arg2 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg3) {
			local33 = 131328;
		}
		for (local27 = local10; local27 < arg4 + local10; local27++) {
			if (local27 >= 0 && this.anInt2413 > local27) {
				for (@Pc(58) int local58 = local15; local58 < local15 + arg2; local58++) {
					if (local58 >= 0 && local58 < this.anInt2412) {
						this.method1603(local33, local27, local58);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	public void method1599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2411;
		@Pc(9) int local9 = arg0 - this.anInt2410;
		this.anIntArrayArray26[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIZ)V")
	public void method1600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) int local8 = arg0 - this.anInt2411;
		@Pc(13) int local13 = arg2 - this.anInt2410;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1603(128, local13, local8);
				this.method1603(8, local13 - 1, local8);
			}
			if (arg3 == 1) {
				this.method1603(2, local13, local8);
				this.method1603(32, local13, local8 + 1);
			}
			if (arg3 == 2) {
				this.method1603(8, local13, local8);
				this.method1603(128, local13 + 1, local8);
			}
			if (arg3 == 3) {
				this.method1603(32, local13, local8);
				this.method1603(2, local13, local8 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1603(1, local13, local8);
				this.method1603(16, local13 - 1, local8 + 1);
			}
			if (arg3 == 1) {
				this.method1603(4, local13, local8);
				this.method1603(64, local13 + 1, local8 - -1);
			}
			if (arg3 == 2) {
				this.method1603(16, local13, local8);
				this.method1603(1, local13 + 1, local8 - 1);
			}
			if (arg3 == 3) {
				this.method1603(64, local13, local8);
				this.method1603(4, local13 - 1, local8 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method1603(130, local13, local8);
				this.method1603(8, local13 - 1, local8);
				this.method1603(32, local13, local8 + 1);
			}
			if (arg3 == 1) {
				this.method1603(10, local13, local8);
				this.method1603(32, local13, local8 + 1);
				this.method1603(128, local13 + 1, local8);
			}
			if (arg3 == 2) {
				this.method1603(40, local13, local8);
				this.method1603(128, local13 + 1, local8);
				this.method1603(2, local13, local8 - 1);
			}
			if (arg3 == 3) {
				this.method1603(160, local13, local8);
				this.method1603(2, local13, local8 - 1);
				this.method1603(8, local13 - 1, local8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1603(65536, local13, local8);
				this.method1603(4096, local13 - 1, local8);
			}
			if (arg3 == 1) {
				this.method1603(1024, local13, local8);
				this.method1603(16384, local13, local8 + 1);
			}
			if (arg3 == 2) {
				this.method1603(4096, local13, local8);
				this.method1603(65536, local13 + 1, local8);
			}
			if (arg3 == 3) {
				this.method1603(16384, local13, local8);
				this.method1603(1024, local13, local8 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1603(512, local13, local8);
				this.method1603(8192, local13 - 1, local8 - -1);
			}
			if (arg3 == 1) {
				this.method1603(2048, local13, local8);
				this.method1603(32768, local13 + 1, local8 + 1);
			}
			if (arg3 == 2) {
				this.method1603(8192, local13, local8);
				this.method1603(512, local13 + 1, local8 + -1);
			}
			if (arg3 == 3) {
				this.method1603(32768, local13, local8);
				this.method1603(2048, local13 - 1, local8 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1603(66560, local13, local8);
			this.method1603(4096, local13 - 1, local8);
			this.method1603(16384, local13, local8 + 1);
		}
		if (arg3 == 1) {
			this.method1603(5120, local13, local8);
			this.method1603(16384, local13, local8 + 1);
			this.method1603(65536, local13 + 1, local8);
		}
		if (arg3 == 2) {
			this.method1603(20480, local13, local8);
			this.method1603(65536, local13 + 1, local8);
			this.method1603(1024, local13, local8 - 1);
		}
		if (arg3 == 3) {
			this.method1603(81920, local13, local8);
			this.method1603(1024, local13, local8 - 1);
			this.method1603(4096, local13 - 1, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
	public void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2410;
		@Pc(13) int local13 = arg0 - this.anInt2411;
		this.anIntArrayArray26[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IZIIIII)Z")
	public boolean method1602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg2 && arg0 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt2411;
		@Pc(29) int local29 = arg0 - this.anInt2411;
		@Pc(34) int local34 = arg3 - this.anInt2410;
		@Pc(39) int local39 = arg2 - this.anInt2410;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local34 + 1 == local39 && local29 == local24 && (this.anIntArrayArray26[local39][local24] & 0x80) == 0) {
					return true;
				}
				if (local39 == local34 && local29 - 1 == local24 && (this.anIntArrayArray26[local39][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local34 - 1 == local39 && local24 == local29 && (this.anIntArrayArray26[local39][local24] & 0x8) == 0) {
					return true;
				}
				if (local39 == local34 && local24 == local29 - 1 && (this.anIntArrayArray26[local39][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local39 == local34 - 1 && local29 == local24 && (this.anIntArrayArray26[local39][local24] & 0x8) == 0) {
					return true;
				}
				if (local34 == local39 && local24 == local29 + 1 && (this.anIntArrayArray26[local39][local24] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local39 == local34 + 1 && local29 == local24 && (this.anIntArrayArray26[local39][local24] & 0x80) == 0) {
					return true;
				}
				if (local39 == local34 && local24 == local29 + 1 && (this.anIntArrayArray26[local39][local24] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local34 == local39 && local29 + 1 == local24 && (this.anIntArrayArray26[local39][local24] & 0x20) == 0) {
				return true;
			}
			if (local34 == local39 && local24 == local29 - 1 && (this.anIntArrayArray26[local39][local24] & 0x2) == 0) {
				return true;
			}
			if (local39 == local34 - 1 && local24 == local29 && (this.anIntArrayArray26[local39][local24] & 0x8) == 0) {
				return true;
			}
			if (local34 + 1 == local39 && local29 == local24 && (this.anIntArrayArray26[local39][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
	private void method1603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray26[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIZI)V")
	public void method1604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt2410;
		@Pc(21) int local21 = arg1 - this.anInt2411;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1595(local8, 128, local21);
				this.method1595(local8 - 1, 8, local21);
			}
			if (arg2 == 1) {
				this.method1595(local8, 2, local21);
				this.method1595(local8, 32, local21 + 1);
			}
			if (arg2 == 2) {
				this.method1595(local8, 8, local21);
				this.method1595(local8 + 1, 128, local21);
			}
			if (arg2 == 3) {
				this.method1595(local8, 32, local21);
				this.method1595(local8, 2, local21 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1595(local8, 1, local21);
				this.method1595(local8 - 1, 16, local21 + 1);
			}
			if (arg2 == 1) {
				this.method1595(local8, 4, local21);
				this.method1595(local8 + 1, 64, local21 + 1);
			}
			if (arg2 == 2) {
				this.method1595(local8, 16, local21);
				this.method1595(local8 + 1, 1, local21 - 1);
			}
			if (arg2 == 3) {
				this.method1595(local8, 64, local21);
				this.method1595(local8 - 1, 4, local21 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1595(local8, 130, local21);
				this.method1595(local8 - 1, 8, local21);
				this.method1595(local8, 32, local21 + 1);
			}
			if (arg2 == 1) {
				this.method1595(local8, 10, local21);
				this.method1595(local8, 32, local21 + 1);
				this.method1595(local8 + 1, 128, local21);
			}
			if (arg2 == 2) {
				this.method1595(local8, 40, local21);
				this.method1595(local8 + 1, 128, local21);
				this.method1595(local8, 2, local21 - 1);
			}
			if (arg2 == 3) {
				this.method1595(local8, 160, local21);
				this.method1595(local8, 2, local21 - 1);
				this.method1595(local8 - 1, 8, local21);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1595(local8, 65536, local21);
				this.method1595(local8 - 1, 4096, local21);
			}
			if (arg2 == 1) {
				this.method1595(local8, 1024, local21);
				this.method1595(local8, 16384, local21 + 1);
			}
			if (arg2 == 2) {
				this.method1595(local8, 4096, local21);
				this.method1595(local8 + 1, 65536, local21);
			}
			if (arg2 == 3) {
				this.method1595(local8, 16384, local21);
				this.method1595(local8, 1024, local21 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1595(local8, 512, local21);
				this.method1595(local8 - 1, 8192, local21 + 1);
			}
			if (arg2 == 1) {
				this.method1595(local8, 2048, local21);
				this.method1595(local8 + 1, 32768, local21 + 1);
			}
			if (arg2 == 2) {
				this.method1595(local8, 8192, local21);
				this.method1595(local8 + 1, 512, local21 - 1);
			}
			if (arg2 == 3) {
				this.method1595(local8, 32768, local21);
				this.method1595(local8 - 1, 2048, local21 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1595(local8, 66560, local21);
			this.method1595(local8 - 1, 4096, local21);
			this.method1595(local8, 16384, local21 + 1);
		}
		if (arg2 == 1) {
			this.method1595(local8, 5120, local21);
			this.method1595(local8, 16384, local21 + 1);
			this.method1595(local8 + 1, 65536, local21);
		}
		if (arg2 == 2) {
			this.method1595(local8, 20480, local21);
			this.method1595(local8 + 1, 65536, local21);
			this.method1595(local8, 1024, local21 - 1);
		}
		if (arg2 == 3) {
			this.method1595(local8, 81920, local21);
			this.method1595(local8, 1024, local21 - 1);
			this.method1595(local8 - 1, 4096, local21);
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIB)V")
	public void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - this.anInt2410;
		@Pc(18) int local18 = arg1 - this.anInt2411;
		this.anIntArrayArray26[local13][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg2 + arg1 - 1;
		@Pc(23) int local23 = arg0 + arg3 - 1;
		if (arg6 >= arg1 && arg6 <= local5 && arg4 >= arg3 && local23 >= arg4) {
			return true;
		} else if (arg6 == arg1 - 1 && arg4 >= arg3 && local23 >= arg4 && (this.anIntArrayArray26[arg6 - this.anInt2410][arg4 - this.anInt2411] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg6 == local5 + 1 && arg4 >= arg3 && local23 >= arg4 && (this.anIntArrayArray26[arg6 - this.anInt2410][arg4 - this.anInt2411] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg3 - 1 && arg1 <= arg6 && local5 >= arg6 && (this.anIntArrayArray26[arg6 - this.anInt2410][arg4 - this.anInt2411] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local23 + 1 && arg6 >= arg1 && local5 >= arg6 && (this.anIntArrayArray26[arg6 - this.anInt2410][arg4 - this.anInt2411] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}
}

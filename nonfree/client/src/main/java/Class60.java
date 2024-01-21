import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class60 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
	public static int[] anIntArray282 = new int[32];

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	private final int anInt2555;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
	private final int anInt2564;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	private final int anInt2563;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
	private final int anInt2559;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "[[I")
	public final int[][] anIntArrayArray27;

	static {
		@Pc(20) int local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			anIntArray282[local22] = local20 - 1;
			local20 += local20;
		}
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2555 = arg0;
		this.anInt2564 = arg1;
		this.anInt2563 = 0;
		this.anInt2559 = 0;
		this.anIntArrayArray27 = new int[this.anInt2555][this.anInt2564];
		this.method1658();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZIIIB)V")
	public void method1649(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(17) int local17 = arg3 - this.anInt2563;
		@Pc(22) int local22 = arg2 - this.anInt2559;
		@Pc(24) int local24 = 256;
		if (arg1) {
			local24 = 131328;
		}
		for (@Pc(32) int local32 = local22; local32 < arg4 + local22; local32++) {
			if (local32 >= 0 && this.anInt2555 > local32) {
				for (@Pc(45) int local45 = local17; local45 < local17 + arg0; local45++) {
					if (local45 >= 0 && this.anInt2564 > local45) {
						this.method1664(local24, local45, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg0 && arg5 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt2563;
		@Pc(29) int local29 = arg3 - this.anInt2559;
		@Pc(34) int local34 = arg5 - this.anInt2563;
		@Pc(39) int local39 = arg0 - this.anInt2559;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local39 + 1 == local29 && local24 == local34 && (this.anIntArrayArray27[local29][local24] & 0x80) == 0) {
					return true;
				}
				if (local39 == local29 && local34 - 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local39 - 1 == local29 && local34 == local24 && (this.anIntArrayArray27[local29][local24] & 0x8) == 0) {
					return true;
				}
				if (local39 == local29 && local34 - 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local39 - 1 == local29 && local24 == local34 && (this.anIntArrayArray27[local29][local24] & 0x8) == 0) {
					return true;
				}
				if (local39 == local29 && local24 == local34 + 1 && (this.anIntArrayArray27[local29][local24] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local29 == local39 + 1 && local24 == local34 && (this.anIntArrayArray27[local29][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local39 && local24 == local34 + 1 && (this.anIntArrayArray27[local29][local24] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (local39 == local29 && local34 + 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x20) == 0) {
				return true;
			}
			if (local29 == local39 && local34 - 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x2) == 0) {
				return true;
			}
			if (local29 == local39 - 1 && local34 == local24 && (this.anIntArrayArray27[local29][local24] & 0x8) == 0) {
				return true;
			}
			if (local39 + 1 == local29 && local24 == local34 && (this.anIntArrayArray27[local29][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	public void method1651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2563;
		@Pc(13) int local13 = arg1 - this.anInt2559;
		this.anIntArrayArray27[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V")
	public void method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2559;
		@Pc(13) int local13 = arg1 - this.anInt2563;
		this.anIntArrayArray27[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(14) int local14 = arg1 + arg5 - 1;
		@Pc(20) int local20 = arg2 + arg4 - 1;
		if (arg3 >= arg5 && local14 >= arg3 && arg4 <= arg0 && arg0 <= local20) {
			return true;
		} else if (arg5 - 1 == arg3 && arg4 <= arg0 && local20 >= arg0 && (this.anIntArrayArray27[arg3 - this.anInt2559][arg0 - this.anInt2563] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == local14 + 1 && arg0 >= arg4 && local20 >= arg0 && (this.anIntArrayArray27[arg3 - this.anInt2559][arg0 - this.anInt2563] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg4 - 1 && arg5 <= arg3 && arg3 <= local14 && (this.anIntArrayArray27[arg3 - this.anInt2559][arg0 - this.anInt2563] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local20 + 1 && arg5 <= arg3 && arg3 <= local14 && (this.anIntArrayArray27[arg3 - this.anInt2559][arg0 - this.anInt2563] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIZII)V")
	public void method1655(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2559;
		@Pc(13) int local13 = arg3 - this.anInt2563;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1664(128, local13, local4);
				this.method1664(8, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1664(2, local13, local4);
				this.method1664(32, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1664(8, local13, local4);
				this.method1664(128, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1664(32, local13, local4);
				this.method1664(2, local13 - 1, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1664(1, local13, local4);
				this.method1664(16, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method1664(4, local13, local4);
				this.method1664(64, local13 + 1, local4 - -1);
			}
			if (arg4 == 2) {
				this.method1664(16, local13, local4);
				this.method1664(1, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1664(64, local13, local4);
				this.method1664(4, local13 - 1, local4 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1664(130, local13, local4);
				this.method1664(8, local13, local4 - 1);
				this.method1664(32, local13 + 1, local4);
			}
			if (arg4 == 1) {
				this.method1664(10, local13, local4);
				this.method1664(32, local13 + 1, local4);
				this.method1664(128, local13, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1664(40, local13, local4);
				this.method1664(128, local13, local4 + 1);
				this.method1664(2, local13 - 1, local4);
			}
			if (arg4 == 3) {
				this.method1664(160, local13, local4);
				this.method1664(2, local13 - 1, local4);
				this.method1664(8, local13, local4 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1664(65536, local13, local4);
				this.method1664(4096, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1664(1024, local13, local4);
				this.method1664(16384, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1664(4096, local13, local4);
				this.method1664(65536, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1664(16384, local13, local4);
				this.method1664(1024, local13 - 1, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1664(512, local13, local4);
				this.method1664(8192, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method1664(2048, local13, local4);
				this.method1664(32768, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1664(8192, local13, local4);
				this.method1664(512, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1664(32768, local13, local4);
				this.method1664(2048, local13 - 1, local4 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1664(66560, local13, local4);
			this.method1664(4096, local13, local4 - 1);
			this.method1664(16384, local13 + 1, local4);
		}
		if (arg4 == 1) {
			this.method1664(5120, local13, local4);
			this.method1664(16384, local13 + 1, local4);
			this.method1664(65536, local13, local4 + 1);
		}
		if (arg4 == 2) {
			this.method1664(20480, local13, local4);
			this.method1664(65536, local13, local4 + 1);
			this.method1664(1024, local13 - 1, local4);
		}
		if (arg4 == 3) {
			this.method1664(81920, local13, local4);
			this.method1664(1024, local13 - 1, local4);
			this.method1664(4096, local13, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZIZ)V")
	public void method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg0 - this.anInt2559;
		@Pc(13) int local13 = arg3 - this.anInt2563;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method1663(local13, local4, 128);
				this.method1663(local13, local4 - 1, 8);
			}
			if (arg1 == 1) {
				this.method1663(local13, local4, 2);
				this.method1663(local13 + 1, local4, 32);
			}
			if (arg1 == 2) {
				this.method1663(local13, local4, 8);
				this.method1663(local13, local4 + 1, 128);
			}
			if (arg1 == 3) {
				this.method1663(local13, local4, 32);
				this.method1663(local13 - 1, local4, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method1663(local13, local4, 1);
				this.method1663(local13 + 1, local4 + -1, 16);
			}
			if (arg1 == 1) {
				this.method1663(local13, local4, 4);
				this.method1663(local13 + 1, local4 + 1, 64);
			}
			if (arg1 == 2) {
				this.method1663(local13, local4, 16);
				this.method1663(local13 - 1, local4 - -1, 1);
			}
			if (arg1 == 3) {
				this.method1663(local13, local4, 64);
				this.method1663(local13 - 1, local4 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method1663(local13, local4, 130);
				this.method1663(local13, local4 - 1, 8);
				this.method1663(local13 + 1, local4, 32);
			}
			if (arg1 == 1) {
				this.method1663(local13, local4, 10);
				this.method1663(local13 + 1, local4, 32);
				this.method1663(local13, local4 + 1, 128);
			}
			if (arg1 == 2) {
				this.method1663(local13, local4, 40);
				this.method1663(local13, local4 + 1, 128);
				this.method1663(local13 - 1, local4, 2);
			}
			if (arg1 == 3) {
				this.method1663(local13, local4, 160);
				this.method1663(local13 - 1, local4, 2);
				this.method1663(local13, local4 - 1, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method1663(local13, local4, 65536);
				this.method1663(local13, local4 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method1663(local13, local4, 1024);
				this.method1663(local13 + 1, local4, 16384);
			}
			if (arg1 == 2) {
				this.method1663(local13, local4, 4096);
				this.method1663(local13, local4 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method1663(local13, local4, 16384);
				this.method1663(local13 - 1, local4, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method1663(local13, local4, 512);
				this.method1663(local13 + 1, local4 - 1, 8192);
			}
			if (arg1 == 1) {
				this.method1663(local13, local4, 2048);
				this.method1663(local13 + 1, local4 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method1663(local13, local4, 8192);
				this.method1663(local13 - 1, local4 + 1, 512);
			}
			if (arg1 == 3) {
				this.method1663(local13, local4, 32768);
				this.method1663(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1663(local13, local4, 66560);
			this.method1663(local13, local4 - 1, 4096);
			this.method1663(local13 + 1, local4, 16384);
		}
		if (arg1 == 1) {
			this.method1663(local13, local4, 5120);
			this.method1663(local13 + 1, local4, 16384);
			this.method1663(local13, local4 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method1663(local13, local4, 20480);
			this.method1663(local13, local4 + 1, 65536);
			this.method1663(local13 - 1, local4, 1024);
		}
		if (arg1 == 3) {
			this.method1663(local13, local4, 81920);
			this.method1663(local13 - 1, local4, 1024);
			this.method1663(local13, local4 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method1658() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2555; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2564; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt2555 - 5 <= local3 || local7 >= this.anInt2564 - 5) {
					this.anIntArrayArray27[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray27[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZII)V")
	public void method1660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - this.anInt2563;
		@Pc(8) int local8 = 256;
		if (arg3) {
			local8 = 131328;
		}
		@Pc(22) int local22;
		if (arg4 == 1 || arg4 == 3) {
			local22 = arg1;
			arg1 = arg5;
			arg5 = local22;
		}
		@Pc(35) int local35 = arg0 - this.anInt2559;
		for (local22 = local35; local22 < local35 + arg1; local22++) {
			if (local22 >= 0 && this.anInt2555 > local22) {
				for (@Pc(63) int local63 = local6; local63 < arg5 + local6; local63++) {
					if (local63 >= 0 && this.anInt2564 > local63) {
						this.method1663(local63, local22, local8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIII)V")
	private void method1663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI)V")
	private void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg1 == arg2) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt2559;
		@Pc(25) int local25 = arg2 - this.anInt2563;
		@Pc(30) int local30 = arg1 - this.anInt2563;
		@Pc(35) int local35 = arg3 - this.anInt2559;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (local35 - 1 == local20 && local30 == local25) {
					return true;
				}
				if (local35 == local20 && local30 + 1 == local25 && (this.anIntArrayArray27[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local20 && local25 == local30 - 1 && (this.anIntArrayArray27[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local35 && local25 == local30 + 1) {
					return true;
				}
				if (local35 - 1 == local20 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local35 + 1 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local20 == local35 + 1 && local30 == local25) {
					return true;
				}
				if (local35 == local20 && local30 + 1 == local25 && (this.anIntArrayArray27[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local20 && local25 == local30 - 1 && (this.anIntArrayArray27[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local20 == local35 && local30 - 1 == local25) {
					return true;
				}
				if (local35 - 1 == local20 && local30 == local25 && (this.anIntArrayArray27[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 + 1 == local20 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				if (local35 - 1 == local20 && local25 == local30) {
					return true;
				}
				if (local35 == local20 && local25 == local30 + 1) {
					return true;
				}
				if (local35 + 1 == local20 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local35 == local20 && local30 - 1 == local25 && (this.anIntArrayArray27[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local35 - 1 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local20 && local25 == local30 + 1) {
					return true;
				}
				if (local35 + 1 == local20 && local25 == local30) {
					return true;
				}
				if (local20 == local35 && local25 == local30 - 1 && (this.anIntArrayArray27[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local20 == local35 - 1 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local20 && local25 == local30 + 1 && (this.anIntArrayArray27[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local35 + 1 && local25 == local30) {
					return true;
				}
				if (local35 == local20 && local30 - 1 == local25) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local20 == local35 - 1 && local25 == local30) {
					return true;
				}
				if (local20 == local35 && local30 + 1 == local25 && (this.anIntArrayArray27[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local35 + 1 && local25 == local30 && (this.anIntArrayArray27[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local35 == local20 && local25 == local30 - 1) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local20 == local35 && local30 + 1 == local25 && (this.anIntArrayArray27[local20][local25] & 0x20) == 0) {
				return true;
			}
			if (local20 == local35 && local25 == local30 - 1 && (this.anIntArrayArray27[local20][local25] & 0x2) == 0) {
				return true;
			}
			if (local20 == local35 - 1 && local30 == local25 && (this.anIntArrayArray27[local20][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 == local35 + 1 && local30 == local25 && (this.anIntArrayArray27[local20][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)V")
	public void method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2563;
		@Pc(18) int local18 = arg0 - this.anInt2559;
		this.anIntArrayArray27[local18][local4] |= 0x40000;
	}
}

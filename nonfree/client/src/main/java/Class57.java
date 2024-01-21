import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class57 {

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	private final int anInt2549 = 0;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	private final int anInt2533 = 0;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	private final int anInt2543;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	private final int anInt2538;

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2543 = arg1;
		this.anInt2538 = arg0;
		this.anIntArrayArray20 = new int[this.anInt2538][this.anInt2543];
		this.method1735();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg4 && arg1 == arg5) {
			return true;
		}
		@Pc(29) int local29 = arg3 - this.anInt2533;
		@Pc(34) int local34 = arg4 - this.anInt2533;
		@Pc(39) int local39 = arg5 - this.anInt2549;
		@Pc(44) int local44 = arg1 - this.anInt2549;
		if (arg0 == 0) {
			if (arg2 == 0) {
				if (local34 == local29 - 1 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1 && (this.anIntArrayArray20[local34][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local34 == local29 && local39 + 1 == local44) {
					return true;
				}
				if (local34 == local29 - 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local29 + 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local34 == local29 + 1 && local39 == local44) {
					return true;
				}
				if (local29 == local34 && local44 == local39 + 1 && (this.anIntArrayArray20[local34][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local29 && local44 == local39 - 1 && (this.anIntArrayArray20[local34][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local34 == local29 && local39 - 1 == local44) {
					return true;
				}
				if (local29 - 1 == local34 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local29 + 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				if (local29 - 1 == local34 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44) {
					return true;
				}
				if (local29 + 1 == local34 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1 && (this.anIntArrayArray20[local34][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local34 == local29 - 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44) {
					return true;
				}
				if (local29 + 1 == local34 && local44 == local39) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1 && (this.anIntArrayArray20[local34][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local34 == local29 - 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 + 1 == local34 && local44 == local39) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local29 - 1 == local34 && local39 == local44) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44 && (this.anIntArrayArray20[local34][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local29 + 1 && local44 == local39 && (this.anIntArrayArray20[local34][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local34 == local29 && local44 == local39 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local34 == local29 && local44 == local39 + 1 && (this.anIntArrayArray20[local34][local44] & 0x20) == 0) {
				return true;
			}
			if (local29 == local34 && local44 == local39 - 1 && (this.anIntArrayArray20[local34][local44] & 0x2) == 0) {
				return true;
			}
			if (local34 == local29 - 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x8) == 0) {
				return true;
			}
			if (local34 == local29 + 1 && local39 == local44 && (this.anIntArrayArray20[local34][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIZZI)V")
	public void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - this.anInt2533;
		@Pc(20) int local20;
		if (arg3 == 1 || arg3 == 3) {
			local20 = arg2;
			arg2 = arg1;
			arg1 = local20;
		}
		@Pc(26) int local26 = 256;
		if (arg4) {
			local26 = 131328;
		}
		@Pc(42) int local42 = arg5 - this.anInt2549;
		for (local20 = local10; local20 < local10 + arg2; local20++) {
			if (local20 >= 0 && this.anInt2538 > local20) {
				for (@Pc(57) int local57 = local42; local57 < local42 + arg1; local57++) {
					if (local57 >= 0 && local57 < this.anInt2543) {
						this.method1743(local57, local20, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public void method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2549;
		@Pc(13) int local13 = arg0 - this.anInt2533;
		this.anIntArrayArray20[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)V")
	public void method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2549;
		@Pc(9) int local9 = arg1 - this.anInt2533;
		this.anIntArrayArray20[local9][local4] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public void method1735() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2538; local13++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt2543; local17++) {
				if (local13 == 0 || local17 == 0 || local13 == this.anInt2538 - 1 || local17 == this.anInt2543 - 1) {
					this.anIntArrayArray20[local13][local17] = 16777215;
				} else {
					this.anIntArrayArray20[local13][local17] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIII)V")
	private void method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray20[arg2][arg1] &= 16777215 - arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg4 - 1;
		@Pc(16) int local16 = arg3 + arg0 - 1;
		if (arg5 >= arg6 && arg5 <= local9 && arg2 >= arg3 && arg2 <= local16) {
			return true;
		} else if (arg5 == arg6 - 1 && arg3 <= arg2 && arg2 <= local16 && (this.anIntArrayArray20[arg5 - this.anInt2533][arg2 - this.anInt2549] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg5 == local9 + 1 && arg3 <= arg2 && arg2 <= local16 && (this.anIntArrayArray20[arg5 - this.anInt2533][arg2 - this.anInt2549] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg3 - 1 && arg6 <= arg5 && local9 >= arg5 && (this.anIntArrayArray20[arg5 - this.anInt2533][arg2 - this.anInt2549] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local16 + 1 && arg6 <= arg5 && local9 >= arg5 && (this.anIntArrayArray20[arg5 - this.anInt2533][arg2 - this.anInt2549] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIIBII)V")
	public void method1739(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - this.anInt2533;
		@Pc(18) int local18 = arg4 - this.anInt2549;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1743(local18, local9, 128);
				this.method1743(local18, local9 - 1, 8);
			}
			if (arg3 == 1) {
				this.method1743(local18, local9, 2);
				this.method1743(local18 + 1, local9, 32);
			}
			if (arg3 == 2) {
				this.method1743(local18, local9, 8);
				this.method1743(local18, local9 + 1, 128);
			}
			if (arg3 == 3) {
				this.method1743(local18, local9, 32);
				this.method1743(local18 - 1, local9, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1743(local18, local9, 1);
				this.method1743(local18 + 1, local9 + -1, 16);
			}
			if (arg3 == 1) {
				this.method1743(local18, local9, 4);
				this.method1743(local18 + 1, local9 + 1, 64);
			}
			if (arg3 == 2) {
				this.method1743(local18, local9, 16);
				this.method1743(local18 - 1, local9 + 1, 1);
			}
			if (arg3 == 3) {
				this.method1743(local18, local9, 64);
				this.method1743(local18 - 1, local9 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method1743(local18, local9, 130);
				this.method1743(local18, local9 - 1, 8);
				this.method1743(local18 + 1, local9, 32);
			}
			if (arg3 == 1) {
				this.method1743(local18, local9, 10);
				this.method1743(local18 + 1, local9, 32);
				this.method1743(local18, local9 + 1, 128);
			}
			if (arg3 == 2) {
				this.method1743(local18, local9, 40);
				this.method1743(local18, local9 + 1, 128);
				this.method1743(local18 - 1, local9, 2);
			}
			if (arg3 == 3) {
				this.method1743(local18, local9, 160);
				this.method1743(local18 - 1, local9, 2);
				this.method1743(local18, local9 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1743(local18, local9, 65536);
				this.method1743(local18, local9 - 1, 4096);
			}
			if (arg3 == 1) {
				this.method1743(local18, local9, 1024);
				this.method1743(local18 + 1, local9, 16384);
			}
			if (arg3 == 2) {
				this.method1743(local18, local9, 4096);
				this.method1743(local18, local9 + 1, 65536);
			}
			if (arg3 == 3) {
				this.method1743(local18, local9, 16384);
				this.method1743(local18 - 1, local9, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1743(local18, local9, 512);
				this.method1743(local18 + 1, local9 + -1, 8192);
			}
			if (arg3 == 1) {
				this.method1743(local18, local9, 2048);
				this.method1743(local18 + 1, local9 - -1, 32768);
			}
			if (arg3 == 2) {
				this.method1743(local18, local9, 8192);
				this.method1743(local18 - 1, local9 + 1, 512);
			}
			if (arg3 == 3) {
				this.method1743(local18, local9, 32768);
				this.method1743(local18 - 1, local9 - 1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1743(local18, local9, 66560);
			this.method1743(local18, local9 - 1, 4096);
			this.method1743(local18 + 1, local9, 16384);
		}
		if (arg3 == 1) {
			this.method1743(local18, local9, 5120);
			this.method1743(local18 + 1, local9, 16384);
			this.method1743(local18, local9 + 1, 65536);
		}
		if (arg3 == 2) {
			this.method1743(local18, local9, 20480);
			this.method1743(local18, local9 + 1, 65536);
			this.method1743(local18 - 1, local9, 1024);
		}
		if (arg3 == 3) {
			this.method1743(local18, local9, 81920);
			this.method1743(local18 - 1, local9, 1024);
			this.method1743(local18, local9 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIZIZ)V")
	public void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg5 - this.anInt2533;
		@Pc(15) int local15 = arg1 - this.anInt2549;
		@Pc(27) int local27;
		if (arg2 == 1 || arg2 == 3) {
			local27 = arg3;
			arg3 = arg0;
			arg0 = local27;
		}
		@Pc(37) int local37 = 256;
		if (arg4) {
			local37 = 131328;
		}
		for (local27 = local10; local27 < local10 + arg3; local27++) {
			if (local27 >= 0 && local27 < this.anInt2538) {
				for (@Pc(55) int local55 = local15; local55 < local15 + arg0; local55++) {
					if (local55 >= 0 && this.anInt2543 > local55) {
						this.method1736(local37, local55, local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIBII)Z")
	public boolean method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg4 && arg2 == arg1) {
			return true;
		}
		@Pc(21) int local21 = arg1 - this.anInt2549;
		@Pc(26) int local26 = arg2 - this.anInt2549;
		@Pc(31) int local31 = arg4 - this.anInt2533;
		@Pc(36) int local36 = arg5 - this.anInt2533;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local36 == local31 + 1 && local26 == local21 && (this.anIntArrayArray20[local36][local26] & 0x80) == 0) {
					return true;
				}
				if (local31 == local36 && local26 == local21 - 1 && (this.anIntArrayArray20[local36][local26] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local31 - 1 == local36 && local26 == local21 && (this.anIntArrayArray20[local36][local26] & 0x8) == 0) {
					return true;
				}
				if (local36 == local31 && local26 == local21 - 1 && (this.anIntArrayArray20[local36][local26] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local31 - 1 == local36 && local26 == local21 && (this.anIntArrayArray20[local36][local26] & 0x8) == 0) {
					return true;
				}
				if (local31 == local36 && local26 == local21 + 1 && (this.anIntArrayArray20[local36][local26] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local31 + 1 == local36 && local21 == local26 && (this.anIntArrayArray20[local36][local26] & 0x80) == 0) {
					return true;
				}
				if (local36 == local31 && local26 == local21 + 1 && (this.anIntArrayArray20[local36][local26] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local31 == local36 && local21 + 1 == local26 && (this.anIntArrayArray20[local36][local26] & 0x20) == 0) {
				return true;
			}
			if (local31 == local36 && local21 - 1 == local26 && (this.anIntArrayArray20[local36][local26] & 0x2) == 0) {
				return true;
			}
			if (local31 - 1 == local36 && local21 == local26 && (this.anIntArrayArray20[local36][local26] & 0x8) == 0) {
				return true;
			}
			if (local31 + 1 == local36 && local21 == local26 && (this.anIntArrayArray20[local36][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIB)V")
	private void method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray20[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZIII)V")
	public void method1744(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt2533;
		@Pc(13) int local13 = arg2 - this.anInt2549;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method1736(128, local13, local4);
				this.method1736(8, local13, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1736(2, local13, local4);
				this.method1736(32, local13 + 1, local4);
			}
			if (arg0 == 2) {
				this.method1736(8, local13, local4);
				this.method1736(128, local13, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1736(32, local13, local4);
				this.method1736(2, local13 - 1, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method1736(1, local13, local4);
				this.method1736(16, local13 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method1736(4, local13, local4);
				this.method1736(64, local13 + 1, local4 - -1);
			}
			if (arg0 == 2) {
				this.method1736(16, local13, local4);
				this.method1736(1, local13 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1736(64, local13, local4);
				this.method1736(4, local13 - 1, local4 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method1736(130, local13, local4);
				this.method1736(8, local13, local4 - 1);
				this.method1736(32, local13 + 1, local4);
			}
			if (arg0 == 1) {
				this.method1736(10, local13, local4);
				this.method1736(32, local13 + 1, local4);
				this.method1736(128, local13, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1736(40, local13, local4);
				this.method1736(128, local13, local4 + 1);
				this.method1736(2, local13 - 1, local4);
			}
			if (arg0 == 3) {
				this.method1736(160, local13, local4);
				this.method1736(2, local13 - 1, local4);
				this.method1736(8, local13, local4 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method1736(65536, local13, local4);
				this.method1736(4096, local13, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1736(1024, local13, local4);
				this.method1736(16384, local13 + 1, local4);
			}
			if (arg0 == 2) {
				this.method1736(4096, local13, local4);
				this.method1736(65536, local13, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1736(16384, local13, local4);
				this.method1736(1024, local13 - 1, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method1736(512, local13, local4);
				this.method1736(8192, local13 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method1736(2048, local13, local4);
				this.method1736(32768, local13 + 1, local4 - -1);
			}
			if (arg0 == 2) {
				this.method1736(8192, local13, local4);
				this.method1736(512, local13 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1736(32768, local13, local4);
				this.method1736(2048, local13 - 1, local4 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1736(66560, local13, local4);
			this.method1736(4096, local13, local4 - 1);
			this.method1736(16384, local13 + 1, local4);
		}
		if (arg0 == 1) {
			this.method1736(5120, local13, local4);
			this.method1736(16384, local13 + 1, local4);
			this.method1736(65536, local13, local4 + 1);
		}
		if (arg0 == 2) {
			this.method1736(20480, local13, local4);
			this.method1736(65536, local13, local4 + 1);
			this.method1736(1024, local13 - 1, local4);
		}
		if (arg0 == 3) {
			this.method1736(81920, local13, local4);
			this.method1736(1024, local13 - 1, local4);
			this.method1736(4096, local13, local4 - 1);
			return;
		}
	}
}

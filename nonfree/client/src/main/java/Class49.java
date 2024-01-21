import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class49 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private final int anInt2156;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	private final int anInt2169;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	private final int anInt2159;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	private final int anInt2158;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2156 = arg1;
		this.anInt2169 = 0;
		this.anInt2159 = 0;
		this.anInt2158 = arg0;
		this.anIntArrayArray56 = new int[this.anInt2158][this.anInt2156];
		this.method1529();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method1522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg1 && arg5 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt2159;
		@Pc(25) int local25 = arg1 - this.anInt2159;
		@Pc(30) int local30 = arg3 - this.anInt2169;
		@Pc(35) int local35 = arg5 - this.anInt2169;
		if (arg0 == 0) {
			if (arg4 == 0) {
				if (local25 - 1 == local20 && local30 == local35) {
					return true;
				}
				if (local25 == local20 && local30 == local35 + 1 && (this.anIntArrayArray56[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local35 - 1 && (this.anIntArrayArray56[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local25 == local20 && local30 == local35 + 1) {
					return true;
				}
				if (local25 - 1 == local20 && local30 == local35 && (this.anIntArrayArray56[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local35 == local30 && (this.anIntArrayArray56[local20][local30] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local20 == local25 + 1 && local35 == local30) {
					return true;
				}
				if (local20 == local25 && local30 == local35 + 1 && (this.anIntArrayArray56[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local35 - 1 && (this.anIntArrayArray56[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local20 == local25 && local30 == local35 - 1) {
					return true;
				}
				if (local20 == local25 - 1 && local30 == local35 && (this.anIntArrayArray56[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local30 == local35 && (this.anIntArrayArray56[local20][local30] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				if (local25 - 1 == local20 && local30 == local35) {
					return true;
				}
				if (local20 == local25 && local35 + 1 == local30) {
					return true;
				}
				if (local25 + 1 == local20 && local35 == local30 && (this.anIntArrayArray56[local20][local30] & 0x1280180) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local35 - 1 && (this.anIntArrayArray56[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local20 == local25 - 1 && local30 == local35 && (this.anIntArrayArray56[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local35 + 1) {
					return true;
				}
				if (local25 + 1 == local20 && local35 == local30) {
					return true;
				}
				if (local20 == local25 && local35 - 1 == local30 && (this.anIntArrayArray56[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local20 == local25 - 1 && local35 == local30 && (this.anIntArrayArray56[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local20 && local35 + 1 == local30 && (this.anIntArrayArray56[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local35 == local30) {
					return true;
				}
				if (local20 == local25 && local30 == local35 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local25 - 1 == local20 && local30 == local35) {
					return true;
				}
				if (local25 == local20 && local30 == local35 + 1 && (this.anIntArrayArray56[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local30 == local35 && (this.anIntArrayArray56[local20][local30] & 0x1280180) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local35 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local25 == local20 && local30 == local35 + 1 && (this.anIntArrayArray56[local20][local30] & 0x20) == 0) {
				return true;
			}
			if (local20 == local25 && local30 == local35 - 1 && (this.anIntArrayArray56[local20][local30] & 0x2) == 0) {
				return true;
			}
			if (local25 - 1 == local20 && local35 == local30 && (this.anIntArrayArray56[local20][local30] & 0x8) == 0) {
				return true;
			}
			if (local20 == local25 + 1 && local35 == local30 && (this.anIntArrayArray56[local20][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
	private void method1523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray56[arg2][arg0] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg2 && arg3 == arg1) {
			return true;
		}
		@Pc(29) int local29 = arg2 - this.anInt2159;
		@Pc(34) int local34 = arg0 - this.anInt2159;
		@Pc(39) int local39 = arg1 - this.anInt2169;
		@Pc(44) int local44 = arg3 - this.anInt2169;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local29 == local34 + 1 && local44 == local39 && (this.anIntArrayArray56[local29][local39] & 0x80) == 0) {
					return true;
				}
				if (local29 == local34 && local39 == local44 - 1 && (this.anIntArrayArray56[local29][local39] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local29 == local34 - 1 && local39 == local44 && (this.anIntArrayArray56[local29][local39] & 0x8) == 0) {
					return true;
				}
				if (local29 == local34 && local39 == local44 - 1 && (this.anIntArrayArray56[local29][local39] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local29 == local34 - 1 && local44 == local39 && (this.anIntArrayArray56[local29][local39] & 0x8) == 0) {
					return true;
				}
				if (local34 == local29 && local39 == local44 + 1 && (this.anIntArrayArray56[local29][local39] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local34 + 1 == local29 && local44 == local39 && (this.anIntArrayArray56[local29][local39] & 0x80) == 0) {
					return true;
				}
				if (local29 == local34 && local44 + 1 == local39 && (this.anIntArrayArray56[local29][local39] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local29 == local34 && local39 == local44 + 1 && (this.anIntArrayArray56[local29][local39] & 0x20) == 0) {
				return true;
			}
			if (local34 == local29 && local39 == local44 - 1 && (this.anIntArrayArray56[local29][local39] & 0x2) == 0) {
				return true;
			}
			if (local34 - 1 == local29 && local39 == local44 && (this.anIntArrayArray56[local29][local39] & 0x8) == 0) {
				return true;
			}
			if (local29 == local34 + 1 && local39 == local44 && (this.anIntArrayArray56[local29][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	public void method1525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2169;
		@Pc(13) int local13 = arg0 - this.anInt2159;
		this.anIntArrayArray56[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIII)V")
	private void method1526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray56[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg0 - 1;
		@Pc(16) int local16 = arg5 + arg4 - 1;
		if (arg0 <= arg3 && arg3 <= local9 && arg5 <= arg2 && local16 >= arg2) {
			return true;
		} else if (arg3 == arg0 - 1 && arg5 <= arg2 && local16 >= arg2 && (this.anIntArrayArray56[arg3 - this.anInt2159][arg2 - this.anInt2169] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == local9 + 1 && arg5 <= arg2 && local16 >= arg2 && (this.anIntArrayArray56[arg3 - this.anInt2159][arg2 - this.anInt2169] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg5 - 1 && arg3 >= arg0 && arg3 <= local9 && (this.anIntArrayArray56[arg3 - this.anInt2159][arg2 - this.anInt2169] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local16 + 1 && arg3 >= arg0 && local9 >= arg3 && (this.anIntArrayArray56[arg3 - this.anInt2159][arg2 - this.anInt2169] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method1529() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2158; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2156; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt2158 - 1 == local3 || local7 == this.anInt2156 - 1) {
					this.anIntArrayArray56[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray56[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V")
	public void method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2159;
		@Pc(17) int local17 = arg1 - this.anInt2169;
		this.anIntArrayArray56[local8][local17] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIIIII)V")
	public void method1531(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg1 - this.anInt2159;
		@Pc(13) int local13 = arg3 - this.anInt2169;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1526(128, local8, local13);
				this.method1526(8, local8 - 1, local13);
			}
			if (arg4 == 1) {
				this.method1526(2, local8, local13);
				this.method1526(32, local8, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1526(8, local8, local13);
				this.method1526(128, local8 + 1, local13);
			}
			if (arg4 == 3) {
				this.method1526(32, local8, local13);
				this.method1526(2, local8, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1526(1, local8, local13);
				this.method1526(16, local8 - 1, local13 + 1);
			}
			if (arg4 == 1) {
				this.method1526(4, local8, local13);
				this.method1526(64, local8 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1526(16, local8, local13);
				this.method1526(1, local8 + 1, local13 + -1);
			}
			if (arg4 == 3) {
				this.method1526(64, local8, local13);
				this.method1526(4, local8 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method1526(130, local8, local13);
				this.method1526(8, local8 - 1, local13);
				this.method1526(32, local8, local13 + 1);
			}
			if (arg4 == 1) {
				this.method1526(10, local8, local13);
				this.method1526(32, local8, local13 + 1);
				this.method1526(128, local8 + 1, local13);
			}
			if (arg4 == 2) {
				this.method1526(40, local8, local13);
				this.method1526(128, local8 + 1, local13);
				this.method1526(2, local8, local13 - 1);
			}
			if (arg4 == 3) {
				this.method1526(160, local8, local13);
				this.method1526(2, local8, local13 - 1);
				this.method1526(8, local8 - 1, local13);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1526(65536, local8, local13);
				this.method1526(4096, local8 - 1, local13);
			}
			if (arg4 == 1) {
				this.method1526(1024, local8, local13);
				this.method1526(16384, local8, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1526(4096, local8, local13);
				this.method1526(65536, local8 + 1, local13);
			}
			if (arg4 == 3) {
				this.method1526(16384, local8, local13);
				this.method1526(1024, local8, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1526(512, local8, local13);
				this.method1526(8192, local8 - 1, local13 + 1);
			}
			if (arg4 == 1) {
				this.method1526(2048, local8, local13);
				this.method1526(32768, local8 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1526(8192, local8, local13);
				this.method1526(512, local8 + 1, local13 + -1);
			}
			if (arg4 == 3) {
				this.method1526(32768, local8, local13);
				this.method1526(2048, local8 - 1, local13 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1526(66560, local8, local13);
			this.method1526(4096, local8 - 1, local13);
			this.method1526(16384, local8, local13 + 1);
		}
		if (arg4 == 1) {
			this.method1526(5120, local8, local13);
			this.method1526(16384, local8, local13 + 1);
			this.method1526(65536, local8 + 1, local13);
		}
		if (arg4 == 2) {
			this.method1526(20480, local8, local13);
			this.method1526(65536, local8 + 1, local13);
			this.method1526(1024, local8, local13 - 1);
		}
		if (arg4 == 3) {
			this.method1526(81920, local8, local13);
			this.method1526(1024, local8, local13 - 1);
			this.method1526(4096, local8 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIIII)V")
	public void method1532(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt2169;
		@Pc(19) int local19 = arg2 - this.anInt2159;
		@Pc(21) int local21 = 256;
		@Pc(33) int local33;
		if (arg4 == 1 || arg4 == 3) {
			local33 = arg3;
			arg3 = arg5;
			arg5 = local33;
		}
		if (arg1) {
			local21 = 131328;
		}
		for (local33 = local19; local33 < arg3 + local19; local33++) {
			if (local33 >= 0 && local33 < this.anInt2158) {
				for (@Pc(59) int local59 = local6; local59 < arg5 + local6; local59++) {
					if (local59 >= 0 && this.anInt2156 > local59) {
						this.method1523(local59, local21, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIIII)V")
	public void method1533(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 - this.anInt2159;
		@Pc(13) int local13 = arg3 - this.anInt2169;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1523(local13, 128, local8);
				this.method1523(local13, 8, local8 - 1);
			}
			if (arg2 == 1) {
				this.method1523(local13, 2, local8);
				this.method1523(local13 + 1, 32, local8);
			}
			if (arg2 == 2) {
				this.method1523(local13, 8, local8);
				this.method1523(local13, 128, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1523(local13, 32, local8);
				this.method1523(local13 - 1, 2, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1523(local13, 1, local8);
				this.method1523(local13 + 1, 16, local8 - 1);
			}
			if (arg2 == 1) {
				this.method1523(local13, 4, local8);
				this.method1523(local13 + 1, 64, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1523(local13, 16, local8);
				this.method1523(local13 - 1, 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1523(local13, 64, local8);
				this.method1523(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method1523(local13, 130, local8);
				this.method1523(local13, 8, local8 - 1);
				this.method1523(local13 + 1, 32, local8);
			}
			if (arg2 == 1) {
				this.method1523(local13, 10, local8);
				this.method1523(local13 + 1, 32, local8);
				this.method1523(local13, 128, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1523(local13, 40, local8);
				this.method1523(local13, 128, local8 + 1);
				this.method1523(local13 - 1, 2, local8);
			}
			if (arg2 == 3) {
				this.method1523(local13, 160, local8);
				this.method1523(local13 - 1, 2, local8);
				this.method1523(local13, 8, local8 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1523(local13, 65536, local8);
				this.method1523(local13, 4096, local8 - 1);
			}
			if (arg2 == 1) {
				this.method1523(local13, 1024, local8);
				this.method1523(local13 + 1, 16384, local8);
			}
			if (arg2 == 2) {
				this.method1523(local13, 4096, local8);
				this.method1523(local13, 65536, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1523(local13, 16384, local8);
				this.method1523(local13 - 1, 1024, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1523(local13, 512, local8);
				this.method1523(local13 + 1, 8192, local8 - 1);
			}
			if (arg2 == 1) {
				this.method1523(local13, 2048, local8);
				this.method1523(local13 + 1, 32768, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1523(local13, 8192, local8);
				this.method1523(local13 - 1, 512, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1523(local13, 32768, local8);
				this.method1523(local13 - 1, 2048, local8 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1523(local13, 66560, local8);
			this.method1523(local13, 4096, local8 - 1);
			this.method1523(local13 + 1, 16384, local8);
		}
		if (arg2 == 1) {
			this.method1523(local13, 5120, local8);
			this.method1523(local13 + 1, 16384, local8);
			this.method1523(local13, 65536, local8 + 1);
		}
		if (arg2 == 2) {
			this.method1523(local13, 20480, local8);
			this.method1523(local13, 65536, local8 + 1);
			this.method1523(local13 - 1, 1024, local8);
		}
		if (arg2 == 3) {
			this.method1523(local13, 81920, local8);
			this.method1523(local13 - 1, 1024, local8);
			this.method1523(local13, 4096, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZIII)V")
	public void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - this.anInt2159;
		@Pc(22) int local22;
		if (arg3 == 1 || arg3 == 3) {
			local22 = arg4;
			arg4 = arg5;
			arg5 = local22;
		}
		@Pc(28) int local28 = 256;
		@Pc(33) int local33 = arg1 - this.anInt2169;
		if (arg2) {
			local28 = 131328;
		}
		for (local22 = local10; local22 < local10 + arg4; local22++) {
			if (local22 >= 0 && local22 < this.anInt2158) {
				for (@Pc(56) int local56 = local33; local56 < arg5 + local33; local56++) {
					if (local56 >= 0 && local56 < this.anInt2156) {
						this.method1526(local28, local22, local56);
					}
				}
			}
		}
	}
}

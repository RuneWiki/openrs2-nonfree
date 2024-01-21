import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class22 {

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	private final int anInt1593;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	private final int anInt1594;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	private final int anInt1587;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	private final int anInt1595;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "[[I")
	public final int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(II)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1593 = arg1;
		this.anInt1594 = arg0;
		this.anInt1587 = 0;
		this.anInt1595 = 0;
		this.anIntArrayArray45 = new int[this.anInt1594][this.anInt1593];
		this.method1045();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZII)V")
	private void method1041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray45[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public void method1044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1595;
		@Pc(9) int local9 = arg0 - this.anInt1587;
		this.anIntArrayArray45[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public void method1045() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1594; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1593; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt1594 - 5 <= local7 || local11 >= this.anInt1593 - 5) {
					this.anIntArrayArray45[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray45[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBZIII)V")
	public void method1047(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg0 - this.anInt1595;
		@Pc(21) int local21 = arg3 - this.anInt1587;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1041(local16, 128, local21);
				this.method1041(local16, 8, local21 - 1);
			}
			if (arg4 == 1) {
				this.method1041(local16, 2, local21);
				this.method1041(local16 + 1, 32, local21);
			}
			if (arg4 == 2) {
				this.method1041(local16, 8, local21);
				this.method1041(local16, 128, local21 + 1);
			}
			if (arg4 == 3) {
				this.method1041(local16, 32, local21);
				this.method1041(local16 - 1, 2, local21);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1041(local16, 1, local21);
				this.method1041(local16 + 1, 16, local21 - 1);
			}
			if (arg4 == 1) {
				this.method1041(local16, 4, local21);
				this.method1041(local16 + 1, 64, local21 + 1);
			}
			if (arg4 == 2) {
				this.method1041(local16, 16, local21);
				this.method1041(local16 - 1, 1, local21 + 1);
			}
			if (arg4 == 3) {
				this.method1041(local16, 64, local21);
				this.method1041(local16 - 1, 4, local21 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method1041(local16, 130, local21);
				this.method1041(local16, 8, local21 - 1);
				this.method1041(local16 + 1, 32, local21);
			}
			if (arg4 == 1) {
				this.method1041(local16, 10, local21);
				this.method1041(local16 + 1, 32, local21);
				this.method1041(local16, 128, local21 + 1);
			}
			if (arg4 == 2) {
				this.method1041(local16, 40, local21);
				this.method1041(local16, 128, local21 + 1);
				this.method1041(local16 - 1, 2, local21);
			}
			if (arg4 == 3) {
				this.method1041(local16, 160, local21);
				this.method1041(local16 - 1, 2, local21);
				this.method1041(local16, 8, local21 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1041(local16, 65536, local21);
				this.method1041(local16, 4096, local21 - 1);
			}
			if (arg4 == 1) {
				this.method1041(local16, 1024, local21);
				this.method1041(local16 + 1, 16384, local21);
			}
			if (arg4 == 2) {
				this.method1041(local16, 4096, local21);
				this.method1041(local16, 65536, local21 + 1);
			}
			if (arg4 == 3) {
				this.method1041(local16, 16384, local21);
				this.method1041(local16 - 1, 1024, local21);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1041(local16, 512, local21);
				this.method1041(local16 + 1, 8192, local21 - 1);
			}
			if (arg4 == 1) {
				this.method1041(local16, 2048, local21);
				this.method1041(local16 + 1, 32768, local21 + 1);
			}
			if (arg4 == 2) {
				this.method1041(local16, 8192, local21);
				this.method1041(local16 - 1, 512, local21 + 1);
			}
			if (arg4 == 3) {
				this.method1041(local16, 32768, local21);
				this.method1041(local16 - 1, 2048, local21 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1041(local16, 66560, local21);
			this.method1041(local16, 4096, local21 - 1);
			this.method1041(local16 + 1, 16384, local21);
		}
		if (arg4 == 1) {
			this.method1041(local16, 5120, local21);
			this.method1041(local16 + 1, 16384, local21);
			this.method1041(local16, 65536, local21 + 1);
		}
		if (arg4 == 2) {
			this.method1041(local16, 20480, local21);
			this.method1041(local16, 65536, local21 + 1);
			this.method1041(local16 - 1, 1024, local21);
		}
		if (arg4 == 3) {
			this.method1041(local16, 81920, local21);
			this.method1041(local16 - 1, 1024, local21);
			this.method1041(local16, 4096, local21 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	public void method1048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1595;
		@Pc(9) int local9 = arg1 - this.anInt1587;
		this.anIntArrayArray45[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZIIII)Z")
	public boolean method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg0 + arg5 - 1;
		@Pc(16) int local16 = arg2 + arg6 - 1;
		if (arg3 >= arg6 && local16 >= arg3 && arg4 >= arg5 && arg4 <= local10) {
			return true;
		} else if (arg6 - 1 == arg3 && arg5 <= arg4 && arg4 <= local10 && (this.anIntArrayArray45[arg3 - this.anInt1587][arg4 - this.anInt1595] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg3 == local16 + 1 && arg4 >= arg5 && arg4 <= local10 && (this.anIntArrayArray45[arg3 - this.anInt1587][arg4 - this.anInt1595] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg4 && arg3 >= arg6 && arg3 <= local16 && (this.anIntArrayArray45[arg3 - this.anInt1587][arg4 - this.anInt1595] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local10 + 1 && arg3 >= arg6 && arg3 <= local16 && (this.anIntArrayArray45[arg3 - this.anInt1587][arg4 - this.anInt1595] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIZI)V")
	public void method1051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int local4 = arg3 - this.anInt1587;
		@Pc(9) int local9 = arg1 - this.anInt1595;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1054(local4, local9, 128);
				this.method1054(local4 - 1, local9, 8);
			}
			if (arg2 == 1) {
				this.method1054(local4, local9, 2);
				this.method1054(local4, local9 + 1, 32);
			}
			if (arg2 == 2) {
				this.method1054(local4, local9, 8);
				this.method1054(local4 + 1, local9, 128);
			}
			if (arg2 == 3) {
				this.method1054(local4, local9, 32);
				this.method1054(local4, local9 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1054(local4, local9, 1);
				this.method1054(local4 - 1, local9 - -1, 16);
			}
			if (arg2 == 1) {
				this.method1054(local4, local9, 4);
				this.method1054(local4 + 1, local9 - -1, 64);
			}
			if (arg2 == 2) {
				this.method1054(local4, local9, 16);
				this.method1054(local4 + 1, local9 + -1, 1);
			}
			if (arg2 == 3) {
				this.method1054(local4, local9, 64);
				this.method1054(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1054(local4, local9, 130);
				this.method1054(local4 - 1, local9, 8);
				this.method1054(local4, local9 + 1, 32);
			}
			if (arg2 == 1) {
				this.method1054(local4, local9, 10);
				this.method1054(local4, local9 + 1, 32);
				this.method1054(local4 + 1, local9, 128);
			}
			if (arg2 == 2) {
				this.method1054(local4, local9, 40);
				this.method1054(local4 + 1, local9, 128);
				this.method1054(local4, local9 - 1, 2);
			}
			if (arg2 == 3) {
				this.method1054(local4, local9, 160);
				this.method1054(local4, local9 - 1, 2);
				this.method1054(local4 - 1, local9, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1054(local4, local9, 65536);
				this.method1054(local4 - 1, local9, 4096);
			}
			if (arg2 == 1) {
				this.method1054(local4, local9, 1024);
				this.method1054(local4, local9 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method1054(local4, local9, 4096);
				this.method1054(local4 + 1, local9, 65536);
			}
			if (arg2 == 3) {
				this.method1054(local4, local9, 16384);
				this.method1054(local4, local9 - 1, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1054(local4, local9, 512);
				this.method1054(local4 - 1, local9 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method1054(local4, local9, 2048);
				this.method1054(local4 + 1, local9 - -1, 32768);
			}
			if (arg2 == 2) {
				this.method1054(local4, local9, 8192);
				this.method1054(local4 + 1, local9 - 1, 512);
			}
			if (arg2 == 3) {
				this.method1054(local4, local9, 32768);
				this.method1054(local4 - 1, local9 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1054(local4, local9, 66560);
			this.method1054(local4 - 1, local9, 4096);
			this.method1054(local4, local9 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method1054(local4, local9, 5120);
			this.method1054(local4, local9 + 1, 16384);
			this.method1054(local4 + 1, local9, 65536);
		}
		if (arg2 == 2) {
			this.method1054(local4, local9, 20480);
			this.method1054(local4 + 1, local9, 65536);
			this.method1054(local4, local9 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method1054(local4, local9, 81920);
			this.method1054(local4, local9 - 1, 1024);
			this.method1054(local4 - 1, local9, 4096);
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
	public void method1052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1587;
		@Pc(17) int local17 = arg0 - this.anInt1595;
		this.anIntArrayArray45[local4][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIZ)V")
	public void method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(15) int local15 = arg3 - this.anInt1587;
		@Pc(20) int local20 = arg0 - this.anInt1595;
		@Pc(22) int local22 = 256;
		if (arg4) {
			local22 = 131328;
		}
		for (@Pc(30) int local30 = local15; local30 < arg2 + local15; local30++) {
			if (local30 >= 0 && this.anInt1594 > local30) {
				for (@Pc(43) int local43 = local20; local43 < local20 + arg1; local43++) {
					if (local43 >= 0 && this.anInt1593 > local43) {
						this.method1041(local43, local22, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
	private void method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray45[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg2 && arg1 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg5 - this.anInt1587;
		@Pc(21) int local21 = arg2 - this.anInt1587;
		@Pc(26) int local26 = arg3 - this.anInt1595;
		@Pc(31) int local31 = arg1 - this.anInt1595;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local16 == local21 + 1 && local26 == local31 && (this.anIntArrayArray45[local16][local31] & 0x80) == 0) {
					return true;
				}
				if (local21 == local16 && local31 == local26 - 1 && (this.anIntArrayArray45[local16][local31] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local21 - 1 == local16 && local31 == local26 && (this.anIntArrayArray45[local16][local31] & 0x8) == 0) {
					return true;
				}
				if (local21 == local16 && local26 - 1 == local31 && (this.anIntArrayArray45[local16][local31] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local21 - 1 == local16 && local26 == local31 && (this.anIntArrayArray45[local16][local31] & 0x8) == 0) {
					return true;
				}
				if (local21 == local16 && local26 + 1 == local31 && (this.anIntArrayArray45[local16][local31] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local21 + 1 == local16 && local26 == local31 && (this.anIntArrayArray45[local16][local31] & 0x80) == 0) {
					return true;
				}
				if (local21 == local16 && local31 == local26 + 1 && (this.anIntArrayArray45[local16][local31] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local21 == local16 && local26 + 1 == local31 && (this.anIntArrayArray45[local16][local31] & 0x20) == 0) {
				return true;
			}
			if (local21 == local16 && local26 - 1 == local31 && (this.anIntArrayArray45[local16][local31] & 0x2) == 0) {
				return true;
			}
			if (local16 == local21 - 1 && local26 == local31 && (this.anIntArrayArray45[local16][local31] & 0x8) == 0) {
				return true;
			}
			if (local21 + 1 == local16 && local26 == local31 && (this.anIntArrayArray45[local16][local31] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIIIBI)V")
	public void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt1587;
		@Pc(20) int local20 = arg5 - this.anInt1595;
		@Pc(22) int local22 = 256;
		if (arg1) {
			local22 = 131328;
		}
		@Pc(36) int local36;
		if (arg2 == 1 || arg2 == 3) {
			local36 = arg3;
			arg3 = arg4;
			arg4 = local36;
		}
		for (local36 = local6; local36 < arg3 + local6; local36++) {
			if (local36 >= 0 && this.anInt1594 > local36) {
				for (@Pc(55) int local55 = local20; local55 < local20 + arg4; local55++) {
					if (local55 >= 0 && this.anInt1593 > local55) {
						this.method1054(local36, local55, local22);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg1 && arg3 == arg0) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt1587;
		@Pc(25) int local25 = arg3 - this.anInt1595;
		@Pc(30) int local30 = arg1 - this.anInt1587;
		@Pc(35) int local35 = arg0 - this.anInt1595;
		if (arg4 == 0) {
			if (arg5 == 0) {
				if (local30 == local20 - 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray45[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local20 == local30 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray45[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local20 + 1 == local30 && local25 == local35) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray45[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local20 == local30 && local35 - 1 == local25) {
					return true;
				}
				if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray45[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				if (local20 - 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1) {
					return true;
				}
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray45[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local30 == local20 - 1 && local35 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray45[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local30 == local20 - 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray45[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35 && (this.anIntArrayArray45[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray45[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray45[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray45[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

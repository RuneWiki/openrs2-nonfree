import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class58 {

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private final int anInt2636 = 0;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private final int anInt2635;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	private final int anInt2644;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	private final int anInt2641;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2635 = arg1;
		this.anInt2644 = 0;
		this.anInt2641 = arg0;
		this.anIntArrayArray20 = new int[this.anInt2641][this.anInt2635];
		this.method1993();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZZIII)V")
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2636;
		@Pc(13) int local13 = arg0 - this.anInt2644;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1985(128, local13, local4);
				this.method1985(8, local13, local4 - 1);
			}
			if (arg3 == 1) {
				this.method1985(2, local13, local4);
				this.method1985(32, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method1985(8, local13, local4);
				this.method1985(128, local13, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1985(32, local13, local4);
				this.method1985(2, local13 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1985(1, local13, local4);
				this.method1985(16, local13 + 1, local4 - 1);
			}
			if (arg3 == 1) {
				this.method1985(4, local13, local4);
				this.method1985(64, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1985(16, local13, local4);
				this.method1985(1, local13 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1985(64, local13, local4);
				this.method1985(4, local13 - 1, local4 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method1985(130, local13, local4);
				this.method1985(8, local13, local4 - 1);
				this.method1985(32, local13 + 1, local4);
			}
			if (arg3 == 1) {
				this.method1985(10, local13, local4);
				this.method1985(32, local13 + 1, local4);
				this.method1985(128, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1985(40, local13, local4);
				this.method1985(128, local13, local4 + 1);
				this.method1985(2, local13 - 1, local4);
			}
			if (arg3 == 3) {
				this.method1985(160, local13, local4);
				this.method1985(2, local13 - 1, local4);
				this.method1985(8, local13, local4 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1985(65536, local13, local4);
				this.method1985(4096, local13, local4 - 1);
			}
			if (arg3 == 1) {
				this.method1985(1024, local13, local4);
				this.method1985(16384, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method1985(4096, local13, local4);
				this.method1985(65536, local13, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1985(16384, local13, local4);
				this.method1985(1024, local13 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1985(512, local13, local4);
				this.method1985(8192, local13 + 1, local4 - 1);
			}
			if (arg3 == 1) {
				this.method1985(2048, local13, local4);
				this.method1985(32768, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1985(8192, local13, local4);
				this.method1985(512, local13 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1985(32768, local13, local4);
				this.method1985(2048, local13 - 1, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1985(66560, local13, local4);
			this.method1985(4096, local13, local4 - 1);
			this.method1985(16384, local13 + 1, local4);
		}
		if (arg3 == 1) {
			this.method1985(5120, local13, local4);
			this.method1985(16384, local13 + 1, local4);
			this.method1985(65536, local13, local4 + 1);
		}
		if (arg3 == 2) {
			this.method1985(20480, local13, local4);
			this.method1985(65536, local13, local4 + 1);
			this.method1985(1024, local13 - 1, local4);
		}
		if (arg3 == 3) {
			this.method1985(81920, local13, local4);
			this.method1985(1024, local13 - 1, local4);
			this.method1985(4096, local13, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBI)V")
	private void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIBIZ)V")
	public void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg4 - this.anInt2636;
		@Pc(16) int local16 = 256;
		@Pc(28) int local28;
		if (arg1 == 1 || arg1 == 3) {
			local28 = arg2;
			arg2 = arg0;
			arg0 = local28;
		}
		if (arg5) {
			local16 = 131328;
		}
		@Pc(43) int local43 = arg3 - this.anInt2644;
		for (local28 = local6; local28 < arg2 + local6; local28++) {
			if (local28 >= 0 && local28 < this.anInt2641) {
				for (@Pc(58) int local58 = local43; local58 < local43 + arg0; local58++) {
					if (local58 >= 0 && this.anInt2635 > local58) {
						this.method1985(local16, local58, local28);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg0 - 1;
		@Pc(15) int local15 = arg5 + arg1 - 1;
		if (arg0 <= arg2 && local9 >= arg2 && arg6 >= arg1 && local15 >= arg6) {
			return true;
		} else if (arg2 == arg0 - 1 && arg6 >= arg1 && arg6 <= local15 && (this.anIntArrayArray20[arg2 - this.anInt2636][arg6 - this.anInt2644] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg2 && arg1 <= arg6 && local15 >= arg6 && (this.anIntArrayArray20[arg2 - this.anInt2636][arg6 - this.anInt2644] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg6 && arg0 <= arg2 && arg2 <= local9 && (this.anIntArrayArray20[arg2 - this.anInt2636][arg6 - this.anInt2644] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local15 + 1 && arg0 <= arg2 && local9 >= arg2 && (this.anIntArrayArray20[arg2 - this.anInt2636][arg6 - this.anInt2644] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
	public void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2636;
		@Pc(22) int local22 = arg0 - this.anInt2644;
		this.anIntArrayArray20[local8][local22] |= 0x200000;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	public void method1989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2636;
		@Pc(13) int local13 = arg1 - this.anInt2644;
		this.anIntArrayArray20[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIIII)V")
	public void method1990(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 - this.anInt2644;
		@Pc(17) int local17 = 256;
		@Pc(22) int local22 = arg1 - this.anInt2636;
		if (arg0) {
			local17 = 131328;
		}
		for (@Pc(30) int local30 = local22; local30 < arg2 + local22; local30++) {
			if (local30 >= 0 && local30 < this.anInt2641) {
				for (@Pc(43) int local43 = local6; local43 < local6 + arg3; local43++) {
					if (local43 >= 0 && this.anInt2635 > local43) {
						this.method1992(local30, local43, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBZII)V")
	public void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt2644;
		@Pc(13) int local13 = arg4 - this.anInt2636;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1992(local13, local4, 128);
				this.method1992(local13 - 1, local4, 8);
			}
			if (arg3 == 1) {
				this.method1992(local13, local4, 2);
				this.method1992(local13, local4 + 1, 32);
			}
			if (arg3 == 2) {
				this.method1992(local13, local4, 8);
				this.method1992(local13 + 1, local4, 128);
			}
			if (arg3 == 3) {
				this.method1992(local13, local4, 32);
				this.method1992(local13, local4 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1992(local13, local4, 1);
				this.method1992(local13 - 1, local4 - -1, 16);
			}
			if (arg3 == 1) {
				this.method1992(local13, local4, 4);
				this.method1992(local13 + 1, local4 + 1, 64);
			}
			if (arg3 == 2) {
				this.method1992(local13, local4, 16);
				this.method1992(local13 + 1, local4 + -1, 1);
			}
			if (arg3 == 3) {
				this.method1992(local13, local4, 64);
				this.method1992(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method1992(local13, local4, 130);
				this.method1992(local13 - 1, local4, 8);
				this.method1992(local13, local4 + 1, 32);
			}
			if (arg3 == 1) {
				this.method1992(local13, local4, 10);
				this.method1992(local13, local4 + 1, 32);
				this.method1992(local13 + 1, local4, 128);
			}
			if (arg3 == 2) {
				this.method1992(local13, local4, 40);
				this.method1992(local13 + 1, local4, 128);
				this.method1992(local13, local4 - 1, 2);
			}
			if (arg3 == 3) {
				this.method1992(local13, local4, 160);
				this.method1992(local13, local4 - 1, 2);
				this.method1992(local13 - 1, local4, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1992(local13, local4, 65536);
				this.method1992(local13 - 1, local4, 4096);
			}
			if (arg3 == 1) {
				this.method1992(local13, local4, 1024);
				this.method1992(local13, local4 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method1992(local13, local4, 4096);
				this.method1992(local13 + 1, local4, 65536);
			}
			if (arg3 == 3) {
				this.method1992(local13, local4, 16384);
				this.method1992(local13, local4 - 1, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1992(local13, local4, 512);
				this.method1992(local13 - 1, local4 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method1992(local13, local4, 2048);
				this.method1992(local13 + 1, local4 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method1992(local13, local4, 8192);
				this.method1992(local13 + 1, local4 - 1, 512);
			}
			if (arg3 == 3) {
				this.method1992(local13, local4, 32768);
				this.method1992(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1992(local13, local4, 66560);
			this.method1992(local13 - 1, local4, 4096);
			this.method1992(local13, local4 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method1992(local13, local4, 5120);
			this.method1992(local13, local4 + 1, 16384);
			this.method1992(local13 + 1, local4, 65536);
		}
		if (arg3 == 2) {
			this.method1992(local13, local4, 20480);
			this.method1992(local13 + 1, local4, 65536);
			this.method1992(local13, local4 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method1992(local13, local4, 81920);
			this.method1992(local13, local4 - 1, 1024);
			this.method1992(local13 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)V")
	private void method1992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method1993() {
		for (@Pc(16) int local16 = 0; local16 < this.anInt2641; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt2635; local20++) {
				if (local16 == 0 || local20 == 0 || this.anInt2641 - 5 <= local16 || this.anInt2635 - 5 <= local20) {
					this.anIntArrayArray20[local16][local20] = 16777215;
				} else {
					this.anIntArrayArray20[local16][local20] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIBI)Z")
	public boolean method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg2 && arg1 == arg5) {
			return true;
		}
		@Pc(29) int local29 = arg2 - this.anInt2636;
		@Pc(34) int local34 = arg5 - this.anInt2644;
		@Pc(39) int local39 = arg4 - this.anInt2636;
		@Pc(44) int local44 = arg1 - this.anInt2644;
		if (arg0 == 0) {
			if (arg3 == 0) {
				if (local39 - 1 == local29 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local44 + 1 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 == local29 && local44 - 1 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local29 == local39 && local34 == local44 + 1) {
					return true;
				}
				if (local29 == local39 - 1 && local44 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local39 + 1 && local34 == local44 && (this.anIntArrayArray20[local29][local34] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local29 == local39 + 1 && local34 == local44) {
					return true;
				}
				if (local29 == local39 && local34 == local44 + 1 && (this.anIntArrayArray20[local29][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 == local29 && local34 == local44 - 1 && (this.anIntArrayArray20[local29][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local39 == local29 && local34 == local44 - 1) {
					return true;
				}
				if (local39 - 1 == local29 && local44 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local39 + 1 == local29 && local34 == local44 && (this.anIntArrayArray20[local29][local34] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				if (local39 - 1 == local29 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local44 + 1 == local34) {
					return true;
				}
				if (local29 == local39 + 1 && local34 == local44 && (this.anIntArrayArray20[local29][local34] & 0x12C0180) == 0) {
					return true;
				}
				if (local39 == local29 && local34 == local44 - 1 && (this.anIntArrayArray20[local29][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local39 - 1 == local29 && local44 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local39 && local44 + 1 == local34) {
					return true;
				}
				if (local29 == local39 + 1 && local44 == local34) {
					return true;
				}
				if (local39 == local29 && local44 - 1 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local29 == local39 - 1 && local34 == local44 && (this.anIntArrayArray20[local29][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local39 && local34 == local44 + 1 && (this.anIntArrayArray20[local29][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local39 + 1 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local34 == local44 - 1) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local29 == local39 - 1 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local34 == local44 + 1 && (this.anIntArrayArray20[local29][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local39 + 1 && local44 == local34 && (this.anIntArrayArray20[local29][local34] & 0x12C0180) == 0) {
					return true;
				}
				if (local29 == local39 && local34 == local44 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local29 == local39 && local34 == local44 + 1 && (this.anIntArrayArray20[local29][local34] & 0x20) == 0) {
				return true;
			}
			if (local29 == local39 && local34 == local44 - 1 && (this.anIntArrayArray20[local29][local34] & 0x2) == 0) {
				return true;
			}
			if (local39 - 1 == local29 && local44 == local34 && (this.anIntArrayArray20[local29][local34] & 0x8) == 0) {
				return true;
			}
			if (local29 == local39 + 1 && local34 == local44 && (this.anIntArrayArray20[local29][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg0 && arg4 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg2 - this.anInt2636;
		@Pc(21) int local21 = arg0 - this.anInt2636;
		@Pc(26) int local26 = arg4 - this.anInt2644;
		@Pc(31) int local31 = arg3 - this.anInt2644;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local16 == local21 + 1 && local31 == local26 && (this.anIntArrayArray20[local16][local31] & 0x80) == 0) {
					return true;
				}
				if (local21 == local16 && local26 - 1 == local31 && (this.anIntArrayArray20[local16][local31] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local21 - 1 == local16 && local31 == local26 && (this.anIntArrayArray20[local16][local31] & 0x8) == 0) {
					return true;
				}
				if (local16 == local21 && local31 == local26 - 1 && (this.anIntArrayArray20[local16][local31] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local16 == local21 - 1 && local31 == local26 && (this.anIntArrayArray20[local16][local31] & 0x8) == 0) {
					return true;
				}
				if (local21 == local16 && local26 + 1 == local31 && (this.anIntArrayArray20[local16][local31] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local16 == local21 + 1 && local26 == local31 && (this.anIntArrayArray20[local16][local31] & 0x80) == 0) {
					return true;
				}
				if (local16 == local21 && local31 == local26 + 1 && (this.anIntArrayArray20[local16][local31] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (local16 == local21 && local26 + 1 == local31 && (this.anIntArrayArray20[local16][local31] & 0x20) == 0) {
				return true;
			}
			if (local21 == local16 && local26 - 1 == local31 && (this.anIntArrayArray20[local16][local31] & 0x2) == 0) {
				return true;
			}
			if (local16 == local21 - 1 && local26 == local31 && (this.anIntArrayArray20[local16][local31] & 0x8) == 0) {
				return true;
			}
			if (local16 == local21 + 1 && local26 == local31 && (this.anIntArrayArray20[local16][local31] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
	public void method1999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt2636;
		@Pc(21) int local21 = arg0 - this.anInt2644;
		this.anIntArrayArray20[local12][local21] &= 0xFFFBFFFF;
	}
}

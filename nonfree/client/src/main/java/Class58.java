import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class58 {

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	private final int anInt2819 = 0;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	private final int anInt2806;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	private final int anInt2804;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	private final int anInt2807;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2806 = arg0;
		this.anInt2804 = arg1;
		this.anInt2807 = 0;
		this.anIntArrayArray25 = new int[this.anInt2806][this.anInt2804];
		this.method1733();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIZIZ)V")
	public void method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2819;
		@Pc(9) int local9 = arg0 - this.anInt2807;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1732(local4, local9, 128);
				this.method1732(local4, local9 - 1, 8);
			}
			if (arg4 == 1) {
				this.method1732(local4, local9, 2);
				this.method1732(local4 + 1, local9, 32);
			}
			if (arg4 == 2) {
				this.method1732(local4, local9, 8);
				this.method1732(local4, local9 + 1, 128);
			}
			if (arg4 == 3) {
				this.method1732(local4, local9, 32);
				this.method1732(local4 - 1, local9, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1732(local4, local9, 1);
				this.method1732(local4 + 1, local9 + -1, 16);
			}
			if (arg4 == 1) {
				this.method1732(local4, local9, 4);
				this.method1732(local4 + 1, local9 - -1, 64);
			}
			if (arg4 == 2) {
				this.method1732(local4, local9, 16);
				this.method1732(local4 - 1, local9 + 1, 1);
			}
			if (arg4 == 3) {
				this.method1732(local4, local9, 64);
				this.method1732(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1732(local4, local9, 130);
				this.method1732(local4, local9 - 1, 8);
				this.method1732(local4 + 1, local9, 32);
			}
			if (arg4 == 1) {
				this.method1732(local4, local9, 10);
				this.method1732(local4 + 1, local9, 32);
				this.method1732(local4, local9 + 1, 128);
			}
			if (arg4 == 2) {
				this.method1732(local4, local9, 40);
				this.method1732(local4, local9 + 1, 128);
				this.method1732(local4 - 1, local9, 2);
			}
			if (arg4 == 3) {
				this.method1732(local4, local9, 160);
				this.method1732(local4 - 1, local9, 2);
				this.method1732(local4, local9 - 1, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1732(local4, local9, 65536);
				this.method1732(local4, local9 - 1, 4096);
			}
			if (arg4 == 1) {
				this.method1732(local4, local9, 1024);
				this.method1732(local4 + 1, local9, 16384);
			}
			if (arg4 == 2) {
				this.method1732(local4, local9, 4096);
				this.method1732(local4, local9 + 1, 65536);
			}
			if (arg4 == 3) {
				this.method1732(local4, local9, 16384);
				this.method1732(local4 - 1, local9, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1732(local4, local9, 512);
				this.method1732(local4 + 1, local9 + -1, 8192);
			}
			if (arg4 == 1) {
				this.method1732(local4, local9, 2048);
				this.method1732(local4 + 1, local9 - -1, 32768);
			}
			if (arg4 == 2) {
				this.method1732(local4, local9, 8192);
				this.method1732(local4 - 1, local9 + 1, 512);
			}
			if (arg4 == 3) {
				this.method1732(local4, local9, 32768);
				this.method1732(local4 - 1, local9 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1732(local4, local9, 66560);
			this.method1732(local4, local9 - 1, 4096);
			this.method1732(local4 + 1, local9, 16384);
		}
		if (arg4 == 1) {
			this.method1732(local4, local9, 5120);
			this.method1732(local4 + 1, local9, 16384);
			this.method1732(local4, local9 + 1, 65536);
		}
		if (arg4 == 2) {
			this.method1732(local4, local9, 20480);
			this.method1732(local4, local9 + 1, 65536);
			this.method1732(local4 - 1, local9, 1024);
		}
		if (arg4 == 3) {
			this.method1732(local4, local9, 81920);
			this.method1732(local4 - 1, local9, 1024);
			this.method1732(local4, local9 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBII)V")
	private void method1724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray25[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg4 + arg6 - 1;
		@Pc(15) int local15 = arg2 + arg5 - 1;
		if (arg3 >= arg5 && arg3 <= local15 && arg6 <= arg0 && arg0 <= local9) {
			return true;
		} else if (arg5 - 1 == arg3 && arg0 >= arg6 && arg0 <= local9 && (this.anIntArrayArray25[arg3 - this.anInt2807][arg0 - this.anInt2819] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg3 == local15 + 1 && arg6 <= arg0 && local9 >= arg0 && (this.anIntArrayArray25[arg3 - this.anInt2807][arg0 - this.anInt2819] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg6 - 1 && arg3 >= arg5 && arg3 <= local15 && (this.anIntArrayArray25[arg3 - this.anInt2807][arg0 - this.anInt2819] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg0 && arg3 >= arg5 && arg3 <= local15 && (this.anIntArrayArray25[arg3 - this.anInt2807][arg0 - this.anInt2819] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIII)V")
	public void method1726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt2807;
		@Pc(26) int local26;
		if (arg5 == 1 || arg5 == 3) {
			local26 = arg1;
			arg1 = arg0;
			arg0 = local26;
		}
		@Pc(32) int local32 = 256;
		if (arg2) {
			local32 = 131328;
		}
		@Pc(43) int local43 = arg3 - this.anInt2819;
		for (local26 = local6; local26 < local6 + arg1; local26++) {
			if (local26 >= 0 && this.anInt2806 > local26) {
				for (@Pc(55) int local55 = local43; local55 < arg0 + local43; local55++) {
					if (local55 >= 0 && this.anInt2804 > local55) {
						this.method1724(local55, local32, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIZIII)V")
	public void method1727(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = arg4 - this.anInt2807;
		@Pc(23) int local23 = 256;
		@Pc(33) int local33;
		if (arg3 == 1 || arg3 == 3) {
			local33 = arg2;
			arg2 = arg1;
			arg1 = local33;
		}
		if (arg0) {
			local23 = 131328;
		}
		@Pc(48) int local48 = arg5 - this.anInt2819;
		for (local33 = local21; local33 < local21 + arg2; local33++) {
			if (local33 >= 0 && this.anInt2806 > local33) {
				for (@Pc(64) int local64 = local48; local64 < arg1 + local48; local64++) {
					if (local64 >= 0 && local64 < this.anInt2804) {
						this.method1732(local64, local33, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)V")
	public void method1728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2819;
		@Pc(13) int local13 = arg1 - this.anInt2807;
		this.anIntArrayArray25[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg5 && arg1 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt2807;
		@Pc(25) int local25 = arg1 - this.anInt2819;
		@Pc(30) int local30 = arg4 - this.anInt2807;
		@Pc(35) int local35 = arg3 - this.anInt2819;
		if (arg2 == 0) {
			if (arg0 == 0) {
				if (local30 == local20 - 1 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray25[local30][local25] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local30 == local20 && local25 == local35 + 1) {
					return true;
				}
				if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x1280108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local30 == local20 + 1 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local20 == local30 && local25 == local35 - 1) {
					return true;
				}
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x1280108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				if (local20 - 1 == local30 && local25 == local35) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x1280180) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray25[local30][local25] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x1280108) == 0) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280120) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local20 - 1 == local30 && local25 == local35) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280120) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray25[local30][local25] & 0x1280180) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray25[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray25[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray25[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray25[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg4 && arg1 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg1 - this.anInt2819;
		@Pc(29) int local29 = arg2 - this.anInt2819;
		@Pc(34) int local34 = arg3 - this.anInt2807;
		@Pc(39) int local39 = arg4 - this.anInt2807;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local34 == local39 + 1 && local29 == local24 && (this.anIntArrayArray25[local34][local29] & 0x80) == 0) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray25[local34][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray25[local34][local29] & 0x8) == 0) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray25[local34][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray25[local34][local29] & 0x8) == 0) {
					return true;
				}
				if (local39 == local34 && local29 == local24 + 1 && (this.anIntArrayArray25[local34][local29] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local39 + 1 == local34 && local24 == local29 && (this.anIntArrayArray25[local34][local29] & 0x80) == 0) {
					return true;
				}
				if (local34 == local39 && local24 + 1 == local29 && (this.anIntArrayArray25[local34][local29] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local39 == local34 && local24 + 1 == local29 && (this.anIntArrayArray25[local34][local29] & 0x20) == 0) {
				return true;
			}
			if (local39 == local34 && local24 - 1 == local29 && (this.anIntArrayArray25[local34][local29] & 0x2) == 0) {
				return true;
			}
			if (local39 - 1 == local34 && local24 == local29 && (this.anIntArrayArray25[local34][local29] & 0x8) == 0) {
				return true;
			}
			if (local34 == local39 + 1 && local29 == local24 && (this.anIntArrayArray25[local34][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	private void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray25[arg1][arg0] &= 16777215 - arg2;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public void method1733() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2806; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2804; local11++) {
				if (local7 == 0 || local11 == 0 || local7 == this.anInt2806 - 1 || this.anInt2804 - 1 == local11) {
					this.anIntArrayArray25[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray25[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public void method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt2819;
		@Pc(17) int local17 = arg1 - this.anInt2807;
		this.anIntArrayArray25[local17][local12] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIBIZI)V")
	public void method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt2819;
		@Pc(9) int local9 = arg2 - this.anInt2807;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1724(local4, 128, local9);
				this.method1724(local4, 8, local9 - 1);
			}
			if (arg4 == 1) {
				this.method1724(local4, 2, local9);
				this.method1724(local4 + 1, 32, local9);
			}
			if (arg4 == 2) {
				this.method1724(local4, 8, local9);
				this.method1724(local4, 128, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1724(local4, 32, local9);
				this.method1724(local4 - 1, 2, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1724(local4, 1, local9);
				this.method1724(local4 + 1, 16, local9 - 1);
			}
			if (arg4 == 1) {
				this.method1724(local4, 4, local9);
				this.method1724(local4 + 1, 64, local9 + 1);
			}
			if (arg4 == 2) {
				this.method1724(local4, 16, local9);
				this.method1724(local4 - 1, 1, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1724(local4, 64, local9);
				this.method1724(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1724(local4, 130, local9);
				this.method1724(local4, 8, local9 - 1);
				this.method1724(local4 + 1, 32, local9);
			}
			if (arg4 == 1) {
				this.method1724(local4, 10, local9);
				this.method1724(local4 + 1, 32, local9);
				this.method1724(local4, 128, local9 + 1);
			}
			if (arg4 == 2) {
				this.method1724(local4, 40, local9);
				this.method1724(local4, 128, local9 + 1);
				this.method1724(local4 - 1, 2, local9);
			}
			if (arg4 == 3) {
				this.method1724(local4, 160, local9);
				this.method1724(local4 - 1, 2, local9);
				this.method1724(local4, 8, local9 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1724(local4, 65536, local9);
				this.method1724(local4, 4096, local9 - 1);
			}
			if (arg4 == 1) {
				this.method1724(local4, 1024, local9);
				this.method1724(local4 + 1, 16384, local9);
			}
			if (arg4 == 2) {
				this.method1724(local4, 4096, local9);
				this.method1724(local4, 65536, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1724(local4, 16384, local9);
				this.method1724(local4 - 1, 1024, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1724(local4, 512, local9);
				this.method1724(local4 + 1, 8192, local9 - 1);
			}
			if (arg4 == 1) {
				this.method1724(local4, 2048, local9);
				this.method1724(local4 + 1, 32768, local9 + 1);
			}
			if (arg4 == 2) {
				this.method1724(local4, 8192, local9);
				this.method1724(local4 - 1, 512, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1724(local4, 32768, local9);
				this.method1724(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1724(local4, 66560, local9);
			this.method1724(local4, 4096, local9 - 1);
			this.method1724(local4 + 1, 16384, local9);
		}
		if (arg4 == 1) {
			this.method1724(local4, 5120, local9);
			this.method1724(local4 + 1, 16384, local9);
			this.method1724(local4, 65536, local9 + 1);
		}
		if (arg4 == 2) {
			this.method1724(local4, 20480, local9);
			this.method1724(local4, 65536, local9 + 1);
			this.method1724(local4 - 1, 1024, local9);
		}
		if (arg4 == 3) {
			this.method1724(local4, 81920, local9);
			this.method1724(local4 - 1, 1024, local9);
			this.method1724(local4, 4096, local9 - 1);
		}
	}
}

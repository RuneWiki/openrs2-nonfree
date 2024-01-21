import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class37 {

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private final int anInt1615;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	private final int anInt1628;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private final int anInt1614;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
	public final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	private final int anInt1617;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1615 = arg1;
		this.anInt1628 = 0;
		this.anInt1614 = arg0;
		this.anIntArrayArray19 = new int[this.anInt1614][this.anInt1615];
		this.anInt1617 = 0;
		this.method1125();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
	public void method1112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int local4 = arg0 - this.anInt1617;
		@Pc(9) int local9 = arg1 - this.anInt1628;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1114(local4, 128, local9);
				this.method1114(local4 - 1, 8, local9);
			}
			if (arg2 == 1) {
				this.method1114(local4, 2, local9);
				this.method1114(local4, 32, local9 + 1);
			}
			if (arg2 == 2) {
				this.method1114(local4, 8, local9);
				this.method1114(local4 + 1, 128, local9);
			}
			if (arg2 == 3) {
				this.method1114(local4, 32, local9);
				this.method1114(local4, 2, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1114(local4, 1, local9);
				this.method1114(local4 - 1, 16, local9 + 1);
			}
			if (arg2 == 1) {
				this.method1114(local4, 4, local9);
				this.method1114(local4 + 1, 64, local9 + 1);
			}
			if (arg2 == 2) {
				this.method1114(local4, 16, local9);
				this.method1114(local4 + 1, 1, local9 - 1);
			}
			if (arg2 == 3) {
				this.method1114(local4, 64, local9);
				this.method1114(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method1114(local4, 130, local9);
				this.method1114(local4 - 1, 8, local9);
				this.method1114(local4, 32, local9 + 1);
			}
			if (arg2 == 1) {
				this.method1114(local4, 10, local9);
				this.method1114(local4, 32, local9 + 1);
				this.method1114(local4 + 1, 128, local9);
			}
			if (arg2 == 2) {
				this.method1114(local4, 40, local9);
				this.method1114(local4 + 1, 128, local9);
				this.method1114(local4, 2, local9 - 1);
			}
			if (arg2 == 3) {
				this.method1114(local4, 160, local9);
				this.method1114(local4, 2, local9 - 1);
				this.method1114(local4 - 1, 8, local9);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1114(local4, 65536, local9);
				this.method1114(local4 - 1, 4096, local9);
			}
			if (arg2 == 1) {
				this.method1114(local4, 1024, local9);
				this.method1114(local4, 16384, local9 + 1);
			}
			if (arg2 == 2) {
				this.method1114(local4, 4096, local9);
				this.method1114(local4 + 1, 65536, local9);
			}
			if (arg2 == 3) {
				this.method1114(local4, 16384, local9);
				this.method1114(local4, 1024, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1114(local4, 512, local9);
				this.method1114(local4 - 1, 8192, local9 + 1);
			}
			if (arg2 == 1) {
				this.method1114(local4, 2048, local9);
				this.method1114(local4 + 1, 32768, local9 + 1);
			}
			if (arg2 == 2) {
				this.method1114(local4, 8192, local9);
				this.method1114(local4 + 1, 512, local9 - 1);
			}
			if (arg2 == 3) {
				this.method1114(local4, 32768, local9);
				this.method1114(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1114(local4, 66560, local9);
			this.method1114(local4 - 1, 4096, local9);
			this.method1114(local4, 16384, local9 + 1);
		}
		if (arg2 == 1) {
			this.method1114(local4, 5120, local9);
			this.method1114(local4, 16384, local9 + 1);
			this.method1114(local4 + 1, 65536, local9);
		}
		if (arg2 == 2) {
			this.method1114(local4, 20480, local9);
			this.method1114(local4 + 1, 65536, local9);
			this.method1114(local4, 1024, local9 - 1);
		}
		if (arg2 == 3) {
			this.method1114(local4, 81920, local9);
			this.method1114(local4, 1024, local9 - 1);
			this.method1114(local4 - 1, 4096, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIBII)Z")
	public boolean method1113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg0 && arg4 == arg2) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt1628;
		@Pc(25) int local25 = arg0 - this.anInt1617;
		@Pc(30) int local30 = arg5 - this.anInt1617;
		@Pc(35) int local35 = arg2 - this.anInt1628;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (local30 == local25 - 1 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local35 == local20 + 1 && (this.anIntArrayArray19[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local25 == local30 && local35 == local20 + 1) {
					return true;
				}
				if (local25 - 1 == local30 && local35 == local20 && (this.anIntArrayArray19[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local30 && local20 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local30 == local25 + 1 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local30 && local20 - 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local25 == local30 && local20 - 1 == local35) {
					return true;
				}
				if (local30 == local25 - 1 && local20 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local30 && local20 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				if (local30 == local25 - 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local35) {
					return true;
				}
				if (local25 + 1 == local30 && local35 == local20 && (this.anIntArrayArray19[local30][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local25 - 1 == local30 && local20 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35) {
					return true;
				}
				if (local30 == local25 + 1 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local20 - 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local25 - 1 == local30 && local20 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local25 + 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local20 - 1 == local35) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local30 == local25 - 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local25 + 1 == local30 && local35 == local20 && (this.anIntArrayArray19[local30][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local25 == local30 && local20 + 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local20 - 1 == local35 && (this.anIntArrayArray19[local30][local35] & 0x2) == 0) {
				return true;
			}
			if (local25 - 1 == local30 && local35 == local20 && (this.anIntArrayArray19[local30][local35] & 0x8) == 0) {
				return true;
			}
			if (local30 == local25 + 1 && local35 == local20 && (this.anIntArrayArray19[local30][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray19[arg0][arg2] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIIB)V")
	public void method1117(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt1617;
		@Pc(9) int local9 = arg3 - this.anInt1628;
		@Pc(19) int local19;
		if (arg2 == 1 || arg2 == 3) {
			local19 = arg4;
			arg4 = arg0;
			arg0 = local19;
		}
		@Pc(25) int local25 = 256;
		if (arg1) {
			local25 = 131328;
		}
		for (local19 = local4; local19 < arg4 + local4; local19++) {
			if (local19 >= 0 && local19 < this.anInt1614) {
				for (@Pc(54) int local54 = local9; local54 < local9 + arg0; local54++) {
					if (local54 >= 0 && local54 < this.anInt1615) {
						this.method1118(local54, local25, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIII)V")
	private void method1118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZIII)V")
	public void method1119(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt1617;
		@Pc(13) int local13 = arg3 - this.anInt1628;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1118(local13, 128, local4);
				this.method1118(local13, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1118(local13, 2, local4);
				this.method1118(local13 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method1118(local13, 8, local4);
				this.method1118(local13, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1118(local13, 32, local4);
				this.method1118(local13 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1118(local13, 1, local4);
				this.method1118(local13 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1118(local13, 4, local4);
				this.method1118(local13 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1118(local13, 16, local4);
				this.method1118(local13 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1118(local13, 64, local4);
				this.method1118(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method1118(local13, 130, local4);
				this.method1118(local13, 8, local4 - 1);
				this.method1118(local13 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method1118(local13, 10, local4);
				this.method1118(local13 + 1, 32, local4);
				this.method1118(local13, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1118(local13, 40, local4);
				this.method1118(local13, 128, local4 + 1);
				this.method1118(local13 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method1118(local13, 160, local4);
				this.method1118(local13 - 1, 2, local4);
				this.method1118(local13, 8, local4 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1118(local13, 65536, local4);
				this.method1118(local13, 4096, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1118(local13, 1024, local4);
				this.method1118(local13 + 1, 16384, local4);
			}
			if (arg0 == 2) {
				this.method1118(local13, 4096, local4);
				this.method1118(local13, 65536, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1118(local13, 16384, local4);
				this.method1118(local13 - 1, 1024, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1118(local13, 512, local4);
				this.method1118(local13 + 1, 8192, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1118(local13, 2048, local4);
				this.method1118(local13 + 1, 32768, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1118(local13, 8192, local4);
				this.method1118(local13 - 1, 512, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1118(local13, 32768, local4);
				this.method1118(local13 - 1, 2048, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1118(local13, 66560, local4);
			this.method1118(local13, 4096, local4 - 1);
			this.method1118(local13 + 1, 16384, local4);
		}
		if (arg0 == 1) {
			this.method1118(local13, 5120, local4);
			this.method1118(local13 + 1, 16384, local4);
			this.method1118(local13, 65536, local4 + 1);
		}
		if (arg0 == 2) {
			this.method1118(local13, 20480, local4);
			this.method1118(local13, 65536, local4 + 1);
			this.method1118(local13 - 1, 1024, local4);
		}
		if (arg0 == 3) {
			this.method1118(local13, 81920, local4);
			this.method1118(local13 - 1, 1024, local4);
			this.method1118(local13, 4096, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method1120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1628;
		@Pc(19) int local19 = arg0 - this.anInt1617;
		this.anIntArrayArray19[local19][local4] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
	public void method1121(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		@Pc(23) int local23;
		if (arg0 == 1 || arg0 == 3) {
			local23 = arg5;
			arg5 = arg3;
			arg3 = local23;
		}
		@Pc(32) int local32 = arg4 - this.anInt1628;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(43) int local43 = arg2 - this.anInt1617;
		for (local23 = local43; local23 < arg5 + local43; local23++) {
			if (local23 >= 0 && this.anInt1614 > local23) {
				for (@Pc(59) int local59 = local32; local59 < local32 + arg3; local59++) {
					if (local59 >= 0 && local59 < this.anInt1615) {
						this.method1114(local23, local7, local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method1122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1617;
		@Pc(13) int local13 = arg0 - this.anInt1628;
		this.anIntArrayArray19[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 + arg4 - 1;
		@Pc(24) int local24 = arg2 + arg1 - 1;
		if (arg0 <= arg6 && arg6 <= local9 && arg3 >= arg1 && local24 >= arg3) {
			return true;
		} else if (arg0 - 1 == arg6 && arg3 >= arg1 && arg3 <= local24 && (this.anIntArrayArray19[arg6 - this.anInt1617][arg3 - this.anInt1628] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg6 == local9 + 1 && arg1 <= arg3 && arg3 <= local24 && (this.anIntArrayArray19[arg6 - this.anInt1617][arg3 - this.anInt1628] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg1 - 1 && arg6 >= arg0 && arg6 <= local9 && (this.anIntArrayArray19[arg6 - this.anInt1617][arg3 - this.anInt1628] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local24 + 1 == arg3 && arg6 >= arg0 && local9 >= arg6 && (this.anIntArrayArray19[arg6 - this.anInt1617][arg3 - this.anInt1628] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method1125() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1614; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1615; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt1614 - 1 || this.anInt1615 - 1 == local7) {
					this.anIntArrayArray19[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray19[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg4 && arg1 == arg2) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt1628;
		@Pc(25) int local25 = arg1 - this.anInt1628;
		@Pc(30) int local30 = arg4 - this.anInt1617;
		@Pc(35) int local35 = arg3 - this.anInt1617;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local35 == local30 + 1 && local20 == local25 && (this.anIntArrayArray19[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local35 == local30 && local25 - 1 == local20 && (this.anIntArrayArray19[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray19[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local35 == local30 && local20 == local25 - 1 && (this.anIntArrayArray19[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray19[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local30 == local35 && local20 == local25 + 1 && (this.anIntArrayArray19[local35][local20] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local30 + 1 == local35 && local20 == local25 && (this.anIntArrayArray19[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local30 == local35 && local25 + 1 == local20 && (this.anIntArrayArray19[local35][local20] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local30 == local35 && local25 + 1 == local20 && (this.anIntArrayArray19[local35][local20] & 0x20) == 0) {
				return true;
			}
			if (local35 == local30 && local25 - 1 == local20 && (this.anIntArrayArray19[local35][local20] & 0x2) == 0) {
				return true;
			}
			if (local35 == local30 - 1 && local25 == local20 && (this.anIntArrayArray19[local35][local20] & 0x8) == 0) {
				return true;
			}
			if (local35 == local30 + 1 && local25 == local20 && (this.anIntArrayArray19[local35][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

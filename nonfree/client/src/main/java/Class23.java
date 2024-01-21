import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class23 {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	private final int anInt1226;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
	private final int anInt1234;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	private final int anInt1230;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	private final int anInt1218;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1226 = arg1;
		this.anInt1234 = arg0;
		this.anIntArrayArray9 = new int[this.anInt1234][this.anInt1226];
		this.anInt1230 = 0;
		this.anInt1218 = 0;
		this.method768();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIII)V")
	public void method763(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt1230;
		@Pc(13) int local13 = arg2 - this.anInt1218;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method771(local8, 128, local13);
				this.method771(local8 - 1, 8, local13);
			}
			if (arg1 == 1) {
				this.method771(local8, 2, local13);
				this.method771(local8, 32, local13 + 1);
			}
			if (arg1 == 2) {
				this.method771(local8, 8, local13);
				this.method771(local8 + 1, 128, local13);
			}
			if (arg1 == 3) {
				this.method771(local8, 32, local13);
				this.method771(local8, 2, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method771(local8, 1, local13);
				this.method771(local8 - 1, 16, local13 + 1);
			}
			if (arg1 == 1) {
				this.method771(local8, 4, local13);
				this.method771(local8 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method771(local8, 16, local13);
				this.method771(local8 + 1, 1, local13 - 1);
			}
			if (arg1 == 3) {
				this.method771(local8, 64, local13);
				this.method771(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method771(local8, 130, local13);
				this.method771(local8 - 1, 8, local13);
				this.method771(local8, 32, local13 + 1);
			}
			if (arg1 == 1) {
				this.method771(local8, 10, local13);
				this.method771(local8, 32, local13 + 1);
				this.method771(local8 + 1, 128, local13);
			}
			if (arg1 == 2) {
				this.method771(local8, 40, local13);
				this.method771(local8 + 1, 128, local13);
				this.method771(local8, 2, local13 - 1);
			}
			if (arg1 == 3) {
				this.method771(local8, 160, local13);
				this.method771(local8, 2, local13 - 1);
				this.method771(local8 - 1, 8, local13);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method771(local8, 65536, local13);
				this.method771(local8 - 1, 4096, local13);
			}
			if (arg1 == 1) {
				this.method771(local8, 1024, local13);
				this.method771(local8, 16384, local13 + 1);
			}
			if (arg1 == 2) {
				this.method771(local8, 4096, local13);
				this.method771(local8 + 1, 65536, local13);
			}
			if (arg1 == 3) {
				this.method771(local8, 16384, local13);
				this.method771(local8, 1024, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method771(local8, 512, local13);
				this.method771(local8 - 1, 8192, local13 + 1);
			}
			if (arg1 == 1) {
				this.method771(local8, 2048, local13);
				this.method771(local8 + 1, 32768, local13 + 1);
			}
			if (arg1 == 2) {
				this.method771(local8, 8192, local13);
				this.method771(local8 + 1, 512, local13 - 1);
			}
			if (arg1 == 3) {
				this.method771(local8, 32768, local13);
				this.method771(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method771(local8, 66560, local13);
			this.method771(local8 - 1, 4096, local13);
			this.method771(local8, 16384, local13 + 1);
		}
		if (arg1 == 1) {
			this.method771(local8, 5120, local13);
			this.method771(local8, 16384, local13 + 1);
			this.method771(local8 + 1, 65536, local13);
		}
		if (arg1 == 2) {
			this.method771(local8, 20480, local13);
			this.method771(local8 + 1, 65536, local13);
			this.method771(local8, 1024, local13 - 1);
		}
		if (arg1 == 3) {
			this.method771(local8, 81920, local13);
			this.method771(local8, 1024, local13 - 1);
			this.method771(local8 - 1, 4096, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg0 && arg5 == arg1) {
			return true;
		}
		@Pc(30) int local30 = arg0 - this.anInt1230;
		@Pc(35) int local35 = arg1 - this.anInt1218;
		@Pc(40) int local40 = arg4 - this.anInt1230;
		@Pc(45) int local45 = arg5 - this.anInt1218;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local40 == local30 + 1 && local35 == local45 && (this.anIntArrayArray9[local40][local45] & 0x80) == 0) {
					return true;
				}
				if (local30 == local40 && local45 == local35 - 1 && (this.anIntArrayArray9[local40][local45] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local40 == local30 - 1 && local45 == local35 && (this.anIntArrayArray9[local40][local45] & 0x8) == 0) {
					return true;
				}
				if (local30 == local40 && local35 - 1 == local45 && (this.anIntArrayArray9[local40][local45] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local40 == local30 - 1 && local35 == local45 && (this.anIntArrayArray9[local40][local45] & 0x8) == 0) {
					return true;
				}
				if (local40 == local30 && local35 + 1 == local45 && (this.anIntArrayArray9[local40][local45] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local40 == local30 + 1 && local35 == local45 && (this.anIntArrayArray9[local40][local45] & 0x80) == 0) {
					return true;
				}
				if (local30 == local40 && local35 + 1 == local45 && (this.anIntArrayArray9[local40][local45] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local40 == local30 && local45 == local35 + 1 && (this.anIntArrayArray9[local40][local45] & 0x20) == 0) {
				return true;
			}
			if (local30 == local40 && local45 == local35 - 1 && (this.anIntArrayArray9[local40][local45] & 0x2) == 0) {
				return true;
			}
			if (local40 == local30 - 1 && local35 == local45 && (this.anIntArrayArray9[local40][local45] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local40 && local45 == local35 && (this.anIntArrayArray9[local40][local45] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public void method768() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1234; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1226; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt1234 - 1 || this.anInt1226 - 1 == local7) {
					this.anIntArrayArray9[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray9[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBIIZI)V")
	public void method769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt1218;
		@Pc(13) int local13 = arg1 - this.anInt1230;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method777(local8, local13, 128);
				this.method777(local8, local13 - 1, 8);
			}
			if (arg2 == 1) {
				this.method777(local8, local13, 2);
				this.method777(local8 + 1, local13, 32);
			}
			if (arg2 == 2) {
				this.method777(local8, local13, 8);
				this.method777(local8, local13 + 1, 128);
			}
			if (arg2 == 3) {
				this.method777(local8, local13, 32);
				this.method777(local8 - 1, local13, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method777(local8, local13, 1);
				this.method777(local8 + 1, local13 - 1, 16);
			}
			if (arg2 == 1) {
				this.method777(local8, local13, 4);
				this.method777(local8 + 1, local13 + 1, 64);
			}
			if (arg2 == 2) {
				this.method777(local8, local13, 16);
				this.method777(local8 - 1, local13 + 1, 1);
			}
			if (arg2 == 3) {
				this.method777(local8, local13, 64);
				this.method777(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method777(local8, local13, 130);
				this.method777(local8, local13 - 1, 8);
				this.method777(local8 + 1, local13, 32);
			}
			if (arg2 == 1) {
				this.method777(local8, local13, 10);
				this.method777(local8 + 1, local13, 32);
				this.method777(local8, local13 + 1, 128);
			}
			if (arg2 == 2) {
				this.method777(local8, local13, 40);
				this.method777(local8, local13 + 1, 128);
				this.method777(local8 - 1, local13, 2);
			}
			if (arg2 == 3) {
				this.method777(local8, local13, 160);
				this.method777(local8 - 1, local13, 2);
				this.method777(local8, local13 - 1, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method777(local8, local13, 65536);
				this.method777(local8, local13 - 1, 4096);
			}
			if (arg2 == 1) {
				this.method777(local8, local13, 1024);
				this.method777(local8 + 1, local13, 16384);
			}
			if (arg2 == 2) {
				this.method777(local8, local13, 4096);
				this.method777(local8, local13 + 1, 65536);
			}
			if (arg2 == 3) {
				this.method777(local8, local13, 16384);
				this.method777(local8 - 1, local13, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method777(local8, local13, 512);
				this.method777(local8 + 1, local13 + -1, 8192);
			}
			if (arg2 == 1) {
				this.method777(local8, local13, 2048);
				this.method777(local8 + 1, local13 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method777(local8, local13, 8192);
				this.method777(local8 - 1, local13 - -1, 512);
			}
			if (arg2 == 3) {
				this.method777(local8, local13, 32768);
				this.method777(local8 - 1, local13 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method777(local8, local13, 66560);
			this.method777(local8, local13 - 1, 4096);
			this.method777(local8 + 1, local13, 16384);
		}
		if (arg2 == 1) {
			this.method777(local8, local13, 5120);
			this.method777(local8 + 1, local13, 16384);
			this.method777(local8, local13 + 1, 65536);
		}
		if (arg2 == 2) {
			this.method777(local8, local13, 20480);
			this.method777(local8, local13 + 1, 65536);
			this.method777(local8 - 1, local13, 1024);
		}
		if (arg2 == 3) {
			this.method777(local8, local13, 81920);
			this.method777(local8 - 1, local13, 1024);
			this.method777(local8, local13 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIZI)V")
	public void method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) int local10 = arg1 - this.anInt1230;
		@Pc(20) int local20;
		if (arg2 == 1 || arg2 == 3) {
			local20 = arg3;
			arg3 = arg4;
			arg4 = local20;
		}
		@Pc(26) int local26 = 256;
		if (arg5) {
			local26 = 131328;
		}
		@Pc(37) int local37 = arg0 - this.anInt1218;
		for (local20 = local10; local20 < arg3 + local10; local20++) {
			if (local20 >= 0 && this.anInt1234 > local20) {
				for (@Pc(53) int local53 = local37; local53 < local37 + arg4; local53++) {
					if (local53 >= 0 && this.anInt1226 > local53) {
						this.method777(local53, local20, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZ)V")
	private void method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray9[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg4 + arg6 - 1;
		@Pc(11) int local11 = arg5 + arg1 - 1;
		if (arg0 >= arg6 && arg0 <= local5 && arg2 >= arg1 && local11 >= arg2) {
			return true;
		} else if (arg0 == arg6 - 1 && arg1 <= arg2 && local11 >= arg2 && (this.anIntArrayArray9[arg0 - this.anInt1230][arg2 - this.anInt1218] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local5 + 1 == arg0 && arg2 >= arg1 && local11 >= arg2 && (this.anIntArrayArray9[arg0 - this.anInt1230][arg2 - this.anInt1218] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg1 - 1 && arg6 <= arg0 && local5 >= arg0 && (this.anIntArrayArray9[arg0 - this.anInt1230][arg2 - this.anInt1218] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local11 + 1 && arg6 <= arg0 && local5 >= arg0 && (this.anIntArrayArray9[arg0 - this.anInt1230][arg2 - this.anInt1218] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public void method774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt1218;
		@Pc(17) int local17 = arg0 - this.anInt1230;
		this.anIntArrayArray9[local17][local12] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	public void method775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1218;
		@Pc(9) int local9 = arg1 - this.anInt1230;
		this.anIntArrayArray9[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZII)V")
	private void method777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray9[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIZ)V")
	public void method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg3 - this.anInt1218;
		@Pc(15) int local15 = arg0 - this.anInt1230;
		@Pc(17) int local17 = 256;
		if (arg5) {
			local17 = 131328;
		}
		@Pc(33) int local33;
		if (arg2 == 1 || arg2 == 3) {
			local33 = arg4;
			arg4 = arg1;
			arg1 = local33;
		}
		for (local33 = local15; local33 < local15 + arg4; local33++) {
			if (local33 >= 0 && local33 < this.anInt1234) {
				for (@Pc(52) int local52 = local6; local52 < arg1 + local6; local52++) {
					if (local52 >= 0 && local52 < this.anInt1226) {
						this.method771(local33, local17, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V")
	public void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt1218;
		@Pc(18) int local18 = arg0 - this.anInt1230;
		this.anIntArrayArray9[local18][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg2 && arg1 == arg5) {
			return true;
		}
		@Pc(29) int local29 = arg2 - this.anInt1230;
		@Pc(34) int local34 = arg5 - this.anInt1218;
		@Pc(39) int local39 = arg3 - this.anInt1230;
		@Pc(44) int local44 = arg1 - this.anInt1218;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (local29 - 1 == local39 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local44 == local34 + 1 && (this.anIntArrayArray9[local39][local44] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local39 && local34 - 1 == local44 && (this.anIntArrayArray9[local39][local44] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local39 == local29 && local34 + 1 == local44) {
					return true;
				}
				if (local29 - 1 == local39 && local44 == local34 && (this.anIntArrayArray9[local39][local44] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 + 1 == local39 && local44 == local34 && (this.anIntArrayArray9[local39][local44] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local39 == local29 + 1 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local34 + 1 == local44 && (this.anIntArrayArray9[local39][local44] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 == local29 && local34 - 1 == local44 && (this.anIntArrayArray9[local39][local44] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local39 == local29 && local34 - 1 == local44) {
					return true;
				}
				if (local29 - 1 == local39 && local44 == local34 && (this.anIntArrayArray9[local39][local44] & 0x12C0108) == 0) {
					return true;
				}
				if (local39 == local29 + 1 && local34 == local44 && (this.anIntArrayArray9[local39][local44] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				if (local39 == local29 - 1 && local34 == local44) {
					return true;
				}
				if (local29 == local39 && local34 + 1 == local44) {
					return true;
				}
				if (local39 == local29 + 1 && local44 == local34 && (this.anIntArrayArray9[local39][local44] & 0x12C0180) == 0) {
					return true;
				}
				if (local29 == local39 && local44 == local34 - 1 && (this.anIntArrayArray9[local39][local44] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 - 1 == local39 && local34 == local44 && (this.anIntArrayArray9[local39][local44] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local39 && local34 + 1 == local44) {
					return true;
				}
				if (local39 == local29 + 1 && local44 == local34) {
					return true;
				}
				if (local39 == local29 && local44 == local34 - 1 && (this.anIntArrayArray9[local39][local44] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local29 - 1 == local39 && local44 == local34 && (this.anIntArrayArray9[local39][local44] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local39 && local44 == local34 + 1 && (this.anIntArrayArray9[local39][local44] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 == local29 + 1 && local44 == local34) {
					return true;
				}
				if (local29 == local39 && local44 == local34 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local39 == local29 - 1 && local44 == local34) {
					return true;
				}
				if (local39 == local29 && local44 == local34 + 1 && (this.anIntArrayArray9[local39][local44] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 + 1 == local39 && local34 == local44 && (this.anIntArrayArray9[local39][local44] & 0x12C0180) == 0) {
					return true;
				}
				if (local39 == local29 && local34 - 1 == local44) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local29 == local39 && local34 + 1 == local44 && (this.anIntArrayArray9[local39][local44] & 0x20) == 0) {
				return true;
			}
			if (local29 == local39 && local44 == local34 - 1 && (this.anIntArrayArray9[local39][local44] & 0x2) == 0) {
				return true;
			}
			if (local29 - 1 == local39 && local34 == local44 && (this.anIntArrayArray9[local39][local44] & 0x8) == 0) {
				return true;
			}
			if (local39 == local29 + 1 && local34 == local44 && (this.anIntArrayArray9[local39][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class50 {

	@OriginalMember(owner = "client!q", name = "r", descriptor = "I")
	private final int anInt2131 = 0;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	private final int anInt2134;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	private final int anInt2116;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	private final int anInt2127;

	@OriginalMember(owner = "client!q", name = "E", descriptor = "[[I")
	public final int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2134 = arg0;
		this.anInt2116 = 0;
		this.anInt2127 = arg1;
		this.anIntArrayArray44 = new int[this.anInt2134][this.anInt2127];
		this.method1359();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg4 - 1;
		@Pc(20) int local20 = arg2 + arg0 - 1;
		if (arg5 >= arg0 && local20 >= arg5 && arg4 <= arg1 && arg1 <= local9) {
			return true;
		} else if (arg5 == arg0 - 1 && arg1 >= arg4 && local9 >= arg1 && (this.anIntArrayArray44[arg5 - this.anInt2116][arg1 - this.anInt2131] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local20 + 1 == arg5 && arg4 <= arg1 && local9 >= arg1 && (this.anIntArrayArray44[arg5 - this.anInt2116][arg1 - this.anInt2131] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg1 && arg5 >= arg0 && local20 >= arg5 && (this.anIntArrayArray44[arg5 - this.anInt2116][arg1 - this.anInt2131] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg1 && arg0 <= arg5 && arg5 <= local20 && (this.anIntArrayArray44[arg5 - this.anInt2116][arg1 - this.anInt2131] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZIIII)Z")
	public boolean method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg4 && arg1 == arg3) {
			return true;
		}
		@Pc(24) int local24 = arg2 - this.anInt2116;
		@Pc(29) int local29 = arg1 - this.anInt2131;
		@Pc(34) int local34 = arg3 - this.anInt2131;
		@Pc(39) int local39 = arg4 - this.anInt2116;
		if (arg5 == 0) {
			if (arg0 == 0) {
				if (local39 == local24 - 1 && local34 == local29) {
					return true;
				}
				if (local39 == local24 && local29 + 1 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local39 == local24 && local34 == local29 - 1 && (this.anIntArrayArray44[local39][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local39 == local24 && local29 + 1 == local34) {
					return true;
				}
				if (local24 - 1 == local39 && local29 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local24 + 1 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local39 == local24 + 1 && local34 == local29) {
					return true;
				}
				if (local39 == local24 && local29 + 1 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local24 == local39 && local29 - 1 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local24 == local39 && local29 - 1 == local34) {
					return true;
				}
				if (local24 - 1 == local39 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local24 + 1 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				if (local39 == local24 - 1 && local34 == local29) {
					return true;
				}
				if (local24 == local39 && local29 + 1 == local34) {
					return true;
				}
				if (local24 + 1 == local39 && local29 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280180) == 0) {
					return true;
				}
				if (local24 == local39 && local34 == local29 - 1 && (this.anIntArrayArray44[local39][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local39 == local24 - 1 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local24 && local34 == local29 + 1) {
					return true;
				}
				if (local24 + 1 == local39 && local34 == local29) {
					return true;
				}
				if (local39 == local24 && local29 - 1 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local24 - 1 == local39 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local24 == local39 && local29 + 1 == local34 && (this.anIntArrayArray44[local39][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local39 == local24 + 1 && local34 == local29) {
					return true;
				}
				if (local39 == local24 && local29 - 1 == local34) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local24 - 1 == local39 && local34 == local29) {
					return true;
				}
				if (local39 == local24 && local34 == local29 + 1 && (this.anIntArrayArray44[local39][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local24 + 1 == local39 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x1280180) == 0) {
					return true;
				}
				if (local39 == local24 && local29 - 1 == local34) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local39 == local24 && local29 + 1 == local34 && (this.anIntArrayArray44[local39][local34] & 0x20) == 0) {
				return true;
			}
			if (local24 == local39 && local34 == local29 - 1 && (this.anIntArrayArray44[local39][local34] & 0x2) == 0) {
				return true;
			}
			if (local24 - 1 == local39 && local34 == local29 && (this.anIntArrayArray44[local39][local34] & 0x8) == 0) {
				return true;
			}
			if (local24 + 1 == local39 && local29 == local34 && (this.anIntArrayArray44[local39][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V")
	private void method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray44[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZZIIII)V")
	public void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt2116;
		@Pc(16) int local16;
		if (arg0 == 1 || arg0 == 3) {
			local16 = arg2;
			arg2 = arg4;
			arg4 = local16;
		}
		@Pc(22) int local22 = 256;
		if (arg1) {
			local22 = 131328;
		}
		@Pc(47) int local47 = arg3 - this.anInt2131;
		for (local16 = local4; local16 < local4 + arg2; local16++) {
			if (local16 >= 0 && local16 < this.anInt2134) {
				for (@Pc(61) int local61 = local47; local61 < arg4 + local47; local61++) {
					if (local61 >= 0 && local61 < this.anInt2127) {
						this.method1355(local61, local22, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBZI)V")
	public void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt2116;
		@Pc(13) int local13 = arg1 - this.anInt2131;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1355(local13, 128, local4);
				this.method1355(local13, 8, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1355(local13, 2, local4);
				this.method1355(local13 + 1, 32, local4);
			}
			if (arg2 == 2) {
				this.method1355(local13, 8, local4);
				this.method1355(local13, 128, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1355(local13, 32, local4);
				this.method1355(local13 - 1, 2, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1355(local13, 1, local4);
				this.method1355(local13 + 1, 16, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1355(local13, 4, local4);
				this.method1355(local13 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1355(local13, 16, local4);
				this.method1355(local13 - 1, 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1355(local13, 64, local4);
				this.method1355(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method1355(local13, 130, local4);
				this.method1355(local13, 8, local4 - 1);
				this.method1355(local13 + 1, 32, local4);
			}
			if (arg2 == 1) {
				this.method1355(local13, 10, local4);
				this.method1355(local13 + 1, 32, local4);
				this.method1355(local13, 128, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1355(local13, 40, local4);
				this.method1355(local13, 128, local4 + 1);
				this.method1355(local13 - 1, 2, local4);
			}
			if (arg2 == 3) {
				this.method1355(local13, 160, local4);
				this.method1355(local13 - 1, 2, local4);
				this.method1355(local13, 8, local4 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1355(local13, 65536, local4);
				this.method1355(local13, 4096, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1355(local13, 1024, local4);
				this.method1355(local13 + 1, 16384, local4);
			}
			if (arg2 == 2) {
				this.method1355(local13, 4096, local4);
				this.method1355(local13, 65536, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1355(local13, 16384, local4);
				this.method1355(local13 - 1, 1024, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1355(local13, 512, local4);
				this.method1355(local13 + 1, 8192, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1355(local13, 2048, local4);
				this.method1355(local13 + 1, 32768, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1355(local13, 8192, local4);
				this.method1355(local13 - 1, 512, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1355(local13, 32768, local4);
				this.method1355(local13 - 1, 2048, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1355(local13, 66560, local4);
			this.method1355(local13, 4096, local4 - 1);
			this.method1355(local13 + 1, 16384, local4);
		}
		if (arg2 == 1) {
			this.method1355(local13, 5120, local4);
			this.method1355(local13 + 1, 16384, local4);
			this.method1355(local13, 65536, local4 + 1);
		}
		if (arg2 == 2) {
			this.method1355(local13, 20480, local4);
			this.method1355(local13, 65536, local4 + 1);
			this.method1355(local13 - 1, 1024, local4);
		}
		if (arg2 == 3) {
			this.method1355(local13, 81920, local4);
			this.method1355(local13 - 1, 1024, local4);
			this.method1355(local13, 4096, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg3 && arg4 == arg5) {
			return true;
		}
		@Pc(28) int local28 = arg5 - this.anInt2131;
		@Pc(33) int local33 = arg3 - this.anInt2116;
		@Pc(38) int local38 = arg4 - this.anInt2131;
		@Pc(43) int local43 = arg1 - this.anInt2116;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local43 + 1 == local33 && local28 == local38 && (this.anIntArrayArray44[local33][local28] & 0x80) == 0) {
					return true;
				}
				if (local33 == local43 && local38 - 1 == local28 && (this.anIntArrayArray44[local33][local28] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local33 == local43 - 1 && local28 == local38 && (this.anIntArrayArray44[local33][local28] & 0x8) == 0) {
					return true;
				}
				if (local43 == local33 && local28 == local38 - 1 && (this.anIntArrayArray44[local33][local28] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local33 == local43 - 1 && local38 == local28 && (this.anIntArrayArray44[local33][local28] & 0x8) == 0) {
					return true;
				}
				if (local43 == local33 && local38 + 1 == local28 && (this.anIntArrayArray44[local33][local28] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local43 + 1 == local33 && local28 == local38 && (this.anIntArrayArray44[local33][local28] & 0x80) == 0) {
					return true;
				}
				if (local33 == local43 && local38 + 1 == local28 && (this.anIntArrayArray44[local33][local28] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local33 == local43 && local28 == local38 + 1 && (this.anIntArrayArray44[local33][local28] & 0x20) == 0) {
				return true;
			}
			if (local33 == local43 && local38 - 1 == local28 && (this.anIntArrayArray44[local33][local28] & 0x2) == 0) {
				return true;
			}
			if (local33 == local43 - 1 && local38 == local28 && (this.anIntArrayArray44[local33][local28] & 0x8) == 0) {
				return true;
			}
			if (local33 == local43 + 1 && local28 == local38 && (this.anIntArrayArray44[local33][local28] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public void method1359() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt2134; local5++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2127; local11++) {
				if (local5 == 0 || local11 == 0 || this.anInt2134 - 1 == local5 || this.anInt2127 - 1 == local11) {
					this.anIntArrayArray44[local5][local11] = 16777215;
				} else {
					this.anIntArrayArray44[local5][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)V")
	public void method1361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2116;
		@Pc(17) int local17 = arg1 - this.anInt2131;
		this.anIntArrayArray44[local4][local17] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IBI)V")
	public void method1362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2131;
		@Pc(13) int local13 = arg1 - this.anInt2116;
		this.anIntArrayArray44[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZZIIII)V")
	public void method1363(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt2131;
		@Pc(18) int local18 = arg2 - this.anInt2116;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1365(local4, local18, 128);
				this.method1365(local4, local18 - 1, 8);
			}
			if (arg3 == 1) {
				this.method1365(local4, local18, 2);
				this.method1365(local4 + 1, local18, 32);
			}
			if (arg3 == 2) {
				this.method1365(local4, local18, 8);
				this.method1365(local4, local18 + 1, 128);
			}
			if (arg3 == 3) {
				this.method1365(local4, local18, 32);
				this.method1365(local4 - 1, local18, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1365(local4, local18, 1);
				this.method1365(local4 + 1, local18 + -1, 16);
			}
			if (arg3 == 1) {
				this.method1365(local4, local18, 4);
				this.method1365(local4 + 1, local18 + 1, 64);
			}
			if (arg3 == 2) {
				this.method1365(local4, local18, 16);
				this.method1365(local4 - 1, local18 + 1, 1);
			}
			if (arg3 == 3) {
				this.method1365(local4, local18, 64);
				this.method1365(local4 - 1, local18 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method1365(local4, local18, 130);
				this.method1365(local4, local18 - 1, 8);
				this.method1365(local4 + 1, local18, 32);
			}
			if (arg3 == 1) {
				this.method1365(local4, local18, 10);
				this.method1365(local4 + 1, local18, 32);
				this.method1365(local4, local18 + 1, 128);
			}
			if (arg3 == 2) {
				this.method1365(local4, local18, 40);
				this.method1365(local4, local18 + 1, 128);
				this.method1365(local4 - 1, local18, 2);
			}
			if (arg3 == 3) {
				this.method1365(local4, local18, 160);
				this.method1365(local4 - 1, local18, 2);
				this.method1365(local4, local18 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1365(local4, local18, 65536);
				this.method1365(local4, local18 - 1, 4096);
			}
			if (arg3 == 1) {
				this.method1365(local4, local18, 1024);
				this.method1365(local4 + 1, local18, 16384);
			}
			if (arg3 == 2) {
				this.method1365(local4, local18, 4096);
				this.method1365(local4, local18 + 1, 65536);
			}
			if (arg3 == 3) {
				this.method1365(local4, local18, 16384);
				this.method1365(local4 - 1, local18, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1365(local4, local18, 512);
				this.method1365(local4 + 1, local18 + -1, 8192);
			}
			if (arg3 == 1) {
				this.method1365(local4, local18, 2048);
				this.method1365(local4 + 1, local18 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method1365(local4, local18, 8192);
				this.method1365(local4 - 1, local18 - -1, 512);
			}
			if (arg3 == 3) {
				this.method1365(local4, local18, 32768);
				this.method1365(local4 - 1, local18 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1365(local4, local18, 66560);
			this.method1365(local4, local18 - 1, 4096);
			this.method1365(local4 + 1, local18, 16384);
		}
		if (arg3 == 1) {
			this.method1365(local4, local18, 5120);
			this.method1365(local4 + 1, local18, 16384);
			this.method1365(local4, local18 + 1, 65536);
		}
		if (arg3 == 2) {
			this.method1365(local4, local18, 20480);
			this.method1365(local4, local18 + 1, 65536);
			this.method1365(local4 - 1, local18, 1024);
		}
		if (arg3 == 3) {
			this.method1365(local4, local18, 81920);
			this.method1365(local4 - 1, local18, 1024);
			this.method1365(local4, local18 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIIIII)V")
	public void method1364(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		if (arg2 == 1 || arg2 == 3) {
			local15 = arg5;
			arg5 = arg4;
			arg4 = local15;
		}
		@Pc(24) int local24 = arg1 - this.anInt2131;
		@Pc(29) int local29 = arg3 - this.anInt2116;
		@Pc(39) int local39 = 256;
		if (arg0) {
			local39 = 131328;
		}
		for (local15 = local29; local15 < arg5 + local29; local15++) {
			if (local15 >= 0 && local15 < this.anInt2134) {
				for (@Pc(60) int local60 = local24; local60 < local24 + arg4; local60++) {
					if (local60 >= 0 && local60 < this.anInt2127) {
						this.method1365(local60, local15, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IIII)V")
	private void method1365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray44[arg1][arg0] &= 16777215 - arg2;
	}
}

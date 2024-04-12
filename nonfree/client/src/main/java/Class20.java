import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class20 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_193 = Static12.method257("Use ");

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public static int anInt695 = 0;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private final int anInt681;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private final int anInt679;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	private final int anInt674;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	private final int anInt682;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)Z", line = 5)
	public boolean method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 == arg4 && arg2 == arg1) {
			return true;
		}
		@Pc(29) int local29 = arg4 - this.anInt674;
		@Pc(34) int local34 = arg3 - this.anInt674;
		@Pc(39) int local39 = arg2 - this.anInt682;
		@Pc(44) int local44 = arg1 - this.anInt682;
		if (arg5 == 0) {
			if (arg0 == 0) {
				if (local29 == local34 - 1 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1 && (this.anIntArrayArray9[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 == local34 && local44 == local39 + 1) {
					return true;
				}
				if (local29 == local34 - 1 && local44 == local39 && (this.anIntArrayArray9[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local44 == local39 && (this.anIntArrayArray9[local29][local44] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local29 == local34 + 1 && local39 == local44) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1 && (this.anIntArrayArray9[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local34 == local29 && local39 - 1 == local44) {
					return true;
				}
				if (local29 == local34 - 1 && local44 == local39 && (this.anIntArrayArray9[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				if (local34 - 1 == local29 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 == local34 - 1 && local44 == local39 && (this.anIntArrayArray9[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local39) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1 && (this.anIntArrayArray9[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 - 1 == local29 && local39 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local34 && local44 == local39 + 1 && (this.anIntArrayArray9[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local44 == local39 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 == local34 - 1 && local39 == local44) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local44 && (this.anIntArrayArray9[local29][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local29 == local34 && local39 + 1 == local44 && (this.anIntArrayArray9[local29][local44] & 0x20) == 0) {
				return true;
			}
			if (local29 == local34 && local44 == local39 - 1 && (this.anIntArrayArray9[local29][local44] & 0x2) == 0) {
				return true;
			}
			if (local34 - 1 == local29 && local44 == local39 && (this.anIntArrayArray9[local29][local44] & 0x8) == 0) {
				return true;
			}
			if (local29 == local34 + 1 && local39 == local44 && (this.anIntArrayArray9[local29][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZIIII)V", line = 191)
	public void method528(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt682;
		@Pc(13) int local13 = arg3 - this.anInt674;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method539(128, local13, local4);
				this.method539(8, local13 - 1, local4);
			}
			if (arg1 == 1) {
				this.method539(2, local13, local4);
				this.method539(32, local13, local4 + 1);
			}
			if (arg1 == 2) {
				this.method539(8, local13, local4);
				this.method539(128, local13 + 1, local4);
			}
			if (arg1 == 3) {
				this.method539(32, local13, local4);
				this.method539(2, local13, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method539(1, local13, local4);
				this.method539(16, local13 - 1, local4 + 1);
			}
			if (arg1 == 1) {
				this.method539(4, local13, local4);
				this.method539(64, local13 + 1, local4 + 1);
			}
			if (arg1 == 2) {
				this.method539(16, local13, local4);
				this.method539(1, local13 + 1, local4 + -1);
			}
			if (arg1 == 3) {
				this.method539(64, local13, local4);
				this.method539(4, local13 - 1, local4 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method539(130, local13, local4);
				this.method539(8, local13 - 1, local4);
				this.method539(32, local13, local4 + 1);
			}
			if (arg1 == 1) {
				this.method539(10, local13, local4);
				this.method539(32, local13, local4 + 1);
				this.method539(128, local13 + 1, local4);
			}
			if (arg1 == 2) {
				this.method539(40, local13, local4);
				this.method539(128, local13 + 1, local4);
				this.method539(2, local13, local4 - 1);
			}
			if (arg1 == 3) {
				this.method539(160, local13, local4);
				this.method539(2, local13, local4 - 1);
				this.method539(8, local13 - 1, local4);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method539(65536, local13, local4);
				this.method539(4096, local13 - 1, local4);
			}
			if (arg1 == 1) {
				this.method539(1024, local13, local4);
				this.method539(16384, local13, local4 + 1);
			}
			if (arg1 == 2) {
				this.method539(4096, local13, local4);
				this.method539(65536, local13 + 1, local4);
			}
			if (arg1 == 3) {
				this.method539(16384, local13, local4);
				this.method539(1024, local13, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method539(512, local13, local4);
				this.method539(8192, local13 - 1, local4 + 1);
			}
			if (arg1 == 1) {
				this.method539(2048, local13, local4);
				this.method539(32768, local13 + 1, local4 - -1);
			}
			if (arg1 == 2) {
				this.method539(8192, local13, local4);
				this.method539(512, local13 + 1, local4 + -1);
			}
			if (arg1 == 3) {
				this.method539(32768, local13, local4);
				this.method539(2048, local13 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method539(66560, local13, local4);
			this.method539(4096, local13 - 1, local4);
			this.method539(16384, local13, local4 + 1);
		}
		if (arg1 == 1) {
			this.method539(5120, local13, local4);
			this.method539(16384, local13, local4 + 1);
			this.method539(65536, local13 + 1, local4);
		}
		if (arg1 == 2) {
			this.method539(20480, local13, local4);
			this.method539(65536, local13 + 1, local4);
			this.method539(1024, local13, local4 - 1);
		}
		if (arg1 == 3) {
			this.method539(81920, local13, local4);
			this.method539(1024, local13, local4 - 1);
			this.method539(4096, local13 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZIII)V", line = 412)
	public void method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		if (arg2 == 1 || arg2 == 3) {
			local15 = arg0;
			arg0 = arg1;
			arg1 = local15;
		}
		@Pc(24) int local24 = arg4 - this.anInt674;
		@Pc(30) int local30 = 256;
		if (arg3) {
			local30 = 131328;
		}
		@Pc(41) int local41 = arg5 - this.anInt682;
		for (local15 = local24; local15 < arg0 + local24; local15++) {
			if (local15 >= 0 && local15 < this.anInt679) {
				for (@Pc(57) int local57 = local41; local57 < local41 + arg1; local57++) {
					if (local57 >= 0 && local57 < this.anInt681) {
						this.method530(local30, local57, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V", line = 470)
	private void method530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray9[arg2][arg1] &= 16777215 - arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIIIII)V", line = 482)
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - this.anInt674;
		@Pc(11) int local11 = arg4 - this.anInt682;
		@Pc(31) int local31;
		if (arg3 == 1 || arg3 == 3) {
			local31 = arg5;
			arg5 = arg0;
			arg0 = local31;
		}
		@Pc(37) int local37 = 256;
		if (arg1) {
			local37 = 131328;
		}
		for (local31 = local6; local31 < local6 + arg5; local31++) {
			if (local31 >= 0 && this.anInt679 > local31) {
				for (@Pc(58) int local58 = local11; local58 < local11 + arg0; local58++) {
					if (local58 >= 0 && this.anInt681 > local58) {
						this.method539(local37, local31, local58);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBZIII)V", line = 535)
	public void method532(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt682;
		@Pc(13) int local13 = arg4 - this.anInt674;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method530(128, local4, local13);
				this.method530(8, local4, local13 - 1);
			}
			if (arg3 == 1) {
				this.method530(2, local4, local13);
				this.method530(32, local4 + 1, local13);
			}
			if (arg3 == 2) {
				this.method530(8, local4, local13);
				this.method530(128, local4, local13 + 1);
			}
			if (arg3 == 3) {
				this.method530(32, local4, local13);
				this.method530(2, local4 - 1, local13);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method530(1, local4, local13);
				this.method530(16, local4 + 1, local13 + -1);
			}
			if (arg3 == 1) {
				this.method530(4, local4, local13);
				this.method530(64, local4 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method530(16, local4, local13);
				this.method530(1, local4 - 1, local13 + 1);
			}
			if (arg3 == 3) {
				this.method530(64, local4, local13);
				this.method530(4, local4 - 1, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method530(130, local4, local13);
				this.method530(8, local4, local13 - 1);
				this.method530(32, local4 + 1, local13);
			}
			if (arg3 == 1) {
				this.method530(10, local4, local13);
				this.method530(32, local4 + 1, local13);
				this.method530(128, local4, local13 + 1);
			}
			if (arg3 == 2) {
				this.method530(40, local4, local13);
				this.method530(128, local4, local13 + 1);
				this.method530(2, local4 - 1, local13);
			}
			if (arg3 == 3) {
				this.method530(160, local4, local13);
				this.method530(2, local4 - 1, local13);
				this.method530(8, local4, local13 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method530(65536, local4, local13);
				this.method530(4096, local4, local13 - 1);
			}
			if (arg3 == 1) {
				this.method530(1024, local4, local13);
				this.method530(16384, local4 + 1, local13);
			}
			if (arg3 == 2) {
				this.method530(4096, local4, local13);
				this.method530(65536, local4, local13 + 1);
			}
			if (arg3 == 3) {
				this.method530(16384, local4, local13);
				this.method530(1024, local4 - 1, local13);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method530(512, local4, local13);
				this.method530(8192, local4 + 1, local13 + -1);
			}
			if (arg3 == 1) {
				this.method530(2048, local4, local13);
				this.method530(32768, local4 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method530(8192, local4, local13);
				this.method530(512, local4 - 1, local13 + 1);
			}
			if (arg3 == 3) {
				this.method530(32768, local4, local13);
				this.method530(2048, local4 - 1, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method530(66560, local4, local13);
			this.method530(4096, local4, local13 - 1);
			this.method530(16384, local4 + 1, local13);
		}
		if (arg3 == 1) {
			this.method530(5120, local4, local13);
			this.method530(16384, local4 + 1, local13);
			this.method530(65536, local4, local13 + 1);
		}
		if (arg3 == 2) {
			this.method530(20480, local4, local13);
			this.method530(65536, local4, local13 + 1);
			this.method530(1024, local4 - 1, local13);
		}
		if (arg3 == 3) {
			this.method530(81920, local4, local13);
			this.method530(1024, local4 - 1, local13);
			this.method530(4096, local4, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 823)
	public void method534() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt679; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt681; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt679 - 1 || this.anInt681 - 1 == local7) {
					this.anIntArrayArray9[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray9[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIBI)Z", line = 855)
	public boolean method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg0 == arg4) {
			return true;
		}
		@Pc(28) int local28 = arg3 - this.anInt674;
		@Pc(33) int local33 = arg0 - this.anInt682;
		@Pc(38) int local38 = arg4 - this.anInt682;
		@Pc(43) int local43 = arg5 - this.anInt674;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local28 + 1 == local43 && local33 == local38 && (this.anIntArrayArray9[local43][local33] & 0x80) == 0) {
					return true;
				}
				if (local28 == local43 && local33 == local38 - 1 && (this.anIntArrayArray9[local43][local33] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local28 - 1 == local43 && local38 == local33 && (this.anIntArrayArray9[local43][local33] & 0x8) == 0) {
					return true;
				}
				if (local28 == local43 && local38 - 1 == local33 && (this.anIntArrayArray9[local43][local33] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local28 - 1 == local43 && local38 == local33 && (this.anIntArrayArray9[local43][local33] & 0x8) == 0) {
					return true;
				}
				if (local43 == local28 && local33 == local38 + 1 && (this.anIntArrayArray9[local43][local33] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local43 == local28 + 1 && local38 == local33 && (this.anIntArrayArray9[local43][local33] & 0x80) == 0) {
					return true;
				}
				if (local43 == local28 && local33 == local38 + 1 && (this.anIntArrayArray9[local43][local33] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local43 == local28 && local38 + 1 == local33 && (this.anIntArrayArray9[local43][local33] & 0x20) == 0) {
				return true;
			}
			if (local43 == local28 && local38 - 1 == local33 && (this.anIntArrayArray9[local43][local33] & 0x2) == 0) {
				return true;
			}
			if (local43 == local28 - 1 && local38 == local33 && (this.anIntArrayArray9[local43][local33] & 0x8) == 0) {
				return true;
			}
			if (local43 == local28 + 1 && local33 == local38 && (this.anIntArrayArray9[local43][local33] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V", line = 945)
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt682;
		@Pc(13) int local13 = arg1 - this.anInt674;
		this.anIntArrayArray9[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V", line = 962)
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt681 = arg1;
		this.anInt679 = arg0;
		this.anInt674 = 0;
		this.anInt682 = 0;
		this.anIntArrayArray9 = new int[this.anInt679][this.anInt681];
		this.method534();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V", line = 980)
	public void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt674;
		@Pc(13) int local13 = arg0 - this.anInt682;
		this.anIntArrayArray9[local4][local13] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIZ)Z", line = 996)
	public boolean method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg3 + arg6 - 1;
		@Pc(22) int local22 = arg2 + arg4 - 1;
		if (arg2 <= arg5 && arg5 <= local22 && arg1 >= arg3 && arg1 <= local9) {
			return true;
		} else if (arg5 == arg2 - 1 && arg3 <= arg1 && local9 >= arg1 && (this.anIntArrayArray9[arg5 - this.anInt674][arg1 - this.anInt682] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local22 + 1 == arg5 && arg3 <= arg1 && local9 >= arg1 && (this.anIntArrayArray9[arg5 - this.anInt674][arg1 - this.anInt682] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg3 - 1 && arg2 <= arg5 && local22 >= arg5 && (this.anIntArrayArray9[arg5 - this.anInt674][arg1 - this.anInt682] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local9 + 1 && arg5 >= arg2 && local22 >= arg5 && (this.anIntArrayArray9[arg5 - this.anInt674][arg1 - this.anInt682] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZ)V", line = 1027)
	private void method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray9[arg1][arg2] |= arg0;
	}
}

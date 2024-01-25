import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class106 {

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "[I")
	public static final int[] anIntArray130 = new int[4096];

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	public int anInt3004;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public int anInt3007;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	public int anInt3014;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray130[local4] = Static388.method5737(local4);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIIZII)V")
	public void method2660(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt3006;
		@Pc(13) int local13 = arg3 - this.anInt3007;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method2677(128, local13, local8);
				this.method2677(8, local13 - 1, local8);
			}
			if (arg0 == 1) {
				this.method2677(2, local13, local8);
				this.method2677(32, local13, local8 + 1);
			}
			if (arg0 == 2) {
				this.method2677(8, local13, local8);
				this.method2677(128, local13 + 1, local8);
			}
			if (arg0 == 3) {
				this.method2677(32, local13, local8);
				this.method2677(2, local13, local8 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method2677(1, local13, local8);
				this.method2677(16, local13 - 1, local8 + 1);
			}
			if (arg0 == 1) {
				this.method2677(4, local13, local8);
				this.method2677(64, local13 + 1, local8 - -1);
			}
			if (arg0 == 2) {
				this.method2677(16, local13, local8);
				this.method2677(1, local13 + 1, local8 + -1);
			}
			if (arg0 == 3) {
				this.method2677(64, local13, local8);
				this.method2677(4, local13 - 1, local8 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method2677(130, local13, local8);
				this.method2677(8, local13 - 1, local8);
				this.method2677(32, local13, local8 + 1);
			}
			if (arg0 == 1) {
				this.method2677(10, local13, local8);
				this.method2677(32, local13, local8 + 1);
				this.method2677(128, local13 + 1, local8);
			}
			if (arg0 == 2) {
				this.method2677(40, local13, local8);
				this.method2677(128, local13 + 1, local8);
				this.method2677(2, local13, local8 - 1);
			}
			if (arg0 == 3) {
				this.method2677(160, local13, local8);
				this.method2677(2, local13, local8 - 1);
				this.method2677(8, local13 - 1, local8);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method2677(65536, local13, local8);
					this.method2677(4096, local13 - 1, local8);
				}
				if (arg0 == 1) {
					this.method2677(1024, local13, local8);
					this.method2677(16384, local13, local8 + 1);
				}
				if (arg0 == 2) {
					this.method2677(4096, local13, local8);
					this.method2677(65536, local13 + 1, local8);
				}
				if (arg0 == 3) {
					this.method2677(16384, local13, local8);
					this.method2677(1024, local13, local8 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method2677(512, local13, local8);
					this.method2677(8192, local13 - 1, local8 + 1);
				}
				if (arg0 == 1) {
					this.method2677(2048, local13, local8);
					this.method2677(32768, local13 + 1, local8 + 1);
				}
				if (arg0 == 2) {
					this.method2677(8192, local13, local8);
					this.method2677(512, local13 + 1, local8 + -1);
				}
				if (arg0 == 3) {
					this.method2677(32768, local13, local8);
					this.method2677(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method2677(66560, local13, local8);
					this.method2677(4096, local13 - 1, local8);
					this.method2677(16384, local13, local8 + 1);
				}
				if (arg0 == 1) {
					this.method2677(5120, local13, local8);
					this.method2677(16384, local13, local8 + 1);
					this.method2677(65536, local13 + 1, local8);
				}
				if (arg0 == 2) {
					this.method2677(20480, local13, local8);
					this.method2677(65536, local13 + 1, local8);
					this.method2677(1024, local13, local8 - 1);
				}
				if (arg0 == 3) {
					this.method2677(81920, local13, local8);
					this.method2677(1024, local13, local8 - 1);
					this.method2677(4096, local13 - 1, local8);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method2677(536870912, local13, local8);
				this.method2677(33554432, local13 - 1, local8);
			}
			if (arg0 == 1) {
				this.method2677(8388608, local13, local8);
				this.method2677(134217728, local13, local8 + 1);
			}
			if (arg0 == 2) {
				this.method2677(33554432, local13, local8);
				this.method2677(536870912, local13 + 1, local8);
			}
			if (arg0 == 3) {
				this.method2677(134217728, local13, local8);
				this.method2677(8388608, local13, local8 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method2677(4194304, local13, local8);
				this.method2677(67108864, local13 - 1, local8 + 1);
			}
			if (arg0 == 1) {
				this.method2677(16777216, local13, local8);
				this.method2677(268435456, local13 + 1, local8 - -1);
			}
			if (arg0 == 2) {
				this.method2677(67108864, local13, local8);
				this.method2677(4194304, local13 + 1, local8 + -1);
			}
			if (arg0 == 3) {
				this.method2677(268435456, local13, local8);
				this.method2677(16777216, local13 - 1, local8 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2677(545259520, local13, local8);
			this.method2677(33554432, local13 - 1, local8);
			this.method2677(134217728, local13, local8 + 1);
		}
		if (arg0 == 1) {
			this.method2677(41943040, local13, local8);
			this.method2677(134217728, local13, local8 + 1);
			this.method2677(536870912, local13 + 1, local8);
		}
		if (arg0 == 2) {
			this.method2677(167772160, local13, local8);
			this.method2677(536870912, local13 + 1, local8);
			this.method2677(8388608, local13, local8 - 1);
		}
		if (arg0 == 3) {
			this.method2677(671088640, local13, local8);
			this.method2677(8388608, local13, local8 - 1);
			this.method2677(33554432, local13 - 1, local8);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public void method2661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 - this.anInt3007;
		@Pc(26) int local26 = arg0 - this.anInt3006;
		this.anIntArrayArray8[local17][local26] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(III)V")
	public void method2662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt3007;
		@Pc(17) int local17 = arg1 - this.anInt3006;
		this.anIntArrayArray8[local12][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method2663() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt3004; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt3014; local8++) {
				if (local5 == 0 || local8 == 0 || this.anInt3004 - 5 <= local5 || this.anInt3014 - 5 <= local8) {
					this.anIntArrayArray8[local5][local8] = -1;
				} else {
					this.anIntArrayArray8[local5][local8] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZZIZI)V")
	public void method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 256;
		if (arg2) {
			local11 = 131328;
		}
		@Pc(22) int local22 = arg1 - this.anInt3006;
		@Pc(27) int local27 = arg3 - this.anInt3007;
		if (arg4) {
			local11 |= 0x40000000;
		}
		for (@Pc(35) int local35 = local27; local35 < local27 + arg0; local35++) {
			if (local35 >= 0 && local35 < this.anInt3004) {
				for (@Pc(52) int local52 = local22; local52 < local22 + arg5; local52++) {
					if (local52 >= 0 && local52 < this.anInt3014) {
						this.method2667(local52, local11, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg6 && arg0 == arg1) {
				return true;
			}
		} else if (arg6 <= arg3 && arg5 + arg6 - 1 >= arg3 && arg0 <= arg0 && arg0 <= arg0 + arg5 - 1) {
			return true;
		}
		@Pc(62) int local62 = arg3 - this.anInt3007;
		@Pc(67) int local67 = arg0 - this.anInt3006;
		@Pc(72) int local72 = arg1 - this.anInt3006;
		@Pc(82) int local82 = arg6 - this.anInt3007;
		if (arg5 == 1) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local62 - 1 == local82 && local67 == local72) {
						return true;
					}
					if (local62 == local82 && local72 == local67 + 1 && (this.anIntArrayArray8[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local82 && local72 == local67 - 1 && (this.anIntArrayArray8[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local82 == local62 && local72 == local67 + 1) {
						return true;
					}
					if (local82 == local62 - 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local82 && local72 == local67 && (this.anIntArrayArray8[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local82 == local62 + 1 && local67 == local72) {
						return true;
					}
					if (local62 == local82 && local72 == local67 + 1 && (this.anIntArrayArray8[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 == local62 && local67 - 1 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local62 == local82 && local72 == local67 - 1) {
						return true;
					}
					if (local82 == local62 - 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local62 + 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local82 == local62 - 1 && local67 == local72) {
						return true;
					}
					if (local82 == local62 && local67 + 1 == local72) {
						return true;
					}
					if (local82 == local62 + 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 == local82 && local67 - 1 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local82 == local62 - 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local82 && local72 == local67 + 1) {
						return true;
					}
					if (local82 == local62 + 1 && local72 == local67) {
						return true;
					}
					if (local62 == local82 && local72 == local67 - 1 && (this.anIntArrayArray8[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local82 == local62 - 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local62 && local67 + 1 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local82 && local67 == local72) {
						return true;
					}
					if (local82 == local62 && local67 - 1 == local72) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local82 == local62 - 1 && local72 == local67) {
						return true;
					}
					if (local82 == local62 && local72 == local67 + 1 && (this.anIntArrayArray8[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local82 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 == local62 && local67 - 1 == local72) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local62 == local82 && local72 == local67 + 1 && (this.anIntArrayArray8[local82][local72] & 0x20) == 0) {
					return true;
				}
				if (local82 == local62 && local67 - 1 == local72 && (this.anIntArrayArray8[local82][local72] & 0x2) == 0) {
					return true;
				}
				if (local82 == local62 - 1 && local72 == local67 && (this.anIntArrayArray8[local82][local72] & 0x8) == 0) {
					return true;
				}
				if (local82 == local62 + 1 && local67 == local72 && (this.anIntArrayArray8[local82][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(790) int local790 = arg5 + local82 - 1;
			@Pc(796) int local796 = local72 + arg5 - 1;
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local82 == local62 - arg5 && local67 >= local72 && local796 >= local67) {
						return true;
					}
					if (local62 >= local82 && local62 <= local790 && local72 == local67 + 1 && (this.anIntArrayArray8[local62][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 <= local62 && local62 <= local790 && local72 == local67 - arg5 && (this.anIntArrayArray8[local62][local796] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local62 >= local82 && local62 <= local790 && local72 == local67 + 1) {
						return true;
					}
					if (local82 == local62 - arg5 && local72 <= local67 && local796 >= local67 && (this.anIntArrayArray8[local790][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local62 + 1 && local67 >= local72 && local796 >= local67 && (this.anIntArrayArray8[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local82 == local62 + 1 && local72 <= local67 && local67 <= local796) {
						return true;
					}
					if (local62 >= local82 && local62 <= local790 && local72 == local67 + 1 && (this.anIntArrayArray8[local62][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 <= local62 && local790 >= local62 && local67 - arg5 == local72 && (this.anIntArrayArray8[local62][local796] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local82 <= local62 && local790 >= local62 && local67 - arg5 == local72) {
						return true;
					}
					if (local62 - arg5 == local82 && local67 >= local72 && local67 <= local796 && (this.anIntArrayArray8[local790][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local82 && local72 <= local67 && local796 >= local67 && (this.anIntArrayArray8[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local82 == local62 - arg5 && local72 <= local67 && local796 >= local67) {
						return true;
					}
					if (local82 <= local62 && local62 <= local790 && local67 + 1 == local72) {
						return true;
					}
					if (local62 + 1 == local82 && local72 <= local67 && local67 <= local796 && (this.anIntArrayArray8[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local82 && local790 >= local62 && local72 == local67 - arg5 && (this.anIntArrayArray8[local62][local796] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local62 - arg5 == local82 && local67 >= local72 && local67 <= local796 && (this.anIntArrayArray8[local790][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 <= local62 && local62 <= local790 && local67 + 1 == local72) {
						return true;
					}
					if (local62 + 1 == local82 && local67 >= local72 && local67 <= local796) {
						return true;
					}
					if (local82 <= local62 && local790 >= local62 && local67 - arg5 == local72 && (this.anIntArrayArray8[local62][local796] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local62 - arg5 == local82 && local72 <= local67 && local796 >= local67 && (this.anIntArrayArray8[local790][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 >= local82 && local790 >= local62 && local67 + 1 == local72 && (this.anIntArrayArray8[local62][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 == local62 + 1 && local72 <= local67 && local67 <= local796) {
						return true;
					}
					if (local62 >= local82 && local790 >= local62 && local67 - arg5 == local72) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local82 == local62 - arg5 && local67 >= local72 && local67 <= local796) {
						return true;
					}
					if (local62 >= local82 && local62 <= local790 && local72 == local67 + 1 && (this.anIntArrayArray8[local62][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local82 && local72 <= local67 && local67 <= local796 && (this.anIntArrayArray8[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local82 && local62 <= local790 && local67 - arg5 == local72) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local82 <= local62 && local790 >= local62 && local72 == local67 + 1 && (this.anIntArrayArray8[local62][local72] & 0x2C0120) == 0) {
					return true;
				}
				if (local82 <= local62 && local62 <= local790 && local72 == local67 - arg5 && (this.anIntArrayArray8[local62][local796] & 0x2C0102) == 0) {
					return true;
				}
				if (local82 == local62 - arg5 && local67 >= local72 && local796 >= local67 && (this.anIntArrayArray8[local790][local67] & 0x2C0108) == 0) {
					return true;
				}
				if (local62 + 1 == local82 && local72 <= local67 && local67 <= local796 && (this.anIntArrayArray8[local82][local67] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZIBZII)V")
	public void method2666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg2) {
			local5 = 131328;
		}
		if (arg4) {
			local5 |= 0x40000000;
		}
		@Pc(25) int local25;
		if (arg3 == 1 || arg3 == 3) {
			local25 = arg6;
			arg6 = arg0;
			arg0 = local25;
		}
		@Pc(38) int local38 = arg5 - this.anInt3007;
		@Pc(43) int local43 = arg1 - this.anInt3006;
		for (local25 = local38; local25 < local38 + arg6; local25++) {
			if (local25 >= 0 && local25 < this.anInt3004) {
				for (@Pc(57) int local57 = local43; local57 < local43 + arg0; local57++) {
					if (local57 >= 0 && local57 < this.anInt3014) {
						this.method2677(local5, local25, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V")
	private void method2667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray8[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIIIIII)Z")
	public boolean method2669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg5 == arg6 && arg2 == arg0) {
				return true;
			}
		} else if (arg6 >= arg5 && arg6 <= arg5 + arg1 - 1 && arg0 >= arg0 && arg0 <= arg0 + arg1 - 1) {
			return true;
		}
		@Pc(67) int local67 = arg2 - this.anInt3006;
		@Pc(72) int local72 = arg5 - this.anInt3007;
		@Pc(77) int local77 = arg0 - this.anInt3006;
		@Pc(82) int local82 = arg6 - this.anInt3007;
		if (arg1 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local82 + 1 == local72 && local67 == local77 && (this.anIntArrayArray8[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local82 == local72 && local77 - 1 == local67 && (this.anIntArrayArray8[local72][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local82 - 1 == local72 && local77 == local67 && (this.anIntArrayArray8[local72][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 == local82 && local77 - 1 == local67 && (this.anIntArrayArray8[local72][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local82 - 1 == local72 && local67 == local77 && (this.anIntArrayArray8[local72][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 == local82 && local77 + 1 == local67 && (this.anIntArrayArray8[local72][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local82 + 1 && local67 == local77 && (this.anIntArrayArray8[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local82 == local72 && local67 == local77 + 1 && (this.anIntArrayArray8[local72][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local72 == local82 && local67 == local77 + 1 && (this.anIntArrayArray8[local72][local67] & 0x20) == 0) {
					return true;
				}
				if (local82 == local72 && local67 == local77 - 1 && (this.anIntArrayArray8[local72][local67] & 0x2) == 0) {
					return true;
				}
				if (local72 == local82 - 1 && local67 == local77 && (this.anIntArrayArray8[local72][local67] & 0x8) == 0) {
					return true;
				}
				if (local82 + 1 == local72 && local77 == local67 && (this.anIntArrayArray8[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(93) int local93 = arg1 + local72 - 1;
			@Pc(100) int local100 = local67 + arg1 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local82 + 1 == local72 && local77 >= local67 && local100 >= local77 && (this.anIntArrayArray8[local72][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 <= local82 && local82 <= local93 && local67 == local77 - arg1 && (this.anIntArrayArray8[local82][local100] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local82 - arg1 && local67 <= local77 && local77 <= local100 && (this.anIntArrayArray8[local93][local77] & 0x8) == 0) {
						return true;
					}
					if (local82 >= local72 && local82 <= local93 && local77 - arg1 == local67 && (this.anIntArrayArray8[local82][local100] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local82 - arg1 == local72 && local67 <= local77 && local77 <= local100 && (this.anIntArrayArray8[local93][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local82 && local82 <= local93 && local67 == local77 + 1 && (this.anIntArrayArray8[local82][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local82 + 1 == local72 && local77 >= local67 && local100 >= local77 && (this.anIntArrayArray8[local72][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 <= local82 && local93 >= local82 && local67 == local77 + 1 && (this.anIntArrayArray8[local82][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local82 >= local72 && local93 >= local82 && local77 + 1 == local67 && (this.anIntArrayArray8[local82][local67] & 0x20) == 0) {
					return true;
				}
				if (local82 >= local72 && local82 <= local93 && local77 - arg1 == local67 && (this.anIntArrayArray8[local82][local100] & 0x2) == 0) {
					return true;
				}
				if (local72 == local82 - arg1 && local67 <= local77 && local77 <= local100 && (this.anIntArrayArray8[local93][local77] & 0x8) == 0) {
					return true;
				}
				if (local72 == local82 + 1 && local67 <= local77 && local77 <= local100 && (this.anIntArrayArray8[local72][local77] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIBIIII)Z")
	public boolean method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg4 + arg0;
		@Pc(18) int local18 = arg1 + arg8;
		@Pc(22) int local22 = arg6 + arg5;
		@Pc(26) int local26 = arg7 + arg3;
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (arg4 == local22 && (arg2 & 0x2) == 0) {
			local40 = arg3 >= arg8 ? arg3 : arg8;
			local51 = local26 > local18 ? local18 : local26;
			while (local51 > local40) {
				if ((this.anIntArrayArray8[local22 - this.anInt3007 - 1][local40 - this.anInt3006] & 0x8) == 0) {
					return true;
				}
				local40++;
			}
		} else if (arg5 == local14 && (arg2 & 0x8) == 0) {
			local40 = arg3 < arg8 ? arg8 : arg3;
			local51 = local18 >= local26 ? local26 : local18;
			while (local40 < local51) {
				if ((this.anIntArrayArray8[arg5 - this.anInt3007][local40 - this.anInt3006] & 0x80) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local26 == arg8 && (arg2 & 0x1) == 0) {
			local40 = arg5 < arg4 ? arg4 : arg5;
			local51 = local22 <= local14 ? local22 : local14;
			while (local40 < local51) {
				if ((this.anIntArrayArray8[local40 - this.anInt3007][local26 - this.anInt3006 - 1] & 0x2) == 0) {
					return true;
				}
				local40++;
			}
		} else if (arg3 == local18 && (arg2 & 0x4) == 0) {
			local40 = arg4 > arg5 ? arg4 : arg5;
			local51 = local14 >= local22 ? local22 : local14;
			while (local40 < local51) {
				if ((this.anIntArrayArray8[local40 - this.anInt3007][arg3 - this.anInt3006] & 0x20) == 0) {
					return true;
				}
				local40++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZIII)V")
	public void method2672(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt3007;
		@Pc(13) int local13 = arg5 - this.anInt3006;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2667(local13, 128, local8);
				this.method2667(local13, 8, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2667(local13, 2, local8);
				this.method2667(local13 + 1, 32, local8);
			}
			if (arg1 == 2) {
				this.method2667(local13, 8, local8);
				this.method2667(local13, 128, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2667(local13, 32, local8);
				this.method2667(local13 - 1, 2, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2667(local13, 1, local8);
				this.method2667(local13 + 1, 16, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2667(local13, 4, local8);
				this.method2667(local13 + 1, 64, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2667(local13, 16, local8);
				this.method2667(local13 - 1, 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2667(local13, 64, local8);
				this.method2667(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method2667(local13, 130, local8);
				this.method2667(local13, 8, local8 - 1);
				this.method2667(local13 + 1, 32, local8);
			}
			if (arg1 == 1) {
				this.method2667(local13, 10, local8);
				this.method2667(local13 + 1, 32, local8);
				this.method2667(local13, 128, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2667(local13, 40, local8);
				this.method2667(local13, 128, local8 + 1);
				this.method2667(local13 - 1, 2, local8);
			}
			if (arg1 == 3) {
				this.method2667(local13, 160, local8);
				this.method2667(local13 - 1, 2, local8);
				this.method2667(local13, 8, local8 - 1);
			}
		}
		if (arg0) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method2667(local13, 65536, local8);
					this.method2667(local13, 4096, local8 - 1);
				}
				if (arg1 == 1) {
					this.method2667(local13, 1024, local8);
					this.method2667(local13 + 1, 16384, local8);
				}
				if (arg1 == 2) {
					this.method2667(local13, 4096, local8);
					this.method2667(local13, 65536, local8 + 1);
				}
				if (arg1 == 3) {
					this.method2667(local13, 16384, local8);
					this.method2667(local13 - 1, 1024, local8);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method2667(local13, 512, local8);
					this.method2667(local13 + 1, 8192, local8 - 1);
				}
				if (arg1 == 1) {
					this.method2667(local13, 2048, local8);
					this.method2667(local13 + 1, 32768, local8 + 1);
				}
				if (arg1 == 2) {
					this.method2667(local13, 8192, local8);
					this.method2667(local13 - 1, 512, local8 + 1);
				}
				if (arg1 == 3) {
					this.method2667(local13, 32768, local8);
					this.method2667(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method2667(local13, 66560, local8);
					this.method2667(local13, 4096, local8 - 1);
					this.method2667(local13 + 1, 16384, local8);
				}
				if (arg1 == 1) {
					this.method2667(local13, 5120, local8);
					this.method2667(local13 + 1, 16384, local8);
					this.method2667(local13, 65536, local8 + 1);
				}
				if (arg1 == 2) {
					this.method2667(local13, 20480, local8);
					this.method2667(local13, 65536, local8 + 1);
					this.method2667(local13 - 1, 1024, local8);
				}
				if (arg1 == 3) {
					this.method2667(local13, 81920, local8);
					this.method2667(local13 - 1, 1024, local8);
					this.method2667(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2667(local13, 536870912, local8);
				this.method2667(local13, 33554432, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2667(local13, 8388608, local8);
				this.method2667(local13 + 1, 134217728, local8);
			}
			if (arg1 == 2) {
				this.method2667(local13, 33554432, local8);
				this.method2667(local13, 536870912, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2667(local13, 134217728, local8);
				this.method2667(local13 - 1, 8388608, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2667(local13, 4194304, local8);
				this.method2667(local13 + 1, 67108864, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2667(local13, 16777216, local8);
				this.method2667(local13 + 1, 268435456, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2667(local13, 67108864, local8);
				this.method2667(local13 - 1, 4194304, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2667(local13, 268435456, local8);
				this.method2667(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2667(local13, 545259520, local8);
			this.method2667(local13, 33554432, local8 - 1);
			this.method2667(local13 + 1, 134217728, local8);
		}
		if (arg1 == 1) {
			this.method2667(local13, 41943040, local8);
			this.method2667(local13 + 1, 134217728, local8);
			this.method2667(local13, 536870912, local8 + 1);
		}
		if (arg1 == 2) {
			this.method2667(local13, 167772160, local8);
			this.method2667(local13, 536870912, local8 + 1);
			this.method2667(local13 - 1, 8388608, local8);
		}
		if (arg1 == 3) {
			this.method2667(local13, 671088640, local8);
			this.method2667(local13 - 1, 8388608, local8);
			this.method2667(local13, 33554432, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBIIIIII)Z")
	public boolean method2674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static173.method2972(arg1, arg7, arg0, arg5, arg4, arg6, arg6, arg2) ? true : this.method2670(arg6, arg6, arg3, arg5, arg2, arg7, arg0, arg4, arg1);
		}
		@Pc(46) int local46 = arg7 + arg0 - 1;
		@Pc(53) int local53 = arg5 + arg4 - 1;
		if (arg7 <= arg2 && local46 >= arg2 && arg5 <= arg1 && arg1 <= local53) {
			return true;
		} else if (arg2 == arg7 - 1 && arg1 >= arg5 && local53 >= arg1 && (this.anIntArrayArray8[arg2 - this.anInt3007][arg1 - this.anInt3006] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg2 && arg1 >= arg5 && arg1 <= local53 && (this.anIntArrayArray8[arg2 - this.anInt3007][arg1 - this.anInt3006] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg1 && arg7 <= arg2 && local46 >= arg2 && (this.anIntArrayArray8[arg2 - this.anInt3007][arg1 - this.anInt3006] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local53 + 1 == arg1 && arg2 >= arg7 && local46 >= arg2 && (this.anIntArrayArray8[arg2 - this.anInt3007][arg1 - this.anInt3006] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)V")
	public void method2675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3006;
		@Pc(13) int local13 = arg1 - this.anInt3007;
		this.anIntArrayArray8[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)V")
	public void method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3006;
		@Pc(13) int local13 = arg1 - this.anInt3007;
		this.anIntArrayArray8[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBII)V")
	private void method2677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray8[arg1][arg2] &= ~arg0;
	}
}

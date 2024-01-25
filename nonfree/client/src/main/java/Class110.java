import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class110 {

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public int anInt2712;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public int anInt2719;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	public int anInt2726;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZIIZ)V")
	public void method2361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt2712;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(35) int local35 = arg1 - this.anInt2726;
		@Pc(43) int local43;
		if (arg5 == 1 || arg5 == 3) {
			local43 = arg2;
			arg2 = arg0;
			arg0 = local43;
		}
		for (local43 = local18; local43 < local18 + arg2; local43++) {
			if (local43 >= 0 && local43 < this.anInt2719) {
				for (@Pc(59) int local59 = local35; local59 < local35 + arg0; local59++) {
					if (local59 >= 0 && local59 < this.anInt2725) {
						this.method2366(local7, local59, local43);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIII)V")
	private void method2362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method2363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg3 == arg1 && arg4 == arg0) {
				return true;
			}
		} else if (arg1 <= arg3 && arg2 + arg1 - 1 >= arg3 && arg4 >= arg4 && arg4 <= arg4 + arg2 - 1) {
			return true;
		}
		@Pc(62) int local62 = arg4 - this.anInt2726;
		@Pc(67) int local67 = arg0 - this.anInt2726;
		@Pc(72) int local72 = arg3 - this.anInt2712;
		@Pc(77) int local77 = arg1 - this.anInt2712;
		if (arg2 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local77 == local72 + 1 && local62 == local67 && (this.anIntArrayArray14[local77][local67] & 0x80) == 0) {
						return true;
					}
					if (local77 == local72 && local67 == local62 - 1 && (this.anIntArrayArray14[local77][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local72 - 1 == local77 && local67 == local62 && (this.anIntArrayArray14[local77][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 == local77 && local67 == local62 - 1 && (this.anIntArrayArray14[local77][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local72 - 1 == local77 && local67 == local62 && (this.anIntArrayArray14[local77][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 == local77 && local67 == local62 + 1 && (this.anIntArrayArray14[local77][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local77 == local72 + 1 && local67 == local62 && (this.anIntArrayArray14[local77][local67] & 0x80) == 0) {
						return true;
					}
					if (local77 == local72 && local62 + 1 == local67 && (this.anIntArrayArray14[local77][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local72 == local77 && local67 == local62 + 1 && (this.anIntArrayArray14[local77][local67] & 0x20) == 0) {
					return true;
				}
				if (local72 == local77 && local62 - 1 == local67 && (this.anIntArrayArray14[local77][local67] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local77 && local67 == local62 && (this.anIntArrayArray14[local77][local67] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local77 && local62 == local67 && (this.anIntArrayArray14[local77][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(405) int local405 = arg2 + local77 - 1;
			@Pc(411) int local411 = arg2 + local67 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local72 + 1 == local77 && local62 >= local67 && local62 <= local411 && (this.anIntArrayArray14[local77][local62] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local77 && local72 <= local405 && local62 - arg2 == local67 && (this.anIntArrayArray14[local72][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local77 == local72 - arg2 && local67 <= local62 && local411 >= local62 && (this.anIntArrayArray14[local405][local62] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local72 && local72 <= local405 && local67 == local62 - arg2 && (this.anIntArrayArray14[local72][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local72 - arg2 == local77 && local67 <= local62 && local62 <= local411 && (this.anIntArrayArray14[local405][local62] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local72 && local405 >= local72 && local62 + 1 == local67 && (this.anIntArrayArray14[local72][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local72 + 1 == local77 && local62 >= local67 && local62 <= local411 && (this.anIntArrayArray14[local77][local62] & 0x80) == 0) {
						return true;
					}
					if (local77 <= local72 && local72 <= local405 && local62 + 1 == local67 && (this.anIntArrayArray14[local72][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local72 >= local77 && local405 >= local72 && local62 + 1 == local67 && (this.anIntArrayArray14[local72][local67] & 0x20) == 0) {
					return true;
				}
				if (local77 <= local72 && local72 <= local405 && local62 - arg2 == local67 && (this.anIntArrayArray14[local72][local411] & 0x2) == 0) {
					return true;
				}
				if (local72 - arg2 == local77 && local62 >= local67 && local411 >= local62 && (this.anIntArrayArray14[local405][local62] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local77 && local67 <= local62 && local62 <= local411 && (this.anIntArrayArray14[local77][local62] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBI)V")
	public void method2364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2726;
		@Pc(19) int local19 = arg1 - this.anInt2712;
		this.anIntArrayArray14[local19][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method2365() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2719; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2725; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt2719 - 5 || this.anInt2725 - 5 <= local15) {
					this.anIntArrayArray14[local11][local15] = -1;
				} else {
					this.anIntArrayArray14[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V")
	private void method2366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZIIIZ)V")
	public void method2368(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg3 - this.anInt2712;
		@Pc(13) int local13 = arg0 - this.anInt2726;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method2362(128, local13, local8);
				this.method2362(8, local13, local8 - 1);
			}
			if (arg4 == 1) {
				this.method2362(2, local13, local8);
				this.method2362(32, local13 + 1, local8);
			}
			if (arg4 == 2) {
				this.method2362(8, local13, local8);
				this.method2362(128, local13, local8 + 1);
			}
			if (arg4 == 3) {
				this.method2362(32, local13, local8);
				this.method2362(2, local13 - 1, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method2362(1, local13, local8);
				this.method2362(16, local13 + 1, local8 - 1);
			}
			if (arg4 == 1) {
				this.method2362(4, local13, local8);
				this.method2362(64, local13 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method2362(16, local13, local8);
				this.method2362(1, local13 - 1, local8 - -1);
			}
			if (arg4 == 3) {
				this.method2362(64, local13, local8);
				this.method2362(4, local13 - 1, local8 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method2362(130, local13, local8);
				this.method2362(8, local13, local8 - 1);
				this.method2362(32, local13 + 1, local8);
			}
			if (arg4 == 1) {
				this.method2362(10, local13, local8);
				this.method2362(32, local13 + 1, local8);
				this.method2362(128, local13, local8 + 1);
			}
			if (arg4 == 2) {
				this.method2362(40, local13, local8);
				this.method2362(128, local13, local8 + 1);
				this.method2362(2, local13 - 1, local8);
			}
			if (arg4 == 3) {
				this.method2362(160, local13, local8);
				this.method2362(2, local13 - 1, local8);
				this.method2362(8, local13, local8 - 1);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method2362(65536, local13, local8);
					this.method2362(4096, local13, local8 - 1);
				}
				if (arg4 == 1) {
					this.method2362(1024, local13, local8);
					this.method2362(16384, local13 + 1, local8);
				}
				if (arg4 == 2) {
					this.method2362(4096, local13, local8);
					this.method2362(65536, local13, local8 + 1);
				}
				if (arg4 == 3) {
					this.method2362(16384, local13, local8);
					this.method2362(1024, local13 - 1, local8);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method2362(512, local13, local8);
					this.method2362(8192, local13 + 1, local8 + -1);
				}
				if (arg4 == 1) {
					this.method2362(2048, local13, local8);
					this.method2362(32768, local13 + 1, local8 + 1);
				}
				if (arg4 == 2) {
					this.method2362(8192, local13, local8);
					this.method2362(512, local13 - 1, local8 + 1);
				}
				if (arg4 == 3) {
					this.method2362(32768, local13, local8);
					this.method2362(2048, local13 - 1, local8 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method2362(66560, local13, local8);
					this.method2362(4096, local13, local8 - 1);
					this.method2362(16384, local13 + 1, local8);
				}
				if (arg4 == 1) {
					this.method2362(5120, local13, local8);
					this.method2362(16384, local13 + 1, local8);
					this.method2362(65536, local13, local8 + 1);
				}
				if (arg4 == 2) {
					this.method2362(20480, local13, local8);
					this.method2362(65536, local13, local8 + 1);
					this.method2362(1024, local13 - 1, local8);
				}
				if (arg4 == 3) {
					this.method2362(81920, local13, local8);
					this.method2362(1024, local13 - 1, local8);
					this.method2362(4096, local13, local8 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method2362(536870912, local13, local8);
				this.method2362(33554432, local13, local8 - 1);
			}
			if (arg4 == 1) {
				this.method2362(8388608, local13, local8);
				this.method2362(134217728, local13 + 1, local8);
			}
			if (arg4 == 2) {
				this.method2362(33554432, local13, local8);
				this.method2362(536870912, local13, local8 + 1);
			}
			if (arg4 == 3) {
				this.method2362(134217728, local13, local8);
				this.method2362(8388608, local13 - 1, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method2362(4194304, local13, local8);
				this.method2362(67108864, local13 + 1, local8 + -1);
			}
			if (arg4 == 1) {
				this.method2362(16777216, local13, local8);
				this.method2362(268435456, local13 + 1, local8 - -1);
			}
			if (arg4 == 2) {
				this.method2362(67108864, local13, local8);
				this.method2362(4194304, local13 - 1, local8 - -1);
			}
			if (arg4 == 3) {
				this.method2362(268435456, local13, local8);
				this.method2362(16777216, local13 - 1, local8 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2362(545259520, local13, local8);
			this.method2362(33554432, local13, local8 - 1);
			this.method2362(134217728, local13 + 1, local8);
		}
		if (arg4 == 1) {
			this.method2362(41943040, local13, local8);
			this.method2362(134217728, local13 + 1, local8);
			this.method2362(536870912, local13, local8 + 1);
		}
		if (arg4 == 2) {
			this.method2362(167772160, local13, local8);
			this.method2362(536870912, local13, local8 + 1);
			this.method2362(8388608, local13 - 1, local8);
		}
		if (arg4 == 3) {
			this.method2362(671088640, local13, local8);
			this.method2362(8388608, local13 - 1, local8);
			this.method2362(33554432, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public void method2369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt2726;
		@Pc(21) int local21 = arg0 - this.anInt2712;
		this.anIntArrayArray14[local21][local16] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZIII)Z")
	public boolean method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg1 == arg5 && arg6 == arg3) {
				return true;
			}
		} else if (arg5 <= arg1 && arg2 + arg5 - 1 >= arg1 && arg3 >= arg3 && arg3 <= arg3 + arg2 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg3 - this.anInt2726;
		@Pc(62) int local62 = arg6 - this.anInt2726;
		@Pc(67) int local67 = arg1 - this.anInt2712;
		@Pc(72) int local72 = arg5 - this.anInt2712;
		if (arg2 == 1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					if (local72 == local67 - 1 && local62 == local57) {
						return true;
					}
					if (local72 == local67 && local62 == local57 + 1 && (this.anIntArrayArray14[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 && local57 - 1 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local67 && local57 + 1 == local62) {
						return true;
					}
					if (local72 == local67 - 1 && local57 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local62 == local57 && (this.anIntArrayArray14[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local67 + 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 == local57 + 1 && (this.anIntArrayArray14[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local62 == local57 - 1 && (this.anIntArrayArray14[local72][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 == local72 && local62 == local57 - 1) {
						return true;
					}
					if (local67 - 1 == local72 && local57 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 == local57 && (this.anIntArrayArray14[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					if (local72 == local67 - 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 == local57 + 1) {
						return true;
					}
					if (local67 + 1 == local72 && local57 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local57 - 1 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local67 - 1 && local62 == local57 && (this.anIntArrayArray14[local72][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 && local57 + 1 == local62) {
						return true;
					}
					if (local67 + 1 == local72 && local57 == local62) {
						return true;
					}
					if (local67 == local72 && local62 == local57 - 1 && (this.anIntArrayArray14[local72][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local67 - 1 && local57 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 && local62 == local57 + 1 && (this.anIntArrayArray14[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 == local57 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local67 - 1 && local62 == local57) {
						return true;
					}
					if (local67 == local72 && local57 + 1 == local62 && (this.anIntArrayArray14[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 == local57 && (this.anIntArrayArray14[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local57 - 1 == local62) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local72 == local67 && local57 + 1 == local62 && (this.anIntArrayArray14[local72][local62] & 0x20) == 0) {
					return true;
				}
				if (local67 == local72 && local62 == local57 - 1 && (this.anIntArrayArray14[local72][local62] & 0x2) == 0) {
					return true;
				}
				if (local67 - 1 == local72 && local62 == local57 && (this.anIntArrayArray14[local72][local62] & 0x8) == 0) {
					return true;
				}
				if (local72 == local67 + 1 && local62 == local57 && (this.anIntArrayArray14[local72][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(809) int local809 = arg2 + local72 - 1;
			@Pc(815) int local815 = local62 + arg2 - 1;
			if (arg0 == 0) {
				if (arg4 == 0) {
					if (local67 - arg2 == local72 && local62 <= local57 && local57 <= local815) {
						return true;
					}
					if (local67 >= local72 && local67 <= local809 && local57 + 1 == local62 && (this.anIntArrayArray14[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local72 && local67 <= local809 && local57 - arg2 == local62 && (this.anIntArrayArray14[local67][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 >= local72 && local67 <= local809 && local62 == local57 + 1) {
						return true;
					}
					if (local67 - arg2 == local72 && local57 >= local62 && local815 >= local57 && (this.anIntArrayArray14[local809][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 >= local62 && local815 >= local57 && (this.anIntArrayArray14[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local67 + 1 && local57 >= local62 && local815 >= local57) {
						return true;
					}
					if (local72 <= local67 && local67 <= local809 && local62 == local57 + 1 && (this.anIntArrayArray14[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local72 && local809 >= local67 && local62 == local57 - arg2 && (this.anIntArrayArray14[local67][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 >= local72 && local67 <= local809 && local62 == local57 - arg2) {
						return true;
					}
					if (local67 - arg2 == local72 && local57 >= local62 && local815 >= local57 && (this.anIntArrayArray14[local809][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 >= local62 && local57 <= local815 && (this.anIntArrayArray14[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					if (local72 == local67 - arg2 && local57 >= local62 && local815 >= local57) {
						return true;
					}
					if (local72 <= local67 && local809 >= local67 && local62 == local57 + 1) {
						return true;
					}
					if (local67 + 1 == local72 && local62 <= local57 && local57 <= local815 && (this.anIntArrayArray14[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local67 && local67 <= local809 && local62 == local57 - arg2 && (this.anIntArrayArray14[local67][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - arg2 == local72 && local62 <= local57 && local815 >= local57 && (this.anIntArrayArray14[local809][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 <= local67 && local809 >= local67 && local57 + 1 == local62) {
						return true;
					}
					if (local72 == local67 + 1 && local57 >= local62 && local57 <= local815) {
						return true;
					}
					if (local67 >= local72 && local67 <= local809 && local62 == local57 - arg2 && (this.anIntArrayArray14[local67][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 - arg2 == local72 && local62 <= local57 && local57 <= local815 && (this.anIntArrayArray14[local809][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 >= local72 && local809 >= local67 && local62 == local57 + 1 && (this.anIntArrayArray14[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local57 >= local62 && local57 <= local815) {
						return true;
					}
					if (local72 <= local67 && local809 >= local67 && local57 - arg2 == local62) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 - arg2 == local72 && local57 >= local62 && local57 <= local815) {
						return true;
					}
					if (local72 <= local67 && local809 >= local67 && local57 + 1 == local62 && (this.anIntArrayArray14[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 <= local57 && local815 >= local57 && (this.anIntArrayArray14[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 >= local72 && local67 <= local809 && local57 - arg2 == local62) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local72 <= local67 && local809 >= local67 && local57 + 1 == local62 && (this.anIntArrayArray14[local67][local62] & 0x2C0120) == 0) {
					return true;
				}
				if (local67 >= local72 && local67 <= local809 && local62 == local57 - arg2 && (this.anIntArrayArray14[local67][local815] & 0x2C0102) == 0) {
					return true;
				}
				if (local67 - arg2 == local72 && local57 >= local62 && local57 <= local815 && (this.anIntArrayArray14[local809][local57] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 + 1 == local72 && local57 >= local62 && local57 <= local815 && (this.anIntArrayArray14[local72][local57] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZZIIIZ)V")
	public void method2371(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg3 - this.anInt2726;
		@Pc(29) int local29 = arg0 - this.anInt2712;
		for (@Pc(35) int local35 = local29; local35 < arg5 + local29; local35++) {
			if (local35 >= 0 && this.anInt2719 > local35) {
				for (@Pc(49) int local49 = local24; local49 < arg4 + local24; local49++) {
					if (local49 >= 0 && local49 < this.anInt2725) {
						this.method2362(local7, local49, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
	public void method2372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2726;
		@Pc(13) int local13 = arg1 - this.anInt2712;
		this.anIntArrayArray14[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBZZII)V")
	public void method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt2712;
		@Pc(17) int local17 = arg1 - this.anInt2726;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2366(128, local17, local4);
				this.method2366(8, local17, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2366(2, local17, local4);
				this.method2366(32, local17 + 1, local4);
			}
			if (arg5 == 2) {
				this.method2366(8, local17, local4);
				this.method2366(128, local17, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2366(32, local17, local4);
				this.method2366(2, local17 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2366(1, local17, local4);
				this.method2366(16, local17 + 1, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2366(4, local17, local4);
				this.method2366(64, local17 + 1, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2366(16, local17, local4);
				this.method2366(1, local17 - 1, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2366(64, local17, local4);
				this.method2366(4, local17 - 1, local4 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method2366(130, local17, local4);
				this.method2366(8, local17, local4 - 1);
				this.method2366(32, local17 + 1, local4);
			}
			if (arg5 == 1) {
				this.method2366(10, local17, local4);
				this.method2366(32, local17 + 1, local4);
				this.method2366(128, local17, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2366(40, local17, local4);
				this.method2366(128, local17, local4 + 1);
				this.method2366(2, local17 - 1, local4);
			}
			if (arg5 == 3) {
				this.method2366(160, local17, local4);
				this.method2366(2, local17 - 1, local4);
				this.method2366(8, local17, local4 - 1);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method2366(65536, local17, local4);
					this.method2366(4096, local17, local4 - 1);
				}
				if (arg5 == 1) {
					this.method2366(1024, local17, local4);
					this.method2366(16384, local17 + 1, local4);
				}
				if (arg5 == 2) {
					this.method2366(4096, local17, local4);
					this.method2366(65536, local17, local4 + 1);
				}
				if (arg5 == 3) {
					this.method2366(16384, local17, local4);
					this.method2366(1024, local17 - 1, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method2366(512, local17, local4);
					this.method2366(8192, local17 + 1, local4 + -1);
				}
				if (arg5 == 1) {
					this.method2366(2048, local17, local4);
					this.method2366(32768, local17 + 1, local4 + 1);
				}
				if (arg5 == 2) {
					this.method2366(8192, local17, local4);
					this.method2366(512, local17 - 1, local4 + 1);
				}
				if (arg5 == 3) {
					this.method2366(32768, local17, local4);
					this.method2366(2048, local17 - 1, local4 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method2366(66560, local17, local4);
					this.method2366(4096, local17, local4 - 1);
					this.method2366(16384, local17 + 1, local4);
				}
				if (arg5 == 1) {
					this.method2366(5120, local17, local4);
					this.method2366(16384, local17 + 1, local4);
					this.method2366(65536, local17, local4 + 1);
				}
				if (arg5 == 2) {
					this.method2366(20480, local17, local4);
					this.method2366(65536, local17, local4 + 1);
					this.method2366(1024, local17 - 1, local4);
				}
				if (arg5 == 3) {
					this.method2366(81920, local17, local4);
					this.method2366(1024, local17 - 1, local4);
					this.method2366(4096, local17, local4 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2366(536870912, local17, local4);
				this.method2366(33554432, local17, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2366(8388608, local17, local4);
				this.method2366(134217728, local17 + 1, local4);
			}
			if (arg5 == 2) {
				this.method2366(33554432, local17, local4);
				this.method2366(536870912, local17, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2366(134217728, local17, local4);
				this.method2366(8388608, local17 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2366(4194304, local17, local4);
				this.method2366(67108864, local17 + 1, local4 + -1);
			}
			if (arg5 == 1) {
				this.method2366(16777216, local17, local4);
				this.method2366(268435456, local17 + 1, local4 - -1);
			}
			if (arg5 == 2) {
				this.method2366(67108864, local17, local4);
				this.method2366(4194304, local17 - 1, local4 - -1);
			}
			if (arg5 == 3) {
				this.method2366(268435456, local17, local4);
				this.method2366(16777216, local17 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2366(545259520, local17, local4);
			this.method2366(33554432, local17, local4 - 1);
			this.method2366(134217728, local17 + 1, local4);
		}
		if (arg5 == 1) {
			this.method2366(41943040, local17, local4);
			this.method2366(134217728, local17 + 1, local4);
			this.method2366(536870912, local17, local4 + 1);
		}
		if (arg5 == 2) {
			this.method2366(167772160, local17, local4);
			this.method2366(536870912, local17, local4 + 1);
			this.method2366(8388608, local17 - 1, local4);
		}
		if (arg5 == 3) {
			this.method2366(671088640, local17, local4);
			this.method2366(8388608, local17 - 1, local4);
			this.method2366(33554432, local17, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static364.method5247(arg2, arg7, arg1, arg5, arg0, arg1, arg3, arg6) ? true : this.method2375(arg0, arg3, arg1, arg4, arg1, arg5, arg2, arg6, arg7);
		}
		@Pc(39) int local39 = arg2 + arg0 - 1;
		@Pc(45) int local45 = arg5 + arg3 - 1;
		if (arg2 <= arg7 && local39 >= arg7 && arg5 <= arg6 && arg6 <= local45) {
			return true;
		} else if (arg2 - 1 == arg7 && arg6 >= arg5 && arg6 <= local45 && (this.anIntArrayArray14[arg7 - this.anInt2712][arg6 - this.anInt2726] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg7 == local39 + 1 && arg6 >= arg5 && arg6 <= local45 && (this.anIntArrayArray14[arg7 - this.anInt2712][arg6 - this.anInt2726] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg6 && arg2 <= arg7 && arg7 <= local39 && (this.anIntArrayArray14[arg7 - this.anInt2712][arg6 - this.anInt2726] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local45 + 1 && arg2 <= arg7 && arg7 <= local39 && (this.anIntArrayArray14[arg7 - this.anInt2712][arg6 - this.anInt2726] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method2375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg4;
		@Pc(18) int local18 = arg7 + arg2;
		@Pc(22) int local22 = arg0 + arg6;
		@Pc(27) int local27 = arg5 + arg1;
		@Pc(52) int local52;
		@Pc(59) int local59;
		if (local22 == arg8 && (arg3 & 0x2) == 0) {
			local52 = arg5 < arg7 ? arg7 : arg5;
			local59 = local27 <= local18 ? local27 : local18;
			while (local52 < local59) {
				if ((this.anIntArrayArray14[local22 - this.anInt2712 - 1][local52 - this.anInt2726] & 0x8) == 0) {
					return true;
				}
				local52++;
			}
		} else if (local9 == arg6 && (arg3 & 0x8) == 0) {
			local52 = arg5 < arg7 ? arg7 : arg5;
			local59 = local27 > local18 ? local18 : local27;
			while (local59 > local52) {
				if ((this.anIntArrayArray14[arg6 - this.anInt2712][local52 - this.anInt2726] & 0x80) == 0) {
					return true;
				}
				local52++;
			}
		} else if (local27 == arg7 && (arg3 & 0x1) == 0) {
			local52 = arg6 < arg8 ? arg8 : arg6;
			local59 = local9 >= local22 ? local22 : local9;
			while (local59 > local52) {
				if ((this.anIntArrayArray14[local52 - this.anInt2712][local27 - this.anInt2726 - 1] & 0x2) == 0) {
					return true;
				}
				local52++;
			}
		} else if (local18 == arg5 && (arg3 & 0x4) == 0) {
			local52 = arg6 >= arg8 ? arg6 : arg8;
			local59 = local22 <= local9 ? local22 : local9;
			while (local59 > local52) {
				if ((this.anIntArrayArray14[local52 - this.anInt2712][arg5 - this.anInt2726] & 0x20) == 0) {
					return true;
				}
				local52++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V")
	public void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt2712;
		@Pc(17) int local17 = arg0 - this.anInt2726;
		this.anIntArrayArray14[local12][local17] &= 0xFFFBFFFF;
	}
}

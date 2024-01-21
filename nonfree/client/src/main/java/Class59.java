import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class59 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	private final int anInt3305 = 0;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	private final int anInt3301;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	private final int anInt3315;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	private final int anInt3298;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(II)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3301 = arg1;
		this.anInt3315 = 0;
		this.anInt3298 = arg0;
		this.anIntArrayArray27 = new int[this.anInt3298][this.anInt3301];
		this.method2471();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIIIII)V")
	public void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg5 - this.anInt3315;
		@Pc(17) int local17 = 256;
		if (arg1) {
			local17 = 131328;
		}
		@Pc(31) int local31;
		if (arg4 == 1 || arg4 == 3) {
			local31 = arg2;
			arg2 = arg0;
			arg0 = local31;
		}
		@Pc(40) int local40 = arg3 - this.anInt3305;
		for (local31 = local10; local31 < arg2 + local10; local31++) {
			if (local31 >= 0 && local31 < this.anInt3298) {
				for (@Pc(55) int local55 = local40; local55 < arg0 + local40; local55++) {
					if (local55 >= 0 && this.anInt3301 > local55) {
						this.method2477(local17, local55, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIII)V")
	public void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt3315;
		@Pc(17) int local17 = arg0 - this.anInt3305;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method2477(128, local17, local8);
				this.method2477(8, local17, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2477(2, local17, local8);
				this.method2477(32, local17 + 1, local8);
			}
			if (arg1 == 2) {
				this.method2477(8, local17, local8);
				this.method2477(128, local17, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2477(32, local17, local8);
				this.method2477(2, local17 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method2477(1, local17, local8);
				this.method2477(16, local17 + 1, local8 + -1);
			}
			if (arg1 == 1) {
				this.method2477(4, local17, local8);
				this.method2477(64, local17 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2477(16, local17, local8);
				this.method2477(1, local17 - 1, local8 - -1);
			}
			if (arg1 == 3) {
				this.method2477(64, local17, local8);
				this.method2477(4, local17 - 1, local8 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method2477(130, local17, local8);
				this.method2477(8, local17, local8 - 1);
				this.method2477(32, local17 + 1, local8);
			}
			if (arg1 == 1) {
				this.method2477(10, local17, local8);
				this.method2477(32, local17 + 1, local8);
				this.method2477(128, local17, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2477(40, local17, local8);
				this.method2477(128, local17, local8 + 1);
				this.method2477(2, local17 - 1, local8);
			}
			if (arg1 == 3) {
				this.method2477(160, local17, local8);
				this.method2477(2, local17 - 1, local8);
				this.method2477(8, local17, local8 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method2477(65536, local17, local8);
				this.method2477(4096, local17, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2477(1024, local17, local8);
				this.method2477(16384, local17 + 1, local8);
			}
			if (arg1 == 2) {
				this.method2477(4096, local17, local8);
				this.method2477(65536, local17, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2477(16384, local17, local8);
				this.method2477(1024, local17 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method2477(512, local17, local8);
				this.method2477(8192, local17 + 1, local8 + -1);
			}
			if (arg1 == 1) {
				this.method2477(2048, local17, local8);
				this.method2477(32768, local17 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2477(8192, local17, local8);
				this.method2477(512, local17 - 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2477(32768, local17, local8);
				this.method2477(2048, local17 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2477(66560, local17, local8);
			this.method2477(4096, local17, local8 - 1);
			this.method2477(16384, local17 + 1, local8);
		}
		if (arg1 == 1) {
			this.method2477(5120, local17, local8);
			this.method2477(16384, local17 + 1, local8);
			this.method2477(65536, local17, local8 + 1);
		}
		if (arg1 == 2) {
			this.method2477(20480, local17, local8);
			this.method2477(65536, local17, local8 + 1);
			this.method2477(1024, local17 - 1, local8);
		}
		if (arg1 == 3) {
			this.method2477(81920, local17, local8);
			this.method2477(1024, local17 - 1, local8);
			this.method2477(4096, local17, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public void method2465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3305;
		@Pc(13) int local13 = arg0 - this.anInt3315;
		this.anIntArrayArray27[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	private void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
	public void method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3305;
		@Pc(9) int local9 = arg0 - this.anInt3315;
		this.anIntArrayArray27[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIBIII)V")
	public void method2469(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg1 - this.anInt3315;
		@Pc(15) int local15 = arg2 - this.anInt3305;
		@Pc(17) int local17 = 256;
		if (arg0) {
			local17 = 131328;
		}
		for (@Pc(29) int local29 = local6; local29 < local6 + arg3; local29++) {
			if (local29 >= 0 && local29 < this.anInt3298) {
				for (@Pc(42) int local42 = local15; local42 < local15 + arg4; local42++) {
					if (local42 >= 0 && local42 < this.anInt3301) {
						this.method2467(local29, local42, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg3 + arg0 - 1;
		@Pc(15) int local15 = arg4 + arg2 - 1;
		if (arg2 <= arg6 && local15 >= arg6 && arg1 >= arg0 && arg1 <= local5) {
			return true;
		} else if (arg2 - 1 == arg6 && arg0 <= arg1 && local5 >= arg1 && (this.anIntArrayArray27[arg6 - this.anInt3315][arg1 - this.anInt3305] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local15 + 1 == arg6 && arg0 <= arg1 && local5 >= arg1 && (this.anIntArrayArray27[arg6 - this.anInt3315][arg1 - this.anInt3305] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg1 && arg2 <= arg6 && arg6 <= local15 && (this.anIntArrayArray27[arg6 - this.anInt3315][arg1 - this.anInt3305] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local5 + 1 == arg1 && arg2 <= arg6 && local15 >= arg6 && (this.anIntArrayArray27[arg6 - this.anInt3315][arg1 - this.anInt3305] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public void method2471() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3298; local7++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt3301; local22++) {
				if (local7 == 0 || local22 == 0 || local7 >= this.anInt3298 - 5 || this.anInt3301 - 5 <= local22) {
					this.anIntArrayArray27[local7][local22] = 16777215;
				} else {
					this.anIntArrayArray27[local7][local22] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == arg3 && arg4 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg2 - this.anInt3305;
		@Pc(29) int local29 = arg3 - this.anInt3315;
		@Pc(34) int local34 = arg5 - this.anInt3315;
		@Pc(39) int local39 = arg4 - this.anInt3305;
		if (arg1 == 0) {
			if (arg0 == 0) {
				if (local34 - 1 == local29 && local24 == local39) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 == local29 && local24 == local39 + 1) {
					return true;
				}
				if (local34 - 1 == local29 && local39 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local24 == local39 && (this.anIntArrayArray27[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local29 == local34 + 1 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local24 == local39 + 1 && (this.anIntArrayArray27[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 == local34 && local39 - 1 == local24) {
					return true;
				}
				if (local34 - 1 == local29 && local24 == local39 && (this.anIntArrayArray27[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				if (local34 - 1 == local29 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local39 + 1 == local24) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local29 && local39 - 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 - 1 == local29 && local39 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 && local39 + 1 == local24) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local24) {
					return true;
				}
				if (local34 == local29 && local24 == local39 - 1 && (this.anIntArrayArray27[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 - 1 == local29 && local39 == local24 && (this.anIntArrayArray27[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local39 + 1 && (this.anIntArrayArray27[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local24 == local39) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local24) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local34 - 1 == local29 && local24 == local39) {
					return true;
				}
				if (local29 == local34 && local24 == local39 + 1 && (this.anIntArrayArray27[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local24 == local39 && (this.anIntArrayArray27[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local29 && local24 == local39 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local29 == local34 && local39 + 1 == local24 && (this.anIntArrayArray27[local29][local24] & 0x20) == 0) {
				return true;
			}
			if (local29 == local34 && local24 == local39 - 1 && (this.anIntArrayArray27[local29][local24] & 0x2) == 0) {
				return true;
			}
			if (local29 == local34 - 1 && local24 == local39 && (this.anIntArrayArray27[local29][local24] & 0x8) == 0) {
				return true;
			}
			if (local34 + 1 == local29 && local24 == local39 && (this.anIntArrayArray27[local29][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)V")
	public void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3315;
		@Pc(18) int local18 = arg0 - this.anInt3305;
		this.anIntArrayArray27[local4][local18] |= 0x40000;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBI)V")
	private void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method2478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg2 && arg4 == arg3) {
			return true;
		}
		@Pc(24) int local24 = arg0 - this.anInt3315;
		@Pc(29) int local29 = arg3 - this.anInt3305;
		@Pc(34) int local34 = arg2 - this.anInt3315;
		@Pc(39) int local39 = arg4 - this.anInt3305;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local24 == local34 + 1 && local39 == local29 && (this.anIntArrayArray27[local24][local39] & 0x80) == 0) {
					return true;
				}
				if (local24 == local34 && local39 == local29 - 1 && (this.anIntArrayArray27[local24][local39] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local34 - 1 == local24 && local39 == local29 && (this.anIntArrayArray27[local24][local39] & 0x8) == 0) {
					return true;
				}
				if (local24 == local34 && local29 - 1 == local39 && (this.anIntArrayArray27[local24][local39] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local34 - 1 == local24 && local29 == local39 && (this.anIntArrayArray27[local24][local39] & 0x8) == 0) {
					return true;
				}
				if (local34 == local24 && local29 + 1 == local39 && (this.anIntArrayArray27[local24][local39] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local34 + 1 == local24 && local39 == local29 && (this.anIntArrayArray27[local24][local39] & 0x80) == 0) {
					return true;
				}
				if (local24 == local34 && local29 + 1 == local39 && (this.anIntArrayArray27[local24][local39] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local24 == local34 && local29 + 1 == local39 && (this.anIntArrayArray27[local24][local39] & 0x20) == 0) {
				return true;
			}
			if (local34 == local24 && local29 - 1 == local39 && (this.anIntArrayArray27[local24][local39] & 0x2) == 0) {
				return true;
			}
			if (local24 == local34 - 1 && local39 == local29 && (this.anIntArrayArray27[local24][local39] & 0x8) == 0) {
				return true;
			}
			if (local24 == local34 + 1 && local39 == local29 && (this.anIntArrayArray27[local24][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZI)V")
	public void method2479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - this.anInt3315;
		@Pc(18) int local18 = arg2 - this.anInt3305;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2467(local9, local18, 128);
				this.method2467(local9 - 1, local18, 8);
			}
			if (arg1 == 1) {
				this.method2467(local9, local18, 2);
				this.method2467(local9, local18 + 1, 32);
			}
			if (arg1 == 2) {
				this.method2467(local9, local18, 8);
				this.method2467(local9 + 1, local18, 128);
			}
			if (arg1 == 3) {
				this.method2467(local9, local18, 32);
				this.method2467(local9, local18 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2467(local9, local18, 1);
				this.method2467(local9 - 1, local18 - -1, 16);
			}
			if (arg1 == 1) {
				this.method2467(local9, local18, 4);
				this.method2467(local9 + 1, local18 + 1, 64);
			}
			if (arg1 == 2) {
				this.method2467(local9, local18, 16);
				this.method2467(local9 + 1, local18 - 1, 1);
			}
			if (arg1 == 3) {
				this.method2467(local9, local18, 64);
				this.method2467(local9 - 1, local18 - 1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method2467(local9, local18, 130);
				this.method2467(local9 - 1, local18, 8);
				this.method2467(local9, local18 + 1, 32);
			}
			if (arg1 == 1) {
				this.method2467(local9, local18, 10);
				this.method2467(local9, local18 + 1, 32);
				this.method2467(local9 + 1, local18, 128);
			}
			if (arg1 == 2) {
				this.method2467(local9, local18, 40);
				this.method2467(local9 + 1, local18, 128);
				this.method2467(local9, local18 - 1, 2);
			}
			if (arg1 == 3) {
				this.method2467(local9, local18, 160);
				this.method2467(local9, local18 - 1, 2);
				this.method2467(local9 - 1, local18, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2467(local9, local18, 65536);
				this.method2467(local9 - 1, local18, 4096);
			}
			if (arg1 == 1) {
				this.method2467(local9, local18, 1024);
				this.method2467(local9, local18 + 1, 16384);
			}
			if (arg1 == 2) {
				this.method2467(local9, local18, 4096);
				this.method2467(local9 + 1, local18, 65536);
			}
			if (arg1 == 3) {
				this.method2467(local9, local18, 16384);
				this.method2467(local9, local18 - 1, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2467(local9, local18, 512);
				this.method2467(local9 - 1, local18 + 1, 8192);
			}
			if (arg1 == 1) {
				this.method2467(local9, local18, 2048);
				this.method2467(local9 + 1, local18 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method2467(local9, local18, 8192);
				this.method2467(local9 + 1, local18 + -1, 512);
			}
			if (arg1 == 3) {
				this.method2467(local9, local18, 32768);
				this.method2467(local9 - 1, local18 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2467(local9, local18, 66560);
			this.method2467(local9 - 1, local18, 4096);
			this.method2467(local9, local18 + 1, 16384);
		}
		if (arg1 == 1) {
			this.method2467(local9, local18, 5120);
			this.method2467(local9, local18 + 1, 16384);
			this.method2467(local9 + 1, local18, 65536);
		}
		if (arg1 == 2) {
			this.method2467(local9, local18, 20480);
			this.method2467(local9 + 1, local18, 65536);
			this.method2467(local9, local18 - 1, 1024);
		}
		if (arg1 == 3) {
			this.method2467(local9, local18, 81920);
			this.method2467(local9, local18 - 1, 1024);
			this.method2467(local9 - 1, local18, 4096);
			return;
		}
	}
}

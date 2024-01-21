import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class69 {

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	private final int anInt3107;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
	private final int anInt3111;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	private final int anInt3102;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
	private final int anInt3118;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3107 = arg1;
		this.anInt3111 = 0;
		this.anInt3102 = 0;
		this.anInt3118 = arg0;
		this.anIntArrayArray35 = new int[this.anInt3118][this.anInt3107];
		this.method2258();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIII)V")
	private void method2247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIZ)V")
	public void method2248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg4 - this.anInt3102;
		@Pc(11) int local11 = arg2 - this.anInt3111;
		@Pc(13) int local13 = 256;
		if (arg5) {
			local13 = 131328;
		}
		@Pc(33) int local33;
		if (arg3 == 1 || arg3 == 3) {
			local33 = arg1;
			arg1 = arg0;
			arg0 = local33;
		}
		for (local33 = local11; local33 < local11 + arg1; local33++) {
			if (local33 >= 0 && local33 < this.anInt3118) {
				for (@Pc(53) int local53 = local6; local53 < arg0 + local6; local53++) {
					if (local53 >= 0 && local53 < this.anInt3107) {
						this.method2254(local13, local53, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg1 - 1;
		@Pc(16) int local16 = arg5 + arg4 - 1;
		if (arg1 <= arg3 && arg3 <= local9 && arg6 >= arg5 && local16 >= arg6) {
			return true;
		} else if (arg1 - 1 == arg3 && arg6 >= arg5 && arg6 <= local16 && (this.anIntArrayArray35[arg3 - this.anInt3111][arg6 - this.anInt3102] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg3 == local9 + 1 && arg5 <= arg6 && local16 >= arg6 && (this.anIntArrayArray35[arg3 - this.anInt3111][arg6 - this.anInt3102] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg5 - 1 && arg3 >= arg1 && arg3 <= local9 && (this.anIntArrayArray35[arg3 - this.anInt3111][arg6 - this.anInt3102] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local16 + 1 && arg1 <= arg3 && arg3 <= local9 && (this.anIntArrayArray35[arg3 - this.anInt3111][arg6 - this.anInt3102] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)V")
	public void method2250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3102;
		@Pc(9) int local9 = arg1 - this.anInt3111;
		this.anIntArrayArray35[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	public void method2251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3102;
		@Pc(9) int local9 = arg0 - this.anInt3111;
		this.anIntArrayArray35[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IBI)V")
	public void method2252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3111;
		@Pc(9) int local9 = arg1 - this.anInt3102;
		this.anIntArrayArray35[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIZ)V")
	public void method2253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) int local10 = arg2 - this.anInt3111;
		@Pc(19) int local19 = arg1 - this.anInt3102;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method2247(128, local19, local10);
				this.method2247(8, local19, local10 - 1);
			}
			if (arg3 == 1) {
				this.method2247(2, local19, local10);
				this.method2247(32, local19 + 1, local10);
			}
			if (arg3 == 2) {
				this.method2247(8, local19, local10);
				this.method2247(128, local19, local10 + 1);
			}
			if (arg3 == 3) {
				this.method2247(32, local19, local10);
				this.method2247(2, local19 - 1, local10);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method2247(1, local19, local10);
				this.method2247(16, local19 + 1, local10 + -1);
			}
			if (arg3 == 1) {
				this.method2247(4, local19, local10);
				this.method2247(64, local19 + 1, local10 + 1);
			}
			if (arg3 == 2) {
				this.method2247(16, local19, local10);
				this.method2247(1, local19 - 1, local10 + 1);
			}
			if (arg3 == 3) {
				this.method2247(64, local19, local10);
				this.method2247(4, local19 - 1, local10 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method2247(130, local19, local10);
				this.method2247(8, local19, local10 - 1);
				this.method2247(32, local19 + 1, local10);
			}
			if (arg3 == 1) {
				this.method2247(10, local19, local10);
				this.method2247(32, local19 + 1, local10);
				this.method2247(128, local19, local10 + 1);
			}
			if (arg3 == 2) {
				this.method2247(40, local19, local10);
				this.method2247(128, local19, local10 + 1);
				this.method2247(2, local19 - 1, local10);
			}
			if (arg3 == 3) {
				this.method2247(160, local19, local10);
				this.method2247(2, local19 - 1, local10);
				this.method2247(8, local19, local10 - 1);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method2247(65536, local19, local10);
				this.method2247(4096, local19, local10 - 1);
			}
			if (arg3 == 1) {
				this.method2247(1024, local19, local10);
				this.method2247(16384, local19 + 1, local10);
			}
			if (arg3 == 2) {
				this.method2247(4096, local19, local10);
				this.method2247(65536, local19, local10 + 1);
			}
			if (arg3 == 3) {
				this.method2247(16384, local19, local10);
				this.method2247(1024, local19 - 1, local10);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method2247(512, local19, local10);
				this.method2247(8192, local19 + 1, local10 + -1);
			}
			if (arg3 == 1) {
				this.method2247(2048, local19, local10);
				this.method2247(32768, local19 + 1, local10 + 1);
			}
			if (arg3 == 2) {
				this.method2247(8192, local19, local10);
				this.method2247(512, local19 - 1, local10 + 1);
			}
			if (arg3 == 3) {
				this.method2247(32768, local19, local10);
				this.method2247(2048, local19 - 1, local10 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2247(66560, local19, local10);
			this.method2247(4096, local19, local10 - 1);
			this.method2247(16384, local19 + 1, local10);
		}
		if (arg3 == 1) {
			this.method2247(5120, local19, local10);
			this.method2247(16384, local19 + 1, local10);
			this.method2247(65536, local19, local10 + 1);
		}
		if (arg3 == 2) {
			this.method2247(20480, local19, local10);
			this.method2247(65536, local19, local10 + 1);
			this.method2247(1024, local19 - 1, local10);
		}
		if (arg3 == 3) {
			this.method2247(81920, local19, local10);
			this.method2247(1024, local19 - 1, local10);
			this.method2247(4096, local19, local10 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	private void method2254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg0 && arg4 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg0 - this.anInt3111;
		@Pc(31) int local31 = arg3 - this.anInt3102;
		@Pc(36) int local36 = arg5 - this.anInt3111;
		@Pc(41) int local41 = arg4 - this.anInt3102;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (local36 == local20 - 1 && local41 == local31) {
					return true;
				}
				if (local36 == local20 && local31 + 1 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local36 && local31 - 1 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local36 == local20 && local41 == local31 + 1) {
					return true;
				}
				if (local20 - 1 == local36 && local41 == local31 && (this.anIntArrayArray35[local36][local41] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local36 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local20 + 1 == local36 && local31 == local41) {
					return true;
				}
				if (local36 == local20 && local41 == local31 + 1 && (this.anIntArrayArray35[local36][local41] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 == local20 && local31 - 1 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local36 == local20 && local31 - 1 == local41) {
					return true;
				}
				if (local36 == local20 - 1 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local36 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				if (local20 - 1 == local36 && local31 == local41) {
					return true;
				}
				if (local36 == local20 && local31 + 1 == local41) {
					return true;
				}
				if (local36 == local20 + 1 && local41 == local31 && (this.anIntArrayArray35[local36][local41] & 0x12C0180) == 0) {
					return true;
				}
				if (local36 == local20 && local31 - 1 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local20 - 1 == local36 && local41 == local31 && (this.anIntArrayArray35[local36][local41] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local36 && local31 + 1 == local41) {
					return true;
				}
				if (local20 + 1 == local36 && local41 == local31) {
					return true;
				}
				if (local20 == local36 && local31 - 1 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local36 == local20 - 1 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0108) == 0) {
					return true;
				}
				if (local36 == local20 && local31 + 1 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 + 1 == local36 && local31 == local41) {
					return true;
				}
				if (local20 == local36 && local41 == local31 - 1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local36 == local20 - 1 && local41 == local31) {
					return true;
				}
				if (local20 == local36 && local41 == local31 + 1 && (this.anIntArrayArray35[local36][local41] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 + 1 == local36 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local36 && local41 == local31 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local20 == local36 && local41 == local31 + 1 && (this.anIntArrayArray35[local36][local41] & 0x20) == 0) {
				return true;
			}
			if (local20 == local36 && local41 == local31 - 1 && (this.anIntArrayArray35[local36][local41] & 0x2) == 0) {
				return true;
			}
			if (local36 == local20 - 1 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local36 && local31 == local41 && (this.anIntArrayArray35[local36][local41] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZII)V")
	public void method2257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg2 - this.anInt3102;
		@Pc(18) int local18 = 256;
		@Pc(23) int local23 = arg0 - this.anInt3111;
		if (arg3) {
			local18 = 131328;
		}
		for (@Pc(31) int local31 = local23; local31 < local23 + arg1; local31++) {
			if (local31 >= 0 && local31 < this.anInt3118) {
				for (@Pc(45) int local45 = local12; local45 < local12 + arg4; local45++) {
					if (local45 >= 0 && this.anInt3107 > local45) {
						this.method2247(local18, local45, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method2258() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3118; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt3107; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt3118 - 5 <= local7 || this.anInt3107 - 5 <= local11) {
					this.anIntArrayArray35[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray35[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIZII)V")
	public void method2259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt3102;
		@Pc(9) int local9 = arg3 - this.anInt3111;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2254(128, local4, local9);
				this.method2254(8, local4, local9 - 1);
			}
			if (arg4 == 1) {
				this.method2254(2, local4, local9);
				this.method2254(32, local4 + 1, local9);
			}
			if (arg4 == 2) {
				this.method2254(8, local4, local9);
				this.method2254(128, local4, local9 + 1);
			}
			if (arg4 == 3) {
				this.method2254(32, local4, local9);
				this.method2254(2, local4 - 1, local9);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2254(1, local4, local9);
				this.method2254(16, local4 + 1, local9 + -1);
			}
			if (arg4 == 1) {
				this.method2254(4, local4, local9);
				this.method2254(64, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2254(16, local4, local9);
				this.method2254(1, local4 - 1, local9 + 1);
			}
			if (arg4 == 3) {
				this.method2254(64, local4, local9);
				this.method2254(4, local4 - 1, local9 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method2254(130, local4, local9);
				this.method2254(8, local4, local9 - 1);
				this.method2254(32, local4 + 1, local9);
			}
			if (arg4 == 1) {
				this.method2254(10, local4, local9);
				this.method2254(32, local4 + 1, local9);
				this.method2254(128, local4, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2254(40, local4, local9);
				this.method2254(128, local4, local9 + 1);
				this.method2254(2, local4 - 1, local9);
			}
			if (arg4 == 3) {
				this.method2254(160, local4, local9);
				this.method2254(2, local4 - 1, local9);
				this.method2254(8, local4, local9 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2254(65536, local4, local9);
				this.method2254(4096, local4, local9 - 1);
			}
			if (arg4 == 1) {
				this.method2254(1024, local4, local9);
				this.method2254(16384, local4 + 1, local9);
			}
			if (arg4 == 2) {
				this.method2254(4096, local4, local9);
				this.method2254(65536, local4, local9 + 1);
			}
			if (arg4 == 3) {
				this.method2254(16384, local4, local9);
				this.method2254(1024, local4 - 1, local9);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2254(512, local4, local9);
				this.method2254(8192, local4 + 1, local9 + -1);
			}
			if (arg4 == 1) {
				this.method2254(2048, local4, local9);
				this.method2254(32768, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method2254(8192, local4, local9);
				this.method2254(512, local4 - 1, local9 + 1);
			}
			if (arg4 == 3) {
				this.method2254(32768, local4, local9);
				this.method2254(2048, local4 - 1, local9 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2254(66560, local4, local9);
			this.method2254(4096, local4, local9 - 1);
			this.method2254(16384, local4 + 1, local9);
		}
		if (arg4 == 1) {
			this.method2254(5120, local4, local9);
			this.method2254(16384, local4 + 1, local9);
			this.method2254(65536, local4, local9 + 1);
		}
		if (arg4 == 2) {
			this.method2254(20480, local4, local9);
			this.method2254(65536, local4, local9 + 1);
			this.method2254(1024, local4 - 1, local9);
		}
		if (arg4 == 3) {
			this.method2254(81920, local4, local9);
			this.method2254(1024, local4 - 1, local9);
			this.method2254(4096, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg4 && arg3 == arg1) {
			return true;
		}
		@Pc(24) int local24 = arg1 - this.anInt3102;
		@Pc(29) int local29 = arg3 - this.anInt3102;
		@Pc(34) int local34 = arg4 - this.anInt3111;
		@Pc(39) int local39 = arg2 - this.anInt3111;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local39 + 1 == local34 && local24 == local29 && (this.anIntArrayArray35[local34][local29] & 0x80) == 0) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray35[local34][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray35[local34][local29] & 0x8) == 0) {
					return true;
				}
				if (local39 == local34 && local24 - 1 == local29 && (this.anIntArrayArray35[local34][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray35[local34][local29] & 0x8) == 0) {
					return true;
				}
				if (local39 == local34 && local29 == local24 + 1 && (this.anIntArrayArray35[local34][local29] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local34 == local39 + 1 && local24 == local29 && (this.anIntArrayArray35[local34][local29] & 0x80) == 0) {
					return true;
				}
				if (local39 == local34 && local29 == local24 + 1 && (this.anIntArrayArray35[local34][local29] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local39 == local34 && local29 == local24 + 1 && (this.anIntArrayArray35[local34][local29] & 0x20) == 0) {
				return true;
			}
			if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray35[local34][local29] & 0x2) == 0) {
				return true;
			}
			if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray35[local34][local29] & 0x8) == 0) {
				return true;
			}
			if (local34 == local39 + 1 && local29 == local24 && (this.anIntArrayArray35[local34][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

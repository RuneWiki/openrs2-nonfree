import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class95 {

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
	private final int anInt3889 = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	private final int anInt3871;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	private final int anInt3884;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	private final int anInt3874;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3871 = arg1;
		this.anInt3884 = 0;
		this.anInt3874 = arg0;
		this.anIntArrayArray35 = new int[this.anInt3874][this.anInt3871];
		this.method2676();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIZ)V")
	public void method2664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg1 - this.anInt3889;
		@Pc(13) int local13 = arg3 - this.anInt3884;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method2670(local4, 128, local13);
				this.method2670(local4 - 1, 8, local13);
			}
			if (arg2 == 1) {
				this.method2670(local4, 2, local13);
				this.method2670(local4, 32, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2670(local4, 8, local13);
				this.method2670(local4 + 1, 128, local13);
			}
			if (arg2 == 3) {
				this.method2670(local4, 32, local13);
				this.method2670(local4, 2, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method2670(local4, 1, local13);
				this.method2670(local4 - 1, 16, local13 + 1);
			}
			if (arg2 == 1) {
				this.method2670(local4, 4, local13);
				this.method2670(local4 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2670(local4, 16, local13);
				this.method2670(local4 + 1, 1, local13 - 1);
			}
			if (arg2 == 3) {
				this.method2670(local4, 64, local13);
				this.method2670(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method2670(local4, 130, local13);
				this.method2670(local4 - 1, 8, local13);
				this.method2670(local4, 32, local13 + 1);
			}
			if (arg2 == 1) {
				this.method2670(local4, 10, local13);
				this.method2670(local4, 32, local13 + 1);
				this.method2670(local4 + 1, 128, local13);
			}
			if (arg2 == 2) {
				this.method2670(local4, 40, local13);
				this.method2670(local4 + 1, 128, local13);
				this.method2670(local4, 2, local13 - 1);
			}
			if (arg2 == 3) {
				this.method2670(local4, 160, local13);
				this.method2670(local4, 2, local13 - 1);
				this.method2670(local4 - 1, 8, local13);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method2670(local4, 65536, local13);
				this.method2670(local4 - 1, 4096, local13);
			}
			if (arg2 == 1) {
				this.method2670(local4, 1024, local13);
				this.method2670(local4, 16384, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2670(local4, 4096, local13);
				this.method2670(local4 + 1, 65536, local13);
			}
			if (arg2 == 3) {
				this.method2670(local4, 16384, local13);
				this.method2670(local4, 1024, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method2670(local4, 512, local13);
				this.method2670(local4 - 1, 8192, local13 + 1);
			}
			if (arg2 == 1) {
				this.method2670(local4, 2048, local13);
				this.method2670(local4 + 1, 32768, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2670(local4, 8192, local13);
				this.method2670(local4 + 1, 512, local13 - 1);
			}
			if (arg2 == 3) {
				this.method2670(local4, 32768, local13);
				this.method2670(local4 - 1, 2048, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2670(local4, 66560, local13);
			this.method2670(local4 - 1, 4096, local13);
			this.method2670(local4, 16384, local13 + 1);
		}
		if (arg2 == 1) {
			this.method2670(local4, 5120, local13);
			this.method2670(local4, 16384, local13 + 1);
			this.method2670(local4 + 1, 65536, local13);
		}
		if (arg2 == 2) {
			this.method2670(local4, 20480, local13);
			this.method2670(local4 + 1, 65536, local13);
			this.method2670(local4, 1024, local13 - 1);
		}
		if (arg2 == 3) {
			this.method2670(local4, 81920, local13);
			this.method2670(local4, 1024, local13 - 1);
			this.method2670(local4 - 1, 4096, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIZB)V")
	public void method2666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(6) int local6 = arg3 - this.anInt3884;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg1 - this.anInt3889;
		if (arg4) {
			local12 = 131328;
		}
		for (@Pc(29) int local29 = local17; local29 < local17 + arg0; local29++) {
			if (local29 >= 0 && this.anInt3874 > local29) {
				for (@Pc(43) int local43 = local6; local43 < local6 + arg2; local43++) {
					if (local43 >= 0 && this.anInt3871 > local43) {
						this.method2670(local29, local12, local43);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg3 + arg4 - 1;
		@Pc(21) int local21 = arg2 + arg0 - 1;
		if (arg6 >= arg4 && arg6 <= local15 && arg5 >= arg2 && local21 >= arg5) {
			return true;
		} else if (arg6 == arg4 - 1 && arg5 >= arg2 && local21 >= arg5 && (this.anIntArrayArray35[arg6 - this.anInt3889][arg5 - this.anInt3884] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg6 == local15 + 1 && arg5 >= arg2 && local21 >= arg5 && (this.anIntArrayArray35[arg6 - this.anInt3889][arg5 - this.anInt3884] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg5 && arg6 >= arg4 && local15 >= arg6 && (this.anIntArrayArray35[arg6 - this.anInt3889][arg5 - this.anInt3884] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local21 + 1 && arg4 <= arg6 && arg6 <= local15 && (this.anIntArrayArray35[arg6 - this.anInt3889][arg5 - this.anInt3884] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
	private void method2668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZIIII)V")
	public void method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg3 - this.anInt3889;
		@Pc(15) int local15 = arg0 - this.anInt3884;
		@Pc(17) int local17 = 256;
		if (arg2) {
			local17 = 131328;
		}
		@Pc(35) int local35;
		if (arg5 == 1 || arg5 == 3) {
			local35 = arg1;
			arg1 = arg4;
			arg4 = local35;
		}
		for (local35 = local10; local35 < arg1 + local10; local35++) {
			if (local35 >= 0 && local35 < this.anInt3874) {
				for (@Pc(55) int local55 = local15; local55 < arg4 + local15; local55++) {
					if (local55 >= 0 && this.anInt3871 > local55) {
						this.method2668(local17, local35, local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
	private void method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray35[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg3 && arg5 == arg2) {
			return true;
		}
		@Pc(25) int local25 = arg4 - this.anInt3889;
		@Pc(30) int local30 = arg5 - this.anInt3884;
		@Pc(35) int local35 = arg2 - this.anInt3884;
		@Pc(40) int local40 = arg3 - this.anInt3889;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local25 + 1 == local40 && local35 == local30 && (this.anIntArrayArray35[local40][local35] & 0x80) == 0) {
					return true;
				}
				if (local25 == local40 && local35 == local30 - 1 && (this.anIntArrayArray35[local40][local35] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local25 - 1 == local40 && local35 == local30 && (this.anIntArrayArray35[local40][local35] & 0x8) == 0) {
					return true;
				}
				if (local40 == local25 && local35 == local30 - 1 && (this.anIntArrayArray35[local40][local35] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local40 == local25 - 1 && local35 == local30 && (this.anIntArrayArray35[local40][local35] & 0x8) == 0) {
					return true;
				}
				if (local40 == local25 && local30 + 1 == local35 && (this.anIntArrayArray35[local40][local35] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local25 + 1 == local40 && local30 == local35 && (this.anIntArrayArray35[local40][local35] & 0x80) == 0) {
					return true;
				}
				if (local25 == local40 && local35 == local30 + 1 && (this.anIntArrayArray35[local40][local35] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local40 == local25 && local30 + 1 == local35 && (this.anIntArrayArray35[local40][local35] & 0x20) == 0) {
				return true;
			}
			if (local25 == local40 && local35 == local30 - 1 && (this.anIntArrayArray35[local40][local35] & 0x2) == 0) {
				return true;
			}
			if (local25 - 1 == local40 && local30 == local35 && (this.anIntArrayArray35[local40][local35] & 0x8) == 0) {
				return true;
			}
			if (local40 == local25 + 1 && local35 == local30 && (this.anIntArrayArray35[local40][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)V")
	public void method2673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3889;
		@Pc(13) int local13 = arg1 - this.anInt3884;
		this.anIntArrayArray35[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIBIII)V")
	public void method2674(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3889;
		@Pc(13) int local13 = arg4 - this.anInt3884;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method2668(128, local4, local13);
				this.method2668(8, local4 - 1, local13);
			}
			if (arg1 == 1) {
				this.method2668(2, local4, local13);
				this.method2668(32, local4, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2668(8, local4, local13);
				this.method2668(128, local4 + 1, local13);
			}
			if (arg1 == 3) {
				this.method2668(32, local4, local13);
				this.method2668(2, local4, local13 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method2668(1, local4, local13);
				this.method2668(16, local4 - 1, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2668(4, local4, local13);
				this.method2668(64, local4 + 1, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2668(16, local4, local13);
				this.method2668(1, local4 + 1, local13 + -1);
			}
			if (arg1 == 3) {
				this.method2668(64, local4, local13);
				this.method2668(4, local4 - 1, local13 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method2668(130, local4, local13);
				this.method2668(8, local4 - 1, local13);
				this.method2668(32, local4, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2668(10, local4, local13);
				this.method2668(32, local4, local13 + 1);
				this.method2668(128, local4 + 1, local13);
			}
			if (arg1 == 2) {
				this.method2668(40, local4, local13);
				this.method2668(128, local4 + 1, local13);
				this.method2668(2, local4, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2668(160, local4, local13);
				this.method2668(2, local4, local13 - 1);
				this.method2668(8, local4 - 1, local13);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method2668(65536, local4, local13);
				this.method2668(4096, local4 - 1, local13);
			}
			if (arg1 == 1) {
				this.method2668(1024, local4, local13);
				this.method2668(16384, local4, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2668(4096, local4, local13);
				this.method2668(65536, local4 + 1, local13);
			}
			if (arg1 == 3) {
				this.method2668(16384, local4, local13);
				this.method2668(1024, local4, local13 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method2668(512, local4, local13);
				this.method2668(8192, local4 - 1, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2668(2048, local4, local13);
				this.method2668(32768, local4 + 1, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2668(8192, local4, local13);
				this.method2668(512, local4 + 1, local13 + -1);
			}
			if (arg1 == 3) {
				this.method2668(32768, local4, local13);
				this.method2668(2048, local4 - 1, local13 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2668(66560, local4, local13);
			this.method2668(4096, local4 - 1, local13);
			this.method2668(16384, local4, local13 + 1);
		}
		if (arg1 == 1) {
			this.method2668(5120, local4, local13);
			this.method2668(16384, local4, local13 + 1);
			this.method2668(65536, local4 + 1, local13);
		}
		if (arg1 == 2) {
			this.method2668(20480, local4, local13);
			this.method2668(65536, local4 + 1, local13);
			this.method2668(1024, local4, local13 - 1);
		}
		if (arg1 == 3) {
			this.method2668(81920, local4, local13);
			this.method2668(1024, local4, local13 - 1);
			this.method2668(4096, local4 - 1, local13);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIB)V")
	public void method2675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt3884;
		@Pc(21) int local21 = arg1 - this.anInt3889;
		this.anIntArrayArray35[local21][local16] |= 0x200000;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public void method2676() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3874; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt3871; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt3874 - 5 <= local7 || local11 >= this.anInt3871 - 5) {
					this.anIntArrayArray35[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray35[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method2677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg4 && arg0 == arg2) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt3889;
		@Pc(25) int local25 = arg2 - this.anInt3884;
		@Pc(30) int local30 = arg5 - this.anInt3889;
		@Pc(35) int local35 = arg0 - this.anInt3884;
		if (arg1 == 0) {
			if (arg3 == 0) {
				if (local20 - 1 == local30 && local25 == local35) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25 && (this.anIntArrayArray35[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray35[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 == local20 && local35 + 1 == local25) {
					return true;
				}
				if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local30 == local20 + 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray35[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray35[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local30 == local20 && local25 == local35 - 1) {
					return true;
				}
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				if (local30 == local20 - 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray35[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray35[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray35[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local20 - 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25 && (this.anIntArrayArray35[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray35[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray35[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray35[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray35[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZ)V")
	public void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3889;
		@Pc(13) int local13 = arg0 - this.anInt3884;
		this.anIntArrayArray35[local8][local13] &= 0xFFFBFFFF;
	}
}

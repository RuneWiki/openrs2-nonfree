import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class81 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	private final int anInt3189 = 0;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	private final int anInt3196;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	private final int anInt3188;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	private final int anInt3199;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(II)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3196 = arg1;
		this.anInt3188 = 0;
		this.anInt3199 = arg0;
		this.anIntArrayArray29 = new int[this.anInt3199][this.anInt3196];
		this.method2220();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIIII)V")
	public void method2219(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - this.anInt3188;
		@Pc(17) int local17 = arg4 - this.anInt3189;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2231(128, local17, local8);
				this.method2231(8, local17 - 1, local8);
			}
			if (arg2 == 1) {
				this.method2231(2, local17, local8);
				this.method2231(32, local17, local8 + 1);
			}
			if (arg2 == 2) {
				this.method2231(8, local17, local8);
				this.method2231(128, local17 + 1, local8);
			}
			if (arg2 == 3) {
				this.method2231(32, local17, local8);
				this.method2231(2, local17, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2231(1, local17, local8);
				this.method2231(16, local17 - 1, local8 - -1);
			}
			if (arg2 == 1) {
				this.method2231(4, local17, local8);
				this.method2231(64, local17 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method2231(16, local17, local8);
				this.method2231(1, local17 + 1, local8 + -1);
			}
			if (arg2 == 3) {
				this.method2231(64, local17, local8);
				this.method2231(4, local17 - 1, local8 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method2231(130, local17, local8);
				this.method2231(8, local17 - 1, local8);
				this.method2231(32, local17, local8 + 1);
			}
			if (arg2 == 1) {
				this.method2231(10, local17, local8);
				this.method2231(32, local17, local8 + 1);
				this.method2231(128, local17 + 1, local8);
			}
			if (arg2 == 2) {
				this.method2231(40, local17, local8);
				this.method2231(128, local17 + 1, local8);
				this.method2231(2, local17, local8 - 1);
			}
			if (arg2 == 3) {
				this.method2231(160, local17, local8);
				this.method2231(2, local17, local8 - 1);
				this.method2231(8, local17 - 1, local8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2231(65536, local17, local8);
				this.method2231(4096, local17 - 1, local8);
			}
			if (arg2 == 1) {
				this.method2231(1024, local17, local8);
				this.method2231(16384, local17, local8 + 1);
			}
			if (arg2 == 2) {
				this.method2231(4096, local17, local8);
				this.method2231(65536, local17 + 1, local8);
			}
			if (arg2 == 3) {
				this.method2231(16384, local17, local8);
				this.method2231(1024, local17, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2231(512, local17, local8);
				this.method2231(8192, local17 - 1, local8 + 1);
			}
			if (arg2 == 1) {
				this.method2231(2048, local17, local8);
				this.method2231(32768, local17 + 1, local8 - -1);
			}
			if (arg2 == 2) {
				this.method2231(8192, local17, local8);
				this.method2231(512, local17 + 1, local8 - 1);
			}
			if (arg2 == 3) {
				this.method2231(32768, local17, local8);
				this.method2231(2048, local17 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2231(66560, local17, local8);
			this.method2231(4096, local17 - 1, local8);
			this.method2231(16384, local17, local8 + 1);
		}
		if (arg2 == 1) {
			this.method2231(5120, local17, local8);
			this.method2231(16384, local17, local8 + 1);
			this.method2231(65536, local17 + 1, local8);
		}
		if (arg2 == 2) {
			this.method2231(20480, local17, local8);
			this.method2231(65536, local17 + 1, local8);
			this.method2231(1024, local17, local8 - 1);
		}
		if (arg2 == 3) {
			this.method2231(81920, local17, local8);
			this.method2231(1024, local17, local8 - 1);
			this.method2231(4096, local17 - 1, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public void method2220() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3199; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt3196; local13++) {
				if (local7 == 0 || local13 == 0 || this.anInt3199 - 5 <= local7 || local13 >= this.anInt3196 - 5) {
					this.anIntArrayArray29[local7][local13] = 16777215;
				} else {
					this.anIntArrayArray29[local7][local13] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public void method2221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3188;
		@Pc(18) int local18 = arg1 - this.anInt3189;
		this.anIntArrayArray29[local18][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)V")
	public void method2222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3189;
		@Pc(18) int local18 = arg0 - this.anInt3188;
		this.anIntArrayArray29[local4][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBZIIII)V")
	public void method2223(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - this.anInt3189;
		@Pc(12) int local12 = 256;
		@Pc(22) int local22;
		if (arg3 == 1 || arg3 == 3) {
			local22 = arg5;
			arg5 = arg4;
			arg4 = local22;
		}
		if (arg1) {
			local12 = 131328;
		}
		@Pc(37) int local37 = arg0 - this.anInt3188;
		for (local22 = local6; local22 < local6 + arg5; local22++) {
			if (local22 >= 0 && local22 < this.anInt3199) {
				for (@Pc(52) int local52 = local37; local52 < arg4 + local37; local52++) {
					if (local52 >= 0 && local52 < this.anInt3196) {
						this.method2231(local12, local22, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZBI)V")
	public void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt3189;
		@Pc(9) int local9 = arg1 - this.anInt3188;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2233(128, local9, local4);
				this.method2233(8, local9, local4 - 1);
			}
			if (arg0 == 1) {
				this.method2233(2, local9, local4);
				this.method2233(32, local9 + 1, local4);
			}
			if (arg0 == 2) {
				this.method2233(8, local9, local4);
				this.method2233(128, local9, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2233(32, local9, local4);
				this.method2233(2, local9 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2233(1, local9, local4);
				this.method2233(16, local9 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method2233(4, local9, local4);
				this.method2233(64, local9 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2233(16, local9, local4);
				this.method2233(1, local9 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2233(64, local9, local4);
				this.method2233(4, local9 - 1, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method2233(130, local9, local4);
				this.method2233(8, local9, local4 - 1);
				this.method2233(32, local9 + 1, local4);
			}
			if (arg0 == 1) {
				this.method2233(10, local9, local4);
				this.method2233(32, local9 + 1, local4);
				this.method2233(128, local9, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2233(40, local9, local4);
				this.method2233(128, local9, local4 + 1);
				this.method2233(2, local9 - 1, local4);
			}
			if (arg0 == 3) {
				this.method2233(160, local9, local4);
				this.method2233(2, local9 - 1, local4);
				this.method2233(8, local9, local4 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2233(65536, local9, local4);
				this.method2233(4096, local9, local4 - 1);
			}
			if (arg0 == 1) {
				this.method2233(1024, local9, local4);
				this.method2233(16384, local9 + 1, local4);
			}
			if (arg0 == 2) {
				this.method2233(4096, local9, local4);
				this.method2233(65536, local9, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2233(16384, local9, local4);
				this.method2233(1024, local9 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2233(512, local9, local4);
				this.method2233(8192, local9 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method2233(2048, local9, local4);
				this.method2233(32768, local9 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2233(8192, local9, local4);
				this.method2233(512, local9 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2233(32768, local9, local4);
				this.method2233(2048, local9 - 1, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2233(66560, local9, local4);
			this.method2233(4096, local9, local4 - 1);
			this.method2233(16384, local9 + 1, local4);
		}
		if (arg0 == 1) {
			this.method2233(5120, local9, local4);
			this.method2233(16384, local9 + 1, local4);
			this.method2233(65536, local9, local4 + 1);
		}
		if (arg0 == 2) {
			this.method2233(20480, local9, local4);
			this.method2233(65536, local9, local4 + 1);
			this.method2233(1024, local9 - 1, local4);
		}
		if (arg0 == 3) {
			this.method2233(81920, local9, local4);
			this.method2233(1024, local9 - 1, local4);
			this.method2233(4096, local9, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(III)V")
	public void method2225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3188;
		@Pc(13) int local13 = arg0 - this.anInt3189;
		this.anIntArrayArray29[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZIZI)V")
	public void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt3188;
		@Pc(12) int local12 = 256;
		@Pc(22) int local22;
		if (arg1 == 1 || arg1 == 3) {
			local22 = arg2;
			arg2 = arg0;
			arg0 = local22;
		}
		@Pc(35) int local35 = arg4 - this.anInt3189;
		if (arg3) {
			local12 = 131328;
		}
		for (local22 = local35; local22 < arg2 + local35; local22++) {
			if (local22 >= 0 && local22 < this.anInt3199) {
				for (@Pc(60) int local60 = local6; local60 < local6 + arg0; local60++) {
					if (local60 >= 0 && this.anInt3196 > local60) {
						this.method2233(local12, local60, local22);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 == arg5 && arg1 == arg3) {
			return true;
		}
		@Pc(24) int local24 = arg1 - this.anInt3188;
		@Pc(29) int local29 = arg5 - this.anInt3189;
		@Pc(34) int local34 = arg3 - this.anInt3188;
		@Pc(48) int local48 = arg2 - this.anInt3189;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local48 + 1 == local29 && local34 == local24 && (this.anIntArrayArray29[local29][local34] & 0x80) == 0) {
					return true;
				}
				if (local48 == local29 && local34 == local24 - 1 && (this.anIntArrayArray29[local29][local34] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local29 == local48 - 1 && local24 == local34 && (this.anIntArrayArray29[local29][local34] & 0x8) == 0) {
					return true;
				}
				if (local48 == local29 && local34 == local24 - 1 && (this.anIntArrayArray29[local29][local34] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local48 - 1 == local29 && local34 == local24 && (this.anIntArrayArray29[local29][local34] & 0x8) == 0) {
					return true;
				}
				if (local48 == local29 && local24 + 1 == local34 && (this.anIntArrayArray29[local29][local34] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local48 + 1 == local29 && local24 == local34 && (this.anIntArrayArray29[local29][local34] & 0x80) == 0) {
					return true;
				}
				if (local48 == local29 && local24 + 1 == local34 && (this.anIntArrayArray29[local29][local34] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local29 == local48 && local34 == local24 + 1 && (this.anIntArrayArray29[local29][local34] & 0x20) == 0) {
				return true;
			}
			if (local48 == local29 && local24 - 1 == local34 && (this.anIntArrayArray29[local29][local34] & 0x2) == 0) {
				return true;
			}
			if (local29 == local48 - 1 && local24 == local34 && (this.anIntArrayArray29[local29][local34] & 0x8) == 0) {
				return true;
			}
			if (local29 == local48 + 1 && local24 == local34 && (this.anIntArrayArray29[local29][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBIII)Z")
	public boolean method2228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg2 && arg1 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt3188;
		@Pc(29) int local29 = arg0 - this.anInt3189;
		@Pc(34) int local34 = arg2 - this.anInt3189;
		@Pc(39) int local39 = arg1 - this.anInt3188;
		if (arg3 == 0) {
			if (arg5 == 0) {
				if (local34 == local29 - 1 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local24 + 1 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local34 == local29 && local24 - 1 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local34 == local29 && local39 == local24 + 1) {
					return true;
				}
				if (local29 - 1 == local34 && local39 == local24 && (this.anIntArrayArray29[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 + 1 == local34 && local39 == local24 && (this.anIntArrayArray29[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local34 == local29 + 1 && local24 == local39) {
					return true;
				}
				if (local29 == local34 && local39 == local24 + 1 && (this.anIntArrayArray29[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 && local39 == local24 - 1 && (this.anIntArrayArray29[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local29 == local34 && local39 == local24 - 1) {
					return true;
				}
				if (local29 - 1 == local34 && local24 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 == local29 + 1 && local39 == local24 && (this.anIntArrayArray29[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				if (local29 - 1 == local34 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local39 == local24 + 1) {
					return true;
				}
				if (local29 + 1 == local34 && local39 == local24 && (this.anIntArrayArray29[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
				if (local29 == local34 && local24 - 1 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local34 == local29 - 1 && local39 == local24 && (this.anIntArrayArray29[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 && local24 + 1 == local39) {
					return true;
				}
				if (local34 == local29 + 1 && local24 == local39) {
					return true;
				}
				if (local29 == local34 && local39 == local24 - 1 && (this.anIntArrayArray29[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local29 - 1 == local34 && local24 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 && local24 + 1 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local34 == local29 + 1 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local24 - 1 == local39) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local34 == local29 - 1 && local39 == local24) {
					return true;
				}
				if (local34 == local29 && local24 + 1 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 + 1 == local34 && local24 == local39 && (this.anIntArrayArray29[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local29 && local39 == local24 - 1) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local34 == local29 && local39 == local24 + 1 && (this.anIntArrayArray29[local34][local39] & 0x20) == 0) {
				return true;
			}
			if (local34 == local29 && local24 - 1 == local39 && (this.anIntArrayArray29[local34][local39] & 0x2) == 0) {
				return true;
			}
			if (local29 - 1 == local34 && local24 == local39 && (this.anIntArrayArray29[local34][local39] & 0x8) == 0) {
				return true;
			}
			if (local34 == local29 + 1 && local39 == local24 && (this.anIntArrayArray29[local34][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZ)V")
	private void method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray29[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg4 - 1;
		@Pc(15) int local15 = arg1 + arg0 - 1;
		if (arg5 >= arg6 && local9 >= arg5 && arg2 >= arg0 && arg2 <= local15) {
			return true;
		} else if (arg6 - 1 == arg5 && arg2 >= arg0 && local15 >= arg2 && (this.anIntArrayArray29[arg5 - this.anInt3189][arg2 - this.anInt3188] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg5 && arg0 <= arg2 && arg2 <= local15 && (this.anIntArrayArray29[arg5 - this.anInt3189][arg2 - this.anInt3188] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg0 - 1 && arg5 >= arg6 && arg5 <= local9 && (this.anIntArrayArray29[arg5 - this.anInt3189][arg2 - this.anInt3188] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local15 + 1 && arg5 >= arg6 && arg5 <= local9 && (this.anIntArrayArray29[arg5 - this.anInt3189][arg2 - this.anInt3188] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBI)V")
	private void method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray29[arg2][arg1] |= arg0;
	}
}

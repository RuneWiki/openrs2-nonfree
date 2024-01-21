import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class48 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	private final int anInt2237;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	private final int anInt2245;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	private final int anInt2251;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	private final int anInt2247;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2237 = arg1;
		this.anInt2245 = arg0;
		this.anInt2251 = 0;
		this.anInt2247 = 0;
		this.anIntArrayArray35 = new int[this.anInt2245][this.anInt2237];
		this.method1484();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZI)V")
	public void method1473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 - this.anInt2247;
		@Pc(19) int local19 = arg0 - this.anInt2251;
		@Pc(21) int local21 = 256;
		if (arg3) {
			local21 = 131328;
		}
		for (@Pc(29) int local29 = local6; local29 < local6 + arg1; local29++) {
			if (local29 >= 0 && this.anInt2245 > local29) {
				for (@Pc(46) int local46 = local19; local46 < arg4 + local19; local46++) {
					if (local46 >= 0 && local46 < this.anInt2237) {
						this.method1488(local21, local29, local46);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZIII)V")
	public void method1475(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt2247;
		@Pc(13) int local13 = arg2 - this.anInt2251;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method1487(128, local13, local8);
				this.method1487(8, local13, local8 - 1);
			}
			if (arg0 == 1) {
				this.method1487(2, local13, local8);
				this.method1487(32, local13 + 1, local8);
			}
			if (arg0 == 2) {
				this.method1487(8, local13, local8);
				this.method1487(128, local13, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1487(32, local13, local8);
				this.method1487(2, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method1487(1, local13, local8);
				this.method1487(16, local13 + 1, local8 + -1);
			}
			if (arg0 == 1) {
				this.method1487(4, local13, local8);
				this.method1487(64, local13 + 1, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1487(16, local13, local8);
				this.method1487(1, local13 - 1, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1487(64, local13, local8);
				this.method1487(4, local13 - 1, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method1487(130, local13, local8);
				this.method1487(8, local13, local8 - 1);
				this.method1487(32, local13 + 1, local8);
			}
			if (arg0 == 1) {
				this.method1487(10, local13, local8);
				this.method1487(32, local13 + 1, local8);
				this.method1487(128, local13, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1487(40, local13, local8);
				this.method1487(128, local13, local8 + 1);
				this.method1487(2, local13 - 1, local8);
			}
			if (arg0 == 3) {
				this.method1487(160, local13, local8);
				this.method1487(2, local13 - 1, local8);
				this.method1487(8, local13, local8 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method1487(65536, local13, local8);
				this.method1487(4096, local13, local8 - 1);
			}
			if (arg0 == 1) {
				this.method1487(1024, local13, local8);
				this.method1487(16384, local13 + 1, local8);
			}
			if (arg0 == 2) {
				this.method1487(4096, local13, local8);
				this.method1487(65536, local13, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1487(16384, local13, local8);
				this.method1487(1024, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method1487(512, local13, local8);
				this.method1487(8192, local13 + 1, local8 + -1);
			}
			if (arg0 == 1) {
				this.method1487(2048, local13, local8);
				this.method1487(32768, local13 + 1, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1487(8192, local13, local8);
				this.method1487(512, local13 - 1, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1487(32768, local13, local8);
				this.method1487(2048, local13 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1487(66560, local13, local8);
			this.method1487(4096, local13, local8 - 1);
			this.method1487(16384, local13 + 1, local8);
		}
		if (arg0 == 1) {
			this.method1487(5120, local13, local8);
			this.method1487(16384, local13 + 1, local8);
			this.method1487(65536, local13, local8 + 1);
		}
		if (arg0 == 2) {
			this.method1487(20480, local13, local8);
			this.method1487(65536, local13, local8 + 1);
			this.method1487(1024, local13 - 1, local8);
		}
		if (arg0 == 3) {
			this.method1487(81920, local13, local8);
			this.method1487(1024, local13 - 1, local8);
			this.method1487(4096, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 + arg6 - 1;
		@Pc(16) int local16 = arg1 + arg2 - 1;
		if (arg0 >= arg2 && arg0 <= local16 && arg4 >= arg5 && arg4 <= local10) {
			return true;
		} else if (arg0 == arg2 - 1 && arg4 >= arg5 && arg4 <= local10 && (this.anIntArrayArray35[arg0 - this.anInt2247][arg4 - this.anInt2251] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local16 + 1 == arg0 && arg4 >= arg5 && local10 >= arg4 && (this.anIntArrayArray35[arg0 - this.anInt2247][arg4 - this.anInt2251] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg5 - 1 && arg2 <= arg0 && arg0 <= local16 && (this.anIntArrayArray35[arg0 - this.anInt2247][arg4 - this.anInt2251] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local10 + 1 && arg2 <= arg0 && local16 >= arg0 && (this.anIntArrayArray35[arg0 - this.anInt2247][arg4 - this.anInt2251] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIZB)V")
	public void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = arg4 - this.anInt2251;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg1 - this.anInt2247;
		if (arg5) {
			local12 = 131328;
		}
		@Pc(43) int local43;
		if (arg3 == 1 || arg3 == 3) {
			local43 = arg2;
			arg2 = arg0;
			arg0 = local43;
		}
		for (local43 = local17; local43 < local17 + arg2; local43++) {
			if (local43 >= 0 && local43 < this.anInt2245) {
				for (@Pc(62) int local62 = local6; local62 < arg0 + local6; local62++) {
					if (local62 >= 0 && local62 < this.anInt2237) {
						this.method1487(local12, local62, local43);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZI)V")
	public void method1478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2247;
		@Pc(25) int local25 = arg1 - this.anInt2251;
		this.anIntArrayArray35[local4][local25] |= 0x200000;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(III)V")
	public void method1479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2247;
		@Pc(9) int local9 = arg1 - this.anInt2251;
		this.anIntArrayArray35[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method1480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg4 && arg3 == arg2) {
			return true;
		}
		@Pc(16) int local16 = arg5 - this.anInt2247;
		@Pc(21) int local21 = arg2 - this.anInt2251;
		@Pc(32) int local32 = arg3 - this.anInt2251;
		@Pc(37) int local37 = arg4 - this.anInt2247;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (local37 == local16 - 1 && local21 == local32) {
					return true;
				}
				if (local37 == local16 && local32 + 1 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local37 == local16 && local21 == local32 - 1 && (this.anIntArrayArray35[local37][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local16 == local37 && local32 + 1 == local21) {
					return true;
				}
				if (local37 == local16 - 1 && local21 == local32 && (this.anIntArrayArray35[local37][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 + 1 && local21 == local32 && (this.anIntArrayArray35[local37][local21] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local16 + 1 == local37 && local21 == local32) {
					return true;
				}
				if (local16 == local37 && local21 == local32 + 1 && (this.anIntArrayArray35[local37][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local37 == local16 && local32 - 1 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local16 == local37 && local32 - 1 == local21) {
					return true;
				}
				if (local16 - 1 == local37 && local32 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 + 1 && local32 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				if (local37 == local16 - 1 && local32 == local21) {
					return true;
				}
				if (local16 == local37 && local21 == local32 + 1) {
					return true;
				}
				if (local16 + 1 == local37 && local32 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local37 && local32 - 1 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local16 - 1 == local37 && local21 == local32 && (this.anIntArrayArray35[local37][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 && local32 + 1 == local21) {
					return true;
				}
				if (local16 + 1 == local37 && local32 == local21) {
					return true;
				}
				if (local16 == local37 && local32 - 1 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local16 - 1 == local37 && local21 == local32 && (this.anIntArrayArray35[local37][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 && local21 == local32 + 1 && (this.anIntArrayArray35[local37][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 + 1 == local37 && local21 == local32) {
					return true;
				}
				if (local37 == local16 && local21 == local32 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local16 - 1 == local37 && local32 == local21) {
					return true;
				}
				if (local16 == local37 && local21 == local32 + 1 && (this.anIntArrayArray35[local37][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 + 1 == local37 && local32 == local21 && (this.anIntArrayArray35[local37][local21] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local37 && local32 - 1 == local21) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local16 == local37 && local21 == local32 + 1 && (this.anIntArrayArray35[local37][local21] & 0x20) == 0) {
				return true;
			}
			if (local16 == local37 && local32 - 1 == local21 && (this.anIntArrayArray35[local37][local21] & 0x2) == 0) {
				return true;
			}
			if (local37 == local16 - 1 && local32 == local21 && (this.anIntArrayArray35[local37][local21] & 0x8) == 0) {
				return true;
			}
			if (local37 == local16 + 1 && local21 == local32 && (this.anIntArrayArray35[local37][local21] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
	public void method1481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2251;
		@Pc(9) int local9 = arg0 - this.anInt2247;
		this.anIntArrayArray35[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method1482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg2 && arg4 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt2251;
		@Pc(25) int local25 = arg3 - this.anInt2251;
		@Pc(30) int local30 = arg1 - this.anInt2247;
		@Pc(35) int local35 = arg2 - this.anInt2247;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local35 == local30 + 1 && local25 == local20 && (this.anIntArrayArray35[local35][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local35 && local25 == local20 - 1 && (this.anIntArrayArray35[local35][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray35[local35][local25] & 0x8) == 0) {
					return true;
				}
				if (local35 == local30 && local25 == local20 - 1 && (this.anIntArrayArray35[local35][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local35 == local30 - 1 && local25 == local20 && (this.anIntArrayArray35[local35][local25] & 0x8) == 0) {
					return true;
				}
				if (local30 == local35 && local25 == local20 + 1 && (this.anIntArrayArray35[local35][local25] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local30 + 1 == local35 && local25 == local20 && (this.anIntArrayArray35[local35][local25] & 0x80) == 0) {
					return true;
				}
				if (local35 == local30 && local20 + 1 == local25 && (this.anIntArrayArray35[local35][local25] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local30 == local35 && local25 == local20 + 1 && (this.anIntArrayArray35[local35][local25] & 0x20) == 0) {
				return true;
			}
			if (local35 == local30 && local20 - 1 == local25 && (this.anIntArrayArray35[local35][local25] & 0x2) == 0) {
				return true;
			}
			if (local35 == local30 - 1 && local20 == local25 && (this.anIntArrayArray35[local35][local25] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local35 && local25 == local20 && (this.anIntArrayArray35[local35][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public void method1484() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2245; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2237; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt2245 - 5 || this.anInt2237 - 5 <= local15) {
					this.anIntArrayArray35[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray35[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZBII)V")
	public void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - this.anInt2251;
		@Pc(13) int local13 = arg0 - this.anInt2247;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1488(128, local13, local8);
				this.method1488(8, local13 - 1, local8);
			}
			if (arg4 == 1) {
				this.method1488(2, local13, local8);
				this.method1488(32, local13, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1488(8, local13, local8);
				this.method1488(128, local13 + 1, local8);
			}
			if (arg4 == 3) {
				this.method1488(32, local13, local8);
				this.method1488(2, local13, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1488(1, local13, local8);
				this.method1488(16, local13 - 1, local8 - -1);
			}
			if (arg4 == 1) {
				this.method1488(4, local13, local8);
				this.method1488(64, local13 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1488(16, local13, local8);
				this.method1488(1, local13 + 1, local8 - 1);
			}
			if (arg4 == 3) {
				this.method1488(64, local13, local8);
				this.method1488(4, local13 - 1, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method1488(130, local13, local8);
				this.method1488(8, local13 - 1, local8);
				this.method1488(32, local13, local8 + 1);
			}
			if (arg4 == 1) {
				this.method1488(10, local13, local8);
				this.method1488(32, local13, local8 + 1);
				this.method1488(128, local13 + 1, local8);
			}
			if (arg4 == 2) {
				this.method1488(40, local13, local8);
				this.method1488(128, local13 + 1, local8);
				this.method1488(2, local13, local8 - 1);
			}
			if (arg4 == 3) {
				this.method1488(160, local13, local8);
				this.method1488(2, local13, local8 - 1);
				this.method1488(8, local13 - 1, local8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1488(65536, local13, local8);
				this.method1488(4096, local13 - 1, local8);
			}
			if (arg4 == 1) {
				this.method1488(1024, local13, local8);
				this.method1488(16384, local13, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1488(4096, local13, local8);
				this.method1488(65536, local13 + 1, local8);
			}
			if (arg4 == 3) {
				this.method1488(16384, local13, local8);
				this.method1488(1024, local13, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1488(512, local13, local8);
				this.method1488(8192, local13 - 1, local8 + 1);
			}
			if (arg4 == 1) {
				this.method1488(2048, local13, local8);
				this.method1488(32768, local13 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1488(8192, local13, local8);
				this.method1488(512, local13 + 1, local8 - 1);
			}
			if (arg4 == 3) {
				this.method1488(32768, local13, local8);
				this.method1488(2048, local13 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1488(66560, local13, local8);
			this.method1488(4096, local13 - 1, local8);
			this.method1488(16384, local13, local8 + 1);
		}
		if (arg4 == 1) {
			this.method1488(5120, local13, local8);
			this.method1488(16384, local13, local8 + 1);
			this.method1488(65536, local13 + 1, local8);
		}
		if (arg4 == 2) {
			this.method1488(20480, local13, local8);
			this.method1488(65536, local13 + 1, local8);
			this.method1488(1024, local13, local8 - 1);
		}
		if (arg4 == 3) {
			this.method1488(81920, local13, local8);
			this.method1488(1024, local13, local8 - 1);
			this.method1488(4096, local13 - 1, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZI)V")
	private void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	private void method1488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg1][arg2] |= arg0;
	}
}

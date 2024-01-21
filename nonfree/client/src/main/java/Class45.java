import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class45 {

	@OriginalMember(owner = "client!m", name = "r", descriptor = "I")
	private final int anInt1773;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "I")
	private final int anInt1782;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	private final int anInt1760;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private final int anInt1761;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1773 = arg0;
		this.anInt1782 = 0;
		this.anInt1760 = arg1;
		this.anIntArrayArray15 = new int[this.anInt1773][this.anInt1760];
		this.anInt1761 = 0;
		this.method1330();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
	public void method1322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1782;
		@Pc(13) int local13 = arg0 - this.anInt1761;
		this.anIntArrayArray15[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg5 && arg4 == arg1) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt1761;
		@Pc(25) int local25 = arg0 - this.anInt1761;
		@Pc(30) int local30 = arg1 - this.anInt1782;
		@Pc(40) int local40 = arg4 - this.anInt1782;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local20 == local25 + 1 && local30 == local40 && (this.anIntArrayArray15[local20][local30] & 0x80) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local40 - 1 && (this.anIntArrayArray15[local20][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local25 - 1 == local20 && local40 == local30 && (this.anIntArrayArray15[local20][local30] & 0x8) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local40 - 1 && (this.anIntArrayArray15[local20][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local25 - 1 == local20 && local30 == local40 && (this.anIntArrayArray15[local20][local30] & 0x8) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local40 + 1 && (this.anIntArrayArray15[local20][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local25 + 1 == local20 && local30 == local40 && (this.anIntArrayArray15[local20][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local40 + 1 && (this.anIntArrayArray15[local20][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local25 == local20 && local40 + 1 == local30 && (this.anIntArrayArray15[local20][local30] & 0x20) == 0) {
				return true;
			}
			if (local20 == local25 && local30 == local40 - 1 && (this.anIntArrayArray15[local20][local30] & 0x2) == 0) {
				return true;
			}
			if (local20 == local25 - 1 && local40 == local30 && (this.anIntArrayArray15[local20][local30] & 0x8) == 0) {
				return true;
			}
			if (local25 + 1 == local20 && local40 == local30 && (this.anIntArrayArray15[local20][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIIII)V")
	public void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1782;
		@Pc(21) int local21 = arg3 - this.anInt1761;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method1326(local21, 128, local4);
				this.method1326(local21 - 1, 8, local4);
			}
			if (arg0 == 1) {
				this.method1326(local21, 2, local4);
				this.method1326(local21, 32, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1326(local21, 8, local4);
				this.method1326(local21 + 1, 128, local4);
			}
			if (arg0 == 3) {
				this.method1326(local21, 32, local4);
				this.method1326(local21, 2, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method1326(local21, 1, local4);
				this.method1326(local21 - 1, 16, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1326(local21, 4, local4);
				this.method1326(local21 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1326(local21, 16, local4);
				this.method1326(local21 + 1, 1, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1326(local21, 64, local4);
				this.method1326(local21 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method1326(local21, 130, local4);
				this.method1326(local21 - 1, 8, local4);
				this.method1326(local21, 32, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1326(local21, 10, local4);
				this.method1326(local21, 32, local4 + 1);
				this.method1326(local21 + 1, 128, local4);
			}
			if (arg0 == 2) {
				this.method1326(local21, 40, local4);
				this.method1326(local21 + 1, 128, local4);
				this.method1326(local21, 2, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1326(local21, 160, local4);
				this.method1326(local21, 2, local4 - 1);
				this.method1326(local21 - 1, 8, local4);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method1326(local21, 65536, local4);
				this.method1326(local21 - 1, 4096, local4);
			}
			if (arg0 == 1) {
				this.method1326(local21, 1024, local4);
				this.method1326(local21, 16384, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1326(local21, 4096, local4);
				this.method1326(local21 + 1, 65536, local4);
			}
			if (arg0 == 3) {
				this.method1326(local21, 16384, local4);
				this.method1326(local21, 1024, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method1326(local21, 512, local4);
				this.method1326(local21 - 1, 8192, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1326(local21, 2048, local4);
				this.method1326(local21 + 1, 32768, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1326(local21, 8192, local4);
				this.method1326(local21 + 1, 512, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1326(local21, 32768, local4);
				this.method1326(local21 - 1, 2048, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1326(local21, 66560, local4);
			this.method1326(local21 - 1, 4096, local4);
			this.method1326(local21, 16384, local4 + 1);
		}
		if (arg0 == 1) {
			this.method1326(local21, 5120, local4);
			this.method1326(local21, 16384, local4 + 1);
			this.method1326(local21 + 1, 65536, local4);
		}
		if (arg0 == 2) {
			this.method1326(local21, 20480, local4);
			this.method1326(local21 + 1, 65536, local4);
			this.method1326(local21, 1024, local4 - 1);
		}
		if (arg0 == 3) {
			this.method1326(local21, 81920, local4);
			this.method1326(local21, 1024, local4 - 1);
			this.method1326(local21 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIZII)V")
	public void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg3 - this.anInt1761;
		@Pc(15) int local15 = arg2 - this.anInt1782;
		@Pc(23) int local23;
		if (arg1 == 1 || arg1 == 3) {
			local23 = arg0;
			arg0 = arg5;
			arg5 = local23;
		}
		@Pc(29) int local29 = 256;
		if (arg4) {
			local29 = 131328;
		}
		for (local23 = local6; local23 < arg0 + local6; local23++) {
			if (local23 >= 0 && local23 < this.anInt1773) {
				for (@Pc(53) int local53 = local15; local53 < local15 + arg5; local53++) {
					if (local53 >= 0 && this.anInt1760 > local53) {
						this.method1333(local29, local53, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZ)V")
	private void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	public void method1328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1761;
		@Pc(13) int local13 = arg0 - this.anInt1782;
		this.anIntArrayArray15[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public void method1330() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1773; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1760; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt1773 - 5 || this.anInt1760 - 5 <= local7) {
					this.anIntArrayArray15[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray15[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg6 + arg5 - 1;
		@Pc(23) int local23 = arg1 + arg4 - 1;
		if (arg3 >= arg5 && arg3 <= local17 && arg1 <= arg0 && local23 >= arg0) {
			return true;
		} else if (arg3 == arg5 - 1 && arg0 >= arg1 && arg0 <= local23 && (this.anIntArrayArray15[arg3 - this.anInt1761][arg0 - this.anInt1782] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local17 + 1 == arg3 && arg1 <= arg0 && local23 >= arg0 && (this.anIntArrayArray15[arg3 - this.anInt1761][arg0 - this.anInt1782] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg0 && arg3 >= arg5 && arg3 <= local17 && (this.anIntArrayArray15[arg3 - this.anInt1761][arg0 - this.anInt1782] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local23 + 1 && arg5 <= arg3 && arg3 <= local17 && (this.anIntArrayArray15[arg3 - this.anInt1761][arg0 - this.anInt1782] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIZ)V")
	private void method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
	public void method1334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1761;
		@Pc(9) int local9 = arg0 - this.anInt1782;
		this.anIntArrayArray15[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIZI)V")
	public void method1335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = arg1 - this.anInt1782;
		@Pc(11) int local11 = arg0 - this.anInt1761;
		@Pc(21) int local21;
		if (arg2 == 1 || arg2 == 3) {
			local21 = arg3;
			arg3 = arg4;
			arg4 = local21;
		}
		@Pc(27) int local27 = 256;
		if (arg5) {
			local27 = 131328;
		}
		for (local21 = local11; local21 < local11 + arg3; local21++) {
			if (local21 >= 0 && local21 < this.anInt1773) {
				for (@Pc(45) int local45 = local6; local45 < local6 + arg4; local45++) {
					if (local45 >= 0 && local45 < this.anInt1760) {
						this.method1326(local21, local27, local45);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg5 && arg0 == arg3) {
			return true;
		}
		@Pc(25) int local25 = arg2 - this.anInt1761;
		@Pc(30) int local30 = arg5 - this.anInt1761;
		@Pc(35) int local35 = arg3 - this.anInt1782;
		@Pc(40) int local40 = arg0 - this.anInt1782;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (local25 == local30 - 1 && local40 == local35) {
					return true;
				}
				if (local25 == local30 && local40 == local35 + 1 && (this.anIntArrayArray15[local25][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local40 == local35 - 1 && (this.anIntArrayArray15[local25][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local25 == local30 && local35 + 1 == local40) {
					return true;
				}
				if (local25 == local30 - 1 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local30 + 1 == local25 && local35 == local40) {
					return true;
				}
				if (local25 == local30 && local35 + 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local40 == local35 - 1 && (this.anIntArrayArray15[local25][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local30 == local25 && local35 - 1 == local40) {
					return true;
				}
				if (local25 == local30 - 1 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				if (local30 - 1 == local25 && local35 == local40) {
					return true;
				}
				if (local25 == local30 && local35 + 1 == local40) {
					return true;
				}
				if (local30 + 1 == local25 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x12C0180) == 0) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local30 - 1 == local25 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local25 && local35 + 1 == local40) {
					return true;
				}
				if (local25 == local30 + 1 && local40 == local35) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local30 - 1 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 && local35 + 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local40) {
					return true;
				}
				if (local30 == local25 && local35 - 1 == local40) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local30 - 1 == local25 && local35 == local40) {
					return true;
				}
				if (local30 == local25 && local35 + 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local25 && local40 == local35 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local30 == local25 && local35 + 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local35 - 1 == local40 && (this.anIntArrayArray15[local25][local40] & 0x2) == 0) {
				return true;
			}
			if (local30 - 1 == local25 && local35 == local40 && (this.anIntArrayArray15[local25][local40] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local25 && local40 == local35 && (this.anIntArrayArray15[local25][local40] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZIII)V")
	public void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt1782;
		@Pc(13) int local13 = arg3 - this.anInt1761;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method1333(128, local8, local13);
				this.method1333(8, local8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method1333(2, local8, local13);
				this.method1333(32, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method1333(8, local8, local13);
				this.method1333(128, local8, local13 + 1);
			}
			if (arg0 == 3) {
				this.method1333(32, local8, local13);
				this.method1333(2, local8 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method1333(1, local8, local13);
				this.method1333(16, local8 + 1, local13 - 1);
			}
			if (arg0 == 1) {
				this.method1333(4, local8, local13);
				this.method1333(64, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1333(16, local8, local13);
				this.method1333(1, local8 - 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method1333(64, local8, local13);
				this.method1333(4, local8 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method1333(130, local8, local13);
				this.method1333(8, local8, local13 - 1);
				this.method1333(32, local8 + 1, local13);
			}
			if (arg0 == 1) {
				this.method1333(10, local8, local13);
				this.method1333(32, local8 + 1, local13);
				this.method1333(128, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1333(40, local8, local13);
				this.method1333(128, local8, local13 + 1);
				this.method1333(2, local8 - 1, local13);
			}
			if (arg0 == 3) {
				this.method1333(160, local8, local13);
				this.method1333(2, local8 - 1, local13);
				this.method1333(8, local8, local13 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method1333(65536, local8, local13);
				this.method1333(4096, local8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method1333(1024, local8, local13);
				this.method1333(16384, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method1333(4096, local8, local13);
				this.method1333(65536, local8, local13 + 1);
			}
			if (arg0 == 3) {
				this.method1333(16384, local8, local13);
				this.method1333(1024, local8 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method1333(512, local8, local13);
				this.method1333(8192, local8 + 1, local13 + -1);
			}
			if (arg0 == 1) {
				this.method1333(2048, local8, local13);
				this.method1333(32768, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1333(8192, local8, local13);
				this.method1333(512, local8 - 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method1333(32768, local8, local13);
				this.method1333(2048, local8 - 1, local13 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1333(66560, local8, local13);
			this.method1333(4096, local8, local13 - 1);
			this.method1333(16384, local8 + 1, local13);
		}
		if (arg0 == 1) {
			this.method1333(5120, local8, local13);
			this.method1333(16384, local8 + 1, local13);
			this.method1333(65536, local8, local13 + 1);
		}
		if (arg0 == 2) {
			this.method1333(20480, local8, local13);
			this.method1333(65536, local8, local13 + 1);
			this.method1333(1024, local8 - 1, local13);
		}
		if (arg0 == 3) {
			this.method1333(81920, local8, local13);
			this.method1333(1024, local8 - 1, local13);
			this.method1333(4096, local8, local13 - 1);
			return;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class77 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	private final int anInt3059;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	private final int anInt3048;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	private final int anInt3043;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	private final int anInt3041;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(II)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3059 = arg0;
		this.anInt3048 = 0;
		this.anInt3043 = arg1;
		this.anIntArrayArray23 = new int[this.anInt3059][this.anInt3043];
		this.anInt3041 = 0;
		this.method2164();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	public void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3048;
		@Pc(9) int local9 = arg1 - this.anInt3041;
		this.anIntArrayArray23[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBZII)V")
	public void method2163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 - this.anInt3048;
		@Pc(20) int local20 = arg0 - this.anInt3041;
		@Pc(22) int local22 = 256;
		if (arg2) {
			local22 = 131328;
		}
		for (@Pc(30) int local30 = local20; local30 < arg1 + local20; local30++) {
			if (local30 >= 0 && local30 < this.anInt3059) {
				for (@Pc(46) int local46 = local15; local46 < arg3 + local15; local46++) {
					if (local46 >= 0 && local46 < this.anInt3043) {
						this.method2173(local46, local30, local22);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method2164() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3059; local7++) {
			for (@Pc(10) int local10 = 0; local10 < this.anInt3043; local10++) {
				if (local7 == 0 || local10 == 0 || local7 >= this.anInt3059 - 5 || local10 >= this.anInt3043 - 5) {
					this.anIntArrayArray23[local7][local10] = 16777215;
				} else {
					this.anIntArrayArray23[local7][local10] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZIIB)V")
	public void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt3048;
		@Pc(27) int local27 = arg3 - this.anInt3041;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2173(local4, local27, 128);
				this.method2173(local4, local27 - 1, 8);
			}
			if (arg4 == 1) {
				this.method2173(local4, local27, 2);
				this.method2173(local4 + 1, local27, 32);
			}
			if (arg4 == 2) {
				this.method2173(local4, local27, 8);
				this.method2173(local4, local27 + 1, 128);
			}
			if (arg4 == 3) {
				this.method2173(local4, local27, 32);
				this.method2173(local4 - 1, local27, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2173(local4, local27, 1);
				this.method2173(local4 + 1, local27 - 1, 16);
			}
			if (arg4 == 1) {
				this.method2173(local4, local27, 4);
				this.method2173(local4 + 1, local27 + 1, 64);
			}
			if (arg4 == 2) {
				this.method2173(local4, local27, 16);
				this.method2173(local4 - 1, local27 + 1, 1);
			}
			if (arg4 == 3) {
				this.method2173(local4, local27, 64);
				this.method2173(local4 - 1, local27 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method2173(local4, local27, 130);
				this.method2173(local4, local27 - 1, 8);
				this.method2173(local4 + 1, local27, 32);
			}
			if (arg4 == 1) {
				this.method2173(local4, local27, 10);
				this.method2173(local4 + 1, local27, 32);
				this.method2173(local4, local27 + 1, 128);
			}
			if (arg4 == 2) {
				this.method2173(local4, local27, 40);
				this.method2173(local4, local27 + 1, 128);
				this.method2173(local4 - 1, local27, 2);
			}
			if (arg4 == 3) {
				this.method2173(local4, local27, 160);
				this.method2173(local4 - 1, local27, 2);
				this.method2173(local4, local27 - 1, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2173(local4, local27, 65536);
				this.method2173(local4, local27 - 1, 4096);
			}
			if (arg4 == 1) {
				this.method2173(local4, local27, 1024);
				this.method2173(local4 + 1, local27, 16384);
			}
			if (arg4 == 2) {
				this.method2173(local4, local27, 4096);
				this.method2173(local4, local27 + 1, 65536);
			}
			if (arg4 == 3) {
				this.method2173(local4, local27, 16384);
				this.method2173(local4 - 1, local27, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2173(local4, local27, 512);
				this.method2173(local4 + 1, local27 + -1, 8192);
			}
			if (arg4 == 1) {
				this.method2173(local4, local27, 2048);
				this.method2173(local4 + 1, local27 + 1, 32768);
			}
			if (arg4 == 2) {
				this.method2173(local4, local27, 8192);
				this.method2173(local4 - 1, local27 + 1, 512);
			}
			if (arg4 == 3) {
				this.method2173(local4, local27, 32768);
				this.method2173(local4 - 1, local27 - 1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2173(local4, local27, 66560);
			this.method2173(local4, local27 - 1, 4096);
			this.method2173(local4 + 1, local27, 16384);
		}
		if (arg4 == 1) {
			this.method2173(local4, local27, 5120);
			this.method2173(local4 + 1, local27, 16384);
			this.method2173(local4, local27 + 1, 65536);
		}
		if (arg4 == 2) {
			this.method2173(local4, local27, 20480);
			this.method2173(local4, local27 + 1, 65536);
			this.method2173(local4 - 1, local27, 1024);
		}
		if (arg4 == 3) {
			this.method2173(local4, local27, 81920);
			this.method2173(local4 - 1, local27, 1024);
			this.method2173(local4, local27 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg1 && arg4 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt3048;
		@Pc(25) int local25 = arg0 - this.anInt3041;
		@Pc(30) int local30 = arg3 - this.anInt3048;
		@Pc(46) int local46 = arg1 - this.anInt3041;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local46 + 1 == local25 && local20 == local30 && (this.anIntArrayArray23[local25][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local46 && local20 - 1 == local30 && (this.anIntArrayArray23[local25][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local25 == local46 - 1 && local30 == local20 && (this.anIntArrayArray23[local25][local30] & 0x8) == 0) {
					return true;
				}
				if (local25 == local46 && local20 - 1 == local30 && (this.anIntArrayArray23[local25][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local25 == local46 - 1 && local20 == local30 && (this.anIntArrayArray23[local25][local30] & 0x8) == 0) {
					return true;
				}
				if (local46 == local25 && local20 + 1 == local30 && (this.anIntArrayArray23[local25][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local46 + 1 == local25 && local30 == local20 && (this.anIntArrayArray23[local25][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local46 && local20 + 1 == local30 && (this.anIntArrayArray23[local25][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local25 == local46 && local20 + 1 == local30 && (this.anIntArrayArray23[local25][local30] & 0x20) == 0) {
				return true;
			}
			if (local46 == local25 && local20 - 1 == local30 && (this.anIntArrayArray23[local25][local30] & 0x2) == 0) {
				return true;
			}
			if (local46 - 1 == local25 && local30 == local20 && (this.anIntArrayArray23[local25][local30] & 0x8) == 0) {
				return true;
			}
			if (local25 == local46 + 1 && local30 == local20 && (this.anIntArrayArray23[local25][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg2 + arg5 - 1;
		@Pc(23) int local23 = arg6 + arg3 - 1;
		if (arg1 >= arg5 && local17 >= arg1 && arg6 <= arg4 && local23 >= arg4) {
			return true;
		} else if (arg1 == arg5 - 1 && arg6 <= arg4 && arg4 <= local23 && (this.anIntArrayArray23[arg1 - this.anInt3041][arg4 - this.anInt3048] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg1 == local17 + 1 && arg4 >= arg6 && local23 >= arg4 && (this.anIntArrayArray23[arg1 - this.anInt3041][arg4 - this.anInt3048] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg4 && arg1 >= arg5 && local17 >= arg1 && (this.anIntArrayArray23[arg1 - this.anInt3041][arg4 - this.anInt3048] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local23 + 1 && arg5 <= arg1 && local17 >= arg1 && (this.anIntArrayArray23[arg1 - this.anInt3041][arg4 - this.anInt3048] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZIII)V")
	public void method2170(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt3041;
		@Pc(18) int local18 = arg2 - this.anInt3048;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2176(128, local18, local4);
				this.method2176(8, local18, local4 - 1);
			}
			if (arg4 == 1) {
				this.method2176(2, local18, local4);
				this.method2176(32, local18 + 1, local4);
			}
			if (arg4 == 2) {
				this.method2176(8, local18, local4);
				this.method2176(128, local18, local4 + 1);
			}
			if (arg4 == 3) {
				this.method2176(32, local18, local4);
				this.method2176(2, local18 - 1, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2176(1, local18, local4);
				this.method2176(16, local18 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method2176(4, local18, local4);
				this.method2176(64, local18 + 1, local4 - -1);
			}
			if (arg4 == 2) {
				this.method2176(16, local18, local4);
				this.method2176(1, local18 - 1, local4 - -1);
			}
			if (arg4 == 3) {
				this.method2176(64, local18, local4);
				this.method2176(4, local18 - 1, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method2176(130, local18, local4);
				this.method2176(8, local18, local4 - 1);
				this.method2176(32, local18 + 1, local4);
			}
			if (arg4 == 1) {
				this.method2176(10, local18, local4);
				this.method2176(32, local18 + 1, local4);
				this.method2176(128, local18, local4 + 1);
			}
			if (arg4 == 2) {
				this.method2176(40, local18, local4);
				this.method2176(128, local18, local4 + 1);
				this.method2176(2, local18 - 1, local4);
			}
			if (arg4 == 3) {
				this.method2176(160, local18, local4);
				this.method2176(2, local18 - 1, local4);
				this.method2176(8, local18, local4 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method2176(65536, local18, local4);
				this.method2176(4096, local18, local4 - 1);
			}
			if (arg4 == 1) {
				this.method2176(1024, local18, local4);
				this.method2176(16384, local18 + 1, local4);
			}
			if (arg4 == 2) {
				this.method2176(4096, local18, local4);
				this.method2176(65536, local18, local4 + 1);
			}
			if (arg4 == 3) {
				this.method2176(16384, local18, local4);
				this.method2176(1024, local18 - 1, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method2176(512, local18, local4);
				this.method2176(8192, local18 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method2176(2048, local18, local4);
				this.method2176(32768, local18 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method2176(8192, local18, local4);
				this.method2176(512, local18 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method2176(32768, local18, local4);
				this.method2176(2048, local18 - 1, local4 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2176(66560, local18, local4);
			this.method2176(4096, local18, local4 - 1);
			this.method2176(16384, local18 + 1, local4);
		}
		if (arg4 == 1) {
			this.method2176(5120, local18, local4);
			this.method2176(16384, local18 + 1, local4);
			this.method2176(65536, local18, local4 + 1);
		}
		if (arg4 == 2) {
			this.method2176(20480, local18, local4);
			this.method2176(65536, local18, local4 + 1);
			this.method2176(1024, local18 - 1, local4);
		}
		if (arg4 == 3) {
			this.method2176(81920, local18, local4);
			this.method2176(1024, local18 - 1, local4);
			this.method2176(4096, local18, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
	public void method2171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3041;
		@Pc(13) int local13 = arg1 - this.anInt3048;
		this.anIntArrayArray23[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	private void method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray23[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method2174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg5 && arg3 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg0 - this.anInt3041;
		@Pc(25) int local25 = arg3 - this.anInt3048;
		@Pc(30) int local30 = arg5 - this.anInt3041;
		@Pc(35) int local35 = arg4 - this.anInt3048;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (local20 - 1 == local30 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray23[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local30 == local20 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 - 1 && local35 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local30 == local20 + 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray23[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local20 == local30 && local25 == local35 - 1) {
					return true;
				}
				if (local20 - 1 == local30 && local35 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local35 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				if (local30 == local20 - 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1) {
					return true;
				}
				if (local30 == local20 + 1 && local35 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray23[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray23[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 + 1 && local35 == local25) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local20 - 1 == local30 && local25 == local35 && (this.anIntArrayArray23[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray23[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35) {
					return true;
				}
				if (local20 == local30 && local25 == local35 - 1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local30 == local20 - 1 && local25 == local35) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray23[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray23[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray23[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray23[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray23[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray23[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)V")
	private void method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray23[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIZII)V")
	public void method2177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16;
		if (arg2 == 1 || arg2 == 3) {
			local16 = arg4;
			arg4 = arg1;
			arg1 = local16;
		}
		@Pc(25) int local25 = arg0 - this.anInt3048;
		@Pc(30) int local30 = arg5 - this.anInt3041;
		@Pc(32) int local32 = 256;
		if (arg3) {
			local32 = 131328;
		}
		for (local16 = local30; local16 < arg4 + local30; local16++) {
			if (local16 >= 0 && this.anInt3059 > local16) {
				for (@Pc(53) int local53 = local25; local53 < local25 + arg1; local53++) {
					if (local53 >= 0 && local53 < this.anInt3043) {
						this.method2176(local32, local53, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)V")
	public void method2179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3048;
		@Pc(9) int local9 = arg1 - this.anInt3041;
		this.anIntArrayArray23[local9][local4] |= 0x40000;
	}
}

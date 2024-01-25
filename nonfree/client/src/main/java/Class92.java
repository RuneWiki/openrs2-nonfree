import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class92 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
	public int anInt2163;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public int anInt2165;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	public int anInt2181;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)V")
	public void method1754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2163;
		@Pc(9) int local9 = arg1 - this.anInt2177;
		this.anIntArrayArray18[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IBI)V")
	public void method1755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2177;
		@Pc(13) int local13 = arg1 - this.anInt2163;
		this.anIntArrayArray18[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
	public void method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2163;
		@Pc(9) int local9 = arg0 - this.anInt2177;
		this.anIntArrayArray18[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZI)Z")
	public boolean method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg4 && arg3 == arg1) {
				return true;
			}
		} else if (arg4 >= arg5 && arg5 + arg6 - 1 >= arg4 && arg3 <= arg3 && arg6 + arg3 - 1 >= arg3) {
			return true;
		}
		@Pc(58) int local58 = arg3 - this.anInt2177;
		@Pc(63) int local63 = arg4 - this.anInt2163;
		@Pc(68) int local68 = arg5 - this.anInt2163;
		@Pc(73) int local73 = arg1 - this.anInt2177;
		if (arg6 == 1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					if (local63 - 1 == local68 && local58 == local73) {
						return true;
					}
					if (local63 == local68 && local73 == local58 + 1 && (this.anIntArrayArray18[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local68 && local73 == local58 - 1 && (this.anIntArrayArray18[local68][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local63 == local68 && local73 == local58 + 1) {
						return true;
					}
					if (local68 == local63 - 1 && local58 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local68 && local58 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local68 == local63 + 1 && local58 == local73) {
						return true;
					}
					if (local63 == local68 && local58 + 1 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local63 && local58 - 1 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local68 == local63 && local58 - 1 == local73) {
						return true;
					}
					if (local63 - 1 == local68 && local73 == local58 && (this.anIntArrayArray18[local68][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local68 && local73 == local58 && (this.anIntArrayArray18[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					if (local68 == local63 - 1 && local58 == local73) {
						return true;
					}
					if (local68 == local63 && local58 + 1 == local73) {
						return true;
					}
					if (local68 == local63 + 1 && local73 == local58 && (this.anIntArrayArray18[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local63 && local58 - 1 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local63 - 1 == local68 && local73 == local58 && (this.anIntArrayArray18[local68][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local63 && local73 == local58 + 1) {
						return true;
					}
					if (local63 + 1 == local68 && local58 == local73) {
						return true;
					}
					if (local63 == local68 && local73 == local58 - 1 && (this.anIntArrayArray18[local68][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local63 - 1 == local68 && local58 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local63 && local58 + 1 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 + 1 == local68 && local73 == local58) {
						return true;
					}
					if (local68 == local63 && local73 == local58 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local68 == local63 - 1 && local73 == local58) {
						return true;
					}
					if (local68 == local63 && local58 + 1 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 + 1 == local68 && local58 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local63 && local58 - 1 == local73) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local63 == local68 && local73 == local58 + 1 && (this.anIntArrayArray18[local68][local73] & 0x20) == 0) {
					return true;
				}
				if (local63 == local68 && local58 - 1 == local73 && (this.anIntArrayArray18[local68][local73] & 0x2) == 0) {
					return true;
				}
				if (local68 == local63 - 1 && local73 == local58 && (this.anIntArrayArray18[local68][local73] & 0x8) == 0) {
					return true;
				}
				if (local63 + 1 == local68 && local73 == local58 && (this.anIntArrayArray18[local68][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = arg6 + local68 - 1;
			@Pc(90) int local90 = arg6 + local73 - 1;
			if (arg0 == 0) {
				if (arg2 == 0) {
					if (local63 - arg6 == local68 && local58 >= local73 && local58 <= local90) {
						return true;
					}
					if (local68 <= local63 && local84 >= local63 && local58 + 1 == local73 && (this.anIntArrayArray18[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 >= local68 && local63 <= local84 && local58 - arg6 == local73 && (this.anIntArrayArray18[local63][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local68 <= local63 && local84 >= local63 && local58 + 1 == local73) {
						return true;
					}
					if (local68 == local63 - arg6 && local58 >= local73 && local58 <= local90 && (this.anIntArrayArray18[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local68 && local58 >= local73 && local58 <= local90 && (this.anIntArrayArray18[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local68 == local63 + 1 && local58 >= local73 && local90 >= local58) {
						return true;
					}
					if (local63 >= local68 && local63 <= local84 && local58 + 1 == local73 && (this.anIntArrayArray18[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local63 && local84 >= local63 && local73 == local58 - arg6 && (this.anIntArrayArray18[local63][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local68 <= local63 && local63 <= local84 && local58 - arg6 == local73) {
						return true;
					}
					if (local68 == local63 - arg6 && local73 <= local58 && local58 <= local90 && (this.anIntArrayArray18[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local63 + 1 && local58 >= local73 && local90 >= local58 && (this.anIntArrayArray18[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					if (local68 == local63 - arg6 && local58 >= local73 && local90 >= local58) {
						return true;
					}
					if (local63 >= local68 && local84 >= local63 && local58 + 1 == local73) {
						return true;
					}
					if (local63 + 1 == local68 && local73 <= local58 && local90 >= local58 && (this.anIntArrayArray18[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local63 && local84 >= local63 && local73 == local58 - arg6 && (this.anIntArrayArray18[local63][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local63 - arg6 == local68 && local73 <= local58 && local58 <= local90 && (this.anIntArrayArray18[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 >= local68 && local84 >= local63 && local58 + 1 == local73) {
						return true;
					}
					if (local63 + 1 == local68 && local58 >= local73 && local58 <= local90) {
						return true;
					}
					if (local68 <= local63 && local63 <= local84 && local58 - arg6 == local73 && (this.anIntArrayArray18[local63][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local68 == local63 - arg6 && local58 >= local73 && local90 >= local58 && (this.anIntArrayArray18[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 >= local68 && local63 <= local84 && local58 + 1 == local73 && (this.anIntArrayArray18[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local63 + 1 && local58 >= local73 && local58 <= local90) {
						return true;
					}
					if (local63 >= local68 && local84 >= local63 && local58 - arg6 == local73) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local63 - arg6 == local68 && local73 <= local58 && local58 <= local90) {
						return true;
					}
					if (local63 >= local68 && local84 >= local63 && local73 == local58 + 1 && (this.anIntArrayArray18[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local63 + 1 && local73 <= local58 && local58 <= local90 && (this.anIntArrayArray18[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local63 && local63 <= local84 && local73 == local58 - arg6) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local63 >= local68 && local63 <= local84 && local73 == local58 + 1 && (this.anIntArrayArray18[local63][local73] & 0x2C0120) == 0) {
					return true;
				}
				if (local68 <= local63 && local84 >= local63 && local58 - arg6 == local73 && (this.anIntArrayArray18[local63][local90] & 0x2C0102) == 0) {
					return true;
				}
				if (local63 - arg6 == local68 && local73 <= local58 && local58 <= local90 && (this.anIntArrayArray18[local84][local58] & 0x2C0108) == 0) {
					return true;
				}
				if (local63 + 1 == local68 && local58 >= local73 && local58 <= local90 && (this.anIntArrayArray18[local68][local58] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
	private void method1759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray18[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZIIIZ)V")
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt2163;
		@Pc(13) int local13 = arg0 - this.anInt2177;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1769(local13, local4, 128);
				this.method1769(local13, local4 - 1, 8);
			}
			if (arg3 == 1) {
				this.method1769(local13, local4, 2);
				this.method1769(local13 + 1, local4, 32);
			}
			if (arg3 == 2) {
				this.method1769(local13, local4, 8);
				this.method1769(local13, local4 + 1, 128);
			}
			if (arg3 == 3) {
				this.method1769(local13, local4, 32);
				this.method1769(local13 - 1, local4, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1769(local13, local4, 1);
				this.method1769(local13 + 1, local4 - 1, 16);
			}
			if (arg3 == 1) {
				this.method1769(local13, local4, 4);
				this.method1769(local13 + 1, local4 + 1, 64);
			}
			if (arg3 == 2) {
				this.method1769(local13, local4, 16);
				this.method1769(local13 - 1, local4 - -1, 1);
			}
			if (arg3 == 3) {
				this.method1769(local13, local4, 64);
				this.method1769(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method1769(local13, local4, 130);
				this.method1769(local13, local4 - 1, 8);
				this.method1769(local13 + 1, local4, 32);
			}
			if (arg3 == 1) {
				this.method1769(local13, local4, 10);
				this.method1769(local13 + 1, local4, 32);
				this.method1769(local13, local4 + 1, 128);
			}
			if (arg3 == 2) {
				this.method1769(local13, local4, 40);
				this.method1769(local13, local4 + 1, 128);
				this.method1769(local13 - 1, local4, 2);
			}
			if (arg3 == 3) {
				this.method1769(local13, local4, 160);
				this.method1769(local13 - 1, local4, 2);
				this.method1769(local13, local4 - 1, 8);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method1769(local13, local4, 65536);
					this.method1769(local13, local4 - 1, 4096);
				}
				if (arg3 == 1) {
					this.method1769(local13, local4, 1024);
					this.method1769(local13 + 1, local4, 16384);
				}
				if (arg3 == 2) {
					this.method1769(local13, local4, 4096);
					this.method1769(local13, local4 + 1, 65536);
				}
				if (arg3 == 3) {
					this.method1769(local13, local4, 16384);
					this.method1769(local13 - 1, local4, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method1769(local13, local4, 512);
					this.method1769(local13 + 1, local4 + -1, 8192);
				}
				if (arg3 == 1) {
					this.method1769(local13, local4, 2048);
					this.method1769(local13 + 1, local4 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method1769(local13, local4, 8192);
					this.method1769(local13 - 1, local4 + 1, 512);
				}
				if (arg3 == 3) {
					this.method1769(local13, local4, 32768);
					this.method1769(local13 - 1, local4 - 1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method1769(local13, local4, 66560);
					this.method1769(local13, local4 - 1, 4096);
					this.method1769(local13 + 1, local4, 16384);
				}
				if (arg3 == 1) {
					this.method1769(local13, local4, 5120);
					this.method1769(local13 + 1, local4, 16384);
					this.method1769(local13, local4 + 1, 65536);
				}
				if (arg3 == 2) {
					this.method1769(local13, local4, 20480);
					this.method1769(local13, local4 + 1, 65536);
					this.method1769(local13 - 1, local4, 1024);
				}
				if (arg3 == 3) {
					this.method1769(local13, local4, 81920);
					this.method1769(local13 - 1, local4, 1024);
					this.method1769(local13, local4 - 1, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1769(local13, local4, 536870912);
				this.method1769(local13, local4 - 1, 33554432);
			}
			if (arg3 == 1) {
				this.method1769(local13, local4, 8388608);
				this.method1769(local13 + 1, local4, 134217728);
			}
			if (arg3 == 2) {
				this.method1769(local13, local4, 33554432);
				this.method1769(local13, local4 + 1, 536870912);
			}
			if (arg3 == 3) {
				this.method1769(local13, local4, 134217728);
				this.method1769(local13 - 1, local4, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1769(local13, local4, 4194304);
				this.method1769(local13 + 1, local4 - 1, 67108864);
			}
			if (arg3 == 1) {
				this.method1769(local13, local4, 16777216);
				this.method1769(local13 + 1, local4 - -1, 268435456);
			}
			if (arg3 == 2) {
				this.method1769(local13, local4, 67108864);
				this.method1769(local13 - 1, local4 + 1, 4194304);
			}
			if (arg3 == 3) {
				this.method1769(local13, local4, 268435456);
				this.method1769(local13 - 1, local4 - 1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1769(local13, local4, 545259520);
			this.method1769(local13, local4 - 1, 33554432);
			this.method1769(local13 + 1, local4, 134217728);
		}
		if (arg3 == 1) {
			this.method1769(local13, local4, 41943040);
			this.method1769(local13 + 1, local4, 134217728);
			this.method1769(local13, local4 + 1, 536870912);
		}
		if (arg3 == 2) {
			this.method1769(local13, local4, 167772160);
			this.method1769(local13, local4 + 1, 536870912);
			this.method1769(local13 - 1, local4, 8388608);
		}
		if (arg3 == 3) {
			this.method1769(local13, local4, 671088640);
			this.method1769(local13 - 1, local4, 8388608);
			this.method1769(local13, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIB)V")
	public void method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2163;
		@Pc(13) int local13 = arg0 - this.anInt2177;
		this.anIntArrayArray18[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIZIZII)V")
	public void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = 256;
		if (arg2) {
			local13 = 131328;
		}
		@Pc(24) int local24 = arg1 - this.anInt2177;
		@Pc(36) int local36;
		if (arg5 == 1 || arg5 == 3) {
			local36 = arg6;
			arg6 = arg0;
			arg0 = local36;
		}
		if (arg4) {
			local13 |= 0x40000000;
		}
		@Pc(51) int local51 = arg3 - this.anInt2163;
		for (local36 = local51; local36 < local51 + arg6; local36++) {
			if (local36 >= 0 && local36 < this.anInt2181) {
				for (@Pc(63) int local63 = local24; local63 < local24 + arg0; local63++) {
					if (local63 >= 0 && local63 < this.anInt2165) {
						this.method1769(local63, local36, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIZIIII)V")
	public void method1763(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg5 - this.anInt2177;
		@Pc(13) int local13 = arg1 - this.anInt2163;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1759(local8, local13, 128);
				this.method1759(local8, local13 - 1, 8);
			}
			if (arg4 == 1) {
				this.method1759(local8, local13, 2);
				this.method1759(local8 + 1, local13, 32);
			}
			if (arg4 == 2) {
				this.method1759(local8, local13, 8);
				this.method1759(local8, local13 + 1, 128);
			}
			if (arg4 == 3) {
				this.method1759(local8, local13, 32);
				this.method1759(local8 - 1, local13, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1759(local8, local13, 1);
				this.method1759(local8 + 1, local13 + -1, 16);
			}
			if (arg4 == 1) {
				this.method1759(local8, local13, 4);
				this.method1759(local8 + 1, local13 + 1, 64);
			}
			if (arg4 == 2) {
				this.method1759(local8, local13, 16);
				this.method1759(local8 - 1, local13 + 1, 1);
			}
			if (arg4 == 3) {
				this.method1759(local8, local13, 64);
				this.method1759(local8 - 1, local13 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method1759(local8, local13, 130);
				this.method1759(local8, local13 - 1, 8);
				this.method1759(local8 + 1, local13, 32);
			}
			if (arg4 == 1) {
				this.method1759(local8, local13, 10);
				this.method1759(local8 + 1, local13, 32);
				this.method1759(local8, local13 + 1, 128);
			}
			if (arg4 == 2) {
				this.method1759(local8, local13, 40);
				this.method1759(local8, local13 + 1, 128);
				this.method1759(local8 - 1, local13, 2);
			}
			if (arg4 == 3) {
				this.method1759(local8, local13, 160);
				this.method1759(local8 - 1, local13, 2);
				this.method1759(local8, local13 - 1, 8);
			}
		}
		if (arg2) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method1759(local8, local13, 65536);
					this.method1759(local8, local13 - 1, 4096);
				}
				if (arg4 == 1) {
					this.method1759(local8, local13, 1024);
					this.method1759(local8 + 1, local13, 16384);
				}
				if (arg4 == 2) {
					this.method1759(local8, local13, 4096);
					this.method1759(local8, local13 + 1, 65536);
				}
				if (arg4 == 3) {
					this.method1759(local8, local13, 16384);
					this.method1759(local8 - 1, local13, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method1759(local8, local13, 512);
					this.method1759(local8 + 1, local13 + -1, 8192);
				}
				if (arg4 == 1) {
					this.method1759(local8, local13, 2048);
					this.method1759(local8 + 1, local13 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method1759(local8, local13, 8192);
					this.method1759(local8 - 1, local13 + 1, 512);
				}
				if (arg4 == 3) {
					this.method1759(local8, local13, 32768);
					this.method1759(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method1759(local8, local13, 66560);
					this.method1759(local8, local13 - 1, 4096);
					this.method1759(local8 + 1, local13, 16384);
				}
				if (arg4 == 1) {
					this.method1759(local8, local13, 5120);
					this.method1759(local8 + 1, local13, 16384);
					this.method1759(local8, local13 + 1, 65536);
				}
				if (arg4 == 2) {
					this.method1759(local8, local13, 20480);
					this.method1759(local8, local13 + 1, 65536);
					this.method1759(local8 - 1, local13, 1024);
				}
				if (arg4 == 3) {
					this.method1759(local8, local13, 81920);
					this.method1759(local8 - 1, local13, 1024);
					this.method1759(local8, local13 - 1, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1759(local8, local13, 536870912);
				this.method1759(local8, local13 - 1, 33554432);
			}
			if (arg4 == 1) {
				this.method1759(local8, local13, 8388608);
				this.method1759(local8 + 1, local13, 134217728);
			}
			if (arg4 == 2) {
				this.method1759(local8, local13, 33554432);
				this.method1759(local8, local13 + 1, 536870912);
			}
			if (arg4 == 3) {
				this.method1759(local8, local13, 134217728);
				this.method1759(local8 - 1, local13, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1759(local8, local13, 4194304);
				this.method1759(local8 + 1, local13 + -1, 67108864);
			}
			if (arg4 == 1) {
				this.method1759(local8, local13, 16777216);
				this.method1759(local8 + 1, local13 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method1759(local8, local13, 67108864);
				this.method1759(local8 - 1, local13 + 1, 4194304);
			}
			if (arg4 == 3) {
				this.method1759(local8, local13, 268435456);
				this.method1759(local8 - 1, local13 - 1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1759(local8, local13, 545259520);
			this.method1759(local8, local13 - 1, 33554432);
			this.method1759(local8 + 1, local13, 134217728);
		}
		if (arg4 == 1) {
			this.method1759(local8, local13, 41943040);
			this.method1759(local8 + 1, local13, 134217728);
			this.method1759(local8, local13 + 1, 536870912);
		}
		if (arg4 == 2) {
			this.method1759(local8, local13, 167772160);
			this.method1759(local8, local13 + 1, 536870912);
			this.method1759(local8 - 1, local13, 8388608);
		}
		if (arg4 == 3) {
			this.method1759(local8, local13, 671088640);
			this.method1759(local8 - 1, local13, 8388608);
			this.method1759(local8, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBIIIIIIII)Z")
	public boolean method1764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg6 + arg1;
		@Pc(18) int local18 = arg8 + arg5;
		@Pc(22) int local22 = arg2 + arg3;
		@Pc(26) int local26 = arg0 + arg4;
		@Pc(44) int local44;
		@Pc(51) int local51;
		if (local22 == arg6 && (arg7 & 0x2) == 0) {
			local44 = arg4 >= arg5 ? arg4 : arg5;
			local51 = local26 <= local18 ? local26 : local18;
			while (local51 > local44) {
				if ((this.anIntArrayArray18[local22 - this.anInt2163 - 1][local44 - this.anInt2177] & 0x8) == 0) {
					return true;
				}
				local44++;
			}
		} else if (arg2 == local14 && (arg7 & 0x8) == 0) {
			local44 = arg4 < arg5 ? arg5 : arg4;
			local51 = local26 > local18 ? local18 : local26;
			while (local44 < local51) {
				if ((this.anIntArrayArray18[arg2 - this.anInt2163][local44 - this.anInt2177] & 0x80) == 0) {
					return true;
				}
				local44++;
			}
		} else if (local26 == arg5 && (arg7 & 0x1) == 0) {
			local44 = arg2 < arg6 ? arg6 : arg2;
			local51 = local14 < local22 ? local14 : local22;
			while (local51 > local44) {
				if ((this.anIntArrayArray18[local44 - this.anInt2163][local26 - this.anInt2177 - 1] & 0x2) == 0) {
					return true;
				}
				local44++;
			}
		} else if (arg4 == local18 && (arg7 & 0x4) == 0) {
			local44 = arg6 > arg2 ? arg6 : arg2;
			local51 = local22 > local14 ? local14 : local22;
			while (local44 < local51) {
				if ((this.anIntArrayArray18[local44 - this.anInt2163][arg4 - this.anInt2177] & 0x20) == 0) {
					return true;
				}
				local44++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg6 && arg0 == arg2) {
				return true;
			}
		} else if (arg5 >= arg6 && arg6 + arg4 - 1 >= arg5 && arg0 <= arg0 && arg4 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(58) int local58 = arg6 - this.anInt2163;
		@Pc(63) int local63 = arg2 - this.anInt2177;
		@Pc(68) int local68 = arg0 - this.anInt2177;
		@Pc(73) int local73 = arg5 - this.anInt2163;
		if (arg4 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local58 == local73 + 1 && local63 == local68 && (this.anIntArrayArray18[local58][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local73 && local63 == local68 - 1 && (this.anIntArrayArray18[local58][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 - 1 == local58 && local63 == local68 && (this.anIntArrayArray18[local58][local63] & 0x8) == 0) {
						return true;
					}
					if (local73 == local58 && local68 - 1 == local63 && (this.anIntArrayArray18[local58][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 - 1 == local58 && local68 == local63 && (this.anIntArrayArray18[local58][local63] & 0x8) == 0) {
						return true;
					}
					if (local73 == local58 && local63 == local68 + 1 && (this.anIntArrayArray18[local58][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local58 == local73 + 1 && local68 == local63 && (this.anIntArrayArray18[local58][local63] & 0x80) == 0) {
						return true;
					}
					if (local73 == local58 && local68 + 1 == local63 && (this.anIntArrayArray18[local58][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local58 == local73 && local68 + 1 == local63 && (this.anIntArrayArray18[local58][local63] & 0x20) == 0) {
					return true;
				}
				if (local58 == local73 && local68 - 1 == local63 && (this.anIntArrayArray18[local58][local63] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local58 && local63 == local68 && (this.anIntArrayArray18[local58][local63] & 0x8) == 0) {
					return true;
				}
				if (local58 == local73 + 1 && local68 == local63 && (this.anIntArrayArray18[local58][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = local58 + arg4 - 1;
			@Pc(88) int local88 = arg4 + local63 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local58 == local73 + 1 && local63 <= local68 && local68 <= local88 && (this.anIntArrayArray18[local58][local68] & 0x80) == 0) {
						return true;
					}
					if (local58 <= local73 && local73 <= local82 && local68 - arg4 == local63 && (this.anIntArrayArray18[local73][local88] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 - arg4 == local58 && local68 >= local63 && local88 >= local68 && (this.anIntArrayArray18[local82][local68] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local73 && local73 <= local82 && local63 == local68 - arg4 && (this.anIntArrayArray18[local73][local88] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local58 == local73 - arg4 && local68 >= local63 && local68 <= local88 && (this.anIntArrayArray18[local82][local68] & 0x8) == 0) {
						return true;
					}
					if (local73 >= local58 && local82 >= local73 && local68 + 1 == local63 && (this.anIntArrayArray18[local73][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local58 == local73 + 1 && local68 >= local63 && local88 >= local68 && (this.anIntArrayArray18[local58][local68] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local58 && local82 >= local73 && local63 == local68 + 1 && (this.anIntArrayArray18[local73][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local73 >= local58 && local82 >= local73 && local68 + 1 == local63 && (this.anIntArrayArray18[local73][local63] & 0x20) == 0) {
					return true;
				}
				if (local73 >= local58 && local73 <= local82 && local63 == local68 - arg4 && (this.anIntArrayArray18[local73][local88] & 0x2) == 0) {
					return true;
				}
				if (local58 == local73 - arg4 && local68 >= local63 && local88 >= local68 && (this.anIntArrayArray18[local82][local68] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local58 && local68 >= local63 && local88 >= local68 && (this.anIntArrayArray18[local58][local68] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZIIIII)V")
	public void method1767(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt2163;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg4 - this.anInt2177;
		for (@Pc(31) int local31 = local18; local31 < local18 + arg2; local31++) {
			if (local31 >= 0 && this.anInt2181 > local31) {
				for (@Pc(41) int local41 = local29; local41 < arg5 + local29; local41++) {
					if (local41 >= 0 && local41 < this.anInt2165) {
						this.method1759(local41, local31, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIBIIII)Z")
	public boolean method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static180.method4117(arg0, arg1, arg6, arg4, arg4, arg3, arg5, arg7) ? true : this.method1764(arg1, arg4, arg5, arg0, arg7, arg6, arg3, arg2, arg4);
		}
		@Pc(38) int local38 = arg5 + arg0 - 1;
		@Pc(44) int local44 = arg1 + arg7 - 1;
		if (arg5 <= arg3 && arg3 <= local38 && arg7 <= arg6 && arg6 <= local44) {
			return true;
		} else if (arg3 == arg5 - 1 && arg6 >= arg7 && arg6 <= local44 && (this.anIntArrayArray18[arg3 - this.anInt2163][arg6 - this.anInt2177] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg3 && arg6 >= arg7 && arg6 <= local44 && (this.anIntArrayArray18[arg3 - this.anInt2163][arg6 - this.anInt2177] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg6 && arg3 >= arg5 && arg3 <= local38 && (this.anIntArrayArray18[arg3 - this.anInt2163][arg6 - this.anInt2177] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg6 && arg5 <= arg3 && local38 >= arg3 && (this.anIntArrayArray18[arg3 - this.anInt2163][arg6 - this.anInt2177] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIII)V")
	private void method1769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray18[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public void method1770() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt2181; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2165; local16++) {
				if (local12 == 0 || local16 == 0 || local12 >= this.anInt2181 - 5 || this.anInt2165 - 5 <= local16) {
					this.anIntArrayArray18[local12][local16] = -1;
				} else {
					this.anIntArrayArray18[local12][local16] = 2097152;
				}
			}
		}
	}
}

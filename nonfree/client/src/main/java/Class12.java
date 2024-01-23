import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt318 = arg0;
		this.anInt336 = 0;
		this.anInt327 = 0;
		this.anInt323 = arg1;
		this.anIntArrayArray1 = new int[this.anInt318][this.anInt323];
		this.method270();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIIII)Z")
	public boolean method266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == arg0 && arg2 == arg1) {
			return true;
		}
		@Pc(18) int local18 = arg3 - this.anInt327;
		@Pc(23) int local23 = arg2 - this.anInt336;
		if (local18 < 0 || local18 >= this.anInt318 || local23 < 0 || this.anInt323 <= local23) {
			return false;
		}
		@Pc(44) int local44 = arg0 - this.anInt327;
		@Pc(49) int local49 = arg1 - this.anInt336;
		@Pc(61) int local61;
		if (local44 >= local18) {
			local61 = local44 - local18;
		} else {
			local61 = local18 - local44;
		}
		@Pc(85) int local85;
		if (local49 >= local23) {
			local85 = local49 - local23;
		} else {
			local85 = local23 - local49;
		}
		@Pc(107) int local107;
		@Pc(101) int local101;
		if (local61 <= local85) {
			local101 = 32768;
			local107 = local61 * 65536 / local85;
			while (local23 != local49) {
				if (local49 < local23) {
					if ((this.anIntArrayArray1[local44][local49] & 0x2C0102) != 0) {
						return false;
					}
					local49++;
				} else if (local49 > local23) {
					if ((this.anIntArrayArray1[local44][local49] & 0x2C0120) != 0) {
						return false;
					}
					local49--;
				}
				local101 += local107;
				if (local101 >= 65536) {
					local101 -= 65536;
					if (local18 > local44) {
						if ((this.anIntArrayArray1[local44][local49] & 0x2C0108) != 0) {
							return false;
						}
						local44++;
					} else if (local44 > local18) {
						if ((this.anIntArrayArray1[local44][local49] & 0x2C0180) != 0) {
							return false;
						}
						local44--;
					}
				}
			}
		} else {
			local101 = 32768;
			local107 = local85 * 65536 / local61;
			while (local44 != local18) {
				if (local18 > local44) {
					if ((this.anIntArrayArray1[local44][local49] & 0x2C0108) != 0) {
						return false;
					}
					local44++;
				} else if (local44 > local18) {
					if ((this.anIntArrayArray1[local44][local49] & 0x2C0180) != 0) {
						return false;
					}
					local44--;
				}
				local101 += local107;
				if (local101 >= 65536) {
					local101 -= 65536;
					if (local23 > local49) {
						if ((this.anIntArrayArray1[local44][local49] & 0x2C0102) != 0) {
							return false;
						}
						local49++;
					} else if (local49 > local23) {
						if ((this.anIntArrayArray1[local44][local49] & 0x2C0120) != 0) {
							return false;
						}
						local49--;
					}
				}
			}
		}
		return (this.anIntArrayArray1[local18][local23] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	public void method267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt327;
		@Pc(13) int local13 = arg0 - this.anInt336;
		this.anIntArrayArray1[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method269(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = arg4 - this.anInt327;
		@Pc(15) int local15 = arg1 - this.anInt336;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method273(128, local15, local10);
				this.method273(8, local15, local10 - 1);
			}
			if (arg2 == 1) {
				this.method273(2, local15, local10);
				this.method273(32, local15 + 1, local10);
			}
			if (arg2 == 2) {
				this.method273(8, local15, local10);
				this.method273(128, local15, local10 + 1);
			}
			if (arg2 == 3) {
				this.method273(32, local15, local10);
				this.method273(2, local15 - 1, local10);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method273(1, local15, local10);
				this.method273(16, local15 + 1, local10 + -1);
			}
			if (arg2 == 1) {
				this.method273(4, local15, local10);
				this.method273(64, local15 + 1, local10 + 1);
			}
			if (arg2 == 2) {
				this.method273(16, local15, local10);
				this.method273(1, local15 - 1, local10 + 1);
			}
			if (arg2 == 3) {
				this.method273(64, local15, local10);
				this.method273(4, local15 - 1, local10 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method273(130, local15, local10);
				this.method273(8, local15, local10 - 1);
				this.method273(32, local15 + 1, local10);
			}
			if (arg2 == 1) {
				this.method273(10, local15, local10);
				this.method273(32, local15 + 1, local10);
				this.method273(128, local15, local10 + 1);
			}
			if (arg2 == 2) {
				this.method273(40, local15, local10);
				this.method273(128, local15, local10 + 1);
				this.method273(2, local15 - 1, local10);
			}
			if (arg2 == 3) {
				this.method273(160, local15, local10);
				this.method273(2, local15 - 1, local10);
				this.method273(8, local15, local10 - 1);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method273(65536, local15, local10);
					this.method273(4096, local15, local10 - 1);
				}
				if (arg2 == 1) {
					this.method273(1024, local15, local10);
					this.method273(16384, local15 + 1, local10);
				}
				if (arg2 == 2) {
					this.method273(4096, local15, local10);
					this.method273(65536, local15, local10 + 1);
				}
				if (arg2 == 3) {
					this.method273(16384, local15, local10);
					this.method273(1024, local15 - 1, local10);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method273(512, local15, local10);
					this.method273(8192, local15 + 1, local10 + -1);
				}
				if (arg2 == 1) {
					this.method273(2048, local15, local10);
					this.method273(32768, local15 + 1, local10 + 1);
				}
				if (arg2 == 2) {
					this.method273(8192, local15, local10);
					this.method273(512, local15 - 1, local10 + 1);
				}
				if (arg2 == 3) {
					this.method273(32768, local15, local10);
					this.method273(2048, local15 - 1, local10 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method273(66560, local15, local10);
					this.method273(4096, local15, local10 - 1);
					this.method273(16384, local15 + 1, local10);
				}
				if (arg2 == 1) {
					this.method273(5120, local15, local10);
					this.method273(16384, local15 + 1, local10);
					this.method273(65536, local15, local10 + 1);
				}
				if (arg2 == 2) {
					this.method273(20480, local15, local10);
					this.method273(65536, local15, local10 + 1);
					this.method273(1024, local15 - 1, local10);
				}
				if (arg2 == 3) {
					this.method273(81920, local15, local10);
					this.method273(1024, local15 - 1, local10);
					this.method273(4096, local15, local10 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method273(536870912, local15, local10);
				this.method273(33554432, local15, local10 - 1);
			}
			if (arg2 == 1) {
				this.method273(8388608, local15, local10);
				this.method273(134217728, local15 + 1, local10);
			}
			if (arg2 == 2) {
				this.method273(33554432, local15, local10);
				this.method273(536870912, local15, local10 + 1);
			}
			if (arg2 == 3) {
				this.method273(134217728, local15, local10);
				this.method273(8388608, local15 - 1, local10);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method273(4194304, local15, local10);
				this.method273(67108864, local15 + 1, local10 + -1);
			}
			if (arg2 == 1) {
				this.method273(16777216, local15, local10);
				this.method273(268435456, local15 + 1, local10 + 1);
			}
			if (arg2 == 2) {
				this.method273(67108864, local15, local10);
				this.method273(4194304, local15 - 1, local10 + 1);
			}
			if (arg2 == 3) {
				this.method273(268435456, local15, local10);
				this.method273(16777216, local15 - 1, local10 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method273(545259520, local15, local10);
			this.method273(33554432, local15, local10 - 1);
			this.method273(134217728, local15 + 1, local10);
		}
		if (arg2 == 1) {
			this.method273(41943040, local15, local10);
			this.method273(134217728, local15 + 1, local10);
			this.method273(536870912, local15, local10 + 1);
		}
		if (arg2 == 2) {
			this.method273(167772160, local15, local10);
			this.method273(536870912, local15, local10 + 1);
			this.method273(8388608, local15 - 1, local10);
		}
		if (arg2 == 3) {
			this.method273(671088640, local15, local10);
			this.method273(8388608, local15 - 1, local10);
			this.method273(33554432, local15, local10 - 1);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public void method270() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt318; local7++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt323; local17++) {
				if (local7 == 0 || local17 == 0 || this.anInt318 - 5 <= local7 || local17 >= this.anInt323 - 5) {
					this.anIntArrayArray1[local7][local17] = 16777215;
				} else {
					this.anIntArrayArray1[local7][local17] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V")
	public void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt336;
		@Pc(19) int local19 = arg0 - this.anInt327;
		this.anIntArrayArray1[local19][local14] |= 0x200000;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V")
	private void method273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIZIZ)V")
	public void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg3 - this.anInt327;
		@Pc(11) int local11 = arg2 - this.anInt336;
		@Pc(24) int local24 = 256;
		if (arg5) {
			local24 = 131328;
		}
		if (arg4) {
			local24 |= 0x40000000;
		}
		for (@Pc(40) int local40 = local6; local40 < local6 + arg1; local40++) {
			if (local40 >= 0 && local40 < this.anInt318) {
				for (@Pc(58) int local58 = local11; local58 < local11 + arg0; local58++) {
					if (local58 >= 0 && this.anInt323 > local58) {
						this.method275(local40, local24, local58);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIII)V")
	private void method275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V")
	public void method277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt327;
		@Pc(9) int local9 = arg0 - this.anInt336;
		this.anIntArrayArray1[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIIZIIII)V")
	public void method278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) int local6 = arg5 - this.anInt336;
		@Pc(11) int local11 = arg4 - this.anInt327;
		@Pc(27) int local27;
		if (arg6 == 1 || arg6 == 3) {
			local27 = arg2;
			arg2 = arg1;
			arg1 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg0) {
			local33 = 131328;
		}
		if (arg3) {
			local33 |= 0x40000000;
		}
		for (local27 = local11; local27 < local11 + arg2; local27++) {
			if (local27 >= 0 && this.anInt318 > local27) {
				for (@Pc(65) int local65 = local6; local65 < local6 + arg1; local65++) {
					if (local65 >= 0 && local65 < this.anInt323) {
						this.method273(local33, local65, local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIZIZI)V")
	public void method279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt336;
		@Pc(9) int local9 = arg0 - this.anInt327;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method275(local9, 128, local4);
				this.method275(local9 - 1, 8, local4);
			}
			if (arg5 == 1) {
				this.method275(local9, 2, local4);
				this.method275(local9, 32, local4 + 1);
			}
			if (arg5 == 2) {
				this.method275(local9, 8, local4);
				this.method275(local9 + 1, 128, local4);
			}
			if (arg5 == 3) {
				this.method275(local9, 32, local4);
				this.method275(local9, 2, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method275(local9, 1, local4);
				this.method275(local9 - 1, 16, local4 + 1);
			}
			if (arg5 == 1) {
				this.method275(local9, 4, local4);
				this.method275(local9 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method275(local9, 16, local4);
				this.method275(local9 + 1, 1, local4 - 1);
			}
			if (arg5 == 3) {
				this.method275(local9, 64, local4);
				this.method275(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method275(local9, 130, local4);
				this.method275(local9 - 1, 8, local4);
				this.method275(local9, 32, local4 + 1);
			}
			if (arg5 == 1) {
				this.method275(local9, 10, local4);
				this.method275(local9, 32, local4 + 1);
				this.method275(local9 + 1, 128, local4);
			}
			if (arg5 == 2) {
				this.method275(local9, 40, local4);
				this.method275(local9 + 1, 128, local4);
				this.method275(local9, 2, local4 - 1);
			}
			if (arg5 == 3) {
				this.method275(local9, 160, local4);
				this.method275(local9, 2, local4 - 1);
				this.method275(local9 - 1, 8, local4);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method275(local9, 65536, local4);
					this.method275(local9 - 1, 4096, local4);
				}
				if (arg5 == 1) {
					this.method275(local9, 1024, local4);
					this.method275(local9, 16384, local4 + 1);
				}
				if (arg5 == 2) {
					this.method275(local9, 4096, local4);
					this.method275(local9 + 1, 65536, local4);
				}
				if (arg5 == 3) {
					this.method275(local9, 16384, local4);
					this.method275(local9, 1024, local4 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method275(local9, 512, local4);
					this.method275(local9 - 1, 8192, local4 + 1);
				}
				if (arg5 == 1) {
					this.method275(local9, 2048, local4);
					this.method275(local9 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method275(local9, 8192, local4);
					this.method275(local9 + 1, 512, local4 - 1);
				}
				if (arg5 == 3) {
					this.method275(local9, 32768, local4);
					this.method275(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method275(local9, 66560, local4);
					this.method275(local9 - 1, 4096, local4);
					this.method275(local9, 16384, local4 + 1);
				}
				if (arg5 == 1) {
					this.method275(local9, 5120, local4);
					this.method275(local9, 16384, local4 + 1);
					this.method275(local9 + 1, 65536, local4);
				}
				if (arg5 == 2) {
					this.method275(local9, 20480, local4);
					this.method275(local9 + 1, 65536, local4);
					this.method275(local9, 1024, local4 - 1);
				}
				if (arg5 == 3) {
					this.method275(local9, 81920, local4);
					this.method275(local9, 1024, local4 - 1);
					this.method275(local9 - 1, 4096, local4);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method275(local9, 536870912, local4);
				this.method275(local9 - 1, 33554432, local4);
			}
			if (arg5 == 1) {
				this.method275(local9, 8388608, local4);
				this.method275(local9, 134217728, local4 + 1);
			}
			if (arg5 == 2) {
				this.method275(local9, 33554432, local4);
				this.method275(local9 + 1, 536870912, local4);
			}
			if (arg5 == 3) {
				this.method275(local9, 134217728, local4);
				this.method275(local9, 8388608, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method275(local9, 4194304, local4);
				this.method275(local9 - 1, 67108864, local4 + 1);
			}
			if (arg5 == 1) {
				this.method275(local9, 16777216, local4);
				this.method275(local9 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method275(local9, 67108864, local4);
				this.method275(local9 + 1, 4194304, local4 - 1);
			}
			if (arg5 == 3) {
				this.method275(local9, 268435456, local4);
				this.method275(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method275(local9, 545259520, local4);
			this.method275(local9 - 1, 33554432, local4);
			this.method275(local9, 134217728, local4 + 1);
		}
		if (arg5 == 1) {
			this.method275(local9, 41943040, local4);
			this.method275(local9, 134217728, local4 + 1);
			this.method275(local9 + 1, 536870912, local4);
		}
		if (arg5 == 2) {
			this.method275(local9, 167772160, local4);
			this.method275(local9 + 1, 536870912, local4);
			this.method275(local9, 8388608, local4 - 1);
		}
		if (arg5 == 3) {
			this.method275(local9, 671088640, local4);
			this.method275(local9, 8388608, local4 - 1);
			this.method275(local9 - 1, 33554432, local4);
		}
	}
}

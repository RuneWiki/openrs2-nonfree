import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class92 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[J")
	public static long[] aLongArray6 = new long[256];

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	private int anInt3183;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	private int anInt3186;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	private int anInt3191;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(14) long local14 = (long) local6;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray6[local6] = local14;
		}
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3183 = arg1;
		this.anInt3186 = arg0;
		this.anIntArrayArray15 = new int[this.anInt3186][this.anInt3183];
		this.anInt3179 = 0;
		this.anInt3191 = 0;
		this.method2576();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIIZI)V")
	public void method2569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg3 - this.anInt3191;
		@Pc(19) int local19 = arg2 - this.anInt3179;
		@Pc(21) int local21 = 256;
		if (arg4) {
			local21 = 131328;
		}
		if (arg1) {
			local21 |= 0x40000000;
		}
		for (@Pc(35) int local35 = local19; local35 < local19 + arg0; local35++) {
			if (local35 >= 0 && this.anInt3186 > local35) {
				for (@Pc(53) int local53 = local14; local53 < arg5 + local14; local53++) {
					if (local53 >= 0 && this.anInt3183 > local53) {
						this.method2577(local53, local21, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
	private void method2571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray15[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	public void method2572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt3179;
		@Pc(17) int local17 = arg0 - this.anInt3191;
		this.anIntArrayArray15[local12][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZIZ)V")
	public void method2573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) int local6 = arg0 - this.anInt3179;
		@Pc(22) int local22;
		if (arg2 == 1 || arg2 == 3) {
			local22 = arg5;
			arg5 = arg1;
			arg1 = local22;
		}
		@Pc(28) int local28 = 256;
		@Pc(33) int local33 = arg3 - this.anInt3191;
		if (arg4) {
			local28 = 131328;
		}
		if (arg6) {
			local28 |= 0x40000000;
		}
		for (local22 = local6; local22 < local6 + arg5; local22++) {
			if (local22 >= 0 && local22 < this.anInt3186) {
				for (@Pc(64) int local64 = local33; local64 < arg1 + local33; local64++) {
					if (local64 >= 0 && local64 < this.anInt3183) {
						this.method2571(local64, local22, local28);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)V")
	public void method2574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3179;
		@Pc(13) int local13 = arg0 - this.anInt3191;
		this.anIntArrayArray15[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZII)Z")
	public boolean method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == arg2 && arg1 == arg0) {
			return true;
		}
		@Pc(23) int local23 = arg3 - this.anInt3179;
		@Pc(33) int local33 = arg1 - this.anInt3191;
		if (local23 < 0 || this.anInt3186 <= local23 || local33 < 0 || this.anInt3183 <= local33) {
			return false;
		}
		@Pc(53) int local53 = arg2 - this.anInt3179;
		@Pc(58) int local58 = arg0 - this.anInt3191;
		@Pc(66) int local66;
		if (local23 <= local53) {
			local66 = local53 - local23;
		} else {
			local66 = local23 - local53;
		}
		@Pc(81) int local81;
		if (local33 <= local58) {
			local81 = local58 - local33;
		} else {
			local81 = local33 - local58;
		}
		@Pc(100) int local100;
		@Pc(102) int local102;
		if (local81 < local66) {
			local100 = local81 * 65536 / local66;
			local102 = 32768;
			while (local23 != local53) {
				if (local23 > local53) {
					if ((this.anIntArrayArray15[local53][local58] & 0x2C0108) != 0) {
						return false;
					}
					local53++;
				} else if (local23 < local53) {
					if ((this.anIntArrayArray15[local53][local58] & 0x2C0180) != 0) {
						return false;
					}
					local53--;
				}
				local102 += local100;
				if (local102 >= 65536) {
					local102 -= 65536;
					if (local33 > local58) {
						if ((this.anIntArrayArray15[local53][local58] & 0x2C0102) != 0) {
							return false;
						}
						local58++;
					} else if (local33 < local58) {
						if ((this.anIntArrayArray15[local53][local58] & 0x2C0120) != 0) {
							return false;
						}
						local58--;
					}
				}
			}
		} else {
			local102 = 32768;
			local100 = local66 * 65536 / local81;
			while (local33 != local58) {
				if (local58 < local33) {
					if ((this.anIntArrayArray15[local53][local58] & 0x2C0102) != 0) {
						return false;
					}
					local58++;
				} else if (local33 < local58) {
					if ((this.anIntArrayArray15[local53][local58] & 0x2C0120) != 0) {
						return false;
					}
					local58--;
				}
				local102 += local100;
				if (local102 >= 65536) {
					local102 -= 65536;
					if (local23 > local53) {
						if ((this.anIntArrayArray15[local53][local58] & 0x2C0108) != 0) {
							return false;
						}
						local53++;
					} else if (local23 < local53) {
						if ((this.anIntArrayArray15[local53][local58] & 0x2C0180) != 0) {
							return false;
						}
						local53--;
					}
				}
			}
		}
		return (this.anIntArrayArray15[local23][local33] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method2576() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3186; local11++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt3183; local21++) {
				if (local11 == 0 || local21 == 0 || this.anInt3186 - 5 <= local11 || local21 >= this.anInt3183 - 5) {
					this.anIntArrayArray15[local11][local21] = 16777215;
				} else {
					this.anIntArrayArray15[local11][local21] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZ)V")
	private void method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V")
	public void method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3179;
		@Pc(9) int local9 = arg0 - this.anInt3191;
		this.anIntArrayArray15[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZZ)V")
	public void method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg3 - this.anInt3191;
		@Pc(13) int local13 = arg2 - this.anInt3179;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2571(local8, local13, 128);
				this.method2571(local8, local13 - 1, 8);
			}
			if (arg1 == 1) {
				this.method2571(local8, local13, 2);
				this.method2571(local8 + 1, local13, 32);
			}
			if (arg1 == 2) {
				this.method2571(local8, local13, 8);
				this.method2571(local8, local13 + 1, 128);
			}
			if (arg1 == 3) {
				this.method2571(local8, local13, 32);
				this.method2571(local8 - 1, local13, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2571(local8, local13, 1);
				this.method2571(local8 + 1, local13 + -1, 16);
			}
			if (arg1 == 1) {
				this.method2571(local8, local13, 4);
				this.method2571(local8 + 1, local13 - -1, 64);
			}
			if (arg1 == 2) {
				this.method2571(local8, local13, 16);
				this.method2571(local8 - 1, local13 + 1, 1);
			}
			if (arg1 == 3) {
				this.method2571(local8, local13, 64);
				this.method2571(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method2571(local8, local13, 130);
				this.method2571(local8, local13 - 1, 8);
				this.method2571(local8 + 1, local13, 32);
			}
			if (arg1 == 1) {
				this.method2571(local8, local13, 10);
				this.method2571(local8 + 1, local13, 32);
				this.method2571(local8, local13 + 1, 128);
			}
			if (arg1 == 2) {
				this.method2571(local8, local13, 40);
				this.method2571(local8, local13 + 1, 128);
				this.method2571(local8 - 1, local13, 2);
			}
			if (arg1 == 3) {
				this.method2571(local8, local13, 160);
				this.method2571(local8 - 1, local13, 2);
				this.method2571(local8, local13 - 1, 8);
			}
		}
		if (arg5) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method2571(local8, local13, 65536);
					this.method2571(local8, local13 - 1, 4096);
				}
				if (arg1 == 1) {
					this.method2571(local8, local13, 1024);
					this.method2571(local8 + 1, local13, 16384);
				}
				if (arg1 == 2) {
					this.method2571(local8, local13, 4096);
					this.method2571(local8, local13 + 1, 65536);
				}
				if (arg1 == 3) {
					this.method2571(local8, local13, 16384);
					this.method2571(local8 - 1, local13, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method2571(local8, local13, 512);
					this.method2571(local8 + 1, local13 + -1, 8192);
				}
				if (arg1 == 1) {
					this.method2571(local8, local13, 2048);
					this.method2571(local8 + 1, local13 + 1, 32768);
				}
				if (arg1 == 2) {
					this.method2571(local8, local13, 8192);
					this.method2571(local8 - 1, local13 + 1, 512);
				}
				if (arg1 == 3) {
					this.method2571(local8, local13, 32768);
					this.method2571(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method2571(local8, local13, 66560);
					this.method2571(local8, local13 - 1, 4096);
					this.method2571(local8 + 1, local13, 16384);
				}
				if (arg1 == 1) {
					this.method2571(local8, local13, 5120);
					this.method2571(local8 + 1, local13, 16384);
					this.method2571(local8, local13 + 1, 65536);
				}
				if (arg1 == 2) {
					this.method2571(local8, local13, 20480);
					this.method2571(local8, local13 + 1, 65536);
					this.method2571(local8 - 1, local13, 1024);
				}
				if (arg1 == 3) {
					this.method2571(local8, local13, 81920);
					this.method2571(local8 - 1, local13, 1024);
					this.method2571(local8, local13 - 1, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2571(local8, local13, 536870912);
				this.method2571(local8, local13 - 1, 33554432);
			}
			if (arg1 == 1) {
				this.method2571(local8, local13, 8388608);
				this.method2571(local8 + 1, local13, 134217728);
			}
			if (arg1 == 2) {
				this.method2571(local8, local13, 33554432);
				this.method2571(local8, local13 + 1, 536870912);
			}
			if (arg1 == 3) {
				this.method2571(local8, local13, 134217728);
				this.method2571(local8 - 1, local13, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2571(local8, local13, 4194304);
				this.method2571(local8 + 1, local13 + -1, 67108864);
			}
			if (arg1 == 1) {
				this.method2571(local8, local13, 16777216);
				this.method2571(local8 + 1, local13 + 1, 268435456);
			}
			if (arg1 == 2) {
				this.method2571(local8, local13, 67108864);
				this.method2571(local8 - 1, local13 + 1, 4194304);
			}
			if (arg1 == 3) {
				this.method2571(local8, local13, 268435456);
				this.method2571(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2571(local8, local13, 545259520);
			this.method2571(local8, local13 - 1, 33554432);
			this.method2571(local8 + 1, local13, 134217728);
		}
		if (arg1 == 1) {
			this.method2571(local8, local13, 41943040);
			this.method2571(local8 + 1, local13, 134217728);
			this.method2571(local8, local13 + 1, 536870912);
		}
		if (arg1 == 2) {
			this.method2571(local8, local13, 167772160);
			this.method2571(local8, local13 + 1, 536870912);
			this.method2571(local8 - 1, local13, 8388608);
		}
		if (arg1 == 3) {
			this.method2571(local8, local13, 671088640);
			this.method2571(local8 - 1, local13, 8388608);
			this.method2571(local8, local13 - 1, 33554432);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZIBZ)V")
	public void method2581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt3179;
		@Pc(9) int local9 = arg4 - this.anInt3191;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2577(local9, 128, local4);
				this.method2577(local9, 8, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2577(local9, 2, local4);
				this.method2577(local9 + 1, 32, local4);
			}
			if (arg1 == 2) {
				this.method2577(local9, 8, local4);
				this.method2577(local9, 128, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2577(local9, 32, local4);
				this.method2577(local9 - 1, 2, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2577(local9, 1, local4);
				this.method2577(local9 + 1, 16, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2577(local9, 4, local4);
				this.method2577(local9 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method2577(local9, 16, local4);
				this.method2577(local9 - 1, 1, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2577(local9, 64, local4);
				this.method2577(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method2577(local9, 130, local4);
				this.method2577(local9, 8, local4 - 1);
				this.method2577(local9 + 1, 32, local4);
			}
			if (arg1 == 1) {
				this.method2577(local9, 10, local4);
				this.method2577(local9 + 1, 32, local4);
				this.method2577(local9, 128, local4 + 1);
			}
			if (arg1 == 2) {
				this.method2577(local9, 40, local4);
				this.method2577(local9, 128, local4 + 1);
				this.method2577(local9 - 1, 2, local4);
			}
			if (arg1 == 3) {
				this.method2577(local9, 160, local4);
				this.method2577(local9 - 1, 2, local4);
				this.method2577(local9, 8, local4 - 1);
			}
		}
		if (arg5) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method2577(local9, 65536, local4);
					this.method2577(local9, 4096, local4 - 1);
				}
				if (arg1 == 1) {
					this.method2577(local9, 1024, local4);
					this.method2577(local9 + 1, 16384, local4);
				}
				if (arg1 == 2) {
					this.method2577(local9, 4096, local4);
					this.method2577(local9, 65536, local4 + 1);
				}
				if (arg1 == 3) {
					this.method2577(local9, 16384, local4);
					this.method2577(local9 - 1, 1024, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method2577(local9, 512, local4);
					this.method2577(local9 + 1, 8192, local4 - 1);
				}
				if (arg1 == 1) {
					this.method2577(local9, 2048, local4);
					this.method2577(local9 + 1, 32768, local4 + 1);
				}
				if (arg1 == 2) {
					this.method2577(local9, 8192, local4);
					this.method2577(local9 - 1, 512, local4 + 1);
				}
				if (arg1 == 3) {
					this.method2577(local9, 32768, local4);
					this.method2577(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method2577(local9, 66560, local4);
					this.method2577(local9, 4096, local4 - 1);
					this.method2577(local9 + 1, 16384, local4);
				}
				if (arg1 == 1) {
					this.method2577(local9, 5120, local4);
					this.method2577(local9 + 1, 16384, local4);
					this.method2577(local9, 65536, local4 + 1);
				}
				if (arg1 == 2) {
					this.method2577(local9, 20480, local4);
					this.method2577(local9, 65536, local4 + 1);
					this.method2577(local9 - 1, 1024, local4);
				}
				if (arg1 == 3) {
					this.method2577(local9, 81920, local4);
					this.method2577(local9 - 1, 1024, local4);
					this.method2577(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2577(local9, 536870912, local4);
				this.method2577(local9, 33554432, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2577(local9, 8388608, local4);
				this.method2577(local9 + 1, 134217728, local4);
			}
			if (arg1 == 2) {
				this.method2577(local9, 33554432, local4);
				this.method2577(local9, 536870912, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2577(local9, 134217728, local4);
				this.method2577(local9 - 1, 8388608, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2577(local9, 4194304, local4);
				this.method2577(local9 + 1, 67108864, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2577(local9, 16777216, local4);
				this.method2577(local9 + 1, 268435456, local4 + 1);
			}
			if (arg1 == 2) {
				this.method2577(local9, 67108864, local4);
				this.method2577(local9 - 1, 4194304, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2577(local9, 268435456, local4);
				this.method2577(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2577(local9, 545259520, local4);
			this.method2577(local9, 33554432, local4 - 1);
			this.method2577(local9 + 1, 134217728, local4);
		}
		if (arg1 == 1) {
			this.method2577(local9, 41943040, local4);
			this.method2577(local9 + 1, 134217728, local4);
			this.method2577(local9, 536870912, local4 + 1);
		}
		if (arg1 == 2) {
			this.method2577(local9, 167772160, local4);
			this.method2577(local9, 536870912, local4 + 1);
			this.method2577(local9 - 1, 8388608, local4);
		}
		if (arg1 == 3) {
			this.method2577(local9, 671088640, local4);
			this.method2577(local9 - 1, 8388608, local4);
			this.method2577(local9, 33554432, local4 - 1);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class112 {

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
	private int anInt3240;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	private int anInt3238;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	private int anInt3241;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt3231;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3240 = arg0;
		this.anInt3238 = arg1;
		this.anInt3241 = 0;
		this.anIntArrayArray14 = new int[this.anInt3240][this.anInt3238];
		this.anInt3231 = 0;
		this.method2540();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBZIIZ)V")
	public void method2538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = arg1 - this.anInt3231;
		@Pc(15) int local15 = arg3 - this.anInt3241;
		@Pc(17) int local17 = 256;
		if (arg2) {
			local17 = 131328;
		}
		if (arg5) {
			local17 |= 0x40000000;
		}
		for (@Pc(32) int local32 = local10; local32 < arg4 + local10; local32++) {
			if (local32 >= 0 && local32 < this.anInt3240) {
				for (@Pc(46) int local46 = local15; local46 < local15 + arg0; local46++) {
					if (local46 >= 0 && this.anInt3238 > local46) {
						this.method2550(local17, local46, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public void method2540() {
		for (@Pc(6) int local6 = 0; local6 < this.anInt3240; local6++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3238; local16++) {
				if (local6 == 0 || local16 == 0 || local6 >= this.anInt3240 - 5 || this.anInt3238 - 5 <= local16) {
					this.anIntArrayArray14[local6][local16] = 16777215;
				} else {
					this.anIntArrayArray14[local6][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BII)V")
	public void method2541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 - this.anInt3241;
		@Pc(14) int local14 = arg0 - this.anInt3231;
		this.anIntArrayArray14[local14][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIZIIZI)V")
	public void method2542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg1 - this.anInt3241;
		@Pc(16) int local16;
		if (arg0 == 1 || arg0 == 3) {
			local16 = arg3;
			arg3 = arg6;
			arg6 = local16;
		}
		@Pc(29) int local29 = arg4 - this.anInt3231;
		@Pc(31) int local31 = 256;
		if (arg5) {
			local31 = 131328;
		}
		if (arg2) {
			local31 |= 0x40000000;
		}
		for (local16 = local29; local16 < local29 + arg3; local16++) {
			if (local16 >= 0 && this.anInt3240 > local16) {
				for (@Pc(67) int local67 = local6; local67 < local6 + arg6; local67++) {
					if (local67 >= 0 && local67 < this.anInt3238) {
						this.method2555(local67, local31, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZZIBII)V")
	public void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg0 - this.anInt3241;
		@Pc(17) int local17 = arg4 - this.anInt3231;
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method2555(local8, 128, local17);
				this.method2555(local8, 8, local17 - 1);
			}
			if (arg5 == 1) {
				this.method2555(local8, 2, local17);
				this.method2555(local8 + 1, 32, local17);
			}
			if (arg5 == 2) {
				this.method2555(local8, 8, local17);
				this.method2555(local8, 128, local17 + 1);
			}
			if (arg5 == 3) {
				this.method2555(local8, 32, local17);
				this.method2555(local8 - 1, 2, local17);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method2555(local8, 1, local17);
				this.method2555(local8 + 1, 16, local17 - 1);
			}
			if (arg5 == 1) {
				this.method2555(local8, 4, local17);
				this.method2555(local8 + 1, 64, local17 + 1);
			}
			if (arg5 == 2) {
				this.method2555(local8, 16, local17);
				this.method2555(local8 - 1, 1, local17 + 1);
			}
			if (arg5 == 3) {
				this.method2555(local8, 64, local17);
				this.method2555(local8 - 1, 4, local17 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				this.method2555(local8, 130, local17);
				this.method2555(local8, 8, local17 - 1);
				this.method2555(local8 + 1, 32, local17);
			}
			if (arg5 == 1) {
				this.method2555(local8, 10, local17);
				this.method2555(local8 + 1, 32, local17);
				this.method2555(local8, 128, local17 + 1);
			}
			if (arg5 == 2) {
				this.method2555(local8, 40, local17);
				this.method2555(local8, 128, local17 + 1);
				this.method2555(local8 - 1, 2, local17);
			}
			if (arg5 == 3) {
				this.method2555(local8, 160, local17);
				this.method2555(local8 - 1, 2, local17);
				this.method2555(local8, 8, local17 - 1);
			}
		}
		if (arg2) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method2555(local8, 65536, local17);
					this.method2555(local8, 4096, local17 - 1);
				}
				if (arg5 == 1) {
					this.method2555(local8, 1024, local17);
					this.method2555(local8 + 1, 16384, local17);
				}
				if (arg5 == 2) {
					this.method2555(local8, 4096, local17);
					this.method2555(local8, 65536, local17 + 1);
				}
				if (arg5 == 3) {
					this.method2555(local8, 16384, local17);
					this.method2555(local8 - 1, 1024, local17);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method2555(local8, 512, local17);
					this.method2555(local8 + 1, 8192, local17 - 1);
				}
				if (arg5 == 1) {
					this.method2555(local8, 2048, local17);
					this.method2555(local8 + 1, 32768, local17 + 1);
				}
				if (arg5 == 2) {
					this.method2555(local8, 8192, local17);
					this.method2555(local8 - 1, 512, local17 + 1);
				}
				if (arg5 == 3) {
					this.method2555(local8, 32768, local17);
					this.method2555(local8 - 1, 2048, local17 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method2555(local8, 66560, local17);
					this.method2555(local8, 4096, local17 - 1);
					this.method2555(local8 + 1, 16384, local17);
				}
				if (arg5 == 1) {
					this.method2555(local8, 5120, local17);
					this.method2555(local8 + 1, 16384, local17);
					this.method2555(local8, 65536, local17 + 1);
				}
				if (arg5 == 2) {
					this.method2555(local8, 20480, local17);
					this.method2555(local8, 65536, local17 + 1);
					this.method2555(local8 - 1, 1024, local17);
				}
				if (arg5 == 3) {
					this.method2555(local8, 81920, local17);
					this.method2555(local8 - 1, 1024, local17);
					this.method2555(local8, 4096, local17 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method2555(local8, 536870912, local17);
				this.method2555(local8, 33554432, local17 - 1);
			}
			if (arg5 == 1) {
				this.method2555(local8, 8388608, local17);
				this.method2555(local8 + 1, 134217728, local17);
			}
			if (arg5 == 2) {
				this.method2555(local8, 33554432, local17);
				this.method2555(local8, 536870912, local17 + 1);
			}
			if (arg5 == 3) {
				this.method2555(local8, 134217728, local17);
				this.method2555(local8 - 1, 8388608, local17);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method2555(local8, 4194304, local17);
				this.method2555(local8 + 1, 67108864, local17 - 1);
			}
			if (arg5 == 1) {
				this.method2555(local8, 16777216, local17);
				this.method2555(local8 + 1, 268435456, local17 + 1);
			}
			if (arg5 == 2) {
				this.method2555(local8, 67108864, local17);
				this.method2555(local8 - 1, 4194304, local17 + 1);
			}
			if (arg5 == 3) {
				this.method2555(local8, 268435456, local17);
				this.method2555(local8 - 1, 16777216, local17 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2555(local8, 545259520, local17);
			this.method2555(local8, 33554432, local17 - 1);
			this.method2555(local8 + 1, 134217728, local17);
		}
		if (arg5 == 1) {
			this.method2555(local8, 41943040, local17);
			this.method2555(local8 + 1, 134217728, local17);
			this.method2555(local8, 536870912, local17 + 1);
		}
		if (arg5 == 2) {
			this.method2555(local8, 167772160, local17);
			this.method2555(local8, 536870912, local17 + 1);
			this.method2555(local8 - 1, 8388608, local17);
		}
		if (arg5 == 3) {
			this.method2555(local8, 671088640, local17);
			this.method2555(local8 - 1, 8388608, local17);
			this.method2555(local8, 33554432, local17 - 1);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
	public void method2546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3231;
		@Pc(9) int local9 = arg0 - this.anInt3241;
		this.anIntArrayArray14[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(BII)V")
	public void method2547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt3241;
		@Pc(21) int local21 = arg1 - this.anInt3231;
		this.anIntArrayArray14[local21][local16] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIZZBI)V")
	public void method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt3241;
		@Pc(17) int local17 = arg5 - this.anInt3231;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method2550(128, local4, local17);
				this.method2550(8, local4, local17 - 1);
			}
			if (arg2 == 1) {
				this.method2550(2, local4, local17);
				this.method2550(32, local4 + 1, local17);
			}
			if (arg2 == 2) {
				this.method2550(8, local4, local17);
				this.method2550(128, local4, local17 + 1);
			}
			if (arg2 == 3) {
				this.method2550(32, local4, local17);
				this.method2550(2, local4 - 1, local17);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method2550(1, local4, local17);
				this.method2550(16, local4 + 1, local17 - 1);
			}
			if (arg2 == 1) {
				this.method2550(4, local4, local17);
				this.method2550(64, local4 + 1, local17 + 1);
			}
			if (arg2 == 2) {
				this.method2550(16, local4, local17);
				this.method2550(1, local4 - 1, local17 + 1);
			}
			if (arg2 == 3) {
				this.method2550(64, local4, local17);
				this.method2550(4, local4 - 1, local17 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method2550(130, local4, local17);
				this.method2550(8, local4, local17 - 1);
				this.method2550(32, local4 + 1, local17);
			}
			if (arg2 == 1) {
				this.method2550(10, local4, local17);
				this.method2550(32, local4 + 1, local17);
				this.method2550(128, local4, local17 + 1);
			}
			if (arg2 == 2) {
				this.method2550(40, local4, local17);
				this.method2550(128, local4, local17 + 1);
				this.method2550(2, local4 - 1, local17);
			}
			if (arg2 == 3) {
				this.method2550(160, local4, local17);
				this.method2550(2, local4 - 1, local17);
				this.method2550(8, local4, local17 - 1);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method2550(65536, local4, local17);
					this.method2550(4096, local4, local17 - 1);
				}
				if (arg2 == 1) {
					this.method2550(1024, local4, local17);
					this.method2550(16384, local4 + 1, local17);
				}
				if (arg2 == 2) {
					this.method2550(4096, local4, local17);
					this.method2550(65536, local4, local17 + 1);
				}
				if (arg2 == 3) {
					this.method2550(16384, local4, local17);
					this.method2550(1024, local4 - 1, local17);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method2550(512, local4, local17);
					this.method2550(8192, local4 + 1, local17 - 1);
				}
				if (arg2 == 1) {
					this.method2550(2048, local4, local17);
					this.method2550(32768, local4 + 1, local17 + 1);
				}
				if (arg2 == 2) {
					this.method2550(8192, local4, local17);
					this.method2550(512, local4 - 1, local17 + 1);
				}
				if (arg2 == 3) {
					this.method2550(32768, local4, local17);
					this.method2550(2048, local4 - 1, local17 + -1);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method2550(66560, local4, local17);
					this.method2550(4096, local4, local17 - 1);
					this.method2550(16384, local4 + 1, local17);
				}
				if (arg2 == 1) {
					this.method2550(5120, local4, local17);
					this.method2550(16384, local4 + 1, local17);
					this.method2550(65536, local4, local17 + 1);
				}
				if (arg2 == 2) {
					this.method2550(20480, local4, local17);
					this.method2550(65536, local4, local17 + 1);
					this.method2550(1024, local4 - 1, local17);
				}
				if (arg2 == 3) {
					this.method2550(81920, local4, local17);
					this.method2550(1024, local4 - 1, local17);
					this.method2550(4096, local4, local17 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method2550(536870912, local4, local17);
				this.method2550(33554432, local4, local17 - 1);
			}
			if (arg2 == 1) {
				this.method2550(8388608, local4, local17);
				this.method2550(134217728, local4 + 1, local17);
			}
			if (arg2 == 2) {
				this.method2550(33554432, local4, local17);
				this.method2550(536870912, local4, local17 + 1);
			}
			if (arg2 == 3) {
				this.method2550(134217728, local4, local17);
				this.method2550(8388608, local4 - 1, local17);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method2550(4194304, local4, local17);
				this.method2550(67108864, local4 + 1, local17 + -1);
			}
			if (arg2 == 1) {
				this.method2550(16777216, local4, local17);
				this.method2550(268435456, local4 + 1, local17 + 1);
			}
			if (arg2 == 2) {
				this.method2550(67108864, local4, local17);
				this.method2550(4194304, local4 - 1, local17 - -1);
			}
			if (arg2 == 3) {
				this.method2550(268435456, local4, local17);
				this.method2550(16777216, local4 - 1, local17 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2550(545259520, local4, local17);
			this.method2550(33554432, local4, local17 - 1);
			this.method2550(134217728, local4 + 1, local17);
		}
		if (arg2 == 1) {
			this.method2550(41943040, local4, local17);
			this.method2550(134217728, local4 + 1, local17);
			this.method2550(536870912, local4, local17 + 1);
		}
		if (arg2 == 2) {
			this.method2550(167772160, local4, local17);
			this.method2550(536870912, local4, local17 + 1);
			this.method2550(8388608, local4 - 1, local17);
		}
		if (arg2 == 3) {
			this.method2550(671088640, local4, local17);
			this.method2550(8388608, local4 - 1, local17);
			this.method2550(33554432, local4, local17 - 1);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIB)V")
	private void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray14[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)Z")
	public boolean method2554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == arg2 && arg1 == arg0) {
			return true;
		}
		@Pc(27) int local27 = arg3 - this.anInt3231;
		@Pc(32) int local32 = arg0 - this.anInt3241;
		if (local27 < 0 || this.anInt3240 <= local27 || local32 < 0 || this.anInt3238 <= local32) {
			return false;
		}
		@Pc(61) int local61 = arg1 - this.anInt3241;
		@Pc(66) int local66 = arg2 - this.anInt3231;
		@Pc(74) int local74;
		if (local27 > local66) {
			local74 = local27 - local66;
		} else {
			local74 = local66 - local27;
		}
		@Pc(88) int local88;
		if (local32 > local61) {
			local88 = local32 - local61;
		} else {
			local88 = local61 - local32;
		}
		@Pc(108) int local108;
		@Pc(110) int local110;
		if (local74 <= local88) {
			local108 = local74 * 65536 / local88;
			local110 = 32768;
			while (local32 != local61) {
				if (local32 > local61) {
					if ((this.anIntArrayArray14[local66][local61] & 0x2C0102) != 0) {
						return false;
					}
					local61++;
				} else if (local61 > local32) {
					if ((this.anIntArrayArray14[local66][local61] & 0x2C0120) != 0) {
						return false;
					}
					local61--;
				}
				local110 += local108;
				if (local110 >= 65536) {
					local110 -= 65536;
					if (local66 < local27) {
						if ((this.anIntArrayArray14[local66][local61] & 0x2C0108) != 0) {
							return false;
						}
						local66++;
					} else if (local27 < local66) {
						if ((this.anIntArrayArray14[local66][local61] & 0x2C0180) != 0) {
							return false;
						}
						local66--;
					}
				}
			}
		} else {
			local108 = local88 * 65536 / local74;
			local110 = 32768;
			while (local27 != local66) {
				if (local27 > local66) {
					if ((this.anIntArrayArray14[local66][local61] & 0x2C0108) != 0) {
						return false;
					}
					local66++;
				} else if (local66 > local27) {
					if ((this.anIntArrayArray14[local66][local61] & 0x2C0180) != 0) {
						return false;
					}
					local66--;
				}
				local110 += local108;
				if (local110 >= 65536) {
					local110 -= 65536;
					if (local61 < local32) {
						if ((this.anIntArrayArray14[local66][local61] & 0x2C0102) != 0) {
							return false;
						}
						local61++;
					} else if (local32 < local61) {
						if ((this.anIntArrayArray14[local66][local61] & 0x2C0120) != 0) {
							return false;
						}
						local61--;
					}
				}
			}
		}
		return (this.anIntArrayArray14[local27][local32] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZI)V")
	private void method2555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg2][arg0] &= ~arg1;
	}
}

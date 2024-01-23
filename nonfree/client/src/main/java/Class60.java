import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class60 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private int anInt1844 = 0;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private int anInt1852;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	private int anInt1837;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1852 = arg0;
		this.anInt1834 = 0;
		this.anInt1837 = arg1;
		this.anIntArrayArray12 = new int[this.anInt1852][this.anInt1837];
		this.method1700();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	public void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1844;
		@Pc(13) int local13 = arg0 - this.anInt1834;
		this.anIntArrayArray12[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)V")
	public void method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1834;
		@Pc(13) int local13 = arg0 - this.anInt1844;
		this.anIntArrayArray12[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIII)V")
	private void method1691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIIIZ)V")
	public void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt1834;
		@Pc(9) int local9 = arg4 - this.anInt1844;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method1691(local9, 128, local4);
				this.method1691(local9, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1691(local9, 2, local4);
				this.method1691(local9 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method1691(local9, 8, local4);
				this.method1691(local9, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1691(local9, 32, local4);
				this.method1691(local9 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method1691(local9, 1, local4);
				this.method1691(local9 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1691(local9, 4, local4);
				this.method1691(local9 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1691(local9, 16, local4);
				this.method1691(local9 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1691(local9, 64, local4);
				this.method1691(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method1691(local9, 130, local4);
				this.method1691(local9, 8, local4 - 1);
				this.method1691(local9 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method1691(local9, 10, local4);
				this.method1691(local9 + 1, 32, local4);
				this.method1691(local9, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1691(local9, 40, local4);
				this.method1691(local9, 128, local4 + 1);
				this.method1691(local9 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method1691(local9, 160, local4);
				this.method1691(local9 - 1, 2, local4);
				this.method1691(local9, 8, local4 - 1);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method1691(local9, 65536, local4);
					this.method1691(local9, 4096, local4 - 1);
				}
				if (arg0 == 1) {
					this.method1691(local9, 1024, local4);
					this.method1691(local9 + 1, 16384, local4);
				}
				if (arg0 == 2) {
					this.method1691(local9, 4096, local4);
					this.method1691(local9, 65536, local4 + 1);
				}
				if (arg0 == 3) {
					this.method1691(local9, 16384, local4);
					this.method1691(local9 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method1691(local9, 512, local4);
					this.method1691(local9 + 1, 8192, local4 - 1);
				}
				if (arg0 == 1) {
					this.method1691(local9, 2048, local4);
					this.method1691(local9 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1691(local9, 8192, local4);
					this.method1691(local9 - 1, 512, local4 + 1);
				}
				if (arg0 == 3) {
					this.method1691(local9, 32768, local4);
					this.method1691(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method1691(local9, 66560, local4);
					this.method1691(local9, 4096, local4 - 1);
					this.method1691(local9 + 1, 16384, local4);
				}
				if (arg0 == 1) {
					this.method1691(local9, 5120, local4);
					this.method1691(local9 + 1, 16384, local4);
					this.method1691(local9, 65536, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1691(local9, 20480, local4);
					this.method1691(local9, 65536, local4 + 1);
					this.method1691(local9 - 1, 1024, local4);
				}
				if (arg0 == 3) {
					this.method1691(local9, 81920, local4);
					this.method1691(local9 - 1, 1024, local4);
					this.method1691(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method1691(local9, 536870912, local4);
				this.method1691(local9, 33554432, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1691(local9, 8388608, local4);
				this.method1691(local9 + 1, 134217728, local4);
			}
			if (arg0 == 2) {
				this.method1691(local9, 33554432, local4);
				this.method1691(local9, 536870912, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1691(local9, 134217728, local4);
				this.method1691(local9 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method1691(local9, 4194304, local4);
				this.method1691(local9 + 1, 67108864, local4 - 1);
			}
			if (arg0 == 1) {
				this.method1691(local9, 16777216, local4);
				this.method1691(local9 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1691(local9, 67108864, local4);
				this.method1691(local9 - 1, 4194304, local4 + 1);
			}
			if (arg0 == 3) {
				this.method1691(local9, 268435456, local4);
				this.method1691(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1691(local9, 545259520, local4);
			this.method1691(local9, 33554432, local4 - 1);
			this.method1691(local9 + 1, 134217728, local4);
		}
		if (arg0 == 1) {
			this.method1691(local9, 41943040, local4);
			this.method1691(local9 + 1, 134217728, local4);
			this.method1691(local9, 536870912, local4 + 1);
		}
		if (arg0 == 2) {
			this.method1691(local9, 167772160, local4);
			this.method1691(local9, 536870912, local4 + 1);
			this.method1691(local9 - 1, 8388608, local4);
		}
		if (arg0 == 3) {
			this.method1691(local9, 671088640, local4);
			this.method1691(local9 - 1, 8388608, local4);
			this.method1691(local9, 33554432, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIZIIB)V")
	public void method1693(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt1834;
		@Pc(9) int local9 = arg1 - this.anInt1844;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1694(128, local9, local4);
				this.method1694(8, local9, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1694(2, local9, local4);
				this.method1694(32, local9 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1694(8, local9, local4);
				this.method1694(128, local9, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1694(32, local9, local4);
				this.method1694(2, local9 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1694(1, local9, local4);
				this.method1694(16, local9 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method1694(4, local9, local4);
				this.method1694(64, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1694(16, local9, local4);
				this.method1694(1, local9 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1694(64, local9, local4);
				this.method1694(4, local9 - 1, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method1694(130, local9, local4);
				this.method1694(8, local9, local4 - 1);
				this.method1694(32, local9 + 1, local4);
			}
			if (arg4 == 1) {
				this.method1694(10, local9, local4);
				this.method1694(32, local9 + 1, local4);
				this.method1694(128, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1694(40, local9, local4);
				this.method1694(128, local9, local4 + 1);
				this.method1694(2, local9 - 1, local4);
			}
			if (arg4 == 3) {
				this.method1694(160, local9, local4);
				this.method1694(2, local9 - 1, local4);
				this.method1694(8, local9, local4 - 1);
			}
		}
		if (arg0) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method1694(65536, local9, local4);
					this.method1694(4096, local9, local4 - 1);
				}
				if (arg4 == 1) {
					this.method1694(1024, local9, local4);
					this.method1694(16384, local9 + 1, local4);
				}
				if (arg4 == 2) {
					this.method1694(4096, local9, local4);
					this.method1694(65536, local9, local4 + 1);
				}
				if (arg4 == 3) {
					this.method1694(16384, local9, local4);
					this.method1694(1024, local9 - 1, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method1694(512, local9, local4);
					this.method1694(8192, local9 + 1, local4 - 1);
				}
				if (arg4 == 1) {
					this.method1694(2048, local9, local4);
					this.method1694(32768, local9 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1694(8192, local9, local4);
					this.method1694(512, local9 - 1, local4 + 1);
				}
				if (arg4 == 3) {
					this.method1694(32768, local9, local4);
					this.method1694(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method1694(66560, local9, local4);
					this.method1694(4096, local9, local4 - 1);
					this.method1694(16384, local9 + 1, local4);
				}
				if (arg4 == 1) {
					this.method1694(5120, local9, local4);
					this.method1694(16384, local9 + 1, local4);
					this.method1694(65536, local9, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1694(20480, local9, local4);
					this.method1694(65536, local9, local4 + 1);
					this.method1694(1024, local9 - 1, local4);
				}
				if (arg4 == 3) {
					this.method1694(81920, local9, local4);
					this.method1694(1024, local9 - 1, local4);
					this.method1694(4096, local9, local4 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1694(536870912, local9, local4);
				this.method1694(33554432, local9, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1694(8388608, local9, local4);
				this.method1694(134217728, local9 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1694(33554432, local9, local4);
				this.method1694(536870912, local9, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1694(134217728, local9, local4);
				this.method1694(8388608, local9 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1694(4194304, local9, local4);
				this.method1694(67108864, local9 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method1694(16777216, local9, local4);
				this.method1694(268435456, local9 + 1, local4 - -1);
			}
			if (arg4 == 2) {
				this.method1694(67108864, local9, local4);
				this.method1694(4194304, local9 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1694(268435456, local9, local4);
				this.method1694(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1694(545259520, local9, local4);
			this.method1694(33554432, local9, local4 - 1);
			this.method1694(134217728, local9 + 1, local4);
		}
		if (arg4 == 1) {
			this.method1694(41943040, local9, local4);
			this.method1694(134217728, local9 + 1, local4);
			this.method1694(536870912, local9, local4 + 1);
		}
		if (arg4 == 2) {
			this.method1694(167772160, local9, local4);
			this.method1694(536870912, local9, local4 + 1);
			this.method1694(8388608, local9 - 1, local4);
		}
		if (arg4 == 3) {
			this.method1694(671088640, local9, local4);
			this.method1694(8388608, local9 - 1, local4);
			this.method1694(33554432, local9, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(BIII)V")
	private void method1694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)Z")
	public boolean method1695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == arg0 && arg3 == arg2) {
			return true;
		}
		@Pc(28) int local28 = arg2 - this.anInt1844;
		@Pc(33) int local33 = arg1 - this.anInt1834;
		if (local33 < 0 || local33 >= this.anInt1852 || local28 < 0 || this.anInt1837 <= local28) {
			return false;
		}
		@Pc(59) int local59 = arg0 - this.anInt1834;
		@Pc(71) int local71;
		if (local33 > local59) {
			local71 = local33 - local59;
		} else {
			local71 = local59 - local33;
		}
		@Pc(83) int local83 = arg3 - this.anInt1844;
		@Pc(91) int local91;
		if (local83 >= local28) {
			local91 = local83 - local28;
		} else {
			local91 = local28 - local83;
		}
		@Pc(113) int local113;
		@Pc(107) int local107;
		if (local91 < local71) {
			local107 = 32768;
			local113 = local91 * 65536 / local71;
			while (local59 != local33) {
				if (local33 > local59) {
					if ((this.anIntArrayArray12[local59][local83] & 0x2C0108) != 0) {
						return false;
					}
					local59++;
				} else if (local59 > local33) {
					if ((this.anIntArrayArray12[local59][local83] & 0x2C0180) != 0) {
						return false;
					}
					local59--;
				}
				local107 += local113;
				if (local107 >= 65536) {
					local107 -= 65536;
					if (local28 > local83) {
						if ((this.anIntArrayArray12[local59][local83] & 0x2C0102) != 0) {
							return false;
						}
						local83++;
					} else if (local28 < local83) {
						if ((this.anIntArrayArray12[local59][local83] & 0x2C0120) != 0) {
							return false;
						}
						local83--;
					}
				}
			}
		} else {
			local107 = 32768;
			local113 = local71 * 65536 / local91;
			while (local28 != local83) {
				if (local28 > local83) {
					if ((this.anIntArrayArray12[local59][local83] & 0x2C0102) != 0) {
						return false;
					}
					local83++;
				} else if (local28 < local83) {
					if ((this.anIntArrayArray12[local59][local83] & 0x2C0120) != 0) {
						return false;
					}
					local83--;
				}
				local107 += local113;
				if (local107 >= 65536) {
					local107 -= 65536;
					if (local59 < local33) {
						if ((this.anIntArrayArray12[local59][local83] & 0x2C0108) != 0) {
							return false;
						}
						local59++;
					} else if (local33 < local59) {
						if ((this.anIntArrayArray12[local59][local83] & 0x2C0180) != 0) {
							return false;
						}
						local59--;
					}
				}
			}
		}
		return (this.anIntArrayArray12[local33][local28] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BZIIIIIZ)V")
	public void method1697(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(13) int local13;
		if (arg4 == 1 || arg4 == 3) {
			local13 = arg5;
			arg5 = arg3;
			arg3 = local13;
		}
		@Pc(22) int local22 = arg2 - this.anInt1844;
		@Pc(24) int local24 = 256;
		if (arg6) {
			local24 = 131328;
		}
		@Pc(44) int local44 = arg1 - this.anInt1834;
		if (arg0) {
			local24 |= 0x40000000;
		}
		for (local13 = local44; local13 < local44 + arg5; local13++) {
			if (local13 >= 0 && local13 < this.anInt1852) {
				for (@Pc(71) int local71 = local22; local71 < local22 + arg3; local71++) {
					if (local71 >= 0 && this.anInt1837 > local71) {
						this.method1694(local24, local71, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIZZ)V")
	public void method1698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg2 - this.anInt1834;
		@Pc(8) int local8 = 256;
		@Pc(17) int local17 = arg0 - this.anInt1844;
		if (arg5) {
			local8 = 131328;
		}
		if (arg4) {
			local8 |= 0x40000000;
		}
		for (@Pc(36) int local36 = local6; local36 < arg1 + local6; local36++) {
			if (local36 >= 0 && this.anInt1852 > local36) {
				for (@Pc(52) int local52 = local17; local52 < arg3 + local17; local52++) {
					if (local52 >= 0 && this.anInt1837 > local52) {
						this.method1691(local52, local8, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)V")
	public void method1699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1844;
		@Pc(17) int local17 = arg1 - this.anInt1834;
		this.anIntArrayArray12[local17][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method1700() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt1852; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt1837; local18++) {
				if (local12 == 0 || local18 == 0 || local12 >= this.anInt1852 - 5 || this.anInt1837 - 5 <= local18) {
					this.anIntArrayArray12[local12][local18] = 16777215;
				} else {
					this.anIntArrayArray12[local12][local18] = 2097152;
				}
			}
		}
	}
}

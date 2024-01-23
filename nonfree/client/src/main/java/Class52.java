import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class52 {

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private int anInt1441 = 0;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt1433 = 0;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	private int anInt1438;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	private int anInt1444;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1438 = arg1;
		this.anInt1444 = arg0;
		this.anIntArrayArray14 = new int[this.anInt1444][this.anInt1438];
		this.method1243();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	private void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt1433;
		@Pc(21) int local21 = arg1 - this.anInt1441;
		this.anIntArrayArray14[local16][local21] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
	private void method1242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public void method1243() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1444; local7++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt1438; local17++) {
				if (local7 == 0 || local17 == 0 || local7 >= this.anInt1444 - 5 || local17 >= this.anInt1438 - 5) {
					this.anIntArrayArray14[local7][local17] = 16777215;
				} else {
					this.anIntArrayArray14[local7][local17] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BIIIZIZ)V")
	public void method1245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1441;
		@Pc(13) int local13 = arg2 - this.anInt1433;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method1242(local13, 128, local4);
				this.method1242(local13 - 1, 8, local4);
			}
			if (arg0 == 1) {
				this.method1242(local13, 2, local4);
				this.method1242(local13, 32, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1242(local13, 8, local4);
				this.method1242(local13 + 1, 128, local4);
			}
			if (arg0 == 3) {
				this.method1242(local13, 32, local4);
				this.method1242(local13, 2, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method1242(local13, 1, local4);
				this.method1242(local13 - 1, 16, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1242(local13, 4, local4);
				this.method1242(local13 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1242(local13, 16, local4);
				this.method1242(local13 + 1, 1, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1242(local13, 64, local4);
				this.method1242(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method1242(local13, 130, local4);
				this.method1242(local13 - 1, 8, local4);
				this.method1242(local13, 32, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1242(local13, 10, local4);
				this.method1242(local13, 32, local4 + 1);
				this.method1242(local13 + 1, 128, local4);
			}
			if (arg0 == 2) {
				this.method1242(local13, 40, local4);
				this.method1242(local13 + 1, 128, local4);
				this.method1242(local13, 2, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1242(local13, 160, local4);
				this.method1242(local13, 2, local4 - 1);
				this.method1242(local13 - 1, 8, local4);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method1242(local13, 65536, local4);
					this.method1242(local13 - 1, 4096, local4);
				}
				if (arg0 == 1) {
					this.method1242(local13, 1024, local4);
					this.method1242(local13, 16384, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1242(local13, 4096, local4);
					this.method1242(local13 + 1, 65536, local4);
				}
				if (arg0 == 3) {
					this.method1242(local13, 16384, local4);
					this.method1242(local13, 1024, local4 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method1242(local13, 512, local4);
					this.method1242(local13 - 1, 8192, local4 + 1);
				}
				if (arg0 == 1) {
					this.method1242(local13, 2048, local4);
					this.method1242(local13 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1242(local13, 8192, local4);
					this.method1242(local13 + 1, 512, local4 - 1);
				}
				if (arg0 == 3) {
					this.method1242(local13, 32768, local4);
					this.method1242(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method1242(local13, 66560, local4);
					this.method1242(local13 - 1, 4096, local4);
					this.method1242(local13, 16384, local4 + 1);
				}
				if (arg0 == 1) {
					this.method1242(local13, 5120, local4);
					this.method1242(local13, 16384, local4 + 1);
					this.method1242(local13 + 1, 65536, local4);
				}
				if (arg0 == 2) {
					this.method1242(local13, 20480, local4);
					this.method1242(local13 + 1, 65536, local4);
					this.method1242(local13, 1024, local4 - 1);
				}
				if (arg0 == 3) {
					this.method1242(local13, 81920, local4);
					this.method1242(local13, 1024, local4 - 1);
					this.method1242(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method1242(local13, 536870912, local4);
				this.method1242(local13 - 1, 33554432, local4);
			}
			if (arg0 == 1) {
				this.method1242(local13, 8388608, local4);
				this.method1242(local13, 134217728, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1242(local13, 33554432, local4);
				this.method1242(local13 + 1, 536870912, local4);
			}
			if (arg0 == 3) {
				this.method1242(local13, 134217728, local4);
				this.method1242(local13, 8388608, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method1242(local13, 4194304, local4);
				this.method1242(local13 - 1, 67108864, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1242(local13, 16777216, local4);
				this.method1242(local13 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1242(local13, 67108864, local4);
				this.method1242(local13 + 1, 4194304, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1242(local13, 268435456, local4);
				this.method1242(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1242(local13, 545259520, local4);
			this.method1242(local13 - 1, 33554432, local4);
			this.method1242(local13, 134217728, local4 + 1);
		}
		if (arg0 == 1) {
			this.method1242(local13, 41943040, local4);
			this.method1242(local13, 134217728, local4 + 1);
			this.method1242(local13 + 1, 536870912, local4);
		}
		if (arg0 == 2) {
			this.method1242(local13, 167772160, local4);
			this.method1242(local13 + 1, 536870912, local4);
			this.method1242(local13, 8388608, local4 - 1);
		}
		if (arg0 == 3) {
			this.method1242(local13, 671088640, local4);
			this.method1242(local13, 8388608, local4 - 1);
			this.method1242(local13 - 1, 33554432, local4);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)V")
	public void method1246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1441;
		@Pc(13) int local13 = arg1 - this.anInt1433;
		this.anIntArrayArray14[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)Z")
	public boolean method1247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == arg2 && arg3 == arg0) {
			return true;
		}
		@Pc(33) int local33 = arg2 - this.anInt1433;
		@Pc(38) int local38 = arg3 - this.anInt1441;
		if (local33 < 0 || local33 >= this.anInt1444 || local38 < 0 || local38 >= this.anInt1438) {
			return false;
		}
		@Pc(63) int local63 = arg1 - this.anInt1433;
		@Pc(75) int local75;
		if (local33 > local63) {
			local75 = local33 - local63;
		} else {
			local75 = local63 - local33;
		}
		@Pc(87) int local87 = arg0 - this.anInt1441;
		@Pc(95) int local95;
		if (local87 >= local38) {
			local95 = local87 - local38;
		} else {
			local95 = local38 - local87;
		}
		@Pc(114) int local114;
		@Pc(116) int local116;
		if (local95 >= local75) {
			local114 = local75 * 65536 / local95;
			local116 = 32768;
			while (local87 != local38) {
				if (local38 > local87) {
					if ((this.anIntArrayArray14[local63][local87] & 0x2C0102) != 0) {
						return false;
					}
					local87++;
				} else if (local38 < local87) {
					if ((this.anIntArrayArray14[local63][local87] & 0x2C0120) != 0) {
						return false;
					}
					local87--;
				}
				local116 += local114;
				if (local116 >= 65536) {
					local116 -= 65536;
					if (local63 < local33) {
						if ((this.anIntArrayArray14[local63][local87] & 0x2C0108) != 0) {
							return false;
						}
						local63++;
					} else if (local63 > local33) {
						if ((this.anIntArrayArray14[local63][local87] & 0x2C0180) != 0) {
							return false;
						}
						local63--;
					}
				}
			}
		} else {
			local114 = local95 * 65536 / local75;
			local116 = 32768;
			while (local63 != local33) {
				if (local63 < local33) {
					if ((this.anIntArrayArray14[local63][local87] & 0x2C0108) != 0) {
						return false;
					}
					local63++;
				} else if (local33 < local63) {
					if ((this.anIntArrayArray14[local63][local87] & 0x2C0180) != 0) {
						return false;
					}
					local63--;
				}
				local116 += local114;
				if (local116 >= 65536) {
					local116 -= 65536;
					if (local38 > local87) {
						if ((this.anIntArrayArray14[local63][local87] & 0x2C0102) != 0) {
							return false;
						}
						local87++;
					} else if (local38 < local87) {
						if ((this.anIntArrayArray14[local63][local87] & 0x2C0120) != 0) {
							return false;
						}
						local87--;
					}
				}
			}
		}
		return (this.anIntArrayArray14[local33][local38] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIIIIZ)V")
	public void method1248(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		@Pc(12) int local12 = arg1 - this.anInt1433;
		@Pc(22) int local22;
		if (arg3 == 1 || arg3 == 3) {
			local22 = arg4;
			arg4 = arg5;
			arg5 = local22;
		}
		if (arg6) {
			local7 = 131328;
		}
		@Pc(37) int local37 = arg2 - this.anInt1441;
		if (arg0) {
			local7 |= 0x40000000;
		}
		for (local22 = local12; local22 < arg4 + local12; local22++) {
			if (local22 >= 0 && this.anInt1444 > local22) {
				for (@Pc(62) int local62 = local37; local62 < arg5 + local37; local62++) {
					if (local62 >= 0 && this.anInt1438 > local62) {
						this.method1242(local22, local7, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZIIIIZ)V")
	public void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg3 - this.anInt1433;
		@Pc(13) int local13 = arg0 - this.anInt1441;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1240(128, local13, local4);
				this.method1240(8, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1240(2, local13, local4);
				this.method1240(32, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1240(8, local13, local4);
				this.method1240(128, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1240(32, local13, local4);
				this.method1240(2, local13 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1240(1, local13, local4);
				this.method1240(16, local13 + 1, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1240(4, local13, local4);
				this.method1240(64, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1240(16, local13, local4);
				this.method1240(1, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1240(64, local13, local4);
				this.method1240(4, local13 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method1240(130, local13, local4);
				this.method1240(8, local13, local4 - 1);
				this.method1240(32, local13 + 1, local4);
			}
			if (arg4 == 1) {
				this.method1240(10, local13, local4);
				this.method1240(32, local13 + 1, local4);
				this.method1240(128, local13, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1240(40, local13, local4);
				this.method1240(128, local13, local4 + 1);
				this.method1240(2, local13 - 1, local4);
			}
			if (arg4 == 3) {
				this.method1240(160, local13, local4);
				this.method1240(2, local13 - 1, local4);
				this.method1240(8, local13, local4 - 1);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method1240(65536, local13, local4);
					this.method1240(4096, local13, local4 - 1);
				}
				if (arg4 == 1) {
					this.method1240(1024, local13, local4);
					this.method1240(16384, local13 + 1, local4);
				}
				if (arg4 == 2) {
					this.method1240(4096, local13, local4);
					this.method1240(65536, local13, local4 + 1);
				}
				if (arg4 == 3) {
					this.method1240(16384, local13, local4);
					this.method1240(1024, local13 - 1, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method1240(512, local13, local4);
					this.method1240(8192, local13 + 1, local4 + -1);
				}
				if (arg4 == 1) {
					this.method1240(2048, local13, local4);
					this.method1240(32768, local13 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1240(8192, local13, local4);
					this.method1240(512, local13 - 1, local4 + 1);
				}
				if (arg4 == 3) {
					this.method1240(32768, local13, local4);
					this.method1240(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method1240(66560, local13, local4);
					this.method1240(4096, local13, local4 - 1);
					this.method1240(16384, local13 + 1, local4);
				}
				if (arg4 == 1) {
					this.method1240(5120, local13, local4);
					this.method1240(16384, local13 + 1, local4);
					this.method1240(65536, local13, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1240(20480, local13, local4);
					this.method1240(65536, local13, local4 + 1);
					this.method1240(1024, local13 - 1, local4);
				}
				if (arg4 == 3) {
					this.method1240(81920, local13, local4);
					this.method1240(1024, local13 - 1, local4);
					this.method1240(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1240(536870912, local13, local4);
				this.method1240(33554432, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1240(8388608, local13, local4);
				this.method1240(134217728, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1240(33554432, local13, local4);
				this.method1240(536870912, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1240(134217728, local13, local4);
				this.method1240(8388608, local13 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1240(4194304, local13, local4);
				this.method1240(67108864, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method1240(16777216, local13, local4);
				this.method1240(268435456, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1240(67108864, local13, local4);
				this.method1240(4194304, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1240(268435456, local13, local4);
				this.method1240(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1240(545259520, local13, local4);
			this.method1240(33554432, local13, local4 - 1);
			this.method1240(134217728, local13 + 1, local4);
		}
		if (arg4 == 1) {
			this.method1240(41943040, local13, local4);
			this.method1240(134217728, local13 + 1, local4);
			this.method1240(536870912, local13, local4 + 1);
		}
		if (arg4 == 2) {
			this.method1240(167772160, local13, local4);
			this.method1240(536870912, local13, local4 + 1);
			this.method1240(8388608, local13 - 1, local4);
		}
		if (arg4 == 3) {
			this.method1240(671088640, local13, local4);
			this.method1240(8388608, local13 - 1, local4);
			this.method1240(33554432, local13, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V")
	public void method1252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1433;
		@Pc(19) int local19 = arg0 - this.anInt1441;
		this.anIntArrayArray14[local4][local19] |= 0x40000;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method1253(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg2 - this.anInt1433;
		@Pc(15) int local15 = arg3 - this.anInt1441;
		@Pc(17) int local17 = 256;
		if (arg5) {
			local17 = 131328;
		}
		if (arg0) {
			local17 |= 0x40000000;
		}
		for (@Pc(37) int local37 = local6; local37 < local6 + arg1; local37++) {
			if (local37 >= 0 && local37 < this.anInt1444) {
				for (@Pc(59) int local59 = local15; local59 < local15 + arg4; local59++) {
					if (local59 >= 0 && local59 < this.anInt1438) {
						this.method1240(local17, local59, local37);
					}
				}
			}
		}
	}
}

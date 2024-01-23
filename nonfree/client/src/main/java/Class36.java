import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class36 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	private int anInt1260 = 0;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	private int anInt1259;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	private int anInt1265;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	private int anInt1266;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1259 = arg0;
		this.anInt1265 = arg1;
		this.anIntArrayArray7 = new int[this.anInt1259][this.anInt1265];
		this.anInt1266 = 0;
		this.method949();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIIIZZI)V")
	public void method948(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt1266;
		@Pc(13) int local13 = arg5 - this.anInt1260;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method957(local13, 128, local4);
				this.method957(local13 - 1, 8, local4);
			}
			if (arg1 == 1) {
				this.method957(local13, 2, local4);
				this.method957(local13, 32, local4 + 1);
			}
			if (arg1 == 2) {
				this.method957(local13, 8, local4);
				this.method957(local13 + 1, 128, local4);
			}
			if (arg1 == 3) {
				this.method957(local13, 32, local4);
				this.method957(local13, 2, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method957(local13, 1, local4);
				this.method957(local13 - 1, 16, local4 + 1);
			}
			if (arg1 == 1) {
				this.method957(local13, 4, local4);
				this.method957(local13 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method957(local13, 16, local4);
				this.method957(local13 + 1, 1, local4 - 1);
			}
			if (arg1 == 3) {
				this.method957(local13, 64, local4);
				this.method957(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method957(local13, 130, local4);
				this.method957(local13 - 1, 8, local4);
				this.method957(local13, 32, local4 + 1);
			}
			if (arg1 == 1) {
				this.method957(local13, 10, local4);
				this.method957(local13, 32, local4 + 1);
				this.method957(local13 + 1, 128, local4);
			}
			if (arg1 == 2) {
				this.method957(local13, 40, local4);
				this.method957(local13 + 1, 128, local4);
				this.method957(local13, 2, local4 - 1);
			}
			if (arg1 == 3) {
				this.method957(local13, 160, local4);
				this.method957(local13, 2, local4 - 1);
				this.method957(local13 - 1, 8, local4);
			}
		}
		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method957(local13, 65536, local4);
					this.method957(local13 - 1, 4096, local4);
				}
				if (arg1 == 1) {
					this.method957(local13, 1024, local4);
					this.method957(local13, 16384, local4 + 1);
				}
				if (arg1 == 2) {
					this.method957(local13, 4096, local4);
					this.method957(local13 + 1, 65536, local4);
				}
				if (arg1 == 3) {
					this.method957(local13, 16384, local4);
					this.method957(local13, 1024, local4 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method957(local13, 512, local4);
					this.method957(local13 - 1, 8192, local4 + 1);
				}
				if (arg1 == 1) {
					this.method957(local13, 2048, local4);
					this.method957(local13 + 1, 32768, local4 + 1);
				}
				if (arg1 == 2) {
					this.method957(local13, 8192, local4);
					this.method957(local13 + 1, 512, local4 - 1);
				}
				if (arg1 == 3) {
					this.method957(local13, 32768, local4);
					this.method957(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method957(local13, 66560, local4);
					this.method957(local13 - 1, 4096, local4);
					this.method957(local13, 16384, local4 + 1);
				}
				if (arg1 == 1) {
					this.method957(local13, 5120, local4);
					this.method957(local13, 16384, local4 + 1);
					this.method957(local13 + 1, 65536, local4);
				}
				if (arg1 == 2) {
					this.method957(local13, 20480, local4);
					this.method957(local13 + 1, 65536, local4);
					this.method957(local13, 1024, local4 - 1);
				}
				if (arg1 == 3) {
					this.method957(local13, 81920, local4);
					this.method957(local13, 1024, local4 - 1);
					this.method957(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method957(local13, 536870912, local4);
				this.method957(local13 - 1, 33554432, local4);
			}
			if (arg1 == 1) {
				this.method957(local13, 8388608, local4);
				this.method957(local13, 134217728, local4 + 1);
			}
			if (arg1 == 2) {
				this.method957(local13, 33554432, local4);
				this.method957(local13 + 1, 536870912, local4);
			}
			if (arg1 == 3) {
				this.method957(local13, 134217728, local4);
				this.method957(local13, 8388608, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method957(local13, 4194304, local4);
				this.method957(local13 - 1, 67108864, local4 + 1);
			}
			if (arg1 == 1) {
				this.method957(local13, 16777216, local4);
				this.method957(local13 + 1, 268435456, local4 + 1);
			}
			if (arg1 == 2) {
				this.method957(local13, 67108864, local4);
				this.method957(local13 + 1, 4194304, local4 - 1);
			}
			if (arg1 == 3) {
				this.method957(local13, 268435456, local4);
				this.method957(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method957(local13, 545259520, local4);
			this.method957(local13 - 1, 33554432, local4);
			this.method957(local13, 134217728, local4 + 1);
		}
		if (arg1 == 1) {
			this.method957(local13, 41943040, local4);
			this.method957(local13, 134217728, local4 + 1);
			this.method957(local13 + 1, 536870912, local4);
		}
		if (arg1 == 2) {
			this.method957(local13, 167772160, local4);
			this.method957(local13 + 1, 536870912, local4);
			this.method957(local13, 8388608, local4 - 1);
		}
		if (arg1 == 3) {
			this.method957(local13, 671088640, local4);
			this.method957(local13, 8388608, local4 - 1);
			this.method957(local13 - 1, 33554432, local4);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public void method949() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt1259; local9++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1265; local15++) {
				if (local9 == 0 || local15 == 0 || local9 >= this.anInt1259 - 5 || this.anInt1265 - 5 <= local15) {
					this.anIntArrayArray7[local9][local15] = 16777215;
				} else {
					this.anIntArrayArray7[local9][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public void method950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1266;
		@Pc(21) int local21 = arg1 - this.anInt1260;
		this.anIntArrayArray7[local21][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBIIZZI)V")
	public void method952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg3 - this.anInt1260;
		@Pc(25) int local25;
		if (arg6 == 1 || arg6 == 3) {
			local25 = arg0;
			arg0 = arg1;
			arg1 = local25;
		}
		@Pc(31) int local31 = 256;
		@Pc(36) int local36 = arg2 - this.anInt1266;
		if (arg4) {
			local31 = 131328;
		}
		if (arg5) {
			local31 |= 0x40000000;
		}
		for (local25 = local10; local25 < local10 + arg0; local25++) {
			if (local25 >= 0 && this.anInt1259 > local25) {
				for (@Pc(72) int local72 = local36; local72 < local36 + arg1; local72++) {
					if (local72 >= 0 && local72 < this.anInt1265) {
						this.method960(local31, local72, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZIIIII)V")
	public void method953(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt1266;
		@Pc(13) int local13 = arg3 - this.anInt1260;
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method960(128, local8, local13);
				this.method960(8, local8, local13 - 1);
			}
			if (arg2 == 1) {
				this.method960(2, local8, local13);
				this.method960(32, local8 + 1, local13);
			}
			if (arg2 == 2) {
				this.method960(8, local8, local13);
				this.method960(128, local8, local13 + 1);
			}
			if (arg2 == 3) {
				this.method960(32, local8, local13);
				this.method960(2, local8 - 1, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method960(1, local8, local13);
				this.method960(16, local8 + 1, local13 + -1);
			}
			if (arg2 == 1) {
				this.method960(4, local8, local13);
				this.method960(64, local8 + 1, local13 + 1);
			}
			if (arg2 == 2) {
				this.method960(16, local8, local13);
				this.method960(1, local8 - 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method960(64, local8, local13);
				this.method960(4, local8 - 1, local13 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg2 == 0) {
				this.method960(130, local8, local13);
				this.method960(8, local8, local13 - 1);
				this.method960(32, local8 + 1, local13);
			}
			if (arg2 == 1) {
				this.method960(10, local8, local13);
				this.method960(32, local8 + 1, local13);
				this.method960(128, local8, local13 + 1);
			}
			if (arg2 == 2) {
				this.method960(40, local8, local13);
				this.method960(128, local8, local13 + 1);
				this.method960(2, local8 - 1, local13);
			}
			if (arg2 == 3) {
				this.method960(160, local8, local13);
				this.method960(2, local8 - 1, local13);
				this.method960(8, local8, local13 - 1);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg2 == 0) {
					this.method960(65536, local8, local13);
					this.method960(4096, local8, local13 - 1);
				}
				if (arg2 == 1) {
					this.method960(1024, local8, local13);
					this.method960(16384, local8 + 1, local13);
				}
				if (arg2 == 2) {
					this.method960(4096, local8, local13);
					this.method960(65536, local8, local13 + 1);
				}
				if (arg2 == 3) {
					this.method960(16384, local8, local13);
					this.method960(1024, local8 - 1, local13);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg2 == 0) {
					this.method960(512, local8, local13);
					this.method960(8192, local8 + 1, local13 + -1);
				}
				if (arg2 == 1) {
					this.method960(2048, local8, local13);
					this.method960(32768, local8 + 1, local13 - -1);
				}
				if (arg2 == 2) {
					this.method960(8192, local8, local13);
					this.method960(512, local8 - 1, local13 - -1);
				}
				if (arg2 == 3) {
					this.method960(32768, local8, local13);
					this.method960(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					this.method960(66560, local8, local13);
					this.method960(4096, local8, local13 - 1);
					this.method960(16384, local8 + 1, local13);
				}
				if (arg2 == 1) {
					this.method960(5120, local8, local13);
					this.method960(16384, local8 + 1, local13);
					this.method960(65536, local8, local13 + 1);
				}
				if (arg2 == 2) {
					this.method960(20480, local8, local13);
					this.method960(65536, local8, local13 + 1);
					this.method960(1024, local8 - 1, local13);
				}
				if (arg2 == 3) {
					this.method960(81920, local8, local13);
					this.method960(1024, local8 - 1, local13);
					this.method960(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method960(536870912, local8, local13);
				this.method960(33554432, local8, local13 - 1);
			}
			if (arg2 == 1) {
				this.method960(8388608, local8, local13);
				this.method960(134217728, local8 + 1, local13);
			}
			if (arg2 == 2) {
				this.method960(33554432, local8, local13);
				this.method960(536870912, local8, local13 + 1);
			}
			if (arg2 == 3) {
				this.method960(134217728, local8, local13);
				this.method960(8388608, local8 - 1, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method960(4194304, local8, local13);
				this.method960(67108864, local8 + 1, local13 + -1);
			}
			if (arg2 == 1) {
				this.method960(16777216, local8, local13);
				this.method960(268435456, local8 + 1, local13 + 1);
			}
			if (arg2 == 2) {
				this.method960(67108864, local8, local13);
				this.method960(4194304, local8 - 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method960(268435456, local8, local13);
				this.method960(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method960(545259520, local8, local13);
			this.method960(33554432, local8, local13 - 1);
			this.method960(134217728, local8 + 1, local13);
		}
		if (arg2 == 1) {
			this.method960(41943040, local8, local13);
			this.method960(134217728, local8 + 1, local13);
			this.method960(536870912, local8, local13 + 1);
		}
		if (arg2 == 2) {
			this.method960(167772160, local8, local13);
			this.method960(536870912, local8, local13 + 1);
			this.method960(8388608, local8 - 1, local13);
		}
		if (arg2 == 3) {
			this.method960(671088640, local8, local13);
			this.method960(8388608, local8 - 1, local13);
			this.method960(33554432, local8, local13 - 1);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V")
	public void method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1266;
		@Pc(21) int local21 = arg0 - this.anInt1260;
		this.anIntArrayArray7[local21][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V")
	public void method956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 - this.anInt1266;
		@Pc(15) int local15 = arg1 - this.anInt1260;
		this.anIntArrayArray7[local15][local10] |= 0x200000;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V")
	private void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray7[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)Z")
	public boolean method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == arg2 && arg3 == arg0) {
			return true;
		}
		@Pc(23) int local23 = arg2 - this.anInt1260;
		@Pc(28) int local28 = arg0 - this.anInt1266;
		if (local23 < 0 || local23 >= this.anInt1259 || local28 < 0 || this.anInt1265 <= local28) {
			return false;
		}
		@Pc(51) int local51 = arg3 - this.anInt1266;
		@Pc(56) int local56 = arg1 - this.anInt1260;
		@Pc(64) int local64;
		if (local28 <= local51) {
			local64 = local51 - local28;
		} else {
			local64 = local28 - local51;
		}
		@Pc(79) int local79;
		if (local23 <= local56) {
			local79 = local56 - local23;
		} else {
			local79 = local23 - local56;
		}
		@Pc(107) int local107;
		@Pc(109) int local109;
		if (local79 > local64) {
			local107 = local64 * 65536 / local79;
			local109 = 32768;
			while (local23 != local56) {
				if (local23 > local56) {
					if ((this.anIntArrayArray7[local56][local51] & 0x2C0108) != 0) {
						return false;
					}
					local56++;
				} else if (local23 < local56) {
					if ((this.anIntArrayArray7[local56][local51] & 0x2C0180) != 0) {
						return false;
					}
					local56--;
				}
				local109 += local107;
				if (local109 >= 65536) {
					local109 -= 65536;
					if (local51 < local28) {
						if ((this.anIntArrayArray7[local56][local51] & 0x2C0102) != 0) {
							return false;
						}
						local51++;
					} else if (local28 < local51) {
						if ((this.anIntArrayArray7[local56][local51] & 0x2C0120) != 0) {
							return false;
						}
						local51--;
					}
				}
			}
		} else {
			local109 = 32768;
			local107 = local79 * 65536 / local64;
			while (local51 != local28) {
				if (local51 < local28) {
					if ((this.anIntArrayArray7[local56][local51] & 0x2C0102) != 0) {
						return false;
					}
					local51++;
				} else if (local28 < local51) {
					if ((this.anIntArrayArray7[local56][local51] & 0x2C0120) != 0) {
						return false;
					}
					local51--;
				}
				local109 += local107;
				if (local109 >= 65536) {
					local109 -= 65536;
					if (local56 < local23) {
						if ((this.anIntArrayArray7[local56][local51] & 0x2C0108) != 0) {
							return false;
						}
						local56++;
					} else if (local23 < local56) {
						if ((this.anIntArrayArray7[local56][local51] & 0x2C0180) != 0) {
							return false;
						}
						local56--;
					}
				}
			}
		}
		return (this.anIntArrayArray7[local23][local28] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBZIZI)V")
	public void method959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg3 - this.anInt1266;
		@Pc(24) int local24 = 256;
		if (arg2) {
			local24 = 131328;
		}
		@Pc(36) int local36 = arg1 - this.anInt1260;
		if (arg4) {
			local24 |= 0x40000000;
		}
		for (@Pc(45) int local45 = local36; local45 < arg5 + local36; local45++) {
			if (local45 >= 0 && this.anInt1259 > local45) {
				for (@Pc(69) int local69 = local6; local69 < arg0 + local6; local69++) {
					if (local69 >= 0 && local69 < this.anInt1265) {
						this.method957(local45, local24, local69);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBII)V")
	private void method960(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray7[arg2][arg1] &= ~arg0;
	}
}

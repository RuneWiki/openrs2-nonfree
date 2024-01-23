import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class75 {

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private int anInt2443;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	private int anInt2445;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	private int anInt2444;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2443 = arg0;
		this.anInt2445 = 0;
		this.anInt2444 = arg1;
		this.anInt2460 = 0;
		this.anIntArrayArray30 = new int[this.anInt2443][this.anInt2444];
		this.method1817();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method1809(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2445;
		@Pc(13) int local13 = arg2 - this.anInt2460;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1813(local13, 128, local8);
				this.method1813(local13, 8, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1813(local13, 2, local8);
				this.method1813(local13 + 1, 32, local8);
			}
			if (arg1 == 2) {
				this.method1813(local13, 8, local8);
				this.method1813(local13, 128, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1813(local13, 32, local8);
				this.method1813(local13 - 1, 2, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1813(local13, 1, local8);
				this.method1813(local13 + 1, 16, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1813(local13, 4, local8);
				this.method1813(local13 + 1, 64, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1813(local13, 16, local8);
				this.method1813(local13 - 1, 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1813(local13, 64, local8);
				this.method1813(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method1813(local13, 130, local8);
				this.method1813(local13, 8, local8 - 1);
				this.method1813(local13 + 1, 32, local8);
			}
			if (arg1 == 1) {
				this.method1813(local13, 10, local8);
				this.method1813(local13 + 1, 32, local8);
				this.method1813(local13, 128, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1813(local13, 40, local8);
				this.method1813(local13, 128, local8 + 1);
				this.method1813(local13 - 1, 2, local8);
			}
			if (arg1 == 3) {
				this.method1813(local13, 160, local8);
				this.method1813(local13 - 1, 2, local8);
				this.method1813(local13, 8, local8 - 1);
			}
		}
		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method1813(local13, 65536, local8);
					this.method1813(local13, 4096, local8 - 1);
				}
				if (arg1 == 1) {
					this.method1813(local13, 1024, local8);
					this.method1813(local13 + 1, 16384, local8);
				}
				if (arg1 == 2) {
					this.method1813(local13, 4096, local8);
					this.method1813(local13, 65536, local8 + 1);
				}
				if (arg1 == 3) {
					this.method1813(local13, 16384, local8);
					this.method1813(local13 - 1, 1024, local8);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method1813(local13, 512, local8);
					this.method1813(local13 + 1, 8192, local8 - 1);
				}
				if (arg1 == 1) {
					this.method1813(local13, 2048, local8);
					this.method1813(local13 + 1, 32768, local8 + 1);
				}
				if (arg1 == 2) {
					this.method1813(local13, 8192, local8);
					this.method1813(local13 - 1, 512, local8 + 1);
				}
				if (arg1 == 3) {
					this.method1813(local13, 32768, local8);
					this.method1813(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method1813(local13, 66560, local8);
					this.method1813(local13, 4096, local8 - 1);
					this.method1813(local13 + 1, 16384, local8);
				}
				if (arg1 == 1) {
					this.method1813(local13, 5120, local8);
					this.method1813(local13 + 1, 16384, local8);
					this.method1813(local13, 65536, local8 + 1);
				}
				if (arg1 == 2) {
					this.method1813(local13, 20480, local8);
					this.method1813(local13, 65536, local8 + 1);
					this.method1813(local13 - 1, 1024, local8);
				}
				if (arg1 == 3) {
					this.method1813(local13, 81920, local8);
					this.method1813(local13 - 1, 1024, local8);
					this.method1813(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1813(local13, 536870912, local8);
				this.method1813(local13, 33554432, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1813(local13, 8388608, local8);
				this.method1813(local13 + 1, 134217728, local8);
			}
			if (arg1 == 2) {
				this.method1813(local13, 33554432, local8);
				this.method1813(local13, 536870912, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1813(local13, 134217728, local8);
				this.method1813(local13 - 1, 8388608, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1813(local13, 4194304, local8);
				this.method1813(local13 + 1, 67108864, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1813(local13, 16777216, local8);
				this.method1813(local13 + 1, 268435456, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1813(local13, 67108864, local8);
				this.method1813(local13 - 1, 4194304, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1813(local13, 268435456, local8);
				this.method1813(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1813(local13, 545259520, local8);
			this.method1813(local13, 33554432, local8 - 1);
			this.method1813(local13 + 1, 134217728, local8);
		}
		if (arg1 == 1) {
			this.method1813(local13, 41943040, local8);
			this.method1813(local13 + 1, 134217728, local8);
			this.method1813(local13, 536870912, local8 + 1);
		}
		if (arg1 == 2) {
			this.method1813(local13, 167772160, local8);
			this.method1813(local13, 536870912, local8 + 1);
			this.method1813(local13 - 1, 8388608, local8);
		}
		if (arg1 == 3) {
			this.method1813(local13, 671088640, local8);
			this.method1813(local13 - 1, 8388608, local8);
			this.method1813(local13, 33554432, local8 - 1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2460;
		@Pc(13) int local13 = arg0 - this.anInt2445;
		this.anIntArrayArray30[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	private void method1813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
	public void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt2460;
		@Pc(21) int local21 = arg1 - this.anInt2445;
		this.anIntArrayArray30[local21][local16] |= 0x200000;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZIIIIZ)V")
	public void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg0 - this.anInt2460;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg2 - this.anInt2445;
		if (arg1) {
			local12 = 131328;
		}
		if (arg5) {
			local12 |= 0x40000000;
		}
		for (@Pc(37) int local37 = local17; local37 < arg3 + local17; local37++) {
			if (local37 >= 0 && local37 < this.anInt2443) {
				for (@Pc(59) int local59 = local6; local59 < arg4 + local6; local59++) {
					if (local59 >= 0 && this.anInt2444 > local59) {
						this.method1813(local59, local12, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZIIIIII)V")
	public void method1816(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 - this.anInt2445;
		@Pc(15) int local15 = arg4 - this.anInt2460;
		@Pc(17) int local17 = 256;
		if (arg1) {
			local17 = 131328;
		}
		@Pc(37) int local37;
		if (arg5 == 1 || arg5 == 3) {
			local37 = arg2;
			arg2 = arg3;
			arg3 = local37;
		}
		if (arg0) {
			local17 |= 0x40000000;
		}
		for (local37 = local10; local37 < arg2 + local10; local37++) {
			if (local37 >= 0 && this.anInt2443 > local37) {
				for (@Pc(74) int local74 = local15; local74 < arg3 + local15; local74++) {
					if (local74 >= 0 && this.anInt2444 > local74) {
						this.method1827(local74, local17, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public void method1817() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt2443; local9++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt2444; local19++) {
				if (local9 == 0 || local19 == 0 || this.anInt2443 - 5 <= local9 || this.anInt2444 - 5 <= local19) {
					this.anIntArrayArray30[local9][local19] = 16777215;
				} else {
					this.anIntArrayArray30[local9][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIBII)Z")
	public boolean method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 == arg3 && arg1 == arg0) {
			return true;
		}
		@Pc(22) int local22 = arg0 - this.anInt2460;
		@Pc(27) int local27 = arg2 - this.anInt2445;
		if (local27 < 0 || this.anInt2443 <= local27 || local22 < 0 || this.anInt2444 <= local22) {
			return false;
		}
		@Pc(54) int local54 = arg1 - this.anInt2460;
		@Pc(59) int local59 = arg3 - this.anInt2445;
		if (local59 < 0 || this.anInt2443 <= local59 || local54 < 0 || local54 >= this.anInt2444) {
			return false;
		}
		@Pc(102) int local102;
		if (local27 > local59) {
			local102 = local27 - local59;
		} else {
			local102 = local59 - local27;
		}
		@Pc(119) int local119;
		if (local22 <= local54) {
			local119 = local54 - local22;
		} else {
			local119 = local22 - local54;
		}
		@Pc(139) int local139;
		@Pc(141) int local141;
		if (local119 >= local102) {
			local139 = local102 * 65536 / local119;
			local141 = 32768;
			while (local54 != local22) {
				if (local22 > local54) {
					if ((this.anIntArrayArray30[local59][local54] & 0x2C0102) != 0) {
						return false;
					}
					local54++;
				} else if (local22 < local54) {
					if ((this.anIntArrayArray30[local59][local54] & 0x2C0120) != 0) {
						return false;
					}
					local54--;
				}
				local141 += local139;
				if (local141 >= 65536) {
					local141 -= 65536;
					if (local27 > local59) {
						if ((this.anIntArrayArray30[local59][local54] & 0x2C0108) != 0) {
							return false;
						}
						local59++;
					} else if (local27 < local59) {
						if ((this.anIntArrayArray30[local59][local54] & 0x2C0180) != 0) {
							return false;
						}
						local59--;
					}
				}
			}
		} else {
			local139 = local119 * 65536 / local102;
			local141 = 32768;
			while (local59 != local27) {
				if (local59 < local27) {
					if ((this.anIntArrayArray30[local59][local54] & 0x2C0108) != 0) {
						return false;
					}
					local59++;
				} else if (local27 < local59) {
					if ((this.anIntArrayArray30[local59][local54] & 0x2C0180) != 0) {
						return false;
					}
					local59--;
				}
				local141 += local139;
				if (local141 >= 65536) {
					local141 -= 65536;
					if (local54 < local22) {
						if ((this.anIntArrayArray30[local59][local54] & 0x2C0102) != 0) {
							return false;
						}
						local54++;
					} else if (local54 > local22) {
						if ((this.anIntArrayArray30[local59][local54] & 0x2C0120) != 0) {
							return false;
						}
						local54--;
					}
				}
			}
		}
		return (this.anIntArrayArray30[local27][local22] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BZIIIIZ)V")
	public void method1820(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2445;
		@Pc(13) int local13 = arg1 - this.anInt2460;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1827(local13, 128, local8);
				this.method1827(local13, 8, local8 - 1);
			}
			if (arg3 == 1) {
				this.method1827(local13, 2, local8);
				this.method1827(local13 + 1, 32, local8);
			}
			if (arg3 == 2) {
				this.method1827(local13, 8, local8);
				this.method1827(local13, 128, local8 + 1);
			}
			if (arg3 == 3) {
				this.method1827(local13, 32, local8);
				this.method1827(local13 - 1, 2, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1827(local13, 1, local8);
				this.method1827(local13 + 1, 16, local8 - 1);
			}
			if (arg3 == 1) {
				this.method1827(local13, 4, local8);
				this.method1827(local13 + 1, 64, local8 + 1);
			}
			if (arg3 == 2) {
				this.method1827(local13, 16, local8);
				this.method1827(local13 - 1, 1, local8 + 1);
			}
			if (arg3 == 3) {
				this.method1827(local13, 64, local8);
				this.method1827(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method1827(local13, 130, local8);
				this.method1827(local13, 8, local8 - 1);
				this.method1827(local13 + 1, 32, local8);
			}
			if (arg3 == 1) {
				this.method1827(local13, 10, local8);
				this.method1827(local13 + 1, 32, local8);
				this.method1827(local13, 128, local8 + 1);
			}
			if (arg3 == 2) {
				this.method1827(local13, 40, local8);
				this.method1827(local13, 128, local8 + 1);
				this.method1827(local13 - 1, 2, local8);
			}
			if (arg3 == 3) {
				this.method1827(local13, 160, local8);
				this.method1827(local13 - 1, 2, local8);
				this.method1827(local13, 8, local8 - 1);
			}
		}
		if (arg0) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method1827(local13, 65536, local8);
					this.method1827(local13, 4096, local8 - 1);
				}
				if (arg3 == 1) {
					this.method1827(local13, 1024, local8);
					this.method1827(local13 + 1, 16384, local8);
				}
				if (arg3 == 2) {
					this.method1827(local13, 4096, local8);
					this.method1827(local13, 65536, local8 + 1);
				}
				if (arg3 == 3) {
					this.method1827(local13, 16384, local8);
					this.method1827(local13 - 1, 1024, local8);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method1827(local13, 512, local8);
					this.method1827(local13 + 1, 8192, local8 - 1);
				}
				if (arg3 == 1) {
					this.method1827(local13, 2048, local8);
					this.method1827(local13 + 1, 32768, local8 + 1);
				}
				if (arg3 == 2) {
					this.method1827(local13, 8192, local8);
					this.method1827(local13 - 1, 512, local8 + 1);
				}
				if (arg3 == 3) {
					this.method1827(local13, 32768, local8);
					this.method1827(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method1827(local13, 66560, local8);
					this.method1827(local13, 4096, local8 - 1);
					this.method1827(local13 + 1, 16384, local8);
				}
				if (arg3 == 1) {
					this.method1827(local13, 5120, local8);
					this.method1827(local13 + 1, 16384, local8);
					this.method1827(local13, 65536, local8 + 1);
				}
				if (arg3 == 2) {
					this.method1827(local13, 20480, local8);
					this.method1827(local13, 65536, local8 + 1);
					this.method1827(local13 - 1, 1024, local8);
				}
				if (arg3 == 3) {
					this.method1827(local13, 81920, local8);
					this.method1827(local13 - 1, 1024, local8);
					this.method1827(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1827(local13, 536870912, local8);
				this.method1827(local13, 33554432, local8 - 1);
			}
			if (arg3 == 1) {
				this.method1827(local13, 8388608, local8);
				this.method1827(local13 + 1, 134217728, local8);
			}
			if (arg3 == 2) {
				this.method1827(local13, 33554432, local8);
				this.method1827(local13, 536870912, local8 + 1);
			}
			if (arg3 == 3) {
				this.method1827(local13, 134217728, local8);
				this.method1827(local13 - 1, 8388608, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1827(local13, 4194304, local8);
				this.method1827(local13 + 1, 67108864, local8 - 1);
			}
			if (arg3 == 1) {
				this.method1827(local13, 16777216, local8);
				this.method1827(local13 + 1, 268435456, local8 + 1);
			}
			if (arg3 == 2) {
				this.method1827(local13, 67108864, local8);
				this.method1827(local13 - 1, 4194304, local8 + 1);
			}
			if (arg3 == 3) {
				this.method1827(local13, 268435456, local8);
				this.method1827(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1827(local13, 545259520, local8);
			this.method1827(local13, 33554432, local8 - 1);
			this.method1827(local13 + 1, 134217728, local8);
		}
		if (arg3 == 1) {
			this.method1827(local13, 41943040, local8);
			this.method1827(local13 + 1, 134217728, local8);
			this.method1827(local13, 536870912, local8 + 1);
		}
		if (arg3 == 2) {
			this.method1827(local13, 167772160, local8);
			this.method1827(local13, 536870912, local8 + 1);
			this.method1827(local13 - 1, 8388608, local8);
		}
		if (arg3 == 3) {
			this.method1827(local13, 671088640, local8);
			this.method1827(local13 - 1, 8388608, local8);
			this.method1827(local13, 33554432, local8 - 1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(18) int local18 = arg7 + arg2;
		@Pc(22) int local22 = arg5 + arg3;
		@Pc(26) int local26 = arg6 + arg4;
		@Pc(30) int local30 = arg1 + arg8;
		@Pc(56) int local56;
		@Pc(67) int local67;
		if (local30 == arg2 && (arg0 & 0x2) == 0) {
			local56 = arg3 > arg4 ? arg3 : arg4;
			local67 = local26 > local22 ? local22 : local26;
			while (local67 > local56) {
				if ((this.anIntArrayArray30[local30 - this.anInt2445 - 1][local56 - this.anInt2460] & 0x8) == 0) {
					return true;
				}
				local56++;
			}
		} else if (local18 == arg1 && (arg0 & 0x8) == 0) {
			local56 = arg3 <= arg4 ? arg4 : arg3;
			local67 = local26 <= local22 ? local26 : local22;
			while (local56 < local67) {
				if ((this.anIntArrayArray30[arg1 - this.anInt2445][local56 - this.anInt2460] & 0x80) == 0) {
					return true;
				}
				local56++;
			}
		} else if (arg3 == local26 && (arg0 & 0x1) == 0) {
			local56 = arg2 > arg1 ? arg2 : arg1;
			local67 = local30 <= local18 ? local30 : local18;
			while (local56 < local67) {
				if ((this.anIntArrayArray30[local56 - this.anInt2445][local26 - this.anInt2460 - 1] & 0x2) == 0) {
					return true;
				}
				local56++;
			}
		} else if (local22 == arg4 && (arg0 & 0x4) == 0) {
			local67 = local18 < local30 ? local18 : local30;
			for (local56 = arg1 >= arg2 ? arg1 : arg2; local56 < local67; local56++) {
				if ((this.anIntArrayArray30[local56 - this.anInt2445][arg4 - this.anInt2460] & 0x20) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)V")
	public void method1822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2460;
		@Pc(13) int local13 = arg0 - this.anInt2445;
		this.anIntArrayArray30[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 <= 1) {
			@Pc(47) int local47 = arg1 + arg4 - 1;
			@Pc(53) int local53 = arg0 + arg3 - 1;
			if (arg2 >= arg1 && local47 >= arg2 && arg3 <= arg7 && arg7 <= local53) {
				return true;
			} else if (arg2 == arg1 - 1 && arg3 <= arg7 && arg7 <= local53 && (this.anIntArrayArray30[arg2 - this.anInt2445][arg7 - this.anInt2460] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg2 == local47 + 1 && arg7 >= arg3 && arg7 <= local53 && (this.anIntArrayArray30[arg2 - this.anInt2445][arg7 - this.anInt2460] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg3 - 1 == arg7 && arg1 <= arg2 && arg2 <= local47 && (this.anIntArrayArray30[arg2 - this.anInt2445][arg7 - this.anInt2460] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg7 == local53 + 1 && arg2 >= arg1 && local47 >= arg2 && (this.anIntArrayArray30[arg2 - this.anInt2445][arg7 - this.anInt2460] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} else if (Static36.method771(arg3, arg2, arg0, arg7, arg1, arg5, arg5, arg4)) {
			return true;
		} else {
			return this.method1821(arg6, arg1, arg2, arg7, arg3, arg5, arg0, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg3 == arg0 && arg1 == arg4) {
				return true;
			}
		} else if (arg0 >= arg3 && arg0 <= arg6 + arg3 - 1 && arg1 >= arg1 && arg6 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(57) int local57 = arg0 - this.anInt2445;
		@Pc(67) int local67 = arg4 - this.anInt2460;
		@Pc(72) int local72 = arg3 - this.anInt2445;
		@Pc(77) int local77 = arg1 - this.anInt2460;
		if (arg6 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local57 + 1 == local72 && local67 == local77 && (this.anIntArrayArray30[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 == local57 && local67 == local77 - 1 && (this.anIntArrayArray30[local72][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 == local57 - 1 && local77 == local67 && (this.anIntArrayArray30[local72][local67] & 0x8) == 0) {
						return true;
					}
					if (local57 == local72 && local77 - 1 == local67 && (this.anIntArrayArray30[local72][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local72 == local57 - 1 && local77 == local67 && (this.anIntArrayArray30[local72][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 == local57 && local67 == local77 + 1 && (this.anIntArrayArray30[local72][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local57 + 1 == local72 && local67 == local77 && (this.anIntArrayArray30[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 == local57 && local77 + 1 == local67 && (this.anIntArrayArray30[local72][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local72 == local57 && local67 == local77 + 1 && (this.anIntArrayArray30[local72][local67] & 0x20) == 0) {
					return true;
				}
				if (local57 == local72 && local77 - 1 == local67 && (this.anIntArrayArray30[local72][local67] & 0x2) == 0) {
					return true;
				}
				if (local57 - 1 == local72 && local77 == local67 && (this.anIntArrayArray30[local72][local67] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local72 && local67 == local77 && (this.anIntArrayArray30[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = local72 + arg6 - 1;
			@Pc(95) int local95 = arg6 + local67 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local72 == local57 + 1 && local67 <= local77 && local95 >= local77 && (this.anIntArrayArray30[local72][local77] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local72 && local89 >= local57 && local67 == local77 - arg6 && (this.anIntArrayArray30[local57][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local57 - arg6 == local72 && local67 <= local77 && local77 <= local95 && (this.anIntArrayArray30[local89][local77] & 0x8) == 0) {
						return true;
					}
					if (local57 >= local72 && local57 <= local89 && local67 == local77 - arg6 && (this.anIntArrayArray30[local57][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local57 - arg6 == local72 && local77 >= local67 && local77 <= local95 && (this.anIntArrayArray30[local89][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local57 && local89 >= local57 && local77 + 1 == local67 && (this.anIntArrayArray30[local57][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local72 == local57 + 1 && local77 >= local67 && local77 <= local95 && (this.anIntArrayArray30[local72][local77] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local72 && local57 <= local89 && local77 + 1 == local67 && (this.anIntArrayArray30[local57][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local72 <= local57 && local89 >= local57 && local77 + 1 == local67 && (this.anIntArrayArray30[local57][local67] & 0x20) == 0) {
					return true;
				}
				if (local57 >= local72 && local57 <= local89 && local77 - arg6 == local67 && (this.anIntArrayArray30[local57][local95] & 0x2) == 0) {
					return true;
				}
				if (local72 == local57 - arg6 && local77 >= local67 && local95 >= local77 && (this.anIntArrayArray30[local89][local77] & 0x8) == 0) {
					return true;
				}
				if (local72 == local57 + 1 && local77 >= local67 && local95 >= local77 && (this.anIntArrayArray30[local72][local77] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method1826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg3 == arg6 && arg0 == arg5) {
				return true;
			}
		} else if (arg6 <= arg3 && arg3 <= arg2 + arg6 - 1 && arg0 >= arg0 && arg2 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(60) int local60 = arg6 - this.anInt2445;
		@Pc(65) int local65 = arg5 - this.anInt2460;
		@Pc(70) int local70 = arg0 - this.anInt2460;
		@Pc(75) int local75 = arg3 - this.anInt2445;
		if (arg2 == 1) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local60 == local75 - 1 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 == local70 + 1 && (this.anIntArrayArray30[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local60 && local65 == local70 - 1 && (this.anIntArrayArray30[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local75 == local60 && local65 == local70 + 1) {
						return true;
					}
					if (local60 == local75 - 1 && local65 == local70 && (this.anIntArrayArray30[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local70 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local75 + 1 == local60 && local65 == local70) {
						return true;
					}
					if (local75 == local60 && local70 + 1 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 && local70 - 1 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local60 == local75 && local65 == local70 - 1) {
						return true;
					}
					if (local75 - 1 == local60 && local65 == local70 && (this.anIntArrayArray30[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray30[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local75 - 1 == local60 && local65 == local70) {
						return true;
					}
					if (local60 == local75 && local70 + 1 == local65) {
						return true;
					}
					if (local60 == local75 + 1 && local70 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local60 && local65 == local70 - 1 && (this.anIntArrayArray30[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local60 == local75 - 1 && local70 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local60 && local65 == local70 + 1) {
						return true;
					}
					if (local75 + 1 == local60 && local70 == local65) {
						return true;
					}
					if (local60 == local75 && local70 - 1 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local60 == local75 - 1 && local70 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local60 && local65 == local70 + 1 && (this.anIntArrayArray30[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 == local70) {
						return true;
					}
					if (local60 == local75 && local65 == local70 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local60 == local75 - 1 && local70 == local65) {
						return true;
					}
					if (local60 == local75 && local70 + 1 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 == local70 && (this.anIntArrayArray30[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local60 && local70 - 1 == local65) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local60 == local75 && local70 + 1 == local65 && (this.anIntArrayArray30[local60][local65] & 0x20) == 0) {
					return true;
				}
				if (local75 == local60 && local70 - 1 == local65 && (this.anIntArrayArray30[local60][local65] & 0x2) == 0) {
					return true;
				}
				if (local60 == local75 - 1 && local70 == local65 && (this.anIntArrayArray30[local60][local65] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local60 && local70 == local65 && (this.anIntArrayArray30[local60][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(831) int local831 = local60 + arg2 - 1;
			@Pc(837) int local837 = arg2 + local65 - 1;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local60 == local75 - arg2 && local65 <= local70 && local837 >= local70) {
						return true;
					}
					if (local75 >= local60 && local831 >= local75 && local70 + 1 == local65 && (this.anIntArrayArray30[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 <= local75 && local75 <= local831 && local70 - arg2 == local65 && (this.anIntArrayArray30[local75][local837] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local75 >= local60 && local831 >= local75 && local70 + 1 == local65) {
						return true;
					}
					if (local75 - arg2 == local60 && local70 >= local65 && local70 <= local837 && (this.anIntArrayArray30[local831][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 <= local70 && local70 <= local837 && (this.anIntArrayArray30[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local75 + 1 == local60 && local70 >= local65 && local70 <= local837) {
						return true;
					}
					if (local60 <= local75 && local75 <= local831 && local65 == local70 + 1 && (this.anIntArrayArray30[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local60 && local831 >= local75 && local70 - arg2 == local65 && (this.anIntArrayArray30[local75][local837] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local60 <= local75 && local831 >= local75 && local70 - arg2 == local65) {
						return true;
					}
					if (local75 - arg2 == local60 && local70 >= local65 && local837 >= local70 && (this.anIntArrayArray30[local831][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local70 >= local65 && local837 >= local70 && (this.anIntArrayArray30[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local75 - arg2 == local60 && local70 >= local65 && local837 >= local70) {
						return true;
					}
					if (local60 <= local75 && local75 <= local831 && local65 == local70 + 1) {
						return true;
					}
					if (local60 == local75 + 1 && local70 >= local65 && local70 <= local837 && (this.anIntArrayArray30[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local60 && local831 >= local75 && local65 == local70 - arg2 && (this.anIntArrayArray30[local75][local837] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local75 - arg2 == local60 && local70 >= local65 && local837 >= local70 && (this.anIntArrayArray30[local831][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local60 && local831 >= local75 && local70 + 1 == local65) {
						return true;
					}
					if (local60 == local75 + 1 && local70 >= local65 && local837 >= local70) {
						return true;
					}
					if (local75 >= local60 && local75 <= local831 && local65 == local70 - arg2 && (this.anIntArrayArray30[local75][local837] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local60 == local75 - arg2 && local65 <= local70 && local837 >= local70 && (this.anIntArrayArray30[local831][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local831 && local65 == local70 + 1 && (this.anIntArrayArray30[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 <= local70 && local70 <= local837) {
						return true;
					}
					if (local75 >= local60 && local831 >= local75 && local65 == local70 - arg2) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local75 - arg2 == local60 && local70 >= local65 && local837 >= local70) {
						return true;
					}
					if (local60 <= local75 && local75 <= local831 && local70 + 1 == local65 && (this.anIntArrayArray30[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 <= local70 && local70 <= local837 && (this.anIntArrayArray30[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local831 && local65 == local70 - arg2) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local75 >= local60 && local831 >= local75 && local65 == local70 + 1 && (this.anIntArrayArray30[local75][local65] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 >= local60 && local75 <= local831 && local70 - arg2 == local65 && (this.anIntArrayArray30[local75][local837] & 0x2C0102) == 0) {
					return true;
				}
				if (local60 == local75 - arg2 && local70 >= local65 && local70 <= local837 && (this.anIntArrayArray30[local831][local70] & 0x2C0108) == 0) {
					return true;
				}
				if (local75 + 1 == local60 && local70 >= local65 && local70 <= local837 && (this.anIntArrayArray30[local60][local70] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V")
	private void method1827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg2][arg0] &= ~arg1;
	}
}

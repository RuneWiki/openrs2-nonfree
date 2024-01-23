import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	private int anInt161 = 0;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt154 = 0;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt156 = arg0;
		this.anInt152 = arg1;
		this.anIntArrayArray1 = new int[this.anInt156][this.anInt152];
		this.method110();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZIIII)V")
	public void method107(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt154;
		@Pc(13) int local13 = arg5 - this.anInt161;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method109(128, local13, local4);
				this.method109(8, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method109(2, local13, local4);
				this.method109(32, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method109(8, local13, local4);
				this.method109(128, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method109(32, local13, local4);
				this.method109(2, local13 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method109(1, local13, local4);
				this.method109(16, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method109(4, local13, local4);
				this.method109(64, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method109(16, local13, local4);
				this.method109(1, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method109(64, local13, local4);
				this.method109(4, local13 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method109(130, local13, local4);
				this.method109(8, local13, local4 - 1);
				this.method109(32, local13 + 1, local4);
			}
			if (arg4 == 1) {
				this.method109(10, local13, local4);
				this.method109(32, local13 + 1, local4);
				this.method109(128, local13, local4 + 1);
			}
			if (arg4 == 2) {
				this.method109(40, local13, local4);
				this.method109(128, local13, local4 + 1);
				this.method109(2, local13 - 1, local4);
			}
			if (arg4 == 3) {
				this.method109(160, local13, local4);
				this.method109(2, local13 - 1, local4);
				this.method109(8, local13, local4 - 1);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method109(65536, local13, local4);
					this.method109(4096, local13, local4 - 1);
				}
				if (arg4 == 1) {
					this.method109(1024, local13, local4);
					this.method109(16384, local13 + 1, local4);
				}
				if (arg4 == 2) {
					this.method109(4096, local13, local4);
					this.method109(65536, local13, local4 + 1);
				}
				if (arg4 == 3) {
					this.method109(16384, local13, local4);
					this.method109(1024, local13 - 1, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method109(512, local13, local4);
					this.method109(8192, local13 + 1, local4 - 1);
				}
				if (arg4 == 1) {
					this.method109(2048, local13, local4);
					this.method109(32768, local13 + 1, local4 - -1);
				}
				if (arg4 == 2) {
					this.method109(8192, local13, local4);
					this.method109(512, local13 - 1, local4 + 1);
				}
				if (arg4 == 3) {
					this.method109(32768, local13, local4);
					this.method109(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method109(66560, local13, local4);
					this.method109(4096, local13, local4 - 1);
					this.method109(16384, local13 + 1, local4);
				}
				if (arg4 == 1) {
					this.method109(5120, local13, local4);
					this.method109(16384, local13 + 1, local4);
					this.method109(65536, local13, local4 + 1);
				}
				if (arg4 == 2) {
					this.method109(20480, local13, local4);
					this.method109(65536, local13, local4 + 1);
					this.method109(1024, local13 - 1, local4);
				}
				if (arg4 == 3) {
					this.method109(81920, local13, local4);
					this.method109(1024, local13 - 1, local4);
					this.method109(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method109(536870912, local13, local4);
				this.method109(33554432, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method109(8388608, local13, local4);
				this.method109(134217728, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method109(33554432, local13, local4);
				this.method109(536870912, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method109(134217728, local13, local4);
				this.method109(8388608, local13 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method109(4194304, local13, local4);
				this.method109(67108864, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method109(16777216, local13, local4);
				this.method109(268435456, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method109(67108864, local13, local4);
				this.method109(4194304, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method109(268435456, local13, local4);
				this.method109(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method109(545259520, local13, local4);
			this.method109(33554432, local13, local4 - 1);
			this.method109(134217728, local13 + 1, local4);
		}
		if (arg4 == 1) {
			this.method109(41943040, local13, local4);
			this.method109(134217728, local13 + 1, local4);
			this.method109(536870912, local13, local4 + 1);
		}
		if (arg4 == 2) {
			this.method109(167772160, local13, local4);
			this.method109(536870912, local13, local4 + 1);
			this.method109(8388608, local13 - 1, local4);
		}
		if (arg4 == 3) {
			this.method109(671088640, local13, local4);
			this.method109(8388608, local13 - 1, local4);
			this.method109(33554432, local13, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
	private void method109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method110() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt156; local3++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt152; local9++) {
				if (local3 == 0 || local9 == 0 || local3 >= this.anInt156 - 5 || this.anInt152 - 5 <= local9) {
					this.anIntArrayArray1[local3][local9] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local9] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)V")
	public void method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt154;
		@Pc(9) int local9 = arg0 - this.anInt161;
		this.anIntArrayArray1[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZI)V")
	private void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZIZIII)V")
	public void method113(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg0 - this.anInt161;
		@Pc(21) int local21 = arg5 - this.anInt154;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method112(128, local12, local21);
				this.method112(8, local12, local21 - 1);
			}
			if (arg4 == 1) {
				this.method112(2, local12, local21);
				this.method112(32, local12 + 1, local21);
			}
			if (arg4 == 2) {
				this.method112(8, local12, local21);
				this.method112(128, local12, local21 + 1);
			}
			if (arg4 == 3) {
				this.method112(32, local12, local21);
				this.method112(2, local12 - 1, local21);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method112(1, local12, local21);
				this.method112(16, local12 + 1, local21 + -1);
			}
			if (arg4 == 1) {
				this.method112(4, local12, local21);
				this.method112(64, local12 + 1, local21 + 1);
			}
			if (arg4 == 2) {
				this.method112(16, local12, local21);
				this.method112(1, local12 - 1, local21 + 1);
			}
			if (arg4 == 3) {
				this.method112(64, local12, local21);
				this.method112(4, local12 - 1, local21 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method112(130, local12, local21);
				this.method112(8, local12, local21 - 1);
				this.method112(32, local12 + 1, local21);
			}
			if (arg4 == 1) {
				this.method112(10, local12, local21);
				this.method112(32, local12 + 1, local21);
				this.method112(128, local12, local21 + 1);
			}
			if (arg4 == 2) {
				this.method112(40, local12, local21);
				this.method112(128, local12, local21 + 1);
				this.method112(2, local12 - 1, local21);
			}
			if (arg4 == 3) {
				this.method112(160, local12, local21);
				this.method112(2, local12 - 1, local21);
				this.method112(8, local12, local21 - 1);
			}
		}
		if (arg3) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method112(65536, local12, local21);
					this.method112(4096, local12, local21 - 1);
				}
				if (arg4 == 1) {
					this.method112(1024, local12, local21);
					this.method112(16384, local12 + 1, local21);
				}
				if (arg4 == 2) {
					this.method112(4096, local12, local21);
					this.method112(65536, local12, local21 + 1);
				}
				if (arg4 == 3) {
					this.method112(16384, local12, local21);
					this.method112(1024, local12 - 1, local21);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method112(512, local12, local21);
					this.method112(8192, local12 + 1, local21 + -1);
				}
				if (arg4 == 1) {
					this.method112(2048, local12, local21);
					this.method112(32768, local12 + 1, local21 + 1);
				}
				if (arg4 == 2) {
					this.method112(8192, local12, local21);
					this.method112(512, local12 - 1, local21 - -1);
				}
				if (arg4 == 3) {
					this.method112(32768, local12, local21);
					this.method112(2048, local12 - 1, local21 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method112(66560, local12, local21);
					this.method112(4096, local12, local21 - 1);
					this.method112(16384, local12 + 1, local21);
				}
				if (arg4 == 1) {
					this.method112(5120, local12, local21);
					this.method112(16384, local12 + 1, local21);
					this.method112(65536, local12, local21 + 1);
				}
				if (arg4 == 2) {
					this.method112(20480, local12, local21);
					this.method112(65536, local12, local21 + 1);
					this.method112(1024, local12 - 1, local21);
				}
				if (arg4 == 3) {
					this.method112(81920, local12, local21);
					this.method112(1024, local12 - 1, local21);
					this.method112(4096, local12, local21 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method112(536870912, local12, local21);
				this.method112(33554432, local12, local21 - 1);
			}
			if (arg4 == 1) {
				this.method112(8388608, local12, local21);
				this.method112(134217728, local12 + 1, local21);
			}
			if (arg4 == 2) {
				this.method112(33554432, local12, local21);
				this.method112(536870912, local12, local21 + 1);
			}
			if (arg4 == 3) {
				this.method112(134217728, local12, local21);
				this.method112(8388608, local12 - 1, local21);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method112(4194304, local12, local21);
				this.method112(67108864, local12 + 1, local21 + -1);
			}
			if (arg4 == 1) {
				this.method112(16777216, local12, local21);
				this.method112(268435456, local12 + 1, local21 - -1);
			}
			if (arg4 == 2) {
				this.method112(67108864, local12, local21);
				this.method112(4194304, local12 - 1, local21 - -1);
			}
			if (arg4 == 3) {
				this.method112(268435456, local12, local21);
				this.method112(16777216, local12 - 1, local21 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method112(545259520, local12, local21);
			this.method112(33554432, local12, local21 - 1);
			this.method112(134217728, local12 + 1, local21);
		}
		if (arg4 == 1) {
			this.method112(41943040, local12, local21);
			this.method112(134217728, local12 + 1, local21);
			this.method112(536870912, local12, local21 + 1);
		}
		if (arg4 == 2) {
			this.method112(167772160, local12, local21);
			this.method112(536870912, local12, local21 + 1);
			this.method112(8388608, local12 - 1, local21);
		}
		if (arg4 == 3) {
			this.method112(671088640, local12, local21);
			this.method112(8388608, local12 - 1, local21);
			this.method112(33554432, local12, local21 - 1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	public void method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 - this.anInt154;
		@Pc(22) int local22 = arg0 - this.anInt161;
		this.anIntArrayArray1[local17][local22] |= 0x200000;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public void method115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt161;
		@Pc(9) int local9 = arg0 - this.anInt154;
		this.anIntArrayArray1[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZIIIII)V")
	public void method117(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 256;
		if (arg0) {
			local3 = 131328;
		}
		if (arg2) {
			local3 |= 0x40000000;
		}
		@Pc(20) int local20 = arg5 - this.anInt154;
		@Pc(29) int local29 = arg6 - this.anInt161;
		@Pc(37) int local37;
		if (arg3 == 1 || arg3 == 3) {
			local37 = arg1;
			arg1 = arg4;
			arg4 = local37;
		}
		for (local37 = local20; local37 < local20 + arg1; local37++) {
			if (local37 >= 0 && local37 < this.anInt156) {
				for (@Pc(68) int local68 = local29; local68 < arg4 + local29; local68++) {
					if (local68 >= 0 && this.anInt152 > local68) {
						this.method112(local3, local68, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZBIIIIZ)V")
	public void method118(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg2 - this.anInt161;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg4 - this.anInt154;
		if (arg0) {
			local12 = 131328;
		}
		if (arg5) {
			local12 |= 0x40000000;
		}
		for (@Pc(36) int local36 = local17; local36 < arg3 + local17; local36++) {
			if (local36 >= 0 && this.anInt156 > local36) {
				for (@Pc(56) int local56 = local6; local56 < arg1 + local6; local56++) {
					if (local56 >= 0 && this.anInt152 > local56) {
						this.method109(local12, local56, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)Z")
	public boolean method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == arg1 && arg3 == arg2) {
			return true;
		}
		@Pc(19) int local19 = arg3 - this.anInt161;
		@Pc(24) int local24 = arg0 - this.anInt154;
		if (local24 < 0 || local24 >= this.anInt156 || local19 < 0 || this.anInt152 <= local19) {
			return false;
		}
		@Pc(51) int local51 = arg1 - this.anInt154;
		@Pc(56) int local56 = arg2 - this.anInt161;
		@Pc(67) int local67;
		if (local19 <= local56) {
			local67 = local56 - local19;
		} else {
			local67 = local19 - local56;
		}
		@Pc(91) int local91;
		if (local51 < local24) {
			local91 = local24 - local51;
		} else {
			local91 = local51 - local24;
		}
		@Pc(106) int local106;
		@Pc(108) int local108;
		if (local91 <= local67) {
			local106 = local91 * 65536 / local67;
			local108 = 32768;
			while (local56 != local19) {
				if (local56 < local19) {
					if ((this.anIntArrayArray1[local51][local56] & 0x2C0102) != 0) {
						return false;
					}
					local56++;
				} else if (local56 > local19) {
					if ((this.anIntArrayArray1[local51][local56] & 0x2C0120) != 0) {
						return false;
					}
					local56--;
				}
				local108 += local106;
				if (local108 >= 65536) {
					local108 -= 65536;
					if (local24 > local51) {
						if ((this.anIntArrayArray1[local51][local56] & 0x2C0108) != 0) {
							return false;
						}
						local51++;
					} else if (local51 > local24) {
						if ((this.anIntArrayArray1[local51][local56] & 0x2C0180) != 0) {
							return false;
						}
						local51--;
					}
				}
			}
		} else {
			local106 = local67 * 65536 / local91;
			local108 = 32768;
			while (local51 != local24) {
				if (local51 < local24) {
					if ((this.anIntArrayArray1[local51][local56] & 0x2C0108) != 0) {
						return false;
					}
					local51++;
				} else if (local24 < local51) {
					if ((this.anIntArrayArray1[local51][local56] & 0x2C0180) != 0) {
						return false;
					}
					local51--;
				}
				local108 += local106;
				if (local108 >= 65536) {
					local108 -= 65536;
					if (local19 > local56) {
						if ((this.anIntArrayArray1[local51][local56] & 0x2C0102) != 0) {
							return false;
						}
						local56++;
					} else if (local19 < local56) {
						if ((this.anIntArrayArray1[local51][local56] & 0x2C0120) != 0) {
							return false;
						}
						local56--;
					}
				}
			}
		}
		return (this.anIntArrayArray1[local24][local19] & 0x240100) == 0;
	}
}

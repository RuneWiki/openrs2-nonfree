import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class63 {

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	private int anInt2172;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	private int anInt2180;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2182 = arg0;
		this.anInt2179 = 0;
		this.anInt2172 = arg1;
		this.anInt2180 = 0;
		this.anIntArrayArray21 = new int[this.anInt2182][this.anInt2172];
		this.method1668();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)V")
	public void method1661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2180;
		@Pc(13) int local13 = arg1 - this.anInt2179;
		this.anIntArrayArray21[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZZIII)V")
	public void method1662(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt2180;
		@Pc(17) int local17 = arg4 - this.anInt2179;
		@Pc(19) int local19 = 256;
		if (arg2) {
			local19 = 131328;
		}
		if (arg1) {
			local19 |= 0x40000000;
		}
		for (@Pc(34) int local34 = local17; local34 < local17 + arg0; local34++) {
			if (local34 >= 0 && local34 < this.anInt2182) {
				for (@Pc(53) int local53 = local6; local53 < arg3 + local6; local53++) {
					if (local53 >= 0 && local53 < this.anInt2172) {
						this.method1665(local53, local34, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V")
	private void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray21[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIZZII)V")
	public void method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg1 - this.anInt2179;
		@Pc(21) int local21;
		if (arg0 == 1 || arg0 == 3) {
			local21 = arg6;
			arg6 = arg5;
			arg5 = local21;
		}
		@Pc(27) int local27 = 256;
		@Pc(32) int local32 = arg2 - this.anInt2180;
		if (arg4) {
			local27 = 131328;
		}
		if (arg3) {
			local27 |= 0x40000000;
		}
		for (local21 = local6; local21 < arg6 + local6; local21++) {
			if (local21 >= 0 && this.anInt2182 > local21) {
				for (@Pc(64) int local64 = local32; local64 < local32 + arg5; local64++) {
					if (local64 >= 0 && local64 < this.anInt2172) {
						this.method1675(local27, local64, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
	public void method1668() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2182; local7++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt2172; local21++) {
				if (local7 == 0 || local21 == 0 || local7 >= this.anInt2182 - 5 || this.anInt2172 - 5 <= local21) {
					this.anIntArrayArray21[local7][local21] = 16777215;
				} else {
					this.anIntArrayArray21[local7][local21] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	public void method1669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = arg0 - this.anInt2180;
		@Pc(50) int local50 = arg1 - this.anInt2179;
		this.anIntArrayArray21[local50][local41] |= 0x200000;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIB)Z")
	public boolean method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 == arg2 && arg0 == arg1) {
			return true;
		}
		@Pc(22) int local22 = arg2 - this.anInt2179;
		@Pc(27) int local27 = arg0 - this.anInt2180;
		if (local22 < 0 || local22 >= this.anInt2182 || local27 < 0 || this.anInt2172 <= local27) {
			return false;
		}
		@Pc(54) int local54 = arg1 - this.anInt2180;
		@Pc(59) int local59 = arg3 - this.anInt2179;
		@Pc(66) int local66;
		if (local22 > local59) {
			local66 = local22 - local59;
		} else {
			local66 = local59 - local22;
		}
		@Pc(80) int local80;
		if (local27 <= local54) {
			local80 = local54 - local27;
		} else {
			local80 = local27 - local54;
		}
		@Pc(96) int local96;
		@Pc(98) int local98;
		if (local80 >= local66) {
			local96 = local66 * 65536 / local80;
			local98 = 32768;
			while (local27 != local54) {
				if (local54 < local27) {
					if ((this.anIntArrayArray21[local59][local54] & 0x2C0102) != 0) {
						return false;
					}
					local54++;
				} else if (local54 > local27) {
					if ((this.anIntArrayArray21[local59][local54] & 0x2C0120) != 0) {
						return false;
					}
					local54--;
				}
				local98 += local96;
				if (local98 >= 65536) {
					local98 -= 65536;
					if (local22 > local59) {
						if ((this.anIntArrayArray21[local59][local54] & 0x2C0108) != 0) {
							return false;
						}
						local59++;
					} else if (local59 > local22) {
						if ((this.anIntArrayArray21[local59][local54] & 0x2C0180) != 0) {
							return false;
						}
						local59--;
					}
				}
			}
		} else {
			local96 = local80 * 65536 / local66;
			local98 = 32768;
			while (local59 != local22) {
				if (local22 > local59) {
					if ((this.anIntArrayArray21[local59][local54] & 0x2C0108) != 0) {
						return false;
					}
					local59++;
				} else if (local22 < local59) {
					if ((this.anIntArrayArray21[local59][local54] & 0x2C0180) != 0) {
						return false;
					}
					local59--;
				}
				local98 += local96;
				if (local98 >= 65536) {
					local98 -= 65536;
					if (local27 > local54) {
						if ((this.anIntArrayArray21[local59][local54] & 0x2C0102) != 0) {
							return false;
						}
						local54++;
					} else if (local54 > local27) {
						if ((this.anIntArrayArray21[local59][local54] & 0x2C0120) != 0) {
							return false;
						}
						local54--;
					}
				}
			}
		}
		return (this.anIntArrayArray21[local22][local27] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZZII)V")
	public void method1671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2179;
		@Pc(13) int local13 = arg0 - this.anInt2180;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method1675(128, local13, local8);
				this.method1675(8, local13, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1675(2, local13, local8);
				this.method1675(32, local13 + 1, local8);
			}
			if (arg1 == 2) {
				this.method1675(8, local13, local8);
				this.method1675(128, local13, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1675(32, local13, local8);
				this.method1675(2, local13 - 1, local8);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method1675(1, local13, local8);
				this.method1675(16, local13 + 1, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1675(4, local13, local8);
				this.method1675(64, local13 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1675(16, local13, local8);
				this.method1675(1, local13 - 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1675(64, local13, local8);
				this.method1675(4, local13 - 1, local8 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method1675(130, local13, local8);
				this.method1675(8, local13, local8 - 1);
				this.method1675(32, local13 + 1, local8);
			}
			if (arg1 == 1) {
				this.method1675(10, local13, local8);
				this.method1675(32, local13 + 1, local8);
				this.method1675(128, local13, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1675(40, local13, local8);
				this.method1675(128, local13, local8 + 1);
				this.method1675(2, local13 - 1, local8);
			}
			if (arg1 == 3) {
				this.method1675(160, local13, local8);
				this.method1675(2, local13 - 1, local8);
				this.method1675(8, local13, local8 - 1);
			}
		}
		if (arg2) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method1675(65536, local13, local8);
					this.method1675(4096, local13, local8 - 1);
				}
				if (arg1 == 1) {
					this.method1675(1024, local13, local8);
					this.method1675(16384, local13 + 1, local8);
				}
				if (arg1 == 2) {
					this.method1675(4096, local13, local8);
					this.method1675(65536, local13, local8 + 1);
				}
				if (arg1 == 3) {
					this.method1675(16384, local13, local8);
					this.method1675(1024, local13 - 1, local8);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method1675(512, local13, local8);
					this.method1675(8192, local13 + 1, local8 + -1);
				}
				if (arg1 == 1) {
					this.method1675(2048, local13, local8);
					this.method1675(32768, local13 + 1, local8 + 1);
				}
				if (arg1 == 2) {
					this.method1675(8192, local13, local8);
					this.method1675(512, local13 - 1, local8 + 1);
				}
				if (arg1 == 3) {
					this.method1675(32768, local13, local8);
					this.method1675(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method1675(66560, local13, local8);
					this.method1675(4096, local13, local8 - 1);
					this.method1675(16384, local13 + 1, local8);
				}
				if (arg1 == 1) {
					this.method1675(5120, local13, local8);
					this.method1675(16384, local13 + 1, local8);
					this.method1675(65536, local13, local8 + 1);
				}
				if (arg1 == 2) {
					this.method1675(20480, local13, local8);
					this.method1675(65536, local13, local8 + 1);
					this.method1675(1024, local13 - 1, local8);
				}
				if (arg1 == 3) {
					this.method1675(81920, local13, local8);
					this.method1675(1024, local13 - 1, local8);
					this.method1675(4096, local13, local8 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method1675(536870912, local13, local8);
				this.method1675(33554432, local13, local8 - 1);
			}
			if (arg1 == 1) {
				this.method1675(8388608, local13, local8);
				this.method1675(134217728, local13 + 1, local8);
			}
			if (arg1 == 2) {
				this.method1675(33554432, local13, local8);
				this.method1675(536870912, local13, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1675(134217728, local13, local8);
				this.method1675(8388608, local13 - 1, local8);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method1675(4194304, local13, local8);
				this.method1675(67108864, local13 + 1, local8 + -1);
			}
			if (arg1 == 1) {
				this.method1675(16777216, local13, local8);
				this.method1675(268435456, local13 + 1, local8 - -1);
			}
			if (arg1 == 2) {
				this.method1675(67108864, local13, local8);
				this.method1675(4194304, local13 - 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method1675(268435456, local13, local8);
				this.method1675(16777216, local13 - 1, local8 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1675(545259520, local13, local8);
			this.method1675(33554432, local13, local8 - 1);
			this.method1675(134217728, local13 + 1, local8);
		}
		if (arg1 == 1) {
			this.method1675(41943040, local13, local8);
			this.method1675(134217728, local13 + 1, local8);
			this.method1675(536870912, local13, local8 + 1);
		}
		if (arg1 == 2) {
			this.method1675(167772160, local13, local8);
			this.method1675(536870912, local13, local8 + 1);
			this.method1675(8388608, local13 - 1, local8);
		}
		if (arg1 == 3) {
			this.method1675(671088640, local13, local8);
			this.method1675(8388608, local13 - 1, local8);
			this.method1675(33554432, local13, local8 - 1);
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)V")
	public void method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2179;
		@Pc(17) int local17 = arg0 - this.anInt2180;
		this.anIntArrayArray21[local8][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZIIIZI)V")
	public void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt2180;
		@Pc(9) int local9 = arg0 - this.anInt2179;
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method1665(local4, local9, 128);
				this.method1665(local4, local9 - 1, 8);
			}
			if (arg5 == 1) {
				this.method1665(local4, local9, 2);
				this.method1665(local4 + 1, local9, 32);
			}
			if (arg5 == 2) {
				this.method1665(local4, local9, 8);
				this.method1665(local4, local9 + 1, 128);
			}
			if (arg5 == 3) {
				this.method1665(local4, local9, 32);
				this.method1665(local4 - 1, local9, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method1665(local4, local9, 1);
				this.method1665(local4 + 1, local9 + -1, 16);
			}
			if (arg5 == 1) {
				this.method1665(local4, local9, 4);
				this.method1665(local4 + 1, local9 + 1, 64);
			}
			if (arg5 == 2) {
				this.method1665(local4, local9, 16);
				this.method1665(local4 - 1, local9 + 1, 1);
			}
			if (arg5 == 3) {
				this.method1665(local4, local9, 64);
				this.method1665(local4 - 1, local9 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				this.method1665(local4, local9, 130);
				this.method1665(local4, local9 - 1, 8);
				this.method1665(local4 + 1, local9, 32);
			}
			if (arg5 == 1) {
				this.method1665(local4, local9, 10);
				this.method1665(local4 + 1, local9, 32);
				this.method1665(local4, local9 + 1, 128);
			}
			if (arg5 == 2) {
				this.method1665(local4, local9, 40);
				this.method1665(local4, local9 + 1, 128);
				this.method1665(local4 - 1, local9, 2);
			}
			if (arg5 == 3) {
				this.method1665(local4, local9, 160);
				this.method1665(local4 - 1, local9, 2);
				this.method1665(local4, local9 - 1, 8);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					this.method1665(local4, local9, 65536);
					this.method1665(local4, local9 - 1, 4096);
				}
				if (arg5 == 1) {
					this.method1665(local4, local9, 1024);
					this.method1665(local4 + 1, local9, 16384);
				}
				if (arg5 == 2) {
					this.method1665(local4, local9, 4096);
					this.method1665(local4, local9 + 1, 65536);
				}
				if (arg5 == 3) {
					this.method1665(local4, local9, 16384);
					this.method1665(local4 - 1, local9, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg5 == 0) {
					this.method1665(local4, local9, 512);
					this.method1665(local4 + 1, local9 + -1, 8192);
				}
				if (arg5 == 1) {
					this.method1665(local4, local9, 2048);
					this.method1665(local4 + 1, local9 + 1, 32768);
				}
				if (arg5 == 2) {
					this.method1665(local4, local9, 8192);
					this.method1665(local4 - 1, local9 - -1, 512);
				}
				if (arg5 == 3) {
					this.method1665(local4, local9, 32768);
					this.method1665(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					this.method1665(local4, local9, 66560);
					this.method1665(local4, local9 - 1, 4096);
					this.method1665(local4 + 1, local9, 16384);
				}
				if (arg5 == 1) {
					this.method1665(local4, local9, 5120);
					this.method1665(local4 + 1, local9, 16384);
					this.method1665(local4, local9 + 1, 65536);
				}
				if (arg5 == 2) {
					this.method1665(local4, local9, 20480);
					this.method1665(local4, local9 + 1, 65536);
					this.method1665(local4 - 1, local9, 1024);
				}
				if (arg5 == 3) {
					this.method1665(local4, local9, 81920);
					this.method1665(local4 - 1, local9, 1024);
					this.method1665(local4, local9 - 1, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method1665(local4, local9, 536870912);
				this.method1665(local4, local9 - 1, 33554432);
			}
			if (arg5 == 1) {
				this.method1665(local4, local9, 8388608);
				this.method1665(local4 + 1, local9, 134217728);
			}
			if (arg5 == 2) {
				this.method1665(local4, local9, 33554432);
				this.method1665(local4, local9 + 1, 536870912);
			}
			if (arg5 == 3) {
				this.method1665(local4, local9, 134217728);
				this.method1665(local4 - 1, local9, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method1665(local4, local9, 4194304);
				this.method1665(local4 + 1, local9 + -1, 67108864);
			}
			if (arg5 == 1) {
				this.method1665(local4, local9, 16777216);
				this.method1665(local4 + 1, local9 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method1665(local4, local9, 67108864);
				this.method1665(local4 - 1, local9 + 1, 4194304);
			}
			if (arg5 == 3) {
				this.method1665(local4, local9, 268435456);
				this.method1665(local4 - 1, local9 - 1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method1665(local4, local9, 545259520);
			this.method1665(local4, local9 - 1, 33554432);
			this.method1665(local4 + 1, local9, 134217728);
		}
		if (arg5 == 1) {
			this.method1665(local4, local9, 41943040);
			this.method1665(local4 + 1, local9, 134217728);
			this.method1665(local4, local9 + 1, 536870912);
		}
		if (arg5 == 2) {
			this.method1665(local4, local9, 167772160);
			this.method1665(local4, local9 + 1, 536870912);
			this.method1665(local4 - 1, local9, 8388608);
		}
		if (arg5 == 3) {
			this.method1665(local4, local9, 671088640);
			this.method1665(local4 - 1, local9, 8388608);
			this.method1665(local4, local9 - 1, 33554432);
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)V")
	private void method1675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray21[arg2][arg1] &= ~arg0;
	}
}

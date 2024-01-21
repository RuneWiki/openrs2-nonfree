import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class47 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	private final int anInt2030;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	private final int anInt2040;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	private final int anInt2027;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
	private final int anInt2034;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[[I")
	public final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(II)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2030 = arg1;
		this.anInt2040 = 0;
		this.anInt2027 = 0;
		this.anInt2034 = arg0;
		this.anIntArrayArray20 = new int[this.anInt2034][this.anInt2030];
		this.method1458();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public void method1458() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2034; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2030; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt2034 - 1 || this.anInt2030 - 1 == local7) {
					this.anIntArrayArray20[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray20[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIII)V")
	public void method1459(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg2 - this.anInt2027;
		@Pc(13) int local13 = arg4 - this.anInt2040;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1460(local8, local13, 128);
				this.method1460(local8, local13 - 1, 8);
			}
			if (arg1 == 1) {
				this.method1460(local8, local13, 2);
				this.method1460(local8 + 1, local13, 32);
			}
			if (arg1 == 2) {
				this.method1460(local8, local13, 8);
				this.method1460(local8, local13 + 1, 128);
			}
			if (arg1 == 3) {
				this.method1460(local8, local13, 32);
				this.method1460(local8 - 1, local13, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1460(local8, local13, 1);
				this.method1460(local8 + 1, local13 + -1, 16);
			}
			if (arg1 == 1) {
				this.method1460(local8, local13, 4);
				this.method1460(local8 + 1, local13 + 1, 64);
			}
			if (arg1 == 2) {
				this.method1460(local8, local13, 16);
				this.method1460(local8 - 1, local13 + 1, 1);
			}
			if (arg1 == 3) {
				this.method1460(local8, local13, 64);
				this.method1460(local8 - 1, local13 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method1460(local8, local13, 130);
				this.method1460(local8, local13 - 1, 8);
				this.method1460(local8 + 1, local13, 32);
			}
			if (arg1 == 1) {
				this.method1460(local8, local13, 10);
				this.method1460(local8 + 1, local13, 32);
				this.method1460(local8, local13 + 1, 128);
			}
			if (arg1 == 2) {
				this.method1460(local8, local13, 40);
				this.method1460(local8, local13 + 1, 128);
				this.method1460(local8 - 1, local13, 2);
			}
			if (arg1 == 3) {
				this.method1460(local8, local13, 160);
				this.method1460(local8 - 1, local13, 2);
				this.method1460(local8, local13 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1460(local8, local13, 65536);
				this.method1460(local8, local13 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method1460(local8, local13, 1024);
				this.method1460(local8 + 1, local13, 16384);
			}
			if (arg1 == 2) {
				this.method1460(local8, local13, 4096);
				this.method1460(local8, local13 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method1460(local8, local13, 16384);
				this.method1460(local8 - 1, local13, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1460(local8, local13, 512);
				this.method1460(local8 + 1, local13 + -1, 8192);
			}
			if (arg1 == 1) {
				this.method1460(local8, local13, 2048);
				this.method1460(local8 + 1, local13 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method1460(local8, local13, 8192);
				this.method1460(local8 - 1, local13 + 1, 512);
			}
			if (arg1 == 3) {
				this.method1460(local8, local13, 32768);
				this.method1460(local8 - 1, local13 + -1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1460(local8, local13, 66560);
			this.method1460(local8, local13 - 1, 4096);
			this.method1460(local8 + 1, local13, 16384);
		}
		if (arg1 == 1) {
			this.method1460(local8, local13, 5120);
			this.method1460(local8 + 1, local13, 16384);
			this.method1460(local8, local13 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method1460(local8, local13, 20480);
			this.method1460(local8, local13 + 1, 65536);
			this.method1460(local8 - 1, local13, 1024);
		}
		if (arg1 == 3) {
			this.method1460(local8, local13, 81920);
			this.method1460(local8 - 1, local13, 1024);
			this.method1460(local8, local13 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBI)V")
	private void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIIIZ)V")
	public void method1461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg2 - this.anInt2040;
		@Pc(9) int local9 = arg1 - this.anInt2027;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1471(128, local4, local9);
				this.method1471(8, local4 - 1, local9);
			}
			if (arg3 == 1) {
				this.method1471(2, local4, local9);
				this.method1471(32, local4, local9 + 1);
			}
			if (arg3 == 2) {
				this.method1471(8, local4, local9);
				this.method1471(128, local4 + 1, local9);
			}
			if (arg3 == 3) {
				this.method1471(32, local4, local9);
				this.method1471(2, local4, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1471(1, local4, local9);
				this.method1471(16, local4 - 1, local9 + 1);
			}
			if (arg3 == 1) {
				this.method1471(4, local4, local9);
				this.method1471(64, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method1471(16, local4, local9);
				this.method1471(1, local4 + 1, local9 - 1);
			}
			if (arg3 == 3) {
				this.method1471(64, local4, local9);
				this.method1471(4, local4 - 1, local9 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method1471(130, local4, local9);
				this.method1471(8, local4 - 1, local9);
				this.method1471(32, local4, local9 + 1);
			}
			if (arg3 == 1) {
				this.method1471(10, local4, local9);
				this.method1471(32, local4, local9 + 1);
				this.method1471(128, local4 + 1, local9);
			}
			if (arg3 == 2) {
				this.method1471(40, local4, local9);
				this.method1471(128, local4 + 1, local9);
				this.method1471(2, local4, local9 - 1);
			}
			if (arg3 == 3) {
				this.method1471(160, local4, local9);
				this.method1471(2, local4, local9 - 1);
				this.method1471(8, local4 - 1, local9);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1471(65536, local4, local9);
				this.method1471(4096, local4 - 1, local9);
			}
			if (arg3 == 1) {
				this.method1471(1024, local4, local9);
				this.method1471(16384, local4, local9 + 1);
			}
			if (arg3 == 2) {
				this.method1471(4096, local4, local9);
				this.method1471(65536, local4 + 1, local9);
			}
			if (arg3 == 3) {
				this.method1471(16384, local4, local9);
				this.method1471(1024, local4, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1471(512, local4, local9);
				this.method1471(8192, local4 - 1, local9 - -1);
			}
			if (arg3 == 1) {
				this.method1471(2048, local4, local9);
				this.method1471(32768, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method1471(8192, local4, local9);
				this.method1471(512, local4 + 1, local9 + -1);
			}
			if (arg3 == 3) {
				this.method1471(32768, local4, local9);
				this.method1471(2048, local4 - 1, local9 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1471(66560, local4, local9);
			this.method1471(4096, local4 - 1, local9);
			this.method1471(16384, local4, local9 + 1);
		}
		if (arg3 == 1) {
			this.method1471(5120, local4, local9);
			this.method1471(16384, local4, local9 + 1);
			this.method1471(65536, local4 + 1, local9);
		}
		if (arg3 == 2) {
			this.method1471(20480, local4, local9);
			this.method1471(65536, local4 + 1, local9);
			this.method1471(1024, local4, local9 - 1);
		}
		if (arg3 == 3) {
			this.method1471(81920, local4, local9);
			this.method1471(1024, local4, local9 - 1);
			this.method1471(4096, local4 - 1, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIBII)Z")
	public boolean method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg5 && arg2 == arg1) {
			return true;
		}
		@Pc(16) int local16 = arg1 - this.anInt2027;
		@Pc(21) int local21 = arg3 - this.anInt2040;
		@Pc(26) int local26 = arg5 - this.anInt2040;
		@Pc(36) int local36 = arg2 - this.anInt2027;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local26 == local21 + 1 && local36 == local16 && (this.anIntArrayArray20[local26][local16] & 0x80) == 0) {
					return true;
				}
				if (local26 == local21 && local36 - 1 == local16 && (this.anIntArrayArray20[local26][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local21 - 1 == local26 && local36 == local16 && (this.anIntArrayArray20[local26][local16] & 0x8) == 0) {
					return true;
				}
				if (local26 == local21 && local36 - 1 == local16 && (this.anIntArrayArray20[local26][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local21 - 1 == local26 && local16 == local36 && (this.anIntArrayArray20[local26][local16] & 0x8) == 0) {
					return true;
				}
				if (local21 == local26 && local16 == local36 + 1 && (this.anIntArrayArray20[local26][local16] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local21 + 1 == local26 && local36 == local16 && (this.anIntArrayArray20[local26][local16] & 0x80) == 0) {
					return true;
				}
				if (local21 == local26 && local16 == local36 + 1 && (this.anIntArrayArray20[local26][local16] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local21 == local26 && local16 == local36 + 1 && (this.anIntArrayArray20[local26][local16] & 0x20) == 0) {
				return true;
			}
			if (local21 == local26 && local16 == local36 - 1 && (this.anIntArrayArray20[local26][local16] & 0x2) == 0) {
				return true;
			}
			if (local26 == local21 - 1 && local36 == local16 && (this.anIntArrayArray20[local26][local16] & 0x8) == 0) {
				return true;
			}
			if (local21 + 1 == local26 && local16 == local36 && (this.anIntArrayArray20[local26][local16] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt2027;
		@Pc(17) int local17 = arg1 - this.anInt2040;
		this.anIntArrayArray20[local17][local12] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBIZI)V")
	public void method1466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt2027;
		@Pc(9) int local9 = arg5 - this.anInt2040;
		@Pc(11) int local11 = 256;
		@Pc(31) int local31;
		if (arg1 == 1 || arg1 == 3) {
			local31 = arg3;
			arg3 = arg0;
			arg0 = local31;
		}
		if (arg4) {
			local11 = 131328;
		}
		for (local31 = local9; local31 < local9 + arg3; local31++) {
			if (local31 >= 0 && this.anInt2034 > local31) {
				for (@Pc(55) int local55 = local4; local55 < arg0 + local4; local55++) {
					if (local55 >= 0 && local55 < this.anInt2030) {
						this.method1460(local55, local31, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIIIII)V")
	public void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2027;
		@Pc(10) int local10 = 256;
		@Pc(20) int local20;
		if (arg2 == 1 || arg2 == 3) {
			local20 = arg3;
			arg3 = arg0;
			arg0 = local20;
		}
		@Pc(29) int local29 = arg5 - this.anInt2040;
		if (arg1) {
			local10 = 131328;
		}
		for (local20 = local29; local20 < local29 + arg3; local20++) {
			if (local20 >= 0 && this.anInt2034 > local20) {
				for (@Pc(65) int local65 = local8; local65 < local8 + arg0; local65++) {
					if (local65 >= 0 && this.anInt2030 > local65) {
						this.method1471(local10, local20, local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method1468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = arg6 + arg3 - 1;
		@Pc(25) int local25 = arg1 + arg5 - 1;
		if (arg2 >= arg6 && arg2 <= local19 && arg5 <= arg0 && arg0 <= local25) {
			return true;
		} else if (arg2 == arg6 - 1 && arg5 <= arg0 && local25 >= arg0 && (this.anIntArrayArray20[arg2 - this.anInt2040][arg0 - this.anInt2027] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg2 == local19 + 1 && arg5 <= arg0 && arg0 <= local25 && (this.anIntArrayArray20[arg2 - this.anInt2040][arg0 - this.anInt2027] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg0 && arg6 <= arg2 && arg2 <= local19 && (this.anIntArrayArray20[arg2 - this.anInt2040][arg0 - this.anInt2027] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local25 + 1 == arg0 && arg2 >= arg6 && arg2 <= local19 && (this.anIntArrayArray20[arg2 - this.anInt2040][arg0 - this.anInt2027] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
	public void method1470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2027;
		@Pc(9) int local9 = arg0 - this.anInt2040;
		this.anIntArrayArray20[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZII)V")
	private void method1471(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg1][arg2] &= 16777215 - arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIIII)Z")
	public boolean method1472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg0 && arg2 == arg1) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt2040;
		@Pc(25) int local25 = arg0 - this.anInt2040;
		@Pc(30) int local30 = arg2 - this.anInt2027;
		@Pc(35) int local35 = arg1 - this.anInt2027;
		if (arg3 == 0) {
			if (arg4 == 0) {
				if (local25 - 1 == local20 && local35 == local30) {
					return true;
				}
				if (local25 == local20 && local30 == local35 + 1 && (this.anIntArrayArray20[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 && local35 - 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local20 == local25 && local30 == local35 + 1) {
					return true;
				}
				if (local25 - 1 == local20 && local30 == local35 && (this.anIntArrayArray20[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local35 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local20 == local25 + 1 && local30 == local35) {
					return true;
				}
				if (local25 == local20 && local35 + 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 && local35 - 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local20 == local25 && local30 == local35 - 1) {
					return true;
				}
				if (local20 == local25 - 1 && local30 == local35 && (this.anIntArrayArray20[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local35 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				if (local25 - 1 == local20 && local35 == local30) {
					return true;
				}
				if (local20 == local25 && local30 == local35 + 1) {
					return true;
				}
				if (local20 == local25 + 1 && local35 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280180) == 0) {
					return true;
				}
				if (local20 == local25 && local35 - 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local25 - 1 == local20 && local30 == local35 && (this.anIntArrayArray20[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local20 && local35 + 1 == local30) {
					return true;
				}
				if (local25 + 1 == local20 && local30 == local35) {
					return true;
				}
				if (local20 == local25 && local30 == local35 - 1 && (this.anIntArrayArray20[local20][local30] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local20 == local25 - 1 && local30 == local35 && (this.anIntArrayArray20[local20][local30] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local20 && local35 + 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local35 == local30) {
					return true;
				}
				if (local25 == local20 && local35 - 1 == local30) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local20 == local25 - 1 && local35 == local30) {
					return true;
				}
				if (local25 == local20 && local35 + 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280120) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local35 == local30 && (this.anIntArrayArray20[local20][local30] & 0x1280180) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local35 - 1) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local25 == local20 && local30 == local35 + 1 && (this.anIntArrayArray20[local20][local30] & 0x20) == 0) {
				return true;
			}
			if (local25 == local20 && local35 - 1 == local30 && (this.anIntArrayArray20[local20][local30] & 0x2) == 0) {
				return true;
			}
			if (local20 == local25 - 1 && local30 == local35 && (this.anIntArrayArray20[local20][local30] & 0x8) == 0) {
				return true;
			}
			if (local20 == local25 + 1 && local30 == local35 && (this.anIntArrayArray20[local20][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

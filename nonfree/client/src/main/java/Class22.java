import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class22 {

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	private final int anInt931 = 0;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	private final int anInt925;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	private final int anInt938;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	private final int anInt936;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt925 = arg0;
		this.anInt938 = 0;
		this.anInt936 = arg1;
		this.anIntArrayArray4 = new int[this.anInt925][this.anInt936];
		this.method738();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZI)V")
	public void method724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt938;
		@Pc(9) int local9 = arg0 - this.anInt931;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method739(local9, 128, local4);
				this.method739(local9 - 1, 8, local4);
			}
			if (arg1 == 1) {
				this.method739(local9, 2, local4);
				this.method739(local9, 32, local4 + 1);
			}
			if (arg1 == 2) {
				this.method739(local9, 8, local4);
				this.method739(local9 + 1, 128, local4);
			}
			if (arg1 == 3) {
				this.method739(local9, 32, local4);
				this.method739(local9, 2, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method739(local9, 1, local4);
				this.method739(local9 - 1, 16, local4 + 1);
			}
			if (arg1 == 1) {
				this.method739(local9, 4, local4);
				this.method739(local9 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method739(local9, 16, local4);
				this.method739(local9 + 1, 1, local4 - 1);
			}
			if (arg1 == 3) {
				this.method739(local9, 64, local4);
				this.method739(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method739(local9, 130, local4);
				this.method739(local9 - 1, 8, local4);
				this.method739(local9, 32, local4 + 1);
			}
			if (arg1 == 1) {
				this.method739(local9, 10, local4);
				this.method739(local9, 32, local4 + 1);
				this.method739(local9 + 1, 128, local4);
			}
			if (arg1 == 2) {
				this.method739(local9, 40, local4);
				this.method739(local9 + 1, 128, local4);
				this.method739(local9, 2, local4 - 1);
			}
			if (arg1 == 3) {
				this.method739(local9, 160, local4);
				this.method739(local9, 2, local4 - 1);
				this.method739(local9 - 1, 8, local4);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method739(local9, 65536, local4);
				this.method739(local9 - 1, 4096, local4);
			}
			if (arg1 == 1) {
				this.method739(local9, 1024, local4);
				this.method739(local9, 16384, local4 + 1);
			}
			if (arg1 == 2) {
				this.method739(local9, 4096, local4);
				this.method739(local9 + 1, 65536, local4);
			}
			if (arg1 == 3) {
				this.method739(local9, 16384, local4);
				this.method739(local9, 1024, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method739(local9, 512, local4);
				this.method739(local9 - 1, 8192, local4 + 1);
			}
			if (arg1 == 1) {
				this.method739(local9, 2048, local4);
				this.method739(local9 + 1, 32768, local4 + 1);
			}
			if (arg1 == 2) {
				this.method739(local9, 8192, local4);
				this.method739(local9 + 1, 512, local4 - 1);
			}
			if (arg1 == 3) {
				this.method739(local9, 32768, local4);
				this.method739(local9 - 1, 2048, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method739(local9, 66560, local4);
			this.method739(local9 - 1, 4096, local4);
			this.method739(local9, 16384, local4 + 1);
		}
		if (arg1 == 1) {
			this.method739(local9, 5120, local4);
			this.method739(local9, 16384, local4 + 1);
			this.method739(local9 + 1, 65536, local4);
		}
		if (arg1 == 2) {
			this.method739(local9, 20480, local4);
			this.method739(local9 + 1, 65536, local4);
			this.method739(local9, 1024, local4 - 1);
		}
		if (arg1 == 3) {
			this.method739(local9, 81920, local4);
			this.method739(local9, 1024, local4 - 1);
			this.method739(local9 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg3 + arg1 - 1;
		@Pc(24) int local24 = arg5 + arg2 - 1;
		if (arg1 <= arg4 && local5 >= arg4 && arg0 >= arg2 && arg0 <= local24) {
			return true;
		} else if (arg1 - 1 == arg4 && arg0 >= arg2 && local24 >= arg0 && (this.anIntArrayArray4[arg4 - this.anInt931][arg0 - this.anInt938] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg4 == local5 + 1 && arg0 >= arg2 && arg0 <= local24 && (this.anIntArrayArray4[arg4 - this.anInt931][arg0 - this.anInt938] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg0 && arg1 <= arg4 && local5 >= arg4 && (this.anIntArrayArray4[arg4 - this.anInt931][arg0 - this.anInt938] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local24 + 1 == arg0 && arg1 <= arg4 && local5 >= arg4 && (this.anIntArrayArray4[arg4 - this.anInt931][arg0 - this.anInt938] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == arg0 && arg1 == arg2) {
			return true;
		}
		@Pc(20) int local20 = arg0 - this.anInt931;
		@Pc(25) int local25 = arg4 - this.anInt931;
		@Pc(30) int local30 = arg2 - this.anInt938;
		@Pc(40) int local40 = arg1 - this.anInt938;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local20 == local25 + 1 && local30 == local40 && (this.anIntArrayArray4[local20][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local20 && local40 - 1 == local30 && (this.anIntArrayArray4[local20][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local25 - 1 == local20 && local30 == local40 && (this.anIntArrayArray4[local20][local30] & 0x8) == 0) {
					return true;
				}
				if (local25 == local20 && local40 - 1 == local30 && (this.anIntArrayArray4[local20][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local25 - 1 == local20 && local30 == local40 && (this.anIntArrayArray4[local20][local30] & 0x8) == 0) {
					return true;
				}
				if (local25 == local20 && local40 + 1 == local30 && (this.anIntArrayArray4[local20][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local25 + 1 == local20 && local40 == local30 && (this.anIntArrayArray4[local20][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local40 + 1 && (this.anIntArrayArray4[local20][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local20 == local25 && local30 == local40 + 1 && (this.anIntArrayArray4[local20][local30] & 0x20) == 0) {
				return true;
			}
			if (local25 == local20 && local30 == local40 - 1 && (this.anIntArrayArray4[local20][local30] & 0x2) == 0) {
				return true;
			}
			if (local25 - 1 == local20 && local30 == local40 && (this.anIntArrayArray4[local20][local30] & 0x8) == 0) {
				return true;
			}
			if (local25 + 1 == local20 && local40 == local30 && (this.anIntArrayArray4[local20][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public void method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - this.anInt931;
		@Pc(18) int local18 = arg1 - this.anInt938;
		this.anIntArrayArray4[local13][local18] |= 0x200000;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZBIIII)V")
	public void method729(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - this.anInt931;
		@Pc(15) int local15 = arg1 - this.anInt938;
		@Pc(21) int local21 = 256;
		if (arg0) {
			local21 = 131328;
		}
		for (@Pc(29) int local29 = local10; local29 < local10 + arg3; local29++) {
			if (local29 >= 0 && local29 < this.anInt925) {
				for (@Pc(43) int local43 = local15; local43 < local15 + arg2; local43++) {
					if (local43 >= 0 && this.anInt936 > local43) {
						this.method730(local43, local21, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	private void method730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray4[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
	public void method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt931;
		@Pc(27) int local27 = arg0 - this.anInt938;
		this.anIntArrayArray4[local8][local27] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIIII)V")
	public void method734(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt938;
		@Pc(13) int local13 = arg3 - this.anInt931;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method730(local4, 128, local13);
				this.method730(local4, 8, local13 - 1);
			}
			if (arg2 == 1) {
				this.method730(local4, 2, local13);
				this.method730(local4 + 1, 32, local13);
			}
			if (arg2 == 2) {
				this.method730(local4, 8, local13);
				this.method730(local4, 128, local13 + 1);
			}
			if (arg2 == 3) {
				this.method730(local4, 32, local13);
				this.method730(local4 - 1, 2, local13);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method730(local4, 1, local13);
				this.method730(local4 + 1, 16, local13 - 1);
			}
			if (arg2 == 1) {
				this.method730(local4, 4, local13);
				this.method730(local4 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method730(local4, 16, local13);
				this.method730(local4 - 1, 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method730(local4, 64, local13);
				this.method730(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method730(local4, 130, local13);
				this.method730(local4, 8, local13 - 1);
				this.method730(local4 + 1, 32, local13);
			}
			if (arg2 == 1) {
				this.method730(local4, 10, local13);
				this.method730(local4 + 1, 32, local13);
				this.method730(local4, 128, local13 + 1);
			}
			if (arg2 == 2) {
				this.method730(local4, 40, local13);
				this.method730(local4, 128, local13 + 1);
				this.method730(local4 - 1, 2, local13);
			}
			if (arg2 == 3) {
				this.method730(local4, 160, local13);
				this.method730(local4 - 1, 2, local13);
				this.method730(local4, 8, local13 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method730(local4, 65536, local13);
				this.method730(local4, 4096, local13 - 1);
			}
			if (arg2 == 1) {
				this.method730(local4, 1024, local13);
				this.method730(local4 + 1, 16384, local13);
			}
			if (arg2 == 2) {
				this.method730(local4, 4096, local13);
				this.method730(local4, 65536, local13 + 1);
			}
			if (arg2 == 3) {
				this.method730(local4, 16384, local13);
				this.method730(local4 - 1, 1024, local13);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method730(local4, 512, local13);
				this.method730(local4 + 1, 8192, local13 - 1);
			}
			if (arg2 == 1) {
				this.method730(local4, 2048, local13);
				this.method730(local4 + 1, 32768, local13 + 1);
			}
			if (arg2 == 2) {
				this.method730(local4, 8192, local13);
				this.method730(local4 - 1, 512, local13 + 1);
			}
			if (arg2 == 3) {
				this.method730(local4, 32768, local13);
				this.method730(local4 - 1, 2048, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method730(local4, 66560, local13);
			this.method730(local4, 4096, local13 - 1);
			this.method730(local4 + 1, 16384, local13);
		}
		if (arg2 == 1) {
			this.method730(local4, 5120, local13);
			this.method730(local4 + 1, 16384, local13);
			this.method730(local4, 65536, local13 + 1);
		}
		if (arg2 == 2) {
			this.method730(local4, 20480, local13);
			this.method730(local4, 65536, local13 + 1);
			this.method730(local4 - 1, 1024, local13);
		}
		if (arg2 == 3) {
			this.method730(local4, 81920, local13);
			this.method730(local4 - 1, 1024, local13);
			this.method730(local4, 4096, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIZII)V")
	public void method735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg1 - this.anInt931;
		@Pc(11) int local11 = arg2 - this.anInt938;
		@Pc(17) int local17 = 256;
		if (arg3) {
			local17 = 131328;
		}
		@Pc(33) int local33;
		if (arg5 == 1 || arg5 == 3) {
			local33 = arg4;
			arg4 = arg0;
			arg0 = local33;
		}
		for (local33 = local6; local33 < local6 + arg4; local33++) {
			if (local33 >= 0 && local33 < this.anInt925) {
				for (@Pc(51) int local51 = local11; local51 < local11 + arg0; local51++) {
					if (local51 >= 0 && local51 < this.anInt936) {
						this.method739(local33, local17, local51);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg1 && arg0 == arg5) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt938;
		@Pc(25) int local25 = arg0 - this.anInt938;
		@Pc(30) int local30 = arg1 - this.anInt931;
		@Pc(35) int local35 = arg4 - this.anInt931;
		if (arg2 == 0) {
			if (arg3 == 0) {
				if (local30 - 1 == local35 && local20 == local25) {
					return true;
				}
				if (local35 == local30 && local20 + 1 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local35 && local20 - 1 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 == local35 && local20 + 1 == local25) {
					return true;
				}
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local30 + 1 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local30 + 1 == local35 && local20 == local25) {
					return true;
				}
				if (local35 == local30 && local20 + 1 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local30 && local20 - 1 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local30 == local35 && local20 - 1 == local25) {
					return true;
				}
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local30 + 1 && local25 == local20 && (this.anIntArrayArray4[local35][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				if (local30 - 1 == local35 && local20 == local25) {
					return true;
				}
				if (local35 == local30 && local25 == local20 + 1) {
					return true;
				}
				if (local30 + 1 == local35 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local35 == local30 && local25 == local20 - 1 && (this.anIntArrayArray4[local35][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local30 && local20 + 1 == local25) {
					return true;
				}
				if (local35 == local30 + 1 && local20 == local25) {
					return true;
				}
				if (local30 == local35 && local25 == local20 - 1 && (this.anIntArrayArray4[local35][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local30 - 1 == local35 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local35 && local25 == local20 + 1 && (this.anIntArrayArray4[local35][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local30 + 1 && local20 == local25) {
					return true;
				}
				if (local30 == local35 && local20 - 1 == local25) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local30 - 1 == local35 && local25 == local20) {
					return true;
				}
				if (local35 == local30 && local25 == local20 + 1 && (this.anIntArrayArray4[local35][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local30 + 1 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local35 == local30 && local25 == local20 - 1) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local35 == local30 && local25 == local20 + 1 && (this.anIntArrayArray4[local35][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local35 && local25 == local20 - 1 && (this.anIntArrayArray4[local35][local25] & 0x2) == 0) {
				return true;
			}
			if (local35 == local30 - 1 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local35 && local20 == local25 && (this.anIntArrayArray4[local35][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)V")
	public void method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt931;
		@Pc(19) int local19 = arg1 - this.anInt938;
		this.anIntArrayArray4[local14][local19] |= 0x40000;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	public void method738() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt925; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt936; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt925 - 5 || local11 >= this.anInt936 - 5) {
					this.anIntArrayArray4[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray4[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIII)V")
	private void method739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray4[arg0][arg2] &= ~arg1;
	}
}

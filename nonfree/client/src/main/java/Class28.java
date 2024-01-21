import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class28 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	private final int anInt1089 = 0;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	private final int anInt1102;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
	private final int anInt1092;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	private final int anInt1090;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1102 = arg1;
		this.anInt1092 = arg0;
		this.anIntArrayArray28 = new int[this.anInt1092][this.anInt1102];
		this.anInt1090 = 0;
		this.method610();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIZ)V")
	public void method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1089;
		@Pc(16) int local16 = arg1 - this.anInt1090;
		this.anIntArrayArray28[local16][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3 + arg5 - 1;
		@Pc(15) int local15 = arg4 + arg2 - 1;
		if (arg2 <= arg1 && local15 >= arg1 && arg6 >= arg3 && local9 >= arg6) {
			return true;
		} else if (arg2 - 1 == arg1 && arg3 <= arg6 && arg6 <= local9 && (this.anIntArrayArray28[arg1 - this.anInt1090][arg6 - this.anInt1089] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg1 == local15 + 1 && arg6 >= arg3 && local9 >= arg6 && (this.anIntArrayArray28[arg1 - this.anInt1090][arg6 - this.anInt1089] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg3 - 1 && arg1 >= arg2 && arg1 <= local15 && (this.anIntArrayArray28[arg1 - this.anInt1090][arg6 - this.anInt1089] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local9 + 1 && arg1 >= arg2 && arg1 <= local15 && (this.anIntArrayArray28[arg1 - this.anInt1090][arg6 - this.anInt1089] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	public void method601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1090;
		@Pc(13) int local13 = arg0 - this.anInt1089;
		this.anIntArrayArray28[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIBII)Z")
	public boolean method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg4 && arg3 == arg0) {
			return true;
		}
		@Pc(16) int local16 = arg3 - this.anInt1089;
		@Pc(30) int local30 = arg0 - this.anInt1089;
		@Pc(35) int local35 = arg5 - this.anInt1090;
		@Pc(40) int local40 = arg4 - this.anInt1090;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local40 + 1 == local35 && local16 == local30 && (this.anIntArrayArray28[local35][local30] & 0x80) == 0) {
					return true;
				}
				if (local35 == local40 && local16 - 1 == local30 && (this.anIntArrayArray28[local35][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local40 - 1 == local35 && local16 == local30 && (this.anIntArrayArray28[local35][local30] & 0x8) == 0) {
					return true;
				}
				if (local40 == local35 && local30 == local16 - 1 && (this.anIntArrayArray28[local35][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local40 - 1 == local35 && local30 == local16 && (this.anIntArrayArray28[local35][local30] & 0x8) == 0) {
					return true;
				}
				if (local35 == local40 && local16 + 1 == local30 && (this.anIntArrayArray28[local35][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local35 == local40 + 1 && local16 == local30 && (this.anIntArrayArray28[local35][local30] & 0x80) == 0) {
					return true;
				}
				if (local40 == local35 && local16 + 1 == local30 && (this.anIntArrayArray28[local35][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local40 == local35 && local30 == local16 + 1 && (this.anIntArrayArray28[local35][local30] & 0x20) == 0) {
				return true;
			}
			if (local40 == local35 && local30 == local16 - 1 && (this.anIntArrayArray28[local35][local30] & 0x2) == 0) {
				return true;
			}
			if (local35 == local40 - 1 && local16 == local30 && (this.anIntArrayArray28[local35][local30] & 0x8) == 0) {
				return true;
			}
			if (local35 == local40 + 1 && local30 == local16 && (this.anIntArrayArray28[local35][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIIZ)V")
	public void method603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg3 - this.anInt1090;
		@Pc(13) int local13 = arg0 - this.anInt1089;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method614(local13, 128, local4);
				this.method614(local13, 8, local4 - 1);
			}
			if (arg1 == 1) {
				this.method614(local13, 2, local4);
				this.method614(local13 + 1, 32, local4);
			}
			if (arg1 == 2) {
				this.method614(local13, 8, local4);
				this.method614(local13, 128, local4 + 1);
			}
			if (arg1 == 3) {
				this.method614(local13, 32, local4);
				this.method614(local13 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method614(local13, 1, local4);
				this.method614(local13 + 1, 16, local4 - 1);
			}
			if (arg1 == 1) {
				this.method614(local13, 4, local4);
				this.method614(local13 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method614(local13, 16, local4);
				this.method614(local13 - 1, 1, local4 + 1);
			}
			if (arg1 == 3) {
				this.method614(local13, 64, local4);
				this.method614(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method614(local13, 130, local4);
				this.method614(local13, 8, local4 - 1);
				this.method614(local13 + 1, 32, local4);
			}
			if (arg1 == 1) {
				this.method614(local13, 10, local4);
				this.method614(local13 + 1, 32, local4);
				this.method614(local13, 128, local4 + 1);
			}
			if (arg1 == 2) {
				this.method614(local13, 40, local4);
				this.method614(local13, 128, local4 + 1);
				this.method614(local13 - 1, 2, local4);
			}
			if (arg1 == 3) {
				this.method614(local13, 160, local4);
				this.method614(local13 - 1, 2, local4);
				this.method614(local13, 8, local4 - 1);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method614(local13, 65536, local4);
				this.method614(local13, 4096, local4 - 1);
			}
			if (arg1 == 1) {
				this.method614(local13, 1024, local4);
				this.method614(local13 + 1, 16384, local4);
			}
			if (arg1 == 2) {
				this.method614(local13, 4096, local4);
				this.method614(local13, 65536, local4 + 1);
			}
			if (arg1 == 3) {
				this.method614(local13, 16384, local4);
				this.method614(local13 - 1, 1024, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method614(local13, 512, local4);
				this.method614(local13 + 1, 8192, local4 - 1);
			}
			if (arg1 == 1) {
				this.method614(local13, 2048, local4);
				this.method614(local13 + 1, 32768, local4 + 1);
			}
			if (arg1 == 2) {
				this.method614(local13, 8192, local4);
				this.method614(local13 - 1, 512, local4 + 1);
			}
			if (arg1 == 3) {
				this.method614(local13, 32768, local4);
				this.method614(local13 - 1, 2048, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method614(local13, 66560, local4);
			this.method614(local13, 4096, local4 - 1);
			this.method614(local13 + 1, 16384, local4);
		}
		if (arg1 == 1) {
			this.method614(local13, 5120, local4);
			this.method614(local13 + 1, 16384, local4);
			this.method614(local13, 65536, local4 + 1);
		}
		if (arg1 == 2) {
			this.method614(local13, 20480, local4);
			this.method614(local13, 65536, local4 + 1);
			this.method614(local13 - 1, 1024, local4);
		}
		if (arg1 == 3) {
			this.method614(local13, 81920, local4);
			this.method614(local13 - 1, 1024, local4);
			this.method614(local13, 4096, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)V")
	public void method605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1090;
		@Pc(9) int local9 = arg0 - this.anInt1089;
		this.anIntArrayArray28[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZZI)V")
	public void method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 256;
		@Pc(8) int local8 = arg0 - this.anInt1089;
		@Pc(20) int local20;
		if (arg5 == 1 || arg5 == 3) {
			local20 = arg2;
			arg2 = arg1;
			arg1 = local20;
		}
		@Pc(29) int local29 = arg3 - this.anInt1090;
		if (arg4) {
			local3 = 131328;
		}
		for (local20 = local29; local20 < arg2 + local29; local20++) {
			if (local20 >= 0 && this.anInt1092 > local20) {
				for (@Pc(60) int local60 = local8; local60 < arg1 + local8; local60++) {
					if (local60 >= 0 && this.anInt1102 > local60) {
						this.method614(local60, local3, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray28[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIZ)V")
	public void method609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(6) int local6 = arg2 - this.anInt1090;
		@Pc(19) int local19 = arg0 - this.anInt1089;
		@Pc(21) int local21 = 256;
		if (arg4) {
			local21 = 131328;
		}
		for (@Pc(29) int local29 = local6; local29 < arg3 + local6; local29++) {
			if (local29 >= 0 && this.anInt1092 > local29) {
				for (@Pc(42) int local42 = local19; local42 < arg1 + local19; local42++) {
					if (local42 >= 0 && local42 < this.anInt1102) {
						this.method608(local29, local42, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method610() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1092; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1102; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt1092 - 5 || local11 >= this.anInt1102 - 5) {
					this.anIntArrayArray28[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray28[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIBI)Z")
	public boolean method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg3 && arg0 == arg5) {
			return true;
		}
		@Pc(20) int local20 = arg0 - this.anInt1089;
		@Pc(25) int local25 = arg3 - this.anInt1090;
		@Pc(30) int local30 = arg2 - this.anInt1090;
		@Pc(35) int local35 = arg5 - this.anInt1089;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local35 + 1 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local20 == local35 - 1 && (this.anIntArrayArray28[local25][local20] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local25 == local30 && local35 + 1 == local20) {
					return true;
				}
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local30 + 1 == local25 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local20 == local35 + 1 && (this.anIntArrayArray28[local25][local20] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local20 == local35 - 1 && (this.anIntArrayArray28[local25][local20] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local25 == local30 && local35 - 1 == local20) {
					return true;
				}
				if (local30 - 1 == local25 && local20 == local35 && (this.anIntArrayArray28[local25][local20] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local20 == local35 + 1) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35 && (this.anIntArrayArray28[local25][local20] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local25 && local20 == local35 - 1 && (this.anIntArrayArray28[local25][local20] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 && local20 == local35 + 1) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local30 - 1 && local35 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 && local35 + 1 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local35 - 1 == local20) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local30 - 1 == local25 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local35 + 1 == local20 && (this.anIntArrayArray28[local25][local20] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local20 == local35 && (this.anIntArrayArray28[local25][local20] & 0x12C0180) == 0) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local20) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local30 == local25 && local35 + 1 == local20 && (this.anIntArrayArray28[local25][local20] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local35 - 1 == local20 && (this.anIntArrayArray28[local25][local20] & 0x2) == 0) {
				return true;
			}
			if (local25 == local30 - 1 && local35 == local20 && (this.anIntArrayArray28[local25][local20] & 0x8) == 0) {
				return true;
			}
			if (local25 == local30 + 1 && local20 == local35 && (this.anIntArrayArray28[local25][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIIB)V")
	public void method613(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt1089;
		@Pc(13) int local13 = arg3 - this.anInt1090;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method608(local13, local4, 128);
				this.method608(local13 - 1, local4, 8);
			}
			if (arg1 == 1) {
				this.method608(local13, local4, 2);
				this.method608(local13, local4 + 1, 32);
			}
			if (arg1 == 2) {
				this.method608(local13, local4, 8);
				this.method608(local13 + 1, local4, 128);
			}
			if (arg1 == 3) {
				this.method608(local13, local4, 32);
				this.method608(local13, local4 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method608(local13, local4, 1);
				this.method608(local13 - 1, local4 + 1, 16);
			}
			if (arg1 == 1) {
				this.method608(local13, local4, 4);
				this.method608(local13 + 1, local4 + 1, 64);
			}
			if (arg1 == 2) {
				this.method608(local13, local4, 16);
				this.method608(local13 + 1, local4 + -1, 1);
			}
			if (arg1 == 3) {
				this.method608(local13, local4, 64);
				this.method608(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method608(local13, local4, 130);
				this.method608(local13 - 1, local4, 8);
				this.method608(local13, local4 + 1, 32);
			}
			if (arg1 == 1) {
				this.method608(local13, local4, 10);
				this.method608(local13, local4 + 1, 32);
				this.method608(local13 + 1, local4, 128);
			}
			if (arg1 == 2) {
				this.method608(local13, local4, 40);
				this.method608(local13 + 1, local4, 128);
				this.method608(local13, local4 - 1, 2);
			}
			if (arg1 == 3) {
				this.method608(local13, local4, 160);
				this.method608(local13, local4 - 1, 2);
				this.method608(local13 - 1, local4, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method608(local13, local4, 65536);
				this.method608(local13 - 1, local4, 4096);
			}
			if (arg1 == 1) {
				this.method608(local13, local4, 1024);
				this.method608(local13, local4 + 1, 16384);
			}
			if (arg1 == 2) {
				this.method608(local13, local4, 4096);
				this.method608(local13 + 1, local4, 65536);
			}
			if (arg1 == 3) {
				this.method608(local13, local4, 16384);
				this.method608(local13, local4 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method608(local13, local4, 512);
				this.method608(local13 - 1, local4 + 1, 8192);
			}
			if (arg1 == 1) {
				this.method608(local13, local4, 2048);
				this.method608(local13 + 1, local4 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method608(local13, local4, 8192);
				this.method608(local13 + 1, local4 + -1, 512);
			}
			if (arg1 == 3) {
				this.method608(local13, local4, 32768);
				this.method608(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method608(local13, local4, 66560);
			this.method608(local13 - 1, local4, 4096);
			this.method608(local13, local4 + 1, 16384);
		}
		if (arg1 == 1) {
			this.method608(local13, local4, 5120);
			this.method608(local13, local4 + 1, 16384);
			this.method608(local13 + 1, local4, 65536);
		}
		if (arg1 == 2) {
			this.method608(local13, local4, 20480);
			this.method608(local13 + 1, local4, 65536);
			this.method608(local13, local4 - 1, 1024);
		}
		if (arg1 == 3) {
			this.method608(local13, local4, 81920);
			this.method608(local13, local4 - 1, 1024);
			this.method608(local13 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBII)V")
	private void method614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray28[arg2][arg0] &= ~arg1;
	}
}

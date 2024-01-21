import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class46 {

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	private final int anInt1500 = 0;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	private final int anInt1493;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	private final int anInt1489;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	private final int anInt1492;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1493 = arg1;
		this.anInt1489 = arg0;
		this.anIntArrayArray13 = new int[this.anInt1489][this.anInt1493];
		this.anInt1492 = 0;
		this.method1100();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg3 + arg0 - 1;
		@Pc(17) int local17 = arg5 + arg1 - 1;
		if (arg6 >= arg5 && arg6 <= local17 && arg4 >= arg3 && arg4 <= local10) {
			return true;
		} else if (arg6 == arg5 - 1 && arg3 <= arg4 && local10 >= arg4 && (this.anIntArrayArray13[arg6 - this.anInt1500][arg4 - this.anInt1492] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg6 == local17 + 1 && arg3 <= arg4 && local10 >= arg4 && (this.anIntArrayArray13[arg6 - this.anInt1500][arg4 - this.anInt1492] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg3 - 1 && arg5 <= arg6 && arg6 <= local17 && (this.anIntArrayArray13[arg6 - this.anInt1500][arg4 - this.anInt1492] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local10 + 1 == arg4 && arg5 <= arg6 && local17 >= arg6 && (this.anIntArrayArray13[arg6 - this.anInt1500][arg4 - this.anInt1492] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method1100() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1489; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt1493; local13++) {
				if (local7 == 0 || local13 == 0 || local7 >= this.anInt1489 - 5 || this.anInt1493 - 5 <= local13) {
					this.anIntArrayArray13[local7][local13] = 16777215;
				} else {
					this.anIntArrayArray13[local7][local13] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIIII)V")
	public void method1102(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - this.anInt1500;
		@Pc(17) int local17 = 256;
		@Pc(22) int local22 = arg3 - this.anInt1492;
		@Pc(30) int local30;
		if (arg4 == 1 || arg4 == 3) {
			local30 = arg2;
			arg2 = arg5;
			arg5 = local30;
		}
		if (arg1) {
			local17 = 131328;
		}
		for (local30 = local10; local30 < arg2 + local10; local30++) {
			if (local30 >= 0 && this.anInt1489 > local30) {
				for (@Pc(52) int local52 = local22; local52 < local22 + arg5; local52++) {
					if (local52 >= 0 && this.anInt1493 > local52) {
						this.method1105(local17, local30, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg0 && arg1 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg5 - this.anInt1500;
		@Pc(21) int local21 = arg0 - this.anInt1500;
		@Pc(26) int local26 = arg1 - this.anInt1492;
		@Pc(44) int local44 = arg3 - this.anInt1492;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local21 == local16 + 1 && local26 == local44 && (this.anIntArrayArray13[local21][local44] & 0x80) == 0) {
					return true;
				}
				if (local21 == local16 && local26 - 1 == local44 && (this.anIntArrayArray13[local21][local44] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local21 == local16 - 1 && local44 == local26 && (this.anIntArrayArray13[local21][local44] & 0x8) == 0) {
					return true;
				}
				if (local16 == local21 && local44 == local26 - 1 && (this.anIntArrayArray13[local21][local44] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local21 == local16 - 1 && local44 == local26 && (this.anIntArrayArray13[local21][local44] & 0x8) == 0) {
					return true;
				}
				if (local21 == local16 && local26 + 1 == local44 && (this.anIntArrayArray13[local21][local44] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local16 + 1 == local21 && local26 == local44 && (this.anIntArrayArray13[local21][local44] & 0x80) == 0) {
					return true;
				}
				if (local21 == local16 && local26 + 1 == local44 && (this.anIntArrayArray13[local21][local44] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local16 == local21 && local26 + 1 == local44 && (this.anIntArrayArray13[local21][local44] & 0x20) == 0) {
				return true;
			}
			if (local16 == local21 && local44 == local26 - 1 && (this.anIntArrayArray13[local21][local44] & 0x2) == 0) {
				return true;
			}
			if (local21 == local16 - 1 && local44 == local26 && (this.anIntArrayArray13[local21][local44] & 0x8) == 0) {
				return true;
			}
			if (local16 + 1 == local21 && local44 == local26 && (this.anIntArrayArray13[local21][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
	private void method1105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray13[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBZI)V")
	public void method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt1500;
		@Pc(13) int local13 = arg4 - this.anInt1492;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1111(local13, 128, local4);
				this.method1111(local13, 8, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1111(local13, 2, local4);
				this.method1111(local13 + 1, 32, local4);
			}
			if (arg2 == 2) {
				this.method1111(local13, 8, local4);
				this.method1111(local13, 128, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1111(local13, 32, local4);
				this.method1111(local13 - 1, 2, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1111(local13, 1, local4);
				this.method1111(local13 + 1, 16, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1111(local13, 4, local4);
				this.method1111(local13 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1111(local13, 16, local4);
				this.method1111(local13 - 1, 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1111(local13, 64, local4);
				this.method1111(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1111(local13, 130, local4);
				this.method1111(local13, 8, local4 - 1);
				this.method1111(local13 + 1, 32, local4);
			}
			if (arg2 == 1) {
				this.method1111(local13, 10, local4);
				this.method1111(local13 + 1, 32, local4);
				this.method1111(local13, 128, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1111(local13, 40, local4);
				this.method1111(local13, 128, local4 + 1);
				this.method1111(local13 - 1, 2, local4);
			}
			if (arg2 == 3) {
				this.method1111(local13, 160, local4);
				this.method1111(local13 - 1, 2, local4);
				this.method1111(local13, 8, local4 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1111(local13, 65536, local4);
				this.method1111(local13, 4096, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1111(local13, 1024, local4);
				this.method1111(local13 + 1, 16384, local4);
			}
			if (arg2 == 2) {
				this.method1111(local13, 4096, local4);
				this.method1111(local13, 65536, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1111(local13, 16384, local4);
				this.method1111(local13 - 1, 1024, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1111(local13, 512, local4);
				this.method1111(local13 + 1, 8192, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1111(local13, 2048, local4);
				this.method1111(local13 + 1, 32768, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1111(local13, 8192, local4);
				this.method1111(local13 - 1, 512, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1111(local13, 32768, local4);
				this.method1111(local13 - 1, 2048, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1111(local13, 66560, local4);
			this.method1111(local13, 4096, local4 - 1);
			this.method1111(local13 + 1, 16384, local4);
		}
		if (arg2 == 1) {
			this.method1111(local13, 5120, local4);
			this.method1111(local13 + 1, 16384, local4);
			this.method1111(local13, 65536, local4 + 1);
		}
		if (arg2 == 2) {
			this.method1111(local13, 20480, local4);
			this.method1111(local13, 65536, local4 + 1);
			this.method1111(local13 - 1, 1024, local4);
		}
		if (arg2 == 3) {
			this.method1111(local13, 81920, local4);
			this.method1111(local13 - 1, 1024, local4);
			this.method1111(local13, 4096, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V")
	public void method1108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1500;
		@Pc(9) int local9 = arg0 - this.anInt1492;
		this.anIntArrayArray13[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	public void method1109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt1500;
		@Pc(17) int local17 = arg1 - this.anInt1492;
		this.anIntArrayArray13[local12][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIII)Z")
	public boolean method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg5 && arg1 == arg0) {
			return true;
		}
		@Pc(38) int local38 = arg4 - this.anInt1500;
		@Pc(43) int local43 = arg0 - this.anInt1492;
		@Pc(48) int local48 = arg1 - this.anInt1492;
		@Pc(53) int local53 = arg5 - this.anInt1500;
		if (arg3 == 0) {
			if (arg2 == 0) {
				if (local53 - 1 == local38 && local43 == local48) {
					return true;
				}
				if (local53 == local38 && local48 == local43 + 1 && (this.anIntArrayArray13[local38][local48] & 0x12C0120) == 0) {
					return true;
				}
				if (local53 == local38 && local48 == local43 - 1 && (this.anIntArrayArray13[local38][local48] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local38 == local53 && local48 == local43 + 1) {
					return true;
				}
				if (local53 - 1 == local38 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x12C0108) == 0) {
					return true;
				}
				if (local53 + 1 == local38 && local43 == local48 && (this.anIntArrayArray13[local38][local48] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local38 == local53 + 1 && local43 == local48) {
					return true;
				}
				if (local53 == local38 && local48 == local43 + 1 && (this.anIntArrayArray13[local38][local48] & 0x12C0120) == 0) {
					return true;
				}
				if (local53 == local38 && local48 == local43 - 1 && (this.anIntArrayArray13[local38][local48] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local53 == local38 && local48 == local43 - 1) {
					return true;
				}
				if (local38 == local53 - 1 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x12C0108) == 0) {
					return true;
				}
				if (local53 + 1 == local38 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				if (local53 - 1 == local38 && local48 == local43) {
					return true;
				}
				if (local53 == local38 && local48 == local43 + 1) {
					return true;
				}
				if (local38 == local53 + 1 && local43 == local48 && (this.anIntArrayArray13[local38][local48] & 0x12C0180) == 0) {
					return true;
				}
				if (local53 == local38 && local48 == local43 - 1 && (this.anIntArrayArray13[local38][local48] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local53 - 1 == local38 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x12C0108) == 0) {
					return true;
				}
				if (local38 == local53 && local48 == local43 + 1) {
					return true;
				}
				if (local53 + 1 == local38 && local43 == local48) {
					return true;
				}
				if (local38 == local53 && local43 - 1 == local48 && (this.anIntArrayArray13[local38][local48] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local38 == local53 - 1 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x12C0108) == 0) {
					return true;
				}
				if (local38 == local53 && local43 + 1 == local48 && (this.anIntArrayArray13[local38][local48] & 0x12C0120) == 0) {
					return true;
				}
				if (local53 + 1 == local38 && local43 == local48) {
					return true;
				}
				if (local53 == local38 && local43 - 1 == local48) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local53 - 1 == local38 && local43 == local48) {
					return true;
				}
				if (local38 == local53 && local43 + 1 == local48 && (this.anIntArrayArray13[local38][local48] & 0x12C0120) == 0) {
					return true;
				}
				if (local38 == local53 + 1 && local43 == local48 && (this.anIntArrayArray13[local38][local48] & 0x12C0180) == 0) {
					return true;
				}
				if (local53 == local38 && local43 - 1 == local48) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local38 == local53 && local43 + 1 == local48 && (this.anIntArrayArray13[local38][local48] & 0x20) == 0) {
				return true;
			}
			if (local38 == local53 && local48 == local43 - 1 && (this.anIntArrayArray13[local38][local48] & 0x2) == 0) {
				return true;
			}
			if (local38 == local53 - 1 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x8) == 0) {
				return true;
			}
			if (local53 + 1 == local38 && local48 == local43 && (this.anIntArrayArray13[local38][local48] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IIII)V")
	private void method1111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray13[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
	public void method1112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1500;
		@Pc(17) int local17 = arg1 - this.anInt1492;
		this.anIntArrayArray13[local8][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZIB)V")
	public void method1113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg2 - this.anInt1500;
		@Pc(12) int local12 = 256;
		if (arg3) {
			local12 = 131328;
		}
		@Pc(23) int local23 = arg4 - this.anInt1492;
		for (@Pc(31) int local31 = local6; local31 < arg1 + local6; local31++) {
			if (local31 >= 0 && this.anInt1489 > local31) {
				for (@Pc(44) int local44 = local23; local44 < local23 + arg0; local44++) {
					if (local44 >= 0 && local44 < this.anInt1493) {
						this.method1111(local44, local12, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIZI)V")
	public void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt1492;
		@Pc(9) int local9 = arg1 - this.anInt1500;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1105(128, local9, local4);
				this.method1105(8, local9 - 1, local4);
			}
			if (arg2 == 1) {
				this.method1105(2, local9, local4);
				this.method1105(32, local9, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1105(8, local9, local4);
				this.method1105(128, local9 + 1, local4);
			}
			if (arg2 == 3) {
				this.method1105(32, local9, local4);
				this.method1105(2, local9, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1105(1, local9, local4);
				this.method1105(16, local9 - 1, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1105(4, local9, local4);
				this.method1105(64, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1105(16, local9, local4);
				this.method1105(1, local9 + 1, local4 + -1);
			}
			if (arg2 == 3) {
				this.method1105(64, local9, local4);
				this.method1105(4, local9 - 1, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method1105(130, local9, local4);
				this.method1105(8, local9 - 1, local4);
				this.method1105(32, local9, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1105(10, local9, local4);
				this.method1105(32, local9, local4 + 1);
				this.method1105(128, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method1105(40, local9, local4);
				this.method1105(128, local9 + 1, local4);
				this.method1105(2, local9, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1105(160, local9, local4);
				this.method1105(2, local9, local4 - 1);
				this.method1105(8, local9 - 1, local4);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1105(65536, local9, local4);
				this.method1105(4096, local9 - 1, local4);
			}
			if (arg2 == 1) {
				this.method1105(1024, local9, local4);
				this.method1105(16384, local9, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1105(4096, local9, local4);
				this.method1105(65536, local9 + 1, local4);
			}
			if (arg2 == 3) {
				this.method1105(16384, local9, local4);
				this.method1105(1024, local9, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1105(512, local9, local4);
				this.method1105(8192, local9 - 1, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1105(2048, local9, local4);
				this.method1105(32768, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1105(8192, local9, local4);
				this.method1105(512, local9 + 1, local4 + -1);
			}
			if (arg2 == 3) {
				this.method1105(32768, local9, local4);
				this.method1105(2048, local9 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1105(66560, local9, local4);
			this.method1105(4096, local9 - 1, local4);
			this.method1105(16384, local9, local4 + 1);
		}
		if (arg2 == 1) {
			this.method1105(5120, local9, local4);
			this.method1105(16384, local9, local4 + 1);
			this.method1105(65536, local9 + 1, local4);
		}
		if (arg2 == 2) {
			this.method1105(20480, local9, local4);
			this.method1105(65536, local9 + 1, local4);
			this.method1105(1024, local9, local4 - 1);
		}
		if (arg2 == 3) {
			this.method1105(81920, local9, local4);
			this.method1105(1024, local9, local4 - 1);
			this.method1105(4096, local9 - 1, local4);
			return;
		}
	}
}

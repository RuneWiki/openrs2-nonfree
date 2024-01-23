import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	private int anInt62 = 0;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	private int anInt55;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt53 = arg0;
		this.anInt64 = arg1;
		this.anInt55 = 0;
		this.anIntArrayArray1 = new int[this.anInt53][this.anInt64];
		this.method43();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBII)V")
	private void method36(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg6 && arg0 == arg2) {
				return true;
			}
		} else if (arg4 <= arg6 && arg6 <= arg5 + arg4 - 1 && arg0 >= arg0 && arg5 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(65) int local65 = arg0 - this.anInt55;
		@Pc(70) int local70 = arg4 - this.anInt62;
		@Pc(75) int local75 = arg6 - this.anInt62;
		@Pc(80) int local80 = arg2 - this.anInt55;
		if (arg5 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local75 - 1 == local70 && local80 == local65) {
						return true;
					}
					if (local70 == local75 && local65 + 1 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 == local75 && local65 - 1 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 == local75 && local65 + 1 == local80) {
						return true;
					}
					if (local75 - 1 == local70 && local80 == local65 && (this.anIntArrayArray1[local70][local80] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local65 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local70 == local75 + 1 && local65 == local80) {
						return true;
					}
					if (local70 == local75 && local80 == local65 + 1 && (this.anIntArrayArray1[local70][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local75 == local70 && local80 == local65 - 1 && (this.anIntArrayArray1[local70][local80] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local75 == local70 && local65 - 1 == local80) {
						return true;
					}
					if (local70 == local75 - 1 && local80 == local65 && (this.anIntArrayArray1[local70][local80] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local80 == local65 && (this.anIntArrayArray1[local70][local80] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local75 - 1 == local70 && local65 == local80) {
						return true;
					}
					if (local70 == local75 && local65 + 1 == local80) {
						return true;
					}
					if (local70 == local75 + 1 && local80 == local65 && (this.anIntArrayArray1[local70][local80] & 0x12C0180) == 0) {
						return true;
					}
					if (local75 == local70 && local65 - 1 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local75 - 1 == local70 && local65 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0108) == 0) {
						return true;
					}
					if (local75 == local70 && local80 == local65 + 1) {
						return true;
					}
					if (local70 == local75 + 1 && local65 == local80) {
						return true;
					}
					if (local75 == local70 && local80 == local65 - 1 && (this.anIntArrayArray1[local70][local80] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local70 == local75 - 1 && local80 == local65 && (this.anIntArrayArray1[local70][local80] & 0x12C0108) == 0) {
						return true;
					}
					if (local75 == local70 && local80 == local65 + 1 && (this.anIntArrayArray1[local70][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local65 == local80) {
						return true;
					}
					if (local75 == local70 && local65 - 1 == local80) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 == local75 - 1 && local80 == local65) {
						return true;
					}
					if (local75 == local70 && local65 + 1 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local65 == local80 && (this.anIntArrayArray1[local70][local80] & 0x12C0180) == 0) {
						return true;
					}
					if (local75 == local70 && local80 == local65 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local75 == local70 && local80 == local65 + 1 && (this.anIntArrayArray1[local70][local80] & 0x20) == 0) {
					return true;
				}
				if (local70 == local75 && local65 - 1 == local80 && (this.anIntArrayArray1[local70][local80] & 0x2) == 0) {
					return true;
				}
				if (local75 - 1 == local70 && local65 == local80 && (this.anIntArrayArray1[local70][local80] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local70 && local80 == local65 && (this.anIntArrayArray1[local70][local80] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(773) int local773 = local70 + arg5 - 1;
			@Pc(779) int local779 = arg5 + local80 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local75 - arg5 == local70 && local80 <= local65 && local779 >= local65) {
						return true;
					}
					if (local75 >= local70 && local75 <= local773 && local65 + 1 == local80 && (this.anIntArrayArray1[local75][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 <= local75 && local773 >= local75 && local65 - arg5 == local80 && (this.anIntArrayArray1[local75][local779] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local75 >= local70 && local773 >= local75 && local80 == local65 + 1) {
						return true;
					}
					if (local70 == local75 - arg5 && local65 >= local80 && local779 >= local65 && (this.anIntArrayArray1[local773][local65] & 0x12C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local80 <= local65 && local65 <= local779 && (this.anIntArrayArray1[local70][local65] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local75 + 1 == local70 && local80 <= local65 && local779 >= local65) {
						return true;
					}
					if (local75 >= local70 && local75 <= local773 && local80 == local65 + 1 && (this.anIntArrayArray1[local75][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 <= local75 && local75 <= local773 && local65 - arg5 == local80 && (this.anIntArrayArray1[local75][local779] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 <= local75 && local773 >= local75 && local80 == local65 - arg5) {
						return true;
					}
					if (local70 == local75 - arg5 && local65 >= local80 && local779 >= local65 && (this.anIntArrayArray1[local773][local65] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local80 <= local65 && local779 >= local65 && (this.anIntArrayArray1[local70][local65] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local70 == local75 - arg5 && local80 <= local65 && local65 <= local779) {
						return true;
					}
					if (local70 <= local75 && local773 >= local75 && local80 == local65 + 1) {
						return true;
					}
					if (local75 + 1 == local70 && local65 >= local80 && local65 <= local779 && (this.anIntArrayArray1[local70][local65] & 0x12C0180) == 0) {
						return true;
					}
					if (local70 <= local75 && local773 >= local75 && local65 - arg5 == local80 && (this.anIntArrayArray1[local75][local779] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local75 - arg5 == local70 && local80 <= local65 && local65 <= local779 && (this.anIntArrayArray1[local773][local65] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 <= local75 && local75 <= local773 && local80 == local65 + 1) {
						return true;
					}
					if (local70 == local75 + 1 && local80 <= local65 && local779 >= local65) {
						return true;
					}
					if (local75 >= local70 && local75 <= local773 && local80 == local65 - arg5 && (this.anIntArrayArray1[local75][local779] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local70 == local75 - arg5 && local65 >= local80 && local779 >= local65 && (this.anIntArrayArray1[local773][local65] & 0x12C0108) == 0) {
						return true;
					}
					if (local75 >= local70 && local773 >= local75 && local65 + 1 == local80 && (this.anIntArrayArray1[local75][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local65 >= local80 && local779 >= local65) {
						return true;
					}
					if (local75 >= local70 && local75 <= local773 && local65 - arg5 == local80) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local75 - arg5 == local70 && local65 >= local80 && local779 >= local65) {
						return true;
					}
					if (local70 <= local75 && local75 <= local773 && local80 == local65 + 1 && (this.anIntArrayArray1[local75][local80] & 0x12C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local65 >= local80 && local779 >= local65 && (this.anIntArrayArray1[local70][local65] & 0x12C0180) == 0) {
						return true;
					}
					if (local70 <= local75 && local773 >= local75 && local80 == local65 - arg5) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local75 >= local70 && local773 >= local75 && local65 + 1 == local80 && (this.anIntArrayArray1[local75][local80] & 0x12C0120) == 0) {
					return true;
				}
				if (local70 <= local75 && local75 <= local773 && local80 == local65 - arg5 && (this.anIntArrayArray1[local75][local779] & 0x12C0102) == 0) {
					return true;
				}
				if (local75 - arg5 == local70 && local65 >= local80 && local65 <= local779 && (this.anIntArrayArray1[local773][local65] & 0x12C0108) == 0) {
					return true;
				}
				if (local75 + 1 == local70 && local80 <= local65 && local65 <= local779 && (this.anIntArrayArray1[local70][local65] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIZIII)V")
	public void method38(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - this.anInt62;
		@Pc(15) int local15 = arg0 - this.anInt55;
		@Pc(17) int local17 = 256;
		if (arg2) {
			local17 = 131328;
		}
		@Pc(39) int local39;
		if (arg4 == 1 || arg4 == 3) {
			local39 = arg1;
			arg1 = arg5;
			arg5 = local39;
		}
		for (local39 = local10; local39 < local10 + arg1; local39++) {
			if (local39 >= 0 && local39 < this.anInt53) {
				for (@Pc(59) int local59 = local15; local59 < arg5 + local15; local59++) {
					if (local59 >= 0 && local59 < this.anInt64) {
						this.method36(local17, local39, local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZIIIB)V")
	public void method40(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg3 - this.anInt62;
		@Pc(17) int local17 = arg2 - this.anInt55;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method36(128, local12, local17);
				this.method36(8, local12 - 1, local17);
			}
			if (arg4 == 1) {
				this.method36(2, local12, local17);
				this.method36(32, local12, local17 + 1);
			}
			if (arg4 == 2) {
				this.method36(8, local12, local17);
				this.method36(128, local12 + 1, local17);
			}
			if (arg4 == 3) {
				this.method36(32, local12, local17);
				this.method36(2, local12, local17 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method36(1, local12, local17);
				this.method36(16, local12 - 1, local17 + 1);
			}
			if (arg4 == 1) {
				this.method36(4, local12, local17);
				this.method36(64, local12 + 1, local17 + 1);
			}
			if (arg4 == 2) {
				this.method36(16, local12, local17);
				this.method36(1, local12 + 1, local17 + -1);
			}
			if (arg4 == 3) {
				this.method36(64, local12, local17);
				this.method36(4, local12 - 1, local17 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method36(130, local12, local17);
				this.method36(8, local12 - 1, local17);
				this.method36(32, local12, local17 + 1);
			}
			if (arg4 == 1) {
				this.method36(10, local12, local17);
				this.method36(32, local12, local17 + 1);
				this.method36(128, local12 + 1, local17);
			}
			if (arg4 == 2) {
				this.method36(40, local12, local17);
				this.method36(128, local12 + 1, local17);
				this.method36(2, local12, local17 - 1);
			}
			if (arg4 == 3) {
				this.method36(160, local12, local17);
				this.method36(2, local12, local17 - 1);
				this.method36(8, local12 - 1, local17);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method36(65536, local12, local17);
				this.method36(4096, local12 - 1, local17);
			}
			if (arg4 == 1) {
				this.method36(1024, local12, local17);
				this.method36(16384, local12, local17 + 1);
			}
			if (arg4 == 2) {
				this.method36(4096, local12, local17);
				this.method36(65536, local12 + 1, local17);
			}
			if (arg4 == 3) {
				this.method36(16384, local12, local17);
				this.method36(1024, local12, local17 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method36(512, local12, local17);
				this.method36(8192, local12 - 1, local17 + 1);
			}
			if (arg4 == 1) {
				this.method36(2048, local12, local17);
				this.method36(32768, local12 + 1, local17 + 1);
			}
			if (arg4 == 2) {
				this.method36(8192, local12, local17);
				this.method36(512, local12 + 1, local17 + -1);
			}
			if (arg4 == 3) {
				this.method36(32768, local12, local17);
				this.method36(2048, local12 - 1, local17 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method36(66560, local12, local17);
			this.method36(4096, local12 - 1, local17);
			this.method36(16384, local12, local17 + 1);
		}
		if (arg4 == 1) {
			this.method36(5120, local12, local17);
			this.method36(16384, local12, local17 + 1);
			this.method36(65536, local12 + 1, local17);
		}
		if (arg4 == 2) {
			this.method36(20480, local12, local17);
			this.method36(65536, local12 + 1, local17);
			this.method36(1024, local12, local17 - 1);
		}
		if (arg4 == 3) {
			this.method36(81920, local12, local17);
			this.method36(1024, local12, local17 - 1);
			this.method36(4096, local12 - 1, local17);
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public void method41(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt55;
		@Pc(13) int local13 = arg0 - this.anInt62;
		this.anIntArrayArray1[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
	public void method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt55;
		@Pc(9) int local9 = arg1 - this.anInt62;
		this.anIntArrayArray1[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public void method43() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt53; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt64; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt53 - 5 || local11 >= this.anInt64 - 5) {
					this.anIntArrayArray1[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray1[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt55;
		@Pc(17) int local17 = arg0 - this.anInt62;
		this.anIntArrayArray1[local17][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V")
	private void method46(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg8 + arg2;
		@Pc(9) int local9 = arg0 + arg6;
		@Pc(17) int local17 = arg4 + arg7;
		@Pc(22) int local22 = arg5 + arg1;
		@Pc(77) int local77;
		@Pc(75) int local75;
		if (arg0 >= arg7 && arg0 < local17) {
			if (arg5 == local5 && (arg3 & 0x4) == 0) {
				local77 = arg0;
				local75 = local17 < local9 ? local17 : local9;
				while (local77 < local75) {
					if ((this.anIntArrayArray1[local77 - this.anInt62][local5 - this.anInt55 - 1] & 0x2) == 0) {
						return true;
					}
					local77++;
				}
			} else if (local22 == arg8 && (arg3 & 0x1) == 0) {
				local75 = local17 < local9 ? local17 : local9;
				for (local77 = arg0; local77 < local75; local77++) {
					if ((this.anIntArrayArray1[local77 - this.anInt62][arg8 - this.anInt55] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (local9 > arg7 && local9 <= local17) {
			if (arg5 == local5 && (arg3 & 0x4) == 0) {
				for (local77 = arg7; local77 < local9; local77++) {
					if ((this.anIntArrayArray1[local77 - this.anInt62][local5 - this.anInt55 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (arg8 == local22 && (arg3 & 0x1) == 0) {
				for (local77 = arg7; local77 < local9; local77++) {
					if ((this.anIntArrayArray1[local77 - this.anInt62][arg8 - this.anInt55] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg8 >= arg5 && arg8 < local22) {
			if (arg7 == local9 && (arg3 & 0x8) == 0) {
				local77 = arg8;
				local75 = local22 >= local5 ? local5 : local22;
				while (local75 > local77) {
					if ((this.anIntArrayArray1[local9 - this.anInt62 - 1][local77 - this.anInt55] & 0x8) == 0) {
						return true;
					}
					local77++;
				}
			} else if (local17 == arg0 && (arg3 & 0x2) == 0) {
				local75 = local5 <= local22 ? local5 : local22;
				for (local77 = arg8; local77 < local75; local77++) {
					if ((this.anIntArrayArray1[arg0 - this.anInt62][local77 - this.anInt55] & 0x80) == 0) {
						return true;
					}
				}
			}
		} else if (local5 > arg5 && local22 >= local5) {
			if (arg7 == local9 && (arg3 & 0x8) == 0) {
				for (local77 = arg5; local77 < local5; local77++) {
					if ((this.anIntArrayArray1[local9 - this.anInt62 - 1][local77 - this.anInt55] & 0x8) == 0) {
						return true;
					}
				}
			} else if (arg0 == local17 && (arg3 & 0x2) == 0) {
				for (local77 = arg5; local77 < local5; local77++) {
					if ((this.anIntArrayArray1[arg0 - this.anInt62][local77 - this.anInt55] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method48(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return this.method54(arg7, arg6, arg1, arg4, arg2, arg0, arg3, arg1) ? true : this.method47(arg7, arg0, arg1, arg5, arg6, arg2, arg1, arg4, arg3);
		}
		@Pc(39) int local39 = arg6 + arg4 - 1;
		@Pc(45) int local45 = arg0 + arg2 - 1;
		if (arg4 <= arg7 && local39 >= arg7 && arg2 <= arg3 && arg3 <= local45) {
			return true;
		} else if (arg7 == arg4 - 1 && arg2 <= arg3 && local45 >= arg3 && (this.anIntArrayArray1[arg7 - this.anInt62][arg3 - this.anInt55] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local39 + 1 == arg7 && arg3 >= arg2 && local45 >= arg3 && (this.anIntArrayArray1[arg7 - this.anInt62][arg3 - this.anInt55] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg2 - 1 && arg4 <= arg7 && local39 >= arg7 && (this.anIntArrayArray1[arg7 - this.anInt62][arg3 - this.anInt55] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg3 && arg4 <= arg7 && local39 >= arg7 && (this.anIntArrayArray1[arg7 - this.anInt62][arg3 - this.anInt55] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZIIBI)V")
	public void method49(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt62;
		@Pc(13) int local13 = arg0 - this.anInt55;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method46(128, local13, local8);
				this.method46(8, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method46(2, local13, local8);
				this.method46(32, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method46(8, local13, local8);
				this.method46(128, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method46(32, local13, local8);
				this.method46(2, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method46(1, local13, local8);
				this.method46(16, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method46(4, local13, local8);
				this.method46(64, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method46(16, local13, local8);
				this.method46(1, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method46(64, local13, local8);
				this.method46(4, local13 - 1, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method46(130, local13, local8);
				this.method46(8, local13, local8 - 1);
				this.method46(32, local13 + 1, local8);
			}
			if (arg2 == 1) {
				this.method46(10, local13, local8);
				this.method46(32, local13 + 1, local8);
				this.method46(128, local13, local8 + 1);
			}
			if (arg2 == 2) {
				this.method46(40, local13, local8);
				this.method46(128, local13, local8 + 1);
				this.method46(2, local13 - 1, local8);
			}
			if (arg2 == 3) {
				this.method46(160, local13, local8);
				this.method46(2, local13 - 1, local8);
				this.method46(8, local13, local8 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method46(65536, local13, local8);
				this.method46(4096, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method46(1024, local13, local8);
				this.method46(16384, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method46(4096, local13, local8);
				this.method46(65536, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method46(16384, local13, local8);
				this.method46(1024, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method46(512, local13, local8);
				this.method46(8192, local13 + 1, local8 - 1);
			}
			if (arg2 == 1) {
				this.method46(2048, local13, local8);
				this.method46(32768, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method46(8192, local13, local8);
				this.method46(512, local13 - 1, local8 - -1);
			}
			if (arg2 == 3) {
				this.method46(32768, local13, local8);
				this.method46(2048, local13 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method46(66560, local13, local8);
			this.method46(4096, local13, local8 - 1);
			this.method46(16384, local13 + 1, local8);
		}
		if (arg2 == 1) {
			this.method46(5120, local13, local8);
			this.method46(16384, local13 + 1, local8);
			this.method46(65536, local13, local8 + 1);
		}
		if (arg2 == 2) {
			this.method46(20480, local13, local8);
			this.method46(65536, local13, local8 + 1);
			this.method46(1024, local13 - 1, local8);
		}
		if (arg2 == 3) {
			this.method46(81920, local13, local8);
			this.method46(1024, local13 - 1, local8);
			this.method46(4096, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V")
	public void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg0 - this.anInt62;
		@Pc(15) int local15 = arg1 - this.anInt55;
		@Pc(17) int local17 = 256;
		if (arg2) {
			local17 = 131328;
		}
		for (@Pc(25) int local25 = local6; local25 < arg4 + local6; local25++) {
			if (local25 >= 0 && local25 < this.anInt53) {
				for (@Pc(42) int local42 = local15; local42 < local15 + arg3; local42++) {
					if (local42 >= 0 && this.anInt64 > local42) {
						this.method46(local17, local42, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method53(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg6 && arg3 == arg4) {
				return true;
			}
		} else if (arg0 <= arg6 && arg0 + arg1 - 1 >= arg6 && arg3 <= arg3 && arg3 <= arg1 + arg3 - 1) {
			return true;
		}
		@Pc(60) int local60 = arg6 - this.anInt62;
		@Pc(65) int local65 = arg4 - this.anInt55;
		@Pc(70) int local70 = arg0 - this.anInt62;
		@Pc(75) int local75 = arg3 - this.anInt55;
		if (arg1 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local60 + 1 == local70 && local75 == local65 && (this.anIntArrayArray1[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local60 == local70 && local65 == local75 - 1 && (this.anIntArrayArray1[local70][local65] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local60 - 1 == local70 && local75 == local65 && (this.anIntArrayArray1[local70][local65] & 0x8) == 0) {
						return true;
					}
					if (local60 == local70 && local75 - 1 == local65 && (this.anIntArrayArray1[local70][local65] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local60 - 1 && local65 == local75 && (this.anIntArrayArray1[local70][local65] & 0x8) == 0) {
						return true;
					}
					if (local60 == local70 && local65 == local75 + 1 && (this.anIntArrayArray1[local70][local65] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 == local60 + 1 && local65 == local75 && (this.anIntArrayArray1[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 == local60 && local75 + 1 == local65 && (this.anIntArrayArray1[local70][local65] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local60 == local70 && local65 == local75 + 1 && (this.anIntArrayArray1[local70][local65] & 0x20) == 0) {
					return true;
				}
				if (local60 == local70 && local65 == local75 - 1 && (this.anIntArrayArray1[local70][local65] & 0x2) == 0) {
					return true;
				}
				if (local70 == local60 - 1 && local65 == local75 && (this.anIntArrayArray1[local70][local65] & 0x8) == 0) {
					return true;
				}
				if (local70 == local60 + 1 && local65 == local75 && (this.anIntArrayArray1[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = arg1 + local70 - 1;
			@Pc(90) int local90 = local65 + arg1 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local70 == local60 + 1 && local75 >= local65 && local90 >= local75 && (this.anIntArrayArray1[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local60 >= local70 && local84 >= local60 && local75 - arg1 == local65 && (this.anIntArrayArray1[local60][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local60 - arg1 == local70 && local65 <= local75 && local75 <= local90 && (this.anIntArrayArray1[local84][local75] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local60 && local60 <= local84 && local65 == local75 - arg1 && (this.anIntArrayArray1[local60][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local60 - arg1 && local75 >= local65 && local90 >= local75 && (this.anIntArrayArray1[local84][local75] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local60 && local60 <= local84 && local65 == local75 + 1 && (this.anIntArrayArray1[local60][local65] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local60 + 1 == local70 && local75 >= local65 && local75 <= local90 && (this.anIntArrayArray1[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local60 >= local70 && local84 >= local60 && local65 == local75 + 1 && (this.anIntArrayArray1[local60][local65] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local60 >= local70 && local84 >= local60 && local65 == local75 + 1 && (this.anIntArrayArray1[local60][local65] & 0x20) == 0) {
					return true;
				}
				if (local60 >= local70 && local84 >= local60 && local65 == local75 - arg1 && (this.anIntArrayArray1[local60][local90] & 0x2) == 0) {
					return true;
				}
				if (local60 - arg1 == local70 && local65 <= local75 && local75 <= local90 && (this.anIntArrayArray1[local84][local75] & 0x8) == 0) {
					return true;
				}
				if (local60 + 1 == local70 && local65 <= local75 && local90 >= local75 && (this.anIntArrayArray1[local70][local75] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIIIIIII)Z")
	private boolean method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg3 + arg1 && arg3 < arg0 + arg2) {
			return arg4 + arg5 > arg6 && arg4 < arg6 + arg7;
		} else {
			return false;
		}
	}
}

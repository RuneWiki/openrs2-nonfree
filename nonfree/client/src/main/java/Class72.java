import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class72 {

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	private final int anInt3190 = 0;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private final int anInt3175 = 0;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	private final int anInt3195;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	private final int anInt3173;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "[[I")
	public final int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3195 = arg1;
		this.anInt3173 = arg0;
		this.anIntArrayArray78 = new int[this.anInt3173][this.anInt3195];
		this.method2107();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	public void method2097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3175;
		@Pc(9) int local9 = arg0 - this.anInt3190;
		this.anIntArrayArray78[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V")
	private void method2099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray78[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBZIIII)V")
	public void method2100(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg3 - this.anInt3190;
		@Pc(15) int local15 = arg2 - this.anInt3175;
		@Pc(17) int local17 = 256;
		if (arg5 == 1 || arg5 == 3) {
			@Pc(29) int local29 = arg0;
			arg0 = arg4;
			arg4 = local29;
		}
		if (arg1) {
			local17 = 131328;
		}
		for (@Pc(49) int local49 = local6; local49 < arg0 + local6; local49++) {
			if (local49 >= 0 && this.anInt3173 > local49) {
				for (@Pc(66) int local66 = local15; local66 < arg4 + local15; local66++) {
					if (local66 >= 0 && this.anInt3195 > local66) {
						this.method2106(local17, local66, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
	public void method2101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3175;
		@Pc(9) int local9 = arg0 - this.anInt3190;
		this.anIntArrayArray78[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIII)V")
	public void method2102(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt3175;
		@Pc(13) int local13 = arg2 - this.anInt3190;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method2099(local4, 128, local13);
				this.method2099(local4, 8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method2099(local4, 2, local13);
				this.method2099(local4 + 1, 32, local13);
			}
			if (arg4 == 2) {
				this.method2099(local4, 8, local13);
				this.method2099(local4, 128, local13 + 1);
			}
			if (arg4 == 3) {
				this.method2099(local4, 32, local13);
				this.method2099(local4 - 1, 2, local13);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method2099(local4, 1, local13);
				this.method2099(local4 + 1, 16, local13 - 1);
			}
			if (arg4 == 1) {
				this.method2099(local4, 4, local13);
				this.method2099(local4 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method2099(local4, 16, local13);
				this.method2099(local4 - 1, 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method2099(local4, 64, local13);
				this.method2099(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method2099(local4, 130, local13);
				this.method2099(local4, 8, local13 - 1);
				this.method2099(local4 + 1, 32, local13);
			}
			if (arg4 == 1) {
				this.method2099(local4, 10, local13);
				this.method2099(local4 + 1, 32, local13);
				this.method2099(local4, 128, local13 + 1);
			}
			if (arg4 == 2) {
				this.method2099(local4, 40, local13);
				this.method2099(local4, 128, local13 + 1);
				this.method2099(local4 - 1, 2, local13);
			}
			if (arg4 == 3) {
				this.method2099(local4, 160, local13);
				this.method2099(local4 - 1, 2, local13);
				this.method2099(local4, 8, local13 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method2099(local4, 65536, local13);
				this.method2099(local4, 4096, local13 - 1);
			}
			if (arg4 == 1) {
				this.method2099(local4, 1024, local13);
				this.method2099(local4 + 1, 16384, local13);
			}
			if (arg4 == 2) {
				this.method2099(local4, 4096, local13);
				this.method2099(local4, 65536, local13 + 1);
			}
			if (arg4 == 3) {
				this.method2099(local4, 16384, local13);
				this.method2099(local4 - 1, 1024, local13);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method2099(local4, 512, local13);
				this.method2099(local4 + 1, 8192, local13 - 1);
			}
			if (arg4 == 1) {
				this.method2099(local4, 2048, local13);
				this.method2099(local4 + 1, 32768, local13 + 1);
			}
			if (arg4 == 2) {
				this.method2099(local4, 8192, local13);
				this.method2099(local4 - 1, 512, local13 + 1);
			}
			if (arg4 == 3) {
				this.method2099(local4, 32768, local13);
				this.method2099(local4 - 1, 2048, local13 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2099(local4, 66560, local13);
			this.method2099(local4, 4096, local13 - 1);
			this.method2099(local4 + 1, 16384, local13);
		}
		if (arg4 == 1) {
			this.method2099(local4, 5120, local13);
			this.method2099(local4 + 1, 16384, local13);
			this.method2099(local4, 65536, local13 + 1);
		}
		if (arg4 == 2) {
			this.method2099(local4, 20480, local13);
			this.method2099(local4, 65536, local13 + 1);
			this.method2099(local4 - 1, 1024, local13);
		}
		if (arg4 == 3) {
			this.method2099(local4, 81920, local13);
			this.method2099(local4 - 1, 1024, local13);
			this.method2099(local4, 4096, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method2103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg4 && arg0 == arg2) {
			return true;
		}
		@Pc(28) int local28 = arg3 - this.anInt3190;
		@Pc(33) int local33 = arg4 - this.anInt3190;
		@Pc(38) int local38 = arg0 - this.anInt3175;
		@Pc(43) int local43 = arg2 - this.anInt3175;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local28 == local33 + 1 && local43 == local38 && (this.anIntArrayArray78[local28][local43] & 0x80) == 0) {
					return true;
				}
				if (local33 == local28 && local38 - 1 == local43 && (this.anIntArrayArray78[local28][local43] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local33 - 1 == local28 && local38 == local43 && (this.anIntArrayArray78[local28][local43] & 0x8) == 0) {
					return true;
				}
				if (local28 == local33 && local43 == local38 - 1 && (this.anIntArrayArray78[local28][local43] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local28 == local33 - 1 && local43 == local38 && (this.anIntArrayArray78[local28][local43] & 0x8) == 0) {
					return true;
				}
				if (local28 == local33 && local43 == local38 + 1 && (this.anIntArrayArray78[local28][local43] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local28 == local33 + 1 && local43 == local38 && (this.anIntArrayArray78[local28][local43] & 0x80) == 0) {
					return true;
				}
				if (local33 == local28 && local38 + 1 == local43 && (this.anIntArrayArray78[local28][local43] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local33 == local28 && local43 == local38 + 1 && (this.anIntArrayArray78[local28][local43] & 0x20) == 0) {
				return true;
			}
			if (local28 == local33 && local38 - 1 == local43 && (this.anIntArrayArray78[local28][local43] & 0x2) == 0) {
				return true;
			}
			if (local28 == local33 - 1 && local43 == local38 && (this.anIntArrayArray78[local28][local43] & 0x8) == 0) {
				return true;
			}
			if (local28 == local33 + 1 && local38 == local43 && (this.anIntArrayArray78[local28][local43] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
	public void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3190;
		@Pc(19) int local19 = arg0 - this.anInt3175;
		this.anIntArrayArray78[local4][local19] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg3 - 1;
		@Pc(15) int local15 = arg5 + arg1 - 1;
		if (arg5 <= arg2 && arg2 <= local15 && arg4 >= arg6 && arg4 <= local9) {
			return true;
		} else if (arg5 - 1 == arg2 && arg4 >= arg6 && arg4 <= local9 && (this.anIntArrayArray78[arg2 - this.anInt3190][arg4 - this.anInt3175] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg2 == local15 + 1 && arg4 >= arg6 && local9 >= arg4 && (this.anIntArrayArray78[arg2 - this.anInt3190][arg4 - this.anInt3175] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg6 - 1 && arg2 >= arg5 && local15 >= arg2 && (this.anIntArrayArray78[arg2 - this.anInt3190][arg4 - this.anInt3175] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg4 && arg2 >= arg5 && arg2 <= local15 && (this.anIntArrayArray78[arg2 - this.anInt3190][arg4 - this.anInt3175] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IIII)V")
	private void method2106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray78[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public void method2107() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3173; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3195; local16++) {
				if (local12 == 0 || local16 == 0 || this.anInt3173 - 1 == local12 || local16 == this.anInt3195 - 1) {
					this.anIntArrayArray78[local12][local16] = 16777215;
				} else {
					this.anIntArrayArray78[local12][local16] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIIIII)Z")
	public boolean method2108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg0 && arg2 == arg3) {
			return true;
		}
		@Pc(28) int local28 = arg1 - this.anInt3190;
		@Pc(33) int local33 = arg0 - this.anInt3190;
		@Pc(38) int local38 = arg3 - this.anInt3175;
		@Pc(43) int local43 = arg2 - this.anInt3175;
		if (arg4 == 0) {
			if (arg5 == 0) {
				if (local28 == local33 - 1 && local38 == local43) {
					return true;
				}
				if (local33 == local28 && local43 + 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local28 == local33 && local38 == local43 - 1 && (this.anIntArrayArray78[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local33 == local28 && local43 + 1 == local38) {
					return true;
				}
				if (local28 == local33 - 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local28 == local33 + 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local33 + 1 == local28 && local43 == local38) {
					return true;
				}
				if (local33 == local28 && local43 + 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local28 == local33 && local43 - 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local28 == local33 && local43 - 1 == local38) {
					return true;
				}
				if (local28 == local33 - 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local28 == local33 + 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				if (local33 - 1 == local28 && local38 == local43) {
					return true;
				}
				if (local33 == local28 && local38 == local43 + 1) {
					return true;
				}
				if (local28 == local33 + 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
				if (local33 == local28 && local38 == local43 - 1 && (this.anIntArrayArray78[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local28 == local33 - 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local28 == local33 && local38 == local43 + 1) {
					return true;
				}
				if (local33 + 1 == local28 && local38 == local43) {
					return true;
				}
				if (local33 == local28 && local38 == local43 - 1 && (this.anIntArrayArray78[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local33 - 1 == local28 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local28 == local33 && local43 + 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local33 + 1 == local28 && local43 == local38) {
					return true;
				}
				if (local33 == local28 && local43 - 1 == local38) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local33 - 1 == local28 && local38 == local43) {
					return true;
				}
				if (local28 == local33 && local43 + 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local28 == local33 + 1 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
				if (local28 == local33 && local43 - 1 == local38) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local28 == local33 && local43 + 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x20) == 0) {
				return true;
			}
			if (local33 == local28 && local43 - 1 == local38 && (this.anIntArrayArray78[local28][local38] & 0x2) == 0) {
				return true;
			}
			if (local33 - 1 == local28 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x8) == 0) {
				return true;
			}
			if (local33 + 1 == local28 && local38 == local43 && (this.anIntArrayArray78[local28][local38] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ZIIIII)V")
	public void method2109(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt3190;
		@Pc(9) int local9 = arg3 - this.anInt3175;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2106(128, local9, local4);
				this.method2106(8, local9, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2106(2, local9, local4);
				this.method2106(32, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method2106(8, local9, local4);
				this.method2106(128, local9, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2106(32, local9, local4);
				this.method2106(2, local9 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2106(1, local9, local4);
				this.method2106(16, local9 + 1, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2106(4, local9, local4);
				this.method2106(64, local9 + 1, local4 - -1);
			}
			if (arg2 == 2) {
				this.method2106(16, local9, local4);
				this.method2106(1, local9 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2106(64, local9, local4);
				this.method2106(4, local9 - 1, local4 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method2106(130, local9, local4);
				this.method2106(8, local9, local4 - 1);
				this.method2106(32, local9 + 1, local4);
			}
			if (arg2 == 1) {
				this.method2106(10, local9, local4);
				this.method2106(32, local9 + 1, local4);
				this.method2106(128, local9, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2106(40, local9, local4);
				this.method2106(128, local9, local4 + 1);
				this.method2106(2, local9 - 1, local4);
			}
			if (arg2 == 3) {
				this.method2106(160, local9, local4);
				this.method2106(2, local9 - 1, local4);
				this.method2106(8, local9, local4 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2106(65536, local9, local4);
				this.method2106(4096, local9, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2106(1024, local9, local4);
				this.method2106(16384, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method2106(4096, local9, local4);
				this.method2106(65536, local9, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2106(16384, local9, local4);
				this.method2106(1024, local9 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2106(512, local9, local4);
				this.method2106(8192, local9 + 1, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2106(2048, local9, local4);
				this.method2106(32768, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2106(8192, local9, local4);
				this.method2106(512, local9 - 1, local4 - -1);
			}
			if (arg2 == 3) {
				this.method2106(32768, local9, local4);
				this.method2106(2048, local9 - 1, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2106(66560, local9, local4);
			this.method2106(4096, local9, local4 - 1);
			this.method2106(16384, local9 + 1, local4);
		}
		if (arg2 == 1) {
			this.method2106(5120, local9, local4);
			this.method2106(16384, local9 + 1, local4);
			this.method2106(65536, local9, local4 + 1);
		}
		if (arg2 == 2) {
			this.method2106(20480, local9, local4);
			this.method2106(65536, local9, local4 + 1);
			this.method2106(1024, local9 - 1, local4);
		}
		if (arg2 == 3) {
			this.method2106(81920, local9, local4);
			this.method2106(1024, local9 - 1, local4);
			this.method2106(4096, local9, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIIII)V")
	public void method2113(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt3175;
		@Pc(22) int local22;
		if (arg3 == 1 || arg3 == 3) {
			local22 = arg2;
			arg2 = arg1;
			arg1 = local22;
		}
		@Pc(31) int local31 = arg5 - this.anInt3190;
		@Pc(33) int local33 = 256;
		if (arg0) {
			local33 = 131328;
		}
		for (local22 = local31; local22 < local31 + arg2; local22++) {
			if (local22 >= 0 && this.anInt3173 > local22) {
				for (@Pc(54) int local54 = local6; local54 < local6 + arg1; local54++) {
					if (local54 >= 0 && local54 < this.anInt3195) {
						this.method2099(local54, local33, local22);
					}
				}
			}
		}
	}
}

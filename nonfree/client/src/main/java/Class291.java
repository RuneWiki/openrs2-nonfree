import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class291 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public int anInt8715;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	public int anInt8717;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public int anInt8721;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
	public int anInt8730;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray89;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BZIIIZI)V")
	public void method7192(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt8721;
		@Pc(9) int local9 = arg2 - this.anInt8715;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7194(local4, 128, local9);
				this.method7194(local4 - 1, 8, local9);
			}
			if (arg5 == 1) {
				this.method7194(local4, 2, local9);
				this.method7194(local4, 32, local9 + 1);
			}
			if (arg5 == 2) {
				this.method7194(local4, 8, local9);
				this.method7194(local4 + 1, 128, local9);
			}
			if (arg5 == 3) {
				this.method7194(local4, 32, local9);
				this.method7194(local4, 2, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7194(local4, 1, local9);
				this.method7194(local4 - 1, 16, local9 + 1);
			}
			if (arg5 == 1) {
				this.method7194(local4, 4, local9);
				this.method7194(local4 + 1, 64, local9 + 1);
			}
			if (arg5 == 2) {
				this.method7194(local4, 16, local9);
				this.method7194(local4 + 1, 1, local9 - 1);
			}
			if (arg5 == 3) {
				this.method7194(local4, 64, local9);
				this.method7194(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method7194(local4, 130, local9);
				this.method7194(local4 - 1, 8, local9);
				this.method7194(local4, 32, local9 + 1);
			}
			if (arg5 == 1) {
				this.method7194(local4, 10, local9);
				this.method7194(local4, 32, local9 + 1);
				this.method7194(local4 + 1, 128, local9);
			}
			if (arg5 == 2) {
				this.method7194(local4, 40, local9);
				this.method7194(local4 + 1, 128, local9);
				this.method7194(local4, 2, local9 - 1);
			}
			if (arg5 == 3) {
				this.method7194(local4, 160, local9);
				this.method7194(local4, 2, local9 - 1);
				this.method7194(local4 - 1, 8, local9);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method7194(local4, 65536, local9);
					this.method7194(local4 - 1, 4096, local9);
				}
				if (arg5 == 1) {
					this.method7194(local4, 1024, local9);
					this.method7194(local4, 16384, local9 + 1);
				}
				if (arg5 == 2) {
					this.method7194(local4, 4096, local9);
					this.method7194(local4 + 1, 65536, local9);
				}
				if (arg5 == 3) {
					this.method7194(local4, 16384, local9);
					this.method7194(local4, 1024, local9 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method7194(local4, 512, local9);
					this.method7194(local4 - 1, 8192, local9 + 1);
				}
				if (arg5 == 1) {
					this.method7194(local4, 2048, local9);
					this.method7194(local4 + 1, 32768, local9 + 1);
				}
				if (arg5 == 2) {
					this.method7194(local4, 8192, local9);
					this.method7194(local4 + 1, 512, local9 - 1);
				}
				if (arg5 == 3) {
					this.method7194(local4, 32768, local9);
					this.method7194(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method7194(local4, 66560, local9);
					this.method7194(local4 - 1, 4096, local9);
					this.method7194(local4, 16384, local9 + 1);
				}
				if (arg5 == 1) {
					this.method7194(local4, 5120, local9);
					this.method7194(local4, 16384, local9 + 1);
					this.method7194(local4 + 1, 65536, local9);
				}
				if (arg5 == 2) {
					this.method7194(local4, 20480, local9);
					this.method7194(local4 + 1, 65536, local9);
					this.method7194(local4, 1024, local9 - 1);
				}
				if (arg5 == 3) {
					this.method7194(local4, 81920, local9);
					this.method7194(local4, 1024, local9 - 1);
					this.method7194(local4 - 1, 4096, local9);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7194(local4, 536870912, local9);
				this.method7194(local4 - 1, 33554432, local9);
			}
			if (arg5 == 1) {
				this.method7194(local4, 8388608, local9);
				this.method7194(local4, 134217728, local9 + 1);
			}
			if (arg5 == 2) {
				this.method7194(local4, 33554432, local9);
				this.method7194(local4 + 1, 536870912, local9);
			}
			if (arg5 == 3) {
				this.method7194(local4, 134217728, local9);
				this.method7194(local4, 8388608, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7194(local4, 4194304, local9);
				this.method7194(local4 - 1, 67108864, local9 + 1);
			}
			if (arg5 == 1) {
				this.method7194(local4, 16777216, local9);
				this.method7194(local4 + 1, 268435456, local9 + 1);
			}
			if (arg5 == 2) {
				this.method7194(local4, 67108864, local9);
				this.method7194(local4 + 1, 4194304, local9 - 1);
			}
			if (arg5 == 3) {
				this.method7194(local4, 268435456, local9);
				this.method7194(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method7194(local4, 545259520, local9);
			this.method7194(local4 - 1, 33554432, local9);
			this.method7194(local4, 134217728, local9 + 1);
		}
		if (arg5 == 1) {
			this.method7194(local4, 41943040, local9);
			this.method7194(local4, 134217728, local9 + 1);
			this.method7194(local4 + 1, 536870912, local9);
		}
		if (arg5 == 2) {
			this.method7194(local4, 167772160, local9);
			this.method7194(local4 + 1, 536870912, local9);
			this.method7194(local4, 8388608, local9 - 1);
		}
		if (arg5 == 3) {
			this.method7194(local4, 671088640, local9);
			this.method7194(local4, 8388608, local9 - 1);
			this.method7194(local4 - 1, 33554432, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIIZII)V")
	public void method7193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(25) int local25;
		if (arg5 == 1 || arg5 == 3) {
			local25 = arg1;
			arg1 = arg3;
			arg3 = local25;
		}
		@Pc(34) int local34 = arg0 - this.anInt8721;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(45) int local45 = arg6 - this.anInt8715;
		for (local25 = local34; local25 < local34 + arg1; local25++) {
			if (local25 >= 0 && local25 < this.anInt8717) {
				for (@Pc(64) int local64 = local45; local64 < local45 + arg3; local64++) {
					if (local64 >= 0 && local64 < this.anInt8730) {
						this.method7202(local7, local64, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)V")
	private void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray89[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIZIIIZ)V")
	public void method7195(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt8715;
		@Pc(23) int local23 = arg2 - this.anInt8721;
		if (arg5) {
			local7 |= 0x40000000;
		}
		for (@Pc(35) int local35 = local23; local35 < local23 + arg4; local35++) {
			if (local35 >= 0 && local35 < this.anInt8717) {
				for (@Pc(52) int local52 = local18; local52 < arg0 + local18; local52++) {
					if (local52 >= 0 && this.anInt8730 > local52) {
						this.method7194(local35, local7, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public void method7196() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt8717; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt8730; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt8717 - 5 <= local11 || local15 >= this.anInt8730 - 5) {
					this.anIntArrayArray89[local11][local15] = -1;
				} else {
					this.anIntArrayArray89[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZIBZ)V")
	public void method7197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt8721;
		@Pc(9) int local9 = arg4 - this.anInt8715;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method7202(128, local9, local4);
				this.method7202(8, local9, local4 - 1);
			}
			if (arg1 == 1) {
				this.method7202(2, local9, local4);
				this.method7202(32, local9 + 1, local4);
			}
			if (arg1 == 2) {
				this.method7202(8, local9, local4);
				this.method7202(128, local9, local4 + 1);
			}
			if (arg1 == 3) {
				this.method7202(32, local9, local4);
				this.method7202(2, local9 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method7202(1, local9, local4);
				this.method7202(16, local9 + 1, local4 + -1);
			}
			if (arg1 == 1) {
				this.method7202(4, local9, local4);
				this.method7202(64, local9 + 1, local4 + 1);
			}
			if (arg1 == 2) {
				this.method7202(16, local9, local4);
				this.method7202(1, local9 - 1, local4 + 1);
			}
			if (arg1 == 3) {
				this.method7202(64, local9, local4);
				this.method7202(4, local9 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method7202(130, local9, local4);
				this.method7202(8, local9, local4 - 1);
				this.method7202(32, local9 + 1, local4);
			}
			if (arg1 == 1) {
				this.method7202(10, local9, local4);
				this.method7202(32, local9 + 1, local4);
				this.method7202(128, local9, local4 + 1);
			}
			if (arg1 == 2) {
				this.method7202(40, local9, local4);
				this.method7202(128, local9, local4 + 1);
				this.method7202(2, local9 - 1, local4);
			}
			if (arg1 == 3) {
				this.method7202(160, local9, local4);
				this.method7202(2, local9 - 1, local4);
				this.method7202(8, local9, local4 - 1);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method7202(65536, local9, local4);
					this.method7202(4096, local9, local4 - 1);
				}
				if (arg1 == 1) {
					this.method7202(1024, local9, local4);
					this.method7202(16384, local9 + 1, local4);
				}
				if (arg1 == 2) {
					this.method7202(4096, local9, local4);
					this.method7202(65536, local9, local4 + 1);
				}
				if (arg1 == 3) {
					this.method7202(16384, local9, local4);
					this.method7202(1024, local9 - 1, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method7202(512, local9, local4);
					this.method7202(8192, local9 + 1, local4 - 1);
				}
				if (arg1 == 1) {
					this.method7202(2048, local9, local4);
					this.method7202(32768, local9 + 1, local4 + 1);
				}
				if (arg1 == 2) {
					this.method7202(8192, local9, local4);
					this.method7202(512, local9 - 1, local4 - -1);
				}
				if (arg1 == 3) {
					this.method7202(32768, local9, local4);
					this.method7202(2048, local9 - 1, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method7202(66560, local9, local4);
					this.method7202(4096, local9, local4 - 1);
					this.method7202(16384, local9 + 1, local4);
				}
				if (arg1 == 1) {
					this.method7202(5120, local9, local4);
					this.method7202(16384, local9 + 1, local4);
					this.method7202(65536, local9, local4 + 1);
				}
				if (arg1 == 2) {
					this.method7202(20480, local9, local4);
					this.method7202(65536, local9, local4 + 1);
					this.method7202(1024, local9 - 1, local4);
				}
				if (arg1 == 3) {
					this.method7202(81920, local9, local4);
					this.method7202(1024, local9 - 1, local4);
					this.method7202(4096, local9, local4 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method7202(536870912, local9, local4);
				this.method7202(33554432, local9, local4 - 1);
			}
			if (arg1 == 1) {
				this.method7202(8388608, local9, local4);
				this.method7202(134217728, local9 + 1, local4);
			}
			if (arg1 == 2) {
				this.method7202(33554432, local9, local4);
				this.method7202(536870912, local9, local4 + 1);
			}
			if (arg1 == 3) {
				this.method7202(134217728, local9, local4);
				this.method7202(8388608, local9 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method7202(4194304, local9, local4);
				this.method7202(67108864, local9 + 1, local4 + -1);
			}
			if (arg1 == 1) {
				this.method7202(16777216, local9, local4);
				this.method7202(268435456, local9 + 1, local4 + 1);
			}
			if (arg1 == 2) {
				this.method7202(67108864, local9, local4);
				this.method7202(4194304, local9 - 1, local4 + 1);
			}
			if (arg1 == 3) {
				this.method7202(268435456, local9, local4);
				this.method7202(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method7202(545259520, local9, local4);
			this.method7202(33554432, local9, local4 - 1);
			this.method7202(134217728, local9 + 1, local4);
		}
		if (arg1 == 1) {
			this.method7202(41943040, local9, local4);
			this.method7202(134217728, local9 + 1, local4);
			this.method7202(536870912, local9, local4 + 1);
		}
		if (arg1 == 2) {
			this.method7202(167772160, local9, local4);
			this.method7202(536870912, local9, local4 + 1);
			this.method7202(8388608, local9 - 1, local4);
		}
		if (arg1 == 3) {
			this.method7202(671088640, local9, local4);
			this.method7202(8388608, local9 - 1, local4);
			this.method7202(33554432, local9, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	public void method7198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt8721;
		@Pc(27) int local27 = arg1 - this.anInt8715;
		this.anIntArrayArray89[local4][local27] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIBI)Z")
	public boolean method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg0;
		@Pc(14) int local14 = arg3 + arg5;
		@Pc(18) int local18 = arg4 + arg7;
		@Pc(23) int local23 = arg2 + arg1;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (local18 == arg8 && (arg6 & 0x2) == 0) {
			local37 = arg2 >= arg3 ? arg2 : arg3;
			local44 = local23 > local14 ? local14 : local23;
			while (local44 > local37) {
				if ((this.anIntArrayArray89[local18 - this.anInt8721 - 1][local37 - this.anInt8715] & 0x8) == 0) {
					return true;
				}
				local37++;
			}
		} else if (local9 == arg7 && (arg6 & 0x8) == 0) {
			local37 = arg2 < arg3 ? arg3 : arg2;
			local44 = local14 >= local23 ? local23 : local14;
			while (local37 < local44) {
				if ((this.anIntArrayArray89[arg7 - this.anInt8721][local37 - this.anInt8715] & 0x80) == 0) {
					return true;
				}
				local37++;
			}
		} else if (local23 == arg3 && (arg6 & 0x1) == 0) {
			local37 = arg7 >= arg8 ? arg7 : arg8;
			local44 = local9 >= local18 ? local18 : local9;
			while (local44 > local37) {
				if ((this.anIntArrayArray89[local37 - this.anInt8721][local23 - this.anInt8715 - 1] & 0x2) == 0) {
					return true;
				}
				local37++;
			}
		} else if (local14 == arg2 && (arg6 & 0x4) == 0) {
			local37 = arg8 > arg7 ? arg8 : arg7;
			local44 = local9 >= local18 ? local18 : local9;
			while (local44 > local37) {
				if ((this.anIntArrayArray89[local37 - this.anInt8721][arg2 - this.anInt8715] & 0x20) == 0) {
					return true;
				}
				local37++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)V")
	private void method7202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray89[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 == 1) {
			if (arg6 == arg1 && arg0 == arg5) {
				return true;
			}
		} else if (arg1 >= arg6 && arg6 + arg3 - 1 >= arg1 && arg5 <= arg5 && arg5 <= arg3 + arg5 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg1 - this.anInt8721;
		@Pc(68) int local68 = arg5 - this.anInt8715;
		@Pc(73) int local73 = arg6 - this.anInt8721;
		@Pc(78) int local78 = arg0 - this.anInt8715;
		if (arg3 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local73 == local57 + 1 && local78 == local68 && (this.anIntArrayArray89[local73][local78] & 0x80) == 0) {
						return true;
					}
					if (local57 == local73 && local78 == local68 - 1 && (this.anIntArrayArray89[local73][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local73 == local57 - 1 && local68 == local78 && (this.anIntArrayArray89[local73][local78] & 0x8) == 0) {
						return true;
					}
					if (local73 == local57 && local68 - 1 == local78 && (this.anIntArrayArray89[local73][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local73 == local57 - 1 && local78 == local68 && (this.anIntArrayArray89[local73][local78] & 0x8) == 0) {
						return true;
					}
					if (local57 == local73 && local68 + 1 == local78 && (this.anIntArrayArray89[local73][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local57 + 1 == local73 && local78 == local68 && (this.anIntArrayArray89[local73][local78] & 0x80) == 0) {
						return true;
					}
					if (local73 == local57 && local68 + 1 == local78 && (this.anIntArrayArray89[local73][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local73 == local57 && local78 == local68 + 1 && (this.anIntArrayArray89[local73][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 == local57 && local68 - 1 == local78 && (this.anIntArrayArray89[local73][local78] & 0x2) == 0) {
					return true;
				}
				if (local73 == local57 - 1 && local78 == local68 && (this.anIntArrayArray89[local73][local78] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local73 && local78 == local68 && (this.anIntArrayArray89[local73][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = arg3 + local73 - 1;
			@Pc(95) int local95 = arg3 + local78 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local57 + 1 == local73 && local78 <= local68 && local95 >= local68 && (this.anIntArrayArray89[local73][local68] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local73 && local57 <= local89 && local78 == local68 - arg3 && (this.anIntArrayArray89[local57][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local73 == local57 - arg3 && local68 >= local78 && local95 >= local68 && (this.anIntArrayArray89[local89][local68] & 0x8) == 0) {
						return true;
					}
					if (local73 <= local57 && local89 >= local57 && local68 - arg3 == local78 && (this.anIntArrayArray89[local57][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local57 - arg3 == local73 && local78 <= local68 && local95 >= local68 && (this.anIntArrayArray89[local89][local68] & 0x8) == 0) {
						return true;
					}
					if (local73 <= local57 && local57 <= local89 && local68 + 1 == local78 && (this.anIntArrayArray89[local57][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local73 == local57 + 1 && local78 <= local68 && local68 <= local95 && (this.anIntArrayArray89[local73][local68] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local73 && local57 <= local89 && local78 == local68 + 1 && (this.anIntArrayArray89[local57][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local57 >= local73 && local89 >= local57 && local78 == local68 + 1 && (this.anIntArrayArray89[local57][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 <= local57 && local57 <= local89 && local78 == local68 - arg3 && (this.anIntArrayArray89[local57][local95] & 0x2) == 0) {
					return true;
				}
				if (local57 - arg3 == local73 && local68 >= local78 && local68 <= local95 && (this.anIntArrayArray89[local89][local68] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local73 && local68 >= local78 && local68 <= local95 && (this.anIntArrayArray89[local73][local68] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIIIIII)Z")
	public boolean method7204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static192.method3820(arg2, arg1, arg6, arg5, arg0, arg4, arg5, arg7) ? true : this.method7199(arg5, arg6, arg4, arg7, arg2, arg5, arg3, arg0, arg1);
		}
		@Pc(40) int local40 = arg2 + arg0 - 1;
		@Pc(46) int local46 = arg6 + arg4 - 1;
		if (arg1 >= arg0 && local40 >= arg1 && arg7 >= arg4 && local46 >= arg7) {
			return true;
		} else if (arg0 - 1 == arg1 && arg7 >= arg4 && arg7 <= local46 && (this.anIntArrayArray89[arg1 - this.anInt8721][arg7 - this.anInt8715] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local40 + 1 == arg1 && arg4 <= arg7 && local46 >= arg7 && (this.anIntArrayArray89[arg1 - this.anInt8721][arg7 - this.anInt8715] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg7 && arg1 >= arg0 && arg1 <= local40 && (this.anIntArrayArray89[arg1 - this.anInt8721][arg7 - this.anInt8715] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local46 + 1 == arg7 && arg1 >= arg0 && arg1 <= local40 && (this.anIntArrayArray89[arg1 - this.anInt8721][arg7 - this.anInt8715] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)V")
	public void method7205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt8721;
		@Pc(13) int local13 = arg1 - this.anInt8715;
		this.anIntArrayArray89[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
	public void method7206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt8721;
		@Pc(21) int local21 = arg0 - this.anInt8715;
		this.anIntArrayArray89[local16][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
	public void method7208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt8715;
		@Pc(13) int local13 = arg0 - this.anInt8721;
		this.anIntArrayArray89[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg5 == arg2 && arg0 == arg6) {
				return true;
			}
		} else if (arg5 <= arg2 && arg2 <= arg1 + arg5 - 1 && arg6 <= arg6 && arg1 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(53) int local53 = arg0 - this.anInt8715;
		@Pc(64) int local64 = arg2 - this.anInt8721;
		@Pc(69) int local69 = arg5 - this.anInt8721;
		@Pc(74) int local74 = arg6 - this.anInt8715;
		if (arg1 == 1) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					if (local64 - 1 == local69 && local74 == local53) {
						return true;
					}
					if (local64 == local69 && local74 + 1 == local53 && (this.anIntArrayArray89[local69][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 && local53 == local74 - 1 && (this.anIntArrayArray89[local69][local53] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 == local69 && local74 + 1 == local53) {
						return true;
					}
					if (local69 == local64 - 1 && local53 == local74 && (this.anIntArrayArray89[local69][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local53 == local74 && (this.anIntArrayArray89[local69][local53] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 + 1 == local69 && local74 == local53) {
						return true;
					}
					if (local69 == local64 && local53 == local74 + 1 && (this.anIntArrayArray89[local69][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local69 && local53 == local74 - 1 && (this.anIntArrayArray89[local69][local53] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 == local64 && local74 - 1 == local53) {
						return true;
					}
					if (local64 - 1 == local69 && local74 == local53 && (this.anIntArrayArray89[local69][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local53 == local74 && (this.anIntArrayArray89[local69][local53] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					if (local64 - 1 == local69 && local53 == local74) {
						return true;
					}
					if (local69 == local64 && local74 + 1 == local53) {
						return true;
					}
					if (local64 + 1 == local69 && local74 == local53 && (this.anIntArrayArray89[local69][local53] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local64 && local74 - 1 == local53 && (this.anIntArrayArray89[local69][local53] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 - 1 == local69 && local53 == local74 && (this.anIntArrayArray89[local69][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local69 && local74 + 1 == local53) {
						return true;
					}
					if (local64 + 1 == local69 && local53 == local74) {
						return true;
					}
					if (local64 == local69 && local53 == local74 - 1 && (this.anIntArrayArray89[local69][local53] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local69 == local64 - 1 && local74 == local53 && (this.anIntArrayArray89[local69][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local69 && local53 == local74 + 1 && (this.anIntArrayArray89[local69][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local74 == local53) {
						return true;
					}
					if (local64 == local69 && local53 == local74 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 == local64 - 1 && local53 == local74) {
						return true;
					}
					if (local64 == local69 && local53 == local74 + 1 && (this.anIntArrayArray89[local69][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local53 == local74 && (this.anIntArrayArray89[local69][local53] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local64 && local53 == local74 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local69 == local64 && local53 == local74 + 1 && (this.anIntArrayArray89[local69][local53] & 0x20) == 0) {
					return true;
				}
				if (local69 == local64 && local74 - 1 == local53 && (this.anIntArrayArray89[local69][local53] & 0x2) == 0) {
					return true;
				}
				if (local64 - 1 == local69 && local74 == local53 && (this.anIntArrayArray89[local69][local53] & 0x8) == 0) {
					return true;
				}
				if (local69 == local64 + 1 && local53 == local74 && (this.anIntArrayArray89[local69][local53] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = local69 + arg1 - 1;
			@Pc(92) int local92 = arg1 + local53 - 1;
			if (arg3 == 0) {
				if (arg4 == 0) {
					if (local69 == local64 - arg1 && local74 >= local53 && local74 <= local92) {
						return true;
					}
					if (local64 >= local69 && local64 <= local86 && local74 + 1 == local53 && (this.anIntArrayArray89[local64][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local86 && local53 == local74 - arg1 && (this.anIntArrayArray89[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 <= local64 && local86 >= local64 && local53 == local74 + 1) {
						return true;
					}
					if (local64 - arg1 == local69 && local74 >= local53 && local92 >= local74 && (this.anIntArrayArray89[local86][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local74 >= local53 && local92 >= local74 && (this.anIntArrayArray89[local69][local74] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local69 == local64 + 1 && local53 <= local74 && local74 <= local92) {
						return true;
					}
					if (local69 <= local64 && local86 >= local64 && local53 == local74 + 1 && (this.anIntArrayArray89[local64][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 <= local64 && local64 <= local86 && local74 - arg1 == local53 && (this.anIntArrayArray89[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 <= local64 && local86 >= local64 && local74 - arg1 == local53) {
						return true;
					}
					if (local64 - arg1 == local69 && local74 >= local53 && local92 >= local74 && (this.anIntArrayArray89[local86][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local53 <= local74 && local92 >= local74 && (this.anIntArrayArray89[local69][local74] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					if (local64 - arg1 == local69 && local53 <= local74 && local92 >= local74) {
						return true;
					}
					if (local69 <= local64 && local86 >= local64 && local74 + 1 == local53) {
						return true;
					}
					if (local69 == local64 + 1 && local53 <= local74 && local92 >= local74 && (this.anIntArrayArray89[local69][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local86 && local74 - arg1 == local53 && (this.anIntArrayArray89[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 == local64 - arg1 && local74 >= local53 && local74 <= local92 && (this.anIntArrayArray89[local86][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 <= local64 && local64 <= local86 && local74 + 1 == local53) {
						return true;
					}
					if (local69 == local64 + 1 && local53 <= local74 && local92 >= local74) {
						return true;
					}
					if (local69 <= local64 && local64 <= local86 && local74 - arg1 == local53 && (this.anIntArrayArray89[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 - arg1 == local69 && local53 <= local74 && local92 >= local74 && (this.anIntArrayArray89[local86][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 >= local69 && local86 >= local64 && local53 == local74 + 1 && (this.anIntArrayArray89[local64][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local74 >= local53 && local92 >= local74) {
						return true;
					}
					if (local64 >= local69 && local86 >= local64 && local53 == local74 - arg1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 - arg1 == local69 && local74 >= local53 && local74 <= local92) {
						return true;
					}
					if (local69 <= local64 && local86 >= local64 && local74 + 1 == local53 && (this.anIntArrayArray89[local64][local53] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local53 <= local74 && local74 <= local92 && (this.anIntArrayArray89[local69][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 <= local64 && local86 >= local64 && local53 == local74 - arg1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local69 <= local64 && local86 >= local64 && local74 + 1 == local53 && (this.anIntArrayArray89[local64][local53] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 >= local69 && local86 >= local64 && local53 == local74 - arg1 && (this.anIntArrayArray89[local64][local92] & 0x2C0102) == 0) {
					return true;
				}
				if (local69 == local64 - arg1 && local53 <= local74 && local92 >= local74 && (this.anIntArrayArray89[local86][local74] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 + 1 == local69 && local74 >= local53 && local74 <= local92 && (this.anIntArrayArray89[local69][local74] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}

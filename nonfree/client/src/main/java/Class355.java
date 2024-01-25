import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class355 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	public int anInt9386;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public int anInt9391;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public int anInt9399;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	public int anInt9400;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method7804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static108.method1627(arg5, arg7, arg2, arg0, arg1, arg3, arg7, arg4) ? true : this.method7814(arg0, arg7, arg3, arg6, arg1, arg4, arg2, arg5, arg7);
		}
		@Pc(38) int local38 = arg0 + arg1 - 1;
		@Pc(44) int local44 = arg4 + arg3 - 1;
		if (arg5 >= arg1 && local38 >= arg5 && arg2 >= arg3 && local44 >= arg2) {
			return true;
		} else if (arg5 == arg1 - 1 && arg2 >= arg3 && local44 >= arg2 && (this.anIntArrayArray68[arg5 - this.anInt9399][arg2 - this.anInt9391] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg5 == local38 + 1 && arg3 <= arg2 && local44 >= arg2 && (this.anIntArrayArray68[arg5 - this.anInt9399][arg2 - this.anInt9391] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg3 - 1 && arg5 >= arg1 && arg5 <= local38 && (this.anIntArrayArray68[arg5 - this.anInt9399][arg2 - this.anInt9391] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg2 && arg5 >= arg1 && arg5 <= local38 && (this.anIntArrayArray68[arg5 - this.anInt9399][arg2 - this.anInt9391] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method7806() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9400; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt9386; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt9400 - 5 || this.anInt9386 - 5 <= local11) {
					this.anIntArrayArray68[local7][local11] = -1;
				} else {
					this.anIntArrayArray68[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg6 == arg5 && arg2 == arg4) {
				return true;
			}
		} else if (arg6 >= arg5 && arg5 + arg0 - 1 >= arg6 && arg2 <= arg2 && arg2 <= arg2 + arg0 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg5 - this.anInt9399;
		@Pc(63) int local63 = arg6 - this.anInt9399;
		@Pc(68) int local68 = arg4 - this.anInt9391;
		@Pc(81) int local81 = arg2 - this.anInt9391;
		if (arg0 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local58 == local63 + 1 && local81 == local68 && (this.anIntArrayArray68[local58][local68] & 0x80) == 0) {
						return true;
					}
					if (local63 == local58 && local68 == local81 - 1 && (this.anIntArrayArray68[local58][local68] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local63 - 1 == local58 && local68 == local81 && (this.anIntArrayArray68[local58][local68] & 0x8) == 0) {
						return true;
					}
					if (local63 == local58 && local81 - 1 == local68 && (this.anIntArrayArray68[local58][local68] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local63 - 1 == local58 && local68 == local81 && (this.anIntArrayArray68[local58][local68] & 0x8) == 0) {
						return true;
					}
					if (local58 == local63 && local68 == local81 + 1 && (this.anIntArrayArray68[local58][local68] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local63 + 1 == local58 && local81 == local68 && (this.anIntArrayArray68[local58][local68] & 0x80) == 0) {
						return true;
					}
					if (local63 == local58 && local81 + 1 == local68 && (this.anIntArrayArray68[local58][local68] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local58 == local63 && local81 + 1 == local68 && (this.anIntArrayArray68[local58][local68] & 0x20) == 0) {
					return true;
				}
				if (local63 == local58 && local68 == local81 - 1 && (this.anIntArrayArray68[local58][local68] & 0x2) == 0) {
					return true;
				}
				if (local58 == local63 - 1 && local68 == local81 && (this.anIntArrayArray68[local58][local68] & 0x8) == 0) {
					return true;
				}
				if (local63 + 1 == local58 && local68 == local81 && (this.anIntArrayArray68[local58][local68] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = arg0 + local58 - 1;
			@Pc(96) int local96 = local68 + arg0 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local63 + 1 == local58 && local68 <= local81 && local81 <= local96 && (this.anIntArrayArray68[local58][local81] & 0x80) == 0) {
						return true;
					}
					if (local63 >= local58 && local63 <= local90 && local68 == local81 - arg0 && (this.anIntArrayArray68[local63][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 == local63 - arg0 && local81 >= local68 && local96 >= local81 && (this.anIntArrayArray68[local90][local81] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local63 && local63 <= local90 && local68 == local81 - arg0 && (this.anIntArrayArray68[local63][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local58 == local63 - arg0 && local81 >= local68 && local81 <= local96 && (this.anIntArrayArray68[local90][local81] & 0x8) == 0) {
						return true;
					}
					if (local63 >= local58 && local90 >= local63 && local81 + 1 == local68 && (this.anIntArrayArray68[local63][local68] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 == local63 + 1 && local68 <= local81 && local96 >= local81 && (this.anIntArrayArray68[local58][local81] & 0x80) == 0) {
						return true;
					}
					if (local63 >= local58 && local63 <= local90 && local81 + 1 == local68 && (this.anIntArrayArray68[local63][local68] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local58 <= local63 && local63 <= local90 && local68 == local81 + 1 && (this.anIntArrayArray68[local63][local68] & 0x20) == 0) {
					return true;
				}
				if (local63 >= local58 && local63 <= local90 && local81 - arg0 == local68 && (this.anIntArrayArray68[local63][local96] & 0x2) == 0) {
					return true;
				}
				if (local63 - arg0 == local58 && local68 <= local81 && local81 <= local96 && (this.anIntArrayArray68[local90][local81] & 0x8) == 0) {
					return true;
				}
				if (local63 + 1 == local58 && local68 <= local81 && local81 <= local96 && (this.anIntArrayArray68[local58][local81] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)V")
	public void method7809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9399;
		@Pc(13) int local13 = arg0 - this.anInt9391;
		this.anIntArrayArray68[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	private void method7810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray68[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IBI)V")
	public void method7811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9391;
		@Pc(9) int local9 = arg1 - this.anInt9399;
		this.anIntArrayArray68[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public void method7812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9391;
		@Pc(9) int local9 = arg1 - this.anInt9399;
		this.anIntArrayArray68[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIIIZI)V")
	public void method7813(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt9399;
		@Pc(17) int local17 = arg2 - this.anInt9391;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7815(128, local4, local17);
				this.method7815(8, local4 - 1, local17);
			}
			if (arg5 == 1) {
				this.method7815(2, local4, local17);
				this.method7815(32, local4, local17 + 1);
			}
			if (arg5 == 2) {
				this.method7815(8, local4, local17);
				this.method7815(128, local4 + 1, local17);
			}
			if (arg5 == 3) {
				this.method7815(32, local4, local17);
				this.method7815(2, local4, local17 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7815(1, local4, local17);
				this.method7815(16, local4 - 1, local17 + 1);
			}
			if (arg5 == 1) {
				this.method7815(4, local4, local17);
				this.method7815(64, local4 + 1, local17 + 1);
			}
			if (arg5 == 2) {
				this.method7815(16, local4, local17);
				this.method7815(1, local4 + 1, local17 + -1);
			}
			if (arg5 == 3) {
				this.method7815(64, local4, local17);
				this.method7815(4, local4 - 1, local17 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method7815(130, local4, local17);
				this.method7815(8, local4 - 1, local17);
				this.method7815(32, local4, local17 + 1);
			}
			if (arg5 == 1) {
				this.method7815(10, local4, local17);
				this.method7815(32, local4, local17 + 1);
				this.method7815(128, local4 + 1, local17);
			}
			if (arg5 == 2) {
				this.method7815(40, local4, local17);
				this.method7815(128, local4 + 1, local17);
				this.method7815(2, local4, local17 - 1);
			}
			if (arg5 == 3) {
				this.method7815(160, local4, local17);
				this.method7815(2, local4, local17 - 1);
				this.method7815(8, local4 - 1, local17);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method7815(65536, local4, local17);
					this.method7815(4096, local4 - 1, local17);
				}
				if (arg5 == 1) {
					this.method7815(1024, local4, local17);
					this.method7815(16384, local4, local17 + 1);
				}
				if (arg5 == 2) {
					this.method7815(4096, local4, local17);
					this.method7815(65536, local4 + 1, local17);
				}
				if (arg5 == 3) {
					this.method7815(16384, local4, local17);
					this.method7815(1024, local4, local17 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method7815(512, local4, local17);
					this.method7815(8192, local4 - 1, local17 + 1);
				}
				if (arg5 == 1) {
					this.method7815(2048, local4, local17);
					this.method7815(32768, local4 + 1, local17 - -1);
				}
				if (arg5 == 2) {
					this.method7815(8192, local4, local17);
					this.method7815(512, local4 + 1, local17 + -1);
				}
				if (arg5 == 3) {
					this.method7815(32768, local4, local17);
					this.method7815(2048, local4 - 1, local17 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method7815(66560, local4, local17);
					this.method7815(4096, local4 - 1, local17);
					this.method7815(16384, local4, local17 + 1);
				}
				if (arg5 == 1) {
					this.method7815(5120, local4, local17);
					this.method7815(16384, local4, local17 + 1);
					this.method7815(65536, local4 + 1, local17);
				}
				if (arg5 == 2) {
					this.method7815(20480, local4, local17);
					this.method7815(65536, local4 + 1, local17);
					this.method7815(1024, local4, local17 - 1);
				}
				if (arg5 == 3) {
					this.method7815(81920, local4, local17);
					this.method7815(1024, local4, local17 - 1);
					this.method7815(4096, local4 - 1, local17);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7815(536870912, local4, local17);
				this.method7815(33554432, local4 - 1, local17);
			}
			if (arg5 == 1) {
				this.method7815(8388608, local4, local17);
				this.method7815(134217728, local4, local17 + 1);
			}
			if (arg5 == 2) {
				this.method7815(33554432, local4, local17);
				this.method7815(536870912, local4 + 1, local17);
			}
			if (arg5 == 3) {
				this.method7815(134217728, local4, local17);
				this.method7815(8388608, local4, local17 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7815(4194304, local4, local17);
				this.method7815(67108864, local4 - 1, local17 + 1);
			}
			if (arg5 == 1) {
				this.method7815(16777216, local4, local17);
				this.method7815(268435456, local4 + 1, local17 + 1);
			}
			if (arg5 == 2) {
				this.method7815(67108864, local4, local17);
				this.method7815(4194304, local4 + 1, local17 + -1);
			}
			if (arg5 == 3) {
				this.method7815(268435456, local4, local17);
				this.method7815(16777216, local4 - 1, local17 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method7815(545259520, local4, local17);
			this.method7815(33554432, local4 - 1, local17);
			this.method7815(134217728, local4, local17 + 1);
		}
		if (arg5 == 1) {
			this.method7815(41943040, local4, local17);
			this.method7815(134217728, local4, local17 + 1);
			this.method7815(536870912, local4 + 1, local17);
		}
		if (arg5 == 2) {
			this.method7815(167772160, local4, local17);
			this.method7815(536870912, local4 + 1, local17);
			this.method7815(8388608, local4, local17 - 1);
		}
		if (arg5 == 3) {
			this.method7815(671088640, local4, local17);
			this.method7815(8388608, local4, local17 - 1);
			this.method7815(33554432, local4 - 1, local17);
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBIIIIIII)Z")
	public boolean method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg7;
		@Pc(13) int local13 = arg6 + arg8;
		@Pc(23) int local23 = arg4 + arg0;
		@Pc(27) int local27 = arg5 + arg2;
		@Pc(45) int local45;
		@Pc(56) int local56;
		if (arg7 == local23 && (arg3 & 0x2) == 0) {
			local45 = arg2 < arg6 ? arg6 : arg2;
			local56 = local27 <= local13 ? local27 : local13;
			while (local45 < local56) {
				if ((this.anIntArrayArray68[local23 - this.anInt9399 - 1][local45 - this.anInt9391] & 0x8) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local9 == arg4 && (arg3 & 0x8) == 0) {
			local45 = arg2 < arg6 ? arg6 : arg2;
			local56 = local13 < local27 ? local13 : local27;
			while (local45 < local56) {
				if ((this.anIntArrayArray68[arg4 - this.anInt9399][local45 - this.anInt9391] & 0x80) == 0) {
					return true;
				}
				local45++;
			}
		} else if (arg6 == local27 && (arg3 & 0x1) == 0) {
			local45 = arg4 < arg7 ? arg7 : arg4;
			local56 = local9 < local23 ? local9 : local23;
			while (local56 > local45) {
				if ((this.anIntArrayArray68[local45 - this.anInt9399][local27 - this.anInt9391 - 1] & 0x2) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local13 == arg2 && (arg3 & 0x4) == 0) {
			local45 = arg4 < arg7 ? arg7 : arg4;
			local56 = local9 >= local23 ? local23 : local9;
			while (local56 > local45) {
				if ((this.anIntArrayArray68[local45 - this.anInt9399][arg2 - this.anInt9391] & 0x20) == 0) {
					return true;
				}
				local45++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)V")
	private void method7815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray68[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIBIZI)V")
	public void method7816(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt9399;
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg5 - this.anInt9391;
		for (@Pc(31) int local31 = local18; local31 < arg0 + local18; local31++) {
			if (local31 >= 0 && this.anInt9400 > local31) {
				for (@Pc(47) int local47 = local29; local47 < arg2 + local29; local47++) {
					if (local47 >= 0 && local47 < this.anInt9386) {
						this.method7815(local7, local31, local47);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZIZI)V")
	public void method7817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg6 - this.anInt9391;
		@Pc(23) int local23 = arg4 - this.anInt9399;
		@Pc(31) int local31;
		if (arg1 == 1 || arg1 == 3) {
			local31 = arg2;
			arg2 = arg0;
			arg0 = local31;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		for (local31 = local23; local31 < local23 + arg2; local31++) {
			if (local31 >= 0 && this.anInt9400 > local31) {
				for (@Pc(61) int local61 = local18; local61 < arg0 + local18; local61++) {
					if (local61 >= 0 && this.anInt9386 > local61) {
						this.method7810(local31, local61, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZIIIIZI)V")
	public void method7818(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt9391;
		@Pc(13) int local13 = arg3 - this.anInt9399;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7810(local13, local4, 128);
				this.method7810(local13 - 1, local4, 8);
			}
			if (arg5 == 1) {
				this.method7810(local13, local4, 2);
				this.method7810(local13, local4 + 1, 32);
			}
			if (arg5 == 2) {
				this.method7810(local13, local4, 8);
				this.method7810(local13 + 1, local4, 128);
			}
			if (arg5 == 3) {
				this.method7810(local13, local4, 32);
				this.method7810(local13, local4 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7810(local13, local4, 1);
				this.method7810(local13 - 1, local4 - -1, 16);
			}
			if (arg5 == 1) {
				this.method7810(local13, local4, 4);
				this.method7810(local13 + 1, local4 + 1, 64);
			}
			if (arg5 == 2) {
				this.method7810(local13, local4, 16);
				this.method7810(local13 + 1, local4 + -1, 1);
			}
			if (arg5 == 3) {
				this.method7810(local13, local4, 64);
				this.method7810(local13 - 1, local4 - 1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method7810(local13, local4, 130);
				this.method7810(local13 - 1, local4, 8);
				this.method7810(local13, local4 + 1, 32);
			}
			if (arg5 == 1) {
				this.method7810(local13, local4, 10);
				this.method7810(local13, local4 + 1, 32);
				this.method7810(local13 + 1, local4, 128);
			}
			if (arg5 == 2) {
				this.method7810(local13, local4, 40);
				this.method7810(local13 + 1, local4, 128);
				this.method7810(local13, local4 - 1, 2);
			}
			if (arg5 == 3) {
				this.method7810(local13, local4, 160);
				this.method7810(local13, local4 - 1, 2);
				this.method7810(local13 - 1, local4, 8);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method7810(local13, local4, 65536);
					this.method7810(local13 - 1, local4, 4096);
				}
				if (arg5 == 1) {
					this.method7810(local13, local4, 1024);
					this.method7810(local13, local4 + 1, 16384);
				}
				if (arg5 == 2) {
					this.method7810(local13, local4, 4096);
					this.method7810(local13 + 1, local4, 65536);
				}
				if (arg5 == 3) {
					this.method7810(local13, local4, 16384);
					this.method7810(local13, local4 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method7810(local13, local4, 512);
					this.method7810(local13 - 1, local4 + 1, 8192);
				}
				if (arg5 == 1) {
					this.method7810(local13, local4, 2048);
					this.method7810(local13 + 1, local4 + 1, 32768);
				}
				if (arg5 == 2) {
					this.method7810(local13, local4, 8192);
					this.method7810(local13 + 1, local4 + -1, 512);
				}
				if (arg5 == 3) {
					this.method7810(local13, local4, 32768);
					this.method7810(local13 - 1, local4 - 1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method7810(local13, local4, 66560);
					this.method7810(local13 - 1, local4, 4096);
					this.method7810(local13, local4 + 1, 16384);
				}
				if (arg5 == 1) {
					this.method7810(local13, local4, 5120);
					this.method7810(local13, local4 + 1, 16384);
					this.method7810(local13 + 1, local4, 65536);
				}
				if (arg5 == 2) {
					this.method7810(local13, local4, 20480);
					this.method7810(local13 + 1, local4, 65536);
					this.method7810(local13, local4 - 1, 1024);
				}
				if (arg5 == 3) {
					this.method7810(local13, local4, 81920);
					this.method7810(local13, local4 - 1, 1024);
					this.method7810(local13 - 1, local4, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7810(local13, local4, 536870912);
				this.method7810(local13 - 1, local4, 33554432);
			}
			if (arg5 == 1) {
				this.method7810(local13, local4, 8388608);
				this.method7810(local13, local4 + 1, 134217728);
			}
			if (arg5 == 2) {
				this.method7810(local13, local4, 33554432);
				this.method7810(local13 + 1, local4, 536870912);
			}
			if (arg5 == 3) {
				this.method7810(local13, local4, 134217728);
				this.method7810(local13, local4 - 1, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7810(local13, local4, 4194304);
				this.method7810(local13 - 1, local4 + 1, 67108864);
			}
			if (arg5 == 1) {
				this.method7810(local13, local4, 16777216);
				this.method7810(local13 + 1, local4 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method7810(local13, local4, 67108864);
				this.method7810(local13 + 1, local4 + -1, 4194304);
			}
			if (arg5 == 3) {
				this.method7810(local13, local4, 268435456);
				this.method7810(local13 - 1, local4 - 1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method7810(local13, local4, 545259520);
			this.method7810(local13 - 1, local4, 33554432);
			this.method7810(local13, local4 + 1, 134217728);
		}
		if (arg5 == 1) {
			this.method7810(local13, local4, 41943040);
			this.method7810(local13, local4 + 1, 134217728);
			this.method7810(local13 + 1, local4, 536870912);
		}
		if (arg5 == 2) {
			this.method7810(local13, local4, 167772160);
			this.method7810(local13 + 1, local4, 536870912);
			this.method7810(local13, local4 - 1, 8388608);
		}
		if (arg5 == 3) {
			this.method7810(local13, local4, 671088640);
			this.method7810(local13, local4 - 1, 8388608);
			this.method7810(local13 - 1, local4, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg0 && arg1 == arg3) {
				return true;
			}
		} else if (arg6 >= arg0 && arg6 <= arg0 + arg2 - 1 && arg3 <= arg3 && arg3 <= arg3 + arg2 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg3 - this.anInt9391;
		@Pc(64) int local64 = arg1 - this.anInt9391;
		@Pc(69) int local69 = arg6 - this.anInt9399;
		@Pc(74) int local74 = arg0 - this.anInt9399;
		if (arg2 == 1) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local69 - 1 == local74 && local59 == local64) {
						return true;
					}
					if (local69 == local74 && local64 == local59 + 1 && (this.anIntArrayArray68[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 && local59 - 1 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local74 == local69 && local64 == local59 + 1) {
						return true;
					}
					if (local69 - 1 == local74 && local59 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local74 && local59 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local69 + 1 == local74 && local59 == local64) {
						return true;
					}
					if (local74 == local69 && local64 == local59 + 1 && (this.anIntArrayArray68[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 && local59 - 1 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 == local74 && local59 - 1 == local64) {
						return true;
					}
					if (local74 == local69 - 1 && local64 == local59 && (this.anIntArrayArray68[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local74 && local59 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local74 == local69 - 1 && local59 == local64) {
						return true;
					}
					if (local69 == local74 && local59 + 1 == local64) {
						return true;
					}
					if (local74 == local69 + 1 && local59 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local69 && local59 - 1 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local74 == local69 - 1 && local64 == local59 && (this.anIntArrayArray68[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 && local59 + 1 == local64) {
						return true;
					}
					if (local69 + 1 == local74 && local59 == local64) {
						return true;
					}
					if (local69 == local74 && local59 - 1 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local69 - 1 == local74 && local64 == local59 && (this.anIntArrayArray68[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local74 && local59 + 1 == local64 && (this.anIntArrayArray68[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 == local59) {
						return true;
					}
					if (local69 == local74 && local64 == local59 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local74 == local69 - 1 && local64 == local59) {
						return true;
					}
					if (local74 == local69 && local64 == local59 + 1 && (this.anIntArrayArray68[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 == local59 && (this.anIntArrayArray68[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local74 && local59 - 1 == local64) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local74 == local69 && local59 + 1 == local64 && (this.anIntArrayArray68[local74][local64] & 0x20) == 0) {
					return true;
				}
				if (local74 == local69 && local64 == local59 - 1 && (this.anIntArrayArray68[local74][local64] & 0x2) == 0) {
					return true;
				}
				if (local74 == local69 - 1 && local59 == local64 && (this.anIntArrayArray68[local74][local64] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local74 && local64 == local59 && (this.anIntArrayArray68[local74][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(768) int local768 = arg2 + local74 - 1;
			@Pc(775) int local775 = local64 + arg2 - 1;
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local74 == local69 - arg2 && local59 >= local64 && local59 <= local775) {
						return true;
					}
					if (local69 >= local74 && local69 <= local768 && local59 + 1 == local64 && (this.anIntArrayArray68[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 <= local69 && local69 <= local768 && local64 == local59 - arg2 && (this.anIntArrayArray68[local69][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 >= local74 && local768 >= local69 && local64 == local59 + 1) {
						return true;
					}
					if (local74 == local69 - arg2 && local64 <= local59 && local59 <= local775 && (this.anIntArrayArray68[local768][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 <= local59 && local59 <= local775 && (this.anIntArrayArray68[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 == local69 + 1 && local64 <= local59 && local59 <= local775) {
						return true;
					}
					if (local74 <= local69 && local69 <= local768 && local59 + 1 == local64 && (this.anIntArrayArray68[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 >= local74 && local69 <= local768 && local64 == local59 - arg2 && (this.anIntArrayArray68[local69][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 >= local74 && local768 >= local69 && local59 - arg2 == local64) {
						return true;
					}
					if (local69 - arg2 == local74 && local64 <= local59 && local59 <= local775 && (this.anIntArrayArray68[local768][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local59 >= local64 && local59 <= local775 && (this.anIntArrayArray68[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local74 == local69 - arg2 && local64 <= local59 && local775 >= local59) {
						return true;
					}
					if (local74 <= local69 && local768 >= local69 && local59 + 1 == local64) {
						return true;
					}
					if (local74 == local69 + 1 && local59 >= local64 && local775 >= local59 && (this.anIntArrayArray68[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 >= local74 && local69 <= local768 && local59 - arg2 == local64 && (this.anIntArrayArray68[local69][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local74 == local69 - arg2 && local59 >= local64 && local775 >= local59 && (this.anIntArrayArray68[local768][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 <= local69 && local69 <= local768 && local64 == local59 + 1) {
						return true;
					}
					if (local69 + 1 == local74 && local64 <= local59 && local775 >= local59) {
						return true;
					}
					if (local74 <= local69 && local69 <= local768 && local59 - arg2 == local64 && (this.anIntArrayArray68[local69][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local69 - arg2 == local74 && local59 >= local64 && local59 <= local775 && (this.anIntArrayArray68[local768][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 <= local69 && local768 >= local69 && local64 == local59 + 1 && (this.anIntArrayArray68[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 <= local59 && local775 >= local59) {
						return true;
					}
					if (local74 <= local69 && local69 <= local768 && local59 - arg2 == local64) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 - arg2 == local74 && local59 >= local64 && local775 >= local59) {
						return true;
					}
					if (local74 <= local69 && local69 <= local768 && local64 == local59 + 1 && (this.anIntArrayArray68[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local59 >= local64 && local775 >= local59 && (this.anIntArrayArray68[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 >= local74 && local768 >= local69 && local64 == local59 - arg2) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local69 >= local74 && local768 >= local69 && local64 == local59 + 1 && (this.anIntArrayArray68[local69][local64] & 0x2C0120) == 0) {
					return true;
				}
				if (local74 <= local69 && local69 <= local768 && local59 - arg2 == local64 && (this.anIntArrayArray68[local69][local775] & 0x2C0102) == 0) {
					return true;
				}
				if (local69 - arg2 == local74 && local64 <= local59 && local775 >= local59 && (this.anIntArrayArray68[local768][local59] & 0x2C0108) == 0) {
					return true;
				}
				if (local74 == local69 + 1 && local64 <= local59 && local59 <= local775 && (this.anIntArrayArray68[local74][local59] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public void method7820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9391;
		@Pc(9) int local9 = arg0 - this.anInt9399;
		this.anIntArrayArray68[local9][local4] &= 0xFFFBFFFF;
	}
}

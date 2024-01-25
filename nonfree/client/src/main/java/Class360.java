import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class360 {

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	public int anInt10104;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	public int anInt10108;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public int anInt10114;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public int anInt10125;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	public void method8481() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt10104; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt10125; local19++) {
				if (local15 == 0 || local19 == 0 || local15 >= this.anInt10104 - 5 || local19 >= this.anInt10125 - 5) {
					this.anIntArrayArray56[local15][local19] = -1;
				} else {
					this.anIntArrayArray56[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIZIZ)V")
	public void method8482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(24) int local24 = 256;
		if (arg5) {
			local24 = 131328;
		}
		@Pc(35) int local35 = arg1 - this.anInt10108;
		if (arg4) {
			local24 |= 0x40000000;
		}
		@Pc(46) int local46 = arg3 - this.anInt10114;
		for (@Pc(48) int local48 = local35; local48 < arg2 + local35; local48++) {
			if (local48 >= 0 && local48 < this.anInt10104) {
				for (@Pc(69) int local69 = local46; local69 < local46 + arg0; local69++) {
					if (local69 >= 0 && local69 < this.anInt10125) {
						this.method8486(local24, local48, local69);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method8483(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt10108;
		@Pc(9) int local9 = arg2 - this.anInt10114;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method8486(128, local4, local9);
				this.method8486(8, local4 - 1, local9);
			}
			if (arg4 == 1) {
				this.method8486(2, local4, local9);
				this.method8486(32, local4, local9 + 1);
			}
			if (arg4 == 2) {
				this.method8486(8, local4, local9);
				this.method8486(128, local4 + 1, local9);
			}
			if (arg4 == 3) {
				this.method8486(32, local4, local9);
				this.method8486(2, local4, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method8486(1, local4, local9);
				this.method8486(16, local4 - 1, local9 + 1);
			}
			if (arg4 == 1) {
				this.method8486(4, local4, local9);
				this.method8486(64, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method8486(16, local4, local9);
				this.method8486(1, local4 + 1, local9 + -1);
			}
			if (arg4 == 3) {
				this.method8486(64, local4, local9);
				this.method8486(4, local4 - 1, local9 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method8486(130, local4, local9);
				this.method8486(8, local4 - 1, local9);
				this.method8486(32, local4, local9 + 1);
			}
			if (arg4 == 1) {
				this.method8486(10, local4, local9);
				this.method8486(32, local4, local9 + 1);
				this.method8486(128, local4 + 1, local9);
			}
			if (arg4 == 2) {
				this.method8486(40, local4, local9);
				this.method8486(128, local4 + 1, local9);
				this.method8486(2, local4, local9 - 1);
			}
			if (arg4 == 3) {
				this.method8486(160, local4, local9);
				this.method8486(2, local4, local9 - 1);
				this.method8486(8, local4 - 1, local9);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method8486(65536, local4, local9);
					this.method8486(4096, local4 - 1, local9);
				}
				if (arg4 == 1) {
					this.method8486(1024, local4, local9);
					this.method8486(16384, local4, local9 + 1);
				}
				if (arg4 == 2) {
					this.method8486(4096, local4, local9);
					this.method8486(65536, local4 + 1, local9);
				}
				if (arg4 == 3) {
					this.method8486(16384, local4, local9);
					this.method8486(1024, local4, local9 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method8486(512, local4, local9);
					this.method8486(8192, local4 - 1, local9 + 1);
				}
				if (arg4 == 1) {
					this.method8486(2048, local4, local9);
					this.method8486(32768, local4 + 1, local9 + 1);
				}
				if (arg4 == 2) {
					this.method8486(8192, local4, local9);
					this.method8486(512, local4 + 1, local9 + -1);
				}
				if (arg4 == 3) {
					this.method8486(32768, local4, local9);
					this.method8486(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method8486(66560, local4, local9);
					this.method8486(4096, local4 - 1, local9);
					this.method8486(16384, local4, local9 + 1);
				}
				if (arg4 == 1) {
					this.method8486(5120, local4, local9);
					this.method8486(16384, local4, local9 + 1);
					this.method8486(65536, local4 + 1, local9);
				}
				if (arg4 == 2) {
					this.method8486(20480, local4, local9);
					this.method8486(65536, local4 + 1, local9);
					this.method8486(1024, local4, local9 - 1);
				}
				if (arg4 == 3) {
					this.method8486(81920, local4, local9);
					this.method8486(1024, local4, local9 - 1);
					this.method8486(4096, local4 - 1, local9);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method8486(536870912, local4, local9);
				this.method8486(33554432, local4 - 1, local9);
			}
			if (arg4 == 1) {
				this.method8486(8388608, local4, local9);
				this.method8486(134217728, local4, local9 + 1);
			}
			if (arg4 == 2) {
				this.method8486(33554432, local4, local9);
				this.method8486(536870912, local4 + 1, local9);
			}
			if (arg4 == 3) {
				this.method8486(134217728, local4, local9);
				this.method8486(8388608, local4, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method8486(4194304, local4, local9);
				this.method8486(67108864, local4 - 1, local9 - -1);
			}
			if (arg4 == 1) {
				this.method8486(16777216, local4, local9);
				this.method8486(268435456, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method8486(67108864, local4, local9);
				this.method8486(4194304, local4 + 1, local9 + -1);
			}
			if (arg4 == 3) {
				this.method8486(268435456, local4, local9);
				this.method8486(16777216, local4 - 1, local9 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method8486(545259520, local4, local9);
			this.method8486(33554432, local4 - 1, local9);
			this.method8486(134217728, local4, local9 + 1);
		}
		if (arg4 == 1) {
			this.method8486(41943040, local4, local9);
			this.method8486(134217728, local4, local9 + 1);
			this.method8486(536870912, local4 + 1, local9);
		}
		if (arg4 == 2) {
			this.method8486(167772160, local4, local9);
			this.method8486(536870912, local4 + 1, local9);
			this.method8486(8388608, local4, local9 - 1);
		}
		if (arg4 == 3) {
			this.method8486(671088640, local4, local9);
			this.method8486(8388608, local4, local9 - 1);
			this.method8486(33554432, local4 - 1, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIZ)V")
	public void method8484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 - this.anInt10114;
		@Pc(14) int local14 = arg1 - this.anInt10108;
		this.anIntArrayArray56[local14][local9] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method8485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg0 && arg2 == arg6) {
				return true;
			}
		} else if (arg0 >= arg3 && arg0 <= arg3 + arg1 - 1 && arg6 >= arg6 && arg1 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(67) int local67 = arg3 - this.anInt10108;
		@Pc(72) int local72 = arg0 - this.anInt10108;
		@Pc(83) int local83 = arg6 - this.anInt10114;
		@Pc(88) int local88 = arg2 - this.anInt10114;
		if (arg1 == 1) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local67 == local72 - 1 && local88 == local83) {
						return true;
					}
					if (local67 == local72 && local88 == local83 + 1 && (this.anIntArrayArray56[local67][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local83 - 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local67 && local88 == local83 + 1) {
						return true;
					}
					if (local72 - 1 == local67 && local83 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 + 1 && local83 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 == local72 + 1 && local88 == local83) {
						return true;
					}
					if (local72 == local67 && local83 + 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local83 - 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 == local72 && local88 == local83 - 1) {
						return true;
					}
					if (local72 - 1 == local67 && local83 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 + 1 == local67 && local83 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local72 - 1 == local67 && local83 == local88) {
						return true;
					}
					if (local67 == local72 && local83 + 1 == local88) {
						return true;
					}
					if (local72 + 1 == local67 && local88 == local83 && (this.anIntArrayArray56[local67][local88] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local83 - 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 == local72 - 1 && local88 == local83 && (this.anIntArrayArray56[local67][local88] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 && local88 == local83 + 1) {
						return true;
					}
					if (local72 + 1 == local67 && local83 == local88) {
						return true;
					}
					if (local67 == local72 && local83 - 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 == local72 - 1 && local88 == local83 && (this.anIntArrayArray56[local67][local88] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 && local83 + 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 + 1 == local67 && local83 == local88) {
						return true;
					}
					if (local72 == local67 && local83 - 1 == local88) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 == local72 - 1 && local83 == local88) {
						return true;
					}
					if (local67 == local72 && local88 == local83 + 1 && (this.anIntArrayArray56[local67][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 + 1 && local88 == local83 && (this.anIntArrayArray56[local67][local88] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local83 - 1 == local88) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local67 == local72 && local83 + 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x20) == 0) {
					return true;
				}
				if (local72 == local67 && local83 - 1 == local88 && (this.anIntArrayArray56[local67][local88] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local67 && local88 == local83 && (this.anIntArrayArray56[local67][local88] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local67 && local88 == local83 && (this.anIntArrayArray56[local67][local88] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(99) int local99 = arg1 + local67 - 1;
			@Pc(105) int local105 = local88 + arg1 - 1;
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local67 == local72 - arg1 && local88 <= local83 && local105 >= local83) {
						return true;
					}
					if (local72 >= local67 && local72 <= local99 && local83 + 1 == local88 && (this.anIntArrayArray56[local72][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 <= local72 && local72 <= local99 && local83 - arg1 == local88 && (this.anIntArrayArray56[local72][local105] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 >= local67 && local99 >= local72 && local88 == local83 + 1) {
						return true;
					}
					if (local67 == local72 - arg1 && local88 <= local83 && local105 >= local83 && (this.anIntArrayArray56[local99][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 + 1 && local83 >= local88 && local83 <= local105 && (this.anIntArrayArray56[local67][local83] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 == local72 + 1 && local83 >= local88 && local105 >= local83) {
						return true;
					}
					if (local67 <= local72 && local99 >= local72 && local88 == local83 + 1 && (this.anIntArrayArray56[local72][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 >= local67 && local99 >= local72 && local88 == local83 - arg1 && (this.anIntArrayArray56[local72][local105] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 >= local67 && local99 >= local72 && local83 - arg1 == local88) {
						return true;
					}
					if (local72 - arg1 == local67 && local83 >= local88 && local105 >= local83 && (this.anIntArrayArray56[local99][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 + 1 == local67 && local83 >= local88 && local105 >= local83 && (this.anIntArrayArray56[local67][local83] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local67 == local72 - arg1 && local88 <= local83 && local105 >= local83) {
						return true;
					}
					if (local67 <= local72 && local99 >= local72 && local83 + 1 == local88) {
						return true;
					}
					if (local67 == local72 + 1 && local83 >= local88 && local83 <= local105 && (this.anIntArrayArray56[local67][local83] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 >= local67 && local72 <= local99 && local88 == local83 - arg1 && (this.anIntArrayArray56[local72][local105] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 == local72 - arg1 && local83 >= local88 && local105 >= local83 && (this.anIntArrayArray56[local99][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 <= local72 && local72 <= local99 && local88 == local83 + 1) {
						return true;
					}
					if (local67 == local72 + 1 && local83 >= local88 && local105 >= local83) {
						return true;
					}
					if (local72 >= local67 && local72 <= local99 && local88 == local83 - arg1 && (this.anIntArrayArray56[local72][local105] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 == local72 - arg1 && local88 <= local83 && local105 >= local83 && (this.anIntArrayArray56[local99][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 >= local67 && local72 <= local99 && local88 == local83 + 1 && (this.anIntArrayArray56[local72][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 + 1 && local88 <= local83 && local105 >= local83) {
						return true;
					}
					if (local72 >= local67 && local72 <= local99 && local88 == local83 - arg1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 - arg1 == local67 && local88 <= local83 && local105 >= local83) {
						return true;
					}
					if (local72 >= local67 && local72 <= local99 && local88 == local83 + 1 && (this.anIntArrayArray56[local72][local88] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 + 1 == local67 && local83 >= local88 && local105 >= local83 && (this.anIntArrayArray56[local67][local83] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 >= local67 && local99 >= local72 && local83 - arg1 == local88) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local72 >= local67 && local99 >= local72 && local83 + 1 == local88 && (this.anIntArrayArray56[local72][local88] & 0x2C0120) == 0) {
					return true;
				}
				if (local67 <= local72 && local72 <= local99 && local88 == local83 - arg1 && (this.anIntArrayArray56[local72][local105] & 0x2C0102) == 0) {
					return true;
				}
				if (local72 - arg1 == local67 && local88 <= local83 && local83 <= local105 && (this.anIntArrayArray56[local99][local83] & 0x2C0108) == 0) {
					return true;
				}
				if (local72 + 1 == local67 && local88 <= local83 && local83 <= local105 && (this.anIntArrayArray56[local67][local83] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)V")
	private void method8486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray56[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg1 + arg8;
		@Pc(15) int local15 = arg2 + arg3;
		@Pc(30) int local30 = arg0 + arg5;
		@Pc(34) int local34 = arg7 + arg6;
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (local30 == arg1 && (arg4 & 0x2) == 0) {
			local60 = arg6 >= arg2 ? arg6 : arg2;
			local68 = local15 < local34 ? local15 : local34;
			while (local60 < local68) {
				if ((this.anIntArrayArray56[local30 - this.anInt10108 - 1][local60 - this.anInt10114] & 0x8) == 0) {
					return true;
				}
				local60++;
			}
		} else if (local10 == arg5 && (arg4 & 0x8) == 0) {
			local60 = arg6 >= arg2 ? arg6 : arg2;
			local68 = local34 > local15 ? local15 : local34;
			while (local68 > local60) {
				if ((this.anIntArrayArray56[arg5 - this.anInt10108][local60 - this.anInt10114] & 0x80) == 0) {
					return true;
				}
				local60++;
			}
		} else if (arg2 == local34 && (arg4 & 0x1) == 0) {
			local60 = arg1 <= arg5 ? arg5 : arg1;
			local68 = local30 <= local10 ? local30 : local10;
			while (local60 < local68) {
				if ((this.anIntArrayArray56[local60 - this.anInt10108][local34 - this.anInt10114 - 1] & 0x2) == 0) {
					return true;
				}
				local60++;
			}
		} else if (arg6 == local15 && (arg4 & 0x4) == 0) {
			local60 = arg5 >= arg1 ? arg5 : arg1;
			local68 = local30 <= local10 ? local30 : local10;
			while (local68 > local60) {
				if ((this.anIntArrayArray56[local60 - this.anInt10108][arg6 - this.anInt10114] & 0x20) == 0) {
					return true;
				}
				local60++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZZII)V")
	public void method8489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = arg4 - this.anInt10108;
		@Pc(27) int local27 = arg0 - this.anInt10114;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method8495(local22, 128, local27);
				this.method8495(local22 - 1, 8, local27);
			}
			if (arg5 == 1) {
				this.method8495(local22, 2, local27);
				this.method8495(local22, 32, local27 + 1);
			}
			if (arg5 == 2) {
				this.method8495(local22, 8, local27);
				this.method8495(local22 + 1, 128, local27);
			}
			if (arg5 == 3) {
				this.method8495(local22, 32, local27);
				this.method8495(local22, 2, local27 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method8495(local22, 1, local27);
				this.method8495(local22 - 1, 16, local27 + 1);
			}
			if (arg5 == 1) {
				this.method8495(local22, 4, local27);
				this.method8495(local22 + 1, 64, local27 + 1);
			}
			if (arg5 == 2) {
				this.method8495(local22, 16, local27);
				this.method8495(local22 + 1, 1, local27 - 1);
			}
			if (arg5 == 3) {
				this.method8495(local22, 64, local27);
				this.method8495(local22 - 1, 4, local27 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method8495(local22, 130, local27);
				this.method8495(local22 - 1, 8, local27);
				this.method8495(local22, 32, local27 + 1);
			}
			if (arg5 == 1) {
				this.method8495(local22, 10, local27);
				this.method8495(local22, 32, local27 + 1);
				this.method8495(local22 + 1, 128, local27);
			}
			if (arg5 == 2) {
				this.method8495(local22, 40, local27);
				this.method8495(local22 + 1, 128, local27);
				this.method8495(local22, 2, local27 - 1);
			}
			if (arg5 == 3) {
				this.method8495(local22, 160, local27);
				this.method8495(local22, 2, local27 - 1);
				this.method8495(local22 - 1, 8, local27);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method8495(local22, 65536, local27);
					this.method8495(local22 - 1, 4096, local27);
				}
				if (arg5 == 1) {
					this.method8495(local22, 1024, local27);
					this.method8495(local22, 16384, local27 + 1);
				}
				if (arg5 == 2) {
					this.method8495(local22, 4096, local27);
					this.method8495(local22 + 1, 65536, local27);
				}
				if (arg5 == 3) {
					this.method8495(local22, 16384, local27);
					this.method8495(local22, 1024, local27 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method8495(local22, 512, local27);
					this.method8495(local22 - 1, 8192, local27 + 1);
				}
				if (arg5 == 1) {
					this.method8495(local22, 2048, local27);
					this.method8495(local22 + 1, 32768, local27 + 1);
				}
				if (arg5 == 2) {
					this.method8495(local22, 8192, local27);
					this.method8495(local22 + 1, 512, local27 - 1);
				}
				if (arg5 == 3) {
					this.method8495(local22, 32768, local27);
					this.method8495(local22 - 1, 2048, local27 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method8495(local22, 66560, local27);
					this.method8495(local22 - 1, 4096, local27);
					this.method8495(local22, 16384, local27 + 1);
				}
				if (arg5 == 1) {
					this.method8495(local22, 5120, local27);
					this.method8495(local22, 16384, local27 + 1);
					this.method8495(local22 + 1, 65536, local27);
				}
				if (arg5 == 2) {
					this.method8495(local22, 20480, local27);
					this.method8495(local22 + 1, 65536, local27);
					this.method8495(local22, 1024, local27 - 1);
				}
				if (arg5 == 3) {
					this.method8495(local22, 81920, local27);
					this.method8495(local22, 1024, local27 - 1);
					this.method8495(local22 - 1, 4096, local27);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method8495(local22, 536870912, local27);
				this.method8495(local22 - 1, 33554432, local27);
			}
			if (arg5 == 1) {
				this.method8495(local22, 8388608, local27);
				this.method8495(local22, 134217728, local27 + 1);
			}
			if (arg5 == 2) {
				this.method8495(local22, 33554432, local27);
				this.method8495(local22 + 1, 536870912, local27);
			}
			if (arg5 == 3) {
				this.method8495(local22, 134217728, local27);
				this.method8495(local22, 8388608, local27 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method8495(local22, 4194304, local27);
				this.method8495(local22 - 1, 67108864, local27 + 1);
			}
			if (arg5 == 1) {
				this.method8495(local22, 16777216, local27);
				this.method8495(local22 + 1, 268435456, local27 + 1);
			}
			if (arg5 == 2) {
				this.method8495(local22, 67108864, local27);
				this.method8495(local22 + 1, 4194304, local27 - 1);
			}
			if (arg5 == 3) {
				this.method8495(local22, 268435456, local27);
				this.method8495(local22 - 1, 16777216, local27 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method8495(local22, 545259520, local27);
			this.method8495(local22 - 1, 33554432, local27);
			this.method8495(local22, 134217728, local27 + 1);
		}
		if (arg5 == 1) {
			this.method8495(local22, 41943040, local27);
			this.method8495(local22, 134217728, local27 + 1);
			this.method8495(local22 + 1, 536870912, local27);
		}
		if (arg5 == 2) {
			this.method8495(local22, 167772160, local27);
			this.method8495(local22 + 1, 536870912, local27);
			this.method8495(local22, 8388608, local27 - 1);
		}
		if (arg5 == 3) {
			this.method8495(local22, 671088640, local27);
			this.method8495(local22, 8388608, local27 - 1);
			this.method8495(local22 - 1, 33554432, local27);
			return;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIIIIZII)V")
	public void method8491(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(39) int local39;
		if (arg4 == 1 || arg4 == 3) {
			local39 = arg6;
			arg6 = arg1;
			arg1 = local39;
		}
		@Pc(48) int local48 = arg2 - this.anInt10114;
		@Pc(53) int local53 = arg3 - this.anInt10108;
		for (local39 = local53; local39 < local53 + arg6; local39++) {
			if (local39 >= 0 && local39 < this.anInt10104) {
				for (@Pc(73) int local73 = local48; local73 < arg1 + local48; local73++) {
					if (local73 >= 0 && this.anInt10125 > local73) {
						this.method8495(local39, local7, local73);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)V")
	public void method8492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt10108;
		@Pc(9) int local9 = arg0 - this.anInt10114;
		this.anIntArrayArray56[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method8493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg2 == arg5 && arg3 == arg6) {
				return true;
			}
		} else if (arg5 >= arg2 && arg5 <= arg2 + arg4 - 1 && arg3 >= arg3 && arg3 <= arg3 + arg4 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg5 - this.anInt10108;
		@Pc(66) int local66 = arg3 - this.anInt10114;
		@Pc(71) int local71 = arg6 - this.anInt10114;
		@Pc(84) int local84 = arg2 - this.anInt10108;
		if (arg4 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local84 == local61 + 1 && local66 == local71 && (this.anIntArrayArray56[local84][local71] & 0x80) == 0) {
						return true;
					}
					if (local84 == local61 && local66 - 1 == local71 && (this.anIntArrayArray56[local84][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local84 == local61 - 1 && local71 == local66 && (this.anIntArrayArray56[local84][local71] & 0x8) == 0) {
						return true;
					}
					if (local84 == local61 && local71 == local66 - 1 && (this.anIntArrayArray56[local84][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local84 == local61 - 1 && local66 == local71 && (this.anIntArrayArray56[local84][local71] & 0x8) == 0) {
						return true;
					}
					if (local84 == local61 && local66 + 1 == local71 && (this.anIntArrayArray56[local84][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local84 == local61 + 1 && local71 == local66 && (this.anIntArrayArray56[local84][local71] & 0x80) == 0) {
						return true;
					}
					if (local61 == local84 && local71 == local66 + 1 && (this.anIntArrayArray56[local84][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local84 == local61 && local66 + 1 == local71 && (this.anIntArrayArray56[local84][local71] & 0x20) == 0) {
					return true;
				}
				if (local61 == local84 && local71 == local66 - 1 && (this.anIntArrayArray56[local84][local71] & 0x2) == 0) {
					return true;
				}
				if (local61 - 1 == local84 && local66 == local71 && (this.anIntArrayArray56[local84][local71] & 0x8) == 0) {
					return true;
				}
				if (local84 == local61 + 1 && local66 == local71 && (this.anIntArrayArray56[local84][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(93) int local93 = local84 + arg4 - 1;
			@Pc(99) int local99 = arg4 + local71 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local84 == local61 + 1 && local71 <= local66 && local66 <= local99 && (this.anIntArrayArray56[local84][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local84 && local93 >= local61 && local71 == local66 - arg4 && (this.anIntArrayArray56[local61][local99] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local84 == local61 - arg4 && local66 >= local71 && local66 <= local99 && (this.anIntArrayArray56[local93][local66] & 0x8) == 0) {
						return true;
					}
					if (local84 <= local61 && local93 >= local61 && local71 == local66 - arg4 && (this.anIntArrayArray56[local61][local99] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 - arg4 == local84 && local71 <= local66 && local66 <= local99 && (this.anIntArrayArray56[local93][local66] & 0x8) == 0) {
						return true;
					}
					if (local84 <= local61 && local61 <= local93 && local66 + 1 == local71 && (this.anIntArrayArray56[local61][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local84 == local61 + 1 && local66 >= local71 && local66 <= local99 && (this.anIntArrayArray56[local84][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local84 && local93 >= local61 && local71 == local66 + 1 && (this.anIntArrayArray56[local61][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local84 <= local61 && local93 >= local61 && local66 + 1 == local71 && (this.anIntArrayArray56[local61][local71] & 0x20) == 0) {
					return true;
				}
				if (local61 >= local84 && local61 <= local93 && local71 == local66 - arg4 && (this.anIntArrayArray56[local61][local99] & 0x2) == 0) {
					return true;
				}
				if (local61 - arg4 == local84 && local71 <= local66 && local99 >= local66 && (this.anIntArrayArray56[local93][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local84 && local66 >= local71 && local66 <= local99 && (this.anIntArrayArray56[local84][local66] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIZIIII)Z")
	public boolean method8494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static85.method1104(arg6, arg1, arg3, arg5, arg1, arg4, arg0, arg7) ? true : this.method8488(arg0, arg3, arg7, arg1, arg2, arg6, arg4, arg5, arg1);
		}
		@Pc(43) int local43 = arg0 + arg6 - 1;
		@Pc(50) int local50 = arg4 + arg5 - 1;
		if (arg6 <= arg3 && local43 >= arg3 && arg7 >= arg4 && local50 >= arg7) {
			return true;
		} else if (arg6 - 1 == arg3 && arg4 <= arg7 && arg7 <= local50 && (this.anIntArrayArray56[arg3 - this.anInt10108][arg7 - this.anInt10114] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg3 == local43 + 1 && arg4 <= arg7 && arg7 <= local50 && (this.anIntArrayArray56[arg3 - this.anInt10108][arg7 - this.anInt10114] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg7 && arg3 >= arg6 && arg3 <= local43 && (this.anIntArrayArray56[arg3 - this.anInt10108][arg7 - this.anInt10114] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local50 + 1 && arg6 <= arg3 && local43 >= arg3 && (this.anIntArrayArray56[arg3 - this.anInt10108][arg7 - this.anInt10114] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIII)V")
	private void method8495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray56[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
	public void method8498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt10108;
		@Pc(13) int local13 = arg0 - this.anInt10114;
		this.anIntArrayArray56[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)V")
	public void method8499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt10108;
		@Pc(13) int local13 = arg0 - this.anInt10114;
		this.anIntArrayArray56[local4][local13] |= 0x40000;
	}
}

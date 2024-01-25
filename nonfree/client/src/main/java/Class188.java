import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class188 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public int anInt5203;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public int anInt5211;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public int anInt5216;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	public int anInt5222;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	public void method4309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5211;
		@Pc(13) int local13 = arg0 - this.anInt5216;
		this.anIntArrayArray51[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
	public void method4310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5216;
		@Pc(9) int local9 = arg0 - this.anInt5211;
		this.anIntArrayArray51[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	private void method4311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray51[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method4313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static205.method3298(arg6, arg3, arg7, arg0, arg3, arg2, arg4, arg5) ? true : this.method4321(arg6, arg2, arg3, arg4, arg5, arg7, arg0, arg1, arg3);
		}
		@Pc(41) int local41 = arg4 + arg7 - 1;
		@Pc(47) int local47 = arg5 + arg2 - 1;
		if (arg0 >= arg4 && local41 >= arg0 && arg5 <= arg6 && local47 >= arg6) {
			return true;
		} else if (arg4 - 1 == arg0 && arg6 >= arg5 && arg6 <= local47 && (this.anIntArrayArray51[arg0 - this.anInt5211][arg6 - this.anInt5216] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg0 == local41 + 1 && arg6 >= arg5 && local47 >= arg6 && (this.anIntArrayArray51[arg0 - this.anInt5211][arg6 - this.anInt5216] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg6 && arg4 <= arg0 && arg0 <= local41 && (this.anIntArrayArray51[arg0 - this.anInt5211][arg6 - this.anInt5216] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local47 + 1 && arg0 >= arg4 && local41 >= arg0 && (this.anIntArrayArray51[arg0 - this.anInt5211][arg6 - this.anInt5216] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)V")
	public void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt5216;
		@Pc(21) int local21 = arg1 - this.anInt5211;
		this.anIntArrayArray51[local21][local16] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg2 == arg1 && arg6 == arg5) {
				return true;
			}
		} else if (arg1 <= arg2 && arg2 <= arg1 + arg3 - 1 && arg5 >= arg5 && arg5 <= arg5 + arg3 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg5 - this.anInt5216;
		@Pc(71) int local71 = arg6 - this.anInt5216;
		@Pc(76) int local76 = arg2 - this.anInt5211;
		@Pc(81) int local81 = arg1 - this.anInt5211;
		if (arg3 == 1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					if (local76 - 1 == local81 && local71 == local58) {
						return true;
					}
					if (local81 == local76 && local71 == local58 + 1 && (this.anIntArrayArray51[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local81 && local58 - 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local76 == local81 && local71 == local58 + 1) {
						return true;
					}
					if (local76 - 1 == local81 && local58 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 + 1 == local81 && local71 == local58 && (this.anIntArrayArray51[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local76 + 1 == local81 && local71 == local58) {
						return true;
					}
					if (local81 == local76 && local58 + 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local81 && local71 == local58 - 1 && (this.anIntArrayArray51[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local81 == local76 && local58 - 1 == local71) {
						return true;
					}
					if (local76 - 1 == local81 && local58 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local76 + 1 && local58 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					if (local81 == local76 - 1 && local58 == local71) {
						return true;
					}
					if (local81 == local76 && local58 + 1 == local71) {
						return true;
					}
					if (local81 == local76 + 1 && local58 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 == local81 && local58 - 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local76 - 1 == local81 && local58 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local76 && local58 + 1 == local71) {
						return true;
					}
					if (local81 == local76 + 1 && local71 == local58) {
						return true;
					}
					if (local76 == local81 && local58 - 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local76 - 1 == local81 && local71 == local58 && (this.anIntArrayArray51[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local76 && local71 == local58 + 1 && (this.anIntArrayArray51[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 == local76 + 1 && local71 == local58) {
						return true;
					}
					if (local81 == local76 && local58 - 1 == local71) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local81 == local76 - 1 && local71 == local58) {
						return true;
					}
					if (local76 == local81 && local58 + 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 + 1 == local81 && local58 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local81 == local76 && local71 == local58 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local81 == local76 && local58 + 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x20) == 0) {
					return true;
				}
				if (local81 == local76 && local58 - 1 == local71 && (this.anIntArrayArray51[local81][local71] & 0x2) == 0) {
					return true;
				}
				if (local81 == local76 - 1 && local71 == local58 && (this.anIntArrayArray51[local81][local71] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local81 && local71 == local58 && (this.anIntArrayArray51[local81][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(801) int local801 = local81 + arg3 - 1;
			@Pc(808) int local808 = local71 + arg3 - 1;
			if (arg4 == 0) {
				if (arg0 == 0) {
					if (local76 - arg3 == local81 && local71 <= local58 && local58 <= local808) {
						return true;
					}
					if (local76 >= local81 && local801 >= local76 && local58 + 1 == local71 && (this.anIntArrayArray51[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 <= local76 && local801 >= local76 && local58 - arg3 == local71 && (this.anIntArrayArray51[local76][local808] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local76 >= local81 && local76 <= local801 && local71 == local58 + 1) {
						return true;
					}
					if (local76 - arg3 == local81 && local71 <= local58 && local58 <= local808 && (this.anIntArrayArray51[local801][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local76 + 1 && local71 <= local58 && local808 >= local58 && (this.anIntArrayArray51[local81][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local81 == local76 + 1 && local71 <= local58 && local808 >= local58) {
						return true;
					}
					if (local76 >= local81 && local76 <= local801 && local58 + 1 == local71 && (this.anIntArrayArray51[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 >= local81 && local801 >= local76 && local71 == local58 - arg3 && (this.anIntArrayArray51[local76][local808] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local76 >= local81 && local76 <= local801 && local58 - arg3 == local71) {
						return true;
					}
					if (local81 == local76 - arg3 && local71 <= local58 && local58 <= local808 && (this.anIntArrayArray51[local801][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 + 1 == local81 && local58 >= local71 && local808 >= local58 && (this.anIntArrayArray51[local81][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					if (local81 == local76 - arg3 && local71 <= local58 && local808 >= local58) {
						return true;
					}
					if (local81 <= local76 && local801 >= local76 && local71 == local58 + 1) {
						return true;
					}
					if (local76 + 1 == local81 && local71 <= local58 && local808 >= local58 && (this.anIntArrayArray51[local81][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local81 <= local76 && local801 >= local76 && local58 - arg3 == local71 && (this.anIntArrayArray51[local76][local808] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local81 == local76 - arg3 && local71 <= local58 && local808 >= local58 && (this.anIntArrayArray51[local801][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 >= local81 && local801 >= local76 && local71 == local58 + 1) {
						return true;
					}
					if (local76 + 1 == local81 && local71 <= local58 && local58 <= local808) {
						return true;
					}
					if (local76 >= local81 && local801 >= local76 && local58 - arg3 == local71 && (this.anIntArrayArray51[local76][local808] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local76 - arg3 == local81 && local71 <= local58 && local808 >= local58 && (this.anIntArrayArray51[local801][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 >= local81 && local76 <= local801 && local71 == local58 + 1 && (this.anIntArrayArray51[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 + 1 == local81 && local58 >= local71 && local808 >= local58) {
						return true;
					}
					if (local81 <= local76 && local801 >= local76 && local71 == local58 - arg3) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local76 - arg3 == local81 && local71 <= local58 && local808 >= local58) {
						return true;
					}
					if (local81 <= local76 && local76 <= local801 && local71 == local58 + 1 && (this.anIntArrayArray51[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 == local76 + 1 && local58 >= local71 && local58 <= local808 && (this.anIntArrayArray51[local81][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 >= local81 && local801 >= local76 && local58 - arg3 == local71) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local76 >= local81 && local801 >= local76 && local58 + 1 == local71 && (this.anIntArrayArray51[local76][local71] & 0x2C0120) == 0) {
					return true;
				}
				if (local76 >= local81 && local76 <= local801 && local58 - arg3 == local71 && (this.anIntArrayArray51[local76][local808] & 0x2C0102) == 0) {
					return true;
				}
				if (local81 == local76 - arg3 && local71 <= local58 && local808 >= local58 && (this.anIntArrayArray51[local801][local58] & 0x2C0108) == 0) {
					return true;
				}
				if (local76 + 1 == local81 && local58 >= local71 && local808 >= local58 && (this.anIntArrayArray51[local81][local58] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIZZII)V")
	public void method4316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 - this.anInt5216;
		@Pc(18) int local18 = arg5 - this.anInt5211;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method4311(local18, 128, local9);
				this.method4311(local18 - 1, 8, local9);
			}
			if (arg1 == 1) {
				this.method4311(local18, 2, local9);
				this.method4311(local18, 32, local9 + 1);
			}
			if (arg1 == 2) {
				this.method4311(local18, 8, local9);
				this.method4311(local18 + 1, 128, local9);
			}
			if (arg1 == 3) {
				this.method4311(local18, 32, local9);
				this.method4311(local18, 2, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method4311(local18, 1, local9);
				this.method4311(local18 - 1, 16, local9 + 1);
			}
			if (arg1 == 1) {
				this.method4311(local18, 4, local9);
				this.method4311(local18 + 1, 64, local9 + 1);
			}
			if (arg1 == 2) {
				this.method4311(local18, 16, local9);
				this.method4311(local18 + 1, 1, local9 - 1);
			}
			if (arg1 == 3) {
				this.method4311(local18, 64, local9);
				this.method4311(local18 - 1, 4, local9 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method4311(local18, 130, local9);
				this.method4311(local18 - 1, 8, local9);
				this.method4311(local18, 32, local9 + 1);
			}
			if (arg1 == 1) {
				this.method4311(local18, 10, local9);
				this.method4311(local18, 32, local9 + 1);
				this.method4311(local18 + 1, 128, local9);
			}
			if (arg1 == 2) {
				this.method4311(local18, 40, local9);
				this.method4311(local18 + 1, 128, local9);
				this.method4311(local18, 2, local9 - 1);
			}
			if (arg1 == 3) {
				this.method4311(local18, 160, local9);
				this.method4311(local18, 2, local9 - 1);
				this.method4311(local18 - 1, 8, local9);
			}
		}
		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method4311(local18, 65536, local9);
					this.method4311(local18 - 1, 4096, local9);
				}
				if (arg1 == 1) {
					this.method4311(local18, 1024, local9);
					this.method4311(local18, 16384, local9 + 1);
				}
				if (arg1 == 2) {
					this.method4311(local18, 4096, local9);
					this.method4311(local18 + 1, 65536, local9);
				}
				if (arg1 == 3) {
					this.method4311(local18, 16384, local9);
					this.method4311(local18, 1024, local9 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method4311(local18, 512, local9);
					this.method4311(local18 - 1, 8192, local9 + 1);
				}
				if (arg1 == 1) {
					this.method4311(local18, 2048, local9);
					this.method4311(local18 + 1, 32768, local9 + 1);
				}
				if (arg1 == 2) {
					this.method4311(local18, 8192, local9);
					this.method4311(local18 + 1, 512, local9 - 1);
				}
				if (arg1 == 3) {
					this.method4311(local18, 32768, local9);
					this.method4311(local18 - 1, 2048, local9 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method4311(local18, 66560, local9);
					this.method4311(local18 - 1, 4096, local9);
					this.method4311(local18, 16384, local9 + 1);
				}
				if (arg1 == 1) {
					this.method4311(local18, 5120, local9);
					this.method4311(local18, 16384, local9 + 1);
					this.method4311(local18 + 1, 65536, local9);
				}
				if (arg1 == 2) {
					this.method4311(local18, 20480, local9);
					this.method4311(local18 + 1, 65536, local9);
					this.method4311(local18, 1024, local9 - 1);
				}
				if (arg1 == 3) {
					this.method4311(local18, 81920, local9);
					this.method4311(local18, 1024, local9 - 1);
					this.method4311(local18 - 1, 4096, local9);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method4311(local18, 536870912, local9);
				this.method4311(local18 - 1, 33554432, local9);
			}
			if (arg1 == 1) {
				this.method4311(local18, 8388608, local9);
				this.method4311(local18, 134217728, local9 + 1);
			}
			if (arg1 == 2) {
				this.method4311(local18, 33554432, local9);
				this.method4311(local18 + 1, 536870912, local9);
			}
			if (arg1 == 3) {
				this.method4311(local18, 134217728, local9);
				this.method4311(local18, 8388608, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method4311(local18, 4194304, local9);
				this.method4311(local18 - 1, 67108864, local9 + 1);
			}
			if (arg1 == 1) {
				this.method4311(local18, 16777216, local9);
				this.method4311(local18 + 1, 268435456, local9 + 1);
			}
			if (arg1 == 2) {
				this.method4311(local18, 67108864, local9);
				this.method4311(local18 + 1, 4194304, local9 - 1);
			}
			if (arg1 == 3) {
				this.method4311(local18, 268435456, local9);
				this.method4311(local18 - 1, 16777216, local9 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method4311(local18, 545259520, local9);
			this.method4311(local18 - 1, 33554432, local9);
			this.method4311(local18, 134217728, local9 + 1);
		}
		if (arg1 == 1) {
			this.method4311(local18, 41943040, local9);
			this.method4311(local18, 134217728, local9 + 1);
			this.method4311(local18 + 1, 536870912, local9);
		}
		if (arg1 == 2) {
			this.method4311(local18, 167772160, local9);
			this.method4311(local18 + 1, 536870912, local9);
			this.method4311(local18, 8388608, local9 - 1);
		}
		if (arg1 == 3) {
			this.method4311(local18, 671088640, local9);
			this.method4311(local18, 8388608, local9 - 1);
			this.method4311(local18 - 1, 33554432, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)V")
	public void method4317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5216;
		@Pc(13) int local13 = arg0 - this.anInt5211;
		this.anIntArrayArray51[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBZIIIZ)V")
	public void method4318(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg4 - this.anInt5211;
		@Pc(13) int local13 = arg0 - this.anInt5216;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method4322(local8, 128, local13);
				this.method4322(local8 - 1, 8, local13);
			}
			if (arg2 == 1) {
				this.method4322(local8, 2, local13);
				this.method4322(local8, 32, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4322(local8, 8, local13);
				this.method4322(local8 + 1, 128, local13);
			}
			if (arg2 == 3) {
				this.method4322(local8, 32, local13);
				this.method4322(local8, 2, local13 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method4322(local8, 1, local13);
				this.method4322(local8 - 1, 16, local13 + 1);
			}
			if (arg2 == 1) {
				this.method4322(local8, 4, local13);
				this.method4322(local8 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4322(local8, 16, local13);
				this.method4322(local8 + 1, 1, local13 - 1);
			}
			if (arg2 == 3) {
				this.method4322(local8, 64, local13);
				this.method4322(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method4322(local8, 130, local13);
				this.method4322(local8 - 1, 8, local13);
				this.method4322(local8, 32, local13 + 1);
			}
			if (arg2 == 1) {
				this.method4322(local8, 10, local13);
				this.method4322(local8, 32, local13 + 1);
				this.method4322(local8 + 1, 128, local13);
			}
			if (arg2 == 2) {
				this.method4322(local8, 40, local13);
				this.method4322(local8 + 1, 128, local13);
				this.method4322(local8, 2, local13 - 1);
			}
			if (arg2 == 3) {
				this.method4322(local8, 160, local13);
				this.method4322(local8, 2, local13 - 1);
				this.method4322(local8 - 1, 8, local13);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method4322(local8, 65536, local13);
					this.method4322(local8 - 1, 4096, local13);
				}
				if (arg2 == 1) {
					this.method4322(local8, 1024, local13);
					this.method4322(local8, 16384, local13 + 1);
				}
				if (arg2 == 2) {
					this.method4322(local8, 4096, local13);
					this.method4322(local8 + 1, 65536, local13);
				}
				if (arg2 == 3) {
					this.method4322(local8, 16384, local13);
					this.method4322(local8, 1024, local13 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method4322(local8, 512, local13);
					this.method4322(local8 - 1, 8192, local13 + 1);
				}
				if (arg2 == 1) {
					this.method4322(local8, 2048, local13);
					this.method4322(local8 + 1, 32768, local13 + 1);
				}
				if (arg2 == 2) {
					this.method4322(local8, 8192, local13);
					this.method4322(local8 + 1, 512, local13 - 1);
				}
				if (arg2 == 3) {
					this.method4322(local8, 32768, local13);
					this.method4322(local8 - 1, 2048, local13 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method4322(local8, 66560, local13);
					this.method4322(local8 - 1, 4096, local13);
					this.method4322(local8, 16384, local13 + 1);
				}
				if (arg2 == 1) {
					this.method4322(local8, 5120, local13);
					this.method4322(local8, 16384, local13 + 1);
					this.method4322(local8 + 1, 65536, local13);
				}
				if (arg2 == 2) {
					this.method4322(local8, 20480, local13);
					this.method4322(local8 + 1, 65536, local13);
					this.method4322(local8, 1024, local13 - 1);
				}
				if (arg2 == 3) {
					this.method4322(local8, 81920, local13);
					this.method4322(local8, 1024, local13 - 1);
					this.method4322(local8 - 1, 4096, local13);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method4322(local8, 536870912, local13);
				this.method4322(local8 - 1, 33554432, local13);
			}
			if (arg2 == 1) {
				this.method4322(local8, 8388608, local13);
				this.method4322(local8, 134217728, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4322(local8, 33554432, local13);
				this.method4322(local8 + 1, 536870912, local13);
			}
			if (arg2 == 3) {
				this.method4322(local8, 134217728, local13);
				this.method4322(local8, 8388608, local13 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method4322(local8, 4194304, local13);
				this.method4322(local8 - 1, 67108864, local13 + 1);
			}
			if (arg2 == 1) {
				this.method4322(local8, 16777216, local13);
				this.method4322(local8 + 1, 268435456, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4322(local8, 67108864, local13);
				this.method4322(local8 + 1, 4194304, local13 - 1);
			}
			if (arg2 == 3) {
				this.method4322(local8, 268435456, local13);
				this.method4322(local8 - 1, 16777216, local13 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method4322(local8, 545259520, local13);
			this.method4322(local8 - 1, 33554432, local13);
			this.method4322(local8, 134217728, local13 + 1);
		}
		if (arg2 == 1) {
			this.method4322(local8, 41943040, local13);
			this.method4322(local8, 134217728, local13 + 1);
			this.method4322(local8 + 1, 536870912, local13);
		}
		if (arg2 == 2) {
			this.method4322(local8, 167772160, local13);
			this.method4322(local8 + 1, 536870912, local13);
			this.method4322(local8, 8388608, local13 - 1);
		}
		if (arg2 == 3) {
			this.method4322(local8, 671088640, local13);
			this.method4322(local8, 8388608, local13 - 1);
			this.method4322(local8 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method4319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg1 && arg2 == arg5) {
				return true;
			}
		} else if (arg4 >= arg1 && arg4 <= arg1 + arg0 - 1 && arg5 <= arg5 && arg5 + arg0 - 1 >= arg5) {
			return true;
		}
		@Pc(59) int local59 = arg1 - this.anInt5211;
		@Pc(64) int local64 = arg5 - this.anInt5216;
		@Pc(69) int local69 = arg4 - this.anInt5211;
		@Pc(74) int local74 = arg2 - this.anInt5216;
		if (arg0 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local59 == local69 + 1 && local74 == local64 && (this.anIntArrayArray51[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local69 == local59 && local64 - 1 == local74 && (this.anIntArrayArray51[local59][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 == local69 - 1 && local74 == local64 && (this.anIntArrayArray51[local59][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 == local69 && local74 == local64 - 1 && (this.anIntArrayArray51[local59][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local69 - 1 == local59 && local64 == local74 && (this.anIntArrayArray51[local59][local74] & 0x8) == 0) {
						return true;
					}
					if (local69 == local59 && local74 == local64 + 1 && (this.anIntArrayArray51[local59][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 == local69 + 1 && local64 == local74 && (this.anIntArrayArray51[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local69 == local59 && local74 == local64 + 1 && (this.anIntArrayArray51[local59][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local59 == local69 && local64 + 1 == local74 && (this.anIntArrayArray51[local59][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 == local69 && local64 - 1 == local74 && (this.anIntArrayArray51[local59][local74] & 0x2) == 0) {
					return true;
				}
				if (local59 == local69 - 1 && local74 == local64 && (this.anIntArrayArray51[local59][local74] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local59 && local74 == local64 && (this.anIntArrayArray51[local59][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(414) int local414 = local59 + arg0 - 1;
			@Pc(420) int local420 = arg0 + local74 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local69 + 1 == local59 && local74 <= local64 && local420 >= local64 && (this.anIntArrayArray51[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local414 && local74 == local64 - arg0 && (this.anIntArrayArray51[local69][local420] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local69 - arg0 == local59 && local64 >= local74 && local64 <= local420 && (this.anIntArrayArray51[local414][local64] & 0x8) == 0) {
						return true;
					}
					if (local69 >= local59 && local69 <= local414 && local74 == local64 - arg0 && (this.anIntArrayArray51[local69][local420] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local69 - arg0 == local59 && local74 <= local64 && local420 >= local64 && (this.anIntArrayArray51[local414][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local69 && local414 >= local69 && local64 + 1 == local74 && (this.anIntArrayArray51[local69][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 == local69 + 1 && local64 >= local74 && local64 <= local420 && (this.anIntArrayArray51[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local414 && local64 + 1 == local74 && (this.anIntArrayArray51[local69][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local69 >= local59 && local69 <= local414 && local74 == local64 + 1 && (this.anIntArrayArray51[local69][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 <= local69 && local414 >= local69 && local64 - arg0 == local74 && (this.anIntArrayArray51[local69][local420] & 0x2) == 0) {
					return true;
				}
				if (local69 - arg0 == local59 && local64 >= local74 && local420 >= local64 && (this.anIntArrayArray51[local414][local64] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local59 && local74 <= local64 && local64 <= local420 && (this.anIntArrayArray51[local59][local64] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method4320() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5203; local13++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt5222; local16++) {
				if (local13 == 0 || local16 == 0 || this.anInt5203 - 5 <= local13 || this.anInt5222 - 5 <= local16) {
					this.anIntArrayArray51[local13][local16] = -1;
				} else {
					this.anIntArrayArray51[local13][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIIB)Z")
	public boolean method4321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) int local7 = arg2 + arg6;
		@Pc(11) int local11 = arg8 + arg0;
		@Pc(15) int local15 = arg5 + arg3;
		@Pc(19) int local19 = arg4 + arg1;
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (arg6 == local15 && (arg7 & 0x2) == 0) {
			local47 = arg4 >= arg0 ? arg4 : arg0;
			local54 = local11 < local19 ? local11 : local19;
			while (local47 < local54) {
				if ((this.anIntArrayArray51[local15 - this.anInt5211 - 1][local47 - this.anInt5216] & 0x8) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local7 == arg3 && (arg7 & 0x8) == 0) {
			local47 = arg0 > arg4 ? arg0 : arg4;
			local54 = local11 >= local19 ? local19 : local11;
			while (local47 < local54) {
				if ((this.anIntArrayArray51[arg3 - this.anInt5211][local47 - this.anInt5216] & 0x80) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local19 == arg0 && (arg7 & 0x1) == 0) {
			local47 = arg6 <= arg3 ? arg3 : arg6;
			local54 = local15 > local7 ? local7 : local15;
			while (local47 < local54) {
				if ((this.anIntArrayArray51[local47 - this.anInt5211][local19 - this.anInt5216 - 1] & 0x2) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg4 == local11 && (arg7 & 0x4) == 0) {
			local47 = arg3 < arg6 ? arg6 : arg3;
			local54 = local15 > local7 ? local7 : local15;
			while (local47 < local54) {
				if ((this.anIntArrayArray51[local47 - this.anInt5211][arg4 - this.anInt5216] & 0x20) == 0) {
					return true;
				}
				local47++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(IIII)V")
	private void method4322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray51[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZIIIZII)V")
	public void method4323(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt5216;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(36) int local36;
		if (arg2 == 1 || arg2 == 3) {
			local36 = arg3;
			arg3 = arg6;
			arg6 = local36;
		}
		@Pc(45) int local45 = arg0 - this.anInt5211;
		for (local36 = local45; local36 < local45 + arg3; local36++) {
			if (local36 >= 0 && this.anInt5203 > local36) {
				for (@Pc(65) int local65 = local18; local65 < local18 + arg6; local65++) {
					if (local65 >= 0 && this.anInt5222 > local65) {
						this.method4311(local36, local7, local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZZIIIII)V")
	public void method4324(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt5216;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg3 - this.anInt5211;
		for (@Pc(31) int local31 = local29; local31 < local29 + arg4; local31++) {
			if (local31 >= 0 && local31 < this.anInt5203) {
				for (@Pc(47) int local47 = local18; local47 < arg5 + local18; local47++) {
					if (local47 >= 0 && this.anInt5222 > local47) {
						this.method4322(local31, local7, local47);
					}
				}
			}
		}
	}
}

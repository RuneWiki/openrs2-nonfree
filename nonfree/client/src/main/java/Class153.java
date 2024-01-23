import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class153 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	private int anInt4893;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	private int anInt4883;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	private int anInt4888;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4893 = arg1;
		this.anInt4883 = 0;
		this.anInt4896 = 0;
		this.anInt4888 = arg0;
		this.anIntArrayArray69 = new int[this.anInt4888][this.anInt4893];
		this.method4081();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZIIZ)V")
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg0 - this.anInt4883;
		@Pc(8) int local8 = 256;
		@Pc(13) int local13 = arg3 - this.anInt4896;
		if (arg2) {
			local8 = 131328;
		}
		if (arg5) {
			local8 |= 0x40000000;
		}
		for (@Pc(32) int local32 = local6; local32 < arg4 + local6; local32++) {
			if (local32 >= 0 && local32 < this.anInt4888) {
				for (@Pc(49) int local49 = local13; local49 < arg1 + local13; local49++) {
					if (local49 >= 0 && this.anInt4893 > local49) {
						this.method4082(local32, local8, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZI)Z")
	public boolean method4076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == arg3 && arg0 == arg2) {
			return true;
		}
		@Pc(23) int local23 = arg3 - this.anInt4883;
		@Pc(28) int local28 = arg2 - this.anInt4896;
		if (local23 < 0 || this.anInt4888 <= local23 || local28 < 0 || this.anInt4893 <= local28) {
			return false;
		}
		@Pc(58) int local58 = arg1 - this.anInt4883;
		@Pc(63) int local63 = arg0 - this.anInt4896;
		if (local58 < 0 || local58 >= this.anInt4888 || local63 < 0 || this.anInt4893 <= local63) {
			return false;
		}
		@Pc(103) int local103;
		if (local23 > local58) {
			local103 = local23 - local58;
		} else {
			local103 = local58 - local23;
		}
		@Pc(122) int local122;
		if (local63 >= local28) {
			local122 = local63 - local28;
		} else {
			local122 = local28 - local63;
		}
		@Pc(138) int local138;
		@Pc(140) int local140;
		if (local122 < local103) {
			local138 = local122 * 65536 / local103;
			local140 = 32768;
			while (local23 != local58) {
				if (local58 < local23) {
					if ((this.anIntArrayArray69[local58][local63] & 0x2C0108) != 0) {
						return false;
					}
					local58++;
				} else if (local23 < local58) {
					if ((this.anIntArrayArray69[local58][local63] & 0x2C0180) != 0) {
						return false;
					}
					local58--;
				}
				local140 += local138;
				if (local140 >= 65536) {
					local140 -= 65536;
					if (local28 > local63) {
						if ((this.anIntArrayArray69[local58][local63] & 0x2C0102) != 0) {
							return false;
						}
						local63++;
					} else if (local63 > local28) {
						if ((this.anIntArrayArray69[local58][local63] & 0x2C0120) != 0) {
							return false;
						}
						local63--;
					}
				}
			}
		} else {
			local138 = local103 * 65536 / local122;
			local140 = 32768;
			while (local28 != local63) {
				if (local63 < local28) {
					if ((this.anIntArrayArray69[local58][local63] & 0x2C0102) != 0) {
						return false;
					}
					local63++;
				} else if (local28 < local63) {
					if ((this.anIntArrayArray69[local58][local63] & 0x2C0120) != 0) {
						return false;
					}
					local63--;
				}
				local140 += local138;
				if (local140 >= 65536) {
					local140 -= 65536;
					if (local23 > local58) {
						if ((this.anIntArrayArray69[local58][local63] & 0x2C0108) != 0) {
							return false;
						}
						local58++;
					} else if (local23 < local58) {
						if ((this.anIntArrayArray69[local58][local63] & 0x2C0180) != 0) {
							return false;
						}
						local58--;
					}
				}
			}
		}
		return (this.anIntArrayArray69[local23][local28] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg0 && arg4 == arg3) {
				return true;
			}
		} else if (arg5 <= arg0 && arg0 <= arg5 + arg6 - 1 && arg4 <= arg4 && arg4 <= arg6 + arg4 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg4 - this.anInt4896;
		@Pc(60) int local60 = arg5 - this.anInt4883;
		@Pc(65) int local65 = arg0 - this.anInt4883;
		@Pc(70) int local70 = arg3 - this.anInt4896;
		if (arg6 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local65 + 1 == local60 && local55 == local70 && (this.anIntArrayArray69[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local60 == local65 && local70 == local55 - 1 && (this.anIntArrayArray69[local60][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local60 == local65 - 1 && local55 == local70 && (this.anIntArrayArray69[local60][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 == local60 && local55 - 1 == local70 && (this.anIntArrayArray69[local60][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local60 == local65 - 1 && local70 == local55 && (this.anIntArrayArray69[local60][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 == local60 && local70 == local55 + 1 && (this.anIntArrayArray69[local60][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local65 + 1 == local60 && local55 == local70 && (this.anIntArrayArray69[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 == local60 && local55 + 1 == local70 && (this.anIntArrayArray69[local60][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local60 == local65 && local70 == local55 + 1 && (this.anIntArrayArray69[local60][local70] & 0x20) == 0) {
					return true;
				}
				if (local60 == local65 && local55 - 1 == local70 && (this.anIntArrayArray69[local60][local70] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local60 && local70 == local55 && (this.anIntArrayArray69[local60][local70] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local60 && local70 == local55 && (this.anIntArrayArray69[local60][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(79) int local79 = local70 + arg6 - 1;
			@Pc(85) int local85 = local60 + arg6 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local65 + 1 == local60 && local55 >= local70 && local79 >= local55 && (this.anIntArrayArray69[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 <= local65 && local65 <= local85 && local70 == local55 - arg6 && (this.anIntArrayArray69[local65][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local60 == local65 - arg6 && local55 >= local70 && local55 <= local79 && (this.anIntArrayArray69[local85][local55] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local60 && local85 >= local65 && local55 - arg6 == local70 && (this.anIntArrayArray69[local65][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local65 - arg6 == local60 && local70 <= local55 && local79 >= local55 && (this.anIntArrayArray69[local85][local55] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local60 && local65 <= local85 && local55 + 1 == local70 && (this.anIntArrayArray69[local65][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local65 + 1 == local60 && local70 <= local55 && local79 >= local55 && (this.anIntArrayArray69[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local60 && local65 <= local85 && local70 == local55 + 1 && (this.anIntArrayArray69[local65][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local60 <= local65 && local65 <= local85 && local70 == local55 + 1 && (this.anIntArrayArray69[local65][local70] & 0x20) == 0) {
					return true;
				}
				if (local60 <= local65 && local85 >= local65 && local55 - arg6 == local70 && (this.anIntArrayArray69[local65][local79] & 0x2) == 0) {
					return true;
				}
				if (local60 == local65 - arg6 && local70 <= local55 && local55 <= local79 && (this.anIntArrayArray69[local85][local55] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local60 && local70 <= local55 && local79 >= local55 && (this.anIntArrayArray69[local60][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)V")
	public void method4078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4883;
		@Pc(13) int local13 = arg0 - this.anInt4896;
		this.anIntArrayArray69[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 <= 1) {
			@Pc(39) int local39 = arg0 + arg6 - 1;
			@Pc(45) int local45 = arg1 + arg5 - 1;
			if (arg6 <= arg3 && arg3 <= local39 && arg5 <= arg2 && local45 >= arg2) {
				return true;
			} else if (arg3 == arg6 - 1 && arg5 <= arg2 && arg2 <= local45 && (this.anIntArrayArray69[arg3 - this.anInt4883][arg2 - this.anInt4896] & 0x8) == 0 && (arg7 & 0x8) == 0) {
				return true;
			} else if (arg3 == local39 + 1 && arg5 <= arg2 && local45 >= arg2 && (this.anIntArrayArray69[arg3 - this.anInt4883][arg2 - this.anInt4896] & 0x80) == 0 && (arg7 & 0x2) == 0) {
				return true;
			} else if (arg2 == arg5 - 1 && arg3 >= arg6 && local39 >= arg3 && (this.anIntArrayArray69[arg3 - this.anInt4883][arg2 - this.anInt4896] & 0x2) == 0 && (arg7 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local45 + 1 && arg6 <= arg3 && local39 >= arg3 && (this.anIntArrayArray69[arg3 - this.anInt4883][arg2 - this.anInt4896] & 0x20) == 0 && (arg7 & 0x1) == 0;
			}
		} else if (Static75.method1161(arg2, arg3, arg1, arg0, arg5, arg6, arg4, arg4)) {
			return true;
		} else {
			return this.method4087(arg7, arg3, arg2, arg4, arg1, arg0, arg5, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZBIZ)V")
	public void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt4883;
		@Pc(13) int local13 = arg1 - this.anInt4896;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method4092(local13, 128, local4);
				this.method4092(local13, 8, local4 - 1);
			}
			if (arg4 == 1) {
				this.method4092(local13, 2, local4);
				this.method4092(local13 + 1, 32, local4);
			}
			if (arg4 == 2) {
				this.method4092(local13, 8, local4);
				this.method4092(local13, 128, local4 + 1);
			}
			if (arg4 == 3) {
				this.method4092(local13, 32, local4);
				this.method4092(local13 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method4092(local13, 1, local4);
				this.method4092(local13 + 1, 16, local4 - 1);
			}
			if (arg4 == 1) {
				this.method4092(local13, 4, local4);
				this.method4092(local13 + 1, 64, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4092(local13, 16, local4);
				this.method4092(local13 - 1, 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method4092(local13, 64, local4);
				this.method4092(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method4092(local13, 130, local4);
				this.method4092(local13, 8, local4 - 1);
				this.method4092(local13 + 1, 32, local4);
			}
			if (arg4 == 1) {
				this.method4092(local13, 10, local4);
				this.method4092(local13 + 1, 32, local4);
				this.method4092(local13, 128, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4092(local13, 40, local4);
				this.method4092(local13, 128, local4 + 1);
				this.method4092(local13 - 1, 2, local4);
			}
			if (arg4 == 3) {
				this.method4092(local13, 160, local4);
				this.method4092(local13 - 1, 2, local4);
				this.method4092(local13, 8, local4 - 1);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method4092(local13, 65536, local4);
					this.method4092(local13, 4096, local4 - 1);
				}
				if (arg4 == 1) {
					this.method4092(local13, 1024, local4);
					this.method4092(local13 + 1, 16384, local4);
				}
				if (arg4 == 2) {
					this.method4092(local13, 4096, local4);
					this.method4092(local13, 65536, local4 + 1);
				}
				if (arg4 == 3) {
					this.method4092(local13, 16384, local4);
					this.method4092(local13 - 1, 1024, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method4092(local13, 512, local4);
					this.method4092(local13 + 1, 8192, local4 - 1);
				}
				if (arg4 == 1) {
					this.method4092(local13, 2048, local4);
					this.method4092(local13 + 1, 32768, local4 + 1);
				}
				if (arg4 == 2) {
					this.method4092(local13, 8192, local4);
					this.method4092(local13 - 1, 512, local4 + 1);
				}
				if (arg4 == 3) {
					this.method4092(local13, 32768, local4);
					this.method4092(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method4092(local13, 66560, local4);
					this.method4092(local13, 4096, local4 - 1);
					this.method4092(local13 + 1, 16384, local4);
				}
				if (arg4 == 1) {
					this.method4092(local13, 5120, local4);
					this.method4092(local13 + 1, 16384, local4);
					this.method4092(local13, 65536, local4 + 1);
				}
				if (arg4 == 2) {
					this.method4092(local13, 20480, local4);
					this.method4092(local13, 65536, local4 + 1);
					this.method4092(local13 - 1, 1024, local4);
				}
				if (arg4 == 3) {
					this.method4092(local13, 81920, local4);
					this.method4092(local13 - 1, 1024, local4);
					this.method4092(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method4092(local13, 536870912, local4);
				this.method4092(local13, 33554432, local4 - 1);
			}
			if (arg4 == 1) {
				this.method4092(local13, 8388608, local4);
				this.method4092(local13 + 1, 134217728, local4);
			}
			if (arg4 == 2) {
				this.method4092(local13, 33554432, local4);
				this.method4092(local13, 536870912, local4 + 1);
			}
			if (arg4 == 3) {
				this.method4092(local13, 134217728, local4);
				this.method4092(local13 - 1, 8388608, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method4092(local13, 4194304, local4);
				this.method4092(local13 + 1, 67108864, local4 - 1);
			}
			if (arg4 == 1) {
				this.method4092(local13, 16777216, local4);
				this.method4092(local13 + 1, 268435456, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4092(local13, 67108864, local4);
				this.method4092(local13 - 1, 4194304, local4 + 1);
			}
			if (arg4 == 3) {
				this.method4092(local13, 268435456, local4);
				this.method4092(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4092(local13, 545259520, local4);
			this.method4092(local13, 33554432, local4 - 1);
			this.method4092(local13 + 1, 134217728, local4);
		}
		if (arg4 == 1) {
			this.method4092(local13, 41943040, local4);
			this.method4092(local13 + 1, 134217728, local4);
			this.method4092(local13, 536870912, local4 + 1);
		}
		if (arg4 == 2) {
			this.method4092(local13, 167772160, local4);
			this.method4092(local13, 536870912, local4 + 1);
			this.method4092(local13 - 1, 8388608, local4);
		}
		if (arg4 == 3) {
			this.method4092(local13, 671088640, local4);
			this.method4092(local13 - 1, 8388608, local4);
			this.method4092(local13, 33554432, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method4081() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt4888; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt4893; local18++) {
				if (local12 == 0 || local18 == 0 || this.anInt4888 - 5 <= local12 || this.anInt4893 - 5 <= local18) {
					this.anIntArrayArray69[local12][local18] = 16777215;
				} else {
					this.anIntArrayArray69[local12][local18] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIII)V")
	private void method4082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray69[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIZIIZ)V")
	public void method4084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt4896;
		@Pc(9) int local9 = arg0 - this.anInt4883;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method4082(local9, 128, local4);
				this.method4082(local9 - 1, 8, local4);
			}
			if (arg4 == 1) {
				this.method4082(local9, 2, local4);
				this.method4082(local9, 32, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4082(local9, 8, local4);
				this.method4082(local9 + 1, 128, local4);
			}
			if (arg4 == 3) {
				this.method4082(local9, 32, local4);
				this.method4082(local9, 2, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method4082(local9, 1, local4);
				this.method4082(local9 - 1, 16, local4 + 1);
			}
			if (arg4 == 1) {
				this.method4082(local9, 4, local4);
				this.method4082(local9 + 1, 64, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4082(local9, 16, local4);
				this.method4082(local9 + 1, 1, local4 - 1);
			}
			if (arg4 == 3) {
				this.method4082(local9, 64, local4);
				this.method4082(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method4082(local9, 130, local4);
				this.method4082(local9 - 1, 8, local4);
				this.method4082(local9, 32, local4 + 1);
			}
			if (arg4 == 1) {
				this.method4082(local9, 10, local4);
				this.method4082(local9, 32, local4 + 1);
				this.method4082(local9 + 1, 128, local4);
			}
			if (arg4 == 2) {
				this.method4082(local9, 40, local4);
				this.method4082(local9 + 1, 128, local4);
				this.method4082(local9, 2, local4 - 1);
			}
			if (arg4 == 3) {
				this.method4082(local9, 160, local4);
				this.method4082(local9, 2, local4 - 1);
				this.method4082(local9 - 1, 8, local4);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method4082(local9, 65536, local4);
					this.method4082(local9 - 1, 4096, local4);
				}
				if (arg4 == 1) {
					this.method4082(local9, 1024, local4);
					this.method4082(local9, 16384, local4 + 1);
				}
				if (arg4 == 2) {
					this.method4082(local9, 4096, local4);
					this.method4082(local9 + 1, 65536, local4);
				}
				if (arg4 == 3) {
					this.method4082(local9, 16384, local4);
					this.method4082(local9, 1024, local4 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method4082(local9, 512, local4);
					this.method4082(local9 - 1, 8192, local4 + 1);
				}
				if (arg4 == 1) {
					this.method4082(local9, 2048, local4);
					this.method4082(local9 + 1, 32768, local4 + 1);
				}
				if (arg4 == 2) {
					this.method4082(local9, 8192, local4);
					this.method4082(local9 + 1, 512, local4 - 1);
				}
				if (arg4 == 3) {
					this.method4082(local9, 32768, local4);
					this.method4082(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method4082(local9, 66560, local4);
					this.method4082(local9 - 1, 4096, local4);
					this.method4082(local9, 16384, local4 + 1);
				}
				if (arg4 == 1) {
					this.method4082(local9, 5120, local4);
					this.method4082(local9, 16384, local4 + 1);
					this.method4082(local9 + 1, 65536, local4);
				}
				if (arg4 == 2) {
					this.method4082(local9, 20480, local4);
					this.method4082(local9 + 1, 65536, local4);
					this.method4082(local9, 1024, local4 - 1);
				}
				if (arg4 == 3) {
					this.method4082(local9, 81920, local4);
					this.method4082(local9, 1024, local4 - 1);
					this.method4082(local9 - 1, 4096, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method4082(local9, 536870912, local4);
				this.method4082(local9 - 1, 33554432, local4);
			}
			if (arg4 == 1) {
				this.method4082(local9, 8388608, local4);
				this.method4082(local9, 134217728, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4082(local9, 33554432, local4);
				this.method4082(local9 + 1, 536870912, local4);
			}
			if (arg4 == 3) {
				this.method4082(local9, 134217728, local4);
				this.method4082(local9, 8388608, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method4082(local9, 4194304, local4);
				this.method4082(local9 - 1, 67108864, local4 + 1);
			}
			if (arg4 == 1) {
				this.method4082(local9, 16777216, local4);
				this.method4082(local9 + 1, 268435456, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4082(local9, 67108864, local4);
				this.method4082(local9 + 1, 4194304, local4 - 1);
			}
			if (arg4 == 3) {
				this.method4082(local9, 268435456, local4);
				this.method4082(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4082(local9, 545259520, local4);
			this.method4082(local9 - 1, 33554432, local4);
			this.method4082(local9, 134217728, local4 + 1);
		}
		if (arg4 == 1) {
			this.method4082(local9, 41943040, local4);
			this.method4082(local9, 134217728, local4 + 1);
			this.method4082(local9 + 1, 536870912, local4);
		}
		if (arg4 == 2) {
			this.method4082(local9, 167772160, local4);
			this.method4082(local9 + 1, 536870912, local4);
			this.method4082(local9, 8388608, local4 - 1);
		}
		if (arg4 == 3) {
			this.method4082(local9, 671088640, local4);
			this.method4082(local9, 8388608, local4 - 1);
			this.method4082(local9 - 1, 33554432, local4);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public void method4085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 - this.anInt4883;
		@Pc(28) int local28 = arg1 - this.anInt4896;
		this.anIntArrayArray69[local19][local28] |= 0x40000;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg5 == arg3 && arg0 == arg4) {
				return true;
			}
		} else if (arg5 >= arg3 && arg2 + arg3 - 1 >= arg5 && arg0 <= arg0 && arg0 + arg2 - 1 >= arg0) {
			return true;
		}
		@Pc(68) int local68 = arg4 - this.anInt4896;
		@Pc(73) int local73 = arg0 - this.anInt4896;
		@Pc(78) int local78 = arg5 - this.anInt4883;
		@Pc(83) int local83 = arg3 - this.anInt4883;
		if (arg2 == 1) {
			if (arg1 == 0) {
				if (arg6 == 0) {
					if (local83 == local78 - 1 && local68 == local73) {
						return true;
					}
					if (local83 == local78 && local73 + 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local83 && local68 == local73 - 1 && (this.anIntArrayArray69[local83][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local78 == local83 && local68 == local73 + 1) {
						return true;
					}
					if (local83 == local78 - 1 && local68 == local73 && (this.anIntArrayArray69[local83][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 == local78 + 1 && local73 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local83 == local78 + 1 && local68 == local73) {
						return true;
					}
					if (local78 == local83 && local68 == local73 + 1 && (this.anIntArrayArray69[local83][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local78 && local73 - 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local78 == local83 && local68 == local73 - 1) {
						return true;
					}
					if (local83 == local78 - 1 && local73 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 == local78 + 1 && local68 == local73 && (this.anIntArrayArray69[local83][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg6 == 0) {
					if (local83 == local78 - 1 && local68 == local73) {
						return true;
					}
					if (local83 == local78 && local68 == local73 + 1) {
						return true;
					}
					if (local78 + 1 == local83 && local68 == local73 && (this.anIntArrayArray69[local83][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local83 && local73 - 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local83 == local78 - 1 && local73 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 == local83 && local68 == local73 + 1) {
						return true;
					}
					if (local83 == local78 + 1 && local68 == local73) {
						return true;
					}
					if (local83 == local78 && local68 == local73 - 1 && (this.anIntArrayArray69[local83][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local83 == local78 - 1 && local73 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 == local83 && local73 + 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local78 + 1 && local73 == local68) {
						return true;
					}
					if (local78 == local83 && local73 - 1 == local68) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local83 == local78 - 1 && local68 == local73) {
						return true;
					}
					if (local78 == local83 && local73 + 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local83 && local68 == local73 && (this.anIntArrayArray69[local83][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local83 && local68 == local73 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local78 == local83 && local73 + 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x20) == 0) {
					return true;
				}
				if (local78 == local83 && local73 - 1 == local68 && (this.anIntArrayArray69[local83][local68] & 0x2) == 0) {
					return true;
				}
				if (local78 - 1 == local83 && local68 == local73 && (this.anIntArrayArray69[local83][local68] & 0x8) == 0) {
					return true;
				}
				if (local78 + 1 == local83 && local68 == local73 && (this.anIntArrayArray69[local83][local68] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(800) int local800 = arg2 + local83 - 1;
			@Pc(807) int local807 = local68 + arg2 - 1;
			if (arg1 == 0) {
				if (arg6 == 0) {
					if (local78 - arg2 == local83 && local68 <= local73 && local807 >= local73) {
						return true;
					}
					if (local78 >= local83 && local78 <= local800 && local68 == local73 + 1 && (this.anIntArrayArray69[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 >= local83 && local78 <= local800 && local68 == local73 - arg2 && (this.anIntArrayArray69[local78][local807] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local78 >= local83 && local800 >= local78 && local68 == local73 + 1) {
						return true;
					}
					if (local78 - arg2 == local83 && local73 >= local68 && local73 <= local807 && (this.anIntArrayArray69[local800][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 == local78 + 1 && local73 >= local68 && local73 <= local807 && (this.anIntArrayArray69[local83][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local83 == local78 + 1 && local73 >= local68 && local807 >= local73) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local73 + 1 == local68 && (this.anIntArrayArray69[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local73 - arg2 == local68 && (this.anIntArrayArray69[local78][local807] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local83 <= local78 && local800 >= local78 && local73 - arg2 == local68) {
						return true;
					}
					if (local78 - arg2 == local83 && local73 >= local68 && local807 >= local73 && (this.anIntArrayArray69[local800][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local83 && local73 >= local68 && local73 <= local807 && (this.anIntArrayArray69[local83][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg6 == 0) {
					if (local83 == local78 - arg2 && local68 <= local73 && local807 >= local73) {
						return true;
					}
					if (local78 >= local83 && local800 >= local78 && local73 + 1 == local68) {
						return true;
					}
					if (local78 + 1 == local83 && local73 >= local68 && local73 <= local807 && (this.anIntArrayArray69[local83][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 >= local83 && local800 >= local78 && local73 - arg2 == local68 && (this.anIntArrayArray69[local78][local807] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local83 == local78 - arg2 && local73 >= local68 && local73 <= local807 && (this.anIntArrayArray69[local800][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local68 == local73 + 1) {
						return true;
					}
					if (local78 + 1 == local83 && local73 >= local68 && local73 <= local807) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local68 == local73 - arg2 && (this.anIntArrayArray69[local78][local807] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local78 - arg2 == local83 && local68 <= local73 && local73 <= local807 && (this.anIntArrayArray69[local800][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 >= local83 && local78 <= local800 && local68 == local73 + 1 && (this.anIntArrayArray69[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local83 && local68 <= local73 && local73 <= local807) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local68 == local73 - arg2) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local83 == local78 - arg2 && local68 <= local73 && local807 >= local73) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local68 == local73 + 1 && (this.anIntArrayArray69[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local78 + 1 && local68 <= local73 && local807 >= local73 && (this.anIntArrayArray69[local83][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local83 <= local78 && local78 <= local800 && local73 - arg2 == local68) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local83 <= local78 && local800 >= local78 && local68 == local73 + 1 && (this.anIntArrayArray69[local78][local68] & 0x2C0120) == 0) {
					return true;
				}
				if (local83 <= local78 && local800 >= local78 && local68 == local73 - arg2 && (this.anIntArrayArray69[local78][local807] & 0x2C0102) == 0) {
					return true;
				}
				if (local78 - arg2 == local83 && local73 >= local68 && local73 <= local807 && (this.anIntArrayArray69[local800][local73] & 0x2C0108) == 0) {
					return true;
				}
				if (local83 == local78 + 1 && local68 <= local73 && local73 <= local807 && (this.anIntArrayArray69[local83][local73] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIIIIIIII)Z")
	private boolean method4087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg1 + arg3;
		@Pc(15) int local15 = arg6 + arg4;
		@Pc(19) int local19 = arg7 + arg5;
		@Pc(23) int local23 = arg2 + arg8;
		@Pc(67) int local67;
		@Pc(74) int local74;
		if (arg1 == local19 && (arg0 & 0x2) == 0) {
			local67 = arg2 <= arg6 ? arg6 : arg2;
			local74 = local15 <= local23 ? local15 : local23;
			while (local74 > local67) {
				if ((this.anIntArrayArray69[local19 - this.anInt4883 - 1][local67 - this.anInt4896] & 0x8) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local10 == arg7 && (arg0 & 0x8) == 0) {
			local67 = arg2 <= arg6 ? arg6 : arg2;
			local74 = local23 < local15 ? local23 : local15;
			while (local67 < local74) {
				if ((this.anIntArrayArray69[arg7 - this.anInt4883][local67 - this.anInt4896] & 0x80) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local15 == arg2 && (arg0 & 0x1) == 0) {
			local67 = arg7 < arg1 ? arg1 : arg7;
			local74 = local10 >= local19 ? local19 : local10;
			while (local74 > local67) {
				if ((this.anIntArrayArray69[local67 - this.anInt4883][local15 - this.anInt4896 - 1] & 0x2) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local23 == arg6 && (arg0 & 0x4) == 0) {
			local67 = arg7 >= arg1 ? arg7 : arg1;
			local74 = local19 > local10 ? local10 : local19;
			while (local67 < local74) {
				if ((this.anIntArrayArray69[local67 - this.anInt4883][arg6 - this.anInt4896] & 0x20) == 0) {
					return true;
				}
				local67++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZIIIZII)V")
	public void method4089(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg0 - this.anInt4896;
		@Pc(15) int local15 = arg5 - this.anInt4883;
		@Pc(25) int local25;
		if (arg2 == 1 || arg2 == 3) {
			local25 = arg3;
			arg3 = arg6;
			arg6 = local25;
		}
		@Pc(31) int local31 = 256;
		if (arg1) {
			local31 = 131328;
		}
		if (arg4) {
			local31 |= 0x40000000;
		}
		for (local25 = local15; local25 < arg3 + local15; local25++) {
			if (local25 >= 0 && this.anInt4888 > local25) {
				for (@Pc(70) int local70 = local6; local70 < local6 + arg6; local70++) {
					if (local70 >= 0 && this.anInt4893 > local70) {
						this.method4092(local70, local31, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)V")
	public void method4091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt4883;
		@Pc(13) int local13 = arg0 - this.anInt4896;
		this.anIntArrayArray69[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V")
	private void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray69[arg2][arg0] &= ~arg1;
	}
}

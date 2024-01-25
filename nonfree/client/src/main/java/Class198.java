import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class198 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	public int anInt5340;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public int anInt5348;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public int anInt5350;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt5352;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public void method4525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5352;
		@Pc(18) int local18 = arg0 - this.anInt5350;
		this.anIntArrayArray57[local4][local18] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZI)V")
	private void method4526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray57[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIII)V")
	private void method4527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray57[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method4528(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(21) int local21 = 256;
		if (arg5) {
			local21 = 131328;
		}
		@Pc(32) int local32 = arg2 - this.anInt5350;
		if (arg0) {
			local21 |= 0x40000000;
		}
		@Pc(43) int local43 = arg4 - this.anInt5352;
		for (@Pc(45) int local45 = local43; local45 < arg1 + local43; local45++) {
			if (local45 >= 0 && local45 < this.anInt5348) {
				for (@Pc(55) int local55 = local32; local55 < local32 + arg3; local55++) {
					if (local55 >= 0 && this.anInt5340 > local55) {
						this.method4526(local45, local55, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIZIIIII)V")
	public void method4530(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(22) int local22 = arg1 - this.anInt5352;
		@Pc(32) int local32;
		if (arg4 == 1 || arg4 == 3) {
			local32 = arg6;
			arg6 = arg5;
			arg5 = local32;
		}
		@Pc(41) int local41 = arg3 - this.anInt5350;
		if (arg2) {
			local7 |= 0x40000000;
		}
		for (local32 = local22; local32 < local22 + arg6; local32++) {
			if (local32 >= 0 && local32 < this.anInt5348) {
				for (@Pc(63) int local63 = local41; local63 < local41 + arg5; local63++) {
					if (local63 >= 0 && local63 < this.anInt5340) {
						this.method4527(local63, local7, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V")
	public void method4531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt5352;
		@Pc(19) int local19 = arg0 - this.anInt5350;
		this.anIntArrayArray57[local10][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZII)V")
	public void method4532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5352;
		@Pc(13) int local13 = arg1 - this.anInt5350;
		this.anIntArrayArray57[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(III)V")
	public void method4533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5350;
		@Pc(13) int local13 = arg1 - this.anInt5352;
		this.anIntArrayArray57[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg4 == arg6 && arg2 == arg3) {
				return true;
			}
		} else if (arg4 >= arg6 && arg1 + arg6 - 1 >= arg4 && arg3 <= arg3 && arg3 <= arg3 + arg1 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg4 - this.anInt5352;
		@Pc(64) int local64 = arg3 - this.anInt5350;
		@Pc(69) int local69 = arg2 - this.anInt5350;
		@Pc(74) int local74 = arg6 - this.anInt5352;
		if (arg1 == 1) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local59 - 1 == local74 && local64 == local69) {
						return true;
					}
					if (local74 == local59 && local69 == local64 + 1 && (this.anIntArrayArray57[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local74 && local64 - 1 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local74 == local59 && local64 + 1 == local69) {
						return true;
					}
					if (local74 == local59 - 1 && local69 == local64 && (this.anIntArrayArray57[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local69 == local64 && (this.anIntArrayArray57[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local59 + 1 == local74 && local64 == local69) {
						return true;
					}
					if (local59 == local74 && local64 + 1 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local59 && local69 == local64 - 1 && (this.anIntArrayArray57[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local59 == local74 && local64 - 1 == local69) {
						return true;
					}
					if (local59 - 1 == local74 && local69 == local64 && (this.anIntArrayArray57[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local59 - 1 == local74 && local64 == local69) {
						return true;
					}
					if (local74 == local59 && local64 + 1 == local69) {
						return true;
					}
					if (local59 + 1 == local74 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local59 && local69 == local64 - 1 && (this.anIntArrayArray57[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local74 == local59 - 1 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local59 && local64 + 1 == local69) {
						return true;
					}
					if (local74 == local59 + 1 && local69 == local64) {
						return true;
					}
					if (local59 == local74 && local69 == local64 - 1 && (this.anIntArrayArray57[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local74 == local59 - 1 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local59 && local69 == local64 + 1 && (this.anIntArrayArray57[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local59 + 1 && local69 == local64) {
						return true;
					}
					if (local59 == local74 && local64 - 1 == local69) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local59 - 1 == local74 && local69 == local64) {
						return true;
					}
					if (local74 == local59 && local69 == local64 + 1 && (this.anIntArrayArray57[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local59 && local69 == local64 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local59 == local74 && local64 + 1 == local69 && (this.anIntArrayArray57[local74][local69] & 0x20) == 0) {
					return true;
				}
				if (local74 == local59 && local69 == local64 - 1 && (this.anIntArrayArray57[local74][local69] & 0x2) == 0) {
					return true;
				}
				if (local74 == local59 - 1 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x8) == 0) {
					return true;
				}
				if (local74 == local59 + 1 && local64 == local69 && (this.anIntArrayArray57[local74][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(780) int local780 = arg1 + local74 - 1;
			@Pc(786) int local786 = arg1 + local69 - 1;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local74 == local59 - arg1 && local69 <= local64 && local64 <= local786) {
						return true;
					}
					if (local59 >= local74 && local780 >= local59 && local69 == local64 + 1 && (this.anIntArrayArray57[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local74 && local780 >= local59 && local64 - arg1 == local69 && (this.anIntArrayArray57[local59][local786] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local74 <= local59 && local780 >= local59 && local64 + 1 == local69) {
						return true;
					}
					if (local74 == local59 - arg1 && local64 >= local69 && local786 >= local64 && (this.anIntArrayArray57[local780][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local59 + 1 && local64 >= local69 && local786 >= local64 && (this.anIntArrayArray57[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local59 + 1 == local74 && local64 >= local69 && local786 >= local64) {
						return true;
					}
					if (local74 <= local59 && local59 <= local780 && local69 == local64 + 1 && (this.anIntArrayArray57[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local74 && local59 <= local780 && local64 - arg1 == local69 && (this.anIntArrayArray57[local59][local786] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local59 >= local74 && local780 >= local59 && local69 == local64 - arg1) {
						return true;
					}
					if (local74 == local59 - arg1 && local64 >= local69 && local64 <= local786 && (this.anIntArrayArray57[local780][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 >= local69 && local786 >= local64 && (this.anIntArrayArray57[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local59 - arg1 == local74 && local69 <= local64 && local786 >= local64) {
						return true;
					}
					if (local59 >= local74 && local59 <= local780 && local64 + 1 == local69) {
						return true;
					}
					if (local59 + 1 == local74 && local69 <= local64 && local786 >= local64 && (this.anIntArrayArray57[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local74 && local780 >= local59 && local64 - arg1 == local69 && (this.anIntArrayArray57[local59][local786] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local74 == local59 - arg1 && local64 >= local69 && local786 >= local64 && (this.anIntArrayArray57[local780][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 >= local74 && local59 <= local780 && local64 + 1 == local69) {
						return true;
					}
					if (local74 == local59 + 1 && local64 >= local69 && local64 <= local786) {
						return true;
					}
					if (local74 <= local59 && local59 <= local780 && local69 == local64 - arg1 && (this.anIntArrayArray57[local59][local786] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local74 == local59 - arg1 && local64 >= local69 && local786 >= local64 && (this.anIntArrayArray57[local780][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 >= local74 && local59 <= local780 && local69 == local64 + 1 && (this.anIntArrayArray57[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 >= local69 && local786 >= local64) {
						return true;
					}
					if (local74 <= local59 && local59 <= local780 && local69 == local64 - arg1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local59 - arg1 == local74 && local69 <= local64 && local786 >= local64) {
						return true;
					}
					if (local74 <= local59 && local780 >= local59 && local69 == local64 + 1 && (this.anIntArrayArray57[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local69 <= local64 && local786 >= local64 && (this.anIntArrayArray57[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 <= local59 && local780 >= local59 && local69 == local64 - arg1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local74 <= local59 && local59 <= local780 && local69 == local64 + 1 && (this.anIntArrayArray57[local59][local69] & 0x2C0120) == 0) {
					return true;
				}
				if (local59 >= local74 && local59 <= local780 && local64 - arg1 == local69 && (this.anIntArrayArray57[local59][local786] & 0x2C0102) == 0) {
					return true;
				}
				if (local74 == local59 - arg1 && local64 >= local69 && local64 <= local786 && (this.anIntArrayArray57[local780][local64] & 0x2C0108) == 0) {
					return true;
				}
				if (local74 == local59 + 1 && local64 >= local69 && local64 <= local786 && (this.anIntArrayArray57[local74][local64] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIZZI)V")
	public void method4535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		@Pc(12) int local12 = arg3 - this.anInt5350;
		@Pc(17) int local17 = arg2 - this.anInt5352;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method4527(local12, 128, local17);
				this.method4527(local12, 8, local17 - 1);
			}
			if (arg0 == 1) {
				this.method4527(local12, 2, local17);
				this.method4527(local12 + 1, 32, local17);
			}
			if (arg0 == 2) {
				this.method4527(local12, 8, local17);
				this.method4527(local12, 128, local17 + 1);
			}
			if (arg0 == 3) {
				this.method4527(local12, 32, local17);
				this.method4527(local12 - 1, 2, local17);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method4527(local12, 1, local17);
				this.method4527(local12 + 1, 16, local17 - 1);
			}
			if (arg0 == 1) {
				this.method4527(local12, 4, local17);
				this.method4527(local12 + 1, 64, local17 + 1);
			}
			if (arg0 == 2) {
				this.method4527(local12, 16, local17);
				this.method4527(local12 - 1, 1, local17 + 1);
			}
			if (arg0 == 3) {
				this.method4527(local12, 64, local17);
				this.method4527(local12 - 1, 4, local17 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method4527(local12, 130, local17);
				this.method4527(local12, 8, local17 - 1);
				this.method4527(local12 + 1, 32, local17);
			}
			if (arg0 == 1) {
				this.method4527(local12, 10, local17);
				this.method4527(local12 + 1, 32, local17);
				this.method4527(local12, 128, local17 + 1);
			}
			if (arg0 == 2) {
				this.method4527(local12, 40, local17);
				this.method4527(local12, 128, local17 + 1);
				this.method4527(local12 - 1, 2, local17);
			}
			if (arg0 == 3) {
				this.method4527(local12, 160, local17);
				this.method4527(local12 - 1, 2, local17);
				this.method4527(local12, 8, local17 - 1);
			}
		}
		if (arg5) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method4527(local12, 65536, local17);
					this.method4527(local12, 4096, local17 - 1);
				}
				if (arg0 == 1) {
					this.method4527(local12, 1024, local17);
					this.method4527(local12 + 1, 16384, local17);
				}
				if (arg0 == 2) {
					this.method4527(local12, 4096, local17);
					this.method4527(local12, 65536, local17 + 1);
				}
				if (arg0 == 3) {
					this.method4527(local12, 16384, local17);
					this.method4527(local12 - 1, 1024, local17);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method4527(local12, 512, local17);
					this.method4527(local12 + 1, 8192, local17 - 1);
				}
				if (arg0 == 1) {
					this.method4527(local12, 2048, local17);
					this.method4527(local12 + 1, 32768, local17 + 1);
				}
				if (arg0 == 2) {
					this.method4527(local12, 8192, local17);
					this.method4527(local12 - 1, 512, local17 + 1);
				}
				if (arg0 == 3) {
					this.method4527(local12, 32768, local17);
					this.method4527(local12 - 1, 2048, local17 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method4527(local12, 66560, local17);
					this.method4527(local12, 4096, local17 - 1);
					this.method4527(local12 + 1, 16384, local17);
				}
				if (arg0 == 1) {
					this.method4527(local12, 5120, local17);
					this.method4527(local12 + 1, 16384, local17);
					this.method4527(local12, 65536, local17 + 1);
				}
				if (arg0 == 2) {
					this.method4527(local12, 20480, local17);
					this.method4527(local12, 65536, local17 + 1);
					this.method4527(local12 - 1, 1024, local17);
				}
				if (arg0 == 3) {
					this.method4527(local12, 81920, local17);
					this.method4527(local12 - 1, 1024, local17);
					this.method4527(local12, 4096, local17 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method4527(local12, 536870912, local17);
				this.method4527(local12, 33554432, local17 - 1);
			}
			if (arg0 == 1) {
				this.method4527(local12, 8388608, local17);
				this.method4527(local12 + 1, 134217728, local17);
			}
			if (arg0 == 2) {
				this.method4527(local12, 33554432, local17);
				this.method4527(local12, 536870912, local17 + 1);
			}
			if (arg0 == 3) {
				this.method4527(local12, 134217728, local17);
				this.method4527(local12 - 1, 8388608, local17);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method4527(local12, 4194304, local17);
				this.method4527(local12 + 1, 67108864, local17 - 1);
			}
			if (arg0 == 1) {
				this.method4527(local12, 16777216, local17);
				this.method4527(local12 + 1, 268435456, local17 + 1);
			}
			if (arg0 == 2) {
				this.method4527(local12, 67108864, local17);
				this.method4527(local12 - 1, 4194304, local17 + 1);
			}
			if (arg0 == 3) {
				this.method4527(local12, 268435456, local17);
				this.method4527(local12 - 1, 16777216, local17 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4527(local12, 545259520, local17);
			this.method4527(local12, 33554432, local17 - 1);
			this.method4527(local12 + 1, 134217728, local17);
		}
		if (arg0 == 1) {
			this.method4527(local12, 41943040, local17);
			this.method4527(local12 + 1, 134217728, local17);
			this.method4527(local12, 536870912, local17 + 1);
		}
		if (arg0 == 2) {
			this.method4527(local12, 167772160, local17);
			this.method4527(local12, 536870912, local17 + 1);
			this.method4527(local12 - 1, 8388608, local17);
		}
		if (arg0 == 3) {
			this.method4527(local12, 671088640, local17);
			this.method4527(local12 - 1, 8388608, local17);
			this.method4527(local12, 33554432, local17 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
	public void method4537() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt5348; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt5340; local16++) {
				if (local12 == 0 || local16 == 0 || this.anInt5348 - 5 <= local12 || local16 >= this.anInt5340 - 5) {
					this.anIntArrayArray57[local12][local16] = -1;
				} else {
					this.anIntArrayArray57[local12][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIZI)Z")
	public boolean method4538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static263.method4139(arg1, arg5, arg2, arg7, arg6, arg0, arg3, arg6) ? true : this.method4543(arg5, arg0, arg6, arg7, arg4, arg3, arg2, arg6, arg1);
		}
		@Pc(38) int local38 = arg3 + arg5 - 1;
		@Pc(44) int local44 = arg2 + arg1 - 1;
		if (arg5 <= arg7 && arg7 <= local38 && arg2 <= arg0 && arg0 <= local44) {
			return true;
		} else if (arg7 == arg5 - 1 && arg2 <= arg0 && local44 >= arg0 && (this.anIntArrayArray57[arg7 - this.anInt5352][arg0 - this.anInt5350] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg7 && arg0 >= arg2 && local44 >= arg0 && (this.anIntArrayArray57[arg7 - this.anInt5352][arg0 - this.anInt5350] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg0 && arg5 <= arg7 && arg7 <= local38 && (this.anIntArrayArray57[arg7 - this.anInt5352][arg0 - this.anInt5350] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local44 + 1 && arg7 >= arg5 && local38 >= arg7 && (this.anIntArrayArray57[arg7 - this.anInt5352][arg0 - this.anInt5350] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBZIZI)V")
	public void method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt5350;
		@Pc(17) int local17 = arg5 - this.anInt5352;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4526(local17, local4, 128);
				this.method4526(local17 - 1, local4, 8);
			}
			if (arg0 == 1) {
				this.method4526(local17, local4, 2);
				this.method4526(local17, local4 + 1, 32);
			}
			if (arg0 == 2) {
				this.method4526(local17, local4, 8);
				this.method4526(local17 + 1, local4, 128);
			}
			if (arg0 == 3) {
				this.method4526(local17, local4, 32);
				this.method4526(local17, local4 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4526(local17, local4, 1);
				this.method4526(local17 - 1, local4 + 1, 16);
			}
			if (arg0 == 1) {
				this.method4526(local17, local4, 4);
				this.method4526(local17 + 1, local4 - -1, 64);
			}
			if (arg0 == 2) {
				this.method4526(local17, local4, 16);
				this.method4526(local17 + 1, local4 + -1, 1);
			}
			if (arg0 == 3) {
				this.method4526(local17, local4, 64);
				this.method4526(local17 - 1, local4 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method4526(local17, local4, 130);
				this.method4526(local17 - 1, local4, 8);
				this.method4526(local17, local4 + 1, 32);
			}
			if (arg0 == 1) {
				this.method4526(local17, local4, 10);
				this.method4526(local17, local4 + 1, 32);
				this.method4526(local17 + 1, local4, 128);
			}
			if (arg0 == 2) {
				this.method4526(local17, local4, 40);
				this.method4526(local17 + 1, local4, 128);
				this.method4526(local17, local4 - 1, 2);
			}
			if (arg0 == 3) {
				this.method4526(local17, local4, 160);
				this.method4526(local17, local4 - 1, 2);
				this.method4526(local17 - 1, local4, 8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method4526(local17, local4, 65536);
					this.method4526(local17 - 1, local4, 4096);
				}
				if (arg0 == 1) {
					this.method4526(local17, local4, 1024);
					this.method4526(local17, local4 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method4526(local17, local4, 4096);
					this.method4526(local17 + 1, local4, 65536);
				}
				if (arg0 == 3) {
					this.method4526(local17, local4, 16384);
					this.method4526(local17, local4 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method4526(local17, local4, 512);
					this.method4526(local17 - 1, local4 - -1, 8192);
				}
				if (arg0 == 1) {
					this.method4526(local17, local4, 2048);
					this.method4526(local17 + 1, local4 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4526(local17, local4, 8192);
					this.method4526(local17 + 1, local4 - 1, 512);
				}
				if (arg0 == 3) {
					this.method4526(local17, local4, 32768);
					this.method4526(local17 - 1, local4 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method4526(local17, local4, 66560);
					this.method4526(local17 - 1, local4, 4096);
					this.method4526(local17, local4 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method4526(local17, local4, 5120);
					this.method4526(local17, local4 + 1, 16384);
					this.method4526(local17 + 1, local4, 65536);
				}
				if (arg0 == 2) {
					this.method4526(local17, local4, 20480);
					this.method4526(local17 + 1, local4, 65536);
					this.method4526(local17, local4 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method4526(local17, local4, 81920);
					this.method4526(local17, local4 - 1, 1024);
					this.method4526(local17 - 1, local4, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4526(local17, local4, 536870912);
				this.method4526(local17 - 1, local4, 33554432);
			}
			if (arg0 == 1) {
				this.method4526(local17, local4, 8388608);
				this.method4526(local17, local4 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method4526(local17, local4, 33554432);
				this.method4526(local17 + 1, local4, 536870912);
			}
			if (arg0 == 3) {
				this.method4526(local17, local4, 134217728);
				this.method4526(local17, local4 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4526(local17, local4, 4194304);
				this.method4526(local17 - 1, local4 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method4526(local17, local4, 16777216);
				this.method4526(local17 + 1, local4 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method4526(local17, local4, 67108864);
				this.method4526(local17 + 1, local4 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method4526(local17, local4, 268435456);
				this.method4526(local17 - 1, local4 + -1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4526(local17, local4, 545259520);
			this.method4526(local17 - 1, local4, 33554432);
			this.method4526(local17, local4 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method4526(local17, local4, 41943040);
			this.method4526(local17, local4 + 1, 134217728);
			this.method4526(local17 + 1, local4, 536870912);
		}
		if (arg0 == 2) {
			this.method4526(local17, local4, 167772160);
			this.method4526(local17 + 1, local4, 536870912);
			this.method4526(local17, local4 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method4526(local17, local4, 671088640);
			this.method4526(local17, local4 - 1, 8388608);
			this.method4526(local17 - 1, local4, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg0 == arg3 && arg6 == arg5) {
				return true;
			}
		} else if (arg0 <= arg3 && arg0 + arg2 - 1 >= arg3 && arg6 <= arg6 && arg6 <= arg6 + arg2 - 1) {
			return true;
		}
		@Pc(51) int local51 = arg6 - this.anInt5350;
		@Pc(56) int local56 = arg0 - this.anInt5352;
		@Pc(61) int local61 = arg3 - this.anInt5352;
		@Pc(66) int local66 = arg5 - this.anInt5350;
		if (arg2 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local61 + 1 == local56 && local51 == local66 && (this.anIntArrayArray57[local56][local66] & 0x80) == 0) {
						return true;
					}
					if (local56 == local61 && local66 == local51 - 1 && (this.anIntArrayArray57[local56][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local56 == local61 - 1 && local66 == local51 && (this.anIntArrayArray57[local56][local66] & 0x8) == 0) {
						return true;
					}
					if (local56 == local61 && local66 == local51 - 1 && (this.anIntArrayArray57[local56][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local56 == local61 - 1 && local66 == local51 && (this.anIntArrayArray57[local56][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 == local56 && local51 + 1 == local66 && (this.anIntArrayArray57[local56][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local56 == local61 + 1 && local51 == local66 && (this.anIntArrayArray57[local56][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 == local56 && local51 + 1 == local66 && (this.anIntArrayArray57[local56][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local56 == local61 && local66 == local51 + 1 && (this.anIntArrayArray57[local56][local66] & 0x20) == 0) {
					return true;
				}
				if (local56 == local61 && local51 - 1 == local66 && (this.anIntArrayArray57[local56][local66] & 0x2) == 0) {
					return true;
				}
				if (local56 == local61 - 1 && local66 == local51 && (this.anIntArrayArray57[local56][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local56 && local51 == local66 && (this.anIntArrayArray57[local56][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(75) int local75 = arg2 + local56 - 1;
			@Pc(82) int local82 = local66 + arg2 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local61 + 1 == local56 && local66 <= local51 && local51 <= local82 && (this.anIntArrayArray57[local56][local51] & 0x80) == 0) {
						return true;
					}
					if (local56 <= local61 && local75 >= local61 && local51 - arg2 == local66 && (this.anIntArrayArray57[local61][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local61 - arg2 == local56 && local66 <= local51 && local51 <= local82 && (this.anIntArrayArray57[local75][local51] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local56 && local75 >= local61 && local66 == local51 - arg2 && (this.anIntArrayArray57[local61][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local56 == local61 - arg2 && local66 <= local51 && local82 >= local51 && (this.anIntArrayArray57[local75][local51] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local56 && local75 >= local61 && local66 == local51 + 1 && (this.anIntArrayArray57[local61][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local61 + 1 == local56 && local66 <= local51 && local51 <= local82 && (this.anIntArrayArray57[local56][local51] & 0x80) == 0) {
						return true;
					}
					if (local56 <= local61 && local61 <= local75 && local66 == local51 + 1 && (this.anIntArrayArray57[local61][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local61 >= local56 && local75 >= local61 && local66 == local51 + 1 && (this.anIntArrayArray57[local61][local66] & 0x20) == 0) {
					return true;
				}
				if (local56 <= local61 && local61 <= local75 && local66 == local51 - arg2 && (this.anIntArrayArray57[local61][local82] & 0x2) == 0) {
					return true;
				}
				if (local56 == local61 - arg2 && local51 >= local66 && local82 >= local51 && (this.anIntArrayArray57[local75][local51] & 0x8) == 0) {
					return true;
				}
				if (local56 == local61 + 1 && local66 <= local51 && local51 <= local82 && (this.anIntArrayArray57[local56][local51] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg3 + arg2;
		@Pc(20) int local20 = arg7 + arg1;
		@Pc(25) int local25 = arg0 + arg5;
		@Pc(29) int local29 = arg8 + arg6;
		@Pc(47) int local47;
		@Pc(58) int local58;
		if (arg3 == local25 && (arg4 & 0x2) == 0) {
			local47 = arg6 < arg1 ? arg1 : arg6;
			local58 = local29 > local20 ? local20 : local29;
			while (local58 > local47) {
				if ((this.anIntArrayArray57[local25 - this.anInt5352 - 1][local47 - this.anInt5350] & 0x8) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg0 == local9 && (arg4 & 0x8) == 0) {
			local47 = arg6 < arg1 ? arg1 : arg6;
			local58 = local20 < local29 ? local20 : local29;
			while (local58 > local47) {
				if ((this.anIntArrayArray57[arg0 - this.anInt5352][local47 - this.anInt5350] & 0x80) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local29 == arg1 && (arg4 & 0x1) == 0) {
			local47 = arg3 > arg0 ? arg3 : arg0;
			local58 = local9 >= local25 ? local25 : local9;
			while (local47 < local58) {
				if ((this.anIntArrayArray57[local47 - this.anInt5352][local29 - this.anInt5350 - 1] & 0x2) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg6 == local20 && (arg4 & 0x4) == 0) {
			local47 = arg0 >= arg3 ? arg0 : arg3;
			local58 = local9 < local25 ? local9 : local25;
			while (local47 < local58) {
				if ((this.anIntArrayArray57[local47 - this.anInt5352][arg6 - this.anInt5350] & 0x20) == 0) {
					return true;
				}
				local47++;
			}
		}
		return false;
	}
}

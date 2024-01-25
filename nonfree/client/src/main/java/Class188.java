import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class188 {

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public int anInt4567;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	public int anInt4568;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public int anInt4570;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public int anInt4574;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public void method4038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt4574;
		@Pc(13) int local13 = arg1 - this.anInt4570;
		this.anIntArrayArray34[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBIIIIII)Z")
	public boolean method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg7 + arg3;
		@Pc(18) int local18 = arg8 + arg2;
		@Pc(22) int local22 = arg0 + arg4;
		@Pc(26) int local26 = arg6 + arg1;
		@Pc(43) int local43;
		@Pc(50) int local50;
		if (arg7 == local22 && (arg5 & 0x2) == 0) {
			local43 = arg1 < arg8 ? arg8 : arg1;
			local50 = local26 <= local18 ? local26 : local18;
			while (local50 > local43) {
				if ((this.anIntArrayArray34[local22 - this.anInt4570 - 1][local43 - this.anInt4574] & 0x8) == 0) {
					return true;
				}
				local43++;
			}
		} else if (local9 == arg4 && (arg5 & 0x8) == 0) {
			local43 = arg1 >= arg8 ? arg1 : arg8;
			local50 = local18 < local26 ? local18 : local26;
			while (local43 < local50) {
				if ((this.anIntArrayArray34[arg4 - this.anInt4570][local43 - this.anInt4574] & 0x80) == 0) {
					return true;
				}
				local43++;
			}
		} else if (arg8 == local26 && (arg5 & 0x1) == 0) {
			local43 = arg4 >= arg7 ? arg4 : arg7;
			local50 = local22 <= local9 ? local22 : local9;
			while (local43 < local50) {
				if ((this.anIntArrayArray34[local43 - this.anInt4570][local26 - this.anInt4574 - 1] & 0x2) == 0) {
					return true;
				}
				local43++;
			}
		} else if (local18 == arg1 && (arg5 & 0x4) == 0) {
			local43 = arg7 > arg4 ? arg7 : arg4;
			local50 = local9 >= local22 ? local22 : local9;
			while (local50 > local43) {
				if ((this.anIntArrayArray34[local43 - this.anInt4570][arg1 - this.anInt4574] & 0x20) == 0) {
					return true;
				}
				local43++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZIZI)V")
	public void method4040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt4574;
		@Pc(13) int local13 = arg1 - this.anInt4570;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method4044(local13, 128, local4);
				this.method4044(local13 - 1, 8, local4);
			}
			if (arg0 == 1) {
				this.method4044(local13, 2, local4);
				this.method4044(local13, 32, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4044(local13, 8, local4);
				this.method4044(local13 + 1, 128, local4);
			}
			if (arg0 == 3) {
				this.method4044(local13, 32, local4);
				this.method4044(local13, 2, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method4044(local13, 1, local4);
				this.method4044(local13 - 1, 16, local4 + 1);
			}
			if (arg0 == 1) {
				this.method4044(local13, 4, local4);
				this.method4044(local13 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4044(local13, 16, local4);
				this.method4044(local13 + 1, 1, local4 - 1);
			}
			if (arg0 == 3) {
				this.method4044(local13, 64, local4);
				this.method4044(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method4044(local13, 130, local4);
				this.method4044(local13 - 1, 8, local4);
				this.method4044(local13, 32, local4 + 1);
			}
			if (arg0 == 1) {
				this.method4044(local13, 10, local4);
				this.method4044(local13, 32, local4 + 1);
				this.method4044(local13 + 1, 128, local4);
			}
			if (arg0 == 2) {
				this.method4044(local13, 40, local4);
				this.method4044(local13 + 1, 128, local4);
				this.method4044(local13, 2, local4 - 1);
			}
			if (arg0 == 3) {
				this.method4044(local13, 160, local4);
				this.method4044(local13, 2, local4 - 1);
				this.method4044(local13 - 1, 8, local4);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method4044(local13, 65536, local4);
					this.method4044(local13 - 1, 4096, local4);
				}
				if (arg0 == 1) {
					this.method4044(local13, 1024, local4);
					this.method4044(local13, 16384, local4 + 1);
				}
				if (arg0 == 2) {
					this.method4044(local13, 4096, local4);
					this.method4044(local13 + 1, 65536, local4);
				}
				if (arg0 == 3) {
					this.method4044(local13, 16384, local4);
					this.method4044(local13, 1024, local4 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method4044(local13, 512, local4);
					this.method4044(local13 - 1, 8192, local4 + 1);
				}
				if (arg0 == 1) {
					this.method4044(local13, 2048, local4);
					this.method4044(local13 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method4044(local13, 8192, local4);
					this.method4044(local13 + 1, 512, local4 - 1);
				}
				if (arg0 == 3) {
					this.method4044(local13, 32768, local4);
					this.method4044(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method4044(local13, 66560, local4);
					this.method4044(local13 - 1, 4096, local4);
					this.method4044(local13, 16384, local4 + 1);
				}
				if (arg0 == 1) {
					this.method4044(local13, 5120, local4);
					this.method4044(local13, 16384, local4 + 1);
					this.method4044(local13 + 1, 65536, local4);
				}
				if (arg0 == 2) {
					this.method4044(local13, 20480, local4);
					this.method4044(local13 + 1, 65536, local4);
					this.method4044(local13, 1024, local4 - 1);
				}
				if (arg0 == 3) {
					this.method4044(local13, 81920, local4);
					this.method4044(local13, 1024, local4 - 1);
					this.method4044(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method4044(local13, 536870912, local4);
				this.method4044(local13 - 1, 33554432, local4);
			}
			if (arg0 == 1) {
				this.method4044(local13, 8388608, local4);
				this.method4044(local13, 134217728, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4044(local13, 33554432, local4);
				this.method4044(local13 + 1, 536870912, local4);
			}
			if (arg0 == 3) {
				this.method4044(local13, 134217728, local4);
				this.method4044(local13, 8388608, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method4044(local13, 4194304, local4);
				this.method4044(local13 - 1, 67108864, local4 + 1);
			}
			if (arg0 == 1) {
				this.method4044(local13, 16777216, local4);
				this.method4044(local13 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4044(local13, 67108864, local4);
				this.method4044(local13 + 1, 4194304, local4 - 1);
			}
			if (arg0 == 3) {
				this.method4044(local13, 268435456, local4);
				this.method4044(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4044(local13, 545259520, local4);
			this.method4044(local13 - 1, 33554432, local4);
			this.method4044(local13, 134217728, local4 + 1);
		}
		if (arg0 == 1) {
			this.method4044(local13, 41943040, local4);
			this.method4044(local13, 134217728, local4 + 1);
			this.method4044(local13 + 1, 536870912, local4);
		}
		if (arg0 == 2) {
			this.method4044(local13, 167772160, local4);
			this.method4044(local13 + 1, 536870912, local4);
			this.method4044(local13, 8388608, local4 - 1);
		}
		if (arg0 == 3) {
			this.method4044(local13, 671088640, local4);
			this.method4044(local13, 8388608, local4 - 1);
			this.method4044(local13 - 1, 33554432, local4);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZZBI)V")
	public void method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg6 - this.anInt4570;
		@Pc(34) int local34;
		if (arg3 == 1 || arg3 == 3) {
			local34 = arg1;
			arg1 = arg0;
			arg0 = local34;
		}
		@Pc(43) int local43 = arg2 - this.anInt4574;
		for (local34 = local24; local34 < arg1 + local24; local34++) {
			if (local34 >= 0 && local34 < this.anInt4567) {
				for (@Pc(55) int local55 = local43; local55 < arg0 + local43; local55++) {
					if (local55 >= 0 && local55 < this.anInt4568) {
						this.method4044(local34, local7, local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method4043() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4567; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt4568; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt4567 - 5 || local11 >= this.anInt4568 - 5) {
					this.anIntArrayArray34[local7][local11] = -1;
				} else {
					this.anIntArrayArray34[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
	private void method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray34[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method4046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg4 == arg0 && arg2 == arg6) {
				return true;
			}
		} else if (arg0 >= arg4 && arg0 <= arg4 + arg1 - 1 && arg6 <= arg6 && arg6 <= arg6 + arg1 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg6 - this.anInt4574;
		@Pc(62) int local62 = arg4 - this.anInt4570;
		@Pc(67) int local67 = arg2 - this.anInt4574;
		@Pc(72) int local72 = arg0 - this.anInt4570;
		if (arg1 == 1) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					if (local72 - 1 == local62 && local67 == local57) {
						return true;
					}
					if (local62 == local72 && local57 + 1 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local72 && local67 == local57 - 1 && (this.anIntArrayArray34[local62][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local62 == local72 && local57 + 1 == local67) {
						return true;
					}
					if (local62 == local72 - 1 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local72 + 1 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local62 == local72 + 1 && local67 == local57) {
						return true;
					}
					if (local62 == local72 && local67 == local57 + 1 && (this.anIntArrayArray34[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 && local67 == local57 - 1 && (this.anIntArrayArray34[local62][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local72 == local62 && local57 - 1 == local67) {
						return true;
					}
					if (local72 - 1 == local62 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local72 + 1 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					if (local72 - 1 == local62 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local67 == local57 + 1) {
						return true;
					}
					if (local72 + 1 == local62 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local62 && local67 == local57 - 1 && (this.anIntArrayArray34[local62][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local62 == local72 - 1 && local67 == local57 && (this.anIntArrayArray34[local62][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local72 && local67 == local57 + 1) {
						return true;
					}
					if (local62 == local72 + 1 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local67 == local57 - 1 && (this.anIntArrayArray34[local62][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local62 == local72 - 1 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 && local57 + 1 == local67 && (this.anIntArrayArray34[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 + 1 == local62 && local67 == local57) {
						return true;
					}
					if (local62 == local72 && local57 - 1 == local67) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local62 == local72 - 1 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local67 == local57 + 1 && (this.anIntArrayArray34[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 + 1 == local62 && local67 == local57 && (this.anIntArrayArray34[local62][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local62 && local67 == local57 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local72 == local62 && local67 == local57 + 1 && (this.anIntArrayArray34[local62][local67] & 0x20) == 0) {
					return true;
				}
				if (local62 == local72 && local67 == local57 - 1 && (this.anIntArrayArray34[local62][local67] & 0x2) == 0) {
					return true;
				}
				if (local62 == local72 - 1 && local57 == local67 && (this.anIntArrayArray34[local62][local67] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local62 && local67 == local57 && (this.anIntArrayArray34[local62][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(763) int local763 = local62 + arg1 - 1;
			@Pc(769) int local769 = local67 + arg1 - 1;
			if (arg3 == 0) {
				if (arg5 == 0) {
					if (local72 - arg1 == local62 && local57 >= local67 && local769 >= local57) {
						return true;
					}
					if (local72 >= local62 && local72 <= local763 && local67 == local57 + 1 && (this.anIntArrayArray34[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 >= local62 && local72 <= local763 && local67 == local57 - arg1 && (this.anIntArrayArray34[local72][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 >= local62 && local763 >= local72 && local57 + 1 == local67) {
						return true;
					}
					if (local72 - arg1 == local62 && local57 >= local67 && local769 >= local57 && (this.anIntArrayArray34[local763][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local72 + 1 && local67 <= local57 && local769 >= local57 && (this.anIntArrayArray34[local62][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local72 + 1 == local62 && local67 <= local57 && local57 <= local769) {
						return true;
					}
					if (local62 <= local72 && local763 >= local72 && local57 + 1 == local67 && (this.anIntArrayArray34[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 >= local62 && local72 <= local763 && local67 == local57 - arg1 && (this.anIntArrayArray34[local72][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local62 <= local72 && local72 <= local763 && local67 == local57 - arg1) {
						return true;
					}
					if (local62 == local72 - arg1 && local57 >= local67 && local57 <= local769 && (this.anIntArrayArray34[local763][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 + 1 == local62 && local57 >= local67 && local57 <= local769 && (this.anIntArrayArray34[local62][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					if (local62 == local72 - arg1 && local67 <= local57 && local57 <= local769) {
						return true;
					}
					if (local72 >= local62 && local763 >= local72 && local67 == local57 + 1) {
						return true;
					}
					if (local62 == local72 + 1 && local67 <= local57 && local769 >= local57 && (this.anIntArrayArray34[local62][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 <= local72 && local72 <= local763 && local67 == local57 - arg1 && (this.anIntArrayArray34[local72][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 - arg1 == local62 && local67 <= local57 && local57 <= local769 && (this.anIntArrayArray34[local763][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 <= local72 && local763 >= local72 && local67 == local57 + 1) {
						return true;
					}
					if (local72 + 1 == local62 && local57 >= local67 && local57 <= local769) {
						return true;
					}
					if (local62 <= local72 && local72 <= local763 && local67 == local57 - arg1 && (this.anIntArrayArray34[local72][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local72 - arg1 == local62 && local57 >= local67 && local57 <= local769 && (this.anIntArrayArray34[local763][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 <= local72 && local763 >= local72 && local57 + 1 == local67 && (this.anIntArrayArray34[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 + 1 == local62 && local57 >= local67 && local769 >= local57) {
						return true;
					}
					if (local62 <= local72 && local763 >= local72 && local67 == local57 - arg1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local62 == local72 - arg1 && local57 >= local67 && local769 >= local57) {
						return true;
					}
					if (local62 <= local72 && local763 >= local72 && local67 == local57 + 1 && (this.anIntArrayArray34[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local72 + 1 && local67 <= local57 && local769 >= local57 && (this.anIntArrayArray34[local62][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 >= local62 && local72 <= local763 && local57 - arg1 == local67) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local72 >= local62 && local763 >= local72 && local67 == local57 + 1 && (this.anIntArrayArray34[local72][local67] & 0x2C0120) == 0) {
					return true;
				}
				if (local62 <= local72 && local72 <= local763 && local67 == local57 - arg1 && (this.anIntArrayArray34[local72][local769] & 0x2C0102) == 0) {
					return true;
				}
				if (local72 - arg1 == local62 && local57 >= local67 && local57 <= local769 && (this.anIntArrayArray34[local763][local57] & 0x2C0108) == 0) {
					return true;
				}
				if (local72 + 1 == local62 && local57 >= local67 && local57 <= local769 && (this.anIntArrayArray34[local62][local57] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
	public void method4047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4574;
		@Pc(9) int local9 = arg1 - this.anInt4570;
		this.anIntArrayArray34[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIII)V")
	private void method4048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
	public void method4049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4570;
		@Pc(14) int local14 = arg1 - this.anInt4574;
		this.anIntArrayArray34[local4][local14] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)V")
	public void method4050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 - this.anInt4570;
		@Pc(18) int local18 = arg1 - this.anInt4574;
		this.anIntArrayArray34[local13][local18] |= 0x200000;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method4052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static323.method4787(arg6, arg6, arg3, arg1, arg7, arg5, arg2, arg4) ? true : this.method4039(arg7, arg2, arg6, arg6, arg1, arg0, arg3, arg4, arg5);
		}
		@Pc(54) int local54 = arg1 + arg7 - 1;
		@Pc(60) int local60 = arg3 + arg2 - 1;
		if (arg1 <= arg4 && local54 >= arg4 && arg2 <= arg5 && arg5 <= local60) {
			return true;
		} else if (arg1 - 1 == arg4 && arg2 <= arg5 && arg5 <= local60 && (this.anIntArrayArray34[arg4 - this.anInt4570][arg5 - this.anInt4574] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg4 == local54 + 1 && arg2 <= arg5 && local60 >= arg5 && (this.anIntArrayArray34[arg4 - this.anInt4570][arg5 - this.anInt4574] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg5 && arg4 >= arg1 && local54 >= arg4 && (this.anIntArrayArray34[arg4 - this.anInt4570][arg5 - this.anInt4574] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local60 + 1 == arg5 && arg1 <= arg4 && local54 >= arg4 && (this.anIntArrayArray34[arg4 - this.anInt4570][arg5 - this.anInt4574] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method4053(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg3 - this.anInt4570;
		@Pc(13) int local13 = arg1 - this.anInt4574;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method4048(local13, 128, local4);
				this.method4048(local13, 8, local4 - 1);
			}
			if (arg2 == 1) {
				this.method4048(local13, 2, local4);
				this.method4048(local13 + 1, 32, local4);
			}
			if (arg2 == 2) {
				this.method4048(local13, 8, local4);
				this.method4048(local13, 128, local4 + 1);
			}
			if (arg2 == 3) {
				this.method4048(local13, 32, local4);
				this.method4048(local13 - 1, 2, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method4048(local13, 1, local4);
				this.method4048(local13 + 1, 16, local4 - 1);
			}
			if (arg2 == 1) {
				this.method4048(local13, 4, local4);
				this.method4048(local13 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method4048(local13, 16, local4);
				this.method4048(local13 - 1, 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method4048(local13, 64, local4);
				this.method4048(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method4048(local13, 130, local4);
				this.method4048(local13, 8, local4 - 1);
				this.method4048(local13 + 1, 32, local4);
			}
			if (arg2 == 1) {
				this.method4048(local13, 10, local4);
				this.method4048(local13 + 1, 32, local4);
				this.method4048(local13, 128, local4 + 1);
			}
			if (arg2 == 2) {
				this.method4048(local13, 40, local4);
				this.method4048(local13, 128, local4 + 1);
				this.method4048(local13 - 1, 2, local4);
			}
			if (arg2 == 3) {
				this.method4048(local13, 160, local4);
				this.method4048(local13 - 1, 2, local4);
				this.method4048(local13, 8, local4 - 1);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method4048(local13, 65536, local4);
					this.method4048(local13, 4096, local4 - 1);
				}
				if (arg2 == 1) {
					this.method4048(local13, 1024, local4);
					this.method4048(local13 + 1, 16384, local4);
				}
				if (arg2 == 2) {
					this.method4048(local13, 4096, local4);
					this.method4048(local13, 65536, local4 + 1);
				}
				if (arg2 == 3) {
					this.method4048(local13, 16384, local4);
					this.method4048(local13 - 1, 1024, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method4048(local13, 512, local4);
					this.method4048(local13 + 1, 8192, local4 - 1);
				}
				if (arg2 == 1) {
					this.method4048(local13, 2048, local4);
					this.method4048(local13 + 1, 32768, local4 + 1);
				}
				if (arg2 == 2) {
					this.method4048(local13, 8192, local4);
					this.method4048(local13 - 1, 512, local4 + 1);
				}
				if (arg2 == 3) {
					this.method4048(local13, 32768, local4);
					this.method4048(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method4048(local13, 66560, local4);
					this.method4048(local13, 4096, local4 - 1);
					this.method4048(local13 + 1, 16384, local4);
				}
				if (arg2 == 1) {
					this.method4048(local13, 5120, local4);
					this.method4048(local13 + 1, 16384, local4);
					this.method4048(local13, 65536, local4 + 1);
				}
				if (arg2 == 2) {
					this.method4048(local13, 20480, local4);
					this.method4048(local13, 65536, local4 + 1);
					this.method4048(local13 - 1, 1024, local4);
				}
				if (arg2 == 3) {
					this.method4048(local13, 81920, local4);
					this.method4048(local13 - 1, 1024, local4);
					this.method4048(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method4048(local13, 536870912, local4);
				this.method4048(local13, 33554432, local4 - 1);
			}
			if (arg2 == 1) {
				this.method4048(local13, 8388608, local4);
				this.method4048(local13 + 1, 134217728, local4);
			}
			if (arg2 == 2) {
				this.method4048(local13, 33554432, local4);
				this.method4048(local13, 536870912, local4 + 1);
			}
			if (arg2 == 3) {
				this.method4048(local13, 134217728, local4);
				this.method4048(local13 - 1, 8388608, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method4048(local13, 4194304, local4);
				this.method4048(local13 + 1, 67108864, local4 - 1);
			}
			if (arg2 == 1) {
				this.method4048(local13, 16777216, local4);
				this.method4048(local13 + 1, 268435456, local4 + 1);
			}
			if (arg2 == 2) {
				this.method4048(local13, 67108864, local4);
				this.method4048(local13 - 1, 4194304, local4 + 1);
			}
			if (arg2 == 3) {
				this.method4048(local13, 268435456, local4);
				this.method4048(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method4048(local13, 545259520, local4);
			this.method4048(local13, 33554432, local4 - 1);
			this.method4048(local13 + 1, 134217728, local4);
		}
		if (arg2 == 1) {
			this.method4048(local13, 41943040, local4);
			this.method4048(local13 + 1, 134217728, local4);
			this.method4048(local13, 536870912, local4 + 1);
		}
		if (arg2 == 2) {
			this.method4048(local13, 167772160, local4);
			this.method4048(local13, 536870912, local4 + 1);
			this.method4048(local13 - 1, 8388608, local4);
		}
		if (arg2 == 3) {
			this.method4048(local13, 671088640, local4);
			this.method4048(local13 - 1, 8388608, local4);
			this.method4048(local13, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg2 && arg3 == arg5) {
				return true;
			}
		} else if (arg2 >= arg0 && arg2 <= arg1 + arg0 - 1 && arg3 <= arg3 && arg3 <= arg3 + arg1 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg2 - this.anInt4570;
		@Pc(67) int local67 = arg0 - this.anInt4570;
		@Pc(72) int local72 = arg3 - this.anInt4574;
		@Pc(77) int local77 = arg5 - this.anInt4574;
		if (arg1 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local67 == local57 + 1 && local72 == local77 && (this.anIntArrayArray34[local67][local77] & 0x80) == 0) {
						return true;
					}
					if (local57 == local67 && local72 - 1 == local77 && (this.anIntArrayArray34[local67][local77] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 == local57 - 1 && local72 == local77 && (this.anIntArrayArray34[local67][local77] & 0x8) == 0) {
						return true;
					}
					if (local67 == local57 && local72 - 1 == local77 && (this.anIntArrayArray34[local67][local77] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local57 - 1 == local67 && local72 == local77 && (this.anIntArrayArray34[local67][local77] & 0x8) == 0) {
						return true;
					}
					if (local57 == local67 && local72 + 1 == local77 && (this.anIntArrayArray34[local67][local77] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 == local57 + 1 && local77 == local72 && (this.anIntArrayArray34[local67][local77] & 0x80) == 0) {
						return true;
					}
					if (local67 == local57 && local77 == local72 + 1 && (this.anIntArrayArray34[local67][local77] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local67 == local57 && local77 == local72 + 1 && (this.anIntArrayArray34[local67][local77] & 0x20) == 0) {
					return true;
				}
				if (local67 == local57 && local77 == local72 - 1 && (this.anIntArrayArray34[local67][local77] & 0x2) == 0) {
					return true;
				}
				if (local67 == local57 - 1 && local77 == local72 && (this.anIntArrayArray34[local67][local77] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local67 && local77 == local72 && (this.anIntArrayArray34[local67][local77] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(412) int local412 = local67 + arg1 - 1;
			@Pc(418) int local418 = arg1 + local77 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local57 + 1 == local67 && local72 >= local77 && local72 <= local418 && (this.anIntArrayArray34[local67][local72] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local67 && local412 >= local57 && local77 == local72 - arg1 && (this.anIntArrayArray34[local57][local418] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local57 - arg1 == local67 && local72 >= local77 && local418 >= local72 && (this.anIntArrayArray34[local412][local72] & 0x8) == 0) {
						return true;
					}
					if (local57 >= local67 && local57 <= local412 && local72 - arg1 == local77 && (this.anIntArrayArray34[local57][local418] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local57 - arg1 == local67 && local77 <= local72 && local418 >= local72 && (this.anIntArrayArray34[local412][local72] & 0x8) == 0) {
						return true;
					}
					if (local67 <= local57 && local57 <= local412 && local72 + 1 == local77 && (this.anIntArrayArray34[local57][local77] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local57 + 1 == local67 && local72 >= local77 && local72 <= local418 && (this.anIntArrayArray34[local67][local72] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local67 && local57 <= local412 && local72 + 1 == local77 && (this.anIntArrayArray34[local57][local77] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local67 <= local57 && local57 <= local412 && local72 + 1 == local77 && (this.anIntArrayArray34[local57][local77] & 0x20) == 0) {
					return true;
				}
				if (local57 >= local67 && local412 >= local57 && local77 == local72 - arg1 && (this.anIntArrayArray34[local57][local418] & 0x2) == 0) {
					return true;
				}
				if (local57 - arg1 == local67 && local72 >= local77 && local72 <= local418 && (this.anIntArrayArray34[local412][local72] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local67 && local77 <= local72 && local418 >= local72 && (this.anIntArrayArray34[local67][local72] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZIIIZI)V")
	public void method4055(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg3 - this.anInt4574;
		@Pc(29) int local29 = arg5 - this.anInt4570;
		for (@Pc(36) int local36 = local29; local36 < arg2 + local29; local36++) {
			if (local36 >= 0 && this.anInt4567 > local36) {
				for (@Pc(50) int local50 = local24; local50 < arg1 + local24; local50++) {
					if (local50 >= 0 && this.anInt4568 > local50) {
						this.method4048(local50, local7, local36);
					}
				}
			}
		}
	}
}

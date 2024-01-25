import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class14 {

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	public int anInt356;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "I")
	public int anInt374;

	@OriginalMember(owner = "client!as", name = "A", descriptor = "I")
	public int anInt377;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BII)V")
	public void method268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt374;
		@Pc(21) int local21 = arg0 - this.anInt377;
		this.anIntArrayArray3[local21][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZII)V")
	public void method269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt374;
		@Pc(19) int local19 = arg1 - this.anInt377;
		this.anIntArrayArray3[local19][local14] |= 0x200000;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 > 1) {
			return Static311.method4232(arg4, arg7, arg3, arg0, arg6, arg3, arg2, arg1) ? true : this.method272(arg4, arg7, arg1, arg3, arg6, arg3, arg5, arg2, arg0);
		}
		@Pc(39) int local39 = arg2 + arg0 - 1;
		@Pc(49) int local49 = arg6 + arg1 - 1;
		if (arg7 >= arg2 && arg7 <= local39 && arg4 >= arg1 && arg4 <= local49) {
			return true;
		} else if (arg7 == arg2 - 1 && arg1 <= arg4 && arg4 <= local49 && (this.anIntArrayArray3[arg7 - this.anInt377][arg4 - this.anInt374] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg7 == local39 + 1 && arg4 >= arg1 && local49 >= arg4 && (this.anIntArrayArray3[arg7 - this.anInt377][arg4 - this.anInt374] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg4 && arg2 <= arg7 && arg7 <= local39 && (this.anIntArrayArray3[arg7 - this.anInt377][arg4 - this.anInt374] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local49 + 1 && arg2 <= arg7 && local39 >= arg7 && (this.anIntArrayArray3[arg7 - this.anInt377][arg4 - this.anInt374] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIBIIII)Z")
	public boolean method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 + arg1;
		@Pc(18) int local18 = arg3 + arg0;
		@Pc(22) int local22 = arg7 + arg8;
		@Pc(26) int local26 = arg2 + arg4;
		@Pc(71) int local71;
		@Pc(82) int local82;
		if (local22 == arg1 && (arg6 & 0x2) == 0) {
			local71 = arg0 <= arg2 ? arg2 : arg0;
			local82 = local18 < local26 ? local18 : local26;
			while (local82 > local71) {
				if ((this.anIntArrayArray3[local22 - this.anInt377 - 1][local71 - this.anInt374] & 0x8) == 0) {
					return true;
				}
				local71++;
			}
		} else if (arg7 == local9 && (arg6 & 0x8) == 0) {
			local71 = arg2 < arg0 ? arg0 : arg2;
			local82 = local18 >= local26 ? local26 : local18;
			while (local82 > local71) {
				if ((this.anIntArrayArray3[arg7 - this.anInt377][local71 - this.anInt374] & 0x80) == 0) {
					return true;
				}
				local71++;
			}
		} else if (arg0 == local26 && (arg6 & 0x1) == 0) {
			local71 = arg7 < arg1 ? arg1 : arg7;
			local82 = local22 > local9 ? local9 : local22;
			while (local82 > local71) {
				if ((this.anIntArrayArray3[local71 - this.anInt377][local26 - this.anInt374 - 1] & 0x2) == 0) {
					return true;
				}
				local71++;
			}
		} else if (arg2 == local18 && (arg6 & 0x4) == 0) {
			local71 = arg1 <= arg7 ? arg7 : arg1;
			local82 = local22 > local9 ? local9 : local22;
			while (local71 < local82) {
				if ((this.anIntArrayArray3[local71 - this.anInt377][arg2 - this.anInt374] & 0x20) == 0) {
					return true;
				}
				local71++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIZIIZ)V")
	public void method273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg0 - this.anInt377;
		@Pc(13) int local13 = arg1 - this.anInt374;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method281(local8, 128, local13);
				this.method281(local8 - 1, 8, local13);
			}
			if (arg4 == 1) {
				this.method281(local8, 2, local13);
				this.method281(local8, 32, local13 + 1);
			}
			if (arg4 == 2) {
				this.method281(local8, 8, local13);
				this.method281(local8 + 1, 128, local13);
			}
			if (arg4 == 3) {
				this.method281(local8, 32, local13);
				this.method281(local8, 2, local13 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method281(local8, 1, local13);
				this.method281(local8 - 1, 16, local13 + 1);
			}
			if (arg4 == 1) {
				this.method281(local8, 4, local13);
				this.method281(local8 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method281(local8, 16, local13);
				this.method281(local8 + 1, 1, local13 - 1);
			}
			if (arg4 == 3) {
				this.method281(local8, 64, local13);
				this.method281(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method281(local8, 130, local13);
				this.method281(local8 - 1, 8, local13);
				this.method281(local8, 32, local13 + 1);
			}
			if (arg4 == 1) {
				this.method281(local8, 10, local13);
				this.method281(local8, 32, local13 + 1);
				this.method281(local8 + 1, 128, local13);
			}
			if (arg4 == 2) {
				this.method281(local8, 40, local13);
				this.method281(local8 + 1, 128, local13);
				this.method281(local8, 2, local13 - 1);
			}
			if (arg4 == 3) {
				this.method281(local8, 160, local13);
				this.method281(local8, 2, local13 - 1);
				this.method281(local8 - 1, 8, local13);
			}
		}
		if (arg2) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method281(local8, 65536, local13);
					this.method281(local8 - 1, 4096, local13);
				}
				if (arg4 == 1) {
					this.method281(local8, 1024, local13);
					this.method281(local8, 16384, local13 + 1);
				}
				if (arg4 == 2) {
					this.method281(local8, 4096, local13);
					this.method281(local8 + 1, 65536, local13);
				}
				if (arg4 == 3) {
					this.method281(local8, 16384, local13);
					this.method281(local8, 1024, local13 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method281(local8, 512, local13);
					this.method281(local8 - 1, 8192, local13 + 1);
				}
				if (arg4 == 1) {
					this.method281(local8, 2048, local13);
					this.method281(local8 + 1, 32768, local13 + 1);
				}
				if (arg4 == 2) {
					this.method281(local8, 8192, local13);
					this.method281(local8 + 1, 512, local13 - 1);
				}
				if (arg4 == 3) {
					this.method281(local8, 32768, local13);
					this.method281(local8 - 1, 2048, local13 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method281(local8, 66560, local13);
					this.method281(local8 - 1, 4096, local13);
					this.method281(local8, 16384, local13 + 1);
				}
				if (arg4 == 1) {
					this.method281(local8, 5120, local13);
					this.method281(local8, 16384, local13 + 1);
					this.method281(local8 + 1, 65536, local13);
				}
				if (arg4 == 2) {
					this.method281(local8, 20480, local13);
					this.method281(local8 + 1, 65536, local13);
					this.method281(local8, 1024, local13 - 1);
				}
				if (arg4 == 3) {
					this.method281(local8, 81920, local13);
					this.method281(local8, 1024, local13 - 1);
					this.method281(local8 - 1, 4096, local13);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method281(local8, 536870912, local13);
				this.method281(local8 - 1, 33554432, local13);
			}
			if (arg4 == 1) {
				this.method281(local8, 8388608, local13);
				this.method281(local8, 134217728, local13 + 1);
			}
			if (arg4 == 2) {
				this.method281(local8, 33554432, local13);
				this.method281(local8 + 1, 536870912, local13);
			}
			if (arg4 == 3) {
				this.method281(local8, 134217728, local13);
				this.method281(local8, 8388608, local13 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method281(local8, 4194304, local13);
				this.method281(local8 - 1, 67108864, local13 + 1);
			}
			if (arg4 == 1) {
				this.method281(local8, 16777216, local13);
				this.method281(local8 + 1, 268435456, local13 + 1);
			}
			if (arg4 == 2) {
				this.method281(local8, 67108864, local13);
				this.method281(local8 + 1, 4194304, local13 - 1);
			}
			if (arg4 == 3) {
				this.method281(local8, 268435456, local13);
				this.method281(local8 - 1, 16777216, local13 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method281(local8, 545259520, local13);
			this.method281(local8 - 1, 33554432, local13);
			this.method281(local8, 134217728, local13 + 1);
		}
		if (arg4 == 1) {
			this.method281(local8, 41943040, local13);
			this.method281(local8, 134217728, local13 + 1);
			this.method281(local8 + 1, 536870912, local13);
		}
		if (arg4 == 2) {
			this.method281(local8, 167772160, local13);
			this.method281(local8 + 1, 536870912, local13);
			this.method281(local8, 8388608, local13 - 1);
		}
		if (arg4 == 3) {
			this.method281(local8, 671088640, local13);
			this.method281(local8, 8388608, local13 - 1);
			this.method281(local8 - 1, 33554432, local13);
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(III)V")
	public void method274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt377;
		@Pc(21) int local21 = arg0 - this.anInt374;
		this.anIntArrayArray3[local16][local21] |= 0x40000;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg6 && arg4 == arg5) {
				return true;
			}
		} else if (arg2 >= arg6 && arg6 + arg0 - 1 >= arg2 && arg5 >= arg5 && arg0 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(62) int local62 = arg5 - this.anInt374;
		@Pc(67) int local67 = arg6 - this.anInt377;
		@Pc(72) int local72 = arg4 - this.anInt374;
		@Pc(77) int local77 = arg2 - this.anInt377;
		if (arg0 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local67 == local77 - 1 && local72 == local62) {
						return true;
					}
					if (local67 == local77 && local72 == local62 + 1 && (this.anIntArrayArray3[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local77 && local72 == local62 - 1 && (this.anIntArrayArray3[local67][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local67 == local77 && local62 + 1 == local72) {
						return true;
					}
					if (local77 - 1 == local67 && local72 == local62 && (this.anIntArrayArray3[local67][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local77 + 1 && local72 == local62 && (this.anIntArrayArray3[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 == local77 + 1 && local72 == local62) {
						return true;
					}
					if (local77 == local67 && local72 == local62 + 1 && (this.anIntArrayArray3[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local77 && local72 == local62 - 1 && (this.anIntArrayArray3[local67][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 == local77 && local62 - 1 == local72) {
						return true;
					}
					if (local67 == local77 - 1 && local72 == local62 && (this.anIntArrayArray3[local67][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local77 + 1 && local62 == local72 && (this.anIntArrayArray3[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local77 - 1 == local67 && local62 == local72) {
						return true;
					}
					if (local67 == local77 && local72 == local62 + 1) {
						return true;
					}
					if (local77 + 1 == local67 && local72 == local62 && (this.anIntArrayArray3[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 == local67 && local62 - 1 == local72 && (this.anIntArrayArray3[local67][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local77 - 1 == local67 && local62 == local72 && (this.anIntArrayArray3[local67][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local62 + 1) {
						return true;
					}
					if (local67 == local77 + 1 && local62 == local72) {
						return true;
					}
					if (local77 == local67 && local72 == local62 - 1 && (this.anIntArrayArray3[local67][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 == local77 - 1 && local62 == local72 && (this.anIntArrayArray3[local67][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local62 + 1 && (this.anIntArrayArray3[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local67 && local72 == local62) {
						return true;
					}
					if (local77 == local67 && local72 == local62 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 == local77 - 1 && local62 == local72) {
						return true;
					}
					if (local67 == local77 && local62 + 1 == local72 && (this.anIntArrayArray3[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local67 && local62 == local72 && (this.anIntArrayArray3[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local77 && local62 - 1 == local72) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local67 == local77 && local72 == local62 + 1 && (this.anIntArrayArray3[local67][local72] & 0x20) == 0) {
					return true;
				}
				if (local77 == local67 && local72 == local62 - 1 && (this.anIntArrayArray3[local67][local72] & 0x2) == 0) {
					return true;
				}
				if (local77 - 1 == local67 && local72 == local62 && (this.anIntArrayArray3[local67][local72] & 0x8) == 0) {
					return true;
				}
				if (local77 + 1 == local67 && local72 == local62 && (this.anIntArrayArray3[local67][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(88) int local88 = local67 + arg0 - 1;
			@Pc(95) int local95 = local72 + arg0 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local67 == local77 - arg0 && local62 >= local72 && local95 >= local62) {
						return true;
					}
					if (local77 >= local67 && local77 <= local88 && local72 == local62 + 1 && (this.anIntArrayArray3[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 <= local77 && local88 >= local77 && local72 == local62 - arg0 && (this.anIntArrayArray3[local77][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local77 >= local67 && local88 >= local77 && local62 + 1 == local72) {
						return true;
					}
					if (local77 - arg0 == local67 && local72 <= local62 && local62 <= local95 && (this.anIntArrayArray3[local88][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 + 1 == local67 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray3[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 == local77 + 1 && local72 <= local62 && local95 >= local62) {
						return true;
					}
					if (local67 <= local77 && local77 <= local88 && local72 == local62 + 1 && (this.anIntArrayArray3[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 >= local67 && local77 <= local88 && local72 == local62 - arg0 && (this.anIntArrayArray3[local77][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 <= local77 && local88 >= local77 && local72 == local62 - arg0) {
						return true;
					}
					if (local67 == local77 - arg0 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray3[local88][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local77 + 1 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray3[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local67 == local77 - arg0 && local72 <= local62 && local95 >= local62) {
						return true;
					}
					if (local67 <= local77 && local88 >= local77 && local62 + 1 == local72) {
						return true;
					}
					if (local67 == local77 + 1 && local72 <= local62 && local62 <= local95 && (this.anIntArrayArray3[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 >= local67 && local77 <= local88 && local72 == local62 - arg0 && (this.anIntArrayArray3[local77][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local67 == local77 - arg0 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray3[local88][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 >= local67 && local88 >= local77 && local72 == local62 + 1) {
						return true;
					}
					if (local77 + 1 == local67 && local72 <= local62 && local62 <= local95) {
						return true;
					}
					if (local67 <= local77 && local77 <= local88 && local72 == local62 - arg0 && (this.anIntArrayArray3[local77][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 - arg0 == local67 && local62 >= local72 && local62 <= local95 && (this.anIntArrayArray3[local88][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 >= local67 && local88 >= local77 && local62 + 1 == local72 && (this.anIntArrayArray3[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local77 + 1 && local62 >= local72 && local62 <= local95) {
						return true;
					}
					if (local77 >= local67 && local77 <= local88 && local62 - arg0 == local72) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 == local77 - arg0 && local62 >= local72 && local62 <= local95) {
						return true;
					}
					if (local77 >= local67 && local88 >= local77 && local62 + 1 == local72 && (this.anIntArrayArray3[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local77 + 1 && local62 >= local72 && local62 <= local95 && (this.anIntArrayArray3[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 >= local67 && local77 <= local88 && local72 == local62 - arg0) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local67 <= local77 && local88 >= local77 && local62 + 1 == local72 && (this.anIntArrayArray3[local77][local72] & 0x2C0120) == 0) {
					return true;
				}
				if (local77 >= local67 && local88 >= local77 && local62 - arg0 == local72 && (this.anIntArrayArray3[local77][local95] & 0x2C0102) == 0) {
					return true;
				}
				if (local77 - arg0 == local67 && local72 <= local62 && local62 <= local95 && (this.anIntArrayArray3[local88][local62] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 == local77 + 1 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray3[local67][local62] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg3 == arg6 && arg4 == arg1) {
				return true;
			}
		} else if (arg6 <= arg3 && arg3 <= arg6 + arg2 - 1 && arg4 <= arg4 && arg4 <= arg2 + arg4 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg6 - this.anInt377;
		@Pc(58) int local58 = arg3 - this.anInt377;
		@Pc(63) int local63 = arg1 - this.anInt374;
		@Pc(68) int local68 = arg4 - this.anInt374;
		if (arg2 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local58 + 1 == local53 && local63 == local68 && (this.anIntArrayArray3[local53][local63] & 0x80) == 0) {
						return true;
					}
					if (local53 == local58 && local68 - 1 == local63 && (this.anIntArrayArray3[local53][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local53 == local58 - 1 && local68 == local63 && (this.anIntArrayArray3[local53][local63] & 0x8) == 0) {
						return true;
					}
					if (local53 == local58 && local63 == local68 - 1 && (this.anIntArrayArray3[local53][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local53 == local58 - 1 && local63 == local68 && (this.anIntArrayArray3[local53][local63] & 0x8) == 0) {
						return true;
					}
					if (local58 == local53 && local68 + 1 == local63 && (this.anIntArrayArray3[local53][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local53 == local58 + 1 && local63 == local68 && (this.anIntArrayArray3[local53][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local53 && local68 + 1 == local63 && (this.anIntArrayArray3[local53][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local53 == local58 && local68 + 1 == local63 && (this.anIntArrayArray3[local53][local63] & 0x20) == 0) {
					return true;
				}
				if (local53 == local58 && local68 - 1 == local63 && (this.anIntArrayArray3[local53][local63] & 0x2) == 0) {
					return true;
				}
				if (local53 == local58 - 1 && local63 == local68 && (this.anIntArrayArray3[local53][local63] & 0x8) == 0) {
					return true;
				}
				if (local58 + 1 == local53 && local63 == local68 && (this.anIntArrayArray3[local53][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(393) int local393 = arg2 + local53 - 1;
			@Pc(399) int local399 = local63 + arg2 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local53 == local58 + 1 && local68 >= local63 && local68 <= local399 && (this.anIntArrayArray3[local53][local68] & 0x80) == 0) {
						return true;
					}
					if (local53 <= local58 && local58 <= local393 && local68 - arg2 == local63 && (this.anIntArrayArray3[local58][local399] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 - arg2 == local53 && local63 <= local68 && local68 <= local399 && (this.anIntArrayArray3[local393][local68] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local58 && local393 >= local58 && local63 == local68 - arg2 && (this.anIntArrayArray3[local58][local399] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 - arg2 == local53 && local63 <= local68 && local399 >= local68 && (this.anIntArrayArray3[local393][local68] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local58 && local393 >= local58 && local63 == local68 + 1 && (this.anIntArrayArray3[local58][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local53 == local58 + 1 && local68 >= local63 && local399 >= local68 && (this.anIntArrayArray3[local53][local68] & 0x80) == 0) {
						return true;
					}
					if (local58 >= local53 && local58 <= local393 && local68 + 1 == local63 && (this.anIntArrayArray3[local58][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local53 <= local58 && local58 <= local393 && local68 + 1 == local63 && (this.anIntArrayArray3[local58][local63] & 0x20) == 0) {
					return true;
				}
				if (local53 <= local58 && local58 <= local393 && local63 == local68 - arg2 && (this.anIntArrayArray3[local58][local399] & 0x2) == 0) {
					return true;
				}
				if (local53 == local58 - arg2 && local63 <= local68 && local68 <= local399 && (this.anIntArrayArray3[local393][local68] & 0x8) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local68 >= local63 && local399 >= local68 && (this.anIntArrayArray3[local53][local68] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V")
	private void method281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZIIIII)V")
	public void method282(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt377;
		@Pc(17) int local17 = arg2 - this.anInt374;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method284(local8, local17, 128);
				this.method284(local8 - 1, local17, 8);
			}
			if (arg5 == 1) {
				this.method284(local8, local17, 2);
				this.method284(local8, local17 + 1, 32);
			}
			if (arg5 == 2) {
				this.method284(local8, local17, 8);
				this.method284(local8 + 1, local17, 128);
			}
			if (arg5 == 3) {
				this.method284(local8, local17, 32);
				this.method284(local8, local17 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method284(local8, local17, 1);
				this.method284(local8 - 1, local17 - -1, 16);
			}
			if (arg5 == 1) {
				this.method284(local8, local17, 4);
				this.method284(local8 + 1, local17 + 1, 64);
			}
			if (arg5 == 2) {
				this.method284(local8, local17, 16);
				this.method284(local8 + 1, local17 - 1, 1);
			}
			if (arg5 == 3) {
				this.method284(local8, local17, 64);
				this.method284(local8 - 1, local17 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method284(local8, local17, 130);
				this.method284(local8 - 1, local17, 8);
				this.method284(local8, local17 + 1, 32);
			}
			if (arg5 == 1) {
				this.method284(local8, local17, 10);
				this.method284(local8, local17 + 1, 32);
				this.method284(local8 + 1, local17, 128);
			}
			if (arg5 == 2) {
				this.method284(local8, local17, 40);
				this.method284(local8 + 1, local17, 128);
				this.method284(local8, local17 - 1, 2);
			}
			if (arg5 == 3) {
				this.method284(local8, local17, 160);
				this.method284(local8, local17 - 1, 2);
				this.method284(local8 - 1, local17, 8);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method284(local8, local17, 65536);
					this.method284(local8 - 1, local17, 4096);
				}
				if (arg5 == 1) {
					this.method284(local8, local17, 1024);
					this.method284(local8, local17 + 1, 16384);
				}
				if (arg5 == 2) {
					this.method284(local8, local17, 4096);
					this.method284(local8 + 1, local17, 65536);
				}
				if (arg5 == 3) {
					this.method284(local8, local17, 16384);
					this.method284(local8, local17 - 1, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method284(local8, local17, 512);
					this.method284(local8 - 1, local17 + 1, 8192);
				}
				if (arg5 == 1) {
					this.method284(local8, local17, 2048);
					this.method284(local8 + 1, local17 - -1, 32768);
				}
				if (arg5 == 2) {
					this.method284(local8, local17, 8192);
					this.method284(local8 + 1, local17 + -1, 512);
				}
				if (arg5 == 3) {
					this.method284(local8, local17, 32768);
					this.method284(local8 - 1, local17 - 1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method284(local8, local17, 66560);
					this.method284(local8 - 1, local17, 4096);
					this.method284(local8, local17 + 1, 16384);
				}
				if (arg5 == 1) {
					this.method284(local8, local17, 5120);
					this.method284(local8, local17 + 1, 16384);
					this.method284(local8 + 1, local17, 65536);
				}
				if (arg5 == 2) {
					this.method284(local8, local17, 20480);
					this.method284(local8 + 1, local17, 65536);
					this.method284(local8, local17 - 1, 1024);
				}
				if (arg5 == 3) {
					this.method284(local8, local17, 81920);
					this.method284(local8, local17 - 1, 1024);
					this.method284(local8 - 1, local17, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method284(local8, local17, 536870912);
				this.method284(local8 - 1, local17, 33554432);
			}
			if (arg5 == 1) {
				this.method284(local8, local17, 8388608);
				this.method284(local8, local17 + 1, 134217728);
			}
			if (arg5 == 2) {
				this.method284(local8, local17, 33554432);
				this.method284(local8 + 1, local17, 536870912);
			}
			if (arg5 == 3) {
				this.method284(local8, local17, 134217728);
				this.method284(local8, local17 - 1, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method284(local8, local17, 4194304);
				this.method284(local8 - 1, local17 + 1, 67108864);
			}
			if (arg5 == 1) {
				this.method284(local8, local17, 16777216);
				this.method284(local8 + 1, local17 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method284(local8, local17, 67108864);
				this.method284(local8 + 1, local17 + -1, 4194304);
			}
			if (arg5 == 3) {
				this.method284(local8, local17, 268435456);
				this.method284(local8 - 1, local17 - 1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method284(local8, local17, 545259520);
			this.method284(local8 - 1, local17, 33554432);
			this.method284(local8, local17 + 1, 134217728);
		}
		if (arg5 == 1) {
			this.method284(local8, local17, 41943040);
			this.method284(local8, local17 + 1, 134217728);
			this.method284(local8 + 1, local17, 536870912);
		}
		if (arg5 == 2) {
			this.method284(local8, local17, 167772160);
			this.method284(local8 + 1, local17, 536870912);
			this.method284(local8, local17 - 1, 8388608);
		}
		if (arg5 == 3) {
			this.method284(local8, local17, 671088640);
			this.method284(local8, local17 - 1, 8388608);
			this.method284(local8 - 1, local17, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZIIIZ)V")
	public void method283(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt374;
		@Pc(23) int local23 = arg3 - this.anInt377;
		if (arg1) {
			local7 |= 0x40000000;
		}
		for (@Pc(40) int local40 = local23; local40 < local23 + arg2; local40++) {
			if (local40 >= 0 && this.anInt356 > local40) {
				for (@Pc(53) int local53 = local18; local53 < arg0 + local18; local53++) {
					if (local53 >= 0 && local53 < this.anInt369) {
						this.method281(local40, local7, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IBII)V")
	private void method284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(III)V")
	public void method286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt374;
		@Pc(13) int local13 = arg0 - this.anInt377;
		this.anIntArrayArray3[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZIIZII)V")
	public void method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt374;
		@Pc(30) int local30;
		if (arg6 == 1 || arg6 == 3) {
			local30 = arg0;
			arg0 = arg1;
			arg1 = local30;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(45) int local45 = arg5 - this.anInt377;
		for (local30 = local45; local30 < local45 + arg0; local30++) {
			if (local30 >= 0 && local30 < this.anInt356) {
				for (@Pc(61) int local61 = local18; local61 < arg1 + local18; local61++) {
					if (local61 >= 0 && this.anInt369 > local61) {
						this.method284(local30, local61, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public void method288() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt356; local3++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt369; local13++) {
				if (local3 == 0 || local13 == 0 || this.anInt356 - 5 <= local3 || this.anInt369 - 5 <= local13) {
					this.anIntArrayArray3[local3][local13] = -1;
				} else {
					this.anIntArrayArray3[local3][local13] = 2097152;
				}
			}
		}
	}
}

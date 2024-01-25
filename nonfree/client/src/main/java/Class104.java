import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class104 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public int anInt3573;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public int anInt3575;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	public int anInt3585;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	private void method3248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray17[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIII)V")
	private void method3249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg0 == arg4 && arg5 == arg1) {
				return true;
			}
		} else if (arg4 <= arg0 && arg4 + arg2 - 1 >= arg0 && arg5 <= arg5 && arg2 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(67) int local67 = arg5 - this.anInt3573;
		@Pc(72) int local72 = arg1 - this.anInt3573;
		@Pc(77) int local77 = arg0 - this.anInt3585;
		@Pc(82) int local82 = arg4 - this.anInt3585;
		if (arg2 == 1) {
			if (arg6 == 0) {
				if (arg3 == 0) {
					if (local77 - 1 == local82 && local72 == local67) {
						return true;
					}
					if (local77 == local82 && local67 + 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 == local77 && local72 == local67 - 1 && (this.anIntArrayArray17[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local82 == local77 && local67 + 1 == local72) {
						return true;
					}
					if (local82 == local77 - 1 && local67 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local77 + 1 && local72 == local67 && (this.anIntArrayArray17[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 == local77 + 1 && local72 == local67) {
						return true;
					}
					if (local77 == local82 && local72 == local67 + 1 && (this.anIntArrayArray17[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local82 && local72 == local67 - 1 && (this.anIntArrayArray17[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local77 == local82 && local72 == local67 - 1) {
						return true;
					}
					if (local82 == local77 - 1 && local67 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 + 1 == local82 && local72 == local67 && (this.anIntArrayArray17[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg3 == 0) {
					if (local82 == local77 - 1 && local67 == local72) {
						return true;
					}
					if (local77 == local82 && local72 == local67 + 1) {
						return true;
					}
					if (local82 == local77 + 1 && local72 == local67 && (this.anIntArrayArray17[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 == local77 && local67 - 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local77 - 1 == local82 && local72 == local67 && (this.anIntArrayArray17[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local77 && local67 + 1 == local72) {
						return true;
					}
					if (local82 == local77 + 1 && local72 == local67) {
						return true;
					}
					if (local82 == local77 && local67 - 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local77 - 1 == local82 && local67 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local82 && local67 + 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 == local77 + 1 && local67 == local72) {
						return true;
					}
					if (local77 == local82 && local67 - 1 == local72) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local82 == local77 - 1 && local67 == local72) {
						return true;
					}
					if (local82 == local77 && local67 + 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local82 && local72 == local67 && (this.anIntArrayArray17[local82][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 == local77 && local67 - 1 == local72) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local82 == local77 && local67 + 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x20) == 0) {
					return true;
				}
				if (local77 == local82 && local67 - 1 == local72 && (this.anIntArrayArray17[local82][local72] & 0x2) == 0) {
					return true;
				}
				if (local82 == local77 - 1 && local67 == local72 && (this.anIntArrayArray17[local82][local72] & 0x8) == 0) {
					return true;
				}
				if (local82 == local77 + 1 && local67 == local72 && (this.anIntArrayArray17[local82][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(803) int local803 = arg2 + local82 - 1;
			@Pc(809) int local809 = arg2 + local72 - 1;
			if (arg6 == 0) {
				if (arg3 == 0) {
					if (local77 - arg2 == local82 && local67 >= local72 && local809 >= local67) {
						return true;
					}
					if (local77 >= local82 && local803 >= local77 && local67 + 1 == local72 && (this.anIntArrayArray17[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 >= local82 && local77 <= local803 && local72 == local67 - arg2 && (this.anIntArrayArray17[local77][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local82 <= local77 && local77 <= local803 && local72 == local67 + 1) {
						return true;
					}
					if (local77 - arg2 == local82 && local72 <= local67 && local67 <= local809 && (this.anIntArrayArray17[local803][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local77 + 1 && local67 >= local72 && local67 <= local809 && (this.anIntArrayArray17[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 == local77 + 1 && local67 >= local72 && local67 <= local809) {
						return true;
					}
					if (local77 >= local82 && local803 >= local77 && local72 == local67 + 1 && (this.anIntArrayArray17[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 <= local77 && local803 >= local77 && local72 == local67 - arg2 && (this.anIntArrayArray17[local77][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local77 >= local82 && local77 <= local803 && local67 - arg2 == local72) {
						return true;
					}
					if (local82 == local77 - arg2 && local67 >= local72 && local67 <= local809 && (this.anIntArrayArray17[local803][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local77 + 1 && local67 >= local72 && local809 >= local67 && (this.anIntArrayArray17[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg3 == 0) {
					if (local82 == local77 - arg2 && local67 >= local72 && local809 >= local67) {
						return true;
					}
					if (local77 >= local82 && local77 <= local803 && local67 + 1 == local72) {
						return true;
					}
					if (local77 + 1 == local82 && local72 <= local67 && local809 >= local67 && (this.anIntArrayArray17[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 <= local77 && local77 <= local803 && local67 - arg2 == local72 && (this.anIntArrayArray17[local77][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local77 - arg2 == local82 && local67 >= local72 && local809 >= local67 && (this.anIntArrayArray17[local803][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 >= local82 && local77 <= local803 && local72 == local67 + 1) {
						return true;
					}
					if (local82 == local77 + 1 && local67 >= local72 && local809 >= local67) {
						return true;
					}
					if (local82 <= local77 && local77 <= local803 && local67 - arg2 == local72 && (this.anIntArrayArray17[local77][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 == local77 - arg2 && local72 <= local67 && local809 >= local67 && (this.anIntArrayArray17[local803][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 <= local77 && local803 >= local77 && local67 + 1 == local72 && (this.anIntArrayArray17[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local82 && local67 >= local72 && local809 >= local67) {
						return true;
					}
					if (local77 >= local82 && local77 <= local803 && local67 - arg2 == local72) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local77 - arg2 == local82 && local72 <= local67 && local809 >= local67) {
						return true;
					}
					if (local82 <= local77 && local77 <= local803 && local72 == local67 + 1 && (this.anIntArrayArray17[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local82 && local67 >= local72 && local67 <= local809 && (this.anIntArrayArray17[local82][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 >= local82 && local77 <= local803 && local67 - arg2 == local72) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local82 <= local77 && local77 <= local803 && local67 + 1 == local72 && (this.anIntArrayArray17[local77][local72] & 0x2C0120) == 0) {
					return true;
				}
				if (local82 <= local77 && local803 >= local77 && local72 == local67 - arg2 && (this.anIntArrayArray17[local77][local809] & 0x2C0102) == 0) {
					return true;
				}
				if (local77 - arg2 == local82 && local72 <= local67 && local67 <= local809 && (this.anIntArrayArray17[local803][local67] & 0x2C0108) == 0) {
					return true;
				}
				if (local77 + 1 == local82 && local72 <= local67 && local809 >= local67 && (this.anIntArrayArray17[local82][local67] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3573;
		@Pc(25) int local25 = arg1 - this.anInt3585;
		this.anIntArrayArray17[local25][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(24) int local24 = arg4 + arg2;
		@Pc(28) int local28 = arg5 + arg6;
		@Pc(33) int local33 = arg0 + arg8;
		@Pc(38) int local38 = arg7 + arg3;
		@Pc(56) int local56;
		@Pc(67) int local67;
		if (arg4 == local33 && (arg1 & 0x2) == 0) {
			local56 = arg7 < arg6 ? arg6 : arg7;
			local67 = local38 > local28 ? local28 : local38;
			while (local56 < local67) {
				if ((this.anIntArrayArray17[local33 - this.anInt3585 - 1][local56 - this.anInt3573] & 0x8) == 0) {
					return true;
				}
				local56++;
			}
		} else if (local24 == arg0 && (arg1 & 0x8) == 0) {
			local56 = arg7 >= arg6 ? arg7 : arg6;
			local67 = local28 >= local38 ? local38 : local28;
			while (local67 > local56) {
				if ((this.anIntArrayArray17[arg0 - this.anInt3585][local56 - this.anInt3573] & 0x80) == 0) {
					return true;
				}
				local56++;
			}
		} else if (local38 == arg6 && (arg1 & 0x1) == 0) {
			local56 = arg4 > arg0 ? arg4 : arg0;
			local67 = local24 < local33 ? local24 : local33;
			while (local67 > local56) {
				if ((this.anIntArrayArray17[local56 - this.anInt3585][local38 - this.anInt3573 - 1] & 0x2) == 0) {
					return true;
				}
				local56++;
			}
		} else if (local28 == arg7 && (arg1 & 0x4) == 0) {
			local56 = arg0 < arg4 ? arg4 : arg0;
			local67 = local24 < local33 ? local24 : local33;
			while (local67 > local56) {
				if ((this.anIntArrayArray17[local56 - this.anInt3585][arg7 - this.anInt3573] & 0x20) == 0) {
					return true;
				}
				local56++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)V")
	public void method3254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3573;
		@Pc(9) int local9 = arg0 - this.anInt3585;
		this.anIntArrayArray17[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public void method3255() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3570; local3++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt3575; local20++) {
				if (local3 == 0 || local20 == 0 || local3 >= this.anInt3570 - 5 || this.anInt3575 - 5 <= local20) {
					this.anIntArrayArray17[local3][local20] = -1;
				} else {
					this.anIntArrayArray17[local3][local20] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(BII)V")
	public void method3256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3585;
		@Pc(13) int local13 = arg0 - this.anInt3573;
		this.anIntArrayArray17[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBIIIIIII)Z")
	public boolean method3258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static164.method3541(arg4, arg1, arg2, arg0, arg6, arg7, arg2, arg3) ? true : this.method3252(arg7, arg5, arg2, arg3, arg0, arg2, arg6, arg1, arg4);
		}
		@Pc(46) int local46 = arg4 + arg7 - 1;
		@Pc(53) int local53 = arg1 + arg3 - 1;
		if (arg0 >= arg7 && local46 >= arg0 && arg6 >= arg1 && arg6 <= local53) {
			return true;
		} else if (arg0 == arg7 - 1 && arg1 <= arg6 && arg6 <= local53 && (this.anIntArrayArray17[arg0 - this.anInt3585][arg6 - this.anInt3573] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg0 && arg1 <= arg6 && arg6 <= local53 && (this.anIntArrayArray17[arg0 - this.anInt3585][arg6 - this.anInt3573] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg6 && arg0 >= arg7 && local46 >= arg0 && (this.anIntArrayArray17[arg0 - this.anInt3585][arg6 - this.anInt3573] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local53 + 1 && arg0 >= arg7 && arg0 <= local46 && (this.anIntArrayArray17[arg0 - this.anInt3585][arg6 - this.anInt3573] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg3 == arg2 && arg0 == arg1) {
				return true;
			}
		} else if (arg3 <= arg2 && arg2 <= arg6 + arg3 - 1 && arg0 <= arg0 && arg0 <= arg6 + arg0 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg2 - this.anInt3585;
		@Pc(66) int local66 = arg3 - this.anInt3585;
		@Pc(71) int local71 = arg0 - this.anInt3573;
		@Pc(76) int local76 = arg1 - this.anInt3573;
		if (arg6 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local61 + 1 == local66 && local76 == local71 && (this.anIntArrayArray17[local66][local76] & 0x80) == 0) {
						return true;
					}
					if (local61 == local66 && local76 == local71 - 1 && (this.anIntArrayArray17[local66][local76] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 - 1 == local66 && local71 == local76 && (this.anIntArrayArray17[local66][local76] & 0x8) == 0) {
						return true;
					}
					if (local66 == local61 && local71 - 1 == local76 && (this.anIntArrayArray17[local66][local76] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 - 1 == local66 && local76 == local71 && (this.anIntArrayArray17[local66][local76] & 0x8) == 0) {
						return true;
					}
					if (local61 == local66 && local71 + 1 == local76 && (this.anIntArrayArray17[local66][local76] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 + 1 == local66 && local71 == local76 && (this.anIntArrayArray17[local66][local76] & 0x80) == 0) {
						return true;
					}
					if (local66 == local61 && local76 == local71 + 1 && (this.anIntArrayArray17[local66][local76] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local66 == local61 && local76 == local71 + 1 && (this.anIntArrayArray17[local66][local76] & 0x20) == 0) {
					return true;
				}
				if (local66 == local61 && local71 - 1 == local76 && (this.anIntArrayArray17[local66][local76] & 0x2) == 0) {
					return true;
				}
				if (local66 == local61 - 1 && local76 == local71 && (this.anIntArrayArray17[local66][local76] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local66 && local76 == local71 && (this.anIntArrayArray17[local66][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = arg6 + local66 - 1;
			@Pc(94) int local94 = local76 + arg6 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local61 + 1 == local66 && local76 <= local71 && local94 >= local71 && (this.anIntArrayArray17[local66][local71] & 0x80) == 0) {
						return true;
					}
					if (local66 <= local61 && local61 <= local87 && local76 == local71 - arg6 && (this.anIntArrayArray17[local61][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 - arg6 == local66 && local76 <= local71 && local94 >= local71 && (this.anIntArrayArray17[local87][local71] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local66 && local61 <= local87 && local76 == local71 - arg6 && (this.anIntArrayArray17[local61][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 - arg6 == local66 && local71 >= local76 && local94 >= local71 && (this.anIntArrayArray17[local87][local71] & 0x8) == 0) {
						return true;
					}
					if (local66 <= local61 && local61 <= local87 && local71 + 1 == local76 && (this.anIntArrayArray17[local61][local76] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 + 1 == local66 && local71 >= local76 && local71 <= local94 && (this.anIntArrayArray17[local66][local71] & 0x80) == 0) {
						return true;
					}
					if (local66 <= local61 && local87 >= local61 && local76 == local71 + 1 && (this.anIntArrayArray17[local61][local76] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local66 <= local61 && local87 >= local61 && local71 + 1 == local76 && (this.anIntArrayArray17[local61][local76] & 0x20) == 0) {
					return true;
				}
				if (local61 >= local66 && local61 <= local87 && local76 == local71 - arg6 && (this.anIntArrayArray17[local61][local94] & 0x2) == 0) {
					return true;
				}
				if (local66 == local61 - arg6 && local71 >= local76 && local71 <= local94 && (this.anIntArrayArray17[local87][local71] & 0x8) == 0) {
					return true;
				}
				if (local66 == local61 + 1 && local76 <= local71 && local71 <= local94 && (this.anIntArrayArray17[local66][local71] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIZIZI)V")
	public void method3260(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 256;
		if (arg4) {
			local13 = 131328;
		}
		@Pc(24) int local24 = arg3 - this.anInt3585;
		@Pc(29) int local29 = arg2 - this.anInt3573;
		if (arg0) {
			local13 |= 0x40000000;
		}
		for (@Pc(37) int local37 = local24; local37 < local24 + arg1; local37++) {
			if (local37 >= 0 && this.anInt3570 > local37) {
				for (@Pc(54) int local54 = local29; local54 < local29 + arg5; local54++) {
					if (local54 >= 0 && this.anInt3575 > local54) {
						this.method3249(local37, local13, local54);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIIZI)V")
	public void method3261(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt3585;
		@Pc(17) int local17 = arg4 - this.anInt3573;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method3248(128, local8, local17);
				this.method3248(8, local8 - 1, local17);
			}
			if (arg1 == 1) {
				this.method3248(2, local8, local17);
				this.method3248(32, local8, local17 + 1);
			}
			if (arg1 == 2) {
				this.method3248(8, local8, local17);
				this.method3248(128, local8 + 1, local17);
			}
			if (arg1 == 3) {
				this.method3248(32, local8, local17);
				this.method3248(2, local8, local17 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method3248(1, local8, local17);
				this.method3248(16, local8 - 1, local17 + 1);
			}
			if (arg1 == 1) {
				this.method3248(4, local8, local17);
				this.method3248(64, local8 + 1, local17 + 1);
			}
			if (arg1 == 2) {
				this.method3248(16, local8, local17);
				this.method3248(1, local8 + 1, local17 + -1);
			}
			if (arg1 == 3) {
				this.method3248(64, local8, local17);
				this.method3248(4, local8 - 1, local17 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method3248(130, local8, local17);
				this.method3248(8, local8 - 1, local17);
				this.method3248(32, local8, local17 + 1);
			}
			if (arg1 == 1) {
				this.method3248(10, local8, local17);
				this.method3248(32, local8, local17 + 1);
				this.method3248(128, local8 + 1, local17);
			}
			if (arg1 == 2) {
				this.method3248(40, local8, local17);
				this.method3248(128, local8 + 1, local17);
				this.method3248(2, local8, local17 - 1);
			}
			if (arg1 == 3) {
				this.method3248(160, local8, local17);
				this.method3248(2, local8, local17 - 1);
				this.method3248(8, local8 - 1, local17);
			}
		}
		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method3248(65536, local8, local17);
					this.method3248(4096, local8 - 1, local17);
				}
				if (arg1 == 1) {
					this.method3248(1024, local8, local17);
					this.method3248(16384, local8, local17 + 1);
				}
				if (arg1 == 2) {
					this.method3248(4096, local8, local17);
					this.method3248(65536, local8 + 1, local17);
				}
				if (arg1 == 3) {
					this.method3248(16384, local8, local17);
					this.method3248(1024, local8, local17 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method3248(512, local8, local17);
					this.method3248(8192, local8 - 1, local17 + 1);
				}
				if (arg1 == 1) {
					this.method3248(2048, local8, local17);
					this.method3248(32768, local8 + 1, local17 - -1);
				}
				if (arg1 == 2) {
					this.method3248(8192, local8, local17);
					this.method3248(512, local8 + 1, local17 - 1);
				}
				if (arg1 == 3) {
					this.method3248(32768, local8, local17);
					this.method3248(2048, local8 - 1, local17 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method3248(66560, local8, local17);
					this.method3248(4096, local8 - 1, local17);
					this.method3248(16384, local8, local17 + 1);
				}
				if (arg1 == 1) {
					this.method3248(5120, local8, local17);
					this.method3248(16384, local8, local17 + 1);
					this.method3248(65536, local8 + 1, local17);
				}
				if (arg1 == 2) {
					this.method3248(20480, local8, local17);
					this.method3248(65536, local8 + 1, local17);
					this.method3248(1024, local8, local17 - 1);
				}
				if (arg1 == 3) {
					this.method3248(81920, local8, local17);
					this.method3248(1024, local8, local17 - 1);
					this.method3248(4096, local8 - 1, local17);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method3248(536870912, local8, local17);
				this.method3248(33554432, local8 - 1, local17);
			}
			if (arg1 == 1) {
				this.method3248(8388608, local8, local17);
				this.method3248(134217728, local8, local17 + 1);
			}
			if (arg1 == 2) {
				this.method3248(33554432, local8, local17);
				this.method3248(536870912, local8 + 1, local17);
			}
			if (arg1 == 3) {
				this.method3248(134217728, local8, local17);
				this.method3248(8388608, local8, local17 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method3248(4194304, local8, local17);
				this.method3248(67108864, local8 - 1, local17 + 1);
			}
			if (arg1 == 1) {
				this.method3248(16777216, local8, local17);
				this.method3248(268435456, local8 + 1, local17 + 1);
			}
			if (arg1 == 2) {
				this.method3248(67108864, local8, local17);
				this.method3248(4194304, local8 + 1, local17 + -1);
			}
			if (arg1 == 3) {
				this.method3248(268435456, local8, local17);
				this.method3248(16777216, local8 - 1, local17 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method3248(545259520, local8, local17);
			this.method3248(33554432, local8 - 1, local17);
			this.method3248(134217728, local8, local17 + 1);
		}
		if (arg1 == 1) {
			this.method3248(41943040, local8, local17);
			this.method3248(134217728, local8, local17 + 1);
			this.method3248(536870912, local8 + 1, local17);
		}
		if (arg1 == 2) {
			this.method3248(167772160, local8, local17);
			this.method3248(536870912, local8 + 1, local17);
			this.method3248(8388608, local8, local17 - 1);
		}
		if (arg1 == 3) {
			this.method3248(671088640, local8, local17);
			this.method3248(8388608, local8, local17 - 1);
			this.method3248(33554432, local8 - 1, local17);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)V")
	public void method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 - this.anInt3573;
		@Pc(19) int local19 = arg1 - this.anInt3585;
		this.anIntArrayArray17[local19][local10] |= 0x200000;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZZIIIII)V")
	public void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = 256;
		if (arg2) {
			local11 = 131328;
		}
		@Pc(22) int local22 = arg3 - this.anInt3585;
		@Pc(27) int local27 = arg4 - this.anInt3573;
		if (arg1) {
			local11 |= 0x40000000;
		}
		@Pc(41) int local41;
		if (arg0 == 1 || arg0 == 3) {
			local41 = arg6;
			arg6 = arg5;
			arg5 = local41;
		}
		for (local41 = local22; local41 < arg6 + local22; local41++) {
			if (local41 >= 0 && local41 < this.anInt3570) {
				for (@Pc(60) int local60 = local27; local60 < local27 + arg5; local60++) {
					if (local60 >= 0 && this.anInt3575 > local60) {
						this.method3248(local11, local41, local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZZ)V")
	public void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(16) int local16 = arg0 - this.anInt3573;
		@Pc(21) int local21 = arg1 - this.anInt3585;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method3249(local21, 128, local16);
				this.method3249(local21 - 1, 8, local16);
			}
			if (arg3 == 1) {
				this.method3249(local21, 2, local16);
				this.method3249(local21, 32, local16 + 1);
			}
			if (arg3 == 2) {
				this.method3249(local21, 8, local16);
				this.method3249(local21 + 1, 128, local16);
			}
			if (arg3 == 3) {
				this.method3249(local21, 32, local16);
				this.method3249(local21, 2, local16 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method3249(local21, 1, local16);
				this.method3249(local21 - 1, 16, local16 + 1);
			}
			if (arg3 == 1) {
				this.method3249(local21, 4, local16);
				this.method3249(local21 + 1, 64, local16 + 1);
			}
			if (arg3 == 2) {
				this.method3249(local21, 16, local16);
				this.method3249(local21 + 1, 1, local16 - 1);
			}
			if (arg3 == 3) {
				this.method3249(local21, 64, local16);
				this.method3249(local21 - 1, 4, local16 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method3249(local21, 130, local16);
				this.method3249(local21 - 1, 8, local16);
				this.method3249(local21, 32, local16 + 1);
			}
			if (arg3 == 1) {
				this.method3249(local21, 10, local16);
				this.method3249(local21, 32, local16 + 1);
				this.method3249(local21 + 1, 128, local16);
			}
			if (arg3 == 2) {
				this.method3249(local21, 40, local16);
				this.method3249(local21 + 1, 128, local16);
				this.method3249(local21, 2, local16 - 1);
			}
			if (arg3 == 3) {
				this.method3249(local21, 160, local16);
				this.method3249(local21, 2, local16 - 1);
				this.method3249(local21 - 1, 8, local16);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method3249(local21, 65536, local16);
					this.method3249(local21 - 1, 4096, local16);
				}
				if (arg3 == 1) {
					this.method3249(local21, 1024, local16);
					this.method3249(local21, 16384, local16 + 1);
				}
				if (arg3 == 2) {
					this.method3249(local21, 4096, local16);
					this.method3249(local21 + 1, 65536, local16);
				}
				if (arg3 == 3) {
					this.method3249(local21, 16384, local16);
					this.method3249(local21, 1024, local16 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method3249(local21, 512, local16);
					this.method3249(local21 - 1, 8192, local16 + 1);
				}
				if (arg3 == 1) {
					this.method3249(local21, 2048, local16);
					this.method3249(local21 + 1, 32768, local16 + 1);
				}
				if (arg3 == 2) {
					this.method3249(local21, 8192, local16);
					this.method3249(local21 + 1, 512, local16 - 1);
				}
				if (arg3 == 3) {
					this.method3249(local21, 32768, local16);
					this.method3249(local21 - 1, 2048, local16 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method3249(local21, 66560, local16);
					this.method3249(local21 - 1, 4096, local16);
					this.method3249(local21, 16384, local16 + 1);
				}
				if (arg3 == 1) {
					this.method3249(local21, 5120, local16);
					this.method3249(local21, 16384, local16 + 1);
					this.method3249(local21 + 1, 65536, local16);
				}
				if (arg3 == 2) {
					this.method3249(local21, 20480, local16);
					this.method3249(local21 + 1, 65536, local16);
					this.method3249(local21, 1024, local16 - 1);
				}
				if (arg3 == 3) {
					this.method3249(local21, 81920, local16);
					this.method3249(local21, 1024, local16 - 1);
					this.method3249(local21 - 1, 4096, local16);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method3249(local21, 536870912, local16);
				this.method3249(local21 - 1, 33554432, local16);
			}
			if (arg3 == 1) {
				this.method3249(local21, 8388608, local16);
				this.method3249(local21, 134217728, local16 + 1);
			}
			if (arg3 == 2) {
				this.method3249(local21, 33554432, local16);
				this.method3249(local21 + 1, 536870912, local16);
			}
			if (arg3 == 3) {
				this.method3249(local21, 134217728, local16);
				this.method3249(local21, 8388608, local16 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method3249(local21, 4194304, local16);
				this.method3249(local21 - 1, 67108864, local16 + 1);
			}
			if (arg3 == 1) {
				this.method3249(local21, 16777216, local16);
				this.method3249(local21 + 1, 268435456, local16 + 1);
			}
			if (arg3 == 2) {
				this.method3249(local21, 67108864, local16);
				this.method3249(local21 + 1, 4194304, local16 - 1);
			}
			if (arg3 == 3) {
				this.method3249(local21, 268435456, local16);
				this.method3249(local21 - 1, 16777216, local16 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method3249(local21, 545259520, local16);
			this.method3249(local21 - 1, 33554432, local16);
			this.method3249(local21, 134217728, local16 + 1);
		}
		if (arg3 == 1) {
			this.method3249(local21, 41943040, local16);
			this.method3249(local21, 134217728, local16 + 1);
			this.method3249(local21 + 1, 536870912, local16);
		}
		if (arg3 == 2) {
			this.method3249(local21, 167772160, local16);
			this.method3249(local21 + 1, 536870912, local16);
			this.method3249(local21, 8388608, local16 - 1);
		}
		if (arg3 == 3) {
			this.method3249(local21, 671088640, local16);
			this.method3249(local21, 8388608, local16 - 1);
			this.method3249(local21 - 1, 33554432, local16);
			return;
		}
	}
}

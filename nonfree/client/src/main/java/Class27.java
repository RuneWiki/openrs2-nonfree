import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class27 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	private void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray31[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIIII)Z")
	public boolean method511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static102.method4781(arg1, arg7, arg5, arg4, arg6, arg3, arg4, arg0) ? true : this.method517(arg0, arg3, arg6, arg4, arg5, arg2, arg4, arg7, arg1);
		}
		@Pc(46) int local46 = arg5 + arg1 - 1;
		@Pc(52) int local52 = arg3 + arg7 - 1;
		if (arg0 >= arg1 && local46 >= arg0 && arg6 >= arg7 && local52 >= arg6) {
			return true;
		} else if (arg0 == arg1 - 1 && arg6 >= arg7 && arg6 <= local52 && (this.anIntArrayArray31[arg0 - this.anInt632][arg6 - this.anInt621] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg0 && arg7 <= arg6 && local52 >= arg6 && (this.anIntArrayArray31[arg0 - this.anInt632][arg6 - this.anInt621] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg7 - 1 && arg0 >= arg1 && local46 >= arg0 && (this.anIntArrayArray31[arg0 - this.anInt632][arg6 - this.anInt621] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local52 + 1 && arg1 <= arg0 && arg0 <= local46 && (this.anIntArrayArray31[arg0 - this.anInt632][arg6 - this.anInt621] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZ)V")
	public void method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt621;
		@Pc(9) int local9 = arg0 - this.anInt632;
		this.anIntArrayArray31[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V")
	public void method514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt621;
		@Pc(9) int local9 = arg0 - this.anInt632;
		this.anIntArrayArray31[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg0 == arg5 && arg1 == arg2) {
				return true;
			}
		} else if (arg0 <= arg5 && arg0 + arg3 - 1 >= arg5 && arg1 <= arg1 && arg1 <= arg3 + arg1 - 1) {
			return true;
		}
		@Pc(72) int local72 = arg0 - this.anInt632;
		@Pc(77) int local77 = arg5 - this.anInt632;
		@Pc(82) int local82 = arg1 - this.anInt621;
		@Pc(87) int local87 = arg2 - this.anInt621;
		if (arg3 == 1) {
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local72 == local77 - 1 && local82 == local87) {
						return true;
					}
					if (local72 == local77 && local87 == local82 + 1 && (this.anIntArrayArray31[local72][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local77 && local82 - 1 == local87 && (this.anIntArrayArray31[local72][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local77 && local87 == local82 + 1) {
						return true;
					}
					if (local72 == local77 - 1 && local82 == local87 && (this.anIntArrayArray31[local72][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 + 1 == local72 && local82 == local87 && (this.anIntArrayArray31[local72][local87] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local77 + 1 == local72 && local82 == local87) {
						return true;
					}
					if (local72 == local77 && local87 == local82 + 1 && (this.anIntArrayArray31[local72][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local77 && local87 == local82 - 1 && (this.anIntArrayArray31[local72][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local77 == local72 && local82 - 1 == local87) {
						return true;
					}
					if (local72 == local77 - 1 && local87 == local82 && (this.anIntArrayArray31[local72][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local77 + 1 && local87 == local82 && (this.anIntArrayArray31[local72][local87] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local77 - 1 == local72 && local87 == local82) {
						return true;
					}
					if (local72 == local77 && local87 == local82 + 1) {
						return true;
					}
					if (local77 + 1 == local72 && local87 == local82 && (this.anIntArrayArray31[local72][local87] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 == local72 && local87 == local82 - 1 && (this.anIntArrayArray31[local72][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local77 - 1 && local87 == local82 && (this.anIntArrayArray31[local72][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local72 && local87 == local82 + 1) {
						return true;
					}
					if (local72 == local77 + 1 && local82 == local87) {
						return true;
					}
					if (local72 == local77 && local82 - 1 == local87 && (this.anIntArrayArray31[local72][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local77 - 1 && local82 == local87 && (this.anIntArrayArray31[local72][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local72 && local87 == local82 + 1 && (this.anIntArrayArray31[local72][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local77 + 1 && local87 == local82) {
						return true;
					}
					if (local72 == local77 && local82 - 1 == local87) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local77 - 1 && local82 == local87) {
						return true;
					}
					if (local77 == local72 && local87 == local82 + 1 && (this.anIntArrayArray31[local72][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local72 && local82 == local87 && (this.anIntArrayArray31[local72][local87] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 == local72 && local87 == local82 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local77 == local72 && local82 + 1 == local87 && (this.anIntArrayArray31[local72][local87] & 0x20) == 0) {
					return true;
				}
				if (local77 == local72 && local87 == local82 - 1 && (this.anIntArrayArray31[local72][local87] & 0x2) == 0) {
					return true;
				}
				if (local72 == local77 - 1 && local82 == local87 && (this.anIntArrayArray31[local72][local87] & 0x8) == 0) {
					return true;
				}
				if (local77 + 1 == local72 && local87 == local82 && (this.anIntArrayArray31[local72][local87] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(97) int local97 = local72 + arg3 - 1;
			@Pc(103) int local103 = arg3 + local87 - 1;
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local77 - arg3 == local72 && local87 <= local82 && local103 >= local82) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local82 + 1 == local87 && (this.anIntArrayArray31[local77][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local87 == local82 - arg3 && (this.anIntArrayArray31[local77][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 <= local77 && local97 >= local77 && local82 + 1 == local87) {
						return true;
					}
					if (local77 - arg3 == local72 && local87 <= local82 && local103 >= local82 && (this.anIntArrayArray31[local97][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 + 1 == local72 && local87 <= local82 && local103 >= local82 && (this.anIntArrayArray31[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local77 + 1 == local72 && local82 >= local87 && local103 >= local82) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local82 + 1 == local87 && (this.anIntArrayArray31[local77][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 >= local72 && local97 >= local77 && local87 == local82 - arg3 && (this.anIntArrayArray31[local77][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local77 >= local72 && local77 <= local97 && local82 - arg3 == local87) {
						return true;
					}
					if (local72 == local77 - arg3 && local82 >= local87 && local82 <= local103 && (this.anIntArrayArray31[local97][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 + 1 == local72 && local87 <= local82 && local103 >= local82 && (this.anIntArrayArray31[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local72 == local77 - arg3 && local87 <= local82 && local103 >= local82) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local87 == local82 + 1) {
						return true;
					}
					if (local77 + 1 == local72 && local82 >= local87 && local82 <= local103 && (this.anIntArrayArray31[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local77 && local97 >= local77 && local82 - arg3 == local87 && (this.anIntArrayArray31[local77][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local77 - arg3 && local87 <= local82 && local103 >= local82 && (this.anIntArrayArray31[local97][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local82 + 1 == local87) {
						return true;
					}
					if (local72 == local77 + 1 && local82 >= local87 && local82 <= local103) {
						return true;
					}
					if (local72 <= local77 && local77 <= local97 && local87 == local82 - arg3 && (this.anIntArrayArray31[local77][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local77 - arg3 && local82 >= local87 && local82 <= local103 && (this.anIntArrayArray31[local97][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local87 == local82 + 1 && (this.anIntArrayArray31[local77][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local72 && local82 >= local87 && local82 <= local103) {
						return true;
					}
					if (local77 >= local72 && local77 <= local97 && local87 == local82 - arg3) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local77 - arg3 == local72 && local87 <= local82 && local103 >= local82) {
						return true;
					}
					if (local72 <= local77 && local77 <= local97 && local82 + 1 == local87 && (this.anIntArrayArray31[local77][local87] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 + 1 == local72 && local82 >= local87 && local82 <= local103 && (this.anIntArrayArray31[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local77 && local97 >= local77 && local82 - arg3 == local87) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local77 >= local72 && local77 <= local97 && local87 == local82 + 1 && (this.anIntArrayArray31[local77][local87] & 0x2C0120) == 0) {
					return true;
				}
				if (local72 <= local77 && local77 <= local97 && local82 - arg3 == local87 && (this.anIntArrayArray31[local77][local103] & 0x2C0102) == 0) {
					return true;
				}
				if (local77 - arg3 == local72 && local82 >= local87 && local103 >= local82 && (this.anIntArrayArray31[local97][local82] & 0x2C0108) == 0) {
					return true;
				}
				if (local77 + 1 == local72 && local87 <= local82 && local103 >= local82 && (this.anIntArrayArray31[local72][local82] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public void method516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt632;
		@Pc(9) int local9 = arg1 - this.anInt621;
		this.anIntArrayArray31[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(19) int local19 = arg0 + arg6;
		@Pc(24) int local24 = arg2 + arg3;
		@Pc(29) int local29 = arg8 + arg4;
		@Pc(33) int local33 = arg7 + arg1;
		@Pc(61) int local61;
		@Pc(72) int local72;
		if (local29 == arg0 && (arg5 & 0x2) == 0) {
			local61 = arg7 < arg2 ? arg2 : arg7;
			local72 = local33 > local24 ? local24 : local33;
			while (local61 < local72) {
				if ((this.anIntArrayArray31[local29 - this.anInt632 - 1][local61 - this.anInt621] & 0x8) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local19 == arg8 && (arg5 & 0x8) == 0) {
			local61 = arg2 <= arg7 ? arg7 : arg2;
			local72 = local24 < local33 ? local24 : local33;
			while (local72 > local61) {
				if ((this.anIntArrayArray31[arg8 - this.anInt632][local61 - this.anInt621] & 0x80) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local33 == arg2 && (arg5 & 0x1) == 0) {
			local61 = arg0 <= arg8 ? arg8 : arg0;
			local72 = local29 <= local19 ? local29 : local19;
			while (local61 < local72) {
				if ((this.anIntArrayArray31[local61 - this.anInt632][local33 - this.anInt621 - 1] & 0x2) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local24 == arg7 && (arg5 & 0x4) == 0) {
			local61 = arg8 < arg0 ? arg0 : arg8;
			local72 = local29 > local19 ? local19 : local29;
			while (local72 > local61) {
				if ((this.anIntArrayArray31[local61 - this.anInt632][arg7 - this.anInt621] & 0x20) == 0) {
					return true;
				}
				local61++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBI)V")
	private void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray31[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZIIZI)V")
	public void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt621;
		@Pc(30) int local30;
		if (arg2 == 1 || arg2 == 3) {
			local30 = arg5;
			arg5 = arg4;
			arg4 = local30;
		}
		@Pc(39) int local39 = arg1 - this.anInt632;
		if (arg6) {
			local7 |= 0x40000000;
		}
		for (local30 = local39; local30 < arg5 + local39; local30++) {
			if (local30 >= 0 && local30 < this.anInt618) {
				for (@Pc(64) int local64 = local18; local64 < arg4 + local18; local64++) {
					if (local64 >= 0 && this.anInt631 > local64) {
						this.method518(local7, local64, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt632;
		@Pc(17) int local17 = arg0 - this.anInt621;
		this.anIntArrayArray31[local4][local17] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public void method522() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt618; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt631; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt618 - 5 <= local7 || this.anInt631 - 5 <= local11) {
					this.anIntArrayArray31[local7][local11] = -1;
				} else {
					this.anIntArrayArray31[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIZIIIZ)V")
	public void method523(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt621;
		@Pc(13) int local13 = arg0 - this.anInt632;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method510(128, local4, local13);
				this.method510(8, local4, local13 - 1);
			}
			if (arg2 == 1) {
				this.method510(2, local4, local13);
				this.method510(32, local4 + 1, local13);
			}
			if (arg2 == 2) {
				this.method510(8, local4, local13);
				this.method510(128, local4, local13 + 1);
			}
			if (arg2 == 3) {
				this.method510(32, local4, local13);
				this.method510(2, local4 - 1, local13);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method510(1, local4, local13);
				this.method510(16, local4 + 1, local13 + -1);
			}
			if (arg2 == 1) {
				this.method510(4, local4, local13);
				this.method510(64, local4 + 1, local13 + 1);
			}
			if (arg2 == 2) {
				this.method510(16, local4, local13);
				this.method510(1, local4 - 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method510(64, local4, local13);
				this.method510(4, local4 - 1, local13 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method510(130, local4, local13);
				this.method510(8, local4, local13 - 1);
				this.method510(32, local4 + 1, local13);
			}
			if (arg2 == 1) {
				this.method510(10, local4, local13);
				this.method510(32, local4 + 1, local13);
				this.method510(128, local4, local13 + 1);
			}
			if (arg2 == 2) {
				this.method510(40, local4, local13);
				this.method510(128, local4, local13 + 1);
				this.method510(2, local4 - 1, local13);
			}
			if (arg2 == 3) {
				this.method510(160, local4, local13);
				this.method510(2, local4 - 1, local13);
				this.method510(8, local4, local13 - 1);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method510(65536, local4, local13);
					this.method510(4096, local4, local13 - 1);
				}
				if (arg2 == 1) {
					this.method510(1024, local4, local13);
					this.method510(16384, local4 + 1, local13);
				}
				if (arg2 == 2) {
					this.method510(4096, local4, local13);
					this.method510(65536, local4, local13 + 1);
				}
				if (arg2 == 3) {
					this.method510(16384, local4, local13);
					this.method510(1024, local4 - 1, local13);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method510(512, local4, local13);
					this.method510(8192, local4 + 1, local13 + -1);
				}
				if (arg2 == 1) {
					this.method510(2048, local4, local13);
					this.method510(32768, local4 + 1, local13 + 1);
				}
				if (arg2 == 2) {
					this.method510(8192, local4, local13);
					this.method510(512, local4 - 1, local13 + 1);
				}
				if (arg2 == 3) {
					this.method510(32768, local4, local13);
					this.method510(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method510(66560, local4, local13);
					this.method510(4096, local4, local13 - 1);
					this.method510(16384, local4 + 1, local13);
				}
				if (arg2 == 1) {
					this.method510(5120, local4, local13);
					this.method510(16384, local4 + 1, local13);
					this.method510(65536, local4, local13 + 1);
				}
				if (arg2 == 2) {
					this.method510(20480, local4, local13);
					this.method510(65536, local4, local13 + 1);
					this.method510(1024, local4 - 1, local13);
				}
				if (arg2 == 3) {
					this.method510(81920, local4, local13);
					this.method510(1024, local4 - 1, local13);
					this.method510(4096, local4, local13 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method510(536870912, local4, local13);
				this.method510(33554432, local4, local13 - 1);
			}
			if (arg2 == 1) {
				this.method510(8388608, local4, local13);
				this.method510(134217728, local4 + 1, local13);
			}
			if (arg2 == 2) {
				this.method510(33554432, local4, local13);
				this.method510(536870912, local4, local13 + 1);
			}
			if (arg2 == 3) {
				this.method510(134217728, local4, local13);
				this.method510(8388608, local4 - 1, local13);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method510(4194304, local4, local13);
				this.method510(67108864, local4 + 1, local13 - 1);
			}
			if (arg2 == 1) {
				this.method510(16777216, local4, local13);
				this.method510(268435456, local4 + 1, local13 + 1);
			}
			if (arg2 == 2) {
				this.method510(67108864, local4, local13);
				this.method510(4194304, local4 - 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method510(268435456, local4, local13);
				this.method510(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method510(545259520, local4, local13);
			this.method510(33554432, local4, local13 - 1);
			this.method510(134217728, local4 + 1, local13);
		}
		if (arg2 == 1) {
			this.method510(41943040, local4, local13);
			this.method510(134217728, local4 + 1, local13);
			this.method510(536870912, local4, local13 + 1);
		}
		if (arg2 == 2) {
			this.method510(167772160, local4, local13);
			this.method510(536870912, local4, local13 + 1);
			this.method510(8388608, local4 - 1, local13);
		}
		if (arg2 == 3) {
			this.method510(671088640, local4, local13);
			this.method510(8388608, local4 - 1, local13);
			this.method510(33554432, local4, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg5 == arg2 && arg0 == arg1) {
				return true;
			}
		} else if (arg2 >= arg5 && arg3 + arg5 - 1 >= arg2 && arg0 >= arg0 && arg0 <= arg3 + arg0 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg1 - this.anInt621;
		@Pc(65) int local65 = arg0 - this.anInt621;
		@Pc(70) int local70 = arg5 - this.anInt632;
		@Pc(75) int local75 = arg2 - this.anInt632;
		if (arg3 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local70 == local75 + 1 && local65 == local55 && (this.anIntArrayArray31[local70][local55] & 0x80) == 0) {
						return true;
					}
					if (local75 == local70 && local55 == local65 - 1 && (this.anIntArrayArray31[local70][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local75 - 1 == local70 && local55 == local65 && (this.anIntArrayArray31[local70][local55] & 0x8) == 0) {
						return true;
					}
					if (local70 == local75 && local65 - 1 == local55 && (this.anIntArrayArray31[local70][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local70 == local75 - 1 && local55 == local65 && (this.anIntArrayArray31[local70][local55] & 0x8) == 0) {
						return true;
					}
					if (local75 == local70 && local65 + 1 == local55 && (this.anIntArrayArray31[local70][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local70 == local75 + 1 && local55 == local65 && (this.anIntArrayArray31[local70][local55] & 0x80) == 0) {
						return true;
					}
					if (local75 == local70 && local65 + 1 == local55 && (this.anIntArrayArray31[local70][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local70 == local75 && local55 == local65 + 1 && (this.anIntArrayArray31[local70][local55] & 0x20) == 0) {
					return true;
				}
				if (local70 == local75 && local55 == local65 - 1 && (this.anIntArrayArray31[local70][local55] & 0x2) == 0) {
					return true;
				}
				if (local70 == local75 - 1 && local65 == local55 && (this.anIntArrayArray31[local70][local55] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local70 && local55 == local65 && (this.anIntArrayArray31[local70][local55] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = local70 + arg3 - 1;
			@Pc(92) int local92 = arg3 + local55 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local75 + 1 == local70 && local55 <= local65 && local92 >= local65 && (this.anIntArrayArray31[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local75 >= local70 && local86 >= local75 && local55 == local65 - arg3 && (this.anIntArrayArray31[local75][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local70 == local75 - arg3 && local55 <= local65 && local65 <= local92 && (this.anIntArrayArray31[local86][local65] & 0x8) == 0) {
						return true;
					}
					if (local75 >= local70 && local86 >= local75 && local65 - arg3 == local55 && (this.anIntArrayArray31[local75][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local70 == local75 - arg3 && local55 <= local65 && local92 >= local65 && (this.anIntArrayArray31[local86][local65] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local75 && local86 >= local75 && local65 + 1 == local55 && (this.anIntArrayArray31[local75][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local75 + 1 == local70 && local65 >= local55 && local65 <= local92 && (this.anIntArrayArray31[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local75 && local86 >= local75 && local65 + 1 == local55 && (this.anIntArrayArray31[local75][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local75 >= local70 && local75 <= local86 && local55 == local65 + 1 && (this.anIntArrayArray31[local75][local55] & 0x20) == 0) {
					return true;
				}
				if (local70 <= local75 && local86 >= local75 && local55 == local65 - arg3 && (this.anIntArrayArray31[local75][local92] & 0x2) == 0) {
					return true;
				}
				if (local70 == local75 - arg3 && local65 >= local55 && local65 <= local92 && (this.anIntArrayArray31[local86][local65] & 0x8) == 0) {
					return true;
				}
				if (local70 == local75 + 1 && local55 <= local65 && local65 <= local92 && (this.anIntArrayArray31[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIIIIZ)V")
	public void method525(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt632;
		@Pc(9) int local9 = arg3 - this.anInt621;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method518(128, local9, local4);
				this.method518(8, local9, local4 - 1);
			}
			if (arg0 == 1) {
				this.method518(2, local9, local4);
				this.method518(32, local9 + 1, local4);
			}
			if (arg0 == 2) {
				this.method518(8, local9, local4);
				this.method518(128, local9, local4 + 1);
			}
			if (arg0 == 3) {
				this.method518(32, local9, local4);
				this.method518(2, local9 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method518(1, local9, local4);
				this.method518(16, local9 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method518(4, local9, local4);
				this.method518(64, local9 + 1, local4 - -1);
			}
			if (arg0 == 2) {
				this.method518(16, local9, local4);
				this.method518(1, local9 - 1, local4 - -1);
			}
			if (arg0 == 3) {
				this.method518(64, local9, local4);
				this.method518(4, local9 - 1, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method518(130, local9, local4);
				this.method518(8, local9, local4 - 1);
				this.method518(32, local9 + 1, local4);
			}
			if (arg0 == 1) {
				this.method518(10, local9, local4);
				this.method518(32, local9 + 1, local4);
				this.method518(128, local9, local4 + 1);
			}
			if (arg0 == 2) {
				this.method518(40, local9, local4);
				this.method518(128, local9, local4 + 1);
				this.method518(2, local9 - 1, local4);
			}
			if (arg0 == 3) {
				this.method518(160, local9, local4);
				this.method518(2, local9 - 1, local4);
				this.method518(8, local9, local4 - 1);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method518(65536, local9, local4);
					this.method518(4096, local9, local4 - 1);
				}
				if (arg0 == 1) {
					this.method518(1024, local9, local4);
					this.method518(16384, local9 + 1, local4);
				}
				if (arg0 == 2) {
					this.method518(4096, local9, local4);
					this.method518(65536, local9, local4 + 1);
				}
				if (arg0 == 3) {
					this.method518(16384, local9, local4);
					this.method518(1024, local9 - 1, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method518(512, local9, local4);
					this.method518(8192, local9 + 1, local4 - 1);
				}
				if (arg0 == 1) {
					this.method518(2048, local9, local4);
					this.method518(32768, local9 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method518(8192, local9, local4);
					this.method518(512, local9 - 1, local4 - -1);
				}
				if (arg0 == 3) {
					this.method518(32768, local9, local4);
					this.method518(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method518(66560, local9, local4);
					this.method518(4096, local9, local4 - 1);
					this.method518(16384, local9 + 1, local4);
				}
				if (arg0 == 1) {
					this.method518(5120, local9, local4);
					this.method518(16384, local9 + 1, local4);
					this.method518(65536, local9, local4 + 1);
				}
				if (arg0 == 2) {
					this.method518(20480, local9, local4);
					this.method518(65536, local9, local4 + 1);
					this.method518(1024, local9 - 1, local4);
				}
				if (arg0 == 3) {
					this.method518(81920, local9, local4);
					this.method518(1024, local9 - 1, local4);
					this.method518(4096, local9, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method518(536870912, local9, local4);
				this.method518(33554432, local9, local4 - 1);
			}
			if (arg0 == 1) {
				this.method518(8388608, local9, local4);
				this.method518(134217728, local9 + 1, local4);
			}
			if (arg0 == 2) {
				this.method518(33554432, local9, local4);
				this.method518(536870912, local9, local4 + 1);
			}
			if (arg0 == 3) {
				this.method518(134217728, local9, local4);
				this.method518(8388608, local9 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method518(4194304, local9, local4);
				this.method518(67108864, local9 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method518(16777216, local9, local4);
				this.method518(268435456, local9 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method518(67108864, local9, local4);
				this.method518(4194304, local9 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method518(268435456, local9, local4);
				this.method518(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method518(545259520, local9, local4);
			this.method518(33554432, local9, local4 - 1);
			this.method518(134217728, local9 + 1, local4);
		}
		if (arg0 == 1) {
			this.method518(41943040, local9, local4);
			this.method518(134217728, local9 + 1, local4);
			this.method518(536870912, local9, local4 + 1);
		}
		if (arg0 == 2) {
			this.method518(167772160, local9, local4);
			this.method518(536870912, local9, local4 + 1);
			this.method518(8388608, local9 - 1, local4);
		}
		if (arg0 == 3) {
			this.method518(671088640, local9, local4);
			this.method518(8388608, local9 - 1, local4);
			this.method518(33554432, local9, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZBIZIII)V")
	public void method526(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(41) int local41 = arg3 - this.anInt632;
		@Pc(46) int local46 = arg1 - this.anInt621;
		for (@Pc(48) int local48 = local41; local48 < arg5 + local41; local48++) {
			if (local48 >= 0 && local48 < this.anInt618) {
				for (@Pc(58) int local58 = local46; local58 < local46 + arg4; local58++) {
					if (local58 >= 0 && this.anInt631 > local58) {
						this.method510(local7, local58, local48);
					}
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class94 {

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
	public int anInt2613;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
	public int anInt2626;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
	public int anInt2627;

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public void method2209() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2613; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2627; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt2613 - 5 <= local3 || this.anInt2627 - 5 <= local7) {
					this.anIntArrayArray20[local3][local7] = -1;
				} else {
					this.anIntArrayArray20[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBII)V")
	private void method2212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZIIIIZI)V")
	public void method2213(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(23) int local23;
		if (arg6 == 1 || arg6 == 3) {
			local23 = arg2;
			arg2 = arg0;
			arg0 = local23;
		}
		@Pc(32) int local32 = arg4 - this.anInt2619;
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(43) int local43 = arg3 - this.anInt2626;
		for (local23 = local32; local23 < local32 + arg2; local23++) {
			if (local23 >= 0 && this.anInt2613 > local23) {
				for (@Pc(62) int local62 = local43; local62 < arg0 + local43; local62++) {
					if (local62 >= 0 && this.anInt2627 > local62) {
						this.method2225(local7, local62, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static239.method3923(arg6, arg1, arg4, arg5, arg2, arg7, arg5, arg0) ? true : this.method2223(arg6, arg5, arg2, arg5, arg0, arg3, arg7, arg1, arg4);
		}
		@Pc(46) int local46 = arg6 + arg7 - 1;
		@Pc(52) int local52 = arg4 + arg0 - 1;
		if (arg2 >= arg6 && arg2 <= local46 && arg1 >= arg4 && arg1 <= local52) {
			return true;
		} else if (arg6 - 1 == arg2 && arg1 >= arg4 && local52 >= arg1 && (this.anIntArrayArray20[arg2 - this.anInt2619][arg1 - this.anInt2626] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg2 == local46 + 1 && arg4 <= arg1 && arg1 <= local52 && (this.anIntArrayArray20[arg2 - this.anInt2619][arg1 - this.anInt2626] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg1 && arg6 <= arg2 && local46 >= arg2 && (this.anIntArrayArray20[arg2 - this.anInt2619][arg1 - this.anInt2626] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local52 + 1 == arg1 && arg2 >= arg6 && local46 >= arg2 && (this.anIntArrayArray20[arg2 - this.anInt2619][arg1 - this.anInt2626] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg6 && arg3 == arg2) {
				return true;
			}
		} else if (arg6 <= arg0 && arg0 <= arg6 + arg1 - 1 && arg2 >= arg2 && arg2 + arg1 - 1 >= arg2) {
			return true;
		}
		@Pc(44) int local44 = arg0 - this.anInt2619;
		@Pc(49) int local49 = arg3 - this.anInt2626;
		@Pc(54) int local54 = arg6 - this.anInt2619;
		@Pc(59) int local59 = arg2 - this.anInt2626;
		if (arg1 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local44 + 1 == local54 && local49 == local59 && (this.anIntArrayArray20[local54][local49] & 0x80) == 0) {
						return true;
					}
					if (local54 == local44 && local59 - 1 == local49 && (this.anIntArrayArray20[local54][local49] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local54 == local44 - 1 && local59 == local49 && (this.anIntArrayArray20[local54][local49] & 0x8) == 0) {
						return true;
					}
					if (local54 == local44 && local49 == local59 - 1 && (this.anIntArrayArray20[local54][local49] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local54 == local44 - 1 && local49 == local59 && (this.anIntArrayArray20[local54][local49] & 0x8) == 0) {
						return true;
					}
					if (local44 == local54 && local59 + 1 == local49 && (this.anIntArrayArray20[local54][local49] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local44 + 1 == local54 && local59 == local49 && (this.anIntArrayArray20[local54][local49] & 0x80) == 0) {
						return true;
					}
					if (local44 == local54 && local59 + 1 == local49 && (this.anIntArrayArray20[local54][local49] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local54 == local44 && local59 + 1 == local49 && (this.anIntArrayArray20[local54][local49] & 0x20) == 0) {
					return true;
				}
				if (local44 == local54 && local59 - 1 == local49 && (this.anIntArrayArray20[local54][local49] & 0x2) == 0) {
					return true;
				}
				if (local44 - 1 == local54 && local49 == local59 && (this.anIntArrayArray20[local54][local49] & 0x8) == 0) {
					return true;
				}
				if (local44 + 1 == local54 && local59 == local49 && (this.anIntArrayArray20[local54][local49] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(70) int local70 = local54 + arg1 - 1;
			@Pc(76) int local76 = arg1 + local49 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local44 + 1 == local54 && local49 <= local59 && local76 >= local59 && (this.anIntArrayArray20[local54][local59] & 0x80) == 0) {
						return true;
					}
					if (local44 >= local54 && local70 >= local44 && local49 == local59 - arg1 && (this.anIntArrayArray20[local44][local76] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local44 - arg1 == local54 && local59 >= local49 && local76 >= local59 && (this.anIntArrayArray20[local70][local59] & 0x8) == 0) {
						return true;
					}
					if (local44 >= local54 && local44 <= local70 && local59 - arg1 == local49 && (this.anIntArrayArray20[local44][local76] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local54 == local44 - arg1 && local59 >= local49 && local76 >= local59 && (this.anIntArrayArray20[local70][local59] & 0x8) == 0) {
						return true;
					}
					if (local44 >= local54 && local44 <= local70 && local59 + 1 == local49 && (this.anIntArrayArray20[local44][local49] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local54 == local44 + 1 && local49 <= local59 && local59 <= local76 && (this.anIntArrayArray20[local54][local59] & 0x80) == 0) {
						return true;
					}
					if (local44 >= local54 && local44 <= local70 && local49 == local59 + 1 && (this.anIntArrayArray20[local44][local49] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local44 >= local54 && local44 <= local70 && local49 == local59 + 1 && (this.anIntArrayArray20[local44][local49] & 0x20) == 0) {
					return true;
				}
				if (local44 >= local54 && local44 <= local70 && local59 - arg1 == local49 && (this.anIntArrayArray20[local44][local76] & 0x2) == 0) {
					return true;
				}
				if (local44 - arg1 == local54 && local49 <= local59 && local59 <= local76 && (this.anIntArrayArray20[local70][local59] & 0x8) == 0) {
					return true;
				}
				if (local44 + 1 == local54 && local49 <= local59 && local59 <= local76 && (this.anIntArrayArray20[local54][local59] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
	public void method2216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2619;
		@Pc(21) int local21 = arg0 - this.anInt2626;
		this.anIntArrayArray20[local4][local21] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)V")
	public void method2217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2619;
		@Pc(13) int local13 = arg1 - this.anInt2626;
		this.anIntArrayArray20[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIBIIZ)V")
	public void method2219(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(15) int local15 = 256;
		if (arg5) {
			local15 = 131328;
		}
		if (arg0) {
			local15 |= 0x40000000;
		}
		@Pc(32) int local32 = arg2 - this.anInt2626;
		@Pc(37) int local37 = arg1 - this.anInt2619;
		for (@Pc(39) int local39 = local37; local39 < arg4 + local37; local39++) {
			if (local39 >= 0 && this.anInt2613 > local39) {
				for (@Pc(53) int local53 = local32; local53 < local32 + arg3; local53++) {
					if (local53 >= 0 && this.anInt2627 > local53) {
						this.method2212(local15, local39, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(III)V")
	public void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt2619;
		@Pc(19) int local19 = arg0 - this.anInt2626;
		this.anIntArrayArray20[local14][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(III)V")
	public void method2221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2619;
		@Pc(13) int local13 = arg0 - this.anInt2626;
		this.anIntArrayArray20[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg5 == arg4 && arg6 == arg1) {
				return true;
			}
		} else if (arg4 >= arg5 && arg4 <= arg5 + arg2 - 1 && arg1 >= arg1 && arg1 + arg2 - 1 >= arg1) {
			return true;
		}
		@Pc(61) int local61 = arg4 - this.anInt2619;
		@Pc(66) int local66 = arg1 - this.anInt2626;
		@Pc(71) int local71 = arg6 - this.anInt2626;
		@Pc(76) int local76 = arg5 - this.anInt2619;
		if (arg2 == 1) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					if (local61 - 1 == local76 && local66 == local71) {
						return true;
					}
					if (local61 == local76 && local66 + 1 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local61 && local71 == local66 - 1 && (this.anIntArrayArray20[local76][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local61 == local76 && local71 == local66 + 1) {
						return true;
					}
					if (local61 - 1 == local76 && local71 == local66 && (this.anIntArrayArray20[local76][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 == local61 + 1 && local66 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local76 == local61 + 1 && local66 == local71) {
						return true;
					}
					if (local76 == local61 && local71 == local66 + 1 && (this.anIntArrayArray20[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local76 && local71 == local66 - 1 && (this.anIntArrayArray20[local76][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local76 == local61 && local66 - 1 == local71) {
						return true;
					}
					if (local76 == local61 - 1 && local66 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 == local61 + 1 && local66 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					if (local61 - 1 == local76 && local66 == local71) {
						return true;
					}
					if (local61 == local76 && local71 == local66 + 1) {
						return true;
					}
					if (local61 + 1 == local76 && local66 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 == local61 && local66 - 1 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local76 == local61 - 1 && local66 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local76 && local66 + 1 == local71) {
						return true;
					}
					if (local61 + 1 == local76 && local71 == local66) {
						return true;
					}
					if (local61 == local76 && local66 - 1 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 - 1 == local76 && local71 == local66 && (this.anIntArrayArray20[local76][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 == local61 && local66 + 1 == local71 && (this.anIntArrayArray20[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local76 && local66 == local71) {
						return true;
					}
					if (local76 == local61 && local71 == local66 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local61 - 1 == local76 && local66 == local71) {
						return true;
					}
					if (local61 == local76 && local71 == local66 + 1 && (this.anIntArrayArray20[local76][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local61 + 1 && local71 == local66 && (this.anIntArrayArray20[local76][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 == local61 && local66 - 1 == local71) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local76 == local61 && local66 + 1 == local71 && (this.anIntArrayArray20[local76][local71] & 0x20) == 0) {
					return true;
				}
				if (local61 == local76 && local71 == local66 - 1 && (this.anIntArrayArray20[local76][local71] & 0x2) == 0) {
					return true;
				}
				if (local76 == local61 - 1 && local71 == local66 && (this.anIntArrayArray20[local76][local71] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local76 && local71 == local66 && (this.anIntArrayArray20[local76][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(795) int local795 = arg2 + local76 - 1;
			@Pc(801) int local801 = arg2 + local71 - 1;
			if (arg3 == 0) {
				if (arg0 == 0) {
					if (local61 - arg2 == local76 && local71 <= local66 && local801 >= local66) {
						return true;
					}
					if (local61 >= local76 && local61 <= local795 && local66 + 1 == local71 && (this.anIntArrayArray20[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local76 && local61 <= local795 && local66 - arg2 == local71 && (this.anIntArrayArray20[local61][local801] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local76 <= local61 && local795 >= local61 && local66 + 1 == local71) {
						return true;
					}
					if (local61 - arg2 == local76 && local71 <= local66 && local66 <= local801 && (this.anIntArrayArray20[local795][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local76 && local66 >= local71 && local66 <= local801 && (this.anIntArrayArray20[local76][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 + 1 == local76 && local71 <= local66 && local66 <= local801) {
						return true;
					}
					if (local76 <= local61 && local61 <= local795 && local71 == local66 + 1 && (this.anIntArrayArray20[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 <= local61 && local61 <= local795 && local71 == local66 - arg2 && (this.anIntArrayArray20[local61][local801] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local61 >= local76 && local795 >= local61 && local66 - arg2 == local71) {
						return true;
					}
					if (local76 == local61 - arg2 && local66 >= local71 && local66 <= local801 && (this.anIntArrayArray20[local795][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local76 && local71 <= local66 && local66 <= local801 && (this.anIntArrayArray20[local76][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					if (local76 == local61 - arg2 && local71 <= local66 && local66 <= local801) {
						return true;
					}
					if (local76 <= local61 && local795 >= local61 && local66 + 1 == local71) {
						return true;
					}
					if (local76 == local61 + 1 && local66 >= local71 && local66 <= local801 && (this.anIntArrayArray20[local76][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 >= local76 && local795 >= local61 && local66 - arg2 == local71 && (this.anIntArrayArray20[local61][local801] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local61 - arg2 == local76 && local66 >= local71 && local801 >= local66 && (this.anIntArrayArray20[local795][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local76 && local61 <= local795 && local66 + 1 == local71) {
						return true;
					}
					if (local76 == local61 + 1 && local66 >= local71 && local66 <= local801) {
						return true;
					}
					if (local61 >= local76 && local795 >= local61 && local71 == local66 - arg2 && (this.anIntArrayArray20[local61][local801] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local76 == local61 - arg2 && local71 <= local66 && local801 >= local66 && (this.anIntArrayArray20[local795][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local76 && local795 >= local61 && local71 == local66 + 1 && (this.anIntArrayArray20[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local61 + 1 && local71 <= local66 && local801 >= local66) {
						return true;
					}
					if (local76 <= local61 && local795 >= local61 && local71 == local66 - arg2) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local76 == local61 - arg2 && local71 <= local66 && local66 <= local801) {
						return true;
					}
					if (local61 >= local76 && local795 >= local61 && local71 == local66 + 1 && (this.anIntArrayArray20[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local61 + 1 && local71 <= local66 && local66 <= local801 && (this.anIntArrayArray20[local76][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 >= local76 && local795 >= local61 && local71 == local66 - arg2) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local76 <= local61 && local61 <= local795 && local66 + 1 == local71 && (this.anIntArrayArray20[local61][local71] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 >= local76 && local61 <= local795 && local66 - arg2 == local71 && (this.anIntArrayArray20[local61][local801] & 0x2C0102) == 0) {
					return true;
				}
				if (local76 == local61 - arg2 && local66 >= local71 && local801 >= local66 && (this.anIntArrayArray20[local795][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local76 == local61 + 1 && local66 >= local71 && local66 <= local801 && (this.anIntArrayArray20[local76][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIBII)Z")
	public boolean method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg2 + arg3;
		@Pc(14) int local14 = arg7 + arg1;
		@Pc(24) int local24 = arg0 + arg6;
		@Pc(28) int local28 = arg8 + arg4;
		@Pc(59) int local59;
		@Pc(66) int local66;
		if (arg2 == local24 && (arg5 & 0x2) == 0) {
			local59 = arg7 > arg8 ? arg7 : arg8;
			local66 = local14 >= local28 ? local28 : local14;
			while (local66 > local59) {
				if ((this.anIntArrayArray20[local24 - this.anInt2619 - 1][local59 - this.anInt2626] & 0x8) == 0) {
					return true;
				}
				local59++;
			}
		} else if (arg0 == local9 && (arg5 & 0x8) == 0) {
			local59 = arg8 >= arg7 ? arg8 : arg7;
			local66 = local14 >= local28 ? local28 : local14;
			while (local66 > local59) {
				if ((this.anIntArrayArray20[arg0 - this.anInt2619][local59 - this.anInt2626] & 0x80) == 0) {
					return true;
				}
				local59++;
			}
		} else if (local28 == arg7 && (arg5 & 0x1) == 0) {
			local59 = arg0 >= arg2 ? arg0 : arg2;
			local66 = local24 <= local9 ? local24 : local9;
			while (local59 < local66) {
				if ((this.anIntArrayArray20[local59 - this.anInt2619][local28 - this.anInt2626 - 1] & 0x2) == 0) {
					return true;
				}
				local59++;
			}
		} else if (arg8 == local14 && (arg5 & 0x4) == 0) {
			local59 = arg2 <= arg0 ? arg0 : arg2;
			local66 = local9 >= local24 ? local24 : local9;
			while (local59 < local66) {
				if ((this.anIntArrayArray20[local59 - this.anInt2619][arg8 - this.anInt2626] & 0x20) == 0) {
					return true;
				}
				local59++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIZIII)V")
	public void method2224(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt2619;
		@Pc(13) int local13 = arg1 - this.anInt2626;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2212(128, local4, local13);
				this.method2212(8, local4 - 1, local13);
			}
			if (arg5 == 1) {
				this.method2212(2, local4, local13);
				this.method2212(32, local4, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2212(8, local4, local13);
				this.method2212(128, local4 + 1, local13);
			}
			if (arg5 == 3) {
				this.method2212(32, local4, local13);
				this.method2212(2, local4, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2212(1, local4, local13);
				this.method2212(16, local4 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method2212(4, local4, local13);
				this.method2212(64, local4 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2212(16, local4, local13);
				this.method2212(1, local4 + 1, local13 + -1);
			}
			if (arg5 == 3) {
				this.method2212(64, local4, local13);
				this.method2212(4, local4 - 1, local13 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method2212(130, local4, local13);
				this.method2212(8, local4 - 1, local13);
				this.method2212(32, local4, local13 + 1);
			}
			if (arg5 == 1) {
				this.method2212(10, local4, local13);
				this.method2212(32, local4, local13 + 1);
				this.method2212(128, local4 + 1, local13);
			}
			if (arg5 == 2) {
				this.method2212(40, local4, local13);
				this.method2212(128, local4 + 1, local13);
				this.method2212(2, local4, local13 - 1);
			}
			if (arg5 == 3) {
				this.method2212(160, local4, local13);
				this.method2212(2, local4, local13 - 1);
				this.method2212(8, local4 - 1, local13);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method2212(65536, local4, local13);
					this.method2212(4096, local4 - 1, local13);
				}
				if (arg5 == 1) {
					this.method2212(1024, local4, local13);
					this.method2212(16384, local4, local13 + 1);
				}
				if (arg5 == 2) {
					this.method2212(4096, local4, local13);
					this.method2212(65536, local4 + 1, local13);
				}
				if (arg5 == 3) {
					this.method2212(16384, local4, local13);
					this.method2212(1024, local4, local13 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method2212(512, local4, local13);
					this.method2212(8192, local4 - 1, local13 + 1);
				}
				if (arg5 == 1) {
					this.method2212(2048, local4, local13);
					this.method2212(32768, local4 + 1, local13 + 1);
				}
				if (arg5 == 2) {
					this.method2212(8192, local4, local13);
					this.method2212(512, local4 + 1, local13 + -1);
				}
				if (arg5 == 3) {
					this.method2212(32768, local4, local13);
					this.method2212(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method2212(66560, local4, local13);
					this.method2212(4096, local4 - 1, local13);
					this.method2212(16384, local4, local13 + 1);
				}
				if (arg5 == 1) {
					this.method2212(5120, local4, local13);
					this.method2212(16384, local4, local13 + 1);
					this.method2212(65536, local4 + 1, local13);
				}
				if (arg5 == 2) {
					this.method2212(20480, local4, local13);
					this.method2212(65536, local4 + 1, local13);
					this.method2212(1024, local4, local13 - 1);
				}
				if (arg5 == 3) {
					this.method2212(81920, local4, local13);
					this.method2212(1024, local4, local13 - 1);
					this.method2212(4096, local4 - 1, local13);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2212(536870912, local4, local13);
				this.method2212(33554432, local4 - 1, local13);
			}
			if (arg5 == 1) {
				this.method2212(8388608, local4, local13);
				this.method2212(134217728, local4, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2212(33554432, local4, local13);
				this.method2212(536870912, local4 + 1, local13);
			}
			if (arg5 == 3) {
				this.method2212(134217728, local4, local13);
				this.method2212(8388608, local4, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2212(4194304, local4, local13);
				this.method2212(67108864, local4 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method2212(16777216, local4, local13);
				this.method2212(268435456, local4 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2212(67108864, local4, local13);
				this.method2212(4194304, local4 + 1, local13 - 1);
			}
			if (arg5 == 3) {
				this.method2212(268435456, local4, local13);
				this.method2212(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2212(545259520, local4, local13);
			this.method2212(33554432, local4 - 1, local13);
			this.method2212(134217728, local4, local13 + 1);
		}
		if (arg5 == 1) {
			this.method2212(41943040, local4, local13);
			this.method2212(134217728, local4, local13 + 1);
			this.method2212(536870912, local4 + 1, local13);
		}
		if (arg5 == 2) {
			this.method2212(167772160, local4, local13);
			this.method2212(536870912, local4 + 1, local13);
			this.method2212(8388608, local4, local13 - 1);
		}
		if (arg5 == 3) {
			this.method2212(671088640, local4, local13);
			this.method2212(8388608, local4, local13 - 1);
			this.method2212(33554432, local4 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(IIII)V")
	private void method2225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIIIZI)V")
	public void method2226(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(4) int local4 = arg3 - this.anInt2619;
		@Pc(9) int local9 = arg4 - this.anInt2626;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method2225(128, local9, local4);
				this.method2225(8, local9, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2225(2, local9, local4);
				this.method2225(32, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method2225(8, local9, local4);
				this.method2225(128, local9, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2225(32, local9, local4);
				this.method2225(2, local9 - 1, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method2225(1, local9, local4);
				this.method2225(16, local9 + 1, local4 + -1);
			}
			if (arg2 == 1) {
				this.method2225(4, local9, local4);
				this.method2225(64, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2225(16, local9, local4);
				this.method2225(1, local9 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2225(64, local9, local4);
				this.method2225(4, local9 - 1, local4 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method2225(130, local9, local4);
				this.method2225(8, local9, local4 - 1);
				this.method2225(32, local9 + 1, local4);
			}
			if (arg2 == 1) {
				this.method2225(10, local9, local4);
				this.method2225(32, local9 + 1, local4);
				this.method2225(128, local9, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2225(40, local9, local4);
				this.method2225(128, local9, local4 + 1);
				this.method2225(2, local9 - 1, local4);
			}
			if (arg2 == 3) {
				this.method2225(160, local9, local4);
				this.method2225(2, local9 - 1, local4);
				this.method2225(8, local9, local4 - 1);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method2225(65536, local9, local4);
					this.method2225(4096, local9, local4 - 1);
				}
				if (arg2 == 1) {
					this.method2225(1024, local9, local4);
					this.method2225(16384, local9 + 1, local4);
				}
				if (arg2 == 2) {
					this.method2225(4096, local9, local4);
					this.method2225(65536, local9, local4 + 1);
				}
				if (arg2 == 3) {
					this.method2225(16384, local9, local4);
					this.method2225(1024, local9 - 1, local4);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method2225(512, local9, local4);
					this.method2225(8192, local9 + 1, local4 + -1);
				}
				if (arg2 == 1) {
					this.method2225(2048, local9, local4);
					this.method2225(32768, local9 + 1, local4 + 1);
				}
				if (arg2 == 2) {
					this.method2225(8192, local9, local4);
					this.method2225(512, local9 - 1, local4 + 1);
				}
				if (arg2 == 3) {
					this.method2225(32768, local9, local4);
					this.method2225(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method2225(66560, local9, local4);
					this.method2225(4096, local9, local4 - 1);
					this.method2225(16384, local9 + 1, local4);
				}
				if (arg2 == 1) {
					this.method2225(5120, local9, local4);
					this.method2225(16384, local9 + 1, local4);
					this.method2225(65536, local9, local4 + 1);
				}
				if (arg2 == 2) {
					this.method2225(20480, local9, local4);
					this.method2225(65536, local9, local4 + 1);
					this.method2225(1024, local9 - 1, local4);
				}
				if (arg2 == 3) {
					this.method2225(81920, local9, local4);
					this.method2225(1024, local9 - 1, local4);
					this.method2225(4096, local9, local4 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method2225(536870912, local9, local4);
				this.method2225(33554432, local9, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2225(8388608, local9, local4);
				this.method2225(134217728, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method2225(33554432, local9, local4);
				this.method2225(536870912, local9, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2225(134217728, local9, local4);
				this.method2225(8388608, local9 - 1, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method2225(4194304, local9, local4);
				this.method2225(67108864, local9 + 1, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2225(16777216, local9, local4);
				this.method2225(268435456, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2225(67108864, local9, local4);
				this.method2225(4194304, local9 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2225(268435456, local9, local4);
				this.method2225(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2225(545259520, local9, local4);
			this.method2225(33554432, local9, local4 - 1);
			this.method2225(134217728, local9 + 1, local4);
		}
		if (arg2 == 1) {
			this.method2225(41943040, local9, local4);
			this.method2225(134217728, local9 + 1, local4);
			this.method2225(536870912, local9, local4 + 1);
		}
		if (arg2 == 2) {
			this.method2225(167772160, local9, local4);
			this.method2225(536870912, local9, local4 + 1);
			this.method2225(8388608, local9 - 1, local4);
		}
		if (arg2 == 3) {
			this.method2225(671088640, local9, local4);
			this.method2225(8388608, local9 - 1, local4);
			this.method2225(33554432, local9, local4 - 1);
			return;
		}
	}
}

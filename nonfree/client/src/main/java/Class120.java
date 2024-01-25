import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class120 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	public int anInt3910;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
	public int anInt3918;

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
	public int anInt3932;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg4 == arg5 && arg1 == arg0) {
				return true;
			}
		} else if (arg5 >= arg4 && arg5 <= arg3 + arg4 - 1 && arg1 >= arg1 && arg1 <= arg3 + arg1 - 1) {
			return true;
		}
		@Pc(62) int local62 = arg0 - this.anInt3915;
		@Pc(67) int local67 = arg1 - this.anInt3915;
		@Pc(72) int local72 = arg4 - this.anInt3918;
		@Pc(77) int local77 = arg5 - this.anInt3918;
		if (arg3 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local72 == local77 + 1 && local67 == local62 && (this.anIntArrayArray35[local72][local62] & 0x80) == 0) {
						return true;
					}
					if (local72 == local77 && local67 - 1 == local62 && (this.anIntArrayArray35[local72][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local72 == local77 - 1 && local67 == local62 && (this.anIntArrayArray35[local72][local62] & 0x8) == 0) {
						return true;
					}
					if (local72 == local77 && local62 == local67 - 1 && (this.anIntArrayArray35[local72][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local77 - 1 == local72 && local67 == local62 && (this.anIntArrayArray35[local72][local62] & 0x8) == 0) {
						return true;
					}
					if (local72 == local77 && local62 == local67 + 1 && (this.anIntArrayArray35[local72][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local77 + 1 == local72 && local67 == local62 && (this.anIntArrayArray35[local72][local62] & 0x80) == 0) {
						return true;
					}
					if (local72 == local77 && local67 + 1 == local62 && (this.anIntArrayArray35[local72][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local77 == local72 && local62 == local67 + 1 && (this.anIntArrayArray35[local72][local62] & 0x20) == 0) {
					return true;
				}
				if (local77 == local72 && local62 == local67 - 1 && (this.anIntArrayArray35[local72][local62] & 0x2) == 0) {
					return true;
				}
				if (local77 - 1 == local72 && local62 == local67 && (this.anIntArrayArray35[local72][local62] & 0x8) == 0) {
					return true;
				}
				if (local72 == local77 + 1 && local67 == local62 && (this.anIntArrayArray35[local72][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = arg3 + local72 - 1;
			@Pc(92) int local92 = local62 + arg3 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local77 + 1 == local72 && local62 <= local67 && local67 <= local92 && (this.anIntArrayArray35[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local77 >= local72 && local77 <= local86 && local62 == local67 - arg3 && (this.anIntArrayArray35[local77][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local77 - arg3 == local72 && local67 >= local62 && local67 <= local92 && (this.anIntArrayArray35[local86][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local77 && local86 >= local77 && local67 - arg3 == local62 && (this.anIntArrayArray35[local77][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local77 - arg3 == local72 && local62 <= local67 && local92 >= local67 && (this.anIntArrayArray35[local86][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local77 && local77 <= local86 && local67 + 1 == local62 && (this.anIntArrayArray35[local77][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local72 == local77 + 1 && local67 >= local62 && local67 <= local92 && (this.anIntArrayArray35[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local77 >= local72 && local77 <= local86 && local62 == local67 + 1 && (this.anIntArrayArray35[local77][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local72 <= local77 && local77 <= local86 && local67 + 1 == local62 && (this.anIntArrayArray35[local77][local62] & 0x20) == 0) {
					return true;
				}
				if (local77 >= local72 && local86 >= local77 && local62 == local67 - arg3 && (this.anIntArrayArray35[local77][local92] & 0x2) == 0) {
					return true;
				}
				if (local72 == local77 - arg3 && local67 >= local62 && local92 >= local67 && (this.anIntArrayArray35[local86][local67] & 0x8) == 0) {
					return true;
				}
				if (local77 + 1 == local72 && local67 >= local62 && local92 >= local67 && (this.anIntArrayArray35[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII)V")
	private void method3037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)V")
	public void method3038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3915;
		@Pc(21) int local21 = arg1 - this.anInt3918;
		this.anIntArrayArray35[local21][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public boolean method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 > 1) {
			return Static149.method2370(arg4, arg2, arg3, arg0, arg7, arg6, arg1, arg4) ? true : this.method3053(arg4, arg1, arg2, arg3, arg0, arg4, arg6, arg7, arg5);
		}
		@Pc(45) int local45 = arg6 + arg1 - 1;
		@Pc(51) int local51 = arg2 + arg7 - 1;
		if (arg3 >= arg6 && local45 >= arg3 && arg2 <= arg0 && arg0 <= local51) {
			return true;
		} else if (arg6 - 1 == arg3 && arg2 <= arg0 && arg0 <= local51 && (this.anIntArrayArray35[arg3 - this.anInt3918][arg0 - this.anInt3915] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg3 == local45 + 1 && arg0 >= arg2 && arg0 <= local51 && (this.anIntArrayArray35[arg3 - this.anInt3918][arg0 - this.anInt3915] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg0 && arg3 >= arg6 && local45 >= arg3 && (this.anIntArrayArray35[arg3 - this.anInt3918][arg0 - this.anInt3915] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local51 + 1 && arg3 >= arg6 && arg3 <= local45 && (this.anIntArrayArray35[arg3 - this.anInt3918][arg0 - this.anInt3915] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)V")
	public void method3040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3915;
		@Pc(13) int local13 = arg0 - this.anInt3918;
		this.anIntArrayArray35[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method3041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg4 == arg0 && arg3 == arg5) {
				return true;
			}
		} else if (arg4 <= arg0 && arg4 + arg6 - 1 >= arg0 && arg3 <= arg3 && arg3 <= arg6 + arg3 - 1) {
			return true;
		}
		@Pc(54) int local54 = arg5 - this.anInt3915;
		@Pc(59) int local59 = arg3 - this.anInt3915;
		@Pc(64) int local64 = arg4 - this.anInt3918;
		@Pc(69) int local69 = arg0 - this.anInt3918;
		if (arg6 == 1) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local64 == local69 - 1 && local54 == local59) {
						return true;
					}
					if (local69 == local64 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 && local54 == local59 - 1 && (this.anIntArrayArray35[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local69 == local64 && local54 == local59 + 1) {
						return true;
					}
					if (local69 - 1 == local64 && local54 == local59 && (this.anIntArrayArray35[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local64 && local54 == local59 && (this.anIntArrayArray35[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local64 == local69 + 1 && local59 == local54) {
						return true;
					}
					if (local69 == local64 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local69 && local59 - 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 == local69 && local59 - 1 == local54) {
						return true;
					}
					if (local64 == local69 - 1 && local54 == local59 && (this.anIntArrayArray35[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local64 && local54 == local59 && (this.anIntArrayArray35[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					if (local69 - 1 == local64 && local54 == local59) {
						return true;
					}
					if (local64 == local69 && local59 + 1 == local54) {
						return true;
					}
					if (local64 == local69 + 1 && local54 == local59 && (this.anIntArrayArray35[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local69 && local59 - 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 == local69 - 1 && local54 == local59 && (this.anIntArrayArray35[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local69 && local59 + 1 == local54) {
						return true;
					}
					if (local64 == local69 + 1 && local59 == local54) {
						return true;
					}
					if (local64 == local69 && local59 - 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local64 == local69 - 1 && local59 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local64 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local64 && local59 == local54) {
						return true;
					}
					if (local69 == local64 && local54 == local59 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 == local69 - 1 && local59 == local54) {
						return true;
					}
					if (local64 == local69 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local64 && local59 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local64 && local59 - 1 == local54) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local64 == local69 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x20) == 0) {
					return true;
				}
				if (local64 == local69 && local59 - 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x2) == 0) {
					return true;
				}
				if (local69 - 1 == local64 && local59 == local54 && (this.anIntArrayArray35[local64][local54] & 0x8) == 0) {
					return true;
				}
				if (local64 == local69 + 1 && local59 == local54 && (this.anIntArrayArray35[local64][local54] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(787) int local787 = arg6 + local64 - 1;
			@Pc(793) int local793 = local54 + arg6 - 1;
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local69 - arg6 == local64 && local54 <= local59 && local59 <= local793) {
						return true;
					}
					if (local64 <= local69 && local787 >= local69 && local54 == local59 + 1 && (this.anIntArrayArray35[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local69 && local69 <= local787 && local59 - arg6 == local54 && (this.anIntArrayArray35[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 <= local69 && local69 <= local787 && local54 == local59 + 1) {
						return true;
					}
					if (local69 - arg6 == local64 && local54 <= local59 && local793 >= local59 && (this.anIntArrayArray35[local787][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local69 + 1 && local54 <= local59 && local793 >= local59 && (this.anIntArrayArray35[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local69 + 1 == local64 && local59 >= local54 && local59 <= local793) {
						return true;
					}
					if (local64 <= local69 && local69 <= local787 && local54 == local59 + 1 && (this.anIntArrayArray35[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local69 && local69 <= local787 && local59 - arg6 == local54 && (this.anIntArrayArray35[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 <= local69 && local787 >= local69 && local54 == local59 - arg6) {
						return true;
					}
					if (local64 == local69 - arg6 && local59 >= local54 && local59 <= local793 && (this.anIntArrayArray35[local787][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local69 + 1 && local59 >= local54 && local793 >= local59 && (this.anIntArrayArray35[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					if (local69 - arg6 == local64 && local59 >= local54 && local793 >= local59) {
						return true;
					}
					if (local64 <= local69 && local69 <= local787 && local59 + 1 == local54) {
						return true;
					}
					if (local69 + 1 == local64 && local54 <= local59 && local793 >= local59 && (this.anIntArrayArray35[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 >= local64 && local787 >= local69 && local59 - arg6 == local54 && (this.anIntArrayArray35[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 == local69 - arg6 && local54 <= local59 && local793 >= local59 && (this.anIntArrayArray35[local787][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local69 && local787 >= local69 && local54 == local59 + 1) {
						return true;
					}
					if (local64 == local69 + 1 && local54 <= local59 && local59 <= local793) {
						return true;
					}
					if (local69 >= local64 && local69 <= local787 && local54 == local59 - arg6 && (this.anIntArrayArray35[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local64 == local69 - arg6 && local59 >= local54 && local59 <= local793 && (this.anIntArrayArray35[local787][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 >= local64 && local787 >= local69 && local54 == local59 + 1 && (this.anIntArrayArray35[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local64 && local54 <= local59 && local59 <= local793) {
						return true;
					}
					if (local69 >= local64 && local787 >= local69 && local59 - arg6 == local54) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local69 - arg6 == local64 && local59 >= local54 && local793 >= local59) {
						return true;
					}
					if (local69 >= local64 && local787 >= local69 && local59 + 1 == local54 && (this.anIntArrayArray35[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local64 && local59 >= local54 && local59 <= local793 && (this.anIntArrayArray35[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 >= local64 && local69 <= local787 && local59 - arg6 == local54) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local64 <= local69 && local69 <= local787 && local54 == local59 + 1 && (this.anIntArrayArray35[local69][local54] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 <= local69 && local787 >= local69 && local59 - arg6 == local54 && (this.anIntArrayArray35[local69][local793] & 0x2C0102) == 0) {
					return true;
				}
				if (local69 - arg6 == local64 && local59 >= local54 && local793 >= local59 && (this.anIntArrayArray35[local787][local59] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 == local69 + 1 && local59 >= local54 && local59 <= local793 && (this.anIntArrayArray35[local64][local59] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	public void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3918;
		@Pc(9) int local9 = arg1 - this.anInt3915;
		this.anIntArrayArray35[local4][local9] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public void method3044() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3910; local12++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt3932; local15++) {
				if (local12 == 0 || local15 == 0 || local12 >= this.anInt3910 - 5 || this.anInt3932 - 5 <= local15) {
					this.anIntArrayArray35[local12][local15] = -1;
				} else {
					this.anIntArrayArray35[local12][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZIZIII)V")
	public void method3045(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt3918;
		@Pc(9) int local9 = arg5 - this.anInt3915;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method3050(local9, local4, 128);
				this.method3050(local9, local4 - 1, 8);
			}
			if (arg4 == 1) {
				this.method3050(local9, local4, 2);
				this.method3050(local9 + 1, local4, 32);
			}
			if (arg4 == 2) {
				this.method3050(local9, local4, 8);
				this.method3050(local9, local4 + 1, 128);
			}
			if (arg4 == 3) {
				this.method3050(local9, local4, 32);
				this.method3050(local9 - 1, local4, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method3050(local9, local4, 1);
				this.method3050(local9 + 1, local4 + -1, 16);
			}
			if (arg4 == 1) {
				this.method3050(local9, local4, 4);
				this.method3050(local9 + 1, local4 + 1, 64);
			}
			if (arg4 == 2) {
				this.method3050(local9, local4, 16);
				this.method3050(local9 - 1, local4 + 1, 1);
			}
			if (arg4 == 3) {
				this.method3050(local9, local4, 64);
				this.method3050(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method3050(local9, local4, 130);
				this.method3050(local9, local4 - 1, 8);
				this.method3050(local9 + 1, local4, 32);
			}
			if (arg4 == 1) {
				this.method3050(local9, local4, 10);
				this.method3050(local9 + 1, local4, 32);
				this.method3050(local9, local4 + 1, 128);
			}
			if (arg4 == 2) {
				this.method3050(local9, local4, 40);
				this.method3050(local9, local4 + 1, 128);
				this.method3050(local9 - 1, local4, 2);
			}
			if (arg4 == 3) {
				this.method3050(local9, local4, 160);
				this.method3050(local9 - 1, local4, 2);
				this.method3050(local9, local4 - 1, 8);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method3050(local9, local4, 65536);
					this.method3050(local9, local4 - 1, 4096);
				}
				if (arg4 == 1) {
					this.method3050(local9, local4, 1024);
					this.method3050(local9 + 1, local4, 16384);
				}
				if (arg4 == 2) {
					this.method3050(local9, local4, 4096);
					this.method3050(local9, local4 + 1, 65536);
				}
				if (arg4 == 3) {
					this.method3050(local9, local4, 16384);
					this.method3050(local9 - 1, local4, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method3050(local9, local4, 512);
					this.method3050(local9 + 1, local4 + -1, 8192);
				}
				if (arg4 == 1) {
					this.method3050(local9, local4, 2048);
					this.method3050(local9 + 1, local4 - -1, 32768);
				}
				if (arg4 == 2) {
					this.method3050(local9, local4, 8192);
					this.method3050(local9 - 1, local4 - -1, 512);
				}
				if (arg4 == 3) {
					this.method3050(local9, local4, 32768);
					this.method3050(local9 - 1, local4 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method3050(local9, local4, 66560);
					this.method3050(local9, local4 - 1, 4096);
					this.method3050(local9 + 1, local4, 16384);
				}
				if (arg4 == 1) {
					this.method3050(local9, local4, 5120);
					this.method3050(local9 + 1, local4, 16384);
					this.method3050(local9, local4 + 1, 65536);
				}
				if (arg4 == 2) {
					this.method3050(local9, local4, 20480);
					this.method3050(local9, local4 + 1, 65536);
					this.method3050(local9 - 1, local4, 1024);
				}
				if (arg4 == 3) {
					this.method3050(local9, local4, 81920);
					this.method3050(local9 - 1, local4, 1024);
					this.method3050(local9, local4 - 1, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method3050(local9, local4, 536870912);
				this.method3050(local9, local4 - 1, 33554432);
			}
			if (arg4 == 1) {
				this.method3050(local9, local4, 8388608);
				this.method3050(local9 + 1, local4, 134217728);
			}
			if (arg4 == 2) {
				this.method3050(local9, local4, 33554432);
				this.method3050(local9, local4 + 1, 536870912);
			}
			if (arg4 == 3) {
				this.method3050(local9, local4, 134217728);
				this.method3050(local9 - 1, local4, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method3050(local9, local4, 4194304);
				this.method3050(local9 + 1, local4 - 1, 67108864);
			}
			if (arg4 == 1) {
				this.method3050(local9, local4, 16777216);
				this.method3050(local9 + 1, local4 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method3050(local9, local4, 67108864);
				this.method3050(local9 - 1, local4 + 1, 4194304);
			}
			if (arg4 == 3) {
				this.method3050(local9, local4, 268435456);
				this.method3050(local9 - 1, local4 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method3050(local9, local4, 545259520);
			this.method3050(local9, local4 - 1, 33554432);
			this.method3050(local9 + 1, local4, 134217728);
		}
		if (arg4 == 1) {
			this.method3050(local9, local4, 41943040);
			this.method3050(local9 + 1, local4, 134217728);
			this.method3050(local9, local4 + 1, 536870912);
		}
		if (arg4 == 2) {
			this.method3050(local9, local4, 167772160);
			this.method3050(local9, local4 + 1, 536870912);
			this.method3050(local9 - 1, local4, 8388608);
		}
		if (arg4 == 3) {
			this.method3050(local9, local4, 671088640);
			this.method3050(local9 - 1, local4, 8388608);
			this.method3050(local9, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIIZII)V")
	public void method3047(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg1) {
			local5 = 131328;
		}
		@Pc(21) int local21;
		if (arg0 == 1 || arg0 == 3) {
			local21 = arg6;
			arg6 = arg5;
			arg5 = local21;
		}
		if (arg4) {
			local5 |= 0x40000000;
		}
		@Pc(36) int local36 = arg2 - this.anInt3918;
		@Pc(41) int local41 = arg3 - this.anInt3915;
		for (local21 = local36; local21 < arg6 + local36; local21++) {
			if (local21 >= 0 && local21 < this.anInt3910) {
				for (@Pc(64) int local64 = local41; local64 < local41 + arg5; local64++) {
					if (local64 >= 0 && this.anInt3932 > local64) {
						this.method3050(local64, local21, local5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZBZIIII)V")
	public void method3048(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg1) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg5 - this.anInt3915;
		@Pc(21) int local21 = arg3 - this.anInt3918;
		if (arg0) {
			local5 |= 0x40000000;
		}
		for (@Pc(33) int local33 = local21; local33 < local21 + arg4; local33++) {
			if (local33 >= 0 && this.anInt3910 > local33) {
				for (@Pc(42) int local42 = local16; local42 < arg2 + local16; local42++) {
					if (local42 >= 0 && local42 < this.anInt3932) {
						this.method3037(local5, local33, local42);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BIII)V")
	private void method3050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(III)V")
	public void method3051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3918;
		@Pc(9) int local9 = arg1 - this.anInt3915;
		this.anIntArrayArray35[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZIIIIZI)V")
	public void method3052(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt3918;
		@Pc(9) int local9 = arg2 - this.anInt3915;
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method3037(128, local4, local9);
				this.method3037(8, local4 - 1, local9);
			}
			if (arg5 == 1) {
				this.method3037(2, local4, local9);
				this.method3037(32, local4, local9 + 1);
			}
			if (arg5 == 2) {
				this.method3037(8, local4, local9);
				this.method3037(128, local4 + 1, local9);
			}
			if (arg5 == 3) {
				this.method3037(32, local4, local9);
				this.method3037(2, local4, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method3037(1, local4, local9);
				this.method3037(16, local4 - 1, local9 + 1);
			}
			if (arg5 == 1) {
				this.method3037(4, local4, local9);
				this.method3037(64, local4 + 1, local9 + 1);
			}
			if (arg5 == 2) {
				this.method3037(16, local4, local9);
				this.method3037(1, local4 + 1, local9 + -1);
			}
			if (arg5 == 3) {
				this.method3037(64, local4, local9);
				this.method3037(4, local4 - 1, local9 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				this.method3037(130, local4, local9);
				this.method3037(8, local4 - 1, local9);
				this.method3037(32, local4, local9 + 1);
			}
			if (arg5 == 1) {
				this.method3037(10, local4, local9);
				this.method3037(32, local4, local9 + 1);
				this.method3037(128, local4 + 1, local9);
			}
			if (arg5 == 2) {
				this.method3037(40, local4, local9);
				this.method3037(128, local4 + 1, local9);
				this.method3037(2, local4, local9 - 1);
			}
			if (arg5 == 3) {
				this.method3037(160, local4, local9);
				this.method3037(2, local4, local9 - 1);
				this.method3037(8, local4 - 1, local9);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method3037(65536, local4, local9);
					this.method3037(4096, local4 - 1, local9);
				}
				if (arg5 == 1) {
					this.method3037(1024, local4, local9);
					this.method3037(16384, local4, local9 + 1);
				}
				if (arg5 == 2) {
					this.method3037(4096, local4, local9);
					this.method3037(65536, local4 + 1, local9);
				}
				if (arg5 == 3) {
					this.method3037(16384, local4, local9);
					this.method3037(1024, local4, local9 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method3037(512, local4, local9);
					this.method3037(8192, local4 - 1, local9 + 1);
				}
				if (arg5 == 1) {
					this.method3037(2048, local4, local9);
					this.method3037(32768, local4 + 1, local9 + 1);
				}
				if (arg5 == 2) {
					this.method3037(8192, local4, local9);
					this.method3037(512, local4 + 1, local9 + -1);
				}
				if (arg5 == 3) {
					this.method3037(32768, local4, local9);
					this.method3037(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method3037(66560, local4, local9);
					this.method3037(4096, local4 - 1, local9);
					this.method3037(16384, local4, local9 + 1);
				}
				if (arg5 == 1) {
					this.method3037(5120, local4, local9);
					this.method3037(16384, local4, local9 + 1);
					this.method3037(65536, local4 + 1, local9);
				}
				if (arg5 == 2) {
					this.method3037(20480, local4, local9);
					this.method3037(65536, local4 + 1, local9);
					this.method3037(1024, local4, local9 - 1);
				}
				if (arg5 == 3) {
					this.method3037(81920, local4, local9);
					this.method3037(1024, local4, local9 - 1);
					this.method3037(4096, local4 - 1, local9);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method3037(536870912, local4, local9);
				this.method3037(33554432, local4 - 1, local9);
			}
			if (arg5 == 1) {
				this.method3037(8388608, local4, local9);
				this.method3037(134217728, local4, local9 + 1);
			}
			if (arg5 == 2) {
				this.method3037(33554432, local4, local9);
				this.method3037(536870912, local4 + 1, local9);
			}
			if (arg5 == 3) {
				this.method3037(134217728, local4, local9);
				this.method3037(8388608, local4, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method3037(4194304, local4, local9);
				this.method3037(67108864, local4 - 1, local9 + 1);
			}
			if (arg5 == 1) {
				this.method3037(16777216, local4, local9);
				this.method3037(268435456, local4 + 1, local9 - -1);
			}
			if (arg5 == 2) {
				this.method3037(67108864, local4, local9);
				this.method3037(4194304, local4 + 1, local9 + -1);
			}
			if (arg5 == 3) {
				this.method3037(268435456, local4, local9);
				this.method3037(16777216, local4 - 1, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method3037(545259520, local4, local9);
			this.method3037(33554432, local4 - 1, local9);
			this.method3037(134217728, local4, local9 + 1);
		}
		if (arg5 == 1) {
			this.method3037(41943040, local4, local9);
			this.method3037(134217728, local4, local9 + 1);
			this.method3037(536870912, local4 + 1, local9);
		}
		if (arg5 == 2) {
			this.method3037(167772160, local4, local9);
			this.method3037(536870912, local4 + 1, local9);
			this.method3037(8388608, local4, local9 - 1);
		}
		if (arg5 == 3) {
			this.method3037(671088640, local4, local9);
			this.method3037(8388608, local4, local9 - 1);
			this.method3037(33554432, local4 - 1, local9);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg3 + arg5;
		@Pc(16) int local16 = arg0 + arg4;
		@Pc(20) int local20 = arg1 + arg6;
		@Pc(24) int local24 = arg7 + arg2;
		@Pc(69) int local69;
		@Pc(76) int local76;
		if (arg3 == local20 && (arg8 & 0x2) == 0) {
			local69 = arg4 <= arg2 ? arg2 : arg4;
			local76 = local16 >= local24 ? local24 : local16;
			while (local76 > local69) {
				if ((this.anIntArrayArray35[local20 - this.anInt3918 - 1][local69 - this.anInt3915] & 0x8) == 0) {
					return true;
				}
				local69++;
			}
		} else if (local12 == arg6 && (arg8 & 0x8) == 0) {
			local69 = arg4 > arg2 ? arg4 : arg2;
			local76 = local24 > local16 ? local16 : local24;
			while (local69 < local76) {
				if ((this.anIntArrayArray35[arg6 - this.anInt3918][local69 - this.anInt3915] & 0x80) == 0) {
					return true;
				}
				local69++;
			}
		} else if (local24 == arg4 && (arg8 & 0x1) == 0) {
			local69 = arg6 < arg3 ? arg3 : arg6;
			local76 = local20 > local12 ? local12 : local20;
			while (local76 > local69) {
				if ((this.anIntArrayArray35[local69 - this.anInt3918][local24 - this.anInt3915 - 1] & 0x2) == 0) {
					return true;
				}
				local69++;
			}
		} else if (arg2 == local16 && (arg8 & 0x4) == 0) {
			local69 = arg3 > arg6 ? arg3 : arg6;
			local76 = local12 >= local20 ? local20 : local12;
			while (local69 < local76) {
				if ((this.anIntArrayArray35[local69 - this.anInt3918][arg2 - this.anInt3915] & 0x20) == 0) {
					return true;
				}
				local69++;
			}
		}
		return false;
	}
}

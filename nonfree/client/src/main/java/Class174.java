import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class174 {

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	public int anInt5464;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
	public int anInt5483;

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
	public int anInt5486;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static265.method4632(arg2, arg0, arg6, arg3, arg4, arg4, arg7, arg1) ? true : this.method4667(arg4, arg0, arg4, arg6, arg1, arg5, arg7, arg2, arg3);
		}
		@Pc(38) int local38 = arg1 + arg2 - 1;
		@Pc(44) int local44 = arg7 + arg0 - 1;
		if (arg2 <= arg6 && local38 >= arg6 && arg0 <= arg3 && local44 >= arg3) {
			return true;
		} else if (arg2 - 1 == arg6 && arg0 <= arg3 && local44 >= arg3 && (this.anIntArrayArray53[arg6 - this.anInt5481][arg3 - this.anInt5486] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg6 == local38 + 1 && arg3 >= arg0 && arg3 <= local44 && (this.anIntArrayArray53[arg6 - this.anInt5481][arg3 - this.anInt5486] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg0 - 1 && arg6 >= arg2 && local38 >= arg6 && (this.anIntArrayArray53[arg6 - this.anInt5481][arg3 - this.anInt5486] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local44 + 1 && arg6 >= arg2 && local38 >= arg6 && (this.anIntArrayArray53[arg6 - this.anInt5481][arg3 - this.anInt5486] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method4654() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5483; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt5464; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt5483 - 5 <= local3 || this.anInt5464 - 5 <= local7) {
					this.anIntArrayArray53[local3][local7] = -1;
				} else {
					this.anIntArrayArray53[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)V")
	private void method4655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray53[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg5 && arg4 == arg6) {
				return true;
			}
		} else if (arg5 >= arg2 && arg0 + arg2 - 1 >= arg5 && arg6 >= arg6 && arg6 <= arg6 + arg0 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg4 - this.anInt5486;
		@Pc(62) int local62 = arg6 - this.anInt5486;
		@Pc(67) int local67 = arg5 - this.anInt5481;
		@Pc(72) int local72 = arg2 - this.anInt5481;
		if (arg0 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local72 == local67 - 1 && local62 == local57) {
						return true;
					}
					if (local72 == local67 && local57 == local62 + 1 && (this.anIntArrayArray53[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local57 == local62 - 1 && (this.anIntArrayArray53[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local67 && local57 == local62 + 1) {
						return true;
					}
					if (local72 == local67 - 1 && local62 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 == local62 && (this.anIntArrayArray53[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 + 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 + 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 && local62 - 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 == local72 && local62 - 1 == local57) {
						return true;
					}
					if (local72 == local67 - 1 && local62 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 == local62 && (this.anIntArrayArray53[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local72 == local67 - 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local57 == local62 + 1) {
						return true;
					}
					if (local72 == local67 + 1 && local57 == local62 && (this.anIntArrayArray53[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local67 && local62 - 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local67 - 1 && local57 == local62 && (this.anIntArrayArray53[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 && local57 == local62 + 1) {
						return true;
					}
					if (local72 == local67 + 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 - 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 - 1 == local72 && local57 == local62 && (this.anIntArrayArray53[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 && local62 + 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 - 1 == local57) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 - 1 == local72 && local57 == local62) {
						return true;
					}
					if (local72 == local67 && local62 + 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local57 == local62 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local72 == local67 && local62 + 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x20) == 0) {
					return true;
				}
				if (local67 == local72 && local62 - 1 == local57 && (this.anIntArrayArray53[local72][local57] & 0x2) == 0) {
					return true;
				}
				if (local67 - 1 == local72 && local62 == local57 && (this.anIntArrayArray53[local72][local57] & 0x8) == 0) {
					return true;
				}
				if (local72 == local67 + 1 && local62 == local57 && (this.anIntArrayArray53[local72][local57] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(784) int local784 = local72 + arg0 - 1;
			@Pc(790) int local790 = arg0 + local57 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local72 == local67 - arg0 && local57 <= local62 && local62 <= local790) {
						return true;
					}
					if (local67 >= local72 && local67 <= local784 && local57 == local62 + 1 && (this.anIntArrayArray53[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 <= local67 && local67 <= local784 && local62 - arg0 == local57 && (this.anIntArrayArray53[local67][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local67 >= local72 && local67 <= local784 && local57 == local62 + 1) {
						return true;
					}
					if (local72 == local67 - arg0 && local62 >= local57 && local62 <= local790 && (this.anIntArrayArray53[local784][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local57 <= local62 && local790 >= local62 && (this.anIntArrayArray53[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 + 1 && local62 >= local57 && local790 >= local62) {
						return true;
					}
					if (local67 >= local72 && local784 >= local67 && local57 == local62 + 1 && (this.anIntArrayArray53[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 <= local67 && local67 <= local784 && local62 - arg0 == local57 && (this.anIntArrayArray53[local67][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local72 <= local67 && local784 >= local67 && local62 - arg0 == local57) {
						return true;
					}
					if (local67 - arg0 == local72 && local62 >= local57 && local790 >= local62 && (this.anIntArrayArray53[local784][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local57 <= local62 && local790 >= local62 && (this.anIntArrayArray53[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local72 == local67 - arg0 && local62 >= local57 && local62 <= local790) {
						return true;
					}
					if (local72 <= local67 && local67 <= local784 && local57 == local62 + 1) {
						return true;
					}
					if (local67 + 1 == local72 && local62 >= local57 && local62 <= local790 && (this.anIntArrayArray53[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local67 && local784 >= local67 && local62 - arg0 == local57 && (this.anIntArrayArray53[local67][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local67 - arg0 && local62 >= local57 && local790 >= local62 && (this.anIntArrayArray53[local784][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 <= local67 && local67 <= local784 && local57 == local62 + 1) {
						return true;
					}
					if (local72 == local67 + 1 && local57 <= local62 && local62 <= local790) {
						return true;
					}
					if (local72 <= local67 && local67 <= local784 && local62 - arg0 == local57 && (this.anIntArrayArray53[local67][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 - arg0 && local62 >= local57 && local62 <= local790 && (this.anIntArrayArray53[local784][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 >= local72 && local784 >= local67 && local62 + 1 == local57 && (this.anIntArrayArray53[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local57 <= local62 && local62 <= local790) {
						return true;
					}
					if (local67 >= local72 && local784 >= local67 && local62 - arg0 == local57) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 - arg0 == local72 && local62 >= local57 && local790 >= local62) {
						return true;
					}
					if (local72 <= local67 && local784 >= local67 && local62 + 1 == local57 && (this.anIntArrayArray53[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 >= local57 && local62 <= local790 && (this.anIntArrayArray53[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 >= local72 && local67 <= local784 && local57 == local62 - arg0) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local72 <= local67 && local784 >= local67 && local57 == local62 + 1 && (this.anIntArrayArray53[local67][local57] & 0x2C0120) == 0) {
					return true;
				}
				if (local67 >= local72 && local784 >= local67 && local57 == local62 - arg0 && (this.anIntArrayArray53[local67][local790] & 0x2C0102) == 0) {
					return true;
				}
				if (local67 - arg0 == local72 && local62 >= local57 && local790 >= local62 && (this.anIntArrayArray53[local784][local62] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 + 1 == local72 && local57 <= local62 && local62 <= local790 && (this.anIntArrayArray53[local72][local62] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg2 == arg3 && arg1 == arg6) {
				return true;
			}
		} else if (arg2 <= arg3 && arg2 + arg4 - 1 >= arg3 && arg1 >= arg1 && arg1 <= arg1 + arg4 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg2 - this.anInt5481;
		@Pc(66) int local66 = arg1 - this.anInt5486;
		@Pc(71) int local71 = arg6 - this.anInt5486;
		@Pc(76) int local76 = arg3 - this.anInt5481;
		if (arg4 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local61 == local76 + 1 && local71 == local66 && (this.anIntArrayArray53[local61][local71] & 0x80) == 0) {
						return true;
					}
					if (local76 == local61 && local71 == local66 - 1 && (this.anIntArrayArray53[local61][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local76 - 1 == local61 && local71 == local66 && (this.anIntArrayArray53[local61][local71] & 0x8) == 0) {
						return true;
					}
					if (local76 == local61 && local71 == local66 - 1 && (this.anIntArrayArray53[local61][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 == local76 - 1 && local66 == local71 && (this.anIntArrayArray53[local61][local71] & 0x8) == 0) {
						return true;
					}
					if (local76 == local61 && local71 == local66 + 1 && (this.anIntArrayArray53[local61][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local76 + 1 == local61 && local66 == local71 && (this.anIntArrayArray53[local61][local71] & 0x80) == 0) {
						return true;
					}
					if (local76 == local61 && local71 == local66 + 1 && (this.anIntArrayArray53[local61][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local76 == local61 && local71 == local66 + 1 && (this.anIntArrayArray53[local61][local71] & 0x20) == 0) {
					return true;
				}
				if (local76 == local61 && local71 == local66 - 1 && (this.anIntArrayArray53[local61][local71] & 0x2) == 0) {
					return true;
				}
				if (local76 - 1 == local61 && local66 == local71 && (this.anIntArrayArray53[local61][local71] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local61 && local66 == local71 && (this.anIntArrayArray53[local61][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(92) int local92 = local61 + arg4 - 1;
			@Pc(98) int local98 = arg4 + local71 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local76 + 1 == local61 && local66 >= local71 && local98 >= local66 && (this.anIntArrayArray53[local61][local66] & 0x80) == 0) {
						return true;
					}
					if (local76 >= local61 && local92 >= local76 && local71 == local66 - arg4 && (this.anIntArrayArray53[local76][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local76 - arg4 == local61 && local66 >= local71 && local98 >= local66 && (this.anIntArrayArray53[local92][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 <= local76 && local92 >= local76 && local66 - arg4 == local71 && (this.anIntArrayArray53[local76][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 == local76 - arg4 && local66 >= local71 && local66 <= local98 && (this.anIntArrayArray53[local92][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 <= local76 && local76 <= local92 && local66 + 1 == local71 && (this.anIntArrayArray53[local76][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 == local76 + 1 && local71 <= local66 && local98 >= local66 && (this.anIntArrayArray53[local61][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 <= local76 && local92 >= local76 && local66 + 1 == local71 && (this.anIntArrayArray53[local76][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local76 >= local61 && local92 >= local76 && local66 + 1 == local71 && (this.anIntArrayArray53[local76][local71] & 0x20) == 0) {
					return true;
				}
				if (local61 <= local76 && local76 <= local92 && local71 == local66 - arg4 && (this.anIntArrayArray53[local76][local98] & 0x2) == 0) {
					return true;
				}
				if (local61 == local76 - arg4 && local66 >= local71 && local66 <= local98 && (this.anIntArrayArray53[local92][local66] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local61 && local71 <= local66 && local98 >= local66 && (this.anIntArrayArray53[local61][local66] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIZZ)V")
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(26) int local26 = arg3 - this.anInt5481;
		@Pc(31) int local31 = arg0 - this.anInt5486;
		@Pc(39) int local39;
		if (arg2 == 1 || arg2 == 3) {
			local39 = arg1;
			arg1 = arg4;
			arg4 = local39;
		}
		if (arg6) {
			local7 |= 0x40000000;
		}
		for (local39 = local26; local39 < local26 + arg1; local39++) {
			if (local39 >= 0 && local39 < this.anInt5483) {
				for (@Pc(68) int local68 = local31; local68 < arg4 + local31; local68++) {
					if (local68 >= 0 && local68 < this.anInt5464) {
						this.method4665(local7, local68, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZIIZBI)V")
	public void method4661(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt5481;
		@Pc(21) int local21 = arg3 - this.anInt5486;
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method4665(128, local21, local8);
				this.method4665(8, local21, local8 - 1);
			}
			if (arg5 == 1) {
				this.method4665(2, local21, local8);
				this.method4665(32, local21 + 1, local8);
			}
			if (arg5 == 2) {
				this.method4665(8, local21, local8);
				this.method4665(128, local21, local8 + 1);
			}
			if (arg5 == 3) {
				this.method4665(32, local21, local8);
				this.method4665(2, local21 - 1, local8);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method4665(1, local21, local8);
				this.method4665(16, local21 + 1, local8 + -1);
			}
			if (arg5 == 1) {
				this.method4665(4, local21, local8);
				this.method4665(64, local21 + 1, local8 + 1);
			}
			if (arg5 == 2) {
				this.method4665(16, local21, local8);
				this.method4665(1, local21 - 1, local8 + 1);
			}
			if (arg5 == 3) {
				this.method4665(64, local21, local8);
				this.method4665(4, local21 - 1, local8 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				this.method4665(130, local21, local8);
				this.method4665(8, local21, local8 - 1);
				this.method4665(32, local21 + 1, local8);
			}
			if (arg5 == 1) {
				this.method4665(10, local21, local8);
				this.method4665(32, local21 + 1, local8);
				this.method4665(128, local21, local8 + 1);
			}
			if (arg5 == 2) {
				this.method4665(40, local21, local8);
				this.method4665(128, local21, local8 + 1);
				this.method4665(2, local21 - 1, local8);
			}
			if (arg5 == 3) {
				this.method4665(160, local21, local8);
				this.method4665(2, local21 - 1, local8);
				this.method4665(8, local21, local8 - 1);
			}
		}
		if (arg1) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method4665(65536, local21, local8);
					this.method4665(4096, local21, local8 - 1);
				}
				if (arg5 == 1) {
					this.method4665(1024, local21, local8);
					this.method4665(16384, local21 + 1, local8);
				}
				if (arg5 == 2) {
					this.method4665(4096, local21, local8);
					this.method4665(65536, local21, local8 + 1);
				}
				if (arg5 == 3) {
					this.method4665(16384, local21, local8);
					this.method4665(1024, local21 - 1, local8);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method4665(512, local21, local8);
					this.method4665(8192, local21 + 1, local8 + -1);
				}
				if (arg5 == 1) {
					this.method4665(2048, local21, local8);
					this.method4665(32768, local21 + 1, local8 + 1);
				}
				if (arg5 == 2) {
					this.method4665(8192, local21, local8);
					this.method4665(512, local21 - 1, local8 + 1);
				}
				if (arg5 == 3) {
					this.method4665(32768, local21, local8);
					this.method4665(2048, local21 - 1, local8 + -1);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method4665(66560, local21, local8);
					this.method4665(4096, local21, local8 - 1);
					this.method4665(16384, local21 + 1, local8);
				}
				if (arg5 == 1) {
					this.method4665(5120, local21, local8);
					this.method4665(16384, local21 + 1, local8);
					this.method4665(65536, local21, local8 + 1);
				}
				if (arg5 == 2) {
					this.method4665(20480, local21, local8);
					this.method4665(65536, local21, local8 + 1);
					this.method4665(1024, local21 - 1, local8);
				}
				if (arg5 == 3) {
					this.method4665(81920, local21, local8);
					this.method4665(1024, local21 - 1, local8);
					this.method4665(4096, local21, local8 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method4665(536870912, local21, local8);
				this.method4665(33554432, local21, local8 - 1);
			}
			if (arg5 == 1) {
				this.method4665(8388608, local21, local8);
				this.method4665(134217728, local21 + 1, local8);
			}
			if (arg5 == 2) {
				this.method4665(33554432, local21, local8);
				this.method4665(536870912, local21, local8 + 1);
			}
			if (arg5 == 3) {
				this.method4665(134217728, local21, local8);
				this.method4665(8388608, local21 - 1, local8);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method4665(4194304, local21, local8);
				this.method4665(67108864, local21 + 1, local8 + -1);
			}
			if (arg5 == 1) {
				this.method4665(16777216, local21, local8);
				this.method4665(268435456, local21 + 1, local8 + 1);
			}
			if (arg5 == 2) {
				this.method4665(67108864, local21, local8);
				this.method4665(4194304, local21 - 1, local8 + 1);
			}
			if (arg5 == 3) {
				this.method4665(268435456, local21, local8);
				this.method4665(16777216, local21 - 1, local8 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method4665(545259520, local21, local8);
			this.method4665(33554432, local21, local8 - 1);
			this.method4665(134217728, local21 + 1, local8);
		}
		if (arg5 == 1) {
			this.method4665(41943040, local21, local8);
			this.method4665(134217728, local21 + 1, local8);
			this.method4665(536870912, local21, local8 + 1);
		}
		if (arg5 == 2) {
			this.method4665(167772160, local21, local8);
			this.method4665(536870912, local21, local8 + 1);
			this.method4665(8388608, local21 - 1, local8);
		}
		if (arg5 == 3) {
			this.method4665(671088640, local21, local8);
			this.method4665(8388608, local21 - 1, local8);
			this.method4665(33554432, local21, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIZZ)V")
	public void method4662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt5486;
		@Pc(13) int local13 = arg3 - this.anInt5481;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method4655(local4, local13, 128);
				this.method4655(local4, local13 - 1, 8);
			}
			if (arg1 == 1) {
				this.method4655(local4, local13, 2);
				this.method4655(local4 + 1, local13, 32);
			}
			if (arg1 == 2) {
				this.method4655(local4, local13, 8);
				this.method4655(local4, local13 + 1, 128);
			}
			if (arg1 == 3) {
				this.method4655(local4, local13, 32);
				this.method4655(local4 - 1, local13, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method4655(local4, local13, 1);
				this.method4655(local4 + 1, local13 + -1, 16);
			}
			if (arg1 == 1) {
				this.method4655(local4, local13, 4);
				this.method4655(local4 + 1, local13 + 1, 64);
			}
			if (arg1 == 2) {
				this.method4655(local4, local13, 16);
				this.method4655(local4 - 1, local13 + 1, 1);
			}
			if (arg1 == 3) {
				this.method4655(local4, local13, 64);
				this.method4655(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method4655(local4, local13, 130);
				this.method4655(local4, local13 - 1, 8);
				this.method4655(local4 + 1, local13, 32);
			}
			if (arg1 == 1) {
				this.method4655(local4, local13, 10);
				this.method4655(local4 + 1, local13, 32);
				this.method4655(local4, local13 + 1, 128);
			}
			if (arg1 == 2) {
				this.method4655(local4, local13, 40);
				this.method4655(local4, local13 + 1, 128);
				this.method4655(local4 - 1, local13, 2);
			}
			if (arg1 == 3) {
				this.method4655(local4, local13, 160);
				this.method4655(local4 - 1, local13, 2);
				this.method4655(local4, local13 - 1, 8);
			}
		}
		if (arg4) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method4655(local4, local13, 65536);
					this.method4655(local4, local13 - 1, 4096);
				}
				if (arg1 == 1) {
					this.method4655(local4, local13, 1024);
					this.method4655(local4 + 1, local13, 16384);
				}
				if (arg1 == 2) {
					this.method4655(local4, local13, 4096);
					this.method4655(local4, local13 + 1, 65536);
				}
				if (arg1 == 3) {
					this.method4655(local4, local13, 16384);
					this.method4655(local4 - 1, local13, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method4655(local4, local13, 512);
					this.method4655(local4 + 1, local13 + -1, 8192);
				}
				if (arg1 == 1) {
					this.method4655(local4, local13, 2048);
					this.method4655(local4 + 1, local13 + 1, 32768);
				}
				if (arg1 == 2) {
					this.method4655(local4, local13, 8192);
					this.method4655(local4 - 1, local13 + 1, 512);
				}
				if (arg1 == 3) {
					this.method4655(local4, local13, 32768);
					this.method4655(local4 - 1, local13 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method4655(local4, local13, 66560);
					this.method4655(local4, local13 - 1, 4096);
					this.method4655(local4 + 1, local13, 16384);
				}
				if (arg1 == 1) {
					this.method4655(local4, local13, 5120);
					this.method4655(local4 + 1, local13, 16384);
					this.method4655(local4, local13 + 1, 65536);
				}
				if (arg1 == 2) {
					this.method4655(local4, local13, 20480);
					this.method4655(local4, local13 + 1, 65536);
					this.method4655(local4 - 1, local13, 1024);
				}
				if (arg1 == 3) {
					this.method4655(local4, local13, 81920);
					this.method4655(local4 - 1, local13, 1024);
					this.method4655(local4, local13 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method4655(local4, local13, 536870912);
				this.method4655(local4, local13 - 1, 33554432);
			}
			if (arg1 == 1) {
				this.method4655(local4, local13, 8388608);
				this.method4655(local4 + 1, local13, 134217728);
			}
			if (arg1 == 2) {
				this.method4655(local4, local13, 33554432);
				this.method4655(local4, local13 + 1, 536870912);
			}
			if (arg1 == 3) {
				this.method4655(local4, local13, 134217728);
				this.method4655(local4 - 1, local13, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method4655(local4, local13, 4194304);
				this.method4655(local4 + 1, local13 + -1, 67108864);
			}
			if (arg1 == 1) {
				this.method4655(local4, local13, 16777216);
				this.method4655(local4 + 1, local13 - -1, 268435456);
			}
			if (arg1 == 2) {
				this.method4655(local4, local13, 67108864);
				this.method4655(local4 - 1, local13 + 1, 4194304);
			}
			if (arg1 == 3) {
				this.method4655(local4, local13, 268435456);
				this.method4655(local4 - 1, local13 - 1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method4655(local4, local13, 545259520);
			this.method4655(local4, local13 - 1, 33554432);
			this.method4655(local4 + 1, local13, 134217728);
		}
		if (arg1 == 1) {
			this.method4655(local4, local13, 41943040);
			this.method4655(local4 + 1, local13, 134217728);
			this.method4655(local4, local13 + 1, 536870912);
		}
		if (arg1 == 2) {
			this.method4655(local4, local13, 167772160);
			this.method4655(local4, local13 + 1, 536870912);
			this.method4655(local4 - 1, local13, 8388608);
		}
		if (arg1 == 3) {
			this.method4655(local4, local13, 671088640);
			this.method4655(local4 - 1, local13, 8388608);
			this.method4655(local4, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBZIIIZ)V")
	public void method4663(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(14) int local14 = 256;
		if (arg5) {
			local14 = 131328;
		}
		@Pc(25) int local25 = arg0 - this.anInt5481;
		if (arg1) {
			local14 |= 0x40000000;
		}
		@Pc(36) int local36 = arg4 - this.anInt5486;
		for (@Pc(38) int local38 = local25; local38 < arg2 + local25; local38++) {
			if (local38 >= 0 && local38 < this.anInt5483) {
				for (@Pc(55) int local55 = local36; local55 < arg3 + local36; local55++) {
					if (local55 >= 0 && local55 < this.anInt5464) {
						this.method4655(local55, local38, local14);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	public void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5481;
		@Pc(9) int local9 = arg1 - this.anInt5486;
		this.anIntArrayArray53[local4][local9] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIII)V")
	private void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray53[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)V")
	public void method4666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5481;
		@Pc(9) int local9 = arg1 - this.anInt5486;
		this.anIntArrayArray53[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBIIIIIIII)Z")
	public boolean method4667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg3;
		@Pc(13) int local13 = arg2 + arg8;
		@Pc(31) int local31 = arg7 + arg4;
		@Pc(36) int local36 = arg1 + arg6;
		@Pc(61) int local61;
		@Pc(68) int local68;
		if (arg3 == local31 && (arg5 & 0x2) == 0) {
			local61 = arg8 <= arg1 ? arg1 : arg8;
			local68 = local13 < local36 ? local13 : local36;
			while (local61 < local68) {
				if ((this.anIntArrayArray53[local31 - this.anInt5481 - 1][local61 - this.anInt5486] & 0x8) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg7 == local9 && (arg5 & 0x8) == 0) {
			local61 = arg1 >= arg8 ? arg1 : arg8;
			local68 = local13 >= local36 ? local36 : local13;
			while (local61 < local68) {
				if ((this.anIntArrayArray53[arg7 - this.anInt5481][local61 - this.anInt5486] & 0x80) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg8 == local36 && (arg5 & 0x1) == 0) {
			local61 = arg3 > arg7 ? arg3 : arg7;
			local68 = local9 < local31 ? local9 : local31;
			while (local61 < local68) {
				if ((this.anIntArrayArray53[local61 - this.anInt5481][local36 - this.anInt5486 - 1] & 0x2) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg1 == local13 && (arg5 & 0x4) == 0) {
			local61 = arg3 > arg7 ? arg3 : arg7;
			local68 = local31 <= local9 ? local31 : local9;
			while (local61 < local68) {
				if ((this.anIntArrayArray53[local61 - this.anInt5481][arg1 - this.anInt5486] & 0x20) == 0) {
					return true;
				}
				local61++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V")
	public void method4668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5481;
		@Pc(17) int local17 = arg1 - this.anInt5486;
		this.anIntArrayArray53[local4][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(III)V")
	public void method4672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt5486;
		@Pc(17) int local17 = arg0 - this.anInt5481;
		this.anIntArrayArray53[local17][local12] &= 0xFFFBFFFF;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class295 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray80;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
	public int anInt7932;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
	public int anInt7934;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	public int anInt7938;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
	public int anInt7940;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method6545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg6 == arg3 && arg5 == arg0) {
				return true;
			}
		} else if (arg6 <= arg3 && arg1 + arg6 - 1 >= arg3 && arg0 >= arg0 && arg0 <= arg1 + arg0 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg6 - this.anInt7938;
		@Pc(66) int local66 = arg3 - this.anInt7938;
		@Pc(71) int local71 = arg5 - this.anInt7934;
		@Pc(76) int local76 = arg0 - this.anInt7934;
		if (arg1 == 1) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local61 == local66 - 1 && local71 == local76) {
						return true;
					}
					if (local61 == local66 && local76 + 1 == local71 && (this.anIntArrayArray80[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 && local76 - 1 == local71 && (this.anIntArrayArray80[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local66 == local61 && local76 + 1 == local71) {
						return true;
					}
					if (local61 == local66 - 1 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local76 == local71 && (this.anIntArrayArray80[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local61 == local66 + 1 && local76 == local71) {
						return true;
					}
					if (local66 == local61 && local71 == local76 + 1 && (this.anIntArrayArray80[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local66 && local71 == local76 - 1 && (this.anIntArrayArray80[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local61 == local66 && local76 - 1 == local71) {
						return true;
					}
					if (local61 == local66 - 1 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local66 - 1 == local61 && local71 == local76) {
						return true;
					}
					if (local66 == local61 && local76 + 1 == local71) {
						return true;
					}
					if (local61 == local66 + 1 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local61 && local71 == local76 - 1 && (this.anIntArrayArray80[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local61 == local66 - 1 && local76 == local71 && (this.anIntArrayArray80[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local61 && local76 + 1 == local71) {
						return true;
					}
					if (local66 + 1 == local61 && local76 == local71) {
						return true;
					}
					if (local61 == local66 && local76 - 1 == local71 && (this.anIntArrayArray80[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local66 - 1 == local61 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local61 && local71 == local76 + 1 && (this.anIntArrayArray80[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local66 + 1 && local71 == local76) {
						return true;
					}
					if (local66 == local61 && local76 - 1 == local71) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local61 == local66 - 1 && local76 == local71) {
						return true;
					}
					if (local61 == local66 && local71 == local76 + 1 && (this.anIntArrayArray80[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local61 && local71 == local76 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local66 == local61 && local76 + 1 == local71 && (this.anIntArrayArray80[local61][local71] & 0x20) == 0) {
					return true;
				}
				if (local66 == local61 && local76 - 1 == local71 && (this.anIntArrayArray80[local61][local71] & 0x2) == 0) {
					return true;
				}
				if (local66 - 1 == local61 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x8) == 0) {
					return true;
				}
				if (local66 + 1 == local61 && local71 == local76 && (this.anIntArrayArray80[local61][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(85) int local85 = arg1 + local61 - 1;
			@Pc(91) int local91 = arg1 + local71 - 1;
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local61 == local66 - arg1 && local71 <= local76 && local76 <= local91) {
						return true;
					}
					if (local66 >= local61 && local66 <= local85 && local71 == local76 + 1 && (this.anIntArrayArray80[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 >= local61 && local66 <= local85 && local71 == local76 - arg1 && (this.anIntArrayArray80[local66][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local66 >= local61 && local66 <= local85 && local71 == local76 + 1) {
						return true;
					}
					if (local61 == local66 - arg1 && local71 <= local76 && local76 <= local91 && (this.anIntArrayArray80[local85][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local66 + 1 && local76 >= local71 && local76 <= local91 && (this.anIntArrayArray80[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local66 + 1 == local61 && local76 >= local71 && local91 >= local76) {
						return true;
					}
					if (local66 >= local61 && local66 <= local85 && local76 + 1 == local71 && (this.anIntArrayArray80[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 >= local61 && local66 <= local85 && local76 - arg1 == local71 && (this.anIntArrayArray80[local66][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local61 <= local66 && local66 <= local85 && local76 - arg1 == local71) {
						return true;
					}
					if (local66 - arg1 == local61 && local76 >= local71 && local91 >= local76 && (this.anIntArrayArray80[local85][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local66 + 1 && local76 >= local71 && local76 <= local91 && (this.anIntArrayArray80[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local61 == local66 - arg1 && local76 >= local71 && local76 <= local91) {
						return true;
					}
					if (local61 <= local66 && local85 >= local66 && local76 + 1 == local71) {
						return true;
					}
					if (local61 == local66 + 1 && local71 <= local76 && local91 >= local76 && (this.anIntArrayArray80[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local71 == local76 - arg1 && (this.anIntArrayArray80[local66][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local66 - arg1 == local61 && local76 >= local71 && local91 >= local76 && (this.anIntArrayArray80[local85][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local71 == local76 + 1) {
						return true;
					}
					if (local66 + 1 == local61 && local71 <= local76 && local91 >= local76) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local76 - arg1 == local71 && (this.anIntArrayArray80[local66][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local66 - arg1 == local61 && local76 >= local71 && local76 <= local91 && (this.anIntArrayArray80[local85][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local76 + 1 == local71 && (this.anIntArrayArray80[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local71 <= local76 && local76 <= local91) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local71 == local76 - arg1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local61 == local66 - arg1 && local71 <= local76 && local91 >= local76) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local71 == local76 + 1 && (this.anIntArrayArray80[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local71 <= local76 && local91 >= local76 && (this.anIntArrayArray80[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 <= local66 && local66 <= local85 && local76 - arg1 == local71) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local61 <= local66 && local66 <= local85 && local71 == local76 + 1 && (this.anIntArrayArray80[local66][local71] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 <= local66 && local85 >= local66 && local76 - arg1 == local71 && (this.anIntArrayArray80[local66][local91] & 0x2C0102) == 0) {
					return true;
				}
				if (local61 == local66 - arg1 && local71 <= local76 && local76 <= local91 && (this.anIntArrayArray80[local85][local76] & 0x2C0108) == 0) {
					return true;
				}
				if (local61 == local66 + 1 && local76 >= local71 && local76 <= local91 && (this.anIntArrayArray80[local61][local76] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBIIIIII)Z")
	public boolean method6547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static134.method1997(arg1, arg4, arg6, arg5, arg0, arg3, arg2, arg1) ? true : this.method6561(arg1, arg3, arg0, arg6, arg2, arg4, arg1, arg7, arg5);
		}
		@Pc(43) int local43 = arg6 + arg4 - 1;
		@Pc(49) int local49 = arg2 + arg0 - 1;
		if (arg3 >= arg4 && local43 >= arg3 && arg5 >= arg0 && arg5 <= local49) {
			return true;
		} else if (arg4 - 1 == arg3 && arg0 <= arg5 && local49 >= arg5 && (this.anIntArrayArray80[arg3 - this.anInt7938][arg5 - this.anInt7934] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (local43 + 1 == arg3 && arg0 <= arg5 && local49 >= arg5 && (this.anIntArrayArray80[arg3 - this.anInt7938][arg5 - this.anInt7934] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg5 && arg4 <= arg3 && local43 >= arg3 && (this.anIntArrayArray80[arg3 - this.anInt7938][arg5 - this.anInt7934] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local49 + 1 && arg4 <= arg3 && arg3 <= local43 && (this.anIntArrayArray80[arg3 - this.anInt7938][arg5 - this.anInt7934] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZIIIIII)V")
	public void method6548(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = 256;
		if (arg0) {
			local15 = 131328;
		}
		@Pc(29) int local29;
		if (arg4 == 1 || arg4 == 3) {
			local29 = arg6;
			arg6 = arg3;
			arg3 = local29;
		}
		@Pc(38) int local38 = arg2 - this.anInt7934;
		if (arg1) {
			local15 |= 0x40000000;
		}
		@Pc(49) int local49 = arg5 - this.anInt7938;
		for (local29 = local49; local29 < arg6 + local49; local29++) {
			if (local29 >= 0 && local29 < this.anInt7940) {
				for (@Pc(61) int local61 = local38; local61 < arg3 + local38; local61++) {
					if (local61 >= 0 && local61 < this.anInt7932) {
						this.method6560(local29, local61, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V")
	public void method6549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt7934;
		@Pc(17) int local17 = arg1 - this.anInt7938;
		this.anIntArrayArray80[local17][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
	public void method6550() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7940; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt7932; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt7940 - 5 || this.anInt7932 - 5 <= local7) {
					this.anIntArrayArray80[local3][local7] = -1;
				} else {
					this.anIntArrayArray80[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIZIIZ)V")
	public void method6551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) int local11 = 256;
		if (arg3) {
			local11 = 131328;
		}
		@Pc(22) int local22 = arg0 - this.anInt7934;
		@Pc(27) int local27 = arg4 - this.anInt7938;
		if (arg5) {
			local11 |= 0x40000000;
		}
		for (@Pc(35) int local35 = local27; local35 < arg1 + local27; local35++) {
			if (local35 >= 0 && local35 < this.anInt7940) {
				for (@Pc(52) int local52 = local22; local52 < local22 + arg2; local52++) {
					if (local52 >= 0 && local52 < this.anInt7932) {
						this.method6552(local52, local35, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
	private void method6552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray80[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)V")
	public void method6555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7938;
		@Pc(9) int local9 = arg0 - this.anInt7934;
		this.anIntArrayArray80[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BII)V")
	public void method6556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7934;
		@Pc(17) int local17 = arg0 - this.anInt7938;
		this.anIntArrayArray80[local17][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)V")
	public void method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt7934;
		@Pc(13) int local13 = arg1 - this.anInt7938;
		this.anIntArrayArray80[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method6559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg3 == arg5 && arg6 == arg1) {
				return true;
			}
		} else if (arg5 <= arg3 && arg2 + arg5 - 1 >= arg3 && arg1 >= arg1 && arg1 <= arg2 + arg1 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg5 - this.anInt7938;
		@Pc(64) int local64 = arg6 - this.anInt7934;
		@Pc(69) int local69 = arg3 - this.anInt7938;
		@Pc(74) int local74 = arg1 - this.anInt7934;
		if (arg2 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local59 == local69 + 1 && local64 == local74 && (this.anIntArrayArray80[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local59 == local69 && local64 == local74 - 1 && (this.anIntArrayArray80[local59][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 == local69 - 1 && local64 == local74 && (this.anIntArrayArray80[local59][local64] & 0x8) == 0) {
						return true;
					}
					if (local69 == local59 && local74 - 1 == local64 && (this.anIntArrayArray80[local59][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 == local69 - 1 && local64 == local74 && (this.anIntArrayArray80[local59][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 == local69 && local74 + 1 == local64 && (this.anIntArrayArray80[local59][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local69 + 1 == local59 && local74 == local64 && (this.anIntArrayArray80[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local69 == local59 && local74 + 1 == local64 && (this.anIntArrayArray80[local59][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local69 == local59 && local64 == local74 + 1 && (this.anIntArrayArray80[local59][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 == local59 && local74 - 1 == local64 && (this.anIntArrayArray80[local59][local64] & 0x2) == 0) {
					return true;
				}
				if (local59 == local69 - 1 && local64 == local74 && (this.anIntArrayArray80[local59][local64] & 0x8) == 0) {
					return true;
				}
				if (local59 == local69 + 1 && local64 == local74 && (this.anIntArrayArray80[local59][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(411) int local411 = local59 + arg2 - 1;
			@Pc(417) int local417 = arg2 + local64 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local59 == local69 + 1 && local64 <= local74 && local417 >= local74 && (this.anIntArrayArray80[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local69 && local411 >= local69 && local74 - arg2 == local64 && (this.anIntArrayArray80[local69][local417] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local69 - arg2 == local59 && local64 <= local74 && local74 <= local417 && (this.anIntArrayArray80[local411][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local411 && local74 - arg2 == local64 && (this.anIntArrayArray80[local69][local417] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 == local69 - arg2 && local64 <= local74 && local74 <= local417 && (this.anIntArrayArray80[local411][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local69 && local411 >= local69 && local64 == local74 + 1 && (this.anIntArrayArray80[local69][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local69 + 1 == local59 && local64 <= local74 && local74 <= local417 && (this.anIntArrayArray80[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local411 && local64 == local74 + 1 && (this.anIntArrayArray80[local69][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local69 >= local59 && local411 >= local69 && local74 + 1 == local64 && (this.anIntArrayArray80[local69][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 >= local59 && local69 <= local411 && local74 - arg2 == local64 && (this.anIntArrayArray80[local69][local417] & 0x2) == 0) {
					return true;
				}
				if (local69 - arg2 == local59 && local64 <= local74 && local74 <= local417 && (this.anIntArrayArray80[local411][local74] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local59 && local64 <= local74 && local417 >= local74 && (this.anIntArrayArray80[local59][local74] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)V")
	private void method6560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray80[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIBI)Z")
	public boolean method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 + arg1;
		@Pc(13) int local13 = arg8 + arg0;
		@Pc(29) int local29 = arg5 + arg3;
		@Pc(33) int local33 = arg4 + arg2;
		@Pc(65) int local65;
		@Pc(76) int local76;
		if (arg1 == local29 && (arg7 & 0x2) == 0) {
			local65 = arg2 >= arg8 ? arg2 : arg8;
			local76 = local13 < local33 ? local13 : local33;
			while (local65 < local76) {
				if ((this.anIntArrayArray80[local29 - this.anInt7938 - 1][local65 - this.anInt7934] & 0x8) == 0) {
					return true;
				}
				local65++;
			}
		} else if (local9 == arg5 && (arg7 & 0x8) == 0) {
			local65 = arg2 < arg8 ? arg8 : arg2;
			local76 = local33 > local13 ? local13 : local33;
			while (local65 < local76) {
				if ((this.anIntArrayArray80[arg5 - this.anInt7938][local65 - this.anInt7934] & 0x80) == 0) {
					return true;
				}
				local65++;
			}
		} else if (arg8 == local33 && (arg7 & 0x1) == 0) {
			local65 = arg1 <= arg5 ? arg5 : arg1;
			local76 = local29 > local9 ? local9 : local29;
			while (local65 < local76) {
				if ((this.anIntArrayArray80[local65 - this.anInt7938][local33 - this.anInt7934 - 1] & 0x2) == 0) {
					return true;
				}
				local65++;
			}
		} else if (local13 == arg2 && (arg7 & 0x4) == 0) {
			local65 = arg5 >= arg1 ? arg5 : arg1;
			local76 = local29 <= local9 ? local29 : local9;
			while (local65 < local76) {
				if ((this.anIntArrayArray80[local65 - this.anInt7938][arg2 - this.anInt7934] & 0x20) == 0) {
					return true;
				}
				local65++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBIIIZZ)V")
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt7938;
		@Pc(18) int local18 = arg1 - this.anInt7934;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method6560(local4, local18, 128);
				this.method6560(local4 - 1, local18, 8);
			}
			if (arg0 == 1) {
				this.method6560(local4, local18, 2);
				this.method6560(local4, local18 + 1, 32);
			}
			if (arg0 == 2) {
				this.method6560(local4, local18, 8);
				this.method6560(local4 + 1, local18, 128);
			}
			if (arg0 == 3) {
				this.method6560(local4, local18, 32);
				this.method6560(local4, local18 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method6560(local4, local18, 1);
				this.method6560(local4 - 1, local18 + 1, 16);
			}
			if (arg0 == 1) {
				this.method6560(local4, local18, 4);
				this.method6560(local4 + 1, local18 - -1, 64);
			}
			if (arg0 == 2) {
				this.method6560(local4, local18, 16);
				this.method6560(local4 + 1, local18 + -1, 1);
			}
			if (arg0 == 3) {
				this.method6560(local4, local18, 64);
				this.method6560(local4 - 1, local18 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method6560(local4, local18, 130);
				this.method6560(local4 - 1, local18, 8);
				this.method6560(local4, local18 + 1, 32);
			}
			if (arg0 == 1) {
				this.method6560(local4, local18, 10);
				this.method6560(local4, local18 + 1, 32);
				this.method6560(local4 + 1, local18, 128);
			}
			if (arg0 == 2) {
				this.method6560(local4, local18, 40);
				this.method6560(local4 + 1, local18, 128);
				this.method6560(local4, local18 - 1, 2);
			}
			if (arg0 == 3) {
				this.method6560(local4, local18, 160);
				this.method6560(local4, local18 - 1, 2);
				this.method6560(local4 - 1, local18, 8);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method6560(local4, local18, 65536);
					this.method6560(local4 - 1, local18, 4096);
				}
				if (arg0 == 1) {
					this.method6560(local4, local18, 1024);
					this.method6560(local4, local18 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method6560(local4, local18, 4096);
					this.method6560(local4 + 1, local18, 65536);
				}
				if (arg0 == 3) {
					this.method6560(local4, local18, 16384);
					this.method6560(local4, local18 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method6560(local4, local18, 512);
					this.method6560(local4 - 1, local18 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method6560(local4, local18, 2048);
					this.method6560(local4 + 1, local18 - -1, 32768);
				}
				if (arg0 == 2) {
					this.method6560(local4, local18, 8192);
					this.method6560(local4 + 1, local18 + -1, 512);
				}
				if (arg0 == 3) {
					this.method6560(local4, local18, 32768);
					this.method6560(local4 - 1, local18 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method6560(local4, local18, 66560);
					this.method6560(local4 - 1, local18, 4096);
					this.method6560(local4, local18 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method6560(local4, local18, 5120);
					this.method6560(local4, local18 + 1, 16384);
					this.method6560(local4 + 1, local18, 65536);
				}
				if (arg0 == 2) {
					this.method6560(local4, local18, 20480);
					this.method6560(local4 + 1, local18, 65536);
					this.method6560(local4, local18 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method6560(local4, local18, 81920);
					this.method6560(local4, local18 - 1, 1024);
					this.method6560(local4 - 1, local18, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method6560(local4, local18, 536870912);
				this.method6560(local4 - 1, local18, 33554432);
			}
			if (arg0 == 1) {
				this.method6560(local4, local18, 8388608);
				this.method6560(local4, local18 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method6560(local4, local18, 33554432);
				this.method6560(local4 + 1, local18, 536870912);
			}
			if (arg0 == 3) {
				this.method6560(local4, local18, 134217728);
				this.method6560(local4, local18 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method6560(local4, local18, 4194304);
				this.method6560(local4 - 1, local18 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method6560(local4, local18, 16777216);
				this.method6560(local4 + 1, local18 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method6560(local4, local18, 67108864);
				this.method6560(local4 + 1, local18 - 1, 4194304);
			}
			if (arg0 == 3) {
				this.method6560(local4, local18, 268435456);
				this.method6560(local4 - 1, local18 + -1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method6560(local4, local18, 545259520);
			this.method6560(local4 - 1, local18, 33554432);
			this.method6560(local4, local18 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method6560(local4, local18, 41943040);
			this.method6560(local4, local18 + 1, 134217728);
			this.method6560(local4 + 1, local18, 536870912);
		}
		if (arg0 == 2) {
			this.method6560(local4, local18, 167772160);
			this.method6560(local4 + 1, local18, 536870912);
			this.method6560(local4, local18 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method6560(local4, local18, 671088640);
			this.method6560(local4, local18 - 1, 8388608);
			this.method6560(local4 - 1, local18, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZIIIIZ)V")
	public void method6564(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg0 - this.anInt7938;
		@Pc(13) int local13 = arg4 - this.anInt7934;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method6552(local13, local8, 128);
				this.method6552(local13, local8 - 1, 8);
			}
			if (arg3 == 1) {
				this.method6552(local13, local8, 2);
				this.method6552(local13 + 1, local8, 32);
			}
			if (arg3 == 2) {
				this.method6552(local13, local8, 8);
				this.method6552(local13, local8 + 1, 128);
			}
			if (arg3 == 3) {
				this.method6552(local13, local8, 32);
				this.method6552(local13 - 1, local8, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method6552(local13, local8, 1);
				this.method6552(local13 + 1, local8 - 1, 16);
			}
			if (arg3 == 1) {
				this.method6552(local13, local8, 4);
				this.method6552(local13 + 1, local8 - -1, 64);
			}
			if (arg3 == 2) {
				this.method6552(local13, local8, 16);
				this.method6552(local13 - 1, local8 + 1, 1);
			}
			if (arg3 == 3) {
				this.method6552(local13, local8, 64);
				this.method6552(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method6552(local13, local8, 130);
				this.method6552(local13, local8 - 1, 8);
				this.method6552(local13 + 1, local8, 32);
			}
			if (arg3 == 1) {
				this.method6552(local13, local8, 10);
				this.method6552(local13 + 1, local8, 32);
				this.method6552(local13, local8 + 1, 128);
			}
			if (arg3 == 2) {
				this.method6552(local13, local8, 40);
				this.method6552(local13, local8 + 1, 128);
				this.method6552(local13 - 1, local8, 2);
			}
			if (arg3 == 3) {
				this.method6552(local13, local8, 160);
				this.method6552(local13 - 1, local8, 2);
				this.method6552(local13, local8 - 1, 8);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method6552(local13, local8, 65536);
					this.method6552(local13, local8 - 1, 4096);
				}
				if (arg3 == 1) {
					this.method6552(local13, local8, 1024);
					this.method6552(local13 + 1, local8, 16384);
				}
				if (arg3 == 2) {
					this.method6552(local13, local8, 4096);
					this.method6552(local13, local8 + 1, 65536);
				}
				if (arg3 == 3) {
					this.method6552(local13, local8, 16384);
					this.method6552(local13 - 1, local8, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method6552(local13, local8, 512);
					this.method6552(local13 + 1, local8 + -1, 8192);
				}
				if (arg3 == 1) {
					this.method6552(local13, local8, 2048);
					this.method6552(local13 + 1, local8 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method6552(local13, local8, 8192);
					this.method6552(local13 - 1, local8 + 1, 512);
				}
				if (arg3 == 3) {
					this.method6552(local13, local8, 32768);
					this.method6552(local13 - 1, local8 - 1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method6552(local13, local8, 66560);
					this.method6552(local13, local8 - 1, 4096);
					this.method6552(local13 + 1, local8, 16384);
				}
				if (arg3 == 1) {
					this.method6552(local13, local8, 5120);
					this.method6552(local13 + 1, local8, 16384);
					this.method6552(local13, local8 + 1, 65536);
				}
				if (arg3 == 2) {
					this.method6552(local13, local8, 20480);
					this.method6552(local13, local8 + 1, 65536);
					this.method6552(local13 - 1, local8, 1024);
				}
				if (arg3 == 3) {
					this.method6552(local13, local8, 81920);
					this.method6552(local13 - 1, local8, 1024);
					this.method6552(local13, local8 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method6552(local13, local8, 536870912);
				this.method6552(local13, local8 - 1, 33554432);
			}
			if (arg3 == 1) {
				this.method6552(local13, local8, 8388608);
				this.method6552(local13 + 1, local8, 134217728);
			}
			if (arg3 == 2) {
				this.method6552(local13, local8, 33554432);
				this.method6552(local13, local8 + 1, 536870912);
			}
			if (arg3 == 3) {
				this.method6552(local13, local8, 134217728);
				this.method6552(local13 - 1, local8, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method6552(local13, local8, 4194304);
				this.method6552(local13 + 1, local8 + -1, 67108864);
			}
			if (arg3 == 1) {
				this.method6552(local13, local8, 16777216);
				this.method6552(local13 + 1, local8 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method6552(local13, local8, 67108864);
				this.method6552(local13 - 1, local8 + 1, 4194304);
			}
			if (arg3 == 3) {
				this.method6552(local13, local8, 268435456);
				this.method6552(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method6552(local13, local8, 545259520);
			this.method6552(local13, local8 - 1, 33554432);
			this.method6552(local13 + 1, local8, 134217728);
		}
		if (arg3 == 1) {
			this.method6552(local13, local8, 41943040);
			this.method6552(local13 + 1, local8, 134217728);
			this.method6552(local13, local8 + 1, 536870912);
		}
		if (arg3 == 2) {
			this.method6552(local13, local8, 167772160);
			this.method6552(local13, local8 + 1, 536870912);
			this.method6552(local13 - 1, local8, 8388608);
		}
		if (arg3 == 3) {
			this.method6552(local13, local8, 671088640);
			this.method6552(local13 - 1, local8, 8388608);
			this.method6552(local13, local8 - 1, 33554432);
		}
	}
}

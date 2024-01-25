import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class196 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public int anInt5901;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	public int anInt5919;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	public int anInt5923;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public void method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5923;
		@Pc(17) int local17 = arg1 - this.anInt5905;
		this.anIntArrayArray66[local4][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIBII)Z")
	public boolean method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static66.method1504(arg4, arg3, arg0, arg6, arg2, arg5, arg5, arg7) ? true : this.method5320(arg2, arg0, arg6, arg4, arg5, arg3, arg7, arg5, arg1);
		}
		@Pc(40) int local40 = arg2 + arg7 - 1;
		@Pc(46) int local46 = arg3 + arg6 - 1;
		if (arg0 >= arg7 && arg0 <= local40 && arg3 <= arg4 && local46 >= arg4) {
			return true;
		} else if (arg0 == arg7 - 1 && arg3 <= arg4 && local46 >= arg4 && (this.anIntArrayArray66[arg0 - this.anInt5923][arg4 - this.anInt5905] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local40 + 1 == arg0 && arg3 <= arg4 && arg4 <= local46 && (this.anIntArrayArray66[arg0 - this.anInt5923][arg4 - this.anInt5905] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg3 - 1 && arg0 >= arg7 && arg0 <= local40 && (this.anIntArrayArray66[arg0 - this.anInt5923][arg4 - this.anInt5905] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local46 + 1 == arg4 && arg7 <= arg0 && local40 >= arg0 && (this.anIntArrayArray66[arg0 - this.anInt5923][arg4 - this.anInt5905] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method5310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg4 && arg2 == arg6) {
				return true;
			}
		} else if (arg4 <= arg3 && arg3 <= arg4 + arg1 - 1 && arg6 >= arg6 && arg6 <= arg1 + arg6 - 1) {
			return true;
		}
		@Pc(56) int local56 = arg6 - this.anInt5905;
		@Pc(61) int local61 = arg3 - this.anInt5923;
		@Pc(66) int local66 = arg2 - this.anInt5905;
		@Pc(77) int local77 = arg4 - this.anInt5923;
		if (arg1 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local77 == local61 + 1 && local66 == local56 && (this.anIntArrayArray66[local77][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 == local77 && local66 == local56 - 1 && (this.anIntArrayArray66[local77][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local77 == local61 - 1 && local66 == local56 && (this.anIntArrayArray66[local77][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 == local77 && local56 - 1 == local66 && (this.anIntArrayArray66[local77][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local77 == local61 - 1 && local56 == local66 && (this.anIntArrayArray66[local77][local66] & 0x8) == 0) {
						return true;
					}
					if (local77 == local61 && local66 == local56 + 1 && (this.anIntArrayArray66[local77][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local77 == local61 + 1 && local56 == local66 && (this.anIntArrayArray66[local77][local66] & 0x80) == 0) {
						return true;
					}
					if (local77 == local61 && local66 == local56 + 1 && (this.anIntArrayArray66[local77][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local77 == local61 && local66 == local56 + 1 && (this.anIntArrayArray66[local77][local66] & 0x20) == 0) {
					return true;
				}
				if (local61 == local77 && local66 == local56 - 1 && (this.anIntArrayArray66[local77][local66] & 0x2) == 0) {
					return true;
				}
				if (local77 == local61 - 1 && local66 == local56 && (this.anIntArrayArray66[local77][local66] & 0x8) == 0) {
					return true;
				}
				if (local77 == local61 + 1 && local56 == local66 && (this.anIntArrayArray66[local77][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(88) int local88 = local77 + arg1 - 1;
			@Pc(94) int local94 = arg1 + local66 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local61 + 1 == local77 && local56 >= local66 && local94 >= local56 && (this.anIntArrayArray66[local77][local56] & 0x80) == 0) {
						return true;
					}
					if (local77 <= local61 && local61 <= local88 && local66 == local56 - arg1 && (this.anIntArrayArray66[local61][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local61 - arg1 == local77 && local66 <= local56 && local56 <= local94 && (this.anIntArrayArray66[local88][local56] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local77 && local88 >= local61 && local56 - arg1 == local66 && (this.anIntArrayArray66[local61][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local77 == local61 - arg1 && local66 <= local56 && local56 <= local94 && (this.anIntArrayArray66[local88][local56] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local77 && local61 <= local88 && local66 == local56 + 1 && (this.anIntArrayArray66[local61][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local77 == local61 + 1 && local56 >= local66 && local56 <= local94 && (this.anIntArrayArray66[local77][local56] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local77 && local61 <= local88 && local56 + 1 == local66 && (this.anIntArrayArray66[local61][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local61 >= local77 && local61 <= local88 && local56 + 1 == local66 && (this.anIntArrayArray66[local61][local66] & 0x20) == 0) {
					return true;
				}
				if (local77 <= local61 && local61 <= local88 && local56 - arg1 == local66 && (this.anIntArrayArray66[local61][local94] & 0x2) == 0) {
					return true;
				}
				if (local77 == local61 - arg1 && local66 <= local56 && local94 >= local56 && (this.anIntArrayArray66[local88][local56] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local77 && local66 <= local56 && local56 <= local94 && (this.anIntArrayArray66[local77][local56] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public void method5311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5905;
		@Pc(13) int local13 = arg1 - this.anInt5923;
		this.anIntArrayArray66[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg2 == arg6 && arg4 == arg5) {
				return true;
			}
		} else if (arg6 >= arg2 && arg6 <= arg3 + arg2 - 1 && arg4 >= arg4 && arg3 + arg4 - 1 >= arg4) {
			return true;
		}
		@Pc(55) int local55 = arg5 - this.anInt5905;
		@Pc(60) int local60 = arg6 - this.anInt5923;
		@Pc(65) int local65 = arg2 - this.anInt5923;
		@Pc(75) int local75 = arg4 - this.anInt5905;
		if (arg3 == 1) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local65 == local60 - 1 && local75 == local55) {
						return true;
					}
					if (local65 == local60 && local75 + 1 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local60 && local75 - 1 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local60 == local65 && local75 + 1 == local55) {
						return true;
					}
					if (local60 - 1 == local65 && local55 == local75 && (this.anIntArrayArray66[local65][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local60 + 1 && local55 == local75 && (this.anIntArrayArray66[local65][local55] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local60 + 1 && local75 == local55) {
						return true;
					}
					if (local65 == local60 && local75 + 1 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local60 && local75 - 1 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local65 == local60 && local75 - 1 == local55) {
						return true;
					}
					if (local65 == local60 - 1 && local75 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local60 + 1 && local75 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local60 - 1 == local65 && local75 == local55) {
						return true;
					}
					if (local65 == local60 && local75 + 1 == local55) {
						return true;
					}
					if (local65 == local60 + 1 && local55 == local75 && (this.anIntArrayArray66[local65][local55] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 == local65 && local55 == local75 - 1 && (this.anIntArrayArray66[local65][local55] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local65 == local60 - 1 && local55 == local75 && (this.anIntArrayArray66[local65][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local65 && local55 == local75 + 1) {
						return true;
					}
					if (local60 + 1 == local65 && local55 == local75) {
						return true;
					}
					if (local65 == local60 && local75 - 1 == local55 && (this.anIntArrayArray66[local65][local55] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 - 1 == local65 && local55 == local75 && (this.anIntArrayArray66[local65][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local65 && local55 == local75 + 1 && (this.anIntArrayArray66[local65][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local60 + 1 && local75 == local55) {
						return true;
					}
					if (local65 == local60 && local75 - 1 == local55) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local65 == local60 - 1 && local75 == local55) {
						return true;
					}
					if (local65 == local60 && local55 == local75 + 1 && (this.anIntArrayArray66[local65][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local60 + 1 && local55 == local75 && (this.anIntArrayArray66[local65][local55] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 == local60 && local75 - 1 == local55) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local60 == local65 && local55 == local75 + 1 && (this.anIntArrayArray66[local65][local55] & 0x20) == 0) {
					return true;
				}
				if (local60 == local65 && local55 == local75 - 1 && (this.anIntArrayArray66[local65][local55] & 0x2) == 0) {
					return true;
				}
				if (local65 == local60 - 1 && local75 == local55 && (this.anIntArrayArray66[local65][local55] & 0x8) == 0) {
					return true;
				}
				if (local65 == local60 + 1 && local75 == local55 && (this.anIntArrayArray66[local65][local55] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = local65 + arg3 - 1;
			@Pc(90) int local90 = arg3 + local55 - 1;
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local60 - arg3 == local65 && local75 >= local55 && local75 <= local90) {
						return true;
					}
					if (local65 <= local60 && local84 >= local60 && local75 + 1 == local55 && (this.anIntArrayArray66[local60][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 >= local65 && local84 >= local60 && local75 - arg3 == local55 && (this.anIntArrayArray66[local60][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local60 >= local65 && local60 <= local84 && local55 == local75 + 1) {
						return true;
					}
					if (local65 == local60 - arg3 && local75 >= local55 && local75 <= local90 && (this.anIntArrayArray66[local84][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local60 + 1 && local75 >= local55 && local75 <= local90 && (this.anIntArrayArray66[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local60 + 1 && local75 >= local55 && local90 >= local75) {
						return true;
					}
					if (local60 >= local65 && local84 >= local60 && local55 == local75 + 1 && (this.anIntArrayArray66[local60][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 <= local60 && local84 >= local60 && local75 - arg3 == local55 && (this.anIntArrayArray66[local60][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local65 <= local60 && local84 >= local60 && local55 == local75 - arg3) {
						return true;
					}
					if (local65 == local60 - arg3 && local55 <= local75 && local90 >= local75 && (this.anIntArrayArray66[local84][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 + 1 == local65 && local75 >= local55 && local90 >= local75 && (this.anIntArrayArray66[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local65 == local60 - arg3 && local75 >= local55 && local75 <= local90) {
						return true;
					}
					if (local65 <= local60 && local60 <= local84 && local75 + 1 == local55) {
						return true;
					}
					if (local60 + 1 == local65 && local75 >= local55 && local75 <= local90 && (this.anIntArrayArray66[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 >= local65 && local60 <= local84 && local55 == local75 - arg3 && (this.anIntArrayArray66[local60][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local60 - arg3 == local65 && local75 >= local55 && local75 <= local90 && (this.anIntArrayArray66[local84][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 <= local60 && local60 <= local84 && local55 == local75 + 1) {
						return true;
					}
					if (local60 + 1 == local65 && local75 >= local55 && local75 <= local90) {
						return true;
					}
					if (local65 <= local60 && local84 >= local60 && local55 == local75 - arg3 && (this.anIntArrayArray66[local60][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local60 - arg3 && local75 >= local55 && local90 >= local75 && (this.anIntArrayArray66[local84][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 <= local60 && local84 >= local60 && local55 == local75 + 1 && (this.anIntArrayArray66[local60][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local60 + 1 && local55 <= local75 && local90 >= local75) {
						return true;
					}
					if (local60 >= local65 && local60 <= local84 && local55 == local75 - arg3) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local60 - arg3 == local65 && local55 <= local75 && local75 <= local90) {
						return true;
					}
					if (local60 >= local65 && local60 <= local84 && local75 + 1 == local55 && (this.anIntArrayArray66[local60][local55] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 + 1 == local65 && local75 >= local55 && local75 <= local90 && (this.anIntArrayArray66[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 >= local65 && local60 <= local84 && local55 == local75 - arg3) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local65 <= local60 && local60 <= local84 && local55 == local75 + 1 && (this.anIntArrayArray66[local60][local55] & 0x2C0120) == 0) {
					return true;
				}
				if (local65 <= local60 && local84 >= local60 && local75 - arg3 == local55 && (this.anIntArrayArray66[local60][local90] & 0x2C0102) == 0) {
					return true;
				}
				if (local60 - arg3 == local65 && local55 <= local75 && local75 <= local90 && (this.anIntArrayArray66[local84][local75] & 0x2C0108) == 0) {
					return true;
				}
				if (local60 + 1 == local65 && local55 <= local75 && local90 >= local75 && (this.anIntArrayArray66[local65][local75] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIBIIZ)V")
	public void method5315(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt5923;
		@Pc(9) int local9 = arg3 - this.anInt5905;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method5324(local4, 128, local9);
				this.method5324(local4 - 1, 8, local9);
			}
			if (arg4 == 1) {
				this.method5324(local4, 2, local9);
				this.method5324(local4, 32, local9 + 1);
			}
			if (arg4 == 2) {
				this.method5324(local4, 8, local9);
				this.method5324(local4 + 1, 128, local9);
			}
			if (arg4 == 3) {
				this.method5324(local4, 32, local9);
				this.method5324(local4, 2, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method5324(local4, 1, local9);
				this.method5324(local4 - 1, 16, local9 + 1);
			}
			if (arg4 == 1) {
				this.method5324(local4, 4, local9);
				this.method5324(local4 + 1, 64, local9 + 1);
			}
			if (arg4 == 2) {
				this.method5324(local4, 16, local9);
				this.method5324(local4 + 1, 1, local9 - 1);
			}
			if (arg4 == 3) {
				this.method5324(local4, 64, local9);
				this.method5324(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method5324(local4, 130, local9);
				this.method5324(local4 - 1, 8, local9);
				this.method5324(local4, 32, local9 + 1);
			}
			if (arg4 == 1) {
				this.method5324(local4, 10, local9);
				this.method5324(local4, 32, local9 + 1);
				this.method5324(local4 + 1, 128, local9);
			}
			if (arg4 == 2) {
				this.method5324(local4, 40, local9);
				this.method5324(local4 + 1, 128, local9);
				this.method5324(local4, 2, local9 - 1);
			}
			if (arg4 == 3) {
				this.method5324(local4, 160, local9);
				this.method5324(local4, 2, local9 - 1);
				this.method5324(local4 - 1, 8, local9);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method5324(local4, 65536, local9);
					this.method5324(local4 - 1, 4096, local9);
				}
				if (arg4 == 1) {
					this.method5324(local4, 1024, local9);
					this.method5324(local4, 16384, local9 + 1);
				}
				if (arg4 == 2) {
					this.method5324(local4, 4096, local9);
					this.method5324(local4 + 1, 65536, local9);
				}
				if (arg4 == 3) {
					this.method5324(local4, 16384, local9);
					this.method5324(local4, 1024, local9 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method5324(local4, 512, local9);
					this.method5324(local4 - 1, 8192, local9 + 1);
				}
				if (arg4 == 1) {
					this.method5324(local4, 2048, local9);
					this.method5324(local4 + 1, 32768, local9 + 1);
				}
				if (arg4 == 2) {
					this.method5324(local4, 8192, local9);
					this.method5324(local4 + 1, 512, local9 - 1);
				}
				if (arg4 == 3) {
					this.method5324(local4, 32768, local9);
					this.method5324(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method5324(local4, 66560, local9);
					this.method5324(local4 - 1, 4096, local9);
					this.method5324(local4, 16384, local9 + 1);
				}
				if (arg4 == 1) {
					this.method5324(local4, 5120, local9);
					this.method5324(local4, 16384, local9 + 1);
					this.method5324(local4 + 1, 65536, local9);
				}
				if (arg4 == 2) {
					this.method5324(local4, 20480, local9);
					this.method5324(local4 + 1, 65536, local9);
					this.method5324(local4, 1024, local9 - 1);
				}
				if (arg4 == 3) {
					this.method5324(local4, 81920, local9);
					this.method5324(local4, 1024, local9 - 1);
					this.method5324(local4 - 1, 4096, local9);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method5324(local4, 536870912, local9);
				this.method5324(local4 - 1, 33554432, local9);
			}
			if (arg4 == 1) {
				this.method5324(local4, 8388608, local9);
				this.method5324(local4, 134217728, local9 + 1);
			}
			if (arg4 == 2) {
				this.method5324(local4, 33554432, local9);
				this.method5324(local4 + 1, 536870912, local9);
			}
			if (arg4 == 3) {
				this.method5324(local4, 134217728, local9);
				this.method5324(local4, 8388608, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method5324(local4, 4194304, local9);
				this.method5324(local4 - 1, 67108864, local9 + 1);
			}
			if (arg4 == 1) {
				this.method5324(local4, 16777216, local9);
				this.method5324(local4 + 1, 268435456, local9 + 1);
			}
			if (arg4 == 2) {
				this.method5324(local4, 67108864, local9);
				this.method5324(local4 + 1, 4194304, local9 - 1);
			}
			if (arg4 == 3) {
				this.method5324(local4, 268435456, local9);
				this.method5324(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5324(local4, 545259520, local9);
			this.method5324(local4 - 1, 33554432, local9);
			this.method5324(local4, 134217728, local9 + 1);
		}
		if (arg4 == 1) {
			this.method5324(local4, 41943040, local9);
			this.method5324(local4, 134217728, local9 + 1);
			this.method5324(local4 + 1, 536870912, local9);
		}
		if (arg4 == 2) {
			this.method5324(local4, 167772160, local9);
			this.method5324(local4 + 1, 536870912, local9);
			this.method5324(local4, 8388608, local9 - 1);
		}
		if (arg4 == 3) {
			this.method5324(local4, 671088640, local9);
			this.method5324(local4, 8388608, local9 - 1);
			this.method5324(local4 - 1, 33554432, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)V")
	private void method5317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray66[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg7;
		@Pc(13) int local13 = arg4 + arg3;
		@Pc(25) int local25 = arg0 + arg6;
		@Pc(29) int local29 = arg2 + arg5;
		@Pc(50) int local50;
		@Pc(57) int local57;
		if (arg1 == local25 && (arg8 & 0x2) == 0) {
			local50 = arg5 < arg3 ? arg3 : arg5;
			local57 = local13 < local29 ? local13 : local29;
			while (local50 < local57) {
				if ((this.anIntArrayArray66[local25 - this.anInt5923 - 1][local50 - this.anInt5905] & 0x8) == 0) {
					return true;
				}
				local50++;
			}
		} else if (arg6 == local9 && (arg8 & 0x8) == 0) {
			local50 = arg3 <= arg5 ? arg5 : arg3;
			local57 = local29 <= local13 ? local29 : local13;
			while (local50 < local57) {
				if ((this.anIntArrayArray66[arg6 - this.anInt5923][local50 - this.anInt5905] & 0x80) == 0) {
					return true;
				}
				local50++;
			}
		} else if (arg3 == local29 && (arg8 & 0x1) == 0) {
			local50 = arg1 <= arg6 ? arg6 : arg1;
			local57 = local9 < local25 ? local9 : local25;
			while (local57 > local50) {
				if ((this.anIntArrayArray66[local50 - this.anInt5923][local29 - this.anInt5905 - 1] & 0x2) == 0) {
					return true;
				}
				local50++;
			}
		} else if (local13 == arg5 && (arg8 & 0x4) == 0) {
			local50 = arg1 <= arg6 ? arg6 : arg1;
			local57 = local25 > local9 ? local9 : local25;
			while (local50 < local57) {
				if ((this.anIntArrayArray66[local50 - this.anInt5923][arg5 - this.anInt5905] & 0x20) == 0) {
					return true;
				}
				local50++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(III)V")
	public void method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5905;
		@Pc(9) int local9 = arg0 - this.anInt5923;
		this.anIntArrayArray66[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIBIZII)V")
	public void method5323(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(27) int local27 = arg5 - this.anInt5923;
		@Pc(32) int local32 = arg4 - this.anInt5905;
		for (@Pc(34) int local34 = local27; local34 < local27 + arg2; local34++) {
			if (local34 >= 0 && local34 < this.anInt5919) {
				for (@Pc(44) int local44 = local32; local44 < arg1 + local32; local44++) {
					if (local44 >= 0 && this.anInt5901 > local44) {
						this.method5324(local34, local7, local44);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(IIII)V")
	private void method5324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray66[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(III)V")
	public void method5325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5905;
		@Pc(13) int local13 = arg1 - this.anInt5923;
		this.anIntArrayArray66[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIZZI)V")
	public void method5326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = 256;
		if (arg2) {
			local11 = 131328;
		}
		@Pc(22) int local22 = arg6 - this.anInt5923;
		@Pc(32) int local32;
		if (arg1 == 1 || arg1 == 3) {
			local32 = arg3;
			arg3 = arg0;
			arg0 = local32;
		}
		@Pc(41) int local41 = arg4 - this.anInt5905;
		if (arg5) {
			local11 |= 0x40000000;
		}
		for (local32 = local22; local32 < local22 + arg3; local32++) {
			if (local32 >= 0 && this.anInt5919 > local32) {
				for (@Pc(63) int local63 = local41; local63 < local41 + arg0; local63++) {
					if (local63 >= 0 && local63 < this.anInt5901) {
						this.method5317(local63, local11, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	public void method5327() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5919; local7++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt5901; local17++) {
				if (local7 == 0 || local17 == 0 || this.anInt5919 - 5 <= local7 || local17 >= this.anInt5901 - 5) {
					this.anIntArrayArray66[local7][local17] = -1;
				} else {
					this.anIntArrayArray66[local7][local17] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZZIII)V")
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt5923;
		@Pc(13) int local13 = arg5 - this.anInt5905;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method5317(local13, 128, local4);
				this.method5317(local13, 8, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5317(local13, 2, local4);
				this.method5317(local13 + 1, 32, local4);
			}
			if (arg4 == 2) {
				this.method5317(local13, 8, local4);
				this.method5317(local13, 128, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5317(local13, 32, local4);
				this.method5317(local13 - 1, 2, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method5317(local13, 1, local4);
				this.method5317(local13 + 1, 16, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5317(local13, 4, local4);
				this.method5317(local13 + 1, 64, local4 + 1);
			}
			if (arg4 == 2) {
				this.method5317(local13, 16, local4);
				this.method5317(local13 - 1, 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5317(local13, 64, local4);
				this.method5317(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method5317(local13, 130, local4);
				this.method5317(local13, 8, local4 - 1);
				this.method5317(local13 + 1, 32, local4);
			}
			if (arg4 == 1) {
				this.method5317(local13, 10, local4);
				this.method5317(local13 + 1, 32, local4);
				this.method5317(local13, 128, local4 + 1);
			}
			if (arg4 == 2) {
				this.method5317(local13, 40, local4);
				this.method5317(local13, 128, local4 + 1);
				this.method5317(local13 - 1, 2, local4);
			}
			if (arg4 == 3) {
				this.method5317(local13, 160, local4);
				this.method5317(local13 - 1, 2, local4);
				this.method5317(local13, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method5317(local13, 65536, local4);
					this.method5317(local13, 4096, local4 - 1);
				}
				if (arg4 == 1) {
					this.method5317(local13, 1024, local4);
					this.method5317(local13 + 1, 16384, local4);
				}
				if (arg4 == 2) {
					this.method5317(local13, 4096, local4);
					this.method5317(local13, 65536, local4 + 1);
				}
				if (arg4 == 3) {
					this.method5317(local13, 16384, local4);
					this.method5317(local13 - 1, 1024, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method5317(local13, 512, local4);
					this.method5317(local13 + 1, 8192, local4 - 1);
				}
				if (arg4 == 1) {
					this.method5317(local13, 2048, local4);
					this.method5317(local13 + 1, 32768, local4 + 1);
				}
				if (arg4 == 2) {
					this.method5317(local13, 8192, local4);
					this.method5317(local13 - 1, 512, local4 + 1);
				}
				if (arg4 == 3) {
					this.method5317(local13, 32768, local4);
					this.method5317(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method5317(local13, 66560, local4);
					this.method5317(local13, 4096, local4 - 1);
					this.method5317(local13 + 1, 16384, local4);
				}
				if (arg4 == 1) {
					this.method5317(local13, 5120, local4);
					this.method5317(local13 + 1, 16384, local4);
					this.method5317(local13, 65536, local4 + 1);
				}
				if (arg4 == 2) {
					this.method5317(local13, 20480, local4);
					this.method5317(local13, 65536, local4 + 1);
					this.method5317(local13 - 1, 1024, local4);
				}
				if (arg4 == 3) {
					this.method5317(local13, 81920, local4);
					this.method5317(local13 - 1, 1024, local4);
					this.method5317(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method5317(local13, 536870912, local4);
				this.method5317(local13, 33554432, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5317(local13, 8388608, local4);
				this.method5317(local13 + 1, 134217728, local4);
			}
			if (arg4 == 2) {
				this.method5317(local13, 33554432, local4);
				this.method5317(local13, 536870912, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5317(local13, 134217728, local4);
				this.method5317(local13 - 1, 8388608, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method5317(local13, 4194304, local4);
				this.method5317(local13 + 1, 67108864, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5317(local13, 16777216, local4);
				this.method5317(local13 + 1, 268435456, local4 + 1);
			}
			if (arg4 == 2) {
				this.method5317(local13, 67108864, local4);
				this.method5317(local13 - 1, 4194304, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5317(local13, 268435456, local4);
				this.method5317(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5317(local13, 545259520, local4);
			this.method5317(local13, 33554432, local4 - 1);
			this.method5317(local13 + 1, 134217728, local4);
		}
		if (arg4 == 1) {
			this.method5317(local13, 41943040, local4);
			this.method5317(local13 + 1, 134217728, local4);
			this.method5317(local13, 536870912, local4 + 1);
		}
		if (arg4 == 2) {
			this.method5317(local13, 167772160, local4);
			this.method5317(local13, 536870912, local4 + 1);
			this.method5317(local13 - 1, 8388608, local4);
		}
		if (arg4 == 3) {
			this.method5317(local13, 671088640, local4);
			this.method5317(local13 - 1, 8388608, local4);
			this.method5317(local13, 33554432, local4 - 1);
		}
	}
}

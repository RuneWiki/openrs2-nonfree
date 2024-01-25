import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class37 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt1438;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public int anInt1449;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZIIIIZ)V")
	public void method1054(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt1438;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg5 - this.anInt1447;
		for (@Pc(45) int local45 = local18; local45 < local18 + arg2; local45++) {
			if (local45 >= 0 && local45 < this.anInt1449) {
				for (@Pc(62) int local62 = local29; local62 < arg4 + local29; local62++) {
					if (local62 >= 0 && this.anInt1451 > local62) {
						this.method1061(local45, local62, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg0 && arg2 == arg1) {
				return true;
			}
		} else if (arg5 >= arg0 && arg4 + arg0 - 1 >= arg5 && arg1 >= arg1 && arg4 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(51) int local51 = arg1 - this.anInt1447;
		@Pc(56) int local56 = arg5 - this.anInt1438;
		@Pc(61) int local61 = arg2 - this.anInt1447;
		@Pc(66) int local66 = arg0 - this.anInt1438;
		if (arg4 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local56 + 1 == local66 && local51 == local61 && (this.anIntArrayArray6[local66][local61] & 0x80) == 0) {
						return true;
					}
					if (local56 == local66 && local61 == local51 - 1 && (this.anIntArrayArray6[local66][local61] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local66 == local56 - 1 && local61 == local51 && (this.anIntArrayArray6[local66][local61] & 0x8) == 0) {
						return true;
					}
					if (local56 == local66 && local51 - 1 == local61 && (this.anIntArrayArray6[local66][local61] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local66 == local56 - 1 && local61 == local51 && (this.anIntArrayArray6[local66][local61] & 0x8) == 0) {
						return true;
					}
					if (local56 == local66 && local51 + 1 == local61 && (this.anIntArrayArray6[local66][local61] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local66 == local56 + 1 && local51 == local61 && (this.anIntArrayArray6[local66][local61] & 0x80) == 0) {
						return true;
					}
					if (local66 == local56 && local51 + 1 == local61 && (this.anIntArrayArray6[local66][local61] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local66 == local56 && local61 == local51 + 1 && (this.anIntArrayArray6[local66][local61] & 0x20) == 0) {
					return true;
				}
				if (local66 == local56 && local51 - 1 == local61 && (this.anIntArrayArray6[local66][local61] & 0x2) == 0) {
					return true;
				}
				if (local66 == local56 - 1 && local51 == local61 && (this.anIntArrayArray6[local66][local61] & 0x8) == 0) {
					return true;
				}
				if (local56 + 1 == local66 && local51 == local61 && (this.anIntArrayArray6[local66][local61] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(91) int local91 = local66 + arg4 - 1;
			@Pc(98) int local98 = local61 + arg4 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local66 == local56 + 1 && local51 >= local61 && local51 <= local98 && (this.anIntArrayArray6[local66][local51] & 0x80) == 0) {
						return true;
					}
					if (local66 <= local56 && local56 <= local91 && local51 - arg4 == local61 && (this.anIntArrayArray6[local56][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local66 == local56 - arg4 && local51 >= local61 && local51 <= local98 && (this.anIntArrayArray6[local91][local51] & 0x8) == 0) {
						return true;
					}
					if (local66 <= local56 && local91 >= local56 && local61 == local51 - arg4 && (this.anIntArrayArray6[local56][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local66 == local56 - arg4 && local51 >= local61 && local51 <= local98 && (this.anIntArrayArray6[local91][local51] & 0x8) == 0) {
						return true;
					}
					if (local66 <= local56 && local56 <= local91 && local51 + 1 == local61 && (this.anIntArrayArray6[local56][local61] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local56 + 1 == local66 && local61 <= local51 && local51 <= local98 && (this.anIntArrayArray6[local66][local51] & 0x80) == 0) {
						return true;
					}
					if (local56 >= local66 && local56 <= local91 && local61 == local51 + 1 && (this.anIntArrayArray6[local56][local61] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local66 <= local56 && local56 <= local91 && local61 == local51 + 1 && (this.anIntArrayArray6[local56][local61] & 0x20) == 0) {
					return true;
				}
				if (local66 <= local56 && local91 >= local56 && local61 == local51 - arg4 && (this.anIntArrayArray6[local56][local98] & 0x2) == 0) {
					return true;
				}
				if (local56 - arg4 == local66 && local51 >= local61 && local98 >= local51 && (this.anIntArrayArray6[local91][local51] & 0x8) == 0) {
					return true;
				}
				if (local66 == local56 + 1 && local61 <= local51 && local51 <= local98 && (this.anIntArrayArray6[local66][local51] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg5;
		@Pc(13) int local13 = arg0 + arg6;
		@Pc(23) int local23 = arg2 + arg1;
		@Pc(28) int local28 = arg7 + arg3;
		@Pc(59) int local59;
		@Pc(70) int local70;
		if (arg5 == local23 && (arg4 & 0x2) == 0) {
			local59 = arg7 < arg6 ? arg6 : arg7;
			local70 = local28 > local13 ? local13 : local28;
			while (local70 > local59) {
				if ((this.anIntArrayArray6[local23 - this.anInt1438 - 1][local59 - this.anInt1447] & 0x8) == 0) {
					return true;
				}
				local59++;
			}
		} else if (local9 == arg1 && (arg4 & 0x8) == 0) {
			local59 = arg7 < arg6 ? arg6 : arg7;
			local70 = local13 < local28 ? local13 : local28;
			while (local59 < local70) {
				if ((this.anIntArrayArray6[arg1 - this.anInt1438][local59 - this.anInt1447] & 0x80) == 0) {
					return true;
				}
				local59++;
			}
		} else if (arg6 == local28 && (arg4 & 0x1) == 0) {
			local59 = arg1 < arg5 ? arg5 : arg1;
			local70 = local23 <= local9 ? local23 : local9;
			while (local59 < local70) {
				if ((this.anIntArrayArray6[local59 - this.anInt1438][local28 - this.anInt1447 - 1] & 0x2) == 0) {
					return true;
				}
				local59++;
			}
		} else if (local13 == arg7 && (arg4 & 0x4) == 0) {
			local59 = arg5 <= arg1 ? arg1 : arg5;
			local70 = local9 < local23 ? local9 : local23;
			while (local59 < local70) {
				if ((this.anIntArrayArray6[local59 - this.anInt1438][arg7 - this.anInt1447] & 0x20) == 0) {
					return true;
				}
				local59++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static48.method944(arg4, arg6, arg1, arg5, arg7, arg4, arg0, arg3) ? true : this.method1056(arg4, arg5, arg1, arg6, arg2, arg0, arg3, arg7, arg4);
		}
		@Pc(41) int local41 = arg5 + arg1 - 1;
		@Pc(47) int local47 = arg6 + arg7 - 1;
		if (arg0 >= arg5 && arg0 <= local41 && arg3 >= arg7 && arg3 <= local47) {
			return true;
		} else if (arg5 - 1 == arg0 && arg3 >= arg7 && arg3 <= local47 && (this.anIntArrayArray6[arg0 - this.anInt1438][arg3 - this.anInt1447] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg0 == local41 + 1 && arg7 <= arg3 && local47 >= arg3 && (this.anIntArrayArray6[arg0 - this.anInt1438][arg3 - this.anInt1447] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg3 && arg0 >= arg5 && local41 >= arg0 && (this.anIntArrayArray6[arg0 - this.anInt1438][arg3 - this.anInt1447] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg3 && arg5 <= arg0 && arg0 <= local41 && (this.anIntArrayArray6[arg0 - this.anInt1438][arg3 - this.anInt1447] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBZIIIZ)V")
	public void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(23) int local23;
		if (arg4 == 1 || arg4 == 3) {
			local23 = arg3;
			arg3 = arg0;
			arg0 = local23;
		}
		@Pc(32) int local32 = arg5 - this.anInt1447;
		@Pc(37) int local37 = arg1 - this.anInt1438;
		if (arg2) {
			local7 |= 0x40000000;
		}
		for (local23 = local37; local23 < local37 + arg3; local23++) {
			if (local23 >= 0 && this.anInt1449 > local23) {
				for (@Pc(66) int local66 = local32; local66 < arg0 + local32; local66++) {
					if (local66 >= 0 && this.anInt1451 > local66) {
						this.method1064(local7, local23, local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg1 == arg0 && arg2 == arg4) {
				return true;
			}
		} else if (arg0 >= arg1 && arg1 + arg5 - 1 >= arg0 && arg2 >= arg2 && arg2 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(47) int local47 = arg1 - this.anInt1438;
		@Pc(52) int local52 = arg4 - this.anInt1447;
		@Pc(57) int local57 = arg0 - this.anInt1438;
		@Pc(62) int local62 = arg2 - this.anInt1447;
		if (arg5 == 1) {
			if (arg3 == 0) {
				if (arg6 == 0) {
					if (local57 - 1 == local47 && local62 == local52) {
						return true;
					}
					if (local47 == local57 && local52 == local62 + 1 && (this.anIntArrayArray6[local47][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 == local57 && local52 == local62 - 1 && (this.anIntArrayArray6[local47][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local57 == local47 && local62 + 1 == local52) {
						return true;
					}
					if (local47 == local57 - 1 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local47 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local57 + 1 == local47 && local62 == local52) {
						return true;
					}
					if (local57 == local47 && local52 == local62 + 1 && (this.anIntArrayArray6[local47][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 == local57 && local62 - 1 == local52 && (this.anIntArrayArray6[local47][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local47 == local57 && local52 == local62 - 1) {
						return true;
					}
					if (local47 == local57 - 1 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local47 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg6 == 0) {
					if (local47 == local57 - 1 && local52 == local62) {
						return true;
					}
					if (local47 == local57 && local62 + 1 == local52) {
						return true;
					}
					if (local57 + 1 == local47 && local62 == local52 && (this.anIntArrayArray6[local47][local52] & 0x2C0180) == 0) {
						return true;
					}
					if (local47 == local57 && local52 == local62 - 1 && (this.anIntArrayArray6[local47][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local57 - 1 == local47 && local62 == local52 && (this.anIntArrayArray6[local47][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local47 && local52 == local62 + 1) {
						return true;
					}
					if (local57 + 1 == local47 && local62 == local52) {
						return true;
					}
					if (local57 == local47 && local52 == local62 - 1 && (this.anIntArrayArray6[local47][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local47 == local57 - 1 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local47 == local57 && local52 == local62 + 1 && (this.anIntArrayArray6[local47][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 + 1 == local47 && local52 == local62) {
						return true;
					}
					if (local57 == local47 && local62 - 1 == local52) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local47 == local57 - 1 && local62 == local52) {
						return true;
					}
					if (local57 == local47 && local62 + 1 == local52 && (this.anIntArrayArray6[local47][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 == local57 + 1 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local47 && local52 == local62 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local57 == local47 && local62 + 1 == local52 && (this.anIntArrayArray6[local47][local52] & 0x20) == 0) {
					return true;
				}
				if (local57 == local47 && local62 - 1 == local52 && (this.anIntArrayArray6[local47][local52] & 0x2) == 0) {
					return true;
				}
				if (local57 - 1 == local47 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x8) == 0) {
					return true;
				}
				if (local47 == local57 + 1 && local52 == local62 && (this.anIntArrayArray6[local47][local52] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = local47 + arg5 - 1;
			@Pc(88) int local88 = arg5 + local52 - 1;
			if (arg3 == 0) {
				if (arg6 == 0) {
					if (local57 - arg5 == local47 && local52 <= local62 && local88 >= local62) {
						return true;
					}
					if (local57 >= local47 && local57 <= local82 && local52 == local62 + 1 && (this.anIntArrayArray6[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local52 == local62 - arg5 && (this.anIntArrayArray6[local57][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local57 >= local47 && local82 >= local57 && local52 == local62 + 1) {
						return true;
					}
					if (local47 == local57 - arg5 && local62 >= local52 && local62 <= local88 && (this.anIntArrayArray6[local82][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local47 && local62 >= local52 && local62 <= local88 && (this.anIntArrayArray6[local47][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local57 + 1 == local47 && local62 >= local52 && local88 >= local62) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local52 == local62 + 1 && (this.anIntArrayArray6[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local52 == local62 - arg5 && (this.anIntArrayArray6[local57][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local47 <= local57 && local57 <= local82 && local62 - arg5 == local52) {
						return true;
					}
					if (local47 == local57 - arg5 && local52 <= local62 && local62 <= local88 && (this.anIntArrayArray6[local82][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local47 && local52 <= local62 && local88 >= local62 && (this.anIntArrayArray6[local47][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg6 == 0) {
					if (local47 == local57 - arg5 && local62 >= local52 && local62 <= local88) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local62 + 1 == local52) {
						return true;
					}
					if (local57 + 1 == local47 && local62 >= local52 && local62 <= local88 && (this.anIntArrayArray6[local47][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local62 - arg5 == local52 && (this.anIntArrayArray6[local57][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local47 == local57 - arg5 && local62 >= local52 && local62 <= local88 && (this.anIntArrayArray6[local82][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local62 + 1 == local52) {
						return true;
					}
					if (local57 + 1 == local47 && local62 >= local52 && local88 >= local62) {
						return true;
					}
					if (local57 >= local47 && local57 <= local82 && local62 - arg5 == local52 && (this.anIntArrayArray6[local57][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local47 == local57 - arg5 && local62 >= local52 && local62 <= local88 && (this.anIntArrayArray6[local82][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 >= local47 && local57 <= local82 && local52 == local62 + 1 && (this.anIntArrayArray6[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 + 1 == local47 && local62 >= local52 && local62 <= local88) {
						return true;
					}
					if (local47 <= local57 && local82 >= local57 && local62 - arg5 == local52) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local57 - arg5 == local47 && local62 >= local52 && local88 >= local62) {
						return true;
					}
					if (local47 <= local57 && local57 <= local82 && local52 == local62 + 1 && (this.anIntArrayArray6[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 == local57 + 1 && local62 >= local52 && local88 >= local62 && (this.anIntArrayArray6[local47][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local47 <= local57 && local57 <= local82 && local52 == local62 - arg5) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local47 <= local57 && local82 >= local57 && local62 + 1 == local52 && (this.anIntArrayArray6[local57][local52] & 0x2C0120) == 0) {
					return true;
				}
				if (local47 <= local57 && local57 <= local82 && local52 == local62 - arg5 && (this.anIntArrayArray6[local57][local88] & 0x2C0102) == 0) {
					return true;
				}
				if (local57 - arg5 == local47 && local62 >= local52 && local88 >= local62 && (this.anIntArrayArray6[local82][local62] & 0x2C0108) == 0) {
					return true;
				}
				if (local57 + 1 == local47 && local52 <= local62 && local62 <= local88 && (this.anIntArrayArray6[local47][local62] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	public void method1060() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1449; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1451; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt1449 - 5 || this.anInt1451 - 5 <= local7) {
					this.anIntArrayArray6[local3][local7] = -1;
				} else {
					this.anIntArrayArray6[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZII)V")
	private void method1061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray6[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V")
	public void method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg1 - this.anInt1438;
		@Pc(24) int local24 = arg0 - this.anInt1447;
		this.anIntArrayArray6[local19][local24] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)V")
	public void method1063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt1447;
		@Pc(19) int local19 = arg0 - this.anInt1438;
		this.anIntArrayArray6[local19][local10] |= 0x40000;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V")
	private void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray6[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIB)V")
	public void method1065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1447;
		@Pc(9) int local9 = arg0 - this.anInt1438;
		this.anIntArrayArray6[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public void method1066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1447;
		@Pc(13) int local13 = arg1 - this.anInt1438;
		this.anIntArrayArray6[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBZZII)V")
	public void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt1447;
		@Pc(13) int local13 = arg5 - this.anInt1438;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method1061(local13, local8, 128);
				this.method1061(local13 - 1, local8, 8);
			}
			if (arg0 == 1) {
				this.method1061(local13, local8, 2);
				this.method1061(local13, local8 + 1, 32);
			}
			if (arg0 == 2) {
				this.method1061(local13, local8, 8);
				this.method1061(local13 + 1, local8, 128);
			}
			if (arg0 == 3) {
				this.method1061(local13, local8, 32);
				this.method1061(local13, local8 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method1061(local13, local8, 1);
				this.method1061(local13 - 1, local8 + 1, 16);
			}
			if (arg0 == 1) {
				this.method1061(local13, local8, 4);
				this.method1061(local13 + 1, local8 + 1, 64);
			}
			if (arg0 == 2) {
				this.method1061(local13, local8, 16);
				this.method1061(local13 + 1, local8 + -1, 1);
			}
			if (arg0 == 3) {
				this.method1061(local13, local8, 64);
				this.method1061(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method1061(local13, local8, 130);
				this.method1061(local13 - 1, local8, 8);
				this.method1061(local13, local8 + 1, 32);
			}
			if (arg0 == 1) {
				this.method1061(local13, local8, 10);
				this.method1061(local13, local8 + 1, 32);
				this.method1061(local13 + 1, local8, 128);
			}
			if (arg0 == 2) {
				this.method1061(local13, local8, 40);
				this.method1061(local13 + 1, local8, 128);
				this.method1061(local13, local8 - 1, 2);
			}
			if (arg0 == 3) {
				this.method1061(local13, local8, 160);
				this.method1061(local13, local8 - 1, 2);
				this.method1061(local13 - 1, local8, 8);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method1061(local13, local8, 65536);
					this.method1061(local13 - 1, local8, 4096);
				}
				if (arg0 == 1) {
					this.method1061(local13, local8, 1024);
					this.method1061(local13, local8 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method1061(local13, local8, 4096);
					this.method1061(local13 + 1, local8, 65536);
				}
				if (arg0 == 3) {
					this.method1061(local13, local8, 16384);
					this.method1061(local13, local8 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method1061(local13, local8, 512);
					this.method1061(local13 - 1, local8 - -1, 8192);
				}
				if (arg0 == 1) {
					this.method1061(local13, local8, 2048);
					this.method1061(local13 + 1, local8 - -1, 32768);
				}
				if (arg0 == 2) {
					this.method1061(local13, local8, 8192);
					this.method1061(local13 + 1, local8 - 1, 512);
				}
				if (arg0 == 3) {
					this.method1061(local13, local8, 32768);
					this.method1061(local13 - 1, local8 + -1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method1061(local13, local8, 66560);
					this.method1061(local13 - 1, local8, 4096);
					this.method1061(local13, local8 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method1061(local13, local8, 5120);
					this.method1061(local13, local8 + 1, 16384);
					this.method1061(local13 + 1, local8, 65536);
				}
				if (arg0 == 2) {
					this.method1061(local13, local8, 20480);
					this.method1061(local13 + 1, local8, 65536);
					this.method1061(local13, local8 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method1061(local13, local8, 81920);
					this.method1061(local13, local8 - 1, 1024);
					this.method1061(local13 - 1, local8, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method1061(local13, local8, 536870912);
				this.method1061(local13 - 1, local8, 33554432);
			}
			if (arg0 == 1) {
				this.method1061(local13, local8, 8388608);
				this.method1061(local13, local8 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method1061(local13, local8, 33554432);
				this.method1061(local13 + 1, local8, 536870912);
			}
			if (arg0 == 3) {
				this.method1061(local13, local8, 134217728);
				this.method1061(local13, local8 - 1, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method1061(local13, local8, 4194304);
				this.method1061(local13 - 1, local8 - -1, 67108864);
			}
			if (arg0 == 1) {
				this.method1061(local13, local8, 16777216);
				this.method1061(local13 + 1, local8 - -1, 268435456);
			}
			if (arg0 == 2) {
				this.method1061(local13, local8, 67108864);
				this.method1061(local13 + 1, local8 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method1061(local13, local8, 268435456);
				this.method1061(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1061(local13, local8, 545259520);
			this.method1061(local13 - 1, local8, 33554432);
			this.method1061(local13, local8 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method1061(local13, local8, 41943040);
			this.method1061(local13, local8 + 1, 134217728);
			this.method1061(local13 + 1, local8, 536870912);
		}
		if (arg0 == 2) {
			this.method1061(local13, local8, 167772160);
			this.method1061(local13 + 1, local8, 536870912);
			this.method1061(local13, local8 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method1061(local13, local8, 671088640);
			this.method1061(local13, local8 - 1, 8388608);
			this.method1061(local13 - 1, local8, 33554432);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIZIZI)V")
	public void method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt1447;
		@Pc(15) int local15 = arg1 - this.anInt1438;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1064(128, local15, local4);
				this.method1064(8, local15 - 1, local4);
			}
			if (arg0 == 1) {
				this.method1064(2, local15, local4);
				this.method1064(32, local15, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1064(8, local15, local4);
				this.method1064(128, local15 + 1, local4);
			}
			if (arg0 == 3) {
				this.method1064(32, local15, local4);
				this.method1064(2, local15, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1064(1, local15, local4);
				this.method1064(16, local15 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1064(4, local15, local4);
				this.method1064(64, local15 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1064(16, local15, local4);
				this.method1064(1, local15 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method1064(64, local15, local4);
				this.method1064(4, local15 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method1064(130, local15, local4);
				this.method1064(8, local15 - 1, local4);
				this.method1064(32, local15, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1064(10, local15, local4);
				this.method1064(32, local15, local4 + 1);
				this.method1064(128, local15 + 1, local4);
			}
			if (arg0 == 2) {
				this.method1064(40, local15, local4);
				this.method1064(128, local15 + 1, local4);
				this.method1064(2, local15, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1064(160, local15, local4);
				this.method1064(2, local15, local4 - 1);
				this.method1064(8, local15 - 1, local4);
			}
		}
		if (arg3) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method1064(65536, local15, local4);
					this.method1064(4096, local15 - 1, local4);
				}
				if (arg0 == 1) {
					this.method1064(1024, local15, local4);
					this.method1064(16384, local15, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1064(4096, local15, local4);
					this.method1064(65536, local15 + 1, local4);
				}
				if (arg0 == 3) {
					this.method1064(16384, local15, local4);
					this.method1064(1024, local15, local4 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method1064(512, local15, local4);
					this.method1064(8192, local15 - 1, local4 - -1);
				}
				if (arg0 == 1) {
					this.method1064(2048, local15, local4);
					this.method1064(32768, local15 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1064(8192, local15, local4);
					this.method1064(512, local15 + 1, local4 - 1);
				}
				if (arg0 == 3) {
					this.method1064(32768, local15, local4);
					this.method1064(2048, local15 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method1064(66560, local15, local4);
					this.method1064(4096, local15 - 1, local4);
					this.method1064(16384, local15, local4 + 1);
				}
				if (arg0 == 1) {
					this.method1064(5120, local15, local4);
					this.method1064(16384, local15, local4 + 1);
					this.method1064(65536, local15 + 1, local4);
				}
				if (arg0 == 2) {
					this.method1064(20480, local15, local4);
					this.method1064(65536, local15 + 1, local4);
					this.method1064(1024, local15, local4 - 1);
				}
				if (arg0 == 3) {
					this.method1064(81920, local15, local4);
					this.method1064(1024, local15, local4 - 1);
					this.method1064(4096, local15 - 1, local4);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1064(536870912, local15, local4);
				this.method1064(33554432, local15 - 1, local4);
			}
			if (arg0 == 1) {
				this.method1064(8388608, local15, local4);
				this.method1064(134217728, local15, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1064(33554432, local15, local4);
				this.method1064(536870912, local15 + 1, local4);
			}
			if (arg0 == 3) {
				this.method1064(134217728, local15, local4);
				this.method1064(8388608, local15, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1064(4194304, local15, local4);
				this.method1064(67108864, local15 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1064(16777216, local15, local4);
				this.method1064(268435456, local15 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1064(67108864, local15, local4);
				this.method1064(4194304, local15 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method1064(268435456, local15, local4);
				this.method1064(16777216, local15 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1064(545259520, local15, local4);
			this.method1064(33554432, local15 - 1, local4);
			this.method1064(134217728, local15, local4 + 1);
		}
		if (arg0 == 1) {
			this.method1064(41943040, local15, local4);
			this.method1064(134217728, local15, local4 + 1);
			this.method1064(536870912, local15 + 1, local4);
		}
		if (arg0 == 2) {
			this.method1064(167772160, local15, local4);
			this.method1064(536870912, local15 + 1, local4);
			this.method1064(8388608, local15, local4 - 1);
		}
		if (arg0 == 3) {
			this.method1064(671088640, local15, local4);
			this.method1064(8388608, local15, local4 - 1);
			this.method1064(33554432, local15 - 1, local4);
			return;
		}
	}
}

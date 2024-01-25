import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class29 {

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	public int anInt1062;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBIIIIIII)Z")
	public boolean method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg5 + arg4;
		@Pc(16) int local16 = arg6 + arg3;
		@Pc(20) int local20 = arg0 + arg8;
		@Pc(24) int local24 = arg2 + arg7;
		@Pc(56) int local56;
		@Pc(63) int local63;
		if (local20 == arg4 && (arg1 & 0x2) == 0) {
			local56 = arg6 > arg7 ? arg6 : arg7;
			local63 = local16 >= local24 ? local24 : local16;
			while (local63 > local56) {
				if ((this.anIntArrayArray8[local20 - this.anInt1055 - 1][local56 - this.anInt1062] & 0x8) == 0) {
					return true;
				}
				local56++;
			}
		} else if (arg0 == local12 && (arg1 & 0x8) == 0) {
			local56 = arg6 <= arg7 ? arg7 : arg6;
			local63 = local24 > local16 ? local16 : local24;
			while (local56 < local63) {
				if ((this.anIntArrayArray8[arg0 - this.anInt1055][local56 - this.anInt1062] & 0x80) == 0) {
					return true;
				}
				local56++;
			}
		} else if (arg6 == local24 && (arg1 & 0x1) == 0) {
			local56 = arg4 > arg0 ? arg4 : arg0;
			local63 = local12 < local20 ? local12 : local20;
			while (local63 > local56) {
				if ((this.anIntArrayArray8[local56 - this.anInt1055][local24 - this.anInt1062 - 1] & 0x2) == 0) {
					return true;
				}
				local56++;
			}
		} else if (local16 == arg7 && (arg1 & 0x4) == 0) {
			local56 = arg0 < arg4 ? arg4 : arg0;
			local63 = local20 > local12 ? local12 : local20;
			while (local63 > local56) {
				if ((this.anIntArrayArray8[local56 - this.anInt1055][arg7 - this.anInt1062] & 0x20) == 0) {
					return true;
				}
				local56++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)V")
	public void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1062;
		@Pc(22) int local22 = arg0 - this.anInt1055;
		this.anIntArrayArray8[local22][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	public void method746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1055;
		@Pc(9) int local9 = arg1 - this.anInt1062;
		this.anIntArrayArray8[local4][local9] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg6 == arg5 && arg3 == arg2) {
				return true;
			}
		} else if (arg6 >= arg5 && arg1 + arg5 - 1 >= arg6 && arg2 <= arg2 && arg2 <= arg2 + arg1 - 1) {
			return true;
		}
		@Pc(56) int local56 = arg3 - this.anInt1062;
		@Pc(61) int local61 = arg6 - this.anInt1055;
		@Pc(66) int local66 = arg2 - this.anInt1062;
		@Pc(71) int local71 = arg5 - this.anInt1055;
		if (arg1 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local61 + 1 == local71 && local66 == local56 && (this.anIntArrayArray8[local71][local56] & 0x80) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local56 && (this.anIntArrayArray8[local71][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local61 - 1 == local71 && local66 == local56 && (this.anIntArrayArray8[local71][local56] & 0x8) == 0) {
						return true;
					}
					if (local71 == local61 && local66 - 1 == local56 && (this.anIntArrayArray8[local71][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local71 == local61 - 1 && local56 == local66 && (this.anIntArrayArray8[local71][local56] & 0x8) == 0) {
						return true;
					}
					if (local71 == local61 && local56 == local66 + 1 && (this.anIntArrayArray8[local71][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local71 == local61 + 1 && local56 == local66 && (this.anIntArrayArray8[local71][local56] & 0x80) == 0) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local56 && (this.anIntArrayArray8[local71][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local61 == local71 && local66 + 1 == local56 && (this.anIntArrayArray8[local71][local56] & 0x20) == 0) {
					return true;
				}
				if (local71 == local61 && local66 - 1 == local56 && (this.anIntArrayArray8[local71][local56] & 0x2) == 0) {
					return true;
				}
				if (local71 == local61 - 1 && local56 == local66 && (this.anIntArrayArray8[local71][local56] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local66 == local56 && (this.anIntArrayArray8[local71][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = local71 + arg1 - 1;
			@Pc(88) int local88 = local56 + arg1 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local71 == local61 + 1 && local56 <= local66 && local88 >= local66 && (this.anIntArrayArray8[local71][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local82 && local66 - arg1 == local56 && (this.anIntArrayArray8[local61][local88] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local61 - arg1 == local71 && local66 >= local56 && local88 >= local66 && (this.anIntArrayArray8[local82][local66] & 0x8) == 0) {
						return true;
					}
					if (local71 <= local61 && local82 >= local61 && local56 == local66 - arg1 && (this.anIntArrayArray8[local61][local88] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 - arg1 == local71 && local56 <= local66 && local88 >= local66 && (this.anIntArrayArray8[local82][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local71 && local82 >= local61 && local66 + 1 == local56 && (this.anIntArrayArray8[local61][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local61 + 1 == local71 && local56 <= local66 && local88 >= local66 && (this.anIntArrayArray8[local71][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local82 && local66 + 1 == local56 && (this.anIntArrayArray8[local61][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local61 >= local71 && local61 <= local82 && local66 + 1 == local56 && (this.anIntArrayArray8[local61][local56] & 0x20) == 0) {
					return true;
				}
				if (local71 <= local61 && local82 >= local61 && local56 == local66 - arg1 && (this.anIntArrayArray8[local61][local88] & 0x2) == 0) {
					return true;
				}
				if (local71 == local61 - arg1 && local66 >= local56 && local88 >= local66 && (this.anIntArrayArray8[local82][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local56 <= local66 && local66 <= local88 && (this.anIntArrayArray8[local71][local66] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg4 == arg1 && arg2 == arg6) {
				return true;
			}
		} else if (arg4 <= arg1 && arg3 + arg4 - 1 >= arg1 && arg6 >= arg6 && arg6 + arg3 - 1 >= arg6) {
			return true;
		}
		@Pc(58) int local58 = arg6 - this.anInt1062;
		@Pc(63) int local63 = arg4 - this.anInt1055;
		@Pc(68) int local68 = arg2 - this.anInt1062;
		@Pc(73) int local73 = arg1 - this.anInt1055;
		if (arg3 == 1) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local63 == local73 - 1 && local68 == local58) {
						return true;
					}
					if (local63 == local73 && local58 + 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local63 && local58 - 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local73 == local63 && local58 + 1 == local68) {
						return true;
					}
					if (local73 - 1 == local63 && local58 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local63 && local68 == local58 && (this.anIntArrayArray8[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 == local73 + 1 && local58 == local68) {
						return true;
					}
					if (local63 == local73 && local58 + 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local73 && local68 == local58 - 1 && (this.anIntArrayArray8[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local73 == local63 && local58 - 1 == local68) {
						return true;
					}
					if (local63 == local73 - 1 && local68 == local58 && (this.anIntArrayArray8[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local63 && local68 == local58 && (this.anIntArrayArray8[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local63 == local73 - 1 && local68 == local58) {
						return true;
					}
					if (local63 == local73 && local68 == local58 + 1) {
						return true;
					}
					if (local73 + 1 == local63 && local68 == local58 && (this.anIntArrayArray8[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 == local73 && local58 - 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local63 == local73 - 1 && local58 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local73 && local68 == local58 + 1) {
						return true;
					}
					if (local73 + 1 == local63 && local68 == local58) {
						return true;
					}
					if (local63 == local73 && local58 - 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local73 - 1 == local63 && local68 == local58 && (this.anIntArrayArray8[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local63 && local68 == local58 + 1 && (this.anIntArrayArray8[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 + 1 == local63 && local58 == local68) {
						return true;
					}
					if (local73 == local63 && local68 == local58 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local73 - 1 == local63 && local68 == local58) {
						return true;
					}
					if (local73 == local63 && local68 == local58 + 1 && (this.anIntArrayArray8[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 + 1 == local63 && local58 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 == local73 && local58 - 1 == local68) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local63 == local73 && local58 + 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x20) == 0) {
					return true;
				}
				if (local73 == local63 && local58 - 1 == local68 && (this.anIntArrayArray8[local63][local68] & 0x2) == 0) {
					return true;
				}
				if (local63 == local73 - 1 && local58 == local68 && (this.anIntArrayArray8[local63][local68] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local63 && local58 == local68 && (this.anIntArrayArray8[local63][local68] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(786) int local786 = arg3 + local63 - 1;
			@Pc(792) int local792 = arg3 + local68 - 1;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local73 - arg3 == local63 && local68 <= local58 && local792 >= local58) {
						return true;
					}
					if (local63 <= local73 && local73 <= local786 && local68 == local58 + 1 && (this.anIntArrayArray8[local73][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 <= local73 && local73 <= local786 && local58 - arg3 == local68 && (this.anIntArrayArray8[local73][local792] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local63 <= local73 && local73 <= local786 && local58 + 1 == local68) {
						return true;
					}
					if (local63 == local73 - arg3 && local68 <= local58 && local792 >= local58 && (this.anIntArrayArray8[local786][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local63 && local58 >= local68 && local58 <= local792 && (this.anIntArrayArray8[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 == local73 + 1 && local58 >= local68 && local792 >= local58) {
						return true;
					}
					if (local73 >= local63 && local73 <= local786 && local58 + 1 == local68 && (this.anIntArrayArray8[local73][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 >= local63 && local786 >= local73 && local68 == local58 - arg3 && (this.anIntArrayArray8[local73][local792] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local73 >= local63 && local786 >= local73 && local58 - arg3 == local68) {
						return true;
					}
					if (local73 - arg3 == local63 && local58 >= local68 && local58 <= local792 && (this.anIntArrayArray8[local786][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local63 && local58 >= local68 && local58 <= local792 && (this.anIntArrayArray8[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local73 - arg3 == local63 && local58 >= local68 && local792 >= local58) {
						return true;
					}
					if (local73 >= local63 && local73 <= local786 && local68 == local58 + 1) {
						return true;
					}
					if (local63 == local73 + 1 && local58 >= local68 && local58 <= local792 && (this.anIntArrayArray8[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 <= local73 && local786 >= local73 && local58 - arg3 == local68 && (this.anIntArrayArray8[local73][local792] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local73 - arg3 == local63 && local68 <= local58 && local58 <= local792 && (this.anIntArrayArray8[local786][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 >= local63 && local786 >= local73 && local68 == local58 + 1) {
						return true;
					}
					if (local73 + 1 == local63 && local68 <= local58 && local58 <= local792) {
						return true;
					}
					if (local73 >= local63 && local786 >= local73 && local58 - arg3 == local68 && (this.anIntArrayArray8[local73][local792] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 == local73 - arg3 && local68 <= local58 && local792 >= local58 && (this.anIntArrayArray8[local786][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 >= local63 && local73 <= local786 && local58 + 1 == local68 && (this.anIntArrayArray8[local73][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local73 + 1 && local68 <= local58 && local792 >= local58) {
						return true;
					}
					if (local73 >= local63 && local786 >= local73 && local68 == local58 - arg3) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local73 - arg3 == local63 && local68 <= local58 && local58 <= local792) {
						return true;
					}
					if (local73 >= local63 && local73 <= local786 && local58 + 1 == local68 && (this.anIntArrayArray8[local73][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local73 + 1 && local58 >= local68 && local792 >= local58 && (this.anIntArrayArray8[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 >= local63 && local786 >= local73 && local58 - arg3 == local68) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local63 <= local73 && local786 >= local73 && local68 == local58 + 1 && (this.anIntArrayArray8[local73][local68] & 0x2C0120) == 0) {
					return true;
				}
				if (local63 <= local73 && local73 <= local786 && local58 - arg3 == local68 && (this.anIntArrayArray8[local73][local792] & 0x2C0102) == 0) {
					return true;
				}
				if (local63 == local73 - arg3 && local68 <= local58 && local792 >= local58 && (this.anIntArrayArray8[local786][local58] & 0x2C0108) == 0) {
					return true;
				}
				if (local63 == local73 + 1 && local68 <= local58 && local58 <= local792 && (this.anIntArrayArray8[local63][local58] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIZIZZ)V")
	public void method749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt1062;
		@Pc(13) int local13 = arg1 - this.anInt1055;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method753(128, local4, local13);
				this.method753(8, local4, local13 - 1);
			}
			if (arg0 == 1) {
				this.method753(2, local4, local13);
				this.method753(32, local4 + 1, local13);
			}
			if (arg0 == 2) {
				this.method753(8, local4, local13);
				this.method753(128, local4, local13 + 1);
			}
			if (arg0 == 3) {
				this.method753(32, local4, local13);
				this.method753(2, local4 - 1, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method753(1, local4, local13);
				this.method753(16, local4 + 1, local13 + -1);
			}
			if (arg0 == 1) {
				this.method753(4, local4, local13);
				this.method753(64, local4 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method753(16, local4, local13);
				this.method753(1, local4 - 1, local13 - -1);
			}
			if (arg0 == 3) {
				this.method753(64, local4, local13);
				this.method753(4, local4 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method753(130, local4, local13);
				this.method753(8, local4, local13 - 1);
				this.method753(32, local4 + 1, local13);
			}
			if (arg0 == 1) {
				this.method753(10, local4, local13);
				this.method753(32, local4 + 1, local13);
				this.method753(128, local4, local13 + 1);
			}
			if (arg0 == 2) {
				this.method753(40, local4, local13);
				this.method753(128, local4, local13 + 1);
				this.method753(2, local4 - 1, local13);
			}
			if (arg0 == 3) {
				this.method753(160, local4, local13);
				this.method753(2, local4 - 1, local13);
				this.method753(8, local4, local13 - 1);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method753(65536, local4, local13);
					this.method753(4096, local4, local13 - 1);
				}
				if (arg0 == 1) {
					this.method753(1024, local4, local13);
					this.method753(16384, local4 + 1, local13);
				}
				if (arg0 == 2) {
					this.method753(4096, local4, local13);
					this.method753(65536, local4, local13 + 1);
				}
				if (arg0 == 3) {
					this.method753(16384, local4, local13);
					this.method753(1024, local4 - 1, local13);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method753(512, local4, local13);
					this.method753(8192, local4 + 1, local13 + -1);
				}
				if (arg0 == 1) {
					this.method753(2048, local4, local13);
					this.method753(32768, local4 + 1, local13 - -1);
				}
				if (arg0 == 2) {
					this.method753(8192, local4, local13);
					this.method753(512, local4 - 1, local13 + 1);
				}
				if (arg0 == 3) {
					this.method753(32768, local4, local13);
					this.method753(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method753(66560, local4, local13);
					this.method753(4096, local4, local13 - 1);
					this.method753(16384, local4 + 1, local13);
				}
				if (arg0 == 1) {
					this.method753(5120, local4, local13);
					this.method753(16384, local4 + 1, local13);
					this.method753(65536, local4, local13 + 1);
				}
				if (arg0 == 2) {
					this.method753(20480, local4, local13);
					this.method753(65536, local4, local13 + 1);
					this.method753(1024, local4 - 1, local13);
				}
				if (arg0 == 3) {
					this.method753(81920, local4, local13);
					this.method753(1024, local4 - 1, local13);
					this.method753(4096, local4, local13 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method753(536870912, local4, local13);
				this.method753(33554432, local4, local13 - 1);
			}
			if (arg0 == 1) {
				this.method753(8388608, local4, local13);
				this.method753(134217728, local4 + 1, local13);
			}
			if (arg0 == 2) {
				this.method753(33554432, local4, local13);
				this.method753(536870912, local4, local13 + 1);
			}
			if (arg0 == 3) {
				this.method753(134217728, local4, local13);
				this.method753(8388608, local4 - 1, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method753(4194304, local4, local13);
				this.method753(67108864, local4 + 1, local13 - 1);
			}
			if (arg0 == 1) {
				this.method753(16777216, local4, local13);
				this.method753(268435456, local4 + 1, local13 - -1);
			}
			if (arg0 == 2) {
				this.method753(67108864, local4, local13);
				this.method753(4194304, local4 - 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method753(268435456, local4, local13);
				this.method753(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method753(545259520, local4, local13);
			this.method753(33554432, local4, local13 - 1);
			this.method753(134217728, local4 + 1, local13);
		}
		if (arg0 == 1) {
			this.method753(41943040, local4, local13);
			this.method753(134217728, local4 + 1, local13);
			this.method753(536870912, local4, local13 + 1);
		}
		if (arg0 == 2) {
			this.method753(167772160, local4, local13);
			this.method753(536870912, local4, local13 + 1);
			this.method753(8388608, local4 - 1, local13);
		}
		if (arg0 == 3) {
			this.method753(671088640, local4, local13);
			this.method753(8388608, local4 - 1, local13);
			this.method753(33554432, local4, local13 - 1);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIZZ)V")
	public void method750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1062;
		@Pc(9) int local9 = arg0 - this.anInt1055;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method755(128, local4, local9);
				this.method755(8, local4, local9 - 1);
			}
			if (arg3 == 1) {
				this.method755(2, local4, local9);
				this.method755(32, local4 + 1, local9);
			}
			if (arg3 == 2) {
				this.method755(8, local4, local9);
				this.method755(128, local4, local9 + 1);
			}
			if (arg3 == 3) {
				this.method755(32, local4, local9);
				this.method755(2, local4 - 1, local9);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method755(1, local4, local9);
				this.method755(16, local4 + 1, local9 + -1);
			}
			if (arg3 == 1) {
				this.method755(4, local4, local9);
				this.method755(64, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method755(16, local4, local9);
				this.method755(1, local4 - 1, local9 - -1);
			}
			if (arg3 == 3) {
				this.method755(64, local4, local9);
				this.method755(4, local4 - 1, local9 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method755(130, local4, local9);
				this.method755(8, local4, local9 - 1);
				this.method755(32, local4 + 1, local9);
			}
			if (arg3 == 1) {
				this.method755(10, local4, local9);
				this.method755(32, local4 + 1, local9);
				this.method755(128, local4, local9 + 1);
			}
			if (arg3 == 2) {
				this.method755(40, local4, local9);
				this.method755(128, local4, local9 + 1);
				this.method755(2, local4 - 1, local9);
			}
			if (arg3 == 3) {
				this.method755(160, local4, local9);
				this.method755(2, local4 - 1, local9);
				this.method755(8, local4, local9 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method755(65536, local4, local9);
					this.method755(4096, local4, local9 - 1);
				}
				if (arg3 == 1) {
					this.method755(1024, local4, local9);
					this.method755(16384, local4 + 1, local9);
				}
				if (arg3 == 2) {
					this.method755(4096, local4, local9);
					this.method755(65536, local4, local9 + 1);
				}
				if (arg3 == 3) {
					this.method755(16384, local4, local9);
					this.method755(1024, local4 - 1, local9);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method755(512, local4, local9);
					this.method755(8192, local4 + 1, local9 + -1);
				}
				if (arg3 == 1) {
					this.method755(2048, local4, local9);
					this.method755(32768, local4 + 1, local9 + 1);
				}
				if (arg3 == 2) {
					this.method755(8192, local4, local9);
					this.method755(512, local4 - 1, local9 + 1);
				}
				if (arg3 == 3) {
					this.method755(32768, local4, local9);
					this.method755(2048, local4 - 1, local9 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method755(66560, local4, local9);
					this.method755(4096, local4, local9 - 1);
					this.method755(16384, local4 + 1, local9);
				}
				if (arg3 == 1) {
					this.method755(5120, local4, local9);
					this.method755(16384, local4 + 1, local9);
					this.method755(65536, local4, local9 + 1);
				}
				if (arg3 == 2) {
					this.method755(20480, local4, local9);
					this.method755(65536, local4, local9 + 1);
					this.method755(1024, local4 - 1, local9);
				}
				if (arg3 == 3) {
					this.method755(81920, local4, local9);
					this.method755(1024, local4 - 1, local9);
					this.method755(4096, local4, local9 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method755(536870912, local4, local9);
				this.method755(33554432, local4, local9 - 1);
			}
			if (arg3 == 1) {
				this.method755(8388608, local4, local9);
				this.method755(134217728, local4 + 1, local9);
			}
			if (arg3 == 2) {
				this.method755(33554432, local4, local9);
				this.method755(536870912, local4, local9 + 1);
			}
			if (arg3 == 3) {
				this.method755(134217728, local4, local9);
				this.method755(8388608, local4 - 1, local9);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method755(4194304, local4, local9);
				this.method755(67108864, local4 + 1, local9 + -1);
			}
			if (arg3 == 1) {
				this.method755(16777216, local4, local9);
				this.method755(268435456, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method755(67108864, local4, local9);
				this.method755(4194304, local4 - 1, local9 + 1);
			}
			if (arg3 == 3) {
				this.method755(268435456, local4, local9);
				this.method755(16777216, local4 - 1, local9 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method755(545259520, local4, local9);
			this.method755(33554432, local4, local9 - 1);
			this.method755(134217728, local4 + 1, local9);
		}
		if (arg3 == 1) {
			this.method755(41943040, local4, local9);
			this.method755(134217728, local4 + 1, local9);
			this.method755(536870912, local4, local9 + 1);
		}
		if (arg3 == 2) {
			this.method755(167772160, local4, local9);
			this.method755(536870912, local4, local9 + 1);
			this.method755(8388608, local4 - 1, local9);
		}
		if (arg3 == 3) {
			this.method755(671088640, local4, local9);
			this.method755(8388608, local4 - 1, local9);
			this.method755(33554432, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method751() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1050; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1047; local4++) {
				if (local1 == 0 || local4 == 0 || local1 >= this.anInt1050 - 5 || this.anInt1047 - 5 <= local4) {
					this.anIntArrayArray8[local1][local4] = -1;
				} else {
					this.anIntArrayArray8[local1][local4] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V")
	public void method752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1062;
		@Pc(13) int local13 = arg0 - this.anInt1055;
		this.anIntArrayArray8[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)V")
	private void method753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray8[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIII)V")
	private void method755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray8[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZZIIIIBI)V")
	public void method756(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg1) {
			local5 = 131328;
		}
		@Pc(21) int local21;
		if (arg2 == 1 || arg2 == 3) {
			local21 = arg4;
			arg4 = arg5;
			arg5 = local21;
		}
		if (arg0) {
			local5 |= 0x40000000;
		}
		@Pc(41) int local41 = arg3 - this.anInt1055;
		@Pc(46) int local46 = arg6 - this.anInt1062;
		for (local21 = local41; local21 < arg4 + local41; local21++) {
			if (local21 >= 0 && this.anInt1050 > local21) {
				for (@Pc(61) int local61 = local46; local61 < arg5 + local46; local61++) {
					if (local61 >= 0 && this.anInt1047 > local61) {
						this.method755(local5, local61, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static225.method3377(arg1, arg1, arg0, arg6, arg5, arg3, arg7, arg4) ? true : this.method744(arg7, arg2, arg6, arg1, arg0, arg1, arg4, arg3, arg5);
		}
		@Pc(40) int local40 = arg7 + arg5 - 1;
		@Pc(46) int local46 = arg3 + arg6 - 1;
		if (arg0 >= arg7 && arg0 <= local40 && arg4 >= arg3 && arg4 <= local46) {
			return true;
		} else if (arg7 - 1 == arg0 && arg3 <= arg4 && local46 >= arg4 && (this.anIntArrayArray8[arg0 - this.anInt1055][arg4 - this.anInt1062] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg0 == local40 + 1 && arg3 <= arg4 && local46 >= arg4 && (this.anIntArrayArray8[arg0 - this.anInt1055][arg4 - this.anInt1062] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg3 - 1 && arg7 <= arg0 && arg0 <= local40 && (this.anIntArrayArray8[arg0 - this.anInt1055][arg4 - this.anInt1062] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local46 + 1 && arg0 >= arg7 && arg0 <= local40 && (this.anIntArrayArray8[arg0 - this.anInt1055][arg4 - this.anInt1062] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(III)V")
	public void method758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1055;
		@Pc(13) int local13 = arg0 - this.anInt1062;
		this.anIntArrayArray8[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZZIIIZI)V")
	public void method759(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg4) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg3 - this.anInt1062;
		@Pc(21) int local21 = arg5 - this.anInt1055;
		if (arg0) {
			local5 |= 0x40000000;
		}
		for (@Pc(29) int local29 = local21; local29 < local21 + arg2; local29++) {
			if (local29 >= 0 && this.anInt1050 > local29) {
				for (@Pc(47) int local47 = local16; local47 < local16 + arg1; local47++) {
					if (local47 >= 0 && local47 < this.anInt1047) {
						this.method753(local5, local47, local29);
					}
				}
			}
		}
	}
}

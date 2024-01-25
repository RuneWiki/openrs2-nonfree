import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class243 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public int anInt7169;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray95;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
	public int anInt7176;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	public int anInt7190;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)V")
	private void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray95[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)V")
	private void method6460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray95[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method6461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg3 && arg1 == arg6) {
				return true;
			}
		} else if (arg4 <= arg3 && arg3 <= arg5 + arg4 - 1 && arg1 <= arg1 && arg1 + arg5 - 1 >= arg1) {
			return true;
		}
		@Pc(60) int local60 = arg4 - this.anInt7190;
		@Pc(71) int local71 = arg1 - this.anInt7169;
		@Pc(76) int local76 = arg6 - this.anInt7169;
		@Pc(81) int local81 = arg3 - this.anInt7190;
		if (arg5 == 1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local60 == local81 - 1 && local76 == local71) {
						return true;
					}
					if (local81 == local60 && local71 + 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local81 && local71 - 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local60 == local81 && local71 + 1 == local76) {
						return true;
					}
					if (local81 - 1 == local60 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local81 + 1 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local81 + 1 == local60 && local71 == local76) {
						return true;
					}
					if (local60 == local81 && local71 + 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local81 && local71 - 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local60 == local81 && local71 - 1 == local76) {
						return true;
					}
					if (local60 == local81 - 1 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local81 + 1 && local71 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local81 - 1 == local60 && local71 == local76) {
						return true;
					}
					if (local60 == local81 && local76 == local71 + 1) {
						return true;
					}
					if (local60 == local81 + 1 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 == local81 && local76 == local71 - 1 && (this.anIntArrayArray95[local60][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local81 - 1 == local60 && local71 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local60 && local76 == local71 + 1) {
						return true;
					}
					if (local60 == local81 + 1 && local71 == local76) {
						return true;
					}
					if (local81 == local60 && local76 == local71 - 1 && (this.anIntArrayArray95[local60][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local81 - 1 == local60 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local60 && local71 + 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local81 + 1 && local71 == local76) {
						return true;
					}
					if (local60 == local81 && local76 == local71 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local81 - 1 == local60 && local76 == local71) {
						return true;
					}
					if (local81 == local60 && local71 + 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local81 + 1 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local81 == local60 && local76 == local71 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local60 == local81 && local71 + 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x20) == 0) {
					return true;
				}
				if (local60 == local81 && local71 - 1 == local76 && (this.anIntArrayArray95[local60][local76] & 0x2) == 0) {
					return true;
				}
				if (local81 - 1 == local60 && local71 == local76 && (this.anIntArrayArray95[local60][local76] & 0x8) == 0) {
					return true;
				}
				if (local81 + 1 == local60 && local76 == local71 && (this.anIntArrayArray95[local60][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(785) int local785 = arg5 + local60 - 1;
			@Pc(791) int local791 = arg5 + local76 - 1;
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local60 == local81 - arg5 && local76 <= local71 && local71 <= local791) {
						return true;
					}
					if (local60 <= local81 && local81 <= local785 && local76 == local71 + 1 && (this.anIntArrayArray95[local81][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 >= local60 && local81 <= local785 && local76 == local71 - arg5 && (this.anIntArrayArray95[local81][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local60 <= local81 && local81 <= local785 && local71 + 1 == local76) {
						return true;
					}
					if (local60 == local81 - arg5 && local76 <= local71 && local71 <= local791 && (this.anIntArrayArray95[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local81 + 1 && local71 >= local76 && local791 >= local71 && (this.anIntArrayArray95[local60][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local60 == local81 + 1 && local76 <= local71 && local791 >= local71) {
						return true;
					}
					if (local60 <= local81 && local785 >= local81 && local71 + 1 == local76 && (this.anIntArrayArray95[local81][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 <= local81 && local81 <= local785 && local76 == local71 - arg5 && (this.anIntArrayArray95[local81][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local60 <= local81 && local81 <= local785 && local71 - arg5 == local76) {
						return true;
					}
					if (local60 == local81 - arg5 && local76 <= local71 && local791 >= local71 && (this.anIntArrayArray95[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 + 1 == local60 && local71 >= local76 && local791 >= local71 && (this.anIntArrayArray95[local60][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local81 - arg5 == local60 && local76 <= local71 && local71 <= local791) {
						return true;
					}
					if (local60 <= local81 && local785 >= local81 && local76 == local71 + 1) {
						return true;
					}
					if (local81 + 1 == local60 && local76 <= local71 && local791 >= local71 && (this.anIntArrayArray95[local60][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 <= local81 && local81 <= local785 && local76 == local71 - arg5 && (this.anIntArrayArray95[local81][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local81 - arg5 == local60 && local76 <= local71 && local791 >= local71 && (this.anIntArrayArray95[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 <= local81 && local81 <= local785 && local76 == local71 + 1) {
						return true;
					}
					if (local81 + 1 == local60 && local76 <= local71 && local71 <= local791) {
						return true;
					}
					if (local81 >= local60 && local81 <= local785 && local71 - arg5 == local76 && (this.anIntArrayArray95[local81][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local81 - arg5 == local60 && local76 <= local71 && local71 <= local791 && (this.anIntArrayArray95[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 >= local60 && local81 <= local785 && local71 + 1 == local76 && (this.anIntArrayArray95[local81][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local81 + 1 && local71 >= local76 && local71 <= local791) {
						return true;
					}
					if (local60 <= local81 && local785 >= local81 && local71 - arg5 == local76) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local81 - arg5 == local60 && local76 <= local71 && local71 <= local791) {
						return true;
					}
					if (local60 <= local81 && local81 <= local785 && local76 == local71 + 1 && (this.anIntArrayArray95[local81][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 + 1 == local60 && local71 >= local76 && local71 <= local791 && (this.anIntArrayArray95[local60][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local81 >= local60 && local785 >= local81 && local76 == local71 - arg5) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local81 >= local60 && local81 <= local785 && local71 + 1 == local76 && (this.anIntArrayArray95[local81][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local60 <= local81 && local81 <= local785 && local71 - arg5 == local76 && (this.anIntArrayArray95[local81][local791] & 0x2C0102) == 0) {
					return true;
				}
				if (local81 - arg5 == local60 && local76 <= local71 && local71 <= local791 && (this.anIntArrayArray95[local785][local71] & 0x2C0108) == 0) {
					return true;
				}
				if (local60 == local81 + 1 && local76 <= local71 && local791 >= local71 && (this.anIntArrayArray95[local60][local71] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method6463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg1 == arg3 && arg6 == arg2) {
				return true;
			}
		} else if (arg3 <= arg1 && arg5 + arg3 - 1 >= arg1 && arg6 <= arg6 && arg5 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(55) int local55 = arg2 - this.anInt7169;
		@Pc(60) int local60 = arg3 - this.anInt7190;
		@Pc(65) int local65 = arg1 - this.anInt7190;
		@Pc(70) int local70 = arg6 - this.anInt7169;
		if (arg5 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local60 == local65 + 1 && local55 == local70 && (this.anIntArrayArray95[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 == local65 && local55 == local70 - 1 && (this.anIntArrayArray95[local60][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local65 - 1 == local60 && local70 == local55 && (this.anIntArrayArray95[local60][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 == local65 && local70 - 1 == local55 && (this.anIntArrayArray95[local60][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local65 - 1 == local60 && local55 == local70 && (this.anIntArrayArray95[local60][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 == local65 && local55 == local70 + 1 && (this.anIntArrayArray95[local60][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local65 + 1 == local60 && local70 == local55 && (this.anIntArrayArray95[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local65 == local60 && local55 == local70 + 1 && (this.anIntArrayArray95[local60][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local60 == local65 && local55 == local70 + 1 && (this.anIntArrayArray95[local60][local55] & 0x20) == 0) {
					return true;
				}
				if (local65 == local60 && local70 - 1 == local55 && (this.anIntArrayArray95[local60][local55] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local60 && local70 == local55 && (this.anIntArrayArray95[local60][local55] & 0x8) == 0) {
					return true;
				}
				if (local60 == local65 + 1 && local70 == local55 && (this.anIntArrayArray95[local60][local55] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(403) int local403 = arg5 + local60 - 1;
			@Pc(409) int local409 = arg5 + local55 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local65 + 1 == local60 && local55 <= local70 && local409 >= local70 && (this.anIntArrayArray95[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local60 && local403 >= local65 && local55 == local70 - arg5 && (this.anIntArrayArray95[local65][local409] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local60 == local65 - arg5 && local55 <= local70 && local409 >= local70 && (this.anIntArrayArray95[local403][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local60 && local65 <= local403 && local55 == local70 - arg5 && (this.anIntArrayArray95[local65][local409] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local60 == local65 - arg5 && local70 >= local55 && local70 <= local409 && (this.anIntArrayArray95[local403][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local60 && local65 <= local403 && local55 == local70 + 1 && (this.anIntArrayArray95[local65][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local65 + 1 == local60 && local70 >= local55 && local409 >= local70 && (this.anIntArrayArray95[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local60 && local403 >= local65 && local55 == local70 + 1 && (this.anIntArrayArray95[local65][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local60 <= local65 && local65 <= local403 && local70 + 1 == local55 && (this.anIntArrayArray95[local65][local55] & 0x20) == 0) {
					return true;
				}
				if (local65 >= local60 && local403 >= local65 && local70 - arg5 == local55 && (this.anIntArrayArray95[local65][local409] & 0x2) == 0) {
					return true;
				}
				if (local60 == local65 - arg5 && local55 <= local70 && local70 <= local409 && (this.anIntArrayArray95[local403][local70] & 0x8) == 0) {
					return true;
				}
				if (local60 == local65 + 1 && local55 <= local70 && local409 >= local70 && (this.anIntArrayArray95[local60][local70] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method6464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static116.method2268(arg3, arg0, arg4, arg1, arg2, arg6, arg0, arg5) ? true : this.method6465(arg7, arg5, arg2, arg4, arg6, arg0, arg0, arg1, arg3);
		}
		@Pc(43) int local43 = arg5 + arg4 - 1;
		@Pc(49) int local49 = arg2 + arg3 - 1;
		if (arg4 <= arg1 && local43 >= arg1 && arg6 >= arg2 && arg6 <= local49) {
			return true;
		} else if (arg4 - 1 == arg1 && arg2 <= arg6 && local49 >= arg6 && (this.anIntArrayArray95[arg1 - this.anInt7190][arg6 - this.anInt7169] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg1 == local43 + 1 && arg2 <= arg6 && arg6 <= local49 && (this.anIntArrayArray95[arg1 - this.anInt7190][arg6 - this.anInt7169] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg2 - 1 && arg4 <= arg1 && local43 >= arg1 && (this.anIntArrayArray95[arg1 - this.anInt7190][arg6 - this.anInt7169] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local49 + 1 && arg4 <= arg1 && arg1 <= local43 && (this.anIntArrayArray95[arg1 - this.anInt7190][arg6 - this.anInt7169] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method6465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 + arg7;
		@Pc(13) int local13 = arg4 + arg5;
		@Pc(17) int local17 = arg3 + arg1;
		@Pc(21) int local21 = arg8 + arg2;
		@Pc(86) int local86;
		@Pc(97) int local97;
		if (local17 == arg7 && (arg0 & 0x2) == 0) {
			local86 = arg4 <= arg2 ? arg2 : arg4;
			local97 = local21 > local13 ? local13 : local21;
			while (local86 < local97) {
				if ((this.anIntArrayArray95[local17 - this.anInt7190 - 1][local86 - this.anInt7169] & 0x8) == 0) {
					return true;
				}
				local86++;
			}
		} else if (local9 == arg3 && (arg0 & 0x8) == 0) {
			local86 = arg2 < arg4 ? arg4 : arg2;
			local97 = local21 > local13 ? local13 : local21;
			while (local86 < local97) {
				if ((this.anIntArrayArray95[arg3 - this.anInt7190][local86 - this.anInt7169] & 0x80) == 0) {
					return true;
				}
				local86++;
			}
		} else if (arg4 == local21 && (arg0 & 0x1) == 0) {
			local86 = arg3 >= arg7 ? arg3 : arg7;
			local97 = local17 > local9 ? local9 : local17;
			while (local86 < local97) {
				if ((this.anIntArrayArray95[local86 - this.anInt7190][local21 - this.anInt7169 - 1] & 0x2) == 0) {
					return true;
				}
				local86++;
			}
		} else if (arg2 == local13 && (arg0 & 0x4) == 0) {
			local86 = arg3 < arg7 ? arg7 : arg3;
			local97 = local9 >= local17 ? local17 : local9;
			while (local86 < local97) {
				if ((this.anIntArrayArray95[local86 - this.anInt7190][arg2 - this.anInt7169] & 0x20) == 0) {
					return true;
				}
				local86++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)V")
	public void method6466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt7190;
		@Pc(19) int local19 = arg1 - this.anInt7169;
		this.anIntArrayArray95[local14][local19] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIBZIIZ)V")
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt7190;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg1 - this.anInt7169;
		for (@Pc(31) int local31 = local18; local31 < arg0 + local18; local31++) {
			if (local31 >= 0 && local31 < this.anInt7176) {
				for (@Pc(45) int local45 = local29; local45 < local29 + arg3; local45++) {
					if (local45 >= 0 && local45 < this.anInt7173) {
						this.method6460(local7, local45, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V")
	public void method6468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7169;
		@Pc(9) int local9 = arg0 - this.anInt7190;
		this.anIntArrayArray95[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZIIIBZ)V")
	public void method6470(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt7169;
		@Pc(23) int local23 = arg3 - this.anInt7190;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method6458(128, local23, local4);
				this.method6458(8, local23 - 1, local4);
			}
			if (arg0 == 1) {
				this.method6458(2, local23, local4);
				this.method6458(32, local23, local4 + 1);
			}
			if (arg0 == 2) {
				this.method6458(8, local23, local4);
				this.method6458(128, local23 + 1, local4);
			}
			if (arg0 == 3) {
				this.method6458(32, local23, local4);
				this.method6458(2, local23, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method6458(1, local23, local4);
				this.method6458(16, local23 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method6458(4, local23, local4);
				this.method6458(64, local23 + 1, local4 - -1);
			}
			if (arg0 == 2) {
				this.method6458(16, local23, local4);
				this.method6458(1, local23 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method6458(64, local23, local4);
				this.method6458(4, local23 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method6458(130, local23, local4);
				this.method6458(8, local23 - 1, local4);
				this.method6458(32, local23, local4 + 1);
			}
			if (arg0 == 1) {
				this.method6458(10, local23, local4);
				this.method6458(32, local23, local4 + 1);
				this.method6458(128, local23 + 1, local4);
			}
			if (arg0 == 2) {
				this.method6458(40, local23, local4);
				this.method6458(128, local23 + 1, local4);
				this.method6458(2, local23, local4 - 1);
			}
			if (arg0 == 3) {
				this.method6458(160, local23, local4);
				this.method6458(2, local23, local4 - 1);
				this.method6458(8, local23 - 1, local4);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method6458(65536, local23, local4);
					this.method6458(4096, local23 - 1, local4);
				}
				if (arg0 == 1) {
					this.method6458(1024, local23, local4);
					this.method6458(16384, local23, local4 + 1);
				}
				if (arg0 == 2) {
					this.method6458(4096, local23, local4);
					this.method6458(65536, local23 + 1, local4);
				}
				if (arg0 == 3) {
					this.method6458(16384, local23, local4);
					this.method6458(1024, local23, local4 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method6458(512, local23, local4);
					this.method6458(8192, local23 - 1, local4 + 1);
				}
				if (arg0 == 1) {
					this.method6458(2048, local23, local4);
					this.method6458(32768, local23 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method6458(8192, local23, local4);
					this.method6458(512, local23 + 1, local4 + -1);
				}
				if (arg0 == 3) {
					this.method6458(32768, local23, local4);
					this.method6458(2048, local23 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method6458(66560, local23, local4);
					this.method6458(4096, local23 - 1, local4);
					this.method6458(16384, local23, local4 + 1);
				}
				if (arg0 == 1) {
					this.method6458(5120, local23, local4);
					this.method6458(16384, local23, local4 + 1);
					this.method6458(65536, local23 + 1, local4);
				}
				if (arg0 == 2) {
					this.method6458(20480, local23, local4);
					this.method6458(65536, local23 + 1, local4);
					this.method6458(1024, local23, local4 - 1);
				}
				if (arg0 == 3) {
					this.method6458(81920, local23, local4);
					this.method6458(1024, local23, local4 - 1);
					this.method6458(4096, local23 - 1, local4);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method6458(536870912, local23, local4);
				this.method6458(33554432, local23 - 1, local4);
			}
			if (arg0 == 1) {
				this.method6458(8388608, local23, local4);
				this.method6458(134217728, local23, local4 + 1);
			}
			if (arg0 == 2) {
				this.method6458(33554432, local23, local4);
				this.method6458(536870912, local23 + 1, local4);
			}
			if (arg0 == 3) {
				this.method6458(134217728, local23, local4);
				this.method6458(8388608, local23, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method6458(4194304, local23, local4);
				this.method6458(67108864, local23 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method6458(16777216, local23, local4);
				this.method6458(268435456, local23 + 1, local4 - -1);
			}
			if (arg0 == 2) {
				this.method6458(67108864, local23, local4);
				this.method6458(4194304, local23 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method6458(268435456, local23, local4);
				this.method6458(16777216, local23 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method6458(545259520, local23, local4);
			this.method6458(33554432, local23 - 1, local4);
			this.method6458(134217728, local23, local4 + 1);
		}
		if (arg0 == 1) {
			this.method6458(41943040, local23, local4);
			this.method6458(134217728, local23, local4 + 1);
			this.method6458(536870912, local23 + 1, local4);
		}
		if (arg0 == 2) {
			this.method6458(167772160, local23, local4);
			this.method6458(536870912, local23 + 1, local4);
			this.method6458(8388608, local23, local4 - 1);
		}
		if (arg0 == 3) {
			this.method6458(671088640, local23, local4);
			this.method6458(8388608, local23, local4 - 1);
			this.method6458(33554432, local23 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	public void method6471() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt7176; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt7173; local16++) {
				if (local12 == 0 || local16 == 0 || local12 >= this.anInt7176 - 5 || this.anInt7173 - 5 <= local16) {
					this.anIntArrayArray95[local12][local16] = -1;
				} else {
					this.anIntArrayArray95[local12][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIBZIII)V")
	public void method6473(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt7169;
		@Pc(13) int local13 = arg1 - this.anInt7190;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method6460(128, local4, local13);
				this.method6460(8, local4, local13 - 1);
			}
			if (arg4 == 1) {
				this.method6460(2, local4, local13);
				this.method6460(32, local4 + 1, local13);
			}
			if (arg4 == 2) {
				this.method6460(8, local4, local13);
				this.method6460(128, local4, local13 + 1);
			}
			if (arg4 == 3) {
				this.method6460(32, local4, local13);
				this.method6460(2, local4 - 1, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method6460(1, local4, local13);
				this.method6460(16, local4 + 1, local13 + -1);
			}
			if (arg4 == 1) {
				this.method6460(4, local4, local13);
				this.method6460(64, local4 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method6460(16, local4, local13);
				this.method6460(1, local4 - 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method6460(64, local4, local13);
				this.method6460(4, local4 - 1, local13 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method6460(130, local4, local13);
				this.method6460(8, local4, local13 - 1);
				this.method6460(32, local4 + 1, local13);
			}
			if (arg4 == 1) {
				this.method6460(10, local4, local13);
				this.method6460(32, local4 + 1, local13);
				this.method6460(128, local4, local13 + 1);
			}
			if (arg4 == 2) {
				this.method6460(40, local4, local13);
				this.method6460(128, local4, local13 + 1);
				this.method6460(2, local4 - 1, local13);
			}
			if (arg4 == 3) {
				this.method6460(160, local4, local13);
				this.method6460(2, local4 - 1, local13);
				this.method6460(8, local4, local13 - 1);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method6460(65536, local4, local13);
					this.method6460(4096, local4, local13 - 1);
				}
				if (arg4 == 1) {
					this.method6460(1024, local4, local13);
					this.method6460(16384, local4 + 1, local13);
				}
				if (arg4 == 2) {
					this.method6460(4096, local4, local13);
					this.method6460(65536, local4, local13 + 1);
				}
				if (arg4 == 3) {
					this.method6460(16384, local4, local13);
					this.method6460(1024, local4 - 1, local13);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method6460(512, local4, local13);
					this.method6460(8192, local4 + 1, local13 + -1);
				}
				if (arg4 == 1) {
					this.method6460(2048, local4, local13);
					this.method6460(32768, local4 + 1, local13 + 1);
				}
				if (arg4 == 2) {
					this.method6460(8192, local4, local13);
					this.method6460(512, local4 - 1, local13 + 1);
				}
				if (arg4 == 3) {
					this.method6460(32768, local4, local13);
					this.method6460(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method6460(66560, local4, local13);
					this.method6460(4096, local4, local13 - 1);
					this.method6460(16384, local4 + 1, local13);
				}
				if (arg4 == 1) {
					this.method6460(5120, local4, local13);
					this.method6460(16384, local4 + 1, local13);
					this.method6460(65536, local4, local13 + 1);
				}
				if (arg4 == 2) {
					this.method6460(20480, local4, local13);
					this.method6460(65536, local4, local13 + 1);
					this.method6460(1024, local4 - 1, local13);
				}
				if (arg4 == 3) {
					this.method6460(81920, local4, local13);
					this.method6460(1024, local4 - 1, local13);
					this.method6460(4096, local4, local13 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method6460(536870912, local4, local13);
				this.method6460(33554432, local4, local13 - 1);
			}
			if (arg4 == 1) {
				this.method6460(8388608, local4, local13);
				this.method6460(134217728, local4 + 1, local13);
			}
			if (arg4 == 2) {
				this.method6460(33554432, local4, local13);
				this.method6460(536870912, local4, local13 + 1);
			}
			if (arg4 == 3) {
				this.method6460(134217728, local4, local13);
				this.method6460(8388608, local4 - 1, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method6460(4194304, local4, local13);
				this.method6460(67108864, local4 + 1, local13 + -1);
			}
			if (arg4 == 1) {
				this.method6460(16777216, local4, local13);
				this.method6460(268435456, local4 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method6460(67108864, local4, local13);
				this.method6460(4194304, local4 - 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method6460(268435456, local4, local13);
				this.method6460(16777216, local4 - 1, local13 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method6460(545259520, local4, local13);
			this.method6460(33554432, local4, local13 - 1);
			this.method6460(134217728, local4 + 1, local13);
		}
		if (arg4 == 1) {
			this.method6460(41943040, local4, local13);
			this.method6460(134217728, local4 + 1, local13);
			this.method6460(536870912, local4, local13 + 1);
		}
		if (arg4 == 2) {
			this.method6460(167772160, local4, local13);
			this.method6460(536870912, local4, local13 + 1);
			this.method6460(8388608, local4 - 1, local13);
		}
		if (arg4 == 3) {
			this.method6460(671088640, local4, local13);
			this.method6460(8388608, local4 - 1, local13);
			this.method6460(33554432, local4, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)V")
	public void method6474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt7169;
		@Pc(17) int local17 = arg0 - this.anInt7190;
		this.anIntArrayArray95[local17][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)V")
	public void method6475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt7190;
		@Pc(17) int local17 = arg1 - this.anInt7169;
		this.anIntArrayArray95[local8][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZIZIII)V")
	public void method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt7190;
		@Pc(23) int local23 = arg6 - this.anInt7169;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(39) int local39;
		if (arg3 == 1 || arg3 == 3) {
			local39 = arg0;
			arg0 = arg5;
			arg5 = local39;
		}
		for (local39 = local18; local39 < arg0 + local18; local39++) {
			if (local39 >= 0 && local39 < this.anInt7176) {
				for (@Pc(66) int local66 = local23; local66 < arg5 + local23; local66++) {
					if (local66 >= 0 && this.anInt7173 > local66) {
						this.method6458(local7, local39, local66);
					}
				}
			}
		}
	}
}

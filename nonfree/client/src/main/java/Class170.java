import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class170 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public int anInt5332;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public int anInt5336;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public int anInt5337;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	public int anInt5341;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray143;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg4 && arg3 == arg1) {
				return true;
			}
		} else if (arg5 <= arg4 && arg4 <= arg5 + arg6 - 1 && arg1 >= arg1 && arg1 <= arg6 + arg1 - 1) {
			return true;
		}
		@Pc(65) int local65 = arg4 - this.anInt5336;
		@Pc(70) int local70 = arg3 - this.anInt5341;
		@Pc(75) int local75 = arg5 - this.anInt5336;
		@Pc(80) int local80 = arg1 - this.anInt5341;
		if (arg6 == 1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local75 == local65 - 1 && local80 == local70) {
						return true;
					}
					if (local65 == local75 && local80 + 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 && local80 - 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local65 == local75 && local80 + 1 == local70) {
						return true;
					}
					if (local65 - 1 == local75 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local65 + 1 == local75 && local70 == local80) {
						return true;
					}
					if (local65 == local75 && local80 + 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local75 && local80 - 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local75 == local65 && local80 - 1 == local70) {
						return true;
					}
					if (local65 - 1 == local75 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local65 - 1 == local75 && local70 == local80) {
						return true;
					}
					if (local65 == local75 && local80 + 1 == local70) {
						return true;
					}
					if (local65 + 1 == local75 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 == local75 && local70 == local80 - 1 && (this.anIntArrayArray143[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local75 == local65 - 1 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local80 + 1) {
						return true;
					}
					if (local75 == local65 + 1 && local70 == local80) {
						return true;
					}
					if (local65 == local75 && local80 - 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local75 == local65 - 1 && local70 == local80 && (this.anIntArrayArray143[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local80 + 1 && (this.anIntArrayArray143[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local70 == local80) {
						return true;
					}
					if (local65 == local75 && local80 - 1 == local70) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local75 == local65 - 1 && local80 == local70) {
						return true;
					}
					if (local65 == local75 && local70 == local80 + 1 && (this.anIntArrayArray143[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local70 == local80 && (this.anIntArrayArray143[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 == local75 && local80 - 1 == local70) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local65 == local75 && local80 + 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x20) == 0) {
					return true;
				}
				if (local65 == local75 && local80 - 1 == local70 && (this.anIntArrayArray143[local75][local70] & 0x2) == 0) {
					return true;
				}
				if (local75 == local65 - 1 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local75 && local80 == local70 && (this.anIntArrayArray143[local75][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(91) int local91 = arg6 + local75 - 1;
			@Pc(98) int local98 = local70 + arg6 - 1;
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local75 == local65 - arg6 && local70 <= local80 && local80 <= local98) {
						return true;
					}
					if (local65 >= local75 && local65 <= local91 && local80 + 1 == local70 && (this.anIntArrayArray143[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 <= local65 && local91 >= local65 && local70 == local80 - arg6 && (this.anIntArrayArray143[local65][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local75 <= local65 && local65 <= local91 && local80 + 1 == local70) {
						return true;
					}
					if (local65 - arg6 == local75 && local80 >= local70 && local98 >= local80 && (this.anIntArrayArray143[local91][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local70 <= local80 && local98 >= local80 && (this.anIntArrayArray143[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local75 == local65 + 1 && local80 >= local70 && local98 >= local80) {
						return true;
					}
					if (local65 >= local75 && local65 <= local91 && local70 == local80 + 1 && (this.anIntArrayArray143[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 >= local75 && local91 >= local65 && local70 == local80 - arg6 && (this.anIntArrayArray143[local65][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local75 <= local65 && local91 >= local65 && local80 - arg6 == local70) {
						return true;
					}
					if (local65 - arg6 == local75 && local70 <= local80 && local98 >= local80 && (this.anIntArrayArray143[local91][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local80 >= local70 && local80 <= local98 && (this.anIntArrayArray143[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local65 - arg6 == local75 && local80 >= local70 && local98 >= local80) {
						return true;
					}
					if (local65 >= local75 && local65 <= local91 && local70 == local80 + 1) {
						return true;
					}
					if (local75 == local65 + 1 && local80 >= local70 && local80 <= local98 && (this.anIntArrayArray143[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 <= local65 && local65 <= local91 && local80 - arg6 == local70 && (this.anIntArrayArray143[local65][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local65 - arg6 == local75 && local70 <= local80 && local98 >= local80 && (this.anIntArrayArray143[local91][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 >= local75 && local65 <= local91 && local70 == local80 + 1) {
						return true;
					}
					if (local65 + 1 == local75 && local70 <= local80 && local98 >= local80) {
						return true;
					}
					if (local75 <= local65 && local91 >= local65 && local70 == local80 - arg6 && (this.anIntArrayArray143[local65][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local65 - arg6 == local75 && local80 >= local70 && local80 <= local98 && (this.anIntArrayArray143[local91][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 <= local65 && local65 <= local91 && local70 == local80 + 1 && (this.anIntArrayArray143[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local80 >= local70 && local80 <= local98) {
						return true;
					}
					if (local75 <= local65 && local91 >= local65 && local80 - arg6 == local70) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local75 == local65 - arg6 && local70 <= local80 && local80 <= local98) {
						return true;
					}
					if (local65 >= local75 && local65 <= local91 && local70 == local80 + 1 && (this.anIntArrayArray143[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local70 <= local80 && local98 >= local80 && (this.anIntArrayArray143[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 >= local75 && local65 <= local91 && local70 == local80 - arg6) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local65 >= local75 && local65 <= local91 && local80 + 1 == local70 && (this.anIntArrayArray143[local65][local70] & 0x2C0120) == 0) {
					return true;
				}
				if (local65 >= local75 && local91 >= local65 && local70 == local80 - arg6 && (this.anIntArrayArray143[local65][local98] & 0x2C0102) == 0) {
					return true;
				}
				if (local75 == local65 - arg6 && local70 <= local80 && local80 <= local98 && (this.anIntArrayArray143[local91][local80] & 0x2C0108) == 0) {
					return true;
				}
				if (local65 + 1 == local75 && local80 >= local70 && local98 >= local80 && (this.anIntArrayArray143[local75][local80] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 + arg7;
		@Pc(13) int local13 = arg3 + arg6;
		@Pc(22) int local22 = arg1 + arg4;
		@Pc(26) int local26 = arg2 + arg8;
		@Pc(54) int local54;
		@Pc(65) int local65;
		if (arg7 == local22 && (arg0 & 0x2) == 0) {
			local54 = arg8 >= arg6 ? arg8 : arg6;
			local65 = local13 >= local26 ? local26 : local13;
			while (local65 > local54) {
				if ((this.anIntArrayArray143[local22 - this.anInt5336 - 1][local54 - this.anInt5341] & 0x8) == 0) {
					return true;
				}
				local54++;
			}
		} else if (local9 == arg4 && (arg0 & 0x8) == 0) {
			local54 = arg6 <= arg8 ? arg8 : arg6;
			local65 = local26 <= local13 ? local26 : local13;
			while (local65 > local54) {
				if ((this.anIntArrayArray143[arg4 - this.anInt5336][local54 - this.anInt5341] & 0x80) == 0) {
					return true;
				}
				local54++;
			}
		} else if (arg6 == local26 && (arg0 & 0x1) == 0) {
			local54 = arg7 > arg4 ? arg7 : arg4;
			local65 = local9 < local22 ? local9 : local22;
			while (local65 > local54) {
				if ((this.anIntArrayArray143[local54 - this.anInt5336][local26 - this.anInt5341 - 1] & 0x2) == 0) {
					return true;
				}
				local54++;
			}
		} else if (local13 == arg8 && (arg0 & 0x4) == 0) {
			local54 = arg4 >= arg7 ? arg4 : arg7;
			local65 = local22 > local9 ? local9 : local22;
			while (local54 < local65) {
				if ((this.anIntArrayArray143[local54 - this.anInt5336][arg8 - this.anInt5341] & 0x20) == 0) {
					return true;
				}
				local54++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBIIIIIII)Z")
	public boolean method4587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static174.method3349(arg2, arg6, arg4, arg6, arg7, arg3, arg1, arg5) ? true : this.method4586(arg0, arg7, arg2, arg6, arg4, arg6, arg1, arg5, arg3);
		}
		@Pc(48) int local48 = arg7 + arg4 - 1;
		@Pc(54) int local54 = arg2 + arg3 - 1;
		if (arg5 >= arg4 && arg5 <= local48 && arg3 <= arg1 && local54 >= arg1) {
			return true;
		} else if (arg4 - 1 == arg5 && arg3 <= arg1 && arg1 <= local54 && (this.anIntArrayArray143[arg5 - this.anInt5336][arg1 - this.anInt5341] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local48 + 1 == arg5 && arg3 <= arg1 && arg1 <= local54 && (this.anIntArrayArray143[arg5 - this.anInt5336][arg1 - this.anInt5341] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg3 - 1 && arg5 >= arg4 && local48 >= arg5 && (this.anIntArrayArray143[arg5 - this.anInt5336][arg1 - this.anInt5341] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local54 + 1 == arg1 && arg5 >= arg4 && local48 >= arg5 && (this.anIntArrayArray143[arg5 - this.anInt5336][arg1 - this.anInt5341] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V")
	private void method4588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray143[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIIIIZZI)V")
	public void method4589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(21) int local21;
		if (arg1 == 1 || arg1 == 3) {
			local21 = arg6;
			arg6 = arg2;
			arg2 = local21;
		}
		@Pc(36) int local36 = arg3 - this.anInt5341;
		@Pc(41) int local41 = arg0 - this.anInt5336;
		if (arg5) {
			local7 |= 0x40000000;
		}
		for (local21 = local41; local21 < local41 + arg6; local21++) {
			if (local21 >= 0 && local21 < this.anInt5337) {
				for (@Pc(63) int local63 = local36; local63 < arg2 + local36; local63++) {
					if (local63 >= 0 && this.anInt5332 > local63) {
						this.method4588(local63, local7, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(IIII)V")
	private void method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray143[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBI)V")
	public void method4591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt5341;
		@Pc(17) int local17 = arg0 - this.anInt5336;
		this.anIntArrayArray143[local17][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZIZII)V")
	public void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = 256;
		if (arg4) {
			local11 = 131328;
		}
		if (arg2) {
			local11 |= 0x40000000;
		}
		@Pc(28) int local28 = arg3 - this.anInt5336;
		@Pc(33) int local33 = arg5 - this.anInt5341;
		for (@Pc(35) int local35 = local28; local35 < local28 + arg1; local35++) {
			if (local35 >= 0 && local35 < this.anInt5337) {
				for (@Pc(45) int local45 = local33; local45 < local33 + arg0; local45++) {
					if (local45 >= 0 && local45 < this.anInt5332) {
						this.method4590(local11, local35, local45);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public void method4593() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5337; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt5332; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt5337 - 5 <= local11 || local15 >= this.anInt5332 - 5) {
					this.anIntArrayArray143[local11][local15] = -1;
				} else {
					this.anIntArrayArray143[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZIIBIZ)V")
	public void method4594(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt5336;
		@Pc(9) int local9 = arg4 - this.anInt5341;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4590(128, local4, local9);
				this.method4590(8, local4 - 1, local9);
			}
			if (arg0 == 1) {
				this.method4590(2, local4, local9);
				this.method4590(32, local4, local9 + 1);
			}
			if (arg0 == 2) {
				this.method4590(8, local4, local9);
				this.method4590(128, local4 + 1, local9);
			}
			if (arg0 == 3) {
				this.method4590(32, local4, local9);
				this.method4590(2, local4, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4590(1, local4, local9);
				this.method4590(16, local4 - 1, local9 + 1);
			}
			if (arg0 == 1) {
				this.method4590(4, local4, local9);
				this.method4590(64, local4 + 1, local9 + 1);
			}
			if (arg0 == 2) {
				this.method4590(16, local4, local9);
				this.method4590(1, local4 + 1, local9 + -1);
			}
			if (arg0 == 3) {
				this.method4590(64, local4, local9);
				this.method4590(4, local4 - 1, local9 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method4590(130, local4, local9);
				this.method4590(8, local4 - 1, local9);
				this.method4590(32, local4, local9 + 1);
			}
			if (arg0 == 1) {
				this.method4590(10, local4, local9);
				this.method4590(32, local4, local9 + 1);
				this.method4590(128, local4 + 1, local9);
			}
			if (arg0 == 2) {
				this.method4590(40, local4, local9);
				this.method4590(128, local4 + 1, local9);
				this.method4590(2, local4, local9 - 1);
			}
			if (arg0 == 3) {
				this.method4590(160, local4, local9);
				this.method4590(2, local4, local9 - 1);
				this.method4590(8, local4 - 1, local9);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method4590(65536, local4, local9);
					this.method4590(4096, local4 - 1, local9);
				}
				if (arg0 == 1) {
					this.method4590(1024, local4, local9);
					this.method4590(16384, local4, local9 + 1);
				}
				if (arg0 == 2) {
					this.method4590(4096, local4, local9);
					this.method4590(65536, local4 + 1, local9);
				}
				if (arg0 == 3) {
					this.method4590(16384, local4, local9);
					this.method4590(1024, local4, local9 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method4590(512, local4, local9);
					this.method4590(8192, local4 - 1, local9 - -1);
				}
				if (arg0 == 1) {
					this.method4590(2048, local4, local9);
					this.method4590(32768, local4 + 1, local9 + 1);
				}
				if (arg0 == 2) {
					this.method4590(8192, local4, local9);
					this.method4590(512, local4 + 1, local9 + -1);
				}
				if (arg0 == 3) {
					this.method4590(32768, local4, local9);
					this.method4590(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method4590(66560, local4, local9);
					this.method4590(4096, local4 - 1, local9);
					this.method4590(16384, local4, local9 + 1);
				}
				if (arg0 == 1) {
					this.method4590(5120, local4, local9);
					this.method4590(16384, local4, local9 + 1);
					this.method4590(65536, local4 + 1, local9);
				}
				if (arg0 == 2) {
					this.method4590(20480, local4, local9);
					this.method4590(65536, local4 + 1, local9);
					this.method4590(1024, local4, local9 - 1);
				}
				if (arg0 == 3) {
					this.method4590(81920, local4, local9);
					this.method4590(1024, local4, local9 - 1);
					this.method4590(4096, local4 - 1, local9);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4590(536870912, local4, local9);
				this.method4590(33554432, local4 - 1, local9);
			}
			if (arg0 == 1) {
				this.method4590(8388608, local4, local9);
				this.method4590(134217728, local4, local9 + 1);
			}
			if (arg0 == 2) {
				this.method4590(33554432, local4, local9);
				this.method4590(536870912, local4 + 1, local9);
			}
			if (arg0 == 3) {
				this.method4590(134217728, local4, local9);
				this.method4590(8388608, local4, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4590(4194304, local4, local9);
				this.method4590(67108864, local4 - 1, local9 + 1);
			}
			if (arg0 == 1) {
				this.method4590(16777216, local4, local9);
				this.method4590(268435456, local4 + 1, local9 + 1);
			}
			if (arg0 == 2) {
				this.method4590(67108864, local4, local9);
				this.method4590(4194304, local4 + 1, local9 + -1);
			}
			if (arg0 == 3) {
				this.method4590(268435456, local4, local9);
				this.method4590(16777216, local4 - 1, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4590(545259520, local4, local9);
			this.method4590(33554432, local4 - 1, local9);
			this.method4590(134217728, local4, local9 + 1);
		}
		if (arg0 == 1) {
			this.method4590(41943040, local4, local9);
			this.method4590(134217728, local4, local9 + 1);
			this.method4590(536870912, local4 + 1, local9);
		}
		if (arg0 == 2) {
			this.method4590(167772160, local4, local9);
			this.method4590(536870912, local4 + 1, local9);
			this.method4590(8388608, local4, local9 - 1);
		}
		if (arg0 == 3) {
			this.method4590(671088640, local4, local9);
			this.method4590(8388608, local4, local9 - 1);
			this.method4590(33554432, local4 - 1, local9);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZ)V")
	public void method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt5341;
		@Pc(17) int local17 = arg0 - this.anInt5336;
		this.anIntArrayArray143[local17][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BZIIIIZ)V")
	public void method4598(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt5341;
		@Pc(9) int local9 = arg3 - this.anInt5336;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method4588(local4, 128, local9);
				this.method4588(local4, 8, local9 - 1);
			}
			if (arg2 == 1) {
				this.method4588(local4, 2, local9);
				this.method4588(local4 + 1, 32, local9);
			}
			if (arg2 == 2) {
				this.method4588(local4, 8, local9);
				this.method4588(local4, 128, local9 + 1);
			}
			if (arg2 == 3) {
				this.method4588(local4, 32, local9);
				this.method4588(local4 - 1, 2, local9);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method4588(local4, 1, local9);
				this.method4588(local4 + 1, 16, local9 - 1);
			}
			if (arg2 == 1) {
				this.method4588(local4, 4, local9);
				this.method4588(local4 + 1, 64, local9 + 1);
			}
			if (arg2 == 2) {
				this.method4588(local4, 16, local9);
				this.method4588(local4 - 1, 1, local9 + 1);
			}
			if (arg2 == 3) {
				this.method4588(local4, 64, local9);
				this.method4588(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method4588(local4, 130, local9);
				this.method4588(local4, 8, local9 - 1);
				this.method4588(local4 + 1, 32, local9);
			}
			if (arg2 == 1) {
				this.method4588(local4, 10, local9);
				this.method4588(local4 + 1, 32, local9);
				this.method4588(local4, 128, local9 + 1);
			}
			if (arg2 == 2) {
				this.method4588(local4, 40, local9);
				this.method4588(local4, 128, local9 + 1);
				this.method4588(local4 - 1, 2, local9);
			}
			if (arg2 == 3) {
				this.method4588(local4, 160, local9);
				this.method4588(local4 - 1, 2, local9);
				this.method4588(local4, 8, local9 - 1);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method4588(local4, 65536, local9);
					this.method4588(local4, 4096, local9 - 1);
				}
				if (arg2 == 1) {
					this.method4588(local4, 1024, local9);
					this.method4588(local4 + 1, 16384, local9);
				}
				if (arg2 == 2) {
					this.method4588(local4, 4096, local9);
					this.method4588(local4, 65536, local9 + 1);
				}
				if (arg2 == 3) {
					this.method4588(local4, 16384, local9);
					this.method4588(local4 - 1, 1024, local9);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method4588(local4, 512, local9);
					this.method4588(local4 + 1, 8192, local9 - 1);
				}
				if (arg2 == 1) {
					this.method4588(local4, 2048, local9);
					this.method4588(local4 + 1, 32768, local9 + 1);
				}
				if (arg2 == 2) {
					this.method4588(local4, 8192, local9);
					this.method4588(local4 - 1, 512, local9 + 1);
				}
				if (arg2 == 3) {
					this.method4588(local4, 32768, local9);
					this.method4588(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method4588(local4, 66560, local9);
					this.method4588(local4, 4096, local9 - 1);
					this.method4588(local4 + 1, 16384, local9);
				}
				if (arg2 == 1) {
					this.method4588(local4, 5120, local9);
					this.method4588(local4 + 1, 16384, local9);
					this.method4588(local4, 65536, local9 + 1);
				}
				if (arg2 == 2) {
					this.method4588(local4, 20480, local9);
					this.method4588(local4, 65536, local9 + 1);
					this.method4588(local4 - 1, 1024, local9);
				}
				if (arg2 == 3) {
					this.method4588(local4, 81920, local9);
					this.method4588(local4 - 1, 1024, local9);
					this.method4588(local4, 4096, local9 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method4588(local4, 536870912, local9);
				this.method4588(local4, 33554432, local9 - 1);
			}
			if (arg2 == 1) {
				this.method4588(local4, 8388608, local9);
				this.method4588(local4 + 1, 134217728, local9);
			}
			if (arg2 == 2) {
				this.method4588(local4, 33554432, local9);
				this.method4588(local4, 536870912, local9 + 1);
			}
			if (arg2 == 3) {
				this.method4588(local4, 134217728, local9);
				this.method4588(local4 - 1, 8388608, local9);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method4588(local4, 4194304, local9);
				this.method4588(local4 + 1, 67108864, local9 - 1);
			}
			if (arg2 == 1) {
				this.method4588(local4, 16777216, local9);
				this.method4588(local4 + 1, 268435456, local9 + 1);
			}
			if (arg2 == 2) {
				this.method4588(local4, 67108864, local9);
				this.method4588(local4 - 1, 4194304, local9 + 1);
			}
			if (arg2 == 3) {
				this.method4588(local4, 268435456, local9);
				this.method4588(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method4588(local4, 545259520, local9);
			this.method4588(local4, 33554432, local9 - 1);
			this.method4588(local4 + 1, 134217728, local9);
		}
		if (arg2 == 1) {
			this.method4588(local4, 41943040, local9);
			this.method4588(local4 + 1, 134217728, local9);
			this.method4588(local4, 536870912, local9 + 1);
		}
		if (arg2 == 2) {
			this.method4588(local4, 167772160, local9);
			this.method4588(local4, 536870912, local9 + 1);
			this.method4588(local4 - 1, 8388608, local9);
		}
		if (arg2 == 3) {
			this.method4588(local4, 671088640, local9);
			this.method4588(local4 - 1, 8388608, local9);
			this.method4588(local4, 33554432, local9 - 1);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZIIIIII)Z")
	public boolean method4599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg6 && arg5 == arg1) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg6 + arg4 - 1 && arg5 >= arg5 && arg4 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(66) int local66 = arg1 - this.anInt5341;
		@Pc(71) int local71 = arg5 - this.anInt5341;
		@Pc(76) int local76 = arg3 - this.anInt5336;
		@Pc(81) int local81 = arg6 - this.anInt5336;
		if (arg4 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local76 + 1 == local81 && local66 == local71 && (this.anIntArrayArray143[local81][local66] & 0x80) == 0) {
						return true;
					}
					if (local81 == local76 && local66 == local71 - 1 && (this.anIntArrayArray143[local81][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local76 - 1 == local81 && local66 == local71 && (this.anIntArrayArray143[local81][local66] & 0x8) == 0) {
						return true;
					}
					if (local81 == local76 && local71 - 1 == local66 && (this.anIntArrayArray143[local81][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local76 - 1 == local81 && local66 == local71 && (this.anIntArrayArray143[local81][local66] & 0x8) == 0) {
						return true;
					}
					if (local76 == local81 && local71 + 1 == local66 && (this.anIntArrayArray143[local81][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local76 + 1 == local81 && local66 == local71 && (this.anIntArrayArray143[local81][local66] & 0x80) == 0) {
						return true;
					}
					if (local81 == local76 && local66 == local71 + 1 && (this.anIntArrayArray143[local81][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local76 == local81 && local71 + 1 == local66 && (this.anIntArrayArray143[local81][local66] & 0x20) == 0) {
					return true;
				}
				if (local76 == local81 && local71 - 1 == local66 && (this.anIntArrayArray143[local81][local66] & 0x2) == 0) {
					return true;
				}
				if (local76 - 1 == local81 && local66 == local71 && (this.anIntArrayArray143[local81][local66] & 0x8) == 0) {
					return true;
				}
				if (local81 == local76 + 1 && local66 == local71 && (this.anIntArrayArray143[local81][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = arg4 + local81 - 1;
			@Pc(96) int local96 = local66 + arg4 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local81 == local76 + 1 && local71 >= local66 && local71 <= local96 && (this.anIntArrayArray143[local81][local71] & 0x80) == 0) {
						return true;
					}
					if (local81 <= local76 && local90 >= local76 && local66 == local71 - arg4 && (this.anIntArrayArray143[local76][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local81 == local76 - arg4 && local71 >= local66 && local71 <= local96 && (this.anIntArrayArray143[local90][local71] & 0x8) == 0) {
						return true;
					}
					if (local76 >= local81 && local90 >= local76 && local71 - arg4 == local66 && (this.anIntArrayArray143[local76][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local76 - arg4 == local81 && local66 <= local71 && local71 <= local96 && (this.anIntArrayArray143[local90][local71] & 0x8) == 0) {
						return true;
					}
					if (local76 >= local81 && local76 <= local90 && local71 + 1 == local66 && (this.anIntArrayArray143[local76][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local76 + 1 == local81 && local66 <= local71 && local71 <= local96 && (this.anIntArrayArray143[local81][local71] & 0x80) == 0) {
						return true;
					}
					if (local76 >= local81 && local90 >= local76 && local71 + 1 == local66 && (this.anIntArrayArray143[local76][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local81 <= local76 && local76 <= local90 && local66 == local71 + 1 && (this.anIntArrayArray143[local76][local66] & 0x20) == 0) {
					return true;
				}
				if (local76 >= local81 && local76 <= local90 && local66 == local71 - arg4 && (this.anIntArrayArray143[local76][local96] & 0x2) == 0) {
					return true;
				}
				if (local81 == local76 - arg4 && local66 <= local71 && local71 <= local96 && (this.anIntArrayArray143[local90][local71] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local81 && local66 <= local71 && local71 <= local96 && (this.anIntArrayArray143[local81][local71] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII)V")
	public void method4600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5341;
		@Pc(9) int local9 = arg1 - this.anInt5336;
		this.anIntArrayArray143[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(IBI)V")
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5341;
		@Pc(13) int local13 = arg1 - this.anInt5336;
		this.anIntArrayArray143[local13][local8] &= 0xFFFBFFFF;
	}
}

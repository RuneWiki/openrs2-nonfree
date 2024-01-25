import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class138 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
	public int anInt3999;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
	public int anInt4009;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIZZZ)V")
	public void method3437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		@Pc(21) int local21 = 256;
		if (arg4) {
			local21 = 131328;
		}
		if (arg5) {
			local21 |= 0x40000000;
		}
		@Pc(38) int local38 = arg3 - this.anInt4008;
		@Pc(43) int local43 = arg0 - this.anInt3999;
		for (@Pc(45) int local45 = local38; local45 < arg1 + local38; local45++) {
			if (local45 >= 0 && this.anInt4005 > local45) {
				for (@Pc(55) int local55 = local43; local55 < local43 + arg2; local55++) {
					if (local55 >= 0 && this.anInt4009 > local55) {
						this.method3449(local55, local21, local45);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZII)V")
	private void method3438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method3440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static114.method1796(arg2, arg0, arg4, arg7, arg7, arg5, arg6, arg1) ? true : this.method3442(arg5, arg2, arg6, arg7, arg1, arg0, arg7, arg3, arg4);
		}
		@Pc(40) int local40 = arg6 + arg0 - 1;
		@Pc(46) int local46 = arg4 + arg2 - 1;
		if (arg5 >= arg6 && arg5 <= local40 && arg1 >= arg4 && local46 >= arg1) {
			return true;
		} else if (arg6 - 1 == arg5 && arg1 >= arg4 && arg1 <= local46 && (this.anIntArrayArray35[arg5 - this.anInt4008][arg1 - this.anInt3999] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg5 == local40 + 1 && arg1 >= arg4 && local46 >= arg1 && (this.anIntArrayArray35[arg5 - this.anInt4008][arg1 - this.anInt3999] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg4 - 1 && arg6 <= arg5 && arg5 <= local40 && (this.anIntArrayArray35[arg5 - this.anInt4008][arg1 - this.anInt3999] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local46 + 1 && arg5 >= arg6 && arg5 <= local40 && (this.anIntArrayArray35[arg5 - this.anInt4008][arg1 - this.anInt3999] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
	public void method3441() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt4005; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt4009; local19++) {
				if (local15 == 0 || local19 == 0 || this.anInt4005 - 5 <= local15 || local19 >= this.anInt4009 - 5) {
					this.anIntArrayArray35[local15][local19] = -1;
				} else {
					this.anIntArrayArray35[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 + arg0;
		@Pc(13) int local13 = arg3 + arg4;
		@Pc(17) int local17 = arg5 + arg2;
		@Pc(21) int local21 = arg1 + arg8;
		@Pc(51) int local51;
		@Pc(58) int local58;
		if (local17 == arg0 && (arg7 & 0x2) == 0) {
			local51 = arg8 >= arg4 ? arg8 : arg4;
			local58 = local13 < local21 ? local13 : local21;
			while (local51 < local58) {
				if ((this.anIntArrayArray35[local17 - this.anInt4008 - 1][local51 - this.anInt3999] & 0x8) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local9 == arg2 && (arg7 & 0x8) == 0) {
			local51 = arg4 <= arg8 ? arg8 : arg4;
			local58 = local21 <= local13 ? local21 : local13;
			while (local51 < local58) {
				if ((this.anIntArrayArray35[arg2 - this.anInt4008][local51 - this.anInt3999] & 0x80) == 0) {
					return true;
				}
				local51++;
			}
		} else if (arg4 == local21 && (arg7 & 0x1) == 0) {
			local51 = arg2 < arg0 ? arg0 : arg2;
			local58 = local9 >= local17 ? local17 : local9;
			while (local58 > local51) {
				if ((this.anIntArrayArray35[local51 - this.anInt4008][local21 - this.anInt3999 - 1] & 0x2) == 0) {
					return true;
				}
				local51++;
			}
		} else if (arg8 == local13 && (arg7 & 0x4) == 0) {
			local51 = arg2 < arg0 ? arg0 : arg2;
			local58 = local17 > local9 ? local9 : local17;
			while (local51 < local58) {
				if ((this.anIntArrayArray35[local51 - this.anInt4008][arg8 - this.anInt3999] & 0x20) == 0) {
					return true;
				}
				local51++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V")
	public void method3443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3999;
		@Pc(9) int local9 = arg1 - this.anInt4008;
		this.anIntArrayArray35[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg6 && arg4 == arg2) {
				return true;
			}
		} else if (arg3 <= arg6 && arg6 <= arg5 + arg3 - 1 && arg4 >= arg4 && arg4 + arg5 - 1 >= arg4) {
			return true;
		}
		@Pc(54) int local54 = arg3 - this.anInt4008;
		@Pc(59) int local59 = arg6 - this.anInt4008;
		@Pc(64) int local64 = arg2 - this.anInt3999;
		@Pc(69) int local69 = arg4 - this.anInt3999;
		if (arg5 == 1) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					if (local54 == local59 - 1 && local64 == local69) {
						return true;
					}
					if (local54 == local59 && local69 + 1 == local64 && (this.anIntArrayArray35[local54][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local54 && local64 == local69 - 1 && (this.anIntArrayArray35[local54][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local54 == local59 && local64 == local69 + 1) {
						return true;
					}
					if (local54 == local59 - 1 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local59 + 1 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 + 1 == local54 && local64 == local69) {
						return true;
					}
					if (local54 == local59 && local64 == local69 + 1 && (this.anIntArrayArray35[local54][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local54 && local64 == local69 - 1 && (this.anIntArrayArray35[local54][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local54 == local59 && local69 - 1 == local64) {
						return true;
					}
					if (local59 - 1 == local54 && local69 == local64 && (this.anIntArrayArray35[local54][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local59 + 1 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					if (local54 == local59 - 1 && local69 == local64) {
						return true;
					}
					if (local59 == local54 && local69 + 1 == local64) {
						return true;
					}
					if (local59 + 1 == local54 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 == local59 && local69 - 1 == local64 && (this.anIntArrayArray35[local54][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 - 1 == local54 && local69 == local64 && (this.anIntArrayArray35[local54][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local59 && local69 + 1 == local64) {
						return true;
					}
					if (local59 + 1 == local54 && local64 == local69) {
						return true;
					}
					if (local59 == local54 && local64 == local69 - 1 && (this.anIntArrayArray35[local54][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local54 == local59 - 1 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local59 && local64 == local69 + 1 && (this.anIntArrayArray35[local54][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local59 + 1 && local69 == local64) {
						return true;
					}
					if (local54 == local59 && local64 == local69 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local54 == local59 - 1 && local69 == local64) {
						return true;
					}
					if (local54 == local59 && local64 == local69 + 1 && (this.anIntArrayArray35[local54][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local54 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 == local59 && local64 == local69 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local54 == local59 && local69 + 1 == local64 && (this.anIntArrayArray35[local54][local64] & 0x20) == 0) {
					return true;
				}
				if (local54 == local59 && local64 == local69 - 1 && (this.anIntArrayArray35[local54][local64] & 0x2) == 0) {
					return true;
				}
				if (local59 - 1 == local54 && local64 == local69 && (this.anIntArrayArray35[local54][local64] & 0x8) == 0) {
					return true;
				}
				if (local54 == local59 + 1 && local69 == local64 && (this.anIntArrayArray35[local54][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(777) int local777 = arg5 + local54 - 1;
			@Pc(783) int local783 = arg5 + local64 - 1;
			if (arg1 == 0) {
				if (arg0 == 0) {
					if (local54 == local59 - arg5 && local69 >= local64 && local69 <= local783) {
						return true;
					}
					if (local54 <= local59 && local777 >= local59 && local64 == local69 + 1 && (this.anIntArrayArray35[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local54 && local777 >= local59 && local69 - arg5 == local64 && (this.anIntArrayArray35[local59][local783] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 >= local54 && local59 <= local777 && local64 == local69 + 1) {
						return true;
					}
					if (local54 == local59 - arg5 && local64 <= local69 && local783 >= local69 && (this.anIntArrayArray35[local777][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local54 && local64 <= local69 && local69 <= local783 && (this.anIntArrayArray35[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 + 1 == local54 && local69 >= local64 && local783 >= local69) {
						return true;
					}
					if (local54 <= local59 && local59 <= local777 && local64 == local69 + 1 && (this.anIntArrayArray35[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local54 && local59 <= local777 && local69 - arg5 == local64 && (this.anIntArrayArray35[local59][local783] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 >= local54 && local777 >= local59 && local64 == local69 - arg5) {
						return true;
					}
					if (local59 - arg5 == local54 && local64 <= local69 && local69 <= local783 && (this.anIntArrayArray35[local777][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local59 + 1 && local64 <= local69 && local69 <= local783 && (this.anIntArrayArray35[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					if (local54 == local59 - arg5 && local64 <= local69 && local69 <= local783) {
						return true;
					}
					if (local59 >= local54 && local777 >= local59 && local69 + 1 == local64) {
						return true;
					}
					if (local59 + 1 == local54 && local69 >= local64 && local69 <= local783 && (this.anIntArrayArray35[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local54 && local59 <= local777 && local64 == local69 - arg5 && (this.anIntArrayArray35[local59][local783] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 - arg5 == local54 && local64 <= local69 && local783 >= local69 && (this.anIntArrayArray35[local777][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 <= local59 && local777 >= local59 && local64 == local69 + 1) {
						return true;
					}
					if (local59 + 1 == local54 && local69 >= local64 && local69 <= local783) {
						return true;
					}
					if (local59 >= local54 && local59 <= local777 && local69 - arg5 == local64 && (this.anIntArrayArray35[local59][local783] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 - arg5 == local54 && local69 >= local64 && local783 >= local69 && (this.anIntArrayArray35[local777][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 <= local59 && local59 <= local777 && local64 == local69 + 1 && (this.anIntArrayArray35[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local54 && local64 <= local69 && local783 >= local69) {
						return true;
					}
					if (local54 <= local59 && local59 <= local777 && local64 == local69 - arg5) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 - arg5 == local54 && local69 >= local64 && local783 >= local69) {
						return true;
					}
					if (local59 >= local54 && local59 <= local777 && local64 == local69 + 1 && (this.anIntArrayArray35[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local59 + 1 && local69 >= local64 && local783 >= local69 && (this.anIntArrayArray35[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 <= local59 && local59 <= local777 && local64 == local69 - arg5) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local59 >= local54 && local59 <= local777 && local64 == local69 + 1 && (this.anIntArrayArray35[local59][local64] & 0x2C0120) == 0) {
					return true;
				}
				if (local59 >= local54 && local59 <= local777 && local64 == local69 - arg5 && (this.anIntArrayArray35[local59][local783] & 0x2C0102) == 0) {
					return true;
				}
				if (local54 == local59 - arg5 && local69 >= local64 && local69 <= local783 && (this.anIntArrayArray35[local777][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local54 == local59 + 1 && local69 >= local64 && local783 >= local69 && (this.anIntArrayArray35[local54][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZII)V")
	public void method3445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3999;
		@Pc(19) int local19 = arg0 - this.anInt4008;
		this.anIntArrayArray35[local19][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III)V")
	public void method3446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3999;
		@Pc(13) int local13 = arg1 - this.anInt4008;
		this.anIntArrayArray35[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBI)V")
	private void method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray35[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIZZIIBI)V")
	public void method3450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20 = 256;
		if (arg3) {
			local20 = 131328;
		}
		@Pc(36) int local36;
		if (arg4 == 1 || arg4 == 3) {
			local36 = arg1;
			arg1 = arg5;
			arg5 = local36;
		}
		if (arg2) {
			local20 |= 0x40000000;
		}
		@Pc(51) int local51 = arg6 - this.anInt4008;
		@Pc(56) int local56 = arg0 - this.anInt3999;
		for (local36 = local51; local36 < arg1 + local51; local36++) {
			if (local36 >= 0 && this.anInt4005 > local36) {
				for (@Pc(72) int local72 = local56; local72 < arg5 + local56; local72++) {
					if (local72 >= 0 && this.anInt4009 > local72) {
						this.method3438(local72, local20, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZIIIZII)V")
	public void method3451(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt3999;
		@Pc(9) int local9 = arg4 - this.anInt4008;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method3449(local4, 128, local9);
				this.method3449(local4, 8, local9 - 1);
			}
			if (arg5 == 1) {
				this.method3449(local4, 2, local9);
				this.method3449(local4 + 1, 32, local9);
			}
			if (arg5 == 2) {
				this.method3449(local4, 8, local9);
				this.method3449(local4, 128, local9 + 1);
			}
			if (arg5 == 3) {
				this.method3449(local4, 32, local9);
				this.method3449(local4 - 1, 2, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method3449(local4, 1, local9);
				this.method3449(local4 + 1, 16, local9 - 1);
			}
			if (arg5 == 1) {
				this.method3449(local4, 4, local9);
				this.method3449(local4 + 1, 64, local9 + 1);
			}
			if (arg5 == 2) {
				this.method3449(local4, 16, local9);
				this.method3449(local4 - 1, 1, local9 + 1);
			}
			if (arg5 == 3) {
				this.method3449(local4, 64, local9);
				this.method3449(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method3449(local4, 130, local9);
				this.method3449(local4, 8, local9 - 1);
				this.method3449(local4 + 1, 32, local9);
			}
			if (arg5 == 1) {
				this.method3449(local4, 10, local9);
				this.method3449(local4 + 1, 32, local9);
				this.method3449(local4, 128, local9 + 1);
			}
			if (arg5 == 2) {
				this.method3449(local4, 40, local9);
				this.method3449(local4, 128, local9 + 1);
				this.method3449(local4 - 1, 2, local9);
			}
			if (arg5 == 3) {
				this.method3449(local4, 160, local9);
				this.method3449(local4 - 1, 2, local9);
				this.method3449(local4, 8, local9 - 1);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method3449(local4, 65536, local9);
					this.method3449(local4, 4096, local9 - 1);
				}
				if (arg5 == 1) {
					this.method3449(local4, 1024, local9);
					this.method3449(local4 + 1, 16384, local9);
				}
				if (arg5 == 2) {
					this.method3449(local4, 4096, local9);
					this.method3449(local4, 65536, local9 + 1);
				}
				if (arg5 == 3) {
					this.method3449(local4, 16384, local9);
					this.method3449(local4 - 1, 1024, local9);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method3449(local4, 512, local9);
					this.method3449(local4 + 1, 8192, local9 - 1);
				}
				if (arg5 == 1) {
					this.method3449(local4, 2048, local9);
					this.method3449(local4 + 1, 32768, local9 + 1);
				}
				if (arg5 == 2) {
					this.method3449(local4, 8192, local9);
					this.method3449(local4 - 1, 512, local9 + 1);
				}
				if (arg5 == 3) {
					this.method3449(local4, 32768, local9);
					this.method3449(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method3449(local4, 66560, local9);
					this.method3449(local4, 4096, local9 - 1);
					this.method3449(local4 + 1, 16384, local9);
				}
				if (arg5 == 1) {
					this.method3449(local4, 5120, local9);
					this.method3449(local4 + 1, 16384, local9);
					this.method3449(local4, 65536, local9 + 1);
				}
				if (arg5 == 2) {
					this.method3449(local4, 20480, local9);
					this.method3449(local4, 65536, local9 + 1);
					this.method3449(local4 - 1, 1024, local9);
				}
				if (arg5 == 3) {
					this.method3449(local4, 81920, local9);
					this.method3449(local4 - 1, 1024, local9);
					this.method3449(local4, 4096, local9 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method3449(local4, 536870912, local9);
				this.method3449(local4, 33554432, local9 - 1);
			}
			if (arg5 == 1) {
				this.method3449(local4, 8388608, local9);
				this.method3449(local4 + 1, 134217728, local9);
			}
			if (arg5 == 2) {
				this.method3449(local4, 33554432, local9);
				this.method3449(local4, 536870912, local9 + 1);
			}
			if (arg5 == 3) {
				this.method3449(local4, 134217728, local9);
				this.method3449(local4 - 1, 8388608, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method3449(local4, 4194304, local9);
				this.method3449(local4 + 1, 67108864, local9 - 1);
			}
			if (arg5 == 1) {
				this.method3449(local4, 16777216, local9);
				this.method3449(local4 + 1, 268435456, local9 + 1);
			}
			if (arg5 == 2) {
				this.method3449(local4, 67108864, local9);
				this.method3449(local4 - 1, 4194304, local9 + 1);
			}
			if (arg5 == 3) {
				this.method3449(local4, 268435456, local9);
				this.method3449(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method3449(local4, 545259520, local9);
			this.method3449(local4, 33554432, local9 - 1);
			this.method3449(local4 + 1, 134217728, local9);
		}
		if (arg5 == 1) {
			this.method3449(local4, 41943040, local9);
			this.method3449(local4 + 1, 134217728, local9);
			this.method3449(local4, 536870912, local9 + 1);
		}
		if (arg5 == 2) {
			this.method3449(local4, 167772160, local9);
			this.method3449(local4, 536870912, local9 + 1);
			this.method3449(local4 - 1, 8388608, local9);
		}
		if (arg5 == 3) {
			this.method3449(local4, 671088640, local9);
			this.method3449(local4 - 1, 8388608, local9);
			this.method3449(local4, 33554432, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBZIIZI)V")
	public void method3453(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt4008;
		@Pc(13) int local13 = arg2 - this.anInt3999;
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method3438(local13, 128, local4);
				this.method3438(local13, 8, local4 - 1);
			}
			if (arg5 == 1) {
				this.method3438(local13, 2, local4);
				this.method3438(local13 + 1, 32, local4);
			}
			if (arg5 == 2) {
				this.method3438(local13, 8, local4);
				this.method3438(local13, 128, local4 + 1);
			}
			if (arg5 == 3) {
				this.method3438(local13, 32, local4);
				this.method3438(local13 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method3438(local13, 1, local4);
				this.method3438(local13 + 1, 16, local4 - 1);
			}
			if (arg5 == 1) {
				this.method3438(local13, 4, local4);
				this.method3438(local13 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method3438(local13, 16, local4);
				this.method3438(local13 - 1, 1, local4 + 1);
			}
			if (arg5 == 3) {
				this.method3438(local13, 64, local4);
				this.method3438(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				this.method3438(local13, 130, local4);
				this.method3438(local13, 8, local4 - 1);
				this.method3438(local13 + 1, 32, local4);
			}
			if (arg5 == 1) {
				this.method3438(local13, 10, local4);
				this.method3438(local13 + 1, 32, local4);
				this.method3438(local13, 128, local4 + 1);
			}
			if (arg5 == 2) {
				this.method3438(local13, 40, local4);
				this.method3438(local13, 128, local4 + 1);
				this.method3438(local13 - 1, 2, local4);
			}
			if (arg5 == 3) {
				this.method3438(local13, 160, local4);
				this.method3438(local13 - 1, 2, local4);
				this.method3438(local13, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method3438(local13, 65536, local4);
					this.method3438(local13, 4096, local4 - 1);
				}
				if (arg5 == 1) {
					this.method3438(local13, 1024, local4);
					this.method3438(local13 + 1, 16384, local4);
				}
				if (arg5 == 2) {
					this.method3438(local13, 4096, local4);
					this.method3438(local13, 65536, local4 + 1);
				}
				if (arg5 == 3) {
					this.method3438(local13, 16384, local4);
					this.method3438(local13 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method3438(local13, 512, local4);
					this.method3438(local13 + 1, 8192, local4 - 1);
				}
				if (arg5 == 1) {
					this.method3438(local13, 2048, local4);
					this.method3438(local13 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method3438(local13, 8192, local4);
					this.method3438(local13 - 1, 512, local4 + 1);
				}
				if (arg5 == 3) {
					this.method3438(local13, 32768, local4);
					this.method3438(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method3438(local13, 66560, local4);
					this.method3438(local13, 4096, local4 - 1);
					this.method3438(local13 + 1, 16384, local4);
				}
				if (arg5 == 1) {
					this.method3438(local13, 5120, local4);
					this.method3438(local13 + 1, 16384, local4);
					this.method3438(local13, 65536, local4 + 1);
				}
				if (arg5 == 2) {
					this.method3438(local13, 20480, local4);
					this.method3438(local13, 65536, local4 + 1);
					this.method3438(local13 - 1, 1024, local4);
				}
				if (arg5 == 3) {
					this.method3438(local13, 81920, local4);
					this.method3438(local13 - 1, 1024, local4);
					this.method3438(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method3438(local13, 536870912, local4);
				this.method3438(local13, 33554432, local4 - 1);
			}
			if (arg5 == 1) {
				this.method3438(local13, 8388608, local4);
				this.method3438(local13 + 1, 134217728, local4);
			}
			if (arg5 == 2) {
				this.method3438(local13, 33554432, local4);
				this.method3438(local13, 536870912, local4 + 1);
			}
			if (arg5 == 3) {
				this.method3438(local13, 134217728, local4);
				this.method3438(local13 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method3438(local13, 4194304, local4);
				this.method3438(local13 + 1, 67108864, local4 - 1);
			}
			if (arg5 == 1) {
				this.method3438(local13, 16777216, local4);
				this.method3438(local13 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method3438(local13, 67108864, local4);
				this.method3438(local13 - 1, 4194304, local4 + 1);
			}
			if (arg5 == 3) {
				this.method3438(local13, 268435456, local4);
				this.method3438(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method3438(local13, 545259520, local4);
			this.method3438(local13, 33554432, local4 - 1);
			this.method3438(local13 + 1, 134217728, local4);
		}
		if (arg5 == 1) {
			this.method3438(local13, 41943040, local4);
			this.method3438(local13 + 1, 134217728, local4);
			this.method3438(local13, 536870912, local4 + 1);
		}
		if (arg5 == 2) {
			this.method3438(local13, 167772160, local4);
			this.method3438(local13, 536870912, local4 + 1);
			this.method3438(local13 - 1, 8388608, local4);
		}
		if (arg5 == 3) {
			this.method3438(local13, 671088640, local4);
			this.method3438(local13 - 1, 8388608, local4);
			this.method3438(local13, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method3454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg0 == arg5 && arg2 == arg4) {
				return true;
			}
		} else if (arg5 <= arg0 && arg0 <= arg3 + arg5 - 1 && arg4 <= arg4 && arg4 + arg3 - 1 >= arg4) {
			return true;
		}
		@Pc(54) int local54 = arg2 - this.anInt3999;
		@Pc(59) int local59 = arg4 - this.anInt3999;
		@Pc(64) int local64 = arg0 - this.anInt4008;
		@Pc(69) int local69 = arg5 - this.anInt4008;
		if (arg3 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local64 + 1 == local69 && local59 == local54 && (this.anIntArrayArray35[local69][local54] & 0x80) == 0) {
						return true;
					}
					if (local69 == local64 && local59 - 1 == local54 && (this.anIntArrayArray35[local69][local54] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 - 1 == local69 && local54 == local59 && (this.anIntArrayArray35[local69][local54] & 0x8) == 0) {
						return true;
					}
					if (local69 == local64 && local59 - 1 == local54 && (this.anIntArrayArray35[local69][local54] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local64 - 1 == local69 && local54 == local59 && (this.anIntArrayArray35[local69][local54] & 0x8) == 0) {
						return true;
					}
					if (local69 == local64 && local54 == local59 + 1 && (this.anIntArrayArray35[local69][local54] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local64 + 1 == local69 && local54 == local59 && (this.anIntArrayArray35[local69][local54] & 0x80) == 0) {
						return true;
					}
					if (local64 == local69 && local54 == local59 + 1 && (this.anIntArrayArray35[local69][local54] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local69 == local64 && local59 + 1 == local54 && (this.anIntArrayArray35[local69][local54] & 0x20) == 0) {
					return true;
				}
				if (local64 == local69 && local59 - 1 == local54 && (this.anIntArrayArray35[local69][local54] & 0x2) == 0) {
					return true;
				}
				if (local69 == local64 - 1 && local54 == local59 && (this.anIntArrayArray35[local69][local54] & 0x8) == 0) {
					return true;
				}
				if (local69 == local64 + 1 && local59 == local54 && (this.anIntArrayArray35[local69][local54] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(421) int local421 = arg3 + local69 - 1;
			@Pc(427) int local427 = arg3 + local54 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local64 + 1 == local69 && local59 >= local54 && local427 >= local59 && (this.anIntArrayArray35[local69][local59] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local421 && local54 == local59 - arg3 && (this.anIntArrayArray35[local64][local427] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 - arg3 == local69 && local54 <= local59 && local427 >= local59 && (this.anIntArrayArray35[local421][local59] & 0x8) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local421 && local54 == local59 - arg3 && (this.anIntArrayArray35[local64][local427] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local69 == local64 - arg3 && local59 >= local54 && local59 <= local427 && (this.anIntArrayArray35[local421][local59] & 0x8) == 0) {
						return true;
					}
					if (local69 <= local64 && local64 <= local421 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local69 == local64 + 1 && local54 <= local59 && local59 <= local427 && (this.anIntArrayArray35[local69][local59] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local69 && local421 >= local64 && local59 + 1 == local54 && (this.anIntArrayArray35[local64][local54] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local69 <= local64 && local64 <= local421 && local54 == local59 + 1 && (this.anIntArrayArray35[local64][local54] & 0x20) == 0) {
					return true;
				}
				if (local69 <= local64 && local421 >= local64 && local54 == local59 - arg3 && (this.anIntArrayArray35[local64][local427] & 0x2) == 0) {
					return true;
				}
				if (local64 - arg3 == local69 && local59 >= local54 && local427 >= local59 && (this.anIntArrayArray35[local421][local59] & 0x8) == 0) {
					return true;
				}
				if (local69 == local64 + 1 && local54 <= local59 && local427 >= local59 && (this.anIntArrayArray35[local69][local59] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(III)V")
	public void method3455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4008;
		@Pc(18) int local18 = arg0 - this.anInt3999;
		this.anIntArrayArray35[local4][local18] &= 0xFFFBFFFF;
	}
}

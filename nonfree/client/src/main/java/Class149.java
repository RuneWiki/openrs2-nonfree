import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class149 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public int anInt4480;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public int anInt4481;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
	public int anInt4484;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
	public int anInt4488;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIZIB)V")
	public void method3947(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg4) {
			local5 = 131328;
		}
		@Pc(28) int local28 = arg1 - this.anInt4488;
		@Pc(33) int local33 = arg5 - this.anInt4484;
		if (arg0) {
			local5 |= 0x40000000;
		}
		for (@Pc(41) int local41 = local28; local41 < local28 + arg2; local41++) {
			if (local41 >= 0 && local41 < this.anInt4480) {
				for (@Pc(50) int local50 = local33; local50 < arg3 + local33; local50++) {
					if (local50 >= 0 && local50 < this.anInt4481) {
						this.method3948(local50, local5, local41);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	private void method3948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray36[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V")
	private void method3949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray36[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method3950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg1 && arg3 == arg5) {
				return true;
			}
		} else if (arg4 <= arg1 && arg0 + arg4 - 1 >= arg1 && arg3 >= arg3 && arg0 + arg3 - 1 >= arg3) {
			return true;
		}
		@Pc(49) int local49 = arg5 - this.anInt4484;
		@Pc(54) int local54 = arg4 - this.anInt4488;
		@Pc(64) int local64 = arg1 - this.anInt4488;
		@Pc(69) int local69 = arg3 - this.anInt4484;
		if (arg0 == 1) {
			if (arg2 == 0) {
				if (arg6 == 0) {
					if (local54 == local64 - 1 && local49 == local69) {
						return true;
					}
					if (local64 == local54 && local49 == local69 + 1 && (this.anIntArrayArray36[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local54 && local49 == local69 - 1 && (this.anIntArrayArray36[local54][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local54 == local64 && local69 + 1 == local49) {
						return true;
					}
					if (local54 == local64 - 1 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local64 + 1 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 == local64 + 1 && local49 == local69) {
						return true;
					}
					if (local54 == local64 && local49 == local69 + 1 && (this.anIntArrayArray36[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local54 == local64 && local69 - 1 == local49) {
						return true;
					}
					if (local54 == local64 - 1 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local54 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg6 == 0) {
					if (local64 - 1 == local54 && local49 == local69) {
						return true;
					}
					if (local54 == local64 && local69 + 1 == local49) {
						return true;
					}
					if (local64 + 1 == local54 && local49 == local69 && (this.anIntArrayArray36[local54][local49] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 == local64 && local49 == local69 - 1 && (this.anIntArrayArray36[local54][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 - 1 == local54 && local49 == local69 && (this.anIntArrayArray36[local54][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local64 && local49 == local69 + 1) {
						return true;
					}
					if (local64 + 1 == local54 && local69 == local49) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 == local64 - 1 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local64 && local49 == local69 + 1 && (this.anIntArrayArray36[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local64 + 1 && local69 == local49) {
						return true;
					}
					if (local64 == local54 && local69 - 1 == local49) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local54 == local64 - 1 && local49 == local69) {
						return true;
					}
					if (local64 == local54 && local49 == local69 + 1 && (this.anIntArrayArray36[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local64 + 1 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local49) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local64 == local54 && local69 + 1 == local49 && (this.anIntArrayArray36[local54][local49] & 0x20) == 0) {
					return true;
				}
				if (local64 == local54 && local69 - 1 == local49 && (this.anIntArrayArray36[local54][local49] & 0x2) == 0) {
					return true;
				}
				if (local64 - 1 == local54 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x8) == 0) {
					return true;
				}
				if (local54 == local64 + 1 && local69 == local49 && (this.anIntArrayArray36[local54][local49] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(80) int local80 = arg0 + local54 - 1;
			@Pc(86) int local86 = local49 + arg0 - 1;
			if (arg2 == 0) {
				if (arg6 == 0) {
					if (local64 - arg0 == local54 && local49 <= local69 && local69 <= local86) {
						return true;
					}
					if (local54 <= local64 && local80 >= local64 && local49 == local69 + 1 && (this.anIntArrayArray36[local64][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 >= local54 && local64 <= local80 && local69 - arg0 == local49 && (this.anIntArrayArray36[local64][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 >= local54 && local80 >= local64 && local69 + 1 == local49) {
						return true;
					}
					if (local64 - arg0 == local54 && local49 <= local69 && local69 <= local86 && (this.anIntArrayArray36[local80][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local54 && local49 <= local69 && local86 >= local69 && (this.anIntArrayArray36[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 == local64 + 1 && local69 >= local49 && local86 >= local69) {
						return true;
					}
					if (local54 <= local64 && local64 <= local80 && local49 == local69 + 1 && (this.anIntArrayArray36[local64][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 >= local54 && local64 <= local80 && local69 - arg0 == local49 && (this.anIntArrayArray36[local64][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local54 <= local64 && local64 <= local80 && local69 - arg0 == local49) {
						return true;
					}
					if (local64 - arg0 == local54 && local49 <= local69 && local69 <= local86 && (this.anIntArrayArray36[local80][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 == local64 + 1 && local49 <= local69 && local69 <= local86 && (this.anIntArrayArray36[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg6 == 0) {
					if (local54 == local64 - arg0 && local69 >= local49 && local86 >= local69) {
						return true;
					}
					if (local54 <= local64 && local64 <= local80 && local69 + 1 == local49) {
						return true;
					}
					if (local64 + 1 == local54 && local69 >= local49 && local86 >= local69 && (this.anIntArrayArray36[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 <= local64 && local64 <= local80 && local49 == local69 - arg0 && (this.anIntArrayArray36[local64][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 - arg0 == local54 && local69 >= local49 && local86 >= local69 && (this.anIntArrayArray36[local80][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 >= local54 && local80 >= local64 && local49 == local69 + 1) {
						return true;
					}
					if (local64 + 1 == local54 && local49 <= local69 && local86 >= local69) {
						return true;
					}
					if (local54 <= local64 && local80 >= local64 && local49 == local69 - arg0 && (this.anIntArrayArray36[local64][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local64 - arg0 == local54 && local49 <= local69 && local69 <= local86 && (this.anIntArrayArray36[local80][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 >= local54 && local80 >= local64 && local49 == local69 + 1 && (this.anIntArrayArray36[local64][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local54 && local69 >= local49 && local69 <= local86) {
						return true;
					}
					if (local64 >= local54 && local80 >= local64 && local69 - arg0 == local49) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local54 == local64 - arg0 && local69 >= local49 && local86 >= local69) {
						return true;
					}
					if (local64 >= local54 && local80 >= local64 && local49 == local69 + 1 && (this.anIntArrayArray36[local64][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local64 + 1 && local69 >= local49 && local69 <= local86 && (this.anIntArrayArray36[local54][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 <= local64 && local64 <= local80 && local69 - arg0 == local49) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local54 <= local64 && local64 <= local80 && local49 == local69 + 1 && (this.anIntArrayArray36[local64][local49] & 0x2C0120) == 0) {
					return true;
				}
				if (local54 <= local64 && local80 >= local64 && local49 == local69 - arg0 && (this.anIntArrayArray36[local64][local86] & 0x2C0102) == 0) {
					return true;
				}
				if (local64 - arg0 == local54 && local69 >= local49 && local69 <= local86 && (this.anIntArrayArray36[local80][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local54 == local64 + 1 && local69 >= local49 && local86 >= local69 && (this.anIntArrayArray36[local54][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method3951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static241.method4148(arg6, arg3, arg2, arg4, arg5, arg7, arg1, arg4) ? true : this.method3956(arg4, arg1, arg5, arg3, arg2, arg7, arg0, arg6, arg4);
		}
		@Pc(38) int local38 = arg6 + arg2 - 1;
		@Pc(44) int local44 = arg1 + arg7 - 1;
		if (arg2 <= arg3 && arg3 <= local38 && arg5 >= arg1 && local44 >= arg5) {
			return true;
		} else if (arg2 - 1 == arg3 && arg5 >= arg1 && arg5 <= local44 && (this.anIntArrayArray36[arg3 - this.anInt4488][arg5 - this.anInt4484] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg3 == local38 + 1 && arg1 <= arg5 && local44 >= arg5 && (this.anIntArrayArray36[arg3 - this.anInt4488][arg5 - this.anInt4484] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg5 && arg3 >= arg2 && local38 >= arg3 && (this.anIntArrayArray36[arg3 - this.anInt4488][arg5 - this.anInt4484] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg5 && arg3 >= arg2 && arg3 <= local38 && (this.anIntArrayArray36[arg3 - this.anInt4488][arg5 - this.anInt4484] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZI)V")
	public void method3953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt4484;
		@Pc(17) int local17 = arg1 - this.anInt4488;
		this.anIntArrayArray36[local17][local12] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public void method3954() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4480; local5++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt4481; local13++) {
				if (local5 == 0 || local13 == 0 || this.anInt4480 - 5 <= local5 || this.anInt4481 - 5 <= local13) {
					this.anIntArrayArray36[local5][local13] = -1;
				} else {
					this.anIntArrayArray36[local5][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public void method3955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 - this.anInt4484;
		@Pc(27) int local27 = arg1 - this.anInt4488;
		this.anIntArrayArray36[local27][local18] |= 0x200000;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBIIIIII)Z")
	public boolean method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg3;
		@Pc(11) int local11 = arg8 + arg2;
		@Pc(15) int local15 = arg7 + arg4;
		@Pc(25) int local25 = arg5 + arg1;
		@Pc(46) int local46;
		@Pc(57) int local57;
		if (local15 == arg3 && (arg6 & 0x2) == 0) {
			local46 = arg1 >= arg2 ? arg1 : arg2;
			local57 = local11 < local25 ? local11 : local25;
			while (local57 > local46) {
				if ((this.anIntArrayArray36[local15 - this.anInt4488 - 1][local46 - this.anInt4484] & 0x8) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local7 == arg4 && (arg6 & 0x8) == 0) {
			local46 = arg2 > arg1 ? arg2 : arg1;
			local57 = local11 < local25 ? local11 : local25;
			while (local57 > local46) {
				if ((this.anIntArrayArray36[arg4 - this.anInt4488][local46 - this.anInt4484] & 0x80) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local25 == arg2 && (arg6 & 0x1) == 0) {
			local46 = arg3 > arg4 ? arg3 : arg4;
			local57 = local15 <= local7 ? local15 : local7;
			while (local46 < local57) {
				if ((this.anIntArrayArray36[local46 - this.anInt4488][local25 - this.anInt4484 - 1] & 0x2) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local11 == arg1 && (arg6 & 0x4) == 0) {
			local46 = arg4 >= arg3 ? arg4 : arg3;
			local57 = local15 <= local7 ? local15 : local7;
			while (local46 < local57) {
				if ((this.anIntArrayArray36[local46 - this.anInt4488][arg1 - this.anInt4484] & 0x20) == 0) {
					return true;
				}
				local46++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZIIIB)V")
	public void method3958(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg1) {
			local5 = 131328;
		}
		@Pc(19) int local19;
		if (arg4 == 1 || arg4 == 3) {
			local19 = arg2;
			arg2 = arg0;
			arg0 = local19;
		}
		if (arg3) {
			local5 |= 0x40000000;
		}
		@Pc(34) int local34 = arg5 - this.anInt4484;
		@Pc(39) int local39 = arg6 - this.anInt4488;
		for (local19 = local39; local19 < arg2 + local39; local19++) {
			if (local19 >= 0 && local19 < this.anInt4480) {
				for (@Pc(58) int local58 = local34; local58 < local34 + arg0; local58++) {
					if (local58 >= 0 && this.anInt4481 > local58) {
						this.method3949(local19, local5, local58);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZZIII)V")
	public void method3959(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt4488;
		@Pc(13) int local13 = arg5 - this.anInt4484;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method3948(local13, 128, local4);
				this.method3948(local13, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method3948(local13, 2, local4);
				this.method3948(local13 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method3948(local13, 8, local4);
				this.method3948(local13, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method3948(local13, 32, local4);
				this.method3948(local13 - 1, 2, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method3948(local13, 1, local4);
				this.method3948(local13 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method3948(local13, 4, local4);
				this.method3948(local13 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method3948(local13, 16, local4);
				this.method3948(local13 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method3948(local13, 64, local4);
				this.method3948(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method3948(local13, 130, local4);
				this.method3948(local13, 8, local4 - 1);
				this.method3948(local13 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method3948(local13, 10, local4);
				this.method3948(local13 + 1, 32, local4);
				this.method3948(local13, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method3948(local13, 40, local4);
				this.method3948(local13, 128, local4 + 1);
				this.method3948(local13 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method3948(local13, 160, local4);
				this.method3948(local13 - 1, 2, local4);
				this.method3948(local13, 8, local4 - 1);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method3948(local13, 65536, local4);
					this.method3948(local13, 4096, local4 - 1);
				}
				if (arg0 == 1) {
					this.method3948(local13, 1024, local4);
					this.method3948(local13 + 1, 16384, local4);
				}
				if (arg0 == 2) {
					this.method3948(local13, 4096, local4);
					this.method3948(local13, 65536, local4 + 1);
				}
				if (arg0 == 3) {
					this.method3948(local13, 16384, local4);
					this.method3948(local13 - 1, 1024, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method3948(local13, 512, local4);
					this.method3948(local13 + 1, 8192, local4 - 1);
				}
				if (arg0 == 1) {
					this.method3948(local13, 2048, local4);
					this.method3948(local13 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method3948(local13, 8192, local4);
					this.method3948(local13 - 1, 512, local4 + 1);
				}
				if (arg0 == 3) {
					this.method3948(local13, 32768, local4);
					this.method3948(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method3948(local13, 66560, local4);
					this.method3948(local13, 4096, local4 - 1);
					this.method3948(local13 + 1, 16384, local4);
				}
				if (arg0 == 1) {
					this.method3948(local13, 5120, local4);
					this.method3948(local13 + 1, 16384, local4);
					this.method3948(local13, 65536, local4 + 1);
				}
				if (arg0 == 2) {
					this.method3948(local13, 20480, local4);
					this.method3948(local13, 65536, local4 + 1);
					this.method3948(local13 - 1, 1024, local4);
				}
				if (arg0 == 3) {
					this.method3948(local13, 81920, local4);
					this.method3948(local13 - 1, 1024, local4);
					this.method3948(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method3948(local13, 536870912, local4);
				this.method3948(local13, 33554432, local4 - 1);
			}
			if (arg0 == 1) {
				this.method3948(local13, 8388608, local4);
				this.method3948(local13 + 1, 134217728, local4);
			}
			if (arg0 == 2) {
				this.method3948(local13, 33554432, local4);
				this.method3948(local13, 536870912, local4 + 1);
			}
			if (arg0 == 3) {
				this.method3948(local13, 134217728, local4);
				this.method3948(local13 - 1, 8388608, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method3948(local13, 4194304, local4);
				this.method3948(local13 + 1, 67108864, local4 - 1);
			}
			if (arg0 == 1) {
				this.method3948(local13, 16777216, local4);
				this.method3948(local13 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method3948(local13, 67108864, local4);
				this.method3948(local13 - 1, 4194304, local4 + 1);
			}
			if (arg0 == 3) {
				this.method3948(local13, 268435456, local4);
				this.method3948(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3948(local13, 545259520, local4);
			this.method3948(local13, 33554432, local4 - 1);
			this.method3948(local13 + 1, 134217728, local4);
		}
		if (arg0 == 1) {
			this.method3948(local13, 41943040, local4);
			this.method3948(local13 + 1, 134217728, local4);
			this.method3948(local13, 536870912, local4 + 1);
		}
		if (arg0 == 2) {
			this.method3948(local13, 167772160, local4);
			this.method3948(local13, 536870912, local4 + 1);
			this.method3948(local13 - 1, 8388608, local4);
		}
		if (arg0 == 3) {
			this.method3948(local13, 671088640, local4);
			this.method3948(local13 - 1, 8388608, local4);
			this.method3948(local13, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg4 && arg5 == arg3) {
				return true;
			}
		} else if (arg4 <= arg6 && arg6 <= arg2 + arg4 - 1 && arg3 <= arg3 && arg3 <= arg3 + arg2 - 1) {
			return true;
		}
		@Pc(43) int local43 = arg3 - this.anInt4484;
		@Pc(48) int local48 = arg5 - this.anInt4484;
		@Pc(53) int local53 = arg4 - this.anInt4488;
		@Pc(58) int local58 = arg6 - this.anInt4488;
		if (arg2 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local53 == local58 + 1 && local43 == local48 && (this.anIntArrayArray36[local53][local48] & 0x80) == 0) {
						return true;
					}
					if (local58 == local53 && local48 == local43 - 1 && (this.anIntArrayArray36[local53][local48] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local53 == local58 - 1 && local43 == local48 && (this.anIntArrayArray36[local53][local48] & 0x8) == 0) {
						return true;
					}
					if (local58 == local53 && local48 == local43 - 1 && (this.anIntArrayArray36[local53][local48] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local53 == local58 - 1 && local48 == local43 && (this.anIntArrayArray36[local53][local48] & 0x8) == 0) {
						return true;
					}
					if (local58 == local53 && local48 == local43 + 1 && (this.anIntArrayArray36[local53][local48] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local58 + 1 == local53 && local43 == local48 && (this.anIntArrayArray36[local53][local48] & 0x80) == 0) {
						return true;
					}
					if (local53 == local58 && local48 == local43 + 1 && (this.anIntArrayArray36[local53][local48] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local53 == local58 && local43 + 1 == local48 && (this.anIntArrayArray36[local53][local48] & 0x20) == 0) {
					return true;
				}
				if (local58 == local53 && local48 == local43 - 1 && (this.anIntArrayArray36[local53][local48] & 0x2) == 0) {
					return true;
				}
				if (local53 == local58 - 1 && local43 == local48 && (this.anIntArrayArray36[local53][local48] & 0x8) == 0) {
					return true;
				}
				if (local58 + 1 == local53 && local43 == local48 && (this.anIntArrayArray36[local53][local48] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(75) int local75 = local53 + arg2 - 1;
			@Pc(81) int local81 = local48 + arg2 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local58 + 1 == local53 && local48 <= local43 && local81 >= local43 && (this.anIntArrayArray36[local53][local43] & 0x80) == 0) {
						return true;
					}
					if (local58 >= local53 && local75 >= local58 && local43 - arg2 == local48 && (this.anIntArrayArray36[local58][local81] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local53 == local58 - arg2 && local43 >= local48 && local43 <= local81 && (this.anIntArrayArray36[local75][local43] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local58 && local75 >= local58 && local48 == local43 - arg2 && (this.anIntArrayArray36[local58][local81] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local58 - arg2 == local53 && local48 <= local43 && local43 <= local81 && (this.anIntArrayArray36[local75][local43] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local58 && local58 <= local75 && local43 + 1 == local48 && (this.anIntArrayArray36[local58][local48] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local58 + 1 == local53 && local48 <= local43 && local43 <= local81 && (this.anIntArrayArray36[local53][local43] & 0x80) == 0) {
						return true;
					}
					if (local53 <= local58 && local58 <= local75 && local43 + 1 == local48 && (this.anIntArrayArray36[local58][local48] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local53 <= local58 && local75 >= local58 && local48 == local43 + 1 && (this.anIntArrayArray36[local58][local48] & 0x20) == 0) {
					return true;
				}
				if (local58 >= local53 && local58 <= local75 && local48 == local43 - arg2 && (this.anIntArrayArray36[local58][local81] & 0x2) == 0) {
					return true;
				}
				if (local53 == local58 - arg2 && local43 >= local48 && local81 >= local43 && (this.anIntArrayArray36[local75][local43] & 0x8) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local43 >= local48 && local81 >= local43 && (this.anIntArrayArray36[local53][local43] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IZI)V")
	public void method3961(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt4484;
		@Pc(21) int local21 = arg1 - this.anInt4488;
		this.anIntArrayArray36[local21][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZZII)V")
	public void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg5 - this.anInt4484;
		@Pc(18) int local18 = arg0 - this.anInt4488;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method3949(local18, 128, local13);
				this.method3949(local18 - 1, 8, local13);
			}
			if (arg4 == 1) {
				this.method3949(local18, 2, local13);
				this.method3949(local18, 32, local13 + 1);
			}
			if (arg4 == 2) {
				this.method3949(local18, 8, local13);
				this.method3949(local18 + 1, 128, local13);
			}
			if (arg4 == 3) {
				this.method3949(local18, 32, local13);
				this.method3949(local18, 2, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method3949(local18, 1, local13);
				this.method3949(local18 - 1, 16, local13 + 1);
			}
			if (arg4 == 1) {
				this.method3949(local18, 4, local13);
				this.method3949(local18 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method3949(local18, 16, local13);
				this.method3949(local18 + 1, 1, local13 - 1);
			}
			if (arg4 == 3) {
				this.method3949(local18, 64, local13);
				this.method3949(local18 - 1, 4, local13 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method3949(local18, 130, local13);
				this.method3949(local18 - 1, 8, local13);
				this.method3949(local18, 32, local13 + 1);
			}
			if (arg4 == 1) {
				this.method3949(local18, 10, local13);
				this.method3949(local18, 32, local13 + 1);
				this.method3949(local18 + 1, 128, local13);
			}
			if (arg4 == 2) {
				this.method3949(local18, 40, local13);
				this.method3949(local18 + 1, 128, local13);
				this.method3949(local18, 2, local13 - 1);
			}
			if (arg4 == 3) {
				this.method3949(local18, 160, local13);
				this.method3949(local18, 2, local13 - 1);
				this.method3949(local18 - 1, 8, local13);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method3949(local18, 65536, local13);
					this.method3949(local18 - 1, 4096, local13);
				}
				if (arg4 == 1) {
					this.method3949(local18, 1024, local13);
					this.method3949(local18, 16384, local13 + 1);
				}
				if (arg4 == 2) {
					this.method3949(local18, 4096, local13);
					this.method3949(local18 + 1, 65536, local13);
				}
				if (arg4 == 3) {
					this.method3949(local18, 16384, local13);
					this.method3949(local18, 1024, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method3949(local18, 512, local13);
					this.method3949(local18 - 1, 8192, local13 + 1);
				}
				if (arg4 == 1) {
					this.method3949(local18, 2048, local13);
					this.method3949(local18 + 1, 32768, local13 + 1);
				}
				if (arg4 == 2) {
					this.method3949(local18, 8192, local13);
					this.method3949(local18 + 1, 512, local13 - 1);
				}
				if (arg4 == 3) {
					this.method3949(local18, 32768, local13);
					this.method3949(local18 - 1, 2048, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method3949(local18, 66560, local13);
					this.method3949(local18 - 1, 4096, local13);
					this.method3949(local18, 16384, local13 + 1);
				}
				if (arg4 == 1) {
					this.method3949(local18, 5120, local13);
					this.method3949(local18, 16384, local13 + 1);
					this.method3949(local18 + 1, 65536, local13);
				}
				if (arg4 == 2) {
					this.method3949(local18, 20480, local13);
					this.method3949(local18 + 1, 65536, local13);
					this.method3949(local18, 1024, local13 - 1);
				}
				if (arg4 == 3) {
					this.method3949(local18, 81920, local13);
					this.method3949(local18, 1024, local13 - 1);
					this.method3949(local18 - 1, 4096, local13);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method3949(local18, 536870912, local13);
				this.method3949(local18 - 1, 33554432, local13);
			}
			if (arg4 == 1) {
				this.method3949(local18, 8388608, local13);
				this.method3949(local18, 134217728, local13 + 1);
			}
			if (arg4 == 2) {
				this.method3949(local18, 33554432, local13);
				this.method3949(local18 + 1, 536870912, local13);
			}
			if (arg4 == 3) {
				this.method3949(local18, 134217728, local13);
				this.method3949(local18, 8388608, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method3949(local18, 4194304, local13);
				this.method3949(local18 - 1, 67108864, local13 + 1);
			}
			if (arg4 == 1) {
				this.method3949(local18, 16777216, local13);
				this.method3949(local18 + 1, 268435456, local13 + 1);
			}
			if (arg4 == 2) {
				this.method3949(local18, 67108864, local13);
				this.method3949(local18 + 1, 4194304, local13 - 1);
			}
			if (arg4 == 3) {
				this.method3949(local18, 268435456, local13);
				this.method3949(local18 - 1, 16777216, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method3949(local18, 545259520, local13);
			this.method3949(local18 - 1, 33554432, local13);
			this.method3949(local18, 134217728, local13 + 1);
		}
		if (arg4 == 1) {
			this.method3949(local18, 41943040, local13);
			this.method3949(local18, 134217728, local13 + 1);
			this.method3949(local18 + 1, 536870912, local13);
		}
		if (arg4 == 2) {
			this.method3949(local18, 167772160, local13);
			this.method3949(local18 + 1, 536870912, local13);
			this.method3949(local18, 8388608, local13 - 1);
		}
		if (arg4 == 3) {
			this.method3949(local18, 671088640, local13);
			this.method3949(local18, 8388608, local13 - 1);
			this.method3949(local18 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
	public void method3963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4488;
		@Pc(9) int local9 = arg1 - this.anInt4484;
		this.anIntArrayArray36[local4][local9] &= 0xFFFBFFFF;
	}
}

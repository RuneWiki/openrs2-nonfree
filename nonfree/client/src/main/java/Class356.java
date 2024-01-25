import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class356 {

	@OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
	public int anInt9604;

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
	public int anInt9606;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
	public int anInt9609;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!uda", name = "v", descriptor = "I")
	public int anInt9620;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBIIIIIIII)Z")
	public boolean method8384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg4 + arg5;
		@Pc(14) int local14 = arg6 + arg8;
		@Pc(26) int local26 = arg2 + arg3;
		@Pc(30) int local30 = arg7 + arg0;
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (local26 == arg4 && (arg1 & 0x2) == 0) {
			local67 = arg0 < arg8 ? arg8 : arg0;
			local75 = local14 < local30 ? local14 : local30;
			while (local67 < local75) {
				if ((this.anIntArrayArray53[local26 - this.anInt9620 - 1][local67 - this.anInt9604] & 0x8) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local10 == arg3 && (arg1 & 0x8) == 0) {
			local67 = arg0 >= arg8 ? arg0 : arg8;
			local75 = local30 <= local14 ? local30 : local14;
			while (local75 > local67) {
				if ((this.anIntArrayArray53[arg3 - this.anInt9620][local67 - this.anInt9604] & 0x80) == 0) {
					return true;
				}
				local67++;
			}
		} else if (arg8 == local30 && (arg1 & 0x1) == 0) {
			local67 = arg3 >= arg4 ? arg3 : arg4;
			local75 = local26 > local10 ? local10 : local26;
			while (local75 > local67) {
				if ((this.anIntArrayArray53[local67 - this.anInt9620][local30 - this.anInt9604 - 1] & 0x2) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local14 == arg0 && (arg1 & 0x4) == 0) {
			local67 = arg3 >= arg4 ? arg3 : arg4;
			local75 = local10 < local26 ? local10 : local26;
			while (local67 < local75) {
				if ((this.anIntArrayArray53[local67 - this.anInt9620][arg0 - this.anInt9604] & 0x20) == 0) {
					return true;
				}
				local67++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIZ)V")
	public void method8385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9604;
		@Pc(9) int local9 = arg1 - this.anInt9620;
		this.anIntArrayArray53[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)V")
	public void method8387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt9620;
		@Pc(13) int local13 = arg1 - this.anInt9604;
		this.anIntArrayArray53[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIII)V")
	private void method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 == 3) {
			this.anIntArrayArray53[arg0][arg1] &= ~arg2;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIZIIZII)V")
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt9604;
		@Pc(23) int local23 = arg6 - this.anInt9620;
		@Pc(37) int local37;
		if (arg1 == 1 || arg1 == 3) {
			local37 = arg3;
			arg3 = arg5;
			arg5 = local37;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (local37 = local23; local37 < local23 + arg3; local37++) {
			if (local37 >= 0 && local37 < this.anInt9609) {
				for (@Pc(67) int local67 = local18; local67 < arg5 + local18; local67++) {
					if (local67 >= 0 && this.anInt9606 > local67) {
						this.method8388(local37, local67, local7, 3);
					}
				}
			}
		}
		if (-7045 != -7045) {
			Static609.method8395(-71, -24, 108, 71, -19, 109, 24, -88);
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIZI)Z")
	public boolean method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static51.method616(arg4, arg3, arg1, arg4, arg5, arg7, arg0, arg2) ? true : this.method8384(arg0, arg6, arg2, arg5, arg3, arg4, arg4, arg7, arg1);
		}
		@Pc(48) int local48 = arg2 + arg5 - 1;
		@Pc(54) int local54 = arg0 + arg7 - 1;
		if (arg5 <= arg3 && local48 >= arg3 && arg1 >= arg0 && local54 >= arg1) {
			return true;
		} else if (arg5 - 1 == arg3 && arg1 >= arg0 && local54 >= arg1 && (this.anIntArrayArray53[arg3 - this.anInt9620][arg1 - this.anInt9604] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == local48 + 1 && arg1 >= arg0 && arg1 <= local54 && (this.anIntArrayArray53[arg3 - this.anInt9620][arg1 - this.anInt9604] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg1 && arg5 <= arg3 && arg3 <= local48 && (this.anIntArrayArray53[arg3 - this.anInt9620][arg1 - this.anInt9604] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local54 + 1 == arg1 && arg5 <= arg3 && local48 >= arg3 && (this.anIntArrayArray53[arg3 - this.anInt9620][arg1 - this.anInt9604] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBI)V")
	public void method8391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 - this.anInt9604;
		@Pc(23) int local23 = arg0 - this.anInt9620;
		this.anIntArrayArray53[local23][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method8392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg3 && arg4 == arg0) {
				return true;
			}
		} else if (arg2 >= arg3 && arg6 + arg3 - 1 >= arg2 && arg4 >= arg4 && arg4 <= arg6 + arg4 - 1) {
			return true;
		}
		@Pc(67) int local67 = arg2 - this.anInt9620;
		@Pc(72) int local72 = arg3 - this.anInt9620;
		@Pc(77) int local77 = arg4 - this.anInt9604;
		@Pc(82) int local82 = arg0 - this.anInt9604;
		if (arg6 == 1) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local67 - 1 == local72 && local77 == local82) {
						return true;
					}
					if (local67 == local72 && local82 == local77 + 1 && (this.anIntArrayArray53[local72][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local77 - 1 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local67 && local77 + 1 == local82) {
						return true;
					}
					if (local72 == local67 - 1 && local77 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local77 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 + 1 && local82 == local77) {
						return true;
					}
					if (local72 == local67 && local77 + 1 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local77 - 1 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local72 == local67 && local77 - 1 == local82) {
						return true;
					}
					if (local67 - 1 == local72 && local82 == local77 && (this.anIntArrayArray53[local72][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local77 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local67 - 1 == local72 && local82 == local77) {
						return true;
					}
					if (local72 == local67 && local77 + 1 == local82) {
						return true;
					}
					if (local72 == local67 + 1 && local82 == local77 && (this.anIntArrayArray53[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local82 == local77 - 1 && (this.anIntArrayArray53[local72][local82] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local67 - 1 == local72 && local82 == local77 && (this.anIntArrayArray53[local72][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 && local77 + 1 == local82) {
						return true;
					}
					if (local72 == local67 + 1 && local77 == local82) {
						return true;
					}
					if (local67 == local72 && local77 - 1 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 - 1 && local82 == local77 && (this.anIntArrayArray53[local72][local82] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local72 && local77 + 1 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local82 == local77) {
						return true;
					}
					if (local72 == local67 && local82 == local77 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local72 == local67 - 1 && local77 == local82) {
						return true;
					}
					if (local72 == local67 && local77 + 1 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local77 == local82 && (this.anIntArrayArray53[local72][local82] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local67 && local82 == local77 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local67 == local72 && local82 == local77 + 1 && (this.anIntArrayArray53[local72][local82] & 0x20) == 0) {
					return true;
				}
				if (local67 == local72 && local82 == local77 - 1 && (this.anIntArrayArray53[local72][local82] & 0x2) == 0) {
					return true;
				}
				if (local72 == local67 - 1 && local82 == local77 && (this.anIntArrayArray53[local72][local82] & 0x8) == 0) {
					return true;
				}
				if (local67 + 1 == local72 && local77 == local82 && (this.anIntArrayArray53[local72][local82] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(93) int local93 = local72 + arg6 - 1;
			@Pc(99) int local99 = arg6 + local82 - 1;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local72 == local67 - arg6 && local82 <= local77 && local99 >= local77) {
						return true;
					}
					if (local67 >= local72 && local67 <= local93 && local82 == local77 + 1 && (this.anIntArrayArray53[local67][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local72 && local93 >= local67 && local82 == local77 - arg6 && (this.anIntArrayArray53[local67][local99] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 <= local67 && local93 >= local67 && local77 + 1 == local82) {
						return true;
					}
					if (local72 == local67 - arg6 && local77 >= local82 && local77 <= local99 && (this.anIntArrayArray53[local93][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local77 >= local82 && local99 >= local77 && (this.anIntArrayArray53[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 + 1 && local82 <= local77 && local77 <= local99) {
						return true;
					}
					if (local67 >= local72 && local93 >= local67 && local77 + 1 == local82 && (this.anIntArrayArray53[local67][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 <= local67 && local67 <= local93 && local82 == local77 - arg6 && (this.anIntArrayArray53[local67][local99] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local72 <= local67 && local67 <= local93 && local82 == local77 - arg6) {
						return true;
					}
					if (local67 - arg6 == local72 && local82 <= local77 && local99 >= local77 && (this.anIntArrayArray53[local93][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local82 <= local77 && local77 <= local99 && (this.anIntArrayArray53[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local72 == local67 - arg6 && local77 >= local82 && local77 <= local99) {
						return true;
					}
					if (local67 >= local72 && local93 >= local67 && local77 + 1 == local82) {
						return true;
					}
					if (local67 + 1 == local72 && local77 >= local82 && local77 <= local99 && (this.anIntArrayArray53[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local67 && local93 >= local67 && local77 - arg6 == local82 && (this.anIntArrayArray53[local67][local99] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local67 - arg6 && local77 >= local82 && local99 >= local77 && (this.anIntArrayArray53[local93][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 >= local72 && local93 >= local67 && local77 + 1 == local82) {
						return true;
					}
					if (local72 == local67 + 1 && local77 >= local82 && local77 <= local99) {
						return true;
					}
					if (local67 >= local72 && local67 <= local93 && local77 - arg6 == local82 && (this.anIntArrayArray53[local67][local99] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local67 - arg6 && local77 >= local82 && local99 >= local77 && (this.anIntArrayArray53[local93][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 >= local72 && local93 >= local67 && local77 + 1 == local82 && (this.anIntArrayArray53[local67][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local77 >= local82 && local99 >= local77) {
						return true;
					}
					if (local72 <= local67 && local93 >= local67 && local77 - arg6 == local82) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 - arg6 == local72 && local82 <= local77 && local77 <= local99) {
						return true;
					}
					if (local72 <= local67 && local67 <= local93 && local77 + 1 == local82 && (this.anIntArrayArray53[local67][local82] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local77 >= local82 && local99 >= local77 && (this.anIntArrayArray53[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local67 && local93 >= local67 && local77 - arg6 == local82) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local72 <= local67 && local93 >= local67 && local77 + 1 == local82 && (this.anIntArrayArray53[local67][local82] & 0x2C0120) == 0) {
					return true;
				}
				if (local72 <= local67 && local67 <= local93 && local82 == local77 - arg6 && (this.anIntArrayArray53[local67][local99] & 0x2C0102) == 0) {
					return true;
				}
				if (local67 - arg6 == local72 && local77 >= local82 && local99 >= local77 && (this.anIntArrayArray53[local93][local77] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 + 1 == local72 && local77 >= local82 && local77 <= local99 && (this.anIntArrayArray53[local72][local77] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)V")
	public void method8393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt9620;
		@Pc(13) int local13 = arg1 - this.anInt9604;
		this.anIntArrayArray53[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIBI)V")
	private void method8394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray53[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIZIIIZ)V")
	public void method8396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg3 - this.anInt9620;
		@Pc(13) int local13 = arg4 - this.anInt9604;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method8394(local4, 128, local13);
				this.method8394(local4 - 1, 8, local13);
			}
			if (arg1 == 1) {
				this.method8394(local4, 2, local13);
				this.method8394(local4, 32, local13 + 1);
			}
			if (arg1 == 2) {
				this.method8394(local4, 8, local13);
				this.method8394(local4 + 1, 128, local13);
			}
			if (arg1 == 3) {
				this.method8394(local4, 32, local13);
				this.method8394(local4, 2, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method8394(local4, 1, local13);
				this.method8394(local4 - 1, 16, local13 + 1);
			}
			if (arg1 == 1) {
				this.method8394(local4, 4, local13);
				this.method8394(local4 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method8394(local4, 16, local13);
				this.method8394(local4 + 1, 1, local13 - 1);
			}
			if (arg1 == 3) {
				this.method8394(local4, 64, local13);
				this.method8394(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method8394(local4, 130, local13);
				this.method8394(local4 - 1, 8, local13);
				this.method8394(local4, 32, local13 + 1);
			}
			if (arg1 == 1) {
				this.method8394(local4, 10, local13);
				this.method8394(local4, 32, local13 + 1);
				this.method8394(local4 + 1, 128, local13);
			}
			if (arg1 == 2) {
				this.method8394(local4, 40, local13);
				this.method8394(local4 + 1, 128, local13);
				this.method8394(local4, 2, local13 - 1);
			}
			if (arg1 == 3) {
				this.method8394(local4, 160, local13);
				this.method8394(local4, 2, local13 - 1);
				this.method8394(local4 - 1, 8, local13);
			}
		}
		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method8394(local4, 65536, local13);
					this.method8394(local4 - 1, 4096, local13);
				}
				if (arg1 == 1) {
					this.method8394(local4, 1024, local13);
					this.method8394(local4, 16384, local13 + 1);
				}
				if (arg1 == 2) {
					this.method8394(local4, 4096, local13);
					this.method8394(local4 + 1, 65536, local13);
				}
				if (arg1 == 3) {
					this.method8394(local4, 16384, local13);
					this.method8394(local4, 1024, local13 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method8394(local4, 512, local13);
					this.method8394(local4 - 1, 8192, local13 + 1);
				}
				if (arg1 == 1) {
					this.method8394(local4, 2048, local13);
					this.method8394(local4 + 1, 32768, local13 + 1);
				}
				if (arg1 == 2) {
					this.method8394(local4, 8192, local13);
					this.method8394(local4 + 1, 512, local13 - 1);
				}
				if (arg1 == 3) {
					this.method8394(local4, 32768, local13);
					this.method8394(local4 - 1, 2048, local13 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method8394(local4, 66560, local13);
					this.method8394(local4 - 1, 4096, local13);
					this.method8394(local4, 16384, local13 + 1);
				}
				if (arg1 == 1) {
					this.method8394(local4, 5120, local13);
					this.method8394(local4, 16384, local13 + 1);
					this.method8394(local4 + 1, 65536, local13);
				}
				if (arg1 == 2) {
					this.method8394(local4, 20480, local13);
					this.method8394(local4 + 1, 65536, local13);
					this.method8394(local4, 1024, local13 - 1);
				}
				if (arg1 == 3) {
					this.method8394(local4, 81920, local13);
					this.method8394(local4, 1024, local13 - 1);
					this.method8394(local4 - 1, 4096, local13);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method8394(local4, 536870912, local13);
				this.method8394(local4 - 1, 33554432, local13);
			}
			if (arg1 == 1) {
				this.method8394(local4, 8388608, local13);
				this.method8394(local4, 134217728, local13 + 1);
			}
			if (arg1 == 2) {
				this.method8394(local4, 33554432, local13);
				this.method8394(local4 + 1, 536870912, local13);
			}
			if (arg1 == 3) {
				this.method8394(local4, 134217728, local13);
				this.method8394(local4, 8388608, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method8394(local4, 4194304, local13);
				this.method8394(local4 - 1, 67108864, local13 + 1);
			}
			if (arg1 == 1) {
				this.method8394(local4, 16777216, local13);
				this.method8394(local4 + 1, 268435456, local13 + 1);
			}
			if (arg1 == 2) {
				this.method8394(local4, 67108864, local13);
				this.method8394(local4 + 1, 4194304, local13 - 1);
			}
			if (arg1 == 3) {
				this.method8394(local4, 268435456, local13);
				this.method8394(local4 - 1, 16777216, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method8394(local4, 545259520, local13);
			this.method8394(local4 - 1, 33554432, local13);
			this.method8394(local4, 134217728, local13 + 1);
		}
		if (arg1 == 1) {
			this.method8394(local4, 41943040, local13);
			this.method8394(local4, 134217728, local13 + 1);
			this.method8394(local4 + 1, 536870912, local13);
		}
		if (arg1 == 2) {
			this.method8394(local4, 167772160, local13);
			this.method8394(local4 + 1, 536870912, local13);
			this.method8394(local4, 8388608, local13 - 1);
		}
		if (arg1 == 3) {
			this.method8394(local4, 671088640, local13);
			this.method8394(local4, 8388608, local13 - 1);
			this.method8394(local4 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIZBZI)V")
	public void method8397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(31) int local31 = arg0 - this.anInt9604;
		@Pc(36) int local36 = arg5 - this.anInt9620;
		for (@Pc(38) int local38 = local36; local38 < local36 + arg1; local38++) {
			if (local38 >= 0 && local38 < this.anInt9609) {
				for (@Pc(52) int local52 = local31; local52 < local31 + arg2; local52++) {
					if (local52 >= 0 && local52 < this.anInt9606) {
						this.method8394(local38, local7, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method8398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg0 && arg6 == arg2) {
				return true;
			}
		} else if (arg0 <= arg4 && arg4 <= arg0 + arg5 - 1 && arg6 <= arg6 && arg6 + arg5 - 1 >= arg6) {
			return true;
		}
		@Pc(68) int local68 = arg0 - this.anInt9620;
		@Pc(73) int local73 = arg4 - this.anInt9620;
		@Pc(78) int local78 = arg6 - this.anInt9604;
		@Pc(89) int local89 = arg2 - this.anInt9604;
		if (arg5 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local68 == local73 + 1 && local78 == local89 && (this.anIntArrayArray53[local68][local89] & 0x80) == 0) {
						return true;
					}
					if (local73 == local68 && local78 - 1 == local89 && (this.anIntArrayArray53[local68][local89] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 - 1 == local68 && local78 == local89 && (this.anIntArrayArray53[local68][local89] & 0x8) == 0) {
						return true;
					}
					if (local68 == local73 && local89 == local78 - 1 && (this.anIntArrayArray53[local68][local89] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local68 == local73 - 1 && local78 == local89 && (this.anIntArrayArray53[local68][local89] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local78 + 1 == local89 && (this.anIntArrayArray53[local68][local89] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 + 1 == local68 && local89 == local78 && (this.anIntArrayArray53[local68][local89] & 0x80) == 0) {
						return true;
					}
					if (local68 == local73 && local89 == local78 + 1 && (this.anIntArrayArray53[local68][local89] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local73 == local68 && local78 + 1 == local89 && (this.anIntArrayArray53[local68][local89] & 0x20) == 0) {
					return true;
				}
				if (local73 == local68 && local89 == local78 - 1 && (this.anIntArrayArray53[local68][local89] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local68 && local78 == local89 && (this.anIntArrayArray53[local68][local89] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local89 == local78 && (this.anIntArrayArray53[local68][local89] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(499) int local499 = arg5 + local68 - 1;
			@Pc(505) int local505 = local89 + arg5 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local68 == local73 + 1 && local89 <= local78 && local505 >= local78 && (this.anIntArrayArray53[local68][local78] & 0x80) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local499 && local78 - arg5 == local89 && (this.anIntArrayArray53[local73][local505] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local68 == local73 - arg5 && local89 <= local78 && local78 <= local505 && (this.anIntArrayArray53[local499][local78] & 0x8) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local499 && local78 - arg5 == local89 && (this.anIntArrayArray53[local73][local505] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 - arg5 == local68 && local78 >= local89 && local505 >= local78 && (this.anIntArrayArray53[local499][local78] & 0x8) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local499 && local78 + 1 == local89 && (this.anIntArrayArray53[local73][local89] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local68 == local73 + 1 && local89 <= local78 && local505 >= local78 && (this.anIntArrayArray53[local68][local78] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local499 && local89 == local78 + 1 && (this.anIntArrayArray53[local73][local89] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local68 <= local73 && local499 >= local73 && local89 == local78 + 1 && (this.anIntArrayArray53[local73][local89] & 0x20) == 0) {
					return true;
				}
				if (local73 >= local68 && local499 >= local73 && local78 - arg5 == local89 && (this.anIntArrayArray53[local73][local505] & 0x2) == 0) {
					return true;
				}
				if (local73 - arg5 == local68 && local78 >= local89 && local78 <= local505 && (this.anIntArrayArray53[local499][local78] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local68 && local89 <= local78 && local78 <= local505 && (this.anIntArrayArray53[local68][local78] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIZIZI)V")
	public void method8399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(4) int local4 = arg2 - this.anInt9604;
		@Pc(13) int local13 = arg6 - this.anInt9620;
		if (arg4 != 134217728) {
			this.method8398(-100, 13, 41, -64, 38, 94, 105);
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method8388(local13, local4, 128, 3);
				this.method8388(local13 - 1, local4, 8, 3);
			}
			if (arg0 == 1) {
				this.method8388(local13, local4, 2, 3);
				this.method8388(local13, local4 + 1, 32, 3);
			}
			if (arg0 == 2) {
				this.method8388(local13, local4, 8, 3);
				this.method8388(local13 + 1, local4, 128, arg4 ^ 0x8000003);
			}
			if (arg0 == 3) {
				this.method8388(local13, local4, 32, 3);
				this.method8388(local13, local4 - 1, 2, 3);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method8388(local13, local4, 1, 3);
				this.method8388(local13 - 1, local4 - -1, 16, 3);
			}
			if (arg0 == 1) {
				this.method8388(local13, local4, 4, 3);
				this.method8388(local13 + 1, local4 + 1, 64, 3);
			}
			if (arg0 == 2) {
				this.method8388(local13, local4, 16, arg4 - 134217725);
				this.method8388(local13 + 1, local4 + -1, 1, 3);
			}
			if (arg0 == 3) {
				this.method8388(local13, local4, 64, arg4 - 134217725);
				this.method8388(local13 - 1, local4 + -1, 4, 3);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method8388(local13, local4, 130, 3);
				this.method8388(local13 - 1, local4, 8, arg4 ^ 0x8000003);
				this.method8388(local13, local4 + 1, 32, 3);
			}
			if (arg0 == 1) {
				this.method8388(local13, local4, 10, 3);
				this.method8388(local13, local4 + 1, 32, 3);
				this.method8388(local13 + 1, local4, 128, arg4 ^ 0x8000003);
			}
			if (arg0 == 2) {
				this.method8388(local13, local4, 40, 3);
				this.method8388(local13 + 1, local4, 128, arg4 - 134217725);
				this.method8388(local13, local4 - 1, 2, arg4 ^ 0x8000003);
			}
			if (arg0 == 3) {
				this.method8388(local13, local4, 160, 3);
				this.method8388(local13, local4 - 1, 2, 3);
				this.method8388(local13 - 1, local4, 8, 3);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method8388(local13, local4, 65536, 3);
					this.method8388(local13 - 1, local4, 4096, arg4 ^ 0x8000003);
				}
				if (arg0 == 1) {
					this.method8388(local13, local4, 1024, 3);
					this.method8388(local13, local4 + 1, 16384, 3);
				}
				if (arg0 == 2) {
					this.method8388(local13, local4, 4096, arg4 - 134217725);
					this.method8388(local13 + 1, local4, 65536, arg4 ^ 0x8000003);
				}
				if (arg0 == 3) {
					this.method8388(local13, local4, 16384, 3);
					this.method8388(local13, local4 - 1, 1024, 3);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method8388(local13, local4, 512, 3);
					this.method8388(local13 - 1, local4 + 1, 8192, arg4 ^ 0x8000003);
				}
				if (arg0 == 1) {
					this.method8388(local13, local4, 2048, 3);
					this.method8388(local13 + 1, local4 + 1, 32768, 3);
				}
				if (arg0 == 2) {
					this.method8388(local13, local4, 8192, 3);
					this.method8388(local13 + 1, local4 + -1, 512, arg4 ^ 0x8000003);
				}
				if (arg0 == 3) {
					this.method8388(local13, local4, 32768, 3);
					this.method8388(local13 - 1, local4 + -1, 2048, 3);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method8388(local13, local4, 66560, arg4 - 134217725);
					this.method8388(local13 - 1, local4, 4096, 3);
					this.method8388(local13, local4 + 1, 16384, arg4 ^ 0x8000003);
				}
				if (arg0 == 1) {
					this.method8388(local13, local4, 5120, 3);
					this.method8388(local13, local4 + 1, 16384, 3);
					this.method8388(local13 + 1, local4, 65536, 3);
				}
				if (arg0 == 2) {
					this.method8388(local13, local4, 20480, arg4 ^ 0x8000003);
					this.method8388(local13 + 1, local4, 65536, 3);
					this.method8388(local13, local4 - 1, 1024, 3);
				}
				if (arg0 == 3) {
					this.method8388(local13, local4, 81920, arg4 ^ 0x8000003);
					this.method8388(local13, local4 - 1, 1024, 3);
					this.method8388(local13 - 1, local4, 4096, 3);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method8388(local13, local4, 536870912, 3);
				this.method8388(local13 - 1, local4, 33554432, 3);
			}
			if (arg0 == 1) {
				this.method8388(local13, local4, 8388608, 3);
				this.method8388(local13, local4 + 1, 134217728, 3);
			}
			if (arg0 == 2) {
				this.method8388(local13, local4, 33554432, 3);
				this.method8388(local13 + 1, local4, 536870912, arg4 - 134217725);
			}
			if (arg0 == 3) {
				this.method8388(local13, local4, 134217728, 3);
				this.method8388(local13, local4 - 1, 8388608, 3);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method8388(local13, local4, 4194304, 3);
				this.method8388(local13 - 1, local4 - -1, 67108864, 3);
			}
			if (arg0 == 1) {
				this.method8388(local13, local4, 16777216, 3);
				this.method8388(local13 + 1, local4 - -1, 268435456, 3);
			}
			if (arg0 == 2) {
				this.method8388(local13, local4, 67108864, 3);
				this.method8388(local13 + 1, local4 + -1, 4194304, 3);
			}
			if (arg0 == 3) {
				this.method8388(local13, local4, 268435456, 3);
				this.method8388(local13 - 1, local4 - 1, 16777216, 3);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method8388(local13, local4, 545259520, 3);
			this.method8388(local13 - 1, local4, 33554432, arg4 - 134217725);
			this.method8388(local13, local4 + 1, 134217728, 3);
		}
		if (arg0 == 1) {
			this.method8388(local13, local4, 41943040, arg4 - 134217725);
			this.method8388(local13, local4 + 1, 134217728, 3);
			this.method8388(local13 + 1, local4, 536870912, 3);
		}
		if (arg0 == 2) {
			this.method8388(local13, local4, 167772160, 3);
			this.method8388(local13 + 1, local4, 536870912, 3);
			this.method8388(local13, local4 - 1, 8388608, 3);
		}
		if (arg0 == 3) {
			this.method8388(local13, local4, 671088640, 3);
			this.method8388(local13, local4 - 1, 8388608, arg4 ^ 0x8000003);
			this.method8388(local13 - 1, local4, 33554432, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V")
	public void method8400() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9609; local3++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt9606; local9++) {
				if (local3 == 0 || local9 == 0 || this.anInt9609 - 5 <= local3 || this.anInt9606 - 5 <= local9) {
					this.anIntArrayArray53[local3][local9] = -1;
				} else {
					this.anIntArrayArray53[local3][local9] = 2097152;
				}
			}
		}
		if (false) {
			this.method8399(111, 119, -3, true, -124, true, -53);
		}
	}
}

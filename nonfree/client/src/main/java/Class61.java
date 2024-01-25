import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class61 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public int anInt1578;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public int anInt1579;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public int anInt1580;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public int anInt1585;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg6 && arg2 == arg0) {
				return true;
			}
		} else if (arg6 >= arg3 && arg6 <= arg3 + arg4 - 1 && arg0 >= arg0 && arg0 + arg4 - 1 >= arg0) {
			return true;
		}
		@Pc(67) int local67 = arg3 - this.anInt1585;
		@Pc(72) int local72 = arg6 - this.anInt1585;
		@Pc(77) int local77 = arg0 - this.anInt1580;
		@Pc(82) int local82 = arg2 - this.anInt1580;
		if (arg4 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local72 + 1 == local67 && local82 == local77 && (this.anIntArrayArray18[local67][local82] & 0x80) == 0) {
						return true;
					}
					if (local67 == local72 && local82 == local77 - 1 && (this.anIntArrayArray18[local67][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 - 1 == local67 && local77 == local82 && (this.anIntArrayArray18[local67][local82] & 0x8) == 0) {
						return true;
					}
					if (local67 == local72 && local82 == local77 - 1 && (this.anIntArrayArray18[local67][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 == local72 - 1 && local77 == local82 && (this.anIntArrayArray18[local67][local82] & 0x8) == 0) {
						return true;
					}
					if (local72 == local67 && local77 + 1 == local82 && (this.anIntArrayArray18[local67][local82] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local72 + 1 == local67 && local77 == local82 && (this.anIntArrayArray18[local67][local82] & 0x80) == 0) {
						return true;
					}
					if (local72 == local67 && local82 == local77 + 1 && (this.anIntArrayArray18[local67][local82] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local72 == local67 && local82 == local77 + 1 && (this.anIntArrayArray18[local67][local82] & 0x20) == 0) {
					return true;
				}
				if (local72 == local67 && local77 - 1 == local82 && (this.anIntArrayArray18[local67][local82] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local67 && local77 == local82 && (this.anIntArrayArray18[local67][local82] & 0x8) == 0) {
					return true;
				}
				if (local67 == local72 + 1 && local77 == local82 && (this.anIntArrayArray18[local67][local82] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(91) int local91 = local67 + arg4 - 1;
			@Pc(97) int local97 = arg4 + local82 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local72 + 1 == local67 && local82 <= local77 && local97 >= local77 && (this.anIntArrayArray18[local67][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local67 && local91 >= local72 && local82 == local77 - arg4 && (this.anIntArrayArray18[local72][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 - arg4 == local67 && local77 >= local82 && local97 >= local77 && (this.anIntArrayArray18[local91][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 >= local67 && local91 >= local72 && local77 - arg4 == local82 && (this.anIntArrayArray18[local72][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 == local72 - arg4 && local82 <= local77 && local77 <= local97 && (this.anIntArrayArray18[local91][local77] & 0x8) == 0) {
						return true;
					}
					if (local67 <= local72 && local91 >= local72 && local77 + 1 == local82 && (this.anIntArrayArray18[local72][local82] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local72 + 1 == local67 && local82 <= local77 && local97 >= local77 && (this.anIntArrayArray18[local67][local77] & 0x80) == 0) {
						return true;
					}
					if (local67 <= local72 && local72 <= local91 && local82 == local77 + 1 && (this.anIntArrayArray18[local72][local82] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local72 >= local67 && local72 <= local91 && local82 == local77 + 1 && (this.anIntArrayArray18[local72][local82] & 0x20) == 0) {
					return true;
				}
				if (local67 <= local72 && local72 <= local91 && local82 == local77 - arg4 && (this.anIntArrayArray18[local72][local97] & 0x2) == 0) {
					return true;
				}
				if (local67 == local72 - arg4 && local77 >= local82 && local77 <= local97 && (this.anIntArrayArray18[local91][local77] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local67 && local82 <= local77 && local97 >= local77 && (this.anIntArrayArray18[local67][local77] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public void method1480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1580;
		@Pc(13) int local13 = arg0 - this.anInt1585;
		this.anIntArrayArray18[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIZIII)V")
	public void method1481(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(22) int local22 = arg5 - this.anInt1585;
		@Pc(27) int local27 = arg2 - this.anInt1580;
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (@Pc(35) int local35 = local22; local35 < local22 + arg4; local35++) {
			if (local35 >= 0 && this.anInt1578 > local35) {
				for (@Pc(52) int local52 = local27; local52 < arg1 + local27; local52++) {
					if (local52 >= 0 && local52 < this.anInt1579) {
						this.method1486(local7, local35, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
	private void method1482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray18[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public void method1483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt1580;
		@Pc(17) int local17 = arg1 - this.anInt1585;
		this.anIntArrayArray18[local17][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V")
	public void method1484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1580;
		@Pc(13) int local13 = arg1 - this.anInt1585;
		this.anIntArrayArray18[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(25) int local25 = arg1 + arg8;
		@Pc(29) int local29 = arg3 + arg4;
		@Pc(33) int local33 = arg6 + arg5;
		@Pc(37) int local37 = arg0 + arg7;
		@Pc(54) int local54;
		@Pc(65) int local65;
		if (arg1 == local33 && (arg2 & 0x2) == 0) {
			local54 = arg7 < arg3 ? arg3 : arg7;
			local65 = local37 <= local29 ? local37 : local29;
			while (local65 > local54) {
				if ((this.anIntArrayArray18[local33 - this.anInt1585 - 1][local54 - this.anInt1580] & 0x8) == 0) {
					return true;
				}
				local54++;
			}
		} else if (arg5 == local25 && (arg2 & 0x8) == 0) {
			local54 = arg3 > arg7 ? arg3 : arg7;
			local65 = local29 < local37 ? local29 : local37;
			while (local54 < local65) {
				if ((this.anIntArrayArray18[arg5 - this.anInt1585][local54 - this.anInt1580] & 0x80) == 0) {
					return true;
				}
				local54++;
			}
		} else if (local37 == arg3 && (arg2 & 0x1) == 0) {
			local54 = arg1 > arg5 ? arg1 : arg5;
			local65 = local33 <= local25 ? local33 : local25;
			while (local54 < local65) {
				if ((this.anIntArrayArray18[local54 - this.anInt1585][local37 - this.anInt1580 - 1] & 0x2) == 0) {
					return true;
				}
				local54++;
			}
		} else if (arg7 == local29 && (arg2 & 0x4) == 0) {
			local54 = arg1 <= arg5 ? arg5 : arg1;
			local65 = local33 <= local25 ? local33 : local25;
			while (local54 < local65) {
				if ((this.anIntArrayArray18[local54 - this.anInt1585][arg7 - this.anInt1580] & 0x20) == 0) {
					return true;
				}
				local54++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
	private void method1486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray18[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method1487() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1578; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1579; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt1578 - 5 || local7 >= this.anInt1579 - 5) {
					this.anIntArrayArray18[local3][local7] = -1;
				} else {
					this.anIntArrayArray18[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIZIBIII)V")
	public void method1488(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = 256;
		if (arg0) {
			local13 = 131328;
		}
		@Pc(24) int local24 = arg3 - this.anInt1580;
		if (arg2) {
			local13 |= 0x40000000;
		}
		@Pc(42) int local42;
		if (arg5 == 1 || arg5 == 3) {
			local42 = arg6;
			arg6 = arg1;
			arg1 = local42;
		}
		@Pc(51) int local51 = arg4 - this.anInt1585;
		for (local42 = local51; local42 < local51 + arg6; local42++) {
			if (local42 >= 0 && local42 < this.anInt1578) {
				for (@Pc(67) int local67 = local24; local67 < arg1 + local24; local67++) {
					if (local67 >= 0 && local67 < this.anInt1579) {
						this.method1482(local13, local67, local42);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIB)Z")
	public boolean method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 > 1) {
			return Static186.method2907(arg5, arg6, arg1, arg3, arg2, arg7, arg0, arg6) ? true : this.method1485(arg3, arg0, arg4, arg1, arg6, arg2, arg5, arg7, arg6);
		}
		@Pc(41) int local41 = arg2 + arg5 - 1;
		@Pc(52) int local52 = arg3 + arg7 - 1;
		if (arg0 >= arg2 && local41 >= arg0 && arg1 >= arg7 && arg1 <= local52) {
			return true;
		} else if (arg0 == arg2 - 1 && arg1 >= arg7 && local52 >= arg1 && (this.anIntArrayArray18[arg0 - this.anInt1585][arg1 - this.anInt1580] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local41 + 1 == arg0 && arg1 >= arg7 && arg1 <= local52 && (this.anIntArrayArray18[arg0 - this.anInt1585][arg1 - this.anInt1580] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg1 && arg2 <= arg0 && arg0 <= local41 && (this.anIntArrayArray18[arg0 - this.anInt1585][arg1 - this.anInt1580] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local52 + 1 == arg1 && arg2 <= arg0 && arg0 <= local41 && (this.anIntArrayArray18[arg0 - this.anInt1585][arg1 - this.anInt1580] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)V")
	public void method1490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1585;
		@Pc(9) int local9 = arg1 - this.anInt1580;
		this.anIntArrayArray18[local4][local9] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIBZZII)V")
	public void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt1580;
		@Pc(9) int local9 = arg5 - this.anInt1585;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1486(128, local9, local4);
				this.method1486(8, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method1486(2, local9, local4);
				this.method1486(32, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1486(8, local9, local4);
				this.method1486(128, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method1486(32, local9, local4);
				this.method1486(2, local9, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1486(1, local9, local4);
				this.method1486(16, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method1486(4, local9, local4);
				this.method1486(64, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1486(16, local9, local4);
				this.method1486(1, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method1486(64, local9, local4);
				this.method1486(4, local9 - 1, local4 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1486(130, local9, local4);
				this.method1486(8, local9 - 1, local4);
				this.method1486(32, local9, local4 + 1);
			}
			if (arg4 == 1) {
				this.method1486(10, local9, local4);
				this.method1486(32, local9, local4 + 1);
				this.method1486(128, local9 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1486(40, local9, local4);
				this.method1486(128, local9 + 1, local4);
				this.method1486(2, local9, local4 - 1);
			}
			if (arg4 == 3) {
				this.method1486(160, local9, local4);
				this.method1486(2, local9, local4 - 1);
				this.method1486(8, local9 - 1, local4);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method1486(65536, local9, local4);
					this.method1486(4096, local9 - 1, local4);
				}
				if (arg4 == 1) {
					this.method1486(1024, local9, local4);
					this.method1486(16384, local9, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1486(4096, local9, local4);
					this.method1486(65536, local9 + 1, local4);
				}
				if (arg4 == 3) {
					this.method1486(16384, local9, local4);
					this.method1486(1024, local9, local4 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method1486(512, local9, local4);
					this.method1486(8192, local9 - 1, local4 - -1);
				}
				if (arg4 == 1) {
					this.method1486(2048, local9, local4);
					this.method1486(32768, local9 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1486(8192, local9, local4);
					this.method1486(512, local9 + 1, local4 + -1);
				}
				if (arg4 == 3) {
					this.method1486(32768, local9, local4);
					this.method1486(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method1486(66560, local9, local4);
					this.method1486(4096, local9 - 1, local4);
					this.method1486(16384, local9, local4 + 1);
				}
				if (arg4 == 1) {
					this.method1486(5120, local9, local4);
					this.method1486(16384, local9, local4 + 1);
					this.method1486(65536, local9 + 1, local4);
				}
				if (arg4 == 2) {
					this.method1486(20480, local9, local4);
					this.method1486(65536, local9 + 1, local4);
					this.method1486(1024, local9, local4 - 1);
				}
				if (arg4 == 3) {
					this.method1486(81920, local9, local4);
					this.method1486(1024, local9, local4 - 1);
					this.method1486(4096, local9 - 1, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1486(536870912, local9, local4);
				this.method1486(33554432, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method1486(8388608, local9, local4);
				this.method1486(134217728, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1486(33554432, local9, local4);
				this.method1486(536870912, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method1486(134217728, local9, local4);
				this.method1486(8388608, local9, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1486(4194304, local9, local4);
				this.method1486(67108864, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method1486(16777216, local9, local4);
				this.method1486(268435456, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1486(67108864, local9, local4);
				this.method1486(4194304, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method1486(268435456, local9, local4);
				this.method1486(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1486(545259520, local9, local4);
			this.method1486(33554432, local9 - 1, local4);
			this.method1486(134217728, local9, local4 + 1);
		}
		if (arg4 == 1) {
			this.method1486(41943040, local9, local4);
			this.method1486(134217728, local9, local4 + 1);
			this.method1486(536870912, local9 + 1, local4);
		}
		if (arg4 == 2) {
			this.method1486(167772160, local9, local4);
			this.method1486(536870912, local9 + 1, local4);
			this.method1486(8388608, local9, local4 - 1);
		}
		if (arg4 == 3) {
			this.method1486(671088640, local9, local4);
			this.method1486(8388608, local9, local4 - 1);
			this.method1486(33554432, local9 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 == 1) {
			if (arg0 == arg1 && arg2 == arg4) {
				return true;
			}
		} else if (arg0 >= arg1 && arg0 <= arg1 + arg5 - 1 && arg2 >= arg2 && arg2 + arg5 - 1 >= arg2) {
			return true;
		}
		@Pc(60) int local60 = arg4 - this.anInt1580;
		@Pc(65) int local65 = arg0 - this.anInt1585;
		@Pc(70) int local70 = arg1 - this.anInt1585;
		@Pc(75) int local75 = arg2 - this.anInt1580;
		if (arg5 == 1) {
			if (arg6 == 0) {
				if (arg3 == 0) {
					if (local70 == local65 - 1 && local60 == local75) {
						return true;
					}
					if (local65 == local70 && local75 + 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 && local75 - 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local70 == local65 && local75 + 1 == local60) {
						return true;
					}
					if (local70 == local65 - 1 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local75 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local70 == local65 + 1 && local60 == local75) {
						return true;
					}
					if (local65 == local70 && local75 + 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 && local75 - 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local70 == local65 && local60 == local75 - 1) {
						return true;
					}
					if (local65 - 1 == local70 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg3 == 0) {
					if (local65 - 1 == local70 && local60 == local75) {
						return true;
					}
					if (local70 == local65 && local75 + 1 == local60) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local65 && local75 - 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local70 == local65 - 1 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local75 + 1 == local60) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local75) {
						return true;
					}
					if (local70 == local65 && local75 - 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local70 == local65 - 1 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local75 + 1 && (this.anIntArrayArray18[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local75) {
						return true;
					}
					if (local65 == local70 && local75 - 1 == local60) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local65 - 1 == local70 && local60 == local75) {
						return true;
					}
					if (local65 == local70 && local75 + 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local75 && (this.anIntArrayArray18[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 == local70 && local75 - 1 == local60) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local70 == local65 && local60 == local75 + 1 && (this.anIntArrayArray18[local70][local60] & 0x20) == 0) {
					return true;
				}
				if (local65 == local70 && local75 - 1 == local60 && (this.anIntArrayArray18[local70][local60] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local70 && local75 == local60 && (this.anIntArrayArray18[local70][local60] & 0x8) == 0) {
					return true;
				}
				if (local70 == local65 + 1 && local75 == local60 && (this.anIntArrayArray18[local70][local60] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = local70 + arg5 - 1;
			@Pc(94) int local94 = local60 + arg5 - 1;
			if (arg6 == 0) {
				if (arg3 == 0) {
					if (local70 == local65 - arg5 && local60 <= local75 && local75 <= local94) {
						return true;
					}
					if (local65 >= local70 && local87 >= local65 && local60 == local75 + 1 && (this.anIntArrayArray18[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 >= local70 && local87 >= local65 && local60 == local75 - arg5 && (this.anIntArrayArray18[local65][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local70 <= local65 && local87 >= local65 && local60 == local75 + 1) {
						return true;
					}
					if (local65 - arg5 == local70 && local60 <= local75 && local75 <= local94 && (this.anIntArrayArray18[local87][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local60 <= local75 && local94 >= local75 && (this.anIntArrayArray18[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local70 == local65 + 1 && local60 <= local75 && local75 <= local94) {
						return true;
					}
					if (local70 <= local65 && local65 <= local87 && local60 == local75 + 1 && (this.anIntArrayArray18[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 <= local65 && local65 <= local87 && local60 == local75 - arg5 && (this.anIntArrayArray18[local65][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local70 <= local65 && local87 >= local65 && local60 == local75 - arg5) {
						return true;
					}
					if (local65 - arg5 == local70 && local60 <= local75 && local75 <= local94 && (this.anIntArrayArray18[local87][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local60 <= local75 && local94 >= local75 && (this.anIntArrayArray18[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg3 == 0) {
					if (local70 == local65 - arg5 && local60 <= local75 && local94 >= local75) {
						return true;
					}
					if (local65 >= local70 && local65 <= local87 && local75 + 1 == local60) {
						return true;
					}
					if (local65 + 1 == local70 && local60 <= local75 && local75 <= local94 && (this.anIntArrayArray18[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 >= local70 && local65 <= local87 && local60 == local75 - arg5 && (this.anIntArrayArray18[local65][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local70 == local65 - arg5 && local60 <= local75 && local75 <= local94 && (this.anIntArrayArray18[local87][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 >= local70 && local87 >= local65 && local75 + 1 == local60) {
						return true;
					}
					if (local65 + 1 == local70 && local60 <= local75 && local94 >= local75) {
						return true;
					}
					if (local65 >= local70 && local65 <= local87 && local75 - arg5 == local60 && (this.anIntArrayArray18[local65][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local65 - arg5 == local70 && local75 >= local60 && local75 <= local94 && (this.anIntArrayArray18[local87][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 >= local70 && local65 <= local87 && local75 + 1 == local60 && (this.anIntArrayArray18[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local75 >= local60 && local75 <= local94) {
						return true;
					}
					if (local65 >= local70 && local87 >= local65 && local60 == local75 - arg5) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local65 - arg5 == local70 && local75 >= local60 && local94 >= local75) {
						return true;
					}
					if (local70 <= local65 && local87 >= local65 && local60 == local75 + 1 && (this.anIntArrayArray18[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local60 <= local75 && local94 >= local75 && (this.anIntArrayArray18[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 <= local65 && local65 <= local87 && local75 - arg5 == local60) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local65 >= local70 && local87 >= local65 && local60 == local75 + 1 && (this.anIntArrayArray18[local65][local60] & 0x2C0120) == 0) {
					return true;
				}
				if (local70 <= local65 && local87 >= local65 && local60 == local75 - arg5 && (this.anIntArrayArray18[local65][local94] & 0x2C0102) == 0) {
					return true;
				}
				if (local70 == local65 - arg5 && local75 >= local60 && local75 <= local94 && (this.anIntArrayArray18[local87][local75] & 0x2C0108) == 0) {
					return true;
				}
				if (local70 == local65 + 1 && local75 >= local60 && local75 <= local94 && (this.anIntArrayArray18[local70][local75] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZIZ)V")
	public void method1493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1585;
		@Pc(9) int local9 = arg4 - this.anInt1580;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1482(128, local9, local4);
				this.method1482(8, local9, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1482(2, local9, local4);
				this.method1482(32, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method1482(8, local9, local4);
				this.method1482(128, local9, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1482(32, local9, local4);
				this.method1482(2, local9 - 1, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1482(1, local9, local4);
				this.method1482(16, local9 + 1, local4 + -1);
			}
			if (arg2 == 1) {
				this.method1482(4, local9, local4);
				this.method1482(64, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1482(16, local9, local4);
				this.method1482(1, local9 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1482(64, local9, local4);
				this.method1482(4, local9 - 1, local4 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1482(130, local9, local4);
				this.method1482(8, local9, local4 - 1);
				this.method1482(32, local9 + 1, local4);
			}
			if (arg2 == 1) {
				this.method1482(10, local9, local4);
				this.method1482(32, local9 + 1, local4);
				this.method1482(128, local9, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1482(40, local9, local4);
				this.method1482(128, local9, local4 + 1);
				this.method1482(2, local9 - 1, local4);
			}
			if (arg2 == 3) {
				this.method1482(160, local9, local4);
				this.method1482(2, local9 - 1, local4);
				this.method1482(8, local9, local4 - 1);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method1482(65536, local9, local4);
					this.method1482(4096, local9, local4 - 1);
				}
				if (arg2 == 1) {
					this.method1482(1024, local9, local4);
					this.method1482(16384, local9 + 1, local4);
				}
				if (arg2 == 2) {
					this.method1482(4096, local9, local4);
					this.method1482(65536, local9, local4 + 1);
				}
				if (arg2 == 3) {
					this.method1482(16384, local9, local4);
					this.method1482(1024, local9 - 1, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method1482(512, local9, local4);
					this.method1482(8192, local9 + 1, local4 - 1);
				}
				if (arg2 == 1) {
					this.method1482(2048, local9, local4);
					this.method1482(32768, local9 + 1, local4 - -1);
				}
				if (arg2 == 2) {
					this.method1482(8192, local9, local4);
					this.method1482(512, local9 - 1, local4 - -1);
				}
				if (arg2 == 3) {
					this.method1482(32768, local9, local4);
					this.method1482(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method1482(66560, local9, local4);
					this.method1482(4096, local9, local4 - 1);
					this.method1482(16384, local9 + 1, local4);
				}
				if (arg2 == 1) {
					this.method1482(5120, local9, local4);
					this.method1482(16384, local9 + 1, local4);
					this.method1482(65536, local9, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1482(20480, local9, local4);
					this.method1482(65536, local9, local4 + 1);
					this.method1482(1024, local9 - 1, local4);
				}
				if (arg2 == 3) {
					this.method1482(81920, local9, local4);
					this.method1482(1024, local9 - 1, local4);
					this.method1482(4096, local9, local4 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1482(536870912, local9, local4);
				this.method1482(33554432, local9, local4 - 1);
			}
			if (arg2 == 1) {
				this.method1482(8388608, local9, local4);
				this.method1482(134217728, local9 + 1, local4);
			}
			if (arg2 == 2) {
				this.method1482(33554432, local9, local4);
				this.method1482(536870912, local9, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1482(134217728, local9, local4);
				this.method1482(8388608, local9 - 1, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1482(4194304, local9, local4);
				this.method1482(67108864, local9 + 1, local4 + -1);
			}
			if (arg2 == 1) {
				this.method1482(16777216, local9, local4);
				this.method1482(268435456, local9 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1482(67108864, local9, local4);
				this.method1482(4194304, local9 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method1482(268435456, local9, local4);
				this.method1482(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1482(545259520, local9, local4);
			this.method1482(33554432, local9, local4 - 1);
			this.method1482(134217728, local9 + 1, local4);
		}
		if (arg2 == 1) {
			this.method1482(41943040, local9, local4);
			this.method1482(134217728, local9 + 1, local4);
			this.method1482(536870912, local9, local4 + 1);
		}
		if (arg2 == 2) {
			this.method1482(167772160, local9, local4);
			this.method1482(536870912, local9, local4 + 1);
			this.method1482(8388608, local9 - 1, local4);
		}
		if (arg2 == 3) {
			this.method1482(671088640, local9, local4);
			this.method1482(8388608, local9 - 1, local4);
			this.method1482(33554432, local9, local4 - 1);
			return;
		}
	}
}

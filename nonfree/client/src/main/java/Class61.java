import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class61 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public int anInt1457;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	public int anInt1459;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	public int anInt1460;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
	public int anInt1473;

	static {
		new Class140(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBIIIIII)Z")
	public boolean method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static286.method4839(arg2, arg1, arg5, arg6, arg5, arg3, arg0, arg7) ? true : this.method1605(arg2, arg7, arg5, arg5, arg4, arg1, arg3, arg0, arg6);
		}
		@Pc(41) int local41 = arg0 + arg2 - 1;
		@Pc(47) int local47 = arg7 + arg6 - 1;
		if (arg3 >= arg0 && arg3 <= local41 && arg1 >= arg6 && local47 >= arg1) {
			return true;
		} else if (arg0 - 1 == arg3 && arg1 >= arg6 && local47 >= arg1 && (this.anIntArrayArray19[arg3 - this.anInt1457][arg1 - this.anInt1460] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg3 == local41 + 1 && arg6 <= arg1 && local47 >= arg1 && (this.anIntArrayArray19[arg3 - this.anInt1457][arg1 - this.anInt1460] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg6 - 1 && arg3 >= arg0 && local41 >= arg3 && (this.anIntArrayArray19[arg3 - this.anInt1457][arg1 - this.anInt1460] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local47 + 1 && arg3 >= arg0 && local41 >= arg3 && (this.anIntArrayArray19[arg3 - this.anInt1457][arg1 - this.anInt1460] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	public void method1601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1457;
		@Pc(24) int local24 = arg1 - this.anInt1460;
		this.anIntArrayArray19[local4][local24] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V")
	private void method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
	public void method1603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = arg1 - this.anInt1457;
		@Pc(27) int local27 = arg0 - this.anInt1460;
		this.anIntArrayArray19[local22][local27] |= 0x200000;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg3 + arg6;
		@Pc(18) int local18 = arg5 + arg2;
		@Pc(22) int local22 = arg0 + arg7;
		@Pc(26) int local26 = arg1 + arg8;
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (arg6 == local22 && (arg4 & 0x2) == 0) {
			local40 = arg8 >= arg5 ? arg8 : arg5;
			local47 = local26 > local18 ? local18 : local26;
			while (local47 > local40) {
				if ((this.anIntArrayArray19[local22 - this.anInt1457 - 1][local40 - this.anInt1460] & 0x8) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local14 == arg7 && (arg4 & 0x8) == 0) {
			local40 = arg5 > arg8 ? arg5 : arg8;
			local47 = local18 >= local26 ? local26 : local18;
			while (local40 < local47) {
				if ((this.anIntArrayArray19[arg7 - this.anInt1457][local40 - this.anInt1460] & 0x80) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local26 == arg5 && (arg4 & 0x1) == 0) {
			local40 = arg7 < arg6 ? arg6 : arg7;
			local47 = local22 > local14 ? local14 : local22;
			while (local47 > local40) {
				if ((this.anIntArrayArray19[local40 - this.anInt1457][local26 - this.anInt1460 - 1] & 0x2) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local18 == arg8 && (arg4 & 0x4) == 0) {
			local40 = arg6 <= arg7 ? arg7 : arg6;
			local47 = local22 <= local14 ? local22 : local14;
			while (local47 > local40) {
				if ((this.anIntArrayArray19[local40 - this.anInt1457][arg8 - this.anInt1460] & 0x20) == 0) {
					return true;
				}
				local40++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIZIIZII)V")
	public void method1606(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(23) int local23;
		if (arg5 == 1 || arg5 == 3) {
			local23 = arg0;
			arg0 = arg3;
			arg3 = local23;
		}
		@Pc(32) int local32 = arg2 - this.anInt1457;
		@Pc(52) int local52 = arg6 - this.anInt1460;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (local23 = local32; local23 < arg0 + local32; local23++) {
			if (local23 >= 0 && local23 < this.anInt1473) {
				for (@Pc(70) int local70 = local52; local70 < arg3 + local52; local70++) {
					if (local70 >= 0 && this.anInt1459 > local70) {
						this.method1602(local23, local70, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIII)V")
	private void method1607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg5 == arg1 && arg4 == arg6) {
				return true;
			}
		} else if (arg5 <= arg1 && arg1 <= arg3 + arg5 - 1 && arg6 <= arg6 && arg6 <= arg3 + arg6 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg1 - this.anInt1457;
		@Pc(58) int local58 = arg4 - this.anInt1460;
		@Pc(63) int local63 = arg6 - this.anInt1460;
		@Pc(68) int local68 = arg5 - this.anInt1457;
		if (arg3 == 1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local53 - 1 == local68 && local58 == local63) {
						return true;
					}
					if (local68 == local53 && local58 == local63 + 1 && (this.anIntArrayArray19[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local53 && local63 - 1 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 == local53 && local63 + 1 == local58) {
						return true;
					}
					if (local53 - 1 == local68 && local58 == local63 && (this.anIntArrayArray19[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local53 + 1 && local63 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local68 == local53 + 1 && local58 == local63) {
						return true;
					}
					if (local53 == local68 && local58 == local63 + 1 && (this.anIntArrayArray19[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local53 && local63 - 1 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 == local53 && local63 - 1 == local58) {
						return true;
					}
					if (local68 == local53 - 1 && local63 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 + 1 == local68 && local63 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local68 == local53 - 1 && local63 == local58) {
						return true;
					}
					if (local68 == local53 && local63 + 1 == local58) {
						return true;
					}
					if (local68 == local53 + 1 && local63 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 == local68 && local63 - 1 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 == local53 - 1 && local58 == local63 && (this.anIntArrayArray19[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local53 && local58 == local63 + 1) {
						return true;
					}
					if (local53 + 1 == local68 && local58 == local63) {
						return true;
					}
					if (local68 == local53 && local63 - 1 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local53 - 1 == local68 && local58 == local63 && (this.anIntArrayArray19[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local68 && local58 == local63 + 1 && (this.anIntArrayArray19[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local53 + 1 && local63 == local58) {
						return true;
					}
					if (local53 == local68 && local63 - 1 == local58) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 == local53 - 1 && local58 == local63) {
						return true;
					}
					if (local68 == local53 && local63 + 1 == local58 && (this.anIntArrayArray19[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local53 + 1 && local58 == local63 && (this.anIntArrayArray19[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local53 && local58 == local63 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local68 == local53 && local58 == local63 + 1 && (this.anIntArrayArray19[local68][local58] & 0x20) == 0) {
					return true;
				}
				if (local53 == local68 && local58 == local63 - 1 && (this.anIntArrayArray19[local68][local58] & 0x2) == 0) {
					return true;
				}
				if (local68 == local53 - 1 && local63 == local58 && (this.anIntArrayArray19[local68][local58] & 0x8) == 0) {
					return true;
				}
				if (local53 + 1 == local68 && local63 == local58 && (this.anIntArrayArray19[local68][local58] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(77) int local77 = local68 + arg3 - 1;
			@Pc(83) int local83 = arg3 + local58 - 1;
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local53 - arg3 == local68 && local63 >= local58 && local83 >= local63) {
						return true;
					}
					if (local68 <= local53 && local53 <= local77 && local63 + 1 == local58 && (this.anIntArrayArray19[local53][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local53 && local53 <= local77 && local63 - arg3 == local58 && (this.anIntArrayArray19[local53][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local53 >= local68 && local77 >= local53 && local63 + 1 == local58) {
						return true;
					}
					if (local68 == local53 - arg3 && local58 <= local63 && local83 >= local63 && (this.anIntArrayArray19[local77][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 + 1 == local68 && local63 >= local58 && local83 >= local63 && (this.anIntArrayArray19[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local53 + 1 == local68 && local63 >= local58 && local83 >= local63) {
						return true;
					}
					if (local68 <= local53 && local53 <= local77 && local63 + 1 == local58 && (this.anIntArrayArray19[local53][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 >= local68 && local53 <= local77 && local58 == local63 - arg3 && (this.anIntArrayArray19[local53][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 <= local53 && local77 >= local53 && local63 - arg3 == local58) {
						return true;
					}
					if (local68 == local53 - arg3 && local63 >= local58 && local83 >= local63 && (this.anIntArrayArray19[local77][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 + 1 == local68 && local63 >= local58 && local63 <= local83 && (this.anIntArrayArray19[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local68 == local53 - arg3 && local58 <= local63 && local63 <= local83) {
						return true;
					}
					if (local53 >= local68 && local53 <= local77 && local58 == local63 + 1) {
						return true;
					}
					if (local53 + 1 == local68 && local63 >= local58 && local63 <= local83 && (this.anIntArrayArray19[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local53 && local77 >= local53 && local63 - arg3 == local58 && (this.anIntArrayArray19[local53][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 == local53 - arg3 && local58 <= local63 && local63 <= local83 && (this.anIntArrayArray19[local77][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 <= local53 && local53 <= local77 && local58 == local63 + 1) {
						return true;
					}
					if (local53 + 1 == local68 && local58 <= local63 && local83 >= local63) {
						return true;
					}
					if (local53 >= local68 && local77 >= local53 && local63 - arg3 == local58 && (this.anIntArrayArray19[local53][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local53 - arg3 == local68 && local58 <= local63 && local83 >= local63 && (this.anIntArrayArray19[local77][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 <= local53 && local53 <= local77 && local58 == local63 + 1 && (this.anIntArrayArray19[local53][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 + 1 == local68 && local63 >= local58 && local63 <= local83) {
						return true;
					}
					if (local68 <= local53 && local53 <= local77 && local63 - arg3 == local58) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local53 - arg3 == local68 && local63 >= local58 && local63 <= local83) {
						return true;
					}
					if (local68 <= local53 && local77 >= local53 && local63 + 1 == local58 && (this.anIntArrayArray19[local53][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local53 + 1 && local63 >= local58 && local83 >= local63 && (this.anIntArrayArray19[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 >= local68 && local77 >= local53 && local63 - arg3 == local58) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local68 <= local53 && local53 <= local77 && local58 == local63 + 1 && (this.anIntArrayArray19[local53][local58] & 0x2C0120) == 0) {
					return true;
				}
				if (local53 >= local68 && local77 >= local53 && local58 == local63 - arg3 && (this.anIntArrayArray19[local53][local83] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 == local53 - arg3 && local58 <= local63 && local83 >= local63 && (this.anIntArrayArray19[local77][local63] & 0x2C0108) == 0) {
					return true;
				}
				if (local68 == local53 + 1 && local63 >= local58 && local63 <= local83 && (this.anIntArrayArray19[local68][local63] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIZZBI)V")
	public void method1609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt1460;
		@Pc(13) int local13 = arg1 - this.anInt1457;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1607(128, local13, local4);
				this.method1607(8, local13 - 1, local4);
			}
			if (arg0 == 1) {
				this.method1607(2, local13, local4);
				this.method1607(32, local13, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1607(8, local13, local4);
				this.method1607(128, local13 + 1, local4);
			}
			if (arg0 == 3) {
				this.method1607(32, local13, local4);
				this.method1607(2, local13, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1607(1, local13, local4);
				this.method1607(16, local13 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1607(4, local13, local4);
				this.method1607(64, local13 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1607(16, local13, local4);
				this.method1607(1, local13 + 1, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1607(64, local13, local4);
				this.method1607(4, local13 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method1607(130, local13, local4);
				this.method1607(8, local13 - 1, local4);
				this.method1607(32, local13, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1607(10, local13, local4);
				this.method1607(32, local13, local4 + 1);
				this.method1607(128, local13 + 1, local4);
			}
			if (arg0 == 2) {
				this.method1607(40, local13, local4);
				this.method1607(128, local13 + 1, local4);
				this.method1607(2, local13, local4 - 1);
			}
			if (arg0 == 3) {
				this.method1607(160, local13, local4);
				this.method1607(2, local13, local4 - 1);
				this.method1607(8, local13 - 1, local4);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method1607(65536, local13, local4);
					this.method1607(4096, local13 - 1, local4);
				}
				if (arg0 == 1) {
					this.method1607(1024, local13, local4);
					this.method1607(16384, local13, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1607(4096, local13, local4);
					this.method1607(65536, local13 + 1, local4);
				}
				if (arg0 == 3) {
					this.method1607(16384, local13, local4);
					this.method1607(1024, local13, local4 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method1607(512, local13, local4);
					this.method1607(8192, local13 - 1, local4 + 1);
				}
				if (arg0 == 1) {
					this.method1607(2048, local13, local4);
					this.method1607(32768, local13 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method1607(8192, local13, local4);
					this.method1607(512, local13 + 1, local4 - 1);
				}
				if (arg0 == 3) {
					this.method1607(32768, local13, local4);
					this.method1607(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method1607(66560, local13, local4);
					this.method1607(4096, local13 - 1, local4);
					this.method1607(16384, local13, local4 + 1);
				}
				if (arg0 == 1) {
					this.method1607(5120, local13, local4);
					this.method1607(16384, local13, local4 + 1);
					this.method1607(65536, local13 + 1, local4);
				}
				if (arg0 == 2) {
					this.method1607(20480, local13, local4);
					this.method1607(65536, local13 + 1, local4);
					this.method1607(1024, local13, local4 - 1);
				}
				if (arg0 == 3) {
					this.method1607(81920, local13, local4);
					this.method1607(1024, local13, local4 - 1);
					this.method1607(4096, local13 - 1, local4);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1607(536870912, local13, local4);
				this.method1607(33554432, local13 - 1, local4);
			}
			if (arg0 == 1) {
				this.method1607(8388608, local13, local4);
				this.method1607(134217728, local13, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1607(33554432, local13, local4);
				this.method1607(536870912, local13 + 1, local4);
			}
			if (arg0 == 3) {
				this.method1607(134217728, local13, local4);
				this.method1607(8388608, local13, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1607(4194304, local13, local4);
				this.method1607(67108864, local13 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method1607(16777216, local13, local4);
				this.method1607(268435456, local13 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method1607(67108864, local13, local4);
				this.method1607(4194304, local13 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method1607(268435456, local13, local4);
				this.method1607(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1607(545259520, local13, local4);
			this.method1607(33554432, local13 - 1, local4);
			this.method1607(134217728, local13, local4 + 1);
		}
		if (arg0 == 1) {
			this.method1607(41943040, local13, local4);
			this.method1607(134217728, local13, local4 + 1);
			this.method1607(536870912, local13 + 1, local4);
		}
		if (arg0 == 2) {
			this.method1607(167772160, local13, local4);
			this.method1607(536870912, local13 + 1, local4);
			this.method1607(8388608, local13, local4 - 1);
		}
		if (arg0 == 3) {
			this.method1607(671088640, local13, local4);
			this.method1607(8388608, local13, local4 - 1);
			this.method1607(33554432, local13 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZZIIZ)V")
	public void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg3 - this.anInt1457;
		@Pc(9) int local9 = arg0 - this.anInt1460;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1602(local4, local9, 128);
				this.method1602(local4 - 1, local9, 8);
			}
			if (arg4 == 1) {
				this.method1602(local4, local9, 2);
				this.method1602(local4, local9 + 1, 32);
			}
			if (arg4 == 2) {
				this.method1602(local4, local9, 8);
				this.method1602(local4 + 1, local9, 128);
			}
			if (arg4 == 3) {
				this.method1602(local4, local9, 32);
				this.method1602(local4, local9 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1602(local4, local9, 1);
				this.method1602(local4 - 1, local9 + 1, 16);
			}
			if (arg4 == 1) {
				this.method1602(local4, local9, 4);
				this.method1602(local4 + 1, local9 + 1, 64);
			}
			if (arg4 == 2) {
				this.method1602(local4, local9, 16);
				this.method1602(local4 + 1, local9 + -1, 1);
			}
			if (arg4 == 3) {
				this.method1602(local4, local9, 64);
				this.method1602(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1602(local4, local9, 130);
				this.method1602(local4 - 1, local9, 8);
				this.method1602(local4, local9 + 1, 32);
			}
			if (arg4 == 1) {
				this.method1602(local4, local9, 10);
				this.method1602(local4, local9 + 1, 32);
				this.method1602(local4 + 1, local9, 128);
			}
			if (arg4 == 2) {
				this.method1602(local4, local9, 40);
				this.method1602(local4 + 1, local9, 128);
				this.method1602(local4, local9 - 1, 2);
			}
			if (arg4 == 3) {
				this.method1602(local4, local9, 160);
				this.method1602(local4, local9 - 1, 2);
				this.method1602(local4 - 1, local9, 8);
			}
		}
		if (arg5) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method1602(local4, local9, 65536);
					this.method1602(local4 - 1, local9, 4096);
				}
				if (arg4 == 1) {
					this.method1602(local4, local9, 1024);
					this.method1602(local4, local9 + 1, 16384);
				}
				if (arg4 == 2) {
					this.method1602(local4, local9, 4096);
					this.method1602(local4 + 1, local9, 65536);
				}
				if (arg4 == 3) {
					this.method1602(local4, local9, 16384);
					this.method1602(local4, local9 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method1602(local4, local9, 512);
					this.method1602(local4 - 1, local9 + 1, 8192);
				}
				if (arg4 == 1) {
					this.method1602(local4, local9, 2048);
					this.method1602(local4 + 1, local9 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method1602(local4, local9, 8192);
					this.method1602(local4 + 1, local9 + -1, 512);
				}
				if (arg4 == 3) {
					this.method1602(local4, local9, 32768);
					this.method1602(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method1602(local4, local9, 66560);
					this.method1602(local4 - 1, local9, 4096);
					this.method1602(local4, local9 + 1, 16384);
				}
				if (arg4 == 1) {
					this.method1602(local4, local9, 5120);
					this.method1602(local4, local9 + 1, 16384);
					this.method1602(local4 + 1, local9, 65536);
				}
				if (arg4 == 2) {
					this.method1602(local4, local9, 20480);
					this.method1602(local4 + 1, local9, 65536);
					this.method1602(local4, local9 - 1, 1024);
				}
				if (arg4 == 3) {
					this.method1602(local4, local9, 81920);
					this.method1602(local4, local9 - 1, 1024);
					this.method1602(local4 - 1, local9, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1602(local4, local9, 536870912);
				this.method1602(local4 - 1, local9, 33554432);
			}
			if (arg4 == 1) {
				this.method1602(local4, local9, 8388608);
				this.method1602(local4, local9 + 1, 134217728);
			}
			if (arg4 == 2) {
				this.method1602(local4, local9, 33554432);
				this.method1602(local4 + 1, local9, 536870912);
			}
			if (arg4 == 3) {
				this.method1602(local4, local9, 134217728);
				this.method1602(local4, local9 - 1, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1602(local4, local9, 4194304);
				this.method1602(local4 - 1, local9 - -1, 67108864);
			}
			if (arg4 == 1) {
				this.method1602(local4, local9, 16777216);
				this.method1602(local4 + 1, local9 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method1602(local4, local9, 67108864);
				this.method1602(local4 + 1, local9 + -1, 4194304);
			}
			if (arg4 == 3) {
				this.method1602(local4, local9, 268435456);
				this.method1602(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1602(local4, local9, 545259520);
			this.method1602(local4 - 1, local9, 33554432);
			this.method1602(local4, local9 + 1, 134217728);
		}
		if (arg4 == 1) {
			this.method1602(local4, local9, 41943040);
			this.method1602(local4, local9 + 1, 134217728);
			this.method1602(local4 + 1, local9, 536870912);
		}
		if (arg4 == 2) {
			this.method1602(local4, local9, 167772160);
			this.method1602(local4 + 1, local9, 536870912);
			this.method1602(local4, local9 - 1, 8388608);
		}
		if (arg4 == 3) {
			this.method1602(local4, local9, 671088640);
			this.method1602(local4, local9 - 1, 8388608);
			this.method1602(local4 - 1, local9, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method1611() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1473; local13++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt1459; local17++) {
				if (local13 == 0 || local17 == 0 || this.anInt1473 - 5 <= local13 || local17 >= this.anInt1459 - 5) {
					this.anIntArrayArray19[local13][local17] = -1;
				} else {
					this.anIntArrayArray19[local13][local17] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V")
	public void method1612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1457;
		@Pc(9) int local9 = arg1 - this.anInt1460;
		this.anIntArrayArray19[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg3 && arg0 == arg6) {
				return true;
			}
		} else if (arg3 >= arg5 && arg3 <= arg4 + arg5 - 1 && arg0 <= arg0 && arg0 + arg4 - 1 >= arg0) {
			return true;
		}
		@Pc(58) int local58 = arg5 - this.anInt1457;
		@Pc(63) int local63 = arg0 - this.anInt1460;
		@Pc(68) int local68 = arg3 - this.anInt1457;
		@Pc(73) int local73 = arg6 - this.anInt1460;
		if (arg4 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local68 + 1 == local58 && local63 == local73 && (this.anIntArrayArray19[local58][local73] & 0x80) == 0) {
						return true;
					}
					if (local58 == local68 && local63 - 1 == local73 && (this.anIntArrayArray19[local58][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local58 == local68 - 1 && local63 == local73 && (this.anIntArrayArray19[local58][local73] & 0x8) == 0) {
						return true;
					}
					if (local68 == local58 && local73 == local63 - 1 && (this.anIntArrayArray19[local58][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local58 == local68 - 1 && local73 == local63 && (this.anIntArrayArray19[local58][local73] & 0x8) == 0) {
						return true;
					}
					if (local68 == local58 && local63 + 1 == local73 && (this.anIntArrayArray19[local58][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local58 == local68 + 1 && local63 == local73 && (this.anIntArrayArray19[local58][local73] & 0x80) == 0) {
						return true;
					}
					if (local58 == local68 && local73 == local63 + 1 && (this.anIntArrayArray19[local58][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local68 == local58 && local63 + 1 == local73 && (this.anIntArrayArray19[local58][local73] & 0x20) == 0) {
					return true;
				}
				if (local58 == local68 && local63 - 1 == local73 && (this.anIntArrayArray19[local58][local73] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local58 && local63 == local73 && (this.anIntArrayArray19[local58][local73] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local58 && local73 == local63 && (this.anIntArrayArray19[local58][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(410) int local410 = local58 + arg4 - 1;
			@Pc(416) int local416 = arg4 + local73 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local68 + 1 == local58 && local73 <= local63 && local63 <= local416 && (this.anIntArrayArray19[local58][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local410 && local63 - arg4 == local73 && (this.anIntArrayArray19[local68][local416] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local68 - arg4 == local58 && local63 >= local73 && local416 >= local63 && (this.anIntArrayArray19[local410][local63] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local410 && local73 == local63 - arg4 && (this.anIntArrayArray19[local68][local416] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local58 == local68 - arg4 && local63 >= local73 && local63 <= local416 && (this.anIntArrayArray19[local410][local63] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local68 && local410 >= local68 && local73 == local63 + 1 && (this.anIntArrayArray19[local68][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local58 == local68 + 1 && local63 >= local73 && local63 <= local416 && (this.anIntArrayArray19[local58][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local410 && local73 == local63 + 1 && (this.anIntArrayArray19[local68][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local68 >= local58 && local410 >= local68 && local63 + 1 == local73 && (this.anIntArrayArray19[local68][local73] & 0x20) == 0) {
					return true;
				}
				if (local68 >= local58 && local68 <= local410 && local73 == local63 - arg4 && (this.anIntArrayArray19[local68][local416] & 0x2) == 0) {
					return true;
				}
				if (local58 == local68 - arg4 && local63 >= local73 && local63 <= local416 && (this.anIntArrayArray19[local410][local63] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local58 && local63 >= local73 && local63 <= local416 && (this.anIntArrayArray19[local58][local63] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZIIIZI)V")
	public void method1615(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt1460;
		@Pc(23) int local23 = arg3 - this.anInt1457;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local23; local39 < arg2 + local23; local39++) {
			if (local39 >= 0 && local39 < this.anInt1473) {
				for (@Pc(49) int local49 = local18; local49 < local18 + arg0; local49++) {
					if (local49 >= 0 && this.anInt1459 > local49) {
						this.method1607(local7, local39, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(III)V")
	public void method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1457;
		@Pc(9) int local9 = arg1 - this.anInt1460;
		this.anIntArrayArray19[local4][local9] &= 0xFFFBFFFF;
	}
}

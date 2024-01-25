import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class48 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
	public int anInt1884;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
	public int anInt1886;

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
	public int anInt1890;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
	public int anInt1892;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIB)V")
	private void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIBIIIIII)Z")
	public boolean method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static318.method3985(arg4, arg5, arg5, arg6, arg3, arg0, arg1, arg2) ? true : this.method1634(arg0, arg1, arg6, arg4, arg3, arg2, arg7, arg5, arg5);
		}
		@Pc(39) int local39 = arg3 + arg6 - 1;
		@Pc(45) int local45 = arg2 + arg0 - 1;
		if (arg3 <= arg1 && arg1 <= local39 && arg0 <= arg4 && local45 >= arg4) {
			return true;
		} else if (arg1 == arg3 - 1 && arg0 <= arg4 && local45 >= arg4 && (this.anIntArrayArray3[arg1 - this.anInt1884][arg4 - this.anInt1886] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (local39 + 1 == arg1 && arg0 <= arg4 && local45 >= arg4 && (this.anIntArrayArray3[arg1 - this.anInt1884][arg4 - this.anInt1886] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg0 - 1 && arg3 <= arg1 && local39 >= arg1 && (this.anIntArrayArray3[arg1 - this.anInt1884][arg4 - this.anInt1886] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg4 && arg1 >= arg3 && local39 >= arg1 && (this.anIntArrayArray3[arg1 - this.anInt1884][arg4 - this.anInt1886] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BIZIIZI)V")
	public void method1633(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 256;
		if (arg1) {
			local15 = 131328;
		}
		@Pc(26) int local26 = arg2 - this.anInt1884;
		@Pc(31) int local31 = arg5 - this.anInt1886;
		if (arg4) {
			local15 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local26; local39 < local26 + arg0; local39++) {
			if (local39 >= 0 && local39 < this.anInt1890) {
				for (@Pc(56) int local56 = local31; local56 < local31 + arg3; local56++) {
					if (local56 >= 0 && local56 < this.anInt1892) {
						this.method1631(local56, local15, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BIIIIIIIII)Z")
	public boolean method1634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg1;
		@Pc(14) int local14 = arg3 + arg7;
		@Pc(18) int local18 = arg2 + arg4;
		@Pc(27) int local27 = arg5 + arg0;
		@Pc(70) int local70;
		@Pc(77) int local77;
		if (arg1 == local18 && (arg6 & 0x2) == 0) {
			local70 = arg0 >= arg3 ? arg0 : arg3;
			local77 = local27 <= local14 ? local27 : local14;
			while (local77 > local70) {
				if ((this.anIntArrayArray3[local18 - this.anInt1884 - 1][local70 - this.anInt1886] & 0x8) == 0) {
					return true;
				}
				local70++;
			}
		} else if (arg4 == local9 && (arg6 & 0x8) == 0) {
			local70 = arg0 >= arg3 ? arg0 : arg3;
			local77 = local27 <= local14 ? local27 : local14;
			while (local70 < local77) {
				if ((this.anIntArrayArray3[arg4 - this.anInt1884][local70 - this.anInt1886] & 0x80) == 0) {
					return true;
				}
				local70++;
			}
		} else if (local27 == arg3 && (arg6 & 0x1) == 0) {
			local70 = arg4 < arg1 ? arg1 : arg4;
			local77 = local18 > local9 ? local9 : local18;
			while (local77 > local70) {
				if ((this.anIntArrayArray3[local70 - this.anInt1884][local27 - this.anInt1886 - 1] & 0x2) == 0) {
					return true;
				}
				local70++;
			}
		} else if (local14 == arg0 && (arg6 & 0x4) == 0) {
			local70 = arg4 < arg1 ? arg1 : arg4;
			local77 = local18 > local9 ? local9 : local18;
			while (local70 < local77) {
				if ((this.anIntArrayArray3[local70 - this.anInt1884][arg0 - this.anInt1886] & 0x20) == 0) {
					return true;
				}
				local70++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
	public void method1636() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1890; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1892; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt1890 - 5 <= local7 || this.anInt1892 - 5 <= local11) {
					this.anIntArrayArray3[local7][local11] = -1;
				} else {
					this.anIntArrayArray3[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)V")
	public void method1637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1886;
		@Pc(17) int local17 = arg1 - this.anInt1884;
		this.anIntArrayArray3[local17][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IZZIIII)V")
	public void method1638(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt1884;
		@Pc(13) int local13 = arg3 - this.anInt1886;
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method1631(local13, 128, local4);
				this.method1631(local13, 8, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1631(local13, 2, local4);
				this.method1631(local13 + 1, 32, local4);
			}
			if (arg5 == 2) {
				this.method1631(local13, 8, local4);
				this.method1631(local13, 128, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1631(local13, 32, local4);
				this.method1631(local13 - 1, 2, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method1631(local13, 1, local4);
				this.method1631(local13 + 1, 16, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1631(local13, 4, local4);
				this.method1631(local13 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method1631(local13, 16, local4);
				this.method1631(local13 - 1, 1, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1631(local13, 64, local4);
				this.method1631(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				this.method1631(local13, 130, local4);
				this.method1631(local13, 8, local4 - 1);
				this.method1631(local13 + 1, 32, local4);
			}
			if (arg5 == 1) {
				this.method1631(local13, 10, local4);
				this.method1631(local13 + 1, 32, local4);
				this.method1631(local13, 128, local4 + 1);
			}
			if (arg5 == 2) {
				this.method1631(local13, 40, local4);
				this.method1631(local13, 128, local4 + 1);
				this.method1631(local13 - 1, 2, local4);
			}
			if (arg5 == 3) {
				this.method1631(local13, 160, local4);
				this.method1631(local13 - 1, 2, local4);
				this.method1631(local13, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method1631(local13, 65536, local4);
					this.method1631(local13, 4096, local4 - 1);
				}
				if (arg5 == 1) {
					this.method1631(local13, 1024, local4);
					this.method1631(local13 + 1, 16384, local4);
				}
				if (arg5 == 2) {
					this.method1631(local13, 4096, local4);
					this.method1631(local13, 65536, local4 + 1);
				}
				if (arg5 == 3) {
					this.method1631(local13, 16384, local4);
					this.method1631(local13 - 1, 1024, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method1631(local13, 512, local4);
					this.method1631(local13 + 1, 8192, local4 - 1);
				}
				if (arg5 == 1) {
					this.method1631(local13, 2048, local4);
					this.method1631(local13 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method1631(local13, 8192, local4);
					this.method1631(local13 - 1, 512, local4 + 1);
				}
				if (arg5 == 3) {
					this.method1631(local13, 32768, local4);
					this.method1631(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method1631(local13, 66560, local4);
					this.method1631(local13, 4096, local4 - 1);
					this.method1631(local13 + 1, 16384, local4);
				}
				if (arg5 == 1) {
					this.method1631(local13, 5120, local4);
					this.method1631(local13 + 1, 16384, local4);
					this.method1631(local13, 65536, local4 + 1);
				}
				if (arg5 == 2) {
					this.method1631(local13, 20480, local4);
					this.method1631(local13, 65536, local4 + 1);
					this.method1631(local13 - 1, 1024, local4);
				}
				if (arg5 == 3) {
					this.method1631(local13, 81920, local4);
					this.method1631(local13 - 1, 1024, local4);
					this.method1631(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method1631(local13, 536870912, local4);
				this.method1631(local13, 33554432, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1631(local13, 8388608, local4);
				this.method1631(local13 + 1, 134217728, local4);
			}
			if (arg5 == 2) {
				this.method1631(local13, 33554432, local4);
				this.method1631(local13, 536870912, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1631(local13, 134217728, local4);
				this.method1631(local13 - 1, 8388608, local4);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method1631(local13, 4194304, local4);
				this.method1631(local13 + 1, 67108864, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1631(local13, 16777216, local4);
				this.method1631(local13 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method1631(local13, 67108864, local4);
				this.method1631(local13 - 1, 4194304, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1631(local13, 268435456, local4);
				this.method1631(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method1631(local13, 545259520, local4);
			this.method1631(local13, 33554432, local4 - 1);
			this.method1631(local13 + 1, 134217728, local4);
		}
		if (arg5 == 1) {
			this.method1631(local13, 41943040, local4);
			this.method1631(local13 + 1, 134217728, local4);
			this.method1631(local13, 536870912, local4 + 1);
		}
		if (arg5 == 2) {
			this.method1631(local13, 167772160, local4);
			this.method1631(local13, 536870912, local4 + 1);
			this.method1631(local13 - 1, 8388608, local4);
		}
		if (arg5 == 3) {
			this.method1631(local13, 671088640, local4);
			this.method1631(local13 - 1, 8388608, local4);
			this.method1631(local13, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
	public void method1640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1884;
		@Pc(13) int local13 = arg0 - this.anInt1886;
		this.anIntArrayArray3[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(III)V")
	public void method1641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1884;
		@Pc(13) int local13 = arg1 - this.anInt1886;
		this.anIntArrayArray3[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(BII)V")
	public void method1643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt1884;
		@Pc(17) int local17 = arg1 - this.anInt1886;
		this.anIntArrayArray3[local12][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg4 && arg1 == arg5) {
				return true;
			}
		} else if (arg4 <= arg6 && arg4 + arg2 - 1 >= arg6 && arg5 <= arg5 && arg2 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(63) int local63 = arg5 - this.anInt1886;
		@Pc(68) int local68 = arg6 - this.anInt1884;
		@Pc(73) int local73 = arg1 - this.anInt1886;
		@Pc(78) int local78 = arg4 - this.anInt1884;
		if (arg2 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local68 + 1 == local78 && local73 == local63 && (this.anIntArrayArray3[local78][local73] & 0x80) == 0) {
						return true;
					}
					if (local68 == local78 && local63 - 1 == local73 && (this.anIntArrayArray3[local78][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local78 == local68 - 1 && local63 == local73 && (this.anIntArrayArray3[local78][local73] & 0x8) == 0) {
						return true;
					}
					if (local68 == local78 && local63 - 1 == local73 && (this.anIntArrayArray3[local78][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local78 == local68 - 1 && local63 == local73 && (this.anIntArrayArray3[local78][local73] & 0x8) == 0) {
						return true;
					}
					if (local78 == local68 && local73 == local63 + 1 && (this.anIntArrayArray3[local78][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local78 == local68 + 1 && local73 == local63 && (this.anIntArrayArray3[local78][local73] & 0x80) == 0) {
						return true;
					}
					if (local68 == local78 && local63 + 1 == local73 && (this.anIntArrayArray3[local78][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local78 == local68 && local73 == local63 + 1 && (this.anIntArrayArray3[local78][local73] & 0x20) == 0) {
					return true;
				}
				if (local78 == local68 && local73 == local63 - 1 && (this.anIntArrayArray3[local78][local73] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local78 && local63 == local73 && (this.anIntArrayArray3[local78][local73] & 0x8) == 0) {
					return true;
				}
				if (local78 == local68 + 1 && local73 == local63 && (this.anIntArrayArray3[local78][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = arg2 + local78 - 1;
			@Pc(94) int local94 = local73 + arg2 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local78 == local68 + 1 && local73 <= local63 && local94 >= local63 && (this.anIntArrayArray3[local78][local63] & 0x80) == 0) {
						return true;
					}
					if (local68 >= local78 && local87 >= local68 && local73 == local63 - arg2 && (this.anIntArrayArray3[local68][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 - arg2 == local78 && local63 >= local73 && local63 <= local94 && (this.anIntArrayArray3[local87][local63] & 0x8) == 0) {
						return true;
					}
					if (local78 <= local68 && local68 <= local87 && local63 - arg2 == local73 && (this.anIntArrayArray3[local68][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local78 == local68 - arg2 && local73 <= local63 && local63 <= local94 && (this.anIntArrayArray3[local87][local63] & 0x8) == 0) {
						return true;
					}
					if (local68 >= local78 && local68 <= local87 && local73 == local63 + 1 && (this.anIntArrayArray3[local68][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local78 == local68 + 1 && local73 <= local63 && local63 <= local94 && (this.anIntArrayArray3[local78][local63] & 0x80) == 0) {
						return true;
					}
					if (local68 >= local78 && local68 <= local87 && local63 + 1 == local73 && (this.anIntArrayArray3[local68][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local78 <= local68 && local68 <= local87 && local63 + 1 == local73 && (this.anIntArrayArray3[local68][local73] & 0x20) == 0) {
					return true;
				}
				if (local68 >= local78 && local87 >= local68 && local73 == local63 - arg2 && (this.anIntArrayArray3[local68][local94] & 0x2) == 0) {
					return true;
				}
				if (local68 - arg2 == local78 && local73 <= local63 && local63 <= local94 && (this.anIntArrayArray3[local87][local63] & 0x8) == 0) {
					return true;
				}
				if (local78 == local68 + 1 && local73 <= local63 && local63 <= local94 && (this.anIntArrayArray3[local78][local63] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)V")
	private void method1645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg3 == arg1 && arg0 == arg2) {
				return true;
			}
		} else if (arg1 >= arg3 && arg3 + arg6 - 1 >= arg1 && arg2 <= arg2 && arg2 + arg6 - 1 >= arg2) {
			return true;
		}
		@Pc(54) int local54 = arg0 - this.anInt1886;
		@Pc(59) int local59 = arg2 - this.anInt1886;
		@Pc(64) int local64 = arg3 - this.anInt1884;
		@Pc(74) int local74 = arg1 - this.anInt1884;
		if (arg6 == 1) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local74 - 1 == local64 && local54 == local59) {
						return true;
					}
					if (local64 == local74 && local59 + 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 && local54 == local59 - 1 && (this.anIntArrayArray3[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 == local74 && local54 == local59 + 1) {
						return true;
					}
					if (local64 == local74 - 1 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 == local74 + 1 && local59 == local54) {
						return true;
					}
					if (local74 == local64 && local59 + 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local64 && local59 - 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local74 == local64 && local59 - 1 == local54) {
						return true;
					}
					if (local64 == local74 - 1 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local59 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local64 == local74 - 1 && local59 == local54) {
						return true;
					}
					if (local64 == local74 && local54 == local59 + 1) {
						return true;
					}
					if (local64 == local74 + 1 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local64 && local59 - 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local74 - 1 == local64 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local64 && local54 == local59 + 1) {
						return true;
					}
					if (local64 == local74 + 1 && local54 == local59) {
						return true;
					}
					if (local64 == local74 && local54 == local59 - 1 && (this.anIntArrayArray3[local64][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 - 1 == local64 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local74 && local59 + 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local59 == local54) {
						return true;
					}
					if (local74 == local64 && local59 - 1 == local54) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 == local74 - 1 && local59 == local54) {
						return true;
					}
					if (local64 == local74 && local54 == local59 + 1 && (this.anIntArrayArray3[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local74 && local54 == local59 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local74 == local64 && local59 + 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x20) == 0) {
					return true;
				}
				if (local74 == local64 && local59 - 1 == local54 && (this.anIntArrayArray3[local64][local54] & 0x2) == 0) {
					return true;
				}
				if (local64 == local74 - 1 && local54 == local59 && (this.anIntArrayArray3[local64][local54] & 0x8) == 0) {
					return true;
				}
				if (local64 == local74 + 1 && local59 == local54 && (this.anIntArrayArray3[local64][local54] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(85) int local85 = local64 + arg6 - 1;
			@Pc(91) int local91 = local54 + arg6 - 1;
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local74 - arg6 == local64 && local59 >= local54 && local59 <= local91) {
						return true;
					}
					if (local64 <= local74 && local85 >= local74 && local59 + 1 == local54 && (this.anIntArrayArray3[local74][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local74 && local74 <= local85 && local54 == local59 - arg6 && (this.anIntArrayArray3[local74][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 <= local74 && local74 <= local85 && local59 + 1 == local54) {
						return true;
					}
					if (local64 == local74 - arg6 && local54 <= local59 && local59 <= local91 && (this.anIntArrayArray3[local85][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local59 >= local54 && local59 <= local91 && (this.anIntArrayArray3[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 == local74 + 1 && local59 >= local54 && local91 >= local59) {
						return true;
					}
					if (local74 >= local64 && local74 <= local85 && local59 + 1 == local54 && (this.anIntArrayArray3[local74][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 >= local64 && local85 >= local74 && local54 == local59 - arg6 && (this.anIntArrayArray3[local74][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 <= local74 && local85 >= local74 && local59 - arg6 == local54) {
						return true;
					}
					if (local74 - arg6 == local64 && local54 <= local59 && local59 <= local91 && (this.anIntArrayArray3[local85][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local59 >= local54 && local91 >= local59 && (this.anIntArrayArray3[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local74 - arg6 == local64 && local54 <= local59 && local59 <= local91) {
						return true;
					}
					if (local64 <= local74 && local74 <= local85 && local54 == local59 + 1) {
						return true;
					}
					if (local74 + 1 == local64 && local59 >= local54 && local91 >= local59 && (this.anIntArrayArray3[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 <= local74 && local85 >= local74 && local54 == local59 - arg6 && (this.anIntArrayArray3[local74][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 == local74 - arg6 && local59 >= local54 && local59 <= local91 && (this.anIntArrayArray3[local85][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local74 && local74 <= local85 && local59 + 1 == local54) {
						return true;
					}
					if (local64 == local74 + 1 && local59 >= local54 && local59 <= local91) {
						return true;
					}
					if (local74 >= local64 && local74 <= local85 && local59 - arg6 == local54 && (this.anIntArrayArray3[local74][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 - arg6 == local64 && local54 <= local59 && local91 >= local59 && (this.anIntArrayArray3[local85][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 >= local64 && local74 <= local85 && local54 == local59 + 1 && (this.anIntArrayArray3[local74][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local59 >= local54 && local59 <= local91) {
						return true;
					}
					if (local64 <= local74 && local85 >= local74 && local54 == local59 - arg6) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 == local74 - arg6 && local59 >= local54 && local59 <= local91) {
						return true;
					}
					if (local74 >= local64 && local74 <= local85 && local54 == local59 + 1 && (this.anIntArrayArray3[local74][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local54 <= local59 && local59 <= local91 && (this.anIntArrayArray3[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 >= local64 && local85 >= local74 && local54 == local59 - arg6) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local64 <= local74 && local85 >= local74 && local54 == local59 + 1 && (this.anIntArrayArray3[local74][local54] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 <= local74 && local74 <= local85 && local54 == local59 - arg6 && (this.anIntArrayArray3[local74][local91] & 0x2C0102) == 0) {
					return true;
				}
				if (local74 - arg6 == local64 && local59 >= local54 && local91 >= local59 && (this.anIntArrayArray3[local85][local59] & 0x2C0108) == 0) {
					return true;
				}
				if (local74 + 1 == local64 && local54 <= local59 && local91 >= local59 && (this.anIntArrayArray3[local64][local59] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIZIIZI)V")
	public void method1647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt1884;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg6 - this.anInt1886;
		@Pc(39) int local39;
		if (arg3 == 1 || arg3 == 3) {
			local39 = arg1;
			arg1 = arg4;
			arg4 = local39;
		}
		for (local39 = local18; local39 < arg1 + local18; local39++) {
			if (local39 >= 0 && local39 < this.anInt1890) {
				for (@Pc(62) int local62 = local29; local62 < arg4 + local29; local62++) {
					if (local62 >= 0 && local62 < this.anInt1892) {
						this.method1645(local7, local62, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZIIZIZI)V")
	public void method1648(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1884;
		@Pc(13) int local13 = arg2 - this.anInt1886;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method1645(128, local13, local4);
				this.method1645(8, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1645(2, local13, local4);
				this.method1645(32, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1645(8, local13, local4);
				this.method1645(128, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1645(32, local13, local4);
				this.method1645(2, local13 - 1, local4);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method1645(1, local13, local4);
				this.method1645(16, local13 + 1, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1645(4, local13, local4);
				this.method1645(64, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1645(16, local13, local4);
				this.method1645(1, local13 - 1, local4 - -1);
			}
			if (arg4 == 3) {
				this.method1645(64, local13, local4);
				this.method1645(4, local13 - 1, local4 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method1645(130, local13, local4);
				this.method1645(8, local13, local4 - 1);
				this.method1645(32, local13 + 1, local4);
			}
			if (arg4 == 1) {
				this.method1645(10, local13, local4);
				this.method1645(32, local13 + 1, local4);
				this.method1645(128, local13, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1645(40, local13, local4);
				this.method1645(128, local13, local4 + 1);
				this.method1645(2, local13 - 1, local4);
			}
			if (arg4 == 3) {
				this.method1645(160, local13, local4);
				this.method1645(2, local13 - 1, local4);
				this.method1645(8, local13, local4 - 1);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method1645(65536, local13, local4);
					this.method1645(4096, local13, local4 - 1);
				}
				if (arg4 == 1) {
					this.method1645(1024, local13, local4);
					this.method1645(16384, local13 + 1, local4);
				}
				if (arg4 == 2) {
					this.method1645(4096, local13, local4);
					this.method1645(65536, local13, local4 + 1);
				}
				if (arg4 == 3) {
					this.method1645(16384, local13, local4);
					this.method1645(1024, local13 - 1, local4);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method1645(512, local13, local4);
					this.method1645(8192, local13 + 1, local4 - 1);
				}
				if (arg4 == 1) {
					this.method1645(2048, local13, local4);
					this.method1645(32768, local13 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1645(8192, local13, local4);
					this.method1645(512, local13 - 1, local4 + 1);
				}
				if (arg4 == 3) {
					this.method1645(32768, local13, local4);
					this.method1645(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method1645(66560, local13, local4);
					this.method1645(4096, local13, local4 - 1);
					this.method1645(16384, local13 + 1, local4);
				}
				if (arg4 == 1) {
					this.method1645(5120, local13, local4);
					this.method1645(16384, local13 + 1, local4);
					this.method1645(65536, local13, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1645(20480, local13, local4);
					this.method1645(65536, local13, local4 + 1);
					this.method1645(1024, local13 - 1, local4);
				}
				if (arg4 == 3) {
					this.method1645(81920, local13, local4);
					this.method1645(1024, local13 - 1, local4);
					this.method1645(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method1645(536870912, local13, local4);
				this.method1645(33554432, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method1645(8388608, local13, local4);
				this.method1645(134217728, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1645(33554432, local13, local4);
				this.method1645(536870912, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method1645(134217728, local13, local4);
				this.method1645(8388608, local13 - 1, local4);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method1645(4194304, local13, local4);
				this.method1645(67108864, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method1645(16777216, local13, local4);
				this.method1645(268435456, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1645(67108864, local13, local4);
				this.method1645(4194304, local13 - 1, local4 - -1);
			}
			if (arg4 == 3) {
				this.method1645(268435456, local13, local4);
				this.method1645(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1645(545259520, local13, local4);
			this.method1645(33554432, local13, local4 - 1);
			this.method1645(134217728, local13 + 1, local4);
		}
		if (arg4 == 1) {
			this.method1645(41943040, local13, local4);
			this.method1645(134217728, local13 + 1, local4);
			this.method1645(536870912, local13, local4 + 1);
		}
		if (arg4 == 2) {
			this.method1645(167772160, local13, local4);
			this.method1645(536870912, local13, local4 + 1);
			this.method1645(8388608, local13 - 1, local4);
		}
		if (arg4 == 3) {
			this.method1645(671088640, local13, local4);
			this.method1645(8388608, local13 - 1, local4);
			this.method1645(33554432, local13, local4 - 1);
			return;
		}
	}
}

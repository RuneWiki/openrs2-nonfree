import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class67 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public int anInt1637;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public int anInt1639;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public int anInt1642;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public int anInt1647;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public void method1322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1639;
		@Pc(13) int local13 = arg1 - this.anInt1637;
		this.anIntArrayArray19[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method1323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg4 + arg3;
		@Pc(14) int local14 = arg7 + arg6;
		@Pc(18) int local18 = arg2 + arg1;
		@Pc(22) int local22 = arg5 + arg0;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (local18 == arg4 && (arg8 & 0x2) == 0) {
			local76 = arg0 < arg6 ? arg6 : arg0;
			local83 = local22 > local14 ? local14 : local22;
			while (local76 < local83) {
				if ((this.anIntArrayArray19[local18 - this.anInt1637 - 1][local76 - this.anInt1639] & 0x8) == 0) {
					return true;
				}
				local76++;
			}
		} else if (arg1 == local10 && (arg8 & 0x8) == 0) {
			local76 = arg6 > arg0 ? arg6 : arg0;
			local83 = local14 < local22 ? local14 : local22;
			while (local76 < local83) {
				if ((this.anIntArrayArray19[arg1 - this.anInt1637][local76 - this.anInt1639] & 0x80) == 0) {
					return true;
				}
				local76++;
			}
		} else if (arg6 == local22 && (arg8 & 0x1) == 0) {
			local76 = arg1 < arg4 ? arg4 : arg1;
			local83 = local18 <= local10 ? local18 : local10;
			while (local83 > local76) {
				if ((this.anIntArrayArray19[local76 - this.anInt1637][local22 - this.anInt1639 - 1] & 0x2) == 0) {
					return true;
				}
				local76++;
			}
		} else if (local14 == arg0 && (arg8 & 0x4) == 0) {
			local76 = arg4 > arg1 ? arg4 : arg1;
			local83 = local10 < local18 ? local10 : local18;
			while (local76 < local83) {
				if ((this.anIntArrayArray19[local76 - this.anInt1637][arg0 - this.anInt1639] & 0x20) == 0) {
					return true;
				}
				local76++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public void method1324() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1647; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1642; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt1647 - 5 || local7 >= this.anInt1642 - 5) {
					this.anIntArrayArray19[local3][local7] = -1;
				} else {
					this.anIntArrayArray19[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
	public void method1325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1637;
		@Pc(13) int local13 = arg1 - this.anInt1639;
		this.anIntArrayArray19[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg1 == arg5 && arg6 == arg2) {
				return true;
			}
		} else if (arg1 <= arg5 && arg5 <= arg1 + arg4 - 1 && arg6 >= arg6 && arg4 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(54) int local54 = arg6 - this.anInt1639;
		@Pc(59) int local59 = arg5 - this.anInt1637;
		@Pc(69) int local69 = arg1 - this.anInt1637;
		@Pc(74) int local74 = arg2 - this.anInt1639;
		if (arg4 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local69 == local59 + 1 && local74 == local54 && (this.anIntArrayArray19[local69][local74] & 0x80) == 0) {
						return true;
					}
					if (local69 == local59 && local54 - 1 == local74 && (this.anIntArrayArray19[local69][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 - 1 == local69 && local54 == local74 && (this.anIntArrayArray19[local69][local74] & 0x8) == 0) {
						return true;
					}
					if (local69 == local59 && local54 - 1 == local74 && (this.anIntArrayArray19[local69][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 - 1 == local69 && local54 == local74 && (this.anIntArrayArray19[local69][local74] & 0x8) == 0) {
						return true;
					}
					if (local69 == local59 && local54 + 1 == local74 && (this.anIntArrayArray19[local69][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local69 == local59 + 1 && local54 == local74 && (this.anIntArrayArray19[local69][local74] & 0x80) == 0) {
						return true;
					}
					if (local69 == local59 && local54 + 1 == local74 && (this.anIntArrayArray19[local69][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local59 == local69 && local54 + 1 == local74 && (this.anIntArrayArray19[local69][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 == local69 && local54 - 1 == local74 && (this.anIntArrayArray19[local69][local74] & 0x2) == 0) {
					return true;
				}
				if (local69 == local59 - 1 && local54 == local74 && (this.anIntArrayArray19[local69][local74] & 0x8) == 0) {
					return true;
				}
				if (local69 == local59 + 1 && local74 == local54 && (this.anIntArrayArray19[local69][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(434) int local434 = arg4 + local69 - 1;
			@Pc(441) int local441 = local74 + arg4 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local69 == local59 + 1 && local74 <= local54 && local441 >= local54 && (this.anIntArrayArray19[local69][local54] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local69 && local434 >= local59 && local54 - arg4 == local74 && (this.anIntArrayArray19[local59][local441] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local69 == local59 - arg4 && local54 >= local74 && local441 >= local54 && (this.anIntArrayArray19[local434][local54] & 0x8) == 0) {
						return true;
					}
					if (local69 <= local59 && local434 >= local59 && local54 - arg4 == local74 && (this.anIntArrayArray19[local59][local441] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local69 == local59 - arg4 && local54 >= local74 && local54 <= local441 && (this.anIntArrayArray19[local434][local54] & 0x8) == 0) {
						return true;
					}
					if (local59 >= local69 && local59 <= local434 && local74 == local54 + 1 && (this.anIntArrayArray19[local59][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 + 1 == local69 && local74 <= local54 && local54 <= local441 && (this.anIntArrayArray19[local69][local54] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local69 && local434 >= local59 && local54 + 1 == local74 && (this.anIntArrayArray19[local59][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local59 >= local69 && local434 >= local59 && local54 + 1 == local74 && (this.anIntArrayArray19[local59][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 >= local69 && local59 <= local434 && local54 - arg4 == local74 && (this.anIntArrayArray19[local59][local441] & 0x2) == 0) {
					return true;
				}
				if (local59 - arg4 == local69 && local74 <= local54 && local54 <= local441 && (this.anIntArrayArray19[local434][local54] & 0x8) == 0) {
					return true;
				}
				if (local69 == local59 + 1 && local74 <= local54 && local54 <= local441 && (this.anIntArrayArray19[local69][local54] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIBIIZI)V")
	public void method1327(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1639;
		@Pc(13) int local13 = arg5 - this.anInt1637;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1335(local13, 128, local4);
				this.method1335(local13 - 1, 8, local4);
			}
			if (arg2 == 1) {
				this.method1335(local13, 2, local4);
				this.method1335(local13, 32, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1335(local13, 8, local4);
				this.method1335(local13 + 1, 128, local4);
			}
			if (arg2 == 3) {
				this.method1335(local13, 32, local4);
				this.method1335(local13, 2, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1335(local13, 1, local4);
				this.method1335(local13 - 1, 16, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1335(local13, 4, local4);
				this.method1335(local13 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1335(local13, 16, local4);
				this.method1335(local13 + 1, 1, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1335(local13, 64, local4);
				this.method1335(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method1335(local13, 130, local4);
				this.method1335(local13 - 1, 8, local4);
				this.method1335(local13, 32, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1335(local13, 10, local4);
				this.method1335(local13, 32, local4 + 1);
				this.method1335(local13 + 1, 128, local4);
			}
			if (arg2 == 2) {
				this.method1335(local13, 40, local4);
				this.method1335(local13 + 1, 128, local4);
				this.method1335(local13, 2, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1335(local13, 160, local4);
				this.method1335(local13, 2, local4 - 1);
				this.method1335(local13 - 1, 8, local4);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method1335(local13, 65536, local4);
					this.method1335(local13 - 1, 4096, local4);
				}
				if (arg2 == 1) {
					this.method1335(local13, 1024, local4);
					this.method1335(local13, 16384, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1335(local13, 4096, local4);
					this.method1335(local13 + 1, 65536, local4);
				}
				if (arg2 == 3) {
					this.method1335(local13, 16384, local4);
					this.method1335(local13, 1024, local4 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method1335(local13, 512, local4);
					this.method1335(local13 - 1, 8192, local4 + 1);
				}
				if (arg2 == 1) {
					this.method1335(local13, 2048, local4);
					this.method1335(local13 + 1, 32768, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1335(local13, 8192, local4);
					this.method1335(local13 + 1, 512, local4 - 1);
				}
				if (arg2 == 3) {
					this.method1335(local13, 32768, local4);
					this.method1335(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method1335(local13, 66560, local4);
					this.method1335(local13 - 1, 4096, local4);
					this.method1335(local13, 16384, local4 + 1);
				}
				if (arg2 == 1) {
					this.method1335(local13, 5120, local4);
					this.method1335(local13, 16384, local4 + 1);
					this.method1335(local13 + 1, 65536, local4);
				}
				if (arg2 == 2) {
					this.method1335(local13, 20480, local4);
					this.method1335(local13 + 1, 65536, local4);
					this.method1335(local13, 1024, local4 - 1);
				}
				if (arg2 == 3) {
					this.method1335(local13, 81920, local4);
					this.method1335(local13, 1024, local4 - 1);
					this.method1335(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1335(local13, 536870912, local4);
				this.method1335(local13 - 1, 33554432, local4);
			}
			if (arg2 == 1) {
				this.method1335(local13, 8388608, local4);
				this.method1335(local13, 134217728, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1335(local13, 33554432, local4);
				this.method1335(local13 + 1, 536870912, local4);
			}
			if (arg2 == 3) {
				this.method1335(local13, 134217728, local4);
				this.method1335(local13, 8388608, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1335(local13, 4194304, local4);
				this.method1335(local13 - 1, 67108864, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1335(local13, 16777216, local4);
				this.method1335(local13 + 1, 268435456, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1335(local13, 67108864, local4);
				this.method1335(local13 + 1, 4194304, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1335(local13, 268435456, local4);
				this.method1335(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1335(local13, 545259520, local4);
			this.method1335(local13 - 1, 33554432, local4);
			this.method1335(local13, 134217728, local4 + 1);
		}
		if (arg2 == 1) {
			this.method1335(local13, 41943040, local4);
			this.method1335(local13, 134217728, local4 + 1);
			this.method1335(local13 + 1, 536870912, local4);
		}
		if (arg2 == 2) {
			this.method1335(local13, 167772160, local4);
			this.method1335(local13 + 1, 536870912, local4);
			this.method1335(local13, 8388608, local4 - 1);
		}
		if (arg2 == 3) {
			this.method1335(local13, 671088640, local4);
			this.method1335(local13, 8388608, local4 - 1);
			this.method1335(local13 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIZIZ)V")
	public void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1639;
		@Pc(9) int local9 = arg4 - this.anInt1637;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1337(local9, 128, local4);
				this.method1337(local9 - 1, 8, local4);
			}
			if (arg2 == 1) {
				this.method1337(local9, 2, local4);
				this.method1337(local9, 32, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1337(local9, 8, local4);
				this.method1337(local9 + 1, 128, local4);
			}
			if (arg2 == 3) {
				this.method1337(local9, 32, local4);
				this.method1337(local9, 2, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1337(local9, 1, local4);
				this.method1337(local9 - 1, 16, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1337(local9, 4, local4);
				this.method1337(local9 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1337(local9, 16, local4);
				this.method1337(local9 + 1, 1, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1337(local9, 64, local4);
				this.method1337(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1337(local9, 130, local4);
				this.method1337(local9 - 1, 8, local4);
				this.method1337(local9, 32, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1337(local9, 10, local4);
				this.method1337(local9, 32, local4 + 1);
				this.method1337(local9 + 1, 128, local4);
			}
			if (arg2 == 2) {
				this.method1337(local9, 40, local4);
				this.method1337(local9 + 1, 128, local4);
				this.method1337(local9, 2, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1337(local9, 160, local4);
				this.method1337(local9, 2, local4 - 1);
				this.method1337(local9 - 1, 8, local4);
			}
		}
		if (arg5) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method1337(local9, 65536, local4);
					this.method1337(local9 - 1, 4096, local4);
				}
				if (arg2 == 1) {
					this.method1337(local9, 1024, local4);
					this.method1337(local9, 16384, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1337(local9, 4096, local4);
					this.method1337(local9 + 1, 65536, local4);
				}
				if (arg2 == 3) {
					this.method1337(local9, 16384, local4);
					this.method1337(local9, 1024, local4 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method1337(local9, 512, local4);
					this.method1337(local9 - 1, 8192, local4 + 1);
				}
				if (arg2 == 1) {
					this.method1337(local9, 2048, local4);
					this.method1337(local9 + 1, 32768, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1337(local9, 8192, local4);
					this.method1337(local9 + 1, 512, local4 - 1);
				}
				if (arg2 == 3) {
					this.method1337(local9, 32768, local4);
					this.method1337(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method1337(local9, 66560, local4);
					this.method1337(local9 - 1, 4096, local4);
					this.method1337(local9, 16384, local4 + 1);
				}
				if (arg2 == 1) {
					this.method1337(local9, 5120, local4);
					this.method1337(local9, 16384, local4 + 1);
					this.method1337(local9 + 1, 65536, local4);
				}
				if (arg2 == 2) {
					this.method1337(local9, 20480, local4);
					this.method1337(local9 + 1, 65536, local4);
					this.method1337(local9, 1024, local4 - 1);
				}
				if (arg2 == 3) {
					this.method1337(local9, 81920, local4);
					this.method1337(local9, 1024, local4 - 1);
					this.method1337(local9 - 1, 4096, local4);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1337(local9, 536870912, local4);
				this.method1337(local9 - 1, 33554432, local4);
			}
			if (arg2 == 1) {
				this.method1337(local9, 8388608, local4);
				this.method1337(local9, 134217728, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1337(local9, 33554432, local4);
				this.method1337(local9 + 1, 536870912, local4);
			}
			if (arg2 == 3) {
				this.method1337(local9, 134217728, local4);
				this.method1337(local9, 8388608, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1337(local9, 4194304, local4);
				this.method1337(local9 - 1, 67108864, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1337(local9, 16777216, local4);
				this.method1337(local9 + 1, 268435456, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1337(local9, 67108864, local4);
				this.method1337(local9 + 1, 4194304, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1337(local9, 268435456, local4);
				this.method1337(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1337(local9, 545259520, local4);
			this.method1337(local9 - 1, 33554432, local4);
			this.method1337(local9, 134217728, local4 + 1);
		}
		if (arg2 == 1) {
			this.method1337(local9, 41943040, local4);
			this.method1337(local9, 134217728, local4 + 1);
			this.method1337(local9 + 1, 536870912, local4);
		}
		if (arg2 == 2) {
			this.method1337(local9, 167772160, local4);
			this.method1337(local9 + 1, 536870912, local4);
			this.method1337(local9, 8388608, local4 - 1);
		}
		if (arg2 == 3) {
			this.method1337(local9, 671088640, local4);
			this.method1337(local9, 8388608, local4 - 1);
			this.method1337(local9 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIIIZ)V")
	public void method1329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(27) int local27;
		if (arg1 == 1 || arg1 == 3) {
			local27 = arg3;
			arg3 = arg5;
			arg5 = local27;
		}
		@Pc(36) int local36 = arg0 - this.anInt1637;
		@Pc(41) int local41 = arg4 - this.anInt1639;
		for (local27 = local36; local27 < arg3 + local36; local27++) {
			if (local27 >= 0 && local27 < this.anInt1647) {
				for (@Pc(57) int local57 = local41; local57 < local41 + arg5; local57++) {
					if (local57 >= 0 && local57 < this.anInt1642) {
						this.method1335(local27, local7, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method1331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg3 && arg1 == arg2) {
				return true;
			}
		} else if (arg3 <= arg4 && arg4 <= arg3 + arg5 - 1 && arg2 <= arg2 && arg2 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg4 - this.anInt1637;
		@Pc(66) int local66 = arg2 - this.anInt1639;
		@Pc(71) int local71 = arg3 - this.anInt1637;
		@Pc(81) int local81 = arg1 - this.anInt1639;
		if (arg5 == 1) {
			if (arg6 == 0) {
				if (arg0 == 0) {
					if (local61 - 1 == local71 && local81 == local66) {
						return true;
					}
					if (local71 == local61 && local81 == local66 + 1 && (this.anIntArrayArray19[local71][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local61 && local66 - 1 == local81 && (this.anIntArrayArray19[local71][local81] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local71 == local61 && local81 == local66 + 1) {
						return true;
					}
					if (local71 == local61 - 1 && local81 == local66 && (this.anIntArrayArray19[local71][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local81 == local66 && (this.anIntArrayArray19[local71][local81] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 + 1 == local71 && local66 == local81) {
						return true;
					}
					if (local71 == local61 && local81 == local66 + 1 && (this.anIntArrayArray19[local71][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local81 && (this.anIntArrayArray19[local71][local81] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local71 == local61 && local81 == local66 - 1) {
						return true;
					}
					if (local61 - 1 == local71 && local81 == local66 && (this.anIntArrayArray19[local71][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local66 == local81 && (this.anIntArrayArray19[local71][local81] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg0 == 0) {
					if (local71 == local61 - 1 && local81 == local66) {
						return true;
					}
					if (local71 == local61 && local81 == local66 + 1) {
						return true;
					}
					if (local71 == local61 + 1 && local81 == local66 && (this.anIntArrayArray19[local71][local81] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local81 && (this.anIntArrayArray19[local71][local81] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local61 - 1 == local71 && local81 == local66 && (this.anIntArrayArray19[local71][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local81 == local66 + 1) {
						return true;
					}
					if (local61 + 1 == local71 && local81 == local66) {
						return true;
					}
					if (local71 == local61 && local81 == local66 - 1 && (this.anIntArrayArray19[local71][local81] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 - 1 == local71 && local81 == local66 && (this.anIntArrayArray19[local71][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local81 == local66 + 1 && (this.anIntArrayArray19[local71][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local81 == local66) {
						return true;
					}
					if (local71 == local61 && local66 - 1 == local81) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local61 - 1 == local71 && local66 == local81) {
						return true;
					}
					if (local61 == local71 && local81 == local66 + 1 && (this.anIntArrayArray19[local71][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 == local81 && (this.anIntArrayArray19[local71][local81] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local61 && local81 == local66 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local61 == local71 && local81 == local66 + 1 && (this.anIntArrayArray19[local71][local81] & 0x20) == 0) {
					return true;
				}
				if (local71 == local61 && local81 == local66 - 1 && (this.anIntArrayArray19[local71][local81] & 0x2) == 0) {
					return true;
				}
				if (local61 - 1 == local71 && local66 == local81 && (this.anIntArrayArray19[local71][local81] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local66 == local81 && (this.anIntArrayArray19[local71][local81] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = arg5 + local71 - 1;
			@Pc(96) int local96 = local81 + arg5 - 1;
			if (arg6 == 0) {
				if (arg0 == 0) {
					if (local61 - arg5 == local71 && local66 >= local81 && local66 <= local96) {
						return true;
					}
					if (local61 >= local71 && local90 >= local61 && local81 == local66 + 1 && (this.anIntArrayArray19[local61][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 <= local61 && local90 >= local61 && local66 - arg5 == local81 && (this.anIntArrayArray19[local61][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local71 <= local61 && local90 >= local61 && local81 == local66 + 1) {
						return true;
					}
					if (local61 - arg5 == local71 && local66 >= local81 && local66 <= local96 && (this.anIntArrayArray19[local90][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local81 <= local66 && local66 <= local96 && (this.anIntArrayArray19[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local61 + 1 == local71 && local66 >= local81 && local66 <= local96) {
						return true;
					}
					if (local61 >= local71 && local61 <= local90 && local66 + 1 == local81 && (this.anIntArrayArray19[local61][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 <= local61 && local61 <= local90 && local81 == local66 - arg5 && (this.anIntArrayArray19[local61][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local71 <= local61 && local61 <= local90 && local66 - arg5 == local81) {
						return true;
					}
					if (local61 - arg5 == local71 && local66 >= local81 && local96 >= local66 && (this.anIntArrayArray19[local90][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local81 <= local66 && local66 <= local96 && (this.anIntArrayArray19[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg0 == 0) {
					if (local71 == local61 - arg5 && local81 <= local66 && local96 >= local66) {
						return true;
					}
					if (local61 >= local71 && local90 >= local61 && local81 == local66 + 1) {
						return true;
					}
					if (local71 == local61 + 1 && local81 <= local66 && local66 <= local96 && (this.anIntArrayArray19[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 <= local61 && local61 <= local90 && local81 == local66 - arg5 && (this.anIntArrayArray19[local61][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local71 == local61 - arg5 && local66 >= local81 && local96 >= local66 && (this.anIntArrayArray19[local90][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local90 && local81 == local66 + 1) {
						return true;
					}
					if (local71 == local61 + 1 && local66 >= local81 && local96 >= local66) {
						return true;
					}
					if (local71 <= local61 && local90 >= local61 && local66 - arg5 == local81 && (this.anIntArrayArray19[local61][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local71 == local61 - arg5 && local81 <= local66 && local96 >= local66 && (this.anIntArrayArray19[local90][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local90 && local81 == local66 + 1 && (this.anIntArrayArray19[local61][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local81 <= local66 && local66 <= local96) {
						return true;
					}
					if (local61 >= local71 && local61 <= local90 && local66 - arg5 == local81) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local71 == local61 - arg5 && local66 >= local81 && local96 >= local66) {
						return true;
					}
					if (local71 <= local61 && local61 <= local90 && local66 + 1 == local81 && (this.anIntArrayArray19[local61][local81] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 >= local81 && local66 <= local96 && (this.anIntArrayArray19[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 <= local61 && local90 >= local61 && local81 == local66 - arg5) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local61 >= local71 && local61 <= local90 && local81 == local66 + 1 && (this.anIntArrayArray19[local61][local81] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 >= local71 && local90 >= local61 && local66 - arg5 == local81 && (this.anIntArrayArray19[local61][local96] & 0x2C0102) == 0) {
					return true;
				}
				if (local61 - arg5 == local71 && local81 <= local66 && local66 <= local96 && (this.anIntArrayArray19[local90][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 == local61 + 1 && local66 >= local81 && local66 <= local96 && (this.anIntArrayArray19[local71][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZZI)V")
	public void method1332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt1637;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg1 - this.anInt1639;
		for (@Pc(31) int local31 = local18; local31 < local18 + arg5; local31++) {
			if (local31 >= 0 && local31 < this.anInt1647) {
				for (@Pc(41) int local41 = local29; local41 < local29 + arg0; local41++) {
					if (local41 >= 0 && local41 < this.anInt1642) {
						this.method1337(local31, local7, local41);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
	public void method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1639;
		@Pc(9) int local9 = arg0 - this.anInt1637;
		this.anIntArrayArray19[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	private void method1335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray19[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(III)V")
	public void method1336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1637;
		@Pc(9) int local9 = arg0 - this.anInt1639;
		this.anIntArrayArray19[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
	private void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZIIIII)Z")
	public boolean method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static252.method4104(arg4, arg5, arg2, arg6, arg0, arg1, arg3, arg2) ? true : this.method1323(arg1, arg6, arg5, arg2, arg0, arg4, arg3, arg2, arg7);
		}
		@Pc(40) int local40 = arg5 + arg6 - 1;
		@Pc(46) int local46 = arg4 + arg1 - 1;
		if (arg6 <= arg0 && arg0 <= local40 && arg1 <= arg3 && local46 >= arg3) {
			return true;
		} else if (arg6 - 1 == arg0 && arg1 <= arg3 && arg3 <= local46 && (this.anIntArrayArray19[arg0 - this.anInt1637][arg3 - this.anInt1639] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg0 == local40 + 1 && arg1 <= arg3 && arg3 <= local46 && (this.anIntArrayArray19[arg0 - this.anInt1637][arg3 - this.anInt1639] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg1 - 1 && arg0 >= arg6 && arg0 <= local40 && (this.anIntArrayArray19[arg0 - this.anInt1637][arg3 - this.anInt1639] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local46 + 1 && arg6 <= arg0 && local40 >= arg0 && (this.anIntArrayArray19[arg0 - this.anInt1637][arg3 - this.anInt1639] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}
}

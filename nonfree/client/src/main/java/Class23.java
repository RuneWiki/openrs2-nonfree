import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class23 {

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	public int anInt916;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	public int anInt923;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	public int anInt926;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	public int anInt934;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg1;
		@Pc(11) int local11 = arg7 + arg3;
		@Pc(27) int local27 = arg5 + arg0;
		@Pc(32) int local32 = arg6 + arg8;
		@Pc(64) int local64;
		@Pc(75) int local75;
		if (arg1 == local27 && (arg2 & 0x2) == 0) {
			local64 = arg6 >= arg7 ? arg6 : arg7;
			local75 = local11 >= local32 ? local32 : local11;
			while (local64 < local75) {
				if ((this.anIntArrayArray4[local27 - this.anInt923 - 1][local64 - this.anInt926] & 0x8) == 0) {
					return true;
				}
				local64++;
			}
		} else if (arg0 == local7 && (arg2 & 0x8) == 0) {
			local64 = arg7 <= arg6 ? arg6 : arg7;
			local75 = local11 >= local32 ? local32 : local11;
			while (local64 < local75) {
				if ((this.anIntArrayArray4[arg0 - this.anInt923][local64 - this.anInt926] & 0x80) == 0) {
					return true;
				}
				local64++;
			}
		} else if (local32 == arg7 && (arg2 & 0x1) == 0) {
			local64 = arg0 < arg1 ? arg1 : arg0;
			local75 = local27 > local7 ? local7 : local27;
			while (local75 > local64) {
				if ((this.anIntArrayArray4[local64 - this.anInt923][local32 - this.anInt926 - 1] & 0x2) == 0) {
					return true;
				}
				local64++;
			}
		} else if (local11 == arg6 && (arg2 & 0x4) == 0) {
			local64 = arg1 > arg0 ? arg1 : arg0;
			local75 = local7 < local27 ? local7 : local27;
			while (local75 > local64) {
				if ((this.anIntArrayArray4[local64 - this.anInt923][arg6 - this.anInt926] & 0x20) == 0) {
					return true;
				}
				local64++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg5 && arg3 == arg1) {
				return true;
			}
		} else if (arg4 >= arg5 && arg4 <= arg5 + arg0 - 1 && arg1 <= arg1 && arg1 <= arg0 + arg1 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg4 - this.anInt923;
		@Pc(63) int local63 = arg3 - this.anInt926;
		@Pc(74) int local74 = arg1 - this.anInt926;
		@Pc(79) int local79 = arg5 - this.anInt923;
		if (arg0 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local58 + 1 == local79 && local74 == local63 && (this.anIntArrayArray4[local79][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local79 && local74 - 1 == local63 && (this.anIntArrayArray4[local79][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local58 - 1 == local79 && local74 == local63 && (this.anIntArrayArray4[local79][local63] & 0x8) == 0) {
						return true;
					}
					if (local79 == local58 && local63 == local74 - 1 && (this.anIntArrayArray4[local79][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local79 == local58 - 1 && local63 == local74 && (this.anIntArrayArray4[local79][local63] & 0x8) == 0) {
						return true;
					}
					if (local79 == local58 && local63 == local74 + 1 && (this.anIntArrayArray4[local79][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local58 + 1 == local79 && local63 == local74 && (this.anIntArrayArray4[local79][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local79 && local63 == local74 + 1 && (this.anIntArrayArray4[local79][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local58 == local79 && local63 == local74 + 1 && (this.anIntArrayArray4[local79][local63] & 0x20) == 0) {
					return true;
				}
				if (local79 == local58 && local63 == local74 - 1 && (this.anIntArrayArray4[local79][local63] & 0x2) == 0) {
					return true;
				}
				if (local58 - 1 == local79 && local74 == local63 && (this.anIntArrayArray4[local79][local63] & 0x8) == 0) {
					return true;
				}
				if (local79 == local58 + 1 && local74 == local63 && (this.anIntArrayArray4[local79][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(88) int local88 = local79 + arg0 - 1;
			@Pc(94) int local94 = arg0 + local63 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local58 + 1 == local79 && local74 >= local63 && local94 >= local74 && (this.anIntArrayArray4[local79][local74] & 0x80) == 0) {
						return true;
					}
					if (local79 <= local58 && local88 >= local58 && local63 == local74 - arg0 && (this.anIntArrayArray4[local58][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local79 == local58 - arg0 && local63 <= local74 && local74 <= local94 && (this.anIntArrayArray4[local88][local74] & 0x8) == 0) {
						return true;
					}
					if (local79 <= local58 && local88 >= local58 && local63 == local74 - arg0 && (this.anIntArrayArray4[local58][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local58 - arg0 == local79 && local74 >= local63 && local94 >= local74 && (this.anIntArrayArray4[local88][local74] & 0x8) == 0) {
						return true;
					}
					if (local58 >= local79 && local88 >= local58 && local63 == local74 + 1 && (this.anIntArrayArray4[local58][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local79 == local58 + 1 && local63 <= local74 && local94 >= local74 && (this.anIntArrayArray4[local79][local74] & 0x80) == 0) {
						return true;
					}
					if (local58 >= local79 && local88 >= local58 && local63 == local74 + 1 && (this.anIntArrayArray4[local58][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local79 <= local58 && local88 >= local58 && local74 + 1 == local63 && (this.anIntArrayArray4[local58][local63] & 0x20) == 0) {
					return true;
				}
				if (local79 <= local58 && local88 >= local58 && local74 - arg0 == local63 && (this.anIntArrayArray4[local58][local94] & 0x2) == 0) {
					return true;
				}
				if (local79 == local58 - arg0 && local74 >= local63 && local74 <= local94 && (this.anIntArrayArray4[local88][local74] & 0x8) == 0) {
					return true;
				}
				if (local58 + 1 == local79 && local63 <= local74 && local74 <= local94 && (this.anIntArrayArray4[local79][local74] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
	public void method821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 - this.anInt923;
		@Pc(15) int local15 = arg1 - this.anInt926;
		this.anIntArrayArray4[local10][local15] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBIIZZ)V")
	public void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = arg2 - this.anInt923;
		@Pc(15) int local15 = arg3 - this.anInt926;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method835(local15, 128, local10);
				this.method835(local15, 8, local10 - 1);
			}
			if (arg1 == 1) {
				this.method835(local15, 2, local10);
				this.method835(local15 + 1, 32, local10);
			}
			if (arg1 == 2) {
				this.method835(local15, 8, local10);
				this.method835(local15, 128, local10 + 1);
			}
			if (arg1 == 3) {
				this.method835(local15, 32, local10);
				this.method835(local15 - 1, 2, local10);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method835(local15, 1, local10);
				this.method835(local15 + 1, 16, local10 - 1);
			}
			if (arg1 == 1) {
				this.method835(local15, 4, local10);
				this.method835(local15 + 1, 64, local10 + 1);
			}
			if (arg1 == 2) {
				this.method835(local15, 16, local10);
				this.method835(local15 - 1, 1, local10 + 1);
			}
			if (arg1 == 3) {
				this.method835(local15, 64, local10);
				this.method835(local15 - 1, 4, local10 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method835(local15, 130, local10);
				this.method835(local15, 8, local10 - 1);
				this.method835(local15 + 1, 32, local10);
			}
			if (arg1 == 1) {
				this.method835(local15, 10, local10);
				this.method835(local15 + 1, 32, local10);
				this.method835(local15, 128, local10 + 1);
			}
			if (arg1 == 2) {
				this.method835(local15, 40, local10);
				this.method835(local15, 128, local10 + 1);
				this.method835(local15 - 1, 2, local10);
			}
			if (arg1 == 3) {
				this.method835(local15, 160, local10);
				this.method835(local15 - 1, 2, local10);
				this.method835(local15, 8, local10 - 1);
			}
		}
		if (arg4) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method835(local15, 65536, local10);
					this.method835(local15, 4096, local10 - 1);
				}
				if (arg1 == 1) {
					this.method835(local15, 1024, local10);
					this.method835(local15 + 1, 16384, local10);
				}
				if (arg1 == 2) {
					this.method835(local15, 4096, local10);
					this.method835(local15, 65536, local10 + 1);
				}
				if (arg1 == 3) {
					this.method835(local15, 16384, local10);
					this.method835(local15 - 1, 1024, local10);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method835(local15, 512, local10);
					this.method835(local15 + 1, 8192, local10 - 1);
				}
				if (arg1 == 1) {
					this.method835(local15, 2048, local10);
					this.method835(local15 + 1, 32768, local10 + 1);
				}
				if (arg1 == 2) {
					this.method835(local15, 8192, local10);
					this.method835(local15 - 1, 512, local10 + 1);
				}
				if (arg1 == 3) {
					this.method835(local15, 32768, local10);
					this.method835(local15 - 1, 2048, local10 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method835(local15, 66560, local10);
					this.method835(local15, 4096, local10 - 1);
					this.method835(local15 + 1, 16384, local10);
				}
				if (arg1 == 1) {
					this.method835(local15, 5120, local10);
					this.method835(local15 + 1, 16384, local10);
					this.method835(local15, 65536, local10 + 1);
				}
				if (arg1 == 2) {
					this.method835(local15, 20480, local10);
					this.method835(local15, 65536, local10 + 1);
					this.method835(local15 - 1, 1024, local10);
				}
				if (arg1 == 3) {
					this.method835(local15, 81920, local10);
					this.method835(local15 - 1, 1024, local10);
					this.method835(local15, 4096, local10 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method835(local15, 536870912, local10);
				this.method835(local15, 33554432, local10 - 1);
			}
			if (arg1 == 1) {
				this.method835(local15, 8388608, local10);
				this.method835(local15 + 1, 134217728, local10);
			}
			if (arg1 == 2) {
				this.method835(local15, 33554432, local10);
				this.method835(local15, 536870912, local10 + 1);
			}
			if (arg1 == 3) {
				this.method835(local15, 134217728, local10);
				this.method835(local15 - 1, 8388608, local10);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method835(local15, 4194304, local10);
				this.method835(local15 + 1, 67108864, local10 - 1);
			}
			if (arg1 == 1) {
				this.method835(local15, 16777216, local10);
				this.method835(local15 + 1, 268435456, local10 + 1);
			}
			if (arg1 == 2) {
				this.method835(local15, 67108864, local10);
				this.method835(local15 - 1, 4194304, local10 + 1);
			}
			if (arg1 == 3) {
				this.method835(local15, 268435456, local10);
				this.method835(local15 - 1, 16777216, local10 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method835(local15, 545259520, local10);
			this.method835(local15, 33554432, local10 - 1);
			this.method835(local15 + 1, 134217728, local10);
		}
		if (arg1 == 1) {
			this.method835(local15, 41943040, local10);
			this.method835(local15 + 1, 134217728, local10);
			this.method835(local15, 536870912, local10 + 1);
		}
		if (arg1 == 2) {
			this.method835(local15, 167772160, local10);
			this.method835(local15, 536870912, local10 + 1);
			this.method835(local15 - 1, 8388608, local10);
		}
		if (arg1 == 3) {
			this.method835(local15, 671088640, local10);
			this.method835(local15 - 1, 8388608, local10);
			this.method835(local15, 33554432, local10 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIZII)Z")
	public boolean method823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static79.method1399(arg4, arg0, arg5, arg7, arg6, arg2, arg6, arg3) ? true : this.method817(arg4, arg2, arg1, arg6, arg6, arg5, arg0, arg3, arg7);
		}
		@Pc(45) int local45 = arg5 + arg4 - 1;
		@Pc(52) int local52 = arg0 + arg7 - 1;
		if (arg4 <= arg2 && arg2 <= local45 && arg3 >= arg0 && local52 >= arg3) {
			return true;
		} else if (arg4 - 1 == arg2 && arg3 >= arg0 && arg3 <= local52 && (this.anIntArrayArray4[arg2 - this.anInt923][arg3 - this.anInt926] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local45 + 1 == arg2 && arg3 >= arg0 && arg3 <= local52 && (this.anIntArrayArray4[arg2 - this.anInt923][arg3 - this.anInt926] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg0 - 1 && arg4 <= arg2 && arg2 <= local45 && (this.anIntArrayArray4[arg2 - this.anInt923][arg3 - this.anInt926] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local52 + 1 == arg3 && arg4 <= arg2 && local45 >= arg2 && (this.anIntArrayArray4[arg2 - this.anInt923][arg3 - this.anInt926] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V")
	private void method824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray4[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public void method825() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt916; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt934; local8++) {
				if (local5 == 0 || local8 == 0 || local5 >= this.anInt916 - 5 || local8 >= this.anInt934 - 5) {
					this.anIntArrayArray4[local5][local8] = -1;
				} else {
					this.anIntArrayArray4[local5][local8] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(III)V")
	public void method826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt923;
		@Pc(21) int local21 = arg1 - this.anInt926;
		this.anIntArrayArray4[local4][local21] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(III)V")
	public void method828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt923;
		@Pc(9) int local9 = arg0 - this.anInt926;
		this.anIntArrayArray4[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIZIII)V")
	public void method829(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg3) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg2 - this.anInt923;
		if (arg1) {
			local5 |= 0x40000000;
		}
		@Pc(27) int local27 = arg0 - this.anInt926;
		for (@Pc(37) int local37 = local16; local37 < local16 + arg4; local37++) {
			if (local37 >= 0 && local37 < this.anInt916) {
				for (@Pc(49) int local49 = local27; local49 < local27 + arg5; local49++) {
					if (local49 >= 0 && local49 < this.anInt934) {
						this.method824(local37, local49, local5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg1 && arg3 == arg6) {
				return true;
			}
		} else if (arg1 >= arg5 && arg1 <= arg4 + arg5 - 1 && arg6 <= arg6 && arg6 <= arg4 + arg6 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg1 - this.anInt923;
		@Pc(62) int local62 = arg3 - this.anInt926;
		@Pc(67) int local67 = arg5 - this.anInt923;
		@Pc(72) int local72 = arg6 - this.anInt926;
		if (arg4 == 1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					if (local67 == local57 - 1 && local72 == local62) {
						return true;
					}
					if (local57 == local67 && local72 + 1 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local57 && local72 - 1 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 == local67 && local72 + 1 == local62) {
						return true;
					}
					if (local57 - 1 == local67 && local62 == local72 && (this.anIntArrayArray4[local67][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local57 + 1 && local62 == local72 && (this.anIntArrayArray4[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 + 1 == local67 && local62 == local72) {
						return true;
					}
					if (local67 == local57 && local72 + 1 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local67 && local62 == local72 - 1 && (this.anIntArrayArray4[local67][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local67 && local72 - 1 == local62) {
						return true;
					}
					if (local57 - 1 == local67 && local62 == local72 && (this.anIntArrayArray4[local67][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local67 && local72 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					if (local57 - 1 == local67 && local62 == local72) {
						return true;
					}
					if (local57 == local67 && local72 + 1 == local62) {
						return true;
					}
					if (local57 + 1 == local67 && local72 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local57 && local62 == local72 - 1 && (this.anIntArrayArray4[local67][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 - 1 == local67 && local62 == local72 && (this.anIntArrayArray4[local67][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local67 && local72 + 1 == local62) {
						return true;
					}
					if (local57 + 1 == local67 && local62 == local72) {
						return true;
					}
					if (local57 == local67 && local62 == local72 - 1 && (this.anIntArrayArray4[local67][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 - 1 == local67 && local72 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local57 && local72 + 1 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local57 + 1 && local72 == local62) {
						return true;
					}
					if (local67 == local57 && local62 == local72 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local67 == local57 - 1 && local62 == local72) {
						return true;
					}
					if (local67 == local57 && local62 == local72 + 1 && (this.anIntArrayArray4[local67][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local57 + 1 && local72 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local67 && local62 == local72 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local67 == local57 && local72 + 1 == local62 && (this.anIntArrayArray4[local67][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 == local67 && local72 - 1 == local62 && (this.anIntArrayArray4[local67][local62] & 0x2) == 0) {
					return true;
				}
				if (local67 == local57 - 1 && local72 == local62 && (this.anIntArrayArray4[local67][local62] & 0x8) == 0) {
					return true;
				}
				if (local67 == local57 + 1 && local72 == local62 && (this.anIntArrayArray4[local67][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(797) int local797 = arg4 + local67 - 1;
			@Pc(803) int local803 = arg4 + local62 - 1;
			if (arg0 == 0) {
				if (arg2 == 0) {
					if (local57 - arg4 == local67 && local62 <= local72 && local803 >= local72) {
						return true;
					}
					if (local57 >= local67 && local57 <= local797 && local62 == local72 + 1 && (this.anIntArrayArray4[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 <= local57 && local57 <= local797 && local62 == local72 - arg4 && (this.anIntArrayArray4[local57][local803] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 >= local67 && local797 >= local57 && local62 == local72 + 1) {
						return true;
					}
					if (local67 == local57 - arg4 && local62 <= local72 && local803 >= local72 && (this.anIntArrayArray4[local797][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local67 && local62 <= local72 && local803 >= local72 && (this.anIntArrayArray4[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 + 1 == local67 && local62 <= local72 && local72 <= local803) {
						return true;
					}
					if (local57 >= local67 && local57 <= local797 && local62 == local72 + 1 && (this.anIntArrayArray4[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 <= local57 && local57 <= local797 && local62 == local72 - arg4 && (this.anIntArrayArray4[local57][local803] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 >= local67 && local57 <= local797 && local62 == local72 - arg4) {
						return true;
					}
					if (local57 - arg4 == local67 && local72 >= local62 && local72 <= local803 && (this.anIntArrayArray4[local797][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local57 + 1 && local62 <= local72 && local72 <= local803 && (this.anIntArrayArray4[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					if (local57 - arg4 == local67 && local72 >= local62 && local803 >= local72) {
						return true;
					}
					if (local57 >= local67 && local797 >= local57 && local62 == local72 + 1) {
						return true;
					}
					if (local57 + 1 == local67 && local62 <= local72 && local72 <= local803 && (this.anIntArrayArray4[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 >= local67 && local57 <= local797 && local72 - arg4 == local62 && (this.anIntArrayArray4[local57][local803] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 - arg4 == local67 && local72 >= local62 && local803 >= local72 && (this.anIntArrayArray4[local797][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 >= local67 && local797 >= local57 && local62 == local72 + 1) {
						return true;
					}
					if (local67 == local57 + 1 && local72 >= local62 && local72 <= local803) {
						return true;
					}
					if (local57 >= local67 && local797 >= local57 && local62 == local72 - arg4 && (this.anIntArrayArray4[local57][local803] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local67 == local57 - arg4 && local72 >= local62 && local72 <= local803 && (this.anIntArrayArray4[local797][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 <= local57 && local797 >= local57 && local72 + 1 == local62 && (this.anIntArrayArray4[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local57 + 1 && local72 >= local62 && local803 >= local72) {
						return true;
					}
					if (local57 >= local67 && local797 >= local57 && local72 - arg4 == local62) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local67 == local57 - arg4 && local72 >= local62 && local803 >= local72) {
						return true;
					}
					if (local57 >= local67 && local57 <= local797 && local62 == local72 + 1 && (this.anIntArrayArray4[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 + 1 == local67 && local62 <= local72 && local72 <= local803 && (this.anIntArrayArray4[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 <= local57 && local797 >= local57 && local62 == local72 - arg4) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local67 <= local57 && local57 <= local797 && local72 + 1 == local62 && (this.anIntArrayArray4[local57][local62] & 0x2C0120) == 0) {
					return true;
				}
				if (local57 >= local67 && local57 <= local797 && local62 == local72 - arg4 && (this.anIntArrayArray4[local57][local803] & 0x2C0102) == 0) {
					return true;
				}
				if (local67 == local57 - arg4 && local62 <= local72 && local803 >= local72 && (this.anIntArrayArray4[local797][local72] & 0x2C0108) == 0) {
					return true;
				}
				if (local57 + 1 == local67 && local62 <= local72 && local803 >= local72 && (this.anIntArrayArray4[local67][local72] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(III)V")
	public void method832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt926;
		@Pc(21) int local21 = arg0 - this.anInt923;
		this.anIntArrayArray4[local21][local16] |= 0x200000;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZBIIZII)V")
	public void method834(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt926;
		@Pc(13) int local13 = arg1 - this.anInt923;
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method824(local13, local8, 128);
				this.method824(local13 - 1, local8, 8);
			}
			if (arg2 == 1) {
				this.method824(local13, local8, 2);
				this.method824(local13, local8 + 1, 32);
			}
			if (arg2 == 2) {
				this.method824(local13, local8, 8);
				this.method824(local13 + 1, local8, 128);
			}
			if (arg2 == 3) {
				this.method824(local13, local8, 32);
				this.method824(local13, local8 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method824(local13, local8, 1);
				this.method824(local13 - 1, local8 - -1, 16);
			}
			if (arg2 == 1) {
				this.method824(local13, local8, 4);
				this.method824(local13 + 1, local8 + 1, 64);
			}
			if (arg2 == 2) {
				this.method824(local13, local8, 16);
				this.method824(local13 + 1, local8 + -1, 1);
			}
			if (arg2 == 3) {
				this.method824(local13, local8, 64);
				this.method824(local13 - 1, local8 - 1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg2 == 0) {
				this.method824(local13, local8, 130);
				this.method824(local13 - 1, local8, 8);
				this.method824(local13, local8 + 1, 32);
			}
			if (arg2 == 1) {
				this.method824(local13, local8, 10);
				this.method824(local13, local8 + 1, 32);
				this.method824(local13 + 1, local8, 128);
			}
			if (arg2 == 2) {
				this.method824(local13, local8, 40);
				this.method824(local13 + 1, local8, 128);
				this.method824(local13, local8 - 1, 2);
			}
			if (arg2 == 3) {
				this.method824(local13, local8, 160);
				this.method824(local13, local8 - 1, 2);
				this.method824(local13 - 1, local8, 8);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg2 == 0) {
					this.method824(local13, local8, 65536);
					this.method824(local13 - 1, local8, 4096);
				}
				if (arg2 == 1) {
					this.method824(local13, local8, 1024);
					this.method824(local13, local8 + 1, 16384);
				}
				if (arg2 == 2) {
					this.method824(local13, local8, 4096);
					this.method824(local13 + 1, local8, 65536);
				}
				if (arg2 == 3) {
					this.method824(local13, local8, 16384);
					this.method824(local13, local8 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg2 == 0) {
					this.method824(local13, local8, 512);
					this.method824(local13 - 1, local8 - -1, 8192);
				}
				if (arg2 == 1) {
					this.method824(local13, local8, 2048);
					this.method824(local13 + 1, local8 + 1, 32768);
				}
				if (arg2 == 2) {
					this.method824(local13, local8, 8192);
					this.method824(local13 + 1, local8 + -1, 512);
				}
				if (arg2 == 3) {
					this.method824(local13, local8, 32768);
					this.method824(local13 - 1, local8 - 1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					this.method824(local13, local8, 66560);
					this.method824(local13 - 1, local8, 4096);
					this.method824(local13, local8 + 1, 16384);
				}
				if (arg2 == 1) {
					this.method824(local13, local8, 5120);
					this.method824(local13, local8 + 1, 16384);
					this.method824(local13 + 1, local8, 65536);
				}
				if (arg2 == 2) {
					this.method824(local13, local8, 20480);
					this.method824(local13 + 1, local8, 65536);
					this.method824(local13, local8 - 1, 1024);
				}
				if (arg2 == 3) {
					this.method824(local13, local8, 81920);
					this.method824(local13, local8 - 1, 1024);
					this.method824(local13 - 1, local8, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method824(local13, local8, 536870912);
				this.method824(local13 - 1, local8, 33554432);
			}
			if (arg2 == 1) {
				this.method824(local13, local8, 8388608);
				this.method824(local13, local8 + 1, 134217728);
			}
			if (arg2 == 2) {
				this.method824(local13, local8, 33554432);
				this.method824(local13 + 1, local8, 536870912);
			}
			if (arg2 == 3) {
				this.method824(local13, local8, 134217728);
				this.method824(local13, local8 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method824(local13, local8, 4194304);
				this.method824(local13 - 1, local8 + 1, 67108864);
			}
			if (arg2 == 1) {
				this.method824(local13, local8, 16777216);
				this.method824(local13 + 1, local8 - -1, 268435456);
			}
			if (arg2 == 2) {
				this.method824(local13, local8, 67108864);
				this.method824(local13 + 1, local8 + -1, 4194304);
			}
			if (arg2 == 3) {
				this.method824(local13, local8, 268435456);
				this.method824(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method824(local13, local8, 545259520);
			this.method824(local13 - 1, local8, 33554432);
			this.method824(local13, local8 + 1, 134217728);
		}
		if (arg2 == 1) {
			this.method824(local13, local8, 41943040);
			this.method824(local13, local8 + 1, 134217728);
			this.method824(local13 + 1, local8, 536870912);
		}
		if (arg2 == 2) {
			this.method824(local13, local8, 167772160);
			this.method824(local13 + 1, local8, 536870912);
			this.method824(local13, local8 - 1, 8388608);
		}
		if (arg2 == 3) {
			this.method824(local13, local8, 671088640);
			this.method824(local13, local8 - 1, 8388608);
			this.method824(local13 - 1, local8, 33554432);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIII)V")
	private void method835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray4[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZIZZI)V")
	public void method836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg4) {
			local5 = 131328;
		}
		@Pc(19) int local19;
		if (arg6 == 1 || arg6 == 3) {
			local19 = arg0;
			arg0 = arg2;
			arg2 = local19;
		}
		@Pc(28) int local28 = arg3 - this.anInt926;
		@Pc(33) int local33 = arg1 - this.anInt923;
		if (arg5) {
			local5 |= 0x40000000;
		}
		for (local19 = local33; local19 < arg0 + local33; local19++) {
			if (local19 >= 0 && this.anInt916 > local19) {
				for (@Pc(59) int local59 = local28; local59 < local28 + arg2; local59++) {
					if (local59 >= 0 && local59 < this.anInt934) {
						this.method835(local59, local5, local19);
					}
				}
			}
		}
	}
}

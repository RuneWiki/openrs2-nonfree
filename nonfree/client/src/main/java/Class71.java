import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class71 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public int anInt1967;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	public int anInt1973;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "I")
	public int anInt1979;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V")
	private void method1606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray11[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V")
	private void method1607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray11[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIZIIZ)V")
	public void method1609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt1973;
		@Pc(23) int local23 = arg1 - this.anInt1979;
		if (arg5) {
			local7 |= 0x40000000;
		}
		for (@Pc(31) int local31 = local23; local31 < arg3 + local23; local31++) {
			if (local31 >= 0 && local31 < this.anInt1967) {
				for (@Pc(45) int local45 = local18; local45 < local18 + arg0; local45++) {
					if (local45 >= 0 && this.anInt1971 > local45) {
						this.method1606(local31, local7, local45);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIZIZII)V")
	public void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(27) int local27;
		if (arg1 == 1 || arg1 == 3) {
			local27 = arg6;
			arg6 = arg0;
			arg0 = local27;
		}
		@Pc(36) int local36 = arg2 - this.anInt1973;
		@Pc(41) int local41 = arg4 - this.anInt1979;
		for (local27 = local41; local27 < arg6 + local41; local27++) {
			if (local27 >= 0 && local27 < this.anInt1967) {
				for (@Pc(53) int local53 = local36; local53 < local36 + arg0; local53++) {
					if (local53 >= 0 && this.anInt1971 > local53) {
						this.method1607(local27, local7, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIBIZZI)V")
	public void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg1 - this.anInt1973;
		@Pc(13) int local13 = arg2 - this.anInt1979;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method1607(local13, 128, local8);
				this.method1607(local13 - 1, 8, local8);
			}
			if (arg0 == 1) {
				this.method1607(local13, 2, local8);
				this.method1607(local13, 32, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1607(local13, 8, local8);
				this.method1607(local13 + 1, 128, local8);
			}
			if (arg0 == 3) {
				this.method1607(local13, 32, local8);
				this.method1607(local13, 2, local8 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method1607(local13, 1, local8);
				this.method1607(local13 - 1, 16, local8 + 1);
			}
			if (arg0 == 1) {
				this.method1607(local13, 4, local8);
				this.method1607(local13 + 1, 64, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1607(local13, 16, local8);
				this.method1607(local13 + 1, 1, local8 - 1);
			}
			if (arg0 == 3) {
				this.method1607(local13, 64, local8);
				this.method1607(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method1607(local13, 130, local8);
				this.method1607(local13 - 1, 8, local8);
				this.method1607(local13, 32, local8 + 1);
			}
			if (arg0 == 1) {
				this.method1607(local13, 10, local8);
				this.method1607(local13, 32, local8 + 1);
				this.method1607(local13 + 1, 128, local8);
			}
			if (arg0 == 2) {
				this.method1607(local13, 40, local8);
				this.method1607(local13 + 1, 128, local8);
				this.method1607(local13, 2, local8 - 1);
			}
			if (arg0 == 3) {
				this.method1607(local13, 160, local8);
				this.method1607(local13, 2, local8 - 1);
				this.method1607(local13 - 1, 8, local8);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method1607(local13, 65536, local8);
					this.method1607(local13 - 1, 4096, local8);
				}
				if (arg0 == 1) {
					this.method1607(local13, 1024, local8);
					this.method1607(local13, 16384, local8 + 1);
				}
				if (arg0 == 2) {
					this.method1607(local13, 4096, local8);
					this.method1607(local13 + 1, 65536, local8);
				}
				if (arg0 == 3) {
					this.method1607(local13, 16384, local8);
					this.method1607(local13, 1024, local8 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method1607(local13, 512, local8);
					this.method1607(local13 - 1, 8192, local8 + 1);
				}
				if (arg0 == 1) {
					this.method1607(local13, 2048, local8);
					this.method1607(local13 + 1, 32768, local8 + 1);
				}
				if (arg0 == 2) {
					this.method1607(local13, 8192, local8);
					this.method1607(local13 + 1, 512, local8 - 1);
				}
				if (arg0 == 3) {
					this.method1607(local13, 32768, local8);
					this.method1607(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method1607(local13, 66560, local8);
					this.method1607(local13 - 1, 4096, local8);
					this.method1607(local13, 16384, local8 + 1);
				}
				if (arg0 == 1) {
					this.method1607(local13, 5120, local8);
					this.method1607(local13, 16384, local8 + 1);
					this.method1607(local13 + 1, 65536, local8);
				}
				if (arg0 == 2) {
					this.method1607(local13, 20480, local8);
					this.method1607(local13 + 1, 65536, local8);
					this.method1607(local13, 1024, local8 - 1);
				}
				if (arg0 == 3) {
					this.method1607(local13, 81920, local8);
					this.method1607(local13, 1024, local8 - 1);
					this.method1607(local13 - 1, 4096, local8);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method1607(local13, 536870912, local8);
				this.method1607(local13 - 1, 33554432, local8);
			}
			if (arg0 == 1) {
				this.method1607(local13, 8388608, local8);
				this.method1607(local13, 134217728, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1607(local13, 33554432, local8);
				this.method1607(local13 + 1, 536870912, local8);
			}
			if (arg0 == 3) {
				this.method1607(local13, 134217728, local8);
				this.method1607(local13, 8388608, local8 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method1607(local13, 4194304, local8);
				this.method1607(local13 - 1, 67108864, local8 + 1);
			}
			if (arg0 == 1) {
				this.method1607(local13, 16777216, local8);
				this.method1607(local13 + 1, 268435456, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1607(local13, 67108864, local8);
				this.method1607(local13 + 1, 4194304, local8 - 1);
			}
			if (arg0 == 3) {
				this.method1607(local13, 268435456, local8);
				this.method1607(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1607(local13, 545259520, local8);
			this.method1607(local13 - 1, 33554432, local8);
			this.method1607(local13, 134217728, local8 + 1);
		}
		if (arg0 == 1) {
			this.method1607(local13, 41943040, local8);
			this.method1607(local13, 134217728, local8 + 1);
			this.method1607(local13 + 1, 536870912, local8);
		}
		if (arg0 == 2) {
			this.method1607(local13, 167772160, local8);
			this.method1607(local13 + 1, 536870912, local8);
			this.method1607(local13, 8388608, local8 - 1);
		}
		if (arg0 == 3) {
			this.method1607(local13, 671088640, local8);
			this.method1607(local13, 8388608, local8 - 1);
			this.method1607(local13 - 1, 33554432, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method1612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg5 && arg6 == arg0) {
				return true;
			}
		} else if (arg3 <= arg5 && arg3 + arg4 - 1 >= arg5 && arg0 >= arg0 && arg0 + arg4 - 1 >= arg0) {
			return true;
		}
		@Pc(54) int local54 = arg0 - this.anInt1973;
		@Pc(59) int local59 = arg5 - this.anInt1979;
		@Pc(64) int local64 = arg3 - this.anInt1979;
		@Pc(69) int local69 = arg6 - this.anInt1973;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local64 == local59 + 1 && local54 == local69 && (this.anIntArrayArray11[local64][local69] & 0x80) == 0) {
						return true;
					}
					if (local64 == local59 && local54 - 1 == local69 && (this.anIntArrayArray11[local64][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local59 - 1 == local64 && local69 == local54 && (this.anIntArrayArray11[local64][local69] & 0x8) == 0) {
						return true;
					}
					if (local59 == local64 && local54 - 1 == local69 && (this.anIntArrayArray11[local64][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local64 == local59 - 1 && local54 == local69 && (this.anIntArrayArray11[local64][local69] & 0x8) == 0) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local69 && (this.anIntArrayArray11[local64][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 == local59 + 1 && local69 == local54 && (this.anIntArrayArray11[local64][local69] & 0x80) == 0) {
						return true;
					}
					if (local64 == local59 && local69 == local54 + 1 && (this.anIntArrayArray11[local64][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local64 == local59 && local54 + 1 == local69 && (this.anIntArrayArray11[local64][local69] & 0x20) == 0) {
					return true;
				}
				if (local64 == local59 && local54 - 1 == local69 && (this.anIntArrayArray11[local64][local69] & 0x2) == 0) {
					return true;
				}
				if (local59 - 1 == local64 && local54 == local69 && (this.anIntArrayArray11[local64][local69] & 0x8) == 0) {
					return true;
				}
				if (local64 == local59 + 1 && local69 == local54 && (this.anIntArrayArray11[local64][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(407) int local407 = arg4 + local64 - 1;
			@Pc(413) int local413 = arg4 + local69 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local64 == local59 + 1 && local69 <= local54 && local413 >= local54 && (this.anIntArrayArray11[local64][local54] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local407 && local69 == local54 - arg4 && (this.anIntArrayArray11[local59][local413] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local59 - arg4 == local64 && local69 <= local54 && local413 >= local54 && (this.anIntArrayArray11[local407][local54] & 0x8) == 0) {
						return true;
					}
					if (local59 >= local64 && local407 >= local59 && local54 - arg4 == local69 && (this.anIntArrayArray11[local59][local413] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local59 - arg4 == local64 && local69 <= local54 && local413 >= local54 && (this.anIntArrayArray11[local407][local54] & 0x8) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local407 && local54 + 1 == local69 && (this.anIntArrayArray11[local59][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 == local59 + 1 && local69 <= local54 && local413 >= local54 && (this.anIntArrayArray11[local64][local54] & 0x80) == 0) {
						return true;
					}
					if (local64 <= local59 && local407 >= local59 && local54 + 1 == local69 && (this.anIntArrayArray11[local59][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local64 <= local59 && local407 >= local59 && local69 == local54 + 1 && (this.anIntArrayArray11[local59][local69] & 0x20) == 0) {
					return true;
				}
				if (local64 <= local59 && local407 >= local59 && local69 == local54 - arg4 && (this.anIntArrayArray11[local59][local413] & 0x2) == 0) {
					return true;
				}
				if (local64 == local59 - arg4 && local69 <= local54 && local413 >= local54 && (this.anIntArrayArray11[local407][local54] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local64 && local69 <= local54 && local54 <= local413 && (this.anIntArrayArray11[local64][local54] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg2 + arg3;
		@Pc(13) int local13 = arg0 + arg7;
		@Pc(18) int local18 = arg6 + arg5;
		@Pc(22) int local22 = arg1 + arg8;
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (local18 == arg3 && (arg4 & 0x2) == 0) {
			local48 = arg1 < arg0 ? arg0 : arg1;
			local55 = local13 < local22 ? local13 : local22;
			while (local48 < local55) {
				if ((this.anIntArrayArray11[local18 - this.anInt1979 - 1][local48 - this.anInt1973] & 0x8) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg6 == local9 && (arg4 & 0x8) == 0) {
			local48 = arg1 < arg0 ? arg0 : arg1;
			local55 = local13 >= local22 ? local22 : local13;
			while (local48 < local55) {
				if ((this.anIntArrayArray11[arg6 - this.anInt1979][local48 - this.anInt1973] & 0x80) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg0 == local22 && (arg4 & 0x1) == 0) {
			local48 = arg6 < arg3 ? arg3 : arg6;
			local55 = local18 > local9 ? local9 : local18;
			while (local48 < local55) {
				if ((this.anIntArrayArray11[local48 - this.anInt1979][local22 - this.anInt1973 - 1] & 0x2) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg1 == local13 && (arg4 & 0x4) == 0) {
			local48 = arg6 < arg3 ? arg3 : arg6;
			local55 = local18 <= local9 ? local18 : local9;
			while (local55 > local48) {
				if ((this.anIntArrayArray11[local48 - this.anInt1979][arg1 - this.anInt1973] & 0x20) == 0) {
					return true;
				}
				local48++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZZIII)V")
	public void method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt1973;
		@Pc(9) int local9 = arg5 - this.anInt1979;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method1606(local9, 128, local4);
				this.method1606(local9 - 1, 8, local4);
			}
			if (arg1 == 1) {
				this.method1606(local9, 2, local4);
				this.method1606(local9, 32, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1606(local9, 8, local4);
				this.method1606(local9 + 1, 128, local4);
			}
			if (arg1 == 3) {
				this.method1606(local9, 32, local4);
				this.method1606(local9, 2, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method1606(local9, 1, local4);
				this.method1606(local9 - 1, 16, local4 + 1);
			}
			if (arg1 == 1) {
				this.method1606(local9, 4, local4);
				this.method1606(local9 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1606(local9, 16, local4);
				this.method1606(local9 + 1, 1, local4 - 1);
			}
			if (arg1 == 3) {
				this.method1606(local9, 64, local4);
				this.method1606(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method1606(local9, 130, local4);
				this.method1606(local9 - 1, 8, local4);
				this.method1606(local9, 32, local4 + 1);
			}
			if (arg1 == 1) {
				this.method1606(local9, 10, local4);
				this.method1606(local9, 32, local4 + 1);
				this.method1606(local9 + 1, 128, local4);
			}
			if (arg1 == 2) {
				this.method1606(local9, 40, local4);
				this.method1606(local9 + 1, 128, local4);
				this.method1606(local9, 2, local4 - 1);
			}
			if (arg1 == 3) {
				this.method1606(local9, 160, local4);
				this.method1606(local9, 2, local4 - 1);
				this.method1606(local9 - 1, 8, local4);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method1606(local9, 65536, local4);
					this.method1606(local9 - 1, 4096, local4);
				}
				if (arg1 == 1) {
					this.method1606(local9, 1024, local4);
					this.method1606(local9, 16384, local4 + 1);
				}
				if (arg1 == 2) {
					this.method1606(local9, 4096, local4);
					this.method1606(local9 + 1, 65536, local4);
				}
				if (arg1 == 3) {
					this.method1606(local9, 16384, local4);
					this.method1606(local9, 1024, local4 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method1606(local9, 512, local4);
					this.method1606(local9 - 1, 8192, local4 + 1);
				}
				if (arg1 == 1) {
					this.method1606(local9, 2048, local4);
					this.method1606(local9 + 1, 32768, local4 + 1);
				}
				if (arg1 == 2) {
					this.method1606(local9, 8192, local4);
					this.method1606(local9 + 1, 512, local4 - 1);
				}
				if (arg1 == 3) {
					this.method1606(local9, 32768, local4);
					this.method1606(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method1606(local9, 66560, local4);
					this.method1606(local9 - 1, 4096, local4);
					this.method1606(local9, 16384, local4 + 1);
				}
				if (arg1 == 1) {
					this.method1606(local9, 5120, local4);
					this.method1606(local9, 16384, local4 + 1);
					this.method1606(local9 + 1, 65536, local4);
				}
				if (arg1 == 2) {
					this.method1606(local9, 20480, local4);
					this.method1606(local9 + 1, 65536, local4);
					this.method1606(local9, 1024, local4 - 1);
				}
				if (arg1 == 3) {
					this.method1606(local9, 81920, local4);
					this.method1606(local9, 1024, local4 - 1);
					this.method1606(local9 - 1, 4096, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method1606(local9, 536870912, local4);
				this.method1606(local9 - 1, 33554432, local4);
			}
			if (arg1 == 1) {
				this.method1606(local9, 8388608, local4);
				this.method1606(local9, 134217728, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1606(local9, 33554432, local4);
				this.method1606(local9 + 1, 536870912, local4);
			}
			if (arg1 == 3) {
				this.method1606(local9, 134217728, local4);
				this.method1606(local9, 8388608, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method1606(local9, 4194304, local4);
				this.method1606(local9 - 1, 67108864, local4 + 1);
			}
			if (arg1 == 1) {
				this.method1606(local9, 16777216, local4);
				this.method1606(local9 + 1, 268435456, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1606(local9, 67108864, local4);
				this.method1606(local9 + 1, 4194304, local4 - 1);
			}
			if (arg1 == 3) {
				this.method1606(local9, 268435456, local4);
				this.method1606(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1606(local9, 545259520, local4);
			this.method1606(local9 - 1, 33554432, local4);
			this.method1606(local9, 134217728, local4 + 1);
		}
		if (arg1 == 1) {
			this.method1606(local9, 41943040, local4);
			this.method1606(local9, 134217728, local4 + 1);
			this.method1606(local9 + 1, 536870912, local4);
		}
		if (arg1 == 2) {
			this.method1606(local9, 167772160, local4);
			this.method1606(local9 + 1, 536870912, local4);
			this.method1606(local9, 8388608, local4 - 1);
		}
		if (arg1 == 3) {
			this.method1606(local9, 671088640, local4);
			this.method1606(local9, 8388608, local4 - 1);
			this.method1606(local9 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 == 1) {
			if (arg4 == arg6 && arg0 == arg1) {
				return true;
			}
		} else if (arg4 <= arg6 && arg4 + arg3 - 1 >= arg6 && arg0 >= arg0 && arg0 + arg3 - 1 >= arg0) {
			return true;
		}
		@Pc(57) int local57 = arg4 - this.anInt1979;
		@Pc(62) int local62 = arg1 - this.anInt1973;
		@Pc(67) int local67 = arg0 - this.anInt1973;
		@Pc(72) int local72 = arg6 - this.anInt1979;
		if (arg3 == 1) {
			if (arg5 == 0) {
				if (arg2 == 0) {
					if (local72 - 1 == local57 && local67 == local62) {
						return true;
					}
					if (local57 == local72 && local67 + 1 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local57 && local67 - 1 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local72 == local57 && local67 + 1 == local62) {
						return true;
					}
					if (local57 == local72 - 1 && local67 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 + 1 == local57 && local62 == local67 && (this.anIntArrayArray11[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 == local72 + 1 && local62 == local67) {
						return true;
					}
					if (local57 == local72 && local62 == local67 + 1 && (this.anIntArrayArray11[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local57 && local62 == local67 - 1 && (this.anIntArrayArray11[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local72 && local62 == local67 - 1) {
						return true;
					}
					if (local72 - 1 == local57 && local62 == local67 && (this.anIntArrayArray11[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 + 1 == local57 && local67 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					if (local72 - 1 == local57 && local67 == local62) {
						return true;
					}
					if (local57 == local72 && local62 == local67 + 1) {
						return true;
					}
					if (local57 == local72 + 1 && local62 == local67 && (this.anIntArrayArray11[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local72 && local62 == local67 - 1 && (this.anIntArrayArray11[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local72 - 1 == local57 && local62 == local67 && (this.anIntArrayArray11[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local72 && local62 == local67 + 1) {
						return true;
					}
					if (local57 == local72 + 1 && local67 == local62) {
						return true;
					}
					if (local57 == local72 && local67 - 1 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local72 - 1 == local57 && local62 == local67 && (this.anIntArrayArray11[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local72 && local62 == local67 + 1 && (this.anIntArrayArray11[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local72 + 1 && local62 == local67) {
						return true;
					}
					if (local57 == local72 && local67 - 1 == local62) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local72 - 1 && local62 == local67) {
						return true;
					}
					if (local57 == local72 && local67 + 1 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local72 + 1 && local67 == local62 && (this.anIntArrayArray11[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local72 && local67 - 1 == local62) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local57 == local72 && local62 == local67 + 1 && (this.anIntArrayArray11[local57][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 == local72 && local62 == local67 - 1 && (this.anIntArrayArray11[local57][local62] & 0x2) == 0) {
					return true;
				}
				if (local57 == local72 - 1 && local62 == local67 && (this.anIntArrayArray11[local57][local62] & 0x8) == 0) {
					return true;
				}
				if (local57 == local72 + 1 && local67 == local62 && (this.anIntArrayArray11[local57][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(756) int local756 = local57 + arg3 - 1;
			@Pc(762) int local762 = arg3 + local62 - 1;
			if (arg5 == 0) {
				if (arg2 == 0) {
					if (local57 == local72 - arg3 && local62 <= local67 && local67 <= local762) {
						return true;
					}
					if (local57 <= local72 && local756 >= local72 && local62 == local67 + 1 && (this.anIntArrayArray11[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 >= local57 && local72 <= local756 && local67 - arg3 == local62 && (this.anIntArrayArray11[local72][local762] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 <= local72 && local72 <= local756 && local67 + 1 == local62) {
						return true;
					}
					if (local72 - arg3 == local57 && local67 >= local62 && local67 <= local762 && (this.anIntArrayArray11[local756][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local72 + 1 && local62 <= local67 && local762 >= local67 && (this.anIntArrayArray11[local57][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local72 + 1 == local57 && local67 >= local62 && local67 <= local762) {
						return true;
					}
					if (local72 >= local57 && local756 >= local72 && local62 == local67 + 1 && (this.anIntArrayArray11[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 >= local57 && local756 >= local72 && local62 == local67 - arg3 && (this.anIntArrayArray11[local72][local762] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 <= local72 && local72 <= local756 && local62 == local67 - arg3) {
						return true;
					}
					if (local57 == local72 - arg3 && local67 >= local62 && local762 >= local67 && (this.anIntArrayArray11[local756][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 + 1 == local57 && local67 >= local62 && local762 >= local67 && (this.anIntArrayArray11[local57][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					if (local57 == local72 - arg3 && local67 >= local62 && local67 <= local762) {
						return true;
					}
					if (local72 >= local57 && local72 <= local756 && local67 + 1 == local62) {
						return true;
					}
					if (local72 + 1 == local57 && local62 <= local67 && local67 <= local762 && (this.anIntArrayArray11[local57][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 >= local57 && local72 <= local756 && local62 == local67 - arg3 && (this.anIntArrayArray11[local72][local762] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local72 - arg3 == local57 && local62 <= local67 && local67 <= local762 && (this.anIntArrayArray11[local756][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 <= local72 && local72 <= local756 && local67 + 1 == local62) {
						return true;
					}
					if (local72 + 1 == local57 && local62 <= local67 && local67 <= local762) {
						return true;
					}
					if (local57 <= local72 && local72 <= local756 && local62 == local67 - arg3 && (this.anIntArrayArray11[local72][local762] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 == local72 - arg3 && local67 >= local62 && local762 >= local67 && (this.anIntArrayArray11[local756][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 <= local72 && local72 <= local756 && local67 + 1 == local62 && (this.anIntArrayArray11[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 + 1 == local57 && local67 >= local62 && local67 <= local762) {
						return true;
					}
					if (local57 <= local72 && local756 >= local72 && local67 - arg3 == local62) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local72 - arg3 == local57 && local67 >= local62 && local67 <= local762) {
						return true;
					}
					if (local57 <= local72 && local756 >= local72 && local67 + 1 == local62 && (this.anIntArrayArray11[local72][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local72 + 1 && local67 >= local62 && local67 <= local762 && (this.anIntArrayArray11[local57][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 >= local57 && local72 <= local756 && local62 == local67 - arg3) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local72 >= local57 && local72 <= local756 && local67 + 1 == local62 && (this.anIntArrayArray11[local72][local62] & 0x2C0120) == 0) {
					return true;
				}
				if (local72 >= local57 && local72 <= local756 && local62 == local67 - arg3 && (this.anIntArrayArray11[local72][local762] & 0x2C0102) == 0) {
					return true;
				}
				if (local57 == local72 - arg3 && local67 >= local62 && local67 <= local762 && (this.anIntArrayArray11[local756][local67] & 0x2C0108) == 0) {
					return true;
				}
				if (local72 + 1 == local57 && local67 >= local62 && local67 <= local762 && (this.anIntArrayArray11[local57][local67] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)V")
	public void method1616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1979;
		@Pc(13) int local13 = arg0 - this.anInt1973;
		this.anIntArrayArray11[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(III)V")
	public void method1617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt1973;
		@Pc(18) int local18 = arg0 - this.anInt1979;
		this.anIntArrayArray11[local18][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(III)V")
	public void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1973;
		@Pc(13) int local13 = arg1 - this.anInt1979;
		this.anIntArrayArray11[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static414.method5236(arg6, arg2, arg5, arg1, arg6, arg0, arg7, arg3) ? true : this.method1613(arg3, arg2, arg6, arg1, arg4, arg7, arg0, arg6, arg5);
		}
		@Pc(52) int local52 = arg7 + arg0 - 1;
		@Pc(58) int local58 = arg5 + arg2 - 1;
		if (arg1 >= arg0 && arg1 <= local52 && arg2 <= arg3 && local58 >= arg3) {
			return true;
		} else if (arg0 - 1 == arg1 && arg3 >= arg2 && local58 >= arg3 && (this.anIntArrayArray11[arg1 - this.anInt1979][arg3 - this.anInt1973] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg1 == local52 + 1 && arg3 >= arg2 && arg3 <= local58 && (this.anIntArrayArray11[arg1 - this.anInt1979][arg3 - this.anInt1973] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg2 - 1 && arg0 <= arg1 && arg1 <= local52 && (this.anIntArrayArray11[arg1 - this.anInt1979][arg3 - this.anInt1973] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local58 + 1 && arg0 <= arg1 && local52 >= arg1 && (this.anIntArrayArray11[arg1 - this.anInt1979][arg3 - this.anInt1973] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	public void method1621() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1967; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1971; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt1967 - 5 || local11 >= this.anInt1971 - 5) {
					this.anIntArrayArray11[local7][local11] = -1;
				} else {
					this.anIntArrayArray11[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIB)V")
	public void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1973;
		@Pc(13) int local13 = arg0 - this.anInt1979;
		this.anIntArrayArray11[local13][local4] |= 0x40000;
	}
}

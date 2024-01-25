import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class225 {

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public int anInt6523;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray159;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
	public int anInt6528;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public int anInt6532;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	public int anInt6535;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method5185() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6532; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt6528; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt6532 - 5 || local15 >= this.anInt6528 - 5) {
					this.anIntArrayArray159[local11][local15] = -1;
				} else {
					this.anIntArrayArray159[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
	public void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6523;
		@Pc(17) int local17 = arg0 - this.anInt6535;
		this.anIntArrayArray159[local17][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZI)V")
	public void method5188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6535;
		@Pc(13) int local13 = arg0 - this.anInt6523;
		this.anIntArrayArray159[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIIB)Z")
	public boolean method5189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) int local8 = arg6 + arg7;
		@Pc(12) int local12 = arg3 + arg0;
		@Pc(25) int local25 = arg2 + arg1;
		@Pc(29) int local29 = arg5 + arg4;
		@Pc(50) int local50;
		@Pc(57) int local57;
		if (local25 == arg6 && (arg8 & 0x2) == 0) {
			local50 = arg0 <= arg4 ? arg4 : arg0;
			local57 = local12 < local29 ? local12 : local29;
			while (local50 < local57) {
				if ((this.anIntArrayArray159[local25 - this.anInt6535 - 1][local50 - this.anInt6523] & 0x8) == 0) {
					return true;
				}
				local50++;
			}
		} else if (local8 == arg2 && (arg8 & 0x8) == 0) {
			local50 = arg0 > arg4 ? arg0 : arg4;
			local57 = local12 < local29 ? local12 : local29;
			while (local50 < local57) {
				if ((this.anIntArrayArray159[arg2 - this.anInt6535][local50 - this.anInt6523] & 0x80) == 0) {
					return true;
				}
				local50++;
			}
		} else if (arg0 == local29 && (arg8 & 0x1) == 0) {
			local50 = arg2 < arg6 ? arg6 : arg2;
			local57 = local25 > local8 ? local8 : local25;
			while (local57 > local50) {
				if ((this.anIntArrayArray159[local50 - this.anInt6535][local29 - this.anInt6523 - 1] & 0x2) == 0) {
					return true;
				}
				local50++;
			}
		} else if (local12 == arg4 && (arg8 & 0x4) == 0) {
			local50 = arg2 >= arg6 ? arg2 : arg6;
			local57 = local8 >= local25 ? local25 : local8;
			while (local57 > local50) {
				if ((this.anIntArrayArray159[local50 - this.anInt6535][arg4 - this.anInt6523] & 0x20) == 0) {
					return true;
				}
				local50++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIIIIIII)Z")
	public boolean method5190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static233.method3186(arg1, arg7, arg0, arg5, arg3, arg7, arg2, arg4) ? true : this.method5189(arg2, arg0, arg3, arg7, arg5, arg4, arg1, arg7, arg6);
		}
		@Pc(38) int local38 = arg0 + arg3 - 1;
		@Pc(44) int local44 = arg5 + arg4 - 1;
		if (arg1 >= arg3 && local38 >= arg1 && arg2 >= arg5 && local44 >= arg2) {
			return true;
		} else if (arg1 == arg3 - 1 && arg2 >= arg5 && arg2 <= local44 && (this.anIntArrayArray159[arg1 - this.anInt6535][arg2 - this.anInt6523] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg1 == local38 + 1 && arg5 <= arg2 && local44 >= arg2 && (this.anIntArrayArray159[arg1 - this.anInt6535][arg2 - this.anInt6523] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg5 - 1 && arg3 <= arg1 && local38 >= arg1 && (this.anIntArrayArray159[arg1 - this.anInt6535][arg2 - this.anInt6523] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg2 && arg1 >= arg3 && local38 >= arg1 && (this.anIntArrayArray159[arg1 - this.anInt6535][arg2 - this.anInt6523] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIZIIZ)V")
	public void method5191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(33) int local33;
		if (arg0 == 1 || arg0 == 3) {
			local33 = arg2;
			arg2 = arg1;
			arg1 = local33;
		}
		@Pc(42) int local42 = arg5 - this.anInt6523;
		@Pc(47) int local47 = arg4 - this.anInt6535;
		for (local33 = local47; local33 < arg2 + local47; local33++) {
			if (local33 >= 0 && local33 < this.anInt6532) {
				for (@Pc(59) int local59 = local42; local59 < local42 + arg1; local59++) {
					if (local59 >= 0 && this.anInt6528 > local59) {
						this.method5197(local59, local7, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIZIIII)V")
	public void method5192(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt6535;
		@Pc(13) int local13 = arg5 - this.anInt6523;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method5197(local13, 128, local8);
				this.method5197(local13, 8, local8 - 1);
			}
			if (arg4 == 1) {
				this.method5197(local13, 2, local8);
				this.method5197(local13 + 1, 32, local8);
			}
			if (arg4 == 2) {
				this.method5197(local13, 8, local8);
				this.method5197(local13, 128, local8 + 1);
			}
			if (arg4 == 3) {
				this.method5197(local13, 32, local8);
				this.method5197(local13 - 1, 2, local8);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method5197(local13, 1, local8);
				this.method5197(local13 + 1, 16, local8 - 1);
			}
			if (arg4 == 1) {
				this.method5197(local13, 4, local8);
				this.method5197(local13 + 1, 64, local8 + 1);
			}
			if (arg4 == 2) {
				this.method5197(local13, 16, local8);
				this.method5197(local13 - 1, 1, local8 + 1);
			}
			if (arg4 == 3) {
				this.method5197(local13, 64, local8);
				this.method5197(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method5197(local13, 130, local8);
				this.method5197(local13, 8, local8 - 1);
				this.method5197(local13 + 1, 32, local8);
			}
			if (arg4 == 1) {
				this.method5197(local13, 10, local8);
				this.method5197(local13 + 1, 32, local8);
				this.method5197(local13, 128, local8 + 1);
			}
			if (arg4 == 2) {
				this.method5197(local13, 40, local8);
				this.method5197(local13, 128, local8 + 1);
				this.method5197(local13 - 1, 2, local8);
			}
			if (arg4 == 3) {
				this.method5197(local13, 160, local8);
				this.method5197(local13 - 1, 2, local8);
				this.method5197(local13, 8, local8 - 1);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method5197(local13, 65536, local8);
					this.method5197(local13, 4096, local8 - 1);
				}
				if (arg4 == 1) {
					this.method5197(local13, 1024, local8);
					this.method5197(local13 + 1, 16384, local8);
				}
				if (arg4 == 2) {
					this.method5197(local13, 4096, local8);
					this.method5197(local13, 65536, local8 + 1);
				}
				if (arg4 == 3) {
					this.method5197(local13, 16384, local8);
					this.method5197(local13 - 1, 1024, local8);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method5197(local13, 512, local8);
					this.method5197(local13 + 1, 8192, local8 - 1);
				}
				if (arg4 == 1) {
					this.method5197(local13, 2048, local8);
					this.method5197(local13 + 1, 32768, local8 + 1);
				}
				if (arg4 == 2) {
					this.method5197(local13, 8192, local8);
					this.method5197(local13 - 1, 512, local8 + 1);
				}
				if (arg4 == 3) {
					this.method5197(local13, 32768, local8);
					this.method5197(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method5197(local13, 66560, local8);
					this.method5197(local13, 4096, local8 - 1);
					this.method5197(local13 + 1, 16384, local8);
				}
				if (arg4 == 1) {
					this.method5197(local13, 5120, local8);
					this.method5197(local13 + 1, 16384, local8);
					this.method5197(local13, 65536, local8 + 1);
				}
				if (arg4 == 2) {
					this.method5197(local13, 20480, local8);
					this.method5197(local13, 65536, local8 + 1);
					this.method5197(local13 - 1, 1024, local8);
				}
				if (arg4 == 3) {
					this.method5197(local13, 81920, local8);
					this.method5197(local13 - 1, 1024, local8);
					this.method5197(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method5197(local13, 536870912, local8);
				this.method5197(local13, 33554432, local8 - 1);
			}
			if (arg4 == 1) {
				this.method5197(local13, 8388608, local8);
				this.method5197(local13 + 1, 134217728, local8);
			}
			if (arg4 == 2) {
				this.method5197(local13, 33554432, local8);
				this.method5197(local13, 536870912, local8 + 1);
			}
			if (arg4 == 3) {
				this.method5197(local13, 134217728, local8);
				this.method5197(local13 - 1, 8388608, local8);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method5197(local13, 4194304, local8);
				this.method5197(local13 + 1, 67108864, local8 - 1);
			}
			if (arg4 == 1) {
				this.method5197(local13, 16777216, local8);
				this.method5197(local13 + 1, 268435456, local8 + 1);
			}
			if (arg4 == 2) {
				this.method5197(local13, 67108864, local8);
				this.method5197(local13 - 1, 4194304, local8 + 1);
			}
			if (arg4 == 3) {
				this.method5197(local13, 268435456, local8);
				this.method5197(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5197(local13, 545259520, local8);
			this.method5197(local13, 33554432, local8 - 1);
			this.method5197(local13 + 1, 134217728, local8);
		}
		if (arg4 == 1) {
			this.method5197(local13, 41943040, local8);
			this.method5197(local13 + 1, 134217728, local8);
			this.method5197(local13, 536870912, local8 + 1);
		}
		if (arg4 == 2) {
			this.method5197(local13, 167772160, local8);
			this.method5197(local13, 536870912, local8 + 1);
			this.method5197(local13 - 1, 8388608, local8);
		}
		if (arg4 == 3) {
			this.method5197(local13, 671088640, local8);
			this.method5197(local13 - 1, 8388608, local8);
			this.method5197(local13, 33554432, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V")
	public void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6535;
		@Pc(13) int local13 = arg1 - this.anInt6523;
		this.anIntArrayArray159[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZIIZI)V")
	public void method5195(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg5 - this.anInt6523;
		@Pc(29) int local29 = arg2 - this.anInt6535;
		for (@Pc(36) int local36 = local29; local36 < arg0 + local29; local36++) {
			if (local36 >= 0 && local36 < this.anInt6532) {
				for (@Pc(53) int local53 = local24; local53 < local24 + arg3; local53++) {
					if (local53 >= 0 && local53 < this.anInt6528) {
						this.method5200(local53, local7, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg3 == arg0 && arg1 == arg6) {
				return true;
			}
		} else if (arg0 <= arg3 && arg3 <= arg2 + arg0 - 1 && arg1 <= arg1 && arg1 + arg2 - 1 >= arg1) {
			return true;
		}
		@Pc(62) int local62 = arg1 - this.anInt6523;
		@Pc(67) int local67 = arg3 - this.anInt6535;
		@Pc(72) int local72 = arg6 - this.anInt6523;
		@Pc(77) int local77 = arg0 - this.anInt6535;
		if (arg2 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local77 == local67 + 1 && local62 == local72 && (this.anIntArrayArray159[local77][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 == local77 && local72 == local62 - 1 && (this.anIntArrayArray159[local77][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - 1 == local77 && local72 == local62 && (this.anIntArrayArray159[local77][local72] & 0x8) == 0) {
						return true;
					}
					if (local77 == local67 && local62 - 1 == local72 && (this.anIntArrayArray159[local77][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 - 1 == local77 && local62 == local72 && (this.anIntArrayArray159[local77][local72] & 0x8) == 0) {
						return true;
					}
					if (local67 == local77 && local62 + 1 == local72 && (this.anIntArrayArray159[local77][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 + 1 == local77 && local72 == local62 && (this.anIntArrayArray159[local77][local72] & 0x80) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local62 + 1 && (this.anIntArrayArray159[local77][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local77 == local67 && local72 == local62 + 1 && (this.anIntArrayArray159[local77][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 == local77 && local72 == local62 - 1 && (this.anIntArrayArray159[local77][local72] & 0x2) == 0) {
					return true;
				}
				if (local77 == local67 - 1 && local62 == local72 && (this.anIntArrayArray159[local77][local72] & 0x8) == 0) {
					return true;
				}
				if (local77 == local67 + 1 && local72 == local62 && (this.anIntArrayArray159[local77][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(437) int local437 = arg2 + local77 - 1;
			@Pc(443) int local443 = arg2 + local72 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local67 + 1 == local77 && local72 <= local62 && local443 >= local62 && (this.anIntArrayArray159[local77][local62] & 0x80) == 0) {
						return true;
					}
					if (local67 >= local77 && local67 <= local437 && local62 - arg2 == local72 && (this.anIntArrayArray159[local67][local443] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - arg2 == local77 && local72 <= local62 && local62 <= local443 && (this.anIntArrayArray159[local437][local62] & 0x8) == 0) {
						return true;
					}
					if (local67 >= local77 && local67 <= local437 && local72 == local62 - arg2 && (this.anIntArrayArray159[local67][local443] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local77 == local67 - arg2 && local62 >= local72 && local62 <= local443 && (this.anIntArrayArray159[local437][local62] & 0x8) == 0) {
						return true;
					}
					if (local67 >= local77 && local67 <= local437 && local72 == local62 + 1 && (this.anIntArrayArray159[local67][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local77 == local67 + 1 && local62 >= local72 && local62 <= local443 && (this.anIntArrayArray159[local77][local62] & 0x80) == 0) {
						return true;
					}
					if (local77 <= local67 && local437 >= local67 && local62 + 1 == local72 && (this.anIntArrayArray159[local67][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local77 <= local67 && local67 <= local437 && local72 == local62 + 1 && (this.anIntArrayArray159[local67][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 >= local77 && local67 <= local437 && local72 == local62 - arg2 && (this.anIntArrayArray159[local67][local443] & 0x2) == 0) {
					return true;
				}
				if (local67 - arg2 == local77 && local72 <= local62 && local62 <= local443 && (this.anIntArrayArray159[local437][local62] & 0x8) == 0) {
					return true;
				}
				if (local67 + 1 == local77 && local62 >= local72 && local62 <= local443 && (this.anIntArrayArray159[local77][local62] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V")
	private void method5197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray159[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIZIZI)V")
	public void method5198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg3 - this.anInt6523;
		@Pc(18) int local18 = arg1 - this.anInt6535;
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method5200(local13, 128, local18);
				this.method5200(local13, 8, local18 - 1);
			}
			if (arg5 == 1) {
				this.method5200(local13, 2, local18);
				this.method5200(local13 + 1, 32, local18);
			}
			if (arg5 == 2) {
				this.method5200(local13, 8, local18);
				this.method5200(local13, 128, local18 + 1);
			}
			if (arg5 == 3) {
				this.method5200(local13, 32, local18);
				this.method5200(local13 - 1, 2, local18);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method5200(local13, 1, local18);
				this.method5200(local13 + 1, 16, local18 - 1);
			}
			if (arg5 == 1) {
				this.method5200(local13, 4, local18);
				this.method5200(local13 + 1, 64, local18 + 1);
			}
			if (arg5 == 2) {
				this.method5200(local13, 16, local18);
				this.method5200(local13 - 1, 1, local18 + 1);
			}
			if (arg5 == 3) {
				this.method5200(local13, 64, local18);
				this.method5200(local13 - 1, 4, local18 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				this.method5200(local13, 130, local18);
				this.method5200(local13, 8, local18 - 1);
				this.method5200(local13 + 1, 32, local18);
			}
			if (arg5 == 1) {
				this.method5200(local13, 10, local18);
				this.method5200(local13 + 1, 32, local18);
				this.method5200(local13, 128, local18 + 1);
			}
			if (arg5 == 2) {
				this.method5200(local13, 40, local18);
				this.method5200(local13, 128, local18 + 1);
				this.method5200(local13 - 1, 2, local18);
			}
			if (arg5 == 3) {
				this.method5200(local13, 160, local18);
				this.method5200(local13 - 1, 2, local18);
				this.method5200(local13, 8, local18 - 1);
			}
		}
		if (arg4) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method5200(local13, 65536, local18);
					this.method5200(local13, 4096, local18 - 1);
				}
				if (arg5 == 1) {
					this.method5200(local13, 1024, local18);
					this.method5200(local13 + 1, 16384, local18);
				}
				if (arg5 == 2) {
					this.method5200(local13, 4096, local18);
					this.method5200(local13, 65536, local18 + 1);
				}
				if (arg5 == 3) {
					this.method5200(local13, 16384, local18);
					this.method5200(local13 - 1, 1024, local18);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method5200(local13, 512, local18);
					this.method5200(local13 + 1, 8192, local18 - 1);
				}
				if (arg5 == 1) {
					this.method5200(local13, 2048, local18);
					this.method5200(local13 + 1, 32768, local18 + 1);
				}
				if (arg5 == 2) {
					this.method5200(local13, 8192, local18);
					this.method5200(local13 - 1, 512, local18 + 1);
				}
				if (arg5 == 3) {
					this.method5200(local13, 32768, local18);
					this.method5200(local13 - 1, 2048, local18 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method5200(local13, 66560, local18);
					this.method5200(local13, 4096, local18 - 1);
					this.method5200(local13 + 1, 16384, local18);
				}
				if (arg5 == 1) {
					this.method5200(local13, 5120, local18);
					this.method5200(local13 + 1, 16384, local18);
					this.method5200(local13, 65536, local18 + 1);
				}
				if (arg5 == 2) {
					this.method5200(local13, 20480, local18);
					this.method5200(local13, 65536, local18 + 1);
					this.method5200(local13 - 1, 1024, local18);
				}
				if (arg5 == 3) {
					this.method5200(local13, 81920, local18);
					this.method5200(local13 - 1, 1024, local18);
					this.method5200(local13, 4096, local18 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method5200(local13, 536870912, local18);
				this.method5200(local13, 33554432, local18 - 1);
			}
			if (arg5 == 1) {
				this.method5200(local13, 8388608, local18);
				this.method5200(local13 + 1, 134217728, local18);
			}
			if (arg5 == 2) {
				this.method5200(local13, 33554432, local18);
				this.method5200(local13, 536870912, local18 + 1);
			}
			if (arg5 == 3) {
				this.method5200(local13, 134217728, local18);
				this.method5200(local13 - 1, 8388608, local18);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method5200(local13, 4194304, local18);
				this.method5200(local13 + 1, 67108864, local18 - 1);
			}
			if (arg5 == 1) {
				this.method5200(local13, 16777216, local18);
				this.method5200(local13 + 1, 268435456, local18 + 1);
			}
			if (arg5 == 2) {
				this.method5200(local13, 67108864, local18);
				this.method5200(local13 - 1, 4194304, local18 + 1);
			}
			if (arg5 == 3) {
				this.method5200(local13, 268435456, local18);
				this.method5200(local13 - 1, 16777216, local18 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method5200(local13, 545259520, local18);
			this.method5200(local13, 33554432, local18 - 1);
			this.method5200(local13 + 1, 134217728, local18);
		}
		if (arg5 == 1) {
			this.method5200(local13, 41943040, local18);
			this.method5200(local13 + 1, 134217728, local18);
			this.method5200(local13, 536870912, local18 + 1);
		}
		if (arg5 == 2) {
			this.method5200(local13, 167772160, local18);
			this.method5200(local13, 536870912, local18 + 1);
			this.method5200(local13 - 1, 8388608, local18);
		}
		if (arg5 == 3) {
			this.method5200(local13, 671088640, local18);
			this.method5200(local13 - 1, 8388608, local18);
			this.method5200(local13, 33554432, local18 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg5 && arg1 == arg2) {
				return true;
			}
		} else if (arg5 <= arg3 && arg0 + arg5 - 1 >= arg3 && arg2 <= arg2 && arg2 <= arg2 + arg0 - 1) {
			return true;
		}
		@Pc(51) int local51 = arg2 - this.anInt6523;
		@Pc(56) int local56 = arg3 - this.anInt6535;
		@Pc(61) int local61 = arg5 - this.anInt6535;
		@Pc(66) int local66 = arg1 - this.anInt6523;
		if (arg0 == 1) {
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local61 == local56 - 1 && local51 == local66) {
						return true;
					}
					if (local56 == local61 && local51 + 1 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local56 && local51 - 1 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local56 == local61 && local66 == local51 + 1) {
						return true;
					}
					if (local56 - 1 == local61 && local66 == local51 && (this.anIntArrayArray159[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local51 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local56 + 1 == local61 && local51 == local66) {
						return true;
					}
					if (local56 == local61 && local66 == local51 + 1 && (this.anIntArrayArray159[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local61 && local66 == local51 - 1 && (this.anIntArrayArray159[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local61 == local56 && local51 - 1 == local66) {
						return true;
					}
					if (local61 == local56 - 1 && local51 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local51 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local61 == local56 - 1 && local51 == local66) {
						return true;
					}
					if (local61 == local56 && local66 == local51 + 1) {
						return true;
					}
					if (local61 == local56 + 1 && local51 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local56 && local66 == local51 - 1 && (this.anIntArrayArray159[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local56 - 1 == local61 && local51 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local61 && local66 == local51 + 1) {
						return true;
					}
					if (local61 == local56 + 1 && local51 == local66) {
						return true;
					}
					if (local56 == local61 && local51 - 1 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 == local56 - 1 && local66 == local51 && (this.anIntArrayArray159[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local56 && local51 + 1 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local51 == local66) {
						return true;
					}
					if (local56 == local61 && local66 == local51 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local56 - 1 == local61 && local66 == local51) {
						return true;
					}
					if (local61 == local56 && local66 == local51 + 1 && (this.anIntArrayArray159[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local66 == local51 && (this.anIntArrayArray159[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 == local61 && local66 == local51 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local61 == local56 && local51 + 1 == local66 && (this.anIntArrayArray159[local61][local66] & 0x20) == 0) {
					return true;
				}
				if (local61 == local56 && local51 - 1 == local66 && (this.anIntArrayArray159[local61][local66] & 0x2) == 0) {
					return true;
				}
				if (local61 == local56 - 1 && local66 == local51 && (this.anIntArrayArray159[local61][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 == local56 + 1 && local51 == local66 && (this.anIntArrayArray159[local61][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = arg0 + local61 - 1;
			@Pc(89) int local89 = local66 + arg0 - 1;
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local56 - arg0 == local61 && local51 >= local66 && local89 >= local51) {
						return true;
					}
					if (local56 >= local61 && local82 >= local56 && local51 + 1 == local66 && (this.anIntArrayArray159[local56][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 >= local61 && local82 >= local56 && local66 == local51 - arg0 && (this.anIntArrayArray159[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local61 <= local56 && local82 >= local56 && local66 == local51 + 1) {
						return true;
					}
					if (local61 == local56 - arg0 && local51 >= local66 && local89 >= local51 && (this.anIntArrayArray159[local82][local51] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local51 >= local66 && local51 <= local89 && (this.anIntArrayArray159[local61][local51] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 == local56 + 1 && local66 <= local51 && local51 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local82 && local66 == local51 + 1 && (this.anIntArrayArray159[local56][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 >= local61 && local82 >= local56 && local51 - arg0 == local66 && (this.anIntArrayArray159[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local56 >= local61 && local56 <= local82 && local51 - arg0 == local66) {
						return true;
					}
					if (local56 - arg0 == local61 && local66 <= local51 && local51 <= local89 && (this.anIntArrayArray159[local82][local51] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local51 >= local66 && local51 <= local89 && (this.anIntArrayArray159[local61][local51] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local61 == local56 - arg0 && local66 <= local51 && local51 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local82 && local51 + 1 == local66) {
						return true;
					}
					if (local61 == local56 + 1 && local51 >= local66 && local51 <= local89 && (this.anIntArrayArray159[local61][local51] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 <= local56 && local82 >= local56 && local66 == local51 - arg0 && (this.anIntArrayArray159[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local56 - arg0 == local61 && local51 >= local66 && local89 >= local51 && (this.anIntArrayArray159[local82][local51] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 >= local61 && local56 <= local82 && local51 + 1 == local66) {
						return true;
					}
					if (local56 + 1 == local61 && local51 >= local66 && local89 >= local51) {
						return true;
					}
					if (local56 >= local61 && local82 >= local56 && local66 == local51 - arg0 && (this.anIntArrayArray159[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 == local56 - arg0 && local66 <= local51 && local89 >= local51 && (this.anIntArrayArray159[local82][local51] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local56 && local56 <= local82 && local66 == local51 + 1 && (this.anIntArrayArray159[local56][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local51 >= local66 && local51 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local82 && local51 - arg0 == local66) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local61 == local56 - arg0 && local51 >= local66 && local51 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local82 && local51 + 1 == local66 && (this.anIntArrayArray159[local56][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local51 >= local66 && local89 >= local51 && (this.anIntArrayArray159[local61][local51] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 >= local61 && local82 >= local56 && local66 == local51 - arg0) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local56 >= local61 && local56 <= local82 && local51 + 1 == local66 && (this.anIntArrayArray159[local56][local66] & 0x2C0120) == 0) {
					return true;
				}
				if (local56 >= local61 && local82 >= local56 && local51 - arg0 == local66 && (this.anIntArrayArray159[local56][local89] & 0x2C0102) == 0) {
					return true;
				}
				if (local56 - arg0 == local61 && local66 <= local51 && local51 <= local89 && (this.anIntArrayArray159[local82][local51] & 0x2C0108) == 0) {
					return true;
				}
				if (local61 == local56 + 1 && local51 >= local66 && local89 >= local51 && (this.anIntArrayArray159[local61][local51] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIB)V")
	private void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray159[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)V")
	public void method5201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6535;
		@Pc(21) int local21 = arg1 - this.anInt6523;
		this.anIntArrayArray159[local8][local21] |= 0x200000;
	}
}

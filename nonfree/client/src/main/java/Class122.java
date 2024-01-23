import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class122 {

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	private int anInt3911;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	private int anInt3910;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "I")
	private int anInt3923;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "I")
	private int anInt3905;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3911 = arg0;
		this.anInt3910 = 0;
		this.anInt3923 = arg1;
		this.anInt3905 = 0;
		this.anIntArrayArray28 = new int[this.anInt3911][this.anInt3923];
		this.method3120();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public void method3120() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt3911; local8++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3923; local18++) {
				if (local8 == 0 || local18 == 0 || this.anInt3911 - 5 <= local8 || this.anInt3923 - 5 <= local18) {
					this.anIntArrayArray28[local8][local18] = 16777215;
				} else {
					this.anIntArrayArray28[local8][local18] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBII)V")
	private void method3121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray28[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIIIZII)V")
	public void method3122(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12 = arg2 - this.anInt3910;
		@Pc(17) int local17 = arg5 - this.anInt3905;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method3121(local12, local17, 128);
				this.method3121(local12 - 1, local17, 8);
			}
			if (arg1 == 1) {
				this.method3121(local12, local17, 2);
				this.method3121(local12, local17 + 1, 32);
			}
			if (arg1 == 2) {
				this.method3121(local12, local17, 8);
				this.method3121(local12 + 1, local17, 128);
			}
			if (arg1 == 3) {
				this.method3121(local12, local17, 32);
				this.method3121(local12, local17 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method3121(local12, local17, 1);
				this.method3121(local12 - 1, local17 + 1, 16);
			}
			if (arg1 == 1) {
				this.method3121(local12, local17, 4);
				this.method3121(local12 + 1, local17 + 1, 64);
			}
			if (arg1 == 2) {
				this.method3121(local12, local17, 16);
				this.method3121(local12 + 1, local17 + -1, 1);
			}
			if (arg1 == 3) {
				this.method3121(local12, local17, 64);
				this.method3121(local12 - 1, local17 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method3121(local12, local17, 130);
				this.method3121(local12 - 1, local17, 8);
				this.method3121(local12, local17 + 1, 32);
			}
			if (arg1 == 1) {
				this.method3121(local12, local17, 10);
				this.method3121(local12, local17 + 1, 32);
				this.method3121(local12 + 1, local17, 128);
			}
			if (arg1 == 2) {
				this.method3121(local12, local17, 40);
				this.method3121(local12 + 1, local17, 128);
				this.method3121(local12, local17 - 1, 2);
			}
			if (arg1 == 3) {
				this.method3121(local12, local17, 160);
				this.method3121(local12, local17 - 1, 2);
				this.method3121(local12 - 1, local17, 8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method3121(local12, local17, 65536);
					this.method3121(local12 - 1, local17, 4096);
				}
				if (arg1 == 1) {
					this.method3121(local12, local17, 1024);
					this.method3121(local12, local17 + 1, 16384);
				}
				if (arg1 == 2) {
					this.method3121(local12, local17, 4096);
					this.method3121(local12 + 1, local17, 65536);
				}
				if (arg1 == 3) {
					this.method3121(local12, local17, 16384);
					this.method3121(local12, local17 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method3121(local12, local17, 512);
					this.method3121(local12 - 1, local17 + 1, 8192);
				}
				if (arg1 == 1) {
					this.method3121(local12, local17, 2048);
					this.method3121(local12 + 1, local17 + 1, 32768);
				}
				if (arg1 == 2) {
					this.method3121(local12, local17, 8192);
					this.method3121(local12 + 1, local17 - 1, 512);
				}
				if (arg1 == 3) {
					this.method3121(local12, local17, 32768);
					this.method3121(local12 - 1, local17 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method3121(local12, local17, 66560);
					this.method3121(local12 - 1, local17, 4096);
					this.method3121(local12, local17 + 1, 16384);
				}
				if (arg1 == 1) {
					this.method3121(local12, local17, 5120);
					this.method3121(local12, local17 + 1, 16384);
					this.method3121(local12 + 1, local17, 65536);
				}
				if (arg1 == 2) {
					this.method3121(local12, local17, 20480);
					this.method3121(local12 + 1, local17, 65536);
					this.method3121(local12, local17 - 1, 1024);
				}
				if (arg1 == 3) {
					this.method3121(local12, local17, 81920);
					this.method3121(local12, local17 - 1, 1024);
					this.method3121(local12 - 1, local17, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method3121(local12, local17, 536870912);
				this.method3121(local12 - 1, local17, 33554432);
			}
			if (arg1 == 1) {
				this.method3121(local12, local17, 8388608);
				this.method3121(local12, local17 + 1, 134217728);
			}
			if (arg1 == 2) {
				this.method3121(local12, local17, 33554432);
				this.method3121(local12 + 1, local17, 536870912);
			}
			if (arg1 == 3) {
				this.method3121(local12, local17, 134217728);
				this.method3121(local12, local17 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method3121(local12, local17, 4194304);
				this.method3121(local12 - 1, local17 + 1, 67108864);
			}
			if (arg1 == 1) {
				this.method3121(local12, local17, 16777216);
				this.method3121(local12 + 1, local17 + 1, 268435456);
			}
			if (arg1 == 2) {
				this.method3121(local12, local17, 67108864);
				this.method3121(local12 + 1, local17 + -1, 4194304);
			}
			if (arg1 == 3) {
				this.method3121(local12, local17, 268435456);
				this.method3121(local12 - 1, local17 - 1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method3121(local12, local17, 545259520);
			this.method3121(local12 - 1, local17, 33554432);
			this.method3121(local12, local17 + 1, 134217728);
		}
		if (arg1 == 1) {
			this.method3121(local12, local17, 41943040);
			this.method3121(local12, local17 + 1, 134217728);
			this.method3121(local12 + 1, local17, 536870912);
		}
		if (arg1 == 2) {
			this.method3121(local12, local17, 167772160);
			this.method3121(local12 + 1, local17, 536870912);
			this.method3121(local12, local17 - 1, 8388608);
		}
		if (arg1 == 3) {
			this.method3121(local12, local17, 671088640);
			this.method3121(local12, local17 - 1, 8388608);
			this.method3121(local12 - 1, local17, 33554432);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method3123(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg2;
		@Pc(14) int local14 = arg6 + arg4;
		@Pc(19) int local19 = arg3 + arg7;
		@Pc(29) int local29 = arg0 + arg5;
		@Pc(55) int local55;
		@Pc(44) int local44;
		if (local9 == arg3 && (arg1 & 0x2) == 0) {
			local44 = local29 <= local14 ? local29 : local14;
			for (local55 = arg0 >= arg6 ? arg0 : arg6; local55 < local44; local55++) {
				if ((this.anIntArrayArray28[local9 - this.anInt3910 - 1][local55 - this.anInt3905] & 0x8) == 0) {
					return true;
				}
			}
		} else if (local19 == arg8 && (arg1 & 0x8) == 0) {
			local55 = arg6 <= arg0 ? arg0 : arg6;
			local44 = local29 > local14 ? local14 : local29;
			while (local55 < local44) {
				if ((this.anIntArrayArray28[arg8 - this.anInt3910][local55 - this.anInt3905] & 0x80) == 0) {
					return true;
				}
				local55++;
			}
		} else if (local29 == arg6 && (arg1 & 0x1) == 0) {
			local44 = local19 >= local9 ? local9 : local19;
			for (local55 = arg8 >= arg3 ? arg8 : arg3; local55 < local44; local55++) {
				if ((this.anIntArrayArray28[local55 - this.anInt3910][local29 - this.anInt3905 - 1] & 0x2) == 0) {
					return true;
				}
			}
		} else if (local14 == arg0 && (arg1 & 0x4) == 0) {
			local55 = arg8 < arg3 ? arg3 : arg8;
			local44 = local9 > local19 ? local19 : local9;
			while (local44 > local55) {
				if ((this.anIntArrayArray28[local55 - this.anInt3910][arg0 - this.anInt3905] & 0x20) == 0) {
					return true;
				}
				local55++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIZIZI)V")
	public void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(6) int local6 = arg4 - this.anInt3905;
		@Pc(11) int local11 = arg0 - this.anInt3910;
		@Pc(17) int local17 = 256;
		if (arg5) {
			local17 = 131328;
		}
		if (arg3) {
			local17 |= 0x40000000;
		}
		for (@Pc(32) int local32 = local11; local32 < local11 + arg2; local32++) {
			if (local32 >= 0 && local32 < this.anInt3911) {
				for (@Pc(56) int local56 = local6; local56 < arg1 + local6; local56++) {
					if (local56 >= 0 && this.anInt3923 > local56) {
						this.method3130(local17, local56, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBIIIZII)V")
	public void method3126(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg3 - this.anInt3905;
		@Pc(12) int local12 = 256;
		if (arg6 == 1 || arg6 == 3) {
			@Pc(23) int local23 = arg5;
			arg5 = arg1;
			arg1 = local23;
		}
		@Pc(32) int local32 = arg2 - this.anInt3910;
		if (arg0) {
			local12 = 131328;
		}
		if (arg4) {
			local12 |= 0x40000000;
		}
		for (@Pc(56) int local56 = local32; local56 < arg5 + local32; local56++) {
			if (local56 >= 0 && this.anInt3911 > local56) {
				for (@Pc(71) int local71 = local6; local71 < arg1 + local6; local71++) {
					if (local71 >= 0 && this.anInt3923 > local71) {
						this.method3121(local56, local71, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg3 && arg6 == arg5) {
				return true;
			}
		} else if (arg3 <= arg4 && arg3 + arg0 - 1 >= arg4 && arg6 >= arg6 && arg6 + arg0 - 1 >= arg6) {
			return true;
		}
		@Pc(57) int local57 = arg6 - this.anInt3905;
		@Pc(62) int local62 = arg4 - this.anInt3910;
		@Pc(67) int local67 = arg5 - this.anInt3905;
		@Pc(72) int local72 = arg3 - this.anInt3910;
		if (arg0 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local72 == local62 + 1 && local67 == local57 && (this.anIntArrayArray28[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local62 == local72 && local67 == local57 - 1 && (this.anIntArrayArray28[local72][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local72 == local62 - 1 && local67 == local57 && (this.anIntArrayArray28[local72][local67] & 0x8) == 0) {
						return true;
					}
					if (local62 == local72 && local57 - 1 == local67 && (this.anIntArrayArray28[local72][local67] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local72 == local62 - 1 && local57 == local67 && (this.anIntArrayArray28[local72][local67] & 0x8) == 0) {
						return true;
					}
					if (local62 == local72 && local67 == local57 + 1 && (this.anIntArrayArray28[local72][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local62 + 1 == local72 && local57 == local67 && (this.anIntArrayArray28[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 == local62 && local67 == local57 + 1 && (this.anIntArrayArray28[local72][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local72 == local62 && local57 + 1 == local67 && (this.anIntArrayArray28[local72][local67] & 0x20) == 0) {
					return true;
				}
				if (local72 == local62 && local67 == local57 - 1 && (this.anIntArrayArray28[local72][local67] & 0x2) == 0) {
					return true;
				}
				if (local72 == local62 - 1 && local57 == local67 && (this.anIntArrayArray28[local72][local67] & 0x8) == 0) {
					return true;
				}
				if (local62 + 1 == local72 && local67 == local57 && (this.anIntArrayArray28[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(411) int local411 = arg0 + local67 - 1;
			@Pc(418) int local418 = local72 + arg0 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local72 == local62 + 1 && local67 <= local57 && local57 <= local411 && (this.anIntArrayArray28[local72][local57] & 0x80) == 0) {
						return true;
					}
					if (local62 >= local72 && local418 >= local62 && local57 - arg0 == local67 && (this.anIntArrayArray28[local62][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local62 - arg0 == local72 && local57 >= local67 && local57 <= local411 && (this.anIntArrayArray28[local418][local57] & 0x8) == 0) {
						return true;
					}
					if (local62 >= local72 && local62 <= local418 && local67 == local57 - arg0 && (this.anIntArrayArray28[local62][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local62 - arg0 == local72 && local67 <= local57 && local57 <= local411 && (this.anIntArrayArray28[local418][local57] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local62 && local418 >= local62 && local57 + 1 == local67 && (this.anIntArrayArray28[local62][local67] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local62 + 1 == local72 && local57 >= local67 && local57 <= local411 && (this.anIntArrayArray28[local72][local57] & 0x80) == 0) {
						return true;
					}
					if (local62 >= local72 && local62 <= local418 && local57 + 1 == local67 && (this.anIntArrayArray28[local62][local67] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local62 >= local72 && local62 <= local418 && local67 == local57 + 1 && (this.anIntArrayArray28[local62][local67] & 0x20) == 0) {
					return true;
				}
				if (local72 <= local62 && local418 >= local62 && local57 - arg0 == local67 && (this.anIntArrayArray28[local62][local411] & 0x2) == 0) {
					return true;
				}
				if (local72 == local62 - arg0 && local57 >= local67 && local57 <= local411 && (this.anIntArrayArray28[local418][local57] & 0x8) == 0) {
					return true;
				}
				if (local72 == local62 + 1 && local57 >= local67 && local411 >= local57 && (this.anIntArrayArray28[local72][local57] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)V")
	public void method3128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3910;
		@Pc(13) int local13 = arg1 - this.anInt3905;
		this.anIntArrayArray28[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
	private void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray28[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIIIZZ)V")
	public void method3131(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt3910;
		@Pc(13) int local13 = arg4 - this.anInt3905;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method3130(128, local13, local4);
				this.method3130(8, local13, local4 - 1);
			}
			if (arg2 == 1) {
				this.method3130(2, local13, local4);
				this.method3130(32, local13 + 1, local4);
			}
			if (arg2 == 2) {
				this.method3130(8, local13, local4);
				this.method3130(128, local13, local4 + 1);
			}
			if (arg2 == 3) {
				this.method3130(32, local13, local4);
				this.method3130(2, local13 - 1, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method3130(1, local13, local4);
				this.method3130(16, local13 + 1, local4 - 1);
			}
			if (arg2 == 1) {
				this.method3130(4, local13, local4);
				this.method3130(64, local13 + 1, local4 - -1);
			}
			if (arg2 == 2) {
				this.method3130(16, local13, local4);
				this.method3130(1, local13 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method3130(64, local13, local4);
				this.method3130(4, local13 - 1, local4 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method3130(130, local13, local4);
				this.method3130(8, local13, local4 - 1);
				this.method3130(32, local13 + 1, local4);
			}
			if (arg2 == 1) {
				this.method3130(10, local13, local4);
				this.method3130(32, local13 + 1, local4);
				this.method3130(128, local13, local4 + 1);
			}
			if (arg2 == 2) {
				this.method3130(40, local13, local4);
				this.method3130(128, local13, local4 + 1);
				this.method3130(2, local13 - 1, local4);
			}
			if (arg2 == 3) {
				this.method3130(160, local13, local4);
				this.method3130(2, local13 - 1, local4);
				this.method3130(8, local13, local4 - 1);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method3130(65536, local13, local4);
					this.method3130(4096, local13, local4 - 1);
				}
				if (arg2 == 1) {
					this.method3130(1024, local13, local4);
					this.method3130(16384, local13 + 1, local4);
				}
				if (arg2 == 2) {
					this.method3130(4096, local13, local4);
					this.method3130(65536, local13, local4 + 1);
				}
				if (arg2 == 3) {
					this.method3130(16384, local13, local4);
					this.method3130(1024, local13 - 1, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method3130(512, local13, local4);
					this.method3130(8192, local13 + 1, local4 + -1);
				}
				if (arg2 == 1) {
					this.method3130(2048, local13, local4);
					this.method3130(32768, local13 + 1, local4 + 1);
				}
				if (arg2 == 2) {
					this.method3130(8192, local13, local4);
					this.method3130(512, local13 - 1, local4 - -1);
				}
				if (arg2 == 3) {
					this.method3130(32768, local13, local4);
					this.method3130(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method3130(66560, local13, local4);
					this.method3130(4096, local13, local4 - 1);
					this.method3130(16384, local13 + 1, local4);
				}
				if (arg2 == 1) {
					this.method3130(5120, local13, local4);
					this.method3130(16384, local13 + 1, local4);
					this.method3130(65536, local13, local4 + 1);
				}
				if (arg2 == 2) {
					this.method3130(20480, local13, local4);
					this.method3130(65536, local13, local4 + 1);
					this.method3130(1024, local13 - 1, local4);
				}
				if (arg2 == 3) {
					this.method3130(81920, local13, local4);
					this.method3130(1024, local13 - 1, local4);
					this.method3130(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method3130(536870912, local13, local4);
				this.method3130(33554432, local13, local4 - 1);
			}
			if (arg2 == 1) {
				this.method3130(8388608, local13, local4);
				this.method3130(134217728, local13 + 1, local4);
			}
			if (arg2 == 2) {
				this.method3130(33554432, local13, local4);
				this.method3130(536870912, local13, local4 + 1);
			}
			if (arg2 == 3) {
				this.method3130(134217728, local13, local4);
				this.method3130(8388608, local13 - 1, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method3130(4194304, local13, local4);
				this.method3130(67108864, local13 + 1, local4 + -1);
			}
			if (arg2 == 1) {
				this.method3130(16777216, local13, local4);
				this.method3130(268435456, local13 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method3130(67108864, local13, local4);
				this.method3130(4194304, local13 - 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method3130(268435456, local13, local4);
				this.method3130(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method3130(545259520, local13, local4);
			this.method3130(33554432, local13, local4 - 1);
			this.method3130(134217728, local13 + 1, local4);
		}
		if (arg2 == 1) {
			this.method3130(41943040, local13, local4);
			this.method3130(134217728, local13 + 1, local4);
			this.method3130(536870912, local13, local4 + 1);
		}
		if (arg2 == 2) {
			this.method3130(167772160, local13, local4);
			this.method3130(536870912, local13, local4 + 1);
			this.method3130(8388608, local13 - 1, local4);
		}
		if (arg2 == 3) {
			this.method3130(671088640, local13, local4);
			this.method3130(8388608, local13 - 1, local4);
			this.method3130(33554432, local13, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public void method3132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3910;
		@Pc(13) int local13 = arg1 - this.anInt3905;
		this.anIntArrayArray28[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)V")
	public void method3133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3910;
		@Pc(9) int local9 = arg1 - this.anInt3905;
		this.anIntArrayArray28[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method3135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg0 && arg6 == arg1) {
				return true;
			}
		} else if (arg0 >= arg3 && arg3 + arg5 - 1 >= arg0 && arg6 >= arg6 && arg5 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(56) int local56 = arg1 - this.anInt3905;
		@Pc(61) int local61 = arg0 - this.anInt3910;
		@Pc(66) int local66 = arg6 - this.anInt3905;
		@Pc(71) int local71 = arg3 - this.anInt3910;
		if (arg5 == 1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					if (local61 - 1 == local71 && local66 == local56) {
						return true;
					}
					if (local61 == local71 && local66 + 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local61 == local71 && local56 == local66 + 1) {
						return true;
					}
					if (local61 - 1 == local71 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 + 1 == local71 && local56 == local66) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local61 && local56 == local66 - 1 && (this.anIntArrayArray28[local71][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local61 && local66 - 1 == local56) {
						return true;
					}
					if (local71 == local61 - 1 && local66 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					if (local61 - 1 == local71 && local66 == local56) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local56) {
						return true;
					}
					if (local71 == local61 + 1 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 == local61 - 1 && local66 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local71 && local56 == local66 + 1) {
						return true;
					}
					if (local61 + 1 == local71 && local66 == local56) {
						return true;
					}
					if (local71 == local61 && local66 - 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local61 - 1 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local56 == local66) {
						return true;
					}
					if (local61 == local71 && local56 == local66 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local61 - 1 && local56 == local66) {
						return true;
					}
					if (local61 == local71 && local66 + 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local66 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local56) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local61 == local71 && local66 + 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x20) == 0) {
					return true;
				}
				if (local71 == local61 && local66 - 1 == local56 && (this.anIntArrayArray28[local71][local56] & 0x2) == 0) {
					return true;
				}
				if (local61 - 1 == local71 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local56 == local66 && (this.anIntArrayArray28[local71][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(789) int local789 = arg5 + local71 - 1;
			@Pc(795) int local795 = local56 + arg5 - 1;
			if (arg2 == 0) {
				if (arg4 == 0) {
					if (local61 - arg5 == local71 && local56 <= local66 && local66 <= local795) {
						return true;
					}
					if (local71 <= local61 && local789 >= local61 && local66 + 1 == local56 && (this.anIntArrayArray28[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local789 && local66 - arg5 == local56 && (this.anIntArrayArray28[local61][local795] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 <= local61 && local61 <= local789 && local56 == local66 + 1) {
						return true;
					}
					if (local71 == local61 - arg5 && local56 <= local66 && local66 <= local795 && (this.anIntArrayArray28[local789][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local66 >= local56 && local66 <= local795 && (this.anIntArrayArray28[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 + 1 == local71 && local66 >= local56 && local795 >= local66) {
						return true;
					}
					if (local61 >= local71 && local61 <= local789 && local56 == local66 + 1 && (this.anIntArrayArray28[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local71 && local789 >= local61 && local56 == local66 - arg5 && (this.anIntArrayArray28[local61][local795] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local61 >= local71 && local789 >= local61 && local66 - arg5 == local56) {
						return true;
					}
					if (local71 == local61 - arg5 && local56 <= local66 && local66 <= local795 && (this.anIntArrayArray28[local789][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local66 >= local56 && local66 <= local795 && (this.anIntArrayArray28[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					if (local71 == local61 - arg5 && local56 <= local66 && local66 <= local795) {
						return true;
					}
					if (local61 >= local71 && local789 >= local61 && local66 + 1 == local56) {
						return true;
					}
					if (local71 == local61 + 1 && local66 >= local56 && local795 >= local66 && (this.anIntArrayArray28[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local789 && local66 - arg5 == local56 && (this.anIntArrayArray28[local61][local795] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local61 - arg5 == local71 && local66 >= local56 && local66 <= local795 && (this.anIntArrayArray28[local789][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 <= local61 && local789 >= local61 && local56 == local66 + 1) {
						return true;
					}
					if (local71 == local61 + 1 && local66 >= local56 && local795 >= local66) {
						return true;
					}
					if (local61 >= local71 && local61 <= local789 && local56 == local66 - arg5 && (this.anIntArrayArray28[local61][local795] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local61 - arg5 && local56 <= local66 && local66 <= local795 && (this.anIntArrayArray28[local789][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 <= local61 && local789 >= local61 && local66 + 1 == local56 && (this.anIntArrayArray28[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 >= local56 && local66 <= local795) {
						return true;
					}
					if (local71 <= local61 && local61 <= local789 && local56 == local66 - arg5) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local61 - arg5 == local71 && local66 >= local56 && local795 >= local66) {
						return true;
					}
					if (local61 >= local71 && local61 <= local789 && local56 == local66 + 1 && (this.anIntArrayArray28[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local56 <= local66 && local795 >= local66 && (this.anIntArrayArray28[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 <= local61 && local789 >= local61 && local66 - arg5 == local56) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local61 >= local71 && local789 >= local61 && local66 + 1 == local56 && (this.anIntArrayArray28[local61][local56] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 >= local71 && local789 >= local61 && local66 - arg5 == local56 && (this.anIntArrayArray28[local61][local795] & 0x2C0102) == 0) {
					return true;
				}
				if (local71 == local61 - arg5 && local56 <= local66 && local795 >= local66 && (this.anIntArrayArray28[local789][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 == local61 + 1 && local56 <= local66 && local795 >= local66 && (this.anIntArrayArray28[local71][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)Z")
	public boolean method3139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == arg2 && arg0 == arg3) {
			return true;
		}
		@Pc(18) int local18 = arg3 - this.anInt3905;
		@Pc(23) int local23 = arg1 - this.anInt3910;
		if (local23 < 0 || this.anInt3911 <= local23 || local18 < 0 || this.anInt3923 <= local18) {
			return false;
		}
		@Pc(53) int local53 = arg2 - this.anInt3910;
		@Pc(58) int local58 = arg0 - this.anInt3905;
		if (local53 < 0 || local53 >= this.anInt3911 || local58 < 0 || local58 >= this.anInt3923) {
			return false;
		}
		@Pc(92) int local92;
		if (local53 < local23) {
			local92 = local23 - local53;
		} else {
			local92 = local53 - local23;
		}
		@Pc(110) int local110;
		if (local58 >= local18) {
			local110 = local58 - local18;
		} else {
			local110 = local18 - local58;
		}
		@Pc(132) int local132;
		@Pc(126) int local126;
		if (local110 >= local92) {
			local126 = 32768;
			local132 = local92 * 65536 / local110;
			while (local18 != local58) {
				if (local58 < local18) {
					if ((this.anIntArrayArray28[local53][local58] & 0x2C0102) != 0) {
						return false;
					}
					local58++;
				} else if (local18 < local58) {
					if ((this.anIntArrayArray28[local53][local58] & 0x2C0120) != 0) {
						return false;
					}
					local58--;
				}
				local126 += local132;
				if (local126 >= 65536) {
					local126 -= 65536;
					if (local23 > local53) {
						if ((this.anIntArrayArray28[local53][local58] & 0x2C0108) != 0) {
							return false;
						}
						local53++;
					} else if (local53 > local23) {
						if ((this.anIntArrayArray28[local53][local58] & 0x2C0180) != 0) {
							return false;
						}
						local53--;
					}
				}
			}
		} else {
			local126 = 32768;
			local132 = local110 * 65536 / local92;
			while (local53 != local23) {
				if (local23 > local53) {
					if ((this.anIntArrayArray28[local53][local58] & 0x2C0108) != 0) {
						return false;
					}
					local53++;
				} else if (local53 > local23) {
					if ((this.anIntArrayArray28[local53][local58] & 0x2C0180) != 0) {
						return false;
					}
					local53--;
				}
				local126 += local132;
				if (local126 >= 65536) {
					local126 -= 65536;
					if (local18 > local58) {
						if ((this.anIntArrayArray28[local53][local58] & 0x2C0102) != 0) {
							return false;
						}
						local58++;
					} else if (local18 < local58) {
						if ((this.anIntArrayArray28[local53][local58] & 0x2C0120) != 0) {
							return false;
						}
						local58--;
					}
				}
			}
		}
		return (this.anIntArrayArray28[local23][local18] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method3140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 > 1) {
			return Static230.method3628(arg6, arg1, arg3, arg5, arg6, arg0, arg7, arg4) ? true : this.method3123(arg5, arg2, arg1, arg7, arg6, arg4, arg0, arg6, arg3);
		}
		@Pc(39) int local39 = arg4 + arg5 - 1;
		@Pc(45) int local45 = arg1 + arg3 - 1;
		if (arg3 <= arg7 && local45 >= arg7 && arg0 >= arg5 && local39 >= arg0) {
			return true;
		} else if (arg3 - 1 == arg7 && arg0 >= arg5 && local39 >= arg0 && (this.anIntArrayArray28[arg7 - this.anInt3910][arg0 - this.anInt3905] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg7 == local45 + 1 && arg5 <= arg0 && local39 >= arg0 && (this.anIntArrayArray28[arg7 - this.anInt3910][arg0 - this.anInt3905] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg0 && arg7 >= arg3 && arg7 <= local45 && (this.anIntArrayArray28[arg7 - this.anInt3910][arg0 - this.anInt3905] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local39 + 1 && arg7 >= arg3 && arg7 <= local45 && (this.anIntArrayArray28[arg7 - this.anInt3910][arg0 - this.anInt3905] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class181 {

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public int anInt4718;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public int anInt4721;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public int anInt4725;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg1 && arg6 == arg5) {
				return true;
			}
		} else if (arg1 <= arg3 && arg4 + arg1 - 1 >= arg3 && arg5 >= arg5 && arg5 + arg4 - 1 >= arg5) {
			return true;
		}
		@Pc(57) int local57 = arg3 - this.anInt4723;
		@Pc(62) int local62 = arg5 - this.anInt4725;
		@Pc(67) int local67 = arg1 - this.anInt4723;
		@Pc(72) int local72 = arg6 - this.anInt4725;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local57 + 1 == local67 && local62 == local72 && (this.anIntArrayArray29[local67][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 == local57 && local72 == local62 - 1 && (this.anIntArrayArray29[local67][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local67 == local57 - 1 && local62 == local72 && (this.anIntArrayArray29[local67][local72] & 0x8) == 0) {
						return true;
					}
					if (local67 == local57 && local62 - 1 == local72 && (this.anIntArrayArray29[local67][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local67 == local57 - 1 && local62 == local72 && (this.anIntArrayArray29[local67][local72] & 0x8) == 0) {
						return true;
					}
					if (local57 == local67 && local62 + 1 == local72 && (this.anIntArrayArray29[local67][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local67 == local57 + 1 && local72 == local62 && (this.anIntArrayArray29[local67][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 == local57 && local62 + 1 == local72 && (this.anIntArrayArray29[local67][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local57 == local67 && local62 + 1 == local72 && (this.anIntArrayArray29[local67][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 == local57 && local62 - 1 == local72 && (this.anIntArrayArray29[local67][local72] & 0x2) == 0) {
					return true;
				}
				if (local67 == local57 - 1 && local62 == local72 && (this.anIntArrayArray29[local67][local72] & 0x8) == 0) {
					return true;
				}
				if (local67 == local57 + 1 && local72 == local62 && (this.anIntArrayArray29[local67][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(419) int local419 = local67 + arg4 - 1;
			@Pc(426) int local426 = local72 + arg4 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local57 + 1 == local67 && local72 <= local62 && local426 >= local62 && (this.anIntArrayArray29[local67][local62] & 0x80) == 0) {
						return true;
					}
					if (local67 <= local57 && local419 >= local57 && local72 == local62 - arg4 && (this.anIntArrayArray29[local57][local426] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local57 - arg4 == local67 && local72 <= local62 && local426 >= local62 && (this.anIntArrayArray29[local419][local62] & 0x8) == 0) {
						return true;
					}
					if (local57 >= local67 && local419 >= local57 && local72 == local62 - arg4 && (this.anIntArrayArray29[local57][local426] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local57 - arg4 == local67 && local72 <= local62 && local426 >= local62 && (this.anIntArrayArray29[local419][local62] & 0x8) == 0) {
						return true;
					}
					if (local67 <= local57 && local57 <= local419 && local72 == local62 + 1 && (this.anIntArrayArray29[local57][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local57 + 1 == local67 && local72 <= local62 && local62 <= local426 && (this.anIntArrayArray29[local67][local62] & 0x80) == 0) {
						return true;
					}
					if (local57 >= local67 && local57 <= local419 && local62 + 1 == local72 && (this.anIntArrayArray29[local57][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local57 >= local67 && local57 <= local419 && local62 + 1 == local72 && (this.anIntArrayArray29[local57][local72] & 0x20) == 0) {
					return true;
				}
				if (local57 >= local67 && local419 >= local57 && local72 == local62 - arg4 && (this.anIntArrayArray29[local57][local426] & 0x2) == 0) {
					return true;
				}
				if (local57 - arg4 == local67 && local62 >= local72 && local62 <= local426 && (this.anIntArrayArray29[local419][local62] & 0x8) == 0) {
					return true;
				}
				if (local67 == local57 + 1 && local72 <= local62 && local426 >= local62 && (this.anIntArrayArray29[local67][local62] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg1 + arg5;
		@Pc(18) int local18 = arg6 + arg8;
		@Pc(22) int local22 = arg4 + arg3;
		@Pc(26) int local26 = arg0 + arg2;
		@Pc(61) int local61;
		@Pc(68) int local68;
		if (arg5 == local22 && (arg7 & 0x2) == 0) {
			local61 = arg6 > arg0 ? arg6 : arg0;
			local68 = local18 >= local26 ? local26 : local18;
			while (local61 < local68) {
				if ((this.anIntArrayArray29[local22 - this.anInt4723 - 1][local61 - this.anInt4725] & 0x8) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local14 == arg3 && (arg7 & 0x8) == 0) {
			local61 = arg0 < arg6 ? arg6 : arg0;
			local68 = local18 < local26 ? local18 : local26;
			while (local61 < local68) {
				if ((this.anIntArrayArray29[arg3 - this.anInt4723][local61 - this.anInt4725] & 0x80) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local26 == arg6 && (arg7 & 0x1) == 0) {
			local61 = arg5 > arg3 ? arg5 : arg3;
			local68 = local22 <= local14 ? local22 : local14;
			while (local61 < local68) {
				if ((this.anIntArrayArray29[local61 - this.anInt4723][local26 - this.anInt4725 - 1] & 0x2) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg0 == local18 && (arg7 & 0x4) == 0) {
			local61 = arg5 > arg3 ? arg5 : arg3;
			local68 = local22 <= local14 ? local22 : local14;
			while (local61 < local68) {
				if ((this.anIntArrayArray29[local61 - this.anInt4723][arg0 - this.anInt4725] & 0x20) == 0) {
					return true;
				}
				local61++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZBIIZ)V")
	public void method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg3 - this.anInt4723;
		@Pc(13) int local13 = arg4 - this.anInt4725;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method3884(local13, local8, 128);
				this.method3884(local13, local8 - 1, 8);
			}
			if (arg0 == 1) {
				this.method3884(local13, local8, 2);
				this.method3884(local13 + 1, local8, 32);
			}
			if (arg0 == 2) {
				this.method3884(local13, local8, 8);
				this.method3884(local13, local8 + 1, 128);
			}
			if (arg0 == 3) {
				this.method3884(local13, local8, 32);
				this.method3884(local13 - 1, local8, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method3884(local13, local8, 1);
				this.method3884(local13 + 1, local8 + -1, 16);
			}
			if (arg0 == 1) {
				this.method3884(local13, local8, 4);
				this.method3884(local13 + 1, local8 + 1, 64);
			}
			if (arg0 == 2) {
				this.method3884(local13, local8, 16);
				this.method3884(local13 - 1, local8 - -1, 1);
			}
			if (arg0 == 3) {
				this.method3884(local13, local8, 64);
				this.method3884(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method3884(local13, local8, 130);
				this.method3884(local13, local8 - 1, 8);
				this.method3884(local13 + 1, local8, 32);
			}
			if (arg0 == 1) {
				this.method3884(local13, local8, 10);
				this.method3884(local13 + 1, local8, 32);
				this.method3884(local13, local8 + 1, 128);
			}
			if (arg0 == 2) {
				this.method3884(local13, local8, 40);
				this.method3884(local13, local8 + 1, 128);
				this.method3884(local13 - 1, local8, 2);
			}
			if (arg0 == 3) {
				this.method3884(local13, local8, 160);
				this.method3884(local13 - 1, local8, 2);
				this.method3884(local13, local8 - 1, 8);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method3884(local13, local8, 65536);
					this.method3884(local13, local8 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method3884(local13, local8, 1024);
					this.method3884(local13 + 1, local8, 16384);
				}
				if (arg0 == 2) {
					this.method3884(local13, local8, 4096);
					this.method3884(local13, local8 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method3884(local13, local8, 16384);
					this.method3884(local13 - 1, local8, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method3884(local13, local8, 512);
					this.method3884(local13 + 1, local8 + -1, 8192);
				}
				if (arg0 == 1) {
					this.method3884(local13, local8, 2048);
					this.method3884(local13 + 1, local8 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method3884(local13, local8, 8192);
					this.method3884(local13 - 1, local8 - -1, 512);
				}
				if (arg0 == 3) {
					this.method3884(local13, local8, 32768);
					this.method3884(local13 - 1, local8 + -1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method3884(local13, local8, 66560);
					this.method3884(local13, local8 - 1, 4096);
					this.method3884(local13 + 1, local8, 16384);
				}
				if (arg0 == 1) {
					this.method3884(local13, local8, 5120);
					this.method3884(local13 + 1, local8, 16384);
					this.method3884(local13, local8 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method3884(local13, local8, 20480);
					this.method3884(local13, local8 + 1, 65536);
					this.method3884(local13 - 1, local8, 1024);
				}
				if (arg0 == 3) {
					this.method3884(local13, local8, 81920);
					this.method3884(local13 - 1, local8, 1024);
					this.method3884(local13, local8 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method3884(local13, local8, 536870912);
				this.method3884(local13, local8 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method3884(local13, local8, 8388608);
				this.method3884(local13 + 1, local8, 134217728);
			}
			if (arg0 == 2) {
				this.method3884(local13, local8, 33554432);
				this.method3884(local13, local8 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method3884(local13, local8, 134217728);
				this.method3884(local13 - 1, local8, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method3884(local13, local8, 4194304);
				this.method3884(local13 + 1, local8 - 1, 67108864);
			}
			if (arg0 == 1) {
				this.method3884(local13, local8, 16777216);
				this.method3884(local13 + 1, local8 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method3884(local13, local8, 67108864);
				this.method3884(local13 - 1, local8 + 1, 4194304);
			}
			if (arg0 == 3) {
				this.method3884(local13, local8, 268435456);
				this.method3884(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3884(local13, local8, 545259520);
			this.method3884(local13, local8 - 1, 33554432);
			this.method3884(local13 + 1, local8, 134217728);
		}
		if (arg0 == 1) {
			this.method3884(local13, local8, 41943040);
			this.method3884(local13 + 1, local8, 134217728);
			this.method3884(local13, local8 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method3884(local13, local8, 167772160);
			this.method3884(local13, local8 + 1, 536870912);
			this.method3884(local13 - 1, local8, 8388608);
		}
		if (arg0 == 3) {
			this.method3884(local13, local8, 671088640);
			this.method3884(local13 - 1, local8, 8388608);
			this.method3884(local13, local8 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method3869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static401.method5482(arg1, arg3, arg7, arg4, arg5, arg6, arg0, arg1) ? true : this.method3867(arg7, arg1, arg0, arg3, arg4, arg6, arg5, arg2, arg1);
		}
		@Pc(46) int local46 = arg4 + arg3 - 1;
		@Pc(53) int local53 = arg7 + arg0 - 1;
		if (arg3 <= arg6 && arg6 <= local46 && arg5 >= arg7 && local53 >= arg5) {
			return true;
		} else if (arg3 - 1 == arg6 && arg7 <= arg5 && arg5 <= local53 && (this.anIntArrayArray29[arg6 - this.anInt4723][arg5 - this.anInt4725] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg6 == local46 + 1 && arg7 <= arg5 && arg5 <= local53 && (this.anIntArrayArray29[arg6 - this.anInt4723][arg5 - this.anInt4725] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg5 && arg6 >= arg3 && local46 >= arg6 && (this.anIntArrayArray29[arg6 - this.anInt4723][arg5 - this.anInt4725] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local53 + 1 && arg3 <= arg6 && arg6 <= local46 && (this.anIntArrayArray29[arg6 - this.anInt4723][arg5 - this.anInt4725] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZII)V")
	public void method3870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 - this.anInt4723;
		@Pc(22) int local22 = arg1 - this.anInt4725;
		this.anIntArrayArray29[local17][local22] |= 0x200000;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)V")
	public void method3872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt4723;
		@Pc(21) int local21 = arg0 - this.anInt4725;
		this.anIntArrayArray29[local16][local21] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZIBZ)V")
	public void method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt4723;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg1 - this.anInt4725;
		for (@Pc(35) int local35 = local18; local35 < arg2 + local18; local35++) {
			if (local35 >= 0 && this.anInt4718 > local35) {
				for (@Pc(52) int local52 = local29; local52 < arg0 + local29; local52++) {
					if (local52 >= 0 && local52 < this.anInt4721) {
						this.method3884(local52, local35, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg2 && arg5 == arg6) {
				return true;
			}
		} else if (arg2 >= arg0 && arg2 <= arg1 + arg0 - 1 && arg6 <= arg6 && arg6 <= arg1 + arg6 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg5 - this.anInt4725;
		@Pc(66) int local66 = arg0 - this.anInt4723;
		@Pc(71) int local71 = arg2 - this.anInt4723;
		@Pc(76) int local76 = arg6 - this.anInt4725;
		if (arg1 == 1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local66 == local71 - 1 && local57 == local76) {
						return true;
					}
					if (local66 == local71 && local76 + 1 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 && local76 - 1 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local71 && local57 == local76 + 1) {
						return true;
					}
					if (local71 - 1 == local66 && local57 == local76 && (this.anIntArrayArray29[local66][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local71 + 1 == local66 && local76 == local57) {
						return true;
					}
					if (local66 == local71 && local76 + 1 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local66 && local57 == local76 - 1 && (this.anIntArrayArray29[local66][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 == local66 && local57 == local76 - 1) {
						return true;
					}
					if (local66 == local71 - 1 && local57 == local76 && (this.anIntArrayArray29[local66][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local57 == local76 && (this.anIntArrayArray29[local66][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local71 - 1 == local66 && local76 == local57) {
						return true;
					}
					if (local71 == local66 && local57 == local76 + 1) {
						return true;
					}
					if (local66 == local71 + 1 && local76 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local71 && local76 - 1 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local71 - 1 && local76 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local66 && local76 + 1 == local57) {
						return true;
					}
					if (local66 == local71 + 1 && local57 == local76) {
						return true;
					}
					if (local71 == local66 && local57 == local76 - 1 && (this.anIntArrayArray29[local66][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local71 - 1 == local66 && local57 == local76 && (this.anIntArrayArray29[local66][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local66 && local57 == local76 + 1 && (this.anIntArrayArray29[local66][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local57 == local76) {
						return true;
					}
					if (local71 == local66 && local76 - 1 == local57) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 - 1 == local66 && local57 == local76) {
						return true;
					}
					if (local71 == local66 && local76 + 1 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 == local57 && (this.anIntArrayArray29[local66][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local66 && local57 == local76 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local66 == local71 && local76 + 1 == local57 && (this.anIntArrayArray29[local66][local57] & 0x20) == 0) {
					return true;
				}
				if (local71 == local66 && local57 == local76 - 1 && (this.anIntArrayArray29[local66][local57] & 0x2) == 0) {
					return true;
				}
				if (local66 == local71 - 1 && local76 == local57 && (this.anIntArrayArray29[local66][local57] & 0x8) == 0) {
					return true;
				}
				if (local71 + 1 == local66 && local76 == local57 && (this.anIntArrayArray29[local66][local57] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = local66 + arg1 - 1;
			@Pc(94) int local94 = local57 + arg1 - 1;
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local71 - arg1 == local66 && local57 <= local76 && local76 <= local94) {
						return true;
					}
					if (local71 >= local66 && local87 >= local71 && local57 == local76 + 1 && (this.anIntArrayArray29[local71][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local87 && local76 - arg1 == local57 && (this.anIntArrayArray29[local71][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 <= local71 && local87 >= local71 && local76 + 1 == local57) {
						return true;
					}
					if (local66 == local71 - arg1 && local57 <= local76 && local94 >= local76 && (this.anIntArrayArray29[local87][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local57 <= local76 && local76 <= local94 && (this.anIntArrayArray29[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local71 + 1 && local57 <= local76 && local76 <= local94) {
						return true;
					}
					if (local71 >= local66 && local87 >= local71 && local76 + 1 == local57 && (this.anIntArrayArray29[local71][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local87 && local57 == local76 - arg1 && (this.anIntArrayArray29[local71][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 >= local66 && local87 >= local71 && local76 - arg1 == local57) {
						return true;
					}
					if (local71 - arg1 == local66 && local57 <= local76 && local94 >= local76 && (this.anIntArrayArray29[local87][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 >= local57 && local76 <= local94 && (this.anIntArrayArray29[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local71 - arg1 == local66 && local57 <= local76 && local76 <= local94) {
						return true;
					}
					if (local66 <= local71 && local87 >= local71 && local57 == local76 + 1) {
						return true;
					}
					if (local66 == local71 + 1 && local76 >= local57 && local94 >= local76 && (this.anIntArrayArray29[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 <= local71 && local87 >= local71 && local76 - arg1 == local57 && (this.anIntArrayArray29[local71][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local71 - arg1 == local66 && local76 >= local57 && local76 <= local94 && (this.anIntArrayArray29[local87][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local66 && local87 >= local71 && local76 + 1 == local57) {
						return true;
					}
					if (local71 + 1 == local66 && local76 >= local57 && local76 <= local94) {
						return true;
					}
					if (local71 >= local66 && local71 <= local87 && local57 == local76 - arg1 && (this.anIntArrayArray29[local71][local94] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local71 - arg1 && local57 <= local76 && local76 <= local94 && (this.anIntArrayArray29[local87][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 <= local71 && local87 >= local71 && local76 + 1 == local57 && (this.anIntArrayArray29[local71][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 >= local57 && local76 <= local94) {
						return true;
					}
					if (local66 <= local71 && local71 <= local87 && local76 - arg1 == local57) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 - arg1 == local66 && local76 >= local57 && local94 >= local76) {
						return true;
					}
					if (local71 >= local66 && local87 >= local71 && local76 + 1 == local57 && (this.anIntArrayArray29[local71][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 >= local57 && local76 <= local94 && (this.anIntArrayArray29[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 <= local71 && local87 >= local71 && local76 - arg1 == local57) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local66 <= local71 && local71 <= local87 && local57 == local76 + 1 && (this.anIntArrayArray29[local71][local57] & 0x2C0120) == 0) {
					return true;
				}
				if (local71 >= local66 && local87 >= local71 && local57 == local76 - arg1 && (this.anIntArrayArray29[local71][local94] & 0x2C0102) == 0) {
					return true;
				}
				if (local66 == local71 - arg1 && local57 <= local76 && local76 <= local94 && (this.anIntArrayArray29[local87][local76] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 + 1 == local66 && local57 <= local76 && local76 <= local94 && (this.anIntArrayArray29[local66][local76] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBIZIZI)V")
	public void method3875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt4723;
		@Pc(13) int local13 = arg5 - this.anInt4725;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method3879(128, local4, local13);
				this.method3879(8, local4 - 1, local13);
			}
			if (arg3 == 1) {
				this.method3879(2, local4, local13);
				this.method3879(32, local4, local13 + 1);
			}
			if (arg3 == 2) {
				this.method3879(8, local4, local13);
				this.method3879(128, local4 + 1, local13);
			}
			if (arg3 == 3) {
				this.method3879(32, local4, local13);
				this.method3879(2, local4, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method3879(1, local4, local13);
				this.method3879(16, local4 - 1, local13 + 1);
			}
			if (arg3 == 1) {
				this.method3879(4, local4, local13);
				this.method3879(64, local4 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method3879(16, local4, local13);
				this.method3879(1, local4 + 1, local13 + -1);
			}
			if (arg3 == 3) {
				this.method3879(64, local4, local13);
				this.method3879(4, local4 - 1, local13 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method3879(130, local4, local13);
				this.method3879(8, local4 - 1, local13);
				this.method3879(32, local4, local13 + 1);
			}
			if (arg3 == 1) {
				this.method3879(10, local4, local13);
				this.method3879(32, local4, local13 + 1);
				this.method3879(128, local4 + 1, local13);
			}
			if (arg3 == 2) {
				this.method3879(40, local4, local13);
				this.method3879(128, local4 + 1, local13);
				this.method3879(2, local4, local13 - 1);
			}
			if (arg3 == 3) {
				this.method3879(160, local4, local13);
				this.method3879(2, local4, local13 - 1);
				this.method3879(8, local4 - 1, local13);
			}
		}
		if (arg4) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method3879(65536, local4, local13);
					this.method3879(4096, local4 - 1, local13);
				}
				if (arg3 == 1) {
					this.method3879(1024, local4, local13);
					this.method3879(16384, local4, local13 + 1);
				}
				if (arg3 == 2) {
					this.method3879(4096, local4, local13);
					this.method3879(65536, local4 + 1, local13);
				}
				if (arg3 == 3) {
					this.method3879(16384, local4, local13);
					this.method3879(1024, local4, local13 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method3879(512, local4, local13);
					this.method3879(8192, local4 - 1, local13 + 1);
				}
				if (arg3 == 1) {
					this.method3879(2048, local4, local13);
					this.method3879(32768, local4 + 1, local13 + 1);
				}
				if (arg3 == 2) {
					this.method3879(8192, local4, local13);
					this.method3879(512, local4 + 1, local13 + -1);
				}
				if (arg3 == 3) {
					this.method3879(32768, local4, local13);
					this.method3879(2048, local4 - 1, local13 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method3879(66560, local4, local13);
					this.method3879(4096, local4 - 1, local13);
					this.method3879(16384, local4, local13 + 1);
				}
				if (arg3 == 1) {
					this.method3879(5120, local4, local13);
					this.method3879(16384, local4, local13 + 1);
					this.method3879(65536, local4 + 1, local13);
				}
				if (arg3 == 2) {
					this.method3879(20480, local4, local13);
					this.method3879(65536, local4 + 1, local13);
					this.method3879(1024, local4, local13 - 1);
				}
				if (arg3 == 3) {
					this.method3879(81920, local4, local13);
					this.method3879(1024, local4, local13 - 1);
					this.method3879(4096, local4 - 1, local13);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method3879(536870912, local4, local13);
				this.method3879(33554432, local4 - 1, local13);
			}
			if (arg3 == 1) {
				this.method3879(8388608, local4, local13);
				this.method3879(134217728, local4, local13 + 1);
			}
			if (arg3 == 2) {
				this.method3879(33554432, local4, local13);
				this.method3879(536870912, local4 + 1, local13);
			}
			if (arg3 == 3) {
				this.method3879(134217728, local4, local13);
				this.method3879(8388608, local4, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method3879(4194304, local4, local13);
				this.method3879(67108864, local4 - 1, local13 + 1);
			}
			if (arg3 == 1) {
				this.method3879(16777216, local4, local13);
				this.method3879(268435456, local4 + 1, local13 - -1);
			}
			if (arg3 == 2) {
				this.method3879(67108864, local4, local13);
				this.method3879(4194304, local4 + 1, local13 + -1);
			}
			if (arg3 == 3) {
				this.method3879(268435456, local4, local13);
				this.method3879(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method3879(545259520, local4, local13);
			this.method3879(33554432, local4 - 1, local13);
			this.method3879(134217728, local4, local13 + 1);
		}
		if (arg3 == 1) {
			this.method3879(41943040, local4, local13);
			this.method3879(134217728, local4, local13 + 1);
			this.method3879(536870912, local4 + 1, local13);
		}
		if (arg3 == 2) {
			this.method3879(167772160, local4, local13);
			this.method3879(536870912, local4 + 1, local13);
			this.method3879(8388608, local4, local13 - 1);
		}
		if (arg3 == 3) {
			this.method3879(671088640, local4, local13);
			this.method3879(8388608, local4, local13 - 1);
			this.method3879(33554432, local4 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIIIZIII)V")
	public void method3876(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg6 - this.anInt4723;
		@Pc(33) int local33 = arg2 - this.anInt4725;
		@Pc(41) int local41;
		if (arg1 == 1 || arg1 == 3) {
			local41 = arg5;
			arg5 = arg4;
			arg4 = local41;
		}
		for (local41 = local24; local41 < arg5 + local24; local41++) {
			if (local41 >= 0 && local41 < this.anInt4718) {
				for (@Pc(57) int local57 = local33; local57 < arg4 + local33; local57++) {
					if (local57 >= 0 && this.anInt4721 > local57) {
						this.method3879(local7, local41, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public void method3877() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt4718; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt4721; local19++) {
				if (local15 == 0 || local19 == 0 || this.anInt4718 - 5 <= local15 || this.anInt4721 - 5 <= local19) {
					this.anIntArrayArray29[local15][local19] = -1;
				} else {
					this.anIntArrayArray29[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
	private void method3879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray29[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public void method3880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4723;
		@Pc(18) int local18 = arg0 - this.anInt4725;
		this.anIntArrayArray29[local4][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
	public void method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4725;
		@Pc(13) int local13 = arg0 - this.anInt4723;
		this.anIntArrayArray29[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIII)V")
	private void method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray29[arg1][arg0] |= arg2;
	}
}

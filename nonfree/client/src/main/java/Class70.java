import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class70 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
	public int anInt1966;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
	public int anInt1976;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
	public int anInt1982;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIZIIZI)V")
	public void method1692(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt1966;
		@Pc(13) int local13 = arg5 - this.anInt1971;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1697(local13, 128, local8);
				this.method1697(local13, 8, local8 - 1);
			}
			if (arg0 == 1) {
				this.method1697(local13, 2, local8);
				this.method1697(local13 + 1, 32, local8);
			}
			if (arg0 == 2) {
				this.method1697(local13, 8, local8);
				this.method1697(local13, 128, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1697(local13, 32, local8);
				this.method1697(local13 - 1, 2, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1697(local13, 1, local8);
				this.method1697(local13 + 1, 16, local8 - 1);
			}
			if (arg0 == 1) {
				this.method1697(local13, 4, local8);
				this.method1697(local13 + 1, 64, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1697(local13, 16, local8);
				this.method1697(local13 - 1, 1, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1697(local13, 64, local8);
				this.method1697(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method1697(local13, 130, local8);
				this.method1697(local13, 8, local8 - 1);
				this.method1697(local13 + 1, 32, local8);
			}
			if (arg0 == 1) {
				this.method1697(local13, 10, local8);
				this.method1697(local13 + 1, 32, local8);
				this.method1697(local13, 128, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1697(local13, 40, local8);
				this.method1697(local13, 128, local8 + 1);
				this.method1697(local13 - 1, 2, local8);
			}
			if (arg0 == 3) {
				this.method1697(local13, 160, local8);
				this.method1697(local13 - 1, 2, local8);
				this.method1697(local13, 8, local8 - 1);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method1697(local13, 65536, local8);
					this.method1697(local13, 4096, local8 - 1);
				}
				if (arg0 == 1) {
					this.method1697(local13, 1024, local8);
					this.method1697(local13 + 1, 16384, local8);
				}
				if (arg0 == 2) {
					this.method1697(local13, 4096, local8);
					this.method1697(local13, 65536, local8 + 1);
				}
				if (arg0 == 3) {
					this.method1697(local13, 16384, local8);
					this.method1697(local13 - 1, 1024, local8);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method1697(local13, 512, local8);
					this.method1697(local13 + 1, 8192, local8 - 1);
				}
				if (arg0 == 1) {
					this.method1697(local13, 2048, local8);
					this.method1697(local13 + 1, 32768, local8 + 1);
				}
				if (arg0 == 2) {
					this.method1697(local13, 8192, local8);
					this.method1697(local13 - 1, 512, local8 + 1);
				}
				if (arg0 == 3) {
					this.method1697(local13, 32768, local8);
					this.method1697(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method1697(local13, 66560, local8);
					this.method1697(local13, 4096, local8 - 1);
					this.method1697(local13 + 1, 16384, local8);
				}
				if (arg0 == 1) {
					this.method1697(local13, 5120, local8);
					this.method1697(local13 + 1, 16384, local8);
					this.method1697(local13, 65536, local8 + 1);
				}
				if (arg0 == 2) {
					this.method1697(local13, 20480, local8);
					this.method1697(local13, 65536, local8 + 1);
					this.method1697(local13 - 1, 1024, local8);
				}
				if (arg0 == 3) {
					this.method1697(local13, 81920, local8);
					this.method1697(local13 - 1, 1024, local8);
					this.method1697(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1697(local13, 536870912, local8);
				this.method1697(local13, 33554432, local8 - 1);
			}
			if (arg0 == 1) {
				this.method1697(local13, 8388608, local8);
				this.method1697(local13 + 1, 134217728, local8);
			}
			if (arg0 == 2) {
				this.method1697(local13, 33554432, local8);
				this.method1697(local13, 536870912, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1697(local13, 134217728, local8);
				this.method1697(local13 - 1, 8388608, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1697(local13, 4194304, local8);
				this.method1697(local13 + 1, 67108864, local8 - 1);
			}
			if (arg0 == 1) {
				this.method1697(local13, 16777216, local8);
				this.method1697(local13 + 1, 268435456, local8 + 1);
			}
			if (arg0 == 2) {
				this.method1697(local13, 67108864, local8);
				this.method1697(local13 - 1, 4194304, local8 + 1);
			}
			if (arg0 == 3) {
				this.method1697(local13, 268435456, local8);
				this.method1697(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1697(local13, 545259520, local8);
			this.method1697(local13, 33554432, local8 - 1);
			this.method1697(local13 + 1, 134217728, local8);
		}
		if (arg0 == 1) {
			this.method1697(local13, 41943040, local8);
			this.method1697(local13 + 1, 134217728, local8);
			this.method1697(local13, 536870912, local8 + 1);
		}
		if (arg0 == 2) {
			this.method1697(local13, 167772160, local8);
			this.method1697(local13, 536870912, local8 + 1);
			this.method1697(local13 - 1, 8388608, local8);
		}
		if (arg0 == 3) {
			this.method1697(local13, 671088640, local8);
			this.method1697(local13 - 1, 8388608, local8);
			this.method1697(local13, 33554432, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
	public void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1971;
		@Pc(9) int local9 = arg1 - this.anInt1966;
		this.anIntArrayArray10[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBI)V")
	private void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray10[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZIIIIIII)Z")
	public boolean method1695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static344.method4453(arg1, arg7, arg2, arg0, arg4, arg6, arg2, arg3) ? true : this.method1698(arg2, arg3, arg0, arg4, arg7, arg2, arg5, arg6, arg1);
		}
		@Pc(43) int local43 = arg7 + arg4 - 1;
		@Pc(49) int local49 = arg3 + arg6 - 1;
		if (arg1 >= arg7 && local43 >= arg1 && arg0 >= arg6 && local49 >= arg0) {
			return true;
		} else if (arg1 == arg7 - 1 && arg6 <= arg0 && local49 >= arg0 && (this.anIntArrayArray10[arg1 - this.anInt1966][arg0 - this.anInt1971] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg1 == local43 + 1 && arg6 <= arg0 && local49 >= arg0 && (this.anIntArrayArray10[arg1 - this.anInt1966][arg0 - this.anInt1971] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg6 - 1 && arg7 <= arg1 && local43 >= arg1 && (this.anIntArrayArray10[arg1 - this.anInt1966][arg0 - this.anInt1971] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local49 + 1 && arg7 <= arg1 && arg1 <= local43 && (this.anIntArrayArray10[arg1 - this.anInt1966][arg0 - this.anInt1971] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method1696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg0 && arg2 == arg4) {
				return true;
			}
		} else if (arg3 <= arg0 && arg0 <= arg3 + arg5 - 1 && arg2 >= arg2 && arg2 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(62) int local62 = arg0 - this.anInt1966;
		@Pc(67) int local67 = arg2 - this.anInt1971;
		@Pc(72) int local72 = arg3 - this.anInt1966;
		@Pc(77) int local77 = arg4 - this.anInt1971;
		if (arg5 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local72 == local62 + 1 && local67 == local77 && (this.anIntArrayArray10[local72][local77] & 0x80) == 0) {
						return true;
					}
					if (local62 == local72 && local77 == local67 - 1 && (this.anIntArrayArray10[local72][local77] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local62 - 1 && local77 == local67 && (this.anIntArrayArray10[local72][local77] & 0x8) == 0) {
						return true;
					}
					if (local62 == local72 && local77 == local67 - 1 && (this.anIntArrayArray10[local72][local77] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local62 - 1 == local72 && local67 == local77 && (this.anIntArrayArray10[local72][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 == local62 && local77 == local67 + 1 && (this.anIntArrayArray10[local72][local77] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local62 + 1 == local72 && local67 == local77 && (this.anIntArrayArray10[local72][local77] & 0x80) == 0) {
						return true;
					}
					if (local62 == local72 && local77 == local67 + 1 && (this.anIntArrayArray10[local72][local77] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local72 == local62 && local67 + 1 == local77 && (this.anIntArrayArray10[local72][local77] & 0x20) == 0) {
					return true;
				}
				if (local62 == local72 && local67 - 1 == local77 && (this.anIntArrayArray10[local72][local77] & 0x2) == 0) {
					return true;
				}
				if (local72 == local62 - 1 && local77 == local67 && (this.anIntArrayArray10[local72][local77] & 0x8) == 0) {
					return true;
				}
				if (local72 == local62 + 1 && local77 == local67 && (this.anIntArrayArray10[local72][local77] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = arg5 + local72 - 1;
			@Pc(93) int local93 = local77 + arg5 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local72 == local62 + 1 && local77 <= local67 && local93 >= local67 && (this.anIntArrayArray10[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 <= local62 && local62 <= local86 && local77 == local67 - arg5 && (this.anIntArrayArray10[local62][local93] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local62 - arg5 && local77 <= local67 && local67 <= local93 && (this.anIntArrayArray10[local86][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local62 && local86 >= local62 && local67 - arg5 == local77 && (this.anIntArrayArray10[local62][local93] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local62 - arg5 == local72 && local67 >= local77 && local67 <= local93 && (this.anIntArrayArray10[local86][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 <= local62 && local62 <= local86 && local67 + 1 == local77 && (this.anIntArrayArray10[local62][local77] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local62 + 1 == local72 && local67 >= local77 && local67 <= local93 && (this.anIntArrayArray10[local72][local67] & 0x80) == 0) {
						return true;
					}
					if (local62 >= local72 && local62 <= local86 && local77 == local67 + 1 && (this.anIntArrayArray10[local62][local77] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local72 <= local62 && local86 >= local62 && local77 == local67 + 1 && (this.anIntArrayArray10[local62][local77] & 0x20) == 0) {
					return true;
				}
				if (local72 <= local62 && local86 >= local62 && local77 == local67 - arg5 && (this.anIntArrayArray10[local62][local93] & 0x2) == 0) {
					return true;
				}
				if (local62 - arg5 == local72 && local67 >= local77 && local93 >= local67 && (this.anIntArrayArray10[local86][local67] & 0x8) == 0) {
					return true;
				}
				if (local72 == local62 + 1 && local67 >= local77 && local67 <= local93 && (this.anIntArrayArray10[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V")
	private void method1697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray10[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBIIIIIII)Z")
	public boolean method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg0;
		@Pc(13) int local13 = arg2 + arg5;
		@Pc(25) int local25 = arg3 + arg4;
		@Pc(29) int local29 = arg7 + arg1;
		@Pc(78) int local78;
		@Pc(89) int local89;
		if (local25 == arg8 && (arg6 & 0x2) == 0) {
			local78 = arg2 > arg7 ? arg2 : arg7;
			local89 = local29 > local13 ? local13 : local29;
			while (local89 > local78) {
				if ((this.anIntArrayArray10[local25 - this.anInt1966 - 1][local78 - this.anInt1971] & 0x8) == 0) {
					return true;
				}
				local78++;
			}
		} else if (arg4 == local9 && (arg6 & 0x8) == 0) {
			local78 = arg7 < arg2 ? arg2 : arg7;
			local89 = local29 <= local13 ? local29 : local13;
			while (local78 < local89) {
				if ((this.anIntArrayArray10[arg4 - this.anInt1966][local78 - this.anInt1971] & 0x80) == 0) {
					return true;
				}
				local78++;
			}
		} else if (local29 == arg2 && (arg6 & 0x1) == 0) {
			local78 = arg8 > arg4 ? arg8 : arg4;
			local89 = local25 <= local9 ? local25 : local9;
			while (local89 > local78) {
				if ((this.anIntArrayArray10[local78 - this.anInt1966][local29 - this.anInt1971 - 1] & 0x2) == 0) {
					return true;
				}
				local78++;
			}
		} else if (arg7 == local13 && (arg6 & 0x4) == 0) {
			local78 = arg4 < arg8 ? arg8 : arg4;
			local89 = local25 <= local9 ? local25 : local9;
			while (local78 < local89) {
				if ((this.anIntArrayArray10[local78 - this.anInt1966][arg7 - this.anInt1971] & 0x20) == 0) {
					return true;
				}
				local78++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg5 == arg2 && arg0 == arg6) {
				return true;
			}
		} else if (arg5 <= arg2 && arg5 + arg3 - 1 >= arg2 && arg6 <= arg6 && arg6 <= arg6 + arg3 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg5 - this.anInt1966;
		@Pc(69) int local69 = arg6 - this.anInt1971;
		@Pc(74) int local74 = arg0 - this.anInt1971;
		@Pc(79) int local79 = arg2 - this.anInt1966;
		if (arg3 == 1) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local59 == local79 - 1 && local69 == local74) {
						return true;
					}
					if (local59 == local79 && local74 == local69 + 1 && (this.anIntArrayArray10[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local59 && local74 == local69 - 1 && (this.anIntArrayArray10[local59][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local59 == local79 && local74 == local69 + 1) {
						return true;
					}
					if (local79 - 1 == local59 && local74 == local69 && (this.anIntArrayArray10[local59][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 + 1 == local59 && local69 == local74 && (this.anIntArrayArray10[local59][local74] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local59 == local79 + 1 && local74 == local69) {
						return true;
					}
					if (local79 == local59 && local69 + 1 == local74 && (this.anIntArrayArray10[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local79 && local69 - 1 == local74 && (this.anIntArrayArray10[local59][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local79 == local59 && local69 - 1 == local74) {
						return true;
					}
					if (local59 == local79 - 1 && local74 == local69 && (this.anIntArrayArray10[local59][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 + 1 == local59 && local74 == local69 && (this.anIntArrayArray10[local59][local74] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local59 == local79 - 1 && local69 == local74) {
						return true;
					}
					if (local59 == local79 && local74 == local69 + 1) {
						return true;
					}
					if (local79 + 1 == local59 && local74 == local69 && (this.anIntArrayArray10[local59][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local79 && local74 == local69 - 1 && (this.anIntArrayArray10[local59][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local79 - 1 == local59 && local69 == local74 && (this.anIntArrayArray10[local59][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local79 && local69 + 1 == local74) {
						return true;
					}
					if (local79 + 1 == local59 && local69 == local74) {
						return true;
					}
					if (local59 == local79 && local74 == local69 - 1 && (this.anIntArrayArray10[local59][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local79 - 1 == local59 && local69 == local74 && (this.anIntArrayArray10[local59][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local79 && local74 == local69 + 1 && (this.anIntArrayArray10[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local79 + 1 && local69 == local74) {
						return true;
					}
					if (local59 == local79 && local69 - 1 == local74) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local59 == local79 - 1 && local74 == local69) {
						return true;
					}
					if (local79 == local59 && local69 + 1 == local74 && (this.anIntArrayArray10[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 + 1 == local59 && local74 == local69 && (this.anIntArrayArray10[local59][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local79 && local69 - 1 == local74) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local59 == local79 && local69 + 1 == local74 && (this.anIntArrayArray10[local59][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 == local79 && local74 == local69 - 1 && (this.anIntArrayArray10[local59][local74] & 0x2) == 0) {
					return true;
				}
				if (local79 - 1 == local59 && local69 == local74 && (this.anIntArrayArray10[local59][local74] & 0x8) == 0) {
					return true;
				}
				if (local59 == local79 + 1 && local74 == local69 && (this.anIntArrayArray10[local59][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(805) int local805 = arg3 + local59 - 1;
			@Pc(812) int local812 = local74 + arg3 - 1;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local59 == local79 - arg3 && local69 >= local74 && local812 >= local69) {
						return true;
					}
					if (local79 >= local59 && local805 >= local79 && local74 == local69 + 1 && (this.anIntArrayArray10[local79][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 >= local59 && local805 >= local79 && local69 - arg3 == local74 && (this.anIntArrayArray10[local79][local812] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local59 <= local79 && local805 >= local79 && local69 + 1 == local74) {
						return true;
					}
					if (local59 == local79 - arg3 && local74 <= local69 && local812 >= local69 && (this.anIntArrayArray10[local805][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local79 + 1 && local74 <= local69 && local69 <= local812 && (this.anIntArrayArray10[local59][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local79 + 1 == local59 && local74 <= local69 && local812 >= local69) {
						return true;
					}
					if (local59 <= local79 && local79 <= local805 && local74 == local69 + 1 && (this.anIntArrayArray10[local79][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 >= local59 && local79 <= local805 && local69 - arg3 == local74 && (this.anIntArrayArray10[local79][local812] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local59 <= local79 && local79 <= local805 && local69 - arg3 == local74) {
						return true;
					}
					if (local59 == local79 - arg3 && local69 >= local74 && local69 <= local812 && (this.anIntArrayArray10[local805][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 + 1 == local59 && local69 >= local74 && local69 <= local812 && (this.anIntArrayArray10[local59][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local59 == local79 - arg3 && local74 <= local69 && local69 <= local812) {
						return true;
					}
					if (local79 >= local59 && local805 >= local79 && local69 + 1 == local74) {
						return true;
					}
					if (local79 + 1 == local59 && local74 <= local69 && local69 <= local812 && (this.anIntArrayArray10[local59][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 <= local79 && local805 >= local79 && local69 - arg3 == local74 && (this.anIntArrayArray10[local79][local812] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local59 == local79 - arg3 && local69 >= local74 && local69 <= local812 && (this.anIntArrayArray10[local805][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 >= local59 && local79 <= local805 && local74 == local69 + 1) {
						return true;
					}
					if (local79 + 1 == local59 && local69 >= local74 && local69 <= local812) {
						return true;
					}
					if (local79 >= local59 && local805 >= local79 && local74 == local69 - arg3 && (this.anIntArrayArray10[local79][local812] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local59 == local79 - arg3 && local74 <= local69 && local69 <= local812 && (this.anIntArrayArray10[local805][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 >= local59 && local79 <= local805 && local74 == local69 + 1 && (this.anIntArrayArray10[local79][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 + 1 == local59 && local69 >= local74 && local812 >= local69) {
						return true;
					}
					if (local79 >= local59 && local805 >= local79 && local74 == local69 - arg3) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local59 == local79 - arg3 && local74 <= local69 && local69 <= local812) {
						return true;
					}
					if (local79 >= local59 && local805 >= local79 && local69 + 1 == local74 && (this.anIntArrayArray10[local79][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 + 1 == local59 && local69 >= local74 && local69 <= local812 && (this.anIntArrayArray10[local59][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 <= local79 && local79 <= local805 && local74 == local69 - arg3) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local79 >= local59 && local79 <= local805 && local74 == local69 + 1 && (this.anIntArrayArray10[local79][local74] & 0x2C0120) == 0) {
					return true;
				}
				if (local59 <= local79 && local805 >= local79 && local74 == local69 - arg3 && (this.anIntArrayArray10[local79][local812] & 0x2C0102) == 0) {
					return true;
				}
				if (local79 - arg3 == local59 && local69 >= local74 && local812 >= local69 && (this.anIntArrayArray10[local805][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local59 == local79 + 1 && local74 <= local69 && local69 <= local812 && (this.anIntArrayArray10[local59][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method1700(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg1 - this.anInt1966;
		@Pc(13) int local13 = arg4 - this.anInt1971;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1694(128, local13, local8);
				this.method1694(8, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method1694(2, local13, local8);
				this.method1694(32, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method1694(8, local13, local8);
				this.method1694(128, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1694(32, local13, local8);
				this.method1694(2, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1694(1, local13, local8);
				this.method1694(16, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method1694(4, local13, local8);
				this.method1694(64, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1694(16, local13, local8);
				this.method1694(1, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1694(64, local13, local8);
				this.method1694(4, local13 - 1, local8 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method1694(130, local13, local8);
				this.method1694(8, local13, local8 - 1);
				this.method1694(32, local13 + 1, local8);
			}
			if (arg2 == 1) {
				this.method1694(10, local13, local8);
				this.method1694(32, local13 + 1, local8);
				this.method1694(128, local13, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1694(40, local13, local8);
				this.method1694(128, local13, local8 + 1);
				this.method1694(2, local13 - 1, local8);
			}
			if (arg2 == 3) {
				this.method1694(160, local13, local8);
				this.method1694(2, local13 - 1, local8);
				this.method1694(8, local13, local8 - 1);
			}
		}
		if (arg0) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method1694(65536, local13, local8);
					this.method1694(4096, local13, local8 - 1);
				}
				if (arg2 == 1) {
					this.method1694(1024, local13, local8);
					this.method1694(16384, local13 + 1, local8);
				}
				if (arg2 == 2) {
					this.method1694(4096, local13, local8);
					this.method1694(65536, local13, local8 + 1);
				}
				if (arg2 == 3) {
					this.method1694(16384, local13, local8);
					this.method1694(1024, local13 - 1, local8);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method1694(512, local13, local8);
					this.method1694(8192, local13 + 1, local8 - 1);
				}
				if (arg2 == 1) {
					this.method1694(2048, local13, local8);
					this.method1694(32768, local13 + 1, local8 - -1);
				}
				if (arg2 == 2) {
					this.method1694(8192, local13, local8);
					this.method1694(512, local13 - 1, local8 + 1);
				}
				if (arg2 == 3) {
					this.method1694(32768, local13, local8);
					this.method1694(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method1694(66560, local13, local8);
					this.method1694(4096, local13, local8 - 1);
					this.method1694(16384, local13 + 1, local8);
				}
				if (arg2 == 1) {
					this.method1694(5120, local13, local8);
					this.method1694(16384, local13 + 1, local8);
					this.method1694(65536, local13, local8 + 1);
				}
				if (arg2 == 2) {
					this.method1694(20480, local13, local8);
					this.method1694(65536, local13, local8 + 1);
					this.method1694(1024, local13 - 1, local8);
				}
				if (arg2 == 3) {
					this.method1694(81920, local13, local8);
					this.method1694(1024, local13 - 1, local8);
					this.method1694(4096, local13, local8 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1694(536870912, local13, local8);
				this.method1694(33554432, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method1694(8388608, local13, local8);
				this.method1694(134217728, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method1694(33554432, local13, local8);
				this.method1694(536870912, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1694(134217728, local13, local8);
				this.method1694(8388608, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1694(4194304, local13, local8);
				this.method1694(67108864, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method1694(16777216, local13, local8);
				this.method1694(268435456, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1694(67108864, local13, local8);
				this.method1694(4194304, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method1694(268435456, local13, local8);
				this.method1694(16777216, local13 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1694(545259520, local13, local8);
			this.method1694(33554432, local13, local8 - 1);
			this.method1694(134217728, local13 + 1, local8);
		}
		if (arg2 == 1) {
			this.method1694(41943040, local13, local8);
			this.method1694(134217728, local13 + 1, local8);
			this.method1694(536870912, local13, local8 + 1);
		}
		if (arg2 == 2) {
			this.method1694(167772160, local13, local8);
			this.method1694(536870912, local13, local8 + 1);
			this.method1694(8388608, local13 - 1, local8);
		}
		if (arg2 == 3) {
			this.method1694(671088640, local13, local8);
			this.method1694(8388608, local13 - 1, local8);
			this.method1694(33554432, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZII)V")
	public void method1701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1966;
		@Pc(15) int local15 = arg1 - this.anInt1971;
		this.anIntArrayArray10[local4][local15] |= 0x200000;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V")
	public void method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1971;
		@Pc(9) int local9 = arg1 - this.anInt1966;
		this.anIntArrayArray10[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method1703() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1976; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1982; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt1976 - 5 <= local3 || local7 >= this.anInt1982 - 5) {
					this.anIntArrayArray10[local3][local7] = -1;
				} else {
					this.anIntArrayArray10[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZIZBII)V")
	public void method1704(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg4 - this.anInt1971;
		@Pc(29) int local29 = arg0 - this.anInt1966;
		for (@Pc(31) int local31 = local29; local31 < local29 + arg2; local31++) {
			if (local31 >= 0 && local31 < this.anInt1976) {
				for (@Pc(56) int local56 = local24; local56 < local24 + arg5; local56++) {
					if (local56 >= 0 && this.anInt1982 > local56) {
						this.method1694(local7, local56, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIZIZI)V")
	public void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg6 - this.anInt1966;
		@Pc(23) int local23 = arg4 - this.anInt1971;
		@Pc(35) int local35;
		if (arg2 == 1 || arg2 == 3) {
			local35 = arg1;
			arg1 = arg0;
			arg0 = local35;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		for (local35 = local18; local35 < local18 + arg1; local35++) {
			if (local35 >= 0 && local35 < this.anInt1976) {
				for (@Pc(57) int local57 = local23; local57 < local23 + arg0; local57++) {
					if (local57 >= 0 && local57 < this.anInt1982) {
						this.method1697(local57, local7, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(III)V")
	public void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1966;
		@Pc(13) int local13 = arg1 - this.anInt1971;
		this.anIntArrayArray10[local8][local13] |= 0x40000;
	}
}

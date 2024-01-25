import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class319 {

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	public int anInt9322;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
	public int anInt9331;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
	public int anInt9334;

	@OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
	public int anInt9338;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIZIIIZ)V")
	public void method7925(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt9322;
		@Pc(9) int local9 = arg2 - this.anInt9338;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method7937(128, local9, local4);
				this.method7937(8, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method7937(2, local9, local4);
				this.method7937(32, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7937(8, local9, local4);
				this.method7937(128, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method7937(32, local9, local4);
				this.method7937(2, local9, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method7937(1, local9, local4);
				this.method7937(16, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method7937(4, local9, local4);
				this.method7937(64, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7937(16, local9, local4);
				this.method7937(1, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method7937(64, local9, local4);
				this.method7937(4, local9 - 1, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method7937(130, local9, local4);
				this.method7937(8, local9 - 1, local4);
				this.method7937(32, local9, local4 + 1);
			}
			if (arg4 == 1) {
				this.method7937(10, local9, local4);
				this.method7937(32, local9, local4 + 1);
				this.method7937(128, local9 + 1, local4);
			}
			if (arg4 == 2) {
				this.method7937(40, local9, local4);
				this.method7937(128, local9 + 1, local4);
				this.method7937(2, local9, local4 - 1);
			}
			if (arg4 == 3) {
				this.method7937(160, local9, local4);
				this.method7937(2, local9, local4 - 1);
				this.method7937(8, local9 - 1, local4);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method7937(65536, local9, local4);
					this.method7937(4096, local9 - 1, local4);
				}
				if (arg4 == 1) {
					this.method7937(1024, local9, local4);
					this.method7937(16384, local9, local4 + 1);
				}
				if (arg4 == 2) {
					this.method7937(4096, local9, local4);
					this.method7937(65536, local9 + 1, local4);
				}
				if (arg4 == 3) {
					this.method7937(16384, local9, local4);
					this.method7937(1024, local9, local4 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method7937(512, local9, local4);
					this.method7937(8192, local9 - 1, local4 + 1);
				}
				if (arg4 == 1) {
					this.method7937(2048, local9, local4);
					this.method7937(32768, local9 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method7937(8192, local9, local4);
					this.method7937(512, local9 + 1, local4 + -1);
				}
				if (arg4 == 3) {
					this.method7937(32768, local9, local4);
					this.method7937(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method7937(66560, local9, local4);
					this.method7937(4096, local9 - 1, local4);
					this.method7937(16384, local9, local4 + 1);
				}
				if (arg4 == 1) {
					this.method7937(5120, local9, local4);
					this.method7937(16384, local9, local4 + 1);
					this.method7937(65536, local9 + 1, local4);
				}
				if (arg4 == 2) {
					this.method7937(20480, local9, local4);
					this.method7937(65536, local9 + 1, local4);
					this.method7937(1024, local9, local4 - 1);
				}
				if (arg4 == 3) {
					this.method7937(81920, local9, local4);
					this.method7937(1024, local9, local4 - 1);
					this.method7937(4096, local9 - 1, local4);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method7937(536870912, local9, local4);
				this.method7937(33554432, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method7937(8388608, local9, local4);
				this.method7937(134217728, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7937(33554432, local9, local4);
				this.method7937(536870912, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method7937(134217728, local9, local4);
				this.method7937(8388608, local9, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method7937(4194304, local9, local4);
				this.method7937(67108864, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method7937(16777216, local9, local4);
				this.method7937(268435456, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7937(67108864, local9, local4);
				this.method7937(4194304, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method7937(268435456, local9, local4);
				this.method7937(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method7937(545259520, local9, local4);
			this.method7937(33554432, local9 - 1, local4);
			this.method7937(134217728, local9, local4 + 1);
		}
		if (arg4 == 1) {
			this.method7937(41943040, local9, local4);
			this.method7937(134217728, local9, local4 + 1);
			this.method7937(536870912, local9 + 1, local4);
		}
		if (arg4 == 2) {
			this.method7937(167772160, local9, local4);
			this.method7937(536870912, local9 + 1, local4);
			this.method7937(8388608, local9, local4 - 1);
		}
		if (arg4 == 3) {
			this.method7937(671088640, local9, local4);
			this.method7937(8388608, local9, local4 - 1);
			this.method7937(33554432, local9 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZIIIIZI)V")
	public void method7928(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(32) int local32 = arg1 - this.anInt9338;
		@Pc(37) int local37 = arg3 - this.anInt9322;
		for (@Pc(39) int local39 = local32; local39 < arg2 + local32; local39++) {
			if (local39 >= 0 && local39 < this.anInt9334) {
				for (@Pc(56) int local56 = local37; local56 < local37 + arg4; local56++) {
					if (local56 >= 0 && local56 < this.anInt9331) {
						this.method7930(local7, local56, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
	public void method7929() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt9334; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt9331; local19++) {
				if (local15 == 0 || local19 == 0 || local15 >= this.anInt9334 - 5 || this.anInt9331 - 5 <= local19) {
					this.anIntArrayArray52[local15][local19] = -1;
				} else {
					this.anIntArrayArray52[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(IIII)V")
	private void method7930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray52[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method7931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg1 + arg6;
		@Pc(14) int local14 = arg0 + arg3;
		@Pc(18) int local18 = arg2 + arg8;
		@Pc(27) int local27 = arg5 + arg4;
		@Pc(44) int local44;
		@Pc(55) int local55;
		if (arg1 == local18 && (arg7 & 0x2) == 0) {
			local44 = arg4 < arg3 ? arg3 : arg4;
			local55 = local27 <= local14 ? local27 : local14;
			while (local55 > local44) {
				if ((this.anIntArrayArray52[local18 - this.anInt9338 - 1][local44 - this.anInt9322] & 0x8) == 0) {
					return true;
				}
				local44++;
			}
		} else if (local10 == arg2 && (arg7 & 0x8) == 0) {
			local44 = arg4 < arg3 ? arg3 : arg4;
			local55 = local27 > local14 ? local14 : local27;
			while (local55 > local44) {
				if ((this.anIntArrayArray52[arg2 - this.anInt9338][local44 - this.anInt9322] & 0x80) == 0) {
					return true;
				}
				local44++;
			}
		} else if (arg3 == local27 && (arg7 & 0x1) == 0) {
			local44 = arg2 < arg1 ? arg1 : arg2;
			local55 = local18 <= local10 ? local18 : local10;
			while (local44 < local55) {
				if ((this.anIntArrayArray52[local44 - this.anInt9338][local27 - this.anInt9322 - 1] & 0x2) == 0) {
					return true;
				}
				local44++;
			}
		} else if (local14 == arg4 && (arg7 & 0x4) == 0) {
			local44 = arg1 <= arg2 ? arg2 : arg1;
			local55 = local10 >= local18 ? local18 : local10;
			while (local55 > local44) {
				if ((this.anIntArrayArray52[local44 - this.anInt9338][arg4 - this.anInt9322] & 0x20) == 0) {
					return true;
				}
				local44++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIB)V")
	public void method7934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt9322;
		@Pc(19) int local19 = arg1 - this.anInt9338;
		this.anIntArrayArray52[local19][local14] |= 0x200000;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method7935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static53.method901(arg0, arg5, arg1, arg3, arg6, arg4, arg5, arg7) ? true : this.method7931(arg5, arg6, arg0, arg7, arg4, arg3, arg5, arg2, arg1);
		}
		@Pc(40) int local40 = arg0 + arg1 - 1;
		@Pc(46) int local46 = arg3 + arg4 - 1;
		if (arg6 >= arg0 && local40 >= arg6 && arg4 <= arg7 && local46 >= arg7) {
			return true;
		} else if (arg6 == arg0 - 1 && arg4 <= arg7 && arg7 <= local46 && (this.anIntArrayArray52[arg6 - this.anInt9338][arg7 - this.anInt9322] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg6 == local40 + 1 && arg4 <= arg7 && local46 >= arg7 && (this.anIntArrayArray52[arg6 - this.anInt9338][arg7 - this.anInt9322] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg7 == arg4 - 1 && arg0 <= arg6 && arg6 <= local40 && (this.anIntArrayArray52[arg6 - this.anInt9338][arg7 - this.anInt9322] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local46 + 1 && arg0 <= arg6 && arg6 <= local40 && (this.anIntArrayArray52[arg6 - this.anInt9338][arg7 - this.anInt9322] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V")
	public void method7936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt9338;
		@Pc(13) int local13 = arg1 - this.anInt9322;
		this.anIntArrayArray52[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(IIII)V")
	private void method7937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray52[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg3 && arg0 == arg1) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg6 + arg4 - 1 && arg1 <= arg1 && arg1 <= arg4 + arg1 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg6 - this.anInt9338;
		@Pc(58) int local58 = arg1 - this.anInt9322;
		@Pc(63) int local63 = arg3 - this.anInt9338;
		@Pc(68) int local68 = arg0 - this.anInt9322;
		if (arg4 == 1) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					if (local63 - 1 == local53 && local68 == local58) {
						return true;
					}
					if (local53 == local63 && local58 + 1 == local68 && (this.anIntArrayArray52[local53][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local63 && local68 == local58 - 1 && (this.anIntArrayArray52[local53][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local53 == local63 && local58 + 1 == local68) {
						return true;
					}
					if (local63 - 1 == local53 && local58 == local68 && (this.anIntArrayArray52[local53][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local53 && local68 == local58 && (this.anIntArrayArray52[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local53 == local63 + 1 && local68 == local58) {
						return true;
					}
					if (local63 == local53 && local68 == local58 + 1 && (this.anIntArrayArray52[local53][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local53 && local58 - 1 == local68 && (this.anIntArrayArray52[local53][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 == local53 && local68 == local58 - 1) {
						return true;
					}
					if (local53 == local63 - 1 && local68 == local58 && (this.anIntArrayArray52[local53][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local53 && local68 == local58 && (this.anIntArrayArray52[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					if (local53 == local63 - 1 && local68 == local58) {
						return true;
					}
					if (local53 == local63 && local68 == local58 + 1) {
						return true;
					}
					if (local53 == local63 + 1 && local58 == local68 && (this.anIntArrayArray52[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 == local63 && local68 == local58 - 1 && (this.anIntArrayArray52[local53][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local63 - 1 == local53 && local68 == local58 && (this.anIntArrayArray52[local53][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local53 && local58 + 1 == local68) {
						return true;
					}
					if (local63 + 1 == local53 && local68 == local58) {
						return true;
					}
					if (local53 == local63 && local68 == local58 - 1 && (this.anIntArrayArray52[local53][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local53 == local63 - 1 && local58 == local68 && (this.anIntArrayArray52[local53][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local63 && local68 == local58 + 1 && (this.anIntArrayArray52[local53][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local63 + 1 && local58 == local68) {
						return true;
					}
					if (local53 == local63 && local68 == local58 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local53 == local63 - 1 && local58 == local68) {
						return true;
					}
					if (local53 == local63 && local58 + 1 == local68 && (this.anIntArrayArray52[local53][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local63 + 1 && local68 == local58 && (this.anIntArrayArray52[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 == local63 && local68 == local58 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local63 == local53 && local58 + 1 == local68 && (this.anIntArrayArray52[local53][local68] & 0x20) == 0) {
					return true;
				}
				if (local53 == local63 && local68 == local58 - 1 && (this.anIntArrayArray52[local53][local68] & 0x2) == 0) {
					return true;
				}
				if (local63 - 1 == local53 && local68 == local58 && (this.anIntArrayArray52[local53][local68] & 0x8) == 0) {
					return true;
				}
				if (local63 + 1 == local53 && local58 == local68 && (this.anIntArrayArray52[local53][local68] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = arg4 + local53 - 1;
			@Pc(88) int local88 = arg4 + local68 - 1;
			if (arg2 == 0) {
				if (arg5 == 0) {
					if (local53 == local63 - arg4 && local58 >= local68 && local58 <= local88) {
						return true;
					}
					if (local53 <= local63 && local63 <= local82 && local68 == local58 + 1 && (this.anIntArrayArray52[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 >= local53 && local82 >= local63 && local58 - arg4 == local68 && (this.anIntArrayArray52[local63][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local53 <= local63 && local82 >= local63 && local58 + 1 == local68) {
						return true;
					}
					if (local63 - arg4 == local53 && local68 <= local58 && local58 <= local88 && (this.anIntArrayArray52[local82][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local53 && local58 >= local68 && local88 >= local58 && (this.anIntArrayArray52[local53][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local53 == local63 + 1 && local68 <= local58 && local58 <= local88) {
						return true;
					}
					if (local63 >= local53 && local63 <= local82 && local68 == local58 + 1 && (this.anIntArrayArray52[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 >= local53 && local82 >= local63 && local58 - arg4 == local68 && (this.anIntArrayArray52[local63][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 >= local53 && local63 <= local82 && local68 == local58 - arg4) {
						return true;
					}
					if (local63 - arg4 == local53 && local58 >= local68 && local88 >= local58 && (this.anIntArrayArray52[local82][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local53 && local58 >= local68 && local58 <= local88 && (this.anIntArrayArray52[local53][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					if (local53 == local63 - arg4 && local68 <= local58 && local58 <= local88) {
						return true;
					}
					if (local63 >= local53 && local63 <= local82 && local68 == local58 + 1) {
						return true;
					}
					if (local63 + 1 == local53 && local68 <= local58 && local58 <= local88 && (this.anIntArrayArray52[local53][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 >= local53 && local63 <= local82 && local68 == local58 - arg4 && (this.anIntArrayArray52[local63][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local53 == local63 - arg4 && local58 >= local68 && local58 <= local88 && (this.anIntArrayArray52[local82][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 <= local63 && local63 <= local82 && local58 + 1 == local68) {
						return true;
					}
					if (local63 + 1 == local53 && local68 <= local58 && local58 <= local88) {
						return true;
					}
					if (local53 <= local63 && local63 <= local82 && local58 - arg4 == local68 && (this.anIntArrayArray52[local63][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 - arg4 == local53 && local68 <= local58 && local58 <= local88 && (this.anIntArrayArray52[local82][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 <= local63 && local63 <= local82 && local58 + 1 == local68 && (this.anIntArrayArray52[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local63 + 1 && local68 <= local58 && local58 <= local88) {
						return true;
					}
					if (local63 >= local53 && local82 >= local63 && local58 - arg4 == local68) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 - arg4 == local53 && local68 <= local58 && local88 >= local58) {
						return true;
					}
					if (local63 >= local53 && local82 >= local63 && local68 == local58 + 1 && (this.anIntArrayArray52[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local63 + 1 && local68 <= local58 && local88 >= local58 && (this.anIntArrayArray52[local53][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 >= local53 && local82 >= local63 && local58 - arg4 == local68) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local63 >= local53 && local63 <= local82 && local58 + 1 == local68 && (this.anIntArrayArray52[local63][local68] & 0x2C0120) == 0) {
					return true;
				}
				if (local53 <= local63 && local82 >= local63 && local58 - arg4 == local68 && (this.anIntArrayArray52[local63][local88] & 0x2C0102) == 0) {
					return true;
				}
				if (local53 == local63 - arg4 && local58 >= local68 && local88 >= local58 && (this.anIntArrayArray52[local82][local58] & 0x2C0108) == 0) {
					return true;
				}
				if (local63 + 1 == local53 && local68 <= local58 && local88 >= local58 && (this.anIntArrayArray52[local53][local58] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(III)V")
	public void method7940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt9322;
		@Pc(13) int local13 = arg0 - this.anInt9338;
		this.anIntArrayArray52[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIZZI)V")
	public void method7941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = 256;
		if (arg5) {
			local11 = 131328;
		}
		@Pc(22) int local22 = arg6 - this.anInt9322;
		if (arg4) {
			local11 |= 0x40000000;
		}
		@Pc(40) int local40;
		if (arg2 == 1 || arg2 == 3) {
			local40 = arg1;
			arg1 = arg0;
			arg0 = local40;
		}
		@Pc(49) int local49 = arg3 - this.anInt9338;
		for (local40 = local49; local40 < local49 + arg1; local40++) {
			if (local40 >= 0 && this.anInt9334 > local40) {
				for (@Pc(61) int local61 = local22; local61 < arg0 + local22; local61++) {
					if (local61 >= 0 && local61 < this.anInt9331) {
						this.method7937(local11, local40, local61);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(III)V")
	public void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9338;
		@Pc(9) int local9 = arg1 - this.anInt9322;
		this.anIntArrayArray52[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIZIZI)V")
	public void method7944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt9322;
		@Pc(13) int local13 = arg0 - this.anInt9338;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7930(128, local4, local13);
				this.method7930(8, local4, local13 - 1);
			}
			if (arg5 == 1) {
				this.method7930(2, local4, local13);
				this.method7930(32, local4 + 1, local13);
			}
			if (arg5 == 2) {
				this.method7930(8, local4, local13);
				this.method7930(128, local4, local13 + 1);
			}
			if (arg5 == 3) {
				this.method7930(32, local4, local13);
				this.method7930(2, local4 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7930(1, local4, local13);
				this.method7930(16, local4 + 1, local13 + -1);
			}
			if (arg5 == 1) {
				this.method7930(4, local4, local13);
				this.method7930(64, local4 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method7930(16, local4, local13);
				this.method7930(1, local4 - 1, local13 + 1);
			}
			if (arg5 == 3) {
				this.method7930(64, local4, local13);
				this.method7930(4, local4 - 1, local13 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method7930(130, local4, local13);
				this.method7930(8, local4, local13 - 1);
				this.method7930(32, local4 + 1, local13);
			}
			if (arg5 == 1) {
				this.method7930(10, local4, local13);
				this.method7930(32, local4 + 1, local13);
				this.method7930(128, local4, local13 + 1);
			}
			if (arg5 == 2) {
				this.method7930(40, local4, local13);
				this.method7930(128, local4, local13 + 1);
				this.method7930(2, local4 - 1, local13);
			}
			if (arg5 == 3) {
				this.method7930(160, local4, local13);
				this.method7930(2, local4 - 1, local13);
				this.method7930(8, local4, local13 - 1);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method7930(65536, local4, local13);
					this.method7930(4096, local4, local13 - 1);
				}
				if (arg5 == 1) {
					this.method7930(1024, local4, local13);
					this.method7930(16384, local4 + 1, local13);
				}
				if (arg5 == 2) {
					this.method7930(4096, local4, local13);
					this.method7930(65536, local4, local13 + 1);
				}
				if (arg5 == 3) {
					this.method7930(16384, local4, local13);
					this.method7930(1024, local4 - 1, local13);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method7930(512, local4, local13);
					this.method7930(8192, local4 + 1, local13 + -1);
				}
				if (arg5 == 1) {
					this.method7930(2048, local4, local13);
					this.method7930(32768, local4 + 1, local13 + 1);
				}
				if (arg5 == 2) {
					this.method7930(8192, local4, local13);
					this.method7930(512, local4 - 1, local13 - -1);
				}
				if (arg5 == 3) {
					this.method7930(32768, local4, local13);
					this.method7930(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method7930(66560, local4, local13);
					this.method7930(4096, local4, local13 - 1);
					this.method7930(16384, local4 + 1, local13);
				}
				if (arg5 == 1) {
					this.method7930(5120, local4, local13);
					this.method7930(16384, local4 + 1, local13);
					this.method7930(65536, local4, local13 + 1);
				}
				if (arg5 == 2) {
					this.method7930(20480, local4, local13);
					this.method7930(65536, local4, local13 + 1);
					this.method7930(1024, local4 - 1, local13);
				}
				if (arg5 == 3) {
					this.method7930(81920, local4, local13);
					this.method7930(1024, local4 - 1, local13);
					this.method7930(4096, local4, local13 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method7930(536870912, local4, local13);
				this.method7930(33554432, local4, local13 - 1);
			}
			if (arg5 == 1) {
				this.method7930(8388608, local4, local13);
				this.method7930(134217728, local4 + 1, local13);
			}
			if (arg5 == 2) {
				this.method7930(33554432, local4, local13);
				this.method7930(536870912, local4, local13 + 1);
			}
			if (arg5 == 3) {
				this.method7930(134217728, local4, local13);
				this.method7930(8388608, local4 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method7930(4194304, local4, local13);
				this.method7930(67108864, local4 + 1, local13 - 1);
			}
			if (arg5 == 1) {
				this.method7930(16777216, local4, local13);
				this.method7930(268435456, local4 + 1, local13 - -1);
			}
			if (arg5 == 2) {
				this.method7930(67108864, local4, local13);
				this.method7930(4194304, local4 - 1, local13 + 1);
			}
			if (arg5 == 3) {
				this.method7930(268435456, local4, local13);
				this.method7930(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method7930(545259520, local4, local13);
			this.method7930(33554432, local4, local13 - 1);
			this.method7930(134217728, local4 + 1, local13);
		}
		if (arg5 == 1) {
			this.method7930(41943040, local4, local13);
			this.method7930(134217728, local4 + 1, local13);
			this.method7930(536870912, local4, local13 + 1);
		}
		if (arg5 == 2) {
			this.method7930(167772160, local4, local13);
			this.method7930(536870912, local4, local13 + 1);
			this.method7930(8388608, local4 - 1, local13);
		}
		if (arg5 == 3) {
			this.method7930(671088640, local4, local13);
			this.method7930(8388608, local4 - 1, local13);
			this.method7930(33554432, local4, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method7945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg2 && arg5 == arg1) {
				return true;
			}
		} else if (arg2 <= arg4 && arg4 <= arg0 + arg2 - 1 && arg1 >= arg1 && arg1 <= arg0 + arg1 - 1) {
			return true;
		}
		@Pc(41) int local41 = arg1 - this.anInt9322;
		@Pc(46) int local46 = arg2 - this.anInt9338;
		@Pc(51) int local51 = arg4 - this.anInt9338;
		@Pc(56) int local56 = arg5 - this.anInt9322;
		if (arg0 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local51 + 1 == local46 && local41 == local56 && (this.anIntArrayArray52[local46][local56] & 0x80) == 0) {
						return true;
					}
					if (local46 == local51 && local56 == local41 - 1 && (this.anIntArrayArray52[local46][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local51 - 1 == local46 && local41 == local56 && (this.anIntArrayArray52[local46][local56] & 0x8) == 0) {
						return true;
					}
					if (local51 == local46 && local41 - 1 == local56 && (this.anIntArrayArray52[local46][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local51 - 1 == local46 && local56 == local41 && (this.anIntArrayArray52[local46][local56] & 0x8) == 0) {
						return true;
					}
					if (local46 == local51 && local41 + 1 == local56 && (this.anIntArrayArray52[local46][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local51 + 1 == local46 && local41 == local56 && (this.anIntArrayArray52[local46][local56] & 0x80) == 0) {
						return true;
					}
					if (local46 == local51 && local56 == local41 + 1 && (this.anIntArrayArray52[local46][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local51 == local46 && local41 + 1 == local56 && (this.anIntArrayArray52[local46][local56] & 0x20) == 0) {
					return true;
				}
				if (local46 == local51 && local56 == local41 - 1 && (this.anIntArrayArray52[local46][local56] & 0x2) == 0) {
					return true;
				}
				if (local46 == local51 - 1 && local56 == local41 && (this.anIntArrayArray52[local46][local56] & 0x8) == 0) {
					return true;
				}
				if (local51 + 1 == local46 && local41 == local56 && (this.anIntArrayArray52[local46][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(417) int local417 = local46 + arg0 - 1;
			@Pc(424) int local424 = local56 + arg0 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local51 + 1 == local46 && local56 <= local41 && local424 >= local41 && (this.anIntArrayArray52[local46][local41] & 0x80) == 0) {
						return true;
					}
					if (local51 >= local46 && local51 <= local417 && local41 - arg0 == local56 && (this.anIntArrayArray52[local51][local424] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local51 - arg0 == local46 && local56 <= local41 && local41 <= local424 && (this.anIntArrayArray52[local417][local41] & 0x8) == 0) {
						return true;
					}
					if (local51 >= local46 && local417 >= local51 && local56 == local41 - arg0 && (this.anIntArrayArray52[local51][local424] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local51 - arg0 == local46 && local41 >= local56 && local41 <= local424 && (this.anIntArrayArray52[local417][local41] & 0x8) == 0) {
						return true;
					}
					if (local51 >= local46 && local51 <= local417 && local56 == local41 + 1 && (this.anIntArrayArray52[local51][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local51 + 1 == local46 && local41 >= local56 && local424 >= local41 && (this.anIntArrayArray52[local46][local41] & 0x80) == 0) {
						return true;
					}
					if (local51 >= local46 && local417 >= local51 && local41 + 1 == local56 && (this.anIntArrayArray52[local51][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local46 <= local51 && local417 >= local51 && local56 == local41 + 1 && (this.anIntArrayArray52[local51][local56] & 0x20) == 0) {
					return true;
				}
				if (local46 <= local51 && local417 >= local51 && local41 - arg0 == local56 && (this.anIntArrayArray52[local51][local424] & 0x2) == 0) {
					return true;
				}
				if (local46 == local51 - arg0 && local41 >= local56 && local41 <= local424 && (this.anIntArrayArray52[local417][local41] & 0x8) == 0) {
					return true;
				}
				if (local51 + 1 == local46 && local41 >= local56 && local424 >= local41 && (this.anIntArrayArray52[local46][local41] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}

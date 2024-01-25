import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class91 {

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public int anInt2685;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
	public int anInt2692;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	public int anInt2693;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	public void method2589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2692;
		@Pc(14) int local14 = arg1 - this.anInt2685;
		this.anIntArrayArray27[local4][local14] |= 0x200000;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIZII)V")
	public void method2590(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt2692;
		@Pc(9) int local9 = arg2 - this.anInt2685;
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method2603(local9, 128, local4);
				this.method2603(local9, 8, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2603(local9, 2, local4);
				this.method2603(local9 + 1, 32, local4);
			}
			if (arg5 == 2) {
				this.method2603(local9, 8, local4);
				this.method2603(local9, 128, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2603(local9, 32, local4);
				this.method2603(local9 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method2603(local9, 1, local4);
				this.method2603(local9 + 1, 16, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2603(local9, 4, local4);
				this.method2603(local9 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2603(local9, 16, local4);
				this.method2603(local9 - 1, 1, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2603(local9, 64, local4);
				this.method2603(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				this.method2603(local9, 130, local4);
				this.method2603(local9, 8, local4 - 1);
				this.method2603(local9 + 1, 32, local4);
			}
			if (arg5 == 1) {
				this.method2603(local9, 10, local4);
				this.method2603(local9 + 1, 32, local4);
				this.method2603(local9, 128, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2603(local9, 40, local4);
				this.method2603(local9, 128, local4 + 1);
				this.method2603(local9 - 1, 2, local4);
			}
			if (arg5 == 3) {
				this.method2603(local9, 160, local4);
				this.method2603(local9 - 1, 2, local4);
				this.method2603(local9, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method2603(local9, 65536, local4);
					this.method2603(local9, 4096, local4 - 1);
				}
				if (arg5 == 1) {
					this.method2603(local9, 1024, local4);
					this.method2603(local9 + 1, 16384, local4);
				}
				if (arg5 == 2) {
					this.method2603(local9, 4096, local4);
					this.method2603(local9, 65536, local4 + 1);
				}
				if (arg5 == 3) {
					this.method2603(local9, 16384, local4);
					this.method2603(local9 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method2603(local9, 512, local4);
					this.method2603(local9 + 1, 8192, local4 - 1);
				}
				if (arg5 == 1) {
					this.method2603(local9, 2048, local4);
					this.method2603(local9 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method2603(local9, 8192, local4);
					this.method2603(local9 - 1, 512, local4 + 1);
				}
				if (arg5 == 3) {
					this.method2603(local9, 32768, local4);
					this.method2603(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method2603(local9, 66560, local4);
					this.method2603(local9, 4096, local4 - 1);
					this.method2603(local9 + 1, 16384, local4);
				}
				if (arg5 == 1) {
					this.method2603(local9, 5120, local4);
					this.method2603(local9 + 1, 16384, local4);
					this.method2603(local9, 65536, local4 + 1);
				}
				if (arg5 == 2) {
					this.method2603(local9, 20480, local4);
					this.method2603(local9, 65536, local4 + 1);
					this.method2603(local9 - 1, 1024, local4);
				}
				if (arg5 == 3) {
					this.method2603(local9, 81920, local4);
					this.method2603(local9 - 1, 1024, local4);
					this.method2603(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method2603(local9, 536870912, local4);
				this.method2603(local9, 33554432, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2603(local9, 8388608, local4);
				this.method2603(local9 + 1, 134217728, local4);
			}
			if (arg5 == 2) {
				this.method2603(local9, 33554432, local4);
				this.method2603(local9, 536870912, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2603(local9, 134217728, local4);
				this.method2603(local9 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method2603(local9, 4194304, local4);
				this.method2603(local9 + 1, 67108864, local4 - 1);
			}
			if (arg5 == 1) {
				this.method2603(local9, 16777216, local4);
				this.method2603(local9 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2603(local9, 67108864, local4);
				this.method2603(local9 - 1, 4194304, local4 + 1);
			}
			if (arg5 == 3) {
				this.method2603(local9, 268435456, local4);
				this.method2603(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2603(local9, 545259520, local4);
			this.method2603(local9, 33554432, local4 - 1);
			this.method2603(local9 + 1, 134217728, local4);
		}
		if (arg5 == 1) {
			this.method2603(local9, 41943040, local4);
			this.method2603(local9 + 1, 134217728, local4);
			this.method2603(local9, 536870912, local4 + 1);
		}
		if (arg5 == 2) {
			this.method2603(local9, 167772160, local4);
			this.method2603(local9, 536870912, local4 + 1);
			this.method2603(local9 - 1, 8388608, local4);
		}
		if (arg5 == 3) {
			this.method2603(local9, 671088640, local4);
			this.method2603(local9 - 1, 8388608, local4);
			this.method2603(local9, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
	public void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2692;
		@Pc(13) int local13 = arg0 - this.anInt2685;
		this.anIntArrayArray27[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	public void method2592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2685;
		@Pc(22) int local22 = arg1 - this.anInt2692;
		this.anIntArrayArray27[local22][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public void method2594() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2693; local3++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt2680; local13++) {
				if (local3 == 0 || local13 == 0 || local3 >= this.anInt2693 - 5 || this.anInt2680 - 5 <= local13) {
					this.anIntArrayArray27[local3][local13] = -1;
				} else {
					this.anIntArrayArray27[local3][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static69.method1393(arg3, arg0, arg7, arg5, arg1, arg6, arg2, arg5) ? true : this.method2596(arg0, arg6, arg5, arg1, arg2, arg5, arg4, arg3, arg7);
		}
		@Pc(54) int local54 = arg6 + arg3 - 1;
		@Pc(60) int local60 = arg7 + arg1 - 1;
		if (arg6 <= arg0 && arg0 <= local54 && arg7 <= arg2 && local60 >= arg2) {
			return true;
		} else if (arg0 == arg6 - 1 && arg7 <= arg2 && local60 >= arg2 && (this.anIntArrayArray27[arg0 - this.anInt2692][arg2 - this.anInt2685] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local54 + 1 == arg0 && arg2 >= arg7 && arg2 <= local60 && (this.anIntArrayArray27[arg0 - this.anInt2692][arg2 - this.anInt2685] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg2 && arg0 >= arg6 && local54 >= arg0 && (this.anIntArrayArray27[arg0 - this.anInt2692][arg2 - this.anInt2685] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local60 + 1 && arg6 <= arg0 && arg0 <= local54 && (this.anIntArrayArray27[arg0 - this.anInt2692][arg2 - this.anInt2685] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIIZ)Z")
	public boolean method2596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(15) int local15 = arg0 + arg2;
		@Pc(19) int local19 = arg5 + arg4;
		@Pc(23) int local23 = arg7 + arg1;
		@Pc(28) int local28 = arg8 + arg3;
		@Pc(53) int local53;
		@Pc(60) int local60;
		if (local23 == arg0 && (arg6 & 0x2) == 0) {
			local53 = arg8 < arg4 ? arg4 : arg8;
			local60 = local28 > local19 ? local19 : local28;
			while (local53 < local60) {
				if ((this.anIntArrayArray27[local23 - this.anInt2692 - 1][local53 - this.anInt2685] & 0x8) == 0) {
					return true;
				}
				local53++;
			}
		} else if (arg1 == local15 && (arg6 & 0x8) == 0) {
			local53 = arg4 <= arg8 ? arg8 : arg4;
			local60 = local28 <= local19 ? local28 : local19;
			while (local60 > local53) {
				if ((this.anIntArrayArray27[arg1 - this.anInt2692][local53 - this.anInt2685] & 0x80) == 0) {
					return true;
				}
				local53++;
			}
		} else if (arg4 == local28 && (arg6 & 0x1) == 0) {
			local53 = arg1 < arg0 ? arg0 : arg1;
			local60 = local23 <= local15 ? local23 : local15;
			while (local60 > local53) {
				if ((this.anIntArrayArray27[local53 - this.anInt2692][local28 - this.anInt2685 - 1] & 0x2) == 0) {
					return true;
				}
				local53++;
			}
		} else if (local19 == arg8 && (arg6 & 0x4) == 0) {
			local53 = arg0 > arg1 ? arg0 : arg1;
			local60 = local23 <= local15 ? local23 : local15;
			while (local60 > local53) {
				if ((this.anIntArrayArray27[local53 - this.anInt2692][arg8 - this.anInt2685] & 0x20) == 0) {
					return true;
				}
				local53++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)V")
	public void method2599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2685;
		@Pc(27) int local27 = arg1 - this.anInt2692;
		this.anIntArrayArray27[local27][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
	private void method2600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIIZII)V")
	public void method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt2692;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(36) int local36;
		if (arg5 == 1 || arg5 == 3) {
			local36 = arg1;
			arg1 = arg3;
			arg3 = local36;
		}
		@Pc(45) int local45 = arg6 - this.anInt2685;
		for (local36 = local18; local36 < arg1 + local18; local36++) {
			if (local36 >= 0 && local36 < this.anInt2693) {
				for (@Pc(66) int local66 = local45; local66 < local45 + arg3; local66++) {
					if (local66 >= 0 && this.anInt2680 > local66) {
						this.method2603(local66, local7, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)V")
	private void method2603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg6 == arg3 && arg1 == arg4) {
				return true;
			}
		} else if (arg6 <= arg3 && arg3 <= arg0 + arg6 - 1 && arg4 <= arg4 && arg4 <= arg0 + arg4 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg4 - this.anInt2685;
		@Pc(58) int local58 = arg6 - this.anInt2692;
		@Pc(63) int local63 = arg1 - this.anInt2685;
		@Pc(68) int local68 = arg3 - this.anInt2692;
		if (arg0 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local58 == local68 + 1 && local63 == local53 && (this.anIntArrayArray27[local58][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local53 - 1 && (this.anIntArrayArray27[local58][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 == local68 - 1 && local63 == local53 && (this.anIntArrayArray27[local58][local63] & 0x8) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local53 - 1 && (this.anIntArrayArray27[local58][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 == local68 - 1 && local53 == local63 && (this.anIntArrayArray27[local58][local63] & 0x8) == 0) {
						return true;
					}
					if (local68 == local58 && local53 + 1 == local63 && (this.anIntArrayArray27[local58][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local58 == local68 + 1 && local63 == local53 && (this.anIntArrayArray27[local58][local63] & 0x80) == 0) {
						return true;
					}
					if (local68 == local58 && local63 == local53 + 1 && (this.anIntArrayArray27[local58][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local68 == local58 && local53 + 1 == local63 && (this.anIntArrayArray27[local58][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local58 && local63 == local53 - 1 && (this.anIntArrayArray27[local58][local63] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local58 && local63 == local53 && (this.anIntArrayArray27[local58][local63] & 0x8) == 0) {
					return true;
				}
				if (local58 == local68 + 1 && local63 == local53 && (this.anIntArrayArray27[local58][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(411) int local411 = local58 + arg0 - 1;
			@Pc(418) int local418 = local63 + arg0 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local68 + 1 == local58 && local53 >= local63 && local53 <= local418 && (this.anIntArrayArray27[local58][local53] & 0x80) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local411 && local53 - arg0 == local63 && (this.anIntArrayArray27[local68][local418] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 == local68 - arg0 && local53 >= local63 && local418 >= local53 && (this.anIntArrayArray27[local411][local53] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local411 && local53 - arg0 == local63 && (this.anIntArrayArray27[local68][local418] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 == local68 - arg0 && local53 >= local63 && local418 >= local53 && (this.anIntArrayArray27[local411][local53] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local68 && local411 >= local68 && local63 == local53 + 1 && (this.anIntArrayArray27[local68][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local68 + 1 == local58 && local63 <= local53 && local418 >= local53 && (this.anIntArrayArray27[local58][local53] & 0x80) == 0) {
						return true;
					}
					if (local58 <= local68 && local411 >= local68 && local63 == local53 + 1 && (this.anIntArrayArray27[local68][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local58 <= local68 && local68 <= local411 && local53 + 1 == local63 && (this.anIntArrayArray27[local68][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 >= local58 && local68 <= local411 && local53 - arg0 == local63 && (this.anIntArrayArray27[local68][local418] & 0x2) == 0) {
					return true;
				}
				if (local58 == local68 - arg0 && local53 >= local63 && local418 >= local53 && (this.anIntArrayArray27[local411][local53] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local58 && local53 >= local63 && local418 >= local53 && (this.anIntArrayArray27[local58][local53] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BZZIIII)V")
	public void method2606(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(22) int local22 = arg3 - this.anInt2692;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(33) int local33 = arg5 - this.anInt2685;
		for (@Pc(35) int local35 = local22; local35 < arg4 + local22; local35++) {
			if (local35 >= 0 && this.anInt2693 > local35) {
				for (@Pc(49) int local49 = local33; local49 < local33 + arg2; local49++) {
					if (local49 >= 0 && this.anInt2680 > local49) {
						this.method2600(local7, local35, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg6 == arg3 && arg0 == arg2) {
				return true;
			}
		} else if (arg6 >= arg3 && arg5 + arg3 - 1 >= arg6 && arg2 >= arg2 && arg2 <= arg5 + arg2 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg0 - this.anInt2685;
		@Pc(64) int local64 = arg3 - this.anInt2692;
		@Pc(69) int local69 = arg2 - this.anInt2685;
		@Pc(74) int local74 = arg6 - this.anInt2692;
		if (arg5 == 1) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local64 == local74 - 1 && local69 == local59) {
						return true;
					}
					if (local74 == local64 && local59 == local69 + 1 && (this.anIntArrayArray27[local64][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 && local69 - 1 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 == local74 && local59 == local69 + 1) {
						return true;
					}
					if (local64 == local74 - 1 && local59 == local69 && (this.anIntArrayArray27[local64][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local59 == local69 && (this.anIntArrayArray27[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 + 1 == local64 && local59 == local69) {
						return true;
					}
					if (local64 == local74 && local59 == local69 + 1 && (this.anIntArrayArray27[local64][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 && local59 == local69 - 1 && (this.anIntArrayArray27[local64][local59] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local74 == local64 && local69 - 1 == local59) {
						return true;
					}
					if (local74 - 1 == local64 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local74 - 1 == local64 && local59 == local69) {
						return true;
					}
					if (local64 == local74 && local59 == local69 + 1) {
						return true;
					}
					if (local64 == local74 + 1 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local74 && local59 == local69 - 1 && (this.anIntArrayArray27[local64][local59] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 == local74 - 1 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local64 && local59 == local69 + 1) {
						return true;
					}
					if (local74 + 1 == local64 && local69 == local59) {
						return true;
					}
					if (local74 == local64 && local59 == local69 - 1 && (this.anIntArrayArray27[local64][local59] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 - 1 == local64 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local74 && local59 == local69 + 1 && (this.anIntArrayArray27[local64][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local59 == local69) {
						return true;
					}
					if (local74 == local64 && local59 == local69 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 == local74 - 1 && local69 == local59) {
						return true;
					}
					if (local64 == local74 && local69 + 1 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local64 && local59 == local69 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local64 == local74 && local69 + 1 == local59 && (this.anIntArrayArray27[local64][local59] & 0x20) == 0) {
					return true;
				}
				if (local74 == local64 && local59 == local69 - 1 && (this.anIntArrayArray27[local64][local59] & 0x2) == 0) {
					return true;
				}
				if (local74 - 1 == local64 && local69 == local59 && (this.anIntArrayArray27[local64][local59] & 0x8) == 0) {
					return true;
				}
				if (local74 + 1 == local64 && local59 == local69 && (this.anIntArrayArray27[local64][local59] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(769) int local769 = local64 + arg5 - 1;
			@Pc(775) int local775 = arg5 + local59 - 1;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local64 == local74 - arg5 && local59 <= local69 && local69 <= local775) {
						return true;
					}
					if (local74 >= local64 && local74 <= local769 && local69 + 1 == local59 && (this.anIntArrayArray27[local74][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local74 && local769 >= local74 && local69 - arg5 == local59 && (this.anIntArrayArray27[local74][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local74 >= local64 && local769 >= local74 && local59 == local69 + 1) {
						return true;
					}
					if (local64 == local74 - arg5 && local69 >= local59 && local69 <= local775 && (this.anIntArrayArray27[local769][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local69 >= local59 && local69 <= local775 && (this.anIntArrayArray27[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 + 1 == local64 && local59 <= local69 && local69 <= local775) {
						return true;
					}
					if (local74 >= local64 && local769 >= local74 && local59 == local69 + 1 && (this.anIntArrayArray27[local74][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local74 && local74 <= local769 && local69 - arg5 == local59 && (this.anIntArrayArray27[local74][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local74 >= local64 && local74 <= local769 && local69 - arg5 == local59) {
						return true;
					}
					if (local64 == local74 - arg5 && local59 <= local69 && local69 <= local775 && (this.anIntArrayArray27[local769][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local64 && local59 <= local69 && local69 <= local775 && (this.anIntArrayArray27[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local64 == local74 - arg5 && local69 >= local59 && local775 >= local69) {
						return true;
					}
					if (local64 <= local74 && local769 >= local74 && local69 + 1 == local59) {
						return true;
					}
					if (local64 == local74 + 1 && local59 <= local69 && local69 <= local775 && (this.anIntArrayArray27[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 <= local74 && local769 >= local74 && local69 - arg5 == local59 && (this.anIntArrayArray27[local74][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local74 - arg5 == local64 && local69 >= local59 && local69 <= local775 && (this.anIntArrayArray27[local769][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 >= local64 && local74 <= local769 && local69 + 1 == local59) {
						return true;
					}
					if (local64 == local74 + 1 && local69 >= local59 && local69 <= local775) {
						return true;
					}
					if (local64 <= local74 && local769 >= local74 && local69 - arg5 == local59 && (this.anIntArrayArray27[local74][local775] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 - arg5 == local64 && local69 >= local59 && local775 >= local69 && (this.anIntArrayArray27[local769][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local74 && local769 >= local74 && local59 == local69 + 1 && (this.anIntArrayArray27[local74][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local69 >= local59 && local775 >= local69) {
						return true;
					}
					if (local74 >= local64 && local74 <= local769 && local59 == local69 - arg5) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local74 - arg5 == local64 && local59 <= local69 && local775 >= local69) {
						return true;
					}
					if (local74 >= local64 && local769 >= local74 && local69 + 1 == local59 && (this.anIntArrayArray27[local74][local59] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 + 1 && local59 <= local69 && local69 <= local775 && (this.anIntArrayArray27[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 <= local74 && local74 <= local769 && local59 == local69 - arg5) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local64 <= local74 && local74 <= local769 && local59 == local69 + 1 && (this.anIntArrayArray27[local74][local59] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 <= local74 && local74 <= local769 && local59 == local69 - arg5 && (this.anIntArrayArray27[local74][local775] & 0x2C0102) == 0) {
					return true;
				}
				if (local74 - arg5 == local64 && local59 <= local69 && local69 <= local775 && (this.anIntArrayArray27[local769][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 == local74 + 1 && local59 <= local69 && local69 <= local775 && (this.anIntArrayArray27[local64][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIIIZ)V")
	public void method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt2692;
		@Pc(13) int local13 = arg1 - this.anInt2685;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method2600(128, local4, local13);
				this.method2600(8, local4 - 1, local13);
			}
			if (arg3 == 1) {
				this.method2600(2, local4, local13);
				this.method2600(32, local4, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2600(8, local4, local13);
				this.method2600(128, local4 + 1, local13);
			}
			if (arg3 == 3) {
				this.method2600(32, local4, local13);
				this.method2600(2, local4, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method2600(1, local4, local13);
				this.method2600(16, local4 - 1, local13 + 1);
			}
			if (arg3 == 1) {
				this.method2600(4, local4, local13);
				this.method2600(64, local4 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2600(16, local4, local13);
				this.method2600(1, local4 + 1, local13 + -1);
			}
			if (arg3 == 3) {
				this.method2600(64, local4, local13);
				this.method2600(4, local4 - 1, local13 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method2600(130, local4, local13);
				this.method2600(8, local4 - 1, local13);
				this.method2600(32, local4, local13 + 1);
			}
			if (arg3 == 1) {
				this.method2600(10, local4, local13);
				this.method2600(32, local4, local13 + 1);
				this.method2600(128, local4 + 1, local13);
			}
			if (arg3 == 2) {
				this.method2600(40, local4, local13);
				this.method2600(128, local4 + 1, local13);
				this.method2600(2, local4, local13 - 1);
			}
			if (arg3 == 3) {
				this.method2600(160, local4, local13);
				this.method2600(2, local4, local13 - 1);
				this.method2600(8, local4 - 1, local13);
			}
		}
		if (arg5) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method2600(65536, local4, local13);
					this.method2600(4096, local4 - 1, local13);
				}
				if (arg3 == 1) {
					this.method2600(1024, local4, local13);
					this.method2600(16384, local4, local13 + 1);
				}
				if (arg3 == 2) {
					this.method2600(4096, local4, local13);
					this.method2600(65536, local4 + 1, local13);
				}
				if (arg3 == 3) {
					this.method2600(16384, local4, local13);
					this.method2600(1024, local4, local13 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method2600(512, local4, local13);
					this.method2600(8192, local4 - 1, local13 - -1);
				}
				if (arg3 == 1) {
					this.method2600(2048, local4, local13);
					this.method2600(32768, local4 + 1, local13 + 1);
				}
				if (arg3 == 2) {
					this.method2600(8192, local4, local13);
					this.method2600(512, local4 + 1, local13 - 1);
				}
				if (arg3 == 3) {
					this.method2600(32768, local4, local13);
					this.method2600(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method2600(66560, local4, local13);
					this.method2600(4096, local4 - 1, local13);
					this.method2600(16384, local4, local13 + 1);
				}
				if (arg3 == 1) {
					this.method2600(5120, local4, local13);
					this.method2600(16384, local4, local13 + 1);
					this.method2600(65536, local4 + 1, local13);
				}
				if (arg3 == 2) {
					this.method2600(20480, local4, local13);
					this.method2600(65536, local4 + 1, local13);
					this.method2600(1024, local4, local13 - 1);
				}
				if (arg3 == 3) {
					this.method2600(81920, local4, local13);
					this.method2600(1024, local4, local13 - 1);
					this.method2600(4096, local4 - 1, local13);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method2600(536870912, local4, local13);
				this.method2600(33554432, local4 - 1, local13);
			}
			if (arg3 == 1) {
				this.method2600(8388608, local4, local13);
				this.method2600(134217728, local4, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2600(33554432, local4, local13);
				this.method2600(536870912, local4 + 1, local13);
			}
			if (arg3 == 3) {
				this.method2600(134217728, local4, local13);
				this.method2600(8388608, local4, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method2600(4194304, local4, local13);
				this.method2600(67108864, local4 - 1, local13 - -1);
			}
			if (arg3 == 1) {
				this.method2600(16777216, local4, local13);
				this.method2600(268435456, local4 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2600(67108864, local4, local13);
				this.method2600(4194304, local4 + 1, local13 - 1);
			}
			if (arg3 == 3) {
				this.method2600(268435456, local4, local13);
				this.method2600(16777216, local4 - 1, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2600(545259520, local4, local13);
			this.method2600(33554432, local4 - 1, local13);
			this.method2600(134217728, local4, local13 + 1);
		}
		if (arg3 == 1) {
			this.method2600(41943040, local4, local13);
			this.method2600(134217728, local4, local13 + 1);
			this.method2600(536870912, local4 + 1, local13);
		}
		if (arg3 == 2) {
			this.method2600(167772160, local4, local13);
			this.method2600(536870912, local4 + 1, local13);
			this.method2600(8388608, local4, local13 - 1);
		}
		if (arg3 == 3) {
			this.method2600(671088640, local4, local13);
			this.method2600(8388608, local4, local13 - 1);
			this.method2600(33554432, local4 - 1, local13);
			return;
		}
	}
}

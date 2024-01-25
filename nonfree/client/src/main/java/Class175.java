import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class175 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public int anInt4861;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public int anInt4866;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public int anInt4867;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	public int anInt4875;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
	private void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray48[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZIIZ)V")
	public void method4285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg3 - this.anInt4875;
		@Pc(13) int local13 = arg1 - this.anInt4866;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4288(local13, 128, local8);
				this.method4288(local13, 8, local8 - 1);
			}
			if (arg0 == 1) {
				this.method4288(local13, 2, local8);
				this.method4288(local13 + 1, 32, local8);
			}
			if (arg0 == 2) {
				this.method4288(local13, 8, local8);
				this.method4288(local13, 128, local8 + 1);
			}
			if (arg0 == 3) {
				this.method4288(local13, 32, local8);
				this.method4288(local13 - 1, 2, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4288(local13, 1, local8);
				this.method4288(local13 + 1, 16, local8 - 1);
			}
			if (arg0 == 1) {
				this.method4288(local13, 4, local8);
				this.method4288(local13 + 1, 64, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4288(local13, 16, local8);
				this.method4288(local13 - 1, 1, local8 + 1);
			}
			if (arg0 == 3) {
				this.method4288(local13, 64, local8);
				this.method4288(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method4288(local13, 130, local8);
				this.method4288(local13, 8, local8 - 1);
				this.method4288(local13 + 1, 32, local8);
			}
			if (arg0 == 1) {
				this.method4288(local13, 10, local8);
				this.method4288(local13 + 1, 32, local8);
				this.method4288(local13, 128, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4288(local13, 40, local8);
				this.method4288(local13, 128, local8 + 1);
				this.method4288(local13 - 1, 2, local8);
			}
			if (arg0 == 3) {
				this.method4288(local13, 160, local8);
				this.method4288(local13 - 1, 2, local8);
				this.method4288(local13, 8, local8 - 1);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method4288(local13, 65536, local8);
					this.method4288(local13, 4096, local8 - 1);
				}
				if (arg0 == 1) {
					this.method4288(local13, 1024, local8);
					this.method4288(local13 + 1, 16384, local8);
				}
				if (arg0 == 2) {
					this.method4288(local13, 4096, local8);
					this.method4288(local13, 65536, local8 + 1);
				}
				if (arg0 == 3) {
					this.method4288(local13, 16384, local8);
					this.method4288(local13 - 1, 1024, local8);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method4288(local13, 512, local8);
					this.method4288(local13 + 1, 8192, local8 - 1);
				}
				if (arg0 == 1) {
					this.method4288(local13, 2048, local8);
					this.method4288(local13 + 1, 32768, local8 + 1);
				}
				if (arg0 == 2) {
					this.method4288(local13, 8192, local8);
					this.method4288(local13 - 1, 512, local8 + 1);
				}
				if (arg0 == 3) {
					this.method4288(local13, 32768, local8);
					this.method4288(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method4288(local13, 66560, local8);
					this.method4288(local13, 4096, local8 - 1);
					this.method4288(local13 + 1, 16384, local8);
				}
				if (arg0 == 1) {
					this.method4288(local13, 5120, local8);
					this.method4288(local13 + 1, 16384, local8);
					this.method4288(local13, 65536, local8 + 1);
				}
				if (arg0 == 2) {
					this.method4288(local13, 20480, local8);
					this.method4288(local13, 65536, local8 + 1);
					this.method4288(local13 - 1, 1024, local8);
				}
				if (arg0 == 3) {
					this.method4288(local13, 81920, local8);
					this.method4288(local13 - 1, 1024, local8);
					this.method4288(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4288(local13, 536870912, local8);
				this.method4288(local13, 33554432, local8 - 1);
			}
			if (arg0 == 1) {
				this.method4288(local13, 8388608, local8);
				this.method4288(local13 + 1, 134217728, local8);
			}
			if (arg0 == 2) {
				this.method4288(local13, 33554432, local8);
				this.method4288(local13, 536870912, local8 + 1);
			}
			if (arg0 == 3) {
				this.method4288(local13, 134217728, local8);
				this.method4288(local13 - 1, 8388608, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4288(local13, 4194304, local8);
				this.method4288(local13 + 1, 67108864, local8 - 1);
			}
			if (arg0 == 1) {
				this.method4288(local13, 16777216, local8);
				this.method4288(local13 + 1, 268435456, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4288(local13, 67108864, local8);
				this.method4288(local13 - 1, 4194304, local8 + 1);
			}
			if (arg0 == 3) {
				this.method4288(local13, 268435456, local8);
				this.method4288(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4288(local13, 545259520, local8);
			this.method4288(local13, 33554432, local8 - 1);
			this.method4288(local13 + 1, 134217728, local8);
		}
		if (arg0 == 1) {
			this.method4288(local13, 41943040, local8);
			this.method4288(local13 + 1, 134217728, local8);
			this.method4288(local13, 536870912, local8 + 1);
		}
		if (arg0 == 2) {
			this.method4288(local13, 167772160, local8);
			this.method4288(local13, 536870912, local8 + 1);
			this.method4288(local13 - 1, 8388608, local8);
		}
		if (arg0 == 3) {
			this.method4288(local13, 671088640, local8);
			this.method4288(local13 - 1, 8388608, local8);
			this.method4288(local13, 33554432, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public void method4286() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4867; local11++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4861; local14++) {
				if (local11 == 0 || local14 == 0 || this.anInt4867 - 5 <= local11 || local14 >= this.anInt4861 - 5) {
					this.anIntArrayArray48[local11][local14] = -1;
				} else {
					this.anIntArrayArray48[local11][local14] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg2 && arg5 == arg1) {
				return true;
			}
		} else if (arg2 <= arg3 && arg4 + arg2 - 1 >= arg3 && arg5 >= arg5 && arg5 <= arg5 + arg4 - 1) {
			return true;
		}
		@Pc(63) int local63 = arg5 - this.anInt4866;
		@Pc(73) int local73 = arg1 - this.anInt4866;
		@Pc(78) int local78 = arg2 - this.anInt4875;
		@Pc(83) int local83 = arg3 - this.anInt4875;
		if (arg4 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local83 + 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x80) == 0) {
						return true;
					}
					if (local83 == local78 && local73 == local63 - 1 && (this.anIntArrayArray48[local78][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local83 - 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x8) == 0) {
						return true;
					}
					if (local78 == local83 && local73 == local63 - 1 && (this.anIntArrayArray48[local78][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local78 == local83 - 1 && local63 == local73 && (this.anIntArrayArray48[local78][local73] & 0x8) == 0) {
						return true;
					}
					if (local78 == local83 && local73 == local63 + 1 && (this.anIntArrayArray48[local78][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local83 + 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x80) == 0) {
						return true;
					}
					if (local83 == local78 && local63 + 1 == local73 && (this.anIntArrayArray48[local78][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local83 == local78 && local73 == local63 + 1 && (this.anIntArrayArray48[local78][local73] & 0x20) == 0) {
					return true;
				}
				if (local78 == local83 && local73 == local63 - 1 && (this.anIntArrayArray48[local78][local73] & 0x2) == 0) {
					return true;
				}
				if (local83 - 1 == local78 && local63 == local73 && (this.anIntArrayArray48[local78][local73] & 0x8) == 0) {
					return true;
				}
				if (local78 == local83 + 1 && local63 == local73 && (this.anIntArrayArray48[local78][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(94) int local94 = arg4 + local78 - 1;
			@Pc(100) int local100 = local73 + arg4 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local83 + 1 == local78 && local73 <= local63 && local63 <= local100 && (this.anIntArrayArray48[local78][local63] & 0x80) == 0) {
						return true;
					}
					if (local78 <= local83 && local83 <= local94 && local63 - arg4 == local73 && (this.anIntArrayArray48[local83][local100] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local83 - arg4 == local78 && local73 <= local63 && local63 <= local100 && (this.anIntArrayArray48[local94][local63] & 0x8) == 0) {
						return true;
					}
					if (local83 >= local78 && local83 <= local94 && local63 - arg4 == local73 && (this.anIntArrayArray48[local83][local100] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local78 == local83 - arg4 && local63 >= local73 && local63 <= local100 && (this.anIntArrayArray48[local94][local63] & 0x8) == 0) {
						return true;
					}
					if (local83 >= local78 && local83 <= local94 && local73 == local63 + 1 && (this.anIntArrayArray48[local83][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local78 == local83 + 1 && local63 >= local73 && local100 >= local63 && (this.anIntArrayArray48[local78][local63] & 0x80) == 0) {
						return true;
					}
					if (local83 >= local78 && local94 >= local83 && local63 + 1 == local73 && (this.anIntArrayArray48[local83][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local78 <= local83 && local83 <= local94 && local73 == local63 + 1 && (this.anIntArrayArray48[local83][local73] & 0x20) == 0) {
					return true;
				}
				if (local83 >= local78 && local83 <= local94 && local73 == local63 - arg4 && (this.anIntArrayArray48[local83][local100] & 0x2) == 0) {
					return true;
				}
				if (local78 == local83 - arg4 && local63 >= local73 && local100 >= local63 && (this.anIntArrayArray48[local94][local63] & 0x8) == 0) {
					return true;
				}
				if (local78 == local83 + 1 && local63 >= local73 && local63 <= local100 && (this.anIntArrayArray48[local78][local63] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIII)V")
	private void method4288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray48[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIIIIIIII)Z")
	public boolean method4289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg3 + arg4;
		@Pc(16) int local16 = arg7 + arg6;
		@Pc(20) int local20 = arg8 + arg0;
		@Pc(24) int local24 = arg1 + arg2;
		@Pc(52) int local52;
		@Pc(59) int local59;
		if (local20 == arg3 && (arg5 & 0x2) == 0) {
			local52 = arg7 <= arg1 ? arg1 : arg7;
			local59 = local24 > local16 ? local16 : local24;
			while (local59 > local52) {
				if ((this.anIntArrayArray48[local20 - this.anInt4875 - 1][local52 - this.anInt4866] & 0x8) == 0) {
					return true;
				}
				local52++;
			}
		} else if (arg0 == local12 && (arg5 & 0x8) == 0) {
			local52 = arg7 <= arg1 ? arg1 : arg7;
			local59 = local16 < local24 ? local16 : local24;
			while (local52 < local59) {
				if ((this.anIntArrayArray48[arg0 - this.anInt4875][local52 - this.anInt4866] & 0x80) == 0) {
					return true;
				}
				local52++;
			}
		} else if (arg7 == local24 && (arg5 & 0x1) == 0) {
			local52 = arg0 >= arg3 ? arg0 : arg3;
			local59 = local20 > local12 ? local12 : local20;
			while (local52 < local59) {
				if ((this.anIntArrayArray48[local52 - this.anInt4875][local24 - this.anInt4866 - 1] & 0x2) == 0) {
					return true;
				}
				local52++;
			}
		} else if (arg1 == local16 && (arg5 & 0x4) == 0) {
			local52 = arg3 > arg0 ? arg3 : arg0;
			local59 = local12 >= local20 ? local20 : local12;
			while (local59 > local52) {
				if ((this.anIntArrayArray48[local52 - this.anInt4875][arg1 - this.anInt4866] & 0x20) == 0) {
					return true;
				}
				local52++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZZZII)V")
	public void method4290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt4866;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(36) int local36;
		if (arg2 == 1 || arg2 == 3) {
			local36 = arg0;
			arg0 = arg6;
			arg6 = local36;
		}
		@Pc(45) int local45 = arg5 - this.anInt4875;
		for (local36 = local45; local36 < arg0 + local45; local36++) {
			if (local36 >= 0 && local36 < this.anInt4867) {
				for (@Pc(57) int local57 = local18; local57 < local18 + arg6; local57++) {
					if (local57 >= 0 && this.anInt4861 > local57) {
						this.method4288(local57, local7, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg5 == arg3 && arg6 == arg0) {
				return true;
			}
		} else if (arg5 <= arg3 && arg5 + arg2 - 1 >= arg3 && arg0 <= arg0 && arg0 + arg2 - 1 >= arg0) {
			return true;
		}
		@Pc(63) int local63 = arg0 - this.anInt4866;
		@Pc(68) int local68 = arg3 - this.anInt4875;
		@Pc(73) int local73 = arg6 - this.anInt4866;
		@Pc(78) int local78 = arg5 - this.anInt4875;
		if (arg2 == 1) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local78 == local68 - 1 && local63 == local73) {
						return true;
					}
					if (local78 == local68 && local63 + 1 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local78 && local63 - 1 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local78 == local68 && local63 + 1 == local73) {
						return true;
					}
					if (local68 - 1 == local78 && local63 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local78 == local68 + 1 && local73 == local63) {
						return true;
					}
					if (local78 == local68 && local73 == local63 + 1 && (this.anIntArrayArray48[local78][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local68 && local63 - 1 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local78 == local68 && local63 - 1 == local73) {
						return true;
					}
					if (local78 == local68 - 1 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local68 - 1 == local78 && local63 == local73) {
						return true;
					}
					if (local68 == local78 && local63 + 1 == local73) {
						return true;
					}
					if (local68 + 1 == local78 && local63 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local68 && local73 == local63 - 1 && (this.anIntArrayArray48[local78][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 - 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local78 && local73 == local63 + 1) {
						return true;
					}
					if (local78 == local68 + 1 && local63 == local73) {
						return true;
					}
					if (local68 == local78 && local63 - 1 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local78 == local68 - 1 && local63 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local78 && local73 == local63 + 1 && (this.anIntArrayArray48[local78][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local68 + 1 && local73 == local63) {
						return true;
					}
					if (local78 == local68 && local63 - 1 == local73) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local68 - 1 == local78 && local73 == local63) {
						return true;
					}
					if (local78 == local68 && local73 == local63 + 1 && (this.anIntArrayArray48[local78][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local68 + 1 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local68 && local63 - 1 == local73) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local68 == local78 && local73 == local63 + 1 && (this.anIntArrayArray48[local78][local73] & 0x20) == 0) {
					return true;
				}
				if (local68 == local78 && local63 - 1 == local73 && (this.anIntArrayArray48[local78][local73] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local78 && local73 == local63 && (this.anIntArrayArray48[local78][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(802) int local802 = arg2 + local78 - 1;
			@Pc(809) int local809 = local73 + arg2 - 1;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local78 == local68 - arg2 && local63 >= local73 && local63 <= local809) {
						return true;
					}
					if (local68 >= local78 && local68 <= local802 && local63 + 1 == local73 && (this.anIntArrayArray48[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 >= local78 && local802 >= local68 && local73 == local63 - arg2 && (this.anIntArrayArray48[local68][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 >= local78 && local802 >= local68 && local63 + 1 == local73) {
						return true;
					}
					if (local68 - arg2 == local78 && local73 <= local63 && local809 >= local63 && (this.anIntArrayArray48[local802][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 == local68 + 1 && local63 >= local73 && local63 <= local809 && (this.anIntArrayArray48[local78][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local68 + 1 == local78 && local63 >= local73 && local809 >= local63) {
						return true;
					}
					if (local78 <= local68 && local802 >= local68 && local73 == local63 + 1 && (this.anIntArrayArray48[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 <= local68 && local802 >= local68 && local73 == local63 - arg2 && (this.anIntArrayArray48[local68][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local68 >= local78 && local802 >= local68 && local63 - arg2 == local73) {
						return true;
					}
					if (local68 - arg2 == local78 && local73 <= local63 && local809 >= local63 && (this.anIntArrayArray48[local802][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 == local68 + 1 && local73 <= local63 && local63 <= local809 && (this.anIntArrayArray48[local78][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local78 == local68 - arg2 && local63 >= local73 && local809 >= local63) {
						return true;
					}
					if (local78 <= local68 && local68 <= local802 && local63 + 1 == local73) {
						return true;
					}
					if (local68 + 1 == local78 && local63 >= local73 && local809 >= local63 && (this.anIntArrayArray48[local78][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 <= local68 && local68 <= local802 && local63 - arg2 == local73 && (this.anIntArrayArray48[local68][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 - arg2 == local78 && local73 <= local63 && local809 >= local63 && (this.anIntArrayArray48[local802][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local78 && local68 <= local802 && local63 + 1 == local73) {
						return true;
					}
					if (local78 == local68 + 1 && local73 <= local63 && local63 <= local809) {
						return true;
					}
					if (local78 <= local68 && local802 >= local68 && local63 - arg2 == local73 && (this.anIntArrayArray48[local68][local809] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local68 - arg2 == local78 && local73 <= local63 && local809 >= local63 && (this.anIntArrayArray48[local802][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local78 && local68 <= local802 && local63 + 1 == local73 && (this.anIntArrayArray48[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local78 && local73 <= local63 && local809 >= local63) {
						return true;
					}
					if (local78 <= local68 && local68 <= local802 && local63 - arg2 == local73) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local78 == local68 - arg2 && local73 <= local63 && local63 <= local809) {
						return true;
					}
					if (local78 <= local68 && local802 >= local68 && local73 == local63 + 1 && (this.anIntArrayArray48[local68][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local78 && local73 <= local63 && local63 <= local809 && (this.anIntArrayArray48[local78][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 <= local68 && local68 <= local802 && local73 == local63 - arg2) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local68 >= local78 && local802 >= local68 && local63 + 1 == local73 && (this.anIntArrayArray48[local68][local73] & 0x2C0120) == 0) {
					return true;
				}
				if (local68 >= local78 && local68 <= local802 && local73 == local63 - arg2 && (this.anIntArrayArray48[local68][local809] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 - arg2 == local78 && local73 <= local63 && local809 >= local63 && (this.anIntArrayArray48[local802][local63] & 0x2C0108) == 0) {
					return true;
				}
				if (local78 == local68 + 1 && local73 <= local63 && local63 <= local809 && (this.anIntArrayArray48[local78][local63] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBIIIII)Z")
	public boolean method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static175.method3006(arg0, arg2, arg3, arg0, arg5, arg7, arg4, arg6) ? true : this.method4289(arg3, arg7, arg6, arg4, arg0, arg1, arg0, arg2, arg5);
		}
		@Pc(38) int local38 = arg3 + arg5 - 1;
		@Pc(50) int local50 = arg6 + arg7 - 1;
		if (arg4 >= arg3 && local38 >= arg4 && arg7 <= arg2 && arg2 <= local50) {
			return true;
		} else if (arg3 - 1 == arg4 && arg2 >= arg7 && arg2 <= local50 && (this.anIntArrayArray48[arg4 - this.anInt4875][arg2 - this.anInt4866] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg4 && arg7 <= arg2 && arg2 <= local50 && (this.anIntArrayArray48[arg4 - this.anInt4875][arg2 - this.anInt4866] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg7 - 1 && arg3 <= arg4 && local38 >= arg4 && (this.anIntArrayArray48[arg4 - this.anInt4875][arg2 - this.anInt4866] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local50 + 1 == arg2 && arg4 >= arg3 && arg4 <= local38 && (this.anIntArrayArray48[arg4 - this.anInt4875][arg2 - this.anInt4866] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public void method4293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt4875;
		@Pc(19) int local19 = arg1 - this.anInt4866;
		this.anIntArrayArray48[local14][local19] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4866;
		@Pc(18) int local18 = arg0 - this.anInt4875;
		this.anIntArrayArray48[local18][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(III)V")
	public void method4295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt4875;
		@Pc(21) int local21 = arg1 - this.anInt4866;
		this.anIntArrayArray48[local16][local21] |= 0x40000;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZZIIII)V")
	public void method4296(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt4875;
		@Pc(19) int local19 = arg5 - this.anInt4866;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4284(local4, local19, 128);
				this.method4284(local4 - 1, local19, 8);
			}
			if (arg0 == 1) {
				this.method4284(local4, local19, 2);
				this.method4284(local4, local19 + 1, 32);
			}
			if (arg0 == 2) {
				this.method4284(local4, local19, 8);
				this.method4284(local4 + 1, local19, 128);
			}
			if (arg0 == 3) {
				this.method4284(local4, local19, 32);
				this.method4284(local4, local19 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4284(local4, local19, 1);
				this.method4284(local4 - 1, local19 + 1, 16);
			}
			if (arg0 == 1) {
				this.method4284(local4, local19, 4);
				this.method4284(local4 + 1, local19 - -1, 64);
			}
			if (arg0 == 2) {
				this.method4284(local4, local19, 16);
				this.method4284(local4 + 1, local19 + -1, 1);
			}
			if (arg0 == 3) {
				this.method4284(local4, local19, 64);
				this.method4284(local4 - 1, local19 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method4284(local4, local19, 130);
				this.method4284(local4 - 1, local19, 8);
				this.method4284(local4, local19 + 1, 32);
			}
			if (arg0 == 1) {
				this.method4284(local4, local19, 10);
				this.method4284(local4, local19 + 1, 32);
				this.method4284(local4 + 1, local19, 128);
			}
			if (arg0 == 2) {
				this.method4284(local4, local19, 40);
				this.method4284(local4 + 1, local19, 128);
				this.method4284(local4, local19 - 1, 2);
			}
			if (arg0 == 3) {
				this.method4284(local4, local19, 160);
				this.method4284(local4, local19 - 1, 2);
				this.method4284(local4 - 1, local19, 8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method4284(local4, local19, 65536);
					this.method4284(local4 - 1, local19, 4096);
				}
				if (arg0 == 1) {
					this.method4284(local4, local19, 1024);
					this.method4284(local4, local19 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method4284(local4, local19, 4096);
					this.method4284(local4 + 1, local19, 65536);
				}
				if (arg0 == 3) {
					this.method4284(local4, local19, 16384);
					this.method4284(local4, local19 - 1, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method4284(local4, local19, 512);
					this.method4284(local4 - 1, local19 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method4284(local4, local19, 2048);
					this.method4284(local4 + 1, local19 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4284(local4, local19, 8192);
					this.method4284(local4 + 1, local19 - 1, 512);
				}
				if (arg0 == 3) {
					this.method4284(local4, local19, 32768);
					this.method4284(local4 - 1, local19 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method4284(local4, local19, 66560);
					this.method4284(local4 - 1, local19, 4096);
					this.method4284(local4, local19 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method4284(local4, local19, 5120);
					this.method4284(local4, local19 + 1, 16384);
					this.method4284(local4 + 1, local19, 65536);
				}
				if (arg0 == 2) {
					this.method4284(local4, local19, 20480);
					this.method4284(local4 + 1, local19, 65536);
					this.method4284(local4, local19 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method4284(local4, local19, 81920);
					this.method4284(local4, local19 - 1, 1024);
					this.method4284(local4 - 1, local19, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4284(local4, local19, 536870912);
				this.method4284(local4 - 1, local19, 33554432);
			}
			if (arg0 == 1) {
				this.method4284(local4, local19, 8388608);
				this.method4284(local4, local19 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method4284(local4, local19, 33554432);
				this.method4284(local4 + 1, local19, 536870912);
			}
			if (arg0 == 3) {
				this.method4284(local4, local19, 134217728);
				this.method4284(local4, local19 - 1, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4284(local4, local19, 4194304);
				this.method4284(local4 - 1, local19 - -1, 67108864);
			}
			if (arg0 == 1) {
				this.method4284(local4, local19, 16777216);
				this.method4284(local4 + 1, local19 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method4284(local4, local19, 67108864);
				this.method4284(local4 + 1, local19 - 1, 4194304);
			}
			if (arg0 == 3) {
				this.method4284(local4, local19, 268435456);
				this.method4284(local4 - 1, local19 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4284(local4, local19, 545259520);
			this.method4284(local4 - 1, local19, 33554432);
			this.method4284(local4, local19 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method4284(local4, local19, 41943040);
			this.method4284(local4, local19 + 1, 134217728);
			this.method4284(local4 + 1, local19, 536870912);
		}
		if (arg0 == 2) {
			this.method4284(local4, local19, 167772160);
			this.method4284(local4 + 1, local19, 536870912);
			this.method4284(local4, local19 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method4284(local4, local19, 671088640);
			this.method4284(local4, local19 - 1, 8388608);
			this.method4284(local4 - 1, local19, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)V")
	public void method4300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4875;
		@Pc(13) int local13 = arg0 - this.anInt4866;
		this.anIntArrayArray48[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIZZII)V")
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt4866;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg4 - this.anInt4875;
		for (@Pc(31) int local31 = local29; local31 < arg5 + local29; local31++) {
			if (local31 >= 0 && local31 < this.anInt4867) {
				for (@Pc(48) int local48 = local18; local48 < local18 + arg0; local48++) {
					if (local48 >= 0 && this.anInt4861 > local48) {
						this.method4284(local31, local48, local7);
					}
				}
			}
		}
	}
}

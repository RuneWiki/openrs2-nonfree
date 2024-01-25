import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class389 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public int anInt10431;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
	public int anInt10439;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
	public int anInt10440;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	public int anInt10446;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt10431;
		@Pc(19) int local19 = arg0 - this.anInt10446;
		this.anIntArrayArray64[local19][local14] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIZBII)V")
	public void method8801(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg5 - this.anInt10431;
		@Pc(17) int local17 = arg2 - this.anInt10446;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method8802(128, local8, local17);
				this.method8802(8, local8, local17 - 1);
			}
			if (arg1 == 1) {
				this.method8802(2, local8, local17);
				this.method8802(32, local8 + 1, local17);
			}
			if (arg1 == 2) {
				this.method8802(8, local8, local17);
				this.method8802(128, local8, local17 + 1);
			}
			if (arg1 == 3) {
				this.method8802(32, local8, local17);
				this.method8802(2, local8 - 1, local17);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method8802(1, local8, local17);
				this.method8802(16, local8 + 1, local17 + -1);
			}
			if (arg1 == 1) {
				this.method8802(4, local8, local17);
				this.method8802(64, local8 + 1, local17 + 1);
			}
			if (arg1 == 2) {
				this.method8802(16, local8, local17);
				this.method8802(1, local8 - 1, local17 + 1);
			}
			if (arg1 == 3) {
				this.method8802(64, local8, local17);
				this.method8802(4, local8 - 1, local17 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method8802(130, local8, local17);
				this.method8802(8, local8, local17 - 1);
				this.method8802(32, local8 + 1, local17);
			}
			if (arg1 == 1) {
				this.method8802(10, local8, local17);
				this.method8802(32, local8 + 1, local17);
				this.method8802(128, local8, local17 + 1);
			}
			if (arg1 == 2) {
				this.method8802(40, local8, local17);
				this.method8802(128, local8, local17 + 1);
				this.method8802(2, local8 - 1, local17);
			}
			if (arg1 == 3) {
				this.method8802(160, local8, local17);
				this.method8802(2, local8 - 1, local17);
				this.method8802(8, local8, local17 - 1);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method8802(65536, local8, local17);
					this.method8802(4096, local8, local17 - 1);
				}
				if (arg1 == 1) {
					this.method8802(1024, local8, local17);
					this.method8802(16384, local8 + 1, local17);
				}
				if (arg1 == 2) {
					this.method8802(4096, local8, local17);
					this.method8802(65536, local8, local17 + 1);
				}
				if (arg1 == 3) {
					this.method8802(16384, local8, local17);
					this.method8802(1024, local8 - 1, local17);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method8802(512, local8, local17);
					this.method8802(8192, local8 + 1, local17 + -1);
				}
				if (arg1 == 1) {
					this.method8802(2048, local8, local17);
					this.method8802(32768, local8 + 1, local17 + 1);
				}
				if (arg1 == 2) {
					this.method8802(8192, local8, local17);
					this.method8802(512, local8 - 1, local17 + 1);
				}
				if (arg1 == 3) {
					this.method8802(32768, local8, local17);
					this.method8802(2048, local8 - 1, local17 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method8802(66560, local8, local17);
					this.method8802(4096, local8, local17 - 1);
					this.method8802(16384, local8 + 1, local17);
				}
				if (arg1 == 1) {
					this.method8802(5120, local8, local17);
					this.method8802(16384, local8 + 1, local17);
					this.method8802(65536, local8, local17 + 1);
				}
				if (arg1 == 2) {
					this.method8802(20480, local8, local17);
					this.method8802(65536, local8, local17 + 1);
					this.method8802(1024, local8 - 1, local17);
				}
				if (arg1 == 3) {
					this.method8802(81920, local8, local17);
					this.method8802(1024, local8 - 1, local17);
					this.method8802(4096, local8, local17 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method8802(536870912, local8, local17);
				this.method8802(33554432, local8, local17 - 1);
			}
			if (arg1 == 1) {
				this.method8802(8388608, local8, local17);
				this.method8802(134217728, local8 + 1, local17);
			}
			if (arg1 == 2) {
				this.method8802(33554432, local8, local17);
				this.method8802(536870912, local8, local17 + 1);
			}
			if (arg1 == 3) {
				this.method8802(134217728, local8, local17);
				this.method8802(8388608, local8 - 1, local17);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method8802(4194304, local8, local17);
				this.method8802(67108864, local8 + 1, local17 + -1);
			}
			if (arg1 == 1) {
				this.method8802(16777216, local8, local17);
				this.method8802(268435456, local8 + 1, local17 - -1);
			}
			if (arg1 == 2) {
				this.method8802(67108864, local8, local17);
				this.method8802(4194304, local8 - 1, local17 + 1);
			}
			if (arg1 == 3) {
				this.method8802(268435456, local8, local17);
				this.method8802(16777216, local8 - 1, local17 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method8802(545259520, local8, local17);
			this.method8802(33554432, local8, local17 - 1);
			this.method8802(134217728, local8 + 1, local17);
		}
		if (arg1 == 1) {
			this.method8802(41943040, local8, local17);
			this.method8802(134217728, local8 + 1, local17);
			this.method8802(536870912, local8, local17 + 1);
		}
		if (arg1 == 2) {
			this.method8802(167772160, local8, local17);
			this.method8802(536870912, local8, local17 + 1);
			this.method8802(8388608, local8 - 1, local17);
		}
		if (arg1 == 3) {
			this.method8802(671088640, local8, local17);
			this.method8802(8388608, local8 - 1, local17);
			this.method8802(33554432, local8, local17 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
	private void method8802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray64[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method8804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg0 && arg1 == arg2) {
				return true;
			}
		} else if (arg0 >= arg5 && arg6 + arg5 - 1 >= arg0 && arg2 <= arg2 && arg2 <= arg2 + arg6 - 1) {
			return true;
		}
		@Pc(67) int local67 = arg2 - this.anInt10431;
		@Pc(72) int local72 = arg0 - this.anInt10446;
		@Pc(77) int local77 = arg5 - this.anInt10446;
		@Pc(82) int local82 = arg1 - this.anInt10431;
		if (arg6 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local72 + 1 == local77 && local67 == local82 && (this.anIntArrayArray64[local77][local82] & 0x80) == 0) {
						return true;
					}
					if (local72 == local77 && local82 == local67 - 1 && (this.anIntArrayArray64[local77][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local77 == local72 - 1 && local67 == local82 && (this.anIntArrayArray64[local77][local82] & 0x8) == 0) {
						return true;
					}
					if (local72 == local77 && local82 == local67 - 1 && (this.anIntArrayArray64[local77][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local77 == local72 - 1 && local82 == local67 && (this.anIntArrayArray64[local77][local82] & 0x8) == 0) {
						return true;
					}
					if (local72 == local77 && local82 == local67 + 1 && (this.anIntArrayArray64[local77][local82] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 + 1 == local77 && local82 == local67 && (this.anIntArrayArray64[local77][local82] & 0x80) == 0) {
						return true;
					}
					if (local77 == local72 && local82 == local67 + 1 && (this.anIntArrayArray64[local77][local82] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local72 == local77 && local67 + 1 == local82 && (this.anIntArrayArray64[local77][local82] & 0x20) == 0) {
					return true;
				}
				if (local72 == local77 && local67 - 1 == local82 && (this.anIntArrayArray64[local77][local82] & 0x2) == 0) {
					return true;
				}
				if (local77 == local72 - 1 && local67 == local82 && (this.anIntArrayArray64[local77][local82] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local77 && local82 == local67 && (this.anIntArrayArray64[local77][local82] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(432) int local432 = arg6 + local77 - 1;
			@Pc(438) int local438 = arg6 + local82 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local77 == local72 + 1 && local82 <= local67 && local438 >= local67 && (this.anIntArrayArray64[local77][local67] & 0x80) == 0) {
						return true;
					}
					if (local77 <= local72 && local432 >= local72 && local67 - arg6 == local82 && (this.anIntArrayArray64[local72][local438] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 - arg6 == local77 && local82 <= local67 && local67 <= local438 && (this.anIntArrayArray64[local432][local67] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local72 && local72 <= local432 && local67 - arg6 == local82 && (this.anIntArrayArray64[local72][local438] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 - arg6 == local77 && local67 >= local82 && local438 >= local67 && (this.anIntArrayArray64[local432][local67] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local72 && local432 >= local72 && local82 == local67 + 1 && (this.anIntArrayArray64[local72][local82] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 + 1 == local77 && local82 <= local67 && local438 >= local67 && (this.anIntArrayArray64[local77][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local77 && local72 <= local432 && local67 + 1 == local82 && (this.anIntArrayArray64[local72][local82] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local77 <= local72 && local432 >= local72 && local67 + 1 == local82 && (this.anIntArrayArray64[local72][local82] & 0x20) == 0) {
					return true;
				}
				if (local77 <= local72 && local432 >= local72 && local82 == local67 - arg6 && (this.anIntArrayArray64[local72][local438] & 0x2) == 0) {
					return true;
				}
				if (local77 == local72 - arg6 && local82 <= local67 && local438 >= local67 && (this.anIntArrayArray64[local432][local67] & 0x8) == 0) {
					return true;
				}
				if (local77 == local72 + 1 && local67 >= local82 && local67 <= local438 && (this.anIntArrayArray64[local77][local67] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIB)V")
	public void method8805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt10446;
		@Pc(18) int local18 = arg0 - this.anInt10431;
		this.anIntArrayArray64[local13][local18] |= 0x200000;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZIIZZII)V")
	public void method8807(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(21) int local21;
		if (arg0 == 1 || arg0 == 3) {
			local21 = arg3;
			arg3 = arg5;
			arg5 = local21;
		}
		@Pc(30) int local30 = arg6 - this.anInt10431;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(41) int local41 = arg2 - this.anInt10446;
		for (local21 = local41; local21 < local41 + arg3; local21++) {
			if (local21 >= 0 && local21 < this.anInt10440) {
				for (@Pc(57) int local57 = local30; local57 < arg5 + local30; local57++) {
					if (local57 >= 0 && local57 < this.anInt10439) {
						this.method8816(local57, local21, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBIIIIII)Z")
	public boolean method8808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static65.method1433(arg6, arg1, arg0, arg3, arg1, arg5, arg2, arg4) ? true : this.method8812(arg0, arg5, arg1, arg1, arg6, arg2, arg4, arg7, arg3);
		}
		@Pc(42) int local42 = arg5 + arg3 - 1;
		@Pc(49) int local49 = arg2 + arg0 - 1;
		if (arg4 >= arg3 && local42 >= arg4 && arg6 >= arg2 && arg6 <= local49) {
			return true;
		} else if (arg3 - 1 == arg4 && arg6 >= arg2 && arg6 <= local49 && (this.anIntArrayArray64[arg4 - this.anInt10446][arg6 - this.anInt10431] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (local42 + 1 == arg4 && arg6 >= arg2 && arg6 <= local49 && (this.anIntArrayArray64[arg4 - this.anInt10446][arg6 - this.anInt10431] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg6 && arg4 >= arg3 && arg4 <= local42 && (this.anIntArrayArray64[arg4 - this.anInt10446][arg6 - this.anInt10431] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local49 + 1 && arg4 >= arg3 && local42 >= arg4 && (this.anIntArrayArray64[arg4 - this.anInt10446][arg6 - this.anInt10431] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method8809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg3 == arg4 && arg0 == arg2) {
				return true;
			}
		} else if (arg4 <= arg3 && arg6 + arg4 - 1 >= arg3 && arg0 <= arg0 && arg0 <= arg0 + arg6 - 1) {
			return true;
		}
		@Pc(64) int local64 = arg3 - this.anInt10446;
		@Pc(69) int local69 = arg0 - this.anInt10431;
		@Pc(74) int local74 = arg2 - this.anInt10431;
		@Pc(84) int local84 = arg4 - this.anInt10446;
		if (arg6 == 1) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local84 == local64 - 1 && local74 == local69) {
						return true;
					}
					if (local64 == local84 && local69 + 1 == local74 && (this.anIntArrayArray64[local84][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local84 && local74 == local69 - 1 && (this.anIntArrayArray64[local84][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local84 == local64 && local69 + 1 == local74) {
						return true;
					}
					if (local64 - 1 == local84 && local74 == local69 && (this.anIntArrayArray64[local84][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 == local64 + 1 && local69 == local74 && (this.anIntArrayArray64[local84][local74] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local64 + 1 == local84 && local69 == local74) {
						return true;
					}
					if (local84 == local64 && local74 == local69 + 1 && (this.anIntArrayArray64[local84][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local84 == local64 && local69 - 1 == local74 && (this.anIntArrayArray64[local84][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local64 == local84 && local74 == local69 - 1) {
						return true;
					}
					if (local64 - 1 == local84 && local74 == local69 && (this.anIntArrayArray64[local84][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 == local64 + 1 && local69 == local74 && (this.anIntArrayArray64[local84][local74] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local64 - 1 == local84 && local69 == local74) {
						return true;
					}
					if (local84 == local64 && local74 == local69 + 1) {
						return true;
					}
					if (local64 + 1 == local84 && local74 == local69 && (this.anIntArrayArray64[local84][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local84 == local64 && local74 == local69 - 1 && (this.anIntArrayArray64[local84][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local64 - 1 == local84 && local69 == local74 && (this.anIntArrayArray64[local84][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 == local64 && local74 == local69 + 1) {
						return true;
					}
					if (local84 == local64 + 1 && local69 == local74) {
						return true;
					}
					if (local84 == local64 && local74 == local69 - 1 && (this.anIntArrayArray64[local84][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local84 == local64 - 1 && local74 == local69 && (this.anIntArrayArray64[local84][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 == local64 && local69 + 1 == local74 && (this.anIntArrayArray64[local84][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local84 && local69 == local74) {
						return true;
					}
					if (local84 == local64 && local74 == local69 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local84 == local64 - 1 && local69 == local74) {
						return true;
					}
					if (local64 == local84 && local74 == local69 + 1 && (this.anIntArrayArray64[local84][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local84 && local74 == local69 && (this.anIntArrayArray64[local84][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local84 == local64 && local74 == local69 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local84 == local64 && local69 + 1 == local74 && (this.anIntArrayArray64[local84][local74] & 0x20) == 0) {
					return true;
				}
				if (local84 == local64 && local74 == local69 - 1 && (this.anIntArrayArray64[local84][local74] & 0x2) == 0) {
					return true;
				}
				if (local64 - 1 == local84 && local69 == local74 && (this.anIntArrayArray64[local84][local74] & 0x8) == 0) {
					return true;
				}
				if (local84 == local64 + 1 && local69 == local74 && (this.anIntArrayArray64[local84][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(96) int local96 = local84 + arg6 - 1;
			@Pc(102) int local102 = local74 + arg6 - 1;
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local64 - arg6 == local84 && local69 >= local74 && local69 <= local102) {
						return true;
					}
					if (local84 <= local64 && local64 <= local96 && local74 == local69 + 1 && (this.anIntArrayArray64[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local84 <= local64 && local96 >= local64 && local74 == local69 - arg6 && (this.anIntArrayArray64[local64][local102] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local84 <= local64 && local64 <= local96 && local74 == local69 + 1) {
						return true;
					}
					if (local64 - arg6 == local84 && local74 <= local69 && local69 <= local102 && (this.anIntArrayArray64[local96][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 == local64 + 1 && local69 >= local74 && local69 <= local102 && (this.anIntArrayArray64[local84][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local84 == local64 + 1 && local74 <= local69 && local102 >= local69) {
						return true;
					}
					if (local64 >= local84 && local96 >= local64 && local74 == local69 + 1 && (this.anIntArrayArray64[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local84 <= local64 && local64 <= local96 && local69 - arg6 == local74 && (this.anIntArrayArray64[local64][local102] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local64 >= local84 && local64 <= local96 && local69 - arg6 == local74) {
						return true;
					}
					if (local84 == local64 - arg6 && local74 <= local69 && local69 <= local102 && (this.anIntArrayArray64[local96][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 == local64 + 1 && local69 >= local74 && local102 >= local69 && (this.anIntArrayArray64[local84][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local64 - arg6 == local84 && local74 <= local69 && local69 <= local102) {
						return true;
					}
					if (local64 >= local84 && local64 <= local96 && local69 + 1 == local74) {
						return true;
					}
					if (local84 == local64 + 1 && local74 <= local69 && local69 <= local102 && (this.anIntArrayArray64[local84][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local84 && local96 >= local64 && local69 - arg6 == local74 && (this.anIntArrayArray64[local64][local102] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local64 - arg6 == local84 && local74 <= local69 && local102 >= local69 && (this.anIntArrayArray64[local96][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 <= local64 && local96 >= local64 && local74 == local69 + 1) {
						return true;
					}
					if (local64 + 1 == local84 && local69 >= local74 && local102 >= local69) {
						return true;
					}
					if (local64 >= local84 && local64 <= local96 && local69 - arg6 == local74 && (this.anIntArrayArray64[local64][local102] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local84 == local64 - arg6 && local74 <= local69 && local102 >= local69 && (this.anIntArrayArray64[local96][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local84 <= local64 && local64 <= local96 && local74 == local69 + 1 && (this.anIntArrayArray64[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local84 && local74 <= local69 && local102 >= local69) {
						return true;
					}
					if (local64 >= local84 && local96 >= local64 && local74 == local69 - arg6) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local84 == local64 - arg6 && local74 <= local69 && local102 >= local69) {
						return true;
					}
					if (local84 <= local64 && local96 >= local64 && local74 == local69 + 1 && (this.anIntArrayArray64[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local84 == local64 + 1 && local69 >= local74 && local69 <= local102 && (this.anIntArrayArray64[local84][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local84 && local64 <= local96 && local74 == local69 - arg6) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local84 <= local64 && local96 >= local64 && local69 + 1 == local74 && (this.anIntArrayArray64[local64][local74] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 >= local84 && local64 <= local96 && local74 == local69 - arg6 && (this.anIntArrayArray64[local64][local102] & 0x2C0102) == 0) {
					return true;
				}
				if (local84 == local64 - arg6 && local74 <= local69 && local102 >= local69 && (this.anIntArrayArray64[local96][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 + 1 == local84 && local69 >= local74 && local69 <= local102 && (this.anIntArrayArray64[local84][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZIIIII)V")
	public void method8810(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt10431;
		@Pc(13) int local13 = arg5 - this.anInt10446;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method8816(local8, local13, 128);
				this.method8816(local8, local13 - 1, 8);
			}
			if (arg2 == 1) {
				this.method8816(local8, local13, 2);
				this.method8816(local8 + 1, local13, 32);
			}
			if (arg2 == 2) {
				this.method8816(local8, local13, 8);
				this.method8816(local8, local13 + 1, 128);
			}
			if (arg2 == 3) {
				this.method8816(local8, local13, 32);
				this.method8816(local8 - 1, local13, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method8816(local8, local13, 1);
				this.method8816(local8 + 1, local13 + -1, 16);
			}
			if (arg2 == 1) {
				this.method8816(local8, local13, 4);
				this.method8816(local8 + 1, local13 + 1, 64);
			}
			if (arg2 == 2) {
				this.method8816(local8, local13, 16);
				this.method8816(local8 - 1, local13 + 1, 1);
			}
			if (arg2 == 3) {
				this.method8816(local8, local13, 64);
				this.method8816(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method8816(local8, local13, 130);
				this.method8816(local8, local13 - 1, 8);
				this.method8816(local8 + 1, local13, 32);
			}
			if (arg2 == 1) {
				this.method8816(local8, local13, 10);
				this.method8816(local8 + 1, local13, 32);
				this.method8816(local8, local13 + 1, 128);
			}
			if (arg2 == 2) {
				this.method8816(local8, local13, 40);
				this.method8816(local8, local13 + 1, 128);
				this.method8816(local8 - 1, local13, 2);
			}
			if (arg2 == 3) {
				this.method8816(local8, local13, 160);
				this.method8816(local8 - 1, local13, 2);
				this.method8816(local8, local13 - 1, 8);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method8816(local8, local13, 65536);
					this.method8816(local8, local13 - 1, 4096);
				}
				if (arg2 == 1) {
					this.method8816(local8, local13, 1024);
					this.method8816(local8 + 1, local13, 16384);
				}
				if (arg2 == 2) {
					this.method8816(local8, local13, 4096);
					this.method8816(local8, local13 + 1, 65536);
				}
				if (arg2 == 3) {
					this.method8816(local8, local13, 16384);
					this.method8816(local8 - 1, local13, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method8816(local8, local13, 512);
					this.method8816(local8 + 1, local13 + -1, 8192);
				}
				if (arg2 == 1) {
					this.method8816(local8, local13, 2048);
					this.method8816(local8 + 1, local13 - -1, 32768);
				}
				if (arg2 == 2) {
					this.method8816(local8, local13, 8192);
					this.method8816(local8 - 1, local13 + 1, 512);
				}
				if (arg2 == 3) {
					this.method8816(local8, local13, 32768);
					this.method8816(local8 - 1, local13 - 1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method8816(local8, local13, 66560);
					this.method8816(local8, local13 - 1, 4096);
					this.method8816(local8 + 1, local13, 16384);
				}
				if (arg2 == 1) {
					this.method8816(local8, local13, 5120);
					this.method8816(local8 + 1, local13, 16384);
					this.method8816(local8, local13 + 1, 65536);
				}
				if (arg2 == 2) {
					this.method8816(local8, local13, 20480);
					this.method8816(local8, local13 + 1, 65536);
					this.method8816(local8 - 1, local13, 1024);
				}
				if (arg2 == 3) {
					this.method8816(local8, local13, 81920);
					this.method8816(local8 - 1, local13, 1024);
					this.method8816(local8, local13 - 1, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method8816(local8, local13, 536870912);
				this.method8816(local8, local13 - 1, 33554432);
			}
			if (arg2 == 1) {
				this.method8816(local8, local13, 8388608);
				this.method8816(local8 + 1, local13, 134217728);
			}
			if (arg2 == 2) {
				this.method8816(local8, local13, 33554432);
				this.method8816(local8, local13 + 1, 536870912);
			}
			if (arg2 == 3) {
				this.method8816(local8, local13, 134217728);
				this.method8816(local8 - 1, local13, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method8816(local8, local13, 4194304);
				this.method8816(local8 + 1, local13 + -1, 67108864);
			}
			if (arg2 == 1) {
				this.method8816(local8, local13, 16777216);
				this.method8816(local8 + 1, local13 + 1, 268435456);
			}
			if (arg2 == 2) {
				this.method8816(local8, local13, 67108864);
				this.method8816(local8 - 1, local13 + 1, 4194304);
			}
			if (arg2 == 3) {
				this.method8816(local8, local13, 268435456);
				this.method8816(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method8816(local8, local13, 545259520);
			this.method8816(local8, local13 - 1, 33554432);
			this.method8816(local8 + 1, local13, 134217728);
		}
		if (arg2 == 1) {
			this.method8816(local8, local13, 41943040);
			this.method8816(local8 + 1, local13, 134217728);
			this.method8816(local8, local13 + 1, 536870912);
		}
		if (arg2 == 2) {
			this.method8816(local8, local13, 167772160);
			this.method8816(local8, local13 + 1, 536870912);
			this.method8816(local8 - 1, local13, 8388608);
		}
		if (arg2 == 3) {
			this.method8816(local8, local13, 671088640);
			this.method8816(local8 - 1, local13, 8388608);
			this.method8816(local8, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method8812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg2 + arg6;
		@Pc(13) int local13 = arg4 + arg3;
		@Pc(26) int local26 = arg8 + arg1;
		@Pc(30) int local30 = arg0 + arg5;
		@Pc(47) int local47;
		@Pc(58) int local58;
		if (local26 == arg6 && (arg7 & 0x2) == 0) {
			local47 = arg5 < arg4 ? arg4 : arg5;
			local58 = local13 < local30 ? local13 : local30;
			while (local47 < local58) {
				if ((this.anIntArrayArray64[local26 - this.anInt10446 - 1][local47 - this.anInt10431] & 0x8) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg8 == local9 && (arg7 & 0x8) == 0) {
			local47 = arg4 <= arg5 ? arg5 : arg4;
			local58 = local13 < local30 ? local13 : local30;
			while (local58 > local47) {
				if ((this.anIntArrayArray64[arg8 - this.anInt10446][local47 - this.anInt10431] & 0x80) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg4 == local30 && (arg7 & 0x1) == 0) {
			local47 = arg8 >= arg6 ? arg8 : arg6;
			local58 = local26 <= local9 ? local26 : local9;
			while (local47 < local58) {
				if ((this.anIntArrayArray64[local47 - this.anInt10446][local30 - this.anInt10431 - 1] & 0x2) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local13 == arg5 && (arg7 & 0x4) == 0) {
			local47 = arg6 <= arg8 ? arg8 : arg6;
			local58 = local9 < local26 ? local9 : local26;
			while (local58 > local47) {
				if ((this.anIntArrayArray64[local47 - this.anInt10446][arg5 - this.anInt10431] & 0x20) == 0) {
					return true;
				}
				local47++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(IIB)V")
	public void method8814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt10431;
		@Pc(13) int local13 = arg1 - this.anInt10446;
		this.anIntArrayArray64[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZII)V")
	public void method8815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt10446;
		@Pc(18) int local18 = arg0 - this.anInt10431;
		this.anIntArrayArray64[local13][local18] |= 0x40000;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIII)V")
	private void method8816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray64[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	public void method8817() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10440; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt10439; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt10440 - 5 || this.anInt10439 - 5 <= local7) {
					this.anIntArrayArray64[local3][local7] = -1;
				} else {
					this.anIntArrayArray64[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZBIIIZ)V")
	public void method8818(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(15) int local15 = 256;
		if (arg1) {
			local15 = 131328;
		}
		@Pc(26) int local26 = arg0 - this.anInt10446;
		if (arg5) {
			local15 |= 0x40000000;
		}
		@Pc(37) int local37 = arg2 - this.anInt10431;
		for (@Pc(39) int local39 = local26; local39 < arg3 + local26; local39++) {
			if (local39 >= 0 && this.anInt10440 > local39) {
				for (@Pc(49) int local49 = local37; local49 < local37 + arg4; local49++) {
					if (local49 >= 0 && this.anInt10439 > local49) {
						this.method8802(local15, local49, local39);
					}
				}
			}
		}
	}
}

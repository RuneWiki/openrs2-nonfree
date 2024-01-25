import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class247 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public int anInt6863;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray179;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public int anInt6866;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	public int anInt6871;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg5 == arg3 && arg4 == arg0) {
				return true;
			}
		} else if (arg3 >= arg5 && arg2 + arg5 - 1 >= arg3 && arg4 <= arg4 && arg4 <= arg2 + arg4 - 1) {
			return true;
		}
		@Pc(64) int local64 = arg0 - this.anInt6866;
		@Pc(69) int local69 = arg3 - this.anInt6878;
		@Pc(74) int local74 = arg5 - this.anInt6878;
		@Pc(79) int local79 = arg4 - this.anInt6866;
		if (arg2 == 1) {
			if (arg1 == 0) {
				if (arg6 == 0) {
					if (local69 - 1 == local74 && local79 == local64) {
						return true;
					}
					if (local69 == local74 && local79 + 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local74 && local64 == local79 - 1 && (this.anIntArrayArray179[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local74 == local69 && local79 + 1 == local64) {
						return true;
					}
					if (local74 == local69 - 1 && local64 == local79 && (this.anIntArrayArray179[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 == local79 && (this.anIntArrayArray179[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local74 == local69 + 1 && local79 == local64) {
						return true;
					}
					if (local74 == local69 && local79 + 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 && local79 - 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local74 == local69 && local64 == local79 - 1) {
						return true;
					}
					if (local74 == local69 - 1 && local79 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 == local79 && (this.anIntArrayArray179[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg6 == 0) {
					if (local69 - 1 == local74 && local79 == local64) {
						return true;
					}
					if (local74 == local69 && local79 + 1 == local64) {
						return true;
					}
					if (local74 == local69 + 1 && local79 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local74 && local64 == local79 - 1 && (this.anIntArrayArray179[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local74 == local69 - 1 && local64 == local79 && (this.anIntArrayArray179[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 && local79 + 1 == local64) {
						return true;
					}
					if (local69 + 1 == local74 && local64 == local79) {
						return true;
					}
					if (local74 == local69 && local79 - 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local69 - 1 == local74 && local64 == local79 && (this.anIntArrayArray179[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local74 && local79 + 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 == local79) {
						return true;
					}
					if (local69 == local74 && local79 - 1 == local64) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local74 == local69 - 1 && local64 == local79) {
						return true;
					}
					if (local69 == local74 && local64 == local79 + 1 && (this.anIntArrayArray179[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local79 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local69 && local64 == local79 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local74 == local69 && local79 + 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 == local74 && local79 - 1 == local64 && (this.anIntArrayArray179[local74][local64] & 0x2) == 0) {
					return true;
				}
				if (local74 == local69 - 1 && local64 == local79 && (this.anIntArrayArray179[local74][local64] & 0x8) == 0) {
					return true;
				}
				if (local74 == local69 + 1 && local79 == local64 && (this.anIntArrayArray179[local74][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(808) int local808 = local74 + arg2 - 1;
			@Pc(815) int local815 = local64 + arg2 - 1;
			if (arg1 == 0) {
				if (arg6 == 0) {
					if (local69 - arg2 == local74 && local64 <= local79 && local79 <= local815) {
						return true;
					}
					if (local69 >= local74 && local69 <= local808 && local79 + 1 == local64 && (this.anIntArrayArray179[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 <= local69 && local69 <= local808 && local64 == local79 - arg2 && (this.anIntArrayArray179[local69][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local74 <= local69 && local69 <= local808 && local64 == local79 + 1) {
						return true;
					}
					if (local74 == local69 - arg2 && local64 <= local79 && local815 >= local79 && (this.anIntArrayArray179[local808][local79] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local69 + 1 && local64 <= local79 && local79 <= local815 && (this.anIntArrayArray179[local74][local79] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local74 == local69 + 1 && local64 <= local79 && local79 <= local815) {
						return true;
					}
					if (local74 <= local69 && local69 <= local808 && local64 == local79 + 1 && (this.anIntArrayArray179[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 <= local69 && local69 <= local808 && local64 == local79 - arg2 && (this.anIntArrayArray179[local69][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local74 <= local69 && local808 >= local69 && local79 - arg2 == local64) {
						return true;
					}
					if (local69 - arg2 == local74 && local79 >= local64 && local815 >= local79 && (this.anIntArrayArray179[local808][local79] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local74 && local64 <= local79 && local815 >= local79 && (this.anIntArrayArray179[local74][local79] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg6 == 0) {
					if (local69 - arg2 == local74 && local64 <= local79 && local815 >= local79) {
						return true;
					}
					if (local69 >= local74 && local808 >= local69 && local64 == local79 + 1) {
						return true;
					}
					if (local69 + 1 == local74 && local64 <= local79 && local79 <= local815 && (this.anIntArrayArray179[local74][local79] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 <= local69 && local69 <= local808 && local79 - arg2 == local64 && (this.anIntArrayArray179[local69][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local74 == local69 - arg2 && local79 >= local64 && local79 <= local815 && (this.anIntArrayArray179[local808][local79] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 <= local69 && local69 <= local808 && local64 == local79 + 1) {
						return true;
					}
					if (local74 == local69 + 1 && local79 >= local64 && local79 <= local815) {
						return true;
					}
					if (local74 <= local69 && local808 >= local69 && local79 - arg2 == local64 && (this.anIntArrayArray179[local69][local815] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local69 - arg2 == local74 && local64 <= local79 && local815 >= local79 && (this.anIntArrayArray179[local808][local79] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 >= local74 && local69 <= local808 && local79 + 1 == local64 && (this.anIntArrayArray179[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local74 && local79 >= local64 && local815 >= local79) {
						return true;
					}
					if (local74 <= local69 && local69 <= local808 && local79 - arg2 == local64) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local69 - arg2 == local74 && local79 >= local64 && local79 <= local815) {
						return true;
					}
					if (local74 <= local69 && local808 >= local69 && local64 == local79 + 1 && (this.anIntArrayArray179[local69][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local74 && local64 <= local79 && local815 >= local79 && (this.anIntArrayArray179[local74][local79] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 >= local74 && local808 >= local69 && local64 == local79 - arg2) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local69 >= local74 && local69 <= local808 && local79 + 1 == local64 && (this.anIntArrayArray179[local69][local64] & 0x2C0120) == 0) {
					return true;
				}
				if (local69 >= local74 && local808 >= local69 && local79 - arg2 == local64 && (this.anIntArrayArray179[local69][local815] & 0x2C0102) == 0) {
					return true;
				}
				if (local74 == local69 - arg2 && local64 <= local79 && local79 <= local815 && (this.anIntArrayArray179[local808][local79] & 0x2C0108) == 0) {
					return true;
				}
				if (local69 + 1 == local74 && local64 <= local79 && local815 >= local79 && (this.anIntArrayArray179[local74][local79] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method5261() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6863; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt6871; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt6863 - 5 <= local3 || this.anInt6871 - 5 <= local7) {
					this.anIntArrayArray179[local3][local7] = -1;
				} else {
					this.anIntArrayArray179[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIII)V")
	private void method5263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray179[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIBIIII)Z")
	public boolean method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static177.method2368(arg1, arg4, arg5, arg0, arg7, arg6, arg5, arg3) ? true : this.method5266(arg7, arg6, arg1, arg5, arg5, arg0, arg2, arg3, arg4);
		}
		@Pc(48) int local48 = arg3 + arg6 - 1;
		@Pc(54) int local54 = arg1 + arg0 - 1;
		if (arg3 <= arg4 && arg4 <= local48 && arg1 <= arg7 && arg7 <= local54) {
			return true;
		} else if (arg3 - 1 == arg4 && arg7 >= arg1 && local54 >= arg7 && (this.anIntArrayArray179[arg4 - this.anInt6878][arg7 - this.anInt6866] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local48 + 1 == arg4 && arg7 >= arg1 && local54 >= arg7 && (this.anIntArrayArray179[arg4 - this.anInt6878][arg7 - this.anInt6866] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg7 && arg4 >= arg3 && arg4 <= local48 && (this.anIntArrayArray179[arg4 - this.anInt6878][arg7 - this.anInt6866] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local54 + 1 && arg4 >= arg3 && local48 >= arg4 && (this.anIntArrayArray179[arg4 - this.anInt6878][arg7 - this.anInt6866] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIZIZ)V")
	public void method5265(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt6878;
		@Pc(13) int local13 = arg3 - this.anInt6866;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method5274(128, local13, local4);
				this.method5274(8, local13, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5274(2, local13, local4);
				this.method5274(32, local13 + 1, local4);
			}
			if (arg0 == 2) {
				this.method5274(8, local13, local4);
				this.method5274(128, local13, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5274(32, local13, local4);
				this.method5274(2, local13 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method5274(1, local13, local4);
				this.method5274(16, local13 + 1, local4 + -1);
			}
			if (arg0 == 1) {
				this.method5274(4, local13, local4);
				this.method5274(64, local13 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5274(16, local13, local4);
				this.method5274(1, local13 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5274(64, local13, local4);
				this.method5274(4, local13 - 1, local4 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method5274(130, local13, local4);
				this.method5274(8, local13, local4 - 1);
				this.method5274(32, local13 + 1, local4);
			}
			if (arg0 == 1) {
				this.method5274(10, local13, local4);
				this.method5274(32, local13 + 1, local4);
				this.method5274(128, local13, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5274(40, local13, local4);
				this.method5274(128, local13, local4 + 1);
				this.method5274(2, local13 - 1, local4);
			}
			if (arg0 == 3) {
				this.method5274(160, local13, local4);
				this.method5274(2, local13 - 1, local4);
				this.method5274(8, local13, local4 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method5274(65536, local13, local4);
					this.method5274(4096, local13, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5274(1024, local13, local4);
					this.method5274(16384, local13 + 1, local4);
				}
				if (arg0 == 2) {
					this.method5274(4096, local13, local4);
					this.method5274(65536, local13, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5274(16384, local13, local4);
					this.method5274(1024, local13 - 1, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method5274(512, local13, local4);
					this.method5274(8192, local13 + 1, local4 + -1);
				}
				if (arg0 == 1) {
					this.method5274(2048, local13, local4);
					this.method5274(32768, local13 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5274(8192, local13, local4);
					this.method5274(512, local13 - 1, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5274(32768, local13, local4);
					this.method5274(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method5274(66560, local13, local4);
					this.method5274(4096, local13, local4 - 1);
					this.method5274(16384, local13 + 1, local4);
				}
				if (arg0 == 1) {
					this.method5274(5120, local13, local4);
					this.method5274(16384, local13 + 1, local4);
					this.method5274(65536, local13, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5274(20480, local13, local4);
					this.method5274(65536, local13, local4 + 1);
					this.method5274(1024, local13 - 1, local4);
				}
				if (arg0 == 3) {
					this.method5274(81920, local13, local4);
					this.method5274(1024, local13 - 1, local4);
					this.method5274(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method5274(536870912, local13, local4);
				this.method5274(33554432, local13, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5274(8388608, local13, local4);
				this.method5274(134217728, local13 + 1, local4);
			}
			if (arg0 == 2) {
				this.method5274(33554432, local13, local4);
				this.method5274(536870912, local13, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5274(134217728, local13, local4);
				this.method5274(8388608, local13 - 1, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method5274(4194304, local13, local4);
				this.method5274(67108864, local13 + 1, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5274(16777216, local13, local4);
				this.method5274(268435456, local13 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5274(67108864, local13, local4);
				this.method5274(4194304, local13 - 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5274(268435456, local13, local4);
				this.method5274(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5274(545259520, local13, local4);
			this.method5274(33554432, local13, local4 - 1);
			this.method5274(134217728, local13 + 1, local4);
		}
		if (arg0 == 1) {
			this.method5274(41943040, local13, local4);
			this.method5274(134217728, local13 + 1, local4);
			this.method5274(536870912, local13, local4 + 1);
		}
		if (arg0 == 2) {
			this.method5274(167772160, local13, local4);
			this.method5274(536870912, local13, local4 + 1);
			this.method5274(8388608, local13 - 1, local4);
		}
		if (arg0 == 3) {
			this.method5274(671088640, local13, local4);
			this.method5274(8388608, local13 - 1, local4);
			this.method5274(33554432, local13, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21 = arg3 + arg8;
		@Pc(26) int local26 = arg0 + arg4;
		@Pc(31) int local31 = arg7 + arg1;
		@Pc(35) int local35 = arg5 + arg2;
		@Pc(49) int local49;
		@Pc(56) int local56;
		if (local31 == arg8 && (arg6 & 0x2) == 0) {
			local49 = arg0 <= arg2 ? arg2 : arg0;
			local56 = local26 >= local35 ? local35 : local26;
			while (local56 > local49) {
				if ((this.anIntArrayArray179[local31 - this.anInt6878 - 1][local49 - this.anInt6866] & 0x8) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local21 == arg7 && (arg6 & 0x8) == 0) {
			local49 = arg0 <= arg2 ? arg2 : arg0;
			local56 = local26 >= local35 ? local35 : local26;
			while (local56 > local49) {
				if ((this.anIntArrayArray179[arg7 - this.anInt6878][local49 - this.anInt6866] & 0x80) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg0 == local35 && (arg6 & 0x1) == 0) {
			local49 = arg8 > arg7 ? arg8 : arg7;
			local56 = local31 <= local21 ? local31 : local21;
			while (local56 > local49) {
				if ((this.anIntArrayArray179[local49 - this.anInt6878][local35 - this.anInt6866 - 1] & 0x2) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg2 == local26 && (arg6 & 0x4) == 0) {
			local49 = arg7 >= arg8 ? arg7 : arg8;
			local56 = local31 > local21 ? local21 : local31;
			while (local49 < local56) {
				if ((this.anIntArrayArray179[local49 - this.anInt6878][arg2 - this.anInt6866] & 0x20) == 0) {
					return true;
				}
				local49++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method5267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6866;
		@Pc(13) int local13 = arg0 - this.anInt6878;
		this.anIntArrayArray179[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public void method5268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6878;
		@Pc(13) int local13 = arg0 - this.anInt6866;
		this.anIntArrayArray179[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZBIIZII)V")
	public void method5269(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt6878;
		@Pc(13) int local13 = arg1 - this.anInt6866;
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method5263(128, local8, local13);
				this.method5263(8, local8 - 1, local13);
			}
			if (arg5 == 1) {
				this.method5263(2, local8, local13);
				this.method5263(32, local8, local13 + 1);
			}
			if (arg5 == 2) {
				this.method5263(8, local8, local13);
				this.method5263(128, local8 + 1, local13);
			}
			if (arg5 == 3) {
				this.method5263(32, local8, local13);
				this.method5263(2, local8, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method5263(1, local8, local13);
				this.method5263(16, local8 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method5263(4, local8, local13);
				this.method5263(64, local8 + 1, local13 - -1);
			}
			if (arg5 == 2) {
				this.method5263(16, local8, local13);
				this.method5263(1, local8 + 1, local13 + -1);
			}
			if (arg5 == 3) {
				this.method5263(64, local8, local13);
				this.method5263(4, local8 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				this.method5263(130, local8, local13);
				this.method5263(8, local8 - 1, local13);
				this.method5263(32, local8, local13 + 1);
			}
			if (arg5 == 1) {
				this.method5263(10, local8, local13);
				this.method5263(32, local8, local13 + 1);
				this.method5263(128, local8 + 1, local13);
			}
			if (arg5 == 2) {
				this.method5263(40, local8, local13);
				this.method5263(128, local8 + 1, local13);
				this.method5263(2, local8, local13 - 1);
			}
			if (arg5 == 3) {
				this.method5263(160, local8, local13);
				this.method5263(2, local8, local13 - 1);
				this.method5263(8, local8 - 1, local13);
			}
		}
		if (arg3) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					this.method5263(65536, local8, local13);
					this.method5263(4096, local8 - 1, local13);
				}
				if (arg5 == 1) {
					this.method5263(1024, local8, local13);
					this.method5263(16384, local8, local13 + 1);
				}
				if (arg5 == 2) {
					this.method5263(4096, local8, local13);
					this.method5263(65536, local8 + 1, local13);
				}
				if (arg5 == 3) {
					this.method5263(16384, local8, local13);
					this.method5263(1024, local8, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg5 == 0) {
					this.method5263(512, local8, local13);
					this.method5263(8192, local8 - 1, local13 + 1);
				}
				if (arg5 == 1) {
					this.method5263(2048, local8, local13);
					this.method5263(32768, local8 + 1, local13 + 1);
				}
				if (arg5 == 2) {
					this.method5263(8192, local8, local13);
					this.method5263(512, local8 + 1, local13 + -1);
				}
				if (arg5 == 3) {
					this.method5263(32768, local8, local13);
					this.method5263(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					this.method5263(66560, local8, local13);
					this.method5263(4096, local8 - 1, local13);
					this.method5263(16384, local8, local13 + 1);
				}
				if (arg5 == 1) {
					this.method5263(5120, local8, local13);
					this.method5263(16384, local8, local13 + 1);
					this.method5263(65536, local8 + 1, local13);
				}
				if (arg5 == 2) {
					this.method5263(20480, local8, local13);
					this.method5263(65536, local8 + 1, local13);
					this.method5263(1024, local8, local13 - 1);
				}
				if (arg5 == 3) {
					this.method5263(81920, local8, local13);
					this.method5263(1024, local8, local13 - 1);
					this.method5263(4096, local8 - 1, local13);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method5263(536870912, local8, local13);
				this.method5263(33554432, local8 - 1, local13);
			}
			if (arg5 == 1) {
				this.method5263(8388608, local8, local13);
				this.method5263(134217728, local8, local13 + 1);
			}
			if (arg5 == 2) {
				this.method5263(33554432, local8, local13);
				this.method5263(536870912, local8 + 1, local13);
			}
			if (arg5 == 3) {
				this.method5263(134217728, local8, local13);
				this.method5263(8388608, local8, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method5263(4194304, local8, local13);
				this.method5263(67108864, local8 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method5263(16777216, local8, local13);
				this.method5263(268435456, local8 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method5263(67108864, local8, local13);
				this.method5263(4194304, local8 + 1, local13 + -1);
			}
			if (arg5 == 3) {
				this.method5263(268435456, local8, local13);
				this.method5263(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method5263(545259520, local8, local13);
			this.method5263(33554432, local8 - 1, local13);
			this.method5263(134217728, local8, local13 + 1);
		}
		if (arg5 == 1) {
			this.method5263(41943040, local8, local13);
			this.method5263(134217728, local8, local13 + 1);
			this.method5263(536870912, local8 + 1, local13);
		}
		if (arg5 == 2) {
			this.method5263(167772160, local8, local13);
			this.method5263(536870912, local8 + 1, local13);
			this.method5263(8388608, local8, local13 - 1);
		}
		if (arg5 == 3) {
			this.method5263(671088640, local8, local13);
			this.method5263(8388608, local8, local13 - 1);
			this.method5263(33554432, local8 - 1, local13);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIBIIIZ)V")
	public void method5270(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(13) int local13 = 256;
		if (arg6) {
			local13 = 131328;
		}
		@Pc(29) int local29;
		if (arg2 == 1 || arg2 == 3) {
			local29 = arg1;
			arg1 = arg4;
			arg4 = local29;
		}
		@Pc(38) int local38 = arg3 - this.anInt6866;
		if (arg0) {
			local13 |= 0x40000000;
		}
		@Pc(49) int local49 = arg5 - this.anInt6878;
		for (local29 = local49; local29 < local49 + arg1; local29++) {
			if (local29 >= 0 && this.anInt6863 > local29) {
				for (@Pc(64) int local64 = local38; local64 < local38 + arg4; local64++) {
					if (local64 >= 0 && local64 < this.anInt6871) {
						this.method5274(local13, local64, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIZIIZ)V")
	public void method5271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg4 - this.anInt6866;
		@Pc(29) int local29 = arg3 - this.anInt6878;
		for (@Pc(31) int local31 = local29; local31 < local29 + arg1; local31++) {
			if (local31 >= 0 && local31 < this.anInt6863) {
				for (@Pc(48) int local48 = local24; local48 < local24 + arg0; local48++) {
					if (local48 >= 0 && local48 < this.anInt6871) {
						this.method5263(local7, local31, local48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg4 && arg5 == arg1) {
				return true;
			}
		} else if (arg4 <= arg2 && arg4 + arg0 - 1 >= arg2 && arg5 <= arg5 && arg5 <= arg5 + arg0 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg1 - this.anInt6866;
		@Pc(64) int local64 = arg2 - this.anInt6878;
		@Pc(69) int local69 = arg5 - this.anInt6866;
		@Pc(74) int local74 = arg4 - this.anInt6878;
		if (arg0 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local74 == local64 + 1 && local59 == local69 && (this.anIntArrayArray179[local74][local59] & 0x80) == 0) {
						return true;
					}
					if (local64 == local74 && local69 - 1 == local59 && (this.anIntArrayArray179[local74][local59] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 - 1 == local74 && local59 == local69 && (this.anIntArrayArray179[local74][local59] & 0x8) == 0) {
						return true;
					}
					if (local74 == local64 && local59 == local69 - 1 && (this.anIntArrayArray179[local74][local59] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local74 == local64 - 1 && local69 == local59 && (this.anIntArrayArray179[local74][local59] & 0x8) == 0) {
						return true;
					}
					if (local64 == local74 && local69 + 1 == local59 && (this.anIntArrayArray179[local74][local59] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local64 + 1 == local74 && local69 == local59 && (this.anIntArrayArray179[local74][local59] & 0x80) == 0) {
						return true;
					}
					if (local64 == local74 && local69 + 1 == local59 && (this.anIntArrayArray179[local74][local59] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local64 == local74 && local69 + 1 == local59 && (this.anIntArrayArray179[local74][local59] & 0x20) == 0) {
					return true;
				}
				if (local64 == local74 && local59 == local69 - 1 && (this.anIntArrayArray179[local74][local59] & 0x2) == 0) {
					return true;
				}
				if (local64 - 1 == local74 && local59 == local69 && (this.anIntArrayArray179[local74][local59] & 0x8) == 0) {
					return true;
				}
				if (local74 == local64 + 1 && local69 == local59 && (this.anIntArrayArray179[local74][local59] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = local74 + arg0 - 1;
			@Pc(90) int local90 = arg0 + local59 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local64 + 1 == local74 && local69 >= local59 && local90 >= local69 && (this.anIntArrayArray179[local74][local69] & 0x80) == 0) {
						return true;
					}
					if (local74 <= local64 && local84 >= local64 && local59 == local69 - arg0 && (this.anIntArrayArray179[local64][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local74 == local64 - arg0 && local59 <= local69 && local69 <= local90 && (this.anIntArrayArray179[local84][local69] & 0x8) == 0) {
						return true;
					}
					if (local64 >= local74 && local64 <= local84 && local69 - arg0 == local59 && (this.anIntArrayArray179[local64][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local64 - arg0 == local74 && local59 <= local69 && local69 <= local90 && (this.anIntArrayArray179[local84][local69] & 0x8) == 0) {
						return true;
					}
					if (local74 <= local64 && local84 >= local64 && local59 == local69 + 1 && (this.anIntArrayArray179[local64][local59] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local74 == local64 + 1 && local69 >= local59 && local90 >= local69 && (this.anIntArrayArray179[local74][local69] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local74 && local84 >= local64 && local59 == local69 + 1 && (this.anIntArrayArray179[local64][local59] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local64 >= local74 && local84 >= local64 && local69 + 1 == local59 && (this.anIntArrayArray179[local64][local59] & 0x20) == 0) {
					return true;
				}
				if (local74 <= local64 && local84 >= local64 && local69 - arg0 == local59 && (this.anIntArrayArray179[local64][local90] & 0x2) == 0) {
					return true;
				}
				if (local64 - arg0 == local74 && local69 >= local59 && local90 >= local69 && (this.anIntArrayArray179[local84][local69] & 0x8) == 0) {
					return true;
				}
				if (local74 == local64 + 1 && local59 <= local69 && local69 <= local90 && (this.anIntArrayArray179[local74][local69] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZ)V")
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6866;
		@Pc(9) int local9 = arg1 - this.anInt6878;
		this.anIntArrayArray179[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	private void method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray179[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(III)V")
	public void method5275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt6878;
		@Pc(19) int local19 = arg0 - this.anInt6866;
		this.anIntArrayArray179[local10][local19] |= 0x40000;
	}
}

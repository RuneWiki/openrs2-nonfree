import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class154 {

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	private int anInt4882;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	private int anInt4879;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	private int anInt4881;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	private int anInt4889;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4882 = arg1;
		this.anInt4879 = 0;
		this.anInt4881 = arg0;
		this.anIntArrayArray32 = new int[this.anInt4881][this.anInt4882];
		this.anInt4889 = 0;
		this.method3909();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	public void method3905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4889;
		@Pc(13) int local13 = arg0 - this.anInt4879;
		this.anIntArrayArray32[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method3907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg4 && arg3 == arg0) {
				return true;
			}
		} else if (arg4 <= arg2 && arg2 <= arg4 + arg6 - 1 && arg0 <= arg0 && arg0 <= arg6 + arg0 - 1) {
			return true;
		}
		@Pc(66) int local66 = arg2 - this.anInt4879;
		@Pc(71) int local71 = arg3 - this.anInt4889;
		@Pc(76) int local76 = arg0 - this.anInt4889;
		@Pc(81) int local81 = arg4 - this.anInt4879;
		if (arg6 == 1) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local81 == local66 - 1 && local71 == local76) {
						return true;
					}
					if (local81 == local66 && local76 + 1 == local71 && (this.anIntArrayArray32[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local81 && local71 == local76 - 1 && (this.anIntArrayArray32[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 == local81 && local76 + 1 == local71) {
						return true;
					}
					if (local66 - 1 == local81 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local66 + 1 && local76 == local71 && (this.anIntArrayArray32[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 + 1 == local81 && local76 == local71) {
						return true;
					}
					if (local81 == local66 && local76 + 1 == local71 && (this.anIntArrayArray32[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 == local66 && local71 == local76 - 1 && (this.anIntArrayArray32[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local81 == local66 && local76 - 1 == local71) {
						return true;
					}
					if (local66 - 1 == local81 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local66 + 1 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local81 == local66 - 1 && local71 == local76) {
						return true;
					}
					if (local81 == local66 && local76 + 1 == local71) {
						return true;
					}
					if (local81 == local66 + 1 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local81 && local76 - 1 == local71 && (this.anIntArrayArray32[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 - 1 == local81 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local81 && local71 == local76 + 1) {
						return true;
					}
					if (local66 + 1 == local81 && local71 == local76) {
						return true;
					}
					if (local81 == local66 && local76 - 1 == local71 && (this.anIntArrayArray32[local81][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 - 1 == local81 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local66 && local71 == local76 + 1 && (this.anIntArrayArray32[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 == local66 + 1 && local71 == local76) {
						return true;
					}
					if (local66 == local81 && local76 - 1 == local71) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local81 == local66 - 1 && local71 == local76) {
						return true;
					}
					if (local66 == local81 && local76 + 1 == local71 && (this.anIntArrayArray32[local81][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local81 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local81 && local71 == local76 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local81 == local66 && local76 + 1 == local71 && (this.anIntArrayArray32[local81][local71] & 0x20) == 0) {
					return true;
				}
				if (local66 == local81 && local71 == local76 - 1 && (this.anIntArrayArray32[local81][local71] & 0x2) == 0) {
					return true;
				}
				if (local81 == local66 - 1 && local76 == local71 && (this.anIntArrayArray32[local81][local71] & 0x8) == 0) {
					return true;
				}
				if (local81 == local66 + 1 && local71 == local76 && (this.anIntArrayArray32[local81][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(93) int local93 = local81 + arg6 - 1;
			@Pc(100) int local100 = local71 + arg6 - 1;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local81 == local66 - arg6 && local76 >= local71 && local76 <= local100) {
						return true;
					}
					if (local66 >= local81 && local93 >= local66 && local76 + 1 == local71 && (this.anIntArrayArray32[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 <= local66 && local93 >= local66 && local76 - arg6 == local71 && (this.anIntArrayArray32[local66][local100] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local81 <= local66 && local93 >= local66 && local71 == local76 + 1) {
						return true;
					}
					if (local81 == local66 - arg6 && local71 <= local76 && local76 <= local100 && (this.anIntArrayArray32[local93][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 == local66 + 1 && local71 <= local76 && local100 >= local76 && (this.anIntArrayArray32[local81][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 + 1 == local81 && local76 >= local71 && local100 >= local76) {
						return true;
					}
					if (local66 >= local81 && local66 <= local93 && local76 + 1 == local71 && (this.anIntArrayArray32[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 <= local66 && local93 >= local66 && local71 == local76 - arg6 && (this.anIntArrayArray32[local66][local100] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local66 >= local81 && local66 <= local93 && local71 == local76 - arg6) {
						return true;
					}
					if (local81 == local66 - arg6 && local71 <= local76 && local76 <= local100 && (this.anIntArrayArray32[local93][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local81 && local71 <= local76 && local100 >= local76 && (this.anIntArrayArray32[local81][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local66 - arg6 == local81 && local76 >= local71 && local100 >= local76) {
						return true;
					}
					if (local66 >= local81 && local66 <= local93 && local71 == local76 + 1) {
						return true;
					}
					if (local66 + 1 == local81 && local76 >= local71 && local76 <= local100 && (this.anIntArrayArray32[local81][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local81 && local66 <= local93 && local71 == local76 - arg6 && (this.anIntArrayArray32[local66][local100] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local81 == local66 - arg6 && local76 >= local71 && local100 >= local76 && (this.anIntArrayArray32[local93][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local81 <= local66 && local66 <= local93 && local71 == local76 + 1) {
						return true;
					}
					if (local81 == local66 + 1 && local71 <= local76 && local76 <= local100) {
						return true;
					}
					if (local66 >= local81 && local66 <= local93 && local71 == local76 - arg6 && (this.anIntArrayArray32[local66][local100] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 - arg6 == local81 && local71 <= local76 && local100 >= local76 && (this.anIntArrayArray32[local93][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 >= local81 && local93 >= local66 && local76 + 1 == local71 && (this.anIntArrayArray32[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 == local66 + 1 && local76 >= local71 && local76 <= local100) {
						return true;
					}
					if (local81 <= local66 && local93 >= local66 && local71 == local76 - arg6) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local81 == local66 - arg6 && local76 >= local71 && local100 >= local76) {
						return true;
					}
					if (local66 >= local81 && local93 >= local66 && local76 + 1 == local71 && (this.anIntArrayArray32[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local81 == local66 + 1 && local76 >= local71 && local76 <= local100 && (this.anIntArrayArray32[local81][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local81 <= local66 && local93 >= local66 && local71 == local76 - arg6) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local81 <= local66 && local66 <= local93 && local76 + 1 == local71 && (this.anIntArrayArray32[local66][local71] & 0x2C0120) == 0) {
					return true;
				}
				if (local66 >= local81 && local93 >= local66 && local76 - arg6 == local71 && (this.anIntArrayArray32[local66][local100] & 0x2C0102) == 0) {
					return true;
				}
				if (local81 == local66 - arg6 && local71 <= local76 && local76 <= local100 && (this.anIntArrayArray32[local93][local76] & 0x2C0108) == 0) {
					return true;
				}
				if (local66 + 1 == local81 && local71 <= local76 && local76 <= local100 && (this.anIntArrayArray32[local81][local76] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZZIZI)V")
	public void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt4879;
		@Pc(9) int local9 = arg0 - this.anInt4889;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method3924(local9, 128, local4);
				this.method3924(local9, 8, local4 - 1);
			}
			if (arg3 == 1) {
				this.method3924(local9, 2, local4);
				this.method3924(local9 + 1, 32, local4);
			}
			if (arg3 == 2) {
				this.method3924(local9, 8, local4);
				this.method3924(local9, 128, local4 + 1);
			}
			if (arg3 == 3) {
				this.method3924(local9, 32, local4);
				this.method3924(local9 - 1, 2, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method3924(local9, 1, local4);
				this.method3924(local9 + 1, 16, local4 - 1);
			}
			if (arg3 == 1) {
				this.method3924(local9, 4, local4);
				this.method3924(local9 + 1, 64, local4 + 1);
			}
			if (arg3 == 2) {
				this.method3924(local9, 16, local4);
				this.method3924(local9 - 1, 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method3924(local9, 64, local4);
				this.method3924(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method3924(local9, 130, local4);
				this.method3924(local9, 8, local4 - 1);
				this.method3924(local9 + 1, 32, local4);
			}
			if (arg3 == 1) {
				this.method3924(local9, 10, local4);
				this.method3924(local9 + 1, 32, local4);
				this.method3924(local9, 128, local4 + 1);
			}
			if (arg3 == 2) {
				this.method3924(local9, 40, local4);
				this.method3924(local9, 128, local4 + 1);
				this.method3924(local9 - 1, 2, local4);
			}
			if (arg3 == 3) {
				this.method3924(local9, 160, local4);
				this.method3924(local9 - 1, 2, local4);
				this.method3924(local9, 8, local4 - 1);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					this.method3924(local9, 65536, local4);
					this.method3924(local9, 4096, local4 - 1);
				}
				if (arg3 == 1) {
					this.method3924(local9, 1024, local4);
					this.method3924(local9 + 1, 16384, local4);
				}
				if (arg3 == 2) {
					this.method3924(local9, 4096, local4);
					this.method3924(local9, 65536, local4 + 1);
				}
				if (arg3 == 3) {
					this.method3924(local9, 16384, local4);
					this.method3924(local9 - 1, 1024, local4);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg3 == 0) {
					this.method3924(local9, 512, local4);
					this.method3924(local9 + 1, 8192, local4 - 1);
				}
				if (arg3 == 1) {
					this.method3924(local9, 2048, local4);
					this.method3924(local9 + 1, 32768, local4 + 1);
				}
				if (arg3 == 2) {
					this.method3924(local9, 8192, local4);
					this.method3924(local9 - 1, 512, local4 + 1);
				}
				if (arg3 == 3) {
					this.method3924(local9, 32768, local4);
					this.method3924(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					this.method3924(local9, 66560, local4);
					this.method3924(local9, 4096, local4 - 1);
					this.method3924(local9 + 1, 16384, local4);
				}
				if (arg3 == 1) {
					this.method3924(local9, 5120, local4);
					this.method3924(local9 + 1, 16384, local4);
					this.method3924(local9, 65536, local4 + 1);
				}
				if (arg3 == 2) {
					this.method3924(local9, 20480, local4);
					this.method3924(local9, 65536, local4 + 1);
					this.method3924(local9 - 1, 1024, local4);
				}
				if (arg3 == 3) {
					this.method3924(local9, 81920, local4);
					this.method3924(local9 - 1, 1024, local4);
					this.method3924(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method3924(local9, 536870912, local4);
				this.method3924(local9, 33554432, local4 - 1);
			}
			if (arg3 == 1) {
				this.method3924(local9, 8388608, local4);
				this.method3924(local9 + 1, 134217728, local4);
			}
			if (arg3 == 2) {
				this.method3924(local9, 33554432, local4);
				this.method3924(local9, 536870912, local4 + 1);
			}
			if (arg3 == 3) {
				this.method3924(local9, 134217728, local4);
				this.method3924(local9 - 1, 8388608, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method3924(local9, 4194304, local4);
				this.method3924(local9 + 1, 67108864, local4 - 1);
			}
			if (arg3 == 1) {
				this.method3924(local9, 16777216, local4);
				this.method3924(local9 + 1, 268435456, local4 + 1);
			}
			if (arg3 == 2) {
				this.method3924(local9, 67108864, local4);
				this.method3924(local9 - 1, 4194304, local4 + 1);
			}
			if (arg3 == 3) {
				this.method3924(local9, 268435456, local4);
				this.method3924(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method3924(local9, 545259520, local4);
			this.method3924(local9, 33554432, local4 - 1);
			this.method3924(local9 + 1, 134217728, local4);
		}
		if (arg3 == 1) {
			this.method3924(local9, 41943040, local4);
			this.method3924(local9 + 1, 134217728, local4);
			this.method3924(local9, 536870912, local4 + 1);
		}
		if (arg3 == 2) {
			this.method3924(local9, 167772160, local4);
			this.method3924(local9, 536870912, local4 + 1);
			this.method3924(local9 - 1, 8388608, local4);
		}
		if (arg3 == 3) {
			this.method3924(local9, 671088640, local4);
			this.method3924(local9 - 1, 8388608, local4);
			this.method3924(local9, 33554432, local4 - 1);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public void method3909() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4881; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt4882; local13++) {
				if (local7 == 0 || local13 == 0 || local7 >= this.anInt4881 - 5 || this.anInt4882 - 5 <= local13) {
					this.anIntArrayArray32[local7][local13] = 16777215;
				} else {
					this.anIntArrayArray32[local7][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 <= 1) {
			@Pc(43) int local43 = arg7 + arg1 - 1;
			@Pc(49) int local49 = arg6 + arg4 - 1;
			if (arg0 >= arg7 && local43 >= arg0 && arg4 <= arg2 && arg2 <= local49) {
				return true;
			} else if (arg0 == arg7 - 1 && arg4 <= arg2 && local49 >= arg2 && (this.anIntArrayArray32[arg0 - this.anInt4879][arg2 - this.anInt4889] & 0x8) == 0 && (arg3 & 0x8) == 0) {
				return true;
			} else if (arg0 == local43 + 1 && arg4 <= arg2 && local49 >= arg2 && (this.anIntArrayArray32[arg0 - this.anInt4879][arg2 - this.anInt4889] & 0x80) == 0 && (arg3 & 0x2) == 0) {
				return true;
			} else if (arg4 - 1 == arg2 && arg7 <= arg0 && arg0 <= local43 && (this.anIntArrayArray32[arg0 - this.anInt4879][arg2 - this.anInt4889] & 0x2) == 0 && (arg3 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local49 + 1 && arg7 <= arg0 && local43 >= arg0 && (this.anIntArrayArray32[arg0 - this.anInt4879][arg2 - this.anInt4889] & 0x20) == 0 && (arg3 & 0x1) == 0;
			}
		} else if (Static88.method1569(arg7, arg5, arg1, arg2, arg5, arg4, arg6, arg0)) {
			return true;
		} else {
			return this.method3923(arg1, arg7, arg2, arg4, arg5, arg3, arg6, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZIIZZII)V")
	public void method3912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg1 - this.anInt4889;
		@Pc(18) int local18 = 256;
		@Pc(29) int local29;
		if (arg6 == 1 || arg6 == 3) {
			local29 = arg5;
			arg5 = arg0;
			arg0 = local29;
		}
		@Pc(38) int local38 = arg2 - this.anInt4879;
		if (arg3) {
			local18 = 131328;
		}
		if (arg4) {
			local18 |= 0x40000000;
		}
		for (local29 = local38; local29 < local38 + arg5; local29++) {
			if (local29 >= 0 && this.anInt4881 > local29) {
				for (@Pc(68) int local68 = local10; local68 < local10 + arg0; local68++) {
					if (local68 >= 0 && local68 < this.anInt4882) {
						this.method3924(local68, local18, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)V")
	public void method3913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt4889;
		@Pc(17) int local17 = arg1 - this.anInt4879;
		this.anIntArrayArray32[local17][local12] |= 0x200000;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BIII)V")
	private void method3915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray32[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZIII)Z")
	public boolean method3921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == arg0 && arg3 == arg2) {
			return true;
		}
		@Pc(19) int local19 = arg0 - this.anInt4879;
		@Pc(24) int local24 = arg2 - this.anInt4889;
		if (local19 < 0 || this.anInt4881 <= local19 || local24 < 0 || local24 >= this.anInt4882) {
			return false;
		}
		@Pc(51) int local51 = arg3 - this.anInt4889;
		@Pc(62) int local62 = arg1 - this.anInt4879;
		if (local62 < 0 || local62 >= this.anInt4881 || local51 < 0 || local51 >= this.anInt4882) {
			return false;
		}
		@Pc(98) int local98;
		if (local19 > local62) {
			local98 = local19 - local62;
		} else {
			local98 = local62 - local19;
		}
		@Pc(112) int local112;
		if (local51 >= local24) {
			local112 = local51 - local24;
		} else {
			local112 = local24 - local51;
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		if (local98 > local112) {
			local128 = local112 * 65536 / local98;
			local130 = 32768;
			while (local19 != local62) {
				if (local19 > local62) {
					if ((this.anIntArrayArray32[local62][local51] & 0x2C0108) != 0) {
						return false;
					}
					local62++;
				} else if (local19 < local62) {
					if ((this.anIntArrayArray32[local62][local51] & 0x2C0180) != 0) {
						return false;
					}
					local62--;
				}
				local130 += local128;
				if (local130 >= 65536) {
					local130 -= 65536;
					if (local51 < local24) {
						if ((this.anIntArrayArray32[local62][local51] & 0x2C0102) != 0) {
							return false;
						}
						local51++;
					} else if (local51 > local24) {
						if ((this.anIntArrayArray32[local62][local51] & 0x2C0120) != 0) {
							return false;
						}
						local51--;
					}
				}
			}
		} else {
			local128 = local98 * 65536 / local112;
			local130 = 32768;
			while (local24 != local51) {
				if (local24 > local51) {
					if ((this.anIntArrayArray32[local62][local51] & 0x2C0102) != 0) {
						return false;
					}
					local51++;
				} else if (local24 < local51) {
					if ((this.anIntArrayArray32[local62][local51] & 0x2C0120) != 0) {
						return false;
					}
					local51--;
				}
				local130 += local128;
				if (local130 >= 65536) {
					local130 -= 65536;
					if (local19 > local62) {
						if ((this.anIntArrayArray32[local62][local51] & 0x2C0108) != 0) {
							return false;
						}
						local62++;
					} else if (local19 < local62) {
						if ((this.anIntArrayArray32[local62][local51] & 0x2C0180) != 0) {
							return false;
						}
						local62--;
					}
				}
			}
		}
		return (this.anIntArrayArray32[local19][local24] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg7;
		@Pc(18) int local18 = arg8 + arg2;
		@Pc(22) int local22 = arg0 + arg1;
		@Pc(27) int local27 = arg3 + arg6;
		@Pc(59) int local59;
		@Pc(70) int local70;
		if (local22 == arg7 && (arg5 & 0x2) == 0) {
			local59 = arg3 < arg2 ? arg2 : arg3;
			local70 = local18 < local27 ? local18 : local27;
			while (local59 < local70) {
				if ((this.anIntArrayArray32[local22 - this.anInt4879 - 1][local59 - this.anInt4889] & 0x8) == 0) {
					return true;
				}
				local59++;
			}
		} else if (local9 == arg1 && (arg5 & 0x8) == 0) {
			local59 = arg2 > arg3 ? arg2 : arg3;
			local70 = local27 > local18 ? local18 : local27;
			while (local70 > local59) {
				if ((this.anIntArrayArray32[arg1 - this.anInt4879][local59 - this.anInt4889] & 0x80) == 0) {
					return true;
				}
				local59++;
			}
		} else if (arg2 == local27 && (arg5 & 0x1) == 0) {
			local59 = arg7 > arg1 ? arg7 : arg1;
			local70 = local9 >= local22 ? local22 : local9;
			while (local70 > local59) {
				if ((this.anIntArrayArray32[local59 - this.anInt4879][local27 - this.anInt4889 - 1] & 0x2) == 0) {
					return true;
				}
				local59++;
			}
		} else if (arg3 == local18 && (arg5 & 0x4) == 0) {
			local59 = arg1 >= arg7 ? arg1 : arg7;
			local70 = local22 <= local9 ? local22 : local9;
			while (local70 > local59) {
				if ((this.anIntArrayArray32[local59 - this.anInt4879][arg3 - this.anInt4889] & 0x20) == 0) {
					return true;
				}
				local59++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)V")
	private void method3924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray32[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg0 && arg2 == arg4) {
				return true;
			}
		} else if (arg5 <= arg0 && arg0 <= arg6 + arg5 - 1 && arg4 >= arg4 && arg6 + arg4 - 1 >= arg4) {
			return true;
		}
		@Pc(64) int local64 = arg4 - this.anInt4889;
		@Pc(69) int local69 = arg5 - this.anInt4879;
		@Pc(74) int local74 = arg0 - this.anInt4879;
		@Pc(84) int local84 = arg2 - this.anInt4889;
		if (arg6 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local69 == local74 + 1 && local64 == local84 && (this.anIntArrayArray32[local69][local84] & 0x80) == 0) {
						return true;
					}
					if (local74 == local69 && local84 == local64 - 1 && (this.anIntArrayArray32[local69][local84] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local74 - 1 == local69 && local84 == local64 && (this.anIntArrayArray32[local69][local84] & 0x8) == 0) {
						return true;
					}
					if (local74 == local69 && local84 == local64 - 1 && (this.anIntArrayArray32[local69][local84] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local69 == local74 - 1 && local64 == local84 && (this.anIntArrayArray32[local69][local84] & 0x8) == 0) {
						return true;
					}
					if (local74 == local69 && local64 + 1 == local84 && (this.anIntArrayArray32[local69][local84] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local74 + 1 == local69 && local84 == local64 && (this.anIntArrayArray32[local69][local84] & 0x80) == 0) {
						return true;
					}
					if (local69 == local74 && local84 == local64 + 1 && (this.anIntArrayArray32[local69][local84] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local74 == local69 && local64 + 1 == local84 && (this.anIntArrayArray32[local69][local84] & 0x20) == 0) {
					return true;
				}
				if (local74 == local69 && local64 - 1 == local84 && (this.anIntArrayArray32[local69][local84] & 0x2) == 0) {
					return true;
				}
				if (local69 == local74 - 1 && local84 == local64 && (this.anIntArrayArray32[local69][local84] & 0x8) == 0) {
					return true;
				}
				if (local69 == local74 + 1 && local84 == local64 && (this.anIntArrayArray32[local69][local84] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(460) int local460 = arg6 + local84 - 1;
			@Pc(466) int local466 = arg6 + local69 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local69 == local74 + 1 && local64 >= local84 && local64 <= local460 && (this.anIntArrayArray32[local69][local64] & 0x80) == 0) {
						return true;
					}
					if (local69 <= local74 && local466 >= local74 && local84 == local64 - arg6 && (this.anIntArrayArray32[local74][local460] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local69 == local74 - arg6 && local84 <= local64 && local460 >= local64 && (this.anIntArrayArray32[local466][local64] & 0x8) == 0) {
						return true;
					}
					if (local74 >= local69 && local466 >= local74 && local64 - arg6 == local84 && (this.anIntArrayArray32[local74][local460] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local69 == local74 - arg6 && local64 >= local84 && local460 >= local64 && (this.anIntArrayArray32[local466][local64] & 0x8) == 0) {
						return true;
					}
					if (local74 >= local69 && local74 <= local466 && local64 + 1 == local84 && (this.anIntArrayArray32[local74][local84] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local69 == local74 + 1 && local64 >= local84 && local460 >= local64 && (this.anIntArrayArray32[local69][local64] & 0x80) == 0) {
						return true;
					}
					if (local69 <= local74 && local466 >= local74 && local84 == local64 + 1 && (this.anIntArrayArray32[local74][local84] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local69 <= local74 && local466 >= local74 && local64 + 1 == local84 && (this.anIntArrayArray32[local74][local84] & 0x20) == 0) {
					return true;
				}
				if (local74 >= local69 && local466 >= local74 && local64 - arg6 == local84 && (this.anIntArrayArray32[local74][local460] & 0x2) == 0) {
					return true;
				}
				if (local69 == local74 - arg6 && local64 >= local84 && local460 >= local64 && (this.anIntArrayArray32[local466][local64] & 0x8) == 0) {
					return true;
				}
				if (local69 == local74 + 1 && local64 >= local84 && local64 <= local460 && (this.anIntArrayArray32[local69][local64] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(III)V")
	public void method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4879;
		@Pc(21) int local21 = arg0 - this.anInt4889;
		this.anIntArrayArray32[local4][local21] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZIZBII)V")
	public void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt4879;
		@Pc(9) int local9 = arg5 - this.anInt4889;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method3915(128, local4, local9);
				this.method3915(8, local4 - 1, local9);
			}
			if (arg4 == 1) {
				this.method3915(2, local4, local9);
				this.method3915(32, local4, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3915(8, local4, local9);
				this.method3915(128, local4 + 1, local9);
			}
			if (arg4 == 3) {
				this.method3915(32, local4, local9);
				this.method3915(2, local4, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method3915(1, local4, local9);
				this.method3915(16, local4 - 1, local9 + 1);
			}
			if (arg4 == 1) {
				this.method3915(4, local4, local9);
				this.method3915(64, local4 + 1, local9 - -1);
			}
			if (arg4 == 2) {
				this.method3915(16, local4, local9);
				this.method3915(1, local4 + 1, local9 + -1);
			}
			if (arg4 == 3) {
				this.method3915(64, local4, local9);
				this.method3915(4, local4 - 1, local9 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method3915(130, local4, local9);
				this.method3915(8, local4 - 1, local9);
				this.method3915(32, local4, local9 + 1);
			}
			if (arg4 == 1) {
				this.method3915(10, local4, local9);
				this.method3915(32, local4, local9 + 1);
				this.method3915(128, local4 + 1, local9);
			}
			if (arg4 == 2) {
				this.method3915(40, local4, local9);
				this.method3915(128, local4 + 1, local9);
				this.method3915(2, local4, local9 - 1);
			}
			if (arg4 == 3) {
				this.method3915(160, local4, local9);
				this.method3915(2, local4, local9 - 1);
				this.method3915(8, local4 - 1, local9);
			}
		}
		if (arg1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method3915(65536, local4, local9);
					this.method3915(4096, local4 - 1, local9);
				}
				if (arg4 == 1) {
					this.method3915(1024, local4, local9);
					this.method3915(16384, local4, local9 + 1);
				}
				if (arg4 == 2) {
					this.method3915(4096, local4, local9);
					this.method3915(65536, local4 + 1, local9);
				}
				if (arg4 == 3) {
					this.method3915(16384, local4, local9);
					this.method3915(1024, local4, local9 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method3915(512, local4, local9);
					this.method3915(8192, local4 - 1, local9 + 1);
				}
				if (arg4 == 1) {
					this.method3915(2048, local4, local9);
					this.method3915(32768, local4 + 1, local9 + 1);
				}
				if (arg4 == 2) {
					this.method3915(8192, local4, local9);
					this.method3915(512, local4 + 1, local9 + -1);
				}
				if (arg4 == 3) {
					this.method3915(32768, local4, local9);
					this.method3915(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method3915(66560, local4, local9);
					this.method3915(4096, local4 - 1, local9);
					this.method3915(16384, local4, local9 + 1);
				}
				if (arg4 == 1) {
					this.method3915(5120, local4, local9);
					this.method3915(16384, local4, local9 + 1);
					this.method3915(65536, local4 + 1, local9);
				}
				if (arg4 == 2) {
					this.method3915(20480, local4, local9);
					this.method3915(65536, local4 + 1, local9);
					this.method3915(1024, local4, local9 - 1);
				}
				if (arg4 == 3) {
					this.method3915(81920, local4, local9);
					this.method3915(1024, local4, local9 - 1);
					this.method3915(4096, local4 - 1, local9);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method3915(536870912, local4, local9);
				this.method3915(33554432, local4 - 1, local9);
			}
			if (arg4 == 1) {
				this.method3915(8388608, local4, local9);
				this.method3915(134217728, local4, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3915(33554432, local4, local9);
				this.method3915(536870912, local4 + 1, local9);
			}
			if (arg4 == 3) {
				this.method3915(134217728, local4, local9);
				this.method3915(8388608, local4, local9 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method3915(4194304, local4, local9);
				this.method3915(67108864, local4 - 1, local9 + 1);
			}
			if (arg4 == 1) {
				this.method3915(16777216, local4, local9);
				this.method3915(268435456, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3915(67108864, local4, local9);
				this.method3915(4194304, local4 + 1, local9 + -1);
			}
			if (arg4 == 3) {
				this.method3915(268435456, local4, local9);
				this.method3915(16777216, local4 - 1, local9 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method3915(545259520, local4, local9);
			this.method3915(33554432, local4 - 1, local9);
			this.method3915(134217728, local4, local9 + 1);
		}
		if (arg4 == 1) {
			this.method3915(41943040, local4, local9);
			this.method3915(134217728, local4, local9 + 1);
			this.method3915(536870912, local4 + 1, local9);
		}
		if (arg4 == 2) {
			this.method3915(167772160, local4, local9);
			this.method3915(536870912, local4 + 1, local9);
			this.method3915(8388608, local4, local9 - 1);
		}
		if (arg4 == 3) {
			this.method3915(671088640, local4, local9);
			this.method3915(8388608, local4, local9 - 1);
			this.method3915(33554432, local4 - 1, local9);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIIZII)V")
	public void method3928(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt4889;
		@Pc(11) int local11 = arg1 - this.anInt4879;
		@Pc(17) int local17 = 256;
		if (arg0) {
			local17 = 131328;
		}
		if (arg4) {
			local17 |= 0x40000000;
		}
		for (@Pc(31) int local31 = local11; local31 < local11 + arg3; local31++) {
			if (local31 >= 0 && this.anInt4881 > local31) {
				for (@Pc(45) int local45 = local6; local45 < arg2 + local6; local45++) {
					if (local45 >= 0 && this.anInt4882 > local45) {
						this.method3915(local17, local31, local45);
					}
				}
			}
		}
	}
}

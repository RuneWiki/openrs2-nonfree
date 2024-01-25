import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pka")
public final class Class289 {

	@OriginalMember(owner = "client!pka", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!pka", name = "t", descriptor = "I")
	public int anInt8117;

	@OriginalMember(owner = "client!pka", name = "p", descriptor = "I")
	public int anInt8126;

	@OriginalMember(owner = "client!pka", name = "r", descriptor = "I")
	public int anInt8132;

	@OriginalMember(owner = "client!pka", name = "n", descriptor = "I")
	public int anInt8133;

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static303.method6871(arg4, arg5, arg7, arg3, arg6, arg5, arg1, arg2) ? true : this.method7087(arg5, arg4, arg7, arg2, arg0, arg6, arg3, arg1, arg5);
		}
		@Pc(43) int local43 = arg4 + arg6 - 1;
		@Pc(49) int local49 = arg7 + arg3 - 1;
		if (arg4 <= arg2 && local43 >= arg2 && arg1 >= arg7 && local49 >= arg1) {
			return true;
		} else if (arg2 == arg4 - 1 && arg7 <= arg1 && local49 >= arg1 && (this.anIntArrayArray52[arg2 - this.anInt8133][arg1 - this.anInt8117] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local43 + 1 == arg2 && arg7 <= arg1 && arg1 <= local49 && (this.anIntArrayArray52[arg2 - this.anInt8133][arg1 - this.anInt8117] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg7 - 1 && arg4 <= arg2 && arg2 <= local43 && (this.anIntArrayArray52[arg2 - this.anInt8133][arg1 - this.anInt8117] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local49 + 1 && arg2 >= arg4 && local43 >= arg2 && (this.anIntArrayArray52[arg2 - this.anInt8133][arg1 - this.anInt8117] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIZ)V")
	public void method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt8117;
		@Pc(18) int local18 = arg1 - this.anInt8133;
		this.anIntArrayArray52[local18][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "(IIII)V")
	private void method7074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray52[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IZBIIIZ)V")
	public void method7075(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt8117;
		@Pc(13) int local13 = arg0 - this.anInt8133;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method7074(128, local8, local13);
				this.method7074(8, local8, local13 - 1);
			}
			if (arg3 == 1) {
				this.method7074(2, local8, local13);
				this.method7074(32, local8 + 1, local13);
			}
			if (arg3 == 2) {
				this.method7074(8, local8, local13);
				this.method7074(128, local8, local13 + 1);
			}
			if (arg3 == 3) {
				this.method7074(32, local8, local13);
				this.method7074(2, local8 - 1, local13);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method7074(1, local8, local13);
				this.method7074(16, local8 + 1, local13 + -1);
			}
			if (arg3 == 1) {
				this.method7074(4, local8, local13);
				this.method7074(64, local8 + 1, local13 - -1);
			}
			if (arg3 == 2) {
				this.method7074(16, local8, local13);
				this.method7074(1, local8 - 1, local13 + 1);
			}
			if (arg3 == 3) {
				this.method7074(64, local8, local13);
				this.method7074(4, local8 - 1, local13 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method7074(130, local8, local13);
				this.method7074(8, local8, local13 - 1);
				this.method7074(32, local8 + 1, local13);
			}
			if (arg3 == 1) {
				this.method7074(10, local8, local13);
				this.method7074(32, local8 + 1, local13);
				this.method7074(128, local8, local13 + 1);
			}
			if (arg3 == 2) {
				this.method7074(40, local8, local13);
				this.method7074(128, local8, local13 + 1);
				this.method7074(2, local8 - 1, local13);
			}
			if (arg3 == 3) {
				this.method7074(160, local8, local13);
				this.method7074(2, local8 - 1, local13);
				this.method7074(8, local8, local13 - 1);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method7074(65536, local8, local13);
					this.method7074(4096, local8, local13 - 1);
				}
				if (arg3 == 1) {
					this.method7074(1024, local8, local13);
					this.method7074(16384, local8 + 1, local13);
				}
				if (arg3 == 2) {
					this.method7074(4096, local8, local13);
					this.method7074(65536, local8, local13 + 1);
				}
				if (arg3 == 3) {
					this.method7074(16384, local8, local13);
					this.method7074(1024, local8 - 1, local13);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method7074(512, local8, local13);
					this.method7074(8192, local8 + 1, local13 - 1);
				}
				if (arg3 == 1) {
					this.method7074(2048, local8, local13);
					this.method7074(32768, local8 + 1, local13 + 1);
				}
				if (arg3 == 2) {
					this.method7074(8192, local8, local13);
					this.method7074(512, local8 - 1, local13 - -1);
				}
				if (arg3 == 3) {
					this.method7074(32768, local8, local13);
					this.method7074(2048, local8 - 1, local13 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method7074(66560, local8, local13);
					this.method7074(4096, local8, local13 - 1);
					this.method7074(16384, local8 + 1, local13);
				}
				if (arg3 == 1) {
					this.method7074(5120, local8, local13);
					this.method7074(16384, local8 + 1, local13);
					this.method7074(65536, local8, local13 + 1);
				}
				if (arg3 == 2) {
					this.method7074(20480, local8, local13);
					this.method7074(65536, local8, local13 + 1);
					this.method7074(1024, local8 - 1, local13);
				}
				if (arg3 == 3) {
					this.method7074(81920, local8, local13);
					this.method7074(1024, local8 - 1, local13);
					this.method7074(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method7074(536870912, local8, local13);
				this.method7074(33554432, local8, local13 - 1);
			}
			if (arg3 == 1) {
				this.method7074(8388608, local8, local13);
				this.method7074(134217728, local8 + 1, local13);
			}
			if (arg3 == 2) {
				this.method7074(33554432, local8, local13);
				this.method7074(536870912, local8, local13 + 1);
			}
			if (arg3 == 3) {
				this.method7074(134217728, local8, local13);
				this.method7074(8388608, local8 - 1, local13);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method7074(4194304, local8, local13);
				this.method7074(67108864, local8 + 1, local13 + -1);
			}
			if (arg3 == 1) {
				this.method7074(16777216, local8, local13);
				this.method7074(268435456, local8 + 1, local13 - -1);
			}
			if (arg3 == 2) {
				this.method7074(67108864, local8, local13);
				this.method7074(4194304, local8 - 1, local13 + 1);
			}
			if (arg3 == 3) {
				this.method7074(268435456, local8, local13);
				this.method7074(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method7074(545259520, local8, local13);
			this.method7074(33554432, local8, local13 - 1);
			this.method7074(134217728, local8 + 1, local13);
		}
		if (arg3 == 1) {
			this.method7074(41943040, local8, local13);
			this.method7074(134217728, local8 + 1, local13);
			this.method7074(536870912, local8, local13 + 1);
		}
		if (arg3 == 2) {
			this.method7074(167772160, local8, local13);
			this.method7074(536870912, local8, local13 + 1);
			this.method7074(8388608, local8 - 1, local13);
		}
		if (arg3 == 3) {
			this.method7074(671088640, local8, local13);
			this.method7074(8388608, local8 - 1, local13);
			this.method7074(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "(IIB)V")
	public void method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt8117;
		@Pc(21) int local21 = arg1 - this.anInt8133;
		this.anIntArrayArray52[local21][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIZBZII)V")
	public void method7078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt8117;
		@Pc(13) int local13 = arg1 - this.anInt8133;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method7083(local13, 128, local4);
				this.method7083(local13 - 1, 8, local4);
			}
			if (arg5 == 1) {
				this.method7083(local13, 2, local4);
				this.method7083(local13, 32, local4 + 1);
			}
			if (arg5 == 2) {
				this.method7083(local13, 8, local4);
				this.method7083(local13 + 1, 128, local4);
			}
			if (arg5 == 3) {
				this.method7083(local13, 32, local4);
				this.method7083(local13, 2, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method7083(local13, 1, local4);
				this.method7083(local13 - 1, 16, local4 + 1);
			}
			if (arg5 == 1) {
				this.method7083(local13, 4, local4);
				this.method7083(local13 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method7083(local13, 16, local4);
				this.method7083(local13 + 1, 1, local4 - 1);
			}
			if (arg5 == 3) {
				this.method7083(local13, 64, local4);
				this.method7083(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method7083(local13, 130, local4);
				this.method7083(local13 - 1, 8, local4);
				this.method7083(local13, 32, local4 + 1);
			}
			if (arg5 == 1) {
				this.method7083(local13, 10, local4);
				this.method7083(local13, 32, local4 + 1);
				this.method7083(local13 + 1, 128, local4);
			}
			if (arg5 == 2) {
				this.method7083(local13, 40, local4);
				this.method7083(local13 + 1, 128, local4);
				this.method7083(local13, 2, local4 - 1);
			}
			if (arg5 == 3) {
				this.method7083(local13, 160, local4);
				this.method7083(local13, 2, local4 - 1);
				this.method7083(local13 - 1, 8, local4);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method7083(local13, 65536, local4);
					this.method7083(local13 - 1, 4096, local4);
				}
				if (arg5 == 1) {
					this.method7083(local13, 1024, local4);
					this.method7083(local13, 16384, local4 + 1);
				}
				if (arg5 == 2) {
					this.method7083(local13, 4096, local4);
					this.method7083(local13 + 1, 65536, local4);
				}
				if (arg5 == 3) {
					this.method7083(local13, 16384, local4);
					this.method7083(local13, 1024, local4 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method7083(local13, 512, local4);
					this.method7083(local13 - 1, 8192, local4 + 1);
				}
				if (arg5 == 1) {
					this.method7083(local13, 2048, local4);
					this.method7083(local13 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method7083(local13, 8192, local4);
					this.method7083(local13 + 1, 512, local4 - 1);
				}
				if (arg5 == 3) {
					this.method7083(local13, 32768, local4);
					this.method7083(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method7083(local13, 66560, local4);
					this.method7083(local13 - 1, 4096, local4);
					this.method7083(local13, 16384, local4 + 1);
				}
				if (arg5 == 1) {
					this.method7083(local13, 5120, local4);
					this.method7083(local13, 16384, local4 + 1);
					this.method7083(local13 + 1, 65536, local4);
				}
				if (arg5 == 2) {
					this.method7083(local13, 20480, local4);
					this.method7083(local13 + 1, 65536, local4);
					this.method7083(local13, 1024, local4 - 1);
				}
				if (arg5 == 3) {
					this.method7083(local13, 81920, local4);
					this.method7083(local13, 1024, local4 - 1);
					this.method7083(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method7083(local13, 536870912, local4);
				this.method7083(local13 - 1, 33554432, local4);
			}
			if (arg5 == 1) {
				this.method7083(local13, 8388608, local4);
				this.method7083(local13, 134217728, local4 + 1);
			}
			if (arg5 == 2) {
				this.method7083(local13, 33554432, local4);
				this.method7083(local13 + 1, 536870912, local4);
			}
			if (arg5 == 3) {
				this.method7083(local13, 134217728, local4);
				this.method7083(local13, 8388608, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method7083(local13, 4194304, local4);
				this.method7083(local13 - 1, 67108864, local4 + 1);
			}
			if (arg5 == 1) {
				this.method7083(local13, 16777216, local4);
				this.method7083(local13 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method7083(local13, 67108864, local4);
				this.method7083(local13 + 1, 4194304, local4 - 1);
			}
			if (arg5 == 3) {
				this.method7083(local13, 268435456, local4);
				this.method7083(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method7083(local13, 545259520, local4);
			this.method7083(local13 - 1, 33554432, local4);
			this.method7083(local13, 134217728, local4 + 1);
		}
		if (arg5 == 1) {
			this.method7083(local13, 41943040, local4);
			this.method7083(local13, 134217728, local4 + 1);
			this.method7083(local13 + 1, 536870912, local4);
		}
		if (arg5 == 2) {
			this.method7083(local13, 167772160, local4);
			this.method7083(local13 + 1, 536870912, local4);
			this.method7083(local13, 8388608, local4 - 1);
		}
		if (arg5 == 3) {
			this.method7083(local13, 671088640, local4);
			this.method7083(local13, 8388608, local4 - 1);
			this.method7083(local13 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IZZIIZI)V")
	public void method7079(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg1) {
			local5 = 131328;
		}
		if (arg4) {
			local5 |= 0x40000000;
		}
		@Pc(22) int local22 = arg3 - this.anInt8117;
		@Pc(27) int local27 = arg5 - this.anInt8133;
		for (@Pc(29) int local29 = local27; local29 < local27 + arg2; local29++) {
			if (local29 >= 0 && this.anInt8126 > local29) {
				for (@Pc(40) int local40 = local22; local40 < arg0 + local22; local40++) {
					if (local40 >= 0 && local40 < this.anInt8132) {
						this.method7074(local5, local40, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method7080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 == 1) {
			if (arg0 == arg2 && arg6 == arg4) {
				return true;
			}
		} else if (arg2 >= arg0 && arg2 <= arg5 + arg0 - 1 && arg4 >= arg4 && arg4 + arg5 - 1 >= arg4) {
			return true;
		}
		@Pc(79) int local79 = arg6 - this.anInt8117;
		@Pc(84) int local84 = arg2 - this.anInt8133;
		@Pc(89) int local89 = arg0 - this.anInt8133;
		@Pc(94) int local94 = arg4 - this.anInt8117;
		if (arg5 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local89 == local84 + 1 && local94 == local79 && (this.anIntArrayArray52[local89][local79] & 0x80) == 0) {
						return true;
					}
					if (local84 == local89 && local94 - 1 == local79 && (this.anIntArrayArray52[local89][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local89 == local84 - 1 && local94 == local79 && (this.anIntArrayArray52[local89][local79] & 0x8) == 0) {
						return true;
					}
					if (local84 == local89 && local94 - 1 == local79 && (this.anIntArrayArray52[local89][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local84 - 1 == local89 && local94 == local79 && (this.anIntArrayArray52[local89][local79] & 0x8) == 0) {
						return true;
					}
					if (local84 == local89 && local94 + 1 == local79 && (this.anIntArrayArray52[local89][local79] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local89 == local84 + 1 && local79 == local94 && (this.anIntArrayArray52[local89][local79] & 0x80) == 0) {
						return true;
					}
					if (local84 == local89 && local94 + 1 == local79 && (this.anIntArrayArray52[local89][local79] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local84 == local89 && local79 == local94 + 1 && (this.anIntArrayArray52[local89][local79] & 0x20) == 0) {
					return true;
				}
				if (local89 == local84 && local94 - 1 == local79 && (this.anIntArrayArray52[local89][local79] & 0x2) == 0) {
					return true;
				}
				if (local89 == local84 - 1 && local79 == local94 && (this.anIntArrayArray52[local89][local79] & 0x8) == 0) {
					return true;
				}
				if (local89 == local84 + 1 && local94 == local79 && (this.anIntArrayArray52[local89][local79] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(534) int local534 = arg5 + local89 - 1;
			@Pc(541) int local541 = local79 + arg5 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local84 + 1 == local89 && local79 <= local94 && local94 <= local541 && (this.anIntArrayArray52[local89][local94] & 0x80) == 0) {
						return true;
					}
					if (local84 >= local89 && local84 <= local534 && local79 == local94 - arg5 && (this.anIntArrayArray52[local84][local541] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local84 - arg5 == local89 && local79 <= local94 && local94 <= local541 && (this.anIntArrayArray52[local534][local94] & 0x8) == 0) {
						return true;
					}
					if (local89 <= local84 && local84 <= local534 && local94 - arg5 == local79 && (this.anIntArrayArray52[local84][local541] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local89 == local84 - arg5 && local79 <= local94 && local541 >= local94 && (this.anIntArrayArray52[local534][local94] & 0x8) == 0) {
						return true;
					}
					if (local89 <= local84 && local84 <= local534 && local94 + 1 == local79 && (this.anIntArrayArray52[local84][local79] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local89 == local84 + 1 && local79 <= local94 && local541 >= local94 && (this.anIntArrayArray52[local89][local94] & 0x80) == 0) {
						return true;
					}
					if (local89 <= local84 && local534 >= local84 && local79 == local94 + 1 && (this.anIntArrayArray52[local84][local79] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local84 >= local89 && local84 <= local534 && local79 == local94 + 1 && (this.anIntArrayArray52[local84][local79] & 0x20) == 0) {
					return true;
				}
				if (local84 >= local89 && local84 <= local534 && local79 == local94 - arg5 && (this.anIntArrayArray52[local84][local541] & 0x2) == 0) {
					return true;
				}
				if (local89 == local84 - arg5 && local94 >= local79 && local94 <= local541 && (this.anIntArrayArray52[local534][local94] & 0x8) == 0) {
					return true;
				}
				if (local84 + 1 == local89 && local79 <= local94 && local94 <= local541 && (this.anIntArrayArray52[local89][local94] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIIIZIIZ)V")
	public void method7081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt8133;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg1 - this.anInt8117;
		@Pc(41) int local41;
		if (arg2 == 1 || arg2 == 3) {
			local41 = arg4;
			arg4 = arg5;
			arg5 = local41;
		}
		for (local41 = local18; local41 < arg4 + local18; local41++) {
			if (local41 >= 0 && this.anInt8126 > local41) {
				for (@Pc(66) int local66 = local29; local66 < local29 + arg5; local66++) {
					if (local66 >= 0 && local66 < this.anInt8132) {
						this.method7083(local41, local7, local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(I)V")
	public void method7082() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt8126; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt8132; local8++) {
				if (local5 == 0 || local8 == 0 || this.anInt8126 - 5 <= local5 || this.anInt8132 - 5 <= local8) {
					this.anIntArrayArray52[local5][local8] = -1;
				} else {
					this.anIntArrayArray52[local5][local8] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIII)V")
	private void method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray52[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIB)V")
	public void method7084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt8117;
		@Pc(16) int local16 = arg0 - this.anInt8133;
		this.anIntArrayArray52[local16][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(III)V")
	public void method7085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt8117;
		@Pc(17) int local17 = arg0 - this.anInt8133;
		this.anIntArrayArray52[local17][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method7086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg3 == arg6 && arg5 == arg1) {
				return true;
			}
		} else if (arg3 <= arg6 && arg6 <= arg3 + arg2 - 1 && arg5 <= arg5 && arg5 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(62) int local62 = arg5 - this.anInt8117;
		@Pc(67) int local67 = arg6 - this.anInt8133;
		@Pc(72) int local72 = arg3 - this.anInt8133;
		@Pc(77) int local77 = arg1 - this.anInt8117;
		if (arg2 == 1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					if (local72 == local67 - 1 && local62 == local77) {
						return true;
					}
					if (local67 == local72 && local62 + 1 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 && local77 == local62 - 1 && (this.anIntArrayArray52[local72][local77] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local67 && local62 + 1 == local77) {
						return true;
					}
					if (local72 == local67 - 1 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local77 == local62 && (this.anIntArrayArray52[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local67 + 1 && local62 == local77) {
						return true;
					}
					if (local67 == local72 && local62 + 1 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local72 && local77 == local62 - 1 && (this.anIntArrayArray52[local72][local77] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local67 && local77 == local62 - 1) {
						return true;
					}
					if (local72 == local67 - 1 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					if (local67 - 1 == local72 && local62 == local77) {
						return true;
					}
					if (local72 == local67 && local62 + 1 == local77) {
						return true;
					}
					if (local67 + 1 == local72 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local67 && local62 - 1 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - 1 == local72 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 && local77 == local62 + 1) {
						return true;
					}
					if (local72 == local67 + 1 && local62 == local77) {
						return true;
					}
					if (local67 == local72 && local77 == local62 - 1 && (this.anIntArrayArray52[local72][local77] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 - 1 == local72 && local77 == local62 && (this.anIntArrayArray52[local72][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 && local62 + 1 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 == local77) {
						return true;
					}
					if (local72 == local67 && local77 == local62 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local67 - 1 && local62 == local77) {
						return true;
					}
					if (local72 == local67 && local77 == local62 + 1 && (this.anIntArrayArray52[local72][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 == local72 && local62 - 1 == local77) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local67 == local72 && local77 == local62 + 1 && (this.anIntArrayArray52[local72][local77] & 0x20) == 0) {
					return true;
				}
				if (local72 == local67 && local62 - 1 == local77 && (this.anIntArrayArray52[local72][local77] & 0x2) == 0) {
					return true;
				}
				if (local72 == local67 - 1 && local62 == local77 && (this.anIntArrayArray52[local72][local77] & 0x8) == 0) {
					return true;
				}
				if (local67 + 1 == local72 && local77 == local62 && (this.anIntArrayArray52[local72][local77] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(935) int local935 = arg2 + local72 - 1;
			@Pc(941) int local941 = local77 + arg2 - 1;
			if (arg0 == 0) {
				if (arg4 == 0) {
					if (local67 - arg2 == local72 && local77 <= local62 && local941 >= local62) {
						return true;
					}
					if (local72 <= local67 && local935 >= local67 && local77 == local62 + 1 && (this.anIntArrayArray52[local67][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local72 && local67 <= local935 && local62 - arg2 == local77 && (this.anIntArrayArray52[local67][local941] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 <= local67 && local935 >= local67 && local77 == local62 + 1) {
						return true;
					}
					if (local67 - arg2 == local72 && local62 >= local77 && local941 >= local62 && (this.anIntArrayArray52[local935][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 >= local77 && local62 <= local941 && (this.anIntArrayArray52[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local67 + 1 && local77 <= local62 && local941 >= local62) {
						return true;
					}
					if (local67 >= local72 && local67 <= local935 && local77 == local62 + 1 && (this.anIntArrayArray52[local67][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local72 && local67 <= local935 && local77 == local62 - arg2 && (this.anIntArrayArray52[local67][local941] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 >= local72 && local935 >= local67 && local77 == local62 - arg2) {
						return true;
					}
					if (local67 - arg2 == local72 && local62 >= local77 && local941 >= local62 && (this.anIntArrayArray52[local935][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 >= local77 && local62 <= local941 && (this.anIntArrayArray52[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					if (local67 - arg2 == local72 && local62 >= local77 && local941 >= local62) {
						return true;
					}
					if (local67 >= local72 && local935 >= local67 && local77 == local62 + 1) {
						return true;
					}
					if (local72 == local67 + 1 && local62 >= local77 && local62 <= local941 && (this.anIntArrayArray52[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local67 && local935 >= local67 && local77 == local62 - arg2 && (this.anIntArrayArray52[local67][local941] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - arg2 == local72 && local77 <= local62 && local941 >= local62 && (this.anIntArrayArray52[local935][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 >= local72 && local67 <= local935 && local62 + 1 == local77) {
						return true;
					}
					if (local67 + 1 == local72 && local77 <= local62 && local62 <= local941) {
						return true;
					}
					if (local67 >= local72 && local67 <= local935 && local77 == local62 - arg2 && (this.anIntArrayArray52[local67][local941] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 - arg2 == local72 && local77 <= local62 && local62 <= local941 && (this.anIntArrayArray52[local935][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 >= local72 && local935 >= local67 && local62 + 1 == local77 && (this.anIntArrayArray52[local67][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local72 && local77 <= local62 && local62 <= local941) {
						return true;
					}
					if (local67 >= local72 && local67 <= local935 && local62 - arg2 == local77) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local67 - arg2 && local77 <= local62 && local941 >= local62) {
						return true;
					}
					if (local72 <= local67 && local67 <= local935 && local62 + 1 == local77 && (this.anIntArrayArray52[local67][local77] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local67 + 1 && local62 >= local77 && local62 <= local941 && (this.anIntArrayArray52[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local67 && local67 <= local935 && local77 == local62 - arg2) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local67 >= local72 && local67 <= local935 && local77 == local62 + 1 && (this.anIntArrayArray52[local67][local77] & 0x2C0120) == 0) {
					return true;
				}
				if (local67 >= local72 && local935 >= local67 && local62 - arg2 == local77 && (this.anIntArrayArray52[local67][local941] & 0x2C0102) == 0) {
					return true;
				}
				if (local72 == local67 - arg2 && local62 >= local77 && local62 <= local941 && (this.anIntArrayArray52[local935][local62] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 + 1 == local72 && local77 <= local62 && local941 >= local62 && (this.anIntArrayArray52[local72][local62] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method7087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg8 + arg3;
		@Pc(11) int local11 = arg7 + arg0;
		@Pc(23) int local23 = arg1 + arg5;
		@Pc(28) int local28 = arg2 + arg6;
		@Pc(76) int local76;
		@Pc(88) int local88;
		if (local23 == arg3 && (arg4 & 0x2) == 0) {
			local76 = arg2 >= arg7 ? arg2 : arg7;
			local88 = local11 >= local28 ? local28 : local11;
			while (local76 < local88) {
				if ((this.anIntArrayArray52[local23 - this.anInt8133 - 1][local76 - this.anInt8117] & 0x8) == 0) {
					return true;
				}
				local76++;
			}
		} else if (arg1 == local7 && (arg4 & 0x8) == 0) {
			local76 = arg7 > arg2 ? arg7 : arg2;
			local88 = local11 >= local28 ? local28 : local11;
			while (local88 > local76) {
				if ((this.anIntArrayArray52[arg1 - this.anInt8133][local76 - this.anInt8117] & 0x80) == 0) {
					return true;
				}
				local76++;
			}
		} else if (local28 == arg7 && (arg4 & 0x1) == 0) {
			local76 = arg1 >= arg3 ? arg1 : arg3;
			local88 = local23 <= local7 ? local23 : local7;
			while (local76 < local88) {
				if ((this.anIntArrayArray52[local76 - this.anInt8133][local28 - this.anInt8117 - 1] & 0x2) == 0) {
					return true;
				}
				local76++;
			}
		} else if (local11 == arg2 && (arg4 & 0x4) == 0) {
			local76 = arg1 >= arg3 ? arg1 : arg3;
			local88 = local23 > local7 ? local7 : local23;
			while (local76 < local88) {
				if ((this.anIntArrayArray52[local76 - this.anInt8133][arg2 - this.anInt8117] & 0x20) == 0) {
					return true;
				}
				local76++;
			}
		}
		return false;
	}
}

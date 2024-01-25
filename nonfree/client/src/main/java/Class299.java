import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class299 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
	public int anInt8548;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
	public int anInt8549;

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray84;

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
	public int anInt8559;

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)V")
	private void method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray84[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static76.method1970(arg1, arg2, arg3, arg5, arg4, arg0, arg7, arg1) ? true : this.method7242(arg3, arg4, arg1, arg6, arg1, arg5, arg2, arg7, arg0);
		}
		@Pc(46) int local46 = arg2 + arg7 - 1;
		@Pc(52) int local52 = arg0 + arg4 - 1;
		if (arg3 >= arg2 && local46 >= arg3 && arg0 <= arg5 && arg5 <= local52) {
			return true;
		} else if (arg2 - 1 == arg3 && arg5 >= arg0 && arg5 <= local52 && (this.anIntArrayArray84[arg3 - this.anInt8548][arg5 - this.anInt8569] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg3 && arg0 <= arg5 && arg5 <= local52 && (this.anIntArrayArray84[arg3 - this.anInt8548][arg5 - this.anInt8569] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg0 - 1 && arg2 <= arg3 && arg3 <= local46 && (this.anIntArrayArray84[arg3 - this.anInt8548][arg5 - this.anInt8569] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local52 + 1 && arg3 >= arg2 && local46 >= arg3 && (this.anIntArrayArray84[arg3 - this.anInt8548][arg5 - this.anInt8569] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public void method7230() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt8549; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt8559; local8++) {
				if (local5 == 0 || local8 == 0 || this.anInt8549 - 5 <= local5 || this.anInt8559 - 5 <= local8) {
					this.anIntArrayArray84[local5][local8] = -1;
				} else {
					this.anIntArrayArray84[local5][local8] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)V")
	public void method7232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt8569;
		@Pc(21) int local21 = arg0 - this.anInt8548;
		this.anIntArrayArray84[local21][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(III)V")
	public void method7233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt8548;
		@Pc(18) int local18 = arg0 - this.anInt8569;
		this.anIntArrayArray84[local4][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIB)V")
	public void method7234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt8569;
		@Pc(13) int local13 = arg1 - this.anInt8548;
		this.anIntArrayArray84[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZIIIZII)V")
	public void method7235(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt8569;
		@Pc(9) int local9 = arg4 - this.anInt8548;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method7225(128, local4, local9);
				this.method7225(8, local4, local9 - 1);
			}
			if (arg1 == 1) {
				this.method7225(2, local4, local9);
				this.method7225(32, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method7225(8, local4, local9);
				this.method7225(128, local4, local9 + 1);
			}
			if (arg1 == 3) {
				this.method7225(32, local4, local9);
				this.method7225(2, local4 - 1, local9);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method7225(1, local4, local9);
				this.method7225(16, local4 + 1, local9 + -1);
			}
			if (arg1 == 1) {
				this.method7225(4, local4, local9);
				this.method7225(64, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method7225(16, local4, local9);
				this.method7225(1, local4 - 1, local9 - -1);
			}
			if (arg1 == 3) {
				this.method7225(64, local4, local9);
				this.method7225(4, local4 - 1, local9 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method7225(130, local4, local9);
				this.method7225(8, local4, local9 - 1);
				this.method7225(32, local4 + 1, local9);
			}
			if (arg1 == 1) {
				this.method7225(10, local4, local9);
				this.method7225(32, local4 + 1, local9);
				this.method7225(128, local4, local9 + 1);
			}
			if (arg1 == 2) {
				this.method7225(40, local4, local9);
				this.method7225(128, local4, local9 + 1);
				this.method7225(2, local4 - 1, local9);
			}
			if (arg1 == 3) {
				this.method7225(160, local4, local9);
				this.method7225(2, local4 - 1, local9);
				this.method7225(8, local4, local9 - 1);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method7225(65536, local4, local9);
					this.method7225(4096, local4, local9 - 1);
				}
				if (arg1 == 1) {
					this.method7225(1024, local4, local9);
					this.method7225(16384, local4 + 1, local9);
				}
				if (arg1 == 2) {
					this.method7225(4096, local4, local9);
					this.method7225(65536, local4, local9 + 1);
				}
				if (arg1 == 3) {
					this.method7225(16384, local4, local9);
					this.method7225(1024, local4 - 1, local9);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method7225(512, local4, local9);
					this.method7225(8192, local4 + 1, local9 + -1);
				}
				if (arg1 == 1) {
					this.method7225(2048, local4, local9);
					this.method7225(32768, local4 + 1, local9 - -1);
				}
				if (arg1 == 2) {
					this.method7225(8192, local4, local9);
					this.method7225(512, local4 - 1, local9 + 1);
				}
				if (arg1 == 3) {
					this.method7225(32768, local4, local9);
					this.method7225(2048, local4 - 1, local9 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method7225(66560, local4, local9);
					this.method7225(4096, local4, local9 - 1);
					this.method7225(16384, local4 + 1, local9);
				}
				if (arg1 == 1) {
					this.method7225(5120, local4, local9);
					this.method7225(16384, local4 + 1, local9);
					this.method7225(65536, local4, local9 + 1);
				}
				if (arg1 == 2) {
					this.method7225(20480, local4, local9);
					this.method7225(65536, local4, local9 + 1);
					this.method7225(1024, local4 - 1, local9);
				}
				if (arg1 == 3) {
					this.method7225(81920, local4, local9);
					this.method7225(1024, local4 - 1, local9);
					this.method7225(4096, local4, local9 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method7225(536870912, local4, local9);
				this.method7225(33554432, local4, local9 - 1);
			}
			if (arg1 == 1) {
				this.method7225(8388608, local4, local9);
				this.method7225(134217728, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method7225(33554432, local4, local9);
				this.method7225(536870912, local4, local9 + 1);
			}
			if (arg1 == 3) {
				this.method7225(134217728, local4, local9);
				this.method7225(8388608, local4 - 1, local9);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method7225(4194304, local4, local9);
				this.method7225(67108864, local4 + 1, local9 - 1);
			}
			if (arg1 == 1) {
				this.method7225(16777216, local4, local9);
				this.method7225(268435456, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method7225(67108864, local4, local9);
				this.method7225(4194304, local4 - 1, local9 + 1);
			}
			if (arg1 == 3) {
				this.method7225(268435456, local4, local9);
				this.method7225(16777216, local4 - 1, local9 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method7225(545259520, local4, local9);
			this.method7225(33554432, local4, local9 - 1);
			this.method7225(134217728, local4 + 1, local9);
		}
		if (arg1 == 1) {
			this.method7225(41943040, local4, local9);
			this.method7225(134217728, local4 + 1, local9);
			this.method7225(536870912, local4, local9 + 1);
		}
		if (arg1 == 2) {
			this.method7225(167772160, local4, local9);
			this.method7225(536870912, local4, local9 + 1);
			this.method7225(8388608, local4 - 1, local9);
		}
		if (arg1 == 3) {
			this.method7225(671088640, local4, local9);
			this.method7225(8388608, local4 - 1, local9);
			this.method7225(33554432, local4, local9 - 1);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg6 && arg1 == arg2) {
				return true;
			}
		} else if (arg3 >= arg6 && arg0 + arg6 - 1 >= arg3 && arg2 <= arg2 && arg2 <= arg2 + arg0 - 1) {
			return true;
		}
		@Pc(50) int local50 = arg3 - this.anInt8548;
		@Pc(55) int local55 = arg2 - this.anInt8569;
		@Pc(60) int local60 = arg6 - this.anInt8548;
		@Pc(65) int local65 = arg1 - this.anInt8569;
		if (arg0 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local60 == local50 + 1 && local65 == local55 && (this.anIntArrayArray84[local60][local65] & 0x80) == 0) {
						return true;
					}
					if (local60 == local50 && local65 == local55 - 1 && (this.anIntArrayArray84[local60][local65] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local60 == local50 - 1 && local55 == local65 && (this.anIntArrayArray84[local60][local65] & 0x8) == 0) {
						return true;
					}
					if (local50 == local60 && local55 - 1 == local65 && (this.anIntArrayArray84[local60][local65] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local60 == local50 - 1 && local65 == local55 && (this.anIntArrayArray84[local60][local65] & 0x8) == 0) {
						return true;
					}
					if (local60 == local50 && local55 + 1 == local65 && (this.anIntArrayArray84[local60][local65] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local60 == local50 + 1 && local65 == local55 && (this.anIntArrayArray84[local60][local65] & 0x80) == 0) {
						return true;
					}
					if (local50 == local60 && local65 == local55 + 1 && (this.anIntArrayArray84[local60][local65] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local50 == local60 && local65 == local55 + 1 && (this.anIntArrayArray84[local60][local65] & 0x20) == 0) {
					return true;
				}
				if (local50 == local60 && local55 - 1 == local65 && (this.anIntArrayArray84[local60][local65] & 0x2) == 0) {
					return true;
				}
				if (local50 - 1 == local60 && local55 == local65 && (this.anIntArrayArray84[local60][local65] & 0x8) == 0) {
					return true;
				}
				if (local60 == local50 + 1 && local55 == local65 && (this.anIntArrayArray84[local60][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(80) int local80 = local60 + arg0 - 1;
			@Pc(87) int local87 = local65 + arg0 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local60 == local50 + 1 && local65 <= local55 && local87 >= local55 && (this.anIntArrayArray84[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local50 >= local60 && local80 >= local50 && local65 == local55 - arg0 && (this.anIntArrayArray84[local50][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local50 - arg0 == local60 && local55 >= local65 && local87 >= local55 && (this.anIntArrayArray84[local80][local55] & 0x8) == 0) {
						return true;
					}
					if (local50 >= local60 && local50 <= local80 && local55 - arg0 == local65 && (this.anIntArrayArray84[local50][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local60 == local50 - arg0 && local55 >= local65 && local55 <= local87 && (this.anIntArrayArray84[local80][local55] & 0x8) == 0) {
						return true;
					}
					if (local50 >= local60 && local80 >= local50 && local55 + 1 == local65 && (this.anIntArrayArray84[local50][local65] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local60 == local50 + 1 && local55 >= local65 && local55 <= local87 && (this.anIntArrayArray84[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 <= local50 && local50 <= local80 && local65 == local55 + 1 && (this.anIntArrayArray84[local50][local65] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local60 <= local50 && local80 >= local50 && local65 == local55 + 1 && (this.anIntArrayArray84[local50][local65] & 0x20) == 0) {
					return true;
				}
				if (local60 <= local50 && local80 >= local50 && local55 - arg0 == local65 && (this.anIntArrayArray84[local50][local87] & 0x2) == 0) {
					return true;
				}
				if (local50 - arg0 == local60 && local55 >= local65 && local87 >= local55 && (this.anIntArrayArray84[local80][local55] & 0x8) == 0) {
					return true;
				}
				if (local60 == local50 + 1 && local65 <= local55 && local55 <= local87 && (this.anIntArrayArray84[local60][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZIII)V")
	private void method7237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray84[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIZIZIB)V")
	public void method7238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt8569;
		@Pc(9) int local9 = arg1 - this.anInt8548;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method7237(local4, 128, local9);
				this.method7237(local4, 8, local9 - 1);
			}
			if (arg0 == 1) {
				this.method7237(local4, 2, local9);
				this.method7237(local4 + 1, 32, local9);
			}
			if (arg0 == 2) {
				this.method7237(local4, 8, local9);
				this.method7237(local4, 128, local9 + 1);
			}
			if (arg0 == 3) {
				this.method7237(local4, 32, local9);
				this.method7237(local4 - 1, 2, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method7237(local4, 1, local9);
				this.method7237(local4 + 1, 16, local9 - 1);
			}
			if (arg0 == 1) {
				this.method7237(local4, 4, local9);
				this.method7237(local4 + 1, 64, local9 + 1);
			}
			if (arg0 == 2) {
				this.method7237(local4, 16, local9);
				this.method7237(local4 - 1, 1, local9 + 1);
			}
			if (arg0 == 3) {
				this.method7237(local4, 64, local9);
				this.method7237(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method7237(local4, 130, local9);
				this.method7237(local4, 8, local9 - 1);
				this.method7237(local4 + 1, 32, local9);
			}
			if (arg0 == 1) {
				this.method7237(local4, 10, local9);
				this.method7237(local4 + 1, 32, local9);
				this.method7237(local4, 128, local9 + 1);
			}
			if (arg0 == 2) {
				this.method7237(local4, 40, local9);
				this.method7237(local4, 128, local9 + 1);
				this.method7237(local4 - 1, 2, local9);
			}
			if (arg0 == 3) {
				this.method7237(local4, 160, local9);
				this.method7237(local4 - 1, 2, local9);
				this.method7237(local4, 8, local9 - 1);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method7237(local4, 65536, local9);
					this.method7237(local4, 4096, local9 - 1);
				}
				if (arg0 == 1) {
					this.method7237(local4, 1024, local9);
					this.method7237(local4 + 1, 16384, local9);
				}
				if (arg0 == 2) {
					this.method7237(local4, 4096, local9);
					this.method7237(local4, 65536, local9 + 1);
				}
				if (arg0 == 3) {
					this.method7237(local4, 16384, local9);
					this.method7237(local4 - 1, 1024, local9);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method7237(local4, 512, local9);
					this.method7237(local4 + 1, 8192, local9 - 1);
				}
				if (arg0 == 1) {
					this.method7237(local4, 2048, local9);
					this.method7237(local4 + 1, 32768, local9 + 1);
				}
				if (arg0 == 2) {
					this.method7237(local4, 8192, local9);
					this.method7237(local4 - 1, 512, local9 + 1);
				}
				if (arg0 == 3) {
					this.method7237(local4, 32768, local9);
					this.method7237(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method7237(local4, 66560, local9);
					this.method7237(local4, 4096, local9 - 1);
					this.method7237(local4 + 1, 16384, local9);
				}
				if (arg0 == 1) {
					this.method7237(local4, 5120, local9);
					this.method7237(local4 + 1, 16384, local9);
					this.method7237(local4, 65536, local9 + 1);
				}
				if (arg0 == 2) {
					this.method7237(local4, 20480, local9);
					this.method7237(local4, 65536, local9 + 1);
					this.method7237(local4 - 1, 1024, local9);
				}
				if (arg0 == 3) {
					this.method7237(local4, 81920, local9);
					this.method7237(local4 - 1, 1024, local9);
					this.method7237(local4, 4096, local9 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method7237(local4, 536870912, local9);
				this.method7237(local4, 33554432, local9 - 1);
			}
			if (arg0 == 1) {
				this.method7237(local4, 8388608, local9);
				this.method7237(local4 + 1, 134217728, local9);
			}
			if (arg0 == 2) {
				this.method7237(local4, 33554432, local9);
				this.method7237(local4, 536870912, local9 + 1);
			}
			if (arg0 == 3) {
				this.method7237(local4, 134217728, local9);
				this.method7237(local4 - 1, 8388608, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method7237(local4, 4194304, local9);
				this.method7237(local4 + 1, 67108864, local9 - 1);
			}
			if (arg0 == 1) {
				this.method7237(local4, 16777216, local9);
				this.method7237(local4 + 1, 268435456, local9 + 1);
			}
			if (arg0 == 2) {
				this.method7237(local4, 67108864, local9);
				this.method7237(local4 - 1, 4194304, local9 + 1);
			}
			if (arg0 == 3) {
				this.method7237(local4, 268435456, local9);
				this.method7237(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method7237(local4, 545259520, local9);
			this.method7237(local4, 33554432, local9 - 1);
			this.method7237(local4 + 1, 134217728, local9);
		}
		if (arg0 == 1) {
			this.method7237(local4, 41943040, local9);
			this.method7237(local4 + 1, 134217728, local9);
			this.method7237(local4, 536870912, local9 + 1);
		}
		if (arg0 == 2) {
			this.method7237(local4, 167772160, local9);
			this.method7237(local4, 536870912, local9 + 1);
			this.method7237(local4 - 1, 8388608, local9);
		}
		if (arg0 == 3) {
			this.method7237(local4, 671088640, local9);
			this.method7237(local4 - 1, 8388608, local9);
			this.method7237(local4, 33554432, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBZIZII)V")
	public void method7239(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg1) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg0 - this.anInt8548;
		if (arg3) {
			local5 |= 0x40000000;
		}
		@Pc(31) int local31 = arg5 - this.anInt8569;
		for (@Pc(33) int local33 = local16; local33 < arg2 + local16; local33++) {
			if (local33 >= 0 && this.anInt8549 > local33) {
				for (@Pc(49) int local49 = local31; local49 < arg4 + local31; local49++) {
					if (local49 >= 0 && local49 < this.anInt8559) {
						this.method7237(local49, local5, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg4 == arg6 && arg1 == arg0) {
				return true;
			}
		} else if (arg4 >= arg6 && arg2 + arg6 - 1 >= arg4 && arg0 <= arg0 && arg0 + arg2 - 1 >= arg0) {
			return true;
		}
		@Pc(58) int local58 = arg4 - this.anInt8548;
		@Pc(63) int local63 = arg1 - this.anInt8569;
		@Pc(68) int local68 = arg6 - this.anInt8548;
		@Pc(73) int local73 = arg0 - this.anInt8569;
		if (arg2 == 1) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					if (local58 - 1 == local68 && local73 == local63) {
						return true;
					}
					if (local58 == local68 && local63 == local73 + 1 && (this.anIntArrayArray84[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local58 && local73 - 1 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 == local68 && local63 == local73 + 1) {
						return true;
					}
					if (local58 - 1 == local68 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local68 && local63 == local73 && (this.anIntArrayArray84[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local58 + 1 == local68 && local63 == local73) {
						return true;
					}
					if (local68 == local58 && local63 == local73 + 1 && (this.anIntArrayArray84[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local58 && local63 == local73 - 1 && (this.anIntArrayArray84[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local68 == local58 && local63 == local73 - 1) {
						return true;
					}
					if (local68 == local58 - 1 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local68 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					if (local68 == local58 - 1 && local73 == local63) {
						return true;
					}
					if (local68 == local58 && local73 + 1 == local63) {
						return true;
					}
					if (local58 + 1 == local68 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local73 - 1 && (this.anIntArrayArray84[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 == local58 - 1 && local63 == local73 && (this.anIntArrayArray84[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local73 + 1) {
						return true;
					}
					if (local68 == local58 + 1 && local63 == local73) {
						return true;
					}
					if (local68 == local58 && local73 - 1 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local58 - 1 == local68 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local68 && local73 + 1 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local58 + 1 && local73 == local63) {
						return true;
					}
					if (local68 == local58 && local73 - 1 == local63) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local68 == local58 - 1 && local63 == local73) {
						return true;
					}
					if (local58 == local68 && local63 == local73 + 1 && (this.anIntArrayArray84[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local68 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local58 && local63 == local73 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local58 == local68 && local63 == local73 + 1 && (this.anIntArrayArray84[local68][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local58 && local63 == local73 - 1 && (this.anIntArrayArray84[local68][local63] & 0x2) == 0) {
					return true;
				}
				if (local58 - 1 == local68 && local73 == local63 && (this.anIntArrayArray84[local68][local63] & 0x8) == 0) {
					return true;
				}
				if (local58 + 1 == local68 && local63 == local73 && (this.anIntArrayArray84[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(765) int local765 = local68 + arg2 - 1;
			@Pc(771) int local771 = local63 + arg2 - 1;
			if (arg5 == 0) {
				if (arg3 == 0) {
					if (local58 - arg2 == local68 && local73 >= local63 && local73 <= local771) {
						return true;
					}
					if (local68 <= local58 && local765 >= local58 && local73 + 1 == local63 && (this.anIntArrayArray84[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local58 && local765 >= local58 && local63 == local73 - arg2 && (this.anIntArrayArray84[local58][local771] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 <= local58 && local58 <= local765 && local73 + 1 == local63) {
						return true;
					}
					if (local58 - arg2 == local68 && local73 >= local63 && local73 <= local771 && (this.anIntArrayArray84[local765][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local58 + 1 && local63 <= local73 && local73 <= local771 && (this.anIntArrayArray84[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 == local58 + 1 && local73 >= local63 && local73 <= local771) {
						return true;
					}
					if (local58 >= local68 && local765 >= local58 && local63 == local73 + 1 && (this.anIntArrayArray84[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local58 && local765 >= local58 && local73 - arg2 == local63 && (this.anIntArrayArray84[local58][local771] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 >= local68 && local58 <= local765 && local73 - arg2 == local63) {
						return true;
					}
					if (local58 - arg2 == local68 && local63 <= local73 && local771 >= local73 && (this.anIntArrayArray84[local765][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local58 + 1 && local63 <= local73 && local771 >= local73 && (this.anIntArrayArray84[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					if (local68 == local58 - arg2 && local73 >= local63 && local73 <= local771) {
						return true;
					}
					if (local58 >= local68 && local58 <= local765 && local63 == local73 + 1) {
						return true;
					}
					if (local58 + 1 == local68 && local63 <= local73 && local73 <= local771 && (this.anIntArrayArray84[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local58 && local765 >= local58 && local63 == local73 - arg2 && (this.anIntArrayArray84[local58][local771] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 - arg2 == local68 && local63 <= local73 && local771 >= local73 && (this.anIntArrayArray84[local765][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 >= local68 && local58 <= local765 && local63 == local73 + 1) {
						return true;
					}
					if (local58 + 1 == local68 && local63 <= local73 && local771 >= local73) {
						return true;
					}
					if (local58 >= local68 && local58 <= local765 && local63 == local73 - arg2 && (this.anIntArrayArray84[local58][local771] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 == local58 - arg2 && local63 <= local73 && local73 <= local771 && (this.anIntArrayArray84[local765][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 <= local58 && local765 >= local58 && local63 == local73 + 1 && (this.anIntArrayArray84[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local68 && local73 >= local63 && local771 >= local73) {
						return true;
					}
					if (local58 >= local68 && local765 >= local58 && local73 - arg2 == local63) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 - arg2 == local68 && local73 >= local63 && local73 <= local771) {
						return true;
					}
					if (local68 <= local58 && local58 <= local765 && local73 + 1 == local63 && (this.anIntArrayArray84[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local58 + 1 && local63 <= local73 && local73 <= local771 && (this.anIntArrayArray84[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local58 && local765 >= local58 && local73 - arg2 == local63) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local68 <= local58 && local58 <= local765 && local73 + 1 == local63 && (this.anIntArrayArray84[local58][local63] & 0x2C0120) == 0) {
					return true;
				}
				if (local68 <= local58 && local58 <= local765 && local73 - arg2 == local63 && (this.anIntArrayArray84[local58][local771] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 == local58 - arg2 && local63 <= local73 && local771 >= local73 && (this.anIntArrayArray84[local765][local73] & 0x2C0108) == 0) {
					return true;
				}
				if (local58 + 1 == local68 && local63 <= local73 && local73 <= local771 && (this.anIntArrayArray84[local68][local73] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method7242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg0 + arg4;
		@Pc(12) int local12 = arg5 + arg2;
		@Pc(22) int local22 = arg6 + arg7;
		@Pc(26) int local26 = arg8 + arg1;
		@Pc(43) int local43;
		@Pc(54) int local54;
		if (arg0 == local22 && (arg3 & 0x2) == 0) {
			local43 = arg8 >= arg5 ? arg8 : arg5;
			local54 = local12 >= local26 ? local26 : local12;
			while (local54 > local43) {
				if ((this.anIntArrayArray84[local22 - this.anInt8548 - 1][local43 - this.anInt8569] & 0x8) == 0) {
					return true;
				}
				local43++;
			}
		} else if (arg6 == local8 && (arg3 & 0x8) == 0) {
			local43 = arg8 >= arg5 ? arg8 : arg5;
			local54 = local12 < local26 ? local12 : local26;
			while (local54 > local43) {
				if ((this.anIntArrayArray84[arg6 - this.anInt8548][local43 - this.anInt8569] & 0x80) == 0) {
					return true;
				}
				local43++;
			}
		} else if (local26 == arg5 && (arg3 & 0x1) == 0) {
			local43 = arg0 <= arg6 ? arg6 : arg0;
			local54 = local22 <= local8 ? local22 : local8;
			while (local43 < local54) {
				if ((this.anIntArrayArray84[local43 - this.anInt8548][local26 - this.anInt8569 - 1] & 0x2) == 0) {
					return true;
				}
				local43++;
			}
		} else if (local12 == arg8 && (arg3 & 0x4) == 0) {
			local43 = arg6 < arg0 ? arg0 : arg6;
			local54 = local22 > local8 ? local8 : local22;
			while (local54 > local43) {
				if ((this.anIntArrayArray84[local43 - this.anInt8548][arg8 - this.anInt8569] & 0x20) == 0) {
					return true;
				}
				local43++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIZZIB)V")
	public void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg4) {
			local5 = 131328;
		}
		@Pc(21) int local21;
		if (arg1 == 1 || arg1 == 3) {
			local21 = arg2;
			arg2 = arg3;
			arg3 = local21;
		}
		if (arg5) {
			local5 |= 0x40000000;
		}
		@Pc(45) int local45 = arg0 - this.anInt8569;
		@Pc(50) int local50 = arg6 - this.anInt8548;
		for (local21 = local50; local21 < arg2 + local50; local21++) {
			if (local21 >= 0 && this.anInt8549 > local21) {
				for (@Pc(68) int local68 = local45; local68 < local45 + arg3; local68++) {
					if (local68 >= 0 && this.anInt8559 > local68) {
						this.method7225(local5, local68, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)V")
	public void method7245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt8569;
		@Pc(17) int local17 = arg1 - this.anInt8548;
		this.anIntArrayArray84[local17][local12] |= 0x200000;
	}
}

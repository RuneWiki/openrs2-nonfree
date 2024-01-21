import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class86 {

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	private final int anInt4154 = 0;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	private final int anInt4160;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	private final int anInt4151;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "[[I")
	public final int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	private final int anInt4152;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
	public Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4160 = arg0;
		this.anInt4151 = arg1;
		this.anIntArrayArray36 = new int[this.anInt4160][this.anInt4151];
		this.anInt4152 = 0;
		this.method2811();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void method2801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt4154;
		@Pc(18) int local18 = arg0 - this.anInt4152;
		this.anIntArrayArray36[local8][local18] |= 0x40000;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg4 && arg2 == arg5) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt4154;
		@Pc(25) int local25 = arg5 - this.anInt4152;
		@Pc(30) int local30 = arg0 - this.anInt4154;
		@Pc(35) int local35 = arg2 - this.anInt4152;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (local20 - 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray36[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local20 == local30 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray36[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local35 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local20 + 1 == local30 && local25 == local35) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray36[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local30 == local20 && local25 == local35 - 1) {
					return true;
				}
				if (local30 == local20 - 1 && local35 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray36[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				if (local30 == local20 - 1 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1) {
					return true;
				}
				if (local20 + 1 == local30 && local35 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local30 == local20 - 1 && local35 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 && local35 + 1 == local25) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local30 == local20 - 1 && local35 == local25 && (this.anIntArrayArray36[local30][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray36[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local35 == local25) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local20 - 1 == local30 && local25 == local35) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray36[local30][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 + 1 && local25 == local35 && (this.anIntArrayArray36[local30][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local20 == local30 && local35 + 1 == local25 && (this.anIntArrayArray36[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray36[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray36[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray36[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method2804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg5 + arg4 - 1;
		@Pc(22) int local22 = arg3 + arg1 - 1;
		if (arg0 >= arg4 && arg0 <= local5 && arg6 >= arg3 && local22 >= arg6) {
			return true;
		} else if (arg4 - 1 == arg0 && arg6 >= arg3 && local22 >= arg6 && (this.anIntArrayArray36[arg0 - this.anInt4154][arg6 - this.anInt4152] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local5 + 1 == arg0 && arg3 <= arg6 && arg6 <= local22 && (this.anIntArrayArray36[arg0 - this.anInt4154][arg6 - this.anInt4152] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg6 && arg4 <= arg0 && local5 >= arg0 && (this.anIntArrayArray36[arg0 - this.anInt4154][arg6 - this.anInt4152] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local22 + 1 == arg6 && arg4 <= arg0 && local5 >= arg0 && (this.anIntArrayArray36[arg0 - this.anInt4154][arg6 - this.anInt4152] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIZ)V")
	public void method2805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg0 - this.anInt4154;
		@Pc(13) int local13 = arg1 - this.anInt4152;
		@Pc(15) int local15 = 256;
		if (arg4) {
			local15 = 131328;
		}
		for (@Pc(29) int local29 = local4; local29 < arg2 + local4; local29++) {
			if (local29 >= 0 && this.anInt4160 > local29) {
				for (@Pc(41) int local41 = local13; local41 < arg3 + local13; local41++) {
					if (local41 >= 0 && this.anInt4151 > local41) {
						this.method2815(local29, local41, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	private void method2806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray36[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIZII)V")
	public void method2807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt4154;
		@Pc(17) int local17 = arg4 - this.anInt4152;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method2806(128, local17, local4);
				this.method2806(8, local17, local4 - 1);
			}
			if (arg3 == 1) {
				this.method2806(2, local17, local4);
				this.method2806(32, local17 + 1, local4);
			}
			if (arg3 == 2) {
				this.method2806(8, local17, local4);
				this.method2806(128, local17, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2806(32, local17, local4);
				this.method2806(2, local17 - 1, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method2806(1, local17, local4);
				this.method2806(16, local17 + 1, local4 + -1);
			}
			if (arg3 == 1) {
				this.method2806(4, local17, local4);
				this.method2806(64, local17 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method2806(16, local17, local4);
				this.method2806(1, local17 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2806(64, local17, local4);
				this.method2806(4, local17 - 1, local4 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method2806(130, local17, local4);
				this.method2806(8, local17, local4 - 1);
				this.method2806(32, local17 + 1, local4);
			}
			if (arg3 == 1) {
				this.method2806(10, local17, local4);
				this.method2806(32, local17 + 1, local4);
				this.method2806(128, local17, local4 + 1);
			}
			if (arg3 == 2) {
				this.method2806(40, local17, local4);
				this.method2806(128, local17, local4 + 1);
				this.method2806(2, local17 - 1, local4);
			}
			if (arg3 == 3) {
				this.method2806(160, local17, local4);
				this.method2806(2, local17 - 1, local4);
				this.method2806(8, local17, local4 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method2806(65536, local17, local4);
				this.method2806(4096, local17, local4 - 1);
			}
			if (arg3 == 1) {
				this.method2806(1024, local17, local4);
				this.method2806(16384, local17 + 1, local4);
			}
			if (arg3 == 2) {
				this.method2806(4096, local17, local4);
				this.method2806(65536, local17, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2806(16384, local17, local4);
				this.method2806(1024, local17 - 1, local4);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method2806(512, local17, local4);
				this.method2806(8192, local17 + 1, local4 - 1);
			}
			if (arg3 == 1) {
				this.method2806(2048, local17, local4);
				this.method2806(32768, local17 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method2806(8192, local17, local4);
				this.method2806(512, local17 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method2806(32768, local17, local4);
				this.method2806(2048, local17 - 1, local4 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2806(66560, local17, local4);
			this.method2806(4096, local17, local4 - 1);
			this.method2806(16384, local17 + 1, local4);
		}
		if (arg3 == 1) {
			this.method2806(5120, local17, local4);
			this.method2806(16384, local17 + 1, local4);
			this.method2806(65536, local17, local4 + 1);
		}
		if (arg3 == 2) {
			this.method2806(20480, local17, local4);
			this.method2806(65536, local17, local4 + 1);
			this.method2806(1024, local17 - 1, local4);
		}
		if (arg3 == 3) {
			this.method2806(81920, local17, local4);
			this.method2806(1024, local17 - 1, local4);
			this.method2806(4096, local17, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public void method2808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt4152;
		@Pc(13) int local13 = arg1 - this.anInt4154;
		this.anIntArrayArray36[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public void method2811() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt4160; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt4151; local12++) {
				if (local8 == 0 || local12 == 0 || local8 >= this.anInt4160 - 5 || this.anInt4151 - 5 <= local12) {
					this.anIntArrayArray36[local8][local12] = 16777215;
				} else {
					this.anIntArrayArray36[local8][local12] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIZI)V")
	public void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt4152;
		@Pc(9) int local9 = arg3 - this.anInt4154;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2815(local9, local4, 128);
				this.method2815(local9 - 1, local4, 8);
			}
			if (arg2 == 1) {
				this.method2815(local9, local4, 2);
				this.method2815(local9, local4 + 1, 32);
			}
			if (arg2 == 2) {
				this.method2815(local9, local4, 8);
				this.method2815(local9 + 1, local4, 128);
			}
			if (arg2 == 3) {
				this.method2815(local9, local4, 32);
				this.method2815(local9, local4 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2815(local9, local4, 1);
				this.method2815(local9 - 1, local4 + 1, 16);
			}
			if (arg2 == 1) {
				this.method2815(local9, local4, 4);
				this.method2815(local9 + 1, local4 + 1, 64);
			}
			if (arg2 == 2) {
				this.method2815(local9, local4, 16);
				this.method2815(local9 + 1, local4 + -1, 1);
			}
			if (arg2 == 3) {
				this.method2815(local9, local4, 64);
				this.method2815(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method2815(local9, local4, 130);
				this.method2815(local9 - 1, local4, 8);
				this.method2815(local9, local4 + 1, 32);
			}
			if (arg2 == 1) {
				this.method2815(local9, local4, 10);
				this.method2815(local9, local4 + 1, 32);
				this.method2815(local9 + 1, local4, 128);
			}
			if (arg2 == 2) {
				this.method2815(local9, local4, 40);
				this.method2815(local9 + 1, local4, 128);
				this.method2815(local9, local4 - 1, 2);
			}
			if (arg2 == 3) {
				this.method2815(local9, local4, 160);
				this.method2815(local9, local4 - 1, 2);
				this.method2815(local9 - 1, local4, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2815(local9, local4, 65536);
				this.method2815(local9 - 1, local4, 4096);
			}
			if (arg2 == 1) {
				this.method2815(local9, local4, 1024);
				this.method2815(local9, local4 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method2815(local9, local4, 4096);
				this.method2815(local9 + 1, local4, 65536);
			}
			if (arg2 == 3) {
				this.method2815(local9, local4, 16384);
				this.method2815(local9, local4 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2815(local9, local4, 512);
				this.method2815(local9 - 1, local4 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method2815(local9, local4, 2048);
				this.method2815(local9 + 1, local4 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method2815(local9, local4, 8192);
				this.method2815(local9 + 1, local4 + -1, 512);
			}
			if (arg2 == 3) {
				this.method2815(local9, local4, 32768);
				this.method2815(local9 - 1, local4 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2815(local9, local4, 66560);
			this.method2815(local9 - 1, local4, 4096);
			this.method2815(local9, local4 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method2815(local9, local4, 5120);
			this.method2815(local9, local4 + 1, 16384);
			this.method2815(local9 + 1, local4, 65536);
		}
		if (arg2 == 2) {
			this.method2815(local9, local4, 20480);
			this.method2815(local9 + 1, local4, 65536);
			this.method2815(local9, local4 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method2815(local9, local4, 81920);
			this.method2815(local9, local4 - 1, 1024);
			this.method2815(local9 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
	public void method2814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4154;
		@Pc(13) int local13 = arg0 - this.anInt4152;
		this.anIntArrayArray36[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIII)V")
	private void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray36[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZIIII)V")
	public void method2816(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = arg2 - this.anInt4152;
		@Pc(20) int local20 = 256;
		if (arg1) {
			local20 = 131328;
		}
		@Pc(34) int local34;
		if (arg4 == 1 || arg4 == 3) {
			local34 = arg3;
			arg3 = arg5;
			arg5 = local34;
		}
		@Pc(43) int local43 = arg0 - this.anInt4154;
		for (local34 = local43; local34 < arg3 + local43; local34++) {
			if (local34 >= 0 && local34 < this.anInt4160) {
				for (@Pc(58) int local58 = local18; local58 < local18 + arg5; local58++) {
					if (local58 >= 0 && this.anInt4151 > local58) {
						this.method2806(local20, local58, local34);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method2817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg1 - this.anInt4152;
		@Pc(25) int local25 = arg3 - this.anInt4154;
		@Pc(30) int local30 = arg4 - this.anInt4152;
		@Pc(43) int local43 = arg0 - this.anInt4154;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local43 == local25 + 1 && local30 == local20 && (this.anIntArrayArray36[local43][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local43 && local30 == local20 - 1 && (this.anIntArrayArray36[local43][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local25 - 1 == local43 && local20 == local30 && (this.anIntArrayArray36[local43][local30] & 0x8) == 0) {
					return true;
				}
				if (local43 == local25 && local20 - 1 == local30 && (this.anIntArrayArray36[local43][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local25 - 1 == local43 && local30 == local20 && (this.anIntArrayArray36[local43][local30] & 0x8) == 0) {
					return true;
				}
				if (local43 == local25 && local30 == local20 + 1 && (this.anIntArrayArray36[local43][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local43 == local25 + 1 && local20 == local30 && (this.anIntArrayArray36[local43][local30] & 0x80) == 0) {
					return true;
				}
				if (local43 == local25 && local20 + 1 == local30 && (this.anIntArrayArray36[local43][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local25 == local43 && local30 == local20 + 1 && (this.anIntArrayArray36[local43][local30] & 0x20) == 0) {
				return true;
			}
			if (local25 == local43 && local30 == local20 - 1 && (this.anIntArrayArray36[local43][local30] & 0x2) == 0) {
				return true;
			}
			if (local43 == local25 - 1 && local30 == local20 && (this.anIntArrayArray36[local43][local30] & 0x8) == 0) {
				return true;
			}
			if (local43 == local25 + 1 && local30 == local20 && (this.anIntArrayArray36[local43][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

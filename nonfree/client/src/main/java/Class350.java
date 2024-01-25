import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class350 {

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
	public int anInt10120;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
	public int anInt10122;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
	public int anInt10124;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
	public int anInt10126;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZIZIBII)V")
	public void method8206(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt10122;
		@Pc(13) int local13 = arg5 - this.anInt10126;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method8215(128, local13, local4);
				this.method8215(8, local13 - 1, local4);
			}
			if (arg3 == 1) {
				this.method8215(2, local13, local4);
				this.method8215(32, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method8215(8, local13, local4);
				this.method8215(128, local13 + 1, local4);
			}
			if (arg3 == 3) {
				this.method8215(32, local13, local4);
				this.method8215(2, local13, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method8215(1, local13, local4);
				this.method8215(16, local13 - 1, local4 + 1);
			}
			if (arg3 == 1) {
				this.method8215(4, local13, local4);
				this.method8215(64, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method8215(16, local13, local4);
				this.method8215(1, local13 + 1, local4 - 1);
			}
			if (arg3 == 3) {
				this.method8215(64, local13, local4);
				this.method8215(4, local13 - 1, local4 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method8215(130, local13, local4);
				this.method8215(8, local13 - 1, local4);
				this.method8215(32, local13, local4 + 1);
			}
			if (arg3 == 1) {
				this.method8215(10, local13, local4);
				this.method8215(32, local13, local4 + 1);
				this.method8215(128, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method8215(40, local13, local4);
				this.method8215(128, local13 + 1, local4);
				this.method8215(2, local13, local4 - 1);
			}
			if (arg3 == 3) {
				this.method8215(160, local13, local4);
				this.method8215(2, local13, local4 - 1);
				this.method8215(8, local13 - 1, local4);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					this.method8215(65536, local13, local4);
					this.method8215(4096, local13 - 1, local4);
				}
				if (arg3 == 1) {
					this.method8215(1024, local13, local4);
					this.method8215(16384, local13, local4 + 1);
				}
				if (arg3 == 2) {
					this.method8215(4096, local13, local4);
					this.method8215(65536, local13 + 1, local4);
				}
				if (arg3 == 3) {
					this.method8215(16384, local13, local4);
					this.method8215(1024, local13, local4 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg3 == 0) {
					this.method8215(512, local13, local4);
					this.method8215(8192, local13 - 1, local4 - -1);
				}
				if (arg3 == 1) {
					this.method8215(2048, local13, local4);
					this.method8215(32768, local13 + 1, local4 + 1);
				}
				if (arg3 == 2) {
					this.method8215(8192, local13, local4);
					this.method8215(512, local13 + 1, local4 + -1);
				}
				if (arg3 == 3) {
					this.method8215(32768, local13, local4);
					this.method8215(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					this.method8215(66560, local13, local4);
					this.method8215(4096, local13 - 1, local4);
					this.method8215(16384, local13, local4 + 1);
				}
				if (arg3 == 1) {
					this.method8215(5120, local13, local4);
					this.method8215(16384, local13, local4 + 1);
					this.method8215(65536, local13 + 1, local4);
				}
				if (arg3 == 2) {
					this.method8215(20480, local13, local4);
					this.method8215(65536, local13 + 1, local4);
					this.method8215(1024, local13, local4 - 1);
				}
				if (arg3 == 3) {
					this.method8215(81920, local13, local4);
					this.method8215(1024, local13, local4 - 1);
					this.method8215(4096, local13 - 1, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method8215(536870912, local13, local4);
				this.method8215(33554432, local13 - 1, local4);
			}
			if (arg3 == 1) {
				this.method8215(8388608, local13, local4);
				this.method8215(134217728, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method8215(33554432, local13, local4);
				this.method8215(536870912, local13 + 1, local4);
			}
			if (arg3 == 3) {
				this.method8215(134217728, local13, local4);
				this.method8215(8388608, local13, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method8215(4194304, local13, local4);
				this.method8215(67108864, local13 - 1, local4 + 1);
			}
			if (arg3 == 1) {
				this.method8215(16777216, local13, local4);
				this.method8215(268435456, local13 + 1, local4 - -1);
			}
			if (arg3 == 2) {
				this.method8215(67108864, local13, local4);
				this.method8215(4194304, local13 + 1, local4 + -1);
			}
			if (arg3 == 3) {
				this.method8215(268435456, local13, local4);
				this.method8215(16777216, local13 - 1, local4 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method8215(545259520, local13, local4);
			this.method8215(33554432, local13 - 1, local4);
			this.method8215(134217728, local13, local4 + 1);
		}
		if (arg3 == 1) {
			this.method8215(41943040, local13, local4);
			this.method8215(134217728, local13, local4 + 1);
			this.method8215(536870912, local13 + 1, local4);
		}
		if (arg3 == 2) {
			this.method8215(167772160, local13, local4);
			this.method8215(536870912, local13 + 1, local4);
			this.method8215(8388608, local13, local4 - 1);
		}
		if (arg3 == 3) {
			this.method8215(671088640, local13, local4);
			this.method8215(8388608, local13, local4 - 1);
			this.method8215(33554432, local13 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public void method8207() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt10120; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt10124; local8++) {
				if (local5 == 0 || local8 == 0 || this.anInt10120 - 5 <= local5 || this.anInt10124 - 5 <= local8) {
					this.anIntArrayArray82[local5][local8] = -1;
				} else {
					this.anIntArrayArray82[local5][local8] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZII)V")
	public void method8208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt10126;
		@Pc(9) int local9 = arg1 - this.anInt10122;
		this.anIntArrayArray82[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZZIZIII)V")
	public void method8209(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = 256;
		if (arg2) {
			local9 = 131328;
		}
		@Pc(20) int local20 = arg4 - this.anInt10122;
		@Pc(25) int local25 = arg6 - this.anInt10126;
		@Pc(37) int local37;
		if (arg5 == 1 || arg5 == 3) {
			local37 = arg0;
			arg0 = arg3;
			arg3 = local37;
		}
		if (arg1) {
			local9 |= 0x40000000;
		}
		for (local37 = local25; local37 < arg0 + local25; local37++) {
			if (local37 >= 0 && local37 < this.anInt10120) {
				for (@Pc(62) int local62 = local20; local62 < local20 + arg3; local62++) {
					if (local62 >= 0 && this.anInt10124 > local62) {
						this.method8213(local9, local37, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(ZII)V")
	public void method8210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt10122;
		@Pc(13) int local13 = arg0 - this.anInt10126;
		this.anIntArrayArray82[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZIIIZII)V")
	public void method8212(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt10126;
		@Pc(13) int local13 = arg1 - this.anInt10122;
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method8213(128, local4, local13);
				this.method8213(8, local4 - 1, local13);
			}
			if (arg2 == 1) {
				this.method8213(2, local4, local13);
				this.method8213(32, local4, local13 + 1);
			}
			if (arg2 == 2) {
				this.method8213(8, local4, local13);
				this.method8213(128, local4 + 1, local13);
			}
			if (arg2 == 3) {
				this.method8213(32, local4, local13);
				this.method8213(2, local4, local13 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method8213(1, local4, local13);
				this.method8213(16, local4 - 1, local13 + 1);
			}
			if (arg2 == 1) {
				this.method8213(4, local4, local13);
				this.method8213(64, local4 + 1, local13 + 1);
			}
			if (arg2 == 2) {
				this.method8213(16, local4, local13);
				this.method8213(1, local4 + 1, local13 + -1);
			}
			if (arg2 == 3) {
				this.method8213(64, local4, local13);
				this.method8213(4, local4 - 1, local13 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg2 == 0) {
				this.method8213(130, local4, local13);
				this.method8213(8, local4 - 1, local13);
				this.method8213(32, local4, local13 + 1);
			}
			if (arg2 == 1) {
				this.method8213(10, local4, local13);
				this.method8213(32, local4, local13 + 1);
				this.method8213(128, local4 + 1, local13);
			}
			if (arg2 == 2) {
				this.method8213(40, local4, local13);
				this.method8213(128, local4 + 1, local13);
				this.method8213(2, local4, local13 - 1);
			}
			if (arg2 == 3) {
				this.method8213(160, local4, local13);
				this.method8213(2, local4, local13 - 1);
				this.method8213(8, local4 - 1, local13);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg2 == 0) {
					this.method8213(65536, local4, local13);
					this.method8213(4096, local4 - 1, local13);
				}
				if (arg2 == 1) {
					this.method8213(1024, local4, local13);
					this.method8213(16384, local4, local13 + 1);
				}
				if (arg2 == 2) {
					this.method8213(4096, local4, local13);
					this.method8213(65536, local4 + 1, local13);
				}
				if (arg2 == 3) {
					this.method8213(16384, local4, local13);
					this.method8213(1024, local4, local13 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg2 == 0) {
					this.method8213(512, local4, local13);
					this.method8213(8192, local4 - 1, local13 + 1);
				}
				if (arg2 == 1) {
					this.method8213(2048, local4, local13);
					this.method8213(32768, local4 + 1, local13 - -1);
				}
				if (arg2 == 2) {
					this.method8213(8192, local4, local13);
					this.method8213(512, local4 + 1, local13 + -1);
				}
				if (arg2 == 3) {
					this.method8213(32768, local4, local13);
					this.method8213(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					this.method8213(66560, local4, local13);
					this.method8213(4096, local4 - 1, local13);
					this.method8213(16384, local4, local13 + 1);
				}
				if (arg2 == 1) {
					this.method8213(5120, local4, local13);
					this.method8213(16384, local4, local13 + 1);
					this.method8213(65536, local4 + 1, local13);
				}
				if (arg2 == 2) {
					this.method8213(20480, local4, local13);
					this.method8213(65536, local4 + 1, local13);
					this.method8213(1024, local4, local13 - 1);
				}
				if (arg2 == 3) {
					this.method8213(81920, local4, local13);
					this.method8213(1024, local4, local13 - 1);
					this.method8213(4096, local4 - 1, local13);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method8213(536870912, local4, local13);
				this.method8213(33554432, local4 - 1, local13);
			}
			if (arg2 == 1) {
				this.method8213(8388608, local4, local13);
				this.method8213(134217728, local4, local13 + 1);
			}
			if (arg2 == 2) {
				this.method8213(33554432, local4, local13);
				this.method8213(536870912, local4 + 1, local13);
			}
			if (arg2 == 3) {
				this.method8213(134217728, local4, local13);
				this.method8213(8388608, local4, local13 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method8213(4194304, local4, local13);
				this.method8213(67108864, local4 - 1, local13 + 1);
			}
			if (arg2 == 1) {
				this.method8213(16777216, local4, local13);
				this.method8213(268435456, local4 + 1, local13 - -1);
			}
			if (arg2 == 2) {
				this.method8213(67108864, local4, local13);
				this.method8213(4194304, local4 + 1, local13 + -1);
			}
			if (arg2 == 3) {
				this.method8213(268435456, local4, local13);
				this.method8213(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method8213(545259520, local4, local13);
			this.method8213(33554432, local4 - 1, local13);
			this.method8213(134217728, local4, local13 + 1);
		}
		if (arg2 == 1) {
			this.method8213(41943040, local4, local13);
			this.method8213(134217728, local4, local13 + 1);
			this.method8213(536870912, local4 + 1, local13);
		}
		if (arg2 == 2) {
			this.method8213(167772160, local4, local13);
			this.method8213(536870912, local4 + 1, local13);
			this.method8213(8388608, local4, local13 - 1);
		}
		if (arg2 == 3) {
			this.method8213(671088640, local4, local13);
			this.method8213(8388608, local4, local13 - 1);
			this.method8213(33554432, local4 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIII)V")
	private void method8213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray82[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method8214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static2.method179(arg2, arg7, arg7, arg5, arg1, arg0, arg3, arg4) ? true : this.method8221(arg0, arg3, arg7, arg5, arg2, arg4, arg6, arg1, arg7);
		}
		@Pc(41) int local41 = arg0 + arg1 - 1;
		@Pc(47) int local47 = arg3 + arg4 - 1;
		if (arg0 <= arg5 && arg5 <= local41 && arg2 >= arg4 && local47 >= arg2) {
			return true;
		} else if (arg5 == arg0 - 1 && arg4 <= arg2 && arg2 <= local47 && (this.anIntArrayArray82[arg5 - this.anInt10126][arg2 - this.anInt10122] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg5 == local41 + 1 && arg2 >= arg4 && arg2 <= local47 && (this.anIntArrayArray82[arg5 - this.anInt10126][arg2 - this.anInt10122] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg4 - 1 && arg5 >= arg0 && local41 >= arg5 && (this.anIntArrayArray82[arg5 - this.anInt10126][arg2 - this.anInt10122] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg2 && arg0 <= arg5 && local41 >= arg5 && (this.anIntArrayArray82[arg5 - this.anInt10126][arg2 - this.anInt10122] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(IIII)V")
	private void method8215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray82[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method8216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg6 && arg2 == arg0) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg1 + arg6 - 1 && arg2 <= arg2 && arg2 <= arg2 + arg1 - 1) {
			return true;
		}
		@Pc(67) int local67 = arg3 - this.anInt10126;
		@Pc(72) int local72 = arg0 - this.anInt10122;
		@Pc(77) int local77 = arg6 - this.anInt10126;
		@Pc(82) int local82 = arg2 - this.anInt10122;
		if (arg1 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local77 == local67 + 1 && local72 == local82 && (this.anIntArrayArray82[local77][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 == local77 && local72 == local82 - 1 && (this.anIntArrayArray82[local77][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - 1 == local77 && local82 == local72 && (this.anIntArrayArray82[local77][local72] & 0x8) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local82 - 1 && (this.anIntArrayArray82[local77][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local77 == local67 - 1 && local72 == local82 && (this.anIntArrayArray82[local77][local72] & 0x8) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local82 + 1 && (this.anIntArrayArray82[local77][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 + 1 == local77 && local82 == local72 && (this.anIntArrayArray82[local77][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 == local77 && local72 == local82 + 1 && (this.anIntArrayArray82[local77][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local67 == local77 && local82 + 1 == local72 && (this.anIntArrayArray82[local77][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 == local77 && local82 - 1 == local72 && (this.anIntArrayArray82[local77][local72] & 0x2) == 0) {
					return true;
				}
				if (local67 - 1 == local77 && local82 == local72 && (this.anIntArrayArray82[local77][local72] & 0x8) == 0) {
					return true;
				}
				if (local77 == local67 + 1 && local82 == local72 && (this.anIntArrayArray82[local77][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(93) int local93 = local77 + arg1 - 1;
			@Pc(100) int local100 = local72 + arg1 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local67 + 1 == local77 && local82 >= local72 && local100 >= local82 && (this.anIntArrayArray82[local77][local82] & 0x80) == 0) {
						return true;
					}
					if (local67 >= local77 && local67 <= local93 && local82 - arg1 == local72 && (this.anIntArrayArray82[local67][local100] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local67 - arg1 == local77 && local72 <= local82 && local100 >= local82 && (this.anIntArrayArray82[local93][local82] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local67 && local67 <= local93 && local82 - arg1 == local72 && (this.anIntArrayArray82[local67][local100] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local67 - arg1 == local77 && local82 >= local72 && local100 >= local82 && (this.anIntArrayArray82[local93][local82] & 0x8) == 0) {
						return true;
					}
					if (local67 >= local77 && local93 >= local67 && local72 == local82 + 1 && (this.anIntArrayArray82[local67][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local67 + 1 == local77 && local82 >= local72 && local82 <= local100 && (this.anIntArrayArray82[local77][local82] & 0x80) == 0) {
						return true;
					}
					if (local77 <= local67 && local67 <= local93 && local72 == local82 + 1 && (this.anIntArrayArray82[local67][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local77 <= local67 && local67 <= local93 && local82 + 1 == local72 && (this.anIntArrayArray82[local67][local72] & 0x20) == 0) {
					return true;
				}
				if (local77 <= local67 && local93 >= local67 && local72 == local82 - arg1 && (this.anIntArrayArray82[local67][local100] & 0x2) == 0) {
					return true;
				}
				if (local67 - arg1 == local77 && local72 <= local82 && local100 >= local82 && (this.anIntArrayArray82[local93][local82] & 0x8) == 0) {
					return true;
				}
				if (local67 + 1 == local77 && local72 <= local82 && local100 >= local82 && (this.anIntArrayArray82[local77][local82] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BII)V")
	public void method8217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt10122;
		@Pc(9) int local9 = arg1 - this.anInt10126;
		this.anIntArrayArray82[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method8218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg5 == arg0 && arg4 == arg6) {
				return true;
			}
		} else if (arg5 <= arg0 && arg1 + arg5 - 1 >= arg0 && arg4 <= arg4 && arg1 + arg4 - 1 >= arg4) {
			return true;
		}
		@Pc(59) int local59 = arg0 - this.anInt10126;
		@Pc(64) int local64 = arg5 - this.anInt10126;
		@Pc(69) int local69 = arg6 - this.anInt10122;
		@Pc(74) int local74 = arg4 - this.anInt10122;
		if (arg1 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local64 == local59 - 1 && local74 == local69) {
						return true;
					}
					if (local64 == local59 && local74 + 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 && local74 - 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 == local59 && local69 == local74 + 1) {
						return true;
					}
					if (local59 - 1 == local64 && local69 == local74 && (this.anIntArrayArray82[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local74 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 + 1 == local64 && local69 == local74) {
						return true;
					}
					if (local64 == local59 && local74 + 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 && local74 - 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 == local59 && local69 == local74 - 1) {
						return true;
					}
					if (local64 == local59 - 1 && local74 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local74 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local59 - 1 == local64 && local74 == local69) {
						return true;
					}
					if (local64 == local59 && local74 + 1 == local69) {
						return true;
					}
					if (local59 + 1 == local64 && local69 == local74 && (this.anIntArrayArray82[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local64 && local69 == local74 - 1 && (this.anIntArrayArray82[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 - 1 == local64 && local69 == local74 && (this.anIntArrayArray82[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 && local74 + 1 == local69) {
						return true;
					}
					if (local64 == local59 + 1 && local74 == local69) {
						return true;
					}
					if (local64 == local59 && local69 == local74 - 1 && (this.anIntArrayArray82[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 == local59 - 1 && local69 == local74 && (this.anIntArrayArray82[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local64 && local74 + 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 == local69) {
						return true;
					}
					if (local64 == local59 && local69 == local74 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 == local59 - 1 && local69 == local74) {
						return true;
					}
					if (local64 == local59 && local74 + 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local69 == local74 && (this.anIntArrayArray82[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local59 && local74 - 1 == local69) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local59 == local64 && local74 + 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x20) == 0) {
					return true;
				}
				if (local64 == local59 && local74 - 1 == local69 && (this.anIntArrayArray82[local64][local69] & 0x2) == 0) {
					return true;
				}
				if (local64 == local59 - 1 && local74 == local69 && (this.anIntArrayArray82[local64][local69] & 0x8) == 0) {
					return true;
				}
				if (local64 == local59 + 1 && local69 == local74 && (this.anIntArrayArray82[local64][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(85) int local85 = local64 + arg1 - 1;
			@Pc(91) int local91 = local69 + arg1 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local59 - arg1 == local64 && local69 <= local74 && local74 <= local91) {
						return true;
					}
					if (local59 >= local64 && local85 >= local59 && local74 + 1 == local69 && (this.anIntArrayArray82[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local64 && local85 >= local59 && local74 - arg1 == local69 && (this.anIntArrayArray82[local59][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 >= local64 && local59 <= local85 && local69 == local74 + 1) {
						return true;
					}
					if (local59 - arg1 == local64 && local69 <= local74 && local91 >= local74 && (this.anIntArrayArray82[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local74 >= local69 && local74 <= local91 && (this.anIntArrayArray82[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 == local59 + 1 && local74 >= local69 && local74 <= local91) {
						return true;
					}
					if (local64 <= local59 && local85 >= local59 && local69 == local74 + 1 && (this.anIntArrayArray82[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local85 && local69 == local74 - arg1 && (this.anIntArrayArray82[local59][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 >= local64 && local59 <= local85 && local74 - arg1 == local69) {
						return true;
					}
					if (local64 == local59 - arg1 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray82[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray82[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local64 == local59 - arg1 && local69 <= local74 && local91 >= local74) {
						return true;
					}
					if (local64 <= local59 && local85 >= local59 && local74 + 1 == local69) {
						return true;
					}
					if (local64 == local59 + 1 && local74 >= local69 && local74 <= local91 && (this.anIntArrayArray82[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local85 && local74 - arg1 == local69 && (this.anIntArrayArray82[local59][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 == local59 - arg1 && local69 <= local74 && local74 <= local91 && (this.anIntArrayArray82[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local59 && local59 <= local85 && local69 == local74 + 1) {
						return true;
					}
					if (local59 + 1 == local64 && local74 >= local69 && local74 <= local91) {
						return true;
					}
					if (local64 <= local59 && local85 >= local59 && local74 - arg1 == local69 && (this.anIntArrayArray82[local59][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 == local59 - arg1 && local69 <= local74 && local91 >= local74 && (this.anIntArrayArray82[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local59 && local85 >= local59 && local74 + 1 == local69 && (this.anIntArrayArray82[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 >= local69 && local91 >= local74) {
						return true;
					}
					if (local64 <= local59 && local59 <= local85 && local69 == local74 - arg1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 == local59 - arg1 && local69 <= local74 && local91 >= local74) {
						return true;
					}
					if (local64 <= local59 && local85 >= local59 && local69 == local74 + 1 && (this.anIntArrayArray82[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 >= local69 && local74 <= local91 && (this.anIntArrayArray82[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local64 && local85 >= local59 && local74 - arg1 == local69) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local64 <= local59 && local59 <= local85 && local69 == local74 + 1 && (this.anIntArrayArray82[local59][local69] & 0x2C0120) == 0) {
					return true;
				}
				if (local59 >= local64 && local85 >= local59 && local74 - arg1 == local69 && (this.anIntArrayArray82[local59][local91] & 0x2C0102) == 0) {
					return true;
				}
				if (local64 == local59 - arg1 && local74 >= local69 && local74 <= local91 && (this.anIntArrayArray82[local85][local74] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 == local59 + 1 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray82[local64][local74] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)V")
	public void method8219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt10122;
		@Pc(17) int local17 = arg1 - this.anInt10126;
		this.anIntArrayArray82[local17][local12] |= 0x200000;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIZIIZI)V")
	public void method8220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(5) int local5 = 256;
		if (arg5) {
			local5 = 131328;
		}
		if (arg2) {
			local5 |= 0x40000000;
		}
		@Pc(22) int local22 = arg4 - this.anInt10122;
		@Pc(27) int local27 = arg1 - this.anInt10126;
		for (@Pc(43) int local43 = local27; local43 < arg3 + local27; local43++) {
			if (local43 >= 0 && this.anInt10120 > local43) {
				for (@Pc(52) int local52 = local22; local52 < local22 + arg0; local52++) {
					if (local52 >= 0 && local52 < this.anInt10124) {
						this.method8215(local5, local43, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method8221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = arg3 + arg2;
		@Pc(17) int local17 = arg4 + arg8;
		@Pc(21) int local21 = arg7 + arg0;
		@Pc(26) int local26 = arg5 + arg1;
		@Pc(44) int local44;
		@Pc(55) int local55;
		if (local21 == arg3 && (arg6 & 0x2) == 0) {
			local44 = arg4 > arg5 ? arg4 : arg5;
			local55 = local26 > local17 ? local17 : local26;
			while (local55 > local44) {
				if ((this.anIntArrayArray82[local21 - this.anInt10126 - 1][local44 - this.anInt10122] & 0x8) == 0) {
					return true;
				}
				local44++;
			}
		} else if (local13 == arg0 && (arg6 & 0x8) == 0) {
			local44 = arg4 > arg5 ? arg4 : arg5;
			local55 = local17 < local26 ? local17 : local26;
			while (local44 < local55) {
				if ((this.anIntArrayArray82[arg0 - this.anInt10126][local44 - this.anInt10122] & 0x80) == 0) {
					return true;
				}
				local44++;
			}
		} else if (arg4 == local26 && (arg6 & 0x1) == 0) {
			local44 = arg3 > arg0 ? arg3 : arg0;
			local55 = local13 < local21 ? local13 : local21;
			while (local44 < local55) {
				if ((this.anIntArrayArray82[local44 - this.anInt10126][local26 - this.anInt10122 - 1] & 0x2) == 0) {
					return true;
				}
				local44++;
			}
		} else if (arg5 == local17 && (arg6 & 0x4) == 0) {
			local44 = arg0 < arg3 ? arg3 : arg0;
			local55 = local13 >= local21 ? local21 : local13;
			while (local44 < local55) {
				if ((this.anIntArrayArray82[local44 - this.anInt10126][arg5 - this.anInt10122] & 0x20) == 0) {
					return true;
				}
				local44++;
			}
		}
		return false;
	}
}

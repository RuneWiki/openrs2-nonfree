import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class62 {

	@OriginalMember(owner = "client!od", name = "C", descriptor = "I")
	private final int anInt1979;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	private final int anInt1973;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	private final int anInt1982;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	private final int anInt1976;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1979 = arg1;
		this.anInt1973 = 0;
		this.anInt1982 = arg0;
		this.anIntArrayArray22 = new int[this.anInt1982][this.anInt1979];
		this.anInt1976 = 0;
		this.method1458();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg4 && arg1 == arg3) {
			return true;
		}
		@Pc(25) int local25 = arg3 - this.anInt1976;
		@Pc(30) int local30 = arg5 - this.anInt1973;
		@Pc(35) int local35 = arg4 - this.anInt1973;
		@Pc(40) int local40 = arg1 - this.anInt1976;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local30 == local35 + 1 && local25 == local40 && (this.anIntArrayArray22[local30][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local35 && local25 == local40 - 1 && (this.anIntArrayArray22[local30][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local30 == local35 - 1 && local40 == local25 && (this.anIntArrayArray22[local30][local25] & 0x8) == 0) {
					return true;
				}
				if (local35 == local30 && local40 - 1 == local25 && (this.anIntArrayArray22[local30][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local35 - 1 == local30 && local25 == local40 && (this.anIntArrayArray22[local30][local25] & 0x8) == 0) {
					return true;
				}
				if (local30 == local35 && local25 == local40 + 1 && (this.anIntArrayArray22[local30][local25] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local30 == local35 + 1 && local25 == local40 && (this.anIntArrayArray22[local30][local25] & 0x80) == 0) {
					return true;
				}
				if (local35 == local30 && local40 + 1 == local25 && (this.anIntArrayArray22[local30][local25] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local35 == local30 && local40 + 1 == local25 && (this.anIntArrayArray22[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local35 == local30 && local40 - 1 == local25 && (this.anIntArrayArray22[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local35 - 1 && local40 == local25 && (this.anIntArrayArray22[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local35 + 1 == local30 && local25 == local40 && (this.anIntArrayArray22[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	private void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method1443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg1 && arg2 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg2 - this.anInt1976;
		@Pc(34) int local34 = arg1 - this.anInt1973;
		@Pc(39) int local39 = arg4 - this.anInt1976;
		@Pc(44) int local44 = arg0 - this.anInt1973;
		if (arg5 == 0) {
			if (arg3 == 0) {
				if (local44 - 1 == local34 && local24 == local39) {
					return true;
				}
				if (local34 == local44 && local39 == local24 + 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local44 == local34 && local39 == local24 - 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local34 == local44 && local39 == local24 + 1) {
					return true;
				}
				if (local44 - 1 == local34 && local39 == local24 && (this.anIntArrayArray22[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 == local44 + 1 && local24 == local39 && (this.anIntArrayArray22[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local34 == local44 + 1 && local24 == local39) {
					return true;
				}
				if (local44 == local34 && local39 == local24 + 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local44 == local34 && local24 - 1 == local39 && (this.anIntArrayArray22[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local44 == local34 && local39 == local24 - 1) {
					return true;
				}
				if (local34 == local44 - 1 && local39 == local24 && (this.anIntArrayArray22[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 == local44 + 1 && local39 == local24 && (this.anIntArrayArray22[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				if (local34 == local44 - 1 && local24 == local39) {
					return true;
				}
				if (local34 == local44 && local24 + 1 == local39) {
					return true;
				}
				if (local44 + 1 == local34 && local24 == local39 && (this.anIntArrayArray22[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local44 && local39 == local24 - 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local44 - 1 == local34 && local24 == local39 && (this.anIntArrayArray22[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local44 == local34 && local39 == local24 + 1) {
					return true;
				}
				if (local34 == local44 + 1 && local39 == local24) {
					return true;
				}
				if (local34 == local44 && local39 == local24 - 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local34 == local44 - 1 && local24 == local39 && (this.anIntArrayArray22[local34][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 == local44 && local39 == local24 + 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local44 + 1 == local34 && local24 == local39) {
					return true;
				}
				if (local34 == local44 && local39 == local24 - 1) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local34 == local44 - 1 && local24 == local39) {
					return true;
				}
				if (local34 == local44 && local39 == local24 + 1 && (this.anIntArrayArray22[local34][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local34 == local44 + 1 && local24 == local39 && (this.anIntArrayArray22[local34][local39] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local44 && local24 - 1 == local39) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local44 == local34 && local24 + 1 == local39 && (this.anIntArrayArray22[local34][local39] & 0x20) == 0) {
				return true;
			}
			if (local34 == local44 && local24 - 1 == local39 && (this.anIntArrayArray22[local34][local39] & 0x2) == 0) {
				return true;
			}
			if (local44 - 1 == local34 && local39 == local24 && (this.anIntArrayArray22[local34][local39] & 0x8) == 0) {
				return true;
			}
			if (local44 + 1 == local34 && local39 == local24 && (this.anIntArrayArray22[local34][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZIII)V")
	public void method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt1976;
		@Pc(13) int local13 = arg0 - this.anInt1973;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1447(local13, local4, 128);
				this.method1447(local13 - 1, local4, 8);
			}
			if (arg4 == 1) {
				this.method1447(local13, local4, 2);
				this.method1447(local13, local4 + 1, 32);
			}
			if (arg4 == 2) {
				this.method1447(local13, local4, 8);
				this.method1447(local13 + 1, local4, 128);
			}
			if (arg4 == 3) {
				this.method1447(local13, local4, 32);
				this.method1447(local13, local4 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1447(local13, local4, 1);
				this.method1447(local13 - 1, local4 + 1, 16);
			}
			if (arg4 == 1) {
				this.method1447(local13, local4, 4);
				this.method1447(local13 + 1, local4 + 1, 64);
			}
			if (arg4 == 2) {
				this.method1447(local13, local4, 16);
				this.method1447(local13 + 1, local4 - 1, 1);
			}
			if (arg4 == 3) {
				this.method1447(local13, local4, 64);
				this.method1447(local13 - 1, local4 - 1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1447(local13, local4, 130);
				this.method1447(local13 - 1, local4, 8);
				this.method1447(local13, local4 + 1, 32);
			}
			if (arg4 == 1) {
				this.method1447(local13, local4, 10);
				this.method1447(local13, local4 + 1, 32);
				this.method1447(local13 + 1, local4, 128);
			}
			if (arg4 == 2) {
				this.method1447(local13, local4, 40);
				this.method1447(local13 + 1, local4, 128);
				this.method1447(local13, local4 - 1, 2);
			}
			if (arg4 == 3) {
				this.method1447(local13, local4, 160);
				this.method1447(local13, local4 - 1, 2);
				this.method1447(local13 - 1, local4, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1447(local13, local4, 65536);
				this.method1447(local13 - 1, local4, 4096);
			}
			if (arg4 == 1) {
				this.method1447(local13, local4, 1024);
				this.method1447(local13, local4 + 1, 16384);
			}
			if (arg4 == 2) {
				this.method1447(local13, local4, 4096);
				this.method1447(local13 + 1, local4, 65536);
			}
			if (arg4 == 3) {
				this.method1447(local13, local4, 16384);
				this.method1447(local13, local4 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1447(local13, local4, 512);
				this.method1447(local13 - 1, local4 - -1, 8192);
			}
			if (arg4 == 1) {
				this.method1447(local13, local4, 2048);
				this.method1447(local13 + 1, local4 + 1, 32768);
			}
			if (arg4 == 2) {
				this.method1447(local13, local4, 8192);
				this.method1447(local13 + 1, local4 + -1, 512);
			}
			if (arg4 == 3) {
				this.method1447(local13, local4, 32768);
				this.method1447(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1447(local13, local4, 66560);
			this.method1447(local13 - 1, local4, 4096);
			this.method1447(local13, local4 + 1, 16384);
		}
		if (arg4 == 1) {
			this.method1447(local13, local4, 5120);
			this.method1447(local13, local4 + 1, 16384);
			this.method1447(local13 + 1, local4, 65536);
		}
		if (arg4 == 2) {
			this.method1447(local13, local4, 20480);
			this.method1447(local13 + 1, local4, 65536);
			this.method1447(local13, local4 - 1, 1024);
		}
		if (arg4 == 3) {
			this.method1447(local13, local4, 81920);
			this.method1447(local13, local4 - 1, 1024);
			this.method1447(local13 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZ)V")
	private void method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray22[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public void method1449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt1976;
		@Pc(25) int local25 = arg1 - this.anInt1973;
		this.anIntArrayArray22[local25][local16] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 + arg2 - 1;
		@Pc(15) int local15 = arg4 + arg6 - 1;
		if (arg5 >= arg2 && arg5 <= local9 && arg6 <= arg3 && arg3 <= local15) {
			return true;
		} else if (arg2 - 1 == arg5 && arg3 >= arg6 && arg3 <= local15 && (this.anIntArrayArray22[arg5 - this.anInt1973][arg3 - this.anInt1976] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg5 == local9 + 1 && arg3 >= arg6 && arg3 <= local15 && (this.anIntArrayArray22[arg5 - this.anInt1973][arg3 - this.anInt1976] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg6 - 1 && arg2 <= arg5 && arg5 <= local9 && (this.anIntArrayArray22[arg5 - this.anInt1973][arg3 - this.anInt1976] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local15 + 1 == arg3 && arg5 >= arg2 && arg5 <= local9 && (this.anIntArrayArray22[arg5 - this.anInt1973][arg3 - this.anInt1976] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	public void method1451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 - this.anInt1976;
		@Pc(24) int local24 = arg0 - this.anInt1973;
		this.anIntArrayArray22[local24][local19] |= 0x40000;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBIZI)V")
	public void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt1976;
		@Pc(9) int local9 = arg1 - this.anInt1973;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1442(128, local4, local9);
				this.method1442(8, local4, local9 - 1);
			}
			if (arg4 == 1) {
				this.method1442(2, local4, local9);
				this.method1442(32, local4 + 1, local9);
			}
			if (arg4 == 2) {
				this.method1442(8, local4, local9);
				this.method1442(128, local4, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1442(32, local4, local9);
				this.method1442(2, local4 - 1, local9);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1442(1, local4, local9);
				this.method1442(16, local4 + 1, local9 + -1);
			}
			if (arg4 == 1) {
				this.method1442(4, local4, local9);
				this.method1442(64, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method1442(16, local4, local9);
				this.method1442(1, local4 - 1, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1442(64, local4, local9);
				this.method1442(4, local4 - 1, local9 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method1442(130, local4, local9);
				this.method1442(8, local4, local9 - 1);
				this.method1442(32, local4 + 1, local9);
			}
			if (arg4 == 1) {
				this.method1442(10, local4, local9);
				this.method1442(32, local4 + 1, local9);
				this.method1442(128, local4, local9 + 1);
			}
			if (arg4 == 2) {
				this.method1442(40, local4, local9);
				this.method1442(128, local4, local9 + 1);
				this.method1442(2, local4 - 1, local9);
			}
			if (arg4 == 3) {
				this.method1442(160, local4, local9);
				this.method1442(2, local4 - 1, local9);
				this.method1442(8, local4, local9 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1442(65536, local4, local9);
				this.method1442(4096, local4, local9 - 1);
			}
			if (arg4 == 1) {
				this.method1442(1024, local4, local9);
				this.method1442(16384, local4 + 1, local9);
			}
			if (arg4 == 2) {
				this.method1442(4096, local4, local9);
				this.method1442(65536, local4, local9 + 1);
			}
			if (arg4 == 3) {
				this.method1442(16384, local4, local9);
				this.method1442(1024, local4 - 1, local9);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1442(512, local4, local9);
				this.method1442(8192, local4 + 1, local9 + -1);
			}
			if (arg4 == 1) {
				this.method1442(2048, local4, local9);
				this.method1442(32768, local4 + 1, local9 + 1);
			}
			if (arg4 == 2) {
				this.method1442(8192, local4, local9);
				this.method1442(512, local4 - 1, local9 - -1);
			}
			if (arg4 == 3) {
				this.method1442(32768, local4, local9);
				this.method1442(2048, local4 - 1, local9 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1442(66560, local4, local9);
			this.method1442(4096, local4, local9 - 1);
			this.method1442(16384, local4 + 1, local9);
		}
		if (arg4 == 1) {
			this.method1442(5120, local4, local9);
			this.method1442(16384, local4 + 1, local9);
			this.method1442(65536, local4, local9 + 1);
		}
		if (arg4 == 2) {
			this.method1442(20480, local4, local9);
			this.method1442(65536, local4, local9 + 1);
			this.method1442(1024, local4 - 1, local9);
		}
		if (arg4 == 3) {
			this.method1442(81920, local4, local9);
			this.method1442(1024, local4 - 1, local9);
			this.method1442(4096, local4, local9 - 1);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIIIB)V")
	public void method1454(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt1973;
		@Pc(8) int local8 = 256;
		@Pc(22) int local22;
		if (arg5 == 1 || arg5 == 3) {
			local22 = arg0;
			arg0 = arg2;
			arg2 = local22;
		}
		if (arg1) {
			local8 = 131328;
		}
		@Pc(37) int local37 = arg3 - this.anInt1976;
		for (local22 = local6; local22 < local6 + arg0; local22++) {
			if (local22 >= 0 && local22 < this.anInt1982) {
				for (@Pc(54) int local54 = local37; local54 < arg2 + local37; local54++) {
					if (local54 >= 0 && local54 < this.anInt1979) {
						this.method1447(local22, local54, local8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIIII)V")
	public void method1455(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg3 - this.anInt1973;
		@Pc(11) int local11 = arg1 - this.anInt1976;
		@Pc(21) int local21 = 256;
		@Pc(31) int local31;
		if (arg5 == 1 || arg5 == 3) {
			local31 = arg2;
			arg2 = arg4;
			arg4 = local31;
		}
		if (arg0) {
			local21 = 131328;
		}
		for (local31 = local6; local31 < local6 + arg2; local31++) {
			if (local31 >= 0 && this.anInt1982 > local31) {
				for (@Pc(57) int local57 = local11; local57 < arg4 + local11; local57++) {
					if (local57 >= 0 && local57 < this.anInt1979) {
						this.method1442(local21, local57, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V")
	public void method1456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 - this.anInt1976;
		@Pc(14) int local14 = arg1 - this.anInt1973;
		this.anIntArrayArray22[local14][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public void method1458() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1982; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1979; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt1982 - 1 == local3 || this.anInt1979 - 1 == local7) {
					this.anIntArrayArray22[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray22[local3][local7] = 16777216;
				}
			}
		}
	}
}

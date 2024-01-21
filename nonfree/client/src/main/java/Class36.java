import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class36 {

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
	private final int anInt1983 = 0;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	private final int anInt1967 = 0;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private final int anInt1978;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	private final int anInt1968;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(II)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1978 = arg1;
		this.anInt1968 = arg0;
		this.anIntArrayArray15 = new int[this.anInt1968][this.anInt1978];
		this.method1374();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIII)V")
	private void method1363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray15[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIZII)V")
	public void method1364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - this.anInt1967;
		@Pc(22) int local22;
		if (arg4 == 1 || arg4 == 3) {
			local22 = arg2;
			arg2 = arg1;
			arg1 = local22;
		}
		@Pc(37) int local37 = arg5 - this.anInt1983;
		@Pc(39) int local39 = 256;
		if (arg3) {
			local39 = 131328;
		}
		for (local22 = local37; local22 < arg2 + local37; local22++) {
			if (local22 >= 0 && this.anInt1968 > local22) {
				for (@Pc(60) int local60 = local10; local60 < arg1 + local10; local60++) {
					if (local60 >= 0 && this.anInt1978 > local60) {
						this.method1379(local60, local22, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
	public void method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1983;
		@Pc(9) int local9 = arg1 - this.anInt1967;
		this.anIntArrayArray15[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIZII)V")
	public void method1366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg0 - this.anInt1967;
		@Pc(24) int local24 = arg1 - this.anInt1983;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1363(128, local24, local19);
				this.method1363(8, local24 - 1, local19);
			}
			if (arg3 == 1) {
				this.method1363(2, local24, local19);
				this.method1363(32, local24, local19 + 1);
			}
			if (arg3 == 2) {
				this.method1363(8, local24, local19);
				this.method1363(128, local24 + 1, local19);
			}
			if (arg3 == 3) {
				this.method1363(32, local24, local19);
				this.method1363(2, local24, local19 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1363(1, local24, local19);
				this.method1363(16, local24 - 1, local19 - -1);
			}
			if (arg3 == 1) {
				this.method1363(4, local24, local19);
				this.method1363(64, local24 + 1, local19 + 1);
			}
			if (arg3 == 2) {
				this.method1363(16, local24, local19);
				this.method1363(1, local24 + 1, local19 + -1);
			}
			if (arg3 == 3) {
				this.method1363(64, local24, local19);
				this.method1363(4, local24 - 1, local19 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method1363(130, local24, local19);
				this.method1363(8, local24 - 1, local19);
				this.method1363(32, local24, local19 + 1);
			}
			if (arg3 == 1) {
				this.method1363(10, local24, local19);
				this.method1363(32, local24, local19 + 1);
				this.method1363(128, local24 + 1, local19);
			}
			if (arg3 == 2) {
				this.method1363(40, local24, local19);
				this.method1363(128, local24 + 1, local19);
				this.method1363(2, local24, local19 - 1);
			}
			if (arg3 == 3) {
				this.method1363(160, local24, local19);
				this.method1363(2, local24, local19 - 1);
				this.method1363(8, local24 - 1, local19);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1363(65536, local24, local19);
				this.method1363(4096, local24 - 1, local19);
			}
			if (arg3 == 1) {
				this.method1363(1024, local24, local19);
				this.method1363(16384, local24, local19 + 1);
			}
			if (arg3 == 2) {
				this.method1363(4096, local24, local19);
				this.method1363(65536, local24 + 1, local19);
			}
			if (arg3 == 3) {
				this.method1363(16384, local24, local19);
				this.method1363(1024, local24, local19 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1363(512, local24, local19);
				this.method1363(8192, local24 - 1, local19 - -1);
			}
			if (arg3 == 1) {
				this.method1363(2048, local24, local19);
				this.method1363(32768, local24 + 1, local19 - -1);
			}
			if (arg3 == 2) {
				this.method1363(8192, local24, local19);
				this.method1363(512, local24 + 1, local19 + -1);
			}
			if (arg3 == 3) {
				this.method1363(32768, local24, local19);
				this.method1363(2048, local24 - 1, local19 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1363(66560, local24, local19);
			this.method1363(4096, local24 - 1, local19);
			this.method1363(16384, local24, local19 + 1);
		}
		if (arg3 == 1) {
			this.method1363(5120, local24, local19);
			this.method1363(16384, local24, local19 + 1);
			this.method1363(65536, local24 + 1, local19);
		}
		if (arg3 == 2) {
			this.method1363(20480, local24, local19);
			this.method1363(65536, local24 + 1, local19);
			this.method1363(1024, local24, local19 - 1);
		}
		if (arg3 == 3) {
			this.method1363(81920, local24, local19);
			this.method1363(1024, local24, local19 - 1);
			this.method1363(4096, local24 - 1, local19);
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIZIII)V")
	public void method1368(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt1983;
		@Pc(13) int local13 = arg2 - this.anInt1967;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method1379(local13, local8, 128);
				this.method1379(local13, local8 - 1, 8);
			}
			if (arg4 == 1) {
				this.method1379(local13, local8, 2);
				this.method1379(local13 + 1, local8, 32);
			}
			if (arg4 == 2) {
				this.method1379(local13, local8, 8);
				this.method1379(local13, local8 + 1, 128);
			}
			if (arg4 == 3) {
				this.method1379(local13, local8, 32);
				this.method1379(local13 - 1, local8, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method1379(local13, local8, 1);
				this.method1379(local13 + 1, local8 + -1, 16);
			}
			if (arg4 == 1) {
				this.method1379(local13, local8, 4);
				this.method1379(local13 + 1, local8 - -1, 64);
			}
			if (arg4 == 2) {
				this.method1379(local13, local8, 16);
				this.method1379(local13 - 1, local8 + 1, 1);
			}
			if (arg4 == 3) {
				this.method1379(local13, local8, 64);
				this.method1379(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method1379(local13, local8, 130);
				this.method1379(local13, local8 - 1, 8);
				this.method1379(local13 + 1, local8, 32);
			}
			if (arg4 == 1) {
				this.method1379(local13, local8, 10);
				this.method1379(local13 + 1, local8, 32);
				this.method1379(local13, local8 + 1, 128);
			}
			if (arg4 == 2) {
				this.method1379(local13, local8, 40);
				this.method1379(local13, local8 + 1, 128);
				this.method1379(local13 - 1, local8, 2);
			}
			if (arg4 == 3) {
				this.method1379(local13, local8, 160);
				this.method1379(local13 - 1, local8, 2);
				this.method1379(local13, local8 - 1, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method1379(local13, local8, 65536);
				this.method1379(local13, local8 - 1, 4096);
			}
			if (arg4 == 1) {
				this.method1379(local13, local8, 1024);
				this.method1379(local13 + 1, local8, 16384);
			}
			if (arg4 == 2) {
				this.method1379(local13, local8, 4096);
				this.method1379(local13, local8 + 1, 65536);
			}
			if (arg4 == 3) {
				this.method1379(local13, local8, 16384);
				this.method1379(local13 - 1, local8, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method1379(local13, local8, 512);
				this.method1379(local13 + 1, local8 - 1, 8192);
			}
			if (arg4 == 1) {
				this.method1379(local13, local8, 2048);
				this.method1379(local13 + 1, local8 - -1, 32768);
			}
			if (arg4 == 2) {
				this.method1379(local13, local8, 8192);
				this.method1379(local13 - 1, local8 - -1, 512);
			}
			if (arg4 == 3) {
				this.method1379(local13, local8, 32768);
				this.method1379(local13 - 1, local8 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1379(local13, local8, 66560);
			this.method1379(local13, local8 - 1, 4096);
			this.method1379(local13 + 1, local8, 16384);
		}
		if (arg4 == 1) {
			this.method1379(local13, local8, 5120);
			this.method1379(local13 + 1, local8, 16384);
			this.method1379(local13, local8 + 1, 65536);
		}
		if (arg4 == 2) {
			this.method1379(local13, local8, 20480);
			this.method1379(local13, local8 + 1, 65536);
			this.method1379(local13 - 1, local8, 1024);
		}
		if (arg4 == 3) {
			this.method1379(local13, local8, 81920);
			this.method1379(local13 - 1, local8, 1024);
			this.method1379(local13, local8 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZI)V")
	public void method1369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1983;
		@Pc(13) int local13 = arg1 - this.anInt1967;
		this.anIntArrayArray15[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1 == arg5 && arg3 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg3 - this.anInt1967;
		@Pc(29) int local29 = arg5 - this.anInt1983;
		@Pc(34) int local34 = arg1 - this.anInt1983;
		@Pc(39) int local39 = arg2 - this.anInt1967;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local29 + 1 == local34 && local39 == local24 && (this.anIntArrayArray15[local34][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local39 - 1 && (this.anIntArrayArray15[local34][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 - 1 == local34 && local39 == local24 && (this.anIntArrayArray15[local34][local24] & 0x8) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local39 - 1 && (this.anIntArrayArray15[local34][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 == local29 - 1 && local39 == local24 && (this.anIntArrayArray15[local34][local24] & 0x8) == 0) {
					return true;
				}
				if (local34 == local29 && local24 == local39 + 1 && (this.anIntArrayArray15[local34][local24] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 + 1 == local34 && local24 == local39 && (this.anIntArrayArray15[local34][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local34 && local39 + 1 == local24 && (this.anIntArrayArray15[local34][local24] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local29 == local34 && local39 + 1 == local24 && (this.anIntArrayArray15[local34][local24] & 0x20) == 0) {
				return true;
			}
			if (local29 == local34 && local39 - 1 == local24 && (this.anIntArrayArray15[local34][local24] & 0x2) == 0) {
				return true;
			}
			if (local29 - 1 == local34 && local39 == local24 && (this.anIntArrayArray15[local34][local24] & 0x8) == 0) {
				return true;
			}
			if (local34 == local29 + 1 && local39 == local24 && (this.anIntArrayArray15[local34][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method1373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg5 && arg3 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt1983;
		@Pc(25) int local25 = arg4 - this.anInt1967;
		@Pc(30) int local30 = arg5 - this.anInt1983;
		@Pc(40) int local40 = arg3 - this.anInt1967;
		if (arg1 == 0) {
			if (arg0 == 0) {
				if (local20 == local30 - 1 && local40 == local25) {
					return true;
				}
				if (local30 == local20 && local25 == local40 + 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local40 - 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local30 && local25 == local40 + 1) {
					return true;
				}
				if (local20 == local30 - 1 && local25 == local40 && (this.anIntArrayArray15[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 + 1 == local20 && local25 == local40 && (this.anIntArrayArray15[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local20 == local30 + 1 && local40 == local25) {
					return true;
				}
				if (local30 == local20 && local40 + 1 == local25 && (this.anIntArrayArray15[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local40 - 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local30 == local20 && local25 == local40 - 1) {
					return true;
				}
				if (local20 == local30 - 1 && local40 == local25 && (this.anIntArrayArray15[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local30 + 1 && local40 == local25 && (this.anIntArrayArray15[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				if (local30 - 1 == local20 && local25 == local40) {
					return true;
				}
				if (local30 == local20 && local40 + 1 == local25) {
					return true;
				}
				if (local20 == local30 + 1 && local40 == local25 && (this.anIntArrayArray15[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local40 - 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local30 - 1 && local25 == local40 && (this.anIntArrayArray15[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local40 + 1) {
					return true;
				}
				if (local30 + 1 == local20 && local25 == local40) {
					return true;
				}
				if (local30 == local20 && local25 == local40 - 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local20 == local30 - 1 && local25 == local40 && (this.anIntArrayArray15[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local40 + 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local30 + 1 && local25 == local40) {
					return true;
				}
				if (local20 == local30 && local25 == local40 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local30 - 1 == local20 && local25 == local40) {
					return true;
				}
				if (local20 == local30 && local25 == local40 + 1 && (this.anIntArrayArray15[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local30 + 1 && local25 == local40 && (this.anIntArrayArray15[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local30 && local40 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local30 == local20 && local40 + 1 == local25 && (this.anIntArrayArray15[local20][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local20 && local25 == local40 - 1 && (this.anIntArrayArray15[local20][local25] & 0x2) == 0) {
				return true;
			}
			if (local20 == local30 - 1 && local40 == local25 && (this.anIntArrayArray15[local20][local25] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local20 && local40 == local25 && (this.anIntArrayArray15[local20][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method1374() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1968; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1978; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt1968 - 5 <= local3 || this.anInt1978 - 5 <= local7) {
					this.anIntArrayArray15[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray15[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZI)V")
	public void method1375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt1967;
		@Pc(19) int local19 = arg0 - this.anInt1983;
		this.anIntArrayArray15[local19][local10] |= 0x40000;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method1377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(15) int local15 = arg0 + arg4 - 1;
		@Pc(21) int local21 = arg3 + arg5 - 1;
		if (arg1 >= arg0 && arg1 <= local15 && arg2 >= arg5 && arg2 <= local21) {
			return true;
		} else if (arg0 - 1 == arg1 && arg5 <= arg2 && local21 >= arg2 && (this.anIntArrayArray15[arg1 - this.anInt1983][arg2 - this.anInt1967] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg1 == local15 + 1 && arg5 <= arg2 && local21 >= arg2 && (this.anIntArrayArray15[arg1 - this.anInt1983][arg2 - this.anInt1967] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg2 && arg1 >= arg0 && arg1 <= local15 && (this.anIntArrayArray15[arg1 - this.anInt1983][arg2 - this.anInt1967] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local21 + 1 == arg2 && arg1 >= arg0 && local15 >= arg1 && (this.anIntArrayArray15[arg1 - this.anInt1983][arg2 - this.anInt1967] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIIII)V")
	public void method1378(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg3 - this.anInt1967;
		@Pc(15) int local15 = arg2 - this.anInt1983;
		@Pc(17) int local17 = 256;
		if (arg0) {
			local17 = 131328;
		}
		for (@Pc(30) int local30 = local15; local30 < arg4 + local15; local30++) {
			if (local30 >= 0 && this.anInt1968 > local30) {
				for (@Pc(43) int local43 = local10; local43 < arg1 + local10; local43++) {
					if (local43 >= 0 && local43 < this.anInt1978) {
						this.method1363(local17, local30, local43);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBII)V")
	private void method1379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray15[arg1][arg0] &= ~arg2;
	}
}

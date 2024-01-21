import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class55 {

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
	public static int[] anIntArray256 = new int[99];

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	private final int anInt1800;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
	private final int anInt1806;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	private final int anInt1812;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	private final int anInt1811;

	static {
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < 99; local22++) {
			@Pc(27) int local27 = local22 + 1;
			@Pc(40) int local40 = (int) ((double) local27 + Math.pow(2.0D, (double) local27 / 7.0D) * 300.0D);
			local20 += local40;
			anIntArray256[local22] = local20 / 4;
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(II)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1800 = arg1;
		this.anInt1806 = arg0;
		this.anIntArrayArray18 = new int[this.anInt1806][this.anInt1800];
		this.anInt1812 = 0;
		this.anInt1811 = 0;
		this.method1282();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIZ)V")
	public void method1271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 == 1 || arg0 == 3) {
			@Pc(15) int local15 = arg3;
			arg3 = arg1;
			arg1 = local15;
		}
		@Pc(24) int local24 = arg2 - this.anInt1811;
		@Pc(29) int local29 = arg4 - this.anInt1812;
		@Pc(39) int local39 = 256;
		if (arg5) {
			local39 = 131328;
		}
		for (@Pc(47) int local47 = local29; local47 < arg3 + local29; local47++) {
			if (local47 >= 0 && local47 < this.anInt1806) {
				for (@Pc(57) int local57 = local24; local57 < local24 + arg1; local57++) {
					if (local57 >= 0 && this.anInt1800 > local57) {
						this.method1284(local57, local39, local47);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZII)V")
	public void method1272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1811;
		@Pc(13) int local13 = arg0 - this.anInt1812;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1274(local4, 128, local13);
				this.method1274(local4, 8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method1274(local4, 2, local13);
				this.method1274(local4 + 1, 32, local13);
			}
			if (arg4 == 2) {
				this.method1274(local4, 8, local13);
				this.method1274(local4, 128, local13 + 1);
			}
			if (arg4 == 3) {
				this.method1274(local4, 32, local13);
				this.method1274(local4 - 1, 2, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1274(local4, 1, local13);
				this.method1274(local4 + 1, 16, local13 - 1);
			}
			if (arg4 == 1) {
				this.method1274(local4, 4, local13);
				this.method1274(local4 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1274(local4, 16, local13);
				this.method1274(local4 - 1, 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method1274(local4, 64, local13);
				this.method1274(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method1274(local4, 130, local13);
				this.method1274(local4, 8, local13 - 1);
				this.method1274(local4 + 1, 32, local13);
			}
			if (arg4 == 1) {
				this.method1274(local4, 10, local13);
				this.method1274(local4 + 1, 32, local13);
				this.method1274(local4, 128, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1274(local4, 40, local13);
				this.method1274(local4, 128, local13 + 1);
				this.method1274(local4 - 1, 2, local13);
			}
			if (arg4 == 3) {
				this.method1274(local4, 160, local13);
				this.method1274(local4 - 1, 2, local13);
				this.method1274(local4, 8, local13 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method1274(local4, 65536, local13);
				this.method1274(local4, 4096, local13 - 1);
			}
			if (arg4 == 1) {
				this.method1274(local4, 1024, local13);
				this.method1274(local4 + 1, 16384, local13);
			}
			if (arg4 == 2) {
				this.method1274(local4, 4096, local13);
				this.method1274(local4, 65536, local13 + 1);
			}
			if (arg4 == 3) {
				this.method1274(local4, 16384, local13);
				this.method1274(local4 - 1, 1024, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method1274(local4, 512, local13);
				this.method1274(local4 + 1, 8192, local13 - 1);
			}
			if (arg4 == 1) {
				this.method1274(local4, 2048, local13);
				this.method1274(local4 + 1, 32768, local13 + 1);
			}
			if (arg4 == 2) {
				this.method1274(local4, 8192, local13);
				this.method1274(local4 - 1, 512, local13 + 1);
			}
			if (arg4 == 3) {
				this.method1274(local4, 32768, local13);
				this.method1274(local4 - 1, 2048, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1274(local4, 66560, local13);
			this.method1274(local4, 4096, local13 - 1);
			this.method1274(local4 + 1, 16384, local13);
		}
		if (arg4 == 1) {
			this.method1274(local4, 5120, local13);
			this.method1274(local4 + 1, 16384, local13);
			this.method1274(local4, 65536, local13 + 1);
		}
		if (arg4 == 2) {
			this.method1274(local4, 20480, local13);
			this.method1274(local4, 65536, local13 + 1);
			this.method1274(local4 - 1, 1024, local13);
		}
		if (arg4 == 3) {
			this.method1274(local4, 81920, local13);
			this.method1274(local4 - 1, 1024, local13);
			this.method1274(local4, 4096, local13 - 1);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg1 == arg2) {
			return true;
		}
		@Pc(20) int local20 = arg1 - this.anInt1811;
		@Pc(25) int local25 = arg5 - this.anInt1812;
		@Pc(30) int local30 = arg3 - this.anInt1812;
		@Pc(35) int local35 = arg2 - this.anInt1811;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local25 + 1 == local30 && local35 == local20 && (this.anIntArrayArray18[local30][local20] & 0x80) == 0) {
					return true;
				}
				if (local25 == local30 && local20 == local35 - 1 && (this.anIntArrayArray18[local30][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local25 - 1 == local30 && local35 == local20 && (this.anIntArrayArray18[local30][local20] & 0x8) == 0) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local20 && (this.anIntArrayArray18[local30][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local25 - 1 == local30 && local35 == local20 && (this.anIntArrayArray18[local30][local20] & 0x8) == 0) {
					return true;
				}
				if (local25 == local30 && local35 + 1 == local20 && (this.anIntArrayArray18[local30][local20] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local25 + 1 == local30 && local20 == local35 && (this.anIntArrayArray18[local30][local20] & 0x80) == 0) {
					return true;
				}
				if (local25 == local30 && local20 == local35 + 1 && (this.anIntArrayArray18[local30][local20] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local25 == local30 && local20 == local35 + 1 && (this.anIntArrayArray18[local30][local20] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local20 == local35 - 1 && (this.anIntArrayArray18[local30][local20] & 0x2) == 0) {
				return true;
			}
			if (local30 == local25 - 1 && local20 == local35 && (this.anIntArrayArray18[local30][local20] & 0x8) == 0) {
				return true;
			}
			if (local25 + 1 == local30 && local20 == local35 && (this.anIntArrayArray18[local30][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
	private void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray18[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIIIIZ)V")
	public void method1275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg3 - this.anInt1811;
		@Pc(11) int local11 = arg2 - this.anInt1812;
		@Pc(23) int local23;
		if (arg0 == 1 || arg0 == 3) {
			local23 = arg4;
			arg4 = arg1;
			arg1 = local23;
		}
		@Pc(33) int local33 = 256;
		if (arg5) {
			local33 = 131328;
		}
		for (local23 = local11; local23 < local11 + arg4; local23++) {
			if (local23 >= 0 && this.anInt1806 > local23) {
				for (@Pc(59) int local59 = local6; local59 < local6 + arg1; local59++) {
					if (local59 >= 0 && this.anInt1800 > local59) {
						this.method1274(local59, local33, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIZIII)V")
	public void method1276(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg2 - this.anInt1812;
		@Pc(24) int local24 = arg3 - this.anInt1811;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method1284(local24, 128, local19);
				this.method1284(local24, 8, local19 - 1);
			}
			if (arg4 == 1) {
				this.method1284(local24, 2, local19);
				this.method1284(local24 + 1, 32, local19);
			}
			if (arg4 == 2) {
				this.method1284(local24, 8, local19);
				this.method1284(local24, 128, local19 + 1);
			}
			if (arg4 == 3) {
				this.method1284(local24, 32, local19);
				this.method1284(local24 - 1, 2, local19);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method1284(local24, 1, local19);
				this.method1284(local24 + 1, 16, local19 - 1);
			}
			if (arg4 == 1) {
				this.method1284(local24, 4, local19);
				this.method1284(local24 + 1, 64, local19 + 1);
			}
			if (arg4 == 2) {
				this.method1284(local24, 16, local19);
				this.method1284(local24 - 1, 1, local19 + 1);
			}
			if (arg4 == 3) {
				this.method1284(local24, 64, local19);
				this.method1284(local24 - 1, 4, local19 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method1284(local24, 130, local19);
				this.method1284(local24, 8, local19 - 1);
				this.method1284(local24 + 1, 32, local19);
			}
			if (arg4 == 1) {
				this.method1284(local24, 10, local19);
				this.method1284(local24 + 1, 32, local19);
				this.method1284(local24, 128, local19 + 1);
			}
			if (arg4 == 2) {
				this.method1284(local24, 40, local19);
				this.method1284(local24, 128, local19 + 1);
				this.method1284(local24 - 1, 2, local19);
			}
			if (arg4 == 3) {
				this.method1284(local24, 160, local19);
				this.method1284(local24 - 1, 2, local19);
				this.method1284(local24, 8, local19 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method1284(local24, 65536, local19);
				this.method1284(local24, 4096, local19 - 1);
			}
			if (arg4 == 1) {
				this.method1284(local24, 1024, local19);
				this.method1284(local24 + 1, 16384, local19);
			}
			if (arg4 == 2) {
				this.method1284(local24, 4096, local19);
				this.method1284(local24, 65536, local19 + 1);
			}
			if (arg4 == 3) {
				this.method1284(local24, 16384, local19);
				this.method1284(local24 - 1, 1024, local19);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method1284(local24, 512, local19);
				this.method1284(local24 + 1, 8192, local19 - 1);
			}
			if (arg4 == 1) {
				this.method1284(local24, 2048, local19);
				this.method1284(local24 + 1, 32768, local19 + 1);
			}
			if (arg4 == 2) {
				this.method1284(local24, 8192, local19);
				this.method1284(local24 - 1, 512, local19 + 1);
			}
			if (arg4 == 3) {
				this.method1284(local24, 32768, local19);
				this.method1284(local24 - 1, 2048, local19 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1284(local24, 66560, local19);
			this.method1284(local24, 4096, local19 - 1);
			this.method1284(local24 + 1, 16384, local19);
		}
		if (arg4 == 1) {
			this.method1284(local24, 5120, local19);
			this.method1284(local24 + 1, 16384, local19);
			this.method1284(local24, 65536, local19 + 1);
		}
		if (arg4 == 2) {
			this.method1284(local24, 20480, local19);
			this.method1284(local24, 65536, local19 + 1);
			this.method1284(local24 - 1, 1024, local19);
		}
		if (arg4 == 3) {
			this.method1284(local24, 81920, local19);
			this.method1284(local24 - 1, 1024, local19);
			this.method1284(local24, 4096, local19 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ)V")
	public void method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1811;
		@Pc(9) int local9 = arg0 - this.anInt1812;
		this.anIntArrayArray18[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public void method1278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1811;
		@Pc(13) int local13 = arg1 - this.anInt1812;
		this.anIntArrayArray18[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg1 == arg0) {
			return true;
		}
		@Pc(28) int local28 = arg3 - this.anInt1812;
		@Pc(33) int local33 = arg0 - this.anInt1811;
		@Pc(38) int local38 = arg1 - this.anInt1811;
		@Pc(43) int local43 = arg5 - this.anInt1812;
		if (arg4 == 0) {
			if (arg2 == 0) {
				if (local28 == local43 - 1 && local38 == local33) {
					return true;
				}
				if (local43 == local28 && local33 + 1 == local38 && (this.anIntArrayArray18[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local28 == local43 && local38 == local33 - 1 && (this.anIntArrayArray18[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local28 == local43 && local33 + 1 == local38) {
					return true;
				}
				if (local28 == local43 - 1 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local43 + 1 == local28 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local28 == local43 + 1 && local33 == local38) {
					return true;
				}
				if (local43 == local28 && local33 + 1 == local38 && (this.anIntArrayArray18[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local43 == local28 && local33 - 1 == local38 && (this.anIntArrayArray18[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local28 == local43 && local38 == local33 - 1) {
					return true;
				}
				if (local28 == local43 - 1 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local43 + 1 == local28 && local33 == local38 && (this.anIntArrayArray18[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				if (local28 == local43 - 1 && local33 == local38) {
					return true;
				}
				if (local28 == local43 && local38 == local33 + 1) {
					return true;
				}
				if (local28 == local43 + 1 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
				if (local28 == local43 && local38 == local33 - 1 && (this.anIntArrayArray18[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local28 == local43 - 1 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local43 == local28 && local38 == local33 + 1) {
					return true;
				}
				if (local28 == local43 + 1 && local33 == local38) {
					return true;
				}
				if (local43 == local28 && local38 == local33 - 1 && (this.anIntArrayArray18[local28][local38] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local28 == local43 - 1 && local33 == local38 && (this.anIntArrayArray18[local28][local38] & 0x12C0108) == 0) {
					return true;
				}
				if (local28 == local43 && local33 + 1 == local38 && (this.anIntArrayArray18[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local28 == local43 + 1 && local38 == local33) {
					return true;
				}
				if (local43 == local28 && local38 == local33 - 1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local43 - 1 == local28 && local33 == local38) {
					return true;
				}
				if (local43 == local28 && local38 == local33 + 1 && (this.anIntArrayArray18[local28][local38] & 0x12C0120) == 0) {
					return true;
				}
				if (local43 + 1 == local28 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x12C0180) == 0) {
					return true;
				}
				if (local43 == local28 && local33 - 1 == local38) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local28 == local43 && local33 + 1 == local38 && (this.anIntArrayArray18[local28][local38] & 0x20) == 0) {
				return true;
			}
			if (local28 == local43 && local38 == local33 - 1 && (this.anIntArrayArray18[local28][local38] & 0x2) == 0) {
				return true;
			}
			if (local43 - 1 == local28 && local38 == local33 && (this.anIntArrayArray18[local28][local38] & 0x8) == 0) {
				return true;
			}
			if (local28 == local43 + 1 && local33 == local38 && (this.anIntArrayArray18[local28][local38] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method1281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg0 + arg3 - 1;
		@Pc(23) int local23 = arg5 + arg2 - 1;
		if (arg1 >= arg2 && local23 >= arg1 && arg0 <= arg6 && local17 >= arg6) {
			return true;
		} else if (arg1 == arg2 - 1 && arg6 >= arg0 && arg6 <= local17 && (this.anIntArrayArray18[arg1 - this.anInt1812][arg6 - this.anInt1811] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg1 == local23 + 1 && arg0 <= arg6 && local17 >= arg6 && (this.anIntArrayArray18[arg1 - this.anInt1812][arg6 - this.anInt1811] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg0 - 1 && arg2 <= arg1 && local23 >= arg1 && (this.anIntArrayArray18[arg1 - this.anInt1812][arg6 - this.anInt1811] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local17 + 1 == arg6 && arg1 >= arg2 && arg1 <= local23 && (this.anIntArrayArray18[arg1 - this.anInt1812][arg6 - this.anInt1811] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public void method1282() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt1806; local9++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt1800; local13++) {
				if (local9 == 0 || local13 == 0 || this.anInt1806 - 1 == local9 || this.anInt1800 - 1 == local13) {
					this.anIntArrayArray18[local9][local13] = 16777215;
				} else {
					this.anIntArrayArray18[local9][local13] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)V")
	public void method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 - this.anInt1812;
		@Pc(24) int local24 = arg0 - this.anInt1811;
		this.anIntArrayArray18[local15][local24] |= 0x40000;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)V")
	private void method1284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray18[arg2][arg0] |= arg1;
	}
}

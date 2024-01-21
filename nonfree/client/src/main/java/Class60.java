import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class60 {

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	private final int anInt2752 = 0;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	private final int anInt2757 = 0;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private final int anInt2759;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	private final int anInt2743;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2759 = arg0;
		this.anInt2743 = arg1;
		this.anIntArrayArray69 = new int[this.anInt2759][this.anInt2743];
		this.method1722();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIII)V")
	public void method1719(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - this.anInt2757;
		@Pc(12) int local12 = 256;
		@Pc(32) int local32;
		if (arg5 == 1 || arg5 == 3) {
			local32 = arg2;
			arg2 = arg3;
			arg3 = local32;
		}
		@Pc(41) int local41 = arg0 - this.anInt2752;
		if (arg1) {
			local12 = 131328;
		}
		for (local32 = local41; local32 < local41 + arg2; local32++) {
			if (local32 >= 0 && this.anInt2759 > local32) {
				for (@Pc(62) int local62 = local10; local62 < local10 + arg3; local62++) {
					if (local62 >= 0 && this.anInt2743 > local62) {
						this.method1729(local62, local12, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBII)V")
	private void method1721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray69[arg1][arg2] &= 16777215 - arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method1722() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2759; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2743; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt2759 - 1 == local3 || local7 == this.anInt2743 - 1) {
					this.anIntArrayArray69[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray69[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg1 && arg2 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg1 - this.anInt2752;
		@Pc(30) int local30 = arg3 - this.anInt2752;
		@Pc(35) int local35 = arg4 - this.anInt2757;
		@Pc(40) int local40 = arg2 - this.anInt2757;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local30 == local20 + 1 && local35 == local40 && (this.anIntArrayArray69[local30][local40] & 0x80) == 0) {
					return true;
				}
				if (local30 == local20 && local40 == local35 - 1 && (this.anIntArrayArray69[local30][local40] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 - 1 == local30 && local35 == local40 && (this.anIntArrayArray69[local30][local40] & 0x8) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local40 && (this.anIntArrayArray69[local30][local40] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local20 - 1 == local30 && local40 == local35 && (this.anIntArrayArray69[local30][local40] & 0x8) == 0) {
					return true;
				}
				if (local30 == local20 && local40 == local35 + 1 && (this.anIntArrayArray69[local30][local40] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local30 == local20 + 1 && local40 == local35 && (this.anIntArrayArray69[local30][local40] & 0x80) == 0) {
					return true;
				}
				if (local20 == local30 && local35 + 1 == local40 && (this.anIntArrayArray69[local30][local40] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local30 == local20 && local35 + 1 == local40 && (this.anIntArrayArray69[local30][local40] & 0x20) == 0) {
				return true;
			}
			if (local30 == local20 && local35 - 1 == local40 && (this.anIntArrayArray69[local30][local40] & 0x2) == 0) {
				return true;
			}
			if (local30 == local20 - 1 && local35 == local40 && (this.anIntArrayArray69[local30][local40] & 0x8) == 0) {
				return true;
			}
			if (local30 == local20 + 1 && local40 == local35 && (this.anIntArrayArray69[local30][local40] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg1 - 1;
		@Pc(15) int local15 = arg4 + arg0 - 1;
		if (arg3 >= arg0 && arg3 <= local15 && arg1 <= arg6 && local9 >= arg6) {
			return true;
		} else if (arg3 == arg0 - 1 && arg6 >= arg1 && arg6 <= local9 && (this.anIntArrayArray69[arg3 - this.anInt2752][arg6 - this.anInt2757] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local15 + 1 == arg3 && arg1 <= arg6 && arg6 <= local9 && (this.anIntArrayArray69[arg3 - this.anInt2752][arg6 - this.anInt2757] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg1 - 1 && arg0 <= arg3 && arg3 <= local15 && (this.anIntArrayArray69[arg3 - this.anInt2752][arg6 - this.anInt2757] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg6 && arg3 >= arg0 && arg3 <= local15 && (this.anIntArrayArray69[arg3 - this.anInt2752][arg6 - this.anInt2757] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIZI)V")
	public void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int local4 = arg0 - this.anInt2757;
		@Pc(9) int local9 = arg2 - this.anInt2752;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1729(local4, 128, local9);
				this.method1729(local4, 8, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1729(local4, 2, local9);
				this.method1729(local4 + 1, 32, local9);
			}
			if (arg1 == 2) {
				this.method1729(local4, 8, local9);
				this.method1729(local4, 128, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1729(local4, 32, local9);
				this.method1729(local4 - 1, 2, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1729(local4, 1, local9);
				this.method1729(local4 + 1, 16, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1729(local4, 4, local9);
				this.method1729(local4 + 1, 64, local9 + 1);
			}
			if (arg1 == 2) {
				this.method1729(local4, 16, local9);
				this.method1729(local4 - 1, 1, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1729(local4, 64, local9);
				this.method1729(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method1729(local4, 130, local9);
				this.method1729(local4, 8, local9 - 1);
				this.method1729(local4 + 1, 32, local9);
			}
			if (arg1 == 1) {
				this.method1729(local4, 10, local9);
				this.method1729(local4 + 1, 32, local9);
				this.method1729(local4, 128, local9 + 1);
			}
			if (arg1 == 2) {
				this.method1729(local4, 40, local9);
				this.method1729(local4, 128, local9 + 1);
				this.method1729(local4 - 1, 2, local9);
			}
			if (arg1 == 3) {
				this.method1729(local4, 160, local9);
				this.method1729(local4 - 1, 2, local9);
				this.method1729(local4, 8, local9 - 1);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1729(local4, 65536, local9);
				this.method1729(local4, 4096, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1729(local4, 1024, local9);
				this.method1729(local4 + 1, 16384, local9);
			}
			if (arg1 == 2) {
				this.method1729(local4, 4096, local9);
				this.method1729(local4, 65536, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1729(local4, 16384, local9);
				this.method1729(local4 - 1, 1024, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1729(local4, 512, local9);
				this.method1729(local4 + 1, 8192, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1729(local4, 2048, local9);
				this.method1729(local4 + 1, 32768, local9 + 1);
			}
			if (arg1 == 2) {
				this.method1729(local4, 8192, local9);
				this.method1729(local4 - 1, 512, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1729(local4, 32768, local9);
				this.method1729(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1729(local4, 66560, local9);
			this.method1729(local4, 4096, local9 - 1);
			this.method1729(local4 + 1, 16384, local9);
		}
		if (arg1 == 1) {
			this.method1729(local4, 5120, local9);
			this.method1729(local4 + 1, 16384, local9);
			this.method1729(local4, 65536, local9 + 1);
		}
		if (arg1 == 2) {
			this.method1729(local4, 20480, local9);
			this.method1729(local4, 65536, local9 + 1);
			this.method1729(local4 - 1, 1024, local9);
		}
		if (arg1 == 3) {
			this.method1729(local4, 81920, local9);
			this.method1729(local4 - 1, 1024, local9);
			this.method1729(local4, 4096, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIBZI)V")
	public void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt2752;
		@Pc(20) int local20;
		if (arg3 == 1 || arg3 == 3) {
			local20 = arg0;
			arg0 = arg2;
			arg2 = local20;
		}
		@Pc(26) int local26 = 256;
		if (arg4) {
			local26 = 131328;
		}
		@Pc(37) int local37 = arg1 - this.anInt2757;
		for (local20 = local6; local20 < arg0 + local6; local20++) {
			if (local20 >= 0 && local20 < this.anInt2759) {
				for (@Pc(53) int local53 = local37; local53 < arg2 + local37; local53++) {
					if (local53 >= 0 && this.anInt2743 > local53) {
						this.method1721(local26, local20, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)V")
	public void method1728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2752;
		@Pc(13) int local13 = arg1 - this.anInt2757;
		this.anIntArrayArray69[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	private void method1729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray69[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZIII)V")
	public void method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt2757;
		@Pc(13) int local13 = arg0 - this.anInt2752;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1721(128, local13, local4);
				this.method1721(8, local13 - 1, local4);
			}
			if (arg3 == 1) {
				this.method1721(2, local13, local4);
				this.method1721(32, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1721(8, local13, local4);
				this.method1721(128, local13 + 1, local4);
			}
			if (arg3 == 3) {
				this.method1721(32, local13, local4);
				this.method1721(2, local13, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1721(1, local13, local4);
				this.method1721(16, local13 - 1, local4 + 1);
			}
			if (arg3 == 1) {
				this.method1721(4, local13, local4);
				this.method1721(64, local13 + 1, local4 - -1);
			}
			if (arg3 == 2) {
				this.method1721(16, local13, local4);
				this.method1721(1, local13 + 1, local4 - 1);
			}
			if (arg3 == 3) {
				this.method1721(64, local13, local4);
				this.method1721(4, local13 - 1, local4 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method1721(130, local13, local4);
				this.method1721(8, local13 - 1, local4);
				this.method1721(32, local13, local4 + 1);
			}
			if (arg3 == 1) {
				this.method1721(10, local13, local4);
				this.method1721(32, local13, local4 + 1);
				this.method1721(128, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method1721(40, local13, local4);
				this.method1721(128, local13 + 1, local4);
				this.method1721(2, local13, local4 - 1);
			}
			if (arg3 == 3) {
				this.method1721(160, local13, local4);
				this.method1721(2, local13, local4 - 1);
				this.method1721(8, local13 - 1, local4);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1721(65536, local13, local4);
				this.method1721(4096, local13 - 1, local4);
			}
			if (arg3 == 1) {
				this.method1721(1024, local13, local4);
				this.method1721(16384, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1721(4096, local13, local4);
				this.method1721(65536, local13 + 1, local4);
			}
			if (arg3 == 3) {
				this.method1721(16384, local13, local4);
				this.method1721(1024, local13, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1721(512, local13, local4);
				this.method1721(8192, local13 - 1, local4 + 1);
			}
			if (arg3 == 1) {
				this.method1721(2048, local13, local4);
				this.method1721(32768, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1721(8192, local13, local4);
				this.method1721(512, local13 + 1, local4 + -1);
			}
			if (arg3 == 3) {
				this.method1721(32768, local13, local4);
				this.method1721(2048, local13 - 1, local4 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1721(66560, local13, local4);
			this.method1721(4096, local13 - 1, local4);
			this.method1721(16384, local13, local4 + 1);
		}
		if (arg3 == 1) {
			this.method1721(5120, local13, local4);
			this.method1721(16384, local13, local4 + 1);
			this.method1721(65536, local13 + 1, local4);
		}
		if (arg3 == 2) {
			this.method1721(20480, local13, local4);
			this.method1721(65536, local13 + 1, local4);
			this.method1721(1024, local13, local4 - 1);
		}
		if (arg3 == 3) {
			this.method1721(81920, local13, local4);
			this.method1721(1024, local13, local4 - 1);
			this.method1721(4096, local13 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIIIII)Z")
	public boolean method1732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg1 && arg4 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg2 - this.anInt2757;
		@Pc(29) int local29 = arg1 - this.anInt2752;
		@Pc(39) int local39 = arg5 - this.anInt2752;
		@Pc(44) int local44 = arg4 - this.anInt2757;
		if (arg0 == 0) {
			if (arg3 == 0) {
				if (local29 - 1 == local39 && local44 == local24) {
					return true;
				}
				if (local29 == local39 && local24 + 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local39 == local29 && local24 - 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local39 == local29 && local24 + 1 == local44) {
					return true;
				}
				if (local29 - 1 == local39 && local44 == local24 && (this.anIntArrayArray69[local39][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 + 1 == local39 && local44 == local24 && (this.anIntArrayArray69[local39][local44] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local29 + 1 == local39 && local44 == local24) {
					return true;
				}
				if (local39 == local29 && local24 + 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local39 && local24 - 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local39 == local29 && local44 == local24 - 1) {
					return true;
				}
				if (local39 == local29 - 1 && local24 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local29 + 1 && local24 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				if (local39 == local29 - 1 && local24 == local44) {
					return true;
				}
				if (local39 == local29 && local44 == local24 + 1) {
					return true;
				}
				if (local39 == local29 + 1 && local24 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local39 && local44 == local24 - 1 && (this.anIntArrayArray69[local39][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local39 == local29 - 1 && local44 == local24 && (this.anIntArrayArray69[local39][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local39 && local44 == local24 + 1) {
					return true;
				}
				if (local29 + 1 == local39 && local24 == local44) {
					return true;
				}
				if (local39 == local29 && local44 == local24 - 1 && (this.anIntArrayArray69[local39][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local39 == local29 - 1 && local24 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local39 && local24 + 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 + 1 == local39 && local24 == local44) {
					return true;
				}
				if (local29 == local39 && local24 - 1 == local44) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local39 == local29 - 1 && local24 == local44) {
					return true;
				}
				if (local29 == local39 && local24 + 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 + 1 == local39 && local44 == local24 && (this.anIntArrayArray69[local39][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local39 && local44 == local24 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local39 == local29 && local24 + 1 == local44 && (this.anIntArrayArray69[local39][local44] & 0x20) == 0) {
				return true;
			}
			if (local39 == local29 && local44 == local24 - 1 && (this.anIntArrayArray69[local39][local44] & 0x2) == 0) {
				return true;
			}
			if (local29 - 1 == local39 && local44 == local24 && (this.anIntArrayArray69[local39][local44] & 0x8) == 0) {
				return true;
			}
			if (local39 == local29 + 1 && local44 == local24 && (this.anIntArrayArray69[local39][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
	public void method1733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt2757;
		@Pc(19) int local19 = arg0 - this.anInt2752;
		this.anIntArrayArray69[local19][local14] &= 0xDFFFFF;
	}
}

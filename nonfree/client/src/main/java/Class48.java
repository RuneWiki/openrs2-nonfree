import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class48 {

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	private final int anInt1962 = 0;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private final int anInt1959;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	private final int anInt1963;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	private final int anInt1950;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1959 = arg1;
		this.anInt1963 = 0;
		this.anInt1950 = arg0;
		this.anIntArrayArray21 = new int[this.anInt1950][this.anInt1959];
		this.method1589();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIIZI)V")
	public void method1587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt1962;
		@Pc(23) int local23 = arg2 - this.anInt1963;
		@Pc(25) int local25 = 256;
		@Pc(33) int local33;
		if (arg0 == 1 || arg0 == 3) {
			local33 = arg1;
			arg1 = arg3;
			arg3 = local33;
		}
		if (arg4) {
			local25 = 131328;
		}
		for (local33 = local6; local33 < local6 + arg1; local33++) {
			if (local33 >= 0 && this.anInt1950 > local33) {
				for (@Pc(59) int local59 = local23; local59 < local23 + arg3; local59++) {
					if (local59 >= 0 && this.anInt1959 > local59) {
						this.method1599(local25, local59, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg0 && arg4 == arg1) {
			return true;
		}
		@Pc(16) int local16 = arg0 - this.anInt1962;
		@Pc(21) int local21 = arg4 - this.anInt1963;
		@Pc(26) int local26 = arg1 - this.anInt1963;
		@Pc(45) int local45 = arg3 - this.anInt1962;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local45 + 1 == local16 && local21 == local26 && (this.anIntArrayArray21[local16][local21] & 0x80) == 0) {
					return true;
				}
				if (local16 == local45 && local21 == local26 - 1 && (this.anIntArrayArray21[local16][local21] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local45 - 1 == local16 && local21 == local26 && (this.anIntArrayArray21[local16][local21] & 0x8) == 0) {
					return true;
				}
				if (local45 == local16 && local26 - 1 == local21 && (this.anIntArrayArray21[local16][local21] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local16 == local45 - 1 && local26 == local21 && (this.anIntArrayArray21[local16][local21] & 0x8) == 0) {
					return true;
				}
				if (local45 == local16 && local26 + 1 == local21 && (this.anIntArrayArray21[local16][local21] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local16 == local45 + 1 && local21 == local26 && (this.anIntArrayArray21[local16][local21] & 0x80) == 0) {
					return true;
				}
				if (local45 == local16 && local21 == local26 + 1 && (this.anIntArrayArray21[local16][local21] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local16 == local45 && local21 == local26 + 1 && (this.anIntArrayArray21[local16][local21] & 0x20) == 0) {
				return true;
			}
			if (local16 == local45 && local21 == local26 - 1 && (this.anIntArrayArray21[local16][local21] & 0x2) == 0) {
				return true;
			}
			if (local16 == local45 - 1 && local21 == local26 && (this.anIntArrayArray21[local16][local21] & 0x8) == 0) {
				return true;
			}
			if (local45 + 1 == local16 && local21 == local26 && (this.anIntArrayArray21[local16][local21] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public void method1589() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1950; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1959; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt1950 - 5 || local7 >= this.anInt1959 - 5) {
					this.anIntArrayArray21[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray21[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZZII)V")
	public void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - this.anInt1963;
		@Pc(12) int local12 = 256;
		if (arg2) {
			local12 = 131328;
		}
		@Pc(23) int local23 = arg0 - this.anInt1962;
		for (@Pc(25) int local25 = local23; local25 < local23 + arg1; local25++) {
			if (local25 >= 0 && this.anInt1950 > local25) {
				for (@Pc(44) int local44 = local10; local44 < local10 + arg4; local44++) {
					if (local44 >= 0 && this.anInt1959 > local44) {
						this.method1593(local25, local12, local44);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
	private void method1593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray21[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIII)V")
	public void method1594(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt1963;
		@Pc(13) int local13 = arg0 - this.anInt1962;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1593(local13, 128, local8);
				this.method1593(local13 - 1, 8, local8);
			}
			if (arg2 == 1) {
				this.method1593(local13, 2, local8);
				this.method1593(local13, 32, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1593(local13, 8, local8);
				this.method1593(local13 + 1, 128, local8);
			}
			if (arg2 == 3) {
				this.method1593(local13, 32, local8);
				this.method1593(local13, 2, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1593(local13, 1, local8);
				this.method1593(local13 - 1, 16, local8 + 1);
			}
			if (arg2 == 1) {
				this.method1593(local13, 4, local8);
				this.method1593(local13 + 1, 64, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1593(local13, 16, local8);
				this.method1593(local13 + 1, 1, local8 - 1);
			}
			if (arg2 == 3) {
				this.method1593(local13, 64, local8);
				this.method1593(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method1593(local13, 130, local8);
				this.method1593(local13 - 1, 8, local8);
				this.method1593(local13, 32, local8 + 1);
			}
			if (arg2 == 1) {
				this.method1593(local13, 10, local8);
				this.method1593(local13, 32, local8 + 1);
				this.method1593(local13 + 1, 128, local8);
			}
			if (arg2 == 2) {
				this.method1593(local13, 40, local8);
				this.method1593(local13 + 1, 128, local8);
				this.method1593(local13, 2, local8 - 1);
			}
			if (arg2 == 3) {
				this.method1593(local13, 160, local8);
				this.method1593(local13, 2, local8 - 1);
				this.method1593(local13 - 1, 8, local8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1593(local13, 65536, local8);
				this.method1593(local13 - 1, 4096, local8);
			}
			if (arg2 == 1) {
				this.method1593(local13, 1024, local8);
				this.method1593(local13, 16384, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1593(local13, 4096, local8);
				this.method1593(local13 + 1, 65536, local8);
			}
			if (arg2 == 3) {
				this.method1593(local13, 16384, local8);
				this.method1593(local13, 1024, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1593(local13, 512, local8);
				this.method1593(local13 - 1, 8192, local8 + 1);
			}
			if (arg2 == 1) {
				this.method1593(local13, 2048, local8);
				this.method1593(local13 + 1, 32768, local8 + 1);
			}
			if (arg2 == 2) {
				this.method1593(local13, 8192, local8);
				this.method1593(local13 + 1, 512, local8 - 1);
			}
			if (arg2 == 3) {
				this.method1593(local13, 32768, local8);
				this.method1593(local13 - 1, 2048, local8 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1593(local13, 66560, local8);
			this.method1593(local13 - 1, 4096, local8);
			this.method1593(local13, 16384, local8 + 1);
		}
		if (arg2 == 1) {
			this.method1593(local13, 5120, local8);
			this.method1593(local13, 16384, local8 + 1);
			this.method1593(local13 + 1, 65536, local8);
		}
		if (arg2 == 2) {
			this.method1593(local13, 20480, local8);
			this.method1593(local13 + 1, 65536, local8);
			this.method1593(local13, 1024, local8 - 1);
		}
		if (arg2 == 3) {
			this.method1593(local13, 81920, local8);
			this.method1593(local13, 1024, local8 - 1);
			this.method1593(local13 - 1, 4096, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V")
	public void method1595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1963;
		@Pc(13) int local13 = arg1 - this.anInt1962;
		this.anIntArrayArray21[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	public void method1596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1963;
		@Pc(9) int local9 = arg0 - this.anInt1962;
		this.anIntArrayArray21[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIII)V")
	public void method1597(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1962;
		@Pc(9) int local9 = arg1 - this.anInt1963;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1599(128, local9, local4);
				this.method1599(8, local9, local4 - 1);
			}
			if (arg3 == 1) {
				this.method1599(2, local9, local4);
				this.method1599(32, local9 + 1, local4);
			}
			if (arg3 == 2) {
				this.method1599(8, local9, local4);
				this.method1599(128, local9, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1599(32, local9, local4);
				this.method1599(2, local9 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1599(1, local9, local4);
				this.method1599(16, local9 + 1, local4 + -1);
			}
			if (arg3 == 1) {
				this.method1599(4, local9, local4);
				this.method1599(64, local9 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1599(16, local9, local4);
				this.method1599(1, local9 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1599(64, local9, local4);
				this.method1599(4, local9 - 1, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method1599(130, local9, local4);
				this.method1599(8, local9, local4 - 1);
				this.method1599(32, local9 + 1, local4);
			}
			if (arg3 == 1) {
				this.method1599(10, local9, local4);
				this.method1599(32, local9 + 1, local4);
				this.method1599(128, local9, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1599(40, local9, local4);
				this.method1599(128, local9, local4 + 1);
				this.method1599(2, local9 - 1, local4);
			}
			if (arg3 == 3) {
				this.method1599(160, local9, local4);
				this.method1599(2, local9 - 1, local4);
				this.method1599(8, local9, local4 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1599(65536, local9, local4);
				this.method1599(4096, local9, local4 - 1);
			}
			if (arg3 == 1) {
				this.method1599(1024, local9, local4);
				this.method1599(16384, local9 + 1, local4);
			}
			if (arg3 == 2) {
				this.method1599(4096, local9, local4);
				this.method1599(65536, local9, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1599(16384, local9, local4);
				this.method1599(1024, local9 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1599(512, local9, local4);
				this.method1599(8192, local9 + 1, local4 + -1);
			}
			if (arg3 == 1) {
				this.method1599(2048, local9, local4);
				this.method1599(32768, local9 + 1, local4 - -1);
			}
			if (arg3 == 2) {
				this.method1599(8192, local9, local4);
				this.method1599(512, local9 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method1599(32768, local9, local4);
				this.method1599(2048, local9 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1599(66560, local9, local4);
			this.method1599(4096, local9, local4 - 1);
			this.method1599(16384, local9 + 1, local4);
		}
		if (arg3 == 1) {
			this.method1599(5120, local9, local4);
			this.method1599(16384, local9 + 1, local4);
			this.method1599(65536, local9, local4 + 1);
		}
		if (arg3 == 2) {
			this.method1599(20480, local9, local4);
			this.method1599(65536, local9, local4 + 1);
			this.method1599(1024, local9 - 1, local4);
		}
		if (arg3 == 3) {
			this.method1599(81920, local9, local4);
			this.method1599(1024, local9 - 1, local4);
			this.method1599(4096, local9, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IIII)V")
	private void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray21[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg0 + arg1 - 1;
		@Pc(15) int local15 = arg4 + arg5 - 1;
		if (arg1 <= arg6 && arg6 <= local5 && arg2 >= arg5 && arg2 <= local15) {
			return true;
		} else if (arg6 == arg1 - 1 && arg2 >= arg5 && arg2 <= local15 && (this.anIntArrayArray21[arg6 - this.anInt1962][arg2 - this.anInt1963] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local5 + 1 == arg6 && arg2 >= arg5 && local15 >= arg2 && (this.anIntArrayArray21[arg6 - this.anInt1962][arg2 - this.anInt1963] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg2 && arg6 >= arg1 && arg6 <= local5 && (this.anIntArrayArray21[arg6 - this.anInt1962][arg2 - this.anInt1963] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local15 + 1 && arg1 <= arg6 && arg6 <= local5 && (this.anIntArrayArray21[arg6 - this.anInt1962][arg2 - this.anInt1963] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(IIB)V")
	public void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 - this.anInt1962;
		@Pc(27) int local27 = arg0 - this.anInt1963;
		this.anIntArrayArray21[local18][local27] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg0 && arg1 == arg4) {
			return true;
		}
		@Pc(16) int local16 = arg3 - this.anInt1962;
		@Pc(21) int local21 = arg0 - this.anInt1962;
		@Pc(26) int local26 = arg4 - this.anInt1963;
		@Pc(31) int local31 = arg1 - this.anInt1963;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (local21 == local16 - 1 && local31 == local26) {
					return true;
				}
				if (local21 == local16 && local31 + 1 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 == local21 && local26 == local31 - 1 && (this.anIntArrayArray21[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local21 == local16 && local31 + 1 == local26) {
					return true;
				}
				if (local16 - 1 == local21 && local26 == local31 && (this.anIntArrayArray21[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local21 == local16 + 1 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local21 == local16 + 1 && local31 == local26) {
					return true;
				}
				if (local16 == local21 && local26 == local31 + 1 && (this.anIntArrayArray21[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local21 == local16 && local26 == local31 - 1 && (this.anIntArrayArray21[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local21 == local16 && local26 == local31 - 1) {
					return true;
				}
				if (local21 == local16 - 1 && local26 == local31 && (this.anIntArrayArray21[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local16 + 1 == local21 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				if (local16 - 1 == local21 && local26 == local31) {
					return true;
				}
				if (local21 == local16 && local31 + 1 == local26) {
					return true;
				}
				if (local21 == local16 + 1 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local21 && local31 - 1 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local21 == local16 - 1 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local16 == local21 && local31 + 1 == local26) {
					return true;
				}
				if (local16 + 1 == local21 && local31 == local26) {
					return true;
				}
				if (local21 == local16 && local31 - 1 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local16 - 1 == local21 && local26 == local31 && (this.anIntArrayArray21[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local21 == local16 && local31 + 1 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local21 == local16 + 1 && local26 == local31) {
					return true;
				}
				if (local16 == local21 && local26 == local31 - 1) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local21 == local16 - 1 && local26 == local31) {
					return true;
				}
				if (local21 == local16 && local26 == local31 + 1 && (this.anIntArrayArray21[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 + 1 == local21 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local21 && local31 - 1 == local26) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local16 == local21 && local26 == local31 + 1 && (this.anIntArrayArray21[local21][local26] & 0x20) == 0) {
				return true;
			}
			if (local21 == local16 && local26 == local31 - 1 && (this.anIntArrayArray21[local21][local26] & 0x2) == 0) {
				return true;
			}
			if (local21 == local16 - 1 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x8) == 0) {
				return true;
			}
			if (local21 == local16 + 1 && local31 == local26 && (this.anIntArrayArray21[local21][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

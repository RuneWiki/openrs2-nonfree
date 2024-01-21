import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class33 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	private final int anInt1391 = 0;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
	private final int anInt1388 = 0;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
	private final int anInt1389;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
	private final int anInt1399;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1389 = arg0;
		this.anInt1399 = arg1;
		this.anIntArrayArray14 = new int[this.anInt1389][this.anInt1399];
		this.method955();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg0 && arg1 == arg2) {
			return true;
		}
		@Pc(16) int local16 = arg2 - this.anInt1388;
		@Pc(21) int local21 = arg1 - this.anInt1388;
		@Pc(34) int local34 = arg0 - this.anInt1391;
		@Pc(39) int local39 = arg5 - this.anInt1391;
		if (arg3 == 0) {
			if (arg4 == 0) {
				if (local39 == local34 - 1 && local16 == local21) {
					return true;
				}
				if (local34 == local39 && local21 == local16 + 1 && (this.anIntArrayArray14[local39][local21] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local39 && local21 == local16 - 1 && (this.anIntArrayArray14[local39][local21] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local34 == local39 && local21 == local16 + 1) {
					return true;
				}
				if (local34 - 1 == local39 && local21 == local16 && (this.anIntArrayArray14[local39][local21] & 0x1280108) == 0) {
					return true;
				}
				if (local34 + 1 == local39 && local21 == local16 && (this.anIntArrayArray14[local39][local21] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local39 == local34 + 1 && local21 == local16) {
					return true;
				}
				if (local39 == local34 && local16 + 1 == local21 && (this.anIntArrayArray14[local39][local21] & 0x1280120) == 0) {
					return true;
				}
				if (local39 == local34 && local21 == local16 - 1 && (this.anIntArrayArray14[local39][local21] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local34 == local39 && local21 == local16 - 1) {
					return true;
				}
				if (local34 - 1 == local39 && local16 == local21 && (this.anIntArrayArray14[local39][local21] & 0x1280108) == 0) {
					return true;
				}
				if (local34 + 1 == local39 && local21 == local16 && (this.anIntArrayArray14[local39][local21] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				if (local39 == local34 - 1 && local21 == local16) {
					return true;
				}
				if (local39 == local34 && local16 + 1 == local21) {
					return true;
				}
				if (local39 == local34 + 1 && local16 == local21 && (this.anIntArrayArray14[local39][local21] & 0x1280180) == 0) {
					return true;
				}
				if (local34 == local39 && local21 == local16 - 1 && (this.anIntArrayArray14[local39][local21] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local39 == local34 - 1 && local16 == local21 && (this.anIntArrayArray14[local39][local21] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local39 && local16 + 1 == local21) {
					return true;
				}
				if (local34 + 1 == local39 && local21 == local16) {
					return true;
				}
				if (local39 == local34 && local21 == local16 - 1 && (this.anIntArrayArray14[local39][local21] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local39 == local34 - 1 && local16 == local21 && (this.anIntArrayArray14[local39][local21] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local34 && local16 + 1 == local21 && (this.anIntArrayArray14[local39][local21] & 0x1280120) == 0) {
					return true;
				}
				if (local39 == local34 + 1 && local16 == local21) {
					return true;
				}
				if (local34 == local39 && local16 - 1 == local21) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local34 - 1 == local39 && local16 == local21) {
					return true;
				}
				if (local34 == local39 && local21 == local16 + 1 && (this.anIntArrayArray14[local39][local21] & 0x1280120) == 0) {
					return true;
				}
				if (local34 + 1 == local39 && local21 == local16 && (this.anIntArrayArray14[local39][local21] & 0x1280180) == 0) {
					return true;
				}
				if (local34 == local39 && local16 - 1 == local21) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local39 == local34 && local21 == local16 + 1 && (this.anIntArrayArray14[local39][local21] & 0x20) == 0) {
				return true;
			}
			if (local39 == local34 && local21 == local16 - 1 && (this.anIntArrayArray14[local39][local21] & 0x2) == 0) {
				return true;
			}
			if (local34 - 1 == local39 && local16 == local21 && (this.anIntArrayArray14[local39][local21] & 0x8) == 0) {
				return true;
			}
			if (local39 == local34 + 1 && local21 == local16 && (this.anIntArrayArray14[local39][local21] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIZIII)V")
	public void method941(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt1388;
		@Pc(18) int local18 = arg4 - this.anInt1391;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method948(local4, local18, 128);
				this.method948(local4, local18 - 1, 8);
			}
			if (arg3 == 1) {
				this.method948(local4, local18, 2);
				this.method948(local4 + 1, local18, 32);
			}
			if (arg3 == 2) {
				this.method948(local4, local18, 8);
				this.method948(local4, local18 + 1, 128);
			}
			if (arg3 == 3) {
				this.method948(local4, local18, 32);
				this.method948(local4 - 1, local18, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method948(local4, local18, 1);
				this.method948(local4 + 1, local18 + -1, 16);
			}
			if (arg3 == 1) {
				this.method948(local4, local18, 4);
				this.method948(local4 + 1, local18 - -1, 64);
			}
			if (arg3 == 2) {
				this.method948(local4, local18, 16);
				this.method948(local4 - 1, local18 + 1, 1);
			}
			if (arg3 == 3) {
				this.method948(local4, local18, 64);
				this.method948(local4 - 1, local18 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method948(local4, local18, 130);
				this.method948(local4, local18 - 1, 8);
				this.method948(local4 + 1, local18, 32);
			}
			if (arg3 == 1) {
				this.method948(local4, local18, 10);
				this.method948(local4 + 1, local18, 32);
				this.method948(local4, local18 + 1, 128);
			}
			if (arg3 == 2) {
				this.method948(local4, local18, 40);
				this.method948(local4, local18 + 1, 128);
				this.method948(local4 - 1, local18, 2);
			}
			if (arg3 == 3) {
				this.method948(local4, local18, 160);
				this.method948(local4 - 1, local18, 2);
				this.method948(local4, local18 - 1, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method948(local4, local18, 65536);
				this.method948(local4, local18 - 1, 4096);
			}
			if (arg3 == 1) {
				this.method948(local4, local18, 1024);
				this.method948(local4 + 1, local18, 16384);
			}
			if (arg3 == 2) {
				this.method948(local4, local18, 4096);
				this.method948(local4, local18 + 1, 65536);
			}
			if (arg3 == 3) {
				this.method948(local4, local18, 16384);
				this.method948(local4 - 1, local18, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method948(local4, local18, 512);
				this.method948(local4 + 1, local18 + -1, 8192);
			}
			if (arg3 == 1) {
				this.method948(local4, local18, 2048);
				this.method948(local4 + 1, local18 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method948(local4, local18, 8192);
				this.method948(local4 - 1, local18 + 1, 512);
			}
			if (arg3 == 3) {
				this.method948(local4, local18, 32768);
				this.method948(local4 - 1, local18 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method948(local4, local18, 66560);
			this.method948(local4, local18 - 1, 4096);
			this.method948(local4 + 1, local18, 16384);
		}
		if (arg3 == 1) {
			this.method948(local4, local18, 5120);
			this.method948(local4 + 1, local18, 16384);
			this.method948(local4, local18 + 1, 65536);
		}
		if (arg3 == 2) {
			this.method948(local4, local18, 20480);
			this.method948(local4, local18 + 1, 65536);
			this.method948(local4 - 1, local18, 1024);
		}
		if (arg3 == 3) {
			this.method948(local4, local18, 81920);
			this.method948(local4 - 1, local18, 1024);
			this.method948(local4, local18 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	private void method942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray14[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)V")
	public void method945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 - this.anInt1391;
		@Pc(15) int local15 = arg1 - this.anInt1388;
		this.anIntArrayArray14[local10][local15] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZZI)V")
	public void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt1391;
		@Pc(24) int local24 = arg2 - this.anInt1388;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method942(local8, local24, 128);
				this.method942(local8 - 1, local24, 8);
			}
			if (arg1 == 1) {
				this.method942(local8, local24, 2);
				this.method942(local8, local24 + 1, 32);
			}
			if (arg1 == 2) {
				this.method942(local8, local24, 8);
				this.method942(local8 + 1, local24, 128);
			}
			if (arg1 == 3) {
				this.method942(local8, local24, 32);
				this.method942(local8, local24 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method942(local8, local24, 1);
				this.method942(local8 - 1, local24 + 1, 16);
			}
			if (arg1 == 1) {
				this.method942(local8, local24, 4);
				this.method942(local8 + 1, local24 + 1, 64);
			}
			if (arg1 == 2) {
				this.method942(local8, local24, 16);
				this.method942(local8 + 1, local24 - 1, 1);
			}
			if (arg1 == 3) {
				this.method942(local8, local24, 64);
				this.method942(local8 - 1, local24 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method942(local8, local24, 130);
				this.method942(local8 - 1, local24, 8);
				this.method942(local8, local24 + 1, 32);
			}
			if (arg1 == 1) {
				this.method942(local8, local24, 10);
				this.method942(local8, local24 + 1, 32);
				this.method942(local8 + 1, local24, 128);
			}
			if (arg1 == 2) {
				this.method942(local8, local24, 40);
				this.method942(local8 + 1, local24, 128);
				this.method942(local8, local24 - 1, 2);
			}
			if (arg1 == 3) {
				this.method942(local8, local24, 160);
				this.method942(local8, local24 - 1, 2);
				this.method942(local8 - 1, local24, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method942(local8, local24, 65536);
				this.method942(local8 - 1, local24, 4096);
			}
			if (arg1 == 1) {
				this.method942(local8, local24, 1024);
				this.method942(local8, local24 + 1, 16384);
			}
			if (arg1 == 2) {
				this.method942(local8, local24, 4096);
				this.method942(local8 + 1, local24, 65536);
			}
			if (arg1 == 3) {
				this.method942(local8, local24, 16384);
				this.method942(local8, local24 - 1, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method942(local8, local24, 512);
				this.method942(local8 - 1, local24 + 1, 8192);
			}
			if (arg1 == 1) {
				this.method942(local8, local24, 2048);
				this.method942(local8 + 1, local24 - -1, 32768);
			}
			if (arg1 == 2) {
				this.method942(local8, local24, 8192);
				this.method942(local8 + 1, local24 - 1, 512);
			}
			if (arg1 == 3) {
				this.method942(local8, local24, 32768);
				this.method942(local8 - 1, local24 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method942(local8, local24, 66560);
			this.method942(local8 - 1, local24, 4096);
			this.method942(local8, local24 + 1, 16384);
		}
		if (arg1 == 1) {
			this.method942(local8, local24, 5120);
			this.method942(local8, local24 + 1, 16384);
			this.method942(local8 + 1, local24, 65536);
		}
		if (arg1 == 2) {
			this.method942(local8, local24, 20480);
			this.method942(local8 + 1, local24, 65536);
			this.method942(local8, local24 - 1, 1024);
		}
		if (arg1 == 3) {
			this.method942(local8, local24, 81920);
			this.method942(local8, local24 - 1, 1024);
			this.method942(local8 - 1, local24, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZBII)V")
	public void method947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt1388;
		@Pc(11) int local11 = arg2 - this.anInt1391;
		@Pc(23) int local23;
		if (arg4 == 1 || arg4 == 3) {
			local23 = arg5;
			arg5 = arg1;
			arg1 = local23;
		}
		@Pc(29) int local29 = 256;
		if (arg3) {
			local29 = 131328;
		}
		for (local23 = local11; local23 < local11 + arg5; local23++) {
			if (local23 >= 0 && this.anInt1389 > local23) {
				for (@Pc(47) int local47 = local6; local47 < arg1 + local6; local47++) {
					if (local47 >= 0 && local47 < this.anInt1399) {
						this.method948(local47, local23, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V")
	private void method948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg1][arg0] &= 16777215 - arg2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public void method950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1391;
		@Pc(9) int local9 = arg1 - this.anInt1388;
		this.anIntArrayArray14[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg3 && arg5 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt1388;
		@Pc(30) int local30 = arg1 - this.anInt1391;
		@Pc(35) int local35 = arg3 - this.anInt1391;
		@Pc(40) int local40 = arg4 - this.anInt1388;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local35 == local30 + 1 && local20 == local40 && (this.anIntArrayArray14[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local30 == local35 && local40 - 1 == local20 && (this.anIntArrayArray14[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local35 == local30 - 1 && local20 == local40 && (this.anIntArrayArray14[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local30 == local35 && local20 == local40 - 1 && (this.anIntArrayArray14[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local35 == local30 - 1 && local20 == local40 && (this.anIntArrayArray14[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local30 == local35 && local40 + 1 == local20 && (this.anIntArrayArray14[local35][local20] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local30 + 1 == local35 && local40 == local20 && (this.anIntArrayArray14[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local35 == local30 && local40 + 1 == local20 && (this.anIntArrayArray14[local35][local20] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local35 == local30 && local20 == local40 + 1 && (this.anIntArrayArray14[local35][local20] & 0x20) == 0) {
				return true;
			}
			if (local30 == local35 && local40 - 1 == local20 && (this.anIntArrayArray14[local35][local20] & 0x2) == 0) {
				return true;
			}
			if (local30 - 1 == local35 && local40 == local20 && (this.anIntArrayArray14[local35][local20] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local35 && local20 == local40 && (this.anIntArrayArray14[local35][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZIIIII)V")
	public void method952(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - this.anInt1388;
		@Pc(20) int local20;
		if (arg3 == 1 || arg3 == 3) {
			local20 = arg2;
			arg2 = arg5;
			arg5 = local20;
		}
		@Pc(29) int local29 = arg1 - this.anInt1391;
		@Pc(31) int local31 = 256;
		if (arg0) {
			local31 = 131328;
		}
		for (local20 = local29; local20 < arg2 + local29; local20++) {
			if (local20 >= 0 && this.anInt1389 > local20) {
				for (@Pc(56) int local56 = local10; local56 < arg5 + local10; local56++) {
					if (local56 >= 0 && local56 < this.anInt1399) {
						this.method942(local20, local56, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3 + arg1 - 1;
		@Pc(16) int local16 = arg0 + arg6 - 1;
		if (arg1 <= arg5 && arg5 <= local9 && arg0 <= arg4 && local16 >= arg4) {
			return true;
		} else if (arg1 - 1 == arg5 && arg4 >= arg0 && arg4 <= local16 && (this.anIntArrayArray14[arg5 - this.anInt1391][arg4 - this.anInt1388] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg5 && arg0 <= arg4 && local16 >= arg4 && (this.anIntArrayArray14[arg5 - this.anInt1391][arg4 - this.anInt1388] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg0 - 1 && arg5 >= arg1 && local9 >= arg5 && (this.anIntArrayArray14[arg5 - this.anInt1391][arg4 - this.anInt1388] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local16 + 1 == arg4 && arg5 >= arg1 && local9 >= arg5 && (this.anIntArrayArray14[arg5 - this.anInt1391][arg4 - this.anInt1388] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public void method955() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1389; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1399; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt1389 - 1 == local11 || local15 == this.anInt1399 - 1) {
					this.anIntArrayArray14[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray14[local11][local15] = 16777216;
				}
			}
		}
	}
}

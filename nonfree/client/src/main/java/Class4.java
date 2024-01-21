import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	private final int anInt129;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private final int anInt120;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	private final int anInt132;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private final int anInt113;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt129 = arg0;
		this.anInt120 = arg1;
		this.anInt132 = 0;
		this.anIntArrayArray1 = new int[this.anInt129][this.anInt120];
		this.anInt113 = 0;
		this.method80();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method60(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg2 && arg0 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg2 - this.anInt132;
		@Pc(21) int local21 = arg5 - this.anInt132;
		@Pc(26) int local26 = arg0 - this.anInt113;
		@Pc(39) int local39 = arg3 - this.anInt113;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local16 + 1 == local21 && local26 == local39 && (this.anIntArrayArray1[local21][local39] & 0x80) == 0) {
					return true;
				}
				if (local16 == local21 && local26 - 1 == local39 && (this.anIntArrayArray1[local21][local39] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local16 - 1 == local21 && local26 == local39 && (this.anIntArrayArray1[local21][local39] & 0x8) == 0) {
					return true;
				}
				if (local16 == local21 && local39 == local26 - 1 && (this.anIntArrayArray1[local21][local39] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local21 == local16 - 1 && local39 == local26 && (this.anIntArrayArray1[local21][local39] & 0x8) == 0) {
					return true;
				}
				if (local21 == local16 && local26 + 1 == local39 && (this.anIntArrayArray1[local21][local39] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local16 + 1 == local21 && local26 == local39 && (this.anIntArrayArray1[local21][local39] & 0x80) == 0) {
					return true;
				}
				if (local16 == local21 && local39 == local26 + 1 && (this.anIntArrayArray1[local21][local39] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (local21 == local16 && local39 == local26 + 1 && (this.anIntArrayArray1[local21][local39] & 0x20) == 0) {
				return true;
			}
			if (local16 == local21 && local39 == local26 - 1 && (this.anIntArrayArray1[local21][local39] & 0x2) == 0) {
				return true;
			}
			if (local21 == local16 - 1 && local26 == local39 && (this.anIntArrayArray1[local21][local39] & 0x8) == 0) {
				return true;
			}
			if (local16 + 1 == local21 && local26 == local39 && (this.anIntArrayArray1[local21][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg4 - 1;
		@Pc(15) int local15 = arg5 + arg0 - 1;
		if (arg4 <= arg3 && arg3 <= local9 && arg1 >= arg5 && arg1 <= local15) {
			return true;
		} else if (arg3 == arg4 - 1 && arg1 >= arg5 && local15 >= arg1 && (this.anIntArrayArray1[arg3 - this.anInt132][arg1 - this.anInt113] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == local9 + 1 && arg1 >= arg5 && local15 >= arg1 && (this.anIntArrayArray1[arg3 - this.anInt132][arg1 - this.anInt113] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg5 - 1 && arg3 >= arg4 && arg3 <= local9 && (this.anIntArrayArray1[arg3 - this.anInt132][arg1 - this.anInt113] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local15 + 1 == arg1 && arg4 <= arg3 && local9 >= arg3 && (this.anIntArrayArray1[arg3 - this.anInt132][arg1 - this.anInt113] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIIIII)V")
	public void method64(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg4 - this.anInt113;
		@Pc(17) int local17 = arg3 - this.anInt132;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method69(local17, local12, 128);
				this.method69(local17 - 1, local12, 8);
			}
			if (arg2 == 1) {
				this.method69(local17, local12, 2);
				this.method69(local17, local12 + 1, 32);
			}
			if (arg2 == 2) {
				this.method69(local17, local12, 8);
				this.method69(local17 + 1, local12, 128);
			}
			if (arg2 == 3) {
				this.method69(local17, local12, 32);
				this.method69(local17, local12 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method69(local17, local12, 1);
				this.method69(local17 - 1, local12 + 1, 16);
			}
			if (arg2 == 1) {
				this.method69(local17, local12, 4);
				this.method69(local17 + 1, local12 + 1, 64);
			}
			if (arg2 == 2) {
				this.method69(local17, local12, 16);
				this.method69(local17 + 1, local12 + -1, 1);
			}
			if (arg2 == 3) {
				this.method69(local17, local12, 64);
				this.method69(local17 - 1, local12 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method69(local17, local12, 130);
				this.method69(local17 - 1, local12, 8);
				this.method69(local17, local12 + 1, 32);
			}
			if (arg2 == 1) {
				this.method69(local17, local12, 10);
				this.method69(local17, local12 + 1, 32);
				this.method69(local17 + 1, local12, 128);
			}
			if (arg2 == 2) {
				this.method69(local17, local12, 40);
				this.method69(local17 + 1, local12, 128);
				this.method69(local17, local12 - 1, 2);
			}
			if (arg2 == 3) {
				this.method69(local17, local12, 160);
				this.method69(local17, local12 - 1, 2);
				this.method69(local17 - 1, local12, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method69(local17, local12, 65536);
				this.method69(local17 - 1, local12, 4096);
			}
			if (arg2 == 1) {
				this.method69(local17, local12, 1024);
				this.method69(local17, local12 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method69(local17, local12, 4096);
				this.method69(local17 + 1, local12, 65536);
			}
			if (arg2 == 3) {
				this.method69(local17, local12, 16384);
				this.method69(local17, local12 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method69(local17, local12, 512);
				this.method69(local17 - 1, local12 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method69(local17, local12, 2048);
				this.method69(local17 + 1, local12 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method69(local17, local12, 8192);
				this.method69(local17 + 1, local12 - 1, 512);
			}
			if (arg2 == 3) {
				this.method69(local17, local12, 32768);
				this.method69(local17 - 1, local12 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method69(local17, local12, 66560);
			this.method69(local17 - 1, local12, 4096);
			this.method69(local17, local12 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method69(local17, local12, 5120);
			this.method69(local17, local12 + 1, 16384);
			this.method69(local17 + 1, local12, 65536);
		}
		if (arg2 == 2) {
			this.method69(local17, local12, 20480);
			this.method69(local17 + 1, local12, 65536);
			this.method69(local17, local12 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method69(local17, local12, 81920);
			this.method69(local17, local12 - 1, 1024);
			this.method69(local17 - 1, local12, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	public void method67(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt132;
		@Pc(17) int local17 = arg0 - this.anInt113;
		this.anIntArrayArray1[local12][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
	private void method69(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZII)V")
	public void method71(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt132;
		@Pc(13) int local13 = arg1 - this.anInt113;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method79(local4, local13, 128);
				this.method79(local4 - 1, local13, 8);
			}
			if (arg3 == 1) {
				this.method79(local4, local13, 2);
				this.method79(local4, local13 + 1, 32);
			}
			if (arg3 == 2) {
				this.method79(local4, local13, 8);
				this.method79(local4 + 1, local13, 128);
			}
			if (arg3 == 3) {
				this.method79(local4, local13, 32);
				this.method79(local4, local13 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method79(local4, local13, 1);
				this.method79(local4 - 1, local13 + 1, 16);
			}
			if (arg3 == 1) {
				this.method79(local4, local13, 4);
				this.method79(local4 + 1, local13 + 1, 64);
			}
			if (arg3 == 2) {
				this.method79(local4, local13, 16);
				this.method79(local4 + 1, local13 + -1, 1);
			}
			if (arg3 == 3) {
				this.method79(local4, local13, 64);
				this.method79(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method79(local4, local13, 130);
				this.method79(local4 - 1, local13, 8);
				this.method79(local4, local13 + 1, 32);
			}
			if (arg3 == 1) {
				this.method79(local4, local13, 10);
				this.method79(local4, local13 + 1, 32);
				this.method79(local4 + 1, local13, 128);
			}
			if (arg3 == 2) {
				this.method79(local4, local13, 40);
				this.method79(local4 + 1, local13, 128);
				this.method79(local4, local13 - 1, 2);
			}
			if (arg3 == 3) {
				this.method79(local4, local13, 160);
				this.method79(local4, local13 - 1, 2);
				this.method79(local4 - 1, local13, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method79(local4, local13, 65536);
				this.method79(local4 - 1, local13, 4096);
			}
			if (arg3 == 1) {
				this.method79(local4, local13, 1024);
				this.method79(local4, local13 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method79(local4, local13, 4096);
				this.method79(local4 + 1, local13, 65536);
			}
			if (arg3 == 3) {
				this.method79(local4, local13, 16384);
				this.method79(local4, local13 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method79(local4, local13, 512);
				this.method79(local4 - 1, local13 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method79(local4, local13, 2048);
				this.method79(local4 + 1, local13 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method79(local4, local13, 8192);
				this.method79(local4 + 1, local13 + -1, 512);
			}
			if (arg3 == 3) {
				this.method79(local4, local13, 32768);
				this.method79(local4 - 1, local13 - 1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method79(local4, local13, 66560);
			this.method79(local4 - 1, local13, 4096);
			this.method79(local4, local13 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method79(local4, local13, 5120);
			this.method79(local4, local13 + 1, 16384);
			this.method79(local4 + 1, local13, 65536);
		}
		if (arg3 == 2) {
			this.method79(local4, local13, 20480);
			this.method79(local4 + 1, local13, 65536);
			this.method79(local4, local13 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method79(local4, local13, 81920);
			this.method79(local4, local13 - 1, 1024);
			this.method79(local4 - 1, local13, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZIIII)V")
	public void method72(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt132;
		@Pc(8) int local8 = 256;
		@Pc(20) int local20;
		if (arg3 == 1 || arg3 == 3) {
			local20 = arg4;
			arg4 = arg2;
			arg2 = local20;
		}
		if (arg1) {
			local8 = 131328;
		}
		@Pc(39) int local39 = arg0 - this.anInt113;
		for (local20 = local6; local20 < arg4 + local6; local20++) {
			if (local20 >= 0 && local20 < this.anInt129) {
				for (@Pc(56) int local56 = local39; local56 < local39 + arg2; local56++) {
					if (local56 >= 0 && this.anInt120 > local56) {
						this.method69(local20, local56, local8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt132;
		@Pc(13) int local13 = arg1 - this.anInt113;
		this.anIntArrayArray1[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg3 && arg0 == arg5) {
			return true;
		}
		@Pc(32) int local32 = arg3 - this.anInt132;
		@Pc(37) int local37 = arg5 - this.anInt113;
		@Pc(42) int local42 = arg0 - this.anInt113;
		@Pc(47) int local47 = arg2 - this.anInt132;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (local32 == local47 - 1 && local42 == local37) {
					return true;
				}
				if (local32 == local47 && local37 == local42 + 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0120) == 0) {
					return true;
				}
				if (local32 == local47 && local37 == local42 - 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local47 == local32 && local37 == local42 + 1) {
					return true;
				}
				if (local32 == local47 - 1 && local37 == local42 && (this.anIntArrayArray1[local32][local37] & 0x12C0108) == 0) {
					return true;
				}
				if (local47 + 1 == local32 && local37 == local42 && (this.anIntArrayArray1[local32][local37] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local47 + 1 == local32 && local42 == local37) {
					return true;
				}
				if (local47 == local32 && local37 == local42 + 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0120) == 0) {
					return true;
				}
				if (local32 == local47 && local37 == local42 - 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local47 == local32 && local42 - 1 == local37) {
					return true;
				}
				if (local32 == local47 - 1 && local42 == local37 && (this.anIntArrayArray1[local32][local37] & 0x12C0108) == 0) {
					return true;
				}
				if (local47 + 1 == local32 && local42 == local37 && (this.anIntArrayArray1[local32][local37] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				if (local32 == local47 - 1 && local37 == local42) {
					return true;
				}
				if (local32 == local47 && local42 + 1 == local37) {
					return true;
				}
				if (local32 == local47 + 1 && local37 == local42 && (this.anIntArrayArray1[local32][local37] & 0x12C0180) == 0) {
					return true;
				}
				if (local32 == local47 && local42 - 1 == local37 && (this.anIntArrayArray1[local32][local37] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local47 - 1 == local32 && local42 == local37 && (this.anIntArrayArray1[local32][local37] & 0x12C0108) == 0) {
					return true;
				}
				if (local32 == local47 && local42 + 1 == local37) {
					return true;
				}
				if (local47 + 1 == local32 && local37 == local42) {
					return true;
				}
				if (local47 == local32 && local37 == local42 - 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local47 - 1 == local32 && local42 == local37 && (this.anIntArrayArray1[local32][local37] & 0x12C0108) == 0) {
					return true;
				}
				if (local47 == local32 && local37 == local42 + 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0120) == 0) {
					return true;
				}
				if (local32 == local47 + 1 && local42 == local37) {
					return true;
				}
				if (local47 == local32 && local37 == local42 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local47 - 1 == local32 && local42 == local37) {
					return true;
				}
				if (local47 == local32 && local37 == local42 + 1 && (this.anIntArrayArray1[local32][local37] & 0x12C0120) == 0) {
					return true;
				}
				if (local47 + 1 == local32 && local42 == local37 && (this.anIntArrayArray1[local32][local37] & 0x12C0180) == 0) {
					return true;
				}
				if (local32 == local47 && local37 == local42 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local32 == local47 && local42 + 1 == local37 && (this.anIntArrayArray1[local32][local37] & 0x20) == 0) {
				return true;
			}
			if (local47 == local32 && local42 - 1 == local37 && (this.anIntArrayArray1[local32][local37] & 0x2) == 0) {
				return true;
			}
			if (local32 == local47 - 1 && local42 == local37 && (this.anIntArrayArray1[local32][local37] & 0x8) == 0) {
				return true;
			}
			if (local47 + 1 == local32 && local37 == local42 && (this.anIntArrayArray1[local32][local37] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
	public void method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt132;
		@Pc(13) int local13 = arg1 - this.anInt113;
		this.anIntArrayArray1[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIBIIZ)V")
	public void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg1 - this.anInt132;
		@Pc(11) int local11 = arg0 - this.anInt113;
		@Pc(19) int local19;
		if (arg4 == 1 || arg4 == 3) {
			local19 = arg2;
			arg2 = arg3;
			arg3 = local19;
		}
		@Pc(29) int local29 = 256;
		if (arg5) {
			local29 = 131328;
		}
		for (local19 = local6; local19 < arg2 + local6; local19++) {
			if (local19 >= 0 && this.anInt129 > local19) {
				for (@Pc(50) int local50 = local11; local50 < local11 + arg3; local50++) {
					if (local50 >= 0 && this.anInt120 > local50) {
						this.method79(local19, local50, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIII)V")
	private void method79(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
	public void method80() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt129; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt120; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt129 - 5 || local7 >= this.anInt120 - 5) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}
}

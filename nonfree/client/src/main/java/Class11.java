import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class11 {

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	private final int anInt454;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private final int anInt457;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	private final int anInt449;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private final int anInt439;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt454 = arg1;
		this.anInt457 = 0;
		this.anInt449 = arg0;
		this.anIntArrayArray3 = new int[this.anInt449][this.anInt454];
		this.anInt439 = 0;
		this.method297();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public void method297() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt449; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt454; local11++) {
				if (local7 == 0 || local11 == 0 || local7 == this.anInt449 - 1 || this.anInt454 - 1 == local11) {
					this.anIntArrayArray3[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray3[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBIIIZI)V")
	public void method299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg5 - this.anInt457;
		@Pc(12) int local12 = 256;
		if (arg4) {
			local12 = 131328;
		}
		@Pc(33) int local33;
		if (arg2 == 1 || arg2 == 3) {
			local33 = arg1;
			arg1 = arg3;
			arg3 = local33;
		}
		@Pc(42) int local42 = arg0 - this.anInt439;
		for (local33 = local42; local33 < arg1 + local42; local33++) {
			if (local33 >= 0 && this.anInt449 > local33) {
				for (@Pc(61) int local61 = local10; local61 < arg3 + local10; local61++) {
					if (local61 >= 0 && local61 < this.anInt454) {
						this.method303(local61, local33, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
	public void method300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt457;
		@Pc(17) int local17 = arg0 - this.anInt439;
		this.anIntArrayArray3[local17][local8] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
	private void method302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBII)V")
	private void method303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg1][arg0] &= 16777215 - arg2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIZ)V")
	public void method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg0 - this.anInt457;
		@Pc(9) int local9 = arg3 - this.anInt439;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method302(local9, local4, 128);
				this.method302(local9 - 1, local4, 8);
			}
			if (arg2 == 1) {
				this.method302(local9, local4, 2);
				this.method302(local9, local4 + 1, 32);
			}
			if (arg2 == 2) {
				this.method302(local9, local4, 8);
				this.method302(local9 + 1, local4, 128);
			}
			if (arg2 == 3) {
				this.method302(local9, local4, 32);
				this.method302(local9, local4 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method302(local9, local4, 1);
				this.method302(local9 - 1, local4 + 1, 16);
			}
			if (arg2 == 1) {
				this.method302(local9, local4, 4);
				this.method302(local9 + 1, local4 + 1, 64);
			}
			if (arg2 == 2) {
				this.method302(local9, local4, 16);
				this.method302(local9 + 1, local4 + -1, 1);
			}
			if (arg2 == 3) {
				this.method302(local9, local4, 64);
				this.method302(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method302(local9, local4, 130);
				this.method302(local9 - 1, local4, 8);
				this.method302(local9, local4 + 1, 32);
			}
			if (arg2 == 1) {
				this.method302(local9, local4, 10);
				this.method302(local9, local4 + 1, 32);
				this.method302(local9 + 1, local4, 128);
			}
			if (arg2 == 2) {
				this.method302(local9, local4, 40);
				this.method302(local9 + 1, local4, 128);
				this.method302(local9, local4 - 1, 2);
			}
			if (arg2 == 3) {
				this.method302(local9, local4, 160);
				this.method302(local9, local4 - 1, 2);
				this.method302(local9 - 1, local4, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method302(local9, local4, 65536);
				this.method302(local9 - 1, local4, 4096);
			}
			if (arg2 == 1) {
				this.method302(local9, local4, 1024);
				this.method302(local9, local4 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method302(local9, local4, 4096);
				this.method302(local9 + 1, local4, 65536);
			}
			if (arg2 == 3) {
				this.method302(local9, local4, 16384);
				this.method302(local9, local4 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method302(local9, local4, 512);
				this.method302(local9 - 1, local4 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method302(local9, local4, 2048);
				this.method302(local9 + 1, local4 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method302(local9, local4, 8192);
				this.method302(local9 + 1, local4 + -1, 512);
			}
			if (arg2 == 3) {
				this.method302(local9, local4, 32768);
				this.method302(local9 - 1, local4 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method302(local9, local4, 66560);
			this.method302(local9 - 1, local4, 4096);
			this.method302(local9, local4 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method302(local9, local4, 5120);
			this.method302(local9, local4 + 1, 16384);
			this.method302(local9 + 1, local4, 65536);
		}
		if (arg2 == 2) {
			this.method302(local9, local4, 20480);
			this.method302(local9 + 1, local4, 65536);
			this.method302(local9, local4 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method302(local9, local4, 81920);
			this.method302(local9, local4 - 1, 1024);
			this.method302(local9 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIZII)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt457;
		@Pc(9) int local9 = arg4 - this.anInt439;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method303(local4, local9, 128);
				this.method303(local4, local9 - 1, 8);
			}
			if (arg1 == 1) {
				this.method303(local4, local9, 2);
				this.method303(local4 + 1, local9, 32);
			}
			if (arg1 == 2) {
				this.method303(local4, local9, 8);
				this.method303(local4, local9 + 1, 128);
			}
			if (arg1 == 3) {
				this.method303(local4, local9, 32);
				this.method303(local4 - 1, local9, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method303(local4, local9, 1);
				this.method303(local4 + 1, local9 + -1, 16);
			}
			if (arg1 == 1) {
				this.method303(local4, local9, 4);
				this.method303(local4 + 1, local9 - -1, 64);
			}
			if (arg1 == 2) {
				this.method303(local4, local9, 16);
				this.method303(local4 - 1, local9 + 1, 1);
			}
			if (arg1 == 3) {
				this.method303(local4, local9, 64);
				this.method303(local4 - 1, local9 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method303(local4, local9, 130);
				this.method303(local4, local9 - 1, 8);
				this.method303(local4 + 1, local9, 32);
			}
			if (arg1 == 1) {
				this.method303(local4, local9, 10);
				this.method303(local4 + 1, local9, 32);
				this.method303(local4, local9 + 1, 128);
			}
			if (arg1 == 2) {
				this.method303(local4, local9, 40);
				this.method303(local4, local9 + 1, 128);
				this.method303(local4 - 1, local9, 2);
			}
			if (arg1 == 3) {
				this.method303(local4, local9, 160);
				this.method303(local4 - 1, local9, 2);
				this.method303(local4, local9 - 1, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method303(local4, local9, 65536);
				this.method303(local4, local9 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method303(local4, local9, 1024);
				this.method303(local4 + 1, local9, 16384);
			}
			if (arg1 == 2) {
				this.method303(local4, local9, 4096);
				this.method303(local4, local9 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method303(local4, local9, 16384);
				this.method303(local4 - 1, local9, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method303(local4, local9, 512);
				this.method303(local4 + 1, local9 + -1, 8192);
			}
			if (arg1 == 1) {
				this.method303(local4, local9, 2048);
				this.method303(local4 + 1, local9 - -1, 32768);
			}
			if (arg1 == 2) {
				this.method303(local4, local9, 8192);
				this.method303(local4 - 1, local9 + 1, 512);
			}
			if (arg1 == 3) {
				this.method303(local4, local9, 32768);
				this.method303(local4 - 1, local9 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method303(local4, local9, 66560);
			this.method303(local4, local9 - 1, 4096);
			this.method303(local4 + 1, local9, 16384);
		}
		if (arg1 == 1) {
			this.method303(local4, local9, 5120);
			this.method303(local4 + 1, local9, 16384);
			this.method303(local4, local9 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method303(local4, local9, 20480);
			this.method303(local4, local9 + 1, 65536);
			this.method303(local4 - 1, local9, 1024);
		}
		if (arg1 == 3) {
			this.method303(local4, local9, 81920);
			this.method303(local4 - 1, local9, 1024);
			this.method303(local4, local9 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg1 && arg4 == arg2) {
			return true;
		}
		@Pc(36) int local36 = arg1 - this.anInt439;
		@Pc(41) int local41 = arg5 - this.anInt439;
		@Pc(46) int local46 = arg2 - this.anInt457;
		@Pc(51) int local51 = arg4 - this.anInt457;
		if (arg0 == 0) {
			if (arg3 == 0) {
				if (local36 - 1 == local41 && local51 == local46) {
					return true;
				}
				if (local36 == local41 && local51 + 1 == local46 && (this.anIntArrayArray3[local41][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local36 == local41 && local46 == local51 - 1 && (this.anIntArrayArray3[local41][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local36 == local41 && local46 == local51 + 1) {
					return true;
				}
				if (local41 == local36 - 1 && local51 == local46 && (this.anIntArrayArray3[local41][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local41 == local36 + 1 && local51 == local46 && (this.anIntArrayArray3[local41][local46] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local41 == local36 + 1 && local46 == local51) {
					return true;
				}
				if (local41 == local36 && local46 == local51 + 1 && (this.anIntArrayArray3[local41][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local36 == local41 && local46 == local51 - 1 && (this.anIntArrayArray3[local41][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local36 == local41 && local46 == local51 - 1) {
					return true;
				}
				if (local36 - 1 == local41 && local51 == local46 && (this.anIntArrayArray3[local41][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local41 == local36 + 1 && local46 == local51 && (this.anIntArrayArray3[local41][local46] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				if (local36 - 1 == local41 && local51 == local46) {
					return true;
				}
				if (local41 == local36 && local46 == local51 + 1) {
					return true;
				}
				if (local41 == local36 + 1 && local46 == local51 && (this.anIntArrayArray3[local41][local46] & 0x1280180) == 0) {
					return true;
				}
				if (local36 == local41 && local46 == local51 - 1 && (this.anIntArrayArray3[local41][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local36 - 1 == local41 && local46 == local51 && (this.anIntArrayArray3[local41][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local36 == local41 && local51 + 1 == local46) {
					return true;
				}
				if (local36 + 1 == local41 && local51 == local46) {
					return true;
				}
				if (local36 == local41 && local46 == local51 - 1 && (this.anIntArrayArray3[local41][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local36 - 1 == local41 && local46 == local51 && (this.anIntArrayArray3[local41][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local36 == local41 && local51 + 1 == local46 && (this.anIntArrayArray3[local41][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local36 + 1 == local41 && local51 == local46) {
					return true;
				}
				if (local41 == local36 && local51 - 1 == local46) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local36 - 1 == local41 && local51 == local46) {
					return true;
				}
				if (local41 == local36 && local46 == local51 + 1 && (this.anIntArrayArray3[local41][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local41 == local36 + 1 && local46 == local51 && (this.anIntArrayArray3[local41][local46] & 0x1280180) == 0) {
					return true;
				}
				if (local36 == local41 && local51 - 1 == local46) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local36 == local41 && local51 + 1 == local46 && (this.anIntArrayArray3[local41][local46] & 0x20) == 0) {
				return true;
			}
			if (local36 == local41 && local46 == local51 - 1 && (this.anIntArrayArray3[local41][local46] & 0x2) == 0) {
				return true;
			}
			if (local36 - 1 == local41 && local51 == local46 && (this.anIntArrayArray3[local41][local46] & 0x8) == 0) {
				return true;
			}
			if (local36 + 1 == local41 && local51 == local46 && (this.anIntArrayArray3[local41][local46] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg5 && arg0 == arg2) {
			return true;
		}
		@Pc(28) int local28 = arg5 - this.anInt439;
		@Pc(33) int local33 = arg2 - this.anInt457;
		@Pc(38) int local38 = arg4 - this.anInt439;
		@Pc(43) int local43 = arg0 - this.anInt457;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local28 + 1 == local38 && local43 == local33 && (this.anIntArrayArray3[local38][local33] & 0x80) == 0) {
					return true;
				}
				if (local28 == local38 && local43 - 1 == local33 && (this.anIntArrayArray3[local38][local33] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local28 - 1 == local38 && local43 == local33 && (this.anIntArrayArray3[local38][local33] & 0x8) == 0) {
					return true;
				}
				if (local38 == local28 && local43 - 1 == local33 && (this.anIntArrayArray3[local38][local33] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local28 - 1 == local38 && local43 == local33 && (this.anIntArrayArray3[local38][local33] & 0x8) == 0) {
					return true;
				}
				if (local38 == local28 && local33 == local43 + 1 && (this.anIntArrayArray3[local38][local33] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local28 + 1 == local38 && local43 == local33 && (this.anIntArrayArray3[local38][local33] & 0x80) == 0) {
					return true;
				}
				if (local38 == local28 && local43 + 1 == local33 && (this.anIntArrayArray3[local38][local33] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local28 == local38 && local43 + 1 == local33 && (this.anIntArrayArray3[local38][local33] & 0x20) == 0) {
				return true;
			}
			if (local38 == local28 && local33 == local43 - 1 && (this.anIntArrayArray3[local38][local33] & 0x2) == 0) {
				return true;
			}
			if (local28 - 1 == local38 && local33 == local43 && (this.anIntArrayArray3[local38][local33] & 0x8) == 0) {
				return true;
			}
			if (local28 + 1 == local38 && local33 == local43 && (this.anIntArrayArray3[local38][local33] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIZ)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(13) int local13;
		if (arg0 == 1 || arg0 == 3) {
			local13 = arg3;
			arg3 = arg1;
			arg1 = local13;
		}
		@Pc(22) int local22 = arg4 - this.anInt457;
		@Pc(24) int local24 = 256;
		if (arg5) {
			local24 = 131328;
		}
		@Pc(39) int local39 = arg2 - this.anInt439;
		for (local13 = local39; local13 < arg3 + local39; local13++) {
			if (local13 >= 0 && this.anInt449 > local13) {
				for (@Pc(60) int local60 = local22; local60 < local22 + arg1; local60++) {
					if (local60 >= 0 && local60 < this.anInt454) {
						this.method302(local13, local60, local24);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg3 - 1;
		@Pc(15) int local15 = arg1 + arg5 - 1;
		if (arg2 >= arg3 && arg2 <= local9 && arg0 >= arg1 && arg0 <= local15) {
			return true;
		} else if (arg3 - 1 == arg2 && arg0 >= arg1 && local15 >= arg0 && (this.anIntArrayArray3[arg2 - this.anInt439][arg0 - this.anInt457] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg2 == local9 + 1 && arg1 <= arg0 && arg0 <= local15 && (this.anIntArrayArray3[arg2 - this.anInt439][arg0 - this.anInt457] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg0 && arg2 >= arg3 && local9 >= arg2 && (this.anIntArrayArray3[arg2 - this.anInt439][arg0 - this.anInt457] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local15 + 1 == arg0 && arg3 <= arg2 && local9 >= arg2 && (this.anIntArrayArray3[arg2 - this.anInt439][arg0 - this.anInt457] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
	public void method314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt439;
		@Pc(19) int local19 = arg1 - this.anInt457;
		this.anIntArrayArray3[local4][local19] |= 0x200000;
	}
}

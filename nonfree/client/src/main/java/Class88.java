import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class88 {

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!dja", name = "j", descriptor = "I")
	public int anInt1765;

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "I")
	public int anInt1778;

	@OriginalMember(owner = "client!dja", name = "G", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!dja", name = "D", descriptor = "I")
	public int anInt1781;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)V")
	public void method1572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 - this.anInt1763;
		@Pc(16) int local16 = arg1 - this.anInt1778;
		this.anIntArrayArray12[local16][local11] |= 0x200000;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(BII)V")
	public void method1573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1778;
		@Pc(9) int local9 = arg1 - this.anInt1763;
		this.anIntArrayArray12[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIZIIIIII)Z")
	public boolean method1575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static593.method8592(arg1, arg5, arg0, arg7, arg2, arg3, arg0, arg4) ? true : this.method1587(arg0, arg5, arg4, arg1, arg6, arg3, arg7, arg2, arg0);
		}
		@Pc(42) int local42 = arg1 + arg2 - 1;
		@Pc(49) int local49 = arg5 + arg3 - 1;
		if (arg1 <= arg7 && local42 >= arg7 && arg4 >= arg5 && arg4 <= local49) {
			return true;
		} else if (arg7 == arg1 - 1 && arg4 >= arg5 && local49 >= arg4 && (this.anIntArrayArray12[arg7 - this.anInt1778][arg4 - this.anInt1763] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg7 == local42 + 1 && arg5 <= arg4 && arg4 <= local49 && (this.anIntArrayArray12[arg7 - this.anInt1778][arg4 - this.anInt1763] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg4 && arg1 <= arg7 && local42 >= arg7 && (this.anIntArrayArray12[arg7 - this.anInt1778][arg4 - this.anInt1763] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local49 + 1 && arg1 <= arg7 && arg7 <= local42 && (this.anIntArrayArray12[arg7 - this.anInt1778][arg4 - this.anInt1763] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(BII)V")
	public void method1576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1763;
		@Pc(9) int local9 = arg1 - this.anInt1778;
		this.anIntArrayArray12[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(BZZIIII)V")
	public void method1577(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt1778;
		@Pc(9) int local9 = arg4 - this.anInt1763;
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method1584(local9, 128, local4);
				this.method1584(local9, 8, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1584(local9, 2, local4);
				this.method1584(local9 + 1, 32, local4);
			}
			if (arg5 == 2) {
				this.method1584(local9, 8, local4);
				this.method1584(local9, 128, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1584(local9, 32, local4);
				this.method1584(local9 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method1584(local9, 1, local4);
				this.method1584(local9 + 1, 16, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1584(local9, 4, local4);
				this.method1584(local9 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method1584(local9, 16, local4);
				this.method1584(local9 - 1, 1, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1584(local9, 64, local4);
				this.method1584(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				this.method1584(local9, 130, local4);
				this.method1584(local9, 8, local4 - 1);
				this.method1584(local9 + 1, 32, local4);
			}
			if (arg5 == 1) {
				this.method1584(local9, 10, local4);
				this.method1584(local9 + 1, 32, local4);
				this.method1584(local9, 128, local4 + 1);
			}
			if (arg5 == 2) {
				this.method1584(local9, 40, local4);
				this.method1584(local9, 128, local4 + 1);
				this.method1584(local9 - 1, 2, local4);
			}
			if (arg5 == 3) {
				this.method1584(local9, 160, local4);
				this.method1584(local9 - 1, 2, local4);
				this.method1584(local9, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method1584(local9, 65536, local4);
					this.method1584(local9, 4096, local4 - 1);
				}
				if (arg5 == 1) {
					this.method1584(local9, 1024, local4);
					this.method1584(local9 + 1, 16384, local4);
				}
				if (arg5 == 2) {
					this.method1584(local9, 4096, local4);
					this.method1584(local9, 65536, local4 + 1);
				}
				if (arg5 == 3) {
					this.method1584(local9, 16384, local4);
					this.method1584(local9 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method1584(local9, 512, local4);
					this.method1584(local9 + 1, 8192, local4 - 1);
				}
				if (arg5 == 1) {
					this.method1584(local9, 2048, local4);
					this.method1584(local9 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method1584(local9, 8192, local4);
					this.method1584(local9 - 1, 512, local4 + 1);
				}
				if (arg5 == 3) {
					this.method1584(local9, 32768, local4);
					this.method1584(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method1584(local9, 66560, local4);
					this.method1584(local9, 4096, local4 - 1);
					this.method1584(local9 + 1, 16384, local4);
				}
				if (arg5 == 1) {
					this.method1584(local9, 5120, local4);
					this.method1584(local9 + 1, 16384, local4);
					this.method1584(local9, 65536, local4 + 1);
				}
				if (arg5 == 2) {
					this.method1584(local9, 20480, local4);
					this.method1584(local9, 65536, local4 + 1);
					this.method1584(local9 - 1, 1024, local4);
				}
				if (arg5 == 3) {
					this.method1584(local9, 81920, local4);
					this.method1584(local9 - 1, 1024, local4);
					this.method1584(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method1584(local9, 536870912, local4);
				this.method1584(local9, 33554432, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1584(local9, 8388608, local4);
				this.method1584(local9 + 1, 134217728, local4);
			}
			if (arg5 == 2) {
				this.method1584(local9, 33554432, local4);
				this.method1584(local9, 536870912, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1584(local9, 134217728, local4);
				this.method1584(local9 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method1584(local9, 4194304, local4);
				this.method1584(local9 + 1, 67108864, local4 - 1);
			}
			if (arg5 == 1) {
				this.method1584(local9, 16777216, local4);
				this.method1584(local9 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method1584(local9, 67108864, local4);
				this.method1584(local9 - 1, 4194304, local4 + 1);
			}
			if (arg5 == 3) {
				this.method1584(local9, 268435456, local4);
				this.method1584(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method1584(local9, 545259520, local4);
			this.method1584(local9, 33554432, local4 - 1);
			this.method1584(local9 + 1, 134217728, local4);
		}
		if (arg5 == 1) {
			this.method1584(local9, 41943040, local4);
			this.method1584(local9 + 1, 134217728, local4);
			this.method1584(local9, 536870912, local4 + 1);
		}
		if (arg5 == 2) {
			this.method1584(local9, 167772160, local4);
			this.method1584(local9, 536870912, local4 + 1);
			this.method1584(local9 - 1, 8388608, local4);
		}
		if (arg5 == 3) {
			this.method1584(local9, 671088640, local4);
			this.method1584(local9 - 1, 8388608, local4);
			this.method1584(local9, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBI)V")
	public void method1578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1778;
		@Pc(13) int local13 = arg0 - this.anInt1763;
		this.anIntArrayArray12[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBII)V")
	private void method1583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIII)V")
	private void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray12[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIIZZII)V")
	public void method1586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1763;
		@Pc(9) int local9 = arg4 - this.anInt1778;
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method1583(local9, local4, 128);
				this.method1583(local9 - 1, local4, 8);
			}
			if (arg5 == 1) {
				this.method1583(local9, local4, 2);
				this.method1583(local9, local4 + 1, 32);
			}
			if (arg5 == 2) {
				this.method1583(local9, local4, 8);
				this.method1583(local9 + 1, local4, 128);
			}
			if (arg5 == 3) {
				this.method1583(local9, local4, 32);
				this.method1583(local9, local4 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method1583(local9, local4, 1);
				this.method1583(local9 - 1, local4 + 1, 16);
			}
			if (arg5 == 1) {
				this.method1583(local9, local4, 4);
				this.method1583(local9 + 1, local4 + 1, 64);
			}
			if (arg5 == 2) {
				this.method1583(local9, local4, 16);
				this.method1583(local9 + 1, local4 + -1, 1);
			}
			if (arg5 == 3) {
				this.method1583(local9, local4, 64);
				this.method1583(local9 - 1, local4 - 1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				this.method1583(local9, local4, 130);
				this.method1583(local9 - 1, local4, 8);
				this.method1583(local9, local4 + 1, 32);
			}
			if (arg5 == 1) {
				this.method1583(local9, local4, 10);
				this.method1583(local9, local4 + 1, 32);
				this.method1583(local9 + 1, local4, 128);
			}
			if (arg5 == 2) {
				this.method1583(local9, local4, 40);
				this.method1583(local9 + 1, local4, 128);
				this.method1583(local9, local4 - 1, 2);
			}
			if (arg5 == 3) {
				this.method1583(local9, local4, 160);
				this.method1583(local9, local4 - 1, 2);
				this.method1583(local9 - 1, local4, 8);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method1583(local9, local4, 65536);
					this.method1583(local9 - 1, local4, 4096);
				}
				if (arg5 == 1) {
					this.method1583(local9, local4, 1024);
					this.method1583(local9, local4 + 1, 16384);
				}
				if (arg5 == 2) {
					this.method1583(local9, local4, 4096);
					this.method1583(local9 + 1, local4, 65536);
				}
				if (arg5 == 3) {
					this.method1583(local9, local4, 16384);
					this.method1583(local9, local4 - 1, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method1583(local9, local4, 512);
					this.method1583(local9 - 1, local4 + 1, 8192);
				}
				if (arg5 == 1) {
					this.method1583(local9, local4, 2048);
					this.method1583(local9 + 1, local4 + 1, 32768);
				}
				if (arg5 == 2) {
					this.method1583(local9, local4, 8192);
					this.method1583(local9 + 1, local4 + -1, 512);
				}
				if (arg5 == 3) {
					this.method1583(local9, local4, 32768);
					this.method1583(local9 - 1, local4 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method1583(local9, local4, 66560);
					this.method1583(local9 - 1, local4, 4096);
					this.method1583(local9, local4 + 1, 16384);
				}
				if (arg5 == 1) {
					this.method1583(local9, local4, 5120);
					this.method1583(local9, local4 + 1, 16384);
					this.method1583(local9 + 1, local4, 65536);
				}
				if (arg5 == 2) {
					this.method1583(local9, local4, 20480);
					this.method1583(local9 + 1, local4, 65536);
					this.method1583(local9, local4 - 1, 1024);
				}
				if (arg5 == 3) {
					this.method1583(local9, local4, 81920);
					this.method1583(local9, local4 - 1, 1024);
					this.method1583(local9 - 1, local4, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method1583(local9, local4, 536870912);
				this.method1583(local9 - 1, local4, 33554432);
			}
			if (arg5 == 1) {
				this.method1583(local9, local4, 8388608);
				this.method1583(local9, local4 + 1, 134217728);
			}
			if (arg5 == 2) {
				this.method1583(local9, local4, 33554432);
				this.method1583(local9 + 1, local4, 536870912);
			}
			if (arg5 == 3) {
				this.method1583(local9, local4, 134217728);
				this.method1583(local9, local4 - 1, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method1583(local9, local4, 4194304);
				this.method1583(local9 - 1, local4 + 1, 67108864);
			}
			if (arg5 == 1) {
				this.method1583(local9, local4, 16777216);
				this.method1583(local9 + 1, local4 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method1583(local9, local4, 67108864);
				this.method1583(local9 + 1, local4 + -1, 4194304);
			}
			if (arg5 == 3) {
				this.method1583(local9, local4, 268435456);
				this.method1583(local9 - 1, local4 + -1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method1583(local9, local4, 545259520);
			this.method1583(local9 - 1, local4, 33554432);
			this.method1583(local9, local4 + 1, 134217728);
		}
		if (arg5 == 1) {
			this.method1583(local9, local4, 41943040);
			this.method1583(local9, local4 + 1, 134217728);
			this.method1583(local9 + 1, local4, 536870912);
		}
		if (arg5 == 2) {
			this.method1583(local9, local4, 167772160);
			this.method1583(local9 + 1, local4, 536870912);
			this.method1583(local9, local4 - 1, 8388608);
		}
		if (arg5 == 3) {
			this.method1583(local9, local4, 671088640);
			this.method1583(local9, local4 - 1, 8388608);
			this.method1583(local9 - 1, local4, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIIIBIIIII)Z")
	public boolean method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg6;
		@Pc(19) int local19 = arg8 + arg2;
		@Pc(23) int local23 = arg7 + arg3;
		@Pc(27) int local27 = arg5 + arg1;
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (arg6 == local23 && (arg4 & 0x2) == 0) {
			local79 = arg1 >= arg2 ? arg1 : arg2;
			local87 = local19 >= local27 ? local27 : local19;
			while (local87 > local79) {
				if ((this.anIntArrayArray12[local23 - this.anInt1778 - 1][local79 - this.anInt1763] & 0x8) == 0) {
					return true;
				}
				local79++;
			}
		} else if (arg3 == local9 && (arg4 & 0x8) == 0) {
			local79 = arg2 <= arg1 ? arg1 : arg2;
			local87 = local27 > local19 ? local19 : local27;
			while (local87 > local79) {
				if ((this.anIntArrayArray12[arg3 - this.anInt1778][local79 - this.anInt1763] & 0x80) == 0) {
					return true;
				}
				local79++;
			}
		} else if (local27 == arg2 && (arg4 & 0x1) == 0) {
			local79 = arg6 > arg3 ? arg6 : arg3;
			local87 = local9 >= local23 ? local23 : local9;
			while (local87 > local79) {
				if ((this.anIntArrayArray12[local79 - this.anInt1778][local27 - this.anInt1763 - 1] & 0x2) == 0) {
					return true;
				}
				local79++;
			}
		} else if (local19 == arg1 && (arg4 & 0x4) == 0) {
			local79 = arg6 > arg3 ? arg6 : arg3;
			local87 = local23 > local9 ? local9 : local23;
			while (local87 > local79) {
				if ((this.anIntArrayArray12[local79 - this.anInt1778][arg1 - this.anInt1763] & 0x20) == 0) {
					return true;
				}
				local79++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method1588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg3 == arg1 && arg5 == arg4) {
				return true;
			}
		} else if (arg1 <= arg3 && arg3 <= arg6 + arg1 - 1 && arg5 <= arg5 && arg5 <= arg6 + arg5 - 1) {
			return true;
		}
		@Pc(77) int local77 = arg5 - this.anInt1763;
		@Pc(82) int local82 = arg3 - this.anInt1778;
		@Pc(87) int local87 = arg1 - this.anInt1778;
		@Pc(92) int local92 = arg4 - this.anInt1763;
		if (arg6 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local87 == local82 + 1 && local92 == local77 && (this.anIntArrayArray12[local87][local92] & 0x80) == 0) {
						return true;
					}
					if (local87 == local82 && local77 - 1 == local92 && (this.anIntArrayArray12[local87][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local82 - 1 == local87 && local92 == local77 && (this.anIntArrayArray12[local87][local92] & 0x8) == 0) {
						return true;
					}
					if (local87 == local82 && local77 - 1 == local92 && (this.anIntArrayArray12[local87][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local82 - 1 == local87 && local77 == local92 && (this.anIntArrayArray12[local87][local92] & 0x8) == 0) {
						return true;
					}
					if (local87 == local82 && local92 == local77 + 1 && (this.anIntArrayArray12[local87][local92] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local87 == local82 + 1 && local92 == local77 && (this.anIntArrayArray12[local87][local92] & 0x80) == 0) {
						return true;
					}
					if (local82 == local87 && local77 + 1 == local92 && (this.anIntArrayArray12[local87][local92] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local87 == local82 && local77 + 1 == local92 && (this.anIntArrayArray12[local87][local92] & 0x20) == 0) {
					return true;
				}
				if (local82 == local87 && local77 - 1 == local92 && (this.anIntArrayArray12[local87][local92] & 0x2) == 0) {
					return true;
				}
				if (local87 == local82 - 1 && local77 == local92 && (this.anIntArrayArray12[local87][local92] & 0x8) == 0) {
					return true;
				}
				if (local87 == local82 + 1 && local92 == local77 && (this.anIntArrayArray12[local87][local92] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(103) int local103 = arg6 + local87 - 1;
			@Pc(109) int local109 = local92 + arg6 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local87 == local82 + 1 && local92 <= local77 && local109 >= local77 && (this.anIntArrayArray12[local87][local77] & 0x80) == 0) {
						return true;
					}
					if (local87 <= local82 && local103 >= local82 && local92 == local77 - arg6 && (this.anIntArrayArray12[local82][local109] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local87 == local82 - arg6 && local92 <= local77 && local109 >= local77 && (this.anIntArrayArray12[local103][local77] & 0x8) == 0) {
						return true;
					}
					if (local82 >= local87 && local103 >= local82 && local77 - arg6 == local92 && (this.anIntArrayArray12[local82][local109] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local82 - arg6 == local87 && local77 >= local92 && local109 >= local77 && (this.anIntArrayArray12[local103][local77] & 0x8) == 0) {
						return true;
					}
					if (local82 >= local87 && local103 >= local82 && local92 == local77 + 1 && (this.anIntArrayArray12[local82][local92] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local87 == local82 + 1 && local77 >= local92 && local77 <= local109 && (this.anIntArrayArray12[local87][local77] & 0x80) == 0) {
						return true;
					}
					if (local82 >= local87 && local103 >= local82 && local77 + 1 == local92 && (this.anIntArrayArray12[local82][local92] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local82 >= local87 && local82 <= local103 && local77 + 1 == local92 && (this.anIntArrayArray12[local82][local92] & 0x20) == 0) {
					return true;
				}
				if (local82 >= local87 && local82 <= local103 && local92 == local77 - arg6 && (this.anIntArrayArray12[local82][local109] & 0x2) == 0) {
					return true;
				}
				if (local82 - arg6 == local87 && local92 <= local77 && local109 >= local77 && (this.anIntArrayArray12[local103][local77] & 0x8) == 0) {
					return true;
				}
				if (local87 == local82 + 1 && local92 <= local77 && local77 <= local109 && (this.anIntArrayArray12[local87][local77] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 >= -76) {
			this.anInt1778 = 43;
		}
		if (arg1 == 1) {
			if (arg3 == arg4 && arg6 == arg0) {
				return true;
			}
		} else if (arg3 <= arg4 && arg4 <= arg3 + arg1 - 1 && arg6 >= arg6 && arg6 <= arg1 + arg6 - 1) {
			return true;
		}
		@Pc(83) int local83 = arg3 - this.anInt1778;
		@Pc(88) int local88 = arg4 - this.anInt1778;
		@Pc(93) int local93 = arg6 - this.anInt1763;
		@Pc(98) int local98 = arg0 - this.anInt1763;
		if (arg1 == 1) {
			if (arg7 == 0) {
				if (arg5 == 0) {
					if (local83 == local88 - 1 && local98 == local93) {
						return true;
					}
					if (local88 == local83 && local93 + 1 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local88 == local83 && local98 == local93 - 1 && (this.anIntArrayArray12[local83][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local83 == local88 && local98 == local93 + 1) {
						return true;
					}
					if (local83 == local88 - 1 && local93 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0108) == 0) {
						return true;
					}
					if (local88 + 1 == local83 && local93 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local88 + 1 == local83 && local98 == local93) {
						return true;
					}
					if (local83 == local88 && local93 + 1 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local88 && local93 - 1 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local88 == local83 && local93 - 1 == local98) {
						return true;
					}
					if (local88 - 1 == local83 && local93 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 == local88 + 1 && local98 == local93 && (this.anIntArrayArray12[local83][local98] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg7 == 2) {
				if (arg5 == 0) {
					if (local88 - 1 == local83 && local93 == local98) {
						return true;
					}
					if (local83 == local88 && local93 + 1 == local98) {
						return true;
					}
					if (local83 == local88 + 1 && local98 == local93 && (this.anIntArrayArray12[local83][local98] & 0x2C0180) == 0) {
						return true;
					}
					if (local83 == local88 && local98 == local93 - 1 && (this.anIntArrayArray12[local83][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local83 == local88 - 1 && local98 == local93 && (this.anIntArrayArray12[local83][local98] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 == local88 && local98 == local93 + 1) {
						return true;
					}
					if (local88 + 1 == local83 && local98 == local93) {
						return true;
					}
					if (local83 == local88 && local98 == local93 - 1 && (this.anIntArrayArray12[local83][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local83 == local88 - 1 && local93 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0108) == 0) {
						return true;
					}
					if (local88 == local83 && local93 + 1 == local98 && (this.anIntArrayArray12[local83][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local88 + 1 == local83 && local98 == local93) {
						return true;
					}
					if (local83 == local88 && local93 - 1 == local98) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local88 - 1 == local83 && local98 == local93) {
						return true;
					}
					if (local88 == local83 && local98 == local93 + 1 && (this.anIntArrayArray12[local83][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local88 + 1 && local98 == local93 && (this.anIntArrayArray12[local83][local98] & 0x2C0180) == 0) {
						return true;
					}
					if (local83 == local88 && local98 == local93 - 1) {
						return true;
					}
				}
			}
			if (arg7 == 9) {
				if (local88 == local83 && local93 + 1 == local98 && (this.anIntArrayArray12[local83][local98] & 0x20) == 0) {
					return true;
				}
				if (local88 == local83 && local98 == local93 - 1 && (this.anIntArrayArray12[local83][local98] & 0x2) == 0) {
					return true;
				}
				if (local83 == local88 - 1 && local98 == local93 && (this.anIntArrayArray12[local83][local98] & 0x8) == 0) {
					return true;
				}
				if (local88 + 1 == local83 && local98 == local93 && (this.anIntArrayArray12[local83][local98] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(110) int local110 = local83 + arg1 - 1;
			@Pc(117) int local117 = local98 + arg1 - 1;
			if (arg7 == 0) {
				if (arg5 == 0) {
					if (local83 == local88 - arg1 && local98 <= local93 && local93 <= local117) {
						return true;
					}
					if (local83 <= local88 && local88 <= local110 && local93 + 1 == local98 && (this.anIntArrayArray12[local88][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 <= local88 && local110 >= local88 && local98 == local93 - arg1 && (this.anIntArrayArray12[local88][local117] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local83 <= local88 && local88 <= local110 && local93 + 1 == local98) {
						return true;
					}
					if (local88 - arg1 == local83 && local93 >= local98 && local117 >= local93 && (this.anIntArrayArray12[local110][local93] & 0x2C0108) == 0) {
						return true;
					}
					if (local88 + 1 == local83 && local93 >= local98 && local93 <= local117 && (this.anIntArrayArray12[local83][local93] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local83 == local88 + 1 && local98 <= local93 && local93 <= local117) {
						return true;
					}
					if (local83 <= local88 && local110 >= local88 && local93 + 1 == local98 && (this.anIntArrayArray12[local88][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local88 >= local83 && local88 <= local110 && local93 - arg1 == local98 && (this.anIntArrayArray12[local88][local117] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local83 <= local88 && local110 >= local88 && local98 == local93 - arg1) {
						return true;
					}
					if (local83 == local88 - arg1 && local98 <= local93 && local93 <= local117 && (this.anIntArrayArray12[local110][local93] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 == local88 + 1 && local98 <= local93 && local117 >= local93 && (this.anIntArrayArray12[local83][local93] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg7 == 2) {
				if (arg5 == 0) {
					if (local88 - arg1 == local83 && local98 <= local93 && local117 >= local93) {
						return true;
					}
					if (local83 <= local88 && local88 <= local110 && local93 + 1 == local98) {
						return true;
					}
					if (local83 == local88 + 1 && local93 >= local98 && local117 >= local93 && (this.anIntArrayArray12[local83][local93] & 0x2C0180) == 0) {
						return true;
					}
					if (local83 <= local88 && local110 >= local88 && local93 - arg1 == local98 && (this.anIntArrayArray12[local88][local117] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local83 == local88 - arg1 && local93 >= local98 && local93 <= local117 && (this.anIntArrayArray12[local110][local93] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 <= local88 && local110 >= local88 && local98 == local93 + 1) {
						return true;
					}
					if (local88 + 1 == local83 && local98 <= local93 && local93 <= local117) {
						return true;
					}
					if (local88 >= local83 && local110 >= local88 && local98 == local93 - arg1 && (this.anIntArrayArray12[local88][local117] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local83 == local88 - arg1 && local93 >= local98 && local93 <= local117 && (this.anIntArrayArray12[local110][local93] & 0x2C0108) == 0) {
						return true;
					}
					if (local83 <= local88 && local88 <= local110 && local93 + 1 == local98 && (this.anIntArrayArray12[local88][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local88 + 1 && local93 >= local98 && local93 <= local117) {
						return true;
					}
					if (local88 >= local83 && local110 >= local88 && local93 - arg1 == local98) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local83 == local88 - arg1 && local93 >= local98 && local93 <= local117) {
						return true;
					}
					if (local88 >= local83 && local110 >= local88 && local93 + 1 == local98 && (this.anIntArrayArray12[local88][local98] & 0x2C0120) == 0) {
						return true;
					}
					if (local83 == local88 + 1 && local98 <= local93 && local117 >= local93 && (this.anIntArrayArray12[local83][local93] & 0x2C0180) == 0) {
						return true;
					}
					if (local88 >= local83 && local110 >= local88 && local98 == local93 - arg1) {
						return true;
					}
				}
			}
			if (arg7 == 9) {
				if (local83 <= local88 && local88 <= local110 && local93 + 1 == local98 && (this.anIntArrayArray12[local88][local98] & 0x2C0120) == 0) {
					return true;
				}
				if (local88 >= local83 && local88 <= local110 && local93 - arg1 == local98 && (this.anIntArrayArray12[local88][local117] & 0x2C0102) == 0) {
					return true;
				}
				if (local83 == local88 - arg1 && local93 >= local98 && local117 >= local93 && (this.anIntArrayArray12[local110][local93] & 0x2C0108) == 0) {
					return true;
				}
				if (local83 == local88 + 1 && local98 <= local93 && local117 >= local93 && (this.anIntArrayArray12[local83][local93] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IZIIIIZ)V")
	public void method1591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg0 - this.anInt1778;
		@Pc(29) int local29 = arg4 - this.anInt1763;
		for (@Pc(39) int local39 = local24; local39 < local24 + arg3; local39++) {
			if (local39 >= 0 && this.anInt1765 > local39) {
				for (@Pc(60) int local60 = local29; local60 < arg2 + local29; local60++) {
					if (local60 >= 0 && this.anInt1781 > local60) {
						this.method1583(local39, local60, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IZZIIIII)V")
	public void method1594(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt1778;
		@Pc(23) int local23 = arg0 - this.anInt1763;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(43) int local43;
		if (arg6 == 1 || arg6 == 3) {
			local43 = arg5;
			arg5 = arg3;
			arg3 = local43;
		}
		for (local43 = local18; local43 < arg5 + local18; local43++) {
			if (local43 >= 0 && local43 < this.anInt1765) {
				for (@Pc(63) int local63 = local23; local63 < local23 + arg3; local63++) {
					if (local63 >= 0 && this.anInt1781 > local63) {
						this.method1584(local63, local7, local43);
					}
				}
			}
		}
		if (-1 != -1) {
			Static110.method1579();
		}
	}

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(B)V")
	public void method1595() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1765; local3++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt1781; local9++) {
				if (local3 == 0 || local9 == 0 || this.anInt1765 - 5 <= local3 || local9 >= this.anInt1781 - 5) {
					this.anIntArrayArray12[local3][local9] = -1;
				} else {
					this.anIntArrayArray12[local3][local9] = 2097152;
				}
			}
		}
		if (-113 != -113) {
			this.method1590(-16, -19, -39, 97, 35, -94, -74, -74);
		}
	}
}

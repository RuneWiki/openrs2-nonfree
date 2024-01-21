import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class28 {

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
	private final int anInt1404;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	private final int anInt1389;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	private final int anInt1399;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	private final int anInt1401;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(II)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1404 = arg0;
		this.anInt1389 = 0;
		this.anInt1399 = arg1;
		this.anIntArrayArray8 = new int[this.anInt1404][this.anInt1399];
		this.anInt1401 = 0;
		this.method1044();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public void method1036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1389;
		@Pc(17) int local17 = arg0 - this.anInt1401;
		this.anIntArrayArray8[local8][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == arg5 && arg2 == arg0) {
			return true;
		}
		@Pc(32) int local32 = arg4 - this.anInt1389;
		@Pc(37) int local37 = arg0 - this.anInt1401;
		@Pc(42) int local42 = arg5 - this.anInt1389;
		@Pc(47) int local47 = arg2 - this.anInt1401;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (local42 - 1 == local32 && local47 == local37) {
					return true;
				}
				if (local42 == local32 && local47 == local37 + 1 && (this.anIntArrayArray8[local32][local47] & 0x12C0120) == 0) {
					return true;
				}
				if (local42 == local32 && local37 - 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local32 == local42 && local47 == local37 + 1) {
					return true;
				}
				if (local32 == local42 - 1 && local37 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0108) == 0) {
					return true;
				}
				if (local32 == local42 + 1 && local47 == local37 && (this.anIntArrayArray8[local32][local47] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local32 == local42 + 1 && local47 == local37) {
					return true;
				}
				if (local42 == local32 && local47 == local37 + 1 && (this.anIntArrayArray8[local32][local47] & 0x12C0120) == 0) {
					return true;
				}
				if (local32 == local42 && local37 - 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local32 == local42 && local47 == local37 - 1) {
					return true;
				}
				if (local32 == local42 - 1 && local47 == local37 && (this.anIntArrayArray8[local32][local47] & 0x12C0108) == 0) {
					return true;
				}
				if (local42 + 1 == local32 && local47 == local37 && (this.anIntArrayArray8[local32][local47] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				if (local42 - 1 == local32 && local37 == local47) {
					return true;
				}
				if (local42 == local32 && local47 == local37 + 1) {
					return true;
				}
				if (local42 + 1 == local32 && local47 == local37 && (this.anIntArrayArray8[local32][local47] & 0x12C0180) == 0) {
					return true;
				}
				if (local32 == local42 && local37 - 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local32 == local42 - 1 && local47 == local37 && (this.anIntArrayArray8[local32][local47] & 0x12C0108) == 0) {
					return true;
				}
				if (local42 == local32 && local47 == local37 + 1) {
					return true;
				}
				if (local32 == local42 + 1 && local47 == local37) {
					return true;
				}
				if (local32 == local42 && local37 - 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local32 == local42 - 1 && local47 == local37 && (this.anIntArrayArray8[local32][local47] & 0x12C0108) == 0) {
					return true;
				}
				if (local32 == local42 && local37 + 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0120) == 0) {
					return true;
				}
				if (local42 + 1 == local32 && local47 == local37) {
					return true;
				}
				if (local42 == local32 && local47 == local37 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local42 - 1 == local32 && local37 == local47) {
					return true;
				}
				if (local32 == local42 && local47 == local37 + 1 && (this.anIntArrayArray8[local32][local47] & 0x12C0120) == 0) {
					return true;
				}
				if (local42 + 1 == local32 && local37 == local47 && (this.anIntArrayArray8[local32][local47] & 0x12C0180) == 0) {
					return true;
				}
				if (local32 == local42 && local47 == local37 - 1) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local32 == local42 && local37 + 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x20) == 0) {
				return true;
			}
			if (local32 == local42 && local37 - 1 == local47 && (this.anIntArrayArray8[local32][local47] & 0x2) == 0) {
				return true;
			}
			if (local42 - 1 == local32 && local37 == local47 && (this.anIntArrayArray8[local32][local47] & 0x8) == 0) {
				return true;
			}
			if (local32 == local42 + 1 && local37 == local47 && (this.anIntArrayArray8[local32][local47] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIB)V")
	public void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg0 - this.anInt1401;
		@Pc(13) int local13 = arg4 - this.anInt1389;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1046(local13, 128, local8);
				this.method1046(local13 - 1, 8, local8);
			}
			if (arg1 == 1) {
				this.method1046(local13, 2, local8);
				this.method1046(local13, 32, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1046(local13, 8, local8);
				this.method1046(local13 + 1, 128, local8);
			}
			if (arg1 == 3) {
				this.method1046(local13, 32, local8);
				this.method1046(local13, 2, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1046(local13, 1, local8);
				this.method1046(local13 - 1, 16, local8 + 1);
			}
			if (arg1 == 1) {
				this.method1046(local13, 4, local8);
				this.method1046(local13 + 1, 64, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1046(local13, 16, local8);
				this.method1046(local13 + 1, 1, local8 - 1);
			}
			if (arg1 == 3) {
				this.method1046(local13, 64, local8);
				this.method1046(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method1046(local13, 130, local8);
				this.method1046(local13 - 1, 8, local8);
				this.method1046(local13, 32, local8 + 1);
			}
			if (arg1 == 1) {
				this.method1046(local13, 10, local8);
				this.method1046(local13, 32, local8 + 1);
				this.method1046(local13 + 1, 128, local8);
			}
			if (arg1 == 2) {
				this.method1046(local13, 40, local8);
				this.method1046(local13 + 1, 128, local8);
				this.method1046(local13, 2, local8 - 1);
			}
			if (arg1 == 3) {
				this.method1046(local13, 160, local8);
				this.method1046(local13, 2, local8 - 1);
				this.method1046(local13 - 1, 8, local8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method1046(local13, 65536, local8);
				this.method1046(local13 - 1, 4096, local8);
			}
			if (arg1 == 1) {
				this.method1046(local13, 1024, local8);
				this.method1046(local13, 16384, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1046(local13, 4096, local8);
				this.method1046(local13 + 1, 65536, local8);
			}
			if (arg1 == 3) {
				this.method1046(local13, 16384, local8);
				this.method1046(local13, 1024, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method1046(local13, 512, local8);
				this.method1046(local13 - 1, 8192, local8 + 1);
			}
			if (arg1 == 1) {
				this.method1046(local13, 2048, local8);
				this.method1046(local13 + 1, 32768, local8 + 1);
			}
			if (arg1 == 2) {
				this.method1046(local13, 8192, local8);
				this.method1046(local13 + 1, 512, local8 - 1);
			}
			if (arg1 == 3) {
				this.method1046(local13, 32768, local8);
				this.method1046(local13 - 1, 2048, local8 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1046(local13, 66560, local8);
			this.method1046(local13 - 1, 4096, local8);
			this.method1046(local13, 16384, local8 + 1);
		}
		if (arg1 == 1) {
			this.method1046(local13, 5120, local8);
			this.method1046(local13, 16384, local8 + 1);
			this.method1046(local13 + 1, 65536, local8);
		}
		if (arg1 == 2) {
			this.method1046(local13, 20480, local8);
			this.method1046(local13 + 1, 65536, local8);
			this.method1046(local13, 1024, local8 - 1);
		}
		if (arg1 == 3) {
			this.method1046(local13, 81920, local8);
			this.method1046(local13, 1024, local8 - 1);
			this.method1046(local13 - 1, 4096, local8);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == arg1 && arg2 == arg0) {
			return true;
		}
		@Pc(28) int local28 = arg2 - this.anInt1401;
		@Pc(33) int local33 = arg1 - this.anInt1389;
		@Pc(38) int local38 = arg0 - this.anInt1401;
		@Pc(43) int local43 = arg4 - this.anInt1389;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local43 + 1 == local33 && local38 == local28 && (this.anIntArrayArray8[local33][local38] & 0x80) == 0) {
					return true;
				}
				if (local43 == local33 && local28 - 1 == local38 && (this.anIntArrayArray8[local33][local38] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local33 == local43 - 1 && local28 == local38 && (this.anIntArrayArray8[local33][local38] & 0x8) == 0) {
					return true;
				}
				if (local33 == local43 && local28 - 1 == local38 && (this.anIntArrayArray8[local33][local38] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local33 == local43 - 1 && local28 == local38 && (this.anIntArrayArray8[local33][local38] & 0x8) == 0) {
					return true;
				}
				if (local33 == local43 && local28 + 1 == local38 && (this.anIntArrayArray8[local33][local38] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local33 == local43 + 1 && local28 == local38 && (this.anIntArrayArray8[local33][local38] & 0x80) == 0) {
					return true;
				}
				if (local33 == local43 && local38 == local28 + 1 && (this.anIntArrayArray8[local33][local38] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local33 == local43 && local28 + 1 == local38 && (this.anIntArrayArray8[local33][local38] & 0x20) == 0) {
				return true;
			}
			if (local43 == local33 && local38 == local28 - 1 && (this.anIntArrayArray8[local33][local38] & 0x2) == 0) {
				return true;
			}
			if (local33 == local43 - 1 && local28 == local38 && (this.anIntArrayArray8[local33][local38] & 0x8) == 0) {
				return true;
			}
			if (local33 == local43 + 1 && local28 == local38 && (this.anIntArrayArray8[local33][local38] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIZII)V")
	public void method1041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 - this.anInt1401;
		@Pc(19) int local19 = arg2 - this.anInt1389;
		@Pc(27) int local27;
		if (arg4 == 1 || arg4 == 3) {
			local27 = arg1;
			arg1 = arg5;
			arg5 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg3) {
			local33 = 131328;
		}
		for (local27 = local19; local27 < local19 + arg1; local27++) {
			if (local27 >= 0 && local27 < this.anInt1404) {
				for (@Pc(54) int local54 = local14; local54 < local14 + arg5; local54++) {
					if (local54 >= 0 && this.anInt1399 > local54) {
						this.method1045(local54, local27, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
	public void method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt1389;
		@Pc(21) int local21 = arg1 - this.anInt1401;
		this.anIntArrayArray8[local16][local21] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(III)V")
	public void method1043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - this.anInt1389;
		@Pc(16) int local16 = arg0 - this.anInt1401;
		this.anIntArrayArray8[local11][local16] |= 0x200000;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public void method1044() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1404; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1399; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt1404 - 5 || local15 >= this.anInt1399 - 5) {
					this.anIntArrayArray8[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray8[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
	private void method1045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray8[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIII)V")
	private void method1046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray8[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg0 - 1;
		@Pc(15) int local15 = arg3 + arg1 - 1;
		if (arg0 <= arg6 && arg6 <= local9 && arg1 <= arg2 && arg2 <= local15) {
			return true;
		} else if (arg6 == arg0 - 1 && arg2 >= arg1 && arg2 <= local15 && (this.anIntArrayArray8[arg6 - this.anInt1389][arg2 - this.anInt1401] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg6 && arg2 >= arg1 && arg2 <= local15 && (this.anIntArrayArray8[arg6 - this.anInt1389][arg2 - this.anInt1401] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg2 && arg6 >= arg0 && arg6 <= local9 && (this.anIntArrayArray8[arg6 - this.anInt1389][arg2 - this.anInt1401] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local15 + 1 == arg2 && arg0 <= arg6 && local9 >= arg6 && (this.anIntArrayArray8[arg6 - this.anInt1389][arg2 - this.anInt1401] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIII)V")
	public void method1048(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg1 - this.anInt1389;
		@Pc(15) int local15 = arg2 - this.anInt1401;
		@Pc(17) int local17 = 256;
		if (arg0) {
			local17 = 131328;
		}
		for (@Pc(25) int local25 = local10; local25 < arg4 + local10; local25++) {
			if (local25 >= 0 && local25 < this.anInt1404) {
				for (@Pc(38) int local38 = local15; local38 < arg3 + local15; local38++) {
					if (local38 >= 0 && local38 < this.anInt1399) {
						this.method1046(local25, local17, local38);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIZZI)V")
	public void method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1389;
		@Pc(9) int local9 = arg4 - this.anInt1401;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method1045(local9, local4, 128);
				this.method1045(local9, local4 - 1, 8);
			}
			if (arg1 == 1) {
				this.method1045(local9, local4, 2);
				this.method1045(local9 + 1, local4, 32);
			}
			if (arg1 == 2) {
				this.method1045(local9, local4, 8);
				this.method1045(local9, local4 + 1, 128);
			}
			if (arg1 == 3) {
				this.method1045(local9, local4, 32);
				this.method1045(local9 - 1, local4, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method1045(local9, local4, 1);
				this.method1045(local9 + 1, local4 + -1, 16);
			}
			if (arg1 == 1) {
				this.method1045(local9, local4, 4);
				this.method1045(local9 + 1, local4 - -1, 64);
			}
			if (arg1 == 2) {
				this.method1045(local9, local4, 16);
				this.method1045(local9 - 1, local4 + 1, 1);
			}
			if (arg1 == 3) {
				this.method1045(local9, local4, 64);
				this.method1045(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method1045(local9, local4, 130);
				this.method1045(local9, local4 - 1, 8);
				this.method1045(local9 + 1, local4, 32);
			}
			if (arg1 == 1) {
				this.method1045(local9, local4, 10);
				this.method1045(local9 + 1, local4, 32);
				this.method1045(local9, local4 + 1, 128);
			}
			if (arg1 == 2) {
				this.method1045(local9, local4, 40);
				this.method1045(local9, local4 + 1, 128);
				this.method1045(local9 - 1, local4, 2);
			}
			if (arg1 == 3) {
				this.method1045(local9, local4, 160);
				this.method1045(local9 - 1, local4, 2);
				this.method1045(local9, local4 - 1, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method1045(local9, local4, 65536);
				this.method1045(local9, local4 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method1045(local9, local4, 1024);
				this.method1045(local9 + 1, local4, 16384);
			}
			if (arg1 == 2) {
				this.method1045(local9, local4, 4096);
				this.method1045(local9, local4 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method1045(local9, local4, 16384);
				this.method1045(local9 - 1, local4, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method1045(local9, local4, 512);
				this.method1045(local9 + 1, local4 + -1, 8192);
			}
			if (arg1 == 1) {
				this.method1045(local9, local4, 2048);
				this.method1045(local9 + 1, local4 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method1045(local9, local4, 8192);
				this.method1045(local9 - 1, local4 + 1, 512);
			}
			if (arg1 == 3) {
				this.method1045(local9, local4, 32768);
				this.method1045(local9 - 1, local4 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1045(local9, local4, 66560);
			this.method1045(local9, local4 - 1, 4096);
			this.method1045(local9 + 1, local4, 16384);
		}
		if (arg1 == 1) {
			this.method1045(local9, local4, 5120);
			this.method1045(local9 + 1, local4, 16384);
			this.method1045(local9, local4 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method1045(local9, local4, 20480);
			this.method1045(local9, local4 + 1, 65536);
			this.method1045(local9 - 1, local4, 1024);
		}
		if (arg1 == 3) {
			this.method1045(local9, local4, 81920);
			this.method1045(local9 - 1, local4, 1024);
			this.method1045(local9, local4 - 1, 4096);
			return;
		}
	}
}

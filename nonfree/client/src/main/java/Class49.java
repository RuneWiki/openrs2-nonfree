import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class49 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	private final int anInt1798;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	private final int anInt1815;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	private final int anInt1804;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "I")
	private final int anInt1820;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "[[I")
	public final int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1798 = arg0;
		this.anInt1815 = 0;
		this.anInt1804 = 0;
		this.anInt1820 = arg1;
		this.anIntArrayArray58 = new int[this.anInt1798][this.anInt1820];
		this.method1327();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIBZ)V")
	public void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(15) int local15 = arg2 - this.anInt1804;
		@Pc(17) int local17 = 256;
		@Pc(22) int local22 = arg0 - this.anInt1815;
		@Pc(32) int local32;
		if (arg1 == 1 || arg1 == 3) {
			local32 = arg4;
			arg4 = arg3;
			arg3 = local32;
		}
		if (arg5) {
			local17 = 131328;
		}
		for (local32 = local22; local32 < local22 + arg4; local32++) {
			if (local32 >= 0 && this.anInt1798 > local32) {
				for (@Pc(61) int local61 = local15; local61 < local15 + arg3; local61++) {
					if (local61 >= 0 && local61 < this.anInt1820) {
						this.method1320(local61, local32, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public void method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1804;
		@Pc(13) int local13 = arg0 - this.anInt1815;
		this.anIntArrayArray58[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZB)V")
	public void method1319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(10) int local10 = arg1 - this.anInt1815;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg4 - this.anInt1804;
		if (arg3 == 1 || arg3 == 3) {
			@Pc(25) int local25 = arg2;
			arg2 = arg0;
			arg0 = local25;
		}
		if (arg5) {
			local12 = 131328;
		}
		for (@Pc(45) int local45 = local10; local45 < arg2 + local10; local45++) {
			if (local45 >= 0 && local45 < this.anInt1798) {
				for (@Pc(62) int local62 = local17; local62 < local17 + arg0; local62++) {
					if (local62 >= 0 && local62 < this.anInt1820) {
						this.method1321(local12, local45, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
	private void method1320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray58[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IIII)V")
	private void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray58[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZI)V")
	public void method1322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1804;
		@Pc(9) int local9 = arg0 - this.anInt1815;
		this.anIntArrayArray58[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg3 && arg0 == arg1) {
			return true;
		}
		@Pc(24) int local24 = arg0 - this.anInt1804;
		@Pc(29) int local29 = arg4 - this.anInt1815;
		@Pc(34) int local34 = arg3 - this.anInt1815;
		@Pc(39) int local39 = arg1 - this.anInt1804;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local34 == local29 + 1 && local24 == local39 && (this.anIntArrayArray58[local34][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local39 - 1 && (this.anIntArrayArray58[local34][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local29 - 1 == local34 && local24 == local39 && (this.anIntArrayArray58[local34][local24] & 0x8) == 0) {
					return true;
				}
				if (local34 == local29 && local39 - 1 == local24 && (this.anIntArrayArray58[local34][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local34 == local29 - 1 && local39 == local24 && (this.anIntArrayArray58[local34][local24] & 0x8) == 0) {
					return true;
				}
				if (local29 == local34 && local39 + 1 == local24 && (this.anIntArrayArray58[local34][local24] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local34 == local29 + 1 && local39 == local24 && (this.anIntArrayArray58[local34][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local39 + 1 && (this.anIntArrayArray58[local34][local24] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local29 == local34 && local24 == local39 + 1 && (this.anIntArrayArray58[local34][local24] & 0x20) == 0) {
				return true;
			}
			if (local34 == local29 && local39 - 1 == local24 && (this.anIntArrayArray58[local34][local24] & 0x2) == 0) {
				return true;
			}
			if (local29 - 1 == local34 && local24 == local39 && (this.anIntArrayArray58[local34][local24] & 0x8) == 0) {
				return true;
			}
			if (local34 == local29 + 1 && local39 == local24 && (this.anIntArrayArray58[local34][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg4 && arg3 == arg1) {
			return true;
		}
		@Pc(29) int local29 = arg5 - this.anInt1815;
		@Pc(34) int local34 = arg1 - this.anInt1804;
		@Pc(39) int local39 = arg3 - this.anInt1804;
		@Pc(44) int local44 = arg4 - this.anInt1815;
		if (arg0 == 0) {
			if (arg2 == 0) {
				if (local29 - 1 == local44 && local39 == local34) {
					return true;
				}
				if (local29 == local44 && local34 == local39 + 1 && (this.anIntArrayArray58[local44][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local44 == local29 && local39 - 1 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local29 == local44 && local39 + 1 == local34) {
					return true;
				}
				if (local44 == local29 - 1 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 + 1 == local44 && local39 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local29 + 1 == local44 && local34 == local39) {
					return true;
				}
				if (local29 == local44 && local34 == local39 + 1 && (this.anIntArrayArray58[local44][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local44 == local29 && local39 - 1 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local29 == local44 && local39 - 1 == local34) {
					return true;
				}
				if (local44 == local29 - 1 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local44 == local29 + 1 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				if (local44 == local29 - 1 && local39 == local34) {
					return true;
				}
				if (local44 == local29 && local39 + 1 == local34) {
					return true;
				}
				if (local44 == local29 + 1 && local39 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0180) == 0) {
					return true;
				}
				if (local44 == local29 && local39 - 1 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local29 - 1 == local44 && local39 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local44 == local29 && local39 + 1 == local34) {
					return true;
				}
				if (local44 == local29 + 1 && local34 == local39) {
					return true;
				}
				if (local44 == local29 && local34 == local39 - 1 && (this.anIntArrayArray58[local44][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local29 - 1 == local44 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local44 && local39 + 1 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local44 == local29 + 1 && local39 == local34) {
					return true;
				}
				if (local29 == local44 && local39 - 1 == local34) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local29 - 1 == local44 && local39 == local34) {
					return true;
				}
				if (local29 == local44 && local39 + 1 == local34 && (this.anIntArrayArray58[local44][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 + 1 == local44 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x12C0180) == 0) {
					return true;
				}
				if (local44 == local29 && local39 - 1 == local34) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local44 == local29 && local34 == local39 + 1 && (this.anIntArrayArray58[local44][local34] & 0x20) == 0) {
				return true;
			}
			if (local29 == local44 && local34 == local39 - 1 && (this.anIntArrayArray58[local44][local34] & 0x2) == 0) {
				return true;
			}
			if (local44 == local29 - 1 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x8) == 0) {
				return true;
			}
			if (local29 + 1 == local44 && local34 == local39 && (this.anIntArrayArray58[local44][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZII)V")
	public void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt1815;
		@Pc(13) int local13 = arg0 - this.anInt1804;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method1320(local13, local4, 128);
				this.method1320(local13, local4 - 1, 8);
			}
			if (arg2 == 1) {
				this.method1320(local13, local4, 2);
				this.method1320(local13 + 1, local4, 32);
			}
			if (arg2 == 2) {
				this.method1320(local13, local4, 8);
				this.method1320(local13, local4 + 1, 128);
			}
			if (arg2 == 3) {
				this.method1320(local13, local4, 32);
				this.method1320(local13 - 1, local4, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method1320(local13, local4, 1);
				this.method1320(local13 + 1, local4 + -1, 16);
			}
			if (arg2 == 1) {
				this.method1320(local13, local4, 4);
				this.method1320(local13 + 1, local4 - -1, 64);
			}
			if (arg2 == 2) {
				this.method1320(local13, local4, 16);
				this.method1320(local13 - 1, local4 - -1, 1);
			}
			if (arg2 == 3) {
				this.method1320(local13, local4, 64);
				this.method1320(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method1320(local13, local4, 130);
				this.method1320(local13, local4 - 1, 8);
				this.method1320(local13 + 1, local4, 32);
			}
			if (arg2 == 1) {
				this.method1320(local13, local4, 10);
				this.method1320(local13 + 1, local4, 32);
				this.method1320(local13, local4 + 1, 128);
			}
			if (arg2 == 2) {
				this.method1320(local13, local4, 40);
				this.method1320(local13, local4 + 1, 128);
				this.method1320(local13 - 1, local4, 2);
			}
			if (arg2 == 3) {
				this.method1320(local13, local4, 160);
				this.method1320(local13 - 1, local4, 2);
				this.method1320(local13, local4 - 1, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method1320(local13, local4, 65536);
				this.method1320(local13, local4 - 1, 4096);
			}
			if (arg2 == 1) {
				this.method1320(local13, local4, 1024);
				this.method1320(local13 + 1, local4, 16384);
			}
			if (arg2 == 2) {
				this.method1320(local13, local4, 4096);
				this.method1320(local13, local4 + 1, 65536);
			}
			if (arg2 == 3) {
				this.method1320(local13, local4, 16384);
				this.method1320(local13 - 1, local4, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method1320(local13, local4, 512);
				this.method1320(local13 + 1, local4 + -1, 8192);
			}
			if (arg2 == 1) {
				this.method1320(local13, local4, 2048);
				this.method1320(local13 + 1, local4 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method1320(local13, local4, 8192);
				this.method1320(local13 - 1, local4 + 1, 512);
			}
			if (arg2 == 3) {
				this.method1320(local13, local4, 32768);
				this.method1320(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1320(local13, local4, 66560);
			this.method1320(local13, local4 - 1, 4096);
			this.method1320(local13 + 1, local4, 16384);
		}
		if (arg2 == 1) {
			this.method1320(local13, local4, 5120);
			this.method1320(local13 + 1, local4, 16384);
			this.method1320(local13, local4 + 1, 65536);
		}
		if (arg2 == 2) {
			this.method1320(local13, local4, 20480);
			this.method1320(local13, local4 + 1, 65536);
			this.method1320(local13 - 1, local4, 1024);
		}
		if (arg2 == 3) {
			this.method1320(local13, local4, 81920);
			this.method1320(local13 - 1, local4, 1024);
			this.method1320(local13, local4 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public void method1327() {
		for (@Pc(16) int local16 = 0; local16 < this.anInt1798; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt1820; local20++) {
				if (local16 == 0 || local20 == 0 || this.anInt1798 - 5 <= local16 || this.anInt1820 - 5 <= local20) {
					this.anIntArrayArray58[local16][local20] = 16777215;
				} else {
					this.anIntArrayArray58[local16][local20] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)V")
	public void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1815;
		@Pc(9) int local9 = arg0 - this.anInt1804;
		this.anIntArrayArray58[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg2 + arg1 - 1;
		@Pc(23) int local23 = arg3 + arg6 - 1;
		if (arg0 >= arg3 && arg0 <= local23 && arg5 >= arg2 && local17 >= arg5) {
			return true;
		} else if (arg3 - 1 == arg0 && arg2 <= arg5 && arg5 <= local17 && (this.anIntArrayArray58[arg0 - this.anInt1815][arg5 - this.anInt1804] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local23 + 1 == arg0 && arg5 >= arg2 && local17 >= arg5 && (this.anIntArrayArray58[arg0 - this.anInt1815][arg5 - this.anInt1804] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg5 && arg0 >= arg3 && local23 >= arg0 && (this.anIntArrayArray58[arg0 - this.anInt1815][arg5 - this.anInt1804] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local17 + 1 == arg5 && arg3 <= arg0 && local23 >= arg0 && (this.anIntArrayArray58[arg0 - this.anInt1815][arg5 - this.anInt1804] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZIIII)V")
	public void method1331(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg3 - this.anInt1815;
		@Pc(19) int local19 = arg0 - this.anInt1804;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1321(128, local10, local19);
				this.method1321(8, local10 - 1, local19);
			}
			if (arg4 == 1) {
				this.method1321(2, local10, local19);
				this.method1321(32, local10, local19 + 1);
			}
			if (arg4 == 2) {
				this.method1321(8, local10, local19);
				this.method1321(128, local10 + 1, local19);
			}
			if (arg4 == 3) {
				this.method1321(32, local10, local19);
				this.method1321(2, local10, local19 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1321(1, local10, local19);
				this.method1321(16, local10 - 1, local19 + 1);
			}
			if (arg4 == 1) {
				this.method1321(4, local10, local19);
				this.method1321(64, local10 + 1, local19 - -1);
			}
			if (arg4 == 2) {
				this.method1321(16, local10, local19);
				this.method1321(1, local10 + 1, local19 - 1);
			}
			if (arg4 == 3) {
				this.method1321(64, local10, local19);
				this.method1321(4, local10 - 1, local19 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method1321(130, local10, local19);
				this.method1321(8, local10 - 1, local19);
				this.method1321(32, local10, local19 + 1);
			}
			if (arg4 == 1) {
				this.method1321(10, local10, local19);
				this.method1321(32, local10, local19 + 1);
				this.method1321(128, local10 + 1, local19);
			}
			if (arg4 == 2) {
				this.method1321(40, local10, local19);
				this.method1321(128, local10 + 1, local19);
				this.method1321(2, local10, local19 - 1);
			}
			if (arg4 == 3) {
				this.method1321(160, local10, local19);
				this.method1321(2, local10, local19 - 1);
				this.method1321(8, local10 - 1, local19);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method1321(65536, local10, local19);
				this.method1321(4096, local10 - 1, local19);
			}
			if (arg4 == 1) {
				this.method1321(1024, local10, local19);
				this.method1321(16384, local10, local19 + 1);
			}
			if (arg4 == 2) {
				this.method1321(4096, local10, local19);
				this.method1321(65536, local10 + 1, local19);
			}
			if (arg4 == 3) {
				this.method1321(16384, local10, local19);
				this.method1321(1024, local10, local19 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method1321(512, local10, local19);
				this.method1321(8192, local10 - 1, local19 + 1);
			}
			if (arg4 == 1) {
				this.method1321(2048, local10, local19);
				this.method1321(32768, local10 + 1, local19 + 1);
			}
			if (arg4 == 2) {
				this.method1321(8192, local10, local19);
				this.method1321(512, local10 + 1, local19 + -1);
			}
			if (arg4 == 3) {
				this.method1321(32768, local10, local19);
				this.method1321(2048, local10 - 1, local19 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1321(66560, local10, local19);
			this.method1321(4096, local10 - 1, local19);
			this.method1321(16384, local10, local19 + 1);
		}
		if (arg4 == 1) {
			this.method1321(5120, local10, local19);
			this.method1321(16384, local10, local19 + 1);
			this.method1321(65536, local10 + 1, local19);
		}
		if (arg4 == 2) {
			this.method1321(20480, local10, local19);
			this.method1321(65536, local10 + 1, local19);
			this.method1321(1024, local10, local19 - 1);
		}
		if (arg4 == 3) {
			this.method1321(81920, local10, local19);
			this.method1321(1024, local10, local19 - 1);
			this.method1321(4096, local10 - 1, local19);
			return;
		}
	}
}

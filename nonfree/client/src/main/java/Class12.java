import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class12 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private final int anInt334;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	private final int anInt332;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "[[I")
	public final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private final int anInt338;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	private final int anInt347;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt334 = arg0;
		this.anInt332 = arg1;
		this.anIntArrayArray6 = new int[this.anInt334][this.anInt332];
		this.anInt338 = 0;
		this.anInt347 = 0;
		this.method262();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
	public void method250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt347;
		@Pc(25) int local25 = arg1 - this.anInt338;
		this.anIntArrayArray6[local16][local25] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIIII)V")
	public void method251(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt338;
		@Pc(16) int local16;
		if (arg2 == 1 || arg2 == 3) {
			local16 = arg4;
			arg4 = arg5;
			arg5 = local16;
		}
		@Pc(29) int local29 = arg3 - this.anInt347;
		@Pc(31) int local31 = 256;
		if (arg1) {
			local31 = 131328;
		}
		for (local16 = local29; local16 < local29 + arg4; local16++) {
			if (local16 >= 0 && local16 < this.anInt334) {
				for (@Pc(52) int local52 = local6; local52 < arg5 + local6; local52++) {
					if (local52 >= 0 && this.anInt332 > local52) {
						this.method253(local52, local16, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZI)V")
	public void method252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - this.anInt347;
		@Pc(8) int local8 = 256;
		@Pc(13) int local13 = arg3 - this.anInt338;
		@Pc(27) int local27;
		if (arg0 == 1 || arg0 == 3) {
			local27 = arg5;
			arg5 = arg1;
			arg1 = local27;
		}
		if (arg4) {
			local8 = 131328;
		}
		for (local27 = local6; local27 < local6 + arg5; local27++) {
			if (local27 >= 0 && this.anInt334 > local27) {
				for (@Pc(57) int local57 = local13; local57 < local13 + arg1; local57++) {
					if (local57 >= 0 && this.anInt332 > local57) {
						this.method254(local27, local8, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)V")
	private void method253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray6[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(BIII)V")
	private void method254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray6[arg0][arg2] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg1 + arg5 - 1;
		@Pc(15) int local15 = arg2 + arg0 - 1;
		if (arg5 <= arg4 && arg4 <= local5 && arg3 >= arg0 && arg3 <= local15) {
			return true;
		} else if (arg5 - 1 == arg4 && arg3 >= arg0 && local15 >= arg3 && (this.anIntArrayArray6[arg4 - this.anInt347][arg3 - this.anInt338] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg4 == local5 + 1 && arg0 <= arg3 && local15 >= arg3 && (this.anIntArrayArray6[arg4 - this.anInt347][arg3 - this.anInt338] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg0 - 1 && arg4 >= arg5 && local5 >= arg4 && (this.anIntArrayArray6[arg4 - this.anInt347][arg3 - this.anInt338] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local15 + 1 && arg5 <= arg4 && local5 >= arg4 && (this.anIntArrayArray6[arg4 - this.anInt347][arg3 - this.anInt338] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg2 && arg5 == arg0) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt347;
		@Pc(25) int local25 = arg4 - this.anInt347;
		@Pc(30) int local30 = arg5 - this.anInt338;
		@Pc(43) int local43 = arg0 - this.anInt338;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (local25 - 1 == local20 && local30 == local43) {
					return true;
				}
				if (local20 == local25 && local30 + 1 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 && local43 == local30 - 1 && (this.anIntArrayArray6[local20][local43] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local20 == local25 && local30 + 1 == local43) {
					return true;
				}
				if (local25 - 1 == local20 && local30 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local43 == local30 && (this.anIntArrayArray6[local20][local43] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local20 == local25 + 1 && local43 == local30) {
					return true;
				}
				if (local25 == local20 && local43 == local30 + 1 && (this.anIntArrayArray6[local20][local43] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 && local30 - 1 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local25 == local20 && local30 - 1 == local43) {
					return true;
				}
				if (local20 == local25 - 1 && local43 == local30 && (this.anIntArrayArray6[local20][local43] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local43 == local30 && (this.anIntArrayArray6[local20][local43] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				if (local25 - 1 == local20 && local30 == local43) {
					return true;
				}
				if (local25 == local20 && local30 + 1 == local43) {
					return true;
				}
				if (local25 + 1 == local20 && local43 == local30 && (this.anIntArrayArray6[local20][local43] & 0x1280180) == 0) {
					return true;
				}
				if (local20 == local25 && local30 - 1 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local25 - 1 == local20 && local43 == local30 && (this.anIntArrayArray6[local20][local43] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local25 && local43 == local30 + 1) {
					return true;
				}
				if (local20 == local25 + 1 && local30 == local43) {
					return true;
				}
				if (local25 == local20 && local43 == local30 - 1 && (this.anIntArrayArray6[local20][local43] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local25 - 1 == local20 && local30 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local20 && local30 + 1 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280120) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local30 == local43) {
					return true;
				}
				if (local20 == local25 && local43 == local30 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local25 - 1 == local20 && local43 == local30) {
					return true;
				}
				if (local20 == local25 && local43 == local30 + 1 && (this.anIntArrayArray6[local20][local43] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local30 == local43 && (this.anIntArrayArray6[local20][local43] & 0x1280180) == 0) {
					return true;
				}
				if (local25 == local20 && local43 == local30 - 1) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local25 == local20 && local30 + 1 == local43 && (this.anIntArrayArray6[local20][local43] & 0x20) == 0) {
				return true;
			}
			if (local25 == local20 && local30 - 1 == local43 && (this.anIntArrayArray6[local20][local43] & 0x2) == 0) {
				return true;
			}
			if (local20 == local25 - 1 && local43 == local30 && (this.anIntArrayArray6[local20][local43] & 0x8) == 0) {
				return true;
			}
			if (local25 + 1 == local20 && local30 == local43 && (this.anIntArrayArray6[local20][local43] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIIII)V")
	public void method257(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt347;
		@Pc(9) int local9 = arg4 - this.anInt338;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method254(local4, 128, local9);
				this.method254(local4 - 1, 8, local9);
			}
			if (arg2 == 1) {
				this.method254(local4, 2, local9);
				this.method254(local4, 32, local9 + 1);
			}
			if (arg2 == 2) {
				this.method254(local4, 8, local9);
				this.method254(local4 + 1, 128, local9);
			}
			if (arg2 == 3) {
				this.method254(local4, 32, local9);
				this.method254(local4, 2, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method254(local4, 1, local9);
				this.method254(local4 - 1, 16, local9 + 1);
			}
			if (arg2 == 1) {
				this.method254(local4, 4, local9);
				this.method254(local4 + 1, 64, local9 + 1);
			}
			if (arg2 == 2) {
				this.method254(local4, 16, local9);
				this.method254(local4 + 1, 1, local9 - 1);
			}
			if (arg2 == 3) {
				this.method254(local4, 64, local9);
				this.method254(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method254(local4, 130, local9);
				this.method254(local4 - 1, 8, local9);
				this.method254(local4, 32, local9 + 1);
			}
			if (arg2 == 1) {
				this.method254(local4, 10, local9);
				this.method254(local4, 32, local9 + 1);
				this.method254(local4 + 1, 128, local9);
			}
			if (arg2 == 2) {
				this.method254(local4, 40, local9);
				this.method254(local4 + 1, 128, local9);
				this.method254(local4, 2, local9 - 1);
			}
			if (arg2 == 3) {
				this.method254(local4, 160, local9);
				this.method254(local4, 2, local9 - 1);
				this.method254(local4 - 1, 8, local9);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method254(local4, 65536, local9);
				this.method254(local4 - 1, 4096, local9);
			}
			if (arg2 == 1) {
				this.method254(local4, 1024, local9);
				this.method254(local4, 16384, local9 + 1);
			}
			if (arg2 == 2) {
				this.method254(local4, 4096, local9);
				this.method254(local4 + 1, 65536, local9);
			}
			if (arg2 == 3) {
				this.method254(local4, 16384, local9);
				this.method254(local4, 1024, local9 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method254(local4, 512, local9);
				this.method254(local4 - 1, 8192, local9 + 1);
			}
			if (arg2 == 1) {
				this.method254(local4, 2048, local9);
				this.method254(local4 + 1, 32768, local9 + 1);
			}
			if (arg2 == 2) {
				this.method254(local4, 8192, local9);
				this.method254(local4 + 1, 512, local9 - 1);
			}
			if (arg2 == 3) {
				this.method254(local4, 32768, local9);
				this.method254(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method254(local4, 66560, local9);
			this.method254(local4 - 1, 4096, local9);
			this.method254(local4, 16384, local9 + 1);
		}
		if (arg2 == 1) {
			this.method254(local4, 5120, local9);
			this.method254(local4, 16384, local9 + 1);
			this.method254(local4 + 1, 65536, local9);
		}
		if (arg2 == 2) {
			this.method254(local4, 20480, local9);
			this.method254(local4 + 1, 65536, local9);
			this.method254(local4, 1024, local9 - 1);
		}
		if (arg2 == 3) {
			this.method254(local4, 81920, local9);
			this.method254(local4, 1024, local9 - 1);
			this.method254(local4 - 1, 4096, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg2 && arg4 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt338;
		@Pc(25) int local25 = arg2 - this.anInt347;
		@Pc(30) int local30 = arg3 - this.anInt338;
		@Pc(35) int local35 = arg1 - this.anInt347;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local25 + 1 == local35 && local30 == local20 && (this.anIntArrayArray6[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local35 == local25 && local20 == local30 - 1 && (this.anIntArrayArray6[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local25 - 1 == local35 && local30 == local20 && (this.anIntArrayArray6[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local25 == local35 && local30 - 1 == local20 && (this.anIntArrayArray6[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local25 - 1 == local35 && local20 == local30 && (this.anIntArrayArray6[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local25 == local35 && local30 + 1 == local20 && (this.anIntArrayArray6[local35][local20] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local35 == local25 + 1 && local30 == local20 && (this.anIntArrayArray6[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local35 == local25 && local30 + 1 == local20 && (this.anIntArrayArray6[local35][local20] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local35 == local25 && local30 + 1 == local20 && (this.anIntArrayArray6[local35][local20] & 0x20) == 0) {
				return true;
			}
			if (local35 == local25 && local20 == local30 - 1 && (this.anIntArrayArray6[local35][local20] & 0x2) == 0) {
				return true;
			}
			if (local25 - 1 == local35 && local20 == local30 && (this.anIntArrayArray6[local35][local20] & 0x8) == 0) {
				return true;
			}
			if (local35 == local25 + 1 && local20 == local30 && (this.anIntArrayArray6[local35][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method262() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt334; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt332; local15++) {
				if (local11 == 0 || local15 == 0 || local11 == this.anInt334 - 1 || local15 == this.anInt332 - 1) {
					this.anIntArrayArray6[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray6[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public void method263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 - this.anInt338;
		@Pc(23) int local23 = arg0 - this.anInt347;
		this.anIntArrayArray6[local23][local18] |= 0x200000;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZIB)V")
	public void method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt347;
		@Pc(17) int local17 = arg2 - this.anInt338;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method253(local17, local4, 128);
				this.method253(local17, local4 - 1, 8);
			}
			if (arg4 == 1) {
				this.method253(local17, local4, 2);
				this.method253(local17 + 1, local4, 32);
			}
			if (arg4 == 2) {
				this.method253(local17, local4, 8);
				this.method253(local17, local4 + 1, 128);
			}
			if (arg4 == 3) {
				this.method253(local17, local4, 32);
				this.method253(local17 - 1, local4, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method253(local17, local4, 1);
				this.method253(local17 + 1, local4 + -1, 16);
			}
			if (arg4 == 1) {
				this.method253(local17, local4, 4);
				this.method253(local17 + 1, local4 + 1, 64);
			}
			if (arg4 == 2) {
				this.method253(local17, local4, 16);
				this.method253(local17 - 1, local4 + 1, 1);
			}
			if (arg4 == 3) {
				this.method253(local17, local4, 64);
				this.method253(local17 - 1, local4 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method253(local17, local4, 130);
				this.method253(local17, local4 - 1, 8);
				this.method253(local17 + 1, local4, 32);
			}
			if (arg4 == 1) {
				this.method253(local17, local4, 10);
				this.method253(local17 + 1, local4, 32);
				this.method253(local17, local4 + 1, 128);
			}
			if (arg4 == 2) {
				this.method253(local17, local4, 40);
				this.method253(local17, local4 + 1, 128);
				this.method253(local17 - 1, local4, 2);
			}
			if (arg4 == 3) {
				this.method253(local17, local4, 160);
				this.method253(local17 - 1, local4, 2);
				this.method253(local17, local4 - 1, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method253(local17, local4, 65536);
				this.method253(local17, local4 - 1, 4096);
			}
			if (arg4 == 1) {
				this.method253(local17, local4, 1024);
				this.method253(local17 + 1, local4, 16384);
			}
			if (arg4 == 2) {
				this.method253(local17, local4, 4096);
				this.method253(local17, local4 + 1, 65536);
			}
			if (arg4 == 3) {
				this.method253(local17, local4, 16384);
				this.method253(local17 - 1, local4, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method253(local17, local4, 512);
				this.method253(local17 + 1, local4 - 1, 8192);
			}
			if (arg4 == 1) {
				this.method253(local17, local4, 2048);
				this.method253(local17 + 1, local4 + 1, 32768);
			}
			if (arg4 == 2) {
				this.method253(local17, local4, 8192);
				this.method253(local17 - 1, local4 - -1, 512);
			}
			if (arg4 == 3) {
				this.method253(local17, local4, 32768);
				this.method253(local17 - 1, local4 + -1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method253(local17, local4, 66560);
			this.method253(local17, local4 - 1, 4096);
			this.method253(local17 + 1, local4, 16384);
		}
		if (arg4 == 1) {
			this.method253(local17, local4, 5120);
			this.method253(local17 + 1, local4, 16384);
			this.method253(local17, local4 + 1, 65536);
		}
		if (arg4 == 2) {
			this.method253(local17, local4, 20480);
			this.method253(local17, local4 + 1, 65536);
			this.method253(local17 - 1, local4, 1024);
		}
		if (arg4 == 3) {
			this.method253(local17, local4, 81920);
			this.method253(local17 - 1, local4, 1024);
			this.method253(local17, local4 - 1, 4096);
			return;
		}
	}
}

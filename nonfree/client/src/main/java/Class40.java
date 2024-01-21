import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class40 {

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	private final int anInt1270 = 0;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	private final int anInt1259;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	private final int anInt1271;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	private final int anInt1257;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1259 = arg0;
		this.anInt1271 = arg1;
		this.anInt1257 = 0;
		this.anIntArrayArray16 = new int[this.anInt1259][this.anInt1271];
		this.method882();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
	public void method877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt1270;
		@Pc(21) int local21 = arg0 - this.anInt1257;
		this.anIntArrayArray16[local16][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIII)V")
	public void method879(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - this.anInt1257;
		@Pc(13) int local13 = arg2 - this.anInt1270;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method881(local13, local8, 128);
				this.method881(local13 - 1, local8, 8);
			}
			if (arg3 == 1) {
				this.method881(local13, local8, 2);
				this.method881(local13, local8 + 1, 32);
			}
			if (arg3 == 2) {
				this.method881(local13, local8, 8);
				this.method881(local13 + 1, local8, 128);
			}
			if (arg3 == 3) {
				this.method881(local13, local8, 32);
				this.method881(local13, local8 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method881(local13, local8, 1);
				this.method881(local13 - 1, local8 + 1, 16);
			}
			if (arg3 == 1) {
				this.method881(local13, local8, 4);
				this.method881(local13 + 1, local8 - -1, 64);
			}
			if (arg3 == 2) {
				this.method881(local13, local8, 16);
				this.method881(local13 + 1, local8 + -1, 1);
			}
			if (arg3 == 3) {
				this.method881(local13, local8, 64);
				this.method881(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method881(local13, local8, 130);
				this.method881(local13 - 1, local8, 8);
				this.method881(local13, local8 + 1, 32);
			}
			if (arg3 == 1) {
				this.method881(local13, local8, 10);
				this.method881(local13, local8 + 1, 32);
				this.method881(local13 + 1, local8, 128);
			}
			if (arg3 == 2) {
				this.method881(local13, local8, 40);
				this.method881(local13 + 1, local8, 128);
				this.method881(local13, local8 - 1, 2);
			}
			if (arg3 == 3) {
				this.method881(local13, local8, 160);
				this.method881(local13, local8 - 1, 2);
				this.method881(local13 - 1, local8, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method881(local13, local8, 65536);
				this.method881(local13 - 1, local8, 4096);
			}
			if (arg3 == 1) {
				this.method881(local13, local8, 1024);
				this.method881(local13, local8 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method881(local13, local8, 4096);
				this.method881(local13 + 1, local8, 65536);
			}
			if (arg3 == 3) {
				this.method881(local13, local8, 16384);
				this.method881(local13, local8 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method881(local13, local8, 512);
				this.method881(local13 - 1, local8 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method881(local13, local8, 2048);
				this.method881(local13 + 1, local8 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method881(local13, local8, 8192);
				this.method881(local13 + 1, local8 - 1, 512);
			}
			if (arg3 == 3) {
				this.method881(local13, local8, 32768);
				this.method881(local13 - 1, local8 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method881(local13, local8, 66560);
			this.method881(local13 - 1, local8, 4096);
			this.method881(local13, local8 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method881(local13, local8, 5120);
			this.method881(local13, local8 + 1, 16384);
			this.method881(local13 + 1, local8, 65536);
		}
		if (arg3 == 2) {
			this.method881(local13, local8, 20480);
			this.method881(local13 + 1, local8, 65536);
			this.method881(local13, local8 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method881(local13, local8, 81920);
			this.method881(local13, local8 - 1, 1024);
			this.method881(local13 - 1, local8, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 + arg2 - 1;
		@Pc(16) int local16 = arg3 + arg5 - 1;
		if (arg0 <= arg6 && arg6 <= local9 && arg1 >= arg3 && local16 >= arg1) {
			return true;
		} else if (arg6 == arg0 - 1 && arg3 <= arg1 && local16 >= arg1 && (this.anIntArrayArray16[arg6 - this.anInt1270][arg1 - this.anInt1257] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg6 == local9 + 1 && arg3 <= arg1 && arg1 <= local16 && (this.anIntArrayArray16[arg6 - this.anInt1270][arg1 - this.anInt1257] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg1 && arg6 >= arg0 && arg6 <= local9 && (this.anIntArrayArray16[arg6 - this.anInt1270][arg1 - this.anInt1257] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local16 + 1 == arg1 && arg0 <= arg6 && local9 >= arg6 && (this.anIntArrayArray16[arg6 - this.anInt1270][arg1 - this.anInt1257] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	private void method881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray16[arg0][arg1] &= 16777215 - arg2;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method882() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1259; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt1271; local19++) {
				if (local15 == 0 || local19 == 0 || local15 == this.anInt1259 - 1 || local19 == this.anInt1271 - 1) {
					this.anIntArrayArray16[local15][local19] = 16777215;
				} else {
					this.anIntArrayArray16[local15][local19] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZIIIII)V")
	public void method883(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt1270;
		@Pc(11) int local11 = arg2 - this.anInt1257;
		@Pc(13) int local13 = 256;
		@Pc(27) int local27;
		if (arg0 == 1 || arg0 == 3) {
			local27 = arg4;
			arg4 = arg3;
			arg3 = local27;
		}
		if (arg1) {
			local13 = 131328;
		}
		for (local27 = local6; local27 < local6 + arg4; local27++) {
			if (local27 >= 0 && this.anInt1259 > local27) {
				for (@Pc(52) int local52 = local11; local52 < arg3 + local11; local52++) {
					if (local52 >= 0 && this.anInt1271 > local52) {
						this.method881(local27, local52, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIBII)Z")
	public boolean method885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg0 && arg2 == arg5) {
			return true;
		}
		@Pc(24) int local24 = arg5 - this.anInt1257;
		@Pc(29) int local29 = arg2 - this.anInt1257;
		@Pc(34) int local34 = arg1 - this.anInt1270;
		@Pc(39) int local39 = arg0 - this.anInt1270;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local34 == local39 + 1 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x80) == 0) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray16[local34][local29] & 0x8) == 0) {
					return true;
				}
				if (local39 == local34 && local29 == local24 - 1 && (this.anIntArrayArray16[local34][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local34 == local39 - 1 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x8) == 0) {
					return true;
				}
				if (local34 == local39 && local29 == local24 + 1 && (this.anIntArrayArray16[local34][local29] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local34 == local39 + 1 && local24 == local29 && (this.anIntArrayArray16[local34][local29] & 0x80) == 0) {
					return true;
				}
				if (local39 == local34 && local24 + 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local34 == local39 && local29 == local24 + 1 && (this.anIntArrayArray16[local34][local29] & 0x20) == 0) {
				return true;
			}
			if (local39 == local34 && local29 == local24 - 1 && (this.anIntArrayArray16[local34][local29] & 0x2) == 0) {
				return true;
			}
			if (local39 - 1 == local34 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x8) == 0) {
				return true;
			}
			if (local39 + 1 == local34 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg2 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt1257;
		@Pc(29) int local29 = arg2 - this.anInt1257;
		@Pc(34) int local34 = arg3 - this.anInt1270;
		@Pc(39) int local39 = arg5 - this.anInt1270;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (local34 == local39 - 1 && local29 == local24) {
					return true;
				}
				if (local34 == local39 && local24 + 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local39 == local34 && local24 - 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local39 == local34 && local24 + 1 == local29) {
					return true;
				}
				if (local34 == local39 - 1 && local24 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local39 + 1 == local34 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local39 + 1 == local34 && local29 == local24) {
					return true;
				}
				if (local39 == local34 && local29 == local24 + 1 && (this.anIntArrayArray16[local34][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local39 == local34 && local24 - 1 == local29) {
					return true;
				}
				if (local34 == local39 - 1 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local39 + 1 == local34 && local24 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				if (local39 - 1 == local34 && local29 == local24) {
					return true;
				}
				if (local39 == local34 && local24 + 1 == local29) {
					return true;
				}
				if (local34 == local39 + 1 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x1280180) == 0) {
					return true;
				}
				if (local39 == local34 && local29 == local24 - 1 && (this.anIntArrayArray16[local34][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local39 - 1 == local34 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local39 && local24 + 1 == local29) {
					return true;
				}
				if (local34 == local39 + 1 && local24 == local29) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local34 == local39 - 1 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local34 && local24 + 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local39 + 1 && local29 == local24) {
					return true;
				}
				if (local34 == local39 && local29 == local24 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local39 - 1 == local34 && local24 == local29) {
					return true;
				}
				if (local34 == local39 && local24 + 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local39 + 1 && local24 == local29 && (this.anIntArrayArray16[local34][local29] & 0x1280180) == 0) {
					return true;
				}
				if (local34 == local39 && local24 - 1 == local29) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local34 == local39 && local29 == local24 + 1 && (this.anIntArrayArray16[local34][local29] & 0x20) == 0) {
				return true;
			}
			if (local34 == local39 && local24 - 1 == local29 && (this.anIntArrayArray16[local34][local29] & 0x2) == 0) {
				return true;
			}
			if (local39 - 1 == local34 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x8) == 0) {
				return true;
			}
			if (local39 + 1 == local34 && local29 == local24 && (this.anIntArrayArray16[local34][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBII)V")
	private void method889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray16[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)V")
	public void method890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1270;
		@Pc(13) int local13 = arg1 - this.anInt1257;
		this.anIntArrayArray16[local4][local13] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIBIIII)V")
	public void method891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		@Pc(29) int local29;
		if (arg3 == 1 || arg3 == 3) {
			local29 = arg5;
			arg5 = arg1;
			arg1 = local29;
		}
		@Pc(38) int local38 = arg2 - this.anInt1257;
		@Pc(43) int local43 = arg4 - this.anInt1270;
		if (arg0) {
			local7 = 131328;
		}
		for (local29 = local43; local29 < local43 + arg5; local29++) {
			if (local29 >= 0 && this.anInt1259 > local29) {
				for (@Pc(65) int local65 = local38; local65 < arg1 + local38; local65++) {
					if (local65 >= 0 && this.anInt1271 > local65) {
						this.method889(local7, local29, local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIIB)V")
	public void method892(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg2 - this.anInt1257;
		@Pc(13) int local13 = arg3 - this.anInt1270;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method889(128, local13, local8);
				this.method889(8, local13 - 1, local8);
			}
			if (arg1 == 1) {
				this.method889(2, local13, local8);
				this.method889(32, local13, local8 + 1);
			}
			if (arg1 == 2) {
				this.method889(8, local13, local8);
				this.method889(128, local13 + 1, local8);
			}
			if (arg1 == 3) {
				this.method889(32, local13, local8);
				this.method889(2, local13, local8 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method889(1, local13, local8);
				this.method889(16, local13 - 1, local8 + 1);
			}
			if (arg1 == 1) {
				this.method889(4, local13, local8);
				this.method889(64, local13 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method889(16, local13, local8);
				this.method889(1, local13 + 1, local8 + -1);
			}
			if (arg1 == 3) {
				this.method889(64, local13, local8);
				this.method889(4, local13 - 1, local8 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method889(130, local13, local8);
				this.method889(8, local13 - 1, local8);
				this.method889(32, local13, local8 + 1);
			}
			if (arg1 == 1) {
				this.method889(10, local13, local8);
				this.method889(32, local13, local8 + 1);
				this.method889(128, local13 + 1, local8);
			}
			if (arg1 == 2) {
				this.method889(40, local13, local8);
				this.method889(128, local13 + 1, local8);
				this.method889(2, local13, local8 - 1);
			}
			if (arg1 == 3) {
				this.method889(160, local13, local8);
				this.method889(2, local13, local8 - 1);
				this.method889(8, local13 - 1, local8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method889(65536, local13, local8);
				this.method889(4096, local13 - 1, local8);
			}
			if (arg1 == 1) {
				this.method889(1024, local13, local8);
				this.method889(16384, local13, local8 + 1);
			}
			if (arg1 == 2) {
				this.method889(4096, local13, local8);
				this.method889(65536, local13 + 1, local8);
			}
			if (arg1 == 3) {
				this.method889(16384, local13, local8);
				this.method889(1024, local13, local8 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method889(512, local13, local8);
				this.method889(8192, local13 - 1, local8 - -1);
			}
			if (arg1 == 1) {
				this.method889(2048, local13, local8);
				this.method889(32768, local13 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method889(8192, local13, local8);
				this.method889(512, local13 + 1, local8 - 1);
			}
			if (arg1 == 3) {
				this.method889(32768, local13, local8);
				this.method889(2048, local13 - 1, local8 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method889(66560, local13, local8);
			this.method889(4096, local13 - 1, local8);
			this.method889(16384, local13, local8 + 1);
		}
		if (arg1 == 1) {
			this.method889(5120, local13, local8);
			this.method889(16384, local13, local8 + 1);
			this.method889(65536, local13 + 1, local8);
		}
		if (arg1 == 2) {
			this.method889(20480, local13, local8);
			this.method889(65536, local13 + 1, local8);
			this.method889(1024, local13, local8 - 1);
		}
		if (arg1 == 3) {
			this.method889(81920, local13, local8);
			this.method889(1024, local13, local8 - 1);
			this.method889(4096, local13 - 1, local8);
		}
	}
}

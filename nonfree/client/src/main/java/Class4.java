import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	private final int anInt139 = 0;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	private final int anInt146 = 0;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	private final int anInt141;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	private final int anInt136;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt141 = arg1;
		this.anInt136 = arg0;
		this.anIntArrayArray3 = new int[this.anInt136][this.anInt141];
		this.method129();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg5 && arg2 == arg0) {
			return true;
		}
		@Pc(24) int local24 = arg5 - this.anInt139;
		@Pc(29) int local29 = arg2 - this.anInt146;
		@Pc(39) int local39 = arg0 - this.anInt146;
		@Pc(44) int local44 = arg4 - this.anInt139;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local24 + 1 == local44 && local39 == local29 && (this.anIntArrayArray3[local44][local29] & 0x80) == 0) {
					return true;
				}
				if (local44 == local24 && local39 - 1 == local29 && (this.anIntArrayArray3[local44][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local44 == local24 - 1 && local29 == local39 && (this.anIntArrayArray3[local44][local29] & 0x8) == 0) {
					return true;
				}
				if (local44 == local24 && local29 == local39 - 1 && (this.anIntArrayArray3[local44][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local44 == local24 - 1 && local29 == local39 && (this.anIntArrayArray3[local44][local29] & 0x8) == 0) {
					return true;
				}
				if (local24 == local44 && local29 == local39 + 1 && (this.anIntArrayArray3[local44][local29] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local24 + 1 == local44 && local39 == local29 && (this.anIntArrayArray3[local44][local29] & 0x80) == 0) {
					return true;
				}
				if (local24 == local44 && local39 + 1 == local29 && (this.anIntArrayArray3[local44][local29] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local24 == local44 && local29 == local39 + 1 && (this.anIntArrayArray3[local44][local29] & 0x20) == 0) {
				return true;
			}
			if (local24 == local44 && local39 - 1 == local29 && (this.anIntArrayArray3[local44][local29] & 0x2) == 0) {
				return true;
			}
			if (local44 == local24 - 1 && local29 == local39 && (this.anIntArrayArray3[local44][local29] & 0x8) == 0) {
				return true;
			}
			if (local24 + 1 == local44 && local29 == local39 && (this.anIntArrayArray3[local44][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == arg3 && arg1 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt139;
		@Pc(29) int local29 = arg3 - this.anInt139;
		@Pc(34) int local34 = arg2 - this.anInt146;
		@Pc(52) int local52 = arg1 - this.anInt146;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (local29 == local24 - 1 && local34 == local52) {
					return true;
				}
				if (local29 == local24 && local34 == local52 + 1 && (this.anIntArrayArray3[local29][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local24 == local29 && local52 - 1 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local29 == local24 && local52 + 1 == local34) {
					return true;
				}
				if (local24 - 1 == local29 && local34 == local52 && (this.anIntArrayArray3[local29][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local24 + 1 == local29 && local52 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local24 + 1 == local29 && local52 == local34) {
					return true;
				}
				if (local24 == local29 && local34 == local52 + 1 && (this.anIntArrayArray3[local29][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local24 && local34 == local52 - 1 && (this.anIntArrayArray3[local29][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local29 == local24 && local34 == local52 - 1) {
					return true;
				}
				if (local24 - 1 == local29 && local52 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local24 + 1 && local34 == local52 && (this.anIntArrayArray3[local29][local34] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				if (local29 == local24 - 1 && local34 == local52) {
					return true;
				}
				if (local29 == local24 && local34 == local52 + 1) {
					return true;
				}
				if (local29 == local24 + 1 && local52 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local24 && local34 == local52 - 1 && (this.anIntArrayArray3[local29][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local24 - 1 == local29 && local52 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local24 && local52 + 1 == local34) {
					return true;
				}
				if (local24 + 1 == local29 && local34 == local52) {
					return true;
				}
				if (local24 == local29 && local34 == local52 - 1 && (this.anIntArrayArray3[local29][local34] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local24 - 1 == local29 && local52 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local24 && local34 == local52 + 1 && (this.anIntArrayArray3[local29][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local24 + 1 == local29 && local34 == local52) {
					return true;
				}
				if (local24 == local29 && local52 - 1 == local34) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local29 == local24 - 1 && local52 == local34) {
					return true;
				}
				if (local24 == local29 && local52 + 1 == local34 && (this.anIntArrayArray3[local29][local34] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local24 + 1 && local34 == local52 && (this.anIntArrayArray3[local29][local34] & 0x1280180) == 0) {
					return true;
				}
				if (local24 == local29 && local34 == local52 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local24 == local29 && local52 + 1 == local34 && (this.anIntArrayArray3[local29][local34] & 0x20) == 0) {
				return true;
			}
			if (local24 == local29 && local52 - 1 == local34 && (this.anIntArrayArray3[local29][local34] & 0x2) == 0) {
				return true;
			}
			if (local29 == local24 - 1 && local34 == local52 && (this.anIntArrayArray3[local29][local34] & 0x8) == 0) {
				return true;
			}
			if (local29 == local24 + 1 && local34 == local52 && (this.anIntArrayArray3[local29][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIIIII)V")
	public void method127(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - this.anInt139;
		@Pc(21) int local21 = arg3 - this.anInt146;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method136(128, local21, local8);
				this.method136(8, local21, local8 - 1);
			}
			if (arg4 == 1) {
				this.method136(2, local21, local8);
				this.method136(32, local21 + 1, local8);
			}
			if (arg4 == 2) {
				this.method136(8, local21, local8);
				this.method136(128, local21, local8 + 1);
			}
			if (arg4 == 3) {
				this.method136(32, local21, local8);
				this.method136(2, local21 - 1, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method136(1, local21, local8);
				this.method136(16, local21 + 1, local8 - 1);
			}
			if (arg4 == 1) {
				this.method136(4, local21, local8);
				this.method136(64, local21 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method136(16, local21, local8);
				this.method136(1, local21 - 1, local8 - -1);
			}
			if (arg4 == 3) {
				this.method136(64, local21, local8);
				this.method136(4, local21 - 1, local8 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method136(130, local21, local8);
				this.method136(8, local21, local8 - 1);
				this.method136(32, local21 + 1, local8);
			}
			if (arg4 == 1) {
				this.method136(10, local21, local8);
				this.method136(32, local21 + 1, local8);
				this.method136(128, local21, local8 + 1);
			}
			if (arg4 == 2) {
				this.method136(40, local21, local8);
				this.method136(128, local21, local8 + 1);
				this.method136(2, local21 - 1, local8);
			}
			if (arg4 == 3) {
				this.method136(160, local21, local8);
				this.method136(2, local21 - 1, local8);
				this.method136(8, local21, local8 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method136(65536, local21, local8);
				this.method136(4096, local21, local8 - 1);
			}
			if (arg4 == 1) {
				this.method136(1024, local21, local8);
				this.method136(16384, local21 + 1, local8);
			}
			if (arg4 == 2) {
				this.method136(4096, local21, local8);
				this.method136(65536, local21, local8 + 1);
			}
			if (arg4 == 3) {
				this.method136(16384, local21, local8);
				this.method136(1024, local21 - 1, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method136(512, local21, local8);
				this.method136(8192, local21 + 1, local8 + -1);
			}
			if (arg4 == 1) {
				this.method136(2048, local21, local8);
				this.method136(32768, local21 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method136(8192, local21, local8);
				this.method136(512, local21 - 1, local8 + 1);
			}
			if (arg4 == 3) {
				this.method136(32768, local21, local8);
				this.method136(2048, local21 - 1, local8 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method136(66560, local21, local8);
			this.method136(4096, local21, local8 - 1);
			this.method136(16384, local21 + 1, local8);
		}
		if (arg4 == 1) {
			this.method136(5120, local21, local8);
			this.method136(16384, local21 + 1, local8);
			this.method136(65536, local21, local8 + 1);
		}
		if (arg4 == 2) {
			this.method136(20480, local21, local8);
			this.method136(65536, local21, local8 + 1);
			this.method136(1024, local21 - 1, local8);
		}
		if (arg4 == 3) {
			this.method136(81920, local21, local8);
			this.method136(1024, local21 - 1, local8);
			this.method136(4096, local21, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZIZII)V")
	public void method128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt139;
		@Pc(17) int local17 = arg3 - this.anInt146;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method131(local4, local17, 128);
				this.method131(local4 - 1, local17, 8);
			}
			if (arg1 == 1) {
				this.method131(local4, local17, 2);
				this.method131(local4, local17 + 1, 32);
			}
			if (arg1 == 2) {
				this.method131(local4, local17, 8);
				this.method131(local4 + 1, local17, 128);
			}
			if (arg1 == 3) {
				this.method131(local4, local17, 32);
				this.method131(local4, local17 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method131(local4, local17, 1);
				this.method131(local4 - 1, local17 + 1, 16);
			}
			if (arg1 == 1) {
				this.method131(local4, local17, 4);
				this.method131(local4 + 1, local17 + 1, 64);
			}
			if (arg1 == 2) {
				this.method131(local4, local17, 16);
				this.method131(local4 + 1, local17 + -1, 1);
			}
			if (arg1 == 3) {
				this.method131(local4, local17, 64);
				this.method131(local4 - 1, local17 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method131(local4, local17, 130);
				this.method131(local4 - 1, local17, 8);
				this.method131(local4, local17 + 1, 32);
			}
			if (arg1 == 1) {
				this.method131(local4, local17, 10);
				this.method131(local4, local17 + 1, 32);
				this.method131(local4 + 1, local17, 128);
			}
			if (arg1 == 2) {
				this.method131(local4, local17, 40);
				this.method131(local4 + 1, local17, 128);
				this.method131(local4, local17 - 1, 2);
			}
			if (arg1 == 3) {
				this.method131(local4, local17, 160);
				this.method131(local4, local17 - 1, 2);
				this.method131(local4 - 1, local17, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method131(local4, local17, 65536);
				this.method131(local4 - 1, local17, 4096);
			}
			if (arg1 == 1) {
				this.method131(local4, local17, 1024);
				this.method131(local4, local17 + 1, 16384);
			}
			if (arg1 == 2) {
				this.method131(local4, local17, 4096);
				this.method131(local4 + 1, local17, 65536);
			}
			if (arg1 == 3) {
				this.method131(local4, local17, 16384);
				this.method131(local4, local17 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method131(local4, local17, 512);
				this.method131(local4 - 1, local17 + 1, 8192);
			}
			if (arg1 == 1) {
				this.method131(local4, local17, 2048);
				this.method131(local4 + 1, local17 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method131(local4, local17, 8192);
				this.method131(local4 + 1, local17 + -1, 512);
			}
			if (arg1 == 3) {
				this.method131(local4, local17, 32768);
				this.method131(local4 - 1, local17 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method131(local4, local17, 66560);
			this.method131(local4 - 1, local17, 4096);
			this.method131(local4, local17 + 1, 16384);
		}
		if (arg1 == 1) {
			this.method131(local4, local17, 5120);
			this.method131(local4, local17 + 1, 16384);
			this.method131(local4 + 1, local17, 65536);
		}
		if (arg1 == 2) {
			this.method131(local4, local17, 20480);
			this.method131(local4 + 1, local17, 65536);
			this.method131(local4, local17 - 1, 1024);
		}
		if (arg1 == 3) {
			this.method131(local4, local17, 81920);
			this.method131(local4, local17 - 1, 1024);
			this.method131(local4 - 1, local17, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method129() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt136; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt141; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt136 - 1 || local7 == this.anInt141 - 1) {
					this.anIntArrayArray3[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray3[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 + arg1 - 1;
		@Pc(17) int local17 = arg0 + arg2 - 1;
		if (arg0 <= arg6 && local17 >= arg6 && arg5 <= arg3 && local10 >= arg3) {
			return true;
		} else if (arg6 == arg0 - 1 && arg5 <= arg3 && local10 >= arg3 && (this.anIntArrayArray3[arg6 - this.anInt139][arg3 - this.anInt146] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local17 + 1 == arg6 && arg3 >= arg5 && local10 >= arg3 && (this.anIntArrayArray3[arg6 - this.anInt139][arg3 - this.anInt146] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg3 && arg0 <= arg6 && arg6 <= local17 && (this.anIntArrayArray3[arg6 - this.anInt139][arg3 - this.anInt146] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local10 + 1 && arg0 <= arg6 && arg6 <= local17 && (this.anIntArrayArray3[arg6 - this.anInt139][arg3 - this.anInt146] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZ)V")
	private void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg0][arg1] &= 16777215 - arg2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZZIIII)V")
	public void method134(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - this.anInt139;
		@Pc(15) int local15 = arg0 - this.anInt146;
		@Pc(27) int local27;
		if (arg4 == 1 || arg4 == 3) {
			local27 = arg5;
			arg5 = arg2;
			arg2 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg1) {
			local33 = 131328;
		}
		for (local27 = local10; local27 < arg5 + local10; local27++) {
			if (local27 >= 0 && this.anInt136 > local27) {
				for (@Pc(58) int local58 = local15; local58 < local15 + arg2; local58++) {
					if (local58 >= 0 && this.anInt141 > local58) {
						this.method131(local27, local58, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)V")
	public void method135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt139;
		@Pc(13) int local13 = arg0 - this.anInt146;
		this.anIntArrayArray3[local8][local13] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	private void method136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBIZIII)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt139;
		@Pc(12) int local12 = 256;
		if (arg2) {
			local12 = 131328;
		}
		@Pc(30) int local30;
		if (arg1 == 1 || arg1 == 3) {
			local30 = arg3;
			arg3 = arg0;
			arg0 = local30;
		}
		@Pc(39) int local39 = arg5 - this.anInt146;
		for (local30 = local6; local30 < arg3 + local6; local30++) {
			if (local30 >= 0 && this.anInt136 > local30) {
				for (@Pc(60) int local60 = local39; local60 < arg0 + local39; local60++) {
					if (local60 >= 0 && this.anInt141 > local60) {
						this.method136(local12, local60, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)V")
	public void method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt146;
		@Pc(13) int local13 = arg0 - this.anInt139;
		this.anIntArrayArray3[local13][local8] |= 0x200000;
	}
}

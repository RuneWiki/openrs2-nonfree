import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class30 {

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
	private final int anInt1435 = 0;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	private final int anInt1422;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
	private final int anInt1438;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	private final int anInt1443;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[[I")
	public final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1422 = arg0;
		this.anInt1438 = 0;
		this.anInt1443 = arg1;
		this.anIntArrayArray18 = new int[this.anInt1422][this.anInt1443];
		this.method995();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg0 == arg4) {
			return true;
		}
		@Pc(16) int local16 = arg0 - this.anInt1438;
		@Pc(21) int local21 = arg4 - this.anInt1438;
		@Pc(26) int local26 = arg5 - this.anInt1435;
		@Pc(31) int local31 = arg3 - this.anInt1435;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local31 == local26 + 1 && local16 == local21 && (this.anIntArrayArray18[local31][local16] & 0x80) == 0) {
					return true;
				}
				if (local26 == local31 && local16 == local21 - 1 && (this.anIntArrayArray18[local31][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local26 - 1 == local31 && local16 == local21 && (this.anIntArrayArray18[local31][local16] & 0x8) == 0) {
					return true;
				}
				if (local26 == local31 && local21 - 1 == local16 && (this.anIntArrayArray18[local31][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local26 - 1 == local31 && local16 == local21 && (this.anIntArrayArray18[local31][local16] & 0x8) == 0) {
					return true;
				}
				if (local31 == local26 && local16 == local21 + 1 && (this.anIntArrayArray18[local31][local16] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local31 == local26 + 1 && local21 == local16 && (this.anIntArrayArray18[local31][local16] & 0x80) == 0) {
					return true;
				}
				if (local26 == local31 && local21 + 1 == local16 && (this.anIntArrayArray18[local31][local16] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (local26 == local31 && local16 == local21 + 1 && (this.anIntArrayArray18[local31][local16] & 0x20) == 0) {
				return true;
			}
			if (local31 == local26 && local16 == local21 - 1 && (this.anIntArrayArray18[local31][local16] & 0x2) == 0) {
				return true;
			}
			if (local26 - 1 == local31 && local21 == local16 && (this.anIntArrayArray18[local31][local16] & 0x8) == 0) {
				return true;
			}
			if (local31 == local26 + 1 && local16 == local21 && (this.anIntArrayArray18[local31][local16] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
	private void method987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIZ)V")
	public void method989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg0 - this.anInt1435;
		@Pc(11) int local11 = arg4 - this.anInt1438;
		@Pc(26) int local26 = 256;
		@Pc(34) int local34;
		if (arg2 == 1 || arg2 == 3) {
			local34 = arg1;
			arg1 = arg3;
			arg3 = local34;
		}
		if (arg5) {
			local26 = 131328;
		}
		for (local34 = local6; local34 < local6 + arg1; local34++) {
			if (local34 >= 0 && this.anInt1422 > local34) {
				for (@Pc(59) int local59 = local11; local59 < local11 + arg3; local59++) {
					if (local59 >= 0 && this.anInt1443 > local59) {
						this.method987(local59, local26, local34);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZIZII)V")
	public void method990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg0 - this.anInt1438;
		@Pc(18) int local18 = arg1 - this.anInt1435;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1001(local13, 128, local18);
				this.method1001(local13, 8, local18 - 1);
			}
			if (arg3 == 1) {
				this.method1001(local13, 2, local18);
				this.method1001(local13 + 1, 32, local18);
			}
			if (arg3 == 2) {
				this.method1001(local13, 8, local18);
				this.method1001(local13, 128, local18 + 1);
			}
			if (arg3 == 3) {
				this.method1001(local13, 32, local18);
				this.method1001(local13 - 1, 2, local18);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1001(local13, 1, local18);
				this.method1001(local13 + 1, 16, local18 - 1);
			}
			if (arg3 == 1) {
				this.method1001(local13, 4, local18);
				this.method1001(local13 + 1, 64, local18 + 1);
			}
			if (arg3 == 2) {
				this.method1001(local13, 16, local18);
				this.method1001(local13 - 1, 1, local18 + 1);
			}
			if (arg3 == 3) {
				this.method1001(local13, 64, local18);
				this.method1001(local13 - 1, 4, local18 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method1001(local13, 130, local18);
				this.method1001(local13, 8, local18 - 1);
				this.method1001(local13 + 1, 32, local18);
			}
			if (arg3 == 1) {
				this.method1001(local13, 10, local18);
				this.method1001(local13 + 1, 32, local18);
				this.method1001(local13, 128, local18 + 1);
			}
			if (arg3 == 2) {
				this.method1001(local13, 40, local18);
				this.method1001(local13, 128, local18 + 1);
				this.method1001(local13 - 1, 2, local18);
			}
			if (arg3 == 3) {
				this.method1001(local13, 160, local18);
				this.method1001(local13 - 1, 2, local18);
				this.method1001(local13, 8, local18 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1001(local13, 65536, local18);
				this.method1001(local13, 4096, local18 - 1);
			}
			if (arg3 == 1) {
				this.method1001(local13, 1024, local18);
				this.method1001(local13 + 1, 16384, local18);
			}
			if (arg3 == 2) {
				this.method1001(local13, 4096, local18);
				this.method1001(local13, 65536, local18 + 1);
			}
			if (arg3 == 3) {
				this.method1001(local13, 16384, local18);
				this.method1001(local13 - 1, 1024, local18);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1001(local13, 512, local18);
				this.method1001(local13 + 1, 8192, local18 - 1);
			}
			if (arg3 == 1) {
				this.method1001(local13, 2048, local18);
				this.method1001(local13 + 1, 32768, local18 + 1);
			}
			if (arg3 == 2) {
				this.method1001(local13, 8192, local18);
				this.method1001(local13 - 1, 512, local18 + 1);
			}
			if (arg3 == 3) {
				this.method1001(local13, 32768, local18);
				this.method1001(local13 - 1, 2048, local18 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1001(local13, 66560, local18);
			this.method1001(local13, 4096, local18 - 1);
			this.method1001(local13 + 1, 16384, local18);
		}
		if (arg3 == 1) {
			this.method1001(local13, 5120, local18);
			this.method1001(local13 + 1, 16384, local18);
			this.method1001(local13, 65536, local18 + 1);
		}
		if (arg3 == 2) {
			this.method1001(local13, 20480, local18);
			this.method1001(local13, 65536, local18 + 1);
			this.method1001(local13 - 1, 1024, local18);
		}
		if (arg3 == 3) {
			this.method1001(local13, 81920, local18);
			this.method1001(local13 - 1, 1024, local18);
			this.method1001(local13, 4096, local18 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZIII)V")
	public void method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg1 - this.anInt1435;
		@Pc(15) int local15 = arg2 - this.anInt1438;
		@Pc(17) int local17 = 256;
		@Pc(29) int local29;
		if (arg4 == 1 || arg4 == 3) {
			local29 = arg0;
			arg0 = arg5;
			arg5 = local29;
		}
		if (arg3) {
			local17 = 131328;
		}
		for (local29 = local6; local29 < local6 + arg0; local29++) {
			if (local29 >= 0 && local29 < this.anInt1422) {
				for (@Pc(55) int local55 = local15; local55 < arg5 + local15; local55++) {
					if (local55 >= 0 && this.anInt1443 > local55) {
						this.method1001(local55, local17, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZBI)V")
	public void method993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg0 - this.anInt1438;
		@Pc(21) int local21 = arg1 - this.anInt1435;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method987(local16, 128, local21);
				this.method987(local16, 8, local21 - 1);
			}
			if (arg4 == 1) {
				this.method987(local16, 2, local21);
				this.method987(local16 + 1, 32, local21);
			}
			if (arg4 == 2) {
				this.method987(local16, 8, local21);
				this.method987(local16, 128, local21 + 1);
			}
			if (arg4 == 3) {
				this.method987(local16, 32, local21);
				this.method987(local16 - 1, 2, local21);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method987(local16, 1, local21);
				this.method987(local16 + 1, 16, local21 - 1);
			}
			if (arg4 == 1) {
				this.method987(local16, 4, local21);
				this.method987(local16 + 1, 64, local21 + 1);
			}
			if (arg4 == 2) {
				this.method987(local16, 16, local21);
				this.method987(local16 - 1, 1, local21 + 1);
			}
			if (arg4 == 3) {
				this.method987(local16, 64, local21);
				this.method987(local16 - 1, 4, local21 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method987(local16, 130, local21);
				this.method987(local16, 8, local21 - 1);
				this.method987(local16 + 1, 32, local21);
			}
			if (arg4 == 1) {
				this.method987(local16, 10, local21);
				this.method987(local16 + 1, 32, local21);
				this.method987(local16, 128, local21 + 1);
			}
			if (arg4 == 2) {
				this.method987(local16, 40, local21);
				this.method987(local16, 128, local21 + 1);
				this.method987(local16 - 1, 2, local21);
			}
			if (arg4 == 3) {
				this.method987(local16, 160, local21);
				this.method987(local16 - 1, 2, local21);
				this.method987(local16, 8, local21 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method987(local16, 65536, local21);
				this.method987(local16, 4096, local21 - 1);
			}
			if (arg4 == 1) {
				this.method987(local16, 1024, local21);
				this.method987(local16 + 1, 16384, local21);
			}
			if (arg4 == 2) {
				this.method987(local16, 4096, local21);
				this.method987(local16, 65536, local21 + 1);
			}
			if (arg4 == 3) {
				this.method987(local16, 16384, local21);
				this.method987(local16 - 1, 1024, local21);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method987(local16, 512, local21);
				this.method987(local16 + 1, 8192, local21 - 1);
			}
			if (arg4 == 1) {
				this.method987(local16, 2048, local21);
				this.method987(local16 + 1, 32768, local21 + 1);
			}
			if (arg4 == 2) {
				this.method987(local16, 8192, local21);
				this.method987(local16 - 1, 512, local21 + 1);
			}
			if (arg4 == 3) {
				this.method987(local16, 32768, local21);
				this.method987(local16 - 1, 2048, local21 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method987(local16, 66560, local21);
			this.method987(local16, 4096, local21 - 1);
			this.method987(local16 + 1, 16384, local21);
		}
		if (arg4 == 1) {
			this.method987(local16, 5120, local21);
			this.method987(local16 + 1, 16384, local21);
			this.method987(local16, 65536, local21 + 1);
		}
		if (arg4 == 2) {
			this.method987(local16, 20480, local21);
			this.method987(local16, 65536, local21 + 1);
			this.method987(local16 - 1, 1024, local21);
		}
		if (arg4 == 3) {
			this.method987(local16, 81920, local21);
			this.method987(local16 - 1, 1024, local21);
			this.method987(local16, 4096, local21 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
	public void method994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1438;
		@Pc(18) int local18 = arg1 - this.anInt1435;
		this.anIntArrayArray18[local18][local8] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public void method995() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1422; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt1443; local12++) {
				if (local8 == 0 || local12 == 0 || this.anInt1422 - 1 == local8 || this.anInt1443 - 1 == local12) {
					this.anIntArrayArray18[local8][local12] = 16777215;
				} else {
					this.anIntArrayArray18[local8][local12] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)V")
	public void method998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1438;
		@Pc(9) int local9 = arg1 - this.anInt1435;
		this.anIntArrayArray18[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg4 - 1;
		@Pc(20) int local20 = arg0 + arg2 - 1;
		if (arg3 >= arg4 && arg3 <= local9 && arg2 <= arg5 && arg5 <= local20) {
			return true;
		} else if (arg3 == arg4 - 1 && arg5 >= arg2 && local20 >= arg5 && (this.anIntArrayArray18[arg3 - this.anInt1435][arg5 - this.anInt1438] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == local9 + 1 && arg2 <= arg5 && local20 >= arg5 && (this.anIntArrayArray18[arg3 - this.anInt1435][arg5 - this.anInt1438] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg5 && arg3 >= arg4 && arg3 <= local9 && (this.anIntArrayArray18[arg3 - this.anInt1435][arg5 - this.anInt1438] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local20 + 1 == arg5 && arg3 >= arg4 && local9 >= arg3 && (this.anIntArrayArray18[arg3 - this.anInt1435][arg5 - this.anInt1438] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg5 && arg2 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg0 - this.anInt1435;
		@Pc(29) int local29 = arg5 - this.anInt1435;
		@Pc(39) int local39 = arg2 - this.anInt1438;
		@Pc(44) int local44 = arg4 - this.anInt1438;
		if (arg3 == 0) {
			if (arg1 == 0) {
				if (local24 - 1 == local29 && local44 == local39) {
					return true;
				}
				if (local24 == local29 && local44 == local39 + 1 && (this.anIntArrayArray18[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local24 == local29 && local39 - 1 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local29 == local24 && local44 == local39 + 1) {
					return true;
				}
				if (local24 - 1 == local29 && local39 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local24 + 1 && local44 == local39 && (this.anIntArrayArray18[local29][local44] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local24 + 1 == local29 && local44 == local39) {
					return true;
				}
				if (local24 == local29 && local39 + 1 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local24 == local29 && local44 == local39 - 1 && (this.anIntArrayArray18[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local29 == local24 && local44 == local39 - 1) {
					return true;
				}
				if (local24 - 1 == local29 && local39 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local24 + 1 == local29 && local44 == local39 && (this.anIntArrayArray18[local29][local44] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				if (local24 - 1 == local29 && local44 == local39) {
					return true;
				}
				if (local24 == local29 && local39 + 1 == local44) {
					return true;
				}
				if (local29 == local24 + 1 && local39 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local24 && local39 - 1 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local24 - 1 == local29 && local44 == local39 && (this.anIntArrayArray18[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local24 && local44 == local39 + 1) {
					return true;
				}
				if (local24 + 1 == local29 && local39 == local44) {
					return true;
				}
				if (local29 == local24 && local39 - 1 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local29 == local24 - 1 && local44 == local39 && (this.anIntArrayArray18[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local24 && local39 + 1 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local24 + 1 && local44 == local39) {
					return true;
				}
				if (local24 == local29 && local39 - 1 == local44) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local24 - 1 == local29 && local44 == local39) {
					return true;
				}
				if (local29 == local24 && local39 + 1 == local44 && (this.anIntArrayArray18[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local24 + 1 == local29 && local44 == local39 && (this.anIntArrayArray18[local29][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local24 == local29 && local39 - 1 == local44) {
					return true;
				}
			}
		}
		if (arg3 == 9) {
			if (local24 == local29 && local44 == local39 + 1 && (this.anIntArrayArray18[local29][local44] & 0x20) == 0) {
				return true;
			}
			if (local24 == local29 && local44 == local39 - 1 && (this.anIntArrayArray18[local29][local44] & 0x2) == 0) {
				return true;
			}
			if (local24 - 1 == local29 && local44 == local39 && (this.anIntArrayArray18[local29][local44] & 0x8) == 0) {
				return true;
			}
			if (local29 == local24 + 1 && local39 == local44 && (this.anIntArrayArray18[local29][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)V")
	private void method1001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg2][arg0] &= 16777215 - arg1;
	}
}

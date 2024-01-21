import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class42 {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	private final int anInt1645 = 0;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	private final int anInt1655 = 0;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	private final int anInt1649;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	private final int anInt1642;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1649 = arg0;
		this.anInt1642 = arg1;
		this.anIntArrayArray12 = new int[this.anInt1649][this.anInt1642];
		this.method1029();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	private void method1014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIII)V")
	public void method1015(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt1645;
		@Pc(11) int local11 = arg1 - this.anInt1655;
		@Pc(25) int local25;
		if (arg2 == 1 || arg2 == 3) {
			local25 = arg3;
			arg3 = arg5;
			arg5 = local25;
		}
		@Pc(31) int local31 = 256;
		if (arg0) {
			local31 = 131328;
		}
		for (local25 = local6; local25 < local6 + arg3; local25++) {
			if (local25 >= 0 && this.anInt1649 > local25) {
				for (@Pc(53) int local53 = local11; local53 < local11 + arg5; local53++) {
					if (local53 >= 0 && this.anInt1642 > local53) {
						this.method1014(local25, local31, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg2 && arg3 == arg0) {
			return true;
		}
		@Pc(30) int local30 = arg0 - this.anInt1655;
		@Pc(35) int local35 = arg2 - this.anInt1645;
		@Pc(40) int local40 = arg3 - this.anInt1655;
		@Pc(45) int local45 = arg5 - this.anInt1645;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}
			if (arg4 == 0) {
				if (local45 + 1 == local35 && local30 == local40 && (this.anIntArrayArray12[local35][local40] & 0x80) == 0) {
					return true;
				}
				if (local35 == local45 && local30 - 1 == local40 && (this.anIntArrayArray12[local35][local40] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local45 - 1 == local35 && local30 == local40 && (this.anIntArrayArray12[local35][local40] & 0x8) == 0) {
					return true;
				}
				if (local45 == local35 && local40 == local30 - 1 && (this.anIntArrayArray12[local35][local40] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local45 - 1 == local35 && local40 == local30 && (this.anIntArrayArray12[local35][local40] & 0x8) == 0) {
					return true;
				}
				if (local45 == local35 && local40 == local30 + 1 && (this.anIntArrayArray12[local35][local40] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local35 == local45 + 1 && local30 == local40 && (this.anIntArrayArray12[local35][local40] & 0x80) == 0) {
					return true;
				}
				if (local35 == local45 && local40 == local30 + 1 && (this.anIntArrayArray12[local35][local40] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (local35 == local45 && local40 == local30 + 1 && (this.anIntArrayArray12[local35][local40] & 0x20) == 0) {
				return true;
			}
			if (local35 == local45 && local30 - 1 == local40 && (this.anIntArrayArray12[local35][local40] & 0x2) == 0) {
				return true;
			}
			if (local45 - 1 == local35 && local30 == local40 && (this.anIntArrayArray12[local35][local40] & 0x8) == 0) {
				return true;
			}
			if (local45 + 1 == local35 && local40 == local30 && (this.anIntArrayArray12[local35][local40] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIIII)V")
	public void method1017(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1655;
		@Pc(9) int local9 = arg3 - this.anInt1645;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method1021(local4, 128, local9);
				this.method1021(local4, 8, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1021(local4, 2, local9);
				this.method1021(local4 + 1, 32, local9);
			}
			if (arg1 == 2) {
				this.method1021(local4, 8, local9);
				this.method1021(local4, 128, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1021(local4, 32, local9);
				this.method1021(local4 - 1, 2, local9);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method1021(local4, 1, local9);
				this.method1021(local4 + 1, 16, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1021(local4, 4, local9);
				this.method1021(local4 + 1, 64, local9 + 1);
			}
			if (arg1 == 2) {
				this.method1021(local4, 16, local9);
				this.method1021(local4 - 1, 1, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1021(local4, 64, local9);
				this.method1021(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method1021(local4, 130, local9);
				this.method1021(local4, 8, local9 - 1);
				this.method1021(local4 + 1, 32, local9);
			}
			if (arg1 == 1) {
				this.method1021(local4, 10, local9);
				this.method1021(local4 + 1, 32, local9);
				this.method1021(local4, 128, local9 + 1);
			}
			if (arg1 == 2) {
				this.method1021(local4, 40, local9);
				this.method1021(local4, 128, local9 + 1);
				this.method1021(local4 - 1, 2, local9);
			}
			if (arg1 == 3) {
				this.method1021(local4, 160, local9);
				this.method1021(local4 - 1, 2, local9);
				this.method1021(local4, 8, local9 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method1021(local4, 65536, local9);
				this.method1021(local4, 4096, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1021(local4, 1024, local9);
				this.method1021(local4 + 1, 16384, local9);
			}
			if (arg1 == 2) {
				this.method1021(local4, 4096, local9);
				this.method1021(local4, 65536, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1021(local4, 16384, local9);
				this.method1021(local4 - 1, 1024, local9);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method1021(local4, 512, local9);
				this.method1021(local4 + 1, 8192, local9 - 1);
			}
			if (arg1 == 1) {
				this.method1021(local4, 2048, local9);
				this.method1021(local4 + 1, 32768, local9 + 1);
			}
			if (arg1 == 2) {
				this.method1021(local4, 8192, local9);
				this.method1021(local4 - 1, 512, local9 + 1);
			}
			if (arg1 == 3) {
				this.method1021(local4, 32768, local9);
				this.method1021(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1021(local4, 66560, local9);
			this.method1021(local4, 4096, local9 - 1);
			this.method1021(local4 + 1, 16384, local9);
		}
		if (arg1 == 1) {
			this.method1021(local4, 5120, local9);
			this.method1021(local4 + 1, 16384, local9);
			this.method1021(local4, 65536, local9 + 1);
		}
		if (arg1 == 2) {
			this.method1021(local4, 20480, local9);
			this.method1021(local4, 65536, local9 + 1);
			this.method1021(local4 - 1, 1024, local9);
		}
		if (arg1 == 3) {
			this.method1021(local4, 81920, local9);
			this.method1021(local4 - 1, 1024, local9);
			this.method1021(local4, 4096, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZIIIII)V")
	public void method1019(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt1655;
		@Pc(9) int local9 = arg1 - this.anInt1645;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1014(local9, 128, local4);
				this.method1014(local9 - 1, 8, local4);
			}
			if (arg2 == 1) {
				this.method1014(local9, 2, local4);
				this.method1014(local9, 32, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1014(local9, 8, local4);
				this.method1014(local9 + 1, 128, local4);
			}
			if (arg2 == 3) {
				this.method1014(local9, 32, local4);
				this.method1014(local9, 2, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1014(local9, 1, local4);
				this.method1014(local9 - 1, 16, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1014(local9, 4, local4);
				this.method1014(local9 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1014(local9, 16, local4);
				this.method1014(local9 + 1, 1, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1014(local9, 64, local4);
				this.method1014(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method1014(local9, 130, local4);
				this.method1014(local9 - 1, 8, local4);
				this.method1014(local9, 32, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1014(local9, 10, local4);
				this.method1014(local9, 32, local4 + 1);
				this.method1014(local9 + 1, 128, local4);
			}
			if (arg2 == 2) {
				this.method1014(local9, 40, local4);
				this.method1014(local9 + 1, 128, local4);
				this.method1014(local9, 2, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1014(local9, 160, local4);
				this.method1014(local9, 2, local4 - 1);
				this.method1014(local9 - 1, 8, local4);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1014(local9, 65536, local4);
				this.method1014(local9 - 1, 4096, local4);
			}
			if (arg2 == 1) {
				this.method1014(local9, 1024, local4);
				this.method1014(local9, 16384, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1014(local9, 4096, local4);
				this.method1014(local9 + 1, 65536, local4);
			}
			if (arg2 == 3) {
				this.method1014(local9, 16384, local4);
				this.method1014(local9, 1024, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1014(local9, 512, local4);
				this.method1014(local9 - 1, 8192, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1014(local9, 2048, local4);
				this.method1014(local9 + 1, 32768, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1014(local9, 8192, local4);
				this.method1014(local9 + 1, 512, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1014(local9, 32768, local4);
				this.method1014(local9 - 1, 2048, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1014(local9, 66560, local4);
			this.method1014(local9 - 1, 4096, local4);
			this.method1014(local9, 16384, local4 + 1);
		}
		if (arg2 == 1) {
			this.method1014(local9, 5120, local4);
			this.method1014(local9, 16384, local4 + 1);
			this.method1014(local9 + 1, 65536, local4);
		}
		if (arg2 == 2) {
			this.method1014(local9, 20480, local4);
			this.method1014(local9 + 1, 65536, local4);
			this.method1014(local9, 1024, local4 - 1);
		}
		if (arg2 == 3) {
			this.method1014(local9, 81920, local4);
			this.method1014(local9, 1024, local4 - 1);
			this.method1014(local9 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V")
	private void method1021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
	public void method1023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 - this.anInt1645;
		@Pc(15) int local15 = arg1 - this.anInt1655;
		this.anIntArrayArray12[local10][local15] |= 0x40000;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg3 + arg0 - 1;
		@Pc(17) int local17 = arg6 + arg2 - 1;
		if (arg3 <= arg1 && arg1 <= local10 && arg6 <= arg5 && arg5 <= local17) {
			return true;
		} else if (arg3 - 1 == arg1 && arg6 <= arg5 && local17 >= arg5 && (this.anIntArrayArray12[arg1 - this.anInt1645][arg5 - this.anInt1655] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local10 + 1 == arg1 && arg5 >= arg6 && arg5 <= local17 && (this.anIntArrayArray12[arg1 - this.anInt1645][arg5 - this.anInt1655] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg6 - 1 && arg3 <= arg1 && arg1 <= local10 && (this.anIntArrayArray12[arg1 - this.anInt1645][arg5 - this.anInt1655] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local17 + 1 && arg1 >= arg3 && local10 >= arg1 && (this.anIntArrayArray12[arg1 - this.anInt1645][arg5 - this.anInt1655] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIB)Z")
	public boolean method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == arg3 && arg2 == arg1) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt1645;
		@Pc(34) int local34 = arg1 - this.anInt1655;
		@Pc(39) int local39 = arg3 - this.anInt1645;
		@Pc(44) int local44 = arg2 - this.anInt1655;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (local39 - 1 == local24 && local44 == local34) {
					return true;
				}
				if (local24 == local39 && local34 == local44 + 1 && (this.anIntArrayArray12[local24][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 == local24 && local34 == local44 - 1 && (this.anIntArrayArray12[local24][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local24 == local39 && local34 == local44 + 1) {
					return true;
				}
				if (local24 == local39 - 1 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local24 == local39 + 1 && local34 == local44 && (this.anIntArrayArray12[local24][local34] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local39 + 1 == local24 && local34 == local44) {
					return true;
				}
				if (local39 == local24 && local44 + 1 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 == local24 && local34 == local44 - 1 && (this.anIntArrayArray12[local24][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local24 == local39 && local44 - 1 == local34) {
					return true;
				}
				if (local24 == local39 - 1 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local39 + 1 == local24 && local34 == local44 && (this.anIntArrayArray12[local24][local34] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				if (local39 - 1 == local24 && local44 == local34) {
					return true;
				}
				if (local39 == local24 && local44 + 1 == local34) {
					return true;
				}
				if (local24 == local39 + 1 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0180) == 0) {
					return true;
				}
				if (local24 == local39 && local34 == local44 - 1 && (this.anIntArrayArray12[local24][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local24 == local39 - 1 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local39 == local24 && local34 == local44 + 1) {
					return true;
				}
				if (local24 == local39 + 1 && local34 == local44) {
					return true;
				}
				if (local39 == local24 && local44 - 1 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local24 == local39 - 1 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0108) == 0) {
					return true;
				}
				if (local24 == local39 && local34 == local44 + 1 && (this.anIntArrayArray12[local24][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local24 == local39 + 1 && local34 == local44) {
					return true;
				}
				if (local24 == local39 && local44 - 1 == local34) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local24 == local39 - 1 && local44 == local34) {
					return true;
				}
				if (local24 == local39 && local34 == local44 + 1 && (this.anIntArrayArray12[local24][local34] & 0x12C0120) == 0) {
					return true;
				}
				if (local39 + 1 == local24 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x12C0180) == 0) {
					return true;
				}
				if (local24 == local39 && local44 - 1 == local34) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local24 == local39 && local44 + 1 == local34 && (this.anIntArrayArray12[local24][local34] & 0x20) == 0) {
				return true;
			}
			if (local39 == local24 && local34 == local44 - 1 && (this.anIntArrayArray12[local24][local34] & 0x2) == 0) {
				return true;
			}
			if (local24 == local39 - 1 && local34 == local44 && (this.anIntArrayArray12[local24][local34] & 0x8) == 0) {
				return true;
			}
			if (local39 + 1 == local24 && local44 == local34 && (this.anIntArrayArray12[local24][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIZ)V")
	public void method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(6) int local6 = arg3 - this.anInt1645;
		@Pc(8) int local8 = 256;
		if (arg4) {
			local8 = 131328;
		}
		@Pc(31) int local31 = arg2 - this.anInt1655;
		for (@Pc(33) int local33 = local6; local33 < arg0 + local6; local33++) {
			if (local33 >= 0 && local33 < this.anInt1649) {
				for (@Pc(46) int local46 = local31; local46 < local31 + arg1; local46++) {
					if (local46 >= 0 && this.anInt1642 > local46) {
						this.method1021(local46, local8, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public void method1029() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1649; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1642; local4++) {
				if (local1 == 0 || local4 == 0 || this.anInt1649 - 5 <= local1 || local4 >= this.anInt1642 - 5) {
					this.anIntArrayArray12[local1][local4] = 16777215;
				} else {
					this.anIntArrayArray12[local1][local4] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public void method1030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1655;
		@Pc(17) int local17 = arg0 - this.anInt1645;
		this.anIntArrayArray12[local17][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
	public void method1032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1645;
		@Pc(13) int local13 = arg0 - this.anInt1655;
		this.anIntArrayArray12[local4][local13] |= 0x200000;
	}
}

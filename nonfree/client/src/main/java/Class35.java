import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class35 {

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	private final int anInt2189 = 0;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	private final int anInt2176 = 0;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	private final int anInt2184;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	private final int anInt2188;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[[I")
	public final int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2184 = arg0;
		this.anInt2188 = arg1;
		this.anIntArrayArray14 = new int[this.anInt2184][this.anInt2188];
		this.method1662();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public void method1662() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2184; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2188; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt2184 - 5 <= local11 || local15 >= this.anInt2188 - 5) {
					this.anIntArrayArray14[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray14[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
	private void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray14[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
	public void method1666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2189;
		@Pc(19) int local19 = arg1 - this.anInt2176;
		this.anIntArrayArray14[local8][local19] |= 0x40000;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIIB)V")
	public void method1667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt2176;
		@Pc(9) int local9 = arg4 - this.anInt2189;
		@Pc(11) int local11 = 256;
		if (arg2) {
			local11 = 131328;
		}
		for (@Pc(34) int local34 = local9; local34 < arg0 + local9; local34++) {
			if (local34 >= 0 && local34 < this.anInt2184) {
				for (@Pc(50) int local50 = local4; local50 < arg1 + local4; local50++) {
					if (local50 >= 0 && local50 < this.anInt2188) {
						this.method1671(local11, local34, local50);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZIII)V")
	public void method1668(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - this.anInt2189;
		@Pc(22) int local22;
		if (arg5 == 1 || arg5 == 3) {
			local22 = arg3;
			arg3 = arg4;
			arg4 = local22;
		}
		@Pc(28) int local28 = 256;
		if (arg1) {
			local28 = 131328;
		}
		@Pc(39) int local39 = arg0 - this.anInt2176;
		for (local22 = local6; local22 < local6 + arg3; local22++) {
			if (local22 >= 0 && local22 < this.anInt2184) {
				for (@Pc(59) int local59 = local39; local59 < arg4 + local39; local59++) {
					if (local59 >= 0 && local59 < this.anInt2188) {
						this.method1665(local22, local28, local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg0 && arg2 == arg5) {
			return true;
		}
		@Pc(31) int local31 = arg3 - this.anInt2189;
		@Pc(36) int local36 = arg2 - this.anInt2176;
		@Pc(41) int local41 = arg0 - this.anInt2189;
		@Pc(46) int local46 = arg5 - this.anInt2176;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local41 == local31 + 1 && local36 == local46 && (this.anIntArrayArray14[local41][local36] & 0x80) == 0) {
					return true;
				}
				if (local41 == local31 && local46 - 1 == local36 && (this.anIntArrayArray14[local41][local36] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local31 - 1 == local41 && local46 == local36 && (this.anIntArrayArray14[local41][local36] & 0x8) == 0) {
					return true;
				}
				if (local31 == local41 && local46 - 1 == local36 && (this.anIntArrayArray14[local41][local36] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local31 - 1 == local41 && local36 == local46 && (this.anIntArrayArray14[local41][local36] & 0x8) == 0) {
					return true;
				}
				if (local31 == local41 && local36 == local46 + 1 && (this.anIntArrayArray14[local41][local36] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local31 + 1 == local41 && local36 == local46 && (this.anIntArrayArray14[local41][local36] & 0x80) == 0) {
					return true;
				}
				if (local41 == local31 && local46 + 1 == local36 && (this.anIntArrayArray14[local41][local36] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local31 == local41 && local36 == local46 + 1 && (this.anIntArrayArray14[local41][local36] & 0x20) == 0) {
				return true;
			}
			if (local41 == local31 && local36 == local46 - 1 && (this.anIntArrayArray14[local41][local36] & 0x2) == 0) {
				return true;
			}
			if (local31 - 1 == local41 && local46 == local36 && (this.anIntArrayArray14[local41][local36] & 0x8) == 0) {
				return true;
			}
			if (local31 + 1 == local41 && local46 == local36 && (this.anIntArrayArray14[local41][local36] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg3 - 1;
		@Pc(15) int local15 = arg2 + arg0 - 1;
		if (arg1 >= arg2 && arg1 <= local15 && arg3 <= arg4 && local9 >= arg4) {
			return true;
		} else if (arg2 - 1 == arg1 && arg4 >= arg3 && arg4 <= local9 && (this.anIntArrayArray14[arg1 - this.anInt2189][arg4 - this.anInt2176] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local15 + 1 == arg1 && arg3 <= arg4 && arg4 <= local9 && (this.anIntArrayArray14[arg1 - this.anInt2189][arg4 - this.anInt2176] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg4 && arg2 <= arg1 && local15 >= arg1 && (this.anIntArrayArray14[arg1 - this.anInt2189][arg4 - this.anInt2176] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg4 && arg2 <= arg1 && local15 >= arg1 && (this.anIntArrayArray14[arg1 - this.anInt2189][arg4 - this.anInt2176] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIII)V")
	private void method1671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIII)V")
	public void method1673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt2189;
		@Pc(13) int local13 = arg4 - this.anInt2176;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method1671(128, local4, local13);
				this.method1671(8, local4 - 1, local13);
			}
			if (arg1 == 1) {
				this.method1671(2, local4, local13);
				this.method1671(32, local4, local13 + 1);
			}
			if (arg1 == 2) {
				this.method1671(8, local4, local13);
				this.method1671(128, local4 + 1, local13);
			}
			if (arg1 == 3) {
				this.method1671(32, local4, local13);
				this.method1671(2, local4, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method1671(1, local4, local13);
				this.method1671(16, local4 - 1, local13 - -1);
			}
			if (arg1 == 1) {
				this.method1671(4, local4, local13);
				this.method1671(64, local4 + 1, local13 - -1);
			}
			if (arg1 == 2) {
				this.method1671(16, local4, local13);
				this.method1671(1, local4 + 1, local13 + -1);
			}
			if (arg1 == 3) {
				this.method1671(64, local4, local13);
				this.method1671(4, local4 - 1, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method1671(130, local4, local13);
				this.method1671(8, local4 - 1, local13);
				this.method1671(32, local4, local13 + 1);
			}
			if (arg1 == 1) {
				this.method1671(10, local4, local13);
				this.method1671(32, local4, local13 + 1);
				this.method1671(128, local4 + 1, local13);
			}
			if (arg1 == 2) {
				this.method1671(40, local4, local13);
				this.method1671(128, local4 + 1, local13);
				this.method1671(2, local4, local13 - 1);
			}
			if (arg1 == 3) {
				this.method1671(160, local4, local13);
				this.method1671(2, local4, local13 - 1);
				this.method1671(8, local4 - 1, local13);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method1671(65536, local4, local13);
				this.method1671(4096, local4 - 1, local13);
			}
			if (arg1 == 1) {
				this.method1671(1024, local4, local13);
				this.method1671(16384, local4, local13 + 1);
			}
			if (arg1 == 2) {
				this.method1671(4096, local4, local13);
				this.method1671(65536, local4 + 1, local13);
			}
			if (arg1 == 3) {
				this.method1671(16384, local4, local13);
				this.method1671(1024, local4, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method1671(512, local4, local13);
				this.method1671(8192, local4 - 1, local13 + 1);
			}
			if (arg1 == 1) {
				this.method1671(2048, local4, local13);
				this.method1671(32768, local4 + 1, local13 - -1);
			}
			if (arg1 == 2) {
				this.method1671(8192, local4, local13);
				this.method1671(512, local4 + 1, local13 + -1);
			}
			if (arg1 == 3) {
				this.method1671(32768, local4, local13);
				this.method1671(2048, local4 - 1, local13 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1671(66560, local4, local13);
			this.method1671(4096, local4 - 1, local13);
			this.method1671(16384, local4, local13 + 1);
		}
		if (arg1 == 1) {
			this.method1671(5120, local4, local13);
			this.method1671(16384, local4, local13 + 1);
			this.method1671(65536, local4 + 1, local13);
		}
		if (arg1 == 2) {
			this.method1671(20480, local4, local13);
			this.method1671(65536, local4 + 1, local13);
			this.method1671(1024, local4, local13 - 1);
		}
		if (arg1 == 3) {
			this.method1671(81920, local4, local13);
			this.method1671(1024, local4, local13 - 1);
			this.method1671(4096, local4 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	public void method1674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2189;
		@Pc(13) int local13 = arg1 - this.anInt2176;
		this.anIntArrayArray14[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIZI)V")
	public void method1675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt2176;
		@Pc(19) int local19 = arg4 - this.anInt2189;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method1665(local19, 128, local4);
				this.method1665(local19 - 1, 8, local4);
			}
			if (arg1 == 1) {
				this.method1665(local19, 2, local4);
				this.method1665(local19, 32, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1665(local19, 8, local4);
				this.method1665(local19 + 1, 128, local4);
			}
			if (arg1 == 3) {
				this.method1665(local19, 32, local4);
				this.method1665(local19, 2, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method1665(local19, 1, local4);
				this.method1665(local19 - 1, 16, local4 + 1);
			}
			if (arg1 == 1) {
				this.method1665(local19, 4, local4);
				this.method1665(local19 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1665(local19, 16, local4);
				this.method1665(local19 + 1, 1, local4 - 1);
			}
			if (arg1 == 3) {
				this.method1665(local19, 64, local4);
				this.method1665(local19 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method1665(local19, 130, local4);
				this.method1665(local19 - 1, 8, local4);
				this.method1665(local19, 32, local4 + 1);
			}
			if (arg1 == 1) {
				this.method1665(local19, 10, local4);
				this.method1665(local19, 32, local4 + 1);
				this.method1665(local19 + 1, 128, local4);
			}
			if (arg1 == 2) {
				this.method1665(local19, 40, local4);
				this.method1665(local19 + 1, 128, local4);
				this.method1665(local19, 2, local4 - 1);
			}
			if (arg1 == 3) {
				this.method1665(local19, 160, local4);
				this.method1665(local19, 2, local4 - 1);
				this.method1665(local19 - 1, 8, local4);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method1665(local19, 65536, local4);
				this.method1665(local19 - 1, 4096, local4);
			}
			if (arg1 == 1) {
				this.method1665(local19, 1024, local4);
				this.method1665(local19, 16384, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1665(local19, 4096, local4);
				this.method1665(local19 + 1, 65536, local4);
			}
			if (arg1 == 3) {
				this.method1665(local19, 16384, local4);
				this.method1665(local19, 1024, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method1665(local19, 512, local4);
				this.method1665(local19 - 1, 8192, local4 + 1);
			}
			if (arg1 == 1) {
				this.method1665(local19, 2048, local4);
				this.method1665(local19 + 1, 32768, local4 + 1);
			}
			if (arg1 == 2) {
				this.method1665(local19, 8192, local4);
				this.method1665(local19 + 1, 512, local4 - 1);
			}
			if (arg1 == 3) {
				this.method1665(local19, 32768, local4);
				this.method1665(local19 - 1, 2048, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method1665(local19, 66560, local4);
			this.method1665(local19 - 1, 4096, local4);
			this.method1665(local19, 16384, local4 + 1);
		}
		if (arg1 == 1) {
			this.method1665(local19, 5120, local4);
			this.method1665(local19, 16384, local4 + 1);
			this.method1665(local19 + 1, 65536, local4);
		}
		if (arg1 == 2) {
			this.method1665(local19, 20480, local4);
			this.method1665(local19 + 1, 65536, local4);
			this.method1665(local19, 1024, local4 - 1);
		}
		if (arg1 == 3) {
			this.method1665(local19, 81920, local4);
			this.method1665(local19, 1024, local4 - 1);
			this.method1665(local19 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZI)V")
	public void method1676(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2189;
		@Pc(17) int local17 = arg0 - this.anInt2176;
		this.anIntArrayArray14[local8][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIZ)Z")
	public boolean method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == arg3 && arg1 == arg5) {
			return true;
		}
		@Pc(16) int local16 = arg1 - this.anInt2176;
		@Pc(26) int local26 = arg0 - this.anInt2189;
		@Pc(31) int local31 = arg5 - this.anInt2176;
		@Pc(36) int local36 = arg3 - this.anInt2189;
		if (arg2 == 0) {
			if (arg4 == 0) {
				if (local36 == local26 - 1 && local16 == local31) {
					return true;
				}
				if (local26 == local36 && local16 == local31 + 1 && (this.anIntArrayArray14[local36][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 == local26 && local16 == local31 - 1 && (this.anIntArrayArray14[local36][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local36 == local26 && local31 + 1 == local16) {
					return true;
				}
				if (local36 == local26 - 1 && local16 == local31 && (this.anIntArrayArray14[local36][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local36 == local26 + 1 && local31 == local16 && (this.anIntArrayArray14[local36][local16] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local26 + 1 == local36 && local31 == local16) {
					return true;
				}
				if (local36 == local26 && local16 == local31 + 1 && (this.anIntArrayArray14[local36][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local26 == local36 && local31 - 1 == local16 && (this.anIntArrayArray14[local36][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local26 == local36 && local16 == local31 - 1) {
					return true;
				}
				if (local26 - 1 == local36 && local31 == local16 && (this.anIntArrayArray14[local36][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 + 1 == local36 && local16 == local31 && (this.anIntArrayArray14[local36][local16] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				if (local26 - 1 == local36 && local31 == local16) {
					return true;
				}
				if (local26 == local36 && local31 + 1 == local16) {
					return true;
				}
				if (local36 == local26 + 1 && local16 == local31 && (this.anIntArrayArray14[local36][local16] & 0x12C0180) == 0) {
					return true;
				}
				if (local26 == local36 && local31 - 1 == local16 && (this.anIntArrayArray14[local36][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local36 == local26 - 1 && local31 == local16 && (this.anIntArrayArray14[local36][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local36 && local16 == local31 + 1) {
					return true;
				}
				if (local36 == local26 + 1 && local16 == local31) {
					return true;
				}
				if (local36 == local26 && local16 == local31 - 1 && (this.anIntArrayArray14[local36][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local36 == local26 - 1 && local16 == local31 && (this.anIntArrayArray14[local36][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local36 && local16 == local31 + 1 && (this.anIntArrayArray14[local36][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 == local26 + 1 && local16 == local31) {
					return true;
				}
				if (local36 == local26 && local16 == local31 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local36 == local26 - 1 && local16 == local31) {
					return true;
				}
				if (local26 == local36 && local31 + 1 == local16 && (this.anIntArrayArray14[local36][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 == local26 + 1 && local16 == local31 && (this.anIntArrayArray14[local36][local16] & 0x12C0180) == 0) {
					return true;
				}
				if (local36 == local26 && local16 == local31 - 1) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local26 == local36 && local31 + 1 == local16 && (this.anIntArrayArray14[local36][local16] & 0x20) == 0) {
				return true;
			}
			if (local26 == local36 && local31 - 1 == local16 && (this.anIntArrayArray14[local36][local16] & 0x2) == 0) {
				return true;
			}
			if (local36 == local26 - 1 && local16 == local31 && (this.anIntArrayArray14[local36][local16] & 0x8) == 0) {
				return true;
			}
			if (local36 == local26 + 1 && local31 == local16 && (this.anIntArrayArray14[local36][local16] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

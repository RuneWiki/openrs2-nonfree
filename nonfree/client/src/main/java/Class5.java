import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	private final int anInt386;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	private final int anInt391;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	private final int anInt381;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	private final int anInt393;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt386 = arg1;
		this.anInt391 = 0;
		this.anInt381 = 0;
		this.anInt393 = arg0;
		this.anIntArrayArray3 = new int[this.anInt393][this.anInt386];
		this.method198();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIII)V")
	private void method195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public void method197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt391;
		@Pc(13) int local13 = arg1 - this.anInt381;
		this.anIntArrayArray3[local13][local4] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public void method198() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt393; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt386; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt393 - 1 == local11 || this.anInt386 - 1 == local15) {
					this.anIntArrayArray3[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray3[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZII)V")
	public void method200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt391;
		@Pc(18) int local18 = arg0 - this.anInt381;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method208(local8, 128, local18);
				this.method208(local8, 8, local18 - 1);
			}
			if (arg1 == 1) {
				this.method208(local8, 2, local18);
				this.method208(local8 + 1, 32, local18);
			}
			if (arg1 == 2) {
				this.method208(local8, 8, local18);
				this.method208(local8, 128, local18 + 1);
			}
			if (arg1 == 3) {
				this.method208(local8, 32, local18);
				this.method208(local8 - 1, 2, local18);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method208(local8, 1, local18);
				this.method208(local8 + 1, 16, local18 - 1);
			}
			if (arg1 == 1) {
				this.method208(local8, 4, local18);
				this.method208(local8 + 1, 64, local18 + 1);
			}
			if (arg1 == 2) {
				this.method208(local8, 16, local18);
				this.method208(local8 - 1, 1, local18 + 1);
			}
			if (arg1 == 3) {
				this.method208(local8, 64, local18);
				this.method208(local8 - 1, 4, local18 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method208(local8, 130, local18);
				this.method208(local8, 8, local18 - 1);
				this.method208(local8 + 1, 32, local18);
			}
			if (arg1 == 1) {
				this.method208(local8, 10, local18);
				this.method208(local8 + 1, 32, local18);
				this.method208(local8, 128, local18 + 1);
			}
			if (arg1 == 2) {
				this.method208(local8, 40, local18);
				this.method208(local8, 128, local18 + 1);
				this.method208(local8 - 1, 2, local18);
			}
			if (arg1 == 3) {
				this.method208(local8, 160, local18);
				this.method208(local8 - 1, 2, local18);
				this.method208(local8, 8, local18 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method208(local8, 65536, local18);
				this.method208(local8, 4096, local18 - 1);
			}
			if (arg1 == 1) {
				this.method208(local8, 1024, local18);
				this.method208(local8 + 1, 16384, local18);
			}
			if (arg1 == 2) {
				this.method208(local8, 4096, local18);
				this.method208(local8, 65536, local18 + 1);
			}
			if (arg1 == 3) {
				this.method208(local8, 16384, local18);
				this.method208(local8 - 1, 1024, local18);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method208(local8, 512, local18);
				this.method208(local8 + 1, 8192, local18 - 1);
			}
			if (arg1 == 1) {
				this.method208(local8, 2048, local18);
				this.method208(local8 + 1, 32768, local18 + 1);
			}
			if (arg1 == 2) {
				this.method208(local8, 8192, local18);
				this.method208(local8 - 1, 512, local18 + 1);
			}
			if (arg1 == 3) {
				this.method208(local8, 32768, local18);
				this.method208(local8 - 1, 2048, local18 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method208(local8, 66560, local18);
			this.method208(local8, 4096, local18 - 1);
			this.method208(local8 + 1, 16384, local18);
		}
		if (arg1 == 1) {
			this.method208(local8, 5120, local18);
			this.method208(local8 + 1, 16384, local18);
			this.method208(local8, 65536, local18 + 1);
		}
		if (arg1 == 2) {
			this.method208(local8, 20480, local18);
			this.method208(local8, 65536, local18 + 1);
			this.method208(local8 - 1, 1024, local18);
		}
		if (arg1 == 3) {
			this.method208(local8, 81920, local18);
			this.method208(local8 - 1, 1024, local18);
			this.method208(local8, 4096, local18 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIIIIBI)V")
	public void method201(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg1 - this.anInt391;
		@Pc(20) int local20;
		if (arg3 == 1 || arg3 == 3) {
			local20 = arg4;
			arg4 = arg5;
			arg5 = local20;
		}
		@Pc(26) int local26 = 256;
		if (arg0) {
			local26 = 131328;
		}
		@Pc(37) int local37 = arg2 - this.anInt381;
		for (local20 = local37; local20 < arg4 + local37; local20++) {
			if (local20 >= 0 && local20 < this.anInt393) {
				for (@Pc(53) int local53 = local6; local53 < arg5 + local6; local53++) {
					if (local53 >= 0 && this.anInt386 > local53) {
						this.method208(local53, local26, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZB)V")
	public void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int local4 = arg0 - this.anInt391;
		@Pc(13) int local13 = arg3 - this.anInt381;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method195(local13, local4, 128);
				this.method195(local13 - 1, local4, 8);
			}
			if (arg2 == 1) {
				this.method195(local13, local4, 2);
				this.method195(local13, local4 + 1, 32);
			}
			if (arg2 == 2) {
				this.method195(local13, local4, 8);
				this.method195(local13 + 1, local4, 128);
			}
			if (arg2 == 3) {
				this.method195(local13, local4, 32);
				this.method195(local13, local4 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method195(local13, local4, 1);
				this.method195(local13 - 1, local4 - -1, 16);
			}
			if (arg2 == 1) {
				this.method195(local13, local4, 4);
				this.method195(local13 + 1, local4 + 1, 64);
			}
			if (arg2 == 2) {
				this.method195(local13, local4, 16);
				this.method195(local13 + 1, local4 + -1, 1);
			}
			if (arg2 == 3) {
				this.method195(local13, local4, 64);
				this.method195(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method195(local13, local4, 130);
				this.method195(local13 - 1, local4, 8);
				this.method195(local13, local4 + 1, 32);
			}
			if (arg2 == 1) {
				this.method195(local13, local4, 10);
				this.method195(local13, local4 + 1, 32);
				this.method195(local13 + 1, local4, 128);
			}
			if (arg2 == 2) {
				this.method195(local13, local4, 40);
				this.method195(local13 + 1, local4, 128);
				this.method195(local13, local4 - 1, 2);
			}
			if (arg2 == 3) {
				this.method195(local13, local4, 160);
				this.method195(local13, local4 - 1, 2);
				this.method195(local13 - 1, local4, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method195(local13, local4, 65536);
				this.method195(local13 - 1, local4, 4096);
			}
			if (arg2 == 1) {
				this.method195(local13, local4, 1024);
				this.method195(local13, local4 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method195(local13, local4, 4096);
				this.method195(local13 + 1, local4, 65536);
			}
			if (arg2 == 3) {
				this.method195(local13, local4, 16384);
				this.method195(local13, local4 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method195(local13, local4, 512);
				this.method195(local13 - 1, local4 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method195(local13, local4, 2048);
				this.method195(local13 + 1, local4 - -1, 32768);
			}
			if (arg2 == 2) {
				this.method195(local13, local4, 8192);
				this.method195(local13 + 1, local4 - 1, 512);
			}
			if (arg2 == 3) {
				this.method195(local13, local4, 32768);
				this.method195(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method195(local13, local4, 66560);
			this.method195(local13 - 1, local4, 4096);
			this.method195(local13, local4 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method195(local13, local4, 5120);
			this.method195(local13, local4 + 1, 16384);
			this.method195(local13 + 1, local4, 65536);
		}
		if (arg2 == 2) {
			this.method195(local13, local4, 20480);
			this.method195(local13 + 1, local4, 65536);
			this.method195(local13, local4 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method195(local13, local4, 81920);
			this.method195(local13, local4 - 1, 1024);
			this.method195(local13 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V")
	public void method203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt391;
		@Pc(13) int local13 = arg1 - this.anInt381;
		this.anIntArrayArray3[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(24) int local24 = arg1 + arg2 - 1;
		@Pc(31) int local31 = arg3 + arg0 - 1;
		if (arg6 >= arg1 && arg6 <= local24 && arg5 >= arg3 && local31 >= arg5) {
			return true;
		} else if (arg6 == arg1 - 1 && arg5 >= arg3 && local31 >= arg5 && (this.anIntArrayArray3[arg6 - this.anInt381][arg5 - this.anInt391] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local24 + 1 == arg6 && arg5 >= arg3 && arg5 <= local31 && (this.anIntArrayArray3[arg6 - this.anInt381][arg5 - this.anInt391] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg3 - 1 && arg6 >= arg1 && arg6 <= local24 && (this.anIntArrayArray3[arg6 - this.anInt381][arg5 - this.anInt391] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local31 + 1 == arg5 && arg1 <= arg6 && local24 >= arg6 && (this.anIntArrayArray3[arg6 - this.anInt381][arg5 - this.anInt391] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZIIIII)V")
	public void method206(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt391;
		@Pc(28) int local28;
		if (arg3 == 1 || arg3 == 3) {
			local28 = arg5;
			arg5 = arg2;
			arg2 = local28;
		}
		@Pc(37) int local37 = arg0 - this.anInt381;
		@Pc(39) int local39 = 256;
		if (arg1) {
			local39 = 131328;
		}
		for (local28 = local37; local28 < local37 + arg5; local28++) {
			if (local28 >= 0 && local28 < this.anInt393) {
				for (@Pc(60) int local60 = local6; local60 < arg2 + local6; local60++) {
					if (local60 >= 0 && local60 < this.anInt386) {
						this.method195(local28, local60, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IZIIIII)Z")
	public boolean method207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg0 && arg3 == arg2) {
			return true;
		}
		@Pc(26) int local26 = arg3 - this.anInt391;
		@Pc(31) int local31 = arg5 - this.anInt381;
		@Pc(36) int local36 = arg0 - this.anInt381;
		@Pc(41) int local41 = arg2 - this.anInt391;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (local31 - 1 == local36 && local41 == local26) {
					return true;
				}
				if (local36 == local31 && local41 + 1 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280120) == 0) {
					return true;
				}
				if (local31 == local36 && local26 == local41 - 1 && (this.anIntArrayArray3[local36][local26] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local31 == local36 && local41 + 1 == local26) {
					return true;
				}
				if (local31 - 1 == local36 && local26 == local41 && (this.anIntArrayArray3[local36][local26] & 0x1280108) == 0) {
					return true;
				}
				if (local36 == local31 + 1 && local26 == local41 && (this.anIntArrayArray3[local36][local26] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local36 == local31 + 1 && local26 == local41) {
					return true;
				}
				if (local36 == local31 && local26 == local41 + 1 && (this.anIntArrayArray3[local36][local26] & 0x1280120) == 0) {
					return true;
				}
				if (local31 == local36 && local41 - 1 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local31 == local36 && local41 - 1 == local26) {
					return true;
				}
				if (local31 - 1 == local36 && local41 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280108) == 0) {
					return true;
				}
				if (local36 == local31 + 1 && local26 == local41 && (this.anIntArrayArray3[local36][local26] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				if (local36 == local31 - 1 && local41 == local26) {
					return true;
				}
				if (local31 == local36 && local26 == local41 + 1) {
					return true;
				}
				if (local36 == local31 + 1 && local41 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280180) == 0) {
					return true;
				}
				if (local31 == local36 && local41 - 1 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local36 == local31 - 1 && local41 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280108) == 0) {
					return true;
				}
				if (local31 == local36 && local41 + 1 == local26) {
					return true;
				}
				if (local36 == local31 + 1 && local26 == local41) {
					return true;
				}
				if (local36 == local31 && local26 == local41 - 1 && (this.anIntArrayArray3[local36][local26] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local36 == local31 - 1 && local41 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280108) == 0) {
					return true;
				}
				if (local31 == local36 && local41 + 1 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280120) == 0) {
					return true;
				}
				if (local31 + 1 == local36 && local26 == local41) {
					return true;
				}
				if (local36 == local31 && local26 == local41 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local36 == local31 - 1 && local41 == local26) {
					return true;
				}
				if (local36 == local31 && local41 + 1 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280120) == 0) {
					return true;
				}
				if (local31 + 1 == local36 && local41 == local26 && (this.anIntArrayArray3[local36][local26] & 0x1280180) == 0) {
					return true;
				}
				if (local36 == local31 && local41 - 1 == local26) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local31 == local36 && local26 == local41 + 1 && (this.anIntArrayArray3[local36][local26] & 0x20) == 0) {
				return true;
			}
			if (local31 == local36 && local41 - 1 == local26 && (this.anIntArrayArray3[local36][local26] & 0x2) == 0) {
				return true;
			}
			if (local36 == local31 - 1 && local26 == local41 && (this.anIntArrayArray3[local36][local26] & 0x8) == 0) {
				return true;
			}
			if (local31 + 1 == local36 && local41 == local26 && (this.anIntArrayArray3[local36][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIB)V")
	private void method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg2][arg0] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIBI)Z")
	public boolean method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg4 && arg2 == arg0) {
			return true;
		}
		@Pc(16) int local16 = arg2 - this.anInt391;
		@Pc(21) int local21 = arg3 - this.anInt381;
		@Pc(34) int local34 = arg4 - this.anInt381;
		@Pc(39) int local39 = arg0 - this.anInt391;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local34 == local21 + 1 && local39 == local16 && (this.anIntArrayArray3[local34][local16] & 0x80) == 0) {
					return true;
				}
				if (local34 == local21 && local16 == local39 - 1 && (this.anIntArrayArray3[local34][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local34 == local21 - 1 && local16 == local39 && (this.anIntArrayArray3[local34][local16] & 0x8) == 0) {
					return true;
				}
				if (local21 == local34 && local39 - 1 == local16 && (this.anIntArrayArray3[local34][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local21 - 1 == local34 && local16 == local39 && (this.anIntArrayArray3[local34][local16] & 0x8) == 0) {
					return true;
				}
				if (local34 == local21 && local16 == local39 + 1 && (this.anIntArrayArray3[local34][local16] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local21 + 1 == local34 && local39 == local16 && (this.anIntArrayArray3[local34][local16] & 0x80) == 0) {
					return true;
				}
				if (local21 == local34 && local39 + 1 == local16 && (this.anIntArrayArray3[local34][local16] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local21 == local34 && local39 + 1 == local16 && (this.anIntArrayArray3[local34][local16] & 0x20) == 0) {
				return true;
			}
			if (local34 == local21 && local39 - 1 == local16 && (this.anIntArrayArray3[local34][local16] & 0x2) == 0) {
				return true;
			}
			if (local21 - 1 == local34 && local16 == local39 && (this.anIntArrayArray3[local34][local16] & 0x8) == 0) {
				return true;
			}
			if (local34 == local21 + 1 && local39 == local16 && (this.anIntArrayArray3[local34][local16] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

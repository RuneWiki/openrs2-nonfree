import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class60 {

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	private final int anInt2945 = 0;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private final int anInt2952;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	private final int anInt2943;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	private final int anInt2958;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2952 = arg0;
		this.anInt2943 = arg1;
		this.anIntArrayArray34 = new int[this.anInt2952][this.anInt2943];
		this.anInt2958 = 0;
		this.method2147();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public void method2147() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2952; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2943; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt2952 - 5 <= local11 || local15 >= this.anInt2943 - 5) {
					this.anIntArrayArray34[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray34[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V")
	public void method2148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2958;
		@Pc(9) int local9 = arg1 - this.anInt2945;
		this.anIntArrayArray34[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZII)V")
	public void method2149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt2958;
		@Pc(9) int local9 = arg4 - this.anInt2945;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method2153(local9, 128, local4);
				this.method2153(local9 - 1, 8, local4);
			}
			if (arg0 == 1) {
				this.method2153(local9, 2, local4);
				this.method2153(local9, 32, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2153(local9, 8, local4);
				this.method2153(local9 + 1, 128, local4);
			}
			if (arg0 == 3) {
				this.method2153(local9, 32, local4);
				this.method2153(local9, 2, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method2153(local9, 1, local4);
				this.method2153(local9 - 1, 16, local4 + 1);
			}
			if (arg0 == 1) {
				this.method2153(local9, 4, local4);
				this.method2153(local9 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2153(local9, 16, local4);
				this.method2153(local9 + 1, 1, local4 - 1);
			}
			if (arg0 == 3) {
				this.method2153(local9, 64, local4);
				this.method2153(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method2153(local9, 130, local4);
				this.method2153(local9 - 1, 8, local4);
				this.method2153(local9, 32, local4 + 1);
			}
			if (arg0 == 1) {
				this.method2153(local9, 10, local4);
				this.method2153(local9, 32, local4 + 1);
				this.method2153(local9 + 1, 128, local4);
			}
			if (arg0 == 2) {
				this.method2153(local9, 40, local4);
				this.method2153(local9 + 1, 128, local4);
				this.method2153(local9, 2, local4 - 1);
			}
			if (arg0 == 3) {
				this.method2153(local9, 160, local4);
				this.method2153(local9, 2, local4 - 1);
				this.method2153(local9 - 1, 8, local4);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method2153(local9, 65536, local4);
				this.method2153(local9 - 1, 4096, local4);
			}
			if (arg0 == 1) {
				this.method2153(local9, 1024, local4);
				this.method2153(local9, 16384, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2153(local9, 4096, local4);
				this.method2153(local9 + 1, 65536, local4);
			}
			if (arg0 == 3) {
				this.method2153(local9, 16384, local4);
				this.method2153(local9, 1024, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method2153(local9, 512, local4);
				this.method2153(local9 - 1, 8192, local4 + 1);
			}
			if (arg0 == 1) {
				this.method2153(local9, 2048, local4);
				this.method2153(local9 + 1, 32768, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2153(local9, 8192, local4);
				this.method2153(local9 + 1, 512, local4 - 1);
			}
			if (arg0 == 3) {
				this.method2153(local9, 32768, local4);
				this.method2153(local9 - 1, 2048, local4 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2153(local9, 66560, local4);
			this.method2153(local9 - 1, 4096, local4);
			this.method2153(local9, 16384, local4 + 1);
		}
		if (arg0 == 1) {
			this.method2153(local9, 5120, local4);
			this.method2153(local9, 16384, local4 + 1);
			this.method2153(local9 + 1, 65536, local4);
		}
		if (arg0 == 2) {
			this.method2153(local9, 20480, local4);
			this.method2153(local9 + 1, 65536, local4);
			this.method2153(local9, 1024, local4 - 1);
		}
		if (arg0 == 3) {
			this.method2153(local9, 81920, local4);
			this.method2153(local9, 1024, local4 - 1);
			this.method2153(local9 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)V")
	private void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg5 && arg4 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg3 - this.anInt2958;
		@Pc(21) int local21 = arg5 - this.anInt2945;
		@Pc(26) int local26 = arg4 - this.anInt2958;
		@Pc(31) int local31 = arg2 - this.anInt2945;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (local31 - 1 == local21 && local16 == local26) {
					return true;
				}
				if (local31 == local21 && local26 == local16 + 1 && (this.anIntArrayArray34[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local31 == local21 && local26 == local16 - 1 && (this.anIntArrayArray34[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local31 == local21 && local26 == local16 + 1) {
					return true;
				}
				if (local21 == local31 - 1 && local26 == local16 && (this.anIntArrayArray34[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local31 + 1 == local21 && local26 == local16 && (this.anIntArrayArray34[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local31 + 1 == local21 && local26 == local16) {
					return true;
				}
				if (local31 == local21 && local16 + 1 == local26 && (this.anIntArrayArray34[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local31 == local21 && local16 - 1 == local26 && (this.anIntArrayArray34[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local31 == local21 && local16 - 1 == local26) {
					return true;
				}
				if (local21 == local31 - 1 && local16 == local26 && (this.anIntArrayArray34[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local21 == local31 + 1 && local26 == local16 && (this.anIntArrayArray34[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				if (local21 == local31 - 1 && local16 == local26) {
					return true;
				}
				if (local31 == local21 && local26 == local16 + 1) {
					return true;
				}
				if (local21 == local31 + 1 && local16 == local26 && (this.anIntArrayArray34[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local31 == local21 && local26 == local16 - 1 && (this.anIntArrayArray34[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local21 == local31 - 1 && local26 == local16 && (this.anIntArrayArray34[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local16 + 1) {
					return true;
				}
				if (local21 == local31 + 1 && local16 == local26) {
					return true;
				}
				if (local21 == local31 && local26 == local16 - 1 && (this.anIntArrayArray34[local21][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local21 == local31 - 1 && local26 == local16 && (this.anIntArrayArray34[local21][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local16 + 1 && (this.anIntArrayArray34[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local21 == local31 + 1 && local26 == local16) {
					return true;
				}
				if (local21 == local31 && local26 == local16 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local21 == local31 - 1 && local26 == local16) {
					return true;
				}
				if (local21 == local31 && local16 + 1 == local26 && (this.anIntArrayArray34[local21][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local21 == local31 + 1 && local16 == local26 && (this.anIntArrayArray34[local21][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local31 == local21 && local16 - 1 == local26) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local31 == local21 && local16 + 1 == local26 && (this.anIntArrayArray34[local21][local26] & 0x20) == 0) {
				return true;
			}
			if (local21 == local31 && local16 - 1 == local26 && (this.anIntArrayArray34[local21][local26] & 0x2) == 0) {
				return true;
			}
			if (local31 - 1 == local21 && local16 == local26 && (this.anIntArrayArray34[local21][local26] & 0x8) == 0) {
				return true;
			}
			if (local21 == local31 + 1 && local26 == local16 && (this.anIntArrayArray34[local21][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
	private void method2153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIII)V")
	public void method2154(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt2958;
		@Pc(13) int local13 = arg2 - this.anInt2945;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method2150(128, local13, local8);
				this.method2150(8, local13 - 1, local8);
			}
			if (arg3 == 1) {
				this.method2150(2, local13, local8);
				this.method2150(32, local13, local8 + 1);
			}
			if (arg3 == 2) {
				this.method2150(8, local13, local8);
				this.method2150(128, local13 + 1, local8);
			}
			if (arg3 == 3) {
				this.method2150(32, local13, local8);
				this.method2150(2, local13, local8 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method2150(1, local13, local8);
				this.method2150(16, local13 - 1, local8 - -1);
			}
			if (arg3 == 1) {
				this.method2150(4, local13, local8);
				this.method2150(64, local13 + 1, local8 - -1);
			}
			if (arg3 == 2) {
				this.method2150(16, local13, local8);
				this.method2150(1, local13 + 1, local8 + -1);
			}
			if (arg3 == 3) {
				this.method2150(64, local13, local8);
				this.method2150(4, local13 - 1, local8 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method2150(130, local13, local8);
				this.method2150(8, local13 - 1, local8);
				this.method2150(32, local13, local8 + 1);
			}
			if (arg3 == 1) {
				this.method2150(10, local13, local8);
				this.method2150(32, local13, local8 + 1);
				this.method2150(128, local13 + 1, local8);
			}
			if (arg3 == 2) {
				this.method2150(40, local13, local8);
				this.method2150(128, local13 + 1, local8);
				this.method2150(2, local13, local8 - 1);
			}
			if (arg3 == 3) {
				this.method2150(160, local13, local8);
				this.method2150(2, local13, local8 - 1);
				this.method2150(8, local13 - 1, local8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method2150(65536, local13, local8);
				this.method2150(4096, local13 - 1, local8);
			}
			if (arg3 == 1) {
				this.method2150(1024, local13, local8);
				this.method2150(16384, local13, local8 + 1);
			}
			if (arg3 == 2) {
				this.method2150(4096, local13, local8);
				this.method2150(65536, local13 + 1, local8);
			}
			if (arg3 == 3) {
				this.method2150(16384, local13, local8);
				this.method2150(1024, local13, local8 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method2150(512, local13, local8);
				this.method2150(8192, local13 - 1, local8 + 1);
			}
			if (arg3 == 1) {
				this.method2150(2048, local13, local8);
				this.method2150(32768, local13 + 1, local8 + 1);
			}
			if (arg3 == 2) {
				this.method2150(8192, local13, local8);
				this.method2150(512, local13 + 1, local8 + -1);
			}
			if (arg3 == 3) {
				this.method2150(32768, local13, local8);
				this.method2150(2048, local13 - 1, local8 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2150(66560, local13, local8);
			this.method2150(4096, local13 - 1, local8);
			this.method2150(16384, local13, local8 + 1);
		}
		if (arg3 == 1) {
			this.method2150(5120, local13, local8);
			this.method2150(16384, local13, local8 + 1);
			this.method2150(65536, local13 + 1, local8);
		}
		if (arg3 == 2) {
			this.method2150(20480, local13, local8);
			this.method2150(65536, local13 + 1, local8);
			this.method2150(1024, local13, local8 - 1);
		}
		if (arg3 == 3) {
			this.method2150(81920, local13, local8);
			this.method2150(1024, local13, local8 - 1);
			this.method2150(4096, local13 - 1, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method2155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg2 + arg1 - 1;
		@Pc(23) int local23 = arg6 + arg5 - 1;
		if (arg6 <= arg4 && arg4 <= local23 && arg1 <= arg3 && arg3 <= local5) {
			return true;
		} else if (arg4 == arg6 - 1 && arg1 <= arg3 && local5 >= arg3 && (this.anIntArrayArray34[arg4 - this.anInt2945][arg3 - this.anInt2958] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg4 == local23 + 1 && arg1 <= arg3 && local5 >= arg3 && (this.anIntArrayArray34[arg4 - this.anInt2945][arg3 - this.anInt2958] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg1 - 1 && arg4 >= arg6 && local23 >= arg4 && (this.anIntArrayArray34[arg4 - this.anInt2945][arg3 - this.anInt2958] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local5 + 1 && arg6 <= arg4 && local23 >= arg4 && (this.anIntArrayArray34[arg4 - this.anInt2945][arg3 - this.anInt2958] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZIIIII)V")
	public void method2156(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt2945;
		@Pc(16) int local16;
		if (arg1 == 1 || arg1 == 3) {
			local16 = arg4;
			arg4 = arg3;
			arg3 = local16;
		}
		@Pc(29) int local29 = arg2 - this.anInt2958;
		@Pc(31) int local31 = 256;
		if (arg0) {
			local31 = 131328;
		}
		for (local16 = local6; local16 < arg4 + local6; local16++) {
			if (local16 >= 0 && this.anInt2952 > local16) {
				for (@Pc(62) int local62 = local29; local62 < local29 + arg3; local62++) {
					if (local62 >= 0 && this.anInt2943 > local62) {
						this.method2153(local16, local31, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public void method2157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt2945;
		@Pc(17) int local17 = arg0 - this.anInt2958;
		this.anIntArrayArray34[local12][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method2159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg0 && arg2 == arg5) {
			return true;
		}
		@Pc(24) int local24 = arg2 - this.anInt2958;
		@Pc(29) int local29 = arg0 - this.anInt2945;
		@Pc(34) int local34 = arg5 - this.anInt2958;
		@Pc(39) int local39 = arg1 - this.anInt2945;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local29 == local39 + 1 && local24 == local34 && (this.anIntArrayArray34[local29][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local39 && local24 == local34 - 1 && (this.anIntArrayArray34[local29][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local39 - 1 == local29 && local34 == local24 && (this.anIntArrayArray34[local29][local24] & 0x8) == 0) {
					return true;
				}
				if (local29 == local39 && local34 - 1 == local24 && (this.anIntArrayArray34[local29][local24] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local29 == local39 - 1 && local34 == local24 && (this.anIntArrayArray34[local29][local24] & 0x8) == 0) {
					return true;
				}
				if (local39 == local29 && local24 == local34 + 1 && (this.anIntArrayArray34[local29][local24] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local29 == local39 + 1 && local34 == local24 && (this.anIntArrayArray34[local29][local24] & 0x80) == 0) {
					return true;
				}
				if (local29 == local39 && local34 + 1 == local24 && (this.anIntArrayArray34[local29][local24] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local39 == local29 && local34 + 1 == local24 && (this.anIntArrayArray34[local29][local24] & 0x20) == 0) {
				return true;
			}
			if (local29 == local39 && local24 == local34 - 1 && (this.anIntArrayArray34[local29][local24] & 0x2) == 0) {
				return true;
			}
			if (local39 - 1 == local29 && local24 == local34 && (this.anIntArrayArray34[local29][local24] & 0x8) == 0) {
				return true;
			}
			if (local29 == local39 + 1 && local24 == local34 && (this.anIntArrayArray34[local29][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIIIZ)V")
	public void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0 - this.anInt2958;
		@Pc(20) int local20 = 256;
		if (arg1) {
			local20 = 131328;
		}
		@Pc(31) int local31 = arg4 - this.anInt2945;
		for (@Pc(33) int local33 = local31; local33 < local31 + arg3; local33++) {
			if (local33 >= 0 && local33 < this.anInt2952) {
				for (@Pc(43) int local43 = local6; local43 < arg2 + local6; local43++) {
					if (local43 >= 0 && local43 < this.anInt2943) {
						this.method2150(local20, local33, local43);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IBI)V")
	public void method2161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2945;
		@Pc(13) int local13 = arg0 - this.anInt2958;
		this.anIntArrayArray34[local8][local13] |= 0x200000;
	}
}

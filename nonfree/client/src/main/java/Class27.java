import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class27 {

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	private final int anInt1237 = 0;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	private final int anInt1229 = 0;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	private final int anInt1224;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	private final int anInt1232;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[[I")
	public final int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(II)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1224 = arg0;
		this.anInt1232 = arg1;
		this.anIntArrayArray16 = new int[this.anInt1224][this.anInt1232];
		this.method943();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIII)V")
	private void method931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray16[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIII)V")
	public void method933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg1 - this.anInt1229;
		@Pc(17) int local17 = arg0 - this.anInt1237;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method946(128, local17, local12);
				this.method946(8, local17, local12 - 1);
			}
			if (arg3 == 1) {
				this.method946(2, local17, local12);
				this.method946(32, local17 + 1, local12);
			}
			if (arg3 == 2) {
				this.method946(8, local17, local12);
				this.method946(128, local17, local12 + 1);
			}
			if (arg3 == 3) {
				this.method946(32, local17, local12);
				this.method946(2, local17 - 1, local12);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method946(1, local17, local12);
				this.method946(16, local17 + 1, local12 + -1);
			}
			if (arg3 == 1) {
				this.method946(4, local17, local12);
				this.method946(64, local17 + 1, local12 + 1);
			}
			if (arg3 == 2) {
				this.method946(16, local17, local12);
				this.method946(1, local17 - 1, local12 + 1);
			}
			if (arg3 == 3) {
				this.method946(64, local17, local12);
				this.method946(4, local17 - 1, local12 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method946(130, local17, local12);
				this.method946(8, local17, local12 - 1);
				this.method946(32, local17 + 1, local12);
			}
			if (arg3 == 1) {
				this.method946(10, local17, local12);
				this.method946(32, local17 + 1, local12);
				this.method946(128, local17, local12 + 1);
			}
			if (arg3 == 2) {
				this.method946(40, local17, local12);
				this.method946(128, local17, local12 + 1);
				this.method946(2, local17 - 1, local12);
			}
			if (arg3 == 3) {
				this.method946(160, local17, local12);
				this.method946(2, local17 - 1, local12);
				this.method946(8, local17, local12 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method946(65536, local17, local12);
				this.method946(4096, local17, local12 - 1);
			}
			if (arg3 == 1) {
				this.method946(1024, local17, local12);
				this.method946(16384, local17 + 1, local12);
			}
			if (arg3 == 2) {
				this.method946(4096, local17, local12);
				this.method946(65536, local17, local12 + 1);
			}
			if (arg3 == 3) {
				this.method946(16384, local17, local12);
				this.method946(1024, local17 - 1, local12);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method946(512, local17, local12);
				this.method946(8192, local17 + 1, local12 + -1);
			}
			if (arg3 == 1) {
				this.method946(2048, local17, local12);
				this.method946(32768, local17 + 1, local12 + 1);
			}
			if (arg3 == 2) {
				this.method946(8192, local17, local12);
				this.method946(512, local17 - 1, local12 + 1);
			}
			if (arg3 == 3) {
				this.method946(32768, local17, local12);
				this.method946(2048, local17 - 1, local12 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method946(66560, local17, local12);
			this.method946(4096, local17, local12 - 1);
			this.method946(16384, local17 + 1, local12);
		}
		if (arg3 == 1) {
			this.method946(5120, local17, local12);
			this.method946(16384, local17 + 1, local12);
			this.method946(65536, local17, local12 + 1);
		}
		if (arg3 == 2) {
			this.method946(20480, local17, local12);
			this.method946(65536, local17, local12 + 1);
			this.method946(1024, local17 - 1, local12);
		}
		if (arg3 == 3) {
			this.method946(81920, local17, local12);
			this.method946(1024, local17 - 1, local12);
			this.method946(4096, local17, local12 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg0 && arg2 == arg5) {
			return true;
		}
		@Pc(16) int local16 = arg0 - this.anInt1229;
		@Pc(21) int local21 = arg5 - this.anInt1237;
		@Pc(26) int local26 = arg3 - this.anInt1229;
		@Pc(31) int local31 = arg2 - this.anInt1237;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (local26 == local16 - 1 && local21 == local31) {
					return true;
				}
				if (local26 == local16 && local21 == local31 + 1 && (this.anIntArrayArray16[local26][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local26 == local16 && local31 - 1 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local26 == local16 && local31 + 1 == local21) {
					return true;
				}
				if (local26 == local16 - 1 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local16 + 1 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local16 + 1 == local26 && local21 == local31) {
					return true;
				}
				if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray16[local26][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray16[local26][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local26 == local16 && local31 - 1 == local21) {
					return true;
				}
				if (local26 == local16 - 1 && local21 == local31 && (this.anIntArrayArray16[local26][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local16 + 1 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				if (local26 == local16 - 1 && local31 == local21) {
					return true;
				}
				if (local16 == local26 && local21 == local31 + 1) {
					return true;
				}
				if (local16 + 1 == local26 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0180) == 0) {
					return true;
				}
				if (local26 == local16 && local31 - 1 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local26 == local16 - 1 && local21 == local31 && (this.anIntArrayArray16[local26][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local16 == local26 && local31 + 1 == local21) {
					return true;
				}
				if (local26 == local16 + 1 && local21 == local31) {
					return true;
				}
				if (local16 == local26 && local31 - 1 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local26 == local16 - 1 && local21 == local31 && (this.anIntArrayArray16[local26][local21] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local16 && local31 + 1 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local26 == local16 + 1 && local21 == local31) {
					return true;
				}
				if (local16 == local26 && local31 - 1 == local21) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local26 == local16 - 1 && local21 == local31) {
					return true;
				}
				if (local16 == local26 && local31 + 1 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 + 1 == local26 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local26 && local31 - 1 == local21) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local16 == local26 && local31 + 1 == local21 && (this.anIntArrayArray16[local26][local21] & 0x20) == 0) {
				return true;
			}
			if (local26 == local16 && local21 == local31 - 1 && (this.anIntArrayArray16[local26][local21] & 0x2) == 0) {
				return true;
			}
			if (local16 - 1 == local26 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x8) == 0) {
				return true;
			}
			if (local16 + 1 == local26 && local31 == local21 && (this.anIntArrayArray16[local26][local21] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 - 1;
		@Pc(15) int local15 = arg5 + arg6 - 1;
		if (arg6 <= arg4 && local15 >= arg4 && arg2 <= arg0 && local5 >= arg0) {
			return true;
		} else if (arg6 - 1 == arg4 && arg0 >= arg2 && arg0 <= local5 && (this.anIntArrayArray16[arg4 - this.anInt1229][arg0 - this.anInt1237] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg4 == local15 + 1 && arg2 <= arg0 && arg0 <= local5 && (this.anIntArrayArray16[arg4 - this.anInt1229][arg0 - this.anInt1237] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg0 && arg6 <= arg4 && local15 >= arg4 && (this.anIntArrayArray16[arg4 - this.anInt1229][arg0 - this.anInt1237] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local5 + 1 && arg4 >= arg6 && local15 >= arg4 && (this.anIntArrayArray16[arg4 - this.anInt1229][arg0 - this.anInt1237] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public void method936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 - this.anInt1237;
		@Pc(18) int local18 = arg0 - this.anInt1229;
		this.anIntArrayArray16[local18][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg0 && arg1 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg0 - this.anInt1229;
		@Pc(29) int local29 = arg1 - this.anInt1237;
		@Pc(34) int local34 = arg4 - this.anInt1237;
		@Pc(39) int local39 = arg2 - this.anInt1229;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local24 + 1 == local39 && local29 == local34 && (this.anIntArrayArray16[local39][local29] & 0x80) == 0) {
					return true;
				}
				if (local39 == local24 && local29 == local34 - 1 && (this.anIntArrayArray16[local39][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local24 - 1 == local39 && local34 == local29 && (this.anIntArrayArray16[local39][local29] & 0x8) == 0) {
					return true;
				}
				if (local24 == local39 && local34 - 1 == local29 && (this.anIntArrayArray16[local39][local29] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local24 - 1 == local39 && local29 == local34 && (this.anIntArrayArray16[local39][local29] & 0x8) == 0) {
					return true;
				}
				if (local24 == local39 && local29 == local34 + 1 && (this.anIntArrayArray16[local39][local29] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local24 + 1 == local39 && local34 == local29 && (this.anIntArrayArray16[local39][local29] & 0x80) == 0) {
					return true;
				}
				if (local24 == local39 && local34 + 1 == local29 && (this.anIntArrayArray16[local39][local29] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local24 == local39 && local34 + 1 == local29 && (this.anIntArrayArray16[local39][local29] & 0x20) == 0) {
				return true;
			}
			if (local24 == local39 && local29 == local34 - 1 && (this.anIntArrayArray16[local39][local29] & 0x2) == 0) {
				return true;
			}
			if (local39 == local24 - 1 && local29 == local34 && (this.anIntArrayArray16[local39][local29] & 0x8) == 0) {
				return true;
			}
			if (local24 + 1 == local39 && local29 == local34 && (this.anIntArrayArray16[local39][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIZI)V")
	public void method939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg1 - this.anInt1237;
		@Pc(15) int local15 = arg0 - this.anInt1229;
		@Pc(23) int local23 = 256;
		if (arg4) {
			local23 = 131328;
		}
		@Pc(41) int local41;
		if (arg2 == 1 || arg2 == 3) {
			local41 = arg3;
			arg3 = arg5;
			arg5 = local41;
		}
		for (local41 = local15; local41 < local15 + arg3; local41++) {
			if (local41 >= 0 && local41 < this.anInt1224) {
				for (@Pc(60) int local60 = local6; local60 < arg5 + local6; local60++) {
					if (local60 >= 0 && local60 < this.anInt1232) {
						this.method946(local23, local60, local41);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
	public void method940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1229;
		@Pc(13) int local13 = arg0 - this.anInt1237;
		this.anIntArrayArray16[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIZI)V")
	public void method941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 - this.anInt1229;
		@Pc(13) int local13 = arg3 - this.anInt1237;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method931(local8, local13, 128);
				this.method931(local8 - 1, local13, 8);
			}
			if (arg4 == 1) {
				this.method931(local8, local13, 2);
				this.method931(local8, local13 + 1, 32);
			}
			if (arg4 == 2) {
				this.method931(local8, local13, 8);
				this.method931(local8 + 1, local13, 128);
			}
			if (arg4 == 3) {
				this.method931(local8, local13, 32);
				this.method931(local8, local13 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method931(local8, local13, 1);
				this.method931(local8 - 1, local13 + 1, 16);
			}
			if (arg4 == 1) {
				this.method931(local8, local13, 4);
				this.method931(local8 + 1, local13 + 1, 64);
			}
			if (arg4 == 2) {
				this.method931(local8, local13, 16);
				this.method931(local8 + 1, local13 + -1, 1);
			}
			if (arg4 == 3) {
				this.method931(local8, local13, 64);
				this.method931(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method931(local8, local13, 130);
				this.method931(local8 - 1, local13, 8);
				this.method931(local8, local13 + 1, 32);
			}
			if (arg4 == 1) {
				this.method931(local8, local13, 10);
				this.method931(local8, local13 + 1, 32);
				this.method931(local8 + 1, local13, 128);
			}
			if (arg4 == 2) {
				this.method931(local8, local13, 40);
				this.method931(local8 + 1, local13, 128);
				this.method931(local8, local13 - 1, 2);
			}
			if (arg4 == 3) {
				this.method931(local8, local13, 160);
				this.method931(local8, local13 - 1, 2);
				this.method931(local8 - 1, local13, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method931(local8, local13, 65536);
				this.method931(local8 - 1, local13, 4096);
			}
			if (arg4 == 1) {
				this.method931(local8, local13, 1024);
				this.method931(local8, local13 + 1, 16384);
			}
			if (arg4 == 2) {
				this.method931(local8, local13, 4096);
				this.method931(local8 + 1, local13, 65536);
			}
			if (arg4 == 3) {
				this.method931(local8, local13, 16384);
				this.method931(local8, local13 - 1, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method931(local8, local13, 512);
				this.method931(local8 - 1, local13 + 1, 8192);
			}
			if (arg4 == 1) {
				this.method931(local8, local13, 2048);
				this.method931(local8 + 1, local13 + 1, 32768);
			}
			if (arg4 == 2) {
				this.method931(local8, local13, 8192);
				this.method931(local8 + 1, local13 + -1, 512);
			}
			if (arg4 == 3) {
				this.method931(local8, local13, 32768);
				this.method931(local8 - 1, local13 - 1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method931(local8, local13, 66560);
			this.method931(local8 - 1, local13, 4096);
			this.method931(local8, local13 + 1, 16384);
		}
		if (arg4 == 1) {
			this.method931(local8, local13, 5120);
			this.method931(local8, local13 + 1, 16384);
			this.method931(local8 + 1, local13, 65536);
		}
		if (arg4 == 2) {
			this.method931(local8, local13, 20480);
			this.method931(local8 + 1, local13, 65536);
			this.method931(local8, local13 - 1, 1024);
		}
		if (arg4 == 3) {
			this.method931(local8, local13, 81920);
			this.method931(local8, local13 - 1, 1024);
			this.method931(local8 - 1, local13, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)V")
	public void method942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1237;
		@Pc(21) int local21 = arg0 - this.anInt1229;
		this.anIntArrayArray16[local21][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public void method943() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1224; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1232; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt1224 - 5 <= local11 || local15 >= this.anInt1232 - 5) {
					this.anIntArrayArray16[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray16[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIZ)V")
	public void method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) int local10 = arg1 - this.anInt1229;
		@Pc(15) int local15 = arg2 - this.anInt1237;
		@Pc(21) int local21 = 256;
		if (arg4) {
			local21 = 131328;
		}
		for (@Pc(29) int local29 = local10; local29 < arg3 + local10; local29++) {
			if (local29 >= 0 && local29 < this.anInt1224) {
				for (@Pc(39) int local39 = local15; local39 < local15 + arg0; local39++) {
					if (local39 >= 0 && this.anInt1232 > local39) {
						this.method931(local29, local39, local21);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBII)V")
	private void method946(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray16[arg2][arg1] &= ~arg0;
	}
}

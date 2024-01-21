import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class50 {

	@OriginalMember(owner = "client!na", name = "v", descriptor = "I")
	private final int anInt1952 = 0;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "I")
	private final int anInt1948;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	private final int anInt1949;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "I")
	private final int anInt1941;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1948 = arg1;
		this.anInt1949 = 0;
		this.anInt1941 = arg0;
		this.anIntArrayArray16 = new int[this.anInt1941][this.anInt1948];
		this.method1380();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZIIII)V")
	public void method1374(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg3 - this.anInt1952;
		@Pc(19) int local19 = arg2 - this.anInt1949;
		@Pc(25) int local25 = 256;
		if (arg1) {
			local25 = 131328;
		}
		for (@Pc(33) int local33 = local6; local33 < local6 + arg0; local33++) {
			if (local33 >= 0 && this.anInt1941 > local33) {
				for (@Pc(50) int local50 = local19; local50 < local19 + arg4; local50++) {
					if (local50 >= 0 && this.anInt1948 > local50) {
						this.method1381(local33, local50, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public void method1375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1949;
		@Pc(9) int local9 = arg1 - this.anInt1952;
		this.anIntArrayArray16[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IZIIII)V")
	public void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt1952;
		@Pc(13) int local13 = arg2 - this.anInt1949;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1381(local4, local13, 128);
				this.method1381(local4 - 1, local13, 8);
			}
			if (arg3 == 1) {
				this.method1381(local4, local13, 2);
				this.method1381(local4, local13 + 1, 32);
			}
			if (arg3 == 2) {
				this.method1381(local4, local13, 8);
				this.method1381(local4 + 1, local13, 128);
			}
			if (arg3 == 3) {
				this.method1381(local4, local13, 32);
				this.method1381(local4, local13 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1381(local4, local13, 1);
				this.method1381(local4 - 1, local13 - -1, 16);
			}
			if (arg3 == 1) {
				this.method1381(local4, local13, 4);
				this.method1381(local4 + 1, local13 + 1, 64);
			}
			if (arg3 == 2) {
				this.method1381(local4, local13, 16);
				this.method1381(local4 + 1, local13 - 1, 1);
			}
			if (arg3 == 3) {
				this.method1381(local4, local13, 64);
				this.method1381(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method1381(local4, local13, 130);
				this.method1381(local4 - 1, local13, 8);
				this.method1381(local4, local13 + 1, 32);
			}
			if (arg3 == 1) {
				this.method1381(local4, local13, 10);
				this.method1381(local4, local13 + 1, 32);
				this.method1381(local4 + 1, local13, 128);
			}
			if (arg3 == 2) {
				this.method1381(local4, local13, 40);
				this.method1381(local4 + 1, local13, 128);
				this.method1381(local4, local13 - 1, 2);
			}
			if (arg3 == 3) {
				this.method1381(local4, local13, 160);
				this.method1381(local4, local13 - 1, 2);
				this.method1381(local4 - 1, local13, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method1381(local4, local13, 65536);
				this.method1381(local4 - 1, local13, 4096);
			}
			if (arg3 == 1) {
				this.method1381(local4, local13, 1024);
				this.method1381(local4, local13 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method1381(local4, local13, 4096);
				this.method1381(local4 + 1, local13, 65536);
			}
			if (arg3 == 3) {
				this.method1381(local4, local13, 16384);
				this.method1381(local4, local13 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method1381(local4, local13, 512);
				this.method1381(local4 - 1, local13 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method1381(local4, local13, 2048);
				this.method1381(local4 + 1, local13 - -1, 32768);
			}
			if (arg3 == 2) {
				this.method1381(local4, local13, 8192);
				this.method1381(local4 + 1, local13 + -1, 512);
			}
			if (arg3 == 3) {
				this.method1381(local4, local13, 32768);
				this.method1381(local4 - 1, local13 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1381(local4, local13, 66560);
			this.method1381(local4 - 1, local13, 4096);
			this.method1381(local4, local13 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method1381(local4, local13, 5120);
			this.method1381(local4, local13 + 1, 16384);
			this.method1381(local4 + 1, local13, 65536);
		}
		if (arg3 == 2) {
			this.method1381(local4, local13, 20480);
			this.method1381(local4 + 1, local13, 65536);
			this.method1381(local4, local13 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method1381(local4, local13, 81920);
			this.method1381(local4, local13 - 1, 1024);
			this.method1381(local4 - 1, local13, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
	private void method1377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray16[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIZI)V")
	public void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13;
		if (arg1 == 1 || arg1 == 3) {
			local13 = arg5;
			arg5 = arg3;
			arg3 = local13;
		}
		@Pc(19) int local19 = 256;
		@Pc(28) int local28 = arg0 - this.anInt1949;
		@Pc(33) int local33 = arg2 - this.anInt1952;
		if (arg4) {
			local19 = 131328;
		}
		for (local13 = local33; local13 < arg5 + local33; local13++) {
			if (local13 >= 0 && local13 < this.anInt1941) {
				for (@Pc(51) int local51 = local28; local51 < local28 + arg3; local51++) {
					if (local51 >= 0 && this.anInt1948 > local51) {
						this.method1377(local13, local19, local51);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public void method1380() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1941; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt1948; local12++) {
				if (local8 == 0 || local12 == 0 || this.anInt1941 - 5 <= local8 || this.anInt1948 - 5 <= local12) {
					this.anIntArrayArray16[local8][local12] = 16777215;
				} else {
					this.anIntArrayArray16[local8][local12] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIII)V")
	private void method1381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray16[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg2 && arg4 == arg3) {
			return true;
		}
		@Pc(25) int local25 = arg3 - this.anInt1949;
		@Pc(30) int local30 = arg4 - this.anInt1949;
		@Pc(35) int local35 = arg1 - this.anInt1952;
		@Pc(40) int local40 = arg2 - this.anInt1952;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local40 + 1 == local35 && local25 == local30 && (this.anIntArrayArray16[local35][local30] & 0x80) == 0) {
					return true;
				}
				if (local35 == local40 && local30 == local25 - 1 && (this.anIntArrayArray16[local35][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local35 == local40 - 1 && local25 == local30 && (this.anIntArrayArray16[local35][local30] & 0x8) == 0) {
					return true;
				}
				if (local40 == local35 && local25 - 1 == local30 && (this.anIntArrayArray16[local35][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local35 == local40 - 1 && local30 == local25 && (this.anIntArrayArray16[local35][local30] & 0x8) == 0) {
					return true;
				}
				if (local40 == local35 && local25 + 1 == local30 && (this.anIntArrayArray16[local35][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local35 == local40 + 1 && local30 == local25 && (this.anIntArrayArray16[local35][local30] & 0x80) == 0) {
					return true;
				}
				if (local35 == local40 && local25 + 1 == local30 && (this.anIntArrayArray16[local35][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local35 == local40 && local25 + 1 == local30 && (this.anIntArrayArray16[local35][local30] & 0x20) == 0) {
				return true;
			}
			if (local35 == local40 && local25 - 1 == local30 && (this.anIntArrayArray16[local35][local30] & 0x2) == 0) {
				return true;
			}
			if (local35 == local40 - 1 && local25 == local30 && (this.anIntArrayArray16[local35][local30] & 0x8) == 0) {
				return true;
			}
			if (local40 + 1 == local35 && local30 == local25 && (this.anIntArrayArray16[local35][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZIIBII)V")
	public void method1384(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt1949;
		@Pc(9) int local9 = arg1 - this.anInt1952;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1377(local9, 128, local4);
				this.method1377(local9 - 1, 8, local4);
			}
			if (arg2 == 1) {
				this.method1377(local9, 2, local4);
				this.method1377(local9, 32, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1377(local9, 8, local4);
				this.method1377(local9 + 1, 128, local4);
			}
			if (arg2 == 3) {
				this.method1377(local9, 32, local4);
				this.method1377(local9, 2, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1377(local9, 1, local4);
				this.method1377(local9 - 1, 16, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1377(local9, 4, local4);
				this.method1377(local9 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1377(local9, 16, local4);
				this.method1377(local9 + 1, 1, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1377(local9, 64, local4);
				this.method1377(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method1377(local9, 130, local4);
				this.method1377(local9 - 1, 8, local4);
				this.method1377(local9, 32, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1377(local9, 10, local4);
				this.method1377(local9, 32, local4 + 1);
				this.method1377(local9 + 1, 128, local4);
			}
			if (arg2 == 2) {
				this.method1377(local9, 40, local4);
				this.method1377(local9 + 1, 128, local4);
				this.method1377(local9, 2, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1377(local9, 160, local4);
				this.method1377(local9, 2, local4 - 1);
				this.method1377(local9 - 1, 8, local4);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1377(local9, 65536, local4);
				this.method1377(local9 - 1, 4096, local4);
			}
			if (arg2 == 1) {
				this.method1377(local9, 1024, local4);
				this.method1377(local9, 16384, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1377(local9, 4096, local4);
				this.method1377(local9 + 1, 65536, local4);
			}
			if (arg2 == 3) {
				this.method1377(local9, 16384, local4);
				this.method1377(local9, 1024, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1377(local9, 512, local4);
				this.method1377(local9 - 1, 8192, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1377(local9, 2048, local4);
				this.method1377(local9 + 1, 32768, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1377(local9, 8192, local4);
				this.method1377(local9 + 1, 512, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1377(local9, 32768, local4);
				this.method1377(local9 - 1, 2048, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1377(local9, 66560, local4);
			this.method1377(local9 - 1, 4096, local4);
			this.method1377(local9, 16384, local4 + 1);
		}
		if (arg2 == 1) {
			this.method1377(local9, 5120, local4);
			this.method1377(local9, 16384, local4 + 1);
			this.method1377(local9 + 1, 65536, local4);
		}
		if (arg2 == 2) {
			this.method1377(local9, 20480, local4);
			this.method1377(local9 + 1, 65536, local4);
			this.method1377(local9, 1024, local4 - 1);
		}
		if (arg2 == 3) {
			this.method1377(local9, 81920, local4);
			this.method1377(local9, 1024, local4 - 1);
			this.method1377(local9 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg4 == arg0) {
			return true;
		}
		@Pc(16) int local16 = arg0 - this.anInt1949;
		@Pc(21) int local21 = arg4 - this.anInt1949;
		@Pc(26) int local26 = arg5 - this.anInt1952;
		@Pc(31) int local31 = arg3 - this.anInt1952;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (local26 == local31 - 1 && local16 == local21) {
					return true;
				}
				if (local31 == local26 && local16 == local21 + 1 && (this.anIntArrayArray16[local26][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local31 == local26 && local21 - 1 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local31 == local26 && local16 == local21 + 1) {
					return true;
				}
				if (local31 - 1 == local26 && local16 == local21 && (this.anIntArrayArray16[local26][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local31 + 1 == local26 && local16 == local21 && (this.anIntArrayArray16[local26][local16] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local26 == local31 + 1 && local21 == local16) {
					return true;
				}
				if (local26 == local31 && local16 == local21 + 1 && (this.anIntArrayArray16[local26][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local26 == local31 && local21 - 1 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local26 == local31 && local21 - 1 == local16) {
					return true;
				}
				if (local26 == local31 - 1 && local21 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local31 + 1 == local26 && local16 == local21 && (this.anIntArrayArray16[local26][local16] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				if (local31 - 1 == local26 && local21 == local16) {
					return true;
				}
				if (local31 == local26 && local16 == local21 + 1) {
					return true;
				}
				if (local26 == local31 + 1 && local21 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0180) == 0) {
					return true;
				}
				if (local26 == local31 && local21 - 1 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local26 == local31 - 1 && local21 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local31 && local16 == local21 + 1) {
					return true;
				}
				if (local26 == local31 + 1 && local21 == local16) {
					return true;
				}
				if (local26 == local31 && local21 - 1 == local16 && (this.anIntArrayArray16[local26][local16] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local26 == local31 - 1 && local16 == local21 && (this.anIntArrayArray16[local26][local16] & 0x12C0108) == 0) {
					return true;
				}
				if (local26 == local31 && local16 == local21 + 1 && (this.anIntArrayArray16[local26][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local31 + 1 == local26 && local21 == local16) {
					return true;
				}
				if (local26 == local31 && local16 == local21 - 1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local31 - 1 == local26 && local21 == local16) {
					return true;
				}
				if (local26 == local31 && local16 == local21 + 1 && (this.anIntArrayArray16[local26][local16] & 0x12C0120) == 0) {
					return true;
				}
				if (local26 == local31 + 1 && local16 == local21 && (this.anIntArrayArray16[local26][local16] & 0x12C0180) == 0) {
					return true;
				}
				if (local31 == local26 && local21 - 1 == local16) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local26 == local31 && local16 == local21 + 1 && (this.anIntArrayArray16[local26][local16] & 0x20) == 0) {
				return true;
			}
			if (local31 == local26 && local21 - 1 == local16 && (this.anIntArrayArray16[local26][local16] & 0x2) == 0) {
				return true;
			}
			if (local31 - 1 == local26 && local16 == local21 && (this.anIntArrayArray16[local26][local16] & 0x8) == 0) {
				return true;
			}
			if (local26 == local31 + 1 && local21 == local16 && (this.anIntArrayArray16[local26][local16] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public void method1387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1952;
		@Pc(9) int local9 = arg0 - this.anInt1949;
		this.anIntArrayArray16[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)V")
	public void method1388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1949;
		@Pc(13) int local13 = arg0 - this.anInt1952;
		this.anIntArrayArray16[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg0 + arg2 - 1;
		@Pc(25) int local25 = arg6 + arg1 - 1;
		if (arg5 >= arg2 && local18 >= arg5 && arg6 <= arg3 && local25 >= arg3) {
			return true;
		} else if (arg5 == arg2 - 1 && arg6 <= arg3 && arg3 <= local25 && (this.anIntArrayArray16[arg5 - this.anInt1952][arg3 - this.anInt1949] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg5 == local18 + 1 && arg6 <= arg3 && arg3 <= local25 && (this.anIntArrayArray16[arg5 - this.anInt1952][arg3 - this.anInt1949] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg3 && arg2 <= arg5 && arg5 <= local18 && (this.anIntArrayArray16[arg5 - this.anInt1952][arg3 - this.anInt1949] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local25 + 1 && arg5 >= arg2 && local18 >= arg5 && (this.anIntArrayArray16[arg5 - this.anInt1952][arg3 - this.anInt1949] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}
}

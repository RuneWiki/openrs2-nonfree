import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class21 {

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
	private final int anInt982;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	private final int anInt974;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "[[I")
	public final int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	private final int anInt983;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private final int anInt984;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt982 = arg1;
		this.anInt974 = arg0;
		this.anIntArrayArray12 = new int[this.anInt974][this.anInt982];
		this.anInt983 = 0;
		this.anInt984 = 0;
		this.method805();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIZI)V")
	public void method793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt983;
		@Pc(13) int local13 = arg0 - this.anInt984;
		@Pc(15) int local15 = 256;
		if (arg4) {
			local15 = 131328;
		}
		@Pc(31) int local31;
		if (arg5 == 1 || arg5 == 3) {
			local31 = arg2;
			arg2 = arg1;
			arg1 = local31;
		}
		for (local31 = local13; local31 < local13 + arg2; local31++) {
			if (local31 >= 0 && local31 < this.anInt974) {
				for (@Pc(53) int local53 = local4; local53 < local4 + arg1; local53++) {
					if (local53 >= 0 && local53 < this.anInt982) {
						this.method797(local15, local31, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIIIII)Z")
	public boolean method794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg3 - 1;
		@Pc(15) int local15 = arg0 + arg1 - 1;
		if (arg4 >= arg3 && arg4 <= local9 && arg2 >= arg0 && arg2 <= local15) {
			return true;
		} else if (arg4 == arg3 - 1 && arg2 >= arg0 && local15 >= arg2 && (this.anIntArrayArray12[arg4 - this.anInt984][arg2 - this.anInt983] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg4 && arg0 <= arg2 && arg2 <= local15 && (this.anIntArrayArray12[arg4 - this.anInt984][arg2 - this.anInt983] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg0 - 1 && arg3 <= arg4 && arg4 <= local9 && (this.anIntArrayArray12[arg4 - this.anInt984][arg2 - this.anInt983] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local15 + 1 == arg2 && arg4 >= arg3 && local9 >= arg4 && (this.anIntArrayArray12[arg4 - this.anInt984][arg2 - this.anInt983] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	private void method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg5 && arg0 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg1 - this.anInt984;
		@Pc(25) int local25 = arg5 - this.anInt984;
		@Pc(30) int local30 = arg0 - this.anInt983;
		@Pc(35) int local35 = arg3 - this.anInt983;
		if (arg2 == 0) {
			if (arg4 == 0) {
				if (local20 - 1 == local25 && local30 == local35) {
					return true;
				}
				if (local20 == local25 && local35 + 1 == local30 && (this.anIntArrayArray12[local25][local30] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local35 - 1 && (this.anIntArrayArray12[local25][local30] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local20 == local25 && local30 == local35 + 1) {
					return true;
				}
				if (local25 == local20 - 1 && local35 == local30 && (this.anIntArrayArray12[local25][local30] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local20 + 1 && local35 == local30 && (this.anIntArrayArray12[local25][local30] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local20 + 1 == local25 && local35 == local30) {
					return true;
				}
				if (local25 == local20 && local35 + 1 == local30 && (this.anIntArrayArray12[local25][local30] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local35 - 1 && (this.anIntArrayArray12[local25][local30] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local20 == local25 && local35 - 1 == local30) {
					return true;
				}
				if (local20 - 1 == local25 && local30 == local35 && (this.anIntArrayArray12[local25][local30] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 + 1 == local25 && local30 == local35 && (this.anIntArrayArray12[local25][local30] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				if (local20 - 1 == local25 && local30 == local35) {
					return true;
				}
				if (local20 == local25 && local30 == local35 + 1) {
					return true;
				}
				if (local25 == local20 + 1 && local30 == local35 && (this.anIntArrayArray12[local25][local30] & 0x12C0180) == 0) {
					return true;
				}
				if (local25 == local20 && local30 == local35 - 1 && (this.anIntArrayArray12[local25][local30] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local20 - 1 == local25 && local30 == local35 && (this.anIntArrayArray12[local25][local30] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local35 + 1) {
					return true;
				}
				if (local25 == local20 + 1 && local30 == local35) {
					return true;
				}
				if (local20 == local25 && local30 == local35 - 1 && (this.anIntArrayArray12[local25][local30] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local20 - 1 && local30 == local35 && (this.anIntArrayArray12[local25][local30] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local25 && local30 == local35 + 1 && (this.anIntArrayArray12[local25][local30] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local20 + 1 && local30 == local35) {
					return true;
				}
				if (local25 == local20 && local35 - 1 == local30) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local20 - 1 == local25 && local30 == local35) {
					return true;
				}
				if (local25 == local20 && local30 == local35 + 1 && (this.anIntArrayArray12[local25][local30] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 + 1 == local25 && local30 == local35 && (this.anIntArrayArray12[local25][local30] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local25 && local35 - 1 == local30) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local20 == local25 && local30 == local35 + 1 && (this.anIntArrayArray12[local25][local30] & 0x20) == 0) {
				return true;
			}
			if (local20 == local25 && local35 - 1 == local30 && (this.anIntArrayArray12[local25][local30] & 0x2) == 0) {
				return true;
			}
			if (local20 - 1 == local25 && local35 == local30 && (this.anIntArrayArray12[local25][local30] & 0x8) == 0) {
				return true;
			}
			if (local25 == local20 + 1 && local35 == local30 && (this.anIntArrayArray12[local25][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIII)V")
	private void method799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray12[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIIZI)V")
	public void method800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - this.anInt984;
		@Pc(15) int local15 = arg0 - this.anInt983;
		@Pc(21) int local21 = 256;
		if (arg3) {
			local21 = 131328;
		}
		for (@Pc(29) int local29 = local10; local29 < arg1 + local10; local29++) {
			if (local29 >= 0 && this.anInt974 > local29) {
				for (@Pc(45) int local45 = local15; local45 < arg4 + local15; local45++) {
					if (local45 >= 0 && this.anInt982 > local45) {
						this.method799(local21, local45, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)V")
	public void method801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt983;
		@Pc(9) int local9 = arg1 - this.anInt984;
		this.anIntArrayArray12[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)V")
	public void method802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt983;
		@Pc(18) int local18 = arg0 - this.anInt984;
		this.anIntArrayArray12[local18][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public void method803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt984;
		@Pc(9) int local9 = arg0 - this.anInt983;
		this.anIntArrayArray12[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBIIZ)V")
	public void method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) int local14 = arg3 - this.anInt984;
		@Pc(19) int local19 = arg0 - this.anInt983;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method799(128, local19, local14);
				this.method799(8, local19, local14 - 1);
			}
			if (arg1 == 1) {
				this.method799(2, local19, local14);
				this.method799(32, local19 + 1, local14);
			}
			if (arg1 == 2) {
				this.method799(8, local19, local14);
				this.method799(128, local19, local14 + 1);
			}
			if (arg1 == 3) {
				this.method799(32, local19, local14);
				this.method799(2, local19 - 1, local14);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method799(1, local19, local14);
				this.method799(16, local19 + 1, local14 + -1);
			}
			if (arg1 == 1) {
				this.method799(4, local19, local14);
				this.method799(64, local19 + 1, local14 - -1);
			}
			if (arg1 == 2) {
				this.method799(16, local19, local14);
				this.method799(1, local19 - 1, local14 + 1);
			}
			if (arg1 == 3) {
				this.method799(64, local19, local14);
				this.method799(4, local19 - 1, local14 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method799(130, local19, local14);
				this.method799(8, local19, local14 - 1);
				this.method799(32, local19 + 1, local14);
			}
			if (arg1 == 1) {
				this.method799(10, local19, local14);
				this.method799(32, local19 + 1, local14);
				this.method799(128, local19, local14 + 1);
			}
			if (arg1 == 2) {
				this.method799(40, local19, local14);
				this.method799(128, local19, local14 + 1);
				this.method799(2, local19 - 1, local14);
			}
			if (arg1 == 3) {
				this.method799(160, local19, local14);
				this.method799(2, local19 - 1, local14);
				this.method799(8, local19, local14 - 1);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method799(65536, local19, local14);
				this.method799(4096, local19, local14 - 1);
			}
			if (arg1 == 1) {
				this.method799(1024, local19, local14);
				this.method799(16384, local19 + 1, local14);
			}
			if (arg1 == 2) {
				this.method799(4096, local19, local14);
				this.method799(65536, local19, local14 + 1);
			}
			if (arg1 == 3) {
				this.method799(16384, local19, local14);
				this.method799(1024, local19 - 1, local14);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method799(512, local19, local14);
				this.method799(8192, local19 + 1, local14 + -1);
			}
			if (arg1 == 1) {
				this.method799(2048, local19, local14);
				this.method799(32768, local19 + 1, local14 + 1);
			}
			if (arg1 == 2) {
				this.method799(8192, local19, local14);
				this.method799(512, local19 - 1, local14 - -1);
			}
			if (arg1 == 3) {
				this.method799(32768, local19, local14);
				this.method799(2048, local19 - 1, local14 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method799(66560, local19, local14);
			this.method799(4096, local19, local14 - 1);
			this.method799(16384, local19 + 1, local14);
		}
		if (arg1 == 1) {
			this.method799(5120, local19, local14);
			this.method799(16384, local19 + 1, local14);
			this.method799(65536, local19, local14 + 1);
		}
		if (arg1 == 2) {
			this.method799(20480, local19, local14);
			this.method799(65536, local19, local14 + 1);
			this.method799(1024, local19 - 1, local14);
		}
		if (arg1 == 3) {
			this.method799(81920, local19, local14);
			this.method799(1024, local19 - 1, local14);
			this.method799(4096, local19, local14 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method805() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt974; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt982; local4++) {
				if (local1 == 0 || local4 == 0 || local1 >= this.anInt974 - 5 || this.anInt982 - 5 <= local4) {
					this.anIntArrayArray12[local1][local4] = 16777215;
				} else {
					this.anIntArrayArray12[local1][local4] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIII)V")
	public void method806(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt984;
		@Pc(9) int local9 = arg4 - this.anInt983;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method797(128, local4, local9);
				this.method797(8, local4 - 1, local9);
			}
			if (arg3 == 1) {
				this.method797(2, local4, local9);
				this.method797(32, local4, local9 + 1);
			}
			if (arg3 == 2) {
				this.method797(8, local4, local9);
				this.method797(128, local4 + 1, local9);
			}
			if (arg3 == 3) {
				this.method797(32, local4, local9);
				this.method797(2, local4, local9 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method797(1, local4, local9);
				this.method797(16, local4 - 1, local9 + 1);
			}
			if (arg3 == 1) {
				this.method797(4, local4, local9);
				this.method797(64, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method797(16, local4, local9);
				this.method797(1, local4 + 1, local9 + -1);
			}
			if (arg3 == 3) {
				this.method797(64, local4, local9);
				this.method797(4, local4 - 1, local9 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method797(130, local4, local9);
				this.method797(8, local4 - 1, local9);
				this.method797(32, local4, local9 + 1);
			}
			if (arg3 == 1) {
				this.method797(10, local4, local9);
				this.method797(32, local4, local9 + 1);
				this.method797(128, local4 + 1, local9);
			}
			if (arg3 == 2) {
				this.method797(40, local4, local9);
				this.method797(128, local4 + 1, local9);
				this.method797(2, local4, local9 - 1);
			}
			if (arg3 == 3) {
				this.method797(160, local4, local9);
				this.method797(2, local4, local9 - 1);
				this.method797(8, local4 - 1, local9);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method797(65536, local4, local9);
				this.method797(4096, local4 - 1, local9);
			}
			if (arg3 == 1) {
				this.method797(1024, local4, local9);
				this.method797(16384, local4, local9 + 1);
			}
			if (arg3 == 2) {
				this.method797(4096, local4, local9);
				this.method797(65536, local4 + 1, local9);
			}
			if (arg3 == 3) {
				this.method797(16384, local4, local9);
				this.method797(1024, local4, local9 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method797(512, local4, local9);
				this.method797(8192, local4 - 1, local9 - -1);
			}
			if (arg3 == 1) {
				this.method797(2048, local4, local9);
				this.method797(32768, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method797(8192, local4, local9);
				this.method797(512, local4 + 1, local9 + -1);
			}
			if (arg3 == 3) {
				this.method797(32768, local4, local9);
				this.method797(2048, local4 - 1, local9 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method797(66560, local4, local9);
			this.method797(4096, local4 - 1, local9);
			this.method797(16384, local4, local9 + 1);
		}
		if (arg3 == 1) {
			this.method797(5120, local4, local9);
			this.method797(16384, local4, local9 + 1);
			this.method797(65536, local4 + 1, local9);
		}
		if (arg3 == 2) {
			this.method797(20480, local4, local9);
			this.method797(65536, local4 + 1, local9);
			this.method797(1024, local4, local9 - 1);
		}
		if (arg3 == 3) {
			this.method797(81920, local4, local9);
			this.method797(1024, local4, local9 - 1);
			this.method797(4096, local4 - 1, local9);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIB)Z")
	public boolean method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 == arg5 && arg4 == arg2) {
			return true;
		}
		@Pc(25) int local25 = arg2 - this.anInt983;
		@Pc(30) int local30 = arg5 - this.anInt984;
		@Pc(35) int local35 = arg4 - this.anInt983;
		@Pc(40) int local40 = arg3 - this.anInt984;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local40 == local30 + 1 && local25 == local35 && (this.anIntArrayArray12[local40][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local40 && local35 - 1 == local25 && (this.anIntArrayArray12[local40][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local40 == local30 - 1 && local35 == local25 && (this.anIntArrayArray12[local40][local25] & 0x8) == 0) {
					return true;
				}
				if (local40 == local30 && local35 - 1 == local25 && (this.anIntArrayArray12[local40][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local40 == local30 - 1 && local25 == local35 && (this.anIntArrayArray12[local40][local25] & 0x8) == 0) {
					return true;
				}
				if (local30 == local40 && local35 + 1 == local25 && (this.anIntArrayArray12[local40][local25] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local30 + 1 == local40 && local25 == local35 && (this.anIntArrayArray12[local40][local25] & 0x80) == 0) {
					return true;
				}
				if (local40 == local30 && local35 + 1 == local25 && (this.anIntArrayArray12[local40][local25] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 8) {
			if (local30 == local40 && local25 == local35 + 1 && (this.anIntArrayArray12[local40][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local40 && local25 == local35 - 1 && (this.anIntArrayArray12[local40][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 - 1 == local40 && local25 == local35 && (this.anIntArrayArray12[local40][local25] & 0x8) == 0) {
				return true;
			}
			if (local40 == local30 + 1 && local35 == local25 && (this.anIntArrayArray12[local40][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class66 {

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	private final int anInt2793 = 0;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	private final int anInt2794;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	private final int anInt2796;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	private final int anInt2787;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "[[I")
	public final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(II)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2794 = arg0;
		this.anInt2796 = 0;
		this.anInt2787 = arg1;
		this.anIntArrayArray22 = new int[this.anInt2794][this.anInt2787];
		this.method1803();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	public void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2793;
		@Pc(9) int local9 = arg1 - this.anInt2796;
		this.anIntArrayArray22[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZIII)V")
	public void method1796(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg3 - this.anInt2796;
		@Pc(17) int local17 = arg0 - this.anInt2793;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1797(local17, 128, local12);
				this.method1797(local17 - 1, 8, local12);
			}
			if (arg2 == 1) {
				this.method1797(local17, 2, local12);
				this.method1797(local17, 32, local12 + 1);
			}
			if (arg2 == 2) {
				this.method1797(local17, 8, local12);
				this.method1797(local17 + 1, 128, local12);
			}
			if (arg2 == 3) {
				this.method1797(local17, 32, local12);
				this.method1797(local17, 2, local12 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1797(local17, 1, local12);
				this.method1797(local17 - 1, 16, local12 + 1);
			}
			if (arg2 == 1) {
				this.method1797(local17, 4, local12);
				this.method1797(local17 + 1, 64, local12 + 1);
			}
			if (arg2 == 2) {
				this.method1797(local17, 16, local12);
				this.method1797(local17 + 1, 1, local12 - 1);
			}
			if (arg2 == 3) {
				this.method1797(local17, 64, local12);
				this.method1797(local17 - 1, 4, local12 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method1797(local17, 130, local12);
				this.method1797(local17 - 1, 8, local12);
				this.method1797(local17, 32, local12 + 1);
			}
			if (arg2 == 1) {
				this.method1797(local17, 10, local12);
				this.method1797(local17, 32, local12 + 1);
				this.method1797(local17 + 1, 128, local12);
			}
			if (arg2 == 2) {
				this.method1797(local17, 40, local12);
				this.method1797(local17 + 1, 128, local12);
				this.method1797(local17, 2, local12 - 1);
			}
			if (arg2 == 3) {
				this.method1797(local17, 160, local12);
				this.method1797(local17, 2, local12 - 1);
				this.method1797(local17 - 1, 8, local12);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method1797(local17, 65536, local12);
				this.method1797(local17 - 1, 4096, local12);
			}
			if (arg2 == 1) {
				this.method1797(local17, 1024, local12);
				this.method1797(local17, 16384, local12 + 1);
			}
			if (arg2 == 2) {
				this.method1797(local17, 4096, local12);
				this.method1797(local17 + 1, 65536, local12);
			}
			if (arg2 == 3) {
				this.method1797(local17, 16384, local12);
				this.method1797(local17, 1024, local12 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method1797(local17, 512, local12);
				this.method1797(local17 - 1, 8192, local12 + 1);
			}
			if (arg2 == 1) {
				this.method1797(local17, 2048, local12);
				this.method1797(local17 + 1, 32768, local12 + 1);
			}
			if (arg2 == 2) {
				this.method1797(local17, 8192, local12);
				this.method1797(local17 + 1, 512, local12 - 1);
			}
			if (arg2 == 3) {
				this.method1797(local17, 32768, local12);
				this.method1797(local17 - 1, 2048, local12 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1797(local17, 66560, local12);
			this.method1797(local17 - 1, 4096, local12);
			this.method1797(local17, 16384, local12 + 1);
		}
		if (arg2 == 1) {
			this.method1797(local17, 5120, local12);
			this.method1797(local17, 16384, local12 + 1);
			this.method1797(local17 + 1, 65536, local12);
		}
		if (arg2 == 2) {
			this.method1797(local17, 20480, local12);
			this.method1797(local17 + 1, 65536, local12);
			this.method1797(local17, 1024, local12 - 1);
		}
		if (arg2 == 3) {
			this.method1797(local17, 81920, local12);
			this.method1797(local17, 1024, local12 - 1);
			this.method1797(local17 - 1, 4096, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBII)V")
	private void method1797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg0 && arg5 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg1 - this.anInt2793;
		@Pc(21) int local21 = arg3 - this.anInt2796;
		@Pc(26) int local26 = arg5 - this.anInt2796;
		@Pc(37) int local37 = arg0 - this.anInt2793;
		if (arg2 == 0) {
			if (arg4 == 0) {
				if (local16 - 1 == local37 && local21 == local26) {
					return true;
				}
				if (local37 == local16 && local26 == local21 + 1 && (this.anIntArrayArray22[local37][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 == local37 && local21 - 1 == local26 && (this.anIntArrayArray22[local37][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local16 == local37 && local26 == local21 + 1) {
					return true;
				}
				if (local37 == local16 - 1 && local26 == local21 && (this.anIntArrayArray22[local37][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 + 1 && local21 == local26 && (this.anIntArrayArray22[local37][local26] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local16 + 1 == local37 && local21 == local26) {
					return true;
				}
				if (local37 == local16 && local26 == local21 + 1 && (this.anIntArrayArray22[local37][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 == local37 && local26 == local21 - 1 && (this.anIntArrayArray22[local37][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local37 == local16 && local26 == local21 - 1) {
					return true;
				}
				if (local16 - 1 == local37 && local21 == local26 && (this.anIntArrayArray22[local37][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 + 1 && local26 == local21 && (this.anIntArrayArray22[local37][local26] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				if (local37 == local16 - 1 && local21 == local26) {
					return true;
				}
				if (local37 == local16 && local26 == local21 + 1) {
					return true;
				}
				if (local16 + 1 == local37 && local26 == local21 && (this.anIntArrayArray22[local37][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local37 && local21 - 1 == local26 && (this.anIntArrayArray22[local37][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local16 - 1 == local37 && local26 == local21 && (this.anIntArrayArray22[local37][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 && local21 + 1 == local26) {
					return true;
				}
				if (local16 + 1 == local37 && local26 == local21) {
					return true;
				}
				if (local16 == local37 && local26 == local21 - 1 && (this.anIntArrayArray22[local37][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local37 == local16 - 1 && local26 == local21 && (this.anIntArrayArray22[local37][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local37 == local16 && local26 == local21 + 1 && (this.anIntArrayArray22[local37][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local37 == local16 + 1 && local26 == local21) {
					return true;
				}
				if (local37 == local16 && local26 == local21 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local37 == local16 - 1 && local21 == local26) {
					return true;
				}
				if (local16 == local37 && local26 == local21 + 1 && (this.anIntArrayArray22[local37][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local37 == local16 + 1 && local21 == local26 && (this.anIntArrayArray22[local37][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local37 == local16 && local21 - 1 == local26) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local16 == local37 && local21 + 1 == local26 && (this.anIntArrayArray22[local37][local26] & 0x20) == 0) {
				return true;
			}
			if (local16 == local37 && local26 == local21 - 1 && (this.anIntArrayArray22[local37][local26] & 0x2) == 0) {
				return true;
			}
			if (local16 - 1 == local37 && local26 == local21 && (this.anIntArrayArray22[local37][local26] & 0x8) == 0) {
				return true;
			}
			if (local16 + 1 == local37 && local21 == local26 && (this.anIntArrayArray22[local37][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg6 - 1;
		@Pc(19) int local19 = arg4 + arg5 - 1;
		if (arg0 >= arg6 && arg0 <= local9 && arg5 <= arg2 && arg2 <= local19) {
			return true;
		} else if (arg6 - 1 == arg0 && arg5 <= arg2 && local19 >= arg2 && (this.anIntArrayArray22[arg0 - this.anInt2793][arg2 - this.anInt2796] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg0 == local9 + 1 && arg5 <= arg2 && local19 >= arg2 && (this.anIntArrayArray22[arg0 - this.anInt2793][arg2 - this.anInt2796] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg2 && arg0 >= arg6 && local9 >= arg0 && (this.anIntArrayArray22[arg0 - this.anInt2793][arg2 - this.anInt2796] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local19 + 1 == arg2 && arg6 <= arg0 && local9 >= arg0 && (this.anIntArrayArray22[arg0 - this.anInt2793][arg2 - this.anInt2796] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIIII)V")
	public void method1802(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg3 - this.anInt2796;
		@Pc(23) int local23 = arg1 - this.anInt2793;
		@Pc(33) int local33;
		if (arg2 == 1 || arg2 == 3) {
			local33 = arg4;
			arg4 = arg5;
			arg5 = local33;
		}
		@Pc(39) int local39 = 256;
		if (arg0) {
			local39 = 131328;
		}
		for (local33 = local23; local33 < arg4 + local23; local33++) {
			if (local33 >= 0 && this.anInt2794 > local33) {
				for (@Pc(57) int local57 = local6; local57 < local6 + arg5; local57++) {
					if (local57 >= 0 && local57 < this.anInt2787) {
						this.method1809(local57, local39, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public void method1803() {
		for (@Pc(19) int local19 = 0; local19 < this.anInt2794; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2787; local23++) {
				if (local19 == 0 || local23 == 0 || this.anInt2794 - 5 <= local19 || local23 >= this.anInt2787 - 5) {
					this.anIntArrayArray22[local19][local23] = 16777215;
				} else {
					this.anIntArrayArray22[local19][local23] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZI)V")
	public void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(6) int local6 = arg3 - this.anInt2793;
		@Pc(13) int local13 = 256;
		@Pc(18) int local18 = arg0 - this.anInt2796;
		if (arg4) {
			local13 = 131328;
		}
		for (@Pc(30) int local30 = local6; local30 < arg2 + local6; local30++) {
			if (local30 >= 0 && this.anInt2794 > local30) {
				for (@Pc(43) int local43 = local18; local43 < local18 + arg1; local43++) {
					if (local43 >= 0 && this.anInt2787 > local43) {
						this.method1797(local30, local13, local43);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIII)V")
	public void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt2796;
		@Pc(13) int local13 = arg0 - this.anInt2793;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1809(local8, 128, local13);
				this.method1809(local8, 8, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1809(local8, 2, local13);
				this.method1809(local8 + 1, 32, local13);
			}
			if (arg2 == 2) {
				this.method1809(local8, 8, local13);
				this.method1809(local8, 128, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1809(local8, 32, local13);
				this.method1809(local8 - 1, 2, local13);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1809(local8, 1, local13);
				this.method1809(local8 + 1, 16, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1809(local8, 4, local13);
				this.method1809(local8 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method1809(local8, 16, local13);
				this.method1809(local8 - 1, 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1809(local8, 64, local13);
				this.method1809(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method1809(local8, 130, local13);
				this.method1809(local8, 8, local13 - 1);
				this.method1809(local8 + 1, 32, local13);
			}
			if (arg2 == 1) {
				this.method1809(local8, 10, local13);
				this.method1809(local8 + 1, 32, local13);
				this.method1809(local8, 128, local13 + 1);
			}
			if (arg2 == 2) {
				this.method1809(local8, 40, local13);
				this.method1809(local8, 128, local13 + 1);
				this.method1809(local8 - 1, 2, local13);
			}
			if (arg2 == 3) {
				this.method1809(local8, 160, local13);
				this.method1809(local8 - 1, 2, local13);
				this.method1809(local8, 8, local13 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1809(local8, 65536, local13);
				this.method1809(local8, 4096, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1809(local8, 1024, local13);
				this.method1809(local8 + 1, 16384, local13);
			}
			if (arg2 == 2) {
				this.method1809(local8, 4096, local13);
				this.method1809(local8, 65536, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1809(local8, 16384, local13);
				this.method1809(local8 - 1, 1024, local13);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1809(local8, 512, local13);
				this.method1809(local8 + 1, 8192, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1809(local8, 2048, local13);
				this.method1809(local8 + 1, 32768, local13 + 1);
			}
			if (arg2 == 2) {
				this.method1809(local8, 8192, local13);
				this.method1809(local8 - 1, 512, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1809(local8, 32768, local13);
				this.method1809(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1809(local8, 66560, local13);
			this.method1809(local8, 4096, local13 - 1);
			this.method1809(local8 + 1, 16384, local13);
		}
		if (arg2 == 1) {
			this.method1809(local8, 5120, local13);
			this.method1809(local8 + 1, 16384, local13);
			this.method1809(local8, 65536, local13 + 1);
		}
		if (arg2 == 2) {
			this.method1809(local8, 20480, local13);
			this.method1809(local8, 65536, local13 + 1);
			this.method1809(local8 - 1, 1024, local13);
		}
		if (arg2 == 3) {
			this.method1809(local8, 81920, local13);
			this.method1809(local8 - 1, 1024, local13);
			this.method1809(local8, 4096, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	public void method1807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2793;
		@Pc(9) int local9 = arg0 - this.anInt2796;
		this.anIntArrayArray22[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)V")
	public void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2793;
		@Pc(9) int local9 = arg0 - this.anInt2796;
		this.anIntArrayArray22[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZII)V")
	private void method1809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg2 && arg0 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt2793;
		@Pc(25) int local25 = arg2 - this.anInt2793;
		@Pc(30) int local30 = arg3 - this.anInt2796;
		@Pc(35) int local35 = arg0 - this.anInt2796;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local25 + 1 == local20 && local30 == local35 && (this.anIntArrayArray22[local20][local35] & 0x80) == 0) {
					return true;
				}
				if (local20 == local25 && local30 - 1 == local35 && (this.anIntArrayArray22[local20][local35] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local20 == local25 - 1 && local35 == local30 && (this.anIntArrayArray22[local20][local35] & 0x8) == 0) {
					return true;
				}
				if (local20 == local25 && local30 - 1 == local35 && (this.anIntArrayArray22[local20][local35] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local25 - 1 == local20 && local30 == local35 && (this.anIntArrayArray22[local20][local35] & 0x8) == 0) {
					return true;
				}
				if (local20 == local25 && local35 == local30 + 1 && (this.anIntArrayArray22[local20][local35] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local25 + 1 == local20 && local30 == local35 && (this.anIntArrayArray22[local20][local35] & 0x80) == 0) {
					return true;
				}
				if (local20 == local25 && local35 == local30 + 1 && (this.anIntArrayArray22[local20][local35] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local25 == local20 && local35 == local30 + 1 && (this.anIntArrayArray22[local20][local35] & 0x20) == 0) {
				return true;
			}
			if (local20 == local25 && local35 == local30 - 1 && (this.anIntArrayArray22[local20][local35] & 0x2) == 0) {
				return true;
			}
			if (local25 - 1 == local20 && local30 == local35 && (this.anIntArrayArray22[local20][local35] & 0x8) == 0) {
				return true;
			}
			if (local20 == local25 + 1 && local30 == local35 && (this.anIntArrayArray22[local20][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

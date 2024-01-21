import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class30 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	private final int anInt1045;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "I")
	private final int anInt1052;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "I")
	private final int anInt1062;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	private final int anInt1053;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1045 = arg0;
		this.anInt1052 = arg1;
		this.anInt1062 = 0;
		this.anInt1053 = 0;
		this.anIntArrayArray9 = new int[this.anInt1045][this.anInt1052];
		this.method708();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIBZI)V")
	public void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 256;
		@Pc(19) int local19;
		if (arg0 == 1 || arg0 == 3) {
			local19 = arg5;
			arg5 = arg1;
			arg1 = local19;
		}
		@Pc(28) int local28 = arg2 - this.anInt1053;
		if (arg4) {
			local11 = 131328;
		}
		@Pc(39) int local39 = arg3 - this.anInt1062;
		for (local19 = local39; local19 < local39 + arg5; local19++) {
			if (local19 >= 0 && this.anInt1045 > local19) {
				for (@Pc(54) int local54 = local28; local54 < local28 + arg1; local54++) {
					if (local54 >= 0 && this.anInt1052 > local54) {
						this.method704(local54, local19, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg2 - 1;
		@Pc(15) int local15 = arg6 + arg5 - 1;
		if (arg3 >= arg5 && arg3 <= local15 && arg2 <= arg1 && local9 >= arg1) {
			return true;
		} else if (arg3 == arg5 - 1 && arg1 >= arg2 && arg1 <= local9 && (this.anIntArrayArray9[arg3 - this.anInt1062][arg1 - this.anInt1053] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local15 + 1 == arg3 && arg1 >= arg2 && local9 >= arg1 && (this.anIntArrayArray9[arg3 - this.anInt1062][arg1 - this.anInt1053] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg2 - 1 && arg5 <= arg3 && local15 >= arg3 && (this.anIntArrayArray9[arg3 - this.anInt1062][arg1 - this.anInt1053] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local9 + 1 && arg3 >= arg5 && local15 >= arg3 && (this.anIntArrayArray9[arg3 - this.anInt1062][arg1 - this.anInt1053] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIIIIZ)V")
	public void method702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg1 - this.anInt1062;
		@Pc(9) int local9 = arg2 - this.anInt1053;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method704(local9, local4, 128);
				this.method704(local9, local4 - 1, 8);
			}
			if (arg0 == 1) {
				this.method704(local9, local4, 2);
				this.method704(local9 + 1, local4, 32);
			}
			if (arg0 == 2) {
				this.method704(local9, local4, 8);
				this.method704(local9, local4 + 1, 128);
			}
			if (arg0 == 3) {
				this.method704(local9, local4, 32);
				this.method704(local9 - 1, local4, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method704(local9, local4, 1);
				this.method704(local9 + 1, local4 - 1, 16);
			}
			if (arg0 == 1) {
				this.method704(local9, local4, 4);
				this.method704(local9 + 1, local4 + 1, 64);
			}
			if (arg0 == 2) {
				this.method704(local9, local4, 16);
				this.method704(local9 - 1, local4 + 1, 1);
			}
			if (arg0 == 3) {
				this.method704(local9, local4, 64);
				this.method704(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method704(local9, local4, 130);
				this.method704(local9, local4 - 1, 8);
				this.method704(local9 + 1, local4, 32);
			}
			if (arg0 == 1) {
				this.method704(local9, local4, 10);
				this.method704(local9 + 1, local4, 32);
				this.method704(local9, local4 + 1, 128);
			}
			if (arg0 == 2) {
				this.method704(local9, local4, 40);
				this.method704(local9, local4 + 1, 128);
				this.method704(local9 - 1, local4, 2);
			}
			if (arg0 == 3) {
				this.method704(local9, local4, 160);
				this.method704(local9 - 1, local4, 2);
				this.method704(local9, local4 - 1, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method704(local9, local4, 65536);
				this.method704(local9, local4 - 1, 4096);
			}
			if (arg0 == 1) {
				this.method704(local9, local4, 1024);
				this.method704(local9 + 1, local4, 16384);
			}
			if (arg0 == 2) {
				this.method704(local9, local4, 4096);
				this.method704(local9, local4 + 1, 65536);
			}
			if (arg0 == 3) {
				this.method704(local9, local4, 16384);
				this.method704(local9 - 1, local4, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method704(local9, local4, 512);
				this.method704(local9 + 1, local4 + -1, 8192);
			}
			if (arg0 == 1) {
				this.method704(local9, local4, 2048);
				this.method704(local9 + 1, local4 - -1, 32768);
			}
			if (arg0 == 2) {
				this.method704(local9, local4, 8192);
				this.method704(local9 - 1, local4 + 1, 512);
			}
			if (arg0 == 3) {
				this.method704(local9, local4, 32768);
				this.method704(local9 - 1, local4 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method704(local9, local4, 66560);
			this.method704(local9, local4 - 1, 4096);
			this.method704(local9 + 1, local4, 16384);
		}
		if (arg0 == 1) {
			this.method704(local9, local4, 5120);
			this.method704(local9 + 1, local4, 16384);
			this.method704(local9, local4 + 1, 65536);
		}
		if (arg0 == 2) {
			this.method704(local9, local4, 20480);
			this.method704(local9, local4 + 1, 65536);
			this.method704(local9 - 1, local4, 1024);
		}
		if (arg0 == 3) {
			this.method704(local9, local4, 81920);
			this.method704(local9 - 1, local4, 1024);
			this.method704(local9, local4 - 1, 4096);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)V")
	public void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1062;
		@Pc(13) int local13 = arg1 - this.anInt1053;
		this.anIntArrayArray9[local8][local13] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBI)V")
	private void method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray9[arg1][arg0] &= 16777215 - arg2;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZIII)V")
	public void method705(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg2 - this.anInt1053;
		@Pc(17) int local17 = arg0 - this.anInt1062;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method711(local17, 128, local12);
				this.method711(local17 - 1, 8, local12);
			}
			if (arg3 == 1) {
				this.method711(local17, 2, local12);
				this.method711(local17, 32, local12 + 1);
			}
			if (arg3 == 2) {
				this.method711(local17, 8, local12);
				this.method711(local17 + 1, 128, local12);
			}
			if (arg3 == 3) {
				this.method711(local17, 32, local12);
				this.method711(local17, 2, local12 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method711(local17, 1, local12);
				this.method711(local17 - 1, 16, local12 + 1);
			}
			if (arg3 == 1) {
				this.method711(local17, 4, local12);
				this.method711(local17 + 1, 64, local12 + 1);
			}
			if (arg3 == 2) {
				this.method711(local17, 16, local12);
				this.method711(local17 + 1, 1, local12 - 1);
			}
			if (arg3 == 3) {
				this.method711(local17, 64, local12);
				this.method711(local17 - 1, 4, local12 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method711(local17, 130, local12);
				this.method711(local17 - 1, 8, local12);
				this.method711(local17, 32, local12 + 1);
			}
			if (arg3 == 1) {
				this.method711(local17, 10, local12);
				this.method711(local17, 32, local12 + 1);
				this.method711(local17 + 1, 128, local12);
			}
			if (arg3 == 2) {
				this.method711(local17, 40, local12);
				this.method711(local17 + 1, 128, local12);
				this.method711(local17, 2, local12 - 1);
			}
			if (arg3 == 3) {
				this.method711(local17, 160, local12);
				this.method711(local17, 2, local12 - 1);
				this.method711(local17 - 1, 8, local12);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method711(local17, 65536, local12);
				this.method711(local17 - 1, 4096, local12);
			}
			if (arg3 == 1) {
				this.method711(local17, 1024, local12);
				this.method711(local17, 16384, local12 + 1);
			}
			if (arg3 == 2) {
				this.method711(local17, 4096, local12);
				this.method711(local17 + 1, 65536, local12);
			}
			if (arg3 == 3) {
				this.method711(local17, 16384, local12);
				this.method711(local17, 1024, local12 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method711(local17, 512, local12);
				this.method711(local17 - 1, 8192, local12 + 1);
			}
			if (arg3 == 1) {
				this.method711(local17, 2048, local12);
				this.method711(local17 + 1, 32768, local12 + 1);
			}
			if (arg3 == 2) {
				this.method711(local17, 8192, local12);
				this.method711(local17 + 1, 512, local12 - 1);
			}
			if (arg3 == 3) {
				this.method711(local17, 32768, local12);
				this.method711(local17 - 1, 2048, local12 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method711(local17, 66560, local12);
			this.method711(local17 - 1, 4096, local12);
			this.method711(local17, 16384, local12 + 1);
		}
		if (arg3 == 1) {
			this.method711(local17, 5120, local12);
			this.method711(local17, 16384, local12 + 1);
			this.method711(local17 + 1, 65536, local12);
		}
		if (arg3 == 2) {
			this.method711(local17, 20480, local12);
			this.method711(local17 + 1, 65536, local12);
			this.method711(local17, 1024, local12 - 1);
		}
		if (arg3 == 3) {
			this.method711(local17, 81920, local12);
			this.method711(local17, 1024, local12 - 1);
			this.method711(local17 - 1, 4096, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIBIII)V")
	public void method707(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg1 - this.anInt1062;
		@Pc(15) int local15 = arg3 - this.anInt1053;
		@Pc(25) int local25;
		if (arg5 == 1 || arg5 == 3) {
			local25 = arg2;
			arg2 = arg4;
			arg4 = local25;
		}
		@Pc(31) int local31 = 256;
		if (arg0) {
			local31 = 131328;
		}
		for (local25 = local6; local25 < arg2 + local6; local25++) {
			if (local25 >= 0 && this.anInt1045 > local25) {
				for (@Pc(57) int local57 = local15; local57 < arg4 + local15; local57++) {
					if (local57 >= 0 && local57 < this.anInt1052) {
						this.method711(local25, local31, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public void method708() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1045; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1052; local15++) {
				if (local11 == 0 || local15 == 0 || local11 == this.anInt1045 - 1 || local15 == this.anInt1052 - 1) {
					this.anIntArrayArray9[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray9[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)V")
	public void method709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1053;
		@Pc(26) int local26 = arg1 - this.anInt1062;
		this.anIntArrayArray9[local26][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg5 && arg0 == arg4) {
			return true;
		}
		@Pc(24) int local24 = arg1 - this.anInt1062;
		@Pc(29) int local29 = arg5 - this.anInt1062;
		@Pc(34) int local34 = arg4 - this.anInt1053;
		@Pc(39) int local39 = arg0 - this.anInt1053;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local24 + 1 == local29 && local39 == local34 && (this.anIntArrayArray9[local29][local34] & 0x80) == 0) {
					return true;
				}
				if (local29 == local24 && local39 - 1 == local34 && (this.anIntArrayArray9[local29][local34] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local24 - 1 == local29 && local39 == local34 && (this.anIntArrayArray9[local29][local34] & 0x8) == 0) {
					return true;
				}
				if (local29 == local24 && local39 - 1 == local34 && (this.anIntArrayArray9[local29][local34] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local29 == local24 - 1 && local34 == local39 && (this.anIntArrayArray9[local29][local34] & 0x8) == 0) {
					return true;
				}
				if (local24 == local29 && local39 + 1 == local34 && (this.anIntArrayArray9[local29][local34] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local29 == local24 + 1 && local39 == local34 && (this.anIntArrayArray9[local29][local34] & 0x80) == 0) {
					return true;
				}
				if (local24 == local29 && local34 == local39 + 1 && (this.anIntArrayArray9[local29][local34] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local24 == local29 && local39 + 1 == local34 && (this.anIntArrayArray9[local29][local34] & 0x20) == 0) {
				return true;
			}
			if (local24 == local29 && local34 == local39 - 1 && (this.anIntArrayArray9[local29][local34] & 0x2) == 0) {
				return true;
			}
			if (local24 - 1 == local29 && local34 == local39 && (this.anIntArrayArray9[local29][local34] & 0x8) == 0) {
				return true;
			}
			if (local24 + 1 == local29 && local39 == local34 && (this.anIntArrayArray9[local29][local34] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIB)V")
	private void method711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray9[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg4 && arg0 == arg1) {
			return true;
		}
		@Pc(20) int local20 = arg4 - this.anInt1062;
		@Pc(25) int local25 = arg2 - this.anInt1062;
		@Pc(30) int local30 = arg0 - this.anInt1053;
		@Pc(46) int local46 = arg1 - this.anInt1053;
		if (arg5 == 0) {
			if (arg3 == 0) {
				if (local25 - 1 == local20 && local30 == local46) {
					return true;
				}
				if (local25 == local20 && local30 + 1 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 && local46 == local30 - 1 && (this.anIntArrayArray9[local20][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local20 == local25 && local30 + 1 == local46) {
					return true;
				}
				if (local20 == local25 - 1 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local46 == local30 && (this.anIntArrayArray9[local20][local46] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local20 == local25 + 1 && local30 == local46) {
					return true;
				}
				if (local20 == local25 && local30 + 1 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 && local30 - 1 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local25 == local20 && local30 - 1 == local46) {
					return true;
				}
				if (local25 - 1 == local20 && local46 == local30 && (this.anIntArrayArray9[local20][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local25 + 1 == local20 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				if (local20 == local25 - 1 && local46 == local30) {
					return true;
				}
				if (local25 == local20 && local46 == local30 + 1) {
					return true;
				}
				if (local20 == local25 + 1 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280180) == 0) {
					return true;
				}
				if (local20 == local25 && local30 - 1 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local20 == local25 - 1 && local46 == local30 && (this.anIntArrayArray9[local20][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local25 && local46 == local30 + 1) {
					return true;
				}
				if (local20 == local25 + 1 && local30 == local46) {
					return true;
				}
				if (local25 == local20 && local46 == local30 - 1 && (this.anIntArrayArray9[local20][local46] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local20 == local25 - 1 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280108) == 0) {
					return true;
				}
				if (local20 == local25 && local30 + 1 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local30 == local46) {
					return true;
				}
				if (local20 == local25 && local46 == local30 - 1) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local20 == local25 - 1 && local30 == local46) {
					return true;
				}
				if (local20 == local25 && local30 + 1 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280120) == 0) {
					return true;
				}
				if (local20 == local25 + 1 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x1280180) == 0) {
					return true;
				}
				if (local25 == local20 && local30 - 1 == local46) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local25 == local20 && local46 == local30 + 1 && (this.anIntArrayArray9[local20][local46] & 0x20) == 0) {
				return true;
			}
			if (local25 == local20 && local46 == local30 - 1 && (this.anIntArrayArray9[local20][local46] & 0x2) == 0) {
				return true;
			}
			if (local20 == local25 - 1 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x8) == 0) {
				return true;
			}
			if (local20 == local25 + 1 && local30 == local46 && (this.anIntArrayArray9[local20][local46] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class6 {

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
	private final int anInt164;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
	private final int anInt148;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	private final int anInt151;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	private final int anInt157;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "[[I")
	public final int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(II)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt164 = arg0;
		this.anInt148 = 0;
		this.anInt151 = 0;
		this.anInt157 = arg1;
		this.anIntArrayArray1 = new int[this.anInt164][this.anInt157];
		this.method114();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZI)V")
	private void method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIZIII)V")
	public void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt151;
		@Pc(11) int local11 = arg1 - this.anInt148;
		@Pc(25) int local25;
		if (arg4 == 1 || arg4 == 3) {
			local25 = arg2;
			arg2 = arg5;
			arg5 = local25;
		}
		@Pc(31) int local31 = 256;
		if (arg3) {
			local31 = 131328;
		}
		for (local25 = local11; local25 < arg2 + local11; local25++) {
			if (local25 >= 0 && this.anInt164 > local25) {
				for (@Pc(49) int local49 = local6; local49 < arg5 + local6; local49++) {
					if (local49 >= 0 && this.anInt157 > local49) {
						this.method111(local25, local31, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public void method114() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt164; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt157; local16++) {
				if (local12 == 0 || local16 == 0 || local12 == this.anInt164 - 1 || this.anInt157 - 1 == local16) {
					this.anIntArrayArray1[local12][local16] = 16777215;
				} else {
					this.anIntArrayArray1[local12][local16] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg2 && arg4 == arg5) {
			return true;
		}
		@Pc(24) int local24 = arg3 - this.anInt148;
		@Pc(29) int local29 = arg4 - this.anInt151;
		@Pc(34) int local34 = arg2 - this.anInt148;
		@Pc(39) int local39 = arg5 - this.anInt151;
		if (arg1 == 0) {
			if (arg0 == 0) {
				if (local24 == local34 - 1 && local39 == local29) {
					return true;
				}
				if (local34 == local24 && local29 + 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local24 && local39 == local29 - 1 && (this.anIntArrayArray1[local24][local39] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 == local24 && local39 == local29 + 1) {
					return true;
				}
				if (local34 - 1 == local24 && local39 == local29 && (this.anIntArrayArray1[local24][local39] & 0x1280108) == 0) {
					return true;
				}
				if (local24 == local34 + 1 && local29 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local24 == local34 + 1 && local39 == local29) {
					return true;
				}
				if (local24 == local34 && local29 + 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280120) == 0) {
					return true;
				}
				if (local34 == local24 && local39 == local29 - 1 && (this.anIntArrayArray1[local24][local39] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local24 == local34 && local39 == local29 - 1) {
					return true;
				}
				if (local34 - 1 == local24 && local39 == local29 && (this.anIntArrayArray1[local24][local39] & 0x1280108) == 0) {
					return true;
				}
				if (local24 == local34 + 1 && local39 == local29 && (this.anIntArrayArray1[local24][local39] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				if (local24 == local34 - 1 && local39 == local29) {
					return true;
				}
				if (local34 == local24 && local39 == local29 + 1) {
					return true;
				}
				if (local24 == local34 + 1 && local29 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280180) == 0) {
					return true;
				}
				if (local24 == local34 && local29 - 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 - 1 == local24 && local39 == local29 && (this.anIntArrayArray1[local24][local39] & 0x1280108) == 0) {
					return true;
				}
				if (local24 == local34 && local39 == local29 + 1) {
					return true;
				}
				if (local34 + 1 == local24 && local39 == local29) {
					return true;
				}
				if (local24 == local34 && local29 - 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 - 1 == local24 && local29 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280108) == 0) {
					return true;
				}
				if (local24 == local34 && local29 + 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280120) == 0) {
					return true;
				}
				if (local34 + 1 == local24 && local39 == local29) {
					return true;
				}
				if (local24 == local34 && local39 == local29 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local24 == local34 - 1 && local29 == local39) {
					return true;
				}
				if (local34 == local24 && local29 + 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x1280120) == 0) {
					return true;
				}
				if (local34 + 1 == local24 && local39 == local29 && (this.anIntArrayArray1[local24][local39] & 0x1280180) == 0) {
					return true;
				}
				if (local34 == local24 && local39 == local29 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local24 == local34 && local29 + 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x20) == 0) {
				return true;
			}
			if (local24 == local34 && local29 - 1 == local39 && (this.anIntArrayArray1[local24][local39] & 0x2) == 0) {
				return true;
			}
			if (local34 - 1 == local24 && local29 == local39 && (this.anIntArrayArray1[local24][local39] & 0x8) == 0) {
				return true;
			}
			if (local24 == local34 + 1 && local29 == local39 && (this.anIntArrayArray1[local24][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIIII)V")
	public void method116(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - this.anInt151;
		@Pc(15) int local15 = arg4 - this.anInt148;
		@Pc(27) int local27;
		if (arg5 == 1 || arg5 == 3) {
			local27 = arg1;
			arg1 = arg3;
			arg3 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg0) {
			local33 = 131328;
		}
		for (local27 = local15; local27 < local15 + arg1; local27++) {
			if (local27 >= 0 && local27 < this.anInt164) {
				for (@Pc(55) int local55 = local10; local55 < arg3 + local10; local55++) {
					if (local55 >= 0 && local55 < this.anInt157) {
						this.method122(local55, local33, local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	public void method117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt148;
		@Pc(13) int local13 = arg0 - this.anInt151;
		this.anIntArrayArray1[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIZII)V")
	public void method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt151;
		@Pc(13) int local13 = arg1 - this.anInt148;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method122(local8, 128, local13);
				this.method122(local8, 8, local13 - 1);
			}
			if (arg2 == 1) {
				this.method122(local8, 2, local13);
				this.method122(local8 + 1, 32, local13);
			}
			if (arg2 == 2) {
				this.method122(local8, 8, local13);
				this.method122(local8, 128, local13 + 1);
			}
			if (arg2 == 3) {
				this.method122(local8, 32, local13);
				this.method122(local8 - 1, 2, local13);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method122(local8, 1, local13);
				this.method122(local8 + 1, 16, local13 - 1);
			}
			if (arg2 == 1) {
				this.method122(local8, 4, local13);
				this.method122(local8 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method122(local8, 16, local13);
				this.method122(local8 - 1, 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method122(local8, 64, local13);
				this.method122(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method122(local8, 130, local13);
				this.method122(local8, 8, local13 - 1);
				this.method122(local8 + 1, 32, local13);
			}
			if (arg2 == 1) {
				this.method122(local8, 10, local13);
				this.method122(local8 + 1, 32, local13);
				this.method122(local8, 128, local13 + 1);
			}
			if (arg2 == 2) {
				this.method122(local8, 40, local13);
				this.method122(local8, 128, local13 + 1);
				this.method122(local8 - 1, 2, local13);
			}
			if (arg2 == 3) {
				this.method122(local8, 160, local13);
				this.method122(local8 - 1, 2, local13);
				this.method122(local8, 8, local13 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method122(local8, 65536, local13);
				this.method122(local8, 4096, local13 - 1);
			}
			if (arg2 == 1) {
				this.method122(local8, 1024, local13);
				this.method122(local8 + 1, 16384, local13);
			}
			if (arg2 == 2) {
				this.method122(local8, 4096, local13);
				this.method122(local8, 65536, local13 + 1);
			}
			if (arg2 == 3) {
				this.method122(local8, 16384, local13);
				this.method122(local8 - 1, 1024, local13);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method122(local8, 512, local13);
				this.method122(local8 + 1, 8192, local13 - 1);
			}
			if (arg2 == 1) {
				this.method122(local8, 2048, local13);
				this.method122(local8 + 1, 32768, local13 + 1);
			}
			if (arg2 == 2) {
				this.method122(local8, 8192, local13);
				this.method122(local8 - 1, 512, local13 + 1);
			}
			if (arg2 == 3) {
				this.method122(local8, 32768, local13);
				this.method122(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method122(local8, 66560, local13);
			this.method122(local8, 4096, local13 - 1);
			this.method122(local8 + 1, 16384, local13);
		}
		if (arg2 == 1) {
			this.method122(local8, 5120, local13);
			this.method122(local8 + 1, 16384, local13);
			this.method122(local8, 65536, local13 + 1);
		}
		if (arg2 == 2) {
			this.method122(local8, 20480, local13);
			this.method122(local8, 65536, local13 + 1);
			this.method122(local8 - 1, 1024, local13);
		}
		if (arg2 == 3) {
			this.method122(local8, 81920, local13);
			this.method122(local8 - 1, 1024, local13);
			this.method122(local8, 4096, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg6 - 1;
		@Pc(20) int local20 = arg3 + arg2 - 1;
		if (arg6 <= arg5 && arg5 <= local9 && arg0 >= arg2 && arg0 <= local20) {
			return true;
		} else if (arg6 - 1 == arg5 && arg2 <= arg0 && local20 >= arg0 && (this.anIntArrayArray1[arg5 - this.anInt148][arg0 - this.anInt151] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg5 && arg2 <= arg0 && arg0 <= local20 && (this.anIntArrayArray1[arg5 - this.anInt148][arg0 - this.anInt151] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg2 - 1 && arg6 <= arg5 && arg5 <= local9 && (this.anIntArrayArray1[arg5 - this.anInt148][arg0 - this.anInt151] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local20 + 1 == arg0 && arg5 >= arg6 && local9 >= arg5 && (this.anIntArrayArray1[arg5 - this.anInt148][arg0 - this.anInt151] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZII)V")
	private void method122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg0] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIIZII)V")
	public void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt148;
		@Pc(9) int local9 = arg4 - this.anInt151;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method111(local4, 128, local9);
				this.method111(local4 - 1, 8, local9);
			}
			if (arg0 == 1) {
				this.method111(local4, 2, local9);
				this.method111(local4, 32, local9 + 1);
			}
			if (arg0 == 2) {
				this.method111(local4, 8, local9);
				this.method111(local4 + 1, 128, local9);
			}
			if (arg0 == 3) {
				this.method111(local4, 32, local9);
				this.method111(local4, 2, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method111(local4, 1, local9);
				this.method111(local4 - 1, 16, local9 + 1);
			}
			if (arg0 == 1) {
				this.method111(local4, 4, local9);
				this.method111(local4 + 1, 64, local9 + 1);
			}
			if (arg0 == 2) {
				this.method111(local4, 16, local9);
				this.method111(local4 + 1, 1, local9 - 1);
			}
			if (arg0 == 3) {
				this.method111(local4, 64, local9);
				this.method111(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method111(local4, 130, local9);
				this.method111(local4 - 1, 8, local9);
				this.method111(local4, 32, local9 + 1);
			}
			if (arg0 == 1) {
				this.method111(local4, 10, local9);
				this.method111(local4, 32, local9 + 1);
				this.method111(local4 + 1, 128, local9);
			}
			if (arg0 == 2) {
				this.method111(local4, 40, local9);
				this.method111(local4 + 1, 128, local9);
				this.method111(local4, 2, local9 - 1);
			}
			if (arg0 == 3) {
				this.method111(local4, 160, local9);
				this.method111(local4, 2, local9 - 1);
				this.method111(local4 - 1, 8, local9);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method111(local4, 65536, local9);
				this.method111(local4 - 1, 4096, local9);
			}
			if (arg0 == 1) {
				this.method111(local4, 1024, local9);
				this.method111(local4, 16384, local9 + 1);
			}
			if (arg0 == 2) {
				this.method111(local4, 4096, local9);
				this.method111(local4 + 1, 65536, local9);
			}
			if (arg0 == 3) {
				this.method111(local4, 16384, local9);
				this.method111(local4, 1024, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method111(local4, 512, local9);
				this.method111(local4 - 1, 8192, local9 + 1);
			}
			if (arg0 == 1) {
				this.method111(local4, 2048, local9);
				this.method111(local4 + 1, 32768, local9 + 1);
			}
			if (arg0 == 2) {
				this.method111(local4, 8192, local9);
				this.method111(local4 + 1, 512, local9 - 1);
			}
			if (arg0 == 3) {
				this.method111(local4, 32768, local9);
				this.method111(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method111(local4, 66560, local9);
			this.method111(local4 - 1, 4096, local9);
			this.method111(local4, 16384, local9 + 1);
		}
		if (arg0 == 1) {
			this.method111(local4, 5120, local9);
			this.method111(local4, 16384, local9 + 1);
			this.method111(local4 + 1, 65536, local9);
		}
		if (arg0 == 2) {
			this.method111(local4, 20480, local9);
			this.method111(local4 + 1, 65536, local9);
			this.method111(local4, 1024, local9 - 1);
		}
		if (arg0 == 3) {
			this.method111(local4, 81920, local9);
			this.method111(local4, 1024, local9 - 1);
			this.method111(local4 - 1, 4096, local9);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt148;
		@Pc(13) int local13 = arg1 - this.anInt151;
		this.anIntArrayArray1[local4][local13] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIBI)Z")
	public boolean method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg3 && arg0 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt148;
		@Pc(25) int local25 = arg4 - this.anInt151;
		@Pc(30) int local30 = arg3 - this.anInt148;
		@Pc(35) int local35 = arg0 - this.anInt151;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray1[local30][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local20 && local35 - 1 == local25 && (this.anIntArrayArray1[local30][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray1[local30][local25] & 0x8) == 0) {
					return true;
				}
				if (local20 == local30 && local35 - 1 == local25 && (this.anIntArrayArray1[local30][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local30 == local20 - 1 && local35 == local25 && (this.anIntArrayArray1[local30][local25] & 0x8) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray1[local30][local25] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray1[local30][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray1[local30][local25] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 8) {
			if (local30 == local20 && local25 == local35 + 1 && (this.anIntArrayArray1[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local20 && local25 == local35 - 1 && (this.anIntArrayArray1[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local20 - 1 && local25 == local35 && (this.anIntArrayArray1[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 + 1 == local30 && local25 == local35 && (this.anIntArrayArray1[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}
}

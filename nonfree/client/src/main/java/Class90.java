import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class90 {

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	private int anInt3463;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	private int anInt3462;

	@OriginalMember(owner = "client!q", name = "I", descriptor = "I")
	private int anInt3481;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!q", name = "w", descriptor = "I")
	private int anInt3473;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3463 = arg0;
		this.anInt3462 = 0;
		this.anInt3481 = arg1;
		this.anIntArrayArray22 = new int[this.anInt3463][this.anInt3481];
		this.anInt3473 = 0;
		this.method2703();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method2703() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3463; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt3481; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt3463 - 5 <= local7 || local11 >= this.anInt3481 - 5) {
					this.anIntArrayArray22[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray22[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIZI)V")
	public void method2705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt3462;
		@Pc(9) int local9 = arg4 - this.anInt3473;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2717(128, local4, local9);
				this.method2717(8, local4, local9 - 1);
			}
			if (arg1 == 1) {
				this.method2717(2, local4, local9);
				this.method2717(32, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method2717(8, local4, local9);
				this.method2717(128, local4, local9 + 1);
			}
			if (arg1 == 3) {
				this.method2717(32, local4, local9);
				this.method2717(2, local4 - 1, local9);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2717(1, local4, local9);
				this.method2717(16, local4 + 1, local9 + -1);
			}
			if (arg1 == 1) {
				this.method2717(4, local4, local9);
				this.method2717(64, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method2717(16, local4, local9);
				this.method2717(1, local4 - 1, local9 + 1);
			}
			if (arg1 == 3) {
				this.method2717(64, local4, local9);
				this.method2717(4, local4 - 1, local9 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method2717(130, local4, local9);
				this.method2717(8, local4, local9 - 1);
				this.method2717(32, local4 + 1, local9);
			}
			if (arg1 == 1) {
				this.method2717(10, local4, local9);
				this.method2717(32, local4 + 1, local9);
				this.method2717(128, local4, local9 + 1);
			}
			if (arg1 == 2) {
				this.method2717(40, local4, local9);
				this.method2717(128, local4, local9 + 1);
				this.method2717(2, local4 - 1, local9);
			}
			if (arg1 == 3) {
				this.method2717(160, local4, local9);
				this.method2717(2, local4 - 1, local9);
				this.method2717(8, local4, local9 - 1);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2717(65536, local4, local9);
				this.method2717(4096, local4, local9 - 1);
			}
			if (arg1 == 1) {
				this.method2717(1024, local4, local9);
				this.method2717(16384, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method2717(4096, local4, local9);
				this.method2717(65536, local4, local9 + 1);
			}
			if (arg1 == 3) {
				this.method2717(16384, local4, local9);
				this.method2717(1024, local4 - 1, local9);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2717(512, local4, local9);
				this.method2717(8192, local4 + 1, local9 - 1);
			}
			if (arg1 == 1) {
				this.method2717(2048, local4, local9);
				this.method2717(32768, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method2717(8192, local4, local9);
				this.method2717(512, local4 - 1, local9 - -1);
			}
			if (arg1 == 3) {
				this.method2717(32768, local4, local9);
				this.method2717(2048, local4 - 1, local9 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2717(66560, local4, local9);
			this.method2717(4096, local4, local9 - 1);
			this.method2717(16384, local4 + 1, local9);
		}
		if (arg1 == 1) {
			this.method2717(5120, local4, local9);
			this.method2717(16384, local4 + 1, local9);
			this.method2717(65536, local4, local9 + 1);
		}
		if (arg1 == 2) {
			this.method2717(20480, local4, local9);
			this.method2717(65536, local4, local9 + 1);
			this.method2717(1024, local4 - 1, local9);
		}
		if (arg1 == 3) {
			this.method2717(81920, local4, local9);
			this.method2717(1024, local4 - 1, local9);
			this.method2717(4096, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method2706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg7 + arg2;
		@Pc(9) int local9 = arg1 + arg3;
		@Pc(22) int local22 = arg4 + arg0;
		@Pc(26) int local26 = arg5 + arg6;
		@Pc(55) int local55;
		@Pc(266) int local266;
		if (arg2 >= arg4 && local22 > arg2) {
			if (local9 == arg6 && (arg8 & 0x4) == 0) {
				local55 = arg2;
				local266 = local5 > local22 ? local22 : local5;
				while (local55 < local266) {
					if ((this.anIntArrayArray22[local55 - this.anInt3473][local9 - this.anInt3462 - 1] & 0x2) == 0) {
						return true;
					}
					local55++;
				}
			} else if (local26 == arg3 && (arg8 & 0x1) == 0) {
				local55 = arg2;
				local266 = local22 >= local5 ? local5 : local22;
				while (local266 > local55) {
					if ((this.anIntArrayArray22[local55 - this.anInt3473][arg3 - this.anInt3462] & 0x20) == 0) {
						return true;
					}
					local55++;
				}
			}
		} else if (arg4 < local5 && local5 <= local22) {
			if (local9 == arg6 && (arg8 & 0x4) == 0) {
				for (local55 = arg4; local55 < local5; local55++) {
					if ((this.anIntArrayArray22[local55 - this.anInt3473][local9 - this.anInt3462 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (arg3 == local26 && (arg8 & 0x1) == 0) {
				for (local55 = arg4; local55 < local5; local55++) {
					if ((this.anIntArrayArray22[local55 - this.anInt3473][arg3 - this.anInt3462] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg3 >= arg6 && arg3 < local26) {
			if (local5 == arg4 && (arg8 & 0x8) == 0) {
				local55 = arg3;
				local266 = local9 <= local26 ? local9 : local26;
				while (local266 > local55) {
					if ((this.anIntArrayArray22[local5 - this.anInt3473 - 1][local55 - this.anInt3462] & 0x8) == 0) {
						return true;
					}
					local55++;
				}
			} else if (local22 == arg2 && (arg8 & 0x2) == 0) {
				local55 = arg3;
				local266 = local26 < local9 ? local26 : local9;
				while (local266 > local55) {
					if ((this.anIntArrayArray22[arg2 - this.anInt3473][local55 - this.anInt3462] & 0x80) == 0) {
						return true;
					}
					local55++;
				}
			}
		} else if (arg6 < local9 && local9 <= local26) {
			if (local5 == arg4 && (arg8 & 0x8) == 0) {
				for (local55 = arg6; local55 < local9; local55++) {
					if ((this.anIntArrayArray22[local5 - this.anInt3473 - 1][local55 - this.anInt3462] & 0x8) == 0) {
						return true;
					}
				}
			} else if (arg2 == local22 && (arg8 & 0x2) == 0) {
				for (local55 = arg6; local55 < local9; local55++) {
					if ((this.anIntArrayArray22[arg2 - this.anInt3473][local55 - this.anInt3462] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	public void method2707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3462;
		@Pc(13) int local13 = arg1 - this.anInt3473;
		this.anIntArrayArray22[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg6 + arg5 && arg6 < arg2 + arg3) {
			return arg7 < arg0 + arg1 && arg4 + arg7 > arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBIZ)V")
	public void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(6) int local6 = arg2 - this.anInt3473;
		@Pc(12) int local12 = 256;
		if (arg4) {
			local12 = 131328;
		}
		@Pc(23) int local23 = arg3 - this.anInt3462;
		for (@Pc(29) int local29 = local6; local29 < local6 + arg1; local29++) {
			if (local29 >= 0 && this.anInt3463 > local29) {
				for (@Pc(42) int local42 = local23; local42 < local23 + arg0; local42++) {
					if (local42 >= 0 && this.anInt3481 > local42) {
						this.method2721(local42, local12, local29);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIIIII)V")
	public void method2710(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt3473;
		@Pc(9) int local9 = arg4 - this.anInt3462;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2721(local9, 128, local4);
				this.method2721(local9, 8, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2721(local9, 2, local4);
				this.method2721(local9 + 1, 32, local4);
			}
			if (arg2 == 2) {
				this.method2721(local9, 8, local4);
				this.method2721(local9, 128, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2721(local9, 32, local4);
				this.method2721(local9 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2721(local9, 1, local4);
				this.method2721(local9 + 1, 16, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2721(local9, 4, local4);
				this.method2721(local9 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2721(local9, 16, local4);
				this.method2721(local9 - 1, 1, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2721(local9, 64, local4);
				this.method2721(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method2721(local9, 130, local4);
				this.method2721(local9, 8, local4 - 1);
				this.method2721(local9 + 1, 32, local4);
			}
			if (arg2 == 1) {
				this.method2721(local9, 10, local4);
				this.method2721(local9 + 1, 32, local4);
				this.method2721(local9, 128, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2721(local9, 40, local4);
				this.method2721(local9, 128, local4 + 1);
				this.method2721(local9 - 1, 2, local4);
			}
			if (arg2 == 3) {
				this.method2721(local9, 160, local4);
				this.method2721(local9 - 1, 2, local4);
				this.method2721(local9, 8, local4 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2721(local9, 65536, local4);
				this.method2721(local9, 4096, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2721(local9, 1024, local4);
				this.method2721(local9 + 1, 16384, local4);
			}
			if (arg2 == 2) {
				this.method2721(local9, 4096, local4);
				this.method2721(local9, 65536, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2721(local9, 16384, local4);
				this.method2721(local9 - 1, 1024, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2721(local9, 512, local4);
				this.method2721(local9 + 1, 8192, local4 - 1);
			}
			if (arg2 == 1) {
				this.method2721(local9, 2048, local4);
				this.method2721(local9 + 1, 32768, local4 + 1);
			}
			if (arg2 == 2) {
				this.method2721(local9, 8192, local4);
				this.method2721(local9 - 1, 512, local4 + 1);
			}
			if (arg2 == 3) {
				this.method2721(local9, 32768, local4);
				this.method2721(local9 - 1, 2048, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2721(local9, 66560, local4);
			this.method2721(local9, 4096, local4 - 1);
			this.method2721(local9 + 1, 16384, local4);
		}
		if (arg2 == 1) {
			this.method2721(local9, 5120, local4);
			this.method2721(local9 + 1, 16384, local4);
			this.method2721(local9, 65536, local4 + 1);
		}
		if (arg2 == 2) {
			this.method2721(local9, 20480, local4);
			this.method2721(local9, 65536, local4 + 1);
			this.method2721(local9 - 1, 1024, local4);
		}
		if (arg2 == 3) {
			this.method2721(local9, 81920, local4);
			this.method2721(local9 - 1, 1024, local4);
			this.method2721(local9, 4096, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method2712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg2 == arg4 && arg0 == arg3) {
				return true;
			}
		} else if (arg2 <= arg4 && arg4 <= arg5 + arg2 - 1 && arg3 >= arg3 && arg5 + arg3 - 1 >= arg3) {
			return true;
		}
		@Pc(51) int local51 = arg3 - this.anInt3462;
		@Pc(56) int local56 = arg2 - this.anInt3473;
		@Pc(61) int local61 = arg0 - this.anInt3462;
		@Pc(71) int local71 = arg4 - this.anInt3473;
		if (arg5 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local71 + 1 == local56 && local51 == local61 && (this.anIntArrayArray22[local56][local61] & 0x80) == 0) {
						return true;
					}
					if (local71 == local56 && local51 - 1 == local61 && (this.anIntArrayArray22[local56][local61] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local71 - 1 == local56 && local51 == local61 && (this.anIntArrayArray22[local56][local61] & 0x8) == 0) {
						return true;
					}
					if (local71 == local56 && local61 == local51 - 1 && (this.anIntArrayArray22[local56][local61] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local56 == local71 - 1 && local51 == local61 && (this.anIntArrayArray22[local56][local61] & 0x8) == 0) {
						return true;
					}
					if (local56 == local71 && local61 == local51 + 1 && (this.anIntArrayArray22[local56][local61] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local71 + 1 == local56 && local51 == local61 && (this.anIntArrayArray22[local56][local61] & 0x80) == 0) {
						return true;
					}
					if (local71 == local56 && local61 == local51 + 1 && (this.anIntArrayArray22[local56][local61] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local56 == local71 && local51 + 1 == local61 && (this.anIntArrayArray22[local56][local61] & 0x20) == 0) {
					return true;
				}
				if (local71 == local56 && local51 - 1 == local61 && (this.anIntArrayArray22[local56][local61] & 0x2) == 0) {
					return true;
				}
				if (local56 == local71 - 1 && local51 == local61 && (this.anIntArrayArray22[local56][local61] & 0x8) == 0) {
					return true;
				}
				if (local56 == local71 + 1 && local51 == local61 && (this.anIntArrayArray22[local56][local61] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(81) int local81 = local56 + arg5 - 1;
			@Pc(87) int local87 = arg5 + local61 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local71 + 1 == local56 && local51 >= local61 && local87 >= local51 && (this.anIntArrayArray22[local56][local51] & 0x80) == 0) {
						return true;
					}
					if (local56 <= local71 && local81 >= local71 && local61 == local51 - arg5 && (this.anIntArrayArray22[local71][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local71 - arg5 == local56 && local61 <= local51 && local51 <= local87 && (this.anIntArrayArray22[local81][local51] & 0x8) == 0) {
						return true;
					}
					if (local56 <= local71 && local71 <= local81 && local61 == local51 - arg5 && (this.anIntArrayArray22[local71][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local71 - arg5 == local56 && local61 <= local51 && local87 >= local51 && (this.anIntArrayArray22[local81][local51] & 0x8) == 0) {
						return true;
					}
					if (local56 <= local71 && local81 >= local71 && local51 + 1 == local61 && (this.anIntArrayArray22[local71][local61] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local56 == local71 + 1 && local51 >= local61 && local51 <= local87 && (this.anIntArrayArray22[local56][local51] & 0x80) == 0) {
						return true;
					}
					if (local71 >= local56 && local71 <= local81 && local51 + 1 == local61 && (this.anIntArrayArray22[local71][local61] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local56 <= local71 && local81 >= local71 && local51 + 1 == local61 && (this.anIntArrayArray22[local71][local61] & 0x20) == 0) {
					return true;
				}
				if (local71 >= local56 && local71 <= local81 && local51 - arg5 == local61 && (this.anIntArrayArray22[local71][local87] & 0x2) == 0) {
					return true;
				}
				if (local71 - arg5 == local56 && local51 >= local61 && local51 <= local87 && (this.anIntArrayArray22[local81][local51] & 0x8) == 0) {
					return true;
				}
				if (local71 + 1 == local56 && local51 >= local61 && local87 >= local51 && (this.anIntArrayArray22[local56][local51] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIIIIIII)Z")
	public boolean method2713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return this.method2708(arg6, arg5, arg2, arg1, arg2, arg4, arg3, arg0) ? true : this.method2706(arg4, arg2, arg1, arg0, arg3, arg6, arg5, arg2, arg7);
		}
		@Pc(46) int local46 = arg3 + arg4 - 1;
		@Pc(52) int local52 = arg5 + arg6 - 1;
		if (arg3 <= arg1 && arg1 <= local46 && arg0 >= arg5 && arg0 <= local52) {
			return true;
		} else if (arg1 == arg3 - 1 && arg0 >= arg5 && arg0 <= local52 && (this.anIntArrayArray22[arg1 - this.anInt3473][arg0 - this.anInt3462] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg1 == local46 + 1 && arg0 >= arg5 && arg0 <= local52 && (this.anIntArrayArray22[arg1 - this.anInt3473][arg0 - this.anInt3462] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg5 - 1 && arg3 <= arg1 && arg1 <= local46 && (this.anIntArrayArray22[arg1 - this.anInt3473][arg0 - this.anInt3462] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return local52 + 1 == arg0 && arg1 >= arg3 && local46 >= arg1 && (this.anIntArrayArray22[arg1 - this.anInt3473][arg0 - this.anInt3462] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)V")
	public void method2714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3462;
		@Pc(18) int local18 = arg1 - this.anInt3473;
		this.anIntArrayArray22[local18][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZZ)V")
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = arg0 - this.anInt3462;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg3 - this.anInt3473;
		@Pc(30) int local30;
		if (arg4 == 1 || arg4 == 3) {
			local30 = arg1;
			arg1 = arg2;
			arg2 = local30;
		}
		if (arg5) {
			local12 = 131328;
		}
		for (local30 = local17; local30 < local17 + arg1; local30++) {
			if (local30 >= 0 && local30 < this.anInt3463) {
				for (@Pc(59) int local59 = local10; local59 < local10 + arg2; local59++) {
					if (local59 >= 0 && local59 < this.anInt3481) {
						this.method2717(local12, local59, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IBI)V")
	public void method2716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3462;
		@Pc(13) int local13 = arg0 - this.anInt3473;
		this.anIntArrayArray22[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBII)V")
	private void method2717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V")
	private void method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg0 && arg1 == arg5) {
				return true;
			}
		} else if (arg6 >= arg0 && arg0 + arg4 - 1 >= arg6 && arg1 >= arg1 && arg4 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(59) int local59 = arg6 - this.anInt3473;
		@Pc(64) int local64 = arg1 - this.anInt3462;
		@Pc(69) int local69 = arg0 - this.anInt3473;
		@Pc(74) int local74 = arg5 - this.anInt3462;
		if (arg4 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local69 == local59 - 1 && local64 == local74) {
						return true;
					}
					if (local59 == local69 && local74 == local64 + 1 && (this.anIntArrayArray22[local69][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 == local59 && local64 - 1 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 == local69 && local64 + 1 == local74) {
						return true;
					}
					if (local59 - 1 == local69 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local69 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 + 1 == local69 && local64 == local74) {
						return true;
					}
					if (local59 == local69 && local74 == local64 + 1 && (this.anIntArrayArray22[local69][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 == local59 && local74 == local64 - 1 && (this.anIntArrayArray22[local69][local74] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 == local69 && local64 - 1 == local74) {
						return true;
					}
					if (local69 == local59 - 1 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local69 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local69 == local59 - 1 && local74 == local64) {
						return true;
					}
					if (local69 == local59 && local74 == local64 + 1) {
						return true;
					}
					if (local59 + 1 == local69 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0180) == 0) {
						return true;
					}
					if (local69 == local59 && local74 == local64 - 1 && (this.anIntArrayArray22[local69][local74] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local69 == local59 - 1 && local74 == local64 && (this.anIntArrayArray22[local69][local74] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 == local69 && local64 + 1 == local74) {
						return true;
					}
					if (local69 == local59 + 1 && local64 == local74) {
						return true;
					}
					if (local69 == local59 && local64 - 1 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local69 == local59 - 1 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 == local69 && local74 == local64 + 1 && (this.anIntArrayArray22[local69][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 == local59 + 1 && local74 == local64) {
						return true;
					}
					if (local59 == local69 && local74 == local64 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 - 1 == local69 && local64 == local74) {
						return true;
					}
					if (local59 == local69 && local64 + 1 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 == local59 + 1 && local64 == local74 && (this.anIntArrayArray22[local69][local74] & 0x12C0180) == 0) {
						return true;
					}
					if (local69 == local59 && local74 == local64 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local59 == local69 && local74 == local64 + 1 && (this.anIntArrayArray22[local69][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 == local69 && local64 - 1 == local74 && (this.anIntArrayArray22[local69][local74] & 0x2) == 0) {
					return true;
				}
				if (local59 - 1 == local69 && local74 == local64 && (this.anIntArrayArray22[local69][local74] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local69 && local74 == local64 && (this.anIntArrayArray22[local69][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = local69 + arg4 - 1;
			@Pc(92) int local92 = arg4 + local74 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local69 == local59 - arg4 && local64 >= local74 && local92 >= local64) {
						return true;
					}
					if (local59 >= local69 && local86 >= local59 && local64 + 1 == local74 && (this.anIntArrayArray22[local59][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 <= local59 && local59 <= local86 && local64 - arg4 == local74 && (this.anIntArrayArray22[local59][local92] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 >= local69 && local86 >= local59 && local74 == local64 + 1) {
						return true;
					}
					if (local69 == local59 - arg4 && local74 <= local64 && local92 >= local64 && (this.anIntArrayArray22[local86][local64] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local69 && local74 <= local64 && local92 >= local64 && (this.anIntArrayArray22[local69][local64] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 + 1 == local69 && local74 <= local64 && local92 >= local64) {
						return true;
					}
					if (local59 >= local69 && local86 >= local59 && local74 == local64 + 1 && (this.anIntArrayArray22[local59][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 <= local59 && local86 >= local59 && local74 == local64 - arg4 && (this.anIntArrayArray22[local59][local92] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local69 <= local59 && local59 <= local86 && local74 == local64 - arg4) {
						return true;
					}
					if (local69 == local59 - arg4 && local64 >= local74 && local92 >= local64 && (this.anIntArrayArray22[local86][local64] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local69 && local74 <= local64 && local64 <= local92 && (this.anIntArrayArray22[local69][local64] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local69 == local59 - arg4 && local64 >= local74 && local92 >= local64) {
						return true;
					}
					if (local59 >= local69 && local59 <= local86 && local74 == local64 + 1) {
						return true;
					}
					if (local69 == local59 + 1 && local64 >= local74 && local64 <= local92 && (this.anIntArrayArray22[local69][local64] & 0x12C0180) == 0) {
						return true;
					}
					if (local69 <= local59 && local86 >= local59 && local64 - arg4 == local74 && (this.anIntArrayArray22[local59][local92] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 - arg4 == local69 && local74 <= local64 && local92 >= local64 && (this.anIntArrayArray22[local86][local64] & 0x12C0108) == 0) {
						return true;
					}
					if (local69 <= local59 && local59 <= local86 && local64 + 1 == local74) {
						return true;
					}
					if (local69 == local59 + 1 && local64 >= local74 && local92 >= local64) {
						return true;
					}
					if (local59 >= local69 && local59 <= local86 && local74 == local64 - arg4 && (this.anIntArrayArray22[local59][local92] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local69 == local59 - arg4 && local64 >= local74 && local92 >= local64 && (this.anIntArrayArray22[local86][local64] & 0x12C0108) == 0) {
						return true;
					}
					if (local59 >= local69 && local59 <= local86 && local64 + 1 == local74 && (this.anIntArrayArray22[local59][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local69 && local74 <= local64 && local64 <= local92) {
						return true;
					}
					if (local59 >= local69 && local59 <= local86 && local64 - arg4 == local74) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 - arg4 == local69 && local64 >= local74 && local92 >= local64) {
						return true;
					}
					if (local59 >= local69 && local86 >= local59 && local74 == local64 + 1 && (this.anIntArrayArray22[local59][local74] & 0x12C0120) == 0) {
						return true;
					}
					if (local69 == local59 + 1 && local64 >= local74 && local64 <= local92 && (this.anIntArrayArray22[local69][local64] & 0x12C0180) == 0) {
						return true;
					}
					if (local69 <= local59 && local86 >= local59 && local64 - arg4 == local74) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local59 >= local69 && local86 >= local59 && local64 + 1 == local74 && (this.anIntArrayArray22[local59][local74] & 0x12C0120) == 0) {
					return true;
				}
				if (local69 <= local59 && local86 >= local59 && local74 == local64 - arg4 && (this.anIntArrayArray22[local59][local92] & 0x12C0102) == 0) {
					return true;
				}
				if (local59 - arg4 == local69 && local74 <= local64 && local92 >= local64 && (this.anIntArrayArray22[local86][local64] & 0x12C0108) == 0) {
					return true;
				}
				if (local59 + 1 == local69 && local74 <= local64 && local92 >= local64 && (this.anIntArrayArray22[local69][local64] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}

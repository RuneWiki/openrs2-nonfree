import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class69 {

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	private final int anInt3500;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	private final int anInt3495;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	private final int anInt3491;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	private final int anInt3492;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "[[I")
	public final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(II)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3500 = arg1;
		this.anInt3495 = 0;
		this.anInt3491 = 0;
		this.anInt3492 = arg0;
		this.anIntArrayArray33 = new int[this.anInt3492][this.anInt3500];
		this.method2407();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIZI)V")
	public void method2395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt3491;
		@Pc(9) int local9 = arg1 - this.anInt3495;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2404(local9, local4, 128);
				this.method2404(local9 - 1, local4, 8);
			}
			if (arg0 == 1) {
				this.method2404(local9, local4, 2);
				this.method2404(local9, local4 + 1, 32);
			}
			if (arg0 == 2) {
				this.method2404(local9, local4, 8);
				this.method2404(local9 + 1, local4, 128);
			}
			if (arg0 == 3) {
				this.method2404(local9, local4, 32);
				this.method2404(local9, local4 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2404(local9, local4, 1);
				this.method2404(local9 - 1, local4 - -1, 16);
			}
			if (arg0 == 1) {
				this.method2404(local9, local4, 4);
				this.method2404(local9 + 1, local4 + 1, 64);
			}
			if (arg0 == 2) {
				this.method2404(local9, local4, 16);
				this.method2404(local9 + 1, local4 - 1, 1);
			}
			if (arg0 == 3) {
				this.method2404(local9, local4, 64);
				this.method2404(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method2404(local9, local4, 130);
				this.method2404(local9 - 1, local4, 8);
				this.method2404(local9, local4 + 1, 32);
			}
			if (arg0 == 1) {
				this.method2404(local9, local4, 10);
				this.method2404(local9, local4 + 1, 32);
				this.method2404(local9 + 1, local4, 128);
			}
			if (arg0 == 2) {
				this.method2404(local9, local4, 40);
				this.method2404(local9 + 1, local4, 128);
				this.method2404(local9, local4 - 1, 2);
			}
			if (arg0 == 3) {
				this.method2404(local9, local4, 160);
				this.method2404(local9, local4 - 1, 2);
				this.method2404(local9 - 1, local4, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2404(local9, local4, 65536);
				this.method2404(local9 - 1, local4, 4096);
			}
			if (arg0 == 1) {
				this.method2404(local9, local4, 1024);
				this.method2404(local9, local4 + 1, 16384);
			}
			if (arg0 == 2) {
				this.method2404(local9, local4, 4096);
				this.method2404(local9 + 1, local4, 65536);
			}
			if (arg0 == 3) {
				this.method2404(local9, local4, 16384);
				this.method2404(local9, local4 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2404(local9, local4, 512);
				this.method2404(local9 - 1, local4 - -1, 8192);
			}
			if (arg0 == 1) {
				this.method2404(local9, local4, 2048);
				this.method2404(local9 + 1, local4 + 1, 32768);
			}
			if (arg0 == 2) {
				this.method2404(local9, local4, 8192);
				this.method2404(local9 + 1, local4 + -1, 512);
			}
			if (arg0 == 3) {
				this.method2404(local9, local4, 32768);
				this.method2404(local9 - 1, local4 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2404(local9, local4, 66560);
			this.method2404(local9 - 1, local4, 4096);
			this.method2404(local9, local4 + 1, 16384);
		}
		if (arg0 == 1) {
			this.method2404(local9, local4, 5120);
			this.method2404(local9, local4 + 1, 16384);
			this.method2404(local9 + 1, local4, 65536);
		}
		if (arg0 == 2) {
			this.method2404(local9, local4, 20480);
			this.method2404(local9 + 1, local4, 65536);
			this.method2404(local9, local4 - 1, 1024);
		}
		if (arg0 == 3) {
			this.method2404(local9, local4, 81920);
			this.method2404(local9, local4 - 1, 1024);
			this.method2404(local9 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIB)Z")
	public boolean method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 == arg3 && arg5 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg5 - this.anInt3491;
		@Pc(29) int local29 = arg4 - this.anInt3495;
		@Pc(34) int local34 = arg3 - this.anInt3495;
		@Pc(44) int local44 = arg2 - this.anInt3491;
		if (arg1 == 0) {
			if (arg0 == 0) {
				if (local29 == local34 - 1 && local24 == local44) {
					return true;
				}
				if (local29 == local34 && local44 + 1 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local44 - 1 && (this.anIntArrayArray33[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 == local34 && local44 + 1 == local24) {
					return true;
				}
				if (local34 - 1 == local29 && local24 == local44 && (this.anIntArrayArray33[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local24 == local44 && (this.anIntArrayArray33[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local29 == local34 + 1 && local24 == local44) {
					return true;
				}
				if (local29 == local34 && local44 + 1 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local34 == local29 && local44 - 1 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 == local34 && local24 == local44 - 1) {
					return true;
				}
				if (local29 == local34 - 1 && local24 == local44 && (this.anIntArrayArray33[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				if (local34 - 1 == local29 && local44 == local24) {
					return true;
				}
				if (local34 == local29 && local24 == local44 + 1) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local29 && local44 - 1 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 - 1 == local29 && local44 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 && local44 + 1 == local24) {
					return true;
				}
				if (local29 == local34 + 1 && local24 == local44) {
					return true;
				}
				if (local34 == local29 && local24 == local44 - 1 && (this.anIntArrayArray33[local29][local24] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 - 1 == local29 && local44 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0108) == 0) {
					return true;
				}
				if (local29 == local34 && local24 == local44 + 1 && (this.anIntArrayArray33[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local24) {
					return true;
				}
				if (local29 == local34 && local24 == local44 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 == local34 - 1 && local44 == local24) {
					return true;
				}
				if (local34 == local29 && local44 + 1 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0120) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local44 == local24 && (this.anIntArrayArray33[local29][local24] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local29 && local24 == local44 - 1) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local29 == local34 && local24 == local44 + 1 && (this.anIntArrayArray33[local29][local24] & 0x20) == 0) {
				return true;
			}
			if (local29 == local34 && local24 == local44 - 1 && (this.anIntArrayArray33[local29][local24] & 0x2) == 0) {
				return true;
			}
			if (local34 - 1 == local29 && local44 == local24 && (this.anIntArrayArray33[local29][local24] & 0x8) == 0) {
				return true;
			}
			if (local29 == local34 + 1 && local24 == local44 && (this.anIntArrayArray33[local29][local24] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg0 + arg5 - 1;
		@Pc(20) int local20 = arg4 + arg6 - 1;
		if (arg2 >= arg6 && local20 >= arg2 && arg0 <= arg3 && arg3 <= local5) {
			return true;
		} else if (arg6 - 1 == arg2 && arg0 <= arg3 && local5 >= arg3 && (this.anIntArrayArray33[arg2 - this.anInt3495][arg3 - this.anInt3491] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local20 + 1 == arg2 && arg0 <= arg3 && local5 >= arg3 && (this.anIntArrayArray33[arg2 - this.anInt3495][arg3 - this.anInt3491] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg0 - 1 && arg2 >= arg6 && local20 >= arg2 && (this.anIntArrayArray33[arg2 - this.anInt3495][arg3 - this.anInt3491] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local5 + 1 == arg3 && arg6 <= arg2 && local20 >= arg2 && (this.anIntArrayArray33[arg2 - this.anInt3495][arg3 - this.anInt3491] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	private void method2398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray33[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIZ)V")
	public void method2399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(16) int local16 = arg0 - this.anInt3495;
		@Pc(21) int local21 = arg1 - this.anInt3491;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2398(128, local16, local21);
				this.method2398(8, local16 - 1, local21);
			}
			if (arg2 == 1) {
				this.method2398(2, local16, local21);
				this.method2398(32, local16, local21 + 1);
			}
			if (arg2 == 2) {
				this.method2398(8, local16, local21);
				this.method2398(128, local16 + 1, local21);
			}
			if (arg2 == 3) {
				this.method2398(32, local16, local21);
				this.method2398(2, local16, local21 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2398(1, local16, local21);
				this.method2398(16, local16 - 1, local21 - -1);
			}
			if (arg2 == 1) {
				this.method2398(4, local16, local21);
				this.method2398(64, local16 + 1, local21 + 1);
			}
			if (arg2 == 2) {
				this.method2398(16, local16, local21);
				this.method2398(1, local16 + 1, local21 + -1);
			}
			if (arg2 == 3) {
				this.method2398(64, local16, local21);
				this.method2398(4, local16 - 1, local21 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method2398(130, local16, local21);
				this.method2398(8, local16 - 1, local21);
				this.method2398(32, local16, local21 + 1);
			}
			if (arg2 == 1) {
				this.method2398(10, local16, local21);
				this.method2398(32, local16, local21 + 1);
				this.method2398(128, local16 + 1, local21);
			}
			if (arg2 == 2) {
				this.method2398(40, local16, local21);
				this.method2398(128, local16 + 1, local21);
				this.method2398(2, local16, local21 - 1);
			}
			if (arg2 == 3) {
				this.method2398(160, local16, local21);
				this.method2398(2, local16, local21 - 1);
				this.method2398(8, local16 - 1, local21);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2398(65536, local16, local21);
				this.method2398(4096, local16 - 1, local21);
			}
			if (arg2 == 1) {
				this.method2398(1024, local16, local21);
				this.method2398(16384, local16, local21 + 1);
			}
			if (arg2 == 2) {
				this.method2398(4096, local16, local21);
				this.method2398(65536, local16 + 1, local21);
			}
			if (arg2 == 3) {
				this.method2398(16384, local16, local21);
				this.method2398(1024, local16, local21 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2398(512, local16, local21);
				this.method2398(8192, local16 - 1, local21 + 1);
			}
			if (arg2 == 1) {
				this.method2398(2048, local16, local21);
				this.method2398(32768, local16 + 1, local21 + 1);
			}
			if (arg2 == 2) {
				this.method2398(8192, local16, local21);
				this.method2398(512, local16 + 1, local21 + -1);
			}
			if (arg2 == 3) {
				this.method2398(32768, local16, local21);
				this.method2398(2048, local16 - 1, local21 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2398(66560, local16, local21);
			this.method2398(4096, local16 - 1, local21);
			this.method2398(16384, local16, local21 + 1);
		}
		if (arg2 == 1) {
			this.method2398(5120, local16, local21);
			this.method2398(16384, local16, local21 + 1);
			this.method2398(65536, local16 + 1, local21);
		}
		if (arg2 == 2) {
			this.method2398(20480, local16, local21);
			this.method2398(65536, local16 + 1, local21);
			this.method2398(1024, local16, local21 - 1);
		}
		if (arg2 == 3) {
			this.method2398(81920, local16, local21);
			this.method2398(1024, local16, local21 - 1);
			this.method2398(4096, local16 - 1, local21);
			return;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == arg3 && arg1 == arg2) {
			return true;
		}
		@Pc(16) int local16 = arg5 - this.anInt3495;
		@Pc(21) int local21 = arg3 - this.anInt3495;
		@Pc(26) int local26 = arg2 - this.anInt3491;
		@Pc(31) int local31 = arg1 - this.anInt3491;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local21 + 1 == local16 && local26 == local31 && (this.anIntArrayArray33[local16][local31] & 0x80) == 0) {
					return true;
				}
				if (local16 == local21 && local31 == local26 - 1 && (this.anIntArrayArray33[local16][local31] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local21 - 1 == local16 && local26 == local31 && (this.anIntArrayArray33[local16][local31] & 0x8) == 0) {
					return true;
				}
				if (local16 == local21 && local31 == local26 - 1 && (this.anIntArrayArray33[local16][local31] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local21 - 1 == local16 && local31 == local26 && (this.anIntArrayArray33[local16][local31] & 0x8) == 0) {
					return true;
				}
				if (local16 == local21 && local26 + 1 == local31 && (this.anIntArrayArray33[local16][local31] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local21 + 1 == local16 && local26 == local31 && (this.anIntArrayArray33[local16][local31] & 0x80) == 0) {
					return true;
				}
				if (local16 == local21 && local26 + 1 == local31 && (this.anIntArrayArray33[local16][local31] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local21 == local16 && local26 + 1 == local31 && (this.anIntArrayArray33[local16][local31] & 0x20) == 0) {
				return true;
			}
			if (local21 == local16 && local26 - 1 == local31 && (this.anIntArrayArray33[local16][local31] & 0x2) == 0) {
				return true;
			}
			if (local21 - 1 == local16 && local26 == local31 && (this.anIntArrayArray33[local16][local31] & 0x8) == 0) {
				return true;
			}
			if (local21 + 1 == local16 && local26 == local31 && (this.anIntArrayArray33[local16][local31] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3495;
		@Pc(19) int local19 = arg0 - this.anInt3491;
		this.anIntArrayArray33[local8][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZIBII)V")
	public void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - this.anInt3495;
		@Pc(23) int local23 = arg0 - this.anInt3491;
		@Pc(25) int local25 = 256;
		if (arg1) {
			local25 = 131328;
		}
		for (@Pc(33) int local33 = local10; local33 < local10 + arg3; local33++) {
			if (local33 >= 0 && local33 < this.anInt3492) {
				for (@Pc(47) int local47 = local23; local47 < local23 + arg4; local47++) {
					if (local47 >= 0 && local47 < this.anInt3500) {
						this.method2404(local33, local47, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIII)V")
	private void method2404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray33[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)V")
	public void method2405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3495;
		@Pc(13) int local13 = arg1 - this.anInt3491;
		this.anIntArrayArray33[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
	public void method2406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3491;
		@Pc(18) int local18 = arg0 - this.anInt3495;
		this.anIntArrayArray33[local18][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public void method2407() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3492; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3500; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt3492 - 5 || local7 >= this.anInt3500 - 5) {
					this.anIntArrayArray33[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray33[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBZ)V")
	public void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(13) int local13;
		if (arg2 == 1 || arg2 == 3) {
			local13 = arg3;
			arg3 = arg0;
			arg0 = local13;
		}
		@Pc(22) int local22 = arg1 - this.anInt3491;
		@Pc(24) int local24 = 256;
		if (arg5) {
			local24 = 131328;
		}
		@Pc(39) int local39 = arg4 - this.anInt3495;
		for (local13 = local39; local13 < local39 + arg3; local13++) {
			if (local13 >= 0 && this.anInt3492 > local13) {
				for (@Pc(51) int local51 = local22; local51 < arg0 + local22; local51++) {
					if (local51 >= 0 && this.anInt3500 > local51) {
						this.method2398(local24, local13, local51);
					}
				}
			}
		}
	}
}

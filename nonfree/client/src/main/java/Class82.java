import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class82 {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	private final int anInt3523;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	private final int anInt3519;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(II)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3523 = arg1;
		this.anInt3519 = 0;
		this.anInt3514 = 0;
		this.anInt3515 = arg0;
		this.anIntArrayArray38 = new int[this.anInt3515][this.anInt3523];
		this.method2513();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	private void method2504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray38[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIZII)V")
	public void method2505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 - this.anInt3519;
		@Pc(21) int local21 = arg4 - this.anInt3514;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method2508(128, local8, local21);
				this.method2508(8, local8, local21 - 1);
			}
			if (arg3 == 1) {
				this.method2508(2, local8, local21);
				this.method2508(32, local8 + 1, local21);
			}
			if (arg3 == 2) {
				this.method2508(8, local8, local21);
				this.method2508(128, local8, local21 + 1);
			}
			if (arg3 == 3) {
				this.method2508(32, local8, local21);
				this.method2508(2, local8 - 1, local21);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method2508(1, local8, local21);
				this.method2508(16, local8 + 1, local21 + -1);
			}
			if (arg3 == 1) {
				this.method2508(4, local8, local21);
				this.method2508(64, local8 + 1, local21 + 1);
			}
			if (arg3 == 2) {
				this.method2508(16, local8, local21);
				this.method2508(1, local8 - 1, local21 + 1);
			}
			if (arg3 == 3) {
				this.method2508(64, local8, local21);
				this.method2508(4, local8 - 1, local21 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method2508(130, local8, local21);
				this.method2508(8, local8, local21 - 1);
				this.method2508(32, local8 + 1, local21);
			}
			if (arg3 == 1) {
				this.method2508(10, local8, local21);
				this.method2508(32, local8 + 1, local21);
				this.method2508(128, local8, local21 + 1);
			}
			if (arg3 == 2) {
				this.method2508(40, local8, local21);
				this.method2508(128, local8, local21 + 1);
				this.method2508(2, local8 - 1, local21);
			}
			if (arg3 == 3) {
				this.method2508(160, local8, local21);
				this.method2508(2, local8 - 1, local21);
				this.method2508(8, local8, local21 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method2508(65536, local8, local21);
				this.method2508(4096, local8, local21 - 1);
			}
			if (arg3 == 1) {
				this.method2508(1024, local8, local21);
				this.method2508(16384, local8 + 1, local21);
			}
			if (arg3 == 2) {
				this.method2508(4096, local8, local21);
				this.method2508(65536, local8, local21 + 1);
			}
			if (arg3 == 3) {
				this.method2508(16384, local8, local21);
				this.method2508(1024, local8 - 1, local21);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method2508(512, local8, local21);
				this.method2508(8192, local8 + 1, local21 + -1);
			}
			if (arg3 == 1) {
				this.method2508(2048, local8, local21);
				this.method2508(32768, local8 + 1, local21 + 1);
			}
			if (arg3 == 2) {
				this.method2508(8192, local8, local21);
				this.method2508(512, local8 - 1, local21 + 1);
			}
			if (arg3 == 3) {
				this.method2508(32768, local8, local21);
				this.method2508(2048, local8 - 1, local21 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2508(66560, local8, local21);
			this.method2508(4096, local8, local21 - 1);
			this.method2508(16384, local8 + 1, local21);
		}
		if (arg3 == 1) {
			this.method2508(5120, local8, local21);
			this.method2508(16384, local8 + 1, local21);
			this.method2508(65536, local8, local21 + 1);
		}
		if (arg3 == 2) {
			this.method2508(20480, local8, local21);
			this.method2508(65536, local8, local21 + 1);
			this.method2508(1024, local8 - 1, local21);
		}
		if (arg3 == 3) {
			this.method2508(81920, local8, local21);
			this.method2508(1024, local8 - 1, local21);
			this.method2508(4096, local8, local21 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg2 && arg3 == arg5) {
			return true;
		}
		@Pc(20) int local20 = arg1 - this.anInt3514;
		@Pc(25) int local25 = arg3 - this.anInt3519;
		@Pc(30) int local30 = arg5 - this.anInt3519;
		@Pc(35) int local35 = arg2 - this.anInt3514;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (local35 - 1 == local20 && local25 == local30) {
					return true;
				}
				if (local20 == local35 && local30 + 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local35 && local30 - 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local35 && local25 == local30 + 1) {
					return true;
				}
				if (local20 == local35 - 1 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local20 == local35 + 1 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local35 + 1 == local20 && local30 == local25) {
					return true;
				}
				if (local35 == local20 && local25 == local30 + 1 && (this.anIntArrayArray38[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local20 && local30 - 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local35 == local20 && local30 - 1 == local25) {
					return true;
				}
				if (local20 == local35 - 1 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 + 1 == local20 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				if (local20 == local35 - 1 && local30 == local25) {
					return true;
				}
				if (local20 == local35 && local30 + 1 == local25) {
					return true;
				}
				if (local20 == local35 + 1 && local30 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local35 && local30 - 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local35 - 1 && local30 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local20 && local30 + 1 == local25) {
					return true;
				}
				if (local20 == local35 + 1 && local30 == local25) {
					return true;
				}
				if (local20 == local35 && local25 == local30 - 1 && (this.anIntArrayArray38[local20][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local20 == local35 - 1 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local20 && local30 + 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 + 1 == local20 && local25 == local30) {
					return true;
				}
				if (local20 == local35 && local25 == local30 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local35 - 1 == local20 && local25 == local30) {
					return true;
				}
				if (local35 == local20 && local30 + 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local20 == local35 + 1 && local30 == local25 && (this.anIntArrayArray38[local20][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local20 == local35 && local30 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local35 == local20 && local30 + 1 == local25 && (this.anIntArrayArray38[local20][local25] & 0x20) == 0) {
				return true;
			}
			if (local35 == local20 && local25 == local30 - 1 && (this.anIntArrayArray38[local20][local25] & 0x2) == 0) {
				return true;
			}
			if (local20 == local35 - 1 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 == local35 + 1 && local25 == local30 && (this.anIntArrayArray38[local20][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBII)V")
	private void method2508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray38[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZIBI)V")
	public void method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt3519;
		@Pc(13) int local13 = arg0 - this.anInt3514;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method2504(local13, local8, 128);
				this.method2504(local13 - 1, local8, 8);
			}
			if (arg1 == 1) {
				this.method2504(local13, local8, 2);
				this.method2504(local13, local8 + 1, 32);
			}
			if (arg1 == 2) {
				this.method2504(local13, local8, 8);
				this.method2504(local13 + 1, local8, 128);
			}
			if (arg1 == 3) {
				this.method2504(local13, local8, 32);
				this.method2504(local13, local8 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method2504(local13, local8, 1);
				this.method2504(local13 - 1, local8 + 1, 16);
			}
			if (arg1 == 1) {
				this.method2504(local13, local8, 4);
				this.method2504(local13 + 1, local8 + 1, 64);
			}
			if (arg1 == 2) {
				this.method2504(local13, local8, 16);
				this.method2504(local13 + 1, local8 + -1, 1);
			}
			if (arg1 == 3) {
				this.method2504(local13, local8, 64);
				this.method2504(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method2504(local13, local8, 130);
				this.method2504(local13 - 1, local8, 8);
				this.method2504(local13, local8 + 1, 32);
			}
			if (arg1 == 1) {
				this.method2504(local13, local8, 10);
				this.method2504(local13, local8 + 1, 32);
				this.method2504(local13 + 1, local8, 128);
			}
			if (arg1 == 2) {
				this.method2504(local13, local8, 40);
				this.method2504(local13 + 1, local8, 128);
				this.method2504(local13, local8 - 1, 2);
			}
			if (arg1 == 3) {
				this.method2504(local13, local8, 160);
				this.method2504(local13, local8 - 1, 2);
				this.method2504(local13 - 1, local8, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method2504(local13, local8, 65536);
				this.method2504(local13 - 1, local8, 4096);
			}
			if (arg1 == 1) {
				this.method2504(local13, local8, 1024);
				this.method2504(local13, local8 + 1, 16384);
			}
			if (arg1 == 2) {
				this.method2504(local13, local8, 4096);
				this.method2504(local13 + 1, local8, 65536);
			}
			if (arg1 == 3) {
				this.method2504(local13, local8, 16384);
				this.method2504(local13, local8 - 1, 1024);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method2504(local13, local8, 512);
				this.method2504(local13 - 1, local8 + 1, 8192);
			}
			if (arg1 == 1) {
				this.method2504(local13, local8, 2048);
				this.method2504(local13 + 1, local8 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method2504(local13, local8, 8192);
				this.method2504(local13 + 1, local8 - 1, 512);
			}
			if (arg1 == 3) {
				this.method2504(local13, local8, 32768);
				this.method2504(local13 - 1, local8 + -1, 2048);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2504(local13, local8, 66560);
			this.method2504(local13 - 1, local8, 4096);
			this.method2504(local13, local8 + 1, 16384);
		}
		if (arg1 == 1) {
			this.method2504(local13, local8, 5120);
			this.method2504(local13, local8 + 1, 16384);
			this.method2504(local13 + 1, local8, 65536);
		}
		if (arg1 == 2) {
			this.method2504(local13, local8, 20480);
			this.method2504(local13 + 1, local8, 65536);
			this.method2504(local13, local8 - 1, 1024);
		}
		if (arg1 == 3) {
			this.method2504(local13, local8, 81920);
			this.method2504(local13, local8 - 1, 1024);
			this.method2504(local13 - 1, local8, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBZI)V")
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 256;
		if (arg3) {
			local3 = 131328;
		}
		@Pc(14) int local14 = arg4 - this.anInt3514;
		@Pc(19) int local19 = arg0 - this.anInt3519;
		for (@Pc(33) int local33 = local14; local33 < local14 + arg2; local33++) {
			if (local33 >= 0 && local33 < this.anInt3515) {
				for (@Pc(43) int local43 = local19; local43 < local19 + arg1; local43++) {
					if (local43 >= 0 && local43 < this.anInt3523) {
						this.method2508(local3, local43, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	public void method2512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3514;
		@Pc(17) int local17 = arg1 - this.anInt3519;
		this.anIntArrayArray38[local4][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public void method2513() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt3515; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt3523; local12++) {
				if (local8 == 0 || local12 == 0 || this.anInt3515 - 5 <= local8 || this.anInt3523 - 5 <= local12) {
					this.anIntArrayArray38[local8][local12] = 16777215;
				} else {
					this.anIntArrayArray38[local8][local12] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
	public void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3514;
		@Pc(13) int local13 = arg1 - this.anInt3519;
		this.anIntArrayArray38[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method2517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg3 && arg4 == arg5) {
			return true;
		}
		@Pc(25) int local25 = arg5 - this.anInt3519;
		@Pc(30) int local30 = arg3 - this.anInt3514;
		@Pc(35) int local35 = arg1 - this.anInt3514;
		@Pc(40) int local40 = arg4 - this.anInt3519;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local30 == local35 + 1 && local40 == local25 && (this.anIntArrayArray38[local30][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local35 && local25 == local40 - 1 && (this.anIntArrayArray38[local30][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local35 - 1 == local30 && local25 == local40 && (this.anIntArrayArray38[local30][local25] & 0x8) == 0) {
					return true;
				}
				if (local35 == local30 && local40 - 1 == local25 && (this.anIntArrayArray38[local30][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local35 - 1 == local30 && local25 == local40 && (this.anIntArrayArray38[local30][local25] & 0x8) == 0) {
					return true;
				}
				if (local35 == local30 && local25 == local40 + 1 && (this.anIntArrayArray38[local30][local25] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local35 + 1 == local30 && local40 == local25 && (this.anIntArrayArray38[local30][local25] & 0x80) == 0) {
					return true;
				}
				if (local30 == local35 && local40 + 1 == local25 && (this.anIntArrayArray38[local30][local25] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local30 == local35 && local25 == local40 + 1 && (this.anIntArrayArray38[local30][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local35 && local25 == local40 - 1 && (this.anIntArrayArray38[local30][local25] & 0x2) == 0) {
				return true;
			}
			if (local30 == local35 - 1 && local40 == local25 && (this.anIntArrayArray38[local30][local25] & 0x8) == 0) {
				return true;
			}
			if (local30 == local35 + 1 && local40 == local25 && (this.anIntArrayArray38[local30][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg3 + arg0 - 1;
		@Pc(24) int local24 = arg1 + arg6 - 1;
		if (arg1 <= arg2 && local24 >= arg2 && arg5 >= arg0 && local17 >= arg5) {
			return true;
		} else if (arg2 == arg1 - 1 && arg5 >= arg0 && local17 >= arg5 && (this.anIntArrayArray38[arg2 - this.anInt3514][arg5 - this.anInt3519] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local24 + 1 == arg2 && arg5 >= arg0 && arg5 <= local17 && (this.anIntArrayArray38[arg2 - this.anInt3514][arg5 - this.anInt3519] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg0 - 1 && arg1 <= arg2 && local24 >= arg2 && (this.anIntArrayArray38[arg2 - this.anInt3514][arg5 - this.anInt3519] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local17 + 1 == arg5 && arg2 >= arg1 && arg2 <= local24 && (this.anIntArrayArray38[arg2 - this.anInt3514][arg5 - this.anInt3519] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIBZI)V")
	public void method2519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg0 - this.anInt3519;
		@Pc(19) int local19 = arg2 - this.anInt3514;
		@Pc(31) int local31;
		if (arg1 == 1 || arg1 == 3) {
			local31 = arg5;
			arg5 = arg3;
			arg3 = local31;
		}
		@Pc(37) int local37 = 256;
		if (arg4) {
			local37 = 131328;
		}
		for (local31 = local19; local31 < arg5 + local19; local31++) {
			if (local31 >= 0 && local31 < this.anInt3515) {
				for (@Pc(59) int local59 = local6; local59 < arg3 + local6; local59++) {
					if (local59 >= 0 && local59 < this.anInt3523) {
						this.method2504(local31, local59, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	public void method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3514;
		@Pc(19) int local19 = arg0 - this.anInt3519;
		this.anIntArrayArray38[local8][local19] &= 0xFFFBFFFF;
	}
}

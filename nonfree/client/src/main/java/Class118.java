import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class118 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	private int anInt3553 = 0;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	private int anInt3550;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	private int anInt3556;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	private int anInt3542;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(II)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3550 = arg1;
		this.anInt3556 = 0;
		this.anInt3542 = arg0;
		this.anIntArrayArray28 = new int[this.anInt3542][this.anInt3550];
		this.method3038();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIZIII)V")
	public void method3032(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt3556;
		@Pc(13) int local13 = arg5 - this.anInt3553;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method3049(local13, local4, 128);
				this.method3049(local13, local4 - 1, 8);
			}
			if (arg4 == 1) {
				this.method3049(local13, local4, 2);
				this.method3049(local13 + 1, local4, 32);
			}
			if (arg4 == 2) {
				this.method3049(local13, local4, 8);
				this.method3049(local13, local4 + 1, 128);
			}
			if (arg4 == 3) {
				this.method3049(local13, local4, 32);
				this.method3049(local13 - 1, local4, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method3049(local13, local4, 1);
				this.method3049(local13 + 1, local4 + -1, 16);
			}
			if (arg4 == 1) {
				this.method3049(local13, local4, 4);
				this.method3049(local13 + 1, local4 + 1, 64);
			}
			if (arg4 == 2) {
				this.method3049(local13, local4, 16);
				this.method3049(local13 - 1, local4 - -1, 1);
			}
			if (arg4 == 3) {
				this.method3049(local13, local4, 64);
				this.method3049(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method3049(local13, local4, 130);
				this.method3049(local13, local4 - 1, 8);
				this.method3049(local13 + 1, local4, 32);
			}
			if (arg4 == 1) {
				this.method3049(local13, local4, 10);
				this.method3049(local13 + 1, local4, 32);
				this.method3049(local13, local4 + 1, 128);
			}
			if (arg4 == 2) {
				this.method3049(local13, local4, 40);
				this.method3049(local13, local4 + 1, 128);
				this.method3049(local13 - 1, local4, 2);
			}
			if (arg4 == 3) {
				this.method3049(local13, local4, 160);
				this.method3049(local13 - 1, local4, 2);
				this.method3049(local13, local4 - 1, 8);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method3049(local13, local4, 65536);
					this.method3049(local13, local4 - 1, 4096);
				}
				if (arg4 == 1) {
					this.method3049(local13, local4, 1024);
					this.method3049(local13 + 1, local4, 16384);
				}
				if (arg4 == 2) {
					this.method3049(local13, local4, 4096);
					this.method3049(local13, local4 + 1, 65536);
				}
				if (arg4 == 3) {
					this.method3049(local13, local4, 16384);
					this.method3049(local13 - 1, local4, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method3049(local13, local4, 512);
					this.method3049(local13 + 1, local4 + -1, 8192);
				}
				if (arg4 == 1) {
					this.method3049(local13, local4, 2048);
					this.method3049(local13 + 1, local4 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method3049(local13, local4, 8192);
					this.method3049(local13 - 1, local4 + 1, 512);
				}
				if (arg4 == 3) {
					this.method3049(local13, local4, 32768);
					this.method3049(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method3049(local13, local4, 66560);
					this.method3049(local13, local4 - 1, 4096);
					this.method3049(local13 + 1, local4, 16384);
				}
				if (arg4 == 1) {
					this.method3049(local13, local4, 5120);
					this.method3049(local13 + 1, local4, 16384);
					this.method3049(local13, local4 + 1, 65536);
				}
				if (arg4 == 2) {
					this.method3049(local13, local4, 20480);
					this.method3049(local13, local4 + 1, 65536);
					this.method3049(local13 - 1, local4, 1024);
				}
				if (arg4 == 3) {
					this.method3049(local13, local4, 81920);
					this.method3049(local13 - 1, local4, 1024);
					this.method3049(local13, local4 - 1, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method3049(local13, local4, 536870912);
				this.method3049(local13, local4 - 1, 33554432);
			}
			if (arg4 == 1) {
				this.method3049(local13, local4, 8388608);
				this.method3049(local13 + 1, local4, 134217728);
			}
			if (arg4 == 2) {
				this.method3049(local13, local4, 33554432);
				this.method3049(local13, local4 + 1, 536870912);
			}
			if (arg4 == 3) {
				this.method3049(local13, local4, 134217728);
				this.method3049(local13 - 1, local4, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method3049(local13, local4, 4194304);
				this.method3049(local13 + 1, local4 - 1, 67108864);
			}
			if (arg4 == 1) {
				this.method3049(local13, local4, 16777216);
				this.method3049(local13 + 1, local4 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method3049(local13, local4, 67108864);
				this.method3049(local13 - 1, local4 + 1, 4194304);
			}
			if (arg4 == 3) {
				this.method3049(local13, local4, 268435456);
				this.method3049(local13 - 1, local4 + -1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method3049(local13, local4, 545259520);
			this.method3049(local13, local4 - 1, 33554432);
			this.method3049(local13 + 1, local4, 134217728);
		}
		if (arg4 == 1) {
			this.method3049(local13, local4, 41943040);
			this.method3049(local13 + 1, local4, 134217728);
			this.method3049(local13, local4 + 1, 536870912);
		}
		if (arg4 == 2) {
			this.method3049(local13, local4, 167772160);
			this.method3049(local13, local4 + 1, 536870912);
			this.method3049(local13 - 1, local4, 8388608);
		}
		if (arg4 == 3) {
			this.method3049(local13, local4, 671088640);
			this.method3049(local13 - 1, local4, 8388608);
			this.method3049(local13, local4 - 1, 33554432);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method3033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 + arg7;
		@Pc(20) int local20 = arg3 + arg0;
		@Pc(24) int local24 = arg5 + arg2;
		@Pc(29) int local29 = arg4 + arg8;
		@Pc(69) int local69;
		@Pc(76) int local76;
		if (arg7 >= arg3 && arg7 < local20) {
			if (local24 == arg4 && (arg1 & 0x4) == 0) {
				local69 = arg7;
				local76 = local9 > local20 ? local20 : local9;
				while (local76 > local69) {
					if ((this.anIntArrayArray28[local69 - this.anInt3556][local24 - this.anInt3553 - 1] & 0x2) == 0) {
						return true;
					}
					local69++;
				}
			} else if (local29 == arg5 && (arg1 & 0x1) == 0) {
				local69 = arg7;
				local76 = local20 < local9 ? local20 : local9;
				while (local69 < local76) {
					if ((this.anIntArrayArray28[local69 - this.anInt3556][arg5 - this.anInt3553] & 0x20) == 0) {
						return true;
					}
					local69++;
				}
			}
		} else if (local9 > arg3 && local20 >= local9) {
			if (arg4 == local24 && (arg1 & 0x4) == 0) {
				local69 = arg3;
				local76 = local9 <= local20 ? local9 : local20;
				while (local69 < local76) {
					if ((this.anIntArrayArray28[local69 - this.anInt3556][local24 - this.anInt3553 - 1] & 0x2) == 0) {
						return true;
					}
					local69++;
				}
			} else if (local29 == arg5 && (arg1 & 0x1) == 0) {
				local69 = arg3;
				local76 = local9 > local20 ? local20 : local9;
				while (local76 > local69) {
					if ((this.anIntArrayArray28[local69 - this.anInt3556][arg5 - this.anInt3553] & 0x20) == 0) {
						return true;
					}
					local69++;
				}
			}
		} else if (arg4 <= arg5 && local29 > arg5) {
			if (arg3 == local9 && (arg1 & 0x8) == 0) {
				local69 = arg5;
				local76 = local29 >= local24 ? local24 : local29;
				while (local76 > local69) {
					if ((this.anIntArrayArray28[local9 - this.anInt3556 - 1][local69 - this.anInt3553] & 0x8) == 0) {
						return true;
					}
					local69++;
				}
			} else if (arg7 == local20 && (arg1 & 0x2) == 0) {
				local69 = arg5;
				local76 = local24 > local29 ? local29 : local24;
				while (local69 < local76) {
					if ((this.anIntArrayArray28[arg7 - this.anInt3556][local69 - this.anInt3553] & 0x80) == 0) {
						return true;
					}
					local69++;
				}
			}
		} else if (arg4 < local24 && local29 >= local24) {
			if (arg3 == local9 && (arg1 & 0x8) == 0) {
				local76 = local24 <= local29 ? local24 : local29;
				for (local69 = arg4; local69 < local76; local69++) {
					if ((this.anIntArrayArray28[local9 - this.anInt3556 - 1][local69 - this.anInt3553] & 0x8) == 0) {
						return true;
					}
				}
			} else if (arg7 == local20 && (arg1 & 0x2) == 0) {
				local69 = arg4;
				local76 = local29 >= local24 ? local24 : local29;
				while (local76 > local69) {
					if ((this.anIntArrayArray28[arg7 - this.anInt3556][local69 - this.anInt3553] & 0x80) == 0) {
						return true;
					}
					local69++;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIBI)Z")
	public boolean method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static127.method2219(arg6, arg7, arg7, arg1, arg4, arg3, arg5, arg2) ? true : this.method3033(arg3, arg0, arg7, arg6, arg1, arg4, arg7, arg2, arg5);
		}
		@Pc(43) int local43 = arg3 + arg6 - 1;
		@Pc(49) int local49 = arg5 + arg1 - 1;
		if (arg2 >= arg6 && arg2 <= local43 && arg4 >= arg1 && local49 >= arg4) {
			return true;
		} else if (arg6 - 1 == arg2 && arg4 >= arg1 && arg4 <= local49 && (this.anIntArrayArray28[arg2 - this.anInt3556][arg4 - this.anInt3553] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg2 == local43 + 1 && arg1 <= arg4 && arg4 <= local49 && (this.anIntArrayArray28[arg2 - this.anInt3556][arg4 - this.anInt3553] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg1 - 1 && arg6 <= arg2 && local43 >= arg2 && (this.anIntArrayArray28[arg2 - this.anInt3556][arg4 - this.anInt3553] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local49 + 1 && arg6 <= arg2 && arg2 <= local43 && (this.anIntArrayArray28[arg2 - this.anInt3556][arg4 - this.anInt3553] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBI)V")
	public void method3035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3556;
		@Pc(13) int local13 = arg0 - this.anInt3553;
		this.anIntArrayArray28[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIB)Z")
	public boolean method3036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == arg3 && arg2 == arg0) {
			return true;
		}
		@Pc(26) int local26 = arg2 - this.anInt3553;
		@Pc(31) int local31 = arg1 - this.anInt3556;
		if (local31 < 0 || this.anInt3542 <= local31 || local26 < 0 || local26 >= this.anInt3550) {
			return false;
		}
		@Pc(63) int local63 = arg3 - this.anInt3556;
		@Pc(75) int local75;
		if (local31 > local63) {
			local75 = local31 - local63;
		} else {
			local75 = local63 - local31;
		}
		@Pc(87) int local87 = arg0 - this.anInt3553;
		@Pc(99) int local99;
		if (local87 >= local26) {
			local99 = local87 - local26;
		} else {
			local99 = local26 - local87;
		}
		@Pc(117) int local117;
		@Pc(111) int local111;
		if (local99 < local75) {
			local111 = 32768;
			local117 = local99 * 65536 / local75;
			while (local31 != local63) {
				if (local63 < local31) {
					if ((this.anIntArrayArray28[local63][local87] & 0x2C0108) != 0) {
						return false;
					}
					local63++;
				} else if (local31 < local63) {
					if ((this.anIntArrayArray28[local63][local87] & 0x2C0180) != 0) {
						return false;
					}
					local63--;
				}
				local111 += local117;
				if (local111 >= 65536) {
					local111 -= 65536;
					if (local26 > local87) {
						if ((this.anIntArrayArray28[local63][local87] & 0x2C0102) != 0) {
							return false;
						}
						local87++;
					} else if (local26 < local87) {
						if ((this.anIntArrayArray28[local63][local87] & 0x2C0120) != 0) {
							return false;
						}
						local87--;
					}
				}
			}
		} else {
			local117 = local75 * 65536 / local99;
			local111 = 32768;
			while (local87 != local26) {
				if (local87 < local26) {
					if ((this.anIntArrayArray28[local63][local87] & 0x2C0102) != 0) {
						return false;
					}
					local87++;
				} else if (local87 > local26) {
					if ((this.anIntArrayArray28[local63][local87] & 0x2C0120) != 0) {
						return false;
					}
					local87--;
				}
				local111 += local117;
				if (local111 >= 65536) {
					local111 -= 65536;
					if (local31 > local63) {
						if ((this.anIntArrayArray28[local63][local87] & 0x2C0108) != 0) {
							return false;
						}
						local63++;
					} else if (local31 < local63) {
						if ((this.anIntArrayArray28[local63][local87] & 0x2C0180) != 0) {
							return false;
						}
						local63--;
					}
				}
			}
		}
		return (this.anIntArrayArray28[local31][local26] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIIIIZI)V")
	public void method3037(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg4 - this.anInt3553;
		@Pc(8) int local8 = 256;
		@Pc(16) int local16;
		if (arg2 == 1 || arg2 == 3) {
			local16 = arg6;
			arg6 = arg3;
			arg3 = local16;
		}
		@Pc(29) int local29 = arg0 - this.anInt3556;
		if (arg1) {
			local8 = 131328;
		}
		if (arg5) {
			local8 |= 0x40000000;
		}
		for (local16 = local29; local16 < local29 + arg6; local16++) {
			if (local16 >= 0 && this.anInt3542 > local16) {
				for (@Pc(71) int local71 = local6; local71 < local6 + arg3; local71++) {
					if (local71 >= 0 && this.anInt3550 > local71) {
						this.method3046(local71, local16, local8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public void method3038() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3542; local3++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt3550; local15++) {
				if (local3 == 0 || local15 == 0 || local3 >= this.anInt3542 - 5 || local15 >= this.anInt3550 - 5) {
					this.anIntArrayArray28[local3][local15] = 16777215;
				} else {
					this.anIntArrayArray28[local3][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg5 && arg2 == arg3) {
				return true;
			}
		} else if (arg5 <= arg6 && arg6 <= arg4 + arg5 - 1 && arg2 >= arg2 && arg4 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(59) int local59 = arg2 - this.anInt3553;
		@Pc(64) int local64 = arg3 - this.anInt3553;
		@Pc(69) int local69 = arg6 - this.anInt3556;
		@Pc(80) int local80 = arg5 - this.anInt3556;
		if (arg4 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local80 == local69 + 1 && local59 == local64 && (this.anIntArrayArray28[local80][local64] & 0x80) == 0) {
						return true;
					}
					if (local69 == local80 && local64 == local59 - 1 && (this.anIntArrayArray28[local80][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local80 == local69 - 1 && local59 == local64 && (this.anIntArrayArray28[local80][local64] & 0x8) == 0) {
						return true;
					}
					if (local69 == local80 && local59 - 1 == local64 && (this.anIntArrayArray28[local80][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local80 == local69 - 1 && local64 == local59 && (this.anIntArrayArray28[local80][local64] & 0x8) == 0) {
						return true;
					}
					if (local69 == local80 && local59 + 1 == local64 && (this.anIntArrayArray28[local80][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local80 == local69 + 1 && local59 == local64 && (this.anIntArrayArray28[local80][local64] & 0x80) == 0) {
						return true;
					}
					if (local80 == local69 && local59 + 1 == local64 && (this.anIntArrayArray28[local80][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local80 == local69 && local64 == local59 + 1 && (this.anIntArrayArray28[local80][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 == local80 && local59 - 1 == local64 && (this.anIntArrayArray28[local80][local64] & 0x2) == 0) {
					return true;
				}
				if (local69 - 1 == local80 && local59 == local64 && (this.anIntArrayArray28[local80][local64] & 0x8) == 0) {
					return true;
				}
				if (local80 == local69 + 1 && local59 == local64 && (this.anIntArrayArray28[local80][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(91) int local91 = arg4 + local64 - 1;
			@Pc(97) int local97 = arg4 + local80 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local80 == local69 + 1 && local59 >= local64 && local91 >= local59 && (this.anIntArrayArray28[local80][local59] & 0x80) == 0) {
						return true;
					}
					if (local80 <= local69 && local97 >= local69 && local64 == local59 - arg4 && (this.anIntArrayArray28[local69][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local80 == local69 - arg4 && local64 <= local59 && local91 >= local59 && (this.anIntArrayArray28[local97][local59] & 0x8) == 0) {
						return true;
					}
					if (local80 <= local69 && local69 <= local97 && local64 == local59 - arg4 && (this.anIntArrayArray28[local69][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local80 == local69 - arg4 && local59 >= local64 && local59 <= local91 && (this.anIntArrayArray28[local97][local59] & 0x8) == 0) {
						return true;
					}
					if (local80 <= local69 && local97 >= local69 && local64 == local59 + 1 && (this.anIntArrayArray28[local69][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local80 == local69 + 1 && local59 >= local64 && local59 <= local91 && (this.anIntArrayArray28[local80][local59] & 0x80) == 0) {
						return true;
					}
					if (local69 >= local80 && local69 <= local97 && local59 + 1 == local64 && (this.anIntArrayArray28[local69][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local80 <= local69 && local97 >= local69 && local64 == local59 + 1 && (this.anIntArrayArray28[local69][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 >= local80 && local97 >= local69 && local64 == local59 - arg4 && (this.anIntArrayArray28[local69][local91] & 0x2) == 0) {
					return true;
				}
				if (local69 - arg4 == local80 && local59 >= local64 && local59 <= local91 && (this.anIntArrayArray28[local97][local59] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local80 && local64 <= local59 && local91 >= local59 && (this.anIntArrayArray28[local80][local59] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZIIIZI)V")
	public void method3041(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt3556;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg4 - this.anInt3553;
		for (@Pc(41) int local41 = local18; local41 < local18 + arg2; local41++) {
			if (local41 >= 0 && local41 < this.anInt3542) {
				for (@Pc(63) int local63 = local29; local63 < local29 + arg3; local63++) {
					if (local63 >= 0 && local63 < this.anInt3550) {
						this.method3049(local63, local41, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIZIIII)V")
	public void method3042(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt3553;
		@Pc(13) int local13 = arg5 - this.anInt3556;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method3046(local8, local13, 128);
				this.method3046(local8, local13 - 1, 8);
			}
			if (arg2 == 1) {
				this.method3046(local8, local13, 2);
				this.method3046(local8 + 1, local13, 32);
			}
			if (arg2 == 2) {
				this.method3046(local8, local13, 8);
				this.method3046(local8, local13 + 1, 128);
			}
			if (arg2 == 3) {
				this.method3046(local8, local13, 32);
				this.method3046(local8 - 1, local13, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method3046(local8, local13, 1);
				this.method3046(local8 + 1, local13 + -1, 16);
			}
			if (arg2 == 1) {
				this.method3046(local8, local13, 4);
				this.method3046(local8 + 1, local13 - -1, 64);
			}
			if (arg2 == 2) {
				this.method3046(local8, local13, 16);
				this.method3046(local8 - 1, local13 + 1, 1);
			}
			if (arg2 == 3) {
				this.method3046(local8, local13, 64);
				this.method3046(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method3046(local8, local13, 130);
				this.method3046(local8, local13 - 1, 8);
				this.method3046(local8 + 1, local13, 32);
			}
			if (arg2 == 1) {
				this.method3046(local8, local13, 10);
				this.method3046(local8 + 1, local13, 32);
				this.method3046(local8, local13 + 1, 128);
			}
			if (arg2 == 2) {
				this.method3046(local8, local13, 40);
				this.method3046(local8, local13 + 1, 128);
				this.method3046(local8 - 1, local13, 2);
			}
			if (arg2 == 3) {
				this.method3046(local8, local13, 160);
				this.method3046(local8 - 1, local13, 2);
				this.method3046(local8, local13 - 1, 8);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method3046(local8, local13, 65536);
					this.method3046(local8, local13 - 1, 4096);
				}
				if (arg2 == 1) {
					this.method3046(local8, local13, 1024);
					this.method3046(local8 + 1, local13, 16384);
				}
				if (arg2 == 2) {
					this.method3046(local8, local13, 4096);
					this.method3046(local8, local13 + 1, 65536);
				}
				if (arg2 == 3) {
					this.method3046(local8, local13, 16384);
					this.method3046(local8 - 1, local13, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method3046(local8, local13, 512);
					this.method3046(local8 + 1, local13 + -1, 8192);
				}
				if (arg2 == 1) {
					this.method3046(local8, local13, 2048);
					this.method3046(local8 + 1, local13 + 1, 32768);
				}
				if (arg2 == 2) {
					this.method3046(local8, local13, 8192);
					this.method3046(local8 - 1, local13 + 1, 512);
				}
				if (arg2 == 3) {
					this.method3046(local8, local13, 32768);
					this.method3046(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method3046(local8, local13, 66560);
					this.method3046(local8, local13 - 1, 4096);
					this.method3046(local8 + 1, local13, 16384);
				}
				if (arg2 == 1) {
					this.method3046(local8, local13, 5120);
					this.method3046(local8 + 1, local13, 16384);
					this.method3046(local8, local13 + 1, 65536);
				}
				if (arg2 == 2) {
					this.method3046(local8, local13, 20480);
					this.method3046(local8, local13 + 1, 65536);
					this.method3046(local8 - 1, local13, 1024);
				}
				if (arg2 == 3) {
					this.method3046(local8, local13, 81920);
					this.method3046(local8 - 1, local13, 1024);
					this.method3046(local8, local13 - 1, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method3046(local8, local13, 536870912);
				this.method3046(local8, local13 - 1, 33554432);
			}
			if (arg2 == 1) {
				this.method3046(local8, local13, 8388608);
				this.method3046(local8 + 1, local13, 134217728);
			}
			if (arg2 == 2) {
				this.method3046(local8, local13, 33554432);
				this.method3046(local8, local13 + 1, 536870912);
			}
			if (arg2 == 3) {
				this.method3046(local8, local13, 134217728);
				this.method3046(local8 - 1, local13, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method3046(local8, local13, 4194304);
				this.method3046(local8 + 1, local13 - 1, 67108864);
			}
			if (arg2 == 1) {
				this.method3046(local8, local13, 16777216);
				this.method3046(local8 + 1, local13 + 1, 268435456);
			}
			if (arg2 == 2) {
				this.method3046(local8, local13, 67108864);
				this.method3046(local8 - 1, local13 - -1, 4194304);
			}
			if (arg2 == 3) {
				this.method3046(local8, local13, 268435456);
				this.method3046(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method3046(local8, local13, 545259520);
			this.method3046(local8, local13 - 1, 33554432);
			this.method3046(local8 + 1, local13, 134217728);
		}
		if (arg2 == 1) {
			this.method3046(local8, local13, 41943040);
			this.method3046(local8 + 1, local13, 134217728);
			this.method3046(local8, local13 + 1, 536870912);
		}
		if (arg2 == 2) {
			this.method3046(local8, local13, 167772160);
			this.method3046(local8, local13 + 1, 536870912);
			this.method3046(local8 - 1, local13, 8388608);
		}
		if (arg2 == 3) {
			this.method3046(local8, local13, 671088640);
			this.method3046(local8 - 1, local13, 8388608);
			this.method3046(local8, local13 - 1, 33554432);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg6 && arg1 == arg5) {
				return true;
			}
		} else if (arg2 <= arg6 && arg6 <= arg0 + arg2 - 1 && arg1 <= arg1 && arg0 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(57) int local57 = arg5 - this.anInt3553;
		@Pc(62) int local62 = arg6 - this.anInt3556;
		@Pc(67) int local67 = arg1 - this.anInt3553;
		@Pc(72) int local72 = arg2 - this.anInt3556;
		if (arg0 == 1) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					if (local72 == local62 - 1 && local67 == local57) {
						return true;
					}
					if (local62 == local72 && local67 + 1 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 && local57 == local67 - 1 && (this.anIntArrayArray28[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local72 == local62 && local67 + 1 == local57) {
						return true;
					}
					if (local72 == local62 - 1 && local67 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray28[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local62 + 1 == local72 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local67 + 1 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 && local67 - 1 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local62 == local72 && local57 == local67 - 1) {
						return true;
					}
					if (local62 - 1 == local72 && local67 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local67 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					if (local72 == local62 - 1 && local57 == local67) {
						return true;
					}
					if (local62 == local72 && local67 + 1 == local57) {
						return true;
					}
					if (local62 + 1 == local72 && local67 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local62 && local57 == local67 - 1 && (this.anIntArrayArray28[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local62 - 1 == local72 && local57 == local67 && (this.anIntArrayArray28[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local72 && local57 == local67 + 1) {
						return true;
					}
					if (local62 + 1 == local72 && local67 == local57) {
						return true;
					}
					if (local62 == local72 && local57 == local67 - 1 && (this.anIntArrayArray28[local72][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local62 - 1 && local57 == local67 && (this.anIntArrayArray28[local72][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 && local57 == local67 + 1 && (this.anIntArrayArray28[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 == local67) {
						return true;
					}
					if (local62 == local72 && local57 == local67 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local62 - 1 && local57 == local67) {
						return true;
					}
					if (local62 == local72 && local67 + 1 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray28[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local62 && local67 - 1 == local57) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local62 == local72 && local67 + 1 == local57 && (this.anIntArrayArray28[local72][local57] & 0x20) == 0) {
					return true;
				}
				if (local62 == local72 && local67 - 1 == local57 && (this.anIntArrayArray28[local72][local57] & 0x2) == 0) {
					return true;
				}
				if (local62 - 1 == local72 && local57 == local67 && (this.anIntArrayArray28[local72][local57] & 0x8) == 0) {
					return true;
				}
				if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray28[local72][local57] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = arg0 + local72 - 1;
			@Pc(92) int local92 = arg0 + local57 - 1;
			if (arg3 == 0) {
				if (arg4 == 0) {
					if (local72 == local62 - arg0 && local67 >= local57 && local92 >= local67) {
						return true;
					}
					if (local62 >= local72 && local62 <= local86 && local67 + 1 == local57 && (this.anIntArrayArray28[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 <= local62 && local86 >= local62 && local67 - arg0 == local57 && (this.anIntArrayArray28[local62][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local62 >= local72 && local86 >= local62 && local57 == local67 + 1) {
						return true;
					}
					if (local62 - arg0 == local72 && local57 <= local67 && local92 >= local67 && (this.anIntArrayArray28[local86][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local72 && local57 <= local67 && local67 <= local92 && (this.anIntArrayArray28[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local62 + 1 && local67 >= local57 && local92 >= local67) {
						return true;
					}
					if (local62 >= local72 && local62 <= local86 && local67 + 1 == local57 && (this.anIntArrayArray28[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 >= local72 && local86 >= local62 && local57 == local67 - arg0 && (this.anIntArrayArray28[local62][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 <= local62 && local62 <= local86 && local67 - arg0 == local57) {
						return true;
					}
					if (local72 == local62 - arg0 && local67 >= local57 && local67 <= local92 && (this.anIntArrayArray28[local86][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local72 && local67 >= local57 && local92 >= local67 && (this.anIntArrayArray28[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					if (local72 == local62 - arg0 && local57 <= local67 && local92 >= local67) {
						return true;
					}
					if (local72 <= local62 && local86 >= local62 && local67 + 1 == local57) {
						return true;
					}
					if (local62 + 1 == local72 && local67 >= local57 && local67 <= local92 && (this.anIntArrayArray28[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local72 && local86 >= local62 && local57 == local67 - arg0 && (this.anIntArrayArray28[local62][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local62 - arg0 == local72 && local57 <= local67 && local92 >= local67 && (this.anIntArrayArray28[local86][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 >= local72 && local62 <= local86 && local67 + 1 == local57) {
						return true;
					}
					if (local72 == local62 + 1 && local67 >= local57 && local67 <= local92) {
						return true;
					}
					if (local72 <= local62 && local62 <= local86 && local57 == local67 - arg0 && (this.anIntArrayArray28[local62][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local72 == local62 - arg0 && local67 >= local57 && local67 <= local92 && (this.anIntArrayArray28[local86][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 <= local62 && local62 <= local86 && local67 + 1 == local57 && (this.anIntArrayArray28[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local72 && local57 <= local67 && local67 <= local92) {
						return true;
					}
					if (local72 <= local62 && local86 >= local62 && local67 - arg0 == local57) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local72 == local62 - arg0 && local67 >= local57 && local67 <= local92) {
						return true;
					}
					if (local62 >= local72 && local62 <= local86 && local57 == local67 + 1 && (this.anIntArrayArray28[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local67 >= local57 && local67 <= local92 && (this.anIntArrayArray28[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local62 && local86 >= local62 && local57 == local67 - arg0) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local72 <= local62 && local62 <= local86 && local57 == local67 + 1 && (this.anIntArrayArray28[local62][local57] & 0x2C0120) == 0) {
					return true;
				}
				if (local72 <= local62 && local62 <= local86 && local57 == local67 - arg0 && (this.anIntArrayArray28[local62][local92] & 0x2C0102) == 0) {
					return true;
				}
				if (local62 - arg0 == local72 && local67 >= local57 && local92 >= local67 && (this.anIntArrayArray28[local86][local67] & 0x2C0108) == 0) {
					return true;
				}
				if (local72 == local62 + 1 && local67 >= local57 && local67 <= local92 && (this.anIntArrayArray28[local72][local67] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V")
	public void method3044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3553;
		@Pc(13) int local13 = arg0 - this.anInt3556;
		this.anIntArrayArray28[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public void method3045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3556;
		@Pc(13) int local13 = arg1 - this.anInt3553;
		this.anIntArrayArray28[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V")
	private void method3046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray28[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V")
	private void method3049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray28[arg1][arg0] |= arg2;
	}
}

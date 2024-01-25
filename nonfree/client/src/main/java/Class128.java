import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class128 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public int anInt3691;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public int anInt3692;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public int anInt3693;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public int anInt3705;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB)V")
	public void method3176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3691;
		@Pc(13) int local13 = arg1 - this.anInt3692;
		this.anIntArrayArray27[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method3177() {
		for (@Pc(22) int local22 = 0; local22 < this.anInt3693; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt3705; local26++) {
				if (local22 == 0 || local26 == 0 || local22 >= this.anInt3693 - 5 || this.anInt3705 - 5 <= local26) {
					this.anIntArrayArray27[local22][local26] = -1;
				} else {
					this.anIntArrayArray27[local22][local26] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZIIBZ)V")
	public void method3179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt3692;
		@Pc(9) int local9 = arg3 - this.anInt3691;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method3188(local4, local9, 128);
				this.method3188(local4, local9 - 1, 8);
			}
			if (arg0 == 1) {
				this.method3188(local4, local9, 2);
				this.method3188(local4 + 1, local9, 32);
			}
			if (arg0 == 2) {
				this.method3188(local4, local9, 8);
				this.method3188(local4, local9 + 1, 128);
			}
			if (arg0 == 3) {
				this.method3188(local4, local9, 32);
				this.method3188(local4 - 1, local9, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method3188(local4, local9, 1);
				this.method3188(local4 + 1, local9 - 1, 16);
			}
			if (arg0 == 1) {
				this.method3188(local4, local9, 4);
				this.method3188(local4 + 1, local9 + 1, 64);
			}
			if (arg0 == 2) {
				this.method3188(local4, local9, 16);
				this.method3188(local4 - 1, local9 + 1, 1);
			}
			if (arg0 == 3) {
				this.method3188(local4, local9, 64);
				this.method3188(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method3188(local4, local9, 130);
				this.method3188(local4, local9 - 1, 8);
				this.method3188(local4 + 1, local9, 32);
			}
			if (arg0 == 1) {
				this.method3188(local4, local9, 10);
				this.method3188(local4 + 1, local9, 32);
				this.method3188(local4, local9 + 1, 128);
			}
			if (arg0 == 2) {
				this.method3188(local4, local9, 40);
				this.method3188(local4, local9 + 1, 128);
				this.method3188(local4 - 1, local9, 2);
			}
			if (arg0 == 3) {
				this.method3188(local4, local9, 160);
				this.method3188(local4 - 1, local9, 2);
				this.method3188(local4, local9 - 1, 8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method3188(local4, local9, 65536);
					this.method3188(local4, local9 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method3188(local4, local9, 1024);
					this.method3188(local4 + 1, local9, 16384);
				}
				if (arg0 == 2) {
					this.method3188(local4, local9, 4096);
					this.method3188(local4, local9 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method3188(local4, local9, 16384);
					this.method3188(local4 - 1, local9, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method3188(local4, local9, 512);
					this.method3188(local4 + 1, local9 - 1, 8192);
				}
				if (arg0 == 1) {
					this.method3188(local4, local9, 2048);
					this.method3188(local4 + 1, local9 - -1, 32768);
				}
				if (arg0 == 2) {
					this.method3188(local4, local9, 8192);
					this.method3188(local4 - 1, local9 - -1, 512);
				}
				if (arg0 == 3) {
					this.method3188(local4, local9, 32768);
					this.method3188(local4 - 1, local9 - 1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method3188(local4, local9, 66560);
					this.method3188(local4, local9 - 1, 4096);
					this.method3188(local4 + 1, local9, 16384);
				}
				if (arg0 == 1) {
					this.method3188(local4, local9, 5120);
					this.method3188(local4 + 1, local9, 16384);
					this.method3188(local4, local9 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method3188(local4, local9, 20480);
					this.method3188(local4, local9 + 1, 65536);
					this.method3188(local4 - 1, local9, 1024);
				}
				if (arg0 == 3) {
					this.method3188(local4, local9, 81920);
					this.method3188(local4 - 1, local9, 1024);
					this.method3188(local4, local9 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method3188(local4, local9, 536870912);
				this.method3188(local4, local9 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method3188(local4, local9, 8388608);
				this.method3188(local4 + 1, local9, 134217728);
			}
			if (arg0 == 2) {
				this.method3188(local4, local9, 33554432);
				this.method3188(local4, local9 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method3188(local4, local9, 134217728);
				this.method3188(local4 - 1, local9, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method3188(local4, local9, 4194304);
				this.method3188(local4 + 1, local9 + -1, 67108864);
			}
			if (arg0 == 1) {
				this.method3188(local4, local9, 16777216);
				this.method3188(local4 + 1, local9 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method3188(local4, local9, 67108864);
				this.method3188(local4 - 1, local9 + 1, 4194304);
			}
			if (arg0 == 3) {
				this.method3188(local4, local9, 268435456);
				this.method3188(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3188(local4, local9, 545259520);
			this.method3188(local4, local9 - 1, 33554432);
			this.method3188(local4 + 1, local9, 134217728);
		}
		if (arg0 == 1) {
			this.method3188(local4, local9, 41943040);
			this.method3188(local4 + 1, local9, 134217728);
			this.method3188(local4, local9 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method3188(local4, local9, 167772160);
			this.method3188(local4, local9 + 1, 536870912);
			this.method3188(local4 - 1, local9, 8388608);
		}
		if (arg0 == 3) {
			this.method3188(local4, local9, 671088640);
			this.method3188(local4 - 1, local9, 8388608);
			this.method3188(local4, local9 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	public void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3692;
		@Pc(14) int local14 = arg1 - this.anInt3691;
		this.anIntArrayArray27[local14][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZZIBIIII)V")
	public void method3181(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg6 - this.anInt3692;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(34) int local34;
		if (arg3 == 1 || arg3 == 3) {
			local34 = arg5;
			arg5 = arg4;
			arg4 = local34;
		}
		@Pc(43) int local43 = arg2 - this.anInt3691;
		for (local34 = local43; local34 < local43 + arg5; local34++) {
			if (local34 >= 0 && local34 < this.anInt3693) {
				for (@Pc(61) int local61 = local18; local61 < arg4 + local18; local61++) {
					if (local61 >= 0 && local61 < this.anInt3705) {
						this.method3191(local61, local34, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V")
	public void method3184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt3692;
		@Pc(15) int local15 = arg0 - this.anInt3691;
		this.anIntArrayArray27[local15][local10] |= 0x200000;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
	public void method3185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3691;
		@Pc(9) int local9 = arg1 - this.anInt3692;
		this.anIntArrayArray27[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg2 == arg6 && arg0 == arg3) {
				return true;
			}
		} else if (arg2 <= arg6 && arg6 <= arg4 + arg2 - 1 && arg3 >= arg3 && arg4 + arg3 - 1 >= arg3) {
			return true;
		}
		@Pc(60) int local60 = arg2 - this.anInt3691;
		@Pc(65) int local65 = arg0 - this.anInt3692;
		@Pc(70) int local70 = arg3 - this.anInt3692;
		@Pc(75) int local75 = arg6 - this.anInt3691;
		if (arg4 == 1) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local60 == local75 - 1 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 == local70 + 1 && (this.anIntArrayArray27[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local60 && local65 == local70 - 1 && (this.anIntArrayArray27[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local60 == local75 && local70 + 1 == local65) {
						return true;
					}
					if (local75 - 1 == local60 && local70 == local65 && (this.anIntArrayArray27[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 == local75 + 1 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 == local70 + 1 && (this.anIntArrayArray27[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local60 && local65 == local70 - 1 && (this.anIntArrayArray27[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local60 == local75 && local70 - 1 == local65) {
						return true;
					}
					if (local60 == local75 - 1 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local75 - 1 == local60 && local65 == local70) {
						return true;
					}
					if (local75 == local60 && local70 + 1 == local65) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 == local75 && local70 - 1 == local65 && (this.anIntArrayArray27[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local75 - 1 == local60 && local70 == local65 && (this.anIntArrayArray27[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 && local65 == local70 + 1) {
						return true;
					}
					if (local75 + 1 == local60 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 == local70 - 1 && (this.anIntArrayArray27[local60][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 == local75 - 1 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local60 && local70 + 1 == local65 && (this.anIntArrayArray27[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 == local70 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local60 == local75 - 1 && local65 == local70) {
						return true;
					}
					if (local60 == local75 && local70 + 1 == local65 && (this.anIntArrayArray27[local60][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 == local75 && local70 - 1 == local65) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local75 == local60 && local70 + 1 == local65 && (this.anIntArrayArray27[local60][local65] & 0x20) == 0) {
					return true;
				}
				if (local60 == local75 && local70 - 1 == local65 && (this.anIntArrayArray27[local60][local65] & 0x2) == 0) {
					return true;
				}
				if (local60 == local75 - 1 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x8) == 0) {
					return true;
				}
				if (local60 == local75 + 1 && local65 == local70 && (this.anIntArrayArray27[local60][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(782) int local782 = arg4 + local60 - 1;
			@Pc(788) int local788 = arg4 + local65 - 1;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local75 - arg4 == local60 && local65 <= local70 && local70 <= local788) {
						return true;
					}
					if (local75 >= local60 && local75 <= local782 && local65 == local70 + 1 && (this.anIntArrayArray27[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local782 && local65 == local70 - arg4 && (this.anIntArrayArray27[local75][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local75 >= local60 && local782 >= local75 && local70 + 1 == local65) {
						return true;
					}
					if (local60 == local75 - arg4 && local65 <= local70 && local788 >= local70 && (this.anIntArrayArray27[local782][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local70 >= local65 && local70 <= local788 && (this.anIntArrayArray27[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 == local75 + 1 && local70 >= local65 && local788 >= local70) {
						return true;
					}
					if (local75 >= local60 && local782 >= local75 && local65 == local70 + 1 && (this.anIntArrayArray27[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 <= local75 && local782 >= local75 && local70 - arg4 == local65 && (this.anIntArrayArray27[local75][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local75 >= local60 && local75 <= local782 && local65 == local70 - arg4) {
						return true;
					}
					if (local75 - arg4 == local60 && local65 <= local70 && local70 <= local788 && (this.anIntArrayArray27[local782][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local70 >= local65 && local788 >= local70 && (this.anIntArrayArray27[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local60 == local75 - arg4 && local70 >= local65 && local70 <= local788) {
						return true;
					}
					if (local75 >= local60 && local782 >= local75 && local65 == local70 + 1) {
						return true;
					}
					if (local75 + 1 == local60 && local70 >= local65 && local788 >= local70 && (this.anIntArrayArray27[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local782 && local65 == local70 - arg4 && (this.anIntArrayArray27[local75][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local60 == local75 - arg4 && local65 <= local70 && local788 >= local70 && (this.anIntArrayArray27[local782][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local60 && local782 >= local75 && local65 == local70 + 1) {
						return true;
					}
					if (local60 == local75 + 1 && local65 <= local70 && local788 >= local70) {
						return true;
					}
					if (local60 <= local75 && local782 >= local75 && local65 == local70 - arg4 && (this.anIntArrayArray27[local75][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 == local75 - arg4 && local65 <= local70 && local70 <= local788 && (this.anIntArrayArray27[local782][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 <= local75 && local782 >= local75 && local70 + 1 == local65 && (this.anIntArrayArray27[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 <= local70 && local788 >= local70) {
						return true;
					}
					if (local75 >= local60 && local75 <= local782 && local65 == local70 - arg4) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local60 == local75 - arg4 && local70 >= local65 && local70 <= local788) {
						return true;
					}
					if (local75 >= local60 && local782 >= local75 && local70 + 1 == local65 && (this.anIntArrayArray27[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 <= local70 && local788 >= local70 && (this.anIntArrayArray27[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local60 && local782 >= local75 && local65 == local70 - arg4) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local60 <= local75 && local782 >= local75 && local70 + 1 == local65 && (this.anIntArrayArray27[local75][local65] & 0x2C0120) == 0) {
					return true;
				}
				if (local60 <= local75 && local782 >= local75 && local65 == local70 - arg4 && (this.anIntArrayArray27[local75][local788] & 0x2C0102) == 0) {
					return true;
				}
				if (local75 - arg4 == local60 && local70 >= local65 && local70 <= local788 && (this.anIntArrayArray27[local782][local70] & 0x2C0108) == 0) {
					return true;
				}
				if (local75 + 1 == local60 && local65 <= local70 && local788 >= local70 && (this.anIntArrayArray27[local60][local70] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg7 + arg3;
		@Pc(13) int local13 = arg6 + arg0;
		@Pc(21) int local21 = arg4 + arg2;
		@Pc(25) int local25 = arg8 + arg5;
		@Pc(53) int local53;
		@Pc(64) int local64;
		if (local21 == arg7 && (arg1 & 0x2) == 0) {
			local53 = arg5 >= arg0 ? arg5 : arg0;
			local64 = local25 <= local13 ? local25 : local13;
			while (local53 < local64) {
				if ((this.anIntArrayArray27[local21 - this.anInt3691 - 1][local53 - this.anInt3692] & 0x8) == 0) {
					return true;
				}
				local53++;
			}
		} else if (arg2 == local9 && (arg1 & 0x8) == 0) {
			local53 = arg5 < arg0 ? arg0 : arg5;
			local64 = local25 > local13 ? local13 : local25;
			while (local53 < local64) {
				if ((this.anIntArrayArray27[arg2 - this.anInt3691][local53 - this.anInt3692] & 0x80) == 0) {
					return true;
				}
				local53++;
			}
		} else if (arg0 == local25 && (arg1 & 0x1) == 0) {
			local53 = arg2 >= arg7 ? arg2 : arg7;
			local64 = local21 > local9 ? local9 : local21;
			while (local64 > local53) {
				if ((this.anIntArrayArray27[local53 - this.anInt3691][local25 - this.anInt3692 - 1] & 0x2) == 0) {
					return true;
				}
				local53++;
			}
		} else if (arg5 == local13 && (arg1 & 0x4) == 0) {
			local53 = arg7 > arg2 ? arg7 : arg2;
			local64 = local21 > local9 ? local9 : local21;
			while (local53 < local64) {
				if ((this.anIntArrayArray27[local53 - this.anInt3691][arg5 - this.anInt3692] & 0x20) == 0) {
					return true;
				}
				local53++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBII)V")
	private void method3188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 > 1) {
			return Static74.method1318(arg5, arg3, arg7, arg2, arg6, arg3, arg4, arg1) ? true : this.method3187(arg6, arg0, arg2, arg3, arg1, arg4, arg3, arg5, arg7);
		}
		@Pc(40) int local40 = arg1 + arg2 - 1;
		@Pc(46) int local46 = arg4 + arg7 - 1;
		if (arg2 <= arg5 && arg5 <= local40 && arg6 >= arg4 && local46 >= arg6) {
			return true;
		} else if (arg2 - 1 == arg5 && arg6 >= arg4 && arg6 <= local46 && (this.anIntArrayArray27[arg5 - this.anInt3691][arg6 - this.anInt3692] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg5 == local40 + 1 && arg4 <= arg6 && local46 >= arg6 && (this.anIntArrayArray27[arg5 - this.anInt3691][arg6 - this.anInt3692] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg4 - 1 && arg2 <= arg5 && arg5 <= local40 && (this.anIntArrayArray27[arg5 - this.anInt3691][arg6 - this.anInt3692] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local46 + 1 == arg6 && arg2 <= arg5 && arg5 <= local40 && (this.anIntArrayArray27[arg5 - this.anInt3691][arg6 - this.anInt3692] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIZZII)V")
	public void method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt3691;
		@Pc(13) int local13 = arg0 - this.anInt3692;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method3191(local13, local4, 128);
				this.method3191(local13, local4 - 1, 8);
			}
			if (arg1 == 1) {
				this.method3191(local13, local4, 2);
				this.method3191(local13 + 1, local4, 32);
			}
			if (arg1 == 2) {
				this.method3191(local13, local4, 8);
				this.method3191(local13, local4 + 1, 128);
			}
			if (arg1 == 3) {
				this.method3191(local13, local4, 32);
				this.method3191(local13 - 1, local4, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method3191(local13, local4, 1);
				this.method3191(local13 + 1, local4 + -1, 16);
			}
			if (arg1 == 1) {
				this.method3191(local13, local4, 4);
				this.method3191(local13 + 1, local4 + 1, 64);
			}
			if (arg1 == 2) {
				this.method3191(local13, local4, 16);
				this.method3191(local13 - 1, local4 + 1, 1);
			}
			if (arg1 == 3) {
				this.method3191(local13, local4, 64);
				this.method3191(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method3191(local13, local4, 130);
				this.method3191(local13, local4 - 1, 8);
				this.method3191(local13 + 1, local4, 32);
			}
			if (arg1 == 1) {
				this.method3191(local13, local4, 10);
				this.method3191(local13 + 1, local4, 32);
				this.method3191(local13, local4 + 1, 128);
			}
			if (arg1 == 2) {
				this.method3191(local13, local4, 40);
				this.method3191(local13, local4 + 1, 128);
				this.method3191(local13 - 1, local4, 2);
			}
			if (arg1 == 3) {
				this.method3191(local13, local4, 160);
				this.method3191(local13 - 1, local4, 2);
				this.method3191(local13, local4 - 1, 8);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method3191(local13, local4, 65536);
					this.method3191(local13, local4 - 1, 4096);
				}
				if (arg1 == 1) {
					this.method3191(local13, local4, 1024);
					this.method3191(local13 + 1, local4, 16384);
				}
				if (arg1 == 2) {
					this.method3191(local13, local4, 4096);
					this.method3191(local13, local4 + 1, 65536);
				}
				if (arg1 == 3) {
					this.method3191(local13, local4, 16384);
					this.method3191(local13 - 1, local4, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method3191(local13, local4, 512);
					this.method3191(local13 + 1, local4 + -1, 8192);
				}
				if (arg1 == 1) {
					this.method3191(local13, local4, 2048);
					this.method3191(local13 + 1, local4 + 1, 32768);
				}
				if (arg1 == 2) {
					this.method3191(local13, local4, 8192);
					this.method3191(local13 - 1, local4 - -1, 512);
				}
				if (arg1 == 3) {
					this.method3191(local13, local4, 32768);
					this.method3191(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method3191(local13, local4, 66560);
					this.method3191(local13, local4 - 1, 4096);
					this.method3191(local13 + 1, local4, 16384);
				}
				if (arg1 == 1) {
					this.method3191(local13, local4, 5120);
					this.method3191(local13 + 1, local4, 16384);
					this.method3191(local13, local4 + 1, 65536);
				}
				if (arg1 == 2) {
					this.method3191(local13, local4, 20480);
					this.method3191(local13, local4 + 1, 65536);
					this.method3191(local13 - 1, local4, 1024);
				}
				if (arg1 == 3) {
					this.method3191(local13, local4, 81920);
					this.method3191(local13 - 1, local4, 1024);
					this.method3191(local13, local4 - 1, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method3191(local13, local4, 536870912);
				this.method3191(local13, local4 - 1, 33554432);
			}
			if (arg1 == 1) {
				this.method3191(local13, local4, 8388608);
				this.method3191(local13 + 1, local4, 134217728);
			}
			if (arg1 == 2) {
				this.method3191(local13, local4, 33554432);
				this.method3191(local13, local4 + 1, 536870912);
			}
			if (arg1 == 3) {
				this.method3191(local13, local4, 134217728);
				this.method3191(local13 - 1, local4, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method3191(local13, local4, 4194304);
				this.method3191(local13 + 1, local4 + -1, 67108864);
			}
			if (arg1 == 1) {
				this.method3191(local13, local4, 16777216);
				this.method3191(local13 + 1, local4 + 1, 268435456);
			}
			if (arg1 == 2) {
				this.method3191(local13, local4, 67108864);
				this.method3191(local13 - 1, local4 - -1, 4194304);
			}
			if (arg1 == 3) {
				this.method3191(local13, local4, 268435456);
				this.method3191(local13 - 1, local4 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method3191(local13, local4, 545259520);
			this.method3191(local13, local4 - 1, 33554432);
			this.method3191(local13 + 1, local4, 134217728);
		}
		if (arg1 == 1) {
			this.method3191(local13, local4, 41943040);
			this.method3191(local13 + 1, local4, 134217728);
			this.method3191(local13, local4 + 1, 536870912);
		}
		if (arg1 == 2) {
			this.method3191(local13, local4, 167772160);
			this.method3191(local13, local4 + 1, 536870912);
			this.method3191(local13 - 1, local4, 8388608);
		}
		if (arg1 == 3) {
			this.method3191(local13, local4, 671088640);
			this.method3191(local13 - 1, local4, 8388608);
			this.method3191(local13, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
	private void method3191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray27[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIZI)Z")
	public boolean method3192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg5 && arg1 == arg3) {
				return true;
			}
		} else if (arg6 >= arg5 && arg2 + arg5 - 1 >= arg6 && arg3 >= arg3 && arg3 <= arg2 + arg3 - 1) {
			return true;
		}
		@Pc(68) int local68 = arg6 - this.anInt3691;
		@Pc(73) int local73 = arg1 - this.anInt3692;
		@Pc(78) int local78 = arg5 - this.anInt3691;
		@Pc(83) int local83 = arg3 - this.anInt3692;
		if (arg2 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local78 == local68 + 1 && local83 == local73 && (this.anIntArrayArray27[local78][local73] & 0x80) == 0) {
						return true;
					}
					if (local78 == local68 && local83 - 1 == local73 && (this.anIntArrayArray27[local78][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 - 1 == local78 && local83 == local73 && (this.anIntArrayArray27[local78][local73] & 0x8) == 0) {
						return true;
					}
					if (local78 == local68 && local73 == local83 - 1 && (this.anIntArrayArray27[local78][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local78 == local68 - 1 && local73 == local83 && (this.anIntArrayArray27[local78][local73] & 0x8) == 0) {
						return true;
					}
					if (local78 == local68 && local83 + 1 == local73 && (this.anIntArrayArray27[local78][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local78 == local68 + 1 && local83 == local73 && (this.anIntArrayArray27[local78][local73] & 0x80) == 0) {
						return true;
					}
					if (local68 == local78 && local73 == local83 + 1 && (this.anIntArrayArray27[local78][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local68 == local78 && local73 == local83 + 1 && (this.anIntArrayArray27[local78][local73] & 0x20) == 0) {
					return true;
				}
				if (local68 == local78 && local83 - 1 == local73 && (this.anIntArrayArray27[local78][local73] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local78 && local83 == local73 && (this.anIntArrayArray27[local78][local73] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local78 && local73 == local83 && (this.anIntArrayArray27[local78][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(423) int local423 = local78 + arg2 - 1;
			@Pc(429) int local429 = arg2 + local73 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local78 == local68 + 1 && local83 >= local73 && local83 <= local429 && (this.anIntArrayArray27[local78][local83] & 0x80) == 0) {
						return true;
					}
					if (local78 <= local68 && local68 <= local423 && local73 == local83 - arg2 && (this.anIntArrayArray27[local68][local429] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 - arg2 == local78 && local73 <= local83 && local83 <= local429 && (this.anIntArrayArray27[local423][local83] & 0x8) == 0) {
						return true;
					}
					if (local78 <= local68 && local68 <= local423 && local83 - arg2 == local73 && (this.anIntArrayArray27[local68][local429] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local78 == local68 - arg2 && local83 >= local73 && local429 >= local83 && (this.anIntArrayArray27[local423][local83] & 0x8) == 0) {
						return true;
					}
					if (local78 <= local68 && local423 >= local68 && local83 + 1 == local73 && (this.anIntArrayArray27[local68][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local78 == local68 + 1 && local73 <= local83 && local83 <= local429 && (this.anIntArrayArray27[local78][local83] & 0x80) == 0) {
						return true;
					}
					if (local68 >= local78 && local423 >= local68 && local83 + 1 == local73 && (this.anIntArrayArray27[local68][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local68 >= local78 && local423 >= local68 && local83 + 1 == local73 && (this.anIntArrayArray27[local68][local73] & 0x20) == 0) {
					return true;
				}
				if (local68 >= local78 && local423 >= local68 && local83 - arg2 == local73 && (this.anIntArrayArray27[local68][local429] & 0x2) == 0) {
					return true;
				}
				if (local68 - arg2 == local78 && local83 >= local73 && local83 <= local429 && (this.anIntArrayArray27[local423][local83] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local78 && local73 <= local83 && local83 <= local429 && (this.anIntArrayArray27[local78][local83] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIIIIZI)V")
	public void method3193(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(24) int local24 = arg3 - this.anInt3691;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(35) int local35 = arg5 - this.anInt3692;
		for (@Pc(37) int local37 = local24; local37 < arg1 + local24; local37++) {
			if (local37 >= 0 && local37 < this.anInt3693) {
				for (@Pc(54) int local54 = local35; local54 < local35 + arg2; local54++) {
					if (local54 >= 0 && this.anInt3705 > local54) {
						this.method3188(local54, local37, local7);
					}
				}
			}
		}
	}
}

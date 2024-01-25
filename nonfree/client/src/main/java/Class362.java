import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class362 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	public int anInt9504;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	public int anInt9516;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public int anInt9517;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	public int anInt9521;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)V")
	private void method7589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray64[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)V")
	public void method7591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt9521;
		@Pc(21) int local21 = arg1 - this.anInt9517;
		this.anIntArrayArray64[local21][local16] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public void method7592() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt9504; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt9516; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt9504 - 5 <= local11 || local15 >= this.anInt9516 - 5) {
					this.anIntArrayArray64[local11][local15] = -1;
				} else {
					this.anIntArrayArray64[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	public void method7593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 - this.anInt9521;
		@Pc(22) int local22 = arg1 - this.anInt9517;
		this.anIntArrayArray64[local22][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg6 && arg5 == arg3) {
				return true;
			}
		} else if (arg6 <= arg2 && arg2 <= arg0 + arg6 - 1 && arg5 >= arg5 && arg0 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(55) int local55 = arg2 - this.anInt9517;
		@Pc(68) int local68 = arg5 - this.anInt9521;
		@Pc(73) int local73 = arg6 - this.anInt9517;
		@Pc(78) int local78 = arg3 - this.anInt9521;
		if (arg0 == 1) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					if (local73 == local55 - 1 && local68 == local78) {
						return true;
					}
					if (local55 == local73 && local78 == local68 + 1 && (this.anIntArrayArray64[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 == local73 && local68 - 1 == local78 && (this.anIntArrayArray64[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 == local55 && local78 == local68 + 1) {
						return true;
					}
					if (local55 - 1 == local73 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local55 + 1 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local55 + 1 == local73 && local78 == local68) {
						return true;
					}
					if (local73 == local55 && local78 == local68 + 1 && (this.anIntArrayArray64[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local55 && local78 == local68 - 1 && (this.anIntArrayArray64[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 == local55 && local78 == local68 - 1) {
						return true;
					}
					if (local55 - 1 == local73 && local68 == local78 && (this.anIntArrayArray64[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 + 1 == local73 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					if (local73 == local55 - 1 && local78 == local68) {
						return true;
					}
					if (local55 == local73 && local68 + 1 == local78) {
						return true;
					}
					if (local55 + 1 == local73 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
					if (local55 == local73 && local68 - 1 == local78 && (this.anIntArrayArray64[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local55 - 1 == local73 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 == local73 && local78 == local68 + 1) {
						return true;
					}
					if (local73 == local55 + 1 && local78 == local68) {
						return true;
					}
					if (local73 == local55 && local68 - 1 == local78 && (this.anIntArrayArray64[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 == local55 - 1 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 == local73 && local78 == local68 + 1 && (this.anIntArrayArray64[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 + 1 == local73 && local68 == local78) {
						return true;
					}
					if (local55 == local73 && local68 - 1 == local78) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 == local55 - 1 && local68 == local78) {
						return true;
					}
					if (local55 == local73 && local68 + 1 == local78 && (this.anIntArrayArray64[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local55 + 1 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 == local55 && local78 == local68 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local55 == local73 && local68 + 1 == local78 && (this.anIntArrayArray64[local73][local78] & 0x20) == 0) {
					return true;
				}
				if (local55 == local73 && local78 == local68 - 1 && (this.anIntArrayArray64[local73][local78] & 0x2) == 0) {
					return true;
				}
				if (local55 - 1 == local73 && local68 == local78 && (this.anIntArrayArray64[local73][local78] & 0x8) == 0) {
					return true;
				}
				if (local73 == local55 + 1 && local78 == local68 && (this.anIntArrayArray64[local73][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(784) int local784 = local73 + arg0 - 1;
			@Pc(790) int local790 = local78 + arg0 - 1;
			if (arg4 == 0) {
				if (arg1 == 0) {
					if (local73 == local55 - arg0 && local78 <= local68 && local68 <= local790) {
						return true;
					}
					if (local73 <= local55 && local784 >= local55 && local78 == local68 + 1 && (this.anIntArrayArray64[local55][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 >= local73 && local784 >= local55 && local68 - arg0 == local78 && (this.anIntArrayArray64[local55][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 <= local55 && local55 <= local784 && local68 + 1 == local78) {
						return true;
					}
					if (local73 == local55 - arg0 && local78 <= local68 && local68 <= local790 && (this.anIntArrayArray64[local784][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local55 + 1 && local68 >= local78 && local68 <= local790 && (this.anIntArrayArray64[local73][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 == local55 + 1 && local68 >= local78 && local790 >= local68) {
						return true;
					}
					if (local55 >= local73 && local55 <= local784 && local68 + 1 == local78 && (this.anIntArrayArray64[local55][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 >= local73 && local784 >= local55 && local68 - arg0 == local78 && (this.anIntArrayArray64[local55][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local55 >= local73 && local784 >= local55 && local78 == local68 - arg0) {
						return true;
					}
					if (local55 - arg0 == local73 && local68 >= local78 && local790 >= local68 && (this.anIntArrayArray64[local784][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local55 + 1 && local68 >= local78 && local68 <= local790 && (this.anIntArrayArray64[local73][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					if (local55 - arg0 == local73 && local68 >= local78 && local790 >= local68) {
						return true;
					}
					if (local73 <= local55 && local784 >= local55 && local78 == local68 + 1) {
						return true;
					}
					if (local55 + 1 == local73 && local78 <= local68 && local68 <= local790 && (this.anIntArrayArray64[local73][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 <= local55 && local55 <= local784 && local68 - arg0 == local78 && (this.anIntArrayArray64[local55][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 == local55 - arg0 && local68 >= local78 && local790 >= local68 && (this.anIntArrayArray64[local784][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 >= local73 && local55 <= local784 && local78 == local68 + 1) {
						return true;
					}
					if (local73 == local55 + 1 && local78 <= local68 && local790 >= local68) {
						return true;
					}
					if (local73 <= local55 && local784 >= local55 && local78 == local68 - arg0 && (this.anIntArrayArray64[local55][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 == local55 - arg0 && local78 <= local68 && local790 >= local68 && (this.anIntArrayArray64[local784][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 <= local55 && local55 <= local784 && local78 == local68 + 1 && (this.anIntArrayArray64[local55][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local55 + 1 && local78 <= local68 && local790 >= local68) {
						return true;
					}
					if (local73 <= local55 && local784 >= local55 && local78 == local68 - arg0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local55 - arg0 == local73 && local68 >= local78 && local790 >= local68) {
						return true;
					}
					if (local55 >= local73 && local784 >= local55 && local68 + 1 == local78 && (this.anIntArrayArray64[local55][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 + 1 == local73 && local68 >= local78 && local790 >= local68 && (this.anIntArrayArray64[local73][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local55 >= local73 && local55 <= local784 && local78 == local68 - arg0) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local73 <= local55 && local55 <= local784 && local78 == local68 + 1 && (this.anIntArrayArray64[local55][local78] & 0x2C0120) == 0) {
					return true;
				}
				if (local55 >= local73 && local55 <= local784 && local68 - arg0 == local78 && (this.anIntArrayArray64[local55][local790] & 0x2C0102) == 0) {
					return true;
				}
				if (local73 == local55 - arg0 && local78 <= local68 && local790 >= local68 && (this.anIntArrayArray64[local784][local68] & 0x2C0108) == 0) {
					return true;
				}
				if (local73 == local55 + 1 && local78 <= local68 && local790 >= local68 && (this.anIntArrayArray64[local73][local68] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZBIIIII)V")
	public void method7595(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt9517;
		@Pc(23) int local23 = arg4 - this.anInt9521;
		@Pc(33) int local33;
		if (arg3 == 1 || arg3 == 3) {
			local33 = arg6;
			arg6 = arg5;
			arg5 = local33;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		for (local33 = local18; local33 < local18 + arg6; local33++) {
			if (local33 >= 0 && this.anInt9504 > local33) {
				for (@Pc(67) int local67 = local23; local67 < local23 + arg5; local67++) {
					if (local67 >= 0 && local67 < this.anInt9516) {
						this.method7589(local33, local67, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIZBI)V")
	public void method7596(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt9517;
		@Pc(13) int local13 = arg5 - this.anInt9521;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method7589(local8, local13, 128);
				this.method7589(local8 - 1, local13, 8);
			}
			if (arg0 == 1) {
				this.method7589(local8, local13, 2);
				this.method7589(local8, local13 + 1, 32);
			}
			if (arg0 == 2) {
				this.method7589(local8, local13, 8);
				this.method7589(local8 + 1, local13, 128);
			}
			if (arg0 == 3) {
				this.method7589(local8, local13, 32);
				this.method7589(local8, local13 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method7589(local8, local13, 1);
				this.method7589(local8 - 1, local13 + 1, 16);
			}
			if (arg0 == 1) {
				this.method7589(local8, local13, 4);
				this.method7589(local8 + 1, local13 + 1, 64);
			}
			if (arg0 == 2) {
				this.method7589(local8, local13, 16);
				this.method7589(local8 + 1, local13 + -1, 1);
			}
			if (arg0 == 3) {
				this.method7589(local8, local13, 64);
				this.method7589(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method7589(local8, local13, 130);
				this.method7589(local8 - 1, local13, 8);
				this.method7589(local8, local13 + 1, 32);
			}
			if (arg0 == 1) {
				this.method7589(local8, local13, 10);
				this.method7589(local8, local13 + 1, 32);
				this.method7589(local8 + 1, local13, 128);
			}
			if (arg0 == 2) {
				this.method7589(local8, local13, 40);
				this.method7589(local8 + 1, local13, 128);
				this.method7589(local8, local13 - 1, 2);
			}
			if (arg0 == 3) {
				this.method7589(local8, local13, 160);
				this.method7589(local8, local13 - 1, 2);
				this.method7589(local8 - 1, local13, 8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method7589(local8, local13, 65536);
					this.method7589(local8 - 1, local13, 4096);
				}
				if (arg0 == 1) {
					this.method7589(local8, local13, 1024);
					this.method7589(local8, local13 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method7589(local8, local13, 4096);
					this.method7589(local8 + 1, local13, 65536);
				}
				if (arg0 == 3) {
					this.method7589(local8, local13, 16384);
					this.method7589(local8, local13 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method7589(local8, local13, 512);
					this.method7589(local8 - 1, local13 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method7589(local8, local13, 2048);
					this.method7589(local8 + 1, local13 - -1, 32768);
				}
				if (arg0 == 2) {
					this.method7589(local8, local13, 8192);
					this.method7589(local8 + 1, local13 + -1, 512);
				}
				if (arg0 == 3) {
					this.method7589(local8, local13, 32768);
					this.method7589(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method7589(local8, local13, 66560);
					this.method7589(local8 - 1, local13, 4096);
					this.method7589(local8, local13 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method7589(local8, local13, 5120);
					this.method7589(local8, local13 + 1, 16384);
					this.method7589(local8 + 1, local13, 65536);
				}
				if (arg0 == 2) {
					this.method7589(local8, local13, 20480);
					this.method7589(local8 + 1, local13, 65536);
					this.method7589(local8, local13 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method7589(local8, local13, 81920);
					this.method7589(local8, local13 - 1, 1024);
					this.method7589(local8 - 1, local13, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method7589(local8, local13, 536870912);
				this.method7589(local8 - 1, local13, 33554432);
			}
			if (arg0 == 1) {
				this.method7589(local8, local13, 8388608);
				this.method7589(local8, local13 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method7589(local8, local13, 33554432);
				this.method7589(local8 + 1, local13, 536870912);
			}
			if (arg0 == 3) {
				this.method7589(local8, local13, 134217728);
				this.method7589(local8, local13 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method7589(local8, local13, 4194304);
				this.method7589(local8 - 1, local13 - -1, 67108864);
			}
			if (arg0 == 1) {
				this.method7589(local8, local13, 16777216);
				this.method7589(local8 + 1, local13 - -1, 268435456);
			}
			if (arg0 == 2) {
				this.method7589(local8, local13, 67108864);
				this.method7589(local8 + 1, local13 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method7589(local8, local13, 268435456);
				this.method7589(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method7589(local8, local13, 545259520);
			this.method7589(local8 - 1, local13, 33554432);
			this.method7589(local8, local13 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method7589(local8, local13, 41943040);
			this.method7589(local8, local13 + 1, 134217728);
			this.method7589(local8 + 1, local13, 536870912);
		}
		if (arg0 == 2) {
			this.method7589(local8, local13, 167772160);
			this.method7589(local8 + 1, local13, 536870912);
			this.method7589(local8, local13 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method7589(local8, local13, 671088640);
			this.method7589(local8, local13 - 1, 8388608);
			this.method7589(local8 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZZII)V")
	public void method7597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg5 - this.anInt9521;
		@Pc(13) int local13 = arg0 - this.anInt9517;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method7602(128, local13, local8);
				this.method7602(8, local13 - 1, local8);
			}
			if (arg4 == 1) {
				this.method7602(2, local13, local8);
				this.method7602(32, local13, local8 + 1);
			}
			if (arg4 == 2) {
				this.method7602(8, local13, local8);
				this.method7602(128, local13 + 1, local8);
			}
			if (arg4 == 3) {
				this.method7602(32, local13, local8);
				this.method7602(2, local13, local8 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method7602(1, local13, local8);
				this.method7602(16, local13 - 1, local8 + 1);
			}
			if (arg4 == 1) {
				this.method7602(4, local13, local8);
				this.method7602(64, local13 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method7602(16, local13, local8);
				this.method7602(1, local13 + 1, local8 + -1);
			}
			if (arg4 == 3) {
				this.method7602(64, local13, local8);
				this.method7602(4, local13 - 1, local8 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method7602(130, local13, local8);
				this.method7602(8, local13 - 1, local8);
				this.method7602(32, local13, local8 + 1);
			}
			if (arg4 == 1) {
				this.method7602(10, local13, local8);
				this.method7602(32, local13, local8 + 1);
				this.method7602(128, local13 + 1, local8);
			}
			if (arg4 == 2) {
				this.method7602(40, local13, local8);
				this.method7602(128, local13 + 1, local8);
				this.method7602(2, local13, local8 - 1);
			}
			if (arg4 == 3) {
				this.method7602(160, local13, local8);
				this.method7602(2, local13, local8 - 1);
				this.method7602(8, local13 - 1, local8);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method7602(65536, local13, local8);
					this.method7602(4096, local13 - 1, local8);
				}
				if (arg4 == 1) {
					this.method7602(1024, local13, local8);
					this.method7602(16384, local13, local8 + 1);
				}
				if (arg4 == 2) {
					this.method7602(4096, local13, local8);
					this.method7602(65536, local13 + 1, local8);
				}
				if (arg4 == 3) {
					this.method7602(16384, local13, local8);
					this.method7602(1024, local13, local8 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method7602(512, local13, local8);
					this.method7602(8192, local13 - 1, local8 + 1);
				}
				if (arg4 == 1) {
					this.method7602(2048, local13, local8);
					this.method7602(32768, local13 + 1, local8 + 1);
				}
				if (arg4 == 2) {
					this.method7602(8192, local13, local8);
					this.method7602(512, local13 + 1, local8 + -1);
				}
				if (arg4 == 3) {
					this.method7602(32768, local13, local8);
					this.method7602(2048, local13 - 1, local8 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method7602(66560, local13, local8);
					this.method7602(4096, local13 - 1, local8);
					this.method7602(16384, local13, local8 + 1);
				}
				if (arg4 == 1) {
					this.method7602(5120, local13, local8);
					this.method7602(16384, local13, local8 + 1);
					this.method7602(65536, local13 + 1, local8);
				}
				if (arg4 == 2) {
					this.method7602(20480, local13, local8);
					this.method7602(65536, local13 + 1, local8);
					this.method7602(1024, local13, local8 - 1);
				}
				if (arg4 == 3) {
					this.method7602(81920, local13, local8);
					this.method7602(1024, local13, local8 - 1);
					this.method7602(4096, local13 - 1, local8);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method7602(536870912, local13, local8);
				this.method7602(33554432, local13 - 1, local8);
			}
			if (arg4 == 1) {
				this.method7602(8388608, local13, local8);
				this.method7602(134217728, local13, local8 + 1);
			}
			if (arg4 == 2) {
				this.method7602(33554432, local13, local8);
				this.method7602(536870912, local13 + 1, local8);
			}
			if (arg4 == 3) {
				this.method7602(134217728, local13, local8);
				this.method7602(8388608, local13, local8 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method7602(4194304, local13, local8);
				this.method7602(67108864, local13 - 1, local8 + 1);
			}
			if (arg4 == 1) {
				this.method7602(16777216, local13, local8);
				this.method7602(268435456, local13 + 1, local8 - -1);
			}
			if (arg4 == 2) {
				this.method7602(67108864, local13, local8);
				this.method7602(4194304, local13 + 1, local8 - 1);
			}
			if (arg4 == 3) {
				this.method7602(268435456, local13, local8);
				this.method7602(16777216, local13 - 1, local8 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method7602(545259520, local13, local8);
			this.method7602(33554432, local13 - 1, local8);
			this.method7602(134217728, local13, local8 + 1);
		}
		if (arg4 == 1) {
			this.method7602(41943040, local13, local8);
			this.method7602(134217728, local13, local8 + 1);
			this.method7602(536870912, local13 + 1, local8);
		}
		if (arg4 == 2) {
			this.method7602(167772160, local13, local8);
			this.method7602(536870912, local13 + 1, local8);
			this.method7602(8388608, local13, local8 - 1);
		}
		if (arg4 == 3) {
			this.method7602(671088640, local13, local8);
			this.method7602(8388608, local13, local8 - 1);
			this.method7602(33554432, local13 - 1, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method7598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg4 == arg1 && arg0 == arg3) {
				return true;
			}
		} else if (arg4 >= arg1 && arg6 + arg1 - 1 >= arg4 && arg3 <= arg3 && arg3 + arg6 - 1 >= arg3) {
			return true;
		}
		@Pc(58) int local58 = arg3 - this.anInt9521;
		@Pc(63) int local63 = arg0 - this.anInt9521;
		@Pc(68) int local68 = arg1 - this.anInt9517;
		@Pc(73) int local73 = arg4 - this.anInt9517;
		if (arg6 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local73 + 1 == local68 && local58 == local63 && (this.anIntArrayArray64[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local73 == local68 && local58 - 1 == local63 && (this.anIntArrayArray64[local68][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local68 == local73 - 1 && local58 == local63 && (this.anIntArrayArray64[local68][local63] & 0x8) == 0) {
						return true;
					}
					if (local68 == local73 && local58 - 1 == local63 && (this.anIntArrayArray64[local68][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local68 == local73 - 1 && local63 == local58 && (this.anIntArrayArray64[local68][local63] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local58 + 1 == local63 && (this.anIntArrayArray64[local68][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local73 + 1 == local68 && local58 == local63 && (this.anIntArrayArray64[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local68 == local73 && local63 == local58 + 1 && (this.anIntArrayArray64[local68][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local73 == local68 && local63 == local58 + 1 && (this.anIntArrayArray64[local68][local63] & 0x20) == 0) {
					return true;
				}
				if (local73 == local68 && local63 == local58 - 1 && (this.anIntArrayArray64[local68][local63] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local68 && local58 == local63 && (this.anIntArrayArray64[local68][local63] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local68 && local63 == local58 && (this.anIntArrayArray64[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(407) int local407 = arg6 + local68 - 1;
			@Pc(413) int local413 = arg6 + local63 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local68 == local73 + 1 && local63 <= local58 && local58 <= local413 && (this.anIntArrayArray64[local68][local58] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local407 && local58 - arg6 == local63 && (this.anIntArrayArray64[local73][local413] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local68 == local73 - arg6 && local63 <= local58 && local58 <= local413 && (this.anIntArrayArray64[local407][local58] & 0x8) == 0) {
						return true;
					}
					if (local73 >= local68 && local407 >= local73 && local63 == local58 - arg6 && (this.anIntArrayArray64[local73][local413] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local68 == local73 - arg6 && local58 >= local63 && local58 <= local413 && (this.anIntArrayArray64[local407][local58] & 0x8) == 0) {
						return true;
					}
					if (local73 >= local68 && local407 >= local73 && local63 == local58 + 1 && (this.anIntArrayArray64[local73][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local68 == local73 + 1 && local58 >= local63 && local413 >= local58 && (this.anIntArrayArray64[local68][local58] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local407 && local58 + 1 == local63 && (this.anIntArrayArray64[local73][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local73 >= local68 && local73 <= local407 && local58 + 1 == local63 && (this.anIntArrayArray64[local73][local63] & 0x20) == 0) {
					return true;
				}
				if (local73 >= local68 && local407 >= local73 && local58 - arg6 == local63 && (this.anIntArrayArray64[local73][local413] & 0x2) == 0) {
					return true;
				}
				if (local68 == local73 - arg6 && local63 <= local58 && local58 <= local413 && (this.anIntArrayArray64[local407][local58] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local68 && local58 >= local63 && local58 <= local413 && (this.anIntArrayArray64[local68][local58] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIBI)Z")
	public boolean method7599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg1 + arg7;
		@Pc(15) int local15 = arg3 + arg0;
		@Pc(25) int local25 = arg4 + arg2;
		@Pc(30) int local30 = arg6 + arg5;
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (local25 == arg1 && (arg8 & 0x2) == 0) {
			local48 = arg3 <= arg6 ? arg6 : arg3;
			local55 = local15 < local30 ? local15 : local30;
			while (local55 > local48) {
				if ((this.anIntArrayArray64[local25 - this.anInt9517 - 1][local48 - this.anInt9521] & 0x8) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg2 == local10 && (arg8 & 0x8) == 0) {
			local48 = arg6 >= arg3 ? arg6 : arg3;
			local55 = local30 <= local15 ? local30 : local15;
			while (local48 < local55) {
				if ((this.anIntArrayArray64[arg2 - this.anInt9517][local48 - this.anInt9521] & 0x80) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg3 == local30 && (arg8 & 0x1) == 0) {
			local48 = arg2 >= arg1 ? arg2 : arg1;
			local55 = local25 <= local10 ? local25 : local10;
			while (local55 > local48) {
				if ((this.anIntArrayArray64[local48 - this.anInt9517][local30 - this.anInt9521 - 1] & 0x2) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local15 == arg6 && (arg8 & 0x4) == 0) {
			local48 = arg2 >= arg1 ? arg2 : arg1;
			local55 = local10 >= local25 ? local25 : local10;
			while (local55 > local48) {
				if ((this.anIntArrayArray64[local48 - this.anInt9517][arg6 - this.anInt9521] & 0x20) == 0) {
					return true;
				}
				local48++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBIIII)Z")
	public boolean method7600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static570.method7437(arg1, arg5, arg5, arg4, arg6, arg2, arg7, arg3) ? true : this.method7599(arg5, arg1, arg2, arg7, arg3, arg6, arg4, arg5, arg0);
		}
		@Pc(38) int local38 = arg2 + arg3 - 1;
		@Pc(44) int local44 = arg6 + arg4 - 1;
		if (arg2 <= arg1 && arg1 <= local38 && arg4 <= arg7 && arg7 <= local44) {
			return true;
		} else if (arg1 == arg2 - 1 && arg7 >= arg4 && arg7 <= local44 && (this.anIntArrayArray64[arg1 - this.anInt9517][arg7 - this.anInt9521] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg1 == local38 + 1 && arg7 >= arg4 && arg7 <= local44 && (this.anIntArrayArray64[arg1 - this.anInt9517][arg7 - this.anInt9521] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg7 && arg1 >= arg2 && arg1 <= local38 && (this.anIntArrayArray64[arg1 - this.anInt9517][arg7 - this.anInt9521] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg7 && arg1 >= arg2 && local38 >= arg1 && (this.anIntArrayArray64[arg1 - this.anInt9517][arg7 - this.anInt9521] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
	public void method7601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9521;
		@Pc(13) int local13 = arg0 - this.anInt9517;
		this.anIntArrayArray64[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)V")
	private void method7602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray64[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)V")
	public void method7603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9517;
		@Pc(9) int local9 = arg0 - this.anInt9521;
		this.anIntArrayArray64[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method7604(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt9521;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg3 - this.anInt9517;
		for (@Pc(31) int local31 = local29; local31 < arg2 + local29; local31++) {
			if (local31 >= 0 && local31 < this.anInt9504) {
				for (@Pc(45) int local45 = local18; local45 < arg4 + local18; local45++) {
					if (local45 >= 0 && local45 < this.anInt9516) {
						this.method7602(local7, local31, local45);
					}
				}
			}
		}
	}
}

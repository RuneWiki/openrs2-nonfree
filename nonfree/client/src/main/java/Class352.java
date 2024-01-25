import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class352 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "I")
	public int anInt9703;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "I")
	public int anInt9705;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	public int anInt9709;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	public int anInt9711;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)V")
	private void method8333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray67[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIZI)Z")
	public boolean method8334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg0 && arg1 == arg4) {
				return true;
			}
		} else if (arg6 >= arg0 && arg6 <= arg2 + arg0 - 1 && arg1 <= arg1 && arg1 <= arg1 + arg2 - 1) {
			return true;
		}
		@Pc(56) int local56 = arg4 - this.anInt9709;
		@Pc(61) int local61 = arg6 - this.anInt9711;
		@Pc(66) int local66 = arg1 - this.anInt9709;
		@Pc(79) int local79 = arg0 - this.anInt9711;
		if (arg2 == 1) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					if (local79 == local61 - 1 && local56 == local66) {
						return true;
					}
					if (local61 == local79 && local66 + 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local79 && local66 - 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 == local79 && local56 == local66 + 1) {
						return true;
					}
					if (local61 - 1 == local79 && local56 == local66 && (this.anIntArrayArray67[local79][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 == local61 + 1 && local66 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 + 1 == local79 && local66 == local56) {
						return true;
					}
					if (local79 == local61 && local66 + 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local61 && local66 - 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 == local79 && local56 == local66 - 1) {
						return true;
					}
					if (local61 - 1 == local79 && local56 == local66 && (this.anIntArrayArray67[local79][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 == local61 + 1 && local56 == local66 && (this.anIntArrayArray67[local79][local56] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					if (local61 - 1 == local79 && local66 == local56) {
						return true;
					}
					if (local79 == local61 && local66 + 1 == local56) {
						return true;
					}
					if (local61 + 1 == local79 && local66 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local79 && local56 == local66 - 1 && (this.anIntArrayArray67[local79][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local79 == local61 - 1 && local56 == local66 && (this.anIntArrayArray67[local79][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local79 && local66 + 1 == local56) {
						return true;
					}
					if (local79 == local61 + 1 && local66 == local56) {
						return true;
					}
					if (local79 == local61 && local66 - 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local79 == local61 - 1 && local66 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 == local61 && local56 == local66 + 1 && (this.anIntArrayArray67[local79][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local61 + 1 && local66 == local56) {
						return true;
					}
					if (local79 == local61 && local56 == local66 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 - 1 == local79 && local56 == local66) {
						return true;
					}
					if (local79 == local61 && local66 + 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local79 && local66 == local56 && (this.anIntArrayArray67[local79][local56] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local79 && local66 - 1 == local56) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local61 == local79 && local66 + 1 == local56 && (this.anIntArrayArray67[local79][local56] & 0x20) == 0) {
					return true;
				}
				if (local79 == local61 && local56 == local66 - 1 && (this.anIntArrayArray67[local79][local56] & 0x2) == 0) {
					return true;
				}
				if (local61 - 1 == local79 && local56 == local66 && (this.anIntArrayArray67[local79][local56] & 0x8) == 0) {
					return true;
				}
				if (local79 == local61 + 1 && local66 == local56 && (this.anIntArrayArray67[local79][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(792) int local792 = arg2 + local79 - 1;
			@Pc(798) int local798 = arg2 + local56 - 1;
			if (arg3 == 0) {
				if (arg5 == 0) {
					if (local61 - arg2 == local79 && local56 <= local66 && local798 >= local66) {
						return true;
					}
					if (local79 <= local61 && local61 <= local792 && local56 == local66 + 1 && (this.anIntArrayArray67[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 <= local61 && local792 >= local61 && local56 == local66 - arg2 && (this.anIntArrayArray67[local61][local798] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local79 <= local61 && local61 <= local792 && local66 + 1 == local56) {
						return true;
					}
					if (local61 - arg2 == local79 && local56 <= local66 && local798 >= local66 && (this.anIntArrayArray67[local792][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 == local61 + 1 && local66 >= local56 && local798 >= local66 && (this.anIntArrayArray67[local79][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local79 == local61 + 1 && local66 >= local56 && local66 <= local798) {
						return true;
					}
					if (local61 >= local79 && local61 <= local792 && local66 + 1 == local56 && (this.anIntArrayArray67[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local79 && local61 <= local792 && local56 == local66 - arg2 && (this.anIntArrayArray67[local61][local798] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local79 <= local61 && local792 >= local61 && local56 == local66 - arg2) {
						return true;
					}
					if (local79 == local61 - arg2 && local56 <= local66 && local798 >= local66 && (this.anIntArrayArray67[local792][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 == local61 + 1 && local66 >= local56 && local66 <= local798 && (this.anIntArrayArray67[local79][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					if (local61 - arg2 == local79 && local56 <= local66 && local66 <= local798) {
						return true;
					}
					if (local79 <= local61 && local792 >= local61 && local56 == local66 + 1) {
						return true;
					}
					if (local79 == local61 + 1 && local66 >= local56 && local798 >= local66 && (this.anIntArrayArray67[local79][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 >= local79 && local792 >= local61 && local56 == local66 - arg2 && (this.anIntArrayArray67[local61][local798] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 - arg2 == local79 && local66 >= local56 && local66 <= local798 && (this.anIntArrayArray67[local792][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 <= local61 && local792 >= local61 && local66 + 1 == local56) {
						return true;
					}
					if (local61 + 1 == local79 && local56 <= local66 && local66 <= local798) {
						return true;
					}
					if (local79 <= local61 && local61 <= local792 && local66 - arg2 == local56 && (this.anIntArrayArray67[local61][local798] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 - arg2 == local79 && local56 <= local66 && local798 >= local66 && (this.anIntArrayArray67[local792][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local79 && local61 <= local792 && local56 == local66 + 1 && (this.anIntArrayArray67[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local79 && local66 >= local56 && local66 <= local798) {
						return true;
					}
					if (local61 >= local79 && local61 <= local792 && local56 == local66 - arg2) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 - arg2 == local79 && local66 >= local56 && local66 <= local798) {
						return true;
					}
					if (local79 <= local61 && local61 <= local792 && local66 + 1 == local56 && (this.anIntArrayArray67[local61][local56] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local61 + 1 && local56 <= local66 && local66 <= local798 && (this.anIntArrayArray67[local79][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local79 <= local61 && local792 >= local61 && local66 - arg2 == local56) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local79 <= local61 && local61 <= local792 && local56 == local66 + 1 && (this.anIntArrayArray67[local61][local56] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 >= local79 && local61 <= local792 && local66 - arg2 == local56 && (this.anIntArrayArray67[local61][local798] & 0x2C0102) == 0) {
					return true;
				}
				if (local79 == local61 - arg2 && local56 <= local66 && local798 >= local66 && (this.anIntArrayArray67[local792][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local79 == local61 + 1 && local56 <= local66 && local66 <= local798 && (this.anIntArrayArray67[local79][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIIIZIZ)V")
	public void method8335(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int local13 = arg5 - this.anInt9709;
		@Pc(18) int local18 = arg1 - this.anInt9711;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method8333(local18, local13, 128);
				this.method8333(local18 - 1, local13, 8);
			}
			if (arg3 == 1) {
				this.method8333(local18, local13, 2);
				this.method8333(local18, local13 + 1, 32);
			}
			if (arg3 == 2) {
				this.method8333(local18, local13, 8);
				this.method8333(local18 + 1, local13, 128);
			}
			if (arg3 == 3) {
				this.method8333(local18, local13, 32);
				this.method8333(local18, local13 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method8333(local18, local13, 1);
				this.method8333(local18 - 1, local13 + 1, 16);
			}
			if (arg3 == 1) {
				this.method8333(local18, local13, 4);
				this.method8333(local18 + 1, local13 - -1, 64);
			}
			if (arg3 == 2) {
				this.method8333(local18, local13, 16);
				this.method8333(local18 + 1, local13 + -1, 1);
			}
			if (arg3 == 3) {
				this.method8333(local18, local13, 64);
				this.method8333(local18 - 1, local13 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method8333(local18, local13, 130);
				this.method8333(local18 - 1, local13, 8);
				this.method8333(local18, local13 + 1, 32);
			}
			if (arg3 == 1) {
				this.method8333(local18, local13, 10);
				this.method8333(local18, local13 + 1, 32);
				this.method8333(local18 + 1, local13, 128);
			}
			if (arg3 == 2) {
				this.method8333(local18, local13, 40);
				this.method8333(local18 + 1, local13, 128);
				this.method8333(local18, local13 - 1, 2);
			}
			if (arg3 == 3) {
				this.method8333(local18, local13, 160);
				this.method8333(local18, local13 - 1, 2);
				this.method8333(local18 - 1, local13, 8);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method8333(local18, local13, 65536);
					this.method8333(local18 - 1, local13, 4096);
				}
				if (arg3 == 1) {
					this.method8333(local18, local13, 1024);
					this.method8333(local18, local13 + 1, 16384);
				}
				if (arg3 == 2) {
					this.method8333(local18, local13, 4096);
					this.method8333(local18 + 1, local13, 65536);
				}
				if (arg3 == 3) {
					this.method8333(local18, local13, 16384);
					this.method8333(local18, local13 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method8333(local18, local13, 512);
					this.method8333(local18 - 1, local13 - -1, 8192);
				}
				if (arg3 == 1) {
					this.method8333(local18, local13, 2048);
					this.method8333(local18 + 1, local13 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method8333(local18, local13, 8192);
					this.method8333(local18 + 1, local13 + -1, 512);
				}
				if (arg3 == 3) {
					this.method8333(local18, local13, 32768);
					this.method8333(local18 - 1, local13 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method8333(local18, local13, 66560);
					this.method8333(local18 - 1, local13, 4096);
					this.method8333(local18, local13 + 1, 16384);
				}
				if (arg3 == 1) {
					this.method8333(local18, local13, 5120);
					this.method8333(local18, local13 + 1, 16384);
					this.method8333(local18 + 1, local13, 65536);
				}
				if (arg3 == 2) {
					this.method8333(local18, local13, 20480);
					this.method8333(local18 + 1, local13, 65536);
					this.method8333(local18, local13 - 1, 1024);
				}
				if (arg3 == 3) {
					this.method8333(local18, local13, 81920);
					this.method8333(local18, local13 - 1, 1024);
					this.method8333(local18 - 1, local13, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method8333(local18, local13, 536870912);
				this.method8333(local18 - 1, local13, 33554432);
			}
			if (arg3 == 1) {
				this.method8333(local18, local13, 8388608);
				this.method8333(local18, local13 + 1, 134217728);
			}
			if (arg3 == 2) {
				this.method8333(local18, local13, 33554432);
				this.method8333(local18 + 1, local13, 536870912);
			}
			if (arg3 == 3) {
				this.method8333(local18, local13, 134217728);
				this.method8333(local18, local13 - 1, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method8333(local18, local13, 4194304);
				this.method8333(local18 - 1, local13 + 1, 67108864);
			}
			if (arg3 == 1) {
				this.method8333(local18, local13, 16777216);
				this.method8333(local18 + 1, local13 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method8333(local18, local13, 67108864);
				this.method8333(local18 + 1, local13 + -1, 4194304);
			}
			if (arg3 == 3) {
				this.method8333(local18, local13, 268435456);
				this.method8333(local18 - 1, local13 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method8333(local18, local13, 545259520);
			this.method8333(local18 - 1, local13, 33554432);
			this.method8333(local18, local13 + 1, 134217728);
		}
		if (arg3 == 1) {
			this.method8333(local18, local13, 41943040);
			this.method8333(local18, local13 + 1, 134217728);
			this.method8333(local18 + 1, local13, 536870912);
		}
		if (arg3 == 2) {
			this.method8333(local18, local13, 167772160);
			this.method8333(local18 + 1, local13, 536870912);
			this.method8333(local18, local13 - 1, 8388608);
		}
		if (arg3 == 3) {
			this.method8333(local18, local13, 671088640);
			this.method8333(local18, local13 - 1, 8388608);
			this.method8333(local18 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
	public void method8336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9709;
		@Pc(13) int local13 = arg0 - this.anInt9711;
		this.anIntArrayArray67[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(IIII)V")
	private void method8337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray67[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIZZI)V")
	public void method8338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt9709;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(38) int local38 = arg2 - this.anInt9711;
		for (@Pc(40) int local40 = local38; local40 < arg0 + local38; local40++) {
			if (local40 >= 0 && this.anInt9705 > local40) {
				for (@Pc(54) int local54 = local18; local54 < local18 + arg5; local54++) {
					if (local54 >= 0 && this.anInt9703 > local54) {
						this.method8337(local54, local7, local40);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIZZI)V")
	public void method8339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt9709;
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg0 - this.anInt9711;
		@Pc(45) int local45;
		if (arg3 == 1 || arg3 == 3) {
			local45 = arg2;
			arg2 = arg6;
			arg6 = local45;
		}
		for (local45 = local29; local45 < arg2 + local29; local45++) {
			if (local45 >= 0 && this.anInt9705 > local45) {
				for (@Pc(68) int local68 = local18; local68 < local18 + arg6; local68++) {
					if (local68 >= 0 && this.anInt9703 > local68) {
						this.method8333(local45, local68, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZZIII)V")
	public void method8340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg1 - this.anInt9709;
		@Pc(13) int local13 = arg0 - this.anInt9711;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method8337(local8, 128, local13);
				this.method8337(local8, 8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method8337(local8, 2, local13);
				this.method8337(local8 + 1, 32, local13);
			}
			if (arg4 == 2) {
				this.method8337(local8, 8, local13);
				this.method8337(local8, 128, local13 + 1);
			}
			if (arg4 == 3) {
				this.method8337(local8, 32, local13);
				this.method8337(local8 - 1, 2, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method8337(local8, 1, local13);
				this.method8337(local8 + 1, 16, local13 - 1);
			}
			if (arg4 == 1) {
				this.method8337(local8, 4, local13);
				this.method8337(local8 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method8337(local8, 16, local13);
				this.method8337(local8 - 1, 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method8337(local8, 64, local13);
				this.method8337(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method8337(local8, 130, local13);
				this.method8337(local8, 8, local13 - 1);
				this.method8337(local8 + 1, 32, local13);
			}
			if (arg4 == 1) {
				this.method8337(local8, 10, local13);
				this.method8337(local8 + 1, 32, local13);
				this.method8337(local8, 128, local13 + 1);
			}
			if (arg4 == 2) {
				this.method8337(local8, 40, local13);
				this.method8337(local8, 128, local13 + 1);
				this.method8337(local8 - 1, 2, local13);
			}
			if (arg4 == 3) {
				this.method8337(local8, 160, local13);
				this.method8337(local8 - 1, 2, local13);
				this.method8337(local8, 8, local13 - 1);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method8337(local8, 65536, local13);
					this.method8337(local8, 4096, local13 - 1);
				}
				if (arg4 == 1) {
					this.method8337(local8, 1024, local13);
					this.method8337(local8 + 1, 16384, local13);
				}
				if (arg4 == 2) {
					this.method8337(local8, 4096, local13);
					this.method8337(local8, 65536, local13 + 1);
				}
				if (arg4 == 3) {
					this.method8337(local8, 16384, local13);
					this.method8337(local8 - 1, 1024, local13);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method8337(local8, 512, local13);
					this.method8337(local8 + 1, 8192, local13 - 1);
				}
				if (arg4 == 1) {
					this.method8337(local8, 2048, local13);
					this.method8337(local8 + 1, 32768, local13 + 1);
				}
				if (arg4 == 2) {
					this.method8337(local8, 8192, local13);
					this.method8337(local8 - 1, 512, local13 + 1);
				}
				if (arg4 == 3) {
					this.method8337(local8, 32768, local13);
					this.method8337(local8 - 1, 2048, local13 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method8337(local8, 66560, local13);
					this.method8337(local8, 4096, local13 - 1);
					this.method8337(local8 + 1, 16384, local13);
				}
				if (arg4 == 1) {
					this.method8337(local8, 5120, local13);
					this.method8337(local8 + 1, 16384, local13);
					this.method8337(local8, 65536, local13 + 1);
				}
				if (arg4 == 2) {
					this.method8337(local8, 20480, local13);
					this.method8337(local8, 65536, local13 + 1);
					this.method8337(local8 - 1, 1024, local13);
				}
				if (arg4 == 3) {
					this.method8337(local8, 81920, local13);
					this.method8337(local8 - 1, 1024, local13);
					this.method8337(local8, 4096, local13 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method8337(local8, 536870912, local13);
				this.method8337(local8, 33554432, local13 - 1);
			}
			if (arg4 == 1) {
				this.method8337(local8, 8388608, local13);
				this.method8337(local8 + 1, 134217728, local13);
			}
			if (arg4 == 2) {
				this.method8337(local8, 33554432, local13);
				this.method8337(local8, 536870912, local13 + 1);
			}
			if (arg4 == 3) {
				this.method8337(local8, 134217728, local13);
				this.method8337(local8 - 1, 8388608, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method8337(local8, 4194304, local13);
				this.method8337(local8 + 1, 67108864, local13 - 1);
			}
			if (arg4 == 1) {
				this.method8337(local8, 16777216, local13);
				this.method8337(local8 + 1, 268435456, local13 + 1);
			}
			if (arg4 == 2) {
				this.method8337(local8, 67108864, local13);
				this.method8337(local8 - 1, 4194304, local13 + 1);
			}
			if (arg4 == 3) {
				this.method8337(local8, 268435456, local13);
				this.method8337(local8 - 1, 16777216, local13 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method8337(local8, 545259520, local13);
			this.method8337(local8, 33554432, local13 - 1);
			this.method8337(local8 + 1, 134217728, local13);
		}
		if (arg4 == 1) {
			this.method8337(local8, 41943040, local13);
			this.method8337(local8 + 1, 134217728, local13);
			this.method8337(local8, 536870912, local13 + 1);
		}
		if (arg4 == 2) {
			this.method8337(local8, 167772160, local13);
			this.method8337(local8, 536870912, local13 + 1);
			this.method8337(local8 - 1, 8388608, local13);
		}
		if (arg4 == 3) {
			this.method8337(local8, 671088640, local13);
			this.method8337(local8 - 1, 8388608, local13);
			this.method8337(local8, 33554432, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method8343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static536.method7904(arg0, arg7, arg3, arg6, arg6, arg2, arg1, arg4) ? true : this.method8345(arg2, arg6, arg6, arg7, arg3, arg1, arg4, arg0, arg5);
		}
		@Pc(46) int local46 = arg0 + arg1 - 1;
		@Pc(52) int local52 = arg7 + arg4 - 1;
		if (arg2 >= arg0 && arg2 <= local46 && arg7 <= arg3 && local52 >= arg3) {
			return true;
		} else if (arg2 == arg0 - 1 && arg3 >= arg7 && local52 >= arg3 && (this.anIntArrayArray67[arg2 - this.anInt9711][arg3 - this.anInt9709] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg2 == local46 + 1 && arg7 <= arg3 && local52 >= arg3 && (this.anIntArrayArray67[arg2 - this.anInt9711][arg3 - this.anInt9709] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg3 && arg2 >= arg0 && local46 >= arg2 && (this.anIntArrayArray67[arg2 - this.anInt9711][arg3 - this.anInt9709] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg3 == local52 + 1 && arg0 <= arg2 && local46 >= arg2 && (this.anIntArrayArray67[arg2 - this.anInt9711][arg3 - this.anInt9709] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZ)V")
	public void method8344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9709;
		@Pc(22) int local22 = arg1 - this.anInt9711;
		this.anIntArrayArray67[local22][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method8345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg0;
		@Pc(13) int local13 = arg2 + arg4;
		@Pc(18) int local18 = arg7 + arg5;
		@Pc(27) int local27 = arg3 + arg6;
		@Pc(45) int local45;
		@Pc(56) int local56;
		if (local18 == arg0 && (arg8 & 0x2) == 0) {
			local45 = arg3 >= arg4 ? arg3 : arg4;
			local56 = local13 < local27 ? local13 : local27;
			while (local56 > local45) {
				if ((this.anIntArrayArray67[local18 - this.anInt9711 - 1][local45 - this.anInt9709] & 0x8) == 0) {
					return true;
				}
				local45++;
			}
		} else if (arg7 == local9 && (arg8 & 0x8) == 0) {
			local45 = arg4 <= arg3 ? arg3 : arg4;
			local56 = local27 <= local13 ? local27 : local13;
			while (local45 < local56) {
				if ((this.anIntArrayArray67[arg7 - this.anInt9711][local45 - this.anInt9709] & 0x80) == 0) {
					return true;
				}
				local45++;
			}
		} else if (arg4 == local27 && (arg8 & 0x1) == 0) {
			local45 = arg0 > arg7 ? arg0 : arg7;
			local56 = local9 >= local18 ? local18 : local9;
			while (local56 > local45) {
				if ((this.anIntArrayArray67[local45 - this.anInt9711][local27 - this.anInt9709 - 1] & 0x2) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local13 == arg3 && (arg8 & 0x4) == 0) {
			local45 = arg7 >= arg0 ? arg7 : arg0;
			local56 = local18 > local9 ? local9 : local18;
			while (local45 < local56) {
				if ((this.anIntArrayArray67[local45 - this.anInt9711][arg3 - this.anInt9709] & 0x20) == 0) {
					return true;
				}
				local45++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)V")
	public void method8346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt9711;
		@Pc(13) int local13 = arg0 - this.anInt9709;
		this.anIntArrayArray67[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public void method8347() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9705; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt9703; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt9705 - 5 <= local3 || local7 >= this.anInt9703 - 5) {
					this.anIntArrayArray67[local3][local7] = -1;
				} else {
					this.anIntArrayArray67[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)V")
	public void method8350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt9709;
		@Pc(13) int local13 = arg0 - this.anInt9711;
		this.anIntArrayArray67[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method8351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg4 == arg6 && arg1 == arg5) {
				return true;
			}
		} else if (arg6 <= arg4 && arg4 <= arg3 + arg6 - 1 && arg1 >= arg1 && arg1 <= arg1 + arg3 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg1 - this.anInt9709;
		@Pc(58) int local58 = arg4 - this.anInt9711;
		@Pc(63) int local63 = arg5 - this.anInt9709;
		@Pc(68) int local68 = arg6 - this.anInt9711;
		if (arg3 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local58 + 1 == local68 && local53 == local63 && (this.anIntArrayArray67[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local53 - 1 && (this.anIntArrayArray67[local68][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local58 - 1 == local68 && local63 == local53 && (this.anIntArrayArray67[local68][local63] & 0x8) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local53 - 1 && (this.anIntArrayArray67[local68][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local68 == local58 - 1 && local63 == local53 && (this.anIntArrayArray67[local68][local63] & 0x8) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local53 + 1 && (this.anIntArrayArray67[local68][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 == local58 + 1 && local63 == local53 && (this.anIntArrayArray67[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 == local68 && local63 == local53 + 1 && (this.anIntArrayArray67[local68][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local68 == local58 && local63 == local53 + 1 && (this.anIntArrayArray67[local68][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local58 && local63 == local53 - 1 && (this.anIntArrayArray67[local68][local63] & 0x2) == 0) {
					return true;
				}
				if (local68 == local58 - 1 && local63 == local53 && (this.anIntArrayArray67[local68][local63] & 0x8) == 0) {
					return true;
				}
				if (local68 == local58 + 1 && local63 == local53 && (this.anIntArrayArray67[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(77) int local77 = arg3 + local68 - 1;
			@Pc(84) int local84 = local63 + arg3 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local68 == local58 + 1 && local53 >= local63 && local84 >= local53 && (this.anIntArrayArray67[local68][local53] & 0x80) == 0) {
						return true;
					}
					if (local68 <= local58 && local77 >= local58 && local53 - arg3 == local63 && (this.anIntArrayArray67[local58][local84] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 == local58 - arg3 && local53 >= local63 && local53 <= local84 && (this.anIntArrayArray67[local77][local53] & 0x8) == 0) {
						return true;
					}
					if (local58 >= local68 && local58 <= local77 && local53 - arg3 == local63 && (this.anIntArrayArray67[local58][local84] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local68 == local58 - arg3 && local63 <= local53 && local53 <= local84 && (this.anIntArrayArray67[local77][local53] & 0x8) == 0) {
						return true;
					}
					if (local58 >= local68 && local77 >= local58 && local53 + 1 == local63 && (this.anIntArrayArray67[local58][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local58 + 1 == local68 && local63 <= local53 && local84 >= local53 && (this.anIntArrayArray67[local68][local53] & 0x80) == 0) {
						return true;
					}
					if (local68 <= local58 && local58 <= local77 && local63 == local53 + 1 && (this.anIntArrayArray67[local58][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local58 >= local68 && local77 >= local58 && local53 + 1 == local63 && (this.anIntArrayArray67[local58][local63] & 0x20) == 0) {
					return true;
				}
				if (local58 >= local68 && local77 >= local58 && local63 == local53 - arg3 && (this.anIntArrayArray67[local58][local84] & 0x2) == 0) {
					return true;
				}
				if (local68 == local58 - arg3 && local63 <= local53 && local53 <= local84 && (this.anIntArrayArray67[local77][local53] & 0x8) == 0) {
					return true;
				}
				if (local58 + 1 == local68 && local53 >= local63 && local53 <= local84 && (this.anIntArrayArray67[local68][local53] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}

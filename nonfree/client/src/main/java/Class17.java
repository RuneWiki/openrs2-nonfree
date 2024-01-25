import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class17 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public int anInt370;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg6 + arg5;
		@Pc(28) int local28 = arg7 + arg0;
		@Pc(33) int local33 = arg4 + arg1;
		@Pc(37) int local37 = arg8 + arg3;
		@Pc(73) int local73;
		@Pc(84) int local84;
		if (arg6 == local33 && (arg2 & 0x2) == 0) {
			local73 = arg7 > arg3 ? arg7 : arg3;
			local84 = local37 <= local28 ? local37 : local28;
			while (local84 > local73) {
				if ((this.anIntArrayArray5[local33 - this.anInt365 - 1][local73 - this.anInt370] & 0x8) == 0) {
					return true;
				}
				local73++;
			}
		} else if (arg4 == local10 && (arg2 & 0x8) == 0) {
			local73 = arg7 > arg3 ? arg7 : arg3;
			local84 = local37 <= local28 ? local37 : local28;
			while (local84 > local73) {
				if ((this.anIntArrayArray5[arg4 - this.anInt365][local73 - this.anInt370] & 0x80) == 0) {
					return true;
				}
				local73++;
			}
		} else if (arg7 == local37 && (arg2 & 0x1) == 0) {
			local73 = arg6 <= arg4 ? arg4 : arg6;
			local84 = local10 < local33 ? local10 : local33;
			while (local73 < local84) {
				if ((this.anIntArrayArray5[local73 - this.anInt365][local37 - this.anInt370 - 1] & 0x2) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local28 == arg3 && (arg2 & 0x4) == 0) {
			local73 = arg4 >= arg6 ? arg4 : arg6;
			local84 = local33 <= local10 ? local33 : local10;
			while (local84 > local73) {
				if ((this.anIntArrayArray5[local73 - this.anInt365][arg3 - this.anInt370] & 0x20) == 0) {
					return true;
				}
				local73++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)V")
	public void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt365;
		@Pc(21) int local21 = arg0 - this.anInt370;
		this.anIntArrayArray5[local8][local21] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZII)V")
	private void method325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray5[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	public void method328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt365;
		@Pc(9) int local9 = arg0 - this.anInt370;
		this.anIntArrayArray5[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg5 == arg4 && arg0 == arg3) {
				return true;
			}
		} else if (arg5 >= arg4 && arg5 <= arg1 + arg4 - 1 && arg3 >= arg3 && arg3 <= arg3 + arg1 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg5 - this.anInt365;
		@Pc(69) int local69 = arg4 - this.anInt365;
		@Pc(74) int local74 = arg0 - this.anInt370;
		@Pc(79) int local79 = arg3 - this.anInt370;
		if (arg1 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local59 + 1 == local69 && local79 == local74 && (this.anIntArrayArray5[local69][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 == local69 && local74 == local79 - 1 && (this.anIntArrayArray5[local69][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local69 == local59 - 1 && local79 == local74 && (this.anIntArrayArray5[local69][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 == local69 && local79 - 1 == local74 && (this.anIntArrayArray5[local69][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local69 == local59 - 1 && local74 == local79 && (this.anIntArrayArray5[local69][local74] & 0x8) == 0) {
						return true;
					}
					if (local69 == local59 && local79 + 1 == local74 && (this.anIntArrayArray5[local69][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local69 == local59 + 1 && local79 == local74 && (this.anIntArrayArray5[local69][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 == local69 && local74 == local79 + 1 && (this.anIntArrayArray5[local69][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local69 == local59 && local74 == local79 + 1 && (this.anIntArrayArray5[local69][local74] & 0x20) == 0) {
					return true;
				}
				if (local69 == local59 && local74 == local79 - 1 && (this.anIntArrayArray5[local69][local74] & 0x2) == 0) {
					return true;
				}
				if (local69 == local59 - 1 && local79 == local74 && (this.anIntArrayArray5[local69][local74] & 0x8) == 0) {
					return true;
				}
				if (local69 == local59 + 1 && local79 == local74 && (this.anIntArrayArray5[local69][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(88) int local88 = arg1 + local69 - 1;
			@Pc(94) int local94 = arg1 + local74 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local59 + 1 == local69 && local79 >= local74 && local94 >= local79 && (this.anIntArrayArray5[local69][local79] & 0x80) == 0) {
						return true;
					}
					if (local69 <= local59 && local59 <= local88 && local79 - arg1 == local74 && (this.anIntArrayArray5[local59][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local69 == local59 - arg1 && local79 >= local74 && local94 >= local79 && (this.anIntArrayArray5[local88][local79] & 0x8) == 0) {
						return true;
					}
					if (local59 >= local69 && local88 >= local59 && local79 - arg1 == local74 && (this.anIntArrayArray5[local59][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local59 - arg1 == local69 && local79 >= local74 && local94 >= local79 && (this.anIntArrayArray5[local88][local79] & 0x8) == 0) {
						return true;
					}
					if (local69 <= local59 && local59 <= local88 && local74 == local79 + 1 && (this.anIntArrayArray5[local59][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local69 == local59 + 1 && local74 <= local79 && local79 <= local94 && (this.anIntArrayArray5[local69][local79] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local69 && local88 >= local59 && local79 + 1 == local74 && (this.anIntArrayArray5[local59][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local59 >= local69 && local88 >= local59 && local74 == local79 + 1 && (this.anIntArrayArray5[local59][local74] & 0x20) == 0) {
					return true;
				}
				if (local59 >= local69 && local88 >= local59 && local79 - arg1 == local74 && (this.anIntArrayArray5[local59][local94] & 0x2) == 0) {
					return true;
				}
				if (local59 - arg1 == local69 && local79 >= local74 && local79 <= local94 && (this.anIntArrayArray5[local88][local79] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local69 && local74 <= local79 && local94 >= local79 && (this.anIntArrayArray5[local69][local79] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZZIII)V")
	public void method330(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg5 - this.anInt370;
		@Pc(21) int local21 = arg4 - this.anInt365;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method325(local21, local8, 128);
				this.method325(local21 - 1, local8, 8);
			}
			if (arg3 == 1) {
				this.method325(local21, local8, 2);
				this.method325(local21, local8 + 1, 32);
			}
			if (arg3 == 2) {
				this.method325(local21, local8, 8);
				this.method325(local21 + 1, local8, 128);
			}
			if (arg3 == 3) {
				this.method325(local21, local8, 32);
				this.method325(local21, local8 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method325(local21, local8, 1);
				this.method325(local21 - 1, local8 - -1, 16);
			}
			if (arg3 == 1) {
				this.method325(local21, local8, 4);
				this.method325(local21 + 1, local8 - -1, 64);
			}
			if (arg3 == 2) {
				this.method325(local21, local8, 16);
				this.method325(local21 + 1, local8 - 1, 1);
			}
			if (arg3 == 3) {
				this.method325(local21, local8, 64);
				this.method325(local21 - 1, local8 - 1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method325(local21, local8, 130);
				this.method325(local21 - 1, local8, 8);
				this.method325(local21, local8 + 1, 32);
			}
			if (arg3 == 1) {
				this.method325(local21, local8, 10);
				this.method325(local21, local8 + 1, 32);
				this.method325(local21 + 1, local8, 128);
			}
			if (arg3 == 2) {
				this.method325(local21, local8, 40);
				this.method325(local21 + 1, local8, 128);
				this.method325(local21, local8 - 1, 2);
			}
			if (arg3 == 3) {
				this.method325(local21, local8, 160);
				this.method325(local21, local8 - 1, 2);
				this.method325(local21 - 1, local8, 8);
			}
		}
		if (arg2) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method325(local21, local8, 65536);
					this.method325(local21 - 1, local8, 4096);
				}
				if (arg3 == 1) {
					this.method325(local21, local8, 1024);
					this.method325(local21, local8 + 1, 16384);
				}
				if (arg3 == 2) {
					this.method325(local21, local8, 4096);
					this.method325(local21 + 1, local8, 65536);
				}
				if (arg3 == 3) {
					this.method325(local21, local8, 16384);
					this.method325(local21, local8 - 1, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method325(local21, local8, 512);
					this.method325(local21 - 1, local8 + 1, 8192);
				}
				if (arg3 == 1) {
					this.method325(local21, local8, 2048);
					this.method325(local21 + 1, local8 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method325(local21, local8, 8192);
					this.method325(local21 + 1, local8 + -1, 512);
				}
				if (arg3 == 3) {
					this.method325(local21, local8, 32768);
					this.method325(local21 - 1, local8 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method325(local21, local8, 66560);
					this.method325(local21 - 1, local8, 4096);
					this.method325(local21, local8 + 1, 16384);
				}
				if (arg3 == 1) {
					this.method325(local21, local8, 5120);
					this.method325(local21, local8 + 1, 16384);
					this.method325(local21 + 1, local8, 65536);
				}
				if (arg3 == 2) {
					this.method325(local21, local8, 20480);
					this.method325(local21 + 1, local8, 65536);
					this.method325(local21, local8 - 1, 1024);
				}
				if (arg3 == 3) {
					this.method325(local21, local8, 81920);
					this.method325(local21, local8 - 1, 1024);
					this.method325(local21 - 1, local8, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method325(local21, local8, 536870912);
				this.method325(local21 - 1, local8, 33554432);
			}
			if (arg3 == 1) {
				this.method325(local21, local8, 8388608);
				this.method325(local21, local8 + 1, 134217728);
			}
			if (arg3 == 2) {
				this.method325(local21, local8, 33554432);
				this.method325(local21 + 1, local8, 536870912);
			}
			if (arg3 == 3) {
				this.method325(local21, local8, 134217728);
				this.method325(local21, local8 - 1, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method325(local21, local8, 4194304);
				this.method325(local21 - 1, local8 + 1, 67108864);
			}
			if (arg3 == 1) {
				this.method325(local21, local8, 16777216);
				this.method325(local21 + 1, local8 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method325(local21, local8, 67108864);
				this.method325(local21 + 1, local8 - 1, 4194304);
			}
			if (arg3 == 3) {
				this.method325(local21, local8, 268435456);
				this.method325(local21 - 1, local8 + -1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method325(local21, local8, 545259520);
			this.method325(local21 - 1, local8, 33554432);
			this.method325(local21, local8 + 1, 134217728);
		}
		if (arg3 == 1) {
			this.method325(local21, local8, 41943040);
			this.method325(local21, local8 + 1, 134217728);
			this.method325(local21 + 1, local8, 536870912);
		}
		if (arg3 == 2) {
			this.method325(local21, local8, 167772160);
			this.method325(local21 + 1, local8, 536870912);
			this.method325(local21, local8 - 1, 8388608);
		}
		if (arg3 == 3) {
			this.method325(local21, local8, 671088640);
			this.method325(local21, local8 - 1, 8388608);
			this.method325(local21 - 1, local8, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
	public void method332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt365;
		@Pc(18) int local18 = arg0 - this.anInt370;
		this.anIntArrayArray5[local13][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public void method333() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt383; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt360; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt383 - 5 || local15 >= this.anInt360 - 5) {
					this.anIntArrayArray5[local11][local15] = -1;
				} else {
					this.anIntArrayArray5[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZIIIZIB)V")
	public void method335(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(28) int local28 = arg0 - this.anInt370;
		@Pc(33) int local33 = arg3 - this.anInt365;
		@Pc(45) int local45;
		if (arg2 == 1 || arg2 == 3) {
			local45 = arg6;
			arg6 = arg4;
			arg4 = local45;
		}
		for (local45 = local33; local45 < arg6 + local33; local45++) {
			if (local45 >= 0 && local45 < this.anInt383) {
				for (@Pc(64) int local64 = local28; local64 < local28 + arg4; local64++) {
					if (local64 >= 0 && this.anInt360 > local64) {
						this.method338(local45, local64, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIZII)V")
	public void method336(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt370;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(38) int local38 = arg5 - this.anInt365;
		for (@Pc(40) int local40 = local38; local40 < arg4 + local38; local40++) {
			if (local40 >= 0 && this.anInt383 > local40) {
				for (@Pc(54) int local54 = local18; local54 < local18 + arg2; local54++) {
					if (local54 >= 0 && this.anInt360 > local54) {
						this.method325(local40, local54, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIBIIII)Z")
	public boolean method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static12.method187(arg5, arg6, arg7, arg2, arg1, arg1, arg4, arg3) ? true : this.method323(arg1, arg7, arg0, arg6, arg5, arg1, arg2, arg3, arg4);
		}
		@Pc(38) int local38 = arg7 + arg5 - 1;
		@Pc(49) int local49 = arg4 + arg6 - 1;
		if (arg5 <= arg2 && local38 >= arg2 && arg6 <= arg3 && arg3 <= local49) {
			return true;
		} else if (arg2 == arg5 - 1 && arg6 <= arg3 && arg3 <= local49 && (this.anIntArrayArray5[arg2 - this.anInt365][arg3 - this.anInt370] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg2 && arg6 <= arg3 && local49 >= arg3 && (this.anIntArrayArray5[arg2 - this.anInt365][arg3 - this.anInt370] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg3 && arg2 >= arg5 && arg2 <= local38 && (this.anIntArrayArray5[arg2 - this.anInt365][arg3 - this.anInt370] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local49 + 1 == arg3 && arg2 >= arg5 && local38 >= arg2 && (this.anIntArrayArray5[arg2 - this.anInt365][arg3 - this.anInt370] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	private void method338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray5[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIIZI)V")
	public void method339(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg0 - this.anInt365;
		@Pc(18) int local18 = arg5 - this.anInt370;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method338(local8, local18, 128);
				this.method338(local8 - 1, local18, 8);
			}
			if (arg3 == 1) {
				this.method338(local8, local18, 2);
				this.method338(local8, local18 + 1, 32);
			}
			if (arg3 == 2) {
				this.method338(local8, local18, 8);
				this.method338(local8 + 1, local18, 128);
			}
			if (arg3 == 3) {
				this.method338(local8, local18, 32);
				this.method338(local8, local18 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method338(local8, local18, 1);
				this.method338(local8 - 1, local18 + 1, 16);
			}
			if (arg3 == 1) {
				this.method338(local8, local18, 4);
				this.method338(local8 + 1, local18 + 1, 64);
			}
			if (arg3 == 2) {
				this.method338(local8, local18, 16);
				this.method338(local8 + 1, local18 + -1, 1);
			}
			if (arg3 == 3) {
				this.method338(local8, local18, 64);
				this.method338(local8 - 1, local18 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method338(local8, local18, 130);
				this.method338(local8 - 1, local18, 8);
				this.method338(local8, local18 + 1, 32);
			}
			if (arg3 == 1) {
				this.method338(local8, local18, 10);
				this.method338(local8, local18 + 1, 32);
				this.method338(local8 + 1, local18, 128);
			}
			if (arg3 == 2) {
				this.method338(local8, local18, 40);
				this.method338(local8 + 1, local18, 128);
				this.method338(local8, local18 - 1, 2);
			}
			if (arg3 == 3) {
				this.method338(local8, local18, 160);
				this.method338(local8, local18 - 1, 2);
				this.method338(local8 - 1, local18, 8);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method338(local8, local18, 65536);
					this.method338(local8 - 1, local18, 4096);
				}
				if (arg3 == 1) {
					this.method338(local8, local18, 1024);
					this.method338(local8, local18 + 1, 16384);
				}
				if (arg3 == 2) {
					this.method338(local8, local18, 4096);
					this.method338(local8 + 1, local18, 65536);
				}
				if (arg3 == 3) {
					this.method338(local8, local18, 16384);
					this.method338(local8, local18 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method338(local8, local18, 512);
					this.method338(local8 - 1, local18 + 1, 8192);
				}
				if (arg3 == 1) {
					this.method338(local8, local18, 2048);
					this.method338(local8 + 1, local18 - -1, 32768);
				}
				if (arg3 == 2) {
					this.method338(local8, local18, 8192);
					this.method338(local8 + 1, local18 + -1, 512);
				}
				if (arg3 == 3) {
					this.method338(local8, local18, 32768);
					this.method338(local8 - 1, local18 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method338(local8, local18, 66560);
					this.method338(local8 - 1, local18, 4096);
					this.method338(local8, local18 + 1, 16384);
				}
				if (arg3 == 1) {
					this.method338(local8, local18, 5120);
					this.method338(local8, local18 + 1, 16384);
					this.method338(local8 + 1, local18, 65536);
				}
				if (arg3 == 2) {
					this.method338(local8, local18, 20480);
					this.method338(local8 + 1, local18, 65536);
					this.method338(local8, local18 - 1, 1024);
				}
				if (arg3 == 3) {
					this.method338(local8, local18, 81920);
					this.method338(local8, local18 - 1, 1024);
					this.method338(local8 - 1, local18, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method338(local8, local18, 536870912);
				this.method338(local8 - 1, local18, 33554432);
			}
			if (arg3 == 1) {
				this.method338(local8, local18, 8388608);
				this.method338(local8, local18 + 1, 134217728);
			}
			if (arg3 == 2) {
				this.method338(local8, local18, 33554432);
				this.method338(local8 + 1, local18, 536870912);
			}
			if (arg3 == 3) {
				this.method338(local8, local18, 134217728);
				this.method338(local8, local18 - 1, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method338(local8, local18, 4194304);
				this.method338(local8 - 1, local18 + 1, 67108864);
			}
			if (arg3 == 1) {
				this.method338(local8, local18, 16777216);
				this.method338(local8 + 1, local18 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method338(local8, local18, 67108864);
				this.method338(local8 + 1, local18 - 1, 4194304);
			}
			if (arg3 == 3) {
				this.method338(local8, local18, 268435456);
				this.method338(local8 - 1, local18 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method338(local8, local18, 545259520);
			this.method338(local8 - 1, local18, 33554432);
			this.method338(local8, local18 + 1, 134217728);
		}
		if (arg3 == 1) {
			this.method338(local8, local18, 41943040);
			this.method338(local8, local18 + 1, 134217728);
			this.method338(local8 + 1, local18, 536870912);
		}
		if (arg3 == 2) {
			this.method338(local8, local18, 167772160);
			this.method338(local8 + 1, local18, 536870912);
			this.method338(local8, local18 - 1, 8388608);
		}
		if (arg3 == 3) {
			this.method338(local8, local18, 671088640);
			this.method338(local8, local18 - 1, 8388608);
			this.method338(local8 - 1, local18, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg5 == arg4 && arg0 == arg6) {
				return true;
			}
		} else if (arg4 >= arg5 && arg4 <= arg3 + arg5 - 1 && arg0 <= arg0 && arg3 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(47) int local47 = arg4 - this.anInt365;
		@Pc(52) int local52 = arg0 - this.anInt370;
		@Pc(57) int local57 = arg5 - this.anInt365;
		@Pc(62) int local62 = arg6 - this.anInt370;
		if (arg3 == 1) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local57 == local47 - 1 && local52 == local62) {
						return true;
					}
					if (local47 == local57 && local62 == local52 + 1 && (this.anIntArrayArray5[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 == local57 && local52 - 1 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 == local47 && local52 + 1 == local62) {
						return true;
					}
					if (local57 == local47 - 1 && local62 == local52 && (this.anIntArrayArray5[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local47 + 1 == local57 && local52 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local47 + 1 == local57 && local52 == local62) {
						return true;
					}
					if (local57 == local47 && local52 + 1 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local47 && local62 == local52 - 1 && (this.anIntArrayArray5[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local47 && local62 == local52 - 1) {
						return true;
					}
					if (local57 == local47 - 1 && local52 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local47 + 1 == local57 && local62 == local52 && (this.anIntArrayArray5[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local57 == local47 - 1 && local52 == local62) {
						return true;
					}
					if (local57 == local47 && local52 + 1 == local62) {
						return true;
					}
					if (local57 == local47 + 1 && local62 == local52 && (this.anIntArrayArray5[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local47 && local62 == local52 - 1 && (this.anIntArrayArray5[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 == local47 - 1 && local52 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local47 && local52 + 1 == local62) {
						return true;
					}
					if (local57 == local47 + 1 && local52 == local62) {
						return true;
					}
					if (local57 == local47 && local62 == local52 - 1 && (this.anIntArrayArray5[local57][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 == local47 - 1 && local62 == local52 && (this.anIntArrayArray5[local57][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local47 == local57 && local52 + 1 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 + 1 == local57 && local62 == local52) {
						return true;
					}
					if (local57 == local47 && local62 == local52 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local47 - 1 && local62 == local52) {
						return true;
					}
					if (local47 == local57 && local62 == local52 + 1 && (this.anIntArrayArray5[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 + 1 == local57 && local62 == local52 && (this.anIntArrayArray5[local57][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local47 && local52 - 1 == local62) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local47 == local57 && local62 == local52 + 1 && (this.anIntArrayArray5[local57][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 == local47 && local52 - 1 == local62 && (this.anIntArrayArray5[local57][local62] & 0x2) == 0) {
					return true;
				}
				if (local47 - 1 == local57 && local52 == local62 && (this.anIntArrayArray5[local57][local62] & 0x8) == 0) {
					return true;
				}
				if (local57 == local47 + 1 && local52 == local62 && (this.anIntArrayArray5[local57][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(768) int local768 = arg3 + local57 - 1;
			@Pc(774) int local774 = local62 + arg3 - 1;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local57 == local47 - arg3 && local62 <= local52 && local52 <= local774) {
						return true;
					}
					if (local47 >= local57 && local47 <= local768 && local52 + 1 == local62 && (this.anIntArrayArray5[local47][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 >= local57 && local47 <= local768 && local62 == local52 - arg3 && (this.anIntArrayArray5[local47][local774] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local47 >= local57 && local47 <= local768 && local62 == local52 + 1) {
						return true;
					}
					if (local57 == local47 - arg3 && local62 <= local52 && local52 <= local774 && (this.anIntArrayArray5[local768][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local47 + 1 && local52 >= local62 && local52 <= local774 && (this.anIntArrayArray5[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 == local47 + 1 && local62 <= local52 && local774 >= local52) {
						return true;
					}
					if (local57 <= local47 && local768 >= local47 && local62 == local52 + 1 && (this.anIntArrayArray5[local47][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 <= local47 && local768 >= local47 && local62 == local52 - arg3 && (this.anIntArrayArray5[local47][local774] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 <= local47 && local768 >= local47 && local62 == local52 - arg3) {
						return true;
					}
					if (local47 - arg3 == local57 && local62 <= local52 && local774 >= local52 && (this.anIntArrayArray5[local768][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local47 + 1 && local52 >= local62 && local774 >= local52 && (this.anIntArrayArray5[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local57 == local47 - arg3 && local62 <= local52 && local774 >= local52) {
						return true;
					}
					if (local57 <= local47 && local768 >= local47 && local52 + 1 == local62) {
						return true;
					}
					if (local57 == local47 + 1 && local52 >= local62 && local774 >= local52 && (this.anIntArrayArray5[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
					if (local47 >= local57 && local47 <= local768 && local52 - arg3 == local62 && (this.anIntArrayArray5[local47][local774] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 == local47 - arg3 && local62 <= local52 && local774 >= local52 && (this.anIntArrayArray5[local768][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 <= local47 && local768 >= local47 && local52 + 1 == local62) {
						return true;
					}
					if (local57 == local47 + 1 && local62 <= local52 && local774 >= local52) {
						return true;
					}
					if (local47 >= local57 && local47 <= local768 && local62 == local52 - arg3 && (this.anIntArrayArray5[local47][local774] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 == local47 - arg3 && local52 >= local62 && local52 <= local774 && (this.anIntArrayArray5[local768][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local47 >= local57 && local47 <= local768 && local62 == local52 + 1 && (this.anIntArrayArray5[local47][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local47 + 1 == local57 && local62 <= local52 && local774 >= local52) {
						return true;
					}
					if (local47 >= local57 && local768 >= local47 && local62 == local52 - arg3) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local47 - arg3 && local62 <= local52 && local774 >= local52) {
						return true;
					}
					if (local47 >= local57 && local768 >= local47 && local52 + 1 == local62 && (this.anIntArrayArray5[local47][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local47 + 1 && local52 >= local62 && local52 <= local774 && (this.anIntArrayArray5[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 <= local47 && local47 <= local768 && local52 - arg3 == local62) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local47 >= local57 && local768 >= local47 && local52 + 1 == local62 && (this.anIntArrayArray5[local47][local62] & 0x2C0120) == 0) {
					return true;
				}
				if (local57 <= local47 && local47 <= local768 && local62 == local52 - arg3 && (this.anIntArrayArray5[local47][local774] & 0x2C0102) == 0) {
					return true;
				}
				if (local57 == local47 - arg3 && local62 <= local52 && local52 <= local774 && (this.anIntArrayArray5[local768][local52] & 0x2C0108) == 0) {
					return true;
				}
				if (local47 + 1 == local57 && local52 >= local62 && local52 <= local774 && (this.anIntArrayArray5[local57][local52] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)V")
	public void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt370;
		@Pc(17) int local17 = arg1 - this.anInt365;
		this.anIntArrayArray5[local17][local8] |= 0x200000;
	}
}

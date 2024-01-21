import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class13 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	private final int anInt576;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	private final int anInt593;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "I")
	private final int anInt589;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "I")
	private final int anInt583;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[[I")
	public final int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt576 = arg0;
		this.anInt593 = 0;
		this.anInt589 = 0;
		this.anInt583 = arg1;
		this.anIntArrayArray11 = new int[this.anInt576][this.anInt583];
		this.method473();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg2 + arg4 - 1;
		@Pc(20) int local20 = arg0 + arg5 - 1;
		if (arg4 <= arg6 && local14 >= arg6 && arg5 <= arg1 && local20 >= arg1) {
			return true;
		} else if (arg4 - 1 == arg6 && arg1 >= arg5 && local20 >= arg1 && (this.anIntArrayArray11[arg6 - this.anInt589][arg1 - this.anInt593] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local14 + 1 == arg6 && arg1 >= arg5 && local20 >= arg1 && (this.anIntArrayArray11[arg6 - this.anInt589][arg1 - this.anInt593] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg1 && arg6 >= arg4 && arg6 <= local14 && (this.anIntArrayArray11[arg6 - this.anInt589][arg1 - this.anInt593] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local20 + 1 && arg6 >= arg4 && arg6 <= local14 && (this.anIntArrayArray11[arg6 - this.anInt589][arg1 - this.anInt593] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg4 == arg2) {
			return true;
		}
		@Pc(24) int local24 = arg4 - this.anInt593;
		@Pc(29) int local29 = arg3 - this.anInt589;
		@Pc(34) int local34 = arg5 - this.anInt589;
		@Pc(39) int local39 = arg2 - this.anInt593;
		if (arg1 == 0) {
			if (arg0 == 0) {
				if (local29 == local34 - 1 && local39 == local24) {
					return true;
				}
				if (local34 == local29 && local39 == local24 + 1 && (this.anIntArrayArray11[local29][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 && local24 - 1 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local34 == local29 && local39 == local24 + 1) {
					return true;
				}
				if (local34 - 1 == local29 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local24 && (this.anIntArrayArray11[local29][local39] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local29 == local34 + 1 && local39 == local24) {
					return true;
				}
				if (local34 == local29 && local24 + 1 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 && local24 - 1 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local34 == local29 && local39 == local24 - 1) {
					return true;
				}
				if (local29 == local34 - 1 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				if (local34 - 1 == local29 && local39 == local24) {
					return true;
				}
				if (local34 == local29 && local24 + 1 == local39) {
					return true;
				}
				if (local29 == local34 + 1 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0180) == 0) {
					return true;
				}
				if (local29 == local34 && local24 - 1 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 == local34 - 1 && local39 == local24 && (this.anIntArrayArray11[local29][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 == local29 && local24 + 1 == local39) {
					return true;
				}
				if (local29 == local34 + 1 && local39 == local24) {
					return true;
				}
				if (local34 == local29 && local24 - 1 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 - 1 == local29 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0108) == 0) {
					return true;
				}
				if (local34 == local29 && local24 + 1 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local39 == local24 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 == local34 - 1 && local39 == local24) {
					return true;
				}
				if (local29 == local34 && local39 == local24 + 1 && (this.anIntArrayArray11[local29][local39] & 0x12C0120) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x12C0180) == 0) {
					return true;
				}
				if (local34 == local29 && local24 - 1 == local39) {
					return true;
				}
			}
		}
		if (arg1 == 9) {
			if (local34 == local29 && local39 == local24 + 1 && (this.anIntArrayArray11[local29][local39] & 0x20) == 0) {
				return true;
			}
			if (local34 == local29 && local39 == local24 - 1 && (this.anIntArrayArray11[local29][local39] & 0x2) == 0) {
				return true;
			}
			if (local29 == local34 - 1 && local24 == local39 && (this.anIntArrayArray11[local29][local39] & 0x8) == 0) {
				return true;
			}
			if (local34 + 1 == local29 && local39 == local24 && (this.anIntArrayArray11[local29][local39] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg1 && arg4 == arg0) {
			return true;
		}
		@Pc(20) int local20 = arg0 - this.anInt593;
		@Pc(25) int local25 = arg1 - this.anInt589;
		@Pc(30) int local30 = arg4 - this.anInt593;
		@Pc(43) int local43 = arg5 - this.anInt589;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}
			if (arg2 == 0) {
				if (local25 == local43 + 1 && local30 == local20 && (this.anIntArrayArray11[local25][local30] & 0x80) == 0) {
					return true;
				}
				if (local25 == local43 && local20 - 1 == local30 && (this.anIntArrayArray11[local25][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local43 - 1 == local25 && local30 == local20 && (this.anIntArrayArray11[local25][local30] & 0x8) == 0) {
					return true;
				}
				if (local43 == local25 && local20 - 1 == local30 && (this.anIntArrayArray11[local25][local30] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local43 - 1 == local25 && local20 == local30 && (this.anIntArrayArray11[local25][local30] & 0x8) == 0) {
					return true;
				}
				if (local25 == local43 && local20 + 1 == local30 && (this.anIntArrayArray11[local25][local30] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local25 == local43 + 1 && local30 == local20 && (this.anIntArrayArray11[local25][local30] & 0x80) == 0) {
					return true;
				}
				if (local43 == local25 && local20 + 1 == local30 && (this.anIntArrayArray11[local25][local30] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg3 == 8) {
			if (local25 == local43 && local20 + 1 == local30 && (this.anIntArrayArray11[local25][local30] & 0x20) == 0) {
				return true;
			}
			if (local43 == local25 && local30 == local20 - 1 && (this.anIntArrayArray11[local25][local30] & 0x2) == 0) {
				return true;
			}
			if (local25 == local43 - 1 && local20 == local30 && (this.anIntArrayArray11[local25][local30] & 0x8) == 0) {
				return true;
			}
			if (local25 == local43 + 1 && local20 == local30 && (this.anIntArrayArray11[local25][local30] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	private void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray11[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	public void method466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt589;
		@Pc(13) int local13 = arg0 - this.anInt593;
		this.anIntArrayArray11[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIZII)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = arg4 - this.anInt593;
		@Pc(24) int local24 = arg0 - this.anInt589;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method464(local19, local24, 128);
				this.method464(local19, local24 - 1, 8);
			}
			if (arg3 == 1) {
				this.method464(local19, local24, 2);
				this.method464(local19 + 1, local24, 32);
			}
			if (arg3 == 2) {
				this.method464(local19, local24, 8);
				this.method464(local19, local24 + 1, 128);
			}
			if (arg3 == 3) {
				this.method464(local19, local24, 32);
				this.method464(local19 - 1, local24, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method464(local19, local24, 1);
				this.method464(local19 + 1, local24 + -1, 16);
			}
			if (arg3 == 1) {
				this.method464(local19, local24, 4);
				this.method464(local19 + 1, local24 + 1, 64);
			}
			if (arg3 == 2) {
				this.method464(local19, local24, 16);
				this.method464(local19 - 1, local24 + 1, 1);
			}
			if (arg3 == 3) {
				this.method464(local19, local24, 64);
				this.method464(local19 - 1, local24 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method464(local19, local24, 130);
				this.method464(local19, local24 - 1, 8);
				this.method464(local19 + 1, local24, 32);
			}
			if (arg3 == 1) {
				this.method464(local19, local24, 10);
				this.method464(local19 + 1, local24, 32);
				this.method464(local19, local24 + 1, 128);
			}
			if (arg3 == 2) {
				this.method464(local19, local24, 40);
				this.method464(local19, local24 + 1, 128);
				this.method464(local19 - 1, local24, 2);
			}
			if (arg3 == 3) {
				this.method464(local19, local24, 160);
				this.method464(local19 - 1, local24, 2);
				this.method464(local19, local24 - 1, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method464(local19, local24, 65536);
				this.method464(local19, local24 - 1, 4096);
			}
			if (arg3 == 1) {
				this.method464(local19, local24, 1024);
				this.method464(local19 + 1, local24, 16384);
			}
			if (arg3 == 2) {
				this.method464(local19, local24, 4096);
				this.method464(local19, local24 + 1, 65536);
			}
			if (arg3 == 3) {
				this.method464(local19, local24, 16384);
				this.method464(local19 - 1, local24, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method464(local19, local24, 512);
				this.method464(local19 + 1, local24 + -1, 8192);
			}
			if (arg3 == 1) {
				this.method464(local19, local24, 2048);
				this.method464(local19 + 1, local24 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method464(local19, local24, 8192);
				this.method464(local19 - 1, local24 + 1, 512);
			}
			if (arg3 == 3) {
				this.method464(local19, local24, 32768);
				this.method464(local19 - 1, local24 + -1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method464(local19, local24, 66560);
			this.method464(local19, local24 - 1, 4096);
			this.method464(local19 + 1, local24, 16384);
		}
		if (arg3 == 1) {
			this.method464(local19, local24, 5120);
			this.method464(local19 + 1, local24, 16384);
			this.method464(local19, local24 + 1, 65536);
		}
		if (arg3 == 2) {
			this.method464(local19, local24, 20480);
			this.method464(local19, local24 + 1, 65536);
			this.method464(local19 - 1, local24, 1024);
		}
		if (arg3 == 3) {
			this.method464(local19, local24, 81920);
			this.method464(local19 - 1, local24, 1024);
			this.method464(local19, local24 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIII)V")
	private void method470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray11[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBIZ)V")
	public void method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) int local8 = arg1 - this.anInt593;
		@Pc(17) int local17 = arg0 - this.anInt589;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method470(local8, local17, 128);
				this.method470(local8, local17 - 1, 8);
			}
			if (arg2 == 1) {
				this.method470(local8, local17, 2);
				this.method470(local8 + 1, local17, 32);
			}
			if (arg2 == 2) {
				this.method470(local8, local17, 8);
				this.method470(local8, local17 + 1, 128);
			}
			if (arg2 == 3) {
				this.method470(local8, local17, 32);
				this.method470(local8 - 1, local17, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method470(local8, local17, 1);
				this.method470(local8 + 1, local17 + -1, 16);
			}
			if (arg2 == 1) {
				this.method470(local8, local17, 4);
				this.method470(local8 + 1, local17 + 1, 64);
			}
			if (arg2 == 2) {
				this.method470(local8, local17, 16);
				this.method470(local8 - 1, local17 + 1, 1);
			}
			if (arg2 == 3) {
				this.method470(local8, local17, 64);
				this.method470(local8 - 1, local17 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method470(local8, local17, 130);
				this.method470(local8, local17 - 1, 8);
				this.method470(local8 + 1, local17, 32);
			}
			if (arg2 == 1) {
				this.method470(local8, local17, 10);
				this.method470(local8 + 1, local17, 32);
				this.method470(local8, local17 + 1, 128);
			}
			if (arg2 == 2) {
				this.method470(local8, local17, 40);
				this.method470(local8, local17 + 1, 128);
				this.method470(local8 - 1, local17, 2);
			}
			if (arg2 == 3) {
				this.method470(local8, local17, 160);
				this.method470(local8 - 1, local17, 2);
				this.method470(local8, local17 - 1, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method470(local8, local17, 65536);
				this.method470(local8, local17 - 1, 4096);
			}
			if (arg2 == 1) {
				this.method470(local8, local17, 1024);
				this.method470(local8 + 1, local17, 16384);
			}
			if (arg2 == 2) {
				this.method470(local8, local17, 4096);
				this.method470(local8, local17 + 1, 65536);
			}
			if (arg2 == 3) {
				this.method470(local8, local17, 16384);
				this.method470(local8 - 1, local17, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method470(local8, local17, 512);
				this.method470(local8 + 1, local17 + -1, 8192);
			}
			if (arg2 == 1) {
				this.method470(local8, local17, 2048);
				this.method470(local8 + 1, local17 - -1, 32768);
			}
			if (arg2 == 2) {
				this.method470(local8, local17, 8192);
				this.method470(local8 - 1, local17 + 1, 512);
			}
			if (arg2 == 3) {
				this.method470(local8, local17, 32768);
				this.method470(local8 - 1, local17 + -1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method470(local8, local17, 66560);
			this.method470(local8, local17 - 1, 4096);
			this.method470(local8 + 1, local17, 16384);
		}
		if (arg2 == 1) {
			this.method470(local8, local17, 5120);
			this.method470(local8 + 1, local17, 16384);
			this.method470(local8, local17 + 1, 65536);
		}
		if (arg2 == 2) {
			this.method470(local8, local17, 20480);
			this.method470(local8, local17 + 1, 65536);
			this.method470(local8 - 1, local17, 1024);
		}
		if (arg2 == 3) {
			this.method470(local8, local17, 81920);
			this.method470(local8 - 1, local17, 1024);
			this.method470(local8, local17 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public void method473() {
		for (@Pc(21) int local21 = 0; local21 < this.anInt576; local21++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt583; local25++) {
				if (local21 == 0 || local25 == 0 || this.anInt576 - 5 <= local21 || this.anInt583 - 5 <= local25) {
					this.anIntArrayArray11[local21][local25] = 16777215;
				} else {
					this.anIntArrayArray11[local21][local25] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZ)V")
	public void method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt593;
		@Pc(13) int local13 = arg1 - this.anInt589;
		this.anIntArrayArray11[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt589;
		@Pc(21) int local21 = arg1 - this.anInt593;
		this.anIntArrayArray11[local16][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIZ)V")
	public void method476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(10) int local10 = arg1 - this.anInt589;
		@Pc(15) int local15 = arg3 - this.anInt593;
		@Pc(17) int local17 = 256;
		if (arg4) {
			local17 = 131328;
		}
		for (@Pc(25) int local25 = local10; local25 < arg2 + local10; local25++) {
			if (local25 >= 0 && local25 < this.anInt576) {
				for (@Pc(44) int local44 = local15; local44 < arg0 + local15; local44++) {
					if (local44 >= 0 && local44 < this.anInt583) {
						this.method470(local44, local25, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIII)V")
	public void method477(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg1 - this.anInt589;
		@Pc(16) int local16 = 256;
		@Pc(24) int local24;
		if (arg5 == 1 || arg5 == 3) {
			local24 = arg4;
			arg4 = arg2;
			arg2 = local24;
		}
		if (arg0) {
			local16 = 131328;
		}
		@Pc(39) int local39 = arg3 - this.anInt593;
		for (local24 = local14; local24 < arg4 + local14; local24++) {
			if (local24 >= 0 && this.anInt576 > local24) {
				for (@Pc(55) int local55 = local39; local55 < local39 + arg2; local55++) {
					if (local55 >= 0 && this.anInt583 > local55) {
						this.method464(local55, local24, local16);
					}
				}
			}
		}
	}
}

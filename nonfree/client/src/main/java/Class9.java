import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	private final int anInt220;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	private final int anInt241;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	private final int anInt233;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	private final int anInt229;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt220 = arg0;
		this.anInt241 = 0;
		this.anInt233 = 0;
		this.anInt229 = arg1;
		this.anIntArrayArray1 = new int[this.anInt220][this.anInt229];
		this.method150();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg0 && arg1 == arg5) {
			return true;
		}
		@Pc(25) int local25 = arg5 - this.anInt233;
		@Pc(30) int local30 = arg2 - this.anInt241;
		@Pc(35) int local35 = arg1 - this.anInt233;
		@Pc(40) int local40 = arg0 - this.anInt241;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local30 + 1 == local40 && local25 == local35 && (this.anIntArrayArray1[local40][local35] & 0x80) == 0) {
					return true;
				}
				if (local40 == local30 && local35 == local25 - 1 && (this.anIntArrayArray1[local40][local35] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 - 1 == local40 && local35 == local25 && (this.anIntArrayArray1[local40][local35] & 0x8) == 0) {
					return true;
				}
				if (local30 == local40 && local25 - 1 == local35 && (this.anIntArrayArray1[local40][local35] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local30 - 1 == local40 && local35 == local25 && (this.anIntArrayArray1[local40][local35] & 0x8) == 0) {
					return true;
				}
				if (local30 == local40 && local35 == local25 + 1 && (this.anIntArrayArray1[local40][local35] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local40 == local30 + 1 && local25 == local35 && (this.anIntArrayArray1[local40][local35] & 0x80) == 0) {
					return true;
				}
				if (local40 == local30 && local35 == local25 + 1 && (this.anIntArrayArray1[local40][local35] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local30 == local40 && local25 + 1 == local35 && (this.anIntArrayArray1[local40][local35] & 0x20) == 0) {
				return true;
			}
			if (local40 == local30 && local25 - 1 == local35 && (this.anIntArrayArray1[local40][local35] & 0x2) == 0) {
				return true;
			}
			if (local30 - 1 == local40 && local35 == local25 && (this.anIntArrayArray1[local40][local35] & 0x8) == 0) {
				return true;
			}
			if (local40 == local30 + 1 && local35 == local25 && (this.anIntArrayArray1[local40][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 == arg5 && arg3 == arg1) {
			return true;
		}
		@Pc(29) int local29 = arg1 - this.anInt233;
		@Pc(34) int local34 = arg3 - this.anInt233;
		@Pc(39) int local39 = arg5 - this.anInt241;
		@Pc(44) int local44 = arg2 - this.anInt241;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (local39 - 1 == local44 && local34 == local29) {
					return true;
				}
				if (local39 == local44 && local29 == local34 + 1 && (this.anIntArrayArray1[local44][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local44 == local39 && local29 == local34 - 1 && (this.anIntArrayArray1[local44][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local44 == local39 && local29 == local34 + 1) {
					return true;
				}
				if (local39 - 1 == local44 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local39 + 1 == local44 && local34 == local29 && (this.anIntArrayArray1[local44][local29] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local39 + 1 == local44 && local34 == local29) {
					return true;
				}
				if (local39 == local44 && local29 == local34 + 1 && (this.anIntArrayArray1[local44][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local44 == local39 && local34 - 1 == local29 && (this.anIntArrayArray1[local44][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local39 == local44 && local34 - 1 == local29) {
					return true;
				}
				if (local44 == local39 - 1 && local34 == local29 && (this.anIntArrayArray1[local44][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local44 == local39 + 1 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				if (local39 - 1 == local44 && local34 == local29) {
					return true;
				}
				if (local44 == local39 && local34 + 1 == local29) {
					return true;
				}
				if (local44 == local39 + 1 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x1280180) == 0) {
					return true;
				}
				if (local39 == local44 && local29 == local34 - 1 && (this.anIntArrayArray1[local44][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local39 - 1 == local44 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local44 == local39 && local34 + 1 == local29) {
					return true;
				}
				if (local39 + 1 == local44 && local29 == local34) {
					return true;
				}
				if (local39 == local44 && local29 == local34 - 1 && (this.anIntArrayArray1[local44][local29] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local44 == local39 - 1 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x1280108) == 0) {
					return true;
				}
				if (local39 == local44 && local34 + 1 == local29 && (this.anIntArrayArray1[local44][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local39 + 1 == local44 && local34 == local29) {
					return true;
				}
				if (local39 == local44 && local29 == local34 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local44 == local39 - 1 && local34 == local29) {
					return true;
				}
				if (local39 == local44 && local34 + 1 == local29 && (this.anIntArrayArray1[local44][local29] & 0x1280120) == 0) {
					return true;
				}
				if (local44 == local39 + 1 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x1280180) == 0) {
					return true;
				}
				if (local44 == local39 && local34 - 1 == local29) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local44 == local39 && local34 + 1 == local29 && (this.anIntArrayArray1[local44][local29] & 0x20) == 0) {
				return true;
			}
			if (local44 == local39 && local29 == local34 - 1 && (this.anIntArrayArray1[local44][local29] & 0x2) == 0) {
				return true;
			}
			if (local39 - 1 == local44 && local29 == local34 && (this.anIntArrayArray1[local44][local29] & 0x8) == 0) {
				return true;
			}
			if (local39 + 1 == local44 && local34 == local29 && (this.anIntArrayArray1[local44][local29] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt233;
		@Pc(17) int local17 = arg0 - this.anInt241;
		this.anIntArrayArray1[local17][local8] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZI)V")
	public void method139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt241;
		@Pc(9) int local9 = arg0 - this.anInt233;
		this.anIntArrayArray1[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZII)V")
	public void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - this.anInt241;
		@Pc(11) int local11 = arg5 - this.anInt233;
		@Pc(17) int local17 = 256;
		@Pc(27) int local27;
		if (arg0 == 1 || arg0 == 3) {
			local27 = arg4;
			arg4 = arg1;
			arg1 = local27;
		}
		if (arg3) {
			local17 = 131328;
		}
		for (local27 = local6; local27 < local6 + arg4; local27++) {
			if (local27 >= 0 && local27 < this.anInt220) {
				for (@Pc(49) int local49 = local11; local49 < arg1 + local11; local49++) {
					if (local49 >= 0 && this.anInt229 > local49) {
						this.method144(local17, local49, local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZII)V")
	public void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 - this.anInt233;
		@Pc(25) int local25 = arg1 - this.anInt241;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method147(local25, local4, 128);
				this.method147(local25 - 1, local4, 8);
			}
			if (arg4 == 1) {
				this.method147(local25, local4, 2);
				this.method147(local25, local4 + 1, 32);
			}
			if (arg4 == 2) {
				this.method147(local25, local4, 8);
				this.method147(local25 + 1, local4, 128);
			}
			if (arg4 == 3) {
				this.method147(local25, local4, 32);
				this.method147(local25, local4 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method147(local25, local4, 1);
				this.method147(local25 - 1, local4 - -1, 16);
			}
			if (arg4 == 1) {
				this.method147(local25, local4, 4);
				this.method147(local25 + 1, local4 - -1, 64);
			}
			if (arg4 == 2) {
				this.method147(local25, local4, 16);
				this.method147(local25 + 1, local4 + -1, 1);
			}
			if (arg4 == 3) {
				this.method147(local25, local4, 64);
				this.method147(local25 - 1, local4 - 1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method147(local25, local4, 130);
				this.method147(local25 - 1, local4, 8);
				this.method147(local25, local4 + 1, 32);
			}
			if (arg4 == 1) {
				this.method147(local25, local4, 10);
				this.method147(local25, local4 + 1, 32);
				this.method147(local25 + 1, local4, 128);
			}
			if (arg4 == 2) {
				this.method147(local25, local4, 40);
				this.method147(local25 + 1, local4, 128);
				this.method147(local25, local4 - 1, 2);
			}
			if (arg4 == 3) {
				this.method147(local25, local4, 160);
				this.method147(local25, local4 - 1, 2);
				this.method147(local25 - 1, local4, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method147(local25, local4, 65536);
				this.method147(local25 - 1, local4, 4096);
			}
			if (arg4 == 1) {
				this.method147(local25, local4, 1024);
				this.method147(local25, local4 + 1, 16384);
			}
			if (arg4 == 2) {
				this.method147(local25, local4, 4096);
				this.method147(local25 + 1, local4, 65536);
			}
			if (arg4 == 3) {
				this.method147(local25, local4, 16384);
				this.method147(local25, local4 - 1, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method147(local25, local4, 512);
				this.method147(local25 - 1, local4 - -1, 8192);
			}
			if (arg4 == 1) {
				this.method147(local25, local4, 2048);
				this.method147(local25 + 1, local4 - -1, 32768);
			}
			if (arg4 == 2) {
				this.method147(local25, local4, 8192);
				this.method147(local25 + 1, local4 + -1, 512);
			}
			if (arg4 == 3) {
				this.method147(local25, local4, 32768);
				this.method147(local25 - 1, local4 - 1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method147(local25, local4, 66560);
			this.method147(local25 - 1, local4, 4096);
			this.method147(local25, local4 + 1, 16384);
		}
		if (arg4 == 1) {
			this.method147(local25, local4, 5120);
			this.method147(local25, local4 + 1, 16384);
			this.method147(local25 + 1, local4, 65536);
		}
		if (arg4 == 2) {
			this.method147(local25, local4, 20480);
			this.method147(local25 + 1, local4, 65536);
			this.method147(local25, local4 - 1, 1024);
		}
		if (arg4 == 3) {
			this.method147(local25, local4, 81920);
			this.method147(local25, local4 - 1, 1024);
			this.method147(local25 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg5 - 1;
		@Pc(16) int local16 = arg4 + arg1 - 1;
		if (arg4 <= arg0 && local16 >= arg0 && arg3 >= arg5 && arg3 <= local9) {
			return true;
		} else if (arg0 == arg4 - 1 && arg3 >= arg5 && arg3 <= local9 && (this.anIntArrayArray1[arg0 - this.anInt241][arg3 - this.anInt233] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local16 + 1 == arg0 && arg3 >= arg5 && arg3 <= local9 && (this.anIntArrayArray1[arg0 - this.anInt241][arg3 - this.anInt233] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg5 - 1 && arg4 <= arg0 && arg0 <= local16 && (this.anIntArrayArray1[arg0 - this.anInt241][arg3 - this.anInt233] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg3 && arg4 <= arg0 && local16 >= arg0 && (this.anIntArrayArray1[arg0 - this.anInt241][arg3 - this.anInt233] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
	private void method144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg1] &= 16777215 - arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZIIIII)V")
	public void method146(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt233;
		@Pc(9) int local9 = arg4 - this.anInt241;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method144(128, local4, local9);
				this.method144(8, local4, local9 - 1);
			}
			if (arg1 == 1) {
				this.method144(2, local4, local9);
				this.method144(32, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method144(8, local4, local9);
				this.method144(128, local4, local9 + 1);
			}
			if (arg1 == 3) {
				this.method144(32, local4, local9);
				this.method144(2, local4 - 1, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method144(1, local4, local9);
				this.method144(16, local4 + 1, local9 + -1);
			}
			if (arg1 == 1) {
				this.method144(4, local4, local9);
				this.method144(64, local4 + 1, local9 - -1);
			}
			if (arg1 == 2) {
				this.method144(16, local4, local9);
				this.method144(1, local4 - 1, local9 + 1);
			}
			if (arg1 == 3) {
				this.method144(64, local4, local9);
				this.method144(4, local4 - 1, local9 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method144(130, local4, local9);
				this.method144(8, local4, local9 - 1);
				this.method144(32, local4 + 1, local9);
			}
			if (arg1 == 1) {
				this.method144(10, local4, local9);
				this.method144(32, local4 + 1, local9);
				this.method144(128, local4, local9 + 1);
			}
			if (arg1 == 2) {
				this.method144(40, local4, local9);
				this.method144(128, local4, local9 + 1);
				this.method144(2, local4 - 1, local9);
			}
			if (arg1 == 3) {
				this.method144(160, local4, local9);
				this.method144(2, local4 - 1, local9);
				this.method144(8, local4, local9 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method144(65536, local4, local9);
				this.method144(4096, local4, local9 - 1);
			}
			if (arg1 == 1) {
				this.method144(1024, local4, local9);
				this.method144(16384, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method144(4096, local4, local9);
				this.method144(65536, local4, local9 + 1);
			}
			if (arg1 == 3) {
				this.method144(16384, local4, local9);
				this.method144(1024, local4 - 1, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method144(512, local4, local9);
				this.method144(8192, local4 + 1, local9 + -1);
			}
			if (arg1 == 1) {
				this.method144(2048, local4, local9);
				this.method144(32768, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method144(8192, local4, local9);
				this.method144(512, local4 - 1, local9 + 1);
			}
			if (arg1 == 3) {
				this.method144(32768, local4, local9);
				this.method144(2048, local4 - 1, local9 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method144(66560, local4, local9);
			this.method144(4096, local4, local9 - 1);
			this.method144(16384, local4 + 1, local9);
		}
		if (arg1 == 1) {
			this.method144(5120, local4, local9);
			this.method144(16384, local4 + 1, local9);
			this.method144(65536, local4, local9 + 1);
		}
		if (arg1 == 2) {
			this.method144(20480, local4, local9);
			this.method144(65536, local4, local9 + 1);
			this.method144(1024, local4 - 1, local9);
		}
		if (arg1 == 3) {
			this.method144(81920, local4, local9);
			this.method144(1024, local4 - 1, local9);
			this.method144(4096, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBI)V")
	private void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZIIII)V")
	public void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg1 - this.anInt241;
		@Pc(11) int local11 = arg4 - this.anInt233;
		@Pc(25) int local25;
		if (arg5 == 1 || arg5 == 3) {
			local25 = arg0;
			arg0 = arg3;
			arg3 = local25;
		}
		@Pc(31) int local31 = 256;
		if (arg2) {
			local31 = 131328;
		}
		for (local25 = local6; local25 < arg0 + local6; local25++) {
			if (local25 >= 0 && this.anInt220 > local25) {
				for (@Pc(56) int local56 = local11; local56 < arg3 + local11; local56++) {
					if (local56 >= 0 && local56 < this.anInt229) {
						this.method147(local25, local56, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public void method150() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt220; local9++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt229; local13++) {
				if (local9 == 0 || local13 == 0 || local9 == this.anInt220 - 1 || local13 == this.anInt229 - 1) {
					this.anIntArrayArray1[local9][local13] = 16777215;
				} else {
					this.anIntArrayArray1[local9][local13] = 16777216;
				}
			}
		}
	}
}

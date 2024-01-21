import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt376 = 363;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt377 = -937;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt378 = -189;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt379 = 2;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt380 = 4;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(III)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt381 = 0;
			this.anInt382 = 0;
			this.anInt383 = arg1;
			this.anInt384 = arg0;
			this.anIntArrayArray10 = new int[this.anInt383][this.anInt384];
			this.method248();
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("6828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public void method248() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt383; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt384; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt383 - 1 || local7 == this.anInt384 - 1) {
						this.anIntArrayArray10[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray10[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("44454, " + true + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIII)V")
	public void method249(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt381;
			@Pc(9) int local9 = arg3 - this.anInt382;
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method252(local4, local9, 128);
					this.method252(local4 - 1, local9, 8);
				}
				if (arg1 == 1) {
					this.method252(local4, local9, 2);
					this.method252(local4, local9 + 1, 32);
				}
				if (arg1 == 2) {
					this.method252(local4, local9, 8);
					this.method252(local4 + 1, local9, 128);
				}
				if (arg1 == 3) {
					this.method252(local4, local9, 32);
					this.method252(local4, local9 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method252(local4, local9, 1);
					this.method252(local4 - 1, local9 + 1, 16);
				}
				if (arg1 == 1) {
					this.method252(local4, local9, 4);
					this.method252(local4 + 1, local9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method252(local4, local9, 16);
					this.method252(local4 + 1, local9 - 1, 1);
				}
				if (arg1 == 3) {
					this.method252(local4, local9, 64);
					this.method252(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method252(local4, local9, 130);
					this.method252(local4 - 1, local9, 8);
					this.method252(local4, local9 + 1, 32);
				}
				if (arg1 == 1) {
					this.method252(local4, local9, 10);
					this.method252(local4, local9 + 1, 32);
					this.method252(local4 + 1, local9, 128);
				}
				if (arg1 == 2) {
					this.method252(local4, local9, 40);
					this.method252(local4 + 1, local9, 128);
					this.method252(local4, local9 - 1, 2);
				}
				if (arg1 == 3) {
					this.method252(local4, local9, 160);
					this.method252(local4, local9 - 1, 2);
					this.method252(local4 - 1, local9, 8);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg1 == 0) {
						this.method252(local4, local9, 65536);
						this.method252(local4 - 1, local9, 4096);
					}
					if (arg1 == 1) {
						this.method252(local4, local9, 1024);
						this.method252(local4, local9 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method252(local4, local9, 4096);
						this.method252(local4 + 1, local9, 65536);
					}
					if (arg1 == 3) {
						this.method252(local4, local9, 16384);
						this.method252(local4, local9 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg1 == 0) {
						this.method252(local4, local9, 512);
						this.method252(local4 - 1, local9 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method252(local4, local9, 2048);
						this.method252(local4 + 1, local9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method252(local4, local9, 8192);
						this.method252(local4 + 1, local9 - 1, 512);
					}
					if (arg1 == 3) {
						this.method252(local4, local9, 32768);
						this.method252(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg1 == 0) {
						this.method252(local4, local9, 66560);
						this.method252(local4 - 1, local9, 4096);
						this.method252(local4, local9 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method252(local4, local9, 5120);
						this.method252(local4, local9 + 1, 16384);
						this.method252(local4 + 1, local9, 65536);
					}
					if (arg1 == 2) {
						this.method252(local4, local9, 20480);
						this.method252(local4 + 1, local9, 65536);
						this.method252(local4, local9 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method252(local4, local9, 81920);
						this.method252(local4, local9 - 1, 1024);
						this.method252(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("34811, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZI)V")
	public void method250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(23) int local23 = arg0 - this.anInt381;
			@Pc(28) int local28 = arg5 - this.anInt382;
			@Pc(36) int local36;
			if (arg3 == 1 || arg3 == 3) {
				local36 = arg1;
				arg1 = arg2;
				arg2 = local36;
			}
			for (local36 = local23; local36 < local23 + arg1; local36++) {
				if (local36 >= 0 && local36 < this.anInt383) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg2; local52++) {
						if (local52 >= 0 && local52 < this.anInt384) {
							this.method252(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("26025, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public void method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt381;
			@Pc(13) int local13 = arg0 - this.anInt382;
			this.anIntArrayArray10[local4][local13] |= 0x200000;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("80923, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	private void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray10[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZ)V")
	public void method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt381;
			@Pc(9) int local9 = arg1 - this.anInt382;
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method255(local9, 484, local4, 128);
					this.method255(local9, 484, local4 - 1, 8);
				}
				if (arg0 == 1) {
					this.method255(local9, 484, local4, 2);
					this.method255(local9 + 1, 484, local4, 32);
				}
				if (arg0 == 2) {
					this.method255(local9, 484, local4, 8);
					this.method255(local9, 484, local4 + 1, 128);
				}
				if (arg0 == 3) {
					this.method255(local9, 484, local4, 32);
					this.method255(local9 - 1, 484, local4, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method255(local9, 484, local4, 1);
					this.method255(local9 + 1, 484, local4 - 1, 16);
				}
				if (arg0 == 1) {
					this.method255(local9, 484, local4, 4);
					this.method255(local9 + 1, 484, local4 + 1, 64);
				}
				if (arg0 == 2) {
					this.method255(local9, 484, local4, 16);
					this.method255(local9 - 1, 484, local4 + 1, 1);
				}
				if (arg0 == 3) {
					this.method255(local9, 484, local4, 64);
					this.method255(local9 - 1, 484, local4 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method255(local9, 484, local4, 130);
					this.method255(local9, 484, local4 - 1, 8);
					this.method255(local9 + 1, 484, local4, 32);
				}
				if (arg0 == 1) {
					this.method255(local9, 484, local4, 10);
					this.method255(local9 + 1, 484, local4, 32);
					this.method255(local9, 484, local4 + 1, 128);
				}
				if (arg0 == 2) {
					this.method255(local9, 484, local4, 40);
					this.method255(local9, 484, local4 + 1, 128);
					this.method255(local9 - 1, 484, local4, 2);
				}
				if (arg0 == 3) {
					this.method255(local9, 484, local4, 160);
					this.method255(local9 - 1, 484, local4, 2);
					this.method255(local9, 484, local4 - 1, 8);
				}
			}
			if (arg4) {
				if (arg2 == 0) {
					if (arg0 == 0) {
						this.method255(local9, 484, local4, 65536);
						this.method255(local9, 484, local4 - 1, 4096);
					}
					if (arg0 == 1) {
						this.method255(local9, 484, local4, 1024);
						this.method255(local9 + 1, 484, local4, 16384);
					}
					if (arg0 == 2) {
						this.method255(local9, 484, local4, 4096);
						this.method255(local9, 484, local4 + 1, 65536);
					}
					if (arg0 == 3) {
						this.method255(local9, 484, local4, 16384);
						this.method255(local9 - 1, 484, local4, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg0 == 0) {
						this.method255(local9, 484, local4, 512);
						this.method255(local9 + 1, 484, local4 - 1, 8192);
					}
					if (arg0 == 1) {
						this.method255(local9, 484, local4, 2048);
						this.method255(local9 + 1, 484, local4 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method255(local9, 484, local4, 8192);
						this.method255(local9 - 1, 484, local4 + 1, 512);
					}
					if (arg0 == 3) {
						this.method255(local9, 484, local4, 32768);
						this.method255(local9 - 1, 484, local4 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg0 == 0) {
						this.method255(local9, 484, local4, 66560);
						this.method255(local9, 484, local4 - 1, 4096);
						this.method255(local9 + 1, 484, local4, 16384);
					}
					if (arg0 == 1) {
						this.method255(local9, 484, local4, 5120);
						this.method255(local9 + 1, 484, local4, 16384);
						this.method255(local9, 484, local4 + 1, 65536);
					}
					if (arg0 == 2) {
						this.method255(local9, 484, local4, 20480);
						this.method255(local9, 484, local4 + 1, 65536);
						this.method255(local9 - 1, 484, local4, 1024);
					}
					if (arg0 == 3) {
						this.method255(local9, 484, local4, 81920);
						this.method255(local9 - 1, 484, local4, 1024);
						this.method255(local9, 484, local4 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("24581, " + arg0 + ", " + arg1 + ", " + -484 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIZIII)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg6 - this.anInt381;
			@Pc(19) int local19 = arg0 - this.anInt382;
			@Pc(27) int local27;
			if (arg4 == 1 || arg4 == 3) {
				local27 = arg1;
				arg1 = arg2;
				arg2 = local27;
			}
			for (local27 = local14; local27 < local14 + arg1; local27++) {
				if (local27 >= 0 && local27 < this.anInt383) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg2; local43++) {
						if (local43 >= 0 && local43 < this.anInt384) {
							this.method255(local43, 484, local27, local3);
						}
					}
				}
			}
			if (arg5 >= 0) {
				this.anInt380 = -243;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("32304, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	private void method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			this.anIntArrayArray10[arg2][arg0] &= 16777215 - arg3;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("44019, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)V")
	public void method256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt381;
			@Pc(9) int local9 = arg0 - this.anInt382;
			this.anIntArrayArray10[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("95534, " + -701 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg2 && arg5 == arg0) {
				return true;
			}
			@Pc(22) int local22 = arg1 - this.anInt381;
			@Pc(27) int local27 = arg5 - this.anInt382;
			@Pc(32) int local32 = arg2 - this.anInt381;
			@Pc(37) int local37 = arg0 - this.anInt382;
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("52739, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg0 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt381;
			@Pc(23) int local23 = arg4 - this.anInt382;
			@Pc(28) int local28 = arg0 - this.anInt381;
			@Pc(33) int local33 = arg3 - this.anInt382;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray10[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray10[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray10[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray10[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray10[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray10[local12][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray10[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray10[local12][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray10[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray10[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray10[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray10[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("15349, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(11) int local11 = arg1 + arg0 - 1;
			@Pc(17) int local17 = arg3 + arg2 - 1;
			if (arg5 >= arg1 && arg5 <= local11 && arg4 >= arg3 && arg4 <= local17) {
				return true;
			} else if (arg5 == arg1 - 1 && arg4 >= arg3 && arg4 <= local17 && (this.anIntArrayArray10[arg5 - this.anInt381][arg4 - this.anInt382] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg5 == local11 + 1 && arg4 >= arg3 && arg4 <= local17 && (this.anIntArrayArray10[arg5 - this.anInt381][arg4 - this.anInt382] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg3 - 1 && arg5 >= arg1 && arg5 <= local11 && (this.anIntArrayArray10[arg5 - this.anInt381][arg4 - this.anInt382] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local17 + 1 && arg5 >= arg1 && arg5 <= local11 && (this.anIntArrayArray10[arg5 - this.anInt381][arg4 - this.anInt382] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("45585, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 406 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}

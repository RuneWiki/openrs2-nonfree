import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IBI)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt360 = 0;
			this.anInt361 = 0;
			this.anInt362 = arg2;
			this.anInt363 = arg0;
			this.anIntArrayArray10 = new int[this.anInt362][this.anInt363];
			this.method237();
			@Pc(34) boolean local34 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("83628, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method237() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt362; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt363; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt362 - 1 || local7 == this.anInt363 - 1) {
						this.anIntArrayArray10[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray10[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("75905, " + 652 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIZI)V")
	public void method238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt360;
			@Pc(23) int local23 = arg1 - this.anInt361;
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method241(local4, local23, 128);
					this.method241(local4 - 1, local23, 8);
				}
				if (arg0 == 1) {
					this.method241(local4, local23, 2);
					this.method241(local4, local23 + 1, 32);
				}
				if (arg0 == 2) {
					this.method241(local4, local23, 8);
					this.method241(local4 + 1, local23, 128);
				}
				if (arg0 == 3) {
					this.method241(local4, local23, 32);
					this.method241(local4, local23 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method241(local4, local23, 1);
					this.method241(local4 - 1, local23 + 1, 16);
				}
				if (arg0 == 1) {
					this.method241(local4, local23, 4);
					this.method241(local4 + 1, local23 + 1, 64);
				}
				if (arg0 == 2) {
					this.method241(local4, local23, 16);
					this.method241(local4 + 1, local23 - 1, 1);
				}
				if (arg0 == 3) {
					this.method241(local4, local23, 64);
					this.method241(local4 - 1, local23 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method241(local4, local23, 130);
					this.method241(local4 - 1, local23, 8);
					this.method241(local4, local23 + 1, 32);
				}
				if (arg0 == 1) {
					this.method241(local4, local23, 10);
					this.method241(local4, local23 + 1, 32);
					this.method241(local4 + 1, local23, 128);
				}
				if (arg0 == 2) {
					this.method241(local4, local23, 40);
					this.method241(local4 + 1, local23, 128);
					this.method241(local4, local23 - 1, 2);
				}
				if (arg0 == 3) {
					this.method241(local4, local23, 160);
					this.method241(local4, local23 - 1, 2);
					this.method241(local4 - 1, local23, 8);
				}
			}
			if (arg3) {
				if (arg4 == 0) {
					if (arg0 == 0) {
						this.method241(local4, local23, 65536);
						this.method241(local4 - 1, local23, 4096);
					}
					if (arg0 == 1) {
						this.method241(local4, local23, 1024);
						this.method241(local4, local23 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method241(local4, local23, 4096);
						this.method241(local4 + 1, local23, 65536);
					}
					if (arg0 == 3) {
						this.method241(local4, local23, 16384);
						this.method241(local4, local23 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg0 == 0) {
						this.method241(local4, local23, 512);
						this.method241(local4 - 1, local23 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method241(local4, local23, 2048);
						this.method241(local4 + 1, local23 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method241(local4, local23, 8192);
						this.method241(local4 + 1, local23 - 1, 512);
					}
					if (arg0 == 3) {
						this.method241(local4, local23, 32768);
						this.method241(local4 - 1, local23 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg0 == 0) {
						this.method241(local4, local23, 66560);
						this.method241(local4 - 1, local23, 4096);
						this.method241(local4, local23 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method241(local4, local23, 5120);
						this.method241(local4, local23 + 1, 16384);
						this.method241(local4 + 1, local23, 65536);
					}
					if (arg0 == 2) {
						this.method241(local4, local23, 20480);
						this.method241(local4 + 1, local23, 65536);
						this.method241(local4, local23 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method241(local4, local23, 81920);
						this.method241(local4, local23 - 1, 1024);
						this.method241(local4 - 1, local23, 4096);
						return;
					}
				}
			}
		} catch (@Pc(475) RuntimeException local475) {
			signlink.reporterror("56751, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local475.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZIZII)V")
	public void method239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			@Pc(7) int local7;
			if (!arg4) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			if (arg2) {
				local3 = 131328;
			}
			@Pc(23) int local23 = arg3 - this.anInt360;
			@Pc(28) int local28 = arg0 - this.anInt361;
			if (arg6 == 1 || arg6 == 3) {
				local7 = arg1;
				arg1 = arg5;
				arg5 = local7;
			}
			for (local7 = local23; local7 < local23 + arg1; local7++) {
				if (local7 >= 0 && local7 < this.anInt362) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg5; local52++) {
						if (local52 >= 0 && local52 < this.anInt363) {
							this.method241(local7, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("49375, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZI)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt360;
			@Pc(12) int local12 = arg0 - this.anInt361;
			this.anIntArrayArray10[local4][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("41763, " + arg0 + ", " + true + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	private void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray10[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIIZI)V")
	public void method242(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt360;
			@Pc(19) int local19 = arg0 - this.anInt361;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method244(128, local4, local19);
					this.method244(8, local4 - 1, local19);
				}
				if (arg4 == 1) {
					this.method244(2, local4, local19);
					this.method244(32, local4, local19 + 1);
				}
				if (arg4 == 2) {
					this.method244(8, local4, local19);
					this.method244(128, local4 + 1, local19);
				}
				if (arg4 == 3) {
					this.method244(32, local4, local19);
					this.method244(2, local4, local19 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method244(1, local4, local19);
					this.method244(16, local4 - 1, local19 + 1);
				}
				if (arg4 == 1) {
					this.method244(4, local4, local19);
					this.method244(64, local4 + 1, local19 + 1);
				}
				if (arg4 == 2) {
					this.method244(16, local4, local19);
					this.method244(1, local4 + 1, local19 - 1);
				}
				if (arg4 == 3) {
					this.method244(64, local4, local19);
					this.method244(4, local4 - 1, local19 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method244(130, local4, local19);
					this.method244(8, local4 - 1, local19);
					this.method244(32, local4, local19 + 1);
				}
				if (arg4 == 1) {
					this.method244(10, local4, local19);
					this.method244(32, local4, local19 + 1);
					this.method244(128, local4 + 1, local19);
				}
				if (arg4 == 2) {
					this.method244(40, local4, local19);
					this.method244(128, local4 + 1, local19);
					this.method244(2, local4, local19 - 1);
				}
				if (arg4 == 3) {
					this.method244(160, local4, local19);
					this.method244(2, local4, local19 - 1);
					this.method244(8, local4 - 1, local19);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method244(65536, local4, local19);
						this.method244(4096, local4 - 1, local19);
					}
					if (arg4 == 1) {
						this.method244(1024, local4, local19);
						this.method244(16384, local4, local19 + 1);
					}
					if (arg4 == 2) {
						this.method244(4096, local4, local19);
						this.method244(65536, local4 + 1, local19);
					}
					if (arg4 == 3) {
						this.method244(16384, local4, local19);
						this.method244(1024, local4, local19 - 1);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method244(512, local4, local19);
						this.method244(8192, local4 - 1, local19 + 1);
					}
					if (arg4 == 1) {
						this.method244(2048, local4, local19);
						this.method244(32768, local4 + 1, local19 + 1);
					}
					if (arg4 == 2) {
						this.method244(8192, local4, local19);
						this.method244(512, local4 + 1, local19 - 1);
					}
					if (arg4 == 3) {
						this.method244(32768, local4, local19);
						this.method244(2048, local4 - 1, local19 - 1);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method244(66560, local4, local19);
						this.method244(4096, local4 - 1, local19);
						this.method244(16384, local4, local19 + 1);
					}
					if (arg4 == 1) {
						this.method244(5120, local4, local19);
						this.method244(16384, local4, local19 + 1);
						this.method244(65536, local4 + 1, local19);
					}
					if (arg4 == 2) {
						this.method244(20480, local4, local19);
						this.method244(65536, local4 + 1, local19);
						this.method244(1024, local4, local19 - 1);
					}
					if (arg4 == 3) {
						this.method244(81920, local4, local19);
						this.method244(1024, local4, local19 - 1);
						this.method244(4096, local4 - 1, local19);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("70281, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIZIII)V")
	public void method243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(10) int local10 = 256;
			if (arg2) {
				local10 = 131328;
			}
			@Pc(21) int local21 = arg1 - this.anInt360;
			@Pc(26) int local26 = arg5 - this.anInt361;
			@Pc(34) int local34;
			if (arg4 == 1 || arg4 == 3) {
				local34 = arg3;
				arg3 = arg0;
				arg0 = local34;
			}
			for (local34 = local21; local34 < local21 + arg3; local34++) {
				if (local34 >= 0 && local34 < this.anInt362) {
					for (@Pc(50) int local50 = local26; local50 < local26 + arg0; local50++) {
						if (local50 >= 0 && local50 < this.anInt363) {
							this.method244(local10, local34, local50);
						}
					}
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("27046, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	private void method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray10[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("44960, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 965 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	public void method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt360;
			@Pc(9) int local9 = arg0 - this.anInt361;
			this.anIntArrayArray10[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("94460, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg2 && arg3 == arg5) {
				return true;
			}
			@Pc(22) int local22 = arg0 - this.anInt360;
			@Pc(27) int local27 = arg3 - this.anInt361;
			@Pc(32) int local32 = arg2 - this.anInt360;
			@Pc(37) int local37 = arg5 - this.anInt361;
			if (arg4 == 0) {
				if (arg1 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray10[local22][local27] & 0x280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray10[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray10[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
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
				if (arg1 == 0) {
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
				} else if (arg1 == 1) {
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
				} else if (arg1 == 2) {
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
				} else if (arg1 == 3) {
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
			signlink.reporterror("59974, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg4 && arg5 == arg1) {
				return true;
			}
			@Pc(18) int local18 = arg3 - this.anInt360;
			@Pc(23) int local23 = arg5 - this.anInt361;
			@Pc(28) int local28 = arg4 - this.anInt360;
			@Pc(33) int local33 = arg1 - this.anInt361;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray10[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray10[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray10[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray10[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray10[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray10[local18][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray10[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray10[local18][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray10[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray10[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray10[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray10[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("15161, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 219 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg0 + arg6 - 1;
			@Pc(16) int local16 = arg1 + arg4 - 1;
			if (arg3 >= arg0 && arg3 <= local10 && arg2 >= arg1 && arg2 <= local16) {
				return true;
			} else if (arg3 == arg0 - 1 && arg2 >= arg1 && arg2 <= local16 && (this.anIntArrayArray10[arg3 - this.anInt360][arg2 - this.anInt361] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg3 == local10 + 1 && arg2 >= arg1 && arg2 <= local16 && (this.anIntArrayArray10[arg3 - this.anInt360][arg2 - this.anInt361] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg2 == arg1 - 1 && arg3 >= arg0 && arg3 <= local10 && (this.anIntArrayArray10[arg3 - this.anInt360][arg2 - this.anInt361] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local16 + 1 && arg3 >= arg0 && arg3 <= local10 && (this.anIntArrayArray10[arg3 - this.anInt360][arg2 - this.anInt361] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("21844, " + arg0 + ", " + arg1 + ", " + -100 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt373 = -3154;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "B")
	private byte aByte28 = 77;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt374 = 43166;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIZ)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt375 = 0;
			this.anInt376 = 0;
			this.anInt377 = arg1;
			this.anInt378 = arg0;
			this.anIntArrayArray10 = new int[this.anInt377][this.anInt378];
			this.method248();
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("25808, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method248() {
		try {
			for (@Pc(15) int local15 = 0; local15 < this.anInt377; local15++) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt378; local19++) {
					if (local15 == 0 || local19 == 0 || local15 == this.anInt377 - 1 || local19 == this.anInt378 - 1) {
						this.anIntArrayArray10[local15][local19] = 16777215;
					} else {
						this.anIntArrayArray10[local15][local19] = 0;
					}
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("46925, " + -999 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIZII)V")
	public void method249(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt375;
			@Pc(14) int local14 = arg2 - this.anInt376;
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method252(local4, local14, 128);
					this.method252(local4 - 1, local14, 8);
				}
				if (arg1 == 1) {
					this.method252(local4, local14, 2);
					this.method252(local4, local14 + 1, 32);
				}
				if (arg1 == 2) {
					this.method252(local4, local14, 8);
					this.method252(local4 + 1, local14, 128);
				}
				if (arg1 == 3) {
					this.method252(local4, local14, 32);
					this.method252(local4, local14 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method252(local4, local14, 1);
					this.method252(local4 - 1, local14 + 1, 16);
				}
				if (arg1 == 1) {
					this.method252(local4, local14, 4);
					this.method252(local4 + 1, local14 + 1, 64);
				}
				if (arg1 == 2) {
					this.method252(local4, local14, 16);
					this.method252(local4 + 1, local14 - 1, 1);
				}
				if (arg1 == 3) {
					this.method252(local4, local14, 64);
					this.method252(local4 - 1, local14 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method252(local4, local14, 130);
					this.method252(local4 - 1, local14, 8);
					this.method252(local4, local14 + 1, 32);
				}
				if (arg1 == 1) {
					this.method252(local4, local14, 10);
					this.method252(local4, local14 + 1, 32);
					this.method252(local4 + 1, local14, 128);
				}
				if (arg1 == 2) {
					this.method252(local4, local14, 40);
					this.method252(local4 + 1, local14, 128);
					this.method252(local4, local14 - 1, 2);
				}
				if (arg1 == 3) {
					this.method252(local4, local14, 160);
					this.method252(local4, local14 - 1, 2);
					this.method252(local4 - 1, local14, 8);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg1 == 0) {
						this.method252(local4, local14, 65536);
						this.method252(local4 - 1, local14, 4096);
					}
					if (arg1 == 1) {
						this.method252(local4, local14, 1024);
						this.method252(local4, local14 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method252(local4, local14, 4096);
						this.method252(local4 + 1, local14, 65536);
					}
					if (arg1 == 3) {
						this.method252(local4, local14, 16384);
						this.method252(local4, local14 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg1 == 0) {
						this.method252(local4, local14, 512);
						this.method252(local4 - 1, local14 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method252(local4, local14, 2048);
						this.method252(local4 + 1, local14 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method252(local4, local14, 8192);
						this.method252(local4 + 1, local14 - 1, 512);
					}
					if (arg1 == 3) {
						this.method252(local4, local14, 32768);
						this.method252(local4 - 1, local14 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg1 == 0) {
						this.method252(local4, local14, 66560);
						this.method252(local4 - 1, local14, 4096);
						this.method252(local4, local14 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method252(local4, local14, 5120);
						this.method252(local4, local14 + 1, 16384);
						this.method252(local4 + 1, local14, 65536);
					}
					if (arg1 == 2) {
						this.method252(local4, local14, 20480);
						this.method252(local4 + 1, local14, 65536);
						this.method252(local4, local14 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method252(local4, local14, 81920);
						this.method252(local4, local14 - 1, 1024);
						this.method252(local4 - 1, local14, 4096);
						return;
					}
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("88384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIIII)V")
	public void method250(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(13) int local13 = 256;
			if (arg0) {
				local13 = 131328;
			}
			@Pc(24) int local24 = arg1 - this.anInt375;
			@Pc(29) int local29 = arg5 - this.anInt376;
			@Pc(37) int local37;
			if (arg3 == 1 || arg3 == 3) {
				local37 = arg2;
				arg2 = arg4;
				arg4 = local37;
			}
			for (local37 = local24; local37 < local24 + arg2; local37++) {
				if (local37 >= 0 && local37 < this.anInt377) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg4; local53++) {
						if (local53 >= 0 && local53 < this.anInt378) {
							this.method252(local37, local53, local13);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("89972, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 242 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public void method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt375;
			@Pc(9) int local9 = arg0 - this.anInt376;
			if (arg2 < 0) {
				this.anIntArrayArray10[local4][local9] |= 0x200000;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("31830, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	private void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray10[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIII)V")
	public void method253(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt375;
			@Pc(9) int local9 = arg1 - this.anInt376;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method255(local4, 128, local9);
					this.method255(local4 - 1, 8, local9);
				}
				if (arg4 == 1) {
					this.method255(local4, 2, local9);
					this.method255(local4, 32, local9 + 1);
				}
				if (arg4 == 2) {
					this.method255(local4, 8, local9);
					this.method255(local4 + 1, 128, local9);
				}
				if (arg4 == 3) {
					this.method255(local4, 32, local9);
					this.method255(local4, 2, local9 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method255(local4, 1, local9);
					this.method255(local4 - 1, 16, local9 + 1);
				}
				if (arg4 == 1) {
					this.method255(local4, 4, local9);
					this.method255(local4 + 1, 64, local9 + 1);
				}
				if (arg4 == 2) {
					this.method255(local4, 16, local9);
					this.method255(local4 + 1, 1, local9 - 1);
				}
				if (arg4 == 3) {
					this.method255(local4, 64, local9);
					this.method255(local4 - 1, 4, local9 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method255(local4, 130, local9);
					this.method255(local4 - 1, 8, local9);
					this.method255(local4, 32, local9 + 1);
				}
				if (arg4 == 1) {
					this.method255(local4, 10, local9);
					this.method255(local4, 32, local9 + 1);
					this.method255(local4 + 1, 128, local9);
				}
				if (arg4 == 2) {
					this.method255(local4, 40, local9);
					this.method255(local4 + 1, 128, local9);
					this.method255(local4, 2, local9 - 1);
				}
				if (arg4 == 3) {
					this.method255(local4, 160, local9);
					this.method255(local4, 2, local9 - 1);
					this.method255(local4 - 1, 8, local9);
				}
			}
			if (arg0) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method255(local4, 65536, local9);
						this.method255(local4 - 1, 4096, local9);
					}
					if (arg4 == 1) {
						this.method255(local4, 1024, local9);
						this.method255(local4, 16384, local9 + 1);
					}
					if (arg4 == 2) {
						this.method255(local4, 4096, local9);
						this.method255(local4 + 1, 65536, local9);
					}
					if (arg4 == 3) {
						this.method255(local4, 16384, local9);
						this.method255(local4, 1024, local9 - 1);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method255(local4, 512, local9);
						this.method255(local4 - 1, 8192, local9 + 1);
					}
					if (arg4 == 1) {
						this.method255(local4, 2048, local9);
						this.method255(local4 + 1, 32768, local9 + 1);
					}
					if (arg4 == 2) {
						this.method255(local4, 8192, local9);
						this.method255(local4 + 1, 512, local9 - 1);
					}
					if (arg4 == 3) {
						this.method255(local4, 32768, local9);
						this.method255(local4 - 1, 2048, local9 - 1);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method255(local4, 66560, local9);
						this.method255(local4 - 1, 4096, local9);
						this.method255(local4, 16384, local9 + 1);
					}
					if (arg4 == 1) {
						this.method255(local4, 5120, local9);
						this.method255(local4, 16384, local9 + 1);
						this.method255(local4 + 1, 65536, local9);
					}
					if (arg4 == 2) {
						this.method255(local4, 20480, local9);
						this.method255(local4 + 1, 65536, local9);
						this.method255(local4, 1024, local9 - 1);
					}
					if (arg4 == 3) {
						this.method255(local4, 81920, local9);
						this.method255(local4, 1024, local9 - 1);
						this.method255(local4 - 1, 4096, local9);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("65744, " + arg0 + ", " + 477 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZI)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(12) int local12 = 256;
			if (arg4) {
				local12 = 131328;
			}
			@Pc(23) int local23 = arg2 - this.anInt375;
			@Pc(28) int local28 = arg3 - this.anInt376;
			@Pc(36) int local36;
			if (arg0 == 1 || arg0 == 3) {
				local36 = arg1;
				arg1 = arg5;
				arg5 = local36;
			}
			for (local36 = local23; local36 < local23 + arg1; local36++) {
				if (local36 >= 0 && local36 < this.anInt377) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg5; local52++) {
						if (local52 >= 0 && local52 < this.anInt378) {
							this.method255(local36, local12, local52);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("75094, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	private void method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray10[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("28328, " + arg0 + ", " + arg1 + ", " + -44894 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)V")
	public void method256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt375;
			@Pc(9) int local9 = arg0 - this.anInt376;
			this.anIntArrayArray10[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("69193, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg5 == arg1 && arg2 == arg0) {
				return true;
			}
			@Pc(16) int local16 = arg5 - this.anInt375;
			@Pc(21) int local21 = arg2 - this.anInt376;
			@Pc(26) int local26 = arg1 - this.anInt375;
			@Pc(31) int local31 = arg0 - this.anInt376;
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local16 == local26 - 1 && local21 == local31) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray10[local16][local21] & 0x280120) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray10[local16][local21] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local16 == local26 && local21 == local31 + 1) {
						return true;
					}
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280108) == 0) {
						return true;
					}
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local16 == local26 + 1 && local21 == local31) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray10[local16][local21] & 0x280120) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray10[local16][local21] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local16 == local26 && local21 == local31 - 1) {
						return true;
					}
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280108) == 0) {
						return true;
					}
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local16 == local26 - 1 && local21 == local31) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1) {
						return true;
					}
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280180) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray10[local16][local21] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280108) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1) {
						return true;
					}
					if (local16 == local26 + 1 && local21 == local31) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray10[local16][local21] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280108) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray10[local16][local21] & 0x280120) == 0) {
						return true;
					}
					if (local16 == local26 + 1 && local21 == local31) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local16 == local26 - 1 && local21 == local31) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray10[local16][local21] & 0x280120) == 0) {
						return true;
					}
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x280180) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray10[local16][local21] & 0x20) == 0) {
					return true;
				}
				if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray10[local16][local21] & 0x2) == 0) {
					return true;
				}
				if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x8) == 0) {
					return true;
				}
				if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray10[local16][local21] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(564) RuntimeException local564) {
			signlink.reporterror("70485, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local564.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 == arg0 && arg1 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt375;
			if (arg2 != 4) {
				throw new NullPointerException();
			}
			@Pc(24) int local24 = arg1 - this.anInt376;
			@Pc(29) int local29 = arg0 - this.anInt375;
			@Pc(34) int local34 = arg4 - this.anInt376;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray10[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray10[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray10[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray10[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray10[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray10[local12][local24] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray10[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray10[local12][local24] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray10[local12][local24] & 0x20) == 0) {
					return true;
				}
				if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray10[local12][local24] & 0x2) == 0) {
					return true;
				}
				if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray10[local12][local24] & 0x8) == 0) {
					return true;
				}
				if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray10[local12][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("89075, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg6 - 1;
			@Pc(11) int local11 = arg2 + arg5 - 1;
			if (arg0 >= arg3 && arg0 <= local5 && arg1 >= arg2 && arg1 <= local11) {
				return true;
			} else if (arg0 == arg3 - 1 && arg1 >= arg2 && arg1 <= local11 && (this.anIntArrayArray10[arg0 - this.anInt375][arg1 - this.anInt376] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg0 == local5 + 1 && arg1 >= arg2 && arg1 <= local11 && (this.anIntArrayArray10[arg0 - this.anInt375][arg1 - this.anInt376] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg2 - 1 && arg0 >= arg3 && arg0 <= local5 && (this.anIntArrayArray10[arg0 - this.anInt375][arg1 - this.anInt376] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local11 + 1 && arg0 >= arg3 && arg0 <= local5 && (this.anIntArrayArray10[arg0 - this.anInt375][arg1 - this.anInt376] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("31073, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}
}

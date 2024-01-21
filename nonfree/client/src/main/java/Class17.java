import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ic")
public final class Class17 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private int anInt659 = -584;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "B")
	private byte aByte37 = 84;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ZII)V")
	public Class17(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt660 = 0;
			this.anInt661 = 0;
			this.anInt662 = arg2;
			this.anInt663 = arg1;
			this.anIntArrayArray15 = new int[this.anInt662][this.anInt663];
			this.method369(this.anInt658);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("3247, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public void method369(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt662; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt663; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt662 - 1 || local7 == this.anInt663 - 1) {
						this.anIntArrayArray15[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray15[local3][local7] = 0;
					}
				}
			}
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("51334, " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIZ)V")
	public void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(7) int local7 = arg3 - this.anInt660;
			@Pc(12) int local12 = arg2 - this.anInt661;
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method373(local7, local12, 128);
					this.method373(local7 - 1, local12, 8);
				}
				if (arg0 == 1) {
					this.method373(local7, local12, 2);
					this.method373(local7, local12 + 1, 32);
				}
				if (arg0 == 2) {
					this.method373(local7, local12, 8);
					this.method373(local7 + 1, local12, 128);
				}
				if (arg0 == 3) {
					this.method373(local7, local12, 32);
					this.method373(local7, local12 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method373(local7, local12, 1);
					this.method373(local7 - 1, local12 + 1, 16);
				}
				if (arg0 == 1) {
					this.method373(local7, local12, 4);
					this.method373(local7 + 1, local12 + 1, 64);
				}
				if (arg0 == 2) {
					this.method373(local7, local12, 16);
					this.method373(local7 + 1, local12 - 1, 1);
				}
				if (arg0 == 3) {
					this.method373(local7, local12, 64);
					this.method373(local7 - 1, local12 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method373(local7, local12, 130);
					this.method373(local7 - 1, local12, 8);
					this.method373(local7, local12 + 1, 32);
				}
				if (arg0 == 1) {
					this.method373(local7, local12, 10);
					this.method373(local7, local12 + 1, 32);
					this.method373(local7 + 1, local12, 128);
				}
				if (arg0 == 2) {
					this.method373(local7, local12, 40);
					this.method373(local7 + 1, local12, 128);
					this.method373(local7, local12 - 1, 2);
				}
				if (arg0 == 3) {
					this.method373(local7, local12, 160);
					this.method373(local7, local12 - 1, 2);
					this.method373(local7 - 1, local12, 8);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg0 == 0) {
						this.method373(local7, local12, 65536);
						this.method373(local7 - 1, local12, 4096);
					}
					if (arg0 == 1) {
						this.method373(local7, local12, 1024);
						this.method373(local7, local12 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method373(local7, local12, 4096);
						this.method373(local7 + 1, local12, 65536);
					}
					if (arg0 == 3) {
						this.method373(local7, local12, 16384);
						this.method373(local7, local12 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg0 == 0) {
						this.method373(local7, local12, 512);
						this.method373(local7 - 1, local12 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method373(local7, local12, 2048);
						this.method373(local7 + 1, local12 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method373(local7, local12, 8192);
						this.method373(local7 + 1, local12 - 1, 512);
					}
					if (arg0 == 3) {
						this.method373(local7, local12, 32768);
						this.method373(local7 - 1, local12 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg0 == 0) {
						this.method373(local7, local12, 66560);
						this.method373(local7 - 1, local12, 4096);
						this.method373(local7, local12 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method373(local7, local12, 5120);
						this.method373(local7, local12 + 1, 16384);
						this.method373(local7 + 1, local12, 65536);
					}
					if (arg0 == 2) {
						this.method373(local7, local12, 20480);
						this.method373(local7 + 1, local12, 65536);
						this.method373(local7, local12 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method373(local7, local12, 81920);
						this.method373(local7, local12 - 1, 1024);
						this.method373(local7 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("75023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -8 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZIIII)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt660;
			@Pc(19) int local19 = arg5 - this.anInt661;
			@Pc(32) int local32;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg1;
				arg1 = arg4;
				arg4 = local32;
			}
			for (local32 = local14; local32 < local14 + arg1; local32++) {
				if (local32 >= 0 && local32 < this.anInt662) {
					for (@Pc(48) int local48 = local19; local48 < local19 + arg4; local48++) {
						if (local48 >= 0 && local48 < this.anInt663) {
							this.method373(local32, local48, local3);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("9836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -584 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZI)V")
	public void method372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg0 - this.anInt660;
			@Pc(18) int local18 = arg1 - this.anInt661;
			this.anIntArrayArray15[local13][local18] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("85862, " + arg0 + ", " + false + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	private void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIIII)V")
	public void method374(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(13) int local13 = arg3 - this.anInt660;
			@Pc(18) int local18 = arg4 - this.anInt661;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method376(local18, local13, 128);
					this.method376(local18, local13 - 1, 8);
				}
				if (arg2 == 1) {
					this.method376(local18, local13, 2);
					this.method376(local18 + 1, local13, 32);
				}
				if (arg2 == 2) {
					this.method376(local18, local13, 8);
					this.method376(local18, local13 + 1, 128);
				}
				if (arg2 == 3) {
					this.method376(local18, local13, 32);
					this.method376(local18 - 1, local13, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method376(local18, local13, 1);
					this.method376(local18 + 1, local13 - 1, 16);
				}
				if (arg2 == 1) {
					this.method376(local18, local13, 4);
					this.method376(local18 + 1, local13 + 1, 64);
				}
				if (arg2 == 2) {
					this.method376(local18, local13, 16);
					this.method376(local18 - 1, local13 + 1, 1);
				}
				if (arg2 == 3) {
					this.method376(local18, local13, 64);
					this.method376(local18 - 1, local13 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method376(local18, local13, 130);
					this.method376(local18, local13 - 1, 8);
					this.method376(local18 + 1, local13, 32);
				}
				if (arg2 == 1) {
					this.method376(local18, local13, 10);
					this.method376(local18 + 1, local13, 32);
					this.method376(local18, local13 + 1, 128);
				}
				if (arg2 == 2) {
					this.method376(local18, local13, 40);
					this.method376(local18, local13 + 1, 128);
					this.method376(local18 - 1, local13, 2);
				}
				if (arg2 == 3) {
					this.method376(local18, local13, 160);
					this.method376(local18 - 1, local13, 2);
					this.method376(local18, local13 - 1, 8);
				}
			}
			if (arg0) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method376(local18, local13, 65536);
						this.method376(local18, local13 - 1, 4096);
					}
					if (arg2 == 1) {
						this.method376(local18, local13, 1024);
						this.method376(local18 + 1, local13, 16384);
					}
					if (arg2 == 2) {
						this.method376(local18, local13, 4096);
						this.method376(local18, local13 + 1, 65536);
					}
					if (arg2 == 3) {
						this.method376(local18, local13, 16384);
						this.method376(local18 - 1, local13, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method376(local18, local13, 512);
						this.method376(local18 + 1, local13 - 1, 8192);
					}
					if (arg2 == 1) {
						this.method376(local18, local13, 2048);
						this.method376(local18 + 1, local13 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method376(local18, local13, 8192);
						this.method376(local18 - 1, local13 + 1, 512);
					}
					if (arg2 == 3) {
						this.method376(local18, local13, 32768);
						this.method376(local18 - 1, local13 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method376(local18, local13, 66560);
						this.method376(local18, local13 - 1, 4096);
						this.method376(local18 + 1, local13, 16384);
					}
					if (arg2 == 1) {
						this.method376(local18, local13, 5120);
						this.method376(local18 + 1, local13, 16384);
						this.method376(local18, local13 + 1, 65536);
					}
					if (arg2 == 2) {
						this.method376(local18, local13, 20480);
						this.method376(local18, local13 + 1, 65536);
						this.method376(local18 - 1, local13, 1024);
					}
					if (arg2 == 3) {
						this.method376(local18, local13, 81920);
						this.method376(local18 - 1, local13, 1024);
						this.method376(local18, local13 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(526) RuntimeException local526) {
			signlink.reporterror("28107, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local526.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBIZIII)V")
	public void method375(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt660;
			@Pc(19) int local19 = arg6 - this.anInt661;
			@Pc(27) int local27;
			if (arg2 == 1 || arg2 == 3) {
				local27 = arg0;
				arg0 = arg5;
				arg5 = local27;
			}
			for (local27 = local14; local27 < local14 + arg0; local27++) {
				if (local27 >= 0 && local27 < this.anInt662) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg5; local43++) {
						if (local43 >= 0 && local43 < this.anInt663) {
							this.method376(local43, local27, local3);
						}
					}
				}
			}
			@Pc(74) boolean local74 = false;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("5404, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	private void method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray15[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("31228, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -195 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
	public void method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt660;
			@Pc(9) int local9 = arg1 - this.anInt661;
			this.anIntArrayArray15[local4][local9] &= 0xDFFFFF;
			if (arg0 != 0) {
				this.aBoolean136 = !this.aBoolean136;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("39184, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg5 && arg3 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt660;
			@Pc(17) int local17 = arg3 - this.anInt661;
			@Pc(22) int local22 = arg5 - this.anInt660;
			@Pc(34) int local34 = arg0 - this.anInt661;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray15[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray15[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray15[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray15[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray15[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray15[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray15[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray15[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("26542, " + -324 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 == arg3 && arg0 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg6 - this.anInt660;
			@Pc(17) int local17 = arg0 - this.anInt661;
			@Pc(22) int local22 = arg3 - this.anInt660;
			if (!arg4) {
				this.anInt659 = 376;
			}
			@Pc(32) int local32 = arg1 - this.anInt661;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("12552, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(16) int local16 = arg2 + arg5 - 1;
			@Pc(22) int local22 = arg3 + arg6 - 1;
			if (arg0 >= arg2 && arg0 <= local16 && arg4 >= arg3 && arg4 <= local22) {
				return true;
			} else if (arg0 == arg2 - 1 && arg4 >= arg3 && arg4 <= local22 && (this.anIntArrayArray15[arg0 - this.anInt660][arg4 - this.anInt661] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg0 == local16 + 1 && arg4 >= arg3 && arg4 <= local22 && (this.anIntArrayArray15[arg0 - this.anInt660][arg4 - this.anInt661] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg3 - 1 && arg0 >= arg2 && arg0 <= local16 && (this.anIntArrayArray15[arg0 - this.anInt660][arg4 - this.anInt661] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local22 + 1 && arg0 >= arg2 && arg0 <= local16 && (this.anIntArrayArray15[arg0 - this.anInt660][arg4 - this.anInt661] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("53651, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -14 + ", " + arg5 + ", " + arg6 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}

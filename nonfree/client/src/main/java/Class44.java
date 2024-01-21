import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WWMUUFBO")
public final class Class44 {

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!WWMUUFBO", name = "c", descriptor = "I")
	private int anInt721;

	@OriginalMember(owner = "client!WWMUUFBO", name = "b", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!WWMUUFBO", name = "d", descriptor = "B")
	private byte aByte19 = 4;

	@OriginalMember(owner = "client!WWMUUFBO", name = "e", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!WWMUUFBO", name = "f", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!WWMUUFBO", name = "g", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!WWMUUFBO", name = "h", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!WWMUUFBO", name = "i", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!WWMUUFBO", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!WWMUUFBO", name = "<init>", descriptor = "(III)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt722 = 0;
			this.anInt723 = 0;
			this.anInt724 = arg0;
			this.anInt725 = arg2;
			this.anIntArrayArray16 = new int[this.anInt724][this.anInt725];
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			this.method487();
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("80951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "()V")
	public void method487() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt724; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt725; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt724 - 1 || local7 == this.anInt725 - 1) {
					this.anIntArrayArray16[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray16[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(IIIIIZ)V")
	public void method488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt722;
			@Pc(18) int local18 = arg3 - this.anInt723;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method491(local4, local18, 128);
					this.method491(local4 - 1, local18, 8);
				}
				if (arg2 == 1) {
					this.method491(local4, local18, 2);
					this.method491(local4, local18 + 1, 32);
				}
				if (arg2 == 2) {
					this.method491(local4, local18, 8);
					this.method491(local4 + 1, local18, 128);
				}
				if (arg2 == 3) {
					this.method491(local4, local18, 32);
					this.method491(local4, local18 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method491(local4, local18, 1);
					this.method491(local4 - 1, local18 + 1, 16);
				}
				if (arg2 == 1) {
					this.method491(local4, local18, 4);
					this.method491(local4 + 1, local18 + 1, 64);
				}
				if (arg2 == 2) {
					this.method491(local4, local18, 16);
					this.method491(local4 + 1, local18 - 1, 1);
				}
				if (arg2 == 3) {
					this.method491(local4, local18, 64);
					this.method491(local4 - 1, local18 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method491(local4, local18, 130);
					this.method491(local4 - 1, local18, 8);
					this.method491(local4, local18 + 1, 32);
				}
				if (arg2 == 1) {
					this.method491(local4, local18, 10);
					this.method491(local4, local18 + 1, 32);
					this.method491(local4 + 1, local18, 128);
				}
				if (arg2 == 2) {
					this.method491(local4, local18, 40);
					this.method491(local4 + 1, local18, 128);
					this.method491(local4, local18 - 1, 2);
				}
				if (arg2 == 3) {
					this.method491(local4, local18, 160);
					this.method491(local4, local18 - 1, 2);
					this.method491(local4 - 1, local18, 8);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method491(local4, local18, 65536);
						this.method491(local4 - 1, local18, 4096);
					}
					if (arg2 == 1) {
						this.method491(local4, local18, 1024);
						this.method491(local4, local18 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method491(local4, local18, 4096);
						this.method491(local4 + 1, local18, 65536);
					}
					if (arg2 == 3) {
						this.method491(local4, local18, 16384);
						this.method491(local4, local18 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method491(local4, local18, 512);
						this.method491(local4 - 1, local18 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method491(local4, local18, 2048);
						this.method491(local4 + 1, local18 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method491(local4, local18, 8192);
						this.method491(local4 + 1, local18 - 1, 512);
					}
					if (arg2 == 3) {
						this.method491(local4, local18, 32768);
						this.method491(local4 - 1, local18 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method491(local4, local18, 66560);
						this.method491(local4 - 1, local18, 4096);
						this.method491(local4, local18 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method491(local4, local18, 5120);
						this.method491(local4, local18 + 1, 16384);
						this.method491(local4 + 1, local18, 65536);
					}
					if (arg2 == 2) {
						this.method491(local4, local18, 20480);
						this.method491(local4 + 1, local18, 65536);
						this.method491(local4, local18 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method491(local4, local18, 81920);
						this.method491(local4, local18 - 1, 1024);
						this.method491(local4 - 1, local18, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("22688, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(IIIIIZI)V")
	public void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt722;
			@Pc(32) int local32 = arg5 - this.anInt723;
			@Pc(40) int local40;
			if (arg0 == 1 || arg0 == 3) {
				local40 = arg1;
				arg1 = arg3;
				arg3 = local40;
			}
			for (local40 = local14; local40 < local14 + arg1; local40++) {
				if (local40 >= 0 && local40 < this.anInt724) {
					for (@Pc(56) int local56 = local32; local56 < local32 + arg3; local56++) {
						if (local56 >= 0 && local56 < this.anInt725) {
							this.method491(local40, local56, local3);
						}
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("9703, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(IIB)V")
	public void method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt722;
			@Pc(9) int local9 = arg0 - this.anInt723;
			this.anIntArrayArray16[local4][local9] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("18888, " + arg0 + ", " + arg1 + ", " + -95 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(III)V")
	private void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray16[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(ZIZIII)V")
	public void method492(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) int local9 = arg2 - this.anInt722;
			@Pc(14) int local14 = arg4 - this.anInt723;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method494(local14, local9, 128);
					this.method494(local14, local9 - 1, 8);
				}
				if (arg1 == 1) {
					this.method494(local14, local9, 2);
					this.method494(local14 + 1, local9, 32);
				}
				if (arg1 == 2) {
					this.method494(local14, local9, 8);
					this.method494(local14, local9 + 1, 128);
				}
				if (arg1 == 3) {
					this.method494(local14, local9, 32);
					this.method494(local14 - 1, local9, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method494(local14, local9, 1);
					this.method494(local14 + 1, local9 - 1, 16);
				}
				if (arg1 == 1) {
					this.method494(local14, local9, 4);
					this.method494(local14 + 1, local9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method494(local14, local9, 16);
					this.method494(local14 - 1, local9 + 1, 1);
				}
				if (arg1 == 3) {
					this.method494(local14, local9, 64);
					this.method494(local14 - 1, local9 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method494(local14, local9, 130);
					this.method494(local14, local9 - 1, 8);
					this.method494(local14 + 1, local9, 32);
				}
				if (arg1 == 1) {
					this.method494(local14, local9, 10);
					this.method494(local14 + 1, local9, 32);
					this.method494(local14, local9 + 1, 128);
				}
				if (arg1 == 2) {
					this.method494(local14, local9, 40);
					this.method494(local14, local9 + 1, 128);
					this.method494(local14 - 1, local9, 2);
				}
				if (arg1 == 3) {
					this.method494(local14, local9, 160);
					this.method494(local14 - 1, local9, 2);
					this.method494(local14, local9 - 1, 8);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method494(local14, local9, 65536);
						this.method494(local14, local9 - 1, 4096);
					}
					if (arg1 == 1) {
						this.method494(local14, local9, 1024);
						this.method494(local14 + 1, local9, 16384);
					}
					if (arg1 == 2) {
						this.method494(local14, local9, 4096);
						this.method494(local14, local9 + 1, 65536);
					}
					if (arg1 == 3) {
						this.method494(local14, local9, 16384);
						this.method494(local14 - 1, local9, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method494(local14, local9, 512);
						this.method494(local14 + 1, local9 - 1, 8192);
					}
					if (arg1 == 1) {
						this.method494(local14, local9, 2048);
						this.method494(local14 + 1, local9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method494(local14, local9, 8192);
						this.method494(local14 - 1, local9 + 1, 512);
					}
					if (arg1 == 3) {
						this.method494(local14, local9, 32768);
						this.method494(local14 - 1, local9 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method494(local14, local9, 66560);
						this.method494(local14, local9 - 1, 4096);
						this.method494(local14 + 1, local9, 16384);
					}
					if (arg1 == 1) {
						this.method494(local14, local9, 5120);
						this.method494(local14 + 1, local9, 16384);
						this.method494(local14, local9 + 1, 65536);
					}
					if (arg1 == 2) {
						this.method494(local14, local9, 20480);
						this.method494(local14, local9 + 1, 65536);
						this.method494(local14 - 1, local9, 1024);
					}
					if (arg1 == 3) {
						this.method494(local14, local9, 81920);
						this.method494(local14 - 1, local9, 1024);
						this.method494(local14, local9 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("35605, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(BIIIIIZ)V")
	public void method493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt722;
			@Pc(19) int local19 = arg2 - this.anInt723;
			if (this.aByte19 == 4) {
				@Pc(32) int local32;
				if (arg3 == 1 || arg3 == 3) {
					local32 = arg4;
					arg4 = arg1;
					arg1 = local32;
				}
				for (local32 = local14; local32 < local14 + arg4; local32++) {
					if (local32 >= 0 && local32 < this.anInt724) {
						for (@Pc(48) int local48 = local19; local48 < local19 + arg1; local48++) {
							if (local48 >= 0 && local48 < this.anInt725) {
								this.method494(local48, local32, local3);
							}
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("83722, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(IIIZ)V")
	private void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray16[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("4387, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(IZI)V")
	public void method495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt722;
			@Pc(9) int local9 = arg0 - this.anInt723;
			this.anIntArrayArray16[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("96305, " + arg0 + ", " + false + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 == arg0 && arg3 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt722;
			@Pc(17) int local17 = arg3 - this.anInt723;
			@Pc(22) int local22 = arg0 - this.anInt722;
			if (arg6 != 32747) {
				throw new NullPointerException();
			}
			@Pc(34) int local34 = arg5 - this.anInt723;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray16[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray16[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray16[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray16[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280180) == 0) {
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
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray16[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray16[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray16[local12][local17] & 0x1280120) == 0) {
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
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray16[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray16[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray16[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray16[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("87198, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg1 && arg4 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt722;
			@Pc(26) int local26 = arg4 - this.anInt723;
			@Pc(31) int local31 = arg1 - this.anInt722;
			@Pc(36) int local36 = arg2 - this.anInt723;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray16[local12][local26] & 0x80) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray16[local12][local26] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray16[local12][local26] & 0x8) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray16[local12][local26] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray16[local12][local26] & 0x8) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray16[local12][local26] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray16[local12][local26] & 0x80) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray16[local12][local26] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray16[local12][local26] & 0x20) == 0) {
					return true;
				}
				if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray16[local12][local26] & 0x2) == 0) {
					return true;
				}
				if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray16[local12][local26] & 0x8) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray16[local12][local26] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("78064, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -805 + ", " + arg5 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WWMUUFBO", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg2 - 1;
			@Pc(11) int local11 = arg5 + arg0 - 1;
			if (arg6 >= arg3 && arg6 <= local5 && arg4 >= arg5 && arg4 <= local11) {
				return true;
			} else if (arg6 == arg3 - 1 && arg4 >= arg5 && arg4 <= local11 && (this.anIntArrayArray16[arg6 - this.anInt722][arg4 - this.anInt723] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg4 >= arg5 && arg4 <= local11 && (this.anIntArrayArray16[arg6 - this.anInt722][arg4 - this.anInt723] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg5 - 1 && arg6 >= arg3 && arg6 <= local5 && (this.anIntArrayArray16[arg6 - this.anInt722][arg4 - this.anInt723] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local11 + 1 && arg6 >= arg3 && arg6 <= local5 && (this.anIntArrayArray16[arg6 - this.anInt722][arg4 - this.anInt723] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("80090, " + 53 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}

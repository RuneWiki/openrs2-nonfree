import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ic")
public final class Class17 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	private int anInt656 = -31142;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private int anInt657 = 2;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	private int anInt658 = 288;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private int anInt659 = 2;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	private int anInt660 = 7;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt661 = 0;
			@Pc(31) int local31 = 73 / arg0;
			this.anInt662 = 0;
			this.anInt663 = arg1;
			this.anInt664 = arg2;
			this.anIntArrayArray15 = new int[this.anInt663][this.anInt664];
			this.method368();
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("37579, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public void method368() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt663; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt664; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt663 - 1 || local7 == this.anInt664 - 1) {
						this.anIntArrayArray15[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray15[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("69155, " + 77 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZIII)V")
	public void method369(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) int local7 = arg4 - this.anInt661;
			@Pc(12) int local12 = arg2 - this.anInt662;
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method372(local7, local12, 128);
					this.method372(local7 - 1, local12, 8);
				}
				if (arg0 == 1) {
					this.method372(local7, local12, 2);
					this.method372(local7, local12 + 1, 32);
				}
				if (arg0 == 2) {
					this.method372(local7, local12, 8);
					this.method372(local7 + 1, local12, 128);
				}
				if (arg0 == 3) {
					this.method372(local7, local12, 32);
					this.method372(local7, local12 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method372(local7, local12, 1);
					this.method372(local7 - 1, local12 + 1, 16);
				}
				if (arg0 == 1) {
					this.method372(local7, local12, 4);
					this.method372(local7 + 1, local12 + 1, 64);
				}
				if (arg0 == 2) {
					this.method372(local7, local12, 16);
					this.method372(local7 + 1, local12 - 1, 1);
				}
				if (arg0 == 3) {
					this.method372(local7, local12, 64);
					this.method372(local7 - 1, local12 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method372(local7, local12, 130);
					this.method372(local7 - 1, local12, 8);
					this.method372(local7, local12 + 1, 32);
				}
				if (arg0 == 1) {
					this.method372(local7, local12, 10);
					this.method372(local7, local12 + 1, 32);
					this.method372(local7 + 1, local12, 128);
				}
				if (arg0 == 2) {
					this.method372(local7, local12, 40);
					this.method372(local7 + 1, local12, 128);
					this.method372(local7, local12 - 1, 2);
				}
				if (arg0 == 3) {
					this.method372(local7, local12, 160);
					this.method372(local7, local12 - 1, 2);
					this.method372(local7 - 1, local12, 8);
				}
			}
			if (arg1) {
				if (arg3 == 0) {
					if (arg0 == 0) {
						this.method372(local7, local12, 65536);
						this.method372(local7 - 1, local12, 4096);
					}
					if (arg0 == 1) {
						this.method372(local7, local12, 1024);
						this.method372(local7, local12 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method372(local7, local12, 4096);
						this.method372(local7 + 1, local12, 65536);
					}
					if (arg0 == 3) {
						this.method372(local7, local12, 16384);
						this.method372(local7, local12 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg0 == 0) {
						this.method372(local7, local12, 512);
						this.method372(local7 - 1, local12 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method372(local7, local12, 2048);
						this.method372(local7 + 1, local12 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method372(local7, local12, 8192);
						this.method372(local7 + 1, local12 - 1, 512);
					}
					if (arg0 == 3) {
						this.method372(local7, local12, 32768);
						this.method372(local7 - 1, local12 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg0 == 0) {
						this.method372(local7, local12, 66560);
						this.method372(local7 - 1, local12, 4096);
						this.method372(local7, local12 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method372(local7, local12, 5120);
						this.method372(local7, local12 + 1, 16384);
						this.method372(local7 + 1, local12, 65536);
					}
					if (arg0 == 2) {
						this.method372(local7, local12, 20480);
						this.method372(local7 + 1, local12, 65536);
						this.method372(local7, local12 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method372(local7, local12, 81920);
						this.method372(local7, local12 - 1, 1024);
						this.method372(local7 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("64411, " + arg0 + ", " + -146 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIZIII)V")
	public void method370(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt661;
			@Pc(19) int local19 = arg2 - this.anInt662;
			@Pc(27) int local27;
			if (arg3 == 1 || arg3 == 3) {
				local27 = arg5;
				arg5 = arg1;
				arg1 = local27;
			}
			for (local27 = local14; local27 < local14 + arg5; local27++) {
				if (local27 >= 0 && local27 < this.anInt663) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg1; local43++) {
						if (local43 >= 0 && local43 < this.anInt664) {
							this.method372(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("3959, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt661;
			@Pc(9) int local9 = arg0 - this.anInt662;
			this.anIntArrayArray15[local4][local9] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("76027, " + arg0 + ", " + -12 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	private void method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIZII)V")
	public void method373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) int local9 = arg3 - this.anInt661;
			@Pc(14) int local14 = arg4 - this.anInt662;
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method375(local14, 128, 288, local9);
					this.method375(local14, 8, 288, local9 - 1);
				}
				if (arg1 == 1) {
					this.method375(local14, 2, 288, local9);
					this.method375(local14 + 1, 32, 288, local9);
				}
				if (arg1 == 2) {
					this.method375(local14, 8, 288, local9);
					this.method375(local14, 128, 288, local9 + 1);
				}
				if (arg1 == 3) {
					this.method375(local14, 32, 288, local9);
					this.method375(local14 - 1, 2, 288, local9);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method375(local14, 1, 288, local9);
					this.method375(local14 + 1, 16, 288, local9 - 1);
				}
				if (arg1 == 1) {
					this.method375(local14, 4, 288, local9);
					this.method375(local14 + 1, 64, 288, local9 + 1);
				}
				if (arg1 == 2) {
					this.method375(local14, 16, 288, local9);
					this.method375(local14 - 1, 1, 288, local9 + 1);
				}
				if (arg1 == 3) {
					this.method375(local14, 64, 288, local9);
					this.method375(local14 - 1, 4, 288, local9 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method375(local14, 130, 288, local9);
					this.method375(local14, 8, 288, local9 - 1);
					this.method375(local14 + 1, 32, 288, local9);
				}
				if (arg1 == 1) {
					this.method375(local14, 10, 288, local9);
					this.method375(local14 + 1, 32, 288, local9);
					this.method375(local14, 128, 288, local9 + 1);
				}
				if (arg1 == 2) {
					this.method375(local14, 40, 288, local9);
					this.method375(local14, 128, 288, local9 + 1);
					this.method375(local14 - 1, 2, 288, local9);
				}
				if (arg1 == 3) {
					this.method375(local14, 160, 288, local9);
					this.method375(local14 - 1, 2, 288, local9);
					this.method375(local14, 8, 288, local9 - 1);
				}
			}
			if (arg0) {
				if (arg2 == 0) {
					if (arg1 == 0) {
						this.method375(local14, 65536, 288, local9);
						this.method375(local14, 4096, 288, local9 - 1);
					}
					if (arg1 == 1) {
						this.method375(local14, 1024, 288, local9);
						this.method375(local14 + 1, 16384, 288, local9);
					}
					if (arg1 == 2) {
						this.method375(local14, 4096, 288, local9);
						this.method375(local14, 65536, 288, local9 + 1);
					}
					if (arg1 == 3) {
						this.method375(local14, 16384, 288, local9);
						this.method375(local14 - 1, 1024, 288, local9);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg1 == 0) {
						this.method375(local14, 512, 288, local9);
						this.method375(local14 + 1, 8192, 288, local9 - 1);
					}
					if (arg1 == 1) {
						this.method375(local14, 2048, 288, local9);
						this.method375(local14 + 1, 32768, 288, local9 + 1);
					}
					if (arg1 == 2) {
						this.method375(local14, 8192, 288, local9);
						this.method375(local14 - 1, 512, 288, local9 + 1);
					}
					if (arg1 == 3) {
						this.method375(local14, 32768, 288, local9);
						this.method375(local14 - 1, 2048, 288, local9 - 1);
					}
				}
				if (arg2 == 2) {
					if (arg1 == 0) {
						this.method375(local14, 66560, 288, local9);
						this.method375(local14, 4096, 288, local9 - 1);
						this.method375(local14 + 1, 16384, 288, local9);
					}
					if (arg1 == 1) {
						this.method375(local14, 5120, 288, local9);
						this.method375(local14 + 1, 16384, 288, local9);
						this.method375(local14, 65536, 288, local9 + 1);
					}
					if (arg1 == 2) {
						this.method375(local14, 20480, 288, local9);
						this.method375(local14, 65536, 288, local9 + 1);
						this.method375(local14 - 1, 1024, 288, local9);
					}
					if (arg1 == 3) {
						this.method375(local14, 81920, 288, local9);
						this.method375(local14 - 1, 1024, 288, local9);
						this.method375(local14, 4096, 288, local9 - 1);
						return;
					}
				}
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("67256, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIIIII)V")
	public void method374(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(17) int local17 = arg1 - this.anInt661;
			@Pc(22) int local22 = arg2 - this.anInt662;
			@Pc(30) int local30;
			if (arg5 == 1 || arg5 == 3) {
				local30 = arg3;
				arg3 = arg4;
				arg4 = local30;
			}
			for (local30 = local17; local30 < local17 + arg3; local30++) {
				if (local30 >= 0 && local30 < this.anInt663) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg4; local46++) {
						if (local46 >= 0 && local46 < this.anInt664) {
							this.method375(local46, local3, 288, local30);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("13471, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	private void method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray15[arg3][arg0] &= 16777215 - arg1;
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("48766, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
	public void method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt661;
			@Pc(8) boolean local8 = false;
			@Pc(13) int local13 = arg0 - this.anInt662;
			this.anIntArrayArray15[local4][local13] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("90346, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 == arg1 && arg2 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt661;
			@Pc(28) int local28 = arg2 - this.anInt662;
			@Pc(33) int local33 = arg1 - this.anInt661;
			@Pc(38) int local38 = arg3 - this.anInt662;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local12 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray15[local12][local28] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray15[local12][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray15[local12][local28] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray15[local12][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local33 && local28 == local38 - 1) {
						return true;
					}
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local12 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray15[local12][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray15[local12][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray15[local12][local28] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray15[local12][local28] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray15[local12][local28] & 0x20) == 0) {
					return true;
				}
				if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray15[local12][local28] & 0x2) == 0) {
					return true;
				}
				if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x8) == 0) {
					return true;
				}
				if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray15[local12][local28] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(571) RuntimeException local571) {
			signlink.reporterror("48877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg2 && arg1 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt661;
			@Pc(17) int local17 = arg1 - this.anInt662;
			@Pc(32) int local32 = arg2 - this.anInt661;
			@Pc(37) int local37 = arg4 - this.anInt662;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("43268, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg2 - 1;
			@Pc(11) int local11 = arg1 + arg0 - 1;
			if (this.anInt659 != 2) {
				this.aBoolean129 = !this.aBoolean129;
			}
			if (arg4 >= arg3 && arg4 <= local5 && arg6 >= arg1 && arg6 <= local11) {
				return true;
			} else if (arg4 == arg3 - 1 && arg6 >= arg1 && arg6 <= local11 && (this.anIntArrayArray15[arg4 - this.anInt661][arg6 - this.anInt662] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg4 == local5 + 1 && arg6 >= arg1 && arg6 <= local11 && (this.anIntArrayArray15[arg4 - this.anInt661][arg6 - this.anInt662] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg1 - 1 && arg4 >= arg3 && arg4 <= local5 && (this.anIntArrayArray15[arg4 - this.anInt661][arg6 - this.anInt662] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local11 + 1 && arg4 >= arg3 && arg4 <= local5 && (this.anIntArrayArray15[arg4 - this.anInt661][arg6 - this.anInt662] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("94623, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}
}

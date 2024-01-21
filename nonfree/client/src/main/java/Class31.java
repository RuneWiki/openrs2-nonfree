import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OPAHDXQS")
public final class Class31 {

	@OriginalMember(owner = "client!OPAHDXQS", name = "d", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "I")
	private int anInt505 = -884;

	@OriginalMember(owner = "client!OPAHDXQS", name = "b", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!OPAHDXQS", name = "c", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!OPAHDXQS", name = "e", descriptor = "B")
	private byte aByte20 = 8;

	@OriginalMember(owner = "client!OPAHDXQS", name = "f", descriptor = "B")
	private byte aByte21 = 6;

	@OriginalMember(owner = "client!OPAHDXQS", name = "g", descriptor = "I")
	private int anInt507 = 397;

	@OriginalMember(owner = "client!OPAHDXQS", name = "h", descriptor = "I")
	private int anInt508 = -53;

	@OriginalMember(owner = "client!OPAHDXQS", name = "i", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!OPAHDXQS", name = "j", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!OPAHDXQS", name = "k", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!OPAHDXQS", name = "l", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!OPAHDXQS", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!OPAHDXQS", name = "<init>", descriptor = "(IBI)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt509 = 0;
			this.anInt510 = 0;
			this.anInt511 = arg2;
			this.anInt512 = arg0;
			this.anIntArrayArray14 = new int[this.anInt511][this.anInt512];
			this.method298();
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("39005, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "()V")
	public void method298() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt511; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt512; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt511 - 1 || local7 == this.anInt512 - 1) {
					this.anIntArrayArray14[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray14[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(IIZIII)V")
	public void method299(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt509;
			@Pc(14) int local14 = arg3 - this.anInt510;
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method302(local4, local14, 128);
					this.method302(local4 - 1, local14, 8);
				}
				if (arg0 == 1) {
					this.method302(local4, local14, 2);
					this.method302(local4, local14 + 1, 32);
				}
				if (arg0 == 2) {
					this.method302(local4, local14, 8);
					this.method302(local4 + 1, local14, 128);
				}
				if (arg0 == 3) {
					this.method302(local4, local14, 32);
					this.method302(local4, local14 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method302(local4, local14, 1);
					this.method302(local4 - 1, local14 + 1, 16);
				}
				if (arg0 == 1) {
					this.method302(local4, local14, 4);
					this.method302(local4 + 1, local14 + 1, 64);
				}
				if (arg0 == 2) {
					this.method302(local4, local14, 16);
					this.method302(local4 + 1, local14 - 1, 1);
				}
				if (arg0 == 3) {
					this.method302(local4, local14, 64);
					this.method302(local4 - 1, local14 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method302(local4, local14, 130);
					this.method302(local4 - 1, local14, 8);
					this.method302(local4, local14 + 1, 32);
				}
				if (arg0 == 1) {
					this.method302(local4, local14, 10);
					this.method302(local4, local14 + 1, 32);
					this.method302(local4 + 1, local14, 128);
				}
				if (arg0 == 2) {
					this.method302(local4, local14, 40);
					this.method302(local4 + 1, local14, 128);
					this.method302(local4, local14 - 1, 2);
				}
				if (arg0 == 3) {
					this.method302(local4, local14, 160);
					this.method302(local4, local14 - 1, 2);
					this.method302(local4 - 1, local14, 8);
				}
			}
			if (arg1) {
				if (arg4 == 0) {
					if (arg0 == 0) {
						this.method302(local4, local14, 65536);
						this.method302(local4 - 1, local14, 4096);
					}
					if (arg0 == 1) {
						this.method302(local4, local14, 1024);
						this.method302(local4, local14 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method302(local4, local14, 4096);
						this.method302(local4 + 1, local14, 65536);
					}
					if (arg0 == 3) {
						this.method302(local4, local14, 16384);
						this.method302(local4, local14 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg0 == 0) {
						this.method302(local4, local14, 512);
						this.method302(local4 - 1, local14 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method302(local4, local14, 2048);
						this.method302(local4 + 1, local14 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method302(local4, local14, 8192);
						this.method302(local4 + 1, local14 - 1, 512);
					}
					if (arg0 == 3) {
						this.method302(local4, local14, 32768);
						this.method302(local4 - 1, local14 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg0 == 0) {
						this.method302(local4, local14, 66560);
						this.method302(local4 - 1, local14, 4096);
						this.method302(local4, local14 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method302(local4, local14, 5120);
						this.method302(local4, local14 + 1, 16384);
						this.method302(local4 + 1, local14, 65536);
					}
					if (arg0 == 2) {
						this.method302(local4, local14, 20480);
						this.method302(local4 + 1, local14, 65536);
						this.method302(local4, local14 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method302(local4, local14, 81920);
						this.method302(local4, local14 - 1, 1024);
						this.method302(local4 - 1, local14, 4096);
						return;
					}
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("99212, " + -787 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(IZIBIII)V")
	public void method300(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (this.aByte20 == 8) {
				@Pc(9) boolean local9 = false;
			} else {
				this.anInt506 = 73;
			}
			if (arg1) {
				local3 = 131328;
			}
			@Pc(25) int local25 = arg6 - this.anInt509;
			@Pc(30) int local30 = arg0 - this.anInt510;
			@Pc(38) int local38;
			if (arg2 == 1 || arg2 == 3) {
				local38 = arg5;
				arg5 = arg4;
				arg4 = local38;
			}
			for (local38 = local25; local38 < local25 + arg5; local38++) {
				if (local38 >= 0 && local38 < this.anInt511) {
					for (@Pc(54) int local54 = local30; local54 < local30 + arg4; local54++) {
						if (local54 >= 0 && local54 < this.anInt512) {
							this.method302(local38, local54, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("34138, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(III)V")
	public void method301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(8) int local8 = arg0 - this.anInt509;
			@Pc(13) int local13 = arg1 - this.anInt510;
			this.anIntArrayArray14[local8][local13] |= 0x200000;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48489, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "b", descriptor = "(III)V")
	private void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray14[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "b", descriptor = "(IIZIII)V")
	public void method303(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt509;
			@Pc(13) int local13 = arg0 - this.anInt510;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method305(128, local4, local13);
					this.method305(8, local4 - 1, local13);
				}
				if (arg4 == 1) {
					this.method305(2, local4, local13);
					this.method305(32, local4, local13 + 1);
				}
				if (arg4 == 2) {
					this.method305(8, local4, local13);
					this.method305(128, local4 + 1, local13);
				}
				if (arg4 == 3) {
					this.method305(32, local4, local13);
					this.method305(2, local4, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method305(1, local4, local13);
					this.method305(16, local4 - 1, local13 + 1);
				}
				if (arg4 == 1) {
					this.method305(4, local4, local13);
					this.method305(64, local4 + 1, local13 + 1);
				}
				if (arg4 == 2) {
					this.method305(16, local4, local13);
					this.method305(1, local4 + 1, local13 - 1);
				}
				if (arg4 == 3) {
					this.method305(64, local4, local13);
					this.method305(4, local4 - 1, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method305(130, local4, local13);
					this.method305(8, local4 - 1, local13);
					this.method305(32, local4, local13 + 1);
				}
				if (arg4 == 1) {
					this.method305(10, local4, local13);
					this.method305(32, local4, local13 + 1);
					this.method305(128, local4 + 1, local13);
				}
				if (arg4 == 2) {
					this.method305(40, local4, local13);
					this.method305(128, local4 + 1, local13);
					this.method305(2, local4, local13 - 1);
				}
				if (arg4 == 3) {
					this.method305(160, local4, local13);
					this.method305(2, local4, local13 - 1);
					this.method305(8, local4 - 1, local13);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method305(65536, local4, local13);
						this.method305(4096, local4 - 1, local13);
					}
					if (arg4 == 1) {
						this.method305(1024, local4, local13);
						this.method305(16384, local4, local13 + 1);
					}
					if (arg4 == 2) {
						this.method305(4096, local4, local13);
						this.method305(65536, local4 + 1, local13);
					}
					if (arg4 == 3) {
						this.method305(16384, local4, local13);
						this.method305(1024, local4, local13 - 1);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method305(512, local4, local13);
						this.method305(8192, local4 - 1, local13 + 1);
					}
					if (arg4 == 1) {
						this.method305(2048, local4, local13);
						this.method305(32768, local4 + 1, local13 + 1);
					}
					if (arg4 == 2) {
						this.method305(8192, local4, local13);
						this.method305(512, local4 + 1, local13 - 1);
					}
					if (arg4 == 3) {
						this.method305(32768, local4, local13);
						this.method305(2048, local4 - 1, local13 - 1);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method305(66560, local4, local13);
						this.method305(4096, local4 - 1, local13);
						this.method305(16384, local4, local13 + 1);
					}
					if (arg4 == 1) {
						this.method305(5120, local4, local13);
						this.method305(16384, local4, local13 + 1);
						this.method305(65536, local4 + 1, local13);
					}
					if (arg4 == 2) {
						this.method305(20480, local4, local13);
						this.method305(65536, local4 + 1, local13);
						this.method305(1024, local4, local13 - 1);
					}
					if (arg4 == 3) {
						this.method305(81920, local4, local13);
						this.method305(1024, local4, local13 - 1);
						this.method305(4096, local4 - 1, local13);
						return;
					}
				}
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("1692, " + arg0 + ", " + -19182 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(ZIBIIII)V")
	public void method304(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (this.aByte21 != 6) {
				this.aBoolean102 = !this.aBoolean102;
			}
			if (arg0) {
				local3 = 131328;
			}
			@Pc(26) int local26 = arg1 - this.anInt509;
			@Pc(31) int local31 = arg5 - this.anInt510;
			@Pc(39) int local39;
			if (arg4 == 1 || arg4 == 3) {
				local39 = arg2;
				arg2 = arg3;
				arg3 = local39;
			}
			for (local39 = local26; local39 < local26 + arg2; local39++) {
				if (local39 >= 0 && local39 < this.anInt511) {
					for (@Pc(55) int local55 = local31; local55 < local31 + arg3; local55++) {
						if (local55 >= 0 && local55 < this.anInt512) {
							this.method305(local3, local39, local55);
						}
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("1433, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(IIII)V")
	private void method305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray14[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("83069, " + arg0 + ", " + 32275 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "c", descriptor = "(III)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt509;
			@Pc(9) int local9 = arg2 - this.anInt510;
			@Pc(13) boolean local13 = false;
			this.anIntArrayArray14[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48540, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg2 && arg3 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt509;
			@Pc(17) int local17 = arg3 - this.anInt510;
			@Pc(22) int local22 = arg2 - this.anInt509;
			@Pc(27) int local27 = arg5 - this.anInt510;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray14[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray14[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray14[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("65234, " + arg0 + ", " + arg1 + ", " + -776 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg5 && arg4 == arg2) {
				return true;
			}
			@Pc(21) int local21 = arg3 - this.anInt509;
			@Pc(26) int local26 = arg4 - this.anInt510;
			@Pc(31) int local31 = arg5 - this.anInt509;
			@Pc(36) int local36 = arg2 - this.anInt510;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local21 == local31 + 1 && local26 == local36 && (this.anIntArrayArray14[local21][local26] & 0x80) == 0) {
						return true;
					}
					if (local21 == local31 && local26 == local36 - 1 && (this.anIntArrayArray14[local21][local26] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local21 == local31 - 1 && local26 == local36 && (this.anIntArrayArray14[local21][local26] & 0x8) == 0) {
						return true;
					}
					if (local21 == local31 && local26 == local36 - 1 && (this.anIntArrayArray14[local21][local26] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local21 == local31 - 1 && local26 == local36 && (this.anIntArrayArray14[local21][local26] & 0x8) == 0) {
						return true;
					}
					if (local21 == local31 && local26 == local36 + 1 && (this.anIntArrayArray14[local21][local26] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local21 == local31 + 1 && local26 == local36 && (this.anIntArrayArray14[local21][local26] & 0x80) == 0) {
						return true;
					}
					if (local21 == local31 && local26 == local36 + 1 && (this.anIntArrayArray14[local21][local26] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local21 == local31 && local26 == local36 + 1 && (this.anIntArrayArray14[local21][local26] & 0x20) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local36 - 1 && (this.anIntArrayArray14[local21][local26] & 0x2) == 0) {
					return true;
				}
				if (local21 == local31 - 1 && local26 == local36 && (this.anIntArrayArray14[local21][local26] & 0x8) == 0) {
					return true;
				}
				if (local21 == local31 + 1 && local26 == local36 && (this.anIntArrayArray14[local21][local26] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("79297, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPAHDXQS", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg0 - 1;
			@Pc(11) int local11 = arg1 + arg4 - 1;
			if (arg5 >= arg6 && arg5 <= local5 && arg2 >= arg1 && arg2 <= local11) {
				return true;
			} else if (arg5 == arg6 - 1 && arg2 >= arg1 && arg2 <= local11 && (this.anIntArrayArray14[arg5 - this.anInt509][arg2 - this.anInt510] & 0x8) == 0 && (arg3 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg2 >= arg1 && arg2 <= local11 && (this.anIntArrayArray14[arg5 - this.anInt509][arg2 - this.anInt510] & 0x80) == 0 && (arg3 & 0x2) == 0) {
				return true;
			} else if (arg2 == arg1 - 1 && arg5 >= arg6 && arg5 <= local5 && (this.anIntArrayArray14[arg5 - this.anInt509][arg2 - this.anInt510] & 0x2) == 0 && (arg3 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local11 + 1 && arg5 >= arg6 && arg5 <= local5 && (this.anIntArrayArray14[arg5 - this.anInt509][arg2 - this.anInt510] & 0x20) == 0 && (arg3 & 0x1) == 0;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("1858, " + arg0 + ", " + arg1 + ", " + -53 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt655 = -883;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt657 = -21590;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt658 = 5;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt659 = 0;
			this.anInt660 = 0;
			this.anInt661 = arg2;
			this.anInt662 = arg0;
			this.anIntArrayArray18 = new int[this.anInt661][this.anInt662];
			this.method416();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("82884, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public void method416() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt661; local8++) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt662; local12++) {
					if (local8 == 0 || local12 == 0 || local8 == this.anInt661 - 1 || local12 == this.anInt662 - 1) {
						this.anIntArrayArray18[local8][local12] = 16777215;
					} else {
						this.anIntArrayArray18[local8][local12] = 0;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("18263, " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(13) int local13 = arg4 - this.anInt659;
			@Pc(18) int local18 = arg3 - this.anInt660;
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method420(local13, local18, 128);
					this.method420(local13 - 1, local18, 8);
				}
				if (arg1 == 1) {
					this.method420(local13, local18, 2);
					this.method420(local13, local18 + 1, 32);
				}
				if (arg1 == 2) {
					this.method420(local13, local18, 8);
					this.method420(local13 + 1, local18, 128);
				}
				if (arg1 == 3) {
					this.method420(local13, local18, 32);
					this.method420(local13, local18 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method420(local13, local18, 1);
					this.method420(local13 - 1, local18 + 1, 16);
				}
				if (arg1 == 1) {
					this.method420(local13, local18, 4);
					this.method420(local13 + 1, local18 + 1, 64);
				}
				if (arg1 == 2) {
					this.method420(local13, local18, 16);
					this.method420(local13 + 1, local18 - 1, 1);
				}
				if (arg1 == 3) {
					this.method420(local13, local18, 64);
					this.method420(local13 - 1, local18 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method420(local13, local18, 130);
					this.method420(local13 - 1, local18, 8);
					this.method420(local13, local18 + 1, 32);
				}
				if (arg1 == 1) {
					this.method420(local13, local18, 10);
					this.method420(local13, local18 + 1, 32);
					this.method420(local13 + 1, local18, 128);
				}
				if (arg1 == 2) {
					this.method420(local13, local18, 40);
					this.method420(local13 + 1, local18, 128);
					this.method420(local13, local18 - 1, 2);
				}
				if (arg1 == 3) {
					this.method420(local13, local18, 160);
					this.method420(local13, local18 - 1, 2);
					this.method420(local13 - 1, local18, 8);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg1 == 0) {
						this.method420(local13, local18, 65536);
						this.method420(local13 - 1, local18, 4096);
					}
					if (arg1 == 1) {
						this.method420(local13, local18, 1024);
						this.method420(local13, local18 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method420(local13, local18, 4096);
						this.method420(local13 + 1, local18, 65536);
					}
					if (arg1 == 3) {
						this.method420(local13, local18, 16384);
						this.method420(local13, local18 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg1 == 0) {
						this.method420(local13, local18, 512);
						this.method420(local13 - 1, local18 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method420(local13, local18, 2048);
						this.method420(local13 + 1, local18 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method420(local13, local18, 8192);
						this.method420(local13 + 1, local18 - 1, 512);
					}
					if (arg1 == 3) {
						this.method420(local13, local18, 32768);
						this.method420(local13 - 1, local18 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg1 == 0) {
						this.method420(local13, local18, 66560);
						this.method420(local13 - 1, local18, 4096);
						this.method420(local13, local18 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method420(local13, local18, 5120);
						this.method420(local13, local18 + 1, 16384);
						this.method420(local13 + 1, local18, 65536);
					}
					if (arg1 == 2) {
						this.method420(local13, local18, 20480);
						this.method420(local13 + 1, local18, 65536);
						this.method420(local13, local18 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method420(local13, local18, 81920);
						this.method420(local13, local18 - 1, 1024);
						this.method420(local13 - 1, local18, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("52627, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -581 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIIII)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt659;
			@Pc(24) int local24 = arg1 - this.anInt660;
			@Pc(32) int local32;
			if (arg4 == 1 || arg4 == 3) {
				local32 = arg3;
				arg3 = arg5;
				arg5 = local32;
			}
			for (local32 = local14; local32 < local14 + arg3; local32++) {
				if (local32 >= 0 && local32 < this.anInt661) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg5; local48++) {
						if (local48 >= 0 && local48 < this.anInt662) {
							this.method420(local32, local48, local3);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("1258, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt659;
			@Pc(9) int local9 = arg2 - this.anInt660;
			if (arg1 == 79) {
				this.anIntArrayArray18[local4][local9] |= 0x200000;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("20791, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt659;
			@Pc(9) int local9 = arg3 - this.anInt660;
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method423(local9, 128, local4);
					this.method423(local9, 8, local4 - 1);
				}
				if (arg2 == 1) {
					this.method423(local9, 2, local4);
					this.method423(local9 + 1, 32, local4);
				}
				if (arg2 == 2) {
					this.method423(local9, 8, local4);
					this.method423(local9, 128, local4 + 1);
				}
				if (arg2 == 3) {
					this.method423(local9, 32, local4);
					this.method423(local9 - 1, 2, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method423(local9, 1, local4);
					this.method423(local9 + 1, 16, local4 - 1);
				}
				if (arg2 == 1) {
					this.method423(local9, 4, local4);
					this.method423(local9 + 1, 64, local4 + 1);
				}
				if (arg2 == 2) {
					this.method423(local9, 16, local4);
					this.method423(local9 - 1, 1, local4 + 1);
				}
				if (arg2 == 3) {
					this.method423(local9, 64, local4);
					this.method423(local9 - 1, 4, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method423(local9, 130, local4);
					this.method423(local9, 8, local4 - 1);
					this.method423(local9 + 1, 32, local4);
				}
				if (arg2 == 1) {
					this.method423(local9, 10, local4);
					this.method423(local9 + 1, 32, local4);
					this.method423(local9, 128, local4 + 1);
				}
				if (arg2 == 2) {
					this.method423(local9, 40, local4);
					this.method423(local9, 128, local4 + 1);
					this.method423(local9 - 1, 2, local4);
				}
				if (arg2 == 3) {
					this.method423(local9, 160, local4);
					this.method423(local9 - 1, 2, local4);
					this.method423(local9, 8, local4 - 1);
				}
			}
			if (arg4) {
				if (arg0 == 0) {
					if (arg2 == 0) {
						this.method423(local9, 65536, local4);
						this.method423(local9, 4096, local4 - 1);
					}
					if (arg2 == 1) {
						this.method423(local9, 1024, local4);
						this.method423(local9 + 1, 16384, local4);
					}
					if (arg2 == 2) {
						this.method423(local9, 4096, local4);
						this.method423(local9, 65536, local4 + 1);
					}
					if (arg2 == 3) {
						this.method423(local9, 16384, local4);
						this.method423(local9 - 1, 1024, local4);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg2 == 0) {
						this.method423(local9, 512, local4);
						this.method423(local9 + 1, 8192, local4 - 1);
					}
					if (arg2 == 1) {
						this.method423(local9, 2048, local4);
						this.method423(local9 + 1, 32768, local4 + 1);
					}
					if (arg2 == 2) {
						this.method423(local9, 8192, local4);
						this.method423(local9 - 1, 512, local4 + 1);
					}
					if (arg2 == 3) {
						this.method423(local9, 32768, local4);
						this.method423(local9 - 1, 2048, local4 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg2 == 0) {
						this.method423(local9, 66560, local4);
						this.method423(local9, 4096, local4 - 1);
						this.method423(local9 + 1, 16384, local4);
					}
					if (arg2 == 1) {
						this.method423(local9, 5120, local4);
						this.method423(local9 + 1, 16384, local4);
						this.method423(local9, 65536, local4 + 1);
					}
					if (arg2 == 2) {
						this.method423(local9, 20480, local4);
						this.method423(local9, 65536, local4 + 1);
						this.method423(local9 - 1, 1024, local4);
					}
					if (arg2 == 3) {
						this.method423(local9, 81920, local4);
						this.method423(local9 - 1, 1024, local4);
						this.method423(local9, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("7381, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIIZI)V")
	public void method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt659;
			@Pc(24) int local24 = arg0 - this.anInt660;
			@Pc(32) int local32;
			if (arg2 == 1 || arg2 == 3) {
				local32 = arg5;
				arg5 = arg1;
				arg1 = local32;
			}
			for (local32 = local14; local32 < local14 + arg5; local32++) {
				if (local32 >= 0 && local32 < this.anInt661) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg1; local48++) {
						if (local48 >= 0 && local48 < this.anInt662) {
							this.method423(local48, local3, local32);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("47442, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray18[arg2][arg0] &= 16777215 - arg1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16210, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -24643 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt659;
			@Pc(23) int local23 = arg0 - this.anInt660;
			this.anIntArrayArray18[local4][local23] &= 0xDFFFFF;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("74301, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg1 && arg4 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt659;
			@Pc(17) int local17 = arg4 - this.anInt660;
			@Pc(22) int local22 = arg1 - this.anInt659;
			@Pc(27) int local27 = arg5 - this.anInt660;
			if (arg3 == 0) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("12196, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg5 && arg1 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt659;
			@Pc(17) int local17 = arg1 - this.anInt660;
			@Pc(28) int local28 = arg5 - this.anInt659;
			@Pc(33) int local33 = arg3 - this.anInt660;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("61420, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg0 - 1;
			@Pc(11) int local11 = arg2 + arg6 - 1;
			if (arg5 >= arg3 && arg5 <= local5 && arg1 >= arg2 && arg1 <= local11) {
				return true;
			} else if (arg5 == arg3 - 1 && arg1 >= arg2 && arg1 <= local11 && (this.anIntArrayArray18[arg5 - this.anInt659][arg1 - this.anInt660] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg1 >= arg2 && arg1 <= local11 && (this.anIntArrayArray18[arg5 - this.anInt659][arg1 - this.anInt660] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg2 - 1 && arg5 >= arg3 && arg5 <= local5 && (this.anIntArrayArray18[arg5 - this.anInt659][arg1 - this.anInt660] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local11 + 1 && arg5 >= arg3 && arg5 <= local5 && (this.anIntArrayArray18[arg5 - this.anInt659][arg1 - this.anInt660] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("80597, " + arg0 + ", " + arg1 + ", " + -103 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}

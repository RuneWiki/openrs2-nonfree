import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YCMSDYIA")
public final class Class47 {

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "I")
	private int anInt769 = 135;

	@OriginalMember(owner = "client!YCMSDYIA", name = "c", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!YCMSDYIA", name = "d", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!YCMSDYIA", name = "e", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!YCMSDYIA", name = "f", descriptor = "I")
	private int anInt771;

	@OriginalMember(owner = "client!YCMSDYIA", name = "g", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!YCMSDYIA", name = "b", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!YCMSDYIA", name = "h", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!YCMSDYIA", name = "i", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!YCMSDYIA", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!YCMSDYIA", name = "<init>", descriptor = "(IZI)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt771 = 0;
			this.anInt772 = 0;
			this.anInt773 = arg0;
			this.anInt774 = arg2;
			this.anIntArrayArray17 = new int[this.anInt773][this.anInt774];
			this.method514();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("40191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "()V")
	public void method514() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt773; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt774; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt773 - 1 || local7 == this.anInt774 - 1) {
					this.anIntArrayArray17[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray17[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(ZIIIII)V")
	public void method515(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) int local11 = arg4 - this.anInt771;
			@Pc(16) int local16 = arg2 - this.anInt772;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method518(local11, local16, 128);
					this.method518(local11 - 1, local16, 8);
				}
				if (arg1 == 1) {
					this.method518(local11, local16, 2);
					this.method518(local11, local16 + 1, 32);
				}
				if (arg1 == 2) {
					this.method518(local11, local16, 8);
					this.method518(local11 + 1, local16, 128);
				}
				if (arg1 == 3) {
					this.method518(local11, local16, 32);
					this.method518(local11, local16 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method518(local11, local16, 1);
					this.method518(local11 - 1, local16 + 1, 16);
				}
				if (arg1 == 1) {
					this.method518(local11, local16, 4);
					this.method518(local11 + 1, local16 + 1, 64);
				}
				if (arg1 == 2) {
					this.method518(local11, local16, 16);
					this.method518(local11 + 1, local16 - 1, 1);
				}
				if (arg1 == 3) {
					this.method518(local11, local16, 64);
					this.method518(local11 - 1, local16 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method518(local11, local16, 130);
					this.method518(local11 - 1, local16, 8);
					this.method518(local11, local16 + 1, 32);
				}
				if (arg1 == 1) {
					this.method518(local11, local16, 10);
					this.method518(local11, local16 + 1, 32);
					this.method518(local11 + 1, local16, 128);
				}
				if (arg1 == 2) {
					this.method518(local11, local16, 40);
					this.method518(local11 + 1, local16, 128);
					this.method518(local11, local16 - 1, 2);
				}
				if (arg1 == 3) {
					this.method518(local11, local16, 160);
					this.method518(local11, local16 - 1, 2);
					this.method518(local11 - 1, local16, 8);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method518(local11, local16, 65536);
						this.method518(local11 - 1, local16, 4096);
					}
					if (arg1 == 1) {
						this.method518(local11, local16, 1024);
						this.method518(local11, local16 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method518(local11, local16, 4096);
						this.method518(local11 + 1, local16, 65536);
					}
					if (arg1 == 3) {
						this.method518(local11, local16, 16384);
						this.method518(local11, local16 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method518(local11, local16, 512);
						this.method518(local11 - 1, local16 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method518(local11, local16, 2048);
						this.method518(local11 + 1, local16 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method518(local11, local16, 8192);
						this.method518(local11 + 1, local16 - 1, 512);
					}
					if (arg1 == 3) {
						this.method518(local11, local16, 32768);
						this.method518(local11 - 1, local16 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method518(local11, local16, 66560);
						this.method518(local11 - 1, local16, 4096);
						this.method518(local11, local16 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method518(local11, local16, 5120);
						this.method518(local11, local16 + 1, 16384);
						this.method518(local11 + 1, local16, 65536);
					}
					if (arg1 == 2) {
						this.method518(local11, local16, 20480);
						this.method518(local11 + 1, local16, 65536);
						this.method518(local11, local16 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method518(local11, local16, 81920);
						this.method518(local11, local16 - 1, 1024);
						this.method518(local11 - 1, local16, 4096);
						return;
					}
				}
			}
		} catch (@Pc(468) RuntimeException local468) {
			signlink.reporterror("1659, " + arg0 + ", " + arg1 + ", " + -978 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local468.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(ZIIIIII)V")
	public void method516(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt771;
			@Pc(22) int local22 = arg4 - this.anInt772;
			@Pc(30) int local30;
			if (arg2 == 1 || arg2 == 3) {
				local30 = arg3;
				arg3 = arg5;
				arg5 = local30;
			}
			for (local30 = local14; local30 < local14 + arg3; local30++) {
				if (local30 >= 0 && local30 < this.anInt773) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg5; local46++) {
						if (local46 >= 0 && local46 < this.anInt774) {
							this.method518(local30, local46, local3);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("65915, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 555 + ", " + arg5 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IZI)V")
	public void method517(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt771;
			@Pc(9) int local9 = arg2 - this.anInt772;
			this.anIntArrayArray17[local4][local9] |= 0x200000;
			if (!arg1) {
				;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("64895, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(III)V")
	private void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "b", descriptor = "(ZIIIII)V")
	public void method519(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt771;
			@Pc(12) int local12 = arg2 - this.anInt772;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method521(local4, 128, local12);
					this.method521(local4 - 1, 8, local12);
				}
				if (arg1 == 1) {
					this.method521(local4, 2, local12);
					this.method521(local4, 32, local12 + 1);
				}
				if (arg1 == 2) {
					this.method521(local4, 8, local12);
					this.method521(local4 + 1, 128, local12);
				}
				if (arg1 == 3) {
					this.method521(local4, 32, local12);
					this.method521(local4, 2, local12 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method521(local4, 1, local12);
					this.method521(local4 - 1, 16, local12 + 1);
				}
				if (arg1 == 1) {
					this.method521(local4, 4, local12);
					this.method521(local4 + 1, 64, local12 + 1);
				}
				if (arg1 == 2) {
					this.method521(local4, 16, local12);
					this.method521(local4 + 1, 1, local12 - 1);
				}
				if (arg1 == 3) {
					this.method521(local4, 64, local12);
					this.method521(local4 - 1, 4, local12 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method521(local4, 130, local12);
					this.method521(local4 - 1, 8, local12);
					this.method521(local4, 32, local12 + 1);
				}
				if (arg1 == 1) {
					this.method521(local4, 10, local12);
					this.method521(local4, 32, local12 + 1);
					this.method521(local4 + 1, 128, local12);
				}
				if (arg1 == 2) {
					this.method521(local4, 40, local12);
					this.method521(local4 + 1, 128, local12);
					this.method521(local4, 2, local12 - 1);
				}
				if (arg1 == 3) {
					this.method521(local4, 160, local12);
					this.method521(local4, 2, local12 - 1);
					this.method521(local4 - 1, 8, local12);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method521(local4, 65536, local12);
						this.method521(local4 - 1, 4096, local12);
					}
					if (arg1 == 1) {
						this.method521(local4, 1024, local12);
						this.method521(local4, 16384, local12 + 1);
					}
					if (arg1 == 2) {
						this.method521(local4, 4096, local12);
						this.method521(local4 + 1, 65536, local12);
					}
					if (arg1 == 3) {
						this.method521(local4, 16384, local12);
						this.method521(local4, 1024, local12 - 1);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method521(local4, 512, local12);
						this.method521(local4 - 1, 8192, local12 + 1);
					}
					if (arg1 == 1) {
						this.method521(local4, 2048, local12);
						this.method521(local4 + 1, 32768, local12 + 1);
					}
					if (arg1 == 2) {
						this.method521(local4, 8192, local12);
						this.method521(local4 + 1, 512, local12 - 1);
					}
					if (arg1 == 3) {
						this.method521(local4, 32768, local12);
						this.method521(local4 - 1, 2048, local12 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method521(local4, 66560, local12);
						this.method521(local4 - 1, 4096, local12);
						this.method521(local4, 16384, local12 + 1);
					}
					if (arg1 == 1) {
						this.method521(local4, 5120, local12);
						this.method521(local4, 16384, local12 + 1);
						this.method521(local4 + 1, 65536, local12);
					}
					if (arg1 == 2) {
						this.method521(local4, 20480, local12);
						this.method521(local4 + 1, 65536, local12);
						this.method521(local4, 1024, local12 - 1);
					}
					if (arg1 == 3) {
						this.method521(local4, 81920, local12);
						this.method521(local4, 1024, local12 - 1);
						this.method521(local4 - 1, 4096, local12);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("43682, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 233 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IZIIIIZ)V")
	public void method520(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(12) int local12 = 256;
			if (arg1) {
				local12 = 131328;
			}
			@Pc(23) int local23 = arg2 - this.anInt771;
			@Pc(28) int local28 = arg5 - this.anInt772;
			@Pc(36) int local36;
			if (arg3 == 1 || arg3 == 3) {
				local36 = arg0;
				arg0 = arg4;
				arg4 = local36;
			}
			for (local36 = local23; local36 < local23 + arg0; local36++) {
				if (local36 >= 0 && local36 < this.anInt773) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg4; local52++) {
						if (local52 >= 0 && local52 < this.anInt774) {
							this.method521(local36, local12, local52);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("42002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IBII)V")
	private void method521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray17[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("69434, " + arg0 + ", " + 10 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "b", descriptor = "(III)V")
	public void method522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt771;
			@Pc(20) int local20 = arg0 - this.anInt772;
			this.anIntArrayArray17[local4][local20] &= 0xDFFFFF;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("29626, " + arg0 + ", " + 47403 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IIIZIII)Z")
	public boolean method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg4 && arg0 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt771;
			@Pc(17) int local17 = arg0 - this.anInt772;
			@Pc(22) int local22 = arg4 - this.anInt771;
			@Pc(27) int local27 = arg2 - this.anInt772;
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("3827, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg2 && arg5 == arg3) {
				return true;
			}
			@Pc(22) int local22 = arg0 - this.anInt771;
			@Pc(27) int local27 = arg5 - this.anInt772;
			@Pc(32) int local32 = arg2 - this.anInt771;
			@Pc(37) int local37 = arg3 - this.anInt772;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x80) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x8) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x8) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x80) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("42478, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCMSDYIA", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg2 + arg0 - 1;
			@Pc(17) int local17 = arg6 + arg3 - 1;
			if (arg4 >= arg2 && arg4 <= local11 && arg1 >= arg6 && arg1 <= local17) {
				return true;
			} else if (arg4 == arg2 - 1 && arg1 >= arg6 && arg1 <= local17 && (this.anIntArrayArray17[arg4 - this.anInt771][arg1 - this.anInt772] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg4 == local11 + 1 && arg1 >= arg6 && arg1 <= local17 && (this.anIntArrayArray17[arg4 - this.anInt771][arg1 - this.anInt772] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg6 - 1 && arg4 >= arg2 && arg4 <= local11 && (this.anIntArrayArray17[arg4 - this.anInt771][arg1 - this.anInt772] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local17 + 1 && arg4 >= arg2 && arg4 <= local11 && (this.anIntArrayArray17[arg4 - this.anInt771][arg1 - this.anInt772] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("73808, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}

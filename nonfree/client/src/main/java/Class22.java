import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LQLHEUAQ")
public final class Class22 {

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "B")
	private byte aByte11 = -72;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "b", descriptor = "I")
	private int anInt444 = 650;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "c", descriptor = "B")
	private byte aByte12 = -82;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "d", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "e", descriptor = "I")
	private int anInt445 = 366;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "f", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "g", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "h", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "i", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "j", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "k", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!LQLHEUAQ", name = "<init>", descriptor = "(BII)V")
	public Class22(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt446 = 0;
			this.anInt447 = 0;
			this.anInt448 = arg2;
			this.anInt449 = arg1;
			this.anIntArrayArray6 = new int[this.anInt448][this.anInt449];
			this.method258();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("4842, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "()V")
	public void method258() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt448; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt449; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt448 - 1 || local7 == this.anInt449 - 1) {
					this.anIntArrayArray6[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray6[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(ZIIIIZ)V")
	public void method259(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt446;
			@Pc(19) int local19 = arg4 - this.anInt447;
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method262(local4, local19, 128);
					this.method262(local4 - 1, local19, 8);
				}
				if (arg2 == 1) {
					this.method262(local4, local19, 2);
					this.method262(local4, local19 + 1, 32);
				}
				if (arg2 == 2) {
					this.method262(local4, local19, 8);
					this.method262(local4 + 1, local19, 128);
				}
				if (arg2 == 3) {
					this.method262(local4, local19, 32);
					this.method262(local4, local19 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method262(local4, local19, 1);
					this.method262(local4 - 1, local19 + 1, 16);
				}
				if (arg2 == 1) {
					this.method262(local4, local19, 4);
					this.method262(local4 + 1, local19 + 1, 64);
				}
				if (arg2 == 2) {
					this.method262(local4, local19, 16);
					this.method262(local4 + 1, local19 - 1, 1);
				}
				if (arg2 == 3) {
					this.method262(local4, local19, 64);
					this.method262(local4 - 1, local19 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method262(local4, local19, 130);
					this.method262(local4 - 1, local19, 8);
					this.method262(local4, local19 + 1, 32);
				}
				if (arg2 == 1) {
					this.method262(local4, local19, 10);
					this.method262(local4, local19 + 1, 32);
					this.method262(local4 + 1, local19, 128);
				}
				if (arg2 == 2) {
					this.method262(local4, local19, 40);
					this.method262(local4 + 1, local19, 128);
					this.method262(local4, local19 - 1, 2);
				}
				if (arg2 == 3) {
					this.method262(local4, local19, 160);
					this.method262(local4, local19 - 1, 2);
					this.method262(local4 - 1, local19, 8);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg2 == 0) {
						this.method262(local4, local19, 65536);
						this.method262(local4 - 1, local19, 4096);
					}
					if (arg2 == 1) {
						this.method262(local4, local19, 1024);
						this.method262(local4, local19 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method262(local4, local19, 4096);
						this.method262(local4 + 1, local19, 65536);
					}
					if (arg2 == 3) {
						this.method262(local4, local19, 16384);
						this.method262(local4, local19 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg2 == 0) {
						this.method262(local4, local19, 512);
						this.method262(local4 - 1, local19 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method262(local4, local19, 2048);
						this.method262(local4 + 1, local19 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method262(local4, local19, 8192);
						this.method262(local4 + 1, local19 - 1, 512);
					}
					if (arg2 == 3) {
						this.method262(local4, local19, 32768);
						this.method262(local4 - 1, local19 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg2 == 0) {
						this.method262(local4, local19, 66560);
						this.method262(local4 - 1, local19, 4096);
						this.method262(local4, local19 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method262(local4, local19, 5120);
						this.method262(local4, local19 + 1, 16384);
						this.method262(local4 + 1, local19, 65536);
					}
					if (arg2 == 2) {
						this.method262(local4, local19, 20480);
						this.method262(local4 + 1, local19, 65536);
						this.method262(local4, local19 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method262(local4, local19, 81920);
						this.method262(local4, local19 - 1, 1024);
						this.method262(local4 - 1, local19, 4096);
						return;
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("83785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIZIIII)V")
	public void method260(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt446;
			@Pc(19) int local19 = arg0 - this.anInt447;
			@Pc(31) int local31;
			if (arg3 == 1 || arg3 == 3) {
				local31 = arg2;
				arg2 = arg5;
				arg5 = local31;
			}
			for (local31 = local14; local31 < local14 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt448) {
					for (@Pc(47) int local47 = local19; local47 < local19 + arg5; local47++) {
						if (local47 >= 0 && local47 < this.anInt449) {
							this.method262(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("93361, " + -47563 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(III)V")
	public void method261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt446;
			@Pc(9) int local9 = arg1 - this.anInt447;
			this.anIntArrayArray6[local4][local9] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("16316, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "b", descriptor = "(III)V")
	private void method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray6[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(ZIBIII)V")
	public void method263(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt446;
			@Pc(9) int local9 = arg4 - this.anInt447;
			@Pc(14) boolean local14 = false;
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method265(local4, 128, local9);
					this.method265(local4 - 1, 8, local9);
				}
				if (arg5 == 1) {
					this.method265(local4, 2, local9);
					this.method265(local4, 32, local9 + 1);
				}
				if (arg5 == 2) {
					this.method265(local4, 8, local9);
					this.method265(local4 + 1, 128, local9);
				}
				if (arg5 == 3) {
					this.method265(local4, 32, local9);
					this.method265(local4, 2, local9 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method265(local4, 1, local9);
					this.method265(local4 - 1, 16, local9 + 1);
				}
				if (arg5 == 1) {
					this.method265(local4, 4, local9);
					this.method265(local4 + 1, 64, local9 + 1);
				}
				if (arg5 == 2) {
					this.method265(local4, 16, local9);
					this.method265(local4 + 1, 1, local9 - 1);
				}
				if (arg5 == 3) {
					this.method265(local4, 64, local9);
					this.method265(local4 - 1, 4, local9 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method265(local4, 130, local9);
					this.method265(local4 - 1, 8, local9);
					this.method265(local4, 32, local9 + 1);
				}
				if (arg5 == 1) {
					this.method265(local4, 10, local9);
					this.method265(local4, 32, local9 + 1);
					this.method265(local4 + 1, 128, local9);
				}
				if (arg5 == 2) {
					this.method265(local4, 40, local9);
					this.method265(local4 + 1, 128, local9);
					this.method265(local4, 2, local9 - 1);
				}
				if (arg5 == 3) {
					this.method265(local4, 160, local9);
					this.method265(local4, 2, local9 - 1);
					this.method265(local4 - 1, 8, local9);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg5 == 0) {
						this.method265(local4, 65536, local9);
						this.method265(local4 - 1, 4096, local9);
					}
					if (arg5 == 1) {
						this.method265(local4, 1024, local9);
						this.method265(local4, 16384, local9 + 1);
					}
					if (arg5 == 2) {
						this.method265(local4, 4096, local9);
						this.method265(local4 + 1, 65536, local9);
					}
					if (arg5 == 3) {
						this.method265(local4, 16384, local9);
						this.method265(local4, 1024, local9 - 1);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg5 == 0) {
						this.method265(local4, 512, local9);
						this.method265(local4 - 1, 8192, local9 + 1);
					}
					if (arg5 == 1) {
						this.method265(local4, 2048, local9);
						this.method265(local4 + 1, 32768, local9 + 1);
					}
					if (arg5 == 2) {
						this.method265(local4, 8192, local9);
						this.method265(local4 + 1, 512, local9 - 1);
					}
					if (arg5 == 3) {
						this.method265(local4, 32768, local9);
						this.method265(local4 - 1, 2048, local9 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg5 == 0) {
						this.method265(local4, 66560, local9);
						this.method265(local4 - 1, 4096, local9);
						this.method265(local4, 16384, local9 + 1);
					}
					if (arg5 == 1) {
						this.method265(local4, 5120, local9);
						this.method265(local4, 16384, local9 + 1);
						this.method265(local4 + 1, 65536, local9);
					}
					if (arg5 == 2) {
						this.method265(local4, 20480, local9);
						this.method265(local4 + 1, 65536, local9);
						this.method265(local4, 1024, local9 - 1);
					}
					if (arg5 == 3) {
						this.method265(local4, 81920, local9);
						this.method265(local4, 1024, local9 - 1);
						this.method265(local4 - 1, 4096, local9);
						return;
					}
				}
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("6368, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIIZ)V")
	public void method264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(6) int local6 = 256;
			if (arg5) {
				local6 = 131328;
			}
			@Pc(17) int local17 = arg3 - this.anInt446;
			@Pc(22) int local22 = arg1 - this.anInt447;
			@Pc(30) int local30;
			if (arg0 == 1 || arg0 == 3) {
				local30 = arg2;
				arg2 = arg4;
				arg4 = local30;
			}
			for (local30 = local17; local30 < local17 + arg2; local30++) {
				if (local30 >= 0 && local30 < this.anInt448) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg4; local46++) {
						if (local46 >= 0 && local46 < this.anInt449) {
							this.method265(local30, local6, local46);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("6758, " + 650 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIII)V")
	private void method265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray6[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("28921, " + 927 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(BII)V")
	public void method266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aByte12 != -82) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(15) int local15 = arg1 - this.anInt446;
			@Pc(20) int local20 = arg0 - this.anInt447;
			this.anIntArrayArray6[local15][local20] &= 0xDFFFFF;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("44562, " + -82 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIBI)Z")
	public boolean method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 == arg3 && arg1 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt446;
			@Pc(17) boolean local17 = false;
			@Pc(27) int local27 = arg1 - this.anInt447;
			@Pc(32) int local32 = arg3 - this.anInt446;
			@Pc(37) int local37 = arg0 - this.anInt447;
			if (arg2 == 0) {
				if (arg6 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray6[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray6[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray6[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray6[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg6 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray6[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray6[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray6[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray6[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray6[local12][local27] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray6[local12][local27] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray6[local12][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("90897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg2 == arg0 && arg1 == arg6) {
				return true;
			}
			@Pc(16) int local16 = arg2 - this.anInt446;
			@Pc(21) int local21 = arg1 - this.anInt447;
			@Pc(26) int local26 = arg0 - this.anInt446;
			@Pc(31) int local31 = arg6 - this.anInt447;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray6[local16][local21] & 0x80) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray6[local16][local21] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray6[local16][local21] & 0x8) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray6[local16][local21] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray6[local16][local21] & 0x8) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray6[local16][local21] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray6[local16][local21] & 0x80) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray6[local16][local21] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray6[local16][local21] & 0x20) == 0) {
					return true;
				}
				if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray6[local16][local21] & 0x2) == 0) {
					return true;
				}
				if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray6[local16][local21] & 0x8) == 0) {
					return true;
				}
				if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray6[local16][local21] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("7785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQLHEUAQ", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(14) int local14 = arg0 + arg1 - 1;
			@Pc(20) int local20 = arg4 + arg2 - 1;
			if (arg6 >= arg0 && arg6 <= local14 && arg3 >= arg4 && arg3 <= local20) {
				return true;
			} else if (arg6 == arg0 - 1 && arg3 >= arg4 && arg3 <= local20 && (this.anIntArrayArray6[arg6 - this.anInt446][arg3 - this.anInt447] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg6 == local14 + 1 && arg3 >= arg4 && arg3 <= local20 && (this.anIntArrayArray6[arg6 - this.anInt446][arg3 - this.anInt447] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg4 - 1 && arg6 >= arg0 && arg6 <= local14 && (this.anIntArrayArray6[arg6 - this.anInt446][arg3 - this.anInt447] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local20 + 1 && arg6 >= arg0 && arg6 <= local14 && (this.anIntArrayArray6[arg6 - this.anInt446][arg3 - this.anInt447] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("48299, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}
}

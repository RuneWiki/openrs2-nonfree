import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt659 = 9;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt660 = 722;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt661 = 9;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IBI)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt662 = 0;
			this.anInt663 = 0;
			this.anInt664 = arg2;
			if (arg1 != 3) {
				throw new NullPointerException();
			}
			@Pc(32) boolean local32 = false;
			this.anInt665 = arg0;
			this.anIntArrayArray18 = new int[this.anInt664][this.anInt665];
			this.method420();
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("50509, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method420() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt664; local6++) {
				for (@Pc(10) int local10 = 0; local10 < this.anInt665; local10++) {
					if (local6 == 0 || local10 == 0 || local6 == this.anInt664 - 1 || local10 == this.anInt665 - 1) {
						this.anIntArrayArray18[local6][local10] = 16777215;
					} else {
						this.anIntArrayArray18[local6][local10] = 0;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("22975, " + 214 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIBZ)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt662;
			@Pc(9) boolean local9 = false;
			@Pc(24) int local24 = arg1 - this.anInt663;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method424(local4, local24, 128);
					this.method424(local4 - 1, local24, 8);
				}
				if (arg3 == 1) {
					this.method424(local4, local24, 2);
					this.method424(local4, local24 + 1, 32);
				}
				if (arg3 == 2) {
					this.method424(local4, local24, 8);
					this.method424(local4 + 1, local24, 128);
				}
				if (arg3 == 3) {
					this.method424(local4, local24, 32);
					this.method424(local4, local24 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method424(local4, local24, 1);
					this.method424(local4 - 1, local24 + 1, 16);
				}
				if (arg3 == 1) {
					this.method424(local4, local24, 4);
					this.method424(local4 + 1, local24 + 1, 64);
				}
				if (arg3 == 2) {
					this.method424(local4, local24, 16);
					this.method424(local4 + 1, local24 - 1, 1);
				}
				if (arg3 == 3) {
					this.method424(local4, local24, 64);
					this.method424(local4 - 1, local24 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method424(local4, local24, 130);
					this.method424(local4 - 1, local24, 8);
					this.method424(local4, local24 + 1, 32);
				}
				if (arg3 == 1) {
					this.method424(local4, local24, 10);
					this.method424(local4, local24 + 1, 32);
					this.method424(local4 + 1, local24, 128);
				}
				if (arg3 == 2) {
					this.method424(local4, local24, 40);
					this.method424(local4 + 1, local24, 128);
					this.method424(local4, local24 - 1, 2);
				}
				if (arg3 == 3) {
					this.method424(local4, local24, 160);
					this.method424(local4, local24 - 1, 2);
					this.method424(local4 - 1, local24, 8);
				}
			}
			if (arg5) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method424(local4, local24, 65536);
						this.method424(local4 - 1, local24, 4096);
					}
					if (arg3 == 1) {
						this.method424(local4, local24, 1024);
						this.method424(local4, local24 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method424(local4, local24, 4096);
						this.method424(local4 + 1, local24, 65536);
					}
					if (arg3 == 3) {
						this.method424(local4, local24, 16384);
						this.method424(local4, local24 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method424(local4, local24, 512);
						this.method424(local4 - 1, local24 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method424(local4, local24, 2048);
						this.method424(local4 + 1, local24 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method424(local4, local24, 8192);
						this.method424(local4 + 1, local24 - 1, 512);
					}
					if (arg3 == 3) {
						this.method424(local4, local24, 32768);
						this.method424(local4 - 1, local24 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method424(local4, local24, 66560);
						this.method424(local4 - 1, local24, 4096);
						this.method424(local4, local24 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method424(local4, local24, 5120);
						this.method424(local4, local24 + 1, 16384);
						this.method424(local4 + 1, local24, 65536);
					}
					if (arg3 == 2) {
						this.method424(local4, local24, 20480);
						this.method424(local4 + 1, local24, 65536);
						this.method424(local4, local24 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method424(local4, local24, 81920);
						this.method424(local4, local24 - 1, 1024);
						this.method424(local4 - 1, local24, 4096);
						return;
					}
				}
			}
		} catch (@Pc(476) RuntimeException local476) {
			signlink.reporterror("97104, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local476.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZIZI)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt662;
			@Pc(19) int local19 = arg1 - this.anInt663;
			@Pc(36) int local36;
			if (arg4 == 1 || arg4 == 3) {
				local36 = arg0;
				arg0 = arg2;
				arg2 = local36;
			}
			for (local36 = local14; local36 < local14 + arg0; local36++) {
				if (local36 >= 0 && local36 < this.anInt664) {
					for (@Pc(52) int local52 = local19; local52 < local19 + arg2; local52++) {
						if (local52 >= 0 && local52 < this.anInt665) {
							this.method424(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("4712, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt662;
			@Pc(18) int local18 = arg1 - this.anInt663;
			this.anIntArrayArray18[local4][local18] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("55231, " + arg0 + ", " + false + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIII)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt662;
			@Pc(9) int local9 = arg0 - this.anInt663;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method427(128, 722, local9, local4);
					this.method427(8, 722, local9, local4 - 1);
				}
				if (arg3 == 1) {
					this.method427(2, 722, local9, local4);
					this.method427(32, 722, local9 + 1, local4);
				}
				if (arg3 == 2) {
					this.method427(8, 722, local9, local4);
					this.method427(128, 722, local9, local4 + 1);
				}
				if (arg3 == 3) {
					this.method427(32, 722, local9, local4);
					this.method427(2, 722, local9 - 1, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method427(1, 722, local9, local4);
					this.method427(16, 722, local9 + 1, local4 - 1);
				}
				if (arg3 == 1) {
					this.method427(4, 722, local9, local4);
					this.method427(64, 722, local9 + 1, local4 + 1);
				}
				if (arg3 == 2) {
					this.method427(16, 722, local9, local4);
					this.method427(1, 722, local9 - 1, local4 + 1);
				}
				if (arg3 == 3) {
					this.method427(64, 722, local9, local4);
					this.method427(4, 722, local9 - 1, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method427(130, 722, local9, local4);
					this.method427(8, 722, local9, local4 - 1);
					this.method427(32, 722, local9 + 1, local4);
				}
				if (arg3 == 1) {
					this.method427(10, 722, local9, local4);
					this.method427(32, 722, local9 + 1, local4);
					this.method427(128, 722, local9, local4 + 1);
				}
				if (arg3 == 2) {
					this.method427(40, 722, local9, local4);
					this.method427(128, 722, local9, local4 + 1);
					this.method427(2, 722, local9 - 1, local4);
				}
				if (arg3 == 3) {
					this.method427(160, 722, local9, local4);
					this.method427(2, 722, local9 - 1, local4);
					this.method427(8, 722, local9, local4 - 1);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method427(65536, 722, local9, local4);
						this.method427(4096, 722, local9, local4 - 1);
					}
					if (arg3 == 1) {
						this.method427(1024, 722, local9, local4);
						this.method427(16384, 722, local9 + 1, local4);
					}
					if (arg3 == 2) {
						this.method427(4096, 722, local9, local4);
						this.method427(65536, 722, local9, local4 + 1);
					}
					if (arg3 == 3) {
						this.method427(16384, 722, local9, local4);
						this.method427(1024, 722, local9 - 1, local4);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method427(512, 722, local9, local4);
						this.method427(8192, 722, local9 + 1, local4 - 1);
					}
					if (arg3 == 1) {
						this.method427(2048, 722, local9, local4);
						this.method427(32768, 722, local9 + 1, local4 + 1);
					}
					if (arg3 == 2) {
						this.method427(8192, 722, local9, local4);
						this.method427(512, 722, local9 - 1, local4 + 1);
					}
					if (arg3 == 3) {
						this.method427(32768, 722, local9, local4);
						this.method427(2048, 722, local9 - 1, local4 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method427(66560, 722, local9, local4);
						this.method427(4096, 722, local9, local4 - 1);
						this.method427(16384, 722, local9 + 1, local4);
					}
					if (arg3 == 1) {
						this.method427(5120, 722, local9, local4);
						this.method427(16384, 722, local9 + 1, local4);
						this.method427(65536, 722, local9, local4 + 1);
					}
					if (arg3 == 2) {
						this.method427(20480, 722, local9, local4);
						this.method427(65536, 722, local9, local4 + 1);
						this.method427(1024, 722, local9 - 1, local4);
					}
					if (arg3 == 3) {
						this.method427(81920, 722, local9, local4);
						this.method427(1024, 722, local9 - 1, local4);
						this.method427(4096, 722, local9, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("4145, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 667 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZI)V")
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(18) int local18 = arg1 - this.anInt662;
			@Pc(23) int local23 = arg5 - this.anInt663;
			@Pc(31) int local31;
			if (arg0 == 1 || arg0 == 3) {
				local31 = arg2;
				arg2 = arg3;
				arg3 = local31;
			}
			for (local31 = local18; local31 < local18 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt664) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg3; local47++) {
						if (local47 >= 0 && local47 < this.anInt665) {
							this.method427(local3, 722, local47, local31);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("97980, " + arg0 + ", " + arg1 + ", " + -49110 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			this.anIntArrayArray18[arg3][arg2] &= 16777215 - arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("39554, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public void method428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt662;
			@Pc(12) int local12 = arg0 - this.anInt663;
			this.anIntArrayArray18[local4][local12] &= 0xDFFFFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("87563, " + 181 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg5 && arg0 == arg4) {
				return true;
			}
			@Pc(23) int local23 = arg2 - this.anInt662;
			@Pc(28) int local28 = arg0 - this.anInt663;
			@Pc(33) int local33 = arg5 - this.anInt662;
			@Pc(38) int local38 = arg4 - this.anInt663;
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local23 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x280120) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local23 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280108) == 0) {
						return true;
					}
					if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local23 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x280120) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local23 == local33 && local28 == local38 - 1) {
						return true;
					}
					if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280108) == 0) {
						return true;
					}
					if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local23 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280180) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280108) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local23 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280108) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x280120) == 0) {
						return true;
					}
					if (local23 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local23 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x280120) == 0) {
						return true;
					}
					if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x280180) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x20) == 0) {
					return true;
				}
				if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x2) == 0) {
					return true;
				}
				if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x8) == 0) {
					return true;
				}
				if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(571) RuntimeException local571) {
			signlink.reporterror("50819, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg2 && arg0 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt662;
			@Pc(17) int local17 = arg0 - this.anInt663;
			@Pc(22) int local22 = arg2 - this.anInt662;
			@Pc(34) int local34 = arg4 - this.anInt663;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("97614, " + arg0 + ", " + arg1 + ", " + -94 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg2 + arg6 - 1;
			@Pc(11) int local11 = arg3 + arg5 - 1;
			@Pc(15) int local15 = 92 / arg1;
			if (arg4 >= arg2 && arg4 <= local5 && arg7 >= arg3 && arg7 <= local11) {
				return true;
			} else if (arg4 == arg2 - 1 && arg7 >= arg3 && arg7 <= local11 && (this.anIntArrayArray18[arg4 - this.anInt662][arg7 - this.anInt663] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg4 == local5 + 1 && arg7 >= arg3 && arg7 <= local11 && (this.anIntArrayArray18[arg4 - this.anInt662][arg7 - this.anInt663] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg7 == arg3 - 1 && arg4 >= arg2 && arg4 <= local5 && (this.anIntArrayArray18[arg4 - this.anInt662][arg7 - this.anInt663] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg7 == local11 + 1 && arg4 >= arg2 && arg4 <= local5 && (this.anIntArrayArray18[arg4 - this.anInt662][arg7 - this.anInt663] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("27800, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}

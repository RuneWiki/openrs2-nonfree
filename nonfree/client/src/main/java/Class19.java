import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt680 = 701;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt681 = 1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt682 = 1;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt683 = 1;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIZ)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt684 = 0;
			this.anInt685 = 0;
			this.anInt686 = arg1;
			this.anInt687 = arg0;
			this.anIntArrayArray18 = new int[this.anInt686][this.anInt687];
			this.method417((byte) 5);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("81539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public void method417(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt686; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt687; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt686 - 1 || local7 == this.anInt687 - 1) {
						this.anIntArrayArray18[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray18[local3][local7] = 0;
					}
				}
			}
			@Pc(56) boolean local56 = false;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("57495, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIBI)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt684;
			@Pc(9) int local9 = arg3 - this.anInt685;
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method421(local4, local9, 128);
					this.method421(local4 - 1, local9, 8);
				}
				if (arg0 == 1) {
					this.method421(local4, local9, 2);
					this.method421(local4, local9 + 1, 32);
				}
				if (arg0 == 2) {
					this.method421(local4, local9, 8);
					this.method421(local4 + 1, local9, 128);
				}
				if (arg0 == 3) {
					this.method421(local4, local9, 32);
					this.method421(local4, local9 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method421(local4, local9, 1);
					this.method421(local4 - 1, local9 + 1, 16);
				}
				if (arg0 == 1) {
					this.method421(local4, local9, 4);
					this.method421(local4 + 1, local9 + 1, 64);
				}
				if (arg0 == 2) {
					this.method421(local4, local9, 16);
					this.method421(local4 + 1, local9 - 1, 1);
				}
				if (arg0 == 3) {
					this.method421(local4, local9, 64);
					this.method421(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method421(local4, local9, 130);
					this.method421(local4 - 1, local9, 8);
					this.method421(local4, local9 + 1, 32);
				}
				if (arg0 == 1) {
					this.method421(local4, local9, 10);
					this.method421(local4, local9 + 1, 32);
					this.method421(local4 + 1, local9, 128);
				}
				if (arg0 == 2) {
					this.method421(local4, local9, 40);
					this.method421(local4 + 1, local9, 128);
					this.method421(local4, local9 - 1, 2);
				}
				if (arg0 == 3) {
					this.method421(local4, local9, 160);
					this.method421(local4, local9 - 1, 2);
					this.method421(local4 - 1, local9, 8);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg0 == 0) {
						this.method421(local4, local9, 65536);
						this.method421(local4 - 1, local9, 4096);
					}
					if (arg0 == 1) {
						this.method421(local4, local9, 1024);
						this.method421(local4, local9 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method421(local4, local9, 4096);
						this.method421(local4 + 1, local9, 65536);
					}
					if (arg0 == 3) {
						this.method421(local4, local9, 16384);
						this.method421(local4, local9 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg0 == 0) {
						this.method421(local4, local9, 512);
						this.method421(local4 - 1, local9 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method421(local4, local9, 2048);
						this.method421(local4 + 1, local9 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method421(local4, local9, 8192);
						this.method421(local4 + 1, local9 - 1, 512);
					}
					if (arg0 == 3) {
						this.method421(local4, local9, 32768);
						this.method421(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg0 == 0) {
						this.method421(local4, local9, 66560);
						this.method421(local4 - 1, local9, 4096);
						this.method421(local4, local9 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method421(local4, local9, 5120);
						this.method421(local4, local9 + 1, 16384);
						this.method421(local4 + 1, local9, 65536);
					}
					if (arg0 == 2) {
						this.method421(local4, local9, 20480);
						this.method421(local4 + 1, local9, 65536);
						this.method421(local4, local9 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method421(local4, local9, 81920);
						this.method421(local4, local9 - 1, 1024);
						this.method421(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("28567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 25 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZI)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt684;
			@Pc(28) int local28 = arg3 - this.anInt685;
			@Pc(36) int local36;
			if (arg4 == 1 || arg4 == 3) {
				local36 = arg0;
				arg0 = arg2;
				arg2 = local36;
			}
			for (local36 = local14; local36 < local14 + arg0; local36++) {
				if (local36 >= 0 && local36 < this.anInt686) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg2; local52++) {
						if (local52 >= 0 && local52 < this.anInt687) {
							this.method421(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("77136, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 9 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V")
	public void method420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt684;
			@Pc(12) int local12 = arg1 - this.anInt685;
			this.anIntArrayArray18[local4][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("58860, " + true + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIZIII)V")
	public void method422(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt684;
			@Pc(9) int local9 = arg3 - this.anInt685;
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method424(local9, this.anInt681, 128, local4);
					this.method424(local9, this.anInt681, 8, local4 - 1);
				}
				if (arg2 == 1) {
					this.method424(local9, this.anInt681, 2, local4);
					this.method424(local9 + 1, this.anInt681, 32, local4);
				}
				if (arg2 == 2) {
					this.method424(local9, this.anInt681, 8, local4);
					this.method424(local9, this.anInt681, 128, local4 + 1);
				}
				if (arg2 == 3) {
					this.method424(local9, this.anInt681, 32, local4);
					this.method424(local9 - 1, this.anInt681, 2, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method424(local9, this.anInt681, 1, local4);
					this.method424(local9 + 1, this.anInt681, 16, local4 - 1);
				}
				if (arg2 == 1) {
					this.method424(local9, this.anInt681, 4, local4);
					this.method424(local9 + 1, this.anInt681, 64, local4 + 1);
				}
				if (arg2 == 2) {
					this.method424(local9, this.anInt681, 16, local4);
					this.method424(local9 - 1, this.anInt681, 1, local4 + 1);
				}
				if (arg2 == 3) {
					this.method424(local9, this.anInt681, 64, local4);
					this.method424(local9 - 1, this.anInt681, 4, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method424(local9, this.anInt681, 130, local4);
					this.method424(local9, this.anInt681, 8, local4 - 1);
					this.method424(local9 + 1, this.anInt681, 32, local4);
				}
				if (arg2 == 1) {
					this.method424(local9, this.anInt681, 10, local4);
					this.method424(local9 + 1, this.anInt681, 32, local4);
					this.method424(local9, this.anInt681, 128, local4 + 1);
				}
				if (arg2 == 2) {
					this.method424(local9, this.anInt681, 40, local4);
					this.method424(local9, this.anInt681, 128, local4 + 1);
					this.method424(local9 - 1, this.anInt681, 2, local4);
				}
				if (arg2 == 3) {
					this.method424(local9, this.anInt681, 160, local4);
					this.method424(local9 - 1, this.anInt681, 2, local4);
					this.method424(local9, this.anInt681, 8, local4 - 1);
				}
			}
			if (arg1) {
				if (arg0 == 0) {
					if (arg2 == 0) {
						this.method424(local9, this.anInt681, 65536, local4);
						this.method424(local9, this.anInt681, 4096, local4 - 1);
					}
					if (arg2 == 1) {
						this.method424(local9, this.anInt681, 1024, local4);
						this.method424(local9 + 1, this.anInt681, 16384, local4);
					}
					if (arg2 == 2) {
						this.method424(local9, this.anInt681, 4096, local4);
						this.method424(local9, this.anInt681, 65536, local4 + 1);
					}
					if (arg2 == 3) {
						this.method424(local9, this.anInt681, 16384, local4);
						this.method424(local9 - 1, this.anInt681, 1024, local4);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg2 == 0) {
						this.method424(local9, this.anInt681, 512, local4);
						this.method424(local9 + 1, this.anInt681, 8192, local4 - 1);
					}
					if (arg2 == 1) {
						this.method424(local9, this.anInt681, 2048, local4);
						this.method424(local9 + 1, this.anInt681, 32768, local4 + 1);
					}
					if (arg2 == 2) {
						this.method424(local9, this.anInt681, 8192, local4);
						this.method424(local9 - 1, this.anInt681, 512, local4 + 1);
					}
					if (arg2 == 3) {
						this.method424(local9, this.anInt681, 32768, local4);
						this.method424(local9 - 1, this.anInt681, 2048, local4 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg2 == 0) {
						this.method424(local9, this.anInt681, 66560, local4);
						this.method424(local9, this.anInt681, 4096, local4 - 1);
						this.method424(local9 + 1, this.anInt681, 16384, local4);
					}
					if (arg2 == 1) {
						this.method424(local9, this.anInt681, 5120, local4);
						this.method424(local9 + 1, this.anInt681, 16384, local4);
						this.method424(local9, this.anInt681, 65536, local4 + 1);
					}
					if (arg2 == 2) {
						this.method424(local9, this.anInt681, 20480, local4);
						this.method424(local9, this.anInt681, 65536, local4 + 1);
						this.method424(local9 - 1, this.anInt681, 1024, local4);
					}
					if (arg2 == 3) {
						this.method424(local9, this.anInt681, 81920, local4);
						this.method424(local9 - 1, this.anInt681, 1024, local4);
						this.method424(local9, this.anInt681, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(584) RuntimeException local584) {
			signlink.reporterror("15216, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local584.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIZI)V")
	public void method423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(17) int local17 = arg1 - this.anInt684;
			@Pc(22) int local22 = arg2 - this.anInt685;
			@Pc(30) int local30;
			if (arg3 == 1 || arg3 == 3) {
				local30 = arg0;
				arg0 = arg5;
				arg5 = local30;
			}
			for (local30 = local17; local30 < local17 + arg0; local30++) {
				if (local30 >= 0 && local30 < this.anInt686) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg5; local46++) {
						if (local46 >= 0 && local46 < this.anInt687) {
							this.method424(local46, this.anInt681, local3, local30);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("91724, " + -585 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray18[arg3][arg0] &= 16777215 - arg2;
			if (arg1 < this.anInt682 || arg1 > this.anInt682) {
				;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("43437, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt684;
			@Pc(9) int local9 = arg1 - this.anInt685;
			this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("74222, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIIII)Z")
	public boolean method426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg2 && arg5 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt684;
			@Pc(17) int local17 = arg5 - this.anInt685;
			@Pc(22) int local22 = arg2 - this.anInt684;
			@Pc(33) int local33 = arg3 - this.anInt685;
			if (arg4 == 0) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("41338, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 == arg0 && arg5 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt684;
			@Pc(17) int local17 = arg5 - this.anInt685;
			@Pc(28) int local28 = arg0 - this.anInt684;
			@Pc(33) int local33 = arg1 - this.anInt685;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
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
			signlink.reporterror("4227, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 6 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5;
			if (this.anInt683 != 1) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = arg0 + arg1 - 1;
			@Pc(22) int local22 = arg3 + arg6 - 1;
			if (arg5 >= arg0 && arg5 <= local5 && arg4 >= arg3 && arg4 <= local22) {
				return true;
			} else if (arg5 == arg0 - 1 && arg4 >= arg3 && arg4 <= local22 && (this.anIntArrayArray18[arg5 - this.anInt684][arg4 - this.anInt685] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg4 >= arg3 && arg4 <= local22 && (this.anIntArrayArray18[arg5 - this.anInt684][arg4 - this.anInt685] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg3 - 1 && arg5 >= arg0 && arg5 <= local5 && (this.anIntArrayArray18[arg5 - this.anInt684][arg4 - this.anInt685] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local22 + 1 && arg5 >= arg0 && arg5 <= local5 && (this.anIntArrayArray18[arg5 - this.anInt684][arg4 - this.anInt685] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("64530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}

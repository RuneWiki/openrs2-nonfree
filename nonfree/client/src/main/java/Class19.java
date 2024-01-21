import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt701 = 707;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt702 = 1727;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt703 = -30133;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt704 = -47208;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ZII)V")
	public Class19(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt705 = 0;
			this.anInt706 = 0;
			this.anInt707 = arg1;
			this.anInt708 = arg2;
			this.anIntArrayArray18 = new int[this.anInt707][this.anInt708];
			this.method420();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("75754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method420() {
		try {
			for (@Pc(17) int local17 = 0; local17 < this.anInt707; local17++) {
				for (@Pc(21) int local21 = 0; local21 < this.anInt708; local21++) {
					if (local17 == 0 || local21 == 0 || local17 == this.anInt707 - 1 || local21 == this.anInt708 - 1) {
						this.anIntArrayArray18[local17][local21] = 16777215;
					} else {
						this.anIntArrayArray18[local17][local21] = 0;
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("45955, " + 3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIII)V")
	public void method421(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt705;
			if (this.anInt702 != 1727) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			@Pc(20) int local20 = arg4 - this.anInt706;
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method424(local4, local20, 128);
					this.method424(local4 - 1, local20, 8);
				}
				if (arg2 == 1) {
					this.method424(local4, local20, 2);
					this.method424(local4, local20 + 1, 32);
				}
				if (arg2 == 2) {
					this.method424(local4, local20, 8);
					this.method424(local4 + 1, local20, 128);
				}
				if (arg2 == 3) {
					this.method424(local4, local20, 32);
					this.method424(local4, local20 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method424(local4, local20, 1);
					this.method424(local4 - 1, local20 + 1, 16);
				}
				if (arg2 == 1) {
					this.method424(local4, local20, 4);
					this.method424(local4 + 1, local20 + 1, 64);
				}
				if (arg2 == 2) {
					this.method424(local4, local20, 16);
					this.method424(local4 + 1, local20 - 1, 1);
				}
				if (arg2 == 3) {
					this.method424(local4, local20, 64);
					this.method424(local4 - 1, local20 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method424(local4, local20, 130);
					this.method424(local4 - 1, local20, 8);
					this.method424(local4, local20 + 1, 32);
				}
				if (arg2 == 1) {
					this.method424(local4, local20, 10);
					this.method424(local4, local20 + 1, 32);
					this.method424(local4 + 1, local20, 128);
				}
				if (arg2 == 2) {
					this.method424(local4, local20, 40);
					this.method424(local4 + 1, local20, 128);
					this.method424(local4, local20 - 1, 2);
				}
				if (arg2 == 3) {
					this.method424(local4, local20, 160);
					this.method424(local4, local20 - 1, 2);
					this.method424(local4 - 1, local20, 8);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg2 == 0) {
						this.method424(local4, local20, 65536);
						this.method424(local4 - 1, local20, 4096);
					}
					if (arg2 == 1) {
						this.method424(local4, local20, 1024);
						this.method424(local4, local20 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method424(local4, local20, 4096);
						this.method424(local4 + 1, local20, 65536);
					}
					if (arg2 == 3) {
						this.method424(local4, local20, 16384);
						this.method424(local4, local20 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg2 == 0) {
						this.method424(local4, local20, 512);
						this.method424(local4 - 1, local20 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method424(local4, local20, 2048);
						this.method424(local4 + 1, local20 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method424(local4, local20, 8192);
						this.method424(local4 + 1, local20 - 1, 512);
					}
					if (arg2 == 3) {
						this.method424(local4, local20, 32768);
						this.method424(local4 - 1, local20 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg2 == 0) {
						this.method424(local4, local20, 66560);
						this.method424(local4 - 1, local20, 4096);
						this.method424(local4, local20 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method424(local4, local20, 5120);
						this.method424(local4, local20 + 1, 16384);
						this.method424(local4 + 1, local20, 65536);
					}
					if (arg2 == 2) {
						this.method424(local4, local20, 20480);
						this.method424(local4 + 1, local20, 65536);
						this.method424(local4, local20 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method424(local4, local20, 81920);
						this.method424(local4, local20 - 1, 1024);
						this.method424(local4 - 1, local20, 4096);
						return;
					}
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("25031, " + 1727 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIZII)V")
	public void method422(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt705;
			@Pc(19) int local19 = arg1 - this.anInt706;
			@Pc(27) int local27;
			if (arg5 == 1 || arg5 == 3) {
				local27 = arg4;
				arg4 = arg3;
				arg3 = local27;
			}
			for (local27 = local14; local27 < local14 + arg4; local27++) {
				if (local27 >= 0 && local27 < this.anInt707) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg3; local43++) {
						if (local43 >= 0 && local43 < this.anInt708) {
							this.method424(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("40879, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) int local7 = arg0 - this.anInt705;
			@Pc(12) int local12 = arg1 - this.anInt706;
			this.anIntArrayArray18[local7][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("91033, " + arg0 + ", " + arg1 + ", " + -447 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt705;
			@Pc(9) int local9 = arg2 - this.anInt706;
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method427(local4, local9, 128);
					this.method427(local4 - 1, local9, 8);
				}
				if (arg1 == 1) {
					this.method427(local4, local9, 2);
					this.method427(local4, local9 + 1, 32);
				}
				if (arg1 == 2) {
					this.method427(local4, local9, 8);
					this.method427(local4 + 1, local9, 128);
				}
				if (arg1 == 3) {
					this.method427(local4, local9, 32);
					this.method427(local4, local9 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method427(local4, local9, 1);
					this.method427(local4 - 1, local9 + 1, 16);
				}
				if (arg1 == 1) {
					this.method427(local4, local9, 4);
					this.method427(local4 + 1, local9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method427(local4, local9, 16);
					this.method427(local4 + 1, local9 - 1, 1);
				}
				if (arg1 == 3) {
					this.method427(local4, local9, 64);
					this.method427(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method427(local4, local9, 130);
					this.method427(local4 - 1, local9, 8);
					this.method427(local4, local9 + 1, 32);
				}
				if (arg1 == 1) {
					this.method427(local4, local9, 10);
					this.method427(local4, local9 + 1, 32);
					this.method427(local4 + 1, local9, 128);
				}
				if (arg1 == 2) {
					this.method427(local4, local9, 40);
					this.method427(local4 + 1, local9, 128);
					this.method427(local4, local9 - 1, 2);
				}
				if (arg1 == 3) {
					this.method427(local4, local9, 160);
					this.method427(local4, local9 - 1, 2);
					this.method427(local4 - 1, local9, 8);
				}
			}
			if (arg3) {
				if (arg0 == 0) {
					if (arg1 == 0) {
						this.method427(local4, local9, 65536);
						this.method427(local4 - 1, local9, 4096);
					}
					if (arg1 == 1) {
						this.method427(local4, local9, 1024);
						this.method427(local4, local9 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method427(local4, local9, 4096);
						this.method427(local4 + 1, local9, 65536);
					}
					if (arg1 == 3) {
						this.method427(local4, local9, 16384);
						this.method427(local4, local9 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg1 == 0) {
						this.method427(local4, local9, 512);
						this.method427(local4 - 1, local9 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method427(local4, local9, 2048);
						this.method427(local4 + 1, local9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method427(local4, local9, 8192);
						this.method427(local4 + 1, local9 - 1, 512);
					}
					if (arg1 == 3) {
						this.method427(local4, local9, 32768);
						this.method427(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg1 == 0) {
						this.method427(local4, local9, 66560);
						this.method427(local4 - 1, local9, 4096);
						this.method427(local4, local9 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method427(local4, local9, 5120);
						this.method427(local4, local9 + 1, 16384);
						this.method427(local4 + 1, local9, 65536);
					}
					if (arg1 == 2) {
						this.method427(local4, local9, 20480);
						this.method427(local4 + 1, local9, 65536);
						this.method427(local4, local9 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method427(local4, local9, 81920);
						this.method427(local4, local9 - 1, 1024);
						this.method427(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("54185, " + arg0 + ", " + 93 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZBIIII)V")
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			@Pc(8) boolean local8 = false;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(29) int local29 = arg4 - this.anInt705;
			@Pc(34) int local34 = arg5 - this.anInt706;
			@Pc(42) int local42;
			if (arg3 == 1 || arg3 == 3) {
				local42 = arg0;
				arg0 = arg6;
				arg6 = local42;
			}
			for (local42 = local29; local42 < local29 + arg0; local42++) {
				if (local42 >= 0 && local42 < this.anInt707) {
					for (@Pc(58) int local58 = local34; local58 < local34 + arg6; local58++) {
						if (local58 >= 0 && local58 < this.anInt708) {
							this.method427(local42, local58, local3);
						}
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("49300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anInt703 == -30133) {
				this.anIntArrayArray18[arg0][arg1] &= 16777215 - arg2;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("81614, " + arg0 + ", " + arg1 + ", " + -30133 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	public void method428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt705;
			@Pc(9) int local9 = arg1 - this.anInt706;
			this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("14972, " + arg0 + ", " + -5814 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg3 && arg0 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt705;
			@Pc(17) int local17 = arg0 - this.anInt706;
			if (this.anInt704 != -47208) {
				throw new NullPointerException();
			}
			@Pc(30) int local30 = arg3 - this.anInt705;
			@Pc(35) int local35 = arg4 - this.anInt706;
			if (arg5 == 0) {
				if (arg2 == 0) {
					if (local12 == local30 - 1 && local17 == local35) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local30 && local17 == local35 + 1) {
						return true;
					}
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local30 + 1 && local17 == local35) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local30 && local17 == local35 - 1) {
						return true;
					}
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					if (local12 == local30 - 1 && local17 == local35) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1) {
						return true;
					}
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1) {
						return true;
					}
					if (local12 == local30 + 1 && local17 == local35) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local30 + 1 && local17 == local35) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local30 - 1 && local17 == local35) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(568) RuntimeException local568) {
			signlink.reporterror("77877, " + -47208 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local568.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 == arg3 && arg4 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt705;
			@Pc(17) int local17 = arg4 - this.anInt706;
			@Pc(22) int local22 = arg3 - this.anInt705;
			@Pc(27) int local27 = arg1 - this.anInt706;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
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
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("34523, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(14) int local14 = arg6 + arg2 - 1;
			@Pc(20) int local20 = arg0 + arg3 - 1;
			if (arg5 >= arg6 && arg5 <= local14 && arg4 >= arg0 && arg4 <= local20) {
				return true;
			} else if (arg5 == arg6 - 1 && arg4 >= arg0 && arg4 <= local20 && (this.anIntArrayArray18[arg5 - this.anInt705][arg4 - this.anInt706] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg5 == local14 + 1 && arg4 >= arg0 && arg4 <= local20 && (this.anIntArrayArray18[arg5 - this.anInt705][arg4 - this.anInt706] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg0 - 1 && arg5 >= arg6 && arg5 <= local14 && (this.anIntArrayArray18[arg5 - this.anInt705][arg4 - this.anInt706] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local20 + 1 && arg5 >= arg6 && arg5 <= local14 && (this.anIntArrayArray18[arg5 - this.anInt705][arg4 - this.anInt706] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("65524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt672 = -550;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt674 = 8;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt675 = 70;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "B")
	private byte aByte40 = 99;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt676 = 1;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	private int anInt680;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt677 = 0;
			this.anInt678 = 0;
			this.anInt679 = arg2;
			this.anInt680 = arg1;
			this.anIntArrayArray18 = new int[this.anInt679][this.anInt680];
			@Pc(50) int local50 = 13 / arg0;
			this.method417();
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("80242, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method417() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt679; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt680; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt679 - 1 || local7 == this.anInt680 - 1) {
						this.anIntArrayArray18[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray18[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("70688, " + 3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZIII)V")
	public void method418(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt677;
			@Pc(9) int local9 = arg4 - this.anInt678;
			if (arg2 == 0) {
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
			if (arg2 == 1 || arg2 == 3) {
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
			if (arg2 == 2) {
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
			if (arg1) {
				if (arg2 == 0) {
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
				if (arg2 == 1 || arg2 == 3) {
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
				if (arg2 == 2) {
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
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("37924, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIIII)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt677;
			@Pc(19) int local19 = arg0 - this.anInt678;
			@Pc(27) int local27;
			if (arg5 == 1 || arg5 == 3) {
				local27 = arg1;
				arg1 = arg4;
				arg4 = local27;
			}
			for (local27 = local14; local27 < local14 + arg1; local27++) {
				if (local27 >= 0 && local27 < this.anInt679) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg4; local43++) {
						if (local43 >= 0 && local43 < this.anInt680) {
							this.method421(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("81800, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -24520 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt677;
			@Pc(12) int local12 = arg1 - this.anInt678;
			this.anIntArrayArray18[local4][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("80528, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZB)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt677;
			@Pc(19) int local19 = arg2 - this.anInt678;
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method424(local4, local19, 128);
					this.method424(local4 - 1, local19, 8);
				}
				if (arg0 == 1) {
					this.method424(local4, local19, 2);
					this.method424(local4, local19 + 1, 32);
				}
				if (arg0 == 2) {
					this.method424(local4, local19, 8);
					this.method424(local4 + 1, local19, 128);
				}
				if (arg0 == 3) {
					this.method424(local4, local19, 32);
					this.method424(local4, local19 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method424(local4, local19, 1);
					this.method424(local4 - 1, local19 + 1, 16);
				}
				if (arg0 == 1) {
					this.method424(local4, local19, 4);
					this.method424(local4 + 1, local19 + 1, 64);
				}
				if (arg0 == 2) {
					this.method424(local4, local19, 16);
					this.method424(local4 + 1, local19 - 1, 1);
				}
				if (arg0 == 3) {
					this.method424(local4, local19, 64);
					this.method424(local4 - 1, local19 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method424(local4, local19, 130);
					this.method424(local4 - 1, local19, 8);
					this.method424(local4, local19 + 1, 32);
				}
				if (arg0 == 1) {
					this.method424(local4, local19, 10);
					this.method424(local4, local19 + 1, 32);
					this.method424(local4 + 1, local19, 128);
				}
				if (arg0 == 2) {
					this.method424(local4, local19, 40);
					this.method424(local4 + 1, local19, 128);
					this.method424(local4, local19 - 1, 2);
				}
				if (arg0 == 3) {
					this.method424(local4, local19, 160);
					this.method424(local4, local19 - 1, 2);
					this.method424(local4 - 1, local19, 8);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg0 == 0) {
						this.method424(local4, local19, 65536);
						this.method424(local4 - 1, local19, 4096);
					}
					if (arg0 == 1) {
						this.method424(local4, local19, 1024);
						this.method424(local4, local19 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method424(local4, local19, 4096);
						this.method424(local4 + 1, local19, 65536);
					}
					if (arg0 == 3) {
						this.method424(local4, local19, 16384);
						this.method424(local4, local19 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg0 == 0) {
						this.method424(local4, local19, 512);
						this.method424(local4 - 1, local19 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method424(local4, local19, 2048);
						this.method424(local4 + 1, local19 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method424(local4, local19, 8192);
						this.method424(local4 + 1, local19 - 1, 512);
					}
					if (arg0 == 3) {
						this.method424(local4, local19, 32768);
						this.method424(local4 - 1, local19 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg0 == 0) {
						this.method424(local4, local19, 66560);
						this.method424(local4 - 1, local19, 4096);
						this.method424(local4, local19 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method424(local4, local19, 5120);
						this.method424(local4, local19 + 1, 16384);
						this.method424(local4 + 1, local19, 65536);
					}
					if (arg0 == 2) {
						this.method424(local4, local19, 20480);
						this.method424(local4 + 1, local19, 65536);
						this.method424(local4, local19 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method424(local4, local19, 81920);
						this.method424(local4, local19 - 1, 1024);
						this.method424(local4 - 1, local19, 4096);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("35289, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZIII)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt677;
			@Pc(19) int local19 = arg1 - this.anInt678;
			@Pc(31) int local31;
			if (arg4 == 1 || arg4 == 3) {
				local31 = arg5;
				arg5 = arg0;
				arg0 = local31;
			}
			for (local31 = local14; local31 < local14 + arg5; local31++) {
				if (local31 >= 0 && local31 < this.anInt679) {
					for (@Pc(47) int local47 = local19; local47 < local19 + arg0; local47++) {
						if (local47 >= 0 && local47 < this.anInt680) {
							this.method424(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("63255, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray18[arg0][arg1] &= 16777215 - arg2;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32560, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg1 - this.anInt677;
			@Pc(12) int local12 = arg0 - this.anInt678;
			this.anIntArrayArray18[local7][local12] &= 0xDFFFFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("56700, " + arg0 + ", " + true + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 == arg3 && arg4 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt677;
			@Pc(17) int local17 = arg4 - this.anInt678;
			@Pc(22) int local22 = arg3 - this.anInt677;
			@Pc(27) int local27 = arg0 - this.anInt678;
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
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
			if (arg2 == 2) {
				if (arg1 == 0) {
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
				} else if (arg1 == 1) {
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
				} else if (arg1 == 2) {
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
				} else if (arg1 == 3) {
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
			if (arg2 == 9) {
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
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("58304, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -628 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg0 && arg1 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt677;
			@Pc(23) int local23 = arg1 - this.anInt678;
			@Pc(28) int local28 = arg0 - this.anInt677;
			@Pc(33) int local33 = arg2 - this.anInt678;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("39211, " + -58 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg7 + arg0 - 1;
			@Pc(11) int local11 = arg1 + arg4 - 1;
			if (arg3 < this.anInt676 || arg3 > this.anInt676) {
				this.anInt673 = 337;
			}
			if (arg5 >= arg7 && arg5 <= local5 && arg2 >= arg1 && arg2 <= local11) {
				return true;
			} else if (arg5 == arg7 - 1 && arg2 >= arg1 && arg2 <= local11 && (this.anIntArrayArray18[arg5 - this.anInt677][arg2 - this.anInt678] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg2 >= arg1 && arg2 <= local11 && (this.anIntArrayArray18[arg5 - this.anInt677][arg2 - this.anInt678] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg2 == arg1 - 1 && arg5 >= arg7 && arg5 <= local5 && (this.anIntArrayArray18[arg5 - this.anInt677][arg2 - this.anInt678] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local11 + 1 && arg5 >= arg7 && arg5 <= local5 && (this.anIntArrayArray18[arg5 - this.anInt677][arg2 - this.anInt678] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("55272, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}

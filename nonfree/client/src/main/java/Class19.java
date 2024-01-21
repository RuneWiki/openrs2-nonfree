import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt683 = 4;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt684 = 25762;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt685 = 4;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt686 = 0;
			this.anInt687 = 0;
			this.anInt688 = arg1;
			this.anInt689 = arg2;
			this.anIntArrayArray18 = new int[this.anInt688][this.anInt689];
			this.method420();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("87354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method420() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt688; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt689; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt688 - 1 || local7 == this.anInt689 - 1) {
						this.anIntArrayArray18[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray18[local3][local7] = 0;
					}
				}
			}
			if (this.anInt684 == 25762) {
				;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("37523, " + 25762 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt686;
			@Pc(18) int local18 = arg3 - this.anInt687;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method424(local4, local18, 128);
					this.method424(local4 - 1, local18, 8);
				}
				if (arg4 == 1) {
					this.method424(local4, local18, 2);
					this.method424(local4, local18 + 1, 32);
				}
				if (arg4 == 2) {
					this.method424(local4, local18, 8);
					this.method424(local4 + 1, local18, 128);
				}
				if (arg4 == 3) {
					this.method424(local4, local18, 32);
					this.method424(local4, local18 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method424(local4, local18, 1);
					this.method424(local4 - 1, local18 + 1, 16);
				}
				if (arg4 == 1) {
					this.method424(local4, local18, 4);
					this.method424(local4 + 1, local18 + 1, 64);
				}
				if (arg4 == 2) {
					this.method424(local4, local18, 16);
					this.method424(local4 + 1, local18 - 1, 1);
				}
				if (arg4 == 3) {
					this.method424(local4, local18, 64);
					this.method424(local4 - 1, local18 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method424(local4, local18, 130);
					this.method424(local4 - 1, local18, 8);
					this.method424(local4, local18 + 1, 32);
				}
				if (arg4 == 1) {
					this.method424(local4, local18, 10);
					this.method424(local4, local18 + 1, 32);
					this.method424(local4 + 1, local18, 128);
				}
				if (arg4 == 2) {
					this.method424(local4, local18, 40);
					this.method424(local4 + 1, local18, 128);
					this.method424(local4, local18 - 1, 2);
				}
				if (arg4 == 3) {
					this.method424(local4, local18, 160);
					this.method424(local4, local18 - 1, 2);
					this.method424(local4 - 1, local18, 8);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method424(local4, local18, 65536);
						this.method424(local4 - 1, local18, 4096);
					}
					if (arg4 == 1) {
						this.method424(local4, local18, 1024);
						this.method424(local4, local18 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method424(local4, local18, 4096);
						this.method424(local4 + 1, local18, 65536);
					}
					if (arg4 == 3) {
						this.method424(local4, local18, 16384);
						this.method424(local4, local18 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method424(local4, local18, 512);
						this.method424(local4 - 1, local18 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method424(local4, local18, 2048);
						this.method424(local4 + 1, local18 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method424(local4, local18, 8192);
						this.method424(local4 + 1, local18 - 1, 512);
					}
					if (arg4 == 3) {
						this.method424(local4, local18, 32768);
						this.method424(local4 - 1, local18 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method424(local4, local18, 66560);
						this.method424(local4 - 1, local18, 4096);
						this.method424(local4, local18 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method424(local4, local18, 5120);
						this.method424(local4, local18 + 1, 16384);
						this.method424(local4 + 1, local18, 65536);
					}
					if (arg4 == 2) {
						this.method424(local4, local18, 20480);
						this.method424(local4 + 1, local18, 65536);
						this.method424(local4, local18 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method424(local4, local18, 81920);
						this.method424(local4, local18 - 1, 1024);
						this.method424(local4 - 1, local18, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("88539, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIIII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt686;
			@Pc(19) int local19 = arg3 - this.anInt687;
			@Pc(27) int local27;
			if (arg0 == 1 || arg0 == 3) {
				local27 = arg4;
				arg4 = arg5;
				arg5 = local27;
			}
			for (local27 = local14; local27 < local14 + arg4; local27++) {
				if (local27 >= 0 && local27 < this.anInt688) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg5; local43++) {
						if (local43 >= 0 && local43 < this.anInt689) {
							this.method424(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("3266, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 6 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt686;
			@Pc(9) int local9 = arg0 - this.anInt687;
			this.anIntArrayArray18[local4][local9] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("54286, " + arg0 + ", " + -564 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZIII)V")
	public void method425(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) int local7 = arg4 - this.anInt686;
			@Pc(12) int local12 = arg2 - this.anInt687;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method427(local12, local7, 128);
					this.method427(local12, local7 - 1, 8);
				}
				if (arg1 == 1) {
					this.method427(local12, local7, 2);
					this.method427(local12 + 1, local7, 32);
				}
				if (arg1 == 2) {
					this.method427(local12, local7, 8);
					this.method427(local12, local7 + 1, 128);
				}
				if (arg1 == 3) {
					this.method427(local12, local7, 32);
					this.method427(local12 - 1, local7, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method427(local12, local7, 1);
					this.method427(local12 + 1, local7 - 1, 16);
				}
				if (arg1 == 1) {
					this.method427(local12, local7, 4);
					this.method427(local12 + 1, local7 + 1, 64);
				}
				if (arg1 == 2) {
					this.method427(local12, local7, 16);
					this.method427(local12 - 1, local7 + 1, 1);
				}
				if (arg1 == 3) {
					this.method427(local12, local7, 64);
					this.method427(local12 - 1, local7 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method427(local12, local7, 130);
					this.method427(local12, local7 - 1, 8);
					this.method427(local12 + 1, local7, 32);
				}
				if (arg1 == 1) {
					this.method427(local12, local7, 10);
					this.method427(local12 + 1, local7, 32);
					this.method427(local12, local7 + 1, 128);
				}
				if (arg1 == 2) {
					this.method427(local12, local7, 40);
					this.method427(local12, local7 + 1, 128);
					this.method427(local12 - 1, local7, 2);
				}
				if (arg1 == 3) {
					this.method427(local12, local7, 160);
					this.method427(local12 - 1, local7, 2);
					this.method427(local12, local7 - 1, 8);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method427(local12, local7, 65536);
						this.method427(local12, local7 - 1, 4096);
					}
					if (arg1 == 1) {
						this.method427(local12, local7, 1024);
						this.method427(local12 + 1, local7, 16384);
					}
					if (arg1 == 2) {
						this.method427(local12, local7, 4096);
						this.method427(local12, local7 + 1, 65536);
					}
					if (arg1 == 3) {
						this.method427(local12, local7, 16384);
						this.method427(local12 - 1, local7, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method427(local12, local7, 512);
						this.method427(local12 + 1, local7 - 1, 8192);
					}
					if (arg1 == 1) {
						this.method427(local12, local7, 2048);
						this.method427(local12 + 1, local7 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method427(local12, local7, 8192);
						this.method427(local12 - 1, local7 + 1, 512);
					}
					if (arg1 == 3) {
						this.method427(local12, local7, 32768);
						this.method427(local12 - 1, local7 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method427(local12, local7, 66560);
						this.method427(local12, local7 - 1, 4096);
						this.method427(local12 + 1, local7, 16384);
					}
					if (arg1 == 1) {
						this.method427(local12, local7, 5120);
						this.method427(local12 + 1, local7, 16384);
						this.method427(local12, local7 + 1, 65536);
					}
					if (arg1 == 2) {
						this.method427(local12, local7, 20480);
						this.method427(local12, local7 + 1, 65536);
						this.method427(local12 - 1, local7, 1024);
					}
					if (arg1 == 3) {
						this.method427(local12, local7, 81920);
						this.method427(local12 - 1, local7, 1024);
						this.method427(local12, local7 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("94471, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(17) int local17 = arg5 - this.anInt686;
			@Pc(22) int local22 = arg4 - this.anInt687;
			@Pc(30) int local30;
			if (arg3 == 1 || arg3 == 3) {
				local30 = arg2;
				arg2 = arg0;
				arg0 = local30;
			}
			for (local30 = local17; local30 < local17 + arg2; local30++) {
				if (local30 >= 0 && local30 < this.anInt688) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg0; local46++) {
						if (local46 >= 0 && local46 < this.anInt689) {
							this.method427(local46, local30, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("98020, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray18[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("59359, " + 920 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	public void method428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt686;
			@Pc(9) int local9 = arg1 - this.anInt687;
			this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("5732, " + arg0 + ", " + 310 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIBIII)Z")
	public boolean method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg2 && arg4 == arg1) {
				return true;
			}
			@Pc(19) int local19 = arg5 - this.anInt686;
			@Pc(24) int local24 = arg4 - this.anInt687;
			@Pc(29) int local29 = arg2 - this.anInt686;
			@Pc(34) int local34 = arg1 - this.anInt687;
			if (arg3 == 0) {
				if (arg0 == 0) {
					if (local19 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local19][local24] & 0x280120) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local19][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local19 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280108) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local19 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local19][local24] & 0x280120) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local19][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local19 == local29 && local24 == local34 - 1) {
						return true;
					}
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280108) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					if (local19 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280180) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local19][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280108) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local19][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280108) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local19][local24] & 0x280120) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local19 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local19][local24] & 0x280120) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x280180) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local19][local24] & 0x20) == 0) {
					return true;
				}
				if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local19][local24] & 0x2) == 0) {
					return true;
				}
				if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x8) == 0) {
					return true;
				}
				if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local19][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("19353, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -84 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg3 && arg1 == arg2) {
				return true;
			}
			@Pc(18) int local18 = arg4 - this.anInt686;
			@Pc(23) int local23 = arg1 - this.anInt687;
			@Pc(28) int local28 = arg3 - this.anInt686;
			@Pc(33) int local33 = arg2 - this.anInt687;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("8876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -755 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(12) int local12 = arg1 + arg6 - 1;
			@Pc(18) int local18 = arg3 + arg0 - 1;
			if (arg4 >= arg1 && arg4 <= local12 && arg5 >= arg3 && arg5 <= local18) {
				return true;
			} else if (arg4 == arg1 - 1 && arg5 >= arg3 && arg5 <= local18 && (this.anIntArrayArray18[arg4 - this.anInt686][arg5 - this.anInt687] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg4 == local12 + 1 && arg5 >= arg3 && arg5 <= local18 && (this.anIntArrayArray18[arg4 - this.anInt686][arg5 - this.anInt687] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg3 - 1 && arg4 >= arg1 && arg4 <= local12 && (this.anIntArrayArray18[arg4 - this.anInt686][arg5 - this.anInt687] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local18 + 1 && arg4 >= arg1 && arg4 <= local12 && (this.anIntArrayArray18[arg4 - this.anInt686][arg5 - this.anInt687] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("90307, " + arg0 + ", " + arg1 + ", " + -30 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}

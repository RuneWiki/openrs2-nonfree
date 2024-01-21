import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UDXVXGJJ")
public final class Class38 {

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "I")
	private int anInt625 = -142;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "b", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "c", descriptor = "I")
	private int anInt626 = -967;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "d", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "e", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "f", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "g", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "h", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "i", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!UDXVXGJJ", name = "<init>", descriptor = "(III)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt627 = 0;
			this.anInt628 = 0;
			this.anInt629 = arg2;
			this.anInt630 = arg1;
			this.anIntArrayArray20 = new int[this.anInt629][this.anInt630];
			this.method453();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("63834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "()V")
	public void method453() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt629; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt630; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt629 - 1 || local7 == this.anInt630 - 1) {
					this.anIntArrayArray20[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray20[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(ZIIZII)V")
	public void method454(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt627;
			@Pc(12) int local12 = arg4 - this.anInt628;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method457(local4, local12, 128);
					this.method457(local4 - 1, local12, 8);
				}
				if (arg2 == 1) {
					this.method457(local4, local12, 2);
					this.method457(local4, local12 + 1, 32);
				}
				if (arg2 == 2) {
					this.method457(local4, local12, 8);
					this.method457(local4 + 1, local12, 128);
				}
				if (arg2 == 3) {
					this.method457(local4, local12, 32);
					this.method457(local4, local12 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method457(local4, local12, 1);
					this.method457(local4 - 1, local12 + 1, 16);
				}
				if (arg2 == 1) {
					this.method457(local4, local12, 4);
					this.method457(local4 + 1, local12 + 1, 64);
				}
				if (arg2 == 2) {
					this.method457(local4, local12, 16);
					this.method457(local4 + 1, local12 - 1, 1);
				}
				if (arg2 == 3) {
					this.method457(local4, local12, 64);
					this.method457(local4 - 1, local12 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method457(local4, local12, 130);
					this.method457(local4 - 1, local12, 8);
					this.method457(local4, local12 + 1, 32);
				}
				if (arg2 == 1) {
					this.method457(local4, local12, 10);
					this.method457(local4, local12 + 1, 32);
					this.method457(local4 + 1, local12, 128);
				}
				if (arg2 == 2) {
					this.method457(local4, local12, 40);
					this.method457(local4 + 1, local12, 128);
					this.method457(local4, local12 - 1, 2);
				}
				if (arg2 == 3) {
					this.method457(local4, local12, 160);
					this.method457(local4, local12 - 1, 2);
					this.method457(local4 - 1, local12, 8);
				}
			}
			if (arg0) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method457(local4, local12, 65536);
						this.method457(local4 - 1, local12, 4096);
					}
					if (arg2 == 1) {
						this.method457(local4, local12, 1024);
						this.method457(local4, local12 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method457(local4, local12, 4096);
						this.method457(local4 + 1, local12, 65536);
					}
					if (arg2 == 3) {
						this.method457(local4, local12, 16384);
						this.method457(local4, local12 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method457(local4, local12, 512);
						this.method457(local4 - 1, local12 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method457(local4, local12, 2048);
						this.method457(local4 + 1, local12 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method457(local4, local12, 8192);
						this.method457(local4 + 1, local12 - 1, 512);
					}
					if (arg2 == 3) {
						this.method457(local4, local12, 32768);
						this.method457(local4 - 1, local12 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method457(local4, local12, 66560);
						this.method457(local4 - 1, local12, 4096);
						this.method457(local4, local12 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method457(local4, local12, 5120);
						this.method457(local4, local12 + 1, 16384);
						this.method457(local4 + 1, local12, 65536);
					}
					if (arg2 == 2) {
						this.method457(local4, local12, 20480);
						this.method457(local4 + 1, local12, 65536);
						this.method457(local4, local12 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method457(local4, local12, 81920);
						this.method457(local4, local12 - 1, 1024);
						this.method457(local4 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("37510, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(IIIIZII)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(21) int local21 = arg5 - this.anInt627;
			@Pc(26) int local26 = arg0 - this.anInt628;
			@Pc(34) int local34;
			if (arg2 == 1 || arg2 == 3) {
				local34 = arg3;
				arg3 = arg1;
				arg1 = local34;
			}
			for (local34 = local21; local34 < local21 + arg3; local34++) {
				if (local34 >= 0 && local34 < this.anInt629) {
					for (@Pc(50) int local50 = local26; local50 < local26 + arg1; local50++) {
						if (local50 >= 0 && local50 < this.anInt630) {
							this.method457(local34, local50, local3);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("8496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + arg5 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(III)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt627;
			@Pc(9) int local9 = arg0 - this.anInt628;
			this.anIntArrayArray20[local4][local9] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("75205, " + arg0 + ", " + arg1 + ", " + 989 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "b", descriptor = "(III)V")
	private void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray20[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(ZIIIII)V")
	public void method458(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt627;
			@Pc(21) int local21 = arg3 - this.anInt628;
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method460(local21, 128, local4);
					this.method460(local21, 8, local4 - 1);
				}
				if (arg1 == 1) {
					this.method460(local21, 2, local4);
					this.method460(local21 + 1, 32, local4);
				}
				if (arg1 == 2) {
					this.method460(local21, 8, local4);
					this.method460(local21, 128, local4 + 1);
				}
				if (arg1 == 3) {
					this.method460(local21, 32, local4);
					this.method460(local21 - 1, 2, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method460(local21, 1, local4);
					this.method460(local21 + 1, 16, local4 - 1);
				}
				if (arg1 == 1) {
					this.method460(local21, 4, local4);
					this.method460(local21 + 1, 64, local4 + 1);
				}
				if (arg1 == 2) {
					this.method460(local21, 16, local4);
					this.method460(local21 - 1, 1, local4 + 1);
				}
				if (arg1 == 3) {
					this.method460(local21, 64, local4);
					this.method460(local21 - 1, 4, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method460(local21, 130, local4);
					this.method460(local21, 8, local4 - 1);
					this.method460(local21 + 1, 32, local4);
				}
				if (arg1 == 1) {
					this.method460(local21, 10, local4);
					this.method460(local21 + 1, 32, local4);
					this.method460(local21, 128, local4 + 1);
				}
				if (arg1 == 2) {
					this.method460(local21, 40, local4);
					this.method460(local21, 128, local4 + 1);
					this.method460(local21 - 1, 2, local4);
				}
				if (arg1 == 3) {
					this.method460(local21, 160, local4);
					this.method460(local21 - 1, 2, local4);
					this.method460(local21, 8, local4 - 1);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg1 == 0) {
						this.method460(local21, 65536, local4);
						this.method460(local21, 4096, local4 - 1);
					}
					if (arg1 == 1) {
						this.method460(local21, 1024, local4);
						this.method460(local21 + 1, 16384, local4);
					}
					if (arg1 == 2) {
						this.method460(local21, 4096, local4);
						this.method460(local21, 65536, local4 + 1);
					}
					if (arg1 == 3) {
						this.method460(local21, 16384, local4);
						this.method460(local21 - 1, 1024, local4);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg1 == 0) {
						this.method460(local21, 512, local4);
						this.method460(local21 + 1, 8192, local4 - 1);
					}
					if (arg1 == 1) {
						this.method460(local21, 2048, local4);
						this.method460(local21 + 1, 32768, local4 + 1);
					}
					if (arg1 == 2) {
						this.method460(local21, 8192, local4);
						this.method460(local21 - 1, 512, local4 + 1);
					}
					if (arg1 == 3) {
						this.method460(local21, 32768, local4);
						this.method460(local21 - 1, 2048, local4 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg1 == 0) {
						this.method460(local21, 66560, local4);
						this.method460(local21, 4096, local4 - 1);
						this.method460(local21 + 1, 16384, local4);
					}
					if (arg1 == 1) {
						this.method460(local21, 5120, local4);
						this.method460(local21 + 1, 16384, local4);
						this.method460(local21, 65536, local4 + 1);
					}
					if (arg1 == 2) {
						this.method460(local21, 20480, local4);
						this.method460(local21, 65536, local4 + 1);
						this.method460(local21 - 1, 1024, local4);
					}
					if (arg1 == 3) {
						this.method460(local21, 81920, local4);
						this.method460(local21 - 1, 1024, local4);
						this.method460(local21, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(529) RuntimeException local529) {
			signlink.reporterror("60791, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -967 + ", " + arg4 + ", " + local529.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(IIZIIII)V")
	public void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt627;
			@Pc(19) int local19 = arg0 - this.anInt628;
			@Pc(33) int local33;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg1;
				arg1 = arg4;
				arg4 = local33;
			}
			for (local33 = local14; local33 < local14 + arg1; local33++) {
				if (local33 >= 0 && local33 < this.anInt629) {
					for (@Pc(49) int local49 = local19; local49 < local19 + arg4; local49++) {
						if (local49 >= 0 && local49 < this.anInt630) {
							this.method460(local49, local3, local33);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("1019, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(BIII)V")
	private void method460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray20[arg2][arg0] &= 16777215 - arg1;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("90792, " + 90 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(ZII)V")
	public void method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt627;
			@Pc(19) int local19 = arg0 - this.anInt628;
			this.anIntArrayArray20[local4][local19] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("54666, " + true + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg1 && arg3 == arg5) {
				return true;
			}
			@Pc(18) int local18 = arg0 - this.anInt627;
			@Pc(23) int local23 = arg3 - this.anInt628;
			@Pc(28) int local28 = arg1 - this.anInt627;
			@Pc(33) int local33 = arg5 - this.anInt628;
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray20[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray20[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray20[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray20[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray20[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray20[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray20[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray20[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray20[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray20[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray20[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("93191, " + -83 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 11 / arg5;
			if (arg6 == arg4 && arg1 == arg3) {
				return true;
			}
			@Pc(16) int local16 = arg6 - this.anInt627;
			@Pc(21) int local21 = arg1 - this.anInt628;
			@Pc(26) int local26 = arg4 - this.anInt627;
			@Pc(31) int local31 = arg3 - this.anInt628;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray20[local16][local21] & 0x80) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray20[local16][local21] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray20[local16][local21] & 0x8) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray20[local16][local21] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray20[local16][local21] & 0x8) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray20[local16][local21] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray20[local16][local21] & 0x80) == 0) {
						return true;
					}
					if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray20[local16][local21] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local16 == local26 && local21 == local31 + 1 && (this.anIntArrayArray20[local16][local21] & 0x20) == 0) {
					return true;
				}
				if (local16 == local26 && local21 == local31 - 1 && (this.anIntArrayArray20[local16][local21] & 0x2) == 0) {
					return true;
				}
				if (local16 == local26 - 1 && local21 == local31 && (this.anIntArrayArray20[local16][local21] & 0x8) == 0) {
					return true;
				}
				if (local16 == local26 + 1 && local21 == local31 && (this.anIntArrayArray20[local16][local21] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("3235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDXVXGJJ", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg5 + arg2 - 1;
			@Pc(17) int local17 = arg6 + arg1 - 1;
			if (arg3 >= arg5 && arg3 <= local11 && arg4 >= arg6 && arg4 <= local17) {
				return true;
			} else if (arg3 == arg5 - 1 && arg4 >= arg6 && arg4 <= local17 && (this.anIntArrayArray20[arg3 - this.anInt627][arg4 - this.anInt628] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg3 == local11 + 1 && arg4 >= arg6 && arg4 <= local17 && (this.anIntArrayArray20[arg3 - this.anInt627][arg4 - this.anInt628] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg6 - 1 && arg3 >= arg5 && arg3 <= local11 && (this.anIntArrayArray20[arg3 - this.anInt627][arg4 - this.anInt628] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local17 + 1 && arg3 >= arg5 && arg3 <= local11 && (this.anIntArrayArray20[arg3 - this.anInt627][arg4 - this.anInt628] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("33897, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}

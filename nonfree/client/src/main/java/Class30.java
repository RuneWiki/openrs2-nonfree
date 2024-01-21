import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RUPQNTVM")
public final class Class30 {

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "I")
	private int anInt614 = 37;

	@OriginalMember(owner = "client!RUPQNTVM", name = "b", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!RUPQNTVM", name = "c", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!RUPQNTVM", name = "d", descriptor = "B")
	private byte aByte30 = 8;

	@OriginalMember(owner = "client!RUPQNTVM", name = "e", descriptor = "I")
	private int anInt615 = 4;

	@OriginalMember(owner = "client!RUPQNTVM", name = "f", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!RUPQNTVM", name = "g", descriptor = "I")
	private int anInt616 = -163;

	@OriginalMember(owner = "client!RUPQNTVM", name = "h", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!RUPQNTVM", name = "i", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!RUPQNTVM", name = "j", descriptor = "I")
	private int anInt619;

	@OriginalMember(owner = "client!RUPQNTVM", name = "k", descriptor = "I")
	private int anInt620;

	@OriginalMember(owner = "client!RUPQNTVM", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!RUPQNTVM", name = "<init>", descriptor = "(BII)V")
	public Class30(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt617 = 0;
			this.anInt618 = 0;
			this.anInt619 = arg2;
			this.anInt620 = arg1;
			this.anIntArrayArray14 = new int[this.anInt619][this.anInt620];
			@Pc(48) boolean local48 = false;
			this.method437();
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("13755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "()V")
	public void method437() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt619; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt620; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt619 - 1 || local7 == this.anInt620 - 1) {
					this.anIntArrayArray14[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray14[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIZZII)V")
	public void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt617;
			@Pc(9) int local9 = arg4 - this.anInt618;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method441(local4, local9, 128);
					this.method441(local4 - 1, local9, 8);
				}
				if (arg1 == 1) {
					this.method441(local4, local9, 2);
					this.method441(local4, local9 + 1, 32);
				}
				if (arg1 == 2) {
					this.method441(local4, local9, 8);
					this.method441(local4 + 1, local9, 128);
				}
				if (arg1 == 3) {
					this.method441(local4, local9, 32);
					this.method441(local4, local9 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method441(local4, local9, 1);
					this.method441(local4 - 1, local9 + 1, 16);
				}
				if (arg1 == 1) {
					this.method441(local4, local9, 4);
					this.method441(local4 + 1, local9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method441(local4, local9, 16);
					this.method441(local4 + 1, local9 - 1, 1);
				}
				if (arg1 == 3) {
					this.method441(local4, local9, 64);
					this.method441(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method441(local4, local9, 130);
					this.method441(local4 - 1, local9, 8);
					this.method441(local4, local9 + 1, 32);
				}
				if (arg1 == 1) {
					this.method441(local4, local9, 10);
					this.method441(local4, local9 + 1, 32);
					this.method441(local4 + 1, local9, 128);
				}
				if (arg1 == 2) {
					this.method441(local4, local9, 40);
					this.method441(local4 + 1, local9, 128);
					this.method441(local4, local9 - 1, 2);
				}
				if (arg1 == 3) {
					this.method441(local4, local9, 160);
					this.method441(local4, local9 - 1, 2);
					this.method441(local4 - 1, local9, 8);
				}
			}
			if (arg2) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method441(local4, local9, 65536);
						this.method441(local4 - 1, local9, 4096);
					}
					if (arg1 == 1) {
						this.method441(local4, local9, 1024);
						this.method441(local4, local9 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method441(local4, local9, 4096);
						this.method441(local4 + 1, local9, 65536);
					}
					if (arg1 == 3) {
						this.method441(local4, local9, 16384);
						this.method441(local4, local9 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method441(local4, local9, 512);
						this.method441(local4 - 1, local9 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method441(local4, local9, 2048);
						this.method441(local4 + 1, local9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method441(local4, local9, 8192);
						this.method441(local4 + 1, local9 - 1, 512);
					}
					if (arg1 == 3) {
						this.method441(local4, local9, 32768);
						this.method441(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method441(local4, local9, 66560);
						this.method441(local4 - 1, local9, 4096);
						this.method441(local4, local9 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method441(local4, local9, 5120);
						this.method441(local4, local9 + 1, 16384);
						this.method441(local4 + 1, local9, 65536);
					}
					if (arg1 == 2) {
						this.method441(local4, local9, 20480);
						this.method441(local4 + 1, local9, 65536);
						this.method441(local4, local9 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method441(local4, local9, 81920);
						this.method441(local4, local9 - 1, 1024);
						this.method441(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("10462, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIZIIII)V")
	public void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt617;
			@Pc(19) int local19 = arg5 - this.anInt618;
			@Pc(30) int local30;
			if (arg3 == 1 || arg3 == 3) {
				local30 = arg1;
				arg1 = arg4;
				arg4 = local30;
			}
			for (local30 = local14; local30 < local14 + arg1; local30++) {
				if (local30 >= 0 && local30 < this.anInt619) {
					for (@Pc(46) int local46 = local19; local46 < local19 + arg4; local46++) {
						if (local46 >= 0 && local46 < this.anInt620) {
							this.method441(local30, local46, local3);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("54351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IZI)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt617;
			@Pc(9) int local9 = arg1 - this.anInt618;
			this.anIntArrayArray14[local4][local9] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("44703, " + arg0 + ", " + false + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(III)V")
	private void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray14[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIIZII)V")
	public void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) int local7 = arg1 - this.anInt617;
			@Pc(12) int local12 = arg2 - this.anInt618;
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method444(local7, local12, 128);
					this.method444(local7 - 1, local12, 8);
				}
				if (arg4 == 1) {
					this.method444(local7, local12, 2);
					this.method444(local7, local12 + 1, 32);
				}
				if (arg4 == 2) {
					this.method444(local7, local12, 8);
					this.method444(local7 + 1, local12, 128);
				}
				if (arg4 == 3) {
					this.method444(local7, local12, 32);
					this.method444(local7, local12 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method444(local7, local12, 1);
					this.method444(local7 - 1, local12 + 1, 16);
				}
				if (arg4 == 1) {
					this.method444(local7, local12, 4);
					this.method444(local7 + 1, local12 + 1, 64);
				}
				if (arg4 == 2) {
					this.method444(local7, local12, 16);
					this.method444(local7 + 1, local12 - 1, 1);
				}
				if (arg4 == 3) {
					this.method444(local7, local12, 64);
					this.method444(local7 - 1, local12 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method444(local7, local12, 130);
					this.method444(local7 - 1, local12, 8);
					this.method444(local7, local12 + 1, 32);
				}
				if (arg4 == 1) {
					this.method444(local7, local12, 10);
					this.method444(local7, local12 + 1, 32);
					this.method444(local7 + 1, local12, 128);
				}
				if (arg4 == 2) {
					this.method444(local7, local12, 40);
					this.method444(local7 + 1, local12, 128);
					this.method444(local7, local12 - 1, 2);
				}
				if (arg4 == 3) {
					this.method444(local7, local12, 160);
					this.method444(local7, local12 - 1, 2);
					this.method444(local7 - 1, local12, 8);
				}
			}
			if (arg3) {
				if (arg0 == 0) {
					if (arg4 == 0) {
						this.method444(local7, local12, 65536);
						this.method444(local7 - 1, local12, 4096);
					}
					if (arg4 == 1) {
						this.method444(local7, local12, 1024);
						this.method444(local7, local12 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method444(local7, local12, 4096);
						this.method444(local7 + 1, local12, 65536);
					}
					if (arg4 == 3) {
						this.method444(local7, local12, 16384);
						this.method444(local7, local12 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg4 == 0) {
						this.method444(local7, local12, 512);
						this.method444(local7 - 1, local12 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method444(local7, local12, 2048);
						this.method444(local7 + 1, local12 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method444(local7, local12, 8192);
						this.method444(local7 + 1, local12 - 1, 512);
					}
					if (arg4 == 3) {
						this.method444(local7, local12, 32768);
						this.method444(local7 - 1, local12 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg4 == 0) {
						this.method444(local7, local12, 66560);
						this.method444(local7 - 1, local12, 4096);
						this.method444(local7, local12 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method444(local7, local12, 5120);
						this.method444(local7, local12 + 1, 16384);
						this.method444(local7 + 1, local12, 65536);
					}
					if (arg4 == 2) {
						this.method444(local7, local12, 20480);
						this.method444(local7 + 1, local12, 65536);
						this.method444(local7, local12 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method444(local7, local12, 81920);
						this.method444(local7, local12 - 1, 1024);
						this.method444(local7 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("97571, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIBIIIZ)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt617;
			@Pc(19) int local19 = arg3 - this.anInt618;
			@Pc(36) int local36;
			if (arg2 == 1 || arg2 == 3) {
				local36 = arg1;
				arg1 = arg0;
				arg0 = local36;
			}
			for (local36 = local14; local36 < local14 + arg1; local36++) {
				if (local36 >= 0 && local36 < this.anInt619) {
					for (@Pc(52) int local52 = local19; local52 < local19 + arg0; local52++) {
						if (local52 >= 0 && local52 < this.anInt620) {
							this.method444(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("24022, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIII)V")
	private void method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray14[arg0][arg1] &= 16777215 - arg2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("26391, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "b", descriptor = "(IZI)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt617;
			@Pc(9) int local9 = arg1 - this.anInt618;
			this.anIntArrayArray14[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("26468, " + arg0 + ", " + true + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIIIIIZ)Z")
	public boolean method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 == arg0 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt617;
			@Pc(17) int local17 = arg4 - this.anInt618;
			@Pc(22) int local22 = arg0 - this.anInt617;
			@Pc(33) int local33 = arg3 - this.anInt618;
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray14[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
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
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray14[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray14[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray14[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray14[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("9160, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(ZIIIIII)Z")
	public boolean method447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg1 && arg5 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt617;
			@Pc(17) int local17 = arg5 - this.anInt618;
			@Pc(22) int local22 = arg1 - this.anInt617;
			@Pc(36) int local36 = arg2 - this.anInt618;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray14[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray14[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray14[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray14[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray14[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray14[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray14[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray14[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray14[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray14[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray14[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray14[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("38195, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUPQNTVM", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg5 + arg2 - 1;
			@Pc(17) int local17 = arg4 + arg0 - 1;
			if (arg3 >= arg5 && arg3 <= local11 && arg1 >= arg4 && arg1 <= local17) {
				return true;
			} else if (arg3 == arg5 - 1 && arg1 >= arg4 && arg1 <= local17 && (this.anIntArrayArray14[arg3 - this.anInt617][arg1 - this.anInt618] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg3 == local11 + 1 && arg1 >= arg4 && arg1 <= local17 && (this.anIntArrayArray14[arg3 - this.anInt617][arg1 - this.anInt618] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg4 - 1 && arg3 >= arg5 && arg3 <= local11 && (this.anIntArrayArray14[arg3 - this.anInt617][arg1 - this.anInt618] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local17 + 1 && arg3 >= arg5 && arg3 <= local11 && (this.anIntArrayArray14[arg3 - this.anInt617][arg1 - this.anInt618] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("82698, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}

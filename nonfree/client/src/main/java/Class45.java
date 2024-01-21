import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!URWDWMOD")
public final class Class45 {

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!URWDWMOD", name = "b", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!URWDWMOD", name = "c", descriptor = "I")
	private int anInt639 = -660;

	@OriginalMember(owner = "client!URWDWMOD", name = "d", descriptor = "I")
	private int anInt640 = 9;

	@OriginalMember(owner = "client!URWDWMOD", name = "e", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!URWDWMOD", name = "f", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!URWDWMOD", name = "g", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!URWDWMOD", name = "h", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!URWDWMOD", name = "i", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!URWDWMOD", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!URWDWMOD", name = "<init>", descriptor = "(ZII)V")
	public Class45(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt641 = 0;
			this.anInt642 = 0;
			this.anInt643 = arg1;
			this.anInt644 = arg2;
			this.anIntArrayArray16 = new int[this.anInt643][this.anInt644];
			this.method465();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("85743, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "()V")
	public void method465() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt643; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt644; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt643 - 1 || local7 == this.anInt644 - 1) {
					this.anIntArrayArray16[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray16[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(ZIIIIB)V")
	public void method466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt641;
			@Pc(9) int local9 = arg4 - this.anInt642;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method469(local4, local9, 128);
					this.method469(local4 - 1, local9, 8);
				}
				if (arg2 == 1) {
					this.method469(local4, local9, 2);
					this.method469(local4, local9 + 1, 32);
				}
				if (arg2 == 2) {
					this.method469(local4, local9, 8);
					this.method469(local4 + 1, local9, 128);
				}
				if (arg2 == 3) {
					this.method469(local4, local9, 32);
					this.method469(local4, local9 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method469(local4, local9, 1);
					this.method469(local4 - 1, local9 + 1, 16);
				}
				if (arg2 == 1) {
					this.method469(local4, local9, 4);
					this.method469(local4 + 1, local9 + 1, 64);
				}
				if (arg2 == 2) {
					this.method469(local4, local9, 16);
					this.method469(local4 + 1, local9 - 1, 1);
				}
				if (arg2 == 3) {
					this.method469(local4, local9, 64);
					this.method469(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method469(local4, local9, 130);
					this.method469(local4 - 1, local9, 8);
					this.method469(local4, local9 + 1, 32);
				}
				if (arg2 == 1) {
					this.method469(local4, local9, 10);
					this.method469(local4, local9 + 1, 32);
					this.method469(local4 + 1, local9, 128);
				}
				if (arg2 == 2) {
					this.method469(local4, local9, 40);
					this.method469(local4 + 1, local9, 128);
					this.method469(local4, local9 - 1, 2);
				}
				if (arg2 == 3) {
					this.method469(local4, local9, 160);
					this.method469(local4, local9 - 1, 2);
					this.method469(local4 - 1, local9, 8);
				}
			}
			if (arg0) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method469(local4, local9, 65536);
						this.method469(local4 - 1, local9, 4096);
					}
					if (arg2 == 1) {
						this.method469(local4, local9, 1024);
						this.method469(local4, local9 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method469(local4, local9, 4096);
						this.method469(local4 + 1, local9, 65536);
					}
					if (arg2 == 3) {
						this.method469(local4, local9, 16384);
						this.method469(local4, local9 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method469(local4, local9, 512);
						this.method469(local4 - 1, local9 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method469(local4, local9, 2048);
						this.method469(local4 + 1, local9 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method469(local4, local9, 8192);
						this.method469(local4 + 1, local9 - 1, 512);
					}
					if (arg2 == 3) {
						this.method469(local4, local9, 32768);
						this.method469(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method469(local4, local9, 66560);
						this.method469(local4 - 1, local9, 4096);
						this.method469(local4, local9 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method469(local4, local9, 5120);
						this.method469(local4, local9 + 1, 16384);
						this.method469(local4 + 1, local9, 65536);
					}
					if (arg2 == 2) {
						this.method469(local4, local9, 20480);
						this.method469(local4 + 1, local9, 65536);
						this.method469(local4, local9 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method469(local4, local9, 81920);
						this.method469(local4, local9 - 1, 1024);
						this.method469(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("88607, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -100 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(IIIIZII)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt641;
			@Pc(29) int local29 = arg4 - this.anInt642;
			@Pc(37) int local37;
			if (arg1 == 1 || arg1 == 3) {
				local37 = arg2;
				arg2 = arg0;
				arg0 = local37;
			}
			for (local37 = local14; local37 < local14 + arg2; local37++) {
				if (local37 >= 0 && local37 < this.anInt643) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg0; local53++) {
						if (local53 >= 0 && local53 < this.anInt644) {
							this.method469(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("25503, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(IBI)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt641;
			@Pc(9) int local9 = arg0 - this.anInt642;
			if (arg1 != -102) {
				this.anInt640 = -375;
			}
			this.anIntArrayArray16[local4][local9] |= 0x200000;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("43554, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(III)V")
	private void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray16[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(ZIZIII)V")
	public void method470(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt641;
			@Pc(19) int local19 = arg1 - this.anInt642;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method472(local4, 128, local19);
					this.method472(local4 - 1, 8, local19);
				}
				if (arg3 == 1) {
					this.method472(local4, 2, local19);
					this.method472(local4, 32, local19 + 1);
				}
				if (arg3 == 2) {
					this.method472(local4, 8, local19);
					this.method472(local4 + 1, 128, local19);
				}
				if (arg3 == 3) {
					this.method472(local4, 32, local19);
					this.method472(local4, 2, local19 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method472(local4, 1, local19);
					this.method472(local4 - 1, 16, local19 + 1);
				}
				if (arg3 == 1) {
					this.method472(local4, 4, local19);
					this.method472(local4 + 1, 64, local19 + 1);
				}
				if (arg3 == 2) {
					this.method472(local4, 16, local19);
					this.method472(local4 + 1, 1, local19 - 1);
				}
				if (arg3 == 3) {
					this.method472(local4, 64, local19);
					this.method472(local4 - 1, 4, local19 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method472(local4, 130, local19);
					this.method472(local4 - 1, 8, local19);
					this.method472(local4, 32, local19 + 1);
				}
				if (arg3 == 1) {
					this.method472(local4, 10, local19);
					this.method472(local4, 32, local19 + 1);
					this.method472(local4 + 1, 128, local19);
				}
				if (arg3 == 2) {
					this.method472(local4, 40, local19);
					this.method472(local4 + 1, 128, local19);
					this.method472(local4, 2, local19 - 1);
				}
				if (arg3 == 3) {
					this.method472(local4, 160, local19);
					this.method472(local4, 2, local19 - 1);
					this.method472(local4 - 1, 8, local19);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method472(local4, 65536, local19);
						this.method472(local4 - 1, 4096, local19);
					}
					if (arg3 == 1) {
						this.method472(local4, 1024, local19);
						this.method472(local4, 16384, local19 + 1);
					}
					if (arg3 == 2) {
						this.method472(local4, 4096, local19);
						this.method472(local4 + 1, 65536, local19);
					}
					if (arg3 == 3) {
						this.method472(local4, 16384, local19);
						this.method472(local4, 1024, local19 - 1);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method472(local4, 512, local19);
						this.method472(local4 - 1, 8192, local19 + 1);
					}
					if (arg3 == 1) {
						this.method472(local4, 2048, local19);
						this.method472(local4 + 1, 32768, local19 + 1);
					}
					if (arg3 == 2) {
						this.method472(local4, 8192, local19);
						this.method472(local4 + 1, 512, local19 - 1);
					}
					if (arg3 == 3) {
						this.method472(local4, 32768, local19);
						this.method472(local4 - 1, 2048, local19 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method472(local4, 66560, local19);
						this.method472(local4 - 1, 4096, local19);
						this.method472(local4, 16384, local19 + 1);
					}
					if (arg3 == 1) {
						this.method472(local4, 5120, local19);
						this.method472(local4, 16384, local19 + 1);
						this.method472(local4 + 1, 65536, local19);
					}
					if (arg3 == 2) {
						this.method472(local4, 20480, local19);
						this.method472(local4 + 1, 65536, local19);
						this.method472(local4, 1024, local19 - 1);
					}
					if (arg3 == 3) {
						this.method472(local4, 81920, local19);
						this.method472(local4, 1024, local19 - 1);
						this.method472(local4 - 1, 4096, local19);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("38330, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "b", descriptor = "(IIIIZII)V")
	public void method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg6 - this.anInt641;
			@Pc(18) boolean local18 = false;
			@Pc(23) int local23 = arg2 - this.anInt642;
			@Pc(31) int local31;
			if (arg5 == 1 || arg5 == 3) {
				local31 = arg0;
				arg0 = arg3;
				arg3 = local31;
			}
			for (local31 = local14; local31 < local14 + arg0; local31++) {
				if (local31 >= 0 && local31 < this.anInt643) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg3; local47++) {
						if (local47 >= 0 && local47 < this.anInt644) {
							this.method472(local31, local3, local47);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("44351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(IIZI)V")
	private void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray16[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("93693, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(ZII)V")
	public void method473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt641;
			@Pc(9) int local9 = arg1 - this.anInt642;
			this.anIntArrayArray16[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("29539, " + true + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 == arg3 && arg2 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt641;
			@Pc(16) boolean local16 = false;
			@Pc(21) int local21 = arg2 - this.anInt642;
			@Pc(26) int local26 = arg3 - this.anInt641;
			@Pc(31) int local31 = arg5 - this.anInt642;
			if (arg0 == 0) {
				if (arg6 == 0) {
					if (local12 == local26 - 1 && local21 == local31) {
						return true;
					}
					if (local12 == local26 && local21 == local31 + 1 && (this.anIntArrayArray16[local12][local21] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 && local21 == local31 - 1 && (this.anIntArrayArray16[local12][local21] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local12 == local26 && local21 == local31 + 1) {
						return true;
					}
					if (local12 == local26 - 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local12 == local26 + 1 && local21 == local31) {
						return true;
					}
					if (local12 == local26 && local21 == local31 + 1 && (this.anIntArrayArray16[local12][local21] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 && local21 == local31 - 1 && (this.anIntArrayArray16[local12][local21] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local12 == local26 && local21 == local31 - 1) {
						return true;
					}
					if (local12 == local26 - 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg6 == 0) {
					if (local12 == local26 - 1 && local21 == local31) {
						return true;
					}
					if (local12 == local26 && local21 == local31 + 1) {
						return true;
					}
					if (local12 == local26 + 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local26 && local21 == local31 - 1 && (this.anIntArrayArray16[local12][local21] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local12 == local26 - 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 && local21 == local31 + 1) {
						return true;
					}
					if (local12 == local26 + 1 && local21 == local31) {
						return true;
					}
					if (local12 == local26 && local21 == local31 - 1 && (this.anIntArrayArray16[local12][local21] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local12 == local26 - 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 && local21 == local31 + 1 && (this.anIntArrayArray16[local12][local21] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local21 == local31) {
						return true;
					}
					if (local12 == local26 && local21 == local31 - 1) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local12 == local26 - 1 && local21 == local31) {
						return true;
					}
					if (local12 == local26 && local21 == local31 + 1 && (this.anIntArrayArray16[local12][local21] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local26 && local21 == local31 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local26 && local21 == local31 + 1 && (this.anIntArrayArray16[local12][local21] & 0x20) == 0) {
					return true;
				}
				if (local12 == local26 && local21 == local31 - 1 && (this.anIntArrayArray16[local12][local21] & 0x2) == 0) {
					return true;
				}
				if (local12 == local26 - 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x8) == 0) {
					return true;
				}
				if (local12 == local26 + 1 && local21 == local31 && (this.anIntArrayArray16[local12][local21] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(564) RuntimeException local564) {
			signlink.reporterror("61713, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local564.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg1 && arg3 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt641;
			@Pc(29) int local29 = arg3 - this.anInt642;
			@Pc(34) int local34 = arg1 - this.anInt641;
			@Pc(39) int local39 = arg5 - this.anInt642;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local12 == local34 + 1 && local29 == local39 && (this.anIntArrayArray16[local12][local29] & 0x80) == 0) {
						return true;
					}
					if (local12 == local34 && local29 == local39 - 1 && (this.anIntArrayArray16[local12][local29] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local34 - 1 && local29 == local39 && (this.anIntArrayArray16[local12][local29] & 0x8) == 0) {
						return true;
					}
					if (local12 == local34 && local29 == local39 - 1 && (this.anIntArrayArray16[local12][local29] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local34 - 1 && local29 == local39 && (this.anIntArrayArray16[local12][local29] & 0x8) == 0) {
						return true;
					}
					if (local12 == local34 && local29 == local39 + 1 && (this.anIntArrayArray16[local12][local29] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local34 + 1 && local29 == local39 && (this.anIntArrayArray16[local12][local29] & 0x80) == 0) {
						return true;
					}
					if (local12 == local34 && local29 == local39 + 1 && (this.anIntArrayArray16[local12][local29] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local12 == local34 && local29 == local39 + 1 && (this.anIntArrayArray16[local12][local29] & 0x20) == 0) {
					return true;
				}
				if (local12 == local34 && local29 == local39 - 1 && (this.anIntArrayArray16[local12][local29] & 0x2) == 0) {
					return true;
				}
				if (local12 == local34 - 1 && local29 == local39 && (this.anIntArrayArray16[local12][local29] & 0x8) == 0) {
					return true;
				}
				if (local12 == local34 + 1 && local29 == local39 && (this.anIntArrayArray16[local12][local29] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("52588, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -25 + ", " + arg5 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URWDWMOD", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg5 - 1;
			@Pc(11) int local11 = arg4 + arg6 - 1;
			if (arg0 >= arg3 && arg0 <= local5 && arg2 >= arg4 && arg2 <= local11) {
				return true;
			} else if (arg0 == arg3 - 1 && arg2 >= arg4 && arg2 <= local11 && (this.anIntArrayArray16[arg0 - this.anInt641][arg2 - this.anInt642] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg0 == local5 + 1 && arg2 >= arg4 && arg2 <= local11 && (this.anIntArrayArray16[arg0 - this.anInt641][arg2 - this.anInt642] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg2 == arg4 - 1 && arg0 >= arg3 && arg0 <= local5 && (this.anIntArrayArray16[arg0 - this.anInt641][arg2 - this.anInt642] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local11 + 1 && arg0 >= arg3 && arg0 <= local5 && (this.anIntArrayArray16[arg0 - this.anInt641][arg2 - this.anInt642] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("21952, " + arg0 + ", " + 66 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}

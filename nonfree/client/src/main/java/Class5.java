import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CRVZDSLK")
public final class Class5 {

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!CRVZDSLK", name = "b", descriptor = "I")
	private int anInt50 = 8;

	@OriginalMember(owner = "client!CRVZDSLK", name = "c", descriptor = "I")
	private int anInt51 = 4;

	@OriginalMember(owner = "client!CRVZDSLK", name = "d", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!CRVZDSLK", name = "e", descriptor = "I")
	private int anInt52 = -610;

	@OriginalMember(owner = "client!CRVZDSLK", name = "f", descriptor = "I")
	private int anInt53 = -205;

	@OriginalMember(owner = "client!CRVZDSLK", name = "g", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!CRVZDSLK", name = "h", descriptor = "I")
	private int anInt54 = 964;

	@OriginalMember(owner = "client!CRVZDSLK", name = "i", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!CRVZDSLK", name = "j", descriptor = "Z")
	private boolean aBoolean13 = true;

	@OriginalMember(owner = "client!CRVZDSLK", name = "k", descriptor = "I")
	private int anInt55;

	@OriginalMember(owner = "client!CRVZDSLK", name = "l", descriptor = "I")
	private int anInt56;

	@OriginalMember(owner = "client!CRVZDSLK", name = "m", descriptor = "I")
	private int anInt57;

	@OriginalMember(owner = "client!CRVZDSLK", name = "n", descriptor = "I")
	private int anInt58;

	@OriginalMember(owner = "client!CRVZDSLK", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!CRVZDSLK", name = "<init>", descriptor = "(ZII)V")
	public Class5(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt55 = 0;
			this.anInt56 = 0;
			this.anInt57 = arg2;
			this.anInt58 = arg1;
			this.anIntArrayArray1 = new int[this.anInt57][this.anInt58];
			this.method20();
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("70119, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "()V")
	public void method20() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt57; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt58; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt57 - 1 || local7 == this.anInt58 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IZBIII)V")
	public void method21(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(10) int local10 = arg4 - this.anInt55;
			@Pc(15) int local15 = arg2 - this.anInt56;
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method24(local10, local15, 128);
					this.method24(local10 - 1, local15, 8);
				}
				if (arg0 == 1) {
					this.method24(local10, local15, 2);
					this.method24(local10, local15 + 1, 32);
				}
				if (arg0 == 2) {
					this.method24(local10, local15, 8);
					this.method24(local10 + 1, local15, 128);
				}
				if (arg0 == 3) {
					this.method24(local10, local15, 32);
					this.method24(local10, local15 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method24(local10, local15, 1);
					this.method24(local10 - 1, local15 + 1, 16);
				}
				if (arg0 == 1) {
					this.method24(local10, local15, 4);
					this.method24(local10 + 1, local15 + 1, 64);
				}
				if (arg0 == 2) {
					this.method24(local10, local15, 16);
					this.method24(local10 + 1, local15 - 1, 1);
				}
				if (arg0 == 3) {
					this.method24(local10, local15, 64);
					this.method24(local10 - 1, local15 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method24(local10, local15, 130);
					this.method24(local10 - 1, local15, 8);
					this.method24(local10, local15 + 1, 32);
				}
				if (arg0 == 1) {
					this.method24(local10, local15, 10);
					this.method24(local10, local15 + 1, 32);
					this.method24(local10 + 1, local15, 128);
				}
				if (arg0 == 2) {
					this.method24(local10, local15, 40);
					this.method24(local10 + 1, local15, 128);
					this.method24(local10, local15 - 1, 2);
				}
				if (arg0 == 3) {
					this.method24(local10, local15, 160);
					this.method24(local10, local15 - 1, 2);
					this.method24(local10 - 1, local15, 8);
				}
			}
			if (arg1) {
				if (arg3 == 0) {
					if (arg0 == 0) {
						this.method24(local10, local15, 65536);
						this.method24(local10 - 1, local15, 4096);
					}
					if (arg0 == 1) {
						this.method24(local10, local15, 1024);
						this.method24(local10, local15 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method24(local10, local15, 4096);
						this.method24(local10 + 1, local15, 65536);
					}
					if (arg0 == 3) {
						this.method24(local10, local15, 16384);
						this.method24(local10, local15 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg0 == 0) {
						this.method24(local10, local15, 512);
						this.method24(local10 - 1, local15 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method24(local10, local15, 2048);
						this.method24(local10 + 1, local15 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method24(local10, local15, 8192);
						this.method24(local10 + 1, local15 - 1, 512);
					}
					if (arg0 == 3) {
						this.method24(local10, local15, 32768);
						this.method24(local10 - 1, local15 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg0 == 0) {
						this.method24(local10, local15, 66560);
						this.method24(local10 - 1, local15, 4096);
						this.method24(local10, local15 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method24(local10, local15, 5120);
						this.method24(local10, local15 + 1, 16384);
						this.method24(local10 + 1, local15, 65536);
					}
					if (arg0 == 2) {
						this.method24(local10, local15, 20480);
						this.method24(local10 + 1, local15, 65536);
						this.method24(local10, local15 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method24(local10, local15, 81920);
						this.method24(local10, local15 - 1, 1024);
						this.method24(local10 - 1, local15, 4096);
						return;
					}
				}
			}
		} catch (@Pc(467) RuntimeException local467) {
			signlink.reporterror("30048, " + arg0 + ", " + arg1 + ", " + 41 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIIIIZI)V")
	public void method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt55;
			@Pc(19) int local19 = arg5 - this.anInt56;
			@Pc(37) int local37;
			if (arg1 == 1 || arg1 == 3) {
				local37 = arg2;
				arg2 = arg3;
				arg3 = local37;
			}
			for (local37 = local14; local37 < local14 + arg2; local37++) {
				if (local37 >= 0 && local37 < this.anInt57) {
					for (@Pc(53) int local53 = local19; local53 < local19 + arg3; local53++) {
						if (local53 >= 0 && local53 < this.anInt58) {
							this.method24(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("54343, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(III)V")
	public void method23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt55;
			@Pc(9) int local9 = arg2 - this.anInt56;
			if (arg1 >= this.anInt51 && arg1 <= this.anInt51) {
				this.anIntArrayArray1[local4][local9] |= 0x200000;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("73364, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "b", descriptor = "(III)V")
	private void method24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(ZIZIII)V")
	public void method25(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt55;
			@Pc(19) int local19 = arg1 - this.anInt56;
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method27(local4, 128, this.aBoolean10, local19);
					this.method27(local4 - 1, 8, this.aBoolean10, local19);
				}
				if (arg2 == 1) {
					this.method27(local4, 2, this.aBoolean10, local19);
					this.method27(local4, 32, this.aBoolean10, local19 + 1);
				}
				if (arg2 == 2) {
					this.method27(local4, 8, this.aBoolean10, local19);
					this.method27(local4 + 1, 128, this.aBoolean10, local19);
				}
				if (arg2 == 3) {
					this.method27(local4, 32, this.aBoolean10, local19);
					this.method27(local4, 2, this.aBoolean10, local19 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method27(local4, 1, this.aBoolean10, local19);
					this.method27(local4 - 1, 16, this.aBoolean10, local19 + 1);
				}
				if (arg2 == 1) {
					this.method27(local4, 4, this.aBoolean10, local19);
					this.method27(local4 + 1, 64, this.aBoolean10, local19 + 1);
				}
				if (arg2 == 2) {
					this.method27(local4, 16, this.aBoolean10, local19);
					this.method27(local4 + 1, 1, this.aBoolean10, local19 - 1);
				}
				if (arg2 == 3) {
					this.method27(local4, 64, this.aBoolean10, local19);
					this.method27(local4 - 1, 4, this.aBoolean10, local19 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method27(local4, 130, this.aBoolean10, local19);
					this.method27(local4 - 1, 8, this.aBoolean10, local19);
					this.method27(local4, 32, this.aBoolean10, local19 + 1);
				}
				if (arg2 == 1) {
					this.method27(local4, 10, this.aBoolean10, local19);
					this.method27(local4, 32, this.aBoolean10, local19 + 1);
					this.method27(local4 + 1, 128, this.aBoolean10, local19);
				}
				if (arg2 == 2) {
					this.method27(local4, 40, this.aBoolean10, local19);
					this.method27(local4 + 1, 128, this.aBoolean10, local19);
					this.method27(local4, 2, this.aBoolean10, local19 - 1);
				}
				if (arg2 == 3) {
					this.method27(local4, 160, this.aBoolean10, local19);
					this.method27(local4, 2, this.aBoolean10, local19 - 1);
					this.method27(local4 - 1, 8, this.aBoolean10, local19);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method27(local4, 65536, this.aBoolean10, local19);
						this.method27(local4 - 1, 4096, this.aBoolean10, local19);
					}
					if (arg2 == 1) {
						this.method27(local4, 1024, this.aBoolean10, local19);
						this.method27(local4, 16384, this.aBoolean10, local19 + 1);
					}
					if (arg2 == 2) {
						this.method27(local4, 4096, this.aBoolean10, local19);
						this.method27(local4 + 1, 65536, this.aBoolean10, local19);
					}
					if (arg2 == 3) {
						this.method27(local4, 16384, this.aBoolean10, local19);
						this.method27(local4, 1024, this.aBoolean10, local19 - 1);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method27(local4, 512, this.aBoolean10, local19);
						this.method27(local4 - 1, 8192, this.aBoolean10, local19 + 1);
					}
					if (arg2 == 1) {
						this.method27(local4, 2048, this.aBoolean10, local19);
						this.method27(local4 + 1, 32768, this.aBoolean10, local19 + 1);
					}
					if (arg2 == 2) {
						this.method27(local4, 8192, this.aBoolean10, local19);
						this.method27(local4 + 1, 512, this.aBoolean10, local19 - 1);
					}
					if (arg2 == 3) {
						this.method27(local4, 32768, this.aBoolean10, local19);
						this.method27(local4 - 1, 2048, this.aBoolean10, local19 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method27(local4, 66560, this.aBoolean10, local19);
						this.method27(local4 - 1, 4096, this.aBoolean10, local19);
						this.method27(local4, 16384, this.aBoolean10, local19 + 1);
					}
					if (arg2 == 1) {
						this.method27(local4, 5120, this.aBoolean10, local19);
						this.method27(local4, 16384, this.aBoolean10, local19 + 1);
						this.method27(local4 + 1, 65536, this.aBoolean10, local19);
					}
					if (arg2 == 2) {
						this.method27(local4, 20480, this.aBoolean10, local19);
						this.method27(local4 + 1, 65536, this.aBoolean10, local19);
						this.method27(local4, 1024, this.aBoolean10, local19 - 1);
					}
					if (arg2 == 3) {
						this.method27(local4, 81920, this.aBoolean10, local19);
						this.method27(local4, 1024, this.aBoolean10, local19 - 1);
						this.method27(local4 - 1, 4096, this.aBoolean10, local19);
						return;
					}
				}
			}
		} catch (@Pc(583) RuntimeException local583) {
			signlink.reporterror("13747, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local583.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IZIIIII)V")
	public void method26(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 != 0) {
				this.anInt50 = 65;
			}
			@Pc(8) int local8 = 256;
			if (arg1) {
				local8 = 131328;
			}
			@Pc(19) int local19 = arg3 - this.anInt55;
			@Pc(24) int local24 = arg0 - this.anInt56;
			@Pc(32) int local32;
			if (arg2 == 1 || arg2 == 3) {
				local32 = arg5;
				arg5 = arg6;
				arg6 = local32;
			}
			for (local32 = local19; local32 < local19 + arg5; local32++) {
				if (local32 >= 0 && local32 < this.anInt57) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg6; local48++) {
						if (local48 >= 0 && local48 < this.anInt58) {
							this.method27(local32, local8, this.aBoolean10, local48);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("85741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIZI)V")
	private void method27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2) {
				this.aBoolean13 = !this.aBoolean13;
			}
			this.anIntArrayArray1[arg0][arg3] &= 16777215 - arg1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("35816, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "c", descriptor = "(III)V")
	public void method28(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt55;
			@Pc(9) int local9 = arg0 - this.anInt56;
			this.anIntArrayArray1[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57995, " + arg0 + ", " + -217 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg4 && arg3 == arg0) {
				return true;
			}
			@Pc(18) int local18 = arg2 - this.anInt55;
			@Pc(23) int local23 = arg3 - this.anInt56;
			@Pc(28) int local28 = arg4 - this.anInt55;
			@Pc(33) int local33 = arg0 - this.anInt56;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("5575, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -610 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 == arg4 && arg5 == arg2) {
				return true;
			}
			@Pc(18) int local18 = arg0 - this.anInt55;
			@Pc(23) int local23 = arg5 - this.anInt56;
			@Pc(28) int local28 = arg4 - this.anInt55;
			@Pc(33) int local33 = arg2 - this.anInt56;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("87568, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRVZDSLK", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg5 - 1;
			@Pc(11) int local11 = arg2 + arg6 - 1;
			if (arg1 >= arg3 && arg1 <= local5 && arg0 >= arg2 && arg0 <= local11) {
				return true;
			} else if (arg1 == arg3 - 1 && arg0 >= arg2 && arg0 <= local11 && (this.anIntArrayArray1[arg1 - this.anInt55][arg0 - this.anInt56] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg1 == local5 + 1 && arg0 >= arg2 && arg0 <= local11 && (this.anIntArrayArray1[arg1 - this.anInt55][arg0 - this.anInt56] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg0 == arg2 - 1 && arg1 >= arg3 && arg1 <= local5 && (this.anIntArrayArray1[arg1 - this.anInt55][arg0 - this.anInt56] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local11 + 1 && arg1 >= arg3 && arg1 <= local5 && (this.anIntArrayArray1[arg1 - this.anInt55][arg0 - this.anInt56] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("36917, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}

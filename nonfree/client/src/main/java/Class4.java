import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BBOYCGQQ")
public final class Class4 {

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "I")
	private int anInt76 = -817;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "b", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "c", descriptor = "I")
	private int anInt77 = 394;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "d", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "e", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "f", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "g", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "h", descriptor = "I")
	private int anInt81;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!BBOYCGQQ", name = "<init>", descriptor = "(IIB)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt78 = 0;
			if (arg2 != 8) {
				this.anInt76 = 387;
			}
			this.anInt79 = 0;
			this.anInt80 = arg1;
			this.anInt81 = arg0;
			this.anIntArrayArray1 = new int[this.anInt80][this.anInt81];
			this.method29();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("96760, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "()V")
	public void method29() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt80; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt81; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt80 - 1 || local7 == this.anInt81 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(BIIIZI)V")
	public void method30(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(15) int local15 = arg4 - this.anInt78;
			@Pc(20) int local20 = arg0 - this.anInt79;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method33(local15, local20, 128);
					this.method33(local15 - 1, local20, 8);
				}
				if (arg2 == 1) {
					this.method33(local15, local20, 2);
					this.method33(local15, local20 + 1, 32);
				}
				if (arg2 == 2) {
					this.method33(local15, local20, 8);
					this.method33(local15 + 1, local20, 128);
				}
				if (arg2 == 3) {
					this.method33(local15, local20, 32);
					this.method33(local15, local20 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method33(local15, local20, 1);
					this.method33(local15 - 1, local20 + 1, 16);
				}
				if (arg2 == 1) {
					this.method33(local15, local20, 4);
					this.method33(local15 + 1, local20 + 1, 64);
				}
				if (arg2 == 2) {
					this.method33(local15, local20, 16);
					this.method33(local15 + 1, local20 - 1, 1);
				}
				if (arg2 == 3) {
					this.method33(local15, local20, 64);
					this.method33(local15 - 1, local20 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method33(local15, local20, 130);
					this.method33(local15 - 1, local20, 8);
					this.method33(local15, local20 + 1, 32);
				}
				if (arg2 == 1) {
					this.method33(local15, local20, 10);
					this.method33(local15, local20 + 1, 32);
					this.method33(local15 + 1, local20, 128);
				}
				if (arg2 == 2) {
					this.method33(local15, local20, 40);
					this.method33(local15 + 1, local20, 128);
					this.method33(local15, local20 - 1, 2);
				}
				if (arg2 == 3) {
					this.method33(local15, local20, 160);
					this.method33(local15, local20 - 1, 2);
					this.method33(local15 - 1, local20, 8);
				}
			}
			if (arg3) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method33(local15, local20, 65536);
						this.method33(local15 - 1, local20, 4096);
					}
					if (arg2 == 1) {
						this.method33(local15, local20, 1024);
						this.method33(local15, local20 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method33(local15, local20, 4096);
						this.method33(local15 + 1, local20, 65536);
					}
					if (arg2 == 3) {
						this.method33(local15, local20, 16384);
						this.method33(local15, local20 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method33(local15, local20, 512);
						this.method33(local15 - 1, local20 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method33(local15, local20, 2048);
						this.method33(local15 + 1, local20 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method33(local15, local20, 8192);
						this.method33(local15 + 1, local20 - 1, 512);
					}
					if (arg2 == 3) {
						this.method33(local15, local20, 32768);
						this.method33(local15 - 1, local20 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method33(local15, local20, 66560);
						this.method33(local15 - 1, local20, 4096);
						this.method33(local15, local20 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method33(local15, local20, 5120);
						this.method33(local15, local20 + 1, 16384);
						this.method33(local15 + 1, local20, 65536);
					}
					if (arg2 == 2) {
						this.method33(local15, local20, 20480);
						this.method33(local15 + 1, local20, 65536);
						this.method33(local15, local20 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method33(local15, local20, 81920);
						this.method33(local15, local20 - 1, 1024);
						this.method33(local15 - 1, local20, 4096);
						return;
					}
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("55347, " + 126 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIZI)V")
	public void method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(17) int local17 = arg1 - this.anInt78;
			@Pc(22) int local22 = arg0 - this.anInt79;
			@Pc(30) int local30;
			if (arg5 == 1 || arg5 == 3) {
				local30 = arg3;
				arg3 = arg2;
				arg2 = local30;
			}
			for (local30 = local17; local30 < local17 + arg3; local30++) {
				if (local30 >= 0 && local30 < this.anInt80) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg2; local46++) {
						if (local46 >= 0 && local46 < this.anInt81) {
							this.method33(local30, local46, local3);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("23053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIZ)V")
	public void method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt78;
			@Pc(9) int local9 = arg0 - this.anInt79;
			this.anIntArrayArray1[local4][local9] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("66995, " + arg0 + ", " + arg1 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(III)V")
	private void method33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIZ)V")
	public void method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(6) int local6 = arg0 - this.anInt78;
			@Pc(11) int local11 = arg2 - this.anInt79;
			if (arg1 == 0) {
				if (arg3 == 0) {
					this.method36(local6, local11, this.aBoolean17, 128);
					this.method36(local6 - 1, local11, this.aBoolean17, 8);
				}
				if (arg3 == 1) {
					this.method36(local6, local11, this.aBoolean17, 2);
					this.method36(local6, local11 + 1, this.aBoolean17, 32);
				}
				if (arg3 == 2) {
					this.method36(local6, local11, this.aBoolean17, 8);
					this.method36(local6 + 1, local11, this.aBoolean17, 128);
				}
				if (arg3 == 3) {
					this.method36(local6, local11, this.aBoolean17, 32);
					this.method36(local6, local11 - 1, this.aBoolean17, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg3 == 0) {
					this.method36(local6, local11, this.aBoolean17, 1);
					this.method36(local6 - 1, local11 + 1, this.aBoolean17, 16);
				}
				if (arg3 == 1) {
					this.method36(local6, local11, this.aBoolean17, 4);
					this.method36(local6 + 1, local11 + 1, this.aBoolean17, 64);
				}
				if (arg3 == 2) {
					this.method36(local6, local11, this.aBoolean17, 16);
					this.method36(local6 + 1, local11 - 1, this.aBoolean17, 1);
				}
				if (arg3 == 3) {
					this.method36(local6, local11, this.aBoolean17, 64);
					this.method36(local6 - 1, local11 - 1, this.aBoolean17, 4);
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					this.method36(local6, local11, this.aBoolean17, 130);
					this.method36(local6 - 1, local11, this.aBoolean17, 8);
					this.method36(local6, local11 + 1, this.aBoolean17, 32);
				}
				if (arg3 == 1) {
					this.method36(local6, local11, this.aBoolean17, 10);
					this.method36(local6, local11 + 1, this.aBoolean17, 32);
					this.method36(local6 + 1, local11, this.aBoolean17, 128);
				}
				if (arg3 == 2) {
					this.method36(local6, local11, this.aBoolean17, 40);
					this.method36(local6 + 1, local11, this.aBoolean17, 128);
					this.method36(local6, local11 - 1, this.aBoolean17, 2);
				}
				if (arg3 == 3) {
					this.method36(local6, local11, this.aBoolean17, 160);
					this.method36(local6, local11 - 1, this.aBoolean17, 2);
					this.method36(local6 - 1, local11, this.aBoolean17, 8);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg3 == 0) {
						this.method36(local6, local11, this.aBoolean17, 65536);
						this.method36(local6 - 1, local11, this.aBoolean17, 4096);
					}
					if (arg3 == 1) {
						this.method36(local6, local11, this.aBoolean17, 1024);
						this.method36(local6, local11 + 1, this.aBoolean17, 16384);
					}
					if (arg3 == 2) {
						this.method36(local6, local11, this.aBoolean17, 4096);
						this.method36(local6 + 1, local11, this.aBoolean17, 65536);
					}
					if (arg3 == 3) {
						this.method36(local6, local11, this.aBoolean17, 16384);
						this.method36(local6, local11 - 1, this.aBoolean17, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg3 == 0) {
						this.method36(local6, local11, this.aBoolean17, 512);
						this.method36(local6 - 1, local11 + 1, this.aBoolean17, 8192);
					}
					if (arg3 == 1) {
						this.method36(local6, local11, this.aBoolean17, 2048);
						this.method36(local6 + 1, local11 + 1, this.aBoolean17, 32768);
					}
					if (arg3 == 2) {
						this.method36(local6, local11, this.aBoolean17, 8192);
						this.method36(local6 + 1, local11 - 1, this.aBoolean17, 512);
					}
					if (arg3 == 3) {
						this.method36(local6, local11, this.aBoolean17, 32768);
						this.method36(local6 - 1, local11 - 1, this.aBoolean17, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg3 == 0) {
						this.method36(local6, local11, this.aBoolean17, 66560);
						this.method36(local6 - 1, local11, this.aBoolean17, 4096);
						this.method36(local6, local11 + 1, this.aBoolean17, 16384);
					}
					if (arg3 == 1) {
						this.method36(local6, local11, this.aBoolean17, 5120);
						this.method36(local6, local11 + 1, this.aBoolean17, 16384);
						this.method36(local6 + 1, local11, this.aBoolean17, 65536);
					}
					if (arg3 == 2) {
						this.method36(local6, local11, this.aBoolean17, 20480);
						this.method36(local6 + 1, local11, this.aBoolean17, 65536);
						this.method36(local6, local11 - 1, this.aBoolean17, 1024);
					}
					if (arg3 == 3) {
						this.method36(local6, local11, this.aBoolean17, 81920);
						this.method36(local6, local11 - 1, this.aBoolean17, 1024);
						this.method36(local6 - 1, local11, this.aBoolean17, 4096);
						return;
					}
				}
			}
		} catch (@Pc(586) RuntimeException local586) {
			signlink.reporterror("96678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -506 + ", " + arg3 + ", " + arg4 + ", " + local586.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(ZBIIIII)V")
	public void method35(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt78;
			@Pc(23) int local23 = arg5 - this.anInt79;
			@Pc(31) int local31;
			if (arg1 == 1 || arg1 == 3) {
				local31 = arg2;
				arg2 = arg4;
				arg4 = local31;
			}
			for (local31 = local14; local31 < local14 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt80) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg4; local47++) {
						if (local47 >= 0 && local47 < this.anInt81) {
							this.method36(local31, local47, this.aBoolean17, local3);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("57791, " + arg0 + ", " + 56 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIZI)V")
	private void method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2) {
				this.aBoolean18 = !this.aBoolean18;
			}
			this.anIntArrayArray1[arg0][arg1] &= 16777215 - arg3;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("81403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(BII)V")
	public void method37(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt78;
			@Pc(9) int local9 = arg1 - this.anInt79;
			if (arg0 != 19) {
				this.anInt76 = 306;
			}
			this.anIntArrayArray1[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("95338, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg0 && arg4 == arg1) {
				return true;
			}
			@Pc(18) int local18 = arg3 - this.anInt78;
			@Pc(23) int local23 = arg4 - this.anInt79;
			@Pc(28) int local28 = arg0 - this.anInt78;
			@Pc(33) int local33 = arg1 - this.anInt79;
			if (arg2 == 0) {
				if (arg5 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray1[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray1[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray1[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
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
			if (arg2 == 2) {
				if (arg5 == 0) {
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
				} else if (arg5 == 1) {
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
				} else if (arg5 == 2) {
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
				} else if (arg5 == 3) {
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
			if (arg2 == 9) {
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
			signlink.reporterror("96307, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg3 && arg5 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt78;
			@Pc(17) int local17 = arg5 - this.anInt79;
			@Pc(28) int local28 = arg3 - this.anInt78;
			@Pc(33) int local33 = arg4 - this.anInt79;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("75553, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 394 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBOYCGQQ", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg4 - 1;
			@Pc(11) int local11 = arg6 + arg3 - 1;
			if (arg5 >= arg2 && arg5 <= local5 && arg1 >= arg6 && arg1 <= local11) {
				return true;
			} else if (arg5 == arg2 - 1 && arg1 >= arg6 && arg1 <= local11 && (this.anIntArrayArray1[arg5 - this.anInt78][arg1 - this.anInt79] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg1 >= arg6 && arg1 <= local11 && (this.anIntArrayArray1[arg5 - this.anInt78][arg1 - this.anInt79] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg6 - 1 && arg5 >= arg2 && arg5 <= local5 && (this.anIntArrayArray1[arg5 - this.anInt78][arg1 - this.anInt79] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local11 + 1 && arg5 >= arg2 && arg5 <= local5 && (this.anIntArrayArray1[arg5 - this.anInt78][arg1 - this.anInt79] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("56142, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 213 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}

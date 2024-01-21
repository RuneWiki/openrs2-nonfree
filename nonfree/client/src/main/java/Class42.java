import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VDSFJUIR")
public final class Class42 {

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "I")
	private int anInt689 = -639;

	@OriginalMember(owner = "client!VDSFJUIR", name = "b", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!VDSFJUIR", name = "c", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!VDSFJUIR", name = "d", descriptor = "I")
	private int anInt690 = 5755;

	@OriginalMember(owner = "client!VDSFJUIR", name = "e", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!VDSFJUIR", name = "f", descriptor = "I")
	private int anInt691 = -906;

	@OriginalMember(owner = "client!VDSFJUIR", name = "g", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!VDSFJUIR", name = "h", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!VDSFJUIR", name = "i", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!VDSFJUIR", name = "j", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!VDSFJUIR", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!VDSFJUIR", name = "<init>", descriptor = "(III)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt692 = 0;
			this.anInt693 = 0;
			this.anInt694 = arg0;
			this.anInt695 = arg2;
			this.anIntArrayArray21 = new int[this.anInt694][this.anInt695];
			this.method533();
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("49748, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "()V")
	public void method533() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt694; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt695; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt694 - 1 || local7 == this.anInt695 - 1) {
					this.anIntArrayArray21[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray21[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIZI)V")
	public void method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt692;
			if (arg2 != 0) {
				for (@Pc(8) int local8 = 1; local8 > 0; local8++) {
				}
			}
			@Pc(18) int local18 = arg5 - this.anInt693;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method537(local4, local18, 128);
					this.method537(local4 - 1, local18, 8);
				}
				if (arg3 == 1) {
					this.method537(local4, local18, 2);
					this.method537(local4, local18 + 1, 32);
				}
				if (arg3 == 2) {
					this.method537(local4, local18, 8);
					this.method537(local4 + 1, local18, 128);
				}
				if (arg3 == 3) {
					this.method537(local4, local18, 32);
					this.method537(local4, local18 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method537(local4, local18, 1);
					this.method537(local4 - 1, local18 + 1, 16);
				}
				if (arg3 == 1) {
					this.method537(local4, local18, 4);
					this.method537(local4 + 1, local18 + 1, 64);
				}
				if (arg3 == 2) {
					this.method537(local4, local18, 16);
					this.method537(local4 + 1, local18 - 1, 1);
				}
				if (arg3 == 3) {
					this.method537(local4, local18, 64);
					this.method537(local4 - 1, local18 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method537(local4, local18, 130);
					this.method537(local4 - 1, local18, 8);
					this.method537(local4, local18 + 1, 32);
				}
				if (arg3 == 1) {
					this.method537(local4, local18, 10);
					this.method537(local4, local18 + 1, 32);
					this.method537(local4 + 1, local18, 128);
				}
				if (arg3 == 2) {
					this.method537(local4, local18, 40);
					this.method537(local4 + 1, local18, 128);
					this.method537(local4, local18 - 1, 2);
				}
				if (arg3 == 3) {
					this.method537(local4, local18, 160);
					this.method537(local4, local18 - 1, 2);
					this.method537(local4 - 1, local18, 8);
				}
			}
			if (arg4) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method537(local4, local18, 65536);
						this.method537(local4 - 1, local18, 4096);
					}
					if (arg3 == 1) {
						this.method537(local4, local18, 1024);
						this.method537(local4, local18 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method537(local4, local18, 4096);
						this.method537(local4 + 1, local18, 65536);
					}
					if (arg3 == 3) {
						this.method537(local4, local18, 16384);
						this.method537(local4, local18 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method537(local4, local18, 512);
						this.method537(local4 - 1, local18 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method537(local4, local18, 2048);
						this.method537(local4 + 1, local18 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method537(local4, local18, 8192);
						this.method537(local4 + 1, local18 - 1, 512);
					}
					if (arg3 == 3) {
						this.method537(local4, local18, 32768);
						this.method537(local4 - 1, local18 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method537(local4, local18, 66560);
						this.method537(local4 - 1, local18, 4096);
						this.method537(local4, local18 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method537(local4, local18, 5120);
						this.method537(local4, local18 + 1, 16384);
						this.method537(local4 + 1, local18, 65536);
					}
					if (arg3 == 2) {
						this.method537(local4, local18, 20480);
						this.method537(local4 + 1, local18, 65536);
						this.method537(local4, local18 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method537(local4, local18, 81920);
						this.method537(local4, local18 - 1, 1024);
						this.method537(local4 - 1, local18, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("31196, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIZIII)V")
	public void method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(6) int local6 = 256;
			if (arg3) {
				local6 = 131328;
			}
			@Pc(17) int local17 = arg2 - this.anInt692;
			@Pc(22) int local22 = arg4 - this.anInt693;
			@Pc(30) int local30;
			if (arg1 == 1 || arg1 == 3) {
				local30 = arg0;
				arg0 = arg5;
				arg5 = local30;
			}
			for (local30 = local17; local30 < local17 + arg0; local30++) {
				if (local30 >= 0 && local30 < this.anInt694) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg5; local46++) {
						if (local46 >= 0 && local46 < this.anInt695) {
							this.method537(local30, local46, local6);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("26455, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(III)V")
	public void method536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg0 - this.anInt692;
			@Pc(14) int local14 = arg1 - this.anInt693;
			this.anIntArrayArray21[local9][local14] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("20003, " + -803 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "b", descriptor = "(III)V")
	private void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray21[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIZ)V")
	public void method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt692;
			@Pc(9) int local9 = arg0 - this.anInt693;
			if (arg1 == 0) {
				if (arg3 == 0) {
					this.method540(128, local9, local4);
					this.method540(8, local9, local4 - 1);
				}
				if (arg3 == 1) {
					this.method540(2, local9, local4);
					this.method540(32, local9 + 1, local4);
				}
				if (arg3 == 2) {
					this.method540(8, local9, local4);
					this.method540(128, local9, local4 + 1);
				}
				if (arg3 == 3) {
					this.method540(32, local9, local4);
					this.method540(2, local9 - 1, local4);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg3 == 0) {
					this.method540(1, local9, local4);
					this.method540(16, local9 + 1, local4 - 1);
				}
				if (arg3 == 1) {
					this.method540(4, local9, local4);
					this.method540(64, local9 + 1, local4 + 1);
				}
				if (arg3 == 2) {
					this.method540(16, local9, local4);
					this.method540(1, local9 - 1, local4 + 1);
				}
				if (arg3 == 3) {
					this.method540(64, local9, local4);
					this.method540(4, local9 - 1, local4 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					this.method540(130, local9, local4);
					this.method540(8, local9, local4 - 1);
					this.method540(32, local9 + 1, local4);
				}
				if (arg3 == 1) {
					this.method540(10, local9, local4);
					this.method540(32, local9 + 1, local4);
					this.method540(128, local9, local4 + 1);
				}
				if (arg3 == 2) {
					this.method540(40, local9, local4);
					this.method540(128, local9, local4 + 1);
					this.method540(2, local9 - 1, local4);
				}
				if (arg3 == 3) {
					this.method540(160, local9, local4);
					this.method540(2, local9 - 1, local4);
					this.method540(8, local9, local4 - 1);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg3 == 0) {
						this.method540(65536, local9, local4);
						this.method540(4096, local9, local4 - 1);
					}
					if (arg3 == 1) {
						this.method540(1024, local9, local4);
						this.method540(16384, local9 + 1, local4);
					}
					if (arg3 == 2) {
						this.method540(4096, local9, local4);
						this.method540(65536, local9, local4 + 1);
					}
					if (arg3 == 3) {
						this.method540(16384, local9, local4);
						this.method540(1024, local9 - 1, local4);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg3 == 0) {
						this.method540(512, local9, local4);
						this.method540(8192, local9 + 1, local4 - 1);
					}
					if (arg3 == 1) {
						this.method540(2048, local9, local4);
						this.method540(32768, local9 + 1, local4 + 1);
					}
					if (arg3 == 2) {
						this.method540(8192, local9, local4);
						this.method540(512, local9 - 1, local4 + 1);
					}
					if (arg3 == 3) {
						this.method540(32768, local9, local4);
						this.method540(2048, local9 - 1, local4 - 1);
					}
				}
				if (arg1 == 2) {
					if (arg3 == 0) {
						this.method540(66560, local9, local4);
						this.method540(4096, local9, local4 - 1);
						this.method540(16384, local9 + 1, local4);
					}
					if (arg3 == 1) {
						this.method540(5120, local9, local4);
						this.method540(16384, local9 + 1, local4);
						this.method540(65536, local9, local4 + 1);
					}
					if (arg3 == 2) {
						this.method540(20480, local9, local4);
						this.method540(65536, local9, local4 + 1);
						this.method540(1024, local9 - 1, local4);
					}
					if (arg3 == 3) {
						this.method540(81920, local9, local4);
						this.method540(1024, local9 - 1, local4);
						this.method540(4096, local9, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("72528, " + arg0 + ", " + -380 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIZB)V")
	public void method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt692;
			@Pc(19) int local19 = arg4 - this.anInt693;
			@Pc(31) int local31;
			if (arg3 == 1 || arg3 == 3) {
				local31 = arg2;
				arg2 = arg0;
				arg0 = local31;
			}
			for (local31 = local14; local31 < local14 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt694) {
					for (@Pc(47) int local47 = local19; local47 < local19 + arg0; local47++) {
						if (local47 >= 0 && local47 < this.anInt695) {
							this.method540(local3, local47, local31);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("70919, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 45 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIII)V")
	private void method540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray21[arg2][arg1] &= 16777215 - arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("98423, " + arg0 + ", " + -31320 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IZI)V")
	public void method541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt692;
			@Pc(9) int local9 = arg0 - this.anInt693;
			this.anIntArrayArray21[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("65224, " + arg0 + ", " + true + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg1 && arg4 == arg0) {
				return true;
			}
			@Pc(22) int local22 = arg3 - this.anInt692;
			@Pc(27) int local27 = arg4 - this.anInt693;
			@Pc(32) int local32 = arg1 - this.anInt692;
			@Pc(37) int local37 = arg0 - this.anInt693;
			if (arg5 == 0) {
				if (arg2 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("60144, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg4 && arg2 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt692;
			@Pc(17) int local17 = arg2 - this.anInt693;
			@Pc(22) int local22 = arg4 - this.anInt692;
			@Pc(27) int local27 = arg0 - this.anInt693;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray21[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray21[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray21[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray21[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray21[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray21[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray21[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray21[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray21[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray21[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray21[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray21[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("38217, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDSFJUIR", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(9) int local9 = arg5 + arg6 - 1;
			@Pc(15) int local15 = arg7 + arg2 - 1;
			if (arg4 >= arg5 && arg4 <= local9 && arg1 >= arg7 && arg1 <= local15) {
				return true;
			} else if (arg4 == arg5 - 1 && arg1 >= arg7 && arg1 <= local15 && (this.anIntArrayArray21[arg4 - this.anInt692][arg1 - this.anInt693] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg4 == local9 + 1 && arg1 >= arg7 && arg1 <= local15 && (this.anIntArrayArray21[arg4 - this.anInt692][arg1 - this.anInt693] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg7 - 1 && arg4 >= arg5 && arg4 <= local9 && (this.anIntArrayArray21[arg4 - this.anInt692][arg1 - this.anInt693] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local15 + 1 && arg4 >= arg5 && arg4 <= local9 && (this.anIntArrayArray21[arg4 - this.anInt692][arg1 - this.anInt693] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("91648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}

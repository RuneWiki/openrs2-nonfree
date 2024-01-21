import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FTPNODIB")
public final class Class12 {

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!FTPNODIB", name = "b", descriptor = "I")
	private int anInt362 = -32357;

	@OriginalMember(owner = "client!FTPNODIB", name = "c", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!FTPNODIB", name = "d", descriptor = "I")
	private int anInt363 = 7;

	@OriginalMember(owner = "client!FTPNODIB", name = "e", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!FTPNODIB", name = "f", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!FTPNODIB", name = "g", descriptor = "B")
	private byte aByte8 = 2;

	@OriginalMember(owner = "client!FTPNODIB", name = "h", descriptor = "B")
	private byte aByte9 = -101;

	@OriginalMember(owner = "client!FTPNODIB", name = "i", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!FTPNODIB", name = "j", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!FTPNODIB", name = "k", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!FTPNODIB", name = "l", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!FTPNODIB", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!FTPNODIB", name = "<init>", descriptor = "(IIZ)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt364 = 0;
			this.anInt365 = 0;
			this.anInt366 = arg0;
			this.anInt367 = arg1;
			this.anIntArrayArray3 = new int[this.anInt366][this.anInt367];
			this.method164();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("28792, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "()V")
	public void method164() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt366; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt367; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt366 - 1 || local7 == this.anInt367 - 1) {
					this.anIntArrayArray3[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray3[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIIIBZ)V")
	public void method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt364;
			@Pc(9) int local9 = arg0 - this.anInt365;
			@Pc(14) boolean local14 = false;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method168(local4, local9, 128);
					this.method168(local4 - 1, local9, 8);
				}
				if (arg1 == 1) {
					this.method168(local4, local9, 2);
					this.method168(local4, local9 + 1, 32);
				}
				if (arg1 == 2) {
					this.method168(local4, local9, 8);
					this.method168(local4 + 1, local9, 128);
				}
				if (arg1 == 3) {
					this.method168(local4, local9, 32);
					this.method168(local4, local9 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method168(local4, local9, 1);
					this.method168(local4 - 1, local9 + 1, 16);
				}
				if (arg1 == 1) {
					this.method168(local4, local9, 4);
					this.method168(local4 + 1, local9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method168(local4, local9, 16);
					this.method168(local4 + 1, local9 - 1, 1);
				}
				if (arg1 == 3) {
					this.method168(local4, local9, 64);
					this.method168(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method168(local4, local9, 130);
					this.method168(local4 - 1, local9, 8);
					this.method168(local4, local9 + 1, 32);
				}
				if (arg1 == 1) {
					this.method168(local4, local9, 10);
					this.method168(local4, local9 + 1, 32);
					this.method168(local4 + 1, local9, 128);
				}
				if (arg1 == 2) {
					this.method168(local4, local9, 40);
					this.method168(local4 + 1, local9, 128);
					this.method168(local4, local9 - 1, 2);
				}
				if (arg1 == 3) {
					this.method168(local4, local9, 160);
					this.method168(local4, local9 - 1, 2);
					this.method168(local4 - 1, local9, 8);
				}
			}
			if (arg5) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method168(local4, local9, 65536);
						this.method168(local4 - 1, local9, 4096);
					}
					if (arg1 == 1) {
						this.method168(local4, local9, 1024);
						this.method168(local4, local9 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method168(local4, local9, 4096);
						this.method168(local4 + 1, local9, 65536);
					}
					if (arg1 == 3) {
						this.method168(local4, local9, 16384);
						this.method168(local4, local9 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method168(local4, local9, 512);
						this.method168(local4 - 1, local9 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method168(local4, local9, 2048);
						this.method168(local4 + 1, local9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method168(local4, local9, 8192);
						this.method168(local4 + 1, local9 - 1, 512);
					}
					if (arg1 == 3) {
						this.method168(local4, local9, 32768);
						this.method168(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method168(local4, local9, 66560);
						this.method168(local4 - 1, local9, 4096);
						this.method168(local4, local9 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method168(local4, local9, 5120);
						this.method168(local4, local9 + 1, 16384);
						this.method168(local4 + 1, local9, 65536);
					}
					if (arg1 == 2) {
						this.method168(local4, local9, 20480);
						this.method168(local4 + 1, local9, 65536);
						this.method168(local4, local9 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method168(local4, local9, 81920);
						this.method168(local4, local9 - 1, 1024);
						this.method168(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(469) RuntimeException local469) {
			signlink.reporterror("53275, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(ZIIIIII)V")
	public void method166(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt364;
			@Pc(18) int local18 = 14 / arg1;
			@Pc(23) int local23 = arg5 - this.anInt365;
			@Pc(31) int local31;
			if (arg6 == 1 || arg6 == 3) {
				local31 = arg2;
				arg2 = arg3;
				arg3 = local31;
			}
			for (local31 = local14; local31 < local14 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt366) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg3; local47++) {
						if (local47 >= 0 && local47 < this.anInt367) {
							this.method168(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("32403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(III)V")
	public void method167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt364;
			@Pc(19) int local19 = arg0 - this.anInt365;
			this.anIntArrayArray3[local4][local19] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("33794, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "b", descriptor = "(III)V")
	private void method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIZZII)V")
	public void method169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt364;
			@Pc(9) int local9 = arg4 - this.anInt365;
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method171(128, local4, local9, 933);
					this.method171(8, local4 - 1, local9, 933);
				}
				if (arg0 == 1) {
					this.method171(2, local4, local9, 933);
					this.method171(32, local4, local9 + 1, 933);
				}
				if (arg0 == 2) {
					this.method171(8, local4, local9, 933);
					this.method171(128, local4 + 1, local9, 933);
				}
				if (arg0 == 3) {
					this.method171(32, local4, local9, 933);
					this.method171(2, local4, local9 - 1, 933);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method171(1, local4, local9, 933);
					this.method171(16, local4 - 1, local9 + 1, 933);
				}
				if (arg0 == 1) {
					this.method171(4, local4, local9, 933);
					this.method171(64, local4 + 1, local9 + 1, 933);
				}
				if (arg0 == 2) {
					this.method171(16, local4, local9, 933);
					this.method171(1, local4 + 1, local9 - 1, 933);
				}
				if (arg0 == 3) {
					this.method171(64, local4, local9, 933);
					this.method171(4, local4 - 1, local9 - 1, 933);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method171(130, local4, local9, 933);
					this.method171(8, local4 - 1, local9, 933);
					this.method171(32, local4, local9 + 1, 933);
				}
				if (arg0 == 1) {
					this.method171(10, local4, local9, 933);
					this.method171(32, local4, local9 + 1, 933);
					this.method171(128, local4 + 1, local9, 933);
				}
				if (arg0 == 2) {
					this.method171(40, local4, local9, 933);
					this.method171(128, local4 + 1, local9, 933);
					this.method171(2, local4, local9 - 1, 933);
				}
				if (arg0 == 3) {
					this.method171(160, local4, local9, 933);
					this.method171(2, local4, local9 - 1, 933);
					this.method171(8, local4 - 1, local9, 933);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg0 == 0) {
						this.method171(65536, local4, local9, 933);
						this.method171(4096, local4 - 1, local9, 933);
					}
					if (arg0 == 1) {
						this.method171(1024, local4, local9, 933);
						this.method171(16384, local4, local9 + 1, 933);
					}
					if (arg0 == 2) {
						this.method171(4096, local4, local9, 933);
						this.method171(65536, local4 + 1, local9, 933);
					}
					if (arg0 == 3) {
						this.method171(16384, local4, local9, 933);
						this.method171(1024, local4, local9 - 1, 933);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg0 == 0) {
						this.method171(512, local4, local9, 933);
						this.method171(8192, local4 - 1, local9 + 1, 933);
					}
					if (arg0 == 1) {
						this.method171(2048, local4, local9, 933);
						this.method171(32768, local4 + 1, local9 + 1, 933);
					}
					if (arg0 == 2) {
						this.method171(8192, local4, local9, 933);
						this.method171(512, local4 + 1, local9 - 1, 933);
					}
					if (arg0 == 3) {
						this.method171(32768, local4, local9, 933);
						this.method171(2048, local4 - 1, local9 - 1, 933);
					}
				}
				if (arg1 == 2) {
					if (arg0 == 0) {
						this.method171(66560, local4, local9, 933);
						this.method171(4096, local4 - 1, local9, 933);
						this.method171(16384, local4, local9 + 1, 933);
					}
					if (arg0 == 1) {
						this.method171(5120, local4, local9, 933);
						this.method171(16384, local4, local9 + 1, 933);
						this.method171(65536, local4 + 1, local9, 933);
					}
					if (arg0 == 2) {
						this.method171(20480, local4, local9, 933);
						this.method171(65536, local4 + 1, local9, 933);
						this.method171(1024, local4, local9 - 1, 933);
					}
					if (arg0 == 3) {
						this.method171(81920, local4, local9, 933);
						this.method171(1024, local4, local9 - 1, 933);
						this.method171(4096, local4 - 1, local9, 933);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("6952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIIIBIZ)V")
	public void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt364;
			@Pc(19) int local19 = arg3 - this.anInt365;
			@Pc(38) int local38;
			if (arg0 == 1 || arg0 == 3) {
				local38 = arg1;
				arg1 = arg4;
				arg4 = local38;
			}
			for (local38 = local14; local38 < local14 + arg1; local38++) {
				if (local38 >= 0 && local38 < this.anInt366) {
					for (@Pc(54) int local54 = local19; local54 < local19 + arg4; local54++) {
						if (local54 >= 0 && local54 < this.anInt367) {
							this.method171(local3, local38, local54, 933);
						}
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("45433, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6 + ", " + arg4 + ", " + arg5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIII)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			this.anIntArrayArray3[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("42695, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "c", descriptor = "(III)V")
	public void method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt364;
			@Pc(9) int local9 = arg1 - this.anInt365;
			@Pc(13) boolean local13 = false;
			this.anIntArrayArray3[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("36463, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg0 && arg2 == arg5) {
				return true;
			}
			@Pc(22) int local22 = arg1 - this.anInt364;
			@Pc(27) int local27 = arg2 - this.anInt365;
			@Pc(32) int local32 = arg0 - this.anInt364;
			@Pc(37) int local37 = arg5 - this.anInt365;
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("46464, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 == arg0 && arg2 == arg1) {
				return true;
			}
			@Pc(18) int local18 = arg5 - this.anInt364;
			@Pc(23) int local23 = arg2 - this.anInt365;
			@Pc(28) int local28 = arg0 - this.anInt364;
			@Pc(33) int local33 = arg1 - this.anInt365;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray3[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray3[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray3[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray3[local18][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray3[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray3[local18][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray3[local18][local23] & 0x80) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray3[local18][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray3[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray3[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray3[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray3[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("67003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(12) int local12 = arg1 + arg5 - 1;
			@Pc(18) int local18 = arg0 + arg3 - 1;
			if (arg2 >= arg1 && arg2 <= local12 && arg6 >= arg0 && arg6 <= local18) {
				return true;
			} else if (arg2 == arg1 - 1 && arg6 >= arg0 && arg6 <= local18 && (this.anIntArrayArray3[arg2 - this.anInt364][arg6 - this.anInt365] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg2 == local12 + 1 && arg6 >= arg0 && arg6 <= local18 && (this.anIntArrayArray3[arg2 - this.anInt364][arg6 - this.anInt365] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg0 - 1 && arg2 >= arg1 && arg2 <= local12 && (this.anIntArrayArray3[arg2 - this.anInt364][arg6 - this.anInt365] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local18 + 1 && arg2 >= arg1 && arg2 <= local12 && (this.anIntArrayArray3[arg2 - this.anInt364][arg6 - this.anInt365] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("42625, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}

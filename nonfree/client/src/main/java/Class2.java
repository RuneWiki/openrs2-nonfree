import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BBRQYCNY")
public final class Class2 {

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "I")
	private int anInt7 = -357;

	@OriginalMember(owner = "client!BBRQYCNY", name = "b", descriptor = "B")
	private byte aByte1 = 91;

	@OriginalMember(owner = "client!BBRQYCNY", name = "c", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!BBRQYCNY", name = "d", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!BBRQYCNY", name = "e", descriptor = "I")
	private int anInt8;

	@OriginalMember(owner = "client!BBRQYCNY", name = "f", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!BBRQYCNY", name = "g", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!BBRQYCNY", name = "h", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!BBRQYCNY", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!BBRQYCNY", name = "<init>", descriptor = "(IZI)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt8 = 0;
			this.anInt9 = 0;
			this.anInt10 = arg0;
			this.anInt11 = arg2;
			this.anIntArrayArray1 = new int[this.anInt10][this.anInt11];
			this.method39();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("21694, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "()V")
	public void method39() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt11; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt10 - 1 || local7 == this.anInt11 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(IIIIZI)V")
	public void method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt8;
			@Pc(12) int local12 = arg1 - this.anInt9;
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method43(local4, local12, 128);
					this.method43(local4 - 1, local12, 8);
				}
				if (arg0 == 1) {
					this.method43(local4, local12, 2);
					this.method43(local4, local12 + 1, 32);
				}
				if (arg0 == 2) {
					this.method43(local4, local12, 8);
					this.method43(local4 + 1, local12, 128);
				}
				if (arg0 == 3) {
					this.method43(local4, local12, 32);
					this.method43(local4, local12 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method43(local4, local12, 1);
					this.method43(local4 - 1, local12 + 1, 16);
				}
				if (arg0 == 1) {
					this.method43(local4, local12, 4);
					this.method43(local4 + 1, local12 + 1, 64);
				}
				if (arg0 == 2) {
					this.method43(local4, local12, 16);
					this.method43(local4 + 1, local12 - 1, 1);
				}
				if (arg0 == 3) {
					this.method43(local4, local12, 64);
					this.method43(local4 - 1, local12 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method43(local4, local12, 130);
					this.method43(local4 - 1, local12, 8);
					this.method43(local4, local12 + 1, 32);
				}
				if (arg0 == 1) {
					this.method43(local4, local12, 10);
					this.method43(local4, local12 + 1, 32);
					this.method43(local4 + 1, local12, 128);
				}
				if (arg0 == 2) {
					this.method43(local4, local12, 40);
					this.method43(local4 + 1, local12, 128);
					this.method43(local4, local12 - 1, 2);
				}
				if (arg0 == 3) {
					this.method43(local4, local12, 160);
					this.method43(local4, local12 - 1, 2);
					this.method43(local4 - 1, local12, 8);
				}
			}
			if (arg3) {
				if (arg2 == 0) {
					if (arg0 == 0) {
						this.method43(local4, local12, 65536);
						this.method43(local4 - 1, local12, 4096);
					}
					if (arg0 == 1) {
						this.method43(local4, local12, 1024);
						this.method43(local4, local12 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method43(local4, local12, 4096);
						this.method43(local4 + 1, local12, 65536);
					}
					if (arg0 == 3) {
						this.method43(local4, local12, 16384);
						this.method43(local4, local12 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg0 == 0) {
						this.method43(local4, local12, 512);
						this.method43(local4 - 1, local12 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method43(local4, local12, 2048);
						this.method43(local4 + 1, local12 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method43(local4, local12, 8192);
						this.method43(local4 + 1, local12 - 1, 512);
					}
					if (arg0 == 3) {
						this.method43(local4, local12, 32768);
						this.method43(local4 - 1, local12 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg0 == 0) {
						this.method43(local4, local12, 66560);
						this.method43(local4 - 1, local12, 4096);
						this.method43(local4, local12 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method43(local4, local12, 5120);
						this.method43(local4, local12 + 1, 16384);
						this.method43(local4 + 1, local12, 65536);
					}
					if (arg0 == 2) {
						this.method43(local4, local12, 20480);
						this.method43(local4 + 1, local12, 65536);
						this.method43(local4, local12 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method43(local4, local12, 81920);
						this.method43(local4, local12 - 1, 1024);
						this.method43(local4 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("68150, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -357 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(IIIIIZI)V")
	public void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt8;
			@Pc(19) int local19 = arg1 - this.anInt9;
			@Pc(27) int local27;
			if (arg3 == 1 || arg3 == 3) {
				local27 = arg2;
				arg2 = arg5;
				arg5 = local27;
			}
			for (local27 = local14; local27 < local14 + arg2; local27++) {
				if (local27 >= 0 && local27 < this.anInt10) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg5; local43++) {
						if (local43 >= 0 && local43 < this.anInt11) {
							this.method43(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("63103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -47207 + ", " + arg4 + ", " + arg5 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(III)V")
	public void method42(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt8;
			@Pc(9) int local9 = arg0 - this.anInt9;
			this.anIntArrayArray1[local4][local9] |= 0x200000;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("2389, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "b", descriptor = "(III)V")
	private void method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(ZIIIIZ)V")
	public void method44(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt8;
			@Pc(9) int local9 = arg2 - this.anInt9;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method46(128, local4, local9);
					this.method46(8, local4 - 1, local9);
				}
				if (arg3 == 1) {
					this.method46(2, local4, local9);
					this.method46(32, local4, local9 + 1);
				}
				if (arg3 == 2) {
					this.method46(8, local4, local9);
					this.method46(128, local4 + 1, local9);
				}
				if (arg3 == 3) {
					this.method46(32, local4, local9);
					this.method46(2, local4, local9 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method46(1, local4, local9);
					this.method46(16, local4 - 1, local9 + 1);
				}
				if (arg3 == 1) {
					this.method46(4, local4, local9);
					this.method46(64, local4 + 1, local9 + 1);
				}
				if (arg3 == 2) {
					this.method46(16, local4, local9);
					this.method46(1, local4 + 1, local9 - 1);
				}
				if (arg3 == 3) {
					this.method46(64, local4, local9);
					this.method46(4, local4 - 1, local9 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method46(130, local4, local9);
					this.method46(8, local4 - 1, local9);
					this.method46(32, local4, local9 + 1);
				}
				if (arg3 == 1) {
					this.method46(10, local4, local9);
					this.method46(32, local4, local9 + 1);
					this.method46(128, local4 + 1, local9);
				}
				if (arg3 == 2) {
					this.method46(40, local4, local9);
					this.method46(128, local4 + 1, local9);
					this.method46(2, local4, local9 - 1);
				}
				if (arg3 == 3) {
					this.method46(160, local4, local9);
					this.method46(2, local4, local9 - 1);
					this.method46(8, local4 - 1, local9);
				}
			}
			if (arg4) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method46(65536, local4, local9);
						this.method46(4096, local4 - 1, local9);
					}
					if (arg3 == 1) {
						this.method46(1024, local4, local9);
						this.method46(16384, local4, local9 + 1);
					}
					if (arg3 == 2) {
						this.method46(4096, local4, local9);
						this.method46(65536, local4 + 1, local9);
					}
					if (arg3 == 3) {
						this.method46(16384, local4, local9);
						this.method46(1024, local4, local9 - 1);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method46(512, local4, local9);
						this.method46(8192, local4 - 1, local9 + 1);
					}
					if (arg3 == 1) {
						this.method46(2048, local4, local9);
						this.method46(32768, local4 + 1, local9 + 1);
					}
					if (arg3 == 2) {
						this.method46(8192, local4, local9);
						this.method46(512, local4 + 1, local9 - 1);
					}
					if (arg3 == 3) {
						this.method46(32768, local4, local9);
						this.method46(2048, local4 - 1, local9 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method46(66560, local4, local9);
						this.method46(4096, local4 - 1, local9);
						this.method46(16384, local4, local9 + 1);
					}
					if (arg3 == 1) {
						this.method46(5120, local4, local9);
						this.method46(16384, local4, local9 + 1);
						this.method46(65536, local4 + 1, local9);
					}
					if (arg3 == 2) {
						this.method46(20480, local4, local9);
						this.method46(65536, local4 + 1, local9);
						this.method46(1024, local4, local9 - 1);
					}
					if (arg3 == 3) {
						this.method46(81920, local4, local9);
						this.method46(1024, local4, local9 - 1);
						this.method46(4096, local4 - 1, local9);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("15393, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(ZIIIIII)V")
	public void method45(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt8;
			@Pc(18) boolean local18 = false;
			@Pc(23) int local23 = arg1 - this.anInt9;
			@Pc(31) int local31;
			if (arg3 == 1 || arg3 == 3) {
				local31 = arg2;
				arg2 = arg5;
				arg5 = local31;
			}
			for (local31 = local14; local31 < local14 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt10) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg5; local47++) {
						if (local47 >= 0 && local47 < this.anInt11) {
							this.method46(local3, local31, local47);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("97176, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(IIZI)V")
	private void method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray1[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("88350, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "c", descriptor = "(III)V")
	public void method47(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg0 - this.anInt8;
			@Pc(14) int local14 = arg1 - this.anInt9;
			this.anIntArrayArray1[local9][local14] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("30131, " + arg0 + ", " + 818 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg2 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt8;
			@Pc(17) int local17 = arg4 - this.anInt9;
			@Pc(22) int local22 = arg2 - this.anInt8;
			@Pc(27) int local27 = arg3 - this.anInt9;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
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
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(571) RuntimeException local571) {
			signlink.reporterror("4531, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 9 + ", " + arg5 + ", " + local571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(IIIIIIZ)Z")
	public boolean method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 == arg3 && arg4 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt8;
			@Pc(17) int local17 = arg4 - this.anInt9;
			@Pc(22) int local22 = arg3 - this.anInt8;
			@Pc(36) int local36 = arg1 - this.anInt9;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("49176, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BBRQYCNY", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method50(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg6 - 1;
			@Pc(11) int local11 = arg4 + arg2 - 1;
			if (arg5 >= arg1 && arg5 <= local5 && arg3 >= arg4 && arg3 <= local11) {
				return true;
			} else if (arg5 == arg1 - 1 && arg3 >= arg4 && arg3 <= local11 && (this.anIntArrayArray1[arg5 - this.anInt8][arg3 - this.anInt9] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg3 >= arg4 && arg3 <= local11 && (this.anIntArrayArray1[arg5 - this.anInt8][arg3 - this.anInt9] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg4 - 1 && arg5 >= arg1 && arg5 <= local5 && (this.anIntArrayArray1[arg5 - this.anInt8][arg3 - this.anInt9] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local11 + 1 && arg5 >= arg1 && arg5 <= local5 && (this.anIntArrayArray1[arg5 - this.anInt8][arg3 - this.anInt9] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("22690, " + arg0 + ", " + 90 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EOLCIJGV")
public final class Class12 {

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "I")
	private int anInt109 = 736;

	@OriginalMember(owner = "client!EOLCIJGV", name = "b", descriptor = "I")
	private int anInt110 = 866;

	@OriginalMember(owner = "client!EOLCIJGV", name = "c", descriptor = "I")
	private int anInt111 = 438;

	@OriginalMember(owner = "client!EOLCIJGV", name = "d", descriptor = "I")
	private int anInt112 = 7838;

	@OriginalMember(owner = "client!EOLCIJGV", name = "e", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!EOLCIJGV", name = "f", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!EOLCIJGV", name = "g", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!EOLCIJGV", name = "h", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!EOLCIJGV", name = "i", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!EOLCIJGV", name = "j", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!EOLCIJGV", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!EOLCIJGV", name = "<init>", descriptor = "(III)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt113 = 0;
			this.anInt114 = 0;
			this.anInt115 = arg1;
			this.anInt116 = arg2;
			this.anIntArrayArray3 = new int[this.anInt115][this.anInt116];
			this.method185();
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("84527, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "()V")
	public void method185() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt115; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt116; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt115 - 1 || local7 == this.anInt116 - 1) {
					this.anIntArrayArray3[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray3[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIZ)V")
	public void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt113;
			@Pc(13) int local13 = arg1 - this.anInt114;
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method189(local4, local13, 128);
					this.method189(local4 - 1, local13, 8);
				}
				if (arg0 == 1) {
					this.method189(local4, local13, 2);
					this.method189(local4, local13 + 1, 32);
				}
				if (arg0 == 2) {
					this.method189(local4, local13, 8);
					this.method189(local4 + 1, local13, 128);
				}
				if (arg0 == 3) {
					this.method189(local4, local13, 32);
					this.method189(local4, local13 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method189(local4, local13, 1);
					this.method189(local4 - 1, local13 + 1, 16);
				}
				if (arg0 == 1) {
					this.method189(local4, local13, 4);
					this.method189(local4 + 1, local13 + 1, 64);
				}
				if (arg0 == 2) {
					this.method189(local4, local13, 16);
					this.method189(local4 + 1, local13 - 1, 1);
				}
				if (arg0 == 3) {
					this.method189(local4, local13, 64);
					this.method189(local4 - 1, local13 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method189(local4, local13, 130);
					this.method189(local4 - 1, local13, 8);
					this.method189(local4, local13 + 1, 32);
				}
				if (arg0 == 1) {
					this.method189(local4, local13, 10);
					this.method189(local4, local13 + 1, 32);
					this.method189(local4 + 1, local13, 128);
				}
				if (arg0 == 2) {
					this.method189(local4, local13, 40);
					this.method189(local4 + 1, local13, 128);
					this.method189(local4, local13 - 1, 2);
				}
				if (arg0 == 3) {
					this.method189(local4, local13, 160);
					this.method189(local4, local13 - 1, 2);
					this.method189(local4 - 1, local13, 8);
				}
			}
			if (arg4) {
				if (arg2 == 0) {
					if (arg0 == 0) {
						this.method189(local4, local13, 65536);
						this.method189(local4 - 1, local13, 4096);
					}
					if (arg0 == 1) {
						this.method189(local4, local13, 1024);
						this.method189(local4, local13 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method189(local4, local13, 4096);
						this.method189(local4 + 1, local13, 65536);
					}
					if (arg0 == 3) {
						this.method189(local4, local13, 16384);
						this.method189(local4, local13 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg0 == 0) {
						this.method189(local4, local13, 512);
						this.method189(local4 - 1, local13 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method189(local4, local13, 2048);
						this.method189(local4 + 1, local13 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method189(local4, local13, 8192);
						this.method189(local4 + 1, local13 - 1, 512);
					}
					if (arg0 == 3) {
						this.method189(local4, local13, 32768);
						this.method189(local4 - 1, local13 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg0 == 0) {
						this.method189(local4, local13, 66560);
						this.method189(local4 - 1, local13, 4096);
						this.method189(local4, local13 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method189(local4, local13, 5120);
						this.method189(local4, local13 + 1, 16384);
						this.method189(local4 + 1, local13, 65536);
					}
					if (arg0 == 2) {
						this.method189(local4, local13, 20480);
						this.method189(local4 + 1, local13, 65536);
						this.method189(local4, local13 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method189(local4, local13, 81920);
						this.method189(local4, local13 - 1, 1024);
						this.method189(local4 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("88521, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IZZIIII)V")
	public void method187(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(17) int local17 = arg5 - this.anInt113;
			@Pc(22) int local22 = arg0 - this.anInt114;
			@Pc(30) int local30;
			if (arg4 == 1 || arg4 == 3) {
				local30 = arg2;
				arg2 = arg3;
				arg3 = local30;
			}
			for (local30 = local17; local30 < local17 + arg2; local30++) {
				if (local30 >= 0 && local30 < this.anInt115) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg3; local46++) {
						if (local46 >= 0 && local46 < this.anInt116) {
							this.method189(local30, local46, local3);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("22754, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IZI)V")
	public void method188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt113;
			@Pc(12) int local12 = arg0 - this.anInt114;
			this.anIntArrayArray3[local4][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("33599, " + arg0 + ", " + false + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(III)V")
	private void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIZIIZ)V")
	public void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7 = arg3 - this.anInt113;
			@Pc(12) int local12 = arg1 - this.anInt114;
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method192(128, local12, local7, this.anInt110);
					this.method192(8, local12, local7 - 1, this.anInt110);
				}
				if (arg0 == 1) {
					this.method192(2, local12, local7, this.anInt110);
					this.method192(32, local12 + 1, local7, this.anInt110);
				}
				if (arg0 == 2) {
					this.method192(8, local12, local7, this.anInt110);
					this.method192(128, local12, local7 + 1, this.anInt110);
				}
				if (arg0 == 3) {
					this.method192(32, local12, local7, this.anInt110);
					this.method192(2, local12 - 1, local7, this.anInt110);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method192(1, local12, local7, this.anInt110);
					this.method192(16, local12 + 1, local7 - 1, this.anInt110);
				}
				if (arg0 == 1) {
					this.method192(4, local12, local7, this.anInt110);
					this.method192(64, local12 + 1, local7 + 1, this.anInt110);
				}
				if (arg0 == 2) {
					this.method192(16, local12, local7, this.anInt110);
					this.method192(1, local12 - 1, local7 + 1, this.anInt110);
				}
				if (arg0 == 3) {
					this.method192(64, local12, local7, this.anInt110);
					this.method192(4, local12 - 1, local7 - 1, this.anInt110);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method192(130, local12, local7, this.anInt110);
					this.method192(8, local12, local7 - 1, this.anInt110);
					this.method192(32, local12 + 1, local7, this.anInt110);
				}
				if (arg0 == 1) {
					this.method192(10, local12, local7, this.anInt110);
					this.method192(32, local12 + 1, local7, this.anInt110);
					this.method192(128, local12, local7 + 1, this.anInt110);
				}
				if (arg0 == 2) {
					this.method192(40, local12, local7, this.anInt110);
					this.method192(128, local12, local7 + 1, this.anInt110);
					this.method192(2, local12 - 1, local7, this.anInt110);
				}
				if (arg0 == 3) {
					this.method192(160, local12, local7, this.anInt110);
					this.method192(2, local12 - 1, local7, this.anInt110);
					this.method192(8, local12, local7 - 1, this.anInt110);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg0 == 0) {
						this.method192(65536, local12, local7, this.anInt110);
						this.method192(4096, local12, local7 - 1, this.anInt110);
					}
					if (arg0 == 1) {
						this.method192(1024, local12, local7, this.anInt110);
						this.method192(16384, local12 + 1, local7, this.anInt110);
					}
					if (arg0 == 2) {
						this.method192(4096, local12, local7, this.anInt110);
						this.method192(65536, local12, local7 + 1, this.anInt110);
					}
					if (arg0 == 3) {
						this.method192(16384, local12, local7, this.anInt110);
						this.method192(1024, local12 - 1, local7, this.anInt110);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg0 == 0) {
						this.method192(512, local12, local7, this.anInt110);
						this.method192(8192, local12 + 1, local7 - 1, this.anInt110);
					}
					if (arg0 == 1) {
						this.method192(2048, local12, local7, this.anInt110);
						this.method192(32768, local12 + 1, local7 + 1, this.anInt110);
					}
					if (arg0 == 2) {
						this.method192(8192, local12, local7, this.anInt110);
						this.method192(512, local12 - 1, local7 + 1, this.anInt110);
					}
					if (arg0 == 3) {
						this.method192(32768, local12, local7, this.anInt110);
						this.method192(2048, local12 - 1, local7 - 1, this.anInt110);
					}
				}
				if (arg4 == 2) {
					if (arg0 == 0) {
						this.method192(66560, local12, local7, this.anInt110);
						this.method192(4096, local12, local7 - 1, this.anInt110);
						this.method192(16384, local12 + 1, local7, this.anInt110);
					}
					if (arg0 == 1) {
						this.method192(5120, local12, local7, this.anInt110);
						this.method192(16384, local12 + 1, local7, this.anInt110);
						this.method192(65536, local12, local7 + 1, this.anInt110);
					}
					if (arg0 == 2) {
						this.method192(20480, local12, local7, this.anInt110);
						this.method192(65536, local12, local7 + 1, this.anInt110);
						this.method192(1024, local12 - 1, local7, this.anInt110);
					}
					if (arg0 == 3) {
						this.method192(81920, local12, local7, this.anInt110);
						this.method192(1024, local12 - 1, local7, this.anInt110);
						this.method192(4096, local12, local7 - 1, this.anInt110);
						return;
					}
				}
			}
		} catch (@Pc(576) RuntimeException local576) {
			signlink.reporterror("20965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local576.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IZIIIII)V")
	public void method191(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(20) int local20 = arg0 - this.anInt113;
			@Pc(25) int local25 = arg5 - this.anInt114;
			@Pc(33) int local33;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg4;
				arg4 = arg3;
				arg3 = local33;
			}
			for (local33 = local20; local33 < local20 + arg4; local33++) {
				if (local33 >= 0 && local33 < this.anInt115) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg3; local49++) {
						if (local49 >= 0 && local49 < this.anInt116) {
							this.method192(local3, local49, local33, this.anInt110);
						}
					}
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("29132, " + arg0 + ", " + arg1 + ", " + -45320 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIII)V")
	private void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray3[arg2][arg1] &= 16777215 - arg0;
			@Pc(15) int local15 = 13 / arg3;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("2359, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "b", descriptor = "(III)V")
	public void method193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt113;
			@Pc(9) int local9 = arg1 - this.anInt114;
			this.anIntArrayArray3[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("42972, " + -495 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIIZ)Z")
	public boolean method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 == arg5 && arg1 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt113;
			@Pc(17) int local17 = arg1 - this.anInt114;
			@Pc(32) int local32 = arg5 - this.anInt113;
			@Pc(37) int local37 = arg0 - this.anInt114;
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local12 == local32 - 1 && local17 == local37) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local32 && local17 == local37 + 1) {
						return true;
					}
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local32 + 1 && local17 == local37) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local32 && local17 == local37 - 1) {
						return true;
					}
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local12 == local32 - 1 && local17 == local37) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local17 == local37) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local17 == local37) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local32 - 1 && local17 == local37) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("4934, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg2 && arg1 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt113;
			@Pc(17) int local17 = arg1 - this.anInt114;
			@Pc(22) int local22 = arg2 - this.anInt113;
			@Pc(27) int local27 = arg3 - this.anInt114;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("51675, " + arg0 + ", " + -39934 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOLCIJGV", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg4 + arg1 - 1;
			@Pc(11) int local11 = arg7 + arg5 - 1;
			@Pc(15) boolean local15 = false;
			if (arg6 >= arg4 && arg6 <= local5 && arg3 >= arg7 && arg3 <= local11) {
				return true;
			} else if (arg6 == arg4 - 1 && arg3 >= arg7 && arg3 <= local11 && (this.anIntArrayArray3[arg6 - this.anInt113][arg3 - this.anInt114] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg3 >= arg7 && arg3 <= local11 && (this.anIntArrayArray3[arg6 - this.anInt113][arg3 - this.anInt114] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg7 - 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray3[arg6 - this.anInt113][arg3 - this.anInt114] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local11 + 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray3[arg6 - this.anInt113][arg3 - this.anInt114] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("89400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FUVVWALN")
public final class Class11 {

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "I")
	private int anInt168 = 4;

	@OriginalMember(owner = "client!FUVVWALN", name = "b", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!FUVVWALN", name = "c", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!FUVVWALN", name = "d", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!FUVVWALN", name = "e", descriptor = "I")
	private int anInt169 = -23862;

	@OriginalMember(owner = "client!FUVVWALN", name = "f", descriptor = "I")
	private int anInt170 = -36;

	@OriginalMember(owner = "client!FUVVWALN", name = "g", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!FUVVWALN", name = "h", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!FUVVWALN", name = "i", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!FUVVWALN", name = "j", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!FUVVWALN", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!FUVVWALN", name = "<init>", descriptor = "(III)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt171 = 0;
			this.anInt172 = 0;
			this.anInt173 = arg0;
			@Pc(34) int local34 = 23 / arg1;
			this.anInt174 = arg2;
			this.anIntArrayArray4 = new int[this.anInt173][this.anInt174];
			this.method128();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("98097, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "()V")
	public void method128() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt173; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt174; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt173 - 1 || local7 == this.anInt174 - 1) {
					this.anIntArrayArray4[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray4[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IZIBII)V")
	public void method129(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt171;
			@Pc(13) int local13 = arg4 - this.anInt172;
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method132(local4, local13, 128);
					this.method132(local4 - 1, local13, 8);
				}
				if (arg2 == 1) {
					this.method132(local4, local13, 2);
					this.method132(local4, local13 + 1, 32);
				}
				if (arg2 == 2) {
					this.method132(local4, local13, 8);
					this.method132(local4 + 1, local13, 128);
				}
				if (arg2 == 3) {
					this.method132(local4, local13, 32);
					this.method132(local4, local13 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method132(local4, local13, 1);
					this.method132(local4 - 1, local13 + 1, 16);
				}
				if (arg2 == 1) {
					this.method132(local4, local13, 4);
					this.method132(local4 + 1, local13 + 1, 64);
				}
				if (arg2 == 2) {
					this.method132(local4, local13, 16);
					this.method132(local4 + 1, local13 - 1, 1);
				}
				if (arg2 == 3) {
					this.method132(local4, local13, 64);
					this.method132(local4 - 1, local13 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method132(local4, local13, 130);
					this.method132(local4 - 1, local13, 8);
					this.method132(local4, local13 + 1, 32);
				}
				if (arg2 == 1) {
					this.method132(local4, local13, 10);
					this.method132(local4, local13 + 1, 32);
					this.method132(local4 + 1, local13, 128);
				}
				if (arg2 == 2) {
					this.method132(local4, local13, 40);
					this.method132(local4 + 1, local13, 128);
					this.method132(local4, local13 - 1, 2);
				}
				if (arg2 == 3) {
					this.method132(local4, local13, 160);
					this.method132(local4, local13 - 1, 2);
					this.method132(local4 - 1, local13, 8);
				}
			}
			if (arg1) {
				if (arg0 == 0) {
					if (arg2 == 0) {
						this.method132(local4, local13, 65536);
						this.method132(local4 - 1, local13, 4096);
					}
					if (arg2 == 1) {
						this.method132(local4, local13, 1024);
						this.method132(local4, local13 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method132(local4, local13, 4096);
						this.method132(local4 + 1, local13, 65536);
					}
					if (arg2 == 3) {
						this.method132(local4, local13, 16384);
						this.method132(local4, local13 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg2 == 0) {
						this.method132(local4, local13, 512);
						this.method132(local4 - 1, local13 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method132(local4, local13, 2048);
						this.method132(local4 + 1, local13 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method132(local4, local13, 8192);
						this.method132(local4 + 1, local13 - 1, 512);
					}
					if (arg2 == 3) {
						this.method132(local4, local13, 32768);
						this.method132(local4 - 1, local13 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg2 == 0) {
						this.method132(local4, local13, 66560);
						this.method132(local4 - 1, local13, 4096);
						this.method132(local4, local13 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method132(local4, local13, 5120);
						this.method132(local4, local13 + 1, 16384);
						this.method132(local4 + 1, local13, 65536);
					}
					if (arg2 == 2) {
						this.method132(local4, local13, 20480);
						this.method132(local4 + 1, local13, 65536);
						this.method132(local4, local13 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method132(local4, local13, 81920);
						this.method132(local4, local13 - 1, 1024);
						this.method132(local4 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("38575, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -50 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIZIII)V")
	public void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt171;
			@Pc(19) int local19 = arg5 - this.anInt172;
			@Pc(32) int local32;
			if (arg1 == 1 || arg1 == 3) {
				local32 = arg4;
				arg4 = arg0;
				arg0 = local32;
			}
			for (local32 = local14; local32 < local14 + arg4; local32++) {
				if (local32 >= 0 && local32 < this.anInt173) {
					for (@Pc(48) int local48 = local19; local48 < local19 + arg0; local48++) {
						if (local48 >= 0 && local48 < this.anInt174) {
							this.method132(local32, local48, local3);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("91476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -433 + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIZ)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt171;
			@Pc(18) int local18 = arg1 - this.anInt172;
			this.anIntArrayArray4[local4][local18] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("5225, " + arg0 + ", " + arg1 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(III)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray4[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIIZI)V")
	public void method133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = arg1 - this.anInt171;
			@Pc(13) int local13 = arg2 - this.anInt172;
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method135(this.anInt169, local8, local13, 128);
					this.method135(this.anInt169, local8 - 1, local13, 8);
				}
				if (arg0 == 1) {
					this.method135(this.anInt169, local8, local13, 2);
					this.method135(this.anInt169, local8, local13 + 1, 32);
				}
				if (arg0 == 2) {
					this.method135(this.anInt169, local8, local13, 8);
					this.method135(this.anInt169, local8 + 1, local13, 128);
				}
				if (arg0 == 3) {
					this.method135(this.anInt169, local8, local13, 32);
					this.method135(this.anInt169, local8, local13 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method135(this.anInt169, local8, local13, 1);
					this.method135(this.anInt169, local8 - 1, local13 + 1, 16);
				}
				if (arg0 == 1) {
					this.method135(this.anInt169, local8, local13, 4);
					this.method135(this.anInt169, local8 + 1, local13 + 1, 64);
				}
				if (arg0 == 2) {
					this.method135(this.anInt169, local8, local13, 16);
					this.method135(this.anInt169, local8 + 1, local13 - 1, 1);
				}
				if (arg0 == 3) {
					this.method135(this.anInt169, local8, local13, 64);
					this.method135(this.anInt169, local8 - 1, local13 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method135(this.anInt169, local8, local13, 130);
					this.method135(this.anInt169, local8 - 1, local13, 8);
					this.method135(this.anInt169, local8, local13 + 1, 32);
				}
				if (arg0 == 1) {
					this.method135(this.anInt169, local8, local13, 10);
					this.method135(this.anInt169, local8, local13 + 1, 32);
					this.method135(this.anInt169, local8 + 1, local13, 128);
				}
				if (arg0 == 2) {
					this.method135(this.anInt169, local8, local13, 40);
					this.method135(this.anInt169, local8 + 1, local13, 128);
					this.method135(this.anInt169, local8, local13 - 1, 2);
				}
				if (arg0 == 3) {
					this.method135(this.anInt169, local8, local13, 160);
					this.method135(this.anInt169, local8, local13 - 1, 2);
					this.method135(this.anInt169, local8 - 1, local13, 8);
				}
			}
			if (arg3) {
				if (arg4 == 0) {
					if (arg0 == 0) {
						this.method135(this.anInt169, local8, local13, 65536);
						this.method135(this.anInt169, local8 - 1, local13, 4096);
					}
					if (arg0 == 1) {
						this.method135(this.anInt169, local8, local13, 1024);
						this.method135(this.anInt169, local8, local13 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method135(this.anInt169, local8, local13, 4096);
						this.method135(this.anInt169, local8 + 1, local13, 65536);
					}
					if (arg0 == 3) {
						this.method135(this.anInt169, local8, local13, 16384);
						this.method135(this.anInt169, local8, local13 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg0 == 0) {
						this.method135(this.anInt169, local8, local13, 512);
						this.method135(this.anInt169, local8 - 1, local13 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method135(this.anInt169, local8, local13, 2048);
						this.method135(this.anInt169, local8 + 1, local13 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method135(this.anInt169, local8, local13, 8192);
						this.method135(this.anInt169, local8 + 1, local13 - 1, 512);
					}
					if (arg0 == 3) {
						this.method135(this.anInt169, local8, local13, 32768);
						this.method135(this.anInt169, local8 - 1, local13 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg0 == 0) {
						this.method135(this.anInt169, local8, local13, 66560);
						this.method135(this.anInt169, local8 - 1, local13, 4096);
						this.method135(this.anInt169, local8, local13 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method135(this.anInt169, local8, local13, 5120);
						this.method135(this.anInt169, local8, local13 + 1, 16384);
						this.method135(this.anInt169, local8 + 1, local13, 65536);
					}
					if (arg0 == 2) {
						this.method135(this.anInt169, local8, local13, 20480);
						this.method135(this.anInt169, local8 + 1, local13, 65536);
						this.method135(this.anInt169, local8, local13 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method135(this.anInt169, local8, local13, 81920);
						this.method135(this.anInt169, local8, local13 - 1, 1024);
						this.method135(this.anInt169, local8 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(577) RuntimeException local577) {
			signlink.reporterror("67619, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local577.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IZIIZII)V")
	public void method134(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(6) int local6 = 256;
			if (arg1) {
				local6 = 131328;
			}
			@Pc(17) int local17 = arg0 - this.anInt171;
			@Pc(22) int local22 = arg4 - this.anInt172;
			@Pc(30) int local30;
			if (arg5 == 1 || arg5 == 3) {
				local30 = arg3;
				arg3 = arg2;
				arg2 = local30;
			}
			for (local30 = local17; local30 < local17 + arg3; local30++) {
				if (local30 >= 0 && local30 < this.anInt173) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg2; local46++) {
						if (local46 >= 0 && local46 < this.anInt174) {
							this.method135(this.anInt169, local30, local46, local6);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("87662, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIII)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray4[arg1][arg2] &= 16777215 - arg3;
			if (arg0 == -23862) {
				;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("74534, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "b", descriptor = "(III)V")
	public void method136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(15) int local15 = arg1 - this.anInt171;
			@Pc(20) int local20 = arg0 - this.anInt172;
			this.anIntArrayArray4[local15][local20] &= 0xDFFFFF;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("51213, " + -1868 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 == arg3 && arg0 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt171;
			@Pc(17) int local17 = arg0 - this.anInt172;
			@Pc(22) int local22 = arg3 - this.anInt171;
			@Pc(32) int local32 = arg1 - this.anInt172;
			if (arg5 == 0) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local32) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray4[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray4[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 && local17 == local32 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 + 1 && local17 == local32) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray4[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray4[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 && local17 == local32 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local32) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray4[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local32) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray4[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray4[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local32) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 - 1 && local17 == local32) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray4[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray4[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray4[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray4[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(565) RuntimeException local565) {
			signlink.reporterror("2978, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local565.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg4 && arg1 == arg0) {
				return true;
			}
			@Pc(19) int local19 = arg5 - this.anInt171;
			@Pc(24) int local24 = arg1 - this.anInt172;
			@Pc(29) int local29 = arg4 - this.anInt171;
			@Pc(34) int local34 = arg0 - this.anInt172;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x80) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x8) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x8) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x80) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x20) == 0) {
					return true;
				}
				if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x2) == 0) {
					return true;
				}
				if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x8) == 0) {
					return true;
				}
				if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("42972, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FUVVWALN", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg3 - 1;
			@Pc(11) int local11 = arg0 + arg2 - 1;
			if (arg5 >= arg1 && arg5 <= local5 && arg6 >= arg0 && arg6 <= local11) {
				return true;
			} else if (arg5 == arg1 - 1 && arg6 >= arg0 && arg6 <= local11 && (this.anIntArrayArray4[arg5 - this.anInt171][arg6 - this.anInt172] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg6 >= arg0 && arg6 <= local11 && (this.anIntArrayArray4[arg5 - this.anInt171][arg6 - this.anInt172] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg0 - 1 && arg5 >= arg1 && arg5 <= local5 && (this.anIntArrayArray4[arg5 - this.anInt171][arg6 - this.anInt172] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local11 + 1 && arg5 >= arg1 && arg5 <= local5 && (this.anIntArrayArray4[arg5 - this.anInt171][arg6 - this.anInt172] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("24668, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 939 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}
}
